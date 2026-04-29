package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.core.view.C0683f;
import p023g.C6045k;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.s */
/* JADX INFO: compiled from: AppCompatCheckedTextViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY})
class C0219s {

    /* JADX INFO: renamed from: g */
    private boolean f1175g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final CheckedTextView f1176k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private ColorStateList f46948toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private PorterDuff.Mode f46949zy = null;

    /* JADX INFO: renamed from: q */
    private boolean f1178q = false;

    /* JADX INFO: renamed from: n */
    private boolean f1177n = false;

    C0219s(@zy.lvui CheckedTextView checkedTextView) {
        this.f1176k = checkedTextView;
    }

    void f7l8(@zy.dd PorterDuff.Mode mode) {
        this.f46949zy = mode;
        this.f1177n = true;
        m712k();
    }

    /* JADX INFO: renamed from: g */
    void m711g(ColorStateList colorStateList) {
        this.f46948toq = colorStateList;
        this.f1178q = true;
        m712k();
    }

    /* JADX INFO: renamed from: k */
    void m712k() {
        Drawable drawableM3718k = androidx.core.widget.zy.m3718k(this.f1176k);
        if (drawableM3718k != null) {
            if (this.f1178q || this.f1177n) {
                Drawable drawableMutate = androidx.core.graphics.drawable.zy.ki(drawableM3718k).mutate();
                if (this.f1178q) {
                    androidx.core.graphics.drawable.zy.kja0(drawableMutate, this.f46948toq);
                }
                if (this.f1177n) {
                    androidx.core.graphics.drawable.zy.m2442h(drawableMutate, this.f46949zy);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1176k.getDrawableState());
                }
                this.f1176k.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void m713n() {
        if (this.f1175g) {
            this.f1175g = false;
        } else {
            this.f1175g = true;
            m712k();
        }
    }

    /* JADX INFO: renamed from: q */
    void m714q(@zy.dd AttributeSet attributeSet, int i2) {
        boolean z2;
        int iFn3e;
        int iFn3e2;
        Context context = this.f1176k.getContext();
        int[] iArr = C7397k.qrj.dbf;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        CheckedTextView checkedTextView = this.f1176k;
        C0683f.ij(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        try {
            int i3 = C7397k.qrj.zah1;
            if (!c0184bJp0y.mcp(i3) || (iFn3e2 = c0184bJp0y.fn3e(i3, 0)) == 0) {
                z2 = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.f1176k;
                    checkedTextView2.setCheckMarkDrawable(C6045k.toq(checkedTextView2.getContext(), iFn3e2));
                    z2 = true;
                } catch (Resources.NotFoundException unused) {
                    z2 = false;
                }
            }
            if (!z2) {
                int i4 = C7397k.qrj.es7;
                if (c0184bJp0y.mcp(i4) && (iFn3e = c0184bJp0y.fn3e(i4, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.f1176k;
                    checkedTextView3.setCheckMarkDrawable(C6045k.toq(checkedTextView3.getContext(), iFn3e));
                }
            }
            int i5 = C7397k.qrj.koj;
            if (c0184bJp0y.mcp(i5)) {
                androidx.core.widget.zy.m3720q(this.f1176k, c0184bJp0y.m550q(i5));
            }
            int i6 = C7397k.qrj.oei;
            if (c0184bJp0y.mcp(i6)) {
                androidx.core.widget.zy.m3719n(this.f1176k, oc.m697n(c0184bJp0y.kja0(i6, -1), null));
            }
        } finally {
            c0184bJp0y.d3();
        }
    }

    ColorStateList toq() {
        return this.f46948toq;
    }

    PorterDuff.Mode zy() {
        return this.f46949zy;
    }
}
