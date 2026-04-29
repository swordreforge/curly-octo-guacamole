package com.android.thememanager.basemodule.views;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.basemodule.utils.o1t;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.internal.C6692t;
import yz.C7794k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: HeaderAndFooterRecyclerViewAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class f7l8 extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: h */
    private static final int f10582h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    private static final int f10583i = -2147483647;

    /* JADX INFO: renamed from: z */
    private static final String f10584z = "HeaderAndFooterRecyclerViewAdapter";

    /* JADX INFO: renamed from: g */
    private RecyclerView f10585g;

    /* JADX INFO: renamed from: k */
    private RecyclerView.AbstractC1060y<RecyclerView.fti> f10586k;

    /* JADX INFO: renamed from: y */
    private RecyclerView.AbstractC1048h f10591y;

    /* JADX INFO: renamed from: q */
    private ArrayList<View> f10589q = new ArrayList<>();

    /* JADX INFO: renamed from: n */
    private ArrayList<View> f10587n = new ArrayList<>();

    /* JADX INFO: renamed from: s */
    private final boolean f10590s = o1t.n7h();

    /* JADX INFO: renamed from: p */
    private RecyclerView.AbstractC1053p f10588p = new C1850k();

    /* JADX INFO: compiled from: HeaderAndFooterRecyclerViewAdapter.java */
    class toq extends GridLayoutManager.zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ GridLayoutManager f10594n;

        toq(final GridLayoutManager val$gridLayoutManager) {
            this.f10594n = val$gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            boolean z2 = position < f7l8.this.o1t();
            if ((position >= f7l8.this.getItemCount() - f7l8.this.fu4()) || z2) {
                return this.f10594n.ld6();
            }
            return 1;
        }
    }

    /* JADX INFO: compiled from: HeaderAndFooterRecyclerViewAdapter.java */
    public static class zy extends RecyclerView.fti {
        public zy(View itemView) {
            super(itemView);
        }
    }

    public f7l8(RecyclerView.AbstractC1060y innerAdapter) {
        d2ok(innerAdapter);
    }

    private void fn3e(RecyclerView.AbstractC1048h layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (gridLayoutManager.kja0() instanceof GridLayoutManager.C1043k) {
                gridLayoutManager.fn3e(new toq(gridLayoutManager));
            }
        }
    }

    public void cdj(View footer) {
        if (footer == null) {
            throw new RuntimeException("footer is null");
        }
        this.f10587n.add(footer);
        notifyDataSetChanged();
    }

    public void d2ok(RecyclerView.AbstractC1060y<RecyclerView.fti> adapter) {
        if (this.f10586k != null) {
            notifyItemRangeRemoved(o1t(), this.f10586k.getItemCount());
            this.f10586k.unregisterAdapterDataObserver(this.f10588p);
        }
        this.f10586k = adapter;
        adapter.registerAdapterDataObserver(this.f10588p);
        notifyItemRangeInserted(o1t(), this.f10586k.getItemCount());
    }

    public int fu4() {
        return this.f10587n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return o1t() + fu4() + this.f10586k.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        int itemCount = this.f10586k.getItemCount();
        int iO1t = o1t();
        if (position < iO1t) {
            return position - Integer.MIN_VALUE;
        }
        if (iO1t > position || position >= iO1t + itemCount) {
            return ((position + f10583i) - iO1t) - itemCount;
        }
        int itemViewType = this.f10586k.getItemViewType(position - iO1t);
        if (itemViewType < 1073741823) {
            return itemViewType + C6692t.f37242p;
        }
        throw new IllegalArgumentException("your adapter's return value of getViewTypeCount() must < Integer.MAX_VALUE / 2");
    }

    public void jk(View view) {
        this.f10587n.remove(view);
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        notifyDataSetChanged();
    }

    public void ki(View header) {
        if (header == null) {
            throw new RuntimeException("header is null");
        }
        this.f10589q.add(header);
        notifyDataSetChanged();
    }

    public void lvui(RecyclerView.AbstractC1048h layoutManager) {
        this.f10591y = layoutManager;
    }

    public boolean mcp(int position) {
        return o1t() > 0 && position == 0;
    }

    public View ni7() {
        if (fu4() > 0) {
            return this.f10587n.get(0);
        }
        return null;
    }

    public int o1t() {
        return this.f10589q.size();
    }

    public void oc(View view) {
        this.f10589q.remove(view);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f10585g = recyclerView;
        this.f10586k.onAttachedToRecyclerView(recyclerView);
        if (this.f10591y == null) {
            this.f10591y = recyclerView.getLayoutManager();
        }
        fn3e(this.f10591y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(RecyclerView.fti holder, int position) {
        int iO1t = o1t();
        if (position >= iO1t && position < this.f10586k.getItemCount() + iO1t) {
            this.f10586k.onBindViewHolder(holder, position - iO1t);
            return;
        }
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        boolean z2 = layoutParams instanceof StaggeredGridLayoutManager.zy;
        if (z2) {
            ((StaggeredGridLayoutManager.zy) layoutParams).x2(true);
        } else {
            if (z2 || !(this.f10591y instanceof StaggeredGridLayoutManager)) {
                return;
            }
            StaggeredGridLayoutManager.zy zyVar = new StaggeredGridLayoutManager.zy(layoutParams.width, layoutParams.height);
            zyVar.x2(true);
            holder.itemView.setLayoutParams(zyVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    public RecyclerView.fti onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        if (viewType < o1t() - Integer.MIN_VALUE) {
            View view = this.f10589q.get(viewType - Integer.MIN_VALUE);
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (!this.f10590s && view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            }
            return new zy(view);
        }
        if (viewType < f10583i || viewType >= 1073741823) {
            return this.f10586k.onCreateViewHolder(parent, viewType - C6692t.f37242p);
        }
        View view2 = this.f10587n.get(viewType - f10583i);
        if (view2.getParent() != null) {
            ((ViewGroup) view2.getParent()).removeView(view2);
        }
        return new zy(view2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewAttachedToWindow(RecyclerView.fti holder) {
        RecyclerView recyclerView;
        super.onViewAttachedToWindow(holder);
        if (this.f10591y == null && (recyclerView = this.f10585g) != null) {
            this.f10591y = recyclerView.getLayoutManager();
        }
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition < o1t() || adapterPosition >= o1t() + this.f10586k.getItemCount()) {
            return;
        }
        try {
            this.f10586k.onViewAttachedToWindow(holder);
        } catch (Exception e2) {
            C7794k.zy(f10584z, "onViewAttachedToWindow", e2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewDetachedFromWindow(RecyclerView.fti holder) {
        RecyclerView recyclerView;
        super.onViewDetachedFromWindow(holder);
        if (this.f10591y == null && (recyclerView = this.f10585g) != null) {
            this.f10591y = recyclerView.getLayoutManager();
        }
        int adapterPosition = holder.getAdapterPosition();
        if (adapterPosition < o1t() || adapterPosition >= o1t() + this.f10586k.getItemCount()) {
            return;
        }
        try {
            this.f10586k.onViewDetachedFromWindow(holder);
        } catch (Exception e2) {
            C7794k.zy(f10584z, "onViewDetachedFromWindow", e2);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m7334t(int position) {
        return fu4() > 0 && position == getItemCount() - 1;
    }

    public RecyclerView.AbstractC1060y wvg() {
        return this.f10586k;
    }

    /* JADX INFO: renamed from: z */
    public View m7335z() {
        if (o1t() > 0) {
            return this.f10589q.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.f7l8$k */
    /* JADX INFO: compiled from: HeaderAndFooterRecyclerViewAdapter.java */
    class C1850k extends RecyclerView.AbstractC1053p {
        C1850k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            super.onChanged();
            f7l8.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int positionStart, int itemCount) {
            super.onItemRangeChanged(positionStart, itemCount);
            f7l8 f7l8Var = f7l8.this;
            f7l8Var.notifyItemRangeChanged(positionStart + f7l8Var.o1t(), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int positionStart, int itemCount) {
            super.onItemRangeInserted(positionStart, itemCount);
            f7l8 f7l8Var = f7l8.this;
            f7l8Var.notifyItemRangeInserted(positionStart + f7l8Var.o1t(), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int fromPosition, int toPosition, int itemCount) {
            super.onItemRangeMoved(fromPosition, toPosition, itemCount);
            int iO1t = f7l8.this.o1t();
            f7l8.this.notifyItemRangeChanged(fromPosition + iO1t, toPosition + iO1t + itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            super.onItemRangeRemoved(positionStart, itemCount);
            f7l8 f7l8Var = f7l8.this;
            f7l8Var.notifyItemRangeRemoved(positionStart + f7l8Var.o1t(), itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int positionStart, int itemCount, @dd Object payload) {
            f7l8 f7l8Var = f7l8.this;
            f7l8Var.notifyItemRangeChanged(positionStart + f7l8Var.o1t(), itemCount, payload);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@lvui RecyclerView.fti holder, int position, @lvui List<Object> payloads) {
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
            return;
        }
        int iO1t = o1t();
        if (position < iO1t || position >= this.f10586k.getItemCount() + iO1t) {
            return;
        }
        this.f10586k.onBindViewHolder(holder, position - iO1t, payloads);
    }
}
