package mi1u;

import android.net.Uri;
import android.text.TextUtils;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.util.uc;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: UrlResolverHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: g */
    private static final String f38347g = "mifb";

    /* JADX INFO: renamed from: k */
    private static final String f38348k = "http";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static Set<String> f85545ld6 = null;

    /* JADX INFO: renamed from: n */
    private static final String f38349n = "mihttps";

    /* JADX INFO: renamed from: p */
    private static Set<String> f38350p = null;

    /* JADX INFO: renamed from: q */
    private static final String f38351q = "mihttp";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f85546toq = "https";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f85547zy = "mi";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String[] f85544f7l8 = {".xiaomi.com", ".mi.com", ".miui.com", ".mipay.com"};

    /* JADX INFO: renamed from: y */
    private static final String[] f38353y = {".duokan.com", ".duokanbox.com", ".mijiayoupin.com"};

    /* JADX INFO: renamed from: s */
    private static final String[] f38352s = {"com.xiaomi.channel", "com.duokan.reader", "com.duokan.hdreader", "com.duokan.fiction", "com.duokan.free", "com.xiaomi.router", "com.xiaomi.smarthome", "com.xiaomi.o2o", "com.xiaomi.shop", "com.xiaomi.jr", "com.xiaomi.jr.security", "com.xiaomi.mifisecurity", "com.xiaomi.loan", "com.xiaomi.loanx", "com.mi.credit.in", "com.mi.credit.id", "com.miui.miuibbs", "com.wali.live", "com.mi.live", "com.xiaomi.ab", uc.f16819f, "com.xiaomi.pass", "com.xiaomi.youpin", "com.mi.liveassistant", "com.xiangkan.android", "com.xiaomi.gamecenter", a9.f10267n};

    static {
        HashSet hashSet = new HashSet();
        f38350p = hashSet;
        hashSet.add(f38351q);
        f38350p.add(f38349n);
        HashSet hashSet2 = new HashSet();
        f85545ld6 = hashSet2;
        hashSet2.add("http");
        f85545ld6.add("https");
        f85545ld6.addAll(f38350p);
    }

    public static boolean f7l8(String packageName) {
        for (String str : f38352s) {
            if (str.equals(packageName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m24747g(String url) {
        if (TextUtils.isEmpty(url)) {
            return false;
        }
        Uri uri = Uri.parse(url);
        if ("http".equals(uri.getScheme()) || "https".equals(uri.getScheme())) {
            return m24749n(uri.getHost());
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static Uri m24748k(String fallback) {
        return Uri.parse(fallback.substring(2));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m24749n(String host) {
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        for (String str : f85544f7l8) {
            if (host.endsWith(str)) {
                return true;
            }
        }
        for (String str2 : f38353y) {
            if (host.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m24750q(String scheme) {
        return f38350p.contains(scheme);
    }

    public static String toq(Uri uri) {
        String strZy = zy(uri, 0, null);
        if (strZy != null) {
            if (f85545ld6.contains(Uri.parse(strZy).getScheme())) {
                return strZy;
            }
        }
        return null;
    }

    private static String zy(Uri uri, int parameterSuffix, String lastFallbackParameter) {
        StringBuilder sb = new StringBuilder();
        sb.append(f38347g);
        sb.append(parameterSuffix == 0 ? "" : Integer.valueOf(parameterSuffix));
        String queryParameter = uri.getQueryParameter(sb.toString());
        return queryParameter != null ? zy(uri, parameterSuffix + 1, queryParameter) : lastFallbackParameter;
    }
}
