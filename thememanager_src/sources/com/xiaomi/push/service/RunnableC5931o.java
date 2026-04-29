package com.xiaomi.push.service;

import com.xiaomi.push.service.C5921j;
import java.util.Iterator;

/* JADX INFO: renamed from: com.xiaomi.push.service.o */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5931o implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ C5921j f33871k;

    RunnableC5931o(C5921j c5921j) {
        this.f33871k = c5921j;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Iterator it = this.f33871k.f33818q.values().iterator();
            while (it.hasNext()) {
                ((C5921j.k) it.next()).run();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("Sync job exception :" + e2.getMessage());
        }
        this.f33871k.f73624zy = false;
    }
}
