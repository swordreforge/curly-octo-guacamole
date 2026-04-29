package com.miui.maml.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.IPackageInstallObserver2;
import android.content.res.Configuration;
import android.content.res.MiuiConfiguration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.MemoryFile;
import android.os.RemoteException;
import android.os.UserHandle;
import android.os.storage.StorageManager;
import android.provider.Settings;
import android.provider.SystemSettings;
import android.service.wallpaper.WallpaperService;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.WindowManager;
import java.io.FileDescriptor;
import java.util.Optional;
import miui.content.pm.IPreloadedAppManager;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class HideSdkDependencyUtils {
    private static final String DEBUG_LAYOUT_PROPERTY = "debug.layout";
    private static final String SURFACE_CONTROL = "android.view.SurfaceControl";
    private static final String TAG = "MAML_Reflect";
    private static final int TETHERING_WIFI = 0;

    public static int Configuration_getThemeChanged(Configuration configuration) {
        try {
            MiuiConfiguration miuiConfiguration = (MiuiConfiguration) ReflectionHelper.getFieldValue(Configuration.class, configuration, "extraConfig");
            if (miuiConfiguration == null) {
                return 0;
            }
            return miuiConfiguration.themeChanged;
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | Configuration_getThemeChanged() occur EXCEPTION: ", e2);
            return 0;
        }
    }

    public static int Context_getUserId(Context context) {
        try {
            return ((Integer) ReflectionHelper.invokeObject(Context.class, context, "getUserId", new Class[0], new Object[0])).intValue();
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | Context_getUserId() occur EXCEPTION: ", e2);
            return 0;
        }
    }

    public static void Context_startActivityAsUser(Context context, Intent intent, Bundle bundle, UserHandle userHandle) {
        try {
            ReflectionHelper.invokeObject(Context.class, context, "startActivityAsUser", new Class[]{Intent.class, Bundle.class, UserHandle.class}, intent, bundle, userHandle);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | Context_startActivityAsUser() occur EXCEPTION: ", e2);
        }
    }

    public static ComponentName Context_startServiceAsUser(Context context, Intent intent, UserHandle userHandle) {
        try {
            return (ComponentName) ReflectionHelper.invokeObject(Context.class, context, "startServiceAsUser", new Class[]{Intent.class, UserHandle.class}, intent, userHandle);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | Context_startServiceAsUser() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static FileDescriptor MemoryFile_getFileDescriptor(MemoryFile memoryFile) {
        try {
            return (FileDescriptor) ReflectionHelper.invokeObject(FileDescriptor.class, memoryFile, "getFileDescriptor", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | MemoryFile_getFileDescriptor() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static boolean MotionEvent_isTouchEvent(MotionEvent motionEvent) {
        try {
            return ((Boolean) ReflectionHelper.invokeObject(MotionEvent.class, motionEvent, "isTouchEvent", new Class[0], new Object[0])).booleanValue();
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | MotionEvent_isTouchEvent() occur EXCEPTION: ", e2);
            return false;
        }
    }

    public static boolean PreloadedAppPolicy_installPreloadedDataApp(final Context context, final String str, final Intent intent, final Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT < 28) {
                return false;
            }
            Intent intent2 = new Intent("com.xiaomi.market.PreloadedDataAppInstallService");
            intent2.setPackage("com.xiaomi.market");
            if (context.getPackageManager().queryIntentServices(intent2, 0).isEmpty()) {
                MamlLog.m17851e(TAG, "installPreloadedDataApp fail, not find market!");
                return false;
            }
            context.bindService(intent2, new ServiceConnection() { // from class: com.miui.maml.util.HideSdkDependencyUtils.1
                @Override // android.content.ServiceConnection
                public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    try {
                        IPreloadedAppManager.Stub.asInterface(iBinder).reinstallPreloadedApp2(str, new IPackageInstallObserver2.Stub() { // from class: com.miui.maml.util.HideSdkDependencyUtils.1.1
                            public void onPackageInstalled(String str2, int i2, String str3, Bundle bundle2) throws RemoteException {
                                context.unbindService(this);
                                if (1 == i2) {
                                    ServiceConnectionC52591 serviceConnectionC52591 = ServiceConnectionC52591.this;
                                    Utils.startActivityBg(context, intent, bundle);
                                }
                            }

                            public void onUserActionRequired(Intent intent3) {
                                MamlLog.m17853i(HideSdkDependencyUtils.TAG, "reinstallPreloadApp2. onUserActionRequired.");
                            }
                        }, 1);
                    } catch (Exception e2) {
                        context.unbindService(this);
                        MamlLog.m17852e(HideSdkDependencyUtils.TAG, "reinstallPreloadApp2. " + e2.getMessage(), e2);
                    }
                }

                @Override // android.content.ServiceConnection
                public void onServiceDisconnected(ComponentName componentName) {
                    MamlLog.m17853i(HideSdkDependencyUtils.TAG, "reinstallPreloadApp2. disconnected.");
                }
            }, 1);
            return true;
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | PreloadedAppPolicy_installPreloadedDataApp() occur EXCEPTION: ", e2);
            return false;
        }
    }

    public static String SettingsSecure_UI_NIGHT_MODE() {
        try {
            return (String) ReflectionHelper.getFieldValue(Settings.Secure.class, null, "UI_NIGHT_MODE");
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SettingsSecure_UI_NIGHT_MODE() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static void StorageManager_disableUsbMassStorage(StorageManager storageManager) {
        try {
            ReflectionHelper.invoke(StorageManager.class, storageManager, "disableUsbMassStorage", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | StorageManager_disableUsbMassStorage() occur EXCEPTION: ", e2);
        }
    }

    public static void StorageManager_enableUsbMassStorage(StorageManager storageManager) {
        try {
            ReflectionHelper.invoke(StorageManager.class, storageManager, "enableUsbMassStorage", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | StorageManager_enableUsbMassStorage() occur EXCEPTION: ", e2);
        }
    }

    public static boolean StorageManager_isUsbMassStorageEnabled(StorageManager storageManager) {
        try {
            return ((Boolean) ReflectionHelper.invokeObject(StorageManager.class, storageManager, "isUsbMassStorageEnabled", new Class[0], new Object[0])).booleanValue();
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | StorageManager_isUsbMassStorageEnabled() occur EXCEPTION: ", e2);
            return false;
        }
    }

    public static void SurfaceControl_closeTransaction() {
        try {
            ReflectionHelper.invokeObject(ReflectionHelper.getClass(SURFACE_CONTROL), null, "closeTransaction", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_closeTransaction() occur EXCEPTION: ", e2);
        }
    }

    public static SurfaceControl SurfaceControl_getInstance() {
        if (Build.VERSION.SDK_INT != 29) {
            return null;
        }
        try {
            return (SurfaceControl) ReflectionHelper.getConstructorInstance(SurfaceControl.class, new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_getInstance() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static SurfaceControl SurfaceControl_getInstance_with_engine(WallpaperService.Engine engine) {
        if (Build.VERSION.SDK_INT != 29) {
            return null;
        }
        try {
            SurfaceControl surfaceControl = (SurfaceControl) ReflectionHelper.getConstructorInstance(SurfaceControl.class, new Class[0], new Object[0]);
            initSurfaceControl(engine, surfaceControl);
            return surfaceControl;
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_getInstance() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static SurfaceControl SurfaceControl_getInstance_with_params(Surface surface, SurfaceControl surfaceControl, String str, int i2, int i3, int i4) {
        try {
            Class<?> cls = ReflectionHelper.getClass("android.view.SurfaceSession");
            Class<?> cls2 = ReflectionHelper.getClass(SURFACE_CONTROL);
            int iIntValue = ((Integer) ReflectionHelper.getFieldValue(cls2, null, "HIDDEN")).intValue();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 == 29) {
                Object constructorInstance = ReflectionHelper.getConstructorInstance(cls, new Class[0], new Object[0]);
                Class cls3 = Integer.TYPE;
                return (SurfaceControl) ReflectionHelper.getConstructorInstance(cls2, new Class[]{cls, String.class, cls3, cls3, cls3, cls3, cls2, SparseIntArray.class}, constructorInstance, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(iIntValue), surfaceControl, null);
            }
            if (i5 == 28) {
                Object constructorInstance2 = ReflectionHelper.getConstructorInstance(cls, new Class[]{Surface.class}, surface);
                Class cls4 = Integer.TYPE;
                return (SurfaceControl) ReflectionHelper.getConstructorInstance(cls2, new Class[]{cls, String.class, cls4, cls4, cls4, cls4, cls2, cls4, cls4}, constructorInstance2, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(iIntValue), surfaceControl, -1, -1);
            }
            if (i5 != 26 && i5 != 27) {
                return null;
            }
            Object constructorInstance3 = ReflectionHelper.getConstructorInstance(cls, new Class[]{Surface.class}, surface);
            Class cls5 = Integer.TYPE;
            return (SurfaceControl) ReflectionHelper.getConstructorInstance(cls2, new Class[]{cls, String.class, cls5, cls5, cls5, cls5}, constructorInstance3, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(iIntValue));
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_getInstance_with_params() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static void SurfaceControl_hide(SurfaceControl surfaceControl) {
        try {
            ReflectionHelper.invokeObject(ReflectionHelper.getClass(SURFACE_CONTROL), surfaceControl, "hide", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_hide() occur EXCEPTION: ", e2);
        }
    }

    public static void SurfaceControl_openTransaction() {
        try {
            ReflectionHelper.invokeObject(ReflectionHelper.getClass(SURFACE_CONTROL), null, "openTransaction", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_openTransaction() occur EXCEPTION: ", e2);
        }
    }

    public static void SurfaceControl_setBufferSize(SurfaceControl surfaceControl, int i2, int i3) {
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 29) {
                Class cls = Integer.TYPE;
                ReflectionHelper.invokeObject(SurfaceControl.class, surfaceControl, "setBufferSize", new Class[]{cls, cls}, Integer.valueOf(i2), Integer.valueOf(i3));
            } else if (i4 <= 28) {
                Class<?> cls2 = ReflectionHelper.getClass(SURFACE_CONTROL);
                Class cls3 = Integer.TYPE;
                ReflectionHelper.invokeObject(cls2, surfaceControl, "setSize", new Class[]{cls3, cls3}, Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_setBufferSize() occur EXCEPTION: ", e2);
        }
    }

    public static void SurfaceControl_setLayer(SurfaceControl surfaceControl, int i2) {
        try {
            ReflectionHelper.invokeObject(ReflectionHelper.getClass(SURFACE_CONTROL), surfaceControl, "setLayer", new Class[]{Integer.TYPE}, Integer.valueOf(i2));
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_setLayer() occur EXCEPTION: ", e2);
        }
    }

    public static void SurfaceControl_setPosition(SurfaceControl surfaceControl, float f2, float f3) {
        try {
            Class<?> cls = ReflectionHelper.getClass(SURFACE_CONTROL);
            Class cls2 = Float.TYPE;
            ReflectionHelper.invokeObject(cls, surfaceControl, "setPosition", new Class[]{cls2, cls2}, Float.valueOf(f2), Float.valueOf(f3));
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_setPosition() occur EXCEPTION: ", e2);
        }
    }

    public static void SurfaceControl_show(SurfaceControl surfaceControl) {
        try {
            ReflectionHelper.invokeObject(ReflectionHelper.getClass(SURFACE_CONTROL), surfaceControl, "show", new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SurfaceControl_show() occur EXCEPTION: ", e2);
        }
    }

    public static void Surface_copyFrom(Surface surface, SurfaceControl surfaceControl) {
        if (Build.VERSION.SDK_INT <= 29) {
            try {
                ReflectionHelper.invokeObject(Surface.class, surface, "copyFrom", new Class[]{ReflectionHelper.getClass(SURFACE_CONTROL)}, surfaceControl);
            } catch (Exception e2) {
                MamlLog.m17852e(TAG, "Invoke | Surface_copyFrom() occur EXCEPTION: ", e2);
            }
        }
    }

    public static Surface Surface_getInstance() {
        try {
            return (Surface) ReflectionHelper.getConstructorInstance(Surface.class, new Class[0], new Object[0]);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | Surface_getInstance() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static String SystemSettingsSystem_DARKEN_WALLPAPER_UNDER_DARK_MODE() {
        try {
            return (String) ReflectionHelper.getFieldValue(SystemSettings.System.class, null, "DARKEN_WALLPAPER_UNDER_DARK_MODE");
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | SystemSettingsSystem_DARKEN_WALLPAPER_UNDER_DARK_MODE() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static Typeface TypefaceUtils_replaceTypeface(Context context, Typeface typeface) {
        try {
            return (Typeface) ReflectionHelper.invokeObject(ReflectionHelper.getClass("miui.util.TypefaceUtils"), null, "replaceTypeface", new Class[]{Context.class, Typeface.class}, context, typeface);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | TypefaceUtils_replaceTypeface() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static UserHandle UserHandle_CURRENT() {
        try {
            return (UserHandle) ReflectionHelper.getFieldValue(UserHandle.class, null, "CURRENT");
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | UserHandle_CURRENT() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static int UserHandle_getIdentifier(UserHandle userHandle) {
        try {
            return ((Integer) ReflectionHelper.invokeObject(UserHandle.class, userHandle, "getIdentifier", new Class[0], new Object[0])).intValue();
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | UserHandle_getIdentifier() occur EXCEPTION: ", e2);
            return 0;
        }
    }

    public static UserHandle UserHandle_getInstance_with_int(int i2) {
        try {
            return (UserHandle) ReflectionHelper.getConstructorInstance(UserHandle.class, new Class[]{Integer.TYPE}, Integer.valueOf(i2));
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | UserHandle_getInstance_with_int() occur EXCEPTION: ", e2);
            return null;
        }
    }

    public static boolean WifiManager_isWifiApEnabled(WifiManager wifiManager) {
        try {
            return ((Boolean) ReflectionHelper.invokeObject(WifiManager.class, wifiManager, "isWifiApEnabled", new Class[0], new Object[0])).booleanValue();
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | WifiManager_isWifiApEnabled() occur EXCEPTION: ", e2);
            return false;
        }
    }

    public static void WindowManager_LayoutParams_setLayoutParamsBlurRatio(WindowManager.LayoutParams layoutParams, float f2) {
        try {
            ReflectionHelper.setFieldValue(WindowManager.LayoutParams.class, layoutParams, "blurRatio", Float.valueOf(f2));
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | WindowManager_LayoutParams_setLayoutParamsBlurRatio() occur EXCEPTION: ", e2);
        }
    }

    @hyr(29)
    private static void initSurfaceControl(WallpaperService.Engine engine, SurfaceControl surfaceControl) {
        try {
            Class<?> cls = ReflectionHelper.getClass("android.view.IWindowSession");
            Class<?> cls2 = ReflectionHelper.getClass("android.view.IWindow");
            Class<?> cls3 = ReflectionHelper.getClass("com.android.internal.view.BaseIWindow");
            Class<?> cls4 = ReflectionHelper.getClass("android.view.DisplayCutout$ParcelableWrapper");
            Class<?> cls5 = ReflectionHelper.getClass("android.view.InsetsState");
            Class<?> cls6 = ReflectionHelper.getClass("android.util.MergedConfiguration");
            Object fieldValue = ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mSession");
            Object fieldValue2 = ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mWindow");
            Object fieldValue3 = ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mDisplayCutout");
            Object fieldValue4 = ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mInsetsState");
            Object fieldValue5 = ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mMergedConfiguration");
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mLayout");
            int iIntValue = ((Integer) ReflectionHelper.getFieldValue(cls3, fieldValue2, "mSeq")).intValue();
            int iIntValue2 = ((Integer) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mWidth")).intValue();
            int iIntValue3 = ((Integer) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mHeight")).intValue();
            Rect rect = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mVisibleInsets");
            Rect rect2 = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mWinFrame");
            Rect rect3 = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mOverscanInsets");
            Rect rect4 = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mContentInsets");
            Rect rect5 = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mStableInsets");
            Rect rect6 = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mOutsets");
            Rect rect7 = (Rect) ReflectionHelper.getFieldValue(WallpaperService.Engine.class, engine, "mBackdropFrame");
            if (fieldValue != null) {
                Class cls7 = Integer.TYPE;
                ReflectionHelper.invokeObject(cls, fieldValue, "relayout", new Class[]{cls2, cls7, WindowManager.LayoutParams.class, cls7, cls7, cls7, cls7, Long.TYPE, Rect.class, Rect.class, Rect.class, Rect.class, Rect.class, Rect.class, Rect.class, cls4, cls6, SurfaceControl.class, cls5}, fieldValue2, Integer.valueOf(iIntValue), layoutParams, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), 0, 0, -1, rect2, rect3, rect4, rect, rect5, rect6, rect7, fieldValue3, fieldValue5, surfaceControl, fieldValue4);
            }
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | initSurfaceControl() occur EXCEPTION: ", e2);
        }
    }

    public static boolean isShowDebugLayout() {
        try {
            return Build.VERSION.SDK_INT >= 29 ? ((Boolean) ((Optional) ReflectionHelper.invokeObject(ReflectionHelper.getClass("android.sysprop.DisplayProperties"), null, "debug_layout", new Class[0], new Object[0])).orElse(Boolean.FALSE)).booleanValue() : SystemProperties.getBoolean(DEBUG_LAYOUT_PROPERTY, false);
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | isShowDebugLayout() occur EXCEPTION: ", e2);
            return false;
        }
    }

    public static void setWifiApEnabled(Context context, boolean z2) {
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                Class<?> cls = ReflectionHelper.getClass("android.net.ConnectivityManager$OnStartTetheringCallback");
                if (z2) {
                    ReflectionHelper.invoke(ConnectivityManager.class, connectivityManager, "startTethering", new Class[]{Integer.TYPE, Boolean.TYPE, cls}, 0, Boolean.TRUE, null);
                } else {
                    ReflectionHelper.invoke(ConnectivityManager.class, connectivityManager, "stopTethering", new Class[]{Integer.TYPE}, 0);
                }
            } else {
                ReflectionHelper.invokeObject(WifiManager.class, (WifiManager) context.getSystemService("wifi"), "setWifiApEnabled", new Class[]{WifiConfiguration.class, Boolean.TYPE}, null, Boolean.valueOf(z2));
            }
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "Invoke | setWifiApEnabled() occur EXCEPTION: ", e2);
        }
    }
}
