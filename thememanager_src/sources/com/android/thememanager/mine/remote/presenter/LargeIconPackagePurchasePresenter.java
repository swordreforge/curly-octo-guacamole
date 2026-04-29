package com.android.thememanager.mine.remote.presenter;

import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.mine.remote.widget.C2197k;
import ltg8.C6780k;
import retrofit2.toq;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconPackagePurchasePresenter extends RemoteResourcePurchasedPresenter {

    /* JADX INFO: renamed from: h */
    private String f12828h;

    public LargeIconPackagePurchasePresenter(String tabType, String packageName) {
        super(tabType);
        this.f12828h = packageName;
    }

    @Override // com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter
    protected boolean d2ok() {
        return false;
    }

    @Override // com.android.thememanager.mine.remote.presenter.RemoteResourcePurchasedPresenter
    /* JADX INFO: renamed from: l */
    protected boolean mo8267l() {
        return false;
    }

    @Override // com.android.thememanager.mine.remote.presenter.RemoteResourcePurchasedPresenter, com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter
    protected toq<CommonResponse<PurchasedOrFavoritedCategory>> mcp(int pageIndex, int requestedCount, boolean isLargeIcon) {
        return ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).zy(C6780k.f37687k.get("largeicons"), pageIndex, requestedCount, C2197k.m8291q(bf2.toq.toq(), C2197k.f12943s, jk()), C2197k.zy(bf2.toq.toq(), C2197k.f12943s, jk()), this.f12828h, C2197k.m8288g(bf2.toq.toq(), C2197k.f12943s, jk()));
    }
}
