package com.xiaomi.onetrack.p017f;

import com.xiaomi.onetrack.p014c.C5729c;
import com.xiaomi.onetrack.p016e.C5755b;

/* JADX INFO: renamed from: com.xiaomi.onetrack.f.f */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5761f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f32165a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f32166b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f32167c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ String f32168d;

    RunnableC5761f(String str, String str2, String str3, String str4) {
        this.f32165a = str;
        this.f32166b = str2;
        this.f32167c = str3;
        this.f32168d = str4;
    }

    @Override // java.lang.Runnable
    public void run() {
        C5729c.m19943a().m19953a(C5755b.m20047b(this.f32165a, this.f32166b, this.f32167c, this.f32168d));
    }
}
