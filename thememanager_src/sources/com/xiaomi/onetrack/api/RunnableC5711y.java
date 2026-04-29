package com.xiaomi.onetrack.api;

import android.text.TextUtils;
import com.xiaomi.onetrack.p013b.C5713a;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.util.C5771d;
import com.xiaomi.onetrack.util.C5782o;
import com.xiaomi.onetrack.util.C5804p;
import com.xiaomi.onetrack.util.C5814z;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.y */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5711y implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5699m f31891a;

    RunnableC5711y(C5699m c5699m) {
        this.f31891a = c5699m;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C5689c.m19765a().m19774a(this.f31891a.f31851b);
            C5713a.m19872a().m19894a(this.f31891a.f31854f.getAppId());
            if (C5814z.m20421b(this.f31891a.f31854f.getAdEventAppId())) {
                C5689c.m19765a().m19775c();
                C5713a.m19872a().m19894a(this.f31891a.f31854f.getAdEventAppId());
            }
            if (com.xiaomi.onetrack.util.aa.m20147B() == 0) {
                com.xiaomi.onetrack.util.aa.m20204n(System.currentTimeMillis());
            }
            if (!TextUtils.isEmpty(this.f31891a.f31854f.getInstanceId())) {
                C5782o.m20286a().m20291a(this.f31891a.f31854f.getInstanceId());
            }
            this.f31891a.m19841o();
            C5771d.m20244a();
            C5735i.m19965c(false);
        } catch (Throwable th) {
            C5804p.m20347b("OneTrackImp", "init WorkerExecutor execute throwable:" + th.getMessage());
        }
    }
}
