package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.AodProductElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import miuix.smooth.SmoothFrameLayout2;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class AodProductViewHolder extends BaseViewHolder<AodProductElement> {

    /* JADX INFO: renamed from: g */
    private SmoothFrameLayout2 f13763g;

    /* JADX INFO: renamed from: h */
    private x2.C1735g f13764h;

    /* JADX INFO: renamed from: p */
    private TextView f13765p;

    /* JADX INFO: renamed from: s */
    private TextView f13766s;

    /* JADX INFO: renamed from: y */
    private ImageView f13767y;

    public AodProductViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13763g = (SmoothFrameLayout2) itemView.findViewById(R.id.image_fl);
        this.f13767y = (ImageView) itemView.findViewById(R.id.image);
        this.f13766s = (TextView) itemView.findViewById(android.R.id.title);
        this.f13765p = (TextView) itemView.findViewById(R.id.price);
        Resources resources = ki().getResources();
        this.f13764h = com.android.thememanager.basemodule.imageloader.x2.fn3e();
        if (C1819o.d2ok(fn3e())) {
            this.f13764h.wvg(0);
        }
        float fX9kr = wvg().x9kr();
        int dimension = (int) (fX9kr <= 0.0f ? resources.getDimension(R.dimen.detail_recommend_item_width) : fX9kr);
        float fraction = resources.getFraction(R.fraction.aod_thumbnail_default_ratio, dimension, dimension);
        this.f13767y.getLayoutParams().width = dimension;
        this.f13767y.getLayoutParams().height = (int) fraction;
        C6077k.o1t(this.f13763g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8571l(UIProduct uIProduct, View view) {
        Intent intentKi = com.android.thememanager.toq.ki(ki(), ni7(), uIProduct.uuid, null, uIProduct.trackId, Boolean.FALSE, uIProduct.productType);
        if (ni7() != null) {
            ni7().startActivityForResult(intentKi, 109);
        } else {
            ki().startActivity(intentKi);
        }
        m6706z().d8wk(uIProduct.trackId, null);
    }

    public static AodProductViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new AodProductViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_aod_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(AodProductElement item, int position) {
        super.o1t(item, position);
        final UIProduct product = item.getProduct();
        this.f13766s.setVisibility(0);
        this.f13766s.setText(product.name);
        this.f13765p.setText(C1815m.toq(fn3e(), product.currentPriceInCent));
        ViewGroup.LayoutParams layoutParams = this.f13767y.getLayoutParams();
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), product.imageUrl, this.f13767y, this.f13764h.m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)).x9kr(layoutParams.width, layoutParams.height));
        this.f13763g.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14378k.m8571l(product, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((AodProductElement) this.f9849q).getProduct().trackId);
        return arrayList;
    }
}
