package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.RankListThemeElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRankListViewHolder extends BaseViewHolder<RankListThemeElement> {

    /* JADX INFO: renamed from: g */
    private TextView f13950g;

    /* JADX INFO: renamed from: h */
    private int[][] f13951h;

    /* JADX INFO: renamed from: i */
    private List<RankItemHolder> f13952i;

    /* JADX INFO: renamed from: p */
    private int f13953p;

    /* JADX INFO: renamed from: s */
    private View f13954s;

    /* JADX INFO: renamed from: y */
    private TextView f13955y;

    private class RankItemHolder extends BaseViewHolder<UIProduct> {

        /* JADX INFO: renamed from: g */
        ImageView f13956g;

        /* JADX INFO: renamed from: y */
        TextView f13958y;

        public RankItemHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
            this.f13956g = (ImageView) itemView.findViewById(R.id.thumbnail);
            this.f13958y = (TextView) itemView.findViewById(android.R.id.title);
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: ncyb, reason: merged with bridge method [inline-methods] */
        public void o1t(UIProduct item, int position) {
            super.o1t(item, position);
            com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), item.imageUrl, this.f13956g, com.android.thememanager.basemodule.imageloader.x2.fn3e().o1t(ElementRankListViewHolder.this.f13953p).m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(position, 0.0f)));
            this.f13958y.setVisibility(0);
            this.f13958y.setText(item.name);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRankListViewHolder$k */
    class ViewOnClickListenerC2390k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RankListThemeElement f13959k;

        ViewOnClickListenerC2390k(final RankListThemeElement val$item) {
            this.f13959k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ElementRankListViewHolder.this.lvui(this.f13959k.getPageUuid(), this.f13959k.getTitle());
            ElementRankListViewHolder.this.m6706z().d8wk(this.f13959k.getTrackId(), null);
        }
    }

    public ElementRankListViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13951h = new int[][]{new int[]{R.id.item_0, R.drawable.rank_0}, new int[]{R.id.item_1, R.drawable.rank_1}, new int[]{R.id.item_2, R.drawable.rank_2}};
        this.f13952i = new ArrayList();
        this.f13950g = (TextView) itemView.findViewById(R.id.title);
        this.f13955y = (TextView) itemView.findViewById(R.id.sub_title);
        this.f13954s = itemView;
        C6077k.ld6(itemView);
        this.f13953p = R.color.item_category_wallpaper_border_color;
        for (int[] iArr : this.f13951h) {
            this.f13952i.add(new RankItemHolder(itemView.findViewById(iArr[0]), adapter));
        }
    }

    public static ElementRankListViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRankListViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_rank_list_theme_item, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(final RankListThemeElement item, int position) {
        super.o1t(item, position);
        this.f13950g.setText(item.getTitle());
        this.f13955y.setText(item.getSubTitle());
        this.f13954s.setOnClickListener(new ViewOnClickListenerC2390k(item));
        int size = this.f13952i.size();
        for (int i2 = 0; i2 < size && i2 < item.getProducts().size(); i2++) {
            this.f13952i.get(i2).o1t(item.getProducts().get(i2), i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f13952i.size(); i2++) {
            arrayList.add(((RankListThemeElement) this.f9849q).getProducts().get(i2).trackId);
        }
        return arrayList;
    }
}
