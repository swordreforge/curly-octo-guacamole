package com.android.thememanager.search;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.search.n */
/* JADX INFO: compiled from: SearchColorManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2480n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static SharedPreferences.Editor f60749f7l8 = null;

    /* JADX INFO: renamed from: g */
    private static SharedPreferences f14648g = null;

    /* JADX INFO: renamed from: k */
    private static final int f14649k = 6;

    /* JADX INFO: renamed from: n */
    private static volatile List<String> f14650n = null;

    /* JADX INFO: renamed from: q */
    private static final Object f14651q = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60750toq = ":";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60751zy = "selected_theme_components";

    static {
        SharedPreferences sharedPreferences = C2082k.zy().toq().getSharedPreferences(f60751zy, 0);
        f14648g = sharedPreferences;
        f60749f7l8 = sharedPreferences.edit();
    }

    /* JADX INFO: renamed from: k */
    private static List<String> m8857k() {
        if (f14650n == null) {
            synchronized (f14651q) {
                if (f14650n == null) {
                    ArrayList arrayList = new ArrayList();
                    String[] stringArray = C2082k.zy().toq().getResources().getStringArray(R.array.default_colors);
                    if (stringArray != null) {
                        for (String str : stringArray) {
                            arrayList.add(str);
                        }
                    }
                    f14650n = arrayList;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(f14650n);
        return arrayList2;
    }

    /* JADX INFO: renamed from: n */
    static void m8858n(final String resourceCode, final List<String> list) {
        if (zy(list)) {
            String str = "";
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 != 0) {
                    str = str + ":";
                }
                str = str + list.get(i2);
            }
            f60749f7l8.putString(resourceCode, str);
            f60749f7l8.apply();
        }
    }

    /* JADX INFO: renamed from: q */
    private static List<String> m8859q(String colorsString) {
        if (TextUtils.isEmpty(colorsString)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : colorsString.split(":")) {
            arrayList.add(str);
        }
        return arrayList;
    }

    static List<String> toq(String resourceCode) {
        List<String> listM8859q;
        String string = f14648g.getString(resourceCode, null);
        return (TextUtils.isEmpty(string) || (listM8859q = m8859q(string)) == null) ? m8857k() : listM8859q;
    }

    private static boolean zy(List<String> list) {
        if (list == null || list.size() != 6) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (!C2478g.zy(it.next())) {
                return false;
            }
        }
        return true;
    }
}
