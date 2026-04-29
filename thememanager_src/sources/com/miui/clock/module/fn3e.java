package com.miui.clock.module;

import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: FontWholeHourCopperplate.java */
/* JADX INFO: loaded from: classes3.dex */
public class fn3e extends AbstractC5071k {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final float[] f71894kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int[][][] f71895ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final float[] f71896n7h;

    /* JADX INFO: renamed from: p */
    private final int[] f29166p = {C5049g.n.f71104cyoe, C5049g.n.f71218r6ty, C5049g.n.f71266yp31, C5049g.n.f71274zff0, C5049g.n.f71116el, C5049g.n.f71251wt, C5049g.n.f71130g0ad, C5049g.n.f71150imd, C5049g.n.f71092bqie, C5049g.n.f71121f1bi, C5049g.n.f71230tww7, C5049g.n.f71203ob, C5049g.n.f71157kbj, C5049g.n.f71133gb, C5049g.n.f71093btvn, C5049g.n.f71163kq2f, C5049g.n.f71259xm, C5049g.n.f71185mj, C5049g.n.f71101cn02, C5049g.n.f71207ovdh, C5049g.n.f71120exv8, C5049g.n.f71213qh4d, C5049g.n.f71142hyow, C5049g.n.f71258xblq};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final float[] f71897qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int[][][] f71898x2;

    public fn3e() {
        Class cls = Integer.TYPE;
        this.f71895ld6 = (int[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f71898x2 = (int[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f71897qrj = new float[]{0.805f, 0.1f, 0.06f, 0.06f, 0.13f, 0.05f, 0.02f};
        this.f71896n7h = new float[]{80.7619f, 80.0f, 77.71429f, 80.7619f, 86.85714f, 85.71429f, 84.95238f, 73.90476f, 84.95238f, 93.71429f, 90.666664f, 96.7619f, 78.85714f, 88.7619f, 96.7619f, 97.90476f, 94.85714f, 90.666664f, 101.71429f, 97.90476f, 86.85714f, 75.809525f, 77.71429f, 77.71429f};
        this.f71894kja0 = new float[]{313.5238f, 307.0476f, 321.90475f, 337.14285f, 312.0f, 312.0f, 325.33334f, 313.14285f, 326.09525f, 323.42856f, 312.38095f, 297.5238f, 297.90475f, 301.7143f, 309.7143f, 311.2381f, 317.33334f, 308.9524f, 318.09525f, 316.57144f, 326.4762f, 313.5238f, 324.1905f, 323.0476f};
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int f7l8() {
        return C5049g.n.i0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] fu4() {
        return this.f71894kja0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: g */
    public float mo17699g() {
        return 40.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int gvn7() {
        return 352;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: h */
    public float[] mo17700h() {
        return this.f71896n7h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int jk() {
        return C5049g.n.f71156jz5;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] jp0y() {
        return this.f29166p;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ki() {
        return this.f71898x2;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ld6() {
        return this.f71895ld6;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] ni7() {
        return this.f71897qrj;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: p */
    public AbstractC5071k.k mo17701p() {
        return AbstractC5071k.k.Copperplate;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: y */
    public float mo17703y() {
        return 32.0f;
    }
}
