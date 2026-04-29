package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C3087p;
import com.bumptech.glide.load.InterfaceC3088q;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import java.io.File;
import zy.lvui;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.n */
/* JADX INFO: compiled from: DataCacheWriter.java */
/* JADX INFO: loaded from: classes2.dex */
class C3037n<DataType> implements InterfaceC3016k.toq {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3088q<DataType> f18409k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final DataType f62793toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C3087p f62794zy;

    C3037n(InterfaceC3088q<DataType> interfaceC3088q, DataType datatype, C3087p c3087p) {
        this.f18409k = interfaceC3088q;
        this.f62793toq = datatype;
        this.f62794zy = c3087p;
    }

    @Override // com.bumptech.glide.load.engine.cache.InterfaceC3016k.toq
    /* JADX INFO: renamed from: k */
    public boolean mo10712k(@lvui File file) {
        return this.f18409k.mo10926k(this.f62793toq, file, this.f62794zy);
    }
}
