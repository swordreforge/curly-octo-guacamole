package miuix.animation;

import java.util.concurrent.atomic.AtomicInteger;
import miuix.animation.property.ColorProperty;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.IntValueProperty;
import miuix.animation.property.ValueProperty;
import miuix.animation.property.ValueTargetObject;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
public class ValueTarget extends IAnimTarget {
    private static final float DEFAULT_MIN_VALUE = 0.002f;
    static ITargetCreator sCreator = new ITargetCreator() { // from class: miuix.animation.ValueTarget.1
        @Override // miuix.animation.ITargetCreator
        public IAnimTarget createTarget(Object obj) {
            return new ValueTarget(obj);
        }
    };
    private AtomicInteger mMaxType;
    private ValueTargetObject mTargetObj;

    private boolean isPredefinedProperty(Object obj) {
        return (obj instanceof ValueProperty) || (obj instanceof ViewProperty) || (obj instanceof ColorProperty);
    }

    @Override // miuix.animation.IAnimTarget
    public void clean() {
    }

    public FloatProperty createProperty(String str, Class<?> cls) {
        return (cls == Integer.TYPE || cls == Integer.class) ? new IntValueProperty(str) : new ValueProperty(str);
    }

    @Override // miuix.animation.IAnimTarget
    public float getDefaultMinVisible() {
        return 0.002f;
    }

    public FloatProperty getFloatProperty(String str) {
        return createProperty(str, Float.TYPE);
    }

    public int getIntValue(String str) {
        return getIntValue(getIntValueProperty(str));
    }

    public IIntValueProperty getIntValueProperty(String str) {
        return (IIntValueProperty) createProperty(str, Integer.TYPE);
    }

    @Override // miuix.animation.IAnimTarget
    public float getMinVisibleChange(Object obj) {
        if (!(obj instanceof IIntValueProperty) || (obj instanceof ColorProperty)) {
            return super.getMinVisibleChange(obj);
        }
        return 1.0f;
    }

    @Override // miuix.animation.IAnimTarget
    public Object getTargetObject() {
        return this.mTargetObj;
    }

    public float getValue(String str) {
        return getValue(getFloatProperty(str));
    }

    public double getVelocity(String str) {
        return getVelocity(getFloatProperty(str));
    }

    @Override // miuix.animation.IAnimTarget
    public boolean isValid() {
        return this.mTargetObj.isValid();
    }

    public void setIntValue(String str, int i2) {
        setIntValue(getIntValueProperty(str), i2);
    }

    @Override // miuix.animation.IAnimTarget
    public void setValue(FloatProperty floatProperty, float f2) {
        if (isPredefinedProperty(floatProperty)) {
            this.mTargetObj.setPropertyValue(floatProperty.getName(), Float.TYPE, Float.valueOf(f2));
        } else {
            floatProperty.setValue(this.mTargetObj.getRealObject(), f2);
        }
    }

    public void setVelocity(String str, double d2) {
        setVelocity(getFloatProperty(str), d2);
    }

    public ValueTarget() {
        this(null);
    }

    @Override // miuix.animation.IAnimTarget
    public int getIntValue(IIntValueProperty iIntValueProperty) {
        if (!isPredefinedProperty(iIntValueProperty)) {
            return iIntValueProperty.getIntValue(this.mTargetObj.getRealObject());
        }
        Integer num = (Integer) this.mTargetObj.getPropertyValue(iIntValueProperty.getName(), Integer.TYPE);
        if (num == null) {
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }

    @Override // miuix.animation.IAnimTarget
    public float getValue(FloatProperty floatProperty) {
        if (!isPredefinedProperty(floatProperty)) {
            return floatProperty.getValue(this.mTargetObj.getRealObject());
        }
        Float f2 = (Float) this.mTargetObj.getPropertyValue(floatProperty.getName(), Float.TYPE);
        if (f2 == null) {
            return Float.MAX_VALUE;
        }
        return f2.floatValue();
    }

    @Override // miuix.animation.IAnimTarget
    public void setIntValue(IIntValueProperty iIntValueProperty, int i2) {
        if (isPredefinedProperty(iIntValueProperty)) {
            this.mTargetObj.setPropertyValue(iIntValueProperty.getName(), Integer.TYPE, Integer.valueOf(i2));
        } else {
            iIntValueProperty.setIntValue(this.mTargetObj.getRealObject(), i2);
        }
    }

    private ValueTarget(Object obj) {
        this.mMaxType = new AtomicInteger(1000);
        this.mTargetObj = new ValueTargetObject(obj == null ? Integer.valueOf(getId()) : obj);
    }

    public void setValue(String str, float f2) {
        setValue(getFloatProperty(str), f2);
    }
}
