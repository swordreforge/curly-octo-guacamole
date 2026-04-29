package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class HomeGLSurfaceView extends BaseGLSurfaceView {

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.opengl.HomeGLSurfaceView$k */
    class RunnableC2657k implements Runnable {
        RunnableC2657k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeGLSurfaceView.this.requestRender();
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f15726k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f15728q;

        toq(final boolean val$isSuperWallpaper, final String val$wpName) {
            this.f15726k = val$isSuperWallpaper;
            this.f15728q = val$wpName;
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeGLSurfaceView.this.f15723n.m9252q(this.f15726k, this.f15728q);
            HomeGLSurfaceView.this.f15723n.m9251n();
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HomeGLSurfaceView.this.requestRender();
        }
    }

    public HomeGLSurfaceView(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.settings.superwallpaper.opengl.BaseGLSurfaceView
    /* JADX INFO: renamed from: k */
    public void mo9247k(boolean isSuperWallpaper, String wpName) {
        Log.d(this.f15722k, "init " + this.f15723n);
        if (this.f15723n != null) {
            queueEvent(new toq(isSuperWallpaper, wpName));
            post(new zy());
            return;
        }
        com.android.thememanager.settings.superwallpaper.opengl.toq toqVar = new com.android.thememanager.settings.superwallpaper.opengl.toq(this.f15724q);
        this.f15723n = toqVar;
        toqVar.m9252q(isSuperWallpaper, wpName);
        setRenderer(this.f15723n);
        setRenderMode(0);
        post(new RunnableC2657k());
    }

    public HomeGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
