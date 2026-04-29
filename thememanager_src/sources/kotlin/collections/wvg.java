package kotlin.collections;

import cyoe.InterfaceC5979h;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: MutableCollectionsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public class wvg extends o1t {
    /* JADX INFO: renamed from: a */
    public static <T> void m22656a(@InterfaceC7396q List<T> list, @InterfaceC7396q Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @kotlin.hb(expression = "this.sortWith(comparator)", imports = {}))
    private static final <T> void a98o(List<T> list, Comparator<? super T> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        throw new kotlin.eqxt(null, 1, null);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.2")
    /* JADX INFO: renamed from: b */
    private static final <T> void m22657b(List<T> list, Random random) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        Collections.shuffle(list, random);
    }

    public static <T extends Comparable<? super T>> void bf2(@InterfaceC7396q List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    @InterfaceC6234g
    @kotlin.ld6(level = kotlin.qrj.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @kotlin.hb(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    private static final <T> void i1(List<T> list, InterfaceC5979h<? super T, ? super T, Integer> comparison) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparison, "comparison");
        throw new kotlin.eqxt(null, 1, null);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.2")
    private static final <T> void y9n(List<T> list) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        Collections.shuffle(list);
    }

    @InterfaceC6234g
    @kotlin.yz(version = "1.2")
    private static final <T> void yz(List<T> list, T t2) {
        kotlin.jvm.internal.d2ok.m23075h(list, "<this>");
        Collections.fill(list, t2);
    }
}
