package com.google.common.reflect;

import com.google.common.base.jk;
import com.google.common.collect.se;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.reflect.n */
/* JADX INFO: compiled from: Invokable.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public abstract class AbstractC4767n<T, R> extends zy implements GenericDeclaration {

    /* JADX INFO: renamed from: com.google.common.reflect.n$k */
    /* JADX INFO: compiled from: Invokable.java */
    static class k<T> extends AbstractC4767n<T, T> {

        /* JADX INFO: renamed from: n */
        final Constructor<?> f27332n;

        k(Constructor<?> constructor) {
            super(constructor);
            this.f27332n = constructor;
        }

        /* JADX INFO: renamed from: t */
        private boolean m16798t() {
            Class<?> declaringClass = this.f27332n.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() != null) {
                return true;
            }
            return declaringClass.getEnclosingMethod() != null ? !Modifier.isStatic(r1.getModifiers()) : (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) ? false : true;
        }

        @Override // com.google.common.reflect.AbstractC4767n
        Type[] cdj() {
            Type[] genericParameterTypes = this.f27332n.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0 || !m16798t()) {
                return genericParameterTypes;
            }
            Class<?>[] parameterTypes = this.f27332n.getParameterTypes();
            return (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) ? (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length) : genericParameterTypes;
        }

        @Override // com.google.common.reflect.AbstractC4767n
        public final boolean fu4() {
            return false;
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f27332n.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[typeParameters.length + typeParameters2.length];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        @Override // com.google.common.reflect.AbstractC4767n
        /* JADX INFO: renamed from: h */
        Type[] mo16794h() {
            return this.f27332n.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        Type ki() {
            Class<? super T> declaringClass = getDeclaringClass();
            TypeVariable<Class<? super T>>[] typeParameters = declaringClass.getTypeParameters();
            return typeParameters.length > 0 ? kja0.qrj(declaringClass, typeParameters) : declaringClass;
        }

        @Override // com.google.common.reflect.AbstractC4767n
        final Object ni7(@NullableDecl Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            try {
                return this.f27332n.newInstance(objArr);
            } catch (InstantiationException e2) {
                throw new RuntimeException(this.f27332n + " failed.", e2);
            }
        }

        @Override // com.google.common.reflect.AbstractC4767n
        final Annotation[][] t8r() {
            return this.f27332n.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        /* JADX INFO: renamed from: z */
        public final boolean mo16797z() {
            return this.f27332n.isVarArgs();
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.n$toq */
    /* JADX INFO: compiled from: Invokable.java */
    static class toq<T> extends AbstractC4767n<T, Object> {

        /* JADX INFO: renamed from: n */
        final Method f27333n;

        toq(Method method) {
            super(method);
            this.f27333n = method;
        }

        @Override // com.google.common.reflect.AbstractC4767n
        Type[] cdj() {
            return this.f27333n.getGenericParameterTypes();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        public final boolean fu4() {
            return (zy() || m16847g() || m16851s() || Modifier.isFinal(getDeclaringClass().getModifiers())) ? false : true;
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f27333n.getTypeParameters();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        /* JADX INFO: renamed from: h */
        Type[] mo16794h() {
            return this.f27333n.getGenericExceptionTypes();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        Type ki() {
            return this.f27333n.getGenericReturnType();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        final Object ni7(@NullableDecl Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
            return this.f27333n.invoke(obj, objArr);
        }

        @Override // com.google.common.reflect.AbstractC4767n
        final Annotation[][] t8r() {
            return this.f27333n.getParameterAnnotations();
        }

        @Override // com.google.common.reflect.AbstractC4767n
        /* JADX INFO: renamed from: z */
        public final boolean mo16797z() {
            return this.f27333n.isVarArgs();
        }
    }

    <M extends AccessibleObject & Member> AbstractC4767n(M m2) {
        super(m2);
    }

    public static AbstractC4767n<?, Object> n7h(Method method) {
        return new toq(method);
    }

    public static <T> AbstractC4767n<T, T> qrj(Constructor<T> constructor) {
        return new k(constructor);
    }

    abstract Type[] cdj();

    @Override // com.google.common.reflect.zy
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public final qrj<? extends R> fn3e() {
        return (qrj<? extends R>) qrj.of(ki());
    }

    public abstract boolean fu4();

    @Override // com.google.common.reflect.zy, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) super.getDeclaringClass();
    }

    /* JADX INFO: renamed from: h */
    abstract Type[] mo16794h();

    @Override // com.google.common.reflect.zy
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final se<f7l8> m16795i() {
        Type[] typeArrCdj = cdj();
        Annotation[][] annotationArrT8r = t8r();
        se.C4520k c4520kBuilder = se.builder();
        for (int i2 = 0; i2 < typeArrCdj.length; i2++) {
            c4520kBuilder.mo15569k(new f7l8(this, i2, qrj.of(typeArrCdj[i2]), annotationArrT8r[i2]));
        }
        return c4520kBuilder.mo15570n();
    }

    @Override // com.google.common.reflect.zy
    /* JADX INFO: renamed from: k */
    public qrj<T> mo16796k() {
        return qrj.of((Class) getDeclaringClass());
    }

    abstract Type ki();

    public final se<qrj<? extends Throwable>> kja0() {
        se.C4520k c4520kBuilder = se.builder();
        for (Type type : mo16794h()) {
            c4520kBuilder.mo15569k(qrj.of(type));
        }
        return c4520kBuilder.mo15570n();
    }

    abstract Object ni7(@NullableDecl Object obj, Object[] objArr) throws IllegalAccessException, InvocationTargetException;

    /* JADX WARN: Multi-variable type inference failed */
    public final <R1 extends R> AbstractC4767n<T, R1> o1t(qrj<R1> qrjVar) {
        if (qrjVar.isSupertypeOf(fn3e())) {
            return this;
        }
        throw new IllegalArgumentException("Invokable is known to return " + fn3e() + ", not " + qrjVar);
    }

    abstract Annotation[][] t8r();

    @Override // com.google.common.reflect.zy
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public final <R1 extends R> AbstractC4767n<T, R1> wvg(Class<R1> cls) {
        return o1t(qrj.of((Class) cls));
    }

    /* JADX INFO: renamed from: z */
    public abstract boolean mo16797z();

    @CanIgnoreReturnValue
    public final R zurt(@NullableDecl T t2, Object... objArr) throws IllegalAccessException, InvocationTargetException {
        return (R) ni7(t2, (Object[]) jk.a9(objArr));
    }
}
