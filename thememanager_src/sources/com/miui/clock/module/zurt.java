package com.miui.clock.module;

import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: FontWholeMinuteCopperplate.java */
/* JADX INFO: loaded from: classes3.dex */
public class zurt extends AbstractC5071k {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final float[] f72011kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int[][][] f72012ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final float[] f72013n7h;

    /* JADX INFO: renamed from: p */
    private final int[] f29244p = {C5049g.n.f71165ktq, C5049g.n.f71083b3e, C5049g.n.f71088bek6, C5049g.n.f71103cv06, C5049g.n.f71140h7am, C5049g.n.f71241vep5, C5049g.n.f71182mbx, C5049g.n.f71153jbh, C5049g.n.f71265yl, C5049g.n.f71232uc, C5049g.n.f71255wx16, C5049g.n.f71152ixz, C5049g.n.f46225do, C5049g.n.f71235ukdy, C5049g.n.f71113ebn, C5049g.n.f71208pc, C5049g.n.f71148ij, C5049g.n.f71198nsb, C5049g.n.f71280zwy, C5049g.n.f71188n2t, C5049g.n.f71209pjz9, C5049g.n.f71192ngy, C5049g.n.f71171lh, C5049g.n.f71087bap7, C5049g.n.f71139h4b, C5049g.n.f71249wlev, C5049g.n.f71132ga, C5049g.n.f71112e5, C5049g.n.f71111dxef, C5049g.n.f71245vy, C5049g.n.f71079a5id, C5049g.n.f71177lw, C5049g.n.f71136gcp, C5049g.n.f71205oki, C5049g.n.f71200o05, C5049g.n.f71180m58i, C5049g.n.f71102cnbm, C5049g.n.f71086b9ub, C5049g.n.f71085b8, C5049g.n.f71194nme, C5049g.n.f71217r25n, C5049g.n.f71119ew, C5049g.n.f71151ix, C5049g.n.f71166kx3, C5049g.n.f28988w, C5049g.n.f71178m2t, C5049g.n.f71231u38j, C5049g.n.f71211ps, C5049g.n.f71240v5yj, C5049g.n.f71220ra, C5049g.n.f71197nnh, C5049g.n.f71233uf, C5049g.n.f71160kiv, C5049g.n.f71272z4t, C5049g.n.f71090bih, C5049g.n.f71114ec, C5049g.n.f71202o5, C5049g.n.f71268yw, C5049g.n.f71221rp, C5049g.n.f71168l05};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final float[] f72014qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int[][][] f72015x2;

    public zurt() {
        Class cls = Integer.TYPE;
        this.f72012ld6 = (int[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f72015x2 = (int[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f72014qrj = new float[]{0.805f, 0.1f, 0.06f, 0.06f, 0.13f, 0.05f, 0.02f};
        this.f72013n7h = new float[]{29.714285f, 30.857143f, 30.857143f, 30.857143f, 17.904762f, 30.857143f, 29.714285f, 19.809525f, 27.809525f, 30.857143f, 30.857143f, 34.666668f, 27.809525f, 34.666668f, 27.809525f, 27.809525f, 29.714285f, 29.714285f, 36.95238f, 36.95238f, 40.0f, 40.0f, 40.0f, 34.666668f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 42.666668f, 40.0f, 42.666668f, 40.0f, 40.0f, 40.0f, 40.0f, 40.0f, 5.714286f, 5.714286f, 5.714286f, 5.714286f, 5.714286f, 5.714286f, 4.952381f, 6.857143f, 5.714286f, 5.714286f, 6.857143f, 6.857143f, 6.857143f, 6.857143f, 6.857143f, 5.714286f, 6.857143f, 6.857143f, 40.761906f, 6.857143f};
        this.f72011kja0 = new float[]{262.85715f, 264.7619f, 281.14285f, 272.0f, 244.19048f, 256.7619f, 270.09525f, 259.0476f, 254.09525f, 260.57144f, 252.19048f, 239.2381f, 242.66667f, 245.33333f, 243.42857f, 247.61905f, 253.33333f, 254.4762f, 259.42856f, 256.0f, 267.42856f, 266.2857f, 261.7143f, 279.61905f, 253.71428f, 279.2381f, 267.42856f, 278.4762f, 263.2381f, 261.33334f, 266.66666f, 267.42856f, 273.5238f, 267.0476f, 272.7619f, 255.61905f, 268.9524f, 266.66666f, 255.2381f, 262.4762f, 272.7619f, 272.7619f, 290.66666f, 277.33334f, 265.5238f, 274.66666f, 278.4762f, 283.42856f, 276.57144f, 283.42856f, 270.4762f, 259.0476f, 281.14285f, 288.0f, 253.71428f, 257.90475f, 284.57144f, 276.57144f, 262.09525f, 264.7619f};
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int f7l8() {
        return C5049g.n.i0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] fu4() {
        return this.f72011kja0;
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
        return this.f72013n7h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int jk() {
        return C5049g.n.f71156jz5;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] jp0y() {
        return this.f29244p;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ki() {
        return this.f72015x2;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ld6() {
        return this.f72012ld6;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] ni7() {
        return this.f72014qrj;
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
