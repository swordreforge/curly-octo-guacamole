package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.nc;
import com.xiaomi.push.oph;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(24)
class ni7 {

    /* JADX INFO: renamed from: k */
    private static ni7 f33862k = new ni7();

    /* JADX INFO: renamed from: com.xiaomi.push.service.ni7$k */
    private class C5929k {

        /* JADX INFO: renamed from: k */
        List<toq> f33863k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        List<toq> f73647toq;

        private C5929k() {
            this.f33863k = new ArrayList();
            this.f73647toq = new ArrayList();
        }
    }

    private class toq {

        /* JADX INFO: renamed from: k */
        int f33864k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Notification f73649toq;

        public toq(int i2, Notification notification) {
            this.f33864k = i2;
            this.f73649toq = notification;
        }

        public String toString() {
            return "id:" + this.f33864k;
        }
    }

    private ni7() {
    }

    private boolean cdj(Context context) {
        return a9.m21550q(context).qrj(oph.NotificationAutoGroupSwitch.m21370a(), true);
    }

    private void f7l8(Context context, int i2, Notification notification, boolean z2) {
        Notification notification2;
        String strFu4 = C5939t.fu4(notification);
        if (TextUtils.isEmpty(strFu4)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("group auto not extract pkg from notification:" + i2);
            return;
        }
        List<StatusBarNotification> listM21704n = m21704n(wvg.m21784n(context, strFu4));
        if (listM21704n == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("group auto not get notifications");
            return;
        }
        String strN7h = n7h(notification);
        HashMap map = new HashMap();
        for (StatusBarNotification statusBarNotification : listM21704n) {
            if (statusBarNotification.getNotification() != null && statusBarNotification.getId() != i2) {
                m21705p(map, statusBarNotification);
            }
        }
        for (Map.Entry<String, C5929k> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                C5929k value = entry.getValue();
                if (z2 && key.equals(strN7h) && !m21702h(notification)) {
                    toq toqVar = new toq(i2, notification);
                    if (x2(notification)) {
                        value.f73647toq.add(toqVar);
                    } else {
                        value.f33863k.add(toqVar);
                    }
                }
                int size = value.f33863k.size();
                if (value.f73647toq.size() <= 0) {
                    if (z2 && size >= 2) {
                        m21706s(context, strFu4, key, value.f33863k.get(0).f73649toq);
                    }
                } else if (size <= 0) {
                    m21707y(context, strFu4, key);
                } else if (a9.m21550q(context).qrj(oph.NotificationGroupUpdateTimeSwitch.m21370a(), false) && (notification2 = value.f73647toq.get(0).f73649toq) != null) {
                    notification2.when = System.currentTimeMillis();
                    m21706s(context, strFu4, key, notification2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private boolean m21702h(Notification notification) {
        Bundle bundle;
        if (notification == null || notification.getGroup() == null || (bundle = notification.extras) == null) {
            return false;
        }
        return notification.getGroup().equals(String.format("pushmask_%s_%s", Long.valueOf(bundle.getLong("push_src_group_time")), zy(notification)));
    }

    /* JADX INFO: renamed from: k */
    private int m21703k(String str, String str2) {
        return ("GroupSummary" + str + str2).hashCode();
    }

    private void kja0(Context context, int i2, Notification notification) {
        String strFu4 = C5939t.fu4(notification);
        if (TextUtils.isEmpty(strFu4)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("group restore not extract pkg from notification:" + i2);
            return;
        }
        wvg wvgVarM21784n = wvg.m21784n(context, strFu4);
        List<StatusBarNotification> listM21704n = m21704n(wvgVarM21784n);
        if (listM21704n == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("group restore not get notifications");
            return;
        }
        for (StatusBarNotification statusBarNotification : listM21704n) {
            Notification notification2 = statusBarNotification.getNotification();
            if (notification2 != null && m21702h(notification2) && statusBarNotification.getId() != i2) {
                Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification());
                builderRecoverBuilder.setGroup(zy(notification2));
                C5939t.cdj(builderRecoverBuilder, x2(notification2));
                wvgVarM21784n.n7h(statusBarNotification.getId(), builderRecoverBuilder.build());
                com.xiaomi.channel.commonutils.logger.zy.m19302z("group restore notification:" + statusBarNotification.getId());
            }
        }
    }

    private boolean ld6() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    private List<StatusBarNotification> m21704n(wvg wvgVar) {
        List<StatusBarNotification> listO1t = wvgVar != null ? wvgVar.o1t() : null;
        if (listO1t == null || listO1t.size() == 0) {
            return null;
        }
        return listO1t;
    }

    private String n7h(Notification notification) {
        if (notification == null) {
            return null;
        }
        return m21702h(notification) ? zy(notification) : notification.getGroup();
    }

    /* JADX INFO: renamed from: p */
    private void m21705p(Map<String, C5929k> map, StatusBarNotification statusBarNotification) {
        String strN7h = n7h(statusBarNotification.getNotification());
        C5929k c5929k = map.get(strN7h);
        if (c5929k == null) {
            c5929k = new C5929k();
            map.put(strN7h, c5929k);
        }
        toq toqVar = new toq(statusBarNotification.getId(), statusBarNotification.getNotification());
        if (x2(statusBarNotification.getNotification())) {
            c5929k.f73647toq.add(toqVar);
        } else {
            c5929k.f33863k.add(toqVar);
        }
    }

    private boolean qrj(Context context) {
        if (cdj(context) && wvg.m21782i(context)) {
            return a9.m21550q(context).qrj(oph.LatestNotificationNotIntoGroupSwitch.m21370a(), false);
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private void m21706s(Context context, String str, String str2, Notification notification) {
        try {
            if (TextUtils.isEmpty(str2)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("group show summary group is null");
                return;
            }
            int qVar = C5939t.toq(context, str);
            if (qVar == 0) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("group show summary not get icon from " + str);
                return;
            }
            wvg wvgVarM21784n = wvg.m21784n(context, str);
            String strM21790z = wvgVarM21784n.m21790z(notification.getChannelId(), "groupSummary");
            NotificationChannel qVar2 = wvgVarM21784n.toq(strM21790z);
            if ("groupSummary".equals(strM21790z) && qVar2 == null) {
                wvgVarM21784n.kja0(new NotificationChannel(strM21790z, "group_summary", 3));
            }
            Notification.Builder builder = new Notification.Builder(context, strM21790z);
            C5939t.cdj(builder, true);
            Notification notificationBuild = builder.setContentTitle("GroupSummary").setContentText("GroupSummary").setSmallIcon(Icon.createWithResource(str, qVar)).setAutoCancel(true).setGroup(str2).setGroupSummary(true).build();
            if (!nc.ki() && "com.xiaomi.xmsf".equals(context.getPackageName())) {
                C5939t.x2(notificationBuild, str);
            }
            int iM21703k = m21703k(str, str2);
            wvgVarM21784n.n7h(iM21703k, notificationBuild);
            com.xiaomi.channel.commonutils.logger.zy.m19302z("group show summary notify:" + iM21703k);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("group show summary error " + e2);
        }
    }

    public static ni7 toq() {
        return f33862k;
    }

    private boolean x2(Notification notification) {
        if (notification == null) {
            return false;
        }
        Object objM21411n = C5892r.m21411n(notification, "isGroupSummary", null);
        if (objM21411n instanceof Boolean) {
            return ((Boolean) objM21411n).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    private void m21707y(Context context, String str, String str2) {
        com.xiaomi.channel.commonutils.logger.zy.m19302z("group cancel summary:" + str2);
        wvg.m21784n(context, str).qrj(m21703k(str, str2));
    }

    private String zy(Notification notification) {
        Bundle bundle;
        if (notification == null || (bundle = notification.extras) == null) {
            return null;
        }
        return bundle.getString("push_src_group_name");
    }

    /* JADX INFO: renamed from: g */
    public void m21708g(Context context, int i2, Notification notification) {
        if (ld6()) {
            if (qrj(context)) {
                try {
                    kja0(context, i2, notification);
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("group notify handle restore error " + e2);
                }
            }
            if (cdj(context)) {
                try {
                    f7l8(context, i2, notification, true);
                } catch (Exception e3) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("group notify handle auto error " + e3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public String m21709q(Context context, Notification.Builder builder, String str) {
        if (!ld6() || !qrj(context)) {
            return str;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle extras = builder.getExtras();
        extras.putString("push_src_group_name", str);
        extras.putLong("push_src_group_time", jCurrentTimeMillis);
        return String.format("pushmask_%s_%s", Long.valueOf(jCurrentTimeMillis), str);
    }
}
