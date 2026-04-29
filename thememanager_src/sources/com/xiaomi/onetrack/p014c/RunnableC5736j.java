package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.api.C5689c;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.j */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5736j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f32029a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f32030b;

    RunnableC5736j(String str, String str2) {
        this.f32029a = str;
        this.f32030b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5689c.m19765a().m19777e();
        C5735i.m19964c(this.f32029a, this.f32030b);
    }
}
