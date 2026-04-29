package com.xiaomi.onetrack.api;

import android.content.Context;
import com.xiaomi.onetrack.CrashAnalysis;

/* JADX INFO: renamed from: com.xiaomi.onetrack.api.n */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5700n implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f31859a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5699m f31860b;

    RunnableC5700n(C5699m c5699m, Context context) {
        this.f31860b = c5699m;
        this.f31859a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        CrashAnalysis.init(this.f31859a, this.f31860b).start();
        if (CrashAnalysis.getInstance() == null || !CrashAnalysis.getInstance().isSupport()) {
            C5699m c5699m = this.f31860b;
            c5699m.f31853e = new C5697k(c5699m);
            this.f31860b.f31853e.m19805a();
        }
    }
}
