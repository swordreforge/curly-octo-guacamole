package miuix.animation.property;

import android.util.Property;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FloatProperty<T> extends Property<T, Float> {
    final String mPropertyName;

    public FloatProperty(String str) {
        super(Float.class, str);
        this.mPropertyName = str;
    }

    public abstract float getValue(T t2);

    public abstract void setValue(T t2, float f2);

    public String toString() {
        return getClass().getSimpleName() + "{mPropertyName='" + this.mPropertyName + "'}";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public Float get(T t2) {
        return t2 == null ? Float.valueOf(0.0f) : Float.valueOf(getValue(t2));
    }

    @Override // android.util.Property
    public final void set(T t2, Float f2) {
        if (t2 != null) {
            setValue(t2, f2.floatValue());
        }
    }
}
