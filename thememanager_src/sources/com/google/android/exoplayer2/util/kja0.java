package com.google.android.exoplayer2.util;

import android.net.Uri;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import zy.yz;

/* JADX INFO: compiled from: FileTypes.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final String f66997a9 = ".mp4";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    @yz
    static final String f66998cdj = "Content-Type";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final String f66999d2ok = ".m2p";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final String f67000d3 = ".ps";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f67001dd = ".wav";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final String f67002eqxt = ".mpg";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f67003f7l8 = 5;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f67004fn3e = ".adts";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final String f67005fti = ".m4";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f67006fu4 = ".flac";

    /* JADX INFO: renamed from: g */
    public static final int f23207g = 4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final String f67007gvn7 = ".cmf";

    /* JADX INFO: renamed from: h */
    public static final int f23208h = 14;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private static final String f67008hyr = ".jpeg";

    /* JADX INFO: renamed from: i */
    private static final String f23209i = ".ac4";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final String f67009jk = ".mp3";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final String f67010jp0y = ".mp4";

    /* JADX INFO: renamed from: k */
    public static final int f23210k = -1;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f67011ki = ".ac3";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f67012kja0 = 13;

    /* JADX INFO: renamed from: l */
    private static final String f23211l = ".webvtt";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f67013ld6 = 9;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final String f67014lvui = ".ts";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final String f67015mcp = ".opus";

    /* JADX INFO: renamed from: n */
    public static final int f23212n = 3;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static final String f67016n5r1 = ".jpg";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f67017n7h = 12;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final String f67018ncyb = ".vtt";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f67019ni7 = ".amr";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f67020o1t = ".mk";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final String f67021oc = ".mpeg";

    /* JADX INFO: renamed from: p */
    public static final int f23213p = 8;

    /* JADX INFO: renamed from: q */
    public static final int f23214q = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f67022qrj = 11;

    /* JADX INFO: renamed from: r */
    private static final String f23215r = ".ts";

    /* JADX INFO: renamed from: s */
    public static final int f23216s = 7;

    /* JADX INFO: renamed from: t */
    private static final String f23217t = ".og";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f67023t8r = ".ec3";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f67024toq = 0;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final String f67025wvg = ".webm";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f67026x2 = 10;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final String f67027x9kr = ".wave";

    /* JADX INFO: renamed from: y */
    public static final int f23218y = 6;

    /* JADX INFO: renamed from: z */
    private static final String f23219z = ".flv";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f67028zurt = ".aac";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f67029zy = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.kja0$k */
    /* JADX INFO: compiled from: FileTypes.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3846k {
    }

    private kja0() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public static int m13643k(@zy.dd String str) {
        byte b2;
        if (str == null) {
            return -1;
        }
        String strFn3e = wvg.fn3e(str);
        strFn3e.hashCode();
        switch (strFn3e.hashCode()) {
            case -2123537834:
                b2 = !strFn3e.equals(wvg.f23312r) ? (byte) -1 : (byte) 0;
                break;
            case -1662384011:
                b2 = !strFn3e.equals(wvg.f67115ki) ? (byte) -1 : (byte) 1;
                break;
            case -1662384007:
                b2 = !strFn3e.equals(wvg.f67116kja0) ? (byte) -1 : (byte) 2;
                break;
            case -1662095187:
                b2 = !strFn3e.equals(wvg.f23318y) ? (byte) -1 : (byte) 3;
                break;
            case -1606874997:
                b2 = !strFn3e.equals(wvg.f67140vyq) ? (byte) -1 : (byte) 4;
                break;
            case -1487394660:
                b2 = !strFn3e.equals(wvg.f67136tfm) ? (byte) -1 : (byte) 5;
                break;
            case -1248337486:
                b2 = !strFn3e.equals(wvg.f67089bf2) ? (byte) -1 : (byte) 6;
                break;
            case -1004728940:
                b2 = !strFn3e.equals(wvg.f67099ek5k) ? (byte) -1 : (byte) 7;
                break;
            case -387023398:
                b2 = !strFn3e.equals(wvg.f23314t) ? (byte) -1 : (byte) 8;
                break;
            case -43467528:
                b2 = !strFn3e.equals(wvg.f67111i1) ? (byte) -1 : (byte) 9;
                break;
            case 13915911:
                b2 = !strFn3e.equals(wvg.f67150zurt) ? (byte) -1 : (byte) 10;
                break;
            case 187078296:
                b2 = !strFn3e.equals(wvg.f67094d2ok) ? (byte) -1 : (byte) 11;
                break;
            case 187078297:
                b2 = !strFn3e.equals(wvg.f67097dd) ? (byte) -1 : (byte) 12;
                break;
            case 187078669:
                b2 = !strFn3e.equals(wvg.f67118lrht) ? (byte) -1 : (byte) 13;
                break;
            case 187090232:
                b2 = !strFn3e.equals(wvg.f67129o1t) ? (byte) -1 : (byte) 14;
                break;
            case 187091926:
                b2 = !strFn3e.equals(wvg.f23304j) ? (byte) -1 : com.google.common.base.zy.f68111cdj;
                break;
            case 187099443:
                b2 = !strFn3e.equals(wvg.f23309o) ? (byte) -1 : (byte) 16;
                break;
            case 1331848029:
                b2 = !strFn3e.equals(wvg.f23301g) ? (byte) -1 : (byte) 17;
                break;
            case 1503095341:
                b2 = !strFn3e.equals(wvg.f67138uv6) ? (byte) -1 : (byte) 18;
                break;
            case 1504578661:
                b2 = !strFn3e.equals(wvg.f67120lvui) ? (byte) -1 : (byte) 19;
                break;
            case 1504619009:
                b2 = !strFn3e.equals(wvg.f23299e) ? (byte) -1 : com.google.common.base.zy.f68119fu4;
                break;
            case 1504831518:
                b2 = !strFn3e.equals(wvg.f67113jk) ? (byte) -1 : com.google.common.base.zy.f25761z;
                break;
            case 1505118770:
                b2 = !strFn3e.equals(wvg.f67121mcp) ? (byte) -1 : com.google.common.base.zy.f68130o1t;
                break;
            case 2039520277:
                b2 = !strFn3e.equals(wvg.f67101f7l8) ? (byte) -1 : com.google.common.base.zy.f68135wvg;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
        }
        return -1;
    }

    public static int toq(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return m13643k((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int zy(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(f67011ki) || lastPathSegment.endsWith(f67023t8r)) {
            return 0;
        }
        if (lastPathSegment.endsWith(f23209i)) {
            return 1;
        }
        if (lastPathSegment.endsWith(f67004fn3e) || lastPathSegment.endsWith(f67028zurt)) {
            return 2;
        }
        if (lastPathSegment.endsWith(f67019ni7)) {
            return 3;
        }
        if (lastPathSegment.endsWith(f67006fu4)) {
            return 4;
        }
        if (lastPathSegment.endsWith(f23219z)) {
            return 5;
        }
        if (lastPathSegment.startsWith(f67020o1t, lastPathSegment.length() - 4) || lastPathSegment.endsWith(f67025wvg)) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(com.android.thememanager.basemodule.resource.constants.toq.dt) || lastPathSegment.startsWith(f67005fti, lastPathSegment.length() - 4) || lastPathSegment.startsWith(com.android.thememanager.basemodule.resource.constants.toq.dt, lastPathSegment.length() - 5) || lastPathSegment.startsWith(f67007gvn7, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(f23217t, lastPathSegment.length() - 4) || lastPathSegment.endsWith(f67015mcp)) {
            return 9;
        }
        if (lastPathSegment.endsWith(f67000d3) || lastPathSegment.endsWith(f67021oc) || lastPathSegment.endsWith(f67002eqxt) || lastPathSegment.endsWith(f66999d2ok)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(f67001dd) || lastPathSegment.endsWith(f67027x9kr)) {
            return 12;
        }
        if (lastPathSegment.endsWith(f67018ncyb) || lastPathSegment.endsWith(f23211l)) {
            return 13;
        }
        return (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(f67008hyr)) ? 14 : -1;
    }
}
