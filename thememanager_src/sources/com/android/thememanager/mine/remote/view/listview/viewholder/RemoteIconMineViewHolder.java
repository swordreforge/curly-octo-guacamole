package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.base.view.listview.viewholder.IconMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import p001b.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteIconMineViewHolder extends IconMineViewHolder<BaseRemoteResourceAdapter.toq> {
    public RemoteIconMineViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
    }

    public static RemoteIconMineViewHolder n5r1(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new RemoteIconMineViewHolder(IconMineViewHolder.m8217l(parent, adapter.fn3e()), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseRemoteResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        UIProduct product = item.getProduct();
        this.f12704s.setVisibility(0);
        this.f12704s.setText(product.name);
        this.f12703p.setVisibility(0);
        this.f12703p.setText(C1815m.toq(fn3e(), product.currentPriceInCent));
        x2.m6782y(ki(), product.imageUrl, this.f12705y, this.f12706z);
        if (item.getProduct().manualHide) {
            this.f12702i.setVisibility(0);
            this.f12702i.setText(R.string.has_mamual_hide_icons);
        } else if (item.getProduct().offShelf) {
            this.f12702i.setVisibility(0);
            this.f12702i.setText(R.string.resource_is_off_shelf);
        } else if (item.getProduct().uiVersion >= toq.ki("icons")) {
            this.f12702i.setVisibility(8);
        } else {
            this.f12702i.setVisibility(0);
            this.f12702i.setText(R.string.current_version_incompatible);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        UIProduct product = ((BaseRemoteResourceAdapter.toq) fu4()).getProduct();
        ki().startActivity(com.android.thememanager.toq.ki(ki(), ni7(), product.uuid, product.imageUrl, product.trackId, Boolean.FALSE, product.productType));
        m6706z().d8wk(product.trackId, null);
    }
}
