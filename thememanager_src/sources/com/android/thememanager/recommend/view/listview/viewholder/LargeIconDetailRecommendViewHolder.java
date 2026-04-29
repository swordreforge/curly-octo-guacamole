package com.android.thememanager.recommend.view.listview.viewholder;

import a98o.C0005q;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.model.entity.element.LargeIconRecommendElement;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconDetailRecommendViewHolder extends BaseVMViewHolder<LargeIconRecommendElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f14179g;

    /* JADX INFO: renamed from: p */
    private int f14180p;

    /* JADX INFO: renamed from: s */
    private TextView f14181s;

    /* JADX INFO: renamed from: y */
    private TextView f14182y;

    public LargeIconDetailRecommendViewHolder(@InterfaceC7396q @lvui View itemView, RecommendVMListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14179g = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14182y = (TextView) itemView.findViewById(R.id.title);
        this.f14181s = (TextView) itemView.findViewById(R.id.price);
        this.f14180p = fn3e().getResources().getDimensionPixelOffset(R.dimen.large_icon_item_default_radius);
        C6077k.o1t(itemView);
    }

    public static LargeIconDetailRecommendViewHolder d2ok(ViewGroup parent, RecommendVMListViewAdapter adapter) {
        return new LargeIconDetailRecommendViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_detail_recommend_vh, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oc(UIImageWithLink uIImageWithLink, int i2, String str, View view) {
        if (uIImageWithLink.link == null) {
            return;
        }
        List<UIElement> qVar = wvg().fn3e().toq();
        ArrayList arrayList = new ArrayList();
        for (UIElement uIElement : qVar) {
            if (uIElement instanceof LargeIconRecommendElement) {
                UIImageWithLink uIImageWithLink2 = ((LargeIconRecommendElement) uIElement).getUIImageWithLink();
                UIProduct uIProduct = new UIProduct();
                UILink uILink = uIImageWithLink2.link;
                uIProduct.uuid = uILink.link;
                uIProduct.trackId = uILink.trackId;
                arrayList.add(uIProduct);
            }
        }
        Pair<ArrayList<C0005q<String, String>>, Integer> pairX2 = y9n.x2(i2, arrayList);
        ki().startActivity(com.android.thememanager.toq.t8r(ki(), ni7(), (ArrayList) pairX2.first, ((Integer) pairX2.second).intValue(), str, Boolean.FALSE, uIImageWithLink.link.productType));
    }

    /* JADX INFO: renamed from: r */
    private void m8717r(int price) {
        if (price <= 0) {
            this.f14181s.setVisibility(8);
        } else {
            this.f14181s.setText(C1815m.toq(this.itemView.getContext(), price));
            this.f14181s.setVisibility(0);
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseVMAdapter.ViewHolder
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public void o1t(LargeIconRecommendElement item, final int position) {
        super.o1t(item, position);
        final UIImageWithLink uIImageWithLink = item.getUIImageWithLink();
        final String str = uIImageWithLink.imageUrl;
        int iJk = wvg().jk();
        ViewGroup.LayoutParams layoutParams = this.f14179g.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iJk, iJk);
        }
        layoutParams.width = iJk;
        layoutParams.height = iJk;
        this.f14179g.setLayoutParams(layoutParams);
        this.f14182y.setMaxWidth(iJk);
        this.f14182y.setText(uIImageWithLink.title);
        m8717r(uIImageWithLink.currentPriceInCent);
        com.android.thememanager.basemodule.imageloader.x2.m6782y((AbstractActivityC1717k) this.itemView.getContext(), str, this.f14179g, com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), this.f14180p)));
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.cdj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14357k.oc(uIImageWithLink, position, str, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseVMViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8594t() {
        T t2 = this.f9854q;
        return t2 != 0 ? Collections.singletonList(((LargeIconRecommendElement) t2).getTrackId()) : super.mo8594t();
    }
}
