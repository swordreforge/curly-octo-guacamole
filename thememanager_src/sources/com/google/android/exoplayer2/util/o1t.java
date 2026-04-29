package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.xwq3;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: MediaFormatUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class o1t {

    /* JADX INFO: renamed from: k */
    public static final String f23258k = "exo-pixel-width-height-ratio-float";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f67065toq = "exo-pcm-encoding-int";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f67066zy = 1073741824;

    private o1t() {
    }

    @SuppressLint({"InlinedApi"})
    private static void f7l8(MediaFormat mediaFormat, float f2) {
        int i2;
        mediaFormat.setFloat(f23258k, f2);
        int i3 = 1073741824;
        if (f2 < 1.0f) {
            i3 = (int) (f2 * 1073741824);
            i2 = 1073741824;
        } else if (f2 > 1.0f) {
            i2 = (int) (1073741824 / f2);
        } else {
            i2 = 1;
            i3 = 1;
        }
        mediaFormat.setInteger("sar-width", i3);
        mediaFormat.setInteger("sar-height", i2);
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: g */
    private static void m13705g(MediaFormat mediaFormat, int i2) {
        if (i2 == -1) {
            return;
        }
        m13707n(mediaFormat, f67065toq, i2);
        int i3 = 4;
        if (i2 == 2) {
            i3 = 2;
        } else if (i2 == 3) {
            i3 = 3;
        } else if (i2 != 4) {
            return;
        }
        mediaFormat.setInteger("pcm-encoding", i3);
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: k */
    public static MediaFormat m13706k(xwq3 xwq3Var) {
        MediaFormat mediaFormat = new MediaFormat();
        m13707n(mediaFormat, "bitrate", xwq3Var.f23672h);
        m13707n(mediaFormat, "channel-count", xwq3Var.f23686v);
        zy(mediaFormat, xwq3Var.f67274bo);
        m13711y(mediaFormat, "mime", xwq3Var.f23682r);
        m13711y(mediaFormat, "codecs-string", xwq3Var.f23673i);
        m13709q(mediaFormat, "frame-rate", xwq3Var.f23677m);
        m13707n(mediaFormat, "width", xwq3Var.f23674j);
        m13707n(mediaFormat, InterfaceC1925p.byf, xwq3Var.f23679o);
        m13708p(mediaFormat, xwq3Var.f23670f);
        m13705g(mediaFormat, xwq3Var.f23687w);
        m13711y(mediaFormat, "language", xwq3Var.f23678n);
        m13707n(mediaFormat, "max-input-size", xwq3Var.f23676l);
        m13707n(mediaFormat, "sample-rate", xwq3Var.f23668d);
        m13707n(mediaFormat, "caption-service-number", xwq3Var.bp);
        mediaFormat.setInteger("rotation-degrees", xwq3Var.f23666b);
        int i2 = xwq3Var.f23671g;
        m13710s(mediaFormat, "is-autoselect", i2 & 4);
        m13710s(mediaFormat, "is-default", i2 & 1);
        m13710s(mediaFormat, "is-forced-subtitle", i2 & 2);
        mediaFormat.setInteger("encoder-delay", xwq3Var.f67273ab);
        mediaFormat.setInteger("encoder-padding", xwq3Var.bb);
        f7l8(mediaFormat, xwq3Var.f23665a);
        return mediaFormat;
    }

    /* JADX INFO: renamed from: n */
    public static void m13707n(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m13708p(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i2)));
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m13709q(MediaFormat mediaFormat, String str, float f2) {
        if (f2 != -1.0f) {
            mediaFormat.setFloat(str, f2);
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m13710s(MediaFormat mediaFormat, String str, int i2) {
        mediaFormat.setInteger(str, i2 != 0 ? 1 : 0);
    }

    public static void toq(MediaFormat mediaFormat, String str, @zy.dd byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m13711y(MediaFormat mediaFormat, String str, @zy.dd String str2) {
        if (str2 != null) {
            mediaFormat.setString(str, str2);
        }
    }

    public static void zy(MediaFormat mediaFormat, @zy.dd com.google.android.exoplayer2.video.zy zyVar) {
        if (zyVar != null) {
            m13707n(mediaFormat, "color-transfer", zyVar.f23592n);
            m13707n(mediaFormat, "color-standard", zyVar.f23591k);
            m13707n(mediaFormat, "color-range", zyVar.f23593q);
            toq(mediaFormat, "hdr-static-info", zyVar.f23590g);
        }
    }
}
