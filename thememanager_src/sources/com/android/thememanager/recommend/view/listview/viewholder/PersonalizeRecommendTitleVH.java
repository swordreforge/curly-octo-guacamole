package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.PersonalizeRecommendTitleElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PersonalizeRecommendTitleVH.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PersonalizeRecommendTitleVH extends BaseViewHolder<PersonalizeRecommendTitleElement> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C2422k f14228y = new C2422k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final TextView f14229g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.PersonalizeRecommendTitleVH$k */
    /* JADX INFO: compiled from: PersonalizeRecommendTitleVH.kt */
    public static final class C2422k {
        private C2422k() {
        }

        public /* synthetic */ C2422k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final PersonalizeRecommendTitleVH m8738k(@InterfaceC7396q ViewGroup parent, @InterfaceC7396q RecommendListViewAdapter adapter) {
            d2ok.m23075h(parent, "parent");
            d2ok.m23075h(adapter, "adapter");
            View viewInflate = LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_personalize_recommend_title, parent, false);
            d2ok.kja0(viewInflate, "inflate(...)");
            return new PersonalizeRecommendTitleVH(viewInflate, adapter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizeRecommendTitleVH(@InterfaceC7396q View itemView, @InterfaceC7396q RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
        x9kr();
        View viewFindViewById = itemView.findViewById(R.id.detail_recommend_title);
        d2ok.n7h(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
        this.f14229g = (TextView) viewFindViewById;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final PersonalizeRecommendTitleVH ncyb(@InterfaceC7396q ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter recommendListViewAdapter) {
        return f14228y.m8738k(viewGroup, recommendListViewAdapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(@InterfaceC7395n PersonalizeRecommendTitleElement personalizeRecommendTitleElement, int i2) {
        super.o1t(personalizeRecommendTitleElement, i2);
        this.f14229g.setText(personalizeRecommendTitleElement != null ? personalizeRecommendTitleElement.getTitle() : null);
    }
}
