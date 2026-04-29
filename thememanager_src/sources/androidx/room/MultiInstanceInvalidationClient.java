package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationCallback;
import androidx.room.IMultiInstanceInvalidationService;
import androidx.room.t8r;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final Executor f52331f7l8;

    /* JADX INFO: renamed from: g */
    @zy.dd
    IMultiInstanceInvalidationService f6129g;

    /* JADX INFO: renamed from: k */
    @zy.dd
    Context f6130k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    final Runnable f52332ld6;

    /* JADX INFO: renamed from: n */
    final t8r.zy f6131n;

    /* JADX INFO: renamed from: p */
    final ServiceConnection f6132p;

    /* JADX INFO: renamed from: q */
    final t8r f6133q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final Runnable f52333qrj;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final String f52334toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    final Runnable f52335x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f52336zy;

    /* JADX INFO: renamed from: y */
    final IMultiInstanceInvalidationCallback f6135y = new IMultiInstanceInvalidationCallback.Stub() { // from class: androidx.room.MultiInstanceInvalidationClient.1

        /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$1$k */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ String[] f6136k;

            k(String[] strArr) {
                this.f6136k = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                MultiInstanceInvalidationClient.this.f6133q.m5209y(this.f6136k);
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public void onInvalidation(String[] strArr) {
            MultiInstanceInvalidationClient.this.f52331f7l8.execute(new k(strArr));
        }
    };

    /* JADX INFO: renamed from: s */
    final AtomicBoolean f6134s = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$k */
    class ServiceConnectionC1120k implements ServiceConnection {
        ServiceConnectionC1120k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MultiInstanceInvalidationClient.this.f6129g = IMultiInstanceInvalidationService.Stub.asInterface(iBinder);
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f52331f7l8.execute(multiInstanceInvalidationClient.f52332ld6);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f52331f7l8.execute(multiInstanceInvalidationClient.f52335x2);
            MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient2.f6129g = null;
            multiInstanceInvalidationClient2.f6130k = null;
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$n */
    class C1121n extends t8r.zy {
        C1121n(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.t8r.zy
        /* JADX INFO: renamed from: k */
        boolean mo5141k() {
            return true;
        }

        @Override // androidx.room.t8r.zy
        public void toq(@zy.lvui Set<String> set) {
            if (MultiInstanceInvalidationClient.this.f6134s.get()) {
                return;
            }
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                multiInstanceInvalidationClient.f6129g.broadcastInvalidation(multiInstanceInvalidationClient.f52336zy, (String[]) set.toArray(new String[0]));
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot broadcast invalidation", e2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.MultiInstanceInvalidationClient$q */
    class RunnableC1122q implements Runnable {
        RunnableC1122q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f6133q.ld6(multiInstanceInvalidationClient.f6131n);
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient2.f6129g;
                if (iMultiInstanceInvalidationService != null) {
                    iMultiInstanceInvalidationService.unregisterCallback(multiInstanceInvalidationClient2.f6135y, multiInstanceInvalidationClient2.f52336zy);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
            }
            MultiInstanceInvalidationClient multiInstanceInvalidationClient3 = MultiInstanceInvalidationClient.this;
            Context context = multiInstanceInvalidationClient3.f6130k;
            if (context != null) {
                context.unbindService(multiInstanceInvalidationClient3.f6132p);
                MultiInstanceInvalidationClient.this.f6130k = null;
            }
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.f6129g;
                if (iMultiInstanceInvalidationService != null) {
                    multiInstanceInvalidationClient.f52336zy = iMultiInstanceInvalidationService.registerCallback(multiInstanceInvalidationClient.f6135y, multiInstanceInvalidationClient.f52334toq);
                    MultiInstanceInvalidationClient multiInstanceInvalidationClient2 = MultiInstanceInvalidationClient.this;
                    multiInstanceInvalidationClient2.f6133q.m5204k(multiInstanceInvalidationClient2.f6131n);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MultiInstanceInvalidationClient multiInstanceInvalidationClient = MultiInstanceInvalidationClient.this;
            multiInstanceInvalidationClient.f6133q.ld6(multiInstanceInvalidationClient.f6131n);
        }
    }

    MultiInstanceInvalidationClient(Context context, String str, t8r t8rVar, Executor executor) {
        ServiceConnectionC1120k serviceConnectionC1120k = new ServiceConnectionC1120k();
        this.f6132p = serviceConnectionC1120k;
        this.f52332ld6 = new toq();
        this.f52335x2 = new zy();
        this.f52333qrj = new RunnableC1122q();
        this.f6130k = context.getApplicationContext();
        this.f52334toq = str;
        this.f6133q = t8rVar;
        this.f52331f7l8 = executor;
        this.f6131n = new C1121n(t8rVar.f52416toq);
        this.f6130k.bindService(new Intent(this.f6130k, (Class<?>) MultiInstanceInvalidationService.class), serviceConnectionC1120k, 1);
    }

    /* JADX INFO: renamed from: k */
    void m5140k() {
        if (this.f6134s.compareAndSet(false, true)) {
            this.f52331f7l8.execute(this.f52333qrj);
        }
    }
}
