package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.s */
/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3394s {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64361cdj = 3;

    /* JADX INFO: renamed from: h */
    private static final int f20139h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64362kja0 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64363n7h = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64364f7l8;

    /* JADX INFO: renamed from: g */
    private long f20140g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64365ld6;

    /* JADX INFO: renamed from: n */
    private long f20142n;

    /* JADX INFO: renamed from: q */
    private f7l8 f20144q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f64366qrj;

    /* JADX INFO: renamed from: s */
    private int f20145s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private InterfaceC3401t f64367toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f64368x2;

    /* JADX INFO: renamed from: y */
    private int f20146y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private x2 f64369zy;

    /* JADX INFO: renamed from: k */
    private final C3391n f20141k = new C3391n();

    /* JADX INFO: renamed from: p */
    private toq f20143p = new toq();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.s$toq */
    /* JADX INFO: compiled from: StreamReader.java */
    static class toq {

        /* JADX INFO: renamed from: k */
        xwq3 f20147k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        f7l8 f64370toq;

        toq() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.s$zy */
    /* JADX INFO: compiled from: StreamReader.java */
    private static final class zy implements f7l8 {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
        /* JADX INFO: renamed from: k */
        public long mo11896k(com.google.android.exoplayer2.extractor.ld6 ld6Var) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
        public o1t toq() {
            return new o1t.toq(C3548p.f65257toq);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f7l8
        public void zy(long j2) {
        }
    }

    @EnsuresNonNull({"trackOutput", "extractorOutput"})
    /* JADX INFO: renamed from: k */
    private void m11916k() {
        C3844k.ld6(this.f64367toq);
        lrht.ld6(this.f64369zy);
    }

    @RequiresNonNull({"trackOutput", "oggSeeker", "extractorOutput"})
    private int ld6(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        long jMo11896k = this.f20144q.mo11896k(ld6Var);
        if (jMo11896k >= 0) {
            fu4Var.f19818k = jMo11896k;
            return 1;
        }
        if (jMo11896k < -1) {
            mo11911n(-(jMo11896k + 2));
        }
        if (!this.f64368x2) {
            this.f64369zy.cdj((o1t) C3844k.ld6(this.f20144q.toq()));
            this.f64368x2 = true;
        }
        if (this.f64365ld6 <= 0 && !this.f20141k.m11908q(ld6Var)) {
            this.f20146y = 3;
            return -1;
        }
        this.f64365ld6 = 0L;
        gvn7 gvn7VarZy = this.f20141k.zy();
        long jMo11910g = mo11910g(gvn7VarZy);
        if (jMo11910g >= 0) {
            long j2 = this.f64364f7l8;
            if (j2 + jMo11910g >= this.f20142n) {
                long qVar = toq(j2);
                this.f64367toq.zy(gvn7VarZy, gvn7VarZy.m13591g());
                this.f64367toq.mo11930n(qVar, 1, gvn7VarZy.m13591g(), 0, null);
                this.f20142n = -1L;
            }
        }
        this.f64364f7l8 += jMo11910g;
        return 0;
    }

    @RequiresNonNull({"trackOutput"})
    /* JADX INFO: renamed from: p */
    private int m11917p(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        if (!m11918y(ld6Var)) {
            return -1;
        }
        xwq3 xwq3Var = this.f20143p.f20147k;
        this.f20145s = xwq3Var.f23668d;
        if (!this.f64366qrj) {
            this.f64367toq.mo11931q(xwq3Var);
            this.f64366qrj = true;
        }
        f7l8 f7l8Var = this.f20143p.f64370toq;
        if (f7l8Var != null) {
            this.f20144q = f7l8Var;
        } else if (ld6Var.getLength() == -1) {
            this.f20144q = new zy();
        } else {
            C3389g qVar = this.f20141k.toq();
            this.f20144q = new C3390k(this, this.f20140g, ld6Var.getLength(), qVar.f20117y + qVar.f20116s, qVar.f64340zy, (qVar.f64339toq & 4) != 0);
        }
        this.f20146y = 2;
        this.f20141k.m11906g();
        return 0;
    }

    @EnsuresNonNullIf(expression = {"setupData.format"}, result = true)
    /* JADX INFO: renamed from: y */
    private boolean m11918y(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        while (this.f20141k.m11908q(ld6Var)) {
            this.f64365ld6 = ld6Var.getPosition() - this.f20140g;
            if (!mo11912s(this.f20141k.zy(), this.f20140g, this.f20143p)) {
                return true;
            }
            this.f20140g = ld6Var.getPosition();
        }
        this.f20146y = 3;
        return false;
    }

    final int f7l8(com.google.android.exoplayer2.extractor.ld6 ld6Var, fu4 fu4Var) throws IOException {
        m11916k();
        int i2 = this.f20146y;
        if (i2 == 0) {
            return m11917p(ld6Var);
        }
        if (i2 == 1) {
            ld6Var.cdj((int) this.f20140g);
            this.f20146y = 2;
            return 0;
        }
        if (i2 == 2) {
            lrht.ld6(this.f20144q);
            return ld6(ld6Var, fu4Var);
        }
        if (i2 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: g */
    protected abstract long mo11910g(gvn7 gvn7Var);

    /* JADX INFO: renamed from: n */
    protected void mo11911n(long j2) {
        this.f64364f7l8 = j2;
    }

    /* JADX INFO: renamed from: q */
    void m11919q(x2 x2Var, InterfaceC3401t interfaceC3401t) {
        this.f64369zy = x2Var;
        this.f64367toq = interfaceC3401t;
        x2(true);
    }

    final void qrj(long j2, long j3) {
        this.f20141k.m11907n();
        if (j2 == 0) {
            x2(!this.f64368x2);
        } else if (this.f20146y != 0) {
            this.f20142n = zy(j3);
            ((f7l8) lrht.ld6(this.f20144q)).zy(this.f20142n);
            this.f20146y = 2;
        }
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: s */
    protected abstract boolean mo11912s(gvn7 gvn7Var, long j2, toq toqVar) throws IOException;

    protected long toq(long j2) {
        return (j2 * 1000000) / ((long) this.f20145s);
    }

    protected void x2(boolean z2) {
        if (z2) {
            this.f20143p = new toq();
            this.f20140g = 0L;
            this.f20146y = 0;
        } else {
            this.f20146y = 1;
        }
        this.f20142n = -1L;
        this.f64364f7l8 = 0L;
    }

    protected long zy(long j2) {
        return (((long) this.f20145s) * j2) / 1000000;
    }
}
