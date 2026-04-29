package com.google.common.net;

import com.google.common.base.jk;
import com.google.common.escape.AbstractC4606s;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: PercentEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class f7l8 extends AbstractC4606s {

    /* JADX INFO: renamed from: q */
    private final boolean[] f27197q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final boolean f68378zy;

    /* JADX INFO: renamed from: n */
    private static final char[] f27196n = {'+'};

    /* JADX INFO: renamed from: g */
    private static final char[] f27195g = "0123456789ABCDEF".toCharArray();

    public f7l8(String str, boolean z2) {
        jk.a9(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str2 = str + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (z2 && str2.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f68378zy = z2;
        this.f27197q = m16579y(str2);
    }

    /* JADX INFO: renamed from: y */
    private static boolean[] m16579y(String str) {
        char[] charArray = str.toCharArray();
        int iMax = -1;
        for (char c2 : charArray) {
            iMax = Math.max((int) c2, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c3 : charArray) {
            zArr[c3] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.AbstractC4606s
    protected int f7l8(CharSequence charSequence, int i2, int i3) {
        jk.a9(charSequence);
        while (i2 < i3) {
            char cCharAt = charSequence.charAt(i2);
            boolean[] zArr = this.f27197q;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            i2++;
        }
        return i2;
    }

    @Override // com.google.common.escape.AbstractC4606s
    /* JADX INFO: renamed from: q */
    protected char[] mo16144q(int i2) {
        boolean[] zArr = this.f27197q;
        if (i2 < zArr.length && zArr[i2]) {
            return null;
        }
        if (i2 == 32 && this.f68378zy) {
            return f27196n;
        }
        if (i2 <= 127) {
            char[] cArr = f27195g;
            return new char[]{'%', cArr[i2 >>> 4], cArr[i2 & 15]};
        }
        if (i2 <= 2047) {
            char[] cArr2 = f27195g;
            char[] cArr3 = {'%', cArr2[(i >>> 4) | 12], cArr2[i & 15], '%', cArr2[(i & 3) | 8], cArr2[i2 & 15]};
            int i3 = i2 >>> 4;
            int i4 = i3 >>> 2;
            return cArr3;
        }
        if (i2 <= 65535) {
            char[] cArr4 = f27195g;
            char[] cArr5 = {'%', 'E', cArr4[i >>> 2], '%', cArr4[(i & 3) | 8], cArr4[i & 15], '%', cArr4[(i & 3) | 8], cArr4[i2 & 15]};
            int i5 = i2 >>> 4;
            int i6 = i5 >>> 2;
            int i7 = i6 >>> 4;
            return cArr5;
        }
        if (i2 > 1114111) {
            throw new IllegalArgumentException("Invalid unicode character value " + i2);
        }
        char[] cArr6 = f27195g;
        char[] cArr7 = {'%', 'F', cArr6[(i >>> 2) & 7], '%', cArr6[(i & 3) | 8], cArr6[i & 15], '%', cArr6[(i & 3) | 8], cArr6[i & 15], '%', cArr6[(i & 3) | 8], cArr6[i2 & 15]};
        int i8 = i2 >>> 4;
        int i9 = i8 >>> 2;
        int i10 = i9 >>> 4;
        int i11 = i10 >>> 2;
        int i12 = i11 >>> 4;
        return cArr7;
    }

    @Override // com.google.common.escape.AbstractC4606s, com.google.common.escape.AbstractC4601g
    public String toq(String str) {
        jk.a9(str);
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            boolean[] zArr = this.f27197q;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return m16156n(str, i2);
            }
        }
        return str;
    }
}
