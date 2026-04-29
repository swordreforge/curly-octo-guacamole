package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.nn86;

/* JADX INFO: compiled from: NotificationUtil.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class fti {

    /* JADX INFO: renamed from: g */
    public static final int f23189g = 4;

    /* JADX INFO: renamed from: k */
    public static final int f23190k = -1000;

    /* JADX INFO: renamed from: n */
    public static final int f23191n = 3;

    /* JADX INFO: renamed from: q */
    public static final int f23192q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f66985toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f66986zy = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.fti$k */
    /* JADX INFO: compiled from: NotificationUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3837k {
    }

    private fti() {
    }

    /* JADX INFO: renamed from: k */
    public static void m13582k(Context context, String str, @nn86 int i2, @nn86 int i3, int i4) {
        if (lrht.f23230k >= 26) {
            NotificationManager notificationManager = (NotificationManager) C3844k.f7l8((NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle));
            NotificationChannel notificationChannel = new NotificationChannel(str, context.getString(i2), i4);
            if (i3 != 0) {
                notificationChannel.setDescription(context.getString(i3));
            }
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static void toq(Context context, int i2, @zy.dd Notification notification) {
        NotificationManager notificationManager = (NotificationManager) C3844k.f7l8((NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle));
        if (notification != null) {
            notificationManager.notify(i2, notification);
        } else {
            notificationManager.cancel(i2);
        }
    }
}
