package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: AdapterListUpdateCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq implements zurt {

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final RecyclerView.AbstractC1060y f6106k;

    public toq(@zy.lvui RecyclerView.AbstractC1060y abstractC1060y) {
        this.f6106k = abstractC1060y;
    }

    @Override // androidx.recyclerview.widget.zurt
    /* JADX INFO: renamed from: k */
    public void mo4953k(int i2, int i3) {
        this.f6106k.notifyItemRangeInserted(i2, i3);
    }

    @Override // androidx.recyclerview.widget.zurt
    /* JADX INFO: renamed from: q */
    public void mo4955q(int i2, int i3) {
        this.f6106k.notifyItemMoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.zurt
    public void toq(int i2, int i3) {
        this.f6106k.notifyItemRangeRemoved(i2, i3);
    }

    @Override // androidx.recyclerview.widget.zurt
    public void zy(int i2, int i3, Object obj) {
        this.f6106k.notifyItemRangeChanged(i2, i3, obj);
    }
}
