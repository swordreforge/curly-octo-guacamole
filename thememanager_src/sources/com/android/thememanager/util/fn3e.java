package com.android.thememanager.util;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0498q;
import com.android.thememanager.C2320q;
import com.android.thememanager.backup.ThemeBackupAgent;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.service.VideoWallpaperService;
import com.android.thememanager.wallpaper.C2951n;
import com.miui.maml.widget.edit.MamlutilKt;
import ek5k.C6002g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m4.C6795k;
import miui.content.res.IconCustomizer;
import miui.drm.DrmManager;
import qkj8.C7617k;

/* JADX INFO: compiled from: BaseModeManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class fn3e implements InterfaceC1789q, p001b.f7l8, com.android.thememanager.basemodule.analysis.ld6 {

    /* JADX INFO: renamed from: a */
    public static final int f16422a = 3;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f61236ab = 10;
    private static final String ac = "NULL_PLACE_HOLDER";
    private static final String ad = "&##&";
    private static final String aj = "lockAuthor";
    private static final String am = "superSavePower";
    private static final String an = "home_wallpaper";
    private static final Set<String> ar;
    private static final String as = "icons";
    private static final String ax = "rights";
    private static final String ay = "backup.switch";
    private static final String az = "home_preview";

    /* JADX INFO: renamed from: b */
    public static final int f16423b = 2;
    private static final String ba = "home_preview_small";
    public static final int bb = 11;
    private static final Set<String> bc;
    private static final Map<String, Integer> bd;
    private static final String be = "wallpaperInfo";
    private static final String bg = "miwallpaper";
    private static final String bl = "black_wallpaper";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f61237bo = 6;
    public static final int bp = 12;
    private static final String bq = "runtime_data_";
    private static Set<String> bs = new HashSet();
    private static final Map<Integer, zy> bu;
    private static final int bv = 99;

    /* JADX INFO: renamed from: c */
    public static final String f16424c = "home_wallpaper_type";

    /* JADX INFO: renamed from: d */
    public static final int f16425d = 8;

    /* JADX INFO: renamed from: e */
    private static final String f16426e = "home_wallpaper_scrolled";

    /* JADX INFO: renamed from: f */
    public static final String f16427f = "lockscreen_authority";
    private static final String id = "lock_wallpaper";
    private static final String in = "lockstyle";

    /* JADX INFO: renamed from: j */
    private static final String f16428j = "wallpaper_component_name";
    private static final Set<String> k0;

    /* JADX INFO: renamed from: l */
    private static final String f16429l = "BaseModeManager";

    /* JADX INFO: renamed from: m */
    public static final int f16430m = 1;

    /* JADX INFO: renamed from: o */
    public static final int f16431o = 0;

    /* JADX INFO: renamed from: u */
    public static final int f16432u = 5;

    /* JADX INFO: renamed from: v */
    public static final int f16433v = 7;

    /* JADX INFO: renamed from: w */
    public static final int f16434w = 9;

    /* JADX INFO: renamed from: x */
    public static final int f16435x = 4;

    /* JADX INFO: renamed from: g */
    protected String f16436g;

    /* JADX INFO: renamed from: h */
    protected String f16437h;

    /* JADX INFO: renamed from: i */
    protected String f16438i;

    /* JADX INFO: renamed from: k */
    protected String f16439k;

    /* JADX INFO: renamed from: n */
    protected String f16440n;

    /* JADX INFO: renamed from: p */
    protected String f16441p;

    /* JADX INFO: renamed from: q */
    protected String f16442q;

    /* JADX INFO: renamed from: r */
    protected Context f16443r;

    /* JADX INFO: renamed from: s */
    protected String f16444s;

    /* JADX INFO: renamed from: t */
    protected SharedPreferences.Editor f16445t;

    /* JADX INFO: renamed from: y */
    protected String f16446y;

    /* JADX INFO: renamed from: z */
    protected SharedPreferences f16447z;

    /* JADX INFO: renamed from: com.android.thememanager.util.fn3e$k */
    /* JADX INFO: compiled from: BaseModeManager.java */
    class C2776k extends HashMap<Integer, zy> {
        C2776k() {
            put(0, null);
            put(1, new zy(bf2.toq.toq().getPackageName(), VideoWallpaperService.class.getCanonicalName()));
            put(2, new zy("com.miui.miwallpaper", "com.miui.miwallpaper.MiWallpaper"));
            put(3, null);
            put(4, new zy(uc.f16819f, uc.f16816c));
            put(5, new zy("com.miui.miwallpaper", p001b.f7l8.f53777exv8));
            put(6, new zy("com.miui.miwallpaper.mars", p001b.f7l8.f53784hyow));
            put(7, new zy("com.miui.miwallpaper.earth", p001b.f7l8.f53797mi1u));
            put(8, new zy("com.miui.miwallpaper.saturn", p001b.f7l8.f53795lk));
            put(9, new zy("com.miui.miwallpaper", p001b.f7l8.f53805pnt2));
            put(10, new zy("com.miui.miwallpaper", p001b.f7l8.f53822xzl));
            put(11, new zy("com.miui.miwallpaper", p001b.f7l8.f53771c25));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.fn3e$q */
    /* JADX INFO: compiled from: BaseModeManager.java */
    private static class AsyncTaskC2777q extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private boolean f16448k;

        AsyncTaskC2777q(boolean isNew) {
            this.f16448k = isNew;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            Context qVar = bf2.toq.toq();
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(qVar);
            SharedPreferences sharedPreferences = qVar.getSharedPreferences(fn3e.ay, 0);
            String string = sharedPreferences.getString(fn3e.be, null);
            if (this.f16448k) {
                String string2 = sharedPreferences.getString(fn3e.aj, null);
                Log.i(fn3e.f16429l, "restoreWallpaperComponent to new phone: " + string + ", lockAuth=" + string2);
                ThemeBackupAgent.m6552y(string, string2);
            } else {
                Log.i(fn3e.f16429l, "restoreWallpaperComponent for self: " + string);
                if (string != null) {
                    ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(string);
                    WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
                    if (componentNameUnflattenFromString != null && (wallpaperInfo == null || !componentNameUnflattenFromString.equals(wallpaperInfo.getComponent()))) {
                        if (com.android.thememanager.basemodule.utils.y9n.toq(33) && TextUtils.equals(VideoWallpaperService.class.getName(), componentNameUnflattenFromString.getClassName())) {
                            return null;
                        }
                        com.android.thememanager.basemodule.utils.cdj.zurt(wallpaperManager, componentNameUnflattenFromString);
                    }
                }
                ThemeBackupAgent.m6547g();
            }
            sharedPreferences.edit().clear().apply();
            return null;
        }
    }

    /* JADX INFO: compiled from: BaseModeManager.java */
    class toq extends HashMap<String, Integer> {
        toq() {
            put(VideoWallpaperService.class.getName(), 1);
            put("com.miui.miwallpaper.MiWallpaper", 2);
            put("com.android.systemui.wallpaper.Video24WallpaperService", 3);
            put(uc.f16816c, 4);
            put(p001b.f7l8.f53777exv8, 5);
            put(p001b.f7l8.f53784hyow, 6);
            put(p001b.f7l8.f53797mi1u, 7);
            put(p001b.f7l8.f53795lk, 8);
            put(p001b.f7l8.f53805pnt2, 9);
            put(p001b.f7l8.f53822xzl, 10);
            put(p001b.f7l8.f53771c25, 11);
        }
    }

    /* JADX INFO: compiled from: BaseModeManager.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private final String f16449k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f61238toq;

        public zy(String packageName, String className) {
            this.f16449k = packageName;
            this.f61238toq = className;
        }

        /* JADX INFO: renamed from: k */
        public String m9732k() {
            return this.f61238toq;
        }

        public String toq() {
            return this.f16449k;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        k0 = hashSet;
        HashSet hashSet2 = new HashSet();
        ar = hashSet2;
        hashSet2.add("theme");
        hashSet2.add("wallpaper");
        hashSet2.add("lockscreen");
        hashSet2.add("ringtone");
        hashSet2.add("alarm");
        hashSet2.add(com.android.thememanager.basemodule.analysis.toq.mle);
        hashSet.addAll(Arrays.asList(InterfaceC1789q.qxj));
        HashSet hashSet3 = new HashSet();
        bc = hashSet3;
        StringBuilder sb = new StringBuilder();
        String str = bf2.zy.oaex;
        sb.append(str);
        sb.append(ax);
        hashSet3.add(sb.toString());
        hashSet3.add(str + com.android.thememanager.basemodule.utils.vyq.f10421k);
        bu = new C2776k();
        bd = new toq();
    }

    public fn3e(String backupPath, String preferenceMode, Set<String> backupCodeSet) {
        Context qVar = bf2.toq.toq();
        this.f16443r = qVar;
        if (this.f16447z == null) {
            SharedPreferences sharedPreferences = qVar.getSharedPreferences(preferenceMode, 0);
            this.f16447z = sharedPreferences;
            this.f16445t = sharedPreferences.edit();
        }
        this.f16439k = backupPath + an;
        this.f16442q = backupPath + "lock_wallpaper";
        this.f16440n = backupPath + "lockstyle";
        this.f16436g = backupPath + bl;
        this.f16446y = backupPath + "icons";
        this.f16444s = backupPath + "miwallpaper";
        this.f16441p = backupPath + ax;
        this.f16437h = backupPath + az;
        this.f16438i = backupPath + ba;
        bs = backupCodeSet;
        if (com.android.thememanager.basemodule.utils.o1t.fu4()) {
            return;
        }
        d8wk.m9699p(backupPath);
    }

    private static boolean cdj(String resourceCode) {
        return ar.contains(resourceCode);
    }

    public static void d3() {
        if (n7h(C2320q.o1t(bf2.toq.toq(), "theme"))) {
            uc.ch();
        }
    }

    private void f7l8() {
        if (com.android.thememanager.ncyb.ld6(true).equals("image")) {
            C1819o.lrht(InterfaceC1789q.sxpt, this.f16442q);
            toq(true, this.f16442q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fn3e() {
        d8wk.x2(this.f16437h);
        d8wk.x2(this.f16438i);
    }

    public static void gvn7(boolean isNew) {
        new AsyncTaskC2777q(isNew).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9720h(String currentThemePath) {
        return currentThemePath != null && currentThemePath.startsWith(com.android.thememanager.basemodule.resource.constants.toq.anfo);
    }

    public static boolean ki() {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("lockstyle");
        hashSet.add("miwallpaper");
        hashSet.add("aod");
        hashSet.add("icons");
        hashSet.add(InterfaceC1789q.w5);
        hashSet.add(InterfaceC1789q.gun);
        hashSet.add(InterfaceC1789q.jci);
        for (String str : hashSet) {
            if (new File(p001b.toq.x2(str)).exists()) {
                String strNi7 = com.android.thememanager.basemodule.utils.vyq.ni7(str);
                if (!TextUtils.isEmpty(strNi7) && !m9720h(strNi7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean kja0() {
        return "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider".equals(C7617k.toq().zy());
    }

    /* JADX INFO: renamed from: n */
    private void m9722n() {
        try {
            if (!com.android.thememanager.ncyb.ld6(false).equals("image")) {
                Context qVar = bf2.toq.toq();
                Bitmap qVar2 = C2805r.toq(qVar, 1);
                Bitmap qVar3 = C2805r.toq(qVar, 2);
                C2763c.m9653t(qVar2, this.f16437h);
                C2763c.m9653t(qVar3, this.f16438i);
                return;
            }
            Bitmap qVar4 = C2805r.toq(this.f16443r, 1);
            if (qVar4 != null) {
                File file = new File(this.f16439k);
                if (file.exists()) {
                    file.delete();
                }
                C2763c.m9653t(qVar4, this.f16439k);
                toq(false, this.f16439k);
            }
        } catch (Exception e2) {
            Log.w(f16429l, "backupFoldWallpaper fail. " + e2);
        }
    }

    public static boolean n7h(String currentThemePath) {
        return p001b.toq.t8r("theme").equals(currentThemePath);
    }

    private Bitmap ni7(String backupPath) {
        String strQrj = qrj(backupPath);
        if (new File(strQrj).exists()) {
            return BitmapFactory.decodeFile(strQrj);
        }
        return null;
    }

    private static void oc(WallpaperManager wm, int homeBackupType) {
        zy zyVar = bu.get(Integer.valueOf(homeBackupType));
        if (zyVar != null) {
            ComponentName componentName = new ComponentName(zyVar.toq(), zyVar.m9732k());
            com.android.thememanager.basemodule.utils.cdj.zurt(wm, componentName);
            if (!componentName.getPackageName().startsWith("com.miui.miwallpaper") || "com.miui.miwallpaper.MiWallpaper".equals(componentName.getClassName())) {
                return;
            }
            Log.i(f16429l, "notify Aod after apply super wallpaper. " + componentName);
            uc.n5r1(am);
        }
    }

    private String qrj(String path) {
        if (path == null) {
            return "";
        }
        return path + MamlutilKt.PREVIEW_DARK_SUF;
    }

    /* JADX INFO: renamed from: t */
    private void m9723t() {
        if (com.android.thememanager.ncyb.ld6(true).equals("image")) {
            if (TextUtils.isEmpty(this.f16442q) || !new File(this.f16442q).exists()) {
                return;
            }
            WallpaperApplyInfos wallpaperApplyInfos = new WallpaperApplyInfos();
            wallpaperApplyInfos.updateFoldApplyStatus(true, WallpaperApplyInfos.ApplyCode.LARGE_SCREEN, WallpaperApplyInfos.ApplyCode.LOCK);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f16442q);
            Bitmap bitmapNi7 = ni7(this.f16442q);
            if (bitmapDecodeFile != null) {
                C2805r.m9969k(this.f16443r, bitmapDecodeFile, bitmapNi7, true, false, this.f16442q, wallpaperApplyInfos, false, false);
            }
        }
        d8wk.x2(this.f16442q);
        String strQrj = qrj(this.f16442q);
        if (TextUtils.isEmpty(strQrj) || !new File(strQrj).exists()) {
            return;
        }
        d8wk.x2(strQrj);
    }

    public static boolean t8r() {
        String strO1t = com.android.thememanager.basemodule.utils.vyq.o1t("theme");
        if (!TextUtils.isEmpty(strO1t)) {
            File file = new File(strO1t);
            if (file.exists() && !DrmManager.isPermanentRights(file)) {
                return true;
            }
        }
        for (String str : com.android.thememanager.basemodule.utils.vyq.t8r()) {
            if (!cdj(str)) {
                String strX2 = p001b.toq.x2(str);
                String strO1t2 = com.android.thememanager.basemodule.utils.vyq.o1t(str);
                String strFn3e = com.android.thememanager.basemodule.utils.vyq.fn3e(str);
                if (!TextUtils.isEmpty(strX2) && new File(strX2).exists() && !k0.contains(str) && !TextUtils.isEmpty(strO1t2) && !TextUtils.isEmpty(strFn3e)) {
                    File file2 = new File(strO1t2);
                    if (file2.exists() && strFn3e.equals(ch.wvg(strX2)) && !DrmManager.isPermanentRights(file2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void toq(boolean isLockScreen, String backupPath) {
        if (C1807g.zurt()) {
            String strM9801y = h7am.m9801y(isLockScreen, false, false);
            String strM9801y2 = h7am.m9801y(isLockScreen, true, false);
            File file = new File(strM9801y);
            File file2 = new File(strM9801y2);
            if (file.exists() && file2.exists()) {
                C1819o.lrht(strM9801y, backupPath);
                C1819o.lrht(strM9801y2, qrj(backupPath));
            }
        }
    }

    public static void x2() {
        Context qVar = bf2.toq.toq();
        WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(qVar).getWallpaperInfo();
        qVar.getSharedPreferences(ay, 0).edit().clear().commit();
        if (wallpaperInfo != null) {
            ComponentName component = wallpaperInfo.getComponent();
            Log.i(f16429l, "backupWallpaperComponent : " + component + ", " + qVar.getSharedPreferences(ay, 0).edit().putString(be, component.flattenToString()).commit());
        } else {
            if (C2951n.fn3e().kja0() && C2951n.fn3e().m10486r(false)) {
                ComponentName componentName = new ComponentName(qVar, (Class<?>) VideoWallpaperService.class);
                Log.i(f16429l, "backupWallpaperComponent : " + componentName + ", " + qVar.getSharedPreferences(ay, 0).edit().putString(be, componentName.flattenToString()).commit());
            }
            Log.w(f16429l, "backupWallpaperComponent, info null.");
        }
        String strZy = C7617k.toq().zy();
        Log.i(f16429l, "backupWallpaperComponent, lockAuth: " + strZy + ", " + qVar.getSharedPreferences(ay, 0).edit().putString(aj, strZy).commit());
    }

    public void a9() {
        for (String str : bs) {
            String string = this.f16447z.getString(bq + str, null);
            if (string != null) {
                String[] strArrSplit = string.split(ad);
                if (strArrSplit.length > 0) {
                    com.android.thememanager.basemodule.utils.vyq.jp0y(str, C1819o.m7162p(strArrSplit[0], ac), C1819o.m7162p(strArrSplit[1], ac), C1819o.m7162p(strArrSplit[2], ac), C1819o.m7162p(strArrSplit[3], ac), C1819o.m7162p(strArrSplit[4], ac), C1819o.m7162p(strArrSplit[5], ac));
                }
            }
        }
    }

    public void fti() {
        if (com.android.thememanager.basemodule.utils.y9n.lvui()) {
            com.android.thememanager.ncyb.wvg(false, this.f16447z.getString(com.android.thememanager.ncyb.f60592zy, "image"));
            com.android.thememanager.ncyb.wvg(true, this.f16447z.getString(com.android.thememanager.ncyb.f13432q, "image"));
        }
    }

    public void fu4() {
        d8wk.x2(InterfaceC1789q.rg);
        WallpaperManager wallpaperManager = (WallpaperManager) this.f16443r.getSystemService("wallpaper");
        int i2 = this.f16447z.getInt(f16424c, 0);
        if (wallpaperManager == null) {
            return;
        }
        Log.i(f16429l, "recoveryHome . " + i2);
        if (i2 == 0) {
            if (C1807g.zurt()) {
                m9730z();
                return;
            }
            if (!new File(this.f16439k).exists()) {
                Log.w(f16429l, "recoveryHome fail, file not exist! reset Wallpaper!");
                uc.ni7(wallpaperManager);
                return;
            } else {
                if (this.f16447z.getBoolean(f16426e, false)) {
                    uc.kja0(this.f16443r, this.f16439k, null, null, false, false, true, null, null);
                } else {
                    uc.f7l8(this.f16443r, this.f16439k, null);
                }
                d8wk.x2(this.f16439k);
                return;
            }
        }
        if (i2 == 12) {
            Log.i(f16429l, "no need recovery homeWallpaper!");
            return;
        }
        if (i2 != 99) {
            if (i2 == 2) {
                mcp();
                oc(wallpaperManager, 2);
                return;
            } else if (i2 != 3) {
                oc(wallpaperManager, i2);
                return;
            } else {
                uc.zy();
                return;
            }
        }
        String string = this.f16447z.getString(f16428j, null);
        ComponentName componentNameUnflattenFromString = string != null ? ComponentName.unflattenFromString(string) : null;
        if (componentNameUnflattenFromString != null) {
            Log.i(f16429l, "recovery WallpaperComponent " + string);
            com.android.thememanager.basemodule.utils.cdj.zurt(wallpaperManager, componentNameUnflattenFromString);
            if (!componentNameUnflattenFromString.getPackageName().startsWith("com.miui.miwallpaper") || "com.miui.miwallpaper.MiWallpaper".equals(componentNameUnflattenFromString.getClassName())) {
                return;
            }
            Log.i(f16429l, "notify Aod after recovery super wallpaper... " + componentNameUnflattenFromString);
            uc.n5r1(am);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m9724g() {
        String str = InterfaceC1789q.vt2p;
        if (new File(str).exists()) {
            g1.m9752p(str, this.f16446y);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m9725i(String path) {
        return !TextUtils.isEmpty(path) && path.equals(this.f16439k);
    }

    public void jk() {
        if (new File(this.f16441p).exists()) {
            g1.m9752p(this.f16441p, InterfaceC1789q.g45);
            d8wk.x2(this.f16441p);
        }
    }

    public void jp0y() {
        File[] fileArrListFiles;
        File file = new File(bf2.zy.oaex);
        HashSet hashSet = new HashSet();
        Iterator<String> it = bs.iterator();
        while (it.hasNext()) {
            hashSet.add(p001b.toq.x2(it.next()));
        }
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                String absolutePath = file2.getAbsolutePath();
                if (!hashSet.contains(absolutePath) && !bc.contains(absolutePath)) {
                    d8wk.x2(absolutePath);
                }
            }
        }
        com.android.thememanager.basemodule.utils.vyq.m7234y(bs);
        com.android.thememanager.util.toq.m10011k();
        if (!new File(InterfaceC1789q.rg).exists() && !new File(InterfaceC1789q.zac).exists() && !new File(InterfaceC1789q.mnxh).exists()) {
            uc.m10023g(bf2.toq.toq(), false);
        }
        IconCustomizer.clearCustomizedIcons((String) null);
        zurt();
    }

    public void ld6() {
        String str = InterfaceC1789q.g45;
        if (new File(str).exists()) {
            g1.m9752p(str, this.f16441p);
        }
    }

    public void mcp() {
        if (new File(this.f16444s).exists()) {
            g1.m9752p(this.f16444s, InterfaceC1789q.zac);
            d8wk.x2(this.f16444s);
        }
    }

    public void o1t() {
        if (new File(this.f16446y).exists()) {
            g1.m9752p(this.f16446y, InterfaceC1789q.vt2p);
            d8wk.x2(this.f16446y);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m9726p() {
        for (String str : bs) {
            String str2 = C1819o.m7165s(com.android.thememanager.basemodule.utils.vyq.ni7(str), ac) + ad;
            String str3 = C1819o.m7165s(com.android.thememanager.basemodule.utils.vyq.o1t(str), ac) + ad;
            String str4 = C1819o.m7165s(com.android.thememanager.basemodule.utils.vyq.zurt(str), ac) + ad;
            String str5 = C1819o.m7165s(com.android.thememanager.basemodule.utils.vyq.fu4(str), ac) + ad;
            String str6 = C1819o.m7165s(com.android.thememanager.basemodule.utils.vyq.fn3e(str), ac) + ad;
            String str7 = C1819o.m7165s(com.android.thememanager.basemodule.utils.vyq.m7235z(str), ac) + ad;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str2);
            stringBuffer.append(str3);
            stringBuffer.append(str4);
            stringBuffer.append(str5);
            stringBuffer.append(str6);
            stringBuffer.append(str7);
            this.f16445t.putString(bq + str, stringBuffer.toString());
            this.f16445t.apply();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.AutoCloseable] */
    /* JADX INFO: renamed from: q */
    public boolean m9727q() throws Throwable {
        FileOutputStream fileOutputStream;
        FileNotFoundException e2;
        ?? r6;
        WallpaperManager wallpaperManager = (WallpaperManager) this.f16443r.getSystemService("wallpaper");
        if (wallpaperManager == null) {
            return false;
        }
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        if (wallpaperInfo == null) {
            if (com.android.thememanager.basemodule.utils.y9n.m7251n(32)) {
                r6 = "android.permission.READ_EXTERNAL_STORAGE";
                if (C0498q.m2255k(this.f16443r, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    Log.w(f16429l, "has no READ EXTERNAL_STORAGE, can not backup wallpaper.");
                    this.f16445t.putInt(f16424c, 12).apply();
                    return false;
                }
            }
            Drawable drawable = wallpaperManager.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                if (C1807g.zurt()) {
                    m9722n();
                    this.f16445t.putBoolean(f16426e, false);
                } else {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        ?? r2 = 0;
                        try {
                            try {
                                this.f16445t.putBoolean(f16426e, uc.eqxt());
                                File file = new File(this.f16439k);
                                file.delete();
                                fileOutputStream = new FileOutputStream(file);
                                try {
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                    r6 = fileOutputStream;
                                } catch (FileNotFoundException e3) {
                                    e2 = e3;
                                    Log.e(f16429l, "backupHome throw " + e2);
                                    r6 = fileOutputStream;
                                }
                            } catch (Throwable th) {
                                th = th;
                                r2 = r6;
                                com.android.thememanager.basemodule.utils.y9n.m7246g(r2);
                                bitmap.recycle();
                                throw th;
                            }
                        } catch (FileNotFoundException e4) {
                            fileOutputStream = null;
                            e2 = e4;
                        } catch (Throwable th2) {
                            th = th2;
                            com.android.thememanager.basemodule.utils.y9n.m7246g(r2);
                            bitmap.recycle();
                            throw th;
                        }
                        com.android.thememanager.basemodule.utils.y9n.m7246g(r6);
                        bitmap.recycle();
                    }
                }
            }
            this.f16445t.putInt(f16424c, 0);
        } else {
            Integer num = bd.get(wallpaperInfo.getServiceName());
            if (num != null) {
                if (num.intValue() == 2) {
                    m9728s();
                }
                this.f16445t.putInt(f16424c, num.intValue());
            } else {
                this.f16445t.putInt(f16424c, 99);
                this.f16445t.putString(f16428j, wallpaperInfo.getComponent().flattenToString());
                Log.i(f16429l, "backupHome, unknown service:" + wallpaperInfo.getServiceName());
            }
            this.f16445t.putBoolean(f16426e, false);
        }
        this.f16445t.apply();
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m9728s() {
        String str = InterfaceC1789q.zac;
        if (new File(str).exists()) {
            g1.m9752p(str, this.f16444s);
        }
    }

    public void wvg() {
        d8wk.x2(InterfaceC1789q.sxpt);
        if (C1807g.zurt()) {
            String str = InterfaceC1789q.yza;
            if (new File(str).exists()) {
                d8wk.x2(str);
            }
        }
        String string = this.f16447z.getString(f16427f, "com.miui.home.none_provider");
        C1819o.lrht(this.f16440n, InterfaceC1789q.re);
        if ("com.android.thememanager.set_lockwallpaper".equals(string) || "com.android.thememanager.theme_lockwallpaper".equals(string) || "com.android.thememanager.theme_lock_live_wallpaper".equals(string) || "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider".equals(string) || com.android.thememanager.settings.superwallpaper.utils.n7h.f60982x2.equals(string)) {
            if (C1807g.zurt()) {
                m9723t();
            } else if (new File(this.f16442q).exists()) {
                uc.ld6(this.f16443r, this.f16442q, null);
                d8wk.x2(this.f16442q);
            }
        }
        C7617k.toq().m27925k(string);
        Log.i(f16429l, "recoveryLockScreen auth= " + string);
        uc.m10020c();
    }

    /* JADX INFO: renamed from: y */
    public void m9729y() {
        String strZy = C7617k.toq().zy();
        this.f16445t.putString(f16427f, strZy);
        this.f16445t.apply();
        if (C1819o.lrht(InterfaceC1789q.re, this.f16440n)) {
            HashSet hashSet = new HashSet();
            hashSet.add("lockstyle");
            C6795k.toq(this.f16443r, g1.o1t(hashSet));
        }
        if ("com.android.thememanager.set_lockwallpaper".equals(strZy) || "com.android.thememanager.theme_lockwallpaper".equals(strZy) || "com.android.thememanager.theme_lock_live_wallpaper".equals(strZy) || "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider".equals(strZy) || com.android.thememanager.settings.superwallpaper.utils.n7h.f60982x2.equals(strZy)) {
            if (C1807g.zurt()) {
                f7l8();
            } else {
                C1819o.lrht(InterfaceC1789q.sxpt, this.f16442q);
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m9730z() {
        if (com.android.thememanager.ncyb.ld6(false).equals("image")) {
            try {
                if (!TextUtils.isEmpty(this.f16439k) && new File(this.f16439k).exists()) {
                    WallpaperApplyInfos wallpaperApplyInfos = new WallpaperApplyInfos();
                    wallpaperApplyInfos.updateFoldApplyStatus(true, WallpaperApplyInfos.ApplyCode.LARGE_SCREEN, WallpaperApplyInfos.ApplyCode.HOME);
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f16439k);
                    Bitmap bitmapNi7 = ni7(this.f16439k);
                    if (bitmapDecodeFile != null) {
                        C2805r.m9969k(this.f16443r, bitmapDecodeFile, bitmapNi7, false, false, this.f16439k, wallpaperApplyInfos, false, false);
                    }
                }
                return;
            } catch (Exception | OutOfMemoryError e2) {
                Log.e(f16429l, "recoveryFoldWallpaper: ", e2);
                uc.m10023g(this.f16443r, false);
            }
        } else {
            com.android.thememanager.ncyb.fn3e(this.f16437h, this.f16438i, new Runnable() { // from class: com.android.thememanager.util.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16561k.fn3e();
                }
            });
        }
        d8wk.x2(this.f16439k);
        String strQrj = qrj(this.f16439k);
        if (TextUtils.isEmpty(strQrj) || !new File(strQrj).exists()) {
            return;
        }
        d8wk.x2(strQrj);
    }

    public void zurt() {
        HashSet hashSet = new HashSet(Arrays.asList(InterfaceC1789q.bzx));
        hashSet.add(com.android.thememanager.basemodule.analysis.toq.lbeq);
        C6795k.toq(bf2.toq.toq(), g1.o1t(hashSet));
    }

    public void zy() {
        if (com.android.thememanager.basemodule.utils.y9n.lvui()) {
            this.f16445t.putString(com.android.thememanager.ncyb.f60592zy, com.android.thememanager.ncyb.ld6(false));
            this.f16445t.putString(com.android.thememanager.ncyb.f13432q, com.android.thememanager.ncyb.ld6(true));
            this.f16445t.apply();
        }
    }
}
