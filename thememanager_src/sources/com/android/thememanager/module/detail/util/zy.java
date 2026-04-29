package com.android.thememanager.module.detail.util;

import android.app.Activity;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import androidx.lifecycle.fti;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.fu4;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.util.AsyncTaskC2806s;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.etdu;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.oc;
import com.android.thememanager.util.r8s8;
import com.android.thememanager.util.vq;
import ek5k.C6002g;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import miui.drm.DrmManager;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: compiled from: ResourceApplyHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int f60530f7l8 = 7200000;

    /* JADX INFO: renamed from: g */
    public static final int f13163g = 32;

    /* JADX INFO: renamed from: h */
    public static final ArrayMap<Integer, String[]> f13164h;

    /* JADX INFO: renamed from: k */
    public static final int f13165k = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final ArrayMap<String, String[]> f60531kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f60532ld6 = "mix_checkbox_global";

    /* JADX INFO: renamed from: n */
    public static final int f13166n = 16;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f60533n7h = "mix_checkbox_superwallpaper";

    /* JADX INFO: renamed from: p */
    private static final String f13167p = "mix_checkbox_home";

    /* JADX INFO: renamed from: q */
    public static final int f13168q = 8;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f60534qrj = "mix_checkbox_aod";

    /* JADX INFO: renamed from: s */
    private static final String f13169s = "mix_checkbox_lockscreen";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f60535toq = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f60536x2 = "mix_checkbox_icon";

    /* JADX INFO: renamed from: y */
    private static final String f13170y = "mix_checkbox";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f60537zy = 4;

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.util.zy$k */
    /* JADX INFO: compiled from: ResourceApplyHelper.java */
    @Retention(RetentionPolicy.SOURCE)
    @interface InterfaceC2248k {
    }

    static {
        ArrayMap<String, String[]> arrayMap = new ArrayMap<>();
        f60531kja0 = arrayMap;
        arrayMap.put(InterfaceC1789q.qwyf, new String[]{"framework"});
        arrayMap.put(InterfaceC1789q.gx2z, new String[]{"lockscreen", "splockscreen"});
        arrayMap.put(InterfaceC1789q.yb3p, new String[]{InterfaceC1789q.hop});
        arrayMap.put("launcher", new String[]{InterfaceC1789q.lsos, InterfaceC1789q.gun, InterfaceC1789q.jci, "miwallpaper", "wallpaper", "splockscreen", "spwallpaper", "spaod"});
        arrayMap.put("icons", new String[]{"wallpaper"});
        arrayMap.put("aod", new String[]{"spaod"});
        arrayMap.put("spwallpaper", new String[]{InterfaceC1789q.lsos, "miwallpaper", "wallpaper", InterfaceC1789q.y6, "videowallpaper", "lockscreen", InterfaceC1789q.gx2z, "launcher", "aod", "spaod", "splockscreen", "spwallpaper"});
        ArrayMap<Integer, String[]> arrayMap2 = new ArrayMap<>();
        f13164h = arrayMap2;
        arrayMap2.put(16, new String[]{"aod"});
        arrayMap2.put(1, new String[]{"lockscreen", InterfaceC1789q.gx2z});
        arrayMap2.put(2, new String[]{"launcher", InterfaceC1789q.lsos, "miwallpaper", "wallpaper", "videowallpaper", "clock_", InterfaceC1789q.ekha, InterfaceC1789q.w5, InterfaceC1789q.gun, InterfaceC1789q.jci});
        arrayMap2.put(4, new String[]{"framework", "mms", InterfaceC1789q.yb3p, InterfaceC1789q.qwyf, "com.android.settings", com.android.thememanager.basemodule.analysis.toq.lbeq, "bootanimation", "bootaudio", "ringtone", com.android.thememanager.basemodule.analysis.toq.mle, "alarm", "fonts"});
        arrayMap2.put(8, new String[]{"icons"});
        arrayMap2.put(32, new String[]{"spwallpaper"});
    }

    public static DrmManager.TrialLimits f7l8(String resourceCode, Resource resource) {
        File file = new File(new C1795s(resource, C1791k.getInstance(resourceCode)).m6970s());
        if (file.exists()) {
            return DrmManager.getTrialLimits(file);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static ArrayList<String> m8376g(int applyMixFlag) {
        ArrayList<String> arrayList = new ArrayList<>();
        if ((applyMixFlag & 32) == 0) {
            if ((applyMixFlag & 2) == 0) {
                arrayList.add("launcher");
                arrayList.add(InterfaceC1789q.lsos);
                arrayList.add("miwallpaper");
                arrayList.add("wallpaper");
                arrayList.add("videowallpaper");
                arrayList.add("clock_");
                arrayList.add(InterfaceC1789q.ekha);
                arrayList.add(InterfaceC1789q.w5);
                arrayList.add(InterfaceC1789q.gun);
                arrayList.add(InterfaceC1789q.jci);
                arrayList.add("spwallpaper");
                if ((applyMixFlag & 1) == 0) {
                    arrayList.add("splockscreen");
                }
                if ((applyMixFlag & 16) == 0) {
                    arrayList.add("spaod");
                }
            }
            if ((applyMixFlag & 16) == 0) {
                arrayList.add("aod");
            }
            if ((applyMixFlag & 1) == 0) {
                arrayList.add("lockscreen");
                arrayList.add(InterfaceC1789q.gx2z);
            }
        } else {
            arrayList.add("clock_");
            arrayList.add(InterfaceC1789q.ekha);
            arrayList.add(InterfaceC1789q.w5);
            arrayList.add(InterfaceC1789q.gun);
            arrayList.add(InterfaceC1789q.jci);
        }
        if ((applyMixFlag & 8) == 0) {
            arrayList.add("icons");
        }
        if ((applyMixFlag & 4) == 0) {
            arrayList.add("framework");
            arrayList.add("mms");
            arrayList.add(InterfaceC1789q.yb3p);
            arrayList.add(InterfaceC1789q.qwyf);
            arrayList.add("com.android.settings");
            arrayList.add(com.android.thememanager.basemodule.analysis.toq.lbeq);
            arrayList.add("bootanimation");
            arrayList.add("bootaudio");
            arrayList.add("ringtone");
            arrayList.add(com.android.thememanager.basemodule.analysis.toq.mle);
            arrayList.add("alarm");
            arrayList.add("fonts");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static void m8377k(Activity activity, String resourceCode, Resource resource, int applyType, int applyMixFlag, boolean restoreAfterTrialImmediately, fti<ThemeStatus> observableApplyStatus) {
        toq(activity, resourceCode, resource, applyType, applyMixFlag, restoreAfterTrialImmediately, observableApplyStatus, false, true, true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX INFO: renamed from: n */
    public static int m8378n() {
        SharedPreferences sharedPreferences = C2082k.m7998k().getSharedPreferences(f13170y, 0);
        boolean z2 = sharedPreferences.getBoolean(f13169s, true);
        ?? r1 = z2;
        if (sharedPreferences.getBoolean(f13167p, true)) {
            r1 = (z2 ? 1 : 0) | 2;
        }
        ?? r12 = r1;
        if (sharedPreferences.getBoolean(f60536x2, true)) {
            r12 = (r1 == true ? 1 : 0) | 8;
        }
        ?? r13 = r12;
        if (sharedPreferences.getBoolean(f60532ld6, true)) {
            r13 = (r12 == true ? 1 : 0) | 4;
        }
        ?? r14 = r13;
        if (sharedPreferences.getBoolean(f60534qrj, true)) {
            r14 = (r13 == true ? 1 : 0) | 16;
        }
        return sharedPreferences.getBoolean(f60533n7h, true) ? r14 | 32 : r14;
    }

    /* JADX INFO: renamed from: p */
    public static void m8379p(int applyMixFlag) {
        bf2.toq.toq().getSharedPreferences(f13170y, 0).edit().putBoolean(f13169s, (applyMixFlag & 1) != 0).putBoolean(f13167p, (applyMixFlag & 2) != 0).putBoolean(f60536x2, (applyMixFlag & 8) != 0).putBoolean(f60532ld6, (applyMixFlag & 4) != 0).putBoolean(f60534qrj, (applyMixFlag & 16) != 0).putBoolean(f60533n7h, (applyMixFlag & 32) != 0).apply();
    }

    /* JADX INFO: renamed from: q */
    public static int m8380q() {
        return 63;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8381s(String resourceCode, Resource resource) {
        return TextUtils.equals(new C1795s(resource, C1791k.getInstance(resourceCode)).m6971y(), bwp.m9634s(bf2.toq.toq(), resourceCode));
    }

    public static void toq(Activity activity, String resourceCode, Resource resource, int applyType, int applyMixFlag, boolean restoreAfterTrialImmediately, fti<ThemeStatus> observableApplyStatus, boolean isApplyMix, boolean withRelateResource, boolean showProgress, boolean keepLargeIcon) {
        String[] strArr;
        if (oc.ncyb(activity)) {
            return;
        }
        r8s8 r8s8VarM8003s = C2082k.zy().m8003s();
        ApplyThemeInfo applyThemeInfo = new ApplyThemeInfo();
        applyThemeInfo.setShowProgress(showProgress);
        applyThemeInfo.setKeepLargeIcon(keepLargeIcon);
        if (bwp.t8r(resourceCode)) {
            if (isApplyMix) {
                m8379p(applyMixFlag);
                applyThemeInfo.getMixIgnoreCodeSet().addAll(m8376g(applyMixFlag));
            }
        } else if (InterfaceC1789q.q28.contains(resourceCode)) {
            String[] strArr2 = f60531kja0.get("spwallpaper");
            if (strArr2 != null) {
                applyThemeInfo.getRelatedCodeSet().addAll(Arrays.asList(strArr2));
            }
            resourceCode = "spwallpaper";
        } else if (withRelateResource && (strArr = f60531kja0.get(resourceCode)) != null) {
            applyThemeInfo.getRelatedCodeSet().addAll(Arrays.asList(strArr));
        }
        fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(resourceCode);
        if (applyType != 1) {
            DrmManager.TrialLimits trialLimitsF7l8 = f7l8(resourceCode, resource);
            if (trialLimitsF7l8 != null) {
                long j2 = trialLimitsF7l8.endTime;
                r8s8VarM8003s.n7h(fu4VarM10535g, resource, j2);
                applyThemeInfo.setThemeUsingType(ApplyThemeInfo.THEME_USING_TYPE_TRIAL).setApplyThemeMessage(m8382y(activity, j2));
            }
        } else {
            if (g1.m9739c(fu4VarM10535g.getResourceCode(), resource.getMetaPath()) && restoreAfterTrialImmediately) {
                applyThemeInfo.setThemeUsingType(ApplyThemeInfo.THEME_USING_TYPE_RESTORE);
            }
            if ((resourceCode != null && resourceCode.equals(etdu.m9709k())) || vq.ld6(resource, etdu.m9709k(), applyThemeInfo)) {
                r8s8VarM8003s.toq();
                r8s8VarM8003s.m9977k(activity);
                r8s8VarM8003s.ld6();
            }
        }
        vq.f7l8(activity, fu4VarM10535g, resource, applyThemeInfo, observableApplyStatus);
    }

    /* JADX INFO: renamed from: y */
    public static String m8382y(Activity activity, long trialEndTime) {
        C7230k c7230k = new C7230k();
        c7230k.setTimeInMillis(trialEndTime);
        long jCurrentTimeMillis = (trialEndTime - System.currentTimeMillis()) + 30000;
        if (jCurrentTimeMillis >= 7200000) {
            return activity.getString(R.string.resource_trial_end_time, c7230k.format(activity, activity.getString(R.string.resource_trial_end_time_format)));
        }
        long j2 = jCurrentTimeMillis / 60000;
        long j3 = j2 / 60;
        long j4 = j3 / 24;
        long j5 = j2 % 60;
        long j6 = j3 % 24;
        return j4 != 0 ? j6 != 0 ? activity.getString(R.string.resource_trial_days_hours, Long.valueOf(j4), Long.valueOf(j6)) : activity.getString(R.string.resource_trial_days, Long.valueOf(j4)) : j6 != 0 ? j5 != 0 ? activity.getString(R.string.resource_trial_hours_minutes, Long.valueOf(j6), Long.valueOf(j5)) : activity.getString(R.string.resource_trial_hours, Long.valueOf(j6)) : activity.getString(R.string.resource_trial_minutes, Long.valueOf(j5));
    }

    public static void zy(Activity activity, Resource resource, C2247q param) {
        fti<ThemeStatus> ftiVar;
        ThemeStatus themeStatusM4388g;
        if (resource == null && (ftiVar = param.f60529zy) != null && (themeStatusM4388g = ftiVar.m4388g()) != null) {
            themeStatusM4388g.status = 97;
            param.f60529zy.cdj(themeStatusM4388g);
        }
        Log.i(C2755a.f16307g, "applyLargeIconTask begin " + param.f13157s + "," + param.f60526f7l8);
        new AsyncTaskC2806s(resource, activity, param, true, null).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }
}
