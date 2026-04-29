package com.miui.maml.elements;

import android.graphics.Canvas;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.folme.AnimatedPropertyType;
import com.miui.maml.folme.AnimatedTarget;
import com.miui.maml.folme.PropertyWrapper;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.property.FloatProperty;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class VirtualAnimatedScreenElement extends AnimatedScreenElement {
    public static final AnimatedProperty.AnimatedColorProperty COLOR_1;
    public static final AnimatedProperty.AnimatedColorProperty COLOR_2;
    public static final AnimatedProperty FLOAT_1;
    public static final AnimatedProperty FLOAT_2;
    public static final AnimatedProperty FLOAT_3;
    public static final AnimatedProperty FLOAT_4;
    private static final String PROPERTY_NAME_RESERVE_COLOR_1 = "color1";
    private static final String PROPERTY_NAME_RESERVE_COLOR_2 = "color1";
    private static final String PROPERTY_NAME_RESERVE_FLOAT_1 = "float1";
    private static final String PROPERTY_NAME_RESERVE_FLOAT_2 = "float2";
    private static final String PROPERTY_NAME_RESERVE_FLOAT_3 = "float3";
    private static final String PROPERTY_NAME_RESERVE_FLOAT_4 = "float4";
    public static final String TAG_NAME = "VirtualElement";
    private PropertyWrapper mColor1Property;
    private PropertyWrapper mColor2Property;
    private PropertyWrapper mFloat1Property;
    private PropertyWrapper mFloat2Property;
    private PropertyWrapper mFloat3Property;
    private PropertyWrapper mFloat4Property;

    static {
        String str = "color1";
        AnimatedProperty.AnimatedColorProperty animatedColorProperty = new AnimatedProperty.AnimatedColorProperty(str) { // from class: com.miui.maml.elements.VirtualAnimatedScreenElement.1
            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public int getIntValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    return (int) ((VirtualAnimatedScreenElement) animatedScreenElement).mColor1Property.getValue();
                }
                return 0;
            }

            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public void setIntValue(AnimatedScreenElement animatedScreenElement, int i2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mColor1Property.setValue(i2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mColor1Property.setVelocity(f2);
                }
            }
        };
        COLOR_1 = animatedColorProperty;
        AnimatedProperty.AnimatedColorProperty animatedColorProperty2 = new AnimatedProperty.AnimatedColorProperty(str) { // from class: com.miui.maml.elements.VirtualAnimatedScreenElement.2
            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public int getIntValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    return (int) ((VirtualAnimatedScreenElement) animatedScreenElement).mColor2Property.getValue();
                }
                return 0;
            }

            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public void setIntValue(AnimatedScreenElement animatedScreenElement, int i2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mColor2Property.setValue(i2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mColor2Property.setVelocity(f2);
                }
            }
        };
        COLOR_2 = animatedColorProperty2;
        AnimatedProperty animatedProperty = new AnimatedProperty(PROPERTY_NAME_RESERVE_FLOAT_1) { // from class: com.miui.maml.elements.VirtualAnimatedScreenElement.3
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    return (float) ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat1Property.getValue();
                }
                return 0.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat1Property.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat1Property.setVelocity(f2);
                }
            }
        };
        FLOAT_1 = animatedProperty;
        AnimatedProperty animatedProperty2 = new AnimatedProperty(PROPERTY_NAME_RESERVE_FLOAT_2) { // from class: com.miui.maml.elements.VirtualAnimatedScreenElement.4
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    return (float) ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat2Property.getValue();
                }
                return 0.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat2Property.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat2Property.setVelocity(f2);
                }
            }
        };
        FLOAT_2 = animatedProperty2;
        AnimatedProperty animatedProperty3 = new AnimatedProperty(PROPERTY_NAME_RESERVE_FLOAT_3) { // from class: com.miui.maml.elements.VirtualAnimatedScreenElement.5
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    return (float) ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat3Property.getValue();
                }
                return 0.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat3Property.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat3Property.setVelocity(f2);
                }
            }
        };
        FLOAT_3 = animatedProperty3;
        AnimatedProperty animatedProperty4 = new AnimatedProperty(PROPERTY_NAME_RESERVE_FLOAT_4) { // from class: com.miui.maml.elements.VirtualAnimatedScreenElement.6
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    return (float) ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat4Property.getValue();
                }
                return 0.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat4Property.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof VirtualAnimatedScreenElement) {
                    ((VirtualAnimatedScreenElement) animatedScreenElement).mFloat4Property.setVelocity(f2);
                }
            }
        };
        FLOAT_4 = animatedProperty4;
        AnimatedProperty.sPropertyNameMap.put("color1", animatedColorProperty);
        AnimatedProperty.sPropertyNameMap.put("color1", animatedColorProperty2);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_RESERVE_FLOAT_1, animatedProperty);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_RESERVE_FLOAT_2, animatedProperty2);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_RESERVE_FLOAT_3, animatedProperty3);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_RESERVE_FLOAT_4, animatedProperty4);
        ConcurrentHashMap<Integer, FloatProperty> concurrentHashMap = AnimatedTarget.sPropertyMap;
        Integer numValueOf = Integer.valueOf(AnimatedPropertyType.RESERVE_COLOR_1);
        concurrentHashMap.put(numValueOf, animatedColorProperty);
        ConcurrentHashMap<Integer, FloatProperty> concurrentHashMap2 = AnimatedTarget.sPropertyMap;
        Integer numValueOf2 = Integer.valueOf(AnimatedPropertyType.RESERVE_COLOR_2);
        concurrentHashMap2.put(numValueOf2, animatedColorProperty2);
        ConcurrentHashMap<Integer, FloatProperty> concurrentHashMap3 = AnimatedTarget.sPropertyMap;
        Integer numValueOf3 = Integer.valueOf(AnimatedPropertyType.RESERVE_FLOAT_1);
        concurrentHashMap3.put(numValueOf3, animatedProperty);
        ConcurrentHashMap<Integer, FloatProperty> concurrentHashMap4 = AnimatedTarget.sPropertyMap;
        Integer numValueOf4 = Integer.valueOf(AnimatedPropertyType.RESERVE_FLOAT_2);
        concurrentHashMap4.put(numValueOf4, animatedProperty2);
        ConcurrentHashMap<Integer, FloatProperty> concurrentHashMap5 = AnimatedTarget.sPropertyMap;
        Integer numValueOf5 = Integer.valueOf(AnimatedPropertyType.RESERVE_FLOAT_3);
        concurrentHashMap5.put(numValueOf5, animatedProperty3);
        ConcurrentHashMap<Integer, FloatProperty> concurrentHashMap6 = AnimatedTarget.sPropertyMap;
        Integer numValueOf6 = Integer.valueOf(AnimatedPropertyType.RESERVE_FLOAT_4);
        concurrentHashMap6.put(numValueOf6, animatedProperty4);
        AnimatedTarget.sPropertyTypeMap.put(animatedColorProperty, numValueOf);
        AnimatedTarget.sPropertyTypeMap.put(animatedColorProperty2, numValueOf2);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty, numValueOf3);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty2, numValueOf4);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty3, numValueOf5);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty4, numValueOf6);
    }

    public VirtualAnimatedScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mColor1Property = new PropertyWrapper(this.mName + ".color1", getVariables(), null, isInFolmeMode(), 0.0d);
        this.mColor2Property = new PropertyWrapper(this.mName + ".color2", getVariables(), null, isInFolmeMode(), 0.0d);
        this.mFloat1Property = new PropertyWrapper(this.mName + ".float1", getVariables(), null, isInFolmeMode(), 0.0d);
        this.mFloat2Property = new PropertyWrapper(this.mName + ".float2", getVariables(), null, isInFolmeMode(), 0.0d);
        this.mFloat3Property = new PropertyWrapper(this.mName + ".float3", getVariables(), null, isInFolmeMode(), 0.0d);
        this.mFloat4Property = new PropertyWrapper(this.mName + ".float4", getVariables(), null, isInFolmeMode(), 0.0d);
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected boolean isInFolmeMode() {
        return this.mHasName;
    }

    @Override // com.miui.maml.elements.ScreenElement
    public boolean isVisible() {
        return false;
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void tick(long j2) {
    }
}
