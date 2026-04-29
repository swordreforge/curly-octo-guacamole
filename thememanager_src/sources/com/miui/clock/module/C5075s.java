package com.miui.clock.module;

import androidx.constraintlayout.core.motion.utils.zurt;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import miuix.core.util.C7083n;

/* JADX INFO: renamed from: com.miui.clock.module.s */
/* JADX INFO: compiled from: FontDryBrush9.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5075s extends jk {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int[] f71978x2 = {C5049g.n.f71134gbni, C5049g.n.f71277zsr0, C5049g.n.f71212py, C5049g.n.f71147i9jn, C5049g.n.f71174ltg8, C5049g.n.f71219r8s8, C5049g.n.f71179m4, C5049g.n.f71239v0af, C5049g.n.f71118etdu, C5049g.n.f71224sok};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final float[] f71976qrj = {0.67f, 0.13f, 0.08f, 0.08f, 0.28f, 0.11f, 0.06f};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final float[] f71974n7h = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 21.5f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final float[] f71973kja0 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -18.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* JADX INFO: renamed from: h */
    private final int[][][] f29206h = {new int[][]{new int[]{115, 67, 157, 167}, new int[]{111, 71, 157, 154}, new int[]{111, 68, 162, 138}, new int[]{123, 68, 168, 125}, new int[]{120, 68, 164, 129}, new int[]{126, 79, 161, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD}, new int[]{114, 67, 159, 155}, new int[]{110, 68, 186, 122}, new int[]{112, 65, 169, 158}, new int[]{117, 65, 186, 125}}, new int[][]{new int[]{131, 59, 159, 165}, new int[]{117, 61, 176, 147}, new int[]{124, 63, ThemeStatus.Redeem.REDEEMING, UICard.LARGE_ICONS_APP_SEARCH_CARD}, new int[]{130, 63, 168, 125}, new int[]{124, 59, 164, 126}, new int[]{128, 56, 158, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}, new int[]{134, 53, 155, 153}, new int[]{109, 61, 186, 122}, new int[]{120, 55, 177, 151}, new int[]{124, 59, 178, 121}}, new int[][]{new int[]{115, 59, 158, 161}, new int[]{111, 55, 178, 154}, new int[]{109, 51, 168, UIElement.PURE_AD_DSP_BANNER}, new int[]{121, 50, 168, 125}}};

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final int[][][] f71970cdj = {new int[][]{new int[]{168, 53, 99, 155}, new int[]{175, 59, 92, ThemeStatus.Try.END}, new int[]{164, 56, 109, 140}, new int[]{168, 53, 116, 140}, new int[]{162, 58, 124, 127}, new int[]{166, 54, 119, 147}, new int[]{174, 47, 103, 141}, new int[]{168, 53, 118, ThemeStatus.Try.END}, new int[]{168, 53, 106, 155}, new int[]{175, 53, 113, 151}}, new int[][]{new int[]{179, 70, 113, 155}, new int[]{179, 70, 109, 150}, new int[]{179, 70, 98, 144}, new int[]{179, 70, 117, 151}, new int[]{179, 70, 112, 134}, new int[]{175, 84, 119, 147}, new int[]{179, 70, 120, 154}, new int[]{179, 70, 118, ThemeStatus.Try.END}, new int[]{179, 70, 117, 157}, new int[]{182, 79, 113, 154}}, new int[][]{new int[]{171, 46, 113, 154}, new int[]{171, 46, 111, 161}, new int[]{171, 46, 106, 145}, new int[]{177, 46, 123, 140}, new int[]{171, 46, 120, 127}, new int[]{169, 42, 118, 152}, new int[]{169, 42, 109, 144}, new int[]{171, 46, 124, ThemeStatus.Try.END}, new int[]{171, 46, 113, 152}, new int[]{171, 46, 121, 152}}, new int[][]{new int[]{178, 41, 104, 157}, new int[]{178, 37, 103, 147}, new int[]{178, 43, 100, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}, new int[]{178, 41, 119, ThemeStatus.Try.END}, new int[]{178, 41, 117, 130}, new int[]{178, 41, 119, 147}, new int[]{178, 35, 103, 156}, new int[]{179, 41, 124, ThemeStatus.Try.END}, new int[]{179, 37, 108, 155}, new int[]{181, 39, 123, 154}}, new int[][]{new int[]{163, 37, 105, 154}, new int[]{163, 37, 99, ThemeStatus.Try.END}, new int[]{164, 30, 97, 141}, new int[]{163, 37, 113, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}, new int[]{163, 37, 108, 131}, new int[]{163, 37, 119, 147}, new int[]{163, 37, 106, 150}, new int[]{163, 37, 119, ThemeStatus.Try.END}, new int[]{163, 37, 108, 155}, new int[]{161, 32, 117, 154}}, new int[][]{new int[]{136, 56, 109, 155}, new int[]{136, 56, 98, ThemeStatus.Try.END}, new int[]{130, 59, 93, UICard.LARGE_ICONS_APP_SEARCH_CARD}, new int[]{136, 56, 105, 145}, new int[]{132, 56, 97, 120}, new int[]{135, 61, 125, 147}, new int[]{136, 56, 106, 159}, new int[]{129, 54, 113, 152}, new int[]{136, 56, 108, 155}, new int[]{136, 56, 106, 154}}};

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final float[] f71972ki = {9.904762f, 8.761905f, 7.6190476f, 0.3809524f, 25.52381f, 0.0f, 8.0f, 7.2380953f, 8.0f, 8.761905f};

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final float[] f71977t8r = {122.666664f, 100.57143f, 132.19048f, 104.7619f, 107.04762f, 164.19048f, 120.0f, 93.71429f, 120.38095f, 115.04762f};

    /* JADX INFO: renamed from: i */
    private final int[] f29207i = {135, 112, 129, 119, 134, 166, 125, 104, 138, 123};

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final int[] f71971fn3e = {com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg};

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private final float[][][] f71979zurt = {new float[][]{new float[]{7.72f, -3.97f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{11.02f, 8.33f}, new float[]{0.0f, 0.0f}, new float[]{17.91f, -4.08f}, new float[]{-3.34f, 0.0f}, new float[]{-4.99f, 0.0f}, new float[]{8.68f, 0.0f}, new float[]{0.0f, 2.29f}}, new float[][]{new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 8.33f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, -3.66f}}, new float[][]{new float[]{9.76f, 0.0f}, new float[]{0.0f, 7.9f}, new float[]{3.45f, 0.0f}, new float[]{0.0f, 8.33f}}};

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private final float[][][] f71975ni7 = {new float[][]{new float[]{-5.36f, 6.72f}, new float[]{0.0f, 0.0f}, new float[]{-5.66f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{-6.81f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, -3.96f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{-5.69f, 1.94f}}, new float[][]{new float[]{0.0f, -2.39f}, new float[]{0.0f, -7.15f}, new float[]{0.0f, 5.07f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 1.94f}}, new float[][]{new float[]{4.0f, -4.93f}, new float[]{4.0f, 0.0f}, new float[]{4.0f, 3.66f}, new float[]{4.0f, 0.0f}, new float[]{4.0f, 0.0f}, new float[]{-3.66f, 0.0f}, new float[]{-3.66f, -3.96f}, new float[]{4.0f, 0.0f}, new float[]{4.0f, 0.0f}, new float[]{4.0f, 1.94f}}, new float[][]{new float[]{2.0f, 4.11f}, new float[]{8.9f, -9.7f}, new float[]{-0.53f, 7.44f}, new float[]{6.29f, 0.0f}, new float[]{2.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{2.0f, 0.0f}, new float[]{-3.41f, 0.0f}, new float[]{2.0f, 0.0f}, new float[]{0.0f, 1.94f}}, new float[][]{new float[]{0.0f, -1.66f}, new float[]{0.0f, -7.15f}, new float[]{-4.27f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{-4.8f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{3.72f, 1.94f}}, new float[][]{new float[]{0.0f, 0.0f}, new float[]{0.0f, -7.15f}, new float[]{-3.87f, 0.0f}, new float[]{0.0f, 6.16f}, new float[]{-4.45f, 0.0f}, new float[]{-5.17f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 1.94f}}};

    public C5075s() {
        this.f29172p = new int[][][]{new int[][]{new int[]{309, 336}, new int[]{313, 351}, new int[]{zurt.InterfaceC0290k.f47401cdj, 365}, new int[]{319, 379}, new int[]{322, 393}, new int[]{325, 407}, new int[]{328, 421}, new int[]{330, 434}, new int[]{333, C7083n.f39873k}, new int[]{337, 462}, new int[]{340, 476}, new int[]{343, 490}, new int[]{346, 504}, new int[]{349, 517}, new int[]{352, 530}, new int[]{356, 544}, new int[]{358, 557}, new int[]{360, 569}, new int[]{363, 582}}, new int[][]{new int[]{252, 276}, new int[]{260, 291}, new int[]{267, 306}, new int[]{273, 320}, new int[]{279, 334}, new int[]{285, 348}, new int[]{292, 363}, new int[]{299, 377}, new int[]{304, 390}}, new int[][]{new int[]{342, 363}, new int[]{344, 373}, new int[]{345, 383}, new int[]{345, 392}, new int[]{346, 401}, new int[]{346, 410}, new int[]{346, 419}, new int[]{347, 428}, new int[]{347, 437}, new int[]{348, 446}, new int[]{347, 454}}, new int[][]{new int[]{286, 287}, new int[]{290, 297}, new int[]{293, 307}, new int[]{295, zurt.InterfaceC0290k.f47401cdj}, new int[]{298, 326}, new int[]{300, 335}, new int[]{306, 347}, new int[]{310, 358}, new int[]{315, 370}, new int[]{319, 381}}, new int[][]{new int[]{223, 293}, new int[]{224, 306}, new int[]{224, zurt.InterfaceC0290k.f47423t8r}, new int[]{224, 330}, new int[]{223, 342}}, null, null, null, null, new int[][]{new int[]{291, 315}, new int[]{293, 331}, new int[]{294, 347}, new int[]{295, 363}}};
        this.f71908ld6 = new int[][][]{new int[][]{new int[]{309, 336}, new int[]{308, 345}, new int[]{306, 353}, new int[]{303, 361}, new int[]{301, 369}, new int[]{299, 377}, new int[]{297, 385}, new int[]{293, 392}}, new int[][]{new int[]{252, 276}, new int[]{246, 281}, new int[]{com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg, 286}, new int[]{234, 291}, new int[]{233, 299}, new int[]{236, 310}, new int[]{238, 321}, new int[]{239, 331}, new int[]{242, 342}, new int[]{243, 352}, new int[]{246, 363}}, new int[][]{new int[]{342, 363}, new int[]{342, 375}, new int[]{341, 387}, new int[]{340, 398}, new int[]{339, 410}}, new int[][]{new int[]{286, 287}, new int[]{285, 296}, new int[]{283, 305}, new int[]{281, 313}, new int[]{278, 321}}, new int[][]{new int[]{223, 293}, new int[]{224, 301}, new int[]{224, 308}, new int[]{223, 314}, new int[]{224, 321}, new int[]{224, 328}}, new int[][]{new int[]{451, 451}, new int[]{gcp.f7l8.f77026qrj, 457}, new int[]{gcp.f7l8.f77026qrj, 463}, new int[]{C7083n.f39873k, 468}, new int[]{446, 473}, new int[]{444, 478}, new int[]{442, 483}}, new int[][]{new int[]{307, 330}, new int[]{309, 340}, new int[]{310, 350}, new int[]{311, 360}, new int[]{311, 369}}, null, null, new int[][]{new int[]{291, 315}, new int[]{291, 322}, new int[]{289, 328}, new int[]{288, 334}, new int[]{287, 341}}};
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int a9() {
        return com.google.android.exoplayer2.extractor.ts.wvg.f64659wvg;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float cdj() {
        return 18.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int f7l8() {
        int i2 = this.f71911zy;
        return i2 != 0 ? i2 : C5049g.n.i0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float fn3e() {
        return 100.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int fti() {
        return 56;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] fu4() {
        return this.f71977t8r;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: g */
    public float mo17699g() {
        return 42.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int gvn7() {
        return 215;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: h */
    public float[] mo17700h() {
        return this.f71972ki;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: i */
    public float[] mo17709i() {
        return this.f71973kja0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int jk() {
        int i2 = this.f71910toq;
        return i2 != 0 ? i2 : C5049g.n.f71099cfr;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] jp0y() {
        return this.f71978x2;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: k */
    public boolean mo17710k() {
        return true;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ki() {
        return this.f71970cdj;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] kja0() {
        return this.f29207i;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ld6() {
        return this.f29206h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float mcp() {
        return 12.71f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: n */
    public float[] mo17711n() {
        return this.f71974n7h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] n7h() {
        return this.f71971fn3e;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] ni7() {
        return this.f71976qrj;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int o1t() {
        return -3;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: p */
    public AbstractC5071k.k mo17701p() {
        return AbstractC5071k.k.DryBrush9;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: t */
    public float mo17702t() {
        return 48.26f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[][][] t8r() {
        return this.f71975ni7;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int toq() {
        return 40;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float wvg() {
        return 26.25f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[][][] x2() {
        return this.f71979zurt;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: y */
    public float mo17703y() {
        return 36.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: z */
    public int mo17704z() {
        return 100;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float zurt() {
        return 23.33f;
    }
}
