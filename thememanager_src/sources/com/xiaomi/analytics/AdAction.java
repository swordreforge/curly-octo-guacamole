package com.xiaomi.analytics;

import android.text.TextUtils;
import java.util.List;
import y9n.C7780k;

/* JADX INFO: loaded from: classes3.dex */
public class AdAction extends TrackAction {
    protected static final String AD_MONITOR = "_ad_monitor_";

    public AdAction(String str) {
        setCategory(C7780k.f100571ek5k);
        setAction(str);
    }

    public AdAction addAdMonitor(List<String> list) {
        if (list != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    if (sb.length() > 0) {
                        sb.append("|");
                    }
                    sb.append(str);
                }
            }
            if (sb.length() > 0) {
                addExtra(AD_MONITOR, sb.toString());
            }
        }
        return this;
    }

    public AdAction(String str, String str2) {
        setCategory(str);
        setAction(str2);
    }
}
