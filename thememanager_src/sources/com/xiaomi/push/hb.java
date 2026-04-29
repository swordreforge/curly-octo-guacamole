package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.C5889p;

/* JADX INFO: loaded from: classes3.dex */
public class hb extends C5889p.k {

    /* JADX INFO: renamed from: k */
    private Context f33006k;

    public hb(Context context) {
        this.f33006k = context;
    }

    private boolean toq() {
        return com.xiaomi.clientreport.manager.toq.m19328n(this.f33006k).zy().f7l8();
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (toq()) {
                com.xiaomi.channel.commonutils.logger.zy.m19300t(this.f33006k.getPackageName() + " begin upload event");
                com.xiaomi.clientreport.manager.toq.m19328n(this.f33006k).t8r();
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
        }
    }
}
