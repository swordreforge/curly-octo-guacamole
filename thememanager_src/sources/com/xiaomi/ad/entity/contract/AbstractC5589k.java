package com.xiaomi.ad.entity.contract;

import e5.InterfaceC5997k;
import u38j.C7682n;

/* JADX INFO: renamed from: com.xiaomi.ad.entity.contract.k */
/* JADX INFO: compiled from: AdInfoEntityBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5589k extends zy implements InterfaceC5591q {

    /* JADX INFO: renamed from: q */
    @e5.zy("ex")
    @InterfaceC5997k
    private String f31126q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC5997k
    private long f73015zy = 0;

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5591q
    public final long getId() {
        return this.f73015zy;
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5591q
    public final String toq() {
        return C7682n.m28051k(this.f31126q);
    }
}
