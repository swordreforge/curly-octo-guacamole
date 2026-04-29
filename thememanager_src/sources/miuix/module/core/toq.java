package miuix.module.core;

import android.util.ArrayMap;
import android.util.Log;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: DependencyLoader.java */
/* JADX INFO: loaded from: classes3.dex */
class toq extends ClassLoader {

    /* JADX INFO: renamed from: q */
    private static final String f40654q = "DependencyLoader";

    /* JADX INFO: renamed from: k */
    private Map<String, Class<?>> f40655k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Map<String, ClassLoader> f87848toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Set<String> f87849zy;

    public toq(ClassLoader classLoader) {
        super(classLoader);
        this.f40655k = new ArrayMap();
        this.f87848toq = new ArrayMap();
        this.f87849zy = new HashSet();
    }

    /* JADX INFO: renamed from: k */
    void m26114k(ClassLoader classLoader, String... strArr) {
        for (String str : strArr) {
            this.f87848toq.put(str, classLoader);
        }
    }

    @Override // java.lang.ClassLoader
    protected Class<?> loadClass(String str, boolean z2) throws ClassNotFoundException {
        Log.d(f40654q, "loading class: " + str);
        Class<?> cls = this.f40655k.get(str);
        if (cls != null) {
            return cls;
        }
        ClassLoader classLoader = this.f87848toq.get(str);
        if (classLoader != null) {
            return classLoader.loadClass(str);
        }
        if (this.f87849zy.contains(str)) {
            return null;
        }
        return super.loadClass(str, z2);
    }

    void toq(String str) {
        this.f87849zy.add(str);
    }

    void zy(Class<?>... clsArr) {
        for (Class<?> cls : clsArr) {
            this.f40655k.put(cls.getCanonicalName(), cls);
        }
    }
}
