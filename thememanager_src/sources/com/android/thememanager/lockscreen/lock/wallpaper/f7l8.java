package com.android.thememanager.lockscreen.lock.wallpaper;

import android.opengl.GLSurfaceView;
import com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: compiled from: GLES20ContextFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements GLSurfaceView.EGLContextFactory, GLTextureView.f7l8 {

    /* JADX INFO: renamed from: k */
    private static int f12488k = 12440;

    @Override // android.opengl.GLSurfaceView.EGLContextFactory, com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.f7l8
    public EGLContext createContext(EGL10 egl, EGLDisplay display, EGLConfig eglConfig) {
        return egl.eglCreateContext(display, eglConfig, EGL10.EGL_NO_CONTEXT, new int[]{f12488k, 2, 12344});
    }

    @Override // android.opengl.GLSurfaceView.EGLContextFactory, com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.f7l8
    public void destroyContext(EGL10 egl, EGLDisplay display, EGLContext context) {
        egl.eglDestroyContext(display, context);
    }
}
