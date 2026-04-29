package com.miui.maml.shader;

import android.graphics.Shader;
import com.miui.maml.ScreenElementRoot;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public final class ShadersElement {
    public static final String FILL_TAG_NAME = "FillShaders";
    public static final String STROKE_TAG_NAME = "StrokeShaders";
    private ShaderElement mShaderElement;

    public ShadersElement(Element element, ScreenElementRoot screenElementRoot) {
        loadShaderElements(element, screenElementRoot);
    }

    private void loadShaderElements(Element element, ScreenElementRoot screenElementRoot) {
        NodeList childNodes = element.getChildNodes();
        for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
            Node nodeItem = childNodes.item(i2);
            if (nodeItem.getNodeType() == 1) {
                Element element2 = (Element) nodeItem;
                String tagName = element2.getTagName();
                if (tagName.equalsIgnoreCase(LinearGradientElement.TAG_NAME)) {
                    this.mShaderElement = new LinearGradientElement(element2, screenElementRoot);
                } else if (tagName.equalsIgnoreCase(RadialGradientElement.TAG_NAME)) {
                    this.mShaderElement = new RadialGradientElement(element2, screenElementRoot);
                } else if (tagName.equalsIgnoreCase(SweepGradientElement.TAG_NAME)) {
                    this.mShaderElement = new SweepGradientElement(element2, screenElementRoot);
                } else if (tagName.equalsIgnoreCase(BitmapShaderElement.TAG_NAME)) {
                    this.mShaderElement = new BitmapShaderElement(element2, screenElementRoot);
                }
                if (this.mShaderElement != null) {
                    return;
                }
            }
        }
    }

    public Shader getShader() {
        ShaderElement shaderElement = this.mShaderElement;
        if (shaderElement != null) {
            return shaderElement.getShader();
        }
        return null;
    }

    public void updateShader() {
        ShaderElement shaderElement = this.mShaderElement;
        if (shaderElement != null) {
            shaderElement.updateShader();
        }
    }
}
