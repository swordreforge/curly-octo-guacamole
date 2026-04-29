package com.google.common.primitives;

import com.google.common.base.jk;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: SignedBytes.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class n7h {

    /* JADX INFO: renamed from: k */
    public static final byte f27292k = 64;

    /* JADX INFO: renamed from: com.google.common.primitives.n7h$k */
    /* JADX INFO: compiled from: SignedBytes.java */
    private enum EnumC4742k implements Comparator<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "SignedBytes.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int iMin = Math.min(bArr.length, bArr2.length);
            for (int i2 = 0; i2 < iMin; i2++) {
                int qVar = n7h.toq(bArr[i2], bArr2[i2]);
                if (qVar != 0) {
                    return qVar;
                }
            }
            return bArr.length - bArr2.length;
        }
    }

    private n7h() {
    }

    public static byte f7l8(long j2) {
        if (j2 > 127) {
            return (byte) 127;
        }
        if (j2 < -128) {
            return (byte) -128;
        }
        return (byte) j2;
    }

    /* JADX INFO: renamed from: g */
    public static byte m16673g(byte... bArr) {
        jk.m15383q(bArr.length > 0);
        byte b2 = bArr[0];
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte b3 = bArr[i2];
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    /* JADX INFO: renamed from: k */
    public static byte m16674k(long j2) {
        byte b2 = (byte) j2;
        jk.m15374h(((long) b2) == j2, "Out of range: %s", j2);
        return b2;
    }

    /* JADX INFO: renamed from: n */
    public static byte m16675n(byte... bArr) {
        jk.m15383q(bArr.length > 0);
        byte b2 = bArr[0];
        for (int i2 = 1; i2 < bArr.length; i2++) {
            byte b3 = bArr[i2];
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    /* JADX INFO: renamed from: q */
    public static Comparator<byte[]> m16676q() {
        return EnumC4742k.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static void m16677s(byte[] bArr, int i2, int i3) {
        jk.a9(bArr);
        jk.ek5k(i2, i3, bArr.length);
        Arrays.sort(bArr, i2, i3);
        toq.n7h(bArr, i2, i3);
    }

    public static int toq(byte b2, byte b3) {
        return b2 - b3;
    }

    /* JADX INFO: renamed from: y */
    public static void m16678y(byte[] bArr) {
        jk.a9(bArr);
        m16677s(bArr, 0, bArr.length);
    }

    public static String zy(String str, byte... bArr) {
        jk.a9(str);
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(bArr.length * 5);
        sb.append((int) bArr[0]);
        for (int i2 = 1; i2 < bArr.length; i2++) {
            sb.append(str);
            sb.append((int) bArr[i2]);
        }
        return sb.toString();
    }
}
