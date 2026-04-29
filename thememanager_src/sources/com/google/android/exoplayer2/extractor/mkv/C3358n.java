package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.mcp;
import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.C3856t;
import com.google.android.exoplayer2.util.fu4;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import zy.InterfaceC7842s;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.n */
/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3358n implements InterfaceC3397p {

    /* JADX INFO: renamed from: a */
    private static final String f19886a = "webm";

    /* JADX INFO: renamed from: a5id, reason: collision with root package name */
    private static final int f63812a5id = 186;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final String f63813a98o = "matroska";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final long f63814ab = 1000;

    /* JADX INFO: renamed from: b */
    private static final int f19887b = 0;

    /* JADX INFO: renamed from: b3e, reason: collision with root package name */
    private static final int f63815b3e = 524531317;

    /* JADX INFO: renamed from: b8, reason: collision with root package name */
    private static final int f63816b8 = 28032;

    /* JADX INFO: renamed from: b9ub, reason: collision with root package name */
    private static final int f63817b9ub = 181;

    /* JADX INFO: renamed from: bap7, reason: collision with root package name */
    private static final int f63818bap7 = 21358;

    /* JADX INFO: renamed from: bek6, reason: collision with root package name */
    private static final int f63819bek6 = 231;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static final int f63820bf2 = 1;

    /* JADX INFO: renamed from: bih, reason: collision with root package name */
    private static final int f63821bih = 241;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f63822bo = "V_MPEG4/ISO/AVC";

    /* JADX INFO: renamed from: bqie, reason: collision with root package name */
    private static final int f63823bqie = 21949;

    /* JADX INFO: renamed from: btvn, reason: collision with root package name */
    private static final int f63824btvn = 21973;

    /* JADX INFO: renamed from: bwp, reason: collision with root package name */
    private static final int f63825bwp = 357149030;

    /* JADX INFO: renamed from: bz2, reason: collision with root package name */
    private static final int f63826bz2 = 21420;

    /* JADX INFO: renamed from: c25, reason: collision with root package name */
    private static final String f63827c25 = "%02d:%02d:%02d,%03d";

    /* JADX INFO: renamed from: c8jq, reason: collision with root package name */
    private static final String f63828c8jq = "V_MS/VFW/FOURCC";

    /* JADX INFO: renamed from: cfr, reason: collision with root package name */
    private static final int f63829cfr = 440786851;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    private static final String f63830ch = "V_AV1";

    /* JADX INFO: renamed from: cn02, reason: collision with root package name */
    private static final int f63831cn02 = 21977;

    /* JADX INFO: renamed from: cnbm, reason: collision with root package name */
    private static final int f63832cnbm = 25188;

    /* JADX INFO: renamed from: cv06, reason: collision with root package name */
    private static final int f63833cv06 = 163;

    /* JADX INFO: renamed from: cyoe, reason: collision with root package name */
    private static final int f63834cyoe = 30324;

    /* JADX INFO: renamed from: d */
    private static final String f19888d = "A_MPEG/L3";

    /* JADX INFO: renamed from: d8wk, reason: collision with root package name */
    private static final String f63836d8wk = "A_MS/ACM";

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final int f46208do = 374648427;

    /* JADX INFO: renamed from: dr, reason: collision with root package name */
    private static final String f63837dr = "A_VORBIS";

    /* JADX INFO: renamed from: dxef, reason: collision with root package name */
    private static final int f63838dxef = 224;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private static final int f63839e5 = 22203;

    /* JADX INFO: renamed from: ebn, reason: collision with root package name */
    private static final int f63840ebn = 215;

    /* JADX INFO: renamed from: ec, reason: collision with root package name */
    private static final int f63841ec = 2274716;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f63842ek5k = 1;

    /* JADX INFO: renamed from: el, reason: collision with root package name */
    private static final int f63843el = 21945;

    /* JADX INFO: renamed from: etdu, reason: collision with root package name */
    private static final int f63844etdu = 8;

    /* JADX INFO: renamed from: ew, reason: collision with root package name */
    private static final int f63845ew = 20530;

    /* JADX INFO: renamed from: exv8, reason: collision with root package name */
    private static final int f63846exv8 = 4;

    /* JADX INFO: renamed from: f1bi, reason: collision with root package name */
    private static final int f63847f1bi = 21968;

    /* JADX INFO: renamed from: fnq8, reason: collision with root package name */
    private static final String f63849fnq8 = "A_DTS";

    /* JADX INFO: renamed from: g0ad, reason: collision with root package name */
    private static final int f63850g0ad = 21947;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final String f63851g1 = "A_PCM/INT/LIT";

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    private static final int f63852ga = 22186;

    /* JADX INFO: renamed from: gb, reason: collision with root package name */
    private static final int f63853gb = 21972;

    /* JADX INFO: renamed from: gbni, reason: collision with root package name */
    private static final String f63854gbni = "A_PCM/FLOAT/IEEE";

    /* JADX INFO: renamed from: gc3c, reason: collision with root package name */
    private static final int f63855gc3c = 19899;

    /* JADX INFO: renamed from: gcp, reason: collision with root package name */
    private static final int f63856gcp = 21690;

    /* JADX INFO: renamed from: gyi, reason: collision with root package name */
    private static final String f63857gyi = "V_THEORA";

    /* JADX INFO: renamed from: h4b, reason: collision with root package name */
    private static final int f63858h4b = 134;

    /* JADX INFO: renamed from: h7am, reason: collision with root package name */
    private static final int f63859h7am = 160;

    /* JADX INFO: renamed from: hyow, reason: collision with root package name */
    private static final int f63860hyow = 1685485123;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f63861i1 = 2;

    /* JADX INFO: renamed from: i1an, reason: collision with root package name */
    private static final Map<String, Integer> f63862i1an;

    /* JADX INFO: renamed from: i3x9, reason: collision with root package name */
    private static final int f63863i3x9 = 21;

    /* JADX INFO: renamed from: i9jn, reason: collision with root package name */
    private static final String f63864i9jn = "S_VOBSUB";

    /* JADX INFO: renamed from: ij, reason: collision with root package name */
    private static final int f63865ij = 136;

    /* JADX INFO: renamed from: ikck, reason: collision with root package name */
    private static final String f63866ikck = "A_MPEG/L2";

    /* JADX INFO: renamed from: imd, reason: collision with root package name */
    private static final int f63867imd = 21948;

    /* JADX INFO: renamed from: ix, reason: collision with root package name */
    private static final int f63868ix = 20532;

    /* JADX INFO: renamed from: ixz, reason: collision with root package name */
    private static final int f63869ixz = 251;

    /* JADX INFO: renamed from: jbh, reason: collision with root package name */
    private static final int f63870jbh = 30113;

    /* JADX INFO: renamed from: jz5, reason: collision with root package name */
    private static final int f63871jz5 = 2807729;

    /* JADX INFO: renamed from: kbj, reason: collision with root package name */
    private static final int f63872kbj = 21971;

    /* JADX INFO: renamed from: kcsr, reason: collision with root package name */
    private static final int f63873kcsr = 408125543;

    /* JADX INFO: renamed from: kiv, reason: collision with root package name */
    private static final int f63874kiv = 179;

    /* JADX INFO: renamed from: kq2f, reason: collision with root package name */
    private static final int f63875kq2f = 21974;

    /* JADX INFO: renamed from: kt06, reason: collision with root package name */
    private static final int f63876kt06 = 1;

    /* JADX INFO: renamed from: ktq, reason: collision with root package name */
    private static final int f63877ktq = 17545;

    /* JADX INFO: renamed from: kx3, reason: collision with root package name */
    private static final int f63878kx3 = 16980;

    /* JADX INFO: renamed from: kz28, reason: collision with root package name */
    private static final int f63879kz28 = 65534;

    /* JADX INFO: renamed from: l05, reason: collision with root package name */
    private static final int f63880l05 = 30323;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static final int f63881lh = 16877;

    /* JADX INFO: renamed from: lk, reason: collision with root package name */
    private static final int f63882lk = 859189832;

    /* JADX INFO: renamed from: ltg8, reason: collision with root package name */
    private static final String f63883ltg8 = "S_HDMV/PGS";

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final String f63884lv5 = "V_MPEG4/ISO/SP";

    /* JADX INFO: renamed from: lw, reason: collision with root package name */
    private static final int f63885lw = 21680;

    /* JADX INFO: renamed from: m2t, reason: collision with root package name */
    private static final int f63886m2t = 20533;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f63887m4 = 8192;

    /* JADX INFO: renamed from: m58i, reason: collision with root package name */
    private static final int f63888m58i = 159;

    /* JADX INFO: renamed from: mbx, reason: collision with root package name */
    private static final int f63889mbx = 155;

    /* JADX INFO: renamed from: mi1u, reason: collision with root package name */
    private static final int f63890mi1u = 3;

    /* JADX INFO: renamed from: mj, reason: collision with root package name */
    private static final int f63891mj = 21976;

    /* JADX INFO: renamed from: mu, reason: collision with root package name */
    private static final String f63892mu = "A_AC3";

    /* JADX INFO: renamed from: n2t, reason: collision with root package name */
    private static final int f63893n2t = 21998;

    /* JADX INFO: renamed from: ngy, reason: collision with root package name */
    private static final int f63894ngy = 16871;

    /* JADX INFO: renamed from: nme, reason: collision with root package name */
    private static final int f63895nme = 25152;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    private static final String f63896nmn5 = "V_MPEG2";

    /* JADX INFO: renamed from: nnh, reason: collision with root package name */
    private static final int f63897nnh = 475249515;

    /* JADX INFO: renamed from: nsb, reason: collision with root package name */
    private static final int f63898nsb = 21930;

    /* JADX INFO: renamed from: nyj, reason: collision with root package name */
    private static final long f63899nyj = 10000;

    /* JADX INFO: renamed from: o05, reason: collision with root package name */
    private static final int f63900o05 = 225;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    private static final int f63901o5 = 30320;

    /* JADX INFO: renamed from: ob, reason: collision with root package name */
    private static final int f63902ob = 21970;

    /* JADX INFO: renamed from: oki, reason: collision with root package name */
    private static final int f63903oki = 21682;

    /* JADX INFO: renamed from: ovdh, reason: collision with root package name */
    private static final int f63904ovdh = 21978;

    /* JADX INFO: renamed from: pc, reason: collision with root package name */
    private static final int f63905pc = 131;

    /* JADX INFO: renamed from: pjz9, reason: collision with root package name */
    private static final int f63906pjz9 = 16868;

    /* JADX INFO: renamed from: pnt2, reason: collision with root package name */
    private static final int f63907pnt2 = 1;

    /* JADX INFO: renamed from: ps, reason: collision with root package name */
    private static final int f63908ps = 18402;

    /* JADX INFO: renamed from: py, reason: collision with root package name */
    private static final String f63909py = "S_TEXT/ASS";

    /* JADX INFO: renamed from: qh4d, reason: collision with root package name */
    private static final int f63910qh4d = 1685480259;

    /* JADX INFO: renamed from: qkj8, reason: collision with root package name */
    private static final String f63911qkj8 = "A_TRUEHD";

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private static final String f63912qo = "A_DTS/EXPRESS";

    /* JADX INFO: renamed from: r25n, reason: collision with root package name */
    private static final int f63913r25n = 20529;

    /* JADX INFO: renamed from: r6ty, reason: collision with root package name */
    private static final int f63914r6ty = 30325;

    /* JADX INFO: renamed from: r8s8, reason: collision with root package name */
    private static final String f63915r8s8 = "S_DVBSUB";

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static final int f63916ra = 18408;

    /* JADX INFO: renamed from: rp, reason: collision with root package name */
    private static final int f63917rp = 30322;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private static final int f63918se = 290298740;

    /* JADX INFO: renamed from: sok, reason: collision with root package name */
    private static final int f63919sok = 2;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final String f63920t8iq = "V_MPEG4/ISO/ASP";

    /* JADX INFO: renamed from: tfm, reason: collision with root package name */
    private static final String f63921tfm = "A_DTS/LOSSLESS";

    /* JADX INFO: renamed from: tww7, reason: collision with root package name */
    private static final int f63923tww7 = 21969;

    /* JADX INFO: renamed from: u */
    private static final String f19890u = "V_MPEG4/ISO/AP";

    /* JADX INFO: renamed from: u38j, reason: collision with root package name */
    private static final int f63924u38j = 18401;

    /* JADX INFO: renamed from: uc, reason: collision with root package name */
    private static final int f63925uc = 238;

    /* JADX INFO: renamed from: uf, reason: collision with root package name */
    private static final int f63926uf = 187;

    /* JADX INFO: renamed from: uj2j, reason: collision with root package name */
    private static final int f63927uj2j = 357149030;

    /* JADX INFO: renamed from: ukdy, reason: collision with root package name */
    private static final int f63928ukdy = 174;

    /* JADX INFO: renamed from: v */
    private static final String f19891v = "A_AAC";

    /* JADX INFO: renamed from: v0af, reason: collision with root package name */
    private static final int f63929v0af = 5760;

    /* JADX INFO: renamed from: v5yj, reason: collision with root package name */
    private static final int f63930v5yj = 18407;

    /* JADX INFO: renamed from: vep5, reason: collision with root package name */
    private static final int f63931vep5 = 161;

    /* JADX INFO: renamed from: vq, reason: collision with root package name */
    private static final String f63932vq = "A_EAC3";

    /* JADX INFO: renamed from: vss1, reason: collision with root package name */
    private static final String f63933vss1 = "%01d:%02d:%02d:%02d";

    /* JADX INFO: renamed from: vwb, reason: collision with root package name */
    private static final int f63934vwb = 1482049860;

    /* JADX INFO: renamed from: vy, reason: collision with root package name */
    private static final int f63935vy = 176;

    /* JADX INFO: renamed from: w */
    private static final int f19892w = 16981;

    /* JADX INFO: renamed from: w831, reason: collision with root package name */
    private static final int f63936w831 = 17143;

    /* JADX INFO: renamed from: was, reason: collision with root package name */
    private static final String f63937was = "A_PCM/INT/BIG";

    /* JADX INFO: renamed from: wlev, reason: collision with root package name */
    private static final int f63938wlev = 25506;

    /* JADX INFO: renamed from: wo, reason: collision with root package name */
    private static final String f63939wo = "A_FLAC";

    /* JADX INFO: renamed from: wt, reason: collision with root package name */
    private static final int f63940wt = 21946;

    /* JADX INFO: renamed from: wtop, reason: collision with root package name */
    private static final int f63941wtop = 19;

    /* JADX INFO: renamed from: wx16, reason: collision with root package name */
    private static final int f63942wx16 = 165;

    /* JADX INFO: renamed from: x */
    private static final String f19893x = "V_VP9";

    /* JADX INFO: renamed from: xblq, reason: collision with root package name */
    private static final int f63943xblq = 0;

    /* JADX INFO: renamed from: xm, reason: collision with root package name */
    private static final int f63944xm = 21975;

    /* JADX INFO: renamed from: xtb7, reason: collision with root package name */
    private static final int f63945xtb7 = 2;

    /* JADX INFO: renamed from: xwq3, reason: collision with root package name */
    private static final String f63946xwq3 = "A_OPUS";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final String f63948y2 = "V_MPEGH/ISO/HEVC";

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    private static final int f63949y9n = -1;

    /* JADX INFO: renamed from: yl, reason: collision with root package name */
    private static final int f63950yl = 166;

    /* JADX INFO: renamed from: yp31, reason: collision with root package name */
    private static final int f63951yp31 = 21432;

    /* JADX INFO: renamed from: yqrt, reason: collision with root package name */
    private static final int f63952yqrt = 17029;

    /* JADX INFO: renamed from: yw, reason: collision with root package name */
    private static final int f63953yw = 30321;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    private static final String f63954yz = "MatroskaExtractor";

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final int f63955z4 = 17026;

    /* JADX INFO: renamed from: z4j7, reason: collision with root package name */
    private static final int f63956z4j7 = 18;

    /* JADX INFO: renamed from: z4t, reason: collision with root package name */
    private static final int f63957z4t = 183;

    /* JADX INFO: renamed from: z617, reason: collision with root package name */
    private static final int f63958z617 = 826496599;

    /* JADX INFO: renamed from: zff0, reason: collision with root package name */
    private static final int f63959zff0 = 21936;

    /* JADX INFO: renamed from: zkd, reason: collision with root package name */
    private static final int f63960zkd = 21419;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final String f63961zp = "V_VP8";

    /* JADX INFO: renamed from: zsr0, reason: collision with root package name */
    private static final String f63962zsr0 = "S_TEXT/UTF8";

    /* JADX INFO: renamed from: zwy, reason: collision with root package name */
    private static final int f63963zwy = 2352003;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private long f63964a9;

    /* JADX INFO: renamed from: c */
    private int f19894c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final gvn7 f63965cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private long f63966d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f63967d3;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int[] f63968dd;

    /* JADX INFO: renamed from: e */
    private boolean f19895e;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private long f63969eqxt;

    /* JADX INFO: renamed from: f */
    private int f19896f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f63970f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private long f63971fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    @dd
    private fu4 f63972fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    @dd
    private q f63973fu4;

    /* JADX INFO: renamed from: g */
    private final SparseArray<q> f19897g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private boolean f63974gvn7;

    /* JADX INFO: renamed from: h */
    private final gvn7 f19898h;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    private byte f63975hb;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private boolean f63976hyr;

    /* JADX INFO: renamed from: i */
    private long f19899i;

    /* JADX INFO: renamed from: j */
    private boolean f19900j;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private long f63977jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    @dd
    private fu4 f63978jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private ByteBuffer f63979ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final gvn7 f63980kja0;

    /* JADX INFO: renamed from: l */
    private int f19901l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final gvn7 f63981ld6;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private int f63982lrht;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private int f63983lvui;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private long f63984mcp;

    /* JADX INFO: renamed from: n */
    private final f7l8 f19902n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int f63985n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final gvn7 f63986n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private int f63987ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private long f63988ni7;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    private int f63989nn86;

    /* JADX INFO: renamed from: o */
    private x2 f19903o;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int f63990o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private int f63991oc;

    /* JADX INFO: renamed from: p */
    private final gvn7 f19904p;

    /* JADX INFO: renamed from: q */
    private final com.google.android.exoplayer2.extractor.mkv.zy f19905q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final gvn7 f63992qrj;

    /* JADX INFO: renamed from: r */
    private int f19906r;

    /* JADX INFO: renamed from: s */
    private final gvn7 f19907s;

    /* JADX INFO: renamed from: t */
    private boolean f19908t;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f63993t8r;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private boolean f63994uv6;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private boolean f63995vyq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private long f63996wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final gvn7 f63997x2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private int f63998x9kr;

    /* JADX INFO: renamed from: y */
    private final gvn7 f19909y;

    /* JADX INFO: renamed from: z */
    private boolean f19910z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private long f63999zurt;

    /* JADX INFO: renamed from: m */
    public static final kja0 f19889m = new kja0() { // from class: com.google.android.exoplayer2.extractor.mkv.q
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return C3358n.wvg();
        }
    };

    /* JADX INFO: renamed from: xzl, reason: collision with root package name */
    private static final byte[] f63947xzl = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: tjz5, reason: collision with root package name */
    private static final byte[] f63922tjz5 = lrht.dr("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: f3f, reason: collision with root package name */
    private static final byte[] f63848f3f = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: d1ts, reason: collision with root package name */
    private static final UUID f63835d1ts = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.n$q */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    private static final class q {

        /* JADX INFO: renamed from: e */
        private static final int f19911e = 0;

        /* JADX INFO: renamed from: hb, reason: collision with root package name */
        private static final int f64000hb = 1000;

        /* JADX INFO: renamed from: j */
        private static final int f19912j = 200;

        /* JADX INFO: renamed from: nn86, reason: collision with root package name */
        private static final int f64001nn86 = 50000;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        public float f64002a9;

        /* JADX INFO: renamed from: c */
        public boolean f19913c;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        public int f64003cdj;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        public float f64004d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        public float f64005d3;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public int f64006dd;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        public float f64007eqxt;

        /* JADX INFO: renamed from: f */
        public boolean f19914f;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f64008f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        public float f64009fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        public float f64010fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        public boolean f64011fu4;

        /* JADX INFO: renamed from: g */
        public int f19915g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        public float f64012gvn7;

        /* JADX INFO: renamed from: h */
        public int f19916h;

        /* JADX INFO: renamed from: hyr, reason: collision with root package name */
        public mcp f64013hyr;

        /* JADX INFO: renamed from: i */
        public float f19917i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        public float f64014jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        public float f64015jp0y;

        /* JADX INFO: renamed from: k */
        public String f19918k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        public int f64016ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        public int f64017kja0;

        /* JADX INFO: renamed from: l */
        public long f19919l;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public byte[] f64018ld6;

        /* JADX INFO: renamed from: lrht, reason: collision with root package name */
        private String f64019lrht;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        public float f64020lvui;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        public int f64021mcp;

        /* JADX INFO: renamed from: n */
        public int f19920n;

        /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
        public long f64022n5r1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        public int f64023n7h;

        /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
        public int f64024ncyb;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        public int f64025ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        public int f64026o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        public float f64027oc;

        /* JADX INFO: renamed from: p */
        public InterfaceC3401t.k f19921p;

        /* JADX INFO: renamed from: q */
        public int f19922q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public int f64028qrj;

        /* JADX INFO: renamed from: r */
        public byte[] f19923r;

        /* JADX INFO: renamed from: s */
        public byte[] f19924s;

        /* JADX INFO: renamed from: t */
        public int f19925t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        public float f64029t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f64030toq;

        /* JADX INFO: renamed from: uv6, reason: collision with root package name */
        public InterfaceC3401t f64031uv6;

        /* JADX INFO: renamed from: vyq, reason: collision with root package name */
        public int f64032vyq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        public int f64033wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public DrmInitData f64034x2;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        public int f64035x9kr;

        /* JADX INFO: renamed from: y */
        public boolean f19926y;

        /* JADX INFO: renamed from: z */
        public int f19927z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        public byte[] f64036zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f64037zy;

        private q() {
            this.f64028qrj = -1;
            this.f64023n7h = -1;
            this.f64017kja0 = -1;
            this.f19916h = -1;
            this.f64003cdj = 0;
            this.f64016ki = -1;
            this.f64029t8r = 0.0f;
            this.f19917i = 0.0f;
            this.f64009fn3e = 0.0f;
            this.f64036zurt = null;
            this.f64025ni7 = -1;
            this.f64011fu4 = false;
            this.f19927z = -1;
            this.f64026o1t = -1;
            this.f64033wvg = -1;
            this.f19925t = 1000;
            this.f64021mcp = 200;
            this.f64014jk = -1.0f;
            this.f64002a9 = -1.0f;
            this.f64010fti = -1.0f;
            this.f64015jp0y = -1.0f;
            this.f64012gvn7 = -1.0f;
            this.f64005d3 = -1.0f;
            this.f64027oc = -1.0f;
            this.f64007eqxt = -1.0f;
            this.f64004d2ok = -1.0f;
            this.f64020lvui = -1.0f;
            this.f64006dd = 1;
            this.f64035x9kr = -1;
            this.f64024ncyb = 8000;
            this.f19919l = 0L;
            this.f64022n5r1 = 0L;
            this.f19913c = true;
            this.f64019lrht = "eng";
        }

        @dd
        private byte[] f7l8() {
            if (this.f64014jk == -1.0f || this.f64002a9 == -1.0f || this.f64010fti == -1.0f || this.f64015jp0y == -1.0f || this.f64012gvn7 == -1.0f || this.f64005d3 == -1.0f || this.f64027oc == -1.0f || this.f64007eqxt == -1.0f || this.f64004d2ok == -1.0f || this.f64020lvui == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f64014jk * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64002a9 * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64010fti * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64015jp0y * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64012gvn7 * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64005d3 * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64027oc * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f64007eqxt * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f64004d2ok + 0.5f));
            byteBufferOrder.putShort((short) (this.f64020lvui + 0.5f));
            byteBufferOrder.putShort((short) this.f19925t);
            byteBufferOrder.putShort((short) this.f64021mcp);
            return bArr;
        }

        @EnsuresNonNull({"codecPrivate"})
        /* JADX INFO: renamed from: g */
        private byte[] m11801g(String str) throws sok {
            byte[] bArr = this.f64018ld6;
            if (bArr != null) {
                return bArr;
            }
            String strValueOf = String.valueOf(str);
            throw sok.createForMalformedContainer(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        private static boolean ld6(gvn7 gvn7Var) throws sok {
            try {
                int iM13603z = gvn7Var.m13603z();
                if (iM13603z == 1) {
                    return true;
                }
                if (iM13603z != 65534) {
                    return false;
                }
                gvn7Var.n5r1(24);
                if (gvn7Var.o1t() == C3358n.f63835d1ts.getMostSignificantBits()) {
                    if (gvn7Var.o1t() == C3358n.f63835d1ts.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw sok.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @EnsuresNonNull({"output"})
        /* JADX INFO: renamed from: n */
        public void m11803n() {
            C3844k.f7l8(this.f64031uv6);
        }

        /* JADX INFO: renamed from: p */
        private static Pair<String, List<byte[]>> m11804p(gvn7 gvn7Var) throws sok {
            try {
                gvn7Var.hyr(16);
                long jZurt = gvn7Var.zurt();
                if (jZurt == 1482049860) {
                    return new Pair<>(wvg.f67102fn3e, null);
                }
                if (jZurt == 859189832) {
                    return new Pair<>(wvg.f23313s, null);
                }
                if (jZurt != 826496599) {
                    ni7.qrj(C3358n.f63954yz, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(wvg.f23319z, null);
                }
                byte[] bArrM13598q = gvn7Var.m13598q();
                for (int iM13596n = gvn7Var.m13596n() + 20; iM13596n < bArrM13598q.length - 4; iM13596n++) {
                    if (bArrM13598q[iM13596n] == 0 && bArrM13598q[iM13596n + 1] == 0 && bArrM13598q[iM13596n + 2] == 1 && bArrM13598q[iM13596n + 3] == 15) {
                        return new Pair<>(wvg.f23303i, Collections.singletonList(Arrays.copyOfRange(bArrM13598q, iM13596n, bArrM13598q.length)));
                    }
                }
                throw sok.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw sok.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> x2(byte[] bArr) throws sok {
            int i2;
            int i3;
            try {
                if (bArr[0] != 2) {
                    throw sok.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i4 = 0;
                int i5 = 1;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i4 += 255;
                    i5++;
                }
                int i6 = i5 + 1;
                int i7 = i4 + (i2 & 255);
                int i8 = 0;
                while (true) {
                    i3 = bArr[i6];
                    if ((i3 & 255) != 255) {
                        break;
                    }
                    i8 += 255;
                    i6++;
                }
                int i9 = i6 + 1;
                int i10 = i8 + (i3 & 255);
                if (bArr[i9] != 1) {
                    throw sok.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i7];
                System.arraycopy(bArr, i9, bArr2, 0, i7);
                int i11 = i9 + i7;
                if (bArr[i11] != 3) {
                    throw sok.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i12 = i11 + i10;
                if (bArr[i12] != 5) {
                    throw sok.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i12];
                System.arraycopy(bArr, i12, bArr3, 0, bArr.length - i12);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw sok.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        public void qrj() {
            mcp mcpVar = this.f64013hyr;
            if (mcpVar != null) {
                mcpVar.toq();
            }
        }

        @RequiresNonNull({"output"})
        /* JADX INFO: renamed from: s */
        public void m11806s() {
            mcp mcpVar = this.f64013hyr;
            if (mcpVar != null) {
                mcpVar.m11781k(this.f64031uv6, this.f19921p);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:200:0x0446  */
        /* JADX WARN: Removed duplicated region for block: B:205:0x045e  */
        /* JADX WARN: Removed duplicated region for block: B:206:0x0460  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x046d  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x047f  */
        /* JADX WARN: Removed duplicated region for block: B:257:0x0534  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0587  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
        @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.output"})
        @org.checkerframework.checker.nullness.qual.RequiresNonNull({"codecId"})
        /* JADX INFO: renamed from: y */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m11807y(com.google.android.exoplayer2.extractor.x2 r20, int r21) throws com.google.android.exoplayer2.sok {
            /*
                Method dump skipped, instruction units count: 1686
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.C3358n.q.m11807y(com.google.android.exoplayer2.extractor.x2, int):void");
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.n$toq */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.n$zy */
    /* JADX INFO: compiled from: MatroskaExtractor.java */
    private final class zy implements com.google.android.exoplayer2.extractor.mkv.toq {
        private zy() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        public void f7l8(int i2, String str) throws sok {
            C3358n.this.gvn7(i2, str);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        /* JADX INFO: renamed from: g */
        public void mo11808g(int i2, int i3, ld6 ld6Var) throws IOException {
            C3358n.this.x2(i2, i3, ld6Var);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        /* JADX INFO: renamed from: k */
        public void mo11809k(int i2) throws sok {
            C3358n.this.kja0(i2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        /* JADX INFO: renamed from: n */
        public boolean mo11810n(int i2) {
            return C3358n.this.o1t(i2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        /* JADX INFO: renamed from: q */
        public int mo11811q(int i2) {
            return C3358n.this.fn3e(i2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        public void toq(int i2, double d2) throws sok {
            C3358n.this.ki(i2, d2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        /* JADX INFO: renamed from: y */
        public void mo11812y(int i2, long j2, long j3) throws sok {
            C3358n.this.jp0y(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.toq
        public void zy(int i2, long j2) throws sok {
            C3358n.this.fu4(i2, j2);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f63862i1an = Collections.unmodifiableMap(map);
    }

    public C3358n() {
        this(0);
    }

    private long a9(long j2) throws sok {
        long j3 = this.f63971fn3e;
        if (j3 != C3548p.f65257toq) {
            return lrht.ktq(j2, j3, 1000L);
        }
        throw sok.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int cdj() {
        int i2 = this.f19894c;
        jk();
        return i2;
    }

    private void d2ok(ld6 ld6Var, byte[] bArr, int i2, int i3) throws IOException {
        int iMin = Math.min(i3, this.f63992qrj.m13594k());
        ld6Var.readFully(bArr, i2 + iMin, i3 - iMin);
        if (iMin > 0) {
            this.f63992qrj.ld6(bArr, i2, iMin);
        }
    }

    @RequiresNonNull({"#2.output"})
    private int d3(ld6 ld6Var, q qVar, int i2) throws IOException {
        int i3;
        if (f63962zsr0.equals(qVar.f64030toq)) {
            oc(ld6Var, f63947xzl, i2);
            return cdj();
        }
        if (f63909py.equals(qVar.f64030toq)) {
            oc(ld6Var, f63848f3f, i2);
            return cdj();
        }
        InterfaceC3401t interfaceC3401t = qVar.f64031uv6;
        if (!this.f63994uv6) {
            if (qVar.f19926y) {
                this.f19901l &= -1073741825;
                if (!this.f63995vyq) {
                    ld6Var.readFully(this.f19904p.m13598q(), 0, 1);
                    this.f19896f++;
                    if ((this.f19904p.m13598q()[0] & 128) == 128) {
                        throw sok.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f63975hb = this.f19904p.m13598q()[0];
                    this.f63995vyq = true;
                }
                byte b2 = this.f63975hb;
                if ((b2 & 1) == 1) {
                    boolean z2 = (b2 & 2) == 2;
                    this.f19901l |= 1073741824;
                    if (!this.f19900j) {
                        ld6Var.readFully(this.f63980kja0.m13598q(), 0, 8);
                        this.f19896f += 8;
                        this.f19900j = true;
                        this.f19904p.m13598q()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f19904p.n5r1(0);
                        interfaceC3401t.mo11928g(this.f19904p, 1, 1);
                        this.f19894c++;
                        this.f63980kja0.n5r1(0);
                        interfaceC3401t.mo11928g(this.f63980kja0, 8, 1);
                        this.f19894c += 8;
                    }
                    if (z2) {
                        if (!this.f19895e) {
                            ld6Var.readFully(this.f19904p.m13598q(), 0, 1);
                            this.f19896f++;
                            this.f19904p.n5r1(0);
                            this.f63989nn86 = this.f19904p.jp0y();
                            this.f19895e = true;
                        }
                        int i4 = this.f63989nn86 * 4;
                        this.f19904p.dd(i4);
                        ld6Var.readFully(this.f19904p.m13598q(), 0, i4);
                        this.f19896f += i4;
                        short s2 = (short) ((this.f63989nn86 / 2) + 1);
                        int i5 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.f63979ki;
                        if (byteBuffer == null || byteBuffer.capacity() < i5) {
                            this.f63979ki = ByteBuffer.allocate(i5);
                        }
                        this.f63979ki.position(0);
                        this.f63979ki.putShort(s2);
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            i3 = this.f63989nn86;
                            if (i6 >= i3) {
                                break;
                            }
                            int iEqxt = this.f19904p.eqxt();
                            if (i6 % 2 == 0) {
                                this.f63979ki.putShort((short) (iEqxt - i7));
                            } else {
                                this.f63979ki.putInt(iEqxt - i7);
                            }
                            i6++;
                            i7 = iEqxt;
                        }
                        int i8 = (i2 - this.f19896f) - i7;
                        if (i3 % 2 == 1) {
                            this.f63979ki.putInt(i8);
                        } else {
                            this.f63979ki.putShort((short) i8);
                            this.f63979ki.putInt(0);
                        }
                        this.f19898h.ncyb(this.f63979ki.array(), i5);
                        interfaceC3401t.mo11928g(this.f19898h, i5, 1);
                        this.f19894c += i5;
                    }
                }
            } else {
                byte[] bArr = qVar.f19924s;
                if (bArr != null) {
                    this.f63992qrj.ncyb(bArr, bArr.length);
                }
            }
            if (qVar.f19915g > 0) {
                this.f19901l |= 268435456;
                this.f63965cdj.dd(0);
                this.f19904p.dd(4);
                this.f19904p.m13598q()[0] = (byte) ((i2 >> 24) & 255);
                this.f19904p.m13598q()[1] = (byte) ((i2 >> 16) & 255);
                this.f19904p.m13598q()[2] = (byte) ((i2 >> 8) & 255);
                this.f19904p.m13598q()[3] = (byte) (i2 & 255);
                interfaceC3401t.mo11928g(this.f19904p, 4, 2);
                this.f19894c += 4;
            }
            this.f63994uv6 = true;
        }
        int iM13591g = i2 + this.f63992qrj.m13591g();
        if (!f63822bo.equals(qVar.f64030toq) && !f63948y2.equals(qVar.f64030toq)) {
            if (qVar.f64013hyr != null) {
                C3844k.m13633s(this.f63992qrj.m13591g() == 0);
                qVar.f64013hyr.m11782q(ld6Var);
            }
            while (true) {
                int i9 = this.f19896f;
                if (i9 >= iM13591g) {
                    break;
                }
                int iEqxt2 = eqxt(ld6Var, interfaceC3401t, iM13591g - i9);
                this.f19896f += iEqxt2;
                this.f19894c += iEqxt2;
            }
        } else {
            byte[] bArrM13598q = this.f19907s.m13598q();
            bArrM13598q[0] = 0;
            bArrM13598q[1] = 0;
            bArrM13598q[2] = 0;
            int i10 = qVar.f64032vyq;
            int i11 = 4 - i10;
            while (this.f19896f < iM13591g) {
                int i12 = this.f63982lrht;
                if (i12 == 0) {
                    d2ok(ld6Var, bArrM13598q, i11, i10);
                    this.f19896f += i10;
                    this.f19907s.n5r1(0);
                    this.f63982lrht = this.f19907s.eqxt();
                    this.f19909y.n5r1(0);
                    interfaceC3401t.zy(this.f19909y, 4);
                    this.f19894c += 4;
                } else {
                    int iEqxt3 = eqxt(ld6Var, interfaceC3401t, i12);
                    this.f19896f += iEqxt3;
                    this.f19894c += iEqxt3;
                    this.f63982lrht -= iEqxt3;
                }
            }
        }
        if (f63837dr.equals(qVar.f64030toq)) {
            this.f63981ld6.n5r1(0);
            interfaceC3401t.zy(this.f63981ld6, 4);
            this.f19894c += 4;
        }
        return cdj();
    }

    private int eqxt(ld6 ld6Var, InterfaceC3401t interfaceC3401t, int i2) throws IOException {
        int iM13594k = this.f63992qrj.m13594k();
        if (iM13594k <= 0) {
            return interfaceC3401t.toq(ld6Var, i2, false);
        }
        int iMin = Math.min(i2, iM13594k);
        interfaceC3401t.zy(this.f63992qrj, iMin);
        return iMin;
    }

    private static void fti(String str, long j2, byte[] bArr) {
        byte[] bArrT8r;
        int i2;
        str.hashCode();
        if (str.equals(f63909py)) {
            bArrT8r = t8r(j2, f63933vss1, f63899nyj);
            i2 = 21;
        } else {
            if (!str.equals(f63962zsr0)) {
                throw new IllegalArgumentException();
            }
            bArrT8r = t8r(j2, f63827c25, 1000L);
            i2 = 19;
        }
        System.arraycopy(bArrT8r, 0, bArr, i2, bArrT8r.length);
    }

    /* JADX INFO: renamed from: h */
    private static int[] m11793h(@dd int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    /* JADX INFO: renamed from: i */
    private q m11794i(int i2) throws sok {
        m11796p(i2);
        return this.f63973fu4;
    }

    private void jk() {
        this.f19896f = 0;
        this.f19894c = 0;
        this.f63982lrht = 0;
        this.f63994uv6 = false;
        this.f63995vyq = false;
        this.f19895e = false;
        this.f63989nn86 = 0;
        this.f63975hb = (byte) 0;
        this.f19900j = false;
        this.f63992qrj.dd(0);
    }

    @EnsuresNonNull({"extractorOutput"})
    private void ld6() {
        C3844k.ld6(this.f19903o);
    }

    private void mcp(ld6 ld6Var, int i2) throws IOException {
        if (this.f19904p.m13591g() >= i2) {
            return;
        }
        if (this.f19904p.toq() < i2) {
            gvn7 gvn7Var = this.f19904p;
            gvn7Var.zy(Math.max(gvn7Var.toq() * 2, i2));
        }
        ld6Var.readFully(this.f19904p.m13598q(), this.f19904p.m13591g(), i2 - this.f19904p.m13591g());
        this.f19904p.m13595l(i2);
    }

    @RequiresNonNull({"#1.output"})
    private void n7h(q qVar, long j2, int i2, int i3, int i4) {
        mcp mcpVar = qVar.f64013hyr;
        if (mcpVar != null) {
            mcpVar.zy(qVar.f64031uv6, j2, i2, i3, i4, qVar.f19921p);
        } else {
            if (f63962zsr0.equals(qVar.f64030toq) || f63909py.equals(qVar.f64030toq)) {
                if (this.f19906r > 1) {
                    ni7.qrj(f63954yz, "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.f63966d2ok;
                    if (j3 == C3548p.f65257toq) {
                        ni7.qrj(f63954yz, "Skipping subtitle sample with no duration.");
                    } else {
                        fti(qVar.f64030toq, j3, this.f63986n7h.m13598q());
                        int iM13596n = this.f63986n7h.m13596n();
                        while (true) {
                            if (iM13596n >= this.f63986n7h.m13591g()) {
                                break;
                            }
                            if (this.f63986n7h.m13598q()[iM13596n] == 0) {
                                this.f63986n7h.m13595l(iM13596n);
                                break;
                            }
                            iM13596n++;
                        }
                        InterfaceC3401t interfaceC3401t = qVar.f64031uv6;
                        gvn7 gvn7Var = this.f63986n7h;
                        interfaceC3401t.zy(gvn7Var, gvn7Var.m13591g());
                        i3 += this.f63986n7h.m13591g();
                    }
                }
            }
            if ((268435456 & i2) != 0) {
                if (this.f19906r > 1) {
                    i2 &= -268435457;
                } else {
                    int iM13591g = this.f63965cdj.m13591g();
                    qVar.f64031uv6.mo11928g(this.f63965cdj, iM13591g, 2);
                    i3 += iM13591g;
                }
            }
            qVar.f64031uv6.mo11930n(j2, i2, i3, i4, qVar.f19921p);
        }
        this.f63967d3 = true;
    }

    private void oc(ld6 ld6Var, byte[] bArr, int i2) throws IOException {
        int length = bArr.length + i2;
        if (this.f63986n7h.toq() < length) {
            this.f63986n7h.x9kr(Arrays.copyOf(bArr, length + i2));
        } else {
            System.arraycopy(bArr, 0, this.f63986n7h.m13598q(), 0, bArr.length);
        }
        ld6Var.readFully(this.f63986n7h.m13598q(), bArr.length, i2);
        this.f63986n7h.n5r1(0);
        this.f63986n7h.m13595l(length);
    }

    @EnsuresNonNull({"currentTrack"})
    /* JADX INFO: renamed from: p */
    private void m11796p(int i2) throws sok {
        if (this.f63973fu4 != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw sok.createForMalformedContainer(sb.toString(), null);
    }

    private o1t qrj(@dd fu4 fu4Var, @dd fu4 fu4Var2) {
        int i2;
        if (this.f19899i == -1 || this.f63988ni7 == C3548p.f65257toq || fu4Var == null || fu4Var.zy() == 0 || fu4Var2 == null || fu4Var2.zy() != fu4Var.zy()) {
            return new o1t.toq(this.f63988ni7);
        }
        int iZy = fu4Var.zy();
        int[] iArrCopyOf = new int[iZy];
        long[] jArrCopyOf = new long[iZy];
        long[] jArrCopyOf2 = new long[iZy];
        long[] jArrCopyOf3 = new long[iZy];
        int i3 = 0;
        for (int i4 = 0; i4 < iZy; i4++) {
            jArrCopyOf3[i4] = fu4Var.toq(i4);
            jArrCopyOf[i4] = this.f19899i + fu4Var2.toq(i4);
        }
        while (true) {
            i2 = iZy - 1;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            iArrCopyOf[i3] = (int) (jArrCopyOf[i5] - jArrCopyOf[i3]);
            jArrCopyOf2[i3] = jArrCopyOf3[i5] - jArrCopyOf3[i3];
            i3 = i5;
        }
        iArrCopyOf[i2] = (int) ((this.f19899i + this.f63993t8r) - jArrCopyOf[i2]);
        long j2 = this.f63988ni7 - jArrCopyOf3[i2];
        jArrCopyOf2[i2] = j2;
        if (j2 <= 0) {
            StringBuilder sb = new StringBuilder(72);
            sb.append("Discarding last cue point with unexpected duration: ");
            sb.append(j2);
            ni7.qrj(f63954yz, sb.toString());
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i2);
        }
        return new C3398q(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* JADX INFO: renamed from: s */
    private void m11797s(int i2) throws sok {
        if (this.f63972fti == null || this.f63978jp0y == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a Cues");
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
    }

    /* JADX INFO: renamed from: t */
    private boolean m11798t(com.google.android.exoplayer2.extractor.fu4 fu4Var, long j2) {
        if (this.f19908t) {
            this.f63977jk = j2;
            fu4Var.f19818k = this.f63984mcp;
            this.f19908t = false;
            return true;
        }
        if (this.f19910z) {
            long j3 = this.f63977jk;
            if (j3 != -1) {
                fu4Var.f19818k = j3;
                this.f63977jk = -1L;
                return true;
            }
        }
        return false;
    }

    private static byte[] t8r(long j2, String str, long j3) {
        C3844k.m13629k(j2 != C3548p.f65257toq);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return lrht.dr(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] wvg() {
        return new InterfaceC3397p[]{new C3358n()};
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: z */
    private static boolean m11800z(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(f19890u)) {
                    b2 = 0;
                }
                break;
            case -2095575984:
                if (str.equals(f63884lv5)) {
                    b2 = 1;
                }
                break;
            case -1985379776:
                if (str.equals(f63836d8wk)) {
                    b2 = 2;
                }
                break;
            case -1784763192:
                if (str.equals(f63911qkj8)) {
                    b2 = 3;
                }
                break;
            case -1730367663:
                if (str.equals(f63837dr)) {
                    b2 = 4;
                }
                break;
            case -1482641358:
                if (str.equals(f63866ikck)) {
                    b2 = 5;
                }
                break;
            case -1482641357:
                if (str.equals(f19888d)) {
                    b2 = 6;
                }
                break;
            case -1373388978:
                if (str.equals(f63828c8jq)) {
                    b2 = 7;
                }
                break;
            case -933872740:
                if (str.equals(f63915r8s8)) {
                    b2 = 8;
                }
                break;
            case -538363189:
                if (str.equals(f63920t8iq)) {
                    b2 = 9;
                }
                break;
            case -538363109:
                if (str.equals(f63822bo)) {
                    b2 = 10;
                }
                break;
            case -425012669:
                if (str.equals(f63864i9jn)) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case -356037306:
                if (str.equals(f63921tfm)) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 62923557:
                if (str.equals(f19891v)) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 62923603:
                if (str.equals(f63892mu)) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 62927045:
                if (str.equals(f63849fnq8)) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 82318131:
                if (str.equals(f63830ch)) {
                    b2 = 16;
                }
                break;
            case 82338133:
                if (str.equals(f63961zp)) {
                    b2 = 17;
                }
                break;
            case 82338134:
                if (str.equals(f19893x)) {
                    b2 = 18;
                }
                break;
            case 99146302:
                if (str.equals(f63883ltg8)) {
                    b2 = 19;
                }
                break;
            case 444813526:
                if (str.equals(f63857gyi)) {
                    b2 = com.google.common.base.zy.f68119fu4;
                }
                break;
            case 542569478:
                if (str.equals(f63912qo)) {
                    b2 = com.google.common.base.zy.f25761z;
                }
                break;
            case 635596514:
                if (str.equals(f63854gbni)) {
                    b2 = com.google.common.base.zy.f68130o1t;
                }
                break;
            case 725948237:
                if (str.equals(f63937was)) {
                    b2 = com.google.common.base.zy.f68135wvg;
                }
                break;
            case 725957860:
                if (str.equals(f63851g1)) {
                    b2 = com.google.common.base.zy.f25759t;
                }
                break;
            case 738597099:
                if (str.equals(f63909py)) {
                    b2 = com.google.common.base.zy.f68127mcp;
                }
                break;
            case 855502857:
                if (str.equals(f63948y2)) {
                    b2 = com.google.common.base.zy.f68121jk;
                }
                break;
            case 1422270023:
                if (str.equals(f63962zsr0)) {
                    b2 = com.google.common.base.zy.f68110a9;
                }
                break;
            case 1809237540:
                if (str.equals(f63896nmn5)) {
                    b2 = com.google.common.base.zy.f68118fti;
                }
                break;
            case 1950749482:
                if (str.equals(f63932vq)) {
                    b2 = com.google.common.base.zy.f68122jp0y;
                }
                break;
            case 1950789798:
                if (str.equals(f63939wo)) {
                    b2 = com.google.common.base.zy.f68120gvn7;
                }
                break;
            case 1951062397:
                if (str.equals(f63946xwq3)) {
                    b2 = com.google.common.base.zy.f68113d3;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    @InterfaceC7842s
    protected int fn3e(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case f63889mbx /* 155 */:
            case f63888m58i /* 159 */:
            case f63935vy /* 176 */:
            case f63874kiv /* 179 */:
            case f63812a5id /* 186 */:
            case f63840ebn /* 215 */:
            case f63819bek6 /* 231 */:
            case f63925uc /* 238 */:
            case f63821bih /* 241 */:
            case f63869ixz /* 251 */:
            case f63894ngy /* 16871 */:
            case f63878kx3 /* 16980 */:
            case f63952yqrt /* 17029 */:
            case f63936w831 /* 17143 */:
            case f63924u38j /* 18401 */:
            case f63916ra /* 18408 */:
            case f63913r25n /* 20529 */:
            case f63845ew /* 20530 */:
            case f63826bz2 /* 21420 */:
            case f63951yp31 /* 21432 */:
            case f63885lw /* 21680 */:
            case f63903oki /* 21682 */:
            case f63856gcp /* 21690 */:
            case f63898nsb /* 21930 */:
            case f63843el /* 21945 */:
            case f63940wt /* 21946 */:
            case f63850g0ad /* 21947 */:
            case f63867imd /* 21948 */:
            case f63823bqie /* 21949 */:
            case f63893n2t /* 21998 */:
            case f63852ga /* 22186 */:
            case f63839e5 /* 22203 */:
            case f63832cnbm /* 25188 */:
            case f63953yw /* 30321 */:
            case f63963zwy /* 2352003 */:
            case f63871jz5 /* 2807729 */:
                return 2;
            case 134:
            case f63955z4 /* 17026 */:
            case f63818bap7 /* 21358 */:
            case f63841ec /* 2274716 */:
                return 3;
            case 160:
            case f63950yl /* 166 */:
            case f63928ukdy /* 174 */:
            case f63957z4t /* 183 */:
            case f63926uf /* 187 */:
            case 224:
            case f63900o05 /* 225 */:
            case f63906pjz9 /* 16868 */:
            case f63930v5yj /* 18407 */:
            case f63855gc3c /* 19899 */:
            case f63868ix /* 20532 */:
            case f63886m2t /* 20533 */:
            case f63959zff0 /* 21936 */:
            case f63847f1bi /* 21968 */:
            case f63895nme /* 25152 */:
            case f63816b8 /* 28032 */:
            case f63870jbh /* 30113 */:
            case f63901o5 /* 30320 */:
            case f63918se /* 290298740 */:
            case 357149030:
            case f46208do /* 374648427 */:
            case f63873kcsr /* 408125543 */:
            case f63829cfr /* 440786851 */:
            case f63897nnh /* 475249515 */:
            case f63815b3e /* 524531317 */:
                return 1;
            case f63931vep5 /* 161 */:
            case f63833cv06 /* 163 */:
            case f63942wx16 /* 165 */:
            case f63881lh /* 16877 */:
            case f19892w /* 16981 */:
            case f63908ps /* 18402 */:
            case f63960zkd /* 21419 */:
            case f63938wlev /* 25506 */:
            case f63917rp /* 30322 */:
                return 4;
            case f63817b9ub /* 181 */:
            case f63877ktq /* 17545 */:
            case f63923tww7 /* 21969 */:
            case f63902ob /* 21970 */:
            case f63872kbj /* 21971 */:
            case f63853gb /* 21972 */:
            case f63824btvn /* 21973 */:
            case f63875kq2f /* 21974 */:
            case f63944xm /* 21975 */:
            case f63891mj /* 21976 */:
            case f63831cn02 /* 21977 */:
            case f63904ovdh /* 21978 */:
            case f63880l05 /* 30323 */:
            case f63834cyoe /* 30324 */:
            case f63914r6ty /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    @InterfaceC7842s
    protected void fu4(int i2, long j2) throws sok {
        if (i2 == f63913r25n) {
            if (j2 == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder(55);
            sb.append("ContentEncodingOrder ");
            sb.append(j2);
            sb.append(" not supported");
            throw sok.createForMalformedContainer(sb.toString(), null);
        }
        if (i2 == f63845ew) {
            if (j2 == 1) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingScope ");
            sb2.append(j2);
            sb2.append(" not supported");
            throw sok.createForMalformedContainer(sb2.toString(), null);
        }
        switch (i2) {
            case 131:
                m11794i(i2).f19922q = (int) j2;
                return;
            case 136:
                m11794i(i2).f19913c = j2 == 1;
                return;
            case f63889mbx /* 155 */:
                this.f63966d2ok = a9(j2);
                return;
            case f63888m58i /* 159 */:
                m11794i(i2).f64006dd = (int) j2;
                return;
            case f63935vy /* 176 */:
                m11794i(i2).f64028qrj = (int) j2;
                return;
            case f63874kiv /* 179 */:
                m11797s(i2);
                this.f63972fti.m13583k(a9(j2));
                return;
            case f63812a5id /* 186 */:
                m11794i(i2).f64023n7h = (int) j2;
                return;
            case f63840ebn /* 215 */:
                m11794i(i2).f64037zy = (int) j2;
                return;
            case f63819bek6 /* 231 */:
                this.f63964a9 = a9(j2);
                return;
            case f63925uc /* 238 */:
                this.f63985n5r1 = (int) j2;
                return;
            case f63821bih /* 241 */:
                if (this.f63974gvn7) {
                    return;
                }
                m11797s(i2);
                this.f63978jp0y.m13583k(j2);
                this.f63974gvn7 = true;
                return;
            case f63869ixz /* 251 */:
                this.f63976hyr = true;
                return;
            case f63894ngy /* 16871 */:
                m11794i(i2).f64008f7l8 = (int) j2;
                return;
            case f63878kx3 /* 16980 */:
                if (j2 == 3) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(50);
                sb3.append("ContentCompAlgo ");
                sb3.append(j2);
                sb3.append(" not supported");
                throw sok.createForMalformedContainer(sb3.toString(), null);
            case f63952yqrt /* 17029 */:
                if (j2 < 1 || j2 > 2) {
                    StringBuilder sb4 = new StringBuilder(53);
                    sb4.append("DocTypeReadVersion ");
                    sb4.append(j2);
                    sb4.append(" not supported");
                    throw sok.createForMalformedContainer(sb4.toString(), null);
                }
                return;
            case f63936w831 /* 17143 */:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb5 = new StringBuilder(50);
                sb5.append("EBMLReadVersion ");
                sb5.append(j2);
                sb5.append(" not supported");
                throw sok.createForMalformedContainer(sb5.toString(), null);
            case f63924u38j /* 18401 */:
                if (j2 == 5) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(49);
                sb6.append("ContentEncAlgo ");
                sb6.append(j2);
                sb6.append(" not supported");
                throw sok.createForMalformedContainer(sb6.toString(), null);
            case f63916ra /* 18408 */:
                if (j2 == 1) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(56);
                sb7.append("AESSettingsCipherMode ");
                sb7.append(j2);
                sb7.append(" not supported");
                throw sok.createForMalformedContainer(sb7.toString(), null);
            case f63826bz2 /* 21420 */:
                this.f63996wvg = j2 + this.f19899i;
                return;
            case f63951yp31 /* 21432 */:
                int i3 = (int) j2;
                m11796p(i2);
                if (i3 == 0) {
                    this.f63973fu4.f64025ni7 = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f63973fu4.f64025ni7 = 2;
                    return;
                } else if (i3 == 3) {
                    this.f63973fu4.f64025ni7 = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.f63973fu4.f64025ni7 = 3;
                    return;
                }
            case f63885lw /* 21680 */:
                m11794i(i2).f64017kja0 = (int) j2;
                return;
            case f63903oki /* 21682 */:
                m11794i(i2).f64003cdj = (int) j2;
                return;
            case f63856gcp /* 21690 */:
                m11794i(i2).f19916h = (int) j2;
                return;
            case f63898nsb /* 21930 */:
                m11794i(i2).f19914f = j2 == 1;
                return;
            case f63893n2t /* 21998 */:
                m11794i(i2).f19915g = (int) j2;
                return;
            case f63852ga /* 22186 */:
                m11794i(i2).f19919l = j2;
                return;
            case f63839e5 /* 22203 */:
                m11794i(i2).f64022n5r1 = j2;
                return;
            case f63832cnbm /* 25188 */:
                m11794i(i2).f64035x9kr = (int) j2;
                return;
            case f63953yw /* 30321 */:
                m11796p(i2);
                int i4 = (int) j2;
                if (i4 == 0) {
                    this.f63973fu4.f64016ki = 0;
                    return;
                }
                if (i4 == 1) {
                    this.f63973fu4.f64016ki = 1;
                    return;
                } else if (i4 == 2) {
                    this.f63973fu4.f64016ki = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.f63973fu4.f64016ki = 3;
                    return;
                }
            case f63963zwy /* 2352003 */:
                m11794i(i2).f19920n = (int) j2;
                return;
            case f63871jz5 /* 2807729 */:
                this.f63971fn3e = j2;
                return;
            default:
                switch (i2) {
                    case f63843el /* 21945 */:
                        m11796p(i2);
                        int i5 = (int) j2;
                        if (i5 == 1) {
                            this.f63973fu4.f64033wvg = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            this.f63973fu4.f64033wvg = 1;
                            return;
                        }
                    case f63940wt /* 21946 */:
                        m11796p(i2);
                        int iZy = com.google.android.exoplayer2.video.zy.zy((int) j2);
                        if (iZy != -1) {
                            this.f63973fu4.f64026o1t = iZy;
                            return;
                        }
                        return;
                    case f63850g0ad /* 21947 */:
                        m11796p(i2);
                        this.f63973fu4.f64011fu4 = true;
                        int qVar = com.google.android.exoplayer2.video.zy.toq((int) j2);
                        if (qVar != -1) {
                            this.f63973fu4.f19927z = qVar;
                            return;
                        }
                        return;
                    case f63867imd /* 21948 */:
                        m11794i(i2).f19925t = (int) j2;
                        return;
                    case f63823bqie /* 21949 */:
                        m11794i(i2).f64021mcp = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    @InterfaceC7842s
    protected void gvn7(int i2, String str) throws sok {
        if (i2 == 134) {
            m11794i(i2).f64030toq = str;
            return;
        }
        if (i2 != f63955z4) {
            if (i2 == f63818bap7) {
                m11794i(i2).f19918k = str;
                return;
            } else {
                if (i2 != f63841ec) {
                    return;
                }
                m11794i(i2).f64019lrht = str;
                return;
            }
        }
        if (f19886a.equals(str) || f63813a98o.equals(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("DocType ");
        sb.append(str);
        sb.append(" not supported");
        throw sok.createForMalformedContainer(sb.toString(), null);
    }

    @InterfaceC7842s
    protected void jp0y(int i2, long j2, long j3) throws sok {
        ld6();
        if (i2 == 160) {
            this.f63976hyr = false;
            return;
        }
        if (i2 == f63928ukdy) {
            this.f63973fu4 = new q();
            return;
        }
        if (i2 == f63926uf) {
            this.f63974gvn7 = false;
            return;
        }
        if (i2 == f63855gc3c) {
            this.f63990o1t = -1;
            this.f63996wvg = -1L;
            return;
        }
        if (i2 == f63886m2t) {
            m11794i(i2).f19926y = true;
            return;
        }
        if (i2 == f63847f1bi) {
            m11794i(i2).f64011fu4 = true;
            return;
        }
        if (i2 == f63873kcsr) {
            long j4 = this.f19899i;
            if (j4 != -1 && j4 != j2) {
                throw sok.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f19899i = j2;
            this.f63993t8r = j3;
            return;
        }
        if (i2 == f63897nnh) {
            this.f63972fti = new fu4();
            this.f63978jp0y = new fu4();
        } else if (i2 == f63815b3e && !this.f19910z) {
            if (this.f63970f7l8 && this.f63984mcp != -1) {
                this.f19908t = true;
            } else {
                this.f19903o.cdj(new o1t.toq(this.f63988ni7));
                this.f19910z = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    @InterfaceC7842s
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f63964a9 = C3548p.f65257toq;
        this.f63991oc = 0;
        this.f19905q.reset();
        this.f19902n.m11784n();
        jk();
        for (int i2 = 0; i2 < this.f19897g.size(); i2++) {
            this.f19897g.valueAt(i2).qrj();
        }
    }

    @InterfaceC7842s
    protected void ki(int i2, double d2) throws sok {
        if (i2 == f63817b9ub) {
            m11794i(i2).f64024ncyb = (int) d2;
        }
        if (i2 == f63877ktq) {
            this.f63999zurt = (long) d2;
            return;
        }
        switch (i2) {
            case f63923tww7 /* 21969 */:
                m11794i(i2).f64014jk = (float) d2;
                break;
            case f63902ob /* 21970 */:
                m11794i(i2).f64002a9 = (float) d2;
                break;
            case f63872kbj /* 21971 */:
                m11794i(i2).f64010fti = (float) d2;
                break;
            case f63853gb /* 21972 */:
                m11794i(i2).f64015jp0y = (float) d2;
                break;
            case f63824btvn /* 21973 */:
                m11794i(i2).f64012gvn7 = (float) d2;
                break;
            case f63875kq2f /* 21974 */:
                m11794i(i2).f64005d3 = (float) d2;
                break;
            case f63944xm /* 21975 */:
                m11794i(i2).f64027oc = (float) d2;
                break;
            case f63891mj /* 21976 */:
                m11794i(i2).f64007eqxt = (float) d2;
                break;
            case f63831cn02 /* 21977 */:
                m11794i(i2).f64004d2ok = (float) d2;
                break;
            case f63904ovdh /* 21978 */:
                m11794i(i2).f64020lvui = (float) d2;
                break;
            default:
                switch (i2) {
                    case f63880l05 /* 30323 */:
                        m11794i(i2).f64029t8r = (float) d2;
                        break;
                    case f63834cyoe /* 30324 */:
                        m11794i(i2).f19917i = (float) d2;
                        break;
                    case f63914r6ty /* 30325 */:
                        m11794i(i2).f64009fn3e = (float) d2;
                        break;
                }
                break;
        }
    }

    @InterfaceC7842s
    protected void kja0(int i2) throws sok {
        ld6();
        if (i2 == 160) {
            if (this.f63991oc != 2) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < this.f19906r; i4++) {
                i3 += this.f63968dd[i4];
            }
            q qVar = this.f19897g.get(this.f63998x9kr);
            qVar.m11803n();
            for (int i5 = 0; i5 < this.f19906r; i5++) {
                long j2 = ((long) ((qVar.f19920n * i5) / 1000)) + this.f63969eqxt;
                int i6 = this.f19901l;
                if (i5 == 0 && !this.f63976hyr) {
                    i6 |= 1;
                }
                int i7 = this.f63968dd[i5];
                i3 -= i7;
                n7h(qVar, j2, i6, i7, i3);
            }
            this.f63991oc = 0;
            return;
        }
        if (i2 == f63928ukdy) {
            q qVar2 = (q) C3844k.ld6(this.f63973fu4);
            String str = qVar2.f64030toq;
            if (str == null) {
                throw sok.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (m11800z(str)) {
                qVar2.m11807y(this.f19903o, qVar2.f64037zy);
                this.f19897g.put(qVar2.f64037zy, qVar2);
            }
            this.f63973fu4 = null;
            return;
        }
        if (i2 == f63855gc3c) {
            int i8 = this.f63990o1t;
            if (i8 != -1) {
                long j3 = this.f63996wvg;
                if (j3 != -1) {
                    if (i8 == f63897nnh) {
                        this.f63984mcp = j3;
                        return;
                    }
                    return;
                }
            }
            throw sok.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i2 == f63895nme) {
            m11796p(i2);
            q qVar3 = this.f63973fu4;
            if (qVar3.f19926y) {
                if (qVar3.f19921p == null) {
                    throw sok.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                qVar3.f64034x2 = new DrmInitData(new DrmInitData.SchemeData(C3548p.f65130b9ub, wvg.f23318y, this.f63973fu4.f19921p.f64392toq));
                return;
            }
            return;
        }
        if (i2 == f63816b8) {
            m11796p(i2);
            q qVar4 = this.f63973fu4;
            if (qVar4.f19926y && qVar4.f19924s != null) {
                throw sok.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.f63971fn3e == C3548p.f65257toq) {
                this.f63971fn3e = 1000000L;
            }
            long j4 = this.f63999zurt;
            if (j4 != C3548p.f65257toq) {
                this.f63988ni7 = a9(j4);
                return;
            }
            return;
        }
        if (i2 == f46208do) {
            if (this.f19897g.size() == 0) {
                throw sok.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f19903o.mo11753i();
        } else {
            if (i2 != f63897nnh) {
                return;
            }
            if (!this.f19910z) {
                this.f19903o.cdj(qrj(this.f63972fti, this.f63978jp0y));
                this.f19910z = true;
            }
            this.f63972fti = null;
            this.f63978jp0y = null;
        }
    }

    protected void ni7(q qVar, int i2, ld6 ld6Var, int i3) throws IOException {
        if (i2 != 4 || !f19893x.equals(qVar.f64030toq)) {
            ld6Var.cdj(i3);
        } else {
            this.f63965cdj.dd(i3);
            ld6Var.readFully(this.f63965cdj.m13598q(), 0, i3);
        }
    }

    @InterfaceC7842s
    protected boolean o1t(int i2) {
        return i2 == 357149030 || i2 == f63815b3e || i2 == f63897nnh || i2 == f46208do;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public final void mo11689q(x2 x2Var) {
        this.f19903o = x2Var;
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public final void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public final boolean toq(ld6 ld6Var) throws IOException {
        return new C3356g().toq(ld6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x023f, code lost:
    
        throw com.google.android.exoplayer2.sok.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    @zy.InterfaceC7842s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void x2(int r22, int r23, com.google.android.exoplayer2.extractor.ld6 r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.C3358n.x2(int, int, com.google.android.exoplayer2.extractor.ld6):void");
    }

    protected void zurt(q qVar, ld6 ld6Var, int i2) throws IOException {
        if (qVar.f64008f7l8 != 1685485123 && qVar.f64008f7l8 != 1685480259) {
            ld6Var.cdj(i2);
            return;
        }
        byte[] bArr = new byte[i2];
        qVar.f19923r = bArr;
        ld6Var.readFully(bArr, 0, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public final int zy(ld6 ld6Var, com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException {
        this.f63967d3 = false;
        boolean zMo11790k = true;
        while (zMo11790k && !this.f63967d3) {
            zMo11790k = this.f19905q.mo11790k(ld6Var);
            if (zMo11790k && m11798t(fu4Var, ld6Var.getPosition())) {
                return 1;
            }
        }
        if (zMo11790k) {
            return 0;
        }
        for (int i2 = 0; i2 < this.f19897g.size(); i2++) {
            q qVarValueAt = this.f19897g.valueAt(i2);
            qVarValueAt.m11803n();
            qVarValueAt.m11806s();
        }
        return -1;
    }

    public C3358n(int i2) {
        this(new C3357k(), i2);
    }

    C3358n(com.google.android.exoplayer2.extractor.mkv.zy zyVar, int i2) {
        this.f19899i = -1L;
        this.f63971fn3e = C3548p.f65257toq;
        this.f63999zurt = C3548p.f65257toq;
        this.f63988ni7 = C3548p.f65257toq;
        this.f63984mcp = -1L;
        this.f63977jk = -1L;
        this.f63964a9 = C3548p.f65257toq;
        this.f19905q = zyVar;
        zyVar.toq(new zy());
        this.f63970f7l8 = (i2 & 1) == 0;
        this.f19902n = new f7l8();
        this.f19897g = new SparseArray<>();
        this.f19904p = new gvn7(4);
        this.f63981ld6 = new gvn7(ByteBuffer.allocate(4).putInt(-1).array());
        this.f63997x2 = new gvn7(4);
        this.f19909y = new gvn7(C3856t.f67070toq);
        this.f19907s = new gvn7(4);
        this.f63992qrj = new gvn7();
        this.f63986n7h = new gvn7();
        this.f63980kja0 = new gvn7(8);
        this.f19898h = new gvn7();
        this.f63965cdj = new gvn7();
        this.f63968dd = new int[1];
    }
}
