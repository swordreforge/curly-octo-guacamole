package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.miui.miwallpaper.opengl.jp0y;
import ew.toq;

/* JADX INFO: compiled from: SquareGlassGLProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class fti extends x2 {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f72276fu4;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final jp0y.C5292k f72277ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private gvn7 f72278o1t;

    /* JADX INFO: renamed from: z */
    private float f29598z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private jp0y f72279zurt;

    public fti(Context context) {
        super(context);
        jp0y.C5292k c5292k = new jp0y.C5292k();
        this.f72277ni7 = c5292k;
        this.f29598z = c5292k.f29612k;
        this.f72278o1t = new gvn7();
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void fn3e(int i2, int i3) {
        super.fn3e(i2, i3);
        this.f29598z = this.f72277ni7.f29612k / ((i2 * 1.0f) / 1080.0f);
    }

    @Override // com.miui.miwallpaper.opengl.x2
    protected Bitmap jk(boolean z2) {
        return this.f72298ki;
    }

    public float jp0y(float f2, float f3, float f4) {
        if (f2 != 0.0f) {
            GLES20.glUniform2f(this.f72279zurt.f72353zurt, 0.0f, 0.0f);
            return f2;
        }
        if (f4 != -1.0f) {
            GLES20.glUniform2f(this.f72279zurt.f72353zurt, 0.5f, 0.5f);
            f3 = (f3 + 0.03f) - (f4 * 0.03f);
        } else {
            GLES20.glUniform2f(this.f72279zurt.f72353zurt, 0.5f, 0.5f);
        }
        return 1.0f / f3;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public toq ki() {
        jp0y jp0yVar = new jp0y(this);
        this.f72279zurt = jp0yVar;
        return jp0yVar;
    }

    @Override // com.miui.miwallpaper.opengl.x2, com.miui.miwallpaper.opengl.C5293k, com.miui.miwallpaper.opengl.C5290h
    /* JADX INFO: renamed from: s */
    public void mo17993s() {
        super.mo17993s();
        GLES20.glUniform4f(this.f72279zurt.f72350fn3e, jp0y(this.f72302qrj, this.f72277ni7.f72295zy, this.f29665i), jp0y(this.f72301n7h, this.f72277ni7.f29614q, this.f29665i), this.f72300ld6, this.f72304x2);
        int i2 = this.f72279zurt.f72293mcp;
        float f2 = this.f29598z;
        float[] fArr = this.f72299kja0;
        GLES20.glUniform4f(i2, f2 / fArr[0], this.f72277ni7.f72294toq / fArr[5], 0.0f, 0.0f);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.f72276fu4);
        GLES20.glUniform1i(this.f72279zurt.f72292jk, 1);
    }

    @Override // com.miui.miwallpaper.opengl.C5290h
    protected int toq() {
        return toq.n7h.f34556h;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void zurt(Bitmap bitmap) {
        super.zurt(bitmap);
        this.f72298ki = bitmap;
    }
}
