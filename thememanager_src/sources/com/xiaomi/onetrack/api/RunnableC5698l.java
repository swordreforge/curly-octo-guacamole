package com.xiaomi.onetrack.api;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.l */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5698l implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Thread f31846a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Throwable f31847b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5697k f31848c;

    RunnableC5698l(C5697k c5697k, Thread thread, Throwable th) {
        this.f31848c = c5697k;
        this.f31846a = thread;
        this.f31847b = th;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f31848c.m19804a(this.f31846a, this.f31847b);
    }
}
