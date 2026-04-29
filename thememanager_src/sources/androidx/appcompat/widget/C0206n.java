package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C0683f;
import p030n.C7397k;

/* JADX INFO: renamed from: androidx.appcompat.widget.n */
/* JADX INFO: compiled from: AppCompatBackgroundHelper.java */
/* JADX INFO: loaded from: classes.dex */
class C0206n {

    /* JADX INFO: renamed from: g */
    private yz f1108g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final View f1109k;

    /* JADX INFO: renamed from: n */
    private yz f1110n;

    /* JADX INFO: renamed from: q */
    private yz f1111q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46926zy = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ld6 f46925toq = ld6.toq();

    C0206n(@zy.lvui View view) {
        this.f1109k = view;
    }

    /* JADX INFO: renamed from: k */
    private boolean m657k(@zy.lvui Drawable drawable) {
        if (this.f1108g == null) {
            this.f1108g = new yz();
        }
        yz yzVar = this.f1108g;
        yzVar.m743k();
        ColorStateList colorStateListM3172r = C0683f.m3172r(this.f1109k);
        if (colorStateListM3172r != null) {
            yzVar.f1221q = true;
            yzVar.f1220k = colorStateListM3172r;
        }
        PorterDuff.Mode modeDd = C0683f.dd(this.f1109k);
        if (modeDd != null) {
            yzVar.f46978zy = true;
            yzVar.f46977toq = modeDd;
        }
        if (!yzVar.f1221q && !yzVar.f46978zy) {
            return false;
        }
        ld6.m630p(drawable, yzVar, this.f1109k.getDrawableState());
        return true;
    }

    private boolean ld6() {
        return this.f1111q != null;
    }

    void f7l8(int i2) {
        this.f46926zy = i2;
        ld6 ld6Var = this.f46925toq;
        m663y(ld6Var != null ? ld6Var.m632g(this.f1109k.getContext(), i2) : null);
        toq();
    }

    /* JADX INFO: renamed from: g */
    void m658g(Drawable drawable) {
        this.f46926zy = -1;
        m663y(null);
        toq();
    }

    /* JADX INFO: renamed from: n */
    void m659n(@zy.dd AttributeSet attributeSet, int i2) {
        Context context = this.f1109k.getContext();
        int[] iArr = C7397k.qrj.ngvg;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        View view = this.f1109k;
        C0683f.ij(view, view.getContext(), iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        try {
            int i3 = C7397k.qrj.ek;
            if (c0184bJp0y.mcp(i3)) {
                this.f46926zy = c0184bJp0y.fn3e(i3, -1);
                ColorStateList colorStateListM632g = this.f46925toq.m632g(this.f1109k.getContext(), this.f46926zy);
                if (colorStateListM632g != null) {
                    m663y(colorStateListM632g);
                }
            }
            int i4 = C7397k.qrj.ivs;
            if (c0184bJp0y.mcp(i4)) {
                C0683f.ga(this.f1109k, c0184bJp0y.m550q(i4));
            }
            int i5 = C7397k.qrj.eh;
            if (c0184bJp0y.mcp(i5)) {
                C0683f.e5(this.f1109k, oc.m697n(c0184bJp0y.kja0(i5, -1), null));
            }
        } finally {
            c0184bJp0y.d3();
        }
    }

    /* JADX INFO: renamed from: p */
    void m660p(PorterDuff.Mode mode) {
        if (this.f1110n == null) {
            this.f1110n = new yz();
        }
        yz yzVar = this.f1110n;
        yzVar.f46977toq = mode;
        yzVar.f46978zy = true;
        toq();
    }

    /* JADX INFO: renamed from: q */
    PorterDuff.Mode m661q() {
        yz yzVar = this.f1110n;
        if (yzVar != null) {
            return yzVar.f46977toq;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    void m662s(ColorStateList colorStateList) {
        if (this.f1110n == null) {
            this.f1110n = new yz();
        }
        yz yzVar = this.f1110n;
        yzVar.f1220k = colorStateList;
        yzVar.f1221q = true;
        toq();
    }

    void toq() {
        Drawable background = this.f1109k.getBackground();
        if (background != null) {
            if (ld6() && m657k(background)) {
                return;
            }
            yz yzVar = this.f1110n;
            if (yzVar != null) {
                ld6.m630p(background, yzVar, this.f1109k.getDrawableState());
                return;
            }
            yz yzVar2 = this.f1111q;
            if (yzVar2 != null) {
                ld6.m630p(background, yzVar2, this.f1109k.getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: y */
    void m663y(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1111q == null) {
                this.f1111q = new yz();
            }
            yz yzVar = this.f1111q;
            yzVar.f1220k = colorStateList;
            yzVar.f1221q = true;
        } else {
            this.f1111q = null;
        }
        toq();
    }

    ColorStateList zy() {
        yz yzVar = this.f1110n;
        if (yzVar != null) {
            return yzVar.f1220k;
        }
        return null;
    }
}
