package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.yz;

/* JADX INFO: compiled from: MimeTypes.java */
/* JADX INFO: loaded from: classes2.dex */
public final class wvg {

    /* JADX INFO: renamed from: a */
    public static final String f23295a = "application/dash+xml";

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f67087a9 = "audio/mpeg-L1";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    public static final String f67088a98o = "application/x-matroska";

    /* JADX INFO: renamed from: b */
    public static final String f23296b = "text/x-unknown";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final String f67089bf2 = "application/mp4";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final String f67090bo = "application/x-quicktime-tx3g";

    /* JADX INFO: renamed from: c */
    public static final String f23297c = "audio/opus";

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    public static final String f67091c8jq = "application/x-mp4-cea-608";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f67092cdj = "video/mpeg";

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    public static final String f67093ch = "application/id3";

    /* JADX INFO: renamed from: d */
    public static final String f23298d = "application/x-emsg";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f67094d2ok = "audio/ac3";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f67095d3 = "audio/raw";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f67097dd = "audio/ac4";

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    public static final String f67098dr = "application/vobsub";

    /* JADX INFO: renamed from: e */
    public static final String f23299e = "audio/flac";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f67099ek5k = "text/vtt";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f67100eqxt = "audio/g711-mlaw";

    /* JADX INFO: renamed from: f */
    public static final String f23300f = "audio/vorbis";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f67101f7l8 = "video/x-matroska";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f67102fn3e = "video/divx";

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    public static final String f67103fnq8 = "application/vnd.dvb.ait";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f67104fti = "audio/mpeg-L2";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f67105fu4 = "video/ogg";

    /* JADX INFO: renamed from: g */
    public static final String f23301g = "video/mp4";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f67107gvn7 = "audio/mhm1";

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    public static final String f67108gyi = "application/x-rawcc";

    /* JADX INFO: renamed from: h */
    public static final String f23302h = "video/mp4v-es";

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f67109hb = "audio/gsm";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f67110hyr = "audio/vnd.dts.uhd;profile=p2";

    /* JADX INFO: renamed from: i */
    public static final String f23303i = "video/wvc1";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f67111i1 = "application/webm";

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    public static final String f67112ikck = "application/x-camera-motion";

    /* JADX INFO: renamed from: j */
    public static final String f23304j = "audio/ogg";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f67113jk = "audio/mpeg";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f67114jp0y = "audio/mha1";

    /* JADX INFO: renamed from: k */
    public static final String f23305k = "video";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f67115ki = "video/mp2p";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f67116kja0 = "video/mp2t";

    /* JADX INFO: renamed from: l */
    public static final String f23306l = "audio/vnd.dts.hd";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f67117ld6 = "video/hevc";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f67118lrht = "audio/amr";

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    public static final String f67119lv5 = "application/cea-708";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f67120lvui = "audio/eac3";

    /* JADX INFO: renamed from: m */
    public static final String f23307m = "audio/x-unknown";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f67121mcp = "audio/webm";

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    public static final String f67122mu = "application/dvbsubs";

    /* JADX INFO: renamed from: n */
    public static final String f23308n = "application";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f67123n5r1 = "audio/vnd.dts.hd;profile=lbr";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f67124n7h = "video/av01";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f67125ncyb = "audio/vnd.dts";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f67126ni7 = "video/dolby-vision";

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    public static final String f67127nmn5 = "application/cea-608";

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f67128nn86 = "audio/alac";

    /* JADX INFO: renamed from: o */
    public static final String f23309o = "audio/wav";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f67129o1t = "audio/mp4";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f67130oc = "audio/g711-alaw";

    /* JADX INFO: renamed from: p */
    public static final String f23310p = "video/avc";

    /* JADX INFO: renamed from: q */
    public static final String f23311q = "image";

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    public static final String f67131qkj8 = "application/x-icy";

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    public static final String f67132qo = "application/x-rtsp";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f67133qrj = "video/x-vnd.on2.vp9";

    /* JADX INFO: renamed from: r */
    public static final String f23312r = "audio/eac3-joc";

    /* JADX INFO: renamed from: s */
    public static final String f23313s = "video/3gpp";

    /* JADX INFO: renamed from: t */
    public static final String f23314t = "audio/x-matroska";

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    public static final String f67134t8iq = "application/x-subrip";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f67135t8r = "video/mpeg2";

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    public static final String f67136tfm = "image/jpeg";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f67137toq = "audio";

    /* JADX INFO: renamed from: u */
    public static final String f23315u = "application/ttml+xml";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f67138uv6 = "audio/3gpp";

    /* JADX INFO: renamed from: v */
    public static final String f23316v = "application/x-scte35";

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    public static final String f67139vq = "application/x-exif";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f67140vyq = "audio/amr-wb";

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    public static final String f67141wo = "ec+3";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f67142wvg = "audio/mp4a-latm";

    /* JADX INFO: renamed from: x */
    public static final String f23317x = "application/vnd.ms-sstr+xml";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f67143x2 = "video/x-vnd.on2.vp8";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f67144x9kr = "audio/true-hd";

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    public static final String f67145xwq3 = "application/pgs";

    /* JADX INFO: renamed from: y */
    public static final String f23318y = "video/webm";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f67146y2 = "application/x-mp4-vtt";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final String f67147y9n = "text/x-exoplayer-cues";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f67148yz = "text/x-ssa";

    /* JADX INFO: renamed from: z */
    public static final String f23319z = "video/x-unknown";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    public static final String f67149zp = "application/x-mpegURL";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f67150zurt = "video/x-flv";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f67151zy = "text";

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private static final ArrayList<C3858k> f67096d8wk = new ArrayList<>();

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final Pattern f67106g1 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.wvg$k */
    /* JADX INFO: compiled from: MimeTypes.java */
    private static final class C3858k {

        /* JADX INFO: renamed from: k */
        public final String f23320k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final String f67152toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final int f67153zy;

        public C3858k(String str, String str2, int i2) {
            this.f23320k = str;
            this.f67152toq = str2;
            this.f67153zy = i2;
        }
    }

    /* JADX INFO: compiled from: MimeTypes.java */
    @yz
    static final class toq {

        /* JADX INFO: renamed from: k */
        public final int f23321k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67154toq;

        public toq(int i2, int i3) {
            this.f23321k = i2;
            this.f67154toq = i3;
        }

        /* JADX INFO: renamed from: k */
        public int m13752k() {
            int i2 = this.f67154toq;
            if (i2 == 2) {
                return 10;
            }
            if (i2 == 5) {
                return 11;
            }
            if (i2 == 29) {
                return 12;
            }
            if (i2 == 42) {
                return 16;
            }
            if (i2 != 22) {
                return i2 != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    private wvg() {
    }

    public static boolean cdj(@zy.dd String str) {
        return "image".equals(ld6(str));
    }

    @zy.dd
    public static String f7l8(@zy.dd String str) {
        toq toqVarM13750s;
        String strM13751y = null;
        if (str == null) {
            return null;
        }
        String strF7l8 = com.google.common.base.zy.f7l8(str.trim());
        if (strF7l8.startsWith("avc1") || strF7l8.startsWith("avc3")) {
            return f23310p;
        }
        if (strF7l8.startsWith("hev1") || strF7l8.startsWith("hvc1")) {
            return f67117ld6;
        }
        if (strF7l8.startsWith("dvav") || strF7l8.startsWith("dva1") || strF7l8.startsWith("dvhe") || strF7l8.startsWith("dvh1")) {
            return f67126ni7;
        }
        if (strF7l8.startsWith("av01")) {
            return f67124n7h;
        }
        if (strF7l8.startsWith("vp9") || strF7l8.startsWith("vp09")) {
            return f67133qrj;
        }
        if (strF7l8.startsWith("vp8") || strF7l8.startsWith("vp08")) {
            return f67143x2;
        }
        if (!strF7l8.startsWith("mp4a")) {
            return strF7l8.startsWith("mha1") ? f67114jp0y : strF7l8.startsWith("mhm1") ? f67107gvn7 : (strF7l8.startsWith("ac-3") || strF7l8.startsWith("dac3")) ? f67094d2ok : (strF7l8.startsWith("ec-3") || strF7l8.startsWith("dec3")) ? f67120lvui : strF7l8.startsWith(f67141wo) ? f23312r : (strF7l8.startsWith("ac-4") || strF7l8.startsWith("dac4")) ? f67097dd : strF7l8.startsWith("dtsc") ? f67125ncyb : strF7l8.startsWith("dtse") ? f67123n5r1 : (strF7l8.startsWith("dtsh") || strF7l8.startsWith("dtsl")) ? f23306l : strF7l8.startsWith("dtsx") ? f67110hyr : strF7l8.startsWith("opus") ? f23297c : strF7l8.startsWith("vorbis") ? f23300f : strF7l8.startsWith("flac") ? f23299e : strF7l8.startsWith("stpp") ? f23315u : strF7l8.startsWith("wvtt") ? f67099ek5k : strF7l8.contains("cea708") ? f67119lv5 : (strF7l8.contains("eia608") || strF7l8.contains("cea608")) ? f67127nmn5 : m13747n(strF7l8);
        }
        if (strF7l8.startsWith("mp4a.") && (toqVarM13750s = m13750s(strF7l8)) != null) {
            strM13751y = m13751y(toqVarM13750s.f23321k);
        }
        return strM13751y == null ? f67142wvg : strM13751y;
    }

    public static String fn3e(String str) {
        str.hashCode();
        switch (str) {
            case "audio/x-flac":
                return f23299e;
            case "audio/x-wav":
                return f23309o;
            case "audio/mp3":
                return f67113jk;
            default:
                return str;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m13743g(String str, @zy.dd String str2) {
        toq toqVarM13750s;
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (toqVarM13750s = m13750s(str2)) == null) {
                    return 0;
                }
                return toqVarM13750s.m13752k();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m13744h(@zy.dd String str) {
        return f67137toq.equals(ld6(str));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m13745i(@zy.dd String str) {
        return "video".equals(ld6(str));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m13746k(@zy.dd String str, @zy.dd String str2) {
        toq toqVarM13750s;
        int iM13752k;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mp4a-latm":
                if (str2 != null && (toqVarM13750s = m13750s(str2)) != null && (iM13752k = toqVarM13750s.m13752k()) != 0 && iM13752k != 16) {
                    break;
                }
                break;
        }
        return false;
    }

    public static boolean ki(@zy.dd String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith(f23318y) || str.startsWith(f67121mcp) || str.startsWith(f67111i1) || str.startsWith(f67101f7l8) || str.startsWith(f23314t) || str.startsWith(f67088a98o);
    }

    @zy.dd
    public static String kja0(@zy.dd String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : lrht.yl(str)) {
            String strF7l8 = f7l8(str2);
            if (strF7l8 != null && m13745i(strF7l8)) {
                return strF7l8;
            }
        }
        return null;
    }

    @zy.dd
    private static String ld6(@zy.dd String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    @zy.dd
    /* JADX INFO: renamed from: n */
    private static String m13747n(String str) {
        int size = f67096d8wk.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3858k c3858k = f67096d8wk.get(i2);
            if (str.startsWith(c3858k.f67152toq)) {
                return c3858k.f23320k;
            }
        }
        return null;
    }

    public static int n7h(String str) {
        return x2(f7l8(str));
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public static String m13748p(@zy.dd String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : lrht.yl(str)) {
            String strF7l8 = f7l8(str2);
            if (strF7l8 != null && t8r(strF7l8)) {
                return strF7l8;
            }
        }
        return null;
    }

    @zy.dd
    /* JADX INFO: renamed from: q */
    public static String m13749q(@zy.dd String str, @zy.dd String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrYl = lrht.yl(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrYl) {
            if (str2.equals(f7l8(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    private static int qrj(String str) {
        int size = f67096d8wk.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3858k c3858k = f67096d8wk.get(i2);
            if (str.equals(c3858k.f23320k)) {
                return c3858k.f67153zy;
            }
        }
        return -1;
    }

    @zy.dd
    @yz
    /* JADX INFO: renamed from: s */
    static toq m13750s(String str) {
        Matcher matcher = f67106g1.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C3844k.f7l8(matcher.group(1));
        String strGroup = matcher.group(2);
        try {
            return new toq(Integer.parseInt(str2, 16), strGroup != null ? Integer.parseInt(strGroup) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean t8r(@zy.dd String str) {
        return "text".equals(ld6(str)) || f67127nmn5.equals(str) || f67119lv5.equals(str) || f67091c8jq.equals(str) || f67134t8iq.equals(str) || f23315u.equals(str) || f67090bo.equals(str) || f67146y2.equals(str) || f67108gyi.equals(str) || f67098dr.equals(str) || f67145xwq3.equals(str) || f67122mu.equals(str);
    }

    public static boolean toq(@zy.dd String str, String str2) {
        return m13749q(str, str2) != null;
    }

    public static int x2(@zy.dd String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m13744h(str)) {
            return 1;
        }
        if (m13745i(str)) {
            return 2;
        }
        if (t8r(str)) {
            return 3;
        }
        if (cdj(str)) {
            return 4;
        }
        if (f67093ch.equals(str) || f23298d.equals(str) || f23316v.equals(str)) {
            return 5;
        }
        if (f67112ikck.equals(str)) {
            return 6;
        }
        return qrj(str);
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    public static String m13751y(int i2) {
        if (i2 == 32) {
            return f23302h;
        }
        if (i2 == 33) {
            return f23310p;
        }
        if (i2 == 35) {
            return f67117ld6;
        }
        if (i2 == 64) {
            return f67142wvg;
        }
        if (i2 == 163) {
            return f23303i;
        }
        if (i2 == 177) {
            return f67133qrj;
        }
        if (i2 == 165) {
            return f67094d2ok;
        }
        if (i2 == 166) {
            return f67120lvui;
        }
        switch (i2) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return f67135t8r;
            case 102:
            case 103:
            case 104:
                return f67142wvg;
            case 105:
            case 107:
                return f67113jk;
            case 106:
                return f67092cdj;
            default:
                switch (i2) {
                    case 169:
                    case com.google.android.exoplayer2.extractor.ts.gvn7.f64459eqxt /* 172 */:
                        return f67125ncyb;
                    case 170:
                    case 171:
                        return f23306l;
                    case 173:
                        return f23297c;
                    case 174:
                        return f67097dd;
                    default:
                        return null;
                }
        }
    }

    public static void zurt(String str, String str2, int i2) {
        C3858k c3858k = new C3858k(str, str2, i2);
        int size = f67096d8wk.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            ArrayList<C3858k> arrayList = f67096d8wk;
            if (str.equals(arrayList.get(i3).f23320k)) {
                arrayList.remove(i3);
                break;
            }
            i3++;
        }
        f67096d8wk.add(c3858k);
    }

    @zy.dd
    public static String zy(@zy.dd String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : lrht.yl(str)) {
            String strF7l8 = f7l8(str2);
            if (strF7l8 != null && m13744h(strF7l8)) {
                return strF7l8;
            }
        }
        return null;
    }
}
