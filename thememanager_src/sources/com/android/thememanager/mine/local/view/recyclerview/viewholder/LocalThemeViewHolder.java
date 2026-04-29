package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.toq;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalThemeViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    private TextView f12811h;

    /* JADX INFO: renamed from: p */
    private ImageView f12812p;

    /* JADX INFO: renamed from: s */
    protected TextView f12813s;

    /* JADX INFO: renamed from: y */
    protected TextView f12814y;

    public LocalThemeViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12812p = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f12814y = (TextView) itemView.findViewById(R.id.title);
        this.f12813s = (TextView) itemView.findViewById(R.id.currentUsing);
        this.f12811h = (TextView) itemView.findViewById(R.id.update_flag);
        C6077k.wvg((FrameLayout) itemView.findViewById(R.id.thumbnail_fl), this.f12812p);
    }

    /* JADX INFO: renamed from: l */
    public static LocalThemeViewHolder m8260l(ViewGroup parent, BaseLocalResourceAdapter adapter) {
        return new LocalThemeViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_local_theme, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((BaseLocalResourceAdapter) this.f9847k).ni7().iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseLocalResourceAdapter.toq) it.next()).m8241k());
        }
        Intent intentKi = TextUtils.isEmpty(((Resource) arrayList.get(this.f9848n)).getLocalId()) ? toq.ki(ki(), ni7(), ((Resource) arrayList.get(this.f9848n)).getOnlineId(), null, null, Boolean.FALSE, "THEME") : toq.m9542k(ki(), this.f9848n, arrayList, null);
        ki().startActivityForResult(intentKi, intentKi.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseLocalResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        Resource resourceM8241k = item.m8241k();
        C1791k c1791k = C1791k.getInstance(((BaseLocalResourceAdapter) this.f9847k).c8jq());
        x2.f7l8(ki(), C1792n.t8r(resourceM8241k), this.f12812p, x2.ki(position, 0.0f), 0);
        this.f12814y.setText((resourceM8241k.getLocalInfo() == null || resourceM8241k.getLocalInfo().getTitles() == null) ? resourceM8241k.getTitle() : (String) fu4.f7l8(resourceM8241k.getLocalInfo().getTitles(), fu4.m7067k()));
        if (zsr0.toq.m28221n(bf2.toq.toq(), resourceM8241k, ((BaseLocalResourceAdapter) this.f9847k).c8jq())) {
            this.f12813s.setVisibility(0);
            this.f12814y.setTextColor(fn3e().getResources().getColor(R.color.setting_find_more_text));
            C1812k.zy(kja0.ld6(R.string.current_using), this.itemView, this.f12812p);
        } else {
            this.f12813s.setVisibility(4);
            this.f12814y.setTextColor(fn3e().getResources().getColor(R.color.resource_primary_color));
            C1812k.zy(item.m8241k().getTitle(), this.itemView, this.f12812p);
        }
        if (C2320q.hb(resourceM8241k, c1791k)) {
            this.f12811h.setVisibility(0);
        } else {
            this.f12811h.setVisibility(8);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return o1t.m7169g(fn3e()) ? this.itemView : this.itemView.findViewById(R.id.thumbnail);
    }
}
