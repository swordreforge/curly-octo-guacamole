package kotlin.comparisons;

import cyoe.InterfaceC5979h;
import java.util.Comparator;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8 {

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$f7l8, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C8055f7l8<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<T> f36219k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2<T, Comparable<?>> f36220q;

        /* JADX WARN: Multi-variable type inference failed */
        public C8055f7l8(Comparator<T> comparator, cyoe.x2<? super T, ? extends Comparable<?>> x2Var) {
            this.f36219k = comparator;
            this.f36220q = x2Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int iCompare = this.f36219k.compare(t2, t3);
            if (iCompare != 0) {
                return iCompare;
            }
            cyoe.x2<T, Comparable<?>> x2Var = this.f36220q;
            return f7l8.x2(x2Var.invoke(t3), x2Var.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$g */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C6178g<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<T> f36221k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.x2<T, K> f36222n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Comparator<? super K> f36223q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6178g(Comparator<T> comparator, Comparator<? super K> comparator2, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36221k = comparator;
            this.f36223q = comparator2;
            this.f36222n = x2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int iCompare = this.f36221k.compare(t2, t3);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f36223q;
            cyoe.x2<T, K> x2Var = this.f36222n;
            return comparator.compare((Object) x2Var.invoke(t2), (Object) x2Var.invoke(t3));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$k */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C6179k<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2<T, Comparable<?>> f36224k;

        /* JADX WARN: Multi-variable type inference failed */
        public C6179k(cyoe.x2<? super T, ? extends Comparable<?>> x2Var) {
            this.f36224k = x2Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            cyoe.x2<T, Comparable<?>> x2Var = this.f36224k;
            return f7l8.x2(x2Var.invoke(t2), x2Var.invoke(t3));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$n */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C6180n<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<T> f36225k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2<T, Comparable<?>> f36226q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6180n(Comparator<T> comparator, cyoe.x2<? super T, ? extends Comparable<?>> x2Var) {
            this.f36225k = comparator;
            this.f36226q = x2Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int iCompare = this.f36225k.compare(t2, t3);
            if (iCompare != 0) {
                return iCompare;
            }
            cyoe.x2<T, Comparable<?>> x2Var = this.f36226q;
            return f7l8.x2(x2Var.invoke(t2), x2Var.invoke(t3));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$q */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C6181q<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<? super K> f36227k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2<T, K> f36228q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6181q(Comparator<? super K> comparator, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36227k = comparator;
            this.f36228q = x2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            Comparator<? super K> comparator = this.f36227k;
            cyoe.x2<T, K> x2Var = this.f36228q;
            return comparator.compare((Object) x2Var.invoke(t3), (Object) x2Var.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$s */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C6182s<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<T> f36229k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC5979h<T, T, Integer> f36230q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6182s(Comparator<T> comparator, InterfaceC5979h<? super T, ? super T, Integer> interfaceC5979h) {
            this.f36229k = comparator;
            this.f36230q = interfaceC5979h;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int iCompare = this.f36229k.compare(t2, t3);
            return iCompare != 0 ? iCompare : this.f36230q.invoke(t2, t3).intValue();
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class toq<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<? super K> f36231k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ cyoe.x2<T, K> f36232q;

        /* JADX WARN: Multi-variable type inference failed */
        public toq(Comparator<? super K> comparator, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36231k = comparator;
            this.f36232q = x2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            Comparator<? super K> comparator = this.f36231k;
            cyoe.x2<T, K> x2Var = this.f36232q;
            return comparator.compare((Object) x2Var.invoke(t2), (Object) x2Var.invoke(t3));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.f7l8$y */
    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C6183y<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator<T> f36233k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ cyoe.x2<T, K> f36234n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Comparator<? super K> f36235q;

        /* JADX WARN: Multi-variable type inference failed */
        public C6183y(Comparator<T> comparator, Comparator<? super K> comparator2, cyoe.x2<? super T, ? extends K> x2Var) {
            this.f36233k = comparator;
            this.f36235q = comparator2;
            this.f36234n = x2Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            int iCompare = this.f36233k.compare(t2, t3);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f36235q;
            cyoe.x2<T, K> x2Var = this.f36234n;
            return comparator.compare((Object) x2Var.invoke(t3), (Object) x2Var.invoke(t2));
        }
    }

    /* JADX INFO: compiled from: Comparisons.kt */
    @lv5({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class zy<T> implements Comparator {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ cyoe.x2<T, Comparable<?>> f36236k;

        /* JADX WARN: Multi-variable type inference failed */
        public zy(cyoe.x2<? super T, ? extends Comparable<?>> x2Var) {
            this.f36236k = x2Var;
        }

        @Override // java.util.Comparator
        public final int compare(T t2, T t3) {
            cyoe.x2<T, Comparable<?>> x2Var = this.f36236k;
            return f7l8.x2(x2Var.invoke(t3), x2Var.invoke(t2));
        }
    }

    @InterfaceC6234g
    private static final <T, K> Comparator<T> a9(Comparator<T> comparator, Comparator<? super K> comparator2, cyoe.x2<? super T, ? extends K> selector) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(comparator2, "comparator");
        d2ok.m23075h(selector, "selector");
        return new C6183y(comparator, comparator2, selector);
    }

    @InterfaceC7396q
    public static <T extends Comparable<? super T>> Comparator<T> cdj() {
        C6187p c6187p = C6187p.f36240k;
        d2ok.n7h(c6187p, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return c6187p;
    }

    @InterfaceC6234g
    private static final <T, K> Comparator<T> f7l8(Comparator<? super K> comparator, cyoe.x2<? super T, ? extends K> selector) {
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        return new toq(comparator, selector);
    }

    @InterfaceC6234g
    private static final <T extends Comparable<? super T>> Comparator<T> fn3e() {
        return zurt(cdj());
    }

    @InterfaceC6234g
    private static final <T> Comparator<T> fti(Comparator<T> comparator, InterfaceC5979h<? super T, ? super T, Integer> comparison) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(comparison, "comparison");
        return new C6182s(comparator, comparison);
    }

    @InterfaceC7396q
    public static <T extends Comparable<? super T>> Comparator<T> fu4() {
        ld6 ld6Var = ld6.f36238k;
        d2ok.n7h(ld6Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return ld6Var;
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final <T> Comparator<T> m22685g(cyoe.x2<? super T, ? extends Comparable<?>> selector) {
        d2ok.m23075h(selector, "selector");
        return new C6179k(selector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int gvn7(Comparator this_thenDescending, Comparator comparator, Object obj, Object obj2) {
        d2ok.m23075h(this_thenDescending, "$this_thenDescending");
        d2ok.m23075h(comparator, "$comparator");
        int iCompare = this_thenDescending.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj2, obj);
    }

    /* JADX INFO: renamed from: h */
    private static final <T> int m22686h(T t2, T t3, cyoe.x2<? super T, ? extends Comparable<?>>[] x2VarArr) {
        for (cyoe.x2<? super T, ? extends Comparable<?>> x2Var : x2VarArr) {
            int iX2 = x2(x2Var.invoke(t2), x2Var.invoke(t3));
            if (iX2 != 0) {
                return iX2;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final int m22687i(Comparator comparator, Object obj, Object obj2) {
        d2ok.m23075h(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @InterfaceC6234g
    private static final <T> Comparator<T> jk(Comparator<T> comparator, cyoe.x2<? super T, ? extends Comparable<?>> selector) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(selector, "selector");
        return new C8055f7l8(comparator, selector);
    }

    @InterfaceC7396q
    public static final <T> Comparator<T> jp0y(@InterfaceC7396q final Comparator<T> comparator, @InterfaceC7396q final Comparator<? super T> comparator2) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.q
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f7l8.gvn7(comparator, comparator2, obj, obj2);
            }
        };
    }

    @InterfaceC6234g
    private static final <T extends Comparable<? super T>> Comparator<T> ki() {
        return t8r(cdj());
    }

    public static final <T> int kja0(T t2, T t3, @InterfaceC7396q cyoe.x2<? super T, ? extends Comparable<?>>... selectors) {
        d2ok.m23075h(selectors, "selectors");
        if (selectors.length > 0) {
            return m22686h(t2, t3, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @InterfaceC6234g
    private static final <T, K> Comparator<T> ld6(Comparator<? super K> comparator, cyoe.x2<? super T, ? extends K> selector) {
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        return new C6181q(comparator, selector);
    }

    @InterfaceC6234g
    private static final <T, K> Comparator<T> mcp(Comparator<T> comparator, Comparator<? super K> comparator2, cyoe.x2<? super T, ? extends K> selector) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(comparator2, "comparator");
        d2ok.m23075h(selector, "selector");
        return new C6178g(comparator, comparator2, selector);
    }

    @InterfaceC6234g
    private static final <T, K> int n7h(T t2, T t3, Comparator<? super K> comparator, cyoe.x2<? super T, ? extends K> selector) {
        d2ok.m23075h(comparator, "comparator");
        d2ok.m23075h(selector, "selector");
        return comparator.compare(selector.invoke(t2), selector.invoke(t3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ni7(Comparator comparator, Object obj, Object obj2) {
        d2ok.m23075h(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @InterfaceC7396q
    public static final <T> Comparator<T> o1t(@InterfaceC7396q final Comparator<T> comparator, @InterfaceC7396q final Comparator<? super T> comparator2) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.toq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f7l8.wvg(comparator, comparator2, obj, obj2);
            }
        };
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: p */
    private static final <T> Comparator<T> m22690p(cyoe.x2<? super T, ? extends Comparable<?>> selector) {
        d2ok.m23075h(selector, "selector");
        return new zy(selector);
    }

    @InterfaceC6234g
    private static final <T> int qrj(T t2, T t3, cyoe.x2<? super T, ? extends Comparable<?>> selector) {
        d2ok.m23075h(selector, "selector");
        return x2(selector.invoke(t2), selector.invoke(t3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final int m22692s(cyoe.x2[] selectors, Object obj, Object obj2) {
        d2ok.m23075h(selectors, "$selectors");
        return m22686h(obj, obj2, selectors);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: t */
    private static final <T> Comparator<T> m22693t(Comparator<T> comparator, cyoe.x2<? super T, ? extends Comparable<?>> selector) {
        d2ok.m23075h(comparator, "<this>");
        d2ok.m23075h(selector, "selector");
        return new C6180n(comparator, selector);
    }

    @InterfaceC7396q
    public static final <T> Comparator<T> t8r(@InterfaceC7396q final Comparator<? super T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.n
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f7l8.m22687i(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wvg(Comparator this_then, Comparator comparator, Object obj, Object obj2) {
        d2ok.m23075h(this_then, "$this_then");
        d2ok.m23075h(comparator, "$comparator");
        int iCompare = this_then.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator.compare(obj, obj2);
    }

    public static <T extends Comparable<?>> int x2(@InterfaceC7395n T t2, @InterfaceC7395n T t3) {
        if (t2 == t3) {
            return 0;
        }
        if (t2 == null) {
            return -1;
        }
        if (t3 == null) {
            return 1;
        }
        return t2.compareTo(t3);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> Comparator<T> m22694y(@InterfaceC7396q final cyoe.x2<? super T, ? extends Comparable<?>>... selectors) {
        d2ok.m23075h(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.zy
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return f7l8.m22692s(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: z */
    public static final <T> Comparator<T> m22695z(@InterfaceC7396q Comparator<T> comparator) {
        d2ok.m23075h(comparator, "<this>");
        if (comparator instanceof x2) {
            return ((x2) comparator).m22710k();
        }
        Comparator<T> x2Var = C6187p.f36240k;
        if (d2ok.f7l8(comparator, x2Var)) {
            ld6 ld6Var = ld6.f36238k;
            d2ok.n7h(ld6Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return ld6Var;
        }
        if (d2ok.f7l8(comparator, ld6.f36238k)) {
            d2ok.n7h(x2Var, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            x2Var = new x2<>(comparator);
        }
        return x2Var;
    }

    @InterfaceC7396q
    public static final <T> Comparator<T> zurt(@InterfaceC7396q final Comparator<? super T> comparator) {
        d2ok.m23075h(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return f7l8.ni7(comparator, obj, obj2);
            }
        };
    }
}
