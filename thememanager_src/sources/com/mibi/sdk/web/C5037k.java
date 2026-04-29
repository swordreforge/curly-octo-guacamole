package com.mibi.sdk.web;

import a5id.C0002k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.mibi.sdk.common.C5032k;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;
import vy.C7718q;
import vy.toq;
import vy.zy;

/* JADX INFO: renamed from: com.mibi.sdk.web.k */
/* JADX INFO: compiled from: MibiWebImp.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5037k implements toq {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private String f70901ld6;

    /* JADX INFO: renamed from: k */
    private final String f28586k = "MibiWebImp";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f70902toq = "https";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f70903zy = "m.mibi.mi.com";

    /* JADX INFO: renamed from: q */
    private final String f28589q = "m.staging.mibi.n.xiaomi.com";

    /* JADX INFO: renamed from: n */
    private final String f28587n = "m.hk.mibi.mi.com";

    /* JADX INFO: renamed from: g */
    private final String f28585g = "m.staging.hk.mibi.xiaomi.com";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final String f70900f7l8 = "recharge";

    /* JADX INFO: renamed from: y */
    private final String f28591y = "pay";

    /* JADX INFO: renamed from: s */
    private final String f28590s = "webUrl";

    /* JADX INFO: renamed from: p */
    private final String f28588p = "region";

    /* JADX INFO: renamed from: h */
    private void m17529h(Activity activity, String str, zy zyVar, int i2) {
        C0002k.toq(zyVar);
        Intent intent = new Intent(activity, (Class<?>) MibiWebActivity.class);
        intent.putExtra("webUrl", str);
        intent.setPackage(activity.getPackageName());
        activity.startActivityForResult(intent, i2);
    }

    private void kja0(String str) {
        if (C5032k.f70898toq) {
            if (TextUtils.equals(str, "HK")) {
                this.f70901ld6 = "m.staging.hk.mibi.xiaomi.com";
                return;
            } else {
                this.f70901ld6 = "m.staging.mibi.n.xiaomi.com";
                return;
            }
        }
        if (TextUtils.equals(str, "HK")) {
            this.f70901ld6 = "m.hk.mibi.mi.com";
        } else {
            this.f70901ld6 = "m.mibi.mi.com";
        }
    }

    private String ld6() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(this.f70901ld6);
        return builder.toString();
    }

    private String n7h() {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority(this.f70901ld6).appendPath("recharge");
        return builder.toString();
    }

    private String qrj(String str) {
        TreeMap<String, String> treeMapX2 = x2(str);
        if (treeMapX2.isEmpty()) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority(this.f70901ld6).appendPath("pay");
        for (String str2 : treeMapX2.keySet()) {
            builder.appendQueryParameter(str2, treeMapX2.get(str2));
        }
        return builder.toString();
    }

    private TreeMap<String, String> x2(String str) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        try {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    treeMap.put(next, jSONObject.getString(next));
                }
                return treeMap;
            } catch (JSONException e2) {
                Log.w("MibiWebImp", "Order param is not right: " + e2);
                return treeMap;
            }
        } catch (Throwable unused) {
            return treeMap;
        }
    }

    @Override // vy.toq
    public boolean f7l8(Context context, String str) {
        Log.d("MibiWebImp", "web mibi do not support channel pay");
        return false;
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: g */
    public void mo17518g(Activity activity, int i2, long j2, zy zyVar, Bundle bundle) {
        if (activity == null) {
            throw new InvalidParameterException("activity cannot be null");
        }
        kja0(bundle != null ? bundle.getString("region") : "");
        m17529h(activity, n7h(), zyVar, i2);
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: k */
    public void mo17519k(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        Log.d("MibiWebImp", "should not call web mibi");
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: n */
    public void mo17520n(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
        if (activity == null) {
            throw new InvalidParameterException("activity cannot be null");
        }
        TreeMap<String, String> treeMapX2 = x2(str);
        kja0(treeMapX2 != null ? treeMapX2.get("region") : "");
        m17529h(activity, qrj(str), zyVar, i2);
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: p */
    public void mo17521p(Activity activity, C7718q.k kVar, String str, long j2, int i2) {
        Log.d("MibiWebImp", "web mibi do not requestChannels");
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: q */
    public void mo17522q(Activity activity, int i2, zy zyVar) {
        if (activity == null) {
            throw new InvalidParameterException("activity cannot be null");
        }
        m17529h(activity, ld6(), zyVar, i2);
    }

    @Override // vy.toq
    public void release() {
        C0002k.m1k();
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: s */
    public void mo17523s(Activity activity, int i2, String str, zy zyVar, Bundle bundle) {
    }

    @Override // vy.toq
    public boolean toq(Context context, String str) {
        Log.d("MibiWebImp", "web mibi do not support channel deduct");
        return false;
    }

    @Override // vy.toq
    /* JADX INFO: renamed from: y */
    public boolean mo17524y(Context context, String str) {
        Log.d("MibiWebImp", "web mibi do not support sign deduct");
        return false;
    }

    @Override // vy.toq
    public void zy(Activity activity, int i2, zy zyVar) {
        mo17518g(activity, i2, 0L, zyVar, null);
    }
}
