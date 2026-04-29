package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.toq;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalResourceViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    private int f12807h;

    /* JADX INFO: renamed from: p */
    private TextView f12808p;

    /* JADX INFO: renamed from: s */
    private TextView f12809s;

    /* JADX INFO: renamed from: y */
    private ImageView f12810y;

    public LocalResourceViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12810y = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f12809s = (TextView) itemView.findViewById(R.id.title);
        this.f12808p = (TextView) itemView.findViewById(R.id.currentUsing);
        C6077k.wvg((FrameLayout) itemView.findViewById(R.id.thumbnail_fl), this.f12810y);
        this.f12807h = ki().getResources().getDimensionPixelSize(R.dimen.round_corner_non_recommend_three_img_radius);
    }

    /* JADX INFO: renamed from: l */
    public static LocalResourceViewHolder m8259l(ViewGroup parent, BaseLocalResourceAdapter adapter) {
        return new LocalResourceViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_local_theme, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((BaseLocalResourceAdapter) this.f9847k).ni7().iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseLocalResourceAdapter.toq) it.next()).m8241k());
        }
        Intent intentM9542k = toq.m9542k(ki(), this.f9848n, arrayList, null);
        ki().startActivityForResult(intentM9542k, intentM9542k.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseLocalResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        C1812k.zy(item.m8241k().getTitle(), this.itemView, this.f12810y);
        Resource resourceM8241k = item.m8241k();
        String strC8jq = ((BaseLocalResourceAdapter) this.f9847k).c8jq();
        x2.f7l8(ki(), zsr0.toq.zy(resourceM8241k, strC8jq), this.f12810y, x2.ki(position, this.f12807h), this.f12807h);
        this.f12809s.setText((resourceM8241k.getLocalInfo() == null || resourceM8241k.getLocalInfo().getTitles() == null) ? resourceM8241k.getTitle() : (String) fu4.f7l8(resourceM8241k.getLocalInfo().getTitles(), fu4.m7067k()));
        if (C1792n.d3(resourceM8241k) || C1792n.gvn7(resourceM8241k)) {
            strC8jq = "spwallpaper";
        }
        if (zsr0.toq.m28221n(bf2.toq.toq(), resourceM8241k, strC8jq)) {
            this.f12808p.setVisibility(0);
            this.f12809s.setTextColor(fn3e().getResources().getColor(R.color.setting_find_more_text));
        } else {
            this.f12808p.setVisibility(4);
            this.f12809s.setTextColor(fn3e().getResources().getColor(R.color.resource_primary_color));
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return this.itemView.findViewById(R.id.thumbnail);
    }
}
