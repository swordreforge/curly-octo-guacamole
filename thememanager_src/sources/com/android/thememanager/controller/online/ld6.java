package com.android.thememanager.controller.online;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.C2475s;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.fti;
import com.android.thememanager.util.gc3c;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miui.os.Build;
import org.json.JSONException;
import org.json.JSONObject;
import v5yj.C7704k;
import zy.lvui;

/* JADX INFO: compiled from: OnlineService.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 implements InterfaceC1925p, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private static long f10938g;

    /* JADX INFO: renamed from: h */
    private static String f10939h;

    /* JADX INFO: renamed from: n */
    private static String f10940n;

    /* JADX INFO: renamed from: p */
    private static String f10941p;

    /* JADX INFO: renamed from: q */
    private static String f10942q;

    /* JADX INFO: renamed from: s */
    private static String f10943s;

    /* JADX INFO: renamed from: y */
    private static String f10944y;

    /* JADX INFO: renamed from: k */
    private final com.android.thememanager.fu4 f10945k;

    /* JADX INFO: renamed from: com.android.thememanager.controller.online.ld6$k */
    /* JADX INFO: compiled from: OnlineService.java */
    class C1919k extends BroadcastReceiver {
        C1919k() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (miuix.android.content.toq.f86691ni7.equals(intent.getAction())) {
                String unused = ld6.f10942q = Build.getRegion();
                String unused2 = ld6.f10940n = miuix.os.f7l8.m26160k("ro.miui.customized.region", "");
                if (TextUtils.isEmpty(ld6.f10940n)) {
                    String unused3 = ld6.f10940n = miuix.os.f7l8.m26160k("ro.miui.cust_variant", "");
                }
                long unused4 = ld6.f10938g = System.currentTimeMillis();
            }
        }
    }

    public ld6(com.android.thememanager.fu4 context) {
        this.f10945k = context;
    }

    public static zurt a98o(String originOrder, String payResult, String productSubType) {
        zurt zurtVar = new zurt(InterfaceC1925p.cuep, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.agdp, originOrder);
        zurtVar.addParameter(InterfaceC1925p.qhx, payResult);
        if (!TextUtils.isEmpty(productSubType)) {
            zurtVar.addParameter(InterfaceC1925p.ux0, productSubType);
        }
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: b */
    public static String m7562b(String requestCode) {
        return com.android.thememanager.basemodule.network.theme.f7l8.cdj() + String.format(C1807g.zurt() ? InterfaceC1925p.i1r : InterfaceC1925p.jtf, requestCode);
    }

    public static zurt bf2() {
        return new zurt(InterfaceC1925p.iip, 1, zurt.EnumC1946k.API_PROXY);
    }

    public static long bo() {
        return f10938g;
    }

    /* JADX INFO: renamed from: c */
    public static zurt m7563c(String giftId) {
        zurt zurtVar = new zurt(InterfaceC1925p.b03g, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("giftId", giftId);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt ch(String code) {
        String str = InterfaceC1925p.asr;
        zurt zurtVar = new zurt(str, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.ivf, com.android.thememanager.v9.zy.m10217k(code));
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    public static zurt d2ok(String code) {
        String str = InterfaceC1925p.xkf;
        zurt zurtVar = new zurt(str, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.ivf, com.android.thememanager.v9.zy.m10217k(code));
        zurtVar.addParameter("deviceType", C1807g.n7h());
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    public static zurt d3(String exchangeCode, String onlineId) {
        zurt zurtVar = new zurt(InterfaceC1925p.mwew, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("code", exchangeCode);
        if (!TextUtils.isEmpty(onlineId)) {
            zurtVar.addParameter("moduleId", onlineId);
        }
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt d8wk(String moduleId, int cnt) {
        HashMap map = new HashMap();
        map.put("moduleId", moduleId);
        if (cnt > 0) {
            map.put("count", String.valueOf(cnt));
        }
        return new zurt(InterfaceC1925p.qdd, map, 1, zurt.EnumC1946k.API_PROXY);
    }

    public static zurt dr(String type) {
        zurt zurtVar = new zurt(InterfaceC1925p.yzs4, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.w3u7, type);
        zurtVar.addParameter("cardCount", String.valueOf(6));
        return zurtVar;
    }

    /* JADX INFO: renamed from: e */
    public static String m7564e() {
        return C1807g.m7079p(bf2.toq.toq());
    }

    public static zurt ek5k(String resourceCode) {
        zurt zurtVar = new zurt(InterfaceC1925p.zky5, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.ivf, com.android.thememanager.v9.zy.m10217k(resourceCode));
        return zurtVar;
    }

    public static zurt eqxt(String... moduleIds) {
        zurt zurtVar = new zurt(InterfaceC1925p.i97, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("moduleId", TextUtils.join(",", moduleIds));
        zurtVar.addParameter("deviceType", C1807g.n7h());
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: f */
    public static zurt m7565f(String giftId) {
        zurt zurtVar = new zurt(InterfaceC1925p.rst, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("giftId", giftId);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    private static String f7l8(Map<String, String> valueCapabilities) {
        String[] strArr = {AnimatedProperty.PROPERTY_NAME_W, "b", C7704k.y.toq.f44691k, "m", "h5"};
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 5; i2++) {
            sb.append(strArr[i2]);
            sb.append(",");
        }
        for (String str : valueCapabilities.keySet()) {
            sb.append(str + ":" + valueCapabilities.get(str));
            sb.append(",");
        }
        if (fti.m9733g()) {
            sb.append("vw");
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static zurt fn3e(String exchangeCode) {
        zurt zurtVar = new zurt(InterfaceC1925p.eb, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("code", exchangeCode);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static String fnq8() {
        if (f10943s == null) {
            f10943s = Build.VERSION.RELEASE + "_" + Build.VERSION.INCREMENTAL;
        }
        return f10943s;
    }

    public static zurt fti(String productId) {
        String str = InterfaceC1925p.nnx;
        zurt zurtVar = new zurt(String.format(str, productId), 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(str);
        zurtVar.setHttpMethod(zurt.toq.GET);
        return zurtVar;
    }

    public static String fu4(String id) {
        return String.format(InterfaceC1925p.yh, id);
    }

    /* JADX INFO: renamed from: g */
    public static void m7566g(zurt url, zy.C1711k info) {
        if (info == null) {
            return;
        }
        String str = info.f9807k;
        if (str == null) {
            str = "unknown";
        }
        String str2 = info.f57496toq;
        if (str2 == null) {
            str2 = "unknown";
        }
        String str3 = info.f57497zy;
        String str4 = str3 != null ? str3 : "unknown";
        url.addParameter("entryType", str);
        url.addParameter("xRef", str2);
        url.addParameter("xPrevRef", str4);
        String str5 = info.f9809q;
        if (str5 != null) {
            url.addParameter(InterfaceC1925p.l044, str5);
        }
    }

    public static zurt g1() {
        zurt zurtVar = new zurt(InterfaceC1925p.lk4, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt gbni(String keyword) {
        ArrayMap arrayMap = new ArrayMap(1);
        arrayMap.put("keywords", keyword);
        return new zurt(InterfaceC1925p.p4g, arrayMap, 1, zurt.EnumC1946k.API_PROXY);
    }

    public static zurt gvn7(String productId) {
        String str = InterfaceC1925p.fmq;
        zurt zurtVar = new zurt(String.format(str, productId), ld6(15), zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(str);
        zurtVar.setHttpMethod(zurt.toq.GET);
        return zurtVar;
    }

    public static String hb() {
        return com.android.thememanager.basemodule.utils.fu4.m7067k();
    }

    public static zurt hyr() {
        zurt zurtVar = new zurt(InterfaceC1925p.wj, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: i */
    public static zurt m7567i() {
        return new zurt(InterfaceC1925p.pxz, 1, zurt.EnumC1946k.API_PROXY);
    }

    public static zurt i1(String originOrder) {
        zurt zurtVar = new zurt(InterfaceC1925p.gn7j, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.nsr, originOrder);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt i9jn(int cardStart, boolean isFromSystemAodSettingPage) {
        zurt zurtVar = new zurt(isFromSystemAodSettingPage ? InterfaceC1925p.dymb : InterfaceC1925p.fd7p, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("cardStart", String.valueOf(cardStart));
        zurtVar.addParameter(InterfaceC1925p.jt, String.valueOf(com.android.thememanager.basemodule.network.theme.toq.toq()));
        return zurtVar;
    }

    /* JADX INFO: renamed from: j */
    public static zurt m7568j(String moduleId) {
        zurt zurtVar = new zurt(InterfaceC1925p.zky5, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("moduleId", moduleId);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt jp0y(String productId, String tagId) {
        String str = InterfaceC1925p.lqk8;
        zurt zurtVar = new zurt(String.format(str, productId), 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("tagId", tagId);
        zurtVar.setAnalyticsBaseUrl(str);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: l */
    public static zurt m7570l(String giftId, String accountNumber, boolean isAnonymous) {
        zurt zurtVar = new zurt(InterfaceC1925p.i5c, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("giftId", giftId);
        zurtVar.addParameter("number", accountNumber);
        zurtVar.addParameter(InterfaceC1925p.r07n, String.valueOf(isAnonymous));
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    private static int ld6(int original) {
        return original | 16;
    }

    public static zurt ltg8() {
        String str = InterfaceC1925p.w7ud;
        zurt zurtVar = new zurt(str, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    public static zurt lv5(int page) {
        zurt zurtVar = new zurt(InterfaceC1925p.gwj, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        zurtVar.addParameter("page", String.valueOf(page));
        return zurtVar;
    }

    /* JADX INFO: renamed from: m */
    public static zurt m7571m(String url) {
        return new zurt(url, 1, zurt.EnumC1946k.API_PROXY);
    }

    public static void m4(Context context) {
        C1919k c1919k = new C1919k();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(miuix.android.content.toq.f86691ni7);
        context.registerReceiver(c1919k, intentFilter);
    }

    public static zurt mu(String id) {
        String str = InterfaceC1925p.xky;
        zurt zurtVar = new zurt(String.format(str, id), 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    /* JADX INFO: renamed from: n */
    public static void m7572n(zurt url) {
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.f7l8.m6613s();
        c1711k.f57497zy = com.android.thememanager.basemodule.analysis.f7l8.m6614y();
        m7566g(url, c1711k);
    }

    public static zurt n5r1() {
        zurt zurtVar = new zurt(InterfaceC1925p.n2wl, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static String n7h() {
        if (f10941p == null) {
            HashMap map = new HashMap();
            int iM7181n = o1t.C1820k.m7181n();
            if (iM7181n == 7) {
                iM7181n = 6;
            } else if (iM7181n == 5) {
                iM7181n = 4;
            }
            map.put("v", Integer.toString(iM7181n + 2));
            map.put("a", Integer.toString(com.android.thememanager.basemodule.utils.o1t.m7172k()));
            f10941p = f7l8(map);
        }
        return f10941p;
    }

    public static zurt ncyb(String giftId) {
        zurt zurtVar = new zurt(InterfaceC1925p.ha, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("giftId", giftId);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt ni7(String productId, @lvui String productType) {
        zurt zurtVar = new zurt(InterfaceC1925p.pisc, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("productIds", productId);
        zurtVar.addParameter(InterfaceC1925p.ma, productType);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt nmn5(List<String> tagList, int page) {
        zurt zurtVar = new zurt(InterfaceC1925p.kyz8, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        zurtVar.addParameter("page", String.valueOf(page));
        zurtVar.addParameter("tagIds", y9n.dd(",", tagList));
        return zurtVar;
    }

    public static zurt nn86(String url) {
        return new zurt(url, 1, zurt.EnumC1946k.API_PROXY);
    }

    /* JADX INFO: renamed from: o */
    public static zurt m7573o(String... moduleIds) {
        zurt zurtVar = new zurt(InterfaceC1925p.e0l, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.v4, TextUtils.join(",", moduleIds));
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static String o1t() {
        if (f10940n == null) {
            String strM26160k = miuix.os.f7l8.m26160k("ro.miui.customized.region", "");
            f10940n = strM26160k;
            if (TextUtils.isEmpty(strM26160k)) {
                f10940n = miuix.os.f7l8.m26160k("ro.miui.cust_variant", "");
            }
        }
        return f10940n;
    }

    public static zurt oc(String moduleId, String category) {
        zurt zurtVar = new zurt(InterfaceC1925p.ig, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("moduleId", moduleId);
        zurtVar.addParameter(InterfaceC1925p.ivf, category);
        zurtVar.addParameter("deviceType", C1807g.n7h());
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: p */
    public static zurt m7574p(String activityId) {
        zurt zurtVar = new zurt(InterfaceC1925p.l2gm, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.j60k, "SHARE_BEHAVIOR_CONDITION");
        zurtVar.addParameter(InterfaceC1925p.zht, activityId);
        zurtVar.addParameter("contentType", "H5_PAGE");
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt py(int count) {
        zurt zurtVar = new zurt(InterfaceC1925p.y84p, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("count", String.valueOf(count));
        zurtVar.setHttpMethod(zurt.toq.GET);
        return zurtVar;
    }

    public static String qkj8() {
        if (f10944y == null) {
            f10944y = miuix.core.util.x2.f87403zy;
        }
        return f10944y;
    }

    public static zurt qo(String id, String resourceStamp) {
        String str;
        int iLd6 = ld6(1);
        if (C1688q.cdj().o1t()) {
            iLd6 |= 12;
            str = String.format(InterfaceC1925p.mqz, id);
        } else {
            str = String.format(InterfaceC1925p.sy9g, id);
        }
        zurt zurtVar = new zurt(str, iLd6, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("category", resourceStamp);
        zurtVar.addParameter(InterfaceC1925p.fp, "2");
        zurtVar.setAnalyticsBaseUrl(C1688q.cdj().o1t() ? InterfaceC1925p.mqz : InterfaceC1925p.sy9g);
        m7572n(zurtVar);
        return zurtVar;
    }

    public static String qrj() {
        if (f10939h == null) {
            f10939h = Integer.toString(C2475s.f14622n);
        }
        return f10939h;
    }

    public static zurt r8s8(String subjectUuid, int page, String type, boolean isSubject) {
        String str = InterfaceC1925p.zhll;
        zurt zurtVar = new zurt(str, ld6(1), zurt.EnumC1946k.API_PROXY);
        if (!TextUtils.isEmpty(subjectUuid)) {
            zurtVar.addParameter("uuid", subjectUuid);
            zurtVar.addParameter(InterfaceC1925p.a95z, String.valueOf(isSubject));
        }
        zurtVar.addParameter("type", type);
        zurtVar.addParameter("cardStart", String.valueOf(page));
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    /* JADX INFO: renamed from: s */
    public static Map<String, Boolean> m7576s(@lvui String productType, String productId) throws C1922n, JSONException, IOException {
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject(C1915g.f7l8(ni7(productId, productType)));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
        }
        return map;
    }

    /* JADX INFO: renamed from: t */
    public static zurt m7577t(String designerName, int cnt, String category) {
        zurt zurtVar = new zurt(InterfaceC1925p.l9, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("designer", designerName);
        if (cnt > 0) {
            zurtVar.addParameter("count", String.valueOf(cnt));
        }
        zurtVar.addParameter("category", category);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt t8iq(List<String> subscribeIds, List<String> unsubscribeIds, String magazineType) {
        zurt zurtVar = new zurt(InterfaceC1925p.p1s7, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        zurtVar.addParameter(InterfaceC1925p.uf5, y9n.dd(",", subscribeIds));
        zurtVar.addParameter(InterfaceC1925p.mcy, y9n.dd(",", unsubscribeIds));
        zurtVar.addParameter(InterfaceC1925p.h97, magazineType);
        return zurtVar;
    }

    public static zurt t8r(String[] onlineIds, @lvui String productType) {
        zurt zurtVar = new zurt(InterfaceC1925p.pisc, 15, zurt.EnumC1946k.API_PROXY);
        if (InterfaceC1789q.b3.equals(productType)) {
            zurtVar.addParameter("productIds", TextUtils.join(",", onlineIds));
        } else if ("WIDGET_SUIT".equals(productType)) {
            zurtVar.addParameter(InterfaceC1925p.wc, TextUtils.join(",", onlineIds));
        } else {
            zurtVar.addParameter("packIds", TextUtils.join(",", onlineIds));
        }
        zurtVar.addParameter(InterfaceC1925p.ma, productType);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt tfm(String id) {
        String str = InterfaceC1925p.u9o;
        zurt zurtVar = new zurt(String.format(str, id), 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("cardCount", String.valueOf(1));
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    /* JADX INFO: renamed from: u */
    public static String m7578u() {
        if (f10942q == null) {
            f10942q = C2755a.m9602k();
        }
        return f10942q;
    }

    public static zurt vq(String source, String payload) {
        zurt zurtVar = new zurt(InterfaceC1925p.oml3, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("source", source);
        zurtVar.addParameter(InterfaceC1925p.hkfy, payload);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static Map<String, String> was(int requestFlag) {
        HashMap map = new HashMap();
        if ((requestFlag & 32) == 0) {
            map.put("device", C1807g.m7073g());
            map.put("deviceType", C1807g.n7h());
            map.put("region", m7578u());
            map.put(InterfaceC1925p.f8, String.valueOf(miui.os.Build.IS_INTERNATIONAL_BUILD));
            map.put("system", qkj8());
            map.put("version", fnq8());
            map.put(InterfaceC1925p.d7ek, C1807g.ld6());
            map.put("alpha", String.valueOf(miui.os.Build.IS_ALPHA_BUILD));
            map.put("language", hb());
            map.put("capability", n7h());
            map.put("apk", qrj());
            map.put("devicePixel", String.valueOf(gc3c.x2()));
            map.put(InterfaceC1925p.kn, C1807g.m7082s());
            if ((requestFlag & 16) != 0) {
                map.put("model", com.android.thememanager.ad.zy.toq());
                map.put(InterfaceC1925p.q6c, com.android.thememanager.ad.zy.m6536k());
                map.put("packageName", com.android.thememanager.ad.zy.m6537q());
                map.put("networkType", String.valueOf(com.android.thememanager.ad.zy.zy()));
                map.put(InterfaceC1925p.tx8q, String.valueOf(C1807g.x9kr()));
            }
            if (!C1781k.n7h()) {
                map.put(InterfaceC1925p.imy, String.valueOf(Boolean.FALSE));
            }
            if (!C1781k.qrj().equals("ERROR")) {
                map.put(InterfaceC1925p.glf, C1781k.qrj());
            }
        }
        if (!TextUtils.isEmpty(C1807g.qrj())) {
            map.put("oaid", C1807g.qrj());
        } else if (!TextUtils.isEmpty(C1807g.m7075i())) {
            map.put("vaid", C1807g.m7075i());
        } else if (!TextUtils.isEmpty(C1807g.m7079p(bf2.toq.toq()))) {
            map.put("imei", C1807g.m7079p(bf2.toq.toq()));
        }
        C1724k.m6723p().qrj(map);
        return map;
    }

    public static zurt wvg(String source, String payload) {
        zurt zurtVar = new zurt(InterfaceC1925p.oml3, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("source", source);
        zurtVar.addParameter(InterfaceC1925p.hkfy, payload);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt x2(int page) {
        zurt zurtVar = new zurt(InterfaceC1925p.bk3, 15, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("page", String.valueOf(page));
        zurtVar.addParameter("deviceType", C1807g.n7h());
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt x9kr() {
        zurt zurtVar = new zurt(InterfaceC1925p.gle, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: y */
    public static Map<String, Boolean> m7579y(@lvui String productType, String... onlineIds) throws C1922n, JSONException, IOException {
        HashMap map = new HashMap();
        JSONObject jSONObject = new JSONObject(C1915g.f7l8(t8r(onlineIds, productType)));
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, Boolean.valueOf(jSONObject.getBoolean(next)));
        }
        return map;
    }

    public static zurt y9n(String designerName, int cnt, String category, String designerId, String designerMiId) {
        zurt zurtVar = new zurt(InterfaceC1925p.l9, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("designer", designerName);
        zurtVar.addParameter("designerId", designerId);
        zurtVar.addParameter("designerMiId", designerMiId);
        if (cnt > 0) {
            zurtVar.addParameter("count", String.valueOf(cnt));
        }
        zurtVar.addParameter("category", category);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt yz(String designerName, int cnt, String category, String designerId) {
        zurt zurtVar = new zurt(InterfaceC1925p.l9, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("designer", designerName);
        zurtVar.addParameter("designerId", designerId);
        if (cnt > 0) {
            zurtVar.addParameter("count", String.valueOf(cnt));
        }
        zurtVar.addParameter("category", category);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: z */
    public static zurt m7580z(String onlineId, boolean buyExchangeCode, @lvui String productType, Map<String, String> verifyMap) {
        zurt zurtVar = new zurt(InterfaceC1925p.ggnn, 15, zurt.EnumC1946k.API_PROXY);
        if (!TextUtils.isEmpty(com.android.thememanager.basemodule.analysis.zy.zy())) {
            zurtVar.addParameter("moduleId", com.android.thememanager.basemodule.analysis.zy.zy());
        }
        if (buyExchangeCode) {
            zurtVar.addParameter(InterfaceC1925p.zogz, "3");
        }
        if (InterfaceC1789q.b3.equals(productType)) {
            zurtVar.addParameter("productId", onlineId);
        } else if ("WIDGET_SUIT".equals(productType)) {
            zurtVar.addParameter(InterfaceC1925p.nt6s, onlineId);
        } else {
            zurtVar.addParameter(InterfaceC1925p.u02, onlineId);
        }
        if (C1688q.cdj().jk()) {
            zurtVar.addParameter(C1774q.bl, C1774q.as);
        }
        if (verifyMap != null && !verifyMap.isEmpty()) {
            String str = verifyMap.get(InterfaceC1925p.du);
            if (!TextUtils.isEmpty(str)) {
                zurtVar.addParameter(InterfaceC1925p.du, str);
            }
            String str2 = verifyMap.get(InterfaceC1925p.dqjj);
            if (!TextUtils.isEmpty(str2)) {
                zurtVar.addParameter(InterfaceC1925p.dqjj, str2);
            }
            String str3 = verifyMap.get(InterfaceC1925p.v7x);
            if (!TextUtils.isEmpty(str3)) {
                zurtVar.addParameter(InterfaceC1925p.v7x, str3);
            }
            String str4 = verifyMap.get(InterfaceC1925p.nou);
            if (!TextUtils.isEmpty(str4)) {
                zurtVar.addParameter(InterfaceC1925p.nou, str4);
            }
            String str5 = verifyMap.get("price");
            if (!TextUtils.isEmpty(str5)) {
                zurtVar.addParameter("price", str5);
            }
        }
        zurtVar.addParameter(InterfaceC1925p.u02, onlineId);
        zurtVar.addParameter(InterfaceC1925p.ma, productType);
        m7572n(zurtVar);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public static zurt zsr0(String scene) {
        zurt zurtVar = new zurt(InterfaceC1925p.uqa, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.fzr, scene);
        zurtVar.addParameter("page", "wallpaperFeed/subjectPage/subjectPage");
        zurtVar.addParameter("width", "190");
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    /* JADX INFO: renamed from: a */
    public zurt m7581a() {
        String str = InterfaceC1925p.psl;
        zurt zurtVarNn86 = nn86(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarNn86.setAnalyticsBaseUrl(str);
        return zurtVarNn86;
    }

    public zurt a9(String id, zy.C1711k info) {
        String str = InterfaceC1925p.pia;
        zurt zurtVar = new zurt(String.format(str, id), 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("category", this.f10945k.getResourceStamp());
        zurtVar.setAnalyticsBaseUrl(str);
        m7566g(zurtVar, info);
        return zurtVar;
    }

    public zurt c8jq(String body) {
        zurt zurtVar = new zurt(InterfaceC1925p.bxas, 0, zurt.EnumC1946k.NONE);
        m7572n(zurtVar);
        zurtVar.setHttpMethod(zurt.toq.POST);
        try {
            zurtVar.setUserPostBody(URLEncoder.encode(body, com.xiaomi.accountsdk.request.wvg.f72949toq));
        } catch (UnsupportedEncodingException e2) {
            Log.e(C2755a.f16307g, "URLEncode body failed", e2);
            zurtVar.setUserPostBody(body);
        }
        return zurtVar;
    }

    public zurt cdj() {
        String resourceStamp = this.f10945k.getResourceStamp();
        String str = InterfaceC1925p.jqd;
        zurt zurtVar = new zurt(String.format(str, resourceStamp), 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    /* JADX INFO: renamed from: d */
    public String m7582d() {
        return String.format(InterfaceC1925p.im8v, this.f10945k.getResourceStamp());
    }

    public String dd() {
        return String.format(InterfaceC1925p.wg, this.f10945k.getResourceStamp());
    }

    public zurt gyi(String filterText) {
        String str = InterfaceC1925p.a0w;
        HashMap map = new HashMap();
        map.put("keywords", filterText);
        map.put("count", InterfaceC1925p.jvci);
        map.put("category", this.f10945k.getResourceStamp());
        return new zurt(str, map, 1, zurt.EnumC1946k.API_PROXY);
    }

    /* JADX INFO: renamed from: h */
    public String m7583h() {
        return String.format(InterfaceC1925p.rp0, this.f10945k.getResourceStamp());
    }

    public zurt ikck() {
        String str = InterfaceC1925p.bvq;
        zurt zurtVarM7571m = m7571m(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarM7571m.setAnalyticsBaseUrl(str);
        return zurtVarM7571m;
    }

    public zurt jk(String[] moduleIds, boolean isUpdate) {
        zurt zurtVar = new zurt(InterfaceC1925p.xt8, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("ids", TextUtils.join(",", moduleIds));
        zurtVar.addParameter("category", this.f10945k.getResourceStamp());
        zurtVar.addParameter(InterfaceC1925p.nmft, String.valueOf(isUpdate));
        m7572n(zurtVar);
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public zurt ki(List<String> hashs) {
        zurt zurtVar = new zurt(InterfaceC1925p.crp8, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.b7sa, TextUtils.join(",", hashs.toArray(new String[0])));
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }

    public zurt kja0() {
        String str = InterfaceC1925p.loce;
        zurt zurtVarNn86 = nn86(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarNn86.setAnalyticsBaseUrl(str);
        return zurtVarNn86;
    }

    public zurt lrht() {
        String str = InterfaceC1925p.u7mb;
        zurt zurtVar = new zurt(str, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.fp, String.valueOf(1));
        zurtVar.addParameter(InterfaceC1925p.ivf, com.android.thememanager.v9.zy.m10217k(this.f10945k.getResourceCode()));
        zurtVar.addParameter("cardCount", String.valueOf(Integer.MAX_VALUE));
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    public zurt lvui() {
        String str = InterfaceC1925p.omp0;
        zurt zurtVarNn86 = nn86(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarNn86.setAnalyticsBaseUrl(str);
        return zurtVarNn86;
    }

    public zurt mcp(String id) {
        String str;
        int i2 = 1;
        if (C1688q.cdj().o1t()) {
            str = String.format(InterfaceC1925p.k5dw, id);
            i2 = 13;
        } else {
            str = String.format(InterfaceC1925p.ivg, id);
        }
        zurt zurtVar = new zurt(str, i2, zurt.EnumC1946k.API_PROXY);
        zurtVar.setAnalyticsBaseUrl(C1688q.cdj().o1t() ? InterfaceC1925p.k5dw : InterfaceC1925p.ivg);
        zurtVar.addParameter("category", this.f10945k.getResourceStamp());
        m7572n(zurtVar);
        return zurtVar;
    }

    /* JADX INFO: renamed from: r */
    public zurt m7584r() {
        String str = InterfaceC1925p.il;
        zurt zurtVarM7571m = m7571m(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarM7571m.setAnalyticsBaseUrl(str);
        return zurtVarM7571m;
    }

    public zurt uv6() {
        String str = InterfaceC1925p.wgc;
        zurt zurtVar = new zurt(str, ld6(1), zurt.EnumC1946k.API_PROXY);
        if ("wallpaper".equals(this.f10945k.getResourceCode()) || "theme".equals(this.f10945k.getResourceCode()) || "hybrid".equals(this.f10945k.getResourceCode())) {
            zurtVar.addParameter(InterfaceC1925p.fp, String.valueOf(1));
        }
        zurtVar.addParameter(InterfaceC1925p.ivf, com.android.thememanager.v9.zy.m10217k(this.f10945k.getResourceCode()));
        zurtVar.addParameter("cardCount", String.valueOf(Integer.MAX_VALUE));
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    /* JADX INFO: renamed from: v */
    public zurt m7585v() {
        String str = InterfaceC1925p.hohe;
        zurt zurtVarNn86 = nn86(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarNn86.setAnalyticsBaseUrl(str);
        return zurtVarNn86;
    }

    public zurt vyq() {
        String str = InterfaceC1925p.wgc;
        zurt zurtVar = new zurt(str, ld6(1), zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.fp, String.valueOf(1));
        zurtVar.addParameter(InterfaceC1925p.ivf, "HYBRID");
        zurtVar.addParameter("cardCount", String.valueOf(Integer.MAX_VALUE));
        zurtVar.setAnalyticsBaseUrl(str);
        return zurtVar;
    }

    public zurt wo(String hash, String moduleId, zy.C1711k info) {
        String str = InterfaceC1925p.oklc;
        zurt zurtVar = new zurt(String.format(str, hash), 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("category", this.f10945k.getResourceStamp());
        zurtVar.addParameter("moduleId", moduleId);
        zurtVar.setAnalyticsBaseUrl(str);
        m7566g(zurtVar, info);
        return zurtVar;
    }

    /* JADX INFO: renamed from: x */
    public String m7586x() {
        return String.format(InterfaceC1925p.wwa, this.f10945k.getResourceStamp());
    }

    public zurt xwq3(String keyword, String color, int flag) {
        String str = InterfaceC1925p.s7;
        HashMap map = new HashMap();
        map.put(InterfaceC1925p.xzve, "1");
        map.put("keywords", keyword);
        map.put("color", color);
        map.put("category", this.f10945k.getResourceStamp());
        map.put(InterfaceC1925p.l1l1, String.valueOf(flag));
        return new zurt(str, map, 1, zurt.EnumC1946k.API_PROXY);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.thememanager.controller.online.zurt y2(java.lang.String r4, java.lang.String r5, android.util.Pair<java.lang.String, java.lang.String> r6, java.lang.String r7, int r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.online.ld6.y2(java.lang.String, java.lang.String, android.util.Pair, java.lang.String, int, java.lang.String, boolean, boolean):com.android.thememanager.controller.online.zurt");
    }

    public zurt zp() {
        String str = InterfaceC1925p.dsx;
        zurt zurtVarM7571m = m7571m(String.format(str, this.f10945k.getResourceStamp()));
        zurtVarM7571m.setAnalyticsBaseUrl(str);
        return zurtVarM7571m;
    }

    public zurt zurt(List<String> hashs, String curComponentOnlineIdsJson) {
        zurt zurtVar = new zurt(InterfaceC1925p.su, 1, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter(InterfaceC1925p.b7sa, TextUtils.join(",", hashs.toArray(new String[0])));
        if (!TextUtils.isEmpty(curComponentOnlineIdsJson)) {
            zurtVar.addParameter(InterfaceC1925p.ea, curComponentOnlineIdsJson);
        }
        zurtVar.setHttpMethod(zurt.toq.POST);
        return zurtVar;
    }
}
