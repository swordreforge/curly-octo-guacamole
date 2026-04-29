package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.bo;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.t */
/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6163t extends wvg {
    @InterfaceC6234g
    private static final <T> void bo(Collection<? super T> collection, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        collection.remove(t2);
    }

    @InterfaceC6234g
    private static final <T> void c8jq(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        qo(collection, elements);
    }

    public static <T> boolean ch(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return collection.addAll(kja0.m22514i(elements));
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: d */
    private static final <T> boolean m22607d(Collection<? extends T> collection, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return bo.m23058k(collection).remove(t2);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T d8wk(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <T> void dr(Collection<? super T> collection, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        collection.add(t2);
    }

    public static final <T> boolean fnq8(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        List listNyj = kotlin.sequences.fn3e.nyj(elements);
        return (listNyj.isEmpty() ^ true) && collection.removeAll(listNyj);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.yz(version = "1.4")
    public static <T> T g1(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(ni7.jp0y(list));
    }

    public static <T> boolean gbni(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        return lv5(iterable, predicate, false);
    }

    @InterfaceC6234g
    private static final <T> void gyi(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        zp(collection, elements);
    }

    public static final <T> boolean i9jn(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        List listNyj = kotlin.sequences.fn3e.nyj(elements);
        return listNyj.isEmpty() ^ true ? collection.retainAll(listNyj) : m4(collection);
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use removeAt(index) instead.", replaceWith = @kotlin.hb(expression = "removeAt(index)", imports = {}))
    private static final <T> T ikck(List<T> list, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.remove(i2);
    }

    public static final <T> boolean ltg8(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return (elements.length == 0) ^ true ? collection.retainAll(kja0.m22514i(elements)) : m4(collection);
    }

    private static final <T> boolean lv5(Iterable<? extends T> iterable, cyoe.x2<? super T, Boolean> x2Var, boolean z2) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (x2Var.invoke(it.next()).booleanValue() == z2) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }

    private static final boolean m4(Collection<?> collection) {
        boolean z2 = !collection.isEmpty();
        collection.clear();
        return z2;
    }

    public static final <T> boolean mu(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        return lv5(iterable, predicate, true);
    }

    @InterfaceC7396q
    public static <T> Collection<T> nmn5(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : a9.wr(iterable);
    }

    @InterfaceC6234g
    private static final <T> boolean py(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return bo.m23058k(collection).retainAll(elements);
    }

    @InterfaceC6234g
    private static final <T> boolean qkj8(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return bo.m23058k(collection).removeAll(elements);
    }

    public static final <T> boolean qo(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return ((elements.length == 0) ^ true) && collection.removeAll(kja0.m22514i(elements));
    }

    public static final <T> boolean r8s8(@InterfaceC7396q List<T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        return t8iq(list, predicate, false);
    }

    private static final <T> boolean t8iq(List<T> list, cyoe.x2<? super T, Boolean> x2Var, boolean z2) {
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.d2ok.n7h(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return lv5(bo.zy(list), x2Var, z2);
        }
        n5r1 it = new kotlin.ranges.x2(0, ni7.jp0y(list)).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            T t2 = list.get(iNextInt);
            if (x2Var.invoke(t2).booleanValue() != z2) {
                if (i2 != iNextInt) {
                    list.set(i2, t2);
                }
                i2++;
            }
        }
        if (i2 >= list.size()) {
            return false;
        }
        int iJp0y = ni7.jp0y(list);
        if (i2 > iJp0y) {
            return true;
        }
        while (true) {
            list.remove(iJp0y);
            if (iJp0y == i2) {
                return true;
            }
            iJp0y--;
        }
    }

    public static final <T> boolean tfm(@InterfaceC7396q List<T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        return t8iq(list, predicate, true);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: u */
    private static final <T> void m22608u(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        vq(collection, elements);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: v */
    private static final <T> void m22609v(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        ch(collection, elements);
    }

    public static final <T> boolean vq(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return collection.removeAll(nmn5(elements));
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static <T> T was(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(ni7.jp0y(list));
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @kotlin.yz(version = "1.4")
    public static final <T> T wo(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    /* JADX INFO: renamed from: x */
    public static <T> boolean m22610x(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    @InterfaceC6234g
    private static final <T> void xwq3(Collection<? super T> collection, kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        m22610x(collection, elements);
    }

    @InterfaceC6234g
    private static final <T> void y2(Collection<? super T> collection, kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        fnq8(collection, elements);
    }

    public static <T> boolean zp(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        boolean z2 = false;
        Iterator<? extends T> it = elements.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    public static final <T> boolean zsr0(@InterfaceC7396q Collection<? super T> collection, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return collection.retainAll(nmn5(elements));
    }
}
