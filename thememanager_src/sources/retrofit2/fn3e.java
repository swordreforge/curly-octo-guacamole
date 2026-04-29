package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.C7529t;
import okhttp3.InterfaceC7519n;
import okhttp3.a9;
import okhttp3.jp0y;
import retrofit2.C7640k;
import retrofit2.InterfaceC7637g;
import retrofit2.zy;

/* JADX INFO: compiled from: Retrofit.java */
/* JADX INFO: loaded from: classes4.dex */
public final class fn3e {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final boolean f94682f7l8;

    /* JADX INFO: renamed from: g */
    @Nullable
    final Executor f44140g;

    /* JADX INFO: renamed from: k */
    private final Map<Method, zurt<?>> f44141k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n */
    final List<zy.AbstractC7658k> f44142n;

    /* JADX INFO: renamed from: q */
    final List<InterfaceC7637g.k> f44143q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final InterfaceC7519n.k f94683toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final okhttp3.zurt f94684zy;

    /* JADX INFO: renamed from: retrofit2.fn3e$k */
    /* JADX INFO: compiled from: Retrofit.java */
    class C7636k implements InvocationHandler {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Class f94686zy;

        /* JADX INFO: renamed from: k */
        private final cdj f44144k = cdj.f7l8();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Object[] f94685toq = new Object[0];

        C7636k(Class cls) {
            this.f94686zy = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f94685toq;
            }
            return this.f44144k.m27947s(method) ? this.f44144k.mo27948y(method, this.f94686zy, obj, objArr) : fn3e.this.m27964y(method).mo28000k(objArr);
        }
    }

    fn3e(InterfaceC7519n.k kVar, okhttp3.zurt zurtVar, List<InterfaceC7637g.k> list, List<zy.AbstractC7658k> list2, @Nullable Executor executor, boolean z2) {
        this.f94683toq = kVar;
        this.f94684zy = zurtVar;
        this.f44143q = list;
        this.f44142n = list2;
        this.f44140g = executor;
        this.f94682f7l8 = z2;
    }

    /* JADX INFO: renamed from: h */
    private void m27957h(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                sb.append(cls2.getName());
                if (cls2 != cls) {
                    sb.append(" which is an interface of ");
                    sb.append(cls.getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f94682f7l8) {
            cdj cdjVarF7l8 = cdj.f7l8();
            for (Method method : cls.getDeclaredMethods()) {
                if (!cdjVarF7l8.m27947s(method) && !Modifier.isStatic(method.getModifiers())) {
                    m27964y(method);
                }
            }
        }
    }

    public <T> T f7l8(Class<T> cls) {
        m27957h(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C7636k(cls));
    }

    /* JADX INFO: renamed from: g */
    public List<InterfaceC7637g.k> m27958g() {
        return this.f44143q;
    }

    /* JADX INFO: renamed from: k */
    public okhttp3.zurt m27959k() {
        return this.f94684zy;
    }

    public <T> InterfaceC7637g<T, String> kja0(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f44143q.size();
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC7637g<T, String> interfaceC7637g = (InterfaceC7637g<T, String>) this.f44143q.get(i2).m27974n(type, annotationArr, this);
            if (interfaceC7637g != null) {
                return interfaceC7637g;
            }
        }
        return C7640k.q.f44178k;
    }

    public <T> InterfaceC7637g<T, a9> ld6(@Nullable InterfaceC7637g.k kVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f44143q.indexOf(kVar) + 1;
        int size = this.f44143q.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            InterfaceC7637g<T, a9> interfaceC7637g = (InterfaceC7637g<T, a9>) this.f44143q.get(i2).zy(type, annotationArr, annotationArr2, this);
            if (interfaceC7637g != null) {
                return interfaceC7637g;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (kVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f44143q.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f44143q.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f44143q.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public Executor m27960n() {
        return this.f44140g;
    }

    public <T> InterfaceC7637g<jp0y, T> n7h(Type type, Annotation[] annotationArr) {
        return x2(null, type, annotationArr);
    }

    /* JADX INFO: renamed from: p */
    public zy<?, ?> m27961p(@Nullable zy.AbstractC7658k abstractC7658k, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f44142n.indexOf(abstractC7658k) + 1;
        int size = this.f44142n.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            zy<?, ?> zyVarMo27952k = this.f44142n.get(i2).mo27952k(type, annotationArr, this);
            if (zyVarMo27952k != null) {
                return zyVarMo27952k;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (abstractC7658k != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f44142n.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f44142n.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f44142n.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC7519n.k m27962q() {
        return this.f94683toq;
    }

    public <T> InterfaceC7637g<T, a9> qrj(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return ld6(null, type, annotationArr, annotationArr2);
    }

    /* JADX INFO: renamed from: s */
    public toq m27963s() {
        return new toq(this);
    }

    public zy<?, ?> toq(Type type, Annotation[] annotationArr) {
        return m27961p(null, type, annotationArr);
    }

    public <T> InterfaceC7637g<jp0y, T> x2(@Nullable InterfaceC7637g.k kVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f44143q.indexOf(kVar) + 1;
        int size = this.f44143q.size();
        for (int i2 = iIndexOf; i2 < size; i2++) {
            InterfaceC7637g<jp0y, T> interfaceC7637g = (InterfaceC7637g<jp0y, T>) this.f44143q.get(i2).mo27950q(type, annotationArr, this);
            if (interfaceC7637g != null) {
                return interfaceC7637g;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (kVar != null) {
            sb.append("  Skipped:");
            for (int i3 = 0; i3 < iIndexOf; i3++) {
                sb.append("\n   * ");
                sb.append(this.f44143q.get(i3).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f44143q.size();
        while (iIndexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f44143q.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: y */
    zurt<?> m27964y(Method method) {
        zurt<?> qVar;
        zurt<?> zurtVar = this.f44141k.get(method);
        if (zurtVar != null) {
            return zurtVar;
        }
        synchronized (this.f44141k) {
            qVar = this.f44141k.get(method);
            if (qVar == null) {
                qVar = zurt.toq(this, method);
                this.f44141k.put(method, qVar);
            }
        }
        return qVar;
    }

    public List<zy.AbstractC7658k> zy() {
        return this.f44142n;
    }

    /* JADX INFO: compiled from: Retrofit.java */
    public static final class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f94687f7l8;

        /* JADX INFO: renamed from: g */
        @Nullable
        private Executor f44146g;

        /* JADX INFO: renamed from: k */
        private final cdj f44147k;

        /* JADX INFO: renamed from: n */
        private final List<zy.AbstractC7658k> f44148n;

        /* JADX INFO: renamed from: q */
        private final List<InterfaceC7637g.k> f44149q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @Nullable
        private InterfaceC7519n.k f94688toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @Nullable
        private okhttp3.zurt f94689zy;

        toq(cdj cdjVar) {
            this.f44149q = new ArrayList();
            this.f44148n = new ArrayList();
            this.f44147k = cdjVar;
        }

        public List<zy.AbstractC7658k> f7l8() {
            return this.f44148n;
        }

        /* JADX INFO: renamed from: g */
        public fn3e m27965g() {
            if (this.f94689zy == null) {
                throw new IllegalStateException("Base URL required.");
            }
            InterfaceC7519n.k c7529t = this.f94688toq;
            if (c7529t == null) {
                c7529t = new C7529t();
            }
            InterfaceC7519n.k kVar = c7529t;
            Executor executorZy = this.f44146g;
            if (executorZy == null) {
                executorZy = this.f44147k.zy();
            }
            Executor executor = executorZy;
            ArrayList arrayList = new ArrayList(this.f44148n);
            arrayList.addAll(this.f44147k.m27944k(executor));
            ArrayList arrayList2 = new ArrayList(this.f44149q.size() + 1 + this.f44147k.m27945n());
            arrayList2.add(new C7640k());
            arrayList2.addAll(this.f44149q);
            arrayList2.addAll(this.f44147k.m27946q());
            return new fn3e(kVar, this.f94689zy, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f94687f7l8);
        }

        /* JADX INFO: renamed from: k */
        public toq m27966k(zy.AbstractC7658k abstractC7658k) {
            List<zy.AbstractC7658k> list = this.f44148n;
            Objects.requireNonNull(abstractC7658k, "factory == null");
            list.add(abstractC7658k);
            return this;
        }

        public List<InterfaceC7637g.k> ld6() {
            return this.f44149q;
        }

        /* JADX INFO: renamed from: n */
        public toq m27967n(okhttp3.zurt zurtVar) {
            Objects.requireNonNull(zurtVar, "baseUrl == null");
            if ("".equals(zurtVar.d2ok().get(r0.size() - 1))) {
                this.f94689zy = zurtVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + zurtVar);
        }

        /* JADX INFO: renamed from: p */
        public toq m27968p(C7529t c7529t) {
            Objects.requireNonNull(c7529t, "client == null");
            return m27971y(c7529t);
        }

        /* JADX INFO: renamed from: q */
        public toq m27969q(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return m27967n(okhttp3.zurt.mcp(url.toString()));
        }

        /* JADX INFO: renamed from: s */
        public toq m27970s(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f44146g = executor;
            return this;
        }

        public toq toq(InterfaceC7637g.k kVar) {
            List<InterfaceC7637g.k> list = this.f44149q;
            Objects.requireNonNull(kVar, "factory == null");
            list.add(kVar);
            return this;
        }

        public toq x2(boolean z2) {
            this.f94687f7l8 = z2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m27971y(InterfaceC7519n.k kVar) {
            Objects.requireNonNull(kVar, "factory == null");
            this.f94688toq = kVar;
            return this;
        }

        public toq zy(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return m27967n(okhttp3.zurt.mcp(str));
        }

        public toq() {
            this(cdj.f7l8());
        }

        toq(fn3e fn3eVar) {
            this.f44149q = new ArrayList();
            this.f44148n = new ArrayList();
            cdj cdjVarF7l8 = cdj.f7l8();
            this.f44147k = cdjVarF7l8;
            this.f94688toq = fn3eVar.f94683toq;
            this.f94689zy = fn3eVar.f94684zy;
            int size = fn3eVar.f44143q.size() - cdjVarF7l8.m27945n();
            for (int i2 = 1; i2 < size; i2++) {
                this.f44149q.add(fn3eVar.f44143q.get(i2));
            }
            int size2 = fn3eVar.f44142n.size() - this.f44147k.toq();
            for (int i3 = 0; i3 < size2; i3++) {
                this.f44148n.add(fn3eVar.f44142n.get(i3));
            }
            this.f44146g = fn3eVar.f44140g;
            this.f94687f7l8 = fn3eVar.f94682f7l8;
        }
    }
}
