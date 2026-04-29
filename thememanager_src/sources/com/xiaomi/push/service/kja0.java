package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.RemoteViews;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.a5id;
import com.xiaomi.push.dxef;
import com.xiaomi.push.e5;
import com.xiaomi.push.ge;
import com.xiaomi.push.m28;
import com.xiaomi.push.nc;
import com.xiaomi.push.service.C5946z;
import com.xiaomi.push.uf;
import com.xiaomi.push.vy;
import com.xiaomi.push.wwp;
import com.xiaomi.push.y3;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class kja0 {

    /* JADX INFO: renamed from: k */
    public static long f33830k;

    /* JADX INFO: renamed from: q */
    private static volatile fn3e f33831q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final LinkedList<Pair<Integer, m28>> f73631toq = new LinkedList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static ExecutorService f73632zy = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: com.xiaomi.push.service.kja0$k */
    private static class CallableC5923k implements Callable<Bitmap> {

        /* JADX INFO: renamed from: k */
        private String f33832k;

        /* JADX INFO: renamed from: n */
        private boolean f33833n;

        /* JADX INFO: renamed from: q */
        private Context f33834q;

        public CallableC5923k(String str, Context context, boolean z2) {
            this.f33834q = context;
            this.f33832k = str;
            this.f33833n = z2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap call() throws Throwable {
            if (TextUtils.isEmpty(this.f33832k)) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("Failed get online picture/icon resource cause picUrl is empty");
                return null;
            }
            if (this.f33832k.startsWith("http")) {
                C5946z.toq toqVarM21808q = C5946z.m21808q(this.f33834q, this.f33832k, this.f33833n);
                if (toqVarM21808q != null) {
                    return toqVarM21808q.f33941k;
                }
                com.xiaomi.channel.commonutils.logger.zy.kja0("Failed get online picture/icon resource");
                return null;
            }
            Bitmap qVar = C5946z.toq(this.f33834q, this.f33832k);
            if (qVar != null) {
                return qVar;
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("Failed get online picture/icon resource");
            return qVar;
        }
    }

    public static class toq {

        /* JADX INFO: renamed from: k */
        Notification f33835k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        long f73633toq = 0;
    }

    public static class zy {

        /* JADX INFO: renamed from: k */
        public String f33836k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public long f73634toq = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public boolean f73635zy = false;
    }

    @TargetApi(16)
    private static void a9(vy vyVar, Context context, String str, m28 m28Var, byte[] bArr, int i2) {
        PendingIntent pendingIntentM21675y;
        PendingIntent pendingIntentM21675y2;
        PendingIntent pendingIntentM21675y3;
        PendingIntent pendingIntentM21675y4;
        Map<String, String> mapM20907a = m28Var.m21235a().m20907a();
        if (TextUtils.equals("3", mapM20907a.get("notification_style_type")) || TextUtils.equals("4", mapM20907a.get("notification_style_type"))) {
            return;
        }
        if (lrht(mapM20907a)) {
            for (int i3 = 1; i3 <= 3; i3++) {
                String str2 = mapM20907a.get(String.format("cust_btn_%s_n", Integer.valueOf(i3)));
                if (!TextUtils.isEmpty(str2) && (pendingIntentM21675y4 = m21675y(context, str, m28Var, bArr, i2, i3)) != null) {
                    vyVar.addAction(0, str2, pendingIntentM21675y4);
                }
            }
            return;
        }
        if (!TextUtils.isEmpty(mapM20907a.get("notification_style_button_left_name")) && (pendingIntentM21675y3 = m21675y(context, str, m28Var, bArr, i2, 1)) != null) {
            vyVar.addAction(0, mapM20907a.get("notification_style_button_left_name"), pendingIntentM21675y3);
        }
        if (!TextUtils.isEmpty(mapM20907a.get("notification_style_button_mid_name")) && (pendingIntentM21675y2 = m21675y(context, str, m28Var, bArr, i2, 2)) != null) {
            vyVar.addAction(0, mapM20907a.get("notification_style_button_mid_name"), pendingIntentM21675y2);
        }
        if (TextUtils.isEmpty(mapM20907a.get("notification_style_button_right_name")) || (pendingIntentM21675y = m21675y(context, str, m28Var, bArr, i2, 3)) == null) {
            return;
        }
        vyVar.addAction(0, mapM20907a.get("notification_style_button_right_name"), pendingIntentM21675y);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m21661c(m28 m28Var) {
        ge geVarM21235a = m28Var.m21235a();
        return d3(geVarM21235a) && geVarM21235a.f32985b == 1 && !oc(m28Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.xiaomi.push.service.kja0.toq cdj(android.content.Context r27, com.xiaomi.push.m28 r28, byte[] r29, android.widget.RemoteViews r30, android.app.PendingIntent r31, int r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.kja0.cdj(android.content.Context, com.xiaomi.push.m28, byte[], android.widget.RemoteViews, android.app.PendingIntent, int):com.xiaomi.push.service.kja0$toq");
    }

    public static boolean d2ok(Map<String, String> map) {
        if (map == null || !map.containsKey("notify_foreground")) {
            return true;
        }
        return "1".equals(map.get("notify_foreground"));
    }

    private static boolean d3(ge geVar) {
        if (geVar == null) {
            return false;
        }
        String strM20906a = geVar.m20906a();
        return !TextUtils.isEmpty(strM20906a) && strM20906a.length() == 22 && "satuigmo".indexOf(strM20906a.charAt(0)) >= 0;
    }

    private static int dd(Map<String, String> map) {
        if (map == null) {
            return 3;
        }
        String str = map.get("channel_importance");
        if (TextUtils.isEmpty(str)) {
            return 3;
        }
        try {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("importance=" + str);
            return Integer.parseInt(str);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("parsing channel importance error: " + e2);
            return 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m21662e(m28 m28Var) {
        ge geVarM21235a = m28Var.m21235a();
        return d3(geVarM21235a) && geVarM21235a.f32985b == 0 && !oc(m28Var);
    }

    private static boolean eqxt(String str, String str2) {
        return TextUtils.isEmpty(str) || str2.contains(str);
    }

    /* JADX INFO: renamed from: f */
    static boolean m21663f(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).contains(str);
    }

    private static PendingIntent f7l8(Context context, m28 m28Var, String str, byte[] bArr, int i2, int i3, boolean z2) {
        Intent intent;
        int i4 = m21662e(m28Var) ? 1000 : oc(m28Var) ? androidx.vectordrawable.graphics.drawable.f7l8.f6806q : -1;
        ge geVarM21235a = m28Var.m21235a();
        String strM20906a = geVarM21235a != null ? geVarM21235a.m20906a() : "";
        boolean zOc = oc(m28Var);
        if (geVarM21235a != null && !TextUtils.isEmpty(geVarM21235a.f32992e)) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(geVarM21235a.f32992e));
            try {
                String protocol = new URL(geVarM21235a.f32992e).getProtocol();
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    C5939t.n7h(context, str, intent2);
                } else {
                    intent2.setPackage(str);
                }
            } catch (MalformedURLException unused) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("meet URL exception : " + geVarM21235a.f32992e);
                intent2.setPackage(str);
            }
            intent2.addFlags(268435456);
            intent2.putExtra("messageId", strM20906a);
            intent2.putExtra("eventMessageType", i4);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent2, 167772160) : PendingIntent.getActivity(context, 0, intent2, 134217728);
        }
        if (zOc) {
            intent = new Intent();
            intent.setComponent(new ComponentName("com.xiaomi.xmsf", "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i2));
            intent.addCategory(String.valueOf(strM20906a));
        } else {
            intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setComponent(new ComponentName(str, "com.xiaomi.mipush.sdk.PushMessageHandler"));
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_notified", true);
            intent.addCategory(String.valueOf(i2));
            intent.addCategory(String.valueOf(strM20906a));
        }
        intent.putExtra("notification_click_button", i3);
        intent.putExtra("messageId", strM20906a);
        intent.putExtra("eventMessageType", i4);
        if (zOc || !z2) {
            ni7(context, intent, m28Var, geVarM21235a, strM20906a, i3);
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getService(context, 0, intent, 167772160) : PendingIntent.getService(context, 0, intent, 134217728);
        }
        Intent intent3 = new Intent();
        intent3.setComponent(m21673s(str));
        intent3.addFlags(276824064);
        intent3.putExtra("mipush_serviceIntent", intent);
        intent3.addCategory(String.valueOf(i2));
        intent3.addCategory(String.valueOf(strM20906a));
        intent3.addCategory(String.valueOf(i3));
        ni7(context, intent3, m28Var, geVarM21235a, strM20906a, i3);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intent3, 167772160) : PendingIntent.getActivity(context, 0, intent3, 134217728);
    }

    public static String fn3e(Map<String, String> map, int i2) {
        String str = i2 == 0 ? "notify_effect" : lrht(map) ? String.format("cust_btn_%s_ne", Integer.valueOf(i2)) : i2 == 1 ? "notification_style_button_left_notify_effect" : i2 == 2 ? "notification_style_button_mid_notify_effect" : i2 == 3 ? "notification_style_button_right_notify_effect" : i2 == 4 ? "notification_colorful_button_notify_effect" : null;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    private static boolean fti(Context context, m28 m28Var, String str) {
        if (m28Var != null && m28Var.m21235a() != null && m28Var.m21235a().m20907a() != null && !TextUtils.isEmpty(str)) {
            return Boolean.parseBoolean(m28Var.m21235a().m20907a().get("use_clicked_activity")) && was.toq(context, m21673s(str));
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("should clicked activity params are null.");
        return false;
    }

    public static void fu4(Context context, String str) {
        m21676z(context, str, -1);
    }

    /* JADX INFO: renamed from: g */
    private static PendingIntent m21664g(Context context, m28 m28Var, String str, byte[] bArr, int i2) {
        return f7l8(context, m28Var, str, bArr, i2, 0, fti(context, m28Var, str));
    }

    public static boolean gvn7(Context context, String str, boolean z2) {
        return nc.m21315s() && !z2 && jp0y(context, str);
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: h */
    private static vy m21665h(Context context, m28 m28Var, byte[] bArr, String str, int i2) {
        PendingIntent pendingIntentM21675y;
        String strM21666i = m21666i(m28Var);
        Map<String, String> mapM20907a = m28Var.m21235a().m20907a();
        String str2 = mapM20907a.get("notification_style_type");
        vy vyVarM21610k = (!nc.m21313p(context) || f33831q == null) ? null : f33831q.m21610k(context, i2, strM21666i, mapM20907a);
        if (vyVarM21610k != null) {
            vyVarM21610k.f7l8(mapM20907a);
            return vyVarM21610k;
        }
        if ("2".equals(str2)) {
            vy vyVar = new vy(context);
            Bitmap bitmapQrj = TextUtils.isEmpty(mapM20907a.get("notification_bigPic_uri")) ? null : qrj(context, mapM20907a.get("notification_bigPic_uri"), false);
            if (bitmapQrj == null) {
                com.xiaomi.channel.commonutils.logger.zy.kja0("can not get big picture.");
                return vyVar;
            }
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(vyVar);
            bigPictureStyle.bigPicture(bitmapQrj);
            bigPictureStyle.setSummaryText(str);
            bigPictureStyle.bigLargeIcon((Bitmap) null);
            vyVar.setStyle(bigPictureStyle);
            return vyVar;
        }
        if ("1".equals(str2)) {
            vy vyVar2 = new vy(context);
            vyVar2.setStyle(new Notification.BigTextStyle().bigText(str));
            return vyVar2;
        }
        if ("4".equals(str2) && nc.m21315s()) {
            dxef dxefVar = new dxef(context, strM21666i);
            if (!TextUtils.isEmpty(mapM20907a.get("notification_banner_image_uri"))) {
                dxefVar.jp0y(qrj(context, mapM20907a.get("notification_banner_image_uri"), false));
            }
            if (!TextUtils.isEmpty(mapM20907a.get("notification_banner_icon_uri"))) {
                dxefVar.d3(qrj(context, mapM20907a.get("notification_banner_icon_uri"), false));
            }
            dxefVar.f7l8(mapM20907a);
            return dxefVar;
        }
        if (!"3".equals(str2) || !nc.m21315s()) {
            return new vy(context);
        }
        a5id a5idVar = new a5id(context, i2, strM21666i);
        if (!TextUtils.isEmpty(mapM20907a.get("notification_colorful_button_text")) && (pendingIntentM21675y = m21675y(context, strM21666i, m28Var, bArr, i2, 4)) != null) {
            a5idVar.d3(mapM20907a.get("notification_colorful_button_text"), pendingIntentM21675y).oc(mapM20907a.get("notification_colorful_button_bg_color"));
        }
        if (!TextUtils.isEmpty(mapM20907a.get("notification_colorful_bg_color"))) {
            a5idVar.d2ok(mapM20907a.get("notification_colorful_bg_color"));
        } else if (!TextUtils.isEmpty(mapM20907a.get("notification_colorful_bg_image_uri"))) {
            a5idVar.gvn7(qrj(context, mapM20907a.get("notification_colorful_bg_image_uri"), false));
        }
        a5idVar.f7l8(mapM20907a);
        return a5idVar;
    }

    public static boolean hb(m28 m28Var) {
        return oc(m28Var) || m21662e(m28Var) || m21661c(m28Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void hyr(android.content.Context r2, java.lang.String r3, com.xiaomi.push.vy r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            boolean r0 = com.xiaomi.push.nc.m21313p(r2)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "fcm_icon_uri"
            java.lang.String r0 = zurt(r5, r0)
            java.lang.String r1 = "fcm_icon_color"
            java.lang.String r5 = zurt(r5, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2c
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L2c
            int r0 = toq(r2, r3, r0)
            if (r0 <= 0) goto L2c
            r1 = 1
            r4.setSmallIcon(r0)
            r4.m21922g(r5)
            goto L2d
        L2c:
            r1 = 0
        L2d:
            if (r1 != 0) goto L3a
            int r2 = com.xiaomi.push.service.C5939t.toq(r2, r3)
            android.graphics.drawable.Icon r2 = android.graphics.drawable.Icon.createWithResource(r3, r2)
            r4.setSmallIcon(r2)
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.kja0.hyr(android.content.Context, java.lang.String, com.xiaomi.push.vy, java.util.Map):void");
    }

    /* JADX INFO: renamed from: i */
    public static String m21666i(m28 m28Var) {
        ge geVarM21235a;
        if ("com.xiaomi.xmsf".equals(m28Var.f33393b) && (geVarM21235a = m28Var.m21235a()) != null && geVarM21235a.m20907a() != null) {
            String str = geVarM21235a.m20907a().get("miui_package_name");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return m28Var.f33393b;
    }

    private static void jk(Intent intent) {
        if (intent == null) {
            return;
        }
        intent.setFlags(intent.getFlags() & (-2) & (-3) & (-65) & (-129));
    }

    public static boolean jp0y(Context context, String str) {
        return uf.kja0(context, str);
    }

    /* JADX INFO: renamed from: k */
    static int m21667k(Context context, String str) {
        return context.getSharedPreferences("pref_notify_type", 0).getInt(str, Integer.MAX_VALUE);
    }

    public static zy ki(Context context, m28 m28Var, byte[] bArr) {
        int iM20921c;
        Map<String, String> mapM20907a;
        zy zyVar = new zy();
        uf.toq toqVarM21858g = uf.m21858g(context, m21666i(m28Var), true);
        ge geVarM21235a = m28Var.m21235a();
        if (geVarM21235a != null) {
            iM20921c = geVarM21235a.m20921c();
            mapM20907a = geVarM21235a.m20907a();
        } else {
            iM20921c = 0;
            mapM20907a = null;
        }
        int iM22048n = y3.m22048n(m21666i(m28Var), iM20921c);
        if (nc.m21313p(context) && toqVarM21858g == uf.toq.NOT_ALLOWED) {
            if (geVarM21235a != null) {
                e5.m20763k(context.getApplicationContext()).m20769y(m28Var.m21251b(), ncyb(m28Var), geVarM21235a.m20906a(), "10:" + m21666i(m28Var));
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("Do not notify because user block " + m21666i(m28Var) + "‘s notification");
            return zyVar;
        }
        if (nc.m21313p(context) && f33831q != null && f33831q.m21612q(context, iM22048n, m21666i(m28Var), mapM20907a)) {
            if (geVarM21235a != null) {
                e5.m20763k(context.getApplicationContext()).m20769y(m28Var.m21251b(), ncyb(m28Var), geVarM21235a.m20906a(), "14:" + m21666i(m28Var));
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("Do not notify because card notification is canceled or sequence incorrect");
            return zyVar;
        }
        RemoteViews remoteViewsKja0 = kja0(context, m28Var, bArr);
        PendingIntent pendingIntentM21664g = m21664g(context, m28Var, m28Var.m21251b(), bArr, iM22048n);
        if (pendingIntentM21664g == null) {
            if (geVarM21235a != null) {
                e5.m20763k(context.getApplicationContext()).m20769y(m28Var.m21251b(), ncyb(m28Var), geVarM21235a.m20906a(), "11");
            }
            com.xiaomi.channel.commonutils.logger.zy.kja0("The click PendingIntent is null. ");
            return zyVar;
        }
        toq toqVarCdj = cdj(context, m28Var, bArr, remoteViewsKja0, pendingIntentM21664g, iM22048n);
        zyVar.f73634toq = toqVarCdj.f73633toq;
        zyVar.f33836k = m21666i(m28Var);
        Notification notification = toqVarCdj.f33835k;
        if (nc.m21315s()) {
            if (!TextUtils.isEmpty(geVarM21235a.m20906a())) {
                notification.extras.putString("message_id", geVarM21235a.m20906a());
            }
            notification.extras.putString("local_paid", m28Var.m21243a());
            C5939t.kja0(mapM20907a, notification.extras, "msg_busi_type");
            C5939t.kja0(mapM20907a, notification.extras, "disable_notification_flags");
            String str = geVarM21235a.m20917b() == null ? null : geVarM21235a.m20917b().get("score_info");
            if (!TextUtils.isEmpty(str)) {
                notification.extras.putString("score_info", str);
            }
            notification.extras.putString("pushUid", zurt(geVarM21235a.f32983a, "n_stats_expose"));
            int i2 = -1;
            if (m21662e(m28Var)) {
                i2 = 1000;
            } else if (oc(m28Var)) {
                i2 = androidx.vectordrawable.graphics.drawable.f7l8.f6806q;
            }
            notification.extras.putString("eventMessageType", String.valueOf(i2));
            notification.extras.putString("target_package", m21666i(m28Var));
        }
        String str2 = geVarM21235a.m20907a() != null ? geVarM21235a.m20907a().get("message_count") : null;
        if (nc.m21315s() && str2 != null) {
            try {
                C5939t.m21763p(notification, Integer.parseInt(str2));
            } catch (NumberFormatException e2) {
                e5.m20763k(context.getApplicationContext()).m20768s(m28Var.m21251b(), ncyb(m28Var), geVarM21235a.m20906a(), "8");
                com.xiaomi.channel.commonutils.logger.zy.jk("fail to set message count. " + e2);
            }
        }
        String strM21666i = m21666i(m28Var);
        C5939t.x2(notification, strM21666i);
        wvg wvgVarM21784n = wvg.m21784n(context, strM21666i);
        if (nc.m21313p(context) && f33831q != null) {
            f33831q.toq(m28Var, geVarM21235a.m20907a(), iM22048n, notification);
        }
        if (nc.m21313p(context) && f33831q != null && f33831q.m21611n(geVarM21235a.m20907a(), iM22048n, notification)) {
            com.xiaomi.channel.commonutils.logger.zy.m19302z("consume this notificaiton by agent");
        } else {
            wvgVarM21784n.n7h(iM22048n, notification);
            zyVar.f73635zy = true;
            com.xiaomi.channel.commonutils.logger.zy.kja0("notification: " + geVarM21235a.m20906a() + " is notifyied");
        }
        if (nc.m21315s() && nc.m21313p(context)) {
            ni7.toq().m21708g(context, iM22048n, notification);
            C5907b.m21558n(context, strM21666i, iM22048n, geVarM21235a.m20906a(), notification);
        }
        if (oc(m28Var)) {
            e5.m20763k(context.getApplicationContext()).f7l8(m28Var.m21251b(), ncyb(m28Var), geVarM21235a.m20906a(), 3002, null);
        }
        if (m21662e(m28Var)) {
            e5.m20763k(context.getApplicationContext()).f7l8(m28Var.m21251b(), ncyb(m28Var), geVarM21235a.m20906a(), 1002, null);
        }
        Pair<Integer, m28> pair = new Pair<>(Integer.valueOf(iM22048n), m28Var);
        LinkedList<Pair<Integer, m28>> linkedList = f73631toq;
        synchronized (linkedList) {
            linkedList.add(pair);
            if (linkedList.size() > 100) {
                linkedList.remove();
            }
        }
        return zyVar;
    }

    private static RemoteViews kja0(Context context, m28 m28Var, byte[] bArr) {
        ge geVarM21235a = m28Var.m21235a();
        String strM21666i = m21666i(m28Var);
        if (geVarM21235a != null && geVarM21235a.m20907a() != null) {
            Map<String, String> mapM20907a = geVarM21235a.m20907a();
            String str = mapM20907a.get("layout_name");
            String str2 = mapM20907a.get("layout_value");
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(strM21666i);
                    int identifier = resourcesForApplication.getIdentifier(str, C3678q.f65834ni7, strM21666i);
                    if (identifier == 0) {
                        return null;
                    }
                    RemoteViews remoteViews = new RemoteViews(strM21666i, identifier);
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("text")) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject("text");
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                String string = jSONObject2.getString(next);
                                int identifier2 = resourcesForApplication.getIdentifier(next, "id", strM21666i);
                                if (identifier2 > 0) {
                                    remoteViews.setTextViewText(identifier2, string);
                                }
                            }
                        }
                        if (jSONObject.has("image")) {
                            JSONObject jSONObject3 = jSONObject.getJSONObject("image");
                            Iterator<String> itKeys2 = jSONObject3.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                String string2 = jSONObject3.getString(next2);
                                int identifier3 = resourcesForApplication.getIdentifier(next2, "id", strM21666i);
                                int identifier4 = resourcesForApplication.getIdentifier(string2, "drawable", strM21666i);
                                if (identifier3 > 0) {
                                    remoteViews.setImageViewResource(identifier3, identifier4);
                                }
                            }
                        }
                        if (jSONObject.has("time")) {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("time");
                            Iterator<String> itKeys3 = jSONObject4.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                String string3 = jSONObject4.getString(next3);
                                if (string3.length() == 0) {
                                    string3 = "yy-MM-dd hh:mm";
                                }
                                int identifier5 = resourcesForApplication.getIdentifier(next3, "id", strM21666i);
                                if (identifier5 > 0) {
                                    remoteViews.setTextViewText(identifier5, new SimpleDateFormat(string3).format(new Date(System.currentTimeMillis())));
                                }
                            }
                        }
                        return remoteViews;
                    } catch (JSONException e2) {
                        com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static void m21668l(Context context, String str) {
        if (!nc.m21313p(context) || f33831q == null || TextUtils.isEmpty(str)) {
            return;
        }
        f33831q.zy(str);
    }

    private static Intent ld6(Context context, String str, Map<String, String> map, String str2, String str3, String str4, String str5) {
        Intent launchIntentForPackage;
        Intent intent;
        String protocol;
        Intent uri;
        String str6 = map.get(str2);
        if (TextUtils.isEmpty(str6)) {
            return null;
        }
        if (dd.f33744k.equals(str6)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e2.getMessage());
                launchIntentForPackage = null;
            }
        } else if (dd.f73584toq.equals(str6)) {
            if (map.containsKey(str3)) {
                String str7 = map.get(str3);
                if (str7 != null) {
                    try {
                        uri = Intent.parseUri(str7, 1);
                    } catch (URISyntaxException e3) {
                        e = e3;
                        uri = null;
                    }
                    try {
                        uri.setPackage(str);
                    } catch (URISyntaxException e4) {
                        e = e4;
                        com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e.getMessage());
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey(str4)) {
                String str8 = map.get(str4);
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str8));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (dd.f73589zy.equals(str6)) {
                String str9 = map.get(str5);
                if (!TextUtils.isEmpty(str9)) {
                    String strTrim = str9.trim();
                    if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                        strTrim = "http://" + strTrim;
                    }
                    try {
                        protocol = new URL(strTrim).getProtocol();
                    } catch (MalformedURLException e6) {
                        e = e6;
                        intent = null;
                    }
                    if ("http".equals(protocol) || "https".equals(protocol)) {
                        intent = new Intent("android.intent.action.VIEW");
                        try {
                            intent.setData(Uri.parse(strTrim));
                            C5939t.n7h(context, str, intent);
                        } catch (MalformedURLException e7) {
                            e = e7;
                            com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e.getMessage());
                        }
                        launchIntentForPackage = intent;
                    }
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !nc.m21313p(context) && dd.f73589zy.equals(str6)) {
                    return launchIntentForPackage;
                }
                com.xiaomi.channel.commonutils.logger.zy.kja0("not resolve activity:" + launchIntentForPackage + "for buttons");
            } catch (Exception e8) {
                com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e8.getMessage());
            }
        }
        return null;
    }

    private static boolean lrht(Map<String, String> map) {
        if (map != null) {
            return "6".equals(map.get("notification_style_type"));
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("meta extra is null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[PHI: r0 r3
      0x0072: PHI (r0v4 java.lang.String) = (r0v2 java.lang.String), (r0v5 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r3v15 java.lang.String) = (r3v14 java.lang.String), (r3v21 java.lang.String) binds: [B:18:0x0070, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String[] lvui(android.content.Context r3, com.xiaomi.push.ge r4) {
        /*
            java.lang.String r0 = r4.m20924c()
            java.lang.String r1 = r4.m20928d()
            java.util.Map r4 = r4.m20907a()
            if (r4 == 0) goto L73
            android.content.res.Resources r2 = r3.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = (float) r2
            float r2 = r2 / r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r3
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            int r3 = r3.intValue()
            r2 = 320(0x140, float:4.48E-43)
            if (r3 > r2) goto L51
            java.lang.String r3 = "title_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L42
            r0 = r3
        L42:
            java.lang.String r3 = "description_short"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
            goto L72
        L51:
            r2 = 360(0x168, float:5.04E-43)
            if (r3 <= r2) goto L73
            java.lang.String r3 = "title_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L64
            r0 = r3
        L64:
            java.lang.String r3 = "description_long"
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L73
        L72:
            r1 = r3
        L73:
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.kja0.lvui(android.content.Context, com.xiaomi.push.ge):java.lang.String[]");
    }

    public static void mcp(Context context, LinkedList<? extends Object> linkedList) {
        if (linkedList == null || linkedList.size() <= 0) {
            return;
        }
        ek5k.m21580q(context, "category_clear_notification", "clear_notification", linkedList.size(), "");
    }

    /* JADX INFO: renamed from: n */
    private static Notification m21669n(Notification notification) {
        Object objM21413q = C5892r.m21413q(notification, "extraNotification");
        if (objM21413q != null) {
            C5892r.m21411n(objM21413q, "setCustomizedIcon", Boolean.TRUE);
        }
        return notification;
    }

    static void n5r1(Context context, String str, int i2) {
        context.getSharedPreferences("pref_notify_type", 0).edit().putInt(str, i2).commit();
    }

    public static Bitmap n7h(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 1;
        }
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight > 0 ? intrinsicHeight : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static String ncyb(m28 m28Var) {
        return oc(m28Var) ? "E100002" : m21662e(m28Var) ? "E100000" : m21661c(m28Var) ? "E100001" : nn86(m28Var) ? "E100003" : "";
    }

    private static void ni7(Context context, Intent intent, m28 m28Var, ge geVar, String str, int i2) {
        if (m28Var == null || geVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strFn3e = fn3e(geVar.m20907a(), i2);
        if (TextUtils.isEmpty(strFn3e)) {
            return;
        }
        if (dd.f33744k.equals(strFn3e) || dd.f73584toq.equals(strFn3e) || dd.f73589zy.equals(strFn3e)) {
            intent.putExtra("messageId", str);
            intent.putExtra("local_paid", m28Var.f33389a);
            if (!TextUtils.isEmpty(m28Var.f33393b)) {
                intent.putExtra("target_package", m28Var.f33393b);
            }
            intent.putExtra("job_key", zurt(geVar.m20907a(), "jobkey"));
            intent.putExtra(i2 + "_target_component", zy(context, m28Var.f33393b, geVar.m20907a(), i2));
        }
    }

    public static boolean nn86(m28 m28Var) {
        return m28Var.m21242a() == wwp.Registration;
    }

    public static void o1t(Context context, String str, int i2, int i3) {
        int iHashCode;
        if (context == null || TextUtils.isEmpty(str) || i2 < -1) {
            return;
        }
        wvg wvgVarM21784n = wvg.m21784n(context, str);
        List<StatusBarNotification> listO1t = wvgVarM21784n.o1t();
        if (y3.m22049q(listO1t)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        boolean z2 = false;
        if (i2 == -1) {
            z2 = true;
            iHashCode = 0;
        } else {
            iHashCode = ((str.hashCode() / 10) * 10) + i2;
        }
        Iterator<StatusBarNotification> it = listO1t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            StatusBarNotification next = it.next();
            if (!TextUtils.isEmpty(String.valueOf(next.getId()))) {
                int id = next.getId();
                if (z2) {
                    linkedList.add(next);
                    wvgVarM21784n.qrj(id);
                } else if (iHashCode == id) {
                    mu.toq(context, next, i3);
                    linkedList.add(next);
                    wvgVarM21784n.qrj(id);
                    break;
                }
            }
        }
        mcp(context, linkedList);
    }

    public static boolean oc(m28 m28Var) {
        ge geVarM21235a = m28Var.m21235a();
        return d3(geVarM21235a) && geVarM21235a.m20939l();
    }

    /* JADX INFO: renamed from: p */
    public static Intent m21670p(Context context, String str, Map<String, String> map, int i2) {
        if (lrht(map)) {
            return ld6(context, str, map, String.format("cust_btn_%s_ne", Integer.valueOf(i2)), String.format("cust_btn_%s_iu", Integer.valueOf(i2)), String.format("cust_btn_%s_ic", Integer.valueOf(i2)), String.format("cust_btn_%s_wu", Integer.valueOf(i2)));
        }
        if (i2 == 1) {
            return ld6(context, str, map, "notification_style_button_left_notify_effect", "notification_style_button_left_intent_uri", "notification_style_button_left_intent_class", "notification_style_button_left_web_uri");
        }
        if (i2 == 2) {
            return ld6(context, str, map, "notification_style_button_mid_notify_effect", "notification_style_button_mid_intent_uri", "notification_style_button_mid_intent_class", "notification_style_button_mid_web_uri");
        }
        if (i2 == 3) {
            return ld6(context, str, map, "notification_style_button_right_notify_effect", "notification_style_button_right_intent_uri", "notification_style_button_right_intent_class", "notification_style_button_right_web_uri");
        }
        if (i2 != 4) {
            return null;
        }
        return ld6(context, str, map, "notification_colorful_button_notify_effect", "notification_colorful_button_intent_uri", "notification_colorful_button_intent_class", "notification_colorful_button_web_uri");
    }

    /* JADX INFO: renamed from: q */
    private static int m21671q(Map<String, String> map) {
        String str = map == null ? null : map.get("timeout");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    private static Bitmap qrj(Context context, String str, boolean z2) {
        Future futureSubmit = f73632zy.submit(new CallableC5923k(str, context, z2));
        try {
            try {
                try {
                    Bitmap bitmap = (Bitmap) futureSubmit.get(180L, TimeUnit.SECONDS);
                    return bitmap == null ? bitmap : bitmap;
                } catch (ExecutionException e2) {
                    com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                    futureSubmit.cancel(true);
                    return null;
                }
            } catch (InterruptedException e3) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e3);
                futureSubmit.cancel(true);
                return null;
            } catch (TimeoutException e4) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e4);
                futureSubmit.cancel(true);
                return null;
            }
        } finally {
            futureSubmit.cancel(true);
        }
    }

    /* JADX INFO: renamed from: r */
    private static int m21672r(Context context, String str) {
        int qVar = toq(context, str, "mipush_notification");
        int qVar2 = toq(context, str, "mipush_small_notification");
        if (qVar <= 0) {
            qVar = qVar2 > 0 ? qVar2 : context.getApplicationInfo().icon;
        }
        return qVar == 0 ? context.getApplicationInfo().logo : qVar;
    }

    /* JADX INFO: renamed from: s */
    public static ComponentName m21673s(String str) {
        return new ComponentName(str, "com.xiaomi.mipush.sdk.NotificationClickedActivity");
    }

    /* JADX INFO: renamed from: t */
    public static void m21674t(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        wvg wvgVarM21784n = wvg.m21784n(context, str);
        List<StatusBarNotification> listO1t = wvgVarM21784n.o1t();
        if (y3.m22049q(listO1t)) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (StatusBarNotification statusBarNotification : listO1t) {
            Notification notification = statusBarNotification.getNotification();
            if (notification != null && !TextUtils.isEmpty(String.valueOf(statusBarNotification.getId()))) {
                int id = statusBarNotification.getId();
                String strM21766y = C5939t.m21766y(notification);
                String strZurt = C5939t.zurt(notification);
                if (!TextUtils.isEmpty(strM21766y) && !TextUtils.isEmpty(strZurt) && eqxt(strM21766y, str2) && eqxt(strZurt, str3)) {
                    linkedList.add(statusBarNotification);
                    wvgVarM21784n.qrj(id);
                }
            }
        }
        mcp(context, linkedList);
    }

    private static String t8r(Context context, String str, Map<String, String> map) {
        return (map == null || TextUtils.isEmpty(map.get("channel_name"))) ? uf.n7h(context, str) : map.get("channel_name");
    }

    private static int toq(Context context, String str, String str2) {
        if (str.equals(context.getPackageName())) {
            return context.getResources().getIdentifier(str2, "drawable", str);
        }
        return 0;
    }

    private static int uv6(Map<String, String> map) {
        if (map == null) {
            return 0;
        }
        String str = map.get("notification_priority");
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("priority=" + str);
            return Integer.parseInt(str);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("parsing notification priority error: " + e2);
            return 0;
        }
    }

    static void vyq(Context context, String str) {
        context.getSharedPreferences("pref_notify_type", 0).edit().remove(str).commit();
    }

    private static void wvg(Context context, String str, vy vyVar, Map<String, String> map) {
        int qVar = toq(context, str, "mipush_small_notification");
        int qVar2 = toq(context, str, "mipush_notification");
        if (nc.m21313p(context)) {
            if (qVar <= 0 || qVar2 <= 0) {
                hyr(context, str, vyVar, map);
                return;
            } else {
                vyVar.setSmallIcon(qVar);
                vyVar.setLargeIcon(x2(context, qVar2));
                return;
            }
        }
        if (qVar > 0) {
            vyVar.setSmallIcon(qVar);
        } else {
            hyr(context, str, vyVar, map);
        }
        if (qVar2 > 0) {
            vyVar.setLargeIcon(x2(context, qVar2));
        }
    }

    private static Bitmap x2(Context context, int i2) {
        return n7h(context.getResources().getDrawable(i2));
    }

    public static Intent x9kr(Context context, String str, Map<String, String> map, int i2) {
        Intent launchIntentForPackage;
        String str2;
        Intent intent;
        String protocol;
        Intent uri;
        if (map == null) {
            return null;
        }
        if (i2 != 0) {
            return m21670p(context, str, map, i2);
        }
        if (!map.containsKey("notify_effect")) {
            return null;
        }
        String str3 = map.get("notify_effect");
        int i3 = -1;
        String str4 = map.get("intent_flag");
        try {
            if (!TextUtils.isEmpty(str4)) {
                i3 = Integer.parseInt(str4);
            }
        } catch (NumberFormatException e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk("Cause by intent_flag: " + e2.getMessage());
        }
        if (dd.f33744k.equals(str3)) {
            try {
                launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
            } catch (Exception e3) {
                com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e3.getMessage());
                launchIntentForPackage = null;
            }
        } else if (dd.f73584toq.equals(str3)) {
            if (map.containsKey("intent_uri")) {
                String str5 = map.get("intent_uri");
                if (str5 != null) {
                    try {
                        uri = Intent.parseUri(str5, 1);
                    } catch (URISyntaxException e4) {
                        e = e4;
                        uri = null;
                    }
                    try {
                        uri.setPackage(str);
                    } catch (URISyntaxException e6) {
                        e = e6;
                        com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e.getMessage());
                    }
                    launchIntentForPackage = uri;
                }
            } else if (map.containsKey("class_name")) {
                String str6 = map.get("class_name");
                intent = new Intent();
                intent.setComponent(new ComponentName(str, str6));
                launchIntentForPackage = intent;
            }
            launchIntentForPackage = null;
        } else {
            if (dd.f73589zy.equals(str3) && (str2 = map.get("web_uri")) != null) {
                String strTrim = str2.trim();
                if (!strTrim.startsWith("http://") && !strTrim.startsWith("https://")) {
                    strTrim = "http://" + strTrim;
                }
                try {
                    protocol = new URL(strTrim).getProtocol();
                } catch (MalformedURLException e7) {
                    e = e7;
                    intent = null;
                }
                if ("http".equals(protocol) || "https".equals(protocol)) {
                    intent = new Intent("android.intent.action.VIEW");
                    try {
                        intent.setData(Uri.parse(strTrim));
                        C5939t.n7h(context, str, intent);
                    } catch (MalformedURLException e8) {
                        e = e8;
                        com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e.getMessage());
                    }
                    launchIntentForPackage = intent;
                }
            }
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            if (i3 >= 0) {
                launchIntentForPackage.setFlags(i3);
            }
            jk(launchIntentForPackage);
            launchIntentForPackage.addFlags(268435456);
            try {
                if (context.getPackageManager().resolveActivity(launchIntentForPackage, 65536) != null) {
                    return launchIntentForPackage;
                }
                if (Build.VERSION.SDK_INT >= 30 && !nc.m21313p(context) && dd.f73589zy.equals(str3)) {
                    return launchIntentForPackage;
                }
                com.xiaomi.channel.commonutils.logger.zy.kja0("not resolve activity:" + launchIntentForPackage);
            } catch (Exception e9) {
                com.xiaomi.channel.commonutils.logger.zy.jk("Cause: " + e9.getMessage());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static PendingIntent m21675y(Context context, String str, m28 m28Var, byte[] bArr, int i2, int i3) {
        Map<String, String> mapM20907a = m28Var.m21235a().m20907a();
        if (mapM20907a == null) {
            return null;
        }
        boolean zFti = fti(context, m28Var, str);
        if (zFti) {
            return f7l8(context, m28Var, str, bArr, i2, i3, zFti);
        }
        Intent intentM21670p = m21670p(context, str, mapM20907a, i3);
        if (intentM21670p != null) {
            return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, intentM21670p, 167772160) : PendingIntent.getActivity(context, 0, intentM21670p, 134217728);
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    public static void m21676z(Context context, String str, int i2) {
        o1t(context, str, i2, -1);
    }

    private static String zurt(Map<String, String> map, String str) {
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private static int zy(Context context, String str, Map<String, String> map, int i2) {
        ComponentName componentNameM21778k;
        Intent intentX9kr = x9kr(context, str, map, i2);
        if (intentX9kr == null || (componentNameM21778k = was.m21778k(context, intentX9kr)) == null) {
            return 0;
        }
        return componentNameM21778k.hashCode();
    }
}
