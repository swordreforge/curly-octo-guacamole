package miuix.animation.controller;

import java.lang.reflect.Array;
import miuix.animation.IAnimTarget;
import miuix.animation.ValueTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.FloatProperty;
import miuix.animation.property.IIntValueProperty;
import miuix.animation.property.IntValueProperty;
import miuix.animation.property.ValueProperty;
import miuix.animation.utils.EaseManager;

/* JADX INFO: loaded from: classes3.dex */
class StateHelper {
    static final ValueProperty DEFAULT_PROPERTY = new ValueProperty("defaultProperty");
    static final IntValueProperty DEFAULT_INT_PROPERTY = new IntValueProperty("defaultIntProperty");

    StateHelper() {
    }

    private boolean addConfigToLink(AnimConfigLink animConfigLink, Object obj) {
        if (obj instanceof AnimConfig) {
            animConfigLink.add((AnimConfig) obj, new boolean[0]);
            return true;
        }
        if (obj instanceof AnimConfigLink) {
            animConfigLink.add((AnimConfigLink) obj, new boolean[0]);
        }
        return false;
    }

    private int addProperty(IAnimTarget iAnimTarget, AnimState animState, FloatProperty floatProperty, int i2, Object... objArr) {
        Object propertyValue;
        if (floatProperty == null || (propertyValue = getPropertyValue(i2, objArr)) == null || !addPropertyValue(animState, floatProperty, propertyValue)) {
            return 0;
        }
        return setInitVelocity(iAnimTarget, floatProperty, i2 + 1, objArr) ? 2 : 1;
    }

    private boolean addPropertyValue(AnimState animState, FloatProperty floatProperty, Object obj) {
        if (!(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double)) {
            return false;
        }
        if (floatProperty instanceof IIntValueProperty) {
            animState.add(floatProperty, toInt(obj, r0));
            return true;
        }
        animState.add(floatProperty, toFloat(obj, r0));
        return true;
    }

    private boolean checkAndSetAnimConfig(AnimConfigLink animConfigLink, Object obj) {
        if ((obj instanceof TransitionListener) || (obj instanceof EaseManager.EaseStyle)) {
            setTempConfig(animConfigLink.getHead(), obj);
            return true;
        }
        if (!obj.getClass().isArray()) {
            return addConfigToLink(animConfigLink, obj);
        }
        int length = Array.getLength(obj);
        boolean z2 = false;
        for (int i2 = 0; i2 < length; i2++) {
            z2 = addConfigToLink(animConfigLink, Array.get(obj, i2)) || z2;
        }
        return z2;
    }

    private FloatProperty getProperty(IAnimTarget iAnimTarget, Object obj, Object obj2) {
        if (obj instanceof FloatProperty) {
            return (FloatProperty) obj;
        }
        if ((obj instanceof String) && (iAnimTarget instanceof ValueTarget)) {
            return ((ValueTarget) iAnimTarget).createProperty((String) obj, obj2 != null ? obj2.getClass() : null);
        }
        if (obj instanceof Float) {
            return DEFAULT_PROPERTY;
        }
        return null;
    }

    private Object getPropertyValue(int i2, Object... objArr) {
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    private boolean isDefaultProperty(FloatProperty floatProperty) {
        return floatProperty == DEFAULT_PROPERTY || floatProperty == DEFAULT_INT_PROPERTY;
    }

    private boolean setInitVelocity(IAnimTarget iAnimTarget, FloatProperty floatProperty, int i2, Object... objArr) {
        if (i2 >= objArr.length) {
            return false;
        }
        if (!(objArr[i2] instanceof Float)) {
            return false;
        }
        iAnimTarget.setVelocity(floatProperty, ((Float) r5).floatValue());
        return true;
    }

    private int setPropertyAndValue(IAnimTarget iAnimTarget, AnimState animState, AnimConfigLink animConfigLink, Object obj, Object obj2, int i2, Object... objArr) {
        int iAddProperty;
        FloatProperty property;
        if (checkAndSetAnimConfig(animConfigLink, obj) || (property = getProperty(iAnimTarget, obj, obj2)) == null) {
            iAddProperty = 0;
        } else {
            if (!isDefaultProperty(property)) {
                i2++;
            }
            iAddProperty = addProperty(iAnimTarget, animState, property, i2, objArr);
        }
        return iAddProperty > 0 ? i2 + iAddProperty : i2 + 1;
    }

    private void setTempConfig(AnimConfig animConfig, Object obj) {
        if (obj instanceof TransitionListener) {
            animConfig.addListeners((TransitionListener) obj);
        } else if (obj instanceof EaseManager.EaseStyle) {
            animConfig.setEase((EaseManager.EaseStyle) obj);
        }
    }

    private float toFloat(Object obj, boolean z2) {
        return z2 ? ((Integer) obj).intValue() : ((Float) obj).floatValue();
    }

    private int toInt(Object obj, boolean z2) {
        return z2 ? ((Integer) obj).intValue() : (int) ((Float) obj).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [miuix.animation.controller.StateHelper] */
    void parse(IAnimTarget iAnimTarget, AnimState animState, AnimConfigLink animConfigLink, Object... objArr) {
        if (objArr.length == 0) {
            return;
        }
        ?? Equals = objArr[0].equals(animState.getTag());
        while (true) {
            ?? propertyAndValue = Equals;
            while (propertyAndValue < objArr.length) {
                Object obj = objArr[propertyAndValue];
                Equals = propertyAndValue + 1;
                Object obj2 = Equals < objArr.length ? objArr[Equals] : null;
                if (!(obj instanceof String) || !(obj2 instanceof String)) {
                    propertyAndValue = setPropertyAndValue(iAnimTarget, animState, animConfigLink, obj, obj2, propertyAndValue, objArr);
                }
            }
            return;
        }
    }
}
