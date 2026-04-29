package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3854r;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.util.InterfaceC3863z;

/* JADX INFO: compiled from: DefaultMediaClock.java */
/* JADX INFO: loaded from: classes2.dex */
final class qrj implements InterfaceC3863z {

    /* JADX INFO: renamed from: g */
    @zy.dd
    private InterfaceC3863z f21186g;

    /* JADX INFO: renamed from: k */
    private final C3854r f21187k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private bek6 f21188n;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3553k f21189q;

    /* JADX INFO: renamed from: s */
    private boolean f21190s;

    /* JADX INFO: renamed from: y */
    private boolean f21191y = true;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.qrj$k */
    /* JADX INFO: compiled from: DefaultMediaClock.java */
    public interface InterfaceC3553k {
        /* JADX INFO: renamed from: q */
        void mo12529q(se seVar);
    }

    public qrj(InterfaceC3553k interfaceC3553k, InterfaceC3850n interfaceC3850n) {
        this.f21189q = interfaceC3553k;
        this.f21187k = new C3854r(interfaceC3850n);
    }

    /* JADX INFO: renamed from: q */
    private boolean m12523q(boolean z2) {
        bek6 bek6Var = this.f21188n;
        return bek6Var == null || bek6Var.zy() || (!this.f21188n.isReady() && (z2 || this.f21188n.mo11548g()));
    }

    /* JADX INFO: renamed from: s */
    private void m12524s(boolean z2) {
        if (m12523q(z2)) {
            this.f21191y = true;
            if (this.f21190s) {
                this.f21187k.toq();
                return;
            }
            return;
        }
        InterfaceC3863z interfaceC3863z = (InterfaceC3863z) C3844k.f7l8(this.f21186g);
        long jKi = interfaceC3863z.ki();
        if (this.f21191y) {
            if (jKi < this.f21187k.ki()) {
                this.f21187k.zy();
                return;
            } else {
                this.f21191y = false;
                if (this.f21190s) {
                    this.f21187k.toq();
                }
            }
        }
        this.f21187k.m13724k(jKi);
        se seVarF7l8 = interfaceC3863z.f7l8();
        if (seVarF7l8.equals(this.f21187k.f7l8())) {
            return;
        }
        this.f21187k.ld6(seVarF7l8);
        this.f21189q.mo12529q(seVarF7l8);
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public se f7l8() {
        InterfaceC3863z interfaceC3863z = this.f21186g;
        return interfaceC3863z != null ? interfaceC3863z.f7l8() : this.f21187k.f7l8();
    }

    /* JADX INFO: renamed from: g */
    public void m12525g() {
        this.f21190s = false;
        this.f21187k.zy();
    }

    /* JADX INFO: renamed from: k */
    public void m12526k(bek6 bek6Var) {
        if (bek6Var == this.f21188n) {
            this.f21186g = null;
            this.f21188n = null;
            this.f21191y = true;
        }
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public long ki() {
        return this.f21191y ? this.f21187k.ki() : ((InterfaceC3863z) C3844k.f7l8(this.f21186g)).ki();
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public void ld6(se seVar) {
        InterfaceC3863z interfaceC3863z = this.f21186g;
        if (interfaceC3863z != null) {
            interfaceC3863z.ld6(seVar);
            seVar = this.f21186g.f7l8();
        }
        this.f21187k.ld6(seVar);
    }

    /* JADX INFO: renamed from: n */
    public void m12527n() {
        this.f21190s = true;
        this.f21187k.toq();
    }

    public void toq(bek6 bek6Var) throws ki {
        InterfaceC3863z interfaceC3863z;
        InterfaceC3863z interfaceC3863zO1t = bek6Var.o1t();
        if (interfaceC3863zO1t == null || interfaceC3863zO1t == (interfaceC3863z = this.f21186g)) {
            return;
        }
        if (interfaceC3863z != null) {
            throw ki.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f21186g = interfaceC3863zO1t;
        this.f21188n = bek6Var;
        interfaceC3863zO1t.ld6(this.f21187k.f7l8());
    }

    /* JADX INFO: renamed from: y */
    public long m12528y(boolean z2) {
        m12524s(z2);
        return ki();
    }

    public void zy(long j2) {
        this.f21187k.m13724k(j2);
    }
}
