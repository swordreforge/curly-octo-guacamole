package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import gb.toq;
import miuix.appcompat.app.AbstractC6946k;
import miuix.internal.util.C7162g;

/* JADX INFO: loaded from: classes3.dex */
public class ActionBarMovableLayout extends ActionBarOverlayLayout {
    public static final int afw = -1;
    public static final int eht = 1;
    private static final String ls9 = ActionBarMovableLayout.class.getSimpleName();
    public static final int n5ij = 800;
    public static final int oyp = 0;
    private static final boolean qns = false;
    private int cw14;
    private int d1cy;
    private int ei;
    private float hp;
    private OverScroller k6e;
    private float mjvl;
    private final int ndjo;
    private final int q7k9;
    private boolean s8y;
    private final int th6;
    private VelocityTracker ut;
    private View vb6;
    private AbstractC6946k.toq wh6;
    private int wra;
    private boolean xhv;
    private int xk5;
    private int xqx;
    private int xy8;
    private boolean zm;
    private int zr5t;
    private boolean zsl;

    public ActionBarMovableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.xy8 = -1;
        this.d1cy = -1;
        this.zr5t = -1;
        this.wra = 8;
        this.xhv = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.f76233zp, toq.C6055q.f34938z, 0);
        if (C7162g.m25943k()) {
            this.xqx = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.ki.f34857x, 0);
        }
        this.d1cy = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.ki.f76057ch, -1);
        this.zr5t = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.ki.f76152nmn5, -1);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.th6 = viewConfiguration.getScaledTouchSlop();
        this.k6e = new OverScroller(context);
        this.q7k9 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ndjo = viewConfiguration.getScaledMaximumFlingVelocity();
        setOverScrollMode(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    private void m25132b() {
        VelocityTracker velocityTracker = this.ut;
        if (velocityTracker == null) {
            this.ut = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void bf2() {
        if (this.ut == null) {
            this.ut = VelocityTracker.obtain();
        }
    }

    private void ch(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & 65280) >> 8;
        if (motionEvent.getPointerId(action) == this.xk5) {
            int i2 = action == 0 ? 1 : 0;
            this.mjvl = (int) motionEvent.getY(i2);
            this.xk5 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.ut;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean i1() {
        int visibility;
        ek5k();
        View view = this.vb6;
        if (view == null || (visibility = view.getVisibility()) == this.wra) {
            return false;
        }
        this.wra = visibility;
        return true;
    }

    private void nmn5() {
        VelocityTracker velocityTracker = this.ut;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ut = null;
        }
    }

    private boolean y9n(View view, int i2, int i3) {
        if (view == null) {
            return false;
        }
        int y3 = (int) view.getY();
        int x3 = (int) view.getX();
        int y4 = (int) (view.getY() + view.getHeight());
        int x4 = (int) (view.getX() + view.getWidth());
        if (view == this.vb6) {
            int top = this.f39087q.getTop();
            y3 += top;
            y4 += top;
        }
        return i3 >= y3 && i3 < y4 && i2 >= x3 && i2 < x4;
    }

    /* JADX INFO: renamed from: a */
    protected void m25133a(float f2) {
        m25135o(f2);
        AbstractC6946k.toq toqVar = this.wh6;
        if (toqVar != null) {
            toqVar.m25021q(this.xy8, f2 / this.d1cy);
        }
    }

    protected float a98o(float f2) {
        float f3 = (((-this.xqx) + f2) - this.d1cy) - this.ei;
        ek5k();
        View view = this.vb6;
        return (view == null || view.getVisibility() != 0) ? f3 : f3 - this.vb6.getHeight();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (!this.k6e.computeScrollOffset()) {
            if (this.zm) {
                t8iq();
                this.zm = false;
                return;
            }
            return;
        }
        int i2 = this.cw14;
        int currY = this.k6e.getCurrY();
        if (i2 != currY) {
            overScrollBy(0, currY - i2, 0, this.cw14, 0, getScrollRange(), 0, getOverScrollDistance(), true);
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    protected int computeVerticalScrollExtent() {
        return 0;
    }

    @Override // android.view.View
    protected int computeVerticalScrollRange() {
        return getScrollRange();
    }

    void ek5k() {
        this.vb6 = this.f39087q.getTabContainer();
    }

    public int getOverScrollDistance() {
        if (C7162g.m25943k()) {
            return this.xqx;
        }
        return 0;
    }

    public int getScrollRange() {
        return this.d1cy;
    }

    public int getScrollStart() {
        return this.ei;
    }

    protected boolean lv5(MotionEvent motionEvent) {
        int i2;
        AbstractC6946k.toq toqVar;
        AbstractC6946k.toq toqVar2;
        int i3 = this.xk5;
        if (i3 == -1) {
            return false;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
        if (iFindPointerIndex == -1) {
            Log.w(ls9, "invalid pointer index");
            return false;
        }
        float x3 = motionEvent.getX(iFindPointerIndex);
        float y3 = motionEvent.getY(iFindPointerIndex);
        int i4 = (int) (y3 - this.mjvl);
        int iAbs = Math.abs(i4);
        int i5 = (int) x3;
        int i6 = (int) y3;
        boolean z2 = (y9n(this.f39077g, i5, i6) || y9n(this.vb6, i5, i6)) && iAbs > this.th6 && iAbs > ((int) Math.abs(x3 - this.hp)) && ((i2 = this.cw14) != 0 ? i4 <= 0 || i2 < getOverScrollDistance() || (toqVar = this.wh6) == null || !toqVar.toq() : i4 >= 0 && ((toqVar2 = this.wh6) == null || !toqVar2.toq()));
        if (z2) {
            this.mjvl = y3;
            this.hp = x3;
            this.xy8 = i4 > 0 ? 1 : 0;
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: m */
    protected int m25134m() {
        VelocityTracker velocityTracker = this.ut;
        velocityTracker.computeCurrentVelocity(1000, this.ndjo);
        return (int) velocityTracker.getYVelocity(this.xk5);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        if (view != this.f39077g) {
            super.measureChildWithMargins(view, i2, i3, i4, i5);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, ((((((getPaddingTop() + getPaddingBottom()) + marginLayoutParams.bottomMargin) + this.f39081k.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) this.f39081k.getLayoutParams()).topMargin) - getScrollRange()) - getOverScrollDistance()) - this.ei, marginLayoutParams.height));
    }

    /* JADX INFO: renamed from: o */
    protected void m25135o(float f2) {
        float fA98o = a98o(f2);
        this.f39077g.setTranslationY(fA98o);
        ek5k();
        View view = this.vb6;
        if (view != null) {
            view.setTranslationY(fA98o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.getContentMask()
            r1 = 0
            if (r0 == 0) goto Le
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Le
            return r1
        Le:
            int r0 = r6.getAction()
            r2 = 2
            r3 = 1
            if (r0 != r2) goto L1b
            boolean r4 = r5.s8y
            if (r4 == 0) goto L1b
            return r3
        L1b:
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L4e
            if (r0 == r3) goto L42
            if (r0 == r2) goto L2e
            r2 = 3
            if (r0 == r2) goto L42
            r1 = 6
            if (r0 == r1) goto L2a
            goto L6d
        L2a:
            r5.ch(r6)
            goto L6d
        L2e:
            boolean r0 = r5.lv5(r6)
            if (r0 == 0) goto L6d
            r5.s8y = r3
            r5.bf2()
            android.view.VelocityTracker r0 = r5.ut
            r0.addMovement(r6)
            r5.zp()
            goto L6d
        L42:
            r5.s8y = r1
            r6 = -1
            r5.xk5 = r6
            r5.nmn5()
            r5.m25136x()
            goto L6d
        L4e:
            float r0 = r6.getY()
            r5.mjvl = r0
            float r0 = r6.getX()
            r5.hp = r0
            int r0 = r6.getPointerId(r1)
            r5.xk5 = r0
            r5.m25132b()
            android.view.VelocityTracker r0 = r5.ut
            r0.addMovement(r6)
            android.widget.OverScroller r6 = r5.k6e
            r6.forceFinished(r3)
        L6d:
            boolean r6 = r5.s8y
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarMovableLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // miuix.appcompat.internal.app.widget.ActionBarOverlayLayout, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = !this.zsl || i1();
        if (!this.zsl) {
            if (this.zr5t < 0) {
                this.zr5t = this.d1cy;
            }
            this.cw14 = this.zr5t;
            this.zsl = true;
        }
        if (z3) {
            m25135o(this.cw14);
        }
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        AbstractC6946k.toq toqVar;
        m25133a(i3);
        this.cw14 = i3;
        if (i3 == 0 && z3) {
            if (Math.abs(m25134m()) <= this.q7k9 * 2 || (toqVar = this.wh6) == null) {
                return;
            }
            toqVar.m25020n((-r1) * 0.2f, 500);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    @Override // miuix.appcompat.internal.app.widget.ActionBarOverlayLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.app.widget.ActionBarMovableLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    protected boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        int overScrollMode = getOverScrollMode();
        boolean z3 = true;
        int i10 = i5 + i3;
        if (!(overScrollMode == 0 || (overScrollMode == 1 && (computeVerticalScrollRange() > computeVerticalScrollExtent())))) {
            i9 = 0;
        }
        int i11 = i9 + i7;
        if (i10 > i11) {
            i10 = i11;
        } else if (i10 < 0) {
            i10 = 0;
        } else {
            z3 = false;
        }
        onOverScrolled(0, i10, false, z3);
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
    }

    public void setInitialMotionY(int i2) {
        this.zr5t = i2;
    }

    public void setMotionY(int i2) {
        this.cw14 = i2;
        m25133a(i2);
    }

    public void setOnScrollListener(AbstractC6946k.toq toqVar) {
        this.wh6 = toqVar;
    }

    public void setOverScrollDistance(int i2) {
        if (C7162g.m25943k()) {
            this.xqx = i2;
        }
    }

    public void setScrollRange(int i2) {
        this.d1cy = i2;
    }

    public void setScrollStart(int i2) {
        this.ei = i2;
    }

    public void setSpringBackEnabled(boolean z2) {
        this.xhv = z2;
    }

    protected void t8iq() {
        if (this.xhv) {
            int scrollRange = getScrollRange();
            int i2 = this.cw14;
            this.k6e.startScroll(0, i2, 0, i2 > scrollRange / 2 ? scrollRange - i2 : -i2, n5ij);
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: x */
    protected void m25136x() {
        this.xy8 = -1;
        AbstractC6946k.toq toqVar = this.wh6;
        if (toqVar != null) {
            toqVar.m25019k();
        }
    }

    protected void yz(int i2) {
        int overScrollDistance = getOverScrollDistance();
        this.k6e.fling(0, this.cw14, 0, i2, 0, 0, 0, getScrollRange(), 0, overScrollDistance);
        this.zm = true;
        postInvalidate();
    }

    protected void zp() {
        AbstractC6946k.toq toqVar = this.wh6;
        if (toqVar != null) {
            toqVar.zy();
        }
    }
}
