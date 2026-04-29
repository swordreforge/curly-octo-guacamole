package com.android.thememanager.mine.remote.presenter;

import android.text.TextUtils;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.network.theme.AbstractC1777n;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.PostResult;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.mine.remote.widget.C2197k;
import i9jn.InterfaceC6094k;
import java.util.Set;
import ltg8.C6780k;
import ltg8.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourceFavoritePresenter extends BaseRemoteResourcePresenter implements InterfaceC6094k.k {

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.presenter.RemoteResourceFavoritePresenter$k */
    class C2180k extends AbstractC1777n<PostResult> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f12829k;

        C2180k(final Set val$checkedItemIds) {
            this.f12829k = val$checkedItemIds;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void onResponse(@lvui PostResult response) {
            if (RemoteResourceFavoritePresenter.this.zy() == null || !(RemoteResourceFavoritePresenter.this.zy() instanceof InterfaceC6094k.toq)) {
                return;
            }
            if (!response.isSuccess()) {
                ((InterfaceC6094k.toq) RemoteResourceFavoritePresenter.this.zy()).kja0();
            } else {
                ((InterfaceC6094k.toq) RemoteResourceFavoritePresenter.this.zy()).ld6(this.f12829k);
                C2320q.m8492x();
            }
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1777n
        public void onFailure(int httpCode, int apiCode, String message, Exception e2) {
            super.onFailure(httpCode, apiCode, message, e2);
            if (RemoteResourceFavoritePresenter.this.zy() == null || !(RemoteResourceFavoritePresenter.this.zy() instanceof InterfaceC6094k.toq)) {
                return;
            }
            ((InterfaceC6094k.toq) RemoteResourceFavoritePresenter.this.zy()).kja0();
        }
    }

    public RemoteResourceFavoritePresenter(String tabType) {
        super(tabType);
    }

    @Override // i9jn.InterfaceC6094k.k
    /* JADX INFO: renamed from: k */
    public void mo8268k(@lvui Set<String> checkedItemIds) {
        if (checkedItemIds.size() == 0) {
            return;
        }
        ((toq) f7l8.m6882h().qrj(toq.class)).m24732k(TextUtils.join(",", checkedItemIds.toArray()), C6780k.f37687k.get(jk())).mo27954p(new C2180k(checkedItemIds));
    }

    @Override // com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter
    protected retrofit2.toq<CommonResponse<PurchasedOrFavoritedCategory>> mcp(int pageIndex, int requestedCount, boolean isLargeIcon) {
        String str = C6780k.f37687k.get(jk());
        boolean zM8291q = C2197k.m8291q(bf2.toq.toq(), "favorite", jk());
        return isLargeIcon ? ((toq) f7l8.m6882h().toq(toq.class)).ld6(pageIndex, requestedCount, str, zM8291q, false) : ((toq) f7l8.m6882h().qrj(toq.class)).qrj(str, pageIndex, requestedCount, zM8291q);
    }
}
