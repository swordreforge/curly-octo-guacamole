package miuix.appcompat.internal.view.menu.action;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import java.lang.reflect.Method;
import miuix.appcompat.internal.app.widget.ActionBarOverlayLayout;
import miuix.appcompat.internal.view.menu.ExpandedMenuBlurView;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.core.util.ld6;
import miuix.internal.util.C7162g;
import miuix.internal.util.n7h;
import zuf.x2;

/* JADX INFO: loaded from: classes3.dex */
public class PhoneActionMenuView extends ActionMenuView {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int[] f86986ab = {R.attr.background, toq.C6055q.dmw0, toq.C6055q.ip4r};
    private static final int bb = 700;
    private static final int bp = 740;
    private static final int bv = 1000;

    /* JADX INFO: renamed from: a */
    private int f39432a;

    /* JADX INFO: renamed from: b */
    private int f39433b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f86987bo;

    /* JADX INFO: renamed from: c */
    private int f39434c;

    /* JADX INFO: renamed from: d */
    private final int f39435d;

    /* JADX INFO: renamed from: e */
    private int f39436e;

    /* JADX INFO: renamed from: f */
    private Drawable f39437f;

    /* JADX INFO: renamed from: h */
    private View f39438h;

    /* JADX INFO: renamed from: i */
    private ExpandedMenuBlurView f39439i;

    /* JADX INFO: renamed from: j */
    private Rect f39440j;

    /* JADX INFO: renamed from: l */
    private Drawable f39441l;

    /* JADX INFO: renamed from: m */
    private int f39442m;

    /* JADX INFO: renamed from: o */
    private int f39443o;

    /* JADX INFO: renamed from: p */
    private View f39444p;

    /* JADX INFO: renamed from: r */
    private Drawable f39445r;

    /* JADX INFO: renamed from: s */
    private Context f39446s;

    /* JADX INFO: renamed from: t */
    private toq f39447t;

    /* JADX INFO: renamed from: u */
    private int f39448u;

    /* JADX INFO: renamed from: v */
    private int f39449v;

    /* JADX INFO: renamed from: w */
    private int f39450w;

    /* JADX INFO: renamed from: x */
    private int f39451x;

    /* JADX INFO: renamed from: z */
    private zy f39452z;

    private enum toq {
        Collapsed,
        Expanding,
        Expanded,
        Collapsing
    }

    private class zy implements Animator.AnimatorListener, View.OnClickListener {

        /* JADX INFO: renamed from: k */
        private AnimatorSet f39455k;

        /* JADX INFO: renamed from: n */
        private ActionBarOverlayLayout f39456n;

        /* JADX INFO: renamed from: q */
        private AnimatorSet f39457q;

        private zy() {
        }

        /* JADX INFO: renamed from: n */
        private void m25300n(boolean z2) {
            if (z2) {
                this.f39456n.getContentView().setImportantForAccessibility(0);
            } else {
                this.f39456n.getContentView().setImportantForAccessibility(4);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m25301g(ActionBarOverlayLayout actionBarOverlayLayout) {
            toq(actionBarOverlayLayout);
            this.f39457q.cancel();
            this.f39455k.cancel();
            this.f39455k.start();
        }

        /* JADX INFO: renamed from: k */
        public void m25302k() {
            AnimatorSet animatorSet = this.f39457q;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f39457q.cancel();
            }
            AnimatorSet animatorSet2 = this.f39455k;
            if (animatorSet2 == null || !animatorSet2.isRunning()) {
                return;
            }
            this.f39455k.cancel();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (PhoneActionMenuView.this.f39447t == toq.Expanding || PhoneActionMenuView.this.f39447t == toq.Expanded) {
                PhoneActionMenuView.this.setValue(0.0f);
                m25300n(false);
            } else if (PhoneActionMenuView.this.f39447t == toq.Collapsing || PhoneActionMenuView.this.f39447t == toq.Collapsed) {
                PhoneActionMenuView.this.setValue(1.0f);
                m25300n(true);
            }
            PhoneActionMenuView.this.postInvalidateOnAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PhoneActionMenuView.this.f39444p != null) {
                if (PhoneActionMenuView.this.f39444p.getTranslationY() == 0.0f) {
                    PhoneActionMenuView.this.f39447t = toq.Expanded;
                    m25300n(false);
                } else if (PhoneActionMenuView.this.f39444p.getTranslationY() == PhoneActionMenuView.this.getMeasuredHeight()) {
                    PhoneActionMenuView.this.f39447t = toq.Collapsed;
                    m25300n(true);
                    PhoneActionMenuView.this.f39438h.setBackground(PhoneActionMenuView.this.f39437f);
                }
            }
            PhoneActionMenuView.this.postInvalidateOnAnimation();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PhoneActionMenuView.this.f39447t == toq.Expanded) {
                PhoneActionMenuView.this.getPresenter().hb(true);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m25303q() {
            try {
                Method declaredMethod = Class.forName("android.animation.AnimatorSet").getDeclaredMethod("reverse", new Class[0]);
                if (this.f39455k.isRunning()) {
                    declaredMethod.invoke(this.f39455k, new Object[0]);
                }
                if (this.f39457q.isRunning()) {
                    declaredMethod.invoke(this.f39457q, new Object[0]);
                }
            } catch (Exception e2) {
                Log.e("PhoneActionMenuView", "reverse: ", e2);
            }
        }

        public void toq(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.f39456n = actionBarOverlayLayout;
            if (this.f39455k == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(PhoneActionMenuView.this, "Value", 1.0f, 0.0f), actionBarOverlayLayout.wvg(this).toq());
                animatorSet.setDuration(PhoneActionMenuView.this.getResources().getInteger(R.integer.config_shortAnimTime));
                animatorSet.setInterpolator(new x2());
                animatorSet.addListener(this);
                this.f39455k = animatorSet;
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(PhoneActionMenuView.this, "Value", 0.0f, 1.0f), actionBarOverlayLayout.wvg(null).m25153k());
                animatorSet2.setDuration(PhoneActionMenuView.this.getResources().getInteger(R.integer.config_shortAnimTime));
                animatorSet2.setInterpolator(new x2());
                animatorSet2.addListener(this);
                this.f39457q = animatorSet2;
                if (C7162g.m25943k()) {
                    return;
                }
                this.f39455k.setDuration(0L);
                this.f39457q.setDuration(0L);
            }
        }

        public void zy(ActionBarOverlayLayout actionBarOverlayLayout) {
            toq(actionBarOverlayLayout);
            this.f39457q.cancel();
            this.f39455k.cancel();
            this.f39457q.start();
        }
    }

    public PhoneActionMenuView(Context context) {
        this(context, null);
    }

    private void d3(Context context) {
        this.f39442m = context.getResources().getDimensionPixelSize(toq.f7l8.f75410ew);
        this.f39433b = context.getResources().getDimensionPixelSize(toq.f7l8.f75496oki);
        if (this.f39435d != 1) {
            this.f39432a = context.getResources().getDimensionPixelSize(toq.f7l8.f75377b9ub);
            this.f39451x = context.getResources().getDimensionPixelSize(toq.f7l8.f75393cnbm);
            this.f39448u = context.getResources().getDimensionPixelSize(toq.f7l8.f75471m58i);
            this.f86987bo = context.getResources().getDimensionPixelSize(toq.f7l8.f75491o05);
        }
    }

    private boolean fti(View view) {
        return view == this.f39444p || view == this.f39438h;
    }

    private int getActionMenuItemCount() {
        int childCount = getChildCount();
        if (indexOfChild(this.f39444p) != -1) {
            childCount--;
        }
        return indexOfChild(this.f39438h) != -1 ? childCount - 1 : childCount;
    }

    private zy getOverflowMenuViewAnimator() {
        if (this.f39452z == null) {
            this.f39452z = new zy();
        }
        return this.f39452z;
    }

    private void jk() {
        if (this.f39440j == null) {
            this.f39440j = new Rect();
        }
        Drawable drawable = this.f39444p == null ? this.f39437f : this.f39441l;
        if (drawable == null) {
            this.f39440j.setEmpty();
        } else {
            drawable.getPadding(this.f39440j);
        }
    }

    private void oc(Context context, int i2) {
        int i3 = this.f39435d;
        if (i3 == 3) {
            this.f39449v = this.f39432a;
            return;
        }
        if (i3 != 2) {
            this.f39449v = this.f39433b;
            return;
        }
        int i4 = (int) ((i2 * 1.0f) / context.getResources().getDisplayMetrics().density);
        if (i4 >= 700 && i4 < bp) {
            this.f39449v = this.f39451x;
            return;
        }
        if (i4 >= bp && i4 < 1000) {
            this.f39449v = this.f39448u;
        } else if (i4 >= 1000) {
            this.f39449v = this.f86987bo;
        } else {
            this.f39449v = this.f39432a;
        }
    }

    public boolean a9(ActionBarOverlayLayout actionBarOverlayLayout) {
        toq toqVar = this.f39447t;
        toq toqVar2 = toq.Collapsing;
        if (toqVar == toqVar2 || toqVar == toq.Collapsed) {
            return false;
        }
        zy overflowMenuViewAnimator = getOverflowMenuViewAnimator();
        if (toqVar == toq.Expanded) {
            this.f39447t = toqVar2;
            overflowMenuViewAnimator.zy(actionBarOverlayLayout);
            return true;
        }
        if (toqVar != toq.Expanding) {
            return true;
        }
        overflowMenuViewAnimator.m25303q();
        return true;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: g */
    public void mo25100g(boolean z2) {
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        int iIndexOfChild = indexOfChild(this.f39444p);
        int iIndexOfChild2 = indexOfChild(this.f39438h);
        if (i3 == 0) {
            if (iIndexOfChild != -1) {
                return iIndexOfChild;
            }
            if (iIndexOfChild2 != -1) {
                return iIndexOfChild2;
            }
        } else if (i3 == 1 && iIndexOfChild != -1 && iIndexOfChild2 != -1) {
            return iIndexOfChild2;
        }
        int i4 = 0;
        while (i4 < i2) {
            if (i4 != iIndexOfChild && i4 != iIndexOfChild2) {
                int i5 = i4 < iIndexOfChild ? i4 + 1 : i4;
                if (i4 < iIndexOfChild2) {
                    i5++;
                }
                if (i5 == i3) {
                    return i4;
                }
            }
            i4++;
        }
        return super.getChildDrawingOrder(i2, i3);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public int getCollapsedHeight() {
        int i2 = this.f39436e;
        if (i2 == 0) {
            return 0;
        }
        return (i2 + this.f39440j.top) - this.f39443o;
    }

    public boolean gvn7(ActionBarOverlayLayout actionBarOverlayLayout) {
        toq toqVar = this.f39447t;
        toq toqVar2 = toq.Expanding;
        if (toqVar == toqVar2 || toqVar == toq.Expanded || this.f39444p == null) {
            return false;
        }
        this.f39438h.setBackground(this.f39441l);
        zy overflowMenuViewAnimator = getOverflowMenuViewAnimator();
        if (toqVar == toq.Collapsed) {
            this.f39447t = toqVar2;
            overflowMenuViewAnimator.m25301g(actionBarOverlayLayout);
        } else if (toqVar == toq.Collapsing) {
            overflowMenuViewAnimator.m25303q();
        }
        postInvalidateOnAnimation();
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        return true;
    }

    public boolean jp0y() {
        toq toqVar = this.f39447t;
        return toqVar == toq.Expanding || toqVar == toq.Expanded;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: k */
    public boolean mo25264k(int i2) {
        ActionMenuView.toq toqVar;
        View childAt = getChildAt(i2);
        return (!fti(childAt) && ((toqVar = (ActionMenuView.toq) childAt.getLayoutParams()) == null || !toqVar.f39413k)) && super.mo25264k(i2);
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: n */
    public boolean mo25102n() {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d3(this.f39446s);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i4 - i2;
        int i8 = i5 - i3;
        View view = this.f39444p;
        if (view != null) {
            int measuredHeight = view.getMeasuredHeight();
            n7h.kja0(this, this.f39444p, 0, 0, i7, measuredHeight);
            i6 = measuredHeight - this.f39440j.top;
        } else {
            i6 = 0;
        }
        n7h.kja0(this, this.f39438h, 0, i6, i7, i8);
        int childCount = getChildCount();
        int measuredWidth = (i7 - this.f39434c) >> 1;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!fti(childAt)) {
                n7h.kja0(this, childAt, measuredWidth, i6, measuredWidth + childAt.getMeasuredWidth(), i8);
                measuredWidth += childAt.getMeasuredWidth() + this.f39449v;
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        this.f39450w = actionMenuItemCount;
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.f39436e = 0;
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        this.f39442m = Math.min(size / this.f39450w, this.f39442m);
        oc(getContext(), size);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f39442m, Integer.MIN_VALUE);
        int iMin = 0;
        int measuredHeight = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!fti(childAt)) {
                measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i3, 0);
                iMin += Math.min(childAt.getMeasuredWidth(), this.f39442m);
                measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight());
            }
        }
        int i5 = this.f39449v;
        int i6 = this.f39450w;
        if ((i5 * (i6 - 1)) + iMin > size) {
            this.f39449v = 0;
        }
        int i7 = iMin + (this.f39449v * (i6 - 1));
        this.f39434c = i7;
        this.f39436e = measuredHeight;
        View view = this.f39444p;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = ld6.ld6(this.f39446s);
            marginLayoutParams.bottomMargin = this.f39436e;
            measureChildWithMargins(this.f39444p, i2, 0, i3, 0);
            Math.max(i7, this.f39444p.getMeasuredWidth());
            measuredHeight += this.f39444p.getMeasuredHeight();
            toq toqVar = this.f39447t;
            if (toqVar == toq.Expanded) {
                this.f39444p.setTranslationY(0.0f);
            } else if (toqVar == toq.Collapsed) {
                this.f39444p.setTranslationY(measuredHeight);
            }
        }
        if (this.f39444p == null) {
            measuredHeight += this.f39440j.top;
        }
        this.f39438h.setBackground(this.f39447t == toq.Collapsed ? this.f39437f : this.f39441l);
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float y3 = motionEvent.getY();
        View view = this.f39444p;
        return y3 > (view == null ? 0.0f : view.getTranslationY()) || super.onTouchEvent(motionEvent);
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25103q() {
        return false;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (this.f39437f != drawable) {
            this.f39437f = drawable;
            jk();
        }
    }

    @Override // miuix.view.toq
    public void setEnableBlur(boolean z2) {
    }

    public void setOverflowMenuView(View view) {
        ExpandedMenuBlurView expandedMenuBlurView = this.f39439i;
        if (((expandedMenuBlurView == null || expandedMenuBlurView.getChildCount() <= 1) ? null : this.f39439i.getChildAt(1)) != view) {
            View view2 = this.f39444p;
            if (view2 != null) {
                if (view2.getAnimation() != null) {
                    this.f39444p.clearAnimation();
                }
                ExpandedMenuBlurView expandedMenuBlurView2 = this.f39439i;
                if (expandedMenuBlurView2 != null) {
                    expandedMenuBlurView2.removeAllViews();
                    removeView(this.f39439i);
                    this.f39439i = null;
                }
            }
            if (view != null) {
                if (this.f39439i == null) {
                    this.f39439i = new ExpandedMenuBlurView(this.f39446s);
                }
                this.f39439i.addView(view);
                addView(this.f39439i);
            }
            this.f39444p = this.f39439i;
            jk();
        }
    }

    @Override // miuix.view.toq
    public void setSupportBlur(boolean z2) {
    }

    public void setValue(float f2) {
        View view = this.f39444p;
        if (view == null) {
            return;
        }
        view.setTranslationY(f2 * getMeasuredHeight());
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void t8r(int i2, float f2, boolean z2, boolean z3) {
        if (C7162g.m25943k()) {
            setAlpha(m25291p(f2, z2, z3));
        }
        float fLd6 = ld6(f2, z2, z3);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (!fti(childAt)) {
                childAt.setTranslationY(fLd6);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: y */
    public boolean mo25265y() {
        return getChildAt(0) == this.f39438h || getChildAt(1) == this.f39438h;
    }

    @Override // miuix.view.toq
    public boolean zy() {
        return false;
    }

    public PhoneActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39447t = toq.Collapsed;
        this.f39442m = 0;
        this.f39433b = 0;
        this.f39432a = 0;
        this.f39451x = 0;
        this.f39448u = 0;
        this.f86987bo = 0;
        this.f39449v = 0;
        this.f39450w = 0;
        super.setBackground(null);
        this.f39446s = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f86986ab);
        this.f39437f = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f39441l = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f39443o = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        jk();
        View view = new View(context);
        this.f39438h = view;
        addView(view);
        setChildrenDrawingOrderEnabled(true);
        this.f39435d = miuix.os.zy.m26179k(context);
        d3(context);
    }
}
