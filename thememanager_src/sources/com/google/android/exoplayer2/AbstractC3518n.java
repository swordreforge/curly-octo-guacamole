package com.google.android.exoplayer2;

import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.pc;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.n */
/* JADX INFO: compiled from: BasePlayer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3518n implements gc3c {

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    protected final pc.C3550q f65002qkj8 = new pc.C3550q();

    protected AbstractC3518n() {
    }

    private int ec() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    private void o5(long j2) {
        long currentPosition = getCurrentPosition() + j2;
        long duration = getDuration();
        if (duration != C3548p.f65257toq) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(Math.max(currentPosition, 0L));
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: b */
    public final void mo12078b(int i2) {
        zp(i2, i2 + 1);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void b3e(tfm tfmVar) {
        r25n(Collections.singletonList(tfmVar));
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final boolean b9ub() {
        return z4t();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final int bap7() {
        return lrht();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final int bf2() {
        return d8wk().zurt();
    }

    protected gc3c.zy bih(gc3c.zy zyVar) {
        return new gc3c.zy.C3441k().toq(zyVar).m12106n(4, !mo12088r()).m12106n(5, wlev() && !mo12088r()).m12106n(6, cv06() && !mo12088r()).m12106n(7, !d8wk().ni7() && (cv06() || !z4t() || wlev()) && !mo12088r()).m12106n(8, dr() && !mo12088r()).m12106n(9, !d8wk().ni7() && (dr() || (z4t() && fnq8())) && !mo12088r()).m12106n(10, !mo12088r()).m12106n(11, wlev() && !mo12088r()).m12106n(12, wlev() && !mo12088r()).m12104g();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void bo() {
        int iXwq3 = xwq3();
        if (iXwq3 != -1) {
            pc(iXwq3);
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: c */
    public final int mo12079c() {
        long jH4b = h4b();
        long duration = getDuration();
        if (jH4b == C3548p.f65257toq || duration == C3548p.f65257toq) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return com.google.android.exoplayer2.util.lrht.t8r((int) ((jH4b * 100) / duration), 0, 100);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void ch() {
        if (d8wk().ni7() || mo12088r()) {
            return;
        }
        boolean zCv06 = cv06();
        if (z4t() && !wlev()) {
            if (zCv06) {
                nn86();
            }
        } else if (!zCv06 || getCurrentPosition() > bz2()) {
            seekTo(0L);
        } else {
            nn86();
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void cnbm(int i2, int i3) {
        if (i2 != i3) {
            b8(i2, i2 + 1, i3);
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean cv06() {
        return lrht() != -1;
    }

    @Override // com.google.android.exoplayer2.gc3c
    /* JADX INFO: renamed from: d */
    public final boolean mo12080d(int i2) {
        return w831().m12102q(i2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final boolean dd() {
        return dr();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    /* JADX INFO: renamed from: do */
    public final boolean mo28264do() {
        return cv06();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean dr() {
        return xwq3() != -1;
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final void ek5k() {
        bo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean fnq8() {
        pc pcVarD8wk = d8wk();
        return !pcVarD8wk.ni7() && pcVarD8wk.m12484i(lw(), this.f65002qkj8).f21131i;
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final int gcp() {
        return xwq3();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final boolean hasNext() {
        return dr();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final boolean hasPrevious() {
        return cv06();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void hb() {
        pc(lw());
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && yqrt() && qo() == 0;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final long jz5() {
        pc pcVarD8wk = d8wk();
        return pcVarD8wk.ni7() ? C3548p.f65257toq : pcVarD8wk.m12484i(lw(), this.f65002qkj8).f7l8();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: l */
    public final tfm mo12086l() {
        pc pcVarD8wk = d8wk();
        if (pcVarD8wk.ni7()) {
            return null;
        }
        return pcVarD8wk.m12484i(lw(), this.f65002qkj8).f21135n;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final int lrht() {
        pc pcVarD8wk = d8wk();
        if (pcVarD8wk.ni7()) {
            return -1;
        }
        return pcVarD8wk.ki(lw(), ec(), ix());
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void m2t() {
        o5(ij());
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void ncyb() {
        zp(0, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final void next() {
        bo();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void nn86() {
        int iLrht = lrht();
        if (iLrht != -1) {
            pc(iLrht);
        }
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void nnh(int i2, tfm tfmVar) {
        lh(i2, Collections.singletonList(tfmVar));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void pause() {
        nmn5(false);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void pc(int i2) {
        cfr(i2, C3548p.f65257toq);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void play() {
        nmn5(true);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final void previous() {
        nn86();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void ps() {
        o5(-kiv());
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void r25n(List<tfm> list) {
        lh(Integer.MAX_VALUE, list);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void seekTo(long j2) {
        cfr(lw(), j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void setPlaybackSpeed(float f2) {
        ld6(f7l8().m12550n(f2));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final long sok() {
        pc pcVarD8wk = d8wk();
        return (pcVarD8wk.ni7() || pcVarD8wk.m12484i(lw(), this.f65002qkj8).f21139s == C3548p.f65257toq) ? C3548p.f65257toq : (this.f65002qkj8.m12491q() - this.f65002qkj8.f21139s) - n2t();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final void t8iq() {
        nn86();
    }

    @Override // com.google.android.exoplayer2.gc3c
    @zy.dd
    /* JADX INFO: renamed from: u */
    public final Object mo12090u() {
        pc pcVarD8wk = d8wk();
        if (pcVarD8wk.ni7()) {
            return null;
        }
        return pcVarD8wk.m12484i(lw(), this.f65002qkj8).f21129g;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void uf(List<tfm> list) {
        mo12084j(list, true);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final boolean uv6() {
        return wlev();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void vep5(tfm tfmVar, long j2) {
        ebn(Collections.singletonList(tfmVar), 0, j2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean wlev() {
        pc pcVarD8wk = d8wk();
        return !pcVarD8wk.ni7() && pcVarD8wk.m12484i(lw(), this.f65002qkj8).f21130h;
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    /* JADX INFO: renamed from: x */
    public final int mo12093x() {
        return lw();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final int xwq3() {
        pc pcVarD8wk = d8wk();
        if (pcVarD8wk.ni7()) {
            return -1;
        }
        return pcVarD8wk.mo12149s(lw(), ec(), ix());
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean y9n() {
        return true;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void yl(tfm tfmVar, boolean z2) {
        mo12084j(Collections.singletonList(tfmVar), z2);
    }

    @Override // com.google.android.exoplayer2.gc3c
    @Deprecated
    public final boolean yz() {
        return fnq8();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void z4(tfm tfmVar) {
        uf(Collections.singletonList(tfmVar));
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final boolean z4t() {
        pc pcVarD8wk = d8wk();
        return !pcVarD8wk.ni7() && pcVarD8wk.m12484i(lw(), this.f65002qkj8).ld6();
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final tfm zkd(int i2) {
        return d8wk().m12484i(i2, this.f65002qkj8).f21135n;
    }

    @Override // com.google.android.exoplayer2.gc3c
    public final void zsr0() {
        if (d8wk().ni7() || mo12088r()) {
            return;
        }
        if (dr()) {
            bo();
        } else if (z4t() && fnq8()) {
            hb();
        }
    }
}
