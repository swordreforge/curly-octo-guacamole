package com.miui.maml.elements;

import com.miui.maml.ScreenElementRoot;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class AutoScaleElementGroup extends ElementGroup {
    public static final String TAG_NAME = "AutoScaleGroup";
    private float mInitRawHeight;
    private float mInitRawWidth;

    public AutoScaleElementGroup(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getScaleX() {
        float widthRaw = getWidthRaw();
        float f2 = this.mInitRawWidth;
        return (f2 <= 0.0f || widthRaw <= 0.0f) ? super.getScaleX() : (widthRaw / f2) * super.getScaleX();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getScaleY() {
        float heightRaw = getHeightRaw();
        float f2 = this.mInitRawHeight;
        return (f2 <= 0.0f || heightRaw <= 0.0f) ? super.getScaleY() : (heightRaw / f2) * super.getScaleY();
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        this.mInitRawWidth = getWidthRaw();
        this.mInitRawHeight = getHeightRaw();
    }
}
