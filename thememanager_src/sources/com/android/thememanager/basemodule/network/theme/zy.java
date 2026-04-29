package com.android.thememanager.basemodule.network.theme;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.xiaomi.accountsdk.utils.C5581y;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: EncryptNetworkUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f10116k = "EncryptNetworkUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57609toq = "UTF-8";

    /* JADX INFO: renamed from: k */
    public static String m6893k(String rawResponse, String securityKey) {
        if (!TextUtils.isEmpty(securityKey) && !TextUtils.isEmpty(rawResponse)) {
            try {
                return new String(C5581y.ni7(securityKey, 2).doFinal(Base64.decode(rawResponse, 2)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return rawResponse;
    }

    public static void toq(Map<String, String> params, String securityKey) {
        if (TextUtils.isEmpty(securityKey)) {
            Log.w(f10116k, "encryptParameters securityKey is empty");
            return;
        }
        Cipher cipherNi7 = C5581y.ni7(securityKey, 1);
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                params.put(entry.getKey(), Base64.encodeToString(cipherNi7.doFinal(entry.getValue().getBytes("UTF-8")), 2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String zy(String url, Map<String, String> params, String httpMethod, String securityKey) {
        try {
            return C5581y.x2(httpMethod, url, new TreeMap(params), securityKey);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
