package com.android.thememanager.recommend.view.listview.viewholder;

import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.nmn5;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.base.BaseVMAdapter;
import com.android.thememanager.model.LargeIconSplitResource;
import com.android.thememanager.recommend.model.entity.element.LargeIconFourItemCardTitleElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.viewmodel.RecommendVMListViewAdapter;
import com.android.thememanager.router.recommend.entity.UILink;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconFourItemCardTitleViewHolder extends BaseVMViewHolder<LargeIconFourItemCardTitleElement> implements View.OnClickListener {

    /* JADX INFO: renamed from: s */
    private static final String f14183s = "LargeIconCardTitle";

    /* JADX INFO: renamed from: g */
    private TextView f14184g;

    /* JADX INFO: renamed from: y */
    private TextView f14185y;

    public LargeIconFourItemCardTitleViewHolder(@InterfaceC7396q @lvui View itemView, RecommendVMListViewAdapter adapter) {
        super(itemView, adapter);
        jk();
    }

    private void lvui(UILink uiLink) {
        LargeIconSplitResource largeIconSplitResourceTww7 = ni7() instanceof nmn5 ? ((nmn5) ni7()).tww7() : null;
        if (largeIconSplitResourceTww7 == null) {
            return;
        }
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.tkle, largeIconSplitResourceTww7.getTitle());
        C1708s.f7l8().ld6().ni7(C1706p.m6650h(largeIconSplitResourceTww7.getLink(), uiLink.trackId, null, "more", arrayMap));
    }

    public static LargeIconFourItemCardTitleViewHolder oc(ViewGroup parent, RecommendVMListViewAdapter adapter) {
        return new LargeIconFourItemCardTitleViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_large_icon_four_item_card_title, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseVMAdapter.ViewHolder
    /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
    public void o1t(LargeIconFourItemCardTitleElement item, int position) {
        super.o1t(item, position);
        UILink uILink = item.link;
        if (uILink != null) {
            this.f14184g.setText(uILink.title);
        }
        this.f14185y.setText(String.valueOf(item.count));
        this.f14185y.setOnClickListener(this);
    }

    public void jk() {
        TextView textView = (TextView) this.itemView.findViewById(R.id.large_icon_title);
        this.f14184g = textView;
        BaseVMAdapter baseVMAdapter = this.f9852k;
        if (baseVMAdapter instanceof RecommendVMListViewAdapter) {
            textView.setMaxWidth(((RecommendVMListViewAdapter) baseVMAdapter).jk() - fn3e().getResources().getDimensionPixelSize(R.dimen.large_icon_card_title_count_width));
        }
        this.f14185y = (TextView) this.itemView.findViewById(R.id.large_icon_count);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (R.id.large_icon_count == v2.getId()) {
            if (((LargeIconFourItemCardTitleElement) this.f9854q).link == null) {
                Log.w(f14183s, "mEntry.link is null");
                return;
            }
            C2451n.toq toqVarM8797g = C2451n.m8797g();
            toqVarM8797g.toq(((LargeIconFourItemCardTitleElement) this.f9854q).link.productType);
            toqVarM8797g.x2("largeicons");
            C2451n.m8803y((AbstractActivityC1717k) this.itemView.getContext(), null, ((LargeIconFourItemCardTitleElement) this.f9854q).link, toqVarM8797g);
            lvui(((LargeIconFourItemCardTitleElement) this.f9854q).link);
        }
    }
}
