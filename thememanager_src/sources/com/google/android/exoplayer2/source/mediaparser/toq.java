package com.google.android.exoplayer2.source.mediaparser;

import android.media.MediaFormat;
import com.google.android.exoplayer2.xwq3;

/* JADX INFO: compiled from: MediaParserUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f65431f7l8 = "android.media.mediaParser.exposeCaptionFormats";

    /* JADX INFO: renamed from: g */
    public static final String f21609g = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* JADX INFO: renamed from: k */
    public static final String f21610k = "android.media.mediaparser.inBandCryptoInfo";

    /* JADX INFO: renamed from: n */
    public static final String f21611n = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";

    /* JADX INFO: renamed from: q */
    public static final String f21612q = "android.media.mediaparser.exposeDummySeekMap";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f65432toq = "android.media.mediaparser.includeSupplementalData";

    /* JADX INFO: renamed from: y */
    public static final String f21613y = "android.media.mediaparser.ignoreTimestampOffset";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f65433zy = "android.media.mediaparser.eagerlyExposeTrackType";

    private toq() {
    }

    /* JADX INFO: renamed from: k */
    public static MediaFormat m12779k(xwq3 xwq3Var) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", xwq3Var.f23682r);
        int i2 = xwq3Var.bp;
        if (i2 != -1) {
            mediaFormat.setInteger("caption-service-number", i2);
        }
        return mediaFormat;
    }
}
