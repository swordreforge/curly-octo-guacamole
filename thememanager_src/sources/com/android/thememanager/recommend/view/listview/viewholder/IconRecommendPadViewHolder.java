package com.android.thememanager.recommend.view.listview.viewholder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.IconRecommendElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;

/* JADX INFO: loaded from: classes2.dex */
public class IconRecommendPadViewHolder extends BaseVMViewHolder<IconRecommendElement> {

    /* JADX INFO: renamed from: g */
    private final ImageView f14153g;

    /* JADX INFO: renamed from: h */
    private int f14154h;

    /* JADX INFO: renamed from: i */
    private int f14155i;

    /* JADX INFO: renamed from: p */
    private final x2.C1735g f14156p;

    /* JADX INFO: renamed from: s */
    private final TextView f14157s;

    /* JADX INFO: renamed from: y */
    private final View f14158y;

    public IconRecommendPadViewHolder(View itemView, RecommendVMListViewAdapter adapter) {
        super(itemView, adapter);
        View viewFindViewById = itemView.findViewById(R.id.thumbnail_container);
        this.f14158y = viewFindViewById;
        this.f14153g = (ImageView) itemView.findViewById(R.id.online_icon_thumbnail);
        this.f14157s = (TextView) itemView.findViewById(R.id.online_icon_title);
        this.f14154h = adapter.jk();
        this.f14155i = itemView.getContext().getResources().getDimensionPixelSize(R.dimen.pad_icon_detail_thumbnail_height);
        if (this.f14154h <= 0) {
            this.f14154h = itemView.getResources().getDimensionPixelSize(R.dimen.pad_icon_subject_thumbnail_width);
        }
        this.f14156p = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(C1819o.t8r(), itemView.getContext().getResources().getDimensionPixelSize(R.dimen.pad_online_theme_thumb_radius)));
        C6077k.jk(viewFindViewById);
    }

    public static IconRecommendPadViewHolder d2ok(ViewGroup parent, RecommendVMListViewAdapter adapter) {
        return new IconRecommendPadViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.pad_element_normal_icon_item, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void oc(UIImageWithLink uIImageWithLink, View view) {
        C2451n.toq toqVarM8810y = C2451n.m8797g().m8810y(uIImageWithLink.imageUrl);
        if (uIImageWithLink.link != null) {
            m6708z().d8wk(uIImageWithLink.link.trackId, null);
            toqVarM8810y.toq(uIImageWithLink.link.productType);
        }
        toqVarM8810y.x2(wvg().m8792t());
        toqVarM8810y.m8804g(wvg().oc());
        C2451n.m8803y((ActivityC0891q) this.itemView.getContext(), null, uIImageWithLink.link, toqVarM8810y);
    }

    @Override // com.android.thememanager.basemodule.base.BaseVMAdapter.ViewHolder
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public void o1t(IconRecommendElement item, int position) {
        String str;
        super.o1t(item, position);
        final UIImageWithLink imageBanner = item.getImageBanner();
        this.f14157s.setVisibility(0);
        UILink uILink = imageBanner.link;
        if (uILink != null) {
            this.f14157s.setText(uILink.title);
            UILink uILink2 = imageBanner.link;
            if (uILink2 != null && (str = uILink2.title) != null) {
                C1812k.toq(this.f14153g, str);
            }
            if (item.getImageBanner() != null && item.getImageBanner().imgWidth > 0 && item.getImageBanner().imgHeight > 0) {
                this.f14155i = (int) (this.f14154h * (item.getImageBanner().imgHeight / item.getImageBanner().imgWidth));
            }
        }
        ViewGroup.LayoutParams layoutParams = this.f14153g.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f14154h, this.f14155i);
        } else {
            layoutParams.width = this.f14154h;
            layoutParams.height = this.f14155i;
        }
        this.f14153g.setLayoutParams(layoutParams);
        com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.itemView.getContext(), imageBanner.imageUrl, this.f14153g, this.f14156p);
        this.f14158y.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.kja0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14382k.oc(imageBanner, view);
            }
        });
    }
}
