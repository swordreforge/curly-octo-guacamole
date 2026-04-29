package kotlin.collections;

import java.util.Iterator;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Iterators.kt */
/* JADX INFO: loaded from: classes3.dex */
class o1t extends C6175z {
    @InterfaceC7396q
    public static final <T> Iterator<x9kr<T>> ek5k(@InterfaceC7396q Iterator<? extends T> it) {
        kotlin.jvm.internal.d2ok.m23075h(it, "<this>");
        return new C6153l(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    /* JADX INFO: renamed from: m */
    private static final <T> Iterator<T> m22593m(Iterator<? extends T> it) {
        kotlin.jvm.internal.d2ok.m23075h(it, "<this>");
        return it;
    }

    /* JADX INFO: renamed from: o */
    public static final <T> void m22594o(@InterfaceC7396q Iterator<? extends T> it, @InterfaceC7396q cyoe.x2<? super T, was> operation) {
        kotlin.jvm.internal.d2ok.m23075h(it, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }
}
