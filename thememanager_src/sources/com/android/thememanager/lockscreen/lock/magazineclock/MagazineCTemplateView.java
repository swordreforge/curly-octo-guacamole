package com.android.thememanager.lockscreen.lock.magazineclock;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.base.EffectsTemplateView;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.C2099p;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.miui.clock.MiuiClockView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: MagazineCTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nMagazineCTemplateView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagazineCTemplateView.kt\ncom/android/thememanager/lockscreen/lock/magazineclock/MagazineCTemplateView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,127:1\n253#2,2:128\n*S KotlinDebug\n*F\n+ 1 MagazineCTemplateView.kt\ncom/android/thememanager/lockscreen/lock/magazineclock/MagazineCTemplateView\n*L\n96#1:128,2\n*E\n"})
public final class MagazineCTemplateView extends EffectsTemplateView {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7395n
    private MiuiClockView f60353bo;

    /* JADX INFO: renamed from: u */
    @InterfaceC7395n
    private MiuiClockView f12378u;

    /* JADX INFO: renamed from: x */
    @InterfaceC7396q
    private final ClockBean f12379x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagazineCTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
        this.f12379x = new ClockBean(AbstractC5074q.f71950jp0y);
    }

    private final void ek5k(ClockInfo clockInfo) {
        getCurrentClockBean().setStyle(clockInfo.getStyle());
        getCurrentClockBean().setPrimaryColor(clockInfo.getPrimaryColor());
        getCurrentClockBean().setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
        getCurrentClockBean().setSecondaryColor(clockInfo.getSecondaryColor());
        getCurrentClockBean().setAutoSecondaryColor(clockInfo.isAutoSecondaryColor());
        this.f12379x.setPrimaryColor(clockInfo.getPrimaryColor());
        this.f12379x.setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
    }

    private final void yz() {
        MiuiClockView miuiClockView = this.f60353bo;
        if (miuiClockView == null) {
            return;
        }
        miuiClockView.setVisibility(!ni7() && getCurrentClockBean().getStyle() != 5 ? 0 : 8);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        d2ok.m23075h(config, "config");
        super.dd(config);
        t8r(config);
        MiuiClockView miuiClockView = this.f12378u;
        if (miuiClockView != null) {
            miuiClockView.x2(getCurrentClockBean());
        }
        MiuiClockView miuiClockView2 = this.f60353bo;
        if (miuiClockView2 != null) {
            miuiClockView2.x2(this.f12379x);
        }
        yz();
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "magazine_c";
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: h */
    public boolean mo8042h() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    public boolean hb() {
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        if (getTemplateConfig() != null) {
            MiuiClockView miuiClockView = this.f12378u;
            if (miuiClockView != null) {
                miuiClockView.x2(getCurrentClockBean());
            }
            MiuiClockView miuiClockView2 = this.f60353bo;
            if (miuiClockView2 != null) {
                miuiClockView2.x2(this.f12379x);
            }
            yz();
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void oc(@InterfaceC7396q ClockInfo clockInfo) {
        d2ok.m23075h(clockInfo, "clockInfo");
        super.oc(clockInfo);
        String templateId = clockInfo.getTemplateId();
        String templateId2 = getCurrentClockBean().getTemplateId();
        d2ok.kja0(templateId2, "getTemplateId(...)");
        if (m8050y(templateId, templateId2)) {
            ek5k(clockInfo);
            wvg();
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: p */
    protected View mo8046p(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        MiuiClockView miuiClockView = new MiuiClockView(context);
        miuiClockView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12378u = miuiClockView;
        return miuiClockView;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new C2099p(context);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        d2ok.m23075h(colorData, "colorData");
        super.mo8049t(colorData);
        MiuiClockView miuiClockView = this.f12378u;
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
        MiuiClockView miuiClockView2 = this.f60353bo;
        if (miuiClockView2 != null) {
            miuiClockView2.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        ek5k(templateConfig.getClockInfo());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void wvg() {
        super.wvg();
        MiuiClockView miuiClockView = this.f12378u;
        if (miuiClockView != null) {
            miuiClockView.setClockBean(getCurrentClockBean());
        }
        MiuiClockView miuiClockView2 = this.f60353bo;
        if (miuiClockView2 != null) {
            miuiClockView2.setClockBean(this.f12379x);
        }
        yz();
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    protected ViewGroup x2(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        MiuiClockView miuiClockView = new MiuiClockView(context);
        miuiClockView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f60353bo = miuiClockView;
        return miuiClockView;
    }
}
