package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.recommend.model.entity.element.TextImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementTextImageBannerViewHolder extends BaseViewHolder<TextImageBannerElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f14065g;

    /* JADX INFO: renamed from: y */
    private int f14066y;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementTextImageBannerViewHolder$k */
    class ViewOnClickListenerC2404k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ TextImageBannerElement f14067k;

        ViewOnClickListenerC2404k(final TextImageBannerElement val$item) {
            this.f14067k = val$item;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            C2451n.m8802s(ElementTextImageBannerViewHolder.this.ki(), ElementTextImageBannerViewHolder.this.ni7(), this.f14067k.getLink(), ElementTextImageBannerViewHolder.this.wvg());
            if (this.f14067k.getLink() != null) {
                ElementTextImageBannerViewHolder.this.m6706z().d8wk(this.f14067k.getLink().trackId, null);
            }
        }
    }

    public ElementTextImageBannerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14065g = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14066y = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_default);
        C6077k.o1t(this.f14065g);
    }

    /* JADX INFO: renamed from: l */
    public static ElementTextImageBannerViewHolder m8675l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementTextImageBannerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_text_image_banner, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final TextImageBannerElement item, int position) {
        super.o1t(item, position);
        com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), item.getImageUrl(), this.f14065g, com.android.thememanager.basemodule.imageloader.x2.t8r(position, this.f14066y, wvg().ncyb()), this.f14066y);
        this.f14065g.setOnClickListener(new ViewOnClickListenerC2404k(item));
        if (TextUtils.isEmpty(item.getTitle())) {
            return;
        }
        C1812k.toq(this.f14065g, item.getTitle());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((TextImageBannerElement) this.f9849q).getLink().trackId);
        return arrayList;
    }
}
