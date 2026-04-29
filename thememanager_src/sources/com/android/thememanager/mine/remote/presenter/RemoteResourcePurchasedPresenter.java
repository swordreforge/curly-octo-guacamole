package com.android.thememanager.mine.remote.presenter;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.thememanager.basemodule.network.theme.AbstractC1770g;
import com.android.thememanager.basemodule.network.theme.f7l8;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.network.theme.model.EmptyResponse;
import com.android.thememanager.mine.remote.model.entity.PurchasedOrFavoritedCategory;
import com.android.thememanager.mine.remote.widget.C2197k;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.List;
import java.util.Set;
import ltg8.C6780k;
import retrofit2.C7639i;
import retrofit2.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourcePurchasedPresenter extends BaseRemoteResourcePresenter implements InterfaceC6094k.n {

    /* JADX INFO: renamed from: p */
    private static final String f12833p = "has_perform_hide";

    /* JADX INFO: renamed from: s */
    private static final String f12834s = "hide_pref";

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.presenter.RemoteResourcePurchasedPresenter$k */
    class C2182k extends AbstractC1770g {

        /* JADX INFO: renamed from: s */
        final /* synthetic */ Set f12836s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ boolean f12837y;

        C2182k(final boolean val$hide, final Set val$checkedItemIds) {
            this.f12837y = val$hide;
            this.f12836s = val$checkedItemIds;
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1770g
        /* JADX INFO: renamed from: k */
        protected void mo6885k(int httpCode, int apiCode, String apiMessage, Exception e2) {
            super.mo6885k(httpCode, apiCode, apiMessage, e2);
            if (RemoteResourcePurchasedPresenter.this.zy() == null || !(RemoteResourcePurchasedPresenter.this.zy() instanceof InterfaceC6094k.g)) {
                return;
            }
            ((InterfaceC6094k.g) RemoteResourcePurchasedPresenter.this.zy()).ngy(this.f12837y);
        }

        @Override // com.android.thememanager.basemodule.network.theme.AbstractC1770g
        protected void toq(toq<EmptyResponse> call, C7639i<EmptyResponse> response) {
            if (RemoteResourcePurchasedPresenter.this.zy() == null || !(RemoteResourcePurchasedPresenter.this.zy() instanceof InterfaceC6094k.g)) {
                return;
            }
            ((InterfaceC6094k.g) RemoteResourcePurchasedPresenter.this.zy()).xwq3(this.f12837y, this.f12836s);
        }
    }

    public RemoteResourcePurchasedPresenter(String tabType) {
        super(tabType);
    }

    private String dd() {
        return "wallpaper".equals(jk()) ? C6780k.f37687k.get("miwallpaper") : C6780k.f37687k.get(jk());
    }

    public static void ncyb() {
        SharedPreferences.Editor editorEdit = bf2.toq.toq().getSharedPreferences(f12834s, 0).edit();
        editorEdit.putBoolean(f12833p, true);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: r */
    private void m8270r(@lvui final Set<String> checkedItemIds, final boolean hide) {
        if (checkedItemIds.size() == 0) {
            return;
        }
        ltg8.toq toqVar = (ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class);
        String strJoin = TextUtils.join(",", checkedItemIds.toArray());
        (hide ? toqVar.toq(dd(), strJoin) : toqVar.m24737y(dd(), strJoin)).mo27954p(new C2182k(hide, checkedItemIds));
    }

    public static boolean x9kr() {
        return bf2.toq.toq().getSharedPreferences(f12834s, 0).getBoolean(f12833p, false);
    }

    @Override // i9jn.InterfaceC6094k.n
    /* JADX INFO: renamed from: g */
    public void mo8271g(@lvui Set<String> checkedItemIds) {
        m8270r(checkedItemIds, true);
    }

    /* JADX INFO: renamed from: l */
    protected boolean mo8267l() {
        return !"widget_suit".equals(jk());
    }

    @Override // i9jn.InterfaceC6094k.n
    public void ld6(@lvui Set<String> checkedItemIds) {
        m8270r(checkedItemIds, false);
    }

    @Override // com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter
    protected toq<CommonResponse<PurchasedOrFavoritedCategory>> mcp(int pageIndex, int requestedCount, boolean isLargeIcon) {
        boolean zM8291q = C2197k.m8291q(bf2.toq.toq(), C2197k.f12943s, jk());
        boolean zZy = C2197k.zy(bf2.toq.toq(), C2197k.f12943s, jk());
        boolean zM8288g = C2197k.m8288g(bf2.toq.toq(), C2197k.f12943s, jk());
        return isLargeIcon ? ((ltg8.toq) f7l8.m6882h().toq(ltg8.toq.class)).m24731g(pageIndex, requestedCount, C6780k.f37687k.get(jk()), false, zM8288g, false) : ((ltg8.toq) f7l8.m6882h().qrj(ltg8.toq.class)).m24736s(dd(), pageIndex, requestedCount, zM8291q, zZy, zM8288g);
    }

    @Override // com.android.thememanager.mine.remote.presenter.BaseRemoteResourcePresenter
    protected void oc(int pageIndex, PurchasedOrFavoritedCategory response) {
        List<UIProduct> list;
        super.oc(pageIndex, response);
        if (!mo8267l() || pageIndex != 0 || x9kr() || (list = response.products) == null || list.isEmpty()) {
            return;
        }
        UIProduct uIProduct = new UIProduct();
        uIProduct.uuid = "message_header_id";
        response.products.add(0, uIProduct);
    }
}
