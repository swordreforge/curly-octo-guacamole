package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.resource.C2162k;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.toq;
import com.bumptech.glide.load.engine.AbstractC3039p;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001b.InterfaceC1357q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLargeIconViewHolder extends BatchOperationAdapter.BatchViewHolder<C2162k> {

    /* JADX INFO: renamed from: h */
    private ImageView f12797h;

    /* JADX INFO: renamed from: i */
    private int f12798i;

    /* JADX INFO: renamed from: p */
    private TextView f12799p;

    /* JADX INFO: renamed from: s */
    private TextView f12800s;

    /* JADX INFO: renamed from: y */
    private final TextView f12801y;

    public LocalLargeIconViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12797h = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f12801y = (TextView) itemView.findViewById(R.id.title);
        this.f12800s = (TextView) itemView.findViewById(R.id.update_flag);
        this.f12799p = (TextView) itemView.findViewById(R.id.currentUsing);
        C6077k.cdj(itemView);
        this.f12798i = adapter.m7311j();
    }

    /* JADX INFO: renamed from: l */
    public static LocalLargeIconViewHolder m8254l(ViewGroup parent, BatchOperationAdapter adapter) {
        return new LocalLargeIconViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_local_largeicon_icon, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        ArrayList arrayList = new ArrayList();
        List<T> listNi7 = ((BaseLocalResourceAdapter) this.f9847k).ni7();
        Iterator it = listNi7.iterator();
        while (it.hasNext()) {
            arrayList.add(((BaseLocalResourceAdapter.toq) it.next()).m8241k());
        }
        Intent intentM9542k = toq.m9542k(ki(), this.f9848n, arrayList, "largeicons");
        if (this.f9848n < listNi7.size()) {
            intentM9542k.putExtra("packageName", ((C2162k) listNi7.get(this.f9848n)).f60449ld6);
            ki().startActivityForResult(intentM9542k, intentM9542k.getIntExtra(InterfaceC1357q.f53873fu4, 1));
            return;
        }
        Log.d("LocalLargeIconViewHolder", "click position is :" + this.f9848n + ",item sum is : " + listNi7.size());
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(C2162k item, int position) {
        super.o1t(item, position);
        ViewGroup.LayoutParams layoutParams = this.f12797h.getLayoutParams();
        int i2 = this.f12798i;
        layoutParams.width = i2;
        layoutParams.height = i2;
        Resource resourceM8241k = item.m8241k();
        String strQrj = C1792n.qrj(item);
        if (resourceM8241k == null || resourceM8241k.getLocalInfo().isOfficial()) {
            this.f12797h.setScaleX(1.08f);
            this.f12797h.setScaleY(1.08f);
        } else {
            this.f12797h.setScaleX(1.0f);
            this.f12797h.setScaleY(1.0f);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(vyq.zurt("icons"));
        sb.append(vyq.fu4("icons"));
        sb.append(resourceM8241k == null ? "" : resourceM8241k.getLocalInfo().getLargeIconPackageName());
        x2.C1735g c1735gDd = x2.fn3e().m6793r(x2.ki(position, 0.0f)).dd(sb.toString());
        c1735gDd.d3(resourceM8241k == null || resourceM8241k.getLocalInfo().isOfficial() ? AbstractC3039p.f62798toq : AbstractC3039p.f18436k);
        x2.m6782y(ki(), strQrj, this.f12797h, c1735gDd);
        this.f12801y.setText((resourceM8241k == null || resourceM8241k.getLocalInfo().isOfficial()) ? C1819o.m7168z() : (resourceM8241k.getLocalInfo() == null || resourceM8241k.getLocalInfo().getTitle() == null) ? (String) fu4.f7l8(resourceM8241k.getLocalInfo().getTitles(), fu4.m7067k()) : resourceM8241k.getTitle());
        if (!(resourceM8241k == null && zsr0.toq.m28219g(item.f60450x2, null, true)) && (resourceM8241k == null || !zsr0.toq.m28219g(item.f60450x2, resourceM8241k.getLocalId(), resourceM8241k.getLocalInfo().isOfficial()))) {
            this.f12801y.setTextColor(fn3e().getResources().getColor(R.color.normal_back_color));
            this.f12799p.setVisibility(8);
            C1812k.zy(item.m8241k() == null ? C1819o.m7168z() : resourceM8241k.getTitle(), this.itemView, this.f12797h);
        } else {
            this.f12801y.setTextColor(fn3e().getResources().getColor(R.color.setting_find_more_text));
            this.f12799p.setVisibility(0);
            C1812k.zy(kja0.ld6(R.string.current_using), this.itemView, this.f12797h);
        }
        if (resourceM8241k != null && C2320q.hb(resourceM8241k, C1791k.getInstance(((BaseLocalResourceAdapter) this.f9847k).c8jq()))) {
            this.f12800s.setVisibility(0);
        } else {
            this.f12800s.setVisibility(8);
        }
    }
}
