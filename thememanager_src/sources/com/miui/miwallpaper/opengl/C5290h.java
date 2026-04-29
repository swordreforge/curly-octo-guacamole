package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.content.res.Resources;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import ew.toq;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.h */
/* JADX INFO: compiled from: ImageGLProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5290h {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f72286zy = "h";

    /* JADX INFO: renamed from: k */
    protected final Context f29603k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f72287toq;

    C5290h(Context context) {
        this.f29603k = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: n */
    private String m17994n(int i2) {
        Resources resources = this.f29603k.getResources();
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resources.openRawResource(i2)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Resources.NotFoundException | IOException e2) {
            Log.d(f72286zy, "Can not read the shader source", e2);
            sb = null;
        }
        return sb == null ? "" : sb.toString();
    }

    /* JADX INFO: renamed from: q */
    private int m17995q(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            return iGlCreateShader;
        }
        Log.d(f72286zy, "Create shader failed, type=" + i2 + " error message: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return 0;
    }

    /* JADX INFO: renamed from: y */
    private int m17996y(int i2, int i3) {
        return zy(m17995q(35633, m17994n(i2)), m17995q(35632, m17994n(i3)));
    }

    private int zy(int i2, int i3) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, i2);
            GLES20.glAttachShader(iGlCreateProgram, i3);
            GLES20.glLinkProgram(iGlCreateProgram);
            return iGlCreateProgram;
        }
        Log.d(f72286zy, "Can not create OpenGL ES program error message: " + GLUtils.getEGLErrorString(EGL14.eglGetError()));
        return 0;
    }

    protected int f7l8() {
        return toq.n7h.f34562y;
    }

    /* JADX INFO: renamed from: g */
    public int m17997g(String str) {
        return GLES20.glGetUniformLocation(this.f72287toq, str);
    }

    /* JADX INFO: renamed from: k */
    int m17998k(String str) {
        return GLES20.glGetAttribLocation(this.f72287toq, str);
    }

    void ld6() {
        x2(f7l8(), toq());
    }

    /* JADX INFO: renamed from: p */
    void m17999p() {
        GLES20.glUseProgram(this.f72287toq);
    }

    /* JADX INFO: renamed from: s */
    protected void mo17993s() {
    }

    protected int toq() {
        return toq.n7h.f34557k;
    }

    boolean x2(int i2, int i3) {
        int iM17996y = m17996y(i2, i3);
        this.f72287toq = iM17996y;
        GLES20.glUseProgram(iM17996y);
        return true;
    }
}
