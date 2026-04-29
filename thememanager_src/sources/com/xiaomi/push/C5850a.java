package com.xiaomi.push;

import com.xiaomi.push.C5889p;

/* JADX INFO: renamed from: com.xiaomi.push.a */
/* JADX INFO: loaded from: classes3.dex */
class C5850a extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ bf2 f32637k;

    C5850a(bf2 bf2Var) {
        this.f32637k = bf2Var;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "10053";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f32637k.f32732s != null) {
            this.f32637k.f32732s.toq(this.f32637k.f32729n);
            this.f32637k.qrj("delete_time");
        }
    }
}
