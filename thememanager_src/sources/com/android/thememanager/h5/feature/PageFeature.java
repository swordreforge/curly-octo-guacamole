package com.android.thememanager.h5.feature;

import a98o.C0004k;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.fu4;
import com.android.thememanager.h5.feature.FeatureHelper;
import com.android.thememanager.h5.webcache.C2072k;
import com.android.thememanager.h5.zy;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.uc;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class PageFeature implements n7h, InterfaceC1357q, InterfaceC1789q {

    /* JADX INFO: renamed from: a */
    private static final String f12105a = "onPause";

    /* JADX INFO: renamed from: b */
    private static final String f12106b = "onResume";

    /* JADX INFO: renamed from: c */
    private static final String f12107c = "xPrevRef";

    /* JADX INFO: renamed from: e */
    private static final String f12108e = "anim";

    /* JADX INFO: renamed from: f */
    private static final String f12109f = "xRef";

    /* JADX INFO: renamed from: g */
    private static final String f12110g = "PageFeature";

    /* JADX INFO: renamed from: h */
    private static final String f12111h = "startWallpaperDetail";

    /* JADX INFO: renamed from: i */
    private static final String f12112i = "back";

    /* JADX INFO: renamed from: j */
    private static final String f12113j = "xRef";

    /* JADX INFO: renamed from: l */
    private static final String f12114l = "title";

    /* JADX INFO: renamed from: m */
    private static final String f12115m = "status";

    /* JADX INFO: renamed from: o */
    private static final String f12116o = "xPrevRef";

    /* JADX INFO: renamed from: p */
    private static final String f12117p = "showErrorView";

    /* JADX INFO: renamed from: r */
    private static final String f12118r = "url";

    /* JADX INFO: renamed from: s */
    private static final String f12119s = "loadPage";

    /* JADX INFO: renamed from: t */
    private static final String f12120t = "unregisterPageStatusListener";

    /* JADX INFO: renamed from: x */
    private static final String f12121x = "onVisible";

    /* JADX INFO: renamed from: y */
    private static final String f12122y = "getPageInfo";

    /* JADX INFO: renamed from: z */
    private static final String f12123z = "registerPageStatusListener";

    /* JADX INFO: renamed from: k */
    private List<C7148k> f12124k = new ArrayList();

    /* JADX INFO: renamed from: n */
    private Object f12125n = new Object();

    /* JADX INFO: renamed from: q */
    private WebOnPageStatusListener f12126q;

    private static class LoadPageHelper {

        /* JADX INFO: renamed from: k */
        private static final String f12136k = ":miui:starting_window_label";

        private LoadPageHelper() {
        }

        private static boolean toq(Uri uri) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            return ("http".equals(scheme) || "https".equals(scheme)) ? InterfaceC1925p.gdzl.equals(host) || "zhuti.xiaomi.com".equals(host) : "theme".equals(scheme) || InterfaceC1357q.f53939se.equals(scheme);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static o1t zy(final C7156z request) {
            final int i2;
            try {
                JSONObject jSONObject = new JSONObject(request.m25921n());
                String string = jSONObject.getString("url");
                String strOptString = jSONObject.optString("title");
                String strOptString2 = jSONObject.optString("xRef");
                String strOptString3 = jSONObject.optString("xPrevRef");
                int iOptInt = jSONObject.optInt(PageFeature.f12108e);
                int i3 = R.anim.disappear;
                int i4 = R.anim.appear;
                final int i5 = -1;
                if (iOptInt == 1) {
                    i3 = R.anim.push_down_out;
                    i2 = R.anim.push_up_in;
                    i4 = 17432576;
                    i5 = 17432577;
                } else if (iOptInt != 2) {
                    i2 = -1;
                    i3 = -1;
                    i4 = -1;
                } else {
                    i5 = R.anim.disappear;
                    i2 = R.anim.appear;
                }
                Uri uri = Uri.parse(string);
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(uri);
                if (y9n.toq(31) && toq(uri)) {
                    intent.setPackage("com.android.thememanager");
                }
                if (!toq(uri)) {
                    intent.addFlags(268435456);
                }
                intent.putExtra(InterfaceC1357q.f53847bek6, i4);
                intent.putExtra(InterfaceC1357q.f53856cv06, i3);
                f7l8.m6612q(intent, strOptString2);
                f7l8.zy(intent, strOptString3);
                intent.putExtra(InterfaceC1357q.f53882h7am, true);
                if (!TextUtils.isEmpty(strOptString)) {
                    intent.putExtra(":miui:starting_window_label", strOptString);
                    intent.putExtra(InterfaceC1357q.f53866eqxt, strOptString);
                }
                C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.h5.feature.PageFeature.LoadPageHelper.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i2 != -1) {
                            request.zy().toq().startActivityForResult(intent, 1, ActivityOptions.makeCustomAnimation(C2082k.zy().toq(), i2, i5).toBundle());
                        } else {
                            request.zy().toq().startActivityForResult(intent, 1);
                        }
                    }
                });
                return new o1t(0);
            } catch (JSONException e2) {
                Log.e(PageFeature.f12110g, e2.getMessage());
                return new o1t(200, e2.getMessage());
            }
        }
    }

    public static class PageData implements FeatureHelper.JSONConvertibleData {

        /* JADX INFO: renamed from: k */
        private String f12141k;

        public PageData(String status) {
            this.f12141k = status;
        }

        @Override // com.android.thememanager.h5.feature.FeatureHelper.JSONConvertibleData
        public JSONObject toJsonObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", this.f12141k);
            return jSONObject;
        }
    }

    private class WebOnPageStatusListener implements zy.qrj {
        private WebOnPageStatusListener() {
        }

        @Override // com.android.thememanager.h5.zy.qrj
        public void onPause() {
            o1t o1tVarBuildDataResponse = FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new PageData(PageFeature.f12105a)), PageFeature.f12110g);
            Iterator it = PageFeature.this.f12124k.iterator();
            while (it.hasNext()) {
                ((C7148k) it.next()).m25906k(o1tVarBuildDataResponse);
            }
        }

        @Override // com.android.thememanager.h5.zy.qrj
        public void onResume() {
            o1t o1tVarBuildDataResponse = FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new PageData(PageFeature.f12106b)), PageFeature.f12110g);
            Iterator it = PageFeature.this.f12124k.iterator();
            while (it.hasNext()) {
                ((C7148k) it.next()).m25906k(o1tVarBuildDataResponse);
            }
        }

        @Override // com.android.thememanager.h5.zy.qrj
        public void onVisible() {
            o1t o1tVarBuildDataResponse = FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new PageData(PageFeature.f12121x)), PageFeature.f12110g);
            Iterator it = PageFeature.this.f12124k.iterator();
            while (it.hasNext()) {
                ((C7148k) it.next()).m25906k(o1tVarBuildDataResponse);
            }
        }
    }

    private o1t f7l8(C7156z request) {
        zy zyVarPnt2 = zy.pnt2(request.m25919g());
        if (zyVarPnt2 == null) {
            return new o1t(200, "error view not found");
        }
        zyVarPnt2.zuf();
        return new o1t(0);
    }

    /* JADX INFO: renamed from: g */
    private o1t m7933g(final C7156z request) {
        final C7148k qVar = request.toq();
        if (qVar == null) {
            return new o1t(200, "no listener callback");
        }
        request.zy().toq().runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.PageFeature.1
            @Override // java.lang.Runnable
            public void run() {
                zy zyVarPnt2 = zy.pnt2(request.m25919g());
                if (zyVarPnt2 == null) {
                    qVar.m25906k(new o1t(200, "register fail, fragment not found "));
                    return;
                }
                if (PageFeature.this.f12126q == null) {
                    PageFeature pageFeature = PageFeature.this;
                    pageFeature.f12126q = new WebOnPageStatusListener();
                    zyVarPnt2.i1an(PageFeature.this.f12126q);
                }
                PageFeature.this.f12124k.add(qVar);
                qVar.m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(1, new FeatureHelper.EmptyJSONConvertibleData()), PageFeature.f12110g));
                if (zyVarPnt2.z4j7()) {
                    qVar.m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new PageData(PageFeature.f12121x)), PageFeature.f12110g));
                }
            }
        });
        return new o1t(0);
    }

    private o1t ld6(C7156z request) {
        request.zy().toq().runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.PageFeature.2
            @Override // java.lang.Runnable
            public void run() {
                PageFeature.this.f12124k.clear();
            }
        });
        return new o1t(0);
    }

    /* JADX INFO: renamed from: n */
    private o1t m7935n(C7156z request) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!(request.zy().toq() instanceof kja0)) {
                return new o1t(200, "this activity does not contain page info.");
            }
            String strM6613s = f7l8.m6613s();
            String strM6614y = f7l8.m6614y();
            if (strM6613s == null) {
                strM6613s = "";
            }
            if (strM6614y == null) {
                strM6614y = "";
            }
            jSONObject.put("xPrevRef", strM6614y);
            jSONObject.put("xRef", strM6613s);
            return new o1t(jSONObject);
        } catch (JSONException e2) {
            Log.e(f12110g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: p */
    private o1t m7936p(C7156z request) {
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            JSONArray jSONArray = jSONObject.getJSONArray("resourceList");
            int i2 = jSONObject.getInt("index");
            Activity qVar = request.zy().toq();
            ArrayList arrayList = new ArrayList();
            C0004k<Resource> c0004k = new C0004k<>();
            arrayList.add(c0004k);
            fu4 fu4VarA98o = ch.a98o(qVar);
            fu4 fu4VarM10535g = !"wallpaper".equals(fu4VarA98o.getResourceCode()) ? C2082k.zy().m8001n().m10535g("wallpaper") : fu4VarA98o;
            String str = null;
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                c0004k.add(uc.mcp(jSONObject2, fu4VarM10535g, true));
                String string = jSONObject2.getString(InterfaceC1789q.ziq);
                if (i2 == i3) {
                    str = string;
                }
            }
            m7938s(qVar, fu4VarM10535g, i2, str, arrayList);
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12110g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: q */
    private o1t m7937q(C7156z request) {
        request.zy().toq().finish();
        return new o1t(0);
    }

    /* JADX INFO: renamed from: s */
    private void m7938s(final Activity activity, final fu4 resContext, final int index, final String thumbnailPath, final List<C0004k<Resource>> dataSet) {
        C2072k.m7976k(Uri.parse(thumbnailPath));
        C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.h5.feature.PageFeature.3
            @Override // java.lang.Runnable
            public void run() {
                C2082k.zy().qrj(dataSet);
                Intent intent = new Intent();
                intent.setClassName(activity, resContext.getDetailActivityClass());
                intent.putExtra(InterfaceC1357q.f53879gvn7, index);
                intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
                intent.putExtra(InterfaceC1357q.f53965y2, 2);
                activity.startActivityForResult(intent, 1);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    private o1t m7939y(C7156z request) {
        try {
            Activity qVar = request.zy().toq();
            JSONObject jSONObject = new JSONObject(request.m25921n());
            JSONArray jSONArray = jSONObject.getJSONArray("resourceList");
            int i2 = jSONObject.getInt("index");
            String string = null;
            int i3 = 0;
            while (true) {
                if (i3 >= jSONArray.length()) {
                    break;
                }
                if (i2 == i3) {
                    string = jSONArray.getJSONObject(i3).getString("moduleId");
                    break;
                }
                i3++;
            }
            if (qVar instanceof ActivityC0891q) {
                com.android.thememanager.v9.f7l8.ni7((ActivityC0891q) qVar, 0, "thememanager", string, false);
            } else {
                C7794k.f7l8("PageFeature. activity not FragmentActivity!");
            }
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12110g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f12119s)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12117p)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12111h)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12112i)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12123z)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (TextUtils.equals(request.m25920k(), f12120t)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12122y)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return TextUtils.equals(request.m25920k(), f12119s) ? LoadPageHelper.zy(request) : TextUtils.equals(request.m25920k(), f12117p) ? f7l8(request) : TextUtils.equals(request.m25920k(), f12111h) ? m7939y(request) : TextUtils.equals(request.m25920k(), f12112i) ? m7937q(request) : TextUtils.equals(request.m25920k(), f12123z) ? m7933g(request) : TextUtils.equals(request.m25920k(), f12120t) ? ld6(request) : TextUtils.equals(request.m25920k(), f12122y) ? m7935n(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
