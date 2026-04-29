package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.a9;
import okhttp3.jp0y;

/* JADX INFO: renamed from: retrofit2.g */
/* JADX INFO: compiled from: Converter.java */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC7637g<F, T> {

    /* JADX INFO: renamed from: retrofit2.g$k */
    /* JADX INFO: compiled from: Converter.java */
    public static abstract class k {
        /* JADX INFO: renamed from: k */
        protected static Type m27973k(int i2, ParameterizedType parameterizedType) {
            return C7657z.f7l8(i2, parameterizedType);
        }

        protected static Class<?> toq(Type type) {
            return C7657z.m28027y(type);
        }

        @Nullable
        /* JADX INFO: renamed from: n */
        public InterfaceC7637g<?, String> m27974n(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: q */
        public InterfaceC7637g<jp0y, ?> mo27950q(Type type, Annotation[] annotationArr, fn3e fn3eVar) {
            return null;
        }

        @Nullable
        public InterfaceC7637g<?, a9> zy(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, fn3e fn3eVar) {
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    T mo27951k(F f2) throws IOException;
}
