package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: EGLSurfaceTexture.java */
/* JADX INFO: loaded from: classes2.dex */
@zy.hyr(17)
public final class x2 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: f */
    private static final int f23322f = 12992;

    /* JADX INFO: renamed from: h */
    public static final int f23323h = 0;

    /* JADX INFO: renamed from: i */
    public static final int f23324i = 1;

    /* JADX INFO: renamed from: l */
    private static final int[] f23325l = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: r */
    private static final int f23326r = 1;

    /* JADX INFO: renamed from: t */
    private static final int f23327t = 1;

    /* JADX INFO: renamed from: z */
    public static final int f23328z = 2;

    /* JADX INFO: renamed from: g */
    @zy.dd
    private EGLDisplay f23329g;

    /* JADX INFO: renamed from: k */
    private final Handler f23330k;

    /* JADX INFO: renamed from: n */
    @zy.dd
    private final InterfaceC3860q f23331n;

    /* JADX INFO: renamed from: p */
    @zy.dd
    private SurfaceTexture f23332p;

    /* JADX INFO: renamed from: q */
    private final int[] f23333q;

    /* JADX INFO: renamed from: s */
    @zy.dd
    private EGLSurface f23334s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private EGLContext f23335y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.x2$q */
    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public interface InterfaceC3860q {
        /* JADX INFO: renamed from: k */
        void m13759k();
    }

    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    public static final class toq extends RuntimeException {
        private toq(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: EGLSurfaceTexture.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    public x2(Handler handler) {
        this(handler, null);
    }

    /* JADX INFO: renamed from: g */
    private static EGLDisplay m13753g() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new toq("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            return eGLDisplayEglGetDisplay;
        }
        throw new toq("eglInitialize failed");
    }

    /* JADX INFO: renamed from: k */
    private static EGLConfig m13754k(EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f23325l, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!zEglChooseConfig || iArr[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new toq(lrht.gvn7("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfig;
    }

    /* JADX INFO: renamed from: n */
    private static void m13755n(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        cdj.m13546n();
    }

    /* JADX INFO: renamed from: q */
    private void m13756q() {
        InterfaceC3860q interfaceC3860q = this.f23331n;
        if (interfaceC3860q != null) {
            interfaceC3860q.m13759k();
        }
    }

    private static EGLContext toq(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2) {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, f23322f, 1, 12344}, 0);
        if (eGLContextEglCreateContext != null) {
            return eGLContextEglCreateContext;
        }
        throw new toq("eglCreateContext failed");
    }

    private static EGLSurface zy(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i2) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i2 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, f23322f, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new toq("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext)) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new toq("eglMakeCurrent failed");
    }

    public SurfaceTexture f7l8() {
        return (SurfaceTexture) C3844k.f7l8(this.f23332p);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f23330k.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        m13756q();
        SurfaceTexture surfaceTexture = this.f23332p;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public void m13757s() {
        this.f23330k.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f23332p;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f23333q, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f23329g;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f23329g;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f23334s;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f23329g, this.f23334s);
            }
            EGLContext eGLContext = this.f23335y;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f23329g, eGLContext);
            }
            if (lrht.f23230k >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f23329g;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f23329g);
            }
            this.f23329g = null;
            this.f23335y = null;
            this.f23334s = null;
            this.f23332p = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m13758y(int i2) {
        EGLDisplay eGLDisplayM13753g = m13753g();
        this.f23329g = eGLDisplayM13753g;
        EGLConfig eGLConfigM13754k = m13754k(eGLDisplayM13753g);
        EGLContext qVar = toq(this.f23329g, eGLConfigM13754k, i2);
        this.f23335y = qVar;
        this.f23334s = zy(this.f23329g, eGLConfigM13754k, qVar, i2);
        m13755n(this.f23333q);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f23333q[0]);
        this.f23332p = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public x2(Handler handler, @zy.dd InterfaceC3860q interfaceC3860q) {
        this.f23330k = handler;
        this.f23331n = interfaceC3860q;
        this.f23333q = new int[1];
    }
}
