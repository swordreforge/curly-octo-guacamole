package com.miui.maml.animation;

import com.miui.maml.animation.BaseAnimation;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.folme.AnimatedProperty;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class SizeAnimation extends BaseAnimation {
    public static final String INNER_TAG_NAME = "Size";
    public static final String TAG_NAME = "SizeAnimation";
    private double mMaxH;
    private double mMaxW;

    public SizeAnimation(Element element, ScreenElement screenElement) {
        super(element, INNER_TAG_NAME, new String[]{AnimatedProperty.PROPERTY_NAME_W, AnimatedProperty.PROPERTY_NAME_H}, screenElement);
        for (BaseAnimation.AnimationItem animationItem : this.mItems) {
            if (animationItem.get(0) > this.mMaxW) {
                this.mMaxW = animationItem.get(0);
            }
            if (animationItem.get(1) > this.mMaxH) {
                this.mMaxH = animationItem.get(1);
            }
        }
    }

    public final double getHeight() {
        return getCurValue(1);
    }

    public final double getMaxHeight() {
        return this.mMaxH;
    }

    public final double getMaxWidth() {
        return this.mMaxW;
    }

    public final double getWidth() {
        return getCurValue(0);
    }
}
