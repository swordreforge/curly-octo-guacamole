package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.a */
/* JADX INFO: compiled from: _Sets.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
public class C6127a extends a98o {
    @InterfaceC7396q
    public static final <T> Set<T> a9(@InterfaceC7396q Set<? extends T> set, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C6140e.m22479p(set.size() * 2));
        linkedHashSet.addAll(set);
        C6163t.m22610x(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InterfaceC7396q
    public static final <T> Set<T> fti(@InterfaceC7396q Set<? extends T> set, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C6140e.m22479p(set.size() + elements.length));
        linkedHashSet.addAll(set);
        C6163t.ch(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InterfaceC7396q
    public static final <T> Set<T> fu4(@InterfaceC7396q Set<? extends T> set, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        Collection<?> collectionNmn5 = C6163t.nmn5(elements);
        if (collectionNmn5.isEmpty()) {
            return a9.yvs(set);
        }
        if (!(collectionNmn5 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionNmn5);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t2 : set) {
            if (!collectionNmn5.contains(t2)) {
                linkedHashSet2.add(t2);
            }
        }
        return linkedHashSet2;
    }

    @InterfaceC7396q
    public static final <T> Set<T> jk(@InterfaceC7396q Set<? extends T> set, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C6140e.m22479p(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t2);
        return linkedHashSet;
    }

    @InterfaceC6234g
    private static final <T> Set<T> jp0y(Set<? extends T> set, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        return jk(set, t2);
    }

    @InterfaceC7396q
    public static <T> Set<T> mcp(@InterfaceC7396q Set<? extends T> set, @InterfaceC7396q Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        Integer numM22497e = fu4.m22497e(elements);
        if (numM22497e != null) {
            size = set.size() + numM22497e.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C6140e.m22479p(size));
        linkedHashSet.addAll(set);
        C6163t.zp(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InterfaceC7396q
    public static final <T> Set<T> o1t(@InterfaceC7396q Set<? extends T> set, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C6163t.fnq8(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final <T> Set<T> m22422t(Set<? extends T> set, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        return m22423z(set, t2);
    }

    @InterfaceC7396q
    public static final <T> Set<T> wvg(@InterfaceC7396q Set<? extends T> set, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C6163t.qo(linkedHashSet, elements);
        return linkedHashSet;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final <T> Set<T> m22423z(@InterfaceC7396q Set<? extends T> set, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C6140e.m22479p(set.size()));
        boolean z2 = false;
        for (T t3 : set) {
            boolean z3 = true;
            if (!z2 && kotlin.jvm.internal.d2ok.f7l8(t3, t2)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                linkedHashSet.add(t3);
            }
        }
        return linkedHashSet;
    }
}
