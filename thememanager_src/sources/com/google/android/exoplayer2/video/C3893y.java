package com.google.android.exoplayer2.video;

import android.view.Surface;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.y */
/* JADX INFO: compiled from: MediaCodecVideoDecoderException.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3893y extends com.google.android.exoplayer2.mediacodec.qrj {
    public final boolean isSurfaceValid;
    public final int surfaceIdentityHashCode;

    public C3893y(Throwable th, @dd com.google.android.exoplayer2.mediacodec.n7h n7hVar, @dd Surface surface) {
        super(th, n7hVar);
        this.surfaceIdentityHashCode = System.identityHashCode(surface);
        this.isSurfaceValid = surface == null || surface.isValid();
    }
}
