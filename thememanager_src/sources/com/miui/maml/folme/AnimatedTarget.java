package com.miui.maml.folme;

import com.miui.maml.elements.AnimatedScreenElement;
import com.miui.maml.elements.GeometryScreenElement;
import com.miui.maml.elements.TextScreenElement;
import com.miui.maml.elements.VirtualAnimatedScreenElement;
import com.miui.maml.folme.AnimatedProperty;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.IAnimTarget;
import miuix.animation.ITargetCreator;
import miuix.animation.property.FloatProperty;

/* JADX INFO: loaded from: classes3.dex */
public class AnimatedTarget extends IAnimTarget<AnimatedScreenElement> {
    public static final String STATE_TAG_FROM = "from";
    public static final String STATE_TAG_SET_TO = "setTo";
    public static final String STATE_TAG_TO = "to";
    public static ITargetCreator<AnimatedScreenElement> sCreator;
    private WeakReference<AnimatedScreenElement> mElementRef;
    public static ConcurrentHashMap<FloatProperty, Integer> sPropertyTypeMap = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<Integer, FloatProperty> sPropertyMap = new ConcurrentHashMap<>();

    static {
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap = sPropertyTypeMap;
        AnimatedProperty animatedProperty = AnimatedProperty.f29473X;
        concurrentHashMap.put(animatedProperty, 0);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap2 = sPropertyTypeMap;
        AnimatedProperty animatedProperty2 = AnimatedProperty.f29474Y;
        concurrentHashMap2.put(animatedProperty2, 1);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap3 = sPropertyTypeMap;
        AnimatedProperty animatedProperty3 = AnimatedProperty.SCALE_X;
        concurrentHashMap3.put(animatedProperty3, 2);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap4 = sPropertyTypeMap;
        AnimatedProperty animatedProperty4 = AnimatedProperty.SCALE_Y;
        concurrentHashMap4.put(animatedProperty4, 3);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap5 = sPropertyTypeMap;
        AnimatedProperty animatedProperty5 = AnimatedProperty.ALPHA;
        concurrentHashMap5.put(animatedProperty5, 4);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap6 = sPropertyTypeMap;
        AnimatedProperty animatedProperty6 = AnimatedProperty.HEIGHT;
        concurrentHashMap6.put(animatedProperty6, 5);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap7 = sPropertyTypeMap;
        AnimatedProperty animatedProperty7 = AnimatedProperty.WIDTH;
        concurrentHashMap7.put(animatedProperty7, 6);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap8 = sPropertyTypeMap;
        AnimatedProperty animatedProperty8 = AnimatedProperty.ROTATION;
        concurrentHashMap8.put(animatedProperty8, 9);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap9 = sPropertyTypeMap;
        AnimatedProperty animatedProperty9 = AnimatedProperty.ROTATION_X;
        concurrentHashMap9.put(animatedProperty9, 10);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap10 = sPropertyTypeMap;
        AnimatedProperty animatedProperty10 = AnimatedProperty.ROTATION_Y;
        concurrentHashMap10.put(animatedProperty10, 11);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap11 = sPropertyTypeMap;
        AnimatedProperty.AnimatedColorProperty animatedColorProperty = AnimatedProperty.TINT_COLOR;
        concurrentHashMap11.put(animatedColorProperty, 1008);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap12 = sPropertyTypeMap;
        AnimatedProperty animatedProperty11 = AnimatedProperty.PIVOT_X;
        concurrentHashMap12.put(animatedProperty11, 1009);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap13 = sPropertyTypeMap;
        AnimatedProperty animatedProperty12 = AnimatedProperty.PIVOT_Y;
        concurrentHashMap13.put(animatedProperty12, 1010);
        ConcurrentHashMap<FloatProperty, Integer> concurrentHashMap14 = sPropertyTypeMap;
        AnimatedProperty animatedProperty13 = AnimatedProperty.PIVOT_Z;
        concurrentHashMap14.put(animatedProperty13, 1011);
        sPropertyMap.put(0, animatedProperty);
        sPropertyMap.put(1, animatedProperty2);
        sPropertyMap.put(2, animatedProperty3);
        sPropertyMap.put(3, animatedProperty4);
        sPropertyMap.put(4, animatedProperty5);
        sPropertyMap.put(5, animatedProperty6);
        sPropertyMap.put(6, animatedProperty7);
        sPropertyMap.put(9, animatedProperty8);
        sPropertyMap.put(10, animatedProperty9);
        sPropertyMap.put(11, animatedProperty10);
        sPropertyMap.put(1008, animatedColorProperty);
        sPropertyMap.put(1009, animatedProperty11);
        sPropertyMap.put(1010, animatedProperty12);
        sPropertyMap.put(1011, animatedProperty13);
        sCreator = new ITargetCreator<AnimatedScreenElement>() { // from class: com.miui.maml.folme.AnimatedTarget.1
            @Override // miuix.animation.ITargetCreator
            public IAnimTarget createTarget(AnimatedScreenElement animatedScreenElement) {
                return new AnimatedTarget(animatedScreenElement);
            }
        };
    }

    public AnimatedTarget(AnimatedScreenElement animatedScreenElement) {
        setMinVisibleChange(0.00390625f, TextScreenElement.TEXT_COLOR, GeometryScreenElement.FILL_COLOR, GeometryScreenElement.STROKE_COLOR, AnimatedProperty.TINT_COLOR, TextScreenElement.TEXT_SHADOW_COLOR, VirtualAnimatedScreenElement.COLOR_1, VirtualAnimatedScreenElement.COLOR_2);
        this.mElementRef = new WeakReference<>(animatedScreenElement);
    }

    @Override // miuix.animation.IAnimTarget
    public void clean() {
    }

    @Override // miuix.animation.IAnimTarget
    public void executeOnInitialized(Runnable runnable) {
        if (this.mElementRef.get() != null) {
            runnable.run();
        }
    }

    @Override // miuix.animation.IAnimTarget
    public float getDefaultMinVisible() {
        return 1.0f;
    }

    @Override // miuix.animation.IAnimTarget
    public void getLocationOnScreen(int[] iArr) {
        AnimatedScreenElement animatedScreenElement = this.mElementRef.get();
        if (animatedScreenElement == null || iArr == null || iArr.length <= 1) {
            return;
        }
        iArr[0] = (int) animatedScreenElement.getAbsoluteLeft();
        iArr[1] = (int) animatedScreenElement.getAbsoluteTop();
    }

    @Override // miuix.animation.IAnimTarget
    public boolean isValid() {
        return this.mElementRef.get() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // miuix.animation.IAnimTarget
    public AnimatedScreenElement getTargetObject() {
        return this.mElementRef.get();
    }
}
