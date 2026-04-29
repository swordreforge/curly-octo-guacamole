package com.miui.maml.folme;

import com.miui.maml.elements.AnimatedScreenElement;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnimatedProperty extends FloatProperty<AnimatedScreenElement> implements IAnimatedProperty<AnimatedScreenElement> {
    public static final AnimatedProperty ALPHA;
    public static final AnimatedProperty HEIGHT;
    public static final AnimatedProperty PIVOT_X;
    public static final AnimatedProperty PIVOT_Y;
    public static final AnimatedProperty PIVOT_Z;
    public static final String PROPERTY_NAME_ALPHA = "alpha";
    public static final String PROPERTY_NAME_H = "h";
    public static final String PROPERTY_NAME_PIVOT_X = "pivotX";
    public static final String PROPERTY_NAME_PIVOT_Y = "pivotY";
    public static final String PROPERTY_NAME_PIVOT_Z = "pivotZ";
    public static final String PROPERTY_NAME_ROTATION = "rotation";
    public static final String PROPERTY_NAME_ROTATION_X = "rotationX";
    public static final String PROPERTY_NAME_ROTATION_Y = "rotationY";
    public static final String PROPERTY_NAME_ROTATION_Z = "rotationZ";
    public static final String PROPERTY_NAME_SCALE_X = "scaleX";
    public static final String PROPERTY_NAME_SCALE_Y = "scaleY";
    public static final String PROPERTY_NAME_TINT_COLOR = "tintColor";
    public static final String PROPERTY_NAME_W = "w";
    public static final String PROPERTY_NAME_X = "x";
    public static final String PROPERTY_NAME_Y = "y";
    public static final AnimatedProperty ROTATION;
    public static final AnimatedProperty ROTATION_X;
    public static final AnimatedProperty ROTATION_Y;
    public static final AnimatedProperty ROTATION_Z;
    public static final AnimatedProperty SCALE_X;
    public static final AnimatedProperty SCALE_Y;
    public static final AnimatedColorProperty TINT_COLOR;
    public static final AnimatedProperty WIDTH;

    /* JADX INFO: renamed from: X */
    public static final AnimatedProperty f29473X;

    /* JADX INFO: renamed from: Y */
    public static final AnimatedProperty f29474Y;
    public static ConcurrentHashMap<String, FloatProperty> sPropertyNameMap = new ConcurrentHashMap<>();

    public static abstract class AnimatedColorProperty extends ColorProperty<AnimatedScreenElement> implements IAnimatedProperty<AnimatedScreenElement> {
        public AnimatedColorProperty(String str) {
            super(str);
        }
    }

    static {
        AnimatedProperty animatedProperty = new AnimatedProperty(PROPERTY_NAME_X) { // from class: com.miui.maml.folme.AnimatedProperty.1
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mXProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mXProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mXProperty.setVelocity(f2);
            }
        };
        f29473X = animatedProperty;
        AnimatedProperty animatedProperty2 = new AnimatedProperty(PROPERTY_NAME_Y) { // from class: com.miui.maml.folme.AnimatedProperty.2
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mYProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mYProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mYProperty.setVelocity(f2);
            }
        };
        f29474Y = animatedProperty2;
        AnimatedProperty animatedProperty3 = new AnimatedProperty("scaleX") { // from class: com.miui.maml.folme.AnimatedProperty.3
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mScaleXProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mScaleXProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mScaleXProperty.setVelocity(f2);
            }
        };
        SCALE_X = animatedProperty3;
        AnimatedProperty animatedProperty4 = new AnimatedProperty("scaleY") { // from class: com.miui.maml.folme.AnimatedProperty.4
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mScaleYProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mScaleYProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mScaleYProperty.setVelocity(f2);
            }
        };
        SCALE_Y = animatedProperty4;
        AnimatedProperty animatedProperty5 = new AnimatedProperty("rotation") { // from class: com.miui.maml.folme.AnimatedProperty.5
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mRotationProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationProperty.setVelocity(f2);
            }
        };
        ROTATION = animatedProperty5;
        AnimatedProperty animatedProperty6 = new AnimatedProperty("rotationX") { // from class: com.miui.maml.folme.AnimatedProperty.6
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mRotationXProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationXProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationXProperty.setVelocity(f2);
            }
        };
        ROTATION_X = animatedProperty6;
        AnimatedProperty animatedProperty7 = new AnimatedProperty("rotationY") { // from class: com.miui.maml.folme.AnimatedProperty.7
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mRotationYProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationYProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationYProperty.setVelocity(f2);
            }
        };
        ROTATION_Y = animatedProperty7;
        AnimatedProperty animatedProperty8 = new AnimatedProperty("rotationZ") { // from class: com.miui.maml.folme.AnimatedProperty.8
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mRotationZProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationZProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mRotationZProperty.setVelocity(f2);
            }
        };
        ROTATION_Z = animatedProperty8;
        AnimatedProperty animatedProperty9 = new AnimatedProperty(PROPERTY_NAME_H) { // from class: com.miui.maml.folme.AnimatedProperty.9
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mHeightProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mHeightProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mHeightProperty.setVelocity(f2);
            }
        };
        HEIGHT = animatedProperty9;
        AnimatedProperty animatedProperty10 = new AnimatedProperty(PROPERTY_NAME_W) { // from class: com.miui.maml.folme.AnimatedProperty.10
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mWidthProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mWidthProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mHeightProperty.setVelocity(f2);
            }
        };
        WIDTH = animatedProperty10;
        AnimatedProperty animatedProperty11 = new AnimatedProperty("alpha") { // from class: com.miui.maml.folme.AnimatedProperty.11
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mAlphaProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mAlphaProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mAlphaProperty.setVelocity(f2);
            }
        };
        ALPHA = animatedProperty11;
        AnimatedColorProperty animatedColorProperty = new AnimatedColorProperty(PROPERTY_NAME_TINT_COLOR) { // from class: com.miui.maml.folme.AnimatedProperty.12
            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public int getIntValue(AnimatedScreenElement animatedScreenElement) {
                return (int) animatedScreenElement.mTintColorProperty.getValue();
            }

            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public void setIntValue(AnimatedScreenElement animatedScreenElement, int i2) {
                animatedScreenElement.mTintColorProperty.setValue(i2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mTintColorProperty.setVelocity(f2);
            }
        };
        TINT_COLOR = animatedColorProperty;
        AnimatedProperty animatedProperty12 = new AnimatedProperty("pivotX") { // from class: com.miui.maml.folme.AnimatedProperty.13
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mPivotXProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mPivotXProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mPivotXProperty.setVelocity(f2);
            }
        };
        PIVOT_X = animatedProperty12;
        AnimatedProperty animatedProperty13 = new AnimatedProperty("pivotY") { // from class: com.miui.maml.folme.AnimatedProperty.14
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mPivotYProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mPivotYProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mPivotYProperty.setVelocity(f2);
            }
        };
        PIVOT_Y = animatedProperty13;
        AnimatedProperty animatedProperty14 = new AnimatedProperty(PROPERTY_NAME_PIVOT_Z) { // from class: com.miui.maml.folme.AnimatedProperty.15
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                return (float) animatedScreenElement.mPivotZProperty.getValue();
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mPivotZProperty.setValue(f2);
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                animatedScreenElement.mPivotZProperty.setVelocity(f2);
            }
        };
        PIVOT_Z = animatedProperty14;
        sPropertyNameMap.put(PROPERTY_NAME_X, animatedProperty);
        sPropertyNameMap.put(PROPERTY_NAME_Y, animatedProperty2);
        sPropertyNameMap.put("scaleX", animatedProperty3);
        sPropertyNameMap.put("scaleY", animatedProperty4);
        sPropertyNameMap.put("alpha", animatedProperty11);
        sPropertyNameMap.put(PROPERTY_NAME_H, animatedProperty9);
        sPropertyNameMap.put(PROPERTY_NAME_W, animatedProperty10);
        sPropertyNameMap.put("rotation", animatedProperty5);
        sPropertyNameMap.put("rotationX", animatedProperty6);
        sPropertyNameMap.put("rotationY", animatedProperty7);
        sPropertyNameMap.put("rotationZ", animatedProperty8);
        sPropertyNameMap.put(PROPERTY_NAME_TINT_COLOR, animatedColorProperty);
        sPropertyNameMap.put("pivotX", animatedProperty12);
        sPropertyNameMap.put("pivotY", animatedProperty13);
        sPropertyNameMap.put(PROPERTY_NAME_PIVOT_Z, animatedProperty14);
    }

    public AnimatedProperty(String str) {
        super(str);
    }

    public static FloatProperty getPropertyByName(String str) {
        return sPropertyNameMap.get(str);
    }
}
