package com.miui.clock.module;

import androidx.constraintlayout.core.motion.utils.zurt;
import com.android.thememanager.controller.online.InterfaceC1932s;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.miui.clock.C5049g;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.toq;
import miuix.core.util.C7083n;
import miuix.view.C7385p;
import z4j7.C7797k;

/* JADX INFO: compiled from: FontSKPupok.java */
/* JADX INFO: loaded from: classes3.dex */
public class ki extends jk {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final int[] f71919x2 = {C5049g.n.f71161kja0, C5049g.n.f28973h, C5049g.n.f71098cdj, C5049g.n.f71159ki, C5049g.n.f71226t8r, C5049g.n.f28974i, C5049g.n.f71126fn3e, C5049g.n.f71279zurt, C5049g.n.f71193ni7, C5049g.n.f71129fu4};

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final int[][][] f71917qrj = {new int[][]{new int[]{100, 67, 153, 166}, new int[]{99, 61, 153, 155}, new int[]{106, 57, 147, 164}, new int[]{110, 57, 158, 157}, new int[]{111, 56, 150, 142}, new int[]{93, 64, 150, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD}, new int[]{90, 70, 150, 156}, new int[]{138, 53, 142, 135}, new int[]{122, 62, 145, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD}, new int[]{125, 61, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}}, new int[][]{new int[]{88, 59, 155, 165}, new int[]{97, 55, 150, 156}, new int[]{104, 50, ThemeStatus.Try.END, 158}, new int[]{115, 46, 153, 147}, new int[]{101, 52, 151, 142}, new int[]{85, 58, 152, 150}, new int[]{86, 60, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD, 150}, new int[]{UIElement.PURE_AD_DSP_BANNER, 47, 142, UIElement.PURE_AD_DSP_BANNER}, new int[]{114, 47, 144, 145}, new int[]{107, 49, 153, 152}}, new int[][]{new int[]{84, 54, 159, 170}, new int[]{95, 53, 151, ThemeStatus.Redeem.REDEEMING}, new int[]{93, 47, 152, 167}, new int[]{109, 43, 155, 157}}};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final int[][][] f71916n7h = {new int[][]{new int[]{152, 48, 100, 145}, new int[]{156, 49, 91, ThemeStatus.Redeem.REDEEMING}, new int[]{156, 49, 105, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}, new int[]{154, 47, 114, 156}, new int[]{152, 51, 96, 155}, new int[]{158, 51, 83, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}, new int[]{152, 51, 89, UIElement.HOMEPAGE_SILDE_AD_CARD}, new int[]{154, 51, 124, 144}, new int[]{155, 51, 114, 142}, new int[]{152, 51, 119, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}}, new int[][]{new int[]{158, 53, 93, 151}, new int[]{ThemeStatus.Redeem.REDEEMING, 45, 78, 159}, new int[]{158, 51, 104, 147}, new int[]{153, 49, 119, 152}, new int[]{158, 46, 96, 145}, new int[]{152, 49, 87, 153}, new int[]{157, 54, 81, 141}, new int[]{157, 45, 105, ThemeStatus.Try.END}, new int[]{163, 43, 99, 142}, new int[]{163, 47, 96, 150}}, new int[][]{new int[]{152, 47, 104, 150}, new int[]{152, 47, 99, 150}, new int[]{153, 41, 110, 145}, new int[]{153, 46, 120, 155}, new int[]{151, 46, 101, 153}, new int[]{153, 47, 91, ThemeStatus.Try.END}, new int[]{152, 47, 83, 144}, new int[]{152, 44, 121, 145}, new int[]{152, 44, 117, 141}, new int[]{152, 41, 119, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}}, new int[][]{new int[]{152, 43, 112, 151}, new int[]{UICard.HOME_PAGE_HYBRID_MARQUEE_CARD, 41, 108, 159}, new int[]{155, 43, 119, ThemeStatus.Try.END}, new int[]{150, 43, 134, 150}, new int[]{156, 41, 101, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD}, new int[]{152, 43, 102, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM}, new int[]{151, 46, 103, 136}, new int[]{158, 40, 126, 140}, new int[]{157, 41, 123, 141}, new int[]{158, 41, 121, 147}}, new int[][]{new int[]{UICard.HOME_PAGE_HYBRID_MARQUEE_CARD, 47, 108, UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD}, new int[]{150, 48, 112, 147}, new int[]{UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD, 51, 115, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD}, new int[]{151, 54, 116, 161}, new int[]{UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD, 51, 104, 153}, new int[]{152, 52, 82, 157}, new int[]{ThemeStatus.Try.END, 55, 94, 142}, new int[]{UICard.HOME_PAGE_HYBRID_MARQUEE_CARD, 55, 121, ThemeStatus.Try.END}, new int[]{UICard.HOME_PAGE_HYBRID_MARQUEE_CARD, 49, 115, 144}, new int[]{UICard.HOME_PAGE_HYBRID_SIX_GRID_CARD, 45, 115, 152}}, new int[][]{new int[]{152, 50, 93, ThemeStatus.Try.END}, new int[]{152, 50, 81, 157}, new int[]{152, 50, 99, ThemeStatus.Try.END}, new int[]{152, 50, 104, 153}, new int[]{152, 50, 85, 151}, new int[]{152, 50, 82, 142}, new int[]{152, 50, 64, 150}, new int[]{152, 50, 100, 147}, new int[]{152, 50, 106, 141}, new int[]{152, 50, 104, UICard.HOME_PAGE_HYBRID_MARQUEE_CARD}}};

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final float[][][] f71915kja0 = {new float[][]{new float[]{6.65f, -12.74f}, new float[]{-2.86f, 5.0f}, new float[]{0.0f, 0.0f}, new float[]{7.28f, -7.08f}, new float[]{-13.25f, 7.97f}, new float[]{5.07f, -4.72f}, new float[]{4.39f, -12.81f}, new float[]{0.0f, -23.99f}, new float[]{0.0f, -11.28f}, new float[]{-5.14f, -8.83f}}, new float[][]{new float[]{13.11f, -9.04f}, new float[]{5.07f, 7.78f}, new float[]{11.01f, -8.15f}, new float[]{6.8f, -14.51f}, new float[]{8.24f, 7.97f}, new float[]{19.6f, -1.99f}, new float[]{13.91f, -15.08f}, new float[]{13.57f, -23.99f}, new float[]{17.99f, -13.35f}, new float[]{14.95f, 0.0f}}, new float[][]{new float[]{3.78f, 2.4f}, new float[]{-4.63f, 12.68f}, new float[]{0.0f, 6.03f}, new float[]{-9.24f, 4.08f}}};

    /* JADX INFO: renamed from: h */
    private final float[][][] f29180h = {new float[][]{new float[]{-9.03f, 9.88f}, new float[]{-4.93f, -7.19f}, new float[]{-10.55f, 10.95f}, new float[]{-12.82f, -19.46f}, new float[]{-15.87f, 12.67f}, new float[]{-9.84f, 4.0f}, new float[]{-14.43f, 6.59f}, new float[]{-7.92f, -16.37f}, new float[]{-2.34f, 4.41f}, new float[]{-13.83f, -8.86f}}, new float[][]{new float[]{4.5f, 0.0f}, new float[]{14.03f, 0.0f}, new float[]{4.5f, 0.0f}, new float[]{-1.42f, -17.01f}, new float[]{4.5f, -13.71f}, new float[]{-1.66f, -8.01f}, new float[]{7.54f, 4.26f}, new float[]{10.06f, -25.09f}, new float[]{12.9f, 6.07f}, new float[]{12.9f, 0.0f}}, new float[][]{new float[]{-4.39f, 0.0f}, new float[]{-11.38f, 13.57f}, new float[]{-11.38f, 15.3f}, new float[]{0.0f, 0.0f}, new float[]{-11.43f, 5.0f}, new float[]{0.0f, 0.0f}, new float[]{-7.61f, 0.0f}, new float[]{2.03f, -18.47f}, new float[]{-5.26f, -10.7f}, new float[]{-12.63f, 5.05f}}, new float[][]{new float[]{0.0f, -8.64f}, new float[]{-9.73f, -2.58f}, new float[]{3.8f, 4.69f}, new float[]{0.0f, -5.05f}, new float[]{5.61f, 13.68f}, new float[]{0.0f, 4.0f}, new float[]{-3.71f, 5.55f}, new float[]{0.0f, -21.34f}, new float[]{-8.97f, -6.0f}, new float[]{-6.49f, -8.12f}}, new float[][]{new float[]{-2.93f, 2.87f}, new float[]{0.0f, 11.86f}, new float[]{-10.28f, 0.0f}, new float[]{-6.35f, -9.64f}, new float[]{-10.28f, 11.87f}, new float[]{-2.38f, -10.06f}, new float[]{-7.51f, -2.27f}, new float[]{-0.84f, -27.03f}, new float[]{-6.73f, -7.27f}, new float[]{-1.56f, -4.98f}}, new float[][]{new float[]{-4.13f, 9.55f}, new float[]{-4.13f, 8.34f}, new float[]{-4.13f, 11.12f}, new float[]{-4.13f, 15.47f}, new float[]{-4.13f, 14.41f}, new float[]{-4.13f, 4.0f}, new float[]{-4.13f, -6.95f}, new float[]{-4.13f, -29.88f}, new float[]{-4.13f, -8.95f}, new float[]{-4.13f, -7.66f}}};

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private final float[] f71912cdj = {0.72f, 0.17f, 0.1f, 0.1f, 0.28f, 0.11f, 0.05f};

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private final float[] f71914ki = {7.6190476f, 8.0f, 7.6190476f, 8.0f, 8.380953f, 8.0f, 7.6190476f, 7.6190476f, 7.6190476f, 7.6190476f};

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private final float[] f71918t8r = {163.42857f, 144.0f, 169.5238f, 160.0f, 161.5238f, 169.90475f, 179.04762f, 198.4762f, 183.2381f, 159.61905f};

    /* JADX INFO: renamed from: i */
    private final int[] f29181i = {171, 152, 177, 168, 170, 178, 187, toq.zy.f72000f7l8, 191, 167};

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private final int[] f71913fn3e = {177, 200, 186, C7385p.f92239fu4, toq.zy.f29239s, C7385p.f92239fu4, 184, 186, 186, C7385p.f92249o1t};

    public ki() {
        this.f29172p = new int[][][]{new int[][]{new int[]{429, 449}, new int[]{434, 459}, new int[]{437, 468}, new int[]{441, 477}, new int[]{444, 485}, new int[]{447, 494}, new int[]{451, 503}, new int[]{455, 512}, new int[]{458, 520}, new int[]{461, 528}, new int[]{465, 537}}, new int[][]{new int[]{373, 395}, new int[]{377, toq.f7l8.f71987f7l8}, new int[]{381, 417}, new int[]{383, 427}, new int[]{387, 438}, new int[]{389, C7083n.f39873k}, new int[]{393, 459}, new int[]{396, 469}, new int[]{398, 479}, new int[]{401, 489}, new int[]{toq.f7l8.f29213n, 499}, new int[]{407, 509}, new int[]{toq.f7l8.f29214p, 518}, new int[]{412, 528}, new int[]{InterfaceC1932s.t7zh, 537}, new int[]{417, 547}, new int[]{419, 556}, new int[]{421, 565}, new int[]{424, 574}, new int[]{425, 582}, new int[]{427, 591}}, new int[][]{new int[]{444, 465}, new int[]{444, 473}, new int[]{444, 481}, new int[]{444, 489}, new int[]{443, 496}, new int[]{442, 503}, new int[]{443, 511}, new int[]{442, 518}, new int[]{441, 525}, new int[]{439, 531}, new int[]{439, 538}, new int[]{442, 545}, new int[]{444, 551}, new int[]{446, 557}, new int[]{C7083n.f39873k, 563}, new int[]{gcp.f7l8.f77026qrj, 569}, new int[]{452, 575}}, new int[][]{new int[]{417, 439}, new int[]{417, C7083n.f39873k}, new int[]{InterfaceC1932s.t7zh, 455}, new int[]{413, 463}, new int[]{411, 471}, new int[]{toq.f7l8.f29214p, 478}, new int[]{407, 486}, new int[]{toq.f7l8.f29211g, 493}, new int[]{toq.f7l8.f29213n, 500}, new int[]{407, 507}, new int[]{410, 514}, new int[]{412, 520}, new int[]{415, 527}, new int[]{417, 533}, new int[]{419, 539}, new int[]{421, 545}, new int[]{zurt.zy.f47489fn3e, 551}}, new int[][]{new int[]{421, 444}, new int[]{zurt.zy.f1773i, 453}, new int[]{421, 461}, new int[]{zurt.zy.f47496ki, 469}, new int[]{zurt.zy.f47496ki, 477}, new int[]{419, 485}, new int[]{418, 493}, new int[]{417, 500}, new int[]{zurt.zy.f47483cdj, 508}, new int[]{415, 515}, new int[]{413, 522}, new int[]{412, 529}, new int[]{411, 536}, new int[]{toq.f7l8.f29214p, 543}, new int[]{407, 549}, new int[]{toq.f7l8.f71987f7l8, 556}}, new int[][]{new int[]{445, 467}, new int[]{453, 479}, new int[]{460, 491}, new int[]{466, 502}, new int[]{472, androidx.core.view.n7h.f4072p}, new int[]{478, 524}}, new int[][]{new int[]{470, 491}, new int[]{476, 502}, new int[]{482, androidx.core.view.n7h.f4072p}, new int[]{488, 524}, new int[]{493, 535}, new int[]{498, 545}, new int[]{503, 555}, new int[]{508, 565}}, null, new int[][]{new int[]{482, 503}, new int[]{482, 511}, new int[]{481, 519}, new int[]{480, 526}, new int[]{478, 533}, new int[]{478, 541}, new int[]{477, 548}, new int[]{474, 554}}, new int[][]{new int[]{417, 438}, new int[]{419, C7083n.f39873k}, new int[]{421, 457}, new int[]{426, 466}, new int[]{431, 475}, new int[]{436, 484}, new int[]{440, 492}}};
        this.f71908ld6 = new int[][][]{new int[][]{new int[]{429, 449}, new int[]{426, 453}, new int[]{zurt.zy.f1773i, 456}, new int[]{418, 459}, new int[]{InterfaceC1932s.t7zh, 462}, new int[]{411, 465}, new int[]{407, 468}, new int[]{403, 471}, new int[]{400, 474}, new int[]{396, 476}, new int[]{392, 479}, new int[]{389, 482}, new int[]{385, 484}, new int[]{382, 487}, new int[]{378, 489}, new int[]{375, 491}, new int[]{372, 494}}, new int[][]{new int[]{373, 395}, new int[]{371, 399}, new int[]{368, 402}, new int[]{365, toq.f7l8.f29211g}, new int[]{362, 408}, new int[]{359, 411}, new int[]{356, InterfaceC1932s.t7zh}, new int[]{353, 417}, new int[]{351, zurt.zy.f47496ki}}, new int[][]{new int[]{444, 465}, new int[]{445, 471}, new int[]{445, 476}, new int[]{445, 481}, new int[]{445, 486}, new int[]{446, 491}, new int[]{446, 496}, new int[]{445, 500}, new int[]{445, 505}, new int[]{444, 509}, new int[]{443, androidx.core.view.n7h.f4072p}, new int[]{442, 517}, new int[]{442, 521}, new int[]{441, 525}}, new int[][]{new int[]{417, 439}, new int[]{419, 445}, new int[]{421, 451}, new int[]{zurt.zy.f47489fn3e, 457}, new int[]{424, 462}, new int[]{426, 468}, new int[]{427, 473}, new int[]{428, 478}, new int[]{429, 483}, new int[]{431, 488}, new int[]{432, 493}, new int[]{432, 497}, new int[]{434, 502}, new int[]{434, 506}, new int[]{435, 511}, new int[]{436, 515}, new int[]{436, 519}, new int[]{437, 523}, new int[]{437, 527}, new int[]{438, 531}, new int[]{438, 535}}, new int[][]{new int[]{421, 444}, new int[]{zurt.zy.f47489fn3e, 451}, new int[]{zurt.zy.f47489fn3e, 457}, new int[]{zurt.zy.f47489fn3e, 463}, new int[]{424, 469}, new int[]{424, 475}, new int[]{424, 481}, new int[]{424, 486}, new int[]{424, 492}, new int[]{424, 497}, new int[]{zurt.zy.f47489fn3e, 502}, new int[]{zurt.zy.f47489fn3e, 507}, new int[]{zurt.zy.f47489fn3e, 512}, new int[]{zurt.zy.f1773i, 517}, new int[]{zurt.zy.f1773i, 522}}, new int[][]{new int[]{445, 467}, new int[]{440, 470}, new int[]{433, 472}, new int[]{426, 474}, new int[]{418, 475}, new int[]{411, 477}, new int[]{toq.f7l8.f29213n, 478}, new int[]{397, 480}, new int[]{389, 481}, new int[]{382, 482}, new int[]{378, 483}, new int[]{373, 483}}, new int[][]{new int[]{470, 491}, new int[]{466, 494}, new int[]{460, 496}, new int[]{454, 498}, new int[]{C7083n.f39873k, 500}, new int[]{442, 501}, new int[]{436, 503}, new int[]{429, 504}, new int[]{424, 506}, new int[]{418, 507}, new int[]{411, 508}, new int[]{toq.f7l8.f29213n, 508}, new int[]{398, 509}, new int[]{392, zurt.f7l8.f47377ki}, new int[]{385, zurt.f7l8.f47377ki}, new int[]{378, zurt.f7l8.f47377ki}, new int[]{371, zurt.f7l8.f47377ki}}, new int[][]{new int[]{524, 545}, new int[]{527, C7797k.f45971k}, new int[]{528, 554}, new int[]{529, 558}, new int[]{530, 562}, new int[]{531, 566}, new int[]{532, 569}, new int[]{532, 572}, new int[]{533, 576}, new int[]{533, 579}, new int[]{534, 582}, new int[]{533, 584}, new int[]{533, 587}, new int[]{532, 589}, new int[]{533, 592}, new int[]{532, 594}, new int[]{532, 596}, new int[]{530, 597}, new int[]{530, 599}, new int[]{528, 600}, new int[]{528, zurt.InterfaceC0291n.f47433ki}, new int[]{526, zurt.InterfaceC0291n.f47440t8r}, new int[]{525, zurt.InterfaceC0291n.f1732i}, new int[]{523, zurt.InterfaceC0291n.f1732i}, new int[]{522, zurt.InterfaceC0291n.f47431fn3e}, new int[]{519, zurt.InterfaceC0291n.f47431fn3e}, new int[]{518, zurt.InterfaceC0291n.f47444zurt}, new int[]{516, zurt.InterfaceC0291n.f47444zurt}, new int[]{514, zurt.InterfaceC0291n.f47444zurt}, new int[]{511, zurt.InterfaceC0291n.f47431fn3e}, new int[]{509, zurt.InterfaceC0291n.f47431fn3e}}, new int[][]{new int[]{482, 503}, new int[]{484, 509}, new int[]{486, 515}, new int[]{486, 520}, new int[]{487, 525}, new int[]{488, 530}, new int[]{488, 535}, new int[]{489, 540}, new int[]{490, 545}, new int[]{490, 549}, new int[]{490, 553}, new int[]{491, 558}, new int[]{491, 562}, new int[]{491, 566}, new int[]{491, 570}}, new int[][]{new int[]{417, 438}, new int[]{417, 442}, new int[]{zurt.zy.f47483cdj, 445}, new int[]{InterfaceC1932s.t7zh, C7083n.f39873k}, new int[]{413, 451}, new int[]{412, 454}, new int[]{411, 457}, new int[]{410, 460}, new int[]{408, 462}, new int[]{407, 465}}};
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int a9() {
        return 128;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float cdj() {
        return 30.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int f7l8() {
        int i2 = this.f71911zy;
        return i2 != 0 ? i2 : C5049g.n.i0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float fn3e() {
        return 52.48f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int fti() {
        return 62;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] fu4() {
        return this.f71918t8r;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: g */
    public float mo17699g() {
        return 30.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int gvn7() {
        return C7385p.f92249o1t;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: h */
    public float[] mo17700h() {
        return this.f71914ki;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int jk() {
        int i2 = this.f71910toq;
        return i2 != 0 ? i2 : C5049g.n.f28991z;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] jp0y() {
        return this.f71919x2;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: k */
    public boolean mo17710k() {
        return true;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ki() {
        return this.f71916n7h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] kja0() {
        return this.f29181i;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[][][] ld6() {
        return this.f71917qrj;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float mcp() {
        return 12.69f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int[] n7h() {
        return this.f71913fn3e;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[] ni7() {
        return this.f71912cdj;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int o1t() {
        return -2;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: p */
    public AbstractC5071k.k mo17701p() {
        return AbstractC5071k.k.SKPupok;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: t */
    public float mo17702t() {
        return 46.4f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[][][] t8r() {
        return this.f29180h;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public int toq() {
        return 32;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float wvg() {
        return 19.93f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float[][][] x2() {
        return this.f71915kja0;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: y */
    public float mo17703y() {
        return 42.0f;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    /* JADX INFO: renamed from: z */
    public int mo17704z() {
        return 82;
    }

    @Override // com.miui.clock.module.AbstractC5071k
    public float zurt() {
        return 25.42f;
    }
}
