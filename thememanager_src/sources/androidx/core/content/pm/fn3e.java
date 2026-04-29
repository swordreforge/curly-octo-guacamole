package androidx.core.content.pm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.lvui;
import zy.uv6;
import zy.y9n;
import zy.yz;

/* JADX INFO: compiled from: ShortcutXmlParser.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class fn3e {

    /* JADX INFO: renamed from: g */
    private static final Object f3446g = new Object();

    /* JADX INFO: renamed from: k */
    private static final String f3447k = "ShortcutXmlParser";

    /* JADX INFO: renamed from: n */
    private static volatile ArrayList<String> f3448n = null;

    /* JADX INFO: renamed from: q */
    private static final String f3449q = "shortcutId";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f50356toq = "android.app.shortcuts";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f50357zy = "shortcut";

    private fn3e() {
    }

    /* JADX INFO: renamed from: k */
    private static String m2192k(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str);
        return attributeValue == null ? xmlPullParser.getAttributeValue(null, str) : attributeValue;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private static Set<String> m2193n(@lvui Context context) {
        HashSet hashSet = new HashSet();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 128);
        if (listQueryIntentActivities != null && listQueryIntentActivities.size() != 0) {
            try {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo = it.next().activityInfo;
                    Bundle bundle = activityInfo.metaData;
                    if (bundle != null && bundle.containsKey(f50356toq)) {
                        XmlResourceParser xmlResourceParserZy = zy(context, activityInfo);
                        try {
                            hashSet.addAll(m2194q(xmlResourceParserZy));
                            if (xmlResourceParserZy != null) {
                                xmlResourceParserZy.close();
                            }
                        } finally {
                        }
                    }
                }
            } catch (Exception e2) {
                Log.e(f3447k, "Failed to parse the Xml resource: ", e2);
            }
        }
        return hashSet;
    }

    @lvui
    @yz
    /* JADX INFO: renamed from: q */
    public static List<String> m2194q(@lvui XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strM2192k;
        ArrayList arrayList = new ArrayList(1);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= 0)) {
                break;
            }
            int depth = xmlPullParser.getDepth();
            String name = xmlPullParser.getName();
            if (next == 2 && depth == 2 && f50357zy.equals(name) && (strM2192k = m2192k(xmlPullParser, f3449q)) != null) {
                arrayList.add(strM2192k);
            }
        }
        return arrayList;
    }

    @lvui
    @y9n
    public static List<String> toq(@lvui Context context) {
        if (f3448n == null) {
            synchronized (f3446g) {
                if (f3448n == null) {
                    f3448n = new ArrayList<>();
                    f3448n.addAll(m2193n(context));
                }
            }
        }
        return f3448n;
    }

    @lvui
    private static XmlResourceParser zy(Context context, ActivityInfo activityInfo) {
        XmlResourceParser xmlResourceParserLoadXmlMetaData = activityInfo.loadXmlMetaData(context.getPackageManager(), f50356toq);
        if (xmlResourceParserLoadXmlMetaData != null) {
            return xmlResourceParserLoadXmlMetaData;
        }
        throw new IllegalArgumentException("Failed to open android.app.shortcuts meta-data resource of " + activityInfo.name);
    }
}
