package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.SearchHotElement;
import com.android.thememanager.recommend.view.C2357g;
import com.android.thememanager.recommend.view.RecommendSearchHotOrderLayout;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementSearchHintHotViewHolder extends BaseViewHolder<SearchHotElement> {

    /* JADX INFO: renamed from: g */
    private RecommendSearchHotOrderLayout f14024g;

    public ElementSearchHintHotViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        RecommendSearchHotOrderLayout recommendSearchHotOrderLayout = (RecommendSearchHotOrderLayout) itemView.findViewById(R.id.order);
        this.f14024g = recommendSearchHotOrderLayout;
        recommendSearchHotOrderLayout.setRecommendItemFactory(new C2357g(ki(), wvg().lvui()));
        this.f14024g.setGap(ki().getResources().getDimensionPixelSize(R.dimen.rc_hot_recommend_text_gap));
    }

    public static ElementSearchHintHotViewHolder ncyb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementSearchHintHotViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_search_hint, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(SearchHotElement item, int position) {
        super.o1t(item, position);
        this.f14024g.toq(item.getRecommendSearchHotTitleList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        T t2 = this.f9849q;
        if (t2 != 0 && ((SearchHotElement) t2).getRecommendSearchHotTitleList() != null && ((SearchHotElement) this.f9849q).getRecommendSearchHotTitleList().size() > 0) {
            Iterator<String> it = ((SearchHotElement) this.f9849q).getRecommendSearchHotTitleList().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        return arrayList;
    }
}
