package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.recommend.model.entity.element.RingtoneRankingElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementRingtoneRankingViewHolder extends BaseViewHolder<RingtoneRankingElement> {

    /* JADX INFO: renamed from: g */
    private ImageView f13987g;

    /* JADX INFO: renamed from: h */
    private TextView f13988h;

    /* JADX INFO: renamed from: i */
    private View f13989i;

    /* JADX INFO: renamed from: p */
    private TextView f13990p;

    /* JADX INFO: renamed from: s */
    private TextView f13991s;

    /* JADX INFO: renamed from: y */
    private TextView f13992y;

    /* JADX INFO: renamed from: z */
    private int f13993z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ElementRingtoneRankingViewHolder$k */
    class ViewOnClickListenerC2395k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ RingtoneRankingElement f13994k;

        ViewOnClickListenerC2395k(final RingtoneRankingElement val$element) {
            this.f13994k = val$element;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ElementRingtoneRankingViewHolder.this.jk(this.f13994k.getSubjectUuid(), this.f13994k.getSubjectTitle());
            ElementRingtoneRankingViewHolder.this.m6706z().d8wk(this.f13994k.getTrackId(), null);
        }
    }

    public ElementRingtoneRankingViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f13987g = (ImageView) itemView.findViewById(R.id.image);
        this.f13992y = (TextView) itemView.findViewById(R.id.singer);
        this.f13991s = (TextView) itemView.findViewById(R.id.info1);
        this.f13990p = (TextView) itemView.findViewById(R.id.info2);
        this.f13988h = (TextView) itemView.findViewById(R.id.info3);
        this.f13989i = itemView.findViewById(R.id.divider);
        this.f13993z = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_recommend_three_img_radius);
        C6077k.ld6(itemView);
    }

    /* JADX INFO: renamed from: l */
    public static ElementRingtoneRankingViewHolder m8643l(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementRingtoneRankingViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_ringtone_ranking, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(final RingtoneRankingElement element, int position) {
        super.o1t(element, position);
        if (this.f13989i != null) {
            if (element.isShowDivider()) {
                this.f13989i.setVisibility(0);
            } else {
                this.f13989i.setVisibility(8);
            }
        }
        com.android.thememanager.basemodule.imageloader.x2.f7l8(ki(), element.getSubjectImageUrl(), this.f13987g, com.android.thememanager.basemodule.imageloader.x2.ki(position, this.f13993z), this.f13993z);
        this.f13992y.setText(element.getSubjectTitle());
        UIProduct uIProduct = element.getProducts().get(0);
        UIProduct uIProduct2 = element.getProducts().get(1);
        UIProduct uIProduct3 = element.getProducts().get(2);
        this.f13991s.setText("1 " + uIProduct.name);
        this.f13990p.setText("2 " + uIProduct2.name);
        this.f13988h.setText("3 " + uIProduct3.name);
        this.itemView.setOnClickListener(new ViewOnClickListenerC2395k(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(((RingtoneRankingElement) this.f9849q).getTrackId());
        return arrayList;
    }
}
