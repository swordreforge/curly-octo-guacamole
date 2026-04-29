package com.android.thememanager.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.model.AdListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceScrollView extends ScrollView {

    /* JADX INFO: renamed from: s */
    private static final int f17410s = 1000;

    /* JADX INFO: renamed from: g */
    private int f17411g;

    /* JADX INFO: renamed from: k */
    private boolean f17412k;

    /* JADX INFO: renamed from: n */
    private HashMap<WeakReference<View>, Boolean> f17413n;

    /* JADX INFO: renamed from: q */
    private InterfaceC2899k f17414q;

    /* JADX INFO: renamed from: y */
    private int[] f17415y;

    /* JADX INFO: renamed from: com.android.thememanager.view.ResourceScrollView$k */
    public interface InterfaceC2899k {
        /* JADX INFO: renamed from: k */
        void m10295k(int distance);
    }

    public ResourceScrollView(Context context) {
        super(context);
        this.f17413n = new HashMap<>();
        this.f17415y = new int[2];
    }

    private boolean toq(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        view.getLocationOnScreen(this.f17415y);
        int height = view.getHeight() / 2;
        int i2 = this.f17415y[1];
        return i2 + height >= 0 && i2 + height <= this.f17411g;
    }

    /* JADX INFO: renamed from: k */
    public void m10294k(View view) {
        y9n.m7255s();
        this.f17413n.put(new WeakReference<>(view), Boolean.FALSE);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        this.f17411g = y9n.zurt().y;
        super.onFinishInflate();
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.f17412k) {
            return false;
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    protected void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        InterfaceC2899k interfaceC2899k = this.f17414q;
        if (interfaceC2899k != null) {
            interfaceC2899k.m10295k(t2);
        }
        Iterator<Map.Entry<WeakReference<View>, Boolean>> it = this.f17413n.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<WeakReference<View>, Boolean> next = it.next();
            View view = next.getKey().get();
            if (view == 0) {
                it.remove();
            } else if (view instanceof AdListener) {
                boolean qVar = toq(view);
                if (qVar && !next.getValue().booleanValue()) {
                    view.postDelayed(((AdListener) view).getReportViewRunnable(), 1000L);
                    next.setValue(Boolean.TRUE);
                } else if (!qVar && next.getValue().booleanValue()) {
                    view.removeCallbacks(((AdListener) view).getReportViewRunnable());
                    next.setValue(Boolean.FALSE);
                }
            }
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        if (focused instanceof ListView) {
            return;
        }
        super.requestChildFocus(child, focused);
    }

    public void setOnScrollChangeCallback(InterfaceC2899k scrollYDirectionCallback) {
        this.f17414q = scrollYDirectionCallback;
    }

    public void zy() {
        this.f17412k = true;
    }

    public ResourceScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17413n = new HashMap<>();
        this.f17415y = new int[2];
    }

    public ResourceScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17413n = new HashMap<>();
        this.f17415y = new int[2];
    }
}
