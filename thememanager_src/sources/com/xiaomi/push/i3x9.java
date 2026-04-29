package com.xiaomi.push;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public class i3x9 {

    /* JADX INFO: renamed from: k */
    private static final char[] f33019k = "&quot;".toCharArray();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final char[] f73362toq = "&apos;".toCharArray();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final char[] f73363zy = "&amp;".toCharArray();

    /* JADX INFO: renamed from: q */
    private static final char[] f33021q = "&lt;".toCharArray();

    /* JADX INFO: renamed from: n */
    private static final char[] f33020n = "&gt;".toCharArray();

    /* JADX INFO: renamed from: g */
    private static Random f33018g = new Random();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static char[] f73361f7l8 = "0123456789abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* JADX INFO: renamed from: k */
    public static String m20969k(int i2) {
        if (i2 < 1) {
            return null;
        }
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = f73361f7l8[f33018g.nextInt(71)];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: n */
    public static final String m20970n(String str) {
        return zy(zy(zy(zy(zy(str, "&lt;", "<"), "&gt;", ">"), "&quot;", "\""), "&apos;", "'"), "&amp;", "&");
    }

    /* JADX INFO: renamed from: q */
    public static String m20971q(byte[] bArr) {
        return String.valueOf(x9kr.m22020n(bArr));
    }

    public static String toq(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        StringBuilder sb = new StringBuilder((int) (((double) length) * 1.3d));
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            char c2 = charArray[i2];
            if (c2 <= '>') {
                if (c2 == '<') {
                    if (i2 > i3) {
                        sb.append(charArray, i3, i2 - i3);
                    }
                    i3 = i2 + 1;
                    sb.append(f33021q);
                } else if (c2 == '>') {
                    if (i2 > i3) {
                        sb.append(charArray, i3, i2 - i3);
                    }
                    i3 = i2 + 1;
                    sb.append(f33020n);
                } else if (c2 == '&') {
                    if (i2 > i3) {
                        sb.append(charArray, i3, i2 - i3);
                    }
                    int i4 = i2 + 5;
                    if (length <= i4 || charArray[i2 + 1] != '#' || !Character.isDigit(charArray[i2 + 2]) || !Character.isDigit(charArray[i2 + 3]) || !Character.isDigit(charArray[i2 + 4]) || charArray[i4] != ';') {
                        i3 = i2 + 1;
                        sb.append(f73363zy);
                    }
                } else if (c2 == '\"') {
                    if (i2 > i3) {
                        sb.append(charArray, i3, i2 - i3);
                    }
                    i3 = i2 + 1;
                    sb.append(f33019k);
                } else if (c2 == '\'') {
                    if (i2 > i3) {
                        sb.append(charArray, i3, i2 - i3);
                    }
                    i3 = i2 + 1;
                    sb.append(f73362toq);
                }
            }
            i2++;
        }
        if (i3 == 0) {
            return str;
        }
        if (i2 > i3) {
            sb.append(charArray, i3, i2 - i3);
        }
        return sb.toString();
    }

    public static final String zy(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuilder sb = new StringBuilder(charArray.length);
        sb.append(charArray, 0, iIndexOf);
        sb.append(charArray2);
        int i2 = iIndexOf + length;
        while (true) {
            int iIndexOf2 = str.indexOf(str2, i2);
            if (iIndexOf2 <= 0) {
                sb.append(charArray, i2, charArray.length - i2);
                return sb.toString();
            }
            sb.append(charArray, i2, iIndexOf2 - i2);
            sb.append(charArray2);
            i2 = iIndexOf2 + length;
        }
    }
}
