package kotlin.collections;

import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.random.AbstractC6332g;
import kotlin.was;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n404#1:483\n1#2:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n398#1:483\n*E\n"})
public class ni7 extends zurt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.ni7$k */
    /* JADX INFO: compiled from: Collections.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,481:1\n*E\n"})
    public static final class C6157k<T> extends AbstractC6308r implements cyoe.x2<T, Integer> {

        /* JADX INFO: Incorrect field signature: TK; */
        final /* synthetic */ Comparable $key;
        final /* synthetic */ cyoe.x2<T, K> $selector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (Lcyoe/x2<-TT;+TK;>;TK;)V */
        public C6157k(cyoe.x2 x2Var, Comparable comparable) {
            super(1);
            this.$selector = x2Var;
            this.$key = comparable;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Integer invoke(T t2) {
            return Integer.valueOf(kotlin.comparisons.f7l8.x2((Comparable) this.$selector.invoke(t2), this.$key));
        }
    }

    @InterfaceC7396q
    public static <T> List<T> a9() {
        return gvn7.INSTANCE;
    }

    @kotlin.nn86
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: c */
    public static void m22563c() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <T> ArrayList<T> cdj() {
        return new ArrayList<>();
    }

    @InterfaceC7396q
    public static <T> List<T> d2ok(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements.length > 0 ? kja0.m22514i(elements) : a9();
    }

    @InterfaceC6234g
    private static final <T> boolean d3(Collection<? extends T> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return !collection.isEmpty();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <T> List<T> dd() {
        return new ArrayList();
    }

    @InterfaceC6234g
    private static final <T> List<T> eqxt() {
        return a9();
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: f */
    public static final <T> List<T> m22564f(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        List<T> listKrto = a9.krto(iterable);
        a9.ybb(listKrto, random);
        return listKrto;
    }

    public static final <T extends Comparable<? super T>> int fn3e(@InterfaceC7396q List<? extends T> list, @InterfaceC7395n T t2, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        hyr(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iX2 = kotlin.comparisons.f7l8.x2(list.get(i5), t2);
            if (iX2 < 0) {
                i2 = i5 + 1;
            } else {
                if (iX2 <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    @InterfaceC7396q
    public static kotlin.ranges.x2 fti(@InterfaceC7396q Collection<?> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return new kotlin.ranges.x2(0, collection.size() - 1);
    }

    public static /* synthetic */ int fu4(List list, Comparable comparable, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = list.size();
        }
        return fn3e(list, comparable, i2, i3);
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lcyoe/k<+TR;>;)TR; */
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final Object gvn7(Collection collection, InterfaceC5981k defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: h */
    private static final <T> List<T> m22565h(int i2, cyoe.x2<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.d2ok.m23075h(init, "init");
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(init.invoke(Integer.valueOf(i3)));
        }
        return arrayList;
    }

    private static final void hyr(int i2, int i3, int i4) {
        if (i3 > i4) {
            throw new IllegalArgumentException("fromIndex (" + i3 + ") is greater than toIndex (" + i4 + ").");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i3 + ") is less than zero.");
        }
        if (i4 <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: i */
    public static final <T> int m22566i(@InterfaceC7396q List<? extends T> list, int i2, int i3, @InterfaceC7396q cyoe.x2<? super T, Integer> comparison) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparison, "comparison");
        hyr(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iIntValue = comparison.invoke(list.get(i5)).intValue();
            if (iIntValue < 0) {
                i2 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    @InterfaceC6234g
    private static final <T> boolean jk(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return collection.containsAll(elements);
    }

    public static <T> int jp0y(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.size() - 1;
    }

    @InterfaceC7396q
    public static <T> ArrayList<T> ki(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(new C6159p(elements, true));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.1")
    private static final <T> List<T> kja0(int i2, cyoe.x2<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.d2ok.m23075h(init, "init");
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(init.invoke(Integer.valueOf(i3)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    /* JADX INFO: renamed from: l */
    private static final <T> Collection<T> m22567l(Collection<? extends T> collection) {
        return collection == 0 ? a9() : collection;
    }

    @kotlin.nn86
    @kotlin.yz(version = "1.3")
    public static void lrht() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @InterfaceC7396q
    public static final <T> List<T> lvui(@InterfaceC7395n T t2) {
        return t2 != null ? zurt.ld6(t2) : a9();
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.6")
    private static final <E> List<E> mcp(@kotlin.toq cyoe.x2<? super List<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        List listM22678s = zurt.m22678s();
        builderAction.invoke(listM22678s);
        return zurt.m22674k(listM22678s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <T> List<T> n5r1(List<? extends T> list) {
        return list == 0 ? a9() : list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T> List<T> ncyb(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : zurt.ld6(list.get(0)) : a9();
    }

    public static /* synthetic */ int ni7(List list, int i2, int i3, cyoe.x2 x2Var, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = list.size();
        }
        return m22566i(list, i2, i3, x2Var);
    }

    public static final <T, K extends Comparable<? super K>> int o1t(@InterfaceC7396q List<? extends T> list, @InterfaceC7395n K k2, int i2, int i3, @InterfaceC7396q cyoe.x2<? super T, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return m22566i(list, i2, i3, new C6157k(selector, k2));
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <T> boolean oc(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: r */
    public static <T> List<T> m22568r(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return C6144h.hql(elements);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.6")
    /* JADX INFO: renamed from: t */
    private static final <E> List<E> m22569t(int i2, @kotlin.toq cyoe.x2<? super List<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        List listM22676p = zurt.m22676p(i2);
        builderAction.invoke(listM22676p);
        return zurt.m22674k(listM22676p);
    }

    @InterfaceC7396q
    public static final <T> Collection<T> t8r(@InterfaceC7396q T[] tArr) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        return new C6159p(tArr, false);
    }

    public static /* synthetic */ int wvg(List list, Comparable comparable, int i2, int i3, cyoe.x2 x2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = list.size();
        }
        return m22566i(list, i2, i3, new C6157k(x2Var, comparable));
    }

    @InterfaceC7396q
    public static <T> List<T> x9kr(@InterfaceC7396q T... elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new C6159p(elements, true));
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ int m22570z(List list, Object obj, Comparator comparator, int i2, int i3, int i4, Object obj2) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = list.size();
        }
        return zurt(list, obj, comparator, i2, i3);
    }

    public static final <T> int zurt(@InterfaceC7396q List<? extends T> list, T t2, @InterfaceC7396q Comparator<? super T> comparator, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        hyr(list.size(), i2, i3);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iCompare = comparator.compare(list.get(i5), t2);
            if (iCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }
}
