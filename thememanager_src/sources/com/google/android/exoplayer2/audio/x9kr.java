package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x9kr {

    /* JADX INFO: renamed from: k */
    public static final int f19499k = 4096;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63522ld6 = 1152;

    /* JADX INFO: renamed from: p */
    private static final int f19501p = 384;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f63523qrj = 576;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63524toq = 40000;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f63525x2 = 1152;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String[] f63526zy = {com.google.android.exoplayer2.util.wvg.f67087a9, com.google.android.exoplayer2.util.wvg.f67104fti, com.google.android.exoplayer2.util.wvg.f67113jk};

    /* JADX INFO: renamed from: q */
    private static final int[] f19502q = {44100, ncyb.f19427k, 32000};

    /* JADX INFO: renamed from: n */
    private static final int[] f19500n = {32000, 64000, 96000, 128000, 160000, d2ok.f19306k, 224000, C3258k.f19406s, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: g */
    private static final int[] f19498g = {32000, ncyb.f19427k, 56000, 64000, toq.f19473k, 96000, 112000, 128000, 144000, 160000, 176000, d2ok.f19306k, 224000, C3258k.f19406s};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f63521f7l8 = {32000, ncyb.f19427k, 56000, 64000, toq.f19473k, 96000, 112000, 128000, 160000, d2ok.f19306k, 224000, C3258k.f19406s, 320000, 384000};

    /* JADX INFO: renamed from: y */
    private static final int[] f19504y = {32000, 40000, ncyb.f19427k, 56000, 64000, toq.f19473k, 96000, 112000, 128000, 160000, d2ok.f19306k, 224000, C3258k.f19406s, 320000};

    /* JADX INFO: renamed from: s */
    private static final int[] f19503s = {8000, C3258k.f63451f7l8, 24000, 32000, 40000, ncyb.f19427k, 56000, 64000, toq.f19473k, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.x9kr$k */
    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class C3269k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f63527f7l8;

        /* JADX INFO: renamed from: g */
        public int f19505g;

        /* JADX INFO: renamed from: k */
        public int f19506k;

        /* JADX INFO: renamed from: n */
        public int f19507n;

        /* JADX INFO: renamed from: q */
        public int f19508q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public String f63528toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f63529zy;

        /* JADX INFO: renamed from: k */
        public boolean m11535k(int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (!x9kr.x2(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.f19506k = i3;
            this.f63528toq = x9kr.f63526zy[3 - i4];
            int i7 = x9kr.f19502q[i6];
            this.f19508q = i7;
            if (i3 == 2) {
                this.f19508q = i7 / 2;
            } else if (i3 == 0) {
                this.f19508q = i7 / 4;
            }
            int i8 = (i2 >>> 9) & 1;
            this.f63527f7l8 = x9kr.ld6(i3, i4);
            if (i4 == 3) {
                int i9 = i3 == 3 ? x9kr.f19500n[i5 - 1] : x9kr.f19498g[i5 - 1];
                this.f19505g = i9;
                this.f63529zy = (((i9 * 12) / this.f19508q) + i8) * 4;
            } else {
                if (i3 == 3) {
                    int i10 = i4 == 2 ? x9kr.f63521f7l8[i5 - 1] : x9kr.f19504y[i5 - 1];
                    this.f19505g = i10;
                    this.f63529zy = ((i10 * 144) / this.f19508q) + i8;
                } else {
                    int i11 = x9kr.f19503s[i5 - 1];
                    this.f19505g = i11;
                    this.f63529zy = (((i4 == 1 ? 72 : 144) * i11) / this.f19508q) + i8;
                }
            }
            this.f19507n = ((i2 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    private x9kr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ld6(int i2, int i3) {
        if (i3 == 1) {
            if (i2 == 3) {
                return 1152;
            }
            return f63523qrj;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return f19501p;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: p */
    public static int m11531p(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!x2(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f19502q[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? f19500n[i5 - 1] : f19498g[i5 - 1]) * 12) / i7) + i8) * 4;
        }
        int i9 = i3 == 3 ? i4 == 2 ? f63521f7l8[i5 - 1] : f19504y[i5 - 1] : f19503s[i5 - 1];
        if (i3 == 3) {
            return ((i9 * 144) / i7) + i8;
        }
        return (((i4 == 1 ? 72 : 144) * i9) / i7) + i8;
    }

    public static int qrj(int i2) {
        int i3;
        int i4;
        if (!x2(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        return ld6(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x2(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }
}
