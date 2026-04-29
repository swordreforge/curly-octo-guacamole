package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.zy;
import androidx.core.view.C0683f;
import com.google.android.material.internal.C4058z;
import com.google.android.material.ripple.C4094k;
import com.google.android.material.ripple.toq;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.t8r;
import ij.C6095k;
import zy.cdj;
import zy.dd;
import zy.ld6;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.button.k */
/* JADX INFO: compiled from: MaterialButtonHelper.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
class C3966k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private boolean f67445cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67446f7l8;

    /* JADX INFO: renamed from: g */
    private int f24080g;

    /* JADX INFO: renamed from: k */
    private final MaterialButton f24082k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private LayerDrawable f67447ki;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private ColorStateList f67449ld6;

    /* JADX INFO: renamed from: n */
    private int f24083n;

    /* JADX INFO: renamed from: p */
    @dd
    private ColorStateList f24084p;

    /* JADX INFO: renamed from: q */
    private int f24085q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private Drawable f67451qrj;

    /* JADX INFO: renamed from: s */
    @dd
    private PorterDuff.Mode f24086s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f67452t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private kja0 f67453toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dd
    private ColorStateList f67454x2;

    /* JADX INFO: renamed from: y */
    private int f24087y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67455zy;

    /* JADX INFO: renamed from: i */
    @ld6(api = 21)
    private static final boolean f24079i = true;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final boolean f67444fn3e = false;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f67450n7h = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f67448kja0 = false;

    /* JADX INFO: renamed from: h */
    private boolean f24081h = false;

    C3966k(MaterialButton materialButton, @lvui kja0 kja0Var) {
        this.f24082k = materialButton;
        this.f67453toq = kja0Var;
    }

    private void a9(@cdj int i2, @cdj int i3) {
        int iI1 = C0683f.i1(this.f24082k);
        int paddingTop = this.f24082k.getPaddingTop();
        int iBf2 = C0683f.bf2(this.f24082k);
        int paddingBottom = this.f24082k.getPaddingBottom();
        int i4 = this.f24083n;
        int i5 = this.f24080g;
        this.f24080g = i3;
        this.f24083n = i2;
        if (!this.f67448kja0) {
            fti();
        }
        C0683f.u38j(this.f24082k, iI1, (paddingTop + i2) - i4, iBf2, (paddingBottom + i3) - i5);
    }

    private void d3() {
        C4108p c4108pM14188g = m14188g();
        C4108p c4108pN7h = n7h();
        if (c4108pM14188g != null) {
            c4108pM14188g.vq(this.f24087y, this.f67449ld6);
            if (c4108pN7h != null) {
                c4108pN7h.mu(this.f24087y, this.f67450n7h ? com.google.android.material.color.kja0.m14285q(this.f24082k, C6095k.zy.f80274sc) : 0);
            }
        }
    }

    @dd
    private C4108p f7l8(boolean z2) {
        LayerDrawable layerDrawable = this.f67447ki;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f24079i ? (C4108p) ((LayerDrawable) ((InsetDrawable) this.f67447ki.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0) : (C4108p) this.f67447ki.getDrawable(!z2 ? 1 : 0);
    }

    private void fti() {
        this.f24082k.setInternalBackground(m14187k());
        C4108p c4108pM14188g = m14188g();
        if (c4108pM14188g != null) {
            c4108pM14188g.zp(this.f67452t8r);
        }
    }

    private void jp0y(@lvui kja0 kja0Var) {
        if (f67444fn3e && !this.f67448kja0) {
            int iI1 = C0683f.i1(this.f24082k);
            int paddingTop = this.f24082k.getPaddingTop();
            int iBf2 = C0683f.bf2(this.f24082k);
            int paddingBottom = this.f24082k.getPaddingBottom();
            fti();
            C0683f.u38j(this.f24082k, iI1, paddingTop, iBf2, paddingBottom);
            return;
        }
        if (m14188g() != null) {
            m14188g().setShapeAppearanceModel(kja0Var);
        }
        if (n7h() != null) {
            n7h().setShapeAppearanceModel(kja0Var);
        }
        if (m14191n() != null) {
            m14191n().setShapeAppearanceModel(kja0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    private Drawable m14187k() {
        C4108p c4108p = new C4108p(this.f67453toq);
        c4108p.m14856e(this.f24082k.getContext());
        zy.kja0(c4108p, this.f24084p);
        PorterDuff.Mode mode = this.f24086s;
        if (mode != null) {
            zy.m2442h(c4108p, mode);
        }
        c4108p.vq(this.f24087y, this.f67449ld6);
        C4108p c4108p2 = new C4108p(this.f67453toq);
        c4108p2.setTint(0);
        c4108p2.mu(this.f24087y, this.f67450n7h ? com.google.android.material.color.kja0.m14285q(this.f24082k, C6095k.zy.f80274sc) : 0);
        if (f24079i) {
            C4108p c4108p3 = new C4108p(this.f67453toq);
            this.f67451qrj = c4108p3;
            zy.n7h(c4108p3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(toq.m14763q(this.f67454x2), oc(new LayerDrawable(new Drawable[]{c4108p2, c4108p})), this.f67451qrj);
            this.f67447ki = rippleDrawable;
            return rippleDrawable;
        }
        C4094k c4094k = new C4094k(this.f67453toq);
        this.f67451qrj = c4094k;
        zy.kja0(c4094k, toq.m14763q(this.f67454x2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c4108p2, c4108p, this.f67451qrj});
        this.f67447ki = layerDrawable;
        return oc(layerDrawable);
    }

    @dd
    private C4108p n7h() {
        return f7l8(true);
    }

    @lvui
    private InsetDrawable oc(Drawable drawable) {
        return new InsetDrawable(drawable, this.f67455zy, this.f24083n, this.f24085q, this.f24080g);
    }

    void cdj(@lvui TypedArray typedArray) {
        this.f67455zy = typedArray.getDimensionPixelOffset(C6095k.kja0.q8n, 0);
        this.f24085q = typedArray.getDimensionPixelOffset(C6095k.kja0.d7, 0);
        this.f24083n = typedArray.getDimensionPixelOffset(C6095k.kja0.h8w0, 0);
        this.f24080g = typedArray.getDimensionPixelOffset(C6095k.kja0.a6, 0);
        int i2 = C6095k.kja0.rpjx;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.f67446f7l8 = dimensionPixelSize;
            m14197z(this.f67453toq.ni7(dimensionPixelSize));
            this.f24081h = true;
        }
        this.f24087y = typedArray.getDimensionPixelSize(C6095k.kja0.vs4, 0);
        this.f24086s = C4058z.x2(typedArray.getInt(C6095k.kja0.km, -1), PorterDuff.Mode.SRC_IN);
        this.f24084p = com.google.android.material.resources.zy.m14753k(this.f24082k.getContext(), typedArray, C6095k.kja0.fh1);
        this.f67449ld6 = com.google.android.material.resources.zy.m14753k(this.f24082k.getContext(), typedArray, C6095k.kja0.ifc);
        this.f67454x2 = com.google.android.material.resources.zy.m14753k(this.f24082k.getContext(), typedArray, C6095k.kja0.vx9l);
        this.f67445cdj = typedArray.getBoolean(C6095k.kja0.uciq, false);
        this.f67452t8r = typedArray.getDimensionPixelSize(C6095k.kja0.qhg7, 0);
        int iI1 = C0683f.i1(this.f24082k);
        int paddingTop = this.f24082k.getPaddingTop();
        int iBf2 = C0683f.bf2(this.f24082k);
        int paddingBottom = this.f24082k.getPaddingBottom();
        if (typedArray.hasValue(C6095k.kja0.eqnj)) {
            t8r();
        } else {
            fti();
        }
        C0683f.u38j(this.f24082k, iI1 + this.f67455zy, paddingTop + this.f24083n, iBf2 + this.f24085q, paddingBottom + this.f24080g);
    }

    void fn3e(int i2) {
        if (this.f24081h && this.f67446f7l8 == i2) {
            return;
        }
        this.f67446f7l8 = i2;
        this.f24081h = true;
        m14197z(this.f67453toq.ni7(i2));
    }

    void fu4(@dd ColorStateList colorStateList) {
        if (this.f67454x2 != colorStateList) {
            this.f67454x2 = colorStateList;
            boolean z2 = f24079i;
            if (z2 && (this.f24082k.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f24082k.getBackground()).setColor(toq.m14763q(colorStateList));
            } else {
                if (z2 || !(this.f24082k.getBackground() instanceof C4094k)) {
                    return;
                }
                ((C4094k) this.f24082k.getBackground()).setTintList(toq.m14763q(colorStateList));
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: g */
    C4108p m14188g() {
        return f7l8(false);
    }

    void gvn7(int i2, int i3) {
        Drawable drawable = this.f67451qrj;
        if (drawable != null) {
            drawable.setBounds(this.f67455zy, this.f24083n, i3 - this.f24085q, i2 - this.f24080g);
        }
    }

    /* JADX INFO: renamed from: h */
    boolean m14189h() {
        return this.f67445cdj;
    }

    /* JADX INFO: renamed from: i */
    void m14190i(boolean z2) {
        this.f67445cdj = z2;
    }

    void jk(@dd PorterDuff.Mode mode) {
        if (this.f24086s != mode) {
            this.f24086s = mode;
            if (m14188g() == null || this.f24086s == null) {
                return;
            }
            zy.m2442h(m14188g(), this.f24086s);
        }
    }

    void ki(int i2) {
        if (m14188g() != null) {
            m14188g().setTint(i2);
        }
    }

    boolean kja0() {
        return this.f67448kja0;
    }

    int ld6() {
        return this.f24087y;
    }

    void mcp(@dd ColorStateList colorStateList) {
        if (this.f24084p != colorStateList) {
            this.f24084p = colorStateList;
            if (m14188g() != null) {
                zy.kja0(m14188g(), this.f24084p);
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    public t8r m14191n() {
        LayerDrawable layerDrawable = this.f67447ki;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f67447ki.getNumberOfLayers() > 2 ? (t8r) this.f67447ki.getDrawable(2) : (t8r) this.f67447ki.getDrawable(1);
    }

    public void ni7(@cdj int i2) {
        a9(i2, this.f24080g);
    }

    void o1t(boolean z2) {
        this.f67450n7h = z2;
        d3();
    }

    @dd
    /* JADX INFO: renamed from: p */
    ColorStateList m14192p() {
        return this.f67449ld6;
    }

    /* JADX INFO: renamed from: q */
    public int m14193q() {
        return this.f24083n;
    }

    PorterDuff.Mode qrj() {
        return this.f24086s;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    kja0 m14194s() {
        return this.f67453toq;
    }

    /* JADX INFO: renamed from: t */
    void m14195t(int i2) {
        if (this.f24087y != i2) {
            this.f24087y = i2;
            d3();
        }
    }

    void t8r() {
        this.f67448kja0 = true;
        this.f24082k.setSupportBackgroundTintList(this.f24084p);
        this.f24082k.setSupportBackgroundTintMode(this.f24086s);
    }

    int toq() {
        return this.f67446f7l8;
    }

    void wvg(@dd ColorStateList colorStateList) {
        if (this.f67449ld6 != colorStateList) {
            this.f67449ld6 = colorStateList;
            d3();
        }
    }

    ColorStateList x2() {
        return this.f24084p;
    }

    @dd
    /* JADX INFO: renamed from: y */
    ColorStateList m14196y() {
        return this.f67454x2;
    }

    /* JADX INFO: renamed from: z */
    void m14197z(@lvui kja0 kja0Var) {
        this.f67453toq = kja0Var;
        jp0y(kja0Var);
    }

    public void zurt(@cdj int i2) {
        a9(this.f24083n, i2);
    }

    public int zy() {
        return this.f24080g;
    }
}
