package androidx.lifecycle;

import androidx.lifecycle.kja0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class Lifecycling {

    /* JADX INFO: renamed from: k */
    private static final int f5008k = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f51560toq = 2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static Map<Class<?>, Integer> f51561zy = new HashMap();

    /* JADX INFO: renamed from: q */
    private static Map<Class<?>, List<Constructor<? extends x2>>> f5009q = new HashMap();

    private Lifecycling() {
    }

    @zy.lvui
    static fn3e f7l8(Object obj) {
        boolean z2 = obj instanceof fn3e;
        boolean z3 = obj instanceof ld6;
        if (z2 && z3) {
            return new FullLifecycleObserverAdapter((ld6) obj, (fn3e) obj);
        }
        if (z3) {
            return new FullLifecycleObserverAdapter((ld6) obj, null);
        }
        if (z2) {
            return (fn3e) obj;
        }
        Class<?> cls = obj.getClass();
        if (m4384n(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends x2>> list = f5009q.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(m4383k(list.get(0), obj));
        }
        x2[] x2VarArr = new x2[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            x2VarArr[i2] = m4383k(list.get(i2), obj);
        }
        return new CompositeGeneratedAdaptersObserver(x2VarArr);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m4382g(Class<?> cls) {
        return cls != null && fu4.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: k */
    private static x2 m4383k(Constructor<? extends x2> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX INFO: renamed from: n */
    private static int m4384n(Class<?> cls) {
        Integer num = f51561zy.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iM4386y = m4386y(cls);
        f51561zy.put(cls, Integer.valueOf(iM4386y));
        return iM4386y;
    }

    @zy.lvui
    @Deprecated
    /* JADX INFO: renamed from: q */
    static qrj m4385q(Object obj) {
        final fn3e fn3eVarF7l8 = f7l8(obj);
        return new qrj() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
                fn3eVarF7l8.gvn7(interfaceC0954z, toqVar);
            }
        };
    }

    @zy.dd
    private static Constructor<? extends x2> toq(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strZy = zy(canonicalName);
            if (!name.isEmpty()) {
                strZy = name + "." + strZy;
            }
            Constructor declaredConstructor = Class.forName(strZy).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: y */
    private static int m4386y(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends x2> qVar = toq(cls);
        if (qVar != null) {
            f5009q.put(cls, Collections.singletonList(qVar));
            return 2;
        }
        if (zy.f51604zy.m4496q(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        ArrayList arrayList = null;
        if (m4382g(superclass)) {
            if (m4384n(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList(f5009q.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (m4382g(cls2)) {
                if (m4384n(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll(f5009q.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f5009q.put(cls, arrayList);
        return 2;
    }

    public static String zy(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }
}
