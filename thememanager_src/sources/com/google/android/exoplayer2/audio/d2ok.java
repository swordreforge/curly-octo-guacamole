package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.xwq3;
import java.nio.ByteBuffer;
import java.util.Arrays;
import miuix.core.util.C7083n;
import z4j7.C7797k;

/* JADX INFO: compiled from: DtsUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d2ok {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final byte f63319f7l8 = 127;

    /* JADX INFO: renamed from: g */
    private static final int f19305g = -14745368;

    /* JADX INFO: renamed from: k */
    public static final int f19306k = 192000;

    /* JADX INFO: renamed from: n */
    private static final int f19307n = -25230976;

    /* JADX INFO: renamed from: p */
    private static final byte f19308p = -1;

    /* JADX INFO: renamed from: q */
    private static final int f19309q = 536864768;

    /* JADX INFO: renamed from: s */
    private static final byte f19310s = -2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63322toq = 2250000;

    /* JADX INFO: renamed from: y */
    private static final byte f19311y = 31;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f63324zy = 2147385345;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int[] f63320ld6 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int[] f63323x2 = {-1, 8000, C3258k.f63451f7l8, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, ncyb.f19427k, -1, -1};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int[] f63321qrj = {64, 112, 128, com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4, 224, 256, 384, C7083n.f39873k, 512, C7797k.f100633toq, 768, miuix.pickerwidget.date.zy.f87989qrj, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    private d2ok() {
    }

    public static xwq3 f7l8(byte[] bArr, @zy.dd String str, @zy.dd String str2, @zy.dd DrmInitData drmInitData) {
        com.google.android.exoplayer2.util.jp0y qVar = toq(bArr);
        qVar.t8r(60);
        int i2 = f63320ld6[qVar.m13627y(6)];
        int i3 = f63323x2[qVar.m13627y(4)];
        int iM13627y = qVar.m13627y(5);
        int[] iArr = f63321qrj;
        int i4 = iM13627y >= iArr.length ? -1 : (iArr[iM13627y] * 1000) / 2;
        qVar.t8r(10);
        return new xwq3.toq().n5r1(str).m13945m(com.google.android.exoplayer2.util.wvg.f67125ncyb).jp0y(i4).gvn7(i2 + (qVar.m13627y(2) > 0 ? 1 : 0)).ek5k(i3).lvui(drmInitData).m13940c(str2).a9();
    }

    /* JADX INFO: renamed from: g */
    public static int m11394g(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m11395k(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.d2ok.m11395k(byte[]):int");
    }

    /* JADX INFO: renamed from: n */
    public static int m11396n(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int iPosition = byteBuffer.position();
        byte b4 = byteBuffer.get(iPosition);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 7);
            } else if (b4 != 31) {
                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition + 5);
            } else {
                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b3 = byteBuffer.get(iPosition + 6);
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition + 4);
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11397q(int i2) {
        return i2 == f63324zy || i2 == f19307n || i2 == f19309q || i2 == f19305g;
    }

    private static com.google.android.exoplayer2.util.jp0y toq(byte[] bArr) {
        if (bArr[0] == 127) {
            return new com.google.android.exoplayer2.util.jp0y(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (zy(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b2 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b2;
            }
        }
        com.google.android.exoplayer2.util.jp0y jp0yVar = new com.google.android.exoplayer2.util.jp0y(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            com.google.android.exoplayer2.util.jp0y jp0yVar2 = new com.google.android.exoplayer2.util.jp0y(bArrCopyOf);
            while (jp0yVar2.toq() >= 16) {
                jp0yVar2.t8r(2);
                jp0yVar.m13620g(jp0yVar2.m13627y(14), 14);
            }
        }
        jp0yVar.kja0(bArrCopyOf);
        return jp0yVar;
    }

    private static boolean zy(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1;
    }
}
