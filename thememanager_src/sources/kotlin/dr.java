package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C6144h;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC6761g
@yz(version = "1.3")
@InterfaceC6232i
public final class dr implements Collection<gyi>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final int[] f36267k;

    /* JADX INFO: renamed from: kotlin.dr$k */
    /* JADX INFO: compiled from: UIntArray.kt */
    private static final class C6222k implements Iterator<gyi>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final int[] f36268k;

        /* JADX INFO: renamed from: q */
        private int f36269q;

        public C6222k(@InterfaceC7396q int[] array) {
            kotlin.jvm.internal.d2ok.m23075h(array, "array");
            this.f36268k = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36269q < this.f36268k.length;
        }

        /* JADX INFO: renamed from: k */
        public int m22809k() {
            int i2 = this.f36269q;
            int[] iArr = this.f36268k;
            if (i2 >= iArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f36269q));
            }
            this.f36269q = i2 + 1;
            return gyi.ld6(iArr[i2]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ gyi next() {
            return gyi.zy(m22809k());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @nn86
    private /* synthetic */ dr(int[] iArr) {
        this.f36267k = iArr;
    }

    public static boolean cdj(int[] iArr) {
        return iArr.length == 0;
    }

    public static String fn3e(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static int[] m22802g(@InterfaceC7396q int[] storage) {
        kotlin.jvm.internal.d2ok.m23075h(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: h */
    public static int m22803h(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* JADX INFO: renamed from: i */
    public static final void m22804i(int[] iArr, int i2, int i3) {
        iArr[i2] = i3;
    }

    @nn86
    public static /* synthetic */ void kja0() {
    }

    public static final boolean ld6(int[] iArr, int[] iArr2) {
        return kotlin.jvm.internal.d2ok.f7l8(iArr, iArr2);
    }

    public static int n7h(int[] iArr) {
        return iArr.length;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m22805p(int[] iArr, Object obj) {
        return (obj instanceof dr) && kotlin.jvm.internal.d2ok.f7l8(iArr, ((dr) obj).zurt());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m22806s(int[] iArr, @InterfaceC7396q Collection<gyi> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof gyi) && C6144h.i03a(iArr, ((gyi) obj).a98o()))) {
                    return false;
                }
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static Iterator<gyi> t8r(int[] iArr) {
        return new C6222k(iArr);
    }

    public static final /* synthetic */ dr toq(int[] iArr) {
        return new dr(iArr);
    }

    public static final int x2(int[] iArr, int i2) {
        return gyi.ld6(iArr[i2]);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m22807y(int[] iArr, int i2) {
        return C6144h.i03a(iArr, i2);
    }

    @InterfaceC7396q
    public static int[] zy(int i2) {
        return m22802g(new int[i2]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(gyi gyiVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends gyi> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof gyi) {
            return f7l8(((gyi) obj).a98o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC7396q Collection<? extends Object> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return m22806s(this.f36267k, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m22805p(this.f36267k, obj);
    }

    public boolean f7l8(int i2) {
        return m22807y(this.f36267k, i2);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m22803h(this.f36267k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return cdj(this.f36267k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC7396q
    public Iterator<gyi> iterator() {
        return t8r(this.f36267k);
    }

    /* JADX INFO: renamed from: k */
    public boolean m22808k(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n7h(this.f36267k);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.zurt.m23171k(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        return (T[]) kotlin.jvm.internal.zurt.toq(this, array);
    }

    public String toString() {
        return fn3e(this.f36267k);
    }

    public final /* synthetic */ int[] zurt() {
        return this.f36267k;
    }
}
