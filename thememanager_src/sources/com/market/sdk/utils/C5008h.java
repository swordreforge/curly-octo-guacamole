package com.market.sdk.utils;

import android.content.res.MiuiConfiguration;
import android.util.Log;
import com.market.sdk.MarketManager;

/* JADX INFO: renamed from: com.market.sdk.utils.h */
/* JADX INFO: compiled from: ResourceUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5008h {
    /* JADX INFO: renamed from: k */
    public static int m17432k() {
        return MarketManager.m17271y().getResources().getDisplayMetrics().heightPixels;
    }

    public static int toq() {
        return MarketManager.m17271y().getResources().getDisplayMetrics().widthPixels;
    }

    public static boolean zy() {
        try {
            int scaleMode = MiuiConfiguration.getScaleMode();
            return scaleMode == 11 || scaleMode == 14 || scaleMode == 15;
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
            return false;
        }
    }
}
