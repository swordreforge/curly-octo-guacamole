package com.android.thememanager.superwallpaper.recyclerview;

import android.content.Context;
import android.view.ViewGroup;
import com.android.thememanager.superwallpaper.base.AbstractC2721k;
import com.android.thememanager.superwallpaper.base.AbstractC2723p;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.superwallpaper.recyclerview.k */
/* JADX INFO: compiled from: MamlPositionDetailAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2730k extends AbstractC2721k {
    public C2730k(@lvui Context activity, @lvui AbstractC2723p presenter) {
        super(activity, presenter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public com.android.thememanager.superwallpaper.base.zy onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return new toq(this, cdj(parent));
    }
}
