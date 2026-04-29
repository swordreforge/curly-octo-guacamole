package com.xiaomi.accountsdk.request;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.request.y */
/* JADX INFO: compiled from: IPExecutorService.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5556y {

    /* JADX INFO: renamed from: k */
    static ExecutorService f30998k = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: k */
    public static void m19032k(Runnable runnable) {
        f30998k.execute(runnable);
    }
}
