package com.miui.maml.elements;

import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.WindowManager;
import com.miui.maml.CommandTrigger;
import com.miui.maml.CommandTriggers;
import com.miui.maml.RendererController;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.util.MamlLog;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class GLLayerScreenElement extends ViewHolderScreenElement {
    private static final String LOG_TAG = "MAML GLLayerScreenElement";
    public static final String TAG_NAME = "GLLayer";
    private IndexedVariable mCanvasVar;
    private IndexedVariable mHVar;
    private WindowManager.LayoutParams mLayoutParams;
    private CommandTrigger mOnSurfaceChangeCommands;
    private CommandTrigger mOnSurfaceCreateCommands;
    private CommandTrigger mOnSurfaceDrawCommands;
    private GLSurfaceView mView;
    private IndexedVariable mViewVar;
    private IndexedVariable mWVar;

    private class GLRenderer implements GLSurfaceView.Renderer {
        private GLRenderer() {
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            if (GLLayerScreenElement.this.mOnSurfaceDrawCommands != null) {
                GLLayerScreenElement.this.mCanvasVar.set(gl10);
                GLLayerScreenElement.this.mOnSurfaceDrawCommands.perform();
                GLLayerScreenElement.this.mCanvasVar.set((Object) null);
            }
            RendererController rendererController = GLLayerScreenElement.this.mController;
            if (rendererController != null) {
                rendererController.doneRender();
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            if (GLLayerScreenElement.this.mOnSurfaceChangeCommands != null) {
                GLLayerScreenElement.this.mCanvasVar.set(gl10);
                GLLayerScreenElement.this.mWVar.set(i2);
                GLLayerScreenElement.this.mHVar.set(i3);
                GLLayerScreenElement.this.mOnSurfaceChangeCommands.perform();
                GLLayerScreenElement.this.mCanvasVar.set((Object) null);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            if (GLLayerScreenElement.this.mOnSurfaceCreateCommands != null) {
                GLLayerScreenElement.this.mCanvasVar.set(gl10);
                GLLayerScreenElement.this.mOnSurfaceCreateCommands.perform();
                GLLayerScreenElement.this.mCanvasVar.set((Object) null);
            }
        }
    }

    private class ProxyListener extends RendererController.EmptyListener {
        private ProxyListener() {
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.IRenderable
        public void doRender() {
            GLLayerScreenElement.this.mView.requestRender();
        }

        @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
        public void forceUpdate() {
            GLLayerScreenElement.this.mRoot.getRendererController().forceUpdate();
        }

        @Override // com.miui.maml.RendererController.EmptyListener, com.miui.maml.RendererController.Listener
        public void tick(long j2) {
        }

        @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
        public void triggerUpdate() {
            GLLayerScreenElement.this.mRoot.getRendererController().triggerUpdate();
        }
    }

    public GLLayerScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        load(element);
    }

    private void load(Element element) {
        this.mView = new GLSurfaceView(this.mRoot.getContext().mContext);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams((int) this.mRoot.getWidth(), (int) this.mRoot.getHeight());
        this.mLayoutParams = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 256;
        this.mView.setRenderer(new GLRenderer());
        this.mView.setRenderMode(this.mController != null ? 0 : 1);
        CommandTriggers commandTriggers = this.mTriggers;
        if (commandTriggers != null) {
            this.mOnSurfaceCreateCommands = commandTriggers.find("create");
            this.mOnSurfaceChangeCommands = this.mTriggers.find("change");
            this.mOnSurfaceDrawCommands = this.mTriggers.find("draw");
        }
        if (this.mOnSurfaceDrawCommands == null) {
            MamlLog.m17851e("GLLayerScreenElement", "no draw commands.");
        }
        Variables variables = getVariables();
        this.mCanvasVar = new IndexedVariable("__objGLCanvas", variables, false);
        this.mViewVar = new IndexedVariable("__objGLView", variables, false);
        this.mWVar = new IndexedVariable("__w", variables, true);
        this.mHVar = new IndexedVariable("__h", variables, true);
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        doTickSelf(j2);
        updateView();
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement
    protected View getView() {
        return this.mView;
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement, com.miui.maml.elements.ElementGroupRC, com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        this.mViewVar.set(this.mView);
        super.init();
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement, com.miui.maml.elements.ElementGroupRC
    protected void onControllerCreated(RendererController rendererController) {
        rendererController.setListener(new ProxyListener());
    }
}
