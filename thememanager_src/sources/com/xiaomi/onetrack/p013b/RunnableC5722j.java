package com.xiaomi.onetrack.p013b;

/* JADX INFO: renamed from: com.xiaomi.onetrack.b.j */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5722j implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f31954a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5720h f31955b;

    RunnableC5722j(C5720h c5720h, String str) {
        this.f31955b = c5720h;
        this.f31954a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f31955b.f31948b.getWritableDatabase().delete(C5719g.f31937b, "app_id=?", new String[]{this.f31954a});
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
