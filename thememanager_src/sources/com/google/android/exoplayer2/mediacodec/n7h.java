package com.google.android.exoplayer2.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.exoplayer2.mediacodec.o1t;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import com.miui.maml.folme.AnimatedProperty;
import zy.dd;
import zy.hyr;
import zy.yz;

/* JADX INFO: compiled from: MediaCodecInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class n7h {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f64945qrj = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f64946x2 = "MediaCodecInfo";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final boolean f64947f7l8;

    /* JADX INFO: renamed from: g */
    public final boolean f20687g;

    /* JADX INFO: renamed from: k */
    public final String f20688k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final boolean f64948ld6;

    /* JADX INFO: renamed from: n */
    public final boolean f20689n;

    /* JADX INFO: renamed from: p */
    public final boolean f20690p;

    /* JADX INFO: renamed from: q */
    @dd
    public final MediaCodecInfo.CodecCapabilities f20691q;

    /* JADX INFO: renamed from: s */
    public final boolean f20692s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final String f64949toq;

    /* JADX INFO: renamed from: y */
    public final boolean f20693y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final String f64950zy;

    @yz
    n7h(String str, String str2, String str3, @dd MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f20688k = (String) C3844k.f7l8(str);
        this.f64949toq = str2;
        this.f64950zy = str3;
        this.f20691q = codecCapabilities;
        this.f20693y = z2;
        this.f20692s = z3;
        this.f20690p = z5;
        this.f20689n = z6;
        this.f20687g = z7;
        this.f64947f7l8 = z8;
        this.f64948ld6 = com.google.android.exoplayer2.util.wvg.m13745i(str2);
    }

    private static boolean fn3e(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return lrht.f23230k >= 21 && zurt(codecCapabilities);
    }

    private void fu4(String str) {
        String str2 = this.f20688k;
        String str3 = this.f64949toq;
        String str4 = lrht.f23231n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("AssumedSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        com.google.android.exoplayer2.util.ni7.toq(f64946x2, sb.toString());
    }

    /* JADX INFO: renamed from: g */
    private static MediaCodecInfo.CodecProfileLevel[] m12227g(@dd MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i2 = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i2;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    @hyr(21)
    /* JADX INFO: renamed from: i */
    private static boolean m12228i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public static n7h jk(String str, String str2, String str3, @dd MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z3, boolean z5, boolean z6, boolean z7) {
        return new n7h(str, str2, str3, codecCapabilities, z2, z3, z5, (z6 || codecCapabilities == null || !m12230p(codecCapabilities) || m12232t(str)) ? false : true, codecCapabilities != null && fn3e(codecCapabilities), z7 || (codecCapabilities != null && t8r(codecCapabilities)));
    }

    /* JADX INFO: renamed from: k */
    private static int m12229k(String str, String str2, int i2) {
        if (i2 > 1 || ((lrht.f23230k >= 26 && i2 > 0) || com.google.android.exoplayer2.util.wvg.f67113jk.equals(str2) || com.google.android.exoplayer2.util.wvg.f67138uv6.equals(str2) || com.google.android.exoplayer2.util.wvg.f67140vyq.equals(str2) || com.google.android.exoplayer2.util.wvg.f67142wvg.equals(str2) || com.google.android.exoplayer2.util.wvg.f23300f.equals(str2) || com.google.android.exoplayer2.util.wvg.f23297c.equals(str2) || com.google.android.exoplayer2.util.wvg.f67095d3.equals(str2) || com.google.android.exoplayer2.util.wvg.f23299e.equals(str2) || com.google.android.exoplayer2.util.wvg.f67130oc.equals(str2) || com.google.android.exoplayer2.util.wvg.f67100eqxt.equals(str2) || com.google.android.exoplayer2.util.wvg.f67109hb.equals(str2))) {
            return i2;
        }
        int i3 = com.google.android.exoplayer2.util.wvg.f67094d2ok.equals(str2) ? 6 : com.google.android.exoplayer2.util.wvg.f67120lvui.equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i2);
        sb.append(" to ");
        sb.append(i3);
        sb.append("]");
        com.google.android.exoplayer2.util.ni7.qrj(f64946x2, sb.toString());
        return i3;
    }

    @hyr(19)
    private static boolean ld6(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private static final boolean mcp(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(lrht.f67040toq)) ? false : true;
    }

    private static boolean o1t(String str) {
        return com.google.android.exoplayer2.util.wvg.f23297c.equals(str);
    }

    /* JADX INFO: renamed from: p */
    private static boolean m12230p(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return lrht.f23230k >= 19 && ld6(codecCapabilities);
    }

    @hyr(21)
    /* JADX INFO: renamed from: q */
    private static boolean m12231q(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        Point pointZy = zy(videoCapabilities, i2, i3);
        int i4 = pointZy.x;
        int i5 = pointZy.y;
        return (d2 == -1.0d || d2 < 1.0d) ? videoCapabilities.isSizeSupported(i4, i5) : videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d2));
    }

    /* JADX INFO: renamed from: t */
    private static boolean m12232t(String str) {
        if (lrht.f23230k <= 22) {
            String str2 = lrht.f23233q;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static boolean t8r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return lrht.f23230k >= 21 && m12228i(codecCapabilities);
    }

    private static boolean wvg(String str) {
        return lrht.f23233q.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    @hyr(23)
    /* JADX INFO: renamed from: y */
    private static int m12233y(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    /* JADX INFO: renamed from: z */
    private void m12234z(String str) {
        String str2 = this.f20688k;
        String str3 = this.f64949toq;
        String str4 = lrht.f23231n;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        com.google.android.exoplayer2.util.ni7.toq(f64946x2, sb.toString());
    }

    @hyr(21)
    private static boolean zurt(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    @hyr(21)
    private static Point zy(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(lrht.qrj(i2, widthAlignment) * widthAlignment, lrht.qrj(i3, heightAlignment) * heightAlignment);
    }

    public boolean cdj(xwq3 xwq3Var) {
        if (this.f64948ld6) {
            return this.f20689n;
        }
        Pair<Integer, Integer> pairCdj = o1t.cdj(xwq3Var);
        return pairCdj != null && ((Integer) pairCdj.first).intValue() == 42;
    }

    public int f7l8() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (lrht.f23230k < 23 || (codecCapabilities = this.f20691q) == null) {
            return -1;
        }
        return m12233y(codecCapabilities);
    }

    /* JADX INFO: renamed from: h */
    public boolean m12235h() {
        if (lrht.f23230k >= 29 && com.google.android.exoplayer2.util.wvg.f67133qrj.equals(this.f64949toq)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : m12237s()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean ki(xwq3 xwq3Var, xwq3 xwq3Var2, boolean z2) {
        if (!z2 && xwq3Var.f67274bo != null && xwq3Var2.f67274bo == null) {
            xwq3Var2 = xwq3Var2.toq().oc(xwq3Var.f67274bo).a9();
        }
        int i2 = m12236n(xwq3Var, xwq3Var2).f19588q;
        return i2 == 2 || i2 == 3;
    }

    public boolean kja0(xwq3 xwq3Var) throws o1t.zy {
        int i2;
        if (!n7h(xwq3Var)) {
            return false;
        }
        if (!this.f64948ld6) {
            if (lrht.f23230k >= 21) {
                int i3 = xwq3Var.f23668d;
                if (i3 != -1 && !qrj(i3)) {
                    return false;
                }
                int i4 = xwq3Var.f23686v;
                if (i4 != -1 && !x2(i4)) {
                    return false;
                }
            }
            return true;
        }
        int i5 = xwq3Var.f23674j;
        if (i5 <= 0 || (i2 = xwq3Var.f23679o) <= 0) {
            return true;
        }
        if (lrht.f23230k >= 21) {
            return ni7(i5, i2, xwq3Var.f23677m);
        }
        boolean z2 = i5 * i2 <= o1t.m12246r();
        if (!z2) {
            int i6 = xwq3Var.f23674j;
            int i7 = xwq3Var.f23679o;
            StringBuilder sb = new StringBuilder(40);
            sb.append("legacyFrameSize, ");
            sb.append(i6);
            sb.append(AnimatedProperty.PROPERTY_NAME_X);
            sb.append(i7);
            m12234z(sb.toString());
        }
        return z2;
    }

    /* JADX INFO: renamed from: n */
    public com.google.android.exoplayer2.decoder.ld6 m12236n(xwq3 xwq3Var, xwq3 xwq3Var2) {
        int i2 = !lrht.zy(xwq3Var.f23682r, xwq3Var2.f23682r) ? 8 : 0;
        if (this.f64948ld6) {
            if (xwq3Var.f23666b != xwq3Var2.f23666b) {
                i2 |= 1024;
            }
            if (!this.f20689n && (xwq3Var.f23674j != xwq3Var2.f23674j || xwq3Var.f23679o != xwq3Var2.f23679o)) {
                i2 |= 512;
            }
            if (!lrht.zy(xwq3Var.f67274bo, xwq3Var2.f67274bo)) {
                i2 |= 2048;
            }
            if (wvg(this.f20688k) && !xwq3Var.ni7(xwq3Var2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new com.google.android.exoplayer2.decoder.ld6(this.f20688k, xwq3Var, xwq3Var2, xwq3Var.ni7(xwq3Var2) ? 3 : 2, 0);
            }
        } else {
            if (xwq3Var.f23686v != xwq3Var2.f23686v) {
                i2 |= 4096;
            }
            if (xwq3Var.f23668d != xwq3Var2.f23668d) {
                i2 |= 8192;
            }
            if (xwq3Var.f23687w != xwq3Var2.f23687w) {
                i2 |= 16384;
            }
            if (i2 == 0 && com.google.android.exoplayer2.util.wvg.f67142wvg.equals(this.f64949toq)) {
                Pair<Integer, Integer> pairCdj = o1t.cdj(xwq3Var);
                Pair<Integer, Integer> pairCdj2 = o1t.cdj(xwq3Var2);
                if (pairCdj != null && pairCdj2 != null) {
                    int iIntValue = ((Integer) pairCdj.first).intValue();
                    int iIntValue2 = ((Integer) pairCdj2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new com.google.android.exoplayer2.decoder.ld6(this.f20688k, xwq3Var, xwq3Var2, 3, 0);
                    }
                }
            }
            if (!xwq3Var.ni7(xwq3Var2)) {
                i2 |= 32;
            }
            if (o1t(this.f64949toq)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new com.google.android.exoplayer2.decoder.ld6(this.f20688k, xwq3Var, xwq3Var2, 1, 0);
            }
        }
        return new com.google.android.exoplayer2.decoder.ld6(this.f20688k, xwq3Var, xwq3Var2, 0, i2);
    }

    public boolean n7h(xwq3 xwq3Var) {
        String strF7l8;
        String str = xwq3Var.f23673i;
        if (str == null || this.f64949toq == null || (strF7l8 = com.google.android.exoplayer2.util.wvg.f7l8(str)) == null) {
            return true;
        }
        if (!this.f64949toq.equals(strF7l8)) {
            String str2 = xwq3Var.f23673i;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + strF7l8.length());
            sb.append("codec.mime ");
            sb.append(str2);
            sb.append(", ");
            sb.append(strF7l8);
            m12234z(sb.toString());
            return false;
        }
        Pair<Integer, Integer> pairCdj = o1t.cdj(xwq3Var);
        if (pairCdj == null) {
            return true;
        }
        int iIntValue = ((Integer) pairCdj.first).intValue();
        int iIntValue2 = ((Integer) pairCdj.second).intValue();
        if (!this.f64948ld6 && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM12237s = m12237s();
        if (lrht.f23230k <= 23 && com.google.android.exoplayer2.util.wvg.f67133qrj.equals(this.f64949toq) && codecProfileLevelArrM12237s.length == 0) {
            codecProfileLevelArrM12237s = m12227g(this.f20691q);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArrM12237s) {
            if (codecProfileLevel.profile == iIntValue && codecProfileLevel.level >= iIntValue2) {
                return true;
            }
        }
        String str3 = xwq3Var.f23673i;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + strF7l8.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(strF7l8);
        m12234z(sb2.toString());
        return false;
    }

    @hyr(21)
    public boolean ni7(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20691q;
        if (codecCapabilities == null) {
            m12234z("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m12234z("sizeAndRate.vCaps");
            return false;
        }
        if (m12231q(videoCapabilities, i2, i3, d2)) {
            return true;
        }
        if (i2 < i3 && mcp(this.f20688k) && m12231q(videoCapabilities, i3, i2, d2)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.rotated, ");
            sb.append(i2);
            sb.append(AnimatedProperty.PROPERTY_NAME_X);
            sb.append(i3);
            sb.append(AnimatedProperty.PROPERTY_NAME_X);
            sb.append(d2);
            fu4(sb.toString());
            return true;
        }
        StringBuilder sb2 = new StringBuilder(69);
        sb2.append("sizeAndRate.support, ");
        sb2.append(i2);
        sb2.append(AnimatedProperty.PROPERTY_NAME_X);
        sb2.append(i3);
        sb2.append(AnimatedProperty.PROPERTY_NAME_X);
        sb2.append(d2);
        m12234z(sb2.toString());
        return false;
    }

    @hyr(21)
    public boolean qrj(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20691q;
        if (codecCapabilities == null) {
            m12234z("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m12234z("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i2);
        m12234z(sb.toString());
        return false;
    }

    /* JADX INFO: renamed from: s */
    public MediaCodecInfo.CodecProfileLevel[] m12237s() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20691q;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public String toString() {
        return this.f20688k;
    }

    @hyr(21)
    @dd
    public Point toq(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20691q;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zy(videoCapabilities, i2, i3);
    }

    @hyr(21)
    public boolean x2(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f20691q;
        if (codecCapabilities == null) {
            m12234z("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m12234z("channelCount.aCaps");
            return false;
        }
        if (m12229k(this.f20688k, this.f64949toq, audioCapabilities.getMaxInputChannelCount()) >= i2) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i2);
        m12234z(sb.toString());
        return false;
    }
}
