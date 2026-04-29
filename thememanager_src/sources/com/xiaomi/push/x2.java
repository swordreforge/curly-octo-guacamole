package com.xiaomi.push;

import com.xiaomi.push.C5889p;

/* JADX INFO: loaded from: classes3.dex */
class x2 extends C5889p.toq {

    /* JADX INFO: renamed from: q */
    final /* synthetic */ C5889p f34135q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x2(C5889p c5889p, C5889p.k kVar) {
        super(kVar);
        this.f34135q = c5889p;
    }

    @Override // com.xiaomi.push.C5889p.toq
    void toq() {
        synchronized (this.f34135q.f73526zy) {
            this.f34135q.f73525toq.remove(this.f33559k.mo19320k());
        }
    }
}
