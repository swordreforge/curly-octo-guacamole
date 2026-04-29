package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Sets.kt */
/* JADX INFO: loaded from: classes3.dex */
public class a98o extends i1 {
    @InterfaceC7396q
    public static final <T> Set<T> cdj(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (Set) C6144h.mp7a(elements, new LinkedHashSet(C6140e.m22479p(elements.length)));
    }

    @InterfaceC7396q
    public static final <T> Set<T> fn3e(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements.length > 0 ? C6144h.l2hi(elements) : ld6();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: h */
    private static final <T> Set<T> m22426h() {
        return new LinkedHashSet();
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: i */
    private static final <T> Set<T> m22427i() {
        return ld6();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T> Set<T> ki(@InterfaceC7396q Set<? extends T> set) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : i1.m22499g(set.iterator().next()) : ld6();
    }

    @InterfaceC7396q
    public static final <T> LinkedHashSet<T> kja0(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (LinkedHashSet) C6144h.mp7a(elements, new LinkedHashSet(C6140e.m22479p(elements.length)));
    }

    @InterfaceC7396q
    public static <T> Set<T> ld6() {
        return oc.INSTANCE;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <T> LinkedHashSet<T> n7h() {
        return new LinkedHashSet<>();
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T> Set<T> ni7(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (Set) C6144h.xn(elements, new LinkedHashSet());
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.6")
    /* JADX INFO: renamed from: p */
    private static final <E> Set<E> m22428p(@kotlin.toq cyoe.x2<? super Set<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Set setM22502q = i1.m22502q();
        builderAction.invoke(setM22502q);
        return i1.m22500k(setM22502q);
    }

    @InterfaceC7396q
    public static final <T> HashSet<T> qrj(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (HashSet) C6144h.mp7a(elements, new HashSet(C6140e.m22479p(elements.length)));
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.6")
    /* JADX INFO: renamed from: s */
    private static final <E> Set<E> m22429s(int i2, @kotlin.toq cyoe.x2<? super Set<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        Set setM22501n = i1.m22501n(i2);
        builderAction.invoke(setM22501n);
        return i1.m22500k(setM22501n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <T> Set<T> t8r(Set<? extends T> set) {
        return set == 0 ? ld6() : set;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <T> HashSet<T> x2() {
        return new HashSet<>();
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T> Set<T> zurt(@InterfaceC7395n T t2) {
        return t2 != null ? i1.m22499g(t2) : ld6();
    }
}
