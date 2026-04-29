package com.xiaomi.push;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.xiaomi.push.e */
/* JADX INFO: loaded from: classes3.dex */
class CallableC5860e implements Callable<String> {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f32805k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ vyq f32806n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f32807q;

    CallableC5860e(vyq vyqVar, Context context, String str) {
        this.f32806n = vyqVar;
        this.f32805k = context;
        this.f32807q = str;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String call() {
        return String.valueOf(com.xiaomi.push.service.toq.m21767k(this.f32805k, this.f32807q));
    }
}
