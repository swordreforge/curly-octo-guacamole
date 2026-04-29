package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.core.provider.C0599g;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7h.C7400k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.InterfaceC7830i;
import zy.InterfaceC7837n;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.core.content.res.g */
/* JADX INFO: compiled from: FontResourcesParserCompat.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0500g {

    /* JADX INFO: renamed from: g */
    private static final int f3479g = 500;

    /* JADX INFO: renamed from: k */
    private static final int f3480k = 400;

    /* JADX INFO: renamed from: n */
    public static final int f3481n = -1;

    /* JADX INFO: renamed from: q */
    public static final int f3482q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f50394toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50395zy = 0;

    /* JADX INFO: renamed from: androidx.core.content.res.g$k */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    @hyr(21)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2279k(TypedArray typedArray, int i2) {
            return typedArray.getType(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.g$n */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class n {

        /* JADX INFO: renamed from: g */
        private final int f3485g;

        /* JADX INFO: renamed from: k */
        @lvui
        private final String f3486k;

        /* JADX INFO: renamed from: n */
        private final int f3487n;

        /* JADX INFO: renamed from: q */
        private final String f3488q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f50398toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final boolean f50399zy;

        public n(@lvui String str, int i2, boolean z2, @dd String str2, int i3, int i4) {
            this.f3486k = str;
            this.f50398toq = i2;
            this.f50399zy = z2;
            this.f3488q = str2;
            this.f3487n = i3;
            this.f3485g = i4;
        }

        /* JADX INFO: renamed from: g */
        public boolean m2280g() {
            return this.f50399zy;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public String m2281k() {
            return this.f3486k;
        }

        /* JADX INFO: renamed from: n */
        public int m2282n() {
            return this.f50398toq;
        }

        @dd
        /* JADX INFO: renamed from: q */
        public String m2283q() {
            return this.f3488q;
        }

        public int toq() {
            return this.f3485g;
        }

        public int zy() {
            return this.f3487n;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.g$q */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class q implements toq {

        /* JADX INFO: renamed from: k */
        @lvui
        private final n[] f3489k;

        public q(@lvui n[] nVarArr) {
            this.f3489k = nVarArr;
        }

        @lvui
        /* JADX INFO: renamed from: k */
        public n[] m2284k() {
            return this.f3489k;
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.g$toq */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public interface toq {
    }

    /* JADX INFO: renamed from: androidx.core.content.res.g$zy */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    private C0500g() {
    }

    private static void f7l8(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private static n m2272g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7400k.p.f93295ki);
        int i2 = C7400k.p.f93308wvg;
        if (!typedArrayObtainAttributes.hasValue(i2)) {
            i2 = C7400k.p.f42571i;
        }
        int i3 = typedArrayObtainAttributes.getInt(i2, 400);
        int i4 = C7400k.p.f42581z;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = C7400k.p.f93289fn3e;
        }
        boolean z2 = 1 == typedArrayObtainAttributes.getInt(i4, 0);
        int i5 = C7400k.p.f42579t;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = C7400k.p.f93311zurt;
        }
        int i6 = C7400k.p.f93303o1t;
        if (!typedArrayObtainAttributes.hasValue(i6)) {
            i6 = C7400k.p.f93302ni7;
        }
        String string = typedArrayObtainAttributes.getString(i6);
        int i7 = typedArrayObtainAttributes.getInt(i5, 0);
        int i8 = C7400k.p.f93291fu4;
        if (!typedArrayObtainAttributes.hasValue(i8)) {
            i8 = C7400k.p.f93306t8r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i8, 0);
        String string2 = typedArrayObtainAttributes.getString(i8);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            f7l8(xmlPullParser);
        }
        return new n(string2, i3, z2, string, i7, resourceId);
    }

    /* JADX INFO: renamed from: k */
    private static int m2273k(TypedArray typedArray, int i2) {
        return k.m2279k(typedArray, i2);
    }

    @dd
    /* JADX INFO: renamed from: n */
    private static toq m2274n(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7400k.p.f42575p);
        String string = typedArrayObtainAttributes.getString(C7400k.p.f93297ld6);
        String string2 = typedArrayObtainAttributes.getString(C7400k.p.f93296kja0);
        String string3 = typedArrayObtainAttributes.getString(C7400k.p.f42570h);
        int resourceId = typedArrayObtainAttributes.getResourceId(C7400k.p.f93309x2, 0);
        int integer = typedArrayObtainAttributes.getInteger(C7400k.p.f93305qrj, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(C7400k.p.f93300n7h, 500);
        String string4 = typedArrayObtainAttributes.getString(C7400k.p.f93283cdj);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                f7l8(xmlPullParser);
            }
            return new g(new C0599g(string, string2, string3, zy(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(com.android.thememanager.basemodule.analysis.toq.azf)) {
                    arrayList.add(m2272g(xmlPullParser, resources));
                } else {
                    f7l8(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new q((n[]) arrayList.toArray(new n[0]));
    }

    @dd
    /* JADX INFO: renamed from: q */
    private static toq m2275q(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m2274n(xmlPullParser, resources);
        }
        f7l8(xmlPullParser);
        return null;
    }

    @dd
    public static toq toq(@lvui XmlPullParser xmlPullParser, @lvui Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2275q(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: y */
    private static List<byte[]> m2276y(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    @lvui
    public static List<List<byte[]>> zy(@lvui Resources resources, @InterfaceC7837n int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2273k(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2276y(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2276y(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.res.g$g */
    /* JADX INFO: compiled from: FontResourcesParserCompat.java */
    public static final class g implements toq {

        /* JADX INFO: renamed from: k */
        @lvui
        private final C0599g f3483k;

        /* JADX INFO: renamed from: q */
        @dd
        private final String f3484q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f50396toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f50397zy;

        @uv6({uv6.EnumC7844k.LIBRARY})
        public g(@lvui C0599g c0599g, int i2, int i3, @dd String str) {
            this.f3483k = c0599g;
            this.f50397zy = i2;
            this.f50396toq = i3;
            this.f3484q = str;
        }

        /* JADX INFO: renamed from: k */
        public int m2277k() {
            return this.f50397zy;
        }

        /* JADX INFO: renamed from: q */
        public int m2278q() {
            return this.f50396toq;
        }

        @lvui
        public C0599g toq() {
            return this.f3483k;
        }

        @dd
        @uv6({uv6.EnumC7844k.LIBRARY})
        public String zy() {
            return this.f3484q;
        }

        public g(@lvui C0599g c0599g, int i2, int i3) {
            this(c0599g, i2, i3, null);
        }
    }
}
