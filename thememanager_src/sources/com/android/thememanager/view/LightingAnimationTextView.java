package com.android.thememanager.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.android.thememanager.R;

/* JADX INFO: loaded from: classes2.dex */
public class LightingAnimationTextView extends TextView {

    /* JADX INFO: renamed from: j */
    private static final int f17284j = 1300;

    /* JADX INFO: renamed from: m */
    private static final float f17285m = -0.45f;

    /* JADX INFO: renamed from: o */
    private static final int f17286o = 0;

    /* JADX INFO: renamed from: c */
    private boolean f17287c;

    /* JADX INFO: renamed from: e */
    private Runnable f17288e;

    /* JADX INFO: renamed from: f */
    private Matrix f17289f;

    /* JADX INFO: renamed from: g */
    private int f17290g;

    /* JADX INFO: renamed from: h */
    private int f17291h;

    /* JADX INFO: renamed from: i */
    private float f17292i;

    /* JADX INFO: renamed from: k */
    private final Paint f17293k;

    /* JADX INFO: renamed from: l */
    private LinearGradient f17294l;

    /* JADX INFO: renamed from: n */
    private int f17295n;

    /* JADX INFO: renamed from: p */
    private int f17296p;

    /* JADX INFO: renamed from: q */
    private final RectF f17297q;

    /* JADX INFO: renamed from: r */
    private ValueAnimator f17298r;

    /* JADX INFO: renamed from: s */
    private int f17299s;

    /* JADX INFO: renamed from: t */
    private float f17300t;

    /* JADX INFO: renamed from: y */
    private int f17301y;

    /* JADX INFO: renamed from: z */
    private float f17302z;

    /* JADX INFO: renamed from: com.android.thememanager.view.LightingAnimationTextView$k */
    class C2887k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float f17303k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f17305q;

        C2887k(final float val$offset, final float val$k) {
            this.f17303k = val$offset;
            this.f17305q = val$k;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@zy.lvui ValueAnimator animation) {
            float fFloatValue = ((Float) animation.getAnimatedValue()).floatValue();
            LightingAnimationTextView.this.f17302z = this.f17303k + fFloatValue;
            LightingAnimationTextView.this.f17300t = this.f17305q * (fFloatValue + this.f17303k);
            if (LightingAnimationTextView.this.f17289f != null) {
                LightingAnimationTextView.this.f17289f.setTranslate(LightingAnimationTextView.this.f17302z, LightingAnimationTextView.this.f17300t);
            }
            if (LightingAnimationTextView.this.f17294l != null) {
                LightingAnimationTextView.this.f17294l.setLocalMatrix(LightingAnimationTextView.this.f17289f);
            }
            LightingAnimationTextView.this.invalidate();
        }
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            LightingAnimationTextView.this.f17287c = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            LightingAnimationTextView.this.f17287c = true;
        }
    }

    public LightingAnimationTextView(Context context) {
        this(context, null);
    }

    private void ld6(int w2, int h2, int repeatCount, long duration) {
        float f2 = this.f17292i;
        float f3 = this.f17299s;
        ValueAnimator valueAnimator = this.f17298r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f - f3, w2 + f3);
        this.f17298r = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setRepeatCount(repeatCount);
        this.f17298r.setInterpolator(new DecelerateInterpolator(1.5f));
        this.f17298r.setDuration(duration);
        this.f17298r.addUpdateListener(new C2887k(f3, f2));
        this.f17298r.addListener(new toq());
        this.f17298r.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m10250p() {
        ld6(getWidth(), getHeight(), this.f17301y, this.f17290g);
    }

    /* JADX INFO: renamed from: s */
    private void m10252s(Context context) {
        int[] iArr;
        Shader.TileMode tileMode;
        this.f17290g = f17284j;
        this.f17301y = 0;
        this.f17292i = f17285m;
        this.f17295n = context.getResources().getDimensionPixelSize(R.dimen.miuix_appcompat_button_bg_corner_radius);
        this.f17299s = context.getResources().getDimensionPixelSize(R.dimen.element_ad_download_button_light_animation_width);
        this.f17296p = context.getResources().getColor(R.color.new_ad_card_lighting_view_start_color);
        int color = context.getResources().getColor(R.color.new_ad_card_lighting_view_end_color);
        this.f17291h = color;
        if (Build.VERSION.SDK_INT >= 31) {
            iArr = new int[]{this.f17296p, color};
            tileMode = Shader.TileMode.DECAL;
        } else {
            iArr = new int[]{0, this.f17296p, color, 0};
            tileMode = Shader.TileMode.CLAMP;
        }
        int i2 = this.f17299s;
        this.f17294l = new LinearGradient(-i2, this.f17292i * (-i2), 0.0f, 0.0f, iArr, (float[]) null, tileMode);
        this.f17289f = new Matrix();
        this.f17293k.setShader(this.f17294l);
        this.f17288e = new Runnable() { // from class: com.android.thememanager.view.cdj
            @Override // java.lang.Runnable
            public final void run() {
                this.f17510k.m10250p();
            }
        };
    }

    public int getOffset() {
        return this.f17299s;
    }

    public int getRadius() {
        return this.f17295n;
    }

    public float getSlope() {
        return this.f17292i;
    }

    public void n7h(int delay) {
        postDelayed(this.f17288e, delay);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17287c) {
            RectF rectF = this.f17297q;
            int i2 = this.f17295n;
            canvas.drawRoundRect(rectF, i2, i2, this.f17293k);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        this.f17297q.set(0.0f, 0.0f, w2, h2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus) {
            return;
        }
        removeCallbacks(this.f17288e);
        ValueAnimator valueAnimator = this.f17298r;
        if (valueAnimator != null && this.f17287c) {
            valueAnimator.cancel();
            this.f17287c = false;
            invalidate();
        }
        this.f17298r = null;
    }

    public void qrj(long duration, int repeatCount) {
        ld6(getWidth(), getHeight(), repeatCount, duration);
    }

    public void setDuration(int duration) {
        this.f17290g = duration;
    }

    public void setOffset(int offset) {
        this.f17299s = offset;
    }

    public void setRadius(int radius) {
        this.f17295n = radius;
    }

    public void setRepeatCount(int repeatCount) {
        if (repeatCount < -1) {
            return;
        }
        this.f17301y = repeatCount;
    }

    public void setSlope(float slope) {
        this.f17292i = slope;
    }

    public void setStartAndEndColors(int startColor, int endColor) {
        this.f17296p = startColor;
        this.f17291h = endColor;
    }

    public void x2(long duration) {
        ld6(getWidth(), getHeight(), this.f17301y, duration);
    }

    public LightingAnimationTextView(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
        this.f17293k = new Paint();
        this.f17297q = new RectF();
        m10252s(context);
    }
}
