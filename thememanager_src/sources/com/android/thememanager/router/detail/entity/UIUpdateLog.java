package com.android.thememanager.router.detail.entity;

import com.android.thememanager.basemodule.utils.kja0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UIUpdateLog {
    private static String TAG = "UIUpdateLog";
    private List<String> items;
    private String title;

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
                if (logs.size() > 1 || items.size() > 1) {
                    sb.append(String.valueOf(i3 + 1));
                    sb.append(". ");
                }
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
