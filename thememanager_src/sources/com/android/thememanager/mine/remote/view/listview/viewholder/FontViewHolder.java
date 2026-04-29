package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceLikeAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import p001b.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class FontViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    private DiscountPriceView f12914h;

    /* JADX INFO: renamed from: i */
    protected int f12915i;

    /* JADX INFO: renamed from: p */
    private TextView f12916p;

    /* JADX INFO: renamed from: s */
    private TextView f12917s;

    /* JADX INFO: renamed from: y */
    private ImageView f12918y;

    public FontViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12915i = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        this.f12918y = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f12917s = (TextView) itemView.findViewById(R.id.time);
        this.f12914h = (DiscountPriceView) itemView.findViewById(R.id.price);
        this.f12916p = (TextView) itemView.findViewById(R.id.incompatible);
        C6077k.ld6(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static FontViewHolder m8277l(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new FontViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_font, parent, false), adapter);
    }

    public static FontViewHolder n5r1(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new FontViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_font, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseRemoteResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        x2.m6782y(ki(), item.getProduct().getImageUrl(fn3e()), this.f12918y, x2.fn3e().m6793r(x2.ki(position, this.f12915i)).a9(false));
        String str = item.getProduct().productType;
        if (str == null) {
            str = "FONT";
        }
        String strZy = toq.zy(str);
        if (!TextUtils.isEmpty(strZy)) {
            if (item.getProduct().manualHide) {
                this.f12916p.setVisibility(0);
                this.f12916p.setText(R.string.has_mamual_hide_font);
            } else if (item.getProduct().offShelf) {
                this.f12916p.setVisibility(0);
                this.f12916p.setText(R.string.resource_is_off_shelf);
                if (Build.VERSION.SDK_INT >= 33) {
                    this.f12916p.setFallbackLineSpacing(false);
                }
            } else if (item.getProduct().uiVersion < toq.ki(strZy)) {
                this.f12916p.setVisibility(0);
                this.f12916p.setText(R.string.current_version_incompatible);
            } else {
                this.f12916p.setVisibility(8);
            }
        }
        if (this.f9847k instanceof RemoteResourcePurchasedAdapter) {
            this.f12914h.setPrice(item.getProduct().purchasedPriceInCent, item.getProduct().purchasedPriceInCent);
            this.f12917s.setText(item.getProduct().purchasedTime);
            return;
        }
        this.f12914h.setPrice(item.getProduct().originPriceInCent, item.getProduct().currentPriceInCent);
        BaseThemeAdapter baseThemeAdapter = this.f9847k;
        if (!(baseThemeAdapter instanceof RemoteResourceFavoriteAdapter) || (baseThemeAdapter instanceof RemoteResourceLikeAdapter)) {
            return;
        }
        this.f12917s.setText(item.getProduct().favoriteTime);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        UIProduct product = ((BaseRemoteResourceAdapter.toq) fu4()).getProduct();
        ki().startActivity(com.android.thememanager.toq.ki(ki(), ni7(), product.uuid, product.imageUrl, product.trackId, Boolean.FALSE, product.productType));
        m6706z().d8wk(product.trackId, null);
    }
}
