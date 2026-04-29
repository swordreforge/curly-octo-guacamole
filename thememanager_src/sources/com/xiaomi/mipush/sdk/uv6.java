package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.xiaomi.push.C5872k;
import com.xiaomi.push.C5874l;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.C5892r;
import com.xiaomi.push.l7o;
import com.xiaomi.push.m28;
import com.xiaomi.push.wu;
import com.xiaomi.push.y3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class uv6 {
    public static boolean cdj(hyr hyrVar) {
        return hyrVar == hyr.ASSEMBLE_PUSH_FTOS || hyrVar == hyr.ASSEMBLE_PUSH_FCM;
    }

    public static String f7l8(hyr hyrVar) {
        int i2 = C5647e.f31343k[hyrVar.ordinal()];
        if (i2 == 1) {
            return "hms_push_token";
        }
        if (i2 == 2) {
            return "fcm_push_token_v2";
        }
        if (i2 == 3) {
            return "cos_push_token";
        }
        if (i2 != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    public static void fn3e(Context context) {
        C5648f.m19438n(context).toq();
    }

    public static void fu4(Context context) {
        C5648f.m19438n(context).mo19439k();
    }

    /* JADX INFO: renamed from: g */
    protected static synchronized String m19557g(Context context, hyr hyrVar, boolean z2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        if (z2) {
            String string = sharedPreferences.getString("syncingToken", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        String strF7l8 = f7l8(hyrVar);
        if (TextUtils.isEmpty(strF7l8)) {
            return "";
        }
        return sharedPreferences.getString(strF7l8, "");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m19558h(Context context, hyr hyrVar) {
        if (nn86.zy(hyrVar) != null) {
            return com.xiaomi.push.service.a9.m21550q(context).qrj(nn86.zy(hyrVar).m21370a(), true);
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static String m19559i(hyr hyrVar) {
        return f7l8(hyrVar) + "_version";
    }

    /* JADX INFO: renamed from: k */
    public static int m19560k() {
        Integer num = (Integer) C5892r.m21409g("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean ki(m28 m28Var, hyr hyrVar) {
        if (m28Var == null || m28Var.m21235a() == null || m28Var.m21235a().m20907a() == null) {
            return false;
        }
        return (hyrVar == hyr.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase(m28Var.m21235a().m20907a().get("assemble_push_type"));
    }

    public static boolean kja0(Context context) {
        if (context == null) {
            return false;
        }
        return com.xiaomi.push.oc.zurt(context);
    }

    public static void ld6(Context context, hyr hyrVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int qVar = toq(context, hyrVar, str);
        if (qVar == 0) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : do not need to send token");
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : send token upload, check:" + qVar);
        x2(context, str);
        dd ddVarM19529k = nn86.m19529k(hyrVar);
        if (ddVarM19529k == null) {
            return;
        }
        d3.m19429y(context).a9(null, ddVarM19529k, hyrVar, "upload");
    }

    /* JADX INFO: renamed from: n */
    static String m19561n(Context context, hyr hyrVar) {
        return m19557g(context, hyrVar, false);
    }

    public static void n7h(String str, int i2) {
        C5652i.m19467q("hms_push_error", str, 1L, "error code = " + i2);
    }

    public static String ni7(hyr hyrVar) {
        int i2 = C5647e.f31343k[hyrVar.ordinal()];
        if (i2 == 1) {
            return "hms_push_error";
        }
        if (i2 == 2) {
            return "fcm_push_error";
        }
        if (i2 == 3) {
            return "cos_push_error";
        }
        if (i2 != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void o1t(Context context, hyr hyrVar, String str) {
        String strF7l8 = f7l8(hyrVar);
        if (TextUtils.isEmpty(strF7l8)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString(strF7l8, str).putString("last_check_token", C5656l.m19500q(context).m19503i());
        if (cdj(hyrVar)) {
            editorEdit.putInt(m19559i(hyrVar), m19560k());
        }
        editorEdit.putString("syncingToken", "");
        l7o.m21152k(editorEdit);
        com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : update sp file success!  " + str);
    }

    /* JADX INFO: renamed from: p */
    public static void m19562p(Context context, hyr hyrVar) {
        String strF7l8 = f7l8(hyrVar);
        if (TextUtils.isEmpty(strF7l8)) {
            return;
        }
        l7o.m21152k(context.getSharedPreferences("mipush_extra", 0).edit().putString(strF7l8, ""));
    }

    /* JADX INFO: renamed from: q */
    protected static PushMessageReceiver m19563q(Context context) {
        ResolveInfo next;
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (listQueryBroadcastReceivers != null) {
                Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    next = it.next();
                    ActivityInfo activityInfo = next.activityInfo;
                    if (activityInfo != null && activityInfo.packageName.equals(context.getPackageName())) {
                        break;
                    }
                }
                next = null;
            } else {
                next = null;
            }
            if (next != null) {
                return (PushMessageReceiver) wu.zy(context, next.activityInfo.name).newInstance();
            }
            return null;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.jk(e2.toString());
            return null;
        }
    }

    public static void qrj(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("pushMsg")) {
            return;
        }
        intent.putExtra(zurt.f31450p, zy(extras.getString("pushMsg")));
    }

    /* JADX INFO: renamed from: s */
    static void m19564s(Context context) {
        boolean z2 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strF7l8 = f7l8(hyr.ASSEMBLE_PUSH_HUAWEI);
        String strF7l82 = f7l8(hyr.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(strF7l8, "")) && TextUtils.isEmpty(sharedPreferences.getString(strF7l82, ""))) {
            z2 = true;
        }
        if (z2) {
            d3.m19429y(context).m19430h(2, strF7l8);
        }
    }

    public static byte[] t8r(Context context, m28 m28Var, hyr hyrVar) {
        if (ki(m28Var, hyrVar)) {
            return C5874l.zy(m19561n(context, hyrVar));
        }
        return null;
    }

    private static int toq(Context context, hyr hyrVar, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String strF7l8 = f7l8(hyrVar);
        String string = sharedPreferences.getString(strF7l8, "");
        String strM19503i = C5656l.m19500q(context).m19503i();
        String string2 = sharedPreferences.getString("last_check_token", "");
        if (TextUtils.isEmpty(strF7l8)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            return 0;
        }
        if (TextUtils.isEmpty(string)) {
            return 1;
        }
        if (!string.equals(str)) {
            return 2;
        }
        if (!TextUtils.equals(strM19503i, string2)) {
            return 3;
        }
        if (cdj(hyrVar)) {
            if (m19560k() != sharedPreferences.getInt(m19559i(hyrVar), 0)) {
                return 4;
            }
        }
        return 0;
    }

    private static synchronized void x2(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_extra", 0).edit();
        editorEdit.putString("syncingToken", str);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: y */
    public static HashMap<String, String> m19565y(Context context, hyr hyrVar) {
        HashMap<String, String> map = new HashMap<>();
        int i2 = C5647e.f31343k[hyrVar.ordinal()];
        String string = null;
        ApplicationInfo applicationInfo = null;
        if (i2 == 1) {
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk(e2.toString());
            }
            string = new y3.C5965k(":", C5658n.f73167eqxt).m22050k(C5658n.f73170fti, wvg.HUAWEI.name()).m22050k("token", m19557g(context, hyrVar, true)).m22050k("package_name", context.getPackageName()).m22050k("app_id", Integer.valueOf(applicationInfo != null ? applicationInfo.metaData.getInt(C5658n.f73164d2ok) : -1)).toString();
        } else if (i2 == 2) {
            y3.C5965k c5965kM22050k = new y3.C5965k(":", C5658n.f73167eqxt).m22050k(C5658n.f73170fti, wvg.FCM.name()).m22050k("token", m19557g(context, hyrVar, false)).m22050k("package_name", context.getPackageName());
            int iM19560k = m19560k();
            if (iM19560k != 0) {
                c5965kM22050k.m22050k("version", Integer.valueOf(iM19560k));
            } else {
                c5965kM22050k.m22050k("version", Integer.valueOf(C5872k.f33109n));
            }
            string = c5965kM22050k.toString();
        } else if (i2 == 3) {
            string = new y3.C5965k(":", C5658n.f73167eqxt).m22050k(C5658n.f73170fti, wvg.OPPO.name()).m22050k("token", m19557g(context, hyrVar, true)).m22050k("package_name", context.getPackageName()).toString();
        } else if (i2 == 4) {
            y3.C5965k c5965kM22050k2 = new y3.C5965k(":", C5658n.f73167eqxt).m22050k(C5658n.f73170fti, wvg.VIVO.name()).m22050k("token", m19557g(context, hyrVar, true)).m22050k("package_name", context.getPackageName());
            int iM19560k2 = m19560k();
            if (iM19560k2 != 0) {
                c5965kM22050k2.m22050k("version", Integer.valueOf(iM19560k2));
            }
            string = c5965kM22050k2.toString();
        }
        map.put(C5658n.f73173jk, string);
        return map;
    }

    public static void zurt(Context context, hyr hyrVar, String str) {
        C5889p.toq(context).f7l8(new vyq(str, context, hyrVar));
    }

    public static MiPushMessage zy(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has("title")) {
                    miPushMessage.setTitle(jSONObject.getString("title"));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has(InterfaceC1925p.j60k)) {
                    miPushMessage.setMessageType(jSONObject.getInt(InterfaceC1925p.j60k));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has("notifyId")) {
                    miPushMessage.setNotifyId(jSONObject.getInt("notifyId"));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                if (jSONObject.has("extra")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("extra");
                    Iterator<String> itKeys = jSONObject2.keys();
                    HashMap map = new HashMap();
                    while (itKeys != null && itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObject2.getString(next));
                    }
                    if (map.size() > 0) {
                        miPushMessage.setExtra(map);
                    }
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk(e2.toString());
            }
        }
        return miPushMessage;
    }
}
