package com.android.thememanager.detail.theme.model;

import android.util.Log;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.basemodule.utils.kja0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class UIUpdateLog implements Serializable {
    private static String TAG = "UIUpdateLog";
    private static final long serialVersionUID = 1;
    private List<String> items;
    private String title;

    public static List<UIUpdateLog> createFromResource(Resource r2) {
        String extraMeta;
        ResourceInfo onlineInfo = r2.getOnlineInfo();
        if (onlineInfo == null || (extraMeta = onlineInfo.getExtraMeta("updateLogs")) == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(extraMeta);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                UIUpdateLog uIUpdateLog = new UIUpdateLog();
                uIUpdateLog.items = new ArrayList();
                uIUpdateLog.title = jSONObjectOptJSONObject.optString("title");
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("items");
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    uIUpdateLog.items.add(jSONArrayOptJSONArray.optString(i3));
                }
                arrayList.add(uIUpdateLog);
            }
            return arrayList;
        } catch (Exception e2) {
            Log.w(TAG, "parse exception ", e2);
            return null;
        }
    }

    public static String getUpdateString(List<UIUpdateLog> logs) {
        if (kja0.qrj(logs)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < logs.size(); i2++) {
            UIUpdateLog uIUpdateLog = logs.get(i2);
            List<String> items = uIUpdateLog.getItems();
            if (i2 > 0) {
                sb.append("\n");
            }
            sb.append(uIUpdateLog.getTitle());
            sb.append("\n");
            for (int i3 = 0; i3 < items.size(); i3++) {
                sb.append(items.get(i3));
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public List<String> getItems() {
        return this.items;
    }

    public String getTitle() {
        return this.title;
    }
}
