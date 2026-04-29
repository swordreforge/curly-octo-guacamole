package com.android.thememanager.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC0928g;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.widget.ScreenView;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceAutoScrollScreenView extends ResourceScreenView implements InterfaceC0928g {
    private static final long l2jk = 8000;
    private final Runnable gjxq;
    private final Handler h06;
    private a9 r7v2;

    /* JADX INFO: renamed from: com.android.thememanager.view.ResourceAutoScrollScreenView$k */
    class RunnableC2896k implements Runnable {
        RunnableC2896k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ResourceAutoScrollScreenView.this.i1();
            ResourceAutoScrollScreenView.this.h06.postDelayed(ResourceAutoScrollScreenView.this.gjxq, ResourceAutoScrollScreenView.l2jk);
        }
    }

    public ResourceAutoScrollScreenView(Context context) {
        super(context);
        this.h06 = new Handler(Looper.getMainLooper());
        this.gjxq = new RunnableC2896k();
    }

    /* JADX INFO: renamed from: a */
    private void m10288a() {
        this.h06.removeCallbacks(this.gjxq);
        this.h06.postDelayed(this.gjxq, l2jk);
    }

    private int a98o(int index) {
        return (index * this.f17813x) + getPaddingLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i1() {
        if (getTouchState() != 0 || getScreenCount() <= 1) {
            return;
        }
        x9kr(getCurrentScreenIndex() + 1);
    }

    private void zp() {
        this.h06.removeCallbacks(this.gjxq);
    }

    @Override // com.android.thememanager.widget.ScreenView
    protected void d2ok(MotionEvent ev, int touchState) {
        if (touchState == 0) {
            m10288a();
        }
        super.d2ok(ev, touchState);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void f7l8(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        m10288a();
        super.onFinishTemporaryDetach();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStart(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        zp();
        super.onStartTemporaryDetach();
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onStop(@zy.lvui InterfaceC0954z owner) {
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        if (visibility == 0) {
            m10288a();
        }
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // com.android.thememanager.view.ResourceScreenView, com.android.thememanager.widget.ScreenView
    public void setCurrentScreenInner(int screenIndex) {
        if (getScreenCount() > 2) {
            if (screenIndex == 0) {
                screenIndex = getScreenCount() - 2;
                setScrollX(a98o(screenIndex));
            } else if (screenIndex == getScreenCount() - 1) {
                setScrollX(a98o(1));
                screenIndex = 1;
            }
        }
        super.setCurrentScreenInner(screenIndex);
    }

    public void setRecommendItemFactory(a9 factory) {
        this.r7v2 = factory;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@zy.lvui InterfaceC0954z owner) {
        m10288a();
        super.fn3e();
    }

    /* JADX INFO: renamed from: x */
    public void m10289x(List<RecommendItem> datas) {
        int i2 = getContext().getResources().getDisplayMetrics().widthPixels;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(i2, (i2 * 540) / 1080);
        Iterator<RecommendItem> it = datas.iterator();
        while (it.hasNext()) {
            addView(this.r7v2.mo7319k(it.next(), this), layoutParams);
        }
        if (datas.size() <= 1) {
            setSeekBarVisibility(8);
            return;
        }
        addView(this.r7v2.mo7319k(datas.get(datas.size() - 1), this), 0, layoutParams);
        addView(this.r7v2.mo7319k(datas.get(0), this), getScreenCount(), layoutParams);
        setCurrentScreen(1);
        this.f17809t.getChildAt(0).setVisibility(8);
        ScreenView.SeekBarIndicator seekBarIndicator = this.f17809t;
        seekBarIndicator.getChildAt(seekBarIndicator.getChildCount() - 1).setVisibility(8);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void zurt(@zy.lvui InterfaceC0954z owner) {
        zp();
        super.m10503h();
    }

    public ResourceAutoScrollScreenView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.h06 = new Handler(Looper.getMainLooper());
        this.gjxq = new RunnableC2896k();
    }

    public ResourceAutoScrollScreenView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.h06 = new Handler(Looper.getMainLooper());
        this.gjxq = new RunnableC2896k();
    }
}
