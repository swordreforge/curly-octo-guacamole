package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.util.lrht;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.k */
/* JADX INFO: compiled from: ClearKeyUtil.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3313k {

    /* JADX INFO: renamed from: k */
    private static final String f19664k = "ClearKeyUtil";

    private C3313k() {
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m11638k(byte[] bArr) {
        return lrht.f23230k >= 27 ? bArr : lrht.dr(zy(lrht.d3(bArr)));
    }

    /* JADX INFO: renamed from: q */
    private static String m11639q(String str) {
        return str.replace('-', '+').replace('_', '/');
    }

    public static byte[] toq(byte[] bArr) {
        if (lrht.f23230k >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(lrht.d3(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (i2 != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                sb.append("{\"k\":\"");
                sb.append(m11639q(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(m11639q(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return lrht.dr(sb.toString());
        } catch (JSONException e2) {
            String strValueOf = String.valueOf(lrht.d3(bArr));
            com.google.android.exoplayer2.util.ni7.m13700n(f19664k, strValueOf.length() != 0 ? "Failed to adjust response data: ".concat(strValueOf) : new String("Failed to adjust response data: "), e2);
            return bArr;
        }
    }

    private static String zy(String str) {
        return str.replace('+', '-').replace('/', '_');
    }
}
