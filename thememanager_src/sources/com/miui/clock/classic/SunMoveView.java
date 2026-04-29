package com.miui.clock.classic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import gcp.C6062n;
import gcp.C6064q;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class SunMoveView extends View {

    /* JADX INFO: renamed from: a */
    private int f28881a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private float f70922ab;
    private float ac;
    private float ad;
    private int aj;
    private String am;
    private float an;
    private boolean ar;
    private Drawable as;
    private float ax;
    private float ay;
    private Drawable az;

    /* JADX INFO: renamed from: b */
    private int f28882b;
    private float ba;
    private float bb;
    private String bc;
    private float be;
    private Drawable bg;
    private float bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f70923bo;
    private float bp;
    private float bq;
    private float bs;
    private float bv;

    /* JADX INFO: renamed from: c */
    private float f28883c;

    /* JADX INFO: renamed from: d */
    private float f28884d;

    /* JADX INFO: renamed from: e */
    private Paint f28885e;

    /* JADX INFO: renamed from: f */
    private float f28886f;

    /* JADX INFO: renamed from: g */
    private float f28887g;

    /* JADX INFO: renamed from: h */
    private float f28888h;

    /* JADX INFO: renamed from: i */
    private float f28889i;
    private float id;
    private float in;

    /* JADX INFO: renamed from: j */
    private int f28890j;

    /* JADX INFO: renamed from: k */
    private Context f28891k;
    private boolean k0;

    /* JADX INFO: renamed from: l */
    private float f28892l;

    /* JADX INFO: renamed from: m */
    private Path f28893m;

    /* JADX INFO: renamed from: n */
    private float f28894n;

    /* JADX INFO: renamed from: o */
    private int f28895o;

    /* JADX INFO: renamed from: p */
    private float f28896p;

    /* JADX INFO: renamed from: q */
    private Resources f28897q;

    /* JADX INFO: renamed from: r */
    private float f28898r;

    /* JADX INFO: renamed from: s */
    private float f28899s;

    /* JADX INFO: renamed from: t */
    private float f28900t;

    /* JADX INFO: renamed from: u */
    private float f28901u;

    /* JADX INFO: renamed from: v */
    private float f28902v;

    /* JADX INFO: renamed from: w */
    private float f28903w;

    /* JADX INFO: renamed from: x */
    private int f28904x;

    /* JADX INFO: renamed from: y */
    private float f28905y;

    /* JADX INFO: renamed from: z */
    private float f28906z;

    public SunMoveView(Context context) {
        super(context);
        m17635n(context);
    }

    /* JADX INFO: renamed from: k */
    private float m17634k(float f2, float f3, float f4, float f5) {
        float f6 = 1.0f - f2;
        return (f3 * f6 * f6) + (f4 * 2.0f * f6 * f2) + (f5 * f2 * f2);
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: n */
    private void m17635n(Context context) {
        this.f28891k = context;
        this.f28885e = new Paint();
        this.ar = C6062n.n7h();
    }

    /* JADX INFO: renamed from: p */
    private void m17636p() {
        this.k0 = false;
        switch (this.aj) {
            case 21:
            case 26:
                float f2 = this.bs;
                this.in = 6.0f * f2;
                this.f28887g = 4.0f * f2;
                this.f28892l = f2 * 2.0f;
                break;
            case 22:
                float f3 = this.bs;
                this.in = 5.0f * f3;
                this.f28887g = 3.0f * f3;
                this.f28892l = f3 * 1.5f;
                break;
            case 23:
                float f4 = this.bs;
                this.in = 7.0f * f4;
                this.f28887g = 5.0f * f4;
                this.f28892l = f4 * 3.0f;
                break;
            case 24:
            case 25:
                this.k0 = true;
                float f5 = this.bs;
                this.in = 7.0f * f5;
                this.f28887g = 5.0f * f5;
                this.f28892l = f5 * 3.0f;
                break;
        }
    }

    /* JADX INFO: renamed from: q */
    private String m17637q(int i2) {
        if (i2 == 0) {
            return "00";
        }
        if (i2 >= 10) {
            return Integer.toString(i2);
        }
        return "0" + i2;
    }

    private float toq(int i2) {
        return this.f28897q.getDimension(i2) * C6062n.m22318k(getContext());
    }

    private int zy(int i2) {
        return (int) (this.f28897q.getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    public void f7l8(int i2) {
        m17640y(this.f28882b, this.f28904x, this.f28881a, i2);
    }

    /* JADX INFO: renamed from: g */
    public void m17638g(int i2, int i3) {
        if (i2 != 0) {
            this.f28890j = i2;
        }
        if (i3 != 0) {
            this.f28895o = i3;
        }
        Drawable drawable = this.bg;
        if (drawable != null) {
            drawable.setTint(i3);
        }
        Drawable drawable2 = this.as;
        if (drawable2 != null) {
            drawable2.setTint(i3);
        }
        invalidate();
    }

    public String getDesc() {
        return this.bc;
    }

    public void ld6() {
        this.bs = toq(C5049g.q.mru);
        this.f28894n = toq(C5049g.q.mqs);
        this.f28905y = toq(C5049g.q.mn);
        this.f28899s = toq(C5049g.q.t57j);
        this.f28896p = toq(C5049g.q.lz);
        this.f28888h = toq(C5049g.q.c4);
        this.f28889i = toq(C5049g.q.p1t5);
        this.f28906z = toq(C5049g.q.cun);
        this.f28900t = toq(C5049g.q.wutb);
        this.f28898r = toq(C5049g.q.vd);
        this.f28886f = toq(C5049g.q.thtw);
        this.f28883c = toq(C5049g.q.nm);
        this.bl = this.bs * 3.0f;
        this.ba = toq(C5049g.q.a5rs);
        this.ac = toq(C5049g.q.u4);
        this.ad = toq(C5049g.q.hfwa);
        this.f28885e.setTextSize(toq(C5049g.q.dwra));
        this.be = toq(C5049g.q.ym8) / this.as.getIntrinsicWidth();
        this.ax = toq(C5049g.q.rb7);
        this.f28902v = toq(C5049g.q.jut);
        this.f70923bo = toq(C5049g.q.bbg);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.ar != C6062n.n7h()) {
            this.ar = !this.ar;
            requestLayout();
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0178  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.clock.classic.SunMoveView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int iZy = View.MeasureSpec.getMode(i2) != 1073741824 ? zy(C5049g.q.mv) : View.MeasureSpec.getSize(i2);
        int iZy2 = View.MeasureSpec.getMode(i3) != 1073741824 ? zy(C5049g.q.n358) : View.MeasureSpec.getSize(i3);
        Log.i("SunMoveView", "w = " + iZy + ", h = " + iZy2);
        setMeasuredDimension(iZy, iZy2);
    }

    /* JADX INFO: renamed from: s */
    public void m17639s(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m17640y((i2 * 60) + i3, (i4 * 60) + i5, (i6 * 60) + i7, i8);
    }

    public void setStyle(int i2) {
        this.aj = i2;
    }

    public void setTypeface(Typeface typeface) {
        this.f28885e.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: y */
    public void m17640y(int i2, int i3, int i4, int i5) {
        if (this.f28897q == null) {
            this.f28897q = this.f28891k.getResources();
            this.f28885e.setFontFeatureSettings("ss01");
            this.f28885e.setStyle(Paint.Style.FILL);
            if (this.f28890j == 0) {
                this.f28890j = this.f28897q.getColor(C5049g.zy.f29095k);
            }
            if (this.f28895o == 0) {
                this.f28895o = this.f28897q.getColor(C5049g.zy.f29098q);
            }
            this.as = C0498q.m2259s(this.f28891k, C5049g.n.vd);
            this.bg = C0498q.m2259s(this.f28891k, C5049g.n.irh);
            Drawable drawable = this.as;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.as.getIntrinsicHeight());
            Drawable drawable2 = this.bg;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.bg.getIntrinsicHeight());
            ld6();
            this.f28893m = new Path();
        }
        m17636p();
        this.f28882b = i2;
        this.f28881a = i4;
        this.f28904x = i3;
        this.f28901u = i5;
        if (i5 < 0 || (i2 == 0 && i4 == 0 && i3 == 0)) {
            this.id = this.f28902v;
            this.am = "--:--";
            float fMeasureText = this.f28885e.measureText("--:--");
            this.ay = fMeasureText;
            this.az = this.bg;
            this.bq = (((this.f28886f + this.f28898r) - fMeasureText) - this.ad) - (r6.getIntrinsicWidth() * this.be);
            this.bc = getResources().getString(C5049g.s.f71729ixz);
        } else {
            if (i5 < i2 || i5 > i4) {
                this.id = this.f70923bo;
                if (i5 < i2) {
                    this.am = (i2 / 60) + ":" + m17637q(i2 % 60);
                    this.bc = getResources().getString(C5049g.s.f71692bek6, this.am);
                } else {
                    this.am = (i3 / 60) + ":" + m17637q(i3 % 60);
                    this.bc = getResources().getString(C5049g.s.f71701cv06, this.am);
                }
                this.bq = this.ax;
                this.ay = this.f28885e.measureText(this.am);
                this.az = this.as;
            } else {
                this.id = this.f28902v;
                if (C6064q.zy(this.f28891k)) {
                    this.am = (i4 / 60) + ":" + m17637q(i4 % 60);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append((i4 / 60) - 12);
                    sb.append(":");
                    sb.append(m17637q(i4 % 60));
                    this.am = sb.toString();
                }
                this.bc = getResources().getString(C5049g.s.f71777vep5, this.am);
                float fMeasureText2 = this.f28885e.measureText(this.am);
                this.ay = fMeasureText2;
                this.az = this.bg;
                this.bq = (((this.f28886f + this.f28898r) - fMeasureText2) - this.ad) - (r6.getIntrinsicWidth() * this.be);
            }
        }
        this.bg.setTint(this.f28895o);
        this.as.setTint(this.f28895o);
        float f2 = this.f28888h;
        this.an = f2;
        this.f28884d = f2;
        float f3 = this.f28889i;
        this.bv = f3;
        this.f28903w = f3;
        float f4 = this.f28906z;
        this.bp = f4;
        this.f70922ab = f4;
        this.bb = this.f28900t - (this.bs * 4.0f);
        requestLayout();
        invalidate();
    }

    public SunMoveView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        m17635n(context);
    }

    public SunMoveView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m17635n(context);
    }

    public SunMoveView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        m17635n(context);
    }
}
