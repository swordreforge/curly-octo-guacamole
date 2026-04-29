package com.google.common.reflect;

import com.google.common.collect.g0ad;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: compiled from: TypeVisitor.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class n7h {

    /* JADX INFO: renamed from: k */
    private final Set<Type> f27334k = g0ad.fn3e();

    n7h() {
    }

    /* JADX INFO: renamed from: g */
    void mo16776g(WildcardType wildcardType) {
    }

    /* JADX INFO: renamed from: k */
    public final void m16799k(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f27334k.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo16777n((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo16776g((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo16787q((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        toq((Class) type);
                    } else {
                        if (!(type instanceof GenericArrayType)) {
                            throw new AssertionError("Unknown type: " + type);
                        }
                        zy((GenericArrayType) type);
                    }
                } catch (Throwable th) {
                    this.f27334k.remove(type);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void mo16777n(TypeVariable<?> typeVariable) {
    }

    /* JADX INFO: renamed from: q */
    void mo16787q(ParameterizedType parameterizedType) {
    }

    void toq(Class<?> cls) {
    }

    void zy(GenericArrayType genericArrayType) {
    }
}
