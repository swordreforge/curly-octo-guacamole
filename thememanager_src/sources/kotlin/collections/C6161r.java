package kotlin.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.bo;
import kotlin.jvm.internal.i1;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.collections.r */
/* JADX INFO: compiled from: GroupingJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
class C6161r {
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: k */
    public static final <T, K> Map<K, Integer> m22605k(@InterfaceC7396q d2ok<T, ? extends K> d2okVar) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            K kMo22425k = d2okVar.mo22425k(qVar.next());
            Object c6294g = linkedHashMap.get(kMo22425k);
            if (c6294g == null && !linkedHashMap.containsKey(kMo22425k)) {
                c6294g = new i1.C6294g();
            }
            i1.C6294g c6294g2 = (i1.C6294g) c6294g;
            c6294g2.element++;
            linkedHashMap.put(kMo22425k, c6294g2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.d2ok.n7h(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            bo.qrj(entry).setValue(Integer.valueOf(((i1.C6294g) entry.getValue()).element));
        }
        return bo.ld6(linkedHashMap);
    }

    @kotlin.nn86
    @InterfaceC6234g
    private static final <K, V, R> Map<K, R> toq(Map<K, V> map, cyoe.x2<? super Map.Entry<? extends K, ? extends V>, ? extends R> f2) {
        kotlin.jvm.internal.d2ok.m23075h(map, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(f2, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.d2ok.n7h(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            bo.qrj(entry).setValue(f2.invoke(entry));
        }
        return bo.ld6(map);
    }
}
