package com.android.thememanager.settings.presenter;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.n7h;
import com.android.thememanager.recommend.model.entity.element.SettingStaggerLocalBannerGroupElement;
import com.android.thememanager.router.recommend.entity.UIDrawableWithLink;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.settings.ViewOnClickListenerC2517i;
import com.google.gson.kja0;
import ek5k.C6002g;
import java.util.ArrayList;
import java.util.List;
import zkd.InterfaceC7808k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeSettingsPresenter extends BasePresenter<InterfaceC7808k.toq> implements InterfaceC7808k.k {

    /* JADX INFO: renamed from: q */
    private fti<List<Resource>> f15373q = new fti<>();

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2ok() {
        List<Resource> listJk = C2320q.jk("theme");
        n7h.m6950g(listJk);
        this.f15373q.n7h(listJk);
    }

    private retrofit2.toq<CommonResponse<kja0>> jk(int cardStart) {
        return ((z4.zy) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().qrj(z4.zy.class)).m28210y(true, 1, cardStart, 1);
    }

    private void lvui() {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.settings.presenter.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f15403k.d2ok();
            }
        });
    }

    @Override // zkd.InterfaceC7808k.k
    public retrofit2.toq<CommonResponse<kja0>> getLoadMoreCall(int cardStart) {
        return jk(cardStart);
    }

    @Override // zkd.InterfaceC7808k.k
    public retrofit2.toq<CommonResponse<kja0>> getRefreshCall() {
        return jk(0);
    }

    public void oc(@lvui List<UIElement> uiElements) {
        SettingStaggerLocalBannerGroupElement settingStaggerLocalBannerGroupElement = new SettingStaggerLocalBannerGroupElement();
        ArrayList arrayList = new ArrayList(2);
        settingStaggerLocalBannerGroupElement.mBanners = arrayList;
        UIDrawableWithLink uIDrawableWithLink = new UIDrawableWithLink();
        uIDrawableWithLink.drawable = R.drawable.rc_theme_setting_local_banner_all;
        uIDrawableWithLink.title = bf2.toq.toq().getString(R.string.theme_setting_all);
        UILink uILink = new UILink();
        uILink.link = ViewOnClickListenerC2517i.ac;
        uILink.productType = "THEME";
        uILink.title = bf2.toq.toq().getString(R.string.theme_setting_all);
        uILink.trackId = ViewOnClickListenerC2517i.ax;
        uILink.type = "HREF";
        uIDrawableWithLink.link = uILink;
        arrayList.add(uIDrawableWithLink);
        UIDrawableWithLink uIDrawableWithLink2 = new UIDrawableWithLink();
        uIDrawableWithLink2.drawable = R.drawable.rc_theme_setting_local_banner_category;
        uIDrawableWithLink2.title = bf2.toq.toq().getString(R.string.resource_category);
        UILink uILink2 = new UILink();
        uILink2.link = ViewOnClickListenerC2517i.ad;
        uILink2.productType = "THEME";
        uILink2.title = bf2.toq.toq().getString(R.string.resource_category);
        uILink2.trackId = ViewOnClickListenerC2517i.bq;
        uILink2.type = "HREF";
        uIDrawableWithLink2.link = uILink2;
        arrayList.add(uIDrawableWithLink2);
        uiElements.add(0, settingStaggerLocalBannerGroupElement);
    }

    @Override // zkd.InterfaceC7808k.k
    /* JADX INFO: renamed from: s */
    public void mo9134s(InterfaceC0954z owner, jp0y<List<Resource>> observer) {
        this.f15373q.m4391p(owner, observer);
    }

    @Override // com.android.thememanager.basemodule.base.BasePresenter, androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        super.t8r(owner);
        lvui();
    }
}
