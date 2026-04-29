package com.miui.maml.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.miui.maml.AnimatingDrawable;
import com.miui.maml.LifecycleResourceManager;
import com.miui.maml.RenderThread;
import com.miui.maml.ResourceManager;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.util.RendererCoreCache;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class AppIconsHelper {
    public static final int INVALID_INDEX = -1;
    private static final int LAYER_NUM = 5;
    public static final int TIME_DAY = 86400000;
    public static final int TIME_HOUR = 3600000;
    public static final int TIME_MIN = 60000;
    private static RendererCoreCache mRendererCoreCache;
    private static int mThemeChanged;
    private static ArrayMap<String, WeakReference<ResourceManager>> mAnimatingIconsResourceManagers = new ArrayMap<>();
    private static ArrayMap<String, WeakReference<ResourceManager>> mMamlAdaptiveIconsResourceManagers = new ArrayMap<>();
    private static ArrayMap<String, WeakReference<ConfigFile>> mMamlAdaptiveIconsConfigFile = new ArrayMap<>();
    private static final RendererCoreCache.OnCreateRootCallback mOnCreateRootCallback = new RendererCoreCache.OnCreateRootCallback() { // from class: com.miui.maml.util.AppIconsHelper.1
        @Override // com.miui.maml.util.RendererCoreCache.OnCreateRootCallback
        public void onCreateRoot(ScreenElementRoot screenElementRoot) {
            if (screenElementRoot != null) {
                screenElementRoot.setScaleByDensity(true);
            }
        }
    };

    private AppIconsHelper() {
    }

    private static void checkVersion(Context context) {
        int iConfiguration_getThemeChanged = HideSdkDependencyUtils.Configuration_getThemeChanged(context.getResources().getConfiguration());
        if (iConfiguration_getThemeChanged > mThemeChanged) {
            clearCache();
            mThemeChanged = iConfiguration_getThemeChanged;
        }
    }

    public static void cleanUp() {
        RenderThread.globalThreadStop();
    }

    public static void clearCache() {
        RendererCoreCache rendererCoreCache = mRendererCoreCache;
        if (rendererCoreCache != null) {
            rendererCoreCache.clear();
        }
        ArrayMap<String, WeakReference<ResourceManager>> arrayMap = mAnimatingIconsResourceManagers;
        if (arrayMap != null) {
            arrayMap.clear();
        }
    }

    private static ResourceManager createLifecycleResourceManagerFromeCache(ArrayMap<String, WeakReference<ResourceManager>> arrayMap, String str, String str2) {
        if (arrayMap == null) {
            return null;
        }
        WeakReference<ResourceManager> weakReference = arrayMap.get(str2);
        ResourceManager resourceManager = weakReference != null ? weakReference.get() : null;
        if (resourceManager != null) {
            return resourceManager;
        }
        LifecycleResourceManager lifecycleResourceManager = new LifecycleResourceManager(new FancyIconResourceLoader(str), 3600000L, 360000L);
        arrayMap.put(str2, new WeakReference<>(lifecycleResourceManager));
        return lifecycleResourceManager;
    }

    private static AnimatingDrawable createSubAnimatingDrawable(Context context, ConfigFile configFile, String str, String str2, String str3, UserHandle userHandle, int i2) {
        boolean useQuietWhenAnimFromConfig;
        boolean useFancyWhenStaticFromConfig;
        if (configFile != null) {
            useQuietWhenAnimFromConfig = getUseQuietWhenAnimFromConfig(configFile, i2);
            useFancyWhenStaticFromConfig = getUseFancyWhenStaticFromConfig(configFile, i2);
        } else {
            useQuietWhenAnimFromConfig = false;
            useFancyWhenStaticFromConfig = false;
        }
        String str4 = str + str2 + userHandle.hashCode() + i2;
        ResourceManager resourceManagerCreateLifecycleResourceManagerFromeCache = createLifecycleResourceManagerFromeCache(mAnimatingIconsResourceManagers, str3 + "/quiet/", str4);
        if (resourceManagerCreateLifecycleResourceManagerFromeCache != null) {
            return configFile != null ? new AnimatingDrawable(context, str, str2, resourceManagerCreateLifecycleResourceManagerFromeCache, userHandle, i2, getLayerAnimIndex(configFile, i2), useQuietWhenAnimFromConfig, useFancyWhenStaticFromConfig) : new AnimatingDrawable(context, str, str2, resourceManagerCreateLifecycleResourceManagerFromeCache, userHandle, i2);
        }
        MamlLog.m17851e("MAML AppIconsHelper", "fail to get rm, can't create subAD! package=" + str);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.drawable.Drawable getAdaptiveDrawable(android.content.Context r16, android.content.pm.PackageItemInfo r17, java.lang.String r18, java.lang.String r19, long r20, android.os.UserHandle r22) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.util.AppIconsHelper.getAdaptiveDrawable(android.content.Context, android.content.pm.PackageItemInfo, java.lang.String, java.lang.String, long, android.os.UserHandle):android.graphics.drawable.Drawable");
    }

    public static Drawable getFancyIconDrawable(Context context, String str, String str2, long j2, UserHandle userHandle, int i2) {
        ActivityInfo activityInfo;
        try {
            try {
                activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(str, str2), 786432);
            } catch (Exception unused) {
                activityInfo = null;
            }
        } catch (Exception unused2) {
        }
        return getIconDrawable(context, activityInfo, str, str2, j2, userHandle, true, i2);
    }

    public static Drawable getIconDrawable(Context context, ResolveInfo resolveInfo, PackageManager packageManager) {
        return getIconDrawable(context, resolveInfo, packageManager, 0L);
    }

    private static int getLayerAnimIndex(ConfigFile configFile, int i2) {
        if (configFile == null) {
            return -1;
        }
        try {
            return Integer.parseInt(configFile.getVariable("layer" + i2));
        } catch (Exception unused) {
            return -1;
        }
    }

    private static boolean getUseFancyWhenStaticFromConfig(ConfigFile configFile, int i2) {
        if (configFile == null) {
            return false;
        }
        boolean zEquals = TextUtils.equals("true", configFile.getVariable("use_fancy_when_static_layer" + i2));
        if (zEquals) {
            return zEquals;
        }
        return TextUtils.equals("true", configFile.getVariable("layer_only_fancy" + i2));
    }

    private static boolean getUseQuietWhenAnimFromConfig(ConfigFile configFile, int i2) {
        if (configFile == null) {
            return false;
        }
        boolean zEquals = TextUtils.equals("true", configFile.getVariable("use_quiet_when_anim_layer" + i2));
        if (zEquals) {
            return zEquals;
        }
        return TextUtils.equals("true", configFile.getVariable("layer_only_quiet" + i2));
    }

    public static Drawable getIconDrawable(Context context, ResolveInfo resolveInfo, PackageManager packageManager, long j2) {
        PackageItemInfo packageItemInfo = resolveInfo.activityInfo;
        if (packageItemInfo == null) {
            packageItemInfo = resolveInfo.serviceInfo;
        }
        return getIconDrawable(context, packageItemInfo, packageManager, j2);
    }

    public static Drawable getIconDrawable(Context context, PackageItemInfo packageItemInfo, PackageManager packageManager) {
        return getIconDrawable(context, packageItemInfo, packageManager, 0L);
    }

    public static Drawable getIconDrawable(Context context, PackageItemInfo packageItemInfo, PackageManager packageManager, long j2) {
        return getIconDrawable(context, packageItemInfo, packageManager, j2, HideSdkDependencyUtils.UserHandle_getInstance_with_int(HideSdkDependencyUtils.Context_getUserId(context)));
    }

    public static Drawable getIconDrawable(Context context, PackageItemInfo packageItemInfo, PackageManager packageManager, long j2, UserHandle userHandle) {
        Drawable iconDrawable = getIconDrawable(context, packageItemInfo, packageItemInfo.packageName, !(packageItemInfo instanceof ApplicationInfo) ? packageItemInfo.name : null, j2, userHandle);
        return iconDrawable != null ? iconDrawable : packageItemInfo.loadIcon(packageManager);
    }

    public static Drawable getIconDrawable(Context context, String str, String str2, long j2) {
        return getIconDrawable(context, str, str2, j2, HideSdkDependencyUtils.UserHandle_getInstance_with_int(HideSdkDependencyUtils.Context_getUserId(context)));
    }

    public static Drawable getIconDrawable(Context context, String str, String str2, long j2, UserHandle userHandle) {
        ActivityInfo activityInfo;
        try {
            activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(str, str2), 786432);
        } catch (Exception unused) {
            activityInfo = null;
        }
        return getIconDrawable(context, activityInfo, str, str2, j2, userHandle);
    }

    public static Drawable getIconDrawable(Context context, PackageItemInfo packageItemInfo, String str, String str2, long j2) {
        return getIconDrawable(context, packageItemInfo, str, str2, j2, HideSdkDependencyUtils.UserHandle_getInstance_with_int(HideSdkDependencyUtils.Context_getUserId(context)));
    }

    public static Drawable getIconDrawable(Context context, PackageItemInfo packageItemInfo, String str, String str2, long j2, UserHandle userHandle) {
        return getIconDrawable(context, packageItemInfo, str, str2, j2, userHandle, false, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable getIconDrawable(android.content.Context r9, android.content.pm.PackageItemInfo r10, java.lang.String r11, java.lang.String r12, long r13, android.os.UserHandle r15, boolean r16, int r17) {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.util.AppIconsHelper.getIconDrawable(android.content.Context, android.content.pm.PackageItemInfo, java.lang.String, java.lang.String, long, android.os.UserHandle, boolean, int):android.graphics.drawable.Drawable");
    }
}
