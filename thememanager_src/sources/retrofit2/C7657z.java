package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.jp0y;

/* JADX INFO: renamed from: retrofit2.z */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes4.dex */
final class C7657z {

    /* JADX INFO: renamed from: k */
    static final Type[] f44249k = new Type[0];

    /* JADX INFO: renamed from: retrofit2.z$k */
    /* JADX INFO: compiled from: Utils.java */
    private static final class k implements GenericArrayType {

        /* JADX INFO: renamed from: k */
        private final Type f44250k;

        k(Type type) {
            this.f44250k = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C7657z.m28025q(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f44250k;
        }

        public int hashCode() {
            return this.f44250k.hashCode();
        }

        public String toString() {
            return C7657z.m28021i(this.f44250k) + okhttp3.zurt.f43629h;
        }
    }

    /* JADX INFO: renamed from: retrofit2.z$toq */
    /* JADX INFO: compiled from: Utils.java */
    static final class toq implements ParameterizedType {

        /* JADX INFO: renamed from: k */
        @Nullable
        private final Type f44251k;

        /* JADX INFO: renamed from: n */
        private final Type[] f44252n;

        /* JADX INFO: renamed from: q */
        private final Type f44253q;

        toq(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C7657z.toq(type3);
            }
            this.f44251k = type;
            this.f44253q = type2;
            this.f44252n = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C7657z.m28025q(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f44252n.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public Type getOwnerType() {
            return this.f44251k;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f44253q;
        }

        public int hashCode() {
            int iHashCode = Arrays.hashCode(this.f44252n) ^ this.f44253q.hashCode();
            Type type = this.f44251k;
            return iHashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f44252n;
            if (typeArr.length == 0) {
                return C7657z.m28021i(this.f44253q);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C7657z.m28021i(this.f44253q));
            sb.append("<");
            sb.append(C7657z.m28021i(this.f44252n[0]));
            for (int i2 = 1; i2 < this.f44252n.length; i2++) {
                sb.append(", ");
                sb.append(C7657z.m28021i(this.f44252n[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: retrofit2.z$zy */
    /* JADX INFO: compiled from: Utils.java */
    private static final class zy implements WildcardType {

        /* JADX INFO: renamed from: k */
        private final Type f44254k;

        /* JADX INFO: renamed from: q */
        @Nullable
        private final Type f44255q;

        zy(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Type type = typeArr[0];
                type.getClass();
                C7657z.toq(type);
                this.f44255q = null;
                this.f44254k = typeArr[0];
                return;
            }
            Type type2 = typeArr2[0];
            type2.getClass();
            C7657z.toq(type2);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f44255q = typeArr2[0];
            this.f44254k = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C7657z.m28025q(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f44255q;
            return type != null ? new Type[]{type} : C7657z.f44249k;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f44254k};
        }

        public int hashCode() {
            Type type = this.f44255q;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f44254k.hashCode() + 31);
        }

        public String toString() {
            if (this.f44255q != null) {
                return "? super " + C7657z.m28021i(this.f44255q);
            }
            if (this.f44254k == Object.class) {
                return "?";
            }
            return "? extends " + C7657z.m28021i(this.f44254k);
        }
    }

    private C7657z() {
    }

    static Type cdj(Type type, Class<?> cls, Type type2) {
        Type type3 = type2;
        while (type3 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type3;
            Type typeKi = ki(type, cls, typeVariable);
            if (typeKi == typeVariable) {
                return typeKi;
            }
            type3 = typeKi;
        }
        if (type3 instanceof Class) {
            Class cls2 = (Class) type3;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeCdj = cdj(type, cls, componentType);
                return componentType == typeCdj ? cls2 : new k(typeCdj);
            }
        }
        if (type3 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type3;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeCdj2 = cdj(type, cls, genericComponentType);
            return genericComponentType == typeCdj2 ? genericArrayType : new k(typeCdj2);
        }
        if (type3 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type3;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeCdj3 = cdj(type, cls, ownerType);
            boolean z2 = typeCdj3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeCdj4 = cdj(type, cls, actualTypeArguments[i2]);
                if (typeCdj4 != actualTypeArguments[i2]) {
                    if (!z2) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z2 = true;
                    }
                    actualTypeArguments[i2] = typeCdj4;
                }
            }
            return z2 ? new toq(typeCdj3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z3 = type3 instanceof WildcardType;
        Type type4 = type3;
        if (z3) {
            WildcardType wildcardType = (WildcardType) type3;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeCdj5 = cdj(type, cls, lowerBounds[0]);
                type4 = wildcardType;
                if (typeCdj5 != lowerBounds[0]) {
                    return new zy(new Type[]{Object.class}, new Type[]{typeCdj5});
                }
            } else {
                type4 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeCdj6 = cdj(type, cls, upperBounds[0]);
                    type4 = wildcardType;
                    if (typeCdj6 != upperBounds[0]) {
                        return new zy(new Type[]{typeCdj6}, f44249k);
                    }
                }
            }
        }
        return type4;
    }

    static Type f7l8(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        throw new IllegalArgumentException("Index " + i2 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
    }

    /* JADX INFO: renamed from: g */
    static Type m28019g(int i2, ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[i2];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    /* JADX INFO: renamed from: h */
    static RuntimeException m28020h(Method method, Throwable th, int i2, String str, Object... objArr) {
        return n7h(method, th, str + " (parameter #" + (i2 + 1) + ")", objArr);
    }

    /* JADX INFO: renamed from: i */
    static String m28021i(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: k */
    static jp0y m28022k(jp0y jp0yVar) throws IOException {
        okio.x2 x2Var = new okio.x2();
        jp0yVar.y9n().ukdy(x2Var);
        return jp0y.fu4(jp0yVar.mo27094h(), jp0yVar.x2(), x2Var);
    }

    private static Type ki(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsZy = zy(typeVariable);
        if (clsZy == null) {
            return typeVariable;
        }
        Type typeM28023n = m28023n(type, cls, clsZy);
        if (!(typeM28023n instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM28023n).getActualTypeArguments()[ld6(clsZy.getTypeParameters(), typeVariable)];
    }

    static RuntimeException kja0(Method method, int i2, String str, Object... objArr) {
        return qrj(method, str + " (parameter #" + (i2 + 1) + ")", objArr);
    }

    private static int ld6(Object[] objArr, Object obj) {
        for (int i2 = 0; i2 < objArr.length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: n */
    static Type m28023n(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return m28023n(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m28023n(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    static RuntimeException n7h(Method method, @Nullable Throwable th, String str, Object... objArr) {
        return new IllegalArgumentException(String.format(str, objArr) + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), th);
    }

    /* JADX INFO: renamed from: p */
    static boolean m28024p(@Nullable Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (m28024p(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return m28024p(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: q */
    static boolean m28025q(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m28025q(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    static RuntimeException qrj(Method method, String str, Object... objArr) {
        return n7h(method, null, str, objArr);
    }

    /* JADX INFO: renamed from: s */
    static Type m28026s(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return cdj(type, cls, m28023n(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    static void t8r(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    static void toq(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static boolean x2(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    static Class<?> m28027y(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m28027y(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m28027y(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    @Nullable
    private static Class<?> zy(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }
}
