package com.google.android.exoplayer2.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import zy.InterfaceC7830i;

/* JADX INFO: compiled from: GlUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj {

    /* JADX INFO: renamed from: k */
    public static final int f23158k = -1;

    /* JADX INFO: renamed from: n */
    private static final String f23159n = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: q */
    private static final String f23160q = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static boolean f66971toq = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f66972zy = "GlUtil";

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.cdj$g */
    /* JADX INFO: compiled from: GlUtil.java */
    public static final class C3831g extends Exception {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.cdj$k */
    /* JADX INFO: compiled from: GlUtil.java */
    @zy.hyr(17)
    private static final class C3832k {
        private C3832k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: g */
        public static EGLSurface m13551g(EGLDisplay eGLDisplay, Object obj) {
            return EGL14.eglCreateWindowSurface(eGLDisplay, m13553n(eGLDisplay), obj, new int[]{12344}, 0);
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static EGLContext m13552k(EGLDisplay eGLDisplay) throws C3831g {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, m13553n(eGLDisplay), EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                cdj.m13546n();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new C3831g();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: n */
        private static EGLConfig m13553n(EGLDisplay eGLDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(eGLDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                cdj.t8r("eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        public static void m13554q(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != 0) {
                GLES20.glBindFramebuffer(36160, 0);
            }
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GLES20.glViewport(0, 0, i2, i3);
        }

        @InterfaceC7830i
        public static EGLDisplay toq() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            cdj.m13548q(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                cdj.t8r("Error in eglInitialize.");
            }
            cdj.m13546n();
            return eGLDisplayEglGetDisplay;
        }

        @InterfaceC7830i
        public static void zy(@zy.dd EGLDisplay eGLDisplay, @zy.dd EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            int iEglGetError = EGL14.eglGetError();
            boolean z2 = iEglGetError == 12288;
            StringBuilder sb = new StringBuilder(36);
            sb.append("Error releasing context: ");
            sb.append(iEglGetError);
            cdj.m13548q(z2, sb.toString());
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                int iEglGetError2 = EGL14.eglGetError();
                boolean z3 = iEglGetError2 == 12288;
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Error destroying context: ");
                sb2.append(iEglGetError2);
                cdj.m13548q(z3, sb2.toString());
            }
            EGL14.eglReleaseThread();
            int iEglGetError3 = EGL14.eglGetError();
            boolean z5 = iEglGetError3 == 12288;
            StringBuilder sb3 = new StringBuilder(35);
            sb3.append("Error releasing thread: ");
            sb3.append(iEglGetError3);
            cdj.m13548q(z5, sb3.toString());
            EGL14.eglTerminate(eGLDisplay);
            int iEglGetError4 = EGL14.eglGetError();
            boolean z6 = iEglGetError4 == 12288;
            StringBuilder sb4 = new StringBuilder(38);
            sb4.append("Error terminating display: ");
            sb4.append(iEglGetError4);
            cdj.m13548q(z6, sb4.toString());
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.cdj$n */
    /* JADX INFO: compiled from: GlUtil.java */
    public static final class C3833n {

        /* JADX INFO: renamed from: g */
        private int f23161g;

        /* JADX INFO: renamed from: k */
        public final String f23162k;

        /* JADX INFO: renamed from: n */
        private int f23163n;

        /* JADX INFO: renamed from: q */
        private final float[] f23164q = new float[16];

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f66973toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f66974zy;

        public C3833n(String str, int i2, int i3) {
            this.f23162k = str;
            this.f66973toq = i2;
            this.f66974zy = i3;
        }

        /* JADX INFO: renamed from: k */
        public void m13555k() {
            int i2 = this.f66974zy;
            if (i2 == 5126) {
                GLES20.glUniform1fv(this.f66973toq, 1, this.f23164q, 0);
                cdj.m13546n();
                return;
            }
            if (i2 == 35676) {
                GLES20.glUniformMatrix4fv(this.f66973toq, 1, false, this.f23164q, 0);
                cdj.m13546n();
                return;
            }
            if (this.f23163n == 0) {
                throw new IllegalStateException("Call setSamplerTexId before bind.");
            }
            GLES20.glActiveTexture(this.f23161g + 33984);
            int i3 = this.f66974zy;
            if (i3 == 36198) {
                GLES20.glBindTexture(36197, this.f23163n);
            } else {
                if (i3 != 35678) {
                    int i4 = this.f66974zy;
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("Unexpected uniform type: ");
                    sb.append(i4);
                    throw new IllegalStateException(sb.toString());
                }
                GLES20.glBindTexture(3553, this.f23163n);
            }
            GLES20.glUniform1i(this.f66973toq, this.f23161g);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            cdj.m13546n();
        }

        /* JADX INFO: renamed from: q */
        public void m13556q(int i2, int i3) {
            this.f23163n = i2;
            this.f23161g = i3;
        }

        public void toq(float f2) {
            this.f23164q[0] = f2;
        }

        public void zy(float[] fArr) {
            System.arraycopy(fArr, 0, this.f23164q, 0, fArr.length);
        }
    }

    /* JADX INFO: compiled from: GlUtil.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        public final String f23166k;

        /* JADX INFO: renamed from: n */
        private int f23167n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        private Buffer f23168q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final int f66975toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final int f66976zy;

        public toq(String str, int i2, int i3) {
            this.f23166k = str;
            this.f66975toq = i2;
            this.f66976zy = i3;
        }

        /* JADX INFO: renamed from: k */
        public void m13563k() {
            Buffer buffer = (Buffer) C3844k.m13634y(this.f23168q, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f66976zy, this.f23167n, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f66975toq);
            cdj.m13546n();
        }

        public void toq(float[] fArr, int i2) {
            this.f23168q = cdj.f7l8(fArr);
            this.f23167n = i2;
        }
    }

    /* JADX INFO: compiled from: GlUtil.java */
    public static final class zy extends RuntimeException {
        public zy(String str) {
            super(str);
        }
    }

    private cdj() {
    }

    public static String cdj(Context context, String str) throws IOException {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return lrht.d3(lrht.m28265do(inputStreamOpen));
        } finally {
            lrht.m13659h(inputStreamOpen);
        }
    }

    public static FloatBuffer f7l8(float[] fArr) {
        return (FloatBuffer) m13543g(fArr.length).put(fArr).flip();
    }

    /* JADX INFO: renamed from: g */
    public static FloatBuffer m13543g(int i2) {
        return ByteBuffer.allocateDirect(i2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m13544h() {
        String strEglQueryString;
        return lrht.f23230k >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(f23159n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ki(byte[] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] == 0) {
                return i2;
            }
        }
        return bArr.length;
    }

    public static boolean kja0(Context context) {
        String strEglQueryString;
        int i2 = lrht.f23230k;
        if (i2 < 24) {
            return false;
        }
        if (i2 >= 26 || !("samsung".equals(lrht.f67042zy) || "XT1650".equals(lrht.f23233q))) {
            return (i2 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains(f23160q);
        }
        return false;
    }

    public static void ld6(int i2) {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        m13546n();
    }

    /* JADX INFO: renamed from: n */
    public static void m13546n() {
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            String strValueOf = String.valueOf(GLU.gluErrorString(iGlGetError));
            ni7.m13702q(f66972zy, strValueOf.length() != 0 ? "glError ".concat(strValueOf) : new String("glError "));
            i2 = iGlGetError;
        }
        if (i2 != 0) {
            String strValueOf2 = String.valueOf(GLU.gluErrorString(i2));
            t8r(strValueOf2.length() != 0 ? "glError ".concat(strValueOf2) : new String("glError "));
        }
    }

    @zy.hyr(17)
    public static EGLSurface n7h(EGLDisplay eGLDisplay, Object obj) {
        return C3832k.m13551g(eGLDisplay, obj);
    }

    /* JADX INFO: renamed from: p */
    public static int m13547p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m13546n();
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static void m13548q(boolean z2, String str) {
        if (z2) {
            return;
        }
        t8r(str);
    }

    @zy.hyr(17)
    public static void qrj(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) {
        C3832k.m13554q(eGLDisplay, eGLContext, eGLSurface, i2, i3);
    }

    @zy.hyr(17)
    /* JADX INFO: renamed from: s */
    public static EGLDisplay m13549s() {
        return C3832k.toq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t8r(String str) {
        ni7.m13702q(f66972zy, str);
        if (f66971toq) {
            throw new zy(str);
        }
    }

    @zy.hyr(17)
    public static void x2(@zy.dd EGLDisplay eGLDisplay, @zy.dd EGLContext eGLContext) {
        C3832k.zy(eGLDisplay, eGLContext);
    }

    @zy.hyr(17)
    /* JADX INFO: renamed from: y */
    public static EGLContext m13550y(EGLDisplay eGLDisplay) throws C3831g {
        return C3832k.m13552k(eGLDisplay);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.cdj$q */
    /* JADX INFO: compiled from: GlUtil.java */
    public static final class C3834q {

        /* JADX INFO: renamed from: k */
        private final int f23165k;

        public C3834q(String str, String str2) {
            this.f23165k = GLES20.glCreateProgram();
            cdj.m13546n();
            m13557k(35633, str);
            m13557k(35632, str2);
        }

        /* JADX INFO: renamed from: k */
        private void m13557k(int i2, String str) {
            int iGlCreateShader = GLES20.glCreateShader(i2);
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = {0};
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] != 1) {
                String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
                StringBuilder sb = new StringBuilder(String.valueOf(strGlGetShaderInfoLog).length() + 10 + String.valueOf(str).length());
                sb.append(strGlGetShaderInfoLog);
                sb.append(", source: ");
                sb.append(str);
                cdj.t8r(sb.toString());
            }
            GLES20.glAttachShader(this.f23165k, iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader);
            cdj.m13546n();
        }

        private toq toq(int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f23165k, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            int[] iArr2 = new int[1];
            int i4 = this.f23165k;
            GLES20.glGetActiveAttrib(i4, i2, i3, iArr2, 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, cdj.ki(bArr));
            return new toq(str, i2, m13559n(str));
        }

        private C3833n zy(int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f23165k, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            int i4 = this.f23165k;
            GLES20.glGetActiveUniform(i4, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, cdj.ki(bArr));
            return new C3833n(str, f7l8(str), iArr2[0]);
        }

        public int f7l8(String str) {
            return GLES20.glGetUniformLocation(this.f23165k, str);
        }

        /* JADX INFO: renamed from: g */
        public toq[] m13558g() {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f23165k, 35721, iArr, 0);
            int i2 = iArr[0];
            if (i2 != 2) {
                throw new IllegalStateException("Expected two attributes.");
            }
            toq[] toqVarArr = new toq[i2];
            for (int i3 = 0; i3 < iArr[0]; i3++) {
                toqVarArr[i3] = toq(i3);
            }
            return toqVarArr;
        }

        /* JADX INFO: renamed from: n */
        public int m13559n(String str) {
            return GLES20.glGetAttribLocation(this.f23165k, str);
        }

        /* JADX INFO: renamed from: q */
        public void m13560q() {
            GLES20.glDeleteProgram(this.f23165k);
        }

        /* JADX INFO: renamed from: s */
        public void m13561s() {
            GLES20.glLinkProgram(this.f23165k);
            int[] iArr = {0};
            GLES20.glGetProgramiv(this.f23165k, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String strValueOf = String.valueOf(GLES20.glGetProgramInfoLog(this.f23165k));
                cdj.t8r(strValueOf.length() != 0 ? "Unable to link shader program: \n".concat(strValueOf) : new String("Unable to link shader program: \n"));
            }
            cdj.m13546n();
            GLES20.glUseProgram(this.f23165k);
        }

        /* JADX INFO: renamed from: y */
        public C3833n[] m13562y() {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(this.f23165k, 35718, iArr, 0);
            C3833n[] c3833nArr = new C3833n[iArr[0]];
            for (int i2 = 0; i2 < iArr[0]; i2++) {
                c3833nArr[i2] = zy(i2);
            }
            return c3833nArr;
        }

        public C3834q(Context context, String str, String str2) throws IOException {
            this(cdj.cdj(context, str), cdj.cdj(context, str2));
        }

        public C3834q(String[] strArr, String[] strArr2) {
            this(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
        }
    }
}
