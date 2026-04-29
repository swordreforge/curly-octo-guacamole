package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.collections.z */
/* JADX INFO: compiled from: IteratorsJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6175z extends fu4 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.z$k */
    /* JADX INFO: compiled from: IteratorsJVM.kt */
    public static final class k<T> implements Iterator<T>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Enumeration<T> f36212k;

        k(Enumeration<T> enumeration) {
            this.f36212k = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36212k.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f36212k.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: j */
    public static <T> Iterator<T> m22671j(@InterfaceC7396q Enumeration<T> enumeration) {
        kotlin.jvm.internal.d2ok.m23075h(enumeration, "<this>");
        return new k(enumeration);
    }
}
