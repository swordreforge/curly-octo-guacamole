package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.p009a.C5675a;
import com.xiaomi.onetrack.p017f.C5757b;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.f */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5732f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5757b f32010a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5729c f32011b;

    RunnableC5732f(C5729c c5729c, C5757b c5757b) {
        this.f32011b = c5729c;
        this.f32010a = c5757b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f32011b.m19949b(this.f32010a);
            C5675a.m19649a().m19653a(this.f32010a);
            C5804p.m20342a("EventManager", "addEvent: " + this.f32010a.m20076e() + "data:" + this.f32010a.m20078g().toString());
            C5745s.m19984a().m19990a(this.f32010a.m20077f(), false);
        } catch (Exception e2) {
            C5804p.m20348b("EventManager", "EventManager.addEvent exception: ", e2);
        }
    }
}
