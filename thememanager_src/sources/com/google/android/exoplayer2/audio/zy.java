package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.xwq3;
import com.google.android.exoplayer2.yqrt;
import java.nio.ByteBuffer;
import miuix.appcompat.internal.app.widget.ActionBarMovableLayout;
import z4j7.C7797k;

/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f63537f7l8 = {yqrt.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT, 2000, 1920, 1601, 1600, 1001, 1000, C7797k.f100634zy, ActionBarMovableLayout.n5ij, ActionBarMovableLayout.n5ij, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: g */
    public static final int f19517g = 16;

    /* JADX INFO: renamed from: k */
    public static final int f19518k = 44096;

    /* JADX INFO: renamed from: n */
    public static final int f19519n = 7;

    /* JADX INFO: renamed from: q */
    private static final int f19520q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f63538toq = 44097;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f63539zy = 336000;

    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final int f19521k;

        /* JADX INFO: renamed from: n */
        public final int f19522n;

        /* JADX INFO: renamed from: q */
        public final int f19523q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f63540toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f63541zy;

        private toq(int i2, int i3, int i4, int i5, int i6) {
            this.f19521k = i2;
            this.f63541zy = i3;
            this.f63540toq = i4;
            this.f19523q = i5;
            this.f19522n = i6;
        }
    }

    private zy() {
    }

    /* JADX INFO: renamed from: g */
    private static int m11541g(com.google.android.exoplayer2.util.jp0y jp0yVar, int i2) {
        int i3 = 0;
        while (true) {
            int iM13627y = i3 + jp0yVar.m13627y(i2);
            if (!jp0yVar.f7l8()) {
                return iM13627y;
            }
            i3 = (iM13627y + 1) << i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m11542k(int i2, com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        gvn7Var.dd(7);
        byte[] bArrM13598q = gvn7Var.m13598q();
        bArrM13598q[0] = -84;
        bArrM13598q[1] = 64;
        bArrM13598q[2] = -1;
        bArrM13598q[3] = -1;
        bArrM13598q[4] = (byte) ((i2 >> 16) & 255);
        bArrM13598q[5] = (byte) ((i2 >> 8) & 255);
        bArrM13598q[6] = (byte) (i2 & 255);
    }

    /* JADX INFO: renamed from: n */
    public static int m11543n(byte[] bArr, int i2) {
        int i3 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i4 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i4 == 65535) {
            i4 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i3 = 4;
        }
        if (i2 == 44097) {
            i3 += 2;
        }
        return i4 + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.exoplayer2.audio.zy.toq m11544q(com.google.android.exoplayer2.util.jp0y r10) {
        /*
            r0 = 16
            int r1 = r10.m13627y(r0)
            int r0 = r10.m13627y(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L18
            r0 = 24
            int r0 = r10.m13627y(r0)
            r3 = 7
            goto L19
        L18:
            r3 = r2
        L19:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L21
            int r0 = r0 + 2
        L21:
            r7 = r0
            r0 = 2
            int r1 = r10.m13627y(r0)
            r3 = 3
            if (r1 != r3) goto L2f
            int r4 = m11541g(r10, r0)
            int r1 = r1 + r4
        L2f:
            r4 = r1
            r1 = 10
            int r1 = r10.m13627y(r1)
            boolean r5 = r10.f7l8()
            if (r5 == 0) goto L45
            int r5 = r10.m13627y(r3)
            if (r5 <= 0) goto L45
            r10.t8r(r0)
        L45:
            boolean r5 = r10.f7l8()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r8 = 44100(0xac44, float:6.1797E-41)
            if (r5 == 0) goto L53
            r9 = r6
            goto L54
        L53:
            r9 = r8
        L54:
            int r10 = r10.m13627y(r2)
            r5 = 0
            if (r9 != r8) goto L65
            r8 = 13
            if (r10 != r8) goto L65
            int[] r0 = com.google.android.exoplayer2.audio.zy.f63537f7l8
            r10 = r0[r10]
            r8 = r10
            goto L91
        L65:
            if (r9 != r6) goto L90
            int[] r6 = com.google.android.exoplayer2.audio.zy.f63537f7l8
            int r8 = r6.length
            if (r10 >= r8) goto L90
            r5 = r6[r10]
            int r1 = r1 % 5
            r6 = 8
            r8 = 1
            if (r1 == r8) goto L8a
            r8 = 11
            if (r1 == r0) goto L85
            if (r1 == r3) goto L8a
            if (r1 == r2) goto L7e
            goto L90
        L7e:
            if (r10 == r3) goto L8e
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
            goto L89
        L85:
            if (r10 == r6) goto L8e
            if (r10 != r8) goto L90
        L89:
            goto L8e
        L8a:
            if (r10 == r3) goto L8e
            if (r10 != r6) goto L90
        L8e:
            int r5 = r5 + 1
        L90:
            r8 = r5
        L91:
            com.google.android.exoplayer2.audio.zy$toq r10 = new com.google.android.exoplayer2.audio.zy$toq
            r5 = 2
            r0 = 0
            r3 = r10
            r6 = r9
            r9 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.zy.m11544q(com.google.android.exoplayer2.util.jp0y):com.google.android.exoplayer2.audio.zy$toq");
    }

    public static xwq3 toq(com.google.android.exoplayer2.util.gvn7 gvn7Var, String str, String str2, @zy.dd DrmInitData drmInitData) {
        gvn7Var.hyr(1);
        return new xwq3.toq().n5r1(str).m13945m(com.google.android.exoplayer2.util.wvg.f67097dd).gvn7(2).ek5k(((gvn7Var.jp0y() & 32) >> 5) == 1 ? ncyb.f19427k : 44100).lvui(drmInitData).m13940c(str2).a9();
    }

    public static int zy(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return m11544q(new com.google.android.exoplayer2.util.jp0y(bArr)).f19522n;
    }
}
