package com.miui.maml.elements;

import com.android.thememanager.controller.local.qrj;
import com.miui.maml.RendererController;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.util.Utils;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ElementGroupRC extends ElementGroup {
    protected RendererController mController;
    private float mFrameRate;

    public ElementGroupRC(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        float attrAsFloat = Utils.getAttrAsFloat(element, qrj.f57924fn3e, 0.0f);
        this.mFrameRate = attrAsFloat;
        if (attrAsFloat >= 0.0f) {
            RendererController rendererController = new RendererController();
            this.mController = rendererController;
            onControllerCreated(rendererController);
            this.mController.init();
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public RendererController getRendererController() {
        RendererController rendererController = this.mController;
        return rendererController != null ? rendererController : super.getRendererController();
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        requestFramerate(this.mFrameRate);
    }

    protected abstract void onControllerCreated(RendererController rendererController);
}
