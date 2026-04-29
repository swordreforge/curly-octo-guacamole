package com.google.android.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import com.xiaomi.onetrack.util.C5814z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import zy.InterfaceC7839p;
import zy.dd;
import zy.hyr;

/* JADX INFO: compiled from: MediaCodecUtil.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
public final class o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f64951f7l8 = "hev1";

    /* JADX INFO: renamed from: g */
    private static final String f20694g = "vp09";

    /* JADX INFO: renamed from: k */
    private static final String f20695k = "MediaCodecUtil";

    /* JADX INFO: renamed from: n */
    private static final String f20696n = "avc2";

    /* JADX INFO: renamed from: p */
    private static final String f20697p = "mp4a";

    /* JADX INFO: renamed from: q */
    private static final String f20698q = "avc1";

    /* JADX INFO: renamed from: s */
    private static final String f20699s = "av01";

    /* JADX INFO: renamed from: y */
    private static final String f20700y = "hvc1";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Pattern f64953toq = Pattern.compile("^\\D?(\\d+)$");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.o1t("MediaCodecUtil.class")
    private static final HashMap<toq, List<n7h>> f64954zy = new HashMap<>();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static int f64952ld6 = -1;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    interface f7l8<T> {
        /* JADX INFO: renamed from: k */
        int mo12199k(T t2);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.o1t$g */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    @hyr(21)
    private static final class C3463g implements InterfaceC3466q {

        /* JADX INFO: renamed from: k */
        private final int f20701k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private MediaCodecInfo[] f64955toq;

        public C3463g(boolean z2, boolean z3) {
            this.f20701k = (z2 || z3) ? 1 : 0;
        }

        @EnsuresNonNull({"mediaCodecInfos"})
        /* JADX INFO: renamed from: g */
        private void m12251g() {
            if (this.f64955toq == null) {
                this.f64955toq = new MediaCodecList(this.f20701k).getCodecInfos();
            }
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        /* JADX INFO: renamed from: k */
        public MediaCodecInfo mo12252k(int i2) {
            m12251g();
            return this.f64955toq[i2];
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        /* JADX INFO: renamed from: n */
        public boolean mo12253n() {
            return true;
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        /* JADX INFO: renamed from: q */
        public int mo12254q() {
            m12251g();
            return this.f64955toq.length;
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        public boolean toq(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        public boolean zy(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.o1t$n */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    private static final class C3465n implements InterfaceC3466q {
        private C3465n() {
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        /* JADX INFO: renamed from: k */
        public MediaCodecInfo mo12252k(int i2) {
            return MediaCodecList.getCodecInfoAt(i2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        /* JADX INFO: renamed from: n */
        public boolean mo12253n() {
            return false;
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        /* JADX INFO: renamed from: q */
        public int mo12254q() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        public boolean toq(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && com.google.android.exoplayer2.util.wvg.f23310p.equals(str2);
        }

        @Override // com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q
        public boolean zy(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.o1t$q */
    /* JADX INFO: compiled from: MediaCodecUtil.java */
    private interface InterfaceC3466q {
        /* JADX INFO: renamed from: k */
        MediaCodecInfo mo12252k(int i2);

        /* JADX INFO: renamed from: n */
        boolean mo12253n();

        /* JADX INFO: renamed from: q */
        int mo12254q();

        boolean toq(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean zy(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    /* JADX INFO: compiled from: MediaCodecUtil.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        public final String f20702k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f64956toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final boolean f64957zy;

        public toq(String str, boolean z2, boolean z3) {
            this.f20702k = str;
            this.f64956toq = z2;
            this.f64957zy = z3;
        }

        public boolean equals(@dd Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != toq.class) {
                return false;
            }
            toq toqVar = (toq) obj;
            return TextUtils.equals(this.f20702k, toqVar.f20702k) && this.f64956toq == toqVar.f64956toq && this.f64957zy == toqVar.f64957zy;
        }

        public int hashCode() {
            return ((((this.f20702k.hashCode() + 31) * 31) + (this.f64956toq ? 1231 : 1237)) * 31) + (this.f64957zy ? 1231 : 1237);
        }
    }

    /* JADX INFO: compiled from: MediaCodecUtil.java */
    public static class zy extends Exception {
        private zy(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private o1t() {
    }

    @hyr(29)
    private static boolean a9(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    @dd
    public static Pair<Integer, Integer> cdj(xwq3 xwq3Var) {
        String str = xwq3Var.f23673i;
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(C5814z.f32495a);
        if (com.google.android.exoplayer2.util.wvg.f67126ni7.equals(xwq3Var.f23682r)) {
            return ni7(xwq3Var.f23673i, strArrSplit);
        }
        String str2 = strArrSplit[0];
        str2.hashCode();
        switch (str2) {
            case "av01":
                return n7h(xwq3Var.f23673i, strArrSplit, xwq3Var.f67274bo);
            case "avc1":
            case "avc2":
                return kja0(xwq3Var.f23673i, strArrSplit);
            case "hev1":
            case "hvc1":
                return fu4(xwq3Var.f23673i, strArrSplit);
            case "mp4a":
                return qrj(xwq3Var.f23673i, strArrSplit);
            case "vp09":
                return m12250z(xwq3Var.f23673i, strArrSplit);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int d2ok(xwq3 xwq3Var, n7h n7hVar) {
        try {
            return n7hVar.kja0(xwq3Var) ? 1 : 0;
        } catch (zy unused) {
            return -1;
        }
    }

    @hyr(29)
    private static boolean d3(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    private static int dd(int i2) {
        int i3 = 17;
        if (i2 != 17) {
            i3 = 20;
            if (i2 != 20) {
                i3 = 23;
                if (i2 != 23) {
                    i3 = 29;
                    if (i2 != 29) {
                        i3 = 39;
                        if (i2 != 39) {
                            i3 = 42;
                            if (i2 != 42) {
                                switch (i2) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int eqxt(n7h n7hVar) {
        return n7hVar.f20688k.startsWith("OMX.google") ? 1 : 0;
    }

    private static int f7l8(int i2) {
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i2) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i2) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i2) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i2) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    @InterfaceC7839p
    public static List<n7h> fn3e(List<n7h> list, final xwq3 xwq3Var) {
        ArrayList arrayList = new ArrayList(list);
        x9kr(arrayList, new f7l8() { // from class: com.google.android.exoplayer2.mediacodec.z
            @Override // com.google.android.exoplayer2.mediacodec.o1t.f7l8
            /* JADX INFO: renamed from: k */
            public final int mo12199k(Object obj) {
                return o1t.d2ok(xwq3Var, (n7h) obj);
            }
        });
        return arrayList;
    }

    private static boolean fti(MediaCodecInfo mediaCodecInfo) {
        if (lrht.f23230k >= 29) {
            return jp0y(mediaCodecInfo);
        }
        String strF7l8 = com.google.common.base.zy.f7l8(mediaCodecInfo.getName());
        if (strF7l8.startsWith("arc.")) {
            return false;
        }
        return strF7l8.startsWith("omx.google.") || strF7l8.startsWith("omx.ffmpeg.") || (strF7l8.startsWith("omx.sec.") && strF7l8.contains(".sw.")) || strF7l8.equals("omx.qcom.video.decoder.hevcswvdec") || strF7l8.startsWith("c2.android.") || strF7l8.startsWith("c2.google.") || !(strF7l8.startsWith("omx.") || strF7l8.startsWith("c2."));
    }

    @dd
    private static Pair<Integer, Integer> fu4(String str, String[] strArr) {
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        int i2 = 1;
        Matcher matcher = f64953toq.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf2.length() != 0 ? "Ignoring malformed HEVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed HEVC codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        if (!"1".equals(strGroup)) {
            if (!"2".equals(strGroup)) {
                String strValueOf3 = String.valueOf(strGroup);
                com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf3.length() != 0 ? "Unknown HEVC profile string: ".concat(strValueOf3) : new String("Unknown HEVC profile string: "));
                return null;
            }
            i2 = 2;
        }
        String str2 = strArr[3];
        Integer numO1t = o1t(str2);
        if (numO1t != null) {
            return new Pair<>(Integer.valueOf(i2), numO1t);
        }
        String strValueOf4 = String.valueOf(str2);
        com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf4.length() != 0 ? "Unknown HEVC level string: ".concat(strValueOf4) : new String("Unknown HEVC level string: "));
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static int m12238g(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static boolean gvn7(MediaCodecInfo mediaCodecInfo) {
        if (lrht.f23230k >= 29) {
            return d3(mediaCodecInfo);
        }
        String strF7l8 = com.google.common.base.zy.f7l8(mediaCodecInfo.getName());
        return (strF7l8.startsWith("omx.google.") || strF7l8.startsWith("c2.android.") || strF7l8.startsWith("c2.google.")) ? false : true;
    }

    @dd
    /* JADX INFO: renamed from: h */
    private static String m12239h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals(com.google.android.exoplayer2.util.wvg.f67126ni7)) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals(com.google.android.exoplayer2.util.wvg.f67128nn86) && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals(com.google.android.exoplayer2.util.wvg.f23299e) && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.google.android.exoplayer2.mediacodec.n7h> m12240i(com.google.android.exoplayer2.mediacodec.o1t.toq r24, com.google.android.exoplayer2.mediacodec.o1t.InterfaceC3466q r25) throws com.google.android.exoplayer2.mediacodec.o1t.zy {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.o1t.m12240i(com.google.android.exoplayer2.mediacodec.o1t$toq, com.google.android.exoplayer2.mediacodec.o1t$q):java.util.ArrayList");
    }

    private static boolean jk(MediaCodecInfo mediaCodecInfo) {
        return lrht.f23230k >= 29 ? a9(mediaCodecInfo) : !fti(mediaCodecInfo);
    }

    @hyr(29)
    private static boolean jp0y(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    @dd
    public static n7h ki(String str, boolean z2, boolean z3) throws zy {
        List<n7h> listT8r = t8r(str, z2, z3);
        if (listT8r.isEmpty()) {
            return null;
        }
        return listT8r.get(0);
    }

    @dd
    private static Pair<Integer, Integer> kja0(String str, String[] strArr) {
        int i2;
        int i3;
        if (strArr.length < 2) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i3 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i2 = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    String strValueOf2 = String.valueOf(str);
                    com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf2.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf2) : new String("Ignoring malformed AVC codec string: "));
                    return null;
                }
                int i4 = Integer.parseInt(strArr[1]);
                i2 = Integer.parseInt(strArr[2]);
                i3 = i4;
            }
            int iM12247s = m12247s(i3);
            if (iM12247s == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AVC profile: ");
                sb.append(i3);
                com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb.toString());
                return null;
            }
            int iF7l8 = f7l8(i2);
            if (iF7l8 != -1) {
                return new Pair<>(Integer.valueOf(iM12247s), Integer.valueOf(iF7l8));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown AVC level: ");
            sb2.append(i2);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf3 = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf3.length() != 0 ? "Ignoring malformed AVC codec string: ".concat(strValueOf3) : new String("Ignoring malformed AVC codec string: "));
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    private static int m12242l(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 != 2) {
            return i2 != 3 ? -1 : 8;
        }
        return 4;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dd
    private static Integer ld6(@dd String str) {
        if (str == null) {
            return null;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    b2 = 0;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    b2 = 1;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    b2 = 2;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    b2 = 3;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    b2 = 4;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    b2 = 5;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    b2 = 6;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    b2 = 7;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    b2 = 8;
                }
                break;
            case 1567:
                if (str.equals(InterfaceC1925p.jvci)) {
                    b2 = 9;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    b2 = 10;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
        }
        switch (b2) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lvui(f7l8 f7l8Var, Object obj, Object obj2) {
        return f7l8Var.mo12199k(obj2) - f7l8Var.mo12199k(obj);
    }

    private static boolean mcp(MediaCodecInfo mediaCodecInfo, String str, boolean z2, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z2 && str.endsWith(".secure"))) {
            return false;
        }
        int i2 = lrht.f23230k;
        if (i2 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i2 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = lrht.f67040toq;
            if ("a70".equals(str3) || ("Xiaomi".equals(lrht.f67042zy) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = lrht.f67040toq;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i2 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = lrht.f67040toq;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i2 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(lrht.f67042zy))) {
            String str6 = lrht.f67040toq;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i2 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(lrht.f67042zy)) {
            String str7 = lrht.f67040toq;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i2 <= 19 && lrht.f67040toq.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (com.google.android.exoplayer2.util.wvg.f23312r.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    private static void m12243n(String str, List<n7h> list) {
        if (com.google.android.exoplayer2.util.wvg.f67095d3.equals(str)) {
            if (lrht.f23230k < 26 && lrht.f67040toq.equals("R9") && list.size() == 1 && list.get(0).f20688k.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(n7h.jk("OMX.google.raw.decoder", com.google.android.exoplayer2.util.wvg.f67095d3, com.google.android.exoplayer2.util.wvg.f67095d3, null, false, true, false, false, false));
            }
            x9kr(list, new f7l8() { // from class: com.google.android.exoplayer2.mediacodec.ni7
                @Override // com.google.android.exoplayer2.mediacodec.o1t.f7l8
                /* JADX INFO: renamed from: k */
                public final int mo12199k(Object obj) {
                    return o1t.oc((n7h) obj);
                }
            });
        }
        int i2 = lrht.f23230k;
        if (i2 < 21 && list.size() > 1) {
            String str2 = list.get(0).f20688k;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                x9kr(list, new f7l8() { // from class: com.google.android.exoplayer2.mediacodec.fu4
                    @Override // com.google.android.exoplayer2.mediacodec.o1t.f7l8
                    /* JADX INFO: renamed from: k */
                    public final int mo12199k(Object obj) {
                        return o1t.eqxt((n7h) obj);
                    }
                });
            }
        }
        if (i2 >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).f20688k)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static void n5r1(String str, boolean z2, boolean z3) {
        try {
            t8r(str, z2, z3);
        } catch (zy e2) {
            com.google.android.exoplayer2.util.ni7.m13700n(f20695k, "Codec warming failed", e2);
        }
    }

    @dd
    private static Pair<Integer, Integer> n7h(String str, String[] strArr, @dd com.google.android.exoplayer2.video.zy zyVar) {
        int i2;
        if (strArr.length < 4) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
        try {
            int i3 = Integer.parseInt(strArr[1]);
            int i4 = Integer.parseInt(strArr[2].substring(0, 2));
            int i5 = Integer.parseInt(strArr[3]);
            if (i3 != 0) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown AV1 profile: ");
                sb.append(i3);
                com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb.toString());
                return null;
            }
            if (i5 != 8 && i5 != 10) {
                StringBuilder sb2 = new StringBuilder(34);
                sb2.append("Unknown AV1 bit depth: ");
                sb2.append(i5);
                com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb2.toString());
                return null;
            }
            int i6 = i5 != 8 ? (zyVar == null || !(zyVar.f23590g != null || (i2 = zyVar.f23592n) == 7 || i2 == 6)) ? 2 : 4096 : 1;
            int iM12238g = m12238g(i4);
            if (iM12238g != -1) {
                return new Pair<>(Integer.valueOf(i6), Integer.valueOf(iM12238g));
            }
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append("Unknown AV1 level: ");
            sb3.append(i4);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb3.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf2.length() != 0 ? "Ignoring malformed AV1 codec string: ".concat(strValueOf2) : new String("Ignoring malformed AV1 codec string: "));
            return null;
        }
    }

    private static int ncyb(int i2) {
        if (i2 == 10) {
            return 1;
        }
        if (i2 == 11) {
            return 2;
        }
        if (i2 == 20) {
            return 4;
        }
        if (i2 == 21) {
            return 8;
        }
        if (i2 == 30) {
            return 16;
        }
        if (i2 == 31) {
            return 32;
        }
        if (i2 == 40) {
            return 64;
        }
        if (i2 == 41) {
            return 128;
        }
        if (i2 == 50) {
            return 256;
        }
        if (i2 == 51) {
            return 512;
        }
        switch (i2) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    @dd
    private static Pair<Integer, Integer> ni7(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        Matcher matcher = f64953toq.matcher(strArr[1]);
        if (!matcher.matches()) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf2.length() != 0 ? "Ignoring malformed Dolby Vision codec string: ".concat(strValueOf2) : new String("Ignoring malformed Dolby Vision codec string: "));
            return null;
        }
        String strGroup = matcher.group(1);
        Integer numX2 = x2(strGroup);
        if (numX2 == null) {
            String strValueOf3 = String.valueOf(strGroup);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf3.length() != 0 ? "Unknown Dolby Vision profile string: ".concat(strValueOf3) : new String("Unknown Dolby Vision profile string: "));
            return null;
        }
        String str2 = strArr[2];
        Integer numLd6 = ld6(str2);
        if (numLd6 != null) {
            return new Pair<>(numX2, numLd6);
        }
        String strValueOf4 = String.valueOf(str2);
        com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf4.length() != 0 ? "Unknown Dolby Vision level string: ".concat(strValueOf4) : new String("Unknown Dolby Vision level string: "));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dd
    private static Integer o1t(@dd String str) {
        if (str == null) {
            return null;
        }
        byte b2 = -1;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    b2 = 0;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    b2 = 1;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    b2 = 2;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    b2 = 3;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    b2 = 4;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    b2 = 5;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    b2 = 6;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    b2 = 7;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    b2 = 8;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    b2 = 9;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    b2 = 10;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    b2 = 16;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    b2 = 17;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    b2 = 18;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    b2 = 19;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    b2 = com.google.common.base.zy.f68119fu4;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    b2 = com.google.common.base.zy.f25761z;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    b2 = com.google.common.base.zy.f68130o1t;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    b2 = com.google.common.base.zy.f68135wvg;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    b2 = com.google.common.base.zy.f25759t;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    b2 = com.google.common.base.zy.f68127mcp;
                }
                break;
        }
        switch (b2) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int oc(n7h n7hVar) {
        String str = n7hVar.f20688k;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (lrht.f23230k >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* JADX INFO: renamed from: p */
    public static synchronized void m12244p() {
        f64954zy.clear();
    }

    @dd
    private static Pair<Integer, Integer> qrj(String str, String[] strArr) {
        int iDd;
        if (strArr.length != 3) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf) : new String("Ignoring malformed MP4A codec string: "));
            return null;
        }
        try {
            if (com.google.android.exoplayer2.util.wvg.f67142wvg.equals(com.google.android.exoplayer2.util.wvg.m13751y(Integer.parseInt(strArr[1], 16))) && (iDd = dd(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(iDd), 0);
            }
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf2.length() != 0 ? "Ignoring malformed MP4A codec string: ".concat(strValueOf2) : new String("Ignoring malformed MP4A codec string: "));
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static int m12246r() throws zy {
        if (f64952ld6 == -1) {
            int iMax = 0;
            n7h n7hVarKi = ki(com.google.android.exoplayer2.util.wvg.f23310p, false, false);
            if (n7hVarKi != null) {
                MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrM12237s = n7hVarKi.m12237s();
                int length = codecProfileLevelArrM12237s.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(m12249y(codecProfileLevelArrM12237s[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, lrht.f23230k >= 21 ? 345600 : 172800);
            }
            f64952ld6 = iMax;
        }
        return f64952ld6;
    }

    /* JADX INFO: renamed from: s */
    private static int m12247s(int i2) {
        if (i2 == 66) {
            return 1;
        }
        if (i2 == 77) {
            return 2;
        }
        if (i2 == 88) {
            return 4;
        }
        if (i2 == 100) {
            return 8;
        }
        if (i2 == 110) {
            return 16;
        }
        if (i2 != 122) {
            return i2 != 244 ? -1 : 64;
        }
        return 32;
    }

    @hyr(29)
    /* JADX INFO: renamed from: t */
    private static boolean m12248t(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    public static synchronized List<n7h> t8r(String str, boolean z2, boolean z3) throws zy {
        toq toqVar = new toq(str, z2, z3);
        HashMap<toq, List<n7h>> map = f64954zy;
        List<n7h> list = map.get(toqVar);
        if (list != null) {
            return list;
        }
        int i2 = lrht.f23230k;
        ArrayList<n7h> arrayListM12240i = m12240i(toqVar, i2 >= 21 ? new C3463g(z2, z3) : new C3465n());
        if (z2 && arrayListM12240i.isEmpty() && 21 <= i2 && i2 <= 23) {
            arrayListM12240i = m12240i(toqVar, new C3465n());
            if (!arrayListM12240i.isEmpty()) {
                String str2 = arrayListM12240i.get(0).f20688k;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                sb.append("MediaCodecList API didn't list secure decoder for: ");
                sb.append(str);
                sb.append(". Assuming: ");
                sb.append(str2);
                com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb.toString());
            }
        }
        m12243n(str, arrayListM12240i);
        List<n7h> listUnmodifiableList = Collections.unmodifiableList(arrayListM12240i);
        map.put(toqVar, listUnmodifiableList);
        return listUnmodifiableList;
    }

    private static boolean wvg(MediaCodecInfo mediaCodecInfo) {
        return lrht.f23230k >= 29 && m12248t(mediaCodecInfo);
    }

    @dd
    private static Integer x2(@dd String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static <T> void x9kr(List<T> list, final f7l8<T> f7l8Var) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.exoplayer2.mediacodec.zurt
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return o1t.lvui(f7l8Var, obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    private static int m12249y(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    @dd
    /* JADX INFO: renamed from: z */
    private static Pair<Integer, Integer> m12250z(String str, String[] strArr) {
        if (strArr.length < 3) {
            String strValueOf = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
        try {
            int i2 = Integer.parseInt(strArr[1]);
            int i3 = Integer.parseInt(strArr[2]);
            int iM12242l = m12242l(i2);
            if (iM12242l == -1) {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown VP9 profile: ");
                sb.append(i2);
                com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb.toString());
                return null;
            }
            int iNcyb = ncyb(i3);
            if (iNcyb != -1) {
                return new Pair<>(Integer.valueOf(iM12242l), Integer.valueOf(iNcyb));
            }
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Unknown VP9 level: ");
            sb2.append(i3);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, sb2.toString());
            return null;
        } catch (NumberFormatException unused) {
            String strValueOf2 = String.valueOf(str);
            com.google.android.exoplayer2.util.ni7.qrj(f20695k, strValueOf2.length() != 0 ? "Ignoring malformed VP9 codec string: ".concat(strValueOf2) : new String("Ignoring malformed VP9 codec string: "));
            return null;
        }
    }

    @dd
    public static n7h zurt() throws zy {
        return ki(com.google.android.exoplayer2.util.wvg.f67095d3, false, false);
    }
}
