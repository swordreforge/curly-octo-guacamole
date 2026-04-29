package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C6144h;
import l05.InterfaceC6761g;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7625k;

/* JADX INFO: renamed from: kotlin.d */
/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.jvm.internal.lv5({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
@InterfaceC6761g
@yz(version = "1.3")
@InterfaceC6232i
public final class C6220d implements Collection<ikck>, InterfaceC7625k {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final long[] f36264k;

    /* JADX INFO: renamed from: kotlin.d$k */
    /* JADX INFO: compiled from: ULongArray.kt */
    private static final class k implements Iterator<ikck>, InterfaceC7625k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final long[] f36265k;

        /* JADX INFO: renamed from: q */
        private int f36266q;

        public k(@InterfaceC7396q long[] array) {
            kotlin.jvm.internal.d2ok.m23075h(array, "array");
            this.f36265k = array;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36266q < this.f36265k.length;
        }

        /* JADX INFO: renamed from: k */
        public long m22786k() {
            int i2 = this.f36266q;
            long[] jArr = this.f36265k;
            if (i2 >= jArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f36266q));
            }
            this.f36266q = i2 + 1;
            return ikck.ld6(jArr[i2]);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ ikck next() {
            return ikck.zy(m22786k());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @nn86
    private /* synthetic */ C6220d(long[] jArr) {
        this.f36264k = jArr;
    }

    public static boolean cdj(long[] jArr) {
        return jArr.length == 0;
    }

    public static String fn3e(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @nn86
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public static long[] m22779g(@InterfaceC7396q long[] storage) {
        kotlin.jvm.internal.d2ok.m23075h(storage, "storage");
        return storage;
    }

    /* JADX INFO: renamed from: h */
    public static int m22780h(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* JADX INFO: renamed from: i */
    public static final void m22781i(long[] jArr, int i2, long j2) {
        jArr[i2] = j2;
    }

    @nn86
    public static /* synthetic */ void kja0() {
    }

    public static final boolean ld6(long[] jArr, long[] jArr2) {
        return kotlin.jvm.internal.d2ok.f7l8(jArr, jArr2);
    }

    public static int n7h(long[] jArr) {
        return jArr.length;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m22782p(long[] jArr, Object obj) {
        return (obj instanceof C6220d) && kotlin.jvm.internal.d2ok.f7l8(jArr, ((C6220d) obj).zurt());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m22783s(long[] jArr, @InterfaceC7396q Collection<ikck> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        if (!elements.isEmpty()) {
            for (Object obj : elements) {
                if (!((obj instanceof ikck) && C6144h.p2sg(jArr, ((ikck) obj).a98o()))) {
                    return false;
                }
            }
        }
        return true;
    }

    @InterfaceC7396q
    public static Iterator<ikck> t8r(long[] jArr) {
        return new k(jArr);
    }

    public static final /* synthetic */ C6220d toq(long[] jArr) {
        return new C6220d(jArr);
    }

    public static final long x2(long[] jArr, int i2) {
        return ikck.ld6(jArr[i2]);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m22784y(long[] jArr, long j2) {
        return C6144h.p2sg(jArr, j2);
    }

    @InterfaceC7396q
    public static long[] zy(int i2) {
        return m22779g(new long[i2]);
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ikck ikckVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ikck> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ikck) {
            return f7l8(((ikck) obj).a98o());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(@InterfaceC7396q Collection<? extends Object> elements) {
        kotlin.jvm.internal.d2ok.m23075h(elements, "elements");
        return m22783s(this.f36264k, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m22782p(this.f36264k, obj);
    }

    public boolean f7l8(long j2) {
        return m22784y(this.f36264k, j2);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m22780h(this.f36264k);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return cdj(this.f36264k);
    }

    @Override // java.util.Collection, java.lang.Iterable
    @InterfaceC7396q
    public Iterator<ikck> iterator() {
        return t8r(this.f36264k);
    }

    /* JADX INFO: renamed from: k */
    public boolean m22785k(long j2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public int size() {
        return n7h(this.f36264k);
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
        return fn3e(this.f36264k);
    }

    public final /* synthetic */ long[] zurt() {
        return this.f36264k;
    }
}
