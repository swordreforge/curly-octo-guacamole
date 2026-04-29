package androidx.lifecycle;

import androidx.lifecycle.kja0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ClassesInfoCache.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
final class zy {

    /* JADX INFO: renamed from: g */
    private static final int f5135g = 2;

    /* JADX INFO: renamed from: n */
    private static final int f5136n = 1;

    /* JADX INFO: renamed from: q */
    private static final int f5137q = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static zy f51604zy = new zy();

    /* JADX INFO: renamed from: k */
    private final Map<Class<?>, C0955k> f5138k = new HashMap();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f51605toq = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.zy$k */
    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    static class C0955k {

        /* JADX INFO: renamed from: k */
        final Map<kja0.toq, List<toq>> f5139k = new HashMap();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Map<toq, kja0.toq> f51606toq;

        C0955k(Map<toq, kja0.toq> map) {
            this.f51606toq = map;
            for (Map.Entry<toq, kja0.toq> entry : map.entrySet()) {
                kja0.toq value = entry.getValue();
                List<toq> arrayList = this.f5139k.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f5139k.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void toq(List<toq> list, InterfaceC0954z interfaceC0954z, kja0.toq toqVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m4498k(interfaceC0954z, toqVar, obj);
                }
            }
        }

        /* JADX INFO: renamed from: k */
        void m4497k(InterfaceC0954z interfaceC0954z, kja0.toq toqVar, Object obj) {
            toq(this.f5139k.get(toqVar), interfaceC0954z, toqVar, obj);
            toq(this.f5139k.get(kja0.toq.ON_ANY), interfaceC0954z, toqVar, obj);
        }
    }

    /* JADX INFO: compiled from: ClassesInfoCache.java */
    @Deprecated
    static final class toq {

        /* JADX INFO: renamed from: k */
        final int f5140k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Method f51607toq;

        toq(int i2, Method method) {
            this.f5140k = i2;
            this.f51607toq = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof toq)) {
                return false;
            }
            toq toqVar = (toq) obj;
            return this.f5140k == toqVar.f5140k && this.f51607toq.getName().equals(toqVar.f51607toq.getName());
        }

        public int hashCode() {
            return (this.f5140k * 31) + this.f51607toq.getName().hashCode();
        }

        /* JADX INFO: renamed from: k */
        void m4498k(InterfaceC0954z interfaceC0954z, kja0.toq toqVar, Object obj) {
            try {
                int i2 = this.f5140k;
                if (i2 == 0) {
                    this.f51607toq.invoke(obj, new Object[0]);
                } else if (i2 == 1) {
                    this.f51607toq.invoke(obj, interfaceC0954z);
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.f51607toq.invoke(obj, interfaceC0954z, toqVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }
    }

    zy() {
    }

    /* JADX INFO: renamed from: k */
    private C0955k m4494k(Class<?> cls, @zy.dd Method[] methodArr) {
        int i2;
        C0955k c0955kZy;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0955kZy = zy(superclass)) != null) {
            map.putAll(c0955kZy.f51606toq);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<toq, kja0.toq> entry : zy(cls2).f51606toq.entrySet()) {
                m4495n(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = toq(cls);
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            gvn7 gvn7Var = (gvn7) method.getAnnotation(gvn7.class);
            if (gvn7Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC0954z.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                kja0.toq toqVarValue = gvn7Var.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(kja0.toq.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (toqVarValue != kja0.toq.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m4495n(map, new toq(i2, method), toqVarValue, cls);
                z2 = true;
            }
        }
        C0955k c0955k = new C0955k(map);
        this.f5138k.put(cls, c0955k);
        this.f51605toq.put(cls, Boolean.valueOf(z2));
        return c0955k;
    }

    /* JADX INFO: renamed from: n */
    private void m4495n(Map<toq, kja0.toq> map, toq toqVar, kja0.toq toqVar2, Class<?> cls) {
        kja0.toq toqVar3 = map.get(toqVar);
        if (toqVar3 == null || toqVar2 == toqVar3) {
            if (toqVar3 == null) {
                map.put(toqVar, toqVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + toqVar.f51607toq.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + toqVar3 + ", new value " + toqVar2);
    }

    private Method[] toq(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    /* JADX INFO: renamed from: q */
    boolean m4496q(Class<?> cls) {
        Boolean bool = this.f51605toq.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] qVar = toq(cls);
        for (Method method : qVar) {
            if (((gvn7) method.getAnnotation(gvn7.class)) != null) {
                m4494k(cls, qVar);
                return true;
            }
        }
        this.f51605toq.put(cls, Boolean.FALSE);
        return false;
    }

    C0955k zy(Class<?> cls) {
        C0955k c0955k = this.f5138k.get(cls);
        return c0955k != null ? c0955k : m4494k(cls, null);
    }
}
