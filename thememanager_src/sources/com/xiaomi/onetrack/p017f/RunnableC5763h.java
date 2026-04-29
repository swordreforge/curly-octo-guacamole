package com.xiaomi.onetrack.p017f;

import android.content.Context;
import com.xiaomi.onetrack.api.C5689c;
import com.xiaomi.onetrack.p014c.C5727a;
import com.xiaomi.onetrack.p014c.C5729c;

/* JADX INFO: renamed from: com.xiaomi.onetrack.f.h */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5763h implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f32171a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5762g f32172b;

    RunnableC5763h(C5762g c5762g, Context context) {
        this.f32172b = c5762g;
        this.f32171a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5727a.m19937a();
        C5689c.m19765a().m19776d();
        C5689c.m19765a().m19778f();
        C5729c.m19945a(this.f32171a);
    }
}
