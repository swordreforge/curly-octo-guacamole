package z4;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: RecommendRequestConstants.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f100629f7l8;

    /* JADX INFO: renamed from: g */
    private static final String f45963g = "page/v3/subjects/%s?cardCount=1";

    /* JADX INFO: renamed from: k */
    public static Map<String, String> f45964k = null;

    /* JADX INFO: renamed from: n */
    private static final String f45965n = "page/v3/search/tag?cardCount=1&type=%s&tag=%s";

    /* JADX INFO: renamed from: p */
    private static final String f45966p = "page/v3/%s?cardCount=6";

    /* JADX INFO: renamed from: q */
    private static final String f45967q = "uipages/%s?cardCount=6";

    /* JADX INFO: renamed from: s */
    private static final String f45968s = "uipages/search/key?searchType=%s&cardCount=6";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static Map<String, String> f100630toq = null;

    /* JADX INFO: renamed from: y */
    private static final String f45969y = "uipages/search/%s/index?";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f100631zy = "page/v3/%s?cardCount=6";

    static {
        HashMap map = new HashMap();
        f45964k = map;
        map.put("hybrid", "HYBRID");
        f45964k.put("theme", "THEME");
        f45964k.put("wallpaper", "WALLPAPER");
        f45964k.put("videowallpaper", "VIDEO_WALLPAPER");
        f45964k.put("ringtone", "RINGTONE");
        f45964k.put("fonts", "FONT");
        f45964k.put("aod", "AOD");
        f45964k.put("icons", InterfaceC1789q.e1v);
        f45964k.put("widget_suit", "WIDGET_SUIT");
        f45964k.put("largeicons", InterfaceC1789q.fd23);
        HashMap map2 = new HashMap();
        f100630toq = map2;
        map2.put("wallpaper", InterfaceC1925p.l0e);
        f100630toq.put("videowallpaper", InterfaceC1925p.oe42);
        f100629f7l8 = "page/v3?apiVersion=1apiVersion=1&pageCategory=RINGTONE&cardCount=2147483647&randIndex=" + com.android.thememanager.basemodule.network.theme.toq.toq();
    }

    public static String f7l8(String tag, String category) {
        return f7l8.cdj() + String.format(f45965n, category, tag);
    }

    /* JADX INFO: renamed from: g */
    public static String m28200g(String id) {
        return f7l8.cdj() + String.format(f45963g, id);
    }

    /* JADX INFO: renamed from: k */
    public static String m28201k() {
        return f7l8.cdj() + f100629f7l8;
    }

    /* JADX INFO: renamed from: n */
    public static String m28202n(String id) {
        return f7l8.cdj() + String.format("page/v3/%s?cardCount=6", id);
    }

    /* JADX INFO: renamed from: q */
    public static String m28203q(String category) {
        return f7l8.ki() + String.format(f45968s, category);
    }

    public static String toq(String category) {
        return f7l8.ki() + String.format(f45969y, category);
    }

    /* JADX INFO: renamed from: y */
    public static String m28204y(String id) {
        return f7l8.ki() + String.format(f45967q, id);
    }

    public static String zy(String id) {
        return f7l8.cdj() + String.format("page/v3/%s?cardCount=6", id);
    }
}
