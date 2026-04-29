package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.WallpaperProductsElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementWallpaperThreeGridViewHolder extends BaseViewHolder<WallpaperProductsElement> {

    /* JADX INFO: renamed from: g */
    protected int f14109g;

    /* JADX INFO: renamed from: s */
    private Integer[] f14110s;

    /* JADX INFO: renamed from: y */
    protected List<ImageView> f14111y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementWallpaperThreeGridViewHolder$k */
    class ViewOnClickListenerC2411k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ UIProduct f14112k;

        ViewOnClickListenerC2411k(final UIProduct val$product) {
            this.f14112k = val$product;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ActivityC0891q activityC0891qKi = ElementWallpaperThreeGridViewHolder.this.ki();
            UIProduct uIProduct = this.f14112k;
            C2451n.kja0(activityC0891qKi, 0, "thememanager", uIProduct.uuid, uIProduct.trackId, false, uIProduct.imageUrl);
            ElementWallpaperThreeGridViewHolder.this.m6706z().d8wk(this.f14112k.trackId, null);
        }
    }

    public ElementWallpaperThreeGridViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14111y = new ArrayList();
        this.f14110s = new Integer[]{Integer.valueOf(R.id.thumbnail_0), Integer.valueOf(R.id.thumbnail_1), Integer.valueOf(R.id.thumbnail_2)};
        this.f14109g = 3;
        for (int i2 = 0; i2 < this.f14109g; i2++) {
            this.f14111y.add((ImageView) itemView.findViewById(this.f14110s[i2].intValue()));
        }
    }

    /* JADX INFO: renamed from: f */
    public static ElementWallpaperThreeGridViewHolder m8698f(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementWallpaperThreeGridViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_wallpaper_three_grid, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void o1t(WallpaperProductsElement item, int position) {
        super.o1t(item, position);
        m8700l(item, position);
    }

    /* JADX INFO: renamed from: l */
    protected void m8700l(final WallpaperProductsElement card, int position) {
        if (card.getProducts() == null || card.getProducts().size() < this.f14109g) {
            return;
        }
        for (int i2 = 0; i2 < this.f14109g; i2++) {
            ImageView imageView = this.f14111y.get(i2);
            UIProduct uIProduct = card.getProducts().get(i2);
            n5r1(imageView, uIProduct.imageUrl, position);
            imageView.setOnClickListener(new ViewOnClickListenerC2411k(uIProduct));
        }
    }

    void n5r1(ImageView thumbnail, String imageUrl, int position) {
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), imageUrl, thumbnail, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((WallpaperProductsElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }
}
