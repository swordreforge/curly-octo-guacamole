package com.android.thememanager.basemodule.resource;

import com.android.thememanager.basemodule.resource.constants.C1788k;
import java.io.Serializable;
import java.util.HashMap;
import miuix.core.util.C7083n;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.resource.k */
/* JADX INFO: compiled from: NewResourceContext.java */
/* JADX INFO: loaded from: classes.dex */
public class C1791k implements Serializable {

    /* JADX INFO: renamed from: g */
    private static final int f10210g = 3;

    /* JADX INFO: renamed from: k */
    private static HashMap<String, C1791k> f10211k = new HashMap<>();

    /* JADX INFO: renamed from: n */
    private static final int f10212n = 2;

    /* JADX INFO: renamed from: q */
    private static final int f10213q = 1;

    /* JADX INFO: renamed from: s */
    private static final int f10214s = 5;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: y */
    private static final int f10215y = 4;
    private String mResourceCode;

    private C1791k(String resourceCode) {
        this.mResourceCode = resourceCode;
    }

    public static C1791k getAod() {
        return getInstance("aod");
    }

    public static C1791k getFont() {
        return getInstance("fonts");
    }

    public static C1791k getIcon() {
        return getInstance("icons");
    }

    public static C1791k getInstance(@lvui String resourceCode) {
        if (!f10211k.containsKey(resourceCode)) {
            synchronized (C1791k.class) {
                if (!f10211k.containsKey(resourceCode)) {
                    f10211k.put(resourceCode, new C1791k(resourceCode));
                }
            }
        }
        return f10211k.get(resourceCode);
    }

    public static C1791k getRingtone() {
        return getInstance("ringtone");
    }

    public static C1791k getTheme() {
        return getInstance("theme");
    }

    public static C1791k getWallpaper() {
        return getInstance("wallpaper");
    }

    public String getAsyncImportFolder() {
        return "wallpaper".equals(this.mResourceCode) ? C1788k.az : "lockscreen".equals(this.mResourceCode) ? C1788k.ba : isAudioResource() ? "ringtone".equals(this.mResourceCode) ? C1788k.ax : com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode) ? C1788k.bq : "alarm".equals(this.mResourceCode) ? C1788k.ac : C1788k.ax : "theme".equals(this.mResourceCode) ? com.android.thememanager.basemodule.resource.constants.zy.f57654dd : com.android.thememanager.basemodule.resource.constants.zy.f10198r;
    }

    public String getBaseImageCacheFolder() {
        return C1788k.f10175k + com.android.thememanager.basemodule.resource.constants.toq.cax + C7083n.ld6(this.mResourceCode);
    }

    public String getBuildInImageFolder() {
        return "wallpaper".equals(this.mResourceCode) ? C1788k.id : "lockscreen".equals(this.mResourceCode) ? C1788k.in : isAudioResource() ? "ringtone".equals(this.mResourceCode) ? C1788k.bl : com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode) ? C1788k.as : "alarm".equals(this.mResourceCode) ? C1788k.bg : C1788k.bl : "theme".equals(this.mResourceCode) ? com.android.thememanager.basemodule.resource.constants.zy.f57653d3 : com.android.thememanager.basemodule.resource.constants.zy.f57660gvn7;
    }

    public String getBuildInImageRelativeFolderName() {
        if ("wallpaper".equals(this.mResourceCode) || "lockscreen".equals(this.mResourceCode)) {
            return C1788k.f10180p;
        }
        if (!isAudioResource()) {
            "theme".equals(this.mResourceCode);
            return "theme/.data/preview/theme/";
        }
        if (!"ringtone".equals(this.mResourceCode) && !com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode)) {
            "alarm".equals(this.mResourceCode);
        }
        return C1788k.f10172h;
    }

    public String getContentFolder() {
        if ("wallpaper".equals(this.mResourceCode)) {
            return C1788k.f10185u;
        }
        if ("lockscreen".equals(this.mResourceCode)) {
            return C1788k.f57649bo;
        }
        if (isAudioResource()) {
            return "ringtone".equals(this.mResourceCode) ? C1788k.f10186v : com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode) ? C1788k.f10168d : "alarm".equals(this.mResourceCode) ? C1788k.f10187w : C1788k.f10186v;
        }
        if ("theme".equals(this.mResourceCode)) {
            return com.android.thememanager.basemodule.resource.constants.zy.f57669ni7;
        }
        return com.android.thememanager.basemodule.resource.constants.zy.f57678zurt + C7083n.ld6(this.mResourceCode);
    }

    public String getContentRelativeFolderName() {
        if ("wallpaper".equals(this.mResourceCode) || "lockscreen".equals(this.mResourceCode)) {
            return C1788k.f10180p;
        }
        if (isAudioResource()) {
            if (!"ringtone".equals(this.mResourceCode) && !com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode)) {
                "alarm".equals(this.mResourceCode);
            }
            return C1788k.f10172h;
        }
        if ("theme".equals(this.mResourceCode)) {
            return com.android.thememanager.basemodule.resource.constants.zy.f57670o1t;
        }
        return com.android.thememanager.basemodule.resource.constants.zy.f10202z + C7083n.ld6(this.mResourceCode);
    }

    public String getMetaFolder() {
        if ("wallpaper".equals(this.mResourceCode)) {
            return C1788k.f10179o;
        }
        if ("lockscreen".equals(this.mResourceCode)) {
            return C1788k.f10177m;
        }
        if (isAudioResource()) {
            return "ringtone".equals(this.mResourceCode) ? C1788k.f10166b : com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode) ? C1788k.f10165a : "alarm".equals(this.mResourceCode) ? C1788k.f10188x : C1788k.f10166b;
        }
        if ("theme".equals(this.mResourceCode)) {
            return com.android.thememanager.basemodule.resource.constants.zy.f57651cdj;
        }
        return com.android.thememanager.basemodule.resource.constants.zy.f10192h + C7083n.ld6(this.mResourceCode);
    }

    public String getMetaRelativeFolderName() {
        if ("wallpaper".equals(this.mResourceCode) || "lockscreen".equals(this.mResourceCode)) {
            return C1788k.f10180p;
        }
        if (isAudioResource()) {
            if (!"ringtone".equals(this.mResourceCode) && !com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode)) {
                "alarm".equals(this.mResourceCode);
            }
            return C1788k.f10172h;
        }
        if ("theme".equals(this.mResourceCode)) {
            return "theme/.data/meta/theme/";
        }
        return "theme/.data/meta/" + C7083n.ld6(this.mResourceCode);
    }

    public String getResourceCode() {
        return this.mResourceCode;
    }

    public int getResourceFormat() {
        if (isBundleResource()) {
            return 1;
        }
        if (isImageResource()) {
            return 2;
        }
        if (isAudioResource()) {
            return 3;
        }
        return isZipResource() ? 4 : 5;
    }

    public String getRightsFolder() {
        return "wallpaper".equals(this.mResourceCode) ? C1788k.f57648ab : "lockscreen".equals(this.mResourceCode) ? C1788k.bb : isAudioResource() ? "ringtone".equals(this.mResourceCode) ? C1788k.bp : com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode) ? C1788k.bv : "alarm".equals(this.mResourceCode) ? C1788k.an : C1788k.bp : "theme".equals(this.mResourceCode) ? com.android.thememanager.basemodule.resource.constants.zy.f57667mcp : com.android.thememanager.basemodule.resource.constants.zy.f10200t;
    }

    public String getRightsRelativeFolderName() {
        if ("wallpaper".equals(this.mResourceCode) || "lockscreen".equals(this.mResourceCode)) {
            return C1788k.f10180p;
        }
        if (!isAudioResource()) {
            "theme".equals(this.mResourceCode);
            return "theme/.data/rights/theme/";
        }
        if (!"ringtone".equals(this.mResourceCode) && !com.android.thememanager.basemodule.analysis.toq.mle.equals(this.mResourceCode)) {
            "alarm".equals(this.mResourceCode);
        }
        return C1788k.f10172h;
    }

    public String getThumbnailCacheFolder() {
        return getBaseImageCacheFolder() + com.android.thememanager.basemodule.resource.constants.toq.k8s;
    }

    public boolean isAudioResource() {
        return C1792n.m6949z(this.mResourceCode);
    }

    public boolean isBundleResource() {
        return C1792n.wvg(this.mResourceCode);
    }

    public boolean isFontResource() {
        return C1792n.fti(this.mResourceCode);
    }

    public boolean isGadgetResource() {
        return C1792n.oc(this.mResourceCode);
    }

    public boolean isImageResource() {
        return C1792n.d2ok(this.mResourceCode);
    }

    public boolean isMiWallpaperResource() {
        return C1792n.x9kr(this.mResourceCode);
    }

    public boolean isRingtoneResource() {
        return C1792n.m6931c(this.mResourceCode);
    }

    public boolean isSelfDescribing() {
        int resourceFormat = getResourceFormat();
        return resourceFormat == 3 || resourceFormat == 2;
    }

    public boolean isZipResource() {
        return C1792n.m6937j(this.mResourceCode);
    }
}
