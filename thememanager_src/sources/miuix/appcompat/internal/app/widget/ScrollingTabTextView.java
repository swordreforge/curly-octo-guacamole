package miuix.appcompat.internal.app.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import gb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class ScrollingTabTextView extends TextView {

    /* JADX INFO: renamed from: g */
    private ValueAnimator f39169g;

    /* JADX INFO: renamed from: k */
    private ColorStateList f39170k;

    /* JADX INFO: renamed from: n */
    private int f39171n;

    /* JADX INFO: renamed from: q */
    private int f39172q;

    /* JADX INFO: renamed from: s */
    private boolean f39173s;

    /* JADX INFO: renamed from: y */
    private int f39174y;

    /* JADX INFO: renamed from: miuix.appcompat.internal.app.widget.ScrollingTabTextView$k */
    class C6983k implements ValueAnimator.AnimatorUpdateListener {
        C6983k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ScrollingTabTextView.this.f39174y = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ScrollingTabTextView.this.invalidate();
        }
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ScrollingTabTextView scrollingTabTextView = ScrollingTabTextView.this;
            scrollingTabTextView.f39174y = scrollingTabTextView.getWidth();
        }
    }

    public ScrollingTabTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        toq();
    }

    private void toq() {
        ColorStateList textColors = getTextColors();
        this.f39170k = textColors;
        this.f39172q = textColors.getColorForState(TextView.ENABLED_STATE_SET, getResources().getColor(toq.C6050g.f75641i9jn));
        this.f39171n = this.f39170k.getColorForState(TextView.ENABLED_SELECTED_STATE_SET, getResources().getColor(toq.C6050g.f75733v0af));
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int scrollX;
        ValueAnimator valueAnimator = this.f39169g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.onDraw(canvas);
            return;
        }
        int i2 = ((!this.f39173s || isSelected()) && (this.f39173s || !isSelected())) ? this.f39171n : this.f39172q;
        setTextColor(i2);
        boolean zX2 = miuix.internal.util.n7h.x2(this);
        int scrollX2 = this.f39174y;
        int height = getHeight();
        if (zX2) {
            scrollX = getScrollX() + 0;
            scrollX2 += getScrollX();
        } else {
            scrollX = 0;
        }
        canvas.save();
        canvas.clipRect(scrollX, 0, scrollX2, height);
        super.onDraw(canvas);
        canvas.restore();
        int i3 = this.f39172q;
        if (i2 == i3) {
            i2 = this.f39171n;
        } else if (i2 == this.f39171n) {
            i2 = i3;
        }
        setTextColor(i2);
        int scrollX3 = this.f39174y;
        int width = getWidth();
        if (zX2) {
            scrollX3 += getScrollX();
            width += getScrollX();
        }
        canvas.save();
        canvas.clipRect(scrollX3, 0, width, height);
        super.onDraw(canvas);
        canvas.restore();
        setTextColor(this.f39170k);
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        toq();
    }

    public void zy(boolean z2) {
        int width;
        int width2;
        ValueAnimator valueAnimator = this.f39169g;
        if (valueAnimator == null) {
            this.f39169g = new ValueAnimator();
        } else {
            valueAnimator.cancel();
        }
        this.f39173s = z2;
        if (z2) {
            width2 = getWidth();
            width = 0;
        } else {
            width = getWidth();
            width2 = 0;
        }
        this.f39169g.setIntValues(width, width2);
        this.f39169g.setDuration(200L);
        this.f39169g.addUpdateListener(new C6983k());
        this.f39169g.addListener(new toq());
        this.f39169g.start();
    }
}
