package com.google.android.material.bottomappbar;

import com.google.android.material.shape.cdj;
import com.google.android.material.shape.f7l8;
import zy.lvui;
import zy.uv6;
import zy.zurt;

/* JADX INFO: renamed from: com.google.android.material.bottomappbar.k */
/* JADX INFO: compiled from: BottomAppBarTopEdgeTreatment.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3948k extends f7l8 implements Cloneable {

    /* JADX INFO: renamed from: h */
    private static final int f23968h = 180;

    /* JADX INFO: renamed from: i */
    private static final int f23969i = 270;

    /* JADX INFO: renamed from: p */
    private static final int f23970p = 90;

    /* JADX INFO: renamed from: t */
    private static final float f23971t = 1.75f;

    /* JADX INFO: renamed from: z */
    private static final int f23972z = 180;

    /* JADX INFO: renamed from: g */
    private float f23973g;

    /* JADX INFO: renamed from: k */
    private float f23974k;

    /* JADX INFO: renamed from: n */
    private float f23975n;

    /* JADX INFO: renamed from: q */
    private float f23976q;

    /* JADX INFO: renamed from: s */
    private float f23977s = -1.0f;

    /* JADX INFO: renamed from: y */
    private float f23978y;

    public C3948k(float f2, float f3, float f4) {
        this.f23976q = f2;
        this.f23974k = f3;
        cdj(f4);
        this.f23978y = 0.0f;
    }

    void cdj(@zurt(from = 0.0d) float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f23973g = f2;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void fn3e(float f2) {
        this.f23975n = f2;
    }

    /* JADX INFO: renamed from: g */
    float m14131g() {
        return this.f23973g;
    }

    /* JADX INFO: renamed from: i */
    void m14132i(float f2) {
        this.f23974k = f2;
    }

    public void ki(float f2) {
        this.f23977s = f2;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public float kja0() {
        return this.f23978y;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public float n7h() {
        return this.f23975n;
    }

    @Override // com.google.android.material.shape.f7l8
    /* JADX INFO: renamed from: q */
    public void mo14133q(float f2, float f3, float f4, @lvui cdj cdjVar) {
        float f5;
        float f6;
        float f7 = this.f23975n;
        if (f7 == 0.0f) {
            cdjVar.n7h(f2, 0.0f);
            return;
        }
        float f8 = ((this.f23976q * 2.0f) + f7) / 2.0f;
        float f9 = f4 * this.f23974k;
        float f10 = f3 + this.f23978y;
        float f11 = (this.f23973g * f4) + ((1.0f - f4) * f8);
        if (f11 / f8 >= 1.0f) {
            cdjVar.n7h(f2, 0.0f);
            return;
        }
        float f12 = this.f23977s;
        float f13 = f12 * f4;
        boolean z2 = f12 == -1.0f || Math.abs((f12 * 2.0f) - f7) < 0.1f;
        if (z2) {
            f5 = f11;
            f6 = 0.0f;
        } else {
            f6 = f23971t;
            f5 = 0.0f;
        }
        float f14 = f8 + f9;
        float f15 = f5 + f9;
        float fSqrt = (float) Math.sqrt((f14 * f14) - (f15 * f15));
        float f16 = f10 - fSqrt;
        float f17 = f10 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f15));
        float f18 = (90.0f - degrees) + f6;
        cdjVar.n7h(f16, 0.0f);
        float f19 = f9 * 2.0f;
        cdjVar.m14778k(f16 - f9, 0.0f, f16 + f9, f19, 270.0f, degrees);
        if (z2) {
            cdjVar.m14778k(f10 - f8, (-f8) - f5, f10 + f8, f8 - f5, 180.0f - f18, (f18 * 2.0f) - 180.0f);
        } else {
            float f20 = this.f23976q;
            float f21 = f13 * 2.0f;
            float f22 = f10 - f8;
            cdjVar.m14778k(f22, -(f13 + f20), f22 + f20 + f21, f20 + f13, 180.0f - f18, ((f18 * 2.0f) - 180.0f) / 2.0f);
            float f23 = f10 + f8;
            float f24 = this.f23976q;
            cdjVar.n7h(f23 - ((f24 / 2.0f) + f13), f24 + f13);
            float f25 = this.f23976q;
            cdjVar.m14778k(f23 - (f21 + f25), -(f13 + f25), f23, f25 + f13, 90.0f, f18 - 90.0f);
        }
        cdjVar.m14778k(f17 - f9, 0.0f, f17 + f9, f19, 270.0f - degrees, degrees);
        cdjVar.n7h(f2, 0.0f);
    }

    float qrj() {
        return this.f23974k;
    }

    /* JADX INFO: renamed from: s */
    float m14134s() {
        return this.f23976q;
    }

    void t8r(float f2) {
        this.f23976q = f2;
    }

    /* JADX INFO: renamed from: y */
    public float m14135y() {
        return this.f23977s;
    }

    void zurt(float f2) {
        this.f23978y = f2;
    }
}
