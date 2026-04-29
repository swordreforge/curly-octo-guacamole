package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.view.C0683f;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.qrj;
import com.google.android.material.resources.C4090k;
import com.google.android.material.resources.C4092q;
import com.google.android.material.resources.C4093y;
import ki.C6116k;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: CollapsingTextHelper.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class toq {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f67668bo = "CollapsingTextHelper";

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final float f67669c8jq = 0.5f;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    private static final boolean f67671gyi = false;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f67672y2 = "…";

    /* JADX INFO: renamed from: a */
    private float f24610a;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private C4090k f67673a9;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private float f67674a98o;

    /* JADX INFO: renamed from: b */
    private float f24611b;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private float f67675bf2;

    /* JADX INFO: renamed from: c */
    @lvui
    private final TextPaint f24612c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f67676cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    @dd
    private Bitmap f67678d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f67679d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private float f67680dd;

    /* JADX INFO: renamed from: e */
    private float f24613e;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    private float f67681ek5k;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private boolean f67682eqxt;

    /* JADX INFO: renamed from: f */
    private boolean f24614f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67683f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private float f67684fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private C4090k f67685fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private Typeface f67686fu4;

    /* JADX INFO: renamed from: g */
    private float f24615g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    @dd
    private CharSequence f67687gvn7;

    /* JADX INFO: renamed from: h */
    private ColorStateList f24616h;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private float f67688hb;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private int[] f67689hyr;

    /* JADX INFO: renamed from: i */
    private float f24617i;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private StaticLayout f67690i1;

    /* JADX INFO: renamed from: j */
    private ColorStateList f24618j;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private Typeface f67691jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    @dd
    private CharSequence f67692jp0y;

    /* JADX INFO: renamed from: k */
    private final View f24619k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private float f67693ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private ColorStateList f67694kja0;

    /* JADX INFO: renamed from: l */
    private float f24620l;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    @lvui
    private final TextPaint f67696lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private Paint f67698lvui;

    /* JADX INFO: renamed from: m */
    private float f24621m;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private Typeface f67699mcp;

    /* JADX INFO: renamed from: n */
    private float f24622n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int f67700n5r1;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private float f67702ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private float f67703ni7;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private float f67705nn86;

    /* JADX INFO: renamed from: o */
    private float f24623o;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private Typeface f67706o1t;

    /* JADX INFO: renamed from: p */
    @lvui
    private final RectF f24624p;

    /* JADX INFO: renamed from: q */
    private boolean f24625q;

    /* JADX INFO: renamed from: r */
    private float f24626r;

    /* JADX INFO: renamed from: s */
    @lvui
    private final Rect f24627s;

    /* JADX INFO: renamed from: t */
    private Typeface f24628t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private float f67710t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f67711toq;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private TimeInterpolator f67712uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private TimeInterpolator f67713vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private Typeface f67714wvg;

    /* JADX INFO: renamed from: x */
    private CharSequence f24629x;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f67716x9kr;

    /* JADX INFO: renamed from: y */
    @lvui
    private final Rect f24630y;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private float f67717y9n;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private ColorStateList f67718yz;

    /* JADX INFO: renamed from: z */
    private Typeface f24631z;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private float f67719zp;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private float f67720zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f67721zy;

    /* JADX INFO: renamed from: u */
    private static final boolean f24609u = false;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    @lvui
    private static final Paint f67670dr = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f67695ld6 = 16;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f67715x2 = 16;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f67708qrj = 15.0f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f67701n7h = 15.0f;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private boolean f67707oc = true;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private int f67677ch = 1;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private float f67704nmn5 = 0.0f;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private float f67697lv5 = 1.0f;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private int f67709t8iq = qrj.f67658n7h;

    /* JADX INFO: renamed from: com.google.android.material.internal.toq$k */
    /* JADX INFO: compiled from: CollapsingTextHelper.java */
    class C4055k implements C4090k.k {
        C4055k() {
        }

        @Override // com.google.android.material.resources.C4090k.k
        /* JADX INFO: renamed from: k */
        public void mo14617k(Typeface typeface) {
            toq.this.m14607a(typeface);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CollapsingTextHelper.java */
    class C7976toq implements C4090k.k {
        C7976toq() {
        }

        @Override // com.google.android.material.resources.C4090k.k
        /* JADX INFO: renamed from: k */
        public void mo14617k(Typeface typeface) {
            toq.this.gyi(typeface);
        }
    }

    public toq(View view) {
        this.f24619k = view;
        TextPaint textPaint = new TextPaint(129);
        this.f24612c = textPaint;
        this.f67696lrht = new TextPaint(textPaint);
        this.f24627s = new Rect();
        this.f24630y = new Rect();
        this.f24624p = new RectF();
        this.f24615g = m14599n();
        m14610e(view.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: b */
    private void m14592b(float f2) {
        this.f24610a = f2;
        C0683f.h7am(this.f24619k);
    }

    private boolean dr(Typeface typeface) {
        C4090k c4090k = this.f67673a9;
        if (c4090k != null) {
            c4090k.zy();
        }
        if (this.f67699mcp == typeface) {
            return false;
        }
        this.f67699mcp = typeface;
        Typeface qVar = C4093y.toq(this.f24619k.getContext().getResources().getConfiguration(), typeface);
        this.f24628t = qVar;
        if (qVar == null) {
            qVar = this.f67699mcp;
        }
        this.f67714wvg = qVar;
        return true;
    }

    /* JADX INFO: renamed from: f */
    private boolean m14593f() {
        return C0683f.m3159e(this.f24619k) == 1;
    }

    private void f7l8(float f2) {
        float f3;
        n5r1(f2);
        if (!this.f24625q) {
            this.f67720zurt = vyq(this.f24617i, this.f67684fn3e, f2, this.f67712uv6);
            this.f67703ni7 = vyq(this.f67693ki, this.f67710t8r, f2, this.f67712uv6);
            mu(f2);
            f3 = f2;
        } else if (f2 < this.f24615g) {
            this.f67720zurt = this.f24617i;
            this.f67703ni7 = this.f67693ki;
            mu(0.0f);
            f3 = 0.0f;
        } else {
            this.f67720zurt = this.f67684fn3e;
            this.f67703ni7 = this.f67710t8r - Math.max(0, this.f67683f7l8);
            mu(1.0f);
            f3 = 1.0f;
        }
        TimeInterpolator timeInterpolator = C3910k.f67312toq;
        m14592b(1.0f - vyq(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        m14604u(vyq(1.0f, 0.0f, f2, timeInterpolator));
        if (this.f24616h != this.f67694kja0) {
            this.f24612c.setColor(m14596k(m14606z(), ni7(), f3));
        } else {
            this.f24612c.setColor(ni7());
        }
        float f4 = this.f67717y9n;
        float f5 = this.f24611b;
        if (f4 != f5) {
            this.f24612c.setLetterSpacing(vyq(f5, f4, f2, timeInterpolator));
        } else {
            this.f24612c.setLetterSpacing(f4);
        }
        this.f67716x9kr = vyq(this.f24623o, this.f24613e, f2, null);
        this.f67702ncyb = vyq(this.f24621m, this.f67705nn86, f2, null);
        this.f24620l = vyq(this.f67681ek5k, this.f67688hb, f2, null);
        int iM14596k = m14596k(fu4(this.f67718yz), fu4(this.f24618j), f2);
        this.f67700n5r1 = iM14596k;
        this.f24612c.setShadowLayer(this.f67716x9kr, this.f67702ncyb, this.f24620l, iM14596k);
        if (this.f24625q) {
            this.f24612c.setAlpha((int) (m14601q(f2) * this.f24612c.getAlpha()));
        }
        C0683f.h7am(this.f24619k);
    }

    @zy.x2
    private int fu4(@dd ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f67689hyr;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    private boolean m14594g(@lvui CharSequence charSequence) {
        boolean zM14593f = m14593f();
        return this.f67707oc ? uv6(charSequence, zM14593f) : zM14593f;
    }

    private boolean gbni() {
        return this.f67677ch > 1 && (!this.f67679d3 || this.f24625q) && !this.f67682eqxt;
    }

    private static boolean hyr(float f2, float f3) {
        return Math.abs(f2 - f3) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: i */
    private float m14595i(@lvui RectF rectF, int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) + (this.f67674a98o / 2.0f) : ((i3 & androidx.core.view.qrj.f50866zy) == 8388613 || (i3 & 5) == 5) ? this.f67679d3 ? rectF.left + this.f67674a98o : this.f24627s.right : this.f67679d3 ? this.f24627s.right : rectF.left + this.f67674a98o;
    }

    @zy.x2
    /* JADX INFO: renamed from: k */
    private static int m14596k(@zy.x2 int i2, @zy.x2 int i3, @zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((Color.alpha(i2) * f3) + (Color.alpha(i3) * f2)), Math.round((Color.red(i2) * f3) + (Color.red(i3) * f2)), Math.round((Color.green(i2) * f3) + (Color.green(i3) * f2)), Math.round((Color.blue(i2) * f3) + (Color.blue(i3) * f2)));
    }

    /* JADX INFO: renamed from: l */
    private void m14597l(@lvui TextPaint textPaint) {
        textPaint.setTextSize(this.f67708qrj);
        textPaint.setTypeface(this.f67714wvg);
        textPaint.setLetterSpacing(this.f24611b);
    }

    private StaticLayout ld6(int i2, float f2, boolean z2) {
        StaticLayout staticLayoutM14585k;
        try {
            staticLayoutM14585k = qrj.zy(this.f67692jp0y, this.f24612c, (int) f2).m14586n(TextUtils.TruncateAt.END).m14589s(z2).m14588q(i2 == 1 ? Layout.Alignment.ALIGN_NORMAL : m14602r()).m14590y(false).ld6(i2).m14587p(this.f67704nmn5, this.f67697lv5).f7l8(this.f67709t8iq).m14585k();
        } catch (qrj.C4053k e2) {
            Log.e(f67668bo, e2.getCause().getMessage(), e2);
            staticLayoutM14585k = null;
        }
        return (StaticLayout) androidx.core.util.n7h.x2(staticLayoutM14585k);
    }

    /* JADX INFO: renamed from: m */
    private static boolean m14598m(@lvui Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    private void mu(float f2) {
        m14605y(f2);
        boolean z2 = f24609u && this.f24626r != 1.0f;
        this.f67682eqxt = z2;
        if (z2) {
            n7h();
        }
        C0683f.h7am(this.f24619k);
    }

    /* JADX INFO: renamed from: n */
    private float m14599n() {
        float f2 = this.f24622n;
        return f2 + ((1.0f - f2) * 0.5f);
    }

    private void n5r1(float f2) {
        if (this.f24625q) {
            this.f24624p.set(f2 < this.f24615g ? this.f24630y : this.f24627s);
            return;
        }
        this.f24624p.left = vyq(this.f24630y.left, this.f24627s.left, f2, this.f67712uv6);
        this.f24624p.top = vyq(this.f67693ki, this.f67710t8r, f2, this.f67712uv6);
        this.f24624p.right = vyq(this.f24630y.right, this.f24627s.right, f2, this.f67712uv6);
        this.f24624p.bottom = vyq(this.f24630y.bottom, this.f24627s.bottom, f2, this.f67712uv6);
    }

    private void n7h() {
        if (this.f67678d2ok != null || this.f24630y.isEmpty() || TextUtils.isEmpty(this.f67687gvn7)) {
            return;
        }
        f7l8(0.0f);
        int width = this.f67690i1.getWidth();
        int height = this.f67690i1.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f67678d2ok = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f67690i1.draw(new Canvas(this.f67678d2ok));
        if (this.f67698lvui == null) {
            this.f67698lvui = new Paint(3);
        }
    }

    private void ncyb(@lvui TextPaint textPaint) {
        textPaint.setTextSize(this.f67701n7h);
        textPaint.setTypeface(this.f67686fu4);
        textPaint.setLetterSpacing(this.f67717y9n);
    }

    private float nn86(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: p */
    private void m14600p() {
        Bitmap bitmap = this.f67678d2ok;
        if (bitmap != null) {
            bitmap.recycle();
            this.f67678d2ok = null;
        }
    }

    /* JADX INFO: renamed from: q */
    private float m14601q(@zy.zurt(from = 0.0d, to = 1.0d) float f2) {
        float f3 = this.f24615g;
        return f2 <= f3 ? C3910k.toq(1.0f, 0.0f, this.f24622n, f3, f2) : C3910k.toq(0.0f, 1.0f, f3, 1.0f, f2);
    }

    private void qrj(@lvui Canvas canvas, float f2, float f3) {
        int alpha = this.f24612c.getAlpha();
        canvas.translate(f2, f3);
        float f4 = alpha;
        this.f24612c.setAlpha((int) (this.f67719zp * f4));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            TextPaint textPaint = this.f24612c;
            textPaint.setShadowLayer(this.f67716x9kr, this.f67702ncyb, this.f24620l, com.google.android.material.color.kja0.m14282k(this.f67700n5r1, textPaint.getAlpha()));
        }
        this.f67690i1.draw(canvas);
        this.f24612c.setAlpha((int) (this.f24610a * f4));
        if (i2 >= 31) {
            TextPaint textPaint2 = this.f24612c;
            textPaint2.setShadowLayer(this.f67716x9kr, this.f67702ncyb, this.f24620l, com.google.android.material.color.kja0.m14282k(this.f67700n5r1, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f67690i1.getLineBaseline(0);
        CharSequence charSequence = this.f24629x;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.f24612c);
        if (i2 >= 31) {
            this.f24612c.setShadowLayer(this.f67716x9kr, this.f67702ncyb, this.f24620l, this.f67700n5r1);
        }
        if (this.f24625q) {
            return;
        }
        String strTrim = this.f24629x.toString().trim();
        if (strTrim.endsWith(f67672y2)) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.f24612c.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f67690i1.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.f24612c);
    }

    /* JADX INFO: renamed from: r */
    private Layout.Alignment m14602r() {
        int iM3432q = androidx.core.view.qrj.m3432q(this.f67695ld6, this.f67679d3 ? 1 : 0) & 7;
        return iM3432q != 1 ? iM3432q != 5 ? this.f67679d3 ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f67679d3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    /* JADX INFO: renamed from: s */
    private void m14603s(float f2, boolean z2) {
        boolean z3;
        float f3;
        float f4;
        boolean z5;
        if (this.f67692jp0y == null) {
            return;
        }
        float fWidth = this.f24627s.width();
        float fWidth2 = this.f24630y.width();
        if (hyr(f2, 1.0f)) {
            f3 = this.f67701n7h;
            f4 = this.f67717y9n;
            this.f24626r = 1.0f;
            Typeface typeface = this.f67691jk;
            Typeface typeface2 = this.f67686fu4;
            if (typeface != typeface2) {
                this.f67691jk = typeface2;
                z5 = true;
            } else {
                z5 = false;
            }
        } else {
            float f5 = this.f67708qrj;
            float f6 = this.f24611b;
            Typeface typeface3 = this.f67691jk;
            Typeface typeface4 = this.f67714wvg;
            if (typeface3 != typeface4) {
                this.f67691jk = typeface4;
                z3 = true;
            } else {
                z3 = false;
            }
            if (hyr(f2, 0.0f)) {
                this.f24626r = 1.0f;
            } else {
                this.f24626r = vyq(this.f67708qrj, this.f67701n7h, f2, this.f67713vyq) / this.f67708qrj;
            }
            float f7 = this.f67701n7h / this.f67708qrj;
            fWidth = (!z2 && fWidth2 * f7 > fWidth) ? Math.min(fWidth / f7, fWidth2) : fWidth2;
            f3 = f5;
            f4 = f6;
            z5 = z3;
        }
        if (fWidth > 0.0f) {
            z5 = ((this.f67680dd > f3 ? 1 : (this.f67680dd == f3 ? 0 : -1)) != 0) || ((this.f67675bf2 > f4 ? 1 : (this.f67675bf2 == f4 ? 0 : -1)) != 0) || this.f24614f || z5;
            this.f67680dd = f3;
            this.f67675bf2 = f4;
            this.f24614f = false;
        }
        if (this.f67687gvn7 == null || z5) {
            this.f24612c.setTextSize(this.f67680dd);
            this.f24612c.setTypeface(this.f67691jk);
            this.f24612c.setLetterSpacing(this.f67675bf2);
            this.f24612c.setLinearText(this.f24626r != 1.0f);
            this.f67679d3 = m14594g(this.f67692jp0y);
            StaticLayout staticLayoutLd6 = ld6(gbni() ? this.f67677ch : 1, fWidth, this.f67679d3);
            this.f67690i1 = staticLayoutLd6;
            this.f67687gvn7 = staticLayoutLd6.getText();
        }
    }

    private float t8r(int i2, int i3) {
        return (i3 == 17 || (i3 & 7) == 1) ? (i2 / 2.0f) - (this.f67674a98o / 2.0f) : ((i3 & androidx.core.view.qrj.f50866zy) == 8388613 || (i3 & 5) == 5) ? this.f67679d3 ? this.f24627s.left : this.f24627s.right - this.f67674a98o : this.f67679d3 ? this.f24627s.right - this.f67674a98o : this.f24627s.left;
    }

    private void toq(boolean z2) {
        StaticLayout staticLayout;
        m14603s(1.0f, z2);
        CharSequence charSequence = this.f67687gvn7;
        if (charSequence != null && (staticLayout = this.f67690i1) != null) {
            this.f24629x = TextUtils.ellipsize(charSequence, this.f24612c, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f24629x;
        float fNn86 = 0.0f;
        if (charSequence2 != null) {
            this.f67674a98o = nn86(this.f24612c, charSequence2);
        } else {
            this.f67674a98o = 0.0f;
        }
        int iM3432q = androidx.core.view.qrj.m3432q(this.f67715x2, this.f67679d3 ? 1 : 0);
        int i2 = iM3432q & 112;
        if (i2 == 48) {
            this.f67710t8r = this.f24627s.top;
        } else if (i2 != 80) {
            this.f67710t8r = this.f24627s.centerY() - ((this.f24612c.descent() - this.f24612c.ascent()) / 2.0f);
        } else {
            this.f67710t8r = this.f24627s.bottom + this.f24612c.ascent();
        }
        int i3 = iM3432q & androidx.core.view.qrj.f4101q;
        if (i3 == 1) {
            this.f67684fn3e = this.f24627s.centerX() - (this.f67674a98o / 2.0f);
        } else if (i3 != 5) {
            this.f67684fn3e = this.f24627s.left;
        } else {
            this.f67684fn3e = this.f24627s.right - this.f67674a98o;
        }
        m14603s(0.0f, z2);
        float height = this.f67690i1 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f67690i1;
        if (staticLayout2 == null || this.f67677ch <= 1) {
            CharSequence charSequence3 = this.f67687gvn7;
            if (charSequence3 != null) {
                fNn86 = nn86(this.f24612c, charSequence3);
            }
        } else {
            fNn86 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f67690i1;
        this.f67676cdj = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int iM3432q2 = androidx.core.view.qrj.m3432q(this.f67695ld6, this.f67679d3 ? 1 : 0);
        int i4 = iM3432q2 & 112;
        if (i4 == 48) {
            this.f67693ki = this.f24630y.top;
        } else if (i4 != 80) {
            this.f67693ki = this.f24630y.centerY() - (height / 2.0f);
        } else {
            this.f67693ki = (this.f24630y.bottom - height) + this.f24612c.descent();
        }
        int i5 = iM3432q2 & androidx.core.view.qrj.f4101q;
        if (i5 == 1) {
            this.f24617i = this.f24630y.centerX() - (fNn86 / 2.0f);
        } else if (i5 != 5) {
            this.f24617i = this.f24630y.left;
        } else {
            this.f24617i = this.f24630y.right - fNn86;
        }
        m14600p();
        mu(this.f67721zy);
    }

    /* JADX INFO: renamed from: u */
    private void m14604u(float f2) {
        this.f67719zp = f2;
        C0683f.h7am(this.f24619k);
    }

    private boolean uv6(@lvui CharSequence charSequence, boolean z2) {
        return (z2 ? androidx.core.text.qrj.f3832q : androidx.core.text.qrj.f50601zy).isRtl(charSequence, 0, charSequence.length());
    }

    private static float vyq(float f2, float f3, float f4, @dd TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return C3910k.m13980k(f2, f3, f4);
    }

    /* JADX INFO: renamed from: y */
    private void m14605y(float f2) {
        m14603s(f2, false);
    }

    @zy.x2
    /* JADX INFO: renamed from: z */
    private int m14606z() {
        return fu4(this.f67694kja0);
    }

    private boolean zp(Typeface typeface) {
        C4090k c4090k = this.f67685fti;
        if (c4090k != null) {
            c4090k.zy();
        }
        if (this.f67706o1t == typeface) {
            return false;
        }
        this.f67706o1t = typeface;
        Typeface qVar = C4093y.toq(this.f24619k.getContext().getResources().getConfiguration(), typeface);
        this.f24631z = qVar;
        if (qVar == null) {
            qVar = this.f67706o1t;
        }
        this.f67686fu4 = qVar;
        return true;
    }

    private void zy() {
        f7l8(this.f67721zy);
    }

    /* JADX INFO: renamed from: a */
    public void m14607a(Typeface typeface) {
        if (zp(typeface)) {
            m14612j();
        }
    }

    public float a9() {
        return this.f67708qrj;
    }

    public void a98o(float f2) {
        if (this.f67701n7h != f2) {
            this.f67701n7h = f2;
            m14612j();
        }
    }

    public void bf2(ColorStateList colorStateList) {
        if (this.f24616h != colorStateList) {
            this.f24616h = colorStateList;
            m14612j();
        }
    }

    public void bo(ColorStateList colorStateList) {
        if (this.f67694kja0 != colorStateList) {
            this.f67694kja0 = colorStateList;
            m14612j();
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m14608c() {
        return this.f67707oc;
    }

    public void c8jq(float f2) {
        if (this.f67708qrj != f2) {
            this.f67708qrj = f2;
            m14612j();
        }
    }

    public int cdj() {
        return this.f67715x2;
    }

    public void ch(int i2, int i3, int i4, int i5) {
        if (m14598m(this.f24630y, i2, i3, i4, i5)) {
            return;
        }
        this.f24630y.set(i2, i3, i4, i5);
        this.f24614f = true;
        hb();
    }

    @hyr(23)
    /* JADX INFO: renamed from: d */
    public void m14609d(int i2) {
        this.f67709t8iq = i2;
    }

    @hyr(23)
    public float d2ok() {
        return this.f67690i1.getSpacingMultiplier();
    }

    @hyr(23)
    public int d3() {
        return this.f67709t8iq;
    }

    public void d8wk(@dd CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f67692jp0y, charSequence)) {
            this.f67692jp0y = charSequence;
            this.f67687gvn7 = null;
            m14600p();
            m14612j();
        }
    }

    @dd
    public TimeInterpolator dd() {
        return this.f67712uv6;
    }

    /* JADX INFO: renamed from: e */
    public void m14610e(@lvui Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f67706o1t;
            if (typeface != null) {
                this.f24631z = C4093y.toq(configuration, typeface);
            }
            Typeface typeface2 = this.f67699mcp;
            if (typeface2 != null) {
                this.f24628t = C4093y.toq(configuration, typeface2);
            }
            Typeface typeface3 = this.f24631z;
            if (typeface3 == null) {
                typeface3 = this.f67706o1t;
            }
            this.f67686fu4 = typeface3;
            Typeface typeface4 = this.f24628t;
            if (typeface4 == null) {
                typeface4 = this.f67699mcp;
            }
            this.f67714wvg = typeface4;
            m14613o(true);
        }
    }

    public void ek5k(int i2, int i3, int i4, int i5) {
        if (m14598m(this.f24627s, i2, i3, i4, i5)) {
            return;
        }
        this.f24627s.set(i2, i3, i4, i5);
        this.f24614f = true;
        hb();
    }

    @hyr(23)
    public float eqxt() {
        return this.f67690i1.getSpacingAdd();
    }

    public float fn3e() {
        return this.f67701n7h;
    }

    public void fnq8(int i2) {
        if (i2 != this.f67677ch) {
            this.f67677ch = i2;
            m14600p();
            m14612j();
        }
    }

    public Typeface fti() {
        Typeface typeface = this.f67714wvg;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void g1(TimeInterpolator timeInterpolator) {
        this.f67713vyq = timeInterpolator;
        m14612j();
    }

    public float gvn7() {
        return this.f24615g;
    }

    public void gyi(Typeface typeface) {
        if (dr(typeface)) {
            m14612j();
        }
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m14611h() {
        return this.f24616h;
    }

    void hb() {
        this.f67711toq = this.f24627s.width() > 0 && this.f24627s.height() > 0 && this.f24630y.width() > 0 && this.f24630y.height() > 0;
    }

    public void i1(int i2) {
        if (this.f67715x2 != i2) {
            this.f67715x2 = i2;
            m14612j();
        }
    }

    public void ikck(float f2) {
        this.f24622n = f2;
        this.f24615g = m14599n();
    }

    /* JADX INFO: renamed from: j */
    public void m14612j() {
        m14613o(false);
    }

    public float jk() {
        m14597l(this.f67696lrht);
        return -this.f67696lrht.ascent();
    }

    public float jp0y() {
        return this.f67721zy;
    }

    public float ki() {
        ncyb(this.f67696lrht);
        return -this.f67696lrht.ascent();
    }

    public void kja0(@lvui RectF rectF, int i2, int i3) {
        this.f67679d3 = m14594g(this.f67692jp0y);
        rectF.left = t8r(i2, i3);
        rectF.top = this.f24627s.top;
        rectF.right = m14595i(rectF, i2, i3);
        rectF.bottom = this.f24627s.top + ki();
    }

    public final boolean lrht() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f24616h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f67694kja0) != null && colorStateList.isStateful());
    }

    public void lv5(float f2) {
        if (this.f24611b != f2) {
            this.f24611b = f2;
            m14612j();
        }
    }

    public int lvui() {
        return this.f67677ch;
    }

    public int mcp() {
        return this.f67695ld6;
    }

    @zy.x2
    public int ni7() {
        return fu4(this.f24616h);
    }

    public void nmn5(@lvui Rect rect) {
        ch(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: o */
    public void m14613o(boolean z2) {
        if ((this.f24619k.getHeight() <= 0 || this.f24619k.getWidth() <= 0) && !z2) {
            return;
        }
        toq(z2);
        zy();
    }

    public int o1t() {
        return this.f67676cdj;
    }

    public int oc() {
        StaticLayout staticLayout = this.f67690i1;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    @hyr(23)
    public void qkj8(@zy.zurt(from = 0.0d) float f2) {
        this.f67697lv5 = f2;
    }

    public void qo(TimeInterpolator timeInterpolator) {
        this.f67712uv6 = timeInterpolator;
        m14612j();
    }

    /* JADX INFO: renamed from: t */
    public float m14614t() {
        m14597l(this.f67696lrht);
        return (-this.f67696lrht.ascent()) + this.f67696lrht.descent();
    }

    public void t8iq(int i2) {
        C4092q c4092q = new C4092q(this.f24619k.getContext(), i2);
        if (c4092q.m14744s() != null) {
            this.f67694kja0 = c4092q.m14744s();
        }
        if (c4092q.m14743p() != 0.0f) {
            this.f67708qrj = c4092q.m14743p();
        }
        ColorStateList colorStateList = c4092q.f67786zy;
        if (colorStateList != null) {
            this.f67718yz = colorStateList;
        }
        this.f24621m = c4092q.f24875y;
        this.f67681ek5k = c4092q.f24874s;
        this.f24623o = c4092q.f24872p;
        this.f24611b = c4092q.f67785x2;
        C4090k c4090k = this.f67673a9;
        if (c4090k != null) {
            c4090k.zy();
        }
        this.f67673a9 = new C4090k(new C7976toq(), c4092q.m14742n());
        c4092q.m14745y(this.f24619k.getContext(), this.f67673a9);
        m14612j();
    }

    public void tfm(boolean z2) {
        this.f67707oc = z2;
    }

    /* JADX INFO: renamed from: v */
    public void m14615v(boolean z2) {
        this.f24625q = z2;
    }

    @hyr(23)
    public void vq(float f2) {
        this.f67704nmn5 = f2;
    }

    public void was(Typeface typeface) {
        boolean zZp = zp(typeface);
        boolean zDr = dr(typeface);
        if (zZp || zDr) {
            m14612j();
        }
    }

    public final boolean wo(int[] iArr) {
        this.f67689hyr = iArr;
        if (!lrht()) {
            return false;
        }
        m14612j();
        return true;
    }

    public ColorStateList wvg() {
        return this.f67694kja0;
    }

    /* JADX INFO: renamed from: x */
    public void m14616x(int i2) {
        this.f67683f7l8 = i2;
    }

    public void x2(@lvui Canvas canvas) {
        int iSave = canvas.save();
        if (this.f67687gvn7 == null || !this.f67711toq) {
            return;
        }
        this.f24612c.setTextSize(this.f67680dd);
        float f2 = this.f67720zurt;
        float f3 = this.f67703ni7;
        boolean z2 = this.f67682eqxt && this.f67678d2ok != null;
        float f4 = this.f24626r;
        if (f4 != 1.0f && !this.f24625q) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z2) {
            canvas.drawBitmap(this.f67678d2ok, f2, f3, this.f67698lvui);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!gbni() || (this.f24625q && this.f67721zy <= this.f24615g)) {
            canvas.translate(f2, f3);
            this.f67690i1.draw(canvas);
        } else {
            qrj(canvas, this.f67720zurt - this.f67690i1.getLineStart(0), f3);
        }
        canvas.restoreToCount(iSave);
    }

    @dd
    public CharSequence x9kr() {
        return this.f67692jp0y;
    }

    public void xwq3(float f2) {
        float fM22396q = C6116k.m22396q(f2, 0.0f, 1.0f);
        if (fM22396q != this.f67721zy) {
            this.f67721zy = fM22396q;
            zy();
        }
    }

    public void y2(int i2) {
        if (this.f67695ld6 != i2) {
            this.f67695ld6 = i2;
            m14612j();
        }
    }

    public void y9n(int i2) {
        C4092q c4092q = new C4092q(this.f24619k.getContext(), i2);
        if (c4092q.m14744s() != null) {
            this.f24616h = c4092q.m14744s();
        }
        if (c4092q.m14743p() != 0.0f) {
            this.f67701n7h = c4092q.m14743p();
        }
        ColorStateList colorStateList = c4092q.f67786zy;
        if (colorStateList != null) {
            this.f24618j = colorStateList;
        }
        this.f67705nn86 = c4092q.f24875y;
        this.f67688hb = c4092q.f24874s;
        this.f24613e = c4092q.f24872p;
        this.f67717y9n = c4092q.f67785x2;
        C4090k c4090k = this.f67685fti;
        if (c4090k != null) {
            c4090k.zy();
        }
        this.f67685fti = new C4090k(new C4055k(), c4092q.m14742n());
        c4092q.m14745y(this.f24619k.getContext(), this.f67685fti);
        m14612j();
    }

    public void yz(@lvui Rect rect) {
        ek5k(rect.left, rect.top, rect.right, rect.bottom);
    }

    public Typeface zurt() {
        Typeface typeface = this.f67686fu4;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }
}
