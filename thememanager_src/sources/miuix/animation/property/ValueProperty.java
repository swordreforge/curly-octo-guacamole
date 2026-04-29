package miuix.animation.property;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class ValueProperty extends FloatProperty {
    private volatile String mName;

    public ValueProperty(String str) {
        super(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ValueProperty.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        return Objects.equals(getName(), ((ValueProperty) obj).getName());
    }

    @Override // android.util.Property
    public String getName() {
        return this.mName != null ? this.mName : super.getName();
    }

    @Override // miuix.animation.property.FloatProperty
    public float getValue(Object obj) {
        Float f2;
        if (!(obj instanceof ValueTargetObject) || (f2 = (Float) ((ValueTargetObject) obj).getPropertyValue(getName(), Float.TYPE)) == null) {
            return 0.0f;
        }
        return f2.floatValue();
    }

    public int hashCode() {
        return Objects.hash(getName());
    }

    public void setName(String str) {
        this.mName = str;
    }

    @Override // miuix.animation.property.FloatProperty
    public void setValue(Object obj, float f2) {
        if (obj instanceof ValueTargetObject) {
            ((ValueTargetObject) obj).setPropertyValue(getName(), Float.TYPE, Float.valueOf(f2));
        }
    }

    @Override // miuix.animation.property.FloatProperty
    public String toString() {
        return "ValueProperty{name=" + getName() + '}';
    }
}
