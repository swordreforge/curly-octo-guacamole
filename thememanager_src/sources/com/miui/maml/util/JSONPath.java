package com.miui.maml.util;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class JSONPath {
    private static final String LOG_TAG = "JSONPath";
    private JSONObject mRoot;
    private JSONArray mRootArray;

    public JSONPath(JSONObject jSONObject) {
        this.mRoot = jSONObject;
    }

    public Object get(String str) {
        int i2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("/");
        Object obj = this.mRoot;
        if (obj == null) {
            obj = this.mRootArray;
        }
        if (obj == null) {
            return null;
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            try {
                String strSubstring = strArrSplit[i3];
                if (!TextUtils.isEmpty(strSubstring)) {
                    int iIndexOf = strSubstring.indexOf("[");
                    if (iIndexOf != -1) {
                        i2 = Integer.parseInt(strSubstring.substring(iIndexOf + 1, strSubstring.length() - 1));
                        strSubstring = strSubstring.substring(0, iIndexOf);
                    } else {
                        i2 = -1;
                    }
                    if ((obj instanceof JSONObject) && !TextUtils.isEmpty(strSubstring)) {
                        obj = ((JSONObject) obj).get(strSubstring);
                    }
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (i2 == -1) {
                            break;
                        }
                        obj = jSONArray.get(i2);
                    }
                    if (obj == null || obj == JSONObject.NULL) {
                        return null;
                    }
                }
            } catch (Exception e2) {
                MamlLog.m17854w(LOG_TAG, e2.toString());
                return null;
            }
        }
        return obj;
    }

    public JSONPath(JSONArray jSONArray) {
        this.mRootArray = jSONArray;
    }
}
