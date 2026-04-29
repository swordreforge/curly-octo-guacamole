package com.google.android.exoplayer2.text.ttml;

import android.text.Layout;
import com.android.thememanager.controller.local.qrj;
import com.google.android.exoplayer2.text.AbstractC3653g;
import com.google.android.exoplayer2.text.C3660s;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.uv6;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import zy.dd;

/* JADX INFO: compiled from: TtmlDecoder.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy extends AbstractC3653g {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f65860a9 = 30;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f65861cdj = "http://www.w3.org/ns/ttml#parameter";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f65862fn3e = "style";

    /* JADX INFO: renamed from: h */
    private static final String f22072h = "TtmlDecoder";

    /* JADX INFO: renamed from: i */
    private static final String f22073i = "end";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f65867ki = "begin";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f65869ni7 = "backgroundImage";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f65871t8r = "dur";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f65873zurt = "region";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final XmlPullParserFactory f65874kja0;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final Pattern f65864fu4 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* JADX INFO: renamed from: z */
    private static final Pattern f22075z = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final Pattern f65870o1t = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    static final Pattern f65872wvg = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: t */
    static final Pattern f22074t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final Pattern f65868mcp = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final Pattern f65865jk = Pattern.compile("^(\\d+) (\\d+)$");

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final toq f65863fti = new toq(30.0f, 1, 1);

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final C3682k f65866jp0y = new C3682k(32, 15);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.zy$k */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    private static final class C3682k {

        /* JADX INFO: renamed from: k */
        final int f22076k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f65875toq;

        C3682k(int i2, int i3) {
            this.f22076k = i2;
            this.f65875toq = i3;
        }
    }

    /* JADX INFO: compiled from: TtmlDecoder.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        final float f22077k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f65876toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f65877zy;

        toq(float f2, int i2, int i3) {
            this.f22077k = f2;
            this.f65876toq = i2;
            this.f65877zy = i3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TtmlDecoder.java */
    private static final class C7964zy {

        /* JADX INFO: renamed from: k */
        final int f22078k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f65878toq;

        C7964zy(int i2, int i3) {
            this.f22078k = i2;
            this.f65878toq = i3;
        }
    }

    public zy() {
        super(f22072h);
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f65874kja0 = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    private static C3682k a9(XmlPullParser xmlPullParser, C3682k c3682k) throws C3660s {
        String attributeValue = xmlPullParser.getAttributeValue(f65861cdj, "cellResolution");
        if (attributeValue == null) {
            return c3682k;
        }
        Matcher matcher = f65865jk.matcher(attributeValue);
        if (!matcher.matches()) {
            ni7.qrj(f22072h, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return c3682k;
        }
        try {
            int i2 = Integer.parseInt((String) C3844k.f7l8(matcher.group(1)));
            int i3 = Integer.parseInt((String) C3844k.f7l8(matcher.group(2)));
            if (i2 != 0 && i3 != 0) {
                return new C3682k(i2, i3);
            }
            StringBuilder sb = new StringBuilder(47);
            sb.append("Invalid cell resolution ");
            sb.append(i2);
            sb.append(" ");
            sb.append(i3);
            throw new C3660s(sb.toString());
        } catch (NumberFormatException unused) {
            ni7.qrj(f22072h, attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return c3682k;
        }
    }

    private static float d2ok(String str) {
        Matcher matcher = f65872wvg.matcher(str);
        if (!matcher.matches()) {
            String strValueOf = String.valueOf(str);
            ni7.qrj(f22072h, strValueOf.length() != 0 ? "Invalid value for shear: ".concat(strValueOf) : new String("Invalid value for shear: "));
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C3844k.f7l8(matcher.group(1)))));
        } catch (NumberFormatException e2) {
            String strValueOf2 = String.valueOf(str);
            ni7.n7h(f22072h, strValueOf2.length() != 0 ? "Failed to parse shear: ".concat(strValueOf2) : new String("Failed to parse shear: "), e2);
            return Float.MAX_VALUE;
        }
    }

    private static void d3(XmlPullParser xmlPullParser, Map<String, String> map) throws XmlPullParserException, IOException {
        String strM13739k;
        do {
            xmlPullParser.next();
            if (uv6.m13738g(xmlPullParser, "image") && (strM13739k = uv6.m13739k(xmlPullParser, "id")) != null) {
                map.put(strM13739k, xmlPullParser.nextText());
            }
        } while (!uv6.m13741q(xmlPullParser, C3678q.f22052z));
    }

    private static long dd(String str, toq toqVar) throws C3660s {
        double d2;
        double d4;
        double d5;
        Matcher matcher = f65864fu4.matcher(str);
        if (matcher.matches()) {
            double d6 = (Long.parseLong((String) C3844k.f7l8(matcher.group(1))) * 3600) + (Long.parseLong((String) C3844k.f7l8(matcher.group(2))) * 60) + Long.parseLong((String) C3844k.f7l8(matcher.group(3)));
            String strGroup = matcher.group(4);
            return (long) ((d6 + (strGroup != null ? Double.parseDouble(strGroup) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / toqVar.f22077k : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / ((double) toqVar.f65876toq)) / ((double) toqVar.f22077k) : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f22075z.matcher(str);
        if (!matcher2.matches()) {
            String strValueOf = String.valueOf(str);
            throw new C3660s(strValueOf.length() != 0 ? "Malformed time expression: ".concat(strValueOf) : new String("Malformed time expression: "));
        }
        d2 = Double.parseDouble((String) C3844k.f7l8(matcher2.group(1)));
        String str2 = (String) C3844k.f7l8(matcher2.group(2));
        str2.hashCode();
        switch (str2) {
            case "f":
                d4 = toqVar.f22077k;
                d2 /= d4;
                return (long) (d2 * 1000000.0d);
            case "h":
                d5 = 3600.0d;
                break;
            case "m":
                d5 = 60.0d;
                break;
            case "t":
                d4 = toqVar.f65877zy;
                d2 /= d4;
                return (long) (d2 * 1000000.0d);
            case "ms":
                d4 = 1000.0d;
                d2 /= d4;
                return (long) (d2 * 1000000.0d);
            default:
                return (long) (d2 * 1000000.0d);
        }
        d2 *= d5;
        return (long) (d2 * 1000000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.text.ttml.C3677n eqxt(org.xmlpull.v1.XmlPullParser r17, com.google.android.exoplayer2.text.ttml.zy.C3682k r18, @zy.dd com.google.android.exoplayer2.text.ttml.zy.C7964zy r19) {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.zy.eqxt(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.zy$k, com.google.android.exoplayer2.text.ttml.zy$zy):com.google.android.exoplayer2.text.ttml.n");
    }

    private static void fti(String str, f7l8 f7l8Var) throws C3660s {
        Matcher matcher;
        String str2;
        String[] strArrMbx = lrht.mbx(str, "\\s+");
        if (strArrMbx.length == 1) {
            matcher = f65870o1t.matcher(str);
        } else {
            if (strArrMbx.length != 2) {
                int length = strArrMbx.length;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Invalid number of entries for fontSize: ");
                sb.append(length);
                sb.append(".");
                throw new C3660s(sb.toString());
            }
            matcher = f65870o1t.matcher(strArrMbx[1]);
            ni7.qrj(f22072h, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
            sb2.append("Invalid expression for fontSize: '");
            sb2.append(str);
            sb2.append("'.");
            throw new C3660s(sb2.toString());
        }
        str2 = (String) C3844k.f7l8(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                f7l8Var.wvg(3);
                break;
            case "em":
                f7l8Var.wvg(2);
                break;
            case "px":
                f7l8Var.wvg(1);
                break;
            default:
                StringBuilder sb3 = new StringBuilder(str2.length() + 30);
                sb3.append("Invalid unit for fontSize: '");
                sb3.append(str2);
                sb3.append("'.");
                throw new C3660s(sb3.toString());
        }
        f7l8Var.o1t(Float.parseFloat((String) C3844k.f7l8(matcher.group(1))));
    }

    private static Map<String, f7l8> gvn7(XmlPullParser xmlPullParser, Map<String, f7l8> map, C3682k c3682k, @dd C7964zy c7964zy, Map<String, C3677n> map2, Map<String, String> map3) throws XmlPullParserException, IOException {
        do {
            xmlPullParser.next();
            if (uv6.m13738g(xmlPullParser, "style")) {
                String strM13739k = uv6.m13739k(xmlPullParser, "style");
                f7l8 f7l8VarLvui = lvui(xmlPullParser, new f7l8());
                if (strM13739k != null) {
                    for (String str : m12972r(strM13739k)) {
                        f7l8VarLvui.m12949k(map.get(str));
                    }
                }
                String strF7l8 = f7l8VarLvui.f7l8();
                if (strF7l8 != null) {
                    map.put(strF7l8, f7l8VarLvui);
                }
            } else if (uv6.m13738g(xmlPullParser, "region")) {
                C3677n c3677nEqxt = eqxt(xmlPullParser, c3682k, c7964zy);
                if (c3677nEqxt != null) {
                    map2.put(c3677nEqxt.f22030k, c3677nEqxt);
                }
            } else if (uv6.m13738g(xmlPullParser, C3678q.f22052z)) {
                d3(xmlPullParser, map3);
            }
        } while (!uv6.m13741q(xmlPullParser, C3678q.f65826kja0));
        return map;
    }

    @dd
    private static Layout.Alignment jk(String str) {
        String strF7l8 = com.google.common.base.zy.f7l8(str);
        strF7l8.hashCode();
        switch (strF7l8) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static toq jp0y(XmlPullParser xmlPullParser) throws C3660s {
        String attributeValue = xmlPullParser.getAttributeValue(f65861cdj, qrj.f57924fn3e);
        int i2 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(f65861cdj, "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (lrht.mbx(attributeValue2, " ").length != 2) {
                throw new C3660s("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        toq toqVar = f65863fti;
        int i3 = toqVar.f65876toq;
        String attributeValue3 = xmlPullParser.getAttributeValue(f65861cdj, "subFrameRate");
        if (attributeValue3 != null) {
            i3 = Integer.parseInt(attributeValue3);
        }
        int i4 = toqVar.f65877zy;
        String attributeValue4 = xmlPullParser.getAttributeValue(f65861cdj, "tickRate");
        if (attributeValue4 != null) {
            i4 = Integer.parseInt(attributeValue4);
        }
        return new toq(i2 * f2, i3, i4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static f7l8 lvui(XmlPullParser xmlPullParser, f7l8 f7l8Var) {
        byte b2;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            String attributeName = xmlPullParser.getAttributeName(i2);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1550943582:
                    b2 = attributeName.equals(C3678q.f65809d3) ? (byte) 0 : (byte) -1;
                    break;
                case -1224696685:
                    b2 = attributeName.equals(C3678q.f65813eqxt) ? (byte) 1 : (byte) -1;
                    break;
                case -1065511464:
                    b2 = attributeName.equals(C3678q.f65833ncyb) ? (byte) 2 : (byte) -1;
                    break;
                case -879295043:
                    b2 = attributeName.equals(C3678q.f65844x9kr) ? (byte) 3 : (byte) -1;
                    break;
                case -734428249:
                    b2 = attributeName.equals(C3678q.f65808d2ok) ? (byte) 4 : (byte) -1;
                    break;
                case 3355:
                    b2 = attributeName.equals("id") ? (byte) 5 : (byte) -1;
                    break;
                case 3511770:
                    b2 = attributeName.equals(C3678q.f22047r) ? (byte) 6 : (byte) -1;
                    break;
                case 94842723:
                    b2 = attributeName.equals("color") ? (byte) 7 : (byte) -1;
                    break;
                case 109403361:
                    b2 = attributeName.equals(C3678q.f22040f) ? (byte) 8 : (byte) -1;
                    break;
                case 110138194:
                    b2 = attributeName.equals(C3678q.f22044l) ? (byte) 9 : (byte) -1;
                    break;
                case 365601008:
                    b2 = attributeName.equals(C3678q.f65838oc) ? (byte) 10 : (byte) -1;
                    break;
                case 921125321:
                    b2 = attributeName.equals(C3678q.f65831n5r1) ? com.google.common.base.zy.f68132qrj : (byte) -1;
                    break;
                case 1115953443:
                    b2 = attributeName.equals(C3678q.f65810dd) ? com.google.common.base.zy.f68128n7h : (byte) -1;
                    break;
                case 1287124693:
                    b2 = attributeName.equals(C3678q.f65817gvn7) ? com.google.common.base.zy.f68124kja0 : (byte) -1;
                    break;
                case 1754920356:
                    b2 = attributeName.equals(C3678q.f22038c) ? com.google.common.base.zy.f25751h : (byte) -1;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                    f7l8Var = m12973t(f7l8Var).mcp(C3678q.f65803bf2.equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    f7l8Var = m12973t(f7l8Var).m12956z(attributeValue);
                    break;
                case 2:
                    f7l8Var = m12973t(f7l8Var).d3(jk(attributeValue));
                    break;
                case 3:
                    String strF7l8 = com.google.common.base.zy.f7l8(attributeValue);
                    strF7l8.hashCode();
                    switch (strF7l8) {
                        case "nounderline":
                            f7l8Var = m12973t(f7l8Var).d2ok(false);
                            break;
                        case "underline":
                            f7l8Var = m12973t(f7l8Var).d2ok(true);
                            break;
                        case "nolinethrough":
                            f7l8Var = m12973t(f7l8Var).jk(false);
                            break;
                        case "linethrough":
                            f7l8Var = m12973t(f7l8Var).jk(true);
                            break;
                    }
                    break;
                case 4:
                    f7l8Var = m12973t(f7l8Var).ni7(C3678q.f65821i1.equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        f7l8Var = m12973t(f7l8Var).m12954t(attributeValue);
                    }
                    break;
                case 6:
                    String strF7l82 = com.google.common.base.zy.f7l8(attributeValue);
                    strF7l82.hashCode();
                    switch (strF7l82) {
                        case "baseContainer":
                        case "base":
                            f7l8Var = m12973t(f7l8Var).jp0y(2);
                            break;
                        case "container":
                            f7l8Var = m12973t(f7l8Var).jp0y(1);
                            break;
                        case "delimiter":
                            f7l8Var = m12973t(f7l8Var).jp0y(4);
                            break;
                        case "textContainer":
                        case "text":
                            f7l8Var = m12973t(f7l8Var).jp0y(3);
                            break;
                    }
                    break;
                case 7:
                    f7l8Var = m12973t(f7l8Var);
                    try {
                        f7l8Var.fu4(com.google.android.exoplayer2.util.f7l8.zy(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        String strValueOf = String.valueOf(attributeValue);
                        ni7.qrj(f22072h, strValueOf.length() != 0 ? "Failed parsing color value: ".concat(strValueOf) : new String("Failed parsing color value: "));
                    }
                    break;
                case 8:
                    f7l8Var = m12973t(f7l8Var).gvn7(d2ok(attributeValue));
                    break;
                case 9:
                    String strF7l83 = com.google.common.base.zy.f7l8(attributeValue);
                    strF7l83.hashCode();
                    if (strF7l83.equals(C3678q.f65828lv5)) {
                        f7l8Var = m12973t(f7l8Var).oc(true);
                    } else if (strF7l83.equals("none")) {
                        f7l8Var = m12973t(f7l8Var).oc(false);
                    }
                    break;
                case 10:
                    try {
                        f7l8Var = m12973t(f7l8Var);
                        fti(attributeValue, f7l8Var);
                    } catch (C3660s unused2) {
                        String strValueOf2 = String.valueOf(attributeValue);
                        ni7.qrj(f22072h, strValueOf2.length() != 0 ? "Failed parsing fontSize value: ".concat(strValueOf2) : new String("Failed parsing fontSize value: "));
                    }
                    break;
                case 11:
                    f7l8Var = m12973t(f7l8Var).eqxt(com.google.android.exoplayer2.text.ttml.toq.m12969k(attributeValue));
                    break;
                case 12:
                    String strF7l84 = com.google.common.base.zy.f7l8(attributeValue);
                    strF7l84.hashCode();
                    if (strF7l84.equals(C3678q.f22043j)) {
                        f7l8Var = m12973t(f7l8Var).fti(1);
                    } else if (strF7l84.equals(C3678q.f22046o)) {
                        f7l8Var = m12973t(f7l8Var).fti(2);
                    }
                    break;
                case 13:
                    f7l8Var = m12973t(f7l8Var);
                    try {
                        f7l8Var.zurt(com.google.android.exoplayer2.util.f7l8.zy(attributeValue));
                    } catch (IllegalArgumentException unused3) {
                        String strValueOf3 = String.valueOf(attributeValue);
                        ni7.qrj(f22072h, strValueOf3.length() != 0 ? "Failed parsing background value: ".concat(strValueOf3) : new String("Failed parsing background value: "));
                    }
                    break;
                case 14:
                    f7l8Var = m12973t(f7l8Var).a9(jk(attributeValue));
                    break;
            }
        }
        return f7l8Var;
    }

    private static boolean mcp(String str) {
        return str.equals(C3678q.f65832n7h) || str.equals(C3678q.f65826kja0) || str.equals(C3678q.f22041h) || str.equals(C3678q.f65806cdj) || str.equals("p") || str.equals(C3678q.f65840t8r) || str.equals(C3678q.f22042i) || str.equals("style") || str.equals(C3678q.f65850zurt) || str.equals(C3678q.f65834ni7) || str.equals("region") || str.equals(C3678q.f22052z) || str.equals("image") || str.equals("data") || str.equals("information");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.exoplayer2.text.ttml.C3678q oc(org.xmlpull.v1.XmlPullParser r19, @zy.dd com.google.android.exoplayer2.text.ttml.C3678q r20, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.C3677n> r21, com.google.android.exoplayer2.text.ttml.zy.toq r22) throws com.google.android.exoplayer2.text.C3660s {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.zy.oc(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.text.ttml.q, java.util.Map, com.google.android.exoplayer2.text.ttml.zy$toq):com.google.android.exoplayer2.text.ttml.q");
    }

    /* JADX INFO: renamed from: r */
    private static String[] m12972r(String str) {
        String strTrim = str.trim();
        return strTrim.isEmpty() ? new String[0] : lrht.mbx(strTrim, "\\s+");
    }

    /* JADX INFO: renamed from: t */
    private static f7l8 m12973t(@dd f7l8 f7l8Var) {
        return f7l8Var == null ? new f7l8() : f7l8Var;
    }

    @dd
    private static C7964zy x9kr(XmlPullParser xmlPullParser) {
        String strM13739k = uv6.m13739k(xmlPullParser, C3678q.f65815fti);
        if (strM13739k == null) {
            return null;
        }
        Matcher matcher = f65868mcp.matcher(strM13739k);
        if (!matcher.matches()) {
            ni7.qrj(f22072h, strM13739k.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(strM13739k) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            return new C7964zy(Integer.parseInt((String) C3844k.f7l8(matcher.group(1))), Integer.parseInt((String) C3844k.f7l8(matcher.group(2))));
        } catch (NumberFormatException unused) {
            ni7.qrj(f22072h, strM13739k.length() != 0 ? "Ignoring malformed tts extent: ".concat(strM13739k) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // com.google.android.exoplayer2.text.AbstractC3653g
    protected com.google.android.exoplayer2.text.f7l8 o1t(byte[] bArr, int i2, boolean z2) throws C3660s {
        toq toqVar;
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f65874kja0.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C3677n(""));
            C7964zy c7964zyX9kr = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            toq toqVarJp0y = f65863fti;
            C3682k c3682kA9 = f65866jp0y;
            int i3 = 0;
            C3681y c3681y = null;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C3678q c3678q = (C3678q) arrayDeque.peek();
                if (i3 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if (C3678q.f65832n7h.equals(name)) {
                            toqVarJp0y = jp0y(xmlPullParserNewPullParser);
                            c3682kA9 = a9(xmlPullParserNewPullParser, f65866jp0y);
                            c7964zyX9kr = x9kr(xmlPullParserNewPullParser);
                        }
                        C7964zy c7964zy = c7964zyX9kr;
                        toq toqVar2 = toqVarJp0y;
                        C3682k c3682k = c3682kA9;
                        if (mcp(name)) {
                            if (C3678q.f65826kja0.equals(name)) {
                                toqVar = toqVar2;
                                gvn7(xmlPullParserNewPullParser, map, c3682k, c7964zy, map2, map3);
                            } else {
                                toqVar = toqVar2;
                                try {
                                    C3678q c3678qOc = oc(xmlPullParserNewPullParser, c3678q, map2, toqVar);
                                    arrayDeque.push(c3678qOc);
                                    if (c3678q != null) {
                                        c3678q.m12966k(c3678qOc);
                                    }
                                } catch (C3660s e2) {
                                    ni7.n7h(f22072h, "Suppressing parser error", e2);
                                    i3++;
                                }
                            }
                            toqVarJp0y = toqVar;
                        } else {
                            String strValueOf = String.valueOf(xmlPullParserNewPullParser.getName());
                            ni7.m13704y(f22072h, strValueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(strValueOf) : new String("Ignoring unsupported tag: "));
                            i3++;
                            toqVarJp0y = toqVar2;
                        }
                        c7964zyX9kr = c7964zy;
                        c3682kA9 = c3682k;
                    } else if (eventType == 4) {
                        ((C3678q) C3844k.f7l8(c3678q)).m12966k(C3678q.m12963q(xmlPullParserNewPullParser.getText()));
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals(C3678q.f65832n7h)) {
                            c3681y = new C3681y((C3678q) C3844k.f7l8((C3678q) arrayDeque.peek()), map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i3++;
                } else if (eventType == 3) {
                    i3--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (c3681y != null) {
                return c3681y;
            }
            throw new C3660s("No TTML subtitles found");
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new C3660s("Unable to decode source", e4);
        }
    }
}
