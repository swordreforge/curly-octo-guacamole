package miuix.animation.property;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ColorProperty<T> extends FloatProperty<T> implements IIntValueProperty<T> {
    private int mColorValue;

    public ColorProperty(String str) {
        super(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.mPropertyName.equals(((ColorProperty) obj).mPropertyName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getIntValue(T t2) {
        if (t2 instanceof ValueTargetObject) {
            this.mColorValue = ((Integer) ((ValueTargetObject) t2).getPropertyValue(getName(), Integer.TYPE)).intValue();
        }
        return this.mColorValue;
    }

    @Override // miuix.animation.property.FloatProperty
    public float getValue(T t2) {
        return 0.0f;
    }

    public int hashCode() {
        return Objects.hash(this.mPropertyName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setIntValue(T t2, int i2) {
        this.mColorValue = i2;
        if (t2 instanceof ValueTargetObject) {
            ((ValueTargetObject) t2).setPropertyValue(getName(), Integer.TYPE, Integer.valueOf(i2));
        }
    }

    @Override // miuix.animation.property.FloatProperty
    public void setValue(T t2, float f2) {
    }
}
