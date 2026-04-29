package miuix.appcompat.internal.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import gb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class ColorTransitionTextView extends TextView {

    /* JADX INFO: renamed from: g */
    private int f39349g;

    /* JADX INFO: renamed from: k */
    private ColorStateList f39350k;

    /* JADX INFO: renamed from: n */
    private int f39351n;

    /* JADX INFO: renamed from: q */
    private boolean f39352q;

    /* JADX INFO: renamed from: s */
    private ValueAnimator f39353s;

    /* JADX INFO: renamed from: y */
    private int f39354y;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.ColorTransitionTextView$k */
    class C7008k implements ValueAnimator.AnimatorUpdateListener {
        C7008k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ColorTransitionTextView.this.f39354y = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ColorTransitionTextView.this.invalidate();
        }
    }

    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f39356k;

        toq(boolean z2) {
            this.f39356k = z2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f39356k) {
                ColorTransitionTextView colorTransitionTextView = ColorTransitionTextView.this;
                colorTransitionTextView.setTextColor(colorTransitionTextView.f39349g);
            } else {
                ColorTransitionTextView colorTransitionTextView2 = ColorTransitionTextView.this;
                colorTransitionTextView2.setTextColor(colorTransitionTextView2.f39351n);
            }
        }
    }

    public ColorTransitionTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39352q = false;
        m25250q();
    }

    /* JADX INFO: renamed from: q */
    private void m25250q() {
        ColorStateList textColors = getTextColors();
        this.f39350k = textColors;
        int colorForState = textColors.getColorForState(TextView.ENABLED_STATE_SET, getResources().getColor(toq.C6050g.f75652kcsr));
        this.f39351n = colorForState;
        int colorForState2 = this.f39350k.getColorForState(TextView.ENABLED_SELECTED_STATE_SET, colorForState);
        this.f39349g = colorForState2;
        if (this.f39351n != colorForState2) {
            this.f39352q = true;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m25251n(boolean z2, boolean z3) {
        if (!z3) {
            if (z2) {
                setTextColor(this.f39349g);
            } else {
                setTextColor(this.f39351n);
            }
            invalidate();
            return;
        }
        ValueAnimator valueAnimator = this.f39353s;
        if (valueAnimator == null) {
            this.f39353s = new ValueAnimator();
        } else {
            valueAnimator.cancel();
        }
        if (z2) {
            this.f39353s.setIntValues(getCurrentTextColor(), this.f39349g);
        } else {
            this.f39353s.setIntValues(getCurrentTextColor(), this.f39351n);
        }
        this.f39353s.setDuration(50L);
        this.f39353s.setInterpolator(new AccelerateDecelerateInterpolator());
        this.f39353s.setEvaluator(new ArgbEvaluator());
        this.f39353s.addUpdateListener(new C7008k());
        this.f39353s.addListener(new toq(z2));
        this.f39353s.start();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        if (!this.f39352q || (valueAnimator = this.f39353s) == null || !valueAnimator.isRunning()) {
            super.onDraw(canvas);
        } else {
            setTextColor(this.f39354y);
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z2) {
        super.setSelected(false);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m25250q();
    }
}
