package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.C6144h;
import kotlin.reflect.InterfaceC6364h;
import kotlin.reflect.InterfaceC6365i;
import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6376s;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes3.dex */
public class a98o {

    /* JADX INFO: renamed from: k */
    private static final C6282a f36379k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f81830toq = " (Kotlin reflection is not available)";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final InterfaceC6374q[] f81831zy;

    static {
        C6282a c6282a = null;
        try {
            c6282a = (C6282a) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c6282a == null) {
            c6282a = new C6282a();
        }
        f36379k = c6282a;
        f81831zy = new InterfaceC6374q[0];
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r a9(kotlin.reflect.f7l8 f7l8Var) {
        return f36379k.t8r(f7l8Var, Collections.emptyList(), false);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r cdj(Class cls, kotlin.reflect.fn3e... fn3eVarArr) {
        return f36379k.t8r(m23050q(cls), C6144h.vyee(fn3eVarArr), true);
    }

    @kotlin.yz(version = "1.4")
    public static InterfaceC6380y f7l8(Class cls) {
        return f36379k.m23035g(cls, "");
    }

    public static kotlin.reflect.cdj fn3e(ek5k ek5kVar) {
        return f36379k.n7h(ek5kVar);
    }

    @kotlin.yz(version = "1.4")
    public static InterfaceC6365i fti(Object obj, String str, kotlin.reflect.zurt zurtVar, boolean z2) {
        return f36379k.m23037i(obj, str, zurtVar, z2);
    }

    @kotlin.yz(version = "1.1")
    public static String fu4(AbstractC6308r abstractC6308r) {
        return f36379k.cdj(abstractC6308r);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC6374q[] m23044g(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f81831zy;
        }
        InterfaceC6374q[] interfaceC6374qArr = new InterfaceC6374q[length];
        for (int i2 = 0; i2 < length; i2++) {
            interfaceC6374qArr[i2] = m23050q(clsArr[i2]);
        }
        return interfaceC6374qArr;
    }

    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: h */
    public static kotlin.reflect.t8r m23045h(Class cls, kotlin.reflect.fn3e fn3eVar, kotlin.reflect.fn3e fn3eVar2) {
        return f36379k.t8r(m23050q(cls), Arrays.asList(fn3eVar, fn3eVar2), true);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC6364h m23046i(AbstractC6305o abstractC6305o) {
        return f36379k.qrj(abstractC6305o);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r jk(Class cls, kotlin.reflect.fn3e... fn3eVarArr) {
        return f36379k.t8r(m23050q(cls), C6144h.vyee(fn3eVarArr), false);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC6374q m23047k(Class cls) {
        return f36379k.m23038k(cls);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r ki(kotlin.reflect.f7l8 f7l8Var) {
        return f36379k.t8r(f7l8Var, Collections.emptyList(), true);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r kja0(Class cls, kotlin.reflect.fn3e fn3eVar) {
        return f36379k.t8r(m23050q(cls), Collections.singletonList(fn3eVar), true);
    }

    public static kotlin.reflect.x2 ld6(lrht lrhtVar) {
        return f36379k.m23042s(lrhtVar);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r mcp(Class cls, kotlin.reflect.fn3e fn3eVar, kotlin.reflect.fn3e fn3eVar2) {
        return f36379k.t8r(m23050q(cls), Arrays.asList(fn3eVar, fn3eVar2), false);
    }

    /* JADX INFO: renamed from: n */
    public static InterfaceC6374q m23048n(Class cls, String str) {
        return f36379k.m23039n(cls, str);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r n7h(Class cls) {
        return f36379k.t8r(m23050q(cls), Collections.emptyList(), true);
    }

    @kotlin.yz(version = "1.3")
    public static String ni7(a9 a9Var) {
        return f36379k.m23036h(a9Var);
    }

    @kotlin.yz(version = "1.4")
    public static void o1t(InterfaceC6365i interfaceC6365i, kotlin.reflect.t8r... t8rVarArr) {
        f36379k.ki(interfaceC6365i, C6144h.vyee(t8rVarArr));
    }

    /* JADX INFO: renamed from: p */
    public static kotlin.reflect.ld6 m23049p(AbstractC6289f abstractC6289f) {
        return f36379k.m23043y(abstractC6289f);
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC6374q m23050q(Class cls) {
        return f36379k.m23041q(cls);
    }

    @kotlin.yz(version = "1.6")
    public static kotlin.reflect.t8r qrj(kotlin.reflect.t8r t8rVar) {
        return f36379k.ld6(t8rVar);
    }

    @kotlin.yz(version = "1.6")
    /* JADX INFO: renamed from: s */
    public static kotlin.reflect.t8r m23051s(kotlin.reflect.t8r t8rVar) {
        return f36379k.f7l8(t8rVar);
    }

    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: t */
    public static kotlin.reflect.t8r m23052t(Class cls, kotlin.reflect.fn3e fn3eVar) {
        return f36379k.t8r(m23050q(cls), Collections.singletonList(fn3eVar), false);
    }

    @kotlin.yz(version = "1.6")
    public static kotlin.reflect.t8r t8r(kotlin.reflect.t8r t8rVar, kotlin.reflect.t8r t8rVar2) {
        return f36379k.x2(t8rVar, t8rVar2);
    }

    public static InterfaceC6374q toq(Class cls, String str) {
        return f36379k.toq(cls, str);
    }

    @kotlin.yz(version = "1.4")
    public static kotlin.reflect.t8r wvg(Class cls) {
        return f36379k.t8r(m23050q(cls), Collections.emptyList(), false);
    }

    public static kotlin.reflect.qrj x2(vyq vyqVar) {
        return f36379k.m23040p(vyqVar);
    }

    /* JADX INFO: renamed from: y */
    public static InterfaceC6380y m23053y(Class cls, String str) {
        return f36379k.m23035g(cls, str);
    }

    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: z */
    public static void m23054z(InterfaceC6365i interfaceC6365i, kotlin.reflect.t8r t8rVar) {
        f36379k.ki(interfaceC6365i, Collections.singletonList(t8rVar));
    }

    public static kotlin.reflect.ki zurt(y9n y9nVar) {
        return f36379k.kja0(y9nVar);
    }

    public static InterfaceC6376s zy(jp0y jp0yVar) {
        return f36379k.zy(jp0yVar);
    }
}
