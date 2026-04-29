package kotlin.collections;

import cyoe.InterfaceC5979h;
import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.C6227f;
import kotlin.InterfaceC6232i;
import kotlin.comparisons.f7l8;
import kotlin.gyi;
import kotlin.i9jn;
import kotlin.ikck;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.InterfaceC6239n;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.random.AbstractC6332g;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _Collections.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3683:1\n288#1,2:3684\n518#1,7:3686\n533#1,6:3693\n857#1,2:3700\n788#1:3702\n1864#1,2:3703\n789#1,2:3705\n1866#1:3707\n791#1:3708\n1864#1,3:3709\n809#1,2:3712\n847#1,2:3714\n1253#1,4:3720\n1222#1,4:3724\n1238#1,4:3728\n1285#1,4:3732\n1446#1,5:3736\n1461#1,5:3741\n1502#1,3:3746\n1505#1,3:3756\n1520#1,3:3759\n1523#1,3:3769\n1620#1,3:3786\n1590#1,4:3789\n1579#1:3793\n1864#1,2:3794\n1866#1:3797\n1580#1:3798\n1864#1,3:3799\n1611#1:3802\n1855#1:3803\n1856#1:3805\n1612#1:3806\n1855#1,2:3807\n1864#1,3:3809\n2847#1,3:3812\n2850#1,6:3816\n2872#1,3:3822\n2875#1,7:3826\n857#1,2:3833\n819#1:3835\n847#1,2:3836\n819#1:3838\n847#1,2:3839\n819#1:3841\n847#1,2:3842\n3405#1,8:3848\n3433#1,7:3856\n3464#1,10:3863\n1#2:3699\n1#2:3796\n1#2:3804\n1#2:3815\n1#2:3825\n37#3,2:3716\n37#3,2:3718\n372#4,7:3749\n372#4,7:3762\n372#4,7:3772\n372#4,7:3779\n32#5,2:3844\n32#5,2:3846\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n167#1:3684,2\n177#1:3686,7\n187#1:3693,6\n766#1:3700,2\n777#1:3702\n777#1:3703,2\n777#1:3705,2\n777#1:3707\n777#1:3708\n788#1:3709,3\n800#1:3712,2\n819#1:3714,2\n1180#1:3720,4\n1195#1:3724,4\n1209#1:3728,4\n1272#1:3732,4\n1360#1:3736,5\n1373#1:3741,5\n1477#1:3746,3\n1477#1:3756,3\n1490#1:3759,3\n1490#1:3769,3\n1549#1:3786,3\n1559#1:3789,4\n1569#1:3793\n1569#1:3794,2\n1569#1:3797\n1569#1:3798\n1579#1:3799,3\n1603#1:3802\n1603#1:3803\n1603#1:3805\n1603#1:3806\n1611#1:3807,2\n2645#1:3809,3\n2949#1:3812,3\n2949#1:3816,6\n2967#1:3822,3\n2967#1:3826,7\n3143#1:3833,2\n3151#1:3835\n3151#1:3836,2\n3161#1:3838\n3161#1:3839,2\n3171#1:3841\n3171#1:3842,2\n3394#1:3848,8\n3422#1:3856,7\n3451#1:3863,10\n1569#1:3796\n1603#1:3804\n2949#1:3815\n2967#1:3825\n1032#1:3716,2\n1075#1:3718,2\n1477#1:3749,7\n1490#1:3762,7\n1504#1:3772,7\n1522#1:3779,7\n3339#1:3844,2\n3381#1:3846,2\n*E\n"})
public class a9 extends jk {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.a9$k */
    /* JADX INFO: compiled from: Sequences.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n3524#2:681\n*E\n"})
    public static final class C6128k<T> implements kotlin.sequences.qrj<T> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterable f36107k;

        public C6128k(Iterable iterable) {
            this.f36107k = iterable;
        }

        @Override // kotlin.sequences.qrj
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return this.f36107k.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.a9$q */
    /* JADX INFO: compiled from: _Collections.kt */
    static final class C6129q<T> extends AbstractC6308r implements InterfaceC5981k<Iterator<? extends T>> {
        final /* synthetic */ Iterable<T> $this_withIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6129q(Iterable<? extends T> iterable) {
            super(0);
            this.$this_withIndex = iterable;
        }

        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Iterator<T> invoke() {
            return this.$this_withIndex.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: _Collections.kt */
    static final class toq<T> extends AbstractC6308r implements cyoe.x2<Integer, T> {
        final /* synthetic */ int $index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(int i2) {
            super(1);
            this.$index = i2;
        }

        public final T invoke(int i2) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.$index + '.');
        }

        @Override // cyoe.x2
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: compiled from: _Collections.kt */
    @kotlin.jvm.internal.lv5({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3683:1\n*E\n"})
    public static final class zy<K, T> implements d2ok<T, K> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Iterable<T> f36108k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ cyoe.x2<T, K> f81779toq;

        /* JADX WARN: Multi-variable type inference failed */
        public zy(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36108k = iterable;
            this.f81779toq = x2Var;
        }

        @Override // kotlin.collections.d2ok
        /* JADX INFO: renamed from: k */
        public K mo22425k(T t2) {
            return this.f81779toq.invoke(t2);
        }

        @Override // kotlin.collections.d2ok
        @InterfaceC7396q
        public Iterator<T> toq() {
            return this.f36108k.iterator();
        }
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <T> T a3dw(Collection<? extends T> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return (T) ydj3(collection, AbstractC6332g.Default);
    }

    @InterfaceC7396q
    public static final <T, R> List<C6227f<T, R>> a4ph(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends R> other) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(iterable, 10), fu4.vyq(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(kotlin.nmn5.m23230k(it.next(), it2.next()));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T, R> List<R> a5id(@InterfaceC7396q Iterable<? extends T> iterable, int i2, @InterfaceC7396q cyoe.x2<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        return tvn8(iterable, i2, i2, true, transform);
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> double a7zh(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    public static final <T, R extends Comparable<? super R>> T a8p6(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, List<V>>> M ab(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(valueTransform.invoke(t2));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T> List<T> ae4(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfInt")
    private static final <T> int ahb(Iterable<? extends T> iterable, cyoe.x2<? super T, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, C extends Iterable<? extends T>> C alcv(@InterfaceC7396q C c2, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(c2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int i2 = 0;
        for (T t2 : c2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            action.invoke(Integer.valueOf(i2), t2);
            i2 = i3;
        }
        return c2;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C anhx(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i2), t2);
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
            i2 = i3;
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T anw(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final float ap23(@InterfaceC7396q Iterable<Float> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C b2(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.x2(warningSince = "1.5")
    @kotlin.ld6(message = "Use sumOf instead.", replaceWith = @kotlin.hb(expression = "this.sumOf(selector)", imports = {}))
    public static final <T> int b3fl(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Integer> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += selector.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    public static final <S, T extends S> S b6(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q InterfaceC5979h<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @InterfaceC7396q
    public static final <T, R> List<C6227f<T, R>> b6i9(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q R[] other) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(iterable, 10), length));
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(kotlin.nmn5.m23230k(t2, other[i2]));
            i2++;
        }
        return arrayList;
    }

    public static final <T> int b7(@InterfaceC7396q List<? extends T> list, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.lastIndexOf(t2);
    }

    public static final <T> int b8(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue() && (i2 = i2 + 1) < 0) {
                ni7.m22563c();
            }
        }
        return i2;
    }

    public static final <T> int b9ub(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i2 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        return i2;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T, R> List<R> bao0(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super T, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList();
        a98o.zy next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @InterfaceC6769y(name = "averageOfByte")
    public static final double bap7(@InterfaceC7396q Iterable<Byte> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i2);
    }

    @InterfaceC6769y(name = "sumOfLong")
    public static final long bb(@InterfaceC7396q Iterable<Long> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @InterfaceC7396q
    public static final <T> List<T> bf5(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (iterable instanceof Collection) {
            return y3((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        C6163t.zp(arrayList, iterable);
        C6163t.ch(arrayList, elements);
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C bih(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            if (predicate.invoke(Integer.valueOf(i2), t2).booleanValue()) {
                destination.add(t2);
            }
            i2 = i3;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> List<T> bmt3(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q Iterable<Integer> indices) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        int iVyq = fu4.vyq(indices, 10);
        if (iVyq == 0) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList(iVyq);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T, R, V> List<V> bp(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q R[] other, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(iterable, 10), length));
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t2, other[i2]));
            i2++;
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    private static final <T, R> R bqie(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @InterfaceC7396q
    public static final <T> List<T> brv(@InterfaceC7396q Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return mla((Collection) iterable, t2);
        }
        ArrayList arrayList = new ArrayList();
        C6163t.zp(arrayList, iterable);
        arrayList.add(t2);
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterable")
    private static final <T, R> List<R> btvn(Iterable<? extends T> iterable, InterfaceC5979h<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            C6163t.zp(arrayList, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return arrayList;
    }

    @InterfaceC7395n
    public static <T> T c2(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <T, K> d2ok<T, K> c25(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        return new zy(iterable, keySelector);
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S cb(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q InterfaceC5979h<? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <T> boolean cjaj(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    @kotlin.hyr
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapSequence")
    public static final <T, R> List<R> cn02(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6163t.m22610x(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T> boolean cnbm(@InterfaceC7396q Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t2) : tjz5(iterable, t2) >= 0;
    }

    @InterfaceC7395n
    public static final <T> T cp(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T> List<T> cr3(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        ArrayList arrayList = new ArrayList();
        C6163t.zp(arrayList, iterable);
        C6163t.m22610x(arrayList, elements);
        return arrayList;
    }

    @InterfaceC6769y(name = "sumOfFloat")
    public static final float cyg(@InterfaceC7396q Iterable<Float> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C cyoe(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : iterable) {
            if (!predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R d6c(Iterable<? extends T> iterable, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    private static final <T> List<T> d6od(Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return brv(iterable, t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static final <T> Iterable<T> d9i(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T dbf(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T> Set<T> dm(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends T> other) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<T> setZidq = zidq(iterable);
        C6163t.zp(setZidq, other);
        return setZidq;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final <T> boolean m28273do(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final <T, R extends Comparable<? super R>> List<T> drpy(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return zxa9(iterable, new f7l8.zy(selector));
    }

    @InterfaceC6769y(name = "averageOfShort")
    public static final double dxef(@InterfaceC7396q Iterable<Short> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i2);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float e4e(@InterfaceC7396q Iterable<Float> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6769y(name = "averageOfLong")
    public static final double e5(@InterfaceC7396q Iterable<Long> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i2);
    }

    @InterfaceC7396q
    public static final <T> List<T> e9s(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (list.isEmpty()) {
            return ni7.a9();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return ni7.a9();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return wr(list);
    }

    @InterfaceC7396q
    public static <T> kotlin.sequences.qrj<T> ebn(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return new C6128k(iterable);
    }

    public static final /* synthetic */ <R> List<R> ec(Iterable<?> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            kotlin.jvm.internal.d2ok.m23086z(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static <T extends Comparable<? super T>> T eklw(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @InterfaceC6234g
    private static final <T> T el(List<? extends T> list, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T extends Comparable<? super T>> T erbd(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    public static final <T> T es7(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static final <T> boolean eu(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static final <T, K> List<T> ew(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends K> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (hashSet.add(selector.invoke(t2))) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C exv8(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6163t.zp(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    private static final <T, R> R f1bi(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <T> T f26p(Collection<? extends T> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return (T) qppo(collection, AbstractC6332g.Default);
    }

    public static final <T> int f3f(@InterfaceC7396q List<? extends T> list, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.indexOf(t2);
    }

    @InterfaceC7396q
    public static final <T, R> List<R> f7z0(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(fu4.vyq(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final byte[] fbr(@InterfaceC7396q Collection<Byte> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bArr[i2] = it.next().byteValue();
            i2++;
        }
        return bArr;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T ff(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T, R> List<R> fh(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(fu4.vyq(iterable, 10));
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return arrayList;
    }

    @InterfaceC6769y(name = "sumOfInt")
    public static final int fupf(@InterfaceC7396q Iterable<Integer> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    public static final <T> T g0ad(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final float[] g41(@InterfaceC7396q Collection<Float> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = it.next().floatValue();
            i2++;
        }
        return fArr;
    }

    @InterfaceC6769y(name = "averageOfInt")
    public static final double ga(@InterfaceC7396q Iterable<Integer> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i2);
    }

    @InterfaceC7396q
    public static final <T, R> List<R> gb(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6163t.zp(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T gcp(List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.get(1);
    }

    @InterfaceC7396q
    public static final <T, R> List<R> ge(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <T, C extends Iterable<? extends T>> C gw(@InterfaceC7396q C c2, @InterfaceC7396q cyoe.x2<? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(c2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        Iterator<T> it = c2.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c2;
    }

    @InterfaceC6769y(name = "averageOfDouble")
    public static final double h4b(@InterfaceC7396q Iterable<Double> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i2);
    }

    public static final <T, R> R hyow(@InterfaceC7396q Iterable<? extends T> iterable, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            r2 = operation.invoke(Integer.valueOf(i2), r2, t2);
            i2 = i3;
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T> String i1an(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        String string = ((StringBuilder) kt06(iterable, new StringBuilder(), separator, prefix, postfix, i2, truncated, x2Var)).toString();
        kotlin.jvm.internal.d2ok.kja0(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    public static final <T> int i3x9(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                ni7.lrht();
            }
            if (predicate.invoke(t2).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C i8(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> List<T> ie(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return wr(iterable);
        }
        List<T> listKrto = krto(iterable);
        jk.vep5(listKrto);
        return listKrto;
    }

    @InterfaceC7396q
    public static final <T, K> Map<K, T> ij(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fu4.vyq(iterable, 10)), 16));
        for (T t2 : iterable) {
            linkedHashMap.put(keySelector.invoke(t2), t2);
        }
        return linkedHashMap;
    }

    public static <T> T imd(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final <T extends Comparable<? super T>> T ip(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T> List<T> is(@InterfaceC7396q List<? extends T> list, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        int size = list.size();
        if (i2 >= size) {
            return wr(list);
        }
        if (i2 == 1) {
            return zurt.ld6(wwp(list));
        }
        ArrayList arrayList = new ArrayList(i2);
        if (list instanceof RandomAccess) {
            for (int i3 = size - i2; i3 < size; i3++) {
                arrayList.add(list.get(i3));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @InterfaceC6769y(name = "sumOfDouble")
    public static final double iw(@InterfaceC7396q Iterable<Double> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static <T> List<T> ix(@InterfaceC7396q Iterable<? extends T> iterable, int i2) {
        ArrayList arrayList;
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return wr(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i2;
            if (size <= 0) {
                return ni7.a9();
            }
            if (size == 1) {
                return zurt.ld6(m8(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i2 < size2) {
                        arrayList.add(((List) iterable).get(i2));
                        i2++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i2);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        for (T t2 : iterable) {
            if (i3 >= i2) {
                arrayList.add(t2);
            } else {
                i3++;
            }
        }
        return ni7.ncyb(arrayList);
    }

    public static final <T> boolean ixz(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    public static final <T> T iz(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minOrThrow")
    public static final double izu(@InterfaceC7396q Iterable<Double> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T> List<List<T>> j1s(@InterfaceC7396q Iterable<? extends T> iterable, int i2, int i3, boolean z2) {
        int iM23305t;
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        C6171x.m22658k(i2, i3);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator qVar = C6171x.toq(iterable.iterator(), i2, i3, z2, false);
            while (qVar.hasNext()) {
                arrayList.add((List) qVar.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i3) + (size % i3 == 0 ? 0 : 1));
        int i4 = 0;
        while (true) {
            if (!(i4 >= 0 && i4 < size) || ((iM23305t = kotlin.ranges.fn3e.m23305t(i2, size - i4)) < i2 && !z2)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iM23305t);
            for (int i5 = 0; i5 < iM23305t; i5++) {
                arrayList3.add(list.get(i5 + i4));
            }
            arrayList2.add(arrayList3);
            i4 += i3;
        }
        return arrayList2;
    }

    @InterfaceC7396q
    public static final char[] j3px(@InterfaceC7396q Collection<Character> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            cArr[i2] = it.next().charValue();
            i2++;
        }
        return cArr;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C j3y2(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            destination.add(transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    public static final <S, T extends S> S jb9(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            i2 = i3;
        }
        return next;
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> List<T> je1q(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return zxa9(iterable, kotlin.comparisons.f7l8.fu4());
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> jglj(@InterfaceC7396q Iterable<? extends T> iterable, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVyq = fu4.vyq(iterable, 9);
        if (iVyq == 0) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iVyq + 1);
        arrayList.add(r2);
        int i2 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, it.next());
            arrayList.add(r2);
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> jog(@InterfaceC7396q Iterable<? extends T> iterable, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVyq = fu4.vyq(iterable, 9);
        if (iVyq == 0) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iVyq + 1);
        arrayList.add(r2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> List<T> jre(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listKrto = krto(iterable);
            wvg.bf2(listKrto);
            return listKrto;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return wr(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        kja0.anw((Comparable[]) array);
        return kja0.m22514i(array);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Double jyr(Iterable<? extends T> iterable, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    public static final double[] k2b8(@InterfaceC7396q Collection<Double> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dArr[i2] = it.next().doubleValue();
            i2++;
        }
        return dArr;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Float k4jz(Iterable<? extends T> iterable, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7395n
    public static <T> T kbj(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @InterfaceC7396q
    public static final <T> List<T> kiv(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R kjd(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7395n
    public static final <T> T kl7m(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static /* synthetic */ List km9o(Iterable iterable, int i2, int i3, boolean z2, cyoe.x2 x2Var, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return tvn8(iterable, i2, i3, z2, x2Var);
    }

    @InterfaceC7396q
    public static final <T> List<T> koj(@InterfaceC7396q Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        ArrayList arrayList = new ArrayList(fu4.vyq(iterable, 10));
        boolean z2 = false;
        for (T t3 : iterable) {
            boolean z3 = true;
            if (!z2 && kotlin.jvm.internal.d2ok.f7l8(t3, t2)) {
                z2 = true;
                z3 = false;
            }
            if (z3) {
                arrayList.add(t3);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, R> List<R> kq(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            R rInvoke = transform.invoke(Integer.valueOf(i2), t2);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i2 = i3;
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedIterableTo")
    private static final <T, R, C extends Collection<? super R>> C kq2f(Iterable<? extends T> iterable, C destination, InterfaceC5979h<? super Integer, ? super T, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            C6163t.zp(destination, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> List<T> krto(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? xzk4((Collection) iterable) : (List) i8(iterable, new ArrayList());
    }

    @InterfaceC7396q
    public static final <T, A extends Appendable> A kt06(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q A buffer, @InterfaceC7396q CharSequence separator, @InterfaceC7396q CharSequence prefix, @InterfaceC7396q CharSequence postfix, int i2, @InterfaceC7396q CharSequence truncated, @InterfaceC7395n cyoe.x2<? super T, ? extends CharSequence> x2Var) throws IOException {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(buffer, "buffer");
        kotlin.jvm.internal.d2ok.m23075h(separator, "separator");
        kotlin.jvm.internal.d2ok.m23075h(prefix, "prefix");
        kotlin.jvm.internal.d2ok.m23075h(postfix, "postfix");
        kotlin.jvm.internal.d2ok.m23075h(truncated, "truncated");
        buffer.append(prefix);
        int i3 = 0;
        for (T t2 : iterable) {
            i3++;
            if (i3 > 1) {
                buffer.append(separator);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            kotlin.text.ni7.toq(buffer, t2, x2Var);
        }
        if (i2 >= 0 && i3 > i2) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    @InterfaceC7396q
    public static <T> List<T> kx3(@InterfaceC7396q List<? extends T> list, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (i2 >= 0) {
            return p996(list, kotlin.ranges.fn3e.fn3e(list.size() - i2, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
    }

    @InterfaceC7396q
    public static final <T> Set<T> kz28(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends T> other) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<T> setZidq = zidq(iterable);
        C6163t.zsr0(setZidq, other);
        return setZidq;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> l0(@InterfaceC7396q Iterable<? extends T> iterable, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVyq = fu4.vyq(iterable, 9);
        if (iVyq == 0) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iVyq + 1);
        arrayList.add(r2);
        int i2 = 0;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(Integer.valueOf(i2), r2, it.next());
            arrayList.add(r2);
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super T>, T> C l05(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (T t2 : iterable) {
            if (t2 != null) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static <T> List<T> l7o(@InterfaceC7396q Collection<? extends T> collection, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C6163t.zp(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfLong")
    private static final <T> long l92(Iterable<? extends T> iterable, cyoe.x2<? super T, Long> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += selector.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @InterfaceC7395n
    public static final <T> T le7(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @InterfaceC7396q
    public static final long[] le9(@InterfaceC7396q Collection<Long> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = it.next().longValue();
            i2++;
        }
        return jArr;
    }

    @InterfaceC6234g
    private static final <T> List<T> lg4k(Collection<? extends T> collection, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return mla(collection, t2);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final <K, V, M extends Map<? super K, ? super V>> M lh(@InterfaceC7396q Iterable<? extends K> iterable, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        for (K k2 : iterable) {
            destination.put(k2, valueSelector.invoke(k2));
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> Iterable<x9kr<T>> li5y(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return new ncyb(new C6129q(iterable));
    }

    @InterfaceC7395n
    public static final <T> T lk(@InterfaceC7396q List<? extends T> list, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (i2 < 0 || i2 > ni7.jp0y(list)) {
            return null;
        }
        return list.get(i2);
    }

    @InterfaceC7396q
    public static final int[] lm(@InterfaceC7396q Collection<Integer> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = it.next().intValue();
            i2++;
        }
        return iArr;
    }

    public static final <S, T extends S> S ln(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @InterfaceC6234g
    private static final <T> T lw(List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.get(0);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Double m28(Iterable<? extends T> iterable, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7396q
    public static final <T> List<T> m2t(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (T t2 : iterable) {
            if (z2) {
                arrayList.add(t2);
            } else if (!predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
                z2 = true;
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T m58i(List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.get(4);
    }

    public static final <T> T m8(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) wwp((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @InterfaceC6769y(name = "sumOfByte")
    public static final int ma8k(@InterfaceC7396q Iterable<Byte> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> float mete(Iterable<? extends T> iterable, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    public static final <T> void mi1u(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            action.invoke(Integer.valueOf(i2), t2);
            i2 = i3;
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedSequenceTo")
    private static final <T, R, C extends Collection<? super R>> C mj(Iterable<? extends T> iterable, C destination, InterfaceC5979h<? super Integer, ? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            C6163t.m22610x(destination, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return destination;
    }

    public static final <T> T mkmm(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @InterfaceC7396q
    public static <T> List<T> mla(@InterfaceC7396q Collection<? extends T> collection, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t2);
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> List<T> mq(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q kotlin.ranges.x2 indices) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(indices, "indices");
        return indices.isEmpty() ? ni7.a9() : wr(list.subList(indices.mo2951k().intValue(), indices.zy().intValue() + 1));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @InterfaceC7395n
    public static final <T> T mub(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfULong")
    private static final <T> long mxh(Iterable<? extends T> iterable, cyoe.x2<? super T, ikck> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        long jLd6 = ikck.ld6(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            jLd6 = ikck.ld6(jLd6 + selector.invoke(it.next()).a98o());
        }
        return jLd6;
    }

    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, ? super V>> M n2t(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        for (T t2 : iterable) {
            destination.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R nc(Iterable<? extends T> iterable, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    public static final <K, V> Map<K, V> ngy(@InterfaceC7396q Iterable<? extends K> iterable, @InterfaceC7396q cyoe.x2<? super K, ? extends V> valueSelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fu4.vyq(iterable, 10)), 16));
        for (K k2 : iterable) {
            linkedHashMap.put(k2, valueSelector.invoke(k2));
        }
        return linkedHashMap;
    }

    @InterfaceC6234g
    private static final <T> int nme(Collection<? extends T> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return collection.size();
    }

    @InterfaceC7395n
    public static final <T> T nnh(@InterfaceC7396q Iterable<? extends T> iterable, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) lk((List) iterable, i2);
        }
        if (i2 < 0) {
            return null;
        }
        int i3 = 0;
        for (T t2 : iterable) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t2;
            }
            i3 = i4;
        }
        return null;
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final double nod(@InterfaceC7396q Iterable<Double> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7396q
    public static final <T, K, V> Map<K, V> nsb(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fu4.vyq(iterable, 10)), 16));
        for (T t2 : iterable) {
            linkedHashMap.put(keySelector.invoke(t2), valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    public static final <T> int nyj(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC6234g
    private static final <T> T o05(List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.get(3);
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C o5(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        for (Object obj : iterable) {
            kotlin.jvm.internal.d2ok.m23086z(3, "R");
            if (obj instanceof Object) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R oaex(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC7395n
    public static final <T> T ob(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T> List<T> oei(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        List listNyj = kotlin.sequences.fn3e.nyj(elements);
        if (listNyj.isEmpty()) {
            return wr(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!listNyj.contains(t2)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T oki(List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.get(2);
    }

    @InterfaceC7395n
    public static final <T> T oph(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    @kotlin.hyr
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapSequenceTo")
    public static final <T, R, C extends Collection<? super R>> C ovdh(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6163t.m22610x(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC6234g
    private static final <T> List<T> owi(Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return koj(iterable, t2);
    }

    @InterfaceC7396q
    public static final <T> Set<T> p6(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends T> other) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        Set<T> setZidq = zidq(iterable);
        C6163t.vq(setZidq, other);
        return setZidq;
    }

    @InterfaceC7396q
    public static final <T> List<T> p996(@InterfaceC7396q Iterable<? extends T> iterable, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        int i3 = 0;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i2 + " is less than zero.").toString());
        }
        if (i2 == 0) {
            return ni7.a9();
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return wr(iterable);
            }
            if (i2 == 1) {
                return zurt.ld6(wt(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return ni7.ncyb(arrayList);
    }

    @InterfaceC7396q
    public static final <T, K, V> Map<K, V> pc(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.fn3e.fn3e(C6140e.m22479p(fu4.vyq(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(it.next());
            linkedHashMap.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return linkedHashMap;
    }

    @InterfaceC6769y(name = "sumOfShort")
    public static final int pi(@InterfaceC7396q Iterable<Short> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @InterfaceC7396q
    public static final <T, K, V, M extends Map<? super K, ? super V>> M pjz9(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends C6227f<? extends K, ? extends V>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6227f<? extends K, ? extends V> c6227fInvoke = transform.invoke(it.next());
            destination.put(c6227fInvoke.getFirst(), c6227fInvoke.getSecond());
        }
        return destination;
    }

    public static final <T, R> R pnt2(@InterfaceC7396q List<? extends T> list, R r2, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2 = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r2);
            }
        }
        return r2;
    }

    @InterfaceC6234g
    private static final <T> T ps(List<? extends T> list, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return list.get(i2);
    }

    @InterfaceC7396q
    public static final <T, R extends Comparable<? super R>> List<T> py7(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        return zxa9(iterable, new f7l8.C6179k(selector));
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S qexj(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.cdj<? super Integer, ? super T, ? super S, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    public static final <T, R> R qh4d(@InterfaceC7396q Iterable<? extends T> iterable, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
        }
        return r2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> float qla(Iterable<? extends T> iterable, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T> T qppo(@InterfaceC7396q Collection<? extends T> collection, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) u38j(collection, random.nextInt(collection.size()));
    }

    @InterfaceC7396q
    public static final <T> List<T> r25n(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return wr(zidq(iterable));
    }

    @InterfaceC7396q
    public static final <T, C extends Collection<? super T>> C r6ty(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                destination.add(t2);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    private static final <T> T ra(List<? extends T> list, int i2, cyoe.x2<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > ni7.jp0y(list)) ? defaultValue.invoke(Integer.valueOf(i2)) : list.get(i2);
    }

    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final float rf(@InterfaceC7396q Iterable<Float> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> List<S> rig(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return ni7.a9();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(fu4.vyq(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final boolean[] rlj(@InterfaceC7396q Collection<Boolean> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = it.next().booleanValue();
            i2++;
        }
        return zArr;
    }

    @InterfaceC7396q
    public static final <T> List<T> rp(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return (List) l05(iterable, new ArrayList());
    }

    @InterfaceC7396q
    public static final <T> List<T> s31(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (elements.length == 0) {
            return wr(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!C6144h.ph5d(elements, t2)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R sb(Iterable<? extends T> iterable, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> double sb1e(Iterable<? extends T> iterable, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> int sc(@InterfaceC7396q Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t2);
        }
        int i2 = -1;
        int i3 = 0;
        for (T t3 : iterable) {
            if (i3 < 0) {
                ni7.lrht();
            }
            if (kotlin.jvm.internal.d2ok.f7l8(t2, t3)) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxOrThrow")
    public static final <T extends Comparable<? super T>> T sj(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <T, R> List<R> sm(@InterfaceC7396q Iterable<? extends T> iterable, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        int iVyq = fu4.vyq(iterable, 9);
        if (iVyq == 0) {
            return zurt.ld6(r2);
        }
        ArrayList arrayList = new ArrayList(iVyq + 1);
        arrayList.add(r2);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r2 = operation.invoke(r2, it.next());
            arrayList.add(r2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final short[] t8fp(@InterfaceC7396q Collection<Short> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            sArr[i2] = it.next().shortValue();
            i2++;
        }
        return sArr;
    }

    public static final <T> int tjz5(@InterfaceC7396q Iterable<? extends T> iterable, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t2);
        }
        int i2 = 0;
        for (T t3 : iterable) {
            if (i2 < 0) {
                ni7.lrht();
            }
            if (kotlin.jvm.internal.d2ok.f7l8(t2, t3)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T, R> List<R> tvn8(@InterfaceC7396q Iterable<? extends T> iterable, int i2, int i3, boolean z2, @InterfaceC7396q cyoe.x2<? super List<? extends T>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        C6171x.m22658k(i2, i3);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator qVar = C6171x.toq(iterable.iterator(), i2, i3, z2, true);
            while (qVar.hasNext()) {
                arrayList.add(transform.invoke((List) qVar.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i3) + (size % i3 == 0 ? 0 : 1));
        C6158o c6158o = new C6158o(list);
        int i4 = 0;
        while (true) {
            if (!(i4 >= 0 && i4 < size)) {
                break;
            }
            int iM23305t = kotlin.ranges.fn3e.m23305t(i2, size - i4);
            if (!z2 && iM23305t < i2) {
                break;
            }
            c6158o.m22592k(i4, iM23305t + i4);
            arrayList2.add(transform.invoke(c6158o));
            i4 += i3;
        }
        return arrayList2;
    }

    @InterfaceC7395n
    public static final <T> T tww7(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T> HashSet<T> u0z(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return (HashSet) i8(iterable, new HashSet(C6140e.m22479p(fu4.vyq(iterable, 12))));
    }

    public static final <T> T u38j(@InterfaceC7396q Iterable<? extends T> iterable, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i2) : (T) v5yj(iterable, i2, new toq(i2));
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T> List<C6227f<T, T>> uew(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return ni7.a9();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(kotlin.nmn5.m23230k(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> T uf(List<? extends T> list, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        return (T) lk(list, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final <T> Iterable<T> ukdy(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable;
    }

    public static final <T> T ula6(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ String uo(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, cyoe.x2 x2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i3 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i3 & 4) == 0 ? charSequence3 : "";
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        if ((i3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i3 & 32) != 0) {
            x2Var = null;
        }
        return i1an(iterable, charSequence, charSequence5, charSequence6, i4, charSequence7, x2Var);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> double uv(Iterable<? extends T> iterable, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T v5yj(@InterfaceC7396q Iterable<? extends T> iterable, int i2, @InterfaceC7396q cyoe.x2<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i2 < 0 || i2 > ni7.jp0y(list)) ? defaultValue.invoke(Integer.valueOf(i2)) : (T) list.get(i2);
        }
        if (i2 < 0) {
            return defaultValue.invoke(Integer.valueOf(i2));
        }
        int i3 = 0;
        for (T t2 : iterable) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return t2;
            }
            i3 = i4;
        }
        return defaultValue.invoke(Integer.valueOf(i2));
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double vahq(@InterfaceC7396q Iterable<Double> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Float vc(@InterfaceC7396q Iterable<Float> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T> Float vddr(Iterable<? extends T> iterable, cyoe.x2<? super T, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <T> List<T> verb(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (iterable instanceof Collection) {
            return l7o((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        C6163t.zp(arrayList, iterable);
        C6163t.zp(arrayList, elements);
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R> R vg(Iterable<? extends T> iterable, Comparator<? super R> comparator, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R vh(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <T> int vss1(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = -1;
        int i3 = 0;
        for (T t2 : iterable) {
            if (i3 < 0) {
                ni7.lrht();
            }
            if (predicate.invoke(t2).booleanValue()) {
                i2 = i3;
            }
            i3++;
        }
        return i2;
    }

    @InterfaceC6234g
    private static final <T> T vwb(List<? extends T> list, int i2, cyoe.x2<? super Integer, ? extends T> defaultValue) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(defaultValue, "defaultValue");
        return (i2 < 0 || i2 > ni7.jp0y(list)) ? defaultValue.invoke(Integer.valueOf(i2)) : list.get(i2);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T> List<List<T>> vy(@InterfaceC7396q Iterable<? extends T> iterable, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return j1s(iterable, i2, i2, true);
    }

    public static final <T extends Comparable<? super T>> void vymi(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        wvg.m22656a(list, kotlin.comparisons.f7l8.fu4());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: w */
    public static final <T> List<T> m22424w(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!predicate.invoke(listIterator.previous()).booleanValue()) {
                    return p996(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return ni7.a9();
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    @InterfaceC6769y(name = "sumOfUInt")
    private static final <T> int wen(Iterable<? extends T> iterable, cyoe.x2<? super T, gyi> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        int iLd6 = gyi.ld6(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            iLd6 = gyi.ld6(iLd6 + selector.invoke(it.next()).a98o());
        }
        return iLd6;
    }

    public static final <T, R extends Comparable<? super R>> void wh(@InterfaceC7396q List<T> list, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (list.size() > 1) {
            wvg.m22656a(list, new f7l8.zy(selector));
        }
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfDouble")
    private static final <T> double wkrb(Iterable<? extends T> iterable, cyoe.x2<? super T, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += selector.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6769y(name = "averageOfFloat")
    public static final double wlev(@InterfaceC7396q Iterable<Float> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i2 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i2++;
            if (i2 < 0) {
                ni7.m22563c();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i2);
    }

    @InterfaceC7395n
    public static final <T> T wqp(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        boolean z2 = false;
        T t2 = null;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    return null;
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        return null;
    }

    @InterfaceC7396q
    public static <T> List<T> wr(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return ni7.ncyb(krto(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ni7.a9();
        }
        if (size != 1) {
            return xzk4(collection);
        }
        return zurt.ld6(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static <T> T wt(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) imd((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @InterfaceC7396q
    public static final <T, K, M extends Map<? super K, List<T>>> M wtop(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = destination.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                destination.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t2);
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> List<T> wu(@InterfaceC7396q Collection<? extends T> collection, @InterfaceC7396q kotlin.sequences.qrj<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        C6163t.m22610x(arrayList, elements);
        return arrayList;
    }

    public static <T> T wwp(@InterfaceC7396q List<? extends T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(ni7.jp0y(list));
    }

    public static final <T> boolean wx16(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S x3b(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i2 = 1;
        while (it.hasNext()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            i2 = i3;
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <T, R extends Comparable<? super R>> T x7o(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    public static final <T, R> R xblq(@InterfaceC7396q List<? extends T> list, R r2, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r2 = operation.invoke(listIterator.previous(), r2);
            }
        }
        return r2;
    }

    @InterfaceC7396q
    public static final <T> List<T> xh(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!predicate.invoke(t2).booleanValue()) {
                break;
            }
            arrayList.add(t2);
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, R, V> List<V> xknm(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends R> other, @InterfaceC7396q InterfaceC5979h<? super T, ? super R, ? extends V> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(fu4.vyq(iterable, 10), fu4.vyq(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapIndexedSequence")
    private static final <T, R> List<R> xm(Iterable<? extends T> iterable, InterfaceC5979h<? super Integer, ? super T, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            C6163t.m22610x(arrayList, transform.invoke(Integer.valueOf(i2), t2));
            i2 = i3;
        }
        return arrayList;
    }

    public static final <T, R extends Comparable<? super R>> void xnu(@InterfaceC7396q List<T> list, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        if (list.size() > 1) {
            wvg.m22656a(list, new f7l8.C6179k(selector));
        }
    }

    public static <T> T xo(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) mkmm((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <S, T extends S> S xouc(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    @InterfaceC6239n
    public static final <T> void xtb7(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @InterfaceC7396q
    public static <T> List<T> xzk4(@InterfaceC7396q Collection<? extends T> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        return new ArrayList(collection);
    }

    @InterfaceC7396q
    public static final <T, K, V> Map<K, List<V>> xzl(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector, @InterfaceC7396q cyoe.x2<? super T, ? extends V> valueTransform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        kotlin.jvm.internal.d2ok.m23075h(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(valueTransform.invoke(t2));
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public static final <T> List<T> y3(@InterfaceC7396q Collection<? extends T> collection, @InterfaceC7396q T[] elements) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        C6163t.ch(arrayList, elements);
        return arrayList;
    }

    @kotlin.yz(version = "1.3")
    public static final <T> void ybb(@InterfaceC7396q List<T> list, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        for (int iJp0y = ni7.jp0y(list); iJp0y > 0; iJp0y--) {
            int iNextInt = random.nextInt(iJp0y + 1);
            list.set(iNextInt, list.set(iJp0y, list.get(iNextInt)));
        }
    }

    @kotlin.yz(version = "1.3")
    public static final <T> T ydj3(@InterfaceC7396q Collection<? extends T> collection, @InterfaceC7396q AbstractC6332g random) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) u38j(collection, random.nextInt(collection.size()));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @InterfaceC6234g
    private static final <T> T yp31(Iterable<? extends T> iterable, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                return t2;
            }
        }
        return null;
    }

    @InterfaceC7396q
    public static <T> Set<T> yvs(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return a98o.ki((Set) i8(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return a98o.ld6();
        }
        if (size != 1) {
            return (Set) i8(iterable, new LinkedHashSet(C6140e.m22479p(collection.size())));
        }
        return i1.m22499g(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @InterfaceC7396q
    public static final <T> List<T> yw(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> C6227f<List<T>, List<T>> z1r(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : iterable) {
            if (predicate.invoke(t2).booleanValue()) {
                arrayList.add(t2);
            } else {
                arrayList2.add(t2);
            }
        }
        return new C6227f<>(arrayList, arrayList2);
    }

    public static final <T> int z4j7(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (predicate.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @InterfaceC7396q
    public static final <T> List<T> z4t(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (T t2 : iterable) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            if (predicate.invoke(Integer.valueOf(i2), t2).booleanValue()) {
                arrayList.add(t2);
            }
            i2 = i3;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T, R, C extends Collection<? super R>> C z5(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super T, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T, K> Map<K, List<T>> z617(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t2 : iterable) {
            K kInvoke = keySelector.invoke(t2);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    public static final <T, R extends Comparable<? super R>> T z8(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = selector.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @InterfaceC7396q
    public static final <T> List<T> zah1(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Iterable<? extends T> elements) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        Collection collectionNmn5 = C6163t.nmn5(elements);
        if (collectionNmn5.isEmpty()) {
            return wr(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t2 : iterable) {
            if (!collectionNmn5.contains(t2)) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    public static final <T> T zaso(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        boolean z2 = false;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                if (z2) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z2 = true;
                t2 = t3;
            }
        }
        if (z2) {
            return t2;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static /* synthetic */ List ze(Iterable iterable, int i2, int i3, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if ((i4 & 4) != 0) {
            z2 = false;
        }
        return j1s(iterable, i2, i3, z2);
    }

    @InterfaceC6234g
    private static final <T> T zff0(Iterable<? extends T> iterable, cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        T t2 = null;
        for (T t3 : iterable) {
            if (predicate.invoke(t3).booleanValue()) {
                t2 = t3;
            }
        }
        return t2;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> List<S> zi4o(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q cyoe.cdj<? super Integer, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return ni7.a9();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(fu4.vyq(iterable, 10));
        arrayList.add(next);
        int i2 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i2), next, it.next());
            arrayList.add(next);
            i2++;
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <T> Set<T> zidq(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) i8(iterable, new LinkedHashSet());
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <T, R extends Comparable<? super R>> R zma(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @i9jn(markerClass = {kotlin.ki.class})
    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final <S, T extends S> S zt(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q InterfaceC5979h<? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
        }
        return next;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    public static final <T> T zuf(@InterfaceC7396q List<? extends T> list, @InterfaceC7396q cyoe.x2<? super T, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (predicate.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @InterfaceC7396q
    public static final <T, K, M extends Map<? super K, ? super T>> M zwy(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.x2<? super T, ? extends K> keySelector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(keySelector, "keySelector");
        for (T t2 : iterable) {
            destination.put(keySelector.invoke(t2), t2);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    public static <T> List<T> zxa9(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listKrto = krto(iterable);
            wvg.m22656a(listKrto, comparator);
            return listKrto;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return wr(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kja0.izu(array, comparator);
        return kja0.m22514i(array);
    }

    @InterfaceC7395n
    @kotlin.yz(version = "1.4")
    public static final Double zxq(@InterfaceC7396q Iterable<Double> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }
}
