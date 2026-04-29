package com.theme.loopwallpaper.controller;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1822q;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.service.ThemeSchedulerService;
import com.android.thememanager.util.mbx;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import com.theme.loopwallpaper.model.LoopWallpaper;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.core.util.C7083n;
import qkj8.C7617k;

/* JADX INFO: compiled from: WallpaperLoopController.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f72535a9 = "wallpaper_diy";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f72536cdj;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final int[] f72537d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f72538d3 = "order";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static SharedPreferences f72539dd = null;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f72540eqxt = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f72541f7l8 = "toq";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f72542fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f72543fti = "more_options";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f72544fu4;

    /* JADX INFO: renamed from: g */
    public static final String f30297g = "loop_wallpaper_next_time";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f72545gvn7 = "interval";

    /* JADX INFO: renamed from: h */
    private static final String f30298h = "wallpaper_loop_first_run";

    /* JADX INFO: renamed from: i */
    private static final File f30299i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f72546jk = "lock_screen_diy";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f72547jp0y = "more_options_group";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f72548ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f72549kja0 = "_lockscreen_loop_first_run";

    /* JADX INFO: renamed from: l */
    private static final Object f30300l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f72550ld6 = "last_loop_id_wallpaper";

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final int f72551lvui = 0;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f72552mcp = "wallpaper_trigger";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private static volatile toq f72553n5r1 = null;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f72554n7h = "last_wallpaper_download_time";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static String[] f72555ncyb = null;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f72556ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f72557o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f72558oc = 0;

    /* JADX INFO: renamed from: p */
    private static final String f30301p = "last_loop_id_lockscreen";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f72559qrj = "last_lock_screen_download_time";

    /* JADX INFO: renamed from: r */
    public static final int f30302r = 1;

    /* JADX INFO: renamed from: s */
    private static final String f30303s = "loop_wallpaper_preference";

    /* JADX INFO: renamed from: t */
    public static final String f30304t = "lock_screen_trigger";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final File f72560t8r;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f72561wvg = "first_loop";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f72562x2 = "last_loop_time";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static String[] f72563x9kr = null;

    /* JADX INFO: renamed from: y */
    private static final long f30305y = 104857600;

    /* JADX INFO: renamed from: z */
    private static final String f30306z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f72564zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private com.android.thememanager.util.cache.toq f72566zy = new com.android.thememanager.util.cache.toq(1);

    /* JADX INFO: renamed from: q */
    private CopyOnWriteArrayList<File> f30309q = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: n */
    private CopyOnWriteArrayList<File> f30308n = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: k */
    private com.theme.loopwallpaper.utils.diskcache.toq f30307k = new com.theme.loopwallpaper.utils.diskcache.toq(f72564zurt, f30305y);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private com.theme.loopwallpaper.utils.diskcache.toq f72565toq = new com.theme.loopwallpaper.utils.diskcache.toq(f72556ni7, f30305y);

    /* JADX INFO: renamed from: com.theme.loopwallpaper.controller.toq$k */
    /* JADX INFO: compiled from: WallpaperLoopController.java */
    class C5439k implements Comparator<File> {
        C5439k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(File o1, File o2) {
            return Long.signum(o2.lastModified() - o1.lastModified());
        }
    }

    static {
        String str = C1788k.f10171g + ".loopwallpaper/";
        f72536cdj = str;
        f72548ki = str + "list";
        f72560t8r = new File(str + "applying_lockscreen");
        f30299i = new File(str + "applying_wallpaper");
        String str2 = str + com.android.thememanager.basemodule.resource.constants.toq.zvv;
        f72542fn3e = str2;
        f72564zurt = str2 + "lockscreen/";
        f72556ni7 = str2 + C1788k.f10189y;
        String str3 = str + "diy/";
        f72544fu4 = str3;
        f30306z = str3 + "lockscreen/";
        f72557o1t = str3 + C1788k.f10189y;
        f72537d2ok = new int[]{0, 1};
        f30300l = new Object();
        Resources resources = C2082k.m7998k().getResources();
        f72563x9kr = resources.getStringArray(R.array.set_wallpaper_loop_interval_values);
        f72555ncyb = resources.getStringArray(R.array.set_wallpaper_loop_order_values);
        f72539dd = PreferenceManager.getDefaultSharedPreferences(C2082k.m7998k());
    }

    private toq() {
    }

    private boolean cdj(String folder) {
        return new File(folder).exists() && this.f72566zy.m9659q(folder);
    }

    private void fn3e(int type) {
        String str = type == 0 ? f30306z : f72557o1t;
        CopyOnWriteArrayList<File> copyOnWriteArrayList = type == 0 ? this.f30308n : this.f30309q;
        copyOnWriteArrayList.clear();
        ArrayList<File> arrayListT8r = t8r(str);
        if (arrayListT8r != null) {
            copyOnWriteArrayList.addAll(arrayListT8r);
        }
        this.f72566zy.zy(str);
    }

    public static void fu4(int type, String id) {
        C2082k.m7998k().getSharedPreferences(f30303s, 0).edit().putString(type == 0 ? f30301p : f72550ld6, id).commit();
    }

    /* JADX INFO: renamed from: g */
    private CopyOnWriteArrayList<File> m18509g(int type) {
        if (cdj(type == 0 ? f30306z : f72557o1t)) {
            fn3e(type);
        }
        return type == 0 ? this.f30308n : this.f30309q;
    }

    /* JADX INFO: renamed from: h */
    private static boolean m18510h(int type) {
        return f72539dd.getBoolean(type == 0 ? f72549kja0 : f30298h, true);
    }

    /* JADX INFO: renamed from: k */
    public static LoopWallpaper m18511k(Uri uri, int type) {
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        try {
            String str = type == 0 ? f30306z : f72557o1t;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            String strZy = C1822q.zy(uri.toString());
            File file2 = new File(str + strZy);
            C7083n.m25589q(themeApplicationM7998k.getContentResolver().openInputStream(uri), file2);
            LoopWallpaper loopWallpaper = new LoopWallpaper();
            loopWallpaper.id = strZy;
            loopWallpaper.trackId = strZy;
            loopWallpaper.downloadUrl = file2.getAbsolutePath();
            return loopWallpaper;
        } catch (FileNotFoundException e2) {
            Log.d(f72541f7l8, "addDiyImage" + uri + e2);
            return null;
        }
    }

    public static boolean ki(int type) {
        return f72539dd.getBoolean(type == 0 ? f30304t : f72552mcp, false);
    }

    public static boolean kja0() {
        return f72539dd.getBoolean(f30304t, false) || f72539dd.getBoolean(f72552mcp, false);
    }

    public static int ld6() {
        return Integer.valueOf(f72539dd.getString("interval", f72563x9kr[0])).intValue();
    }

    /* JADX INFO: renamed from: n */
    public static void m18512n() {
        C7617k.toq().m27925k(InterfaceC1789q.i0z);
    }

    public static void n7h() {
        if ("com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider".equals(C7617k.toq().zy())) {
            f72539dd.edit().putBoolean(f30304t, false).commit();
        }
        if (mbx.m9872s(bf2.toq.toq())) {
            f72539dd.edit().putBoolean(f72552mcp, false).commit();
        }
        if (kja0()) {
            return;
        }
        ThemeSchedulerService.m8905q();
    }

    private static boolean ni7(int type) {
        return f72539dd.edit().putBoolean(type == 0 ? f72549kja0 : f30298h, false).commit();
    }

    public static void o1t(boolean lockscreenEnabled, boolean wallpaperEnabled, boolean immediately) {
        boolean z2 = false;
        if ((wallpaperEnabled && !m18516y().f7l8(1).isEmpty()) || (lockscreenEnabled && !m18516y().f7l8(0).isEmpty())) {
            z2 = true;
        }
        if (!z2) {
            if (lockscreenEnabled || wallpaperEnabled) {
                return;
            }
            ThemeSchedulerService.m8905q();
            return;
        }
        zurt(lockscreenEnabled);
        ThemeSchedulerService.m8906s(null, immediately);
        if (lockscreenEnabled) {
            m18512n();
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m18513p(int type) {
        return C2082k.m7998k().getSharedPreferences(f30303s, 0).getString(type == 0 ? f30301p : f72550ld6, "");
    }

    /* JADX INFO: renamed from: q */
    public static void m18514q() {
        f72539dd.edit().putBoolean(f30304t, false).commit();
        f72539dd.edit().putBoolean(f72552mcp, false).commit();
        ThemeSchedulerService.m8905q();
    }

    public static int qrj(String value) {
        int i2 = 0;
        while (true) {
            String[] strArr = f72555ncyb;
            if (i2 >= strArr.length) {
                return -1;
            }
            if (strArr[i2].equals(value)) {
                return i2;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m18515s(String value) {
        int i2 = 0;
        while (true) {
            String[] strArr = f72563x9kr;
            if (i2 >= strArr.length) {
                return -1;
            }
            if (strArr[i2].equals(value)) {
                return i2;
            }
            i2++;
        }
    }

    private ArrayList<File> t8r(String folder) {
        File[] fileArrListFiles;
        File file = new File(folder);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : fileArrListFiles) {
            arrayList.add(file2);
        }
        Collections.sort(arrayList, new C5439k());
        return arrayList;
    }

    private void toq(String absolutePath, int type) throws Throwable {
        String str = f72541f7l8;
        Log.w(str, "applyLoopWallpaper: " + absolutePath + " type " + type);
        C2951n c2951nFn3e = C2951n.fn3e();
        boolean zD2ok = c2951nFn3e.d2ok();
        uc.m10024h(C2082k.m7998k(), absolutePath, null, null, true, type == 0, false, false, null, null, null);
        CopyOnWriteArrayList<File> copyOnWriteArrayList = type == 0 ? this.f30309q : this.f30308n;
        if (c2951nFn3e.kja0() && zD2ok) {
            if (!ki(type ^ 1) || y9n.mcp(copyOnWriteArrayList)) {
                Log.w(str, "applyLoopWallpaper current super " + type);
                uc.m10024h(C2082k.m7998k(), absolutePath, null, null, true, type != 0, false, false, null, null, null);
            }
        }
    }

    public static int x2() {
        return Integer.valueOf(f72539dd.getString("order", f72555ncyb[0])).intValue();
    }

    /* JADX INFO: renamed from: y */
    public static toq m18516y() {
        if (f72553n5r1 == null) {
            synchronized (f30300l) {
                if (f72553n5r1 == null) {
                    f72553n5r1 = new toq();
                }
            }
        }
        return f72553n5r1;
    }

    /* JADX INFO: renamed from: z */
    public static void m18517z(boolean lockscreenEnabled, boolean wallpaperEnabled) {
        o1t(lockscreenEnabled, wallpaperEnabled, true);
    }

    private static void zurt(boolean lockscreenEnabled) {
        if (!lockscreenEnabled || m18516y().f7l8(0).isEmpty()) {
            return;
        }
        uc.m10026j();
    }

    public static void zy(int type) {
        C2082k.m7998k().getSharedPreferences(f30303s, 0).edit().remove(type == 0 ? f30301p : f72550ld6).commit();
    }

    public ArrayList<LoopWallpaper> f7l8(int type) {
        CopyOnWriteArrayList<File> copyOnWriteArrayListM18509g = m18509g(type);
        ArrayList<LoopWallpaper> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < copyOnWriteArrayListM18509g.size(); i2++) {
            File file = copyOnWriteArrayListM18509g.get(i2);
            if (file != null) {
                LoopWallpaper loopWallpaper = new LoopWallpaper();
                loopWallpaper.id = file.getName();
                loopWallpaper.trackId = file.getName();
                loopWallpaper.downloadUrl = file.getAbsolutePath();
                arrayList.add(loopWallpaper);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048 A[LOOP:1: B:23:0x0048->B:42:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m18518i(int r8, boolean r9) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = m18513p(r8)
            boolean r1 = ki(r8)
            if (r1 != 0) goto Lb
            return
        Lb:
            java.util.ArrayList r1 = r7.f7l8(r8)
            if (r1 == 0) goto Lb2
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb2
            int r2 = x2()
            int r3 = r1.size()
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L24
            goto L62
        L24:
            java.lang.String r3 = ""
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L45
            r3 = r5
        L2d:
            int r6 = r1.size()
            if (r3 >= r6) goto L45
            java.lang.Object r6 = r1.get(r3)
            com.theme.loopwallpaper.model.LoopWallpaper r6 = (com.theme.loopwallpaper.model.LoopWallpaper) r6
            java.lang.String r6 = r6.id
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L42
            goto L46
        L42:
            int r3 = r3 + 1
            goto L2d
        L45:
            r3 = r5
        L46:
            if (r2 != r4) goto L58
        L48:
            java.util.Random r9 = new java.util.Random
            r9.<init>()
            int r0 = r1.size()
            int r5 = r9.nextInt(r0)
            if (r3 == r5) goto L48
            goto L62
        L58:
            if (r9 == 0) goto L5b
            goto L62
        L5b:
            int r3 = r3 + r4
            int r9 = r1.size()
            int r5 = r3 % r9
        L62:
            java.lang.Object r9 = r1.get(r5)
            com.theme.loopwallpaper.model.LoopWallpaper r9 = (com.theme.loopwallpaper.model.LoopWallpaper) r9
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L72
            java.lang.String r2 = r9.downloadUrl     // Catch: java.io.FileNotFoundException -> L72
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> L72
            r0 = r1
            goto L89
        L72:
            r1 = move-exception
            java.lang.String r2 = com.theme.loopwallpaper.controller.toq.f72541f7l8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "loopWallpaper happens error "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r2, r1)
        L89:
            if (r0 == 0) goto Lb2
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.theme.loopwallpaper.controller.toq.f72536cdj
            r2.append(r3)
            java.lang.String r3 = r9.id
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            miuix.core.util.C7083n.m25589q(r0, r1)
            java.lang.String r0 = r1.getAbsolutePath()
            r7.toq(r0, r8)
            java.lang.String r9 = r9.id
            fu4(r8, r9)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theme.loopwallpaper.controller.toq.m18518i(int, boolean):void");
    }
}
