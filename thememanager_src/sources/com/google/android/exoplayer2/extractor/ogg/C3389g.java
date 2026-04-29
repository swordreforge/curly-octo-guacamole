package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.qrj;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.g */
/* JADX INFO: compiled from: OggPageHeader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3389g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64332cdj = 4;

    /* JADX INFO: renamed from: h */
    private static final int f20110h = 1332176723;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f64333kja0 = 65307;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f64334n7h = 65025;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f64335qrj = 255;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f64336x2 = 27;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public int f64337f7l8;

    /* JADX INFO: renamed from: g */
    public long f20111g;

    /* JADX INFO: renamed from: k */
    public int f20112k;

    /* JADX INFO: renamed from: n */
    public long f20113n;

    /* JADX INFO: renamed from: q */
    public long f20115q;

    /* JADX INFO: renamed from: s */
    public int f20116s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f64339toq;

    /* JADX INFO: renamed from: y */
    public int f20117y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public long f64340zy;

    /* JADX INFO: renamed from: p */
    public final int[] f20114p = new int[255];

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final gvn7 f64338ld6 = new gvn7(255);

    C3389g() {
    }

    /* JADX INFO: renamed from: k */
    public boolean m11897k(com.google.android.exoplayer2.extractor.ld6 ld6Var, boolean z2) throws IOException {
        toq();
        this.f64338ld6.dd(27);
        if (!qrj.toq(ld6Var, this.f64338ld6.m13598q(), 0, 27, z2) || this.f64338ld6.d3() != 1332176723) {
            return false;
        }
        int iJp0y = this.f64338ld6.jp0y();
        this.f20112k = iJp0y;
        if (iJp0y != 0) {
            if (z2) {
                return false;
            }
            throw sok.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f64339toq = this.f64338ld6.jp0y();
        this.f64340zy = this.f64338ld6.m13593i();
        this.f20115q = this.f64338ld6.zurt();
        this.f20113n = this.f64338ld6.zurt();
        this.f20111g = this.f64338ld6.zurt();
        int iJp0y2 = this.f64338ld6.jp0y();
        this.f64337f7l8 = iJp0y2;
        this.f20117y = iJp0y2 + 27;
        this.f64338ld6.dd(iJp0y2);
        if (!qrj.toq(ld6Var, this.f64338ld6.m13598q(), 0, this.f64337f7l8, z2)) {
            return false;
        }
        for (int i2 = 0; i2 < this.f64337f7l8; i2++) {
            this.f20114p[i2] = this.f64338ld6.jp0y();
            this.f20116s += this.f20114p[i2];
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (r10 == (-1)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r9.getPosition() >= r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9.zy(1) == (-1)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m11898q(com.google.android.exoplayer2.extractor.ld6 r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            long r0 = r9.getPosition()
            long r2 = r9.x2()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            com.google.android.exoplayer2.util.C3844k.m13629k(r0)
            com.google.android.exoplayer2.util.gvn7 r0 = r8.f64338ld6
            r3 = 4
            r0.dd(r3)
        L1a:
            r4 = -1
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            long r4 = r9.getPosition()
            r6 = 4
            long r4 = r4 + r6
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 >= 0) goto L51
        L2b:
            com.google.android.exoplayer2.util.gvn7 r4 = r8.f64338ld6
            byte[] r4 = r4.m13598q()
            boolean r4 = com.google.android.exoplayer2.extractor.qrj.toq(r9, r4, r1, r3, r2)
            if (r4 == 0) goto L51
            com.google.android.exoplayer2.util.gvn7 r0 = r8.f64338ld6
            r0.n5r1(r1)
            com.google.android.exoplayer2.util.gvn7 r0 = r8.f64338ld6
            long r4 = r0.d3()
            r6 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L4d
            r9.mo11730y()
            return r2
        L4d:
            r9.cdj(r2)
            goto L1a
        L51:
            if (r0 == 0) goto L5b
            long r3 = r9.getPosition()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L63
        L5b:
            int r3 = r9.zy(r2)
            r4 = -1
            if (r3 == r4) goto L63
            goto L51
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.ogg.C3389g.m11898q(com.google.android.exoplayer2.extractor.ld6, long):boolean");
    }

    public void toq() {
        this.f20112k = 0;
        this.f64339toq = 0;
        this.f64340zy = 0L;
        this.f20115q = 0L;
        this.f20113n = 0L;
        this.f20111g = 0L;
        this.f64337f7l8 = 0;
        this.f20117y = 0;
        this.f20116s = 0;
    }

    public boolean zy(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return m11898q(ld6Var, -1L);
    }
}
