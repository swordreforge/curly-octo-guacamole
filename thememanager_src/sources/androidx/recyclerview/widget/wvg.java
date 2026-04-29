package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: PagerSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class wvg extends gvn7 {
    private static final int MAX_SCROLL_ON_FLING_DURATION = 100;

    @zy.dd
    private o1t mHorizontalHelper;

    @zy.dd
    private o1t mVerticalHelper;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.wvg$k */
    /* JADX INFO: compiled from: PagerSnapHelper.java */
    class C1114k extends t8r {
        C1114k(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.t8r, androidx.recyclerview.widget.RecyclerView.AbstractC1058t
        /* JADX INFO: renamed from: h */
        protected void mo4862h(View view, RecyclerView.mcp mcpVar, RecyclerView.AbstractC1058t.k kVar) {
            wvg wvgVar = wvg.this;
            int[] iArrCalculateDistanceToFinalSnap = wvgVar.calculateDistanceToFinalSnap(wvgVar.mRecyclerView.getLayoutManager(), view);
            int i2 = iArrCalculateDistanceToFinalSnap[0];
            int i3 = iArrCalculateDistanceToFinalSnap[1];
            int iFu4 = fu4(Math.max(Math.abs(i2), Math.abs(i3)));
            if (iFu4 > 0) {
                kVar.x2(i2, i3, iFu4, this.f6104p);
            }
        }

        @Override // androidx.recyclerview.widget.t8r
        protected float ni7(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.t8r
        /* JADX INFO: renamed from: z */
        protected int mo5122z(int i2) {
            return Math.min(100, super.mo5122z(i2));
        }
    }

    private int distanceToCenter(@zy.lvui View view, o1t o1tVar) {
        return (o1tVar.f7l8(view) + (o1tVar.mo5088n(view) / 2)) - (o1tVar.n7h() + (o1tVar.kja0() / 2));
    }

    @zy.dd
    private View findCenterView(RecyclerView.AbstractC1048h abstractC1048h, o1t o1tVar) {
        int childCount = abstractC1048h.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iN7h = o1tVar.n7h() + (o1tVar.kja0() / 2);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = abstractC1048h.getChildAt(i3);
            int iAbs = Math.abs((o1tVar.f7l8(childAt) + (o1tVar.mo5088n(childAt) / 2)) - iN7h);
            if (iAbs < i2) {
                view = childAt;
                i2 = iAbs;
            }
        }
        return view;
    }

    @zy.lvui
    private o1t getHorizontalHelper(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h) {
        o1t o1tVar = this.mHorizontalHelper;
        if (o1tVar == null || o1tVar.f6019k != abstractC1048h) {
            this.mHorizontalHelper = o1t.m5084k(abstractC1048h);
        }
        return this.mHorizontalHelper;
    }

    @zy.dd
    private o1t getOrientationHelper(RecyclerView.AbstractC1048h abstractC1048h) {
        if (abstractC1048h.canScrollVertically()) {
            return getVerticalHelper(abstractC1048h);
        }
        if (abstractC1048h.canScrollHorizontally()) {
            return getHorizontalHelper(abstractC1048h);
        }
        return null;
    }

    @zy.lvui
    private o1t getVerticalHelper(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h) {
        o1t o1tVar = this.mVerticalHelper;
        if (o1tVar == null || o1tVar.f6019k != abstractC1048h) {
            this.mVerticalHelper = o1t.zy(abstractC1048h);
        }
        return this.mVerticalHelper;
    }

    private boolean isForwardFling(RecyclerView.AbstractC1048h abstractC1048h, int i2, int i3) {
        return abstractC1048h.canScrollHorizontally() ? i2 > 0 : i3 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isReverseLayout(RecyclerView.AbstractC1048h abstractC1048h) {
        PointF pointFComputeScrollVectorForPosition;
        int itemCount = abstractC1048h.getItemCount();
        if (!(abstractC1048h instanceof RecyclerView.AbstractC1058t.toq) || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC1058t.toq) abstractC1048h).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.gvn7
    @zy.dd
    public int[] calculateDistanceToFinalSnap(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h, @zy.lvui View view) {
        int[] iArr = new int[2];
        if (abstractC1048h.canScrollHorizontally()) {
            iArr[0] = distanceToCenter(view, getHorizontalHelper(abstractC1048h));
        } else {
            iArr[0] = 0;
        }
        if (abstractC1048h.canScrollVertically()) {
            iArr[1] = distanceToCenter(view, getVerticalHelper(abstractC1048h));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.gvn7
    @zy.dd
    protected RecyclerView.AbstractC1058t createScroller(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h) {
        if (abstractC1048h instanceof RecyclerView.AbstractC1058t.toq) {
            return new C1114k(this.mRecyclerView.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.gvn7
    @zy.dd
    public View findSnapView(RecyclerView.AbstractC1048h abstractC1048h) {
        if (abstractC1048h.canScrollVertically()) {
            return findCenterView(abstractC1048h, getVerticalHelper(abstractC1048h));
        }
        if (abstractC1048h.canScrollHorizontally()) {
            return findCenterView(abstractC1048h, getHorizontalHelper(abstractC1048h));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.gvn7
    public int findTargetSnapPosition(RecyclerView.AbstractC1048h abstractC1048h, int i2, int i3) {
        o1t orientationHelper;
        int itemCount = abstractC1048h.getItemCount();
        if (itemCount == 0 || (orientationHelper = getOrientationHelper(abstractC1048h)) == null) {
            return -1;
        }
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        int childCount = abstractC1048h.getChildCount();
        View view = null;
        View view2 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = abstractC1048h.getChildAt(i6);
            if (childAt != null) {
                int iDistanceToCenter = distanceToCenter(childAt, orientationHelper);
                if (iDistanceToCenter <= 0 && iDistanceToCenter > i4) {
                    view2 = childAt;
                    i4 = iDistanceToCenter;
                }
                if (iDistanceToCenter >= 0 && iDistanceToCenter < i5) {
                    view = childAt;
                    i5 = iDistanceToCenter;
                }
            }
        }
        boolean zIsForwardFling = isForwardFling(abstractC1048h, i2, i3);
        if (zIsForwardFling && view != null) {
            return abstractC1048h.getPosition(view);
        }
        if (!zIsForwardFling && view2 != null) {
            return abstractC1048h.getPosition(view2);
        }
        if (zIsForwardFling) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = abstractC1048h.getPosition(view) + (isReverseLayout(abstractC1048h) == zIsForwardFling ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
