package com.android.thememanager.h5.feature;

import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.datacenter.C1967g;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsFeature implements n7h {

    /* JADX INFO: renamed from: k */
    private static final String f12043k = "AnalyticsFeature";

    /* JADX INFO: renamed from: n */
    private static final String f12044n = "data";

    /* JADX INFO: renamed from: q */
    private static final String f12045q = "eventRecord";

    /* JADX INFO: renamed from: k */
    private void m7923k(String data) {
        C1967g.m7713n(data);
    }

    public o1t eventRecord(C7156z request) {
        try {
            m7923k(new JSONObject(request.m25921n()).getString("data"));
            return new o1t(0);
        } catch (JSONException e2) {
            Log.e(f12043k, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f12045q)) {
            return n7h.EnumC7150k.SYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return TextUtils.equals(request.m25920k(), f12045q) ? eventRecord(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
