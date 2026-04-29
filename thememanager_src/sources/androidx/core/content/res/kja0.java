package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import zy.InterfaceC7831j;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypedArrayUtils.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class kja0 {

    /* JADX INFO: renamed from: k */
    private static final String f3504k = "http://schemas.android.com/apk/res/android";

    private kja0() {
    }

    @dd
    public static CharSequence[] cdj(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i2);
        return textArray == null ? typedArray.getTextArray(i3) : textArray;
    }

    @dd
    public static ColorStateList f7l8(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @dd Resources.Theme theme, @lvui String str, @InterfaceC7831j int i2) {
        if (!ki(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i2, typedValue);
        int i3 = typedValue.type;
        if (i3 != 2) {
            return (i3 < 28 || i3 > 31) ? zy.m2360q(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme) : m2308y(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i2 + ": " + typedValue);
    }

    @zy.x2
    /* JADX INFO: renamed from: g */
    public static int m2300g(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, @InterfaceC7831j int i2, @zy.x2 int i3) {
        return !ki(xmlPullParser, str) ? i3 : typedArray.getColor(i2, i3);
    }

    @dd
    /* JADX INFO: renamed from: h */
    public static CharSequence m2301h(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3) {
        CharSequence text = typedArray.getText(i2);
        return text == null ? typedArray.getText(i3) : text;
    }

    @dd
    /* JADX INFO: renamed from: i */
    public static TypedValue m2302i(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, int i2) {
        if (ki(xmlPullParser, str)) {
            return typedArray.peekValue(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static int m2303k(@lvui Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static boolean ki(@lvui XmlPullParser xmlPullParser, @lvui String str) {
        return xmlPullParser.getAttributeValue(f3504k, str) != null;
    }

    @dd
    public static String kja0(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static int ld6(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, @InterfaceC7831j int i2, int i3) {
        return !ki(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m2304n(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, @InterfaceC7831j int i2, boolean z2) {
        return !ki(xmlPullParser, str) ? z2 : typedArray.getBoolean(i2, z2);
    }

    @zy.zy
    public static int n7h(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3, @zy.zy int i4) {
        return typedArray.getResourceId(i2, typedArray.getResourceId(i3, i4));
    }

    /* JADX INFO: renamed from: p */
    public static float m2305p(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, @InterfaceC7831j int i2, float f2) {
        return !ki(xmlPullParser, str) ? f2 : typedArray.getFloat(i2, f2);
    }

    /* JADX INFO: renamed from: q */
    public static int m2306q(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3, int i4) {
        return typedArray.getInt(i2, typedArray.getInt(i3, i4));
    }

    @dd
    public static String qrj(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, @InterfaceC7831j int i2) {
        if (ki(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static C0505q m2307s(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @dd Resources.Theme theme, @lvui String str, @InterfaceC7831j int i2, @zy.x2 int i3) {
        if (ki(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return C0505q.toq(typedValue.data);
            }
            C0505q c0505qF7l8 = C0505q.f7l8(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            if (c0505qF7l8 != null) {
                return c0505qF7l8;
            }
        }
        return C0505q.toq(i3);
    }

    @lvui
    public static TypedArray t8r(@lvui Resources resources, @dd Resources.Theme theme, @lvui AttributeSet attributeSet, @lvui int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static boolean toq(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3, boolean z2) {
        return typedArray.getBoolean(i2, typedArray.getBoolean(i3, z2));
    }

    @zy.zy
    public static int x2(@lvui TypedArray typedArray, @lvui XmlPullParser xmlPullParser, @lvui String str, @InterfaceC7831j int i2, @zy.zy int i3) {
        return !ki(xmlPullParser, str) ? i3 : typedArray.getResourceId(i2, i3);
    }

    @lvui
    /* JADX INFO: renamed from: y */
    private static ColorStateList m2308y(@lvui TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    @dd
    public static Drawable zy(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3) {
        Drawable drawable = typedArray.getDrawable(i2);
        return drawable == null ? typedArray.getDrawable(i3) : drawable;
    }
}
