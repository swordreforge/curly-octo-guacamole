package com.android.thememanager.v9;

import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: CardConstantsHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements InterfaceC1789q, InterfaceC2872q {

    /* JADX INFO: renamed from: k */
    private static Map<String, String> f17212k;

    static {
        HashMap map = new HashMap();
        f17212k = map;
        map.put("theme", "THEME");
        f17212k.put("wallpaper", "WALLPAPER");
        f17212k.put("ringtone", "RINGTONE");
        f17212k.put("fonts", "FONT");
        f17212k.put("miwallpaper", "LIVE_WALLPAPER");
        f17212k.put("videowallpaper", "VIDEO_WALLPAPER");
    }

    /* JADX INFO: renamed from: k */
    public static String m10217k(String resourceCode) {
        return f17212k.get(resourceCode);
    }

    public static String toq(String page) {
        if (page == null) {
            return null;
        }
        for (String str : f17212k.keySet()) {
            if (p029m.zy.m24738k(f17212k.get(str), page)) {
                return str;
            }
        }
        return null;
    }
}
