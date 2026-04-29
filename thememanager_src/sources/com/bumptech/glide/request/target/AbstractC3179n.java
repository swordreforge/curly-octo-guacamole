package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.InterfaceC3170n;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.request.target.n */
/* JADX INFO: compiled from: CustomTarget.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3179n<T> implements InterfaceC3175h<T> {

    /* JADX INFO: renamed from: k */
    private final int f19024k;

    /* JADX INFO: renamed from: n */
    @dd
    private InterfaceC3170n f19025n;

    /* JADX INFO: renamed from: q */
    private final int f19026q;

    public AbstractC3179n() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    /* JADX INFO: renamed from: h */
    public void mo6802h(@dd Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.qrj
    /* JADX INFO: renamed from: k */
    public void mo10580k() {
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void kja0(@dd InterfaceC3170n interfaceC3170n) {
        this.f19025n = interfaceC3170n;
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    @dd
    public final InterfaceC3170n ld6() {
        return this.f19025n;
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
    public final void t8r(@lvui kja0 kja0Var) {
        kja0Var.mo11172q(this.f19024k, this.f19026q);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void toq(@lvui kja0 kja0Var) {
    }

    public AbstractC3179n(int i2, int i3) {
        if (com.bumptech.glide.util.kja0.ni7(i2, i3)) {
            this.f19024k = i2;
            this.f19026q = i3;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i2 + " and height: " + i3);
    }
}
