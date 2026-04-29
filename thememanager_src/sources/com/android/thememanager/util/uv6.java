package com.android.thememanager.util;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: JSONUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class uv6 {
    /* JADX INFO: renamed from: k */
    public static List<String> m10044k(JSONArray jsonArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jsonArray != null) {
            for (int i2 = 0; i2 < jsonArray.length(); i2++) {
                arrayList.add(jsonArray.getString(i2));
            }
        }
        return arrayList;
    }
}
