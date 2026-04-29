package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.wvg;
import com.google.android.exoplayer2.extractor.x2;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.jpeg.q */
/* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3353q implements x2 {

    /* JADX INFO: renamed from: k */
    private final long f19839k;

    /* JADX INFO: renamed from: q */
    private final x2 f19840q;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.jpeg.q$k */
    /* JADX INFO: compiled from: StartOffsetExtractorOutput.java */
    class k implements o1t {

        /* JADX INFO: renamed from: q */
        final /* synthetic */ o1t f19842q;

        k(o1t o1tVar) {
            this.f19842q = o1tVar;
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        public boolean f7l8() {
            return this.f19842q.f7l8();
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: n */
        public o1t.C3388k mo11754n(long j2) {
            o1t.C3388k c3388kMo11754n = this.f19842q.mo11754n(j2);
            wvg wvgVar = c3388kMo11754n.f20107k;
            wvg wvgVar2 = new wvg(wvgVar.f20458k, wvgVar.f64719toq + C3353q.this.f19839k);
            wvg wvgVar3 = c3388kMo11754n.f64331toq;
            return new o1t.C3388k(wvgVar2, new wvg(wvgVar3.f20458k, wvgVar3.f64719toq + C3353q.this.f19839k));
        }

        @Override // com.google.android.exoplayer2.extractor.o1t
        /* JADX INFO: renamed from: s */
        public long mo11755s() {
            return this.f19842q.mo11755s();
        }
    }

    public C3353q(long j2, x2 x2Var) {
        this.f19839k = j2;
        this.f19840q = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    public void cdj(o1t o1tVar) {
        this.f19840q.cdj(new k(o1tVar));
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    /* JADX INFO: renamed from: i */
    public void mo11753i() {
        this.f19840q.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.x2
    public InterfaceC3401t toq(int i2, int i3) {
        return this.f19840q.toq(i2, i3);
    }
}
