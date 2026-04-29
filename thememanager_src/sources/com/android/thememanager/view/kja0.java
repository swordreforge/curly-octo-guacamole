package com.android.thememanager.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.thememanager.R;

/* JADX INFO: compiled from: HeaderFooterRecyclerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: r */
    private static final int f17563r = -2;

    /* JADX INFO: renamed from: t */
    private static final int f17564t = -1;

    /* JADX INFO: renamed from: h */
    private boolean f17566h;

    /* JADX INFO: renamed from: k */
    private final RecyclerView.AbstractC1060y<RecyclerView.fti> f17568k;

    /* JADX INFO: renamed from: p */
    private boolean f17570p;

    /* JADX INFO: renamed from: q */
    private RecyclerView.AbstractC1048h f17571q;

    /* JADX INFO: renamed from: s */
    private View f17572s;

    /* JADX INFO: renamed from: y */
    private View f17573y;

    /* JADX INFO: renamed from: z */
    private View.OnClickListener f17574z;

    /* JADX INFO: renamed from: n */
    private int f17569n = 0;

    /* JADX INFO: renamed from: g */
    private int f17565g = R.layout.element_foot_tips;

    /* JADX INFO: renamed from: i */
    private int f17567i = 1;

    /* JADX INFO: renamed from: com.android.thememanager.view.kja0$k */
    /* JADX INFO: compiled from: HeaderFooterRecyclerAdapter.java */
    class C2921k extends RecyclerView.AbstractC1053p {
        C2921k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            kja0.this.notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int positionStart, int itemCount) {
            kja0 kja0Var = kja0.this;
            if (kja0Var.m10364z()) {
                positionStart++;
            }
            kja0Var.notifyItemRangeChanged(positionStart, itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int positionStart, int itemCount) {
            kja0 kja0Var = kja0.this;
            if (kja0Var.m10364z()) {
                positionStart++;
            }
            kja0Var.notifyItemRangeInserted(positionStart, itemCount);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int i2, int i3, int i4) {
            boolean zM10364z = kja0.this.m10364z();
            kja0.this.notifyItemMoved(i2 + (zM10364z ? 1 : 0), i3 + (zM10364z ? 1 : 0));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int positionStart, int itemCount) {
            kja0 kja0Var = kja0.this;
            if (kja0Var.m10364z()) {
                positionStart++;
            }
            kja0Var.notifyItemRangeRemoved(positionStart, itemCount);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.kja0$q */
    /* JADX INFO: compiled from: HeaderFooterRecyclerAdapter.java */
    public class C2922q extends RecyclerView.fti {

        /* JADX INFO: renamed from: h */
        public static final int f17576h = 2;

        /* JADX INFO: renamed from: i */
        public static final int f17577i = 3;

        /* JADX INFO: renamed from: p */
        public static final int f17578p = 1;

        /* JADX INFO: renamed from: s */
        public static final int f17579s = 0;

        /* JADX INFO: renamed from: y */
        public static final int f17580y = -1;

        /* JADX INFO: renamed from: k */
        private TextView f17582k;

        /* JADX INFO: renamed from: n */
        protected Button f17583n;

        /* JADX INFO: renamed from: q */
        private ProgressBar f17584q;

        /* synthetic */ C2922q(kja0 kja0Var, View view, C2921k c2921k) {
            this(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fn3e() {
            int i2 = kja0.this.f17567i;
            int i3 = i2 != 0 ? i2 != 1 ? i2 != 2 ? R.string.card_data_request_error : R.string.card_no_network : -1 : R.string.card_loading;
            if (i3 != -1) {
                TextView textView = this.f17582k;
                textView.setText(textView.getContext().getResources().getText(i3));
            } else {
                this.f17582k.setText("");
            }
            int i4 = 0;
            this.f17584q.setVisibility(kja0.this.f17567i == 0 ? 0 : 8);
            Button button = this.f17583n;
            if (kja0.this.f17567i != 2 && kja0.this.f17567i != 3) {
                i4 = 8;
            }
            button.setVisibility(i4);
        }

        private C2922q(View itemView) {
            super(itemView);
            this.f17584q = (ProgressBar) itemView.findViewById(R.id.loading_progress_bar);
            this.f17582k = (TextView) itemView.findViewById(R.id.tips);
            Button button = (Button) itemView.findViewById(R.id.refresh);
            this.f17583n = button;
            button.setOnClickListener(kja0.this.f17574z);
        }
    }

    /* JADX INFO: compiled from: HeaderFooterRecyclerAdapter.java */
    class toq extends GridLayoutManager.zy {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ GridLayoutManager f17586n;

        toq(final GridLayoutManager val$gridLayoutManager) {
            this.f17586n = val$gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.zy
        /* JADX INFO: renamed from: g */
        public int mo4760g(int position) {
            boolean z2 = false;
            boolean z3 = position == 0 && kja0.this.m10364z();
            if (position == kja0.this.getItemCount() - 1 && kja0.this.fu4()) {
                z2 = true;
            }
            if (z2 || z3) {
                return this.f17586n.ld6();
            }
            return 1;
        }
    }

    /* JADX INFO: compiled from: HeaderFooterRecyclerAdapter.java */
    class zy extends RecyclerView.fti {
        zy(View itemView) {
            super(itemView);
        }
    }

    public kja0(RecyclerView.AbstractC1060y<RecyclerView.fti> targetAdapter) {
        this.f17568k = targetAdapter;
        targetAdapter.registerAdapterDataObserver(new C2921k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fu4() {
        return this.f17566h;
    }

    private void jk(boolean hasFooter) {
        this.f17566h = hasFooter;
    }

    private void mcp(RecyclerView.AbstractC1048h layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.fn3e(new toq(gridLayoutManager));
        }
    }

    private void oc(boolean hasHeader) {
        this.f17570p = hasHeader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public boolean m10364z() {
        return this.f17570p;
    }

    public void d2ok(int viewId) {
        this.f17569n = viewId;
        oc(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f17568k.getItemCount() + (m10364z() ? 1 : 0) + (fu4() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if (m10364z() && position == 0) {
            return -1;
        }
        if (fu4() && position == getItemCount() - 1) {
            return -2;
        }
        RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y = this.f17568k;
        if (m10364z()) {
            position--;
        }
        return abstractC1060y.getItemViewType(position);
    }

    public void lvui(View view) {
        this.f17573y = view;
        oc(true);
    }

    public void o1t(int state) {
        this.f17567i = state;
        jk(state != -1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f17568k.onAttachedToRecyclerView(recyclerView);
        RecyclerView.AbstractC1048h layoutManager = recyclerView.getLayoutManager();
        this.f17571q = layoutManager;
        mcp(layoutManager);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(RecyclerView.fti holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == -1 || itemViewType == -2) {
            if (holder instanceof C2922q) {
                ((C2922q) holder).fn3e();
            }
        } else {
            RecyclerView.AbstractC1060y<RecyclerView.fti> abstractC1060y = this.f17568k;
            if (m10364z()) {
                position--;
            }
            abstractC1060y.onBindViewHolder(holder, position);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public RecyclerView.fti onCreateViewHolder(ViewGroup viewGroup, int i2) {
        RecyclerView.fti c2922q;
        View viewInflate = null;
        Object[] objArr = 0;
        if (i2 == -1) {
            viewInflate = this.f17573y;
            if (viewInflate == null) {
                viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f17569n, viewGroup, false);
            }
            c2922q = new zy(viewInflate);
        } else if (i2 == -2) {
            View viewInflate2 = this.f17572s;
            if (viewInflate2 == null) {
                viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(this.f17565g, viewGroup, false);
            }
            c2922q = new C2922q(this, viewInflate2, objArr == true ? 1 : 0);
            viewInflate = viewInflate2;
        } else {
            c2922q = null;
        }
        if (viewInflate == null) {
            return this.f17568k.onCreateViewHolder(viewGroup, i2);
        }
        if (!(this.f17571q instanceof StaggeredGridLayoutManager)) {
            return c2922q;
        }
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        StaggeredGridLayoutManager.zy zyVar = layoutParams != null ? new StaggeredGridLayoutManager.zy(layoutParams.width, layoutParams.height) : new StaggeredGridLayoutManager.zy(-1, -2);
        zyVar.x2(true);
        viewInflate.setLayoutParams(zyVar);
        return c2922q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f17568k.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public boolean onFailedToRecycleView(RecyclerView.fti holder) {
        return this.f17568k.onFailedToRecycleView(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewAttachedToWindow(RecyclerView.fti holder) {
        this.f17568k.onViewAttachedToWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewDetachedFromWindow(RecyclerView.fti holder) {
        this.f17568k.onViewDetachedFromWindow(holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewRecycled(RecyclerView.fti holder) {
        this.f17568k.onViewRecycled(holder);
    }

    /* JADX INFO: renamed from: r */
    public void m10365r(View.OnClickListener reloadListener) {
        this.f17574z = reloadListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void registerAdapterDataObserver(RecyclerView.AbstractC1053p observer) {
        this.f17568k.registerAdapterDataObserver(observer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void setHasStableIds(boolean hasStableIds) {
        this.f17568k.setHasStableIds(hasStableIds);
    }

    /* JADX INFO: renamed from: t */
    public void m10366t(View view) {
        this.f17572s = view;
        jk(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void unregisterAdapterDataObserver(RecyclerView.AbstractC1053p observer) {
        this.f17568k.unregisterAdapterDataObserver(observer);
    }

    public void wvg(int viewId) {
        this.f17565g = viewId;
        jk(true);
    }
}
