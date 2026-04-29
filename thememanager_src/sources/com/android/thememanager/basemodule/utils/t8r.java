package com.android.thememanager.basemodule.utils;

import android.app.Activity;
import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: KeyboardHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class t8r {

    /* JADX INFO: renamed from: k */
    private static Map<toq, ViewTreeObserver.OnGlobalLayoutListener> f10407k = new HashMap();

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.t8r$k */
    /* JADX INFO: compiled from: KeyboardHelper.java */
    public static class ViewTreeObserverOnGlobalLayoutListenerC1827k implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: n */
        private int f10410n;

        /* JADX INFO: renamed from: q */
        private toq f10411q;

        /* JADX INFO: renamed from: y */
        private Window f10412y;

        /* JADX INFO: renamed from: k */
        final int f10409k = 150;

        /* JADX INFO: renamed from: g */
        private Rect f10408g = new Rect();

        public ViewTreeObserverOnGlobalLayoutListenerC1827k(@zy.lvui Window window, @zy.lvui toq visibilityListener) {
            this.f10412y = window;
            this.f10411q = visibilityListener;
            this.f10410n = window.getDecorView().getHeight();
        }

        /* JADX INFO: renamed from: k */
        public void m7221k(toq visibilityListener) {
            this.f10411q = visibilityListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f10412y.getDecorView().getWindowVisibleDisplayFrame(this.f10408g);
            int iHeight = this.f10408g.height();
            int iZurt = C1819o.zurt(this.f10412y.getContext());
            int i2 = this.f10410n;
            if (i2 != 0) {
                if (i2 > iHeight + 150 + iZurt) {
                    this.f10411q.mo7222k();
                } else if (i2 + 150 + iZurt < iHeight) {
                    this.f10411q.toq();
                }
            }
            this.f10410n = iHeight;
        }
    }

    /* JADX INFO: compiled from: KeyboardHelper.java */
    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo7222k();

        void toq();
    }

    private t8r() {
    }

    /* JADX INFO: renamed from: k */
    public static void m7220k(@zy.dd Activity activity, @zy.lvui toq listener) {
        if (C1819o.eqxt(activity)) {
            ViewTreeObserver.OnGlobalLayoutListener viewTreeObserverOnGlobalLayoutListenerC1827k = f10407k.get(listener);
            if (viewTreeObserverOnGlobalLayoutListenerC1827k == null) {
                viewTreeObserverOnGlobalLayoutListenerC1827k = new ViewTreeObserverOnGlobalLayoutListenerC1827k(activity.getWindow(), listener);
                f10407k.put(listener, viewTreeObserverOnGlobalLayoutListenerC1827k);
            }
            activity.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1827k);
        }
    }

    public static void toq(@zy.dd Activity activity, @zy.lvui toq listener) {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = f10407k.get(listener);
        f10407k.remove(listener);
        if (onGlobalLayoutListener != null && C1819o.eqxt(activity)) {
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
    }
}
