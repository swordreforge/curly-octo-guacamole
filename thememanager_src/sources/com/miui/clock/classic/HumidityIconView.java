package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.miui.clock.C5049g;
import gcp.C6062n;
import java.text.NumberFormat;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class HumidityIconView extends View {

    /* JADX INFO: renamed from: c */
    private Resources f28858c;

    /* JADX INFO: renamed from: e */
    private boolean f28859e;

    /* JADX INFO: renamed from: f */
    private String f28860f;

    /* JADX INFO: renamed from: g */
    private float f28861g;

    /* JADX INFO: renamed from: h */
    private float f28862h;

    /* JADX INFO: renamed from: i */
    private float f28863i;

    /* JADX INFO: renamed from: j */
    Path f28864j;

    /* JADX INFO: renamed from: k */
    private Context f28865k;

    /* JADX INFO: renamed from: l */
    private int f28866l;

    /* JADX INFO: renamed from: n */
    private float f28867n;

    /* JADX INFO: renamed from: p */
    private Paint f28868p;

    /* JADX INFO: renamed from: q */
    private float f28869q;

    /* JADX INFO: renamed from: r */
    private int f28870r;

    /* JADX INFO: renamed from: s */
    private float f28871s;

    /* JADX INFO: renamed from: t */
    private float f28872t;

    /* JADX INFO: renamed from: y */
    private float f28873y;

    /* JADX INFO: renamed from: z */
    private float f28874z;

    public HumidityIconView(Context context) {
        super(context);
        this.f28862h = -1.0f;
        this.f28864j = new Path();
        zy(context);
    }

    /* JADX INFO: renamed from: k */
    private int m17630k(int i2) {
        return (int) (this.f28858c.getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    private float toq(int i2) {
        return this.f28858c.getDimension(i2) * C6062n.m22318k(getContext());
    }

    private void zy(Context context) {
        this.f28865k = context;
        this.f28868p = new Paint();
        this.f28859e = C6062n.n7h();
    }

    public float getHumidity() {
        return this.f28862h;
    }

    /* JADX INFO: renamed from: n */
    public void m17631n() {
        this.f28873y = toq(C5049g.q.f71529f7l8);
        this.f28871s = toq(C5049g.q.f29042y);
        this.f28869q = toq(C5049g.q.f29036s);
        this.f28867n = toq(C5049g.q.f29033p);
        this.f28861g = toq(C5049g.q.f29024g);
        this.f28863i = toq(C5049g.q.f71622qrj);
        this.f28874z = toq(C5049g.q.f71662x2);
        this.f28868p.setTextSize(toq(C5049g.q.f71596n7h));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f28859e != C6062n.n7h()) {
            this.f28859e = !this.f28859e;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        float f3;
        int i2;
        float f4;
        float f5;
        float f6;
        float f7;
        int i3;
        int i4;
        int i5;
        super.onDraw(canvas);
        if (this.f28858c == null || getVisibility() == 8) {
            return;
        }
        boolean zN7h = C6062n.n7h();
        if (zN7h) {
            float measuredWidth = getMeasuredWidth();
            f3 = ((measuredWidth - this.f28873y) - (this.f28869q * 12.0f)) - (this.f28861g * 5.0f);
            f2 = (measuredWidth - this.f28872t) - this.f28863i;
        } else {
            f2 = this.f28863i;
            f3 = this.f28873y;
        }
        float f8 = f3;
        this.f28868p.setColor(this.f28866l);
        canvas.drawText(this.f28860f, f2, this.f28874z, this.f28868p);
        float f9 = this.f28862h;
        int i6 = (int) (f9 / 8.333f);
        int i7 = 1;
        boolean z2 = f9 - (((float) i6) * 8.333f) > 0.1f;
        int i8 = 0;
        int i9 = 0;
        while (i9 < 2) {
            float f10 = this.f28869q;
            float f11 = f10 + (i9 * ((f10 * 2.0f) + this.f28867n)) + this.f28871s;
            int i10 = 0;
            while (i10 < 6) {
                int i11 = i8 + 1;
                if (i11 <= i6) {
                    this.f28868p.setColor(this.f28870r);
                    i2 = 0;
                } else {
                    i2 = (z2 && i11 - i6 == i7) ? i7 : 0;
                    this.f28868p.setColor(this.f28866l);
                }
                if (zN7h) {
                    float f12 = this.f28869q;
                    f4 = f8 + f12;
                    f5 = 5 - i10;
                    f6 = f12 * 2.0f;
                    f7 = this.f28861g;
                } else {
                    float f13 = this.f28869q;
                    f4 = f8 + f13;
                    f5 = i10;
                    f6 = f13 * 2.0f;
                    f7 = this.f28861g;
                }
                float f14 = f4 + (f5 * (f6 + f7));
                float f15 = this.f28869q;
                float f16 = f14 - f15;
                float f17 = f11 - f15;
                float f18 = f14 + f15;
                float f19 = f11 + f15;
                this.f28864j.reset();
                if (i2 != 0) {
                    this.f28864j.moveTo(f18, f17);
                    this.f28864j.lineTo(f14, f17);
                    this.f28864j.addArc(f16, f17, f18, f19, 270.0f, -86.83f);
                    this.f28864j.lineTo(f18, f11 - (this.f28869q / 18.0f));
                    this.f28864j.lineTo(f18, f17);
                    this.f28864j.close();
                    canvas.drawPath(this.f28864j, this.f28868p);
                    this.f28868p.setColor(this.f28870r);
                    i3 = i11;
                    i4 = i10;
                    i5 = i9;
                    canvas.drawArc(f16, f17, f18, f19, 3.17f, 173.66f, false, this.f28868p);
                } else {
                    i3 = i11;
                    i4 = i10;
                    i5 = i9;
                    this.f28864j.moveTo(f18, f17);
                    this.f28864j.lineTo(f18, f19);
                    this.f28864j.addArc(f16, f17, f18, f19, 0.0f, 270.0f);
                    this.f28864j.lineTo(f18, f17);
                    this.f28864j.close();
                    canvas.drawPath(this.f28864j, this.f28868p);
                }
                i10 = i4 + 1;
                i8 = i3;
                i9 = i5;
                i7 = 1;
            }
            i9++;
            i7 = 1;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getMode(i2) != 1073741824 ? (int) (this.f28873y + this.f28863i + this.f28872t) : View.MeasureSpec.getSize(i2);
        int iM17630k = View.MeasureSpec.getMode(i3) != 1073741824 ? m17630k(C5049g.q.f71681zkd) : View.MeasureSpec.getSize(i3);
        Log.i("HumidityIconView", "w = " + size + ", h = " + iM17630k);
        setMeasuredDimension(size, iM17630k);
    }

    /* JADX INFO: renamed from: q */
    public void m17632q(int i2, int i3) {
        if (i2 != 0) {
            this.f28870r = i2;
        }
        if (i3 != 0) {
            this.f28866l = i3;
        }
        invalidate();
    }

    public void setHumidity(float f2) {
        this.f28862h = f2;
        if (this.f28858c == null) {
            this.f28858c = this.f28865k.getResources();
            m17631n();
            this.f28868p.setStyle(Paint.Style.FILL);
            if (this.f28870r == 0) {
                this.f28870r = this.f28858c.getColor(C5049g.zy.f29095k);
            }
            if (this.f28866l == 0) {
                this.f28866l = this.f28858c.getColor(C5049g.zy.f29098q);
            }
        }
        if (f2 < 0.0f) {
            this.f28860f = this.f28858c.getString(C5049g.s.f71718gc3c);
        } else {
            this.f28860f = this.f28858c.getString(C5049g.s.f29058o, NumberFormat.getPercentInstance().format(this.f28862h / 100.0f));
        }
        this.f28872t = this.f28868p.measureText(this.f28860f);
        requestLayout();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f28868p.setTypeface(typeface);
    }

    public HumidityIconView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28862h = -1.0f;
        this.f28864j = new Path();
        zy(context);
    }

    public HumidityIconView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28862h = -1.0f;
        this.f28864j = new Path();
        zy(context);
    }

    public HumidityIconView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f28862h = -1.0f;
        this.f28864j = new Path();
        zy(context);
    }
}
