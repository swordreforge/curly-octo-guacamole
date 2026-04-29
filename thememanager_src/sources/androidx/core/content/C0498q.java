package androidx.core.content;

import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.core.content.res.C0506s;
import androidx.core.os.C0579g;
import androidx.core.util.C0642s;
import com.android.thememanager.clockmessage.model.C1873k;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.google.android.exoplayer2.util.wvg;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Executor;
import zy.InterfaceC7830i;
import zy.dd;
import zy.fn3e;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.content.q */
/* JADX INFO: compiled from: ContextCompat.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class C0498q {

    /* JADX INFO: renamed from: k */
    private static final String f3473k = "ContextCompat";

    /* JADX INFO: renamed from: q */
    private static TypedValue f3474q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Object f50389toq = new Object();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Object f50390zy = new Object();

    /* JADX INFO: renamed from: androidx.core.content.q$f7l8 */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(28)
    static class f7l8 {
        private f7l8() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Executor m2261k(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$g */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(26)
    static class g {
        private g() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static ComponentName m2262k(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$k */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(16)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m2263k(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @InterfaceC7830i
        static void toq(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$n */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(24)
    static class n {
        private n() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static Context m2264k(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        @InterfaceC7830i
        static File toq(Context context) {
            return context.getDataDir();
        }

        @InterfaceC7830i
        static boolean zy(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$q */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(23)
    static class q {
        private q() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m2265k(Context context, int i2) {
            return context.getColor(i2);
        }

        @InterfaceC7830i
        static <T> T toq(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @InterfaceC7830i
        static String zy(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$s */
    /* JADX INFO: compiled from: ContextCompat.java */
    private static final class s {

        /* JADX INFO: renamed from: k */
        static final HashMap<Class<?>, String> f3475k;

        static {
            HashMap<Class<?>, String> map = new HashMap<>();
            f3475k = map;
            map.put(SubscriptionManager.class, "telephony_subscription_service");
            map.put(UsageStatsManager.class, "usagestats");
            map.put(AppWidgetManager.class, "appwidget");
            map.put(BatteryManager.class, "batterymanager");
            map.put(CameraManager.class, "camera");
            map.put(JobScheduler.class, "jobscheduler");
            map.put(LauncherApps.class, "launcherapps");
            map.put(MediaProjectionManager.class, "media_projection");
            map.put(MediaSessionManager.class, "media_session");
            map.put(RestrictionsManager.class, "restrictions");
            map.put(TelecomManager.class, "telecom");
            map.put(TvInputManager.class, "tv_input");
            map.put(AppOpsManager.class, "appops");
            map.put(CaptioningManager.class, "captioning");
            map.put(ConsumerIrManager.class, "consumer_ir");
            map.put(PrintManager.class, "print");
            map.put(BluetoothManager.class, "bluetooth");
            map.put(DisplayManager.class, "display");
            map.put(UserManager.class, "user");
            map.put(InputManager.class, "input");
            map.put(MediaRouter.class, "media_router");
            map.put(NsdManager.class, "servicediscovery");
            map.put(AccessibilityManager.class, "accessibility");
            map.put(AccountManager.class, "account");
            map.put(ActivityManager.class, C1873k.f10652g);
            map.put(AlarmManager.class, "alarm");
            map.put(AudioManager.class, wvg.f67137toq);
            map.put(ClipboardManager.class, "clipboard");
            map.put(ConnectivityManager.class, "connectivity");
            map.put(DevicePolicyManager.class, "device_policy");
            map.put(DownloadManager.class, "download");
            map.put(DropBoxManager.class, "dropbox");
            map.put(InputMethodManager.class, "input_method");
            map.put(KeyguardManager.class, "keyguard");
            map.put(LayoutInflater.class, "layout_inflater");
            map.put(LocationManager.class, "location");
            map.put(NfcManager.class, "nfc");
            map.put(NotificationManager.class, com.android.thememanager.basemodule.analysis.toq.mle);
            map.put(PowerManager.class, "power");
            map.put(SearchManager.class, C2656k.f15718s);
            map.put(SensorManager.class, "sensor");
            map.put(StorageManager.class, "storage");
            map.put(TelephonyManager.class, "phone");
            map.put(TextServicesManager.class, "textservices");
            map.put(UiModeManager.class, "uimode");
            map.put(UsbManager.class, "usb");
            map.put(Vibrator.class, "vibrator");
            map.put(WallpaperManager.class, "wallpaper");
            map.put(WifiP2pManager.class, "wifip2p");
            map.put(WifiManager.class, "wifi");
            map.put(WindowManager.class, "window");
        }

        private s() {
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$toq */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(19)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static File[] m2266k(Context context) {
            return context.getExternalCacheDirs();
        }

        @InterfaceC7830i
        static File[] toq(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @InterfaceC7830i
        static File[] zy(Context context) {
            return context.getObbDirs();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$y */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(30)
    static class y {
        private y() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static String m2267k(Context context) {
            return context.getAttributionTag();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.q$zy */
    /* JADX INFO: compiled from: ContextCompat.java */
    @hyr(21)
    static class zy {
        private zy() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static File m2268k(Context context) {
            return context.getCodeCacheDir();
        }

        @InterfaceC7830i
        static Drawable toq(Context context, int i2) {
            return context.getDrawable(i2);
        }

        @InterfaceC7830i
        static File zy(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    protected C0498q() {
    }

    public static boolean cdj(@lvui Context context) {
        return n.zy(context);
    }

    @dd
    public static ColorStateList f7l8(@lvui Context context, @zy.n7h int i2) {
        return C0506s.m2327g(context.getResources(), i2, context.getTheme());
    }

    public static void fn3e(@lvui Context context, @lvui Intent intent) {
        g.m2262k(context, intent);
    }

    @zy.x2
    /* JADX INFO: renamed from: g */
    public static int m2252g(@lvui Context context, @zy.n7h int i2) {
        return q.m2265k(context, i2);
    }

    @dd
    /* JADX INFO: renamed from: h */
    public static String m2253h(@lvui Context context, @lvui Class<?> cls) {
        return q.zy(context, cls);
    }

    /* JADX INFO: renamed from: i */
    public static void m2254i(@lvui Context context, @lvui Intent intent, @dd Bundle bundle) {
        k.toq(context, intent, bundle);
    }

    /* JADX INFO: renamed from: k */
    public static int m2255k(@lvui Context context, @lvui String str) {
        C0642s.m2986n(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }

    public static boolean ki(@lvui Context context, @lvui Intent[] intentArr) {
        return t8r(context, intentArr, null);
    }

    @dd
    public static <T> T kja0(@lvui Context context, @lvui Class<T> cls) {
        return (T) q.toq(context, cls);
    }

    @lvui
    public static File[] ld6(@lvui Context context, @dd String str) {
        return toq.toq(context, str);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public static File m2256n(@lvui Context context) {
        return zy.m2268k(context);
    }

    @lvui
    public static File[] n7h(@lvui Context context) {
        return toq.zy(context);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public static File[] m2257p(@lvui Context context) {
        return toq.m2266k(context);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static String m2258q(@lvui Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return y.m2267k(context);
        }
        return null;
    }

    @dd
    public static File qrj(@lvui Context context) {
        return zy.zy(context);
    }

    @dd
    /* JADX INFO: renamed from: s */
    public static Drawable m2259s(@lvui Context context, @fn3e int i2) {
        return zy.toq(context, i2);
    }

    public static boolean t8r(@lvui Context context, @lvui Intent[] intentArr, @dd Bundle bundle) {
        k.m2263k(context, intentArr, bundle);
        return true;
    }

    @dd
    public static Context toq(@lvui Context context) {
        return n.m2264k(context);
    }

    @lvui
    public static Executor x2(@lvui Context context) {
        return Build.VERSION.SDK_INT >= 28 ? f7l8.m2261k(context) : C0579g.m2721k(new Handler(context.getMainLooper()));
    }

    @dd
    /* JADX INFO: renamed from: y */
    public static File m2260y(@lvui Context context) {
        return n.toq(context);
    }

    private static File zy(File file) {
        synchronized (f50390zy) {
            if (!file.exists()) {
                if (file.mkdirs()) {
                    return file;
                }
                Log.w(f3473k, "Unable to create files subdir " + file.getPath());
            }
            return file;
        }
    }
}
