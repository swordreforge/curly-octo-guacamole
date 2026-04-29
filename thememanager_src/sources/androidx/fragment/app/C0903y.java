package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import zy.lvui;

/* JADX INFO: renamed from: androidx.fragment.app.y */
/* JADX INFO: compiled from: FragmentFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class C0903y {

    /* JADX INFO: renamed from: k */
    private static final androidx.collection.qrj<ClassLoader, androidx.collection.qrj<String, Class<?>>> f4953k = new androidx.collection.qrj<>();

    @lvui
    /* JADX INFO: renamed from: q */
    public static Class<? extends Fragment> m4357q(@lvui ClassLoader classLoader, @lvui String str) {
        try {
            return zy(classLoader, str);
        } catch (ClassCastException e2) {
            throw new Fragment.C0854p("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        } catch (ClassNotFoundException e3) {
            throw new Fragment.C0854p("Unable to instantiate fragment " + str + ": make sure class name exists", e3);
        }
    }

    static boolean toq(@lvui ClassLoader classLoader, @lvui String str) {
        try {
            return Fragment.class.isAssignableFrom(zy(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @lvui
    private static Class<?> zy(@lvui ClassLoader classLoader, @lvui String str) throws ClassNotFoundException {
        androidx.collection.qrj<ClassLoader, androidx.collection.qrj<String, Class<?>>> qrjVar = f4953k;
        androidx.collection.qrj<String, Class<?>> qrjVar2 = qrjVar.get(classLoader);
        if (qrjVar2 == null) {
            qrjVar2 = new androidx.collection.qrj<>();
            qrjVar.put(classLoader, qrjVar2);
        }
        Class<?> cls = qrjVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        qrjVar2.put(str, cls2);
        return cls2;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public Fragment mo4213k(@lvui ClassLoader classLoader, @lvui String str) {
        try {
            return m4357q(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new Fragment.C0854p("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new Fragment.C0854p("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new Fragment.C0854p("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e6) {
            throw new Fragment.C0854p("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }
}
