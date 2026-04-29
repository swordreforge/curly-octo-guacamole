package com.android.thememanager.v9.holder;

import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.v9.data.C2850g;
import com.android.thememanager.view.MtzSuperWallpaperItemView;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.v9.holder.q */
/* JADX INFO: compiled from: MtzSuperWallpaperViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2862q extends RecyclerView.fti {

    /* JADX INFO: renamed from: q */
    private static final String f17115q = "MtzSuperWallpaperVH";

    /* JADX INFO: renamed from: k */
    private MtzSuperWallpaperItemView f17116k;

    public C2862q(@lvui MtzSuperWallpaperItemView itemView) {
        super(itemView);
        this.f17116k = itemView;
    }

    public MtzSuperWallpaperItemView fn3e() {
        return this.f17116k;
    }

    public void ki(int position, C2850g data) {
        this.f17116k.setBaseContents(data, position);
    }
}
