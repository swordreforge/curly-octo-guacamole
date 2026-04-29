package miuix.animation.property;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import miuix.animation.utils.CommonUtils;
import miuix.animation.utils.FieldManager;

/* JADX INFO: loaded from: classes3.dex */
public class ValueTargetObject {
    private WeakReference<Object> mRef;
    private Object mTempObj;
    private FieldManager mFieldManager = new FieldManager();
    private Map<String, Object> mValueMap = new ConcurrentHashMap();

    public ValueTargetObject(Object obj) {
        if (CommonUtils.isBuiltInClass(obj.getClass())) {
            this.mTempObj = obj;
        } else {
            this.mRef = new WeakReference<>(obj);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == getClass()) {
            ValueTargetObject valueTargetObject = (ValueTargetObject) obj;
            Object obj2 = this.mTempObj;
            return obj2 != null ? Objects.equals(obj2, valueTargetObject.mTempObj) : Objects.equals(getRealObject(), valueTargetObject.getRealObject());
        }
        Object obj3 = this.mTempObj;
        if (obj3 != null) {
            return Objects.equals(obj3, obj);
        }
        Object realObject = getRealObject();
        if (realObject != null) {
            return realObject.equals(obj);
        }
        return false;
    }

    public <T> T getPropertyValue(String str, Class<T> cls) {
        Object realObject = getRealObject();
        if (realObject == null || this.mTempObj == realObject) {
            return (T) this.mValueMap.get(str);
        }
        T t2 = (T) this.mValueMap.get(str);
        return t2 != null ? t2 : (T) this.mFieldManager.getField(realObject, str, cls);
    }

    public Object getRealObject() {
        WeakReference<Object> weakReference = this.mRef;
        return weakReference != null ? weakReference.get() : this.mTempObj;
    }

    public int hashCode() {
        Object obj = this.mTempObj;
        if (obj != null) {
            return obj.hashCode();
        }
        Object realObject = getRealObject();
        if (realObject != null) {
            return realObject.hashCode();
        }
        return 0;
    }

    public boolean isValid() {
        return getRealObject() != null;
    }

    public <T> void setPropertyValue(String str, Class<T> cls, T t2) {
        Object realObject = getRealObject();
        if (realObject == null || this.mTempObj == realObject) {
            this.mValueMap.put(str, t2);
        } else if (this.mValueMap.containsKey(str) || !this.mFieldManager.setField(realObject, str, cls, t2)) {
            this.mValueMap.put(str, t2);
        }
    }

    public String toString() {
        return "ValueTargetObject{" + getRealObject() + "}";
    }
}
