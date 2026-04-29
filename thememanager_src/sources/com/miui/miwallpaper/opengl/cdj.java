package com.miui.miwallpaper.opengl;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: ImageGLWallpaper.java */
/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f72254ld6 = "uUITex";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f72255n7h = 4;

    /* JADX INFO: renamed from: p */
    private static final String f29587p = "aTextureCoordinates";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f72256qrj = 2;

    /* JADX INFO: renamed from: s */
    private static final String f29588s = "aPosition";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f72257x2 = 2;

    /* JADX INFO: renamed from: y */
    private static final String f29589y = "cdj";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected int f72258f7l8;

    /* JADX INFO: renamed from: g */
    private int f29590g;

    /* JADX INFO: renamed from: k */
    private final FloatBuffer f29591k;

    /* JADX INFO: renamed from: n */
    private int f29592n;

    /* JADX INFO: renamed from: q */
    private int f29593q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final FloatBuffer f72259toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final C5290h f72260zy;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected static final float[] f72253kja0 = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f, 1.0f, -1.0f, -1.0f};

    /* JADX INFO: renamed from: h */
    private static final float[] f29586h = {0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    public cdj(C5290h c5290h) {
        this.f72260zy = c5290h;
        float[] fArr = f72253kja0;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f29591k = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        float[] fArr2 = f29586h;
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f72259toq = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2);
        floatBufferAsFloatBuffer2.position(0);
    }

    /* JADX INFO: renamed from: g */
    private void m17986g(Bitmap bitmap, gvn7 gvn7Var) {
        int[] iArr = new int[1];
        if (bitmap == null || bitmap.isRecycled()) {
            Log.w(f29589y, "setupTexture: invalid bitmap");
            return;
        }
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        if (i2 == 0) {
            Log.w(f29589y, "setupTexture: glGenTextures() failed");
            return;
        }
        try {
            GLES20.glBindTexture(3553, i2);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            GLES20.glTexParameteri(3553, 10241, gvn7Var.f29601k);
            GLES20.glTexParameteri(3553, 10240, gvn7Var.f72284toq);
            GLES20.glTexParameteri(3553, 10242, gvn7Var.f29602q);
            GLES20.glTexParameteri(3553, 10243, gvn7Var.f72285zy);
            GLES20.glGenerateMipmap(3553);
            this.f72258f7l8 = iArr[0];
        } catch (IllegalArgumentException e2) {
            Log.w(f29589y, "Failed uploading texture: " + e2.getLocalizedMessage());
        }
    }

    protected void f7l8() {
        this.f29590g = this.f72260zy.m17997g(f72254ld6);
    }

    /* JADX INFO: renamed from: k */
    void m17987k() {
        GLES20.glDrawArrays(4, 0, f72253kja0.length / 2);
    }

    public void ld6(int i2) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f29590g, 0);
    }

    /* JADX INFO: renamed from: n */
    public void m17988n() {
        this.f29593q = this.f72260zy.m17998k(f29588s);
        this.f29591k.position(0);
        GLES20.glVertexAttribPointer(this.f29593q, 2, 5126, false, 0, (Buffer) this.f29591k);
        GLES20.glEnableVertexAttribArray(this.f29593q);
        this.f29592n = this.f72260zy.m17998k(f29587p);
        this.f72259toq.position(0);
        GLES20.glVertexAttribPointer(this.f29592n, 2, 5126, false, 0, (Buffer) this.f72259toq);
        GLES20.glEnableVertexAttribArray(this.f29592n);
    }

    /* JADX INFO: renamed from: p */
    void m17989p() {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f72258f7l8);
        GLES20.glUniform1i(this.f29590g, 0);
    }

    /* JADX INFO: renamed from: q */
    void m17990q(Bitmap bitmap, gvn7 gvn7Var) {
        m17988n();
        f7l8();
        m17986g(bitmap, gvn7Var);
    }

    /* JADX INFO: renamed from: s */
    public void m17991s(float[] fArr) {
        this.f72259toq.put(fArr);
        this.f72259toq.position(0);
    }

    public void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* JADX INFO: renamed from: y */
    public void m17992y(Bitmap bitmap, gvn7 gvn7Var) {
        m17986g(bitmap, gvn7Var);
    }

    public float[] zy() {
        return f29586h;
    }
}
