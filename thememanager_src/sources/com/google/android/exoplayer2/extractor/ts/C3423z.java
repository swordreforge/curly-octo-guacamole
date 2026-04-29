package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.audio.n5r1;
import com.google.android.exoplayer2.util.C3847l;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ts.z */
/* JADX INFO: compiled from: PsDurationReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3423z {

    /* JADX INFO: renamed from: p */
    private static final int f20413p = 20000;

    /* JADX INFO: renamed from: s */
    private static final String f20414s = "PsDurationReader";

    /* JADX INFO: renamed from: n */
    private boolean f20417n;

    /* JADX INFO: renamed from: q */
    private boolean f20418q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64683zy;

    /* JADX INFO: renamed from: k */
    private final C3847l f20416k = new C3847l(0);

    /* JADX INFO: renamed from: g */
    private long f20415g = C3548p.f65257toq;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64681f7l8 = C3548p.f65257toq;

    /* JADX INFO: renamed from: y */
    private long f20419y = C3548p.f65257toq;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f64682toq = new com.google.android.exoplayer2.util.gvn7();

    C3423z() {
    }

    /* JADX INFO: renamed from: g */
    private int m12032g(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m12033k(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private long ld6(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iM13596n = gvn7Var.m13596n();
        for (int iM13591g = gvn7Var.m13591g() - 4; iM13591g >= iM13596n; iM13591g--) {
            if (m12032g(gvn7Var.m13598q(), iM13591g) == 442) {
                gvn7Var.n5r1(iM13591g + 4);
                long jX2 = x2(gvn7Var);
                if (jX2 != C3548p.f65257toq) {
                    return jX2;
                }
            }
        }
        return C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: p */
    private int m12034p(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        long length = ld6Var.getLength();
        int iMin = (int) Math.min(n5r1.f63474zurt, length);
        long j2 = length - ((long) iMin);
        if (ld6Var.getPosition() != j2) {
            fu4Var.f19818k = j2;
            return 1;
        }
        this.f64682toq.dd(iMin);
        ld6Var.mo11730y();
        ld6Var.fn3e(this.f64682toq.m13598q(), 0, iMin);
        this.f64681f7l8 = ld6(this.f64682toq);
        this.f20417n = true;
        return 0;
    }

    private static long qrj(byte[] bArr) {
        byte b2 = bArr[0];
        long j2 = (((((long) b2) & 56) >> 3) << 30) | ((((long) b2) & 3) << 28) | ((((long) bArr[1]) & 255) << 20);
        byte b3 = bArr[2];
        return j2 | (((((long) b3) & 248) >> 3) << 15) | ((((long) b3) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* JADX INFO: renamed from: s */
    private long m12035s(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iM13591g = gvn7Var.m13591g();
        for (int iM13596n = gvn7Var.m13596n(); iM13596n < iM13591g - 3; iM13596n++) {
            if (m12032g(gvn7Var.m13598q(), iM13596n) == 442) {
                gvn7Var.n5r1(iM13596n + 4);
                long jX2 = x2(gvn7Var);
                if (jX2 != C3548p.f65257toq) {
                    return jX2;
                }
            }
        }
        return C3548p.f65257toq;
    }

    private int toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) {
        this.f64682toq.x9kr(lrht.f23228g);
        this.f64683zy = true;
        ld6Var.mo11730y();
        return 0;
    }

    public static long x2(com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        int iM13596n = gvn7Var.m13596n();
        if (gvn7Var.m13594k() < 9) {
            return C3548p.f65257toq;
        }
        byte[] bArr = new byte[9];
        gvn7Var.ld6(bArr, 0, 9);
        gvn7Var.n5r1(iM13596n);
        return !m12033k(bArr) ? C3548p.f65257toq : qrj(bArr);
    }

    /* JADX INFO: renamed from: y */
    private int m12036y(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        int iMin = (int) Math.min(n5r1.f63474zurt, ld6Var.getLength());
        long j2 = 0;
        if (ld6Var.getPosition() != j2) {
            fu4Var.f19818k = j2;
            return 1;
        }
        this.f64682toq.dd(iMin);
        ld6Var.mo11730y();
        ld6Var.fn3e(this.f64682toq.m13598q(), 0, iMin);
        this.f20415g = m12035s(this.f64682toq);
        this.f20418q = true;
        return 0;
    }

    public int f7l8(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        if (!this.f20417n) {
            return m12034p(ld6Var, fu4Var);
        }
        if (this.f64681f7l8 == C3548p.f65257toq) {
            return toq(ld6Var);
        }
        if (!this.f20418q) {
            return m12036y(ld6Var, fu4Var);
        }
        long j2 = this.f20415g;
        if (j2 == C3548p.f65257toq) {
            return toq(ld6Var);
        }
        long qVar = this.f20416k.toq(this.f64681f7l8) - this.f20416k.toq(j2);
        this.f20419y = qVar;
        if (qVar < 0) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Invalid duration: ");
            sb.append(qVar);
            sb.append(". Using TIME_UNSET instead.");
            com.google.android.exoplayer2.util.ni7.qrj(f20414s, sb.toString());
            this.f20419y = C3548p.f65257toq;
        }
        return toq(ld6Var);
    }

    /* JADX INFO: renamed from: n */
    public boolean m12037n() {
        return this.f64683zy;
    }

    /* JADX INFO: renamed from: q */
    public C3847l m12038q() {
        return this.f20416k;
    }

    public long zy() {
        return this.f20419y;
    }
}
