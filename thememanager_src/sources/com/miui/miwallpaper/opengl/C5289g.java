package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.opengl.GLES20;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.g */
/* JADX INFO: compiled from: BlurGLRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5289g extends cdj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final String f72280cdj;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public int f72281fn3e;

    /* JADX INFO: renamed from: i */
    public int f29600i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected final String f72282ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    protected final String f72283t8r;

    public C5289g(Context context, int i2, int i3) {
        super(new C5290h(context));
        this.f72280cdj = C5289g.class.getSimpleName();
        this.f72282ki = "uUITex";
        this.f72283t8r = "rad_texelSize";
        this.f72260zy.x2(i2, i3);
        f7l8();
    }

    @Override // com.miui.miwallpaper.opengl.cdj
    protected void f7l8() {
        this.f29600i = this.f72260zy.m17997g("uUITex");
        this.f72281fn3e = this.f72260zy.m17997g("rad_texelSize");
        super.f7l8();
    }

    public void x2(int i2, int i3, int i4, float f2) {
        this.f72260zy.m17999p();
        m17988n();
        GLES20.glUniform4f(this.f72281fn3e, 1.0f / i3, 1.0f / i4, f2, 0.0f);
        ld6(i2);
        m17987k();
    }
}
