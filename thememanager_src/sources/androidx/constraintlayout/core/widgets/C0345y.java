package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0296n;
import androidx.constraintlayout.core.C0307s;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.y */
/* JADX INFO: compiled from: Guideline.java */
/* JADX INFO: loaded from: classes.dex */
public class C0345y extends C0341n {

    /* JADX INFO: renamed from: a5id, reason: collision with root package name */
    public static final int f47959a5id = -1;

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    public static final int f47960dxef = 1;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final int f47961e5 = 0;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    public static final int f47962ga = 1;

    /* JADX INFO: renamed from: vy, reason: collision with root package name */
    public static final int f47963vy = 2;

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    public static final int f47964wlev = 0;

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    private boolean f47966h4b;

    /* JADX INFO: renamed from: nsb, reason: collision with root package name */
    protected float f47970nsb = -1.0f;

    /* JADX INFO: renamed from: zwy, reason: collision with root package name */
    protected int f47972zwy = -1;

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    protected int f47968n2t = -1;

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    protected boolean f47971pjz9 = true;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    private C0343q f47969ngy = this.f2051l;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f47967lh = 0;

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    private int f47965bap7 = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.y$k */
    /* JADX INFO: compiled from: Guideline.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2079k;

        static {
            int[] iArr = new int[C0343q.toq.values().length];
            f2079k = iArr;
            try {
                iArr[C0343q.toq.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2079k[C0343q.toq.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2079k[C0343q.toq.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2079k[C0343q.toq.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2079k[C0343q.toq.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2079k[C0343q.toq.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2079k[C0343q.toq.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2079k[C0343q.toq.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2079k[C0343q.toq.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C0345y() {
        this.f2044e.clear();
        this.f2044e.add(this.f47969ngy);
        int length = this.f47922vyq.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f47922vyq[i2] = this.f47969ngy;
        }
    }

    public C0343q bih() {
        return this.f47969ngy;
    }

    public void bqie(int i2) {
        imd(i2 / 100.0f);
    }

    void cyoe() {
        int iM1331x = m1331x();
        if (this.f47967lh == 0) {
            iM1331x = ch();
        }
        wt(iM1331x);
    }

    public int ec() {
        return this.f47967lh;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public String ek5k() {
        return "Guideline";
    }

    public void el(int i2) {
        this.f47969ngy.wvg(i2);
        this.f47966h4b = true;
    }

    public void f1bi(int i2) {
        this.f47965bap7 = i2;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void f7l8(C0296n c0296n, boolean z2) {
        C0339g c0339g = (C0339g) m1318f();
        if (c0339g == null) {
            return;
        }
        C0343q c0343qKi = c0339g.ki(C0343q.toq.LEFT);
        C0343q c0343qKi2 = c0339g.ki(C0343q.toq.RIGHT);
        C0341n c0341n = this.f2049j;
        boolean z3 = c0341n != null && c0341n.f47886hb[0] == C0341n.toq.WRAP_CONTENT;
        if (this.f47967lh == 0) {
            c0343qKi = c0339g.ki(C0343q.toq.TOP);
            c0343qKi2 = c0339g.ki(C0343q.toq.BOTTOM);
            C0341n c0341n2 = this.f2049j;
            z3 = c0341n2 != null && c0341n2.f47886hb[1] == C0341n.toq.WRAP_CONTENT;
        }
        if (this.f47966h4b && this.f47969ngy.kja0()) {
            C0307s c0307sFn3e = c0296n.fn3e(this.f47969ngy);
            c0296n.m1116g(c0307sFn3e, this.f47969ngy.m1334g());
            if (this.f47972zwy != -1) {
                if (z3) {
                    c0296n.m1124s(c0296n.fn3e(c0343qKi2), c0307sFn3e, 0, 5);
                }
            } else if (this.f47968n2t != -1 && z3) {
                C0307s c0307sFn3e2 = c0296n.fn3e(c0343qKi2);
                c0296n.m1124s(c0307sFn3e, c0296n.fn3e(c0343qKi), 0, 5);
                c0296n.m1124s(c0307sFn3e2, c0307sFn3e, 0, 5);
            }
            this.f47966h4b = false;
            return;
        }
        if (this.f47972zwy != -1) {
            C0307s c0307sFn3e3 = c0296n.fn3e(this.f47969ngy);
            c0296n.m1120n(c0307sFn3e3, c0296n.fn3e(c0343qKi), this.f47972zwy, 8);
            if (z3) {
                c0296n.m1124s(c0296n.fn3e(c0343qKi2), c0307sFn3e3, 0, 5);
                return;
            }
            return;
        }
        if (this.f47968n2t == -1) {
            if (this.f47970nsb != -1.0f) {
                c0296n.m1122q(C0296n.ni7(c0296n, c0296n.fn3e(this.f47969ngy), c0296n.fn3e(c0343qKi2), this.f47970nsb));
                return;
            }
            return;
        }
        C0307s c0307sFn3e4 = c0296n.fn3e(this.f47969ngy);
        C0307s c0307sFn3e5 = c0296n.fn3e(c0343qKi2);
        c0296n.m1120n(c0307sFn3e4, c0307sFn3e5, -this.f47968n2t, 8);
        if (z3) {
            c0296n.m1124s(c0307sFn3e4, c0296n.fn3e(c0343qKi), 0, 5);
            c0296n.m1124s(c0307sFn3e5, c0307sFn3e4, 0, 5);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public boolean fnq8() {
        return this.f47966h4b;
    }

    public void g0ad(int i2) {
        if (i2 > -1) {
            this.f47970nsb = -1.0f;
            this.f47972zwy = -1;
            this.f47968n2t = i2;
        }
    }

    public void imd(float f2) {
        if (f2 > -1.0f) {
            this.f47970nsb = f2;
            this.f47972zwy = -1;
            this.f47968n2t = -1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public C0343q ki(C0343q.toq toqVar) {
        int i2 = k.f2079k[toqVar.ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (this.f47967lh == 1) {
                return this.f47969ngy;
            }
            return null;
        }
        if ((i2 == 3 || i2 == 4) && this.f47967lh == 0) {
            return this.f47969ngy;
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void kiv(C0296n c0296n, boolean z2) {
        if (m1318f() == null) {
            return;
        }
        int iDd = c0296n.dd(this.f47969ngy);
        if (this.f47967lh == 1) {
            v5yj(iDd);
            ra(0);
            pc(m1318f().jk());
            m2t(0);
            return;
        }
        v5yj(0);
        ra(iDd);
        m2t(m1318f().m1313a());
        pc(0);
    }

    public float l05() {
        return this.f47970nsb;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public void n7h(C0341n c0341n, HashMap<C0341n, C0341n> map) {
        super.n7h(c0341n, map);
        C0345y c0345y = (C0345y) c0341n;
        this.f47970nsb = c0345y.f47970nsb;
        this.f47972zwy = c0345y.f47972zwy;
        this.f47968n2t = c0345y.f47968n2t;
        this.f47971pjz9 = c0345y.f47971pjz9;
        tww7(c0345y.f47967lh);
    }

    public int o5() {
        return this.f47972zwy;
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    public boolean qo() {
        return this.f47966h4b;
    }

    void r6ty() {
        int iM1313a = m1318f().m1313a() - m1331x();
        if (this.f47967lh == 0) {
            iM1313a = m1318f().jk() - ch();
        }
        g0ad(iM1313a);
    }

    public int rp() {
        return this.f47968n2t;
    }

    public void tww7(int i2) {
        if (this.f47967lh == i2) {
            return;
        }
        this.f47967lh = i2;
        this.f2044e.clear();
        if (this.f47967lh == 1) {
            this.f47969ngy = this.f47905ncyb;
        } else {
            this.f47969ngy = this.f2051l;
        }
        this.f2044e.add(this.f47969ngy);
        int length = this.f47922vyq.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f47922vyq[i3] = this.f47969ngy;
        }
    }

    public void wt(int i2) {
        if (i2 > -1) {
            this.f47970nsb = -1.0f;
            this.f47972zwy = i2;
            this.f47968n2t = -1;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.C0341n
    /* JADX INFO: renamed from: y */
    public boolean mo1306y() {
        return true;
    }

    void yp31() {
        float fM1331x = m1331x() / m1318f().m1313a();
        if (this.f47967lh == 0) {
            fM1331x = ch() / m1318f().jk();
        }
        imd(fM1331x);
    }

    public int yw() {
        if (this.f47970nsb != -1.0f) {
            return 0;
        }
        if (this.f47972zwy != -1) {
            return 1;
        }
        return this.f47968n2t != -1 ? 2 : -1;
    }

    public void z4t() {
        if (this.f47972zwy != -1) {
            yp31();
        } else if (this.f47970nsb != -1.0f) {
            r6ty();
        } else if (this.f47968n2t != -1) {
            cyoe();
        }
    }

    public boolean zff0() {
        return this.f47970nsb != -1.0f && this.f47972zwy == -1 && this.f47968n2t == -1;
    }
}
