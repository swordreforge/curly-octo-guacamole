package com.miui.maml;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C0683f;
import com.miui.maml.RendererController;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.VariableNames;
import com.miui.maml.data.Variables;
import com.miui.maml.util.MamlAccessHelper;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;

/* JADX INFO: loaded from: classes3.dex */
public class MiAdvancedView extends View implements RendererController.IRenderable {
    private static final String LOG_TAG = "MiAdvancedView";
    private boolean mLoggedHardwareRender;
    private MamlAccessHelper mMamlAccessHelper;
    protected boolean mNeedDisallowInterceptTouchEvent;
    private boolean mPaused;
    private int mPivotX;
    private int mPivotY;
    protected ScreenElementRoot mRoot;
    private float mScale;
    private boolean mUseExternalRenderThread;

    public MiAdvancedView(Context context, ScreenElementRoot screenElementRoot) {
        super(context);
        this.mPaused = true;
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.mRoot = screenElementRoot;
        if (screenElementRoot != null) {
            screenElementRoot.setOnHoverChangeListener(new ScreenElementRoot.OnHoverChangeListener() { // from class: com.miui.maml.MiAdvancedView.1
                @Override // com.miui.maml.ScreenElementRoot.OnHoverChangeListener
                public void onHoverChange(String str) {
                    MiAdvancedView.this.setContentDescription(str);
                    MiAdvancedView.this.sendAccessibilityEvent(32768);
                }
            });
        }
        init();
    }

    private void removeAccessHelperRef() {
        this.mRoot.setMamlAccessHelper(null);
        MamlAccessHelper mamlAccessHelper = this.mMamlAccessHelper;
        if (mamlAccessHelper != null) {
            mamlAccessHelper.removeRoot();
        }
    }

    public void cleanUp() {
        cleanUp(false);
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        MamlAccessHelper mamlAccessHelper = this.mMamlAccessHelper;
        if (mamlAccessHelper == null || !mamlAccessHelper.dispatchHoverEvent(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // com.miui.maml.RendererController.IRenderable
    public void doRender() {
        postInvalidate();
    }

    public final ScreenElementRoot getRoot() {
        return this.mRoot;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return (int) this.mRoot.getHeight();
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return (int) this.mRoot.getWidth();
    }

    public void init() {
        this.mRoot.setRenderControllerRenderable(this);
        this.mRoot.setConfiguration(getResources().getConfiguration());
        this.mRoot.attachToVsync();
        this.mRoot.selfInit();
        MamlAccessHelper mamlAccessHelper = new MamlAccessHelper(this.mRoot, this);
        this.mMamlAccessHelper = mamlAccessHelper;
        C0683f.zwy(this, mamlAccessHelper);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.mRoot.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (!this.mLoggedHardwareRender) {
            MamlLog.m17850d(LOG_TAG, "canvas hardware render: " + canvas.isHardwareAccelerated());
            this.mLoggedHardwareRender = true;
        }
        if (this.mScale == 0.0f) {
            this.mRoot.render(canvas);
            return;
        }
        int iSave = canvas.save();
        float f2 = this.mScale;
        canvas.scale(f2, f2, this.mPivotX, this.mPivotY);
        this.mRoot.render(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.onHover(motionEvent);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            accessibilityNodeInfo.setText(screenElementRoot.getRawAttr("accessibilityText"));
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Variables variables = this.mRoot.getContext().mVariables;
        variables.put(VariableNames.VARIABLE_VIEW_WIDTH, (i4 - i2) / this.mRoot.getScale());
        variables.put(VariableNames.VARIABLE_VIEW_HEIGHT, (i5 - i3) / this.mRoot.getScale());
        Object parent = getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            i2 += view.getLeft() - view.getScrollX();
            i3 += view.getTop() - view.getScrollY();
            parent = view.getParent();
        }
        variables.put(VariableNames.VARIABLE_VIEW_X, i2 / this.mRoot.getScale());
        variables.put(VariableNames.VARIABLE_VIEW_Y, i3 / this.mRoot.getScale());
        this.mRoot.requestUpdate();
    }

    public void onPause() {
        this.mPaused = true;
        this.mRoot.selfPause();
    }

    public void onResume() {
        this.mPaused = false;
        this.mRoot.selfResume();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            boolean zNeedDisallowInterceptTouchEvent = screenElementRoot.needDisallowInterceptTouchEvent();
            if (this.mNeedDisallowInterceptTouchEvent != zNeedDisallowInterceptTouchEvent) {
                getParent().requestDisallowInterceptTouchEvent(zNeedDisallowInterceptTouchEvent);
                this.mNeedDisallowInterceptTouchEvent = zNeedDisallowInterceptTouchEvent;
            }
            this.mRoot.onTouch(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScale(float f2, int i2, int i3) {
        this.mScale = f2;
        this.mPivotX = i2;
        this.mPivotY = i3;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 0) {
            onResume();
        } else if (i2 == 4 || i2 == 8) {
            onPause();
        }
    }

    public void cleanUp(boolean z2) {
        this.mRoot.setKeepResource(z2);
        setOnTouchListener(null);
        this.mRoot.detachFromVsync();
        this.mRoot.selfFinish();
        if (!z2) {
            removeAccessHelperRef();
        }
        if (Utils.onMuiltDisplayType2()) {
            return;
        }
        Utils.triggerGC();
    }

    @Deprecated
    public MiAdvancedView(Context context, ScreenElementRoot screenElementRoot, RenderThread renderThread) {
        this(context, screenElementRoot);
    }
}
