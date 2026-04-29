package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* JADX INFO: compiled from: GlassAnimGLProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x2 extends C5293k {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f72369fn3e = "GlassAnimatorProgram";

    /* JADX INFO: renamed from: i */
    protected float f29665i;

    public x2(Context context) {
        super(context);
        this.f29665i = -1.0f;
    }

    public int a9(Context context, int i2, gvn7 gvn7Var) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), i2, options);
        if (bitmapDecodeResource == null) {
            GLES20.glDeleteTextures(1, iArr, 0);
            return 0;
        }
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10241, gvn7Var.f29601k);
        GLES20.glTexParameteri(3553, 10240, gvn7Var.f72284toq);
        GLES20.glTexParameteri(3553, 10242, gvn7Var.f29602q);
        GLES20.glTexParameteri(3553, 10243, gvn7Var.f72285zy);
        GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
        bitmapDecodeResource.recycle();
        GLES20.glGenerateMipmap(3553);
        return iArr[0];
    }

    public int fti(Bitmap bitmap) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        if (i2 == 0) {
            return 0;
        }
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return iArr[0];
    }

    protected abstract Bitmap jk(boolean z2);

    public int mcp(boolean z2, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        if (i4 == 0) {
            return 0;
        }
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, z2 ? 9987 : 9729);
        GLES20.glTexParameteri(3553, 10240, z2 ? 9987 : 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, 6408, i2, i3, 0, 6408, 5121, null);
        if (z2) {
            GLES20.glGenerateMipmap(3553);
        }
        return iArr[0];
    }

    @Override // com.miui.miwallpaper.opengl.C5293k, com.miui.miwallpaper.opengl.C5290h
    /* JADX INFO: renamed from: s */
    public void mo17993s() {
        super.mo17993s();
    }
}
