package com.android.thememanager.mine.remote.view.listview.viewholder;

import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.remote.view.listview.adapter.BaseRemoteResourceAdapter;
import gc3c.ViewOnClickListenerC6059k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetSuitViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseRemoteResourceAdapter.toq> {

    /* JADX INFO: renamed from: y */
    private ViewOnClickListenerC6059k f12941y;

    public WidgetSuitViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12941y = new ViewOnClickListenerC6059k(itemView, adapter);
    }

    /* JADX INFO: renamed from: l */
    public static WidgetSuitViewHolder m8287l(ViewGroup parent, BaseRemoteResourceAdapter adapter) {
        return new WidgetSuitViewHolder(ViewOnClickListenerC6059k.zy(parent, false), adapter);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        this.f12941y.toq();
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
    public void o1t(BaseRemoteResourceAdapter.toq item, int position) {
        super.o1t(item, position);
        if (this.f12941y.m22283n(item.getProduct(), position)) {
            this.f12941y.f7l8(item);
        }
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return o1t.m7169g(fn3e()) ? this.itemView : this.itemView.findViewById(R.id.preview_container);
    }
}
