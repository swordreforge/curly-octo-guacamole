package com.android.thememanager.mine.remote.view.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.mine.remote.presenter.RemoteResourcePurchasedPresenter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;
import java.util.List;
import java.util.Set;
import zy.lvui;

/* JADX INFO: compiled from: RemoteResourcePurchasedTabFragment.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends zy implements InterfaceC6094k.g {

    /* JADX INFO: renamed from: com.android.thememanager.mine.remote.view.fragment.f7l8$k */
    /* JADX INFO: compiled from: RemoteResourcePurchasedTabFragment.java */
    class C2185k extends GridLayoutManager.zy {
        C2185k() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            if (position == 0 && f7l8.this.bqie()) {
                return f7l8.this.f12869o.ld6();
            }
            return 1;
        }
    }

    private void vwb() {
        this.f12869o.fn3e(new C2185k());
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy, i9jn.InterfaceC6094k.f7l8
    public void e5(List<UIProduct> products, boolean refresh, boolean hasMore) {
        if (refresh && products != null && !products.isEmpty() && "message_header_id".equals(products.get(0).uuid)) {
            vwb();
        }
        super.e5(products, refresh, hasMore);
    }

    @Override // com.android.thememanager.basemodule.base.InterfaceC1720q.toq
    @lvui
    /* JADX INFO: renamed from: mi1u, reason: merged with bridge method [inline-methods] */
    public InterfaceC6094k.q uv6() {
        return new RemoteResourcePurchasedPresenter(wt());
    }

    @Override // i9jn.InterfaceC6094k.g
    public void ngy(boolean hide) {
        nn86.m7150k(hide ? R.string.resource_hide_fail : R.string.resource_restore_fail, 0);
        this.f12868m.i1();
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy
    protected BaseRemoteResourceAdapter r6ty() {
        return new RemoteResourcePurchasedAdapter(this, wt(), kiv());
    }

    @Override // i9jn.InterfaceC6094k.g
    public void xwq3(boolean hide, Set<String> itemIds) {
        nn86.m7150k(hide ? R.string.resource_hide_succ : R.string.resource_restore_succ, 0);
        for (T t2 : this.f12868m.ni7()) {
            if (itemIds.contains(t2.getId())) {
                t2.getProduct().manualHide = hide;
            }
        }
        this.f12868m.notifyDataSetChanged();
        this.f12868m.i1();
    }

    @Override // com.android.thememanager.mine.remote.view.fragment.zy, com.android.thememanager.basemodule.views.BatchOperationAdapter.zy
    public void zy() {
        super.zy();
        if (RemoteResourcePurchasedPresenter.x9kr()) {
            return;
        }
        RemoteResourcePurchasedPresenter.ncyb();
    }
}
