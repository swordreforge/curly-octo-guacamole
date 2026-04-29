package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.C0683f;
import androidx.recyclerview.widget.RecyclerView;
import zy.lvui;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.k */
/* JADX INFO: compiled from: FragmentViewHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1295k extends RecyclerView.fti {
    private C1295k(@lvui FrameLayout frameLayout) {
        super(frameLayout);
    }

    @lvui
    static C1295k ki(@lvui ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(C0683f.jk());
        frameLayout.setSaveEnabled(false);
        return new C1295k(frameLayout);
    }

    @lvui
    FrameLayout fn3e() {
        return (FrameLayout) this.itemView;
    }
}
