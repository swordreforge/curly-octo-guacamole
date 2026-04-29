package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.C5872k;
import com.xiaomi.push.nc;
import com.xiaomi.push.service.eqxt;
import com.xiaomi.push.uf;
import com.xiaomi.push.wu;
import com.xiaomi.push.y3;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class v0af {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final int f73671f7l8;

    /* JADX INFO: renamed from: g */
    public final String f33917g;

    /* JADX INFO: renamed from: k */
    public final String f33918k;

    /* JADX INFO: renamed from: n */
    public final String f33919n;

    /* JADX INFO: renamed from: q */
    public final String f33920q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f73672toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f73673zy;

    public v0af(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        this.f33918k = str;
        this.f73672toq = str2;
        this.f73673zy = str3;
        this.f33920q = str4;
        this.f33919n = str5;
        this.f33917g = str6;
        this.f73671f7l8 = i2;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m21769g(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    /* JADX INFO: renamed from: n */
    public static boolean m21770n(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && m21771q();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m21771q() {
        try {
            return wu.zy(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    private static String zy(Context context) {
        if (!"com.xiaomi.xmsf".equals(context)) {
            return nc.n7h();
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        String strF7l8 = nc.f7l8("ro.miui.region");
        return TextUtils.isEmpty(strF7l8) ? nc.f7l8("ro.product.locale.region") : strF7l8;
    }

    /* JADX INFO: renamed from: k */
    public eqxt.toq m21772k(XMPushService xMPushService) {
        eqxt.toq toqVar = new eqxt.toq(xMPushService);
        toq(toqVar, xMPushService, xMPushService.m21540b(), "c");
        return toqVar;
    }

    public eqxt.toq toq(eqxt.toq toqVar, Context context, d8wk d8wkVar, String str) {
        toqVar.f33761k = context.getPackageName();
        toqVar.f73603toq = this.f33918k;
        toqVar.f33765s = this.f73673zy;
        toqVar.f73606zy = this.f73672toq;
        toqVar.f33766y = "5";
        toqVar.f33764q = "XMPUSH-PASS";
        toqVar.f33762n = false;
        y3.C5965k c5965k = new y3.C5965k();
        c5965k.m22050k("sdk_ver", 48).m22050k("cpvn", C5872k.f33107g).m22050k("cpvc", Integer.valueOf(C5872k.f33109n)).m22050k("country_code", C5926m.m21688k(context).m21690g()).m22050k("region", C5926m.m21688k(context).toq()).m22050k("miui_vn", nc.cdj()).m22050k("miui_vc", Integer.valueOf(nc.toq(context))).m22050k("xmsf_vc", Integer.valueOf(uf.toq(context, "com.xiaomi.xmsf"))).m22050k("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).m22050k("n_belong_to_app", Boolean.valueOf(wvg.m21782i(context))).m22050k("systemui_vc", Integer.valueOf(uf.m21860k(context)));
        String strZy = zy(context);
        if (!TextUtils.isEmpty(strZy)) {
            c5965k.m22050k("latest_country_code", strZy);
        }
        String strT8r = nc.t8r();
        if (!TextUtils.isEmpty(strT8r)) {
            c5965k.m22050k("device_ch", strT8r);
        }
        String strFn3e = nc.fn3e();
        if (!TextUtils.isEmpty(strFn3e)) {
            c5965k.m22050k("device_mfr", strFn3e);
        }
        toqVar.f33758g = c5965k.toString();
        String str2 = m21769g(context) ? "1000271" : this.f33920q;
        y3.C5965k c5965k2 = new y3.C5965k();
        c5965k2.m22050k("appid", str2).m22050k("locale", Locale.getDefault().toString()).m22050k("sync", 1);
        if (m21770n(context)) {
            c5965k2.m22050k("ab", str);
        }
        toqVar.f73595f7l8 = c5965k2.toString();
        toqVar.f73599ld6 = d8wkVar;
        return toqVar;
    }
}
