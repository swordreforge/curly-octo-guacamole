package com.android.thememanager.search;

import com.android.thememanager.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.android.thememanager.search.g */
/* JADX INFO: compiled from: SearchConstantsHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2478g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60746f7l8 = "#800080";

    /* JADX INFO: renamed from: g */
    public static final String f14641g = "#0000ff";

    /* JADX INFO: renamed from: k */
    public static final String f14642k = "ALL";

    /* JADX INFO: renamed from: n */
    public static final String f14643n = "#00ff00";

    /* JADX INFO: renamed from: q */
    public static final String f14645q = "#ffff00";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60747toq = "#ff0000";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60748zy = "#ff7f00";

    /* JADX INFO: renamed from: y */
    private static Set<String> f14647y = new HashSet();

    /* JADX INFO: renamed from: s */
    private static Map<String, Integer> f14646s = new HashMap();

    /* JADX INFO: renamed from: p */
    private static Map<String, Integer> f14644p = new HashMap();

    static {
        f14647y.add(f60747toq);
        f14647y.add(f60748zy);
        f14647y.add(f14645q);
        f14647y.add(f14643n);
        f14647y.add(f14641g);
        f14647y.add(f60746f7l8);
        f14646s.put(f14642k, Integer.valueOf(R.drawable.resource_search_color_pick_all));
        f14646s.put(f60747toq, Integer.valueOf(R.drawable.resource_search_color_pick_red));
        f14646s.put(f60748zy, Integer.valueOf(R.drawable.resource_search_color_pick_orange));
        f14646s.put(f14645q, Integer.valueOf(R.drawable.resource_search_color_pick_yellow));
        f14646s.put(f14643n, Integer.valueOf(R.drawable.resource_search_color_pick_green));
        f14646s.put(f14641g, Integer.valueOf(R.drawable.resource_search_color_pick_blue));
        f14646s.put(f60746f7l8, Integer.valueOf(R.drawable.resource_search_color_pick_purple));
        f14644p.put(f60747toq, Integer.valueOf(R.string.resource_search_color_hint_red));
        f14644p.put(f60748zy, Integer.valueOf(R.string.resource_search_color_hint_orange));
        f14644p.put(f14645q, Integer.valueOf(R.string.resource_search_color_hint_yellow));
        f14644p.put(f14643n, Integer.valueOf(R.string.resource_search_color_hint_green));
        f14644p.put(f14641g, Integer.valueOf(R.string.resource_search_color_hint_blue));
        f14644p.put(f60746f7l8, Integer.valueOf(R.string.resource_search_color_hint_purple));
    }

    /* JADX INFO: renamed from: k */
    public static int m8856k(String key) {
        Integer num = f14644p.get(key);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int toq(String key) {
        Integer num = f14646s.get(key);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean zy(String color) {
        return f14647y.contains(color);
    }
}
