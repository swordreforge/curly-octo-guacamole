package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p030n.C7397k;
import zy.InterfaceC7828g;

/* JADX INFO: renamed from: androidx.appcompat.widget.i */
/* JADX INFO: compiled from: AppCompatPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
class C0194i extends PopupWindow {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final boolean f46872toq = false;

    /* JADX INFO: renamed from: k */
    private boolean f1045k;

    public C0194i(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        super(context, attributeSet, i2);
        m606k(context, attributeSet, i2, 0);
    }

    /* JADX INFO: renamed from: k */
    private void m606k(Context context, AttributeSet attributeSet, int i2, int i3) {
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, C7397k.qrj.rlj, i2, i3);
        int i4 = C7397k.qrj.i8;
        if (c0184bJp0y.mcp(i4)) {
            toq(c0184bJp0y.m547k(i4, false));
        }
        setBackgroundDrawable(c0184bJp0y.m553y(C7397k.qrj.fbr));
        c0184bJp0y.d3();
    }

    private void toq(boolean z2) {
        if (f46872toq) {
            this.f1045k = z2;
        } else {
            androidx.core.widget.cdj.zy(this, z2);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3) {
        if (f46872toq && this.f1045k) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i2, int i3, int i4, int i5) {
        if (f46872toq && this.f1045k) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }

    public C0194i(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, @InterfaceC7828g int i2, @zy.hb int i3) {
        super(context, attributeSet, i2, i3);
        m606k(context, attributeSet, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (f46872toq && this.f1045k) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }
}
