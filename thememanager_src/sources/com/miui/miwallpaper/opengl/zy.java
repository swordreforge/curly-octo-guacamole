package com.miui.miwallpaper.opengl;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import android.util.Log;
import android.view.animation.Interpolator;
import b8.C1364q;
import com.miui.miwallpaper.opengl.t8r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AnimImageWallpaperRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zy extends t8r {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f72370cdj = 200;

    /* JADX INFO: renamed from: h */
    private static final int f29668h = 800;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    protected static final Interpolator f72371ki = new toq();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final float f72372kja0 = 0.0f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final float f72373n7h = 1.0f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected static final String f72374qrj = "AnimImageWallpaperRender";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private com.miui.miwallpaper.opengl.toq f72375ld6;

    /* JADX INFO: renamed from: p */
    protected InterfaceC5305k f29669p;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private C8031zy f72376x2;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.zy$k */
    /* JADX INFO: compiled from: AnimImageWallpaperRenderer.java */
    public interface InterfaceC5305k {
        /* JADX INFO: renamed from: k */
        void m18041k();
    }

    /* JADX INFO: compiled from: AnimImageWallpaperRenderer.java */
    public static class toq implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnimImageWallpaperRenderer.java */
    static class C8031zy extends t8r.C5302k {

        /* JADX INFO: renamed from: g */
        private final zy f29670g;

        protected C8031zy(WallpaperManager wallpaperManager, zy zyVar) {
            super(wallpaperManager);
            this.f29670g = zyVar;
        }

        @Override // com.miui.miwallpaper.opengl.t8r.C5302k
        /* JADX INFO: renamed from: g */
        protected void mo18036g() {
            super.mo18036g();
            zy zyVar = this.f29670g;
            zyVar.jk(zyVar.f72341toq.width(), this.f29670g.f72341toq.height());
        }

        @Override // com.miui.miwallpaper.opengl.t8r.C5302k
        protected Bitmap zy() {
            return this.f29670g.fn3e();
        }
    }

    public zy(Context context) {
        super(context);
        this.f72341toq.set(C1364q.m5783q(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jk(int i2, int i3) {
        this.f29654k.jp0y(i2, i3, this.f72342zy.toq());
    }

    public void a9(boolean z2, boolean z3) {
        this.f29654k.gvn7(z2, z3);
    }

    @Override // com.miui.miwallpaper.opengl.t8r, com.miui.miwallpaper.opengl.ld6
    public void f7l8() {
        super.f7l8();
    }

    @Override // com.miui.miwallpaper.opengl.t8r, com.miui.miwallpaper.opengl.ld6
    public void finish() {
        super.finish();
        this.f29654k.finish();
    }

    protected abstract Bitmap fn3e();

    protected void fu4() {
        InterfaceC5305k interfaceC5305k = this.f29669p;
        if (interfaceC5305k != null) {
            interfaceC5305k.m18041k();
        }
    }

    @Override // com.miui.miwallpaper.opengl.t8r, com.miui.miwallpaper.opengl.ld6
    /* JADX INFO: renamed from: g */
    public void mo18008g(int i2, int i3) {
        super.mo18008g(i2, i3);
        jk(this.f72341toq.width(), this.f72341toq.height());
    }

    /* JADX INFO: renamed from: i */
    public void m18038i() {
        this.f29654k.f7l8();
    }

    public Bitmap ki() {
        GLES20.glFinish();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[this.f72341toq.width() * this.f72341toq.height() * 4]);
        GLES20.glReadPixels(0, 0, this.f72341toq.width(), this.f72341toq.height(), 6408, 5121, byteBufferWrap);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f72341toq.width(), this.f72341toq.height(), Bitmap.Config.ARGB_8888);
        byteBufferWrap.position(0);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferWrap);
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, -1.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
        Log.d(f72374qrj, "get bitmap");
        return bitmapCreateBitmap2;
    }

    public void mcp(boolean z2) {
        this.f29654k.fti(z2);
    }

    @Override // com.miui.miwallpaper.opengl.t8r, com.miui.miwallpaper.opengl.ld6
    /* JADX INFO: renamed from: n */
    public void mo18009n() {
        super.mo18009n();
        jk(this.f72341toq.width(), this.f72341toq.height());
    }

    public void ni7() {
        this.f29654k.zy();
    }

    public void o1t(boolean z2) {
        this.f29654k.m18022z(z2);
    }

    @Override // com.miui.miwallpaper.opengl.t8r
    /* JADX INFO: renamed from: p */
    protected cdj mo18033p(C5290h c5290h) {
        com.miui.miwallpaper.opengl.toq toqVar = new com.miui.miwallpaper.opengl.toq(c5290h);
        this.f72375ld6 = toqVar;
        return toqVar;
    }

    /* JADX INFO: renamed from: t */
    public void m18039t() {
        this.f29654k.a9();
    }

    public void t8r() {
        this.f29654k.m18016g();
    }

    @Override // com.miui.miwallpaper.opengl.t8r, com.miui.miwallpaper.opengl.ld6
    public void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.toq(str, fileDescriptor, printWriter, strArr);
        C5294n c5294n = this.f29654k;
        if (c5294n == null || c5294n.f72317toq == null) {
            return;
        }
        c5294n.toq(str, fileDescriptor, printWriter, strArr);
        this.f29654k.f72317toq.cdj(str, fileDescriptor, printWriter, strArr);
    }

    public void wvg(InterfaceC5305k interfaceC5305k) {
        this.f29669p = interfaceC5305k;
        this.f29654k.o1t(interfaceC5305k);
    }

    @Override // com.miui.miwallpaper.opengl.t8r
    protected t8r.C5302k x2(WallpaperManager wallpaperManager) {
        C8031zy c8031zy = new C8031zy(wallpaperManager, this);
        this.f72376x2 = c8031zy;
        return c8031zy;
    }

    /* JADX INFO: renamed from: z */
    public void m18040z() {
        this.f29654k.fu4();
    }

    public float zurt() {
        return this.f29654k.f72317toq.f29618p;
    }
}
