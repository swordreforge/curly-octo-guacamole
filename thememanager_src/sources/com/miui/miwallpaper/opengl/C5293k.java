package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import b8.C1363k;
import b8.C1364q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.k */
/* JADX INFO: compiled from: AnimImageGLProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5293k extends C5290h {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    protected Rect f72296cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    protected final float f72297f7l8;

    /* JADX INFO: renamed from: g */
    protected final boolean f29615g;

    /* JADX INFO: renamed from: h */
    public int f29616h;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected Bitmap f72298ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    protected float[] f72299kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    protected float f72300ld6;

    /* JADX INFO: renamed from: n */
    private final String f29617n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    protected float f72301n7h;

    /* JADX INFO: renamed from: p */
    protected volatile float f29618p;

    /* JADX INFO: renamed from: q */
    private final toq f29619q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected float f72302qrj;

    /* JADX INFO: renamed from: s */
    protected volatile int f29620s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected boolean f72303t8r;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    protected float f72304x2;

    /* JADX INFO: renamed from: y */
    protected volatile int f29621y;

    public C5293k(Context context) {
        super(context);
        this.f29617n = getClass().getSimpleName();
        this.f29615g = b8.toq.f53995f7l8;
        this.f72297f7l8 = 0.85f;
        this.f72299kja0 = new float[16];
        this.f29616h = 0;
        this.f29619q = ki();
        this.f72296cdj = C1364q.m5783q(context);
    }

    private float[] qrj(float f2, float f3, float f4, float f5) {
        float[] fArr = new float[16];
        float f6 = f2 / f3;
        float f7 = f4 / f5;
        Matrix.setIdentityM(fArr, 0);
        if (f6 == f7) {
            Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
        } else if (f6 < f7) {
            Matrix.scaleM(fArr, 0, 1.0f, (f3 / (f2 / f4)) / f5, 1.0f);
        } else {
            Matrix.scaleM(fArr, 0, (f2 / (f3 / f5)) / f4, 1.0f, 1.0f);
        }
        Log.d(this.f29617n, "bitmapWidth = " + f2 + ", bitmapHeight = " + f3 + ", surfaceWidth = " + f4 + ", surfaceHeight = " + f5 + ", matrix = " + Arrays.toString(fArr));
        return fArr;
    }

    public void cdj(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mDark=");
        printWriter.print(this.f29621y);
        printWriter.print(str);
        printWriter.print("mDarken=");
        printWriter.print(this.f29620s);
        printWriter.print(str);
        printWriter.print("mRevealValue=");
        printWriter.print(this.f29618p);
        printWriter.print(str);
        printWriter.print("mMVPMatrix=");
        printWriter.print(Arrays.toString(this.f72299kja0));
    }

    public void fn3e(int i2, int i3) {
        this.f72296cdj = C1364q.m5783q(this.f29603k);
    }

    public void fu4(Bitmap bitmap, gvn7 gvn7Var) {
        this.f29619q.m17990q(bitmap, gvn7Var);
    }

    /* JADX INFO: renamed from: h */
    public void m18002h() {
        this.f29619q.m17987k();
    }

    /* JADX INFO: renamed from: i */
    public void mo18003i() {
    }

    public toq ki() {
        return new toq(this);
    }

    protected void kja0() {
        n7h();
    }

    public void n7h() {
        int i2 = this.f29619q.f72258f7l8;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        }
    }

    public void ni7(int i2) {
    }

    public void o1t(boolean z2, boolean z3) {
        Log.d(this.f29617n, "updateMaskLayer: need = " + z2 + ", isDark = " + z3 + " this: " + this);
        this.f29621y = z2 ? 1 : 0;
        this.f29620s = z3 ? 1 : 0;
    }

    @Override // com.miui.miwallpaper.opengl.C5290h
    /* JADX INFO: renamed from: s */
    public void mo17993s() {
        GLES20.glUniformMatrix4fv(this.f29619q.f29662i, 1, false, this.f72299kja0, 0);
        GLES20.glUniform1f(this.f29619q.f72349cdj, this.f29618p);
        GLES20.glUniform1i(this.f29619q.f72352t8r, this.f29620s);
        GLES20.glUniform1i(this.f29619q.f72351ki, this.f29621y);
        int i2 = this.f29619q.f72350fn3e;
        float f2 = this.f72302qrj;
        if (f2 == 0.0f) {
            f2 = 1.0f;
        }
        float f3 = this.f72301n7h;
        GLES20.glUniform4f(i2, f2, f3 != 0.0f ? f3 : 1.0f, this.f72300ld6, this.f72304x2);
        super.mo17993s();
    }

    /* JADX INFO: renamed from: t */
    public void m18004t() {
        this.f29619q.m17989p();
    }

    protected void t8r(Bitmap bitmap, int i2) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 8, bitmap.getHeight() / 8, true);
        Bitmap qVar = C1363k.toq(bitmapCreateScaledBitmap, i2);
        this.f29619q.m17990q(qVar, new gvn7(0, true));
        C1363k.m5780n(bitmapCreateScaledBitmap);
        C1363k.m5780n(qVar);
    }

    protected void wvg(Bitmap bitmap, gvn7 gvn7Var) {
        m18005z(this.f72296cdj.width(), this.f72296cdj.height(), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
        this.f29619q.m17992y(bitmap, gvn7Var);
    }

    /* JADX INFO: renamed from: z */
    public void m18005z(int i2, int i3, Rect rect) {
        this.f72299kja0 = qrj(rect.width(), rect.height(), i2, i3);
    }

    public void zurt(Bitmap bitmap) {
    }
}
