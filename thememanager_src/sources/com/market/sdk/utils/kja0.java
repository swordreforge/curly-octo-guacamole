package com.market.sdk.utils;

import android.util.Log;
import com.market.sdk.MarketManager;
import miuix.core.util.SystemProperties;

/* JADX INFO: compiled from: Region.java */
/* JADX INFO: loaded from: classes3.dex */
public class kja0 {

    /* JADX INFO: renamed from: k */
    public static final String f28213k = "IN";

    /* JADX INFO: renamed from: q */
    public static final String f28214q = "ES";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f68998toq = "ID";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f68999zy = "RU";

    /* JADX INFO: renamed from: k */
    public static String m17446k() {
        try {
            return SystemProperties.get("ro.miui.region", "CN");
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
            return "CN";
        }
    }
}
