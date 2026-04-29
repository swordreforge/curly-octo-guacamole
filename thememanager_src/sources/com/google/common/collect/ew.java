package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ObjectCountHashMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
class ew<K> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final long f68193ld6 = 4294967295L;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final int f68194n7h = -1;

    /* JADX INFO: renamed from: p */
    static final float f26095p = 1.0f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f68195qrj = 3;

    /* JADX INFO: renamed from: s */
    private static final int f26096s = 1073741824;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final long f68196x2 = -4294967296L;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private transient float f68197f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7732q
    transient long[] f26097g;

    /* JADX INFO: renamed from: k */
    transient Object[] f26098k;

    /* JADX INFO: renamed from: n */
    private transient int[] f26099n;

    /* JADX INFO: renamed from: q */
    transient int f26100q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    transient int[] f68198toq;

    /* JADX INFO: renamed from: y */
    private transient int f26101y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    transient int f68199zy;

    /* JADX INFO: renamed from: com.google.common.collect.ew$k */
    /* JADX INFO: compiled from: ObjectCountHashMap.java */
    class C4357k extends m58i.AbstractC4452g<K> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        final K f26102k;

        /* JADX INFO: renamed from: q */
        int f26104q;

        C4357k(int i2) {
            this.f26102k = (K) ew.this.f26098k[i2];
            this.f26104q = i2;
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public int getCount() {
            toq();
            int i2 = this.f26104q;
            if (i2 == -1) {
                return 0;
            }
            return ew.this.f68198toq[i2];
        }

        @Override // com.google.common.collect.o05.InterfaceC4482k
        public K getElement() {
            return this.f26102k;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: k */
        public int m15665k(int i2) {
            toq();
            int i3 = this.f26104q;
            if (i3 == -1) {
                ew.this.zurt(this.f26102k, i2);
                return 0;
            }
            int[] iArr = ew.this.f68198toq;
            int i4 = iArr[i3];
            iArr[i3] = i2;
            return i4;
        }

        void toq() {
            int i2 = this.f26104q;
            if (i2 == -1 || i2 >= ew.this.jk() || !C4280z.m15455k(this.f26102k, ew.this.f26098k[this.f26104q])) {
                this.f26104q = ew.this.n7h(this.f26102k);
            }
        }
    }

    ew() {
        kja0(3, 1.0f);
    }

    private static long a9(long j2, int i2) {
        return (j2 & f68196x2) | (((long) i2) & f68193ld6);
    }

    private int fu4(@NullableDecl Object obj, int i2) {
        int iQrj = qrj() & i2;
        int i3 = this.f26099n[iQrj];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (m15655s(this.f26097g[i3]) == i2 && C4280z.m15455k(obj, this.f26098k[i3])) {
                int i5 = this.f68198toq[i3];
                if (i4 == -1) {
                    this.f26099n[iQrj] = ld6(this.f26097g[i3]);
                } else {
                    long[] jArr = this.f26097g;
                    jArr[i4] = a9(jArr[i4], ld6(jArr[i3]));
                }
                cdj(i3);
                this.f68199zy--;
                this.f26100q++;
                return i5;
            }
            int iLd6 = ld6(this.f26097g[i3]);
            if (iLd6 == -1) {
                return 0;
            }
            i4 = i3;
            i3 = iLd6;
        }
    }

    private static long[] ki(int i2) {
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int ld6(long j2) {
        return (int) j2;
    }

    /* JADX INFO: renamed from: q */
    public static <K> ew<K> m15654q(int i2) {
        return new ew<>(i2);
    }

    private int qrj() {
        return this.f26099n.length - 1;
    }

    /* JADX INFO: renamed from: s */
    private static int m15655s(long j2) {
        return (int) (j2 >>> 32);
    }

    /* JADX INFO: renamed from: t */
    private void m15656t(int i2) {
        if (this.f26099n.length >= 1073741824) {
            this.f26101y = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.f68197f7l8)) + 1;
        int[] iArrT8r = t8r(i2);
        long[] jArr = this.f26097g;
        int length = iArrT8r.length - 1;
        for (int i4 = 0; i4 < this.f68199zy; i4++) {
            int iM15655s = m15655s(jArr[i4]);
            int i5 = iM15655s & length;
            int i6 = iArrT8r[i5];
            iArrT8r[i5] = i4;
            jArr[i4] = (((long) iM15655s) << 32) | (((long) i6) & f68193ld6);
        }
        this.f26101y = i3;
        this.f26099n = iArrT8r;
    }

    private static int[] t8r(int i2) {
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void wvg(int i2) {
        int length = this.f26097g.length;
        if (i2 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                o1t(iMax);
            }
        }
    }

    public static <K> ew<K> zy() {
        return new ew<>();
    }

    void cdj(int i2) {
        int iJk = jk() - 1;
        if (i2 >= iJk) {
            this.f26098k[i2] = null;
            this.f68198toq[i2] = 0;
            this.f26097g[i2] = -1;
            return;
        }
        Object[] objArr = this.f26098k;
        objArr[i2] = objArr[iJk];
        int[] iArr = this.f68198toq;
        iArr[i2] = iArr[iJk];
        objArr[iJk] = null;
        iArr[iJk] = 0;
        long[] jArr = this.f26097g;
        long j2 = jArr[iJk];
        jArr[i2] = j2;
        jArr[iJk] = -1;
        int iM15655s = m15655s(j2) & qrj();
        int[] iArr2 = this.f26099n;
        int i3 = iArr2[iM15655s];
        if (i3 == iJk) {
            iArr2[iM15655s] = i2;
            return;
        }
        while (true) {
            long j3 = this.f26097g[i3];
            int iLd6 = ld6(j3);
            if (iLd6 == iJk) {
                this.f26097g[i3] = a9(j3, i2);
                return;
            }
            i3 = iLd6;
        }
    }

    public int f7l8(@NullableDecl Object obj) {
        int iN7h = n7h(obj);
        if (iN7h == -1) {
            return 0;
        }
        return this.f68198toq[iN7h];
    }

    int fn3e(int i2, int i3) {
        return i2 - 1;
    }

    /* JADX INFO: renamed from: g */
    int mo15657g() {
        return this.f68199zy == 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: h */
    void mo15658h(int i2, @NullableDecl K k2, int i3, int i4) {
        this.f26097g[i2] = (((long) i4) << 32) | f68193ld6;
        this.f26098k[i2] = k2;
        this.f68198toq[i2] = i3;
    }

    /* JADX INFO: renamed from: i */
    int mo15659i(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f68199zy) {
            return i3;
        }
        return -1;
    }

    int jk() {
        return this.f68199zy;
    }

    /* JADX INFO: renamed from: k */
    public void mo15660k() {
        this.f26100q++;
        Arrays.fill(this.f26098k, 0, this.f68199zy, (Object) null);
        Arrays.fill(this.f68198toq, 0, this.f68199zy, 0);
        Arrays.fill(this.f26099n, -1);
        Arrays.fill(this.f26097g, -1L);
        this.f68199zy = 0;
    }

    void kja0(int i2, float f2) {
        com.google.common.base.jk.m15380n(i2 >= 0, "Initial capacity must be non-negative");
        com.google.common.base.jk.m15380n(f2 > 0.0f, "Illegal load factor");
        int iM15652k = etdu.m15652k(i2, f2);
        this.f26099n = t8r(iM15652k);
        this.f68197f7l8 = f2;
        this.f26098k = new Object[i2];
        this.f68198toq = new int[i2];
        this.f26097g = ki(i2);
        this.f26101y = Math.max(1, (int) (iM15652k * f2));
    }

    void mcp(int i2, int i3) {
        com.google.common.base.jk.mcp(i2, this.f68199zy);
        this.f68198toq[i2] = i3;
    }

    /* JADX INFO: renamed from: n */
    void m15661n(int i2) {
        if (i2 > this.f26097g.length) {
            o1t(i2);
        }
        if (i2 >= this.f26101y) {
            m15656t(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    int n7h(@NullableDecl Object obj) {
        int iM15653q = etdu.m15653q(obj);
        int iLd6 = this.f26099n[qrj() & iM15653q];
        while (iLd6 != -1) {
            long j2 = this.f26097g[iLd6];
            if (m15655s(j2) == iM15653q && C4280z.m15455k(obj, this.f26098k[iLd6])) {
                return iLd6;
            }
            iLd6 = ld6(j2);
        }
        return -1;
    }

    @CanIgnoreReturnValue
    public int ni7(@NullableDecl Object obj) {
        return fu4(obj, etdu.m15653q(obj));
    }

    void o1t(int i2) {
        this.f26098k = Arrays.copyOf(this.f26098k, i2);
        this.f68198toq = Arrays.copyOf(this.f68198toq, i2);
        long[] jArr = this.f26097g;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(jArrCopyOf, length, i2, -1L);
        }
        this.f26097g = jArrCopyOf;
    }

    /* JADX INFO: renamed from: p */
    K m15662p(int i2) {
        com.google.common.base.jk.mcp(i2, this.f68199zy);
        return (K) this.f26098k[i2];
    }

    public boolean toq(@NullableDecl Object obj) {
        return n7h(obj) != -1;
    }

    int x2(int i2) {
        com.google.common.base.jk.mcp(i2, this.f68199zy);
        return this.f68198toq[i2];
    }

    /* JADX INFO: renamed from: y */
    o05.InterfaceC4482k<K> m15663y(int i2) {
        com.google.common.base.jk.mcp(i2, this.f68199zy);
        return new C4357k(i2);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: z */
    int m15664z(int i2) {
        return fu4(this.f26098k[i2], m15655s(this.f26097g[i2]));
    }

    @CanIgnoreReturnValue
    public int zurt(@NullableDecl K k2, int i2) {
        C4524t.m15985q(i2, "count");
        long[] jArr = this.f26097g;
        Object[] objArr = this.f26098k;
        int[] iArr = this.f68198toq;
        int iM15653q = etdu.m15653q(k2);
        int iQrj = qrj() & iM15653q;
        int i3 = this.f68199zy;
        int[] iArr2 = this.f26099n;
        int i4 = iArr2[iQrj];
        if (i4 == -1) {
            iArr2[iQrj] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (m15655s(j2) == iM15653q && C4280z.m15455k(k2, objArr[i4])) {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
                int iLd6 = ld6(j2);
                if (iLd6 == -1) {
                    jArr[i4] = a9(j2, i3);
                    break;
                }
                i4 = iLd6;
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i3 + 1;
        wvg(i6);
        mo15658h(i3, k2, i2, iM15653q);
        this.f68199zy = i6;
        if (i3 >= this.f26101y) {
            m15656t(this.f26099n.length * 2);
        }
        this.f26100q++;
        return 0;
    }

    ew(ew<? extends K> ewVar) {
        kja0(ewVar.jk(), 1.0f);
        int iMo15657g = ewVar.mo15657g();
        while (iMo15657g != -1) {
            zurt(ewVar.m15662p(iMo15657g), ewVar.x2(iMo15657g));
            iMo15657g = ewVar.mo15659i(iMo15657g);
        }
    }

    ew(int i2) {
        this(i2, 1.0f);
    }

    ew(int i2, float f2) {
        kja0(i2, f2);
    }
}
