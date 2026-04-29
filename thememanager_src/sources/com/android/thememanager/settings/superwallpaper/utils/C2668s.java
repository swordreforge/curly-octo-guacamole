package com.android.thememanager.settings.superwallpaper.utils;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.wallpaper.IWallpaperConnection;
import android.service.wallpaper.IWallpaperService;
import android.util.Log;
import com.android.thememanager.basemodule.utils.y9n;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.s */
/* JADX INFO: compiled from: PortableUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2668s {
    /* JADX INFO: renamed from: k */
    public static void m9299k(IWallpaperService service, IWallpaperConnection connection, IBinder windowToken, int windowType, boolean isPreview, int reqWidth, int reqHeight) throws RemoteException {
        try {
            if (y9n.m7253q()) {
                Class<?> cls = service.getClass();
                Class cls2 = Integer.TYPE;
                bek6.toq.kja0(cls, service, "attach", new Class[]{IWallpaperConnection.class, IBinder.class, cls2, Boolean.TYPE, cls2, cls2, Rect.class, cls2, cls2, WallpaperInfo.class}, connection, windowToken, Integer.valueOf(windowType), Boolean.valueOf(isPreview), Integer.valueOf(reqWidth), Integer.valueOf(reqHeight), new Rect(), 0, 1, null);
            } else if (y9n.zy()) {
                Class<?> cls3 = service.getClass();
                Class cls4 = Integer.TYPE;
                bek6.toq.kja0(cls3, service, "attach", new Class[]{IWallpaperConnection.class, IBinder.class, cls4, Boolean.TYPE, cls4, cls4, Rect.class, cls4, cls4}, connection, windowToken, Integer.valueOf(windowType), Boolean.valueOf(isPreview), Integer.valueOf(reqWidth), Integer.valueOf(reqHeight), new Rect(), 0, 1);
            } else if (Build.VERSION.SDK_INT > 28) {
                Class<?> cls5 = service.getClass();
                Class cls6 = Integer.TYPE;
                bek6.toq.kja0(cls5, service, "attach", new Class[]{IWallpaperConnection.class, IBinder.class, cls6, Boolean.TYPE, cls6, cls6, Rect.class, cls6}, connection, windowToken, Integer.valueOf(windowType), Boolean.valueOf(isPreview), Integer.valueOf(reqWidth), Integer.valueOf(reqHeight), new Rect(), 0);
            } else {
                Class<?> cls7 = service.getClass();
                Class cls8 = Integer.TYPE;
                bek6.toq.kja0(cls7, service, "attach", new Class[]{IWallpaperConnection.class, IBinder.class, cls8, Boolean.TYPE, cls8, cls8, Rect.class}, connection, windowToken, Integer.valueOf(windowType), Boolean.valueOf(isPreview), Integer.valueOf(reqWidth), Integer.valueOf(reqHeight), new Rect());
            }
        } catch (Exception e2) {
            Log.e("PortableUtils", "Invoke | attachWallpaperService() occur EXCEPTION: ", e2);
        }
    }

    public static boolean toq(String packagePath) {
        try {
            return ((Boolean) bek6.toq.cdj(bek6.toq.m5805n("miui.maml.MamlConfigSettings"), null, "containsConfig", new Class[]{String.class}, packagePath)).booleanValue();
        } catch (Exception e2) {
            Log.e("PortableUtils", "Invoke | containsConfig() occur EXCEPTION: ", e2);
            return false;
        }
    }

    public static IBinder zy(Activity activity) {
        try {
            return (IBinder) bek6.toq.cdj(activity.getClass(), activity, "getActivityToken", new Class[]{bek6.toq.m5805n("android.os.IBinder")}, new Object[0]);
        } catch (Exception e2) {
            Log.e("PortableUtils", "Invoke | getActivityToken() occur EXCEPTION: ", e2);
            return null;
        }
    }
}
