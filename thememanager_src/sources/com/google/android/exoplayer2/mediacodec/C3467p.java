package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.C3470t;
import com.google.android.exoplayer2.mediacodec.toq;
import com.google.android.exoplayer2.mediacodec.x2;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.p */
/* JADX INFO: compiled from: DefaultMediaCodecAdapterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3467p implements x2.toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f64958f7l8 = 2;

    /* JADX INFO: renamed from: g */
    private static final int f20703g = 1;

    /* JADX INFO: renamed from: n */
    private static final int f20704n = 0;

    /* JADX INFO: renamed from: y */
    private static final String f20705y = "DefaultMediaCodecAdapterFactory";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64960zy;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f64959toq = 0;

    /* JADX INFO: renamed from: q */
    private boolean f20706q = true;

    @Override // com.google.android.exoplayer2.mediacodec.x2.toq
    /* JADX INFO: renamed from: k */
    public x2 mo12255k(x2.C3472k c3472k) throws IOException {
        int i2 = this.f64959toq;
        if ((i2 != 1 || lrht.f23230k < 23) && (i2 != 0 || lrht.f23230k < 31)) {
            return new C3470t.zy().mo12255k(c3472k);
        }
        int iX2 = com.google.android.exoplayer2.util.wvg.x2(c3472k.f64974zy.f23682r);
        String strValueOf = String.valueOf(lrht.c8jq(iX2));
        com.google.android.exoplayer2.util.ni7.m13704y(f20705y, strValueOf.length() != 0 ? "Creating an asynchronous MediaCodec adapter for track type ".concat(strValueOf) : new String("Creating an asynchronous MediaCodec adapter for track type "));
        return new toq.C7956toq(iX2, this.f64960zy, this.f20706q).mo12255k(c3472k);
    }

    /* JADX INFO: renamed from: n */
    public C3467p m12256n() {
        this.f64959toq = 1;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public C3467p m12257q() {
        this.f64959toq = 2;
        return this;
    }

    public void toq(boolean z2) {
        this.f20706q = z2;
    }

    public void zy(boolean z2) {
        this.f64960zy = z2;
    }
}
