package com.miui.clock.classic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import gcp.C6062n;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class HealthMsgTextView extends View {

    /* JADX INFO: renamed from: a */
    private float f28832a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private float f70920ab;

    /* JADX INFO: renamed from: b */
    private Drawable f28833b;
    private float bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f70921bo;
    private String bp;

    /* JADX INFO: renamed from: c */
    private float f28834c;

    /* JADX INFO: renamed from: d */
    private float f28835d;

    /* JADX INFO: renamed from: e */
    private float f28836e;

    /* JADX INFO: renamed from: f */
    private String f28837f;

    /* JADX INFO: renamed from: g */
    private int f28838g;

    /* JADX INFO: renamed from: h */
    private float f28839h;

    /* JADX INFO: renamed from: i */
    private String f28840i;

    /* JADX INFO: renamed from: j */
    private String f28841j;

    /* JADX INFO: renamed from: k */
    private Context f28842k;

    /* JADX INFO: renamed from: l */
    private String f28843l;

    /* JADX INFO: renamed from: m */
    private Drawable f28844m;

    /* JADX INFO: renamed from: n */
    private Paint f28845n;

    /* JADX INFO: renamed from: o */
    private Drawable f28846o;

    /* JADX INFO: renamed from: p */
    private float f28847p;

    /* JADX INFO: renamed from: q */
    private Resources f28848q;

    /* JADX INFO: renamed from: r */
    private float f28849r;

    /* JADX INFO: renamed from: s */
    private String f28850s;

    /* JADX INFO: renamed from: t */
    private float f28851t;

    /* JADX INFO: renamed from: u */
    private float f28852u;

    /* JADX INFO: renamed from: v */
    private float f28853v;

    /* JADX INFO: renamed from: w */
    private float f28854w;

    /* JADX INFO: renamed from: x */
    private float f28855x;

    /* JADX INFO: renamed from: y */
    private int f28856y;

    /* JADX INFO: renamed from: z */
    private String f28857z;

    public HealthMsgTextView(Context context) {
        super(context);
        m17625n(context);
    }

    /* JADX INFO: renamed from: k */
    private void m17624k(Canvas canvas, Drawable drawable, float f2, float f3, float f4) {
        canvas.save();
        canvas.translate(f2, f3);
        canvas.scale(f4, f4);
        drawable.draw(canvas);
        canvas.restore();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: n */
    private void m17625n(Context context) {
        this.f28842k = context;
        this.f28845n = new Paint();
    }

    /* JADX INFO: renamed from: q */
    private float m17626q(int i2) {
        return this.f28848q.getDimension(i2) * C6062n.m22318k(getContext());
    }

    private void toq(Canvas canvas, float f2, float f3, String str, float f4, float f5, String str2, Paint paint, boolean z2) {
        if (!z2 || !str.contains(this.bp)) {
            paint.setColor(this.f28838g);
            canvas.drawText(str, f2, f3, paint);
            paint.setColor(this.f28856y);
            canvas.drawText(str2, f2 + f4, f3, paint);
            return;
        }
        paint.setColor(this.f28856y);
        int length = str2.length();
        canvas.drawTextRun((CharSequence) str2, 0, length, 0, length, f2, f3, true, paint);
        paint.setColor(this.f28838g);
        int length2 = str.length();
        canvas.drawTextRun((CharSequence) str, 0, length2, 0, length2, (f2 + f5) - f4, f3, true, paint);
    }

    private int zy(int i2) {
        return (int) (this.f28848q.getDimensionPixelSize(i2) * C6062n.m22318k(getContext()));
    }

    public void f7l8(int i2, int i3, int i4, int i5, int i6, int i7) {
        if (this.f28848q == null) {
            Resources resources = this.f28842k.getResources();
            this.f28848q = resources;
            this.f28838g = resources.getColor(C5049g.zy.f29095k);
            this.f28856y = this.f28848q.getColor(C5049g.zy.f29098q);
            this.bp = this.f28848q.getString(C5049g.s.f71766se);
            this.f28846o = C0498q.m2259s(this.f28842k, C5049g.n.x8);
            this.f28844m = C0498q.m2259s(this.f28842k, C5049g.n.olj);
            this.f28833b = C0498q.m2259s(this.f28842k, C5049g.n.c7g);
            Drawable drawable = this.f28846o;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f28846o.getIntrinsicHeight());
            Drawable drawable2 = this.f28844m;
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f28844m.getIntrinsicHeight());
            Drawable drawable3 = this.f28833b;
            drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), this.f28833b.getIntrinsicHeight());
            m17628s();
        }
        this.f28846o.setTint(this.f28838g);
        this.f28844m.setTint(this.f28838g);
        this.f28833b.setTint(this.f28838g);
        if (i2 < 0) {
            this.f28850s = this.bp;
        } else {
            this.f28850s = Integer.toString(i2);
        }
        if (i3 < 0) {
            this.f28840i = this.f28848q.getString(C5049g.s.f71769t8r, this.bp);
        } else {
            this.f28840i = this.f28848q.getString(C5049g.s.f71769t8r, Integer.toString(i3));
        }
        if (i4 < 0) {
            this.f28857z = this.bp;
        } else {
            this.f28857z = Integer.toString(i4);
        }
        if (i5 < 0) {
            this.f28843l = this.f28848q.getString(C5049g.s.f71769t8r, this.bp);
        } else {
            this.f28843l = this.f28848q.getString(C5049g.s.f71769t8r, Integer.toString(i5));
        }
        if (i6 < 0) {
            this.f28837f = this.bp;
        } else {
            this.f28837f = Integer.toString(i6);
        }
        if (i7 < 0) {
            this.f28841j = this.f28848q.getString(C5049g.s.f71769t8r, this.bp);
        } else {
            this.f28841j = this.f28848q.getString(C5049g.s.f71769t8r, Integer.toString(i7));
        }
        m17629y();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m17627g(int i2, int i3) {
        if (i2 != 0) {
            this.f28838g = i2;
        }
        if (i3 != 0) {
            this.f28856y = i3;
        }
        Drawable drawable = this.f28846o;
        if (drawable != null) {
            drawable.setTint(i2);
        }
        Drawable drawable2 = this.f28844m;
        if (drawable2 != null) {
            drawable2.setTint(i2);
        }
        Drawable drawable3 = this.f28833b;
        if (drawable3 != null) {
            drawable3.setTint(i2);
        }
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
        super.onDraw(canvas);
        if (this.f28848q == null) {
            return;
        }
        float intrinsicWidth = this.bb / this.f28846o.getIntrinsicWidth();
        boolean zN7h = C6062n.n7h();
        if (zN7h) {
            float measuredWidth = getMeasuredWidth();
            float intrinsicWidth2 = (measuredWidth - this.f28832a) - (this.f28846o.getIntrinsicWidth() * intrinsicWidth);
            float f6 = this.f28855x;
            float f7 = (measuredWidth - f6) - this.f28839h;
            float f8 = (measuredWidth - f6) - this.f28849r;
            f5 = (measuredWidth - f6) - this.f28836e;
            f2 = intrinsicWidth2;
            f3 = f7;
            f4 = f8;
        } else {
            f2 = this.f28832a;
            f3 = this.f28855x;
            f4 = f3;
            f5 = f4;
        }
        float f9 = f2;
        m17624k(canvas, this.f28846o, f9, this.f28852u, intrinsicWidth);
        m17624k(canvas, this.f28844m, f9, this.f28853v, intrinsicWidth);
        m17624k(canvas, this.f28833b, f9, this.f28854w, intrinsicWidth);
        toq(canvas, f3, this.f70921bo, this.f28850s, this.f28847p, this.f28839h, this.f28840i, this.f28845n, zN7h);
        toq(canvas, f4, this.f28835d, this.f28857z, this.f28851t, this.f28849r, this.f28843l, this.f28845n, zN7h);
        toq(canvas, f5, this.f70920ab, this.f28837f, this.f28834c, this.f28836e, this.f28841j, this.f28845n, zN7h);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMax = View.MeasureSpec.getMode(i2) != 1073741824 ? (int) (this.f28855x + Math.max(Math.max(this.f28839h, this.f28849r), this.f28836e)) : View.MeasureSpec.getSize(i2);
        int iZy = View.MeasureSpec.getMode(i3) != 1073741824 ? zy(C5049g.q.f71621qo) : View.MeasureSpec.getSize(i3);
        Log.i("HealthMsgTextView", "w = " + iMax + ", h = " + iZy);
        setMeasuredDimension(iMax, iZy);
    }

    /* JADX INFO: renamed from: s */
    public void m17628s() {
        this.f28845n.setTextSize(zy(C5049g.q.f71553i9jn));
        this.f28832a = m17626q(C5049g.q.f71537g1);
        this.f28852u = m17626q(C5049g.q.f71633tfm);
        this.f28853v = m17626q(C5049g.q.f71656wo);
        this.f28854w = m17626q(C5049g.q.f71514d8wk);
        this.f28855x = m17626q(C5049g.q.f71618py);
        this.f70921bo = m17626q(C5049g.q.f71654was);
        this.f28835d = m17626q(C5049g.q.f71540gbni);
        this.f70920ab = m17626q(C5049g.q.f71683zsr0);
        this.bb = m17626q(C5049g.q.f29021d);
    }

    public void setTypeface(Typeface typeface) {
        this.f28845n.setTypeface(typeface);
    }

    /* JADX INFO: renamed from: y */
    public void m17629y() {
        this.f28847p = this.f28845n.measureText(this.f28850s);
        this.f28851t = this.f28845n.measureText(this.f28857z);
        this.f28834c = this.f28845n.measureText(this.f28837f);
        this.f28839h = this.f28847p + this.f28845n.measureText(this.f28840i);
        this.f28849r = this.f28851t + this.f28845n.measureText(this.f28843l);
        this.f28836e = this.f28834c + this.f28845n.measureText(this.f28841j);
    }

    public HealthMsgTextView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        m17625n(context);
    }

    public HealthMsgTextView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m17625n(context);
    }

    public HealthMsgTextView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        m17625n(context);
    }
}
