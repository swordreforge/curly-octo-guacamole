package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class nc {

    /* JADX INFO: renamed from: k */
    private static volatile int f33438k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f73501toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<String, brv> f73502zy;

    public static String cdj() {
        return f7l8("ro.miui.ui.version.name");
    }

    public static String f7l8(String str) {
        try {
            try {
                return (String) C5892r.f7l8("android.os.SystemProperties", "get", str, "");
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.jk("fail to get property. " + e2);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String fn3e() {
        return f7l8("ro.product.manufacturer");
    }

    /* JADX INFO: renamed from: g */
    public static String m21308g(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append("null");
        } else {
            boolean z2 = true;
            for (String str : bundle.keySet()) {
                if (!z2) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append('=');
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(m21308g((Bundle) obj));
                } else {
                    sb.append(obj);
                }
                z2 = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m21309h() {
        return m21311k() == 2;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m21310i() {
        return !brv.China.name().equalsIgnoreCase(zy(n7h()).name());
    }

    /* JADX INFO: renamed from: k */
    public static int m21311k() {
        if (f33438k == 0) {
            try {
                int i2 = 1;
                if (!((TextUtils.isEmpty(f7l8("ro.miui.ui.version.code")) && TextUtils.isEmpty(f7l8("ro.miui.ui.version.name"))) ? false : true)) {
                    i2 = 2;
                }
                f33438k = i2;
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.zy.cdj("get isMIUI failed", th);
                f33438k = 0;
            }
            com.xiaomi.channel.commonutils.logger.zy.m19302z("isMIUI's value is: " + f33438k);
        }
        return f33438k;
    }

    public static boolean ki() {
        if (f73501toq < 0) {
            f73501toq = !zurt() ? 1 : 0;
        }
        return f73501toq > 0;
    }

    private static String kja0(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split(C5658n.f73185t8r);
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    public static boolean ld6(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    /* JADX INFO: renamed from: n */
    public static String m21312n(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + m21308g(intent.getExtras());
    }

    public static String n7h() {
        String strM21289k = mla.m21289k("ro.miui.region", "");
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = kja0(mla.m21289k("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strM21289k)) {
            strM21289k = mla.m21289k("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(strM21289k)) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("get region from system, region = " + strM21289k);
        }
        if (!TextUtils.isEmpty(strM21289k)) {
            return strM21289k;
        }
        String country = Locale.getDefault().getCountry();
        com.xiaomi.channel.commonutils.logger.zy.kja0("locale.default.country = " + country);
        return country;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m21313p(Context context) {
        return context != null && ld6(context.getPackageName());
    }

    /* JADX INFO: renamed from: q */
    public static String m21314q() {
        int iM21967k = wu.m21967k();
        return (!m21315s() || iM21967k <= 0) ? "" : iM21967k < 2 ? "alpha" : iM21967k < 3 ? "development" : "stable";
    }

    private static brv qrj(String str) {
        m21316y();
        return f73502zy.get(str.toUpperCase());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m21315s() {
        return m21311k() == 1;
    }

    public static String t8r() {
        return f7l8("ro.build.characteristics");
    }

    public static int toq(Context context) {
        String strF7l8 = f7l8("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(strF7l8) || !TextUtils.isDigitsOnly(strF7l8)) {
            return 0;
        }
        return Integer.parseInt(strF7l8);
    }

    public static int x2(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m21316y() {
        if (f73502zy != null) {
            return;
        }
        HashMap map = new HashMap();
        f73502zy = map;
        map.put("CN", brv.China);
        Map<String, brv> map2 = f73502zy;
        brv brvVar = brv.Europe;
        map2.put("FI", brvVar);
        f73502zy.put("SE", brvVar);
        f73502zy.put("NO", brvVar);
        f73502zy.put("FO", brvVar);
        f73502zy.put("EE", brvVar);
        f73502zy.put("LV", brvVar);
        f73502zy.put("LT", brvVar);
        f73502zy.put("BY", brvVar);
        f73502zy.put("MD", brvVar);
        f73502zy.put("UA", brvVar);
        f73502zy.put("PL", brvVar);
        f73502zy.put("CZ", brvVar);
        f73502zy.put("SK", brvVar);
        f73502zy.put("HU", brvVar);
        f73502zy.put("DE", brvVar);
        f73502zy.put("AT", brvVar);
        f73502zy.put("CH", brvVar);
        f73502zy.put("LI", brvVar);
        f73502zy.put("GB", brvVar);
        f73502zy.put("IE", brvVar);
        f73502zy.put("NL", brvVar);
        f73502zy.put("BE", brvVar);
        f73502zy.put("LU", brvVar);
        f73502zy.put("FR", brvVar);
        f73502zy.put("RO", brvVar);
        f73502zy.put("BG", brvVar);
        f73502zy.put("RS", brvVar);
        f73502zy.put("MK", brvVar);
        f73502zy.put("AL", brvVar);
        f73502zy.put("GR", brvVar);
        f73502zy.put("SI", brvVar);
        f73502zy.put("HR", brvVar);
        f73502zy.put("IT", brvVar);
        f73502zy.put("SM", brvVar);
        f73502zy.put("MT", brvVar);
        f73502zy.put(com.market.sdk.utils.kja0.f28214q, brvVar);
        f73502zy.put("PT", brvVar);
        f73502zy.put("AD", brvVar);
        f73502zy.put("CY", brvVar);
        f73502zy.put("DK", brvVar);
        f73502zy.put("IS", brvVar);
        f73502zy.put("UK", brvVar);
        f73502zy.put("EL", brvVar);
        f73502zy.put(com.market.sdk.utils.kja0.f68999zy, brv.Russia);
        f73502zy.put(com.market.sdk.utils.kja0.f28213k, brv.India);
    }

    public static boolean zurt() {
        String strM21289k = "";
        try {
            strM21289k = mla.m21289k("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(strM21289k);
    }

    public static brv zy(String str) {
        brv brvVarQrj = qrj(str);
        return brvVarQrj == null ? brv.Global : brvVarQrj;
    }
}
