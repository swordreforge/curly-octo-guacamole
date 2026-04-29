package com.xiaomi.onetrack.p017f;

import com.xiaomi.onetrack.p014c.C5729c;
import com.xiaomi.onetrack.p016e.C5755b;

/* JADX INFO: renamed from: com.xiaomi.onetrack.f.e */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5760e implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f32161a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f32162b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f32163c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f32164d;

    RunnableC5760e(String str, String str2, String str3, String str4) {
        this.f32161a = str;
        this.f32162b = str2;
        this.f32163c = str3;
        this.f32164d = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5729c.m19943a().m19953a(C5755b.m20046a(this.f32161a, this.f32162b, this.f32163c, this.f32164d));
    }
}
