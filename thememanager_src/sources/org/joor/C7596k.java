package org.joor;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: org.joor.k */
/* JADX INFO: compiled from: Reflect.java */
/* JADX INFO: loaded from: classes4.dex */
public class C7596k {

    /* JADX INFO: renamed from: k */
    private final Class<?> f43869k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Object f94317toq;

    /* JADX INFO: renamed from: org.joor.k$k */
    /* JADX INFO: compiled from: Reflect.java */
    class k implements InvocationHandler {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f43870k;

        k(boolean z2) {
            this.f43870k = z2;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            try {
                return C7596k.fu4(C7596k.this.f43869k, C7596k.this.f94317toq).m27903s(name, objArr).ki();
            } catch (org.joor.toq e2) {
                if (this.f43870k) {
                    Map map = (Map) C7596k.this.f94317toq;
                    int length = objArr == null ? 0 : objArr.length;
                    if (length == 0 && name.startsWith("get")) {
                        return map.get(C7596k.jp0y(name.substring(3)));
                    }
                    if (length == 0 && name.startsWith("is")) {
                        return map.get(C7596k.jp0y(name.substring(2)));
                    }
                    if (length == 1 && name.startsWith("set")) {
                        map.put(C7596k.jp0y(name.substring(3)), objArr[0]);
                        return null;
                    }
                }
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: org.joor.k$toq */
    /* JADX INFO: compiled from: Reflect.java */
    private static class toq {
        private toq() {
        }
    }

    private C7596k(Class<?> cls) {
        this(cls, cls);
    }

    public static C7596k a9(String str) throws org.joor.toq {
        return jk(m27894h(str));
    }

    private static Class<?> cdj(String str, ClassLoader classLoader) throws org.joor.toq {
        try {
            return Class.forName(str, true, classLoader);
        } catch (Exception e2) {
            throw new org.joor.toq(e2);
        }
    }

    private static Object d2ok(Object obj) {
        return obj instanceof C7596k ? ((C7596k) obj).ki() : obj;
    }

    private Method d3(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsOc = oc();
        for (Method method : clsOc.getMethods()) {
            if (fn3e(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : clsOc.getDeclaredMethods()) {
                if (fn3e(method2, str, clsArr)) {
                    return method2;
                }
            }
            clsOc = clsOc.getSuperclass();
        } while (clsOc != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + oc() + ".");
    }

    private static Class<?>[] eqxt(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            clsArr[i2] = obj == null ? toq.class : obj.getClass();
        }
        return clsArr;
    }

    private boolean fn3e(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && zurt(method.getParameterTypes(), clsArr);
    }

    public static C7596k fti(String str, ClassLoader classLoader) throws org.joor.toq {
        return jk(cdj(str, classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C7596k fu4(Class<?> cls, Object obj) {
        return new C7596k(cls, obj);
    }

    /* JADX INFO: renamed from: h */
    private static Class<?> m27894h(String str) throws org.joor.toq {
        try {
            return Class.forName(str);
        } catch (Exception e2) {
            throw new org.joor.toq(e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static <T> T m27895i(Class<T> cls) {
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Double.TYPE) {
            return (T) Double.valueOf(0.0d);
        }
        if (cls == Float.TYPE) {
            return (T) Float.valueOf(0.0f);
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        return null;
    }

    public static C7596k jk(Class<?> cls) {
        return new C7596k(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String jp0y(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            return str.toLowerCase();
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static Class<?> lvui(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    private static C7596k mcp(Method method, Object obj, Object... objArr) throws org.joor.toq {
        try {
            m27897n(method);
            if (method.getReturnType() != Void.TYPE) {
                return m27900z(method.invoke(obj, objArr));
            }
            method.invoke(obj, objArr);
            return m27900z(obj);
        } catch (Exception e2) {
            throw new org.joor.toq(e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public static <T extends AccessibleObject> T m27897n(T t2) {
        if (t2 == null) {
            return null;
        }
        if (t2 instanceof Member) {
            Member member = (Member) t2;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t2;
            }
        }
        if (!t2.isAccessible()) {
            t2.setAccessible(true);
        }
        return t2;
    }

    private Field n7h(String str) throws org.joor.toq {
        Class<?> clsOc = oc();
        try {
            return (Field) m27897n(clsOc.getField(str));
        } catch (NoSuchFieldException e2) {
            do {
                try {
                    return (Field) m27897n(clsOc.getDeclaredField(str));
                } catch (NoSuchFieldException unused) {
                    clsOc = clsOc.getSuperclass();
                    if (clsOc == null) {
                        throw new org.joor.toq(e2);
                    }
                }
            } while (clsOc == null);
            throw new org.joor.toq(e2);
        }
    }

    @Deprecated
    public static C7596k ni7(Class<?> cls) {
        return jk(cls);
    }

    @Deprecated
    public static C7596k o1t(String str) throws org.joor.toq {
        return a9(str);
    }

    /* JADX INFO: renamed from: t */
    private static C7596k m27899t(Constructor<?> constructor, Object... objArr) throws org.joor.toq {
        try {
            return fu4(constructor.getDeclaringClass(), ((Constructor) m27897n(constructor)).newInstance(objArr));
        } catch (Exception e2) {
            throw new org.joor.toq(e2);
        }
    }

    @Deprecated
    public static C7596k wvg(String str, ClassLoader classLoader) throws org.joor.toq {
        return fti(str, classLoader);
    }

    private Method x2(String str, Class<?>[] clsArr) throws NoSuchMethodException {
        Class<?> clsOc = oc();
        try {
            return clsOc.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    return clsOc.getDeclaredMethod(str, clsArr);
                } catch (NoSuchMethodException unused2) {
                    clsOc = clsOc.getSuperclass();
                }
            } while (clsOc != null);
            throw new NoSuchMethodException();
        }
    }

    /* JADX INFO: renamed from: z */
    public static C7596k m27900z(Object obj) {
        return new C7596k(obj == null ? Object.class : obj.getClass(), obj);
    }

    private boolean zurt(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr2.length; i2++) {
            if (clsArr2[i2] != toq.class && !lvui(clsArr[i2]).isAssignableFrom(lvui(clsArr2[i2]))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7596k) {
            return this.f94317toq.equals(((C7596k) obj).ki());
        }
        return false;
    }

    public <P> P f7l8(Class<P> cls, Class<?>... clsArr) {
        k kVar = new k(this.f94317toq instanceof Map);
        Class[] clsArr2 = new Class[clsArr.length + 1];
        clsArr2[0] = cls;
        System.arraycopy(clsArr, 0, clsArr2, 1, clsArr.length);
        return (P) Proxy.newProxyInstance(cls.getClassLoader(), clsArr2, kVar);
    }

    /* JADX INFO: renamed from: g */
    public <P> P m27901g(Class<P> cls) {
        return (P) f7l8(cls, new Class[0]);
    }

    public C7596k gvn7(String str, Object obj) throws org.joor.toq {
        try {
            Field fieldN7h = n7h(str);
            if ((fieldN7h.getModifiers() & 16) == 16) {
                try {
                    Field declaredField = Field.class.getDeclaredField("modifiers");
                    declaredField.setAccessible(true);
                    declaredField.setInt(fieldN7h, fieldN7h.getModifiers() & (-17));
                } catch (NoSuchFieldException unused) {
                }
            }
            fieldN7h.set(this.f94317toq, d2ok(obj));
            return this;
        } catch (Exception e2) {
            throw new org.joor.toq(e2);
        }
    }

    public int hashCode() {
        return this.f94317toq.hashCode();
    }

    public <T> T ki() {
        return (T) this.f94317toq;
    }

    public Map<String, C7596k> kja0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Class<?> clsOc = oc();
        do {
            for (Field field : clsOc.getDeclaredFields()) {
                if ((this.f43869k != this.f94317toq) ^ Modifier.isStatic(field.getModifiers())) {
                    String name = field.getName();
                    if (!linkedHashMap.containsKey(name)) {
                        linkedHashMap.put(name, qrj(name));
                    }
                }
            }
            clsOc = clsOc.getSuperclass();
        } while (clsOc != null);
        return linkedHashMap;
    }

    public C7596k ld6(Object... objArr) throws org.joor.toq {
        Class<?>[] clsArrEqxt = eqxt(objArr);
        try {
            return m27899t(oc().getDeclaredConstructor(clsArrEqxt), objArr);
        } catch (NoSuchMethodException e2) {
            for (Constructor<?> constructor : oc().getDeclaredConstructors()) {
                if (zurt(constructor.getParameterTypes(), clsArrEqxt)) {
                    return m27899t(constructor, objArr);
                }
            }
            throw new org.joor.toq(e2);
        }
    }

    public Class<?> oc() {
        return this.f43869k;
    }

    /* JADX INFO: renamed from: p */
    public C7596k m27902p() throws org.joor.toq {
        return ld6(new Object[0]);
    }

    public C7596k qrj(String str) throws org.joor.toq {
        try {
            Field fieldN7h = n7h(str);
            return fu4(fieldN7h.getType(), fieldN7h.get(this.f94317toq));
        } catch (Exception e2) {
            throw new org.joor.toq(e2);
        }
    }

    /* JADX INFO: renamed from: s */
    public C7596k m27903s(String str, Object... objArr) throws org.joor.toq {
        Class<?>[] clsArrEqxt = eqxt(objArr);
        try {
            try {
                return mcp(x2(str, clsArrEqxt), this.f94317toq, objArr);
            } catch (NoSuchMethodException e2) {
                throw new org.joor.toq(e2);
            }
        } catch (NoSuchMethodException unused) {
            return mcp(d3(str, clsArrEqxt), this.f94317toq, objArr);
        }
    }

    public <T> T t8r(String str) throws org.joor.toq {
        return (T) qrj(str).ki();
    }

    public String toString() {
        return String.valueOf(this.f94317toq);
    }

    /* JADX INFO: renamed from: y */
    public C7596k m27904y(String str) throws org.joor.toq {
        return m27903s(str, new Object[0]);
    }

    private C7596k(Class<?> cls, Object obj) {
        this.f43869k = cls;
        this.f94317toq = obj;
    }
}
