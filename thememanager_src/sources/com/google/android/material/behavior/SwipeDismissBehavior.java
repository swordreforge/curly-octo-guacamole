package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.fn3e;
import androidx.core.view.accessibility.ki;
import androidx.customview.widget.C0779q;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.zy<V> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final float f67362cdj = 0.5f;

    /* JADX INFO: renamed from: h */
    public static final int f23932h = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final float f67363ki = 0.0f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f67364kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f67365ld6 = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f67366n7h = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f67367qrj = 2;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final float f67368t8r = 0.5f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f67369x2 = 1;

    /* JADX INFO: renamed from: k */
    C0779q f23934k;

    /* JADX INFO: renamed from: n */
    private boolean f23935n;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    zy f67371toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f67372zy;

    /* JADX INFO: renamed from: q */
    private float f23937q = 0.0f;

    /* JADX INFO: renamed from: g */
    int f23933g = 2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float f67370f7l8 = 0.5f;

    /* JADX INFO: renamed from: y */
    float f23939y = 0.0f;

    /* JADX INFO: renamed from: s */
    float f23938s = 0.5f;

    /* JADX INFO: renamed from: p */
    private final C0779q.zy f23936p = new C3937k();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$k */
    class C3937k extends C0779q.zy {

        /* JADX INFO: renamed from: q */
        private static final int f23940q = -1;

        /* JADX INFO: renamed from: k */
        private int f23941k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f67373toq = -1;

        C3937k() {
        }

        private boolean n7h(@lvui View view, float f2) {
            if (f2 == 0.0f) {
                return Math.abs(view.getLeft() - this.f23941k) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f67370f7l8);
            }
            boolean z2 = C0683f.m3159e(view) == 1;
            int i2 = SwipeDismissBehavior.this.f23933g;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z2) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (f2 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            if (z2) {
                if (f2 <= 0.0f) {
                    return false;
                }
            } else if (f2 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: k */
        public int mo3751k(@lvui View view, int i2, int i3) {
            int width;
            int width2;
            int width3;
            boolean z2 = C0683f.m3159e(view) == 1;
            int i4 = SwipeDismissBehavior.this.f23933g;
            if (i4 == 0) {
                if (z2) {
                    width = this.f23941k - view.getWidth();
                    width2 = this.f23941k;
                } else {
                    width = this.f23941k;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i4 != 1) {
                width = this.f23941k - view.getWidth();
                width2 = view.getWidth() + this.f23941k;
            } else if (z2) {
                width = this.f23941k;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f23941k - view.getWidth();
                width2 = this.f23941k;
            }
            return SwipeDismissBehavior.d3(width, i2, width2);
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void ld6(@lvui View view, int i2, int i3, int i4, int i5) {
            float width = this.f23941k + (view.getWidth() * SwipeDismissBehavior.this.f23939y);
            float width2 = this.f23941k + (view.getWidth() * SwipeDismissBehavior.this.f23938s);
            float f2 = i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.gvn7(0.0f, 1.0f - SwipeDismissBehavior.eqxt(width, width2, f2), 1.0f));
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: p */
        public void mo3753p(int i2) {
            zy zyVar = SwipeDismissBehavior.this.f67371toq;
            if (zyVar != null) {
                zyVar.toq(i2);
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: q */
        public int mo3754q(@lvui View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public boolean qrj(View view, int i2) {
            int i3 = this.f67373toq;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.jp0y(view);
        }

        @Override // androidx.customview.widget.C0779q.zy
        /* JADX INFO: renamed from: s */
        public void mo3755s(@lvui View view, int i2) {
            this.f67373toq = i2;
            this.f23941k = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.C0779q.zy
        public int toq(@lvui View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.C0779q.zy
        public void x2(@lvui View view, float f2, float f3) {
            int i2;
            boolean z2;
            zy zyVar;
            this.f67373toq = -1;
            int width = view.getWidth();
            if (n7h(view, f2)) {
                int left = view.getLeft();
                int i3 = this.f23941k;
                i2 = left < i3 ? i3 - width : i3 + width;
                z2 = true;
            } else {
                i2 = this.f23941k;
                z2 = false;
            }
            if (SwipeDismissBehavior.this.f23934k.m3742c(i2, view.getTop())) {
                C0683f.mbx(view, new RunnableC3938q(view, z2));
            } else {
                if (!z2 || (zyVar = SwipeDismissBehavior.this.f67371toq) == null) {
                    return;
                }
                zyVar.mo14111k(view);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$q */
    private class RunnableC3938q implements Runnable {

        /* JADX INFO: renamed from: k */
        private final View f23942k;

        /* JADX INFO: renamed from: q */
        private final boolean f23944q;

        RunnableC3938q(View view, boolean z2) {
            this.f23942k = view;
            this.f23944q = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            zy zyVar;
            C0779q c0779q = SwipeDismissBehavior.this.f23934k;
            if (c0779q != null && c0779q.kja0(true)) {
                C0683f.mbx(this.f23942k, this);
            } else {
                if (!this.f23944q || (zyVar = SwipeDismissBehavior.this.f67371toq) == null) {
                    return;
                }
                zyVar.mo14111k(this.f23942k);
            }
        }
    }

    class toq implements fn3e {
        toq() {
        }

        @Override // androidx.core.view.accessibility.fn3e
        public boolean perform(@lvui View view, @dd fn3e.AbstractC0648k abstractC0648k) {
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.jp0y(view)) {
                return false;
            }
            boolean z3 = C0683f.m3159e(view) == 1;
            int i2 = SwipeDismissBehavior.this.f23933g;
            if ((i2 == 0 && z3) || (i2 == 1 && !z3)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            C0683f.gc3c(view, width);
            view.setAlpha(0.0f);
            zy zyVar = SwipeDismissBehavior.this.f67371toq;
            if (zyVar != null) {
                zyVar.mo14111k(view);
            }
            return true;
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo14111k(View view);

        void toq(int i2);
    }

    static int d3(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }

    static float eqxt(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    static float gvn7(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    private void hyr(View view) {
        C0683f.yl(view, 1048576);
        if (jp0y(view)) {
            C0683f.ixz(view, ki.C0656k.f50717o1t, null, new toq());
        }
    }

    private void oc(ViewGroup viewGroup) {
        if (this.f23934k == null) {
            this.f23934k = this.f23935n ? C0779q.m3735h(viewGroup, this.f23937q, this.f23936p) : C0779q.cdj(viewGroup, this.f23936p);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean a9(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        C0779q c0779q = this.f23934k;
        if (c0779q == null) {
            return false;
        }
        c0779q.lvui(motionEvent);
        return true;
    }

    public int d2ok() {
        C0779q c0779q = this.f23934k;
        if (c0779q != null) {
            return c0779q.fti();
        }
        return 0;
    }

    public void dd(float f2) {
        this.f23938s = gvn7(0.0f, f2, 1.0f);
    }

    public boolean jp0y(@lvui View view) {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m14109l(float f2) {
        this.f23939y = gvn7(0.0f, f2, 1.0f);
    }

    @dd
    @yz
    public zy lvui() {
        return this.f67371toq;
    }

    public void n5r1(int i2) {
        this.f23933g = i2;
    }

    public void ncyb(float f2) {
        this.f23937q = f2;
        this.f23935n = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, int i2) {
        boolean zQrj = super.qrj(coordinatorLayout, v2, i2);
        if (C0683f.m3157c(v2) == 0) {
            C0683f.o05(v2, 1);
            hyr(v2);
        }
        return zQrj;
    }

    /* JADX INFO: renamed from: r */
    public void m14110r(float f2) {
        this.f67370f7l8 = gvn7(0.0f, f2, 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean x2(@lvui CoordinatorLayout coordinatorLayout, @lvui V v2, @lvui MotionEvent motionEvent) {
        boolean zJp0y = this.f67372zy;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zJp0y = coordinatorLayout.jp0y(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f67372zy = zJp0y;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f67372zy = false;
        }
        if (!zJp0y) {
            return false;
        }
        oc(coordinatorLayout);
        return this.f23934k.lrht(motionEvent);
    }

    public void x9kr(@dd zy zyVar) {
        this.f67371toq = zyVar;
    }
}
