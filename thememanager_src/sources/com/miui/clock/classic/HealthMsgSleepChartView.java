package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import gcp.C6062n;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class HealthMsgSleepChartView extends View {

    /* JADX INFO: renamed from: a */
    private float f28806a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f70918ab;

    /* JADX INFO: renamed from: b */
    private float f28807b;
    private Drawable bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f70919bo;
    private String bp;

    /* JADX INFO: renamed from: c */
    private float f28808c;

    /* JADX INFO: renamed from: d */
    private String f28809d;

    /* JADX INFO: renamed from: e */
    private float f28810e;

    /* JADX INFO: renamed from: f */
    private float f28811f;

    /* JADX INFO: renamed from: g */
    private int f28812g;

    /* JADX INFO: renamed from: h */
    private float f28813h;

    /* JADX INFO: renamed from: i */
    private float f28814i;

    /* JADX INFO: renamed from: j */
    private float f28815j;

    /* JADX INFO: renamed from: k */
    private Context f28816k;

    /* JADX INFO: renamed from: l */
    private float f28817l;

    /* JADX INFO: renamed from: m */
    private float f28818m;

    /* JADX INFO: renamed from: n */
    private Paint f28819n;

    /* JADX INFO: renamed from: o */
    private float f28820o;

    /* JADX INFO: renamed from: p */
    private float f28821p;

    /* JADX INFO: renamed from: q */
    private Resources f28822q;

    /* JADX INFO: renamed from: r */
    private float f28823r;

    /* JADX INFO: renamed from: s */
    private float f28824s;

    /* JADX INFO: renamed from: t */
    private float f28825t;

    /* JADX INFO: renamed from: u */
    private Drawable f28826u;

    /* JADX INFO: renamed from: v */
    private float f28827v;

    /* JADX INFO: renamed from: w */
    private String f28828w;

    /* JADX INFO: renamed from: x */
    private float f28829x;

    /* JADX INFO: renamed from: y */
    private int f28830y;

    /* JADX INFO: renamed from: z */
    private float f28831z;

    public HealthMsgSleepChartView(Context context) {
        super(context);
        zy(context);
    }

    /* JADX INFO: renamed from: k */
    private int m17620k(int i2) {
        return (int) (this.f28822q.getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    private float toq(int i2) {
        return this.f28822q.getDimension(i2) * C6062n.m22318k(getContext());
    }

    private void zy(Context context) {
        this.f28816k = context;
        this.f28819n = new Paint();
    }

    /* JADX INFO: renamed from: g */
    public void m17621g() {
        this.f28819n.setTextSize(toq(C5049g.q.f29039v));
        this.f28824s = toq(C5049g.q.f29019b);
        this.f28821p = toq(C5049g.q.f71495bf2);
        this.f28815j = toq(C5049g.q.f71675yz);
        this.f28823r = toq(C5049g.q.f71503c8jq);
        this.f28817l = toq(C5049g.q.f71669y2);
        this.f28808c = toq(C5049g.q.f71544gyi);
        this.f28810e = toq(C5049g.q.f71581lv5);
        this.f28820o = toq(C5049g.q.f71516dr);
        this.f28818m = toq(C5049g.q.f71601nmn5);
        this.f28807b = toq(C5049g.q.f71497bo);
        this.f28806a = toq(C5049g.q.f71631t8iq);
        this.f28829x = toq(C5049g.q.f29038u);
        this.f28814i = toq(C5049g.q.f71667xwq3);
        this.f28831z = toq(C5049g.q.f71555ikck);
        this.f28825t = toq(C5049g.q.f71521ek5k);
        this.f28813h = toq(C5049g.q.f71670y9n);
        this.f28811f = toq(C5049g.q.f71501bz2) / this.f28826u.getIntrinsicWidth();
    }

    public String getSleepDesc() {
        return this.f28828w;
    }

    public String getSleepMinute() {
        return this.f28809d;
    }

    /* JADX INFO: renamed from: n */
    public void m17622n(int i2) {
        if (this.f28822q == null) {
            Resources resources = this.f28816k.getResources();
            this.f28822q = resources;
            this.bp = resources.getString(C5049g.s.f71766se);
            this.f28826u = C0498q.m2259s(this.f28816k, C5049g.n.kho);
            this.bb = C0498q.m2259s(this.f28816k, C5049g.n.f71281zy);
            if (this.f28812g == 0) {
                this.f28812g = this.f28822q.getColor(C5049g.zy.f29095k);
            }
            if (this.f28830y == 0) {
                this.f28830y = this.f28822q.getColor(C5049g.zy.f29098q);
            }
            Drawable drawable = this.f28826u;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f28826u.getIntrinsicHeight());
            Drawable drawable2 = this.bb;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.bb.getIntrinsicHeight());
            m17621g();
        }
        if (i2 <= 0) {
            this.f28828w = "";
            this.f70918ab = 0;
            Resources resources2 = this.f28822q;
            int i3 = C5049g.s.f29055l;
            String str = this.bp;
            this.f28809d = resources2.getString(i3, str, str);
            this.f28827v = 0.0f;
        } else {
            if (i2 > 645) {
                this.f28828w = this.f28822q.getString(C5049g.s.f29049f);
                this.f70918ab = 2;
            } else if (i2 > 480) {
                this.f28828w = this.f28822q.getString(C5049g.s.f29046c);
                this.f70918ab = 4;
            } else if (i2 > 360) {
                this.f28828w = this.f28822q.getString(C5049g.s.f71749n5r1);
                this.f70918ab = 3;
            } else if (i2 > 300) {
                this.f28828w = this.f28822q.getString(C5049g.s.f29049f);
                this.f70918ab = 2;
            } else {
                this.f28828w = this.f28822q.getString(C5049g.s.f71724hyr);
                this.f70918ab = 1;
            }
            this.f28809d = this.f28822q.getString(C5049g.s.f29055l, Integer.toString(i2 / 60), Integer.toString(i2 % 60));
            this.f28827v = this.f28819n.measureText(this.f28828w);
        }
        this.f70919bo = this.f28819n.measureText(this.f28809d);
        this.f28826u.setTint(this.f28812g);
        this.bb.setTint(this.f28812g);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float intrinsicWidth;
        super.onDraw(canvas);
        if (this.f28822q == null) {
            return;
        }
        boolean zN7h = C6062n.n7h();
        if (zN7h) {
            float measuredWidth = getMeasuredWidth();
            float f7 = measuredWidth - ((this.f28817l + (this.f28820o * 4.0f)) + (this.f28810e * 3.0f));
            float intrinsicWidth2 = (measuredWidth - this.f28824s) - this.f28826u.getIntrinsicWidth();
            float f8 = (measuredWidth - this.f28814i) - this.f70919bo;
            if (TextUtils.isEmpty(this.f28828w)) {
                f6 = measuredWidth - this.f28813h;
                intrinsicWidth = this.bb.getIntrinsicWidth();
            } else {
                f6 = measuredWidth - this.f28813h;
                intrinsicWidth = this.f28827v;
            }
            f5 = f6 - intrinsicWidth;
            f3 = f7;
            f4 = intrinsicWidth2;
            f2 = f8;
        } else {
            float f9 = this.f28824s;
            float f10 = this.f28817l;
            f2 = this.f28814i;
            f3 = f10;
            f4 = f9;
            f5 = this.f28813h;
        }
        this.f28819n.setColor(this.f28812g);
        if (zN7h) {
            int length = this.f28809d.length();
            canvas.drawTextRun((CharSequence) this.f28809d, 0, length, 0, length, f2, this.f28831z, true, this.f28819n);
        } else {
            canvas.drawText(this.f28809d, f2, this.f28831z, this.f28819n);
        }
        this.f28819n.setColor(this.f28830y);
        if (TextUtils.isEmpty(this.f28828w)) {
            canvas.translate(f5, this.f28815j);
            this.bb.draw(canvas);
            canvas.translate(-f5, -this.f28815j);
        } else {
            canvas.drawText(this.f28828w, f5, this.f28825t, this.f28819n);
        }
        canvas.save();
        canvas.translate(f4, this.f28821p);
        float f11 = this.f28811f;
        canvas.scale(f11, f11);
        this.f28826u.draw(canvas);
        canvas.restore();
        float f12 = this.f28823r;
        float f13 = f12 + this.f28818m;
        float f14 = f12 + this.f28806a;
        for (int i2 = 0; i2 < 4; i2++) {
            float f15 = f3 + (i2 * (this.f28820o + this.f28810e));
            this.f28819n.setColor(this.f28830y);
            float f16 = this.f28823r;
            float f17 = f15 + this.f28820o;
            float f18 = this.f28808c;
            canvas.drawRoundRect(f15, f16, f17, f13, f18, f18, this.f28819n);
            boolean z2 = true;
            if (!zN7h ? i2 >= this.f70918ab : i2 < 4 - this.f70918ab) {
                z2 = false;
            }
            if (z2) {
                this.f28819n.setColor(this.f28812g);
                float f19 = this.f28823r;
                float f20 = f15 + this.f28807b;
                float f21 = this.f28829x;
                canvas.drawRoundRect(f15, f19, f20, f14, f21, f21, this.f28819n);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            size = (int) (this.f28817l + this.f28814i + Math.max(this.f70919bo, (((this.bb == null || !TextUtils.isEmpty(this.f28828w)) ? this.f28827v : this.bb.getIntrinsicWidth()) + this.f28813h) - this.f28824s));
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        int iM17620k = View.MeasureSpec.getMode(i3) != 1073741824 ? m17620k(C5049g.q.f71621qo) : View.MeasureSpec.getSize(i3);
        Log.i("HealthMsgSleepChartView", "w = " + size + ", h = " + iM17620k);
        setMeasuredDimension(size, iM17620k);
    }

    /* JADX INFO: renamed from: q */
    public void m17623q(int i2, int i3) {
        if (i2 != 0) {
            this.f28812g = i2;
        }
        if (i3 != 0) {
            this.f28830y = i3;
        }
        Drawable drawable = this.f28826u;
        if (drawable != null) {
            drawable.setTint(i2);
        }
        Drawable drawable2 = this.bb;
        if (drawable2 != null) {
            drawable2.setTint(i2);
        }
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f28819n.setTypeface(typeface);
    }

    public HealthMsgSleepChartView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        zy(context);
    }

    public HealthMsgSleepChartView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        zy(context);
    }

    public HealthMsgSleepChartView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        zy(context);
    }
}
