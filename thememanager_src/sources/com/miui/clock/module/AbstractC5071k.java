package com.miui.clock.module;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0498q;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.miui.clock.module.k */
/* JADX INFO: compiled from: BaseFontStyle.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5071k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float[][][] f71909f7l8;

    /* JADX INFO: renamed from: g */
    private final float[][][] f29173g;

    /* JADX INFO: renamed from: k */
    protected int[] f29174k;

    /* JADX INFO: renamed from: s */
    private final int[] f29177s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected int f71910toq;

    /* JADX INFO: renamed from: y */
    private final int[] f29178y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected int f71911zy;

    /* JADX INFO: renamed from: q */
    private final float[] f29176q = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: n */
    private final float[] f29175n = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: com.miui.clock.module.k$k */
    /* JADX INFO: compiled from: BaseFontStyle.java */
    public enum k {
        BodoniModa,
        DryBrush9,
        FoundryGridnik,
        MiCamera,
        MiSansNormal,
        MiSansDemiBold,
        MiSansExtraLight,
        MiSansRoundLock,
        NeumaticCompressed,
        Salome,
        SilkSerif,
        SKPupok,
        Copperplate,
        NeueMatic
    }

    public AbstractC5071k() {
        Class cls = Float.TYPE;
        this.f29173g = (float[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f71909f7l8 = (float[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f29178y = new int[10];
        this.f29177s = new int[10];
    }

    public static Bitmap zy(Context context, int i2) {
        Drawable drawableM2259s = C0498q.m2259s(context, i2);
        if (drawableM2259s == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM2259s.getIntrinsicWidth(), drawableM2259s.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableM2259s.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableM2259s.draw(canvas);
        return bitmapCreateBitmap;
    }

    public int a9() {
        return 0;
    }

    public float cdj() {
        return 0.0f;
    }

    public void d2ok(int i2) {
        this.f71910toq = i2;
    }

    public int[] d3() {
        return this.f29174k;
    }

    public void eqxt(int[] iArr) {
        this.f29174k = iArr;
    }

    public abstract int f7l8();

    public float fn3e() {
        return 0.0f;
    }

    public int fti() {
        return 0;
    }

    public float[] fu4() {
        return new float[100];
    }

    /* JADX INFO: renamed from: g */
    public float mo17699g() {
        return 0.0f;
    }

    public abstract int gvn7();

    /* JADX INFO: renamed from: h */
    public float[] mo17700h() {
        return new float[100];
    }

    /* JADX INFO: renamed from: i */
    public float[] mo17709i() {
        return this.f29175n;
    }

    public abstract int jk();

    public abstract int[] jp0y();

    /* JADX INFO: renamed from: k */
    public boolean mo17710k() {
        return false;
    }

    public abstract int[][][] ki();

    public int[] kja0() {
        return this.f29178y;
    }

    public abstract int[][][] ld6();

    public float mcp() {
        return 0.0f;
    }

    /* JADX INFO: renamed from: n */
    public float[] mo17711n() {
        return this.f29176q;
    }

    public int[] n7h() {
        return this.f29177s;
    }

    public abstract float[] ni7();

    public int o1t() {
        return 0;
    }

    public void oc(int i2) {
        this.f71911zy = i2;
    }

    /* JADX INFO: renamed from: p */
    public abstract k mo17701p();

    /* JADX INFO: renamed from: q */
    public float[] mo17712q() {
        return ni7();
    }

    public int qrj() {
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public int[] mo17708s(int i2, float f2) {
        return null;
    }

    /* JADX INFO: renamed from: t */
    public float mo17702t() {
        return 0.0f;
    }

    public float[][][] t8r() {
        return this.f71909f7l8;
    }

    public int toq() {
        return 0;
    }

    public float wvg() {
        return 0.0f;
    }

    public float[][][] x2() {
        return this.f29173g;
    }

    /* JADX INFO: renamed from: y */
    public abstract float mo17703y();

    /* JADX INFO: renamed from: z */
    public int mo17704z() {
        return 0;
    }

    public float zurt() {
        return 0.0f;
    }
}
