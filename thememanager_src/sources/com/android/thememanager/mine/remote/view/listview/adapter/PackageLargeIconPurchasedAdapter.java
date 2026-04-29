package com.android.thememanager.mine.remote.view.listview.adapter;

import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i9jn.InterfaceC6094k;

/* JADX INFO: loaded from: classes2.dex */
public class PackageLargeIconPurchasedAdapter extends RemoteResourcePurchasedAdapter {
    public PackageLargeIconPurchasedAdapter(InterfaceC1719p viewContainer, String tabType, InterfaceC6094k.q presenter) {
        super(viewContainer, tabType, presenter);
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if ("message_header_id".equals(((BaseRemoteResourceAdapter.toq) this.f9846q.get(position)).getId())) {
            return 5;
        }
        return ((LargeIconRemoteBatchItem) this.f9846q.get(position)).type == 1 ? 8 : 9;
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter, com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter
    protected BaseRemoteResourceAdapter.toq xwq3(UIProduct product) {
        return dr(0, "", product);
    }
}
