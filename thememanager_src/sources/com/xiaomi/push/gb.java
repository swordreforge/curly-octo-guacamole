package com.xiaomi.push;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class gb {

    /* JADX INFO: renamed from: k */
    private static int f32954k = 5000;

    /* JADX INFO: renamed from: n */
    private static Vector<String> f32955n = new Vector<>();

    /* JADX INFO: renamed from: q */
    private static int f32956q = 330000;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static int f73341toq = 330000;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f73342zy = 600000;

    static {
        try {
            for (ClassLoader classLoader : m20894n()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack-config.xml");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        try {
                            inputStreamOpenStream = resources.nextElement().openStream();
                            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                            xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                            int eventType = xmlPullParserNewPullParser.getEventType();
                            do {
                                if (eventType == 2) {
                                    if (xmlPullParserNewPullParser.getName().equals("className")) {
                                        m20895q(xmlPullParserNewPullParser);
                                    } else if (xmlPullParserNewPullParser.getName().equals("packetReplyTimeout")) {
                                        f32954k = toq(xmlPullParserNewPullParser, f32954k);
                                    } else if (xmlPullParserNewPullParser.getName().equals("keepAliveInterval")) {
                                        f73341toq = toq(xmlPullParserNewPullParser, f73341toq);
                                    } else if (xmlPullParserNewPullParser.getName().equals("mechName")) {
                                        f32955n.add(xmlPullParserNewPullParser.nextText());
                                    }
                                }
                                eventType = xmlPullParserNewPullParser.next();
                            } while (eventType != 1);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused2) {
                        }
                        throw th;
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    private gb() {
    }

    /* JADX INFO: renamed from: g */
    public static int m20892g() {
        return f73342zy;
    }

    /* JADX INFO: renamed from: k */
    public static int m20893k() {
        return f73341toq;
    }

    /* JADX INFO: renamed from: n */
    private static ClassLoader[] m20894n() {
        ClassLoader[] classLoaderArr = {gb.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            ClassLoader classLoader = classLoaderArr[i2];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* JADX INFO: renamed from: q */
    private static void m20895q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = xmlPullParser.nextText();
        try {
            Class.forName(strNextText);
        } catch (ClassNotFoundException unused) {
            System.err.println("Error! A startup class specified in smack-config.xml could not be loaded: " + strNextText);
        }
    }

    private static int toq(XmlPullParser xmlPullParser, int i2) {
        try {
            return Integer.parseInt(xmlPullParser.nextText());
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return i2;
        }
    }

    public static String zy() {
        return "3.1.0";
    }
}
