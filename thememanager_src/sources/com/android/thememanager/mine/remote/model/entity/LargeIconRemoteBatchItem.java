package com.android.thememanager.mine.remote.model.entity;

import android.view.Menu;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import was.InterfaceC7730k;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconRemoteBatchItem extends BaseRemoteResourceAdapter.toq implements InterfaceC7730k {
    public String packageName;
    public int type;

    public LargeIconRemoteBatchItem(int type, String packageName, UIProduct r2) {
        super(r2);
        this.type = type;
        this.packageName = packageName;
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter.toq, com.android.thememanager.basemodule.views.BatchOperationAdapter.toq
    public boolean canChecked(Menu menu) {
        return this.type != 1;
    }
}
