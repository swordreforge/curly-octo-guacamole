package com.xiaomi.push;

import com.xiaomi.push.C5889p;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
class a98o extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ bf2 f32657k;

    a98o(bf2 bf2Var) {
        this.f32657k = bf2Var;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "10054";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("exec== DbSizeControlJob");
        y2.toq(this.f32657k.f32729n).f7l8(new RunnableC5959x(this.f32657k.n7h(), new WeakReference(this.f32657k.f32729n)));
        this.f32657k.qrj("check_time");
    }
}
