package com.android.thememanager.recommend.view.listview;

import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.router.recommend.entity.IRecommendListView;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.k */
/* JADX INFO: compiled from: IAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2366k {
    int getItemCount();

    int getItemViewType(int position);

    /* JADX INFO: renamed from: h */
    default void mo8547h(IRecommendListView.ExViewHolder evh) {
    }

    /* JADX INFO: renamed from: n */
    void mo8550n(List<UIElement> elements, boolean append, boolean hasMore);

    /* JADX INFO: renamed from: p */
    void mo8555p(RecyclerView.AbstractC1060y outAdapter);

    default void setRingtoneFlag(int ringtoneFlag) {
    }

    void toq(List<UIElement> elements, boolean hasMore);

    /* JADX INFO: renamed from: y */
    default C2368q mo8556y() {
        return null;
    }
}
