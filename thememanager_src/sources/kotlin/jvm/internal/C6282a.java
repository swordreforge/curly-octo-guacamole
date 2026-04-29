package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.InterfaceC6364h;
import kotlin.reflect.InterfaceC6365i;
import kotlin.reflect.InterfaceC6374q;
import kotlin.reflect.InterfaceC6376s;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: renamed from: kotlin.jvm.internal.a */
/* JADX INFO: compiled from: ReflectionFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class C6282a {

    /* JADX INFO: renamed from: k */
    private static final String f36378k = "kotlin.jvm.functions.";

    @kotlin.yz(version = "1.1")
    public String cdj(AbstractC6308r abstractC6308r) {
        return m23036h(abstractC6308r);
    }

    @kotlin.yz(version = "1.6")
    public kotlin.reflect.t8r f7l8(kotlin.reflect.t8r t8rVar) {
        c8jq c8jqVar = (c8jq) t8rVar;
        return new c8jq(t8rVar.kja0(), t8rVar.mo23072z(), c8jqVar.jk(), c8jqVar.m23071t() | 2);
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC6380y m23035g(Class cls, String str) {
        return new hb(cls, str);
    }

    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: h */
    public String m23036h(a9 a9Var) {
        String string = a9Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(f36378k) ? string.substring(21) : string;
    }

    @kotlin.yz(version = "1.4")
    /* JADX INFO: renamed from: i */
    public InterfaceC6365i m23037i(Object obj, String str, kotlin.reflect.zurt zurtVar, boolean z2) {
        return new y2(obj, str, zurtVar, z2);
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC6374q m23038k(Class cls) {
        return new fn3e(cls);
    }

    @kotlin.yz(version = "1.4")
    public void ki(InterfaceC6365i interfaceC6365i, List<kotlin.reflect.t8r> list) {
        ((y2) interfaceC6365i).m23164g(list);
    }

    public kotlin.reflect.ki kja0(y9n y9nVar) {
        return y9nVar;
    }

    @kotlin.yz(version = "1.6")
    public kotlin.reflect.t8r ld6(kotlin.reflect.t8r t8rVar) {
        c8jq c8jqVar = (c8jq) t8rVar;
        return new c8jq(t8rVar.kja0(), t8rVar.mo23072z(), c8jqVar.jk(), c8jqVar.m23071t() | 4);
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC6374q m23039n(Class cls, String str) {
        return new fn3e(cls);
    }

    public kotlin.reflect.cdj n7h(ek5k ek5kVar) {
        return ek5kVar;
    }

    /* JADX INFO: renamed from: p */
    public kotlin.reflect.qrj m23040p(vyq vyqVar) {
        return vyqVar;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceC6374q m23041q(Class cls) {
        return new fn3e(cls);
    }

    public InterfaceC6364h qrj(AbstractC6305o abstractC6305o) {
        return abstractC6305o;
    }

    /* JADX INFO: renamed from: s */
    public kotlin.reflect.x2 m23042s(lrht lrhtVar) {
        return lrhtVar;
    }

    @kotlin.yz(version = "1.4")
    public kotlin.reflect.t8r t8r(kotlin.reflect.f7l8 f7l8Var, List<kotlin.reflect.fn3e> list, boolean z2) {
        return new c8jq(f7l8Var, list, z2);
    }

    public InterfaceC6374q toq(Class cls, String str) {
        return new fn3e(cls);
    }

    @kotlin.yz(version = "1.6")
    public kotlin.reflect.t8r x2(kotlin.reflect.t8r t8rVar, kotlin.reflect.t8r t8rVar2) {
        return new c8jq(t8rVar.kja0(), t8rVar.mo23072z(), t8rVar2, ((c8jq) t8rVar).m23071t());
    }

    /* JADX INFO: renamed from: y */
    public kotlin.reflect.ld6 m23043y(AbstractC6289f abstractC6289f) {
        return abstractC6289f;
    }

    public InterfaceC6376s zy(jp0y jp0yVar) {
        return jp0yVar;
    }
}
