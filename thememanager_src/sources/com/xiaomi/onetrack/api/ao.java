package com.xiaomi.onetrack.api;

import com.xiaomi.onetrack.p009a.p012c.C5682b;
import com.xiaomi.onetrack.p014c.C5735i;
import com.xiaomi.onetrack.p014c.C5745s;

/* JADX INFO: loaded from: classes3.dex */
class ao implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f31679a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ an f31680b;

    ao(an anVar, int i2) {
        this.f31680b = anVar;
        this.f31679a = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C5735i.m19962b() && this.f31679a == 2) {
            C5745s.m19984a().m19990a(0, true);
            C5745s.m19984a().m19990a(1, true);
            C5682b.m19681a().m19683b();
        }
    }
}
