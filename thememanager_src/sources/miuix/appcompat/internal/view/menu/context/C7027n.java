package miuix.appcompat.internal.view.menu.context;

import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.appcompat.internal.view.menu.ld6;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.context.n */
/* JADX INFO: compiled from: ContextMenuPopupWindowHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7027n implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: g */
    private View f39501g;

    /* JADX INFO: renamed from: k */
    private f7l8 f39502k;

    /* JADX INFO: renamed from: n */
    private InterfaceC7028q f39503n;

    /* JADX INFO: renamed from: q */
    private ld6.InterfaceC7032k f39504q;

    /* JADX INFO: renamed from: s */
    private float[] f39505s = new float[2];

    /* JADX INFO: renamed from: y */
    private ViewGroup f39506y;

    public C7027n(f7l8 f7l8Var) {
        this.f39502k = f7l8Var;
    }

    /* JADX INFO: renamed from: g */
    public void m25325g(IBinder iBinder, View view, float f2, float f3, View view2) {
        this.f39503n = new C7025g(this.f39502k.fu4(), this.f39502k, this, view2);
        this.f39501g = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.f39506y = viewGroup;
        float[] fArr = this.f39505s;
        fArr[0] = f2;
        fArr[1] = f3;
        this.f39503n.mo25323h(this.f39501g, viewGroup, f2, f3);
    }

    /* JADX INFO: renamed from: k */
    public void m25326k() {
        InterfaceC7028q interfaceC7028q = this.f39503n;
        if (interfaceC7028q != null) {
            interfaceC7028q.dismiss();
            this.f39503n = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m25327n(IBinder iBinder, View view, float f2, float f3) {
        m25325g(iBinder, view, f2, f3, view.getRootView());
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ld6.InterfaceC7032k interfaceC7032k = this.f39504q;
        if (interfaceC7032k != null) {
            interfaceC7032k.f7l8(this.f39502k, true);
        }
        this.f39502k.m25346n();
    }

    /* JADX INFO: renamed from: q */
    public void m25328q(ld6.InterfaceC7032k interfaceC7032k) {
        this.f39504q = interfaceC7032k;
    }

    public C7025g toq() {
        InterfaceC7028q interfaceC7028q = this.f39503n;
        if (interfaceC7028q instanceof C7025g) {
            return (C7025g) interfaceC7028q;
        }
        return null;
    }

    public void zy() {
        InterfaceC7028q interfaceC7028q = this.f39503n;
        if (interfaceC7028q != null) {
            View view = this.f39501g;
            ViewGroup viewGroup = this.f39506y;
            float[] fArr = this.f39505s;
            interfaceC7028q.qrj(view, viewGroup, fArr[0], fArr[1]);
        }
    }
}
