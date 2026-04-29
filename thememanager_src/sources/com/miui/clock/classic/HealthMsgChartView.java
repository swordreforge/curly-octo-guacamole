package com.miui.clock.classic;

import android.annotation.SuppressLint;
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
import java.util.ArrayList;
import java.util.List;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class HealthMsgChartView extends View {

    /* JADX INFO: renamed from: a */
    private float f28780a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f70916ab;

    /* JADX INFO: renamed from: b */
    private String f28781b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private String f70917bo;

    /* JADX INFO: renamed from: c */
    private float f28782c;

    /* JADX INFO: renamed from: d */
    private String f28783d;

    /* JADX INFO: renamed from: e */
    private float f28784e;

    /* JADX INFO: renamed from: f */
    private float f28785f;

    /* JADX INFO: renamed from: g */
    private int f28786g;

    /* JADX INFO: renamed from: h */
    private int f28787h;

    /* JADX INFO: renamed from: i */
    private int f28788i;

    /* JADX INFO: renamed from: j */
    private float f28789j;

    /* JADX INFO: renamed from: k */
    private Context f28790k;

    /* JADX INFO: renamed from: l */
    private float f28791l;

    /* JADX INFO: renamed from: m */
    private Drawable f28792m;

    /* JADX INFO: renamed from: n */
    private Paint f28793n;

    /* JADX INFO: renamed from: o */
    private float f28794o;

    /* JADX INFO: renamed from: p */
    private int f28795p;

    /* JADX INFO: renamed from: q */
    private Resources f28796q;

    /* JADX INFO: renamed from: r */
    private float f28797r;

    /* JADX INFO: renamed from: s */
    private int f28798s;

    /* JADX INFO: renamed from: t */
    private float f28799t;

    /* JADX INFO: renamed from: u */
    private float f28800u;

    /* JADX INFO: renamed from: v */
    private String f28801v;

    /* JADX INFO: renamed from: w */
    private final List<Integer> f28802w;

    /* JADX INFO: renamed from: x */
    private float f28803x;

    /* JADX INFO: renamed from: y */
    private int f28804y;

    /* JADX INFO: renamed from: z */
    private int f28805z;

    public HealthMsgChartView(Context context) {
        super(context);
        this.f28802w = new ArrayList();
        zy(context);
    }

    /* JADX INFO: renamed from: k */
    private int m17616k(int i2) {
        return (int) (this.f28796q.getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    private float toq(int i2) {
        return this.f28796q.getDimension(i2) * C6062n.m22318k(getContext());
    }

    @SuppressLint({"NewApi"})
    private void zy(Context context) {
        this.f28790k = context;
        this.f28793n = new Paint();
    }

    public void f7l8() {
        this.f28793n.setTextSize(m17616k(C5049g.q.f29039v));
        this.f28798s = m17616k(C5049g.q.f29019b);
        this.f28795p = m17616k(C5049g.q.f71495bf2);
        this.f28782c = m17616k(C5049g.q.f71501bz2);
        this.f28787h = m17616k(C5049g.q.f71682zp);
        this.f28788i = m17616k(C5049g.q.f29018a);
        this.f28805z = m17616k(C5049g.q.f29041x);
        this.f28797r = toq(C5049g.q.f71667xwq3);
        this.f28789j = toq(C5049g.q.f71555ikck);
        this.f28794o = toq(C5049g.q.f71521ek5k);
        this.f28799t = toq(C5049g.q.f71670y9n);
        this.f28784e = toq(C5049g.q.f71487a98o);
        this.f28791l = toq(C5049g.q.f71506ch);
        this.f28785f = toq(C5049g.q.f71550i1);
    }

    /* JADX INFO: renamed from: g */
    public void m17617g() {
        float fMeasureText = this.f28793n.measureText(this.f28801v);
        this.f28780a = fMeasureText;
        this.f28803x = fMeasureText + this.f28793n.measureText(this.f28783d);
        this.f28800u = this.f28793n.measureText(this.f28781b);
    }

    /* JADX INFO: renamed from: n */
    public void m17618n(int i2, int i3, int i4, List<Integer> list) {
        if (this.f28796q == null) {
            Resources resources = this.f28790k.getResources();
            this.f28796q = resources;
            this.f70917bo = resources.getString(C5049g.s.f71766se);
            if (this.f28786g == 0) {
                this.f28786g = this.f28796q.getColor(C5049g.zy.f29095k);
            }
            if (this.f28804y == 0) {
                this.f28804y = this.f28796q.getColor(C5049g.zy.f29098q);
            }
            f7l8();
        }
        if (i2 == 501) {
            this.f28781b = this.f28796q.getString(C5049g.s.f29048e);
            this.f28792m = C0498q.m2259s(this.f28790k, C5049g.n.olj);
        } else if (i2 != 503) {
            this.f28781b = "";
            this.f28792m = C0498q.m2259s(this.f28790k, C5049g.n.c7g);
        } else {
            this.f28781b = this.f28796q.getString(C5049g.s.f71751ncyb);
            this.f28792m = C0498q.m2259s(this.f28790k, C5049g.n.x8);
        }
        if (i3 < 0) {
            String str = this.f70917bo;
            this.f28801v = str;
            this.f28783d = this.f28796q.getString(C5049g.s.f71769t8r, str);
        } else {
            this.f28801v = Integer.toString(i3);
            this.f28783d = this.f28796q.getString(C5049g.s.f71769t8r, Integer.toString(i4));
        }
        this.f28802w.clear();
        if (list != null) {
            this.f28802w.addAll(list);
        }
        this.f70916ab = 0;
        for (Integer num : this.f28802w) {
            if (num.intValue() > this.f70916ab) {
                this.f70916ab = num.intValue();
            }
        }
        while (this.f28802w.size() < 24) {
            this.f28802w.add(0, 0);
        }
        Drawable drawable = this.f28792m;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f28792m.getIntrinsicHeight());
        this.f28792m.setTint(this.f28786g);
        m17617g();
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
        float intrinsicWidth;
        float f2;
        float f3;
        float f4;
        float f5;
        super.onDraw(canvas);
        if (this.f28796q == null) {
            return;
        }
        boolean zN7h = C6062n.n7h();
        if (zN7h) {
            int measuredWidth = getMeasuredWidth();
            float f6 = measuredWidth;
            f2 = f6 - ((this.f28788i + (this.f28791l * 24.0f)) + (this.f28784e * 23.0f));
            intrinsicWidth = (measuredWidth - this.f28798s) - this.f28792m.getIntrinsicWidth();
            f3 = (f6 - this.f28797r) - this.f28803x;
            f4 = (f6 - this.f28799t) - this.f28800u;
        } else {
            intrinsicWidth = this.f28798s;
            f2 = this.f28788i;
            f3 = this.f28797r;
            f4 = this.f28799t;
        }
        float f7 = intrinsicWidth;
        float f8 = f4;
        float f9 = f2;
        float f10 = f3;
        if (zN7h && this.f28801v.contains(this.f70917bo)) {
            this.f28793n.setColor(this.f28804y);
            int length = this.f28783d.length();
            f5 = f9;
            canvas.drawTextRun((CharSequence) this.f28783d, 0, length, 0, length, f10, this.f28789j, true, this.f28793n);
            this.f28793n.setColor(this.f28786g);
            int length2 = this.f28801v.length();
            canvas.drawTextRun(this.f28801v, 0, length2, 0, length2, (f10 + this.f28803x) - this.f28780a, this.f28789j, zN7h, this.f28793n);
        } else {
            f5 = f9;
            this.f28793n.setColor(this.f28786g);
            canvas.drawText(this.f28801v, f10, this.f28789j, this.f28793n);
            this.f28793n.setColor(this.f28804y);
            canvas.drawText(this.f28783d, f10 + this.f28780a, this.f28789j, this.f28793n);
        }
        if (!TextUtils.isEmpty(this.f28781b)) {
            canvas.drawText(this.f28781b, f8, this.f28794o, this.f28793n);
        }
        canvas.save();
        canvas.translate(f7, this.f28795p);
        float intrinsicWidth2 = this.f28782c / this.f28792m.getIntrinsicWidth();
        canvas.scale(intrinsicWidth2, intrinsicWidth2);
        this.f28792m.draw(canvas);
        canvas.restore();
        this.f28793n.setColor(this.f28804y);
        for (int i2 = 0; i2 < 24; i2++) {
            this.f28793n.setColor(this.f28804y);
            float f11 = this.f28784e;
            float f12 = this.f28791l;
            float f13 = f5 + (i2 * (f11 + f12));
            int i3 = this.f28787h;
            float f14 = i3 + this.f28785f;
            int i4 = this.f28805z;
            canvas.drawRoundRect(f13, i3, f13 + f12, f14, i4, i4, this.f28793n);
            List<Integer> list = this.f28802w;
            float fIntValue = (zN7h ? list.get(23 - i2) : list.get(i2)).intValue();
            if (fIntValue > 0.0f) {
                this.f28793n.setColor(this.f28786g);
                float f15 = f14 - ((fIntValue / this.f70916ab) * this.f28785f);
                float f16 = f13 + this.f28791l;
                int i5 = this.f28805z;
                canvas.drawRoundRect(f13, f15, f16, f14, i5, i5, this.f28793n);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            int i4 = this.f28788i;
            size = (int) Math.max(i4 + this.f28797r + this.f28803x, i4 + this.f28799t + this.f28800u);
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        int iM17616k = View.MeasureSpec.getMode(i3) != 1073741824 ? m17616k(C5049g.q.f71681zkd) : View.MeasureSpec.getSize(i3);
        Log.i("HealthMsgChartView", "w = " + size + ", h = " + iM17616k);
        setMeasuredDimension(size, iM17616k);
    }

    /* JADX INFO: renamed from: q */
    public void m17619q(int i2, int i3) {
        if (i2 != 0) {
            this.f28786g = i2;
        }
        if (i3 != 0) {
            this.f28804y = i3;
        }
        Drawable drawable = this.f28792m;
        if (drawable != null) {
            drawable.setTint(i2);
        }
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f28793n.setTypeface(typeface);
    }

    public HealthMsgChartView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28802w = new ArrayList();
        zy(context);
    }

    public HealthMsgChartView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28802w = new ArrayList();
        zy(context);
    }

    public HealthMsgChartView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f28802w = new ArrayList();
        zy(context);
    }
}
