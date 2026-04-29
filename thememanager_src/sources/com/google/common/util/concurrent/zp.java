package com.google.common.util.concurrent;

import com.google.common.collect.e5;
import com.google.common.collect.nsb;
import com.google.common.collect.se;
import com.google.common.math.C4723q;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Striped.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public abstract class zp<L> {

    /* JADX INFO: renamed from: k */
    private static final int f27609k = 1024;

    /* JADX INFO: renamed from: q */
    private static final int f27610q = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final com.google.common.base.lvui<ReadWriteLock> f68686toq = new C4860n();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final com.google.common.base.lvui<ReadWriteLock> f68687zy = new C4858g();

    /* JADX INFO: compiled from: Striped.java */
    private static class f7l8<L> extends ld6<L> {

        /* JADX INFO: renamed from: g */
        private final Object[] f27611g;

        /* synthetic */ f7l8(int i2, com.google.common.base.lvui lvuiVar, C4859k c4859k) {
            this(i2, lvuiVar);
        }

        @Override // com.google.common.util.concurrent.zp
        public L f7l8(int i2) {
            return (L) this.f27611g[i2];
        }

        @Override // com.google.common.util.concurrent.zp
        /* JADX INFO: renamed from: h */
        public int mo17060h() {
            return this.f27611g.length;
        }

        private f7l8(int i2, com.google.common.base.lvui<L> lvuiVar) {
            super(i2);
            int i3 = 0;
            com.google.common.base.jk.m15380n(i2 <= 1073741824, "Stripes must be <= 2^30)");
            this.f27611g = new Object[this.f27613n + 1];
            while (true) {
                Object[] objArr = this.f27611g;
                if (i3 >= objArr.length) {
                    return;
                }
                objArr[i3] = lvuiVar.get();
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$g */
    /* JADX INFO: compiled from: Striped.java */
    static class C4858g implements com.google.common.base.lvui<ReadWriteLock> {
        C4858g() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ReadWriteLock get() {
            return new kja0();
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$k */
    /* JADX INFO: compiled from: Striped.java */
    static class C4859k implements com.google.common.base.lvui<Lock> {
        C4859k() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Lock get() {
            return new C4863s();
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    private static final class kja0 implements ReadWriteLock {

        /* JADX INFO: renamed from: k */
        private final ReadWriteLock f27612k = new ReentrantReadWriteLock();

        kja0() {
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new n7h(this.f27612k.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new n7h(this.f27612k.writeLock(), this);
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    private static abstract class ld6<L> extends zp<L> {

        /* JADX INFO: renamed from: n */
        final int f27613n;

        ld6(int i2) {
            super(null);
            com.google.common.base.jk.m15380n(i2 > 0, "Stripes must be positive");
            this.f27613n = i2 > 1073741824 ? -1 : zp.m17057q(i2) - 1;
        }

        @Override // com.google.common.util.concurrent.zp
        /* JADX INFO: renamed from: g */
        public final L mo17059g(Object obj) {
            return f7l8(mo17061y(obj));
        }

        @Override // com.google.common.util.concurrent.zp
        /* JADX INFO: renamed from: y */
        final int mo17061y(Object obj) {
            return zp.cdj(obj.hashCode()) & this.f27613n;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$n */
    /* JADX INFO: compiled from: Striped.java */
    static class C4860n implements com.google.common.base.lvui<ReadWriteLock> {
        C4860n() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ReadWriteLock get() {
            return new ReentrantReadWriteLock();
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    private static final class n7h extends lvui {

        /* JADX INFO: renamed from: k */
        private final Lock f27614k;

        /* JADX INFO: renamed from: q */
        private final kja0 f27615q;

        n7h(Lock lock, kja0 kja0Var) {
            this.f27614k = lock;
            this.f27615q = kja0Var;
        }

        @Override // com.google.common.util.concurrent.lvui
        /* JADX INFO: renamed from: k */
        Lock mo16977k() {
            return this.f27614k;
        }

        @Override // com.google.common.util.concurrent.lvui, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new qrj(this.f27614k.newCondition(), this.f27615q);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$p */
    /* JADX INFO: compiled from: Striped.java */
    private static class C4861p extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        C4861p(int i2) {
            super(i2, false);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$q */
    /* JADX INFO: compiled from: Striped.java */
    static class C4862q implements com.google.common.base.lvui<Semaphore> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f27616k;

        C4862q(int i2) {
            this.f27616k = i2;
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Semaphore get() {
            return new Semaphore(this.f27616k, false);
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    private static final class qrj extends jp0y {

        /* JADX INFO: renamed from: k */
        private final Condition f27617k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final kja0 f68688toq;

        qrj(Condition condition, kja0 kja0Var) {
            this.f27617k = condition;
            this.f68688toq = kja0Var;
        }

        @Override // com.google.common.util.concurrent.jp0y
        /* JADX INFO: renamed from: k */
        Condition mo16966k() {
            return this.f27617k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$s */
    /* JADX INFO: compiled from: Striped.java */
    private static class C4863s extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        C4863s() {
            super(false);
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    static class toq implements com.google.common.base.lvui<Lock> {
        toq() {
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Lock get() {
            return new ReentrantLock(false);
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    @InterfaceC7732q
    static class x2<L> extends ld6<L> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final com.google.common.base.lvui<L> f68689f7l8;

        /* JADX INFO: renamed from: g */
        final AtomicReferenceArray<C4864k<? extends L>> f27618g;

        /* JADX INFO: renamed from: s */
        final ReferenceQueue<L> f27619s;

        /* JADX INFO: renamed from: y */
        final int f27620y;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$x2$k */
        /* JADX INFO: compiled from: Striped.java */
        private static final class C4864k<L> extends WeakReference<L> {

            /* JADX INFO: renamed from: k */
            final int f27621k;

            C4864k(L l2, int i2, ReferenceQueue<L> referenceQueue) {
                super(l2, referenceQueue);
                this.f27621k = i2;
            }
        }

        x2(int i2, com.google.common.base.lvui<L> lvuiVar) {
            super(i2);
            this.f27619s = new ReferenceQueue<>();
            int i3 = this.f27613n;
            int i4 = i3 == -1 ? Integer.MAX_VALUE : i3 + 1;
            this.f27620y = i4;
            this.f27618g = new AtomicReferenceArray<>(i4);
            this.f68689f7l8 = lvuiVar;
        }

        private void ki() {
            while (true) {
                Reference<? extends L> referencePoll = this.f27619s.poll();
                if (referencePoll == null) {
                    return;
                }
                C4864k c4864k = (C4864k) referencePoll;
                C4849x.m17025k(this.f27618g, c4864k.f27621k, c4864k, null);
            }
        }

        @Override // com.google.common.util.concurrent.zp
        public L f7l8(int i2) {
            if (this.f27620y != Integer.MAX_VALUE) {
                com.google.common.base.jk.mcp(i2, mo17060h());
            }
            C4864k<? extends L> c4864k = this.f27618g.get(i2);
            L l2 = c4864k == null ? null : c4864k.get();
            if (l2 != null) {
                return l2;
            }
            L l3 = this.f68689f7l8.get();
            C4864k c4864k2 = new C4864k(l3, i2, this.f27619s);
            while (!C4849x.m17025k(this.f27618g, i2, c4864k, c4864k2)) {
                c4864k = this.f27618g.get(i2);
                L l4 = c4864k == null ? null : c4864k.get();
                if (l4 != null) {
                    return l4;
                }
            }
            ki();
            return l3;
        }

        @Override // com.google.common.util.concurrent.zp
        /* JADX INFO: renamed from: h */
        public int mo17060h() {
            return this.f27620y;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.zp$y */
    /* JADX INFO: compiled from: Striped.java */
    @InterfaceC7732q
    static class C4865y<L> extends ld6<L> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final com.google.common.base.lvui<L> f68690f7l8;

        /* JADX INFO: renamed from: g */
        final ConcurrentMap<Integer, L> f27622g;

        /* JADX INFO: renamed from: y */
        final int f27623y;

        C4865y(int i2, com.google.common.base.lvui<L> lvuiVar) {
            super(i2);
            int i3 = this.f27613n;
            this.f27623y = i3 == -1 ? Integer.MAX_VALUE : i3 + 1;
            this.f68690f7l8 = lvuiVar;
            this.f27622g = new e5().qrj().m15642s();
        }

        @Override // com.google.common.util.concurrent.zp
        public L f7l8(int i2) {
            if (this.f27623y != Integer.MAX_VALUE) {
                com.google.common.base.jk.mcp(i2, mo17060h());
            }
            L l2 = this.f27622g.get(Integer.valueOf(i2));
            if (l2 != null) {
                return l2;
            }
            L l3 = this.f68690f7l8.get();
            return (L) com.google.common.base.fu4.m15351k(this.f27622g.putIfAbsent(Integer.valueOf(i2), l3), l3);
        }

        @Override // com.google.common.util.concurrent.zp
        /* JADX INFO: renamed from: h */
        public int mo17060h() {
            return this.f27623y;
        }
    }

    /* JADX INFO: compiled from: Striped.java */
    static class zy implements com.google.common.base.lvui<Semaphore> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f27624k;

        zy(int i2) {
            this.f27624k = i2;
        }

        @Override // com.google.common.base.lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Semaphore get() {
            return new C4861p(this.f27624k);
        }
    }

    /* synthetic */ zp(C4859k c4859k) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int cdj(int i2) {
        int i3 = i2 ^ ((i2 >>> 20) ^ (i2 >>> 12));
        return (i3 >>> 4) ^ ((i3 >>> 7) ^ i3);
    }

    public static zp<Semaphore> kja0(int i2, int i3) {
        return m17055n(i2, new zy(i3));
    }

    public static zp<ReadWriteLock> ld6(int i2) {
        return m17058s(i2, f68687zy);
    }

    /* JADX INFO: renamed from: n */
    static <L> zp<L> m17055n(int i2, com.google.common.base.lvui<L> lvuiVar) {
        return new f7l8(i2, lvuiVar, null);
    }

    public static zp<ReadWriteLock> n7h(int i2) {
        return m17055n(i2, f68686toq);
    }

    /* JADX INFO: renamed from: p */
    public static zp<Lock> m17056p(int i2) {
        return m17058s(i2, new toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static int m17057q(int i2) {
        return 1 << C4723q.m16542h(i2, RoundingMode.CEILING);
    }

    public static zp<Lock> qrj(int i2) {
        return m17055n(i2, new C4859k());
    }

    /* JADX INFO: renamed from: s */
    private static <L> zp<L> m17058s(int i2, com.google.common.base.lvui<L> lvuiVar) {
        return i2 < 1024 ? new x2(i2, lvuiVar) : new C4865y(i2, lvuiVar);
    }

    public static zp<Semaphore> x2(int i2, int i3) {
        return m17058s(i2, new C4862q(i3));
    }

    public abstract L f7l8(int i2);

    /* JADX INFO: renamed from: g */
    public abstract L mo17059g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo17060h();

    /* JADX INFO: renamed from: y */
    abstract int mo17061y(Object obj);

    public Iterable<L> zy(Iterable<?> iterable) {
        Object[] objArrNcyb = nsb.ncyb(iterable, Object.class);
        if (objArrNcyb.length == 0) {
            return se.of();
        }
        int[] iArr = new int[objArrNcyb.length];
        for (int i2 = 0; i2 < objArrNcyb.length; i2++) {
            iArr[i2] = mo17061y(objArrNcyb[i2]);
        }
        Arrays.sort(iArr);
        int i3 = iArr[0];
        objArrNcyb[0] = f7l8(i3);
        for (int i4 = 1; i4 < objArrNcyb.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3) {
                objArrNcyb[i4] = objArrNcyb[i4 - 1];
            } else {
                objArrNcyb[i4] = f7l8(i5);
                i3 = i5;
            }
        }
        return Collections.unmodifiableList(Arrays.asList(objArrNcyb));
    }

    private zp() {
    }
}
