package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import com.xiaomi.push.C5889p;

/* JADX INFO: loaded from: classes3.dex */
class bf2 extends C5889p.k {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ String f33719g;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ int f33720k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ Context f33721n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f33722q;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ Notification f33723y;

    bf2(int i2, String str, Context context, String str2, Notification notification) {
        this.f33720k = i2;
        this.f33722q = str;
        this.f33721n = context;
        this.f33719g = str2;
        this.f33723y = notification;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return C5907b.m21561s(this.f33720k, this.f33722q);
    }

    @Override // java.lang.Runnable
    @TargetApi(19)
    public void run() {
        C5907b.ld6(this.f33721n, this.f33719g, this.f33720k, this.f33722q, this.f33723y);
    }
}
