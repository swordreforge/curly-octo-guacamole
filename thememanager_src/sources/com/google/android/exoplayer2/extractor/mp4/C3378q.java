package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.q */
/* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3378q {

    /* JADX INFO: renamed from: k */
    private static final int f20048k = 8192;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.q$toq */
    /* JADX INFO: compiled from: FixedSampleSizeRechunker.java */
    public static final class toq {

        /* JADX INFO: renamed from: g */
        public final long f20049g;

        /* JADX INFO: renamed from: k */
        public final long[] f20050k;

        /* JADX INFO: renamed from: n */
        public final int[] f20051n;

        /* JADX INFO: renamed from: q */
        public final long[] f20052q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int[] f64270toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f64271zy;

        private toq(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
            this.f20050k = jArr;
            this.f64270toq = iArr;
            this.f64271zy = i2;
            this.f20052q = jArr2;
            this.f20051n = iArr2;
            this.f20049g = j2;
        }
    }

    private C3378q() {
    }

    /* JADX INFO: renamed from: k */
    public static toq m11864k(int i2, long[] jArr, int[] iArr, long j2) {
        int i3 = 8192 / i2;
        int iQrj = 0;
        for (int i4 : iArr) {
            iQrj += lrht.qrj(i4, i3);
        }
        long[] jArr2 = new long[iQrj];
        int[] iArr2 = new int[iQrj];
        long[] jArr3 = new long[iQrj];
        int[] iArr3 = new int[iQrj];
        int i5 = 0;
        int i6 = 0;
        int iMax = 0;
        for (int i7 = 0; i7 < iArr.length; i7++) {
            int i8 = iArr[i7];
            long j3 = jArr[i7];
            while (i8 > 0) {
                int iMin = Math.min(i3, i8);
                jArr2[i6] = j3;
                int i9 = i2 * iMin;
                iArr2[i6] = i9;
                iMax = Math.max(iMax, i9);
                jArr3[i6] = ((long) i5) * j2;
                iArr3[i6] = 1;
                j3 += (long) iArr2[i6];
                i5 += iMin;
                i8 -= iMin;
                i6++;
            }
        }
        return new toq(jArr2, iArr2, iMax, jArr3, iArr3, j2 * ((long) i5));
    }
}
