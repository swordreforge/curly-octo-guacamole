package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.C0307s;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.k */
/* JADX INFO: compiled from: Barrier.java */
/* JADX INFO: loaded from: classes.dex */
public class C0340k extends C0342p {

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    public static final int f47812bap7 = 0;

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    private static final boolean f47813dxef = false;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private static final boolean f47814e5 = true;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    public static final int f47815ga = 3;

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    public static final int f47816h4b = 1;

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    public static final int f47817wlev = 2;

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    private int f47819n2t = 0;

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    private boolean f47821pjz9 = true;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    private int f47820ngy = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    boolean f47818lh = false;

    public C0340k() {
    }

    public int cyoe() {
        int i2 = this.f47819n2t;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    public boolean ec() {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        boolean z2 = true;
        while (true) {
            i2 = this.f47951zwy;
            if (i5 >= i2) {
                break;
            }
            C0341n c0341n = this.f47950nsb[i5];
            if ((this.f47821pjz9 || c0341n.mo1306y()) && ((((i3 = this.f47819n2t) == 0 || i3 == 1) && !c0341n.fnq8()) || (((i4 = this.f47819n2t) == 2 || i4 == 3) && !c0341n.qo()))) {
                z2 = false;
            }
            i5++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z3 = false;
        for (int i6 = 0; i6 < this.f47951zwy; i6++) {
            C0341n c0341n2 = this.f47950nsb[i6];
            if (this.f47821pjz9 || c0341n2.mo1306y()) {
                if (!z3) {
                    int i7 = this.f47819n2t;
                    if (i7 == 0) {
                        iMax = c0341n2.ki(C0343q.toq.LEFT).m1334g();
                    } else if (i7 == 1) {
                        iMax = c0341n2.ki(C0343q.toq.RIGHT).m1334g();
                    } else if (i7 == 2) {
                        iMax = c0341n2.ki(C0343q.toq.TOP).m1334g();
                    } else if (i7 == 3) {
                        iMax = c0341n2.ki(C0343q.toq.BOTTOM).m1334g();
                    }
                    z3 = true;
                }
                int i8 = this.f47819n2t;
                if (i8 == 0) {
                    iMax = Math.min(iMax, c0341n2.ki(C0343q.toq.LEFT).m1334g());
                } else if (i8 == 1) {
                    iMax = Math.max(iMax, c0341n2.ki(C0343q.toq.RIGHT).m1334g());
                } else if (i8 == 2) {
                    iMax = Math.min(iMax, c0341n2.ki(C0343q.toq.TOP).m1334g());
                } else if (i8 == 3) {
                    iMax = Math.max(iMax, c0341n2.ki(C0343q.toq.BOTTOM).m1334g());
                }
            }
        }
        int i9 = iMax + this.f47820ngy;
        int i10 = this.f47819n2t;
        if (i10 == 0 || i10 == 1) {
            jbh(i9, i9);
        } else {
            wx16(i9, i9);
        }
        this.f47818lh = true;
        return true;
    }

    public void el(int i2) {
        this.f47820ngy = i2;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void f7l8(C0296n c0296n, boolean z2) {
        C0343q[] c0343qArr;
        boolean z3;
        int i2;
        int i3;
        int i4;
        C0343q[] c0343qArr2 = this.f47922vyq;
        c0343qArr2[0] = this.f47905ncyb;
        c0343qArr2[2] = this.f2051l;
        c0343qArr2[1] = this.f47903n5r1;
        c0343qArr2[3] = this.f47887hyr;
        int i5 = 0;
        while (true) {
            c0343qArr = this.f47922vyq;
            if (i5 >= c0343qArr.length) {
                break;
            }
            C0343q c0343q = c0343qArr[i5];
            c0343q.f2072s = c0296n.fn3e(c0343q);
            i5++;
        }
        int i6 = this.f47819n2t;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        C0343q c0343q2 = c0343qArr[i6];
        if (!this.f47818lh) {
            ec();
        }
        if (this.f47818lh) {
            this.f47818lh = false;
            int i7 = this.f47819n2t;
            if (i7 == 0 || i7 == 1) {
                c0296n.m1116g(this.f47905ncyb.f2072s, this.f47930y9n);
                c0296n.m1116g(this.f47903n5r1.f2072s, this.f47930y9n);
                return;
            } else {
                if (i7 == 2 || i7 == 3) {
                    c0296n.m1116g(this.f2051l.f2072s, this.f2041b);
                    c0296n.m1116g(this.f47887hyr.f2072s, this.f2041b);
                    return;
                }
                return;
            }
        }
        for (int i8 = 0; i8 < this.f47951zwy; i8++) {
            C0341n c0341n = this.f47950nsb[i8];
            if ((this.f47821pjz9 || c0341n.mo1306y()) && ((((i3 = this.f47819n2t) == 0 || i3 == 1) && c0341n.gvn7() == C0341n.toq.MATCH_CONSTRAINT && c0341n.f47905ncyb.f2068g != null && c0341n.f47903n5r1.f2068g != null) || (((i4 = this.f47819n2t) == 2 || i4 == 3) && c0341n.bf2() == C0341n.toq.MATCH_CONSTRAINT && c0341n.f2051l.f2068g != null && c0341n.f47887hyr.f2068g != null))) {
                z3 = true;
                break;
            }
        }
        z3 = false;
        boolean z5 = this.f47905ncyb.qrj() || this.f47903n5r1.qrj();
        boolean z6 = this.f2051l.qrj() || this.f47887hyr.qrj();
        int i9 = !z3 && (((i2 = this.f47819n2t) == 0 && z5) || ((i2 == 2 && z6) || ((i2 == 1 && z5) || (i2 == 3 && z6)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.f47951zwy; i10++) {
            C0341n c0341n2 = this.f47950nsb[i10];
            if (this.f47821pjz9 || c0341n2.mo1306y()) {
                C0307s c0307sFn3e = c0296n.fn3e(c0341n2.f47922vyq[this.f47819n2t]);
                C0343q[] c0343qArr3 = c0341n2.f47922vyq;
                int i11 = this.f47819n2t;
                C0343q c0343q3 = c0343qArr3[i11];
                c0343q3.f2072s = c0307sFn3e;
                C0343q c0343q4 = c0343q3.f2068g;
                int i12 = (c0343q4 == null || c0343q4.f2071q != this) ? 0 : c0343q3.f47953f7l8 + 0;
                if (i11 == 0 || i11 == 2) {
                    c0296n.m1121p(c0343q2.f2072s, c0307sFn3e, this.f47820ngy - i12, z3);
                } else {
                    c0296n.m1125y(c0343q2.f2072s, c0307sFn3e, this.f47820ngy + i12, z3);
                }
                c0296n.m1120n(c0343q2.f2072s, c0307sFn3e, this.f47820ngy + i12, i9);
            }
        }
        int i13 = this.f47819n2t;
        if (i13 == 0) {
            c0296n.m1120n(this.f47903n5r1.f2072s, this.f47905ncyb.f2072s, 0, 8);
            c0296n.m1120n(this.f47905ncyb.f2072s, this.f2049j.f47903n5r1.f2072s, 0, 4);
            c0296n.m1120n(this.f47905ncyb.f2072s, this.f2049j.f47905ncyb.f2072s, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0296n.m1120n(this.f47905ncyb.f2072s, this.f47903n5r1.f2072s, 0, 8);
            c0296n.m1120n(this.f47905ncyb.f2072s, this.f2049j.f47905ncyb.f2072s, 0, 4);
            c0296n.m1120n(this.f47905ncyb.f2072s, this.f2049j.f47903n5r1.f2072s, 0, 0);
        } else if (i13 == 2) {
            c0296n.m1120n(this.f47887hyr.f2072s, this.f2051l.f2072s, 0, 8);
            c0296n.m1120n(this.f2051l.f2072s, this.f2049j.f47887hyr.f2072s, 0, 4);
            c0296n.m1120n(this.f2051l.f2072s, this.f2049j.f2051l.f2072s, 0, 0);
        } else if (i13 == 3) {
            c0296n.m1120n(this.f2051l.f2072s, this.f47887hyr.f2072s, 0, 8);
            c0296n.m1120n(this.f2051l.f2072s, this.f2049j.f2051l.f2072s, 0, 4);
            c0296n.m1120n(this.f2051l.f2072s, this.f2049j.f47887hyr.f2072s, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public boolean fnq8() {
        return this.f47818lh;
    }

    public int l05() {
        return this.f47820ngy;
    }

    @Override // androidx.constraintlayout.core.widgets.C0342p, androidx.constraintlayout.core.widgets.C0341n
    public void n7h(C0341n c0341n, HashMap<C0341n, C0341n> map) {
        super.n7h(c0341n, map);
        C0340k c0340k = (C0340k) c0341n;
        this.f47819n2t = c0340k.f47819n2t;
        this.f47821pjz9 = c0340k.f47821pjz9;
        this.f47820ngy = c0340k.f47820ngy;
    }

    @Deprecated
    public boolean o5() {
        return this.f47821pjz9;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public boolean qo() {
        return this.f47818lh;
    }

    protected void r6ty() {
        for (int i2 = 0; i2 < this.f47951zwy; i2++) {
            C0341n c0341n = this.f47950nsb[i2];
            if (this.f47821pjz9 || c0341n.mo1306y()) {
                int i3 = this.f47819n2t;
                if (i3 == 0 || i3 == 1) {
                    c0341n.bap7(0, true);
                } else if (i3 == 2 || i3 == 3) {
                    c0341n.bap7(1, true);
                }
            }
        }
    }

    public int rp() {
        return this.f47819n2t;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public String toString() {
        String str = "[Barrier] " + m1332z() + " {";
        for (int i2 = 0; i2 < this.f47951zwy; i2++) {
            C0341n c0341n = this.f47950nsb[i2];
            if (i2 > 0) {
                str = str + ", ";
            }
            str = str + c0341n.m1332z();
        }
        return str + "}";
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    /* JADX INFO: renamed from: y */
    public boolean mo1306y() {
        return true;
    }

    public void yp31(boolean z2) {
        this.f47821pjz9 = z2;
    }

    public boolean yw() {
        return this.f47821pjz9;
    }

    public void zff0(int i2) {
        this.f47819n2t = i2;
    }

    public C0340k(String str) {
        ktq(str);
    }
}
