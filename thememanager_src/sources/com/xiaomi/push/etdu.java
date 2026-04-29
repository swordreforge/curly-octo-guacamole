package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class etdu implements Runnable {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ long f32877g;

    /* JADX INFO: renamed from: h */
    final /* synthetic */ String f32878h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ int f32879i;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f32880k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ boolean f32881n;

    /* JADX INFO: renamed from: p */
    final /* synthetic */ int f32882p;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f32883q;

    /* JADX INFO: renamed from: s */
    final /* synthetic */ long f32884s;

    /* JADX INFO: renamed from: y */
    final /* synthetic */ int f32885y;

    etdu(Context context, String str, boolean z2, long j2, int i2, long j3, int i3, String str2, int i4) {
        this.f32880k = context;
        this.f32883q = str;
        this.f32881n = z2;
        this.f32877g = j2;
        this.f32885y = i2;
        this.f32884s = j3;
        this.f32882p = i3;
        this.f32878h = str2;
        this.f32879i = i4;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            v0af.cdj(this.f32880k, this.f32883q, this.f32881n, this.f32877g, this.f32885y, this.f32884s, this.f32882p, this.f32878h, this.f32879i);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("DisconnectStatsSP onDisconnection exception: " + e2.getMessage());
        }
    }
}
