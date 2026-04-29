package com.android.thememanager.util;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.h5.toq;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;

/* JADX INFO: compiled from: ThemeIntentFlattenUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class py implements InterfaceC1925p {

    /* JADX INFO: renamed from: a */
    private static final String f16692a = "title";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f61391ab = "searchKey";
    private static final String an = "fixTitle";

    /* JADX INFO: renamed from: b */
    public static final String f16693b = "onlineId";
    private static final String bb = "resourceCode";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f61392bo = "pageKey";
    private static final String bp = "designerName";
    private static final String bv = "designerId";

    /* JADX INFO: renamed from: c */
    private static final String f16694c = "/wallpaperSubject";

    /* JADX INFO: renamed from: d */
    private static final String f16695d = "pageData";

    /* JADX INFO: renamed from: e */
    private static final String f16696e = "/resourcecategory";

    /* JADX INFO: renamed from: f */
    private static final String f16697f = "/account";

    /* JADX INFO: renamed from: g */
    public static final String f16698g = "/list";

    /* JADX INFO: renamed from: h */
    private static final String f16699h = "/uipages";

    /* JADX INFO: renamed from: i */
    private static final String f16700i = "/uipages/subjects/";

    /* JADX INFO: renamed from: j */
    private static final String f16701j = "/widgetSuitDetail";

    /* JADX INFO: renamed from: k */
    public static final String f16702k = "http";

    /* JADX INFO: renamed from: l */
    private static final String f16703l = "/detail";

    /* JADX INFO: renamed from: m */
    public static final String f16704m = "previewPath";

    /* JADX INFO: renamed from: n */
    public static final String f16705n = "theme";

    /* JADX INFO: renamed from: o */
    public static final String f16706o = "path";

    /* JADX INFO: renamed from: p */
    private static final String f16707p = "/page";

    /* JADX INFO: renamed from: q */
    public static final String f16708q = "https";

    /* JADX INFO: renamed from: r */
    private static final String f16709r = "/search";

    /* JADX INFO: renamed from: s */
    public static final String f16710s = "/designer";

    /* JADX INFO: renamed from: t */
    private static final String f16711t = "/web";

    /* JADX INFO: renamed from: u */
    private static final String f16712u = "pageUrl";

    /* JADX INFO: renamed from: v */
    private static final String f16713v = "category";

    /* JADX INFO: renamed from: w */
    private static final String f16714w = "directDataSearch";

    /* JADX INFO: renamed from: x */
    private static final String f16715x = "listUrl";

    /* JADX INFO: renamed from: y */
    public static final String f16716y = "/themeActivity/";

    /* JADX INFO: renamed from: z */
    private static final String f16717z = "/uipages/search/";

    private static void f7l8(Intent startIntent) {
        startIntent.putExtra(InterfaceC1357q.f53967yl, "resourcecategory");
    }

    /* JADX INFO: renamed from: g */
    private static void m9950g(Intent startIntent) {
        try {
            toq.C2071k c2071kQrj = com.android.thememanager.h5.toq.qrj(new JSONObject(startIntent.getData().getQueryParameter(f16695d)));
            c2071kQrj.f7l8(startIntent);
            if (c2071kQrj.m7972n()) {
                int qVar = c2071kQrj.toq();
                List<PageGroup> listZy = c2071kQrj.zy();
                startIntent.putExtra(InterfaceC1357q.f53969yz, qVar);
                startIntent.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) listZy);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static PageGroup m9951k(Uri dataUri) {
        PageGroup pageGroup = new PageGroup();
        String queryParameter = dataUri.getQueryParameter("category");
        if (!TextUtils.isEmpty(queryParameter)) {
            pageGroup.setResourceCode(p001b.toq.m5744q(queryParameter));
        }
        pageGroup.setTitle(dataUri.getQueryParameter("title"));
        for (int i2 = 1; i2 <= 5; i2++) {
            Page page = new Page();
            page.setTitle(dataUri.getQueryParameter("title" + i2));
            page.setKey(dataUri.getQueryParameter("pageKey" + i2));
            String queryParameter2 = dataUri.getQueryParameter(f16715x + i2);
            if (!TextUtils.isEmpty(queryParameter2)) {
                page.setListUrl(com.android.thememanager.controller.online.ld6.m7571m(InterfaceC1925p.rkfn + queryParameter2));
            }
            String queryParameter3 = dataUri.getQueryParameter(f16712u + i2);
            if (!TextUtils.isEmpty(queryParameter3)) {
                page.setItemUrl(com.android.thememanager.controller.online.ld6.nn86(InterfaceC1925p.rkfn + queryParameter3));
            }
            if (TextUtils.isEmpty(page.getKey()) && page.getListUrl() == null && page.getItemUrl() == null) {
                break;
            }
            pageGroup.addPage(page);
        }
        return pageGroup;
    }

    private static void ld6(Intent startIntent) {
        Uri data = startIntent.getData();
        startIntent.putExtra(InterfaceC1357q.f53951v5yj, data.getQueryParameter(InterfaceC1925p.nt6s));
        startIntent.putExtra(com.android.thememanager.module.detail.view.y9n.f13388v, data.getQueryParameter("trackId"));
    }

    /* JADX INFO: renamed from: n */
    private static void m9952n(Intent startIntent) {
        PageGroup pageGroupM9951k = m9951k(startIntent.getData());
        if (pageGroupM9951k.getPages().isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroupM9951k);
        startIntent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
    }

    /* JADX INFO: renamed from: p */
    private static void m9953p(Intent intent) {
        int i2;
        Uri data = intent.getData();
        intent.putExtra("uuid", data.getQueryParameter("uuid"));
        boolean booleanQueryParameter = data.getBooleanQueryParameter(InterfaceC1925p.a95z, true);
        intent.putExtra(InterfaceC1925p.a95z, booleanQueryParameter);
        try {
            i2 = Integer.parseInt(data.getQueryParameter(InterfaceC1925p.byb3));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            i2 = 0;
        }
        intent.putExtra(InterfaceC1925p.byb3, booleanQueryParameter ? Math.max(i2 - 1, 0) : 0);
    }

    /* JADX INFO: renamed from: q */
    public static void m9954q(Intent startIntent) {
        if (startIntent != null) {
            String stringExtra = startIntent.getStringExtra(com.android.thememanager.basemodule.utils.x9kr.f10438g);
            Uri data = startIntent.getData();
            if (data != null && data.getPath() != null && ("http".equals(data.getScheme()) || "theme".equals(data.getScheme()) || "https".equals(data.getScheme()))) {
                x2(startIntent);
                String path = data.getPath();
                if (path.equals(f16698g)) {
                    m9952n(startIntent);
                } else if (path.equals(f16707p)) {
                    m9950g(startIntent);
                } else if (path.startsWith(f16699h)) {
                    Log.e("ThemeIntentFlatten", "Depressed path : /uipages");
                } else if (path.startsWith(f16694c)) {
                    m9953p(startIntent);
                } else if (!path.equals(f16711t)) {
                    if (path.equals(f16709r)) {
                        m9956y(startIntent);
                    } else if (path.startsWith(f16716y)) {
                        m9955s(startIntent);
                    } else if (path.startsWith(f16710s)) {
                        zy(startIntent);
                    } else if (path.equals(f16696e)) {
                        f7l8(startIntent);
                    } else if (!path.startsWith("/detail") && !path.startsWith(f16697f) && path.startsWith(f16701j)) {
                        ld6(startIntent);
                    }
                }
                String strM7242q = com.android.thememanager.basemodule.utils.x9kr.m7242q(startIntent, com.android.thememanager.basemodule.utils.x9kr.f10438g, data, null);
                if (TextUtils.isEmpty(strM7242q)) {
                    strM7242q = "unkown";
                }
                stringExtra = strM7242q;
                startIntent.putExtra(com.android.thememanager.basemodule.utils.x9kr.f10440n, data.getBooleanQueryParameter(com.android.thememanager.basemodule.utils.x9kr.f57817f7l8, false));
                startIntent.putExtra(com.android.thememanager.basemodule.utils.x9kr.f57819zy, true);
            }
            if (TextUtils.isEmpty(stringExtra)) {
                return;
            }
            com.android.thememanager.basemodule.analysis.f7l8.toq(startIntent, stringExtra);
        }
    }

    /* JADX INFO: renamed from: s */
    private static void m9955s(Intent startIntent) {
        Uri data = startIntent.getData();
        ArrayList arrayList = new ArrayList();
        PageGroup pageGroup = new PageGroup();
        String queryParameter = data.getQueryParameter("title");
        if (!TextUtils.isEmpty(queryParameter)) {
            pageGroup.setTitle(queryParameter);
            startIntent.putExtra(InterfaceC1357q.f53866eqxt, queryParameter);
        }
        pageGroup.setUrl(data.toString());
        pageGroup.setPageGroupType(1);
        arrayList.add(pageGroup);
        startIntent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
    }

    public static String toq(String resourceCode, String resOnlineId) {
        resourceCode.hashCode();
        if (resourceCode.equals("wallpaper")) {
            return String.format("theme://zhuti.xiaomi.com/wallpaperSubject?uuid=%s&isSubject=false", resOnlineId);
        }
        return "theme://zhuti.xiaomi.com/detail/" + resOnlineId;
    }

    private static void x2(Intent startIntent) {
        Uri data = startIntent.getData();
        if (data.isHierarchical()) {
            for (String str : data.getQueryParameterNames()) {
                String strSubstring = str.length() > 2 ? str.substring(2) : "";
                String queryParameter = data.getQueryParameter(str);
                try {
                    if (str.startsWith("S.")) {
                        startIntent.putExtra(strSubstring, queryParameter);
                    } else if (str.startsWith("B.")) {
                        startIntent.putExtra(strSubstring, Boolean.parseBoolean(queryParameter));
                    } else if (str.startsWith("b.")) {
                        startIntent.putExtra(strSubstring, Byte.parseByte(queryParameter));
                    } else if (str.startsWith("c.")) {
                        startIntent.putExtra(strSubstring, queryParameter.charAt(0));
                    } else if (str.startsWith("d.")) {
                        startIntent.putExtra(strSubstring, Double.parseDouble(queryParameter));
                    } else if (str.startsWith("f.")) {
                        startIntent.putExtra(strSubstring, Float.parseFloat(queryParameter));
                    } else if (str.startsWith("i.")) {
                        startIntent.putExtra(strSubstring, Integer.parseInt(queryParameter));
                    } else if (str.startsWith("l.")) {
                        startIntent.putExtra(strSubstring, Long.parseLong(queryParameter));
                    } else if (str.startsWith("s.")) {
                        startIntent.putExtra(strSubstring, Short.parseShort(queryParameter));
                    }
                } catch (NumberFormatException e2) {
                    C2789j.qrj(C2755a.f16307g, e2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    private static void m9956y(Intent startIntent) {
        Uri data = startIntent.getData();
        String queryParameter = data.getQueryParameter(f16714w);
        String queryParameter2 = data.getQueryParameter(f61391ab);
        String queryParameter3 = data.getQueryParameter("resourceCode");
        if (Boolean.TRUE.toString().equalsIgnoreCase(queryParameter)) {
            startIntent.putExtra(InterfaceC1357q.f53905lv5, true);
        }
        if (queryParameter2 != null) {
            startIntent.putExtra(InterfaceC1357q.f53866eqxt, queryParameter2);
        }
        if (queryParameter3 != null) {
            startIntent.putExtra("REQUEST_RESOURCE_CODE", queryParameter3);
        }
    }

    private static void zy(Intent startIntent) {
        String stringExtra = startIntent.getStringExtra("designerName");
        String stringExtra2 = startIntent.getStringExtra("designerId");
        boolean booleanExtra = startIntent.getBooleanExtra(an, false);
        String string = bf2.toq.toq().getResources().getString(R.string.theme_designer_products);
        if (!booleanExtra) {
            string = stringExtra;
        }
        String strN7h = p001b.toq.n7h(startIntent.getStringExtra("resourceCode"));
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(string);
        Page page = new Page();
        page.setListUrl(com.android.thememanager.controller.online.ld6.yz(stringExtra, -1, strN7h, stringExtra2));
        page.setKey(String.format(InterfaceC1925p.kfxm, stringExtra));
        pageGroup.addPage(page);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroup);
        startIntent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        startIntent.putExtra(InterfaceC1357q.f53949uv6, 0);
        startIntent.putExtra(InterfaceC1357q.f53866eqxt, string);
        startIntent.putExtra("REQUEST_RESOURCE_CODE", p001b.toq.m5744q(strN7h));
    }
}
