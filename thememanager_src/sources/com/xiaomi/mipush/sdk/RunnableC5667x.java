package com.xiaomi.mipush.sdk;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.x */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5667x implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ NotificationClickedActivity f31440k;

    RunnableC5667x(NotificationClickedActivity notificationClickedActivity) {
        this.f31440k = notificationClickedActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.zy.a9("clicked activity finish by timeout.");
        this.f31440k.finish();
    }
}
