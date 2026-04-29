package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.brv;
import com.xiaomi.push.m8;
import com.xiaomi.push.xouc;
import v5yj.C7704k;

/* JADX INFO: loaded from: classes3.dex */
public class etdu {

    /* JADX INFO: renamed from: k */
    private static v0af f33777k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static InterfaceC5913k f73609toq;

    /* JADX INFO: renamed from: com.xiaomi.push.service.etdu$k */
    public interface InterfaceC5913k {
        /* JADX INFO: renamed from: a */
        void mo21603a();
    }

    public static void f7l8(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f33777k = null;
        m21596g();
    }

    /* JADX INFO: renamed from: g */
    public static void m21596g() {
        InterfaceC5913k interfaceC5913k = f73609toq;
        if (interfaceC5913k != null) {
            interfaceC5913k.mo21603a();
        }
    }

    /* JADX INFO: renamed from: k */
    private static int m21597k(Context context) {
        return context.getSharedPreferences("mipush_account", 0).getInt("enc_req_fail_count", 0);
    }

    private static boolean ld6(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* JADX INFO: renamed from: n */
    private static String m21598n(Context context, boolean z2) {
        String qVar = C5926m.m21688k(context).toq();
        String str = z2 ? "/pass/v2/register/encrypt" : "/pass/v2/register";
        if (xouc.m22025q()) {
            return "http://10.38.162.35:9085" + str;
        }
        if (!brv.China.name().equals(qVar)) {
            return null;
        }
        return "https://cn.register.xmpush.xiaomi.com" + str;
    }

    /* JADX INFO: renamed from: p */
    public static void m21599p(InterfaceC5913k interfaceC5913k) {
        f73609toq = interfaceC5913k;
    }

    /* JADX INFO: renamed from: q */
    public static String m21600q(Context context) {
        v0af qVar = toq(context);
        if (qVar != null && !TextUtils.isEmpty(qVar.f33918k)) {
            String[] strArrSplit = qVar.f33918k.split("@");
            if (strArrSplit.length > 0) {
                return strArrSplit[0];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static void m21601s(Context context, v0af v0afVar) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putString("uuid", v0afVar.f33918k);
        editorEdit.putString("security", v0afVar.f73673zy);
        editorEdit.putString("token", v0afVar.f73672toq);
        editorEdit.putString("app_id", v0afVar.f33920q);
        editorEdit.putString("package_name", v0afVar.f33917g);
        editorEdit.putString("app_token", v0afVar.f33919n);
        editorEdit.putString(C7704k.q.f95561ni7, m8.o1t(context));
        editorEdit.putInt("env_type", v0afVar.f73671f7l8);
        editorEdit.commit();
        m21596g();
    }

    public static synchronized v0af toq(Context context) {
        v0af v0afVar = f33777k;
        if (v0afVar != null) {
            return v0afVar;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
        String string = sharedPreferences.getString("uuid", null);
        String string2 = sharedPreferences.getString("token", null);
        String string3 = sharedPreferences.getString("security", null);
        String string4 = sharedPreferences.getString("app_id", null);
        String string5 = sharedPreferences.getString("app_token", null);
        String string6 = sharedPreferences.getString("package_name", null);
        String string7 = sharedPreferences.getString(C7704k.q.f95561ni7, null);
        int i2 = sharedPreferences.getInt("env_type", 1);
        if (!TextUtils.isEmpty(string7) && m8.qrj(string7)) {
            string7 = m8.o1t(context);
            sharedPreferences.edit().putString(C7704k.q.f95561ni7, string7).commit();
        }
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
            return null;
        }
        String strO1t = m8.o1t(context);
        if (!"com.xiaomi.xmsf".equals(context.getPackageName()) && !TextUtils.isEmpty(strO1t) && !TextUtils.isEmpty(string7) && !string7.equals(strO1t)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("read_phone_state permission changes.");
        }
        v0af v0afVar2 = new v0af(string, string2, string3, string4, string5, string6, i2);
        f33777k = v0afVar2;
        return v0afVar2;
    }

    /* JADX INFO: renamed from: y */
    private static void m21602y(Context context, int i2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("mipush_account", 0).edit();
        editorEdit.putInt("enc_req_fail_count", i2);
        editorEdit.commit();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[Catch: all -> 0x032a, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:12:0x0044, B:16:0x0057, B:20:0x0063, B:24:0x006f, B:25:0x0079, B:31:0x008d, B:33:0x0096, B:35:0x00be, B:37:0x00ca, B:38:0x00dd, B:40:0x00e7, B:42:0x00ed, B:43:0x0101, B:45:0x0107, B:46:0x010c, B:48:0x012f, B:49:0x0138, B:50:0x016f, B:52:0x0175, B:53:0x017c, B:56:0x018b, B:57:0x01bc, B:59:0x01dc, B:62:0x01e3, B:64:0x01fa, B:70:0x0209, B:76:0x0227, B:78:0x022d, B:99:0x02e4, B:105:0x0315, B:107:0x031b, B:108:0x0323, B:102:0x02fc, B:74:0x0210, B:28:0x0085), top: B:116:0x0005, inners: #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be A[Catch: all -> 0x032a, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:12:0x0044, B:16:0x0057, B:20:0x0063, B:24:0x006f, B:25:0x0079, B:31:0x008d, B:33:0x0096, B:35:0x00be, B:37:0x00ca, B:38:0x00dd, B:40:0x00e7, B:42:0x00ed, B:43:0x0101, B:45:0x0107, B:46:0x010c, B:48:0x012f, B:49:0x0138, B:50:0x016f, B:52:0x0175, B:53:0x017c, B:56:0x018b, B:57:0x01bc, B:59:0x01dc, B:62:0x01e3, B:64:0x01fa, B:70:0x0209, B:76:0x0227, B:78:0x022d, B:99:0x02e4, B:105:0x0315, B:107:0x031b, B:108:0x0323, B:102:0x02fc, B:74:0x0210, B:28:0x0085), top: B:116:0x0005, inners: #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f A[Catch: all -> 0x032a, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:12:0x0044, B:16:0x0057, B:20:0x0063, B:24:0x006f, B:25:0x0079, B:31:0x008d, B:33:0x0096, B:35:0x00be, B:37:0x00ca, B:38:0x00dd, B:40:0x00e7, B:42:0x00ed, B:43:0x0101, B:45:0x0107, B:46:0x010c, B:48:0x012f, B:49:0x0138, B:50:0x016f, B:52:0x0175, B:53:0x017c, B:56:0x018b, B:57:0x01bc, B:59:0x01dc, B:62:0x01e3, B:64:0x01fa, B:70:0x0209, B:76:0x0227, B:78:0x022d, B:99:0x02e4, B:105:0x0315, B:107:0x031b, B:108:0x0323, B:102:0x02fc, B:74:0x0210, B:28:0x0085), top: B:116:0x0005, inners: #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0175 A[Catch: all -> 0x032a, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0005, B:6:0x001a, B:8:0x0022, B:10:0x0038, B:12:0x0044, B:16:0x0057, B:20:0x0063, B:24:0x006f, B:25:0x0079, B:31:0x008d, B:33:0x0096, B:35:0x00be, B:37:0x00ca, B:38:0x00dd, B:40:0x00e7, B:42:0x00ed, B:43:0x0101, B:45:0x0107, B:46:0x010c, B:48:0x012f, B:49:0x0138, B:50:0x016f, B:52:0x0175, B:53:0x017c, B:56:0x018b, B:57:0x01bc, B:59:0x01dc, B:62:0x01e3, B:64:0x01fa, B:70:0x0209, B:76:0x0227, B:78:0x022d, B:99:0x02e4, B:105:0x0315, B:107:0x031b, B:108:0x0323, B:102:0x02fc, B:74:0x0210, B:28:0x0085), top: B:116:0x0005, inners: #2, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0204 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0206  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized com.xiaomi.push.service.v0af zy(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.etdu.zy(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.v0af");
    }
}
