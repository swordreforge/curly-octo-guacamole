package com.miui.maml.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.miui.maml.AnimatingDrawable;
import com.miui.maml.FancyDrawable;
import com.miui.maml.LargeIconDrawable;
import com.miui.maml.LifecycleResourceManager;
import com.miui.maml.MamlAdaptiveIconDrawable;
import com.miui.maml.RenderThread;
import com.miui.maml.ResourceManager;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.util.LargeIconConfigFile;
import com.miui.maml.util.RendererCoreCache;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import miuix.internal.util.C7168p;
import p001b.InterfaceC1356n;

/* JADX INFO: loaded from: classes3.dex */
public class LargeIconsHelper {
    private static final String ICON_TRANSFORM_CONFIG = "transform_config.xml";
    public static final int INVALID_INDEX = -1;
    public static final String LARGE_ICONS_APP_FOLD = "apps";
    public static final String LARGE_ICONS_CONFIG_FILE_NAME = "runtime_largeicon.config";
    public static final String LARGE_ICONS_CONFIG_FILE_PATH = "data/system/theme/large_icons";
    private static final int LAYER_NUM = 5;
    private static final String TAG = "LargeIconsHelper";
    private static final ArrayList<String> iconSizeTypes;
    private static final RendererCoreCache.OnCreateRootCallback mOnCreateRootCallback;
    private static RendererCoreCache mRendererCoreCache;
    private static volatile HashMap<String, LargeIconConfigFile> sManagerList;
    private static ArrayMap<String, WeakReference<ConfigFile>> mMamlAdaptiveIconsConfigFile = new ArrayMap<>();
    private static ArrayMap<String, WeakReference<ResourceManager>> mMamlAdaptiveIconsResourceManagers = new ArrayMap<>();
    private static ArrayMap<String, WeakReference<ResourceManager>> mAnimatingIconsResourceManagers = new ArrayMap<>();

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        iconSizeTypes = arrayList;
        arrayList.add(InterfaceC1356n.f7200k);
        arrayList.add(InterfaceC1356n.f53839zy);
        arrayList.add(InterfaceC1356n.f53838toq);
        arrayList.add(InterfaceC1356n.f7201q);
        mOnCreateRootCallback = new RendererCoreCache.OnCreateRootCallback() { // from class: com.miui.maml.util.q
            @Override // com.miui.maml.util.RendererCoreCache.OnCreateRootCallback
            public final void onCreateRoot(ScreenElementRoot screenElementRoot) {
                LargeIconsHelper.lambda$static$0(screenElementRoot);
            }
        };
    }

    private static String calculateIconSize(LargeIconConfigFile.Icon icon, String str) {
        return (TextUtils.isEmpty(str) || !iconSizeTypes.contains(str.toLowerCase())) ? icon.size : str;
    }

    public static void cleanUp() {
        RenderThread.globalThreadStop();
    }

    public static void clearCache(List<String> list) {
        RendererCoreCache rendererCoreCache = mRendererCoreCache;
        if (rendererCoreCache != null) {
            rendererCoreCache.clear();
        }
        ArrayMap<String, WeakReference<ConfigFile>> arrayMap = mMamlAdaptiveIconsConfigFile;
        if (arrayMap != null) {
            arrayMap.clear();
        }
        ArrayMap<String, WeakReference<ResourceManager>> arrayMap2 = mAnimatingIconsResourceManagers;
        if (arrayMap2 != null) {
            arrayMap2.clear();
        }
        ArrayMap<String, WeakReference<ResourceManager>> arrayMap3 = mMamlAdaptiveIconsResourceManagers;
        if (arrayMap3 != null) {
            arrayMap3.clear();
        }
        LargeIconResManager.clearCache(list);
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
        LifecycleResourceManager lifecycleResourceManager = new LifecycleResourceManager(new LargeIconResourceLoader(str), 3600000L, 360000L);
        arrayMap.put(str2, new WeakReference<>(lifecycleResourceManager));
        return lifecycleResourceManager;
    }

    private static AnimatingDrawable createSubAnimatingDrawable(LargeIconConfigFile.Icon icon, String str, Context context, ConfigFile configFile, String str2, String str3, String str4, UserHandle userHandle, int i2) {
        boolean useQuietWhenAnimFromConfig;
        boolean useFancyWhenStaticFromConfig;
        if (configFile != null) {
            useQuietWhenAnimFromConfig = getUseQuietWhenAnimFromConfig(configFile, i2);
            useFancyWhenStaticFromConfig = getUseFancyWhenStaticFromConfig(configFile, i2);
        } else {
            useQuietWhenAnimFromConfig = false;
            useFancyWhenStaticFromConfig = false;
        }
        String str5 = generateCacheKey(str2, str3, str, userHandle) + i2;
        ResourceManager resourceManagerCreateLifecycleResourceManagerFromeCache = createLifecycleResourceManagerFromeCache(mAnimatingIconsResourceManagers, str4 + "/quiet/", str5);
        if (resourceManagerCreateLifecycleResourceManagerFromeCache != null) {
            return configFile != null ? new AnimatingDrawable(context, str2, str3, resourceManagerCreateLifecycleResourceManagerFromeCache, userHandle, i2, getLayerAnimIndex(configFile, i2), useQuietWhenAnimFromConfig, useFancyWhenStaticFromConfig, true, icon, str) : new AnimatingDrawable(context, str2, str3, resourceManagerCreateLifecycleResourceManagerFromeCache, userHandle, i2, i2, false, false, true, icon, str);
        }
        MamlLog.m17851e("MAML AppIconsHelper", "fail to get rm, can't create subAD! package=" + str2);
        return null;
    }

    private static String generateCacheKey(String str, String str2, String str3, UserHandle userHandle) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        sb.append(str2);
        sb.append(str3);
        sb.append(HideSdkDependencyUtils.UserHandle_getIdentifier(userHandle));
        return sb.toString();
    }

    private static LargeIconConfigFile generateLargeIconConfigFile(String str) {
        LargeIconConfigFile largeIconConfigFile = new LargeIconConfigFile();
        StringBuilder sb = new StringBuilder();
        sb.append(LARGE_ICONS_CONFIG_FILE_PATH);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(myUserId());
        sb.append(str2);
        sb.append("apps");
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        sb.append(LARGE_ICONS_CONFIG_FILE_NAME);
        if (!largeIconConfigFile.load(sb.toString())) {
            MamlLog.m17854w(TAG, "generateLargeIconConfigFile returns null");
            return null;
        }
        MamlLog.m17854w(TAG, "generateLargeIconConfigFile success, mode is " + str);
        return largeIconConfigFile;
    }

    private static String generateLargeIconFolderPath(LargeIconConfigFile.Icon icon, String str) {
        return icon.path + "/" + str + "/";
    }

    private static Drawable getAdaptiveDrawable(LargeIconConfigFile.Icon icon, String str, Context context, String str2, String str3, long j2, UserHandle userHandle) {
        ConfigFile configFile;
        AnimatingDrawable animatingDrawable;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        String strGenerateCacheKey = generateCacheKey(str2, str3, str, userHandle);
        String str4 = generateLargeIconFolderPath(icon, str) + LargeIconDrawable.DRAWABLE_TYPE_LAYER_ANIMATING + "/";
        WeakReference<ConfigFile> weakReference = mMamlAdaptiveIconsConfigFile.get(strGenerateCacheKey);
        ConfigFile configFile2 = weakReference == null ? null : weakReference.get();
        if (configFile2 == null) {
            configFile2 = new ConfigFile();
            if (configFile2.load(str4 + "config.xml")) {
                mMamlAdaptiveIconsConfigFile.put(strGenerateCacheKey, new WeakReference<>(configFile2));
                configFile = configFile2;
            } else {
                configFile = null;
            }
        } else {
            configFile = configFile2;
        }
        ResourceManager resourceManagerCreateLifecycleResourceManagerFromeCache = createLifecycleResourceManagerFromeCache(mMamlAdaptiveIconsResourceManagers, str4 + "quiet/", strGenerateCacheKey);
        if (resourceManagerCreateLifecycleResourceManagerFromeCache == null) {
            return null;
        }
        AnimatingDrawable animatingDrawableCreateSubAnimatingDrawable = createSubAnimatingDrawable(icon, str, context, configFile, str2, str3, str4 + 0, userHandle, 0);
        if (animatingDrawableCreateSubAnimatingDrawable == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (true) {
            if (i2 >= 5) {
                animatingDrawable = animatingDrawableCreateSubAnimatingDrawable;
                break;
            }
            int i3 = i2;
            animatingDrawable = animatingDrawableCreateSubAnimatingDrawable;
            AnimatingDrawable animatingDrawableCreateSubAnimatingDrawable2 = createSubAnimatingDrawable(icon, str, context, configFile, str2, str3, str4 + i2, userHandle, i3);
            if (animatingDrawableCreateSubAnimatingDrawable2 == null) {
                break;
            }
            arrayList.add(animatingDrawableCreateSubAnimatingDrawable2);
            i2 = i3 + 1;
            animatingDrawableCreateSubAnimatingDrawable = animatingDrawable;
        }
        return new MamlAdaptiveIconDrawable(animatingDrawable, new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])), context, resourceManagerCreateLifecycleResourceManagerFromeCache);
    }

    private static Drawable getAnimatingDrawable(LargeIconConfigFile.Icon icon, String str, Context context, String str2, String str3, long j2, UserHandle userHandle) {
        String str4 = generateLargeIconFolderPath(icon, str) + LargeIconDrawable.DRAWABLE_TYPE_ANIMATING + "/";
        String strGenerateCacheKey = generateCacheKey(str2, str3, str, userHandle);
        ResourceManager resourceManagerCreateLifecycleResourceManagerFromeCache = createLifecycleResourceManagerFromeCache(mAnimatingIconsResourceManagers, str4 + "quiet/", strGenerateCacheKey);
        if (resourceManagerCreateLifecycleResourceManagerFromeCache != null) {
            return new AnimatingDrawable(context, str2, str3, resourceManagerCreateLifecycleResourceManagerFromeCache, userHandle, -1, -1, false, false, true, icon, str);
        }
        return null;
    }

    private static Drawable getFancyDrawable(LargeIconConfigFile.Icon icon, String str, Context context, String str2, String str3, long j2, UserHandle userHandle) {
        String strGenerateCacheKey = generateCacheKey(str2, str3, str, userHandle);
        if (mRendererCoreCache == null) {
            mRendererCoreCache = new RendererCoreCache(new Handler(Looper.getMainLooper()));
        }
        RendererCoreCache.RendererCoreInfo rendererCoreInfo = mRendererCoreCache.get(strGenerateCacheKey, j2);
        if (rendererCoreInfo == null) {
            rendererCoreInfo = mRendererCoreCache.get(strGenerateCacheKey, context, j2, new LargeIconResourceLoader(generateLargeIconFolderPath(icon, str) + LargeIconDrawable.DRAWABLE_TYPE_FANCY + "/"), mOnCreateRootCallback);
        }
        if (rendererCoreInfo == null || rendererCoreInfo.f29482r == null) {
            return null;
        }
        return new FancyDrawable(rendererCoreInfo.f29482r);
    }

    public static Drawable getFancyDrawableFromAnimating(LargeIconConfigFile.Icon icon, String str, Context context, String str2, String str3, long j2, UserHandle userHandle) {
        String strGenerateCacheKey = generateCacheKey(str2, str3, str, userHandle);
        if (mRendererCoreCache == null) {
            mRendererCoreCache = new RendererCoreCache(new Handler(Looper.getMainLooper()));
        }
        RendererCoreCache.RendererCoreInfo rendererCoreInfo = mRendererCoreCache.get(strGenerateCacheKey, j2);
        if (rendererCoreInfo == null) {
            rendererCoreInfo = mRendererCoreCache.get(strGenerateCacheKey, context, j2, new LargeIconResourceLoader(generateLargeIconFolderPath(icon, str) + LargeIconDrawable.DRAWABLE_TYPE_ANIMATING + "/fancy/"), mOnCreateRootCallback);
        }
        if (rendererCoreInfo == null || rendererCoreInfo.f29482r == null) {
            return null;
        }
        return new FancyDrawable(rendererCoreInfo.f29482r);
    }

    public static Drawable getFancyDrawableFromLayerAnimating(LargeIconConfigFile.Icon icon, String str, Context context, String str2, String str3, long j2, UserHandle userHandle, int i2) {
        String strGenerateCacheKey = generateCacheKey(str2, str3, str, userHandle);
        String str4 = (generateLargeIconFolderPath(icon, str) + LargeIconDrawable.DRAWABLE_TYPE_LAYER_ANIMATING + "/") + i2 + "/fancy/";
        String str5 = strGenerateCacheKey + i2;
        RendererCoreCache.RendererCoreInfo rendererCoreInfo = mRendererCoreCache.get(str5, j2);
        if (rendererCoreInfo == null) {
            rendererCoreInfo = mRendererCoreCache.get(str5, context, j2, new LargeIconResourceLoader(str4), mOnCreateRootCallback);
        }
        if (rendererCoreInfo == null || rendererCoreInfo.f29482r == null) {
            return null;
        }
        return new FancyDrawable(rendererCoreInfo.f29482r);
    }

    public static synchronized LargeIconConfigFile getLargeIconConfigFile(String str, boolean z2) {
        LargeIconConfigFile largeIconConfigFileGenerateLargeIconConfigFile;
        if (str == null) {
            throw new NullPointerException("init LargeIconModeRuntimeManager error, mode is null");
        }
        if (sManagerList == null) {
            sManagerList = new HashMap<>(3);
        }
        largeIconConfigFileGenerateLargeIconConfigFile = sManagerList.get(str);
        if (largeIconConfigFileGenerateLargeIconConfigFile == null || z2) {
            largeIconConfigFileGenerateLargeIconConfigFile = generateLargeIconConfigFile(str);
            sManagerList.put(str, largeIconConfigFileGenerateLargeIconConfigFile);
        }
        return largeIconConfigFileGenerateLargeIconConfigFile;
    }

    public static Drawable getLargeIconDrawable(Context context, String str, String str2, String str3, String str4, long j2, UserHandle userHandle) {
        return getLargeIconDrawable(context, str, str2, str3, str4, null, j2, userHandle);
    }

    private static String getLargeIconDrawableType(LargeIconConfigFile.Icon icon, String str) {
        String[] list;
        File file = new File(icon.path + "/" + str);
        if (file.exists() && (list = file.list()) != null && list.length != 0) {
            for (String str2 : list) {
                if (LargeIconDrawable.DRAWABLE_TYPE_LAYER_ANIMATING.equals(str2)) {
                    return LargeIconDrawable.DRAWABLE_TYPE_LAYER_ANIMATING;
                }
                if (LargeIconDrawable.DRAWABLE_TYPE_FANCY.equals(str2)) {
                    return LargeIconDrawable.DRAWABLE_TYPE_FANCY;
                }
                if (LargeIconDrawable.DRAWABLE_TYPE_ANIMATING.equals(str2)) {
                    return LargeIconDrawable.DRAWABLE_TYPE_ANIMATING;
                }
                if (LargeIconDrawable.DRAWABLE_TYPE_RES.equals(str2)) {
                    return LargeIconDrawable.DRAWABLE_TYPE_RES;
                }
                if (LargeIconDrawable.DRAWABLE_TYPE_PAIR.equals(str2)) {
                    return LargeIconDrawable.DRAWABLE_TYPE_PAIR;
                }
            }
        }
        return null;
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

    public static Drawable getOriginLargeIconDrawable(Context context, String str, String str2, String str3, String str4, String str5, long j2, UserHandle userHandle) {
        return getLargeIconDrawable(context, true, str, str2, str3, str4, str5, j2, userHandle);
    }

    private static Drawable getResDrawable(LargeIconConfigFile.Icon icon, String str, Context context, String str2, String str3, long j2, UserHandle userHandle) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        String str4 = generateLargeIconFolderPath(icon, str) + LargeIconDrawable.DRAWABLE_TYPE_RES + "/";
        String strFindNearestDir = "drawable" + ThemeDensityFallbackUtils.getScreenWidthSuffix(Resources.getSystem().getConfiguration()) + ThemeDensityFallbackUtils.getDensitySuffix(displayMetrics.densityDpi);
        if (!new File(str4 + strFindNearestDir).exists()) {
            strFindNearestDir = ThemeDensityFallbackUtils.findNearestDir(str4, displayMetrics.densityDpi);
        }
        if (TextUtils.isEmpty(strFindNearestDir)) {
            MamlLog.m17854w(TAG, "can not find the ResDrawable dir that is " + str2 + " and activity is " + str3);
            return null;
        }
        return LargeIconResManager.getDrawable(context.getResources(), str4 + strFindNearestDir, icon.packageName + ".png", displayMetrics.densityDpi);
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

    public static boolean hasLargeIcon(String str, String str2, String str3, UserHandle userHandle) {
        if (str3 == null) {
            throw new NullPointerException("init LargeIconModeRuntimeManager error, mode is null");
        }
        LargeIconConfigFile largeIconConfigFile = getLargeIconConfigFile(str3, false);
        if (largeIconConfigFile == null) {
            return false;
        }
        HashMap<String, LargeIconConfigFile.Icon> iconsConfigs = largeIconConfigFile.getIconsConfigs();
        if (!TextUtils.isEmpty(str2)) {
            str = str + C5658n.f73185t8r + str2;
        }
        return iconsConfigs.containsKey(str);
    }

    public static boolean isXSpaceUserId(UserHandle userHandle) {
        try {
            return ((Boolean) ReflectionHelper.invokeObject(ReflectionHelper.getClass("miui.securityspace.XSpaceUserHandle"), null, "isXSpaceUser", new Class[]{UserHandle.class}, userHandle)).booleanValue();
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | XSpaceUserHandle isXSpaceUser() occur EXCEPTION: ", e2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$static$0(ScreenElementRoot screenElementRoot) {
        if (screenElementRoot != null) {
            screenElementRoot.setScaleByDensity(true);
        }
    }

    private static int myUserId() {
        try {
            Integer num = (Integer) C7168p.toq(UserHandle.class, Integer.TYPE, "myUserId", null, new Object[0]);
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return 0;
    }

    public static Drawable getLargeIconDrawable(Context context, String str, String str2, String str3, String str4, String str5, long j2, UserHandle userHandle) {
        return getLargeIconDrawable(context, false, str, str2, str3, str4, str5, j2, userHandle);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static Drawable getLargeIconDrawable(Context context, boolean z2, String str, String str2, String str3, String str4, String str5, long j2, UserHandle userHandle) {
        String str6;
        if (str3 != null) {
            LargeIconConfigFile largeIconConfigFile = getLargeIconConfigFile(str3, false);
            if (largeIconConfigFile == null) {
                MamlLog.m17854w(TAG, "getLargeIconDrawable config is null");
                return null;
            }
            HashMap<String, LargeIconConfigFile.Icon> iconsConfigs = largeIconConfigFile.getIconsConfigs();
            if (TextUtils.isEmpty(str2)) {
                str6 = str;
            } else {
                str6 = str + C5658n.f73185t8r + str2;
            }
            LargeIconConfigFile.Icon icon = iconsConfigs.get(str6);
            LargeIconConfigFile.Icon icon2 = icon == null ? iconsConfigs.get(str) : icon;
            if (icon2 == null) {
                MamlLog.m17854w(TAG, "config can not find the package that is " + str + " and activity is " + str2);
                return null;
            }
            String strCalculateIconSize = calculateIconSize(icon2, str5);
            int transFormConfig = LargeIconConfigFile.readTransFormConfig(icon2, icon2.path + "/" + ICON_TRANSFORM_CONFIG);
            LargeIconDrawable largeIconDrawable = new LargeIconDrawable();
            largeIconDrawable.setType(strCalculateIconSize);
            largeIconDrawable.setUuid(icon2.uuid);
            largeIconDrawable.setLocalId(icon2.localId);
            largeIconDrawable.setEnableIconMask(transFormConfig);
            largeIconDrawable.setPackageName(icon2.packageName);
            String largeIconDrawableType = getLargeIconDrawableType(icon2, strCalculateIconSize);
            if (largeIconDrawableType == null) {
                MamlLog.m17854w(TAG, "config can not find the drawableType that is " + str + " and activity is " + str2);
                return null;
            }
            largeIconDrawable.setDrawableType(largeIconDrawableType);
            switch (largeIconDrawableType) {
                case "animating_icons":
                    Drawable animatingDrawable = getAnimatingDrawable(icon2, strCalculateIconSize, context, str, str2, j2, userHandle);
                    if (animatingDrawable != null) {
                        PortableUtils.getUserBadgedIcon(context, animatingDrawable, userHandle);
                    }
                    largeIconDrawable.setDrawable(animatingDrawable);
                    return largeIconDrawable;
                case "res":
                    Drawable resDrawable = getResDrawable(icon2, strCalculateIconSize, context, str, str2, j2, userHandle);
                    if (!z2) {
                        if (transFormConfig == 1 && resDrawable != null) {
                            Bitmap bitmapDrawableToBitmap = BitmapUtils.drawableToBitmap(resDrawable);
                            resDrawable = new BitmapDrawable(context.getResources(), BitmapUtils.composeIcon(bitmapDrawableToBitmap, BitmapUtils.getBitmapFromDrawable(context, PortableUtils.getMaskCornerId(strCalculateIconSize), bitmapDrawableToBitmap.getWidth(), bitmapDrawableToBitmap.getHeight())));
                        }
                        if (isXSpaceUserId(userHandle) && resDrawable != null) {
                            resDrawable = PortableUtils.getXspaceDrawable(context, resDrawable, PortableUtils.getXSpaceBadgeDrawable(context, strCalculateIconSize));
                        }
                    }
                    largeIconDrawable.setDrawable(resDrawable);
                    return largeIconDrawable;
                case "layer_animating_icons":
                    Drawable adaptiveDrawable = getAdaptiveDrawable(icon2, strCalculateIconSize, context, str, str2, j2, userHandle);
                    if (adaptiveDrawable != null) {
                        PortableUtils.getUserBadgedIcon(context, adaptiveDrawable, userHandle);
                    }
                    largeIconDrawable.setDrawable(adaptiveDrawable);
                    return largeIconDrawable;
                case "fancy_icons":
                    Drawable fancyDrawable = getFancyDrawable(icon2, strCalculateIconSize, context, str, str2, j2, userHandle);
                    if (fancyDrawable != null) {
                        PortableUtils.getUserBadgedIcon(context, fancyDrawable, userHandle);
                    }
                    largeIconDrawable.setDrawable(fancyDrawable);
                    return largeIconDrawable;
                default:
                    return largeIconDrawable;
            }
        }
        throw new NullPointerException("init LargeIconModeRuntimeManager error, mode is null");
    }
}
