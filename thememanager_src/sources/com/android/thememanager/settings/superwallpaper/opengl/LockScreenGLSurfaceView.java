package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class LockScreenGLSurfaceView extends BaseGLSurfaceView {

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.opengl.LockScreenGLSurfaceView$k */
    class RunnableC2658k implements Runnable {
        RunnableC2658k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LockScreenGLSurfaceView.this.requestRender();
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f15731k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f15733q;

        toq(final boolean val$isSuperWallpaper, final String val$wpName) {
            this.f15731k = val$isSuperWallpaper;
            this.f15733q = val$wpName;
        }

        @Override // java.lang.Runnable
        public void run() {
            LockScreenGLSurfaceView.this.f15723n.m9252q(this.f15731k, this.f15733q);
            LockScreenGLSurfaceView.this.f15723n.m9251n();
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LockScreenGLSurfaceView.this.requestRender();
        }
    }

    public LockScreenGLSurfaceView(Context context) {
        super(context);
    }

    @Override // com.android.thememanager.settings.superwallpaper.opengl.BaseGLSurfaceView
    /* JADX INFO: renamed from: k */
    public void mo9247k(boolean isSuperWallpaper, String wpName) {
        Log.i(this.f15722k, "init " + this.f15723n + " " + hashCode());
        if (this.f15723n != null) {
            queueEvent(new toq(isSuperWallpaper, wpName));
            post(new zy());
            return;
        }
        com.android.thememanager.settings.superwallpaper.opengl.zy zyVar = new com.android.thememanager.settings.superwallpaper.opengl.zy(this.f15724q);
        this.f15723n = zyVar;
        zyVar.m9252q(isSuperWallpaper, wpName);
        setRenderer(this.f15723n);
        setRenderMode(0);
        post(new RunnableC2658k());
    }

    public LockScreenGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
