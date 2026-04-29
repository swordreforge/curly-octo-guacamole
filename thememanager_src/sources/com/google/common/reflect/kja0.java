package com.google.common.reflect;

import com.google.common.base.C4280z;
import com.google.common.base.fti;
import com.google.common.base.jk;
import com.google.common.base.ni7;
import com.google.common.base.t8r;
import com.google.common.collect.ab;
import com.google.common.collect.nsb;
import com.google.common.collect.se;
import com.google.common.collect.zkd;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.eqxt;
import okhttp3.zurt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Types.java */
/* JADX INFO: loaded from: classes2.dex */
final class kja0 {

    /* JADX INFO: renamed from: k */
    private static final t8r<Type, String> f27320k = new C4755k();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ni7 f68589toq = ni7.m15433h(", ").t8r("null");

    /* JADX INFO: compiled from: Types.java */
    private static final class f7l8 implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final se<Type> argumentsList;

        @NullableDecl
        private final Type ownerType;
        private final Class<?> rawType;

        f7l8(@NullableDecl Type type, Class<?> cls, Type[] typeArr) {
            jk.a9(cls);
            jk.m15383q(typeArr.length == cls.getTypeParameters().length);
            kja0.f7l8(typeArr, "type parameter");
            this.ownerType = type;
            this.rawType = cls;
            this.argumentsList = EnumC4756n.CURRENT.usedInGenericType(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && C4280z.m15455k(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return kja0.t8r(this.argumentsList);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            Type type = this.ownerType;
            return ((type == null ? 0 : type.hashCode()) ^ this.argumentsList.hashCode()) ^ this.rawType.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.ownerType != null) {
                EnumC4756n enumC4756n = EnumC4756n.CURRENT;
                if (enumC4756n.jdkTypeDuplicatesOwnerName()) {
                    sb.append(enumC4756n.typeName(this.ownerType));
                    sb.append('.');
                }
            }
            sb.append(this.rawType.getName());
            sb.append(eqxt.f36672n);
            sb.append(kja0.f68589toq.ld6(nsb.m15901f(this.argumentsList, kja0.f27320k)));
            sb.append(eqxt.f36668g);
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.kja0$g */
    /* JADX INFO: compiled from: Types.java */
    static final class C4754g<X> {

        /* JADX INFO: renamed from: k */
        static final boolean f27321k = !C4754g.class.getTypeParameters()[0].equals(kja0.x2(C4754g.class, "X", new Type[0]));

        C4754g() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.kja0$k */
    /* JADX INFO: compiled from: Types.java */
    static class C4755k implements t8r<Type, String> {
        C4755k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String apply(Type type) {
            return EnumC4756n.CURRENT.typeName(type);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.google.common.reflect.kja0$n */
    /* JADX INFO: compiled from: Types.java */
    static abstract class EnumC4756n {
        static final EnumC4756n CURRENT;
        public static final EnumC4756n JAVA6;
        public static final EnumC4756n JAVA7;
        public static final EnumC4756n JAVA8;
        public static final EnumC4756n JAVA9;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ EnumC4756n[] f27322k;

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$n$g */
        /* JADX INFO: compiled from: Types.java */
        static class g extends AbstractC4778s<int[]> {
            g() {
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$n$k */
        /* JADX INFO: compiled from: Types.java */
        enum k extends EnumC4756n {
            k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type usedInGenericType(Type type) {
                jk.a9(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new C4758q(cls.getComponentType()) : type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.kja0.EnumC4756n
            public GenericArrayType newArrayType(Type type) {
                return new C4758q(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$n$n */
        /* JADX INFO: compiled from: Types.java */
        static class n extends AbstractC4778s<Map.Entry<String, int[][]>> {
            n() {
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$n$q */
        /* JADX INFO: compiled from: Types.java */
        enum q extends EnumC4756n {
            q(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            boolean jdkTypeDuplicatesOwnerName() {
                return false;
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type newArrayType(Type type) {
                return EnumC4756n.JAVA8.newArrayType(type);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            String typeName(Type type) {
                return EnumC4756n.JAVA8.typeName(type);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type usedInGenericType(Type type) {
                return EnumC4756n.JAVA8.usedInGenericType(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$n$toq */
        /* JADX INFO: compiled from: Types.java */
        enum toq extends EnumC4756n {
            toq(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type newArrayType(Type type) {
                return type instanceof Class ? kja0.m16772s((Class) type) : new C4758q(type);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type usedInGenericType(Type type) {
                return (Type) jk.a9(type);
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$n$zy */
        /* JADX INFO: compiled from: Types.java */
        enum zy extends EnumC4756n {
            zy(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type newArrayType(Type type) {
                return EnumC4756n.JAVA7.newArrayType(type);
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            String typeName(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.kja0.EnumC4756n
            Type usedInGenericType(Type type) {
                return EnumC4756n.JAVA7.usedInGenericType(type);
            }
        }

        static {
            k kVar = new k("JAVA6", 0);
            JAVA6 = kVar;
            toq toqVar = new toq("JAVA7", 1);
            JAVA7 = toqVar;
            zy zyVar = new zy("JAVA8", 2);
            JAVA8 = zyVar;
            q qVar = new q("JAVA9", 3);
            JAVA9 = qVar;
            f27322k = new EnumC4756n[]{kVar, toqVar, zyVar, qVar};
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new n().capture().toString().contains("java.util.Map.java.util.Map")) {
                    CURRENT = zyVar;
                    return;
                } else {
                    CURRENT = qVar;
                    return;
                }
            }
            if (new g().capture() instanceof Class) {
                CURRENT = toqVar;
            } else {
                CURRENT = kVar;
            }
        }

        private EnumC4756n(String str, int i2) {
        }

        public static EnumC4756n valueOf(String str) {
            return (EnumC4756n) Enum.valueOf(EnumC4756n.class, str);
        }

        public static EnumC4756n[] values() {
            return (EnumC4756n[]) f27322k.clone();
        }

        boolean jdkTypeDuplicatesOwnerName() {
            return true;
        }

        abstract Type newArrayType(Type type);

        String typeName(Type type) {
            return kja0.m16767i(type);
        }

        final se<Type> usedInGenericType(Type[] typeArr) {
            se.C4520k c4520kBuilder = se.builder();
            for (Type type : typeArr) {
                c4520kBuilder.mo15569k(usedInGenericType(type));
            }
            return c4520kBuilder.mo15570n();
        }

        abstract Type usedInGenericType(Type type);

        /* synthetic */ EnumC4756n(String str, int i2, C4755k c4755k) {
            this(str, i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.kja0$p */
    /* JADX INFO: compiled from: Types.java */
    static final class C4757p implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final se<Type> lowerBounds;
        private final se<Type> upperBounds;

        C4757p(Type[] typeArr, Type[] typeArr2) {
            kja0.f7l8(typeArr, "lower bound for wildcard");
            kja0.f7l8(typeArr2, "upper bound for wildcard");
            EnumC4756n enumC4756n = EnumC4756n.CURRENT;
            this.lowerBounds = enumC4756n.usedInGenericType(typeArr);
            this.upperBounds = enumC4756n.usedInGenericType(typeArr2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) obj;
            return this.lowerBounds.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.upperBounds.equals(Arrays.asList(wildcardType.getUpperBounds()));
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return kja0.t8r(this.lowerBounds);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return kja0.t8r(this.upperBounds);
        }

        public int hashCode() {
            return this.lowerBounds.hashCode() ^ this.upperBounds.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("?");
            ab<Type> it = this.lowerBounds.iterator();
            while (it.hasNext()) {
                Type next = it.next();
                sb.append(" super ");
                sb.append(EnumC4756n.CURRENT.typeName(next));
            }
            for (Type type : kja0.m16773y(this.upperBounds)) {
                sb.append(" extends ");
                sb.append(EnumC4756n.CURRENT.typeName(type));
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.kja0$q */
    /* JADX INFO: compiled from: Types.java */
    private static final class C4758q implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        C4758q(Type type) {
            this.componentType = EnumC4756n.CURRENT.usedInGenericType(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return C4280z.m15455k(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return kja0.m16767i(this.componentType) + zurt.f43629h;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.kja0$s */
    /* JADX INFO: compiled from: Types.java */
    private static final class C4759s implements InvocationHandler {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final zkd<String, Method> f68590toq;

        /* JADX INFO: renamed from: k */
        private final C4760y<?> f27323k;

        static {
            zkd.toq toqVarBuilder = zkd.builder();
            for (Method method : C4760y.class.getMethods()) {
                if (method.getDeclaringClass().equals(C4760y.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    toqVarBuilder.mo15592q(method.getName(), method);
                }
            }
            f68590toq = toqVarBuilder.mo15589k();
        }

        C4759s(C4760y<?> c4760y) {
            this.f27323k = c4760y;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = f68590toq.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f27323k, objArr);
            } catch (InvocationTargetException e2) {
                throw e2.getCause();
            }
        }
    }

    /* JADX INFO: compiled from: Types.java */
    static class toq extends n7h {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ AtomicReference f68591toq;

        toq(AtomicReference atomicReference) {
            this.f68591toq = atomicReference;
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: g */
        void mo16776g(WildcardType wildcardType) {
            this.f68591toq.set(kja0.cdj(wildcardType.getUpperBounds()));
        }

        @Override // com.google.common.reflect.n7h
        /* JADX INFO: renamed from: n */
        void mo16777n(TypeVariable<?> typeVariable) {
            this.f68591toq.set(kja0.cdj(typeVariable.getBounds()));
        }

        @Override // com.google.common.reflect.n7h
        void toq(Class<?> cls) {
            this.f68591toq.set(cls.getComponentType());
        }

        @Override // com.google.common.reflect.n7h
        void zy(GenericArrayType genericArrayType) {
            this.f68591toq.set(genericArrayType.getGenericComponentType());
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.kja0$y */
    /* JADX INFO: compiled from: Types.java */
    private static final class C4760y<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: k */
        private final D f27324k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f68592toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final se<Type> f68593zy;

        C4760y(D d2, String str, Type[] typeArr) {
            kja0.f7l8(typeArr, "bound for type variable");
            this.f27324k = (D) jk.a9(d2);
            this.f68592toq = (String) jk.a9(str);
            this.f68593zy = se.copyOf(typeArr);
        }

        public boolean equals(Object obj) {
            if (!C4754g.f27321k) {
                if (!(obj instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) obj;
                return this.f68592toq.equals(typeVariable.getName()) && this.f27324k.equals(typeVariable.getGenericDeclaration());
            }
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C4759s)) {
                return false;
            }
            C4760y c4760y = ((C4759s) Proxy.getInvocationHandler(obj)).f27323k;
            return this.f68592toq.equals(c4760y.zy()) && this.f27324k.equals(c4760y.toq()) && this.f68593zy.equals(c4760y.f68593zy);
        }

        public int hashCode() {
            return this.f27324k.hashCode() ^ this.f68592toq.hashCode();
        }

        /* JADX INFO: renamed from: k */
        public Type[] m16778k() {
            return kja0.t8r(this.f68593zy);
        }

        /* JADX INFO: renamed from: q */
        public String m16779q() {
            return this.f68592toq;
        }

        public String toString() {
            return this.f68592toq;
        }

        public D toq() {
            return this.f27324k;
        }

        public String zy() {
            return this.f68592toq;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Types.java */
    private static abstract class zy {
        static final zy JVM_BEHAVIOR;
        public static final zy LOCAL_CLASS_HAS_NO_OWNER;
        public static final zy OWNED_BY_ENCLOSING_CLASS;

        /* JADX INFO: renamed from: k */
        private static final /* synthetic */ zy[] f27325k;

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$zy$k */
        /* JADX INFO: compiled from: Types.java */
        enum C4761k extends zy {
            C4761k(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.reflect.kja0.zy
            @NullableDecl
            Class<?> getOwnerType(Class<?> cls) {
                return cls.getEnclosingClass();
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$zy$q */
        /* JADX INFO: compiled from: Types.java */
        static class C4762q extends toq<String> {
            C4762q() {
            }
        }

        /* JADX INFO: compiled from: Types.java */
        class toq<T> {
            toq() {
            }
        }

        /* JADX INFO: renamed from: com.google.common.reflect.kja0$zy$zy, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Types.java */
        enum C8014zy extends zy {
            C8014zy(String str, int i2) {
                super(str, i2, null);
            }

            @Override // com.google.common.reflect.kja0.zy
            @NullableDecl
            Class<?> getOwnerType(Class<?> cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        }

        static {
            C4761k c4761k = new C4761k("OWNED_BY_ENCLOSING_CLASS", 0);
            OWNED_BY_ENCLOSING_CLASS = c4761k;
            C8014zy c8014zy = new C8014zy("LOCAL_CLASS_HAS_NO_OWNER", 1);
            LOCAL_CLASS_HAS_NO_OWNER = c8014zy;
            f27325k = new zy[]{c4761k, c8014zy};
            JVM_BEHAVIOR = toq();
        }

        private zy(String str, int i2) {
        }

        private static zy toq() {
            new C4762q();
            ParameterizedType parameterizedType = (ParameterizedType) C4762q.class.getGenericSuperclass();
            for (zy zyVar : values()) {
                if (zyVar.getOwnerType(toq.class) == parameterizedType.getOwnerType()) {
                    return zyVar;
                }
            }
            throw new AssertionError();
        }

        public static zy valueOf(String str) {
            return (zy) Enum.valueOf(zy.class, str);
        }

        public static zy[] values() {
            return (zy[]) f27325k.clone();
        }

        @NullableDecl
        abstract Class<?> getOwnerType(Class<?> cls);

        /* synthetic */ zy(String str, int i2, C4755k c4755k) {
            this(str, i2);
        }
    }

    private kja0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NullableDecl
    public static Type cdj(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeM16770p = m16770p(type);
            if (typeM16770p != null) {
                if (typeM16770p instanceof Class) {
                    Class cls = (Class) typeM16770p;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return m16766h(typeM16770p);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f7l8(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                jk.m15391z(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: h */
    static WildcardType m16766h(Type type) {
        return new C4757p(new Type[0], new Type[]{type});
    }

    /* JADX INFO: renamed from: i */
    static String m16767i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    @InterfaceC7732q
    static WildcardType ki(Type type) {
        return new C4757p(new Type[]{type}, new Type[]{Object.class});
    }

    private static <D extends GenericDeclaration> TypeVariable<D> kja0(D d2, String str, Type[] typeArr) {
        return (TypeVariable) C4782y.m16846q(TypeVariable.class, new C4759s(new C4760y(d2, str, typeArr)));
    }

    static Type ld6(Type type) {
        if (!(type instanceof WildcardType)) {
            return EnumC4756n.CURRENT.newArrayType(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        jk.m15380n(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return ki(ld6(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        jk.m15380n(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return m16766h(ld6(upperBounds[0]));
    }

    static ParameterizedType n7h(@NullableDecl Type type, Class<?> cls, Type... typeArr) {
        if (type == null) {
            return qrj(cls, typeArr);
        }
        jk.a9(typeArr);
        jk.fn3e(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new f7l8(type, cls, typeArr);
    }

    @NullableDecl
    /* JADX INFO: renamed from: p */
    static Type m16770p(Type type) {
        jk.a9(type);
        AtomicReference atomicReference = new AtomicReference();
        new toq(atomicReference).m16799k(type);
        return (Type) atomicReference.get();
    }

    static ParameterizedType qrj(Class<?> cls, Type... typeArr) {
        return new f7l8(zy.JVM_BEHAVIOR.getOwnerType(cls), cls, typeArr);
    }

    /* JADX INFO: renamed from: s */
    static Class<?> m16772s(Class<?> cls) {
        return Array.newInstance(cls, 0).getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] t8r(Collection<Type> collection) {
        return (Type[]) collection.toArray(new Type[collection.size()]);
    }

    static <D extends GenericDeclaration> TypeVariable<D> x2(D d2, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return kja0(d2, str, typeArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static Iterable<Type> m16773y(Iterable<Type> iterable) {
        return nsb.kja0(iterable, fti.cdj(fti.qrj(Object.class)));
    }
}
