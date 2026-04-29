package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.se;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.r */
/* JADX INFO: compiled from: StandaloneMediaClock.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3854r implements InterfaceC3863z {

    /* JADX INFO: renamed from: g */
    private long f23264g;

    /* JADX INFO: renamed from: k */
    private final InterfaceC3850n f23265k;

    /* JADX INFO: renamed from: n */
    private long f23266n;

    /* JADX INFO: renamed from: q */
    private boolean f23267q;

    /* JADX INFO: renamed from: y */
    private se f23268y = se.f21212g;

    public C3854r(InterfaceC3850n interfaceC3850n) {
        this.f23265k = interfaceC3850n;
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public se f7l8() {
        return this.f23268y;
    }

    /* JADX INFO: renamed from: k */
    public void m13724k(long j2) {
        this.f23266n = j2;
        if (this.f23267q) {
            this.f23264g = this.f23265k.mo13575q();
        }
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public long ki() {
        long j2 = this.f23266n;
        if (!this.f23267q) {
            return j2;
        }
        long jMo13575q = this.f23265k.mo13575q() - this.f23264g;
        se seVar = this.f23268y;
        return j2 + (seVar.f21216k == 1.0f ? lrht.v0af(jMo13575q) : seVar.toq(jMo13575q));
    }

    @Override // com.google.android.exoplayer2.util.InterfaceC3863z
    public void ld6(se seVar) {
        if (this.f23267q) {
            m13724k(ki());
        }
        this.f23268y = seVar;
    }

    public void toq() {
        if (this.f23267q) {
            return;
        }
        this.f23264g = this.f23265k.mo13575q();
        this.f23267q = true;
    }

    public void zy() {
        if (this.f23267q) {
            m13724k(ki());
            this.f23267q = false;
        }
    }
}
