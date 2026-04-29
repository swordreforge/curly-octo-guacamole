package com.android.thememanager.mine.remote.view.listview.adapter;

import android.view.ViewGroup;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import com.android.thememanager.mine.remote.view.listview.viewholder.LikeVideoWallpaperViewHolder;
import com.android.thememanager.mine.remote.view.listview.viewholder.RemoteIconMineViewHolder;
import i9jn.InterfaceC6094k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteResourceLikeAdapter extends RemoteResourceFavoriteAdapter {
    private static final String bb = "RemoteResourceLikeAdapter";

    public RemoteResourceLikeAdapter(@lvui InterfaceC1719p viewContainer, String tabType, InterfaceC6094k.q presenter) {
        super(viewContainer, tabType, presenter);
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter
    public int fnq8() {
        return 4;
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if ("videowallpaper".equals(m8274d())) {
            return 7;
        }
        if ("icons".equals(m8274d())) {
            return 6;
        }
        return super.getItemViewType(position);
    }

    @Override // com.android.thememanager.mine.remote.view.listview.adapter.RemoteResourceFavoriteAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: qo, reason: merged with bridge method [inline-methods] */
    public BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> onCreateViewHolder(@lvui ViewGroup viewGroup, int viewType) {
        BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> batchViewHolderM8280f = viewType != 6 ? viewType != 7 ? null : LikeVideoWallpaperViewHolder.m8280f(viewGroup, this) : RemoteIconMineViewHolder.n5r1(viewGroup, this);
        return batchViewHolderM8280f == null ? super.onCreateViewHolder(viewGroup, viewType) : batchViewHolderM8280f;
    }
}
