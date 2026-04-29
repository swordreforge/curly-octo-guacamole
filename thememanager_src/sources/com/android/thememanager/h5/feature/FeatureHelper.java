package com.android.thememanager.h5.feature;

import android.util.Log;
import miuix.hybrid.o1t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FeatureHelper {
    public static final int CUSTOM_CODE_FAIL = 1;
    public static final int CUSTOM_CODE_SUCCESS = 0;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_REGISTER_LISTENER = 1;

    /* JADX INFO: renamed from: k */
    private static final String f12086k = "type";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60276toq = "data";

    public static class EmptyJSONConvertibleData implements JSONConvertibleData {
        @Override // com.android.thememanager.h5.feature.FeatureHelper.JSONConvertibleData
        public JSONObject toJsonObject() throws JSONException {
            return new JSONObject();
        }
    }

    public static class FeatureCustomData {

        /* JADX INFO: renamed from: k */
        int f12087k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        JSONConvertibleData f60277toq;

        public FeatureCustomData(int type, JSONConvertibleData data) {
            this.f12087k = type;
            this.f60277toq = data;
        }

        public JSONObject toJsonObject() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            JSONConvertibleData jSONConvertibleData = this.f60277toq;
            JSONObject jSONObject2 = jSONConvertibleData == null ? new JSONObject() : jSONConvertibleData.toJsonObject();
            jSONObject.put("type", this.f12087k);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        }
    }

    public interface JSONConvertibleData {
        JSONObject toJsonObject() throws JSONException;
    }

    public static o1t buildDataResponse(FeatureCustomData data, String logTag) {
        try {
            return new o1t(0, data.toJsonObject());
        } catch (Exception e2) {
            Log.e(logTag, e2.getMessage());
            return new o1t(200, e2.getMessage());
        }
    }
}
