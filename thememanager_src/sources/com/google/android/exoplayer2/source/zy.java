package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.mp3.C3363g;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;

/* JADX INFO: compiled from: BundledExtractorsAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy implements ncyb {

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.extractor.kja0 f21771k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private InterfaceC3397p f65473toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private com.google.android.exoplayer2.extractor.ld6 f65474zy;

    public zy(com.google.android.exoplayer2.extractor.kja0 kja0Var) {
        this.f21771k = kja0Var;
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    /* JADX INFO: renamed from: k */
    public void mo12771k(long j2, long j3) {
        ((InterfaceC3397p) C3844k.f7l8(this.f65473toq)).mo11688k(j2, j3);
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    /* JADX INFO: renamed from: n */
    public long mo12772n() {
        com.google.android.exoplayer2.extractor.ld6 ld6Var = this.f65474zy;
        if (ld6Var != null) {
            return ld6Var.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // com.google.android.exoplayer2.source.ncyb
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo12773q(com.google.android.exoplayer2.upstream.x2 r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.exoplayer2.extractor.x2 r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.exoplayer2.extractor.g r6 = new com.google.android.exoplayer2.extractor.g
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f65474zy = r6
            com.google.android.exoplayer2.extractor.p r8 = r7.f65473toq
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.extractor.kja0 r8 = r7.f21771k
            com.google.android.exoplayer2.extractor.p[] r8 = r8.toq(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f65473toq = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.toq(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f65473toq = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            com.google.android.exoplayer2.util.C3844k.m13633s(r14)
            r6.mo11730y()
            goto L70
        L35:
            com.google.android.exoplayer2.extractor.p r1 = r7.f65473toq
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            com.google.android.exoplayer2.extractor.p r9 = r7.f65473toq
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            com.google.android.exoplayer2.util.C3844k.m13633s(r13)
            r6.mo11730y()
            throw r8
        L57:
            com.google.android.exoplayer2.extractor.p r1 = r7.f65473toq
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            com.google.android.exoplayer2.util.C3844k.m13633s(r1)
            r6.mo11730y()
            int r0 = r0 + 1
            goto L22
        L70:
            com.google.android.exoplayer2.extractor.p r10 = r7.f65473toq
            if (r10 == 0) goto L7a
        L74:
            com.google.android.exoplayer2.extractor.p r8 = r7.f65473toq
            r8.mo11689q(r15)
            return
        L7a:
            com.google.android.exoplayer2.source.ch r10 = new com.google.android.exoplayer2.source.ch
            java.lang.String r8 = com.google.android.exoplayer2.util.lrht.hyr(r8)
            java.lang.String r11 = java.lang.String.valueOf(r8)
            int r11 = r11.length()
            int r11 = r11 + 58
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = com.google.android.exoplayer2.util.C3844k.f7l8(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.zy.mo12773q(com.google.android.exoplayer2.upstream.x2, android.net.Uri, java.util.Map, long, long, com.google.android.exoplayer2.extractor.x2):void");
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    public void release() {
        InterfaceC3397p interfaceC3397p = this.f65473toq;
        if (interfaceC3397p != null) {
            interfaceC3397p.release();
            this.f65473toq = null;
        }
        this.f65474zy = null;
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    public int toq(com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        return ((InterfaceC3397p) C3844k.f7l8(this.f65473toq)).zy((com.google.android.exoplayer2.extractor.ld6) C3844k.f7l8(this.f65474zy), fu4Var);
    }

    @Override // com.google.android.exoplayer2.source.ncyb
    public void zy() {
        InterfaceC3397p interfaceC3397p = this.f65473toq;
        if (interfaceC3397p instanceof C3363g) {
            ((C3363g) interfaceC3397p).m11821p();
        }
    }
}
