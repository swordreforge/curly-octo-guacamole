package com.xiaomi.ad.entity.contract;

import e5.InterfaceC5997k;

/* JADX INFO: renamed from: com.xiaomi.ad.entity.contract.s */
/* JADX INFO: compiled from: ResponseEntityBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5592s extends zy implements InterfaceC5593y {

    /* JADX INFO: renamed from: q */
    @e5.zy("message")
    @InterfaceC5997k
    private String f31127q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @e5.zy("status")
    @InterfaceC5997k
    private int f73016zy = -1;

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5593y
    public final int getStatus() {
        return this.f73016zy;
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5593y
    /* JADX INFO: renamed from: k */
    public final String mo19202k() {
        return this.f31127q;
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5593y
    /* JADX INFO: renamed from: s */
    public final boolean mo19203s() {
        return this.f73016zy == 0;
    }
}
