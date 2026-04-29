package com.xiaomi.accountsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import miuix.security.C7323k;

/* JADX INFO: renamed from: com.xiaomi.accountsdk.utils.s */
/* JADX INFO: compiled from: Coder.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5577s {

    /* JADX INFO: renamed from: k */
    private static final String f31053k = "AccountCoder";

    public static String f7l8(String str, int i2) {
        if (str == null) {
            return null;
        }
        try {
            return Base64.encodeToString(m19134y(str.getBytes("UTF-8")), i2);
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            throw new IllegalStateException("failed to SHA1");
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m19130g(String str) {
        return f7l8(str, 2);
    }

    /* JADX INFO: renamed from: k */
    public static String m19131k(long j2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            dataOutputStream.writeLong(new Random().nextLong());
            dataOutputStream.writeInt((int) (j2 / 60000));
            dataOutputStream.flush();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 10);
    }

    /* JADX INFO: renamed from: n */
    public static String m19132n(String str) {
        String strZy;
        if (str == null || (strZy = zy(str.getBytes())) == null) {
            return null;
        }
        return strZy.toUpperCase();
    }

    /* JADX INFO: renamed from: q */
    public static String m19133q(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int i3 = (bArr[i2] & 240) >> 4;
            sb.append((char) ((i3 < 0 || i3 > 9) ? (i3 + 97) - 10 : i3 + 48));
            int i4 = bArr[i2] & com.google.common.base.zy.f68111cdj;
            sb.append((char) ((i4 < 0 || i4 > 9) ? (i4 + 97) - 10 : i4 + 48));
        }
        return sb.toString();
    }

    public static String toq(String str, String str2, Map<String, String> map, String str3) {
        if (TextUtils.isEmpty(str3)) {
            throw new InvalidParameterException("security is not nullable");
        }
        ArrayList<String> arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str.toUpperCase());
        }
        if (str2 != null) {
            arrayList.add(Uri.parse(str2).getEncodedPath());
        }
        boolean z2 = true;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : new TreeMap(map).entrySet()) {
                arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
            }
        }
        arrayList.add(str3);
        StringBuilder sb = new StringBuilder();
        for (String str4 : arrayList) {
            if (!z2) {
                sb.append(kotlin.text.eqxt.f36674q);
            }
            sb.append(str4);
            z2 = false;
        }
        return m19130g(sb.toString());
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m19134y(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            throw new IllegalStateException("failed to SHA1");
        }
    }

    public static String zy(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
                messageDigest.update(bArr);
                return m19133q(messageDigest.digest());
            } catch (Exception e2) {
                AbstractC5574n.m19113q(f31053k, "getDataMd5Digest", e2);
            }
        }
        return null;
    }
}
