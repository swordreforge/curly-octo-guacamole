package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.q */
/* JADX INFO: compiled from: OggExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3393q implements InterfaceC3397p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final kja0 f64360f7l8 = new kja0() { // from class: com.google.android.exoplayer2.extractor.ogg.zy
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return C3393q.m11913g();
        }
    };

    /* JADX INFO: renamed from: y */
    private static final int f20135y = 8;

    /* JADX INFO: renamed from: g */
    private boolean f20136g;

    /* JADX INFO: renamed from: n */
    private AbstractC3394s f20137n;

    /* JADX INFO: renamed from: q */
    private x2 f20138q;

    private static gvn7 f7l8(gvn7 gvn7Var) {
        gvn7Var.n5r1(0);
        return gvn7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC3397p[] m11913g() {
        return new InterfaceC3397p[]{new C3393q()};
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* JADX INFO: renamed from: y */
    private boolean m11915y(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        C3389g c3389g = new C3389g();
        if (c3389g.m11897k(ld6Var, true) && (c3389g.f64339toq & 2) == 2) {
            int iMin = Math.min(c3389g.f20116s, 8);
            gvn7 gvn7Var = new gvn7(iMin);
            ld6Var.fn3e(gvn7Var.m13598q(), 0, iMin);
            if (toq.m11920h(f7l8(gvn7Var))) {
                this.f20137n = new toq();
            } else if (C3392p.ki(f7l8(gvn7Var))) {
                this.f20137n = new C3392p();
            } else if (C3396y.kja0(f7l8(gvn7Var))) {
                this.f20137n = new C3396y();
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        AbstractC3394s abstractC3394s = this.f20137n;
        if (abstractC3394s != null) {
            abstractC3394s.qrj(j2, j3);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f20138q = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        try {
            return m11915y(ld6Var);
        } catch (sok unused) {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        C3844k.ld6(this.f20138q);
        if (this.f20137n == null) {
            if (!m11915y(ld6Var)) {
                throw sok.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            ld6Var.mo11730y();
        }
        if (!this.f20136g) {
            InterfaceC3401t qVar = this.f20138q.toq(0, 1);
            this.f20138q.mo11753i();
            this.f20137n.m11919q(this.f20138q, qVar);
            this.f20136g = true;
        }
        return this.f20137n.f7l8(ld6Var, fu4Var);
    }
}
