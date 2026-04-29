package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.flv.AbstractC3345n;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.video.C3873k;
import com.google.android.exoplayer2.xwq3;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.g */
/* JADX INFO: compiled from: VideoTagPayloadReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3343g extends AbstractC3345n {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63722ld6 = 0;

    /* JADX INFO: renamed from: p */
    private static final int f19785p = 5;

    /* JADX INFO: renamed from: s */
    private static final int f19786s = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f63723x2 = 1;

    /* JADX INFO: renamed from: y */
    private static final int f19787y = 7;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63724f7l8;

    /* JADX INFO: renamed from: g */
    private boolean f19788g;

    /* JADX INFO: renamed from: n */
    private boolean f19789n;

    /* JADX INFO: renamed from: q */
    private int f19790q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final gvn7 f63725toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final gvn7 f63726zy;

    public C3343g(InterfaceC3401t interfaceC3401t) {
        super(interfaceC3401t);
        this.f63725toq = new gvn7(C3856t.f67070toq);
        this.f63726zy = new gvn7(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    /* JADX INFO: renamed from: q */
    public void mo11711q() {
        this.f19788g = false;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    protected boolean toq(gvn7 gvn7Var) throws AbstractC3345n.k {
        int iJp0y = gvn7Var.jp0y();
        int i2 = (iJp0y >> 4) & 15;
        int i3 = iJp0y & 15;
        if (i3 == 7) {
            this.f63724f7l8 = i2;
            return i2 != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i3);
        throw new AbstractC3345n.k(sb.toString());
    }

    @Override // com.google.android.exoplayer2.extractor.flv.AbstractC3345n
    protected boolean zy(gvn7 gvn7Var, long j2) throws sok {
        int iJp0y = gvn7Var.jp0y();
        long jM13592h = j2 + (((long) gvn7Var.m13592h()) * 1000);
        if (iJp0y == 0 && !this.f19789n) {
            gvn7 gvn7Var2 = new gvn7(new byte[gvn7Var.m13594k()]);
            gvn7Var.ld6(gvn7Var2.m13598q(), 0, gvn7Var.m13594k());
            C3873k qVar = C3873k.toq(gvn7Var2);
            this.f19790q = qVar.f67179toq;
            this.f19797k.mo11931q(new xwq3.toq().m13945m(wvg.f23310p).d3(qVar.f23420g).bf2(qVar.f67180zy).ncyb(qVar.f23423q).nn86(qVar.f23422n).hyr(qVar.f23421k).a9());
            this.f19789n = true;
            return false;
        }
        if (iJp0y != 1 || !this.f19789n) {
            return false;
        }
        int i2 = this.f63724f7l8 == 1 ? 1 : 0;
        if (!this.f19788g && i2 == 0) {
            return false;
        }
        byte[] bArrM13598q = this.f63726zy.m13598q();
        bArrM13598q[0] = 0;
        bArrM13598q[1] = 0;
        bArrM13598q[2] = 0;
        int i3 = 4 - this.f19790q;
        int i4 = 0;
        while (gvn7Var.m13594k() > 0) {
            gvn7Var.ld6(this.f63726zy.m13598q(), i3, this.f19790q);
            this.f63726zy.n5r1(0);
            int iEqxt = this.f63726zy.eqxt();
            this.f63725toq.n5r1(0);
            this.f19797k.zy(this.f63725toq, 4);
            this.f19797k.zy(gvn7Var, iEqxt);
            i4 = i4 + 4 + iEqxt;
        }
        this.f19797k.mo11930n(jM13592h, i2, i4, 0, null);
        this.f19788g = true;
        return true;
    }
}
