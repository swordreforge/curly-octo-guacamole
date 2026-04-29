package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.toq;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    protected int f12937h;

    /* JADX INFO: renamed from: p */
    private TextView f12938p;

    /* JADX INFO: renamed from: s */
    private TextView f12939s;

    /* JADX INFO: renamed from: y */
    private ImageView f12940y;

    public WallpaperViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12937h = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
        this.f12940y = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f12939s = (TextView) itemView.findViewById(R.id.favorited_time);
        this.f12938p = (TextView) itemView.findViewById(R.id.incompatible);
        C6077k.o1t(itemView.findViewById(R.id.thumbnail_fl));
    }

    /* JADX INFO: renamed from: l */
    public static WallpaperViewHolder m8286l(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new WallpaperViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_wallpaper, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f9847k.ni7().iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseRemoteResourceAdapter.toq) it.next()).getProduct());
        }
        UIProduct product = ((BaseRemoteResourceAdapter.toq) fu4()).getProduct();
        int iQkj8 = 0;
        int iFnq8 = 2;
        BaseThemeAdapter baseThemeAdapter = this.f9847k;
        if (baseThemeAdapter instanceof RemoteResourceFavoriteAdapter) {
            iQkj8 = ((RemoteResourceFavoriteAdapter) baseThemeAdapter).qkj8();
            iFnq8 = ((RemoteResourceFavoriteAdapter) this.f9847k).fnq8();
        }
        int i2 = iFnq8;
        ki().startActivity(toq.m9548y(ki(), getAdapterPosition(), arrayList, i2, iQkj8, product.uuid));
        m6706z().d8wk(product.trackId, null);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseRemoteResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        C1812k.zy(item.getProduct().name, this.f12940y);
        x2.f7l8(ki(), item.getProduct().imageUrl, this.f12940y, x2.ki(position, this.f12937h), this.f12937h);
        String str = item.getProduct().productType;
        if (str == null) {
            str = "WALLPAPER";
        }
        String strZy = p001b.toq.zy(str);
        if (!TextUtils.isEmpty(strZy)) {
            if (item.getProduct().offShelf) {
                this.f12938p.setVisibility(0);
                this.f12938p.setText(R.string.resource_is_off_shelf);
            } else if (item.getProduct().uiVersion < p001b.toq.ki(strZy)) {
                this.f12938p.setVisibility(0);
                this.f12938p.setText(R.string.current_version_incompatible);
            } else {
                this.f12938p.setVisibility(8);
            }
        }
        if (TextUtils.isEmpty(item.getProduct().favoriteTime)) {
            return;
        }
        this.f12939s.setText(item.getProduct().favoriteTime);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return o1t.m7169g(fn3e()) ? this.itemView : this.itemView.findViewById(R.id.thumbnail_fl);
    }
}
