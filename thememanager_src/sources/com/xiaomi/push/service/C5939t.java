package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.uf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.xiaomi.push.service.t */
/* JADX INFO: loaded from: classes3.dex */
public class C5939t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final k<String, String, String> f73664f7l8;

    /* JADX INFO: renamed from: g */
    public static final k<String, String, String> f33901g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static Boolean f73665ld6;

    /* JADX INFO: renamed from: n */
    public static final k<String, String, String> f33903n;

    /* JADX INFO: renamed from: p */
    public static final k<String, String, String> f33904p;

    /* JADX INFO: renamed from: q */
    public static final k<String, String, String> f33905q;

    /* JADX INFO: renamed from: s */
    public static final k<String, String, String> f33906s;

    /* JADX INFO: renamed from: y */
    public static final k<String, String, String> f33907y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final k<String, String, String> f73667zy;

    /* JADX INFO: renamed from: k */
    private static final String[] f33902k = {"com.mi.globalbrowser", "com.android.browser"};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f73666toq = null;

    /* JADX INFO: renamed from: com.xiaomi.push.service.t$k */
    public static class k<F, S, T> {

        /* JADX INFO: renamed from: k */
        F f33908k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        S f73668toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        T f73669zy;

        private k(F f2, S s2, T t2) {
            this.f33908k = f2;
            this.f73668toq = s2;
            this.f73669zy = t2;
        }
    }

    static {
        String str = "getNotificationSettings";
        f73667zy = new k<>(str, str, str);
        String str2 = "canSound";
        f33905q = new k<>("setSound", str2, str2);
        String str3 = "canVibrate";
        f33903n = new k<>("setVibrate", str3, str3);
        String str4 = "canLights";
        f33901g = new k<>("setLights", str4, str4);
        String str5 = "canShowOnKeyguard";
        f73664f7l8 = new k<>("setShowOnKeyguard", str5, str5);
        f33907y = new k<>("setFloat", "canFloat", "canShowFloat");
        String str6 = "canShowBadge";
        f33906s = new k<>("setShowBadge", str6, str6);
        String str7 = "canShowOngoing";
        f33904p = new k<>("setShowOngoing", str7, str7);
    }

    public static boolean cdj(Notification.Builder builder, boolean z2) {
        builder.setGroupAlertBehavior(z2 ? 2 : 1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <T> T f7l8(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            r0 = 0
            boolean r1 = r2 instanceof android.app.Notification     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto Ld
            android.app.Notification r2 = (android.app.Notification) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = m21758g(r2, r3)     // Catch: java.lang.Exception -> L38
        Lb:
            r0 = r2
            goto L4d
        Ld:
            boolean r1 = r2 instanceof java.util.Map     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L18
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L38
            goto Lb
        L18:
            boolean r1 = r2 instanceof android.os.Bundle     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L23
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Exception -> L38
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L38
            goto Lb
        L23:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            r3.<init>()     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = "not support get value from classType:"
            r3.append(r1)     // Catch: java.lang.Exception -> L38
            r3.append(r2)     // Catch: java.lang.Exception -> L38
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L38
            com.xiaomi.channel.commonutils.logger.zy.kja0(r2)     // Catch: java.lang.Exception -> L38
            goto L4d
        L38:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "get value error "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.xiaomi.channel.commonutils.logger.zy.kja0(r2)
        L4d:
            if (r0 != 0) goto L50
            goto L51
        L50:
            r4 = r0
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C5939t.f7l8(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public static Notification.Action[] fn3e(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }

    public static String fu4(Notification notification) {
        Object objM21413q;
        try {
            Bundle bundle = notification.extras;
            string = bundle != null ? bundle.getString("target_package") : null;
            return (!TextUtils.isEmpty(string) || (objM21413q = C5892r.m21413q(notification, "extraNotification")) == null) ? string : (String) C5892r.m21411n(objM21413q, "getTargetPkg", new Object[0]);
        } catch (Exception unused) {
            return string;
        }
    }

    /* JADX INFO: renamed from: g */
    public static <T> T m21758g(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21759h() {
        Bundle bundleM21738g;
        if (f73665ld6 == null) {
            if (Build.VERSION.SDK_INT < 30 || (bundleM21738g = qkj8.m21738g("com.xiaomi.xmsf", null)) == null || bundleM21738g.isEmpty()) {
                f73665ld6 = Boolean.FALSE;
            } else {
                f73665ld6 = Boolean.TRUE;
            }
        }
        return f73665ld6.booleanValue();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21760i(Map<String, String> map) {
        return Boolean.parseBoolean((String) f7l8(map, "not_suppress", "true"));
    }

    /* JADX INFO: renamed from: k */
    public static int m21761k(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("get user aggregate failed, " + e2);
            return 0;
        }
    }

    public static boolean ki(ContentResolver contentResolver) {
        int iM21761k = m21761k(contentResolver);
        return iM21761k == 1 || iM21761k == 2;
    }

    public static void kja0(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("cp map to b fail:" + str);
            return;
        }
        if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    static void ld6(Notification notification, int i2, int i3) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i2);
            notification.extras.putInt("mipush_class", i3);
        }
    }

    /* JADX INFO: renamed from: n */
    private static Bundle m21762n(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("channel_id", str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    static void n7h(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f33902k));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) arrayList.get(i2);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e2) {
                    com.xiaomi.channel.commonutils.logger.zy.kja0("can't match url intent. " + e2);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    public static void ni7(Notification notification, boolean z2) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z2);
            }
            Object objM21413q = C5892r.m21413q(notification, "extraNotification");
            if (objM21413q != null) {
                C5892r.m21411n(objM21413q, "setEnableKeyguard", Boolean.valueOf(z2));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    static void m21763p(Notification notification, int i2) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i2);
            }
            Object objM21413q = C5892r.m21413q(notification, "extraNotification");
            if (objM21413q != null) {
                C5892r.m21411n(objM21413q, "setMessageCount", Integer.valueOf(i2));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: q */
    public static Bundle m21764q(Context context, String str, String str2) {
        try {
            return m21762n(context, f73667zy.f73668toq, str, str2, null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void qrj(Notification notification, boolean z2) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z2);
            }
            Object objM21413q = C5892r.m21413q(notification, "extraNotification");
            if (objM21413q != null) {
                C5892r.m21411n(objM21413q, "setEnableFloat", Boolean.valueOf(z2));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m21765s(Object obj) {
        return (String) f7l8(obj, "msg_busi_type", "");
    }

    public static boolean t8r(Context context, String str, String str2, k<String, String, String> kVar, boolean z2) {
        if (kVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(kVar.f73669zy, z2);
                m21762n(context, kVar.f33908k, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    static int toq(Context context, String str) {
        return uf.qrj(context, str);
    }

    static void x2(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString("target_package", str);
            }
            Object objM21413q = C5892r.m21413q(notification, "extraNotification");
            if (objM21413q != null) {
                C5892r.m21411n(objM21413q, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m21766y(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(androidx.core.app.x9kr.f50191wvg);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(androidx.core.app.x9kr.f3275t);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String zurt(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(androidx.core.app.x9kr.f50167mcp);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(androidx.core.app.x9kr.f50151gvn7);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static int zy(Context context, String str, String str2, k<String, String, String> kVar) {
        if (kVar == null) {
            return -1;
        }
        try {
            Bundle bundleM21762n = m21762n(context, kVar.f73668toq, str, str2, null);
            if (bundleM21762n == null || !bundleM21762n.containsKey(kVar.f73669zy)) {
                return -1;
            }
            return bundleM21762n.getBoolean(kVar.f73669zy) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }
}
