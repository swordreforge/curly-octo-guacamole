package com.xiaomi.push;

import com.xiaomi.push.C5889p;

/* JADX INFO: loaded from: classes3.dex */
class ld6 extends C5889p.toq {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ C5889p f33293g;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f33294n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ boolean f33295q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ld6(C5889p c5889p, C5889p.k kVar, boolean z2, String str) {
        super(kVar);
        this.f33293g = c5889p;
        this.f33295q = z2;
        this.f33294n = str;
    }

    @Override // com.xiaomi.push.C5889p.toq
    /* JADX INFO: renamed from: k */
    void mo21153k() {
        super.mo21153k();
    }

    @Override // com.xiaomi.push.C5889p.toq
    void toq() {
        if (this.f33295q) {
            return;
        }
        this.f33293g.f33558q.edit().putLong(this.f33294n, System.currentTimeMillis()).commit();
    }
}
