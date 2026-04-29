package com.xiaomi.ad.entity.contract;

import com.xiaomi.ad.entity.contract.InterfaceC5591q;
import e5.InterfaceC5997k;
import java.util.List;
import u38j.C7681k;

/* JADX INFO: compiled from: AdResponseEntityBase.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class toq<T extends InterfaceC5591q> extends AbstractC5592s implements InterfaceC5590n {

    /* JADX INFO: renamed from: n */
    @e5.zy(alternate = {"adInfoList"}, value = "adInfos")
    @InterfaceC5997k
    private List<T> f31128n;

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5590n
    public final boolean f7l8() {
        return C7681k.qrj(this.f31128n);
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5590n
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final T mo19200g(int i2) {
        return (T) C7681k.m28048q(this.f31128n, i2);
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5590n
    /* JADX INFO: renamed from: q */
    public final List<T> mo19201q() {
        return C7681k.m28045k(this.f31128n);
    }

    @Override // com.xiaomi.ad.entity.contract.InterfaceC5590n
    public final int zy() {
        return C7681k.f7l8(this.f31128n);
    }
}
