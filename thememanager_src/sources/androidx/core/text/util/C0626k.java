package androidx.core.text.util;

import java.util.Locale;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zy.uv6;
import zy.yz;

/* JADX INFO: renamed from: androidx.core.text.util.k */
/* JADX INFO: compiled from: FindAddress.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class C0626k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f50606f7l8 = "\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: h */
    private static final String f3839h = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";

    /* JADX INFO: renamed from: k */
    private static final int f3841k = 4;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f50609kja0 = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f50610ld6 = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: n */
    private static final int f3842n = 5;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f50611n7h = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";

    /* JADX INFO: renamed from: p */
    private static final String f3843p = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: q */
    private static final int f3844q = 25;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f50612qrj = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: s */
    private static final String f3845s = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50614toq = 14;

    /* JADX INFO: renamed from: y */
    private static final String f3846y = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f50616zy = 5;

    /* JADX INFO: renamed from: g */
    private static final k[] f3838g = {new k(99, 99, -1, -1), new k(35, 36, -1, -1), new k(71, 72, -1, -1), new k(96, 96, -1, -1), new k(85, 86, -1, -1), new k(90, 96, -1, -1), new k(80, 81, -1, -1), new k(6, 6, -1, -1), new k(20, 20, -1, -1), new k(19, 19, -1, -1), new k(32, 34, -1, -1), new k(96, 96, -1, -1), new k(30, 31, -1, -1), new k(96, 96, -1, -1), new k(96, 96, -1, -1), new k(50, 52, -1, -1), new k(83, 83, -1, -1), new k(60, 62, -1, -1), new k(46, 47, -1, -1), new k(66, 67, 73, -1), new k(40, 42, -1, -1), new k(70, 71, -1, -1), new k(1, 2, -1, -1), new k(20, 21, -1, -1), new k(3, 4, -1, -1), new k(96, 96, -1, -1), new k(48, 49, -1, -1), new k(55, 56, -1, -1), new k(63, 65, -1, -1), new k(96, 96, -1, -1), new k(38, 39, -1, -1), new k(55, 56, -1, -1), new k(27, 28, -1, -1), new k(58, 58, -1, -1), new k(68, 69, -1, -1), new k(3, 4, -1, -1), new k(7, 8, -1, -1), new k(87, 88, 86, -1), new k(88, 89, 96, -1), new k(10, 14, 0, 6), new k(43, 45, -1, -1), new k(73, 74, -1, -1), new k(97, 97, -1, -1), new k(15, 19, -1, -1), new k(6, 6, 0, 9), new k(96, 96, -1, -1), new k(2, 2, -1, -1), new k(29, 29, -1, -1), new k(57, 57, -1, -1), new k(37, 38, -1, -1), new k(75, 79, 87, 88), new k(84, 84, -1, -1), new k(22, 24, 20, -1), new k(6, 9, -1, -1), new k(5, 5, -1, -1), new k(98, 99, -1, -1), new k(53, 54, -1, -1), new k(24, 26, -1, -1), new k(82, 83, -1, -1)};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Pattern f50615x2 = Pattern.compile("[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final Pattern f50605cdj = Pattern.compile("(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final Pattern f50608ki = Pattern.compile("(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final Pattern f50613t8r = Pattern.compile("(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: i */
    private static final Pattern f3840i = Pattern.compile("([0-9]+)(st|nd|rd|th)", 2);

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final Pattern f50607fn3e = Pattern.compile("(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)", 2);

    /* JADX INFO: renamed from: androidx.core.text.util.k$k */
    /* JADX INFO: compiled from: FindAddress.java */
    private static class k {

        /* JADX INFO: renamed from: k */
        int f3847k;

        /* JADX INFO: renamed from: q */
        int f3848q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f50617toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f50618zy;

        k(int i2, int i3, int i4, int i5) {
            this.f3847k = i2;
            this.f50617toq = i3;
            this.f50618zy = i4;
            this.f3848q = i5;
        }

        /* JADX INFO: renamed from: k */
        boolean m2898k(String str) {
            int i2 = Integer.parseInt(str.substring(0, 2));
            return (this.f3847k <= i2 && i2 <= this.f50617toq) || i2 == this.f50618zy || i2 == this.f3848q;
        }
    }

    private C0626k() {
    }

    private static boolean f7l8(String str, MatchResult matchResult) {
        if (matchResult == null) {
            return false;
        }
        int iGroupCount = matchResult.groupCount();
        while (true) {
            if (iGroupCount <= 0) {
                break;
            }
            int i2 = iGroupCount - 1;
            if (matchResult.group(iGroupCount) != null) {
                iGroupCount = i2;
                break;
            }
            iGroupCount = i2;
        }
        return f50607fn3e.matcher(str).matches() && f3838g[iGroupCount].m2898k(str);
    }

    @yz
    /* JADX INFO: renamed from: g */
    public static boolean m2892g(String str, String str2) {
        return f7l8(str, m2896s(str2, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d5, code lost:
    
        if (r10 <= 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d7, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d8, code lost:
    
        if (r9 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00db, code lost:
    
        r9 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00dd, code lost:
    
        return -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return -r13;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int m2893k(java.lang.String r13, java.util.regex.MatchResult r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.text.util.C0626k.m2893k(java.lang.String, java.util.regex.MatchResult):int");
    }

    @yz
    /* JADX INFO: renamed from: n */
    public static boolean m2894n(String str) {
        return f50607fn3e.matcher(str).matches();
    }

    @yz
    /* JADX INFO: renamed from: q */
    public static boolean m2895q(String str) {
        return f50613t8r.matcher(str).matches();
    }

    @yz
    /* JADX INFO: renamed from: s */
    public static MatchResult m2896s(String str, int i2) {
        if (i2 > 0 && f3843p.indexOf(str.charAt(i2 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f50608ki.matcher(str).region(i2, str.length());
        if (matcherRegion.lookingAt()) {
            return matcherRegion.toMatchResult();
        }
        return null;
    }

    private static boolean toq(String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (Character.isDigit(str.charAt(i3))) {
                i2++;
            }
        }
        if (i2 > 5) {
            return false;
        }
        Matcher matcher = f3840i.matcher(str);
        if (!matcher.find()) {
            return true;
        }
        int i4 = Integer.parseInt(matcher.group(1));
        if (i4 == 0) {
            return false;
        }
        String lowerCase = matcher.group(2).toLowerCase(Locale.getDefault());
        int i5 = i4 % 10;
        if (i5 == 1) {
            return lowerCase.equals(i4 % 100 != 11 ? "st" : "th");
        }
        if (i5 == 2) {
            return lowerCase.equals(i4 % 100 != 12 ? "nd" : "th");
        }
        if (i5 != 3) {
            return lowerCase.equals("th");
        }
        return lowerCase.equals(i4 % 100 != 13 ? "rd" : "th");
    }

    @yz
    /* JADX INFO: renamed from: y */
    public static MatchResult m2897y(String str, int i2) {
        if (i2 > 0 && f50609kja0.indexOf(str.charAt(i2 - 1)) == -1) {
            return null;
        }
        Matcher matcherRegion = f50605cdj.matcher(str).region(i2, str.length());
        if (matcherRegion.lookingAt()) {
            MatchResult matchResult = matcherRegion.toMatchResult();
            if (toq(matchResult.group(0))) {
                return matchResult;
            }
        }
        return null;
    }

    static String zy(String str) {
        Matcher matcher = f50605cdj.matcher(str);
        int iEnd = 0;
        while (matcher.find(iEnd)) {
            if (toq(matcher.group(0))) {
                int iStart = matcher.start();
                int iM2893k = m2893k(str, matcher);
                if (iM2893k > 0) {
                    return str.substring(iStart, iM2893k);
                }
                iEnd = -iM2893k;
            } else {
                iEnd = matcher.end();
            }
        }
        return null;
    }
}
