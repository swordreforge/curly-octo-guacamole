package miuix.animation.utils;

import android.util.ArrayMap;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class FieldManager {
    static final String GET = "get";
    static final String SET = "set";
    Map<String, MethodInfo> mMethodMap = new ArrayMap();
    Map<String, FieldInfo> mFieldMap = new ArrayMap();

    static class FieldInfo {
        Field field;

        FieldInfo() {
        }
    }

    static class MethodInfo {
        Method method;

        MethodInfo() {
        }
    }

    static Field getFieldByType(Object obj, String str, Class<?> cls) {
        Field field;
        try {
            field = obj.getClass().getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        try {
            field.setAccessible(true);
        } catch (NoSuchFieldException unused2) {
            try {
                field = obj.getClass().getField(str);
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (field == null || field.getType() == cls) {
            return field;
        }
        return null;
    }

    static MethodInfo getMethod(Object obj, String str, Map<String, MethodInfo> map, Class<?>... clsArr) {
        MethodInfo methodInfo = map.get(str);
        if (methodInfo != null) {
            return methodInfo;
        }
        MethodInfo methodInfo2 = new MethodInfo();
        methodInfo2.method = getMethod(obj, str, clsArr);
        map.put(str, methodInfo2);
        return methodInfo2;
    }

    static String getMethodName(String str, String str2) {
        return str2 + Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    static <T> T getValueByField(Object obj, Field field) {
        try {
            return (T) field.get(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    static <T> T invokeMethod(Object obj, Method method, Object... objArr) {
        if (method == null) {
            return null;
        }
        try {
            return (T) method.invoke(obj, objArr);
        } catch (Exception e2) {
            Log.d(CommonUtils.TAG, "ValueProperty.invokeMethod failed, " + method.getName(), e2);
            return null;
        }
    }

    static <T> T retToClz(Object obj, Class<T> cls) {
        if (!(obj instanceof Number)) {
            return null;
        }
        Number number = (Number) obj;
        if (cls == Float.class || cls == Float.TYPE) {
            return (T) Float.valueOf(number.floatValue());
        }
        if (cls == Integer.class || cls == Integer.TYPE) {
            return (T) Integer.valueOf(number.intValue());
        }
        throw new IllegalArgumentException("getPropertyValue, clz must be float or int instead of " + cls);
    }

    static <T> void setValueByField(Object obj, Field field, T t2) {
        try {
            field.set(obj, t2);
        } catch (Exception unused) {
        }
    }

    public synchronized <T> T getField(Object obj, String str, Class<T> cls) {
        if (obj != null && str != null) {
            if (str.length() != 0) {
                MethodInfo method = this.mMethodMap.get(str);
                if (method == null) {
                    method = getMethod(obj, getMethodName(str, GET), this.mMethodMap, new Class[0]);
                }
                Method method2 = method.method;
                if (method2 != null) {
                    return (T) retToClz(invokeMethod(obj, method2, new Object[0]), cls);
                }
                FieldInfo field = this.mFieldMap.get(str);
                if (field == null) {
                    field = getField(obj, str, cls, this.mFieldMap);
                }
                Field field2 = field.field;
                if (field2 == null) {
                    return null;
                }
                return (T) getValueByField(obj, field2);
            }
        }
        return null;
    }

    public synchronized <T> boolean setField(Object obj, String str, Class<T> cls, T t2) {
        if (obj != null && str != null) {
            if (str.length() != 0) {
                MethodInfo method = this.mMethodMap.get(str);
                if (method == null) {
                    method = getMethod(obj, getMethodName(str, SET), this.mMethodMap, cls);
                }
                Method method2 = method.method;
                if (method2 != null) {
                    invokeMethod(obj, method2, t2);
                    return true;
                }
                FieldInfo field = this.mFieldMap.get(str);
                if (field == null) {
                    field = getField(obj, str, cls, this.mFieldMap);
                }
                Field field2 = field.field;
                if (field2 == null) {
                    return false;
                }
                setValueByField(obj, field2, t2);
                return true;
            }
        }
        return false;
    }

    static Method getMethod(Object obj, String str, Class<?>... clsArr) {
        try {
            try {
                Method declaredMethod = obj.getClass().getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                return obj.getClass().getMethod(str, clsArr);
            }
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    static FieldInfo getField(Object obj, String str, Class<?> cls, Map<String, FieldInfo> map) {
        FieldInfo fieldInfo = map.get(str);
        if (fieldInfo != null) {
            return fieldInfo;
        }
        FieldInfo fieldInfo2 = new FieldInfo();
        fieldInfo2.field = getFieldByType(obj, str, cls);
        map.put(str, fieldInfo2);
        return fieldInfo2;
    }
}
