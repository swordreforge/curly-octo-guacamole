package kotlin;

import kotlin.internal.InterfaceC6234g;
import kotlin.reflect.InterfaceC6364h;

/* JADX INFO: renamed from: kotlin.e */
/* JADX INFO: compiled from: PropertyReferenceDelegates.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6223e {
    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: k */
    private static final <V> V m22810k(InterfaceC6364h<? extends V> interfaceC6364h, Object obj, kotlin.reflect.kja0<?> property) {
        kotlin.jvm.internal.d2ok.m23075h(interfaceC6364h, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        return interfaceC6364h.get();
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    /* JADX INFO: renamed from: q */
    private static final <T, V> void m22811q(kotlin.reflect.x2<T, V> x2Var, T t2, kotlin.reflect.kja0<?> property, V v2) {
        kotlin.jvm.internal.d2ok.m23075h(x2Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        x2Var.set(t2, v2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final <T, V> V toq(kotlin.reflect.cdj<T, ? extends V> cdjVar, T t2, kotlin.reflect.kja0<?> property) {
        kotlin.jvm.internal.d2ok.m23075h(cdjVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        return cdjVar.get(t2);
    }

    @InterfaceC6234g
    @yz(version = "1.4")
    private static final <V> void zy(kotlin.reflect.ld6<V> ld6Var, Object obj, kotlin.reflect.kja0<?> property, V v2) {
        kotlin.jvm.internal.d2ok.m23075h(ld6Var, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(property, "property");
        ld6Var.set(v2);
    }
}
