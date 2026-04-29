package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.internal.InterfaceC6234g;
import l05.InterfaceC6769y;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _CollectionsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
public class jk extends mcp {
    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Double b3e(Iterable iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return a9.vahq(iterable);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Float bek6(Iterable iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return a9.vc(iterable);
    }

    @InterfaceC7396q
    public static final <R> List<R> bwp(@InterfaceC7396q Iterable<?> iterable, @InterfaceC7396q Class<R> klass) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(klass, "klass");
        return (List) se(iterable, new ArrayList(), klass);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Float bz2(Iterable iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return a9.e4e(iterable);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T cv06(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = selector.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable gc3c(Iterable iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return a9.erbd(iterable);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object h7am(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return a9.dbf(iterable, comparator);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final <T> BigInteger jbh(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object jz5(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return a9.ff(iterable, comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Comparable ktq(Iterable iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return a9.eklw(iterable);
    }

    @kotlin.hyr
    @InterfaceC6234g
    @kotlin.yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final <T> BigDecimal mbx(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super R>, R> C se(@InterfaceC7396q Iterable<?> iterable, @InterfaceC7396q C destination, @InterfaceC7396q Class<R> klass) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @InterfaceC7396q
    public static final <T> SortedSet<T> uc(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (SortedSet) a9.i8(iterable, new TreeSet(comparator));
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T uj2j(Iterable<? extends T> iterable, cyoe.x2<? super T, ? extends R> selector) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            R rInvoke = selector.invoke(next);
            do {
                T next2 = it.next();
                R rInvoke2 = selector.invoke(next2);
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    next = next2;
                    rInvoke = rInvoke2;
                }
            } while (it.hasNext());
        }
        return (T) next;
    }

    public static <T> void vep5(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        Collections.reverse(list);
    }

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> SortedSet<T> yl(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return (SortedSet) a9.i8(iterable, new TreeSet());
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxOrNull()", imports = {}))
    @kotlin.yz(version = "1.1")
    public static final /* synthetic */ Double zkd(Iterable iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return a9.zxq(iterable);
    }
}
