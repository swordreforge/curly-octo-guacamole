package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.activity.e5;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.local.C1751n;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1816n;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.online.zy;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.router.app.entity.ThemeStatus;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import miui.content.res.IconCustomizer;
import miui.drm.DrmManager;
import miui.os.Build;
import miuix.provider.C7317k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1356n;

/* JADX INFO: compiled from: ThemeHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class g1 implements p001b.f7l8, InterfaceC1789q, com.android.thememanager.basemodule.analysis.ld6 {

    /* JADX INFO: renamed from: a */
    private static final String f16454a = "LAST_USING_THEME_ONLINE_ID";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f61243ab = "LAST_USE_THEME";
    private static SharedPreferences.Editor ac = null;
    private static boolean ad = false;
    private static volatile long am = 0;
    private static final String an = "GUIDE_TO_DAILY_RECOMMEND";
    private static boolean as = false;
    private static SharedPreferences.Editor ax = null;
    private static String az = null;

    /* JADX INFO: renamed from: b */
    private static final String f16455b = "apply_theme_with_ringtones";
    private static SharedPreferences ba = null;
    private static final String bb = "SHORTCUT_DIALOG_SHOW";
    private static SharedPreferences.Editor bl = null;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f61244bo = "LAST_USING_THEME_TIME";
    private static final String bp = "NOT_SHOW_SHORTCUT_DIALOG";
    private static SharedPreferences bq = null;
    private static final String bv = "GUIDE_TO_LAB_FOR_LOOP_WALLPAPER";

    /* JADX INFO: renamed from: c */
    public static final String f16456c = "com.android.launcher";

    /* JADX INFO: renamed from: d */
    private static final String f16457d = "WIFI_CHECK";

    /* JADX INFO: renamed from: g */
    private static final String f16460g = "selected_theme_components";

    /* JADX INFO: renamed from: h */
    public static final String f16461h = "web_res_version";

    /* JADX INFO: renamed from: i */
    public static final String f16462i = "video_wallpaper_service_audio_on";
    private static final int id = 2;
    private static SharedPreferences in = null;

    /* JADX INFO: renamed from: k */
    private static final String f16464k = "ThemeHelper";

    /* JADX INFO: renamed from: l */
    public static final String f16465l = "ad_video_wallpaper_audio_on";

    /* JADX INFO: renamed from: m */
    private static final String f16466m = "localId-";

    /* JADX INFO: renamed from: n */
    private static final String f16467n = "notified_precust_theme_zip_hash";

    /* JADX INFO: renamed from: o */
    private static final long f16468o = 260372664;

    /* JADX INFO: renamed from: p */
    private static final String f16469p = "has_notify_incompatible";

    /* JADX INFO: renamed from: q */
    private static final String f16470q = "current_precust_theme_zip_hash";

    /* JADX INFO: renamed from: r */
    public static final String f16471r = "video_wallpaper_import_guide_has_showed";

    /* JADX INFO: renamed from: s */
    private static final String f16472s = "has_apply_video_wallpaper";

    /* JADX INFO: renamed from: t */
    public static final String f16473t = "video_wallpaper_path";

    /* JADX INFO: renamed from: u */
    private static final String f16474u = "LAST_USING_THEME_NAME";

    /* JADX INFO: renamed from: v */
    private static final String f16475v = "USED_THEMES_HISTORY_";

    /* JADX INFO: renamed from: w */
    private static final String f16476w = "LAST_USE_WALLPAPER";

    /* JADX INFO: renamed from: x */
    private static final String f16477x = "LAST_USING_THEME_HASH";

    /* JADX INFO: renamed from: y */
    private static final String f16478y = "has_apply_cust_wallpaper";

    /* JADX INFO: renamed from: z */
    public static final String f16479z = "video_wallpaper_service_is_system_file";

    /* JADX INFO: renamed from: f */
    private static final double f16459f = Math.log(2.0d);

    /* JADX INFO: renamed from: e */
    public static final String[] f16458e = {InterfaceC1356n.f53839zy, InterfaceC1356n.f7201q, "2x4", "4x4"};

    /* JADX INFO: renamed from: j */
    public static final int f16463j = n7h(134217728) + 1;
    private static Set<String> bg = new HashSet();

    static {
        Context qVar = bf2.toq.toq();
        as = qVar.getResources().getBoolean(R.bool.support_font_replacement);
        SharedPreferences sharedPreferences = qVar.getSharedPreferences(f16460g, 0);
        in = sharedPreferences;
        bl = sharedPreferences.edit();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(qVar);
        ba = defaultSharedPreferences;
        ax = defaultSharedPreferences.edit();
        SharedPreferences sharedPreferences2 = qVar.getSharedPreferences(f16469p, 0);
        bq = sharedPreferences2;
        ac = sharedPreferences2.edit();
        ad = miuix.os.f7l8.zy("ro.miui.ui.font.version", 0) >= 2;
        am = 0L;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m9737a() {
        return !Build.IS_TABLET && new File(InterfaceC1789q.h52g).exists();
    }

    public static long a9(long componentFlags) {
        if (i1(1L, componentFlags)) {
            return -1L;
        }
        if (componentFlags == 4100) {
            return 4096L;
        }
        long j2 = componentFlags & f16468o;
        for (long j3 = 1; j3 <= 134217728; j3 <<= 1) {
            if ((j2 & j3) != 0) {
                return j3;
            }
        }
        return 0L;
    }

    public static boolean a98o(String resourceCode, String themePath) {
        if (m9739c(resourceCode, themePath) && "theme".equals(resourceCode)) {
            if (new File(bf2.zy.oaex + "fonts").exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static long m9738b() {
        return in.getLong(f61244bo, -1L);
    }

    public static String bf2() {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<String, ?> entry : in.getAll().entrySet()) {
            if (entry.getKey().startsWith(f16475v)) {
                try {
                    jSONArray.put(new JSONObject((String) entry.getValue()));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        if (jSONArray.length() != 0) {
            return jSONArray.toString();
        }
        return null;
    }

    public static void bo(long timeSec) {
        m9740d(bb, timeSec);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9739c(String resourceCode, String themeMetaPath) {
        return p001b.toq.t8r(resourceCode).equals(themeMetaPath);
    }

    public static void c8jq(boolean needCheck) {
        gyi(f16457d, needCheck);
    }

    public static String cdj(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static void ch(String code, String id2) {
        bl.putString(f16466m + code, id2);
        bl.commit();
    }

    /* JADX INFO: renamed from: d */
    public static void m9740d(String key, long value) {
        ax.putLong(key, value);
        ax.apply();
    }

    public static boolean d2ok() {
        return PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getBoolean(f16472s, false);
    }

    public static String d3(String key, String defaultValue) {
        return ba.getString(key, defaultValue);
    }

    public static boolean d8wk() {
        if (com.android.thememanager.basemodule.utils.cdj.m7012h() >= 1) {
            return true;
        }
        return miuix.os.f7l8.toq("ro.miui.ui.font.theme_apply", false);
    }

    public static boolean dd() {
        return !Build.IS_TABLET && new File(InterfaceC1789q.yzg4).exists();
    }

    public static void dr(boolean hasApply) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
        editorEdit.putBoolean(f16478y, hasApply);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m9741e() {
        return !TextUtils.equals(PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getString(f16467n, ""), jk());
    }

    public static String ek5k() {
        return in.getString(f16477x, null);
    }

    public static boolean eqxt() {
        return PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getBoolean(f16478y, false);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9742f() {
        String strO1t = com.android.thememanager.basemodule.utils.vyq.o1t("theme");
        if (TextUtils.isEmpty(strO1t)) {
            return false;
        }
        if (new File(strO1t).exists()) {
            return !DrmManager.isPermanentRights(r1);
        }
        return false;
    }

    public static void f7l8() {
        for (Map.Entry<String, ?> entry : in.getAll().entrySet()) {
            if (entry.getKey().startsWith(f16475v)) {
                bl.remove(entry.getKey());
            }
        }
        bl.commit();
    }

    public static List<Resource> fn3e(String resourceCode) {
        return C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().m10535g(resourceCode)).m7690k().ki(false, true, false);
    }

    public static boolean fnq8() {
        String str = new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(10L)));
        String strD3 = d3(an, null);
        return strD3 == null || strD3.compareTo(str) < 0;
    }

    public static String fti(String componentCode) {
        String strM7235z = com.android.thememanager.basemodule.utils.vyq.m7235z(componentCode);
        return strM7235z == null ? TextUtils.isEmpty(com.android.thememanager.basemodule.utils.vyq.ni7(componentCode)) ? "0" : com.android.thememanager.basemodule.analysis.ld6.gek : strM7235z;
    }

    public static String fu4(String code, String id2) {
        if (TextUtils.isEmpty(id2) || TextUtils.isEmpty(code)) {
            return null;
        }
        return C1788k.f10175k + ".config/maml/" + code + "/" + id2 + ".config";
    }

    @zy.y9n
    /* JADX INFO: renamed from: g */
    public static void m9743g(Activity context, Resource resource, String resourceCode, String currentUsingPath, @zy.lvui androidx.lifecycle.fti<ThemeStatus> observableApplyStatus, int fontScale, int fontWeight) {
        com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(resourceCode);
        fu4VarM10535g.setCurrentUsingPath(currentUsingPath);
        com.android.thememanager.controller.x2 x2VarLd6 = C2082k.zy().m8001n().ld6(fu4VarM10535g);
        com.android.thememanager.controller.online.zy zyVar = new com.android.thememanager.controller.online.zy(fu4VarM10535g);
        DrmManager.DrmResult drmResultM8364k = com.android.thememanager.module.detail.util.f7l8.m8364k(fu4VarM10535g, x2VarLd6, zyVar, resource);
        Log.d(f16464k, "check result: " + drmResultM8364k);
        ApplyThemeInfo applyThemeInfo = (fontScale > 0 || fontWeight >= 0) ? new ApplyThemeInfo() : null;
        if (applyThemeInfo != null) {
            applyThemeInfo.setFontScale(fontScale);
            applyThemeInfo.setFontWeight(fontWeight);
            applyThemeInfo.setShowProgress(false);
        }
        if (drmResultM8364k == DrmManager.DrmResult.DRM_SUCCESS) {
            vq.f7l8(context, fu4VarM10535g, resource, applyThemeInfo, observableApplyStatus);
            return;
        }
        if ((drmResultM8364k != DrmManager.DrmResult.DRM_ERROR_RIGHT_FILE_NOT_EXISTS && drmResultM8364k != DrmManager.DrmResult.DRM_ERROR_ASSET_NOT_MATCH && drmResultM8364k != DrmManager.DrmResult.DRM_ERROR_TIME_NOT_MATCH) || (!C1781k.toq(bf2.toq.toq()) && !ch.hyr(resource.getLocalId()))) {
            Log.d(f16464k, "checkRightsAndApplyResource error , user agreement agreed = " + C1781k.toq(bf2.toq.toq()));
            ThemeStatus themeStatusM4388g = observableApplyStatus.m4388g();
            if (themeStatusM4388g != null) {
                themeStatusM4388g.status = 97;
                observableApplyStatus.n7h(themeStatusM4388g);
                return;
            }
            return;
        }
        zy.C7914zy c7914zyM7658k = zyVar.m7658k(resource, 1, p001b.toq.fu4(resourceCode), C1688q.cdj().o1t());
        if (c7914zyM7658k == null) {
            Log.e(f16464k, "response is null.");
            ThemeStatus themeStatusM4388g2 = observableApplyStatus.m4388g();
            if (themeStatusM4388g2 != null) {
                themeStatusM4388g2.status = 97;
                observableApplyStatus.n7h(themeStatusM4388g2);
                return;
            }
            return;
        }
        Log.d(f16464k, "download response: " + c7914zyM7658k.m7664n());
        if (c7914zyM7658k.m7664n() == 100000) {
            vq.f7l8(context, fu4VarM10535g, resource, applyThemeInfo, observableApplyStatus);
            return;
        }
        ThemeStatus themeStatusM4388g3 = observableApplyStatus.m4388g();
        if (themeStatusM4388g3 != null) {
            themeStatusM4388g3.status = 97;
            observableApplyStatus.n7h(themeStatusM4388g3);
        }
    }

    public static boolean g1() {
        return false;
    }

    public static void gbni(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        ba.unregisterOnSharedPreferenceChangeListener(listener);
    }

    public static boolean gvn7(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(e5.f8996i, true);
    }

    public static void gyi(String key, boolean value) {
        ax.putBoolean(key, value);
        ax.apply();
    }

    /* JADX INFO: renamed from: h */
    public static String m9744h(String[] retApplyThemeHash) {
        String[] strArr = {"theme", "framework", InterfaceC1789q.gx2z, "icons"};
        String str = null;
        for (int i2 = 0; i2 < 4; i2++) {
            String strZurt = com.android.thememanager.basemodule.utils.vyq.zurt(strArr[i2]);
            if (!TextUtils.isEmpty(strZurt)) {
                if (TextUtils.isEmpty(str)) {
                    str = strZurt;
                } else if (!TextUtils.equals(str, strZurt)) {
                    return null;
                }
            }
        }
        if (retApplyThemeHash != null && retApplyThemeHash.length > 0) {
            retApplyThemeHash[0] = com.android.thememanager.basemodule.utils.vyq.fn3e("theme");
        }
        return str;
    }

    public static boolean hb(String code) {
        return TextUtils.equals(code, "ringtone") || TextUtils.equals(code, com.android.thememanager.basemodule.analysis.toq.mle) || TextUtils.equals(code, "alarm");
    }

    public static boolean hyr() {
        String strFti = fti("theme");
        if (TextUtils.isEmpty(strFti) || TextUtils.isDigitsOnly(strFti)) {
            return false;
        }
        try {
            UUID.fromString(strFti);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m9745i() {
        return ni7(f16476w);
    }

    public static boolean i1(long resourceType, long flags) {
        boolean z2 = (flags & resourceType) != 0;
        if (z2 || resourceType != 1) {
            return z2;
        }
        return kja0(f16468o & flags) >= 2;
    }

    public static void ikck(String key, int value) {
        ax.putInt(key, value);
        ax.apply();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m9746j() {
        return !new File("/data/system/theme/fonts").exists();
    }

    private static String jk() {
        if (az == null) {
            az = ch.wvg(InterfaceC1789q.h52g);
        }
        return az;
    }

    public static long jp0y() {
        return ni7(bb);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9747k(Context context, String path) {
        if (new File(InterfaceC1789q.p1).exists()) {
            d8wk.m9699p(InterfaceC1789q.mec);
        }
        File file = new File(bf2.zy.oaex + InterfaceC1789q.klnv);
        file.delete();
        boolean zExists = true;
        if (InterfaceC1789q.s4y.equals(path)) {
            com.android.thememanager.basemodule.utils.vyq.f7l8("bootaudio");
            return true;
        }
        if (!TextUtils.isEmpty(path)) {
            try {
                ch.t8iq(new FileInputStream(path), file.getAbsolutePath());
            } catch (Exception unused) {
            }
            zExists = file.exists();
        }
        if (zExists) {
            com.android.thememanager.basemodule.utils.vyq.jp0y("bootaudio", path, null, null, context.getString(R.string.theme_description_title_customized), null, null);
        } else {
            com.android.thememanager.basemodule.utils.vyq.f7l8("bootaudio");
        }
        return zExists;
    }

    public static int ki(String key) {
        return ba.getInt(key, 0);
    }

    public static int kja0(long flag) {
        if (flag == -1) {
            return f16463j + 1;
        }
        int i2 = 0;
        while (flag != 0) {
            flag &= flag - 1;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m9748l(int platformVersion, String code) {
        return platformVersion >= p001b.toq.ki(code);
    }

    public static void ld6() {
        gyi(bv, false);
    }

    public static boolean lrht(String pkgName) {
        if (com.android.thememanager.basemodule.utils.y9n.mcp(bg)) {
            for (CharSequence charSequence : bf2.toq.toq().getResources().getTextArray(R.array.disable_package_replacement)) {
                bg.add(charSequence.toString());
            }
            bg.add("com.miui.whetstone");
        }
        return bg.contains(pkgName);
    }

    public static void lv5(long time) {
        m9740d(f16476w, time);
    }

    public static boolean lvui() {
        return !TextUtils.isEmpty(PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getString(f16470q, ""));
    }

    /* JADX INFO: renamed from: m */
    public static String m9749m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(InterfaceC1789q.q68, fti("theme"));
            jSONObject.put("Font", fti("fonts"));
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String mcp(String resourceCode, Resource resource) {
        return m9739c(resourceCode, resource.getMetaPath()) ? "0" : com.android.thememanager.basemodule.resource.n7h.m6953q(resource) ? com.android.thememanager.basemodule.resource.n7h.toq(resource) : ch.n5r1(new C1795s(resource, C1791k.getInstance(resourceCode)).f7l8()) ? miuix.os.f7l8.m26160k("ro.carrier.name", "") : TextUtils.isEmpty(resource.getOnlineId()) ? com.android.thememanager.basemodule.analysis.ld6.gek : resource.getOnlineId();
    }

    public static void mu(Activity activity, String resourceCode) {
        Intent intent = activity.getIntent();
        if (TextUtils.equals(miuix.os.f7l8.m26160k("ro.vendor.audio.ringtone.type", ""), "system")) {
            activity.setVolumeControlStream(1);
            return;
        }
        if (!"android.intent.action.RINGTONE_PICKER".equals(intent.getAction()) && !C2965z.f17864k.equals(intent.getAction())) {
            activity.setVolumeControlStream(3);
            return;
        }
        if (com.android.thememanager.basemodule.analysis.toq.mle.equals(resourceCode) || "ringtone".equals(resourceCode)) {
            activity.setVolumeControlStream(2);
        } else if ("alarm".equals(resourceCode)) {
            activity.setVolumeControlStream(4);
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9750n(String srcIconPath) {
        long jLastModified = new File(srcIconPath).lastModified();
        if (jLastModified == 0) {
            jLastModified = System.currentTimeMillis();
        }
        return jLastModified - am > 60000;
    }

    public static boolean n5r1() {
        return !TextUtils.equals(PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).getString(f16470q, ""), jk());
    }

    public static int n7h(long flag) {
        if (flag == -1) {
            return 0;
        }
        return (int) ((Math.log(flag) / f16459f) + 0.1d);
    }

    public static void ncyb() {
        qkj8(an, new SimpleDateFormat("yyyyMMdd", Locale.CHINA).format(new Date(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(10L))));
    }

    public static long ni7(String key) {
        return ba.getLong(key, 0L);
    }

    public static void nmn5(long time) {
        m9740d(f61243ab, time);
    }

    public static boolean nn86() {
        return ad;
    }

    /* JADX INFO: renamed from: o */
    public static String m9751o(String code) {
        return in.getString(f16466m + code, "");
    }

    public static long o1t(Set<String> codeSet) {
        long jM5739h = 0;
        if (codeSet != null) {
            Iterator<String> it = codeSet.iterator();
            while (it.hasNext()) {
                jM5739h |= p001b.toq.m5739h(it.next());
            }
        }
        return jM5739h;
    }

    public static boolean oc() {
        return x2(f16457d, true);
    }

    /* JADX INFO: renamed from: p */
    public static void m9752p(String srcFilePath, String destFilePath) {
        if (TextUtils.isEmpty(srcFilePath) || TextUtils.isEmpty(destFilePath)) {
            return;
        }
        File file = new File(srcFilePath);
        File file2 = new File(destFilePath);
        if (file2.exists()) {
            d8wk.x2(destFilePath);
        }
        d8wk.m9699p(file2.getParent());
        if (!file.isDirectory()) {
            d8wk.toq(srcFilePath, destFilePath);
            C1821p.zy(destFilePath, 493);
            return;
        }
        d8wk.m9699p(destFilePath);
        for (String str : file.list()) {
            StringBuilder sb = new StringBuilder();
            sb.append(srcFilePath);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(str);
            m9752p(sb.toString(), destFilePath + str2 + str);
        }
    }

    public static void py() {
        String strJk = jk();
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
        editorEdit.putString(f16467n, strJk);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: q */
    public static String m9753q(String str) {
        return str == null ? com.android.thememanager.basemodule.analysis.ld6.mdr : str;
    }

    public static void qkj8(String key, String value) {
        ax.putString(key, value);
        ax.apply();
    }

    public static void qo(boolean result, boolean hasAod, boolean applyAod) {
        if (!result) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.apply_failed, 1);
            return;
        }
        if (hasAod) {
            if (com.android.thememanager.basemodule.utils.o1t.m7172k() < 2) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.apply_success_not_support_aod, 1);
                return;
            } else if (applyAod && !com.android.thememanager.basemodule.utils.o1t.m7178y()) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.apply_success_not_enable_aod, 1);
                return;
            }
        }
        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.apply_succeed, 1);
    }

    public static long qrj(int platformVersion, long flag) {
        for (long j2 = 1; j2 <= 134217728; j2 <<= 1) {
            if (platformVersion < p001b.toq.cdj(j2)) {
                flag &= ~j2;
            }
        }
        return flag;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m9754r(String onlineId) {
        return bq.contains(onlineId);
    }

    /* JADX INFO: renamed from: s */
    private static String m9755s(long applyTime, String onlineId, String name, String applyType, String componentStamp) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.android.thememanager.basemodule.analysis.ld6.gvs2, applyTime);
            jSONObject.put("online_id", onlineId);
            jSONObject.put("name", name);
            jSONObject.put(com.android.thememanager.basemodule.analysis.ld6.b37y, applyType);
            jSONObject.put("category", componentStamp);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: t */
    public static int m9756t() {
        return R.drawable.notification_small_icon;
    }

    public static void t8iq(String onlineId, String hash, String themeName, long applyTime) {
        bl.putString(f16454a, onlineId);
        bl.putString(f16477x, hash);
        bl.putString(f16474u, themeName);
        bl.putLong(f61244bo, applyTime);
        bl.apply();
    }

    public static long t8r() {
        return ni7(f61243ab);
    }

    public static void tfm(C1791k newResourceContext, Resource resource) {
        try {
            File file = new File(new ResourceResolver(resource, C2082k.zy().m8001n().m10537n(newResourceContext)).getMetaPath());
            file.getParentFile().mkdirs();
            new C1751n(newResourceContext).toq(file, resource);
        } catch (Exception e2) {
            Log.e("AppService", "storeResource" + e2.getLocalizedMessage());
        }
    }

    public static void toq(Context context, int type, String path) {
        if (!new File(path).exists()) {
            int i2 = 0;
            if (type == 1) {
                i2 = miui.system.R.string.def_ringtone;
            } else if (type == 2) {
                i2 = miui.system.R.string.def_notification_sound;
            } else if (type == 4) {
                i2 = miui.system.R.string.def_alarm_alert;
            }
            if (i2 != 0) {
                try {
                    path = context.getResources().getString(i2);
                } catch (Exception unused) {
                    Log.e(C2755a.f16307g, "applyRingtone getString fail for " + type);
                }
            }
        }
        vq(context, type, path);
    }

    /* JADX INFO: renamed from: u */
    public static void m9757u(boolean notShow) {
        gyi(bp, notShow);
    }

    public static boolean uv6() {
        return x2(bv, true);
    }

    /* JADX INFO: renamed from: v */
    public static void m9758v(String onlineId) {
        ac.putBoolean(onlineId, true);
        ac.apply();
    }

    public static boolean vq(Context context, int type, String path) {
        String str = null;
        Uri uriFromFile = !TextUtils.isEmpty(path) ? Uri.fromFile(new File(path)) : null;
        Log.i(f16464k, "saveDefaultSound, setRingtone, " + path + ", type=" + type);
        com.android.thememanager.basemodule.utils.ld6.m7115k(type);
        bo.m9624s(context, type, uriFromFile);
        if (type == 4) {
            Settings.System.putString(context.getContentResolver(), C7317k.toq.f41536k, path);
        }
        if (type == 1) {
            str = "ringtone";
        } else if (type == 2) {
            str = com.android.thememanager.basemodule.analysis.toq.mle;
        } else if (type == 4) {
            str = "alarm";
        } else if (type == 16) {
            str = InterfaceC1789q.no;
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            com.android.thememanager.basemodule.utils.vyq.jp0y(str2, path, null, null, context.getString(R.string.theme_description_title_customized), null, (String) ch.i1(path).second);
        }
        return true;
    }

    public static boolean vyq(String resourceCode, Resource resource, String themeMetaPath) {
        boolean z2 = false;
        boolean z3 = true;
        if ("fonts".equals(resourceCode)) {
            z2 = true;
        } else {
            "theme".equals(resourceCode);
            z3 = false;
        }
        if (!z2) {
            return z2;
        }
        if (z3 && !m9739c(resourceCode, themeMetaPath)) {
            return z2;
        }
        return new File(bf2.zy.oaex + "fonts").exists();
    }

    public static boolean was() {
        return as;
    }

    public static boolean wo() {
        return !TextUtils.equals(miuix.os.f7l8.m26160k("ro.crypto.type", ""), "block");
    }

    public static boolean wvg() {
        return x2(bp, false);
    }

    /* JADX INFO: renamed from: x */
    public static void m9759x(String key) {
        ax.remove(key).apply();
    }

    public static boolean x2(String key, boolean defaultValue) {
        return ba.getBoolean(key, defaultValue);
    }

    public static boolean x9kr(String key) {
        return ba.contains(key);
    }

    public static void xwq3(boolean hasApply) {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(bf2.toq.toq()).edit();
        editorEdit.putBoolean(f16472s, hasApply);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9760y(Resource resource, String resourceCode, String themeMetaPath) {
        boolean zFn3e = bwp.fn3e(resourceCode);
        if (zFn3e || !"theme".equals(resourceCode)) {
            return zFn3e;
        }
        Iterator<RelatedResource> it = resource.getSubResources().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (bwp.fn3e(it.next().getResourceCode())) {
                zFn3e = true;
                break;
            }
        }
        return !zFn3e ? m9739c(resourceCode, themeMetaPath) : zFn3e;
    }

    public static void y2(String onlineId, String themeName, long applyTime, String themeApplyType, String componentStamp) {
        bl.putString(f16475v + applyTime, m9755s(applyTime, onlineId, themeName, themeApplyType, componentStamp));
        bl.apply();
    }

    public static String y9n() {
        return in.getString(f16454a, null);
    }

    public static String yz() {
        return in.getString(f16474u, null);
    }

    /* JADX INFO: renamed from: z */
    public static String m9761z() {
        return bf2.zy.d6c;
    }

    public static void zp(SharedPreferences.OnSharedPreferenceChangeListener listener) {
        ba.registerOnSharedPreferenceChangeListener(listener);
    }

    public static void zsr0() {
        try {
            am = new File(IconCustomizer.CUSTOMIZED_ICON_PATH).lastModified();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Log.i(C2755a.f16307g, "----- updateCutomizedIconsTime(): " + C1816n.m7142k(am));
    }

    public static String zurt() {
        return bf2.zy.vddr;
    }

    public static boolean zy(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(f16455b, false);
    }
}
