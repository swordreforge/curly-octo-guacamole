package com.android.thememanager.controller.online;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Base64;
import com.android.thememanager.basemodule.utils.y9n;
import com.google.android.exoplayer2.C3548p;
import com.xiaomi.accountsdk.utils.C5581y;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: RequestUrlHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class ni7 {

    /* JADX INFO: renamed from: k */
    public static final String f10962k = "UTF-8";

    public static String f7l8(String url, Map<String, String> params, String httpMethod, String securityKey) {
        try {
            return C5581y.x2(httpMethod, url, new TreeMap(params), securityKey);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m7598g(final ContentValues contentValues, final String encoding) {
        StringBuilder sb = new StringBuilder();
        for (String str : contentValues.keySet()) {
            String strM7601q = m7601q(str, encoding);
            String asString = contentValues.getAsString(str);
            String strM7601q2 = asString != null ? m7601q(asString, encoding) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(strM7601q);
            sb.append("=");
            sb.append(strM7601q2);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m7599k(String baseUrl, Map<String, String> params) {
        return toq(baseUrl, params, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m7600n(Map<String, String> params, String securityKey) {
        Cipher cipherNi7 = C5581y.ni7(securityKey, 1);
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                params.put(entry.getKey(), Base64.encodeToString(cipherNi7.doFinal(entry.getValue().getBytes("UTF-8")), 2));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    private static String m7601q(final String content, final String encoding) {
        if (encoding == null) {
            encoding = C3548p.f65199kja0;
        }
        try {
            return URLEncoder.encode(content, encoding);
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m7602s(String urlStr) {
        try {
            if (!TextUtils.isEmpty(urlStr) && !urlStr.endsWith("?")) {
                return TextUtils.isEmpty(new URL(urlStr).getQuery()) ? "?" : "&";
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static String toq(String baseUrl, Map<String, String> params, String fragment) {
        StringBuffer stringBuffer = new StringBuffer(baseUrl == null ? "" : baseUrl);
        if (params != null && !params.isEmpty()) {
            stringBuffer.append(m7602s(baseUrl));
            ContentValues contentValues = new ContentValues();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                contentValues.put(entry.getKey(), entry.getValue());
            }
            stringBuffer.append(m7598g(contentValues, "UTF-8"));
        }
        if (fragment != null) {
            stringBuffer.append("#");
            stringBuffer.append(fragment);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: y */
    public static String m7603y(InputStream is) throws IOException {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
            char[] cArr = new char[1024];
            while (true) {
                int i2 = bufferedReader.read(cArr);
                if (i2 == -1) {
                    return sb.toString();
                }
                sb.append(cArr, 0, i2);
            }
        } finally {
            y9n.m7246g(is);
        }
    }

    public static InputStream zy(InputStream is, String securityKey) {
        if (TextUtils.isEmpty(securityKey) || is == null) {
            return is;
        }
        try {
            return new ByteArrayInputStream(C5581y.ni7(securityKey, 2).doFinal(Base64.decode(m7603y(is), 2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            return is;
        }
    }
}
