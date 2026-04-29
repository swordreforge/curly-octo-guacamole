package com.tencent.wxop.stat.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.e */
/* JADX INFO: loaded from: classes3.dex */
public class C5385e {

    /* JADX INFO: renamed from: a */
    ExecutorService f30123a;

    public C5385e() {
        this.f30123a = null;
        this.f30123a = Executors.newSingleThreadExecutor();
    }

    /* JADX INFO: renamed from: a */
    public void m18389a(Runnable runnable) {
        this.f30123a.execute(runnable);
    }
}
