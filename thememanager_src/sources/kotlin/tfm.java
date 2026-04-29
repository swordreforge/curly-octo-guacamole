package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C6144h;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC6761g
@yz(version = "1.3")
@InterfaceC6232i
public final class tfm implements Collection<qo>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final short[] f36729k;

    /* JADX INFO: renamed from: kotlin.tfm$k */
    /* JADX INFO: compiled from: UShortArray.kt */
    private static final class C6460k implements Iterator<qo>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final short[] f36730k;

        /* JADX INFO: renamed from: q */
        private int f36731q;

        public C6460k(@InterfaceC7396q short[] array) {
            kotlin.jvm.internal.d2ok.m23075h(array, "array");
            this.f36730k = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36731q < this.f36730k.length;
        }

        /* JADX INFO: renamed from: k */
        public short m23658k() {
            int i2 = this.f36731q;
            short[] sArr = this.f36730k;
            if (i2 >= sArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f36731q));
            }
            this.f36731q = i2 + 1;
            return qo.ld6(sArr[i2]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ qo next() {
            return qo.zy(m23658k());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @nn86
    private /* synthetic */ tfm(short[] sArr) {
        this.f36729k = sArr;
    }

    public static boolean cdj(short[] sArr) {
        return sArr.length == 0;
    }

    public static String fn3e(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static short[] m23651g(@InterfaceC7396q short[] storage) {
        kotlin.jvm.internal.d2ok.m23075h(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: h */
    public static int m23652h(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* JADX INFO: renamed from: i */
    public static final void m23653i(short[] sArr, int i2, short s2) {
        sArr[i2] = s2;
    }

    @nn86
    public static /* synthetic */ void kja0() {
    }

    public static final boolean ld6(short[] sArr, short[] sArr2) {
        return kotlin.jvm.internal.d2ok.f7l8(sArr, sArr2);
    }

    public static int n7h(short[] sArr) {
        return sArr.length;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m23654p(short[] sArr, Object obj) {
        return (obj instanceof tfm) && kotlin.jvm.internal.d2ok.f7l8(sArr, ((tfm) obj).zurt());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m23655s(short[] sArr, @InterfaceC7396q Collection<qo> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof qo) && C6144h.x0c(sArr, ((qo) obj).bf2()))) {
                    return false;
                }
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static Iterator<qo> t8r(short[] sArr) {
        return new C6460k(sArr);
    }

    public static final /* synthetic */ tfm toq(short[] sArr) {
        return new tfm(sArr);
    }

    public static final short x2(short[] sArr, int i2) {
        return qo.ld6(sArr[i2]);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m23656y(short[] sArr, short s2) {
        return C6144h.x0c(sArr, s2);
    }

    @InterfaceC7396q
    public static short[] zy(int i2) {
        return m23651g(new short[i2]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(qo qoVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends qo> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof qo) {
            return f7l8(((qo) obj).bf2());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC7396q Collection<? extends Object> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return m23655s(this.f36729k, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m23654p(this.f36729k, obj);
    }

    public boolean f7l8(short s2) {
        return m23656y(this.f36729k, s2);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m23652h(this.f36729k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return cdj(this.f36729k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC7396q
    public Iterator<qo> iterator() {
        return t8r(this.f36729k);
    }

    /* JADX INFO: renamed from: k */
    public boolean m23657k(short s2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n7h(this.f36729k);
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
        return fn3e(this.f36729k);
    }

    public final /* synthetic */ short[] zurt() {
        return this.f36729k;
    }
}
