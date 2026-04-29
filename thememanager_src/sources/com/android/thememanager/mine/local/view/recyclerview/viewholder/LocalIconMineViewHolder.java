package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.content.Intent;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.base.view.listview.viewholder.IconMineViewHolder;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p001b.InterfaceC1357q;
import zsr0.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalIconMineViewHolder extends IconMineViewHolder<BaseLocalResourceAdapter.toq> {

    /* JADX INFO: renamed from: t */
    private TextView f12796t;

    public LocalIconMineViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12796t = (TextView) itemView.findViewById(R.id.update_flag);
    }

    public static LocalIconMineViewHolder n5r1(ViewGroup parent, BaseLocalResourceAdapter adapter) {
        return new LocalIconMineViewHolder(IconMineViewHolder.m8217l(parent, adapter.fn3e()), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseLocalResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        C1812k.zy(item.m8241k().getTitle(), this.f12705y, this.itemView);
        Resource resourceM8241k = item.m8241k();
        String strLd6 = C1792n.ld6(resourceM8241k);
        if (C1792n.n5r1(strLd6)) {
            this.f12706z.jk(4);
            this.f12706z.mcp(new Rect(0, fn3e().getResources().getDimensionPixelSize(R.dimen.local_icon_old_thumbnail_crop_top), this.f12705y.getLayoutParams().width, fn3e().getResources().getDimensionPixelSize(R.dimen.local_icon_old_thumbnail_crop_bottom)));
            this.f12706z.m6794t(0.01f).wvg(0);
        } else {
            this.f12706z.jk(0);
            this.f12706z.mcp(null);
        }
        x2.m6782y(ki(), strLd6, this.f12705y, this.f12706z);
        String title = (resourceM8241k.getLocalInfo() == null || resourceM8241k.getLocalInfo().getTitles() == null) ? resourceM8241k.getTitle() : (String) fu4.f7l8(resourceM8241k.getLocalInfo().getTitles(), fu4.m7067k());
        this.f12704s.setText(title + '\r');
        if (toq.m28221n(bf2.toq.toq(), resourceM8241k, ((BaseLocalResourceAdapter) this.f9847k).c8jq())) {
            this.f12704s.setTextColor(fn3e().getResources().getColor(R.color.setting_find_more_text));
            this.f12701h.setTextColor(bf2.toq.toq().getResources().getColor(R.color.setting_find_more_text));
            this.f12701h.setVisibility(0);
            this.f12701h.setText(R.string.current_using);
        } else {
            this.f12704s.setTextColor(fn3e().getResources().getColor(R.color.resource_primary_color));
            this.f12701h.setTextColor(bf2.toq.toq().getResources().getColor(R.color.resource_primary_color));
            this.f12701h.setVisibility(4);
        }
        if (C2320q.hb(resourceM8241k, C1791k.getInstance(((BaseLocalResourceAdapter) this.f9847k).c8jq()))) {
            this.f12796t.setVisibility(0);
        } else {
            this.f12796t.setVisibility(8);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        if (C1819o.dd(ki())) {
            nn86.m7150k(R.string.multiwindow_no_support_icon, 0);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((BaseLocalResourceAdapter) this.f9847k).ni7().iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseLocalResourceAdapter.toq) it.next()).m8241k());
        }
        Intent intentM9542k = com.android.thememanager.toq.m9542k(ki(), this.f9848n, arrayList, "icons");
        ki().startActivityForResult(intentM9542k, intentM9542k.getIntExtra(InterfaceC1357q.f53873fu4, 1));
    }
}
