package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.collection.C0247k;
import androidx.constraintlayout.core.motion.utils.zurt;
import com.xiaomi.onetrack.api.C5693g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: TransitionInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class eqxt {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Class<?>[] f52488toq = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final C0247k<String, Constructor<?>> f52489zy = new C0247k<>();

    /* JADX INFO: renamed from: k */
    private final Context f6401k;

    private eqxt(@zy.lvui Context context) {
        this.f6401k = context;
    }

    /* JADX INFO: renamed from: k */
    private Object m5326k(AttributeSet attributeSet, Class<?> cls, String str) {
        Object objNewInstance;
        Class<? extends U> clsAsSubclass;
        String attributeValue = attributeSet.getAttributeValue(null, C5693g.f31802r);
        if (attributeValue == null) {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
        try {
            C0247k<String, Constructor<?>> c0247k = f52489zy;
            synchronized (c0247k) {
                Constructor<?> constructor = c0247k.get(attributeValue);
                if (constructor == null && (clsAsSubclass = Class.forName(attributeValue, false, this.f6401k.getClassLoader()).asSubclass(cls)) != 0) {
                    constructor = clsAsSubclass.getConstructor(f52488toq);
                    constructor.setAccessible(true);
                    c0247k.put(attributeValue, constructor);
                }
                objNewInstance = constructor.newInstance(this.f6401k, attributeSet);
            }
            return objNewInstance;
        } catch (Exception e2) {
            throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e2);
        }
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: n */
    private void m5327n(XmlPullParser xmlPullParser, AttributeSet attributeSet, oc ocVar) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (!xmlPullParser.getName().equals(zurt.InterfaceC0290k.f47416lvui)) {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
                TypedArray typedArrayObtainStyledAttributes = this.f6401k.obtainStyledAttributes(attributeSet, d3.f6376k);
                int iX2 = androidx.core.content.res.kja0.x2(typedArrayObtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                if (iX2 != 0) {
                    ocVar.mo5318q(iX2);
                } else {
                    int iX22 = androidx.core.content.res.kja0.x2(typedArrayObtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                    if (iX22 != 0) {
                        ocVar.fti(iX22, true);
                    } else {
                        String strQrj = androidx.core.content.res.kja0.qrj(typedArrayObtainStyledAttributes, xmlPullParser, "targetName", 4);
                        if (strQrj != null) {
                            ocVar.mo5321y(strQrj);
                        } else {
                            String strQrj2 = androidx.core.content.res.kja0.qrj(typedArrayObtainStyledAttributes, xmlPullParser, "excludeName", 5);
                            if (strQrj2 != null) {
                                ocVar.d3(strQrj2, true);
                            } else {
                                String strQrj3 = androidx.core.content.res.kja0.qrj(typedArrayObtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                if (strQrj3 != null) {
                                    try {
                                        ocVar.gvn7(Class.forName(strQrj3), true);
                                    } catch (ClassNotFoundException e2) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw new RuntimeException("Could not create " + strQrj3, e2);
                                    }
                                } else {
                                    String strQrj4 = androidx.core.content.res.kja0.qrj(typedArrayObtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                    if (strQrj4 != null) {
                                        ocVar.mo5314g(Class.forName(strQrj4));
                                    }
                                }
                            }
                        }
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public static eqxt m5328q(@zy.lvui Context context) {
        return new eqxt(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.oc toq(org.xmlpull.v1.XmlPullParser r8, android.util.AttributeSet r9, androidx.transition.oc r10) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.eqxt.toq(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, androidx.transition.oc):androidx.transition.oc");
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: y */
    private void m5329y(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, lvui lvuiVar) throws Resources.NotFoundException {
        oc ocVarM5330g;
        TypedArray typedArrayObtainStyledAttributes = this.f6401k.obtainStyledAttributes(attributeSet, d3.f52475toq);
        int iX2 = androidx.core.content.res.kja0.x2(typedArrayObtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int iX22 = androidx.core.content.res.kja0.x2(typedArrayObtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        fti ftiVarM5339q = iX22 < 0 ? null : fti.m5339q(viewGroup, iX22, this.f6401k);
        int iX23 = androidx.core.content.res.kja0.x2(typedArrayObtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        fti ftiVarM5339q2 = iX23 >= 0 ? fti.m5339q(viewGroup, iX23, this.f6401k) : null;
        if (iX2 >= 0 && (ocVarM5330g = m5330g(iX2)) != null) {
            if (ftiVarM5339q2 == null) {
                throw new RuntimeException("No toScene for transition ID " + iX2);
            }
            if (ftiVarM5339q == null) {
                lvuiVar.x2(ftiVarM5339q2, ocVarM5330g);
            } else {
                lvuiVar.ld6(ftiVarM5339q, ftiVarM5339q2, ocVarM5330g);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.transition.lvui zy(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L54
        L12:
            r3 = 1
            if (r2 == r3) goto L54
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2b
            androidx.transition.lvui r1 = new androidx.transition.lvui
            r1.<init>()
            goto L5
        L2b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L39
            if (r1 == 0) goto L39
            r4.m5329y(r6, r5, r7, r1)
            goto L5
        L39:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.eqxt.zy(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.lvui");
    }

    public lvui f7l8(int i2, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f6401k.getResources().getXml(i2);
        try {
            try {
                return zy(xml, Xml.asAttributeSet(xml), viewGroup);
            } catch (IOException e2) {
                InflateException inflateException = new InflateException(xml.getPositionDescription() + ": " + e2.getMessage());
                inflateException.initCause(e2);
                throw inflateException;
            } catch (XmlPullParserException e3) {
                InflateException inflateException2 = new InflateException(e3.getMessage());
                inflateException2.initCause(e3);
                throw inflateException2;
            }
        } finally {
            xml.close();
        }
    }

    /* JADX INFO: renamed from: g */
    public oc m5330g(int i2) {
        XmlResourceParser xml = this.f6401k.getResources().getXml(i2);
        try {
            try {
                return toq(xml, Xml.asAttributeSet(xml), null);
            } catch (IOException e2) {
                throw new InflateException(xml.getPositionDescription() + ": " + e2.getMessage(), e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException(e3.getMessage(), e3);
            }
        } finally {
            xml.close();
        }
    }
}
