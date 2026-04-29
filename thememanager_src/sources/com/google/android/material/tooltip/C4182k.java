package com.google.android.material.tooltip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.C0541p;
import com.google.android.material.animation.C3910k;
import com.google.android.material.color.kja0;
import com.google.android.material.internal.cdj;
import com.google.android.material.internal.n7h;
import com.google.android.material.resources.C4092q;
import com.google.android.material.resources.zy;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.C4110s;
import com.google.android.material.shape.f7l8;
import com.google.android.material.shape.x2;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.InterfaceC7833l;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.nn86;
import zy.uv6;
import zy.zurt;

/* JADX INFO: renamed from: com.google.android.material.tooltip.k */
/* JADX INFO: compiled from: TooltipDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4182k extends C4108p implements n7h.toq {

    @hb
    private static final int bs = C6095k.n7h.xd;

    @InterfaceC7828g
    private static final int k0 = C6095k.zy.bhh;
    private int ac;
    private float ad;
    private float aj;
    private float am;

    @lvui
    private final Context an;

    @lvui
    private final Rect as;
    private int ax;
    private final float ay;
    private int az;
    private int ba;
    private float be;
    private int bg;

    @lvui
    private final View.OnLayoutChangeListener bl;
    private int bq;

    @dd
    private CharSequence bv;

    @dd
    private final Paint.FontMetrics id;

    @lvui
    private final n7h in;

    /* JADX INFO: renamed from: com.google.android.material.tooltip.k$k */
    /* JADX INFO: compiled from: TooltipDrawable.java */
    class k implements View.OnLayoutChangeListener {
        k() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            C4182k.this.yl(view);
        }
    }

    private C4182k(@lvui Context context, AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        super(context, attributeSet, i2, i3);
        this.id = new Paint.FontMetrics();
        n7h n7hVar = new n7h(this);
        this.in = n7hVar;
        this.bl = new k();
        this.as = new Rect();
        this.ad = 1.0f;
        this.am = 1.0f;
        this.ay = 0.5f;
        this.be = 0.5f;
        this.aj = 1.0f;
        this.an = context;
        n7hVar.m14564n().density = context.getResources().getDisplayMetrics().density;
        n7hVar.m14564n().setTextAlign(Paint.Align.CENTER);
    }

    private void bz2(@dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        TypedArray typedArrayM14534p = cdj.m14534p(this.an, attributeSet, C6095k.kja0.dv5, i2, i3, new int[0]);
        this.bq = this.an.getResources().getDimensionPixelSize(C6095k.g.c08);
        setShapeAppearanceModel(getShapeAppearanceModel().zurt().m14836i(sok()).qrj());
        cv06(typedArrayM14534p.getText(C6095k.kja0.njq));
        C4092q c4092qF7l8 = zy.f7l8(this.an, typedArrayM14534p, C6095k.kja0.o7h);
        if (c4092qF7l8 != null) {
            int i4 = C6095k.kja0.cjs;
            if (typedArrayM14534p.hasValue(i4)) {
                c4092qF7l8.ld6(zy.m14753k(this.an, typedArrayM14534p, i4));
            }
        }
        h7am(c4092qF7l8);
        m14867x(ColorStateList.valueOf(typedArrayM14534p.getColor(C6095k.kja0.zqoj, kja0.x2(C0541p.m2542t(kja0.zy(this.an, R.attr.colorBackground, C4182k.class.getCanonicalName()), 229), C0541p.m2542t(kja0.zy(this.an, C6095k.zy.f80312xtb7, C4182k.class.getCanonicalName()), 153)))));
        qkj8(ColorStateList.valueOf(kja0.zy(this.an, C6095k.zy.f80274sc, C4182k.class.getCanonicalName())));
        this.bg = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.koyb, 0);
        this.az = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.os4s, 0);
        this.ba = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.w2q9, 0);
        this.ax = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.izd, 0);
        typedArrayM14534p.recycle();
    }

    @lvui
    public static C4182k etdu(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        C4182k c4182k = new C4182k(context, attributeSet, i2, i3);
        c4182k.bz2(attributeSet, i2, i3);
        return c4182k;
    }

    private float i9jn() {
        int i2;
        if (((this.as.right - getBounds().right) - this.ac) - this.ax < 0) {
            i2 = ((this.as.right - getBounds().right) - this.ac) - this.ax;
        } else {
            if (((this.as.left - getBounds().left) - this.ac) + this.ax <= 0) {
                return 0.0f;
            }
            i2 = ((this.as.left - getBounds().left) - this.ac) + this.ax;
        }
        return i2;
    }

    private float ltg8() {
        this.in.m14564n().getFontMetrics(this.id);
        Paint.FontMetrics fontMetrics = this.id;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @lvui
    public static C4182k m4(@lvui Context context) {
        return etdu(context, null, k0, bs);
    }

    private float r8s8(@lvui Rect rect) {
        return rect.centerY() - ltg8();
    }

    private f7l8 sok() {
        float f2 = -i9jn();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.bq) * Math.sqrt(2.0d)))) / 2.0f;
        return new x2(new C4110s(this.bq), Math.min(Math.max(f2, -fWidth), fWidth));
    }

    @lvui
    public static C4182k v0af(@lvui Context context, @dd AttributeSet attributeSet) {
        return etdu(context, attributeSet, k0, bs);
    }

    private void w831(@lvui Canvas canvas) {
        if (this.bv == null) {
            return;
        }
        int iR8s8 = (int) r8s8(getBounds());
        if (this.in.m14566q() != null) {
            this.in.m14564n().drawableState = getState();
            this.in.ld6(this.an);
            this.in.m14564n().setAlpha((int) (this.aj * 255.0f));
        }
        CharSequence charSequence = this.bv;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), iR8s8, this.in.m14564n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yl(@lvui View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.ac = iArr[0];
        view.getWindowVisibleDisplayFrame(this.as);
    }

    private float zkd() {
        CharSequence charSequence = this.bv;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.in.m14563g(charSequence.toString());
    }

    public void b3e(@dd View view) {
        if (view == null) {
            return;
        }
        yl(view);
        view.addOnLayoutChangeListener(this.bl);
    }

    public void bek6(@zurt(from = 0.0d, to = 1.0d) float f2) {
        this.be = 1.2f;
        this.ad = f2;
        this.am = f2;
        this.aj = C3910k.toq(0.0f, 1.0f, 0.19f, 1.0f, f2);
        invalidateSelf();
    }

    @dd
    public CharSequence bwp() {
        return this.bv;
    }

    public void cfr(@dd View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.bl);
    }

    public void cv06(@dd CharSequence charSequence) {
        if (TextUtils.equals(this.bv, charSequence)) {
            return;
        }
        this.bv = charSequence;
        this.in.m14565p(true);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        canvas.save();
        float fI9jn = i9jn();
        float f2 = (float) (-((((double) this.bq) * Math.sqrt(2.0d)) - ((double) this.bq)));
        canvas.scale(this.ad, this.am, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.be));
        canvas.translate(fI9jn, f2);
        super.draw(canvas);
        w831(canvas);
        canvas.restore();
    }

    public int gc3c() {
        return this.bg;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.in.m14564n().getTextSize(), this.ba);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.bg * 2) + zkd(), this.az);
    }

    public void h7am(@dd C4092q c4092q) {
        this.in.m14567s(c4092q, this.an);
    }

    public void jbh(@nn86 int i2) {
        cv06(this.an.getResources().getString(i2));
    }

    public void jz5(@InterfaceC7833l int i2) {
        this.ba = i2;
        invalidateSelf();
    }

    @Override // com.google.android.material.internal.n7h.toq
    /* JADX INFO: renamed from: k */
    public void mo14092k() {
        invalidateSelf();
    }

    public int kcsr() {
        return this.az;
    }

    public void ktq(@InterfaceC7833l int i2) {
        this.az = i2;
        invalidateSelf();
    }

    public void mbx(@InterfaceC7833l int i2) {
        this.bg = i2;
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().zurt().m14836i(sok()).qrj());
    }

    @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable, com.google.android.material.internal.n7h.toq
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @dd
    public C4092q se() {
        return this.in.m14566q();
    }

    public void uj2j(@InterfaceC7833l int i2) {
        this.ax = i2;
        invalidateSelf();
    }

    public void vep5(@hb int i2) {
        h7am(new C4092q(this.an, i2));
    }

    public int yqrt() {
        return this.ba;
    }

    public int z4() {
        return this.ax;
    }
}
