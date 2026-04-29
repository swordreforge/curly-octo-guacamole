package com.android.thememanager.module.detail.presenter;

import android.app.Application;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.router.recommend.entity.UIPage;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.h */
/* JADX INFO: compiled from: SingleModuleDetailPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2226h extends qrj {
    public C2226h(Application app) {
        super(app);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> mo28256do(int randIndex) {
        return null;
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj
    protected boolean gbni() {
        return !"theme".equals(C1792n.m6942o(this.f13094h));
    }

    public retrofit2.toq<CommonResponse<UIPage>> ixz(int randIndex, int cardStart) {
        if ("fonts".equals(this.f13103t)) {
            return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRecommendFont(randIndex, cardStart);
        }
        return null;
    }

    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> wx16(int randIndex, int cardStart) {
        return null;
    }
}
