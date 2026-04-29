package com.android.thememanager.backup;

import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.cdj;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.ncyb;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import cyoe.InterfaceC5981k;
import java.io.File;
import kotlin.fti;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import kotlin.text.a9;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import org.json.JSONException;
import org.json.JSONObject;
import qkj8.C7617k;

/* JADX INFO: compiled from: ThemeRestoreManager.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f9626q = ".xml";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f57417zy = "ThemeRestoreAgent";

    /* JADX INFO: renamed from: k */
    private zy f9627k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final toq f57416toq = new toq(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final jk<f7l8> f9625n = fti.m22825k(C1674k.INSTANCE);

    /* JADX INFO: renamed from: com.android.thememanager.backup.f7l8$k */
    /* JADX INFO: compiled from: ThemeRestoreManager.kt */
    static final class C1674k extends AbstractC6308r implements InterfaceC5981k<f7l8> {
        public static final C1674k INSTANCE = new C1674k();

        C1674k() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final f7l8 invoke() {
            return new f7l8(null);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.backup.f7l8$n */
    /* JADX INFO: compiled from: ThemeRestoreManager.kt */
    public final class C1675n implements zy {
        public C1675n() {
        }

        @Override // com.android.thememanager.backup.f7l8.zy
        /* JADX INFO: renamed from: k */
        public void mo6558k(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
            boolean zF7l8 = d2ok.f7l8("com.android.thememanager.theme_lock_live_wallpaper", str2);
            if ((C1807g.zurt() && o1t.cdj()) || d2ok.f7l8("com.android.thememanager.set_lockwallpaper", str2) || d2ok.f7l8("com.android.thememanager.theme_lockwallpaper", str2) || d2ok.f7l8("com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider", str2) || d2ok.f7l8("com.miui.home.none_provider", str2) || (str2 == null && d2ok.f7l8("image", ncyb.m8420q()))) {
                String str3 = ThemeBackupAgent.f9620p;
                if (new File(str3).exists()) {
                    Log.i(f7l8.f57417zy, "restore lock wallpaper: " + uc.ld6(bf2.toq.toq(), str3, null));
                } else {
                    Log.w(f7l8.f57417zy, "restore lock wallpaper fail. file not exist!");
                }
            } else if (((C1807g.zurt() && o1t.cdj()) || d2ok.f7l8("com.android.thememanager.theme_lock_live_wallpaper", str2) || d2ok.f7l8("com.android.thememanager.theme_lock_video_wallpaper", str2)) && qrj.m7199q(qrj.toq.VIDEO_WALLPAPER)) {
                if (new File(ThemeBackupAgent.f57408kja0).exists()) {
                    f7l8.this.m6553g(false, zF7l8);
                } else {
                    Log.w(f7l8.f57417zy, "restore video wallpaper fail, file not exist. " + zF7l8);
                }
                if (new File(ThemeBackupAgent.f9617h).exists()) {
                    f7l8.this.m6553g(true, zF7l8);
                }
            }
            Context qVar = bf2.toq.toq();
            if (str == null) {
                if (C2951n.fn3e().kja0() && new File(ThemeBackupAgent.f57408kja0).exists() && !zF7l8) {
                    if (qrj.zy(qrj.toq.VIDEO_WALLPAPER)) {
                        Log.w(f7l8.f57417zy, "restore home video wallpaper fail. is miuiLite device2");
                        return;
                    } else {
                        f7l8.f7l8(f7l8.this, false, false, 3, null);
                        return;
                    }
                }
                String str4 = ThemeBackupAgent.f9622s;
                if (!new File(str4).exists()) {
                    Log.w(f7l8.f57417zy, "restore home wallpaper fail. file not exist. ");
                    return;
                }
                Log.i(f7l8.f57417zy, "restore home wallpaper : " + uc.f7l8(qVar, str4, null));
                return;
            }
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (componentNameUnflattenFromString != null) {
                String packageName = componentNameUnflattenFromString.getPackageName();
                d2ok.kja0(packageName, "getPackageName(...)");
                if (a9.r6ty(packageName, "com.miui.miwallpaper", false, 2, null) && !d2ok.f7l8("com.miui.miwallpaper.MiWallpaper", componentNameUnflattenFromString.getClassName())) {
                    if (C2951n.fn3e().kja0()) {
                        C2951n.fn3e().m10474b(componentNameUnflattenFromString, null, 0);
                        uc.n5r1("ThemeRestore");
                    } else {
                        cdj.zurt(WallpaperManager.getInstance(bf2.toq.toq()), componentNameUnflattenFromString);
                    }
                    if (d2ok.f7l8("com.android.thememanager.theme_lock_live_wallpaper", str2)) {
                        C7617k.toq().m27925k("com.android.thememanager.theme_lock_live_wallpaper");
                        bf2.toq.toq().sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
                        return;
                    }
                    return;
                }
                String str5 = ThemeBackupAgent.f57408kja0;
                if (!new File(str5).exists() || zF7l8 || d2ok.f7l8("com.android.thememanager.theme_lock_video_wallpaper", str2)) {
                    Log.w(f7l8.f57417zy, "do not restore wallpaper info. " + componentNameUnflattenFromString);
                    return;
                }
                if (qrj.zy(qrj.toq.VIDEO_WALLPAPER)) {
                    Log.w(f7l8.f57417zy, "restore home video wallpaper fail. is miuiLite device");
                    return;
                }
                Log.i(f7l8.f57417zy, "restore home video wallpaper : " + uc.n7h(false, false, false, str5, true, null));
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.backup.f7l8$q */
    /* JADX INFO: compiled from: ThemeRestoreManager.kt */
    public final class C1676q implements zy {
        public C1676q() {
        }

        /* JADX INFO: renamed from: q */
        private final void m6559q(ComponentName componentName, String str) {
            String packageName = componentName.getPackageName();
            d2ok.kja0(packageName, "getPackageName(...)");
            if (!a9.r6ty(packageName, "com.miui.miwallpaper", false, 2, null) || d2ok.f7l8("com.miui.miwallpaper.MiWallpaper", componentName.getClassName())) {
                return;
            }
            C2951n.fn3e().m10474b(componentName, null, 0);
            uc.n5r1("ThemeRestore");
            if (d2ok.f7l8("com.android.thememanager.theme_lock_live_wallpaper", str)) {
                Log.w(f7l8.f57417zy, "ThemeRestoreControllerImpl restoreSuperWallpaper: " + componentName.getPackageName());
                C7617k.toq().m27925k("com.android.thememanager.theme_lock_live_wallpaper");
                bf2.toq.toq().sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
            }
        }

        private final void toq(Context context, boolean z2) throws Throwable {
            if (z2) {
                Log.i(f7l8.f57417zy, "ThemeRestoreControllerImpl restore lock image wallpaper: " + uc.m10024h(context, ThemeBackupAgent.f9620p, null, null, false, true, false, false, null, null, null));
                return;
            }
            Log.i(f7l8.f57417zy, "ThemeRestoreControllerImpl restore home image wallpaper : " + uc.kja0(context, ThemeBackupAgent.f9622s, null, null, false, false, false, null, null));
        }

        private final void zy() throws Throwable {
            String strZy = f7l8.this.zy(ThemeBackupAgent.f9616g);
            if (strZy == null) {
                Log.i(f7l8.f57417zy, "restoreSensorWallpaper: sensorParam is null");
                return;
            }
            int[] iArrM9605k = com.android.thememanager.util.a9.m9605k(strZy);
            if (iArrM9605k.length == 4) {
                Log.i(f7l8.f57417zy, "restoreWallpaper: sensor wallpaper is restore r: " + uc.qrj(ThemeBackupAgent.f57405cdj, iArrM9605k[0], iArrM9605k[1], iArrM9605k[2], iArrM9605k[3], null));
            }
        }

        @Override // com.android.thememanager.backup.f7l8.zy
        /* JADX INFO: renamed from: k */
        public void mo6558k(@InterfaceC7395n String str, @InterfaceC7395n String str2) throws Throwable {
            ComponentName componentNameUnflattenFromString = str != null ? ComponentName.unflattenFromString(str) : null;
            Context qVar = bf2.toq.toq();
            boolean zM7199q = qrj.m7199q(qrj.toq.VIDEO_WALLPAPER);
            if (componentNameUnflattenFromString != null) {
                String packageName = componentNameUnflattenFromString.getPackageName();
                d2ok.kja0(packageName, "getPackageName(...)");
                if (a9.r6ty(packageName, "com.miui.miwallpaper", false, 2, null) && !d2ok.f7l8("com.miui.miwallpaper.MiWallpaper", componentNameUnflattenFromString.getClassName())) {
                    m6559q(componentNameUnflattenFromString, str2);
                }
            }
            if (new File(ThemeBackupAgent.f57405cdj).exists() && C1807g.nn86() && C1807g.zurt()) {
                zy();
            }
            if (new File(ThemeBackupAgent.f9622s).exists()) {
                d2ok.qrj(qVar);
                toq(qVar, false);
            }
            if (new File(ThemeBackupAgent.f9620p).exists()) {
                d2ok.qrj(qVar);
                toq(qVar, true);
            }
            if (new File(ThemeBackupAgent.f57408kja0).exists() && zM7199q) {
                f7l8.f7l8(f7l8.this, false, false, 2, null);
            }
            if (new File(ThemeBackupAgent.f9617h).exists() && zM7199q) {
                f7l8.f7l8(f7l8.this, true, false, 2, null);
            }
        }
    }

    /* JADX INFO: compiled from: ThemeRestoreManager.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        private final f7l8 m6560k() {
            return (f7l8) f7l8.f9625n.getValue();
        }

        @InterfaceC7396q
        public final f7l8 toq() {
            f7l8 f7l8VarM6560k = m6560k();
            d2ok.qrj(f7l8VarM6560k);
            return f7l8VarM6560k;
        }
    }

    /* JADX INFO: compiled from: ThemeRestoreManager.kt */
    public interface zy {

        /* JADX INFO: renamed from: com.android.thememanager.backup.f7l8$zy$k */
        /* JADX INFO: compiled from: ThemeRestoreManager.kt */
        public static final class C1677k {
            /* JADX INFO: renamed from: k */
            public static void m6561k(@InterfaceC7396q zy zyVar, @InterfaceC7395n String str, @InterfaceC7395n String str2) {
            }
        }

        /* JADX INFO: renamed from: k */
        void mo6558k(@InterfaceC7395n String str, @InterfaceC7395n String str2);
    }

    private f7l8() {
    }

    public /* synthetic */ f7l8(ni7 ni7Var) {
        this();
    }

    static /* synthetic */ void f7l8(f7l8 f7l8Var, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            z3 = false;
        }
        f7l8Var.m6553g(z2, z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final void m6553g(boolean z2, boolean z3) {
        boolean zF7l8 = d2ok.f7l8("true", zy(z2 ? ThemeBackupAgent.f57406f7l8 : ThemeBackupAgent.f9623y));
        String str = z2 ? ThemeBackupAgent.f9617h : ThemeBackupAgent.f57408kja0;
        if (C1807g.zurt()) {
            uc.m10038y(str, z2, false, zF7l8);
            Log.i(f57417zy, "restoreWallpaper: fold video Wallpaper is restore success isLock: " + z2);
            return;
        }
        if (z2) {
            Log.i(f57417zy, "restore lock video wallpaper. " + uc.m10032p(false, ThemeBackupAgent.f9617h, null, zF7l8));
            return;
        }
        uc.n7h(false, zF7l8, z3, str, true, null);
        Log.i(f57417zy, "restore video home wallpaper, both:" + z3);
    }

    /* JADX INFO: renamed from: n */
    private final void m6555n() {
        zy c1675n;
        boolean zExists = new File("/data/data/com.android.thememanager/shared_prefs/theme_backup_device_config.xml").exists();
        Log.w(f57417zy, String.valueOf(zExists));
        if (C2951n.fn3e().kja0() && zExists) {
            Log.w(f57417zy, "ThemeRestoreControllerImpl");
            c1675n = new C1676q();
        } else {
            Log.w(f57417zy, "ThemeRestoreOriginImpl");
            c1675n = new C1675n();
        }
        this.f9627k = c1675n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final String m6556q(@InterfaceC7396q String type) {
        d2ok.m23075h(type, "type");
        String strZy = zy(type);
        return strZy == null ? C1807g.f10328q : strZy;
    }

    /* JADX INFO: renamed from: y */
    public final void m6557y(@InterfaceC7395n String str, @InterfaceC7395n String str2) {
        m6555n();
        zy zyVar = this.f9627k;
        if (zyVar == null) {
            d2ok.n5r1("mThemeRestoreImpl");
            zyVar = null;
        }
        zyVar.mo6558k(str, str2);
    }

    @InterfaceC7395n
    public final String zy(@InterfaceC7396q String type) {
        d2ok.m23075h(type, "type");
        String string = null;
        String strF7l8 = C1824r.m7202s(ThemeBackupAgent.f9621q).f7l8("device", null);
        if (p029m.zy.toq(strF7l8)) {
            return null;
        }
        try {
            string = new JSONObject(strF7l8).getString(type);
            Log.i(f57417zy, "getConFig ，type = " + type + ", result = " + string);
            return string;
        } catch (JSONException unused) {
            Log.w(f57417zy, "getConFig: not find, type: " + type);
            return string;
        }
    }
}
