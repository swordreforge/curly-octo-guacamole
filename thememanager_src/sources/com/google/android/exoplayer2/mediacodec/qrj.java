package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import com.google.android.exoplayer2.decoder.C3298y;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: MediaCodecDecoderException.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends C3298y {

    @dd
    public final n7h codecInfo;

    @dd
    public final String diagnosticInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    public qrj(Throwable th, @dd n7h n7hVar) {
        String strValueOf = String.valueOf(n7hVar == null ? null : n7hVar.f20688k);
        super(strValueOf.length() != 0 ? "Decoder failed: ".concat(strValueOf) : new String("Decoder failed: "), th);
        this.codecInfo = n7hVar;
        this.diagnosticInfo = lrht.f23230k >= 21 ? m12258k(th) : null;
    }

    @hyr(21)
    @dd
    /* JADX INFO: renamed from: k */
    private static String m12258k(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
