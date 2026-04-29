package miuix.animation.controller;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.ArrayMap;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import miuix.animation.C6839R;
import miuix.animation.IAnimTarget;
import miuix.animation.ITouchStyle;
import miuix.animation.ViewTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.internal.AnimValueUtils;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.animation.property.ViewProperty;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.styles.ForegroundColorStyle;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.EaseManager;
import miuix.animation.utils.LogUtils;
import pnt2.toq;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeTouch extends FolmeBase implements ITouchStyle {
    private static final float DEFAULT_SCALE = 0.9f;
    private static final int SCALE_DIS = 10;
    private static WeakHashMap<View, InnerViewTouchListener> sTouchRecord = new WeakHashMap<>();
    private boolean mClearTint;
    private boolean mClickInvoked;
    private View.OnClickListener mClickListener;
    private TransitionListener mDefListener;
    private AnimConfig mDownConfig;
    private int mDownWeight;
    private float mDownX;
    private float mDownY;
    private FolmeFont mFontStyle;
    private Rect mGlobalBoundInWindow;
    private boolean mIsDown;
    private WeakReference<View> mListView;
    private int[] mLocationInScreen;
    private boolean mLongClickInvoked;
    private View.OnLongClickListener mLongClickListener;
    private LongClickTask mLongClickTask;
    private Rect mRootGlobalBoundInWindow;
    private float mScaleDist;
    private Map<ITouchStyle.TouchType, Boolean> mScaleSetMap;
    private boolean mSetTint;
    private int mTouchIndex;
    private WeakReference<View> mTouchView;
    private AnimConfig mUpConfig;
    private int mUpWeight;

    private static class InnerListViewTouchListener implements View.OnTouchListener {
        private AnimConfig[] mConfigs;
        private WeakReference<FolmeTouch> mFolmeTouchRef;

        InnerListViewTouchListener(FolmeTouch folmeTouch, AnimConfig... animConfigArr) {
            this.mFolmeTouchRef = new WeakReference<>(folmeTouch);
            this.mConfigs = animConfigArr;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            WeakReference<FolmeTouch> weakReference = this.mFolmeTouchRef;
            FolmeTouch folmeTouch = weakReference == null ? null : weakReference.get();
            if (folmeTouch == null) {
                return false;
            }
            if (motionEvent == null) {
                folmeTouch.onEventUp(this.mConfigs);
                return false;
            }
            folmeTouch.handleMotionEvent(view, motionEvent, this.mConfigs);
            return false;
        }
    }

    private static class InnerViewTouchListener implements View.OnTouchListener {
        private WeakHashMap<FolmeTouch, AnimConfig[]> mTouchMap;

        private InnerViewTouchListener() {
            this.mTouchMap = new WeakHashMap<>();
        }

        void addTouch(FolmeTouch folmeTouch, AnimConfig... animConfigArr) {
            this.mTouchMap.put(folmeTouch, animConfigArr);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            for (Map.Entry<FolmeTouch, AnimConfig[]> entry : this.mTouchMap.entrySet()) {
                entry.getKey().handleMotionEvent(view, motionEvent, entry.getValue());
            }
            return false;
        }

        boolean removeTouch(FolmeTouch folmeTouch) {
            this.mTouchMap.remove(folmeTouch);
            return this.mTouchMap.isEmpty();
        }
    }

    private static class ListViewInfo {
        View itemView;
        AbsListView listView;

        private ListViewInfo() {
        }
    }

    private static final class LongClickTask implements Runnable {
        private WeakReference<FolmeTouch> mTouchRef;

        private LongClickTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            FolmeTouch folmeTouch = this.mTouchRef.get();
            if (folmeTouch != null) {
                IAnimTarget target = folmeTouch.mState.getTarget();
                if (!(target instanceof ViewTarget) || (view = (View) target.getTargetObject()) == null || folmeTouch.mLongClickListener == null) {
                    return;
                }
                view.performLongClick();
                folmeTouch.invokeLongClick(view);
            }
        }

        void start(FolmeTouch folmeTouch) {
            View targetObject;
            IAnimTarget target = folmeTouch.mState.getTarget();
            if (!(target instanceof ViewTarget) || (targetObject = ((ViewTarget) target).getTargetObject()) == null) {
                return;
            }
            this.mTouchRef = new WeakReference<>(folmeTouch);
            targetObject.postDelayed(this, ViewConfiguration.getLongPressTimeout());
        }

        void stop(FolmeTouch folmeTouch) {
            View targetObject;
            IAnimTarget target = folmeTouch.mState.getTarget();
            if (!(target instanceof ViewTarget) || (targetObject = ((ViewTarget) target).getTargetObject()) == null) {
                return;
            }
            targetObject.removeCallbacks(this);
        }
    }

    public FolmeTouch(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        this.mGlobalBoundInWindow = new Rect();
        this.mRootGlobalBoundInWindow = new Rect();
        this.mLocationInScreen = new int[2];
        this.mScaleSetMap = new ArrayMap();
        this.mDownConfig = new AnimConfig();
        this.mUpConfig = new AnimConfig();
        this.mClearTint = false;
        this.mDefListener = new TransitionListener() { // from class: miuix.animation.controller.FolmeTouch.1
            @Override // miuix.animation.listener.TransitionListener
            public void onBegin(Object obj, Collection<UpdateInfo> collection) {
                if (obj.equals(ITouchStyle.TouchType.DOWN)) {
                    AnimState.alignState(FolmeTouch.this.mState.getState(ITouchStyle.TouchType.UP), collection);
                }
            }
        };
        initScaleDist(iAnimTargetArr.length > 0 ? iAnimTargetArr[0] : null);
        this.mState.getState(ITouchStyle.TouchType.UP).add(ViewProperty.SCALE_X, 1.0d).add(ViewProperty.SCALE_Y, 1.0d);
        setTintColor();
        this.mDownConfig.setEase(EaseManager.getStyle(-2, 0.99f, 0.15f));
        this.mDownConfig.addListeners(this.mDefListener);
        this.mUpConfig.setEase(-2, 0.99f, 0.3f).setSpecial(ViewProperty.ALPHA, -2L, DEFAULT_SCALE, 0.2f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bindListView(View view, boolean z2, AnimConfig... animConfigArr) {
        ListViewInfo listViewInfo;
        if (this.mState.getTarget() == null || (listViewInfo = getListViewInfo(view)) == null || listViewInfo.listView == null) {
            return false;
        }
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("handleListViewTouch for " + view, new Object[0]);
        }
        handleListViewTouch(listViewInfo.listView, view, z2, animConfigArr);
        return true;
    }

    private void doHandleTouchOf(final View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, final boolean z2, final AnimConfig... animConfigArr) {
        setClickAndLongClickListener(onClickListener, onLongClickListener);
        handleViewTouch(view, animConfigArr);
        if (setTouchView(view)) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("handleViewTouch for " + view, new Object[0]);
            }
            final boolean zIsClickable = view.isClickable();
            view.setClickable(true);
            CommonUtils.runOnPreDraw(view, new Runnable() { // from class: miuix.animation.controller.FolmeTouch.3
                @Override // java.lang.Runnable
                public void run() {
                    if (z2 || !FolmeTouch.this.bindListView(view, true, animConfigArr)) {
                        return;
                    }
                    FolmeTouch.this.resetViewTouch(view, zIsClickable);
                }
            });
        }
    }

    private AnimConfig[] getDownConfig(AnimConfig... animConfigArr) {
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mDownConfig);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ListViewInfo getListViewInfo(View view) {
        AbsListView absListView = null;
        ListViewInfo listViewInfo = new ListViewInfo();
        ViewParent parent = view.getParent();
        while (true) {
            if (parent == null) {
                break;
            }
            if (parent instanceof AbsListView) {
                absListView = (AbsListView) parent;
                break;
            }
            if (parent instanceof View) {
                view = parent;
            }
            parent = parent.getParent();
        }
        if (absListView != null) {
            this.mListView = new WeakReference<>(listViewInfo.listView);
            listViewInfo.listView = absListView;
            listViewInfo.itemView = view;
        }
        return listViewInfo;
    }

    public static ListViewTouchListener getListViewTouchListener(AbsListView absListView) {
        return (ListViewTouchListener) absListView.getTag(toq.C8134toq.f43971y);
    }

    private ITouchStyle.TouchType getType(ITouchStyle.TouchType... touchTypeArr) {
        return touchTypeArr.length > 0 ? touchTypeArr[0] : ITouchStyle.TouchType.DOWN;
    }

    private AnimConfig[] getUpConfig(AnimConfig... animConfigArr) {
        return (AnimConfig[]) CommonUtils.mergeArray(animConfigArr, this.mUpConfig);
    }

    private void handleClick(View view, MotionEvent motionEvent) {
        if (this.mIsDown && this.mClickListener != null && this.mTouchIndex == motionEvent.getActionIndex()) {
            IAnimTarget target = this.mState.getTarget();
            if ((target instanceof ViewTarget) && isInTouchSlop(view, motionEvent)) {
                View targetObject = ((ViewTarget) target).getTargetObject();
                targetObject.performClick();
                invokeClick(targetObject);
            }
        }
    }

    private void handleListViewTouch(AbsListView absListView, View view, boolean z2, AnimConfig... animConfigArr) {
        ListViewTouchListener listViewTouchListener = getListViewTouchListener(absListView);
        if (listViewTouchListener == null) {
            listViewTouchListener = new ListViewTouchListener(absListView);
            absListView.setTag(toq.C8134toq.f43971y, listViewTouchListener);
        }
        if (z2) {
            absListView.setOnTouchListener(listViewTouchListener);
        }
        listViewTouchListener.putListener(view, new InnerListViewTouchListener(this, animConfigArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMotionEvent(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            recordDownEvent(motionEvent);
            onEventDown(animConfigArr);
            return;
        }
        if (actionMasked == 1) {
            handleClick(view, motionEvent);
        } else if (actionMasked == 2) {
            onEventMove(motionEvent, view, animConfigArr);
            return;
        }
        onEventUp(animConfigArr);
    }

    private void handleViewTouch(View view, AnimConfig... animConfigArr) {
        InnerViewTouchListener innerViewTouchListener = sTouchRecord.get(view);
        if (innerViewTouchListener == null) {
            innerViewTouchListener = new InnerViewTouchListener();
            sTouchRecord.put(view, innerViewTouchListener);
        }
        view.setOnTouchListener(innerViewTouchListener);
        innerViewTouchListener.addTouch(this, animConfigArr);
    }

    private void initScaleDist(IAnimTarget iAnimTarget) {
        View targetObject = iAnimTarget instanceof ViewTarget ? ((ViewTarget) iAnimTarget).getTargetObject() : null;
        if (targetObject != null) {
            this.mScaleDist = TypedValue.applyDimension(1, 10.0f, targetObject.getResources().getDisplayMetrics());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeClick(View view) {
        if (this.mClickInvoked || this.mLongClickInvoked) {
            return;
        }
        this.mClickInvoked = true;
        this.mClickListener.onClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invokeLongClick(View view) {
        if (this.mLongClickInvoked) {
            return;
        }
        this.mLongClickInvoked = true;
        this.mLongClickListener.onLongClick(view);
    }

    private boolean isInTouchSlop(View view, MotionEvent motionEvent) {
        return CommonUtils.getDistance(this.mDownX, this.mDownY, motionEvent.getRawX(), motionEvent.getRawY()) < ((double) CommonUtils.getTouchSlop(view));
    }

    static boolean isOnTouchView(View view, int[] iArr, Rect rect, Rect rect2, MotionEvent motionEvent) {
        if (view == null) {
            return true;
        }
        view.getGlobalVisibleRect(rect);
        View rootView = view.getRootView();
        if (rootView != null) {
            rootView.getLocationOnScreen(iArr);
            rootView.getGlobalVisibleRect(rect2);
        } else {
            view.getLocationOnScreen(iArr);
            rect2.set(rect);
        }
        return rect.contains(((int) motionEvent.getRawX()) - iArr[0], (((int) motionEvent.getRawY()) - iArr[1]) + rect2.top);
    }

    private boolean isScaleSet(ITouchStyle.TouchType touchType) {
        return Boolean.TRUE.equals(this.mScaleSetMap.get(touchType));
    }

    private void onEventDown(AnimConfig... animConfigArr) {
        if (LogUtils.isLogEnabled()) {
            LogUtils.debug("onEventDown, touchDown", new Object[0]);
        }
        this.mIsDown = true;
        touchDown(animConfigArr);
    }

    private void onEventMove(MotionEvent motionEvent, View view, AnimConfig... animConfigArr) {
        if (this.mIsDown) {
            if (!isOnTouchView(view, this.mLocationInScreen, this.mGlobalBoundInWindow, this.mRootGlobalBoundInWindow, motionEvent)) {
                touchUp(animConfigArr);
                resetTouchStatus();
            } else {
                if (this.mLongClickTask == null || isInTouchSlop(view, motionEvent)) {
                    return;
                }
                this.mLongClickTask.stop(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onEventUp(AnimConfig... animConfigArr) {
        if (this.mIsDown) {
            if (LogUtils.isLogEnabled()) {
                LogUtils.debug("onEventUp, touchUp", new Object[0]);
            }
            touchUp(animConfigArr);
            resetTouchStatus();
        }
    }

    private void recordDownEvent(MotionEvent motionEvent) {
        if (this.mClickListener == null && this.mLongClickListener == null) {
            return;
        }
        this.mTouchIndex = motionEvent.getActionIndex();
        this.mDownX = motionEvent.getRawX();
        this.mDownY = motionEvent.getRawY();
        this.mClickInvoked = false;
        this.mLongClickInvoked = false;
        startLongClickTask();
    }

    private void resetTouchStatus() {
        LongClickTask longClickTask = this.mLongClickTask;
        if (longClickTask != null) {
            longClickTask.stop(this);
        }
        this.mIsDown = false;
        this.mTouchIndex = 0;
        this.mDownX = 0.0f;
        this.mDownY = 0.0f;
    }

    private View resetView(WeakReference<View> weakReference) {
        View view = weakReference.get();
        if (view != null) {
            view.setOnTouchListener(null);
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetViewTouch(View view, boolean z2) {
        view.setClickable(z2);
        view.setOnTouchListener(null);
    }

    private void setClickAndLongClickListener(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        IAnimTarget target = this.mState.getTarget();
        View targetObject = target instanceof ViewTarget ? ((ViewTarget) target).getTargetObject() : null;
        if (targetObject == null) {
            return;
        }
        if (this.mClickListener != null && onClickListener == null) {
            targetObject.setOnClickListener(null);
        } else if (onClickListener != null) {
            targetObject.setOnClickListener(new View.OnClickListener() { // from class: miuix.animation.controller.FolmeTouch.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    FolmeTouch.this.invokeClick(view);
                }
            });
        }
        this.mClickListener = onClickListener;
        if (this.mLongClickListener != null && onLongClickListener == null) {
            targetObject.setOnLongClickListener(null);
        } else if (onLongClickListener != null) {
            targetObject.setOnLongClickListener(new View.OnLongClickListener() { // from class: miuix.animation.controller.FolmeTouch.5
                @Override // android.view.View.OnLongClickListener
                public boolean onLongClick(View view) {
                    if (FolmeTouch.this.mLongClickInvoked) {
                        return false;
                    }
                    FolmeTouch.this.invokeLongClick(view);
                    return true;
                }
            });
        }
        this.mLongClickListener = onLongClickListener;
    }

    private void setHoverCorner(float f2) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            ((View) targetObject).setTag(C6839R.id.miuix_animation_tag_view_hover_corners, Float.valueOf(f2));
        }
    }

    private void setTargetValue(int i2, Object obj) {
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            ((View) targetObject).setTag(i2, obj);
        }
    }

    private void setTintColor() {
        if (this.mSetTint || this.mClearTint) {
            return;
        }
        int iArgb = Color.argb(20, 0, 0, 0);
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            iArgb = ((View) targetObject).getResources().getColor(toq.C7609k.f43959n);
        }
        ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
        this.mState.getState(ITouchStyle.TouchType.DOWN).add(foregroundProperty, iArgb);
        this.mState.getState(ITouchStyle.TouchType.UP).add(foregroundProperty, 0.0d);
    }

    private boolean setTouchView(View view) {
        WeakReference<View> weakReference = this.mTouchView;
        if ((weakReference != null ? weakReference.get() : null) == view) {
            return false;
        }
        this.mTouchView = new WeakReference<>(view);
        return true;
    }

    private void startLongClickTask() {
        if (this.mLongClickListener == null) {
            return;
        }
        if (this.mLongClickTask == null) {
            this.mLongClickTask = new LongClickTask();
        }
        this.mLongClickTask.start(this);
    }

    @Override // miuix.animation.ITouchStyle
    public void bindViewOfListItem(final View view, final AnimConfig... animConfigArr) {
        if (setTouchView(view)) {
            CommonUtils.runOnPreDraw(view, new Runnable() { // from class: miuix.animation.controller.FolmeTouch.2
                @Override // java.lang.Runnable
                public void run() {
                    FolmeTouch.this.bindListView(view, false, animConfigArr);
                }
            });
        }
    }

    @Override // miuix.animation.controller.FolmeBase, miuix.animation.ICancelableStyle
    public void cancel() {
        super.cancel();
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.cancel();
        }
    }

    @Override // miuix.animation.controller.FolmeBase, miuix.animation.IStateContainer
    public void clean() {
        super.clean();
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.clean();
        }
        this.mScaleSetMap.clear();
        WeakReference<View> weakReference = this.mTouchView;
        if (weakReference != null) {
            resetView(weakReference);
            this.mTouchView = null;
        }
        WeakReference<View> weakReference2 = this.mListView;
        if (weakReference2 != null) {
            View viewResetView = resetView(weakReference2);
            if (viewResetView != null) {
                viewResetView.setTag(toq.C8134toq.f43971y, null);
            }
            this.mListView = null;
        }
        resetTouchStatus();
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle clearTintColor() {
        this.mClearTint = true;
        ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
        this.mState.getState(ITouchStyle.TouchType.DOWN).remove(foregroundProperty);
        this.mState.getState(ITouchStyle.TouchType.UP).remove(foregroundProperty);
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public void handleTouchOf(View view, AnimConfig... animConfigArr) {
        handleTouchOf(view, false, animConfigArr);
    }

    @Override // miuix.animation.ITouchStyle
    public void ignoreTouchOf(View view) {
        InnerViewTouchListener innerViewTouchListener = sTouchRecord.get(view);
        if (innerViewTouchListener == null || !innerViewTouchListener.removeTouch(this)) {
            return;
        }
        sTouchRecord.remove(view);
    }

    @Override // miuix.animation.ITouchStyle
    public void onMotionEvent(MotionEvent motionEvent) {
        handleMotionEvent(null, motionEvent, new AnimConfig[0]);
    }

    @Override // miuix.animation.ITouchStyle
    public void onMotionEventEx(View view, MotionEvent motionEvent, AnimConfig... animConfigArr) {
        handleMotionEvent(view, motionEvent, animConfigArr);
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setAlpha(float f2, ITouchStyle.TouchType... touchTypeArr) {
        this.mState.getState(getType(touchTypeArr)).add(ViewProperty.ALPHA, f2);
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setBackgroundColor(int i2) {
        ViewPropertyExt.BackgroundProperty backgroundProperty = ViewPropertyExt.BACKGROUND;
        this.mState.getState(ITouchStyle.TouchType.DOWN).add(backgroundProperty, i2);
        this.mState.getState(ITouchStyle.TouchType.UP).add(backgroundProperty, (int) AnimValueUtils.getValueOfTarget(this.mState.getTarget(), backgroundProperty, 0.0d));
        return this;
    }

    public void setFontStyle(FolmeFont folmeFont) {
        this.mFontStyle = folmeFont;
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setScale(float f2, ITouchStyle.TouchType... touchTypeArr) {
        ITouchStyle.TouchType type = getType(touchTypeArr);
        this.mScaleSetMap.put(type, Boolean.TRUE);
        double d2 = f2;
        this.mState.getState(type).add(ViewProperty.SCALE_X, d2).add(ViewProperty.SCALE_Y, d2);
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTint(int i2) {
        this.mSetTint = true;
        this.mClearTint = i2 == 0;
        this.mState.getState(ITouchStyle.TouchType.DOWN).add(ViewPropertyExt.FOREGROUND, i2);
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTintMode(int i2) {
        this.mDownConfig.setTintMode(i2);
        this.mUpConfig.setTintMode(i2);
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public void setTouchDown() {
        setTintColor();
        this.mState.setTo(ITouchStyle.TouchType.DOWN);
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTouchPadding(float f2, float f3, float f4, float f5) {
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_padding_rect, new RectF(f2, f3, f4, f5));
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_rect_location_mode, 4);
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTouchRadius(float f2) {
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_corners, Float.valueOf(f2));
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTouchRect(RectF rectF, ITouchStyle.TouchRectGravity touchRectGravity) {
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_rect, rectF);
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_rect_gravity, touchRectGravity);
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_rect_location_mode, Integer.valueOf(ForegroundColorStyle.MIUIX_TOUCH_RECT_LOCATION_MODE_RELATIVE));
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public void setTouchUp() {
        this.mState.setTo(ITouchStyle.TouchType.UP);
    }

    @Override // miuix.animation.ITouchStyle
    public void touchDown(AnimConfig... animConfigArr) {
        setHoverCorner(0.0f);
        setTintColor();
        AnimConfig[] downConfig = getDownConfig(animConfigArr);
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.to(this.mDownWeight, downConfig);
        }
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        ITouchStyle.TouchType touchType = ITouchStyle.TouchType.DOWN;
        AnimState state = iFolmeStateStyle.getState(touchType);
        if (!isScaleSet(touchType)) {
            IAnimTarget target = this.mState.getTarget();
            float fMax = Math.max(target.getValue(ViewProperty.WIDTH), target.getValue(ViewProperty.HEIGHT));
            double dMax = Math.max((fMax - this.mScaleDist) / fMax, DEFAULT_SCALE);
            state.add(ViewProperty.SCALE_X, dMax).add(ViewProperty.SCALE_Y, dMax);
        }
        this.mState.to(state, downConfig);
    }

    @Override // miuix.animation.ITouchStyle
    public void touchUp(AnimConfig... animConfigArr) {
        AnimConfig[] upConfig = getUpConfig(animConfigArr);
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            folmeFont.to(this.mUpWeight, upConfig);
        }
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        iFolmeStateStyle.to(iFolmeStateStyle.getState(ITouchStyle.TouchType.UP), upConfig);
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle useVarFont(TextView textView, int i2, int i3, int i4) {
        FolmeFont folmeFont = this.mFontStyle;
        if (folmeFont != null) {
            this.mUpWeight = i3;
            this.mDownWeight = i4;
            folmeFont.useAt(textView, i2, i3);
        }
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public void handleTouchOf(View view, View.OnClickListener onClickListener, AnimConfig... animConfigArr) {
        doHandleTouchOf(view, onClickListener, null, false, animConfigArr);
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTouchRadius(float f2, float f3, float f4, float f5) {
        setTargetValue(C6839R.id.miuix_animation_tag_view_touch_corners, new RectF(f2, f3, f4, f5));
        return this;
    }

    @Override // miuix.animation.ITouchStyle
    public void handleTouchOf(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, AnimConfig... animConfigArr) {
        doHandleTouchOf(view, onClickListener, onLongClickListener, false, animConfigArr);
    }

    @Override // miuix.animation.ITouchStyle
    public void handleTouchOf(View view, boolean z2, AnimConfig... animConfigArr) {
        doHandleTouchOf(view, null, null, z2, animConfigArr);
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setTint(float f2, float f3, float f4, float f5) {
        return setTint(Color.argb((int) (f2 * 255.0f), (int) (f3 * 255.0f), (int) (f4 * 255.0f), (int) (f5 * 255.0f)));
    }

    @Override // miuix.animation.ITouchStyle
    public ITouchStyle setBackgroundColor(float f2, float f3, float f4, float f5) {
        return setBackgroundColor(Color.argb((int) (f2 * 255.0f), (int) (f3 * 255.0f), (int) (f4 * 255.0f), (int) (f5 * 255.0f)));
    }
}
