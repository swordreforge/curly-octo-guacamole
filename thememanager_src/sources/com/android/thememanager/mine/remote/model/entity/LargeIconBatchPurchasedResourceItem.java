package com.android.thememanager.mine.remote.model.entity;

import android.view.Menu;
import android.view.MenuItem;
import com.android.thememanager.R;
import com.android.thememanager.router.recommend.entity.UIProduct;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconBatchPurchasedResourceItem extends LargeIconRemoteBatchItem {
    public LargeIconBatchPurchasedResourceItem(int type, String packageName, UIProduct r2) {
        super(type, packageName, r2);
    }

    @Override // com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem, com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter.toq, com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
    public boolean canChecked(Menu menu) {
        if (menu == null) {
            return false;
        }
        MenuItem item = menu.getItem(0);
        if (getProduct() != null) {
            return item.getItemId() == R.string.resource_restore ? getProduct().manualHide : !getProduct().manualHide;
        }
        return false;
    }
}
