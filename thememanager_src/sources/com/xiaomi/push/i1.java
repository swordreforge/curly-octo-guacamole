package com.xiaomi.push;

import com.xiaomi.push.C5889p;

/* JADX INFO: loaded from: classes3.dex */
class i1 extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ bf2 f33017k;

    i1(bf2 bf2Var) {
        this.f33017k = bf2Var;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "10052";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("exec== mUploadJob");
        if (this.f33017k.f32732s != null) {
            this.f33017k.f32732s.m22033k(this.f33017k.f32729n);
            this.f33017k.qrj("upload_time");
        }
    }
}
