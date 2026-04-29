package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import okhttp3.zurt;

/* JADX INFO: compiled from: $Gson$Types.java */
/* JADX INFO: loaded from: classes3.dex */
public final class toq {

    /* JADX INFO: renamed from: k */
    static final Type[] f27801k = new Type[0];

    /* JADX INFO: renamed from: com.google.gson.internal.toq$k */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class C4908k implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public C4908k(Type type) {
            this.componentType = toq.toq(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && toq.m17196g(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return toq.fn3e(this.componentType) + zurt.f43629h;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class C8020toq implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public C8020toq(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                boolean z3 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z3) {
                    z2 = false;
                }
                C4899k.m17165k(z2);
            }
            this.ownerType = type == null ? null : toq.toq(type);
            this.rawType = toq.toq(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                C4899k.toq(this.typeArguments[i2]);
                toq.zy(this.typeArguments[i2]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i2] = toq.toq(typeArr3[i2]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && toq.m17196g(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
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
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ toq.qrj(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return toq.fn3e(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(toq.fn3e(this.rawType));
            sb.append("<");
            sb.append(toq.fn3e(this.typeArguments[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ");
                sb.append(toq.fn3e(this.typeArguments[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: $Gson$Types.java */
    private static final class zy implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public zy(Type[] typeArr, Type[] typeArr2) {
            C4899k.m17165k(typeArr2.length <= 1);
            C4899k.m17165k(typeArr.length == 1);
            if (typeArr2.length != 1) {
                C4899k.toq(typeArr[0]);
                toq.zy(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = toq.toq(typeArr[0]);
                return;
            }
            C4899k.toq(typeArr2[0]);
            toq.zy(typeArr2[0]);
            C4899k.m17165k(typeArr[0] == Object.class);
            this.lowerBound = toq.toq(typeArr2[0]);
            this.upperBound = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && toq.m17196g(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : toq.f27801k;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + toq.fn3e(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + toq.fn3e(this.upperBound);
        }
    }

    private toq() {
        throw new UnsupportedOperationException();
    }

    private static Type cdj(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            type2 = ki(type, cls, typeVariable);
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls2 = (Class) type2;
            if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                Type typeCdj = cdj(type, cls, componentType, collection);
                return componentType == typeCdj ? cls2 : m17199k(typeCdj);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeCdj2 = cdj(type, cls, genericComponentType, collection);
            return genericComponentType == typeCdj2 ? genericArrayType : m17199k(typeCdj2);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeCdj3 = cdj(type, cls, ownerType, collection);
            boolean z2 = typeCdj3 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            for (int i2 = 0; i2 < length; i2++) {
                Type typeCdj4 = cdj(type, cls, actualTypeArguments[i2], collection);
                if (typeCdj4 != actualTypeArguments[i2]) {
                    if (!z2) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z2 = true;
                    }
                    actualTypeArguments[i2] = typeCdj4;
                }
            }
            return z2 ? kja0(typeCdj3, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        boolean z3 = type2 instanceof WildcardType;
        Type type3 = type2;
        if (z3) {
            WildcardType wildcardType = (WildcardType) type2;
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (lowerBounds.length == 1) {
                Type typeCdj5 = cdj(type, cls, lowerBounds[0], collection);
                type3 = wildcardType;
                if (typeCdj5 != lowerBounds[0]) {
                    return m17198i(typeCdj5);
                }
            } else {
                type3 = wildcardType;
                if (upperBounds.length == 1) {
                    Type typeCdj6 = cdj(type, cls, upperBounds[0], collection);
                    type3 = wildcardType;
                    if (typeCdj6 != upperBounds[0]) {
                        return t8r(typeCdj6);
                    }
                }
            }
        }
        return type3;
    }

    public static Type f7l8(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static String fn3e(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m17196g(Type type, Type type2) {
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
            return m17200n(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return m17196g(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* JADX INFO: renamed from: h */
    public static Type m17197h(Type type, Class<?> cls, Type type2) {
        return cdj(type, cls, type2, new HashSet());
    }

    /* JADX INFO: renamed from: i */
    public static WildcardType m17198i(Type type) {
        return new zy(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    /* JADX INFO: renamed from: k */
    public static GenericArrayType m17199k(Type type) {
        return new C4908k(type);
    }

    static Type ki(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsM17202q = m17202q(typeVariable);
        if (clsM17202q == null) {
            return typeVariable;
        }
        Type typeM17203s = m17203s(type, cls, clsM17202q);
        if (!(typeM17203s instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) typeM17203s).getActualTypeArguments()[n7h(clsM17202q.getTypeParameters(), typeVariable)];
    }

    public static ParameterizedType kja0(Type type, Type type2, Type... typeArr) {
        return new C8020toq(type, type2, typeArr);
    }

    public static Class<?> ld6(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C4899k.m17165k(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(ld6(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return ld6(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX INFO: renamed from: n */
    static boolean m17200n(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private static int n7h(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: p */
    public static Type[] m17201p(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeX2 = x2(type, cls, Map.class);
        return typeX2 instanceof ParameterizedType ? ((ParameterizedType) typeX2).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    /* JADX INFO: renamed from: q */
    private static Class<?> m17202q(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    static int qrj(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    static Type m17203s(Type type, Class<?> cls, Class<?> cls2) {
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
                    return m17203s(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
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
                    return m17203s(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static WildcardType t8r(Type type) {
        return new zy(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f27801k);
    }

    public static Type toq(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C4908k(toq(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C8020toq(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C4908k(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new zy(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    static Type x2(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C4899k.m17165k(cls2.isAssignableFrom(cls));
        return m17197h(type, cls, m17203s(type, cls, cls2));
    }

    /* JADX INFO: renamed from: y */
    public static Type m17204y(Type type, Class<?> cls) {
        Type typeX2 = x2(type, cls, Collection.class);
        if (typeX2 instanceof WildcardType) {
            typeX2 = ((WildcardType) typeX2).getUpperBounds()[0];
        }
        return typeX2 instanceof ParameterizedType ? ((ParameterizedType) typeX2).getActualTypeArguments()[0] : Object.class;
    }

    static void zy(Type type) {
        C4899k.m17165k(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }
}
