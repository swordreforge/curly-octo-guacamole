package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.AbstractC3294p;
import com.google.android.exoplayer2.util.C3844k;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class qrj extends AbstractC3294p implements f7l8 {

    /* JADX INFO: renamed from: g */
    @dd
    private f7l8 f21939g;

    /* JADX INFO: renamed from: y */
    private long f21940y;

    public void ki(long j2, f7l8 f7l8Var, long j3) {
        this.f19600q = j2;
        this.f21939g = f7l8Var;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f21940y = j2;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return ((f7l8) C3844k.f7l8(this.f21939g)).mo12858n();
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        return ((f7l8) C3844k.f7l8(this.f21939g)).mo12859q(i2) + this.f21940y;
    }

    @Override // com.google.android.exoplayer2.decoder.AbstractC3291k
    /* JADX INFO: renamed from: s */
    public void mo11567s() {
        super.mo11567s();
        this.f21939g = null;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        return ((f7l8) C3844k.f7l8(this.f21939g)).toq(j2 - this.f21940y);
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<toq> zy(long j2) {
        return ((f7l8) C3844k.f7l8(this.f21939g)).zy(j2 - this.f21940y);
    }
}
