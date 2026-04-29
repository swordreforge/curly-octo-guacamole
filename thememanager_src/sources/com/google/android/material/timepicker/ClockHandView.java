package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C0683f;
import ij.C6095k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7833l;
import zy.cdj;
import zy.dd;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: o */
    private static final int f25331o = 200;

    /* JADX INFO: renamed from: c */
    private zy f25332c;

    /* JADX INFO: renamed from: e */
    private double f25333e;

    /* JADX INFO: renamed from: f */
    private boolean f25334f;

    /* JADX INFO: renamed from: g */
    private float f25335g;

    /* JADX INFO: renamed from: h */
    private final int f25336h;

    /* JADX INFO: renamed from: i */
    private final float f25337i;

    /* JADX INFO: renamed from: j */
    private int f25338j;

    /* JADX INFO: renamed from: k */
    private ValueAnimator f25339k;

    /* JADX INFO: renamed from: l */
    private float f25340l;

    /* JADX INFO: renamed from: n */
    private float f25341n;

    /* JADX INFO: renamed from: p */
    private final List<InterfaceC4166q> f25342p;

    /* JADX INFO: renamed from: q */
    private boolean f25343q;

    /* JADX INFO: renamed from: r */
    @InterfaceC7833l
    private final int f25344r;

    /* JADX INFO: renamed from: s */
    private int f25345s;

    /* JADX INFO: renamed from: t */
    private final RectF f25346t;

    /* JADX INFO: renamed from: y */
    private boolean f25347y;

    /* JADX INFO: renamed from: z */
    private final Paint f25348z;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$k */
    class C4165k implements ValueAnimator.AnimatorUpdateListener {
        C4165k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.n7h(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$q */
    public interface InterfaceC4166q {
        void zurt(@zurt(from = 0.0d, to = 360.0d) float f2, boolean z2);
    }

    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface zy {
        void toq(@zurt(from = 0.0d, to = 360.0d) float f2, boolean z2);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: n */
    private int m15108n(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h(@zurt(from = 0.0d, to = 360.0d) float f2, boolean z2) {
        float f3 = f2 % 360.0f;
        this.f25340l = f3;
        this.f25333e = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.f25338j * ((float) Math.cos(this.f25333e)));
        float fSin = height + (this.f25338j * ((float) Math.sin(this.f25333e)));
        RectF rectF = this.f25346t;
        int i2 = this.f25336h;
        rectF.set(width - i2, fSin - i2, width + i2, fSin + i2);
        Iterator<InterfaceC4166q> it = this.f25342p.iterator();
        while (it.hasNext()) {
            it.next().zurt(f3, z2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    private boolean m15109s(float f2, float f3, boolean z2, boolean z3, boolean z5) {
        float fM15108n = m15108n(f2, f3);
        boolean z6 = false;
        boolean z7 = m15111g() != fM15108n;
        if (z3 && z7) {
            return true;
        }
        if (!z7 && !z2) {
            return false;
        }
        if (z5 && this.f25343q) {
            z6 = true;
        }
        qrj(fM15108n, z6);
        return true;
    }

    /* JADX INFO: renamed from: y */
    private Pair<Float, Float> m15110y(float f2) {
        float fM15111g = m15111g();
        if (Math.abs(fM15111g - f2) > 180.0f) {
            if (fM15111g > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (fM15111g < 180.0f && f2 > 180.0f) {
                fM15111g += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fM15111g), Float.valueOf(f2));
    }

    private void zy(Canvas canvas) {
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float fCos = (this.f25338j * ((float) Math.cos(this.f25333e))) + width;
        float f2 = height;
        float fSin = (this.f25338j * ((float) Math.sin(this.f25333e))) + f2;
        this.f25348z.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f25336h, this.f25348z);
        double dSin = Math.sin(this.f25333e);
        double dCos = Math.cos(this.f25333e);
        this.f25348z.setStrokeWidth(this.f25344r);
        canvas.drawLine(width, f2, r1 + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f25348z);
        canvas.drawCircle(width, f2, this.f25337i, this.f25348z);
    }

    public int f7l8() {
        return this.f25336h;
    }

    @zurt(from = 0.0d, to = 360.0d)
    /* JADX INFO: renamed from: g */
    public float m15111g() {
        return this.f25340l;
    }

    public void kja0(zy zyVar) {
        this.f25332c = zyVar;
    }

    public void ld6(@cdj int i2) {
        this.f25338j = i2;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zy(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        x2(m15111g());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        boolean z5;
        zy zyVar;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f25341n = x3;
            this.f25335g = y3;
            this.f25347y = true;
            this.f25334f = false;
            z2 = false;
            z3 = false;
            z5 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i2 = (int) (x3 - this.f25341n);
            int i3 = (int) (y3 - this.f25335g);
            this.f25347y = (i2 * i2) + (i3 * i3) > this.f25345s;
            boolean z6 = this.f25334f;
            z2 = actionMasked == 1;
            z5 = false;
            z3 = z6;
        } else {
            z2 = false;
            z3 = false;
            z5 = false;
        }
        boolean zM15109s = m15109s(x3, y3, z3, z5, z2) | this.f25334f;
        this.f25334f = zM15109s;
        if (zM15109s && z2 && (zyVar = this.f25332c) != null) {
            zyVar.toq(m15108n(x3, y3), this.f25347y);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m15112p(boolean z2) {
        this.f25343q = z2;
    }

    /* JADX INFO: renamed from: q */
    public RectF m15113q() {
        return this.f25346t;
    }

    public void qrj(@zurt(from = 0.0d, to = 360.0d) float f2, boolean z2) {
        ValueAnimator valueAnimator = this.f25339k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            n7h(f2, false);
            return;
        }
        Pair<Float, Float> pairM15110y = m15110y(f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairM15110y.first).floatValue(), ((Float) pairM15110y.second).floatValue());
        this.f25339k = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f25339k.addUpdateListener(new C4165k());
        this.f25339k.addListener(new toq());
        this.f25339k.start();
    }

    public void toq(InterfaceC4166q interfaceC4166q) {
        this.f25342p.add(interfaceC4166q);
    }

    public void x2(@zurt(from = 0.0d, to = 360.0d) float f2) {
        qrj(f2, false);
    }

    public ClockHandView(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.jhn);
    }

    public ClockHandView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f25342p = new ArrayList();
        Paint paint = new Paint();
        this.f25348z = paint;
        this.f25346t = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.lz, i2, C6095k.n7h.klnv);
        this.f25338j = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.bbg, 0);
        this.f25336h = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.jut, 0);
        this.f25344r = getResources().getDimensionPixelSize(C6095k.g.bmt3);
        this.f25337i = r6.getDimensionPixelSize(C6095k.g.wqp);
        int color = typedArrayObtainStyledAttributes.getColor(C6095k.kja0.wutb, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        x2(0.0f);
        this.f25345s = ViewConfiguration.get(context).getScaledTouchSlop();
        C0683f.o05(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
