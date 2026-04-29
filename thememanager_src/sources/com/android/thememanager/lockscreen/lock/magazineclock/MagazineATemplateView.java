package com.android.thememanager.lockscreen.lock.magazineclock;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.C2102y;
import com.android.thememanager.lockscreen.lock.wallpaper.kja0;
import com.miui.clock.MiuiClockView;
import com.miui.lockscreeninfo.LockScreenInfoLayout;
import kotlin.jvm.internal.d2ok;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: MagazineATemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MagazineATemplateView extends MagazineSignatureTemplateView {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7395n
    private MiuiClockView f60351bo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagazineATemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    private final boolean bf2() {
        WallpaperInfo wallpaperInfo;
        if (ni7()) {
            kja0 kja0Var = kja0.f12503k;
            TemplateConfig templateConfig = getTemplateConfig();
            if (kja0Var.toq((templateConfig == null || (wallpaperInfo = templateConfig.getWallpaperInfo()) == null) ? null : Integer.valueOf(wallpaperInfo.getMagicType()))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        d2ok.m23075h(config, "config");
        super.dd(config);
        t8r(config);
        m8070b();
        MiuiClockView miuiClockView = this.f60351bo;
        if (miuiClockView == null) {
            return true;
        }
        miuiClockView.x2(getCurrentClockBean());
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "magazine_a";
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: h */
    public boolean mo8042h() {
        return !bf2();
    }

    @Override // com.android.thememanager.lockscreen.lock.magazineclock.MagazineSignatureTemplateView, com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        super.jk();
        MiuiClockView miuiClockView = this.f60351bo;
        if (miuiClockView != null) {
            miuiClockView.x2(getCurrentClockBean());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    /* JADX INFO: renamed from: m */
    public boolean mo8057m() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected View mo8046p(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        if (!bf2()) {
            LockScreenInfoLayout lockScreenInfoLayout = new LockScreenInfoLayout(context.getApplicationContext());
            lockScreenInfoLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            setSignatureView(lockScreenInfoLayout);
            return getSignatureView();
        }
        if (this.f60351bo == null) {
            MiuiClockView miuiClockView = new MiuiClockView(context);
            miuiClockView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f60351bo = miuiClockView;
            was wasVar = was.f36763k;
        }
        return this.f60351bo;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new C2102y(context, getCurrentClockBean(), getCurrentSignatureInfo());
    }

    @Override // com.android.thememanager.lockscreen.lock.magazineclock.MagazineSignatureTemplateView, com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        getCurrentClockBean().setStyle(templateConfig.getClockInfo().getStyle());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void wvg() {
        super.wvg();
        MiuiClockView miuiClockView = this.f60351bo;
        if (miuiClockView == null) {
            return;
        }
        miuiClockView.setClockBean(getCurrentClockBean());
    }
}
