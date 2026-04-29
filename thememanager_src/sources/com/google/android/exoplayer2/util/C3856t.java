package com.google.android.exoplayer2.util;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.t */
/* JADX INFO: compiled from: NalUnitUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3856t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f67069f7l8 = 39;

    /* JADX INFO: renamed from: g */
    private static final int f23269g = 7;

    /* JADX INFO: renamed from: k */
    private static final String f23270k = "NalUnitUtil";

    /* JADX INFO: renamed from: n */
    private static final int f23271n = 6;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f67071zy = 255;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final byte[] f67070toq = {0, 0, 0, 1};

    /* JADX INFO: renamed from: q */
    public static final float[] f23272q = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: y */
    private static final Object f23274y = new Object();

    /* JADX INFO: renamed from: s */
    private static int[] f23273s = new int[10];

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.t$k */
    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final int f67072f7l8;

        /* JADX INFO: renamed from: g */
        public final int f23275g;

        /* JADX INFO: renamed from: k */
        public final int f23276k;

        /* JADX INFO: renamed from: n */
        public final int[] f23277n;

        /* JADX INFO: renamed from: p */
        public final float f23278p;

        /* JADX INFO: renamed from: q */
        public final int f23279q;

        /* JADX INFO: renamed from: s */
        public final int f23280s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f67073toq;

        /* JADX INFO: renamed from: y */
        public final int f23281y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f67074zy;

        public k(int i2, boolean z2, int i3, int i4, int[] iArr, int i5, int i6, int i7, int i8, float f2) {
            this.f23276k = i2;
            this.f67073toq = z2;
            this.f67074zy = i3;
            this.f23279q = i4;
            this.f23277n = iArr;
            this.f23275g = i5;
            this.f67072f7l8 = i6;
            this.f23281y = i7;
            this.f23280s = i8;
            this.f23278p = f2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.t$toq */
    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final int f23282k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67075toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final boolean f67076zy;

        public toq(int i2, int i3, boolean z2) {
            this.f23282k = i2;
            this.f67075toq = i3;
            this.f67076zy = z2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.t$zy */
    /* JADX INFO: compiled from: NalUnitUtil.java */
    public static final class zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public final float f67077f7l8;

        /* JADX INFO: renamed from: g */
        public final int f23283g;

        /* JADX INFO: renamed from: k */
        public final int f23284k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public final int f67078ld6;

        /* JADX INFO: renamed from: n */
        public final int f23285n;

        /* JADX INFO: renamed from: p */
        public final int f23286p;

        /* JADX INFO: renamed from: q */
        public final int f23287q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public final boolean f67079qrj;

        /* JADX INFO: renamed from: s */
        public final boolean f23288s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67080toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public final int f67081x2;

        /* JADX INFO: renamed from: y */
        public final boolean f23289y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f67082zy;

        public zy(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z2, boolean z3, int i8, int i9, int i10, boolean z5) {
            this.f23284k = i2;
            this.f67080toq = i3;
            this.f67082zy = i4;
            this.f23287q = i5;
            this.f23285n = i6;
            this.f23283g = i7;
            this.f67077f7l8 = f2;
            this.f23289y = z2;
            this.f23288s = z3;
            this.f23286p = i8;
            this.f67078ld6 = i9;
            this.f67081x2 = i10;
            this.f67079qrj = z5;
        }
    }

    private C3856t() {
    }

    public static int cdj(byte[] bArr, int i2) {
        int i3;
        synchronized (f23274y) {
            int iM13730q = 0;
            int i4 = 0;
            while (iM13730q < i2) {
                try {
                    iM13730q = m13730q(bArr, iM13730q, i2);
                    if (iM13730q < i2) {
                        int[] iArr = f23273s;
                        if (iArr.length <= i4) {
                            f23273s = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f23273s[i4] = iM13730q;
                        iM13730q += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f23273s[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i3 - i5);
        }
        return i3;
    }

    public static boolean f7l8(@zy.dd String str, byte b2) {
        if (wvg.f23310p.equals(str) && (b2 & com.google.common.base.zy.f68113d3) == 6) {
            return true;
        }
        return wvg.f67117ld6.equals(str) && ((b2 & 126) >> 1) == 39;
    }

    /* JADX INFO: renamed from: g */
    public static int m13725g(byte[] bArr, int i2) {
        return bArr[i2 + 3] & com.google.common.base.zy.f68113d3;
    }

    /* JADX INFO: renamed from: h */
    private static void m13726h(d3 d3Var) {
        int iM13572y = d3Var.m13572y();
        boolean zM13570q = false;
        int i2 = 0;
        for (int i3 = 0; i3 < iM13572y; i3++) {
            if (i3 != 0) {
                zM13570q = d3Var.m13570q();
            }
            if (zM13570q) {
                d3Var.ld6();
                d3Var.m13572y();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (d3Var.m13570q()) {
                        d3Var.ld6();
                    }
                }
            } else {
                int iM13572y2 = d3Var.m13572y();
                int iM13572y3 = d3Var.m13572y();
                int i5 = iM13572y2 + iM13572y3;
                for (int i6 = 0; i6 < iM13572y2; i6++) {
                    d3Var.m13572y();
                    d3Var.ld6();
                }
                for (int i7 = 0; i7 < iM13572y3; i7++) {
                    d3Var.m13572y();
                    d3Var.ld6();
                }
                i2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m13727k(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void kja0(d3 d3Var, int i2) {
        int iF7l8 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i2; i4++) {
            if (iF7l8 != 0) {
                iF7l8 = ((d3Var.f7l8() + i3) + 256) % 256;
            }
            if (iF7l8 != 0) {
                i3 = iF7l8;
            }
        }
    }

    public static toq ld6(byte[] bArr, int i2, int i3) {
        d3 d3Var = new d3(bArr, i2, i3);
        int iM13572y = d3Var.m13572y();
        int iM13572y2 = d3Var.m13572y();
        d3Var.ld6();
        return new toq(iM13572y, iM13572y2, d3Var.m13570q());
    }

    /* JADX INFO: renamed from: n */
    public static int m13728n(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    private static void n7h(d3 d3Var) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (d3Var.m13570q()) {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        d3Var.f7l8();
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        d3Var.f7l8();
                    }
                } else {
                    d3Var.m13572y();
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static toq m13729p(byte[] bArr, int i2, int i3) {
        return ld6(bArr, i2 + 1, i3);
    }

    /* JADX INFO: renamed from: q */
    private static int m13730q(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161 A[PHI: r1
      0x0161: PHI (r1v8 float) = (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v7 float), (r1v10 float) binds: [B:71:0x011c, B:73:0x0122, B:83:0x0149, B:77:0x0138, B:78:0x013a, B:79:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.util.C3856t.zy qrj(byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.util.C3856t.qrj(byte[], int, int):com.google.android.exoplayer2.util.t$zy");
    }

    /* JADX INFO: renamed from: s */
    public static k m13731s(byte[] bArr, int i2, int i3) {
        d3 d3Var = new d3(bArr, i2, i3);
        d3Var.x2(4);
        int iM13569n = d3Var.m13569n(3);
        d3Var.ld6();
        int iM13569n2 = d3Var.m13569n(2);
        boolean zM13570q = d3Var.m13570q();
        int iM13569n3 = d3Var.m13569n(5);
        int i4 = 0;
        for (int i5 = 0; i5 < 32; i5++) {
            if (d3Var.m13570q()) {
                i4 |= 1 << i5;
            }
        }
        int[] iArr = new int[6];
        for (int i6 = 0; i6 < 6; i6++) {
            iArr[i6] = d3Var.m13569n(8);
        }
        int iM13569n4 = d3Var.m13569n(8);
        int i7 = 0;
        for (int i8 = 0; i8 < iM13569n; i8++) {
            if (d3Var.m13570q()) {
                i7 += 89;
            }
            if (d3Var.m13570q()) {
                i7 += 8;
            }
        }
        d3Var.x2(i7);
        if (iM13569n > 0) {
            d3Var.x2((8 - iM13569n) * 2);
        }
        int iM13572y = d3Var.m13572y();
        int iM13572y2 = d3Var.m13572y();
        if (iM13572y2 == 3) {
            d3Var.ld6();
        }
        int iM13572y3 = d3Var.m13572y();
        int iM13572y4 = d3Var.m13572y();
        if (d3Var.m13570q()) {
            int iM13572y5 = d3Var.m13572y();
            int iM13572y6 = d3Var.m13572y();
            int iM13572y7 = d3Var.m13572y();
            int iM13572y8 = d3Var.m13572y();
            iM13572y3 -= ((iM13572y2 == 1 || iM13572y2 == 2) ? 2 : 1) * (iM13572y5 + iM13572y6);
            iM13572y4 -= (iM13572y2 == 1 ? 2 : 1) * (iM13572y7 + iM13572y8);
        }
        d3Var.m13572y();
        d3Var.m13572y();
        int iM13572y9 = d3Var.m13572y();
        for (int i9 = d3Var.m13570q() ? 0 : iM13569n; i9 <= iM13569n; i9++) {
            d3Var.m13572y();
            d3Var.m13572y();
            d3Var.m13572y();
        }
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        d3Var.m13572y();
        if (d3Var.m13570q() && d3Var.m13570q()) {
            n7h(d3Var);
        }
        d3Var.x2(2);
        if (d3Var.m13570q()) {
            d3Var.x2(8);
            d3Var.m13572y();
            d3Var.m13572y();
            d3Var.ld6();
        }
        m13726h(d3Var);
        if (d3Var.m13570q()) {
            for (int i10 = 0; i10 < d3Var.m13572y(); i10++) {
                d3Var.x2(iM13572y9 + 4 + 1);
            }
        }
        d3Var.x2(2);
        float f2 = 1.0f;
        if (d3Var.m13570q()) {
            if (d3Var.m13570q()) {
                int iM13569n5 = d3Var.m13569n(8);
                if (iM13569n5 == 255) {
                    int iM13569n6 = d3Var.m13569n(16);
                    int iM13569n7 = d3Var.m13569n(16);
                    if (iM13569n6 != 0 && iM13569n7 != 0) {
                        f2 = iM13569n6 / iM13569n7;
                    }
                } else {
                    float[] fArr = f23272q;
                    if (iM13569n5 < fArr.length) {
                        f2 = fArr[iM13569n5];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iM13569n5);
                        ni7.qrj(f23270k, sb.toString());
                    }
                }
            }
            if (d3Var.m13570q()) {
                d3Var.ld6();
            }
            if (d3Var.m13570q()) {
                d3Var.x2(4);
                if (d3Var.m13570q()) {
                    d3Var.x2(24);
                }
            }
            if (d3Var.m13570q()) {
                d3Var.m13572y();
                d3Var.m13572y();
            }
            d3Var.ld6();
            if (d3Var.m13570q()) {
                iM13572y4 *= 2;
            }
        }
        return new k(iM13569n2, zM13570q, iM13569n3, i4, iArr, iM13569n4, iM13572y, iM13572y3, iM13572y4, f2);
    }

    public static void toq(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i2 + 1;
            if (i4 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i5 = byteBuffer.get(i2) & 255;
            if (i3 == 3) {
                if (i5 == 1 && (byteBuffer.get(i4) & com.google.common.base.zy.f68113d3) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i2 - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i5 == 0) {
                i3++;
            }
            if (i5 != 0) {
                i3 = 0;
            }
            i2 = i4;
        }
    }

    public static zy x2(byte[] bArr, int i2, int i3) {
        return qrj(bArr, i2 + 1, i3);
    }

    /* JADX INFO: renamed from: y */
    public static k m13732y(byte[] bArr, int i2, int i3) {
        return m13731s(bArr, i2 + 2, i3);
    }

    public static int zy(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        C3844k.m13633s(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            m13727k(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            m13727k(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            m13727k(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    m13727k(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }
}
