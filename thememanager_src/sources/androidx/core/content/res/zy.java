package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.C0683f;
import java.io.IOException;
import ki.C6116k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.InterfaceC7824b;
import zy.dd;
import zy.lvui;
import zy.uv6;
import zy.zurt;

/* JADX INFO: compiled from: ColorStateListInflaterCompat.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class zy {

    /* JADX INFO: renamed from: k */
    private static final ThreadLocal<TypedValue> f3519k = new ThreadLocal<>();

    private zy() {
    }

    @zy.x2
    private static int f7l8(@zy.x2 int i2, @zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 100.0d) float f3) {
        boolean z2 = f3 >= 0.0f && f3 <= 100.0f;
        if (f2 == 1.0f && !z2) {
            return i2;
        }
        int iM22394n = C6116k.m22394n((int) ((Color.alpha(i2) * f2) + 0.5f), 0, 255);
        if (z2) {
            C0502k c0502kZy = C0502k.zy(i2);
            i2 = C0502k.m2293h(c0502kZy.m2297p(), c0502kZy.m2298s(), f3);
        }
        return (i2 & C0683f.f50797t8r) | (iM22394n << 24);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m2357g(@lvui Resources resources, @zy.n7h int i2) {
        TypedValue typedValueZy = zy();
        resources.getValue(i2, typedValueZy, true);
        int i3 = typedValueZy.type;
        return i3 >= 28 && i3 <= 31;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static ColorStateList m2358k(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return toq(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList m2359n(@zy.lvui android.content.res.Resources r17, @zy.lvui org.xmlpull.v1.XmlPullParser r18, @zy.lvui android.util.AttributeSet r19, @zy.dd android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.zy.m2359n(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static ColorStateList m2360q(@lvui Resources resources, @InterfaceC7824b int i2, @dd Resources.Theme theme) {
        try {
            return m2358k(resources, resources.getXml(i2), theme);
        } catch (Exception e2) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
            return null;
        }
    }

    @lvui
    public static ColorStateList toq(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2359n(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: renamed from: y */
    private static TypedArray m2361y(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @lvui
    private static TypedValue zy() {
        ThreadLocal<TypedValue> threadLocal = f3519k;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
