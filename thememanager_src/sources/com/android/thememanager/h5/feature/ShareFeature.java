package com.android.thememanager.h5.feature;

import com.android.thememanager.share.f7l8;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ShareFeature implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f12203g = "title";

    /* JADX INFO: renamed from: k */
    private static final String f12204k = "ShareFeature";

    /* JADX INFO: renamed from: n */
    private static final String f12205n = "share";

    /* JADX INFO: renamed from: q */
    private static final String f12206q = "isShareAvailable";

    /* JADX INFO: renamed from: s */
    private static final String f12207s = "url";

    /* JADX INFO: renamed from: y */
    private static final String f12208y = "description";

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        return n7h.EnumC7150k.SYNC;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        if (!"share".equals(request.m25920k())) {
            return f12206q.equals(request.m25920k()) ? new o1t(0) : new o1t(205);
        }
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            f7l8.m9439s(request.m25919g().getContext(), jSONObject.getString("title"), jSONObject.getString("description"), jSONObject.getString("url"));
            return new o1t(0);
        } catch (Exception unused) {
            return new o1t(204);
        }
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
