package com.market;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Debug;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.market.sdk.C5000t;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.market.k */
/* JADX INFO: compiled from: ServiceProxy.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4931k {
    private static final boolean DEBUG_PROXY = false;
    public static final String EXTRA_FORCE_SHUTDOWN = "ServiceProxy.FORCE_SHUTDOWN";
    private final Context mContext;
    protected final Intent mIntent;
    private Executor mServiceExecutor;
    private long mStartTime;
    private zy mTask;
    private String mName = " unnamed";
    private final ServiceConnection mConnection = new toq(this, null);
    private int mTimeout = 45;
    private boolean mTaskSet = false;
    private boolean mTaskCompleted = false;
    protected final String mTag = getClass().getSimpleName();

    /* JADX INFO: renamed from: com.market.k$k */
    /* JADX INFO: compiled from: ServiceProxy.java */
    class k implements zy {
        k() {
        }

        @Override // com.market.AbstractC4931k.zy
        public void run() throws RemoteException {
        }
    }

    /* JADX INFO: renamed from: com.market.k$toq */
    /* JADX INFO: compiled from: ServiceProxy.java */
    private class toq implements ServiceConnection {

        /* JADX INFO: renamed from: com.market.k$toq$k */
        /* JADX INFO: compiled from: ServiceProxy.java */
        class k extends AsyncTask<Void, Void, Void> {
            k() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Void doInBackground(Void... voidArr) {
                try {
                    AbstractC4931k.this.mTask.run();
                } catch (RemoteException unused) {
                }
                try {
                    AbstractC4931k.this.mContext.unbindService(AbstractC4931k.this.mConnection);
                } catch (RuntimeException e2) {
                    Log.e(AbstractC4931k.this.mTag, "RuntimeException when trying to unbind from service", e2);
                }
                AbstractC4931k.this.mTaskCompleted = true;
                synchronized (AbstractC4931k.this.mConnection) {
                    AbstractC4931k.this.mConnection.notify();
                }
                return null;
            }
        }

        private toq() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC4931k.this.onConnected(iBinder);
            new k().executeOnExecutor(AbstractC4931k.this.mServiceExecutor, new Void[0]);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            AbstractC4931k.this.onDisconnected();
        }

        /* synthetic */ toq(AbstractC4931k abstractC4931k, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.market.k$zy */
    /* JADX INFO: compiled from: ServiceProxy.java */
    public interface zy {
        void run() throws RemoteException;
    }

    public AbstractC4931k(Context context, Intent intent) {
        this.mContext = context;
        this.mIntent = intent;
        if (Debug.isDebuggerConnected()) {
            this.mTimeout <<= 2;
        }
        if (this.mServiceExecutor == null) {
            this.mServiceExecutor = C5000t.m17400k(5, 100, 5, "ServiceProxy");
        }
    }

    public int getTimeout() {
        return this.mTimeout;
    }

    public abstract void onConnected(IBinder iBinder);

    public abstract void onDisconnected();

    protected boolean setTask(zy zyVar, String str) throws IllegalStateException {
        if (this.mTaskSet) {
            throw new IllegalStateException("Cannot call setTask twice on the same ServiceProxy.");
        }
        this.mTaskSet = true;
        this.mName = str;
        this.mTask = zyVar;
        this.mStartTime = System.currentTimeMillis();
        System.currentTimeMillis();
        return this.mContext.bindService(this.mIntent, this.mConnection, 1);
    }

    public AbstractC4931k setTimeout(int i2) {
        this.mTimeout = i2;
        return this;
    }

    public boolean test() {
        try {
            return setTask(new k(), "test");
        } catch (Exception unused) {
            return false;
        }
    }

    protected void waitForCompletion() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("This cannot be called on the main thread.");
        }
        synchronized (this.mConnection) {
            System.currentTimeMillis();
            try {
                this.mConnection.wait(((long) this.mTimeout) * 1000);
            } catch (InterruptedException unused) {
            }
        }
    }
}
