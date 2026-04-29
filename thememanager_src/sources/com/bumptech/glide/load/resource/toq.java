package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.zurt;
import com.bumptech.glide.util.qrj;
import zy.lvui;

/* JADX INFO: compiled from: SimpleResource.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq<T> implements zurt<T> {

    /* JADX INFO: renamed from: k */
    protected final T f18830k;

    public toq(@lvui T t2) {
        this.f18830k = (T) qrj.m11262q(t2);
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    public final T get() {
        return this.f18830k;
    }

    @Override // com.bumptech.glide.load.engine.zurt
    @lvui
    /* JADX INFO: renamed from: n */
    public Class<T> mo10765n() {
        return (Class<T>) this.f18830k.getClass();
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public void toq() {
    }

    @Override // com.bumptech.glide.load.engine.zurt
    public final int zy() {
        return 1;
    }
}
