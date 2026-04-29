package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: NestedScrollingChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class fti {

    /* JADX INFO: renamed from: k */
    private ViewParent f4020k;

    /* JADX INFO: renamed from: n */
    private int[] f4021n;

    /* JADX INFO: renamed from: q */
    private boolean f4022q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ViewParent f50811toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final View f50812zy;

    public fti(@zy.lvui View view) {
        this.f50812zy = view;
    }

    private void cdj(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f4020k = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f50811toq = viewParent;
        }
    }

    /* JADX INFO: renamed from: p */
    private int[] m3260p() {
        if (this.f4021n == null) {
            this.f4021n = new int[2];
        }
        return this.f4021n;
    }

    /* JADX INFO: renamed from: s */
    private ViewParent m3261s(int i2) {
        if (i2 == 0) {
            return this.f4020k;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f50811toq;
    }

    /* JADX INFO: renamed from: y */
    private boolean m3262y(int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6, @zy.dd int[] iArr2) {
        ViewParent viewParentM3261s;
        int i7;
        int i8;
        int[] iArr3;
        if (!qrj() || (viewParentM3261s = m3261s(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f50812zy.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM3260p = m3260p();
            iArrM3260p[0] = 0;
            iArrM3260p[1] = 0;
            iArr3 = iArrM3260p;
        } else {
            iArr3 = iArr2;
        }
        y2.m3572s(viewParentM3261s, this.f50812zy, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f50812zy.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public boolean f7l8(int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6) {
        return m3262y(i2, i3, i4, i5, iArr, i6, null);
    }

    public void fn3e(int i2) {
        ViewParent viewParentM3261s = m3261s(i2);
        if (viewParentM3261s != null) {
            y2.kja0(viewParentM3261s, this.f50812zy, i2);
            cdj(i2, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean mo3263g(int i2, int i3, int i4, int i5, @zy.dd int[] iArr) {
        return m3262y(i2, i3, i4, i5, iArr, 0, null);
    }

    /* JADX INFO: renamed from: h */
    public void mo3264h(boolean z2) {
        if (this.f4022q) {
            C0683f.kq2f(this.f50812zy);
        }
        this.f4022q = z2;
    }

    /* JADX INFO: renamed from: i */
    public void mo3265i() {
        fn3e(0);
    }

    /* JADX INFO: renamed from: k */
    public boolean mo3266k(float f2, float f3, boolean z2) {
        ViewParent viewParentM3261s;
        if (!qrj() || (viewParentM3261s = m3261s(0)) == null) {
            return false;
        }
        return y2.zy(viewParentM3261s, this.f50812zy, f2, f3, z2);
    }

    public boolean ki(int i2) {
        return t8r(i2, 0);
    }

    public void kja0(@zy.lvui View view) {
        C0683f.kq2f(this.f50812zy);
    }

    public boolean ld6() {
        return x2(0);
    }

    /* JADX INFO: renamed from: n */
    public void mo3267n(int i2, int i3, int i4, int i5, @zy.dd int[] iArr, int i6, @zy.dd int[] iArr2) {
        m3262y(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void n7h() {
        C0683f.kq2f(this.f50812zy);
    }

    /* JADX INFO: renamed from: q */
    public boolean mo3268q(int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2, int i4) {
        ViewParent viewParentM3261s;
        int i5;
        int i6;
        if (!qrj() || (viewParentM3261s = m3261s(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f50812zy.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = m3260p();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        y2.m3566g(viewParentM3261s, this.f50812zy, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f50812zy.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public boolean qrj() {
        return this.f4022q;
    }

    public boolean t8r(int i2, int i3) {
        if (x2(i3)) {
            return true;
        }
        if (!qrj()) {
            return false;
        }
        View view = this.f50812zy;
        for (ViewParent parent = this.f50812zy.getParent(); parent != null; parent = parent.getParent()) {
            if (y2.qrj(parent, view, this.f50812zy, i2, i3)) {
                cdj(i3, parent);
                y2.ld6(parent, view, this.f50812zy, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public boolean toq(float f2, float f3) {
        ViewParent viewParentM3261s;
        if (!qrj() || (viewParentM3261s = m3261s(0)) == null) {
            return false;
        }
        return y2.m3571q(viewParentM3261s, this.f50812zy, f2, f3);
    }

    public boolean x2(int i2) {
        return m3261s(i2) != null;
    }

    public boolean zy(int i2, int i3, @zy.dd int[] iArr, @zy.dd int[] iArr2) {
        return mo3268q(i2, i3, iArr, iArr2, 0);
    }
}
