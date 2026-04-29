package com.android.thememanager.basemodule.utils;

import android.app.ActivityManager;
import android.app.DownloadManager;
import android.app.Notification;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.MiuiConfiguration;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.storage.StorageManager;
import android.util.Log;
import android.view.Display;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import miui.app.constants.ThemeManagerConstants;

/* JADX INFO: compiled from: HideSdkDependencyUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj {

    /* JADX INFO: renamed from: n */
    public static final String f10286n = "intent_extra_application_packagename";

    /* JADX INFO: renamed from: q */
    public static final String f10288q = "entity";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57726toq = "HideSdkDependencyUtils";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f57728zy = "hint";

    /* JADX INFO: renamed from: k */
    private static final boolean f10285k = bf2.toq.m5812n();

    /* JADX INFO: renamed from: g */
    private static Method f10284g = null;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static Method f57724f7l8 = null;

    /* JADX INFO: renamed from: y */
    private static Method f10290y = null;

    /* JADX INFO: renamed from: s */
    private static Method f10289s = null;

    /* JADX INFO: renamed from: p */
    private static Method f10287p = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static int f57725ld6 = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static int f57727x2 = -2;

    public static void cdj() {
        try {
            Object objInvoke = lrht.m7116g(lrht.m7117k("dalvik.system.VMRuntime"), "getRuntime", new Class[0]).invoke(null, new Object[0]);
            lrht.m7116g(objInvoke.getClass(), "clearGrowthLimit", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (f10285k) {
                Log.e(f57726toq, "Invoke | VMRuntime_clearGrowthLimit() occur EXCEPTION: " + e2.getMessage());
            }
        }
    }

    public static DownloadManager.Request f7l8(DownloadManager.Request request, String appData) {
        try {
            if (f10284g == null) {
                f10284g = lrht.m7118n(request.getClass(), "setAppData", String.class);
            }
            return (DownloadManager.Request) lrht.f7l8(f10284g, request, appData);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (!f10285k) {
                return null;
            }
            Log.e(f57726toq, "Invoke | DownloadManager_Request_setAppData() occur EXCEPTION: " + e2.getMessage());
            return null;
        }
    }

    public static Drawable fn3e(WallpaperManager wallpaperManager, int screen) {
        try {
            return (Drawable) lrht.m7118n(WallpaperManager.class, "getArgsDrawable", Integer.TYPE).invoke(wallpaperManager, Integer.valueOf(screen));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void fu4(Context context) {
        try {
            lrht.f7l8(lrht.m7118n(lrht.m7117k("miui.content.res.BootAnimationHelper"), "updateBootAudioEnabled", Context.class), null, context);
        } catch (Exception e2) {
            Log.e(f57726toq, "updateBootAudioEnabled: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m7011g(DownloadManager downloadManager, long id) {
        try {
            if (f10287p == null) {
                f10287p = lrht.m7118n(DownloadManager.class, "pauseDownload", new long[0].getClass());
            }
            f10287p.invoke(downloadManager, new long[]{id});
        } catch (Exception e2) {
            Log.e(f57726toq, "Invoke | DownloadManager_PauseDownload() occur EXCEPTION: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m7012h() {
        if (f57725ld6 < 0) {
            try {
                f57725ld6 = lrht.zy(ThemeManagerConstants.class, "THEME_FRAMEWORK_ABILITY_VERSION").getInt(null);
            } catch (Exception e2) {
                if (f10285k) {
                    Log.e(f57726toq, "Invoke | Libcore_Os_getFileLastStatusChangedTime() occur EXCEPTION: " + e2.getMessage());
                }
            }
        }
        if (f57725ld6 < 0) {
            f57725ld6 = 0;
        }
        return f57725ld6;
    }

    @zy.hyr(27)
    /* JADX INFO: renamed from: i */
    public static int m7013i(@zy.lvui WallpaperColors wallpaperColors) {
        try {
            Method method = wallpaperColors.getClass().getMethod("getColorHints", new Class[0]);
            method.setAccessible(true);
            return ((Integer) method.invoke(wallpaperColors, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.d(f57726toq, "WallpaperColors_getColorHints throw exception:" + e2);
            return 0;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m7014k(int fontScale, int fontWeight, long fontFlag, Bundle extra) {
        try {
            m7020z(fontFlag);
            Bundle bundle = extra != null ? extra : new Bundle();
            Log.i(f57726toq, " AMS_updateConfig. fontScale=" + fontScale + ", fontWeight" + fontWeight + ", extra=" + extra);
            Class<?> clsM7117k = lrht.m7117k("android.app.IActivityManager");
            Object objF7l8 = lrht.f7l8(lrht.m7118n(ActivityManager.class, "getService", new Class[0]), null, new Object[0]);
            Method methodM7118n = lrht.m7118n(clsM7117k, "updatePersistentConfigurationWithAttribution", Configuration.class, String.class, String.class);
            Configuration configuration = (Configuration) lrht.f7l8(lrht.m7118n(clsM7117k, "getConfiguration", new Class[0]), objF7l8, new Object[0]);
            MiuiConfiguration miuiConfiguration = (MiuiConfiguration) lrht.m7119q(Configuration.class, "extraConfig", configuration);
            if (fontScale > -1) {
                configuration.fontScale = MiuiConfiguration.getFontScale(fontScale);
                configuration.uiMode = fontScale | (configuration.uiMode & (-16));
                Log.i(f57726toq, "update fontScale=" + configuration.fontScale + ", uiMode=" + configuration.uiMode);
            }
            if (fontWeight > -1) {
                bundle.putInt("key_var_font_scale", fontWeight);
                Log.i(f57726toq, "put font weight = " + fontWeight);
            }
            miuiConfiguration.updateTheme(fontFlag);
            if (!bundle.isEmpty()) {
                miuiConfiguration.extraData.putAll(bundle);
            }
            Log.i(f57726toq, configuration.fontScale + ", to update , " + configuration);
            methodM7118n.invoke(objF7l8, configuration, "com.android.thememanager", null);
        } catch (Exception e2) {
            Log.e(f57726toq, "AMS_updateConfig, error ", e2);
        }
    }

    public static VibrationEffect ki(Uri uri, Context context) {
        try {
            Method method = VibrationEffect.class.getMethod("get", Uri.class, Context.class);
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return (VibrationEffect) method.invoke(VibrationEffect.class, uri, context);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
            Log.d(f57726toq, "VibrationEffect_get throw exception:" + e2);
            return null;
        }
    }

    public static void kja0(StorageManager sm, File file) {
        try {
            lrht.f7l8(lrht.m7118n(StorageManager.class, "fixupAppDir", File.class), sm, file);
        } catch (Exception e2) {
            Log.e(f57726toq, "fixupAppDir fail. " + e2);
        }
    }

    public static boolean ld6(Intent intent, int flag) {
        if (intent == null) {
            return false;
        }
        try {
            Method method = Intent.class.getMethod("addMiuiFlags", Integer.TYPE);
            method.setAccessible(true);
            method.invoke(intent, Integer.valueOf(flag));
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Point m7015n(Display display) {
        try {
            Point point = new Point();
            Method methodM7118n = lrht.m7118n(Display.class, "getRealSize", Boolean.class);
            methodM7118n.setAccessible(true);
            methodM7118n.invoke(Display.class, display, point, Boolean.TRUE);
            return point;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void n7h(Notification notification, int messageCount) {
        try {
            Object obj = lrht.zy(notification.getClass(), "extraNotification").get(notification);
            lrht.m7118n(obj.getClass(), "setMessageCount", new Class[0]).invoke(null, obj, Integer.valueOf(messageCount));
        } catch (Exception e2) {
            e2.printStackTrace();
            if (f10285k) {
                Log.e(f57726toq, "Invoke | Notification_setMessageCount() occur EXCEPTION: " + e2.getMessage());
            }
        }
    }

    public static boolean ni7() {
        return o1t.t8r();
    }

    /* JADX INFO: renamed from: p */
    public static void m7016p(DownloadManager downloadManager, long id) {
        try {
            if (f10289s == null) {
                f10289s = lrht.m7118n(DownloadManager.class, "resumeDownload", new long[0].getClass());
            }
            f10289s.invoke(downloadManager, new long[]{id});
        } catch (Exception e2) {
            Log.e(f57726toq, "Invoke | DownloadManager_ResumeDownload() occur EXCEPTION: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m7017q(ActivityManager activityManager, String packageName) {
        try {
            Method methodM7118n = lrht.m7118n(ActivityManager.class, "forceStopPackage", String.class);
            methodM7118n.setAccessible(true);
            methodM7118n.invoke(activityManager, packageName);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static int qrj() {
        if (f57727x2 == -2) {
            try {
                f57727x2 = lrht.zy(Class.forName("android.os.MiuiProcess"), "THEME_UID").getInt(null);
            } catch (Exception e2) {
                if (f10285k) {
                    Log.e(f57726toq, "Invoke | MiuiProcess_THEME_UID() occur EXCEPTION: " + e2.getMessage());
                }
            }
        }
        if (f57727x2 == -2) {
            f57727x2 = -1;
        }
        return f57727x2;
    }

    /* JADX INFO: renamed from: s */
    public static DownloadManager.Request m7018s(DownloadManager.Request request, long size) {
        try {
            if (f10290y == null) {
                f10290y = lrht.m7118n(DownloadManager.Request.class, "setFileSize", Long.TYPE);
            }
            if (f10290y == null) {
                f10290y = lrht.m7118n(DownloadManager.Request.class, "setFileSize", Long.class);
            }
            Method method = f10290y;
            if (method != null) {
                return (DownloadManager.Request) lrht.f7l8(method, request, Long.valueOf(size));
            }
            Field qVar = lrht.toq(DownloadManager.Request.class, "mFileSize");
            qVar.setAccessible(true);
            qVar.set(request, Long.valueOf(size));
            return request;
        } catch (Exception e2) {
            Log.e(f57726toq, "Invoke | DownloadManager_Request_setFileSize() occur EXCEPTION: " + Log.getStackTraceString(e2));
            return null;
        }
    }

    @zy.hyr(27)
    public static int t8r() {
        try {
            return lrht.zy(WallpaperColors.class, "HINT_SUPPORTS_DARK_TEXT").getInt(WallpaperColors.class);
        } catch (Exception e2) {
            Log.d(f57726toq, "WallpaperColors_HINT_SUPPORTS_DARK_TEXT throw exception:" + e2);
            return 1;
        }
    }

    public static void toq(int fontScale, int fontWeight, long flag, Bundle extra) {
        try {
            Log.i(f57726toq, "AMS_updateGlobalConfig: " + Long.toHexString(flag));
            Method methodM7118n = lrht.m7118n(lrht.m7117k("android.app.IActivityTaskManager"), "getMiuiGlobalConfiguration", new Class[0]);
            methodM7118n.setAccessible(true);
            Configuration configuration = (Configuration) lrht.f7l8(methodM7118n, lrht.f7l8(lrht.m7118n(lrht.m7117k("android.app.ActivityTaskManager"), "getService", new Class[0]), null, new Object[0]), new Object[0]);
            MiuiConfiguration miuiConfiguration = (MiuiConfiguration) lrht.m7119q(Configuration.class, "extraConfig", configuration);
            Class<?> clsM7117k = lrht.m7117k("android.app.IActivityManager");
            Object objF7l8 = lrht.f7l8(lrht.m7118n(ActivityManager.class, "getService", new Class[0]), null, new Object[0]);
            Method methodM7118n2 = lrht.m7118n(clsM7117k, "updatePersistentConfigurationWithAttribution", Configuration.class, String.class, String.class);
            Bundle bundle = extra != null ? extra : new Bundle();
            if (fontScale > -1) {
                configuration.fontScale = MiuiConfiguration.getFontScale(fontScale);
                configuration.uiMode = fontScale | (configuration.uiMode & (-16));
                Log.i(f57726toq, "update fontScale=" + configuration.fontScale + ", uiMode=" + configuration.uiMode);
            }
            if (fontWeight > -1) {
                bundle.putInt("key_var_font_scale", fontWeight);
                Log.i(f57726toq, "put font weight = " + fontWeight);
            }
            miuiConfiguration.updateTheme(flag);
            if (!bundle.isEmpty()) {
                miuiConfiguration.extraData.putAll(bundle);
            }
            Log.i(f57726toq, "AMS_updateGlobalConfig: " + configuration);
            methodM7118n2.invoke(objF7l8, configuration, "com.android.thememanager", null);
        } catch (Exception e2) {
            Log.e(f57726toq, "AMS_updateGlobalConfig, error ", e2);
        }
    }

    public static boolean x2(Intent intent) {
        try {
            Method method = Intent.class.getMethod("getMiuiFlags", new Class[0]);
            method.setAccessible(true);
            return (((Integer) method.invoke(intent, new Object[0])).intValue() & 4) != 0;
        } catch (Exception e2) {
            Log.e(f57726toq, "Intent_isSplitContext: ", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m7019y(DownloadManager.Request request, String jsonStr) {
        try {
            if (f57724f7l8 == null) {
                f57724f7l8 = lrht.m7118n(request.getClass(), "setExtra2", String.class);
            }
            lrht.f7l8(f57724f7l8, request, jsonStr);
        } catch (Exception e2) {
            Log.e(f57726toq, "Invoke | DownloadManager_Request_setExtra2() EXCEPTION: " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: z */
    private static void m7020z(long fontFlag) {
        if ((16 & fontFlag) == 0 && (fontFlag & InterfaceC1789q.h60v) == 0) {
            return;
        }
        try {
            lrht.m7116g(lrht.m7117k("miui.util.font.SymlinkUtils"), "syncFontForWebView", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void zurt(WallpaperManager wallpaperManager, ComponentName cname) {
        try {
            lrht.f7l8(lrht.m7118n(WallpaperManager.class, "setWallpaperComponent", ComponentName.class), wallpaperManager, cname);
        } catch (Exception e2) {
            e2.printStackTrace();
            if (f10285k) {
                Log.e(f57726toq, "Invoke | WallpaperManager_setWallpaperComponent() occur EXCEPTION: " + e2.getMessage());
            }
        }
    }

    public static void zy(long flag, Bundle extra) {
        toq(-1, -1, flag, extra);
    }
}
