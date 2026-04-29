package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.InterfaceC3170n;
import zy.dd;

/* JADX INFO: compiled from: BaseTarget.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class toq<Z> implements InterfaceC3175h<Z> {

    /* JADX INFO: renamed from: k */
    private InterfaceC3170n f19038k;

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: h */
    public void mo6802h(@dd Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void kja0(@dd InterfaceC3170n interfaceC3170n) {
        this.f19038k = interfaceC3170n;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    @dd
    public InterfaceC3170n ld6() {
        return this.f19038k;
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.qrj
    public void onStop() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: p */
    public void mo6797p(@dd Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void x2(@dd Drawable drawable) {
    }
}
