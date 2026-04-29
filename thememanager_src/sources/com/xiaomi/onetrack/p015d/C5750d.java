package com.xiaomi.onetrack.p015d;

import android.text.TextUtils;
import com.google.common.base.zy;
import com.xiaomi.onetrack.util.C5804p;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import miuix.security.C7323k;

/* JADX INFO: renamed from: com.xiaomi.onetrack.d.d */
/* JADX INFO: loaded from: classes3.dex */
public class C5750d {

    /* JADX INFO: renamed from: a */
    private static final String f32082a = "DigestUtil";

    /* JADX INFO: renamed from: b */
    private static final char[] f32083b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c */
    private static final char[] f32084c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    static MessageDigest m20018a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m20024b(String str) {
        return m20020a(m20019a(str, "UTF-8"));
    }

    /* JADX INFO: renamed from: c */
    public static String m20025c(String str) {
        return m20016a(m20024b(str), true);
    }

    /* JADX INFO: renamed from: d */
    public static String m20028d(String str) {
        return m20016a(m20033g(str), true);
    }

    /* JADX INFO: renamed from: e */
    public static String m20030e(String str) {
        return m20016a(m20032f(str), true);
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m20032f(String str) {
        return m20027c(m20019a(str, "UTF-8"));
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m20033g(String str) {
        return m20026c().digest(m20019a(str, "UTF-8"));
    }

    /* JADX INFO: renamed from: h */
    public static String m20034h(String str) {
        return TextUtils.isEmpty(str) ? "" : m20031e(str.getBytes());
    }

    /* JADX INFO: renamed from: b */
    public static String m20022b(byte[] bArr) {
        return m20016a(m20020a(bArr), true);
    }

    /* JADX INFO: renamed from: c */
    private static MessageDigest m20026c() {
        return m20018a("SHA1");
    }

    /* JADX INFO: renamed from: d */
    public static String m20029d(byte[] bArr) {
        return m20016a(m20027c(bArr), true);
    }

    /* JADX INFO: renamed from: e */
    public static String m20031e(byte[] bArr) {
        String str;
        if (bArr != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
                messageDigest.update(bArr);
                str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
            } catch (Exception e2) {
                C5804p.m20347b(f32082a, "getMD5 exception: " + e2);
                str = "";
            }
        } else {
            str = "";
        }
        return str.toLowerCase();
    }

    /* JADX INFO: renamed from: a */
    private static MessageDigest m20017a() {
        return m20018a(C7323k.f90061toq);
    }

    /* JADX INFO: renamed from: b */
    private static MessageDigest m20023b() {
        return m20018a("SHA-256");
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m20027c(byte[] bArr) {
        return m20023b().digest(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m20020a(byte[] bArr) {
        return m20017a().digest(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m20016a(byte[] bArr, boolean z2) {
        return new String(m20021a(bArr, z2 ? f32083b : f32084c));
    }

    /* JADX INFO: renamed from: a */
    private static char[] m20021a(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            cArr2[i2] = cArr[(b2 & 240) >>> 4];
            i2 = i3 + 1;
            cArr2[i3] = cArr[b2 & zy.f68111cdj];
        }
        return cArr2;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m20019a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
