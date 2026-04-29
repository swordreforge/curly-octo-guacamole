package com.xiaomi.push;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.xiaomi.push.x */
/* JADX INFO: loaded from: classes3.dex */
public class RunnableC5959x implements Runnable {

    /* JADX INFO: renamed from: k */
    private String f34133k;

    /* JADX INFO: renamed from: q */
    private WeakReference<Context> f34134q;

    public RunnableC5959x(String str, WeakReference<Context> weakReference) {
        this.f34133k = str;
        this.f34134q = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f34134q;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (ikck.m20979k(this.f34133k) <= zp.f73775toq) {
            com.xiaomi.channel.commonutils.logger.zy.m19302z("=====> do not need clean db");
            return;
        }
        lv5 lv5VarLd6 = lv5.ld6(this.f34133k);
        nmn5 nmn5VarQrj = nmn5.qrj(this.f34133k);
        lv5VarLd6.m22046y(nmn5VarQrj);
        nmn5VarQrj.m22046y(ch.x2(context, this.f34133k, 1000));
        y2.toq(context).m22038g(lv5VarLd6);
    }
}
