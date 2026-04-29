package miuix.module.core;

import android.content.Context;
import android.content.pm.PackageManager;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: ModuleLoader.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private Context f40656k;

    /* JADX INFO: renamed from: q */
    private ClassLoader f40657q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private Context f87850toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Map<Class<?>, String> f87851zy;

    /* JADX INFO: renamed from: k */
    public Context m26115k() {
        return this.f40656k;
    }

    /* JADX INFO: renamed from: n */
    public <I> I m26116n(Class<I> cls, Class<?>[] clsArr, Object[] objArr) {
        try {
            String str = this.f87851zy.get(cls);
            if (str != null) {
                return (I) this.f40657q.loadClass(str).asSubclass(cls).getConstructor(clsArr).newInstance(objArr);
            }
            throw new IllegalArgumentException("no implementation for " + cls);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: q */
    public <I> I m26117q(Class<I> cls) {
        return (I) m26116n(cls, new Class[0], new Object[0]);
    }

    public ClassLoader toq() {
        return this.f40657q;
    }

    public Context zy() {
        return this.f87850toq;
    }

    private zy(Context context, Map<Class<?>, String> map, Context context2, String[] strArr) {
        this.f40656k = context;
        this.f87850toq = context2;
        this.f87851zy = map;
        miuix.module.core.toq toqVar = new miuix.module.core.toq(context.getClassLoader());
        toqVar.m26114k(context2.getClassLoader(), strArr);
        Iterator<Map.Entry<Class<?>, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            toqVar.toq(it.next().getValue());
        }
        this.f40657q = C7200k.m26113k(context, toqVar);
    }

    /* JADX INFO: compiled from: ModuleLoader.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        private Context f40658k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Context f87852toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f87853zy;

        /* JADX INFO: renamed from: q */
        private Set<String> f40660q = new HashSet();

        /* JADX INFO: renamed from: n */
        private Map<Class<?>, String> f40659n = new HashMap();

        public toq(Context context, String str) {
            this.f40658k = context;
            this.f87853zy = str;
        }

        /* JADX INFO: renamed from: k */
        public zy m26118k() {
            Context contextCreatePackageContext = this.f87852toq;
            if (contextCreatePackageContext == null) {
                try {
                    contextCreatePackageContext = this.f40658k.createPackageContext(this.f87853zy, 3);
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new RuntimeException(e2);
                }
            }
            return new zy(this.f40658k, this.f40659n, contextCreatePackageContext, (String[]) this.f40660q.toArray(new String[0]));
        }

        public toq toq(Class<?> cls, String str) {
            this.f40659n.put(cls, str);
            return this;
        }

        public toq zy(String str) {
            this.f40660q.add(str);
            return this;
        }

        public toq(Context context, Context context2) {
            this.f40658k = context;
            this.f87852toq = context2;
        }
    }
}
