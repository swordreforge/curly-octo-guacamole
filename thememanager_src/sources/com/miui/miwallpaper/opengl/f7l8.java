package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import ew.toq;

/* JADX INFO: compiled from: BlurGlassAnimGLProgram.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 extends x2 {

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final int f72261oc = 3;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private C5289g f72262a9;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f72263d3;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private int f72264fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private float f72265fu4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private int f72266gvn7;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private C5289g f72267jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private int f72268jp0y;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private C5298p f72269mcp;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public int f72270ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private int[] f72271o1t;

    /* JADX INFO: renamed from: t */
    private C5288k[] f29594t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private final int[] f72272wvg;

    /* JADX INFO: renamed from: z */
    private float f29595z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public int f72273zurt;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.f7l8$k */
    /* JADX INFO: compiled from: BlurGlassAnimGLProgram.java */
    static class C5288k {

        /* JADX INFO: renamed from: k */
        public int f29596k;

        /* JADX INFO: renamed from: q */
        public int f29597q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f72274toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f72275zy;

        C5288k() {
        }
    }

    public f7l8(Context context, int i2, int i3, boolean z2) {
        super(context);
        this.f72273zurt = 8;
        this.f72270ni7 = 2;
        this.f72265fu4 = 1.0f;
        this.f29595z = 1.0f;
        this.f72271o1t = new int[3];
        this.f72272wvg = new int[3];
        this.f29594t = new C5288k[3];
        this.f72268jp0y = i2;
        this.f72266gvn7 = i3;
        this.f72263d3 = z2;
    }

    private void jp0y() {
        int iWidth;
        int iHeight;
        if (this.f72296cdj.height() == 0 || this.f72296cdj.width() == 0 || this.f29603k == null) {
            return;
        }
        GLES20.glGenFramebuffers(3, this.f72271o1t, 0);
        int i2 = this.f72268jp0y;
        if (i2 <= 0 || this.f72266gvn7 <= 0 || this.f72263d3) {
            iWidth = this.f72296cdj.width() / this.f72270ni7;
            iHeight = this.f72296cdj.height() / this.f72270ni7;
        } else {
            this.f72265fu4 = i2 / this.f72298ki.getWidth();
            this.f29595z = this.f72266gvn7 / this.f72298ki.getHeight();
            iWidth = (int) (this.f72296cdj.width() / (this.f72270ni7 * this.f72265fu4));
            iHeight = (int) (this.f72296cdj.height() / (this.f72270ni7 * this.f29595z));
        }
        for (int i3 = 0; i3 < 3; i3++) {
            this.f29594t[i3] = new C5288k();
            this.f29594t[i3].f72274toq = mcp(false, iWidth, iHeight);
            C5288k c5288k = this.f29594t[i3];
            int[] iArr = this.f72271o1t;
            c5288k.f29596k = iArr[i3];
            c5288k.f72275zy = iWidth;
            c5288k.f29597q = iHeight;
            this.f72272wvg[i3] = c5288k.f72274toq;
            GLES20.glBindFramebuffer(36160, iArr[i3]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f29594t[i3].f72274toq, 0);
            if (i3 != 2) {
                int i4 = this.f72270ni7;
                iWidth /= i4;
                iHeight /= i4;
            }
        }
    }

    @Override // com.miui.miwallpaper.opengl.C5290h
    protected int f7l8() {
        return toq.n7h.f34558n;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void fn3e(int i2, int i3) {
        super.fn3e(i2, i3);
        jp0y();
    }

    public float gvn7() {
        float f2 = this.f29665i;
        return f2 != -1.0f ? (this.f72273zurt + 20) - (f2 * 20.0f) : this.f72273zurt;
    }

    @Override // com.miui.miwallpaper.opengl.x2
    protected Bitmap jk(boolean z2) {
        return this.f72298ki;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public toq ki() {
        C5298p c5298p = new C5298p(this);
        this.f72269mcp = c5298p;
        return c5298p;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    protected void kja0() {
        super.kja0();
        if (this.f72264fti > 0) {
            GLES20.glDeleteBuffers(3, this.f72271o1t, 0);
            GLES20.glDeleteTextures(3, new int[]{this.f72264fti, this.f72267jk.f29600i, this.f72262a9.f29600i}, 0);
            GLES20.glDeleteTextures(3, this.f72272wvg, 0);
        }
    }

    @Override // com.miui.miwallpaper.opengl.x2, com.miui.miwallpaper.opengl.C5293k, com.miui.miwallpaper.opengl.C5290h
    /* JADX INFO: renamed from: s */
    public void mo17993s() {
        GLES20.glClear(16384);
        GLES20.glBindFramebuffer(36160, 0);
        for (int i2 = 0; i2 < 3; i2++) {
            GLES20.glBindFramebuffer(36160, this.f29594t[i2].f29596k);
            GLES20.glClear(16384);
            C5288k c5288k = this.f29594t[i2];
            GLES20.glViewport(0, 0, c5288k.f72275zy, c5288k.f29597q);
            if (i2 == 0) {
                this.f72267jk.x2(this.f72264fti, this.f72298ki.getWidth(), this.f72298ki.getHeight(), gvn7());
            } else {
                C5289g c5289g = this.f72267jk;
                C5288k[] c5288kArr = this.f29594t;
                int i3 = c5288kArr[i2 - 1].f72274toq;
                C5288k c5288k2 = c5288kArr[i2];
                c5289g.x2(i3, c5288k2.f72275zy, c5288k2.f29597q, gvn7());
            }
        }
        for (int i4 = 2; i4 > 0; i4--) {
            int i5 = i4 - 1;
            GLES20.glBindFramebuffer(36160, this.f29594t[i5].f29596k);
            GLES20.glClear(16384);
            C5288k c5288k3 = this.f29594t[i5];
            GLES20.glViewport(0, 0, c5288k3.f72275zy, c5288k3.f29597q);
            C5289g c5289g2 = this.f72262a9;
            C5288k[] c5288kArr2 = this.f29594t;
            C5288k c5288k4 = c5288kArr2[i4];
            c5289g2.x2(c5288k4.f72274toq, c5288kArr2[i5].f72275zy, c5288k4.f29597q, gvn7());
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        this.f72269mcp.f72260zy.m17999p();
        this.f72269mcp.m17988n();
        this.f72269mcp.f7l8();
        C5298p c5298p = this.f72269mcp;
        c5298p.f72258f7l8 = this.f29594t[0].f72274toq;
        GLES20.glUniform4f(c5298p.f72329a9, 1.0f / r1.f72275zy, 1.0f / r1.f29597q, gvn7(), 0.0f);
        GLES20.glUniform4f(this.f72269mcp.f72330fti, 1.0f, 1.0f, 0.0f, 0.0f);
        super.mo17993s();
    }

    @Override // com.miui.miwallpaper.opengl.C5290h
    protected int toq() {
        return toq.n7h.f34560q;
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    protected void wvg(Bitmap bitmap, gvn7 gvn7Var) {
        super.wvg(bitmap, gvn7Var);
        this.f72264fti = fti(bitmap);
        jp0y();
    }

    @Override // com.miui.miwallpaper.opengl.C5293k
    public void zurt(Bitmap bitmap) {
        GLES20.glEnable(32925);
        this.f72298ki = bitmap;
        this.f72262a9 = new C5289g(this.f29603k, toq.n7h.f74637f7l8, toq.n7h.f34555g);
        this.f72267jk = new C5289g(this.f29603k, toq.n7h.f74644zy, toq.n7h.f74642toq);
        this.f72264fti = fti(bitmap);
        jp0y();
        super.zurt(bitmap);
    }
}
