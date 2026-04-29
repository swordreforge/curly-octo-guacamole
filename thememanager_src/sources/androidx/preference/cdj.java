package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: PreferenceInflater.java */
/* JADX INFO: loaded from: classes.dex */
class cdj {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f51763f7l8 = "intent";

    /* JADX INFO: renamed from: y */
    private static final String f5448y = "extra";

    /* JADX INFO: renamed from: k */
    @lvui
    private final Context f5449k;

    /* JADX INFO: renamed from: q */
    private String[] f5450q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object[] f51764toq = new Object[2];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ki f51765zy;

    /* JADX INFO: renamed from: n */
    private static final Class<?>[] f5447n = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: g */
    private static final HashMap<String, Constructor<?>> f5446g = new HashMap<>();

    public cdj(@lvui Context context, ki kiVar) {
        this.f5449k = context;
        f7l8(kiVar);
    }

    private void f7l8(ki kiVar) {
        this.f51765zy = kiVar;
        ld6(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    /* JADX INFO: renamed from: k */
    private Preference m4673k(@lvui String str, @dd String[] strArr, AttributeSet attributeSet) throws InflateException, ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = f5446g.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f5449k.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(f5447n);
                    constructor.setAccessible(true);
                    f5446g.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e6) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e6);
                throw inflateException;
            }
        }
        Object[] objArr = this.f51764toq;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: p */
    private void m4674p(@lvui XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.was(Intent.parseIntent(zy().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    zy().getResources().parseBundleExtra("extra", attributeSet, preference.n7h());
                    try {
                        x2(xmlPullParser);
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference qVar = toq(name, attributeSet);
                    ((PreferenceGroup) preference).cv06(qVar);
                    m4674p(xmlPullParser, qVar, attributeSet);
                }
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: s */
    private PreferenceGroup m4675s(PreferenceGroup preferenceGroup, @lvui PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.hb(this.f51765zy);
        return preferenceGroup2;
    }

    private Preference toq(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? m4679y(str, attributeSet) : m4673k(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    private static void x2(@lvui XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public Preference m4676g(XmlPullParser xmlPullParser, @dd PreferenceGroup preferenceGroup) {
        int next;
        PreferenceGroup preferenceGroupM4675s;
        synchronized (this.f51764toq) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            this.f51764toq[0] = this.f5449k;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        break;
                    }
                } catch (InflateException e2) {
                    throw e2;
                } catch (IOException e3) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e3.getMessage());
                    inflateException.initCause(e3);
                    throw inflateException;
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroupM4675s = m4675s(preferenceGroup, (PreferenceGroup) toq(xmlPullParser.getName(), attributeSetAsAttributeSet));
            m4674p(xmlPullParser, preferenceGroupM4675s, attributeSetAsAttributeSet);
        }
        return preferenceGroupM4675s;
    }

    public void ld6(String[] strArr) {
        this.f5450q = strArr;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public Preference m4677n(int i2, @dd PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = zy().getResources().getXml(i2);
        try {
            return m4676g(xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    /* JADX INFO: renamed from: q */
    public String[] m4678q() {
        return this.f5450q;
    }

    /* JADX INFO: renamed from: y */
    protected Preference m4679y(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return m4673k(str, this.f5450q, attributeSet);
    }

    @lvui
    public Context zy() {
        return this.f5449k;
    }
}
