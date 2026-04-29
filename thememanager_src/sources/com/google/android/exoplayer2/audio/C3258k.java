package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.sok;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.k */
/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3258k {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f63450cdj = 5;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f63452fn3e = 31;

    /* JADX INFO: renamed from: g */
    public static final int f19399g = 100000;

    /* JADX INFO: renamed from: h */
    public static final int f19400h = 2;

    /* JADX INFO: renamed from: i */
    public static final int f19401i = 29;

    /* JADX INFO: renamed from: k */
    private static final String f19402k = "AacUtil";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f63453ki = 22;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f63454kja0 = "mp4a.40.";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63455ld6 = 15;

    /* JADX INFO: renamed from: n */
    public static final int f19403n = 512;

    /* JADX INFO: renamed from: p */
    public static final int f19404p = 8000;

    /* JADX INFO: renamed from: q */
    public static final int f19405q = 2048;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f63457qrj = -1;

    /* JADX INFO: renamed from: s */
    public static final int f19406s = 256000;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f63458t8r = 23;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63459toq = 1024;

    /* JADX INFO: renamed from: y */
    public static final int f19407y = 7000;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f63461zurt = 42;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63462zy = 1024;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f63451f7l8 = 16000;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int[] f63460x2 = {96000, 88200, 64000, ncyb.f19427k, 44100, 32000, 24000, 22050, f63451f7l8, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int[] f63456n7h = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.k$toq */
    /* JADX INFO: compiled from: AacUtil.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.k$zy */
    /* JADX INFO: compiled from: AacUtil.java */
    public static final class zy {

        /* JADX INFO: renamed from: k */
        public final int f19408k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63463toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final String f63464zy;

        private zy(int i2, int i3, String str) {
            this.f19408k = i2;
            this.f63463toq = i3;
            this.f63464zy = str;
        }
    }

    private C3258k() {
    }

    private static void f7l8(com.google.android.exoplayer2.util.jp0y jp0yVar, int i2, int i3) {
        if (jp0yVar.f7l8()) {
            com.google.android.exoplayer2.util.ni7.qrj(f19402k, "Unexpected frameLengthFlag = 1");
        }
        if (jp0yVar.f7l8()) {
            jp0yVar.t8r(14);
        }
        boolean zF7l8 = jp0yVar.f7l8();
        if (i3 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i2 == 6 || i2 == 20) {
            jp0yVar.t8r(3);
        }
        if (zF7l8) {
            if (i2 == 22) {
                jp0yVar.t8r(16);
            }
            if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                jp0yVar.t8r(3);
            }
            jp0yVar.t8r(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static zy m11487g(byte[] bArr) throws sok {
        return m11489n(new com.google.android.exoplayer2.util.jp0y(bArr), false);
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m11488k(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (true) {
            int[] iArr = f63460x2;
            if (i5 >= iArr.length) {
                break;
            }
            if (i2 == iArr[i5]) {
                i6 = i5;
            }
            i5++;
        }
        int i7 = -1;
        while (true) {
            int[] iArr2 = f63456n7h;
            if (i4 >= iArr2.length) {
                break;
            }
            if (i3 == iArr2[i4]) {
                i7 = i4;
            }
            i4++;
        }
        if (i2 != -1 && i7 != -1) {
            return toq(2, i6, i7);
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public static zy m11489n(com.google.android.exoplayer2.util.jp0y jp0yVar, boolean z2) throws sok {
        int iZy = zy(jp0yVar);
        int iM11490q = m11490q(jp0yVar);
        int iM13627y = jp0yVar.m13627y(4);
        StringBuilder sb = new StringBuilder(19);
        sb.append(f63454kja0);
        sb.append(iZy);
        String string = sb.toString();
        if (iZy == 5 || iZy == 29) {
            iM11490q = m11490q(jp0yVar);
            iZy = zy(jp0yVar);
            if (iZy == 22) {
                iM13627y = jp0yVar.m13627y(4);
            }
        }
        if (z2) {
            if (iZy != 1 && iZy != 2 && iZy != 3 && iZy != 4 && iZy != 6 && iZy != 7 && iZy != 17) {
                switch (iZy) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(42);
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(iZy);
                        throw sok.createForUnsupportedContainerFeature(sb2.toString());
                }
            }
            f7l8(jp0yVar, iZy, iM13627y);
            switch (iZy) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM13627y2 = jp0yVar.m13627y(2);
                    if (iM13627y2 == 2 || iM13627y2 == 3) {
                        StringBuilder sb3 = new StringBuilder(33);
                        sb3.append("Unsupported epConfig: ");
                        sb3.append(iM13627y2);
                        throw sok.createForUnsupportedContainerFeature(sb3.toString());
                    }
                    break;
            }
        }
        int i2 = f63456n7h[iM13627y];
        if (i2 != -1) {
            return new zy(iM11490q, i2, string);
        }
        throw sok.createForMalformedContainer(null, null);
    }

    /* JADX INFO: renamed from: q */
    private static int m11490q(com.google.android.exoplayer2.util.jp0y jp0yVar) throws sok {
        int iM13627y = jp0yVar.m13627y(4);
        if (iM13627y == 15) {
            return jp0yVar.m13627y(24);
        }
        if (iM13627y < 13) {
            return f63460x2[iM13627y];
        }
        throw sok.createForMalformedContainer(null, null);
    }

    public static byte[] toq(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    private static int zy(com.google.android.exoplayer2.util.jp0y jp0yVar) {
        int iM13627y = jp0yVar.m13627y(5);
        return iM13627y == 31 ? jp0yVar.m13627y(6) + 32 : iM13627y;
    }
}
