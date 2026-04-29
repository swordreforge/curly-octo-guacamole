package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.coroutines.InterfaceC6216q;
import okhttp3.InterfaceC7519n;
import okhttp3.fti;
import okhttp3.jp0y;
import retrofit2.C7657z;

/* JADX INFO: compiled from: HttpServiceMethod.java */
/* JADX INFO: loaded from: classes4.dex */
abstract class ld6<ResponseT, ReturnT> extends zurt<ReturnT> {

    /* JADX INFO: renamed from: k */
    private final t8r f44190k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final InterfaceC7519n.k f94724toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final InterfaceC7637g<jp0y, ResponseT> f94725zy;

    /* JADX INFO: renamed from: retrofit2.ld6$k */
    /* JADX INFO: compiled from: HttpServiceMethod.java */
    static final class C7643k<ResponseT, ReturnT> extends ld6<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: q */
        private final retrofit2.zy<ResponseT, ReturnT> f44191q;

        C7643k(t8r t8rVar, InterfaceC7519n.k kVar, InterfaceC7637g<jp0y, ResponseT> interfaceC7637g, retrofit2.zy<ResponseT, ReturnT> zyVar) {
            super(t8rVar, kVar, interfaceC7637g);
            this.f44191q = zyVar;
        }

        @Override // retrofit2.ld6
        protected ReturnT zy(retrofit2.toq<ResponseT> toqVar, Object[] objArr) {
            return this.f44191q.toq(toqVar);
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    static final class toq<ResponseT> extends ld6<ResponseT, Object> {

        /* JADX INFO: renamed from: n */
        private final boolean f44192n;

        /* JADX INFO: renamed from: q */
        private final retrofit2.zy<ResponseT, retrofit2.toq<ResponseT>> f44193q;

        toq(t8r t8rVar, InterfaceC7519n.k kVar, InterfaceC7637g<jp0y, ResponseT> interfaceC7637g, retrofit2.zy<ResponseT, retrofit2.toq<ResponseT>> zyVar, boolean z2) {
            super(t8rVar, kVar, interfaceC7637g);
            this.f44193q = zyVar;
            this.f44192n = z2;
        }

        @Override // retrofit2.ld6
        protected Object zy(retrofit2.toq<ResponseT> toqVar, Object[] objArr) {
            retrofit2.toq<ResponseT> qVar = this.f44193q.toq(toqVar);
            InterfaceC6216q interfaceC6216q = (InterfaceC6216q) objArr[objArr.length - 1];
            try {
                return this.f44192n ? qrj.toq(qVar, interfaceC6216q) : qrj.m28007k(qVar, interfaceC6216q);
            } catch (Exception e2) {
                return qrj.m28008n(e2, interfaceC6216q);
            }
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    static final class zy<ResponseT> extends ld6<ResponseT, Object> {

        /* JADX INFO: renamed from: q */
        private final retrofit2.zy<ResponseT, retrofit2.toq<ResponseT>> f44194q;

        zy(t8r t8rVar, InterfaceC7519n.k kVar, InterfaceC7637g<jp0y, ResponseT> interfaceC7637g, retrofit2.zy<ResponseT, retrofit2.toq<ResponseT>> zyVar) {
            super(t8rVar, kVar, interfaceC7637g);
            this.f44194q = zyVar;
        }

        @Override // retrofit2.ld6
        protected Object zy(retrofit2.toq<ResponseT> toqVar, Object[] objArr) {
            retrofit2.toq<ResponseT> qVar = this.f44194q.toq(toqVar);
            InterfaceC6216q interfaceC6216q = (InterfaceC6216q) objArr[objArr.length - 1];
            try {
                return qrj.zy(qVar, interfaceC6216q);
            } catch (Exception e2) {
                return qrj.m28008n(e2, interfaceC6216q);
            }
        }
    }

    ld6(t8r t8rVar, InterfaceC7519n.k kVar, InterfaceC7637g<jp0y, ResponseT> interfaceC7637g) {
        this.f44190k = t8rVar;
        this.f94724toq = kVar;
        this.f94725zy = interfaceC7637g;
    }

    /* JADX INFO: renamed from: g */
    static <ResponseT, ReturnT> ld6<ResponseT, ReturnT> m27997g(fn3e fn3eVar, Method method, t8r t8rVar) {
        Type genericReturnType;
        boolean z2;
        boolean z3 = t8rVar.f94727ld6;
        Annotation[] annotations = method.getAnnotations();
        if (z3) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeM28019g = C7657z.m28019g(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (C7657z.m28027y(typeM28019g) == C7639i.class && (typeM28019g instanceof ParameterizedType)) {
                typeM28019g = C7657z.f7l8(0, (ParameterizedType) typeM28019g);
                z2 = true;
            } else {
                z2 = false;
            }
            genericReturnType = new C7657z.toq(null, retrofit2.toq.class, typeM28019g);
            annotations = fu4.m27972k(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z2 = false;
        }
        retrofit2.zy zyVarM27999q = m27999q(fn3eVar, method, genericReturnType, annotations);
        Type typeMo27953k = zyVarM27999q.mo27953k();
        if (typeMo27953k == fti.class) {
            throw C7657z.qrj(method, "'" + C7657z.m28027y(typeMo27953k).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeMo27953k == C7639i.class) {
            throw C7657z.qrj(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (t8rVar.f94729zy.equals("HEAD") && !Void.class.equals(typeMo27953k)) {
            throw C7657z.qrj(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        InterfaceC7637g interfaceC7637gM27998n = m27998n(fn3eVar, method, typeMo27953k);
        InterfaceC7519n.k kVar = fn3eVar.f94683toq;
        return !z3 ? new C7643k(t8rVar, kVar, interfaceC7637gM27998n, zyVarM27999q) : z2 ? new zy(t8rVar, kVar, interfaceC7637gM27998n, zyVarM27999q) : new toq(t8rVar, kVar, interfaceC7637gM27998n, zyVarM27999q, false);
    }

    /* JADX INFO: renamed from: n */
    private static <ResponseT> InterfaceC7637g<jp0y, ResponseT> m27998n(fn3e fn3eVar, Method method, Type type) {
        try {
            return fn3eVar.n7h(type, method.getAnnotations());
        } catch (RuntimeException e2) {
            throw C7657z.n7h(method, e2, "Unable to create converter for %s", type);
        }
    }

    /* JADX INFO: renamed from: q */
    private static <ResponseT, ReturnT> retrofit2.zy<ResponseT, ReturnT> m27999q(fn3e fn3eVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (retrofit2.zy<ResponseT, ReturnT>) fn3eVar.toq(type, annotationArr);
        } catch (RuntimeException e2) {
            throw C7657z.n7h(method, e2, "Unable to create call adapter for %s", type);
        }
    }

    @Override // retrofit2.zurt
    @Nullable
    /* JADX INFO: renamed from: k */
    final ReturnT mo28000k(Object[] objArr) {
        return zy(new n7h(this.f44190k, objArr, this.f94724toq, this.f94725zy), objArr);
    }

    @Nullable
    protected abstract ReturnT zy(retrofit2.toq<ResponseT> toqVar, Object[] objArr);
}
