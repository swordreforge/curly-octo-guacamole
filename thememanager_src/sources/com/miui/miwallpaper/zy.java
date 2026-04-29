package com.miui.miwallpaper;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLSurfaceView;
import android.view.TextureView;
import com.miui.miwallpaper.opengl.n7h;

/* JADX INFO: compiled from: GlassShaderUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {
    public static void f7l8(Matrix matrix, GLSurfaceView gLSurfaceView, n7h n7hVar) {
        float[] fArrM18027q = n7hVar.m18027q(n7hVar.toq(), gLSurfaceView.getWidth(), gLSurfaceView.getHeight());
        float width = gLSurfaceView.getWidth() * fArrM18027q[0];
        float height = gLSurfaceView.getHeight() * fArrM18027q[5];
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = fArr[2];
        float f5 = fArr[5];
        float f6 = f2 / n7hVar.f29639y;
        float f7 = f3 / n7hVar.f29638s;
        float f8 = (f6 == 0.0f ? 1.0f : f6) * width;
        float f9 = (f7 == 0.0f ? 1.0f : f7) * height;
        if (f6 == 0.0f) {
            f6 = 1.0f;
        }
        float f10 = 1.0f / f6;
        if (f7 == 0.0f) {
            f7 = 1.0f;
        }
        n7hVar.ld6(f10, 1.0f / f7);
        n7hVar.x2((-(f4 - n7hVar.f29636n)) / f8, (-(f5 - n7hVar.f29634g)) / f9);
        gLSurfaceView.requestRender();
    }

    /* JADX INFO: renamed from: g */
    public static void m18078g(Matrix matrix, n7h n7hVar) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        n7hVar.f29636n = fArr[2];
        n7hVar.f29634g = fArr[5];
        n7hVar.f29639y = fArr[0];
        n7hVar.f29638s = fArr[4];
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m18079k(n7h n7hVar) {
        return n7hVar.m18024k();
    }

    /* JADX INFO: renamed from: n */
    public static void m18080n(n7h n7hVar, boolean z2) {
        n7hVar.m18026p(z2);
    }

    /* JADX INFO: renamed from: q */
    public static void m18081q(n7h n7hVar, int i2) {
        n7hVar.m18028s(i2);
    }

    public static void toq(GLSurfaceView gLSurfaceView, n7h n7hVar) {
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setRenderer(n7hVar);
        gLSurfaceView.setRenderMode(0);
    }

    /* JADX INFO: renamed from: y */
    public static void m18082y(Matrix matrix, TextureView textureView, n7h n7hVar) {
        float[] fArrM18027q = n7hVar.m18027q(n7hVar.toq(), textureView.getWidth(), textureView.getHeight());
        float width = textureView.getWidth() * fArrM18027q[0];
        float height = textureView.getHeight() * fArrM18027q[5];
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = fArr[2];
        float f5 = fArr[5];
        float f6 = f2 / n7hVar.f29639y;
        float f7 = f3 / n7hVar.f29638s;
        float f8 = (f6 == 0.0f ? 1.0f : f6) * width;
        float f9 = (f7 == 0.0f ? 1.0f : f7) * height;
        if (f6 == 0.0f) {
            f6 = 1.0f;
        }
        float f10 = 1.0f / f6;
        if (f7 == 0.0f) {
            f7 = 1.0f;
        }
        n7hVar.ld6(f10, 1.0f / f7);
        n7hVar.x2((-(f4 - n7hVar.f29636n)) / f8, (-(f5 - n7hVar.f29634g)) / f9);
    }

    public void zy(GLSurfaceView gLSurfaceView) {
        gLSurfaceView.requestRender();
    }
}
