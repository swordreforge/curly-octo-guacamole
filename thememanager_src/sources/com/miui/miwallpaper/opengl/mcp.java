package com.miui.miwallpaper.opengl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Log;
import b8.C1363k;

/* JADX INFO: compiled from: PreviewGlassAnimRender.java */
/* JADX INFO: loaded from: classes3.dex */
public class mcp extends zy {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f72305a9 = 10000;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f72306jk = 4;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f72307mcp = 3;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f72308o1t = 0;

    /* JADX INFO: renamed from: t */
    public static final int f29623t = 2;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f72309wvg = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f72310fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private C5294n f72311fu4;

    /* JADX INFO: renamed from: i */
    private Bitmap f29624i;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private int f72312ni7;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final String f72313t8r;

    /* JADX INFO: renamed from: z */
    private boolean f29625z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f72314zurt;

    public mcp(Context context, Bitmap bitmap, int i2) {
        super(context);
        String simpleName = getClass().getSimpleName();
        this.f72313t8r = simpleName;
        this.f29624i = bitmap;
        this.f72310fn3e = gvn7(i2);
        this.f72314zurt = d2ok(i2);
        C5293k c5293k = new C5293k(context);
        c5293k.f29616h = this.f72314zurt;
        this.f72311fu4 = new C5294n(c5293k);
        Log.d(simpleName, "PreviewGlassAnimRender: effectType=" + this.f72310fn3e + " mGlassId=" + this.f72314zurt);
    }

    private int d2ok(int i2) {
        return i2 % 10000;
    }

    /* JADX INFO: renamed from: f */
    private void m18011f(Bitmap bitmap) {
        this.f72311fu4.f72317toq.wvg(bitmap, new gvn7(0, true));
    }

    private int gvn7(int i2) {
        return i2 / 10000;
    }

    public float d3(int i2) {
        if (!(this.f72311fu4 instanceof o1t)) {
            return 1.0f;
        }
        if (i2 == 0) {
            return 1.08f;
        }
        if (i2 == 1) {
            return 1.28f;
        }
        if (i2 != 2) {
            return (i2 == 3 || i2 == 4) ? 1.14f : 1.0f;
        }
        return 1.08f;
    }

    public void dd(boolean z2) {
        this.f72312ni7 = z2 ? 1 : 0;
    }

    public float eqxt() {
        return d3(this.f72314zurt);
    }

    @Override // com.miui.miwallpaper.opengl.zy
    protected Bitmap fn3e() {
        return this.f29624i;
    }

    public float fti(int i2) {
        return d3(d2ok(i2));
    }

    @Override // com.miui.miwallpaper.opengl.zy, com.miui.miwallpaper.opengl.t8r, com.miui.miwallpaper.opengl.ld6
    /* JADX INFO: renamed from: g */
    public void mo18008g(int i2, int i3) {
        super.mo18008g(i2, i3);
        this.f29654k.f72317toq.fn3e(i2, i3);
    }

    public void hyr(int i2, boolean z2) {
        m18038i();
        this.f72310fn3e = gvn7(i2);
        this.f72314zurt = d2ok(i2);
        this.f72311fu4.wvg(z2);
        mo18009n();
    }

    public int jp0y() {
        return this.f72310fn3e;
    }

    /* JADX INFO: renamed from: l */
    public void m18012l(float f2, float f3) {
        this.f72311fu4.m18020t(f2, f3);
    }

    public void lvui() {
        m18038i();
        this.f72310fn3e = 0;
        this.f72314zurt = 0;
        this.f72311fu4.wvg(false);
        mo18009n();
    }

    public void n5r1(float f2, float f3) {
        this.f72311fu4.mcp(f2, f3);
    }

    public void ncyb(boolean z2) {
        Log.d(this.f72313t8r, "setGlassWithBlur: isTurnOnBlur=" + z2);
        this.f72311fu4.wvg(z2);
        m18038i();
        mo18009n();
    }

    public float[] oc(Bitmap bitmap, int i2, int i3) {
        return this.f72311fu4.x2(bitmap, i2, i3);
    }

    /* JADX INFO: renamed from: r */
    public void m18013r(Bitmap bitmap, boolean... zArr) {
        if (zArr.length == 0 || !zArr[0]) {
            C1363k.m5780n(this.f29624i);
        }
        this.f29624i = bitmap;
        if (bitmap == null) {
            throw new NullPointerException("bitmap is null");
        }
        t8r();
        m18011f(bitmap);
        this.f72342zy.m18037n(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
    }

    @Override // com.miui.miwallpaper.opengl.t8r
    /* JADX INFO: renamed from: s */
    public C5294n mo18014s(Context context) {
        int iJp0y = jp0y();
        float[] fArrQrj = new float[2];
        float[] fArrN7h = new float[2];
        C5294n c5294n = this.f72311fu4;
        if (c5294n != null) {
            fArrQrj = c5294n.qrj();
            fArrN7h = this.f72311fu4.n7h();
            this.f29625z = this.f72311fu4.ld6();
        }
        if (iJp0y == 1) {
            ni7 ni7Var = new ni7(context);
            ni7Var.f29616h = this.f72314zurt;
            this.f72311fu4 = new o1t(ni7Var);
        } else if (iJp0y == 3) {
            f7l8 f7l8Var = new f7l8(context, 0, 0, true);
            f7l8Var.f29616h = this.f72314zurt;
            this.f72311fu4 = new C5300s(f7l8Var);
        } else if (iJp0y == 4) {
            fti ftiVar = new fti(context);
            ftiVar.f29616h = this.f72314zurt;
            this.f72311fu4 = new a9(ftiVar);
        } else if (this.f29625z) {
            f7l8 f7l8Var2 = new f7l8(context, 0, 0, true);
            f7l8Var2.f29616h = this.f72314zurt;
            this.f72311fu4 = new C5300s(f7l8Var2);
        } else {
            C5293k c5293k = new C5293k(context);
            c5293k.f29616h = this.f72314zurt;
            this.f72311fu4 = new C5294n(c5293k);
        }
        this.f72311fu4.m18020t(fArrQrj[0], fArrQrj[1]);
        this.f72311fu4.mcp(fArrN7h[0], fArrN7h[1]);
        this.f72311fu4.f72317toq.f29620s = this.f72312ni7;
        this.f72311fu4.wvg(this.f29625z);
        return this.f72311fu4;
    }

    public void x9kr(int i2) {
        Log.d(this.f72313t8r, "setEffectType: typeId=" + i2);
        this.f72310fn3e = gvn7(i2);
        this.f72314zurt = d2ok(i2);
        m18038i();
        mo18009n();
    }
}
