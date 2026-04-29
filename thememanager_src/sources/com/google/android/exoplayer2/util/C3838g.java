package com.google.android.exoplayer2.util;

import android.util.Pair;
import androidx.exifinterface.media.C0846k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.g */
/* JADX INFO: compiled from: CodecSpecificDataUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3838g {

    /* JADX INFO: renamed from: k */
    private static final byte[] f23194k = {0, 0, 0, 1};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String[] f66989toq = {"", C0846k.l0, "B", com.market.sdk.reflect.toq.f28134q};

    private C3838g() {
    }

    public static Pair<Integer, Integer> f7l8(byte[] bArr) {
        gvn7 gvn7Var = new gvn7(bArr);
        gvn7Var.n5r1(9);
        int iJp0y = gvn7Var.jp0y();
        gvn7Var.n5r1(20);
        return Pair.create(Integer.valueOf(gvn7Var.eqxt()), Integer.valueOf(iJp0y));
    }

    /* JADX INFO: renamed from: g */
    private static boolean m13585g(byte[] bArr, int i2) {
        if (bArr.length - i2 <= f23194k.length) {
            return false;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr2 = f23194k;
            if (i3 >= bArr2.length) {
                return true;
            }
            if (bArr[i2 + i3] != bArr2[i3]) {
                return false;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m13586k(int i2, int i3, int i4) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* JADX INFO: renamed from: n */
    private static int m13587n(byte[] bArr, int i2) {
        int length = bArr.length - f23194k.length;
        while (i2 <= length) {
            if (m13585g(bArr, i2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static byte[] m13588q(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = f23194k;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, bArr2.length, i3);
        return bArr3;
    }

    @zy.dd
    /* JADX INFO: renamed from: s */
    public static byte[][] m13589s(byte[] bArr) {
        if (!m13585g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iM13587n = 0;
        do {
            arrayList.add(Integer.valueOf(iM13587n));
            iM13587n = m13587n(bArr, iM13587n + f23194k.length);
        } while (iM13587n != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            int iIntValue2 = (i2 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }

    public static List<byte[]> toq(boolean z2) {
        return Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
    }

    /* JADX INFO: renamed from: y */
    public static boolean m13590y(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static String zy(int i2, boolean z2, int i3, int i4, int[] iArr, int i5) {
        Object[] objArr = new Object[5];
        objArr[0] = f66989toq[i2];
        objArr[1] = Integer.valueOf(i3);
        objArr[2] = Integer.valueOf(i4);
        objArr[3] = Character.valueOf(z2 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i5);
        StringBuilder sb = new StringBuilder(lrht.gvn7("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }
}
