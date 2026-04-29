package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.ImageTextBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementImageTextViewHolder extends BaseViewHolder<ImageTextBannerElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f13924g;

    /* JADX INFO: renamed from: p */
    private int f13925p;

    /* JADX INFO: renamed from: s */
    private TextView f13926s;

    /* JADX INFO: renamed from: y */
    private TextView f13927y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementImageTextViewHolder$k */
    class ViewOnClickListenerC2388k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ImageTextBannerElement f13928k;

        ViewOnClickListenerC2388k(final ImageTextBannerElement val$item) {
            this.f13928k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.m8802s(ElementImageTextViewHolder.this.ki(), ElementImageTextViewHolder.this.ni7(), this.f13928k.getLink(), ElementImageTextViewHolder.this.wvg());
            if (this.f13928k.getLink() != null) {
                ElementImageTextViewHolder.this.m6706z().d8wk(this.f13928k.getLink().trackId, null);
            }
        }
    }

    public ElementImageTextViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13924g = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f13927y = (TextView) itemView.findViewById(R.id.title);
        this.f13926s = (TextView) itemView.findViewById(R.id.des);
        this.f13925p = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_recommend_three_img_radius);
        C6077k.o1t(this.f13924g);
    }

    /* JADX INFO: renamed from: l */
    public static ElementImageTextViewHolder m8622l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementImageTextViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_image_text_banner, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final ImageTextBannerElement item, int position) {
        super.o1t(item, position);
        com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), item.getImageUrl(), this.f13924g, com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f13925p, wvg().ncyb()), this.f13925p);
        this.f13927y.setText(item.getTitle());
        this.f13926s.setText(item.getSubTitle());
        this.f13924g.setOnClickListener(new ViewOnClickListenerC2388k(item));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((ImageTextBannerElement) this.f9849q).getLink().trackId);
        return arrayList;
    }
}
