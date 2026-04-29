package com.xiaomi.push;

/* JADX INFO: renamed from: com.xiaomi.push.q */
/* JADX INFO: loaded from: classes3.dex */
public class C5890q {
    /* JADX INFO: renamed from: k */
    public static int m21388k(byte[] bArr) {
        if (bArr.length != 4) {
            throw new IllegalArgumentException("the length of bytes must be 4");
        }
        return (bArr[3] & 255) | 0 | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static byte[] toq(int i2) {
        return new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2};
    }
}
