package com.android.thememanager.mine.remote.presenter;

import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.base.BasePresenter;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.List;
import retrofit2.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseRemoteResourcePresenter extends BasePresenter<InterfaceC6094k.f7l8> implements InterfaceC6094k.q {

    /* JADX INFO: renamed from: q */
    private String f12823q;

    /* JADX INFO: renamed from: n */
    private int f12822n = 0;

    /* JADX INFO: renamed from: g */
    private int f12821g = 0;

    /* JADX INFO: renamed from: y */
    private int f12824y = 12;

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter$k */
    class C2179k extends AbstractC1777n<PurchasedOrFavoritedCategory> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f12825k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f12827q;

        C2179k(final int val$pageIndex, final boolean val$isLargeIcon) {
            this.f12825k = val$pageIndex;
            this.f12827q = val$isLargeIcon;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui PurchasedOrFavoritedCategory response) {
            if (BaseRemoteResourcePresenter.this.zy() == null) {
                return;
            }
            BaseRemoteResourcePresenter.this.oc(this.f12825k, response);
            if (this.f12827q) {
                BaseRemoteResourcePresenter.this.zy().hb(response.cards, this.f12825k == 0, response.hasMore);
            } else {
                BaseRemoteResourcePresenter.this.zy().e5(response.products, this.f12825k == 0, response.hasMore);
            }
            if (kja0.qrj(response.products)) {
                return;
            }
            BaseRemoteResourcePresenter baseRemoteResourcePresenter = BaseRemoteResourcePresenter.this;
            if ((baseRemoteResourcePresenter instanceof RemoteResourceFavoritePresenter) || (baseRemoteResourcePresenter instanceof RemoteResourceLikePresenter)) {
                for (UIProduct uIProduct : response.products) {
                    if (BaseRemoteResourcePresenter.this instanceof RemoteResourceFavoritePresenter) {
                        C2320q.zy(uIProduct.uuid);
                    } else {
                        C2320q.m8485n(uIProduct.uuid);
                    }
                }
            }
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            if (BaseRemoteResourcePresenter.this.zy() == null) {
                return;
            }
            BaseRemoteResourcePresenter.this.zy().mo8272s();
        }
    }

    public BaseRemoteResourcePresenter(String tabType) {
        this.f12823q = tabType;
    }

    private void lvui(final int pageIndex) {
        boolean zD2ok = d2ok();
        mcp(pageIndex, zD2ok ? this.f12824y : pageIndex == 0 ? 0 : this.f12821g, zD2ok).mo27954p(new C2179k(pageIndex, zD2ok));
    }

    protected boolean d2ok() {
        return "largeicons".equals(this.f12823q);
    }

    protected String jk() {
        return this.f12823q;
    }

    @Override // i9jn.InterfaceC6094k.q
    public void ki() {
        lvui(this.f12822n);
    }

    protected abstract toq<CommonResponse<PurchasedOrFavoritedCategory>> mcp(int pageIndex, int requestedCount, boolean isLargeIcon);

    protected void oc(int pageIndex, PurchasedOrFavoritedCategory response) {
        if (d2ok()) {
            List<UICard> list = response.cards;
            if (list == null || list.size() <= 0) {
                return;
            }
            this.f12822n = pageIndex + this.f12824y;
            return;
        }
        List<UIProduct> list2 = response.products;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f12822n = pageIndex + 1;
        this.f12821g = response.requestedCount;
    }

    @Override // i9jn.InterfaceC6094k.q
    /* JADX INFO: renamed from: z */
    public void mo8265z() {
        lvui(0);
    }
}
