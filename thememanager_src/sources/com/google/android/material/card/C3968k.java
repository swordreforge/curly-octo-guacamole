package com.google.android.material.card;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.view.C0683f;
import androidx.core.view.qrj;
import com.google.android.material.resources.zy;
import com.google.android.material.ripple.toq;
import com.google.android.material.shape.C4102g;
import com.google.android.material.shape.C4107n;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.n7h;
import ij.C6095k;
import zy.cdj;
import zy.dd;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.x2;
import zy.zurt;

/* JADX INFO: renamed from: com.google.android.material.card.k */
/* JADX INFO: compiled from: MaterialCardViewHelper.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
class C3968k {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f67457fn3e = -1;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f67458fu4 = 2;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final float f67459ni7 = 1.5f;

    /* JADX INFO: renamed from: z */
    private static final Drawable f24102z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final double f67460zurt = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @dd
    private C4108p f67461cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67462f7l8;

    /* JADX INFO: renamed from: g */
    @cdj
    private int f24103g;

    /* JADX INFO: renamed from: h */
    @dd
    private LayerDrawable f24104h;

    /* JADX INFO: renamed from: i */
    private boolean f24105i;

    /* JADX INFO: renamed from: k */
    @lvui
    private final MaterialCardView f24106k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private C4108p f67463ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private Drawable f67464kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private ColorStateList f67465ld6;

    /* JADX INFO: renamed from: n */
    @cdj
    private int f24107n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private ColorStateList f67466n7h;

    /* JADX INFO: renamed from: p */
    @dd
    private Drawable f24108p;

    /* JADX INFO: renamed from: q */
    @lvui
    private final C4108p f24109q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private kja0 f67467qrj;

    /* JADX INFO: renamed from: s */
    @dd
    private Drawable f24110s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private ColorStateList f67470x2;

    /* JADX INFO: renamed from: y */
    @cdj
    private int f24111y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final C4108p f67471zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final Rect f67469toq = new Rect();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private boolean f67468t8r = false;

    /* JADX INFO: renamed from: com.google.android.material.card.k$k */
    /* JADX INFO: compiled from: MaterialCardViewHelper.java */
    class k extends InsetDrawable {
        k(Drawable drawable, int i2, int i3, int i4, int i5) {
            super(drawable, i2, i3, i4, i5);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f24102z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C3968k(@lvui MaterialCardView materialCardView, AttributeSet attributeSet, int i2, @hb int i3) {
        this.f24106k = materialCardView;
        C4108p c4108p = new C4108p(materialCardView.getContext(), attributeSet, i2, i3);
        this.f67471zy = c4108p;
        c4108p.m14856e(materialCardView.getContext());
        c4108p.y2(-12303292);
        kja0.toq toqVarZurt = c4108p.getShapeAppearanceModel().zurt();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C6095k.kja0.j1s, i2, C6095k.n7h.ip);
        int i4 = C6095k.kja0.li5y;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            toqVarZurt.kja0(typedArrayObtainStyledAttributes.getDimension(i4, 0.0f));
        }
        this.f24109q = new C4108p();
        m14211c(toqVarZurt.qrj());
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean a9() {
        return (this.f67462f7l8 & 80) == 80;
    }

    /* JADX INFO: renamed from: e */
    private boolean m14202e() {
        return this.f24106k.getPreventCornerOverlap() && !m14207n();
    }

    @lvui
    private Drawable f7l8() {
        if (!toq.f24883k) {
            return m14203g();
        }
        this.f67463ki = m14210y();
        return new RippleDrawable(this.f67465ld6, null, this.f67463ki);
    }

    private boolean fti() {
        return (this.f67462f7l8 & qrj.f50866zy) == 8388613;
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private Drawable m14203g() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C4108p c4108pM14210y = m14210y();
        this.f67461cdj = c4108pM14210y;
        c4108pM14210y.m14867x(this.f67465ld6);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f67461cdj);
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: i */
    private float m14204i() {
        if (this.f24106k.getPreventCornerOverlap() && this.f24106k.getUseCompatPadding()) {
            return (float) ((1.0d - f67460zurt) * ((double) this.f24106k.getCardViewRadius()));
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: k */
    private float m14205k() {
        return Math.max(Math.max(toq(this.f67467qrj.cdj(), this.f67471zy.n5r1()), toq(this.f67467qrj.t8r(), this.f67471zy.hyr())), Math.max(toq(this.f67467qrj.ld6(), this.f67471zy.fn3e()), toq(this.f67467qrj.m14825s(), this.f67471zy.m14858i())));
    }

    @lvui
    private Drawable ki() {
        if (this.f67464kja0 == null) {
            this.f67464kja0 = f7l8();
        }
        if (this.f24104h == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f67464kja0, this.f24109q, this.f24108p});
            this.f24104h = layerDrawable;
            layerDrawable.setId(2, C6095k.y.f80071sc);
        }
        return this.f24104h;
    }

    /* JADX INFO: renamed from: m */
    private void m14206m(Drawable drawable) {
        if (this.f24106k.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f24106k.getForeground()).setDrawable(drawable);
        } else {
            this.f24106k.setForeground(m14209t(drawable));
        }
    }

    /* JADX INFO: renamed from: n */
    private boolean m14207n() {
        return this.f67471zy.m14861m();
    }

    private boolean nn86() {
        return this.f24106k.getPreventCornerOverlap() && m14207n() && this.f24106k.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: q */
    private float m14208q() {
        return (this.f24106k.getMaxCardElevation() * 1.5f) + (nn86() ? m14205k() : 0.0f);
    }

    @lvui
    /* JADX INFO: renamed from: t */
    private Drawable m14209t(Drawable drawable) {
        int iCeil;
        int i2;
        if (this.f24106k.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil(m14208q());
            iCeil = (int) Math.ceil(zy());
            i2 = iCeil2;
        } else {
            iCeil = 0;
            i2 = 0;
        }
        return new k(drawable, iCeil, i2, iCeil, i2);
    }

    private float toq(C4107n c4107n, float f2) {
        if (c4107n instanceof n7h) {
            return (float) ((1.0d - f67460zurt) * ((double) f2));
        }
        if (c4107n instanceof C4102g) {
            return f2 / 2.0f;
        }
        return 0.0f;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    private C4108p m14210y() {
        return new C4108p(this.f67467qrj);
    }

    private void yz() {
        Drawable drawable;
        if (toq.f24883k && (drawable = this.f67464kja0) != null) {
            ((RippleDrawable) drawable).setColor(this.f67465ld6);
            return;
        }
        C4108p c4108p = this.f67461cdj;
        if (c4108p != null) {
            c4108p.m14867x(this.f67465ld6);
        }
    }

    private float zy() {
        return this.f24106k.getMaxCardElevation() + (nn86() ? m14205k() : 0.0f);
    }

    /* JADX INFO: renamed from: c */
    void m14211c(@lvui kja0 kja0Var) {
        this.f67467qrj = kja0Var;
        this.f67471zy.setShapeAppearanceModel(kja0Var);
        this.f67471zy.bo(!r0.m14861m());
        C4108p c4108p = this.f24109q;
        if (c4108p != null) {
            c4108p.setShapeAppearanceModel(kja0Var);
        }
        C4108p c4108p2 = this.f67463ki;
        if (c4108p2 != null) {
            c4108p2.setShapeAppearanceModel(kja0Var);
        }
        C4108p c4108p3 = this.f67461cdj;
        if (c4108p3 != null) {
            c4108p3.setShapeAppearanceModel(kja0Var);
        }
    }

    @dd
    ColorStateList cdj() {
        return this.f67470x2;
    }

    void d2ok(boolean z2) {
        this.f24105i = z2;
    }

    void d3(boolean z2) {
        this.f67468t8r = z2;
    }

    void dd(int i2) {
        this.f67462f7l8 = i2;
        gvn7(this.f24106k.getMeasuredWidth(), this.f24106k.getMeasuredHeight());
    }

    void ek5k() {
        if (!mcp()) {
            this.f24106k.setBackgroundInternal(m14209t(this.f67471zy));
        }
        this.f24106k.setForeground(m14209t(this.f24110s));
    }

    void eqxt(@dd ColorStateList colorStateList) {
        C4108p c4108p = this.f24109q;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c4108p.m14867x(colorStateList);
    }

    /* JADX INFO: renamed from: f */
    void m14212f(@dd ColorStateList colorStateList) {
        this.f67465ld6 = colorStateList;
        yz();
    }

    @zurt(from = 0.0d, to = 1.0d)
    float fn3e() {
        return this.f67471zy.o1t();
    }

    @x2
    int fu4() {
        ColorStateList colorStateList = this.f67466n7h;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    void gvn7(int i2, int i3) {
        int iCeil;
        int i4;
        int i5;
        if (this.f24104h != null) {
            int iCeil2 = 0;
            if (this.f24106k.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(m14208q() * 2.0f);
                iCeil2 = (int) Math.ceil(zy() * 2.0f);
            } else {
                iCeil = 0;
            }
            int i6 = fti() ? ((i2 - this.f24107n) - this.f24103g) - iCeil2 : this.f24107n;
            int i7 = a9() ? this.f24107n : ((i3 - this.f24107n) - this.f24103g) - iCeil;
            int i8 = fti() ? this.f24107n : ((i2 - this.f24107n) - this.f24103g) - iCeil2;
            int i9 = a9() ? ((i3 - this.f24107n) - this.f24103g) - iCeil : this.f24107n;
            if (C0683f.m3159e(this.f24106k) == 1) {
                i5 = i8;
                i4 = i6;
            } else {
                i4 = i8;
                i5 = i6;
            }
            this.f24104h.setLayerInset(2, i5, i9, i4, i7);
        }
    }

    @cdj
    /* JADX INFO: renamed from: h */
    int m14213h() {
        return this.f24103g;
    }

    void hb() {
        Drawable drawable = this.f24110s;
        Drawable drawableKi = this.f24106k.isClickable() ? ki() : this.f24109q;
        this.f24110s = drawableKi;
        if (drawable != drawableKi) {
            m14206m(drawableKi);
        }
    }

    void hyr(@zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f67471zy.ch(f2);
        C4108p c4108p = this.f24109q;
        if (c4108p != null) {
            c4108p.ch(f2);
        }
        C4108p c4108p2 = this.f67463ki;
        if (c4108p2 != null) {
            c4108p2.ch(f2);
        }
    }

    /* JADX INFO: renamed from: j */
    void m14214j() {
        int iM14205k = (int) ((m14202e() || nn86() ? m14205k() : 0.0f) - m14204i());
        MaterialCardView materialCardView = this.f24106k;
        Rect rect = this.f67469toq;
        materialCardView.x2(rect.left + iM14205k, rect.top + iM14205k, rect.right + iM14205k, rect.bottom + iM14205k);
    }

    boolean jk() {
        return this.f24105i;
    }

    void jp0y(@lvui TypedArray typedArray) {
        ColorStateList colorStateListM14753k = zy.m14753k(this.f24106k.getContext(), typedArray, C6095k.kja0.qxj);
        this.f67466n7h = colorStateListM14753k;
        if (colorStateListM14753k == null) {
            this.f67466n7h = ColorStateList.valueOf(-1);
        }
        this.f24111y = typedArray.getDimensionPixelSize(C6095k.kja0.uod, 0);
        boolean z2 = typedArray.getBoolean(C6095k.kja0.v5, false);
        this.f24105i = z2;
        this.f24106k.setLongClickable(z2);
        this.f67470x2 = zy.m14753k(this.f24106k.getContext(), typedArray, C6095k.kja0.sa1t);
        m14218r(zy.m14754n(this.f24106k.getContext(), typedArray, C6095k.kja0.p3));
        ncyb(typedArray.getDimensionPixelSize(C6095k.kja0.o18, 0));
        x9kr(typedArray.getDimensionPixelSize(C6095k.kja0.cs, 0));
        this.f67462f7l8 = typedArray.getInteger(C6095k.kja0.gt, 8388661);
        ColorStateList colorStateListM14753k2 = zy.m14753k(this.f24106k.getContext(), typedArray, C6095k.kja0.gx2z);
        this.f67465ld6 = colorStateListM14753k2;
        if (colorStateListM14753k2 == null) {
            this.f67465ld6 = ColorStateList.valueOf(com.google.android.material.color.kja0.m14285q(this.f24106k, C6095k.zy.f80265qh4d));
        }
        eqxt(zy.m14753k(this.f24106k.getContext(), typedArray, C6095k.kja0.idkz));
        yz();
        m14216o();
        y9n();
        this.f24106k.setBackgroundInternal(m14209t(this.f67471zy));
        Drawable drawableKi = this.f24106k.isClickable() ? ki() : this.f24109q;
        this.f24110s = drawableKi;
        this.f24106k.setForeground(m14209t(drawableKi));
    }

    @cdj
    int kja0() {
        return this.f24107n;
    }

    /* JADX INFO: renamed from: l */
    void m14215l(@dd ColorStateList colorStateList) {
        this.f67470x2 = colorStateList;
        Drawable drawable = this.f24108p;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.kja0(drawable, colorStateList);
        }
    }

    ColorStateList ld6() {
        return this.f67471zy.m14869z();
    }

    void lrht(ColorStateList colorStateList) {
        if (this.f67466n7h == colorStateList) {
            return;
        }
        this.f67466n7h = colorStateList;
        y9n();
    }

    public void lvui(boolean z2) {
        Drawable drawable = this.f24108p;
        if (drawable != null) {
            drawable.setAlpha(z2 ? 255 : 0);
        }
    }

    boolean mcp() {
        return this.f67468t8r;
    }

    void n5r1(float f2) {
        m14211c(this.f67467qrj.ni7(f2));
        this.f24110s.invalidateSelf();
        if (nn86() || m14202e()) {
            m14214j();
        }
        if (nn86()) {
            ek5k();
        }
    }

    int n7h() {
        return this.f67462f7l8;
    }

    void ncyb(@cdj int i2) {
        this.f24103g = i2;
    }

    kja0 ni7() {
        return this.f67467qrj;
    }

    /* JADX INFO: renamed from: o */
    void m14216o() {
        this.f67471zy.zp(this.f24106k.getCardElevation());
    }

    @cdj
    int o1t() {
        return this.f24111y;
    }

    void oc(ColorStateList colorStateList) {
        this.f67471zy.m14867x(colorStateList);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    C4108p m14217p() {
        return this.f67471zy;
    }

    @dd
    Drawable qrj() {
        return this.f24108p;
    }

    /* JADX INFO: renamed from: r */
    void m14218r(@dd Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
            this.f24108p = drawableMutate;
            androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f67470x2);
            lvui(this.f24106k.isChecked());
        } else {
            this.f24108p = f24102z;
        }
        LayerDrawable layerDrawable = this.f24104h;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C6095k.y.f80071sc, this.f24108p);
        }
    }

    @hyr(api = 23)
    /* JADX INFO: renamed from: s */
    void m14219s() {
        Drawable drawable = this.f67464kja0;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i2 = bounds.bottom;
            this.f67464kja0.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
            this.f67464kja0.setBounds(bounds.left, bounds.top, bounds.right, i2);
        }
    }

    float t8r() {
        return this.f67471zy.n5r1();
    }

    void uv6(@cdj int i2) {
        if (i2 == this.f24111y) {
            return;
        }
        this.f24111y = i2;
        y9n();
    }

    void vyq(int i2, int i3, int i4, int i5) {
        this.f67469toq.set(i2, i3, i4, i5);
        m14214j();
    }

    @lvui
    Rect wvg() {
        return this.f67469toq;
    }

    ColorStateList x2() {
        return this.f24109q.m14869z();
    }

    void x9kr(@cdj int i2) {
        this.f24107n = i2;
    }

    void y9n() {
        this.f24109q.vq(this.f24111y, this.f67466n7h);
    }

    @dd
    /* JADX INFO: renamed from: z */
    ColorStateList m14220z() {
        return this.f67466n7h;
    }

    @dd
    ColorStateList zurt() {
        return this.f67465ld6;
    }
}
