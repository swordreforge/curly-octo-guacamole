package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.collections.builders.C6134p;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public class i1 {
    @InterfaceC7396q
    public static final <T> TreeSet<T> f7l8(@InterfaceC7396q Comparator<? super T> comparator, @InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (TreeSet) C6144h.mp7a(elements, new TreeSet(comparator));
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static <T> Set<T> m22499g(T t2) {
        Set<T> setSingleton = Collections.singleton(t2);
        kotlin.jvm.internal.d2ok.kja0(setSingleton, "singleton(element)");
        return setSingleton;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static <E> Set<E> m22500k(@InterfaceC7396q Set<E> builder) {
        kotlin.jvm.internal.d2ok.m23075h(builder, "builder");
        return ((C6134p) builder).build();
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: n */
    public static <E> Set<E> m22501n(int i2) {
        return new C6134p(i2);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: q */
    public static final <E> Set<E> m22502q() {
        return new C6134p();
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <E> Set<E> toq(int i2, cyoe.x2<? super Set<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Set setM22501n = m22501n(i2);
        builderAction.invoke(setM22501n);
        return m22500k(setM22501n);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> TreeSet<T> m22503y(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (TreeSet) C6144h.mp7a(elements, new TreeSet());
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <E> Set<E> zy(cyoe.x2<? super Set<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Set setM22502q = m22502q();
        builderAction.invoke(setM22502q);
        return m22500k(setM22502q);
    }
}
