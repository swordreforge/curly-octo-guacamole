package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.m8;
import com.xiaomi.push.nc;
import com.xiaomi.push.oph;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class wvg {

    /* JADX INFO: renamed from: g */
    private static WeakHashMap<Integer, wvg> f33925g = new WeakHashMap<>();

    /* JADX INFO: renamed from: n */
    private static boolean f33926n;

    /* JADX INFO: renamed from: q */
    private static Object f33927q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Context f73676zy;

    /* JADX INFO: renamed from: k */
    private String f33928k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f73677toq;

    private wvg(String str) {
        this.f33928k = str;
    }

    private static void cdj(Context context) {
        if (f73676zy == null) {
            f73676zy = context.getApplicationContext();
            NotificationManager notificationManagerZy = zy();
            Boolean bool = (Boolean) C5892r.m21411n(notificationManagerZy, "isSystemConditionProviderEnabled", "xmsf_fake_condition_provider_path");
            ki("fwk is support.init:" + bool);
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            f33926n = zBooleanValue;
            if (zBooleanValue) {
                f33927q = C5892r.m21411n(notificationManagerZy, "getService", new Object[0]);
            }
        }
    }

    private static Object f7l8(List list) {
        return Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class).newInstance(list);
    }

    private String fu4(String str) {
        return ld6(t8r() ? "mipush|%s|%s" : "mipush_%s_%s", this.f33928k, str);
    }

    /* JADX INFO: renamed from: g */
    private static <T> T m21781g(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (T) obj.getClass().getMethod("getList", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21782i(Context context) {
        cdj(context);
        return t8r();
    }

    /* JADX INFO: renamed from: k */
    private static int m21783k(String str) {
        try {
            return f73676zy.getPackageManager().getPackageUid(str, 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    static void ki(String str) {
        com.xiaomi.channel.commonutils.logger.zy.kja0("NMHelper:" + str);
    }

    private static String ld6(String str, String str2, String str3) {
        return TextUtils.isEmpty(str) ? "" : String.format(str, str2, str3);
    }

    /* JADX INFO: renamed from: n */
    public static wvg m21784n(Context context, String str) {
        cdj(context);
        int iHashCode = str.hashCode();
        wvg wvgVar = f33925g.get(Integer.valueOf(iHashCode));
        if (wvgVar != null) {
            return wvgVar;
        }
        wvg wvgVar2 = new wvg(str);
        f33925g.put(Integer.valueOf(iHashCode), wvgVar2);
        return wvgVar2;
    }

    /* JADX INFO: renamed from: p */
    public static String m21785p(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String strLd6 = ld6("mipush|%s|%s", str2, "");
        return str.startsWith(strLd6) ? ld6("mipush_%s_%s", str2, str.replace(strLd6, "")) : str;
    }

    private static boolean t8r() {
        if (nc.m21315s() && a9.m21550q(f73676zy).qrj(oph.NotificationBelongToAppSwitch.m21370a(), true)) {
            return f33926n;
        }
        return false;
    }

    private StatusBarNotification[] zurt() {
        if (!nc.m21313p(m21787q())) {
            return null;
        }
        try {
            Object objM21411n = C5892r.m21411n(f33927q, "getActiveNotifications", m21787q().getPackageName());
            if (objM21411n instanceof StatusBarNotification[]) {
                return (StatusBarNotification[]) objM21411n;
            }
            return null;
        } catch (Throwable th) {
            ki("getAllNotifications error " + th);
            return null;
        }
    }

    private static NotificationManager zy() {
        return (NotificationManager) f73676zy.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle);
    }

    public boolean fn3e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(fu4(""));
    }

    /* JADX INFO: renamed from: h */
    void m21786h(NotificationChannel notificationChannel, boolean z2) {
        String str = this.f33928k;
        try {
            if (z2) {
                int iM21783k = m21783k(str);
                if (iM21783k != -1) {
                    C5892r.n7h(f33927q, "updateNotificationChannelForPackage", str, Integer.valueOf(iM21783k), notificationChannel);
                }
            } else {
                kja0(notificationChannel);
            }
        } catch (Exception e2) {
            ki("updateNotificationChannel error " + e2);
        }
    }

    @TargetApi(26)
    void kja0(NotificationChannel notificationChannel) {
        String str = this.f33928k;
        try {
            if (t8r()) {
                int iM21783k = m21783k(str);
                if (iM21783k != -1) {
                    C5892r.n7h(f33927q, "createNotificationChannelsForPackage", str, Integer.valueOf(iM21783k), f7l8(Arrays.asList(notificationChannel)));
                }
            } else {
                zy().createNotificationChannel(notificationChannel);
            }
        } catch (Exception e2) {
            ki("createNotificationChannel error" + e2);
        }
    }

    public void n7h(int i2, Notification notification) {
        String str = this.f33928k;
        NotificationManager notificationManagerZy = zy();
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (t8r()) {
                notification.extras.putString("xmsf_target_package", str);
                if (i3 >= 29) {
                    notificationManagerZy.notifyAsPackage(str, null, i2, notification);
                } else {
                    notificationManagerZy.notify(i2, notification);
                }
            } else {
                notificationManagerZy.notify(i2, notification);
            }
        } catch (Exception unused) {
        }
    }

    String ni7() {
        if (TextUtils.isEmpty(this.f73677toq)) {
            this.f73677toq = fu4("default");
        }
        return this.f73677toq;
    }

    public List<StatusBarNotification> o1t() {
        String str = this.f33928k;
        NotificationManager notificationManagerZy = zy();
        List<StatusBarNotification> list = null;
        try {
            if (t8r()) {
                int iZy = m8.zy();
                if (iZy != -1) {
                    list = (List) m21781g(C5892r.m21411n(f33927q, "getAppActiveNotifications", str, Integer.valueOf(iZy)));
                }
            } else {
                StatusBarNotification[] activeNotifications = notificationManagerZy.getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        for (StatusBarNotification statusBarNotification : activeNotifications) {
                            if (str.equals(C5939t.fu4(statusBarNotification.getNotification()))) {
                                arrayList.add(statusBarNotification);
                            }
                        }
                        list = arrayList;
                    } catch (Throwable th) {
                        th = th;
                        list = arrayList;
                        ki("getActiveNotifications error " + th);
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return list;
    }

    /* JADX INFO: renamed from: q */
    public Context m21787q() {
        return f73676zy;
    }

    public void qrj(int i2) {
        String str = this.f33928k;
        try {
            if (!t8r()) {
                zy().cancel(i2);
                return;
            }
            int iZy = m8.zy();
            String packageName = m21787q().getPackageName();
            if (Build.VERSION.SDK_INT >= 30) {
                C5892r.n7h(f33927q, "cancelNotificationWithTag", str, packageName, null, Integer.valueOf(i2), Integer.valueOf(iZy));
            } else {
                C5892r.n7h(f33927q, "cancelNotificationWithTag", str, null, Integer.valueOf(i2), Integer.valueOf(iZy));
            }
            ki("cancel succ:" + i2);
        } catch (Exception e2) {
            ki("cancel error" + e2);
        }
    }

    /* JADX INFO: renamed from: s */
    public String m21788s(String str) {
        return TextUtils.isEmpty(str) ? ni7() : nc.m21313p(m21787q()) ? fu4(str) : str;
    }

    public String toString() {
        return "NotificationManagerHelper{" + this.f33928k + "}";
    }

    @TargetApi(26)
    public NotificationChannel toq(String str) {
        NotificationChannel notificationChannel = null;
        try {
            if (t8r()) {
                List<NotificationChannel> listX2 = x2();
                if (listX2 != null) {
                    Iterator<NotificationChannel> it = listX2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            NotificationChannel next = it.next();
                            if (str.equals(next.getId())) {
                                notificationChannel = next;
                                break;
                            }
                        }
                    }
                }
            } else {
                notificationChannel = zy().getNotificationChannel(str);
            }
            break;
        } catch (Exception e2) {
            ki("getNotificationChannel error" + e2);
        }
        return notificationChannel;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @TargetApi(26)
    public List<NotificationChannel> x2() {
        String str;
        String str2 = this.f33928k;
        List<NotificationChannel> notificationChannels = null;
        try {
            if (t8r()) {
                int iM21783k = m21783k(str2);
                if (iM21783k != -1) {
                    Object obj = f33927q;
                    Object[] objArr = {str2, Integer.valueOf(iM21783k), Boolean.FALSE};
                    str = "mipush|%s|%s";
                    notificationChannels = (List) m21781g(C5892r.m21411n(obj, "getNotificationChannelsForPackage", objArr));
                } else {
                    str = null;
                }
            } else {
                notificationChannels = zy().getNotificationChannels();
                str = "mipush_%s_%s";
            }
            if (!nc.m21315s() || notificationChannels == null) {
                return notificationChannels;
            }
            ArrayList arrayList = new ArrayList();
            String strLd6 = ld6(str, str2, "");
            for (NotificationChannel notificationChannel : notificationChannels) {
                if (notificationChannel.getId().startsWith(strLd6)) {
                    arrayList.add(notificationChannel);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            ki("getNotificationChannels error " + e2);
            return notificationChannels;
        }
    }

    /* JADX INFO: renamed from: y */
    public String m21789y() {
        return this.f33928k;
    }

    /* JADX INFO: renamed from: z */
    String m21790z(String str, String str2) {
        return t8r() ? str : str2;
    }
}
