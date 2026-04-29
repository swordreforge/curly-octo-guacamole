package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
public class x9kr {

    /* JADX INFO: renamed from: k */
    private static final String f34171k = System.getProperty("line.separator");

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static char[] f73726toq = new char[64];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static byte[] f73727zy;

    static {
        char c2 = 'A';
        int i2 = 0;
        while (c2 <= 'Z') {
            f73726toq[i2] = c2;
            c2 = (char) (c2 + 1);
            i2++;
        }
        char c3 = 'a';
        while (c3 <= 'z') {
            f73726toq[i2] = c3;
            c3 = (char) (c3 + 1);
            i2++;
        }
        char c4 = '0';
        while (c4 <= '9') {
            f73726toq[i2] = c4;
            c4 = (char) (c4 + 1);
            i2++;
        }
        char[] cArr = f73726toq;
        cArr[i2] = '+';
        cArr[i2 + 1] = '/';
        f73727zy = new byte[128];
        int i3 = 0;
        while (true) {
            byte[] bArr = f73727zy;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = -1;
            i3++;
        }
        for (int i4 = 0; i4 < 64; i4++) {
            f73727zy[f73726toq[i4]] = (byte) i4;
        }
    }

    public static String f7l8(String str) {
        return new String(toq(str));
    }

    /* JADX INFO: renamed from: g */
    public static char[] m22018g(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = ((i3 * 4) + 2) / 3;
        char[] cArr = new char[((i3 + 2) / 3) * 4];
        int i8 = i3 + i2;
        int i9 = 0;
        while (i2 < i8) {
            int i10 = i2 + 1;
            int i11 = bArr[i2] & 255;
            if (i10 < i8) {
                i4 = i10 + 1;
                i5 = bArr[i10] & 255;
            } else {
                i4 = i10;
                i5 = 0;
            }
            if (i4 < i8) {
                i6 = bArr[i4] & 255;
                i4++;
            } else {
                i6 = 0;
            }
            int i12 = i11 >>> 2;
            int i13 = ((i11 & 3) << 4) | (i5 >>> 4);
            int i14 = ((i5 & 15) << 2) | (i6 >>> 6);
            int i15 = i6 & 63;
            int i16 = i9 + 1;
            char[] cArr2 = f73726toq;
            cArr[i9] = cArr2[i12];
            int i17 = i16 + 1;
            cArr[i16] = cArr2[i13];
            char c2 = '=';
            cArr[i17] = i17 < i7 ? cArr2[i14] : '=';
            int i18 = i17 + 1;
            if (i18 < i7) {
                c2 = cArr2[i15];
            }
            cArr[i18] = c2;
            i9 = i18 + 1;
            i2 = i4;
        }
        return cArr;
    }

    /* JADX INFO: renamed from: k */
    public static String m22019k(String str) {
        return new String(m22020n(str.getBytes()));
    }

    /* JADX INFO: renamed from: n */
    public static char[] m22020n(byte[] bArr) {
        return m22018g(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m22021q(char[] cArr, int i2, int i3) {
        int i4;
        char c2;
        char c3;
        int i5;
        if (i3 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i3 > 0 && cArr[(i2 + i3) - 1] == '=') {
            i3--;
        }
        int i6 = (i3 * 3) / 4;
        byte[] bArr = new byte[i6];
        int i7 = i3 + i2;
        int i8 = 0;
        while (i2 < i7) {
            int i9 = i2 + 1;
            char c4 = cArr[i2];
            int i10 = i9 + 1;
            char c5 = cArr[i9];
            if (i10 < i7) {
                i4 = i10 + 1;
                c2 = cArr[i10];
            } else {
                i4 = i10;
                c2 = 'A';
            }
            if (i4 < i7) {
                i5 = i4 + 1;
                c3 = cArr[i4];
            } else {
                int i11 = i4;
                c3 = 'A';
                i5 = i11;
            }
            if (c4 > 127 || c5 > 127 || c2 > 127 || c3 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f73727zy;
            byte b2 = bArr2[c4];
            byte b3 = bArr2[c5];
            byte b4 = bArr2[c2];
            byte b5 = bArr2[c3];
            if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i12 = (b2 << 2) | (b3 >>> 4);
            int i13 = ((b3 & com.google.common.base.zy.f68111cdj) << 4) | (b4 >>> 2);
            int i14 = ((b4 & 3) << 6) | b5;
            int i15 = i8 + 1;
            bArr[i8] = (byte) i12;
            if (i15 < i6) {
                bArr[i15] = (byte) i13;
                i15++;
            }
            if (i15 < i6) {
                bArr[i15] = (byte) i14;
                i8 = i15 + 1;
            } else {
                i8 = i15;
            }
            i2 = i5;
        }
        return bArr;
    }

    public static byte[] toq(String str) {
        return zy(str.toCharArray());
    }

    public static byte[] zy(char[] cArr) {
        return m22021q(cArr, 0, cArr.length);
    }
}
