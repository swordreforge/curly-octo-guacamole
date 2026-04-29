package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
class nn86 implements Callable {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ vyq f33449g;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33450k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ NotificationChannel f33451n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f33452q;

    nn86(vyq vyqVar, Context context, String str, NotificationChannel notificationChannel) {
        this.f33449g = vyqVar;
        this.f33450k = context;
        this.f33452q = str;
        this.f33451n = notificationChannel;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String call() {
        return String.valueOf(com.xiaomi.push.service.qkj8.m21740k(this.f33450k, this.f33452q, this.f33451n));
    }
}
