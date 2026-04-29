package com.android.thememanager.lockscreen.lock.rhombusclock;

import android.content.Context;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.base.EffectsTemplateView;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.android.thememanager.lockscreen.lock.color.picker.qrj;
import com.miui.clock.MiuiClockView;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: RhombusTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RhombusTemplateView extends EffectsTemplateView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhombusTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    private final void ek5k(ClockInfo clockInfo) {
        getCurrentClockBean().setStyle(clockInfo.getStyle());
        getCurrentClockBean().setPrimaryColor(clockInfo.getPrimaryColor());
        getCurrentClockBean().setSecondaryColor(clockInfo.getSecondaryColor());
        getCurrentClockBean().setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
        getCurrentClockBean().setAutoSecondaryColor(clockInfo.isAutoSecondaryColor());
        getCurrentClockBean().setDiffHourMinuteColor(clockInfo.isDiffHourMinuteColor());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "rhombus";
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
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new qrj(context);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        d2ok.m23075h(colorData, "colorData");
        super.mo8049t(colorData);
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
        MiuiClockView miuiClockView2 = getMiuiClockView();
        if (miuiClockView2 != null) {
            miuiClockView2.setInfoTextColorDark(colorData.getDarkInfoText());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        ek5k(templateConfig.getClockInfo());
    }
}
