package com.android.thememanager.h5.feature;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2965z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.analysis.toq;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.local.InterfaceC1744k;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.ld6;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.fu4;
import com.android.thememanager.h5.feature.FeatureHelper;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.gc3c;
import ek5k.C6002g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import miuix.appcompat.app.dd;
import miuix.appcompat.app.ki;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import miuix.hybrid.zurt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;
import yz.C7794k;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceFeature implements n7h {
    public static final int DOWNLOAD_STATUS_DOWNLOADING = 1;
    public static final int DOWNLOAD_STATUS_SUCCESS = 0;
    public static final String PARAM_CATEGORY = "category";

    /* JADX INFO: renamed from: a */
    private static final String f12143a = "xRef";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f60278ab = "resourceList";
    private static final String an = "downloadingResources";
    private static final String as = "currBytes";
    private static final String az = "picker";

    /* JADX INFO: renamed from: b */
    private static final String f12144b = "title";
    private static final String[] ba = {"ringtone", toq.mle, "alarm"};
    private static final String bb = "currentUsingResource";
    private static final String bg = "totalBytes";
    private static final String bl = "downloadStatus";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f60279bo = "localId";
    private static final String bp = "isPicker";
    private static final String bv = "updateCount";

    /* JADX INFO: renamed from: c */
    private static final String f12145c = "category";

    /* JADX INFO: renamed from: d */
    private static final String f12146d = "isUpdate";

    /* JADX INFO: renamed from: e */
    private static final String f12147e = "categoryList";

    /* JADX INFO: renamed from: f */
    private static final String f12148f = "applyOrPickResource";

    /* JADX INFO: renamed from: g */
    private static final String f12149g = "ResourceFeature";

    /* JADX INFO: renamed from: h */
    private static final String f12150h = "registerResourceStatusListener";

    /* JADX INFO: renamed from: i */
    private static final String f12151i = "unregisterResourceStatusListener";
    private static final String id = "downloadPath";
    private static final String in = "assemblyId";

    /* JADX INFO: renamed from: j */
    private static final String f12152j = "localId";

    /* JADX INFO: renamed from: l */
    private static final String f12153l = "removeResource";

    /* JADX INFO: renamed from: m */
    private static final String f12154m = "assemblyId";

    /* JADX INFO: renamed from: o */
    private static final String f12155o = "moduleId";

    /* JADX INFO: renamed from: p */
    private static final String f12156p = "getDownloadStatus";

    /* JADX INFO: renamed from: r */
    private static final String f12157r = "downloadResource";

    /* JADX INFO: renamed from: s */
    private static final String f12158s = "getResourceStatusByCategories";

    /* JADX INFO: renamed from: t */
    private static final String f12159t = "unregisterDownloadListener";

    /* JADX INFO: renamed from: u */
    private static final String f12160u = "xTrackId";

    /* JADX INFO: renamed from: v */
    private static final String f12161v = "moduleId";

    /* JADX INFO: renamed from: w */
    private static final String f12162w = "contentPath";

    /* JADX INFO: renamed from: x */
    private static final String f12163x = "xPrevRef";

    /* JADX INFO: renamed from: y */
    private static final String f12164y = "getResourceStatus";

    /* JADX INFO: renamed from: z */
    private static final String f12165z = "registerDownloadListener";

    /* JADX INFO: renamed from: k */
    private volatile Map<String, InterfaceC1744k> f12166k = new HashMap();

    /* JADX INFO: renamed from: n */
    private InterfaceC1755y f12167n;

    /* JADX INFO: renamed from: q */
    private volatile zurt f12168q;

    public static class DeleteAsyncTask extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: k */
        private WeakReference<Activity> f12197k;

        /* JADX INFO: renamed from: n */
        private C7148k f12198n;

        /* JADX INFO: renamed from: q */
        private Resource f12199q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        dd f60281toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private ld6 f60282zy;

        public DeleteAsyncTask(Activity activity, ld6 manager, Resource resource, C7148k callback) {
            this.f60282zy = manager;
            this.f12197k = new WeakReference<>(activity);
            this.f12199q = resource;
            this.f12198n = callback;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            Activity activity = this.f12197k.get();
            if (gc3c.cdj(activity)) {
                dd ddVar = new dd(activity);
                this.f60281toq = ddVar;
                ddVar.y2(0);
                this.f60281toq.n5r1(activity.getString(R.string.deleting));
                this.f60281toq.setCancelable(false);
                this.f60281toq.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public Boolean doInBackground(Void... params) {
            this.f60282zy.fti(this.f12199q);
            return Boolean.TRUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(Boolean result) {
            if (gc3c.cdj(this.f12197k.get())) {
                this.f60281toq.dismiss();
            }
            o1t o1tVar = new o1t(0);
            if (!result.booleanValue()) {
                o1tVar = new o1t(200);
            }
            this.f12198n.m25906k(o1tVar);
        }
    }

    private static class DownloadResponse implements FeatureHelper.JSONConvertibleData {

        /* JADX INFO: renamed from: k */
        private String f12200k;

        /* JADX INFO: renamed from: n */
        private int f12201n;

        /* JADX INFO: renamed from: q */
        private int f12202q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60283toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f60284zy;

        public DownloadResponse(String downloadPath, String assemblyId, int downloadStatus, int currBytes, int totalBytes) {
            this.f12200k = downloadPath;
            this.f60283toq = assemblyId;
            this.f12201n = downloadStatus;
            this.f60284zy = currBytes;
            this.f12202q = totalBytes;
        }

        @Override // com.android.thememanager.h5.feature.FeatureHelper.JSONConvertibleData
        public JSONObject toJsonObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ResourceFeature.id, this.f12200k);
            jSONObject.put(InterfaceC1925p.v5fy, this.f60283toq);
            jSONObject.put(ResourceFeature.bl, this.f12201n);
            jSONObject.put(ResourceFeature.as, this.f60284zy);
            jSONObject.put(ResourceFeature.bg, this.f12202q);
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj() {
        if (this.f12166k.isEmpty()) {
            return;
        }
        C2965z c2965zM8001n = C2082k.zy().m8001n();
        for (String str : this.f12166k.keySet()) {
            c2965zM8001n.ld6(c2965zM8001n.f7l8(str)).m7690k().m7671q(this.f12166k.get(str));
        }
        this.f12166k.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m7942h() {
        y9n.m7255s();
        if (this.f12167n != null) {
            C2082k.zy().m8000g().t8r(this.f12167n);
            this.f12167n = null;
        }
    }

    private o1t kja0(final C7156z request) {
        if (this.f12167n != null) {
            final Activity qVar = request.zy().toq();
            qVar.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.ResourceFeature.5
                @Override // java.lang.Runnable
                public void run() {
                    if (qVar.isFinishing()) {
                        return;
                    }
                    ResourceFeature.this.m7942h();
                }
            });
        }
        return new o1t(0);
    }

    private JSONObject ld6(String stamp, Activity activity) throws JSONException {
        fu4 fu4VarA98o = ch.a98o(activity);
        if (fu4VarA98o == null || !TextUtils.equals(stamp, fu4VarA98o.getResourceStamp())) {
            fu4VarA98o = C2082k.zy().m8001n().f7l8(stamp);
        }
        if (bwp.ki(p001b.toq.m5744q(stamp))) {
            fu4VarA98o.putExtraMeta(InterfaceC1357q.f53853cfr, 0);
            fu4VarA98o.putExtraMeta(InterfaceC1357q.f53956w831, Integer.MAX_VALUE);
        }
        ld6 ld6VarM7690k = C2082k.zy().m8001n().ld6(fu4VarA98o).m7690k();
        ArrayList<Resource> arrayList = new ArrayList();
        arrayList.addAll(ld6VarM7690k.kja0());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Resource resource : arrayList) {
            if (!TextUtils.isEmpty(resource.getOnlineId())) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("localId", resource.getLocalId());
                jSONObject2.put("moduleId", resource.getOnlineId());
                jSONObject2.put(f12146d, ld6VarM7690k.mcp(resource));
                jSONObject2.put(f12162w, new ResourceResolver(resource, fu4VarA98o).getContentPath());
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("resourceList", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        String strM5744q = p001b.toq.m5744q(stamp);
        if (!bwp.ki(strM5744q) || fu4VarA98o.isPicker()) {
            String currentUsingPath = fu4VarA98o.getCurrentUsingPath();
            if (fu4VarA98o.isPicker()) {
                stamp = "picker";
            } else {
                currentUsingPath = bwp.m9634s(activity, strM5744q);
            }
            String strM7235z = vyq.m7235z(strM5744q);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(f12162w, currentUsingPath);
            jSONObject3.put("moduleId", strM7235z);
            jSONObject3.put("category", stamp);
            jSONArray2.put(jSONObject3);
        } else {
            for (String str : ba) {
                String strM9634s = bwp.m9634s(activity, str);
                String strM7235z2 = vyq.m7235z(str);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(f12162w, strM9634s);
                jSONObject4.put("moduleId", strM7235z2);
                jSONObject4.put("category", p001b.toq.n7h(str));
                jSONArray2.put(jSONObject4);
            }
        }
        jSONObject.put(bb, jSONArray2);
        jSONObject.put(bp, fu4VarA98o.isPicker());
        jSONObject.put(bv, ld6VarM7690k.x2());
        return jSONObject;
    }

    private o1t n7h(final C7156z request) {
        final Activity qVar = request.zy().toq();
        qVar.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.ResourceFeature.3
            @Override // java.lang.Runnable
            public void run() {
                if (qVar.isFinishing()) {
                    return;
                }
                ResourceFeature.this.qrj(request);
                ResourceFeature.this.m7942h();
                ResourceFeature.this.f12167n = new InterfaceC1755y() { // from class: com.android.thememanager.h5.feature.ResourceFeature.3.1
                    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
                    public void handleDownloadComplete(String downloadPath, String assemblyId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
                        request.toq().m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new DownloadResponse(downloadPath, assemblyId, downloadSuccess ? 0 : downloadFailCode, 1, 1)), ResourceFeature.f12149g));
                    }

                    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
                    public void handleDownloadProgressUpdate(String downloadPath, String assemblyId, String extraData, int currBytes, int totalBytes) {
                        request.toq().m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new DownloadResponse(downloadPath, assemblyId, 1, currBytes, totalBytes)), ResourceFeature.f12149g));
                    }

                    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
                    public void handleDownloadStatusChange(String downloadPath, String assemblyId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
                        request.toq().m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new DownloadResponse(downloadPath, assemblyId, 1, currBytes, totalBytes)), ResourceFeature.f12149g));
                    }
                };
                C2082k.zy().m8000g().zy(ResourceFeature.this.f12167n);
                request.toq().m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(1, new FeatureHelper.EmptyJSONConvertibleData()), ResourceFeature.f12149g));
            }
        });
        return new o1t(3);
    }

    /* JADX INFO: renamed from: p */
    private o1t m7945p(C7156z request) {
        try {
            return new o1t(ld6(new JSONObject(request.m25921n()).getString("category"), request.zy().toq()));
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj(final C7156z request) {
        if (this.f12168q == null) {
            this.f12168q = new zurt() { // from class: com.android.thememanager.h5.feature.ResourceFeature.4
                @Override // miuix.hybrid.zurt
                public void onDestroy() {
                    ResourceFeature.this.m7942h();
                    ResourceFeature.this.cdj();
                    request.zy().zy(ResourceFeature.this.f12168q);
                    super.onDestroy();
                }
            };
            request.zy().m25907k(this.f12168q);
        }
    }

    /* JADX INFO: renamed from: s */
    private static String m7947s(Resource r2, fu4 resContext) {
        return TextUtils.isEmpty(r2.getContentPath()) ? com.android.thememanager.o1t.f7l8(r2, resContext) : r2.getContentPath();
    }

    private o1t x2(C7156z request) {
        try {
            JSONArray jSONArray = new JSONObject(request.m25921n()).getJSONArray(f12147e);
            Activity qVar = request.zy().toq();
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = jSONArray.getString(i2);
                jSONObject.put(string, ld6(string, qVar));
            }
            return new o1t(jSONObject);
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    private o1t m7948y(C7156z request) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (ld6.C1749s c1749s : C2082k.zy().m8000g().m8435p()) {
                jSONArray.put(new DownloadResponse(c1749s.f9992k, c1749s.f57556toq, 1, c1749s.f57557zy, c1749s.f9993q).toJsonObject());
            }
            jSONObject.put(an, jSONArray);
            return new o1t(jSONObject);
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    public o1t applyOrPickResource(C7156z request) {
        final C7148k qVar = request.toq();
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            String string = jSONObject.getString("localId");
            String string2 = jSONObject.getString("category");
            final Activity qVar2 = request.zy().toq();
            fu4 fu4VarA98o = ch.a98o(qVar2);
            final fu4 fu4VarF7l8 = (fu4VarA98o == null || !TextUtils.equals(string2, fu4VarA98o.getResourceStamp())) ? C2082k.zy().m8001n().f7l8(string2) : fu4VarA98o;
            final Resource resourceQrj = C2082k.zy().m8001n().ld6(fu4VarF7l8).m7690k().qrj(string);
            if (resourceQrj != null) {
                qVar2.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.ResourceFeature.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (qVar2.isFinishing()) {
                            return;
                        }
                        Activity activity = qVar2;
                        if (activity instanceof ActivityC0891q) {
                            bwp.d2ok(fu4VarF7l8, qVar, null, (ActivityC0891q) activity, resourceQrj);
                        } else {
                            C7794k.f7l8("ResourceFeature. activity not FragmentActivity");
                        }
                    }
                });
                return new o1t(0);
            }
            o1t o1tVar = new o1t(200, "resource not found");
            qVar.m25906k(o1tVar);
            return o1tVar;
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            o1t o1tVar2 = new o1t(200, e2.getMessage());
            qVar.m25906k(o1tVar2);
            return o1tVar2;
        }
    }

    public o1t downloadResource(C7156z request) {
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            String string = jSONObject.getString("category");
            String string2 = jSONObject.getString("moduleId");
            String string3 = jSONObject.getString(InterfaceC1925p.v5fy);
            String string4 = jSONObject.getString("title");
            String string5 = jSONObject.getString("xRef");
            String string6 = jSONObject.getString("xPrevRef");
            String string7 = jSONObject.getString("xTrackId");
            Resource resource = new Resource();
            resource.setOnlineId(string2);
            resource.setAssemblyId(string3);
            resource.getOnlineInfo().setTitle(string4);
            fu4 fu4VarF7l8 = C2082k.zy().m8001n().f7l8(string);
            zy.C1711k c1711k = new zy.C1711k();
            c1711k.f57496toq = string5;
            c1711k.f57497zy = string6;
            c1711k.f9809q = string7;
            c1711k.f9807k = f7l8.m6607g();
            C2082k.zy().m8000g().m8434n(resource, fu4VarF7l8, c1711k);
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f12164y)) {
            return n7h.EnumC7150k.ASYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12158s)) {
            return n7h.EnumC7150k.ASYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12156p)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12157r)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12165z)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (TextUtils.equals(request.m25920k(), f12159t)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12153l)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (TextUtils.equals(request.m25920k(), f12148f)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return TextUtils.equals(request.m25920k(), f12164y) ? m7945p(request) : TextUtils.equals(request.m25920k(), f12158s) ? x2(request) : TextUtils.equals(request.m25920k(), f12156p) ? m7948y(request) : TextUtils.equals(request.m25920k(), f12150h) ? registerResourceStatusListener(request) : TextUtils.equals(request.m25920k(), f12151i) ? unregisterResourceStatusListener(request) : TextUtils.equals(request.m25920k(), f12157r) ? downloadResource(request) : TextUtils.equals(request.m25920k(), f12165z) ? n7h(request) : TextUtils.equals(request.m25920k(), f12159t) ? kja0(request) : TextUtils.equals(request.m25920k(), f12153l) ? removeResource(request) : TextUtils.equals(request.m25920k(), f12148f) ? applyOrPickResource(request) : new o1t(204, "no such action");
    }

    public o1t registerResourceStatusListener(final C7156z request) {
        try {
            final String string = new JSONObject(request.m25921n()).getString("category");
            final C7148k qVar = request.toq();
            final Activity qVar2 = request.zy().toq();
            qVar2.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.ResourceFeature.1
                @Override // java.lang.Runnable
                public void run() {
                    if (qVar2.isFinishing()) {
                        return;
                    }
                    ResourceFeature.this.qrj(request);
                    if (ResourceFeature.this.f12166k.get(string) == null) {
                        qVar.m25906k(new o1t(200, "listener of same type exists"));
                        return;
                    }
                    fu4 fu4VarF7l8 = C2082k.zy().m8001n().f7l8(string);
                    InterfaceC1744k interfaceC1744k = new InterfaceC1744k() { // from class: com.android.thememanager.h5.feature.ResourceFeature.1.1
                        @Override // com.android.thememanager.basemodule.local.InterfaceC1744k
                        public void onDataSetUpdated() {
                            qVar.m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new FeatureHelper.EmptyJSONConvertibleData()), ResourceFeature.f12149g));
                        }

                        @Override // com.android.thememanager.basemodule.local.InterfaceC1744k
                        public void onDataUpdated(Resource resource) {
                            qVar.m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, new FeatureHelper.EmptyJSONConvertibleData()), ResourceFeature.f12149g));
                        }
                    };
                    ResourceFeature.this.f12166k.put(string, interfaceC1744k);
                    C2082k.zy().m8001n().ld6(fu4VarF7l8).m7690k().m7669k(interfaceC1744k);
                    request.toq().m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(1, new FeatureHelper.EmptyJSONConvertibleData()), ResourceFeature.f12149g));
                }
            });
            return new o1t(3);
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    public o1t removeResource(C7156z request) {
        final C7148k qVar = request.toq();
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            String string = jSONObject.getString("localId");
            String string2 = jSONObject.getString("category");
            final Activity qVar2 = request.zy().toq();
            fu4 fu4VarA98o = ch.a98o(qVar2);
            if (fu4VarA98o == null || !TextUtils.equals(string2, fu4VarA98o.getResourceStamp())) {
                fu4VarA98o = C2082k.zy().m8001n().f7l8(string2);
            }
            final com.android.thememanager.controller.ld6 ld6VarM7690k = C2082k.zy().m8001n().ld6(fu4VarA98o).m7690k();
            final Resource resourceQrj = ld6VarM7690k.qrj(string);
            if (resourceQrj == null) {
                qVar.m25906k(new o1t(200, "resource not found"));
            }
            if (resourceQrj != null) {
                qVar2.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.ResourceFeature.6
                    @Override // java.lang.Runnable
                    public void run() {
                        if (qVar2.isFinishing()) {
                            return;
                        }
                        new ki.C6947k(qVar2).lrht(R.string.resource_delete).m25039i(android.R.attr.alertDialogIcon).fu4(R.string.resource_delete_confirm).mcp(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.h5.feature.ResourceFeature.6.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialog, int which) {
                                qVar.m25906k(new o1t(100));
                            }
                        }).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.h5.feature.ResourceFeature.6.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialog, int which) {
                                RunnableC20616 runnableC20616 = RunnableC20616.this;
                                new DeleteAsyncTask(qVar2, ld6VarM7690k, resourceQrj, qVar).executeOnExecutor(C6002g.ld6(), new Void[0]);
                            }
                        }).hb();
                    }
                });
            }
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            o1t o1tVar = new o1t(200, e2.getMessage());
            qVar.m25906k(o1tVar);
            return o1tVar;
        }
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }

    public o1t unregisterResourceStatusListener(final C7156z request) {
        try {
            final String string = new JSONObject(request.m25921n()).getString("category");
            final Activity qVar = request.zy().toq();
            qVar.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.ResourceFeature.2
                @Override // java.lang.Runnable
                public void run() {
                    InterfaceC1744k interfaceC1744k;
                    if (qVar.isFinishing() || (interfaceC1744k = (InterfaceC1744k) ResourceFeature.this.f12166k.get(string)) == null) {
                        return;
                    }
                    ResourceFeature.this.f12166k.remove(interfaceC1744k);
                    C2082k.zy().m8001n().ld6(C2082k.zy().m8001n().f7l8(string)).m7690k().m7671q(interfaceC1744k);
                }
            });
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12149g, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }
}
