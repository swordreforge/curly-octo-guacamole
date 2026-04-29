package com.google.common.reflect;

import com.google.common.base.C4280z;
import com.google.common.base.jk;
import com.google.common.base.ni7;
import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.common.reflect.kja0;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.eqxt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: TypeResolver.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class ld6 {

    /* JADX INFO: renamed from: k */
    private final zy f27326k;

    /* JADX INFO: renamed from: com.google.common.reflect.ld6$k */
    /* JADX INFO: compiled from: TypeResolver.java */
    static class C4763k extends n7h {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ Map f68594toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ Type f68595zy;

        C4763k(Map map, Type type) {
            this.f68594toq = map;
            this.f68595zy = type;
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: g */
        void mo16776g(WildcardType wildcardType) {
            Type type = this.f68595zy;
            if (type instanceof WildcardType) {
                WildcardType wildcardType2 = (WildcardType) type;
                Type[] upperBounds = wildcardType.getUpperBounds();
                Type[] upperBounds2 = wildcardType2.getUpperBounds();
                Type[] lowerBounds = wildcardType.getLowerBounds();
                Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                jk.m15391z(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, this.f68595zy);
                for (int i2 = 0; i2 < upperBounds.length; i2++) {
                    ld6.f7l8(this.f68594toq, upperBounds[i2], upperBounds2[i2]);
                }
                for (int i3 = 0; i3 < lowerBounds.length; i3++) {
                    ld6.f7l8(this.f68594toq, lowerBounds[i3], lowerBounds2[i3]);
                }
            }
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: n */
        void mo16777n(TypeVariable<?> typeVariable) {
            this.f68594toq.put(new C4765q(typeVariable), this.f68595zy);
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: q */
        void mo16787q(ParameterizedType parameterizedType) {
            Type type = this.f68595zy;
            if (type instanceof WildcardType) {
                return;
            }
            ParameterizedType parameterizedType2 = (ParameterizedType) ld6.m16782n(ParameterizedType.class, type);
            if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                ld6.f7l8(this.f68594toq, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            jk.m15391z(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, this.f68595zy);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            jk.m15391z(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                ld6.f7l8(this.f68594toq, actualTypeArguments[i2], actualTypeArguments2[i2]);
            }
        }

        @Override // com.google.common.reflect.n7h
        void toq(Class<?> cls) {
            if (this.f68595zy instanceof WildcardType) {
                return;
            }
            throw new IllegalArgumentException("No type mapping from " + cls + " to " + this.f68595zy);
        }

        @Override // com.google.common.reflect.n7h
        void zy(GenericArrayType genericArrayType) {
            Type type = this.f68595zy;
            if (type instanceof WildcardType) {
                return;
            }
            Type typeM16770p = kja0.m16770p(type);
            jk.fn3e(typeM16770p != null, "%s is not an array type.", this.f68595zy);
            ld6.f7l8(this.f68594toq, genericArrayType.getGenericComponentType(), typeM16770p);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.ld6$n */
    /* JADX INFO: compiled from: TypeResolver.java */
    private static class C4764n {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final C4764n f68596toq = new C4764n();

        /* JADX INFO: renamed from: k */
        private final AtomicInteger f27327k;

        /* JADX INFO: renamed from: com.google.common.reflect.ld6$n$k */
        /* JADX INFO: compiled from: TypeResolver.java */
        class k extends C4764n {

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ TypeVariable f68597zy;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(AtomicInteger atomicInteger, TypeVariable typeVariable) {
                super(atomicInteger, null);
                this.f68597zy = typeVariable;
            }

            @Override // com.google.common.reflect.ld6.C4764n
            TypeVariable<?> toq(Type[] typeArr) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                linkedHashSet.addAll(Arrays.asList(this.f68597zy.getBounds()));
                if (linkedHashSet.size() > 1) {
                    linkedHashSet.remove(Object.class);
                }
                return super.toq((Type[]) linkedHashSet.toArray(new Type[0]));
            }
        }

        /* synthetic */ C4764n(AtomicInteger atomicInteger, C4763k c4763k) {
            this(atomicInteger);
        }

        /* JADX INFO: renamed from: n */
        private C4764n m16788n() {
            return new C4764n(this.f27327k);
        }

        /* JADX INFO: renamed from: q */
        private C4764n m16789q(TypeVariable<?> typeVariable) {
            return new k(this.f27327k, typeVariable);
        }

        private Type zy(@NullableDecl Type type) {
            if (type == null) {
                return null;
            }
            return m16790k(type);
        }

        /* JADX INFO: renamed from: k */
        final Type m16790k(Type type) {
            jk.a9(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return kja0.ld6(m16788n().m16790k(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? toq(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable<?>[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                actualTypeArguments[i2] = m16789q(typeParameters[i2]).m16790k(actualTypeArguments[i2]);
            }
            return kja0.n7h(m16788n().zy(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable<?> toq(Type[] typeArr) {
            return kja0.x2(C4764n.class, "capture#" + this.f27327k.incrementAndGet() + "-of ? extends " + ni7.kja0(eqxt.f36674q).n7h(typeArr), typeArr);
        }

        private C4764n() {
            this(new AtomicInteger());
        }

        private C4764n(AtomicInteger atomicInteger) {
            this.f27327k = atomicInteger;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.ld6$q */
    /* JADX INFO: compiled from: TypeResolver.java */
    static final class C4765q {

        /* JADX INFO: renamed from: k */
        private final TypeVariable<?> f27329k;

        C4765q(TypeVariable<?> typeVariable) {
            this.f27329k = (TypeVariable) jk.a9(typeVariable);
        }

        private boolean toq(TypeVariable<?> typeVariable) {
            return this.f27329k.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f27329k.getName().equals(typeVariable.getName());
        }

        static C4765q zy(Type type) {
            if (type instanceof TypeVariable) {
                return new C4765q((TypeVariable) type);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C4765q) {
                return toq(((C4765q) obj).f27329k);
            }
            return false;
        }

        public int hashCode() {
            return C4280z.toq(this.f27329k.getGenericDeclaration(), this.f27329k.getName());
        }

        /* JADX INFO: renamed from: k */
        boolean m16791k(Type type) {
            if (type instanceof TypeVariable) {
                return toq((TypeVariable) type);
            }
            return false;
        }

        public String toString() {
            return this.f27329k.toString();
        }
    }

    /* JADX INFO: compiled from: TypeResolver.java */
    private static final class toq extends n7h {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Map<C4765q, Type> f68598toq = vy.vyq();

        private toq() {
        }

        static zkd<C4765q, Type> f7l8(Type type) {
            jk.a9(type);
            toq toqVar = new toq();
            toqVar.m16799k(type);
            return zkd.copyOf((Map) toqVar.f68598toq);
        }

        /* JADX INFO: renamed from: y */
        private void m16792y(C4765q c4765q, Type type) {
            if (this.f68598toq.containsKey(c4765q)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (c4765q.m16791k(type2)) {
                    while (type != null) {
                        type = this.f68598toq.remove(C4765q.zy(type));
                    }
                    return;
                }
                type2 = this.f68598toq.get(C4765q.zy(type2));
            }
            this.f68598toq.put(c4765q, type);
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: g */
        void mo16776g(WildcardType wildcardType) {
            m16799k(wildcardType.getUpperBounds());
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: n */
        void mo16777n(TypeVariable<?> typeVariable) {
            m16799k(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: q */
        void mo16787q(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            jk.yz(typeParameters.length == actualTypeArguments.length);
            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                m16792y(new C4765q(typeParameters[i2]), actualTypeArguments[i2]);
            }
            m16799k(cls);
            m16799k(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.n7h
        void toq(Class<?> cls) {
            m16799k(cls.getGenericSuperclass());
            m16799k(cls.getGenericInterfaces());
        }
    }

    /* synthetic */ ld6(zy zyVar, C4763k c4763k) {
        this(zyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f7l8(Map<C4765q, Type> map, Type type, Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new C4763k(map, type2).m16799k(type);
    }

    /* JADX INFO: renamed from: g */
    static ld6 m16780g(Type type) {
        return new ld6().kja0(toq.f7l8(C4764n.f68596toq.m16790k(type)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] ld6(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr2[i2] = m16786p(typeArr[i2]);
        }
        return typeArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static <T> T m16782n(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: q */
    static ld6 m16783q(Type type) {
        return new ld6().kja0(toq.f7l8(type));
    }

    private WildcardType qrj(WildcardType wildcardType) {
        return new kja0.C4757p(ld6(wildcardType.getLowerBounds()), ld6(wildcardType.getUpperBounds()));
    }

    /* JADX INFO: renamed from: s */
    private ParameterizedType m16784s(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return kja0.n7h(ownerType == null ? null : m16786p(ownerType), (Class) m16786p(parameterizedType.getRawType()), ld6(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: renamed from: y */
    private Type m16785y(GenericArrayType genericArrayType) {
        return kja0.ld6(m16786p(genericArrayType.getGenericComponentType()));
    }

    ld6 kja0(Map<C4765q, ? extends Type> map) {
        return new ld6(this.f27326k.zy(map));
    }

    public ld6 n7h(Type type, Type type2) {
        HashMap mapVyq = vy.vyq();
        f7l8(mapVyq, (Type) jk.a9(type), (Type) jk.a9(type2));
        return kja0(mapVyq);
    }

    /* JADX INFO: renamed from: p */
    public Type m16786p(Type type) {
        jk.a9(type);
        return type instanceof TypeVariable ? this.f27326k.m16793k((TypeVariable) type) : type instanceof ParameterizedType ? m16784s((ParameterizedType) type) : type instanceof GenericArrayType ? m16785y((GenericArrayType) type) : type instanceof WildcardType ? qrj((WildcardType) type) : type;
    }

    Type[] x2(Type[] typeArr) {
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr[i2] = m16786p(typeArr[i2]);
        }
        return typeArr;
    }

    /* JADX INFO: compiled from: TypeResolver.java */
    private static class zy {

        /* JADX INFO: renamed from: k */
        private final zkd<C4765q, Type> f27330k;

        /* JADX INFO: renamed from: com.google.common.reflect.ld6$zy$k */
        /* JADX INFO: compiled from: TypeResolver.java */
        class C4766k extends zy {

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ TypeVariable f68599toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ zy f68600zy;

            C4766k(TypeVariable typeVariable, zy zyVar) {
                this.f68599toq = typeVariable;
                this.f68600zy = zyVar;
            }

            @Override // com.google.common.reflect.ld6.zy
            public Type toq(TypeVariable<?> typeVariable, zy zyVar) {
                return typeVariable.getGenericDeclaration().equals(this.f68599toq.getGenericDeclaration()) ? typeVariable : this.f68600zy.toq(typeVariable, zyVar);
            }
        }

        zy() {
            this.f27330k = zkd.of();
        }

        /* JADX INFO: renamed from: k */
        final Type m16793k(TypeVariable<?> typeVariable) {
            return toq(typeVariable, new C4766k(typeVariable, this));
        }

        Type toq(TypeVariable<?> typeVariable, zy zyVar) {
            Type type = this.f27330k.get(new C4765q(typeVariable));
            C4763k c4763k = null;
            if (type != null) {
                return new ld6(zyVar, c4763k).m16786p(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] typeArrLd6 = new ld6(zyVar, c4763k).ld6(bounds);
            return (kja0.C4754g.f27321k && Arrays.equals(bounds, typeArrLd6)) ? typeVariable : kja0.x2(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrLd6);
        }

        final zy zy(Map<C4765q, ? extends Type> map) {
            zkd.toq toqVarBuilder = zkd.builder();
            toqVarBuilder.f7l8(this.f27330k);
            for (Map.Entry<C4765q, ? extends Type> entry : map.entrySet()) {
                C4765q key = entry.getKey();
                Type value = entry.getValue();
                jk.fn3e(!key.m16791k(value), "Type variable %s bound to itself", key);
                toqVarBuilder.mo15592q(key, value);
            }
            return new zy(toqVarBuilder.mo15589k());
        }

        private zy(zkd<C4765q, Type> zkdVar) {
            this.f27330k = zkdVar;
        }
    }

    public ld6() {
        this.f27326k = new zy();
    }

    private ld6(zy zyVar) {
        this.f27326k = zyVar;
    }
}
