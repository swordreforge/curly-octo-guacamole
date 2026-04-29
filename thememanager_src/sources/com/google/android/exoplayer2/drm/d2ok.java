package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.wvg;
import com.google.android.exoplayer2.util.C3844k;
import java.util.UUID;

/* JADX INFO: compiled from: LocalMediaDrmCallback.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d2ok implements lvui {

    /* JADX INFO: renamed from: k */
    private final byte[] f19633k;

    public d2ok(byte[] bArr) {
        this.f19633k = (byte[]) C3844k.f7l8(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.lvui
    /* JADX INFO: renamed from: k */
    public byte[] mo11587k(UUID uuid, wvg.C3327y c3327y) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.drm.lvui
    public byte[] toq(UUID uuid, wvg.toq toqVar) {
        return this.f19633k;
    }
}
