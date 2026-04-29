package kotlin.reflect;

import kotlin.i9jn;
import kotlin.internal.InterfaceC6244y;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.reflect.n */
/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,48:1\n9#2:49\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n26#1:49\n*E\n"})
@InterfaceC6769y(name = "KClasses")
public final class C6371n {
    /* JADX WARN: Multi-variable type inference failed */
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6244y
    @InterfaceC7396q
    @yz(version = "1.4")
    /* JADX INFO: renamed from: k */
    public static final <T> T m23391k(@InterfaceC7396q InterfaceC6374q<T> interfaceC6374q, @InterfaceC7395n Object obj) {
        d2ok.m23075h(interfaceC6374q, "<this>");
        if (interfaceC6374q.mo23097h(obj)) {
            d2ok.n7h(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + interfaceC6374q.ki());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6244y
    @InterfaceC7395n
    @yz(version = "1.4")
    public static final <T> T toq(@InterfaceC7396q InterfaceC6374q<T> interfaceC6374q, @InterfaceC7395n Object obj) {
        d2ok.m23075h(interfaceC6374q, "<this>");
        if (!interfaceC6374q.mo23097h(obj)) {
            return null;
        }
        d2ok.n7h(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
        return obj;
    }
}
