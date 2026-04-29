package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.recommend.model.entity.element.TopTitleElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ElementTopTitleViewHolder extends BaseViewHolder<TopTitleElement> {

    /* JADX INFO: renamed from: g */
    private TextView f14089g;

    /* JADX INFO: renamed from: s */
    private TextView f14090s;

    /* JADX INFO: renamed from: y */
    private TextView f14091y;

    public ElementTopTitleViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14089g = (TextView) itemView.findViewById(R.id.title);
        this.f14091y = (TextView) itemView.findViewById(R.id.summary);
        this.f14090s = (TextView) itemView.findViewById(R.id.online_text);
        if (adapter == null || !"widget_suit".equals(adapter.lvui())) {
            return;
        }
        x9kr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m8687l(TopTitleElement topTitleElement, View view) {
        if (topTitleElement.uiLink != null) {
            C2451n.m8802s(ki(), ni7(), topTitleElement.uiLink, wvg());
            m6706z().d8wk(topTitleElement.uiLink.trackId, null);
        }
    }

    public static ElementTopTitleViewHolder n5r1(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ElementTopTitleViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_top_title, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(final TopTitleElement item, int position) {
        super.o1t(item, position);
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.qrj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14395k.m8687l(item, view);
            }
        });
        if (wvg().n5r1()) {
            this.itemView.setPadding(0, 0, 0, 0);
            if (C1807g.zurt()) {
                this.f14090s.setVisibility(8);
                return;
            } else {
                this.f14090s.setVisibility(0);
                return;
            }
        }
        this.f14089g.setText(item.title);
        this.f14089g.setVisibility(0);
        if (TextUtils.isEmpty(item.subTitle)) {
            this.f14091y.setVisibility(8);
        } else {
            this.f14091y.setText(item.subTitle);
            this.f14091y.setVisibility(0);
        }
    }
}
