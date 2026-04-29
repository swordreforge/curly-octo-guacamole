package miuix.hybrid.internal;

import android.util.Log;
import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: miuix.hybrid.internal.y */
/* JADX INFO: compiled from: JsInterface.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7147y {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f87742toq = "MiuiJsBridge";

    /* JADX INFO: renamed from: k */
    private final f7l8 f40331k;

    public C7147y(f7l8 manager) {
        this.f40331k = manager;
    }

    @JavascriptInterface
    public String config(String config) {
        String strLd6 = this.f40331k.ld6(config);
        if (Log.isLoggable("hybrid", 3)) {
            Log.d("hybrid", "config response is " + strLd6);
        }
        return strLd6;
    }

    @JavascriptInterface
    public String invoke(String feature, String action, String rawParams, String callback) {
        String strFn3e = this.f40331k.fn3e(feature, action, rawParams, callback);
        if (Log.isLoggable("hybrid", 3)) {
            Log.d("hybrid", "blocking response is " + strFn3e);
        }
        return strFn3e;
    }

    @JavascriptInterface
    public String lookup(String feature, String action) {
        String strFu4 = this.f40331k.fu4(feature, action);
        if (Log.isLoggable("hybrid", 3)) {
            Log.d("hybrid", "lookup response is " + strFu4);
        }
        return strFu4;
    }
}
