package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.StaggeredRingtoneSubjectElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRecommendationRingtoneItemViewHolder extends StaggerViewHolder<StaggeredRingtoneSubjectElement> {

    /* JADX INFO: renamed from: c */
    private LinearLayout f13980c;

    /* JADX INFO: renamed from: e */
    private ArrayList<SubViewHolder> f13981e;

    /* JADX INFO: renamed from: f */
    private TextView f13982f;

    /* JADX INFO: renamed from: l */
    private TextView f13983l;

    public static class SubViewHolder extends BaseRingtoneElementViewHolder<UIProduct> {
        SubViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
            super(itemView, adapter);
        }

        /* JADX INFO: renamed from: d */
        private void m8640d(View ringtoneItemView, UIProduct product, TextView title, TextView ringToneInfo, View applyBtn) {
            title.setText(product.name);
            StringBuilder sb = new StringBuilder();
            sb.append(product.downloadCount);
            sb.append(this.f13807y);
            sb.append(product.playtimeDisplay);
            String str = product.title;
            if (!TextUtils.isEmpty(str)) {
                sb.append(this.f13807y);
                sb.append(str);
            }
            ringToneInfo.setText(sb.toString());
            m8590u(applyBtn, null, product, false);
            gyi(ringtoneItemView, ringToneInfo, product);
        }

        /* JADX INFO: renamed from: v */
        private void m8641v(String id, TextView ringToneInfo, TextView title) {
            if (!this.f13799g.m8525p(id)) {
                ringToneInfo.setText(R.string.audition_ringtone);
                title.setSelected(false);
            } else {
                this.f13799g.m8523k();
                ringToneInfo.setText(R.string.playing_ringtone);
                title.setSelected(true);
            }
        }

        @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
        /* JADX INFO: renamed from: xwq3, reason: merged with bridge method [inline-methods] */
        public void o1t(UIProduct item, int position) {
            super.o1t(item, position);
            C1812k.toq(this.itemView, item.name);
            TextView textView = (TextView) this.itemView.findViewById(R.id.title);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.count);
            View viewFindViewById = this.itemView.findViewById(R.id.apply);
            m8641v(item.uuid, (TextView) this.itemView.findViewById(R.id.audition), textView);
            m8640d(this.itemView, item, textView, textView2, viewFindViewById);
        }
    }

    public ElementRecommendationRingtoneItemViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13981e = new ArrayList<>();
        this.f14262g = ki().getResources().getDimensionPixelSize(mcp() ? R.dimen.theme_settings_img_radius : R.dimen.round_corner_default);
        this.f13983l = (TextView) itemView.findViewById(R.id.title);
        this.f13982f = (TextView) itemView.findViewById(R.id.numbers);
        this.f13980c = (LinearLayout) itemView.findViewById(R.id.ringtone_container);
    }

    /* JADX INFO: renamed from: l */
    public static ElementRecommendationRingtoneItemViewHolder m8639l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRecommendationRingtoneItemViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_home_recommendation_ringtone_list, parent, false), adapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: n */
    public void mo8580n() {
        super.mo8580n();
        for (int i2 = 0; i2 < ((StaggeredRingtoneSubjectElement) this.f9849q).getProducts().size(); i2++) {
            this.f13981e.get(i2).mo8580n();
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void o1t(StaggeredRingtoneSubjectElement element, int position) {
        UIImageWithLink imageBanner;
        super.o1t(element, position);
        this.f13980c.removeAllViews();
        if (element.getProducts() == null || element.getProducts().size() == 0 || (imageBanner = element.getImageBanner()) == null || TextUtils.isEmpty(imageBanner.title)) {
            return;
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), Integer.valueOf(com.android.thememanager.basemodule.imageloader.x2.m6775h(position)), this.f14263h, this.f14264i.a9(false));
        this.f13983l.setText(imageBanner.title);
        this.f13981e.clear();
        int size = element.getProducts().size();
        this.f13982f.setText(ki().getResources().getQuantityString(R.plurals.ringtone_nums, size, Integer.valueOf(size)));
        for (int i2 = 0; i2 < size; i2++) {
            UIProduct uIProduct = element.getProducts().get(i2);
            View viewInflate = uIProduct.adInfo != null ? LayoutInflater.from(ki()).inflate(R.layout.rc_ringtone_item_style_ad_layout, (ViewGroup) null) : LayoutInflater.from(ki()).inflate(R.layout.rc_home_recommendation_ringtone_item, (ViewGroup) null);
            SubViewHolder subViewHolder = new SubViewHolder(viewInflate, wvg());
            subViewHolder.o1t(uIProduct, i2);
            this.f13981e.add(subViewHolder);
            this.f13980c.addView(viewInflate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((StaggeredRingtoneSubjectElement) this.f9849q).getProducts() == null || ((StaggeredRingtoneSubjectElement) this.f9849q).getProducts().size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<UIProduct> it = ((StaggeredRingtoneSubjectElement) this.f9849q).getProducts().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().trackId);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    public void zy() {
        super.zy();
        for (int i2 = 0; i2 < ((StaggeredRingtoneSubjectElement) this.f9849q).getProducts().size(); i2++) {
            this.f13981e.get(i2).zy();
        }
    }
}
