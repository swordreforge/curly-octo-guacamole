package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.internal.InterfaceC6234g;
import kotlin.was;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public class zurt {
    @InterfaceC6234g
    private static final <T> T[] f7l8(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "collection");
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        return (T[]) kotlin.jvm.internal.zurt.toq(collection, array);
    }

    @InterfaceC6234g
    /* JADX INFO: renamed from: g */
    private static final Object[] m22673g(Collection<?> collection) {
        kotlin.jvm.internal.d2ok.m23075h(collection, "collection");
        return kotlin.jvm.internal.zurt.m23171k(collection);
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: k */
    public static <E> List<E> m22674k(@InterfaceC7396q List<E> builder) {
        kotlin.jvm.internal.d2ok.m23075h(builder, "builder");
        return ((kotlin.collections.builders.toq) builder).build();
    }

    @InterfaceC7396q
    public static <T> List<T> ld6(T t2) {
        List<T> listSingletonList = Collections.singletonList(t2);
        kotlin.jvm.internal.d2ok.kja0(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: n */
    private static final int m22675n(int i2) {
        if (i2 < 0) {
            if (!kotlin.internal.qrj.m22878k(1, 3, 0)) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            ni7.lrht();
        }
        return i2;
    }

    @InterfaceC6234g
    private static final <T> List<T> n7h(Enumeration<T> enumeration) {
        kotlin.jvm.internal.d2ok.m23075h(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.d2ok.kja0(list, "list(this)");
        return list;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: p */
    public static <E> List<E> m22676p(int i2) {
        return new kotlin.collections.builders.toq(i2);
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: q */
    private static final int m22677q(int i2) {
        if (i2 < 0) {
            if (!kotlin.internal.qrj.m22878k(1, 3, 0)) {
                throw new ArithmeticException("Count overflow has happened.");
            }
            ni7.m22563c();
        }
        return i2;
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T> List<T> qrj(@InterfaceC7396q Iterable<? extends T> iterable, @InterfaceC7396q Random random) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        kotlin.jvm.internal.d2ok.m23075h(random, "random");
        List<T> listKrto = a9.krto(iterable);
        Collections.shuffle(listKrto, random);
        return listKrto;
    }

    @kotlin.nn86
    @InterfaceC7396q
    @kotlin.yz(version = "1.3")
    /* JADX INFO: renamed from: s */
    public static <E> List<E> m22678s() {
        return new kotlin.collections.builders.toq();
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <E> List<E> toq(int i2, cyoe.x2<? super List<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        List listM22676p = m22676p(i2);
        builderAction.invoke(listM22676p);
        return m22674k(listM22676p);
    }

    @InterfaceC7396q
    @kotlin.yz(version = "1.2")
    public static final <T> List<T> x2(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        List<T> listKrto = a9.krto(iterable);
        Collections.shuffle(listKrto);
        return listKrto;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    public static final <T> Object[] m22679y(@InterfaceC7396q T[] tArr, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(tArr, "<this>");
        if (z2 && kotlin.jvm.internal.d2ok.f7l8(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.d2ok.kja0(objArrCopyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return objArrCopyOf;
    }

    @kotlin.nn86
    @InterfaceC6234g
    @kotlin.yz(version = "1.3")
    private static final <E> List<E> zy(cyoe.x2<? super List<E>, was> builderAction) {
        kotlin.jvm.internal.d2ok.m23075h(builderAction, "builderAction");
        List listM22678s = m22678s();
        builderAction.invoke(listM22678s);
        return m22674k(listM22678s);
    }
}
