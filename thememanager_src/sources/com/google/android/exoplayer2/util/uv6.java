package com.google.android.exoplayer2.util;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: XmlPullParserUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class uv6 {
    private uv6() {
    }

    public static boolean f7l8(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m13740n(xmlPullParser) && m13742y(xmlPullParser.getName()).equals(str);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m13738g(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return m13740n(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    public static String m13739k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m13740n(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m13741q(XmlPullParser xmlPullParser, String str) throws XmlPullParserException {
        return zy(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    @zy.dd
    public static String toq(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (m13742y(xmlPullParser.getAttributeName(i2)).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    private static String m13742y(String str) {
        int iIndexOf = str.indexOf(58);
        return iIndexOf == -1 ? str : str.substring(iIndexOf + 1);
    }

    public static boolean zy(XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 3;
    }
}
