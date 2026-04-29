package com.android.thememanager.lockscreen.lock.magazineclock;

import android.content.Context;
import com.android.thememanager.lockscreen.lock.ClockInfo;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.base.EffectsTemplateView;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.miui.clock.MiuiClockView;
import com.miui.lockscreeninfo.LockScreenInfoLayout;
import com.miui.lockscreeninfo.model.ModelFactory;
import com.miui.lockscreeninfo.model.SignatureInfo;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MagazineSignatureTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nMagazineSignatureTemplateView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagazineSignatureTemplateView.kt\ncom/android/thememanager/lockscreen/lock/magazineclock/MagazineSignatureTemplateView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,109:1\n253#2,2:110\n*S KotlinDebug\n*F\n+ 1 MagazineSignatureTemplateView.kt\ncom/android/thememanager/lockscreen/lock/magazineclock/MagazineSignatureTemplateView\n*L\n73#1:110,2\n*E\n"})
public abstract class MagazineSignatureTemplateView extends EffectsTemplateView {

    /* JADX INFO: renamed from: u */
    @InterfaceC7395n
    private LockScreenInfoLayout f12380u;

    /* JADX INFO: renamed from: x */
    @InterfaceC7396q
    private final SignatureInfo f12381x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagazineSignatureTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
        SignatureInfo signatureInfoCreateModel = ModelFactory.createModel(getClockStyleType());
        d2ok.kja0(signatureInfoCreateModel, "createModel(...)");
        this.f12381x = signatureInfoCreateModel;
    }

    private final void ek5k(ClockInfo clockInfo) {
        getCurrentClockBean().setStyle(clockInfo.getStyle());
        getCurrentClockBean().setPrimaryColor(clockInfo.getPrimaryColor());
        getCurrentClockBean().setAutoPrimaryColor(clockInfo.isAutoPrimaryColor());
        getCurrentClockBean().setSecondaryColor(clockInfo.getSecondaryColor());
        getCurrentClockBean().setAutoSecondaryColor(clockInfo.isAutoSecondaryColor());
    }

    private final void yz(com.android.thememanager.lockscreen.lock.SignatureInfo signatureInfo) {
        this.f12381x.setContent(signatureInfo.getContent());
        this.f12381x.setAlignment(signatureInfo.getAlignment());
        this.f12381x.setPrimaryColor(signatureInfo.getPrimaryColor());
        this.f12381x.setAutoPrimaryColor(signatureInfo.isAutoPrimaryColor());
    }

    /* JADX INFO: renamed from: b */
    public void m8070b() {
        LockScreenInfoLayout lockScreenInfoLayout = this.f12380u;
        if (lockScreenInfoLayout != null) {
            lockScreenInfoLayout.setModel(this.f12381x);
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: g */
    protected void mo8041g() {
        com.android.thememanager.lockscreen.lock.SignatureInfo signatureInfo;
        super.mo8041g();
        TemplateConfig templateConfig = getTemplateConfig();
        if (templateConfig == null || (signatureInfo = templateConfig.getSignatureInfo()) == null) {
            return;
        }
        String content = this.f12381x.getContent();
        d2ok.kja0(content, "getContent(...)");
        signatureInfo.setContent(content);
        signatureInfo.setAlignment(this.f12381x.getAlignment());
        signatureInfo.setPrimaryColor(this.f12381x.getPrimaryColor());
        signatureInfo.setAutoPrimaryColor(this.f12381x.isAutoPrimaryColor());
    }

    @InterfaceC7396q
    protected final SignatureInfo getCurrentSignatureInfo() {
        return this.f12381x;
    }

    @InterfaceC7395n
    protected final LockScreenInfoLayout getSignatureView() {
        return this.f12380u;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView
    public boolean hb() {
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        super.jk();
        LockScreenInfoLayout lockScreenInfoLayout = this.f12380u;
        if (lockScreenInfoLayout != null) {
            if (ni7()) {
                LockScreenInfoLayout lockScreenInfoLayout2 = this.f12380u;
                d2ok.qrj(lockScreenInfoLayout2);
                lockScreenInfoLayout2.setVisibility(8);
            } else if (getTemplateConfig() != null) {
                lockScreenInfoLayout.setModel(this.f12381x);
            }
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
    /* JADX INFO: renamed from: r */
    public void mo8047r(@InterfaceC7396q com.android.thememanager.lockscreen.lock.SignatureInfo signatureInfo) {
        d2ok.m23075h(signatureInfo, "signatureInfo");
        super.mo8047r(signatureInfo);
        yz(signatureInfo);
        m8070b();
    }

    protected final void setSignatureView(@InterfaceC7395n LockScreenInfoLayout lockScreenInfoLayout) {
        this.f12380u = lockScreenInfoLayout;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        LockScreenInfoLayout lockScreenInfoLayout;
        d2ok.m23075h(colorData, "colorData");
        super.mo8049t(colorData);
        if (y9n() && (lockScreenInfoLayout = this.f12380u) != null) {
            lockScreenInfoLayout.setClockPalette(colorData.getDarkSignatureArea(), colorData.getSignaturePalette());
        }
        MiuiClockView miuiClockView = getMiuiClockView();
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void t8r(@InterfaceC7396q TemplateConfig templateConfig) {
        d2ok.m23075h(templateConfig, "templateConfig");
        super.t8r(templateConfig);
        com.android.thememanager.lockscreen.lock.SignatureInfo signatureInfo = templateConfig.getSignatureInfo();
        if (signatureInfo != null) {
            this.f12381x.setContent(signatureInfo.getContent());
            this.f12381x.setAlignment(signatureInfo.getAlignment());
            this.f12381x.setPrimaryColor(signatureInfo.getPrimaryColor());
            this.f12381x.setAutoPrimaryColor(signatureInfo.isAutoPrimaryColor());
        }
        ek5k(templateConfig.getClockInfo());
    }

    protected boolean y9n() {
        com.android.thememanager.lockscreen.lock.SignatureInfo signatureInfo;
        TemplateConfig templateConfig = getTemplateConfig();
        Boolean boolValueOf = (templateConfig == null || (signatureInfo = templateConfig.getSignatureInfo()) == null) ? null : Boolean.valueOf(signatureInfo.isAutoPrimaryColor());
        d2ok.n7h(boolValueOf, "null cannot be cast to non-null type kotlin.Boolean");
        return boolValueOf.booleanValue();
    }
}
