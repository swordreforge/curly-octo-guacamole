package com.google.android.exoplayer2;

/* JADX INFO: compiled from: IllegalSeekPositionException.java */
/* JADX INFO: loaded from: classes2.dex */
public final class vq extends IllegalStateException {
    public final long positionMs;
    public final pc timeline;
    public final int windowIndex;

    public vq(pc pcVar, int i2, long j2) {
        this.timeline = pcVar;
        this.windowIndex = i2;
        this.positionMs = j2;
    }
}
