package com.android.thememanager.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeResourceProxyTabActivity;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.InterfaceC1707q;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.fn3e;
import com.android.thememanager.basemodule.utils.jk;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.fu4;
import com.android.thememanager.model.LargeIconElementRuntime;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.m4;
import com.android.thememanager.util.nn86;
import com.google.gson.C4923s;
import com.xiaomi.onetrack.util.ac;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import retrofit2.C7639i;

/* JADX INFO: compiled from: ThemeTaskService.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki implements com.android.thememanager.basemodule.analysis.ld6, InterfaceC1789q {

    /* JADX INFO: renamed from: g */
    public static final String f14822g = "delete_refresh_reminder_notifaction";

    /* JADX INFO: renamed from: k */
    private static final String f14823k = "ThemeTaskService";

    /* JADX INFO: renamed from: n */
    public static final String f14824n = "last_check_update_time";

    /* JADX INFO: renamed from: p */
    public static final int f14825p = 74565;

    /* JADX INFO: renamed from: q */
    public static final String f14826q = "com.android.thememanager.ClearFreshReminder";

    /* JADX INFO: renamed from: s */
    public static final int f14827s = 344865;

    /* JADX INFO: renamed from: y */
    public static final int f14828y = 86400000;

    public static Map<String, Object> f7l8() {
        String strM8937n = m8937n();
        String strM8935g = m8935g();
        String strM7235z = vyq.m7235z("wallpaper");
        String strFu4 = vyq.fu4("wallpaper");
        String strM7235z2 = vyq.m7235z("ringtone");
        String strFu42 = vyq.fu4("ringtone");
        String strM7235z3 = vyq.m7235z("fonts");
        String strFu43 = vyq.fu4("fonts");
        String strM7235z4 = vyq.m7235z("miwallpaper");
        String strFu44 = vyq.fu4("miwallpaper");
        String strM7235z5 = vyq.m7235z("videowallpaper");
        String strFu45 = vyq.fu4("videowallpaper");
        String strM7235z6 = vyq.m7235z("aod");
        String strFu46 = vyq.fu4("aod");
        String strM7235z7 = vyq.m7235z("icons");
        String strFu47 = vyq.fu4("icons");
        String qVar = m4.toq(com.android.thememanager.controller.cdj.f57896toq);
        String strZy = com.android.thememanager.superwallpaper.util.zy.zy();
        String strValueOf = String.valueOf(TextUtils.isEmpty(C1807g.qrj()));
        String strValueOf2 = String.valueOf(lvui.jp0y());
        String strValueOf3 = String.valueOf(com.android.thememanager.basemodule.privacy.x2.f7l8());
        String strM8938q = m8938q();
        HashMap map = new HashMap();
        map.put(com.android.thememanager.basemodule.analysis.ld6.m7, g1.m9753q(strM8937n));
        map.put(com.android.thememanager.basemodule.analysis.ld6.u9l, g1.m9753q(strM8935g));
        map.put(com.android.thememanager.basemodule.analysis.ld6.frtx, g1.m9753q(strM7235z));
        map.put(com.android.thememanager.basemodule.analysis.ld6.wj7e, g1.m9753q(strFu4));
        map.put(com.android.thememanager.basemodule.analysis.ld6.que, g1.m9753q(strM7235z2));
        map.put(com.android.thememanager.basemodule.analysis.ld6.iobz, g1.m9753q(strFu42));
        map.put(com.android.thememanager.basemodule.analysis.ld6.kes, g1.m9753q(strM7235z3));
        map.put(com.android.thememanager.basemodule.analysis.ld6.l8s, g1.m9753q(strFu43));
        map.put(com.android.thememanager.basemodule.analysis.ld6.jv24, g1.m9753q(strM7235z4));
        map.put(com.android.thememanager.basemodule.analysis.ld6.q8d, g1.m9753q(strFu44));
        map.put(com.android.thememanager.basemodule.analysis.ld6.xa, g1.m9753q(strM7235z5));
        map.put(com.android.thememanager.basemodule.analysis.ld6.y1, g1.m9753q(strFu45));
        map.put(com.android.thememanager.basemodule.analysis.ld6.xxxc, g1.m9753q(strM7235z6));
        map.put(com.android.thememanager.basemodule.analysis.ld6.wyfv, g1.m9753q(strFu46));
        map.put(com.android.thememanager.basemodule.analysis.ld6.ygmb, g1.m9753q(strM7235z7));
        map.put(com.android.thememanager.basemodule.analysis.ld6.t00, g1.m9753q(strFu47));
        map.put(com.android.thememanager.basemodule.analysis.ld6.d0q9, g1.m9753q(qVar));
        map.put(com.android.thememanager.basemodule.analysis.ld6.upz, g1.m9753q(strZy));
        map.put(com.android.thememanager.basemodule.analysis.ld6.sval, g1.m9753q(strValueOf));
        map.put(com.android.thememanager.basemodule.analysis.ld6.zio, g1.m9753q(strValueOf2));
        map.put(com.android.thememanager.basemodule.analysis.ld6.ku, g1.m9753q(strValueOf3));
        map.put("largeicons", g1.m9753q(strM8938q));
        return map;
    }

    /* JADX INFO: renamed from: g */
    private static String m8935g() {
        return vyq.fu4("theme");
    }

    /* JADX INFO: renamed from: k */
    private static boolean m8936k(Context context) {
        if (!com.android.thememanager.util.toq.m10010g(context)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - com.android.thememanager.util.toq.m10013p(context);
        Log.d(C2755a.f16307g, "fresh reminder interval： " + (((jCurrentTimeMillis / 1000) / 3600) / 24) + " days");
        return jCurrentTimeMillis > ac.f32265a && mcp.f7l8() && !PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f14822g, false);
    }

    /* JADX INFO: renamed from: n */
    private static String m8937n() {
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g("theme");
        String strNi7 = vyq.ni7("theme");
        if (TextUtils.isEmpty(strNi7)) {
            return vyq.m7235z("theme");
        }
        Resource resourceMo6852k = null;
        try {
            resourceMo6852k = new com.android.thememanager.controller.local.ki(fu4VarM10535g).mo6852k(new File(strNi7));
        } catch (C1743g e2) {
            Log.w(f14823k, "fail load runtime theme path", e2);
        }
        return resourceMo6852k == null ? vyq.m7235z("theme") : g1.mcp(fu4VarM10535g.getResourceCode(), resourceMo6852k);
    }

    /* JADX INFO: renamed from: q */
    private static String m8938q() {
        try {
            String qVar = fn3e.toq(false);
            if (qVar == null) {
                Log.i(f14823k, "createLargeIconData: currentMode is null");
                return null;
            }
            HashMap<String, LargeIconElementRuntime> mapM9918g = nn86.m9915q(qVar).m9923y().m9918g();
            if (mapM9918g == null) {
                Log.i(f14823k, "createLargeIconData: currentMode map is null," + qVar);
                return null;
            }
            C4923s c4923s = new C4923s();
            Iterator<String> it = mapM9918g.keySet().iterator();
            while (it.hasNext()) {
                LargeIconElementRuntime largeIconElementRuntime = mapM9918g.get(it.next());
                if (largeIconElementRuntime != null) {
                    com.google.gson.kja0 kja0Var = new com.google.gson.kja0();
                    kja0Var.wvg(com.android.thememanager.basemodule.analysis.ld6.jn, largeIconElementRuntime.uuid);
                    kja0Var.wvg(com.android.thememanager.basemodule.analysis.ld6.ihvk, largeIconElementRuntime.resourceName);
                    kja0Var.wvg(com.android.thememanager.basemodule.analysis.ld6.tdsa, largeIconElementRuntime.size);
                    kja0Var.wvg("app_package_name", largeIconElementRuntime.packageName);
                    c4923s.ni7(kja0Var);
                }
            }
            return c4923s.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m8939s() {
        try {
            Map<String, Object> mapF7l8 = f7l8();
            com.android.thememanager.basemodule.analysis.zy.m6681q(mapF7l8);
            JSONObject jSONObject = new JSONObject();
            for (String str : mapF7l8.keySet()) {
                jSONObject.put(str, mapF7l8.get(str));
            }
            C7639i<EmptyResponse> c7639iF7l8 = ((InterfaceC1707q) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(InterfaceC1707q.class)).m6657k(InterfaceC1925p.blsz, jSONObject.toString()).f7l8();
            StringBuilder sb = new StringBuilder();
            sb.append("uploadDailyDataTask result: ");
            sb.append(c7639iF7l8.m27986k() != null ? Integer.valueOf(c7639iF7l8.m27986k().apiCode) : "fail");
            Log.i(f14823k, sb.toString());
            C1708s.f7l8().ld6().n5r1(InterfaceC1925p.blsz, mapF7l8);
        } catch (Exception e2) {
            Log.e(f14823k, "fail to request daily data : " + e2);
        }
    }

    public static void toq(Context context) {
        if (m8936k(context)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addFlags(268468224);
            intent.setAction(ThemeResourceProxyTabActivity.bl);
            intent.setPackage(bf2.toq.toq().getPackageName());
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 1275068416);
            Intent intent2 = new Intent(f14826q);
            intent2.setClass(context, ThemeTaskReceiver.class);
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 1275068416);
            Notification.Builder builder = new Notification.Builder(context);
            builder.setSmallIcon(R.drawable.notification_small_icon).setContentTitle(context.getString(R.string.local_notification_default_title)).setContentText(context.getString(R.string.theme_fresh_man_notifaction)).setContentIntent(activity).setDeleteIntent(broadcast).setAutoCancel(true);
            jk.m7104n(context, f14827s, builder);
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m8940y() {
        return f14825p;
    }

    public static void zy(Context context, Intent intent) {
        if (!(intent != null)) {
            ((NotificationManager) context.getSystemService(com.android.thememanager.basemodule.analysis.toq.mle)).cancel(f14827s);
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        if (defaultSharedPreferences.getBoolean(f14822g, false)) {
            return;
        }
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putBoolean(f14822g, true);
        editorEdit.apply();
    }
}
