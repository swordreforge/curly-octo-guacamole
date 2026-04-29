package com.android.thememanager.mine.local.view.recyclerview.adapter;

import android.view.ViewGroup;
import bf2.toq;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalAodMineViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder;
import gbni.InterfaceC6058k;
import java.util.List;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalAodAdapter extends BaseLocalResourceAdapter implements HeaderTipsViewHolder.zy {

    /* JADX INFO: renamed from: e */
    public static final String f12779e = "message_header_id";

    /* JADX INFO: renamed from: j */
    public static final int f12780j = 1;

    /* JADX INFO: renamed from: o */
    public static final int f12781o = 2;

    public LocalAodAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, InterfaceC6058k.k presenter) {
        super(viewContainer, resourceCode, presenter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup viewGroup, int viewType) {
        return viewType != 2 ? LocalAodMineViewHolder.n5r1(viewGroup, this) : HeaderTipsViewHolder.n5r1(viewGroup, this, this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return "message_header_id".equals(((BaseLocalResourceAdapter.toq) this.f9846q.get(position)).getId()) ? 2 : 1;
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    protected boolean gyi(Resource resource, C1791k resourceContext) {
        return C1792n.d3(resource) || C1792n.gvn7(resource) ? !C2320q.o1t(toq.toq(), "spaod").contains(resource.getLocalId()) : super.gyi(resource, resourceContext);
    }

    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder.zy
    public void kja0() {
        if (this.f9846q.size() != 0 && "message_header_id".equals(((BaseLocalResourceAdapter.toq) this.f9846q.get(0)).getId())) {
            this.f9846q.remove(0);
            notifyDataSetChanged();
        }
    }

    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder.zy
    public String n7h() {
        return fn3e().getResources().getString(R.string.enable_aod_list);
    }

    @Override // com.android.thememanager.mine.remote.view.listview.viewholder.HeaderTipsViewHolder.zy
    public void x2() {
        o1t.m7173n(ki(), fu4(), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    public void xwq3(@dd List<Resource> list) {
        super.xwq3(list);
        if (this.f9846q.size() <= 0 || !C1819o.m7153f()) {
            return;
        }
        BaseLocalResourceAdapter.toq toqVar = new BaseLocalResourceAdapter.toq(null);
        toqVar.m8243q("message_header_id");
        this.f9846q.add(0, (T) toqVar);
    }
}
