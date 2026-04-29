package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C6144h;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC6761g
@yz(version = "1.3")
@InterfaceC6232i
public final class bo implements Collection<C6475u>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final byte[] f36104k;

    /* JADX INFO: renamed from: kotlin.bo$k */
    /* JADX INFO: compiled from: UByteArray.kt */
    private static final class C6125k implements Iterator<C6475u>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final byte[] f36105k;

        /* JADX INFO: renamed from: q */
        private int f36106q;

        public C6125k(@InterfaceC7396q byte[] array) {
            kotlin.jvm.internal.d2ok.m23075h(array, "array");
            this.f36105k = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36106q < this.f36105k.length;
        }

        /* JADX INFO: renamed from: k */
        public byte m22419k() {
            int i2 = this.f36106q;
            byte[] bArr = this.f36105k;
            if (i2 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f36106q));
            }
            this.f36106q = i2 + 1;
            return C6475u.ld6(bArr[i2]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ C6475u next() {
            return C6475u.zy(m22419k());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @nn86
    private /* synthetic */ bo(byte[] bArr) {
        this.f36104k = bArr;
    }

    public static boolean cdj(byte[] bArr) {
        return bArr.length == 0;
    }

    public static String fn3e(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static byte[] m22412g(@InterfaceC7396q byte[] storage) {
        kotlin.jvm.internal.d2ok.m23075h(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: h */
    public static int m22413h(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: i */
    public static final void m22414i(byte[] bArr, int i2, byte b2) {
        bArr[i2] = b2;
    }

    @nn86
    public static /* synthetic */ void kja0() {
    }

    public static final boolean ld6(byte[] bArr, byte[] bArr2) {
        return kotlin.jvm.internal.d2ok.f7l8(bArr, bArr2);
    }

    public static int n7h(byte[] bArr) {
        return bArr.length;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m22415p(byte[] bArr, Object obj) {
        return (obj instanceof bo) && kotlin.jvm.internal.d2ok.f7l8(bArr, ((bo) obj).zurt());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m22416s(byte[] bArr, @InterfaceC7396q Collection<C6475u> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof C6475u) && C6144h.ih(bArr, ((C6475u) obj).bf2()))) {
                    return false;
                }
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static Iterator<C6475u> t8r(byte[] bArr) {
        return new C6125k(bArr);
    }

    public static final /* synthetic */ bo toq(byte[] bArr) {
        return new bo(bArr);
    }

    public static final byte x2(byte[] bArr, int i2) {
        return C6475u.ld6(bArr[i2]);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m22417y(byte[] bArr, byte b2) {
        return C6144h.ih(bArr, b2);
    }

    @InterfaceC7396q
    public static byte[] zy(int i2) {
        return m22412g(new byte[i2]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C6475u c6475u) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C6475u> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C6475u) {
            return f7l8(((C6475u) obj).bf2());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC7396q Collection<? extends Object> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return m22416s(this.f36104k, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m22415p(this.f36104k, obj);
    }

    public boolean f7l8(byte b2) {
        return m22417y(this.f36104k, b2);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m22413h(this.f36104k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return cdj(this.f36104k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC7396q
    public Iterator<C6475u> iterator() {
        return t8r(this.f36104k);
    }

    /* JADX INFO: renamed from: k */
    public boolean m22418k(byte b2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n7h(this.f36104k);
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
        return fn3e(this.f36104k);
    }

    public final /* synthetic */ byte[] zurt() {
        return this.f36104k;
    }
}
