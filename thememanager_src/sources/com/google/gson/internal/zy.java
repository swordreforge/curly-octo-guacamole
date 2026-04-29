package com.google.gson.internal;

import com.google.gson.InterfaceC4927y;
import com.google.gson.reflect.C4922k;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private final Map<Type, InterfaceC4927y<?>> f27802k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final com.google.gson.internal.reflect.toq f68788toq = com.google.gson.internal.reflect.toq.m17184k();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class f7l8<T> implements com.google.gson.internal.ld6<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4927y f27803k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Type f68789toq;

        f7l8(InterfaceC4927y interfaceC4927y, Type type) {
            this.f27803k = interfaceC4927y;
            this.f68789toq = type;
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) this.f27803k.m17236k(this.f68789toq);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$g */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4910g<T> implements com.google.gson.internal.ld6<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC4927y f27804k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Type f68791toq;

        C4910g(InterfaceC4927y interfaceC4927y, Type type) {
            this.f27804k = interfaceC4927y;
            this.f68791toq = type;
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) this.f27804k.m17236k(this.f68791toq);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$k */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4911k<T> implements com.google.gson.internal.ld6<T> {
        C4911k() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class ld6<T> implements com.google.gson.internal.ld6<T> {
        ld6() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$n */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4912n<T> implements com.google.gson.internal.ld6<T> {

        /* JADX INFO: renamed from: k */
        private final kja0 f27807k = kja0.toq();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Class f68793toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Type f68794zy;

        C4912n(Class cls, Type type) {
            this.f68793toq = cls;
            this.f68794zy = type;
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            try {
                return (T) this.f27807k.zy(this.f68793toq);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f68794zy + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e2);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class n7h<T> implements com.google.gson.internal.ld6<T> {
        n7h() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$p */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4913p<T> implements com.google.gson.internal.ld6<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Type f27810k;

        C4913p(Type type) {
            this.f27810k = type;
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            Type type = this.f27810k;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.qrj("Invalid EnumSet type: " + this.f27810k.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new com.google.gson.qrj("Invalid EnumSet type: " + this.f27810k.toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$q */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4914q<T> implements com.google.gson.internal.ld6<T> {
        C4914q() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new C4904p();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class qrj<T> implements com.google.gson.internal.ld6<T> {
        qrj() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new ArrayList();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$s */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4915s<T> implements com.google.gson.internal.ld6<T> {
        C4915s() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class toq<T> implements com.google.gson.internal.ld6<T> {
        toq() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class x2<T> implements com.google.gson.internal.ld6<T> {
        x2() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$y */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C4916y<T> implements com.google.gson.internal.ld6<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Constructor f27816k;

        C4916y(Constructor constructor) {
            this.f27816k = constructor;
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            try {
                return (T) this.f27816k.newInstance(null);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Failed to invoke " + this.f27816k + " with no args", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke " + this.f27816k + " with no args", e4.getTargetException());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.google.gson.internal.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    class C8021zy<T> implements com.google.gson.internal.ld6<T> {
        C8021zy() {
        }

        @Override // com.google.gson.internal.ld6
        /* JADX INFO: renamed from: k */
        public T mo17167k() {
            return (T) new LinkedHashMap();
        }
    }

    public zy(Map<Type, InterfaceC4927y<?>> map) {
        this.f27802k = map;
    }

    /* JADX INFO: renamed from: q */
    private <T> com.google.gson.internal.ld6<T> m17208q(Type type, Class<? super T> cls) {
        return new C4912n(cls, type);
    }

    private <T> com.google.gson.internal.ld6<T> toq(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f68788toq.toq(declaredConstructor);
            }
            return new C4916y(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> com.google.gson.internal.ld6<T> zy(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new C4915s() : EnumSet.class.isAssignableFrom(cls) ? new C4913p(type) : Set.class.isAssignableFrom(cls) ? new ld6() : Queue.class.isAssignableFrom(cls) ? new x2() : new qrj();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n7h() : ConcurrentMap.class.isAssignableFrom(cls) ? new C4911k() : SortedMap.class.isAssignableFrom(cls) ? new toq() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C4922k.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new C4914q() : new C8021zy();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public <T> com.google.gson.internal.ld6<T> m17209k(C4922k<T> c4922k) {
        Type type = c4922k.getType();
        Class<? super T> rawType = c4922k.getRawType();
        InterfaceC4927y<?> interfaceC4927y = this.f27802k.get(type);
        if (interfaceC4927y != null) {
            return new C4910g(interfaceC4927y, type);
        }
        InterfaceC4927y<?> interfaceC4927y2 = this.f27802k.get(rawType);
        if (interfaceC4927y2 != null) {
            return new f7l8(interfaceC4927y2, type);
        }
        com.google.gson.internal.ld6<T> qVar = toq(rawType);
        if (qVar != null) {
            return qVar;
        }
        com.google.gson.internal.ld6<T> ld6VarZy = zy(type, rawType);
        return ld6VarZy != null ? ld6VarZy : m17208q(type, rawType);
    }

    public String toString() {
        return this.f27802k.toString();
    }
}
