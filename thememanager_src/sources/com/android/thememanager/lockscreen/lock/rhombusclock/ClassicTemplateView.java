package com.android.thememanager.lockscreen.lock.rhombusclock;

import android.content.Context;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.base.EffectsTemplateView;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.android.thememanager.lockscreen.lock.color.picker.zy;
import com.miui.clock.MiuiClockView;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ClassicTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public class ClassicTemplateView extends EffectsTemplateView {

    /* JADX INFO: renamed from: x */
    @InterfaceC7395n
    private MiuiClockView f12387x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassicTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    private final void yz(ClockInfo clockInfo) {
        getCurrentClockBean().setStyle(clockInfo.getStyle());
        getCurrentClockBean().setPrimaryColor(clockInfo.getPrimaryColor());
        getCurrentClockBean().setSecondaryColor(clockInfo.getSecondaryColor());
        getCurrentClockBean().setClassicLine1(clockInfo.getClassicLine1());
        getCurrentClockBean().setClassicLine2(clockInfo.getClassicLine2());
        getCurrentClockBean().setClassicLine3(clockInfo.getClassicLine3());
        getCurrentClockBean().setClassicLine4(clockInfo.getClassicLine4());
        getCurrentClockBean().setClassicLine5(12);
        getCurrentClockBean().setClassicSignature(clockInfo.getClassicSignature());
        getCurrentClockBean().setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
        getCurrentClockBean().setAutoSecondaryColor(clockInfo.isAutoSecondaryColor());
        getCurrentClockBean().setDiffHourMinuteColor(clockInfo.isDiffHourMinuteColor());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: ek5k, reason: merged with bridge method [inline-methods] */
    public ViewGroup mo8046p(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        MiuiClockView miuiClockView = new MiuiClockView(context);
        miuiClockView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12387x = miuiClockView;
        return miuiClockView;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "classic";
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: h */
    public boolean mo8042h() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        super.jk();
        MiuiClockView miuiClockView = this.f12387x;
        if (miuiClockView != null) {
            miuiClockView.x2(getCurrentClockBean());
        }
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
            yz(clockInfo);
            wvg();
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new zy(context);
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        d2ok.m23075h(colorData, "colorData");
        super.mo8049t(colorData);
        Log.d(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "ClassicTemplateView color pick complete darkClockArea：" + colorData.getDarkClockArea());
        MiuiClockView miuiClockView = this.f12387x;
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        yz(templateConfig.getClockInfo());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void wvg() {
        super.wvg();
        MiuiClockView miuiClockView = this.f12387x;
        if (miuiClockView == null) {
            return;
        }
        miuiClockView.setClockBean(getCurrentClockBean());
    }
}
