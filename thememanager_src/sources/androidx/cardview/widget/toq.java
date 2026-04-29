package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: CardViewApi21Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class toq implements InterfaceC0243n {
    toq() {
    }

    /* JADX INFO: renamed from: h */
    private C0241g m811h(InterfaceC0244q interfaceC0244q) {
        return (C0241g) interfaceC0244q.mo787q();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void f7l8(InterfaceC0244q interfaceC0244q) {
        kja0(interfaceC0244q, mo808q(interfaceC0244q));
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: g */
    public float mo804g(InterfaceC0244q interfaceC0244q) {
        return toq(interfaceC0244q) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: k */
    public void mo805k(InterfaceC0244q interfaceC0244q, float f2) {
        m811h(interfaceC0244q).m803y(f2);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void kja0(InterfaceC0244q interfaceC0244q, float f2) {
        m811h(interfaceC0244q).f7l8(f2, interfaceC0244q.zy(), interfaceC0244q.mo784g());
        ld6(interfaceC0244q);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void ld6(InterfaceC0244q interfaceC0244q) {
        if (!interfaceC0244q.zy()) {
            interfaceC0244q.mo785k(0, 0, 0, 0);
            return;
        }
        float fMo808q = mo808q(interfaceC0244q);
        float qVar = toq(interfaceC0244q);
        int iCeil = (int) Math.ceil(f7l8.zy(fMo808q, qVar, interfaceC0244q.mo784g()));
        int iCeil2 = (int) Math.ceil(f7l8.m791q(fMo808q, qVar, interfaceC0244q.mo784g()));
        interfaceC0244q.mo785k(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: n */
    public ColorStateList mo806n(InterfaceC0244q interfaceC0244q) {
        return m811h(interfaceC0244q).toq();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void n7h(InterfaceC0244q interfaceC0244q, @dd ColorStateList colorStateList) {
        m811h(interfaceC0244q).m801g(colorStateList);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: p */
    public void mo807p(InterfaceC0244q interfaceC0244q) {
        kja0(interfaceC0244q, mo808q(interfaceC0244q));
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: q */
    public float mo808q(InterfaceC0244q interfaceC0244q) {
        return m811h(interfaceC0244q).zy();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public float qrj(InterfaceC0244q interfaceC0244q) {
        return toq(interfaceC0244q) * 2.0f;
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: s */
    public float mo809s(InterfaceC0244q interfaceC0244q) {
        return interfaceC0244q.f7l8().getElevation();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public float toq(InterfaceC0244q interfaceC0244q) {
        return m811h(interfaceC0244q).m802q();
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void x2() {
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    /* JADX INFO: renamed from: y */
    public void mo810y(InterfaceC0244q interfaceC0244q, Context context, ColorStateList colorStateList, float f2, float f3, float f4) {
        interfaceC0244q.toq(new C0241g(colorStateList, f2));
        View viewF7l8 = interfaceC0244q.f7l8();
        viewF7l8.setClipToOutline(true);
        viewF7l8.setElevation(f3);
        kja0(interfaceC0244q, f4);
    }

    @Override // androidx.cardview.widget.InterfaceC0243n
    public void zy(InterfaceC0244q interfaceC0244q, float f2) {
        interfaceC0244q.f7l8().setElevation(f2);
    }
}
