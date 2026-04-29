package l05;

import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.exifinterface.media.C0846k;
import java.lang.annotation.Annotation;
import kotlin.hb;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.InterfaceC6293i;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.d2ok;
import kotlin.reflect.InterfaceC6374q;
import kotlin.yz;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: l05.k */
/* JADX INFO: compiled from: JvmClassMapping.kt */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC6769y(name = "JvmClassMappingKt")
public final class C6764k {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC7396q
    public static final <T> Class<T> f7l8(@InterfaceC7396q InterfaceC6374q<T> interfaceC6374q) {
        d2ok.m23075h(interfaceC6374q, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC6293i) interfaceC6374q).cdj();
        if (!cls.isPrimitive()) {
            d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    cls = (Class<T>) Double.class;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    cls = (Class<T>) Integer.class;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    cls = (Class<T>) Byte.class;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    cls = (Class<T>) Character.class;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    cls = (Class<T>) Long.class;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    cls = (Class<T>) Void.class;
                }
                break;
            case 64711720:
                if (name.equals(zurt.toq.f1755g)) {
                    cls = (Class<T>) Boolean.class;
                }
                break;
            case 97526364:
                if (name.equals(zurt.toq.f47471zy)) {
                    cls = (Class<T>) Float.class;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    cls = (Class<T>) Short.class;
                }
                break;
        }
        d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return cls;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m24700g(InterfaceC6374q interfaceC6374q) {
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public static final <T extends Annotation> InterfaceC6374q<? extends T> m24701k(@InterfaceC7396q T t2) {
        d2ok.m23075h(t2, "<this>");
        Class<? extends Annotation> clsAnnotationType = t2.annotationType();
        d2ok.kja0(clsAnnotationType, "this as java.lang.annota…otation).annotationType()");
        InterfaceC6374q<? extends T> interfaceC6374qM24705s = m24705s(clsAnnotationType);
        d2ok.n7h(interfaceC6374qM24705s, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return interfaceC6374qM24705s;
    }

    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use 'java' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @hb(expression = "(this as Any).javaClass", imports = {}))
    public static /* synthetic */ void ld6(InterfaceC6374q interfaceC6374q) {
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "getJavaClass")
    /* JADX INFO: renamed from: n */
    public static final <T> Class<T> m24702n(@InterfaceC7396q InterfaceC6374q<T> interfaceC6374q) {
        d2ok.m23075h(interfaceC6374q, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC6293i) interfaceC6374q).cdj();
        d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return cls;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "getRuntimeClassOfKClassInstance")
    /* JADX INFO: renamed from: p */
    public static final <T> Class<InterfaceC6374q<T>> m24703p(@InterfaceC7396q InterfaceC6374q<T> interfaceC6374q) {
        d2ok.m23075h(interfaceC6374q, "<this>");
        Class<InterfaceC6374q<T>> cls = (Class<InterfaceC6374q<T>>) interfaceC6374q.getClass();
        d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>>");
        return cls;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final <T> Class<T> m24704q(@InterfaceC7396q T t2) {
        d2ok.m23075h(t2, "<this>");
        Class<T> cls = (Class<T>) t2.getClass();
        d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaClass>>");
        return cls;
    }

    @InterfaceC7396q
    @InterfaceC6769y(name = "getKotlinClass")
    /* JADX INFO: renamed from: s */
    public static final <T> InterfaceC6374q<T> m24705s(@InterfaceC7396q Class<T> cls) {
        d2ok.m23075h(cls, "<this>");
        return a98o.m23050q(cls);
    }

    private static final <E extends Enum<E>> Class<E> toq(Enum<E> r1) {
        d2ok.m23075h(r1, "<this>");
        Class<E> declaringClass = r1.getDeclaringClass();
        d2ok.kja0(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        return declaringClass;
    }

    public static final /* synthetic */ boolean x2(Object[] objArr) {
        d2ok.m23075h(objArr, "<this>");
        d2ok.m23086z(4, C0846k.zaso);
        return Object.class.isAssignableFrom(objArr.getClass().getComponentType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public static final <T> Class<T> m24706y(@InterfaceC7396q InterfaceC6374q<T> interfaceC6374q) {
        d2ok.m23075h(interfaceC6374q, "<this>");
        Class<T> cls = (Class<T>) ((InterfaceC6293i) interfaceC6374q).cdj();
        if (cls.isPrimitive()) {
            d2ok.n7h(cls, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    @InterfaceC6234g
    @yz(version = "1.7")
    public static /* synthetic */ void zy(Enum r0) {
    }
}
