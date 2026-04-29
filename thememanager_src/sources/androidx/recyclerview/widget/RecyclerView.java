package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.C0720t;
import androidx.core.view.accessibility.ki;
import androidx.core.view.ch;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1084k;
import androidx.recyclerview.widget.C1113t;
import androidx.recyclerview.widget.dd;
import androidx.recyclerview.widget.f7l8;
import androidx.recyclerview.widget.n7h;
import androidx.recyclerview.widget.x9kr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ncyb.C7401k;
import zy.InterfaceC7833l;
import zy.InterfaceC7842s;
import zy.uv6;
import zy.yz;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements androidx.core.view.ncyb, androidx.core.view.mcp, androidx.core.view.jk {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    C1113t mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC1060y mAdapter;
    C1084k mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private ld6 mChildDrawingOrderCallback;
    androidx.recyclerview.widget.f7l8 mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @zy.lvui
    private x2 mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @yz
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.n7h mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC1049i mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    qrj mItemAnimator;
    private qrj.zy mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<kja0> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;

    @yz
    AbstractC1048h mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final o1t mObserver;
    private List<ki> mOnChildAttachStateListeners;
    private t8r mOnFlingListener;
    private final ArrayList<InterfaceC1049i> mOnItemTouchListeners;

    @yz
    final List<fti> mPendingAccessibilityImportanceChange;
    SavedState mPendingSavedState;
    boolean mPostedAnimatorRunner;
    n7h.toq mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final fu4 mRecycler;
    InterfaceC1061z mRecyclerListener;
    final List<InterfaceC1061z> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private fn3e mScrollListener;
    private List<fn3e> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private androidx.core.view.fti mScrollingChildHelper;
    final mcp mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final a9 mViewFlinger;
    private final x9kr.toq mViewInfoProcessCallback;
    final x9kr mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    class a9 implements Runnable {

        /* JADX INFO: renamed from: g */
        Interpolator f5692g;

        /* JADX INFO: renamed from: k */
        private int f5693k;

        /* JADX INFO: renamed from: n */
        OverScroller f5694n;

        /* JADX INFO: renamed from: q */
        private int f5696q;

        /* JADX INFO: renamed from: s */
        private boolean f5697s;

        /* JADX INFO: renamed from: y */
        private boolean f5698y;

        a9() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f5692g = interpolator;
            this.f5698y = false;
            this.f5697s = false;
            this.f5694n = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* JADX INFO: renamed from: k */
        private int m4780k(int i2, int i3) {
            int iAbs = Math.abs(i2);
            int iAbs2 = Math.abs(i3);
            boolean z2 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z2) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void zy() {
            RecyclerView.this.removeCallbacks(this);
            C0683f.mbx(RecyclerView.this, this);
        }

        /* JADX INFO: renamed from: g */
        public void mo4781g() {
            RecyclerView.this.removeCallbacks(this);
            this.f5694n.abortAnimation();
        }

        /* JADX INFO: renamed from: n */
        public void mo4782n(int i2, int i3, int i4, @zy.dd Interpolator interpolator) {
            if (i4 == Integer.MIN_VALUE) {
                i4 = m4780k(i2, i3);
            }
            int i5 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f5692g != interpolator) {
                this.f5692g = interpolator;
                this.f5694n = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5696q = 0;
            this.f5693k = 0;
            RecyclerView.this.setScrollState(2);
            this.f5694n.startScroll(0, 0, i2, i3, i5);
            mo4783q();
        }

        /* JADX INFO: renamed from: q */
        void mo4783q() {
            if (this.f5698y) {
                this.f5697s = true;
            } else {
                zy();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo4781g();
                return;
            }
            this.f5697s = false;
            this.f5698y = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f5694n;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f5693k;
                int i5 = currY - this.f5696q;
                this.f5693k = currX;
                this.f5696q = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i3 = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i3;
                    i5 -= i2;
                    AbstractC1058t abstractC1058t = recyclerView4.mLayout.mSmoothScroller;
                    if (abstractC1058t != null && !abstractC1058t.m4868y() && abstractC1058t.m4867s()) {
                        int iM4822q = RecyclerView.this.mState.m4822q();
                        if (iM4822q == 0) {
                            abstractC1058t.t8r();
                        } else if (abstractC1058t.m4861g() >= iM4822q) {
                            abstractC1058t.cdj(iM4822q - 1);
                            abstractC1058t.ld6(i3, i2);
                        } else {
                            abstractC1058t.ld6(i3, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i3, i2, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i3 != 0 || i2 != 0) {
                    recyclerView6.dispatchOnScrolled(i3, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                AbstractC1058t abstractC1058t2 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((abstractC1058t2 != null && abstractC1058t2.m4868y()) || !z2) {
                    mo4783q();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.n7h n7hVar = recyclerView7.mGapWorker;
                    if (n7hVar != null) {
                        n7hVar.m5066g(recyclerView7, i3, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i8, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.toq();
                    }
                }
            }
            AbstractC1058t abstractC1058t3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (abstractC1058t3 != null && abstractC1058t3.m4868y()) {
                abstractC1058t3.ld6(0, 0);
            }
            this.f5698y = false;
            if (this.f5697s) {
                zy();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        public void toq(int i2, int i3) {
            RecyclerView.this.setScrollState(2);
            this.f5696q = 0;
            this.f5693k = 0;
            Interpolator interpolator = this.f5692g;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f5692g = interpolator2;
                this.f5694n = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5694n.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4783q();
        }
    }

    static /* synthetic */ class f7l8 {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f5701k;

        static {
            int[] iArr = new int[AbstractC1060y.k.values().length];
            f5701k = iArr;
            try {
                iArr[AbstractC1060y.k.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5701k[AbstractC1060y.k.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class fn3e {
        public void onScrollStateChanged(@zy.lvui RecyclerView recyclerView, int i2) {
        }

        public void onScrolled(@zy.lvui RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static abstract class fti {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @zy.lvui
        public final View itemView;
        AbstractC1060y<? extends fti> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        fti mShadowedHolder = null;
        fti mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        fu4 mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @yz
        int mPendingAccessibilityState = -1;

        public fti(@zy.lvui View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i2) {
            this.mFlags = i2 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C0683f.was(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i2, int i3, boolean z2) {
            addFlags(8);
            offsetPosition(i3, z2);
            this.mPosition = i2;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @zy.dd
        public final AbstractC1060y<? extends fti> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC1060y adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i2 = this.mPreLayoutPosition;
            return i2 == -1 ? this.mPosition : i2;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i2) {
            return (i2 & this.mFlags) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C0683f.was(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i2, boolean z2) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z2) {
                this.mPreLayoutPosition += i2;
            }
            this.mPosition += i2;
            if (this.itemView.getLayoutParams() != null) {
                ((cdj) this.itemView.getLayoutParams()).f52032zy = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i2 = this.mPendingAccessibilityState;
            if (i2 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i2;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C0683f.m3157c(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i2, int i3) {
            this.mFlags = (i2 & i3) | (this.mFlags & (~i3));
        }

        public final void setIsRecyclable(boolean z2) {
            int i2 = this.mIsRecyclableCount;
            int i3 = z2 ? i2 - 1 : i2 + 1;
            this.mIsRecyclableCount = i3;
            if (i3 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && i3 == 1) {
                this.mFlags |= 16;
            } else if (z2 && i3 == 0) {
                this.mFlags &= -17;
            }
        }

        void setScrapContainer(fu4 fu4Var, boolean z2) {
            this.mScrapContainer = fu4Var;
            this.mInChangeScrap = z2;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        void unScrap() {
            this.mScrapContainer.eqxt(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public final class fu4 {

        /* JADX INFO: renamed from: p */
        static final int f5702p = 2;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        ni7 f52033f7l8;

        /* JADX INFO: renamed from: g */
        int f5703g;

        /* JADX INFO: renamed from: k */
        final ArrayList<fti> f5704k;

        /* JADX INFO: renamed from: n */
        private int f5705n;

        /* JADX INFO: renamed from: q */
        private final List<fti> f5706q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        ArrayList<fti> f52034toq;

        /* JADX INFO: renamed from: y */
        private jk f5708y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final ArrayList<fti> f52035zy;

        public fu4() {
            ArrayList<fti> arrayList = new ArrayList<>();
            this.f5704k = arrayList;
            this.f52034toq = null;
            this.f52035zy = new ArrayList<>();
            this.f5706q = Collections.unmodifiableList(arrayList);
            this.f5705n = 2;
            this.f5703g = 2;
        }

        private boolean d3(@zy.lvui fti ftiVar, int i2, int i3, long j2) {
            ftiVar.mBindingAdapter = null;
            ftiVar.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = ftiVar.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j2 != Long.MAX_VALUE && !this.f52033f7l8.n7h(itemViewType, nanoTime, j2)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(ftiVar, i2);
            this.f52033f7l8.m4838q(ftiVar.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            toq(ftiVar);
            if (!RecyclerView.this.mState.m4821p()) {
                return true;
            }
            ftiVar.mPreLayoutPosition = i3;
            return true;
        }

        private void ki(ViewGroup viewGroup, boolean z2) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    ki((ViewGroup) childAt, true);
                }
            }
            if (z2) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void t8r(fti ftiVar) {
            View view = ftiVar.itemView;
            if (view instanceof ViewGroup) {
                ki((ViewGroup) view, false);
            }
        }

        private void toq(fti ftiVar) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = ftiVar.itemView;
                if (C0683f.m3157c(view) == 0) {
                    C0683f.o05(view, 1);
                }
                C1113t c1113t = RecyclerView.this.mAccessibilityDelegate;
                if (c1113t == null) {
                    return;
                }
                C0701k c0701kMo4722k = c1113t.mo4722k();
                if (c0701kMo4722k instanceof C1113t.k) {
                    ((C1113t.k) c0701kMo4722k).toq(view);
                }
                C0683f.zwy(view, c0701kMo4722k);
            }
        }

        void a9(View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f52034toq == null) {
                    this.f52034toq = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f52034toq.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f5704k.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        View cdj(int i2, boolean z2) {
            return oc(i2, z2, Long.MAX_VALUE).itemView;
        }

        void d2ok() {
            AbstractC1048h abstractC1048h = RecyclerView.this.mLayout;
            this.f5703g = this.f5705n + (abstractC1048h != null ? abstractC1048h.mPrefetchMaxCountObserved : 0);
            for (int size = this.f52035zy.size() - 1; size >= 0 && this.f52035zy.size() > this.f5703g; size--) {
                m4799t(size);
            }
        }

        void eqxt(fti ftiVar) {
            if (ftiVar.mInChangeScrap) {
                this.f52034toq.remove(ftiVar);
            } else {
                this.f5704k.remove(ftiVar);
            }
            ftiVar.mScrapContainer = null;
            ftiVar.mInChangeScrap = false;
            ftiVar.clearReturnedFromScrapFlag();
        }

        public int f7l8(int i2) {
            if (i2 >= 0 && i2 < RecyclerView.this.mState.m4822q()) {
                return !RecyclerView.this.mState.m4821p() ? i2 : RecyclerView.this.mAdapterHelper.n7h(i2);
            }
            throw new IndexOutOfBoundsException("invalid position " + i2 + ". State item count is " + RecyclerView.this.mState.m4822q() + RecyclerView.this.exceptionLabel());
        }

        void fn3e() {
            int size = this.f52035zy.size();
            for (int i2 = 0; i2 < size; i2++) {
                fti ftiVar = this.f52035zy.get(i2);
                if (ftiVar != null) {
                    ftiVar.addFlags(6);
                    ftiVar.addChangePayload(null);
                }
            }
            AbstractC1060y abstractC1060y = RecyclerView.this.mAdapter;
            if (abstractC1060y == null || !abstractC1060y.hasStableIds()) {
                wvg();
            }
        }

        void fti(ni7 ni7Var) {
            ni7 ni7Var2 = this.f52033f7l8;
            if (ni7Var2 != null) {
                ni7Var2.zy();
            }
            this.f52033f7l8 = ni7Var;
            if (ni7Var == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f52033f7l8.m4835k();
        }

        void fu4(int i2, int i3, boolean z2) {
            int i4 = i2 + i3;
            for (int size = this.f52035zy.size() - 1; size >= 0; size--) {
                fti ftiVar = this.f52035zy.get(size);
                if (ftiVar != null) {
                    int i5 = ftiVar.mPosition;
                    if (i5 >= i4) {
                        ftiVar.offsetPosition(-i3, z2);
                    } else if (i5 >= i2) {
                        ftiVar.addFlags(8);
                        m4799t(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: g */
        void m4790g() {
            this.f5704k.clear();
            ArrayList<fti> arrayList = this.f52034toq;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public void gvn7(int i2) {
            this.f5705n = i2;
            d2ok();
        }

        @zy.lvui
        /* JADX INFO: renamed from: h */
        public View m4791h(int i2) {
            return cdj(i2, false);
        }

        /* JADX INFO: renamed from: i */
        void m4792i() {
            int size = this.f52035zy.size();
            for (int i2 = 0; i2 < size; i2++) {
                cdj cdjVar = (cdj) this.f52035zy.get(i2).itemView.getLayoutParams();
                if (cdjVar != null) {
                    cdjVar.f52032zy = true;
                }
            }
        }

        void jk(fti ftiVar) {
            boolean z2;
            boolean z3 = true;
            if (ftiVar.isScrap() || ftiVar.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(ftiVar.isScrap());
                sb.append(" isAttached:");
                sb.append(ftiVar.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (ftiVar.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + ftiVar + RecyclerView.this.exceptionLabel());
            }
            if (ftiVar.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean zDoesTransientStatePreventRecycling = ftiVar.doesTransientStatePreventRecycling();
            AbstractC1060y abstractC1060y = RecyclerView.this.mAdapter;
            if ((abstractC1060y != null && zDoesTransientStatePreventRecycling && abstractC1060y.onFailedToRecycleView(ftiVar)) || ftiVar.isRecyclable()) {
                if (this.f5703g <= 0 || ftiVar.hasAnyOfTheFlags(526)) {
                    z2 = false;
                } else {
                    int size = this.f52035zy.size();
                    if (size >= this.f5703g && size > 0) {
                        m4799t(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m5071q(ftiVar.mPosition)) {
                        int i2 = size - 1;
                        while (i2 >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.m5071q(this.f52035zy.get(i2).mPosition)) {
                                break;
                            } else {
                                i2--;
                            }
                        }
                        size = i2 + 1;
                    }
                    this.f52035zy.add(size, ftiVar);
                    z2 = true;
                }
                if (z2) {
                    z3 = false;
                } else {
                    m4793k(ftiVar, true);
                }
                z = z2;
            } else {
                z3 = false;
            }
            RecyclerView.this.mViewInfoStore.cdj(ftiVar);
            if (z || z3 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            ftiVar.mBindingAdapter = null;
            ftiVar.mOwnerRecyclerView = null;
        }

        void jp0y(jk jkVar) {
            this.f5708y = jkVar;
        }

        /* JADX INFO: renamed from: k */
        void m4793k(@zy.lvui fti ftiVar, boolean z2) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(ftiVar);
            View view = ftiVar.itemView;
            C1113t c1113t = RecyclerView.this.mAccessibilityDelegate;
            if (c1113t != null) {
                C0701k c0701kMo4722k = c1113t.mo4722k();
                C0683f.zwy(view, c0701kMo4722k instanceof C1113t.k ? ((C1113t.k) c0701kMo4722k).m5119k(view) : null);
            }
            if (z2) {
                m4800y(ftiVar);
            }
            ftiVar.mBindingAdapter = null;
            ftiVar.mOwnerRecyclerView = null;
            m4795p().m4837p(ftiVar);
        }

        View kja0(int i2) {
            return this.f5704k.get(i2).itemView;
        }

        int ld6() {
            return this.f5704k.size();
        }

        boolean lvui(fti ftiVar) {
            if (ftiVar.isRemoved()) {
                return RecyclerView.this.mState.m4821p();
            }
            int i2 = ftiVar.mPosition;
            if (i2 >= 0 && i2 < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.m4821p() || RecyclerView.this.mAdapter.getItemViewType(ftiVar.mPosition) == ftiVar.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || ftiVar.getItemId() == RecyclerView.this.mAdapter.getItemId(ftiVar.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + ftiVar + RecyclerView.this.exceptionLabel());
        }

        public void mcp(@zy.lvui View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            jk(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.ld6(childViewHolderInt);
        }

        /* JADX INFO: renamed from: n */
        void m4794n() {
            int size = this.f52035zy.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f52035zy.get(i2).clearOldPosition();
            }
            int size2 = this.f5704k.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f5704k.get(i3).clearOldPosition();
            }
            ArrayList<fti> arrayList = this.f52034toq;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    this.f52034toq.get(i4).clearOldPosition();
                }
            }
        }

        fti n7h(int i2, boolean z2) {
            View viewM4967n;
            int size = this.f5704k.size();
            for (int i3 = 0; i3 < size; i3++) {
                fti ftiVar = this.f5704k.get(i3);
                if (!ftiVar.wasReturnedFromScrap() && ftiVar.getLayoutPosition() == i2 && !ftiVar.isInvalid() && (RecyclerView.this.mState.f5723y || !ftiVar.isRemoved())) {
                    ftiVar.addFlags(32);
                    return ftiVar;
                }
            }
            if (z2 || (viewM4967n = RecyclerView.this.mChildHelper.m4967n(i2)) == null) {
                int size2 = this.f52035zy.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    fti ftiVar2 = this.f52035zy.get(i4);
                    if (!ftiVar2.isInvalid() && ftiVar2.getLayoutPosition() == i2 && !ftiVar2.isAttachedToTransitionOverlay()) {
                        if (!z2) {
                            this.f52035zy.remove(i4);
                        }
                        return ftiVar2;
                    }
                }
                return null;
            }
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM4967n);
            RecyclerView.this.mChildHelper.t8r(viewM4967n);
            int iQrj = RecyclerView.this.mChildHelper.qrj(viewM4967n);
            if (iQrj != -1) {
                RecyclerView.this.mChildHelper.m4969q(iQrj);
                a9(viewM4967n);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        void ni7(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            int i7;
            if (i2 < i3) {
                i4 = -1;
                i6 = i2;
                i5 = i3;
            } else {
                i4 = 1;
                i5 = i2;
                i6 = i3;
            }
            int size = this.f52035zy.size();
            for (int i8 = 0; i8 < size; i8++) {
                fti ftiVar = this.f52035zy.get(i8);
                if (ftiVar != null && (i7 = ftiVar.mPosition) >= i6 && i7 <= i5) {
                    if (i7 == i2) {
                        ftiVar.offsetPosition(i3 - i2, false);
                    } else {
                        ftiVar.offsetPosition(i4, false);
                    }
                }
            }
        }

        void o1t(View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            jk(childViewHolderInt);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0228 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0181 A[PHI: r1 r4
          0x0181: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$fti) = (r1v11 androidx.recyclerview.widget.RecyclerView$fti), (r1v31 androidx.recyclerview.widget.RecyclerView$fti) binds: [B:28:0x005d, B:59:0x0102] A[DONT_GENERATE, DONT_INLINE]
          0x0181: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:59:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01fe  */
        @zy.dd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        androidx.recyclerview.widget.RecyclerView.fti oc(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instruction units count: 615
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fu4.oc(int, boolean, long):androidx.recyclerview.widget.RecyclerView$fti");
        }

        /* JADX INFO: renamed from: p */
        ni7 m4795p() {
            if (this.f52033f7l8 == null) {
                this.f52033f7l8 = new ni7();
            }
            return this.f52033f7l8;
        }

        /* JADX INFO: renamed from: q */
        public void m4796q() {
            this.f5704k.clear();
            wvg();
        }

        fti qrj(long j2, int i2, boolean z2) {
            for (int size = this.f5704k.size() - 1; size >= 0; size--) {
                fti ftiVar = this.f5704k.get(size);
                if (ftiVar.getItemId() == j2 && !ftiVar.wasReturnedFromScrap()) {
                    if (i2 == ftiVar.getItemViewType()) {
                        ftiVar.addFlags(32);
                        if (ftiVar.isRemoved() && !RecyclerView.this.mState.m4821p()) {
                            ftiVar.setFlags(2, 14);
                        }
                        return ftiVar;
                    }
                    if (!z2) {
                        this.f5704k.remove(size);
                        RecyclerView.this.removeDetachedView(ftiVar.itemView, false);
                        o1t(ftiVar.itemView);
                    }
                }
            }
            int size2 = this.f52035zy.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                fti ftiVar2 = this.f52035zy.get(size2);
                if (ftiVar2.getItemId() == j2 && !ftiVar2.isAttachedToTransitionOverlay()) {
                    if (i2 == ftiVar2.getItemViewType()) {
                        if (!z2) {
                            this.f52035zy.remove(size2);
                        }
                        return ftiVar2;
                    }
                    if (!z2) {
                        m4799t(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: r */
        void m4797r(int i2, int i3) {
            int i4;
            int i5 = i3 + i2;
            for (int size = this.f52035zy.size() - 1; size >= 0; size--) {
                fti ftiVar = this.f52035zy.get(size);
                if (ftiVar != null && (i4 = ftiVar.mPosition) >= i2 && i4 < i5) {
                    ftiVar.addFlags(2);
                    m4799t(size);
                }
            }
        }

        /* JADX INFO: renamed from: s */
        fti m4798s(int i2) {
            int size;
            int iN7h;
            ArrayList<fti> arrayList = this.f52034toq;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    fti ftiVar = this.f52034toq.get(i3);
                    if (!ftiVar.wasReturnedFromScrap() && ftiVar.getLayoutPosition() == i2) {
                        ftiVar.addFlags(32);
                        return ftiVar;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iN7h = RecyclerView.this.mAdapterHelper.n7h(i2)) > 0 && iN7h < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iN7h);
                    for (int i4 = 0; i4 < size; i4++) {
                        fti ftiVar2 = this.f52034toq.get(i4);
                        if (!ftiVar2.wasReturnedFromScrap() && ftiVar2.getItemId() == itemId) {
                            ftiVar2.addFlags(32);
                            return ftiVar2;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: t */
        void m4799t(int i2) {
            m4793k(this.f52035zy.get(i2), true);
            this.f52035zy.remove(i2);
        }

        void wvg() {
            for (int size = this.f52035zy.size() - 1; size >= 0; size--) {
                m4799t(size);
            }
            this.f52035zy.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.toq();
            }
        }

        @zy.lvui
        public List<fti> x2() {
            return this.f5706q;
        }

        /* JADX INFO: renamed from: y */
        void m4800y(@zy.lvui fti ftiVar) {
            InterfaceC1061z interfaceC1061z = RecyclerView.this.mRecyclerListener;
            if (interfaceC1061z != null) {
                interfaceC1061z.m4877k(ftiVar);
            }
            int size = RecyclerView.this.mRecyclerListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView.this.mRecyclerListeners.get(i2).m4877k(ftiVar);
            }
            AbstractC1060y abstractC1060y = RecyclerView.this.mAdapter;
            if (abstractC1060y != null) {
                abstractC1060y.onViewRecycled(ftiVar);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.cdj(ftiVar);
            }
        }

        /* JADX INFO: renamed from: z */
        void m4801z(AbstractC1060y abstractC1060y, AbstractC1060y abstractC1060y2, boolean z2) {
            m4796q();
            m4795p().m4839s(abstractC1060y, abstractC1060y2, z2);
        }

        void zurt(int i2, int i3) {
            int size = this.f52035zy.size();
            for (int i4 = 0; i4 < size; i4++) {
                fti ftiVar = this.f52035zy.get(i4);
                if (ftiVar != null && ftiVar.mPosition >= i2) {
                    ftiVar.offsetPosition(i3, false);
                }
            }
        }

        public void zy(@zy.lvui View view, int i2) {
            cdj cdjVar;
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
            }
            int iN7h = RecyclerView.this.mAdapterHelper.n7h(i2);
            if (iN7h < 0 || iN7h >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + iN7h + ").state:" + RecyclerView.this.mState.m4822q() + RecyclerView.this.exceptionLabel());
            }
            d3(childViewHolderInt, iN7h, i2, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                cdjVar = (cdj) RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(cdjVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                cdjVar = (cdj) layoutParams;
            } else {
                cdjVar = (cdj) RecyclerView.this.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(cdjVar);
            }
            cdjVar.f52032zy = true;
            cdjVar.f5699k = childViewHolderInt;
            cdjVar.f5700q = childViewHolderInt.itemView.getParent() == null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$g */
    class C1047g implements C1084k.k {
        C1047g() {
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        public void f7l8(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForInsert(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        /* JADX INFO: renamed from: g */
        public fti mo4802g(int i2) {
            fti ftiVarFindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i2, true);
            if (ftiVarFindViewHolderForPosition == null || RecyclerView.this.mChildHelper.n7h(ftiVarFindViewHolderForPosition.itemView)) {
                return null;
            }
            return ftiVarFindViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        /* JADX INFO: renamed from: k */
        public void mo4803k(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForMove(i2, i3);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        /* JADX INFO: renamed from: n */
        public void mo4804n(int i2, int i3, Object obj) {
            RecyclerView.this.viewRangeUpdate(i2, i3, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        /* JADX INFO: renamed from: q */
        public void mo4805q(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* JADX INFO: renamed from: s */
        void m4806s(C1084k.toq toqVar) {
            int i2 = toqVar.f5890k;
            if (i2 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, toqVar.f52145toq, toqVar.f5891q);
                return;
            }
            if (i2 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, toqVar.f52145toq, toqVar.f5891q);
            } else if (i2 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, toqVar.f52145toq, toqVar.f5891q, toqVar.f52146zy);
            } else {
                if (i2 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, toqVar.f52145toq, toqVar.f5891q, 1);
            }
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        public void toq(C1084k.toq toqVar) {
            m4806s(toqVar);
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        /* JADX INFO: renamed from: y */
        public void mo4807y(int i2, int i3) {
            RecyclerView.this.offsetPositionRecordsForRemove(i2, i3, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f5721q += i3;
        }

        @Override // androidx.recyclerview.widget.C1084k.k
        public void zy(C1084k.toq toqVar) {
            m4806s(toqVar);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class AbstractC1048h {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.f7l8 mChildHelper;
        private int mHeight;
        private int mHeightMode;
        dd mHorizontalBoundCheck;
        private final dd.toq mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @zy.dd
        AbstractC1058t mSmoothScroller;
        dd mVerticalBoundCheck;
        private final dd.toq mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$k */
        class k implements dd.toq {
            k() {
            }

            @Override // androidx.recyclerview.widget.dd.toq
            /* JADX INFO: renamed from: k */
            public View mo4808k(int i2) {
                return AbstractC1048h.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.dd.toq
            /* JADX INFO: renamed from: n */
            public int mo4809n(View view) {
                return AbstractC1048h.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((cdj) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.dd.toq
            /* JADX INFO: renamed from: q */
            public int mo4810q() {
                return AbstractC1048h.this.getWidth() - AbstractC1048h.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.dd.toq
            public int toq(View view) {
                return AbstractC1048h.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((cdj) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.dd.toq
            public int zy() {
                return AbstractC1048h.this.getPaddingLeft();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$q */
        public static class q {

            /* JADX INFO: renamed from: k */
            public int f5711k;

            /* JADX INFO: renamed from: q */
            public boolean f5712q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public int f52036toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            public boolean f52037zy;
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$toq */
        class toq implements dd.toq {
            toq() {
            }

            @Override // androidx.recyclerview.widget.dd.toq
            /* JADX INFO: renamed from: k */
            public View mo4808k(int i2) {
                return AbstractC1048h.this.getChildAt(i2);
            }

            @Override // androidx.recyclerview.widget.dd.toq
            /* JADX INFO: renamed from: n */
            public int mo4809n(View view) {
                return AbstractC1048h.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((cdj) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.dd.toq
            /* JADX INFO: renamed from: q */
            public int mo4810q() {
                return AbstractC1048h.this.getHeight() - AbstractC1048h.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.dd.toq
            public int toq(View view) {
                return AbstractC1048h.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((cdj) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.dd.toq
            public int zy() {
                return AbstractC1048h.this.getPaddingTop();
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$h$zy */
        public interface zy {
            /* JADX INFO: renamed from: k */
            void mo4811k(int i2, int i3);
        }

        public AbstractC1048h() {
            k kVar = new k();
            this.mHorizontalBoundCheckCallback = kVar;
            toq toqVar = new toq();
            this.mVerticalBoundCheckCallback = toqVar;
            this.mHorizontalBoundCheck = new dd(kVar);
            this.mVerticalBoundCheck = new dd(toqVar);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        private void addViewInt(View view, int i2, boolean z2) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z2 || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.toq(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m5125h(childViewHolderInt);
            }
            cdj cdjVar = (cdj) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.zy(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iQrj = this.mChildHelper.qrj(view);
                if (i2 == -1) {
                    i2 = this.mChildHelper.f7l8();
                }
                if (iQrj == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (iQrj != i2) {
                    this.mRecyclerView.mLayout.moveView(iQrj, i2);
                }
            } else {
                this.mChildHelper.m4966k(view, i2, false);
                cdjVar.f52032zy = true;
                AbstractC1058t abstractC1058t = this.mSmoothScroller;
                if (abstractC1058t != null && abstractC1058t.m4867s()) {
                    this.mSmoothScroller.x2(view);
                }
            }
            if (cdjVar.f5700q) {
                childViewHolderInt.itemView.invalidate();
                cdjVar.f5700q = false;
            }
        }

        public static int chooseSize(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        private void detachViewInternal(int i2, @zy.lvui View view) {
            this.mChildHelper.m4969q(i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0011 A[PHI: r3
          0x0011: PHI (r3v3 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x000f, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        @java.lang.Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto Lf
                if (r3 < 0) goto Ld
                goto L11
            Ld:
                r3 = r2
                goto L1e
            Lf:
                if (r3 < 0) goto L13
            L11:
                r2 = r0
                goto L1e
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto L11
            L18:
                r4 = -2
                if (r3 != r4) goto Ld
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC1048h.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i2 = left - paddingLeft;
            int iMin = Math.min(0, i2);
            int i3 = top - paddingTop;
            int iMin2 = Math.min(0, i3);
            int i4 = iWidth - width;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i2, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i4);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i3, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public static q getProperties(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2, int i3) {
            q qVar = new q();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7401k.p.f93433x9kr, i2, i3);
            qVar.f5711k = typedArrayObtainStyledAttributes.getInt(C7401k.p.f93421ncyb, 1);
            qVar.f52036toq = typedArrayObtainStyledAttributes.getInt(C7401k.p.f93423nn86, 1);
            qVar.f52037zy = typedArrayObtainStyledAttributes.getBoolean(C7401k.p.f42642e, false);
            qVar.f5712q = typedArrayObtainStyledAttributes.getBoolean(C7401k.p.f93409hb, false);
            typedArrayObtainStyledAttributes.recycle();
            return qVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i2 < width && rect.right - i2 > paddingLeft && rect.top - i3 < height && rect.bottom - i3 > paddingTop;
        }

        private static boolean isMeasurementUpToDate(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        private void scrapOrRecycleView(fu4 fu4Var, int i2, View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i2);
                fu4Var.jk(childViewHolderInt);
            } else {
                detachViewAt(i2);
                fu4Var.a9(view);
                this.mRecyclerView.mViewInfoStore.ld6(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(@zy.lvui View view, int i2, cdj cdjVar) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.toq(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m5125h(childViewHolderInt);
            }
            this.mChildHelper.zy(view, i2, cdjVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@zy.lvui View view, @zy.lvui Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(cdj cdjVar) {
            return cdjVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i2, int i3, mcp mcpVar, zy zyVar) {
        }

        public void collectInitialPrefetchPositions(int i2, zy zyVar) {
        }

        public int computeHorizontalScrollExtent(@zy.lvui mcp mcpVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@zy.lvui mcp mcpVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(@zy.lvui mcp mcpVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(@zy.lvui mcp mcpVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(@zy.lvui mcp mcpVar) {
            return 0;
        }

        public int computeVerticalScrollRange(@zy.lvui mcp mcpVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@zy.lvui fu4 fu4Var) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(fu4Var, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@zy.lvui View view, @zy.lvui fu4 fu4Var) {
            scrapOrRecycleView(fu4Var, this.mChildHelper.qrj(view), view);
        }

        public void detachAndScrapViewAt(int i2, @zy.lvui fu4 fu4Var) {
            scrapOrRecycleView(fu4Var, i2, getChildAt(i2));
        }

        public void detachView(@zy.lvui View view) {
            int iQrj = this.mChildHelper.qrj(view);
            if (iQrj >= 0) {
                detachViewInternal(iQrj, view);
            }
        }

        public void detachViewAt(int i2) {
            detachViewInternal(i2, getChildAt(i2));
        }

        void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        void dispatchDetachedFromWindow(RecyclerView recyclerView, fu4 fu4Var) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, fu4Var);
        }

        public void endAnimation(View view) {
            qrj qrjVar = this.mRecyclerView.mItemAnimator;
            if (qrjVar != null) {
                qrjVar.ld6(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @zy.dd
        public View findContainingItemView(@zy.lvui View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.n7h(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @zy.dd
        public View findViewByPosition(int i2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                fti childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i2 && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m4821p() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract cdj generateDefaultLayoutParams();

        public cdj generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof cdj ? new cdj((cdj) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new cdj((ViewGroup.MarginLayoutParams) layoutParams) : new cdj(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@zy.lvui View view) {
            return ((cdj) view.getLayoutParams()).f52031toq.bottom;
        }

        @zy.dd
        public View getChildAt(int i2) {
            androidx.recyclerview.widget.f7l8 f7l8Var = this.mChildHelper;
            if (f7l8Var != null) {
                return f7l8Var.m4964g(i2);
            }
            return null;
        }

        public int getChildCount() {
            androidx.recyclerview.widget.f7l8 f7l8Var = this.mChildHelper;
            if (f7l8Var != null) {
                return f7l8Var.f7l8();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar) {
            return -1;
        }

        public int getDecoratedBottom(@zy.lvui View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@zy.lvui View view, @zy.lvui Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@zy.lvui View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@zy.lvui View view) {
            Rect rect = ((cdj) view.getLayoutParams()).f52031toq;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@zy.lvui View view) {
            Rect rect = ((cdj) view.getLayoutParams()).f52031toq;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@zy.lvui View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@zy.lvui View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @zy.dd
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.n7h(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @InterfaceC7833l
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            AbstractC1060y adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@zy.lvui View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return C0683f.m3159e(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@zy.lvui View view) {
            return ((cdj) view.getLayoutParams()).f52031toq.left;
        }

        @InterfaceC7833l
        public int getMinimumHeight() {
            return C0683f.m3167m(this.mRecyclerView);
        }

        @InterfaceC7833l
        public int getMinimumWidth() {
            return C0683f.ek5k(this.mRecyclerView);
        }

        @InterfaceC7833l
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @InterfaceC7833l
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C0683f.bf2(recyclerView);
            }
            return 0;
        }

        @InterfaceC7833l
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @InterfaceC7833l
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @InterfaceC7833l
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C0683f.i1(recyclerView);
            }
            return 0;
        }

        @InterfaceC7833l
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@zy.lvui View view) {
            return ((cdj) view.getLayoutParams()).m4787q();
        }

        public int getRightDecorationWidth(@zy.lvui View view) {
            return ((cdj) view.getLayoutParams()).f52031toq.right;
        }

        public int getRowCountForAccessibility(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar) {
            return -1;
        }

        public int getSelectionModeForAccessibility(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar) {
            return 0;
        }

        public int getTopDecorationHeight(@zy.lvui View view) {
            return ((cdj) view.getLayoutParams()).f52031toq.top;
        }

        public void getTransformedBoundingBox(@zy.lvui View view, boolean z2, @zy.lvui Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((cdj) view.getLayoutParams()).f52031toq;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @InterfaceC7833l
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@zy.lvui View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.cdj(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC1058t abstractC1058t = this.mSmoothScroller;
            return abstractC1058t != null && abstractC1058t.m4867s();
        }

        public boolean isViewPartiallyVisible(@zy.lvui View view, boolean z2, boolean z3) {
            boolean z5 = this.mHorizontalBoundCheck.toq(view, 24579) && this.mVerticalBoundCheck.toq(view, 24579);
            return z2 ? z5 : !z5;
        }

        public void layoutDecorated(@zy.lvui View view, int i2, int i3, int i4, int i5) {
            Rect rect = ((cdj) view.getLayoutParams()).f52031toq;
            view.layout(i2 + rect.left, i3 + rect.top, i4 - rect.right, i5 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@zy.lvui View view, int i2, int i3, int i4, int i5) {
            cdj cdjVar = (cdj) view.getLayoutParams();
            Rect rect = cdjVar.f52031toq;
            view.layout(i2 + rect.left + ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin, i3 + rect.top + ((ViewGroup.MarginLayoutParams) cdjVar).topMargin, (i4 - rect.right) - ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin, (i5 - rect.bottom) - ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin);
        }

        public void measureChild(@zy.lvui View view, int i2, int i3) {
            cdj cdjVar = (cdj) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i4, ((ViewGroup.MarginLayoutParams) cdjVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i5, ((ViewGroup.MarginLayoutParams) cdjVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, cdjVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@zy.lvui View view, int i2, int i3) {
            cdj cdjVar = (cdj) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i4 = i2 + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i5 = i3 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin + ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin + i4, ((ViewGroup.MarginLayoutParams) cdjVar).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) cdjVar).topMargin + ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) cdjVar).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, cdjVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i2, int i3) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                detachViewAt(i2);
                attachView(childAt, i3);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@InterfaceC7833l int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i2);
            }
        }

        public void offsetChildrenVertical(@InterfaceC7833l int i2) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i2);
            }
        }

        public void onAdapterChanged(@zy.dd AbstractC1060y abstractC1060y, @zy.dd AbstractC1060y abstractC1060y2) {
        }

        public boolean onAddFocusables(@zy.lvui RecyclerView recyclerView, @zy.lvui ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        @InterfaceC7842s
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @InterfaceC7842s
        public void onDetachedFromWindow(RecyclerView recyclerView, fu4 fu4Var) {
            onDetachedFromWindow(recyclerView);
        }

        @zy.dd
        public View onFocusSearchFailed(@zy.lvui View view, int i2, @zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(@zy.lvui AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        void onInitializeAccessibilityNodeInfo(androidx.core.view.accessibility.ki kiVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, kiVar);
        }

        void onInitializeAccessibilityNodeInfoForItem(View view, androidx.core.view.accessibility.ki kiVar) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.n7h(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, kiVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar, @zy.lvui View view, @zy.lvui androidx.core.view.accessibility.ki kiVar) {
        }

        @zy.dd
        public View onInterceptFocusSearch(@zy.lvui View view, int i2) {
            return null;
        }

        public void onItemsAdded(@zy.lvui RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsChanged(@zy.lvui RecyclerView recyclerView) {
        }

        public void onItemsMoved(@zy.lvui RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void onItemsRemoved(@zy.lvui RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(@zy.lvui RecyclerView recyclerView, int i2, int i3) {
        }

        public void onItemsUpdated(@zy.lvui RecyclerView recyclerView, int i2, int i3, @zy.dd Object obj) {
            onItemsUpdated(recyclerView, i2, i3);
        }

        public void onLayoutChildren(fu4 fu4Var, mcp mcpVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(mcp mcpVar) {
        }

        public void onMeasure(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar, int i2, int i3) {
            this.mRecyclerView.defaultOnMeasure(i2, i3);
        }

        @Deprecated
        public boolean onRequestChildFocus(@zy.lvui RecyclerView recyclerView, @zy.lvui View view, @zy.dd View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @zy.dd
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i2) {
        }

        void onSmoothScrollerStopped(AbstractC1058t abstractC1058t) {
            if (this.mSmoothScroller == abstractC1058t) {
                this.mSmoothScroller = null;
            }
        }

        boolean performAccessibilityAction(int i2, @zy.dd Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i2, bundle);
        }

        boolean performAccessibilityActionForItem(@zy.lvui View view, int i2, @zy.dd Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i2, bundle);
        }

        public boolean performAccessibilityActionForItem(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar, @zy.lvui View view, int i2, @zy.dd Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                C0683f.mbx(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.cdj(childCount);
            }
        }

        public void removeAndRecycleAllViews(@zy.lvui fu4 fu4Var) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, fu4Var);
                }
            }
        }

        void removeAndRecycleScrapInt(fu4 fu4Var) {
            int iLd6 = fu4Var.ld6();
            for (int i2 = iLd6 - 1; i2 >= 0; i2--) {
                View viewKja0 = fu4Var.kja0(i2);
                fti childViewHolderInt = RecyclerView.getChildViewHolderInt(viewKja0);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewKja0, false);
                    }
                    qrj qrjVar = this.mRecyclerView.mItemAnimator;
                    if (qrjVar != null) {
                        qrjVar.ld6(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    fu4Var.o1t(viewKja0);
                }
            }
            fu4Var.m4790g();
            if (iLd6 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@zy.lvui View view, @zy.lvui fu4 fu4Var) {
            removeView(view);
            fu4Var.mcp(view);
        }

        public void removeAndRecycleViewAt(int i2, @zy.lvui fu4 fu4Var) {
            View childAt = getChildAt(i2);
            removeViewAt(i2);
            fu4Var.mcp(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@zy.lvui View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.m4965h(view);
        }

        public void removeViewAt(int i2) {
            if (getChildAt(i2) != null) {
                this.mChildHelper.cdj(i2);
            }
        }

        public boolean requestChildRectangleOnScreen(@zy.lvui RecyclerView recyclerView, @zy.lvui View view, @zy.lvui Rect rect, boolean z2) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z2, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i2, fu4 fu4Var, mcp mcpVar) {
            return 0;
        }

        public void scrollToPosition(int i2) {
        }

        public int scrollVerticallyBy(int i2, fu4 fu4Var, mcp mcpVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z2) {
            this.mAutoMeasure = z2;
        }

        void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z2) {
            if (z2 != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z2;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.d2ok();
                }
            }
        }

        void setMeasureSpecs(int i2, int i3) {
            this.mWidth = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        public void setMeasuredDimension(Rect rect, int i2, int i3) {
            setMeasuredDimension(chooseSize(i2, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i3, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        void setMeasuredDimensionFromChildren(int i2, int i3) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i9 = rect.left;
                if (i9 < i5) {
                    i5 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i6) {
                    i6 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.mRecyclerView.mTempRect.set(i5, i6, i4, i7);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i2, i3);
        }

        public void setMeasurementCacheEnabled(boolean z2) {
            this.mMeasurementCacheEnabled = z2;
        }

        void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        boolean shouldMeasureChild(View view, int i2, int i3, cdj cdjVar) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i2, ((ViewGroup.MarginLayoutParams) cdjVar).width) && isMeasurementUpToDate(view.getHeight(), i3, ((ViewGroup.MarginLayoutParams) cdjVar).height)) ? false : true;
        }

        boolean shouldMeasureTwice() {
            return false;
        }

        boolean shouldReMeasureChild(View view, int i2, int i3, cdj cdjVar) {
            return (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i2, ((ViewGroup.MarginLayoutParams) cdjVar).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i3, ((ViewGroup.MarginLayoutParams) cdjVar).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, mcp mcpVar, int i2) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(AbstractC1058t abstractC1058t) {
            AbstractC1058t abstractC1058t2 = this.mSmoothScroller;
            if (abstractC1058t2 != null && abstractC1058t != abstractC1058t2 && abstractC1058t2.m4867s()) {
                this.mSmoothScroller.t8r();
            }
            this.mSmoothScroller = abstractC1058t;
            abstractC1058t.ki(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@zy.lvui View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        void stopSmoothScroller() {
            AbstractC1058t abstractC1058t = this.mSmoothScroller;
            if (abstractC1058t != null) {
                abstractC1058t.t8r();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i2) {
            addViewInt(view, i2, true);
        }

        public void addView(View view, int i2) {
            addViewInt(view, i2, false);
        }

        public void onInitializeAccessibilityEvent(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar, @zy.lvui AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z2 = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            AbstractC1060y abstractC1060y = this.mRecyclerView.mAdapter;
            if (abstractC1060y != null) {
                accessibilityEvent.setItemCount(abstractC1060y.getItemCount());
            }
        }

        public void onInitializeAccessibilityNodeInfo(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar, @zy.lvui androidx.core.view.accessibility.ki kiVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                kiVar.m3052k(8192);
                kiVar.lh(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                kiVar.m3052k(4096);
                kiVar.lh(true);
            }
            kiVar.w831(ki.toq.m3069g(getRowCountForAccessibility(fu4Var, mcpVar), getColumnCountForAccessibility(fu4Var, mcpVar), isLayoutHierarchical(fu4Var, mcpVar), getSelectionModeForAccessibility(fu4Var, mcpVar)));
        }

        public boolean onRequestChildFocus(@zy.lvui RecyclerView recyclerView, @zy.lvui mcp mcpVar, @zy.lvui View view, @zy.dd View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        public boolean performAccessibilityAction(@zy.lvui fu4 fu4Var, @zy.lvui mcp mcpVar, int i2, @zy.dd Bundle bundle) {
            int height;
            int width;
            int i3;
            int i4;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i3 = height;
                    i4 = width;
                }
                i3 = height;
                i4 = 0;
            } else if (i2 != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i3 = height;
                    i4 = width;
                }
                i3 = height;
                i4 = 0;
            }
            if (i3 == 0 && i4 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i4, i3, null, Integer.MIN_VALUE, true);
            return true;
        }

        public boolean requestChildRectangleOnScreen(@zy.lvui RecyclerView recyclerView, @zy.lvui View view, @zy.lvui Rect rect, boolean z2, boolean z3) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i2 = childRectangleOnScreenScrollAmount[0];
            int i3 = childRectangleOnScreenScrollAmount[1];
            if ((z3 && !isFocusedChildVisibleAfterScrolling(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z2) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.smoothScrollBy(i2, i3);
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.AbstractC1048h.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(@zy.lvui View view, int i2) {
            attachView(view, i2, (cdj) view.getLayoutParams());
        }

        public cdj generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new cdj(context, attributeSet);
        }

        public void setMeasuredDimension(int i2, int i3) {
            this.mRecyclerView.setMeasuredDimension(i2, i3);
        }

        public void attachView(@zy.lvui View view) {
            attachView(view, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public interface InterfaceC1049i {
        /* JADX INFO: renamed from: k */
        void mo4812k(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent);

        boolean toq(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent);

        void zy(boolean z2);
    }

    public static abstract class jk {
        @zy.dd
        /* JADX INFO: renamed from: k */
        public abstract View m4813k(@zy.lvui fu4 fu4Var, int i2, int i3);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$k */
    class RunnableC1050k implements Runnable {
        RunnableC1050k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    public interface ki {
        void onChildViewAttachedToWindow(@zy.lvui View view);

        void onChildViewDetachedFromWindow(@zy.lvui View view);
    }

    public static abstract class kja0 {
        public void f7l8(@zy.lvui Canvas canvas, @zy.lvui RecyclerView recyclerView, @zy.lvui mcp mcpVar) {
            mo4814g(canvas, recyclerView);
        }

        @Deprecated
        /* JADX INFO: renamed from: g */
        public void mo4814g(@zy.lvui Canvas canvas, @zy.lvui RecyclerView recyclerView) {
        }

        /* JADX INFO: renamed from: n */
        public void mo4711n(@zy.lvui Rect rect, @zy.lvui View view, @zy.lvui RecyclerView recyclerView, @zy.lvui mcp mcpVar) {
            mo4815q(rect, ((cdj) view.getLayoutParams()).m4787q(), recyclerView);
        }

        @Deprecated
        /* JADX INFO: renamed from: q */
        public void mo4815q(@zy.lvui Rect rect, int i2, @zy.lvui RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* JADX INFO: renamed from: s */
        public void mo4713s(@zy.lvui Canvas canvas, @zy.lvui RecyclerView recyclerView, @zy.lvui mcp mcpVar) {
            m4816y(canvas, recyclerView);
        }

        @Deprecated
        /* JADX INFO: renamed from: y */
        public void m4816y(@zy.lvui Canvas canvas, @zy.lvui RecyclerView recyclerView) {
        }
    }

    public interface ld6 {
        /* JADX INFO: renamed from: k */
        int mo4817k(int i2, int i3);
    }

    public static class mcp {

        /* JADX INFO: renamed from: i */
        static final int f5715i = 4;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        static final int f52038ki = 1;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        static final int f52039t8r = 2;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        int f52040cdj;

        /* JADX INFO: renamed from: h */
        int f5717h;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        int f52042kja0;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        long f52044n7h;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        int f52045qrj;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private SparseArray<Object> f52046toq;

        /* JADX INFO: renamed from: k */
        int f5718k = -1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f52048zy = 0;

        /* JADX INFO: renamed from: q */
        int f5721q = 0;

        /* JADX INFO: renamed from: n */
        int f5719n = 1;

        /* JADX INFO: renamed from: g */
        int f5716g = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f52041f7l8 = false;

        /* JADX INFO: renamed from: y */
        boolean f5723y = false;

        /* JADX INFO: renamed from: s */
        boolean f5722s = false;

        /* JADX INFO: renamed from: p */
        boolean f5720p = false;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        boolean f52043ld6 = false;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        boolean f52047x2 = false;

        public int f7l8() {
            return this.f5718k;
        }

        /* JADX INFO: renamed from: g */
        public int m4818g() {
            return this.f52040cdj;
        }

        /* JADX INFO: renamed from: k */
        void m4819k(int i2) {
            if ((this.f5719n & i2) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.f5719n));
        }

        public boolean kja0() {
            return this.f52043ld6;
        }

        void ld6(AbstractC1060y abstractC1060y) {
            this.f5719n = 1;
            this.f5716g = abstractC1060y.getItemCount();
            this.f5723y = false;
            this.f5722s = false;
            this.f5720p = false;
        }

        /* JADX INFO: renamed from: n */
        public int m4820n() {
            return this.f5717h;
        }

        public boolean n7h() {
            return this.f52047x2;
        }

        /* JADX INFO: renamed from: p */
        public boolean m4821p() {
            return this.f5723y;
        }

        /* JADX INFO: renamed from: q */
        public int m4822q() {
            return this.f5723y ? this.f52048zy - this.f5721q : this.f5716g;
        }

        public void qrj(int i2) {
            SparseArray<Object> sparseArray = this.f52046toq;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i2);
        }

        /* JADX INFO: renamed from: s */
        public boolean m4823s() {
            return this.f5720p;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5718k + ", mData=" + this.f52046toq + ", mItemCount=" + this.f5716g + ", mIsMeasuring=" + this.f5720p + ", mPreviousLayoutItemCount=" + this.f52048zy + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5721q + ", mStructureChanged=" + this.f52041f7l8 + ", mInPreLayout=" + this.f5723y + ", mRunSimpleAnimations=" + this.f52043ld6 + ", mRunPredictiveAnimations=" + this.f52047x2 + '}';
        }

        public boolean toq() {
            return this.f52041f7l8;
        }

        public void x2(int i2, Object obj) {
            if (this.f52046toq == null) {
                this.f52046toq = new SparseArray<>();
            }
            this.f52046toq.put(i2, obj);
        }

        /* JADX INFO: renamed from: y */
        public boolean m4824y() {
            return this.f5718k != -1;
        }

        public <T> T zy(int i2) {
            SparseArray<Object> sparseArray = this.f52046toq;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$n */
    class C1051n implements f7l8.toq {
        C1051n() {
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        public void f7l8() {
            int iZy = zy();
            for (int i2 = 0; i2 < iZy; i2++) {
                View viewMo4826k = mo4826k(i2);
                RecyclerView.this.dispatchChildDetached(viewMo4826k);
                viewMo4826k.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: g */
        public void mo4825g(View view, int i2) {
            RecyclerView.this.addView(view, i2);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: k */
        public View mo4826k(int i2) {
            return RecyclerView.this.getChildAt(i2);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        public void ld6(View view, int i2, ViewGroup.LayoutParams layoutParams) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i2, layoutParams);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: n */
        public void mo4827n(int i2) {
            fti childViewHolderInt;
            View viewMo4826k = mo4826k(i2);
            if (viewMo4826k != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMo4826k)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i2);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: p */
        public void mo4828p(int i2) {
            View childAt = RecyclerView.this.getChildAt(i2);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i2);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: q */
        public fti mo4829q(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: s */
        public void mo4830s(View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        public void toq(View view) {
            fti childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        /* JADX INFO: renamed from: y */
        public int mo4831y(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.f7l8.toq
        public int zy() {
            return RecyclerView.this.getChildCount();
        }
    }

    private class n7h implements qrj.zy {
        n7h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.qrj.zy
        /* JADX INFO: renamed from: k */
        public void mo4832k(fti ftiVar) {
            ftiVar.setIsRecyclable(true);
            if (ftiVar.mShadowedHolder != null && ftiVar.mShadowingHolder == null) {
                ftiVar.mShadowedHolder = null;
            }
            ftiVar.mShadowingHolder = null;
            if (ftiVar.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(ftiVar.itemView) || !ftiVar.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(ftiVar.itemView, false);
        }
    }

    public static class ni7 {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final int f52049zy = 5;

        /* JADX INFO: renamed from: k */
        SparseArray<C1052k> f5726k = new SparseArray<>();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f52050toq = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ni7$k */
        static class C1052k {

            /* JADX INFO: renamed from: k */
            final ArrayList<fti> f5727k = new ArrayList<>();

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            int f52051toq = 5;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            long f52052zy = 0;

            /* JADX INFO: renamed from: q */
            long f5728q = 0;

            C1052k() {
            }
        }

        /* JADX INFO: renamed from: y */
        private C1052k m4833y(int i2) {
            C1052k c1052k = this.f5726k.get(i2);
            if (c1052k != null) {
                return c1052k;
            }
            C1052k c1052k2 = new C1052k();
            this.f5726k.put(i2, c1052k2);
            return c1052k2;
        }

        public int f7l8(int i2) {
            return m4833y(i2).f5727k.size();
        }

        @zy.dd
        /* JADX INFO: renamed from: g */
        public fti m4834g(int i2) {
            C1052k c1052k = this.f5726k.get(i2);
            if (c1052k == null || c1052k.f5727k.isEmpty()) {
                return null;
            }
            ArrayList<fti> arrayList = c1052k.f5727k;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: k */
        void m4835k() {
            this.f52050toq++;
        }

        boolean kja0(int i2, long j2, long j3) {
            long j4 = m4833y(i2).f52052zy;
            return j4 == 0 || j2 + j4 < j3;
        }

        long ld6(long j2, long j3) {
            return j2 == 0 ? j3 : ((j2 / 4) * 3) + (j3 / 4);
        }

        /* JADX INFO: renamed from: n */
        void m4836n(int i2, long j2) {
            C1052k c1052kM4833y = m4833y(i2);
            c1052kM4833y.f52052zy = ld6(c1052kM4833y.f52052zy, j2);
        }

        boolean n7h(int i2, long j2, long j3) {
            long j4 = m4833y(i2).f5728q;
            return j4 == 0 || j2 + j4 < j3;
        }

        /* JADX INFO: renamed from: p */
        public void m4837p(fti ftiVar) {
            int itemViewType = ftiVar.getItemViewType();
            ArrayList<fti> arrayList = m4833y(itemViewType).f5727k;
            if (this.f5726k.get(itemViewType).f52051toq <= arrayList.size()) {
                return;
            }
            ftiVar.resetInternal();
            arrayList.add(ftiVar);
        }

        /* JADX INFO: renamed from: q */
        void m4838q(int i2, long j2) {
            C1052k c1052kM4833y = m4833y(i2);
            c1052kM4833y.f5728q = ld6(c1052kM4833y.f5728q, j2);
        }

        int qrj() {
            int size = 0;
            for (int i2 = 0; i2 < this.f5726k.size(); i2++) {
                ArrayList<fti> arrayList = this.f5726k.valueAt(i2).f5727k;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        /* JADX INFO: renamed from: s */
        void m4839s(AbstractC1060y abstractC1060y, AbstractC1060y abstractC1060y2, boolean z2) {
            if (abstractC1060y != null) {
                zy();
            }
            if (!z2 && this.f52050toq == 0) {
                toq();
            }
            if (abstractC1060y2 != null) {
                m4835k();
            }
        }

        public void toq() {
            for (int i2 = 0; i2 < this.f5726k.size(); i2++) {
                this.f5726k.valueAt(i2).f5727k.clear();
            }
        }

        public void x2(int i2, int i3) {
            C1052k c1052kM4833y = m4833y(i2);
            c1052kM4833y.f52051toq = i3;
            ArrayList<fti> arrayList = c1052kM4833y.f5727k;
            while (arrayList.size() > i3) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        void zy() {
            this.f52050toq--;
        }
    }

    private class o1t extends AbstractC1053p {
        o1t() {
        }

        /* JADX INFO: renamed from: k */
        void m4840k() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C0683f.mbx(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f52041f7l8 = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.cdj()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeChanged(int i2, int i3, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.t8r(i2, i3, obj)) {
                m4840k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeInserted(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m4999i(i2, i3)) {
                m4840k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeMoved(int i2, int i3, int i4) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.fn3e(i2, i3, i4)) {
                m4840k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onItemRangeRemoved(int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.zurt(i2, i3)) {
                m4840k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1053p
        public void onStateRestorationPolicyChanged() {
            AbstractC1060y abstractC1060y;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState == null || (abstractC1060y = recyclerView.mAdapter) == null || !abstractC1060y.canRestoreState()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class AbstractC1053p {
        public void onChanged() {
        }

        public void onItemRangeChanged(int i2, int i3) {
        }

        public void onItemRangeChanged(int i2, int i3, @zy.dd Object obj) {
            onItemRangeChanged(i2, i3);
        }

        public void onItemRangeInserted(int i2, int i3) {
        }

        public void onItemRangeMoved(int i2, int i3, int i4) {
        }

        public void onItemRangeRemoved(int i2, int i3) {
        }

        public void onStateRestorationPolicyChanged() {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$q */
    class C1054q implements x9kr.toq {
        C1054q() {
        }

        @Override // androidx.recyclerview.widget.x9kr.toq
        /* JADX INFO: renamed from: k */
        public void mo4841k(fti ftiVar, qrj.C1056q c1056q, qrj.C1056q c1056q2) {
            RecyclerView.this.animateAppearance(ftiVar, c1056q, c1056q2);
        }

        @Override // androidx.recyclerview.widget.x9kr.toq
        /* JADX INFO: renamed from: q */
        public void mo4842q(fti ftiVar, @zy.lvui qrj.C1056q c1056q, @zy.lvui qrj.C1056q c1056q2) {
            ftiVar.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.toq(ftiVar, ftiVar, c1056q, c1056q2)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo4849q(ftiVar, c1056q, c1056q2)) {
                RecyclerView.this.postAnimationRunner();
            }
        }

        @Override // androidx.recyclerview.widget.x9kr.toq
        public void toq(fti ftiVar) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(ftiVar.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.x9kr.toq
        public void zy(fti ftiVar, @zy.lvui qrj.C1056q c1056q, @zy.dd qrj.C1056q c1056q2) {
            RecyclerView.this.mRecycler.eqxt(ftiVar);
            RecyclerView.this.animateDisappearance(ftiVar, c1056q, c1056q2);
        }
    }

    public static abstract class qrj {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f52053f7l8 = 2;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f52054ld6 = 4096;

        /* JADX INFO: renamed from: p */
        public static final int f5731p = 2048;

        /* JADX INFO: renamed from: s */
        public static final int f5732s = 4;

        /* JADX INFO: renamed from: y */
        public static final int f5733y = 8;

        /* JADX INFO: renamed from: k */
        private zy f5735k = null;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ArrayList<toq> f52055toq = new ArrayList<>();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f52056zy = 120;

        /* JADX INFO: renamed from: q */
        private long f5737q = 120;

        /* JADX INFO: renamed from: n */
        private long f5736n = 250;

        /* JADX INFO: renamed from: g */
        private long f5734g = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$qrj$k */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1055k {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$qrj$q */
        public static class C1056q {

            /* JADX INFO: renamed from: k */
            public int f5738k;

            /* JADX INFO: renamed from: n */
            public int f5739n;

            /* JADX INFO: renamed from: q */
            public int f5740q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public int f52057toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            public int f52058zy;

            @zy.lvui
            /* JADX INFO: renamed from: k */
            public C1056q m4854k(@zy.lvui fti ftiVar) {
                return toq(ftiVar, 0);
            }

            @zy.lvui
            public C1056q toq(@zy.lvui fti ftiVar, int i2) {
                View view = ftiVar.itemView;
                this.f5738k = view.getLeft();
                this.f52057toq = view.getTop();
                this.f52058zy = view.getRight();
                this.f5740q = view.getBottom();
                return this;
            }
        }

        public interface toq {
            /* JADX INFO: renamed from: k */
            void m4855k();
        }

        interface zy {
            /* JADX INFO: renamed from: k */
            void mo4832k(@zy.lvui fti ftiVar);
        }

        /* JADX INFO: renamed from: n */
        static int m4843n(fti ftiVar) {
            int i2 = ftiVar.mFlags & 14;
            if (ftiVar.isInvalid()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int oldPosition = ftiVar.getOldPosition();
            int absoluteAdapterPosition = ftiVar.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i2 : i2 | 2048;
        }

        public abstract boolean cdj();

        public boolean f7l8(@zy.lvui fti ftiVar, @zy.lvui List<Object> list) {
            return mo4844g(ftiVar);
        }

        public void fn3e(@zy.lvui fti ftiVar) {
        }

        public abstract void fu4();

        /* JADX INFO: renamed from: g */
        public boolean mo4844g(@zy.lvui fti ftiVar) {
            return true;
        }

        /* JADX INFO: renamed from: h */
        public long m4845h() {
            return this.f5737q;
        }

        /* JADX INFO: renamed from: i */
        public void m4846i(@zy.lvui fti ftiVar) {
        }

        /* JADX INFO: renamed from: k */
        public abstract boolean mo4847k(@zy.lvui fti ftiVar, @zy.dd C1056q c1056q, @zy.lvui C1056q c1056q2);

        public final boolean ki(@zy.dd toq toqVar) {
            boolean zCdj = cdj();
            if (toqVar != null) {
                if (zCdj) {
                    this.f52055toq.add(toqVar);
                } else {
                    toqVar.m4855k();
                }
            }
            return zCdj;
        }

        public long kja0() {
            return this.f5736n;
        }

        public abstract void ld6(@zy.lvui fti ftiVar);

        public void mcp(long j2) {
            this.f5737q = j2;
        }

        public long n7h() {
            return this.f5734g;
        }

        @zy.lvui
        public C1056q ni7(@zy.lvui mcp mcpVar, @zy.lvui fti ftiVar, int i2, @zy.lvui List<Object> list) {
            return t8r().m4854k(ftiVar);
        }

        public void o1t(long j2) {
            this.f5734g = j2;
        }

        /* JADX INFO: renamed from: p */
        public final void m4848p() {
            int size = this.f52055toq.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f52055toq.get(i2).m4855k();
            }
            this.f52055toq.clear();
        }

        /* JADX INFO: renamed from: q */
        public abstract boolean mo4849q(@zy.lvui fti ftiVar, @zy.lvui C1056q c1056q, @zy.lvui C1056q c1056q2);

        public long qrj() {
            return this.f52056zy;
        }

        /* JADX INFO: renamed from: s */
        public final void m4850s(@zy.lvui fti ftiVar) {
            fn3e(ftiVar);
        }

        /* JADX INFO: renamed from: t */
        public void m4851t(long j2) {
            this.f5736n = j2;
        }

        @zy.lvui
        public C1056q t8r() {
            return new C1056q();
        }

        public abstract boolean toq(@zy.lvui fti ftiVar, @zy.lvui fti ftiVar2, @zy.lvui C1056q c1056q, @zy.lvui C1056q c1056q2);

        void wvg(zy zyVar) {
            this.f5735k = zyVar;
        }

        public abstract void x2();

        /* JADX INFO: renamed from: y */
        public final void m4852y(@zy.lvui fti ftiVar) {
            m4846i(ftiVar);
            zy zyVar = this.f5735k;
            if (zyVar != null) {
                zyVar.mo4832k(ftiVar);
            }
        }

        /* JADX INFO: renamed from: z */
        public void m4853z(long j2) {
            this.f52056zy = j2;
        }

        @zy.lvui
        public C1056q zurt(@zy.lvui mcp mcpVar, @zy.lvui fti ftiVar) {
            return t8r().m4854k(ftiVar);
        }

        public abstract boolean zy(@zy.lvui fti ftiVar, @zy.lvui C1056q c1056q, @zy.dd C1056q c1056q2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$s */
    static class C1057s extends Observable<AbstractC1053p> {
        C1057s() {
        }

        public void f7l8(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1053p) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i2, i3);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m4856g(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1053p) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i2, i3);
            }
        }

        /* JADX INFO: renamed from: k */
        public boolean m4857k() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: n */
        public void m4858n(int i2, int i3, @zy.dd Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1053p) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i2, i3, obj);
            }
        }

        /* JADX INFO: renamed from: q */
        public void m4859q(int i2, int i3) {
            m4858n(i2, i3, null);
        }

        public void toq() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1053p) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* JADX INFO: renamed from: y */
        public void m4860y() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1053p) ((Observable) this).mObservers.get(size)).onStateRestorationPolicyChanged();
            }
        }

        public void zy(int i2, int i3) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC1053p) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i2, i3, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class AbstractC1058t {

        /* JADX INFO: renamed from: g */
        private View f5741g;

        /* JADX INFO: renamed from: n */
        private boolean f5743n;

        /* JADX INFO: renamed from: q */
        private boolean f5744q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private RecyclerView f52060toq;

        /* JADX INFO: renamed from: y */
        private boolean f5745y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private AbstractC1048h f52061zy;

        /* JADX INFO: renamed from: k */
        private int f5742k = -1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final k f52059f7l8 = new k(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t$k */
        public static class k {

            /* JADX INFO: renamed from: y */
            public static final int f5746y = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
            private int f52062f7l8;

            /* JADX INFO: renamed from: g */
            private boolean f5747g;

            /* JADX INFO: renamed from: k */
            private int f5748k;

            /* JADX INFO: renamed from: n */
            private Interpolator f5749n;

            /* JADX INFO: renamed from: q */
            private int f5750q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private int f52063toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private int f52064zy;

            public k(@InterfaceC7833l int i2, @InterfaceC7833l int i3) {
                this(i2, i3, Integer.MIN_VALUE, null);
            }

            private void qrj() {
                if (this.f5749n != null && this.f52064zy < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f52064zy < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            void f7l8(RecyclerView recyclerView) {
                int i2 = this.f5750q;
                if (i2 >= 0) {
                    this.f5750q = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i2);
                    this.f5747g = false;
                } else {
                    if (!this.f5747g) {
                        this.f52062f7l8 = 0;
                        return;
                    }
                    qrj();
                    recyclerView.mViewFlinger.mo4782n(this.f5748k, this.f52063toq, this.f52064zy, this.f5749n);
                    int i3 = this.f52062f7l8 + 1;
                    this.f52062f7l8 = i3;
                    if (i3 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5747g = false;
                }
            }

            /* JADX INFO: renamed from: g */
            public void m4869g(int i2) {
                this.f5750q = i2;
            }

            /* JADX INFO: renamed from: k */
            public int m4870k() {
                return this.f52064zy;
            }

            public void ld6(@zy.dd Interpolator interpolator) {
                this.f5747g = true;
                this.f5749n = interpolator;
            }

            /* JADX INFO: renamed from: n */
            boolean m4871n() {
                return this.f5750q >= 0;
            }

            /* JADX INFO: renamed from: p */
            public void m4872p(@InterfaceC7833l int i2) {
                this.f5747g = true;
                this.f52063toq = i2;
            }

            @zy.dd
            /* JADX INFO: renamed from: q */
            public Interpolator m4873q() {
                return this.f5749n;
            }

            /* JADX INFO: renamed from: s */
            public void m4874s(@InterfaceC7833l int i2) {
                this.f5747g = true;
                this.f5748k = i2;
            }

            @InterfaceC7833l
            public int toq() {
                return this.f5748k;
            }

            public void x2(@InterfaceC7833l int i2, @InterfaceC7833l int i3, int i4, @zy.dd Interpolator interpolator) {
                this.f5748k = i2;
                this.f52063toq = i3;
                this.f52064zy = i4;
                this.f5749n = interpolator;
                this.f5747g = true;
            }

            /* JADX INFO: renamed from: y */
            public void m4875y(int i2) {
                this.f5747g = true;
                this.f52064zy = i2;
            }

            @InterfaceC7833l
            public int zy() {
                return this.f52063toq;
            }

            public k(@InterfaceC7833l int i2, @InterfaceC7833l int i3, int i4) {
                this(i2, i3, i4, null);
            }

            public k(@InterfaceC7833l int i2, @InterfaceC7833l int i3, int i4, @zy.dd Interpolator interpolator) {
                this.f5750q = -1;
                this.f5747g = false;
                this.f52062f7l8 = 0;
                this.f5748k = i2;
                this.f52063toq = i3;
                this.f52064zy = i4;
                this.f5749n = interpolator;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$t$toq */
        public interface toq {
            @zy.dd
            PointF computeScrollVectorForPosition(int i2);
        }

        public void cdj(int i2) {
            this.f5742k = i2;
        }

        @Deprecated
        public void f7l8(int i2) {
            this.f52060toq.scrollToPosition(i2);
        }

        /* JADX INFO: renamed from: g */
        public int m4861g() {
            return this.f5742k;
        }

        /* JADX INFO: renamed from: h */
        protected abstract void mo4862h(@zy.lvui View view, @zy.lvui mcp mcpVar, @zy.lvui k kVar);

        @zy.dd
        /* JADX INFO: renamed from: k */
        public PointF mo4863k(int i2) {
            Object objM4864n = m4864n();
            if (objM4864n instanceof toq) {
                return ((toq) objM4864n).computeScrollVectorForPosition(i2);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + toq.class.getCanonicalName());
            return null;
        }

        void ki(RecyclerView recyclerView, AbstractC1048h abstractC1048h) {
            recyclerView.mViewFlinger.mo4781g();
            if (this.f5745y) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f52060toq = recyclerView;
            this.f52061zy = abstractC1048h;
            int i2 = this.f5742k;
            if (i2 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f5718k = i2;
            this.f5743n = true;
            this.f5744q = true;
            this.f5741g = toq(m4861g());
            n7h();
            this.f52060toq.mViewFlinger.mo4783q();
            this.f5745y = true;
        }

        protected abstract void kja0();

        void ld6(int i2, int i3) {
            PointF pointFMo4863k;
            RecyclerView recyclerView = this.f52060toq;
            if (this.f5742k == -1 || recyclerView == null) {
                t8r();
            }
            if (this.f5744q && this.f5741g == null && this.f52061zy != null && (pointFMo4863k = mo4863k(this.f5742k)) != null) {
                float f2 = pointFMo4863k.x;
                if (f2 != 0.0f || pointFMo4863k.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f2), (int) Math.signum(pointFMo4863k.y), null);
                }
            }
            this.f5744q = false;
            View view = this.f5741g;
            if (view != null) {
                if (m4866q(view) == this.f5742k) {
                    mo4862h(this.f5741g, recyclerView.mState, this.f52059f7l8);
                    this.f52059f7l8.f7l8(recyclerView);
                    t8r();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f5741g = null;
                }
            }
            if (this.f5743n) {
                qrj(i2, i3, recyclerView.mState, this.f52059f7l8);
                boolean zM4871n = this.f52059f7l8.m4871n();
                this.f52059f7l8.f7l8(recyclerView);
                if (zM4871n && this.f5743n) {
                    this.f5744q = true;
                    recyclerView.mViewFlinger.mo4783q();
                }
            }
        }

        @zy.dd
        /* JADX INFO: renamed from: n */
        public AbstractC1048h m4864n() {
            return this.f52061zy;
        }

        protected abstract void n7h();

        /* JADX INFO: renamed from: p */
        protected void m4865p(@zy.lvui PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        /* JADX INFO: renamed from: q */
        public int m4866q(View view) {
            return this.f52060toq.getChildLayoutPosition(view);
        }

        protected abstract void qrj(@InterfaceC7833l int i2, @InterfaceC7833l int i3, @zy.lvui mcp mcpVar, @zy.lvui k kVar);

        /* JADX INFO: renamed from: s */
        public boolean m4867s() {
            return this.f5743n;
        }

        protected final void t8r() {
            if (this.f5743n) {
                this.f5743n = false;
                kja0();
                this.f52060toq.mState.f5718k = -1;
                this.f5741g = null;
                this.f5742k = -1;
                this.f5744q = false;
                this.f52061zy.onSmoothScrollerStopped(this);
                this.f52061zy = null;
                this.f52060toq = null;
            }
        }

        public View toq(int i2) {
            return this.f52060toq.mLayout.findViewByPosition(i2);
        }

        protected void x2(View view) {
            if (m4866q(view) == m4861g()) {
                this.f5741g = view;
            }
        }

        /* JADX INFO: renamed from: y */
        public boolean m4868y() {
            return this.f5744q;
        }

        public int zy() {
            return this.f52060toq.mLayout.getChildCount();
        }
    }

    public static abstract class t8r {
        public abstract boolean onFling(int i2, int i3);
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            qrj qrjVar = RecyclerView.this.mItemAnimator;
            if (qrjVar != null) {
                qrjVar.fu4();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static class wvg implements InterfaceC1049i {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        /* JADX INFO: renamed from: k */
        public void mo4812k(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        public boolean toq(@zy.lvui RecyclerView recyclerView, @zy.lvui MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1049i
        public void zy(boolean z2) {
        }
    }

    public static class x2 {

        /* JADX INFO: renamed from: k */
        public static final int f5752k = 0;

        /* JADX INFO: renamed from: q */
        public static final int f5753q = 3;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f52065toq = 1;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f52066zy = 2;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$x2$k */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1059k {
        }

        @zy.lvui
        /* JADX INFO: renamed from: k */
        protected EdgeEffect mo4876k(@zy.lvui RecyclerView recyclerView, int i2) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class AbstractC1060y<VH extends fti> {
        private final C1057s mObservable = new C1057s();
        private boolean mHasStableIds = false;
        private k mStateRestorationPolicy = k.ALLOW;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$y$k */
        public enum k {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@zy.lvui VH vh, int i2) {
            boolean z2 = vh.mBindingAdapter == null;
            if (z2) {
                vh.mPosition = i2;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i2);
                }
                vh.setFlags(1, 519);
                androidx.core.os.zurt.toq(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i2, vh.getUnmodifiedPayloads());
            if (z2) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof cdj) {
                    ((cdj) layoutParams).f52032zy = true;
                }
                androidx.core.os.zurt.m2775q();
            }
        }

        boolean canRestoreState() {
            int i2 = f7l8.f5701k[this.mStateRestorationPolicy.ordinal()];
            if (i2 != 1) {
                return i2 != 2 || getItemCount() > 0;
            }
            return false;
        }

        @zy.lvui
        public final VH createViewHolder(@zy.lvui ViewGroup viewGroup, int i2) {
            try {
                androidx.core.os.zurt.toq(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i2);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i2;
                return vh;
            } finally {
                androidx.core.os.zurt.m2775q();
            }
        }

        public int findRelativeAdapterPositionIn(@zy.lvui AbstractC1060y<? extends fti> abstractC1060y, @zy.lvui fti ftiVar, int i2) {
            if (abstractC1060y == this) {
                return i2;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i2) {
            return -1L;
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        @zy.lvui
        public final k getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.m4857k();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.toq();
        }

        public final void notifyItemChanged(int i2) {
            this.mObservable.m4859q(i2, 1);
        }

        public final void notifyItemInserted(int i2) {
            this.mObservable.m4856g(i2, 1);
        }

        public final void notifyItemMoved(int i2, int i3) {
            this.mObservable.zy(i2, i3);
        }

        public final void notifyItemRangeChanged(int i2, int i3) {
            this.mObservable.m4859q(i2, i3);
        }

        public final void notifyItemRangeInserted(int i2, int i3) {
            this.mObservable.m4856g(i2, i3);
        }

        public final void notifyItemRangeRemoved(int i2, int i3) {
            this.mObservable.f7l8(i2, i3);
        }

        public final void notifyItemRemoved(int i2) {
            this.mObservable.f7l8(i2, 1);
        }

        public void onAttachedToRecyclerView(@zy.lvui RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@zy.lvui VH vh, int i2);

        public void onBindViewHolder(@zy.lvui VH vh, int i2, @zy.lvui List<Object> list) {
            onBindViewHolder(vh, i2);
        }

        @zy.lvui
        public abstract VH onCreateViewHolder(@zy.lvui ViewGroup viewGroup, int i2);

        public void onDetachedFromRecyclerView(@zy.lvui RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@zy.lvui VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@zy.lvui VH vh) {
        }

        public void onViewDetachedFromWindow(@zy.lvui VH vh) {
        }

        public void onViewRecycled(@zy.lvui VH vh) {
        }

        public void registerAdapterDataObserver(@zy.lvui AbstractC1053p abstractC1053p) {
            this.mObservable.registerObserver(abstractC1053p);
        }

        public void setHasStableIds(boolean z2) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z2;
        }

        public void setStateRestorationPolicy(@zy.lvui k kVar) {
            this.mStateRestorationPolicy = kVar;
            this.mObservable.m4860y();
        }

        public void unregisterAdapterDataObserver(@zy.lvui AbstractC1053p abstractC1053p) {
            this.mObservable.unregisterObserver(abstractC1053p);
        }

        public final void notifyItemChanged(int i2, @zy.dd Object obj) {
            this.mObservable.m4858n(i2, 1, obj);
        }

        public final void notifyItemRangeChanged(int i2, int i3, @zy.dd Object obj) {
            this.mObservable.m4858n(i2, i3, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public interface InterfaceC1061z {
        /* JADX INFO: renamed from: k */
        void m4877k(@zy.lvui fti ftiVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zurt {
    }

    class zy implements Interpolator {
        zy() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new zy();
    }

    public RecyclerView(@zy.lvui Context context) {
        this(context, null);
    }

    private void addAnimatingView(fti ftiVar) {
        View view = ftiVar.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.eqxt(getChildViewHolder(view));
        if (ftiVar.isTmpDetached()) {
            this.mChildHelper.zy(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            this.mChildHelper.ld6(view);
        } else {
            this.mChildHelper.toq(view, true);
        }
    }

    private void animateChange(@zy.lvui fti ftiVar, @zy.lvui fti ftiVar2, @zy.lvui qrj.C1056q c1056q, @zy.lvui qrj.C1056q c1056q2, boolean z2, boolean z3) {
        ftiVar.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(ftiVar);
        }
        if (ftiVar != ftiVar2) {
            if (z3) {
                addAnimatingView(ftiVar2);
            }
            ftiVar.mShadowedHolder = ftiVar2;
            addAnimatingView(ftiVar);
            this.mRecycler.eqxt(ftiVar);
            ftiVar2.setIsRecyclable(false);
            ftiVar2.mShadowingHolder = ftiVar;
        }
        if (this.mItemAnimator.toq(ftiVar, ftiVar2, c1056q, c1056q2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(@zy.lvui fti ftiVar) {
        WeakReference<RecyclerView> weakReference = ftiVar.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == ftiVar.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            ftiVar.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1048h.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC1048h) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e7);
            } catch (InstantiationException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e9);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        androidx.core.view.accessibility.toq.m3095s(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        this.mState.m4819k(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f5720p = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m5124g();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        mcp mcpVar = this.mState;
        mcpVar.f5722s = mcpVar.f52043ld6 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        mcpVar.f5723y = mcpVar.f52047x2;
        mcpVar.f5716g = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f52043ld6) {
            int iF7l8 = this.mChildHelper.f7l8();
            for (int i2 = 0; i2 < iF7l8; i2++) {
                fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4964g(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m5127n(childViewHolderInt, this.mItemAnimator.ni7(this.mState, childViewHolderInt, qrj.m4843n(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f5722s && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.zy(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f52047x2) {
            saveOldPositions();
            mcp mcpVar2 = this.mState;
            boolean z2 = mcpVar2.f52041f7l8;
            mcpVar2.f52041f7l8 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, mcpVar2);
            this.mState.f52041f7l8 = z2;
            for (int i3 = 0; i3 < this.mChildHelper.f7l8(); i3++) {
                fti childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m4964g(i3));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m5130s(childViewHolderInt2)) {
                    int iM4843n = qrj.m4843n(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iM4843n |= 4096;
                    }
                    qrj.C1056q c1056qNi7 = this.mItemAnimator.ni7(this.mState, childViewHolderInt2, iM4843n, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c1056qNi7);
                    } else {
                        this.mViewInfoStore.m5126k(childViewHolderInt2, c1056qNi7);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f5719n = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m4819k(6);
        this.mAdapterHelper.ld6();
        this.mState.f5716g = this.mAdapter.getItemCount();
        this.mState.f5721q = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f5691q;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        mcp mcpVar = this.mState;
        mcpVar.f5723y = false;
        this.mLayout.onLayoutChildren(this.mRecycler, mcpVar);
        mcp mcpVar2 = this.mState;
        mcpVar2.f52041f7l8 = false;
        mcpVar2.f52043ld6 = mcpVar2.f52043ld6 && this.mItemAnimator != null;
        mcpVar2.f5719n = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.m4819k(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        mcp mcpVar = this.mState;
        mcpVar.f5719n = 1;
        if (mcpVar.f52043ld6) {
            for (int iF7l8 = this.mChildHelper.f7l8() - 1; iF7l8 >= 0; iF7l8--) {
                fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4964g(iF7l8));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    qrj.C1056q c1056qZurt = this.mItemAnimator.zurt(this.mState, childViewHolderInt);
                    fti ftiVarF7l8 = this.mViewInfoStore.f7l8(changedHolderKey);
                    if (ftiVarF7l8 == null || ftiVarF7l8.shouldIgnore()) {
                        this.mViewInfoStore.m5129q(childViewHolderInt, c1056qZurt);
                    } else {
                        boolean zM5131y = this.mViewInfoStore.m5131y(ftiVarF7l8);
                        boolean zM5131y2 = this.mViewInfoStore.m5131y(childViewHolderInt);
                        if (zM5131y && ftiVarF7l8 == childViewHolderInt) {
                            this.mViewInfoStore.m5129q(childViewHolderInt, c1056qZurt);
                        } else {
                            qrj.C1056q c1056qN7h = this.mViewInfoStore.n7h(ftiVarF7l8);
                            this.mViewInfoStore.m5129q(childViewHolderInt, c1056qZurt);
                            qrj.C1056q c1056qQrj = this.mViewInfoStore.qrj(childViewHolderInt);
                            if (c1056qN7h == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, ftiVarF7l8);
                            } else {
                                animateChange(ftiVarF7l8, childViewHolderInt, c1056qN7h, c1056qQrj, zM5131y, zM5131y2);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.kja0(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        mcp mcpVar2 = this.mState;
        mcpVar2.f52048zy = mcpVar2.f5716g;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        mcpVar2.f52043ld6 = false;
        mcpVar2.f52047x2 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<fti> arrayList = this.mRecycler.f52034toq;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC1048h.mPrefetchMaxCountObserved = 0;
            abstractC1048h.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.d2ok();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m5124g();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC1049i interfaceC1049i = this.mInterceptingOnItemTouchListener;
        if (interfaceC1049i == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC1049i.mo4812k(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1049i interfaceC1049i = this.mOnItemTouchListeners.get(i2);
            if (interfaceC1049i.toq(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC1049i;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iF7l8 = this.mChildHelper.f7l8();
        if (iF7l8 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iF7l8; i4++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4964g(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    @zy.dd
    static RecyclerView findNestedRecyclerView(@zy.lvui View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    @zy.dd
    private View findNextViewToFocus() {
        fti ftiVarFindViewHolderForAdapterPosition;
        mcp mcpVar = this.mState;
        int i2 = mcpVar.f52045qrj;
        if (i2 == -1) {
            i2 = 0;
        }
        int iM4822q = mcpVar.m4822q();
        for (int i3 = i2; i3 < iM4822q; i3++) {
            fti ftiVarFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (ftiVarFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (ftiVarFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return ftiVarFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM4822q, i2);
        do {
            iMin--;
            if (iMin < 0 || (ftiVarFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!ftiVarFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return ftiVarFindViewHolderForAdapterPosition.itemView;
    }

    static fti getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((cdj) view.getLayoutParams()).f5699k;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        cdj cdjVar = (cdj) view.getLayoutParams();
        Rect rect2 = cdjVar.f52031toq;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) cdjVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) cdjVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) cdjVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) cdjVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private androidx.core.view.fti getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new androidx.core.view.fti(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, fti ftiVar, fti ftiVar2) {
        int iF7l8 = this.mChildHelper.f7l8();
        for (int i2 = 0; i2 < iF7l8; i2++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4964g(i2));
            if (childViewHolderInt != ftiVar && getChangedHolderKey(childViewHolderInt) == j2) {
                AbstractC1060y abstractC1060y = this.mAdapter;
                if (abstractC1060y == null || !abstractC1060y.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + ftiVar + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + ftiVar + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + ftiVar2 + " cannot be found but it is necessary for " + ftiVar + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int iF7l8 = this.mChildHelper.f7l8();
        for (int i2 = 0; i2 < iF7l8; i2++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4964g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C0683f.lrht(this) == 0) {
            C0683f.m58i(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.f7l8(new C1051n());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b2 = -1;
        int i4 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            b2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                b2 = 0;
            }
        }
        if (i2 == 1) {
            return b2 < 0 || (b2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return b2 > 0 || (b2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return b2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return b2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
    }

    private void nestedScrollByInternal(int i2, int i3, @zy.dd MotionEvent motionEvent, int i4) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC1048h.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        startNestedScroll(zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0, i4);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i3 : 0, this.mReusableIntPair, this.mScrollOffset, i4)) {
            int[] iArr2 = this.mReusableIntPair;
            i2 -= iArr2[0];
            i3 -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i3 : 0, motionEvent, i4);
        androidx.recyclerview.widget.n7h n7hVar = this.mGapWorker;
        if (n7hVar != null && (i2 != 0 || i3 != 0)) {
            n7hVar.m5066g(this, i2, i3);
        }
        stopNestedScroll(i4);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x3 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.o1t();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.fu4();
        } else {
            this.mAdapterHelper.ld6();
        }
        boolean z3 = false;
        boolean z5 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f52043ld6 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z5 || this.mLayout.mRequestedSimpleAnimations) && (!z2 || this.mAdapter.hasStableIds());
        mcp mcpVar = this.mState;
        if (mcpVar.f52043ld6 && z5 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z3 = true;
        }
        mcpVar.f52047x2 = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            androidx.core.widget.C0762s.f7l8(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0762s.f7l8(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            androidx.core.widget.C0762s.f7l8(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            androidx.core.widget.C0762s.f7l8(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.C0683f.h7am(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.n7h(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.f7l8() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        fti ftiVarFindViewHolderForItemId = (this.mState.f52044n7h == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f52044n7h);
        if (ftiVarFindViewHolderForItemId != null && !this.mChildHelper.n7h(ftiVarFindViewHolderForItemId.itemView) && ftiVarFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = ftiVarFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.f7l8() > 0) {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i2 = this.mState.f52042kja0;
            if (i2 != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            C0683f.h7am(this);
        }
    }

    private void requestChildOnScreen(@zy.lvui View view, @zy.dd View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof cdj) {
            cdj cdjVar = (cdj) layoutParams;
            if (!cdjVar.f52032zy) {
                Rect rect = cdjVar.f52031toq;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        mcp mcpVar = this.mState;
        mcpVar.f52044n7h = -1L;
        mcpVar.f52045qrj = -1;
        mcpVar.f52042kja0 = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        fti ftiVarFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (ftiVarFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f52044n7h = this.mAdapter.hasStableIds() ? ftiVarFindContainingViewHolder.getItemId() : -1L;
        this.mState.f52045qrj = this.mDataSetHasChangedAfterLayout ? -1 : ftiVarFindContainingViewHolder.isRemoved() ? ftiVarFindContainingViewHolder.mOldPosition : ftiVarFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f52042kja0 = getDeepestFocusedViewWithId(ftiVarFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(@zy.dd AbstractC1060y abstractC1060y, boolean z2, boolean z3) {
        AbstractC1060y abstractC1060y2 = this.mAdapter;
        if (abstractC1060y2 != null) {
            abstractC1060y2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.o1t();
        AbstractC1060y abstractC1060y3 = this.mAdapter;
        this.mAdapter = abstractC1060y;
        if (abstractC1060y != null) {
            abstractC1060y.registerAdapterDataObserver(this.mObserver);
            abstractC1060y.onAttachedToRecyclerView(this);
        }
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.onAdapterChanged(abstractC1060y3, this.mAdapter);
        }
        this.mRecycler.m4801z(abstractC1060y3, this.mAdapter, z2);
        this.mState.f52041f7l8 = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo4781g();
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.stopSmoothScroller();
        }
    }

    void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        C0683f.h7am(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null || !abstractC1048h.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(@zy.lvui kja0 kja0Var, int i2) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(kja0Var);
        } else {
            this.mItemDecorations.add(i2, kja0Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@zy.lvui ki kiVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(kiVar);
    }

    public void addOnItemTouchListener(@zy.lvui InterfaceC1049i interfaceC1049i) {
        this.mOnItemTouchListeners.add(interfaceC1049i);
    }

    public void addOnScrollListener(@zy.lvui fn3e fn3eVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(fn3eVar);
    }

    public void addRecyclerListener(@zy.lvui InterfaceC1061z interfaceC1061z) {
        androidx.core.util.n7h.toq(interfaceC1061z != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(interfaceC1061z);
    }

    void animateAppearance(@zy.lvui fti ftiVar, @zy.dd qrj.C1056q c1056q, @zy.lvui qrj.C1056q c1056q2) {
        ftiVar.setIsRecyclable(false);
        if (this.mItemAnimator.mo4847k(ftiVar, c1056q, c1056q2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(@zy.lvui fti ftiVar, @zy.lvui qrj.C1056q c1056q, @zy.dd qrj.C1056q c1056q2) {
        addAnimatingView(ftiVar);
        ftiVar.setIsRecyclable(false);
        if (this.mItemAnimator.zy(ftiVar, c1056q, c1056q2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(fti ftiVar) {
        qrj qrjVar = this.mItemAnimator;
        return qrjVar == null || qrjVar.f7l8(ftiVar, ftiVar.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof cdj) && this.mLayout.checkLayoutParams((cdj) layoutParams);
    }

    void clearOldPositions() {
        int iM4968p = this.mChildHelper.m4968p();
        for (int i2 = 0; i2 < iM4968p; i2++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m4794n();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<ki> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<fn3e> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ncyb
    public int computeHorizontalScrollExtent() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null && abstractC1048h.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ncyb
    public int computeHorizontalScrollOffset() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null && abstractC1048h.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ncyb
    public int computeHorizontalScrollRange() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null && abstractC1048h.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ncyb
    public int computeVerticalScrollExtent() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null && abstractC1048h.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ncyb
    public int computeVerticalScrollOffset() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null && abstractC1048h.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ncyb
    public int computeVerticalScrollRange() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null && abstractC1048h.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            C0683f.h7am(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            androidx.core.os.zurt.toq(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            androidx.core.os.zurt.m2775q();
            return;
        }
        if (this.mAdapterHelper.cdj()) {
            if (!this.mAdapterHelper.m4998h(4) || this.mAdapterHelper.m4998h(11)) {
                if (this.mAdapterHelper.cdj()) {
                    androidx.core.os.zurt.toq(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    androidx.core.os.zurt.m2775q();
                    return;
                }
                return;
            }
            androidx.core.os.zurt.toq(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.fu4();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m5001p();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            androidx.core.os.zurt.m2775q();
        }
    }

    void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(AbstractC1048h.chooseSize(i2, getPaddingLeft() + getPaddingRight(), C0683f.ek5k(this)), AbstractC1048h.chooseSize(i3, getPaddingTop() + getPaddingBottom(), C0683f.m3167m(this)));
    }

    void dispatchChildAttached(View view) {
        fti childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC1060y abstractC1060y = this.mAdapter;
        if (abstractC1060y != null && childViewHolderInt != null) {
            abstractC1060y.onViewAttachedToWindow(childViewHolderInt);
        }
        List<ki> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        fti childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC1060y abstractC1060y = this.mAdapter;
        if (abstractC1060y != null && childViewHolderInt != null) {
            abstractC1060y.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<ki> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f5720p = false;
        boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f5719n == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.ki() || z2 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().mo3266k(f2, f3, z2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().toq(f2, f3);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().zy(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().mo3263g(i2, i3, i4, i5, iArr);
    }

    void dispatchOnScrollStateChanged(int i2) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        fn3e fn3eVar = this.mScrollListener;
        if (fn3eVar != null) {
            fn3eVar.onScrollStateChanged(this, i2);
        }
        List<fn3e> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i2);
            }
        }
    }

    void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        fn3e fn3eVar = this.mScrollListener;
        if (fn3eVar != null) {
            fn3eVar.onScrolled(this, i2, i3);
        }
        List<fn3e> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            fti ftiVar = this.mPendingAccessibilityImportanceChange.get(size);
            if (ftiVar.itemView.getParent() == this && !ftiVar.shouldIgnore() && (i2 = ftiVar.mPendingAccessibilityState) != -1) {
                C0683f.o05(ftiVar.itemView, i2);
                ftiVar.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).mo4713s(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.cdj()) ? z2 : true) {
            C0683f.h7am(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo4876k = this.mEdgeEffectFactory.mo4876k(this, 3);
        this.mBottomGlow = edgeEffectMo4876k;
        if (this.mClipToPadding) {
            edgeEffectMo4876k.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo4876k.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo4876k = this.mEdgeEffectFactory.mo4876k(this, 0);
        this.mLeftGlow = edgeEffectMo4876k;
        if (this.mClipToPadding) {
            edgeEffectMo4876k.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo4876k.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo4876k = this.mEdgeEffectFactory.mo4876k(this, 2);
        this.mRightGlow = edgeEffectMo4876k;
        if (this.mClipToPadding) {
            edgeEffectMo4876k.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectMo4876k.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectMo4876k = this.mEdgeEffectFactory.mo4876k(this, 1);
        this.mTopGlow = edgeEffectMo4876k;
        if (this.mClipToPadding) {
            edgeEffectMo4876k.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectMo4876k.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(mcp mcpVar) {
        if (getScrollState() != 2) {
            mcpVar.f5717h = 0;
            mcpVar.f52040cdj = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f5694n;
            mcpVar.f5717h = overScroller.getFinalX() - overScroller.getCurrX();
            mcpVar.f52040cdj = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    @zy.dd
    public View findChildViewUnder(float f2, float f3) {
        for (int iF7l8 = this.mChildHelper.f7l8() - 1; iF7l8 >= 0; iF7l8--) {
            View viewM4964g = this.mChildHelper.m4964g(iF7l8);
            float translationX = viewM4964g.getTranslationX();
            float translationY = viewM4964g.getTranslationY();
            if (f2 >= viewM4964g.getLeft() + translationX && f2 <= viewM4964g.getRight() + translationX && f3 >= viewM4964g.getTop() + translationY && f3 <= viewM4964g.getBottom() + translationY) {
                return viewM4964g;
            }
        }
        return null;
    }

    @zy.dd
    public View findContainingItemView(@zy.lvui View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    @zy.dd
    public fti findContainingViewHolder(@zy.lvui View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @zy.dd
    public fti findViewHolderForAdapterPosition(int i2) {
        fti ftiVar = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM4968p = this.mChildHelper.m4968p();
        for (int i3 = 0; i3 < iM4968p; i3++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                if (!this.mChildHelper.n7h(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                ftiVar = childViewHolderInt;
            }
        }
        return ftiVar;
    }

    public fti findViewHolderForItemId(long j2) {
        AbstractC1060y abstractC1060y = this.mAdapter;
        fti ftiVar = null;
        if (abstractC1060y != null && abstractC1060y.hasStableIds()) {
            int iM4968p = this.mChildHelper.m4968p();
            for (int i2 = 0; i2 < iM4968p; i2++) {
                fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    if (!this.mChildHelper.n7h(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    ftiVar = childViewHolderInt;
                }
            }
        }
        return ftiVar;
    }

    @zy.dd
    public fti findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    @zy.dd
    public fti findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i2, int i3) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC1048h.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (!zCanScrollVertically || Math.abs(i3) < this.mMinFlingVelocity) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f2, f3, z2);
            t8r t8rVar = this.mOnFlingListener;
            if (t8rVar != null && t8rVar.onFling(i2, i3)) {
                return true;
            }
            if (z2) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i4 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i4, Math.min(i2, i4));
                int i5 = this.mMaxFlingVelocity;
                this.mViewFlinger.toq(iMax, Math.max(-i5, Math.min(i3, i5)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewOnFocusSearchFailed;
        boolean z2;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z3 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.canScrollHorizontally()) {
                int i4 = (this.mLayout.getLayoutDirection() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z5 = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z5;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i2) ? viewOnFocusSearchFailed : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            return abstractC1048h.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            return abstractC1048h.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @zy.dd
    public AbstractC1060y getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionInRecyclerView(fti ftiVar) {
        if (ftiVar.hasAnyOfTheFlags(524) || !ftiVar.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m4997g(ftiVar.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1048h abstractC1048h = this.mLayout;
        return abstractC1048h != null ? abstractC1048h.getBaseline() : super.getBaseline();
    }

    long getChangedHolderKey(fti ftiVar) {
        return this.mAdapter.hasStableIds() ? ftiVar.getItemId() : ftiVar.mPosition;
    }

    public int getChildAdapterPosition(@zy.lvui View view) {
        fti childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        ld6 ld6Var = this.mChildDrawingOrderCallback;
        return ld6Var == null ? super.getChildDrawingOrder(i2, i3) : ld6Var.mo4817k(i2, i3);
    }

    public long getChildItemId(@zy.lvui View view) {
        fti childViewHolderInt;
        AbstractC1060y abstractC1060y = this.mAdapter;
        if (abstractC1060y == null || !abstractC1060y.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@zy.lvui View view) {
        fti childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@zy.lvui View view) {
        return getChildAdapterPosition(view);
    }

    public fti getChildViewHolder(@zy.lvui View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @zy.dd
    public C1113t getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@zy.lvui View view, @zy.lvui Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @zy.lvui
    public x2 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @zy.dd
    public qrj getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        cdj cdjVar = (cdj) view.getLayoutParams();
        if (!cdjVar.f52032zy) {
            return cdjVar.f52031toq;
        }
        if (this.mState.m4821p() && (cdjVar.m4784g() || cdjVar.m4789y())) {
            return cdjVar.f52031toq;
        }
        Rect rect = cdjVar.f52031toq;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).mo4711n(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        cdjVar.f52032zy = false;
        return rect;
    }

    @zy.lvui
    public kja0 getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @zy.dd
    public AbstractC1048h getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @zy.dd
    public t8r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @zy.lvui
    public ni7 getRecycledViewPool() {
        return this.mRecycler.m4795p();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().ld6();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.cdj();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new C1084k(new C1047g());
    }

    @yz
    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.qrj(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C7401k.zy.f42682y), resources.getDimensionPixelSize(C7401k.zy.f42678p), resources.getDimensionPixelOffset(C7401k.zy.f42680s));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        qrj qrjVar = this.mItemAnimator;
        return qrjVar != null && qrjVar.cdj();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().qrj();
    }

    void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i2);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int iM4968p = this.mChildHelper.m4968p();
        for (int i2 = 0; i2 < iM4968p; i2++) {
            ((cdj) this.mChildHelper.m4970s(i2).getLayoutParams()).f52032zy = true;
        }
        this.mRecycler.m4792i();
    }

    void markKnownViewsInvalid() {
        int iM4968p = this.mChildHelper.m4968p();
        for (int i2 = 0; i2 < iM4968p; i2++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.fn3e();
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, null, 1);
    }

    public void offsetChildrenHorizontal(@InterfaceC7833l int i2) {
        int iF7l8 = this.mChildHelper.f7l8();
        for (int i3 = 0; i3 < iF7l8; i3++) {
            this.mChildHelper.m4964g(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(@InterfaceC7833l int i2) {
        int iF7l8 = this.mChildHelper.f7l8();
        for (int i3 = 0; i3 < iF7l8; i3++) {
            this.mChildHelper.m4964g(i3).offsetTopAndBottom(i2);
        }
    }

    void offsetPositionRecordsForInsert(int i2, int i3) {
        int iM4968p = this.mChildHelper.m4968p();
        for (int i4 = 0; i4 < iM4968p; i4++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f52041f7l8 = true;
            }
        }
        this.mRecycler.zurt(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iM4968p = this.mChildHelper.m4968p();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iM4968p; i8++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.mPosition) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i6, false);
                }
                this.mState.f52041f7l8 = true;
            }
        }
        this.mRecycler.ni7(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iM4968p = this.mChildHelper.m4968p();
        for (int i5 = 0; i5 < iM4968p; i5++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i6 = childViewHolderInt.mPosition;
                if (i6 >= i4) {
                    childViewHolderInt.offsetPosition(-i3, z2);
                    this.mState.f52041f7l8 = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.mState.f52041f7l8 = true;
                }
            }
        }
        this.mRecycler.fu4(i2, i3, z2);
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<androidx.recyclerview.widget.n7h> threadLocal = androidx.recyclerview.widget.n7h.f5979y;
            androidx.recyclerview.widget.n7h n7hVar = threadLocal.get();
            this.mGapWorker = n7hVar;
            if (n7hVar == null) {
                this.mGapWorker = new androidx.recyclerview.widget.n7h();
                Display displayNcyb = C0683f.ncyb(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayNcyb != null) {
                    float refreshRate = displayNcyb.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.n7h n7hVar2 = this.mGapWorker;
                n7hVar2.f5982n = (long) (1.0E9f / f2);
                threadLocal.set(n7hVar2);
            }
            this.mGapWorker.m5067k(this);
        }
    }

    public void onChildAttachedToWindow(@zy.lvui View view) {
    }

    public void onChildDetachedFromWindow(@zy.lvui View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.n7h n7hVar;
        super.onDetachedFromWindow();
        qrj qrjVar = this.mItemAnimator;
        if (qrjVar != null) {
            qrjVar.x2();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m5128p();
        if (!ALLOW_THREAD_GAP_WORK || (n7hVar = this.mGapWorker) == null) {
            return;
        }
        n7hVar.m5068p(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).f7l8(canvas, this, this.mState);
        }
    }

    void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$h r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$h r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$h r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$h r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$h r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC1048h.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i2 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x4 - this.mInitialTouchX;
                int i4 = y4 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x4;
                    z2 = true;
                }
                if (zCanScrollVertically && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y4;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x5;
            this.mInitialTouchX = x5;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y5;
            this.mInitialTouchY = y5;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        androidx.core.os.zurt.toq(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        androidx.core.os.zurt.m2775q();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (abstractC1048h.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f5719n == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i2, i3);
            this.mState.f5720p = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f5720p = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            mcp mcpVar = this.mState;
            if (mcpVar.f52047x2) {
                mcpVar.f5723y = true;
            } else {
                this.mAdapterHelper.ld6();
                this.mState.f5723y = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f52047x2) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1060y abstractC1060y = this.mAdapter;
        if (abstractC1060y != null) {
            this.mState.f5716g = abstractC1060y.getItemCount();
        } else {
            this.mState.f5716g = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        stopInterceptRequestLayout(false);
        this.mState.f5723y = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.m4778k(savedState2);
        } else {
            AbstractC1048h abstractC1048h = this.mLayout;
            if (abstractC1048h != null) {
                savedState.f5691q = abstractC1048h.onSaveInstanceState();
            } else {
                savedState.f5691q = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(@InterfaceC7833l int i2, @InterfaceC7833l int i3) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
      0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        C0683f.mbx(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(fti ftiVar, qrj.C1056q c1056q) {
        ftiVar.setFlags(0, 8192);
        if (this.mState.f5722s && ftiVar.isUpdated() && !ftiVar.isRemoved() && !ftiVar.shouldIgnore()) {
            this.mViewInfoStore.zy(getChangedHolderKey(ftiVar), ftiVar);
        }
        this.mViewInfoStore.m5127n(ftiVar, c1056q);
    }

    void removeAndRecycleViews() {
        qrj qrjVar = this.mItemAnimator;
        if (qrjVar != null) {
            qrjVar.x2();
        }
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m4796q();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zKi = this.mChildHelper.ki(view);
        if (zKi) {
            fti childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.eqxt(childViewHolderInt);
            this.mRecycler.jk(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zKi);
        return zKi;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        fti childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(@zy.lvui kja0 kja0Var) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            abstractC1048h.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(kja0Var);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@zy.lvui ki kiVar) {
        List<ki> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(kiVar);
    }

    public void removeOnItemTouchListener(@zy.lvui InterfaceC1049i interfaceC1049i) {
        this.mOnItemTouchListeners.remove(interfaceC1049i);
        if (this.mInterceptingOnItemTouchListener == interfaceC1049i) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@zy.lvui fn3e fn3eVar) {
        List<fn3e> list = this.mScrollListeners;
        if (list != null) {
            list.remove(fn3eVar);
        }
    }

    public void removeRecyclerListener(@zy.lvui InterfaceC1061z interfaceC1061z) {
        this.mRecyclerListeners.remove(interfaceC1061z);
    }

    void repositionShadowingViews() {
        fti ftiVar;
        int iF7l8 = this.mChildHelper.f7l8();
        for (int i2 = 0; i2 < iF7l8; i2++) {
            View viewM4964g = this.mChildHelper.m4964g(i2);
            fti childViewHolder = getChildViewHolder(viewM4964g);
            if (childViewHolder != null && (ftiVar = childViewHolder.mShadowingHolder) != null) {
                View view = ftiVar.itemView;
                int left = viewM4964g.getLeft();
                int top = viewM4964g.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).zy(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int iM4968p = this.mChildHelper.m4968p();
        for (int i2 = 0; i2 < iM4968p; i2++) {
            fti childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m4970s(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC1048h.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i2 = 0;
            }
            if (!zCanScrollVertically) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null, 0);
        }
    }

    boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i7 = i2 - i9;
            i8 = i3 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i5, i7, i8, this.mScrollOffset, i4, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z2 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i16 = iArr5[0];
        this.mLastTouchX = i15 - i16;
        int i17 = this.mLastTouchY;
        int i18 = iArr5[1];
        this.mLastTouchY = i17 - i18;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C0720t.x2(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i12, motionEvent.getY(), i14);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            dispatchOnScrolled(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i5 == 0) ? false : true;
    }

    void scrollStep(int i2, int i3, @zy.dd int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        androidx.core.os.zurt.toq(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i2 != 0 ? this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i3 != 0 ? this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState) : 0;
        androidx.core.os.zurt.m2775q();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1048h.scrollToPosition(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@zy.dd C1113t c1113t) {
        this.mAccessibilityDelegate = c1113t;
        C0683f.zwy(this, c1113t);
    }

    public void setAdapter(@zy.dd AbstractC1060y abstractC1060y) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC1060y, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@zy.dd ld6 ld6Var) {
        if (ld6Var == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = ld6Var;
        setChildrenDrawingOrderEnabled(ld6Var != null);
    }

    @yz
    boolean setChildImportantForAccessibilityInternal(fti ftiVar, int i2) {
        if (!isComputingLayout()) {
            C0683f.o05(ftiVar.itemView, i2);
            return true;
        }
        ftiVar.mPendingAccessibilityState = i2;
        this.mPendingAccessibilityImportanceChange.add(ftiVar);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@zy.lvui x2 x2Var) {
        androidx.core.util.n7h.x2(x2Var);
        this.mEdgeEffectFactory = x2Var;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(@zy.dd qrj qrjVar) {
        qrj qrjVar2 = this.mItemAnimator;
        if (qrjVar2 != null) {
            qrjVar2.x2();
            this.mItemAnimator.wvg(null);
        }
        this.mItemAnimator = qrjVar;
        if (qrjVar != null) {
            qrjVar.wvg(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.gvn7(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(@zy.dd AbstractC1048h abstractC1048h) {
        if (abstractC1048h == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            qrj qrjVar = this.mItemAnimator;
            if (qrjVar != null) {
                qrjVar.x2();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m4796q();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m4796q();
        }
        this.mChildHelper.kja0();
        this.mLayout = abstractC1048h;
        if (abstractC1048h != null) {
            if (abstractC1048h.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC1048h + " is already attached to a RecyclerView:" + abstractC1048h.mRecyclerView.exceptionLabel());
            }
            abstractC1048h.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.d2ok();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().mo3264h(z2);
    }

    public void setOnFlingListener(@zy.dd t8r t8rVar) {
        this.mOnFlingListener = t8rVar;
    }

    @Deprecated
    public void setOnScrollListener(@zy.dd fn3e fn3eVar) {
        this.mScrollListener = fn3eVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(@zy.dd ni7 ni7Var) {
        this.mRecycler.fti(ni7Var);
    }

    @Deprecated
    public void setRecyclerListener(@zy.dd InterfaceC1061z interfaceC1061z) {
        this.mRecyclerListener = interfaceC1061z;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@zy.dd jk jkVar) {
        this.mRecycler.jp0y(jkVar);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iM3094q = accessibilityEvent != null ? androidx.core.view.accessibility.toq.m3094q(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iM3094q != 0 ? iM3094q : 0;
        return true;
    }

    public void smoothScrollBy(@InterfaceC7833l int i2, @InterfaceC7833l int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC1048h.smoothScrollToPosition(this, this.mState, i2);
        }
    }

    void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().ki(i2);
    }

    void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, androidx.core.view.a9
    public void stopNestedScroll() {
        getScrollingChildHelper().mo3265i();
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(@zy.dd AbstractC1060y abstractC1060y, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC1060y, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int iM4968p = this.mChildHelper.m4968p();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iM4968p; i6++) {
            View viewM4970s = this.mChildHelper.m4970s(i6);
            fti childViewHolderInt = getChildViewHolderInt(viewM4970s);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i2 && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((cdj) viewM4970s.getLayoutParams()).f52032zy = true;
            }
        }
        this.mRecycler.m4797r(i2, i3);
    }

    public RecyclerView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7401k.k.f93342ki);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().mo3268q(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().f7l8(i2, i3, i4, i5, iArr, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @zy.dd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.fti findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.f7l8 r0 = r5.mChildHelper
            int r0 = r0.m4968p()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.f7l8 r3 = r5.mChildHelper
            android.view.View r3 = r3.m4970s(r2)
            androidx.recyclerview.widget.RecyclerView$fti r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.f7l8 r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.n7h(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$fti");
    }

    @Override // androidx.core.view.mcp
    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().x2(i2);
    }

    void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(@InterfaceC7833l int i2, @InterfaceC7833l int i3, @zy.dd Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().t8r(i2, i3);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().fn3e(i2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.recyclerview.widget.RecyclerView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: q */
        Parcelable f5691q;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5691q = parcel.readParcelable(classLoader == null ? AbstractC1048h.class.getClassLoader() : classLoader);
        }

        /* JADX INFO: renamed from: k */
        void m4778k(SavedState savedState) {
            this.f5691q = savedState.f5691q;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeParcelable(this.f5691q, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new o1t();
        this.mRecycler = new fu4();
        this.mViewInfoStore = new x9kr();
        this.mUpdateChildViewsRunnable = new RunnableC1050k();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new x2();
        this.mItemAnimator = new C1107p();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new a9();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new n7h.toq() : null;
        this.mState = new mcp();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new n7h();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new toq();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1054q();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ch.toq(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ch.m3143n(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.wvg(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C0683f.m3157c(this) == 0) {
            C0683f.o05(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1113t(this));
        int[] iArr = C7401k.p.f93433x9kr;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        C0683f.ij(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(C7401k.p.f93430vyq);
        if (typedArrayObtainStyledAttributes.getInt(C7401k.p.f93419n5r1, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(C7401k.p.f42648l, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C7401k.p.f93410hyr, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C7401k.p.f93416lrht), typedArrayObtainStyledAttributes.getDrawable(C7401k.p.f93429uv6), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C7401k.p.f42643f), typedArrayObtainStyledAttributes.getDrawable(C7401k.p.f42641c));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        C0683f.ij(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    @Override // androidx.core.view.jk
    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, @zy.lvui int[] iArr2) {
        getScrollingChildHelper().mo3267n(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void smoothScrollBy(@InterfaceC7833l int i2, @InterfaceC7833l int i3, @zy.dd Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public static class cdj extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: k */
        fti f5699k;

        /* JADX INFO: renamed from: q */
        boolean f5700q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Rect f52031toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f52032zy;

        public cdj(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52031toq = new Rect();
            this.f52032zy = true;
            this.f5700q = false;
        }

        public boolean f7l8() {
            return this.f5699k.isRemoved();
        }

        /* JADX INFO: renamed from: g */
        public boolean m4784g() {
            return this.f5699k.isUpdated();
        }

        /* JADX INFO: renamed from: k */
        public int m4785k() {
            return this.f5699k.getAbsoluteAdapterPosition();
        }

        @Deprecated
        /* JADX INFO: renamed from: n */
        public int m4786n() {
            return this.f5699k.getPosition();
        }

        /* JADX INFO: renamed from: q */
        public int m4787q() {
            return this.f5699k.getLayoutPosition();
        }

        /* JADX INFO: renamed from: s */
        public boolean m4788s() {
            return this.f5699k.needsUpdate();
        }

        public int toq() {
            return this.f5699k.getBindingAdapterPosition();
        }

        /* JADX INFO: renamed from: y */
        public boolean m4789y() {
            return this.f5699k.isInvalid();
        }

        @Deprecated
        public int zy() {
            return this.f5699k.getBindingAdapterPosition();
        }

        public cdj(int i2, int i3) {
            super(i2, i3);
            this.f52031toq = new Rect();
            this.f52032zy = true;
            this.f5700q = false;
        }

        public cdj(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52031toq = new Rect();
            this.f52032zy = true;
            this.f5700q = false;
        }

        public cdj(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52031toq = new Rect();
            this.f52032zy = true;
            this.f5700q = false;
        }

        public cdj(cdj cdjVar) {
            super((ViewGroup.LayoutParams) cdjVar);
            this.f52031toq = new Rect();
            this.f52032zy = true;
            this.f5700q = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h != null) {
            return abstractC1048h.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    void smoothScrollBy(@InterfaceC7833l int i2, @InterfaceC7833l int i3, @zy.dd Interpolator interpolator, int i4, boolean z2) {
        AbstractC1048h abstractC1048h = this.mLayout;
        if (abstractC1048h == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC1048h.canScrollHorizontally()) {
            i2 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (i4 == Integer.MIN_VALUE || i4 > 0) {
            if (z2) {
                int i5 = i2 != 0 ? 1 : 0;
                if (i3 != 0) {
                    i5 |= 2;
                }
                startNestedScroll(i5, 1);
            }
            this.mViewFlinger.mo4782n(i2, i3, i4, interpolator);
            return;
        }
        scrollBy(i2, i3);
    }

    public void addItemDecoration(@zy.lvui kja0 kja0Var) {
        addItemDecoration(kja0Var, -1);
    }
}
