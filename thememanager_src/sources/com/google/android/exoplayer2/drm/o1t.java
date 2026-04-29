package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.drm.qrj;
import com.google.android.exoplayer2.util.C3844k;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: ErrorStateDrmSession.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o1t implements qrj {

    /* JADX INFO: renamed from: g */
    private final qrj.C3318k f19675g;

    public o1t(qrj.C3318k c3318k) {
        this.f19675g = (qrj.C3318k) C3844k.f7l8(c3318k);
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    public com.google.android.exoplayer2.decoder.zy f7l8() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    /* JADX INFO: renamed from: g */
    public qrj.C3318k mo11610g() {
        return this.f19675g;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    public int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    /* JADX INFO: renamed from: k */
    public void mo11611k(@zy.dd InterfaceC3312i.k kVar) {
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    /* JADX INFO: renamed from: n */
    public byte[] mo11612n() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    /* JADX INFO: renamed from: p */
    public boolean mo11613p(String str) {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    /* JADX INFO: renamed from: q */
    public boolean mo11614q() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    @zy.dd
    /* JADX INFO: renamed from: s */
    public Map<String, String> mo11615s() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    public void toq(@zy.dd InterfaceC3312i.k kVar) {
    }

    @Override // com.google.android.exoplayer2.drm.qrj
    public final UUID zy() {
        return C3548p.f65130b9ub;
    }
}
