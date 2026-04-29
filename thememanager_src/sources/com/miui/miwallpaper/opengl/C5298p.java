package com.miui.miwallpaper.opengl;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.p */
/* JADX INFO: compiled from: BlurGlassImageGLWallpaper.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5298p extends toq {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    protected int f72329a9;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    protected int f72330fti;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    protected final String f72331jk;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    protected final String f72332mcp;

    public C5298p(C5290h c5290h) {
        super(c5290h);
        this.f72332mcp = "uSaturnContrast";
        this.f72331jk = "rad_texelSize";
    }

    @Override // com.miui.miwallpaper.opengl.toq, com.miui.miwallpaper.opengl.cdj
    protected void f7l8() {
        super.f7l8();
        this.f72329a9 = this.f72260zy.m17997g("rad_texelSize");
        this.f72330fti = this.f72260zy.m17997g("uSaturnContrast");
    }
}
