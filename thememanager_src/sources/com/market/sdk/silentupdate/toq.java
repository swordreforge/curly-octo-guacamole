package com.market.sdk.silentupdate;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: SigGenerator.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    private static final String f28142k = "HmacSHA256";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Random f68938toq = new SecureRandom();

    /* JADX INFO: renamed from: com.market.sdk.silentupdate.toq$k */
    /* JADX INFO: compiled from: SigGenerator.java */
    private static class C4996k {

        /* JADX INFO: renamed from: k */
        private String f28143k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f68939toq;

        private C4996k() {
        }

        /* JADX INFO: renamed from: k */
        public String m17379k() {
            return this.f28143k;
        }

        /* JADX INFO: renamed from: q */
        public void m17380q(String str) {
            this.f68939toq = str;
        }

        public String toq() {
            return this.f68939toq;
        }

        public void zy(String str) {
            this.f28143k = str;
        }
    }

    /* JADX INFO: renamed from: k */
    private static String m17376k(byte[] bArr) {
        try {
            return new String(Base64.encode(bArr, 9), "UTF-8").trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private static String m17377n(String str, TreeMap<String, String> treeMap) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            String key = entry.getKey();
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(key + "=" + URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        sb.append("\n");
        return m17376k(toq(sb.toString().getBytes("UTF-8"), str.getBytes("UTF-8")));
    }

    /* JADX INFO: renamed from: q */
    public static String m17378q(String str, String str2, String str3, String str4, String str5) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        TreeMap treeMap = new TreeMap();
        treeMap.put("appClientId", str2);
        treeMap.put("nonce", str);
        treeMap.put("id", str3);
        treeMap.put("ref", str4);
        return m17377n(str5, treeMap);
    }

    private static byte[] toq(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f28142k);
        Mac mac = Mac.getInstance(f28142k);
        mac.init(secretKeySpec);
        mac.update(bArr);
        return mac.doFinal();
    }

    public static String zy() {
        return f68938toq.nextLong() + ":" + ((int) (System.currentTimeMillis() / 60000));
    }
}
