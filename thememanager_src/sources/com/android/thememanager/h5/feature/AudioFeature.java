package com.android.thememanager.h5.feature;

import android.app.Activity;
import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.resource.C1790g;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.h5.feature.FeatureHelper;
import com.android.thememanager.h5.zy;
import com.android.thememanager.util.ch;
import java.io.File;
import java.util.Map;
import miuix.core.util.C7083n;
import miuix.hybrid.C7148k;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AudioFeature implements n7h {

    /* JADX INFO: renamed from: f */
    private static final String f12046f = "contentPath";

    /* JADX INFO: renamed from: g */
    private static final int f12047g = 1;

    /* JADX INFO: renamed from: h */
    private static final String f12048h = "playAudio";

    /* JADX INFO: renamed from: i */
    private static final String f12049i = "stopAudio";

    /* JADX INFO: renamed from: l */
    private static final String f12050l = "url";

    /* JADX INFO: renamed from: n */
    private static final int f12051n = 0;

    /* JADX INFO: renamed from: p */
    private static final String f12052p = "audition";

    /* JADX INFO: renamed from: r */
    private static final String f12053r = "status";

    /* JADX INFO: renamed from: s */
    private static final String f12054s = "AudioFeature";

    /* JADX INFO: renamed from: t */
    private static final String f12055t = "unregisterPlayerListener";

    /* JADX INFO: renamed from: y */
    private static final int f12056y = 2;

    /* JADX INFO: renamed from: z */
    private static final String f12057z = "registerPlayerListener";

    /* JADX INFO: renamed from: k */
    private C1790g f12058k;

    /* JADX INFO: renamed from: q */
    private C7148k f12059q;

    private static class PlayStatusResponse implements FeatureHelper.JSONConvertibleData {

        /* JADX INFO: renamed from: k */
        int f12067k;

        public PlayStatusResponse(int status) {
            this.f12067k = status;
        }

        @Override // com.android.thememanager.h5.feature.FeatureHelper.JSONConvertibleData
        public JSONObject toJsonObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", this.f12067k);
            return jSONObject;
        }
    }

    private o1t f7l8(final C7156z request) {
        try {
            String string = new JSONObject(request.m25921n()).getString(f12046f);
            if (TextUtils.isEmpty(string)) {
                return new o1t(200, "contentPath is empty");
            }
            if (!new File(string).exists()) {
                return new o1t(200, "resource not found");
            }
            final Resource resource = new Resource();
            resource.setContentPath(string);
            m7926n(request);
            if (this.f12058k == null) {
                return new o1t(200, "player init fail");
            }
            final Activity qVar = request.zy().toq();
            qVar.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.AudioFeature.2
                @Override // java.lang.Runnable
                public void run() {
                    if (qVar.isFinishing()) {
                        return;
                    }
                    AudioFeature.this.f12058k.kja0();
                    AudioFeature.this.f12058k.m6927p(resource, C2082k.zy().m8001n().m10535g("ringtone").getNewResourceContext());
                    AudioFeature.this.m7924g();
                }
            });
            return new o1t(0);
        } catch (JSONException e2) {
            return new o1t(200, e2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m7924g() {
        if (this.f12059q != null) {
            this.f12059q.m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(0, m7928q()), f12054s));
        }
    }

    /* JADX INFO: renamed from: n */
    private C1790g m7926n(final C7156z request) {
        zy zyVarPnt2;
        if (this.f12058k == null && (zyVarPnt2 = zy.pnt2(request.m25919g())) != null) {
            C1790g c1790gMi1u = zyVarPnt2.mi1u();
            this.f12058k = c1790gMi1u;
            c1790gMi1u.qrj(new C1790g.zy() { // from class: com.android.thememanager.h5.feature.AudioFeature.3
                @Override // com.android.thememanager.basemodule.resource.C1790g.zy
                public void onProgressUpdate(int playDuration, int totalDuration) {
                }

                @Override // com.android.thememanager.basemodule.resource.C1790g.zy
                public void onStartPlaying() {
                    AudioFeature.this.m7924g();
                }

                @Override // com.android.thememanager.basemodule.resource.C1790g.zy
                public void onStopPlaying() {
                    AudioFeature.this.m7924g();
                }
            });
        }
        return this.f12058k;
    }

    /* JADX INFO: renamed from: p */
    private o1t m7927p(final C7156z request) {
        this.f12059q = null;
        return new o1t(0);
    }

    /* JADX INFO: renamed from: q */
    private FeatureHelper.JSONConvertibleData m7928q() {
        C1790g c1790g = this.f12058k;
        int i2 = 0;
        if (c1790g != null) {
            boolean zM6929y = c1790g.m6929y();
            boolean zLd6 = this.f12058k.ld6();
            if (zM6929y) {
                i2 = zLd6 ? 1 : 2;
            }
        }
        return new PlayStatusResponse(i2);
    }

    /* JADX INFO: renamed from: s */
    private o1t m7929s(final C7156z request) {
        m7926n(request);
        C1790g c1790g = this.f12058k;
        if (c1790g == null) {
            return new o1t(200, "player init fail");
        }
        c1790g.kja0();
        m7924g();
        return new o1t(0);
    }

    /* JADX INFO: renamed from: y */
    private o1t m7930y(final C7156z request) {
        this.f12059q = request.toq();
        this.f12059q.m25906k(FeatureHelper.buildDataResponse(new FeatureHelper.FeatureCustomData(1, new FeatureHelper.EmptyJSONConvertibleData()), f12054s));
        return new o1t(0);
    }

    private o1t zy(final C7156z request) {
        try {
            String string = new JSONObject(request.m25921n()).getString("url");
            final Resource resource = new Resource();
            resource.addThumbnail(new PathEntry(ch.gvn7(C7083n.m25584g(string)), string));
            m7926n(request);
            if (this.f12058k == null) {
                return new o1t(200, "player init fail");
            }
            final Activity qVar = request.zy().toq();
            qVar.runOnUiThread(new Runnable() { // from class: com.android.thememanager.h5.feature.AudioFeature.1
                @Override // java.lang.Runnable
                public void run() {
                    if (qVar.isFinishing()) {
                        return;
                    }
                    AudioFeature.this.f12058k.kja0();
                    AudioFeature.this.f12058k.m6927p(resource, C2082k.zy().m8001n().m10535g("ringtone").getNewResourceContext());
                    AudioFeature.this.m7924g();
                }
            });
            return new o1t(0);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return new o1t(200, "audition error");
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f12052p)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12048h)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12049i)) {
            return n7h.EnumC7150k.SYNC;
        }
        if (TextUtils.equals(request.m25920k(), f12057z)) {
            return n7h.EnumC7150k.CALLBACK;
        }
        if (TextUtils.equals(request.m25920k(), f12055t)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return TextUtils.equals(request.m25920k(), f12052p) ? zy(request) : TextUtils.equals(request.m25920k(), f12048h) ? f7l8(request) : TextUtils.equals(request.m25920k(), f12049i) ? m7929s(request) : TextUtils.equals(request.m25920k(), f12057z) ? m7930y(request) : TextUtils.equals(request.m25920k(), f12055t) ? m7927p(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
