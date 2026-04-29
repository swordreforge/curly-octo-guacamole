package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.base.view.listview.viewholder.AodMineViewHolder;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1357q;
import zsr0.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalAodMineViewHolder extends AodMineViewHolder<BaseLocalResourceAdapter.toq> {
    public LocalAodMineViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
    }

    public static LocalAodMineViewHolder n5r1(ViewGroup parent, BaseLocalResourceAdapter adapter) {
        return new LocalAodMineViewHolder(AodMineViewHolder.m8216l(parent, adapter.fn3e()), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseLocalResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        C1812k.toq(this.itemView, item.m8241k().getTitle());
        Resource resourceM8241k = item.m8241k();
        String strC8jq = ((BaseLocalResourceAdapter) this.f9847k).c8jq();
        x2.m6782y(ki(), toq.zy(resourceM8241k, strC8jq), this.f12699y, this.f12700z.m6793r(x2.ki(position, 0.0f)));
        this.f12698s.setText(item.m8241k().getTitle() + '\r');
        if (C1792n.d3(resourceM8241k) || C1792n.gvn7(resourceM8241k)) {
            strC8jq = "spaod";
        }
        if (!toq.m28221n(bf2.toq.toq(), resourceM8241k, strC8jq)) {
            this.f12698s.setTextColor(fn3e().getResources().getColor(R.color.resource_primary_color));
            this.f12696i.setTextColor(bf2.toq.toq().getResources().getColor(R.color.resource_primary_color));
            this.f12696i.setVisibility(4);
        } else {
            this.f12698s.setTextColor(fn3e().getResources().getColor(R.color.setting_find_more_text));
            this.f12696i.setTextColor(bf2.toq.toq().getResources().getColor(R.color.setting_find_more_text));
            this.f12696i.setVisibility(0);
            this.f12696i.setText(R.string.current_using);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        Intent intentM9542k;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((BaseLocalResourceAdapter) this.f9847k).ni7().iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseLocalResourceAdapter.toq) it.next()).m8241k());
        }
        Resource resource = (Resource) arrayList.get(this.f9848n);
        if (C1792n.gvn7(resource)) {
            List<RelatedResource> parentResources = resource.getParentResources();
            if (parentResources == null || parentResources.size() <= 0) {
                Log.e("LocalAod", "not found parent resource");
                return;
            }
            intentM9542k = com.android.thememanager.toq.m9539g(ki(), C1792n.zy(parentResources.get(0), C1791k.getInstance("theme")), true);
        } else {
            intentM9542k = com.android.thememanager.toq.m9542k(ki(), this.f9848n, arrayList, C1792n.d3(resource) ? "spaod" : "aod");
        }
        ki().startActivityForResult(intentM9542k, intentM9542k.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }
}
