package com.tencent.wxop.stat.common;

import android.util.Base64;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.f */
/* JADX INFO: loaded from: classes3.dex */
public class C5386f {
    /* JADX INFO: renamed from: a */
    static byte[] m18390a() {
        return Base64.decode("MDNhOTc2NTExZTJjYmUzYTdmMjY4MDhmYjdhZjNjMDU=", 0);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m18391a(byte[] bArr) {
        return m18392a(bArr, m18390a());
    }

    /* JADX INFO: renamed from: a */
    static byte[] m18392a(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int length = bArr2.length;
        if (length <= 0 || length > 256) {
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
            iArr2[i2] = bArr2[i2 % length];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            int i5 = iArr[i4];
            i3 = (i3 + i5 + iArr2[i4]) & 255;
            iArr[i4] = iArr[i3];
            iArr[i3] = i5;
        }
        byte[] bArr3 = new byte[bArr.length];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < bArr.length; i8++) {
            i6 = (i6 + 1) & 255;
            int i9 = iArr[i6];
            i7 = (i7 + i9) & 255;
            iArr[i6] = iArr[i7];
            iArr[i7] = i9;
            bArr3[i8] = (byte) (iArr[(iArr[i6] + i9) & 255] ^ bArr[i8]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m18393b(byte[] bArr) {
        return m18394b(bArr, m18390a());
    }

    /* JADX INFO: renamed from: b */
    static byte[] m18394b(byte[] bArr, byte[] bArr2) {
        return m18392a(bArr, bArr2);
    }
}
