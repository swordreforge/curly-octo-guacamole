package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalWallpaperTitleViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> {

    /* JADX INFO: renamed from: s */
    private int f12815s;

    /* JADX INFO: renamed from: y */
    private TextView f12816y;

    public LocalWallpaperTitleViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter, int itemType) {
        super(itemView, adapter);
        this.f12815s = itemType;
        this.f12816y = (TextView) itemView.findViewById(R.id.item_title);
    }

    /* JADX INFO: renamed from: l */
    public static LocalWallpaperTitleViewHolder m8261l(ViewGroup parent, BaseLocalResourceAdapter adapter, int itemType) {
        return new LocalWallpaperTitleViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_title_divider, parent, false), adapter, itemType);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseLocalResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        int i2 = this.f12815s;
        this.f12816y.setText(i2 == 1 ? fn3e().getString(R.string.title_my_wallpaper_resource) : i2 == 2 ? fn3e().getString(R.string.title_system_wallpaper_resource) : null);
        this.itemView.findViewById(R.id.group_divider).setVisibility(position == 0 ? 8 : 0);
    }
}
