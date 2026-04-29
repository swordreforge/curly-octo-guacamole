package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.IconSubjectsProductElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IconSubjectsProductViewHolder extends BaseViewHolder<IconSubjectsProductElement> {

    /* JADX INFO: renamed from: g */
    private final int f14165g;

    /* JADX INFO: renamed from: y */
    private final int f14166y;

    private static class ElementSubViewHolder extends BaseViewHolder<UIProduct> {

        /* JADX INFO: renamed from: g */
        private SmoothFrameLayout2 f14167g;

        /* JADX INFO: renamed from: p */
        private TextView f14168p;

        /* JADX INFO: renamed from: s */
        private TextView f14169s;

        /* JADX INFO: renamed from: y */
        private ImageView f14170y;

        /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.IconSubjectsProductViewHolder$ElementSubViewHolder$k */
        class ViewOnClickListenerC2417k implements View.OnClickListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIProduct f14171k;

            ViewOnClickListenerC2417k(final UIProduct val$product) {
                this.f14171k = val$product;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View v2) {
                ActivityC0891q activityC0891qKi = ElementSubViewHolder.this.ki();
                Fragment fragmentNi7 = ElementSubViewHolder.this.ni7();
                UIProduct uIProduct = this.f14171k;
                Intent intentKi = com.android.thememanager.toq.ki(activityC0891qKi, fragmentNi7, uIProduct.uuid, null, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
                if (ElementSubViewHolder.this.ni7() != null) {
                    ElementSubViewHolder.this.ni7().startActivityForResult(intentKi, 109);
                } else {
                    ElementSubViewHolder.this.ki().startActivity(intentKi);
                }
            }
        }

        public ElementSubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f14167g = (SmoothFrameLayout2) itemView.findViewById(R.id.image_container);
            this.f14170y = (ImageView) itemView.findViewById(R.id.image);
            this.f14169s = (TextView) itemView.findViewById(android.R.id.title);
            this.f14168p = (TextView) itemView.findViewById(R.id.price);
            Resources resources = ki().getResources();
            int dimension = (int) (wvg().x9kr() <= 0 ? resources.getDimension(R.dimen.icon_recommend_image_width) : wvg().x9kr());
            float fraction = resources.getFraction(R.fraction.aod_thumbnail_default_ratio, dimension, dimension);
            this.f14170y.getLayoutParams().width = dimension;
            this.f14170y.getLayoutParams().height = (int) fraction;
            C6077k.o1t(this.f14167g);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: ncyb, reason: merged with bridge method [inline-methods] */
        public void o1t(final UIProduct product, int position) {
            super.o1t(product, position);
            this.f14169s.setVisibility(0);
            this.f14169s.setText(product.name);
            this.f14168p.setText(C1815m.toq(fn3e(), product.currentPriceInCent));
            com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), product.imageUrl, this.f14170y, com.android.thememanager.basemodule.imageloader.x2.t8r(position, 0.0f, wvg().ncyb()), 0);
            this.f14167g.setOnClickListener(new ViewOnClickListenerC2417k(product));
        }
    }

    public IconSubjectsProductViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14165g = ki().getResources().getDimensionPixelOffset(R.dimen.rc_icon_subjects_first_top_padding);
        this.f14166y = ki().getResources().getDimensionPixelOffset(R.dimen.rc_icon_subjects_bottom_padding);
    }

    /* JADX INFO: renamed from: l */
    public static IconSubjectsProductViewHolder m8716l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new IconSubjectsProductViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_icon_big_item, parent, false), adapter);
    }

    private BaseViewHolder ncyb(View view) {
        return new ElementSubViewHolder(view, wvg());
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(IconSubjectsProductElement item, int position) {
        super.o1t(item, position);
        ncyb(this.itemView).o1t(item.getProduct(), position);
        if (item.isFirst()) {
            this.itemView.setPadding(0, this.f14165g, 0, this.f14166y);
        } else {
            this.itemView.setPadding(0, 0, 0, this.f14166y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((IconSubjectsProductElement) this.f9849q).getProduct().trackId);
        return arrayList;
    }
}
