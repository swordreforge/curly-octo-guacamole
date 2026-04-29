package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.hb;
import kotlin.hyr;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.sequences.i */
/* JADX INFO: compiled from: _SequencesJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1433#2,14:173\n1839#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
class C6402i extends t8r {

    /* JADX INFO: renamed from: kotlin.sequences.i$k */
    /* JADX INFO: compiled from: _SequencesJvm.kt */
    static final class k extends AbstractC6308r implements cyoe.x2<Object, Boolean> {
        final /* synthetic */ Class<R> $klass;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Class<R> cls) {
            super(1);
            this.$klass = cls;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7395n Object obj) {
            return Boolean.valueOf(this.$klass.isInstance(obj));
        }
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T a9(qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
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

    @InterfaceC7396q
    public static final <T extends Comparable<? super T>> SortedSet<T> d3(@InterfaceC7396q qrj<? extends T> qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return (SortedSet) fn3e.f3f(qrjVar, new TreeSet());
    }

    @InterfaceC7396q
    public static final <R> qrj<R> fn3e(@InterfaceC7396q qrj<?> qrjVar, @InterfaceC7396q Class<R> klass) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(klass, "klass");
        qrj<R> qrjVarCh = fn3e.ch(qrjVar, new k(klass));
        d2ok.n7h(qrjVarCh, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return qrjVarCh;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object fti(qrj qrjVar, Comparator comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        return fn3e.kx3(qrjVar, comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    @yz(version = "1.1")
    public static final /* synthetic */ Double fu4(qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return fn3e.pjz9(qrjVar);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigInteger")
    private static final <T> BigInteger gvn7(qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends BigInteger> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        d2ok.kja0(bigIntegerValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(it.next()));
            d2ok.kja0(bigIntegerValueOf, "this.add(other)");
        }
        return bigIntegerValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    @yz(version = "1.1")
    public static final /* synthetic */ Float jk(qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return fn3e.nme(qrjVar);
    }

    @hyr
    @InterfaceC6234g
    @yz(version = "1.4")
    @InterfaceC6769y(name = "sumOfBigDecimal")
    private static final <T> BigDecimal jp0y(qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends BigDecimal> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        d2ok.kja0(bigDecimalValueOf, "valueOf(this.toLong())");
        Iterator<? extends T> it = qrjVar.iterator();
        while (it.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(it.next()));
            d2ok.kja0(bigDecimalValueOf, "this.add(other)");
        }
        return bigDecimalValueOf;
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    @yz(version = "1.1")
    public static final /* synthetic */ Double mcp(qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return fn3e.b8(qrjVar);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Comparable ni7(qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return fn3e.n2t(qrjVar);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @hb(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T o1t(qrj<? extends T> qrjVar, cyoe.x2<? super T, ? extends R> selector) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(selector, "selector");
        Iterator<? extends T> it = qrjVar.iterator();
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

    @InterfaceC7396q
    public static final <T> SortedSet<T> oc(@InterfaceC7396q qrj<? extends T> qrjVar, @InterfaceC7396q Comparator<? super T> comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        return (SortedSet) fn3e.f3f(qrjVar, new TreeSet(comparator));
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minOrNull instead.", replaceWith = @hb(expression = "this.minOrNull()", imports = {}))
    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ Comparable m23448t(qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return fn3e.b9ub(qrjVar);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Object wvg(qrj qrjVar, Comparator comparator) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(comparator, "comparator");
        return fn3e.wlev(qrjVar, comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use maxOrNull instead.", replaceWith = @hb(expression = "this.maxOrNull()", imports = {}))
    @yz(version = "1.1")
    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ Float m23449z(qrj qrjVar) {
        d2ok.m23075h(qrjVar, "<this>");
        return fn3e.ngy(qrjVar);
    }

    @InterfaceC7396q
    public static final <C extends Collection<? super R>, R> C zurt(@InterfaceC7396q qrj<?> qrjVar, @InterfaceC7396q C destination, @InterfaceC7396q Class<R> klass) {
        d2ok.m23075h(qrjVar, "<this>");
        d2ok.m23075h(destination, "destination");
        d2ok.m23075h(klass, "klass");
        for (Object obj : qrjVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }
}
