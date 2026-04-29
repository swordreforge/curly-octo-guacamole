package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.t8r;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.model.entity.LargeIconBatchPurchasedResourceItem;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.toq;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteLargeIconViewHolder extends BatchOperationAdapter.BatchViewHolder<LargeIconRemoteBatchItem> {

    /* JADX INFO: renamed from: h */
    protected RecyclerView.AbstractC1048h f12924h;

    /* JADX INFO: renamed from: i */
    private ImageView f12925i;

    /* JADX INFO: renamed from: p */
    private TextView f12926p;

    /* JADX INFO: renamed from: s */
    private TextView f12927s;

    /* JADX INFO: renamed from: t */
    private int f12928t;

    /* JADX INFO: renamed from: y */
    private TextView f12929y;

    /* JADX INFO: renamed from: z */
    int f12930z;

    public RemoteLargeIconViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12925i = (ImageView) itemView.findViewById(R.id.image);
        this.f12929y = (TextView) itemView.findViewById(R.id.title);
        this.f12927s = (TextView) itemView.findViewById(R.id.price);
        this.f12928t = adapter.m7311j();
        this.f12926p = (TextView) itemView.findViewById(R.id.incompatible);
        this.f12930z = ki().getResources().getDimensionPixelSize(R.dimen.large_icon_local_vh_radius);
        C6077k.cdj(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static RemoteLargeIconViewHolder m8284l(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new RemoteLargeIconViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_remote_largeicon_icon, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        UIProduct product = ((LargeIconRemoteBatchItem) fu4()).getProduct();
        ki().startActivity(toq.ki(ki(), ni7(), product.uuid, product.imageUrl, product.trackId, Boolean.FALSE, product.productType));
        m6706z().d8wk(product.trackId, null);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(LargeIconRemoteBatchItem item, int position) {
        super.o1t(item, position);
        UIProduct product = item.getProduct();
        this.f12929y.setVisibility(0);
        this.f12929y.setText(product.name);
        this.f12927s.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = this.f12925i.getLayoutParams();
        int i2 = this.f12928t;
        layoutParams.width = i2;
        layoutParams.height = i2;
        if (item instanceof LargeIconBatchPurchasedResourceItem) {
            this.f12927s.setText(product.purchasedTime);
        } else {
            this.f12927s.setText(C1815m.toq(fn3e(), product.currentPriceInCent));
        }
        if (item.getProduct().manualHide) {
            this.f12926p.setVisibility(0);
            this.f12926p.setText(R.string.has_mamual_hide_large_icons);
            t8r.ki(this.f12926p, 6, 14, 2, 2);
        } else {
            this.f12926p.setVisibility(8);
        }
        C1812k.zy(item.getProduct().name, this.f12925i, this.itemView);
        x2.f7l8(ki(), item.getProduct().imageUrl, this.f12925i, x2.ki(position, this.f12930z), this.f12930z);
    }
}
