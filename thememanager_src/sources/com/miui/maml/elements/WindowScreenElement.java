package com.miui.maml.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.miui.maml.RendererController;
import com.miui.maml.ScreenElementRoot;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class WindowScreenElement extends ElementGroupRC {
    public static final String TAG_NAME = "Window";
    private WindowManager.LayoutParams mLayoutParams;
    private WindowView mView;
    private boolean mViewAdded;
    private Context mWindowContext;
    private WindowManager mWindowManager;

    private class ProxyListener extends RendererController.EmptyListener {
        private ProxyListener() {
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.IRenderable
        public void doRender() {
            WindowScreenElement.this.mView.postInvalidate();
        }

        @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
        public void forceUpdate() {
            WindowScreenElement.this.mRoot.getRendererController().triggerUpdate();
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.Listener
        public void onHover(MotionEvent motionEvent) {
            WindowScreenElement.this.onHover(motionEvent);
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.Listener
        public void onTouch(MotionEvent motionEvent) {
            WindowScreenElement.this.onTouch(motionEvent);
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.Listener
        public void tick(long j2) {
            WindowScreenElement.this.doTick(j2);
        }

        @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
        public void triggerUpdate() {
            WindowScreenElement.this.mRoot.getRendererController().triggerUpdate();
        }
    }

    private class WindowView extends View {
        public WindowView(Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            WindowScreenElement.this.doRenderWithTranslation(canvas);
            WindowScreenElement.this.mController.doneRender();
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            WindowScreenElement.this.getRoot().onHover(motionEvent);
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            WindowScreenElement.this.getRoot().onTouch(motionEvent);
            return super.onTouchEvent(motionEvent);
        }
    }

    public WindowScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mWindowContext = screenElementRoot.getContext().mContext;
        this.mView = new WindowView(this.mWindowContext);
        this.mWindowManager = (WindowManager) this.mWindowContext.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams((int) screenElementRoot.getWidth(), (int) screenElementRoot.getHeight());
        this.mLayoutParams = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addView() {
        if (this.mViewAdded) {
            return;
        }
        this.mWindowManager.addView(this.mView, this.mLayoutParams);
        this.mViewAdded = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeView() {
        if (this.mViewAdded) {
            this.mWindowManager.removeView(this.mView);
            this.mViewAdded = false;
        }
    }

    @Override // com.miui.maml.elements.ElementGroupRC, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        if (isVisible()) {
            addView();
        }
    }

    @Override // com.miui.maml.elements.ElementGroupRC
    protected void onControllerCreated(RendererController rendererController) {
        rendererController.setListener(new ProxyListener());
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onVisibilityChange(final boolean z2) {
        getContext().getHandler().post(new Runnable() { // from class: com.miui.maml.elements.WindowScreenElement.1
            @Override // java.lang.Runnable
            public void run() {
                if (z2) {
                    WindowScreenElement.this.addView();
                } else {
                    WindowScreenElement.this.removeView();
                }
            }
        });
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void render(Canvas canvas) {
    }
}
