package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: GlassRenderer.java */
/* JADX INFO: loaded from: classes3.dex */
public class n7h implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: g */
    public float f29634g;

    /* JADX INFO: renamed from: k */
    private mcp f29635k;

    /* JADX INFO: renamed from: n */
    public float f29636n;

    /* JADX INFO: renamed from: q */
    private ArrayList<InterfaceC5295k> f29637q = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    public float f29638s;

    /* JADX INFO: renamed from: y */
    public float f29639y;

    /* JADX INFO: renamed from: com.miui.miwallpaper.opengl.n7h$k */
    /* JADX INFO: compiled from: GlassRenderer.java */
    public interface InterfaceC5295k {
        void onDrawFrame(GL10 gl10);

        default void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        }

        default void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    public n7h(Context context, Bitmap bitmap, int i2) {
        this.f29635k = new mcp(context, bitmap, i2);
    }

    public void f7l8() {
        this.f29635k.lvui();
    }

    /* JADX INFO: renamed from: g */
    public void m18023g(InterfaceC5295k interfaceC5295k) {
        this.f29637q.add(interfaceC5295k);
    }

    /* JADX INFO: renamed from: k */
    public Bitmap m18024k() {
        return this.f29635k.ki();
    }

    public void kja0(boolean z2) {
        this.f29635k.dd(z2);
    }

    public void ld6(float f2, float f3) {
        this.f29635k.m18012l(f2, f3);
    }

    /* JADX INFO: renamed from: n */
    public float m18025n() {
        return this.f29635k.eqxt();
    }

    public void n7h(int i2, boolean z2) {
        this.f29635k.hyr(i2, z2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        this.f29635k.f7l8();
        Iterator<InterfaceC5295k> it = this.f29637q.iterator();
        while (it.hasNext()) {
            it.next().onDrawFrame(gl10);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        this.f29635k.mo18008g(i2, i3);
        Iterator<InterfaceC5295k> it = this.f29637q.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceChanged(gl10, i2, i3);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        this.f29635k.mo18009n();
        Iterator<InterfaceC5295k> it = this.f29637q.iterator();
        while (it.hasNext()) {
            it.next().onSurfaceCreated(gl10, eGLConfig);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m18026p(boolean z2) {
        this.f29635k.ncyb(z2);
    }

    /* JADX INFO: renamed from: q */
    public float[] m18027q(Bitmap bitmap, int i2, int i3) {
        return this.f29635k.oc(bitmap, i2, i3);
    }

    public void qrj(InterfaceC5295k interfaceC5295k) {
        InterfaceC5295k next;
        Iterator<InterfaceC5295k> it = this.f29637q.iterator();
        do {
            next = it.next();
            if (!it.hasNext()) {
                return;
            }
        } while (next != interfaceC5295k);
        it.remove();
    }

    /* JADX INFO: renamed from: s */
    public void m18028s(int i2) {
        this.f29635k.x9kr(i2);
    }

    public Bitmap toq() {
        return this.f29635k.fn3e();
    }

    public void x2(float f2, float f3) {
        this.f29635k.n5r1(f2, f3);
    }

    /* JADX INFO: renamed from: y */
    public void m18029y(Bitmap bitmap, boolean... zArr) {
        this.f29635k.m18013r(bitmap, zArr);
    }

    public float zy(int i2) {
        return this.f29635k.fti(i2);
    }
}
