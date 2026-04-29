package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d2ok;
import androidx.recyclerview.widget.ncyb;

/* JADX INFO: compiled from: NestedAdapterWrapper.java */
/* JADX INFO: loaded from: classes.dex */
class fu4 {

    /* JADX INFO: renamed from: g */
    private RecyclerView.AbstractC1053p f5863g = new C1079k();

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final ncyb.zy f5864k;

    /* JADX INFO: renamed from: n */
    int f5865n;

    /* JADX INFO: renamed from: q */
    final toq f5866q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.lvui
    private final d2ok.InterfaceC1071q f52130toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final RecyclerView.AbstractC1060y<RecyclerView.fti> f52131zy;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.fu4$k */
    /* JADX INFO: compiled from: NestedAdapterWrapper.java */
    class C1079k extends RecyclerView.AbstractC1053p {
        C1079k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            fu4 fu4Var = fu4.this;
            fu4Var.f5865n = fu4Var.f52131zy.getItemCount();
            fu4 fu4Var2 = fu4.this;
            fu4Var2.f5866q.mo4982g(fu4Var2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3) {
            fu4 fu4Var = fu4.this;
            fu4Var.f5866q.mo4983k(fu4Var, i2, i3, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int i2, int i3) {
            fu4 fu4Var = fu4.this;
            fu4Var.f5865n += i3;
            fu4Var.f5866q.toq(fu4Var, i2, i3);
            fu4 fu4Var2 = fu4.this;
            if (fu4Var2.f5865n <= 0 || fu4Var2.f52131zy.getStateRestorationPolicy() != RecyclerView.AbstractC1060y.k.PREVENT_WHEN_EMPTY) {
                return;
            }
            fu4 fu4Var3 = fu4.this;
            fu4Var3.f5866q.mo4985q(fu4Var3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int i2, int i3, int i4) {
            androidx.core.util.n7h.toq(i4 == 1, "moving more than 1 item is not supported in RecyclerView");
            fu4 fu4Var = fu4.this;
            fu4Var.f5866q.zy(fu4Var, i2, i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int i2, int i3) {
            fu4 fu4Var = fu4.this;
            fu4Var.f5865n -= i3;
            fu4Var.f5866q.f7l8(fu4Var, i2, i3);
            fu4 fu4Var2 = fu4.this;
            if (fu4Var2.f5865n >= 1 || fu4Var2.f52131zy.getStateRestorationPolicy() != RecyclerView.AbstractC1060y.k.PREVENT_WHEN_EMPTY) {
                return;
            }
            fu4 fu4Var3 = fu4.this;
            fu4Var3.f5866q.mo4985q(fu4Var3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onStateRestorationPolicyChanged() {
            fu4 fu4Var = fu4.this;
            fu4Var.f5866q.mo4985q(fu4Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3, @zy.dd Object obj) {
            fu4 fu4Var = fu4.this;
            fu4Var.f5866q.mo4983k(fu4Var, i2, i3, obj);
        }
    }

    /* JADX INFO: compiled from: NestedAdapterWrapper.java */
    interface toq {
        void f7l8(@zy.lvui fu4 fu4Var, int i2, int i3);

        /* JADX INFO: renamed from: g */
        void mo4982g(@zy.lvui fu4 fu4Var);

        /* JADX INFO: renamed from: k */
        void mo4983k(@zy.lvui fu4 fu4Var, int i2, int i3, @zy.dd Object obj);

        /* JADX INFO: renamed from: n */
        void mo4984n(@zy.lvui fu4 fu4Var, int i2, int i3);

        /* JADX INFO: renamed from: q */
        void mo4985q(fu4 fu4Var);

        void toq(@zy.lvui fu4 fu4Var, int i2, int i3);

        void zy(@zy.lvui fu4 fu4Var, int i2, int i3);
    }

    fu4(RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y, toq toqVar, ncyb ncybVar, d2ok.InterfaceC1071q interfaceC1071q) {
        this.f52131zy = abstractC1060y;
        this.f5866q = toqVar;
        this.f5864k = ncybVar.toq(this);
        this.f52130toq = interfaceC1071q;
        this.f5865n = abstractC1060y.getItemCount();
        abstractC1060y.registerAdapterDataObserver(this.f5863g);
    }

    /* JADX INFO: renamed from: g */
    RecyclerView.fti m4978g(ViewGroup viewGroup, int i2) {
        return this.f52131zy.onCreateViewHolder(viewGroup, this.f5864k.mo5076q(i2));
    }

    /* JADX INFO: renamed from: k */
    void m4979k() {
        this.f52131zy.unregisterAdapterDataObserver(this.f5863g);
        this.f5864k.zy();
    }

    /* JADX INFO: renamed from: n */
    void m4980n(RecyclerView.fti ftiVar, int i2) {
        this.f52131zy.bindViewHolder(ftiVar, i2);
    }

    /* JADX INFO: renamed from: q */
    int m4981q(int i2) {
        return this.f5864k.mo5075n(this.f52131zy.getItemViewType(i2));
    }

    int toq() {
        return this.f5865n;
    }

    public long zy(int i2) {
        return this.f52130toq.mo4940k(this.f52131zy.getItemId(i2));
    }
}
