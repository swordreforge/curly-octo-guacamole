package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.nc;
import com.xiaomi.push.vy;
import com.xiaomi.push.y3;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.service.b */
/* JADX INFO: loaded from: classes3.dex */
public class C5907b {
    private static boolean f7l8(Map<String, String> map) {
        String str = map.get("notification_top_repeat");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean z2 = Boolean.parseBoolean(str);
        com.xiaomi.channel.commonutils.logger.zy.m19300t("top notification' repeat is " + z2);
        return z2;
    }

    /* JADX INFO: renamed from: g */
    static void m21556g(Context context, Map<String, String> map, vy vyVar, long j2) {
        if (map == null || vyVar == null || !nc.m21313p(context) || !f7l8(map)) {
            return;
        }
        int iM21557k = m21557k(map);
        int iM21562y = m21562y(map);
        if (iM21557k <= 0 || iM21562y > iM21557k) {
            com.xiaomi.channel.commonutils.logger.zy.jk("set top notification failed - period:" + iM21557k + " frequency:" + iM21562y);
            return;
        }
        vyVar.setPriority(2);
        Bundle bundle = new Bundle();
        bundle.putLong("mipush_org_when", j2);
        bundle.putBoolean("mipush_n_top_flag", true);
        if (iM21562y > 0) {
            bundle.putInt("mipush_n_top_fre", iM21562y);
        }
        bundle.putInt("mipush_n_top_prd", iM21557k);
        vyVar.addExtras(bundle);
    }

    /* JADX INFO: renamed from: k */
    private static int m21557k(Map<String, String> map) {
        return Math.max(0, y3.m22047k(map.get("notification_top_period"), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(19)
    public static void ld6(Context context, String str, int i2, String str2, Notification notification) {
        wvg wvgVarM21784n;
        Notification qVar;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (qVar = toq(notification, i2, str2, (wvgVarM21784n = wvg.m21784n(context, str)))) == null) {
            return;
        }
        boolean z2 = notification != null;
        if (qVar.getGroupAlertBehavior() != 1) {
            C5892r.m21412p(qVar, "mGroupAlertBehavior", 1);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = qVar.extras.getLong("mipush_org_when", 0L);
        int i3 = qVar.extras.getInt("mipush_n_top_fre", 0);
        int i4 = qVar.extras.getInt("mipush_n_top_prd", 0);
        if (i4 <= 0 || i4 < i3) {
            return;
        }
        long j3 = ((long) (i4 * 1000)) + j2;
        int iMin = (j2 >= jCurrentTimeMillis || jCurrentTimeMillis >= j3) ? 0 : i3 > 0 ? (int) Math.min((j3 - jCurrentTimeMillis) / 1000, i3) : i4;
        if (!z2) {
            if (iMin > 0) {
                qVar.when = jCurrentTimeMillis;
                com.xiaomi.channel.commonutils.logger.zy.kja0("update top notification: " + str2);
                wvgVarM21784n.n7h(i2, qVar);
            } else {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, qVar);
                builderRecoverBuilder.setPriority(0);
                builderRecoverBuilder.setWhen(jCurrentTimeMillis);
                Bundle extras = builderRecoverBuilder.getExtras();
                if (extras != null) {
                    extras.remove("mipush_n_top_flag");
                    extras.remove("mipush_org_when");
                    extras.remove("mipush_n_top_fre");
                    extras.remove("mipush_n_top_prd");
                    builderRecoverBuilder.setExtras(extras);
                }
                com.xiaomi.channel.commonutils.logger.zy.kja0("update top notification to common: " + str2);
                wvgVarM21784n.n7h(i2, builderRecoverBuilder.build());
            }
        }
        if (iMin > 0) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("schedule top notification next update delay: " + iMin);
            C5889p.toq(context).qrj(m21561s(i2, str2));
            C5889p.toq(context).n7h(zy(context, str, i2, str2, null), iMin);
        }
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: n */
    static void m21558n(Context context, String str, int i2, String str2, Notification notification) {
        if (nc.m21313p(context) && notification != null && notification.extras.getBoolean("mipush_n_top_flag", false)) {
            ld6(context, str, i2, str2, notification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static String m21561s(int i2, String str) {
        return "n_top_update_" + i2 + "_" + str;
    }

    @TargetApi(19)
    private static Notification toq(Notification notification, int i2, String str, wvg wvgVar) {
        if (notification != null) {
            if (!str.equals(notification.extras.getString("message_id"))) {
                notification = null;
            }
            return notification;
        }
        List<StatusBarNotification> listO1t = wvgVar.o1t();
        if (listO1t == null) {
            return null;
        }
        for (StatusBarNotification statusBarNotification : listO1t) {
            Notification notification2 = statusBarNotification.getNotification();
            String string = notification2.extras.getString("message_id");
            if (i2 == statusBarNotification.getId() && str.equals(string)) {
                return notification2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static int m21562y(Map<String, String> map) {
        return Math.max(0, y3.m22047k(map.get("notification_top_frequency"), 0));
    }

    private static C5889p.k zy(Context context, String str, int i2, String str2, Notification notification) {
        return new bf2(i2, str2, context, str, notification);
    }
}
