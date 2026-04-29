package com.google.common.reflect;

import com.google.common.base.a9;
import com.google.common.base.jk;
import com.google.common.base.ni7;
import com.google.common.collect.AbstractC4308a;
import com.google.common.collect.ab;
import com.google.common.collect.kx3;
import com.google.common.collect.qo;
import com.google.common.collect.se;
import com.google.common.collect.vep5;
import com.google.common.collect.vy;
import com.google.common.collect.zkd;
import com.google.common.reflect.AbstractC4767n;
import com.google.common.reflect.kja0;
import com.google.common.reflect.ld6;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: TypeToken.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class qrj<T> extends AbstractC4778s<T> implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient com.google.common.reflect.ld6 f27338k;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient com.google.common.reflect.ld6 f27339q;
    private final Type runtimeType;

    /* JADX INFO: renamed from: com.google.common.reflect.qrj$g */
    /* JADX INFO: compiled from: TypeToken.java */
    private final class C4771g extends qrj<T>.ld6 {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: q */
        @MonotonicNonNullDecl
        private transient vep5<qrj<? super T>> f27343q;

        private C4771g() {
            super();
        }

        private Object readResolve() {
            return qrj.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.qrj.ld6
        public qrj<T>.ld6 classes() {
            return this;
        }

        @Override // com.google.common.reflect.qrj.ld6
        public qrj<T>.ld6 interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        @Override // com.google.common.reflect.qrj.ld6
        public Set<Class<? super T>> rawTypes() {
            return vep5.copyOf((Collection) AbstractC4776s.f68604toq.m16816k().zy(qrj.this.n7h()));
        }

        /* synthetic */ C4771g(qrj qrjVar, C4772k c4772k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.qrj.ld6, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<qrj<? super T>> delegate() {
            vep5<qrj<? super T>> vep5Var = this.f27343q;
            if (vep5Var != null) {
                return vep5Var;
            }
            vep5<qrj<? super T>> vep5VarJp0y = AbstractC4308a.t8r(AbstractC4776s.f27348k.m16816k().m16818q(qrj.this)).n7h(EnumC4774p.IGNORE_TYPE_VARIABLE_OR_WILDCARD).jp0y();
            this.f27343q = vep5VarJp0y;
            return vep5VarJp0y;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.qrj$k */
    /* JADX INFO: compiled from: TypeToken.java */
    class C4772k extends AbstractC4767n.toq<T> {
        C4772k(Method method) {
            super(method);
        }

        @Override // com.google.common.reflect.AbstractC4767n.toq, com.google.common.reflect.AbstractC4767n
        Type[] cdj() {
            return qrj.this.x2().x2(super.cdj());
        }

        @Override // com.google.common.reflect.AbstractC4767n.toq, com.google.common.reflect.AbstractC4767n
        /* JADX INFO: renamed from: h */
        Type[] mo16794h() {
            return qrj.this.ld6().x2(super.mo16794h());
        }

        @Override // com.google.common.reflect.AbstractC4767n, com.google.common.reflect.zy
        /* JADX INFO: renamed from: k */
        public qrj<T> mo16796k() {
            return qrj.this;
        }

        @Override // com.google.common.reflect.AbstractC4767n.toq, com.google.common.reflect.AbstractC4767n
        Type ki() {
            return qrj.this.ld6().m16786p(super.ki());
        }

        @Override // com.google.common.reflect.AbstractC4767n, com.google.common.reflect.zy
        public String toString() {
            return mo16796k() + "." + super.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.qrj$n */
    /* JADX INFO: compiled from: TypeToken.java */
    private static class C4773n {

        /* JADX INFO: renamed from: k */
        private final Type[] f27346k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f68601toq;

        C4773n(Type[] typeArr, boolean z2) {
            this.f27346k = typeArr;
            this.f68601toq = z2;
        }

        /* JADX INFO: renamed from: k */
        boolean m16813k(Type type) {
            for (Type type2 : this.f27346k) {
                boolean zIsSubtypeOf = qrj.of(type2).isSubtypeOf(type);
                boolean z2 = this.f68601toq;
                if (zIsSubtypeOf == z2) {
                    return z2;
                }
            }
            return !this.f68601toq;
        }

        boolean toq(Type type) {
            qrj<?> qrjVarOf = qrj.of(type);
            for (Type type2 : this.f27346k) {
                boolean zIsSubtypeOf = qrjVarOf.isSubtypeOf(type2);
                boolean z2 = this.f68601toq;
                if (zIsSubtypeOf == z2) {
                    return z2;
                }
            }
            return !this.f68601toq;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.reflect.qrj$p */
    /* JADX INFO: compiled from: TypeToken.java */
    private static abstract class EnumC4774p implements a9<qrj<?>> {
        public static final EnumC4774p IGNORE_TYPE_VARIABLE_OR_WILDCARD;
        public static final EnumC4774p INTERFACE_ONLY;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4774p[] f27347k;

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$p$k */
        /* JADX INFO: compiled from: TypeToken.java */
        enum k extends EnumC4774p {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.base.a9
            public boolean apply(qrj<?> qrjVar) {
                return ((((qrj) qrjVar).runtimeType instanceof TypeVariable) || (((qrj) qrjVar).runtimeType instanceof WildcardType)) ? false : true;
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$p$toq */
        /* JADX INFO: compiled from: TypeToken.java */
        enum toq extends EnumC4774p {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.base.a9
            public boolean apply(qrj<?> qrjVar) {
                return qrjVar.getRawType().isInterface();
            }
        }

        static {
            k kVar = new k("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
            IGNORE_TYPE_VARIABLE_OR_WILDCARD = kVar;
            toq toqVar = new toq("INTERFACE_ONLY", 1);
            INTERFACE_ONLY = toqVar;
            f27347k = new EnumC4774p[]{kVar, toqVar};
        }

        private EnumC4774p(String str, int i2) {
        }

        public static EnumC4774p valueOf(String str) {
            return (EnumC4774p) Enum.valueOf(EnumC4774p.class, str);
        }

        public static EnumC4774p[] values() {
            return (EnumC4774p[]) f27347k.clone();
        }

        /* synthetic */ EnumC4774p(String str, int i2, C4772k c4772k) {
            this(str, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.qrj$q */
    /* JADX INFO: compiled from: TypeToken.java */
    class C4775q extends n7h {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ vep5.C4532k f68602toq;

        C4775q(vep5.C4532k c4532k) {
            this.f68602toq = c4532k;
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
            this.f68602toq.f7l8((Class) parameterizedType.getRawType());
        }

        @Override // com.google.common.reflect.n7h
        void toq(Class<?> cls) {
            this.f68602toq.f7l8(cls);
        }

        @Override // com.google.common.reflect.n7h
        void zy(GenericArrayType genericArrayType) {
            this.f68602toq.f7l8(kja0.m16772s(qrj.of(genericArrayType.getGenericComponentType()).getRawType()));
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.qrj$s */
    /* JADX INFO: compiled from: TypeToken.java */
    private static abstract class AbstractC4776s<K> {

        /* JADX INFO: renamed from: k */
        static final AbstractC4776s<qrj<?>> f27348k = new k();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final AbstractC4776s<Class<?>> f68604toq = new toq();

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$s$k */
        /* JADX INFO: compiled from: TypeToken.java */
        static class k extends AbstractC4776s<qrj<?>> {
            k() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.qrj.AbstractC4776s
            @NullableDecl
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public qrj<?> f7l8(qrj<?> qrjVar) {
                return qrjVar.getGenericSuperclass();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16815g(qrj<?> qrjVar) {
                return qrjVar.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends qrj<?>> mo16817n(qrj<?> qrjVar) {
                return qrjVar.getGenericInterfaces();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$s$n */
        /* JADX INFO: compiled from: TypeToken.java */
        private static class n<K> extends AbstractC4776s<K> {

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private final AbstractC4776s<K> f68605zy;

            n(AbstractC4776s<K> abstractC4776s) {
                super(null);
                this.f68605zy = abstractC4776s;
            }

            @Override // com.google.common.reflect.qrj.AbstractC4776s
            K f7l8(K k2) {
                return this.f68605zy.f7l8(k2);
            }

            @Override // com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: g */
            Class<?> mo16815g(K k2) {
                return this.f68605zy.mo16815g(k2);
            }

            @Override // com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: n */
            Iterable<? extends K> mo16817n(K k2) {
                return this.f68605zy.mo16817n(k2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$s$q */
        /* JADX INFO: compiled from: TypeToken.java */
        static class q extends kx3<K> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Comparator f27349k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Map f27350q;

            q(Comparator comparator, Map map) {
                this.f27349k = comparator;
                this.f27350q = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.kx3, java.util.Comparator
            public int compare(K k2, K k3) {
                return this.f27349k.compare(this.f27350q.get(k2), this.f27350q.get(k3));
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$s$toq */
        /* JADX INFO: compiled from: TypeToken.java */
        static class toq extends AbstractC4776s<Class<?>> {
            toq() {
                super(null);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.qrj.AbstractC4776s
            @NullableDecl
            /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
            public Class<?> f7l8(Class<?> cls) {
                return cls.getSuperclass();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public Class<?> mo16815g(Class<?> cls) {
                return cls;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public Iterable<? extends Class<?>> mo16817n(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$s$zy */
        /* JADX INFO: compiled from: TypeToken.java */
        class zy extends n<K> {
            zy(AbstractC4776s abstractC4776s) {
                super(abstractC4776s);
            }

            @Override // com.google.common.reflect.qrj.AbstractC4776s.n, com.google.common.reflect.qrj.AbstractC4776s
            /* JADX INFO: renamed from: n */
            Iterable<? extends K> mo16817n(K k2) {
                return vep5.of();
            }

            @Override // com.google.common.reflect.qrj.AbstractC4776s
            se<K> zy(Iterable<? extends K> iterable) {
                se.C4520k c4520kBuilder = se.builder();
                for (K k2 : iterable) {
                    if (!mo16815g(k2).isInterface()) {
                        c4520kBuilder.mo15569k(k2);
                    }
                }
                return super.zy(c4520kBuilder.mo15570n());
            }
        }

        private AbstractC4776s() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        private int toq(K k2, Map<? super K, Integer> map) {
            Integer num = map.get(k2);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = mo16815g(k2).isInterface();
            Iterator<? extends K> it = mo16817n(k2).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, toq(it.next(), map));
            }
            K kF7l8 = f7l8(k2);
            int iMax2 = iMax;
            if (kF7l8 != null) {
                iMax2 = Math.max(iMax, toq(kF7l8, map));
            }
            int i2 = iMax2 + 1;
            map.put(k2, Integer.valueOf(i2));
            return i2;
        }

        /* JADX INFO: renamed from: y */
        private static <K, V> se<K> m16814y(Map<K, V> map, Comparator<? super V> comparator) {
            return (se<K>) new q(comparator, map).immutableSortedCopy(map.keySet());
        }

        @NullableDecl
        abstract K f7l8(K k2);

        /* JADX INFO: renamed from: g */
        abstract Class<?> mo16815g(K k2);

        /* JADX INFO: renamed from: k */
        final AbstractC4776s<K> m16816k() {
            return new zy(this);
        }

        /* JADX INFO: renamed from: n */
        abstract Iterable<? extends K> mo16817n(K k2);

        /* JADX INFO: renamed from: q */
        final se<K> m16818q(K k2) {
            return zy(se.of(k2));
        }

        se<K> zy(Iterable<? extends K> iterable) {
            HashMap mapVyq = vy.vyq();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                toq(it.next(), mapVyq);
            }
            return m16814y(mapVyq, kx3.natural().reverse());
        }

        /* synthetic */ AbstractC4776s(C4772k c4772k) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeToken.java */
    class toq extends AbstractC4767n.k<T> {
        toq(Constructor constructor) {
            super(constructor);
        }

        @Override // com.google.common.reflect.AbstractC4767n.k, com.google.common.reflect.AbstractC4767n
        Type[] cdj() {
            return qrj.this.x2().x2(super.cdj());
        }

        @Override // com.google.common.reflect.AbstractC4767n.k, com.google.common.reflect.AbstractC4767n
        /* JADX INFO: renamed from: h */
        Type[] mo16794h() {
            return qrj.this.ld6().x2(super.mo16794h());
        }

        @Override // com.google.common.reflect.AbstractC4767n, com.google.common.reflect.zy
        /* JADX INFO: renamed from: k */
        public qrj<T> mo16796k() {
            return qrj.this;
        }

        @Override // com.google.common.reflect.AbstractC4767n.k, com.google.common.reflect.AbstractC4767n
        Type ki() {
            return qrj.this.ld6().m16786p(super.ki());
        }

        @Override // com.google.common.reflect.AbstractC4767n, com.google.common.reflect.zy
        public String toString() {
            return mo16796k() + "(" + ni7.m15433h(", ").n7h(cdj()) + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.qrj$y */
    /* JADX INFO: compiled from: TypeToken.java */
    private static final class C4777y<T> extends qrj<T> {
        private static final long serialVersionUID = 0;

        C4777y(Type type) {
            super(type, null);
        }
    }

    /* JADX INFO: compiled from: TypeToken.java */
    class zy extends n7h {
        zy() {
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: g */
        void mo16776g(WildcardType wildcardType) {
            m16799k(wildcardType.getLowerBounds());
            m16799k(wildcardType.getUpperBounds());
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: n */
        void mo16777n(TypeVariable<?> typeVariable) {
            throw new IllegalArgumentException(qrj.this.runtimeType + "contains a type variable and is not safe for the operation");
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: q */
        void mo16787q(ParameterizedType parameterizedType) {
            m16799k(parameterizedType.getActualTypeArguments());
            m16799k(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.n7h
        void zy(GenericArrayType genericArrayType) {
            m16799k(genericArrayType.getGenericComponentType());
        }
    }

    /* synthetic */ qrj(Type type, C4772k c4772k) {
        this(type);
    }

    private boolean cdj(Type type, TypeVariable<?> typeVariable) {
        if (this.runtimeType.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return f7l8(this.runtimeType).equals(f7l8(type));
        }
        WildcardType wildcardTypeM16806n = m16806n(typeVariable, (WildcardType) type);
        return m16810y(wildcardTypeM16806n.getUpperBounds()).toq(this.runtimeType) && m16810y(wildcardTypeM16806n.getLowerBounds()).m16813k(this.runtimeType);
    }

    private static Type f7l8(Type type) {
        return type instanceof ParameterizedType ? m16802g((ParameterizedType) type) : type instanceof GenericArrayType ? kja0.ld6(f7l8(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private boolean fn3e(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.runtimeType).getGenericComponentType());
        }
        return false;
    }

    private qrj<?> fu4(Type type) {
        qrj<?> qrjVarOf = of(ld6().m16786p(type));
        qrjVarOf.f27339q = this.f27339q;
        qrjVarOf.f27338k = this.f27338k;
        return qrjVarOf;
    }

    /* JADX INFO: renamed from: g */
    private static ParameterizedType m16802g(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
            actualTypeArguments[i2] = m16808q(typeParameters[i2], actualTypeArguments[i2]);
        }
        return kja0.n7h(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    /* JADX INFO: renamed from: h */
    private qrj<? super T> m16803h(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            qrj<?> qrjVarOf = of(type);
            if (qrjVarOf.isSubtypeOf(cls)) {
                return (qrj<? super T>) qrjVarOf.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: renamed from: i */
    private boolean m16804i(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!o1t(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i2 = 0; i2 < typeParameters.length; i2++) {
            if (!of(ld6().m16786p(typeParameters[i2])).cdj(actualTypeArguments[i2], typeParameters[i2])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || ki(parameterizedType.getOwnerType());
    }

    /* JADX INFO: renamed from: k */
    private static C4773n m16805k(Type[] typeArr) {
        return new C4773n(typeArr, true);
    }

    private boolean ki(Type type) {
        Iterator<qrj<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type typeQrj = it.next().qrj();
            if (typeQrj != null && of(typeQrj).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private qrj<? extends T> kja0(Class<?> cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return (qrj<? extends T>) of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.ld6 ld6() {
        com.google.common.reflect.ld6 ld6Var = this.f27339q;
        if (ld6Var != null) {
            return ld6Var;
        }
        com.google.common.reflect.ld6 ld6VarM16783q = com.google.common.reflect.ld6.m16783q(this.runtimeType);
        this.f27339q = ld6VarM16783q;
        return ld6VarM16783q;
    }

    /* JADX INFO: renamed from: n */
    private static WildcardType m16806n(TypeVariable<?> typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!m16805k(bounds).m16813k(type)) {
                arrayList.add(f7l8(type));
            }
        }
        return new kja0.C4757p(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vep5<Class<? super T>> n7h() {
        vep5.C4532k c4532kBuilder = vep5.builder();
        new C4775q(c4532kBuilder).m16799k(this.runtimeType);
        return c4532kBuilder.mo15570n();
    }

    private static Type ni7(Type type) {
        return kja0.EnumC4756n.JAVA7.newArrayType(type);
    }

    private boolean o1t(Class<?> cls) {
        ab<Class<? super T>> it = n7h().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> qrj<T> of(Class<T> cls) {
        return new C4777y(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    private qrj<? super T> m16807p(Class<? super T> cls) {
        return (qrj<? super T>) of(ni7(((qrj) jk.m15371e(getComponentType(), "%s isn't a super type of %s", cls, this)).getSupertype(cls.getComponentType()).runtimeType));
    }

    /* JADX INFO: renamed from: q */
    private static Type m16808q(TypeVariable<?> typeVariable, Type type) {
        return type instanceof WildcardType ? m16806n(typeVariable, (WildcardType) type) : f7l8(type);
    }

    @NullableDecl
    private Type qrj() {
        Type type = this.runtimeType;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    private qrj<? extends T> m16809s(Class<?> cls) {
        return (qrj<? extends T>) of(ni7(getComponentType().getSubtype(cls.getComponentType()).runtimeType));
    }

    private boolean t8r(GenericArrayType genericArrayType) {
        Type type = this.runtimeType;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    @InterfaceC7732q
    static <T> qrj<? extends T> toGenericType(Class<T> cls) {
        if (cls.isArray()) {
            return (qrj<? extends T>) of(kja0.ld6(toGenericType(cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : toGenericType(cls.getEnclosingClass()).runtimeType;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (qrj<? extends T>) of(kja0.n7h(type, cls, typeParameters)) : of((Class) cls);
    }

    @NullableDecl
    private qrj<? super T> toq(Type type) {
        qrj<? super T> qrjVar = (qrj<? super T>) of(type);
        if (qrjVar.getRawType().isInterface()) {
            return null;
        }
        return qrjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.google.common.reflect.ld6 x2() {
        com.google.common.reflect.ld6 ld6Var = this.f27338k;
        if (ld6Var != null) {
            return ld6Var;
        }
        com.google.common.reflect.ld6 ld6VarM16780g = com.google.common.reflect.ld6.m16780g(this.runtimeType);
        this.f27338k = ld6VarM16780g;
        return ld6VarM16780g;
    }

    /* JADX INFO: renamed from: y */
    private static C4773n m16810y(Type[] typeArr) {
        return new C4773n(typeArr, false);
    }

    /* JADX INFO: renamed from: z */
    private Type m16811z(Class<?> cls) {
        if ((this.runtimeType instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        qrj genericType = toGenericType(cls);
        return new com.google.common.reflect.ld6().n7h(genericType.getSupertype(getRawType()).runtimeType, this.runtimeType).m16786p(genericType.runtimeType);
    }

    private boolean zurt() {
        return com.google.common.primitives.x2.zy().contains(this.runtimeType);
    }

    private se<qrj<? super T>> zy(Type[] typeArr) {
        se.C4520k c4520kBuilder = se.builder();
        for (Type type : typeArr) {
            qrj<?> qrjVarOf = of(type);
            if (qrjVarOf.getRawType().isInterface()) {
                c4520kBuilder.mo15569k(qrjVarOf);
            }
        }
        return c4520kBuilder.mo15570n();
    }

    public final AbstractC4767n<T, T> constructor(Constructor<?> constructor) {
        jk.m15391z(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new toq(constructor);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj instanceof qrj) {
            return this.runtimeType.equals(((qrj) obj).runtimeType);
        }
        return false;
    }

    @NullableDecl
    public final qrj<?> getComponentType() {
        Type typeM16770p = kja0.m16770p(this.runtimeType);
        if (typeM16770p == null) {
            return null;
        }
        return of(typeM16770p);
    }

    final se<qrj<? super T>> getGenericInterfaces() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return zy(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return zy(((WildcardType) type).getUpperBounds());
        }
        se.C4520k c4520kBuilder = se.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            c4520kBuilder.mo15569k(fu4(type2));
        }
        return c4520kBuilder.mo15570n();
    }

    @NullableDecl
    final qrj<? super T> getGenericSuperclass() {
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return toq(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return toq(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return (qrj<? super T>) fu4(genericSuperclass);
    }

    public final Class<? super T> getRawType() {
        return n7h().iterator().next();
    }

    public final qrj<? extends T> getSubtype(Class<?> cls) {
        jk.fn3e(!(this.runtimeType instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.runtimeType;
        if (type instanceof WildcardType) {
            return kja0(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return m16809s(cls);
        }
        jk.m15391z(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        qrj<? extends T> qrjVar = (qrj<? extends T>) of(m16811z(cls));
        jk.m15391z(qrjVar.isSubtypeOf((qrj<?>) this), "%s does not appear to be a subtype of %s", qrjVar, this);
        return qrjVar;
    }

    public final qrj<? super T> getSupertype(Class<? super T> cls) {
        jk.m15391z(o1t(cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        return type instanceof TypeVariable ? m16803h(cls, ((TypeVariable) type).getBounds()) : type instanceof WildcardType ? m16803h(cls, ((WildcardType) type).getUpperBounds()) : cls.isArray() ? m16807p(cls) : (qrj<? super T>) fu4(toGenericType(cls).runtimeType);
    }

    public final Type getType() {
        return this.runtimeType;
    }

    public final qrj<T>.ld6 getTypes() {
        return new ld6();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(qrj<?> qrjVar) {
        return isSubtypeOf(qrjVar.getType());
    }

    public final boolean isSupertypeOf(qrj<?> qrjVar) {
        return qrjVar.isSubtypeOf(getType());
    }

    public final AbstractC4767n<T, Object> method(Method method) {
        jk.m15391z(o1t(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new C4772k(method);
    }

    @CanIgnoreReturnValue
    final qrj<T> rejectTypeVariables() {
        new zy().m16799k(this.runtimeType);
        return this;
    }

    public final qrj<?> resolveType(Type type) {
        jk.a9(type);
        return of(x2().m16786p(type));
    }

    public String toString() {
        return kja0.m16767i(this.runtimeType);
    }

    public final qrj<T> unwrap() {
        return zurt() ? of(com.google.common.primitives.x2.m16741n((Class) this.runtimeType)) : this;
    }

    public final <X> qrj<T> where(AbstractC4768p<X> abstractC4768p, qrj<X> qrjVar) {
        return new C4777y(new com.google.common.reflect.ld6().kja0(zkd.of(new ld6.C4765q(abstractC4768p.f27335k), qrjVar.runtimeType)).m16786p(this.runtimeType));
    }

    public final qrj<T> wrap() {
        return isPrimitive() ? of(com.google.common.primitives.x2.m16739g((Class) this.runtimeType)) : this;
    }

    protected Object writeReplace() {
        return of(new com.google.common.reflect.ld6().m16786p(this.runtimeType));
    }

    /* JADX INFO: compiled from: TypeToken.java */
    private final class f7l8 extends qrj<T>.ld6 {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: n */
        @MonotonicNonNullDecl
        private transient vep5<qrj<? super T>> f27340n;

        /* JADX INFO: renamed from: q */
        private final transient qrj<T>.ld6 f27341q;

        /* JADX INFO: renamed from: com.google.common.reflect.qrj$f7l8$k */
        /* JADX INFO: compiled from: TypeToken.java */
        class C4770k implements a9<Class<?>> {
            C4770k() {
            }

            @Override // com.google.common.base.a9
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public boolean apply(Class<?> cls) {
                return cls.isInterface();
            }
        }

        f7l8(qrj<T>.ld6 ld6Var) {
            super();
            this.f27341q = ld6Var;
        }

        private Object readResolve() {
            return qrj.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.qrj.ld6
        public qrj<T>.ld6 classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.qrj.ld6
        public qrj<T>.ld6 interfaces() {
            return this;
        }

        @Override // com.google.common.reflect.qrj.ld6
        public Set<Class<? super T>> rawTypes() {
            return AbstractC4308a.t8r(AbstractC4776s.f68604toq.zy(qrj.this.n7h())).n7h(new C4770k()).jp0y();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.qrj.ld6, com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<qrj<? super T>> delegate() {
            vep5<qrj<? super T>> vep5Var = this.f27340n;
            if (vep5Var != null) {
                return vep5Var;
            }
            vep5<qrj<? super T>> vep5VarJp0y = AbstractC4308a.t8r(this.f27341q).n7h(EnumC4774p.INTERFACE_ONLY).jp0y();
            this.f27340n = vep5VarJp0y;
            return vep5VarJp0y;
        }
    }

    /* JADX INFO: compiled from: TypeToken.java */
    public class ld6 extends qo<qrj<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        private transient vep5<qrj<? super T>> f27345k;

        ld6() {
        }

        public qrj<T>.ld6 classes() {
            return new C4771g(qrj.this, null);
        }

        public qrj<T>.ld6 interfaces() {
            return new f7l8(this);
        }

        public Set<Class<? super T>> rawTypes() {
            return vep5.copyOf((Collection) AbstractC4776s.f68604toq.zy(qrj.this.n7h()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<qrj<? super T>> delegate() {
            vep5<qrj<? super T>> vep5Var = this.f27345k;
            if (vep5Var != null) {
                return vep5Var;
            }
            vep5<qrj<? super T>> vep5VarJp0y = AbstractC4308a.t8r(AbstractC4776s.f27348k.m16818q(qrj.this)).n7h(EnumC4774p.IGNORE_TYPE_VARIABLE_OR_WILDCARD).jp0y();
            this.f27345k = vep5VarJp0y;
            return vep5VarJp0y;
        }
    }

    protected qrj() {
        Type typeCapture = capture();
        this.runtimeType = typeCapture;
        jk.gyi(!(typeCapture instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", typeCapture);
    }

    public static qrj<?> of(Type type) {
        return new C4777y(type);
    }

    public final boolean isSubtypeOf(Type type) {
        jk.a9(type);
        if (type instanceof WildcardType) {
            return m16805k(((WildcardType) type).getLowerBounds()).toq(this.runtimeType);
        }
        Type type2 = this.runtimeType;
        if (type2 instanceof WildcardType) {
            return m16805k(((WildcardType) type2).getUpperBounds()).m16813k(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || m16805k(((TypeVariable) this.runtimeType).getBounds()).m16813k(type);
        }
        if (type2 instanceof GenericArrayType) {
            return of(type).fn3e((GenericArrayType) this.runtimeType);
        }
        if (type instanceof Class) {
            return o1t((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return m16804i((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return t8r((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    protected qrj(Class<?> cls) {
        Type typeCapture = super.capture();
        if (typeCapture instanceof Class) {
            this.runtimeType = typeCapture;
        } else {
            this.runtimeType = com.google.common.reflect.ld6.m16783q(cls).m16786p(typeCapture);
        }
    }

    public final <X> qrj<T> where(AbstractC4768p<X> abstractC4768p, Class<X> cls) {
        return where(abstractC4768p, of((Class) cls));
    }

    private qrj(Type type) {
        this.runtimeType = (Type) jk.a9(type);
    }
}
