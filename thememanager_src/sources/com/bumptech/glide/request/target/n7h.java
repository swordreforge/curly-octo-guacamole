package com.bumptech.glide.request.target;

import zy.lvui;

/* JADX INFO: compiled from: SimpleTarget.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class n7h<Z> extends toq<Z> {

    /* JADX INFO: renamed from: n */
    private final int f19027n;

    /* JADX INFO: renamed from: q */
    private final int f19028q;

    public n7h() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public final void t8r(@lvui kja0 kja0Var) {
        if (com.bumptech.glide.util.kja0.ni7(this.f19028q, this.f19027n)) {
            kja0Var.mo11172q(this.f19028q, this.f19027n);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f19028q + " and height: " + this.f19027n + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.bumptech.glide.request.target.InterfaceC3175h
    public void toq(@lvui kja0 kja0Var) {
    }

    public n7h(int i2, int i3) {
        this.f19028q = i2;
        this.f19027n = i3;
    }
}
