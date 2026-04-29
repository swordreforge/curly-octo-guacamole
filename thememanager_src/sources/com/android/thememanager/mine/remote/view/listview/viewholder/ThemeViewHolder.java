package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.DiscountPriceView;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourcePurchasedAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.toq;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    private TextView f12931h;

    /* JADX INFO: renamed from: i */
    private TextView f12932i;

    /* JADX INFO: renamed from: p */
    private DiscountPriceView f12933p;

    /* JADX INFO: renamed from: s */
    private TextView f12934s;

    /* JADX INFO: renamed from: y */
    private ImageView f12935y;

    /* JADX INFO: renamed from: z */
    protected int f12936z;

    public ThemeViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12936z = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
        this.f12935y = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f12934s = (TextView) itemView.findViewById(R.id.title);
        this.f12932i = (TextView) itemView.findViewById(R.id.time);
        this.f12933p = (DiscountPriceView) itemView.findViewById(R.id.price);
        this.f12931h = (TextView) itemView.findViewById(R.id.incompatible);
        C6077k.o1t(itemView.findViewById(R.id.thumbnail_fl));
    }

    /* JADX INFO: renamed from: l */
    public static ThemeViewHolder m8285l(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new ThemeViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_theme, parent, false), adapter);
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
        C1812k.zy(item.getProduct().name, this.f12935y, this.itemView);
        x2.f7l8(ki(), item.getProduct().imageUrl, this.f12935y, x2.ki(position, this.f12936z), this.f12936z);
        String str = item.getProduct().productType;
        if (str == null) {
            str = "THEME";
        }
        String strZy = p001b.toq.zy(str);
        if (!TextUtils.isEmpty(strZy)) {
            if (item.getProduct().manualHide) {
                this.f12931h.setVisibility(0);
                if ("WALLPAPER".equals(item.getProduct().productType)) {
                    this.f12931h.setText(R.string.has_mamual_hide_wallpaper);
                } else {
                    this.f12931h.setText(R.string.has_mamual_hide_theme);
                }
            } else if (item.getProduct().offShelf) {
                this.f12931h.setVisibility(0);
                this.f12931h.setText(R.string.resource_is_off_shelf);
            } else if (item.getProduct().uiVersion < p001b.toq.ki(strZy)) {
                this.f12931h.setVisibility(0);
                this.f12931h.setText(R.string.current_version_incompatible);
            } else {
                this.f12931h.setVisibility(8);
            }
        }
        this.f12934s.setText(item.getProduct().name);
        this.f12933p.setPrice(item.getProduct().purchasedPriceInCent, item.getProduct().purchasedPriceInCent);
        if (this.f9847k instanceof RemoteResourcePurchasedAdapter) {
            this.f12932i.setText(item.getProduct().purchasedTime);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return o1t.m7169g(fn3e()) ? this.itemView : this.itemView.findViewById(R.id.thumbnail_fl);
    }
}
