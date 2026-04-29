package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C0683f;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatImageHelper.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class cdj {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final ImageView f973k;

    /* JADX INFO: renamed from: n */
    private int f974n = 0;

    /* JADX INFO: renamed from: q */
    private yz f975q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private yz f46850toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private yz f46851zy;

    public cdj(@zy.lvui ImageView imageView) {
        this.f973k = imageView;
    }

    /* JADX INFO: renamed from: k */
    private boolean m563k(@zy.lvui Drawable drawable) {
        if (this.f975q == null) {
            this.f975q = new yz();
        }
        yz yzVar = this.f975q;
        yzVar.m743k();
        ColorStateList colorStateListM3713k = androidx.core.widget.x2.m3713k(this.f973k);
        if (colorStateListM3713k != null) {
            yzVar.f1221q = true;
            yzVar.f1220k = colorStateListM3713k;
        }
        PorterDuff.Mode qVar = androidx.core.widget.x2.toq(this.f973k);
        if (qVar != null) {
            yzVar.f46978zy = true;
            yzVar.f46977toq = qVar;
        }
        if (!yzVar.f1221q && !yzVar.f46978zy) {
            return false;
        }
        ld6.m630p(drawable, yzVar, this.f973k.getDrawableState());
        return true;
    }

    private boolean qrj() {
        return this.f46850toq != null;
    }

    public void f7l8(AttributeSet attributeSet, int i2) {
        int iFn3e;
        Context context = this.f973k.getContext();
        int[] iArr = C7397k.qrj.f92644etdu;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f973k;
        C0683f.ij(imageView, imageView.getContext(), iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        try {
            Drawable drawable = this.f973k.getDrawable();
            if (drawable == null && (iFn3e = c0184bJp0y.fn3e(C7397k.qrj.f92625cfr, -1)) != -1 && (drawable = C6045k.toq(this.f973k.getContext(), iFn3e)) != null) {
                this.f973k.setImageDrawable(drawable);
            }
            if (drawable != null) {
                oc.toq(drawable);
            }
            int i3 = C7397k.qrj.f92773w831;
            if (c0184bJp0y.mcp(i3)) {
                androidx.core.widget.x2.zy(this.f973k, c0184bJp0y.m550q(i3));
            }
            int i4 = C7397k.qrj.f92796z4;
            if (c0184bJp0y.mcp(i4)) {
                androidx.core.widget.x2.m3714q(this.f973k, oc.m697n(c0184bJp0y.kja0(i4, -1), null));
            }
        } finally {
            c0184bJp0y.d3();
        }
    }

    /* JADX INFO: renamed from: g */
    boolean m564g() {
        return !(this.f973k.getBackground() instanceof RippleDrawable);
    }

    void ld6(ColorStateList colorStateList) {
        if (this.f46851zy == null) {
            this.f46851zy = new yz();
        }
        yz yzVar = this.f46851zy;
        yzVar.f1220k = colorStateList;
        yzVar.f1221q = true;
        zy();
    }

    /* JADX INFO: renamed from: n */
    PorterDuff.Mode m565n() {
        yz yzVar = this.f46851zy;
        if (yzVar != null) {
            return yzVar.f46977toq;
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    void m566p(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f46850toq == null) {
                this.f46850toq = new yz();
            }
            yz yzVar = this.f46850toq;
            yzVar.f1220k = colorStateList;
            yzVar.f1221q = true;
        } else {
            this.f46850toq = null;
        }
        zy();
    }

    /* JADX INFO: renamed from: q */
    ColorStateList m567q() {
        yz yzVar = this.f46851zy;
        if (yzVar != null) {
            return yzVar.f1220k;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public void m568s(int i2) {
        if (i2 != 0) {
            Drawable qVar = C6045k.toq(this.f973k.getContext(), i2);
            if (qVar != null) {
                oc.toq(qVar);
            }
            this.f973k.setImageDrawable(qVar);
        } else {
            this.f973k.setImageDrawable(null);
        }
        zy();
    }

    void toq() {
        if (this.f973k.getDrawable() != null) {
            this.f973k.getDrawable().setLevel(this.f974n);
        }
    }

    void x2(PorterDuff.Mode mode) {
        if (this.f46851zy == null) {
            this.f46851zy = new yz();
        }
        yz yzVar = this.f46851zy;
        yzVar.f46977toq = mode;
        yzVar.f46978zy = true;
        zy();
    }

    /* JADX INFO: renamed from: y */
    void m569y(@zy.lvui Drawable drawable) {
        this.f974n = drawable.getLevel();
    }

    void zy() {
        Drawable drawable = this.f973k.getDrawable();
        if (drawable != null) {
            oc.toq(drawable);
        }
        if (drawable != null) {
            if (qrj() && m563k(drawable)) {
                return;
            }
            yz yzVar = this.f46851zy;
            if (yzVar != null) {
                ld6.m630p(drawable, yzVar, this.f973k.getDrawableState());
                return;
            }
            yz yzVar2 = this.f46850toq;
            if (yzVar2 != null) {
                ld6.m630p(drawable, yzVar2, this.f973k.getDrawableState());
            }
        }
    }
}
