package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.decoder.C3298y;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.ni7;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import com.google.common.primitives.C4746s;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SubtitleExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 implements InterfaceC3397p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f65693cdj = 2;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f65694fn3e = 1024;

    /* JADX INFO: renamed from: h */
    private static final int f21912h = 1;

    /* JADX INFO: renamed from: i */
    private static final int f21913i = 5;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f65695ki = 3;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f65696kja0 = 0;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int f65697t8r = 4;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final xwq3 f65698f7l8;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private InterfaceC3401t f65699ld6;

    /* JADX INFO: renamed from: p */
    private com.google.android.exoplayer2.extractor.x2 f21916p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3691y f21917q;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f65702x2;

    /* JADX INFO: renamed from: n */
    private final C3659q f21915n = new C3659q();

    /* JADX INFO: renamed from: g */
    private final gvn7 f21914g = new gvn7();

    /* JADX INFO: renamed from: y */
    private final List<Long> f21919y = new ArrayList();

    /* JADX INFO: renamed from: s */
    private final List<gvn7> f21918s = new ArrayList();

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f65701qrj = 0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private long f65700n7h = C3548p.f65257toq;

    public ld6(InterfaceC3691y interfaceC3691y, xwq3 xwq3Var) {
        this.f21917q = interfaceC3691y;
        this.f65698f7l8 = xwq3Var.toq().m13945m(wvg.f67147y9n).d3(xwq3Var.f23682r).a9();
    }

    private boolean f7l8(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return ld6Var.zy((ld6Var.getLength() > (-1L) ? 1 : (ld6Var.getLength() == (-1L) ? 0 : -1)) != 0 ? C4746s.m16718q(ld6Var.getLength()) : 1024) == -1;
    }

    /* JADX INFO: renamed from: g */
    private boolean m12907g(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        int qVar = this.f21914g.toq();
        int i2 = this.f65702x2;
        if (qVar == i2) {
            this.f21914g.zy(i2 + 1024);
        }
        int i3 = ld6Var.read(this.f21914g.m13598q(), this.f65702x2, this.f21914g.toq() - this.f65702x2);
        if (i3 != -1) {
            this.f65702x2 += i3;
        }
        long length = ld6Var.getLength();
        return (length != -1 && ((long) this.f65702x2) == length) || i3 == -1;
    }

    /* JADX INFO: renamed from: n */
    private void m12908n() throws C3298y, IOException {
        try {
            x2 x2VarMo11564q = this.f21917q.mo11564q();
            while (x2VarMo11564q == null) {
                Thread.sleep(5L);
                x2VarMo11564q = this.f21917q.mo11564q();
            }
            x2VarMo11564q.ki(this.f65702x2);
            x2VarMo11564q.f19612g.put(this.f21914g.m13598q(), 0, this.f65702x2);
            x2VarMo11564q.f19612g.limit(this.f65702x2);
            this.f21917q.zy(x2VarMo11564q);
            qrj qVar = this.f21917q.toq();
            while (qVar == null) {
                Thread.sleep(5L);
                qVar = this.f21917q.toq();
            }
            for (int i2 = 0; i2 < qVar.mo12858n(); i2++) {
                byte[] bArrM12921k = this.f21915n.m12921k(qVar.zy(qVar.mo12859q(i2)));
                this.f21919y.add(Long.valueOf(qVar.mo12859q(i2)));
                this.f21918s.add(new gvn7(bArrM12921k));
            }
            qVar.cdj();
        } catch (C3660s e2) {
            throw sok.createForMalformedContainer("SubtitleDecoder failed.", e2);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: y */
    private void m12909y() {
        C3844k.ld6(this.f65699ld6);
        C3844k.m13633s(this.f21919y.size() == this.f21918s.size());
        long j2 = this.f65700n7h;
        for (int iM13675y = j2 == C3548p.f65257toq ? 0 : lrht.m13675y(this.f21919y, Long.valueOf(j2), true, true); iM13675y < this.f21918s.size(); iM13675y++) {
            gvn7 gvn7Var = this.f21918s.get(iM13675y);
            gvn7Var.n5r1(0);
            int length = gvn7Var.m13598q().length;
            this.f65699ld6.zy(gvn7Var, length);
            this.f65699ld6.mo11930n(this.f21919y.get(iM13675y).longValue(), 1, length, 0, null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        int i2 = this.f65701qrj;
        C3844k.m13633s((i2 == 0 || i2 == 5) ? false : true);
        this.f65700n7h = j3;
        if (this.f65701qrj == 2) {
            this.f65701qrj = 1;
        }
        if (this.f65701qrj == 4) {
            this.f65701qrj = 3;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(com.google.android.exoplayer2.extractor.x2 x2Var) {
        C3844k.m13633s(this.f65701qrj == 0);
        this.f21916p = x2Var;
        this.f65699ld6 = x2Var.toq(0, 3);
        this.f21916p.mo11753i();
        this.f21916p.cdj(new ni7(new long[]{0}, new long[]{0}, C3548p.f65257toq));
        this.f65699ld6.mo11931q(this.f65698f7l8);
        this.f65701qrj = 1;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
        if (this.f65701qrj == 5) {
            return;
        }
        this.f21917q.release();
        this.f65701qrj = 5;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws C3298y, IOException {
        int i2 = this.f65701qrj;
        C3844k.m13633s((i2 == 0 || i2 == 5) ? false : true);
        if (this.f65701qrj == 1) {
            this.f21914g.dd(ld6Var.getLength() != -1 ? C4746s.m16718q(ld6Var.getLength()) : 1024);
            this.f65702x2 = 0;
            this.f65701qrj = 2;
        }
        if (this.f65701qrj == 2 && m12907g(ld6Var)) {
            m12908n();
            m12909y();
            this.f65701qrj = 4;
        }
        if (this.f65701qrj == 3 && f7l8(ld6Var)) {
            m12909y();
            this.f65701qrj = 4;
        }
        return this.f65701qrj == 4 ? -1 : 0;
    }
}
