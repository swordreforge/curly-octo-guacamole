package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: ServiceMethod.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class zurt<T> {
    zurt() {
    }

    static <T> zurt<T> toq(fn3e fn3eVar, Method method) {
        t8r qVar = t8r.toq(fn3eVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (C7657z.m28024p(genericReturnType)) {
            throw C7657z.qrj(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType != Void.TYPE) {
            return ld6.m27997g(fn3eVar, method, qVar);
        }
        throw C7657z.qrj(method, "Service methods cannot return void.", new Object[0]);
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    abstract T mo28000k(Object[] objArr);
}
