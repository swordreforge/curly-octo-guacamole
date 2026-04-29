package androidx.recyclerview.widget;

import androidx.core.util.qrj;
import androidx.recyclerview.widget.C1117z;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: compiled from: AdapterHelper.java */
/* JADX INFO: loaded from: classes.dex */
final class C1084k implements C1117z.k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final boolean f52139ld6 = false;

    /* JADX INFO: renamed from: p */
    static final int f5879p = 1;

    /* JADX INFO: renamed from: s */
    static final int f5880s = 0;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f52140x2 = "AHT";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final C1117z f52141f7l8;

    /* JADX INFO: renamed from: g */
    final boolean f5881g;

    /* JADX INFO: renamed from: k */
    private qrj.InterfaceC0641k<toq> f5882k;

    /* JADX INFO: renamed from: n */
    Runnable f5883n;

    /* JADX INFO: renamed from: q */
    final k f5884q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final ArrayList<toq> f52142toq;

    /* JADX INFO: renamed from: y */
    private int f5885y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final ArrayList<toq> f52143zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$k */
    /* JADX INFO: compiled from: AdapterHelper.java */
    interface k {
        void f7l8(int i2, int i3);

        /* JADX INFO: renamed from: g */
        RecyclerView.fti mo4802g(int i2);

        /* JADX INFO: renamed from: k */
        void mo4803k(int i2, int i3);

        /* JADX INFO: renamed from: n */
        void mo4804n(int i2, int i3, Object obj);

        /* JADX INFO: renamed from: q */
        void mo4805q(int i2, int i3);

        void toq(toq toqVar);

        /* JADX INFO: renamed from: y */
        void mo4807y(int i2, int i3);

        void zy(toq toqVar);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$toq */
    /* JADX INFO: compiled from: AdapterHelper.java */
    static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f52144f7l8 = 4;

        /* JADX INFO: renamed from: g */
        static final int f5886g = 2;

        /* JADX INFO: renamed from: n */
        static final int f5887n = 1;

        /* JADX INFO: renamed from: s */
        static final int f5888s = 30;

        /* JADX INFO: renamed from: y */
        static final int f5889y = 8;

        /* JADX INFO: renamed from: k */
        int f5890k;

        /* JADX INFO: renamed from: q */
        int f5891q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52145toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Object f52146zy;

        toq(int i2, int i3, int i4, Object obj) {
            this.f5890k = i2;
            this.f52145toq = i3;
            this.f5891q = i4;
            this.f52146zy = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            int i2 = this.f5890k;
            if (i2 != toqVar.f5890k) {
                return false;
            }
            if (i2 == 8 && Math.abs(this.f5891q - this.f52145toq) == 1 && this.f5891q == toqVar.f52145toq && this.f52145toq == toqVar.f5891q) {
                return true;
            }
            if (this.f5891q != toqVar.f5891q || this.f52145toq != toqVar.f52145toq) {
                return false;
            }
            Object obj2 = this.f52146zy;
            if (obj2 != null) {
                if (!obj2.equals(toqVar.f52146zy)) {
                    return false;
                }
            } else if (toqVar.f52146zy != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f5890k * 31) + this.f52145toq) * 31) + this.f5891q;
        }

        /* JADX INFO: renamed from: k */
        String m5003k() {
            int i2 = this.f5890k;
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m5003k() + ",s:" + this.f52145toq + "c:" + this.f5891q + ",p:" + this.f52146zy + "]";
        }
    }

    C1084k(k kVar) {
        this(kVar, false);
    }

    private void f7l8(toq toqVar) {
        boolean z2;
        byte b2;
        int i2 = toqVar.f52145toq;
        int i3 = toqVar.f5891q + i2;
        byte b3 = -1;
        int i4 = i2;
        int i5 = 0;
        while (i4 < i3) {
            if (this.f5884q.mo4802g(i4) != null || m4995s(i4)) {
                if (b3 == 0) {
                    x2(mo5000k(2, i2, i5, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                b2 = 1;
            } else {
                if (b3 == 1) {
                    ni7(mo5000k(2, i2, i5, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                b2 = 0;
            }
            if (z2) {
                i4 -= i5;
                i3 -= i5;
                i5 = 1;
            } else {
                i5++;
            }
            i4++;
            b3 = b2;
        }
        if (i5 != toqVar.f5891q) {
            toq(toqVar);
            toqVar = mo5000k(2, i2, i5, null);
        }
        if (b3 == 0) {
            x2(toqVar);
        } else {
            ni7(toqVar);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m4993n(toq toqVar) {
        ni7(toqVar);
    }

    private void ni7(toq toqVar) {
        this.f52143zy.add(toqVar);
        int i2 = toqVar.f5890k;
        if (i2 == 1) {
            this.f5884q.f7l8(toqVar.f52145toq, toqVar.f5891q);
            return;
        }
        if (i2 == 2) {
            this.f5884q.mo4805q(toqVar.f52145toq, toqVar.f5891q);
            return;
        }
        if (i2 == 4) {
            this.f5884q.mo4804n(toqVar.f52145toq, toqVar.f5891q, toqVar.f52146zy);
        } else {
            if (i2 == 8) {
                this.f5884q.mo4803k(toqVar.f52145toq, toqVar.f5891q);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + toqVar);
        }
    }

    /* JADX INFO: renamed from: q */
    private void m4994q(toq toqVar) {
        ni7(toqVar);
    }

    /* JADX INFO: renamed from: s */
    private boolean m4995s(int i2) {
        int size = this.f52143zy.size();
        for (int i3 = 0; i3 < size; i3++) {
            toq toqVar = this.f52143zy.get(i3);
            int i4 = toqVar.f5890k;
            if (i4 == 8) {
                if (kja0(toqVar.f5891q, i3 + 1) == i2) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = toqVar.f52145toq;
                int i6 = toqVar.f5891q + i5;
                while (i5 < i6) {
                    if (kja0(i5, i3 + 1) == i2) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private int wvg(int i2, int i3) {
        int i4;
        int i5;
        for (int size = this.f52143zy.size() - 1; size >= 0; size--) {
            toq toqVar = this.f52143zy.get(size);
            int i6 = toqVar.f5890k;
            if (i6 == 8) {
                int i7 = toqVar.f52145toq;
                int i8 = toqVar.f5891q;
                if (i7 < i8) {
                    i5 = i7;
                    i4 = i8;
                } else {
                    i4 = i7;
                    i5 = i8;
                }
                if (i2 < i5 || i2 > i4) {
                    if (i2 < i7) {
                        if (i3 == 1) {
                            toqVar.f52145toq = i7 + 1;
                            toqVar.f5891q = i8 + 1;
                        } else if (i3 == 2) {
                            toqVar.f52145toq = i7 - 1;
                            toqVar.f5891q = i8 - 1;
                        }
                    }
                } else if (i5 == i7) {
                    if (i3 == 1) {
                        toqVar.f5891q = i8 + 1;
                    } else if (i3 == 2) {
                        toqVar.f5891q = i8 - 1;
                    }
                    i2++;
                } else {
                    if (i3 == 1) {
                        toqVar.f52145toq = i7 + 1;
                    } else if (i3 == 2) {
                        toqVar.f52145toq = i7 - 1;
                    }
                    i2--;
                }
            } else {
                int i9 = toqVar.f52145toq;
                if (i9 <= i2) {
                    if (i6 == 1) {
                        i2 -= toqVar.f5891q;
                    } else if (i6 == 2) {
                        i2 += toqVar.f5891q;
                    }
                } else if (i3 == 1) {
                    toqVar.f52145toq = i9 + 1;
                } else if (i3 == 2) {
                    toqVar.f52145toq = i9 - 1;
                }
            }
        }
        for (int size2 = this.f52143zy.size() - 1; size2 >= 0; size2--) {
            toq toqVar2 = this.f52143zy.get(size2);
            if (toqVar2.f5890k == 8) {
                int i10 = toqVar2.f5891q;
                if (i10 == toqVar2.f52145toq || i10 < 0) {
                    this.f52143zy.remove(size2);
                    toq(toqVar2);
                }
            } else if (toqVar2.f5891q <= 0) {
                this.f52143zy.remove(size2);
                toq(toqVar2);
            }
        }
        return i2;
    }

    private void x2(toq toqVar) {
        int i2;
        int i3 = toqVar.f5890k;
        if (i3 == 1 || i3 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iWvg = wvg(toqVar.f52145toq, i3);
        int i4 = toqVar.f52145toq;
        int i5 = toqVar.f5890k;
        if (i5 == 2) {
            i2 = 0;
        } else {
            if (i5 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + toqVar);
            }
            i2 = 1;
        }
        int i6 = 1;
        for (int i7 = 1; i7 < toqVar.f5891q; i7++) {
            int iWvg2 = wvg(toqVar.f52145toq + (i2 * i7), toqVar.f5890k);
            int i8 = toqVar.f5890k;
            if (i8 == 2 ? iWvg2 == iWvg : i8 == 4 && iWvg2 == iWvg + 1) {
                i6++;
            } else {
                toq toqVarMo5000k = mo5000k(i8, iWvg, i6, toqVar.f52146zy);
                qrj(toqVarMo5000k, i4);
                toq(toqVarMo5000k);
                if (toqVar.f5890k == 4) {
                    i4 += i6;
                }
                i6 = 1;
                iWvg = iWvg2;
            }
        }
        Object obj = toqVar.f52146zy;
        toq(toqVar);
        if (i6 > 0) {
            toq toqVarMo5000k2 = mo5000k(toqVar.f5890k, iWvg, i6, obj);
            qrj(toqVarMo5000k2, i4);
            toq(toqVarMo5000k2);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m4996y(toq toqVar) {
        int i2 = toqVar.f52145toq;
        int i3 = toqVar.f5891q + i2;
        int i4 = 0;
        byte b2 = -1;
        int i5 = i2;
        while (i2 < i3) {
            if (this.f5884q.mo4802g(i2) != null || m4995s(i2)) {
                if (b2 == 0) {
                    x2(mo5000k(4, i5, i4, toqVar.f52146zy));
                    i5 = i2;
                    i4 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    ni7(mo5000k(4, i5, i4, toqVar.f52146zy));
                    i5 = i2;
                    i4 = 0;
                }
                b2 = 0;
            }
            i4++;
            i2++;
        }
        if (i4 != toqVar.f5891q) {
            Object obj = toqVar.f52146zy;
            toq(toqVar);
            toqVar = mo5000k(4, i5, i4, obj);
        }
        if (b2 == 0) {
            x2(toqVar);
        } else {
            ni7(toqVar);
        }
    }

    boolean cdj() {
        return this.f52142toq.size() > 0;
    }

    boolean fn3e(int i2, int i3, int i4) {
        if (i2 == i3) {
            return false;
        }
        if (i4 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f52142toq.add(mo5000k(8, i2, i3, null));
        this.f5885y |= 8;
        return this.f52142toq.size() == 1;
    }

    void fu4() {
        this.f52141f7l8.toq(this.f52142toq);
        int size = this.f52142toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            toq toqVar = this.f52142toq.get(i2);
            int i3 = toqVar.f5890k;
            if (i3 == 1) {
                m4994q(toqVar);
            } else if (i3 == 2) {
                f7l8(toqVar);
            } else if (i3 == 4) {
                m4996y(toqVar);
            } else if (i3 == 8) {
                m4993n(toqVar);
            }
            Runnable runnable = this.f5883n;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f52142toq.clear();
    }

    /* JADX INFO: renamed from: g */
    public int m4997g(int i2) {
        int size = this.f52142toq.size();
        for (int i3 = 0; i3 < size; i3++) {
            toq toqVar = this.f52142toq.get(i3);
            int i4 = toqVar.f5890k;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = toqVar.f52145toq;
                    if (i5 <= i2) {
                        int i6 = toqVar.f5891q;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = toqVar.f52145toq;
                    if (i7 == i2) {
                        i2 = toqVar.f5891q;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (toqVar.f5891q <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (toqVar.f52145toq <= i2) {
                i2 += toqVar.f5891q;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: h */
    boolean m4998h(int i2) {
        return (i2 & this.f5885y) != 0;
    }

    /* JADX INFO: renamed from: i */
    boolean m4999i(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f52142toq.add(mo5000k(1, i2, i3, null));
        this.f5885y |= 1;
        return this.f52142toq.size() == 1;
    }

    @Override // androidx.recyclerview.widget.C1117z.k
    /* JADX INFO: renamed from: k */
    public toq mo5000k(int i2, int i3, int i4, Object obj) {
        toq toqVarMo2983k = this.f5882k.mo2983k();
        if (toqVarMo2983k == null) {
            return new toq(i2, i3, i4, obj);
        }
        toqVarMo2983k.f5890k = i2;
        toqVarMo2983k.f52145toq = i3;
        toqVarMo2983k.f5891q = i4;
        toqVarMo2983k.f52146zy = obj;
        return toqVarMo2983k;
    }

    boolean ki() {
        return (this.f52143zy.isEmpty() || this.f52142toq.isEmpty()) ? false : true;
    }

    int kja0(int i2, int i3) {
        int size = this.f52143zy.size();
        while (i3 < size) {
            toq toqVar = this.f52143zy.get(i3);
            int i4 = toqVar.f5890k;
            if (i4 == 8) {
                int i5 = toqVar.f52145toq;
                if (i5 == i2) {
                    i2 = toqVar.f5891q;
                } else {
                    if (i5 < i2) {
                        i2--;
                    }
                    if (toqVar.f5891q <= i2) {
                        i2++;
                    }
                }
            } else {
                int i6 = toqVar.f52145toq;
                if (i6 > i2) {
                    continue;
                } else if (i4 == 2) {
                    int i7 = toqVar.f5891q;
                    if (i2 < i6 + i7) {
                        return -1;
                    }
                    i2 -= i7;
                } else if (i4 == 1) {
                    i2 += toqVar.f5891q;
                }
            }
            i3++;
        }
        return i2;
    }

    void ld6() {
        m5001p();
        int size = this.f52142toq.size();
        for (int i2 = 0; i2 < size; i2++) {
            toq toqVar = this.f52142toq.get(i2);
            int i3 = toqVar.f5890k;
            if (i3 == 1) {
                this.f5884q.zy(toqVar);
                this.f5884q.f7l8(toqVar.f52145toq, toqVar.f5891q);
            } else if (i3 == 2) {
                this.f5884q.zy(toqVar);
                this.f5884q.mo4807y(toqVar.f52145toq, toqVar.f5891q);
            } else if (i3 == 4) {
                this.f5884q.zy(toqVar);
                this.f5884q.mo4804n(toqVar.f52145toq, toqVar.f5891q, toqVar.f52146zy);
            } else if (i3 == 8) {
                this.f5884q.zy(toqVar);
                this.f5884q.mo4803k(toqVar.f52145toq, toqVar.f5891q);
            }
            Runnable runnable = this.f5883n;
            if (runnable != null) {
                runnable.run();
            }
        }
        m5002z(this.f52142toq);
        this.f5885y = 0;
    }

    int n7h(int i2) {
        return kja0(i2, 0);
    }

    void o1t() {
        m5002z(this.f52142toq);
        m5002z(this.f52143zy);
        this.f5885y = 0;
    }

    /* JADX INFO: renamed from: p */
    void m5001p() {
        int size = this.f52143zy.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f5884q.zy(this.f52143zy.get(i2));
        }
        m5002z(this.f52143zy);
        this.f5885y = 0;
    }

    void qrj(toq toqVar, int i2) {
        this.f5884q.toq(toqVar);
        int i3 = toqVar.f5890k;
        if (i3 == 2) {
            this.f5884q.mo4807y(i2, toqVar.f5891q);
        } else {
            if (i3 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f5884q.mo4804n(i2, toqVar.f5891q, toqVar.f52146zy);
        }
    }

    boolean t8r(int i2, int i3, Object obj) {
        if (i3 < 1) {
            return false;
        }
        this.f52142toq.add(mo5000k(4, i2, i3, obj));
        this.f5885y |= 4;
        return this.f52142toq.size() == 1;
    }

    @Override // androidx.recyclerview.widget.C1117z.k
    public void toq(toq toqVar) {
        if (this.f5881g) {
            return;
        }
        toqVar.f52146zy = null;
        this.f5882k.toq(toqVar);
    }

    /* JADX INFO: renamed from: z */
    void m5002z(List<toq> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            toq(list.get(i2));
        }
        list.clear();
    }

    boolean zurt(int i2, int i3) {
        if (i3 < 1) {
            return false;
        }
        this.f52142toq.add(mo5000k(2, i2, i3, null));
        this.f5885y |= 2;
        return this.f52142toq.size() == 1;
    }

    C1084k zy(toq... toqVarArr) {
        Collections.addAll(this.f52142toq, toqVarArr);
        return this;
    }

    C1084k(k kVar, boolean z2) {
        this.f5882k = new qrj.toq(30);
        this.f52142toq = new ArrayList<>();
        this.f52143zy = new ArrayList<>();
        this.f5885y = 0;
        this.f5884q = kVar;
        this.f5881g = z2;
        this.f52141f7l8 = new C1117z(this);
    }
}
