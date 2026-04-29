package com.android.thememanager.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class LinearGradientView extends View {

    /* JADX INFO: renamed from: c */
    private static final String f17767c = "#000000";

    /* JADX INFO: renamed from: e */
    private static final String f17768e = "#B3000000";

    /* JADX INFO: renamed from: f */
    private static final String f17769f = "#66000000";

    /* JADX INFO: renamed from: h */
    private static final float f17770h = 1.0f;

    /* JADX INFO: renamed from: i */
    private static final String f17771i = "00";

    /* JADX INFO: renamed from: l */
    private static final String f17772l = "#00000000";

    /* JADX INFO: renamed from: p */
    private static final float f17773p = 0.5f;

    /* JADX INFO: renamed from: r */
    private static final String f17774r = "000000";

    /* JADX INFO: renamed from: s */
    private static final float f17775s = 0.75f;

    /* JADX INFO: renamed from: t */
    private static final String f17776t = "B3";

    /* JADX INFO: renamed from: y */
    private static final long f17777y = 500;

    /* JADX INFO: renamed from: z */
    private static final String f17778z = "66";

    /* JADX INFO: renamed from: g */
    private ValueAnimator f17779g;

    /* JADX INFO: renamed from: k */
    private RectF f17780k;

    /* JADX INFO: renamed from: n */
    private boolean f17781n;

    /* JADX INFO: renamed from: q */
    private Paint f17782q;

    /* JADX INFO: renamed from: com.android.thememanager.widget.LinearGradientView$k */
    class C2953k implements ValueAnimator.AnimatorUpdateListener {
        C2953k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            LinearGradientView.this.setAnimatorValue(((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    public LinearGradientView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: q */
    private void m10492q() {
        Paint paint = new Paint();
        this.f17782q = paint;
        paint.setAntiAlias(true);
        this.f17782q.setStyle(Paint.Style.FILL);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f17779g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f17779g.addUpdateListener(new C2953k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnimatorValue(float value) {
        int i2;
        int i3;
        if (this.f17781n) {
            i2 = Integer.parseInt(f17778z, 16);
            i3 = Integer.parseInt(f17776t, 16);
        } else {
            i2 = Integer.parseInt(f17776t, 16);
            i3 = Integer.parseInt(f17778z, 16);
        }
        this.f17782q.setShader(zy(f17772l, "#" + Integer.toHexString(i2 + ((int) ((i3 - i2) * value))) + f17774r));
        invalidate();
    }

    private LinearGradient zy(String startColor, String endColor) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, this.f17780k.bottom, new int[]{Color.parseColor(startColor), Color.parseColor(endColor)}, new float[]{this.f17781n ? 0.5f : 0.75f, 1.0f}, Shader.TileMode.MIRROR);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.f17780k, this.f17782q);
    }

    @Override // android.view.View
    protected void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        this.f17780k = new RectF(0.0f, 0.0f, width, height);
        this.f17782q.setShader(zy(f17772l, f17769f));
    }

    public void toq(boolean isDeepen) {
        this.f17781n = isDeepen;
        this.f17779g.start();
    }

    public LinearGradientView(Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LinearGradientView(Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m10492q();
    }
}
