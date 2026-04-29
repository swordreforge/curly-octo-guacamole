package qh4d;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.C0683f;
import androidx.core.view.fti;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: qh4d.q */
/* JADX INFO: compiled from: NestedScrollingChildHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7616q extends fti {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private ViewParent f94465f7l8;

    /* JADX INFO: renamed from: g */
    private ViewParent f43975g;

    /* JADX INFO: renamed from: p */
    private int[] f43976p;

    /* JADX INFO: renamed from: s */
    private boolean f43977s;

    /* JADX INFO: renamed from: y */
    private final View f43978y;

    private C7616q(@lvui View view) {
        super(view);
        this.f43978y = view;
    }

    private void cdj(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.f43975g = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f94465f7l8 = viewParent;
        }
    }

    /* JADX INFO: renamed from: p */
    private int[] m27922p() {
        if (this.f43976p == null) {
            this.f43976p = new int[2];
        }
        return this.f43976p;
    }

    /* JADX INFO: renamed from: s */
    private ViewParent m27923s(int i2) {
        if (i2 == 0) {
            return this.f43975g;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f94465f7l8;
    }

    /* JADX INFO: renamed from: y */
    private boolean m27924y(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @dd int[] iArr2) {
        ViewParent viewParentM27923s;
        int i7;
        int i8;
        int[] iArr3;
        if (!qrj() || (viewParentM27923s = m27923s(i6)) == null) {
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
            this.f43978y.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM27922p = m27922p();
            iArrM27922p[0] = 0;
            iArrM27922p[1] = 0;
            iArr3 = iArrM27922p;
        } else {
            iArr3 = iArr2;
        }
        f7l8.m27920s(viewParentM27923s, this.f43978y, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f43978y.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public static fti zurt(View view) {
        return new fti(view);
    }

    @Override // androidx.core.view.fti
    public boolean f7l8(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6) {
        return m27924y(i2, i3, i4, i5, iArr, i6, null);
    }

    @Override // androidx.core.view.fti
    public void fn3e(int i2) {
        ViewParent viewParentM27923s = m27923s(i2);
        if (viewParentM27923s != null) {
            f7l8.kja0(viewParentM27923s, this.f43978y, i2);
            cdj(i2, null);
        }
    }

    @Override // androidx.core.view.fti
    /* JADX INFO: renamed from: g */
    public boolean mo3263g(int i2, int i3, int i4, int i5, @dd int[] iArr) {
        return m27924y(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // androidx.core.view.fti
    /* JADX INFO: renamed from: h */
    public void mo3264h(boolean z2) {
        if (this.f43977s) {
            C0683f.kq2f(this.f43978y);
        }
        this.f43977s = z2;
    }

    @Override // androidx.core.view.fti
    /* JADX INFO: renamed from: i */
    public void mo3265i() {
        fn3e(0);
    }

    @Override // androidx.core.view.fti
    /* JADX INFO: renamed from: k */
    public boolean mo3266k(float f2, float f3, boolean z2) {
        ViewParent viewParentM27923s;
        if (!qrj() || (viewParentM27923s = m27923s(0)) == null) {
            return false;
        }
        return f7l8.zy(viewParentM27923s, this.f43978y, f2, f3, z2);
    }

    @Override // androidx.core.view.fti
    public boolean ki(int i2) {
        return t8r(i2, 0);
    }

    @Override // androidx.core.view.fti
    public void kja0(@lvui View view) {
        C0683f.kq2f(this.f43978y);
    }

    @Override // androidx.core.view.fti
    public boolean ld6() {
        return x2(0);
    }

    @Override // androidx.core.view.fti
    /* JADX INFO: renamed from: n */
    public void mo3267n(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @dd int[] iArr2) {
        m27924y(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // androidx.core.view.fti
    public void n7h() {
        C0683f.kq2f(this.f43978y);
    }

    @Override // androidx.core.view.fti
    /* JADX INFO: renamed from: q */
    public boolean mo3268q(int i2, int i3, @dd int[] iArr, @dd int[] iArr2, int i4) {
        ViewParent viewParentM27923s;
        int i5;
        int i6;
        if (!qrj() || (viewParentM27923s = m27923s(i4)) == null) {
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
            this.f43978y.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = m27922p();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        f7l8.m27914g(viewParentM27923s, this.f43978y, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f43978y.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // androidx.core.view.fti
    public boolean qrj() {
        return this.f43977s;
    }

    @Override // androidx.core.view.fti
    public boolean t8r(int i2, int i3) {
        if (x2(i3)) {
            return true;
        }
        if (!qrj()) {
            return false;
        }
        View view = this.f43978y;
        for (ViewParent parent = this.f43978y.getParent(); parent != null; parent = parent.getParent()) {
            if (f7l8.qrj(parent, view, this.f43978y, i2, i3)) {
                cdj(i3, parent);
                f7l8.ld6(parent, view, this.f43978y, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    @Override // androidx.core.view.fti
    public boolean toq(float f2, float f3) {
        ViewParent viewParentM27923s;
        if (!qrj() || (viewParentM27923s = m27923s(0)) == null) {
            return false;
        }
        return f7l8.m27919q(viewParentM27923s, this.f43978y, f2, f3);
    }

    @Override // androidx.core.view.fti
    public boolean x2(int i2) {
        return m27923s(i2) != null;
    }

    @Override // androidx.core.view.fti
    public boolean zy(int i2, int i3, @dd int[] iArr, @dd int[] iArr2) {
        return mo3268q(i2, i3, iArr, iArr2, 0);
    }
}
