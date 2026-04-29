package com.android.thememanager.view.webview;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class ScrollWebView extends CustomWebView {

    /* JADX INFO: renamed from: n */
    private boolean f17715n;

    /* JADX INFO: renamed from: q */
    private InterfaceC2942k f17716q;

    /* JADX INFO: renamed from: com.android.thememanager.view.webview.ScrollWebView$k */
    public interface InterfaceC2942k {
        /* JADX INFO: renamed from: k */
        default void m10440k() {
        }

        default void toq() {
        }

        void zy(int height);
    }

    public ScrollWebView(Context context) {
        this(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        InterfaceC2942k interfaceC2942k = this.f17716q;
        if (interfaceC2942k == null) {
            return;
        }
        if (t2 - oldt <= 1) {
            interfaceC2942k.m10440k();
        }
        if (oldt - t2 >= 1) {
            this.f17716q.toq();
        }
        this.f17716q.zy(t2);
    }

    @Override // android.view.View
    public void scrollTo(int x3, int y3) {
        if (this.f17715n) {
            super.scrollTo(x3, y3);
        } else {
            super.scrollTo(0, 0);
        }
    }

    public void setOnScrollListener(InterfaceC2942k listener) {
        this.f17716q = listener;
    }

    public void setScrollable(boolean scrollable) {
        this.f17715n = scrollable;
    }

    public ScrollWebView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ScrollWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17715n = true;
    }
}
