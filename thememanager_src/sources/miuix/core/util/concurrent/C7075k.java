package miuix.core.util.concurrent;

import java.util.concurrent.atomic.AtomicInteger;
import miuix.core.util.concurrent.toq;

/* JADX INFO: renamed from: miuix.core.util.concurrent.k */
/* JADX INFO: compiled from: ConcurrentRingQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7075k<T> implements miuix.core.util.concurrent.toq<T> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private volatile toq<T> f87335f7l8;

    /* JADX INFO: renamed from: k */
    private int f39852k;

    /* JADX INFO: renamed from: n */
    private volatile toq<T> f39853n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f87336toq;

    /* JADX INFO: renamed from: y */
    private volatile int f39855y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f87337zy;

    /* JADX INFO: renamed from: q */
    private final AtomicInteger f39854q = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    private final AtomicInteger f39851g = new AtomicInteger(0);

    /* JADX INFO: renamed from: miuix.core.util.concurrent.k$toq */
    /* JADX INFO: compiled from: ConcurrentRingQueue.java */
    private static class toq<T> {

        /* JADX INFO: renamed from: k */
        T f39856k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        toq<T> f87338toq;

        private toq() {
        }
    }

    public C7075k(int i2, boolean z2, boolean z3) {
        this.f39852k = i2;
        this.f87336toq = z2;
        this.f87337zy = z3;
        int i3 = 0;
        this.f39853n = new toq<>();
        this.f87335f7l8 = this.f39853n;
        toq<T> toqVar = this.f39853n;
        while (i3 < i2) {
            toq<T> toqVar2 = new toq<>();
            toqVar.f87338toq = toqVar2;
            i3++;
            toqVar = toqVar2;
        }
        toqVar.f87338toq = this.f39853n;
    }

    @Override // miuix.core.util.concurrent.toq
    public int clear() {
        while (true) {
            if (this.f39854q.get() == 0 && this.f39854q.compareAndSet(0, -1)) {
                break;
            }
            Thread.yield();
        }
        toq<T> toqVar = this.f39853n;
        int i2 = 0;
        while (toqVar != this.f87335f7l8) {
            toqVar.f39856k = null;
            i2++;
            toqVar = toqVar.f87338toq;
        }
        this.f39853n = toqVar;
        this.f39854q.set(0);
        return i2;
    }

    @Override // miuix.core.util.concurrent.toq
    public T get() {
        while (true) {
            if (this.f39854q.get() == 0 && this.f39854q.compareAndSet(0, -1)) {
                break;
            }
            Thread.yield();
        }
        toq<T> toqVar = this.f39853n;
        toq<T> toqVar2 = this.f87335f7l8;
        T t2 = null;
        while (t2 == null && toqVar != toqVar2) {
            t2 = toqVar.f39856k;
            toqVar.f39856k = null;
            toqVar = toqVar.f87338toq;
            toqVar2 = this.f87335f7l8;
        }
        if (t2 != null) {
            this.f39853n = toqVar;
        }
        this.f39854q.set(0);
        return t2;
    }

    @Override // miuix.core.util.concurrent.toq
    public boolean isEmpty() {
        return this.f87335f7l8 == this.f39853n;
    }

    @Override // miuix.core.util.concurrent.toq
    /* JADX INFO: renamed from: k */
    public int mo25526k() {
        int i2 = this.f39855y;
        int i3 = this.f39852k;
        return i2 > 0 ? i3 + i2 : i3;
    }

    @Override // miuix.core.util.concurrent.toq
    public boolean put(T t2) {
        if (t2 == null) {
            return false;
        }
        while (true) {
            if (this.f39851g.get() == 0 && this.f39851g.compareAndSet(0, -1)) {
                break;
            }
            Thread.yield();
        }
        toq<T> toqVar = this.f39853n;
        toq<T> toqVar2 = this.f87335f7l8;
        int i2 = this.f39855y;
        toq<T> toqVar3 = toqVar2.f87338toq;
        boolean z2 = true;
        if (toqVar3 != toqVar) {
            toqVar2.f39856k = t2;
            toq<T> toqVar4 = toqVar3.f87338toq;
            if (toqVar4 != toqVar && this.f87337zy && i2 > 0) {
                toqVar2.f87338toq = toqVar4;
                this.f39855y = i2 - 1;
            }
            this.f87335f7l8 = toqVar2.f87338toq;
        } else if (this.f87336toq || i2 < 0) {
            toq<T> toqVar5 = new toq<>();
            toqVar2.f87338toq = toqVar5;
            toqVar5.f87338toq = toqVar;
            toqVar2.f39856k = t2;
            this.f39855y = i2 + 1;
            this.f87335f7l8 = toqVar2.f87338toq;
        } else {
            z2 = false;
        }
        this.f39851g.set(0);
        return z2;
    }

    /* JADX INFO: renamed from: q */
    public void m25527q(int i2) {
        if (this.f87336toq || i2 <= 0) {
            return;
        }
        while (true) {
            if (this.f39851g.get() == 0 && this.f39851g.compareAndSet(0, -1)) {
                this.f39855y = -i2;
                this.f39852k += i2;
                this.f39851g.set(0);
                return;
            }
            Thread.yield();
        }
    }

    @Override // miuix.core.util.concurrent.toq
    public boolean remove(T t2) {
        boolean z2;
        if (t2 == null) {
            return false;
        }
        while (true) {
            if (this.f39854q.get() == 0 && this.f39854q.compareAndSet(0, -1)) {
                break;
            }
            Thread.yield();
        }
        toq<T> toqVar = this.f39853n;
        while (true) {
            if (toqVar == this.f87335f7l8) {
                z2 = false;
                break;
            }
            if (t2.equals(toqVar.f39856k)) {
                toqVar.f39856k = null;
                z2 = true;
                break;
            }
            toqVar = toqVar.f87338toq;
        }
        this.f39854q.set(0);
        return z2;
    }

    @Override // miuix.core.util.concurrent.toq
    public int toq(toq.InterfaceC7076k<T> interfaceC7076k) {
        if (interfaceC7076k == null) {
            return 0;
        }
        while (true) {
            if (this.f39854q.get() == 0 && this.f39854q.compareAndSet(0, -1)) {
                try {
                    break;
                } finally {
                    this.f39854q.set(0);
                }
            }
            Thread.yield();
        }
        int i2 = 0;
        for (toq<T> toqVar = this.f39853n; toqVar != this.f87335f7l8; toqVar = toqVar.f87338toq) {
            if (interfaceC7076k.apply(toqVar.f39856k)) {
                toqVar.f39856k = null;
                i2++;
            }
        }
        return i2;
    }

    public void zy(int i2) {
        if (!this.f87337zy || i2 <= 0) {
            return;
        }
        while (true) {
            if (this.f39851g.get() == 0 && this.f39851g.compareAndSet(0, -1)) {
                this.f39852k -= i2;
                this.f39855y = i2;
                this.f39851g.set(0);
                return;
            }
            Thread.yield();
        }
    }
}
