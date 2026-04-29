package com.android.thememanager.settings.superwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import com.android.thememanager.R;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.opengl.k */
/* JADX INFO: compiled from: BitmapTexture.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2659k {

    /* JADX INFO: renamed from: p */
    private static final String f15735p = "BitmapTexture";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f60942qrj = 3;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f60944f7l8;

    /* JADX INFO: renamed from: g */
    private int f15736g;

    /* JADX INFO: renamed from: k */
    private final int f15737k;

    /* JADX INFO: renamed from: n */
    private FloatBuffer f15738n;

    /* JADX INFO: renamed from: q */
    private FloatBuffer f15739q;

    /* JADX INFO: renamed from: s */
    private int f15740s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f60945toq;

    /* JADX INFO: renamed from: y */
    private int f15741y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Context f60946zy;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static float[] f60941ld6 = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static float[] f60943x2 = {0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};

    public C2659k(Context context) {
        float[] fArr = f60941ld6;
        this.f15737k = fArr.length / 3;
        this.f60945toq = 12;
        this.f60946zy = context;
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(f60941ld6);
        this.f15739q = floatBufferPut;
        floatBufferPut.position(0);
        FloatBuffer floatBufferPut2 = ByteBuffer.allocateDirect(f60943x2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(f60943x2);
        this.f15738n = floatBufferPut2;
        floatBufferPut2.position(0);
    }

    /* JADX INFO: renamed from: k */
    public void m9248k() {
        GLES20.glUseProgram(this.f15736g);
        GLES20.glEnableVertexAttribArray(this.f60944f7l8);
        GLES20.glEnableVertexAttribArray(this.f15741y);
        GLES20.glVertexAttribPointer(this.f60944f7l8, 3, 5126, false, 12, (Buffer) this.f15739q);
        GLES20.glVertexAttribPointer(this.f15741y, 3, 5126, false, 12, (Buffer) this.f15738n);
        GLES20.glDrawArrays(5, 0, this.f15737k);
        GLES20.glDisableVertexAttribArray(this.f60944f7l8);
        GLES20.glDisableVertexAttribArray(this.f15741y);
        GLES20.glDrawArrays(4, 0, f60941ld6.length / 2);
    }

    public void toq(Bitmap bitmap) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        this.f15736g = C2661q.m9253k(C2661q.zy(this.f60946zy, R.raw.vertex_shader), C2661q.zy(this.f60946zy, R.raw.fragment_shader));
        Log.i(f15735p, "onSurfaceCreated program = " + this.f15736g);
        int i2 = this.f15736g;
        if (i2 > 0) {
            this.f60944f7l8 = GLES20.glGetAttribLocation(i2, "aPosition");
            this.f15741y = GLES20.glGetAttribLocation(this.f15736g, "aTextureCoordinates");
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i3 = iArr[0];
            if (i3 == 0) {
                return;
            }
            this.f15740s = i3;
            GLES20.glBindTexture(3553, i3);
            GLES20.glTexParameteri(3553, 10242, 10497);
            GLES20.glTexParameteri(3553, 10243, 10497);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            Log.i(f15735p, "onSurfaceCreated bitmap = " + bitmap);
            if (bitmap == null) {
                return;
            }
            Log.i(f15735p, "onSurfaceCreated");
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
    }

    public void zy(boolean z2, boolean z3) {
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f15736g, "uDarken"), z2 ? 1 : 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f15736g, "uDarkMode"), z3 ? 1 : 0);
    }
}
