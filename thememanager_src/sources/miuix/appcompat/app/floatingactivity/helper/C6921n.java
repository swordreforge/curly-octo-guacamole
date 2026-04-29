package miuix.appcompat.app.floatingactivity.helper;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import miuix.appcompat.app.floatingactivity.InterfaceC6939y;
import miuix.internal.util.C7164n;
import miuix.internal.util.n7h;

/* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.helper.n */
/* JADX INFO: compiled from: PhoneFloatingActivityHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6921n extends AbstractC6920k {

    /* JADX INFO: renamed from: k */
    private View f38831k;

    /* JADX INFO: renamed from: q */
    private Drawable f38832q;

    public C6921n(Context context) {
        this.f38832q = C7164n.m25952s(context, R.attr.windowBackground);
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public boolean cdj() {
        return false;
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeCloseEnterAnimation() {
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeCloseExitAnimation() {
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeOpenEnterAnimation() {
    }

    @Override // miuix.appcompat.app.floatingactivity.InterfaceC6935n
    public void executeOpenExitAnimation() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void f7l8(View view, boolean z2) {
        View view2 = this.f38831k;
        if (view2 != null) {
            if (n7h.qrj(view2.getContext())) {
                this.f38831k.setBackground(new ColorDrawable(-16777216));
            } else {
                this.f38831k.setBackground(this.f38832q);
            }
        }
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: g */
    public void mo24913g() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: h */
    public void mo24914h(miuix.appcompat.app.floatingactivity.f7l8 f7l8Var) {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: k */
    public boolean mo24915k() {
        return false;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void ki() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void kja0(InterfaceC6939y interfaceC6939y) {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public ViewGroup ld6(View view, boolean z2) {
        this.f38831k = view;
        return (ViewGroup) view;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: n */
    public void mo24916n() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void n7h(boolean z2) {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: p */
    public void mo24917p() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: q */
    public ViewGroup.LayoutParams mo24918q() {
        return this.f38831k.getLayoutParams();
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void qrj(boolean z2) {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void toq() {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public void x2(boolean z2) {
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    /* JADX INFO: renamed from: y */
    public boolean mo24919y() {
        return false;
    }

    @Override // miuix.appcompat.app.floatingactivity.helper.AbstractC6920k
    public View zy() {
        return this.f38831k;
    }
}
