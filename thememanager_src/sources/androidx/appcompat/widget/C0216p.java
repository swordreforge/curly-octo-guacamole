package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.view.C0683f;
import androidx.core.widget.C0760q;
import p023g.C6045k;
import p030n.C7397k;

/* JADX INFO: renamed from: androidx.appcompat.widget.p */
/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
class C0216p {

    /* JADX INFO: renamed from: g */
    private boolean f1169g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final CompoundButton f1170k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ColorStateList f46943toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private PorterDuff.Mode f46944zy = null;

    /* JADX INFO: renamed from: q */
    private boolean f1172q = false;

    /* JADX INFO: renamed from: n */
    private boolean f1171n = false;

    C0216p(@zy.lvui CompoundButton compoundButton) {
        this.f1170k = compoundButton;
    }

    void f7l8(ColorStateList colorStateList) {
        this.f46943toq = colorStateList;
        this.f1172q = true;
        m702k();
    }

    /* JADX INFO: renamed from: g */
    void m701g() {
        if (this.f1169g) {
            this.f1169g = false;
        } else {
            this.f1169g = true;
            m702k();
        }
    }

    /* JADX INFO: renamed from: k */
    void m702k() {
        Drawable drawableM3663k = C0760q.m3663k(this.f1170k);
        if (drawableM3663k != null) {
            if (this.f1172q || this.f1171n) {
                Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawableM3663k).mutate();
                if (this.f1172q) {
                    androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f46943toq);
                }
                if (this.f1171n) {
                    androidx.core.graphics.drawable.zy.m2442h(drawableMutate, this.f46944zy);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1170k.getDrawableState());
                }
                this.f1170k.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void m703n(@zy.dd AttributeSet attributeSet, int i2) {
        boolean z2;
        int iFn3e;
        int iFn3e2;
        Context context = this.f1170k.getContext();
        int[] iArr = C7397k.qrj.s31;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.f1170k;
        C0683f.ij(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        try {
            int i3 = C7397k.qrj.cjaj;
            if (!c0184bJp0y.mcp(i3) || (iFn3e2 = c0184bJp0y.fn3e(i3, 0)) == 0) {
                z2 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1170k;
                    compoundButton2.setButtonDrawable(C6045k.toq(compoundButton2.getContext(), iFn3e2));
                    z2 = true;
                } catch (Resources.NotFoundException unused) {
                    z2 = false;
                }
            }
            if (!z2) {
                int i4 = C7397k.qrj.owi;
                if (c0184bJp0y.mcp(i4) && (iFn3e = c0184bJp0y.fn3e(i4, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1170k;
                    compoundButton3.setButtonDrawable(C6045k.toq(compoundButton3.getContext(), iFn3e));
                }
            }
            int i5 = C7397k.qrj.eu;
            if (c0184bJp0y.mcp(i5)) {
                C0760q.m3665q(this.f1170k, c0184bJp0y.m550q(i5));
            }
            int i6 = C7397k.qrj.gw;
            if (c0184bJp0y.mcp(i6)) {
                C0760q.m3664n(this.f1170k, oc.m697n(c0184bJp0y.kja0(i6, -1), null));
            }
        } finally {
            c0184bJp0y.d3();
        }
    }

    /* JADX INFO: renamed from: q */
    PorterDuff.Mode m704q() {
        return this.f46944zy;
    }

    int toq(int i2) {
        return i2;
    }

    /* JADX INFO: renamed from: y */
    void m705y(@zy.dd PorterDuff.Mode mode) {
        this.f46944zy = mode;
        this.f1171n = true;
        m702k();
    }

    ColorStateList zy() {
        return this.f46943toq;
    }
}
