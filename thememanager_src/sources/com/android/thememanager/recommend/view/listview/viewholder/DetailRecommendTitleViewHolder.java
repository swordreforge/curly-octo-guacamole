package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.DetailRecommendTitleElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DetailRecommendTitleViewHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DetailRecommendTitleViewHolder extends BaseViewHolder<DetailRecommendTitleElement> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C2378k f13832y = new C2378k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final TextView f13833g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.DetailRecommendTitleViewHolder$k */
    /* JADX INFO: compiled from: DetailRecommendTitleViewHolder.kt */
    public static final class C2378k {
        private C2378k() {
        }

        public /* synthetic */ C2378k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final DetailRecommendTitleViewHolder m8597k(@InterfaceC7396q ViewGroup parent, @InterfaceC7396q RecommendListViewAdapter adapter) {
            d2ok.m23075h(parent, "parent");
            d2ok.m23075h(adapter, "adapter");
            View viewInflate = LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_detail_title, parent, false);
            d2ok.kja0(viewInflate, "inflate(...)");
            return new DetailRecommendTitleViewHolder(viewInflate, adapter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailRecommendTitleViewHolder(@InterfaceC7396q View itemView, @InterfaceC7396q RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
        x9kr();
        View viewFindViewById = itemView.findViewById(R.id.detail_recommend_title);
        d2ok.n7h(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f13833g = (TextView) viewFindViewById;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final DetailRecommendTitleViewHolder ncyb(@InterfaceC7396q ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter recommendListViewAdapter) {
        return f13832y.m8597k(viewGroup, recommendListViewAdapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(@InterfaceC7395n DetailRecommendTitleElement detailRecommendTitleElement, int i2) {
        super.o1t(detailRecommendTitleElement, i2);
        this.f13833g.setText(detailRecommendTitleElement != null ? detailRecommendTitleElement.title : null);
    }
}
