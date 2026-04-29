package com.miui.miwallpaper;

import android.annotation.SuppressLint;
import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.os.UserHandle;
import android.provider.Settings;
import android.util.Log;
import android.view.SurfaceControl;
import android.view.WindowManager;
import android.widget.RemoteViews;
import com.android.thememanager.util.x9kr;
import com.miui.miwallpaper.IMiuiWallpaperManagerService;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.function.Function;
import miui.os.Build;
import zy.dd;
import zy.hyr;
import zy.lrht;

/* JADX INFO: renamed from: com.miui.miwallpaper.p */
/* JADX INFO: compiled from: MiuiWallpaperManager.java */
/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi, NewApi, MissingPermission"})
public class C5306p {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C5306p f29671a = null;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f72377a9 = "maml";

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    private static final String f72378a98o = "#80000000";

    /* JADX INFO: renamed from: b */
    public static final String f29672b = "none";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    public static final int f72379bf2 = 1;

    /* JADX INFO: renamed from: c */
    public static final String f29673c = "content";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f72380cdj = 0;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final int f72381d2ok = 2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final float f72382d3 = 1.0f;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f72383dd = 0;

    /* JADX INFO: renamed from: e */
    public static final String f29674e = "support_dark";

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final String f72384ek5k = "clock_type_info";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f72385eqxt = 1;

    /* JADX INFO: renamed from: f */
    public static final int f29675f = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f72386fn3e = 8;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f72387fti = "live_picker";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f72388fu4 = "default";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f72389gvn7 = "super_save_power";

    /* JADX INFO: renamed from: h */
    public static final boolean f29676h;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final String f72390hb = "pending_package";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int[] f72391hyr;

    /* JADX INFO: renamed from: i */
    public static final int f29677i = 4;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final int f72392i1 = 0;

    /* JADX INFO: renamed from: j */
    public static final String f29678j = "enable_blur";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f72393jk = "gallery";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f72394jp0y = "super_wallpaper";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f72395ki = 1;

    /* JADX INFO: renamed from: l */
    public static final int f29679l = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f72397ld6 = "com.miui.miwallpaper.wallpaperservice.ImageWallpaper";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final String f72398lrht = "loop_video";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f72399lvui = 3;

    /* JADX INFO: renamed from: m */
    public static final String f29680m = "clock_style_type";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f72400mcp = "sensor";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final int f72401n5r1 = 10000;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f72403ncyb = 0;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final float f72404ni7 = 2.0f;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final String f72405nn86 = "effect_id";

    /* JADX INFO: renamed from: o */
    public static final String f29681o = "support_matting";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f72406o1t = "dark";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f72407oc = 0;

    /* JADX INFO: renamed from: p */
    public static final String f29682p = "com.miui.miwallpaper";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f72408qrj = "android.service.wallpaper.WallPaperControllerService";

    /* JADX INFO: renamed from: r */
    public static final int f29683r = 4;

    /* JADX INFO: renamed from: s */
    public static final String f29684s = "MiuiWallpaperManager";

    /* JADX INFO: renamed from: t */
    public static final String f29685t = "video_gallery";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f72409t8r = 2;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final String f72410uv6 = "carousel";

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final String f72411vyq = "video_path";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f72412wvg = "video";

    /* JADX INFO: renamed from: x */
    private static CountDownLatch f29686x = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f72413x2 = "com.miui.miwallpaper.MiWallpaper";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f72414x9kr = 0;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final String f72415y9n = "origin_bitmap_height";

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final String f72416yz = "origin_bitmap_width";

    /* JADX INFO: renamed from: z */
    public static final String f29687z = "image";

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    private static final Executor f72417zp;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f72418zurt;

    /* JADX INFO: renamed from: k */
    private final Context f29689k;

    /* JADX INFO: renamed from: q */
    private IBinder.DeathRecipient f29691q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f72420toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private volatile IMiuiWallpaperManagerService f72421zy;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final ComponentName f72402n7h = new ComponentName("com.miui.miwallpaper", "com.miui.miwallpaper.wallpaperservice.ImageWallpaper");

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final ComponentName f72396kja0 = new ComponentName("com.miui.miwallpaper", "com.miui.miwallpaper.MiWallpaper");

    /* JADX INFO: renamed from: n */
    private final ServiceConnection f29690n = new k();

    /* JADX INFO: renamed from: g */
    private final BroadcastReceiver f29688g = new toq();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private HashSet<zy> f72419f7l8 = new HashSet<>();

    /* JADX INFO: renamed from: y */
    private final HashMap<IMiuiWallpaperManagerCallback, Integer> f29692y = new HashMap<>();

    /* JADX INFO: renamed from: com.miui.miwallpaper.p$g */
    /* JADX INFO: compiled from: MiuiWallpaperManager.java */
    public static class g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private Object f72423f7l8;

        /* JADX INFO: renamed from: g */
        private Object f29693g;

        /* JADX INFO: renamed from: k */
        private final C5306p f29696k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private String f72427ld6;

        /* JADX INFO: renamed from: n */
        private Object f29697n;

        /* JADX INFO: renamed from: p */
        private String f29698p;

        /* JADX INFO: renamed from: q */
        private String f29699q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private boolean f72429qrj;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f72431toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f72432x2;

        /* JADX INFO: renamed from: y */
        private Object f29701y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f72433zy = true;

        /* JADX INFO: renamed from: s */
        private ComponentName f29700s = C5306p.f72402n7h;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private boolean f72428n7h = true;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private int f72426kja0 = -1;

        /* JADX INFO: renamed from: h */
        private int[] f29694h = C5306p.f72391hyr;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private int f72422cdj = -1;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private boolean f72425ki = false;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private boolean f72430t8r = true;

        /* JADX INFO: renamed from: i */
        private int f29695i = 0;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private int f72424fn3e = 0;

        public g(C5306p c5306p) {
            this.f29696k = c5306p;
        }

        public g cdj(boolean z2) {
            this.f72430t8r = z2;
            return this;
        }

        public g f7l8(Object obj, boolean z2, String str) {
            this.f29699q = "gallery";
            this.f29697n = obj;
            this.f72428n7h = z2;
            this.f72427ld6 = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public g m18067g(boolean z2) {
            this.f72422cdj = z2 ? 1 : 0;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public g m18068h(Object obj, String str, String str2, boolean z2, boolean z3) {
            this.f29699q = C5306p.f29685t;
            this.f29697n = obj;
            this.f29698p = str;
            this.f72427ld6 = str2;
            this.f72429qrj = z2;
            this.f72428n7h = z3;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public boolean m18069k() {
            if (!this.f72430t8r) {
                return this.f29696k.cdj(this.f72431toq, this.f72426kja0, this.f72422cdj, this.f72425ki);
            }
            if ("super_wallpaper".equals(this.f29699q)) {
                return this.f29696k.fnq8(1, "super_wallpaper", this.f29697n, this.f29693g, this.f29700s, this.f29698p, this.f72427ld6, this.f72429qrj, this.f72428n7h, this.f72433zy, this.f72426kja0, this.f72422cdj, this.f72425ki, this.f72432x2, this.f29694h, this.f29695i, this.f72424fn3e) && this.f29696k.fnq8(2, "super_wallpaper", this.f72423f7l8, this.f29701y, this.f29700s, this.f29698p, this.f72427ld6, this.f72429qrj, this.f72428n7h, this.f72433zy, this.f72426kja0, this.f72422cdj, this.f72425ki, this.f72432x2, this.f29694h, this.f29695i, this.f72424fn3e);
            }
            return this.f29696k.fnq8(this.f72431toq, this.f29699q, this.f29697n, this.f29693g, this.f29700s, this.f29698p, this.f72427ld6, this.f72429qrj, this.f72428n7h, this.f72433zy, this.f72426kja0, this.f72422cdj, this.f72425ki, this.f72432x2, this.f29694h, this.f29695i, this.f72424fn3e);
        }

        public g ki(String str) {
            this.f29699q = str;
            return this;
        }

        public g kja0(Object obj, String str, boolean z2) {
            this.f29699q = "video";
            this.f29698p = str;
            this.f72429qrj = z2;
            this.f29697n = obj;
            return this;
        }

        public g ld6(int i2, int i3) {
            this.f29695i = i2;
            this.f72424fn3e = i3;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public g m18070n(int i2) {
            this.f72426kja0 = i2;
            return this;
        }

        public g n7h(boolean z2) {
            this.f72425ki = z2;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public g m18071p(Object obj, Object obj2, String str) {
            this.f29699q = "sensor";
            this.f29697n = obj;
            this.f29693g = obj2;
            this.f29698p = str;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public g m18072q(Object obj, Object obj2) {
            this.f29699q = C5306p.f72406o1t;
            this.f29697n = obj;
            this.f29693g = obj2;
            return this;
        }

        public g qrj(boolean z2) {
            this.f72433zy = z2;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public g m18073s(Object obj, Object obj2) {
            this.f29699q = "maml";
            this.f29700s = C5306p.f72396kja0;
            this.f29697n = obj;
            this.f29693g = obj2;
            return this;
        }

        public g t8r(int i2) {
            this.f72431toq = i2;
            return this;
        }

        public g toq(String str) {
            this.f72432x2 = str;
            return this;
        }

        public g x2(ComponentName componentName, Object obj, Object obj2, Object obj3, Object obj4) {
            this.f29699q = "super_wallpaper";
            this.f29700s = componentName;
            this.f29697n = obj;
            this.f29693g = obj2;
            this.f72423f7l8 = obj3;
            this.f29701y = obj4;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public g m18074y(Object obj) {
            this.f29699q = "image";
            this.f29697n = obj;
            return this;
        }

        public g zy(int[] iArr) {
            this.f29694h = iArr;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.p$k */
    /* JADX INFO: compiled from: MiuiWallpaperManager.java */
    class k implements ServiceConnection {
        k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.i(C5306p.f29684s, "onServiceConnected::componentName = " + componentName + ", instance = " + C5306p.f29671a + " size: " + C5306p.this.f72419f7l8.size());
            C5306p.this.f72421zy = IMiuiWallpaperManagerService.Stub.asInterface(iBinder);
            C5306p.this.g1();
            Iterator it = C5306p.this.f72419f7l8.iterator();
            while (it.hasNext()) {
                zy zyVar = (zy) it.next();
                if (zyVar != null) {
                    zyVar.mo10489k(C5306p.f29671a);
                }
                it.remove();
            }
            try {
                C5306p c5306p = C5306p.this;
                c5306p.f29691q = new q(iBinder, c5306p);
                iBinder.linkToDeath(C5306p.this.f29691q, 0);
            } catch (Throwable th) {
                Log.e(C5306p.f29684s, "linkToDeath fail : ", th);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.p$n */
    /* JADX INFO: compiled from: MiuiWallpaperManager.java */
    public static class n implements zy {

        /* JADX INFO: renamed from: k */
        private zy f29703k;

        public n(zy zyVar) {
            this.f29703k = zyVar;
        }

        @Override // com.miui.miwallpaper.C5306p.zy
        /* JADX INFO: renamed from: k */
        public void mo10489k(C5306p c5306p) {
            zy zyVar = this.f29703k;
            if (zyVar != null) {
                zyVar.mo10489k(c5306p);
            }
            C5306p.f29686x.countDown();
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.p$q */
    /* JADX INFO: compiled from: MiuiWallpaperManager.java */
    private static class q implements IBinder.DeathRecipient {

        /* JADX INFO: renamed from: k */
        private IBinder f29704k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private C5306p f72434toq;

        public q(IBinder iBinder, C5306p c5306p) {
            this.f29704k = iBinder;
            this.f72434toq = c5306p;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            Log.i(C5306p.f29684s, "linkToDeath:MiuiWallpaperManagerService died, try rebind...");
            this.f29704k.unlinkToDeath(this, 0);
            this.f72434toq.qrj();
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.p$toq */
    /* JADX INFO: compiled from: MiuiWallpaperManager.java */
    class toq extends BroadcastReceiver {
        toq() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Uri data = intent.getData();
            if (!"android.intent.action.PACKAGE_ADDED".equals(action) || data == null) {
                return;
            }
            String schemeSpecificPart = data.getSchemeSpecificPart();
            if ("com.miui.miwallpaper".equals(schemeSpecificPart)) {
                Log.i(C5306p.f29684s, "package update: action = " + action + " packageName = " + schemeSpecificPart);
                C5306p.this.qrj();
            }
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.p$zy */
    /* JADX INFO: compiled from: MiuiWallpaperManager.java */
    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo10489k(C5306p c5306p);
    }

    static {
        boolean zM18043e = m18043e();
        f29676h = zM18043e;
        f72418zurt = zM18043e ? 15 : 3;
        f72391hyr = new int[]{-1, -1};
        f72417zp = Executors.newSingleThreadExecutor();
        f29686x = new CountDownLatch(1);
    }

    private C5306p(Context context, boolean z2) {
        this.f72420toq = false;
        this.f29689k = context;
        this.f72420toq = z2;
    }

    /* JADX INFO: renamed from: b */
    private void m18042b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        this.f29689k.registerReceiver(this.f29688g, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean cdj(int i2, int i3, int i4, boolean z2) {
        if (!m18046j()) {
            return false;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(f72405nn86, i3);
            if (i4 != -1) {
                bundle.putInt(f29678j, i4);
            }
            bundle.putBoolean(f29681o, z2);
            this.f72421zy.changeMiuiWallpaperInfo(i2, bundle);
            return true;
        } catch (Throwable th) {
            Log.e(f29684s, "changeMiuiWallpaperEffectType: fail", th);
            return false;
        }
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: e */
    private static boolean m18043e() {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(cls, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th) {
            Log.e(f29684s, "isFoldDevices fail : ", th);
            return false;
        }
    }

    private boolean ek5k(int i2, String str, Object obj, Object obj2, String str2, String str3) {
        boolean zYz;
        zYz = yz(i2);
        str.hashCode();
        switch (str) {
            case "sensor":
                if ((obj == null && obj2 == null) || str2 == null) {
                    zYz = false;
                    break;
                }
                break;
            case "gallery":
                if (obj == null || str3 == null) {
                    zYz = false;
                    break;
                }
                break;
            case "dark":
            case "super_wallpaper":
                if (obj == null || obj2 == null) {
                    zYz = false;
                    break;
                }
                break;
            case "maml":
            case "image":
                if (obj == null) {
                    zYz = false;
                    break;
                }
                break;
            case "video":
            case "video_gallery":
                if (obj == null || str2 == null) {
                    zYz = false;
                    break;
                }
                break;
            default:
                zYz = false;
                break;
        }
        if (!zYz) {
            Log.e(f29684s, "set wallpaper param error: which = " + i2 + " type = " + str + " source1 = " + obj + " source2 = " + obj2 + " videoPath = " + str2 + " content = " + str3);
        }
        return zYz;
    }

    private void etdu(Map<Integer, List<String>> map, int i2, String str, Object obj) {
        List<String> list = map.get(Integer.valueOf(i2));
        if (list == null || str == null || list.size() < 2) {
            return;
        }
        C5273g.m17861q(str, list.get(0));
        if (obj instanceof Bitmap) {
            C5273g.kja0((Bitmap) obj, list.get(1));
        } else if (obj instanceof InputStream) {
            C5273g.m17859n((InputStream) obj, list.get(1));
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m18044f(int i2) {
        int i3 = i2 == 4 ? 1 : i2;
        if (i2 == 8) {
            return 2;
        }
        return i3;
    }

    @hyr(api = 24)
    public static void fn3e(Function<Integer, Integer> function, int i2) {
        int i3 = 1;
        while (i2 != 0) {
            if ((i3 & i2) != 0) {
                function.apply(Integer.valueOf(i3));
                i2 ^= i3;
            }
            i3 <<= 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0 A[Catch: all -> 0x0128, TryCatch #0 {all -> 0x0128, blocks: (B:8:0x001e, B:10:0x002d, B:21:0x00e0, B:23:0x00f0, B:25:0x00f8, B:29:0x0103, B:31:0x010f, B:30:0x0107, B:12:0x0045, B:14:0x004f, B:15:0x0066, B:17:0x00bf, B:18:0x00c4), top: B:37:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean fnq8(int r13, final java.lang.String r14, final java.lang.Object r15, java.lang.Object r16, android.content.ComponentName r17, final java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, int r23, int r24, boolean r25, java.lang.String r26, int[] r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.miwallpaper.C5306p.fnq8(int, java.lang.String, java.lang.Object, java.lang.Object, android.content.ComponentName, java.lang.String, java.lang.String, boolean, boolean, boolean, int, int, boolean, java.lang.String, int[], int, int):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        synchronized (this.f29692y) {
            if (this.f29692y.isEmpty()) {
                return;
            }
            for (Map.Entry<IMiuiWallpaperManagerCallback, Integer> entry : this.f29692y.entrySet()) {
                IMiuiWallpaperManagerCallback key = entry.getKey();
                Integer value = entry.getValue();
                if (value != null) {
                    bf2(key, value.intValue());
                }
            }
        }
    }

    private void gbni() {
        if (m18046j()) {
            Log.e(f29684s, "unBindService...");
            try {
                if (this.f29691q != null) {
                    this.f72421zy.asBinder().unlinkToDeath(this.f29691q, 0);
                }
            } catch (Exception e2) {
                Log.e(f29684s, "unLinkFailed", e2);
            }
            this.f29689k.unregisterReceiver(this.f29688g);
            this.f29689k.unbindService(this.f29690n);
        }
    }

    /* JADX INFO: renamed from: j */
    private boolean m18046j() {
        if (this.f72421zy != null) {
            return true;
        }
        Log.e(f29684s, "mService is null.");
        return false;
    }

    public static void lrht(Context context, zy zyVar) {
        if (f29671a != null) {
            if (f29671a.f72421zy != null) {
                zyVar.mo10489k(f29671a);
                return;
            }
            return;
        }
        synchronized (C5306p.class) {
            if (f29671a == null) {
                Log.i(f29684s, "init...");
                f29671a = new C5306p(context, false);
                f29671a.m18042b();
                f29671a.f72419f7l8.add(zyVar);
                f29671a.qrj();
            } else if (f29671a.f72421zy != null) {
                zyVar.mo10489k(f29671a);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m18048m(int i2) {
        boolean z2 = !((i2 & 1) == 0 && (i2 & 2) == 0) && (i2 & 4) == 0 && (i2 & 8) == 0;
        if (!z2) {
            Log.e(f29684s, "isSystemWhich: which = " + i2);
        }
        return z2;
    }

    private void m4(Map<Integer, List<String>> map, int i2, List<Object> list) {
        List<String> list2 = map.get(Integer.valueOf(i2));
        if (list2 == null || list == null || list.size() != list2.size()) {
            return;
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Object obj = list.get(i3);
            if (obj instanceof Bitmap) {
                C5273g.kja0((Bitmap) obj, list2.get(i3));
            } else if (obj instanceof InputStream) {
                C5273g.m17859n((InputStream) obj, list2.get(i3));
            }
        }
    }

    private void n7h(UserHandle userHandle) {
        Intent intent = new Intent(f72408qrj);
        intent.setPackage("com.miui.miwallpaper");
        try {
            this.f29689k.bindServiceAsUser(intent, this.f29690n, 1, userHandle);
        } catch (Throwable th) {
            Log.e(f29684s, "bindServiceAsUser fail", th);
        }
    }

    private int ni7(int i2) {
        int iM18054t;
        int color = Color.parseColor(f72378a98o);
        Bitmap bitmapLvui = lvui(i2);
        return (bitmapLvui == null || (iM18054t = m18054t(bitmapLvui)) == -1) ? color : x2(iM18054t, color);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m18050o(int i2) {
        boolean z2 = i2 == 1 || i2 == 2;
        if (f29676h) {
            z2 = z2 || i2 == 4 || i2 == 8;
        }
        if (!z2) {
            Log.e(f29684s, "is not single which: which = " + i2);
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj() {
        Intent intent = new Intent(f72408qrj);
        intent.setPackage("com.miui.miwallpaper");
        if (this.f72420toq) {
            this.f29689k.bindService(intent, 1, f72417zp, this.f29690n);
        } else {
            this.f29689k.bindService(intent, this.f29690n, 1);
        }
    }

    private static void r8s8() {
        try {
            f29686x.await();
        } catch (InterruptedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: t */
    private static int m18054t(Bitmap bitmap) {
        if (bitmap == null) {
            return -1;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            matrix.setScale(1.0f / width, 1.0f / height, width / 2, height / 2);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
            int pixel = bitmapCreateBitmap == null ? -1 : bitmapCreateBitmap.getPixel(0, 0);
            com.miui.miwallpaper.toq.m18076k(bitmapCreateBitmap);
            System.gc();
            return pixel;
        } catch (Throwable th) {
            Log.e(f29684s, "getFastBlurColor fail : ", th);
            return -1;
        }
    }

    public static int t8r(Bitmap bitmap) {
        int iM18054t;
        int color = Color.parseColor(f72378a98o);
        return (bitmap == null || (iM18054t = m18054t(bitmap)) == -1) ? color : x2(iM18054t, color);
    }

    @lrht(anyOf = {"android.permission.INTERACT_ACROSS_USERS", "android.permission.INTERACT_ACROSS_USERS_FULL"})
    @hyr(api = 30)
    public static void uv6(Context context, zy zyVar, UserHandle userHandle) {
        if (f29671a != null) {
            if (f29671a.f72421zy != null) {
                zyVar.mo10489k(f29671a);
                return;
            }
            return;
        }
        synchronized (C5306p.class) {
            if (f29671a == null) {
                Log.i(f29684s, "initForUser...");
                f29671a = new C5306p(context, false);
                f29671a.m18042b();
                f29671a.f72419f7l8.add(zyVar);
                f29671a.n7h(userHandle);
            } else if (f29671a.f72421zy != null) {
                zyVar.mo10489k(f29671a);
            }
        }
    }

    private void v0af(Map<Integer, List<String>> map, int i2, String str, List<Object> list) {
        List<String> list2 = map.get(Integer.valueOf(i2));
        if (list2 == null || str == null || list2.size() < 2) {
            return;
        }
        C5273g.m17861q(str, list2.get(0));
        Object obj = list.size() > 1 ? (i2 == 8 || i2 == 4) ? list.get(1) : list.get(0) : list.get(0);
        if (obj instanceof Bitmap) {
            C5273g.kja0((Bitmap) obj, list2.get(1));
        } else if (obj instanceof InputStream) {
            C5273g.m17859n((InputStream) obj, list2.get(1));
        }
    }

    public static C5306p vyq(Context context, zy zyVar) {
        n nVar = new n(zyVar);
        if (f29671a == null) {
            synchronized (C5306p.class) {
                if (f29671a == null) {
                    Log.i(f29684s, "initSync...");
                    f29671a = new C5306p(context, true);
                    f29671a.m18042b();
                    f29671a.f72419f7l8.add(nVar);
                    f29671a.qrj();
                    r8s8();
                } else if (f29671a.f72421zy != null) {
                    nVar.mo10489k(f29671a);
                } else {
                    f29671a.f72419f7l8.add(nVar);
                    r8s8();
                }
            }
        } else if (f29671a.f72421zy != null) {
            nVar.mo10489k(f29671a);
        } else {
            f29671a.f72419f7l8.add(nVar);
            r8s8();
        }
        return f29671a;
    }

    public static void wo() {
        if (f29671a != null) {
            f29671a.gbni();
            Log.e(f29684s, "staticDestroy, set sInstance null", new Exception());
            f29671a = null;
        }
    }

    private static int x2(int i2, int i3) {
        float fAlpha = Color.alpha(i2) / 255.0f;
        float fAlpha2 = Color.alpha(i3) / 255.0f;
        float f2 = (fAlpha + fAlpha2) - (fAlpha * fAlpha2);
        float f3 = 1.0f - fAlpha2;
        return Color.argb((int) (255.0f * f2), (int) ((((Color.red(i2) * fAlpha) * f3) + (Color.red(i3) * fAlpha2)) / f2), (int) ((((Color.green(i2) * fAlpha) * f3) + (Color.green(i3) * fAlpha2)) / f2), (int) ((((Color.blue(i2) * fAlpha) * f3) + (Color.blue(i3) * fAlpha2)) / f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer y9n(String str, Map map, String str2, Object obj, List list, Integer num) {
        str.hashCode();
        switch (str) {
            case "sensor":
                v0af(map, num.intValue(), str2, list);
                return num;
            case "video":
            case "video_gallery":
                etdu(map, num.intValue(), str2, obj);
                return num;
            default:
                m4(map, num.intValue(), list);
                return num;
        }
    }

    public static boolean yz(int i2) {
        boolean z2 = i2 > 0 && i2 <= f72418zurt;
        if (!z2) {
            Log.e(f29684s, "isValidWhich: which = " + i2);
        }
        return z2;
    }

    private int zurt(int i2) {
        if (m18046j() && m18050o(i2)) {
            try {
                return this.f72421zy.getWallpaperBlurColor(i2);
            } catch (Throwable th) {
                Log.e(f29684s, "getMiuiWallpaperColors fail : ", th);
            }
        }
        return Color.parseColor(f72378a98o);
    }

    /* JADX INFO: renamed from: a */
    public boolean m18056a(Bitmap bitmap, int i2, String str) {
        return new g(this).t8r(i2).f7l8(bitmap, true, str).m18069k();
    }

    @dd
    public String a9(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return null;
        }
        try {
            return this.f72421zy.getLastMiuiWallpaperType(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperType fail : ", th);
            return null;
        }
    }

    public boolean a98o(String str, InputStream inputStream, int i2, String str2, boolean z2, boolean z3) {
        return new g(this).t8r(i2).m18068h(inputStream, str, str2, z2, z3).m18069k();
    }

    public void bf2(IMiuiWallpaperManagerCallback iMiuiWallpaperManagerCallback, int i2) {
        if (m18046j() && yz(i2)) {
            try {
                synchronized (this.f29692y) {
                    this.f29692y.put(iMiuiWallpaperManagerCallback, Integer.valueOf(i2));
                }
                this.f72421zy.registerWallpaperChangeListener(iMiuiWallpaperManagerCallback, i2);
            } catch (Throwable th) {
                Log.e(f29684s, "registerWallpaperChangeListener fail : ", th);
            }
        }
    }

    public boolean bo(InputStream inputStream, InputStream inputStream2, int i2) {
        return new g(this).t8r(i2).m18073s(inputStream, inputStream2).m18069k();
    }

    /* JADX INFO: renamed from: c */
    public int m18057c(int i2) {
        return m18062r() <= 1.0f ? ni7(i2) : zurt(i2);
    }

    public boolean c8jq(InputStream inputStream, InputStream inputStream2, InputStream inputStream3, int i2) {
        return new g(this).t8r(i2).m18072q(inputStream2, inputStream3).m18069k();
    }

    public boolean ch(InputStream inputStream, int i2, String str, boolean z2) {
        return new g(this).t8r(i2).f7l8(inputStream, z2, str).m18069k();
    }

    /* JADX INFO: renamed from: d */
    public boolean m18058d(String str, Bitmap bitmap, int i2, boolean z2) {
        return new g(this).t8r(i2).kja0(bitmap, str, z2).m18069k();
    }

    @dd
    public String d2ok(String str, int i2, boolean z2, boolean z3) {
        if (!m18046j() || !m18050o(i2)) {
            return null;
        }
        try {
            return this.f72421zy.getMiuiWallpaperPath(str, i2, z2, z3);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperPath fail : ", th);
            return null;
        }
    }

    @dd
    public String[] d3(int i2) {
        String str = nn86(i2) ? "default" : f72406o1t;
        return new String[]{d2ok(str, i2, false, false), d2ok(str, i2, true, false)};
    }

    public boolean d8wk(int i2) {
        if (!m18046j()) {
            return false;
        }
        try {
            return this.f72421zy.supportDark(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "supportDark: fail", th);
            return false;
        }
    }

    public int dd() {
        if (!m18046j()) {
            return 0;
        }
        try {
            return this.f72421zy.getMiuiWallpaperSdkVersionCode();
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperSdkVersionCode: fail", th);
            return 0;
        }
    }

    public boolean dr(InputStream inputStream, int i2) {
        return new g(this).t8r(i2).m18074y(inputStream).m18069k();
    }

    public Map eqxt(int i2, boolean z2, Map<String, Rect> map) {
        if (!m18046j() || !m18050o(i2)) {
            return null;
        }
        try {
            return this.f72421zy.getMiuiWallpaperPalette(i2, z2, map);
        } catch (Exception e2) {
            Log.e(f29684s, "getMiuiWallpaperColors fail : ", e2);
            return null;
        }
    }

    public String fti() {
        if (!m18046j()) {
            return null;
        }
        try {
            if (m18062r() >= 1.3f) {
                return this.f72421zy.getMiuiDefaultWallpaperType(1);
            }
            Log.e(f29684s, "call method getMiuiDefaultWallpaperType fail,sdk version must >= 1.3");
            return null;
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiDefaultWallpaperType fail", th);
            return null;
        }
    }

    public Drawable fu4(Context context, int i2) {
        Bitmap bitmapMcp = mcp(context, i2);
        if (bitmapMcp == null) {
            return null;
        }
        if (!(Settings.System.getInt(context.getContentResolver(), x9kr.toq.f16901q, 1) == 1)) {
            return new BitmapDrawable(bitmapMcp);
        }
        if (!(Settings.System.getInt(context.getContentResolver(), "dark_mode_enable", 0) == 1)) {
            return new BitmapDrawable(bitmapMcp);
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapMcp);
        bitmapDrawable.setColorFilter(Color.parseColor("#B4B4B4"), PorterDuff.Mode.MULTIPLY);
        return bitmapDrawable;
    }

    @dd
    public WallpaperColors gvn7(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return null;
        }
        try {
            return this.f72421zy.getMiuiWallpaperColors(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperColors fail : ", th);
            return null;
        }
    }

    public boolean gyi(Bitmap bitmap, int i2) {
        return new g(this).t8r(i2).m18074y(bitmap).m18069k();
    }

    /* JADX INFO: renamed from: h */
    public boolean m18059h(int i2) {
        if (!m18046j()) {
            return false;
        }
        try {
            return this.f72421zy.blurState(i2);
        } catch (RemoteException e2) {
            Log.e(f29684s, "call method blurEnabled fail", e2);
            return false;
        }
    }

    public boolean hb(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return true;
        }
        try {
            return this.f72421zy.isMiuiWallpaperComponentUsing(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "isMiuiWallpaperComponentUsing: fail", th);
            return true;
        }
    }

    @dd
    public String hyr(int i2) {
        return d2ok("video", i2, false, false);
    }

    /* JADX INFO: renamed from: i */
    public void m18060i() {
        gbni();
        Log.e(f29684s, "destroy, set sInstance null", new Exception());
        synchronized (this.f29692y) {
            this.f29692y.clear();
        }
        f29671a = null;
    }

    public boolean i1(String str, Bitmap bitmap, int i2, String str2, boolean z2, boolean z3) {
        return new g(this).t8r(i2).m18068h(bitmap, str, str2, z2, z3).m18069k();
    }

    public void i9jn(boolean z2) {
        if (m18046j()) {
            try {
                this.f72421zy.updateKeyguardWallpaperState(z2);
            } catch (Throwable th) {
                Log.e(f29684s, "updateKeyguardWallpaperState fail", th);
            }
        }
    }

    public boolean ikck(String str, Bitmap bitmap, int i2) {
        return new g(this).t8r(i2).kja0(bitmap, str, true).m18069k();
    }

    @dd
    public String jk(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return "";
        }
        try {
            return this.f72421zy.getGalleryJson(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperPath fail : ", th);
            return "";
        }
    }

    @dd
    public Map jp0y(int i2, boolean z2, Map<String, Rect> map) {
        if (!m18046j()) {
            return null;
        }
        try {
            return this.f72421zy.getMiuiLockPartWallpaperIsDeep(i2, z2, map);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiLockPartWallpaperColors failed ", th);
            return null;
        }
    }

    public void ki(int i2) {
        if (m18046j()) {
            try {
                if (m18062r() >= 2.0f) {
                    this.f72421zy.clearWallpaperForPackage(i2, this.f29689k.getOpPackageName());
                } else {
                    this.f72421zy.clearWallpaper(i2);
                }
            } catch (Throwable th) {
                Log.e(f29684s, "getMiuiWallpaperColors fail : ", th);
            }
        }
    }

    public void kja0(IMiuiKeyguardWallpaperCallback iMiuiKeyguardWallpaperCallback) {
        if (m18046j()) {
            try {
                this.f72421zy.bindSystemUIProxy(iMiuiKeyguardWallpaperCallback);
            } catch (Throwable th) {
                Log.e(f29684s, "bindSystemUIProxy fail", th);
            }
        }
    }

    @dd
    /* JADX INFO: renamed from: l */
    public SurfaceControl m18061l(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return null;
        }
        try {
            return this.f72421zy.getSurfaceControl(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperType fail : ", th);
            return null;
        }
    }

    public void ltg8(boolean z2, boolean z3, int i2) {
        if (m18046j()) {
            try {
                this.f72421zy.updateKeyguardWallpaperStateAnim(z2, z3, i2);
            } catch (Throwable th) {
                Log.e(f29684s, "updateKeyguardWallpaperStateAnim fail", th);
            }
        }
    }

    public boolean lv5(Bitmap bitmap, int i2) {
        return new g(this).t8r(i2).m18073s(bitmap, null).m18069k();
    }

    @SuppressLint({"MissingPermission"})
    @dd
    public Bitmap lvui(int i2) {
        Bitmap bitmapLd6 = null;
        if (m18046j() && m18050o(i2)) {
            try {
                ParcelFileDescriptor miuiWallpaperPreview = this.f72421zy.getMiuiWallpaperPreview(i2);
                try {
                    if (miuiWallpaperPreview == null) {
                        BitmapDrawable bitmapDrawable = (BitmapDrawable) WallpaperManager.getInstance(this.f29689k).getDrawable();
                        if (bitmapDrawable != null) {
                            bitmapLd6 = bitmapDrawable.getBitmap();
                        }
                    } else {
                        bitmapLd6 = C5273g.ld6(miuiWallpaperPreview);
                    }
                    if (miuiWallpaperPreview != null) {
                        miuiWallpaperPreview.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                Log.e(f29684s, "getMiuiWallpaperPath fail : ", th);
            }
        }
        return bitmapLd6;
    }

    @hyr(api = 30)
    @dd
    public Bitmap mcp(Context context, int i2) {
        int iWidth;
        int iHeight;
        Bitmap bitmapLvui = lvui(i2);
        if (bitmapLvui != null) {
            Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
            if (f29676h || Build.IS_TABLET) {
                iWidth = bounds.width();
                iHeight = bounds.height();
            } else {
                int iWidth2 = bounds.width();
                int iHeight2 = bounds.height();
                iWidth = Math.min(iWidth2, iHeight2);
                iHeight = Math.max(iWidth2, iHeight2);
            }
            int i3 = iWidth;
            try {
                int width = bitmapLvui.getWidth();
                int height = bitmapLvui.getHeight();
                float fMax = Math.max(i3 / width, iHeight / height);
                Matrix matrix = new Matrix();
                matrix.setScale(fMax, fMax);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLvui, 0, 0, width, height, matrix, true);
                if (bitmapLvui != bitmapCreateBitmap) {
                    com.miui.miwallpaper.toq.m18076k(bitmapLvui);
                }
                int width2 = bitmapCreateBitmap.getWidth();
                int height2 = bitmapCreateBitmap.getHeight();
                bitmapLvui = Bitmap.createBitmap(bitmapCreateBitmap, width2 > i3 ? (width2 - i3) / 2 : 0, height2 > iHeight ? (height2 - iHeight) / 2 : 0, i3, iHeight);
                if (bitmapLvui != bitmapCreateBitmap) {
                    com.miui.miwallpaper.toq.m18076k(bitmapCreateBitmap);
                }
            } catch (Throwable th) {
                Log.e(f29684s, "getScreenCenterCropWallpaperPreview fail", th);
            }
        }
        return bitmapLvui;
    }

    public boolean mu(String str, InputStream inputStream, int i2) {
        return new g(this).t8r(i2).kja0(inputStream, str, true).m18069k();
    }

    @dd
    public String n5r1(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return null;
        }
        try {
            return this.f72421zy.getMiuiWallpaperType(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperType fail : ", th);
            return null;
        }
    }

    @dd
    public String ncyb(int i2) {
        return d2ok(nn86(i2) ? "default" : "sensor", i2, false, true);
    }

    public void nmn5(RemoteViews remoteViews, RemoteViews remoteViews2) {
        if (m18046j()) {
            try {
                this.f72421zy.setGalleryRemoteView(remoteViews, remoteViews2);
            } catch (Throwable th) {
                Log.e(f29684s, "getMiuiWallpaperColors fail : ", th);
            }
        }
    }

    public boolean nn86(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return false;
        }
        try {
            if (m18062r() >= 1.3f) {
                return this.f72421zy.isMiuiDefaultWallpaper(i2);
            }
            Log.e(f29684s, "call method isMiuiDefaultWallpaper fail,sdk version must >= 1.3");
            return false;
        } catch (Throwable th) {
            Log.e(f29684s, "isMiuiDefaultWallpaper fail", th);
            return false;
        }
    }

    @dd
    public String o1t() {
        if (!m18046j()) {
            return null;
        }
        try {
            return this.f72421zy.getMiuiPresetWallpaperPath();
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiPresetWallpaperPath fail : ", th);
            return null;
        }
    }

    @dd
    public String oc(int i2) {
        return d2ok(nn86(i2) ? "default" : "image", i2, false, false);
    }

    public void py(float f2, long j2) {
        if (m18046j()) {
            try {
                this.f72421zy.updateKeyguardWallpaperRatio(f2, j2);
            } catch (Throwable th) {
                Log.e(f29684s, "updateKeyguardWallpaperRatio fail", th);
            }
        }
    }

    public boolean qkj8(ComponentName componentName, Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, Bitmap bitmap4) {
        return new g(this).x2(componentName, bitmap, bitmap2, bitmap3, bitmap4).m18069k();
    }

    public void qo(boolean z2) {
        if (m18046j()) {
            try {
                this.f72421zy.showWallpaperScreenOnAnim(z2);
            } catch (Throwable th) {
                Log.e(f29684s, "showWallpaperScreenOnAnim fail", th);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public float m18062r() {
        if (!m18046j()) {
            return 0.0f;
        }
        try {
            return this.f72421zy.getMiuiWallpaperSdkVersion();
        } catch (Throwable th) {
            Log.e(f29684s, "getMiuiWallpaperSdkVersion fail : ", th);
            return 0.0f;
        }
    }

    public boolean t8iq(Bitmap bitmap, Bitmap bitmap2, int i2) {
        return new g(this).t8r(i2).m18073s(bitmap, bitmap2).m18069k();
    }

    public void tfm() {
        if (m18046j()) {
            try {
                this.f72421zy.showWallpaperUnlockAnim();
            } catch (Throwable th) {
                Log.e(f29684s, "showWallpaperUnlockAnim fail", th);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public boolean m18063u(InputStream inputStream, int i2) {
        return new g(this).t8r(i2).m18073s(inputStream, null).m18069k();
    }

    /* JADX INFO: renamed from: v */
    public boolean m18064v(String str, InputStream inputStream, InputStream inputStream2, int i2) {
        return new g(this).t8r(i2).m18071p(inputStream, inputStream2, str).m18069k();
    }

    public boolean vq(String str, InputStream inputStream, int i2, boolean z2) {
        return new g(this).t8r(i2).kja0(inputStream, str, z2).m18069k();
    }

    public void was(int i2) {
        if (m18046j() && yz(i2)) {
            try {
                this.f72421zy.turnOffFashionGallery(i2);
            } catch (Throwable th) {
                Log.e(f29684s, "getMiuiWallpaperColors fail : ", th);
            }
        }
    }

    public int wvg(int i2) {
        if (!m18046j() || !m18050o(i2)) {
            return 0;
        }
        try {
            return this.f72421zy.getEffectId(i2);
        } catch (Throwable th) {
            Log.e(f29684s, "getEffectId: fail", th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: x */
    public boolean m18065x(InputStream inputStream, int i2, String str) {
        return new g(this).t8r(i2).f7l8(inputStream, true, str).m18069k();
    }

    @dd
    public String x9kr(int i2) {
        return d2ok(nn86(i2) ? "default" : "sensor", i2, false, false);
    }

    public boolean xwq3(String str, Bitmap bitmap, Bitmap bitmap2, int i2) {
        return new g(this).t8r(i2).m18071p(bitmap, bitmap2, str).m18069k();
    }

    public boolean y2(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3, int i2) {
        return new g(this).t8r(i2).m18072q(bitmap2, bitmap3).m18069k();
    }

    @dd
    /* JADX INFO: renamed from: z */
    public String m18066z() {
        return o1t();
    }

    public boolean zp(Bitmap bitmap, int i2, String str, boolean z2) {
        return new g(this).t8r(i2).f7l8(bitmap, z2, str).m18069k();
    }

    public void zsr0(IMiuiWallpaperManagerCallback iMiuiWallpaperManagerCallback) {
        if (m18046j()) {
            try {
                synchronized (this.f29692y) {
                    this.f29692y.remove(iMiuiWallpaperManagerCallback);
                }
                this.f72421zy.unRegisterWallpaperChangeListener(iMiuiWallpaperManagerCallback);
            } catch (Throwable th) {
                Log.e(f29684s, "unRegisterWallpaperChangeListener fail : ", th);
            }
        }
    }
}
