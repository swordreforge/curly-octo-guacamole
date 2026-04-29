package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: SnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class gvn7 extends RecyclerView.t8r {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.fn3e mScrollListener = new C1081k();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.gvn7$k */
    /* JADX INFO: compiled from: SnapHelper.java */
    class C1081k extends RecyclerView.fn3e {

        /* JADX INFO: renamed from: k */
        boolean f5877k = false;

        C1081k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            super.onScrollStateChanged(recyclerView, i2);
            if (i2 == 0 && this.f5877k) {
                this.f5877k = false;
                gvn7.this.snapToTargetExistingView();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.fn3e
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            if (i2 == 0 && i3 == 0) {
                return;
            }
            this.f5877k = true;
        }
    }

    /* JADX INFO: compiled from: SnapHelper.java */
    class toq extends t8r {
        toq(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.t8r, androidx.recyclerview.widget.RecyclerView.AbstractC1058t
        /* JADX INFO: renamed from: h */
        protected void mo4862h(View view, RecyclerView.mcp mcpVar, RecyclerView.AbstractC1058t.k kVar) {
            gvn7 gvn7Var = gvn7.this;
            RecyclerView recyclerView = gvn7Var.mRecyclerView;
            if (recyclerView == null) {
                return;
            }
            int[] iArrCalculateDistanceToFinalSnap = gvn7Var.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
            int i2 = iArrCalculateDistanceToFinalSnap[0];
            int i3 = iArrCalculateDistanceToFinalSnap[1];
            int iFu4 = fu4(Math.max(Math.abs(i2), Math.abs(i3)));
            if (iFu4 > 0) {
                kVar.x2(i2, i3, iFu4, this.f6104p);
            }
        }

        @Override // androidx.recyclerview.widget.t8r
        protected float ni7(DisplayMetrics displayMetrics) {
            return gvn7.MILLISECONDS_PER_INCH / displayMetrics.densityDpi;
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.mRecyclerView.addOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(this);
    }

    private boolean snapFromFling(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h, int i2, int i3) {
        RecyclerView.AbstractC1058t abstractC1058tCreateScroller;
        int iFindTargetSnapPosition;
        if (!(abstractC1048h instanceof RecyclerView.AbstractC1058t.toq) || (abstractC1058tCreateScroller = createScroller(abstractC1048h)) == null || (iFindTargetSnapPosition = findTargetSnapPosition(abstractC1048h, i2, i3)) == -1) {
            return false;
        }
        abstractC1058tCreateScroller.cdj(iFindTargetSnapPosition);
        abstractC1048h.startSmoothScroll(abstractC1058tCreateScroller);
        return true;
    }

    public void attachToRecyclerView(@zy.dd RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.mRecyclerView = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
            this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
            snapToTargetExistingView();
        }
    }

    @zy.dd
    public abstract int[] calculateDistanceToFinalSnap(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h, @zy.lvui View view);

    public int[] calculateScrollDistance(int i2, int i3) {
        this.mGravityScroller.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    @zy.dd
    protected RecyclerView.AbstractC1058t createScroller(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h) {
        return createSnapScroller(abstractC1048h);
    }

    @Deprecated
    @zy.dd
    protected t8r createSnapScroller(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h) {
        if (abstractC1048h instanceof RecyclerView.AbstractC1058t.toq) {
            return new toq(this.mRecyclerView.getContext());
        }
        return null;
    }

    @zy.dd
    public abstract View findSnapView(RecyclerView.AbstractC1048h abstractC1048h);

    public abstract int findTargetSnapPosition(RecyclerView.AbstractC1048h abstractC1048h, int i2, int i3);

    @Override // androidx.recyclerview.widget.RecyclerView.t8r
    public boolean onFling(int i2, int i3) {
        RecyclerView.AbstractC1048h layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i3) > minFlingVelocity || Math.abs(i2) > minFlingVelocity) && snapFromFling(layoutManager, i2, i3);
    }

    void snapToTargetExistingView() {
        RecyclerView.AbstractC1048h layoutManager;
        View viewFindSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewFindSnapView = findSnapView(layoutManager)) == null) {
            return;
        }
        int[] iArrCalculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, viewFindSnapView);
        int i2 = iArrCalculateDistanceToFinalSnap[0];
        if (i2 == 0 && iArrCalculateDistanceToFinalSnap[1] == 0) {
            return;
        }
        this.mRecyclerView.smoothScrollBy(i2, iArrCalculateDistanceToFinalSnap[1]);
    }
}
