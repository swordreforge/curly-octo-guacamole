package com.miui.maml.elements;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.thememanager.util.hb;
import com.miui.maml.RendererController;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.animation.BaseAnimation;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.MamlViewManager;
import java.util.ArrayList;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewHolderScreenElement extends ElementGroupRC {
    protected static final int LAYER_BOTTOM = 2;
    protected static final int LAYER_TOP = 1;
    private static final String LOG_TAG = "MAML ViewHolderScreenElement";
    private boolean mHardware;
    protected int mLayer;
    private ViewGroup.LayoutParams mLayoutParams;
    protected boolean mUpdatePosition;
    protected boolean mUpdateSize;
    protected boolean mUpdateTranslation;
    protected boolean mViewAdded;

    private class ProxyListener extends RendererController.EmptyListener {
        private ProxyListener() {
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.IRenderable
        public void doRender() {
            ViewHolderScreenElement.this.getView().postInvalidate();
        }

        @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
        public void forceUpdate() {
            ViewHolderScreenElement.this.mRoot.getRendererController().forceUpdate();
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.Listener
        public void tick(long j2) {
            ViewHolderScreenElement.this.doTickChildren(j2);
        }

        @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
        public void triggerUpdate() {
            ViewHolderScreenElement.this.mRoot.getRendererController().triggerUpdate();
        }
    }

    public ViewHolderScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mLayer = 2;
        String attr = getAttr(element, "layerType");
        this.mHardware = Boolean.parseBoolean(getAttr(element, "hardware"));
        this.mUpdatePosition = getAttrAsBoolean(getAttr(element, "updatePosition"), true);
        this.mUpdateSize = getAttrAsBoolean(getAttr(element, "updateSize"), true);
        this.mUpdateTranslation = getAttrAsBoolean(getAttr(element, "updateTranslation"), true);
        if (TextUtils.isEmpty(attr) || "top".equals(attr)) {
            this.mLayer = 1;
        } else if (hb.f61266fu4.equals(attr)) {
            this.mLayer = 2;
        }
        this.mLayoutParams = getLayoutParam();
    }

    private final void finishView() {
        View view;
        ViewParent parent;
        if (!this.mViewAdded || (view = getView()) == null || (parent = view.getParent()) == null || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
        this.mViewAdded = false;
        onViewRemoved(view);
    }

    private static boolean getAttrAsBoolean(String str, boolean z2) {
        return TextUtils.isEmpty(str) ? z2 : Boolean.parseBoolean(str);
    }

    private final void initView() {
        MamlViewManager viewManager;
        if (this.mViewAdded || (viewManager = this.mRoot.getViewManager()) == null) {
            return;
        }
        View view = getView();
        onUpdateView(view);
        if (this.mLayer == 2) {
            viewManager.addView(view, 0, this.mLayoutParams);
        } else {
            viewManager.addView(view, this.mLayoutParams);
        }
        if (this.mHardware) {
            view.setLayerType(2, null);
        }
        this.mViewAdded = true;
        onViewAdded(view);
    }

    private boolean updateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z2;
        int width = (int) getWidth();
        if (layoutParams.width != width) {
            layoutParams.width = width;
            z2 = true;
        } else {
            z2 = false;
        }
        int height = (int) getHeight();
        if (layoutParams.height == height) {
            return z2;
        }
        layoutParams.height = height;
        return true;
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        if (this.mController == null) {
            super.doTick(j2);
            getView().postInvalidate();
        } else {
            doTickSelf(j2);
        }
        updateView();
    }

    protected void doTickSelf(long j2) {
        ArrayList<BaseAnimation> arrayList = this.mAnimations;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAnimations.get(i2).tick(j2);
            }
        }
        int iEvaluateAlpha = evaluateAlpha();
        this.mAlpha = iEvaluateAlpha;
        this.mAlpha = iEvaluateAlpha >= 0 ? iEvaluateAlpha : 0;
        FunctionElement functionElement = this.mTickListener;
        if (functionElement != null) {
            functionElement.perform();
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        finishView();
    }

    protected ViewGroup.LayoutParams getLayoutParam() {
        return new FrameLayout.LayoutParams(-1, -1);
    }

    protected abstract View getView();

    @Override // com.miui.maml.elements.ElementGroupRC, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        if (this.mRoot.getViewManager() != null) {
            initView();
        } else {
            MamlLog.m17851e(LOG_TAG, "ViewManager must be set before init");
        }
    }

    protected boolean isViewAdded() {
        return this.mViewAdded;
    }

    @Override // com.miui.maml.elements.ElementGroupRC
    protected void onControllerCreated(RendererController rendererController) {
        rendererController.setListener(new ProxyListener());
    }

    protected void onUpdateView(View view) {
        if (this.mUpdatePosition) {
            view.setX(getAbsoluteLeft());
            view.setY(getAbsoluteTop());
        }
        if (this.mUpdateTranslation) {
            view.setPivotX(getPivotX());
            view.setPivotY(getPivotY());
            view.setRotation(getRotation());
            view.setRotationX(getRotationX());
            view.setRotationY(getRotationY());
            view.setAlpha(getAlpha() / 255.0f);
            view.setScaleX(getScaleX());
            view.setScaleY(getScaleY());
        }
        if (this.mUpdateSize && updateLayoutParams(this.mLayoutParams)) {
            view.setLayoutParams(this.mLayoutParams);
        }
    }

    protected void onViewAdded(View view) {
    }

    protected void onViewRemoved(View view) {
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onVisibilityChange(final boolean z2) {
        postInMainThread(new Runnable() { // from class: com.miui.maml.elements.ViewHolderScreenElement.2
            @Override // java.lang.Runnable
            public void run() {
                ViewHolderScreenElement.this.getView().setVisibility(z2 ? 0 : 4);
            }
        });
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void render(Canvas canvas) {
    }

    public void setHardwareLayer(final boolean z2) {
        postInMainThread(new Runnable() { // from class: com.miui.maml.elements.ViewHolderScreenElement.1
            @Override // java.lang.Runnable
            public void run() {
                ViewHolderScreenElement.this.getView().setLayerType(z2 ? 2 : 0, null);
            }
        });
    }

    protected void updateView() {
        if ((this.mUpdatePosition || this.mUpdateTranslation || this.mUpdateSize) && this.mViewAdded) {
            onUpdateView(getView());
        }
    }
}
