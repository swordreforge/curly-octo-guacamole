package com.xiaomi.onetrack.p013b;

import com.xiaomi.onetrack.p013b.C5713a;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.d */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5716d implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31927a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5713a.b f31928b;

    RunnableC5716d(C5713a.b bVar, String str) {
        this.f31928b = bVar;
        this.f31927a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5713a.m19885b((List<String>) Arrays.asList(this.f31927a));
        C5713a.f31893A.put(this.f31927a, Boolean.FALSE);
    }
}
