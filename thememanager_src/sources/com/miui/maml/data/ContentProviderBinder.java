package com.miui.maml.data;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.AsyncQueryHandler;
import com.miui.maml.data.VariableBinder;
import com.miui.maml.elements.ImageScreenElement;
import com.miui.maml.elements.ListScreenElement;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.util.ExecutorHelper;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.SystemProperties;
import com.miui.maml.util.TextFormatter;
import com.miui.maml.util.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import miuix.core.util.f7l8;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class ContentProviderBinder extends VariableBinder {
    private static final long CONTENT_QUERY_TASK_TIMEOUT = 20000;
    private static final boolean DBG = false;
    private static final String LOG_TAG = "ContentProviderBinder";
    public static final String TAG_NAME = "ContentProviderBinder";
    private volatile boolean mAllowReg;
    protected String[] mArgs;
    private boolean mAwareChangeWhilePause;
    private ChangeObserver mChangeObserver;
    protected String[] mColumns;
    private ContentQueryTask mContentTask;
    protected String mCountName;
    private IndexedVariable mCountVar;
    private Handler mHandler;
    private long mLastQueryTime;
    private Uri mLastUri;
    private List mList;
    private final Object mLock;
    private boolean mNeedsRequery;
    protected String mOrder;
    private boolean mSystemBootCompleted;
    private int mUpdateInterval;
    private Runnable mUpdater;
    protected TextFormatter mUriFormatter;
    protected TextFormatter mWhereFormatter;

    /* JADX INFO: renamed from: com.miui.maml.data.ContentProviderBinder$2 */
    static /* synthetic */ class C51572 {

        /* JADX INFO: renamed from: $SwitchMap$com$miui$maml$elements$ListScreenElement$ColumnInfo$Type */
        static final /* synthetic */ int[] f29467xf5c3983b;

        static {
            int[] iArr = new int[ListScreenElement.ColumnInfo.Type.values().length];
            f29467xf5c3983b = iArr;
            try {
                iArr[ListScreenElement.ColumnInfo.Type.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29467xf5c3983b[ListScreenElement.ColumnInfo.Type.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29467xf5c3983b[ListScreenElement.ColumnInfo.Type.INTEGER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29467xf5c3983b[ListScreenElement.ColumnInfo.Type.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29467xf5c3983b[ListScreenElement.ColumnInfo.Type.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29467xf5c3983b[ListScreenElement.ColumnInfo.Type.BITMAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class Builder {
        private ContentProviderBinder mBinder;

        protected Builder(ContentProviderBinder contentProviderBinder) {
            this.mBinder = contentProviderBinder;
        }

        public void addVariable(String str, String str2, String str3, int i2, Variables variables) {
            Variable variable = new Variable(str, str2, variables);
            variable.mColumn = str3;
            variable.mRow = i2;
            this.mBinder.addVariable(variable);
        }

        public Builder setArgs(String[] strArr) {
            this.mBinder.mArgs = strArr;
            return this;
        }

        public Builder setColumns(String[] strArr) {
            this.mBinder.mColumns = strArr;
            return this;
        }

        public Builder setCountName(String str) {
            ContentProviderBinder contentProviderBinder = this.mBinder;
            contentProviderBinder.mCountName = str;
            contentProviderBinder.createCountVar();
            return this;
        }

        public Builder setName(String str) {
            this.mBinder.mName = str;
            return this;
        }

        public Builder setOrder(String str) {
            this.mBinder.mOrder = str;
            return this;
        }

        public Builder setWhere(String str) {
            ContentProviderBinder contentProviderBinder = this.mBinder;
            contentProviderBinder.mWhereFormatter = new TextFormatter(contentProviderBinder.getVariables(), str);
            return this;
        }

        public Builder setWhere(String str, String str2) {
            ContentProviderBinder contentProviderBinder = this.mBinder;
            contentProviderBinder.mWhereFormatter = new TextFormatter(contentProviderBinder.getVariables(), str, str2);
            return this;
        }
    }

    public static class ChangeObserver extends ContentObserver {
        private WeakReference<ContentProviderBinder> mBinderRef;

        public ChangeObserver(ContentProviderBinder contentProviderBinder) {
            super(contentProviderBinder.mHandler);
            this.mBinderRef = new WeakReference<>(contentProviderBinder);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            ContentProviderBinder contentProviderBinder = this.mBinderRef.get();
            if (contentProviderBinder != null) {
                contentProviderBinder.onContentChanged();
            } else {
                MamlLog.m17854w("ContentProviderBinder", "ChangeObserver: content not changed, maybe reference recycled.");
            }
        }
    }

    private static class ContentQueryTask extends AsyncTask<String, String, Boolean> {
        private final WeakReference<ContentProviderBinder> mBinder;
        private final WeakReference<ContentResolver> mResolver;
        private final AsyncQueryHandler.WorkerArgs mWorkArgs;

        public ContentQueryTask(ContentProviderBinder contentProviderBinder, ContentResolver contentResolver, AsyncQueryHandler.WorkerArgs workerArgs) {
            this.mResolver = new WeakReference<>(contentResolver);
            this.mBinder = new WeakReference<>(contentProviderBinder);
            this.mWorkArgs = workerArgs;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(String... strArr) {
            AsyncQueryHandler.WorkerArgs workerArgs;
            ContentResolver contentResolver = this.mResolver.get();
            ContentProviderBinder contentProviderBinder = this.mBinder.get();
            if (contentResolver == null || contentProviderBinder == null || (workerArgs = this.mWorkArgs) == null) {
                MamlLog.m17854w("ContentProviderBinder", "ContentQueryTask: resolver or binder is null");
                return Boolean.FALSE;
            }
            FutureTask futureTask = new FutureTask(new WorkerTask(contentProviderBinder, contentResolver, workerArgs));
            ExecutorHelper.getLocalTaskExecutor().execute(futureTask);
            try {
                futureTask.get(20000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                MamlLog.m17851e("ContentProviderBinder", "WorkerTask interrupted");
            } catch (ExecutionException e2) {
                MamlLog.m17852e("ContentProviderBinder", "WorkerTask execute exception, maybe timeout", e2);
            } catch (TimeoutException e3) {
                MamlLog.m17852e("ContentProviderBinder", "WorkerTask execute error, maybe timeout, uri = " + this.mWorkArgs.uri, e3);
                futureTask.cancel(true);
            }
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
            ContentProviderBinder contentProviderBinder = this.mBinder.get();
            if (contentProviderBinder == null) {
                MamlLog.m17851e("ContentProviderBinder", "ContentQueryTask onPost: binder is null");
            } else {
                contentProviderBinder.onQueryComplete();
            }
        }
    }

    private static class List {
        private ListScreenElement mList;
        private int mMaxCount;
        private String mName;
        private ScreenElementRoot mRoot;

        public List(Element element, ScreenElementRoot screenElementRoot) {
            this.mName = element.getAttribute("name");
            this.mMaxCount = Utils.getAttrAsInt(element, InterfaceC1925p.mk, Integer.MAX_VALUE);
            this.mRoot = screenElementRoot;
        }

        public void fill(Cursor cursor) {
            if (cursor == null) {
                return;
            }
            if (this.mList == null) {
                ScreenElement screenElementFindElement = this.mRoot.findElement(this.mName);
                if (screenElementFindElement instanceof ListScreenElement) {
                    this.mList = (ListScreenElement) screenElementFindElement;
                }
                if (this.mList == null) {
                    MamlLog.m17851e("ContentProviderBinder", "fail to find list: " + this.mName);
                    return;
                }
            }
            this.mList.removeAllItems();
            ArrayList<ListScreenElement.ColumnInfo> columnsInfo = this.mList.getColumnsInfo();
            int size = columnsInfo.size();
            int[] iArr = new int[size];
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    iArr[i2] = cursor.getColumnIndexOrThrow(columnsInfo.get(i2).mVarName);
                } catch (IllegalArgumentException e2) {
                    MamlLog.m17851e("ContentProviderBinder", "illegal column:" + columnsInfo.get(i2).mVarName + " " + e2.toString());
                    return;
                }
            }
            cursor.moveToFirst();
            int count = cursor.getCount();
            int i3 = this.mMaxCount;
            if (count > i3) {
                count = i3;
            }
            for (int i4 = 0; i4 < count; i4++) {
                for (int i5 = 0; i5 < size; i5++) {
                    objArr[i5] = null;
                    ListScreenElement.ColumnInfo columnInfo = columnsInfo.get(i5);
                    int i6 = iArr[i5];
                    if (!cursor.isNull(i6)) {
                        int[] iArr2 = C51572.f29467xf5c3983b;
                        int i7 = iArr2[columnInfo.mType.ordinal()];
                        if (i7 == 5) {
                            objArr[i5] = cursor.getString(i6);
                        } else if (i7 != 6) {
                            int i8 = iArr2[columnInfo.mType.ordinal()];
                            if (i8 == 1) {
                                objArr[i5] = Double.valueOf(cursor.getDouble(i6));
                            } else if (i8 == 2) {
                                objArr[i5] = Float.valueOf(cursor.getFloat(i6));
                            } else if (i8 == 3) {
                                objArr[i5] = Integer.valueOf(cursor.getInt(i6));
                            } else if (i8 == 4) {
                                objArr[i5] = Long.valueOf(cursor.getLong(i6));
                            }
                        } else {
                            byte[] blob = cursor.getBlob(i6);
                            if (blob != null) {
                                objArr[i5] = BitmapFactory.decodeByteArray(blob, 0, blob.length);
                            }
                        }
                    }
                }
                this.mList.addItem(objArr);
                cursor.moveToNext();
            }
        }
    }

    public interface QueryCompleteListener {
        void onQueryCompleted(String str);
    }

    private static class Variable extends VariableBinder.Variable {
        public static final int BLOB_BITMAP = 1001;
        public boolean mBlocked;
        public String mColumn;
        private ImageScreenElement mImageVar;
        private boolean mNoImageElement;
        public int mRow;

        public Variable(String str, String str2, Variables variables) {
            super(str, str2, variables);
        }

        public ImageScreenElement getImageElement(ScreenElementRoot screenElementRoot) {
            if (this.mImageVar == null && !this.mNoImageElement) {
                ImageScreenElement imageScreenElement = (ImageScreenElement) screenElementRoot.findElement(this.mName);
                this.mImageVar = imageScreenElement;
                this.mNoImageElement = imageScreenElement == null;
            }
            return this.mImageVar;
        }

        @Override // com.miui.maml.data.VariableBinder.TypedValue
        protected int parseType(String str) {
            int type = super.parseType(str);
            if ("blob.bitmap".equalsIgnoreCase(this.mTypeStr)) {
                return 1001;
            }
            this.mNoImageElement = true;
            return type;
        }

        public void setNull(ScreenElementRoot screenElementRoot) {
            if (getImageElement(screenElementRoot) != null) {
                getImageElement(screenElementRoot).setBitmap(null);
            } else {
                set((Object) null);
            }
        }

        public Variable(Element element, Variables variables) {
            super(element, variables);
            this.mColumn = element.getAttribute("column");
            this.mRow = Utils.getAttrAsInt(element, "row", 0);
        }
    }

    private static class WorkerTask implements Callable<Boolean> {
        private final WeakReference<ContentProviderBinder> mBinder;
        private final WeakReference<ContentResolver> mResolver;
        private final AsyncQueryHandler.WorkerArgs mWorkArgs;

        public WorkerTask(ContentProviderBinder contentProviderBinder, ContentResolver contentResolver, AsyncQueryHandler.WorkerArgs workerArgs) {
            this.mResolver = new WeakReference<>(contentResolver);
            this.mBinder = new WeakReference<>(contentProviderBinder);
            this.mWorkArgs = workerArgs;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() throws Exception {
            Cursor cursorQuery;
            ContentResolver contentResolver = this.mResolver.get();
            ContentProviderBinder contentProviderBinder = this.mBinder.get();
            if (contentResolver == null || contentProviderBinder == null) {
                MamlLog.m17854w("ContentProviderBinder", "WorkerTask: resolver or binder is null");
                return Boolean.FALSE;
            }
            MamlLog.m17853i("ContentProviderBinder", "resolver not null, go on!");
            try {
                AsyncQueryHandler.WorkerArgs workerArgs = this.mWorkArgs;
                cursorQuery = contentResolver.query(workerArgs.uri, workerArgs.projection, workerArgs.selection, workerArgs.selectionArgs, workerArgs.orderBy);
                if (cursorQuery != null) {
                    cursorQuery.getCount();
                } else {
                    MamlLog.m17854w("ContentProviderBinder", "failed to query, cursor is null");
                }
            } catch (Exception e2) {
                MamlLog.m17852e("ContentProviderBinder", "Exception thrown during handling EVENT_ARG_QUERY", e2);
                cursorQuery = null;
            }
            if (!contentProviderBinder.mFinished) {
                contentProviderBinder.updateVariables(cursorQuery);
            }
            f7l8.m25531k(cursorQuery);
            return Boolean.TRUE;
        }
    }

    public ContentProviderBinder(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mLock = new Object();
        this.mAllowReg = true;
        this.mUpdateInterval = -1;
        this.mNeedsRequery = true;
        this.mHandler = screenElementRoot.getContext().getHandler();
        this.mChangeObserver = new ChangeObserver(this);
        if (element != null) {
            load(element);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkUpdate() {
        if (this.mUpdateInterval <= 0) {
            return;
        }
        this.mHandler.removeCallbacks(this.mUpdater);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.mLastQueryTime;
        if (jCurrentTimeMillis >= this.mUpdateInterval * 1000) {
            startQuery();
            jCurrentTimeMillis = 0;
        }
        this.mHandler.postDelayed(this.mUpdater, ((long) (this.mUpdateInterval * 1000)) - jCurrentTimeMillis);
    }

    private void load(Element element) {
        Variables variables = getVariables();
        this.mUriFormatter = new TextFormatter(variables, element.getAttribute("uri"), element.getAttribute("uriFormat"), element.getAttribute("uriParas"), Expression.build(variables, element.getAttribute("uriExp")), Expression.build(variables, element.getAttribute("uriFormatExp")));
        String attribute = element.getAttribute("columns");
        this.mColumns = TextUtils.isEmpty(attribute) ? null : attribute.split(",");
        this.mWhereFormatter = new TextFormatter(variables, element.getAttribute("where"), element.getAttribute("whereFormat"), element.getAttribute("whereParas"), Expression.build(variables, element.getAttribute("whereExp")), Expression.build(variables, element.getAttribute("whereFormatExp")));
        String attribute2 = element.getAttribute("args");
        this.mArgs = TextUtils.isEmpty(attribute2) ? null : attribute2.split(",");
        String attribute3 = element.getAttribute("order");
        if (TextUtils.isEmpty(attribute3)) {
            attribute3 = null;
        }
        this.mOrder = attribute3;
        String attribute4 = element.getAttribute("countName");
        String str = TextUtils.isEmpty(attribute4) ? null : attribute4;
        this.mCountName = str;
        if (str != null) {
            this.mCountVar = new IndexedVariable(str, variables, true);
        }
        int attrAsInt = Utils.getAttrAsInt(element, "updateInterval", -1);
        this.mUpdateInterval = attrAsInt;
        if (attrAsInt > 0) {
            this.mUpdater = new Runnable() { // from class: com.miui.maml.data.ContentProviderBinder.1
                @Override // java.lang.Runnable
                public void run() {
                    ContentProviderBinder.this.checkUpdate();
                }
            };
        }
        loadVariables(element);
        Element child = Utils.getChild(element, ListScreenElement.TAG_NAME);
        if (child != null) {
            try {
                this.mList = new List(child, this.mRoot);
            } catch (IllegalArgumentException unused) {
                MamlLog.m17851e("ContentProviderBinder", "invalid List");
            }
        }
        this.mAwareChangeWhilePause = Boolean.parseBoolean(element.getAttribute("vigilant"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onQueryComplete() {
        onUpdateComplete();
    }

    private void registerObserver(Uri uri, boolean z2) {
        ContentResolver contentResolver = getContext().mContext.getContentResolver();
        contentResolver.unregisterContentObserver(this.mChangeObserver);
        if (z2 && this.mAllowReg) {
            synchronized (this.mLock) {
                if (this.mAllowReg) {
                    try {
                        contentResolver.registerContentObserver(uri, true, this.mChangeObserver);
                    } catch (IllegalArgumentException e2) {
                        MamlLog.m17851e("ContentProviderBinder", e2.toString() + "  uri:" + uri);
                    } catch (SecurityException e3) {
                        MamlLog.m17851e("ContentProviderBinder", e3.toString() + "  uri:" + uri);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVariables(Cursor cursor) {
        int count = cursor == null ? 0 : cursor.getCount();
        IndexedVariable indexedVariable = this.mCountVar;
        if (indexedVariable != null) {
            indexedVariable.set(count);
        }
        List list = this.mList;
        if (list != null) {
            list.fill(cursor);
        }
        if (cursor == null || count == 0) {
            Iterator<VariableBinder.Variable> it = this.mVariables.iterator();
            while (it.hasNext()) {
                ((Variable) it.next()).setNull(this.mRoot);
            }
            return;
        }
        for (VariableBinder.Variable variable : this.mVariables) {
            Variable variable2 = (Variable) variable;
            if (!variable2.mBlocked) {
                double d2 = 0.0d;
                if (cursor.moveToPosition(variable2.mRow)) {
                    try {
                        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(variable2.mColumn);
                        if (cursor.isNull(columnIndexOrThrow)) {
                            variable2.setNull(this.mRoot);
                        } else {
                            int i2 = variable.mType;
                            if (i2 == 2) {
                                variable.set(cursor.getString(columnIndexOrThrow));
                            } else if (i2 == 1001 || i2 == 7) {
                                byte[] blob = cursor.getBlob(columnIndexOrThrow);
                                Bitmap bitmapDecodeByteArray = blob != null ? BitmapFactory.decodeByteArray(blob, 0, blob.length) : null;
                                if (variable.mType == 7) {
                                    variable.set(bitmapDecodeByteArray);
                                } else {
                                    ImageScreenElement imageElement = variable2.getImageElement(this.mRoot);
                                    if (imageElement != null) {
                                        imageElement.setBitmap(bitmapDecodeByteArray);
                                    }
                                }
                            } else if (i2 == 8) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(Double.valueOf(cursor.getDouble(columnIndexOrThrow)));
                                } while (cursor.moveToNext());
                                variable.set(arrayList.toArray());
                            } else if (i2 != 9) {
                                if (i2 == 3) {
                                    d2 = cursor.getInt(columnIndexOrThrow);
                                } else if (i2 == 4) {
                                    d2 = cursor.getLong(columnIndexOrThrow);
                                } else if (i2 == 5) {
                                    d2 = cursor.getFloat(columnIndexOrThrow);
                                } else if (i2 != 6) {
                                    MamlLog.m17854w("ContentProviderBinder", "invalide type" + variable.mTypeStr);
                                } else {
                                    d2 = cursor.getDouble(columnIndexOrThrow);
                                }
                                variable.set(d2);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                do {
                                    arrayList2.add(cursor.getString(columnIndexOrThrow));
                                } while (cursor.moveToNext());
                                variable.set(arrayList2.toArray());
                            }
                        }
                    } catch (NumberFormatException e2) {
                        MamlLog.m17854w("ContentProviderBinder", "failed to get value from cursor " + e2);
                    } catch (IllegalArgumentException unused) {
                        MamlLog.m17851e("ContentProviderBinder", "column does not exist: " + variable2.mColumn);
                    } catch (Exception e3) {
                        MamlLog.m17851e("ContentProviderBinder", e3.toString());
                    }
                }
            }
        }
    }

    public void createCountVar() {
        String str = this.mCountName;
        if (str == null) {
            this.mCountVar = null;
        } else {
            this.mCountVar = new IndexedVariable(str, getContext().mVariables, true);
        }
    }

    @Override // com.miui.maml.data.VariableBinder
    public void finish() {
        synchronized (this.mLock) {
            this.mAllowReg = false;
        }
        this.mLastUri = null;
        registerObserver(null, false);
        this.mHandler.removeCallbacks(this.mUpdater);
        ContentQueryTask contentQueryTask = this.mContentTask;
        if (contentQueryTask != null) {
            contentQueryTask.cancel(true);
        }
        setBlockedColumns(null);
        super.finish();
    }

    public final String getUriText() {
        return this.mUriFormatter.getText();
    }

    public void onContentChanged() {
        if (this.mFinished) {
            return;
        }
        if (!this.mPaused || this.mAwareChangeWhilePause) {
            startQuery();
        } else {
            this.mNeedsRequery = true;
        }
    }

    @Override // com.miui.maml.data.VariableBinder
    public void pause() {
        super.pause();
        this.mHandler.removeCallbacks(this.mUpdater);
    }

    @Override // com.miui.maml.data.VariableBinder
    public void refresh() {
        super.refresh();
        startQuery();
    }

    @Override // com.miui.maml.data.VariableBinder
    public void resume() {
        super.resume();
        if (this.mNeedsRequery) {
            startQuery();
        } else {
            checkUpdate();
        }
    }

    public final void setBlockedColumns(String[] strArr) {
        HashSet hashSet;
        if (strArr != null) {
            hashSet = new HashSet();
            for (String str : strArr) {
                hashSet.add(str);
            }
        } else {
            hashSet = null;
        }
        Iterator<VariableBinder.Variable> it = this.mVariables.iterator();
        while (it.hasNext()) {
            Variable variable = (Variable) it.next();
            variable.mBlocked = hashSet != null ? hashSet.contains(variable.mColumn) : false;
        }
    }

    @Override // com.miui.maml.data.VariableBinder
    public void startQuery() {
        MamlLog.m17853i("ContentProviderBinder", "startQuery mFinished:" + this.mFinished);
        if (this.mFinished) {
            return;
        }
        String uriText = getUriText();
        if (uriText == null) {
            MamlLog.m17851e("ContentProviderBinder", "start query: uri null");
            return;
        }
        if (!this.mSystemBootCompleted) {
            boolean zEquals = "1".equals(SystemProperties.get("sys.boot_completed"));
            this.mSystemBootCompleted = zEquals;
            if (!zEquals) {
                MamlLog.m17854w("ContentProviderBinder", "start query: mSystemBootCompleted false");
                return;
            }
        }
        this.mNeedsRequery = false;
        ContentQueryTask contentQueryTask = this.mContentTask;
        if (contentQueryTask != null) {
            contentQueryTask.cancel(true);
        }
        Uri uri = Uri.parse(uriText);
        if (uri == null) {
            MamlLog.m17851e("ContentProviderBinder", "start query: parse uri null");
            return;
        }
        if (this.mUpdateInterval == -1 && !uri.equals(this.mLastUri)) {
            registerObserver(uri, true);
            this.mLastUri = uri;
        }
        String text = this.mWhereFormatter.getText();
        AsyncQueryHandler.WorkerArgs workerArgs = new AsyncQueryHandler.WorkerArgs();
        workerArgs.uri = uri;
        workerArgs.projection = this.mColumns;
        workerArgs.selection = text;
        workerArgs.selectionArgs = this.mArgs;
        workerArgs.orderBy = this.mOrder;
        ContentQueryTask contentQueryTask2 = new ContentQueryTask(this, getContext().mContext.getContentResolver(), workerArgs);
        this.mContentTask = contentQueryTask2;
        contentQueryTask2.executeOnExecutor(ExecutorHelper.getLocalTaskExecutor(), new String[0]);
        this.mLastQueryTime = System.currentTimeMillis();
        checkUpdate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.miui.maml.data.VariableBinder
    public Variable onLoadVariable(Element element) {
        return new Variable(element, getContext().mVariables);
    }

    public ContentProviderBinder(ScreenElementRoot screenElementRoot) {
        this(null, screenElementRoot);
    }
}
