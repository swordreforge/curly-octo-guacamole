package com.android.thememanager.lockscreen.lock.doodleclock;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.DoodleInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.base.EffectsTemplateView;
import com.android.thememanager.lockscreen.lock.base.zy;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.C2095g;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.android.thememanager.lockscreen.lock.task.C2112y;
import com.android.thememanager.lockscreen.lock.wallpaper.kja0;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.miui.clock.MiuiClockView;
import com.miui.keyguardtemplate.doodle.DoodleView;
import java.util.function.Consumer;
import java.util.function.Supplier;
import kotlin.collections.ni7;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import p023g.C6045k;
import zy.hyr;

/* JADX INFO: compiled from: DoodleTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nDoodleTemplateView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoodleTemplateView.kt\ncom/android/thememanager/lockscreen/lock/doodleclock/DoodleTemplateView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,284:1\n1#2:285\n1855#3:286\n1856#3:289\n253#4,2:287\n*S KotlinDebug\n*F\n+ 1 DoodleTemplateView.kt\ncom/android/thememanager/lockscreen/lock/doodleclock/DoodleTemplateView\n*L\n222#1:286\n222#1:289\n223#1:287,2\n*E\n"})
public final class DoodleTemplateView extends EffectsTemplateView {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7395n
    private ImageView f60346bo;

    /* JADX INFO: renamed from: d */
    @InterfaceC7395n
    private ImageView f12370d;

    /* JADX INFO: renamed from: u */
    @InterfaceC7395n
    private ImageView f12371u;

    /* JADX INFO: renamed from: v */
    @InterfaceC7395n
    private ImageView f12372v;

    /* JADX INFO: renamed from: x */
    @InterfaceC7395n
    private DoodleView f12373x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoodleTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m8067a(DoodleView it, int i2, Bitmap bitmap) {
        d2ok.m23075h(it, "$it");
        it.setDoodleBitmap(bitmap, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap a98o(DoodleView it, DoodleTemplateView this$0, int i2) {
        d2ok.m23075h(it, "$it");
        d2ok.m23075h(this$0, "this$0");
        return it.m17791q(this$0.getContext(), i2);
    }

    private final Drawable bf2(int i2, int i3) {
        Drawable qVar = C6045k.toq(getContext(), i2);
        if (qVar != null) {
            qVar.setTint(i3);
        }
        return qVar;
    }

    private final void ch(TemplateConfig templateConfig) {
        WallpaperInfo wallpaperInfo;
        if (templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null) {
            return;
        }
        int magicType = wallpaperInfo.getMagicType();
        DoodleInfo doodle = templateConfig.getDoodle();
        int solidColor = doodle != null ? doodle.getSolidColor() : -1;
        if (!kja0.f12503k.toq(Integer.valueOf(magicType))) {
            solidColor = 0;
        }
        ImageView imageView = (ImageView) getColorLayer();
        if (imageView != null) {
            imageView.setImageDrawable(new ColorDrawable(solidColor));
        }
    }

    private final void i1(final DoodleView doodleView, final int i2) {
        if (doodleView != null) {
            C2112y.toq(new Supplier() { // from class: com.android.thememanager.lockscreen.lock.doodleclock.k
                @Override // java.util.function.Supplier
                public final Object get() {
                    return DoodleTemplateView.a98o(doodleView, this, i2);
                }
            }).ld6(new Consumer() { // from class: com.android.thememanager.lockscreen.lock.doodleclock.toq
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DoodleTemplateView.m8067a(doodleView, i2, (Bitmap) obj);
                }
            });
        }
    }

    private final void setRibbonColor(TemplateConfig templateConfig) {
        DoodleInfo doodle;
        if (templateConfig == null || (doodle = templateConfig.getDoodle()) == null) {
            return;
        }
        ImageView imageView = this.f12371u;
        if (imageView != null) {
            imageView.setImageDrawable(bf2(R.drawable.kg_doodle_ribbon_back_start, doodle.getRibbonColor1()));
        }
        ImageView imageView2 = this.f60346bo;
        if (imageView2 != null) {
            imageView2.setImageDrawable(bf2(R.drawable.kg_doodle_ribbon_back_end, doodle.getRibbonColor1()));
        }
        ImageView imageView3 = this.f12372v;
        if (imageView3 != null) {
            imageView3.setImageDrawable(bf2(R.drawable.kg_doodle_ribbon_fore_start, doodle.getRibbonColor2()));
        }
        ImageView imageView4 = this.f12370d;
        if (imageView4 != null) {
            imageView4.setImageDrawable(bf2(R.drawable.kg_doodle_ribbon_fore_end, doodle.getRibbonColor2()));
        }
    }

    private final void setViewsVisibility(boolean z2) {
        for (View view : ni7.d2ok(this.f12373x, this.f60346bo, this.f12371u, this.f12370d, this.f12372v)) {
            if (view != null) {
                view.setVisibility(z2 ? 0 : 8);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    private final void m8068x(int i2) {
        TemplateConfig templateConfig = getTemplateConfig();
        DoodleInfo doodle = templateConfig != null ? templateConfig.getDoodle() : null;
        if (doodle != null) {
            doodle.setSolidColor(i2);
        }
        ImageView imageView = (ImageView) getColorLayer();
        if (imageView != null) {
            imageView.setImageDrawable(new ColorDrawable(i2));
        }
    }

    private final void y9n(ClockInfo clockInfo) {
        getCurrentClockBean().setStyle(clockInfo.getStyle());
        getCurrentClockBean().setPrimaryColor(clockInfo.getPrimaryColor());
        getCurrentClockBean().setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
    }

    private final void zp() {
        WallpaperInfo wallpaperInfo;
        DoodleInfo doodle;
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null) {
            return;
        }
        int magicType = wallpaperInfo.getMagicType();
        TemplateConfig templateConfig2 = getTemplateConfig();
        int solidColor = (templateConfig2 == null || (doodle = templateConfig2.getDoodle()) == null) ? -1 : doodle.getSolidColor();
        if (!kja0.f12503k.toq(Integer.valueOf(magicType))) {
            solidColor = 0;
        }
        ImageView imageView = (ImageView) getColorLayer();
        if (imageView != null) {
            imageView.setImageDrawable(new ColorDrawable(solidColor));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8069b() {
        zp();
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    /* JADX INFO: renamed from: c */
    public void mo8055c() {
        setViewsVisibility(false);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected int cdj() {
        return R.layout.kg_layout_doodle_clock_fore_content_layer;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        d2ok.m23075h(config, "config");
        super.dd(config);
        t8r(config);
        setRibbonColor(config);
        ch(config);
        ClockInfo clockInfo = config.getClockInfo();
        DoodleView doodleView = this.f12373x;
        if (doodleView == null) {
            return true;
        }
        doodleView.setDoodleColor(clockInfo.getPrimaryColor());
        i1(doodleView, clockInfo.getStyle());
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void eqxt(@InterfaceC7396q DoodleInfo doodleInfo) {
        d2ok.m23075h(doodleInfo, "doodleInfo");
        if (doodleInfo.isAutoSolidColor()) {
            return;
        }
        Log.d(zy.f12351k, "updateDoodleInfo: " + doodleInfo);
        super.eqxt(doodleInfo);
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig != null) {
            templateConfig.setDoodle(doodleInfo);
        }
        m8069b();
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "doodle";
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    public boolean hb() {
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    /* JADX INFO: renamed from: j */
    public boolean mo8056j() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    protected void jk() {
        WallpaperInfo wallpaperInfo;
        if (ni7()) {
            return;
        }
        this.f12371u = (ImageView) findViewById(R.id.ribbon_back_start);
        this.f60346bo = (ImageView) findViewById(R.id.ribbon_back_end);
        this.f12372v = (ImageView) findViewById(R.id.ribbon_fore_start);
        this.f12370d = (ImageView) findViewById(R.id.ribbon_fore_end);
        setRibbonColor(getTemplateConfig());
        ch(getTemplateConfig());
        DoodleView doodleView = this.f12373x;
        if (doodleView != null) {
            doodleView.setDoodleColor(getCurrentClockBean().getPrimaryColor());
            i1(doodleView, getCurrentClockBean().getStyle());
        }
        TemplateConfig templateConfig = getTemplateConfig();
        boolean z2 = false;
        if (((templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null) ? false : wallpaperInfo.getSupportSubject()) && C2670y.f7l8(getContext())) {
            z2 = true;
        }
        setViewsVisibility(z2);
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView != null) {
            miuiClockView.setWallpaperSupportDepth(z2);
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void oc(@InterfaceC7396q ClockInfo clockInfo) {
        DoodleView doodleView;
        d2ok.m23075h(clockInfo, "clockInfo");
        super.oc(clockInfo);
        String templateId = clockInfo.getTemplateId();
        String templateId2 = getCurrentClockBean().getTemplateId();
        d2ok.kja0(templateId2, "getTemplateId(...)");
        if (m8050y(templateId, templateId2)) {
            y9n(clockInfo);
            wvg();
            if (getCurrentClockBean().isAutoPrimaryColor() || (doodleView = this.f12373x) == null) {
                return;
            }
            doodleView.setDoodleColor(getCurrentClockBean().getPrimaryColor());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    @hyr(33)
    /* JADX INFO: renamed from: p */
    protected View mo8046p(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        View viewMo8046p = super.mo8046p(context, templateConfig);
        if (viewMo8046p != null) {
            return viewMo8046p;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setMiuiClockView(new MiuiClockView(context));
        getMiuiClockView();
        new FrameLayout.LayoutParams(-1, -1);
        setHasAddClockView(true);
        frameLayout.addView(getMiuiClockView());
        if (!ni7()) {
            DoodleView doodleView = new DoodleView(context);
            doodleView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f12373x = doodleView;
            frameLayout.addView(doodleView);
        }
        return frameLayout;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new C2095g(context);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        DoodleInfo doodle;
        d2ok.m23075h(colorData, "colorData");
        Log.d(zy.f12351k, "Doodle Color Pick Complete " + colorData + ".darkClockArea");
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(colorData.getRandomColorType(), colorData.getDarkClockArea(), colorData.getClockPalette());
        }
        if (ni7()) {
            return;
        }
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig != null && (doodle = templateConfig.getDoodle()) != null) {
            doodle.setRibbonColor1(colorData.getExtraColor1());
            doodle.setRibbonColor2(colorData.getExtraColor2());
            Log.d(zy.f12351k, "onColorPickComplete isAutoSolidColor：" + doodle.isAutoSolidColor() + " extraColor1：" + colorData.getExtraColor1() + " extraColor2：" + colorData.getExtraColor2() + " secondaryColor:" + colorData.getSecondaryColor() + " primaryColor:" + colorData.getPrimaryColor());
            if (doodle.isAutoSolidColor()) {
                doodle.setSolidColor(colorData.getSecondaryColor());
                zp();
            }
            if (getCurrentClockBean().isAutoPrimaryColor()) {
                getCurrentClockBean().setPrimaryColor(colorData.getPrimaryColor());
                DoodleView doodleView = this.f12373x;
                if (doodleView != null) {
                    doodleView.setDoodleColor(getCurrentClockBean().getPrimaryColor());
                }
                wvg();
            }
        }
        setRibbonColor(getTemplateConfig());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        y9n(templateConfig.getClockInfo());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    protected void uv6() {
        m8068x(0);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    protected void vyq() {
        int solidColor;
        DoodleInfo doodle;
        WallpaperInfo wallpaperInfo;
        kja0 kja0Var = kja0.f12503k;
        TemplateConfig templateConfig = getTemplateConfig();
        if (kja0Var.toq((templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null) ? null : Integer.valueOf(wallpaperInfo.getMagicType()))) {
            TemplateConfig templateConfig2 = getTemplateConfig();
            solidColor = (templateConfig2 == null || (doodle = templateConfig2.getDoodle()) == null) ? -1 : doodle.getSolidColor();
        } else {
            solidColor = 0;
        }
        m8068x(solidColor);
        setViewsVisibility(true);
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView != null) {
            miuiClockView.setWallpaperSupportDepth(true);
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void wvg() {
        super.wvg();
        i1(this.f12373x, getCurrentClockBean().getStyle());
    }
}
