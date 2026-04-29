package miuix.internal.util;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: miuix.internal.util.p */
/* JADX INFO: compiled from: ReflectUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7168p {

    /* JADX INFO: renamed from: k */
    private static final String f40385k = "ReflectUtil";

    /* JADX INFO: renamed from: k */
    public static Object m25964k(Object obj, String str, Class<?>[] clsArr, Object... objArr) {
        if (obj == null) {
            return null;
        }
        try {
            return obj.getClass().getDeclaredMethod(str, clsArr).invoke(obj, objArr);
        } catch (Exception e2) {
            Log.e(f40385k, "Failed to call method:" + str, e2);
            return null;
        }
    }

    public static <T> T toq(Class<?> cls, Class<T> cls2, String str, Class<?>[] clsArr, Object... objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            return (T) declaredMethod.invoke(null, objArr);
        } catch (Exception e2) {
            Log.e(f40385k, "Failed to call static method:" + str, e2);
            return null;
        }
    }

    public static Class<?> zy(String str) {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            Log.e(f40385k, "Cant find class " + str, e2);
            return null;
        }
    }
}
