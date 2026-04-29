package com.android.thememanager.basemodule.utils;

import android.util.Log;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.hybrid.HybridView;

/* JADX INFO: compiled from: WebViewSecurity.java */
/* JADX INFO: loaded from: classes.dex */
public class a98o {

    /* JADX INFO: renamed from: k */
    private static final ArrayList<String> f10273k;

    static {
        ArrayList<String> arrayList = new ArrayList<>(3);
        f10273k = arrayList;
        arrayList.add("searchBoxJavaBridge_");
        arrayList.add("accessibility");
        arrayList.add("accessibilityTraversal");
    }

    /* JADX INFO: renamed from: k */
    public static void m7002k(WebView view) {
        if (view == null) {
            return;
        }
        Iterator<String> it = f10273k.iterator();
        while (it.hasNext()) {
            view.removeJavascriptInterface(it.next());
        }
    }

    public static void toq(HybridView view) {
        WebView realWebView;
        if (view == null || (realWebView = view.getRealWebView()) == null) {
            return;
        }
        try {
            Iterator<String> it = f10273k.iterator();
            while (it.hasNext()) {
                realWebView.removeJavascriptInterface(it.next());
            }
        } catch (Exception e2) {
            Log.e("wvsec", e2.getMessage());
        }
    }
}
