package com.android.thememanager.mine.remote.presenter;

import android.text.TextUtils;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.network.theme.AbstractC1770g;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.mine.remote.widget.C2197k;
import i9jn.InterfaceC6094k;
import java.util.Set;
import ltg8.C6780k;
import retrofit2.C7639i;
import retrofit2.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourceLikePresenter extends BaseRemoteResourcePresenter implements InterfaceC6094k.k {

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.presenter.RemoteResourceLikePresenter$k */
    class C2181k extends AbstractC1770g {

        /* JADX INFO: renamed from: y */
        final /* synthetic */ Set f12832y;

        C2181k(final Set val$checkedItemIds) {
            this.f12832y = val$checkedItemIds;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1770g
        /* JADX INFO: renamed from: k */
        protected void mo6885k(int httpCode, int apiCode, String apiMessage, Exception e2) {
            super.mo6885k(httpCode, apiCode, apiMessage, e2);
            if (RemoteResourceLikePresenter.this.zy() == null || !(RemoteResourceLikePresenter.this.zy() instanceof InterfaceC6094k.toq)) {
                return;
            }
            ((InterfaceC6094k.toq) RemoteResourceLikePresenter.this.zy()).kja0();
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1770g
        protected void toq(toq<EmptyResponse> call, C7639i<EmptyResponse> response) {
            if (RemoteResourceLikePresenter.this.zy() == null || !(RemoteResourceLikePresenter.this.zy() instanceof InterfaceC6094k.toq)) {
                return;
            }
            ((InterfaceC6094k.toq) RemoteResourceLikePresenter.this.zy()).ld6(this.f12832y);
            C2320q.m8492x();
        }
    }

    public RemoteResourceLikePresenter(String tabType) {
        super(tabType);
    }

    @Override // i9jn.InterfaceC6094k.k
    /* JADX INFO: renamed from: k */
    public void mo8268k(@lvui Set<String> checkedItemIds) {
        if (checkedItemIds.size() == 0) {
            return;
        }
        ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).m24735q(TextUtils.join(",", checkedItemIds.toArray())).mo27954p(new C2181k(checkedItemIds));
    }

    @Override // com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter
    protected toq<CommonResponse<PurchasedOrFavoritedCategory>> mcp(int pageIndex, int requestedCount, boolean isLargeIcon) {
        String str = C6780k.f37687k.get(jk());
        boolean zM8291q = C2197k.m8291q(bf2.toq.toq(), "like", jk());
        return isLargeIcon ? ((ltg8.toq) f7l8.m6882h().toq(ltg8.toq.class)).m24734p(str, pageIndex, requestedCount, zM8291q) : ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).x2(str, pageIndex, requestedCount, zM8291q);
    }
}
