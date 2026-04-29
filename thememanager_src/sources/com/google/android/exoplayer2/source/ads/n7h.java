package com.google.android.exoplayer2.source.ads;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fn3e;
import com.google.android.exoplayer2.util.C3844k;
import zy.yz;

/* JADX INFO: compiled from: SinglePeriodAdTimeline.java */
/* JADX INFO: loaded from: classes2.dex */
@yz(otherwise = 3)
public final class n7h extends fn3e {

    /* JADX INFO: renamed from: p */
    private final zy f21253p;

    public n7h(pc pcVar, zy zyVar) {
        super(pcVar);
        C3844k.m13633s(pcVar.qrj() == 1);
        C3844k.m13633s(pcVar.zurt() == 1);
        this.f21253p = zyVar;
    }

    @Override // com.google.android.exoplayer2.source.fn3e, com.google.android.exoplayer2.pc
    public pc.toq ld6(int i2, pc.toq toqVar, boolean z2) {
        this.f21523s.ld6(i2, toqVar, z2);
        long j2 = toqVar.f21149g;
        if (j2 == C3548p.f65257toq) {
            j2 = this.f21253p.f21301g;
        }
        toqVar.fu4(toqVar.f21150k, toqVar.f21153q, toqVar.f21151n, j2, toqVar.ki(), this.f21253p, toqVar.f21154s);
        return toqVar;
    }
}
