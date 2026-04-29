package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.opengl.n */
/* JADX INFO: compiled from: WallpaperRender.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2660n implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: g */
    private boolean f15742g;

    /* JADX INFO: renamed from: h */
    private boolean f15743h;

    /* JADX INFO: renamed from: k */
    protected final String f15744k = getClass().getSimpleName();

    /* JADX INFO: renamed from: n */
    protected Bitmap f15745n;

    /* JADX INFO: renamed from: p */
    protected String f15746p;

    /* JADX INFO: renamed from: q */
    protected Context f15747q;

    /* JADX INFO: renamed from: s */
    protected boolean f15748s;

    /* JADX INFO: renamed from: y */
    private C2659k f15749y;

    public C2660n(Context context) {
        this.f15747q = context;
    }

    /* JADX INFO: renamed from: g */
    private void m9249g() {
        Bitmap bitmap = this.f15745n;
        boolean z2 = bitmap == null || com.android.thememanager.settings.superwallpaper.utils.toq.m9300k(this.f15747q, bitmap) != 0;
        Log.d(this.f15744k, "updateDarkenWallpaper isLight " + z2);
        if (z2 || this.f15748s) {
            this.f15742g = false;
        } else {
            this.f15742g = true;
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m9250k() {
        return !this.f15748s && com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj();
    }

    private boolean toq() {
        return this.f15742g && com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().n7h();
    }

    /* JADX INFO: renamed from: n */
    public void m9251n() {
        this.f15745n = zy();
        Log.i(this.f15744k, "updateBitmap " + this.f15749y + " " + this.f15745n);
        this.f15743h = true;
        m9249g();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl) {
        Log.d(this.f15744k, "onDrawFrame mHasNewBitmap = " + this.f15743h + " isDarkenWallpaper = " + toq() + " isDarkMode = " + m9250k());
        if (this.f15743h) {
            this.f15749y.toq(this.f15745n);
            this.f15743h = false;
        }
        this.f15749y.zy(toq(), m9250k());
        GLES20.glClear(16384);
        this.f15749y.m9248k();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        Log.d(this.f15744k, "onSurfaceChanged ");
        GLES20.glViewport(0, 0, width, height);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        Log.d(this.f15744k, "onSurfaceCreated ");
        this.f15745n = zy();
        C2659k c2659k = new C2659k(this.f15747q);
        this.f15749y = c2659k;
        c2659k.toq(this.f15745n);
        Log.i(this.f15744k, "onSurfaceCreated " + this.f15749y);
        m9249g();
    }

    /* JADX INFO: renamed from: q */
    public void m9252q(boolean isSuperWallpaper, String wpName) {
        this.f15748s = isSuperWallpaper;
        this.f15746p = wpName;
    }

    public Bitmap zy() {
        return null;
    }
}
