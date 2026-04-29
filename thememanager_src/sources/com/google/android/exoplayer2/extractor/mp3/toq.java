package com.google.android.exoplayer2.extractor.mp3;

import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.util.fu4;
import com.google.android.exoplayer2.util.lrht;
import zy.yz;

/* JADX INFO: compiled from: IndexSeeker.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq implements f7l8 {

    /* JADX INFO: renamed from: y */
    @yz
    static final long f19948y = 100000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64066f7l8;

    /* JADX INFO: renamed from: g */
    private final fu4 f19949g;

    /* JADX INFO: renamed from: n */
    private final fu4 f19950n;

    /* JADX INFO: renamed from: q */
    private final long f19951q;

    public toq(long j2, long j3, long j4) {
        this.f64066f7l8 = j2;
        this.f19951q = j4;
        fu4 fu4Var = new fu4();
        this.f19950n = fu4Var;
        fu4 fu4Var2 = new fu4();
        this.f19949g = fu4Var2;
        fu4Var.m13583k(0L);
        fu4Var2.m13583k(j3);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: g */
    public long mo11813g() {
        return this.f19951q;
    }

    /* JADX INFO: renamed from: k */
    public boolean m11824k(long j2) {
        fu4 fu4Var = this.f19950n;
        return j2 - fu4Var.toq(fu4Var.zy() - 1) < f19948y;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        int iF7l8 = lrht.f7l8(this.f19950n, j2, true, true);
        wvg wvgVar = new wvg(this.f19950n.toq(iF7l8), this.f19949g.toq(iF7l8));
        if (wvgVar.f20458k == j2 || iF7l8 == this.f19950n.zy() - 1) {
            return new o1t.C3388k(wvgVar);
        }
        int i2 = iF7l8 + 1;
        return new o1t.C3388k(wvgVar, new wvg(this.f19950n.toq(i2), this.f19949g.toq(i2)));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f64066f7l8;
    }

    public void toq(long j2, long j3) {
        if (m11824k(j2)) {
            return;
        }
        this.f19950n.m13583k(j2);
        this.f19949g.m13583k(j3);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.f7l8
    /* JADX INFO: renamed from: y */
    public long mo11814y(long j2) {
        return this.f19950n.toq(lrht.f7l8(this.f19949g, j2, true, true));
    }

    void zy(long j2) {
        this.f64066f7l8 = j2;
    }
}
