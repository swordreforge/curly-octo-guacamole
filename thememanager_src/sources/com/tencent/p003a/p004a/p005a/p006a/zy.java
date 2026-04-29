package com.tencent.p003a.p004a.p005a.p006a;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    String f29895k = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    String f72523toq = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    String f72524zy = "0";

    /* JADX INFO: renamed from: q */
    long f29896q = 0;

    static zy toq(String str) {
        zy zyVar = new zy();
        if (C5361y.m18231g(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("ui")) {
                    zyVar.f29895k = jSONObject.getString("ui");
                }
                if (!jSONObject.isNull("mc")) {
                    zyVar.f72523toq = jSONObject.getString("mc");
                }
                if (!jSONObject.isNull("mid")) {
                    zyVar.f72524zy = jSONObject.getString("mid");
                }
                if (!jSONObject.isNull("ts")) {
                    zyVar.f29896q = jSONObject.getLong("ts");
                }
            } catch (JSONException e2) {
                Log.w("MID", e2);
            }
        }
        return zyVar;
    }

    private JSONObject zy() {
        JSONObject jSONObject = new JSONObject();
        try {
            C5361y.zy(jSONObject, "ui", this.f29895k);
            C5361y.zy(jSONObject, "mc", this.f72523toq);
            C5361y.zy(jSONObject, "mid", this.f72524zy);
            jSONObject.put("ts", this.f29896q);
        } catch (JSONException e2) {
            Log.w("MID", e2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: k */
    public final String m18237k() {
        return this.f72524zy;
    }

    public final String toString() {
        return zy().toString();
    }
}
