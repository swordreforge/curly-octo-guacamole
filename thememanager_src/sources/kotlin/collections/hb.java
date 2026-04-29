package kotlin.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import kotlin.internal.InterfaceC6234g;

/* JADX INFO: compiled from: _MapsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
class hb extends nn86 {
    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use maxByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxByOrNull(selector)", imports = {}))
    private static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> g1(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
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

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minByOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <K, V, R extends Comparable<? super R>> Map.Entry<K, V> gbni(Map<? extends K, ? extends V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> selector) {
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

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @InterfaceC6234g
    @kotlin.ld6(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.maxWithOrNull(comparator)", imports = {}))
    private static final /* synthetic */ <K, V> Map.Entry<K, V> was(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (Map.Entry) a9.ff(map.entrySet(), comparator);
    }

    @kotlin.x2(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @kotlin.ld6(message = "Use minWithOrNull instead.", replaceWith = @kotlin.hb(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Map.Entry zsr0(Map map, Comparator comparator) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(comparator, "comparator");
        return (Map.Entry) a9.dbf(map.entrySet(), comparator);
    }
}
