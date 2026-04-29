package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.RankListElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRankListRingtoneFontViewHolder extends BaseViewHolder<RankListElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f13939g;

    /* JADX INFO: renamed from: h */
    private TextView f13940h;

    /* JADX INFO: renamed from: i */
    private TextView f13941i;

    /* JADX INFO: renamed from: p */
    private ImageView f13942p;

    /* JADX INFO: renamed from: r */
    private int f13943r;

    /* JADX INFO: renamed from: s */
    private ImageView f13944s;

    /* JADX INFO: renamed from: t */
    private View f13945t;

    /* JADX INFO: renamed from: y */
    private ImageView f13946y;

    /* JADX INFO: renamed from: z */
    private TextView f13947z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRankListRingtoneFontViewHolder$k */
    class ViewOnClickListenerC2389k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RankListElement f13948k;

        ViewOnClickListenerC2389k(final RankListElement val$element) {
            this.f13948k = val$element;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ElementRankListRingtoneFontViewHolder.this.lvui(this.f13948k.getPageUuid(), this.f13948k.getTitle());
            ElementRankListRingtoneFontViewHolder.this.m6706z().d8wk(this.f13948k.getTrackId(), null);
        }
    }

    public ElementRankListRingtoneFontViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13939g = (ImageView) itemView.findViewById(R.id.image);
        this.f13946y = (ImageView) itemView.findViewById(R.id.font1);
        this.f13944s = (ImageView) itemView.findViewById(R.id.font2);
        this.f13942p = (ImageView) itemView.findViewById(R.id.font3);
        this.f13940h = (TextView) itemView.findViewById(R.id.info1);
        this.f13941i = (TextView) itemView.findViewById(R.id.info2);
        this.f13947z = (TextView) itemView.findViewById(R.id.info3);
        this.f13945t = itemView.findViewById(R.id.divider);
        this.f13943r = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_recommend_three_img_radius);
        C6077k.ld6(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementRankListRingtoneFontViewHolder m8626l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRankListRingtoneFontViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_rank_list_ringtone_font_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final RankListElement element, int position) {
        super.o1t(element, position);
        View view = this.f13945t;
        if (view != null) {
            view.setVisibility(8);
        }
        com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), element.getImageUrl(), this.f13939g, com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13943r, wvg().ncyb()), this.f13943r);
        UIProduct uIProduct = element.getProducts().get(0);
        UIProduct uIProduct2 = element.getProducts().get(1);
        UIProduct uIProduct3 = element.getProducts().get(2);
        if (34 == element.getCardTypeOrdinal()) {
            this.f13940h.setText("1 " + uIProduct.name);
            this.f13941i.setText("2 " + uIProduct2.name);
            this.f13947z.setText("3 " + uIProduct3.name);
        } else if (35 == element.getCardTypeOrdinal()) {
            this.f13940h.setText("1");
            this.f13941i.setText("2");
            this.f13947z.setText("3");
            com.android.thememanager.basemodule.imageloader.x2.zy(ki(), uIProduct.getImageUrl(fn3e()), this.f13946y);
            com.android.thememanager.basemodule.imageloader.x2.zy(ki(), uIProduct2.getImageUrl(fn3e()), this.f13944s);
            com.android.thememanager.basemodule.imageloader.x2.zy(ki(), uIProduct3.getImageUrl(fn3e()), this.f13942p);
        }
        this.itemView.setOnClickListener(new ViewOnClickListenerC2389k(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((RankListElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }
}
