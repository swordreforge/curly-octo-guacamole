package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.base.view.listview.viewholder.AodMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import p001b.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteAodMineViewHolder extends AodMineViewHolder<BaseRemoteResourceAdapter.toq> {
    public RemoteAodMineViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
    }

    public static RemoteAodMineViewHolder n5r1(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new RemoteAodMineViewHolder(AodMineViewHolder.m8216l(parent, adapter.fn3e()), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseRemoteResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        UIProduct product = item.getProduct();
        this.f12698s.setVisibility(0);
        this.f12698s.setText(product.name);
        this.f12697p.setText(C1815m.toq(fn3e(), product.purchasedPriceInCent));
        x2.m6782y(ki(), product.imageUrl, this.f12699y, this.f12700z.m6793r(x2.ki(position, 0.0f)));
        String str = item.getProduct().productType;
        if (str == null) {
            str = "AOD";
        }
        String strZy = toq.zy(str);
        if (TextUtils.isEmpty(strZy)) {
            return;
        }
        if (item.getProduct().manualHide) {
            this.f12695h.setVisibility(0);
            this.f12695h.setText(R.string.has_mamual_hide_aod);
        } else if (item.getProduct().offShelf) {
            this.f12695h.setVisibility(0);
            this.f12695h.setText(R.string.resource_is_off_shelf);
        } else if (item.getProduct().uiVersion >= toq.ki(strZy)) {
            this.f12695h.setVisibility(8);
        } else {
            this.f12695h.setVisibility(0);
            this.f12695h.setText(R.string.current_version_incompatible);
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
