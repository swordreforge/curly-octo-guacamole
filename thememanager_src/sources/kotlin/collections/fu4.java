package kotlin.collections;

import cyoe.InterfaceC5981k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C6227f;
import kotlin.internal.InterfaceC6234g;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes3.dex */
public class fu4 extends ni7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.fu4$k */
    /* JADX INFO: compiled from: Iterables.kt */
    @kotlin.jvm.internal.lv5({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    public static final class C6142k<T> implements Iterable<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC5981k<Iterator<T>> f36141k;

        /* JADX WARN: Multi-variable type inference failed */
        public C6142k(InterfaceC5981k<? extends Iterator<? extends T>> interfaceC5981k) {
            this.f36141k = interfaceC5981k;
        }

        @Override // java.lang.Iterable
        @InterfaceC7396q
        public Iterator<T> iterator() {
            return this.f36141k.invoke();
        }
    }

    @kotlin.nn86
    @InterfaceC7395n
    /* JADX INFO: renamed from: e */
    public static final <T> Integer m22497e(@InterfaceC7396q Iterable<? extends T> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @InterfaceC7396q
    public static final <T, R> C6227f<List<T>, List<R>> hb(@InterfaceC7396q Iterable<? extends C6227f<? extends T, ? extends R>> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        int iVyq = vyq(iterable, 10);
        ArrayList arrayList = new ArrayList(iVyq);
        ArrayList arrayList2 = new ArrayList(iVyq);
        for (C6227f<? extends T, ? extends R> c6227f : iterable) {
            arrayList.add(c6227f.getFirst());
            arrayList2.add(c6227f.getSecond());
        }
        return kotlin.nmn5.m23230k(arrayList, arrayList2);
    }

    @InterfaceC7396q
    public static final <T> List<T> nn86(@InterfaceC7396q Iterable<? extends Iterable<? extends T>> iterable) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        while (it.hasNext()) {
            C6163t.zp(arrayList, it.next());
        }
        return arrayList;
    }

    @InterfaceC6234g
    private static final <T> Iterable<T> uv6(InterfaceC5981k<? extends Iterator<? extends T>> iterator) {
        kotlin.jvm.internal.d2ok.m23075h(iterator, "iterator");
        return new C6142k(iterator);
    }

    @kotlin.nn86
    public static <T> int vyq(@InterfaceC7396q Iterable<? extends T> iterable, int i2) {
        kotlin.jvm.internal.d2ok.m23075h(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
