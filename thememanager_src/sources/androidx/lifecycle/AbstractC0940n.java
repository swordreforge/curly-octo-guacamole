package androidx.lifecycle;

import androidx.arch.core.executor.C0230k;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.uv6;
import zy.y9n;
import zy.yz;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: compiled from: ComputableLiveData.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public abstract class AbstractC0940n<T> {

    /* JADX INFO: renamed from: g */
    @yz
    final Runnable f5103g;

    /* JADX INFO: renamed from: k */
    final Executor f5104k;

    /* JADX INFO: renamed from: n */
    @yz
    final Runnable f5105n;

    /* JADX INFO: renamed from: q */
    final AtomicBoolean f5106q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final LiveData<T> f51589toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final AtomicBoolean f51590zy;

    /* JADX INFO: renamed from: androidx.lifecycle.n$k */
    /* JADX INFO: compiled from: ComputableLiveData.java */
    class k extends LiveData<T> {
        k() {
        }

        @Override // androidx.lifecycle.LiveData
        protected void x2() {
            AbstractC0940n abstractC0940n = AbstractC0940n.this;
            abstractC0940n.f5104k.execute(abstractC0940n.f5105n);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.n$toq */
    /* JADX INFO: compiled from: ComputableLiveData.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        @y9n
        public void run() {
            do {
                boolean z2 = false;
                if (AbstractC0940n.this.f5106q.compareAndSet(false, true)) {
                    Object objM4461k = null;
                    boolean z3 = false;
                    while (AbstractC0940n.this.f51590zy.compareAndSet(true, false)) {
                        try {
                            objM4461k = AbstractC0940n.this.m4461k();
                            z3 = true;
                        } catch (Throwable th) {
                            AbstractC0940n.this.f5106q.set(false);
                            throw th;
                        }
                    }
                    if (z3) {
                        AbstractC0940n.this.f51589toq.n7h((T) objM4461k);
                    }
                    AbstractC0940n.this.f5106q.set(false);
                    z2 = z3;
                }
                if (!z2) {
                    return;
                }
            } while (AbstractC0940n.this.f51590zy.get());
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.n$zy */
    /* JADX INFO: compiled from: ComputableLiveData.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        @zy.oc
        public void run() {
            boolean zM4393y = AbstractC0940n.this.f51589toq.m4393y();
            if (AbstractC0940n.this.f51590zy.compareAndSet(false, true) && zM4393y) {
                AbstractC0940n abstractC0940n = AbstractC0940n.this;
                abstractC0940n.f5104k.execute(abstractC0940n.f5105n);
            }
        }
    }

    public AbstractC0940n() {
        this(C0230k.m763n());
    }

    @y9n
    /* JADX INFO: renamed from: k */
    protected abstract T m4461k();

    @zy.lvui
    public LiveData<T> toq() {
        return this.f51589toq;
    }

    public void zy() {
        C0230k.m762g().toq(this.f5103g);
    }

    public AbstractC0940n(@zy.lvui Executor executor) {
        this.f51590zy = new AtomicBoolean(true);
        this.f5106q = new AtomicBoolean(false);
        this.f5105n = new toq();
        this.f5103g = new zy();
        this.f5104k = executor;
        this.f51589toq = new k();
    }
}
