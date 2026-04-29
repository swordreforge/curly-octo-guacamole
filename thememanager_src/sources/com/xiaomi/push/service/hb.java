package com.xiaomi.push.service;

import android.util.Base64;
import com.xiaomi.push.ngy;
import com.xiaomi.push.qrj;
import com.xiaomi.push.service.nn86;
import com.xiaomi.push.wu;

/* JADX INFO: loaded from: classes3.dex */
class hb extends qrj.toq {

    /* JADX INFO: renamed from: k */
    boolean f33792k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final /* synthetic */ nn86 f73613toq;

    hb(nn86 nn86Var) {
        this.f73613toq = nn86Var;
    }

    @Override // com.xiaomi.push.qrj.toq
    public void toq() {
        try {
            ngy.C5884k c5884kN7h = ngy.C5884k.n7h(Base64.decode(com.xiaomi.push.was.m21960g(wu.toq(), "https://resolver.msg.xiaomi.net/psc/?t=a", null), 10));
            if (c5884kN7h != null) {
                this.f73613toq.f73651toq = c5884kN7h;
                this.f33792k = true;
                this.f73613toq.m21711h();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("fetch config failure: " + e2.getMessage());
        }
    }

    @Override // com.xiaomi.push.qrj.toq
    public void zy() {
        nn86.AbstractC5930k[] abstractC5930kArr;
        this.f73613toq.f73652zy = null;
        if (this.f33792k) {
            synchronized (this.f73613toq) {
                abstractC5930kArr = (nn86.AbstractC5930k[]) this.f73613toq.f33870k.toArray(new nn86.AbstractC5930k[this.f73613toq.f33870k.size()]);
            }
            for (nn86.AbstractC5930k abstractC5930k : abstractC5930kArr) {
                abstractC5930k.toq(this.f73613toq.f73651toq);
            }
        }
    }
}
