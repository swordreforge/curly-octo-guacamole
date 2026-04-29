package com.android.thememanager.superwallpaper.recyclerview;

import android.view.View;
import com.android.thememanager.superwallpaper.base.AbstractC2721k;
import zy.hyr;

/* JADX INFO: renamed from: com.android.thememanager.superwallpaper.recyclerview.q */
/* JADX INFO: compiled from: UnityPositionListViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2731q extends com.android.thememanager.superwallpaper.base.zy {
    public C2731q(AbstractC2721k adapter, View itemView) {
        super(adapter, itemView);
    }

    @Override // com.android.thememanager.superwallpaper.base.zy
    @hyr(api = 23)
    public void fu4(vep5.toq data, int position) {
        super.fu4(data, position);
        if (this.f16135k.fn3e()) {
            this.f16137q.setImageDrawable(data.f7l8().loadDrawable(bf2.toq.toq()));
        } else {
            this.f16137q.setImageDrawable(data.m28113y().loadDrawable(bf2.toq.toq()));
        }
    }
}
