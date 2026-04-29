package com.android.thememanager.lockscreen.lock.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.WallpaperTypeInfo;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, com.android.thememanager.lockscreen.lock.wallpaper.n7h {

    /* JADX INFO: renamed from: a */
    private static final boolean f12410a = false;

    /* JADX INFO: renamed from: b */
    private static final boolean f12411b = false;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f60366bo = 1;

    /* JADX INFO: renamed from: c */
    private static final boolean f12412c = false;

    /* JADX INFO: renamed from: d */
    private static final ld6 f12413d = new ld6();

    /* JADX INFO: renamed from: e */
    private static final boolean f12414e = false;

    /* JADX INFO: renamed from: f */
    private static final String f12415f = "GLTextureView";

    /* JADX INFO: renamed from: j */
    private static final boolean f12416j = false;

    /* JADX INFO: renamed from: m */
    private static final boolean f12417m = false;

    /* JADX INFO: renamed from: o */
    private static final boolean f12418o = false;

    /* JADX INFO: renamed from: u */
    public static final int f12419u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f12420v = 2;

    /* JADX INFO: renamed from: x */
    public static final int f12421x = 0;

    /* JADX INFO: renamed from: g */
    private boolean f12422g;

    /* JADX INFO: renamed from: h */
    private x2 f12423h;

    /* JADX INFO: renamed from: i */
    private int f12424i;

    /* JADX INFO: renamed from: k */
    private final WeakReference<GLTextureView> f12425k;

    /* JADX INFO: renamed from: l */
    protected HashSet<t8r> f12426l;

    /* JADX INFO: renamed from: n */
    private GLSurfaceView.Renderer f12427n;

    /* JADX INFO: renamed from: p */
    private InterfaceC2121y f12428p;

    /* JADX INFO: renamed from: q */
    private C2118p f12429q;

    /* JADX INFO: renamed from: r */
    com.miui.miwallpaper.opengl.n7h f12430r;

    /* JADX INFO: renamed from: s */
    private f7l8 f12431s;

    /* JADX INFO: renamed from: t */
    private boolean f12432t;

    /* JADX INFO: renamed from: y */
    private InterfaceC2115g f12433y;

    /* JADX INFO: renamed from: z */
    private int f12434z;

    public interface f7l8 {
        EGLContext createContext(EGL10 egl, EGLDisplay display, EGLConfig eglConfig);

        void destroyContext(EGL10 egl, EGLDisplay display, EGLContext context);
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView$g */
    public interface InterfaceC2115g {
        EGLConfig chooseConfig(EGL10 egl, EGLDisplay display);
    }

    private static class ld6 {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static String f60367f7l8 = "GLThreadManager";

        /* JADX INFO: renamed from: s */
        private static final String f12435s = "Q3Dimension MSM7500 ";

        /* JADX INFO: renamed from: y */
        private static final int f12436y = 131072;

        /* JADX INFO: renamed from: g */
        private C2118p f12437g;

        /* JADX INFO: renamed from: k */
        private boolean f12438k;

        /* JADX INFO: renamed from: n */
        private boolean f12439n;

        /* JADX INFO: renamed from: q */
        private boolean f12440q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f60368toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f60369zy;

        private ld6() {
        }

        private void toq() {
        }

        public boolean f7l8(C2118p thread) {
            C2118p c2118p = this.f12437g;
            if (c2118p == thread || c2118p == null) {
                this.f12437g = thread;
                notifyAll();
                return true;
            }
            toq();
            if (this.f12440q) {
                return true;
            }
            C2118p c2118p2 = this.f12437g;
            if (c2118p2 == null) {
                return false;
            }
            c2118p2.ld6();
            return false;
        }

        /* JADX INFO: renamed from: g */
        public synchronized void m8098g(C2118p thread) {
            thread.f12455q = true;
            if (this.f12437g == thread) {
                this.f12437g = null;
            }
            notifyAll();
        }

        /* JADX INFO: renamed from: k */
        public synchronized void m8099k(GL10 gl) {
            if (!this.f60369zy) {
                toq();
                String strGlGetString = gl.glGetString(7937);
                if (this.f60368toq < 131072) {
                    this.f12440q = !strGlGetString.startsWith(f12435s);
                    notifyAll();
                }
                this.f12439n = this.f12440q ? false : true;
                this.f60369zy = true;
            }
        }

        /* JADX INFO: renamed from: n */
        public synchronized boolean m8100n() {
            toq();
            return !this.f12440q;
        }

        /* JADX INFO: renamed from: q */
        public synchronized boolean m8101q() {
            return this.f12439n;
        }

        public void zy(C2118p thread) {
            if (this.f12437g == thread) {
                this.f12437g = null;
            }
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView$n */
    private static class C2117n implements InterfaceC2121y {
        private C2117n() {
        }

        @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.InterfaceC2121y
        public EGLSurface createWindowSurface(EGL10 egl, EGLDisplay display, EGLConfig config, Object nativeWindow) {
            try {
                return egl.eglCreateWindowSurface(display, config, nativeWindow, null);
            } catch (IllegalArgumentException e2) {
                Log.e(GLTextureView.f12415f, "eglCreateWindowSurface", e2);
                return null;
            }
        }

        @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.InterfaceC2121y
        public void destroySurface(EGL10 egl, EGLDisplay display, EGLSurface surface) {
            egl.eglDestroySurface(display, surface);
        }
    }

    private class n7h extends zy {
        public n7h(boolean withDepthBuffer) {
            super(8, 8, 8, 0, withDepthBuffer ? 16 : 0, 0);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView$p */
    static class C2118p extends Thread {

        /* JADX INFO: renamed from: b */
        private WeakReference<GLTextureView> f12441b;

        /* JADX INFO: renamed from: e */
        private boolean f12443e;

        /* JADX INFO: renamed from: g */
        private boolean f12445g;

        /* JADX INFO: renamed from: h */
        private boolean f12446h;

        /* JADX INFO: renamed from: i */
        private boolean f12447i;

        /* JADX INFO: renamed from: k */
        private boolean f12449k;

        /* JADX INFO: renamed from: m */
        private C2120s f12451m;

        /* JADX INFO: renamed from: n */
        private boolean f12452n;

        /* JADX INFO: renamed from: p */
        private boolean f12454p;

        /* JADX INFO: renamed from: q */
        private boolean f12455q;

        /* JADX INFO: renamed from: s */
        private boolean f12457s;

        /* JADX INFO: renamed from: t */
        private boolean f12458t;

        /* JADX INFO: renamed from: y */
        private boolean f12459y;

        /* JADX INFO: renamed from: z */
        private boolean f12460z;

        /* JADX INFO: renamed from: j */
        private ArrayList<Runnable> f12448j = new ArrayList<>();

        /* JADX INFO: renamed from: o */
        private boolean f12453o = true;

        /* JADX INFO: renamed from: r */
        private int f12456r = 0;

        /* JADX INFO: renamed from: l */
        private int f12450l = 0;

        /* JADX INFO: renamed from: c */
        private boolean f12442c = true;

        /* JADX INFO: renamed from: f */
        private int f12444f = 1;

        C2118p(WeakReference<GLTextureView> glTextureViewWeakRef) {
            this.f12441b = glTextureViewWeakRef;
        }

        private void kja0() {
            if (this.f12447i) {
                this.f12447i = false;
                this.f12451m.zy();
            }
        }

        private void n7h() {
            if (this.f12446h) {
                this.f12451m.m8114g();
                this.f12446h = false;
                GLTextureView.f12413d.zy(this);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:170:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: q */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m8102q() throws java.lang.InterruptedException {
            /*
                Method dump skipped, instruction units count: 557
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.C2118p.m8102q():void");
        }

        /* JADX INFO: renamed from: s */
        private boolean m8103s() {
            return !this.f12445g && this.f12459y && !this.f12457s && this.f12456r > 0 && this.f12450l > 0 && (this.f12442c || this.f12444f == 1);
        }

        public void cdj() {
            synchronized (GLTextureView.f12413d) {
                this.f12459y = false;
                GLTextureView.f12413d.notifyAll();
                while (!this.f12454p && !this.f12455q) {
                    try {
                        GLTextureView.f12413d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void f7l8(int w2, int h2) {
            synchronized (GLTextureView.f12413d) {
                this.f12456r = w2;
                this.f12450l = h2;
                this.f12453o = true;
                this.f12442c = true;
                this.f12443e = false;
                GLTextureView.f12413d.notifyAll();
                while (!this.f12455q && !this.f12445g && !this.f12443e && m8106k()) {
                    try {
                        GLTextureView.f12413d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public void m8104g() {
            synchronized (GLTextureView.f12413d) {
                this.f12452n = false;
                this.f12442c = true;
                this.f12443e = false;
                GLTextureView.f12413d.notifyAll();
                while (!this.f12455q && this.f12445g && !this.f12443e) {
                    try {
                        GLTextureView.f12413d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m8105h() {
            synchronized (GLTextureView.f12413d) {
                this.f12459y = true;
                this.f12460z = false;
                GLTextureView.f12413d.notifyAll();
                while (this.f12454p && !this.f12460z && !this.f12455q) {
                    try {
                        GLTextureView.f12413d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: k */
        public boolean m8106k() {
            return this.f12446h && this.f12447i && m8103s();
        }

        public void ld6() {
            this.f12458t = true;
            GLTextureView.f12413d.notifyAll();
        }

        /* JADX INFO: renamed from: n */
        public void m8107n() {
            synchronized (GLTextureView.f12413d) {
                this.f12452n = true;
                GLTextureView.f12413d.notifyAll();
                while (!this.f12455q && !this.f12445g) {
                    try {
                        GLTextureView.f12413d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: p */
        public void m8108p() {
            synchronized (GLTextureView.f12413d) {
                this.f12449k = true;
                GLTextureView.f12413d.notifyAll();
                while (!this.f12455q) {
                    try {
                        GLTextureView.f12413d.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void qrj(int renderMode) {
            if (renderMode < 0 || renderMode > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (GLTextureView.f12413d) {
                this.f12444f = renderMode;
                GLTextureView.f12413d.notifyAll();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                m8102q();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                GLTextureView.f12413d.m8098g(this);
                throw th;
            }
            GLTextureView.f12413d.m8098g(this);
        }

        public void x2() {
            synchronized (GLTextureView.f12413d) {
                this.f12442c = true;
                GLTextureView.f12413d.notifyAll();
            }
        }

        /* JADX INFO: renamed from: y */
        public void m8109y(Runnable r2) {
            if (r2 == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (GLTextureView.f12413d) {
                this.f12448j.add(r2);
                GLTextureView.f12413d.notifyAll();
            }
        }

        public int zy() {
            int i2;
            synchronized (GLTextureView.f12413d) {
                i2 = this.f12444f;
            }
            return i2;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView$q */
    private class C2119q implements f7l8 {

        /* JADX INFO: renamed from: k */
        private int f12461k;

        private C2119q() {
            this.f12461k = 12440;
        }

        @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.f7l8
        public EGLContext createContext(EGL10 egl, EGLDisplay display, EGLConfig config) {
            int[] iArr = {this.f12461k, GLTextureView.this.f12434z, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.f12434z == 0) {
                iArr = null;
            }
            return egl.eglCreateContext(display, config, eGLContext, iArr);
        }

        @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.f7l8
        public void destroyContext(EGL10 egl, EGLDisplay display, EGLContext context) {
            if (egl.eglDestroyContext(display, context)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + display + " context: " + context);
            C2120s.x2("eglDestroyContex", egl.eglGetError());
        }
    }

    static class qrj extends Writer {

        /* JADX INFO: renamed from: k */
        private StringBuilder f12462k = new StringBuilder();

        qrj() {
        }

        /* JADX INFO: renamed from: k */
        private void m8110k() {
            if (this.f12462k.length() > 0) {
                Log.v(GLTextureView.f12415f, this.f12462k.toString());
                StringBuilder sb = this.f12462k;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            m8110k();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            m8110k();
        }

        @Override // java.io.Writer
        public void write(char[] buf, int offset, int count) {
            for (int i2 = 0; i2 < count; i2++) {
                char c2 = buf[offset + i2];
                if (c2 == '\n') {
                    m8110k();
                } else {
                    this.f12462k.append(c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView$s */
    private static class C2120s {

        /* JADX INFO: renamed from: g */
        EGLContext f12463g;

        /* JADX INFO: renamed from: k */
        private WeakReference<GLTextureView> f12464k;

        /* JADX INFO: renamed from: n */
        EGLConfig f12465n;

        /* JADX INFO: renamed from: q */
        EGLSurface f12466q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        EGL10 f60372toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        EGLDisplay f60373zy;

        public C2120s(WeakReference<GLTextureView> glTextureViewWeakRef) {
            this.f12464k = glTextureViewWeakRef;
        }

        public static String f7l8(String function, int error) {
            return function + " failed: " + m8111n(error);
        }

        private void ld6(String function) {
            x2(function, this.f60372toq.eglGetError());
        }

        /* JADX INFO: renamed from: n */
        static String m8111n(int error) {
            switch (error) {
                case 12288:
                    return "EGL_SUCCESS";
                case 12289:
                    return "EGL_NOT_INITIALIZED";
                case 12290:
                    return "EGL_BAD_ACCESS";
                case 12291:
                    return "EGL_BAD_ALLOC";
                case 12292:
                    return "EGL_BAD_ATTRIBUTE";
                case 12293:
                    return "EGL_BAD_CONFIG";
                case 12294:
                    return "EGL_BAD_CONTEXT";
                case 12295:
                    return "EGL_BAD_CURRENT_SURFACE";
                case 12296:
                    return "EGL_BAD_DISPLAY";
                case 12297:
                    return "EGL_BAD_MATCH";
                case 12298:
                    return "EGL_BAD_NATIVE_PIXMAP";
                case 12299:
                    return "EGL_BAD_NATIVE_WINDOW";
                case 12300:
                    return "EGL_BAD_PARAMETER";
                case 12301:
                    return "EGL_BAD_SURFACE";
                case 12302:
                    return "EGL_CONTEXT_LOST";
                default:
                    return "0x" + Integer.toHexString(error);
            }
        }

        /* JADX INFO: renamed from: q */
        private void m8112q() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f12466q;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f60372toq.eglMakeCurrent(this.f60373zy, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f12464k.get();
            if (gLTextureView != null) {
                gLTextureView.f12428p.destroySurface(this.f60372toq, this.f60373zy, this.f12466q);
            }
            this.f12466q = null;
        }

        public static void x2(String function, int error) {
            throw new RuntimeException(f7l8(function, error));
        }

        /* JADX INFO: renamed from: y */
        public static void m8113y(String tag, String function, int error) {
            Log.w(tag, f7l8(function, error));
        }

        /* JADX INFO: renamed from: g */
        public void m8114g() {
            if (this.f12463g != null) {
                GLTextureView gLTextureView = this.f12464k.get();
                if (gLTextureView != null) {
                    gLTextureView.f12431s.destroyContext(this.f60372toq, this.f60373zy, this.f12463g);
                }
                this.f12463g = null;
            }
            EGLDisplay eGLDisplay = this.f60373zy;
            if (eGLDisplay != null) {
                this.f60372toq.eglTerminate(eGLDisplay);
                this.f60373zy = null;
            }
        }

        /* JADX INFO: renamed from: k */
        GL m8115k() {
            GL gl = this.f12463g.getGL();
            GLTextureView gLTextureView = this.f12464k.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.f12423h != null) {
                gl = gLTextureView.f12423h.wrap(gl);
            }
            if ((gLTextureView.f12424i & 3) != 0) {
                return GLDebugHelper.wrap(gl, (gLTextureView.f12424i & 1) != 0 ? 1 : 0, (gLTextureView.f12424i & 2) != 0 ? new qrj() : null);
            }
            return gl;
        }

        /* JADX INFO: renamed from: p */
        public int m8116p() {
            if (this.f60372toq.eglSwapBuffers(this.f60373zy, this.f12466q)) {
                return 12288;
            }
            return this.f60372toq.eglGetError();
        }

        /* JADX INFO: renamed from: s */
        public void m8117s() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f60372toq = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f60373zy = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f60372toq.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.f12464k.get();
            if (gLTextureView == null) {
                this.f12465n = null;
                this.f12463g = null;
            } else {
                this.f12465n = gLTextureView.f12433y.chooseConfig(this.f60372toq, this.f60373zy);
                this.f12463g = gLTextureView.f12431s.createContext(this.f60372toq, this.f60373zy, this.f12465n);
            }
            EGLContext eGLContext = this.f12463g;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f12463g = null;
                ld6("createContext");
            }
            this.f12466q = null;
        }

        public boolean toq() {
            if (this.f60372toq == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f60373zy == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f12465n == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            m8112q();
            GLTextureView gLTextureView = this.f12464k.get();
            if (gLTextureView != null) {
                this.f12466q = gLTextureView.f12428p.createWindowSurface(this.f60372toq, this.f60373zy, this.f12465n, gLTextureView.getSurfaceTexture());
            } else {
                this.f12466q = null;
            }
            EGLSurface eGLSurface = this.f12466q;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f60372toq.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f60372toq.eglMakeCurrent(this.f60373zy, eGLSurface, eGLSurface, this.f12463g)) {
                return true;
            }
            m8113y("EGLHelper", "eglMakeCurrent", this.f60372toq.eglGetError());
            return false;
        }

        public void zy() {
            m8112q();
        }
    }

    private abstract class toq implements InterfaceC2115g {

        /* JADX INFO: renamed from: k */
        protected int[] f12467k;

        public toq(int[] configSpec) {
            this.f12467k = toq(configSpec);
        }

        private int[] toq(int[] configSpec) {
            if (GLTextureView.this.f12434z != 2 && GLTextureView.this.f12434z != 3) {
                return configSpec;
            }
            int length = configSpec.length;
            int[] iArr = new int[length + 2];
            int i2 = length - 1;
            System.arraycopy(configSpec, 0, iArr, 0, i2);
            iArr[i2] = 12352;
            if (GLTextureView.this.f12434z == 2) {
                iArr[length] = 4;
            } else {
                iArr[length] = 64;
            }
            iArr[length + 1] = 12344;
            return iArr;
        }

        @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.InterfaceC2115g
        public EGLConfig chooseConfig(EGL10 egl, EGLDisplay display) {
            int[] iArr = new int[1];
            if (!egl.eglChooseConfig(display, this.f12467k, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i2 = iArr[0];
            if (i2 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i2];
            if (!egl.eglChooseConfig(display, this.f12467k, eGLConfigArr, i2, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig eGLConfigMo8118k = mo8118k(egl, display, eGLConfigArr);
            if (eGLConfigMo8118k != null) {
                return eGLConfigMo8118k;
            }
            throw new IllegalArgumentException("No config chosen");
        }

        /* JADX INFO: renamed from: k */
        abstract EGLConfig mo8118k(EGL10 egl, EGLDisplay display, EGLConfig[] configs);
    }

    public interface x2 {
        GL wrap(GL gl);
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView$y */
    public interface InterfaceC2121y {
        EGLSurface createWindowSurface(EGL10 egl, EGLDisplay display, EGLConfig config, Object nativeWindow);

        void destroySurface(EGL10 egl, EGLDisplay display, EGLSurface surface);
    }

    private class zy extends toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        protected int f60375f7l8;

        /* JADX INFO: renamed from: g */
        protected int f12468g;

        /* JADX INFO: renamed from: n */
        protected int f12469n;

        /* JADX INFO: renamed from: q */
        protected int f12471q;

        /* JADX INFO: renamed from: s */
        protected int f12472s;

        /* JADX INFO: renamed from: y */
        protected int f12473y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int[] f60376zy;

        public zy(int redSize, int greenSize, int blueSize, int alphaSize, int depthSize, int stencilSize) {
            super(new int[]{12324, redSize, 12323, greenSize, 12322, blueSize, 12321, alphaSize, 12325, depthSize, 12326, stencilSize, 12344});
            this.f60376zy = new int[1];
            this.f12471q = redSize;
            this.f12469n = greenSize;
            this.f12468g = blueSize;
            this.f60375f7l8 = alphaSize;
            this.f12473y = depthSize;
            this.f12472s = stencilSize;
        }

        private int zy(EGL10 egl, EGLDisplay display, EGLConfig config, int attribute, int defaultValue) {
            return egl.eglGetConfigAttrib(display, config, attribute, this.f60376zy) ? this.f60376zy[0] : defaultValue;
        }

        @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView.toq
        /* JADX INFO: renamed from: k */
        public EGLConfig mo8118k(EGL10 egl, EGLDisplay display, EGLConfig[] configs) {
            for (EGLConfig eGLConfig : configs) {
                int iZy = zy(egl, display, eGLConfig, 12325, 0);
                int iZy2 = zy(egl, display, eGLConfig, 12326, 0);
                if (iZy >= this.f12473y && iZy2 >= this.f12472s) {
                    int iZy3 = zy(egl, display, eGLConfig, 12324, 0);
                    int iZy4 = zy(egl, display, eGLConfig, 12323, 0);
                    int iZy5 = zy(egl, display, eGLConfig, 12322, 0);
                    int iZy6 = zy(egl, display, eGLConfig, 12321, 0);
                    if (iZy3 == this.f12471q && iZy4 == this.f12469n && iZy5 == this.f12468g && iZy6 == this.f60375f7l8) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f12425k = new WeakReference<>(this);
        this.f12430r = null;
        this.f12426l = new HashSet<>();
        m8096z();
    }

    private void fu4() {
        if (this.f12429q != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1t(int i2) {
        if (this.f12430r != null) {
            Log.d(f12415f, "switch Glass Shader: setEffectType " + i2);
            this.f12430r.m18028s(i2);
            jk();
        }
    }

    /* JADX INFO: renamed from: z */
    private void m8096z() {
        super.setSurfaceTextureListener(this);
    }

    protected void finalize() throws Throwable {
        try {
            C2118p c2118p = this.f12429q;
            if (c2118p != null) {
                c2118p.m8108p();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    /* JADX INFO: renamed from: g */
    public View mo8091g() {
        return this;
    }

    public int getDebugFlags() {
        return this.f12424i;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    public InterfaceC2132s getGestureEndCallback() {
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    public com.android.thememanager.lockscreen.lock.wallpaper.qrj getGestureManager() {
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    public Bitmap getOriginBitmap() {
        return null;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f12432t;
    }

    public int getRenderMode() {
        return this.f12429q.zy();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean getScaleable() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @lvui
    public HashSet<t8r> getWallpaperChangedListenerSet() {
        return this.f12426l;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    public Matrix getWallpaperMatrix() {
        return null;
    }

    public void jk() {
        this.f12429q.x2();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    /* JADX INFO: renamed from: k */
    public void mo8092k(@dd WallpaperTypeInfo wallpaperTypeInfo) {
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void kja0(@dd t8r listener) {
    }

    public void mcp(Runnable r2) {
        this.f12429q.m8109y(r2);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    public WallpaperPositionInfo n7h(@dd Bitmap srcBitmap) {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12422g && this.f12427n != null) {
            C2118p c2118p = this.f12429q;
            int iZy = c2118p != null ? c2118p.zy() : 1;
            C2118p c2118p2 = new C2118p(this.f12425k);
            this.f12429q = c2118p2;
            if (iZy != 1) {
                c2118p2.qrj(iZy);
            }
            this.f12429q.start();
        }
        this.f12422g = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        C2118p c2118p = this.f12429q;
        if (c2118p != null) {
            c2118p.m8108p();
        }
        this.f12422g = true;
        super.onDetachedFromWindow();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        this.f12429q.m8105h();
        onSurfaceTextureSizeChanged(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
        this.f12429q.cdj();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {
        this.f12429q.f7l8(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surface) {
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void qrj(final int magicType) {
        mcp(new Runnable() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f12533k.o1t(magicType);
            }
        });
    }

    public void setDebugFlags(int debugFlags) {
        this.f12424i = debugFlags;
    }

    public void setEGLConfigChooser(InterfaceC2115g configChooser) {
        fu4();
        this.f12433y = configChooser;
    }

    public void setEGLContextClientVersion(int version) {
        fu4();
        this.f12434z = version;
    }

    public void setEGLContextFactory(f7l8 factory) {
        fu4();
        this.f12431s = factory;
    }

    public void setEGLWindowSurfaceFactory(InterfaceC2121y factory) {
        fu4();
        this.f12428p = factory;
    }

    public void setGLWrapper(x2 glWrapper) {
        this.f12423h = glWrapper;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setGestureEndCallback(@dd InterfaceC2132s gestureEndCallback) {
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setImageAndPosition(@dd Bitmap bm, @dd WallpaperPositionInfo lastPositionInfo) {
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setOriginBitmap(@dd Bitmap bitmap) {
    }

    public void setPreserveEGLContextOnPause(boolean preserveOnPause) {
        this.f12432t = preserveOnPause;
    }

    public void setRenderMode(int renderMode) {
        this.f12429q.qrj(renderMode);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        fu4();
        if (this.f12433y == null) {
            this.f12433y = new n7h(true);
        }
        if (this.f12431s == null) {
            this.f12431s = new C2119q();
        }
        if (this.f12428p == null) {
            this.f12428p = new C2117n();
        }
        this.f12427n = renderer;
        C2118p c2118p = new C2118p(this.f12425k);
        this.f12429q = c2118p;
        c2118p.start();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setScaleable(boolean b2) {
    }

    @Override // android.view.TextureView
    @Deprecated
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener listener) {
        Log.e(f12415f, "setSurfaceTextureListener preserved, setRenderer() instead?");
    }

    /* JADX INFO: renamed from: t */
    public void m8097t() {
        this.f12429q.m8104g();
    }

    public void wvg() {
        this.f12429q.m8107n();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean x2() {
        return false;
    }

    public void setEGLConfigChooser(boolean needDepth) {
        setEGLConfigChooser(new n7h(needDepth));
    }

    public void setEGLConfigChooser(int redSize, int greenSize, int blueSize, int alphaSize, int depthSize, int stencilSize) {
        setEGLConfigChooser(new zy(redSize, greenSize, blueSize, alphaSize, depthSize, stencilSize));
    }

    public GLTextureView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f12425k = new WeakReference<>(this);
        this.f12430r = null;
        this.f12426l = new HashSet<>();
        m8096z();
    }
}
