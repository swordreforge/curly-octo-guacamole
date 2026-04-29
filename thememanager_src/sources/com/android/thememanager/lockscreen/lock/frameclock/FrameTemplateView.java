package com.android.thememanager.lockscreen.lock.frameclock;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.SmartFrameInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.base.EffectsTemplateView;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.android.thememanager.lockscreen.lock.color.picker.kja0;
import com.miui.clock.MiuiClockView;
import com.miui.keyguardtemplate.smartframe.SmartFrameView;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: FrameTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FrameTemplateView extends EffectsTemplateView {

    /* JADX INFO: renamed from: x */
    @InterfaceC7395n
    private SmartFrameView f12376x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    private final void ek5k(ClockInfo clockInfo) {
        getCurrentClockBean().setStyle(clockInfo.getStyle());
        getCurrentClockBean().setPrimaryColor(clockInfo.getPrimaryColor());
        getCurrentClockBean().setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        SmartFrameInfo smartFrame;
        d2ok.m23075h(config, "config");
        super.dd(config);
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig != null && (smartFrame = templateConfig.getSmartFrame()) != null) {
            SmartFrameView smartFrameView = this.f12376x;
            if (smartFrameView != null) {
                smartFrameView.setFillColor(smartFrame.getSolidColor());
            }
            SmartFrameView smartFrameView2 = this.f12376x;
            if (smartFrameView2 != null) {
                smartFrameView2.setShape(smartFrame.getShape() + 1);
            }
        }
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "smart_frame";
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        SmartFrameInfo smartFrame;
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig == null || (smartFrame = templateConfig.getSmartFrame()) == null) {
            return;
        }
        SmartFrameView smartFrameView = this.f12376x;
        if (smartFrameView != null) {
            smartFrameView.setFillColor(smartFrame.getSolidColor());
        }
        SmartFrameView smartFrameView2 = this.f12376x;
        if (smartFrameView2 == null) {
            return;
        }
        smartFrameView2.setShape(smartFrame.getShape());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    /* JADX INFO: renamed from: m */
    public boolean mo8057m() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    /* JADX INFO: renamed from: o */
    public boolean mo8058o() {
        return false;
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
        SmartFrameView smartFrameView = new SmartFrameView(context);
        smartFrameView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12376x = smartFrameView;
        return smartFrameView;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new kja0(context);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        SmartFrameInfo smartFrame;
        d2ok.m23075h(colorData, "colorData");
        super.mo8049t(colorData);
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(colorData.getRandomColorType(), false, colorData.getClockPalette());
        }
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig == null || (smartFrame = templateConfig.getSmartFrame()) == null || !smartFrame.isAutoSolidColor()) {
            return;
        }
        smartFrame.setSolidColor(colorData.getSecondaryColor());
        yz();
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        ek5k(templateConfig.getClockInfo());
    }

    public final void yz() {
        SmartFrameInfo smartFrame;
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig == null || (smartFrame = templateConfig.getSmartFrame()) == null) {
            return;
        }
        SmartFrameView smartFrameView = this.f12376x;
        if (smartFrameView != null) {
            smartFrameView.setShape(smartFrame.getShape());
        }
        SmartFrameView smartFrameView2 = this.f12376x;
        if (smartFrameView2 == null) {
            return;
        }
        smartFrameView2.setFillColor(smartFrame.getSolidColor());
    }
}
