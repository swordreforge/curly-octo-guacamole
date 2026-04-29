package com.android.thememanager.controller.local;

import android.content.Context;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.controller.local.kja0;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.fu4;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import com.miui.miwallpaper.C5306p;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ProvisionApplyTheme.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f57917f7l8 = "/system/media/wallpaper/wallpaper_%s.jpg";

    /* JADX INFO: renamed from: g */
    private static final String f10894g = "vendor.wallpaper.color.flag";

    /* JADX INFO: renamed from: k */
    private static final String f10895k = "ProvisionApplyTheme";

    /* JADX INFO: renamed from: n */
    private static final String f10896n = "wallpaper.color.flag";

    /* JADX INFO: renamed from: p */
    private static String f10897p = null;

    /* JADX INFO: renamed from: q */
    private static final String f10898q = "hwid";

    /* JADX INFO: renamed from: s */
    private static List<String> f10899s = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57918toq = "ro.boot.product.theme_customize";

    /* JADX INFO: renamed from: y */
    private static Boolean f10900y = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57919zy = "ro.boot.product.theme_cmf";

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.kja0$k */
    /* JADX INFO: compiled from: ProvisionApplyTheme.java */
    class C1908k implements C2951n.k {
        C1908k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void zy() {
            Context qVar = bf2.toq.toq();
            String strZy = kja0.zy(true);
            String strZy2 = kja0.zy(false);
            try {
                if (p029m.zy.toq(strZy) || p029m.zy.toq(strZy2)) {
                    throw new NullPointerException();
                }
                Log.w(kja0.f10895k, "apply CMF: lockScreen = " + uc.m10024h(qVar, strZy, null, null, false, true, false, false, null, null, null) + ", wallpaper = " + uc.m10024h(qVar, strZy2, null, null, false, false, false, false, null, null, null));
            } catch (Throwable th) {
                Log.w(kja0.f10895k, "apply CMF failed:" + th);
            }
        }

        @Override // com.android.thememanager.wallpaper.C2951n.k
        /* JADX INFO: renamed from: k */
        public void mo7518k(C5306p manager) {
            Log.w(kja0.f10895k, "set custom wallpaper bindSuccess");
            if (kja0.ld6()) {
                C6002g.ld6().execute(new Runnable() { // from class: com.android.thememanager.controller.local.n7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        kja0.C1908k.zy();
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: ProvisionApplyTheme.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o1t.gvn7();
        }
    }

    public static List<String> f7l8() {
        if (f10899s == null) {
            f10899s = m7515q();
        }
        return f10899s;
    }

    /* JADX INFO: renamed from: g */
    public static String m7511g() {
        if (f10897p == null) {
            f10897p = m7513n();
        }
        return f10897p;
    }

    /* JADX INFO: renamed from: k */
    private static void m7512k(String localId) {
        fu4 fu4VarM10536k = C2082k.zy().m8001n().m10536k();
        Resource resource = null;
        for (Resource resource2 : ((com.android.thememanager.controller.qrj) C2082k.zy().m8001n().ld6(fu4VarM10536k).m7690k()).kja0()) {
            if (resource2 != null && resource2.getLocalId() != null && resource2.getLocalId().equals(localId)) {
                resource = resource2;
            }
        }
        if (resource == null) {
            Log.e(f10895k, "can't find local customThemeResource");
            return;
        }
        ApplyThemeInfo applyThemeInfo = new ApplyThemeInfo();
        applyThemeInfo.setShowProgress(false);
        applyThemeInfo.setShowToastOfSuccess(false);
        com.android.thememanager.util.qrj qrjVar = new com.android.thememanager.util.qrj(null, fu4VarM10536k, resource, applyThemeInfo);
        qrjVar.eqxt(new toq());
        qrjVar.executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    public static boolean kja0() {
        return C2951n.fn3e().jk();
    }

    public static boolean ld6() {
        return m7516s() && !kja0();
    }

    /* JADX INFO: renamed from: n */
    public static String m7513n() {
        if (!C1807g.fn3e()) {
            String[] qVar = toq();
            return (qVar == null || "id".equals(qVar[1])) ? "" : qVar[1];
        }
        String[] stringArray = bf2.toq.toq().getResources().getStringArray(R.array.PreCustomThemeConfig);
        if (stringArray.length % 2 == 0) {
            if (!f10898q.equals(stringArray[0])) {
                String strM7082s = C1807g.m7082s();
                for (int i2 = 0; i2 < stringArray.length; i2 += 2) {
                    if (strM7082s.equals(stringArray[i2])) {
                        return stringArray[i2 + 1];
                    }
                }
                return "";
            }
        }
        Log.d(f10895k, "PreCustomThemeConfig is wrong or not preCustom theme, config length = " + stringArray.length);
        return "";
    }

    public static Boolean n7h() {
        if (f10900y == null) {
            f10900y = Boolean.valueOf(m7514p());
        }
        return f10900y;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m7514p() {
        String[] qVar;
        if (C1807g.fn3e()) {
            return true;
        }
        return (!p029m.zy.toq(miuix.os.f7l8.m26160k(f57918toq, null)) || (qVar = toq()) == null || "id".equals(qVar[1])) ? false : true;
    }

    /* JADX INFO: renamed from: q */
    public static List<String> m7515q() {
        ArrayList arrayList = new ArrayList();
        if (!C1807g.fn3e()) {
            String[] qVar = toq();
            if (qVar != null && !"id".equals(qVar[1])) {
                arrayList.add(qVar[1]);
            }
            return arrayList;
        }
        String[] stringArray = bf2.toq.toq().getResources().getStringArray(R.array.PreCustomThemeConfig);
        if (stringArray.length % 2 != 0) {
            Log.d(f10895k, "PreCustomThemeConfig is wrong");
            return arrayList;
        }
        String strM7082s = C1807g.m7082s();
        for (int i2 = 0; i2 < stringArray.length; i2 += 2) {
            if (!strM7082s.equals(stringArray[i2])) {
                arrayList.add(stringArray[i2 + 1]);
            }
        }
        return arrayList;
    }

    public static void qrj() {
        if (m7516s()) {
            C2951n.fn3e().m10475c(new C1908k());
        } else {
            Log.i(f10895k, "setCustomWallpaperAsync: ");
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m7516s() {
        String strM26160k = miuix.os.f7l8.m26160k(f10896n, null);
        if (p029m.zy.toq(strM26160k)) {
            strM26160k = miuix.os.f7l8.m26160k(f10894g, null);
        }
        return (p029m.zy.toq(strM26160k) || miuix.os.f7l8.zy(f57919zy, -1) == 0 || m7517y() || zy(false) == null) ? false : true;
    }

    public static String[] toq() {
        String[] strArrSplit;
        String string = bf2.toq.toq().getString(R.string.custom_theme);
        if (string == null || (strArrSplit = string.split(",")) == null || strArrSplit.length != 2) {
            return null;
        }
        return strArrSplit;
    }

    public static void x2() {
        Log.d(f10895k, "run: Provision Theme Apply Start!");
        if (C1807g.fn3e()) {
            String strM7511g = m7511g();
            if (!p029m.zy.toq(strM7511g)) {
                m7512k(strM7511g);
            }
        }
        String strM26160k = miuix.os.f7l8.m26160k(f57918toq, null);
        if (p029m.zy.toq(strM26160k)) {
            Log.w(f10895k, "systemProThemeName is null");
            return;
        }
        String[] qVar = toq();
        if (qVar != null && !qVar[0].equals("name") && strM26160k.equals(qVar[0])) {
            m7512k(qVar[1]);
            return;
        }
        Log.w(f10895k, "overlay config  name is" + qVar[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m7517y() {
        /*
            boolean r0 = com.android.thememanager.basemodule.utils.C1807g.fn3e()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L33
            android.content.Context r0 = bf2.toq.toq()
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2130903041(0x7f030001, float:1.7412889E38)
            java.lang.String[] r0 = r0.getStringArray(r3)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r4 = "hwid"
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L33
            java.lang.String r3 = com.android.thememanager.basemodule.utils.C1807g.m7082s()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            r3 = 0
            java.lang.String r4 = "ro.boot.product.theme_customize"
            java.lang.String r3 = miuix.os.f7l8.m26160k(r4, r3)
            boolean r4 = p029m.zy.toq(r3)
            if (r4 != 0) goto L5b
            java.lang.String[] r4 = toq()
            if (r4 == 0) goto L5b
            r5 = r4[r2]
            java.lang.String r6 = "name"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L5b
            r4 = r4[r2]
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L5b
            r3 = r1
            goto L5c
        L5b:
            r3 = r2
        L5c:
            if (r0 != 0) goto L62
            if (r3 == 0) goto L61
            goto L62
        L61:
            r1 = r2
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.local.kja0.m7517y():boolean");
    }

    public static String zy(boolean isLockScreen) {
        if (C2951n.fn3e().jk()) {
            String strM10479h = isLockScreen ? C2951n.fn3e().m10479h() : C2951n.fn3e().cdj();
            if (!p029m.zy.toq(strM10479h)) {
                return strM10479h;
            }
            Log.w(f10895k, "miuiWallpaperResult is empty");
        }
        String strM26160k = miuix.os.f7l8.m26160k(f10896n, null);
        if (p029m.zy.toq(strM26160k)) {
            strM26160k = miuix.os.f7l8.m26160k(f10894g, null);
        }
        if (!p029m.zy.toq(strM26160k)) {
            String str = String.format(f57917f7l8, strM26160k);
            if (C1821p.m7188p(str)) {
                return str;
            }
            Log.w(f10895k, "getCustomWallpaperPath: CMF file not exists!(" + str + ")");
        }
        return null;
    }
}
