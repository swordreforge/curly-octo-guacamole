package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.model.entity.LargeIconRemoteBatchItem;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RemoteLargeIconTitleViewHolder extends BatchOperationAdapter.BatchViewHolder<LargeIconRemoteBatchItem> {

    /* JADX INFO: renamed from: y */
    private TextView f12923y;

    public RemoteLargeIconTitleViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12923y = (TextView) itemView.findViewById(R.id.title);
    }

    /* JADX INFO: renamed from: l */
    public static RemoteLargeIconTitleViewHolder m8283l(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new RemoteLargeIconTitleViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.large_icon_local_title_vh, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(LargeIconRemoteBatchItem item, int position) {
        super.o1t(item, position);
        this.f12923y.setText(item.packageName);
    }
}
