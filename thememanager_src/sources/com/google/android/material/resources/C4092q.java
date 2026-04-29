package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0506s;
import ij.C6095k;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.ni7;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.material.resources.q */
/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4092q {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f67775fn3e = 3;

    /* JADX INFO: renamed from: i */
    private static final int f24867i = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f67776ki = "TextAppearance";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f67777t8r = 1;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private Typeface f67778cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final boolean f67779f7l8;

    /* JADX INFO: renamed from: g */
    public final int f24868g;

    /* JADX INFO: renamed from: h */
    private boolean f24869h = false;

    /* JADX INFO: renamed from: k */
    @dd
    public final ColorStateList f24870k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @ni7
    private final int f67780kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public final boolean f67781ld6;

    /* JADX INFO: renamed from: n */
    public final int f24871n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f67782n7h;

    /* JADX INFO: renamed from: p */
    public final float f24872p;

    /* JADX INFO: renamed from: q */
    @dd
    public final String f24873q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private ColorStateList f67783qrj;

    /* JADX INFO: renamed from: s */
    public final float f24874s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    public final ColorStateList f67784toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final float f67785x2;

    /* JADX INFO: renamed from: y */
    public final float f24875y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    public final ColorStateList f67786zy;

    /* JADX INFO: renamed from: com.google.android.material.resources.q$k */
    /* JADX INFO: compiled from: TextAppearance.java */
    class k extends C0506s.f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC4089g f24876k;

        k(AbstractC4089g abstractC4089g) {
            this.f24876k = abstractC4089g;
        }

        @Override // androidx.core.content.res.C0506s.f7l8
        /* JADX INFO: renamed from: s */
        public void f7l8(@lvui Typeface typeface) {
            C4092q c4092q = C4092q.this;
            c4092q.f67778cdj = Typeface.create(typeface, c4092q.f24871n);
            C4092q.this.f24869h = true;
            this.f24876k.toq(C4092q.this.f67778cdj, false);
        }

        @Override // androidx.core.content.res.C0506s.f7l8
        /* JADX INFO: renamed from: y */
        public void m2335g(int i2) {
            C4092q.this.f24869h = true;
            this.f24876k.mo14231k(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.resources.q$toq */
    /* JADX INFO: compiled from: TextAppearance.java */
    class toq extends AbstractC4089g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f24877k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ TextPaint f67788toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ AbstractC4089g f67789zy;

        toq(Context context, TextPaint textPaint, AbstractC4089g abstractC4089g) {
            this.f24877k = context;
            this.f67788toq = textPaint;
            this.f67789zy = abstractC4089g;
        }

        @Override // com.google.android.material.resources.AbstractC4089g
        /* JADX INFO: renamed from: k */
        public void mo14231k(int i2) {
            this.f67789zy.mo14231k(i2);
        }

        @Override // com.google.android.material.resources.AbstractC4089g
        public void toq(@lvui Typeface typeface, boolean z2) {
            C4092q.this.m14741h(this.f24877k, this.f67788toq, typeface);
            this.f67789zy.toq(typeface, z2);
        }
    }

    public C4092q(@lvui Context context, @hb int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C6095k.kja0.uw73);
        x2(typedArrayObtainStyledAttributes.getDimension(C6095k.kja0.l1l1, 0.0f));
        ld6(zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.b7sa));
        this.f24870k = zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.e7ie);
        this.f67784toq = zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.e58q);
        this.f24871n = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.ea, 0);
        this.f24868g = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.l3h, 1);
        int iM14752g = zy.m14752g(typedArrayObtainStyledAttributes, C6095k.kja0.lm3, C6095k.kja0.jky);
        this.f67780kja0 = typedArrayObtainStyledAttributes.getResourceId(iM14752g, 0);
        this.f24873q = typedArrayObtainStyledAttributes.getString(iM14752g);
        this.f67779f7l8 = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.xzve, false);
        this.f67786zy = zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.oa6p);
        this.f24875y = typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.pjp, 0.0f);
        this.f24874s = typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.u74, 0.0f);
        this.f24872p = typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.ur0a, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i2, C6095k.kja0.cu);
        int i3 = C6095k.kja0.jad;
        this.f67781ld6 = typedArrayObtainStyledAttributes2.hasValue(i3);
        this.f67785x2 = typedArrayObtainStyledAttributes2.getFloat(i3, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* JADX INFO: renamed from: q */
    private void m14739q() {
        String str;
        if (this.f67778cdj == null && (str = this.f24873q) != null) {
            this.f67778cdj = Typeface.create(str, this.f24871n);
        }
        if (this.f67778cdj == null) {
            int i2 = this.f24868g;
            if (i2 == 1) {
                this.f67778cdj = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.f67778cdj = Typeface.SERIF;
            } else if (i2 != 3) {
                this.f67778cdj = Typeface.DEFAULT;
            } else {
                this.f67778cdj = Typeface.MONOSPACE;
            }
            this.f67778cdj = Typeface.create(this.f67778cdj, this.f24871n);
        }
    }

    private boolean qrj(Context context) {
        if (C4091n.toq()) {
            return true;
        }
        int i2 = this.f67780kja0;
        return (i2 != 0 ? C0506s.m2332q(context, i2) : null) != null;
    }

    public void f7l8(@lvui Context context, @lvui TextPaint textPaint, @lvui AbstractC4089g abstractC4089g) {
        m14741h(context, textPaint, m14742n());
        m14745y(context, new toq(context, textPaint, abstractC4089g));
    }

    @lvui
    @yz
    /* JADX INFO: renamed from: g */
    public Typeface m14740g(@lvui Context context) {
        if (this.f24869h) {
            return this.f67778cdj;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM2331p = C0506s.m2331p(context, this.f67780kja0);
                this.f67778cdj = typefaceM2331p;
                if (typefaceM2331p != null) {
                    this.f67778cdj = Typeface.create(typefaceM2331p, this.f24871n);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d(f67776ki, "Error loading font " + this.f24873q, e2);
            }
        }
        m14739q();
        this.f24869h = true;
        return this.f67778cdj;
    }

    /* JADX INFO: renamed from: h */
    public void m14741h(@lvui Context context, @lvui TextPaint textPaint, @lvui Typeface typeface) {
        Typeface typefaceM14751k = C4093y.m14751k(context, typeface);
        if (typefaceM14751k != null) {
            typeface = typefaceM14751k;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.f24871n & (~typeface.getStyle());
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f67782n7h);
        if (this.f67781ld6) {
            textPaint.setLetterSpacing(this.f67785x2);
        }
    }

    public void kja0(@lvui Context context, @lvui TextPaint textPaint, @lvui AbstractC4089g abstractC4089g) {
        if (qrj(context)) {
            m14741h(context, textPaint, m14740g(context));
        } else {
            f7l8(context, textPaint, abstractC4089g);
        }
    }

    public void ld6(@dd ColorStateList colorStateList) {
        this.f67783qrj = colorStateList;
    }

    /* JADX INFO: renamed from: n */
    public Typeface m14742n() {
        m14739q();
        return this.f67778cdj;
    }

    public void n7h(@lvui Context context, @lvui TextPaint textPaint, @lvui AbstractC4089g abstractC4089g) {
        kja0(context, textPaint, abstractC4089g);
        ColorStateList colorStateList = this.f67783qrj;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f24872p;
        float f3 = this.f24875y;
        float f4 = this.f24874s;
        ColorStateList colorStateList2 = this.f67786zy;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* JADX INFO: renamed from: p */
    public float m14743p() {
        return this.f67782n7h;
    }

    @dd
    /* JADX INFO: renamed from: s */
    public ColorStateList m14744s() {
        return this.f67783qrj;
    }

    public void x2(float f2) {
        this.f67782n7h = f2;
    }

    /* JADX INFO: renamed from: y */
    public void m14745y(@lvui Context context, @lvui AbstractC4089g abstractC4089g) {
        if (qrj(context)) {
            m14740g(context);
        } else {
            m14739q();
        }
        int i2 = this.f67780kja0;
        if (i2 == 0) {
            this.f24869h = true;
        }
        if (this.f24869h) {
            abstractC4089g.toq(this.f67778cdj, true);
            return;
        }
        try {
            C0506s.x2(context, i2, new k(abstractC4089g), null);
        } catch (Resources.NotFoundException unused) {
            this.f24869h = true;
            abstractC4089g.mo14231k(1);
        } catch (Exception e2) {
            Log.d(f67776ki, "Error loading font " + this.f24873q, e2);
            this.f24869h = true;
            abstractC4089g.mo14231k(-3);
        }
    }
}
