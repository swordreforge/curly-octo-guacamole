package androidx.core.provider;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import zy.o1t;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.provider.p */
/* JADX INFO: compiled from: SelfDestructiveThread.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0602p {

    /* JADX INFO: renamed from: p */
    private static final int f3747p = 0;

    /* JADX INFO: renamed from: s */
    private static final int f3748s = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f50558f7l8;

    /* JADX INFO: renamed from: g */
    private final int f3749g;

    /* JADX INFO: renamed from: k */
    private final Object f3750k = new Object();

    /* JADX INFO: renamed from: n */
    private Handler.Callback f3751n = new k();

    /* JADX INFO: renamed from: q */
    @o1t("mLock")
    private int f3752q = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @o1t("mLock")
    private HandlerThread f50559toq;

    /* JADX INFO: renamed from: y */
    private final String f3753y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @o1t("mLock")
    private Handler f50560zy;

    /* JADX INFO: renamed from: androidx.core.provider.p$k */
    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    class k implements Handler.Callback {
        k() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                C0602p.this.zy();
                return true;
            }
            if (i2 != 1) {
                return true;
            }
            C0602p.this.m2808q((Runnable) message.obj);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.p$q */
    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    public interface q<T> {
        /* JADX INFO: renamed from: k */
        void m2809k(T t2);
    }

    /* JADX INFO: renamed from: androidx.core.provider.p$toq */
    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Callable f3756k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ q f3757n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Handler f3758q;

        /* JADX INFO: renamed from: androidx.core.provider.p$toq$k */
        /* JADX INFO: compiled from: SelfDestructiveThread.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Object f3759k;

            k(Object obj) {
                this.f3759k = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                toq.this.f3757n.m2809k(this.f3759k);
            }
        }

        toq(Callable callable, Handler handler, q qVar) {
            this.f3756k = callable;
            this.f3758q = handler;
            this.f3757n = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f3756k.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f3758q.post(new k(objCall));
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.p$zy */
    /* JADX INFO: compiled from: SelfDestructiveThread.java */
    class zy implements Runnable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ AtomicBoolean f3761g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AtomicReference f3762k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ReentrantLock f3763n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Callable f3764q;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Condition f3766y;

        zy(AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f3762k = atomicReference;
            this.f3764q = callable;
            this.f3763n = reentrantLock;
            this.f3761g = atomicBoolean;
            this.f3766y = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f3762k.set(this.f3764q.call());
            } catch (Exception unused) {
            }
            this.f3763n.lock();
            try {
                this.f3761g.set(false);
                this.f3766y.signal();
            } finally {
                this.f3763n.unlock();
            }
        }
    }

    public C0602p(String str, int i2, int i3) {
        this.f3753y = str;
        this.f50558f7l8 = i2;
        this.f3749g = i3;
    }

    /* JADX INFO: renamed from: n */
    private void m2805n(Runnable runnable) {
        synchronized (this.f3750k) {
            if (this.f50559toq == null) {
                HandlerThread handlerThread = new HandlerThread(this.f3753y, this.f50558f7l8);
                this.f50559toq = handlerThread;
                handlerThread.start();
                this.f50560zy = new Handler(this.f50559toq.getLooper(), this.f3751n);
                this.f3752q++;
            }
            this.f50560zy.removeMessages(0);
            Handler handler = this.f50560zy;
            handler.sendMessage(handler.obtainMessage(1, runnable));
        }
    }

    public <T> T f7l8(Callable<T> callable, int i2) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        m2805n(new zy(atomicReference, callable, reentrantLock, atomicBoolean, conditionNewCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i2);
            do {
                try {
                    nanos = conditionNewCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: g */
    public <T> void m2806g(Callable<T> callable, q<T> qVar) {
        m2805n(new toq(callable, androidx.core.provider.toq.m2812k(), qVar));
    }

    @yz
    /* JADX INFO: renamed from: k */
    public int m2807k() {
        int i2;
        synchronized (this.f3750k) {
            i2 = this.f3752q;
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    void m2808q(Runnable runnable) {
        runnable.run();
        synchronized (this.f3750k) {
            this.f50560zy.removeMessages(0);
            Handler handler = this.f50560zy;
            handler.sendMessageDelayed(handler.obtainMessage(0), this.f3749g);
        }
    }

    @yz
    public boolean toq() {
        boolean z2;
        synchronized (this.f3750k) {
            z2 = this.f50559toq != null;
        }
        return z2;
    }

    void zy() {
        synchronized (this.f3750k) {
            if (this.f50560zy.hasMessages(1)) {
                return;
            }
            this.f50559toq.quit();
            this.f50559toq = null;
            this.f50560zy = null;
        }
    }
}
