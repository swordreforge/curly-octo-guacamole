package retrofit2;

import f7z0.InterfaceC6030g;
import f7z0.InterfaceC6031h;
import f7z0.InterfaceC6032i;
import f7z0.InterfaceC6033k;
import f7z0.InterfaceC6034n;
import f7z0.InterfaceC6035p;
import f7z0.InterfaceC6036q;
import f7z0.InterfaceC6037s;
import f7z0.InterfaceC6038y;
import f7z0.InterfaceC6039z;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.coroutines.InterfaceC6216q;
import okhttp3.C7534z;
import okhttp3.fn3e;
import okhttp3.jk;
import retrofit2.AbstractC7638h;
import y9n.InterfaceC7782q;

/* JADX INFO: compiled from: RequestFactory.java */
/* JADX INFO: loaded from: classes4.dex */
final class t8r {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f94726f7l8;

    /* JADX INFO: renamed from: g */
    @Nullable
    private final okhttp3.fu4 f44228g;

    /* JADX INFO: renamed from: k */
    private final Method f44229k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    final boolean f94727ld6;

    /* JADX INFO: renamed from: n */
    @Nullable
    private final okhttp3.fn3e f44230n;

    /* JADX INFO: renamed from: p */
    private final AbstractC7638h<?>[] f44231p;

    /* JADX INFO: renamed from: q */
    @Nullable
    private final String f44232q;

    /* JADX INFO: renamed from: s */
    private final boolean f44233s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final okhttp3.zurt f94728toq;

    /* JADX INFO: renamed from: y */
    private final boolean f44234y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final String f94729zy;

    /* JADX INFO: renamed from: retrofit2.t8r$k */
    /* JADX INFO: compiled from: RequestFactory.java */
    static final class C7655k {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        boolean f94732cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        boolean f94733f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        @Nullable
        Set<String> f94734fn3e;

        /* JADX INFO: renamed from: g */
        boolean f44236g;

        /* JADX INFO: renamed from: h */
        boolean f44237h;

        /* JADX INFO: renamed from: i */
        @Nullable
        okhttp3.fu4 f44238i;

        /* JADX INFO: renamed from: k */
        final fn3e f44239k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        @Nullable
        String f94735ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        boolean f94736kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        boolean f94737ld6;

        /* JADX INFO: renamed from: n */
        final Type[] f44240n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        @Nullable
        String f94738n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        boolean f94739ni7;

        /* JADX INFO: renamed from: p */
        boolean f44241p;

        /* JADX INFO: renamed from: q */
        final Annotation[][] f44242q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        boolean f94740qrj;

        /* JADX INFO: renamed from: s */
        boolean f44243s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        @Nullable
        okhttp3.fn3e f94741t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Method f94742toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        boolean f94743x2;

        /* JADX INFO: renamed from: y */
        boolean f44244y;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        @Nullable
        AbstractC7638h<?>[] f94744zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final Annotation[] f94745zy;

        /* JADX INFO: renamed from: z */
        private static final Pattern f44235z = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final String f94730fu4 = "[a-zA-Z][a-zA-Z0-9_-]*";

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final Pattern f94731o1t = Pattern.compile(f94730fu4);

        C7655k(fn3e fn3eVar, Method method) {
            this.f44239k = fn3eVar;
            this.f94742toq = method;
            this.f94745zy = method.getAnnotations();
            this.f44240n = method.getGenericParameterTypes();
            this.f44242q = method.getParameterAnnotations();
        }

        @Nullable
        private AbstractC7638h<?> f7l8(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof InterfaceC6039z) {
                m28014p(i2, type);
                if (this.f94740qrj) {
                    throw C7657z.kja0(this.f94742toq, i2, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.f44243s) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f44241p) {
                    throw C7657z.kja0(this.f94742toq, i2, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f94737ld6) {
                    throw C7657z.kja0(this.f94742toq, i2, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f94743x2) {
                    throw C7657z.kja0(this.f94742toq, i2, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f94735ki != null) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Url cannot be used with @%s URL", this.f94738n7h);
                }
                this.f94740qrj = true;
                if (type == okhttp3.zurt.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new AbstractC7638h.h(this.f94742toq, i2);
                }
                throw C7657z.kja0(this.f94742toq, i2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof f7z0.t8r) {
                m28014p(i2, type);
                if (this.f44241p) {
                    throw C7657z.kja0(this.f94742toq, i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.f94737ld6) {
                    throw C7657z.kja0(this.f94742toq, i2, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.f94743x2) {
                    throw C7657z.kja0(this.f94742toq, i2, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.f94740qrj) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.f94735ki == null) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Path can only be used with relative url on @%s", this.f94738n7h);
                }
                this.f44243s = true;
                f7z0.t8r t8rVar = (f7z0.t8r) annotation;
                String strValue = t8rVar.value();
                m28016s(i2, strValue);
                return new AbstractC7638h.ld6(this.f94742toq, i2, strValue, this.f44239k.kja0(type, annotationArr), t8rVar.encoded());
            }
            if (annotation instanceof InterfaceC6032i) {
                m28014p(i2, type);
                InterfaceC6032i interfaceC6032i = (InterfaceC6032i) annotation;
                String strValue2 = interfaceC6032i.value();
                boolean zEncoded = interfaceC6032i.encoded();
                Class<?> clsM28027y = C7657z.m28027y(type);
                this.f44241p = true;
                if (!Iterable.class.isAssignableFrom(clsM28027y)) {
                    return clsM28027y.isArray() ? new AbstractC7638h.x2(strValue2, this.f44239k.kja0(m28012k(clsM28027y.getComponentType()), annotationArr), zEncoded).toq() : new AbstractC7638h.x2(strValue2, this.f44239k.kja0(type, annotationArr), zEncoded);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7638h.x2(strValue2, this.f44239k.kja0(C7657z.f7l8(0, (ParameterizedType) type), annotationArr), zEncoded).zy();
                }
                throw C7657z.kja0(this.f94742toq, i2, clsM28027y.getSimpleName() + " must include generic type (e.g., " + clsM28027y.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof f7z0.zurt) {
                m28014p(i2, type);
                boolean zEncoded2 = ((f7z0.zurt) annotation).encoded();
                Class<?> clsM28027y2 = C7657z.m28027y(type);
                this.f94737ld6 = true;
                if (!Iterable.class.isAssignableFrom(clsM28027y2)) {
                    return clsM28027y2.isArray() ? new AbstractC7638h.n7h(this.f44239k.kja0(m28012k(clsM28027y2.getComponentType()), annotationArr), zEncoded2).toq() : new AbstractC7638h.n7h(this.f44239k.kja0(type, annotationArr), zEncoded2);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7638h.n7h(this.f44239k.kja0(C7657z.f7l8(0, (ParameterizedType) type), annotationArr), zEncoded2).zy();
                }
                throw C7657z.kja0(this.f94742toq, i2, clsM28027y2.getSimpleName() + " must include generic type (e.g., " + clsM28027y2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof f7z0.fn3e) {
                m28014p(i2, type);
                Class<?> clsM28027y3 = C7657z.m28027y(type);
                this.f94743x2 = true;
                if (!Map.class.isAssignableFrom(clsM28027y3)) {
                    throw C7657z.kja0(this.f94742toq, i2, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type typeM28026s = C7657z.m28026s(type, clsM28027y3, Map.class);
                if (!(typeM28026s instanceof ParameterizedType)) {
                    throw C7657z.kja0(this.f94742toq, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) typeM28026s;
                Type typeF7l8 = C7657z.f7l8(0, parameterizedType);
                if (String.class == typeF7l8) {
                    return new AbstractC7638h.qrj(this.f94742toq, i2, this.f44239k.kja0(C7657z.f7l8(1, parameterizedType), annotationArr), ((f7z0.fn3e) annotation).encoded());
                }
                throw C7657z.kja0(this.f94742toq, i2, "@QueryMap keys must be of type String: " + typeF7l8, new Object[0]);
            }
            if (annotation instanceof InterfaceC6037s) {
                m28014p(i2, type);
                String strValue3 = ((InterfaceC6037s) annotation).value();
                Class<?> clsM28027y4 = C7657z.m28027y(type);
                if (!Iterable.class.isAssignableFrom(clsM28027y4)) {
                    return clsM28027y4.isArray() ? new AbstractC7638h.g(strValue3, this.f44239k.kja0(m28012k(clsM28027y4.getComponentType()), annotationArr)).toq() : new AbstractC7638h.g(strValue3, this.f44239k.kja0(type, annotationArr));
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7638h.g(strValue3, this.f44239k.kja0(C7657z.f7l8(0, (ParameterizedType) type), annotationArr)).zy();
                }
                throw C7657z.kja0(this.f94742toq, i2, clsM28027y4.getSimpleName() + " must include generic type (e.g., " + clsM28027y4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC6035p) {
                if (type == okhttp3.fn3e.class) {
                    return new AbstractC7638h.y(this.f94742toq, i2);
                }
                m28014p(i2, type);
                Class<?> clsM28027y5 = C7657z.m28027y(type);
                if (!Map.class.isAssignableFrom(clsM28027y5)) {
                    throw C7657z.kja0(this.f94742toq, i2, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type typeM28026s2 = C7657z.m28026s(type, clsM28027y5, Map.class);
                if (!(typeM28026s2 instanceof ParameterizedType)) {
                    throw C7657z.kja0(this.f94742toq, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) typeM28026s2;
                Type typeF7l82 = C7657z.f7l8(0, parameterizedType2);
                if (String.class == typeF7l82) {
                    return new AbstractC7638h.f7l8(this.f94742toq, i2, this.f44239k.kja0(C7657z.f7l8(1, parameterizedType2), annotationArr));
                }
                throw C7657z.kja0(this.f94742toq, i2, "@HeaderMap keys must be of type String: " + typeF7l82, new Object[0]);
            }
            if (annotation instanceof f7z0.zy) {
                m28014p(i2, type);
                if (!this.f44237h) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                f7z0.zy zyVar = (f7z0.zy) annotation;
                String strValue4 = zyVar.value();
                boolean zEncoded3 = zyVar.encoded();
                this.f44236g = true;
                Class<?> clsM28027y6 = C7657z.m28027y(type);
                if (!Iterable.class.isAssignableFrom(clsM28027y6)) {
                    return clsM28027y6.isArray() ? new AbstractC7638h.q(strValue4, this.f44239k.kja0(m28012k(clsM28027y6.getComponentType()), annotationArr), zEncoded3).toq() : new AbstractC7638h.q(strValue4, this.f44239k.kja0(type, annotationArr), zEncoded3);
                }
                if (type instanceof ParameterizedType) {
                    return new AbstractC7638h.q(strValue4, this.f44239k.kja0(C7657z.f7l8(0, (ParameterizedType) type), annotationArr), zEncoded3).zy();
                }
                throw C7657z.kja0(this.f94742toq, i2, clsM28027y6.getSimpleName() + " must include generic type (e.g., " + clsM28027y6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof InterfaceC6036q) {
                m28014p(i2, type);
                if (!this.f44237h) {
                    throw C7657z.kja0(this.f94742toq, i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> clsM28027y7 = C7657z.m28027y(type);
                if (!Map.class.isAssignableFrom(clsM28027y7)) {
                    throw C7657z.kja0(this.f94742toq, i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type typeM28026s3 = C7657z.m28026s(type, clsM28027y7, Map.class);
                if (!(typeM28026s3 instanceof ParameterizedType)) {
                    throw C7657z.kja0(this.f94742toq, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) typeM28026s3;
                Type typeF7l83 = C7657z.f7l8(0, parameterizedType3);
                if (String.class == typeF7l83) {
                    InterfaceC7637g interfaceC7637gKja0 = this.f44239k.kja0(C7657z.f7l8(1, parameterizedType3), annotationArr);
                    this.f44236g = true;
                    return new AbstractC7638h.n(this.f94742toq, i2, interfaceC7637gKja0, ((InterfaceC6036q) annotation).encoded());
                }
                throw C7657z.kja0(this.f94742toq, i2, "@FieldMap keys must be of type String: " + typeF7l83, new Object[0]);
            }
            if (annotation instanceof f7z0.cdj) {
                m28014p(i2, type);
                if (!this.f94732cdj) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                f7z0.cdj cdjVar = (f7z0.cdj) annotation;
                this.f94733f7l8 = true;
                String strValue5 = cdjVar.value();
                Class<?> clsM28027y8 = C7657z.m28027y(type);
                if (strValue5.isEmpty()) {
                    if (!Iterable.class.isAssignableFrom(clsM28027y8)) {
                        if (clsM28027y8.isArray()) {
                            if (C7534z.zy.class.isAssignableFrom(clsM28027y8.getComponentType())) {
                                return AbstractC7638h.kja0.f44155k.toq();
                            }
                            throw C7657z.kja0(this.f94742toq, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (C7534z.zy.class.isAssignableFrom(clsM28027y8)) {
                            return AbstractC7638h.kja0.f44155k;
                        }
                        throw C7657z.kja0(this.f94742toq, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (type instanceof ParameterizedType) {
                        if (C7534z.zy.class.isAssignableFrom(C7657z.m28027y(C7657z.f7l8(0, (ParameterizedType) type)))) {
                            return AbstractC7638h.kja0.f44155k.zy();
                        }
                        throw C7657z.kja0(this.f94742toq, i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    throw C7657z.kja0(this.f94742toq, i2, clsM28027y8.getSimpleName() + " must include generic type (e.g., " + clsM28027y8.getSimpleName() + "<String>)", new Object[0]);
                }
                okhttp3.fn3e fn3eVarX2 = okhttp3.fn3e.x2(com.google.common.net.zy.f68526lrht, "form-data; name=\"" + strValue5 + "\"", "Content-Transfer-Encoding", cdjVar.encoding());
                if (!Iterable.class.isAssignableFrom(clsM28027y8)) {
                    if (!clsM28027y8.isArray()) {
                        if (C7534z.zy.class.isAssignableFrom(clsM28027y8)) {
                            throw C7657z.kja0(this.f94742toq, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new AbstractC7638h.s(this.f94742toq, i2, fn3eVarX2, this.f44239k.qrj(type, annotationArr, this.f94745zy));
                    }
                    Class<?> clsM28012k = m28012k(clsM28027y8.getComponentType());
                    if (C7534z.zy.class.isAssignableFrom(clsM28012k)) {
                        throw C7657z.kja0(this.f94742toq, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC7638h.s(this.f94742toq, i2, fn3eVarX2, this.f44239k.qrj(clsM28012k, annotationArr, this.f94745zy)).toq();
                }
                if (type instanceof ParameterizedType) {
                    Type typeF7l84 = C7657z.f7l8(0, (ParameterizedType) type);
                    if (C7534z.zy.class.isAssignableFrom(C7657z.m28027y(typeF7l84))) {
                        throw C7657z.kja0(this.f94742toq, i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new AbstractC7638h.s(this.f94742toq, i2, fn3eVarX2, this.f44239k.qrj(typeF7l84, annotationArr, this.f94745zy)).zy();
                }
                throw C7657z.kja0(this.f94742toq, i2, clsM28027y8.getSimpleName() + " must include generic type (e.g., " + clsM28027y8.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof f7z0.ki) {
                m28014p(i2, type);
                if (!this.f94732cdj) {
                    throw C7657z.kja0(this.f94742toq, i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f94733f7l8 = true;
                Class<?> clsM28027y9 = C7657z.m28027y(type);
                if (!Map.class.isAssignableFrom(clsM28027y9)) {
                    throw C7657z.kja0(this.f94742toq, i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type typeM28026s4 = C7657z.m28026s(type, clsM28027y9, Map.class);
                if (!(typeM28026s4 instanceof ParameterizedType)) {
                    throw C7657z.kja0(this.f94742toq, i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) typeM28026s4;
                Type typeF7l85 = C7657z.f7l8(0, parameterizedType4);
                if (String.class == typeF7l85) {
                    Type typeF7l86 = C7657z.f7l8(1, parameterizedType4);
                    if (C7534z.zy.class.isAssignableFrom(C7657z.m28027y(typeF7l86))) {
                        throw C7657z.kja0(this.f94742toq, i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new AbstractC7638h.p(this.f94742toq, i2, this.f44239k.qrj(typeF7l86, annotationArr, this.f94745zy), ((f7z0.ki) annotation).encoding());
                }
                throw C7657z.kja0(this.f94742toq, i2, "@PartMap keys must be of type String: " + typeF7l85, new Object[0]);
            }
            if (annotation instanceof InterfaceC6033k) {
                m28014p(i2, type);
                if (this.f44237h || this.f94732cdj) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f44244y) {
                    throw C7657z.kja0(this.f94742toq, i2, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    InterfaceC7637g interfaceC7637gQrj = this.f44239k.qrj(type, annotationArr, this.f94745zy);
                    this.f44244y = true;
                    return new AbstractC7638h.zy(this.f94742toq, i2, interfaceC7637gQrj);
                } catch (RuntimeException e2) {
                    throw C7657z.m28020h(this.f94742toq, e2, i2, "Unable to create @Body converter for %s", type);
                }
            }
            if (!(annotation instanceof f7z0.fu4)) {
                return null;
            }
            m28014p(i2, type);
            Class<?> clsM28027y10 = C7657z.m28027y(type);
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                AbstractC7638h<?> abstractC7638h = this.f94744zurt[i3];
                if ((abstractC7638h instanceof AbstractC7638h.cdj) && ((AbstractC7638h.cdj) abstractC7638h).f44150k.equals(clsM28027y10)) {
                    throw C7657z.kja0(this.f94742toq, i2, "@Tag type " + clsM28027y10.getName() + " is duplicate of parameter #" + (i3 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new AbstractC7638h.cdj(clsM28027y10);
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        private AbstractC7638h<?> m28011g(int i2, Type type, @Nullable Annotation[] annotationArr, boolean z2) {
            AbstractC7638h<?> abstractC7638h;
            if (annotationArr != null) {
                abstractC7638h = null;
                for (Annotation annotation : annotationArr) {
                    AbstractC7638h<?> abstractC7638hF7l8 = f7l8(i2, type, annotationArr, annotation);
                    if (abstractC7638hF7l8 != null) {
                        if (abstractC7638h != null) {
                            throw C7657z.kja0(this.f94742toq, i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        abstractC7638h = abstractC7638hF7l8;
                    }
                }
            } else {
                abstractC7638h = null;
            }
            if (abstractC7638h != null) {
                return abstractC7638h;
            }
            if (z2) {
                try {
                    if (C7657z.m28027y(type) == InterfaceC6216q.class) {
                        this.f94739ni7 = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw C7657z.kja0(this.f94742toq, i2, "No Retrofit annotation found.", new Object[0]);
        }

        /* JADX INFO: renamed from: k */
        private static Class<?> m28012k(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        /* JADX INFO: renamed from: n */
        private void m28013n(Annotation annotation) {
            if (annotation instanceof f7z0.toq) {
                m28015q(InterfaceC7782q.f100601fu4, ((f7z0.toq) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC6030g) {
                m28015q("GET", ((InterfaceC6030g) annotation).value(), false);
                return;
            }
            if (annotation instanceof f7z0.f7l8) {
                m28015q("HEAD", ((f7z0.f7l8) annotation).value(), false);
                return;
            }
            if (annotation instanceof f7z0.n7h) {
                m28015q("PATCH", ((f7z0.n7h) annotation).value(), true);
                return;
            }
            if (annotation instanceof f7z0.kja0) {
                m28015q("POST", ((f7z0.kja0) annotation).value(), true);
                return;
            }
            if (annotation instanceof InterfaceC6031h) {
                m28015q("PUT", ((InterfaceC6031h) annotation).value(), true);
                return;
            }
            if (annotation instanceof f7z0.qrj) {
                m28015q("OPTIONS", ((f7z0.qrj) annotation).value(), false);
                return;
            }
            if (annotation instanceof InterfaceC6038y) {
                InterfaceC6038y interfaceC6038y = (InterfaceC6038y) annotation;
                m28015q(interfaceC6038y.method(), interfaceC6038y.path(), interfaceC6038y.hasBody());
                return;
            }
            if (annotation instanceof f7z0.ld6) {
                String[] strArrValue = ((f7z0.ld6) annotation).value();
                if (strArrValue.length == 0) {
                    throw C7657z.qrj(this.f94742toq, "@Headers annotation is empty.", new Object[0]);
                }
                this.f94741t8r = zy(strArrValue);
                return;
            }
            if (annotation instanceof f7z0.x2) {
                if (this.f44237h) {
                    throw C7657z.qrj(this.f94742toq, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f94732cdj = true;
            } else if (annotation instanceof InterfaceC6034n) {
                if (this.f94732cdj) {
                    throw C7657z.qrj(this.f94742toq, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.f44237h = true;
            }
        }

        /* JADX INFO: renamed from: p */
        private void m28014p(int i2, Type type) {
            if (C7657z.m28024p(type)) {
                throw C7657z.kja0(this.f94742toq, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* JADX INFO: renamed from: q */
        private void m28015q(String str, String str2, boolean z2) {
            String str3 = this.f94738n7h;
            if (str3 != null) {
                throw C7657z.qrj(this.f94742toq, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f94738n7h = str;
            this.f94736kja0 = z2;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (f44235z.matcher(strSubstring).find()) {
                    throw C7657z.qrj(this.f94742toq, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f94735ki = str2;
            this.f94734fn3e = m28017y(str2);
        }

        /* JADX INFO: renamed from: s */
        private void m28016s(int i2, String str) {
            if (!f94731o1t.matcher(str).matches()) {
                throw C7657z.kja0(this.f94742toq, i2, "@Path parameter name must match %s. Found: %s", f44235z.pattern(), str);
            }
            if (!this.f94734fn3e.contains(str)) {
                throw C7657z.kja0(this.f94742toq, i2, "URL \"%s\" does not contain \"{%s}\".", this.f94735ki, str);
            }
        }

        /* JADX INFO: renamed from: y */
        static Set<String> m28017y(String str) {
            Matcher matcher = f44235z.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private okhttp3.fn3e zy(String[] strArr) {
            fn3e.C7432k c7432k = new fn3e.C7432k();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw C7657z.qrj(this.f94742toq, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if (com.google.common.net.zy.f68571zy.equalsIgnoreCase(strSubstring)) {
                    try {
                        this.f44238i = okhttp3.fu4.m26903y(strTrim);
                    } catch (IllegalArgumentException e2) {
                        throw C7657z.n7h(this.f94742toq, e2, "Malformed content type: %s", strTrim);
                    }
                } else {
                    c7432k.toq(strSubstring, strTrim);
                }
            }
            return c7432k.m26870s();
        }

        t8r toq() {
            for (Annotation annotation : this.f94745zy) {
                m28013n(annotation);
            }
            if (this.f94738n7h == null) {
                throw C7657z.qrj(this.f94742toq, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f94736kja0) {
                if (this.f94732cdj) {
                    throw C7657z.qrj(this.f94742toq, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f44237h) {
                    throw C7657z.qrj(this.f94742toq, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f44242q.length;
            this.f94744zurt = new AbstractC7638h[length];
            int i2 = length - 1;
            int i3 = 0;
            while (true) {
                boolean z2 = true;
                if (i3 >= length) {
                    break;
                }
                AbstractC7638h<?>[] abstractC7638hArr = this.f94744zurt;
                Type type = this.f44240n[i3];
                Annotation[] annotationArr = this.f44242q[i3];
                if (i3 != i2) {
                    z2 = false;
                }
                abstractC7638hArr[i3] = m28011g(i3, type, annotationArr, z2);
                i3++;
            }
            if (this.f94735ki == null && !this.f94740qrj) {
                throw C7657z.qrj(this.f94742toq, "Missing either @%s URL or @Url parameter.", this.f94738n7h);
            }
            boolean z3 = this.f44237h;
            if (!z3 && !this.f94732cdj && !this.f94736kja0 && this.f44244y) {
                throw C7657z.qrj(this.f94742toq, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z3 && !this.f44236g) {
                throw C7657z.qrj(this.f94742toq, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f94732cdj || this.f94733f7l8) {
                return new t8r(this);
            }
            throw C7657z.qrj(this.f94742toq, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    t8r(C7655k c7655k) {
        this.f44229k = c7655k.f94742toq;
        this.f94728toq = c7655k.f44239k.f94684zy;
        this.f94729zy = c7655k.f94738n7h;
        this.f44232q = c7655k.f94735ki;
        this.f44230n = c7655k.f94741t8r;
        this.f44228g = c7655k.f44238i;
        this.f94726f7l8 = c7655k.f94736kja0;
        this.f44234y = c7655k.f44237h;
        this.f44233s = c7655k.f94732cdj;
        this.f44231p = c7655k.f94744zurt;
        this.f94727ld6 = c7655k.f94739ni7;
    }

    static t8r toq(fn3e fn3eVar, Method method) {
        return new C7655k(fn3eVar, method).toq();
    }

    /* JADX INFO: renamed from: k */
    jk m28010k(Object[] objArr) throws IOException {
        AbstractC7638h<?>[] abstractC7638hArr = this.f44231p;
        int length = objArr.length;
        if (length != abstractC7638hArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + abstractC7638hArr.length + ")");
        }
        ki kiVar = new ki(this.f94729zy, this.f94728toq, this.f44232q, this.f44230n, this.f44228g, this.f94726f7l8, this.f44234y, this.f44233s);
        if (this.f94727ld6) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
            abstractC7638hArr[i2].mo27975k(kiVar, objArr[i2]);
        }
        return kiVar.ld6().o1t(x2.class, new x2(this.f44229k, arrayList)).toq();
    }
}
