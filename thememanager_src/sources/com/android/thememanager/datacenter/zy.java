package com.android.thememanager.datacenter;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import bo.toq;
import com.android.thememanager.datacenter.C1968k;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p037u.InterfaceC7678k;
import t8iq.C7672k;

/* JADX INFO: compiled from: LogCenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy<T> extends Thread {

    /* JADX INFO: renamed from: i */
    private static final String f11164i = zy.class.getSimpleName();

    /* JADX INFO: renamed from: t */
    private static final int f11165t = 2;

    /* JADX INFO: renamed from: z */
    private static final int f11166z = 1;

    /* JADX INFO: renamed from: g */
    private p037u.toq f11167g;

    /* JADX INFO: renamed from: h */
    private boolean f11168h = false;

    /* JADX INFO: renamed from: k */
    private com.android.thememanager.datacenter.toq f11169k;

    /* JADX INFO: renamed from: n */
    private bo.toq f11170n;

    /* JADX INFO: renamed from: p */
    private InterfaceC7678k f11171p;

    /* JADX INFO: renamed from: q */
    private ExecutorService f11172q;

    /* JADX INFO: renamed from: s */
    private Handler f11173s;

    /* JADX INFO: renamed from: y */
    private p037u.zy f11174y;

    /* JADX INFO: renamed from: com.android.thememanager.datacenter.zy$k */
    /* JADX INFO: compiled from: LogCenter.java */
    class C1972k implements InterfaceC7678k {
        C1972k() {
        }

        @Override // p037u.InterfaceC7678k
        /* JADX INFO: renamed from: k */
        public void mo7736k(C1968k operation) {
            Log.d(zy.f11164i, "AsyncOperationListener onOperationComplete " + operation.m7718n() + ", result = " + operation.zy());
            int i2 = C7916zy.f11181k[operation.m7718n().ordinal()];
            if (i2 != 2 && i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                zy.this.f11173s.obtainMessage(2, operation.zy()).sendToTarget();
            } else if (zy.this.f11170n.m5826g() || ((Integer) operation.zy()).intValue() >= zy.this.f11170n.toq()) {
                zy.this.f11173s.sendEmptyMessageDelayed(1, zy.this.f11170n.m5830q());
            } else {
                zy.this.f11168h = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.datacenter.zy$n */
    /* JADX INFO: compiled from: LogCenter.java */
    public interface InterfaceC1973n {
        /* JADX INFO: renamed from: k */
        void mo7737k();

        void onSuccess();
    }

    /* JADX INFO: renamed from: com.android.thememanager.datacenter.zy$q */
    /* JADX INFO: compiled from: LogCenter.java */
    public class RunnableC1974q implements Runnable {

        /* JADX INFO: renamed from: k */
        private final InterfaceC1973n f11176k;

        /* JADX INFO: renamed from: q */
        private final Collection<T> f11178q;

        public RunnableC1974q(Collection<T> collection, InterfaceC1973n listener) {
            this.f11176k = listener;
            this.f11178q = collection;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f11178q == null || r0.size() < zy.this.f11170n.zy()) {
                this.f11176k.onSuccess();
            } else if (zy.this.f11174y.mo28028k(this.f11178q)) {
                this.f11176k.onSuccess();
            } else {
                this.f11176k.mo7737k();
            }
        }
    }

    /* JADX INFO: compiled from: LogCenter.java */
    class toq extends Handler {

        /* JADX INFO: renamed from: com.android.thememanager.datacenter.zy$toq$k */
        /* JADX INFO: compiled from: LogCenter.java */
        class C1975k implements InterfaceC1973n {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Collection f11180k;

            C1975k(final Collection val$collection) {
                this.f11180k = val$collection;
            }

            @Override // com.android.thememanager.datacenter.zy.InterfaceC1973n
            /* JADX INFO: renamed from: k */
            public void mo7737k() {
                if (zy.this.f11170n.m5826g()) {
                    zy.this.f11173s.sendEmptyMessageDelayed(1, zy.this.f11170n.m5830q());
                } else {
                    zy.this.f11168h = false;
                }
            }

            @Override // com.android.thememanager.datacenter.zy.InterfaceC1973n
            public void onSuccess() {
                zy.this.f11169k.m7726k(new C1968k(C1968k.k.DeleteList, this.f11180k, zy.this.f11167g));
            }
        }

        toq(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i2 = msg.what;
            if (i2 == 1) {
                zy.this.f11168h = true;
                zy.this.kja0();
                return;
            }
            if (i2 == 2) {
                Collection collection = (Collection) msg.obj;
                if (collection != null && !collection.isEmpty()) {
                    zy.this.f11172q.execute(new RunnableC1974q(collection, new C1975k(collection)));
                } else if (zy.this.f11170n.m5826g()) {
                    zy.this.f11173s.sendEmptyMessageDelayed(1, zy.this.f11170n.m5830q());
                } else {
                    zy.this.f11168h = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.datacenter.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LogCenter.java */
    static /* synthetic */ class C7916zy {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f11181k;

        static {
            int[] iArr = new int[C1968k.k.values().length];
            f11181k = iArr;
            try {
                iArr[C1968k.k.Insert.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11181k[C1968k.k.DeleteList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11181k[C1968k.k.Delete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11181k[C1968k.k.Query.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private zy() {
        C1972k c1972k = new C1972k();
        this.f11171p = c1972k;
        this.f11169k = new com.android.thememanager.datacenter.toq(c1972k);
        this.f11172q = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0() {
        this.f11169k.m7726k(new C1968k(C1968k.k.Query, Long.valueOf(this.f11170n.toq()), this.f11167g));
    }

    public static zy qrj(bo.toq config) {
        zy zyVar = new zy();
        zyVar.f11170n = config;
        if (toq.EnumC7898toq.SQLITE != config.m5828n()) {
            Log.e(zy.class.getSimpleName(), "type except sqlite is not supported");
            return null;
        }
        zyVar.cdj(new t8iq.toq());
        zyVar.ki(new C7672k());
        return zyVar;
    }

    public void cdj(p037u.toq mConsumer) {
        this.f11167g = mConsumer;
    }

    /* JADX INFO: renamed from: h */
    public void m7733h(bo.toq mConfig) {
        this.f11170n = mConfig;
    }

    /* JADX INFO: renamed from: i */
    public boolean m7734i() {
        if (this.f11173s == null || this.f11170n.m5826g()) {
            return false;
        }
        if (!this.f11168h) {
            this.f11173s.sendEmptyMessage(1);
        }
        return true;
    }

    public void ki(p037u.zy mPoster) {
        this.f11174y = mPoster;
    }

    public p037u.toq ld6() {
        return this.f11167g;
    }

    public synchronized void n7h(T msg) {
        this.f11169k.m7726k(new C1968k(C1968k.k.Insert, msg, this.f11167g));
    }

    /* JADX INFO: renamed from: p */
    public bo.toq m7735p() {
        return this.f11170n;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Looper.prepare();
        this.f11173s = new toq(Looper.myLooper());
        if (this.f11170n.m5826g()) {
            this.f11173s.sendEmptyMessage(1);
        }
        Looper.loop();
    }

    public void t8r() {
        Handler handler = this.f11173s;
        if (handler != null) {
            handler.removeMessages(1);
            this.f11173s.removeMessages(2);
            this.f11168h = false;
        }
    }

    public p037u.zy x2() {
        return this.f11174y;
    }
}
