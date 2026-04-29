package com.android.thememanager.miuixcompat;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1816n;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.C1831y;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.library.util.app.C2088k;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.gc3c;
import ek5k.C6002g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import m4.C6795k;
import miuix.appcompat.app.ki;
import zy.lvui;
import zy.y9n;

/* JADX INFO: renamed from: com.android.thememanager.miuixcompat.g */
/* JADX INFO: compiled from: MIUIXCompatUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2206g {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f60482cdj = "preference";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60483f7l8 = "key_need_pop_miuix_apply_dialog";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final ArrayList<String> f60484fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static ArrayList<toq> f60485fu4 = null;

    /* JADX INFO: renamed from: g */
    public static final String f13001g = "miui.systemui.plugin";

    /* JADX INFO: renamed from: h */
    public static final String f13002h = "appcompat";

    /* JADX INFO: renamed from: i */
    private static final ArrayList<String> f13003i;

    /* JADX INFO: renamed from: k */
    private static final String f13004k = "MIUIXCompatUtil";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f60486ki = "springback";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f60487kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f60488ld6 = 1;

    /* JADX INFO: renamed from: n */
    public static final String f13005n = "com.android.mms";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f60489n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f60490ni7 = "_delete_miuix_compat";

    /* JADX INFO: renamed from: p */
    public static final int f13006p = 0;

    /* JADX INFO: renamed from: q */
    public static final String f13007q = "com.android.contacts";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f60491qrj = "miuix_compat_runtime.properties";

    /* JADX INFO: renamed from: s */
    public static final String f13008s = "key_component_upgrade_miuix_compatible";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f60492t8r = "MIUIX_RESTORE_DEFAULT";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final float f60493toq = 2.0f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f60494x2 = 2;

    /* JADX INFO: renamed from: y */
    public static final String f13009y = "key_need_pop_miuix2_apply_dialog";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final SparseArray<Integer> f60495zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final float f60496zy;

    static {
        StringBuilder sb = new StringBuilder();
        String str = vyq.f10426q;
        sb.append(str);
        sb.append(f60491qrj);
        f60489n7h = sb.toString();
        f60487kja0 = str + "miuix_compax_update.log";
        ArrayList<String> arrayList = new ArrayList<>();
        f13003i = arrayList;
        ArrayList<String> arrayList2 = new ArrayList<>();
        f60484fn3e = arrayList2;
        SparseArray<Integer> sparseArray = new SparseArray<>(3);
        f60495zurt = sparseArray;
        f60485fu4 = new ArrayList<>();
        arrayList.add(f13002h);
        arrayList.add(f60482cdj);
        arrayList.add(f60486ki);
        arrayList2.add("com.android.contacts");
        arrayList2.add("com.android.mms");
        f60485fu4.add(new f7l8());
        f60485fu4.add(new C2207k());
        f60485fu4.add(new C2209p());
        sparseArray.put(o1t.C1820k.f57800f7l8, 0);
        sparseArray.put(o1t.C1820k.f10392p, 0);
        sparseArray.put(o1t.C1820k.f57802ld6, 0);
        sparseArray.put(o1t.C1820k.f57806x2, 3);
        if (o1t.m7171i()) {
            f60496zy = sparseArray.get(o1t.C1820k.f57806x2).intValue();
        } else {
            f60496zy = 2.0f;
        }
    }

    public static boolean cdj(String code) {
        if (f60484fn3e.contains(p001b.toq.f7l8(code))) {
            return C1824r.m7203y().zy(code + f60490ni7, false);
        }
        Log.d(f13004k, "list not contain code: " + code);
        return false;
    }

    public static void f7l8(Set<String> applyCodeSet, Resource resource) {
        if (f60485fu4 == null || resource == null || applyCodeSet == null) {
            return;
        }
        for (int i2 = 0; i2 < f60485fu4.size(); i2++) {
            toq toqVar = f60485fu4.get(i2);
            if (applyCodeSet.contains(toqVar.zy()) && !toqVar.m8321k(toqVar.zy(), resource, false)) {
                applyCodeSet.remove(toqVar.zy());
                Log.d(f13004k, "clearInCompatibleCode:" + toqVar.zy());
            }
        }
    }

    public static boolean fn3e(String packageName) {
        if (!ki(packageName)) {
            return true;
        }
        Map<String, String> mapNi7 = ni7();
        return !mapNi7.isEmpty() && InterfaceC1789q.ol6.equals(mapNi7.get(packageName));
    }

    public static void fu4(AbstractActivityC1717k activity, int mixFlag, boolean isApplyMix, String code, Resource resource, Runnable applyRunnable, Runnable cancelRunnable) {
        new AsyncTaskC2208n(activity, mixFlag, isApplyMix, code, resource, applyRunnable, cancelRunnable).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: renamed from: g */
    public static void m8305g(Set<String> applyCodeSet, Set<String> mixIgnoreCodeSet, Set<String> ignoreCodeSet) {
        if (applyCodeSet.contains(InterfaceC1789q.yb3p) && !mixIgnoreCodeSet.contains(InterfaceC1789q.yb3p) && !ignoreCodeSet.contains("mms")) {
            m8313t(InterfaceC1789q.yb3p, false);
        }
        if (!applyCodeSet.contains("mms") || mixIgnoreCodeSet.contains("mms") || ignoreCodeSet.contains("mms")) {
            return;
        }
        m8313t("mms", false);
    }

    /* JADX INFO: renamed from: h */
    public static long m8306h(String packageName) {
        if ("com.android.contacts".equals(packageName)) {
            return 2048L;
        }
        if ("com.android.mms".equals(packageName)) {
            return 128L;
        }
        return p001b.toq.m5739h(p001b.toq.ni7(packageName));
    }

    /* JADX INFO: renamed from: i */
    public static boolean m8307i() {
        return o1t.C1820k.zy(o1t.C1820k.f57803n7h);
    }

    @y9n
    public static synchronized void jk(boolean updateSuccess, String reason, String packageName) {
        try {
            String str = f60487kja0;
            Map<String, String> mapM7243k = C1831y.m7243k(str, new TreeMap(), true);
            mapM7243k.put(String.valueOf(System.currentTimeMillis()), "result is " + updateSuccess + ",reason is " + reason + ",package is " + packageName + ",time is " + C1816n.m7142k(System.currentTimeMillis()));
            C1831y.zy(mapM7243k, str);
            StringBuilder sb = new StringBuilder();
            sb.append("saveMIUIXUpdateCompatData: ");
            sb.append(reason);
            Log.d(f13004k, sb.toString());
        } catch (Exception e2) {
            Log.e(f13004k, "saveMIUIXUpdateCompatData: ", e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m8308k(String code, Resource resource) {
        if (f60485fu4 == null || resource == null) {
            return true;
        }
        for (int i2 = 0; i2 < f60485fu4.size(); i2++) {
            toq toqVar = f60485fu4.get(i2);
            if ("theme".equals(code)) {
                if (!toqVar.m8321k(toqVar.zy(), resource, false)) {
                    Log.d(f13004k, "checkComponentCompatible not compatible for :" + toqVar.zy());
                    return false;
                }
            } else if (toqVar.zy().equals(code)) {
                boolean zM8321k = toqVar.m8321k(code, resource, false);
                if (!zM8321k) {
                    Log.d(f13004k, "checkComponentCompatible not compatible for :" + toqVar.zy());
                }
                return zM8321k;
            }
        }
        return true;
    }

    public static boolean ki(String packageName) {
        com.android.thememanager.basemodule.utils.y9n.m7257y();
        if (!m8307i() && f60484fn3e.contains(packageName)) {
            ArrayMap<String, Integer> arrayMapX2 = x2(packageName);
            Iterator<String> it = arrayMapX2.keySet().iterator();
            while (it.hasNext()) {
                if (arrayMapX2.get(it.next()).intValue() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static ArrayList<String> kja0() {
        ArrayList<String> arrayList = new ArrayList<>(f60484fn3e);
        arrayList.add("miui.systemui.plugin");
        arrayList.add("com.android.settings");
        arrayList.add("com.android.systemui");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Boolean, java.lang.String> ld6(java.lang.String r4, com.android.thememanager.basemodule.resource.model.Resource r5) {
        /*
            java.lang.String r0 = p001b.toq.x2(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = p001b.toq.f7l8(r4)
            r1.append(r2)
            java.lang.String r2 = "_v12"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.android.thememanager.basemodule.resource.model.RelatedResource r3 = r5.getSubResource(r1)
            if (r3 == 0) goto L5a
            com.android.thememanager.basemodule.resource.q r3 = new com.android.thememanager.basemodule.resource.q
            com.android.thememanager.basemodule.resource.model.RelatedResource r5 = r5.getSubResource(r1)
            com.android.thememanager.basemodule.resource.k r1 = com.android.thememanager.basemodule.resource.C1791k.getInstance(r1)
            r3.<init>(r5, r1)
            java.lang.String r5 = r3.m6956k()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L5a
            com.android.thememanager.util.g1.m9752p(r5, r0)
            mcp(r4, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "copyV12ResourceToRuntime: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MIUIXCompatUtil"
            android.util.Log.d(r0, r4)
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.<init>(r0, r5)
            goto L5b
        L5a:
            r4 = 0
        L5b:
            if (r4 != 0) goto L66
            android.util.Pair r4 = new android.util.Pair
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.String r0 = ""
            r4.<init>(r5, r0)
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.miuixcompat.C2206g.ld6(java.lang.String, com.android.thememanager.basemodule.resource.model.Resource):android.util.Pair");
    }

    @y9n
    public static synchronized void mcp(@lvui String code, @lvui String versionCode) {
        String str = f60489n7h;
        Map<String, String> mapM7243k = C1831y.m7243k(str, new TreeMap(), true);
        mapM7243k.put(code, versionCode);
        C1831y.zy(mapM7243k, str);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m8309n(String packageName) {
        ArrayList arrayList = new ArrayList(f60485fu4);
        arrayList.add(new x2());
        arrayList.add(new ld6());
        if (!p029m.zy.toq(packageName)) {
            String qVar = p001b.toq.toq(packageName);
            if (p029m.zy.toq(qVar)) {
                return false;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                toq toqVar = (toq) arrayList.get(i2);
                if (qVar.equals(toqVar.zy())) {
                    String strX2 = p001b.toq.x2(toqVar.zy());
                    if (!new File(strX2).exists()) {
                        o1t(true, qVar, "checkRuntimeThemeForMIUIX2Compat , runtimeFile not exist");
                        jk(true, "checkRuntimeThemeForMIUIX2Compat , runtimeFile not exist", packageName);
                        return true;
                    }
                    Resource resourceD2ok = ch.d2ok(toqVar.zy(), false);
                    if (resourceD2ok == null) {
                        wvg(strX2, qVar, packageName);
                        o1t(true, qVar, "checkRuntimeThemeForMIUIX2Compat , getUsingResource error");
                        jk(true, "checkRuntimeThemeForMIUIX2Compat , getUsingResource error.", packageName);
                        return true;
                    }
                    if (!toqVar.m8321k(toqVar.zy(), resourceD2ok, true) || zy(resourceD2ok, qVar)) {
                        wvg(strX2, qVar, packageName);
                        o1t(true, qVar, "checkRuntimeThemeForMIUIX2Compat , notify success.");
                        jk(true, "checkRuntimeThemeForMIUIX2Compat , notify success.", packageName);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ArrayList<String> n7h() {
        ArrayList<String> arrayList = new ArrayList<>(f60484fn3e);
        arrayList.add("miui.systemui.plugin");
        return arrayList;
    }

    @y9n
    public static synchronized Map<String, String> ni7() {
        return C1831y.toq(f60489n7h, true);
    }

    public static void o1t(boolean result, String code, String extra) {
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("value", String.valueOf(result));
        arrayMapM6679k.put("resourceType", code);
        arrayMapM6679k.put("extra", extra);
        C1708s.f7l8().ld6().n5r1(f60492t8r, C1706p.ki(arrayMapM6679k));
    }

    /* JADX INFO: renamed from: p */
    public static Pair<Boolean, String> m8310p(String code, Resource resource, String originPath) {
        if (ki(p001b.toq.f7l8(code)) && !resource.getIsBackUpVersion()) {
            return ld6(code, resource);
        }
        if (!TextUtils.isEmpty(originPath)) {
            g1.m9752p(originPath, p001b.toq.x2(code));
        }
        return new Pair<>(Boolean.FALSE, "");
    }

    @y9n
    /* JADX INFO: renamed from: q */
    public static void m8311q() {
        for (String str : kja0()) {
            boolean zM8309n = m8309n(str);
            if (!zM8309n) {
                zM8309n = toq(str);
            }
            Log.d(f13004k, "checkOtaCompatPackages: checkMiuiCompatible = " + zM8309n + "," + str);
            StringBuilder sb = new StringBuilder();
            sb.append("job scheduler , update finished,");
            sb.append(str);
            o1t(zM8309n, "UNKNOWN", sb.toString());
            jk(zM8309n, "job scheduler , update finished," + a9.m7000y(bf2.toq.toq(), str), str);
        }
    }

    public static String qrj(String code) {
        if ("theme".equals(code)) {
            return code;
        }
        if (f60485fu4 == null) {
            return null;
        }
        for (int i2 = 0; i2 < f60485fu4.size(); i2++) {
            toq toqVar = f60485fu4.get(i2);
            if (toqVar.zy().equals(code)) {
                return toqVar.toq();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m8312s() {
        Resource resourceD2ok;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < f60485fu4.size(); i2++) {
            toq toqVar = f60485fu4.get(i2);
            String strX2 = p001b.toq.x2(toqVar.zy());
            if (new File(strX2).exists() && (resourceD2ok = ch.d2ok(toqVar.zy(), false)) != null && !toqVar.m8321k(toqVar.zy(), resourceD2ok, false)) {
                d8wk.x2(strX2);
                vyq.f7l8(toqVar.zy());
                hashSet.add(toqVar.zy());
            }
        }
        if (hashSet.size() <= 0) {
            return false;
        }
        C6795k.toq(C2088k.m8026k(), g1.o1t(hashSet));
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static void m8313t(String code, boolean delete) {
        C1824r.m7203y().m7206p(code + f60490ni7, delete).toq();
    }

    public static boolean t8r(String packageName, @lvui Resource resource) {
        if (ki(packageName)) {
            String qVar = p001b.toq.toq(packageName);
            String str = packageName + InterfaceC1789q.ol6;
            List<RelatedResource> parentResources = resource.getParentResources();
            if (!kja0.qrj(parentResources) && C1792n.zy(parentResources.get(0), C1791k.getInstance(qVar)).getSubResource(str) == null) {
                return false;
            }
        }
        return true;
    }

    @y9n
    public static boolean toq(String packageName) {
        com.android.thememanager.basemodule.utils.y9n.m7257y();
        if (o1t.kja0()) {
            return false;
        }
        String qVar = p001b.toq.toq(packageName);
        String strX2 = p001b.toq.x2(qVar);
        if (!new File(strX2).exists()) {
            jk(false, "checkMIUIXCompat , runtimeFile not exist.", packageName);
            return false;
        }
        if (fn3e(packageName)) {
            jk(false, "checkMIUIXCompat , isMIUIXCompat", packageName);
            return false;
        }
        if (TextUtils.isEmpty(qVar)) {
            Log.d(f13004k, "checkMIUIXCompat code is empty. " + packageName);
            return false;
        }
        d8wk.x2(strX2);
        m8314y(qVar);
        m8313t(qVar, true);
        Resource resourceD2ok = ch.d2ok(qVar, false);
        if (resourceD2ok == null) {
            Log.d(f13004k, "checkMIUIXCompat resource is null. " + packageName);
            return false;
        }
        if (kja0.qrj(resourceD2ok.getParentResources())) {
            Log.d(f13004k, "parent resource is null");
        } else if (((Boolean) ld6(qVar, C1792n.zy(resourceD2ok.getParentResources().get(0), C1791k.getInstance("theme"))).first).booleanValue()) {
            m8313t(qVar, false);
        }
        C6795k.toq(C2082k.m7998k(), m8306h(packageName));
        jk(true, "checkMIUIXCompat , Notify theme changed.", packageName);
        return true;
    }

    private static boolean wvg(String runtimePath, String code, String packageName) {
        if (!TextUtils.isEmpty(runtimePath)) {
            d8wk.x2(runtimePath);
        }
        Log.i(f13004k, "resetThemeDefault: " + code);
        vyq.f7l8(code);
        C6795k.toq(C2082k.m7998k(), m8306h(packageName));
        C1824r.m7203y().ld6(f13008s, 2).toq();
        return true;
    }

    public static ArrayMap<String, Integer> x2(String packageName) {
        ArrayMap<String, Integer> arrayMap = new ArrayMap<>();
        try {
            Bundle bundle = bf2.toq.toq().getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle != null) {
                for (String str : f13003i) {
                    float f2 = bundle.getFloat(str, -1.0f);
                    if (f2 > 0.0f) {
                        arrayMap.put(str, Integer.valueOf((int) f2));
                    }
                }
            }
        } catch (Exception e2) {
            Log.w(f13004k, "getAppMIUIXVersion: " + packageName, e2);
        }
        return arrayMap;
    }

    @y9n
    /* JADX INFO: renamed from: y */
    public static synchronized void m8314y(@lvui String code) {
        String str = f60489n7h;
        Map<String, String> qVar = C1831y.toq(str, true);
        qVar.remove(code);
        C1831y.zy(qVar, str);
    }

    /* JADX INFO: renamed from: z */
    public static boolean m8315z(Activity activity) {
        if (!o1t.kja0() && C1819o.eqxt(activity) && C1781k.toq(bf2.toq.toq())) {
            String string = cdj(InterfaceC1789q.yb3p) ? bf2.toq.toq().getString(R.string.miuix_compat_contact) : cdj("mms") ? bf2.toq.toq().getString(R.string.miuix_compat_mms) : null;
            if (!TextUtils.isEmpty(string) && gc3c.cdj(activity)) {
                new ki.C6947k(activity).uv6(activity.getString(R.string.miuix_compat_dialog_title, string)).m25050z(activity.getString(R.string.miuix_compat_dialog_content, string)).dd(R.string.miuix_compat_dialog_button, null).m25037g().show();
                m8313t(InterfaceC1789q.yb3p, false);
                m8313t("mms", false);
                return true;
            }
        }
        return false;
    }

    public static boolean zurt(String code) {
        return code.endsWith(InterfaceC1789q.ol6);
    }

    @y9n
    public static boolean zy(Resource resource, String code) {
        String contentPath = new ResourceResolver(resource, new C2965z().m10535g(code)).getContentPath();
        String strX2 = p001b.toq.x2(code);
        if (!TextUtils.isEmpty(contentPath) && !TextUtils.isEmpty(strX2)) {
            File file = new File(contentPath);
            File file2 = new File(strX2);
            try {
                String strLd6 = com.android.thememanager.util.o1t.ld6(file);
                String strLd62 = com.android.thememanager.util.o1t.ld6(file2);
                Log.d(f13004k, "checkMetaHasUpdate localMd5:" + strLd6 + ",sysMD5:" + strLd62);
                jk(false, "checkMetaHasUpdate ,encodeMD5 localMd5 = " + strLd6 + ",sysMd5 = " + strLd62, code);
                return !TextUtils.equals(strLd6, strLd62);
            } catch (Exception unused) {
                if (file.exists() && file2.exists()) {
                    if (file.lastModified() > 0 && file2.lastModified() > 0) {
                        return file.lastModified() > file2.lastModified();
                    }
                    jk(false, "checkMetaHasUpdate , metaFile.lastModify = " + file.lastModified() + ",systemDataFile.lastModify = " + file2.lastModified(), code);
                }
            }
        }
        return true;
    }
}
