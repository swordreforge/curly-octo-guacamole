package com.android.thememanager.basemodule.utils;

import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: LocaleUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class fu4 {

    /* JADX INFO: renamed from: k */
    public static final String f10320k = "fallback";

    /* JADX INFO: renamed from: q */
    public static final String[] f10321q = {"AT", "BE", "BG", "CY", "CZ", "DE", "DK", "EE", com.market.sdk.utils.kja0.f28214q, "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IT", "LT", "LU", "LV", "MT", "NL", "PL", "PT", "RO", "SE", "SI", "SK"};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57751toq = "en_US";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @Deprecated
    public static final String f57752zy = "zh_CN";

    public static <T> T f7l8(Map<String, T> map, String key) {
        T t2 = map.get(key);
        if (f57752zy.equals(key)) {
            if (t2 == null) {
                t2 = map.get("fallback");
            }
            if (t2 == null) {
                t2 = map.get(f57751toq);
            }
        } else {
            if (t2 == null) {
                t2 = map.get(f57751toq);
            }
            if (t2 == null) {
                t2 = map.get("fallback");
            }
        }
        return ((t2 instanceof List) && ((List) t2).isEmpty()) ? map.get("fallback") : t2;
    }

    /* JADX INFO: renamed from: g */
    public static void m7066g(Resource resource) {
        String qVar = toq();
        ResourceInfo localInfo = resource.getLocalInfo();
        localInfo.setAuthor((String) f7l8(localInfo.getAuthors(), qVar));
        localInfo.setDesigner((String) f7l8(localInfo.getDesigners(), qVar));
        localInfo.setTitle((String) f7l8(localInfo.getTitles(), toq()));
        localInfo.setDescription((String) f7l8(localInfo.getDescriptions(), qVar));
    }

    /* JADX INFO: renamed from: k */
    public static String m7067k() {
        return String.format("%s_%s", Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
    }

    /* JADX INFO: renamed from: n */
    public static void m7068n(Resource resource) {
        String qVar = toq();
        List<String> arrayList = (List) f7l8(resource.getBuildInThumbnailsMap(), qVar);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        resource.setBuildInThumbnails(arrayList);
        List<String> arrayList2 = (List) f7l8(resource.getBuildInPreviewsMap(), qVar);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList<>();
        }
        resource.setBuildInPreviews(arrayList2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7069q() {
        return TextUtils.equals(Locale.getDefault().getLanguage(), Locale.CHINA.getLanguage());
    }

    public static String toq() {
        return Locale.getDefault().toString();
    }

    public static String zy(Resource resource, String defaultTitle) {
        String str;
        return (resource == null || (str = resource.getLocalInfo().getTitles().get(Locale.getDefault().toString())) == null || str.length() <= 0) ? defaultTitle : str;
    }
}
