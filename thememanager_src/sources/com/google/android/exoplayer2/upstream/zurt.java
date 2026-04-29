package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.google.android.exoplayer2.upstream.InterfaceC3808n;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.InterfaceC3850n;
import com.google.android.exoplayer2.util.jk;
import com.google.common.collect.se;
import com.google.common.collect.zkd;
import com.miui.clock.module.toq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.io.encoding.C6247k;
import miuix.view.C7385p;
import okio.C7571o;

/* JADX INFO: compiled from: DefaultBandwidthMeter.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zurt implements InterfaceC3808n, uv6 {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f66947a9 = 2000;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f66950fti = 524288;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f66951fu4 = 0;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    @zy.dd
    private static zurt f66952jk = null;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f66954mcp = 5;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f66955ni7 = 2000;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f66956o1t = 2;

    /* JADX INFO: renamed from: t */
    private static final int f23141t = 4;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f66958wvg = 3;

    /* JADX INFO: renamed from: z */
    private static final int f23142z = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final long f66959zurt = 1000000;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f66960f7l8;

    /* JADX INFO: renamed from: g */
    private int f23143g;

    /* JADX INFO: renamed from: k */
    private final zkd<Integer, Long> f23144k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f66961kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f66962ld6;

    /* JADX INFO: renamed from: n */
    private final boolean f23145n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f66963n7h;

    /* JADX INFO: renamed from: p */
    private long f23146p;

    /* JADX INFO: renamed from: q */
    private final InterfaceC3850n f23147q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f66964qrj;

    /* JADX INFO: renamed from: s */
    private int f23148s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC3808n.k.C7968k f66965toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f66966x2;

    /* JADX INFO: renamed from: y */
    private long f23149y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final hyr f66967zy;

    /* JADX INFO: renamed from: h */
    public static final se<Long> f23139h = se.of(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final se<Long> f66948cdj = se.of(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final se<Long> f66953ki = se.of(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final se<Long> f66957t8r = se.of(3400000L, 2000000L, 1400000L, 1000000L, 620000L);

    /* JADX INFO: renamed from: i */
    public static final se<Long> f23140i = se.of(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final se<Long> f66949fn3e = se.of(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* JADX INFO: compiled from: DefaultBandwidthMeter.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @zy.dd
        private final Context f23150k;

        /* JADX INFO: renamed from: n */
        private boolean f23151n;

        /* JADX INFO: renamed from: q */
        private InterfaceC3850n f23152q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Map<Integer, Long> f66968toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f66969zy;

        public toq(Context context) {
            this.f23150k = context == null ? null : context.getApplicationContext();
            this.f66968toq = toq(com.google.android.exoplayer2.util.lrht.m13657f(context));
            this.f66969zy = 2000;
            this.f23152q = InterfaceC3850n.f23248k;
            this.f23151n = true;
        }

        private static Map<Integer, Long> toq(String str) {
            int[] iArrX2 = zurt.x2(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            se<Long> seVar = zurt.f23139h;
            map.put(2, seVar.get(iArrX2[0]));
            map.put(3, zurt.f66948cdj.get(iArrX2[1]));
            map.put(4, zurt.f66953ki.get(iArrX2[2]));
            map.put(5, zurt.f66957t8r.get(iArrX2[3]));
            map.put(10, zurt.f23140i.get(iArrX2[4]));
            map.put(9, zurt.f66949fn3e.get(iArrX2[5]));
            map.put(7, seVar.get(iArrX2[0]));
            return map;
        }

        public toq f7l8(boolean z2) {
            this.f23151n = z2;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m13538g(String str) {
            this.f66968toq = toq(com.google.common.base.zy.m15459p(str));
            return this;
        }

        /* JADX INFO: renamed from: k */
        public zurt m13539k() {
            return new zurt(this.f23150k, this.f66968toq, this.f66969zy, this.f23152q, this.f23151n);
        }

        /* JADX INFO: renamed from: n */
        public toq m13540n(long j2) {
            Iterator<Integer> it = this.f66968toq.keySet().iterator();
            while (it.hasNext()) {
                m13541q(it.next().intValue(), j2);
            }
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m13541q(int i2, long j2) {
            this.f66968toq.put(Integer.valueOf(i2), Long.valueOf(j2));
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m13542y(int i2) {
            this.f66969zy = i2;
            return this;
        }

        public toq zy(InterfaceC3850n interfaceC3850n) {
            this.f23152q = interfaceC3850n;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void cdj(int i2) {
        int i3 = this.f23148s;
        if (i3 == 0 || this.f23145n) {
            if (this.f66963n7h) {
                i2 = this.f66961kja0;
            }
            if (i3 == i2) {
                return;
            }
            this.f23148s = i2;
            if (i2 != 1 && i2 != 0 && i2 != 8) {
                this.f66966x2 = qrj(i2);
                long jMo13575q = this.f23147q.mo13575q();
                m13536h(this.f23143g > 0 ? (int) (jMo13575q - this.f66960f7l8) : 0, this.f23149y, this.f66966x2);
                this.f66960f7l8 = jMo13575q;
                this.f23149y = 0L;
                this.f66962ld6 = 0L;
                this.f23146p = 0L;
                this.f66967zy.m13470s();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private void m13536h(int i2, long j2, long j3) {
        if (i2 == 0 && j2 == 0 && j3 == this.f66964qrj) {
            return;
        }
        this.f66964qrj = j3;
        this.f66965toq.zy(i2, j2, j3);
    }

    private static boolean kja0(t8r t8rVar, boolean z2) {
        return z2 && !t8rVar.m13515q(8);
    }

    public static synchronized zurt n7h(Context context) {
        if (f66952jk == null) {
            f66952jk = new toq(context).m13539k();
        }
        return f66952jk;
    }

    private long qrj(int i2) {
        Long l2 = this.f23144k.get(Integer.valueOf(i2));
        if (l2 == null) {
            l2 = this.f23144k.get(0);
        }
        if (l2 == null) {
            l2 = 1000000L;
        }
        return l2.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] x2(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 2083:
                if (str.equals("AD")) {
                    b2 = 0;
                }
                break;
            case 2084:
                if (str.equals("AE")) {
                    b2 = 1;
                }
                break;
            case 2085:
                if (str.equals("AF")) {
                    b2 = 2;
                }
                break;
            case 2086:
                if (str.equals("AG")) {
                    b2 = 3;
                }
                break;
            case 2088:
                if (str.equals("AI")) {
                    b2 = 4;
                }
                break;
            case 2091:
                if (str.equals("AL")) {
                    b2 = 5;
                }
                break;
            case 2092:
                if (str.equals("AM")) {
                    b2 = 6;
                }
                break;
            case 2094:
                if (str.equals("AO")) {
                    b2 = 7;
                }
                break;
            case 2096:
                if (str.equals("AQ")) {
                    b2 = 8;
                }
                break;
            case 2097:
                if (str.equals("AR")) {
                    b2 = 9;
                }
                break;
            case 2098:
                if (str.equals("AS")) {
                    b2 = 10;
                }
                break;
            case 2099:
                if (str.equals("AT")) {
                    b2 = com.google.common.base.zy.f68132qrj;
                }
                break;
            case 2100:
                if (str.equals("AU")) {
                    b2 = com.google.common.base.zy.f68128n7h;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b2 = com.google.common.base.zy.f68124kja0;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b2 = com.google.common.base.zy.f25751h;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b2 = com.google.common.base.zy.f68111cdj;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b2 = 16;
                }
                break;
            case 2112:
                if (str.equals("BB")) {
                    b2 = 17;
                }
                break;
            case 2114:
                if (str.equals("BD")) {
                    b2 = 18;
                }
                break;
            case 2115:
                if (str.equals("BE")) {
                    b2 = 19;
                }
                break;
            case 2116:
                if (str.equals("BF")) {
                    b2 = com.google.common.base.zy.f68119fu4;
                }
                break;
            case 2117:
                if (str.equals("BG")) {
                    b2 = com.google.common.base.zy.f25761z;
                }
                break;
            case 2118:
                if (str.equals("BH")) {
                    b2 = com.google.common.base.zy.f68130o1t;
                }
                break;
            case 2119:
                if (str.equals("BI")) {
                    b2 = com.google.common.base.zy.f68135wvg;
                }
                break;
            case 2120:
                if (str.equals("BJ")) {
                    b2 = com.google.common.base.zy.f25759t;
                }
                break;
            case 2122:
                if (str.equals("BL")) {
                    b2 = com.google.common.base.zy.f68127mcp;
                }
                break;
            case 2123:
                if (str.equals("BM")) {
                    b2 = com.google.common.base.zy.f68121jk;
                }
                break;
            case 2124:
                if (str.equals("BN")) {
                    b2 = com.google.common.base.zy.f68110a9;
                }
                break;
            case 2125:
                if (str.equals("BO")) {
                    b2 = com.google.common.base.zy.f68118fti;
                }
                break;
            case 2127:
                if (str.equals("BQ")) {
                    b2 = com.google.common.base.zy.f68122jp0y;
                }
                break;
            case 2128:
                if (str.equals("BR")) {
                    b2 = com.google.common.base.zy.f68120gvn7;
                }
                break;
            case 2129:
                if (str.equals("BS")) {
                    b2 = com.google.common.base.zy.f68113d3;
                }
                break;
            case 2130:
                if (str.equals("BT")) {
                    b2 = 32;
                }
                break;
            case 2133:
                if (str.equals("BW")) {
                    b2 = 33;
                }
                break;
            case 2135:
                if (str.equals("BY")) {
                    b2 = 34;
                }
                break;
            case 2136:
                if (str.equals("BZ")) {
                    b2 = 35;
                }
                break;
            case 2142:
                if (str.equals("CA")) {
                    b2 = 36;
                }
                break;
            case 2145:
                if (str.equals("CD")) {
                    b2 = 37;
                }
                break;
            case 2147:
                if (str.equals("CF")) {
                    b2 = 38;
                }
                break;
            case 2148:
                if (str.equals("CG")) {
                    b2 = 39;
                }
                break;
            case 2149:
                if (str.equals("CH")) {
                    b2 = 40;
                }
                break;
            case 2150:
                if (str.equals("CI")) {
                    b2 = 41;
                }
                break;
            case 2152:
                if (str.equals("CK")) {
                    b2 = 42;
                }
                break;
            case 2153:
                if (str.equals("CL")) {
                    b2 = 43;
                }
                break;
            case 2154:
                if (str.equals("CM")) {
                    b2 = 44;
                }
                break;
            case 2155:
                if (str.equals("CN")) {
                    b2 = 45;
                }
                break;
            case 2156:
                if (str.equals("CO")) {
                    b2 = 46;
                }
                break;
            case 2159:
                if (str.equals("CR")) {
                    b2 = 47;
                }
                break;
            case 2162:
                if (str.equals("CU")) {
                    b2 = 48;
                }
                break;
            case 2163:
                if (str.equals("CV")) {
                    b2 = 49;
                }
                break;
            case 2164:
                if (str.equals("CW")) {
                    b2 = 50;
                }
                break;
            case 2165:
                if (str.equals("CX")) {
                    b2 = 51;
                }
                break;
            case 2166:
                if (str.equals("CY")) {
                    b2 = 52;
                }
                break;
            case 2167:
                if (str.equals("CZ")) {
                    b2 = 53;
                }
                break;
            case 2177:
                if (str.equals("DE")) {
                    b2 = 54;
                }
                break;
            case 2182:
                if (str.equals("DJ")) {
                    b2 = 55;
                }
                break;
            case 2183:
                if (str.equals("DK")) {
                    b2 = 56;
                }
                break;
            case 2185:
                if (str.equals("DM")) {
                    b2 = 57;
                }
                break;
            case 2187:
                if (str.equals("DO")) {
                    b2 = 58;
                }
                break;
            case 2198:
                if (str.equals("DZ")) {
                    b2 = 59;
                }
                break;
            case 2206:
                if (str.equals("EC")) {
                    b2 = 60;
                }
                break;
            case 2208:
                if (str.equals("EE")) {
                    b2 = C6247k.f36300y;
                }
                break;
            case 2210:
                if (str.equals("EG")) {
                    b2 = 62;
                }
                break;
            case 2221:
                if (str.equals("ER")) {
                    b2 = C7571o.f43818k;
                }
                break;
            case 2222:
                if (str.equals(com.market.sdk.utils.kja0.f28214q)) {
                    b2 = 64;
                }
                break;
            case 2223:
                if (str.equals("ET")) {
                    b2 = 65;
                }
                break;
            case 2243:
                if (str.equals("FI")) {
                    b2 = 66;
                }
                break;
            case 2244:
                if (str.equals("FJ")) {
                    b2 = 67;
                }
                break;
            case 2245:
                if (str.equals("FK")) {
                    b2 = 68;
                }
                break;
            case 2247:
                if (str.equals("FM")) {
                    b2 = 69;
                }
                break;
            case 2249:
                if (str.equals("FO")) {
                    b2 = 70;
                }
                break;
            case 2252:
                if (str.equals("FR")) {
                    b2 = 71;
                }
                break;
            case 2266:
                if (str.equals("GA")) {
                    b2 = 72;
                }
                break;
            case 2267:
                if (str.equals("GB")) {
                    b2 = 73;
                }
                break;
            case 2269:
                if (str.equals("GD")) {
                    b2 = 74;
                }
                break;
            case 2270:
                if (str.equals("GE")) {
                    b2 = 75;
                }
                break;
            case 2271:
                if (str.equals("GF")) {
                    b2 = 76;
                }
                break;
            case 2272:
                if (str.equals("GG")) {
                    b2 = 77;
                }
                break;
            case 2273:
                if (str.equals("GH")) {
                    b2 = 78;
                }
                break;
            case 2274:
                if (str.equals("GI")) {
                    b2 = 79;
                }
                break;
            case 2277:
                if (str.equals("GL")) {
                    b2 = 80;
                }
                break;
            case 2278:
                if (str.equals("GM")) {
                    b2 = 81;
                }
                break;
            case 2279:
                if (str.equals("GN")) {
                    b2 = 82;
                }
                break;
            case 2281:
                if (str.equals("GP")) {
                    b2 = 83;
                }
                break;
            case 2282:
                if (str.equals("GQ")) {
                    b2 = 84;
                }
                break;
            case 2283:
                if (str.equals("GR")) {
                    b2 = 85;
                }
                break;
            case 2285:
                if (str.equals("GT")) {
                    b2 = 86;
                }
                break;
            case 2286:
                if (str.equals("GU")) {
                    b2 = 87;
                }
                break;
            case 2288:
                if (str.equals("GW")) {
                    b2 = 88;
                }
                break;
            case 2290:
                if (str.equals("GY")) {
                    b2 = 89;
                }
                break;
            case 2307:
                if (str.equals("HK")) {
                    b2 = 90;
                }
                break;
            case 2310:
                if (str.equals("HN")) {
                    b2 = 91;
                }
                break;
            case 2314:
                if (str.equals("HR")) {
                    b2 = 92;
                }
                break;
            case 2316:
                if (str.equals("HT")) {
                    b2 = 93;
                }
                break;
            case 2317:
                if (str.equals("HU")) {
                    b2 = 94;
                }
                break;
            case 2331:
                if (str.equals(com.market.sdk.utils.kja0.f68998toq)) {
                    b2 = 95;
                }
                break;
            case 2332:
                if (str.equals("IE")) {
                    b2 = 96;
                }
                break;
            case 2339:
                if (str.equals("IL")) {
                    b2 = 97;
                }
                break;
            case 2340:
                if (str.equals("IM")) {
                    b2 = 98;
                }
                break;
            case 2341:
                if (str.equals(com.market.sdk.utils.kja0.f28213k)) {
                    b2 = 99;
                }
                break;
            case 2342:
                if (str.equals("IO")) {
                    b2 = 100;
                }
                break;
            case 2344:
                if (str.equals("IQ")) {
                    b2 = 101;
                }
                break;
            case 2345:
                if (str.equals("IR")) {
                    b2 = 102;
                }
                break;
            case 2346:
                if (str.equals("IS")) {
                    b2 = 103;
                }
                break;
            case 2347:
                if (str.equals("IT")) {
                    b2 = 104;
                }
                break;
            case 2363:
                if (str.equals("JE")) {
                    b2 = 105;
                }
                break;
            case 2371:
                if (str.equals("JM")) {
                    b2 = 106;
                }
                break;
            case 2373:
                if (str.equals("JO")) {
                    b2 = 107;
                }
                break;
            case 2374:
                if (str.equals("JP")) {
                    b2 = 108;
                }
                break;
            case 2394:
                if (str.equals("KE")) {
                    b2 = 109;
                }
                break;
            case 2396:
                if (str.equals("KG")) {
                    b2 = 110;
                }
                break;
            case 2397:
                if (str.equals("KH")) {
                    b2 = 111;
                }
                break;
            case 2398:
                if (str.equals("KI")) {
                    b2 = 112;
                }
                break;
            case 2402:
                if (str.equals("KM")) {
                    b2 = 113;
                }
                break;
            case 2405:
                if (str.equals("KP")) {
                    b2 = 114;
                }
                break;
            case 2407:
                if (str.equals("KR")) {
                    b2 = 115;
                }
                break;
            case 2412:
                if (str.equals("KW")) {
                    b2 = 116;
                }
                break;
            case 2414:
                if (str.equals("KY")) {
                    b2 = 117;
                }
                break;
            case 2415:
                if (str.equals("KZ")) {
                    b2 = 118;
                }
                break;
            case 2421:
                if (str.equals("LA")) {
                    b2 = 119;
                }
                break;
            case 2422:
                if (str.equals("LB")) {
                    b2 = 120;
                }
                break;
            case 2423:
                if (str.equals("LC")) {
                    b2 = 121;
                }
                break;
            case 2429:
                if (str.equals("LI")) {
                    b2 = 122;
                }
                break;
            case 2431:
                if (str.equals("LK")) {
                    b2 = 123;
                }
                break;
            case 2438:
                if (str.equals("LR")) {
                    b2 = 124;
                }
                break;
            case 2439:
                if (str.equals("LS")) {
                    b2 = 125;
                }
                break;
            case 2440:
                if (str.equals("LT")) {
                    b2 = 126;
                }
                break;
            case 2441:
                if (str.equals("LU")) {
                    b2 = 127;
                }
                break;
            case 2442:
                if (str.equals("LV")) {
                    b2 = 128;
                }
                break;
            case 2445:
                if (str.equals("LY")) {
                    b2 = 129;
                }
                break;
            case 2452:
                if (str.equals("MA")) {
                    b2 = 130;
                }
                break;
            case 2454:
                if (str.equals("MC")) {
                    b2 = 131;
                }
                break;
            case 2455:
                if (str.equals("MD")) {
                    b2 = 132;
                }
                break;
            case 2456:
                if (str.equals("ME")) {
                    b2 = 133;
                }
                break;
            case 2457:
                if (str.equals("MF")) {
                    b2 = 134;
                }
                break;
            case 2458:
                if (str.equals("MG")) {
                    b2 = 135;
                }
                break;
            case 2459:
                if (str.equals("MH")) {
                    b2 = 136;
                }
                break;
            case 2462:
                if (str.equals("MK")) {
                    b2 = 137;
                }
                break;
            case 2463:
                if (str.equals("ML")) {
                    b2 = 138;
                }
                break;
            case 2464:
                if (str.equals("MM")) {
                    b2 = 139;
                }
                break;
            case 2465:
                if (str.equals("MN")) {
                    b2 = 140;
                }
                break;
            case 2466:
                if (str.equals("MO")) {
                    b2 = 141;
                }
                break;
            case 2467:
                if (str.equals("MP")) {
                    b2 = 142;
                }
                break;
            case 2468:
                if (str.equals("MQ")) {
                    b2 = 143;
                }
                break;
            case 2469:
                if (str.equals("MR")) {
                    b2 = 144;
                }
                break;
            case 2470:
                if (str.equals("MS")) {
                    b2 = 145;
                }
                break;
            case 2471:
                if (str.equals("MT")) {
                    b2 = 146;
                }
                break;
            case 2472:
                if (str.equals("MU")) {
                    b2 = 147;
                }
                break;
            case 2473:
                if (str.equals("MV")) {
                    b2 = 148;
                }
                break;
            case 2474:
                if (str.equals("MW")) {
                    b2 = 149;
                }
                break;
            case 2475:
                if (str.equals("MX")) {
                    b2 = 150;
                }
                break;
            case 2476:
                if (str.equals("MY")) {
                    b2 = 151;
                }
                break;
            case 2477:
                if (str.equals("MZ")) {
                    b2 = 152;
                }
                break;
            case 2483:
                if (str.equals("NA")) {
                    b2 = 153;
                }
                break;
            case 2485:
                if (str.equals("NC")) {
                    b2 = 154;
                }
                break;
            case 2487:
                if (str.equals("NE")) {
                    b2 = 155;
                }
                break;
            case 2489:
                if (str.equals("NG")) {
                    b2 = 156;
                }
                break;
            case 2491:
                if (str.equals("NI")) {
                    b2 = 157;
                }
                break;
            case 2494:
                if (str.equals("NL")) {
                    b2 = 158;
                }
                break;
            case 2497:
                if (str.equals("NO")) {
                    b2 = 159;
                }
                break;
            case 2498:
                if (str.equals("NP")) {
                    b2 = 160;
                }
                break;
            case com.google.android.exoplayer2.x2.f67258n7h /* 2500 */:
                if (str.equals("NR")) {
                    b2 = 161;
                }
                break;
            case 2503:
                if (str.equals("NU")) {
                    b2 = 162;
                }
                break;
            case 2508:
                if (str.equals("NZ")) {
                    b2 = 163;
                }
                break;
            case 2526:
                if (str.equals("OM")) {
                    b2 = 164;
                }
                break;
            case 2545:
                if (str.equals("PA")) {
                    b2 = 165;
                }
                break;
            case 2549:
                if (str.equals("PE")) {
                    b2 = 166;
                }
                break;
            case 2550:
                if (str.equals("PF")) {
                    b2 = 167;
                }
                break;
            case 2551:
                if (str.equals("PG")) {
                    b2 = 168;
                }
                break;
            case 2552:
                if (str.equals("PH")) {
                    b2 = 169;
                }
                break;
            case 2555:
                if (str.equals("PK")) {
                    b2 = 170;
                }
                break;
            case 2556:
                if (str.equals("PL")) {
                    b2 = 171;
                }
                break;
            case 2557:
                if (str.equals("PM")) {
                    b2 = 172;
                }
                break;
            case 2562:
                if (str.equals("PR")) {
                    b2 = 173;
                }
                break;
            case 2563:
                if (str.equals("PS")) {
                    b2 = 174;
                }
                break;
            case 2564:
                if (str.equals("PT")) {
                    b2 = 175;
                }
                break;
            case 2567:
                if (str.equals("PW")) {
                    b2 = 176;
                }
                break;
            case 2569:
                if (str.equals("PY")) {
                    b2 = 177;
                }
                break;
            case 2576:
                if (str.equals("QA")) {
                    b2 = 178;
                }
                break;
            case 2611:
                if (str.equals("RE")) {
                    b2 = 179;
                }
                break;
            case 2621:
                if (str.equals("RO")) {
                    b2 = 180;
                }
                break;
            case 2625:
                if (str.equals("RS")) {
                    b2 = 181;
                }
                break;
            case 2627:
                if (str.equals(com.market.sdk.utils.kja0.f68999zy)) {
                    b2 = 182;
                }
                break;
            case 2629:
                if (str.equals("RW")) {
                    b2 = 183;
                }
                break;
            case 2638:
                if (str.equals("SA")) {
                    b2 = 184;
                }
                break;
            case 2639:
                if (str.equals("SB")) {
                    b2 = 185;
                }
                break;
            case 2640:
                if (str.equals("SC")) {
                    b2 = 186;
                }
                break;
            case 2641:
                if (str.equals("SD")) {
                    b2 = 187;
                }
                break;
            case 2642:
                if (str.equals("SE")) {
                    b2 = 188;
                }
                break;
            case 2644:
                if (str.equals("SG")) {
                    b2 = 189;
                }
                break;
            case 2645:
                if (str.equals("SH")) {
                    b2 = 190;
                }
                break;
            case 2646:
                if (str.equals("SI")) {
                    b2 = 191;
                }
                break;
            case 2647:
                if (str.equals("SJ")) {
                    b2 = 192;
                }
                break;
            case 2648:
                if (str.equals("SK")) {
                    b2 = 193;
                }
                break;
            case 2649:
                if (str.equals("SL")) {
                    b2 = 194;
                }
                break;
            case 2650:
                if (str.equals("SM")) {
                    b2 = 195;
                }
                break;
            case 2651:
                if (str.equals("SN")) {
                    b2 = 196;
                }
                break;
            case 2652:
                if (str.equals("SO")) {
                    b2 = 197;
                }
                break;
            case 2655:
                if (str.equals("SR")) {
                    b2 = 198;
                }
                break;
            case 2656:
                if (str.equals("SS")) {
                    b2 = 199;
                }
                break;
            case 2657:
                if (str.equals("ST")) {
                    b2 = 200;
                }
                break;
            case 2659:
                if (str.equals("SV")) {
                    b2 = 201;
                }
                break;
            case 2661:
                if (str.equals("SX")) {
                    b2 = 202;
                }
                break;
            case 2662:
                if (str.equals("SY")) {
                    b2 = 203;
                }
                break;
            case 2663:
                if (str.equals("SZ")) {
                    b2 = 204;
                }
                break;
            case 2671:
                if (str.equals("TC")) {
                    b2 = 205;
                }
                break;
            case 2672:
                if (str.equals("TD")) {
                    b2 = 206;
                }
                break;
            case 2675:
                if (str.equals("TG")) {
                    b2 = 207;
                }
                break;
            case 2676:
                if (str.equals("TH")) {
                    b2 = 208;
                }
                break;
            case 2678:
                if (str.equals("TJ")) {
                    b2 = 209;
                }
                break;
            case 2680:
                if (str.equals("TL")) {
                    b2 = 210;
                }
                break;
            case 2681:
                if (str.equals("TM")) {
                    b2 = 211;
                }
                break;
            case 2682:
                if (str.equals("TN")) {
                    b2 = 212;
                }
                break;
            case 2683:
                if (str.equals("TO")) {
                    b2 = 213;
                }
                break;
            case 2686:
                if (str.equals("TR")) {
                    b2 = 214;
                }
                break;
            case 2688:
                if (str.equals("TT")) {
                    b2 = 215;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    b2 = 216;
                }
                break;
            case 2691:
                if (str.equals("TW")) {
                    b2 = 217;
                }
                break;
            case 2694:
                if (str.equals("TZ")) {
                    b2 = 218;
                }
                break;
            case 2700:
                if (str.equals("UA")) {
                    b2 = 219;
                }
                break;
            case 2706:
                if (str.equals("UG")) {
                    b2 = 220;
                }
                break;
            case 2718:
                if (str.equals("US")) {
                    b2 = 221;
                }
                break;
            case 2724:
                if (str.equals("UY")) {
                    b2 = 222;
                }
                break;
            case 2725:
                if (str.equals("UZ")) {
                    b2 = 223;
                }
                break;
            case 2733:
                if (str.equals("VC")) {
                    b2 = 224;
                }
                break;
            case 2735:
                if (str.equals("VE")) {
                    b2 = 225;
                }
                break;
            case 2737:
                if (str.equals("VG")) {
                    b2 = 226;
                }
                break;
            case 2739:
                if (str.equals("VI")) {
                    b2 = 227;
                }
                break;
            case 2744:
                if (str.equals("VN")) {
                    b2 = 228;
                }
                break;
            case 2751:
                if (str.equals("VU")) {
                    b2 = 229;
                }
                break;
            case 2767:
                if (str.equals("WF")) {
                    b2 = 230;
                }
                break;
            case 2780:
                if (str.equals("WS")) {
                    b2 = 231;
                }
                break;
            case 2803:
                if (str.equals("XK")) {
                    b2 = 232;
                }
                break;
            case 2828:
                if (str.equals("YE")) {
                    b2 = 233;
                }
                break;
            case 2843:
                if (str.equals("YT")) {
                    b2 = 234;
                }
                break;
            case 2855:
                if (str.equals("ZA")) {
                    b2 = 235;
                }
                break;
            case 2867:
                if (str.equals("ZM")) {
                    b2 = 236;
                }
                break;
            case 2877:
                if (str.equals("ZW")) {
                    b2 = 237;
                }
                break;
        }
        switch (b2) {
            case 0:
            case 26:
            case 80:
            case 121:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 3, 2};
            case 2:
            case 93:
            case 155:
            case 187:
            case C7385p.f92249o1t /* 196 */:
            case toq.zy.f72000f7l8 /* 206 */:
            case 225:
            case 233:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 3:
                return new int[]{2, 3, 1, 2, 2, 2};
            case 4:
            case 25:
            case 51:
            case 57:
            case 74:
            case 145:
            case 224:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 5:
            case 16:
            case 117:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 4, 2, 2};
            case 7:
            case 44:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 8:
            case 63:
            case 100:
            case 162:
            case 190:
            case 199:
            case 216:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 4, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 2, 3, 2, 2};
            case 11:
            case 40:
            case 103:
            case com.google.android.exoplayer2.extractor.ts.gvn7.f64478wvg /* 188 */:
            case C7385p.f92248ni7 /* 193 */:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 1, 0, 1, 2, 2};
            case 13:
            case 87:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 14:
            case 79:
            case 122:
            case 142:
            case com.google.android.exoplayer2.extractor.ts.gvn7.f64459eqxt /* 172 */:
            case com.google.android.exoplayer2.extractor.ts.wvg.f64653fu4 /* 192 */:
            case C7385p.f42281z /* 195 */:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 154:
                return new int[]{3, 2, 4, 4, 2, 2};
            case 17:
            case 70:
            case 77:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
            case 151:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 0, 3, 3, 2, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 53:
            case 191:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 2, 4, 4, 2};
            case 23:
            case 59:
            case 203:
            case toq.zy.f72001ld6 /* 210 */:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 27:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 28:
                return new int[]{1, 3, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 30:
            case 198:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 31:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 32:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 33:
            case 89:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 34:
                return new int[]{0, 1, 1, 3, 2, 2};
            case 35:
                return new int[]{2, 4, 2, 2, 2, 2};
            case 36:
                return new int[]{0, 2, 1, 2, 4, 1};
            case 37:
                return new int[]{4, 2, 3, 1, 2, 2};
            case 38:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 39:
            case 150:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 41:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 43:
            case 171:
            case 221:
                return new int[]{1, 1, 2, 2, 3, 2};
            case 45:
                return new int[]{2, 0, 2, 2, 3, 1};
            case 46:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 47:
                return new int[]{2, 2, 4, 4, 2, 2};
            case 48:
            case 168:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 49:
                return new int[]{2, 3, 1, 0, 2, 2};
            case 50:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 52:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 54:
                return new int[]{0, 0, 2, 2, 1, 2};
            case 55:
                return new int[]{4, 1, 4, 4, 2, 2};
            case 56:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 58:
            case 106:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 60:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 61:
            case 126:
            case 128:
            case ThemeStatus.Try.END /* 146 */:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 62:
                return new int[]{3, 4, 2, 3, 2, 2};
            case 64:
            case 96:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 65:
                return new int[]{4, 4, 3, 1, 2, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 1, 3, 3, 2, 2};
            case 68:
            case 114:
            case 130:
            case 152:
            case 200:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{3, 2, 4, 2, 2, 2};
            case 71:
                return new int[]{1, 1, 2, 1, 1, 1};
            case 72:
                return new int[]{2, 3, 1, 1, 2, 2};
            case 73:
                return new int[]{0, 0, 1, 1, 2, 3};
            case 75:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 76:
            case 83:
            case UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM /* 143 */:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 78:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 81:
            case 230:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 82:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 84:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 85:
            case 92:
            case 132:
            case UIElement.HOMEPAGE_SILDE_AD_CARD /* 137 */:
            case 181:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 86:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 88:
            case 218:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 91:
            case 170:
            case 197:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 94:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 95:
                return new int[]{3, 2, 3, 3, 3, 2};
            case 97:
                return new int[]{1, 1, 2, 3, 4, 2};
            case 98:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 99:
                return new int[]{1, 1, 3, 2, 4, 3};
            case 101:
            case 220:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 102:
                return new int[]{3, 0, 1, 1, 3, 0};
            case 104:
                return new int[]{0, 1, 0, 1, 1, 2};
            case 105:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 107:
            case UIElement.PURE_AD_DSP_BANNER /* 133 */:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 108:
                return new int[]{0, 1, 0, 1, 1, 1};
            case 109:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 110:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 111:
                return new int[]{1, 1, 4, 2, 2, 2};
            case 112:
            case 113:
            case 129:
            case 185:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 115:
                return new int[]{0, 0, 1, 3, 4, 4};
            case 116:
                return new int[]{1, 1, 0, 0, 0, 2};
            case 118:
                return new int[]{1, 1, 2, 2, 2, 2};
            case 119:
            case 222:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 120:
                return new int[]{3, 2, 1, 4, 2, 2};
            case 123:
                return new int[]{3, 1, 3, 4, 4, 2};
            case 124:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 125:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 127:
                return new int[]{1, 0, 2, 2, 2, 2};
            case 131:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 134:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 135:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 136:
                return new int[]{3, 2, 2, 4, 2, 2};
            case 138:
                return new int[]{4, 3, 3, 1, 2, 2};
            case UICard.LARGE_ICONS_APP_SEARCH_CARD /* 139 */:
                return new int[]{2, 4, 3, 3, 2, 2};
            case 140:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 144:
                return new int[]{4, 1, 3, 4, 2, 2};
            case 147:
                return new int[]{3, 1, 1, 2, 2, 2};
            case UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD /* 148 */:
                return new int[]{3, 4, 1, 4, 2, 2};
            case UICard.HOME_PAGE_HYBRID_MARQUEE_CARD /* 149 */:
                return new int[]{4, 2, 1, 0, 2, 2};
            case 153:
                return new int[]{4, 3, 2, 2, 2, 2};
            case 156:
                return new int[]{3, 4, 1, 1, 2, 2};
            case 157:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 158:
                return new int[]{0, 0, 3, 2, 0, 4};
            case 159:
                return new int[]{0, 0, 2, 0, 0, 2};
            case ThemeStatus.Redeem.REDEEMING /* 160 */:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 161:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 163:
                return new int[]{1, 0, 1, 2, 4, 2};
            case 164:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 165:
                return new int[]{1, 3, 3, 3, 2, 2};
            case 166:
                return new int[]{2, 3, 4, 4, 4, 2};
            case 167:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 2, 3, 3, 3, 2};
            case 173:
                return new int[]{2, 3, 2, 2, 3, 3};
            case 174:
                return new int[]{3, 4, 1, 2, 2, 2};
            case 175:
                return new int[]{0, 1, 0, 0, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 177:
                return new int[]{2, 2, 3, 2, 2, 2};
            case 178:
                return new int[]{2, 4, 2, 4, 4, 2};
            case 179:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 182:
                return new int[]{0, 0, 0, 1, 2, 2};
            case 183:
                return new int[]{3, 4, 3, 0, 2, 2};
            case 184:
            case toq.zy.f72002qrj /* 212 */:
            case 226:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 186:
                return new int[]{4, 3, 0, 2, 2, 2};
            case com.google.android.exoplayer2.extractor.ts.wvg.f64656ni7 /* 189 */:
                return new int[]{1, 1, 2, 3, 1, 4};
            case C7385p.f92239fu4 /* 194 */:
                return new int[]{4, 3, 4, 1, 2, 2};
            case 201:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 202:
            case 205:
                return new int[]{2, 2, 1, 0, 2, 2};
            case 204:
                return new int[]{4, 3, 2, 4, 2, 2};
            case toq.zy.f29240y /* 207 */:
                return new int[]{3, 3, 2, 0, 2, 2};
            case toq.zy.f29239s /* 208 */:
                return new int[]{0, 3, 2, 3, 3, 0};
            case toq.zy.f29237p /* 209 */:
                return new int[]{4, 2, 4, 4, 2, 2};
            case toq.zy.f72004x2 /* 211 */:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 213:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 214:
                return new int[]{1, 1, 0, 1, 2, 2};
            case 215:
                return new int[]{1, 4, 1, 1, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 219:
                return new int[]{0, 3, 1, 1, 2, 2};
            case 223:
                return new int[]{2, 2, 3, 4, 2, 2};
            case 227:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 228:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 229:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 231:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 232:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 234:
                return new int[]{4, 1, 1, 1, 2, 2};
            case 235:
                return new int[]{3, 3, 1, 1, 1, 2};
            case 236:
                return new int[]{3, 3, 4, 2, 2, 2};
            case 237:
                return new int[]{3, 2, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
    public void f7l8(Handler handler, InterfaceC3808n.k kVar) {
        C3844k.f7l8(handler);
        C3844k.f7l8(kVar);
        this.f66965toq.toq(handler, kVar);
    }

    @Override // com.google.android.exoplayer2.upstream.uv6
    /* JADX INFO: renamed from: g */
    public synchronized void mo13525g(kja0 kja0Var, t8r t8rVar, boolean z2, int i2) {
        if (kja0(t8rVar, z2)) {
            this.f23149y += (long) i2;
        }
    }

    public synchronized void ki(int i2) {
        this.f66961kja0 = i2;
        this.f66963n7h = true;
        cdj(i2);
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
    /* JADX INFO: renamed from: n */
    public synchronized long mo12412n() {
        return this.f66966x2;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
    /* JADX INFO: renamed from: q */
    public void mo12413q(InterfaceC3808n.k kVar) {
        this.f66965toq.m13490n(kVar);
    }

    @Override // com.google.android.exoplayer2.upstream.uv6
    /* JADX INFO: renamed from: s */
    public void mo13526s(kja0 kja0Var, t8r t8rVar, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.upstream.uv6
    public synchronized void toq(kja0 kja0Var, t8r t8rVar, boolean z2) {
        if (kja0(t8rVar, z2)) {
            C3844k.m13633s(this.f23143g > 0);
            long jMo13575q = this.f23147q.mo13575q();
            int i2 = (int) (jMo13575q - this.f66960f7l8);
            this.f23146p += (long) i2;
            long j2 = this.f66962ld6;
            long j3 = this.f23149y;
            this.f66962ld6 = j2 + j3;
            if (i2 > 0) {
                this.f66967zy.zy((int) Math.sqrt(j3), (j3 * 8000.0f) / i2);
                if (this.f23146p >= com.google.android.exoplayer2.t8r.f65475toq || this.f66962ld6 >= 524288) {
                    this.f66966x2 = (long) this.f66967zy.m13469g(0.5f);
                }
                m13536h(i2, this.f23149y, this.f66966x2);
                this.f66960f7l8 = jMo13575q;
                this.f23149y = 0L;
            }
            this.f23143g--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.uv6
    /* JADX INFO: renamed from: y */
    public synchronized void mo13527y(kja0 kja0Var, t8r t8rVar, boolean z2) {
        if (kja0(t8rVar, z2)) {
            if (this.f23143g == 0) {
                this.f66960f7l8 = this.f23147q.mo13575q();
            }
            this.f23143g++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC3808n
    public uv6 zy() {
        return this;
    }

    @Deprecated
    public zurt() {
        this(null, zkd.of(), 2000, InterfaceC3850n.f23248k, false);
    }

    private zurt(@zy.dd Context context, Map<Integer, Long> map, int i2, InterfaceC3850n interfaceC3850n, boolean z2) {
        this.f23144k = zkd.copyOf((Map) map);
        this.f66965toq = new InterfaceC3808n.k.C7968k();
        this.f66967zy = new hyr(i2);
        this.f23147q = interfaceC3850n;
        this.f23145n = z2;
        if (context != null) {
            com.google.android.exoplayer2.util.jk jkVarM13614q = com.google.android.exoplayer2.util.jk.m13614q(context);
            int iM13616g = jkVarM13614q.m13616g();
            this.f23148s = iM13616g;
            this.f66966x2 = qrj(iM13616g);
            jkVarM13614q.m13617s(new jk.zy() { // from class: com.google.android.exoplayer2.upstream.fn3e
                @Override // com.google.android.exoplayer2.util.jk.zy
                /* JADX INFO: renamed from: k */
                public final void mo13462k(int i3) {
                    this.f23009k.cdj(i3);
                }
            });
            return;
        }
        this.f23148s = 0;
        this.f66966x2 = qrj(0);
    }
}
