package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.recommend.model.entity.element.UIImageBannerElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeStaggerViewHolder extends StaggerViewHolder<UIImageBannerElement> {

    /* JADX INFO: renamed from: c */
    private static final String f14273c = "com.android.thememanager.activity.ThemeSettingsActivity";

    /* JADX INFO: renamed from: f */
    private TextView f14274f;

    /* JADX INFO: renamed from: l */
    private TextView f14275l;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.ThemeStaggerViewHolder$k */
    class ViewOnClickListenerC2426k implements View.OnClickListener {
        ViewOnClickListenerC2426k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ThemeStaggerViewHolder.this.n5r1();
        }
    }

    public ThemeStaggerViewHolder(@lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        this.f14275l = (TextView) itemView.findViewById(R.id.title);
        this.f14274f = (TextView) itemView.findViewById(R.id.price);
        C6077k.o1t(this.f14267s);
    }

    /* JADX INFO: renamed from: c */
    private void m8757c(@lvui View anchor) {
        if (this.f14275l.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ((RelativeLayout.LayoutParams) this.f14275l.getLayoutParams()).addRule(16, anchor.getId());
        }
    }

    /* JADX INFO: renamed from: f */
    public static ThemeStaggerViewHolder m8758f(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new ThemeStaggerViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_home_page_recommendation_staggered_new_item_category, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void n5r1() {
        UILink uILink = ((UIImageBannerElement) this.f9849q).getImageBanner().link;
        C2451n.toq toqVarM8797g = C2451n.m8797g();
        if (ki().getClass().getName().equals(f14273c)) {
            toqVarM8797g.n7h(false);
        }
        toqVarM8797g.m8810y(((UIImageBannerElement) this.f9849q).getImageBanner().imageUrl);
        toqVarM8797g.toq(uILink.productType);
        toqVarM8797g.x2(wvg().lvui());
        toqVarM8797g.m8804g(wvg().m8549l());
        toqVarM8797g.f7l8(wvg().n5r1());
        C2451n.m8803y(ki(), ni7(), uILink, toqVarM8797g);
        m6706z().d8wk(uILink.trackId, null);
    }

    private void uv6(UIImageBannerElement item, int position) {
        UIImageWithLink imageBanner = item.getImageBanner();
        if (imageBanner == null) {
            return;
        }
        if (wvg().n5r1()) {
            this.f14274f.setVisibility(8);
            return;
        }
        this.f14274f.setText(C1815m.toq(fn3e(), imageBanner.currentPriceInCent));
        this.f14274f.setVisibility(0);
        m8757c(this.f14274f);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.StaggerViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: ncyb */
    public void o1t(UIImageBannerElement item, int position) {
        super.o1t(item, position);
        if (this.f14268t == null) {
            return;
        }
        com.android.thememanager.basemodule.imageloader.x2.m6782y(ki(), this.f14268t.imageUrl, this.f14263h, this.f14264i);
        C1812k.toq(this.f14263h, this.f14268t.title);
        uv6(item, position);
        if (TextUtils.isEmpty(this.f14268t.title)) {
            this.f14275l.setVisibility(4);
        } else {
            this.f14275l.setVisibility(0);
            this.f14275l.setText(this.f14268t.title);
        }
        UILink uILink = this.f14268t.link;
        if (uILink != null) {
            String str = uILink.productType;
            str.hashCode();
            if (str.equals("FONT") || str.equals("THEME")) {
                this.f14275l.setVisibility(0);
            } else {
                this.f14275l.setVisibility(4);
            }
        }
        this.f14267s.setOnClickListener(new ViewOnClickListenerC2426k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        if (((UIImageBannerElement) this.f9849q).getImageBanner() == null || ((UIImageBannerElement) this.f9849q).getImageBanner().link == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(((UIImageBannerElement) this.f9849q).getImageBanner().link.trackId);
        return arrayList;
    }
}
