package com.miui.miwallpaper.opengl;

/* JADX INFO: compiled from: TextureConfig.java */
/* JADX INFO: loaded from: classes3.dex */
public class gvn7 {

    /* JADX INFO: renamed from: k */
    int f29601k;

    /* JADX INFO: renamed from: q */
    int f29602q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f72284toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f72285zy;

    public gvn7(int i2, int i3, int i4, int i5) {
        this.f29601k = i2;
        this.f72284toq = i3;
        this.f72285zy = i4;
        this.f29602q = i5;
    }

    public gvn7(int i2, boolean z2) {
        this.f29601k = 9729;
        this.f72284toq = 9729;
        this.f72285zy = 10497;
        this.f29602q = 10497;
        if (i2 == EnumC5301t.PRISM.index) {
            this.f72284toq = 9985;
            this.f29601k = 9985;
        }
        if (z2) {
            this.f29602q = 33071;
            this.f72285zy = 33071;
        }
    }

    public gvn7() {
        this.f29601k = 9729;
        this.f72284toq = 9729;
        this.f72285zy = 10497;
        this.f29602q = 10497;
    }
}
