package com.xiaomi.onetrack.p014c;

import com.xiaomi.onetrack.p013b.C5717e;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.r */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5744r implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ HandlerC5742p f32061a;

    RunnableC5744r(HandlerC5742p handlerC5742p) {
        this.f32061a = handlerC5742p;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f32061a.f32058i.get()) {
            C5717e.m19902b();
        }
        this.f32061a.f32058i.set(true);
    }
}
