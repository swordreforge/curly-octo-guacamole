package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.extractor.jpeg.toq;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.uv6;
import com.google.android.exoplayer2.util.wvg;
import com.google.common.collect.se;
import com.miui.maml.elements.ListScreenElement;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.jpeg.n */
/* JADX INFO: compiled from: XmpMotionPhotoDescriptionParser.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3352n {

    /* JADX INFO: renamed from: k */
    private static final String f19837k = "MotionPhotoXmpParser";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String[] f63781toq = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String[] f63782zy = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: q */
    private static final String[] f19838q = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    private C3352n() {
    }

    /* JADX INFO: renamed from: g */
    private static se<toq.C3354k> m11748g(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        se.C4520k c4520kBuilder = se.builder();
        String strConcat = String.valueOf(str).concat(":Item");
        String strConcat2 = String.valueOf(str).concat(":Directory");
        do {
            xmlPullParser.next();
            if (uv6.m13738g(xmlPullParser, strConcat)) {
                String strConcat3 = String.valueOf(str2).concat(":Mime");
                String strConcat4 = String.valueOf(str2).concat(":Semantic");
                String strConcat5 = String.valueOf(str2).concat(":Length");
                String strConcat6 = String.valueOf(str2).concat(":Padding");
                String strM13739k = uv6.m13739k(xmlPullParser, strConcat3);
                String strM13739k2 = uv6.m13739k(xmlPullParser, strConcat4);
                String strM13739k3 = uv6.m13739k(xmlPullParser, strConcat5);
                String strM13739k4 = uv6.m13739k(xmlPullParser, strConcat6);
                if (strM13739k == null || strM13739k2 == null) {
                    return se.of();
                }
                c4520kBuilder.mo15569k(new toq.C3354k(strM13739k, strM13739k2, strM13739k3 != null ? Long.parseLong(strM13739k3) : 0L, strM13739k4 != null ? Long.parseLong(strM13739k4) : 0L));
            }
        } while (!uv6.m13741q(xmlPullParser, strConcat2));
        return c4520kBuilder.mo15570n();
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static toq m11749k(String str) throws IOException {
        try {
            return toq(str);
        } catch (sok | NumberFormatException | XmlPullParserException unused) {
            ni7.qrj(f19837k, "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: n */
    private static long m11750n(XmlPullParser xmlPullParser) {
        for (String str : f63782zy) {
            String strM13739k = uv6.m13739k(xmlPullParser, str);
            if (strM13739k != null) {
                long j2 = Long.parseLong(strM13739k);
                return j2 == -1 ? C3548p.f65257toq : j2;
            }
        }
        return C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: q */
    private static boolean m11751q(XmlPullParser xmlPullParser) {
        for (String str : f63781toq) {
            String strM13739k = uv6.m13739k(xmlPullParser, str);
            if (strM13739k != null) {
                return Integer.parseInt(strM13739k) == 1;
            }
        }
        return false;
    }

    @dd
    private static toq toq(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!uv6.m13738g(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw sok.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        long jM11750n = C3548p.f65257toq;
        se<toq.C3354k> seVarOf = se.of();
        do {
            xmlPullParserNewPullParser.next();
            if (uv6.m13738g(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!m11751q(xmlPullParserNewPullParser)) {
                    return null;
                }
                jM11750n = m11750n(xmlPullParserNewPullParser);
                seVarOf = zy(xmlPullParserNewPullParser);
            } else if (uv6.m13738g(xmlPullParserNewPullParser, "Container:Directory")) {
                seVarOf = m11748g(xmlPullParserNewPullParser, "Container", ListScreenElement.ListItemElement.TAG_NAME);
            } else if (uv6.m13738g(xmlPullParserNewPullParser, "GContainer:Directory")) {
                seVarOf = m11748g(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!uv6.m13741q(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (seVarOf.isEmpty()) {
            return null;
        }
        return new toq(jM11750n, seVarOf);
    }

    private static se<toq.C3354k> zy(XmlPullParser xmlPullParser) {
        for (String str : f19838q) {
            String strM13739k = uv6.m13739k(xmlPullParser, str);
            if (strM13739k != null) {
                return se.of(new toq.C3354k(wvg.f67136tfm, "Primary", 0L, 0L), new toq.C3354k(wvg.f23301g, "MotionPhoto", Long.parseLong(strM13739k), 0L));
            }
        }
        return se.of();
    }
}
