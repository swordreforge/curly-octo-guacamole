package com.android.thememanager.mine.local.view.recyclerview.adapter;

import android.view.ViewGroup;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalResourceViewHolder;
import gbni.InterfaceC6058k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalResourceAdapter extends BaseLocalResourceAdapter {
    public LocalResourceAdapter(@lvui InterfaceC1719p viewContainer, String resourceCode, InterfaceC6058k.k presenter) {
        super(viewContainer, resourceCode, presenter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return LocalResourceViewHolder.m8259l(parent, this);
    }
}
