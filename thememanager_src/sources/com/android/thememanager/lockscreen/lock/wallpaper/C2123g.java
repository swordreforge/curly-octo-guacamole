package com.android.thememanager.lockscreen.lock.wallpaper;

import android.opengl.GLSurfaceView;
import com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.g */
/* JADX INFO: compiled from: GLES20ConfigChooser.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2123g implements GLSurfaceView.EGLConfigChooser, GLTextureView.InterfaceC2115g {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f60382f7l8 = 4;

    /* JADX INFO: renamed from: y */
    private static int[] f12491y = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    /* JADX INFO: renamed from: g */
    protected int f12492g;

    /* JADX INFO: renamed from: k */
    protected int f12493k;

    /* JADX INFO: renamed from: n */
    protected int f12494n;

    /* JADX INFO: renamed from: q */
    protected int f12495q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected int f60383toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected int f60384zy;

    public C2123g(int r2, int g2, int b2, int a2, int depth, int stencil) {
        this.f12493k = r2;
        this.f60383toq = g2;
        this.f60384zy = b2;
        this.f12495q = a2;
        this.f12494n = depth;
        this.f12492g = stencil;
    }

    private int toq(EGL10 egl, EGLDisplay display, EGLConfig config, int attribute, int defValue) {
        int[] iArr = new int[1];
        return egl.eglGetConfigAttrib(display, config, attribute, iArr) ? iArr[0] : defValue;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser, com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.InterfaceC2115g
    public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display) {
        int[] iArr = new int[1];
        egl.eglChooseConfig(display, f12491y, null, 0, iArr);
        int i2 = iArr[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        egl.eglChooseConfig(display, f12491y, eGLConfigArr, i2, iArr);
        return m8122k(egl, display, eGLConfigArr);
    }

    /* JADX INFO: renamed from: k */
    public EGLConfig m8122k(EGL10 egl, EGLDisplay display, EGLConfig[] configs) {
        for (EGLConfig eGLConfig : configs) {
            int qVar = toq(egl, display, eGLConfig, 12325, 0);
            int qVar2 = toq(egl, display, eGLConfig, 12326, 0);
            if (qVar >= this.f12494n && qVar2 >= this.f12492g) {
                int qVar3 = toq(egl, display, eGLConfig, 12324, 0);
                int qVar4 = toq(egl, display, eGLConfig, 12323, 0);
                int qVar5 = toq(egl, display, eGLConfig, 12322, 0);
                int qVar6 = toq(egl, display, eGLConfig, 12321, 0);
                if (qVar3 == this.f12493k && qVar4 == this.f60383toq && qVar5 == this.f60384zy && qVar6 == this.f12495q) {
                    return eGLConfig;
                }
            }
        }
        return null;
    }
}
