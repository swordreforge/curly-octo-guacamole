package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: CallAdapter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface zy<R, T> {

    /* JADX INFO: renamed from: retrofit2.zy$k */
    /* JADX INFO: compiled from: CallAdapter.java */
    public static abstract class AbstractC7658k {
        protected static Type toq(int i2, ParameterizedType parameterizedType) {
            return C7657z.f7l8(i2, parameterizedType);
        }

        protected static Class<?> zy(Type type) {
            return C7657z.m28027y(type);
        }

        @Nullable
        /* JADX INFO: renamed from: k */
        public abstract zy<?, ?> mo27952k(Type type, Annotation[] annotationArr, fn3e fn3eVar);
    }

    /* JADX INFO: renamed from: k */
    Type mo27953k();

    T toq(toq<R> toqVar);
}
