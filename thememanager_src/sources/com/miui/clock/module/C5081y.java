package com.miui.clock.module;

import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.miui.clock.module.y */
/* JADX INFO: compiled from: FontCopperplate.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5081y extends AbstractC5071k {

    /* JADX INFO: renamed from: h */
    private final int[] f29242h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final float[] f72006kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final int[][][] f72007ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final float[] f72008n7h;

    /* JADX INFO: renamed from: p */
    private final int[] f29243p = {C5049g.n.f71247w831, C5049g.n.f71270z4, C5049g.n.f71267yqrt, C5049g.n.f71158kcsr, C5049g.n.f71094bwp, C5049g.n.f71223se, C5049g.n.f71135gc3c, C5049g.n.f71275zkd, C5049g.n.f71095bz2, C5049g.n.f71234uj2j};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final float[] f72009qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int[][][] f72010x2;

    public C5081y() {
        Class cls = Integer.TYPE;
        this.f72007ld6 = (int[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f72010x2 = (int[][][]) Array.newInstance((Class<?>) cls, 10, 10, 10);
        this.f72009qrj = new float[]{0.805f, 0.1f, 0.06f, 0.06f, 0.13f, 0.05f, 0.02f};
        this.f72008n7h = new float[]{9.904762f, 14.857142f, 9.142858f, 11.809524f, 4.1904764f, 12.190476f, 9.904762f, 6.095238f, 9.904762f, 7.6190476f};
        this.f72006kja0 = new float[]{118.85714f, 64.7619f, 104.7619f, 111.2381f, 116.190475f, 112.0f, 116.57143f, 103.2381f, 121.14286f, 113.52381f};
        this.f29242h = new int[]{130, 82, 115, 121, 123, 123, 127, 114, 132, 125};
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int a9() {
        return 161;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int f7l8() {
        int i2 = this.f71911zy;
        return i2 != 0 ? i2 : C5049g.n.i0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float fn3e() {
        return 74.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int fti() {
        return 57;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] fu4() {
        return this.f72006kja0;
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
        return this.f72008n7h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int jk() {
        int i2 = this.f71910toq;
        return i2 != 0 ? i2 : C5049g.n.f71156jz5;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] jp0y() {
        return this.f29243p;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ki() {
        return this.f72010x2;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] kja0() {
        return this.f29242h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ld6() {
        return this.f72007ld6;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float mcp() {
        return 12.12f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] ni7() {
        return this.f72009qrj;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int o1t() {
        return -4;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: p */
    public AbstractC5071k.k mo17701p() {
        return AbstractC5071k.k.Copperplate;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int qrj() {
        return 161;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: t */
    public float mo17702t() {
        return 49.15f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int toq() {
        return 40;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float wvg() {
        return 12.88f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: y */
    public float mo17703y() {
        return 32.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: z */
    public int mo17704z() {
        return 74;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float zurt() {
        return 26.2f;
    }
}
