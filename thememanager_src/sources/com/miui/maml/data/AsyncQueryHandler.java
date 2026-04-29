package com.miui.maml.data;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.miui.maml.util.MamlLog;
import miuix.core.util.f7l8;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AsyncQueryHandler extends Handler {
    private static final int EVENT_ARG_DELETE = 4;
    private static final int EVENT_ARG_INSERT = 2;
    private static final int EVENT_ARG_QUERY = 1;
    private static final int EVENT_ARG_UPDATE = 3;
    private static final String TAG = "AsyncQuery";
    private static final boolean localLOGV = false;
    private static Looper sLooper;
    private final ContentResolver mResolver;
    private Handler mWorkerThreadHandler;

    protected static final class WorkerArgs {
        public Object cookie;
        public Handler handler;
        public String orderBy;
        public String[] projection;
        public Object result;
        public String selection;
        public String[] selectionArgs;
        public Uri uri;
        public ContentValues values;

        protected WorkerArgs() {
        }
    }

    protected class WorkerHandler extends Handler {
        public WorkerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Cursor cursorQuery;
            ContentResolver contentResolver = AsyncQueryHandler.this.mResolver;
            if (contentResolver == null) {
                MamlLog.m17851e(ContentProviderBinder.TAG_NAME, "resolver == null");
                return;
            }
            MamlLog.m17851e(ContentProviderBinder.TAG_NAME, "resolver not null, go on!");
            WorkerArgs workerArgs = (WorkerArgs) message.obj;
            int i2 = message.what;
            int i3 = message.arg1;
            if (i3 == 1) {
                try {
                    cursorQuery = contentResolver.query(workerArgs.uri, workerArgs.projection, workerArgs.selection, workerArgs.selectionArgs, workerArgs.orderBy);
                    if (cursorQuery != null) {
                        cursorQuery.getCount();
                    } else {
                        MamlLog.m17854w(AsyncQueryHandler.TAG, "failed to query, cursor is null");
                    }
                } catch (Exception e2) {
                    MamlLog.m17852e(AsyncQueryHandler.TAG, "Exception thrown during handling EVENT_ARG_QUERY", e2);
                    cursorQuery = null;
                }
                AsyncQueryHandler.this.doUpdateOfCursor(cursorQuery);
                f7l8.m25531k(cursorQuery);
            } else if (i3 == 2) {
                workerArgs.result = contentResolver.insert(workerArgs.uri, workerArgs.values);
            } else if (i3 == 3) {
                workerArgs.result = Integer.valueOf(contentResolver.update(workerArgs.uri, workerArgs.values, workerArgs.selection, workerArgs.selectionArgs));
            } else if (i3 == 4) {
                workerArgs.result = Integer.valueOf(contentResolver.delete(workerArgs.uri, workerArgs.selection, workerArgs.selectionArgs));
            }
            Message messageObtainMessage = workerArgs.handler.obtainMessage(i2);
            messageObtainMessage.obj = workerArgs;
            messageObtainMessage.arg1 = message.arg1;
            messageObtainMessage.sendToTarget();
        }
    }

    public AsyncQueryHandler(ContentResolver contentResolver) {
        this.mResolver = contentResolver;
        synchronized (android.content.AsyncQueryHandler.class) {
            if (sLooper == null) {
                HandlerThread handlerThread = new HandlerThread("AsyncQueryWorker");
                handlerThread.start();
                sLooper = handlerThread.getLooper();
            }
        }
        this.mWorkerThreadHandler = createHandler(sLooper);
    }

    public final void cancelOperation(int i2) {
        this.mWorkerThreadHandler.removeMessages(i2);
    }

    protected Handler createHandler(Looper looper) {
        return new WorkerHandler(looper);
    }

    void doUpdateOfCursor(Cursor cursor) {
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        WorkerArgs workerArgs = (WorkerArgs) message.obj;
        int i2 = message.what;
        int i3 = message.arg1;
        if (i3 == 1) {
            onQueryComplete(i2, workerArgs.cookie);
            return;
        }
        if (i3 == 2) {
            onInsertComplete(i2, workerArgs.cookie, (Uri) workerArgs.result);
        } else if (i3 == 3) {
            onUpdateComplete(i2, workerArgs.cookie, ((Integer) workerArgs.result).intValue());
        } else {
            if (i3 != 4) {
                return;
            }
            onDeleteComplete(i2, workerArgs.cookie, ((Integer) workerArgs.result).intValue());
        }
    }

    protected void onDeleteComplete(int i2, Object obj, int i3) {
    }

    protected void onInsertComplete(int i2, Object obj, Uri uri) {
    }

    protected void onQueryComplete(int i2, Object obj) {
    }

    protected void onUpdateComplete(int i2, Object obj, int i3) {
    }

    public final void startDelete(int i2, Object obj, Uri uri, String str, String[] strArr) {
        Message messageObtainMessage = this.mWorkerThreadHandler.obtainMessage(i2);
        messageObtainMessage.arg1 = 4;
        WorkerArgs workerArgs = new WorkerArgs();
        workerArgs.handler = this;
        workerArgs.uri = uri;
        workerArgs.cookie = obj;
        workerArgs.selection = str;
        workerArgs.selectionArgs = strArr;
        messageObtainMessage.obj = workerArgs;
        this.mWorkerThreadHandler.sendMessage(messageObtainMessage);
    }

    public final void startInsert(int i2, Object obj, Uri uri, ContentValues contentValues) {
        Message messageObtainMessage = this.mWorkerThreadHandler.obtainMessage(i2);
        messageObtainMessage.arg1 = 2;
        WorkerArgs workerArgs = new WorkerArgs();
        workerArgs.handler = this;
        workerArgs.uri = uri;
        workerArgs.cookie = obj;
        workerArgs.values = contentValues;
        messageObtainMessage.obj = workerArgs;
        this.mWorkerThreadHandler.sendMessage(messageObtainMessage);
    }

    public void startQuery(int i2, Object obj, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Message messageObtainMessage = this.mWorkerThreadHandler.obtainMessage(i2);
        messageObtainMessage.arg1 = 1;
        WorkerArgs workerArgs = new WorkerArgs();
        workerArgs.handler = this;
        workerArgs.uri = uri;
        workerArgs.projection = strArr;
        workerArgs.selection = str;
        workerArgs.selectionArgs = strArr2;
        workerArgs.orderBy = str2;
        workerArgs.cookie = obj;
        messageObtainMessage.obj = workerArgs;
        this.mWorkerThreadHandler.sendMessage(messageObtainMessage);
    }

    public final void startUpdate(int i2, Object obj, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Message messageObtainMessage = this.mWorkerThreadHandler.obtainMessage(i2);
        messageObtainMessage.arg1 = 3;
        WorkerArgs workerArgs = new WorkerArgs();
        workerArgs.handler = this;
        workerArgs.uri = uri;
        workerArgs.cookie = obj;
        workerArgs.values = contentValues;
        workerArgs.selection = str;
        workerArgs.selectionArgs = strArr;
        messageObtainMessage.obj = workerArgs;
        this.mWorkerThreadHandler.sendMessage(messageObtainMessage);
    }

    public AsyncQueryHandler(Looper looper, ContentResolver contentResolver) {
        super(looper);
        this.mResolver = contentResolver;
        synchronized (android.content.AsyncQueryHandler.class) {
            if (sLooper == null) {
                HandlerThread handlerThread = new HandlerThread("AsyncQueryWorker");
                handlerThread.start();
                sLooper = handlerThread.getLooper();
            }
        }
        this.mWorkerThreadHandler = createHandler(sLooper);
    }
}
