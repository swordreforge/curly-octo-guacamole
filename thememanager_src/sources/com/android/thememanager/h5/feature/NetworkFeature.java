package com.android.thememanager.h5.feature;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.analysis.f7l8;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.ld6;
import com.android.thememanager.controller.online.zurt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import miuix.hybrid.C7156z;
import miuix.hybrid.n7h;
import miuix.hybrid.o1t;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkFeature implements n7h {

    /* JADX INFO: renamed from: g */
    private static final String f12096g = "registerNetworkStatusListener";

    /* JADX INFO: renamed from: h */
    private static final String f12097h = "params";

    /* JADX INFO: renamed from: i */
    private static final String f12098i = "get";

    /* JADX INFO: renamed from: k */
    private static final String f12099k = "NetworkFeature";

    /* JADX INFO: renamed from: n */
    private static final String f12100n = "getNetworkStatus";

    /* JADX INFO: renamed from: p */
    private static final String f12101p = "requestFlags";

    /* JADX INFO: renamed from: q */
    private static final String f12102q = "request";

    /* JADX INFO: renamed from: s */
    private static final String f12103s = "url";

    /* JADX INFO: renamed from: y */
    private static final String f12104y = "unregisterNetworkStatusListener";

    /* JADX INFO: renamed from: k */
    private o1t m7932k(C7156z request) {
        try {
            JSONObject jSONObject = new JSONObject(request.m25921n());
            String string = jSONObject.getString("url");
            int i2 = jSONObject.getInt(f12101p);
            JSONObject jSONObject2 = jSONObject.getJSONObject(f12097h);
            boolean z2 = jSONObject.getBoolean(f12098i);
            HashMap map = new HashMap();
            if (jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.getString(next));
                }
            }
            zurt zurtVar = new zurt(Uri.parse(string));
            if (request.zy().toq() instanceof kja0) {
                zy.C1711k c1711k = new zy.C1711k();
                c1711k.f57496toq = f7l8.m6613s();
                c1711k.f57497zy = f7l8.m6614y();
                c1711k.f9807k = f7l8.m6607g();
                ld6.m7566g(zurtVar, c1711k);
            }
            for (Map.Entry entry : map.entrySet()) {
                zurtVar.addParameter((String) entry.getKey(), (String) entry.getValue());
            }
            zurtVar.setRequestFlag(i2);
            zurtVar.setHttpMethod(z2 ? zurt.toq.GET : zurt.toq.POST);
            zurtVar.setHostProxyType(zurt.EnumC1946k.API_PROXY);
            return new o1t(C1915g.f7l8(zurtVar));
        } catch (Exception e2) {
            Log.e(f12099k, e2.toString());
            return new o1t(200, e2.toString());
        }
    }

    @Override // miuix.hybrid.n7h
    public n7h.EnumC7150k getInvocationMode(C7156z request) {
        if (TextUtils.equals(request.m25920k(), f12102q)) {
            return n7h.EnumC7150k.ASYNC;
        }
        return null;
    }

    @Override // miuix.hybrid.n7h
    public o1t invoke(C7156z request) {
        return TextUtils.equals(request.m25920k(), f12102q) ? m7932k(request) : new o1t(204, "no such action");
    }

    @Override // miuix.hybrid.n7h
    public void setParams(Map<String, String> params) {
    }
}
