package com.android.thememanager.mine.local.view.recyclerview.adapter;

import android.view.ViewGroup;
import bf2.toq;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalLauncherViewHolder;
import gbni.InterfaceC6058k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLauncherAdapter extends LocalThemeAdapter {
    public LocalLauncherAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, InterfaceC6058k.k presenter) {
        super(viewContainer, resourceCode, presenter);
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.LocalThemeAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: d */
    public BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        return LocalLauncherViewHolder.m8256f(viewGroup, this);
    }

    @Override // com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter
    protected boolean gyi(Resource resource, C1791k resourceContext) {
        return C1792n.d3(resource) || C1792n.gvn7(resource) ? !C2320q.o1t(toq.toq(), "spwallpaper").contains(resource.getLocalId()) : super.gyi(resource, resourceContext);
    }
}
