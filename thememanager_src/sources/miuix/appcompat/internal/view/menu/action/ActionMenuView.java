package miuix.appcompat.internal.view.menu.action;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import miuix.appcompat.internal.view.menu.MenuItemC7036s;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.x2;
import miuix.internal.util.C7162g;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ActionMenuView extends LinearLayout implements f7l8.zy, x2, miuix.view.toq {

    /* JADX INFO: renamed from: g */
    private zy f39407g;

    /* JADX INFO: renamed from: k */
    private miuix.appcompat.internal.view.menu.f7l8 f39408k;

    /* JADX INFO: renamed from: n */
    private ActionMenuPresenter f39409n;

    /* JADX INFO: renamed from: q */
    private boolean f39410q;

    /* JADX INFO: renamed from: y */
    protected boolean f39411y;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.ActionMenuView$k */
    public interface InterfaceC7016k {
        /* JADX INFO: renamed from: q */
        boolean mo25293q();

        boolean zy();
    }

    public static class toq extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: g */
        public boolean f39412g;

        /* JADX INFO: renamed from: k */
        @ViewDebug.ExportedProperty
        public boolean f39413k;

        /* JADX INFO: renamed from: n */
        @ViewDebug.ExportedProperty
        public boolean f39414n;

        /* JADX INFO: renamed from: q */
        @ViewDebug.ExportedProperty
        public boolean f39415q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f86984toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f86985zy;

        public toq(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public toq(toq toqVar) {
            super((LinearLayout.LayoutParams) toqVar);
            this.f39413k = toqVar.f39413k;
        }

        public toq(int i2, int i3) {
            super(i2, i3);
            this.f39413k = false;
        }

        public toq(int i2, int i3, boolean z2) {
            super(i2, i3);
            this.f39413k = z2;
        }
    }

    class zy implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: k */
        boolean f39417k;

        /* JADX INFO: renamed from: n */
        Animator f39418n;

        /* JADX INFO: renamed from: q */
        Animator f39419q;

        public zy() {
        }

        /* JADX INFO: renamed from: k */
        void m25294k() {
            zy();
            Animator animator = this.f39419q;
            if (animator != null) {
                animator.cancel();
                this.f39419q = null;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m25295n(float f2) {
            for (int i2 = 0; i2 < ActionMenuView.this.getChildCount(); i2++) {
                ActionMenuView.this.getChildAt(i2).setTranslationY(f2);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f39419q = null;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f39419q = animator;
        }

        /* JADX INFO: renamed from: q */
        void m25296q() {
            m25294k();
            this.f39417k = true;
            m25295n(0.0f);
            ActionMenuView.this.startLayoutAnimation();
        }

        void toq() {
            m25294k();
            this.f39417k = false;
            this.f39418n.start();
        }

        void zy() {
            if (this.f39418n == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "TranslationY", ActionMenuView.this.getHeight());
                this.f39418n = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(ActionMenuView.this.getResources().getInteger(R.integer.config_shortAnimTime));
                this.f39418n.addListener(this);
            }
        }
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public boolean cdj() {
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof toq);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    public void f7l8(miuix.appcompat.internal.view.menu.f7l8 f7l8Var) {
        this.f39408k = f7l8Var;
    }

    public void fn3e() {
        this.f39407g.toq();
    }

    public void fu4(boolean z2) {
        this.f39411y = z2;
        if (z2) {
            mo25292s();
        } else {
            ni7();
        }
    }

    public abstract int getCollapsedHeight();

    public ActionMenuPresenter getPresenter() {
        return this.f39409n;
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    public int getWindowAnimations() {
        return 0;
    }

    /* JADX INFO: renamed from: h */
    protected boolean m25289h(int i2) {
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        boolean zZy = false;
        if (i2 < getChildCount() && (childAt instanceof InterfaceC7016k)) {
            zZy = false | ((InterfaceC7016k) childAt).zy();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC7016k)) ? zZy : zZy | ((InterfaceC7016k) childAt2).mo25293q();
    }

    /* JADX INFO: renamed from: i */
    public void mo25290i() {
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: k */
    public boolean mo25264k(int i2) {
        View childAt = getChildAt(i2);
        childAt.clearAnimation();
        removeView(childAt);
        return true;
    }

    public boolean ki() {
        return this.f39410q;
    }

    public toq kja0(@lvui View view) {
        toq toqVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        toqVarGenerateDefaultLayoutParams.f39413k = true;
        return toqVarGenerateDefaultLayoutParams;
    }

    protected float ld6(float f2, boolean z2, boolean z3) {
        float collapsedHeight = getCollapsedHeight();
        if (z2 && z3) {
            f2 = ((double) f2) < 0.5d ? f2 * 2.0f : (1.0f - f2) * 2.0f;
        } else if (z3) {
            f2 = 1.0f - f2;
        }
        return f2 * collapsedHeight;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public toq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof toq ? new toq((toq) layoutParams) : generateDefaultLayoutParams();
    }

    protected void ni7() {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f39409n;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo25178q(false);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39409n.m25275c(false);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (getChildCount() == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(i2, i3);
        }
    }

    /* JADX INFO: renamed from: p */
    protected float m25291p(float f2, boolean z2, boolean z3) {
        int i2;
        if (z2 && z3) {
            return 1.0f;
        }
        if (z2) {
            i2 = (int) ((1.0f - f2) * 10.0f);
        } else {
            if (!z3) {
                return 1.0f;
            }
            i2 = (int) (f2 * 10.0f);
        }
        return i2 / 10.0f;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public toq generateLayoutParams(AttributeSet attributeSet) {
        return new toq(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: s */
    protected void mo25292s() {
    }

    public void setOverflowReserved(boolean z2) {
        this.f39410q = z2;
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f39409n = actionMenuPresenter;
    }

    public void t8r(int i2, float f2, boolean z2, boolean z3) {
        if (C7162g.m25943k()) {
            setAlpha(m25291p(f2, z2, z3));
        }
        float fLd6 = ld6(f2, z2, z3);
        if (!z2 || !z3 || getTranslationY() != 0.0f) {
            setTranslationY(fLd6);
        }
        this.f39407g.m25295n(fLd6);
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.zy
    public boolean toq(MenuItemC7036s menuItemC7036s, int i2) {
        return this.f39408k.m25348r(menuItemC7036s, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public toq generateDefaultLayoutParams() {
        return new toq(-2, -2);
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: y */
    public boolean mo25265y() {
        return false;
    }

    public void zurt() {
        this.f39407g.m25296q();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39411y = false;
        setBaselineAligned(false);
        this.f39407g = new zy();
        setLayoutAnimation(null);
    }
}
