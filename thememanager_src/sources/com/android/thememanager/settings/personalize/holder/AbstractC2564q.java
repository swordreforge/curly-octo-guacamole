package com.android.thememanager.settings.personalize.holder;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.settings.personalize.holder.q */
/* JADX INFO: compiled from: PreviewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2564q extends RecyclerView.fti {

    /* JADX INFO: renamed from: k */
    protected Context f15251k;

    public AbstractC2564q(@lvui Context context, @lvui View itemView) {
        super(itemView);
        this.f15251k = context;
    }

    public abstract void ki(int position);
}
