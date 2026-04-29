package com.android.thememanager.module.detail.presenter;

import androidx.lifecycle.fti;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.detail.theme.model.DetailRequestInterface;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIPage;
import retrofit2.C7639i;
import retrofit2.InterfaceC7648q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.y */
/* JADX INFO: compiled from: OnlineDetailViewModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2241y extends com.android.thememanager.module.detail.presenter.toq {

    /* JADX INFO: renamed from: p */
    private final fti<OnlineResourceDetail> f13137p = new fti<>();

    /* JADX INFO: renamed from: h */
    private final fti<UICard> f13136h = new fti<>();

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.y$toq */
    /* JADX INFO: compiled from: OnlineDetailViewModel.java */
    private static class toq implements InterfaceC7648q<CommonResponse<UIPage>> {

        /* JADX INFO: renamed from: k */
        private final C2241y f13138k;

        public toq(C2241y viewModel) {
            this.f13138k = viewModel;
        }

        @Override // retrofit2.InterfaceC7648q
        public void onFailure(retrofit2.toq<CommonResponse<UIPage>> call, Throwable t2) {
        }

        @Override // retrofit2.InterfaceC7648q
        public void onResponse(retrofit2.toq<CommonResponse<UIPage>> call, C7639i<CommonResponse<UIPage>> response) {
            if (com.android.thememanager.basemodule.network.theme.toq.m6892k(response)) {
                this.f13138k.m8362c().cdj(response.m27986k().apiData.cards.get(0));
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.module.detail.presenter.y$zy */
    /* JADX INFO: compiled from: OnlineDetailViewModel.java */
    private static class zy extends AbstractC1777n<OnlineResourceDetail> {

        /* JADX INFO: renamed from: k */
        private final C2241y f13139k;

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui OnlineResourceDetail response) {
            this.f13139k.lrht().cdj(response);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            this.f13139k.lrht().cdj(null);
        }

        private zy(C2241y viewModel) {
            this.f13139k = viewModel;
        }
    }

    /* JADX INFO: renamed from: c */
    public fti<UICard> m8362c() {
        return this.f13136h;
    }

    public fti<OnlineResourceDetail> lrht() {
        return this.f13137p;
    }

    public void uv6(String onlineId) {
        if (this.f13137p.m4388g() != null) {
            return;
        }
        DetailRequestInterface detailRequestInterface = (DetailRequestInterface) com.android.thememanager.basemodule.network.theme.f7l8.m6882h().toq(DetailRequestInterface.class);
        boolean z2 = o1t.cdj() && a9.m6999s("miui.systemui.plugin");
        (C1688q.cdj().o1t() ? detailRequestInterface.getSafeResourceDetail(onlineId, z2) : detailRequestInterface.getResourceDetail(onlineId, z2)).mo27954p(new zy());
    }

    public void vyq(retrofit2.toq<CommonResponse<UIPage>> mRecommendCall) {
        if (m8362c().m4388g() == null && mRecommendCall != null) {
            mRecommendCall.mo27954p(new toq(this));
        }
    }
}
