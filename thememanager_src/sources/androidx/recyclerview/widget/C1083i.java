package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.i */
/* JADX INFO: compiled from: LinearSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C1083i extends gvn7 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final float f52134zy = 1.0f;

    /* JADX INFO: renamed from: k */
    @zy.dd
    private o1t f5878k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private o1t f52135toq;

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
        o1t o1tVar = this.f52135toq;
        if (o1tVar == null || o1tVar.f6019k != abstractC1048h) {
            this.f52135toq = o1t.m5084k(abstractC1048h);
        }
        return this.f52135toq;
    }

    @zy.lvui
    private o1t getVerticalHelper(@zy.lvui RecyclerView.AbstractC1048h abstractC1048h) {
        o1t o1tVar = this.f5878k;
        if (o1tVar == null || o1tVar.f6019k != abstractC1048h) {
            this.f5878k = o1t.zy(abstractC1048h);
        }
        return this.f5878k;
    }

    /* JADX INFO: renamed from: k */
    private float m4987k(RecyclerView.AbstractC1048h abstractC1048h, o1t o1tVar) {
        int childCount = abstractC1048h.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = abstractC1048h.getChildAt(i4);
            int position = abstractC1048h.getPosition(childAt);
            if (position != -1) {
                if (position < i3) {
                    view = childAt;
                    i3 = position;
                }
                if (position > i2) {
                    view2 = childAt;
                    i2 = position;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int iMax = Math.max(o1tVar.mo5090q(view), o1tVar.mo5090q(view2)) - Math.min(o1tVar.f7l8(view), o1tVar.f7l8(view2));
        if (iMax == 0) {
            return 1.0f;
        }
        return (iMax * 1.0f) / ((i2 - i3) + 1);
    }

    private int toq(RecyclerView.AbstractC1048h abstractC1048h, o1t o1tVar, int i2, int i3) {
        int[] iArrCalculateScrollDistance = calculateScrollDistance(i2, i3);
        float fM4987k = m4987k(abstractC1048h, o1tVar);
        if (fM4987k <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArrCalculateScrollDistance[0]) > Math.abs(iArrCalculateScrollDistance[1]) ? iArrCalculateScrollDistance[0] : iArrCalculateScrollDistance[1]) / fM4987k);
    }

    @Override // androidx.recyclerview.widget.gvn7
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
    public View findSnapView(RecyclerView.AbstractC1048h abstractC1048h) {
        if (abstractC1048h.canScrollVertically()) {
            return findCenterView(abstractC1048h, getVerticalHelper(abstractC1048h));
        }
        if (abstractC1048h.canScrollHorizontally()) {
            return findCenterView(abstractC1048h, getHorizontalHelper(abstractC1048h));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.gvn7
    public int findTargetSnapPosition(RecyclerView.AbstractC1048h abstractC1048h, int i2, int i3) {
        int itemCount;
        View viewFindSnapView;
        int position;
        int i4;
        PointF pointFComputeScrollVectorForPosition;
        int qVar;
        int qVar2;
        if (!(abstractC1048h instanceof RecyclerView.AbstractC1058t.toq) || (itemCount = abstractC1048h.getItemCount()) == 0 || (viewFindSnapView = findSnapView(abstractC1048h)) == null || (position = abstractC1048h.getPosition(viewFindSnapView)) == -1 || (pointFComputeScrollVectorForPosition = ((RecyclerView.AbstractC1058t.toq) abstractC1048h).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (abstractC1048h.canScrollHorizontally()) {
            qVar = toq(abstractC1048h, getHorizontalHelper(abstractC1048h), i2, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                qVar = -qVar;
            }
        } else {
            qVar = 0;
        }
        if (abstractC1048h.canScrollVertically()) {
            qVar2 = toq(abstractC1048h, getVerticalHelper(abstractC1048h), 0, i3);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                qVar2 = -qVar2;
            }
        } else {
            qVar2 = 0;
        }
        if (abstractC1048h.canScrollVertically()) {
            qVar = qVar2;
        }
        if (qVar == 0) {
            return -1;
        }
        int i5 = position + qVar;
        int i6 = i5 >= 0 ? i5 : 0;
        return i6 >= itemCount ? i4 : i6;
    }
}
