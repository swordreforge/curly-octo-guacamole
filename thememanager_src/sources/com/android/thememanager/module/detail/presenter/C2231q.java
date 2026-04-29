package com.android.thememanager.module.detail.presenter;

import android.app.Application;
import androidx.lifecycle.fti;
import com.android.thememanager.basemodule.base.C1723y;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.router.recommend.entity.UIPage;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.q */
/* JADX INFO: compiled from: IconsDetailPresenter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2231q extends C2226h {
    public final fti<C1723y<Boolean>> yl25;

    public C2231q(Application app) {
        super(app);
        this.yl25 = new fti<>();
    }

    @Override // com.android.thememanager.module.detail.presenter.qrj, c8jq.InterfaceC1392k.toq
    public void apply() {
        Resource resourceZy = this.f13094h;
        if (!com.android.thememanager.basemodule.utils.kja0.qrj(resourceZy.getParentResources())) {
            resourceZy = C1792n.zy(this.f13094h.getParentResources().get(0), C1791k.getInstance("theme"));
        }
        if (!C1792n.ni7(resourceZy, "wallpaper") || C1807g.m7081r()) {
            y9n(false, false, false);
        } else {
            this.yl25.cdj(new C1723y<>(Boolean.TRUE));
        }
    }

    @Override // com.android.thememanager.module.detail.presenter.C2226h
    /* JADX INFO: renamed from: do */
    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> mo28256do(int randIndex) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateIcon(randIndex, 0, this.f13109z.packId);
    }

    @Override // com.android.thememanager.module.detail.presenter.C2226h
    public retrofit2.toq<CommonResponse<UIPage>> ixz(int randIndex, int cardStart) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRecommendIcon(randIndex, cardStart);
    }

    @Override // com.android.thememanager.module.detail.presenter.C2226h
    public retrofit2.toq<CommonResponse<com.google.gson.kja0>> wx16(int randIndex, int cardStart) {
        return ((DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class)).getRelateIcon(randIndex, cardStart, this.f13109z.packId);
    }
}
