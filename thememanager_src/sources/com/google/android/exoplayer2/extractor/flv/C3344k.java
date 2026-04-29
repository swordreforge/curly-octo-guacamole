package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.audio.C3258k;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.flv.AbstractC3345n;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.util.Collections;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.k */
/* JADX INFO: compiled from: AudioTagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3344k extends AbstractC3345n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f63727f7l8 = 8;

    /* JADX INFO: renamed from: g */
    private static final int f19791g = 7;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int[] f63728ld6 = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: n */
    private static final int f19792n = 2;

    /* JADX INFO: renamed from: p */
    private static final int f19793p = 1;

    /* JADX INFO: renamed from: s */
    private static final int f19794s = 0;

    /* JADX INFO: renamed from: y */
    private static final int f19795y = 10;

    /* JADX INFO: renamed from: q */
    private int f19796q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f63729toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f63730zy;

    public C3344k(InterfaceC3401t interfaceC3401t) {
        super(interfaceC3401t);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    /* JADX INFO: renamed from: q */
    public void mo11711q() {
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    protected boolean toq(gvn7 gvn7Var) throws AbstractC3345n.k {
        if (this.f63729toq) {
            gvn7Var.hyr(1);
        } else {
            int iJp0y = gvn7Var.jp0y();
            int i2 = (iJp0y >> 4) & 15;
            this.f19796q = i2;
            if (i2 == 2) {
                this.f19797k.mo11931q(new xwq3.toq().m13945m(wvg.f67113jk).gvn7(1).ek5k(f63728ld6[(iJp0y >> 2) & 3]).a9());
                this.f63730zy = true;
            } else if (i2 == 7 || i2 == 8) {
                this.f19797k.mo11931q(new xwq3.toq().m13945m(i2 == 7 ? wvg.f67130oc : wvg.f67100eqxt).gvn7(1).ek5k(8000).a9());
                this.f63730zy = true;
            } else if (i2 != 10) {
                int i3 = this.f19796q;
                StringBuilder sb = new StringBuilder(39);
                sb.append("Audio format not supported: ");
                sb.append(i3);
                throw new AbstractC3345n.k(sb.toString());
            }
            this.f63729toq = true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    protected boolean zy(gvn7 gvn7Var, long j2) throws sok {
        if (this.f19796q == 2) {
            int iM13594k = gvn7Var.m13594k();
            this.f19797k.zy(gvn7Var, iM13594k);
            this.f19797k.mo11930n(j2, 1, iM13594k, 0, null);
            return true;
        }
        int iJp0y = gvn7Var.jp0y();
        if (iJp0y != 0 || this.f63730zy) {
            if (this.f19796q == 10 && iJp0y != 1) {
                return false;
            }
            int iM13594k2 = gvn7Var.m13594k();
            this.f19797k.zy(gvn7Var, iM13594k2);
            this.f19797k.mo11930n(j2, 1, iM13594k2, 0, null);
            return true;
        }
        int iM13594k3 = gvn7Var.m13594k();
        byte[] bArr = new byte[iM13594k3];
        gvn7Var.ld6(bArr, 0, iM13594k3);
        C3258k.zy zyVarM11487g = C3258k.m11487g(bArr);
        this.f19797k.mo11931q(new xwq3.toq().m13945m(wvg.f67142wvg).d3(zyVarM11487g.f63464zy).gvn7(zyVarM11487g.f63463toq).ek5k(zyVarM11487g.f19408k).hyr(Collections.singletonList(bArr)).a9());
        this.f63730zy = true;
        return false;
    }
}
