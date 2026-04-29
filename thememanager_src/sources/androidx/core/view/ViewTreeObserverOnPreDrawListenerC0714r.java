package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: androidx.core.view.r */
/* JADX INFO: compiled from: OneShotPreDrawListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0714r implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k */
    private final View f4102k;

    /* JADX INFO: renamed from: n */
    private final Runnable f4103n;

    /* JADX INFO: renamed from: q */
    private ViewTreeObserver f4104q;

    private ViewTreeObserverOnPreDrawListenerC0714r(View view, Runnable runnable) {
        this.f4102k = view;
        this.f4104q = view.getViewTreeObserver();
        this.f4103n = runnable;
    }

    @zy.lvui
    /* JADX INFO: renamed from: k */
    public static ViewTreeObserverOnPreDrawListenerC0714r m3434k(@zy.lvui View view, @zy.lvui Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        ViewTreeObserverOnPreDrawListenerC0714r viewTreeObserverOnPreDrawListenerC0714r = new ViewTreeObserverOnPreDrawListenerC0714r(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0714r);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0714r);
        return viewTreeObserverOnPreDrawListenerC0714r;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        toq();
        this.f4103n.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@zy.lvui View view) {
        this.f4104q = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@zy.lvui View view) {
        toq();
    }

    public void toq() {
        if (this.f4104q.isAlive()) {
            this.f4104q.removeOnPreDrawListener(this);
        } else {
            this.f4102k.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f4102k.removeOnAttachStateChangeListener(this);
    }
}
