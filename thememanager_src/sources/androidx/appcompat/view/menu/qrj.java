package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.n7h;
import androidx.core.view.C0683f;
import p030n.C7397k;
import zy.InterfaceC7828g;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MenuPopupHelper.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class qrj implements InterfaceC0133s {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f46794qrj = 48;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f46795f7l8;

    /* JADX INFO: renamed from: g */
    private View f557g;

    /* JADX INFO: renamed from: k */
    private final Context f558k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private PopupWindow.OnDismissListener f46796ld6;

    /* JADX INFO: renamed from: n */
    private final int f559n;

    /* JADX INFO: renamed from: p */
    private x2 f560p;

    /* JADX INFO: renamed from: q */
    private final int f561q;

    /* JADX INFO: renamed from: s */
    private n7h.InterfaceC0129k f562s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final f7l8 f46797toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final PopupWindow.OnDismissListener f46798x2;

    /* JADX INFO: renamed from: y */
    private boolean f563y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f46799zy;

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.qrj$k */
    /* JADX INFO: compiled from: MenuPopupHelper.java */
    class C0132k implements PopupWindow.OnDismissListener {
        C0132k() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            qrj.this.f7l8();
        }
    }

    public qrj(@lvui Context context, @lvui f7l8 f7l8Var) {
        this(context, f7l8Var, null, false, C7397k.toq.f92824bqie, 0);
    }

    private void n7h(int i2, int i3, boolean z2, boolean z3) {
        x2 x2VarM383n = m383n();
        x2VarM383n.fu4(z3);
        if (z2) {
            if ((androidx.core.view.qrj.m3432q(this.f46795f7l8, C0683f.m3159e(this.f557g)) & 7) == 5) {
                i2 -= this.f557g.getWidth();
            }
            x2VarM383n.zurt(i2);
            x2VarM383n.mo357z(i3);
            int i4 = (int) ((this.f558k.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            x2VarM383n.t8r(new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4));
        }
        x2VarM383n.mo318g();
    }

    @lvui
    private x2 toq() {
        Display defaultDisplay = ((WindowManager) this.f558k.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        x2 viewOnKeyListenerC0131q = Math.min(point.x, point.y) >= this.f558k.getResources().getDimensionPixelSize(C7397k.n.f92496ni7) ? new ViewOnKeyListenerC0131q(this.f558k, this.f557g, this.f561q, this.f559n, this.f46799zy) : new ki(this.f558k, this.f46797toq, this.f557g, this.f561q, this.f559n, this.f46799zy);
        viewOnKeyListenerC0131q.qrj(this.f46797toq);
        viewOnKeyListenerC0131q.ni7(this.f46798x2);
        viewOnKeyListenerC0131q.ki(this.f557g);
        viewOnKeyListenerC0131q.mo356s(this.f562s);
        viewOnKeyListenerC0131q.mo351i(this.f563y);
        viewOnKeyListenerC0131q.fn3e(this.f46795f7l8);
        return viewOnKeyListenerC0131q;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0133s
    public void dismiss() {
        if (m380g()) {
            this.f560p.dismiss();
        }
    }

    protected void f7l8() {
        this.f560p = null;
        PopupWindow.OnDismissListener onDismissListener = this.f46796ld6;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m380g() {
        x2 x2Var = this.f560p;
        return x2Var != null && x2Var.isShowing();
    }

    /* JADX INFO: renamed from: h */
    public boolean m381h(int i2, int i3) {
        if (m380g()) {
            return true;
        }
        if (this.f557g == null) {
            return false;
        }
        n7h(i2, i3, true, true);
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0133s
    /* JADX INFO: renamed from: k */
    public void mo382k(@dd n7h.InterfaceC0129k interfaceC0129k) {
        this.f562s = interfaceC0129k;
        x2 x2Var = this.f560p;
        if (x2Var != null) {
            x2Var.mo356s(interfaceC0129k);
        }
    }

    public boolean kja0() {
        if (m380g()) {
            return true;
        }
        if (this.f557g == null) {
            return false;
        }
        n7h(0, 0, false, false);
        return true;
    }

    public void ld6(@dd PopupWindow.OnDismissListener onDismissListener) {
        this.f46796ld6 = onDismissListener;
    }

    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    /* JADX INFO: renamed from: n */
    public x2 m383n() {
        if (this.f560p == null) {
            this.f560p = toq();
        }
        return this.f560p;
    }

    /* JADX INFO: renamed from: p */
    public void m384p(int i2) {
        this.f46795f7l8 = i2;
    }

    /* JADX INFO: renamed from: q */
    public ListView m385q() {
        return m383n().n7h();
    }

    public void qrj(int i2, int i3) {
        if (!m381h(i2, i3)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: s */
    public void m386s(boolean z2) {
        this.f563y = z2;
        x2 x2Var = this.f560p;
        if (x2Var != null) {
            x2Var.mo351i(z2);
        }
    }

    public void x2() {
        if (!kja0()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* JADX INFO: renamed from: y */
    public void m387y(@lvui View view) {
        this.f557g = view;
    }

    public int zy() {
        return this.f46795f7l8;
    }

    public qrj(@lvui Context context, @lvui f7l8 f7l8Var, @lvui View view) {
        this(context, f7l8Var, view, false, C7397k.toq.f92824bqie, 0);
    }

    public qrj(@lvui Context context, @lvui f7l8 f7l8Var, @lvui View view, boolean z2, @InterfaceC7828g int i2) {
        this(context, f7l8Var, view, z2, i2, 0);
    }

    public qrj(@lvui Context context, @lvui f7l8 f7l8Var, @lvui View view, boolean z2, @InterfaceC7828g int i2, @hb int i3) {
        this.f46795f7l8 = androidx.core.view.qrj.f50865toq;
        this.f46798x2 = new C0132k();
        this.f558k = context;
        this.f46797toq = f7l8Var;
        this.f557g = view;
        this.f46799zy = z2;
        this.f561q = i2;
        this.f559n = i3;
    }
}
