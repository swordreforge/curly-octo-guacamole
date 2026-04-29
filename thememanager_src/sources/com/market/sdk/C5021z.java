package com.market.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.market.sdk.utils.C5013p;

/* JADX INFO: renamed from: com.market.sdk.z */
/* JADX INFO: compiled from: ServiceProxy2.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5021z {
    private static final String TAG = "ServiceProxy2";
    private Context context;
    private Intent intent;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: com.market.sdk.z$k */
    /* JADX INFO: compiled from: ServiceProxy2.java */
    public abstract class k<T> {

        /* JADX INFO: renamed from: k */
        private com.market.sdk.compat.toq<T> f28275k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ServiceConnection f69071toq;

        /* JADX INFO: renamed from: com.market.sdk.z$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ServiceProxy2.java */
        class ServiceConnectionC8023k implements ServiceConnection {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ C5021z f28276k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ boolean f28278q;

            /* JADX INFO: renamed from: com.market.sdk.z$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ServiceProxy2.java */
            class AsyncTaskC8024k extends AsyncTask<Void, Void, Void> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ IBinder f28279k;

                AsyncTaskC8024k(IBinder iBinder) {
                    this.f28279k = iBinder;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Void doInBackground(Void... voidArr) {
                    ServiceConnectionC8023k.this.toq(this.f28279k);
                    return null;
                }
            }

            ServiceConnectionC8023k(C5021z c5021z, boolean z2) {
                this.f28276k = c5021z;
                this.f28278q = z2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void toq(IBinder iBinder) {
                RemoteException e2;
                Object objF7l8;
                try {
                    objF7l8 = k.this.f7l8(iBinder);
                    try {
                        if (this.f28278q) {
                            C5021z.this.context.unbindService(k.this.f69071toq);
                            k.this.f69071toq = null;
                        }
                    } catch (RemoteException e3) {
                        e2 = e3;
                        C5013p.m17463n(C5021z.TAG, "doInBackground: ", e2);
                    }
                } catch (RemoteException e4) {
                    e2 = e4;
                    objF7l8 = null;
                }
                if (k.this.f28275k != null) {
                    k.this.f28275k.set(objF7l8);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    new AsyncTaskC8024k(iBinder).execute(new Void[0]);
                } else {
                    toq(iBinder);
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
            }
        }

        public k(boolean z2) {
            this.f69071toq = new ServiceConnectionC8023k(C5021z.this, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: n */
        public void m17508n() {
            C5021z.this.context.bindService(C5021z.this.intent, this.f69071toq, 1);
        }

        protected abstract T f7l8(IBinder iBinder) throws RemoteException;

        /* JADX INFO: renamed from: g */
        public T m17510g() {
            com.market.sdk.compat.toq<T> toqVar = new com.market.sdk.compat.toq<>();
            this.f28275k = toqVar;
            return toqVar.get();
        }

        /* JADX INFO: renamed from: y */
        public void m17511y() {
            if (this.f69071toq != null) {
                C5021z.this.context.unbindService(this.f69071toq);
                this.f69071toq = null;
            }
        }
    }

    public C5021z(Context context, Intent intent) {
        this.context = context;
        this.intent = intent;
    }

    public k setTask(k kVar) {
        kVar.m17508n();
        return kVar;
    }
}
