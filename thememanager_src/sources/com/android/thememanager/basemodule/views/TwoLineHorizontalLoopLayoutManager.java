package com.android.thememanager.basemodule.views;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class TwoLineHorizontalLoopLayoutManager extends RecyclerView.AbstractC1048h {

    /* JADX INFO: renamed from: k */
    private boolean f10580k = true;

    /* JADX INFO: renamed from: q */
    private int f10581q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f57840toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f57841zy;

    /* JADX INFO: renamed from: k */
    private int m7330k(int dx, RecyclerView.fu4 recycler, RecyclerView.mcp state) {
        if (getChildCount() < 2) {
            return dx;
        }
        View view = null;
        if (dx <= 0) {
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(1);
            if (childAt2 != null && childAt2.getLeft() > 0) {
                view = childAt2;
            } else if (childAt != null && childAt.getLeft() > 0) {
                view = childAt;
            }
            if (view == null) {
                return dx;
            }
            int position = getPosition(view) - 2;
            if (position < 0) {
                position += getItemCount();
            }
            View viewM4791h = recycler.m4791h(position);
            if (viewM4791h == null) {
                return dx;
            }
            addView(viewM4791h, 0);
            measureChildWithMargins(viewM4791h, 0, 0);
            layoutDecorated(viewM4791h, view.getLeft() - getDecoratedMeasuredWidth(viewM4791h), view.getTop(), view.getLeft(), view.getTop() + getDecoratedMeasuredHeight(viewM4791h));
            return dx;
        }
        View childAt3 = getChildAt(getChildCount() - 2);
        View childAt4 = getChildAt(getChildCount() - 1);
        if (childAt3 == null || childAt3.getRight() >= getWidth()) {
            if (childAt4 != null && childAt4.getRight() < getWidth()) {
                view = childAt4;
            }
            childAt3 = view;
        }
        if (childAt3 == null) {
            return dx;
        }
        int position2 = getPosition(childAt3) + 2;
        int itemCount = position2 - (getItemCount() - 1);
        if (itemCount > 0) {
            position2 = itemCount - 1;
        }
        View viewM4791h2 = recycler.m4791h(position2);
        if (viewM4791h2 == null) {
            return dx;
        }
        addView(viewM4791h2);
        measureChildWithMargins(viewM4791h2, 0, 0);
        layoutDecorated(viewM4791h2, this.f57840toq + childAt3.getRight(), childAt3.getTop(), childAt3.getRight() + getDecoratedMeasuredWidth(viewM4791h2) + this.f57840toq, childAt3.getTop() + getDecoratedMeasuredHeight(viewM4791h2));
        return dx;
    }

    private View toq(int direction) {
        return direction > 0 ? getChildAt(0) : getChildAt(getChildCount() - 1);
    }

    private void zy(int dx, RecyclerView.fu4 recycler, RecyclerView.mcp state) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                if (dx > 0) {
                    if (childAt.getRight() < 0) {
                        removeAndRecycleView(childAt, recycler);
                    }
                } else if (childAt.getLeft() > getWidth()) {
                    removeAndRecycleView(childAt, recycler);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean canScrollHorizontally() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean canScrollVertically() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void collectAdjacentPrefetchPositions(int dx, int dy, RecyclerView.mcp state, RecyclerView.AbstractC1048h.zy layoutPrefetchRegistry) {
        if (getChildCount() == 0) {
            return;
        }
        int i2 = dx > 0 ? 1 : -1;
        View qVar = toq(i2);
        if (qVar == null) {
            return;
        }
        int position = getPosition(qVar);
        if (i2 == 1) {
            for (int i3 = position + 1; i3 < getItemCount(); i3++) {
                layoutPrefetchRegistry.mo4811k(i3, 0);
            }
            return;
        }
        for (int i4 = position - 1; i4 >= 0; i4--) {
            layoutPrefetchRegistry.mo4811k(i4, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m7331g(boolean shouldDoLayout) {
        this.f10580k = shouldDoLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateDefaultLayoutParams() {
        return new RecyclerView.cdj(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int getLayoutDirection() {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m7332n(int firstLinePosition, int secondLinePosition) {
        this.f57841zy = firstLinePosition;
        this.f10581q = secondLinePosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutChildren(RecyclerView.fu4 recycler, RecyclerView.mcp state) {
        int iM4822q = state.m4822q();
        if (iM4822q <= 0 || state.m4821p() || !this.f10580k) {
            return;
        }
        this.f10580k = false;
        detachAndScrapAttachedViews(recycler);
        int i2 = this.f57841zy;
        int i3 = this.f10581q;
        int i4 = i2;
        for (int i5 = 0; i5 < iM4822q; i5++) {
            View viewM4791h = recycler.m4791h(i5);
            addView(viewM4791h);
            measureChildWithMargins(viewM4791h, 0, 0);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewM4791h);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewM4791h);
            if (i5 % 2 == 0) {
                int i6 = i4 + decoratedMeasuredWidth;
                layoutDecorated(viewM4791h, i4, 0, i6, decoratedMeasuredHeight);
                i4 = i6;
            } else {
                int i7 = decoratedMeasuredWidth + i3;
                layoutDecorated(viewM4791h, i3, decoratedMeasuredHeight, i7, decoratedMeasuredHeight * 2);
                i3 = i7;
            }
            if (i4 > getWidth() && i3 > getWidth()) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m7333q(int horizontalPadding) {
        this.f57840toq = horizontalPadding;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollHorizontallyBy(int dx, RecyclerView.fu4 recycler, RecyclerView.mcp state) {
        int iM7330k = m7330k(dx, recycler, state);
        if (iM7330k == 0) {
            return 0;
        }
        offsetChildrenHorizontal(-iM7330k);
        zy(dx, recycler, state);
        return iM7330k;
    }
}
