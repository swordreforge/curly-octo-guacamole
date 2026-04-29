package kotlin.collections;

import cyoe.InterfaceC5979h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C6227f;
import kotlin.internal.InterfaceC6234g;
import kotlin.internal.InterfaceC6239n;
import kotlin.was;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.j */
/* JADX INFO: compiled from: _Maps.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
class C6146j extends hb {
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> float b3e(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    public static final <K, V> boolean bap7(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R extends Comparable<? super R>> R bek6(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6239n
    public static final <K, V> void bwp(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    @InterfaceC7396q
    public static final <K, V, R, C extends Collection<? super R>> C bz2(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    private static final <K, V, R> R cfr(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R extends Comparable<? super R>> R cv06(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final <K, V> double m28275do(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R extends Comparable<? super R>> R ebn(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    public static final <K, V> int etdu(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        int i2 = 0;
        if (map.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                i2++;
            }
        }
        return i2;
    }

    @InterfaceC7396q
    public static final <K, V> List<C6227f<K, V>> ga(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        if (map.size() == 0) {
            return ni7.a9();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ni7.a9();
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return zurt.ld6(new C6227f(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C6227f(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new C6227f(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V, R> List<R> gc3c(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
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
    public static final <K, V, M extends Map<? extends K, ? extends V>> M h4b(@InterfaceC7396q M m2, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(m2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        Iterator<Map.Entry<K, V>> it = m2.entrySet().iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return m2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> Double h7am(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final <K, V> boolean i9jn(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return !map.isEmpty();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> Double ij(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minByOrThrow")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> ixz(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R> R jbh(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxByOrThrow")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> jz5(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry<K, V> entry = (Object) it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(entry);
            do {
                Map.Entry<K, V> entry2 = (Object) it.next();
                R rInvoke2 = selector.invoke(entry2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    entry = entry2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return entry;
    }

    @InterfaceC7396q
    public static final <K, V, R, C extends Collection<? super R>> C kcsr(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C6163t.zp(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> double ktq(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Double> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = selector.invoke((Object) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, selector.invoke((Object) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <K, V> boolean lh(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.isEmpty();
    }

    public static final <K, V> boolean ltg8(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (predicate.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC7396q
    public static final <K, V> kotlin.sequences.qrj<Map.Entry<K, V>> m4(@InterfaceC7396q Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return a9.ebn(map.entrySet());
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R> R mbx(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R> R n2t(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = (Object) rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "minWithOrThrow")
    private static final <K, V> Map.Entry<K, V> ngy(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (Map.Entry) a9.es7(map.entrySet(), comparator);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> Float nsb(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R extends Comparable<? super R>> R pc(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <K, V> Map.Entry<K, V> pjz9(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (Map.Entry) a9.dbf(map.entrySet(), comparator);
    }

    public static final <K, V> boolean py(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(predicate, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!predicate.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6234g
    private static final <K, V> Iterable<Map.Entry<K, V>> r8s8(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.entrySet();
    }

    @InterfaceC7396q
    public static final <K, V, R> List<R> se(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.5")
    private static final <K, V, R> R sok(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        R rInvoke;
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
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
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.7")
    @InterfaceC6769y(name = "maxWithOrThrow")
    private static final <K, V> Map.Entry<K, V> uc(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (Map.Entry) a9.iz(map.entrySet(), comparator);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> uj2j(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) < 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> float ukdy(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6234g
    private static final <K, V> int v0af(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        return map.size();
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V> Float vep5(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, Float> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = selector.invoke((Object) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, selector.invoke((Object) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7396q
    public static final <K, V, R> List<R> w831(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C6163t.zp(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    public static final <K, V, M extends Map<? extends K, ? extends V>> M wlev(@InterfaceC7396q M m2, @InterfaceC7396q InterfaceC5979h<? super Integer, ? super Map.Entry<? extends K, ? extends V>, was> action) {
        kotlin.jvm.internal.d2ok.m23075h(m2, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(action, "action");
        Iterator<T> it = m2.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            a98o.zy zyVar = (Object) it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                ni7.lrht();
            }
            action.invoke(Integer.valueOf(i2), zyVar);
            i2 = i3;
        }
        return m2;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> wx16(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        Map.Entry<K, V> entry;
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry<K, V> entry2 = (Object) it.next();
            if (it.hasNext()) {
                R rInvoke = selector.invoke(entry2);
                do {
                    Map.Entry<K, V> entry3 = (Object) it.next();
                    R rInvoke2 = selector.invoke(entry3);
                    if (rInvoke.compareTo(rInvoke2) > 0) {
                        entry2 = entry3;
                        rInvoke = rInvoke2;
                    }
                } while (it.hasNext());
            }
            entry = entry2;
        } else {
            entry = null;
        }
        return entry;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    private static final <K, V> Map.Entry<K, V> yl(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (Map.Entry) a9.ff(map.entrySet(), comparator);
    }

    @kotlin.hyr
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapSequenceTo")
    public static final <K, V, R, C extends Collection<? super R>> C yqrt(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C6163t.m22610x(destination, transform.invoke(it.next()));
        }
        return destination;
    }

    @kotlin.hyr
    @InterfaceC7396q
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "flatMapSequence")
    public static final <K, V, R> List<R> z4(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends kotlin.sequences.qrj<? extends R>> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C6163t.m22610x(arrayList, transform.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC7396q
    public static final <K, V, R, C extends Collection<? super R>> C zkd(@InterfaceC7396q Map<? extends K, ? extends V> map, @InterfaceC7396q C destination, @InterfaceC7396q cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(transform, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            R rInvoke = transform.invoke(it.next());
            if (rInvoke != null) {
                destination.add(rInvoke);
            }
        }
        return destination;
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @kotlin.hyr
    private static final <K, V, R> R zwy(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<T> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = selector.invoke((Object) it.next());
        while (it.hasNext()) {
            R rInvoke2 = selector.invoke((Object) it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }
}
