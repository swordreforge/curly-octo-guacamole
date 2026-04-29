package com.xiaomi.push;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public class ab {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static ab f73262zy;

    /* JADX INFO: renamed from: k */
    private Map<String, Object> f32658k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<String, Object> f73263toq = new ConcurrentHashMap();

    private ab() {
        m20577q();
    }

    /* JADX INFO: renamed from: g */
    private ClassLoader[] m20574g() {
        ClassLoader[] classLoaderArr = {ab.class.getClassLoader(), Thread.currentThread().getContextClassLoader()};
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            ClassLoader classLoader = classLoaderArr[i2];
            if (classLoader != null) {
                arrayList.add(classLoader);
            }
        }
        return (ClassLoader[]) arrayList.toArray(new ClassLoader[arrayList.size()]);
    }

    /* JADX INFO: renamed from: k */
    public static synchronized ab m20575k() {
        if (f73262zy == null) {
            f73262zy = new ab();
        }
        return f73262zy;
    }

    private String zy(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/>");
        if (str != null) {
            sb.append("<");
            sb.append(str2);
            sb.append("/>");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n */
    public void m20576n(String str, String str2, Object obj) {
        if (!(obj instanceof wtop) && !(obj instanceof Class)) {
            throw new IllegalArgumentException("Provider must be a PacketExtensionProvider or a Class instance.");
        }
        this.f32658k.put(zy(str, str2), obj);
    }

    /* JADX INFO: renamed from: q */
    protected void m20577q() {
        try {
            for (ClassLoader classLoader : m20574g()) {
                Enumeration<URL> resources = classLoader.getResources("META-INF/smack.providers");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = null;
                    try {
                        inputStreamOpenStream = resources.nextElement().openStream();
                        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                        xmlPullParserNewPullParser.setInput(inputStreamOpenStream, "UTF-8");
                        int eventType = xmlPullParserNewPullParser.getEventType();
                        do {
                            if (eventType == 2) {
                                if (xmlPullParserNewPullParser.getName().equals("iqProvider")) {
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText2 = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText3 = xmlPullParserNewPullParser.nextText();
                                    String strZy = zy(strNextText, strNextText2);
                                    if (!this.f73263toq.containsKey(strZy)) {
                                        try {
                                            Class<?> cls = Class.forName(strNextText3);
                                            if (xzl.class.isAssignableFrom(cls)) {
                                                this.f73263toq.put(strZy, cls.newInstance());
                                            } else if (xblq.class.isAssignableFrom(cls)) {
                                                this.f73263toq.put(strZy, cls);
                                            }
                                        } catch (ClassNotFoundException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                } else if (xmlPullParserNewPullParser.getName().equals("extensionProvider")) {
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText4 = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText5 = xmlPullParserNewPullParser.nextText();
                                    xmlPullParserNewPullParser.next();
                                    xmlPullParserNewPullParser.next();
                                    String strNextText6 = xmlPullParserNewPullParser.nextText();
                                    String strZy2 = zy(strNextText4, strNextText5);
                                    if (!this.f32658k.containsKey(strZy2)) {
                                        try {
                                            Class<?> cls2 = Class.forName(strNextText6);
                                            if (wtop.class.isAssignableFrom(cls2)) {
                                                this.f32658k.put(strZy2, cls2.newInstance());
                                            } else if (mi1u.class.isAssignableFrom(cls2)) {
                                                this.f32658k.put(strZy2, cls2);
                                            }
                                        } catch (ClassNotFoundException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                }
                            }
                            eventType = xmlPullParserNewPullParser.next();
                        } while (eventType != 1);
                        inputStreamOpenStream.close();
                    } catch (Throwable th) {
                        try {
                            inputStreamOpenStream.close();
                        } catch (Exception unused) {
                        }
                        throw th;
                    }
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public Object toq(String str, String str2) {
        return this.f32658k.get(zy(str, str2));
    }
}
