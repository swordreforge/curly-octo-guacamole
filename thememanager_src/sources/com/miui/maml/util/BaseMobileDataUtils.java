package com.miui.maml.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public class BaseMobileDataUtils {
    public static final String MOBILE_DATA = "mobile_data";

    public Uri getMobileDataUri() {
        return Settings.Global.getUriFor(MOBILE_DATA);
    }

    public boolean isMobileEnable(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return ((Boolean) ReflectionHelper.invokeObject(connectivityManager.getClass(), connectivityManager, "getMobileDataEnabled", new Class[0], new Object[0])).booleanValue();
        } catch (Exception e2) {
            MamlLog.m17851e("BaseMobileDataUtils", "Invoke | ConnectivityManager_getMobileDataEnabled() occur EXCEPTION: " + e2.getMessage());
            return false;
        }
    }

    public void onMobileDataChange(Context context) {
    }
}
