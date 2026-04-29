package com.android.thememanager.basemodule.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.android.thememanager.R;

/* JADX INFO: compiled from: NotificationUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class jk {

    /* JADX INFO: renamed from: k */
    public static final String f10344k = "theme_manager_suspension";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57769toq = "theme_manager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57770zy = "ThemeManager";

    /* JADX INFO: renamed from: g */
    public static void m7102g(@zy.lvui Context context, int notifyId, @zy.dd String channelId, @zy.dd Notification.Builder builder) {
        if (builder == null) {
            builder = new Notification.Builder(context);
        }
        if (TextUtils.isEmpty(channelId)) {
            channelId = f57769toq;
        }
        zy(context, channelId);
        builder.setChannelId(channelId);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
        if (notificationManager != null) {
            notificationManager.notify(notifyId, builder.build());
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static Notification m7103k(@zy.lvui Context context, @zy.dd String channelId) {
        return toq(context, channelId, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m7104n(@zy.lvui Context context, int notifyId, @zy.dd Notification.Builder builder) {
        m7102g(context, notifyId, null, builder);
    }

    @zy.hyr(26)
    /* JADX INFO: renamed from: q */
    public static void m7105q(@zy.lvui Context context, @zy.lvui String channelId) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
        if (notificationManager == null || notificationManager.getNotificationChannel(channelId) != null) {
            return;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(channelId, context.getResources().getString(C1807g.lvui() ? R.string.app_name_pad : R.string.app_name), 4));
    }

    @zy.lvui
    public static Notification toq(@zy.lvui Context context, @zy.dd String channelId, @zy.dd Notification.Builder builder) {
        if (builder == null) {
            builder = new Notification.Builder(context);
        }
        if (TextUtils.isEmpty(channelId)) {
            channelId = f57769toq;
        }
        if (f10344k.equals(channelId)) {
            m7105q(context, channelId);
        } else {
            zy(context, channelId);
        }
        builder.setChannelId(channelId);
        return builder.build();
    }

    @zy.hyr(26)
    public static void zy(@zy.lvui Context context, @zy.lvui String channelId) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
        if (notificationManager == null || notificationManager.getNotificationChannel(channelId) != null) {
            return;
        }
        notificationManager.createNotificationChannel(new NotificationChannel(channelId, context.getResources().getString(C1807g.lvui() ? R.string.app_name_pad : R.string.app_name), 3));
    }
}
