package com.xiaomi.push;

import com.xiaomi.push.h7am;
import com.xiaomi.push.qrj;

/* JADX INFO: loaded from: classes3.dex */
class mbx extends qrj.toq {

    /* JADX INFO: renamed from: k */
    qrj.toq f33416k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final /* synthetic */ h7am f73493toq;

    mbx(h7am h7amVar) {
        this.f73493toq = h7amVar;
    }

    @Override // com.xiaomi.push.qrj.toq
    public void toq() {
        h7am.toq toqVar = (h7am.toq) this.f73493toq.f32999k.peek();
        if (toqVar == null || !toqVar.mo20955q()) {
            return;
        }
        if (this.f73493toq.f32999k.remove(toqVar)) {
            this.f33416k = toqVar;
        }
        qrj.toq toqVar2 = this.f33416k;
        if (toqVar2 != null) {
            toqVar2.toq();
        }
    }

    @Override // com.xiaomi.push.qrj.toq
    public void zy() {
        qrj.toq toqVar = this.f33416k;
        if (toqVar != null) {
            toqVar.zy();
        }
    }
}
