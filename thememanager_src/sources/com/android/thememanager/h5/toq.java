package com.android.thememanager.h5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.util.py;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PageConfiguration.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f60302cdj = "homeIndex";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f60303f7l8 = "themenative";

    /* JADX INFO: renamed from: g */
    private static final String f12246g = "PageConfiguration";

    /* JADX INFO: renamed from: h */
    private static final String f12247h = "pageInfo";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f60304ki = "tabs";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f60305kja0 = "searchResultH5url";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f60306ld6 = "value";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f60307n7h = "searchButton";

    /* JADX INFO: renamed from: p */
    private static final String f12248p = "md5";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f60308qrj = "title";

    /* JADX INFO: renamed from: s */
    private static final String f12249s = "versionCode";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f60309x2 = "url";

    /* JADX INFO: renamed from: y */
    public static final String f12250y = "themenative://page";

    /* JADX INFO: renamed from: k */
    private boolean f12251k;

    /* JADX INFO: renamed from: n */
    private Map<String, C2071k> f12252n = new HashMap();

    /* JADX INFO: renamed from: q */
    private boolean f12253q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f60310toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60311zy;

    /* JADX INFO: renamed from: com.android.thememanager.h5.toq$k */
    /* JADX INFO: compiled from: PageConfiguration.java */
    public static class C2071k {

        /* JADX INFO: renamed from: k */
        private int f12254k;

        /* JADX INFO: renamed from: n */
        private Intent f12255n;

        /* JADX INFO: renamed from: q */
        private String f12256q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private List<C7921toq> f60312toq = new ArrayList();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private List<PageGroup> f60313zy;

        public void f7l8(Intent startIntent) {
            this.f12255n = startIntent;
        }

        /* JADX INFO: renamed from: g */
        void m7970g(int homeIndex) {
            this.f12254k = homeIndex;
        }

        /* JADX INFO: renamed from: k */
        void m7971k(C7921toq tab) {
            this.f60312toq.add(tab);
        }

        /* JADX INFO: renamed from: n */
        public boolean m7972n() {
            int i2;
            if (this.f60312toq.isEmpty() || (i2 = this.f12254k) < 0 || i2 >= this.f60312toq.size()) {
                return false;
            }
            ThemeApplication qVar = C2082k.zy().toq();
            Iterator<C7921toq> it = this.f60312toq.iterator();
            while (it.hasNext()) {
                if (it.next().m7974k(qVar, this.f12255n) == null) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: q */
        public List<C7921toq> m7973q() {
            return this.f60312toq;
        }

        public int toq() {
            return this.f12254k;
        }

        public List<PageGroup> zy() {
            if (this.f60313zy == null || !TextUtils.equals(fu4.m7067k(), this.f12256q)) {
                this.f60313zy = new ArrayList();
                ThemeApplication qVar = C2082k.zy().toq();
                Iterator<C7921toq> it = this.f60312toq.iterator();
                while (it.hasNext()) {
                    this.f60313zy.add(it.next().m7974k(qVar, this.f12255n));
                }
            }
            return this.f60313zy;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.h5.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PageConfiguration.java */
    public static class C7921toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final String f60314f7l8 = "sorted";

        /* JADX INFO: renamed from: g */
        private static final String f12257g = "selected";

        /* JADX INFO: renamed from: n */
        private static final String f12258n = "pageType";

        /* JADX INFO: renamed from: q */
        private static final String f12259q = "category";

        /* JADX INFO: renamed from: s */
        private static final String f12260s = "local";

        /* JADX INFO: renamed from: y */
        private static final String f12261y = "clazz";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f60315zy = "en_US";

        /* JADX INFO: renamed from: k */
        private Map<String, String> f12262k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60316toq;

        public C7921toq(Map<String, String> titleMap, String url) {
            this.f12262k = new HashMap(titleMap);
            this.f60316toq = url;
        }

        /* JADX INFO: renamed from: k */
        public PageGroup m7974k(Context context, Intent intent) {
            PageGroup pageGroupM7965q;
            PageGroup pageGroupM9951k = null;
            try {
                String str = this.f60316toq;
                Uri uri = Uri.parse(str);
                if (toq.f60303f7l8.equals(uri.getScheme())) {
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("pageType");
                    String strM5744q = p001b.toq.m5744q(queryParameter);
                    C2965z c2965zM8001n = C2082k.zy().m8001n();
                    com.android.thememanager.fu4 fu4VarM10535g = c2965zM8001n.m10535g(strM5744q);
                    if (intent != null) {
                        c2965zM8001n.m10538p(intent, fu4VarM10535g);
                    }
                    if (f12257g.equals(queryParameter2)) {
                        pageGroupM7965q = toq.m7964n(context, fu4VarM10535g);
                    } else if (f60314f7l8.equals(queryParameter2)) {
                        pageGroupM7965q = toq.m7962g(context, fu4VarM10535g);
                    } else if (f12261y.equals(queryParameter2)) {
                        pageGroupM7965q = toq.zy(context, fu4VarM10535g);
                    } else if ("local".equals(queryParameter2)) {
                        pageGroupM7965q = toq.m7965q(context, fu4VarM10535g);
                    }
                    pageGroupM9951k = pageGroupM7965q;
                } else if (uri.getPath() != null && py.f16698g.equals(uri.getPath()) && ("http".equals(uri.getScheme()) || "theme".equals(uri.getScheme()))) {
                    pageGroupM9951k = py.m9951k(uri);
                }
                if (pageGroupM9951k == null) {
                    PageGroup pageGroup = new PageGroup();
                    try {
                        pageGroup.setPageGroupType(1);
                        pageGroup.setUrl(str);
                        pageGroupM9951k = pageGroup;
                    } catch (Exception e2) {
                        pageGroupM9951k = pageGroup;
                        e = e2;
                        Log.e(toq.f12246g, "build PageConfiguration fail: " + e);
                    }
                }
                pageGroupM9951k.setTitle(toq(fu4.m7067k()));
            } catch (Exception e3) {
                e = e3;
            }
            return pageGroupM9951k;
        }

        /* JADX INFO: renamed from: q */
        public JSONObject m7975q() {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str : this.f12262k.keySet()) {
                    jSONObject2.put(str, this.f12262k.get(str));
                }
                jSONObject.put("title", jSONObject2);
                jSONObject.put("url", this.f60316toq);
            } catch (JSONException e2) {
                Log.e(toq.f12246g, "change TabInfo to json fail " + e2);
            }
            return jSONObject;
        }

        public String toq(String locale) {
            return this.f12262k.containsKey(locale) ? this.f12262k.get(locale) : this.f12262k.get("en_US");
        }

        public String zy() {
            return this.f60316toq;
        }
    }

    public toq() {
    }

    /* JADX INFO: renamed from: g */
    public static PageGroup m7962g(Context context, com.android.thememanager.fu4 resContext) {
        ld6 ld6Var = new ld6(resContext);
        PageGroup pageGroup = new PageGroup();
        pageGroup.setResourceCode(resContext.getResourceCode());
        if (resContext.isPurchaseSupported()) {
            Page page = new Page();
            page.setListUrl(ld6Var.zp());
            page.setItemUrl(ld6Var.m7581a());
            page.setKey(ld6Var.m7586x());
            page.setTitle(context.getString(R.string.resource_ranking_purchase));
            pageGroup.addPage(page);
        }
        Page page2 = new Page();
        page2.setListUrl(ld6Var.m7584r());
        page2.setItemUrl(ld6Var.lvui());
        page2.setKey(ld6Var.dd());
        page2.setTitle(context.getString(R.string.resource_ranking_free));
        pageGroup.addPage(page2);
        return pageGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static PageGroup m7964n(Context context, com.android.thememanager.fu4 resContext) {
        ld6 ld6Var = new ld6(resContext);
        PageGroup pageGroup = new PageGroup();
        pageGroup.setResourceCode(resContext.getResourceCode());
        Page page = new Page();
        page.setListUrl(ld6Var.ikck());
        page.setItemUrl(ld6Var.m7585v());
        page.setKey(ld6Var.m7582d());
        page.setTitle(context.getString(R.string.resource_selected));
        pageGroup.addPage(page);
        return pageGroup;
    }

    /* JADX INFO: renamed from: q */
    public static PageGroup m7965q(Context context, com.android.thememanager.fu4 resContext) {
        String string = C2082k.zy().toq().getString(R.string.resource_my);
        PageGroup pageGroup = new PageGroup();
        pageGroup.setResourceCode(resContext.getResourceCode());
        pageGroup.setTitle(string);
        Page page = new Page();
        page.setKey(String.format(InterfaceC1925p.vx4g, resContext.getResourceStamp()));
        pageGroup.addPage(page);
        return pageGroup;
    }

    public static C2071k qrj(JSONObject config) throws JSONException {
        C2071k c2071k = new C2071k();
        c2071k.m7970g(config.getInt(f60302cdj));
        JSONArray jSONArray = config.getJSONArray(f60304ki);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            String string = jSONObject.getString("url");
            HashMap map = new HashMap();
            JSONObject jSONObject2 = jSONObject.getJSONObject("title");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.getString(next));
            }
            c2071k.m7971k(new C7921toq(map, string));
        }
        return c2071k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static PageGroup zy(Context context, com.android.thememanager.fu4 resContext) {
        ld6 ld6Var = new ld6(resContext);
        PageGroup pageGroup = new PageGroup();
        pageGroup.setResourceCode(resContext.getResourceCode());
        Page page = new Page();
        page.setListUrl(ld6Var.cdj());
        page.setItemUrl(ld6Var.kja0());
        page.setKey(ld6Var.m7583h());
        page.setTitle(context.getString(R.string.resource_category));
        pageGroup.addPage(page);
        return pageGroup;
    }

    public void cdj(String searchResultH5Url) {
        this.f60310toq = searchResultH5Url;
    }

    public int f7l8() {
        return this.f60311zy;
    }

    /* JADX INFO: renamed from: h */
    public void m7966h(boolean needSearchBtn) {
        this.f12251k = needSearchBtn;
    }

    public void ki(boolean isValid) {
        this.f12253q = isValid;
    }

    public void kja0(int version) {
        this.f60311zy = version;
    }

    public boolean ld6() {
        return this.f12253q;
    }

    public C2071k n7h(String stamp, C2071k pageData) {
        return this.f12252n.put(stamp, pageData);
    }

    /* JADX INFO: renamed from: p */
    public boolean m7967p() {
        return !TextUtils.isEmpty(this.f60310toq);
    }

    /* JADX INFO: renamed from: s */
    public C2071k m7968s(String stamp) {
        return this.f12252n.get(stamp);
    }

    public String t8r() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("md5", "");
            jSONObject.put("versionCode", f7l8());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(f60307n7h, x2());
            jSONObject2.put(f60305kja0, m7969y());
            JSONObject jSONObject3 = new JSONObject();
            for (String str : this.f12252n.keySet()) {
                C2071k c2071k = this.f12252n.get(str);
                if (c2071k != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    Iterator<C7921toq> it = c2071k.m7973q().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next().m7975q());
                    }
                    jSONObject4.put(f60304ki, jSONArray);
                    jSONObject4.put(f60302cdj, c2071k.toq());
                    jSONObject3.put(str, jSONObject4);
                }
            }
            jSONObject2.put(f12247h, jSONObject3);
            jSONObject.put("value", jSONObject2.toString());
        } catch (JSONException e2) {
            Log.e(f12246g, "change PageConfiguration to json fail: " + e2);
        }
        return jSONObject.toString();
    }

    public boolean x2() {
        return this.f12251k;
    }

    /* JADX INFO: renamed from: y */
    public String m7969y() {
        return this.f60310toq;
    }

    public toq(JSONObject rootJson) {
        try {
            this.f60311zy = rootJson.getInt("versionCode");
            JSONObject jSONObject = new JSONObject(rootJson.getString("value"));
            this.f12251k = jSONObject.getBoolean(f60307n7h);
            this.f60310toq = jSONObject.getString(f60305kja0);
            JSONObject jSONObject2 = jSONObject.getJSONObject(f12247h);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                C2071k c2071kQrj = qrj(jSONObject2.getJSONObject(next));
                if (c2071kQrj.m7972n()) {
                    this.f12252n.put(next, c2071kQrj);
                } else {
                    this.f12253q = false;
                    return;
                }
            }
            this.f12253q = true;
        } catch (Exception unused) {
            this.f12253q = false;
        }
    }
}
