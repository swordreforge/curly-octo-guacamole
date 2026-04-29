package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;

/* JADX INFO: compiled from: TsUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class oc {
    private oc() {
    }

    /* JADX INFO: renamed from: k */
    public static int m12005k(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    private static long m12006q(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static boolean toq(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = -4; i6 <= 4; i6++) {
            int i7 = (i6 * gvn7.f64478wvg) + i4;
            if (i7 < i2 || i7 >= i3 || bArr[i7] != 71) {
                i5 = 0;
            } else {
                i5++;
                if (i5 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long zy(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2, int i3) {
        gvn7Var.n5r1(i2);
        if (gvn7Var.m13594k() < 5) {
            return C3548p.f65257toq;
        }
        int iKja0 = gvn7Var.kja0();
        if ((8388608 & iKja0) != 0 || ((2096896 & iKja0) >> 8) != i3) {
            return C3548p.f65257toq;
        }
        if (((iKja0 & 32) != 0) && gvn7Var.jp0y() >= 7 && gvn7Var.m13594k() >= 7) {
            if ((gvn7Var.jp0y() & 16) == 16) {
                byte[] bArr = new byte[6];
                gvn7Var.ld6(bArr, 0, 6);
                return m12006q(bArr);
            }
        }
        return C3548p.f65257toq;
    }
}
