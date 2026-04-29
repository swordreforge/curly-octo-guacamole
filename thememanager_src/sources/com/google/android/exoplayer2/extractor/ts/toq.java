package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.ts.d3;
import java.io.IOException;

/* JADX INFO: compiled from: Ac3Extractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements InterfaceC3397p {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final com.google.android.exoplayer2.extractor.kja0 f64650f7l8 = new com.google.android.exoplayer2.extractor.kja0() { // from class: com.google.android.exoplayer2.extractor.ts.k
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return toq.m12020g();
        }
    };

    /* JADX INFO: renamed from: p */
    private static final int f20380p = 2786;

    /* JADX INFO: renamed from: s */
    private static final int f20381s = 2935;

    /* JADX INFO: renamed from: y */
    private static final int f20382y = 8192;

    /* JADX INFO: renamed from: g */
    private boolean f20383g;

    /* JADX INFO: renamed from: q */
    private final zy f20385q = new zy();

    /* JADX INFO: renamed from: n */
    private final com.google.android.exoplayer2.util.gvn7 f20384n = new com.google.android.exoplayer2.util.gvn7(f20380p);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ InterfaceC3397p[] m12020g() {
        return new InterfaceC3397p[]{new toq()};
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f20383g = false;
        this.f20385q.zy();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        this.f20385q.mo11945q(x2Var, new d3.C3406n(0, 1));
        x2Var.mo11753i();
        x2Var.cdj(new o1t.toq(C3548p.f65257toq));
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        com.google.android.exoplayer2.util.gvn7 gvn7Var = new com.google.android.exoplayer2.util.gvn7(10);
        int i2 = 0;
        while (true) {
            ld6Var.fn3e(gvn7Var.m13598q(), 0, 10);
            gvn7Var.n5r1(0);
            if (gvn7Var.oc() != 4801587) {
                break;
            }
            gvn7Var.hyr(3);
            int iFti = gvn7Var.fti();
            i2 += iFti + 10;
            ld6Var.qrj(iFti);
        }
        ld6Var.mo11730y();
        ld6Var.qrj(i2);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            ld6Var.fn3e(gvn7Var.m13598q(), 0, 6);
            gvn7Var.n5r1(0);
            if (gvn7Var.lvui() != f20381s) {
                ld6Var.mo11730y();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                ld6Var.qrj(i4);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iM11521g = com.google.android.exoplayer2.audio.toq.m11521g(gvn7Var.m13598q());
                if (iM11521g == -1) {
                    return false;
                }
                ld6Var.qrj(iM11521g - 6);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        int i2 = ld6Var.read(this.f20384n.m13598q(), 0, f20380p);
        if (i2 == -1) {
            return -1;
        }
        this.f20384n.n5r1(0);
        this.f20384n.m13595l(i2);
        if (!this.f20383g) {
            this.f20385q.mo11943g(0L, 4);
            this.f20383g = true;
        }
        this.f20385q.toq(this.f20384n);
        return 0;
    }
}
