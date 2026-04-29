package com.xiaomi.onetrack.p013b;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.b */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5714b implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31923a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5713a f31924b;

    RunnableC5714b(C5713a c5713a, String str) {
        this.f31924b = c5713a;
        this.f31923a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f31923a)) {
            return;
        }
        this.f31924b.m19897c(this.f31923a);
    }
}
