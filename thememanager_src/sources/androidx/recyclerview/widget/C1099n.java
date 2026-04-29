package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.C1111r;
import androidx.recyclerview.widget.lvui;
import zy.ek5k;
import zy.y9n;

/* JADX INFO: renamed from: androidx.recyclerview.widget.n */
/* JADX INFO: compiled from: AsyncListUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C1099n<T> {

    /* JADX INFO: renamed from: i */
    static final boolean f5963i = false;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    static final String f52207t8r = "AsyncListUtil";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final lvui.toq<T> f52208cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final lvui.InterfaceC1098k<T> f52209f7l8;

    /* JADX INFO: renamed from: g */
    final lvui.toq<T> f5964g;

    /* JADX INFO: renamed from: k */
    final Class<T> f5966k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final lvui.InterfaceC1098k<T> f52210ki;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    boolean f52212ld6;

    /* JADX INFO: renamed from: n */
    final C1111r<T> f5967n;

    /* JADX INFO: renamed from: q */
    final q f5969q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final int f52215toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final zy<T> f52217zy;

    /* JADX INFO: renamed from: y */
    final int[] f5971y = new int[2];

    /* JADX INFO: renamed from: s */
    final int[] f5970s = new int[2];

    /* JADX INFO: renamed from: p */
    final int[] f5968p = new int[2];

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f52216x2 = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    int f52214qrj = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    int f52213n7h = 0;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    int f52211kja0 = 0;

    /* JADX INFO: renamed from: h */
    final SparseIntArray f5965h = new SparseIntArray();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$k */
    /* JADX INFO: compiled from: AsyncListUtil.java */
    class k implements lvui.toq<T> {
        k() {
        }

        /* JADX INFO: renamed from: n */
        private void m5051n() {
            for (int i2 = 0; i2 < C1099n.this.f5967n.m5107g(); i2++) {
                C1099n c1099n = C1099n.this;
                c1099n.f52209f7l8.mo5044q(c1099n.f5967n.zy(i2));
            }
            C1099n.this.f5967n.toq();
        }

        /* JADX INFO: renamed from: q */
        private boolean m5052q(int i2) {
            return i2 == C1099n.this.f52211kja0;
        }

        @Override // androidx.recyclerview.widget.lvui.toq
        /* JADX INFO: renamed from: k */
        public void mo5045k(int i2, int i3) {
            if (m5052q(i2)) {
                C1111r.k<T> kVarM5109n = C1099n.this.f5967n.m5109n(i3);
                if (kVarM5109n != null) {
                    C1099n.this.f52209f7l8.mo5044q(kVarM5109n);
                    return;
                }
                Log.e(C1099n.f52207t8r, "tile not found @" + i3);
            }
        }

        @Override // androidx.recyclerview.widget.lvui.toq
        public void toq(int i2, C1111r.k<T> kVar) {
            if (!m5052q(i2)) {
                C1099n.this.f52209f7l8.mo5044q(kVar);
                return;
            }
            C1111r.k<T> kVarM5108k = C1099n.this.f5967n.m5108k(kVar);
            if (kVarM5108k != null) {
                Log.e(C1099n.f52207t8r, "duplicate tile @" + kVarM5108k.f52294toq);
                C1099n.this.f52209f7l8.mo5044q(kVarM5108k);
            }
            int i3 = kVar.f52294toq + kVar.f52295zy;
            int i4 = 0;
            while (i4 < C1099n.this.f5965h.size()) {
                int iKeyAt = C1099n.this.f5965h.keyAt(i4);
                if (kVar.f52294toq > iKeyAt || iKeyAt >= i3) {
                    i4++;
                } else {
                    C1099n.this.f5965h.removeAt(i4);
                    C1099n.this.f5969q.m5054q(iKeyAt);
                }
            }
        }

        @Override // androidx.recyclerview.widget.lvui.toq
        public void zy(int i2, int i3) {
            if (m5052q(i2)) {
                C1099n c1099n = C1099n.this;
                c1099n.f52214qrj = i3;
                c1099n.f5969q.zy();
                C1099n c1099n2 = C1099n.this;
                c1099n2.f52213n7h = c1099n2.f52211kja0;
                m5051n();
                C1099n c1099n3 = C1099n.this;
                c1099n3.f52212ld6 = false;
                c1099n3.f7l8();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$q */
    /* JADX INFO: compiled from: AsyncListUtil.java */
    public static abstract class q {

        /* JADX INFO: renamed from: k */
        public static final int f5973k = 0;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f52218toq = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f52219zy = 2;

        @ek5k
        /* JADX INFO: renamed from: k */
        public void m5053k(@zy.lvui int[] iArr, @zy.lvui int[] iArr2, int i2) {
            int i3 = iArr[1];
            int i4 = iArr[0];
            int i5 = (i3 - i4) + 1;
            int i6 = i5 / 2;
            iArr2[0] = i4 - (i2 == 1 ? i5 : i6);
            if (i2 != 2) {
                i5 = i6;
            }
            iArr2[1] = i3 + i5;
        }

        @ek5k
        /* JADX INFO: renamed from: q */
        public abstract void m5054q(int i2);

        @ek5k
        public abstract void toq(@zy.lvui int[] iArr);

        @ek5k
        public abstract void zy();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$toq */
    /* JADX INFO: compiled from: AsyncListUtil.java */
    class toq implements lvui.InterfaceC1098k<T> {

        /* JADX INFO: renamed from: g */
        private int f5974g;

        /* JADX INFO: renamed from: k */
        private C1111r.k<T> f5975k;

        /* JADX INFO: renamed from: n */
        private int f5976n;

        /* JADX INFO: renamed from: q */
        private int f5977q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final SparseBooleanArray f52221toq = new SparseBooleanArray();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f52222zy;

        toq() {
        }

        private void f7l8(int i2) {
            int qVar = C1099n.this.f52217zy.toq();
            while (this.f52221toq.size() >= qVar) {
                int iKeyAt = this.f52221toq.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f52221toq;
                int iKeyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i3 = this.f5976n - iKeyAt;
                int i4 = iKeyAt2 - this.f5974g;
                if (i3 > 0 && (i3 >= i4 || i2 == 2)) {
                    ld6(iKeyAt);
                } else {
                    if (i4 <= 0) {
                        return;
                    }
                    if (i3 >= i4 && i2 != 1) {
                        return;
                    } else {
                        ld6(iKeyAt2);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        private void m5055g(C1111r.k<T> kVar) {
            this.f52221toq.put(kVar.f52294toq, true);
            C1099n.this.f5964g.toq(this.f52222zy, kVar);
        }

        private void ld6(int i2) {
            this.f52221toq.delete(i2);
            C1099n.this.f5964g.mo5045k(this.f52222zy, i2);
        }

        /* JADX INFO: renamed from: n */
        private C1111r.k<T> m5056n() {
            C1111r.k<T> kVar = this.f5975k;
            if (kVar != null) {
                this.f5975k = kVar.f6093q;
                return kVar;
            }
            C1099n c1099n = C1099n.this;
            return new C1111r.k<>(c1099n.f5966k, c1099n.f52215toq);
        }

        /* JADX INFO: renamed from: p */
        private void m5057p(String str, Object... objArr) {
            Log.d(C1099n.f52207t8r, "[BKGR] " + String.format(str, objArr));
        }

        /* JADX INFO: renamed from: s */
        private boolean m5058s(int i2) {
            return this.f52221toq.get(i2);
        }

        private void x2(int i2, int i3, int i4, boolean z2) {
            int i5 = i2;
            while (i5 <= i3) {
                C1099n.this.f52209f7l8.toq(z2 ? (i3 + i2) - i5 : i5, i4);
                i5 += C1099n.this.f52215toq;
            }
        }

        /* JADX INFO: renamed from: y */
        private int m5059y(int i2) {
            return i2 - (i2 % C1099n.this.f52215toq);
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        /* JADX INFO: renamed from: k */
        public void mo5043k(int i2, int i3, int i4, int i5, int i6) {
            if (i2 > i3) {
                return;
            }
            int iM5059y = m5059y(i2);
            int iM5059y2 = m5059y(i3);
            this.f5976n = m5059y(i4);
            int iM5059y3 = m5059y(i5);
            this.f5974g = iM5059y3;
            if (i6 == 1) {
                x2(this.f5976n, iM5059y2, i6, true);
                x2(iM5059y2 + C1099n.this.f52215toq, this.f5974g, i6, false);
            } else {
                x2(iM5059y, iM5059y3, i6, false);
                x2(this.f5976n, iM5059y - C1099n.this.f52215toq, i6, true);
            }
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        /* JADX INFO: renamed from: q */
        public void mo5044q(C1111r.k<T> kVar) {
            C1099n.this.f52217zy.zy(kVar.f6092k, kVar.f52295zy);
            kVar.f6093q = this.f5975k;
            this.f5975k = kVar;
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        public void toq(int i2, int i3) {
            if (m5058s(i2)) {
                return;
            }
            C1111r.k<T> kVarM5056n = m5056n();
            kVarM5056n.f52294toq = i2;
            int iMin = Math.min(C1099n.this.f52215toq, this.f5977q - i2);
            kVarM5056n.f52295zy = iMin;
            C1099n.this.f52217zy.m5060k(kVarM5056n.f6092k, kVarM5056n.f52294toq, iMin);
            f7l8(i3);
            m5055g(kVarM5056n);
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        public void zy(int i2) {
            this.f52222zy = i2;
            this.f52221toq.clear();
            int iM5061q = C1099n.this.f52217zy.m5061q();
            this.f5977q = iM5061q;
            C1099n.this.f5964g.zy(this.f52222zy, iM5061q);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.n$zy */
    /* JADX INFO: compiled from: AsyncListUtil.java */
    public static abstract class zy<T> {
        @y9n
        /* JADX INFO: renamed from: k */
        public abstract void m5060k(@zy.lvui T[] tArr, int i2, int i3);

        @y9n
        /* JADX INFO: renamed from: q */
        public abstract int m5061q();

        @y9n
        public int toq() {
            return 10;
        }

        @y9n
        public void zy(@zy.lvui T[] tArr, int i2) {
        }
    }

    public C1099n(@zy.lvui Class<T> cls, int i2, @zy.lvui zy<T> zyVar, @zy.lvui q qVar) {
        k kVar = new k();
        this.f52208cdj = kVar;
        toq toqVar = new toq();
        this.f52210ki = toqVar;
        this.f5966k = cls;
        this.f52215toq = i2;
        this.f52217zy = zyVar;
        this.f5969q = qVar;
        this.f5967n = new C1111r<>(i2);
        ni7 ni7Var = new ni7();
        this.f5964g = ni7Var.toq(kVar);
        this.f52209f7l8 = ni7Var.mo5042k(toqVar);
        m5047g();
    }

    private boolean zy() {
        return this.f52211kja0 != this.f52213n7h;
    }

    void f7l8() {
        int i2;
        this.f5969q.toq(this.f5971y);
        int[] iArr = this.f5971y;
        int i3 = iArr[0];
        int i4 = iArr[1];
        if (i3 > i4 || i3 < 0 || i4 >= this.f52214qrj) {
            return;
        }
        if (this.f52212ld6) {
            int[] iArr2 = this.f5970s;
            if (i3 > iArr2[1] || (i2 = iArr2[0]) > i4) {
                this.f52216x2 = 0;
            } else if (i3 < i2) {
                this.f52216x2 = 1;
            } else if (i3 > i2) {
                this.f52216x2 = 2;
            }
        } else {
            this.f52216x2 = 0;
        }
        int[] iArr3 = this.f5970s;
        iArr3[0] = i3;
        iArr3[1] = i4;
        this.f5969q.m5053k(iArr, this.f5968p, this.f52216x2);
        int[] iArr4 = this.f5968p;
        iArr4[0] = Math.min(this.f5971y[0], Math.max(iArr4[0], 0));
        int[] iArr5 = this.f5968p;
        iArr5[1] = Math.max(this.f5971y[1], Math.min(iArr5[1], this.f52214qrj - 1));
        lvui.InterfaceC1098k<T> interfaceC1098k = this.f52209f7l8;
        int[] iArr6 = this.f5971y;
        int i5 = iArr6[0];
        int i6 = iArr6[1];
        int[] iArr7 = this.f5968p;
        interfaceC1098k.mo5043k(i5, i6, iArr7[0], iArr7[1], this.f52216x2);
    }

    /* JADX INFO: renamed from: g */
    public void m5047g() {
        this.f5965h.clear();
        lvui.InterfaceC1098k<T> interfaceC1098k = this.f52209f7l8;
        int i2 = this.f52211kja0 + 1;
        this.f52211kja0 = i2;
        interfaceC1098k.zy(i2);
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public T m5048k(int i2) {
        if (i2 < 0 || i2 >= this.f52214qrj) {
            throw new IndexOutOfBoundsException(i2 + " is not within 0 and " + this.f52214qrj);
        }
        T tM5110q = this.f5967n.m5110q(i2);
        if (tM5110q == null && !zy()) {
            this.f5965h.put(i2, 0);
        }
        return tM5110q;
    }

    /* JADX INFO: renamed from: n */
    public void m5049n() {
        if (zy()) {
            return;
        }
        f7l8();
        this.f52212ld6 = true;
    }

    /* JADX INFO: renamed from: q */
    void m5050q(String str, Object... objArr) {
        Log.d(f52207t8r, "[MAIN] " + String.format(str, objArr));
    }

    public int toq() {
        return this.f52214qrj;
    }
}
