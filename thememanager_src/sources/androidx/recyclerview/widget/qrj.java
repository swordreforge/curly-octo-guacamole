package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import zy.yz;

/* JADX INFO: compiled from: FastScroller.java */
/* JADX INFO: loaded from: classes.dex */
@yz
class qrj extends RecyclerView.kja0 implements RecyclerView.InterfaceC1049i {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f52259a9 = 1;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int f52260d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f52261d3 = 2;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f52262dd = 1500;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f52263eqxt = 1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f52264fti = 2;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f52265gvn7 = 1;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f52267jk = 0;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f52268jp0y = 0;

    /* JADX INFO: renamed from: l */
    private static final int f6073l = 255;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final int f52269lvui = 3;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final int f52271ncyb = 500;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f52272oc = 0;

    /* JADX INFO: renamed from: r */
    private static final int f6074r = 500;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final int f52273x9kr = 1200;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final StateListDrawable f52275f7l8;

    /* JADX INFO: renamed from: g */
    private final int f6075g;

    /* JADX INFO: renamed from: h */
    @yz
    float f6076h;

    /* JADX INFO: renamed from: k */
    private final int f6078k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @yz
    int f52279kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @yz
    int f52280ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private final RecyclerView.fn3e f52281mcp;

    /* JADX INFO: renamed from: n */
    private final int f6079n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @yz
    int f52282n7h;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    final ValueAnimator f52284o1t;

    /* JADX INFO: renamed from: p */
    private final int f6080p;

    /* JADX INFO: renamed from: q */
    final Drawable f6081q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @yz
    float f52285qrj;

    /* JADX INFO: renamed from: s */
    private final int f6082s;

    /* JADX INFO: renamed from: t */
    private final Runnable f6083t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private RecyclerView f52286t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f52287toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    int f52288wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @yz
    int f52289x2;

    /* JADX INFO: renamed from: y */
    private final Drawable f6084y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final StateListDrawable f52291zy;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final int[] f52270n5r1 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final int[] f52266hyr = new int[0];

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f52274cdj = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f52278ki = 0;

    /* JADX INFO: renamed from: i */
    private boolean f6077i = false;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f52276fn3e = false;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f52290zurt = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f52283ni7 = 0;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private final int[] f52277fu4 = new int[2];

    /* JADX INFO: renamed from: z */
    private final int[] f6085z = new int[2];

    /* JADX INFO: renamed from: androidx.recyclerview.widget.qrj$k */
    /* JADX INFO: compiled from: FastScroller.java */
    class RunnableC1109k implements Runnable {
        RunnableC1109k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qrj.this.fn3e(500);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.qrj$q */
    /* JADX INFO: compiled from: FastScroller.java */
    private class C1110q implements ValueAnimator.AnimatorUpdateListener {
        C1110q() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            qrj.this.f52291zy.setAlpha(iFloatValue);
            qrj.this.f6081q.setAlpha(iFloatValue);
            qrj.this.m5105t();
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    class toq extends RecyclerView.fn3e {
        toq() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            qrj.this.gvn7(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* JADX INFO: compiled from: FastScroller.java */
    private class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private boolean f6089k = false;

        zy() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6089k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6089k) {
                this.f6089k = false;
                return;
            }
            if (((Float) qrj.this.f52284o1t.getAnimatedValue()).floatValue() == 0.0f) {
                qrj qrjVar = qrj.this;
                qrjVar.f52288wvg = 0;
                qrjVar.a9(0);
            } else {
                qrj qrjVar2 = qrj.this;
                qrjVar2.f52288wvg = 2;
                qrjVar2.m5105t();
            }
        }
    }

    qrj(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f52284o1t = valueAnimatorOfFloat;
        this.f52288wvg = 0;
        this.f6083t = new RunnableC1109k();
        this.f52281mcp = new toq();
        this.f52291zy = stateListDrawable;
        this.f6081q = drawable;
        this.f52275f7l8 = stateListDrawable2;
        this.f6084y = drawable2;
        this.f6079n = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f6075g = Math.max(i2, drawable.getIntrinsicWidth());
        this.f6082s = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f6080p = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f6078k = i3;
        this.f52287toq = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new zy());
        valueAnimatorOfFloat.addUpdateListener(new C1110q());
        m5104p(recyclerView);
    }

    private void d3(float f2) {
        int[] iArrKi = ki();
        float fMax = Math.max(iArrKi[0], Math.min(iArrKi[1], f2));
        if (Math.abs(this.f52289x2 - fMax) < 2.0f) {
            return;
        }
        int iJk = jk(this.f52285qrj, fMax, iArrKi, this.f52286t8r.computeVerticalScrollRange(), this.f52286t8r.computeVerticalScrollOffset(), this.f52278ki);
        if (iJk != 0) {
            this.f52286t8r.scrollBy(0, iJk);
        }
        this.f52285qrj = fMax;
    }

    private void fti() {
        this.f52286t8r.addItemDecoration(this);
        this.f52286t8r.addOnItemTouchListener(this);
        this.f52286t8r.addOnScrollListener(this.f52281mcp);
    }

    private boolean fu4() {
        return C0683f.m3159e(this.f52286t8r) == 1;
    }

    private int jk(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    private int[] ki() {
        int[] iArr = this.f52277fu4;
        int i2 = this.f52287toq;
        iArr[0] = i2;
        iArr[1] = this.f52278ki - i2;
        return iArr;
    }

    private int[] kja0() {
        int[] iArr = this.f6085z;
        int i2 = this.f52287toq;
        iArr[0] = i2;
        iArr[1] = this.f52274cdj - i2;
        return iArr;
    }

    private void ld6() {
        this.f52286t8r.removeCallbacks(this.f6083t);
    }

    private void mcp(int i2) {
        ld6();
        this.f52286t8r.postDelayed(this.f6083t, i2);
    }

    private void n7h(Canvas canvas) {
        int i2 = this.f52274cdj;
        int i3 = this.f6079n;
        int i4 = i2 - i3;
        int i5 = this.f52289x2;
        int i6 = this.f52280ld6;
        int i7 = i5 - (i6 / 2);
        this.f52291zy.setBounds(0, 0, i3, i6);
        this.f6081q.setBounds(0, 0, this.f6075g, this.f52278ki);
        if (!fu4()) {
            canvas.translate(i4, 0.0f);
            this.f6081q.draw(canvas);
            canvas.translate(0.0f, i7);
            this.f52291zy.draw(canvas);
            canvas.translate(-i4, -i7);
            return;
        }
        this.f6081q.draw(canvas);
        canvas.translate(this.f6079n, i7);
        canvas.scale(-1.0f, 1.0f);
        this.f52291zy.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f6079n, -i7);
    }

    private void qrj(Canvas canvas) {
        int i2 = this.f52278ki;
        int i3 = this.f6082s;
        int i4 = this.f52279kja0;
        int i5 = this.f52282n7h;
        this.f52275f7l8.setBounds(0, 0, i5, i3);
        this.f6084y.setBounds(0, 0, this.f52274cdj, this.f6080p);
        canvas.translate(0.0f, i2 - i3);
        this.f6084y.draw(canvas);
        canvas.translate(i4 - (i5 / 2), 0.0f);
        this.f52275f7l8.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    private void x2() {
        this.f52286t8r.removeItemDecoration(this);
        this.f52286t8r.removeOnItemTouchListener(this);
        this.f52286t8r.removeOnScrollListener(this.f52281mcp);
        ld6();
    }

    private void zurt(float f2) {
        int[] iArrKja0 = kja0();
        float fMax = Math.max(iArrKja0[0], Math.min(iArrKja0[1], f2));
        if (Math.abs(this.f52279kja0 - fMax) < 2.0f) {
            return;
        }
        int iJk = jk(this.f6076h, fMax, iArrKja0, this.f52286t8r.computeHorizontalScrollRange(), this.f52286t8r.computeHorizontalScrollOffset(), this.f52274cdj);
        if (iJk != 0) {
            this.f52286t8r.scrollBy(iJk, 0);
        }
        this.f6076h = fMax;
    }

    void a9(int i2) {
        if (i2 == 2 && this.f52290zurt != 2) {
            this.f52291zy.setState(f52270n5r1);
            ld6();
        }
        if (i2 == 0) {
            m5105t();
        } else {
            jp0y();
        }
        if (this.f52290zurt == 2 && i2 != 2) {
            this.f52291zy.setState(f52266hyr);
            mcp(f52273x9kr);
        } else if (i2 == 1) {
            mcp(f52262dd);
        }
        this.f52290zurt = i2;
    }

    @yz
    Drawable cdj() {
        return this.f6084y;
    }

    @yz
    void fn3e(int i2) {
        int i3 = this.f52288wvg;
        if (i3 == 1) {
            this.f52284o1t.cancel();
        } else if (i3 != 2) {
            return;
        }
        this.f52288wvg = 3;
        ValueAnimator valueAnimator = this.f52284o1t;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f52284o1t.setDuration(i2);
        this.f52284o1t.start();
    }

    void gvn7(int i2, int i3) {
        int iComputeVerticalScrollRange = this.f52286t8r.computeVerticalScrollRange();
        int i4 = this.f52278ki;
        this.f6077i = iComputeVerticalScrollRange - i4 > 0 && i4 >= this.f6078k;
        int iComputeHorizontalScrollRange = this.f52286t8r.computeHorizontalScrollRange();
        int i5 = this.f52274cdj;
        boolean z2 = iComputeHorizontalScrollRange - i5 > 0 && i5 >= this.f6078k;
        this.f52276fn3e = z2;
        boolean z3 = this.f6077i;
        if (!z3 && !z2) {
            if (this.f52290zurt != 0) {
                a9(0);
                return;
            }
            return;
        }
        if (z3) {
            float f2 = i4;
            this.f52289x2 = (int) ((f2 * (i3 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.f52280ld6 = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (this.f52276fn3e) {
            float f3 = i5;
            this.f52279kja0 = (int) ((f3 * (i2 + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f52282n7h = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = this.f52290zurt;
        if (i6 == 0 || i6 == 1) {
            a9(1);
        }
    }

    @yz
    /* JADX INFO: renamed from: h */
    Drawable m5102h() {
        return this.f52275f7l8;
    }

    @yz
    /* JADX INFO: renamed from: i */
    Drawable m5103i() {
        return this.f6081q;
    }

    public void jp0y() {
        int i2 = this.f52288wvg;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                this.f52284o1t.cancel();
            }
        }
        this.f52288wvg = 1;
        ValueAnimator valueAnimator = this.f52284o1t;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f52284o1t.setDuration(500L);
        this.f52284o1t.setStartDelay(0L);
        this.f52284o1t.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
    /* JADX INFO: renamed from: k */
    public void mo4812k(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent) {
        if (this.f52290zurt == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zO1t = o1t(motionEvent.getX(), motionEvent.getY());
            boolean zM5106z = m5106z(motionEvent.getX(), motionEvent.getY());
            if (zO1t || zM5106z) {
                if (zM5106z) {
                    this.f52283ni7 = 1;
                    this.f6076h = (int) motionEvent.getX();
                } else if (zO1t) {
                    this.f52283ni7 = 2;
                    this.f52285qrj = (int) motionEvent.getY();
                }
                a9(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f52290zurt == 2) {
            this.f52285qrj = 0.0f;
            this.f6076h = 0.0f;
            a9(1);
            this.f52283ni7 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f52290zurt == 2) {
            jp0y();
            if (this.f52283ni7 == 1) {
                zurt(motionEvent.getX());
            }
            if (this.f52283ni7 == 2) {
                d3(motionEvent.getY());
            }
        }
    }

    public boolean ni7() {
        return this.f52290zurt == 2;
    }

    @yz
    boolean o1t(float f2, float f3) {
        if (!fu4() ? f2 >= this.f52274cdj - this.f6079n : f2 <= this.f6079n) {
            int i2 = this.f52289x2;
            int i3 = this.f52280ld6;
            if (f3 >= i2 - (i3 / 2) && f3 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public void m5104p(@zy.dd RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f52286t8r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            x2();
        }
        this.f52286t8r = recyclerView;
        if (recyclerView != null) {
            fti();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: s */
    public void mo4713s(Canvas canvas, RecyclerView recyclerView, RecyclerView.mcp mcpVar) {
        if (this.f52274cdj != this.f52286t8r.getWidth() || this.f52278ki != this.f52286t8r.getHeight()) {
            this.f52274cdj = this.f52286t8r.getWidth();
            this.f52278ki = this.f52286t8r.getHeight();
            a9(0);
        } else if (this.f52288wvg != 0) {
            if (this.f6077i) {
                n7h(canvas);
            }
            if (this.f52276fn3e) {
                qrj(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    void m5105t() {
        this.f52286t8r.invalidate();
    }

    @yz
    Drawable t8r() {
        return this.f52291zy;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
    public boolean toq(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent) {
        int i2 = this.f52290zurt;
        if (i2 == 1) {
            boolean zO1t = o1t(motionEvent.getX(), motionEvent.getY());
            boolean zM5106z = m5106z(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zO1t && !zM5106z) {
                return false;
            }
            if (zM5106z) {
                this.f52283ni7 = 1;
                this.f6076h = (int) motionEvent.getX();
            } else if (zO1t) {
                this.f52283ni7 = 2;
                this.f52285qrj = (int) motionEvent.getY();
            }
            a9(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    @yz
    boolean wvg() {
        return this.f52290zurt == 1;
    }

    @yz
    /* JADX INFO: renamed from: z */
    boolean m5106z(float f2, float f3) {
        if (f3 >= this.f52278ki - this.f6082s) {
            int i2 = this.f52279kja0;
            int i3 = this.f52282n7h;
            if (f2 >= i2 - (i3 / 2) && f2 <= i2 + (i3 / 2)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
    public void zy(boolean z2) {
    }
}
