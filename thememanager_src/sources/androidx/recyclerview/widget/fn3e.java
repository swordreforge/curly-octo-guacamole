package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1108q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.fti;
import androidx.recyclerview.widget.ld6;
import androidx.recyclerview.widget.zy;
import java.util.List;

/* JADX INFO: compiled from: ListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class fn3e<T, VH extends RecyclerView.fti> extends RecyclerView.AbstractC1060y<VH> {

    /* JADX INFO: renamed from: k */
    final C1108q<T> f5860k;

    /* JADX INFO: renamed from: q */
    private final C1108q.toq<T> f5861q;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.fn3e$k */
    /* JADX INFO: compiled from: ListAdapter.java */
    class C1078k implements C1108q.toq<T> {
        C1078k() {
        }

        @Override // androidx.recyclerview.widget.C1108q.toq
        /* JADX INFO: renamed from: k */
        public void mo4976k(@zy.lvui List<T> list, @zy.lvui List<T> list2) {
            fn3e.this.fn3e(list, list2);
        }
    }

    protected fn3e(@zy.lvui ld6.AbstractC1092g<T> abstractC1092g) {
        C1078k c1078k = new C1078k();
        this.f5861q = c1078k;
        C1108q<T> c1108q = new C1108q<>(new toq(this), new zy.C1118k(abstractC1092g).m5139k());
        this.f5860k = c1108q;
        c1108q.m5100k(c1078k);
    }

    @zy.lvui
    public List<T> cdj() {
        return this.f5860k.toq();
    }

    public void fn3e(@zy.lvui List<T> list, @zy.lvui List<T> list2) {
    }

    public void fu4(@zy.dd List<T> list, @zy.dd Runnable runnable) {
        this.f5860k.f7l8(list, runnable);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f5860k.toq().size();
    }

    protected T ki(int i2) {
        return this.f5860k.toq().get(i2);
    }

    public void ni7(@zy.dd List<T> list) {
        this.f5860k.m5099g(list);
    }

    protected fn3e(@zy.lvui zy<T> zyVar) {
        C1078k c1078k = new C1078k();
        this.f5861q = c1078k;
        C1108q<T> c1108q = new C1108q<>(new toq(this), zyVar);
        this.f5860k = c1108q;
        c1108q.m5100k(c1078k);
    }
}
