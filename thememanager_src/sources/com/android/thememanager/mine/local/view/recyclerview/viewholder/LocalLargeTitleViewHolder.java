package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.resource.C2162k;
import com.android.thememanager.mine.local.view.recyclerview.adapter.LocalLargeIconAdapter;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalLargeTitleViewHolder extends BatchOperationAdapter.BatchViewHolder<C2162k> {

    /* JADX INFO: renamed from: y */
    private TextView f12802y;

    public LocalLargeTitleViewHolder(@InterfaceC7396q @lvui View itemView, @InterfaceC7396q @lvui LocalLargeIconAdapter adapter) {
        super(itemView, adapter);
        this.f12802y = (TextView) itemView.findViewById(R.id.title);
    }

    /* JADX INFO: renamed from: l */
    public static LocalLargeTitleViewHolder m8255l(ViewGroup parent, LocalLargeIconAdapter adapter) {
        return new LocalLargeTitleViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.large_icon_local_title_vh, parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(C2162k item, int position) {
        super.o1t(item, position);
        this.f12802y.setText(item.f12731p);
    }
}
