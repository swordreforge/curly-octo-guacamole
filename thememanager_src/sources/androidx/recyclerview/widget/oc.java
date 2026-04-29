package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d3;

/* JADX INFO: compiled from: SortedListAdapterCallback.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class oc<T2> extends d3.toq<T2> {

    /* JADX INFO: renamed from: k */
    final RecyclerView.AbstractC1060y f6020k;

    public oc(RecyclerView.AbstractC1060y abstractC1060y) {
        this.f6020k = abstractC1060y;
    }

    @Override // androidx.recyclerview.widget.zurt
    /* JADX INFO: renamed from: k */
    public void mo4953k(int i2, int i3) {
        this.f6020k.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.zurt
    /* JADX INFO: renamed from: q */
    public void mo4955q(int i2, int i3) {
        this.f6020k.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.zurt
    public void toq(int i2, int i3) {
        this.f6020k.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.d3.toq
    /* JADX INFO: renamed from: y */
    public void mo4957y(int i2, int i3) {
        this.f6020k.notifyItemRangeChanged(i2, i3);
    }

    @Override // androidx.recyclerview.widget.d3.toq, androidx.recyclerview.widget.zurt
    public void zy(int i2, int i3, Object obj) {
        this.f6020k.notifyItemRangeChanged(i2, i3, obj);
    }
}
