package com.xiaomi.onetrack;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.xiaomi.onetrack.util.C5804p;

/* JADX INFO: loaded from: classes3.dex */
public class AppWebViewInterface {
    public static final String JAVASCRIPT_INTERFACE_NAME = "OneTrack_APP_H5_Bridge";

    /* JADX INFO: renamed from: a */
    private static final String f31454a = "AppWebViewInterface";

    /* JADX INFO: renamed from: b */
    private OneTrack f31455b;

    public AppWebViewInterface(OneTrack oneTrack) {
        this.f31455b = oneTrack;
    }

    @JavascriptInterface
    public boolean track(String str) {
        C5804p.m20342a(f31454a, "received h5 data. data: " + str);
        if (this.f31455b == null) {
            C5804p.m20342a(f31454a, "mOneTrack is null, return false");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            C5804p.m20342a(f31454a, "h5 data is empty, return false");
            return false;
        }
        this.f31455b.trackEventFromH5(str);
        return true;
    }
}
