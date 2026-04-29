package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.audio.uv6;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.wav.q */
/* JADX INFO: compiled from: WavHeaderReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3427q {

    /* JADX INFO: renamed from: k */
    private static final String f20433k = "WavHeaderReader";

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.wav.q$k */
    /* JADX INFO: compiled from: WavHeaderReader.java */
    private static final class k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f64695zy = 8;

        /* JADX INFO: renamed from: k */
        public final int f20434k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f64696toq;

        private k(int i2, long j2) {
            this.f20434k = i2;
            this.f64696toq = j2;
        }

        /* JADX INFO: renamed from: k */
        public static k m12045k(ld6 ld6Var, gvn7 gvn7Var) throws IOException {
            ld6Var.fn3e(gvn7Var.m13598q(), 0, 8);
            gvn7Var.n5r1(0);
            return new k(gvn7Var.kja0(), gvn7Var.zurt());
        }
    }

    private C3427q() {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12042k(ld6 ld6Var) throws IOException {
        gvn7 gvn7Var = new gvn7(8);
        int i2 = k.m12045k(ld6Var, gvn7Var).f20434k;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        ld6Var.fn3e(gvn7Var.m13598q(), 0, 4);
        gvn7Var.n5r1(0);
        int iKja0 = gvn7Var.kja0();
        if (iKja0 == 1463899717) {
            return true;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unsupported form type: ");
        sb.append(iKja0);
        ni7.m13702q(f20433k, sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static Pair<Long, Long> m12043n(ld6 ld6Var) throws IOException {
        ld6Var.mo11730y();
        k kVarM12044q = m12044q(1684108385, ld6Var, new gvn7(8));
        ld6Var.cdj(8);
        return Pair.create(Long.valueOf(ld6Var.getPosition()), Long.valueOf(kVarM12044q.f64696toq));
    }

    /* JADX INFO: renamed from: q */
    private static k m12044q(int i2, ld6 ld6Var, gvn7 gvn7Var) throws IOException {
        k kVarM12045k = k.m12045k(ld6Var, gvn7Var);
        while (true) {
            int i3 = kVarM12045k.f20434k;
            if (i3 == i2) {
                return kVarM12045k;
            }
            StringBuilder sb = new StringBuilder(39);
            sb.append("Ignoring unknown WAV chunk: ");
            sb.append(i3);
            ni7.qrj(f20433k, sb.toString());
            long j2 = kVarM12045k.f64696toq + 8;
            if (j2 > 2147483647L) {
                int i4 = kVarM12045k.f20434k;
                StringBuilder sb2 = new StringBuilder(51);
                sb2.append("Chunk is too large (~2GB+) to skip; id: ");
                sb2.append(i4);
                throw sok.createForUnsupportedContainerFeature(sb2.toString());
            }
            ld6Var.cdj((int) j2);
            kVarM12045k = k.m12045k(ld6Var, gvn7Var);
        }
    }

    public static zy toq(ld6 ld6Var) throws IOException {
        byte[] bArr;
        gvn7 gvn7Var = new gvn7(16);
        k kVarM12044q = m12044q(uv6.f63520zy, ld6Var, gvn7Var);
        C3844k.m13633s(kVarM12044q.f64696toq >= 16);
        ld6Var.fn3e(gvn7Var.m13598q(), 0, 16);
        gvn7Var.n5r1(0);
        int iM13603z = gvn7Var.m13603z();
        int iM13603z2 = gvn7Var.m13603z();
        int iFu4 = gvn7Var.fu4();
        int iFu42 = gvn7Var.fu4();
        int iM13603z3 = gvn7Var.m13603z();
        int iM13603z4 = gvn7Var.m13603z();
        int i2 = ((int) kVarM12044q.f64696toq) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            ld6Var.fn3e(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = lrht.f23228g;
        }
        ld6Var.cdj((int) (ld6Var.x2() - ld6Var.getPosition()));
        return new zy(iM13603z, iM13603z2, iFu4, iFu42, iM13603z3, iM13603z4, bArr);
    }

    public static long zy(ld6 ld6Var) throws IOException {
        gvn7 gvn7Var = new gvn7(8);
        k kVarM12045k = k.m12045k(ld6Var, gvn7Var);
        if (kVarM12045k.f20434k != 1685272116) {
            ld6Var.mo11730y();
            return -1L;
        }
        ld6Var.qrj(8);
        gvn7Var.n5r1(0);
        ld6Var.fn3e(gvn7Var.m13598q(), 0, 8);
        long jM13593i = gvn7Var.m13593i();
        ld6Var.cdj(((int) kVarM12045k.f64696toq) + 8);
        return jM13593i;
    }
}
