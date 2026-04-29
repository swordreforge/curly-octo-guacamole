package com.xiaomi.accountsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.accountsdk.account.C5502s;
import com.xiaomi.accountsdk.account.data.C5480k;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: XMPassportUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class lvui {

    /* JADX INFO: renamed from: k */
    private static final String f31044k = "_locale";

    /* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.lvui$k */
    /* JADX INFO: compiled from: XMPassportUtil.java */
    private enum EnumC5573k {
        en_US("MM-dd-yyyy"),
        en_not_US("dd-MM-yyyy"),
        default_not_en(C5502s.f30771i);

        private String value;

        EnumC5573k(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    public static String f7l8() {
        Locale locale = Locale.getDefault();
        return locale.getLanguage().equals(Locale.ENGLISH.getLanguage()) ? locale.getCountry().equals(Locale.US.getCountry()) ? EnumC5573k.en_US.toString() : EnumC5573k.en_not_US.toString() : EnumC5573k.default_not_en.toString();
    }

    /* JADX INFO: renamed from: g */
    public static String m19105g(Locale locale) {
        String language = locale.getLanguage();
        String country = locale.getCountry();
        return TextUtils.isEmpty(country) ? language : String.format("%s_%s", language, country);
    }

    /* JADX INFO: renamed from: k */
    public static String m19106k(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = Uri.parse(str);
        String queryParameter = uri.getQueryParameter(f31044k);
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String strM19105g = m19105g(Locale.getDefault());
        if (TextUtils.isEmpty(queryParameter) && !TextUtils.isEmpty(strM19105g)) {
            builderBuildUpon.appendQueryParameter(f31044k, strM19105g);
        }
        return builderBuildUpon.build().toString();
    }

    /* JADX INFO: renamed from: n */
    public static Map<String, String> m19107n() {
        HashMap map = new HashMap();
        map.put(f31044k, m19105g(Locale.getDefault()));
        return map;
    }

    /* JADX INFO: renamed from: q */
    public static String m19108q(String str) {
        return toq(str, "userId");
    }

    public static String toq(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            for (String str3 : str.split(";")) {
                if (str3.contains(str2) && str3.split("=")[0].trim().equals(str2)) {
                    return str3.substring(str3.indexOf("=") + 1);
                }
            }
        }
        return null;
    }

    public static String zy(String str) {
        return toq(str, C5480k.f72649n7h);
    }
}
