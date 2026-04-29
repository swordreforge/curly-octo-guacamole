package com.miui.clock;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.EnumC5068g;
import com.miui.clock.module.qrj;
import gcp.C6062n;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class MiuiTextGlassView extends TextView {

    /* JADX INFO: renamed from: c */
    private boolean f28693c;

    /* JADX INFO: renamed from: e */
    private boolean f28694e;

    /* JADX INFO: renamed from: f */
    private boolean f28695f;

    /* JADX INFO: renamed from: g */
    private float f28696g;

    /* JADX INFO: renamed from: h */
    private AbstractC5071k f28697h;

    /* JADX INFO: renamed from: i */
    private int f28698i;

    /* JADX INFO: renamed from: j */
    protected boolean f28699j;

    /* JADX INFO: renamed from: k */
    private EnumC5068g f28700k;

    /* JADX INFO: renamed from: l */
    private int f28701l;

    /* JADX INFO: renamed from: m */
    private int f28702m;

    /* JADX INFO: renamed from: n */
    private int f28703n;

    /* JADX INFO: renamed from: o */
    private final Rect f28704o;

    /* JADX INFO: renamed from: p */
    private float f28705p;

    /* JADX INFO: renamed from: q */
    private int f28706q;

    /* JADX INFO: renamed from: r */
    private int f28707r;

    /* JADX INFO: renamed from: s */
    private float f28708s;

    /* JADX INFO: renamed from: t */
    private int f28709t;

    /* JADX INFO: renamed from: y */
    private float f28710y;

    /* JADX INFO: renamed from: z */
    private int f28711z;

    /* JADX INFO: renamed from: com.miui.clock.MiuiTextGlassView$k */
    static /* synthetic */ class C5041k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28712k;

        static {
            int[] iArr = new int[EnumC5068g.values().length];
            f28712k = iArr;
            try {
                iArr[EnumC5068g.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28712k[EnumC5068g.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28712k[EnumC5068g.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28712k[EnumC5068g.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MiuiTextGlassView(Context context) {
        super(context);
        this.f28700k = EnumC5068g.NONE;
        this.f28697h = new qrj();
        this.f28704o = new Rect();
        this.f28702m = -1;
        m17569n();
    }

    private boolean f7l8() {
        return (getGravity() & androidx.core.view.qrj.f50866zy) == 8388613;
    }

    /* JADX INFO: renamed from: g */
    private boolean m17567g() {
        return (getGravity() & androidx.core.view.qrj.f4101q) == 1;
    }

    /* JADX INFO: renamed from: k */
    private void m17568k(boolean z2, boolean z3, int i2) {
        if (i2 < 1 || !this.f28699j) {
            this.f28700k = EnumC5068g.NONE;
            return;
        }
        if (z2) {
            this.f28700k = EnumC5068g.BOTH;
        } else if (z3) {
            this.f28700k = EnumC5068g.LEFT;
        } else {
            this.f28700k = EnumC5068g.RIGHT;
        }
    }

    private void ld6() {
        boolean z2;
        boolean z3;
        boolean z5;
        String string = getText().toString();
        int length = getText().length();
        m17568k(m17567g(), C6062n.n7h() || f7l8(), length);
        int i2 = C5041k.f28712k[this.f28700k.ordinal()];
        if (i2 == 1) {
            z2 = false;
            z3 = false;
            z5 = true;
        } else if (i2 == 2) {
            z5 = false;
            z3 = false;
            z2 = true;
        } else {
            if (i2 != 3) {
                return;
            }
            if (length == 1) {
                z5 = false;
                z2 = false;
                z3 = true;
            } else {
                z3 = false;
                z5 = true;
                z2 = true;
            }
        }
        TextPaint paint = getPaint();
        if (z5) {
            String strSubstring = string.substring(0, 1);
            this.f28693c = m17572y(strSubstring);
            paint.getTextBounds(strSubstring, 0, 1, this.f28704o);
            this.f28696g = paint.measureText(strSubstring);
            Rect rect = this.f28704o;
            this.f28708s = rect.left;
            this.f28706q = rect.width();
            this.f28698i = this.f28693c ? this.f28701l : this.f28707r;
        }
        if (z2) {
            String strSubstring2 = string.substring(length - 1, length);
            this.f28695f = m17572y(strSubstring2);
            paint.getTextBounds(strSubstring2, 0, 1, this.f28704o);
            float fMeasureText = paint.measureText(strSubstring2);
            this.f28710y = fMeasureText;
            Rect rect2 = this.f28704o;
            this.f28705p = fMeasureText - rect2.right;
            this.f28703n = rect2.width();
            this.f28711z = this.f28695f ? this.f28701l : this.f28707r;
        }
        if (z3) {
            paint.getTextBounds(string, 0, 1, this.f28704o);
            this.f28708s = this.f28704o.left;
            float fMeasureText2 = paint.measureText(string);
            this.f28710y = fMeasureText2;
            this.f28696g = fMeasureText2;
            Rect rect3 = this.f28704o;
            this.f28705p = fMeasureText2 - rect3.right;
            int iWidth = rect3.width();
            this.f28703n = iWidth;
            this.f28706q = iWidth;
            boolean zM17572y = m17572y(string);
            this.f28694e = zM17572y;
            this.f28709t = zM17572y ? this.f28701l : this.f28707r;
        }
        requestLayout();
    }

    /* JADX INFO: renamed from: n */
    private void m17569n() {
        setMaxLines(1);
        m17570p();
        x2();
    }

    /* JADX INFO: renamed from: p */
    private void m17570p() {
        TextPaint paint = getPaint();
        this.f28707r = (int) Math.ceil(paint.measureText("时"));
        this.f28701l = (int) Math.ceil(paint.measureText("0"));
    }

    /* JADX INFO: renamed from: q */
    private float m17571q(float f2, int i2, boolean z2) {
        float[] fArrNi7 = z2 ? this.f28697h.ni7() : this.f28697h.mo17712q();
        float f3 = i2;
        return (((((fArrNi7[0] + fArrNi7[1]) + fArrNi7[2]) + fArrNi7[3]) * f3) - f2) - ((f3 - f2) / 2.0f);
    }

    private void toq(Canvas canvas, float f2, float f3, float f4, float f5, float f6, String str, int i2, Paint paint, float f7, float f8, float[] fArr) {
        canvas.save();
        float f9 = i2;
        canvas.clipRect(f3, 0.0f, f2, f9);
        canvas.drawText(str, (f2 - (fArr[4] * f7)) - f8, f6, paint);
        canvas.restore();
        canvas.save();
        canvas.clipRect(f4, 0.0f, f3, f9);
        canvas.drawText(str, (f3 - (fArr[5] * f7)) - f8, f6, paint);
        canvas.restore();
        canvas.save();
        canvas.clipRect(f5, 0.0f, f4, f9);
        canvas.drawText(str, (f4 - (f7 * fArr[6])) - f8, f6, paint);
        canvas.restore();
    }

    private void x2() {
        int i2 = this.f28702m;
        if (i2 > 0) {
            setTextDirection(i2);
        } else {
            setTextDirection(C6062n.n7h() ? 4 : 3);
        }
    }

    /* JADX INFO: renamed from: y */
    private boolean m17572y(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void zy(Canvas canvas, float f2, float f3, float f4, float f5, float f6, String str, int i2, Paint paint, float f7, float f8, float[] fArr, float f9) {
        canvas.save();
        float f10 = i2;
        canvas.clipRect(f2, 0.0f, f3, f10);
        canvas.drawText(str, ((f2 + (fArr[4] * f7)) + f8) - f9, f6, paint);
        canvas.restore();
        canvas.save();
        canvas.clipRect(f4, 0.0f, f3, f10);
        canvas.drawText(str, ((f3 + (fArr[5] * f7)) + f8) - f9, f6, paint);
        canvas.restore();
        canvas.save();
        canvas.clipRect(f5, 0.0f, f4, f10);
        canvas.drawText(str, ((f4 + (f7 * fArr[6])) + f8) - f9, f6, paint);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x2();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onDraw(android.graphics.Canvas r35) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.clock.MiuiTextGlassView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        String string = getText().toString();
        if (TextUtils.isEmpty(string) || this.f28700k == EnumC5068g.NONE) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        float f2 = measuredWidth;
        if (f2 == getPaint().measureText(string)) {
            float fM17571q = 0.0f;
            int i4 = C5041k.f28712k[this.f28700k.ordinal()];
            if (i4 == 1) {
                fM17571q = m17571q(this.f28696g, this.f28698i, this.f28693c);
            } else if (i4 == 2) {
                fM17571q = m17571q(this.f28710y, this.f28711z, this.f28695f);
            } else if (i4 == 3) {
                if (string.length() == 1) {
                    float[] fArrNi7 = this.f28694e ? this.f28697h.ni7() : this.f28697h.mo17712q();
                    fM17571q = (this.f28709t * (((((fArrNi7[0] + fArrNi7[1]) + fArrNi7[2]) + fArrNi7[3]) * 2.0f) - 1.0f)) - f2;
                } else {
                    fM17571q = m17571q(this.f28710y, this.f28711z, this.f28695f) + m17571q(this.f28696g, this.f28698i, this.f28693c);
                }
            }
            setMeasuredDimension(measuredWidth + ((int) (fM17571q + 0.5f)), getMeasuredHeightAndState());
        }
    }

    /* JADX INFO: renamed from: s */
    public MiuiTextGlassView m17573s(AbstractC5071k abstractC5071k) {
        this.f28697h = abstractC5071k;
        m17570p();
        return this;
    }

    public void setEnableDiffusion(boolean z2) {
        ld6();
    }

    public void setSameNumberWidth(boolean z2) {
        setFontFeatureSettings(z2 ? "tnum" : "");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        ld6();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        super.setTextSize(i2, f2);
        m17570p();
    }

    public void setTimeLayoutDirection(int i2) {
        this.f28702m = i2;
        x2();
    }

    public MiuiTextGlassView(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28700k = EnumC5068g.NONE;
        this.f28697h = new qrj();
        this.f28704o = new Rect();
        this.f28702m = -1;
        m17569n();
    }

    public MiuiTextGlassView(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f28700k = EnumC5068g.NONE;
        this.f28697h = new qrj();
        this.f28704o = new Rect();
        this.f28702m = -1;
        m17569n();
    }

    public MiuiTextGlassView(Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f28700k = EnumC5068g.NONE;
        this.f28697h = new qrj();
        this.f28704o = new Rect();
        this.f28702m = -1;
        m17569n();
    }
}
