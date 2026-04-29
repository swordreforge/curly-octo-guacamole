package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.BottomLoadMoreElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementBottomLoadMoreViewHolder extends BaseViewHolder<BottomLoadMoreElement> {

    /* JADX INFO: renamed from: g */
    private View f13856g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementBottomLoadMoreViewHolder$k */
    class ViewOnClickListenerC2381k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ BottomLoadMoreElement f13857k;

        ViewOnClickListenerC2381k(final BottomLoadMoreElement val$item) {
            this.f13857k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ElementBottomLoadMoreViewHolder.this.jk(this.f13857k.getSubjectUuid(), this.f13857k.getTitle());
            ElementBottomLoadMoreViewHolder.this.m6706z().d8wk(this.f13857k.getTrackId(), null);
        }
    }

    public ElementBottomLoadMoreViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        View viewFindViewById = itemView.findViewById(R.id.card_view_more);
        this.f13856g = viewFindViewById;
        C6077k.m22369i(viewFindViewById);
    }

    /* JADX INFO: renamed from: l */
    public static ElementBottomLoadMoreViewHolder m8606l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementBottomLoadMoreViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(com.android.thememanager.basemodule.utils.zurt.m7261k(R.layout.rc_element_bottom_load_more, R.layout.rc_element_bottom_load_more_elder), parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final BottomLoadMoreElement item, int position) {
        super.o1t(item, position);
        this.f13856g.setOnClickListener(new ViewOnClickListenerC2381k(item));
    }
}
