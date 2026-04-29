package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.toq;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    private TextView f12909h;

    /* JADX INFO: renamed from: i */
    private x2.C1735g f12910i;

    /* JADX INFO: renamed from: p */
    private TextView f12911p;

    /* JADX INFO: renamed from: s */
    private TextView f12912s;

    /* JADX INFO: renamed from: y */
    private ImageView f12913y;

    public AodViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12913y = (ImageView) itemView.findViewById(R.id.image);
        this.f12912s = (TextView) itemView.findViewById(android.R.id.title);
        this.f12911p = (TextView) itemView.findViewById(R.id.price);
        this.f12909h = (TextView) itemView.findViewById(R.id.incompatible);
        Resources resources = ki().getResources();
        int dimension = (int) resources.getDimension(R.dimen.detail_recommend_item_width);
        float fraction = resources.getFraction(R.fraction.aod_thumbnail_default_ratio, dimension, dimension);
        this.f12913y.getLayoutParams().width = dimension;
        this.f12913y.getLayoutParams().height = (int) fraction;
        C6077k.o1t(itemView.findViewById(R.id.image_fl));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.me_card_aod_thunmnail_padding_horizontal);
        itemView.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.me_card_aod_thunmnail_padding_bottom));
        this.f12910i = x2.fn3e();
        if (C1819o.d2ok(fn3e())) {
            this.f12910i.wvg(0);
        }
    }

    /* JADX INFO: renamed from: l */
    public static AodViewHolder m8276l(ViewGroup parent, BatchOperationAdapter adapter) {
        return new AodViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_aod, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        UIProduct product = ((BaseRemoteResourceAdapter.toq) fu4()).getProduct();
        ki().startActivity(toq.ki(ki(), ni7(), product.uuid, product.imageUrl, product.trackId, Boolean.FALSE, product.productType));
        m6706z().d8wk(product.trackId, null);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseRemoteResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        UIProduct product = item.getProduct();
        this.f12912s.setVisibility(0);
        this.f12912s.setText(product.name);
        this.f12911p.setText(C1815m.toq(fn3e(), product.purchasedPriceInCent));
        x2.m6782y(ki(), product.imageUrl, this.f12913y, this.f12910i.m6793r(x2.ki(position, 0.0f)));
        String strZy = p001b.toq.zy(item.getProduct().productType);
        if (TextUtils.isEmpty(strZy)) {
            return;
        }
        if (item.getProduct().manualHide) {
            this.f12909h.setVisibility(0);
            this.f12909h.setText(R.string.has_mamual_hide_aod);
        } else if (item.getProduct().offShelf) {
            this.f12909h.setVisibility(0);
            this.f12909h.setText(R.string.resource_is_off_shelf);
        } else if (item.getProduct().uiVersion >= p001b.toq.ki(strZy)) {
            this.f12909h.setVisibility(8);
        } else {
            this.f12909h.setVisibility(0);
            this.f12909h.setText(R.string.current_version_incompatible);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return this.itemView.findViewById(R.id.image_fl);
    }
}
