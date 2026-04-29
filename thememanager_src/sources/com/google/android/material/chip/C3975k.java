package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C0541p;
import androidx.core.graphics.drawable.n7h;
import androidx.core.graphics.drawable.zy;
import androidx.core.text.C0616k;
import com.google.android.material.animation.C3915y;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.C4058z;
import com.google.android.material.internal.cdj;
import com.google.android.material.internal.n7h;
import com.google.android.material.resources.C4092q;
import com.google.android.material.ripple.toq;
import com.google.android.material.shape.C4108p;
import ij.C6095k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import n2t.C7398k;
import nsb.C7408k;
import p023g.C6045k;
import zy.InterfaceC7824b;
import zy.InterfaceC7828g;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.InterfaceC7845y;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.lvui;
import zy.nn86;
import zy.x2;

/* JADX INFO: renamed from: com.google.android.material.chip.k */
/* JADX INFO: compiled from: ChipDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3975k extends C4108p implements n7h, Drawable.Callback, n7h.toq {
    private static final int[] cecm = {R.attr.state_enabled};
    private static final ShapeDrawable gjxq = new ShapeDrawable(new OvalShape());
    private static final int h06 = 24;
    private static final boolean k84 = false;
    private static final String kdv1 = "http://schemas.android.com/apk/res-auto";
    private boolean a7kc;
    private float ac;
    private boolean ad;

    @dd
    private PorterDuff.Mode afw;

    @dd
    private ColorStateList aj;
    private boolean am;

    @dd
    private ColorStateList an;
    private boolean ar;
    private float as;

    @dd
    private Drawable ax;

    @dd
    private Drawable ay;

    @dd
    private CharSequence az;
    private boolean ba;
    private boolean bc;

    @dd
    private ColorStateList bd;

    @dd
    private Drawable be;

    @dd
    private ColorStateList bg;

    @dd
    private ColorStateList bl;

    @dd
    private ColorStateList bq;
    private float bs;

    @dd
    private Drawable bu;

    @dd
    private ColorStateList bv;
    private final Paint.FontMetrics cw14;

    @x2
    private int d1cy;
    private float dy;
    private boolean eht;

    @x2
    private int ei;
    private TextUtils.TruncateAt fn2;

    @dd
    private final Paint hp;
    private float id;
    private float in;

    @dd
    private CharSequence k0;
    private float k6e;

    @dd
    private PorterDuffColorFilter ls9;

    @lvui
    private WeakReference<k> lw58;
    private final Paint mjvl;

    @dd
    private ColorStateList n5ij;

    @lvui
    private final com.google.android.material.internal.n7h ndjo;
    private int nq0z;
    private int[] oyp;
    private final Path q7k9;

    @dd
    private ColorStateList qns;

    @lvui
    private final Context s8y;
    private float sk1t;
    private float tgs;
    private final PointF th6;

    @dd
    private C3915y tlhn;
    private boolean us2t;
    private int ut;
    private float vb6;

    @dd
    private C3915y w97r;

    @dd
    private ColorFilter wh6;

    @x2
    private int wra;
    private boolean xhv;
    private float xk5;

    @x2
    private int xqx;
    private final RectF xy8;
    private float yl25;

    @x2
    private int zm;
    private float zmmu;

    @x2
    private int zr5t;

    @x2
    private int zsl;

    /* JADX INFO: renamed from: com.google.android.material.chip.k$k */
    /* JADX INFO: compiled from: ChipDrawable.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo14229k();
    }

    private C3975k(@lvui Context context, AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        super(context, attributeSet, i2, i3);
        this.in = -1.0f;
        this.mjvl = new Paint(1);
        this.cw14 = new Paint.FontMetrics();
        this.xy8 = new RectF();
        this.th6 = new PointF();
        this.q7k9 = new Path();
        this.ut = 255;
        this.afw = PorterDuff.Mode.SRC_IN;
        this.lw58 = new WeakReference<>(null);
        m14856e(context);
        this.s8y = context;
        com.google.android.material.internal.n7h n7hVar = new com.google.android.material.internal.n7h(this);
        this.ndjo = n7hVar;
        this.az = "";
        n7hVar.m14564n().density = context.getResources().getDisplayMetrics().density;
        this.hp = null;
        int[] iArr = cecm;
        setState(iArr);
        kz28(iArr);
        this.us2t = true;
        if (toq.f24883k) {
            gjxq.setTint(-1);
        }
    }

    private void b3e(@lvui Canvas canvas, @lvui Rect rect) {
        if (this.az != null) {
            Paint.Align alignW831 = w831(rect, this.th6);
            sok(rect, this.xy8);
            if (this.ndjo.m14566q() != null) {
                this.ndjo.m14564n().drawableState = getState();
                this.ndjo.ld6(this.s8y);
            }
            this.ndjo.m14564n().setTextAlign(alignW831);
            int iSave = 0;
            boolean z2 = Math.round(this.ndjo.m14563g(gcp().toString())) > Math.round(this.xy8.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(this.xy8);
            }
            CharSequence charSequenceEllipsize = this.az;
            if (z2 && this.fn2 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.ndjo.m14564n(), this.xy8.width(), this.fn2);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.th6;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.ndjo.m14564n());
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private static boolean b8(@dd int[] iArr, @InterfaceC7828g int i2) {
        if (iArr == null) {
            return false;
        }
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private float bap7() {
        Drawable drawable = this.xhv ? this.bu : this.ax;
        float fCeil = this.ac;
        if (fCeil <= 0.0f && drawable != null) {
            fCeil = (float) Math.ceil(C4058z.m14624n(this.s8y, 24));
            if (drawable.getIntrinsicHeight() <= fCeil) {
                return drawable.getIntrinsicHeight();
            }
        }
        return fCeil;
    }

    private void bwp(@lvui Canvas canvas, @lvui Rect rect) {
        if (nc()) {
            i9jn(rect, this.xy8);
            RectF rectF = this.xy8;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.bu.setBounds(0, 0, (int) this.xy8.width(), (int) this.xy8.height());
            this.bu.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void bz2(@lvui Canvas canvas, @lvui Rect rect) {
        if (this.a7kc) {
            return;
        }
        this.mjvl.setColor(this.d1cy);
        this.mjvl.setStyle(Paint.Style.FILL);
        this.xy8.set(rect);
        canvas.drawRoundRect(this.xy8, vep5(), vep5(), this.mjvl);
    }

    private float cfr() {
        this.ndjo.m14564n().getFontMetrics(this.cw14);
        Paint.FontMetrics fontMetrics = this.cw14;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @dd
    private ColorFilter cnbm() {
        ColorFilter colorFilter = this.wh6;
        return colorFilter != null ? colorFilter : this.ls9;
    }

    private void e4e(@dd Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private boolean erbd() {
        return this.ba && this.ax != null;
    }

    private void gc3c(@lvui Canvas canvas, @lvui Rect rect) {
        if (erbd()) {
            i9jn(rect, this.xy8);
            RectF rectF = this.xy8;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.ax.setBounds(0, 0, (int) this.xy8.width(), (int) this.xy8.height());
            this.ax.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private float h4b() {
        Drawable drawable = this.xhv ? this.bu : this.ax;
        float f2 = this.ac;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    private void i9jn(@lvui Rect rect, @lvui RectF rectF) {
        rectF.setEmpty();
        if (erbd() || nc()) {
            float f2 = this.tgs + this.yl25;
            float fH4b = h4b();
            if (zy.m2441g(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + fH4b;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - fH4b;
            }
            float fBap7 = bap7();
            float fExactCenterY = rect.exactCenterY() - (fBap7 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fBap7;
        }
    }

    private void jz5(@lvui Canvas canvas, @lvui Rect rect) {
        this.mjvl.setColor(this.wra);
        this.mjvl.setStyle(Paint.Style.FILL);
        this.xy8.set(rect);
        if (!this.a7kc) {
            canvas.drawRoundRect(this.xy8, vep5(), vep5(), this.mjvl);
        } else {
            m14868y(new RectF(rect), this.q7k9);
            super.cdj(canvas, this.mjvl, this.q7k9, zurt());
        }
    }

    @lvui
    public static C3975k kcsr(@lvui Context context, @InterfaceC7824b int i2) {
        AttributeSet attributeSetM26798k = C7398k.m26798k(context, i2, "chip");
        int styleAttribute = attributeSetM26798k.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = C6095k.n7h.tsz9;
        }
        return yqrt(context, attributeSetM26798k, C6095k.zy.f80218kx3, styleAttribute);
    }

    private void ktq(@lvui Canvas canvas, @lvui Rect rect) {
        Paint paint = this.hp;
        if (paint != null) {
            paint.setColor(C0541p.m2542t(-16777216, 127));
            canvas.drawRect(rect, this.hp);
            if (erbd() || nc()) {
                i9jn(rect, this.xy8);
                canvas.drawRect(this.xy8, this.hp);
            }
            if (this.az != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.hp);
            }
            if (zxq()) {
                m4(rect, this.xy8);
                canvas.drawRect(this.xy8, this.hp);
            }
            this.hp.setColor(C0541p.m2542t(-65536, 127));
            r8s8(rect, this.xy8);
            canvas.drawRect(this.xy8, this.hp);
            this.hp.setColor(C0541p.m2542t(-16711936, 127));
            v0af(rect, this.xy8);
            canvas.drawRect(this.xy8, this.hp);
        }
    }

    private void lk(@dd ColorStateList colorStateList) {
        if (this.bv != colorStateList) {
            this.bv = colorStateList;
            onStateChange(getState());
        }
    }

    private void m4(@lvui Rect rect, @lvui RectF rectF) {
        rectF.setEmpty();
        if (zxq()) {
            float f2 = this.xk5 + this.k6e;
            if (zy.m2441g(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.bs;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.bs;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.bs;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private boolean nc() {
        return this.bc && this.bu != null && this.xhv;
    }

    private static boolean nnh(@dd C4092q c4092q) {
        return (c4092q == null || c4092q.m14744s() == null || !c4092q.m14744s().isStateful()) ? false : true;
    }

    private void nod() {
        this.n5ij = this.eht ? toq.m14763q(this.bg) : null;
    }

    private void py(@dd Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        zy.qrj(drawable, zy.m2441g(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.ay) {
            if (drawable.isStateful()) {
                drawable.setState(pjz9());
            }
            zy.kja0(drawable, this.aj);
            return;
        }
        Drawable drawable2 = this.ax;
        if (drawable == drawable2 && this.ad) {
            zy.kja0(drawable2, this.bq);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void r8s8(@lvui Rect rect, @lvui RectF rectF) {
        rectF.set(rect);
        if (zxq()) {
            float f2 = this.xk5 + this.k6e + this.bs + this.vb6 + this.dy;
            if (zy.m2441g(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    private static boolean ra(@dd Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @TargetApi(21)
    private void rf() {
        this.be = new RippleDrawable(toq.m14763q(a5id()), this.ay, gjxq);
    }

    private void se(@lvui Canvas canvas, @lvui Rect rect) {
        if (this.a7kc) {
            return;
        }
        this.mjvl.setColor(this.xqx);
        this.mjvl.setStyle(Paint.Style.FILL);
        this.mjvl.setColorFilter(cnbm());
        this.xy8.set(rect);
        canvas.drawRoundRect(this.xy8, vep5(), vep5(), this.mjvl);
    }

    private void sok(@lvui Rect rect, @lvui RectF rectF) {
        rectF.setEmpty();
        if (this.az != null) {
            float fLtg8 = this.tgs + ltg8() + this.sk1t;
            float fEtdu = this.xk5 + etdu() + this.dy;
            if (zy.m2441g(this) == 0) {
                rectF.left = rect.left + fLtg8;
                rectF.right = rect.right - fEtdu;
            } else {
                rectF.left = rect.left + fEtdu;
                rectF.right = rect.right - fLtg8;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void uf(@dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        TypedArray typedArrayM14534p = cdj.m14534p(this.s8y, attributeSet, C6095k.kja0.ff8y, i2, i3, new int[0]);
        this.a7kc = typedArrayM14534p.hasValue(C6095k.kja0.zalf);
        lk(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, C6095k.kja0.bv));
        el(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, C6095k.kja0.i0));
        exv8(typedArrayM14534p.getDimension(C6095k.kja0.fq, 0.0f));
        int i4 = C6095k.kja0.rq;
        if (typedArrayM14534p.hasValue(i4)) {
            g0ad(typedArrayM14534p.getDimension(i4, 0.0f));
        }
        pnt2(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, C6095k.kja0.g8));
        mi1u(typedArrayM14534p.getDimension(C6095k.kja0.wqg, 0.0f));
        mub(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, C6095k.kja0.ebaq));
        j3y2(typedArrayM14534p.getText(C6095k.kja0.b972));
        C4092q c4092qF7l8 = com.google.android.material.resources.zy.f7l8(this.s8y, typedArrayM14534p, C6095k.kja0.te);
        c4092qF7l8.x2(typedArrayM14534p.getDimension(C6095k.kja0.t8o, c4092qF7l8.m14743p()));
        ge(c4092qF7l8);
        int i5 = typedArrayM14534p.getInt(C6095k.kja0.qyk, 0);
        if (i5 == 1) {
            ula6(TextUtils.TruncateAt.START);
        } else if (i5 == 2) {
            ula6(TextUtils.TruncateAt.MIDDLE);
        } else if (i5 == 3) {
            ula6(TextUtils.TruncateAt.END);
        }
        ovdh(typedArrayM14534p.getBoolean(C6095k.kja0.y84, false));
        if (attributeSet != null && attributeSet.getAttributeValue(kdv1, "chipIconEnabled") != null && attributeSet.getAttributeValue(kdv1, "chipIconVisible") == null) {
            ovdh(typedArrayM14534p.getBoolean(C6095k.kja0.ex76, false));
        }
        tww7(com.google.android.material.resources.zy.m14754n(this.s8y, typedArrayM14534p, C6095k.kja0.wtm));
        int i6 = C6095k.kja0.twzk;
        if (typedArrayM14534p.hasValue(i6)) {
            xm(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, i6));
        }
        btvn(typedArrayM14534p.getDimension(C6095k.kja0.hczd, -1.0f));
        uo(typedArrayM14534p.getBoolean(C6095k.kja0.mc, false));
        if (attributeSet != null && attributeSet.getAttributeValue(kdv1, "closeIconEnabled") != null && attributeSet.getAttributeValue(kdv1, "closeIconVisible") == null) {
            uo(typedArrayM14534p.getBoolean(C6095k.kja0.xx, false));
        }
        z617(com.google.android.material.resources.zy.m14754n(this.s8y, typedArrayM14534p, C6095k.kja0.vf));
        kt06(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, C6095k.kja0.gl8t));
        i3x9(typedArrayM14534p.getDimension(C6095k.kja0.td, 0.0f));
        bih(typedArrayM14534p.getBoolean(C6095k.kja0.x8, false));
        zff0(typedArrayM14534p.getBoolean(C6095k.kja0.olj, false));
        if (attributeSet != null && attributeSet.getAttributeValue(kdv1, "checkedIconEnabled") != null && attributeSet.getAttributeValue(kdv1, "checkedIconVisible") == null) {
            zff0(typedArrayM14534p.getBoolean(C6095k.kja0.c7g, false));
        }
        o5(com.google.android.material.resources.zy.m14754n(this.s8y, typedArrayM14534p, C6095k.kja0.kho));
        int i7 = C6095k.kja0.fpn;
        if (typedArrayM14534p.hasValue(i7)) {
            cyoe(com.google.android.material.resources.zy.m14753k(this.s8y, typedArrayM14534p, i7));
        }
        kq(C3915y.zy(this.s8y, typedArrayM14534p, C6095k.kja0.ffy));
        wwp(C3915y.zy(this.s8y, typedArrayM14534p, C6095k.kja0.l0u));
        hyow(typedArrayM14534p.getDimension(C6095k.kja0.lm5, 0.0f));
        kl7m(typedArrayM14534p.getDimension(C6095k.kja0.w6w4, 0.0f));
        sc(typedArrayM14534p.getDimension(C6095k.kja0.p68f, 0.0f));
        kjd(typedArrayM14534p.getDimension(C6095k.kja0.m4ll, 0.0f));
        z8(typedArrayM14534p.getDimension(C6095k.kja0.fjcj, 0.0f));
        vss1(typedArrayM14534p.getDimension(C6095k.kja0.w2bz, 0.0f));
        c25(typedArrayM14534p.getDimension(C6095k.kja0.w0, 0.0f));
        bqie(typedArrayM14534p.getDimension(C6095k.kja0.cc1, 0.0f));
        le7(typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.jp, Integer.MAX_VALUE));
        typedArrayM14534p.recycle();
    }

    private void uj2j(@lvui Canvas canvas, @lvui Rect rect) {
        if (zxq()) {
            m4(rect, this.xy8);
            RectF rectF = this.xy8;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.ay.setBounds(0, 0, (int) this.xy8.width(), (int) this.xy8.height());
            if (toq.f24883k) {
                this.be.setBounds(this.ay.getBounds());
                this.be.jumpToCurrentState();
                this.be.draw(canvas);
            } else {
                this.ay.draw(canvas);
            }
            canvas.translate(-f2, -f3);
        }
    }

    private void v0af(@lvui Rect rect, @lvui RectF rectF) {
        rectF.setEmpty();
        if (zxq()) {
            float f2 = this.xk5 + this.k6e + this.bs + this.vb6 + this.dy;
            if (zy.m2441g(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = i2;
                rectF.right = i2 + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean v5yj(@dd ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    @lvui
    public static C3975k yqrt(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        C3975k c3975k = new C3975k(context, attributeSet, i2, i3);
        c3975k.uf(attributeSet, i2, i3);
        return c3975k;
    }

    private boolean z4() {
        return this.bc && this.bu != null && this.ar;
    }

    private boolean z4t(@lvui int[] iArr, @lvui int[] iArr2) {
        boolean z2;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.bv;
        int iX2 = x2(colorStateList != null ? colorStateList.getColorForState(iArr, this.d1cy) : 0);
        boolean state = true;
        if (this.d1cy != iX2) {
            this.d1cy = iX2;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.an;
        int iX22 = x2(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.xqx) : 0);
        if (this.xqx != iX22) {
            this.xqx = iX22;
            zOnStateChange = true;
        }
        int iX23 = kja0.x2(iX2, iX22);
        if ((this.zr5t != iX23) | (m14869z() == null)) {
            this.zr5t = iX23;
            m14867x(ColorStateList.valueOf(iX23));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.bl;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ei) : 0;
        if (this.ei != colorForState) {
            this.ei = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.n5ij == null || !toq.m14762n(iArr)) ? 0 : this.n5ij.getColorForState(iArr, this.wra);
        if (this.wra != colorForState2) {
            this.wra = colorForState2;
            if (this.eht) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.ndjo.m14566q() == null || this.ndjo.m14566q().m14744s() == null) ? 0 : this.ndjo.m14566q().m14744s().getColorForState(iArr, this.zsl);
        if (this.zsl != colorForState3) {
            this.zsl = colorForState3;
            zOnStateChange = true;
        }
        boolean z3 = b8(getState(), R.attr.state_checked) && this.ar;
        if (this.xhv == z3 || this.bu == null) {
            z2 = false;
        } else {
            float fLtg8 = ltg8();
            this.xhv = z3;
            if (fLtg8 != ltg8()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.qns;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.zm) : 0;
        if (this.zm != colorForState4) {
            this.zm = colorForState4;
            this.ls9 = C7398k.zy(this, this.qns, this.afw);
        } else {
            state = zOnStateChange;
        }
        if (ra(this.ax)) {
            state |= this.ax.setState(iArr);
        }
        if (ra(this.bu)) {
            state |= this.bu.setState(iArr);
        }
        if (ra(this.ay)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.ay.setState(iArr3);
        }
        if (toq.f24883k && ra(this.be)) {
            state |= this.be.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            kiv();
        }
        return state;
    }

    private void zkd(@lvui Canvas canvas, @lvui Rect rect) {
        if (this.as <= 0.0f || this.a7kc) {
            return;
        }
        this.mjvl.setColor(this.ei);
        this.mjvl.setStyle(Paint.Style.STROKE);
        if (!this.a7kc) {
            this.mjvl.setColorFilter(cnbm());
        }
        RectF rectF = this.xy8;
        float f2 = rect.left;
        float f3 = this.as;
        rectF.set(f2 + (f3 / 2.0f), rect.top + (f3 / 2.0f), rect.right - (f3 / 2.0f), rect.bottom - (f3 / 2.0f));
        float f4 = this.in - (this.as / 2.0f);
        canvas.drawRoundRect(this.xy8, f4, f4, this.mjvl);
    }

    private boolean zxq() {
        return this.am && this.ay != null;
    }

    @dd
    public ColorStateList a5id() {
        return this.bg;
    }

    @Deprecated
    public void ab(@InterfaceC7845y int i2) {
        i1an(i2);
    }

    public void anhx(@zy.toq int i2) {
        kq(C3915y.m13992q(this.s8y, i2));
    }

    public void b2(@x2 int i2) {
        x7o(ColorStateList.valueOf(i2));
    }

    public void b7(@InterfaceC7829h int i2) {
        sc(this.s8y.getResources().getDimension(i2));
    }

    public boolean b9ub() {
        return this.eht;
    }

    @dd
    public Drawable bek6() {
        return this.bu;
    }

    public void bih(boolean z2) {
        if (this.ar != z2) {
            this.ar = z2;
            float fLtg8 = ltg8();
            if (!z2 && this.xhv) {
                this.xhv = false;
            }
            float fLtg82 = ltg8();
            invalidateSelf();
            if (fLtg8 != fLtg82) {
                kiv();
            }
        }
    }

    public void bqie(float f2) {
        if (this.xk5 != f2) {
            this.xk5 = f2;
            invalidateSelf();
            kiv();
        }
    }

    public void btvn(float f2) {
        if (this.ac != f2) {
            float fLtg8 = ltg8();
            this.ac = f2;
            float fLtg82 = ltg8();
            invalidateSelf();
            if (fLtg8 != fLtg82) {
                kiv();
            }
        }
    }

    public void c25(float f2) {
        if (this.k6e != f2) {
            this.k6e = f2;
            invalidateSelf();
            if (zxq()) {
                kiv();
            }
        }
    }

    public void cn02(@InterfaceC7845y int i2) {
        ovdh(this.s8y.getResources().getBoolean(i2));
    }

    @dd
    public ColorStateList cv06() {
        return this.bd;
    }

    public void cyoe(@dd ColorStateList colorStateList) {
        if (this.bd != colorStateList) {
            this.bd = colorStateList;
            if (z4()) {
                zy.kja0(this.bu, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void d1ts(@zy.n7h int i2) {
        kt06(C6045k.m22274k(this.s8y, i2));
    }

    @dd
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public ColorStateList m28268do() {
        return this.bl;
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i2 = this.ut;
        int iM26810k = i2 < 255 ? C7408k.m26810k(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2) : 0;
        bz2(canvas, bounds);
        se(canvas, bounds);
        if (this.a7kc) {
            super.draw(canvas);
        }
        zkd(canvas, bounds);
        jz5(canvas, bounds);
        gc3c(canvas, bounds);
        bwp(canvas, bounds);
        if (this.us2t) {
            b3e(canvas, bounds);
        }
        uj2j(canvas, bounds);
        ktq(canvas, bounds);
        if (this.ut < 255) {
            canvas.restoreToCount(iM26810k);
        }
    }

    public float dxef() {
        return this.yl25;
    }

    public float e5() {
        return this.zmmu;
    }

    public void ebn(@lvui RectF rectF) {
        r8s8(getBounds(), rectF);
    }

    public void ec(@InterfaceC7845y int i2) {
        bih(this.s8y.getResources().getBoolean(i2));
    }

    public void el(@dd ColorStateList colorStateList) {
        if (this.an != colorStateList) {
            this.an = colorStateList;
            onStateChange(getState());
        }
    }

    float etdu() {
        if (zxq()) {
            return this.vb6 + this.bs + this.k6e;
        }
        return 0.0f;
    }

    public boolean ew() {
        return this.bc;
    }

    public void exv8(float f2) {
        if (this.id != f2) {
            this.id = f2;
            invalidateSelf();
            kiv();
        }
    }

    public void f1bi(@InterfaceC7829h int i2) {
        bqie(this.s8y.getResources().getDimension(i2));
    }

    public void f3f(@fn3e int i2) {
        z617(C6045k.toq(this.s8y, i2));
    }

    public void f7z0(@zy.n7h int i2) {
        mub(C6045k.m22274k(this.s8y, i2));
    }

    void fh(boolean z2) {
        this.us2t = z2;
    }

    @Deprecated
    public void g0ad(float f2) {
        if (this.in != f2) {
            this.in = f2;
            setShapeAppearanceModel(getShapeAppearanceModel().ni7(f2));
        }
    }

    @dd
    public C3915y ga() {
        return this.w97r;
    }

    public void gb(@fn3e int i2) {
        tww7(C6045k.toq(this.s8y, i2));
    }

    @dd
    public CharSequence gcp() {
        return this.az;
    }

    public void ge(@dd C4092q c4092q) {
        this.ndjo.m14567s(c4092q, this.s8y);
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.ut;
    }

    @Override // android.graphics.drawable.Drawable
    @dd
    public ColorFilter getColorFilter() {
        return this.wh6;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.id;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.tgs + ltg8() + this.sk1t + this.ndjo.m14563g(gcp().toString()) + this.dy + etdu() + this.xk5), this.nq0z);
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@lvui Outline outline) {
        if (this.a7kc) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.in);
        } else {
            outline.setRoundRect(bounds, this.in);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @dd
    public ColorStateList h7am() {
        return this.an;
    }

    public void hyow(float f2) {
        if (this.tgs != f2) {
            this.tgs = f2;
            invalidateSelf();
            kiv();
        }
    }

    public void i1an(@InterfaceC7845y int i2) {
        uo(this.s8y.getResources().getBoolean(i2));
    }

    public void i3x9(float f2) {
        if (this.bs != f2) {
            this.bs = f2;
            invalidateSelf();
            if (zxq()) {
                kiv();
            }
        }
    }

    @dd
    public CharSequence ij() {
        return this.k0;
    }

    @Deprecated
    public void imd(@InterfaceC7829h int i2) {
        g0ad(this.s8y.getResources().getDimension(i2));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@lvui Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return v5yj(this.bv) || v5yj(this.an) || v5yj(this.bl) || (this.eht && v5yj(this.n5ij)) || nnh(this.ndjo.m14566q()) || z4() || ra(this.ax) || ra(this.bu) || v5yj(this.qns);
    }

    @Deprecated
    public boolean ix() {
        return kx3();
    }

    public float ixz() {
        return this.tgs;
    }

    public void j3y2(@dd CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.az, charSequence)) {
            return;
        }
        this.az = charSequence;
        this.ndjo.m14565p(true);
        invalidateSelf();
        kiv();
    }

    @dd
    public Drawable jbh() {
        Drawable drawable = this.ax;
        if (drawable != null) {
            return zy.cdj(drawable);
        }
        return null;
    }

    @Override // com.google.android.material.internal.n7h.toq
    /* JADX INFO: renamed from: k */
    public void mo14092k() {
        kiv();
        invalidateSelf();
    }

    public void k4jz(boolean z2) {
        if (this.eht != z2) {
            this.eht = z2;
            nod();
            onStateChange(getState());
        }
    }

    @Deprecated
    public void kbj(@InterfaceC7845y int i2) {
        cn02(i2);
    }

    protected void kiv() {
        k kVar = this.lw58.get();
        if (kVar != null) {
            kVar.mo14229k();
        }
    }

    public void kjd(float f2) {
        if (this.sk1t != f2) {
            this.sk1t = f2;
            invalidateSelf();
            kiv();
        }
    }

    public void kl7m(float f2) {
        if (this.yl25 != f2) {
            float fLtg8 = ltg8();
            this.yl25 = f2;
            float fLtg82 = ltg8();
            invalidateSelf();
            if (fLtg8 != fLtg82) {
                kiv();
            }
        }
    }

    public void kq(@dd C3915y c3915y) {
        this.tlhn = c3915y;
    }

    public void kq2f(@InterfaceC7829h int i2) {
        btvn(this.s8y.getResources().getDimension(i2));
    }

    public void kt06(@dd ColorStateList colorStateList) {
        if (this.aj != colorStateList) {
            this.aj = colorStateList;
            if (zxq()) {
                zy.kja0(this.ay, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public boolean kx3() {
        return this.ba;
    }

    public boolean kz28(@lvui int[] iArr) {
        if (Arrays.equals(this.oyp, iArr)) {
            return false;
        }
        this.oyp = iArr;
        if (zxq()) {
            return z4t(getState(), iArr);
        }
        return false;
    }

    public void l05(@fn3e int i2) {
        o5(C6045k.toq(this.s8y, i2));
    }

    public void le7(@InterfaceC7833l int i2) {
        this.nq0z = i2;
    }

    public void lh(@lvui RectF rectF) {
        v0af(getBounds(), rectF);
    }

    float ltg8() {
        if (erbd() || nc()) {
            return this.yl25 + h4b() + this.zmmu;
        }
        return 0.0f;
    }

    @dd
    public C3915y lw() {
        return this.tlhn;
    }

    public void m28(@InterfaceC7829h int i2) {
        kjd(this.s8y.getResources().getDimension(i2));
    }

    public boolean m2t() {
        return ra(this.ay);
    }

    public float m58i() {
        return this.sk1t;
    }

    public void m8(@dd k kVar) {
        this.lw58 = new WeakReference<>(kVar);
    }

    public float mbx() {
        return this.xk5;
    }

    public void mete(@nn86 int i2) {
        j3y2(this.s8y.getResources().getString(i2));
    }

    public void mi1u(float f2) {
        if (this.as != f2) {
            this.as = f2;
            this.mjvl.setStrokeWidth(f2);
            if (this.a7kc) {
                super.tfm(f2);
            }
            invalidateSelf();
        }
    }

    public void mj(@zy.n7h int i2) {
        xm(C6045k.m22274k(this.s8y, i2));
    }

    public void mub(@dd ColorStateList colorStateList) {
        if (this.bg != colorStateList) {
            this.bg = colorStateList;
            nod();
            onStateChange(getState());
        }
    }

    public float n2t() {
        return this.vb6;
    }

    @dd
    public ColorStateList ngy() {
        return this.aj;
    }

    public boolean nme() {
        return this.ar;
    }

    public float nsb() {
        return this.k6e;
    }

    public void nyj(@InterfaceC7829h int i2) {
        i3x9(this.s8y.getResources().getDimension(i2));
    }

    public float o05() {
        return this.dy;
    }

    public void o5(@dd Drawable drawable) {
        if (this.bu != drawable) {
            float fLtg8 = ltg8();
            this.bu = drawable;
            float fLtg82 = ltg8();
            e4e(this.bu);
            py(this.bu);
            invalidateSelf();
            if (fLtg8 != fLtg82) {
                kiv();
            }
        }
    }

    @Deprecated
    public void ob(boolean z2) {
        ovdh(z2);
    }

    @dd
    public C4092q oki() {
        return this.ndjo.m14566q();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (erbd()) {
            zOnLayoutDirectionChanged |= zy.qrj(this.ax, i2);
        }
        if (nc()) {
            zOnLayoutDirectionChanged |= zy.qrj(this.bu, i2);
        }
        if (zxq()) {
            zOnLayoutDirectionChanged |= zy.qrj(this.ay, i2);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        boolean zOnLevelChange = super.onLevelChange(i2);
        if (erbd()) {
            zOnLevelChange |= this.ax.setLevel(i2);
        }
        if (nc()) {
            zOnLevelChange |= this.bu.setLevel(i2);
        }
        if (zxq()) {
            zOnLevelChange |= this.ay.setLevel(i2);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable, com.google.android.material.internal.n7h.toq
    public boolean onStateChange(@lvui int[] iArr) {
        if (this.a7kc) {
            super.onStateChange(iArr);
        }
        return z4t(iArr, pjz9());
    }

    public void oph(@InterfaceC7829h int i2) {
        kl7m(this.s8y.getResources().getDimension(i2));
    }

    public void ovdh(boolean z2) {
        if (this.ba != z2) {
            boolean zErbd = erbd();
            this.ba = z2;
            boolean zErbd2 = erbd();
            if (zErbd != zErbd2) {
                if (zErbd2) {
                    py(this.ax);
                } else {
                    e4e(this.ax);
                }
                invalidateSelf();
                kiv();
            }
        }
    }

    @dd
    public Drawable pc() {
        Drawable drawable = this.ay;
        if (drawable != null) {
            return zy.cdj(drawable);
        }
        return null;
    }

    @lvui
    public int[] pjz9() {
        return this.oyp;
    }

    public void pnt2(@dd ColorStateList colorStateList) {
        if (this.bl != colorStateList) {
            this.bl = colorStateList;
            if (this.a7kc) {
                qkj8(colorStateList);
            }
            onStateChange(getState());
        }
    }

    boolean ps() {
        return this.a7kc;
    }

    public void qh4d(@InterfaceC7829h int i2) {
        exv8(this.s8y.getResources().getDimension(i2));
    }

    @Deprecated
    public boolean r25n() {
        return ew();
    }

    public void r6ty(@zy.n7h int i2) {
        cyoe(C6045k.m22274k(this.s8y, i2));
    }

    @Deprecated
    public void rp(@InterfaceC7845y int i2) {
        zff0(this.s8y.getResources().getBoolean(i2));
    }

    public void sb1e(@InterfaceC7829h int i2) {
        z8(this.s8y.getResources().getDimension(i2));
    }

    public void sc(float f2) {
        if (this.zmmu != f2) {
            float fLtg8 = ltg8();
            this.zmmu = f2;
            float fLtg82 = ltg8();
            invalidateSelf();
            if (fLtg8 != fLtg82) {
                kiv();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (this.ut != i2) {
            this.ut = i2;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        if (this.wh6 != colorFilter) {
            this.wh6 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(@dd ColorStateList colorStateList) {
        if (this.qns != colorStateList) {
            this.qns = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(@lvui PorterDuff.Mode mode) {
        if (this.afw != mode) {
            this.afw = mode;
            this.ls9 = C7398k.zy(this, this.qns, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (erbd()) {
            visible |= this.ax.setVisible(z2, z3);
        }
        if (nc()) {
            visible |= this.bu.setVisible(z2, z3);
        }
        if (zxq()) {
            visible |= this.ay.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void tjz5(@InterfaceC7829h int i2) {
        c25(this.s8y.getResources().getDimension(i2));
    }

    public void tww7(@dd Drawable drawable) {
        Drawable drawableJbh = jbh();
        if (drawableJbh != drawable) {
            float fLtg8 = ltg8();
            this.ax = drawable != null ? zy.ki(drawable).mutate() : null;
            float fLtg82 = ltg8();
            e4e(drawableJbh);
            if (erbd()) {
                py(this.ax);
            }
            invalidateSelf();
            if (fLtg8 != fLtg82) {
                kiv();
            }
        }
    }

    public boolean u38j() {
        return this.am;
    }

    @dd
    public ColorStateList uc() {
        return this.bq;
    }

    public float ukdy() {
        return this.as;
    }

    public void ula6(@dd TextUtils.TruncateAt truncateAt) {
        this.fn2 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void uo(boolean z2) {
        if (this.am != z2) {
            boolean zZxq = zxq();
            this.am = z2;
            boolean zZxq2 = zxq();
            if (zZxq != zZxq2) {
                if (zZxq2) {
                    py(this.ay);
                } else {
                    e4e(this.ay);
                }
                invalidateSelf();
                kiv();
            }
        }
    }

    public float vep5() {
        return this.a7kc ? n5r1() : this.in;
    }

    boolean vg() {
        return this.us2t;
    }

    public void vss1(float f2) {
        if (this.vb6 != f2) {
            this.vb6 = f2;
            invalidateSelf();
            if (zxq()) {
                kiv();
            }
        }
    }

    public void vwb(@InterfaceC7829h int i2) {
        mi1u(this.s8y.getResources().getDimension(i2));
    }

    @InterfaceC7833l
    public int vy() {
        return this.nq0z;
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public boolean m14241w() {
        return u38j();
    }

    @lvui
    Paint.Align w831(@lvui Rect rect, @lvui PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.az != null) {
            float fLtg8 = this.tgs + ltg8() + this.sk1t;
            if (zy.m2441g(this) == 0) {
                pointF.x = rect.left + fLtg8;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fLtg8;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - cfr();
        }
        return align;
    }

    public TextUtils.TruncateAt wlev() {
        return this.fn2;
    }

    public void wt(@zy.n7h int i2) {
        el(C6045k.m22274k(this.s8y, i2));
    }

    @Deprecated
    public void wtop(boolean z2) {
        uo(z2);
    }

    public void wwp(@dd C3915y c3915y) {
        this.w97r = c3915y;
    }

    public float wx16() {
        return this.id;
    }

    public void x7o(@dd ColorStateList colorStateList) {
        C4092q c4092qOki = oki();
        if (c4092qOki != null) {
            c4092qOki.ld6(colorStateList);
            invalidateSelf();
        }
    }

    public void xblq(@InterfaceC7829h int i2) {
        hyow(this.s8y.getResources().getDimension(i2));
    }

    public void xm(@dd ColorStateList colorStateList) {
        this.ad = true;
        if (this.bq != colorStateList) {
            this.bq = colorStateList;
            if (erbd()) {
                zy.kja0(this.ax, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void xtb7(@zy.n7h int i2) {
        pnt2(C6045k.m22274k(this.s8y, i2));
    }

    public void xzl(@dd CharSequence charSequence) {
        if (this.k0 != charSequence) {
            this.k0 = C0616k.zy().qrj(charSequence);
            invalidateSelf();
        }
    }

    public float yl() {
        return this.ac;
    }

    public void yp31(@InterfaceC7845y int i2) {
        zff0(this.s8y.getResources().getBoolean(i2));
    }

    @Deprecated
    public void yw(boolean z2) {
        zff0(z2);
    }

    public void z4j7(@InterfaceC7829h int i2) {
        vss1(this.s8y.getResources().getDimension(i2));
    }

    public void z5(@hb int i2) {
        ge(new C4092q(this.s8y, i2));
    }

    public void z617(@dd Drawable drawable) {
        Drawable drawablePc = pc();
        if (drawablePc != drawable) {
            float fEtdu = etdu();
            this.ay = drawable != null ? zy.ki(drawable).mutate() : null;
            if (toq.f24883k) {
                rf();
            }
            float fEtdu2 = etdu();
            e4e(drawablePc);
            if (zxq()) {
                py(this.ay);
            }
            invalidateSelf();
            if (fEtdu != fEtdu2) {
                kiv();
            }
        }
    }

    public void z8(float f2) {
        if (this.dy != f2) {
            this.dy = f2;
            invalidateSelf();
            kiv();
        }
    }

    public void zff0(boolean z2) {
        if (this.bc != z2) {
            boolean zNc = nc();
            this.bc = z2;
            boolean zNc2 = nc();
            if (zNc != zNc2) {
                if (zNc2) {
                    py(this.bu);
                } else {
                    e4e(this.bu);
                }
                invalidateSelf();
                kiv();
            }
        }
    }

    public void zma(@zy.cdj float f2) {
        C4092q c4092qOki = oki();
        if (c4092qOki != null) {
            c4092qOki.x2(f2);
            this.ndjo.m14564n().setTextSize(f2);
            mo14092k();
        }
    }

    public void zuf(@zy.toq int i2) {
        wwp(C3915y.m13992q(this.s8y, i2));
    }

    public float zwy() {
        return this.bs;
    }
}
