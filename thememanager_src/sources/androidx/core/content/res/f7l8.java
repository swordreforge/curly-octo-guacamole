package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.List;
import n7h.C7400k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: GradientColorInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final int f3477k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50391toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f50392zy = 2;

    private f7l8() {
    }

    /* JADX INFO: renamed from: k */
    private static C0499k m2269k(@dd C0499k c0499k, @zy.x2 int i2, @zy.x2 int i3, boolean z2, @zy.x2 int i4) {
        return c0499k != null ? c0499k : z2 ? new C0499k(i2, i4, i3) : new C0499k(i2, i3);
    }

    /* JADX INFO: renamed from: n */
    private static Shader.TileMode m2270n(int i2) {
        return i2 != 1 ? i2 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r4.size() <= 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        return new androidx.core.content.res.f7l8.C0499k(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return null;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.core.content.res.f7l8.C0499k m2271q(@zy.lvui android.content.res.Resources r9, @zy.lvui org.xmlpull.v1.XmlPullParser r10, @zy.lvui android.util.AttributeSet r11, @zy.dd android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = n7h.C7400k.p.f93310x9kr
            android.content.res.TypedArray r3 = androidx.core.content.res.kja0.t8r(r9, r12, r11, r3)
            int r5 = n7h.C7400k.p.f93301ncyb
            boolean r6 = r3.hasValue(r5)
            int r7 = n7h.C7400k.p.f42573l
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.f7l8$k r9 = new androidx.core.content.res.f7l8$k
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.f7l8.m2271q(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.f7l8$k");
    }

    static Shader toq(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return zy(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    static Shader zy(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayT8r = kja0.t8r(resources, theme, attributeSet, C7400k.p.f93299mcp);
        float fM2305p = kja0.m2305p(typedArrayT8r, xmlPullParser, "startX", C7400k.p.f93284d2ok, 0.0f);
        float fM2305p2 = kja0.m2305p(typedArrayT8r, xmlPullParser, "startY", C7400k.p.f93298lvui, 0.0f);
        float fM2305p3 = kja0.m2305p(typedArrayT8r, xmlPullParser, "endX", C7400k.p.f42577r, 0.0f);
        float fM2305p4 = kja0.m2305p(typedArrayT8r, xmlPullParser, "endY", C7400k.p.f93286dd, 0.0f);
        float fM2305p5 = kja0.m2305p(typedArrayT8r, xmlPullParser, "centerX", C7400k.p.f93294jp0y, 0.0f);
        float fM2305p6 = kja0.m2305p(typedArrayT8r, xmlPullParser, "centerY", C7400k.p.f93292gvn7, 0.0f);
        int iLd6 = kja0.ld6(typedArrayT8r, xmlPullParser, "type", C7400k.p.f93290fti, 0);
        int iM2300g = kja0.m2300g(typedArrayT8r, xmlPullParser, "startColor", C7400k.p.f93293jk, 0);
        boolean zKi = kja0.ki(xmlPullParser, "centerColor");
        int iM2300g2 = kja0.m2300g(typedArrayT8r, xmlPullParser, "centerColor", C7400k.p.f93287eqxt, 0);
        int iM2300g3 = kja0.m2300g(typedArrayT8r, xmlPullParser, "endColor", C7400k.p.f93282a9, 0);
        int iLd62 = kja0.ld6(typedArrayT8r, xmlPullParser, "tileMode", C7400k.p.f93304oc, 0);
        float fM2305p7 = kja0.m2305p(typedArrayT8r, xmlPullParser, "gradientRadius", C7400k.p.f93285d3, 0.0f);
        typedArrayT8r.recycle();
        C0499k c0499kM2269k = m2269k(m2271q(resources, xmlPullParser, attributeSet, theme), iM2300g, iM2300g3, zKi, iM2300g2);
        if (iLd6 != 1) {
            return iLd6 != 2 ? new LinearGradient(fM2305p, fM2305p2, fM2305p3, fM2305p4, c0499kM2269k.f3478k, c0499kM2269k.f50393toq, m2270n(iLd62)) : new SweepGradient(fM2305p5, fM2305p6, c0499kM2269k.f3478k, c0499kM2269k.f50393toq);
        }
        if (fM2305p7 > 0.0f) {
            return new RadialGradient(fM2305p5, fM2305p6, fM2305p7, c0499kM2269k.f3478k, c0499kM2269k.f50393toq, m2270n(iLd62));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX INFO: renamed from: androidx.core.content.res.f7l8$k */
    /* JADX INFO: compiled from: GradientColorInflaterCompat.java */
    static final class C0499k {

        /* JADX INFO: renamed from: k */
        final int[] f3478k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final float[] f50393toq;

        C0499k(@lvui List<Integer> list, @lvui List<Float> list2) {
            int size = list.size();
            this.f3478k = new int[size];
            this.f50393toq = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f3478k[i2] = list.get(i2).intValue();
                this.f50393toq[i2] = list2.get(i2).floatValue();
            }
        }

        C0499k(@zy.x2 int i2, @zy.x2 int i3) {
            this.f3478k = new int[]{i2, i3};
            this.f50393toq = new float[]{0.0f, 1.0f};
        }

        C0499k(@zy.x2 int i2, @zy.x2 int i3, @zy.x2 int i4) {
            this.f3478k = new int[]{i2, i3, i4};
            this.f50393toq = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
