package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.y */
/* JADX INFO: compiled from: ConcatAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C1116y extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: q */
    static final String f6119q = "ConcatAdapter";

    /* JADX INFO: renamed from: k */
    private final C1112s f6120k;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.y$k */
    /* JADX INFO: compiled from: ConcatAdapter.java */
    public static final class k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @zy.lvui
        public static final k f52324zy = new k(true, toq.NO_STABLE_IDS);

        /* JADX INFO: renamed from: k */
        public final boolean f6121k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.lvui
        public final toq f52325toq;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.y$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ConcatAdapter.java */
        public static final class C7892k {

            /* JADX INFO: renamed from: k */
            private boolean f6122k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private toq f52326toq;

            public C7892k() {
                k kVar = k.f52324zy;
                this.f6122k = kVar.f6121k;
                this.f52326toq = kVar.f52325toq;
            }

            @zy.lvui
            /* JADX INFO: renamed from: k */
            public k m5133k() {
                return new k(this.f6122k, this.f52326toq);
            }

            @zy.lvui
            public C7892k toq(boolean z2) {
                this.f6122k = z2;
                return this;
            }

            @zy.lvui
            public C7892k zy(@zy.lvui toq toqVar) {
                this.f52326toq = toqVar;
                return this;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.y$k$toq */
        /* JADX INFO: compiled from: ConcatAdapter.java */
        public enum toq {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        k(boolean z2, @zy.lvui toq toqVar) {
            this.f6121k = z2;
            this.f52325toq = toqVar;
        }
    }

    @SafeVarargs
    public C1116y(@zy.lvui RecyclerView.AbstractC1060y<? extends RecyclerView.fti>... abstractC1060yArr) {
        this(k.f52324zy, abstractC1060yArr);
    }

    public boolean cdj(int i2, @zy.lvui RecyclerView.AbstractC1060y<? extends RecyclerView.fti> abstractC1060y) {
        return this.f6120k.m5118y(i2, abstractC1060y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int findRelativeAdapterPositionIn(@zy.lvui RecyclerView.AbstractC1060y<? extends RecyclerView.fti> abstractC1060y, @zy.lvui RecyclerView.fti ftiVar, int i2) {
        return this.f6120k.m5115i(abstractC1060y, ftiVar, i2);
    }

    @zy.lvui
    public List<? extends RecyclerView.AbstractC1060y<? extends RecyclerView.fti>> fn3e() {
        return Collections.unmodifiableList(this.f6120k.cdj());
    }

    public boolean fu4(@zy.lvui RecyclerView.AbstractC1060y<? extends RecyclerView.fti> abstractC1060y) {
        return this.f6120k.d3(abstractC1060y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f6120k.fn3e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public long getItemId(int i2) {
        return this.f6120k.ki(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int i2) {
        return this.f6120k.t8r(i2);
    }

    public boolean ki(@zy.lvui RecyclerView.AbstractC1060y<? extends RecyclerView.fti> abstractC1060y) {
        return this.f6120k.m5116s(abstractC1060y);
    }

    void ni7(@zy.lvui RecyclerView.AbstractC1060y.k kVar) {
        super.setStateRestorationPolicy(kVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onAttachedToRecyclerView(@zy.lvui RecyclerView recyclerView) {
        this.f6120k.o1t(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@zy.lvui RecyclerView.fti ftiVar, int i2) {
        this.f6120k.wvg(ftiVar, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @zy.lvui
    public RecyclerView.fti onCreateViewHolder(@zy.lvui ViewGroup viewGroup, int i2) {
        return this.f6120k.m5117t(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onDetachedFromRecyclerView(@zy.lvui RecyclerView recyclerView) {
        this.f6120k.mcp(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public boolean onFailedToRecycleView(@zy.lvui RecyclerView.fti ftiVar) {
        return this.f6120k.jk(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewAttachedToWindow(@zy.lvui RecyclerView.fti ftiVar) {
        this.f6120k.a9(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewDetachedFromWindow(@zy.lvui RecyclerView.fti ftiVar) {
        this.f6120k.fti(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewRecycled(@zy.lvui RecyclerView.fti ftiVar) {
        this.f6120k.jp0y(ftiVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void setHasStableIds(boolean z2) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void setStateRestorationPolicy(@zy.lvui RecyclerView.AbstractC1060y.k kVar) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public C1116y(@zy.lvui k kVar, @zy.lvui RecyclerView.AbstractC1060y<? extends RecyclerView.fti>... abstractC1060yArr) {
        this(kVar, (List<? extends RecyclerView.AbstractC1060y<? extends RecyclerView.fti>>) Arrays.asList(abstractC1060yArr));
    }

    public C1116y(@zy.lvui List<? extends RecyclerView.AbstractC1060y<? extends RecyclerView.fti>> list) {
        this(k.f52324zy, list);
    }

    public C1116y(@zy.lvui k kVar, @zy.lvui List<? extends RecyclerView.AbstractC1060y<? extends RecyclerView.fti>> list) {
        this.f6120k = new C1112s(this, kVar);
        Iterator<? extends RecyclerView.AbstractC1060y<? extends RecyclerView.fti>> it = list.iterator();
        while (it.hasNext()) {
            ki(it.next());
        }
        super.setHasStableIds(this.f6120k.ni7());
    }
}
