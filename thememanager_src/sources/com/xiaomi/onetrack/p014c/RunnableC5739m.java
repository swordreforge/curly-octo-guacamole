package com.xiaomi.onetrack.p014c;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.m */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5739m implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f32040a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f32041b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ String f32042c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C5738l f32043d;

    RunnableC5739m(C5738l c5738l, String str, String str2, String str3) {
        this.f32043d = c5738l;
        this.f32040a = str;
        this.f32041b = str2;
        this.f32042c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f32043d.m19973b(this.f32040a, this.f32041b, this.f32042c);
    }
}
