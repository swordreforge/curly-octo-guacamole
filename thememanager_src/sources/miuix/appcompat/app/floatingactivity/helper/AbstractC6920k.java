package miuix.appcompat.app.floatingactivity.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import miuix.appcompat.app.floatingactivity.InterfaceC6935n;
import miuix.appcompat.app.floatingactivity.InterfaceC6939y;
import miuix.appcompat.app.t8r;

/* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.helper.k */
/* JADX INFO: compiled from: BaseFloatingActivityHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6920k implements InterfaceC6935n {
    /* JADX INFO: renamed from: s */
    public static boolean m24912s(Context context) {
        return (context instanceof t8r) && ((t8r) context).isInFloatingWindowMode();
    }

    public abstract boolean cdj();

    @SuppressLint({"ClickableViewAccessibility"})
    public abstract void f7l8(View view, boolean z2);

    /* JADX INFO: renamed from: g */
    public abstract void mo24913g();

    /* JADX INFO: renamed from: h */
    public abstract void mo24914h(miuix.appcompat.app.floatingactivity.f7l8 f7l8Var);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo24915k();

    public abstract void ki();

    public abstract void kja0(InterfaceC6939y interfaceC6939y);

    public abstract ViewGroup ld6(View view, boolean z2);

    /* JADX INFO: renamed from: n */
    public abstract void mo24916n();

    public abstract void n7h(boolean z2);

    /* JADX INFO: renamed from: p */
    public abstract void mo24917p();

    /* JADX INFO: renamed from: q */
    public abstract ViewGroup.LayoutParams mo24918q();

    public abstract void qrj(boolean z2);

    public abstract void toq();

    public abstract void x2(boolean z2);

    /* JADX INFO: renamed from: y */
    public abstract boolean mo24919y();

    public abstract View zy();
}
