package com.miui.miwallpaper.opengl;

import ew.toq;

/* JADX INFO: renamed from: com.miui.miwallpaper.opengl.t */
/* JADX INFO: compiled from: MoruGlassParam.java */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5301t {
    PINSTRIPE(0, 10, 0.15f, 0.0f, 1.08f, 1.0f, 0.3f, 0.36f, 0.0f, 0.0f, 0.68f, 0.4f, 1.0f, toq.C6021y.f75054etdu, toq.C6021y.f75116wo),
    THICK_STRIPE(1, 25, 0.31f, 0.0f, 1.28f, 1.0f, 0.36f, 0.58f, 0.1f, 0.0f, 0.58f, 0.65f, 0.36f, toq.C6021y.f75102sok, toq.C6021y.f75049d8wk),
    PRISM(2, 8, 0.14f, 0.0f, 1.08f, 1.0f, 0.5f, 0.5f, 0.0f, 0.04f, 0.5f, 0.85f, 1.0f, toq.C6021y.f75044cfr, toq.C6021y.f75060g1),
    THIN_LINE(3, 25, 0.44f, 0.158f, 1.14f, 1.0f, 0.53f, 0.56f, 0.0f, 0.0f, 0.8f, 0.3f, 1.0f, toq.C6021y.f75114w831, toq.C6021y.f75115was),
    CORRUGATION(4, 20, 0.24f, 0.0f, 1.14f, 1.0f, 0.39f, 0.37f, 0.06f, 0.02f, 0.6f, 1.0f, 1.0f, toq.C6021y.f75127z4, toq.C6021y.f75061gbni);

    public float ASP;
    public final float IOR;
    public final int blurRadius;
    public final float darkness;
    public final int depthLightShadowTex;
    public final float displacement;
    public final float distance;
    public final int index;
    public final float lightness;
    public final int normalTex;
    public final float offsetX;
    public final float scaleX;
    public final float scaleY;
    public final float shadowness;
    public final float thickness;
    public final float uNormalScaleX;
    public final float uNormalScaleY = 1.0f;
    public final float offsetY = 0.0f;

    EnumC5301t(int i2, int i3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, int i4, int i5) {
        this.index = i2;
        this.blurRadius = i3;
        this.uNormalScaleX = f2;
        this.offsetX = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.thickness = f6;
        this.distance = f7;
        this.normalTex = i4;
        this.depthLightShadowTex = i5;
        this.displacement = f8;
        this.darkness = f9;
        this.IOR = f10;
        this.lightness = f11;
        this.shadowness = f12;
    }

    public static EnumC5301t getValueByIndex(int i2) {
        return i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? PRISM : CORRUGATION : THIN_LINE : THICK_STRIPE : PINSTRIPE;
    }
}
