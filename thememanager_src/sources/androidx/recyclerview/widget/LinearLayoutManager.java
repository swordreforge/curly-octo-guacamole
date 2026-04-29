package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.kja0;
import java.util.List;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1048h implements kja0.InterfaceC1088p, RecyclerView.AbstractC1058t.toq {
    static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    final C1045k mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final toq mLayoutChunkResult;
    private zy mLayoutState;
    int mOrientation;
    o1t mOrientationHelper;
    SavedState mPendingSavedState;
    int mPendingScrollPosition;
    int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.recyclerview.widget.LinearLayoutManager.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        int f5674k;

        /* JADX INFO: renamed from: n */
        boolean f5675n;

        /* JADX INFO: renamed from: q */
        int f5676q;

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: k */
        boolean m4768k() {
            return this.f5674k >= 0;
        }

        void toq() {
            this.f5674k = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f5674k);
            parcel.writeInt(this.f5676q);
            parcel.writeInt(this.f5675n ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f5674k = parcel.readInt();
            this.f5676q = parcel.readInt();
            this.f5675n = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.f5674k = savedState.f5674k;
            this.f5676q = savedState.f5676q;
            this.f5675n = savedState.f5675n;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$k */
    static class C1045k {

        /* JADX INFO: renamed from: k */
        o1t f5677k;

        /* JADX INFO: renamed from: n */
        boolean f5678n;

        /* JADX INFO: renamed from: q */
        boolean f5679q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52016toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f52017zy;

        C1045k() {
            m4771n();
        }

        /* JADX INFO: renamed from: k */
        void m4770k() {
            this.f52017zy = this.f5679q ? this.f5677k.mo5091s() : this.f5677k.n7h();
        }

        /* JADX INFO: renamed from: n */
        void m4771n() {
            this.f52016toq = -1;
            this.f52017zy = Integer.MIN_VALUE;
            this.f5679q = false;
            this.f5678n = false;
        }

        /* JADX INFO: renamed from: q */
        boolean m4772q(View view, RecyclerView.mcp mcpVar) {
            RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
            return !cdjVar.f7l8() && cdjVar.m4787q() >= 0 && cdjVar.m4787q() < mcpVar.m4822q();
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f52016toq + ", mCoordinate=" + this.f52017zy + ", mLayoutFromEnd=" + this.f5679q + ", mValid=" + this.f5678n + '}';
        }

        public void toq(View view, int i2) {
            if (this.f5679q) {
                this.f52017zy = this.f5677k.mo5090q(view) + this.f5677k.m5086h();
            } else {
                this.f52017zy = this.f5677k.f7l8(view);
            }
            this.f52016toq = i2;
        }

        public void zy(View view, int i2) {
            int iM5086h = this.f5677k.m5086h();
            if (iM5086h >= 0) {
                toq(view, i2);
                return;
            }
            this.f52016toq = i2;
            if (this.f5679q) {
                int iMo5091s = (this.f5677k.mo5091s() - iM5086h) - this.f5677k.mo5090q(view);
                this.f52017zy = this.f5677k.mo5091s() - iMo5091s;
                if (iMo5091s > 0) {
                    int iMo5088n = this.f52017zy - this.f5677k.mo5088n(view);
                    int iN7h = this.f5677k.n7h();
                    int iMin = iMo5088n - (iN7h + Math.min(this.f5677k.f7l8(view) - iN7h, 0));
                    if (iMin < 0) {
                        this.f52017zy += Math.min(iMo5091s, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iF7l8 = this.f5677k.f7l8(view);
            int iN7h2 = iF7l8 - this.f5677k.n7h();
            this.f52017zy = iF7l8;
            if (iN7h2 > 0) {
                int iMo5091s2 = (this.f5677k.mo5091s() - Math.min(0, (this.f5677k.mo5091s() - iM5086h) - this.f5677k.mo5090q(view))) - (iF7l8 + this.f5677k.mo5088n(view));
                if (iMo5091s2 < 0) {
                    this.f52017zy -= Math.min(iN7h2, -iMo5091s2);
                }
            }
        }
    }

    protected static class toq {

        /* JADX INFO: renamed from: k */
        public int f5680k;

        /* JADX INFO: renamed from: q */
        public boolean f5681q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public boolean f52018toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public boolean f52019zy;

        protected toq() {
        }

        /* JADX INFO: renamed from: k */
        void m4773k() {
            this.f5680k = 0;
            this.f52018toq = false;
            this.f52019zy = false;
            this.f5681q = false;
        }
    }

    static class zy {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        static final int f52020cdj = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: h */
        static final int f5682h = 1;

        /* JADX INFO: renamed from: i */
        static final int f5683i = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        static final int f52021ki = -1;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        static final int f52022kja0 = -1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        static final String f52023n7h = "LLM#LayoutState";

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        static final int f52024t8r = 1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f52025f7l8;

        /* JADX INFO: renamed from: g */
        int f5684g;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        int f52026ld6;

        /* JADX INFO: renamed from: n */
        int f5686n;

        /* JADX INFO: renamed from: q */
        int f5688q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        boolean f52027qrj;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f52028toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f52030zy;

        /* JADX INFO: renamed from: k */
        boolean f5685k = true;

        /* JADX INFO: renamed from: y */
        int f5690y = 0;

        /* JADX INFO: renamed from: s */
        int f5689s = 0;

        /* JADX INFO: renamed from: p */
        boolean f5687p = false;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        List<RecyclerView.fti> f52029x2 = null;

        zy() {
        }

        /* JADX INFO: renamed from: g */
        private View m4774g() {
            int size = this.f52029x2.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = this.f52029x2.get(i2).itemView;
                RecyclerView.cdj cdjVar = (RecyclerView.cdj) view.getLayoutParams();
                if (!cdjVar.f7l8() && this.f5688q == cdjVar.m4787q()) {
                    toq(view);
                    return view;
                }
            }
            return null;
        }

        public View f7l8(View view) {
            int iM4787q;
            int size = this.f52029x2.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f52029x2.get(i3).itemView;
                RecyclerView.cdj cdjVar = (RecyclerView.cdj) view3.getLayoutParams();
                if (view3 != view && !cdjVar.f7l8() && (iM4787q = (cdjVar.m4787q() - this.f5688q) * this.f5686n) >= 0 && iM4787q < i2) {
                    view2 = view3;
                    if (iM4787q == 0) {
                        break;
                    }
                    i2 = iM4787q;
                }
            }
            return view2;
        }

        /* JADX INFO: renamed from: k */
        public void m4775k() {
            toq(null);
        }

        /* JADX INFO: renamed from: n */
        View m4776n(RecyclerView.fu4 fu4Var) {
            if (this.f52029x2 != null) {
                return m4774g();
            }
            View viewM4791h = fu4Var.m4791h(this.f5688q);
            this.f5688q += this.f5686n;
            return viewM4791h;
        }

        /* JADX INFO: renamed from: q */
        void m4777q() {
            Log.d(f52023n7h, "avail:" + this.f52030zy + ", ind:" + this.f5688q + ", dir:" + this.f5686n + ", offset:" + this.f52028toq + ", layoutDir:" + this.f5684g);
        }

        public void toq(View view) {
            View viewF7l8 = f7l8(view);
            if (viewF7l8 == null) {
                this.f5688q = -1;
            } else {
                this.f5688q = ((RecyclerView.cdj) viewF7l8.getLayoutParams()).m4787q();
            }
        }

        boolean zy(RecyclerView.mcp mcpVar) {
            int i2 = this.f5688q;
            return i2 >= 0 && i2 < mcpVar.m4822q();
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return fti.m4977k(mcpVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return fti.toq(mcpVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return fti.zy(mcpVar, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, boolean z2) {
        int iMo5091s;
        int iMo5091s2 = this.mOrientationHelper.mo5091s() - i2;
        if (iMo5091s2 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(-iMo5091s2, fu4Var, mcpVar);
        int i4 = i2 + i3;
        if (!z2 || (iMo5091s = this.mOrientationHelper.mo5091s() - i4) <= 0) {
            return i3;
        }
        this.mOrientationHelper.mo5087i(iMo5091s);
        return iMo5091s + i3;
    }

    private int fixLayoutStartGap(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, boolean z2) {
        int iN7h;
        int iN7h2 = i2 - this.mOrientationHelper.n7h();
        if (iN7h2 <= 0) {
            return 0;
        }
        int i3 = -scrollBy(iN7h2, fu4Var, mcpVar);
        int i4 = i2 + i3;
        if (!z2 || (iN7h = i4 - this.mOrientationHelper.n7h()) <= 0) {
            return i3;
        }
        this.mOrientationHelper.mo5087i(-iN7h);
        return i3 - iN7h;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, int i2, int i3) {
        if (!mcpVar.n7h() || getChildCount() == 0 || mcpVar.m4821p() || !supportsPredictiveItemAnimations()) {
            return;
        }
        List<RecyclerView.fti> listX2 = fu4Var.x2();
        int size = listX2.size();
        int position = getPosition(getChildAt(0));
        int iMo5088n = 0;
        int iMo5088n2 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.fti ftiVar = listX2.get(i4);
            if (!ftiVar.isRemoved()) {
                if (((ftiVar.getLayoutPosition() < position) != this.mShouldReverseLayout ? (byte) -1 : (byte) 1) == -1) {
                    iMo5088n += this.mOrientationHelper.mo5088n(ftiVar.itemView);
                } else {
                    iMo5088n2 += this.mOrientationHelper.mo5088n(ftiVar.itemView);
                }
            }
        }
        this.mLayoutState.f52029x2 = listX2;
        if (iMo5088n > 0) {
            updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i2);
            zy zyVar = this.mLayoutState;
            zyVar.f5690y = iMo5088n;
            zyVar.f52030zy = 0;
            zyVar.m4775k();
            fill(fu4Var, this.mLayoutState, mcpVar, false);
        }
        if (iMo5088n2 > 0) {
            updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i3);
            zy zyVar2 = this.mLayoutState;
            zyVar2.f5690y = iMo5088n2;
            zyVar2.f52030zy = 0;
            zyVar2.m4775k();
            fill(fu4Var, this.mLayoutState, mcpVar, false);
        }
        this.mLayoutState.f52029x2 = null;
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.d(TAG, "item " + getPosition(childAt) + ", coord:" + this.mOrientationHelper.f7l8(childAt));
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.fu4 fu4Var, zy zyVar) {
        if (!zyVar.f5685k || zyVar.f52027qrj) {
            return;
        }
        int i2 = zyVar.f52025f7l8;
        int i3 = zyVar.f5689s;
        if (zyVar.f5684g == -1) {
            recycleViewsFromEnd(fu4Var, i2, i3);
        } else {
            recycleViewsFromStart(fu4Var, i2, i3);
        }
    }

    private void recycleChildren(RecyclerView.fu4 fu4Var, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                removeAndRecycleViewAt(i2, fu4Var);
                i2--;
            }
        } else {
            for (int i4 = i3 - 1; i4 >= i2; i4--) {
                removeAndRecycleViewAt(i4, fu4Var);
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.fu4 fu4Var, int i2, int i3) {
        int childCount = getChildCount();
        if (i2 < 0) {
            return;
        }
        int iMo5092y = (this.mOrientationHelper.mo5092y() - i2) + i3;
        if (this.mShouldReverseLayout) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (this.mOrientationHelper.f7l8(childAt) < iMo5092y || this.mOrientationHelper.ki(childAt) < iMo5092y) {
                    recycleChildren(fu4Var, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = childCount - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.f7l8(childAt2) < iMo5092y || this.mOrientationHelper.ki(childAt2) < iMo5092y) {
                recycleChildren(fu4Var, i5, i6);
                return;
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.fu4 fu4Var, int i2, int i3) {
        if (i2 < 0) {
            return;
        }
        int i4 = i2 - i3;
        int childCount = getChildCount();
        if (!this.mShouldReverseLayout) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (this.mOrientationHelper.mo5090q(childAt) > i4 || this.mOrientationHelper.cdj(childAt) > i4) {
                    recycleChildren(fu4Var, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = childCount - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View childAt2 = getChildAt(i7);
            if (this.mOrientationHelper.mo5090q(childAt2) > i4 || this.mOrientationHelper.cdj(childAt2) > i4) {
                recycleChildren(fu4Var, i6, i7);
                return;
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, C1045k c1045k) {
        View viewFindReferenceChild;
        boolean z2 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null && c1045k.m4772q(focusedChild, mcpVar)) {
            c1045k.zy(focusedChild, getPosition(focusedChild));
            return true;
        }
        boolean z3 = this.mLastStackFromEnd;
        boolean z5 = this.mStackFromEnd;
        if (z3 != z5 || (viewFindReferenceChild = findReferenceChild(fu4Var, mcpVar, c1045k.f5679q, z5)) == null) {
            return false;
        }
        c1045k.toq(viewFindReferenceChild, getPosition(viewFindReferenceChild));
        if (!mcpVar.m4821p() && supportsPredictiveItemAnimations()) {
            int iF7l8 = this.mOrientationHelper.f7l8(viewFindReferenceChild);
            int iMo5090q = this.mOrientationHelper.mo5090q(viewFindReferenceChild);
            int iN7h = this.mOrientationHelper.n7h();
            int iMo5091s = this.mOrientationHelper.mo5091s();
            boolean z6 = iMo5090q <= iN7h && iF7l8 < iN7h;
            if (iF7l8 >= iMo5091s && iMo5090q > iMo5091s) {
                z2 = true;
            }
            if (z6 || z2) {
                if (c1045k.f5679q) {
                    iN7h = iMo5091s;
                }
                c1045k.f52017zy = iN7h;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.mcp mcpVar, C1045k c1045k) {
        int i2;
        if (!mcpVar.m4821p() && (i2 = this.mPendingScrollPosition) != -1) {
            if (i2 >= 0 && i2 < mcpVar.m4822q()) {
                c1045k.f52016toq = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.m4768k()) {
                    boolean z2 = this.mPendingSavedState.f5675n;
                    c1045k.f5679q = z2;
                    if (z2) {
                        c1045k.f52017zy = this.mOrientationHelper.mo5091s() - this.mPendingSavedState.f5676q;
                    } else {
                        c1045k.f52017zy = this.mOrientationHelper.n7h() + this.mPendingSavedState.f5676q;
                    }
                    return true;
                }
                if (this.mPendingScrollPositionOffset != Integer.MIN_VALUE) {
                    boolean z3 = this.mShouldReverseLayout;
                    c1045k.f5679q = z3;
                    if (z3) {
                        c1045k.f52017zy = this.mOrientationHelper.mo5091s() - this.mPendingScrollPositionOffset;
                    } else {
                        c1045k.f52017zy = this.mOrientationHelper.n7h() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
                View viewFindViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                if (viewFindViewByPosition == null) {
                    if (getChildCount() > 0) {
                        c1045k.f5679q = (this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout;
                    }
                    c1045k.m4770k();
                } else {
                    if (this.mOrientationHelper.mo5088n(viewFindViewByPosition) > this.mOrientationHelper.kja0()) {
                        c1045k.m4770k();
                        return true;
                    }
                    if (this.mOrientationHelper.f7l8(viewFindViewByPosition) - this.mOrientationHelper.n7h() < 0) {
                        c1045k.f52017zy = this.mOrientationHelper.n7h();
                        c1045k.f5679q = false;
                        return true;
                    }
                    if (this.mOrientationHelper.mo5091s() - this.mOrientationHelper.mo5090q(viewFindViewByPosition) < 0) {
                        c1045k.f52017zy = this.mOrientationHelper.mo5091s();
                        c1045k.f5679q = true;
                        return true;
                    }
                    c1045k.f52017zy = c1045k.f5679q ? this.mOrientationHelper.mo5090q(viewFindViewByPosition) + this.mOrientationHelper.m5086h() : this.mOrientationHelper.f7l8(viewFindViewByPosition);
                }
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, C1045k c1045k) {
        if (updateAnchorFromPendingData(mcpVar, c1045k) || updateAnchorFromChildren(fu4Var, mcpVar, c1045k)) {
            return;
        }
        c1045k.m4770k();
        c1045k.f52016toq = this.mStackFromEnd ? mcpVar.m4822q() - 1 : 0;
    }

    private void updateLayoutState(int i2, int i3, boolean z2, RecyclerView.mcp mcpVar) {
        int iN7h;
        this.mLayoutState.f52027qrj = resolveIsInfinite();
        this.mLayoutState.f5684g = i2;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(mcpVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        boolean z3 = i2 == 1;
        zy zyVar = this.mLayoutState;
        int i4 = z3 ? iMax2 : iMax;
        zyVar.f5690y = i4;
        if (!z3) {
            iMax = iMax2;
        }
        zyVar.f5689s = iMax;
        if (z3) {
            zyVar.f5690y = i4 + this.mOrientationHelper.mo5089p();
            View childClosestToEnd = getChildClosestToEnd();
            zy zyVar2 = this.mLayoutState;
            zyVar2.f5686n = this.mShouldReverseLayout ? -1 : 1;
            int position = getPosition(childClosestToEnd);
            zy zyVar3 = this.mLayoutState;
            zyVar2.f5688q = position + zyVar3.f5686n;
            zyVar3.f52028toq = this.mOrientationHelper.mo5090q(childClosestToEnd);
            iN7h = this.mOrientationHelper.mo5090q(childClosestToEnd) - this.mOrientationHelper.mo5091s();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.f5690y += this.mOrientationHelper.n7h();
            zy zyVar4 = this.mLayoutState;
            zyVar4.f5686n = this.mShouldReverseLayout ? 1 : -1;
            int position2 = getPosition(childClosestToStart);
            zy zyVar5 = this.mLayoutState;
            zyVar4.f5688q = position2 + zyVar5.f5686n;
            zyVar5.f52028toq = this.mOrientationHelper.f7l8(childClosestToStart);
            iN7h = (-this.mOrientationHelper.f7l8(childClosestToStart)) + this.mOrientationHelper.n7h();
        }
        zy zyVar6 = this.mLayoutState;
        zyVar6.f52030zy = i3;
        if (z2) {
            zyVar6.f52030zy = i3 - iN7h;
        }
        zyVar6.f52025f7l8 = iN7h;
    }

    private void updateLayoutStateToFillEnd(C1045k c1045k) {
        updateLayoutStateToFillEnd(c1045k.f52016toq, c1045k.f52017zy);
    }

    private void updateLayoutStateToFillStart(C1045k c1045k) {
        updateLayoutStateToFillStart(c1045k.f52016toq, c1045k.f52017zy);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    protected void calculateExtraLayoutSpace(@zy.lvui RecyclerView.mcp mcpVar, @zy.lvui int[] iArr) {
        int i2;
        int extraLayoutSpace = getExtraLayoutSpace(mcpVar);
        if (this.mLayoutState.f5684g == -1) {
            i2 = 0;
        } else {
            i2 = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.mcp mcpVar, RecyclerView.AbstractC1048h.zy zyVar) {
        if (this.mOrientation != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        ensureLayoutState();
        updateLayoutState(i2 > 0 ? 1 : -1, Math.abs(i2), true, mcpVar);
        collectPrefetchPositionsForLayoutState(mcpVar, this.mLayoutState, zyVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void collectInitialPrefetchPositions(int i2, RecyclerView.AbstractC1048h.zy zyVar) {
        boolean z2;
        int i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState == null || !savedState.m4768k()) {
            resolveShouldLayoutReverse();
            z2 = this.mShouldReverseLayout;
            i3 = this.mPendingScrollPosition;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z2 = savedState2.f5675n;
            i3 = savedState2.f5674k;
        }
        int i4 = z2 ? -1 : 1;
        for (int i5 = 0; i5 < this.mInitialPrefetchItemCount && i3 >= 0 && i3 < i2; i5++) {
            zyVar.mo4811k(i3, 0);
            i3 += i4;
        }
    }

    void collectPrefetchPositionsForLayoutState(RecyclerView.mcp mcpVar, zy zyVar, RecyclerView.AbstractC1048h.zy zyVar2) {
        int i2 = zyVar.f5688q;
        if (i2 < 0 || i2 >= mcpVar.m4822q()) {
            return;
        }
        zyVar2.mo4811k(i2, Math.max(0, zyVar.f52025f7l8));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollExtent(RecyclerView.mcp mcpVar) {
        return computeScrollExtent(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollOffset(RecyclerView.mcp mcpVar) {
        return computeScrollOffset(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeHorizontalScrollRange(RecyclerView.mcp mcpVar) {
        return computeScrollRange(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1058t.toq
    public PointF computeScrollVectorForPosition(int i2) {
        if (getChildCount() == 0) {
            return null;
        }
        int i3 = (i2 < getPosition(getChildAt(0))) != this.mShouldReverseLayout ? -1 : 1;
        return this.mOrientation == 0 ? new PointF(i3, 0.0f) : new PointF(0.0f, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollExtent(RecyclerView.mcp mcpVar) {
        return computeScrollExtent(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollOffset(RecyclerView.mcp mcpVar) {
        return computeScrollOffset(mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int computeVerticalScrollRange(RecyclerView.mcp mcpVar) {
        return computeScrollRange(mcpVar);
    }

    int convertFocusDirectionToLayoutDirection(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.mOrientation == 1) ? 1 : Integer.MIN_VALUE : this.mOrientation == 0 ? 1 : Integer.MIN_VALUE : this.mOrientation == 1 ? -1 : Integer.MIN_VALUE : this.mOrientation == 0 ? -1 : Integer.MIN_VALUE : (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1 : (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
    }

    zy createLayoutState() {
        return new zy();
    }

    void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    int fill(RecyclerView.fu4 fu4Var, zy zyVar, RecyclerView.mcp mcpVar, boolean z2) {
        int i2 = zyVar.f52030zy;
        int i3 = zyVar.f52025f7l8;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                zyVar.f52025f7l8 = i3 + i2;
            }
            recycleByLayoutState(fu4Var, zyVar);
        }
        int i4 = zyVar.f52030zy + zyVar.f5690y;
        toq toqVar = this.mLayoutChunkResult;
        while (true) {
            if ((!zyVar.f52027qrj && i4 <= 0) || !zyVar.zy(mcpVar)) {
                break;
            }
            toqVar.m4773k();
            layoutChunk(fu4Var, mcpVar, zyVar, toqVar);
            if (!toqVar.f52018toq) {
                zyVar.f52028toq += toqVar.f5680k * zyVar.f5684g;
                if (!toqVar.f52019zy || zyVar.f52029x2 != null || !mcpVar.m4821p()) {
                    int i5 = zyVar.f52030zy;
                    int i6 = toqVar.f5680k;
                    zyVar.f52030zy = i5 - i6;
                    i4 -= i6;
                }
                int i7 = zyVar.f52025f7l8;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + toqVar.f5680k;
                    zyVar.f52025f7l8 = i8;
                    int i9 = zyVar.f52030zy;
                    if (i9 < 0) {
                        zyVar.f52025f7l8 = i8 + i9;
                    }
                    recycleByLayoutState(fu4Var, zyVar);
                }
                if (z2 && toqVar.f5681q) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - zyVar.f52030zy;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findFirstVisibleChildClosestToEnd(boolean z2, boolean z3) {
        return this.mShouldReverseLayout ? findOneVisibleChild(0, getChildCount(), z2, z3) : findOneVisibleChild(getChildCount() - 1, -1, z2, z3);
    }

    View findFirstVisibleChildClosestToStart(boolean z2, boolean z3) {
        return this.mShouldReverseLayout ? findOneVisibleChild(getChildCount() - 1, -1, z2, z3) : findOneVisibleChild(0, getChildCount(), z2, z3);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    View findOnePartiallyOrCompletelyInvisibleChild(int i2, int i3) {
        int i4;
        int i5;
        ensureLayoutState();
        if ((i3 > i2 ? (byte) 1 : i3 < i2 ? (byte) -1 : (byte) 0) == 0) {
            return getChildAt(i2);
        }
        if (this.mOrientationHelper.f7l8(getChildAt(i2)) < this.mOrientationHelper.n7h()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m4958k(i2, i3, i4, i5) : this.mVerticalBoundCheck.m4958k(i2, i3, i4, i5);
    }

    View findOneVisibleChild(int i2, int i3, boolean z2, boolean z3) {
        ensureLayoutState();
        int i4 = z2 ? 24579 : 320;
        int i5 = z3 ? 320 : 0;
        return this.mOrientation == 0 ? this.mHorizontalBoundCheck.m4958k(i2, i3, i4, i5) : this.mVerticalBoundCheck.m4958k(i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View findReferenceChild(androidx.recyclerview.widget.RecyclerView.fu4 r17, androidx.recyclerview.widget.RecyclerView.mcp r18, boolean r19, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r16.ensureLayoutState()
            int r1 = r16.getChildCount()
            r2 = -1
            r3 = 0
            r4 = 1
            if (r20 == 0) goto L15
            int r1 = r16.getChildCount()
            int r1 = r1 - r4
            r5 = r2
            goto L18
        L15:
            r2 = r1
            r1 = r3
            r5 = r4
        L18:
            int r6 = r18.m4822q()
            androidx.recyclerview.widget.o1t r7 = r0.mOrientationHelper
            int r7 = r7.n7h()
            androidx.recyclerview.widget.o1t r8 = r0.mOrientationHelper
            int r8 = r8.mo5091s()
            r9 = 0
            r10 = r9
            r11 = r10
        L2b:
            if (r1 == r2) goto L7a
            android.view.View r12 = r0.getChildAt(r1)
            int r13 = r0.getPosition(r12)
            androidx.recyclerview.widget.o1t r14 = r0.mOrientationHelper
            int r14 = r14.f7l8(r12)
            androidx.recyclerview.widget.o1t r15 = r0.mOrientationHelper
            int r15 = r15.mo5090q(r12)
            if (r13 < 0) goto L78
            if (r13 >= r6) goto L78
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$cdj r13 = (androidx.recyclerview.widget.RecyclerView.cdj) r13
            boolean r13 = r13.f7l8()
            if (r13 == 0) goto L55
            if (r11 != 0) goto L78
            r11 = r12
            goto L78
        L55:
            if (r15 > r7) goto L5b
            if (r14 >= r7) goto L5b
            r13 = r4
            goto L5c
        L5b:
            r13 = r3
        L5c:
            if (r14 < r8) goto L62
            if (r15 <= r8) goto L62
            r14 = r4
            goto L63
        L62:
            r14 = r3
        L63:
            if (r13 != 0) goto L69
            if (r14 == 0) goto L68
            goto L69
        L68:
            return r12
        L69:
            if (r19 == 0) goto L71
            if (r14 == 0) goto L6e
            goto L73
        L6e:
            if (r9 != 0) goto L78
            goto L77
        L71:
            if (r13 == 0) goto L75
        L73:
            r10 = r12
            goto L78
        L75:
            if (r9 != 0) goto L78
        L77:
            r9 = r12
        L78:
            int r1 = r1 + r5
            goto L2b
        L7a:
            if (r9 == 0) goto L7d
            goto L82
        L7d:
            if (r10 == 0) goto L81
            r9 = r10
            goto L82
        L81:
            r9 = r11
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(androidx.recyclerview.widget.RecyclerView$fu4, androidx.recyclerview.widget.RecyclerView$mcp, boolean, boolean):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public View findViewByPosition(int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i2 - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i2) {
                return childAt;
            }
        }
        return super.findViewByPosition(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public RecyclerView.cdj generateDefaultLayoutParams() {
        return new RecyclerView.cdj(-2, -2);
    }

    @Deprecated
    protected int getExtraLayoutSpace(RecyclerView.mcp mcpVar) {
        if (mcpVar.m4824y()) {
            return this.mOrientationHelper.kja0();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    protected boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    void layoutChunk(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, zy zyVar, toq toqVar) {
        int i2;
        int i3;
        int i4;
        int paddingLeft;
        int iMo5085g;
        View viewM4776n = zyVar.m4776n(fu4Var);
        if (viewM4776n == null) {
            toqVar.f52018toq = true;
            return;
        }
        RecyclerView.cdj cdjVar = (RecyclerView.cdj) viewM4776n.getLayoutParams();
        if (zyVar.f52029x2 == null) {
            if (this.mShouldReverseLayout == (zyVar.f5684g == -1)) {
                addView(viewM4776n);
            } else {
                addView(viewM4776n, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (zyVar.f5684g == -1)) {
                addDisappearingView(viewM4776n);
            } else {
                addDisappearingView(viewM4776n, 0);
            }
        }
        measureChildWithMargins(viewM4776n, 0, 0);
        toqVar.f5680k = this.mOrientationHelper.mo5088n(viewM4776n);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iMo5085g = getWidth() - getPaddingRight();
                paddingLeft = iMo5085g - this.mOrientationHelper.mo5085g(viewM4776n);
            } else {
                paddingLeft = getPaddingLeft();
                iMo5085g = this.mOrientationHelper.mo5085g(viewM4776n) + paddingLeft;
            }
            if (zyVar.f5684g == -1) {
                int i5 = zyVar.f52028toq;
                i4 = i5;
                i3 = iMo5085g;
                i2 = i5 - toqVar.f5680k;
            } else {
                int i6 = zyVar.f52028toq;
                i2 = i6;
                i3 = iMo5085g;
                i4 = toqVar.f5680k + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo5085g2 = this.mOrientationHelper.mo5085g(viewM4776n) + paddingTop;
            if (zyVar.f5684g == -1) {
                int i7 = zyVar.f52028toq;
                i3 = i7;
                i2 = paddingTop;
                i4 = iMo5085g2;
                paddingLeft = i7 - toqVar.f5680k;
            } else {
                int i8 = zyVar.f52028toq;
                i2 = paddingTop;
                i3 = toqVar.f5680k + i8;
                i4 = iMo5085g2;
                paddingLeft = i8;
            }
        }
        layoutDecoratedWithMargins(viewM4776n, paddingLeft, i2, i3, i4);
        if (cdjVar.f7l8() || cdjVar.m4784g()) {
            toqVar.f52019zy = true;
        }
        toqVar.f5681q = viewM4776n.hasFocusable();
    }

    void onAnchorReady(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar, C1045k c1045k, int i2) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.fu4 fu4Var) {
        super.onDetachedFromWindow(recyclerView, fu4Var);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(fu4Var);
            fu4Var.m4796q();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public View onFocusSearchFailed(View view, int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        int iConvertFocusDirectionToLayoutDirection;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(iConvertFocusDirectionToLayoutDirection, (int) (this.mOrientationHelper.kja0() * MAX_SCROLL_FACTOR), false, mcpVar);
        zy zyVar = this.mLayoutState;
        zyVar.f52025f7l8 = Integer.MIN_VALUE;
        zyVar.f5685k = false;
        fill(fu4Var, zyVar, mcpVar, true);
        View viewFindPartiallyOrCompletelyInvisibleChildClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? findPartiallyOrCompletelyInvisibleChildClosestToStart() : findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        View childClosestToStart = iConvertFocusDirectionToLayoutDirection == -1 ? getChildClosestToStart() : getChildClosestToEnd();
        if (!childClosestToStart.hasFocusable()) {
            return viewFindPartiallyOrCompletelyInvisibleChildClosestToStart;
        }
        if (viewFindPartiallyOrCompletelyInvisibleChildClosestToStart == null) {
            return null;
        }
        return childClosestToStart;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutChildren(RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int iFixLayoutEndGap;
        int i6;
        View viewFindViewByPosition;
        int iF7l8;
        int iMo5091s;
        int i7 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && mcpVar.m4822q() == 0) {
            removeAndRecycleAllViews(fu4Var);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.m4768k()) {
            this.mPendingScrollPosition = this.mPendingSavedState.f5674k;
        }
        ensureLayoutState();
        this.mLayoutState.f5685k = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C1045k c1045k = this.mAnchorInfo;
        if (!c1045k.f5678n || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            c1045k.m4771n();
            C1045k c1045k2 = this.mAnchorInfo;
            c1045k2.f5679q = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(fu4Var, mcpVar, c1045k2);
            this.mAnchorInfo.f5678n = true;
        } else if (focusedChild != null && (this.mOrientationHelper.f7l8(focusedChild) >= this.mOrientationHelper.mo5091s() || this.mOrientationHelper.mo5090q(focusedChild) <= this.mOrientationHelper.n7h())) {
            this.mAnchorInfo.zy(focusedChild, getPosition(focusedChild));
        }
        zy zyVar = this.mLayoutState;
        zyVar.f5684g = zyVar.f52026ld6 >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(mcpVar, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.n7h();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.mo5089p();
        if (mcpVar.m4821p() && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                iMo5091s = this.mOrientationHelper.mo5091s() - this.mOrientationHelper.mo5090q(viewFindViewByPosition);
                iF7l8 = this.mPendingScrollPositionOffset;
            } else {
                iF7l8 = this.mOrientationHelper.f7l8(viewFindViewByPosition) - this.mOrientationHelper.n7h();
                iMo5091s = this.mPendingScrollPositionOffset;
            }
            int i8 = iMo5091s - iF7l8;
            if (i8 > 0) {
                iMax += i8;
            } else {
                iMax2 -= i8;
            }
        }
        C1045k c1045k3 = this.mAnchorInfo;
        if (!c1045k3.f5679q ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i7 = 1;
        }
        onAnchorReady(fu4Var, mcpVar, c1045k3, i7);
        detachAndScrapAttachedViews(fu4Var);
        this.mLayoutState.f52027qrj = resolveIsInfinite();
        this.mLayoutState.f5687p = mcpVar.m4821p();
        this.mLayoutState.f5689s = 0;
        C1045k c1045k4 = this.mAnchorInfo;
        if (c1045k4.f5679q) {
            updateLayoutStateToFillStart(c1045k4);
            zy zyVar2 = this.mLayoutState;
            zyVar2.f5690y = iMax;
            fill(fu4Var, zyVar2, mcpVar, false);
            zy zyVar3 = this.mLayoutState;
            i3 = zyVar3.f52028toq;
            int i9 = zyVar3.f5688q;
            int i10 = zyVar3.f52030zy;
            if (i10 > 0) {
                iMax2 += i10;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            zy zyVar4 = this.mLayoutState;
            zyVar4.f5690y = iMax2;
            zyVar4.f5688q += zyVar4.f5686n;
            fill(fu4Var, zyVar4, mcpVar, false);
            zy zyVar5 = this.mLayoutState;
            i2 = zyVar5.f52028toq;
            int i11 = zyVar5.f52030zy;
            if (i11 > 0) {
                updateLayoutStateToFillStart(i9, i3);
                zy zyVar6 = this.mLayoutState;
                zyVar6.f5690y = i11;
                fill(fu4Var, zyVar6, mcpVar, false);
                i3 = this.mLayoutState.f52028toq;
            }
        } else {
            updateLayoutStateToFillEnd(c1045k4);
            zy zyVar7 = this.mLayoutState;
            zyVar7.f5690y = iMax2;
            fill(fu4Var, zyVar7, mcpVar, false);
            zy zyVar8 = this.mLayoutState;
            i2 = zyVar8.f52028toq;
            int i12 = zyVar8.f5688q;
            int i13 = zyVar8.f52030zy;
            if (i13 > 0) {
                iMax += i13;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            zy zyVar9 = this.mLayoutState;
            zyVar9.f5690y = iMax;
            zyVar9.f5688q += zyVar9.f5686n;
            fill(fu4Var, zyVar9, mcpVar, false);
            zy zyVar10 = this.mLayoutState;
            i3 = zyVar10.f52028toq;
            int i14 = zyVar10.f52030zy;
            if (i14 > 0) {
                updateLayoutStateToFillEnd(i12, i2);
                zy zyVar11 = this.mLayoutState;
                zyVar11.f5690y = i14;
                fill(fu4Var, zyVar11, mcpVar, false);
                i2 = this.mLayoutState.f52028toq;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i2, fu4Var, mcpVar, true);
                i4 = i3 + iFixLayoutEndGap2;
                i5 = i2 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i4, fu4Var, mcpVar, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i3, fu4Var, mcpVar, true);
                i4 = i3 + iFixLayoutStartGap;
                i5 = i2 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i5, fu4Var, mcpVar, false);
            }
            i3 = i4 + iFixLayoutEndGap;
            i2 = i5 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(fu4Var, mcpVar, i3, i2);
        if (mcpVar.m4821p()) {
            this.mAnchorInfo.m4771n();
        } else {
            this.mOrientationHelper.fn3e();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onLayoutCompleted(RecyclerView.mcp mcpVar) {
        super.onLayoutCompleted(mcpVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.m4771n();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.toq();
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z2 = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState.f5675n = z2;
            if (z2) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState.f5676q = this.mOrientationHelper.mo5091s() - this.mOrientationHelper.mo5090q(childClosestToEnd);
                savedState.f5674k = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState.f5674k = getPosition(childClosestToStart);
                savedState.f5676q = this.mOrientationHelper.f7l8(childClosestToStart) - this.mOrientationHelper.n7h();
            }
        } else {
            savedState.toq();
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.kja0.InterfaceC1088p
    public void prepareForDrop(@zy.lvui View view, @zy.lvui View view2, int i2, int i3) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        byte b2 = position < position2 ? (byte) 1 : (byte) -1;
        if (this.mShouldReverseLayout) {
            if (b2 == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5091s() - (this.mOrientationHelper.f7l8(view2) + this.mOrientationHelper.mo5088n(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5091s() - this.mOrientationHelper.mo5090q(view2));
                return;
            }
        }
        if (b2 == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.f7l8(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.mo5090q(view2) - this.mOrientationHelper.mo5088n(view));
        }
    }

    boolean resolveIsInfinite() {
        return this.mOrientationHelper.x2() == 0 && this.mOrientationHelper.mo5092y() == 0;
    }

    int scrollBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.f5685k = true;
        int i3 = i2 > 0 ? 1 : -1;
        int iAbs = Math.abs(i2);
        updateLayoutState(i3, iAbs, true, mcpVar);
        zy zyVar = this.mLayoutState;
        int iFill = zyVar.f52025f7l8 + fill(fu4Var, zyVar, mcpVar, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i2 = i3 * iFill;
        }
        this.mOrientationHelper.mo5087i(-i2);
        this.mLayoutState.f52026ld6 = i2;
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollHorizontallyBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i2, fu4Var, mcpVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void scrollToPosition(int i2) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.toq();
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i2, int i3) {
        this.mPendingScrollPosition = i2;
        this.mPendingScrollPositionOffset = i3;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.toq();
        }
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public int scrollVerticallyBy(int i2, RecyclerView.fu4 fu4Var, RecyclerView.mcp mcpVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i2, fu4Var, mcpVar);
    }

    public void setInitialPrefetchItemCount(int i2) {
        this.mInitialPrefetchItemCount = i2;
    }

    public void setOrientation(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i2);
        }
        assertNotInLayoutOrScroll(null);
        if (i2 != this.mOrientation || this.mOrientationHelper == null) {
            o1t qVar = o1t.toq(this, i2);
            this.mOrientationHelper = qVar;
            this.mAnchorInfo.f5677k = qVar;
            this.mOrientation = i2;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z2) {
        this.mRecycleChildrenOnDetach = z2;
    }

    public void setReverseLayout(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (z2 == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z2;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z2) {
        this.mSmoothScrollbarEnabled = z2;
    }

    public void setStackFromEnd(boolean z2) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z2) {
            return;
        }
        this.mStackFromEnd = z2;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.mcp mcpVar, int i2) {
        t8r t8rVar = new t8r(recyclerView.getContext());
        t8rVar.cdj(i2);
        startSmoothScroll(t8rVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    void validateChildOrder() {
        Log.d(TAG, "validating child count " + getChildCount());
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iF7l8 = this.mOrientationHelper.f7l8(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i2 = 1; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                int position2 = getPosition(childAt);
                int iF7l82 = this.mOrientationHelper.f7l8(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sb = new StringBuilder();
                    sb.append("detected invalid position. loc invalid? ");
                    sb.append(iF7l82 < iF7l8);
                    throw new RuntimeException(sb.toString());
                }
                if (iF7l82 > iF7l8) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i3 = 1; i3 < getChildCount(); i3++) {
            View childAt2 = getChildAt(i3);
            int position3 = getPosition(childAt2);
            int iF7l83 = this.mOrientationHelper.f7l8(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("detected invalid position. loc invalid? ");
                sb2.append(iF7l83 < iF7l8);
                throw new RuntimeException(sb2.toString());
            }
            if (iF7l83 < iF7l8) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public LinearLayoutManager(Context context, int i2, boolean z2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1045k();
        this.mLayoutChunkResult = new toq();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i2);
        setReverseLayout(z2);
    }

    private void updateLayoutStateToFillEnd(int i2, int i3) {
        this.mLayoutState.f52030zy = this.mOrientationHelper.mo5091s() - i3;
        zy zyVar = this.mLayoutState;
        zyVar.f5686n = this.mShouldReverseLayout ? -1 : 1;
        zyVar.f5688q = i2;
        zyVar.f5684g = 1;
        zyVar.f52028toq = i3;
        zyVar.f52025f7l8 = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i2, int i3) {
        this.mLayoutState.f52030zy = i3 - this.mOrientationHelper.n7h();
        zy zyVar = this.mLayoutState;
        zyVar.f5688q = i2;
        zyVar.f5686n = this.mShouldReverseLayout ? 1 : -1;
        zyVar.f5684g = -1;
        zyVar.f52028toq = i3;
        zyVar.f52025f7l8 = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new C1045k();
        this.mLayoutChunkResult = new toq();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.AbstractC1048h.q properties = RecyclerView.AbstractC1048h.getProperties(context, attributeSet, i2, i3);
        setOrientation(properties.f5711k);
        setReverseLayout(properties.f52037zy);
        setStackFromEnd(properties.f5712q);
    }
}
