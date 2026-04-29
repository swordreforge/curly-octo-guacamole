package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.h */
/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3348h {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.h$k */
    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class k {

        /* JADX INFO: renamed from: k */
        public long f19825k;
    }

    private C3348h() {
    }

    private static boolean f7l8(int i2, t8r t8rVar) {
        return i2 <= 7 ? i2 == t8rVar.f64397f7l8 - 1 : i2 <= 10 && t8rVar.f64397f7l8 == 2;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m11731g(int i2, t8r t8rVar) {
        return i2 == 0 || i2 == t8rVar.f20174s;
    }

    /* JADX INFO: renamed from: k */
    private static boolean m11732k(gvn7 gvn7Var, t8r t8rVar, int i2) {
        int iM11734p = m11734p(gvn7Var, i2);
        return iM11734p != -1 && iM11734p <= t8rVar.f64399toq;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m11733n(gvn7 gvn7Var, t8r t8rVar, int i2) {
        int i3 = t8rVar.f20171n;
        if (i2 == 0) {
            return true;
        }
        if (i2 <= 11) {
            return i2 == t8rVar.f20169g;
        }
        if (i2 == 12) {
            return gvn7Var.jp0y() * 1000 == i3;
        }
        if (i2 > 14) {
            return false;
        }
        int iLvui = gvn7Var.lvui();
        if (i2 == 14) {
            iLvui *= 10;
        }
        return iLvui == i3;
    }

    /* JADX INFO: renamed from: p */
    public static int m11734p(gvn7 gvn7Var, int i2) {
        switch (i2) {
            case 1:
                return com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return gvn7Var.jp0y() + 1;
            case 7:
                return gvn7Var.lvui() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11735q(gvn7 gvn7Var, t8r t8rVar, int i2, k kVar) {
        int iM13596n = gvn7Var.m13596n();
        long jD3 = gvn7Var.d3();
        long j2 = jD3 >>> 16;
        if (j2 != i2) {
            return false;
        }
        return f7l8((int) ((jD3 >> 4) & 15), t8rVar) && m11731g((int) ((jD3 >> 1) & 7), t8rVar) && !(((jD3 & 1) > 1L ? 1 : ((jD3 & 1) == 1L ? 0 : -1)) == 0) && zy(gvn7Var, t8rVar, ((j2 & 1) > 1L ? 1 : ((j2 & 1) == 1L ? 0 : -1)) == 0, kVar) && m11732k(gvn7Var, t8rVar, (int) ((jD3 >> 12) & 15)) && m11733n(gvn7Var, t8rVar, (int) ((jD3 >> 8) & 15)) && toq(gvn7Var, iM13596n);
    }

    /* JADX INFO: renamed from: s */
    public static long m11736s(ld6 ld6Var, t8r t8rVar) throws IOException {
        ld6Var.mo11730y();
        ld6Var.qrj(1);
        byte[] bArr = new byte[1];
        ld6Var.fn3e(bArr, 0, 1);
        boolean z2 = (bArr[0] & 1) == 1;
        ld6Var.qrj(2);
        int i2 = z2 ? 7 : 6;
        gvn7 gvn7Var = new gvn7(i2);
        gvn7Var.m13595l(qrj.zy(ld6Var, gvn7Var.m13598q(), 0, i2));
        ld6Var.mo11730y();
        k kVar = new k();
        if (zy(gvn7Var, t8rVar, z2, kVar)) {
            return kVar.f19825k;
        }
        throw sok.createForMalformedContainer(null, null);
    }

    private static boolean toq(gvn7 gvn7Var, int i2) {
        return gvn7Var.jp0y() == lrht.ni7(gvn7Var.m13598q(), i2, gvn7Var.m13596n() - 1, 0);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m11737y(ld6 ld6Var, t8r t8rVar, int i2, k kVar) throws IOException {
        long jX2 = ld6Var.x2();
        byte[] bArr = new byte[2];
        ld6Var.fn3e(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i2) {
            ld6Var.mo11730y();
            ld6Var.qrj((int) (jX2 - ld6Var.getPosition()));
            return false;
        }
        gvn7 gvn7Var = new gvn7(16);
        System.arraycopy(bArr, 0, gvn7Var.m13598q(), 0, 2);
        gvn7Var.m13595l(qrj.zy(ld6Var, gvn7Var.m13598q(), 2, 14));
        ld6Var.mo11730y();
        ld6Var.qrj((int) (jX2 - ld6Var.getPosition()));
        return m11735q(gvn7Var, t8rVar, i2, kVar);
    }

    private static boolean zy(gvn7 gvn7Var, t8r t8rVar, boolean z2, k kVar) {
        try {
            long jM13599r = gvn7Var.m13599r();
            if (!z2) {
                jM13599r *= (long) t8rVar.f64399toq;
            }
            kVar.f19825k = jM13599r;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
