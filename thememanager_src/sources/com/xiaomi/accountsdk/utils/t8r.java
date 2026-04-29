package com.xiaomi.accountsdk.utils;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.PublicKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: IpFilterHelper.java */
/* JADX INFO: loaded from: classes3.dex */
class t8r {

    /* JADX INFO: renamed from: k */
    private static final String f31055k = "IpFilterHelper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f72977toq = "\\/\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile PublicKey f72978zy;

    t8r() {
    }

    /* JADX INFO: renamed from: k */
    static String m19138k(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = Pattern.compile(f72977toq).matcher(str);
            while (matcher.find()) {
                String strGroup = matcher.group();
                str = str.replace(strGroup, "(" + toq(strGroup) + ")");
            }
        }
        return str;
    }

    private static String toq(String str) {
        try {
            if (f72978zy == null) {
                f72978zy = wvg.f7l8(wvg.f31059k);
            }
            return Base64.encodeToString(wvg.m19144n(str.getBytes("UTF-8"), f72978zy), 0);
        } catch (UnsupportedEncodingException e2) {
            AbstractC5574n.o1t(f31055k, e2);
            return null;
        } catch (p039w.toq e3) {
            AbstractC5574n.o1t(f31055k, e3);
            return null;
        }
    }
}
