package com.android.thememanager.basemodule.network.theme.interceptors;

import android.text.TextUtils;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.mcp;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.qrj;
import com.miui.maml.folme.AnimatedProperty;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import miui.os.Build;
import okhttp3.fti;
import okhttp3.jk;
import okhttp3.jp0y;
import okhttp3.ni7;
import okhttp3.t8r;
import okhttp3.zurt;
import okio.n7h;
import okio.x2;
import v5yj.C7704k;
import yz.C7794k;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.network.theme.interceptors.q */
/* JADX INFO: compiled from: ParamInterceptor.java */
/* JADX INFO: loaded from: classes.dex */
public class C1774q implements ni7 {

    /* JADX INFO: renamed from: a */
    private static final String f10081a = "packageName";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f57596ab = "isMiuiLiteAndStoke";
    private static final String an = "isSupportPaidWidgets";
    public static final String as = "child";
    private static final String az = "no_cached_params";

    /* JADX INFO: renamed from: b */
    private static final String f10082b = "adCountry";
    private static final String bb = "isMiuiLitePlus";
    private static final String[] bg = {"networkType", "signature"};
    public static final String bl = "accountType";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f57597bo = "signature";
    private static final String bp = "isPersonalizedAdEnabled";
    private static final String bv = "deviceType";

    /* JADX INFO: renamed from: c */
    private static final String f10083c = "imei";

    /* JADX INFO: renamed from: d */
    private static final String f10084d = "xRef";

    /* JADX INFO: renamed from: e */
    private static final String f10085e = "oaid";

    /* JADX INFO: renamed from: f */
    private static final String f10086f = "hwVersion";

    /* JADX INFO: renamed from: g */
    private static final String f10087g = "region";

    /* JADX INFO: renamed from: h */
    private static final String f10088h = "miuiUIVersion";

    /* JADX INFO: renamed from: i */
    private static final String f10089i = "alpha";
    private static final String id = "isSupportLargeIcons";
    private static final String in = "supportVideoWallpaper";

    /* JADX INFO: renamed from: j */
    private static final String f10090j = "vaid";

    /* JADX INFO: renamed from: k */
    private static final String f10091k = "ParamInterceptor";

    /* JADX INFO: renamed from: l */
    private static final String f10092l = "devicePixel";

    /* JADX INFO: renamed from: m */
    private static final String f10093m = "model";

    /* JADX INFO: renamed from: n */
    private static final String f10094n = "device";

    /* JADX INFO: renamed from: o */
    private static final String f10095o = "personal";

    /* JADX INFO: renamed from: p */
    private static final String f10096p = "version";

    /* JADX INFO: renamed from: q */
    private static String f10097q = null;

    /* JADX INFO: renamed from: r */
    private static final String f10098r = "apk";

    /* JADX INFO: renamed from: s */
    private static final String f10099s = "system";

    /* JADX INFO: renamed from: t */
    private static final String f10100t = "capability";

    /* JADX INFO: renamed from: u */
    private static final String f10101u = "restrictImei";

    /* JADX INFO: renamed from: v */
    private static final String f10102v = "entryType";

    /* JADX INFO: renamed from: w */
    private static final String f10103w = "xPrevRef";

    /* JADX INFO: renamed from: x */
    private static final String f10104x = "networkType";

    /* JADX INFO: renamed from: y */
    private static final String f10105y = "isGlobal";

    /* JADX INFO: renamed from: z */
    private static final String f10106z = "language";

    static jk f7l8(jk request) {
        if (!"GET".equals(request.qrj()) || TextUtils.isEmpty(request.m27311s(az))) {
            return request;
        }
        zurt.C7535k c7535kGvn7 = request.cdj().gvn7();
        for (String str : request.m27311s(az).split("&")) {
            if (!TextUtils.isEmpty(str)) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length == 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                    c7535kGvn7.f7l8(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return request.n7h().m27315i(az).jk(c7535kGvn7.m27539y()).toq();
    }

    /* JADX INFO: renamed from: g */
    private HashMap<String, String> m6887g(jk request) {
        HashMap<String, String> map = new HashMap<>();
        int i2 = 0;
        if ("GET".equals(request.qrj())) {
            zurt zurtVarCdj = request.cdj();
            while (i2 < zurtVarCdj.m27512f()) {
                map.put(zurtVarCdj.ncyb(i2), zurtVarCdj.n5r1(i2));
                i2++;
            }
        } else if ("POST".equals(request.qrj()) && (request.m27305g() instanceof t8r)) {
            new t8r.C7530k();
            t8r t8rVar = (t8r) request.m27305g();
            while (i2 < t8rVar.ni7()) {
                map.put(t8rVar.zurt(i2), t8rVar.fu4(i2));
                i2++;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: n */
    private static String m6888n() {
        if (f10097q == null) {
            HashMap map = new HashMap();
            int iM7181n = o1t.C1820k.m7181n();
            if (iM7181n == 7) {
                iM7181n = 6;
            } else if (iM7181n == 5) {
                iM7181n = 4;
            }
            map.put("v", Integer.toString(iM7181n + 2));
            map.put("a", Integer.toString(o1t.m7172k()));
            f10097q = toq(map);
        }
        return f10097q;
    }

    /* JADX INFO: renamed from: q */
    private String m6889q(jk request) {
        URI uriM27511e = request.cdj().m27511e();
        try {
            return new URI(uriM27511e.getScheme(), uriM27511e.getAuthority(), uriM27511e.getPath(), null).toString();
        } catch (Exception e2) {
            C7794k.zy(f10091k, "getBaseUrlFromRequest", e2);
            return "";
        }
    }

    private static String toq(Map<String, String> valueCapabilities) {
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
        if (a9.ni7(bf2.toq.toq())) {
            sb.append("vw");
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /* JADX INFO: renamed from: y */
    private jk m6890y(jk request, HashMap<String, String> finalParamsMap, String signature) {
        if ("GET".equals(request.qrj())) {
            zurt.C7535k c7535kGvn7 = request.cdj().gvn7();
            for (Map.Entry<String, String> entry : finalParamsMap.entrySet()) {
                c7535kGvn7.oc(entry.getKey());
                c7535kGvn7.f7l8(entry.getKey(), entry.getValue());
            }
            if (!TextUtils.isEmpty(signature)) {
                c7535kGvn7.f7l8("signature", signature);
            }
            return request.n7h().jk(c7535kGvn7.m27539y()).toq();
        }
        if (!"POST".equals(request.qrj()) || !(request.m27305g() instanceof t8r)) {
            return request;
        }
        t8r.C7530k c7530k = new t8r.C7530k();
        for (Map.Entry<String, String> entry2 : finalParamsMap.entrySet()) {
            if (entry2.getValue() == null) {
                C7794k.m28196p(f10091k, "warning!!! value == null for " + entry2.getKey());
            } else {
                c7530k.m27472k(entry2.getKey(), entry2.getValue());
            }
        }
        zurt.C7535k c7535kGvn72 = request.cdj().gvn7();
        if (!TextUtils.isEmpty(signature)) {
            c7535kGvn72.f7l8("signature", signature);
        }
        return request.n7h().jk(c7535kGvn72.m27539y()).ki(c7530k.zy()).toq();
    }

    static jk zy(jk request) {
        if (!"GET".equals(request.qrj())) {
            return request;
        }
        zurt zurtVarCdj = request.cdj();
        zurt.C7535k c7535kGvn7 = zurtVarCdj.gvn7();
        StringBuilder sb = new StringBuilder();
        for (String str : bg) {
            String strX9kr = zurtVarCdj.x9kr(str);
            if (!TextUtils.isEmpty(strX9kr)) {
                sb.append(str);
                sb.append(":");
                sb.append(strX9kr);
                sb.append("&");
                c7535kGvn7.oc(str);
            }
        }
        return !TextUtils.isEmpty(sb.toString()) ? request.n7h().m27316k(az, sb.toString()).jk(c7535kGvn7.m27539y()).toq() : request;
    }

    @Override // okhttp3.ni7
    /* JADX INFO: renamed from: k */
    public fti mo6886k(ni7.InterfaceC7521k chain) throws IOException {
        int i2;
        String strZy;
        jk jkVarZy = chain.zy();
        if (TextUtils.isEmpty(jkVarZy.m27311s("request_flag"))) {
            i2 = 0;
        } else {
            try {
                i2 = Integer.parseInt(jkVarZy.m27311s("request_flag"));
            } catch (Exception unused) {
                i2 = 0;
            }
        }
        HashMap<String, String> mapM6887g = m6887g(jkVarZy);
        if ((i2 & 1) != 0) {
            mapM6887g.put("device", C1807g.m7073g());
            mapM6887g.put("region", C1807g.kja0());
            mapM6887g.put("isGlobal", String.valueOf(C1807g.o1t()));
            mapM6887g.put("system", C1807g.m7074h());
            mapM6887g.put("version", C1807g.cdj());
            mapM6887g.put("miuiUIVersion", C1807g.ld6());
            mapM6887g.put("alpha", String.valueOf(Build.IS_ALPHA_BUILD));
            mapM6887g.put("language", fu4.m7067k());
            mapM6887g.put("capability", m6888n());
            mapM6887g.put("apk", String.valueOf(a9.f7l8(bf2.toq.toq())));
            mapM6887g.put("devicePixel", String.valueOf(C1819o.jk(bf2.toq.toq())));
            mapM6887g.put("hwVersion", C1807g.m7082s());
            mapM6887g.put(f57596ab, String.valueOf(C1807g.jp0y()));
            mapM6887g.put("deviceType", C1807g.n7h());
            mapM6887g.put(bb, String.valueOf(C1807g.oc()));
            mapM6887g.put("isSupportPaidWidgets", String.valueOf(a9.toq()));
            mapM6887g.put("isSupportLargeIcons", String.valueOf(C1807g.m7077l()));
            mapM6887g.put(in, String.valueOf(qrj.m7199q(qrj.toq.VIDEO_WALLPAPER)));
            if (C1688q.cdj().jk()) {
                mapM6887g.put(bl, as);
            }
            if (!C1781k.n7h()) {
                mapM6887g.put("personal", String.valueOf(Boolean.FALSE));
            }
            if (!C1781k.qrj().equals("ERROR")) {
                mapM6887g.put("isPersonalizedAdEnabled", C1781k.qrj());
            }
        }
        if (!TextUtils.isEmpty(C1807g.qrj())) {
            mapM6887g.put("oaid", C1807g.qrj());
        } else if (!TextUtils.isEmpty(C1807g.m7075i())) {
            mapM6887g.put("vaid", C1807g.m7075i());
        } else if (!TextUtils.isEmpty(C1807g.m7079p(bf2.toq.toq()))) {
            mapM6887g.put("imei", C1807g.m7079p(bf2.toq.toq()));
        }
        C1724k.m6723p().qrj(mapM6887g);
        if ((i2 & 16) != 0) {
            mapM6887g.put("model", C1807g.x2());
            mapM6887g.put("adCountry", C1807g.zy());
            mapM6887g.put("packageName", a9.m6992g(bf2.toq.toq()));
            mapM6887g.put("networkType", String.valueOf(mcp.zy(bf2.toq.toq())));
            mapM6887g.put("restrictImei", String.valueOf(C1807g.x9kr()));
        }
        if (i2 != 0) {
            mapM6887g.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g() != null ? com.android.thememanager.basemodule.analysis.f7l8.m6607g() : "unknow");
            mapM6887g.put("xRef", com.android.thememanager.basemodule.analysis.f7l8.m6613s() != null ? com.android.thememanager.basemodule.analysis.f7l8.m6613s() : "unknow");
            mapM6887g.put("xPrevRef", com.android.thememanager.basemodule.analysis.f7l8.m6614y() != null ? com.android.thememanager.basemodule.analysis.f7l8.m6614y() : "unknow");
        }
        mapM6887g.put("aodGray", Boolean.toString(C1819o.m7159l()));
        if ((i2 & 4) == 0 || !C1688q.cdj().o1t()) {
            strZy = "";
        } else {
            C7794k.toq(f10091k, "Fail to get auth url because of mising token: " + jkVarZy.cdj());
            com.android.thememanager.basemodule.network.theme.zy.toq(mapM6887g, C1688q.cdj().fn3e());
            strZy = com.android.thememanager.basemodule.network.theme.zy.zy(m6889q(jkVarZy), mapM6887g, jkVarZy.qrj(), C1688q.cdj().fn3e());
        }
        fti ftiVarMo27071q = chain.mo27071q(zy(m6890y(jkVarZy, mapM6887g, strZy).n7h().m27315i("request_flag").toq()));
        fti ftiVarZy = ftiVarMo27071q.ij().a9(f7l8(ftiVarMo27071q.wlev())).zy();
        if (!ftiVarZy.m26884s() || (i2 & 8) == 0) {
            return ftiVarZy;
        }
        jp0y jp0yVarHyr = ftiVarZy.hyr();
        n7h n7hVarY9n = jp0yVarHyr.y9n();
        n7hVarY9n.bf2(Long.MAX_VALUE);
        x2 x2VarMo27612n = n7hVarY9n.mo27612n();
        Charset charsetDefaultCharset = Charset.defaultCharset();
        okhttp3.fu4 fu4VarMo27094h = jp0yVarHyr.mo27094h();
        if (fu4VarMo27094h != null) {
            charsetDefaultCharset = fu4VarMo27094h.m26904g(charsetDefaultCharset);
        }
        return ftiVarZy.ij().toq(jp0y.wvg(fu4VarMo27094h, com.android.thememanager.basemodule.network.theme.zy.m6893k(x2VarMo27612n.clone().se(charsetDefaultCharset), C1688q.cdj().fn3e()))).zy();
    }
}
