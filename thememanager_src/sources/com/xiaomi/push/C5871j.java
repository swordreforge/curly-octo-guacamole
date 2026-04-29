package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.C5889p;

/* JADX INFO: renamed from: com.xiaomi.push.j */
/* JADX INFO: loaded from: classes3.dex */
public class C5871j extends C5889p.k {

    /* JADX INFO: renamed from: k */
    private Context f33061k;

    public C5871j(Context context) {
        this.f33061k = context;
    }

    private boolean toq() {
        return com.xiaomi.clientreport.manager.toq.m19328n(this.f33061k).zy().m19307y();
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (toq()) {
                com.xiaomi.clientreport.manager.toq.m19328n(this.f33061k).ni7();
                com.xiaomi.channel.commonutils.logger.zy.m19300t(this.f33061k.getPackageName() + " perf begin upload");
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("fail to send perf data. " + e2);
        }
    }
}
