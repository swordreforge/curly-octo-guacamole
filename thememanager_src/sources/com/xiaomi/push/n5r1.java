package com.xiaomi.push;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import miuix.security.C7323k;

/* JADX INFO: loaded from: classes3.dex */
public class n5r1 {
    public static String f7l8(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return m21307y(objArr, str, 0, objArr.length);
    }

    /* JADX INFO: renamed from: g */
    public static String m21301g(byte[] bArr) {
        String str;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(bArr);
            str = String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (Exception unused) {
            str = "";
        }
        return str.toLowerCase();
    }

    /* JADX INFO: renamed from: k */
    public static String m21302k(int i2) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i2; i3++) {
            stringBuffer.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
        }
        return stringBuffer.toString();
    }

    public static String ld6(String str) {
        if (str == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(m21304p(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m21303n(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(256);
        if (next != null) {
            stringBuffer.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                stringBuffer.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                stringBuffer.append(next2);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m21304p(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    /* JADX INFO: renamed from: q */
    public static String m21305q(Collection<?> collection, String str) {
        if (collection == null) {
            return null;
        }
        return m21303n(collection.iterator(), str);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m21306s(String str) {
        if (str == null) {
            return true;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 0 || cCharAt > 127) {
                return false;
            }
        }
        return true;
    }

    public static String toq(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C7323k.f90061toq);
            messageDigest.update(m21304p(str));
            return String.format("%1$032X", new BigInteger(1, messageDigest.digest()));
        } catch (NoSuchAlgorithmException unused) {
            return str;
        }
    }

    public static String x2(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr);
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m21307y(Object[] objArr, String str, int i2, int i3) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i4 = i3 - i2;
        if (i4 <= 0) {
            return "";
        }
        Object obj = objArr[i2];
        StringBuffer stringBuffer = new StringBuffer(i4 * ((obj == null ? 16 : obj.toString().length()) + str.length()));
        for (int i5 = i2; i5 < i3; i5++) {
            if (i5 > i2) {
                stringBuffer.append(str);
            }
            Object obj2 = objArr[i5];
            if (obj2 != null) {
                stringBuffer.append(obj2);
            }
        }
        return stringBuffer.toString();
    }

    public static String zy(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        if (i2 <= 0 || length < i2) {
            i2 = length / 3;
            if (i2 <= 1) {
                i2 = 1;
            }
            if (i2 > 3) {
                i2 = 3;
            }
        }
        int i3 = 0;
        while (i3 < length) {
            int i4 = i3 + 1;
            if (i4 % i2 == 0) {
                sb.append("*");
            } else {
                sb.append(str.charAt(i3));
            }
            i3 = i4;
        }
        return sb.toString();
    }
}
