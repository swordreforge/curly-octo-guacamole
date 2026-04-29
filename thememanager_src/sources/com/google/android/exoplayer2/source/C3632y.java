package com.google.android.exoplayer2.source;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.y */
/* JADX INFO: compiled from: CompositeSequenceableLoader.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3632y implements InterfaceC3622o {

    /* JADX INFO: renamed from: k */
    protected final InterfaceC3622o[] f21719k;

    public C3632y(InterfaceC3622o[] interfaceC3622oArr) {
        this.f21719k = interfaceC3622oArr;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    public final void f7l8(long j2) {
        for (InterfaceC3622o interfaceC3622o : this.f21719k) {
            interfaceC3622o.f7l8(j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: g */
    public final long mo12595g() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC3622o interfaceC3622o : this.f21719k) {
            long jMo12595g = interfaceC3622o.mo12595g();
            if (jMo12595g != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo12595g);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: k */
    public boolean mo12596k() {
        for (InterfaceC3622o interfaceC3622o : this.f21719k) {
            if (interfaceC3622o.mo12596k()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    /* JADX INFO: renamed from: n */
    public boolean mo12597n(long j2) {
        boolean zMo12597n;
        boolean z2 = false;
        do {
            long jZy = zy();
            if (jZy == Long.MIN_VALUE) {
                break;
            }
            zMo12597n = false;
            for (InterfaceC3622o interfaceC3622o : this.f21719k) {
                long jZy2 = interfaceC3622o.zy();
                boolean z3 = jZy2 != Long.MIN_VALUE && jZy2 <= j2;
                if (jZy2 == jZy || z3) {
                    zMo12597n |= interfaceC3622o.mo12597n(j2);
                }
            }
            z2 |= zMo12597n;
        } while (zMo12597n);
        return z2;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC3622o
    public final long zy() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC3622o interfaceC3622o : this.f21719k) {
            long jZy = interfaceC3622o.zy();
            if (jZy != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jZy);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }
}
