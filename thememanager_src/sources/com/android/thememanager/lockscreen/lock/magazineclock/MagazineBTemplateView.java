package com.android.thememanager.lockscreen.lock.magazineclock;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.color.picker.AbstractC2097k;
import com.android.thememanager.lockscreen.lock.color.picker.C2101s;
import com.android.thememanager.lockscreen.lock.color.picker.ColorData;
import com.miui.clock.MiuiClockView;
import com.miui.lockscreeninfo.LockScreenInfoLayout;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: compiled from: MagazineBTemplateView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MagazineBTemplateView extends MagazineSignatureTemplateView {

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @InterfaceC7395n
    private MiuiClockView f60352bo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagazineBTemplateView(@InterfaceC7396q Context context) {
        super(context);
        d2ok.m23075h(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    /* JADX INFO: renamed from: bf2, reason: merged with bridge method [inline-methods] */
    public ViewGroup mo8046p(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        MiuiClockView miuiClockView = new MiuiClockView(context);
        miuiClockView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f60352bo = miuiClockView;
        return miuiClockView;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @hyr(33)
    public boolean dd(@InterfaceC7396q TemplateConfig config) {
        d2ok.m23075h(config, "config");
        super.dd(config);
        t8r(config);
        m8070b();
        MiuiClockView miuiClockView = this.f60352bo;
        if (miuiClockView == null) {
            return true;
        }
        miuiClockView.x2(getCurrentClockBean());
        return true;
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7396q
    public String getClockStyleType() {
        return "magazine_b";
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: h */
    public boolean mo8042h() {
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.magazineclock.MagazineSignatureTemplateView, com.android.thememanager.lockscreen.lock.base.EffectsTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    protected void jk() {
        super.jk();
        MiuiClockView miuiClockView = this.f60352bo;
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
    /* JADX INFO: renamed from: s */
    protected AbstractC2097k mo8048s() {
        Context context = getContext();
        d2ok.kja0(context, "getContext(...)");
        return new C2101s(context);
    }

    @Override // com.android.thememanager.lockscreen.lock.magazineclock.MagazineSignatureTemplateView, com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    /* JADX INFO: renamed from: t */
    public void mo8049t(@InterfaceC7396q ColorData colorData) {
        d2ok.m23075h(colorData, "colorData");
        super.mo8049t(colorData);
        MiuiClockView miuiClockView = this.f60352bo;
        if (miuiClockView != null) {
            miuiClockView.setClockPalette(0, colorData.getDarkClockArea(), colorData.getClockPalette());
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    public void wvg() {
        super.wvg();
        MiuiClockView miuiClockView = this.f60352bo;
        if (miuiClockView == null) {
            return;
        }
        miuiClockView.setClockBean(getCurrentClockBean());
    }

    @Override // com.android.thememanager.lockscreen.lock.base.BaseTemplateView
    @InterfaceC7395n
    protected ViewGroup x2(@InterfaceC7396q Context context, @InterfaceC7395n TemplateConfig templateConfig) {
        d2ok.m23075h(context, "context");
        LockScreenInfoLayout lockScreenInfoLayout = new LockScreenInfoLayout(context.getApplicationContext());
        lockScreenInfoLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setSignatureView(lockScreenInfoLayout);
        return getSignatureView();
    }
}
