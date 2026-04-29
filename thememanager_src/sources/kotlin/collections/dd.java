package kotlin.collections;

import cyoe.InterfaceC5979h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nGrouping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n1#1,291:1\n80#1,6:292\n53#1:298\n80#1,6:299\n80#1,6:305\n53#1:311\n80#1,6:312\n80#1,6:318\n53#1:324\n80#1,6:325\n80#1,6:331\n189#1:337\n80#1,6:338\n*S KotlinDebug\n*F\n+ 1 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n*L\n53#1:292,6\n112#1:298\n112#1:299,6\n143#1:305,6\n164#1:311\n164#1:312,6\n189#1:318,6\n211#1:324\n211#1:325,6\n239#1:331,6\n257#1:337\n257#1:338,6\n*E\n"})
class dd extends C6161r {
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <T, K, R> Map<K, R> f7l8(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            ?? next = qVar.next();
            K kMo22425k = d2okVar.mo22425k(next);
            a98o.zy zyVar = (Object) linkedHashMap.get(kMo22425k);
            if (zyVar == null && !linkedHashMap.containsKey(kMo22425k)) {
                zyVar = (Object) r2;
            }
            linkedHashMap.put(kMo22425k, operation.invoke(zyVar, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: g */
    public static final <T, K, R> Map<K, R> m22470g(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q InterfaceC5979h<? super K, ? super T, ? extends R> initialValueSelector, @InterfaceC7396q cyoe.cdj<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            ?? next = qVar.next();
            Object objMo22425k = d2okVar.mo22425k(next);
            R rInvoke = (Object) linkedHashMap.get(objMo22425k);
            if (rInvoke == null && !linkedHashMap.containsKey(objMo22425k)) {
                rInvoke = initialValueSelector.invoke(objMo22425k, next);
            }
            linkedHashMap.put(objMo22425k, operation.invoke(objMo22425k, rInvoke, next));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <S, T extends S, K, M extends Map<? super K, S>> M ld6(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.cdj<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            S sInvoke = (Object) qVar.next();
            Object objMo22425k = d2okVar.mo22425k(sInvoke);
            a98o.toq toqVar = (Object) destination.get(objMo22425k);
            if (!(toqVar == null && !destination.containsKey(objMo22425k))) {
                sInvoke = operation.invoke(objMo22425k, toqVar, sInvoke);
            }
            destination.put(objMo22425k, sInvoke);
        }
        return destination;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: n */
    public static final <T, K, M extends Map<? super K, Integer>> M m22471n(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q M destination) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            K kMo22425k = d2okVar.mo22425k(qVar.next());
            Object obj = destination.get(kMo22425k);
            if (obj == null && !destination.containsKey(kMo22425k)) {
                obj = 0;
            }
            destination.put(kMo22425k, Integer.valueOf(((Number) obj).intValue() + 1));
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: p */
    public static final <S, T extends S, K> Map<K, S> m22472p(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q cyoe.cdj<? super K, ? super S, ? super T, ? extends S> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            S sInvoke = (Object) qVar.next();
            Object objMo22425k = d2okVar.mo22425k(sInvoke);
            a98o.toq toqVar = (Object) linkedHashMap.get(objMo22425k);
            if (!(toqVar == null && !linkedHashMap.containsKey(objMo22425k))) {
                sInvoke = operation.invoke(objMo22425k, toqVar, sInvoke);
            }
            linkedHashMap.put(objMo22425k, sInvoke);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: q */
    public static final <T, K, R, M extends Map<? super K, R>> M m22473q(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q M destination, @InterfaceC7396q cyoe.ki<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            ?? next = qVar.next();
            Object objMo22425k = d2okVar.mo22425k(next);
            a98o.toq toqVar = (Object) destination.get(objMo22425k);
            destination.put(objMo22425k, operation.invoke(objMo22425k, toqVar, next, Boolean.valueOf(toqVar == null && !destination.containsKey(objMo22425k))));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: s */
    public static final <T, K, R, M extends Map<? super K, R>> M m22474s(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q M destination, R r2, @InterfaceC7396q InterfaceC5979h<? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            ?? next = qVar.next();
            K kMo22425k = d2okVar.mo22425k(next);
            a98o.zy zyVar = (Object) destination.get(kMo22425k);
            if (zyVar == null && !destination.containsKey(kMo22425k)) {
                zyVar = (Object) r2;
            }
            destination.put(kMo22425k, operation.invoke(zyVar, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    /* JADX INFO: renamed from: y */
    public static final <T, K, R, M extends Map<? super K, R>> M m22475y(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q M destination, @InterfaceC7396q InterfaceC5979h<? super K, ? super T, ? extends R> initialValueSelector, @InterfaceC7396q cyoe.cdj<? super K, ? super R, ? super T, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(destination, "destination");
        kotlin.jvm.internal.d2ok.m23075h(initialValueSelector, "initialValueSelector");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            ?? next = qVar.next();
            Object objMo22425k = d2okVar.mo22425k(next);
            R rInvoke = (Object) destination.get(objMo22425k);
            if (rInvoke == null && !destination.containsKey(objMo22425k)) {
                rInvoke = initialValueSelector.invoke(objMo22425k, next);
            }
            destination.put(objMo22425k, operation.invoke(objMo22425k, rInvoke, next));
        }
        return destination;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    @InterfaceC7396q
    @kotlin.yz(version = "1.1")
    public static final <T, K, R> Map<K, R> zy(@InterfaceC7396q d2ok<T, ? extends K> d2okVar, @InterfaceC7396q cyoe.ki<? super K, ? super R, ? super T, ? super Boolean, ? extends R> operation) {
        kotlin.jvm.internal.d2ok.m23075h(d2okVar, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(operation, "operation");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> qVar = d2okVar.toq();
        while (qVar.hasNext()) {
            ?? next = qVar.next();
            Object objMo22425k = d2okVar.mo22425k(next);
            a98o.toq toqVar = (Object) linkedHashMap.get(objMo22425k);
            linkedHashMap.put(objMo22425k, operation.invoke(objMo22425k, toqVar, next, Boolean.valueOf(toqVar == null && !linkedHashMap.containsKey(objMo22425k))));
        }
        return linkedHashMap;
    }
}
