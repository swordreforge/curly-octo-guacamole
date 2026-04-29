package com.android.thememanager.mine.local.view.recyclerview.adapter;

import android.view.ViewGroup;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalWallpaperTitleViewHolder;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalWallpaperViewHolder;
import gbni.InterfaceC6058k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import zsr0.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalWallpaperAdapter extends BaseLocalResourceAdapter {

    /* JADX INFO: renamed from: a */
    public static final int f12789a = 1;

    /* JADX INFO: renamed from: b */
    public static final int f12790b = 0;

    /* JADX INFO: renamed from: x */
    public static final int f12791x = 2;

    /* JADX INFO: renamed from: e */
    private int f12792e;

    /* JADX INFO: renamed from: j */
    private List<Resource> f12793j;

    /* JADX INFO: renamed from: m */
    private boolean f12794m;

    /* JADX INFO: renamed from: o */
    private List<Resource> f12795o;

    public LocalWallpaperAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, InterfaceC6058k.k presenter, boolean isNightMode) {
        super(viewContainer, resourceCode, presenter);
        this.f12792e = 0;
        this.f12793j = new ArrayList();
        this.f12795o = new ArrayList();
        this.f12794m = isNightMode;
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter
    /* JADX INFO: renamed from: a */
    public void mo7308a(Set<String> deletedItemIds) {
        super.mo7308a(deletedItemIds);
        Iterator<Resource> it = this.f12795o.iterator();
        while (it.hasNext()) {
            Resource next = it.next();
            if (deletedItemIds.contains(next.getOnlineId() == null ? next.getLocalId() : next.getOnlineId())) {
                it.remove();
                this.f12792e--;
            }
        }
        if (this.f12792e != 0 || this.f9846q.size() <= 0) {
            return;
        }
        Iterator it2 = this.f9846q.iterator();
        String strValueOf = String.valueOf(1);
        while (it2.hasNext()) {
            BaseLocalResourceAdapter.toq toqVar = (BaseLocalResourceAdapter.toq) it2.next();
            if (strValueOf.equals(toqVar.getId())) {
                notifyItemRemoved(this.f9846q.indexOf(toqVar));
                it2.remove();
                return;
            }
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> holder, int position) {
        super.onBindViewHolder(holder, position);
        if (holder instanceof LocalWallpaperViewHolder) {
            Resource resourceM8241k = ((BaseLocalResourceAdapter.toq) this.f9846q.get(position)).m8241k();
            if (this.f12795o.contains(resourceM8241k)) {
                LocalWallpaperViewHolder localWallpaperViewHolder = (LocalWallpaperViewHolder) holder;
                localWallpaperViewHolder.uv6(this.f12795o.indexOf(resourceM8241k));
                localWallpaperViewHolder.m8264f(this.f12795o);
            } else if (this.f12793j.contains(resourceM8241k)) {
                LocalWallpaperViewHolder localWallpaperViewHolder2 = (LocalWallpaperViewHolder) holder;
                localWallpaperViewHolder2.uv6(this.f12793j.indexOf(resourceM8241k));
                localWallpaperViewHolder2.m8264f(this.f12793j);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        int i2 = this.f12792e;
        if (i2 == 0) {
            return position == 0 ? 2 : 0;
        }
        if (position == 0) {
            return 1;
        }
        return position == i2 + 1 ? 2 : 0;
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    protected boolean gyi(Resource resource, C1791k resourceContext) {
        return C2320q.m8489r(resource);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: mu, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType == 2 ? LocalWallpaperTitleViewHolder.m8261l(parent, this, viewType) : viewType == 1 ? LocalWallpaperTitleViewHolder.m8261l(parent, this, viewType) : LocalWallpaperViewHolder.n5r1(parent, this, this.f12794m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    public void xwq3(@dd List<Resource> list) {
        this.f9846q.clear();
        if (list == null || list.isEmpty()) {
            notifyDataSetChanged();
            return;
        }
        this.f12795o.clear();
        this.f12793j.clear();
        for (Resource resource : list) {
            String strM6971y = new C1795s(resource, C1791k.getInstance(this.f12772l)).m6971y();
            if (!C1792n.nn86(strM6971y) && !C1792n.hyr(strM6971y)) {
                this.f12795o.add(resource);
            } else if (!toq.f7l8(strM6971y)) {
                this.f12793j.add(resource);
            }
        }
        if (!this.f12795o.isEmpty()) {
            BaseLocalResourceAdapter.toq toqVar = new BaseLocalResourceAdapter.toq(null);
            toqVar.m8243q(String.valueOf(1));
            this.f9846q.add((T) toqVar);
            Iterator<Resource> it = this.f12795o.iterator();
            while (it.hasNext()) {
                this.f9846q.add((T) bo(it.next()));
            }
        }
        BaseLocalResourceAdapter.toq toqVar2 = new BaseLocalResourceAdapter.toq(null);
        toqVar2.m8243q(String.valueOf(2));
        this.f9846q.add((T) toqVar2);
        Iterator<Resource> it2 = this.f12793j.iterator();
        while (it2.hasNext()) {
            this.f9846q.add((T) bo(it2.next()));
        }
        this.f12792e = this.f12795o.size();
        notifyDataSetChanged();
    }
}
