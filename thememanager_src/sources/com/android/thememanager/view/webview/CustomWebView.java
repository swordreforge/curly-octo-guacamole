package com.android.thememanager.view.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.webkit.WebView;
import com.android.thememanager.util.C2789j;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class CustomWebView extends WebView {

    /* JADX INFO: renamed from: k */
    private static final String f17705k = CustomWebView.class.getSimpleName();

    public CustomWebView(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView
    @SuppressLint({"PrivateApi"})
    public void destroy() {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                Field declaredField = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                declaredField.setAccessible(true);
                declaredField.set(null, null);
            } catch (ClassNotFoundException e2) {
                C2789j.qrj(f17705k, e2);
            } catch (IllegalAccessException e3) {
                C2789j.qrj(f17705k, e3);
            } catch (NoSuchFieldException e4) {
                C2789j.qrj(f17705k, e4);
            }
        }
        super.destroy();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String url) {
        try {
            super.loadUrl(url);
        } catch (Exception e2) {
            C2789j.qrj(f17705k, e2);
        }
    }

    public CustomWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
