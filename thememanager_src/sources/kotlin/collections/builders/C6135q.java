package kotlin.collections.builders;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.kja0;
import kotlin.collections.n5r1;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.ranges.fn3e;
import kotlin.ranges.x2;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import r6ty.InterfaceC7627q;
import r6ty.f7l8;

/* JADX INFO: renamed from: kotlin.collections.builders.q */
/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
public final class C6135q<K, V> implements Map<K, V>, Serializable, r6ty.f7l8 {

    @InterfaceC7396q
    public static final k Companion = new k(null);

    /* JADX INFO: renamed from: g */
    private static final int f36121g = -1;

    /* JADX INFO: renamed from: k */
    private static final int f36122k = -1640531527;

    /* JADX INFO: renamed from: n */
    private static final int f36123n = 2;

    /* JADX INFO: renamed from: q */
    private static final int f36124q = 8;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private static final C6135q f36125y;

    @InterfaceC7395n
    private C6133n<K, V> entriesView;

    @InterfaceC7396q
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @InterfaceC7396q
    private K[] keysArray;

    @InterfaceC7395n
    private C6131g<K> keysView;
    private int length;
    private int maxProbeDistance;

    @InterfaceC7396q
    private int[] presenceArray;
    private int size;

    @InterfaceC7395n
    private V[] valuesArray;

    @InterfaceC7395n
    private f7l8<V> valuesView;

    /* JADX INFO: renamed from: kotlin.collections.builders.q$g */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class g<K, V> extends q<K, V> implements Iterator<V>, InterfaceC7627q {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(@InterfaceC7396q C6135q<K, V> map) {
            super(map);
            d2ok.m23075h(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (m22452k() >= ((C6135q) zy()).length) {
                throw new NoSuchElementException();
            }
            int iM22452k = m22452k();
            f7l8(iM22452k + 1);
            m22453y(iM22452k);
            Object[] objArr = ((C6135q) zy()).valuesArray;
            d2ok.qrj(objArr);
            V v2 = (V) objArr[toq()];
            m22451g();
            return v2;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.q$k */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public final int m22449q(int i2) {
            return Integer.numberOfLeadingZeros(i2) + 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int zy(int i2) {
            return Integer.highestOneBit(fn3e.fn3e(i2, 1) * 3);
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: n */
        public final C6135q m22450n() {
            return C6135q.f36125y;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.q$n */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class n<K, V> extends q<K, V> implements Iterator<K>, InterfaceC7627q {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(@InterfaceC7396q C6135q<K, V> map) {
            super(map);
            d2ok.m23075h(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (m22452k() >= ((C6135q) zy()).length) {
                throw new NoSuchElementException();
            }
            int iM22452k = m22452k();
            f7l8(iM22452k + 1);
            m22453y(iM22452k);
            K k2 = (K) ((C6135q) zy()).keysArray[toq()];
            m22451g();
            return k2;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.q$q */
    /* JADX INFO: compiled from: MapBuilder.kt */
    @lv5({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
    public static class q<K, V> {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C6135q<K, V> f36126k;

        /* JADX INFO: renamed from: n */
        private int f36127n;

        /* JADX INFO: renamed from: q */
        private int f36128q;

        public q(@InterfaceC7396q C6135q<K, V> map) {
            d2ok.m23075h(map, "map");
            this.f36126k = map;
            this.f36127n = -1;
            m22451g();
        }

        public final void f7l8(int i2) {
            this.f36128q = i2;
        }

        /* JADX INFO: renamed from: g */
        public final void m22451g() {
            while (this.f36128q < ((C6135q) this.f36126k).length) {
                int[] iArr = ((C6135q) this.f36126k).presenceArray;
                int i2 = this.f36128q;
                if (iArr[i2] >= 0) {
                    return;
                } else {
                    this.f36128q = i2 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f36128q < ((C6135q) this.f36126k).length;
        }

        /* JADX INFO: renamed from: k */
        public final int m22452k() {
            return this.f36128q;
        }

        public final void remove() {
            if (!(this.f36127n != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f36126k.checkIsMutable$kotlin_stdlib();
            this.f36126k.m22444i(this.f36127n);
            this.f36127n = -1;
        }

        public final int toq() {
            return this.f36127n;
        }

        /* JADX INFO: renamed from: y */
        public final void m22453y(int i2) {
            this.f36127n = i2;
        }

        @InterfaceC7396q
        public final C6135q<K, V> zy() {
            return this.f36126k;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.q$toq */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class toq<K, V> extends q<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC7627q {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public toq(@InterfaceC7396q C6135q<K, V> map) {
            super(map);
            d2ok.m23075h(map, "map");
        }

        public final int ld6() {
            if (m22452k() >= ((C6135q) zy()).length) {
                throw new NoSuchElementException();
            }
            int iM22452k = m22452k();
            f7l8(iM22452k + 1);
            m22453y(iM22452k);
            Object obj = ((C6135q) zy()).keysArray[toq()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((C6135q) zy()).valuesArray;
            d2ok.qrj(objArr);
            Object obj2 = objArr[toq()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m22451g();
            return iHashCode2;
        }

        /* JADX INFO: renamed from: p */
        public final void m22454p(@InterfaceC7396q StringBuilder sb) {
            d2ok.m23075h(sb, "sb");
            if (m22452k() >= ((C6135q) zy()).length) {
                throw new NoSuchElementException();
            }
            int iM22452k = m22452k();
            f7l8(iM22452k + 1);
            m22453y(iM22452k);
            Object obj = ((C6135q) zy()).keysArray[toq()];
            if (d2ok.f7l8(obj, zy())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = ((C6135q) zy()).valuesArray;
            d2ok.qrj(objArr);
            Object obj2 = objArr[toq()];
            if (d2ok.f7l8(obj2, zy())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            m22451g();
        }

        @Override // java.util.Iterator
        @InterfaceC7396q
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public zy<K, V> next() {
            if (m22452k() >= ((C6135q) zy()).length) {
                throw new NoSuchElementException();
            }
            int iM22452k = m22452k();
            f7l8(iM22452k + 1);
            m22453y(iM22452k);
            zy<K, V> zyVar = new zy<>(zy(), toq());
            m22451g();
            return zyVar;
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.builders.q$zy */
    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class zy<K, V> implements Map.Entry<K, V>, f7l8.InterfaceC7623k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final C6135q<K, V> f36129k;

        /* JADX INFO: renamed from: q */
        private final int f36130q;

        public zy(@InterfaceC7396q C6135q<K, V> map, int i2) {
            d2ok.m23075h(map, "map");
            this.f36129k = map;
            this.f36130q = i2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@InterfaceC7395n Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (d2ok.f7l8(entry.getKey(), getKey()) && d2ok.f7l8(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C6135q) this.f36129k).keysArray[this.f36130q];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C6135q) this.f36129k).valuesArray;
            d2ok.qrj(objArr);
            return (V) objArr[this.f36130q];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            this.f36129k.checkIsMutable$kotlin_stdlib();
            Object[] objArrM22445k = this.f36129k.m22445k();
            int i2 = this.f36130q;
            V v3 = (V) objArrM22445k[i2];
            objArrM22445k[i2] = v2;
            return v3;
        }

        @InterfaceC7396q
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    static {
        C6135q c6135q = new C6135q(0);
        c6135q.isReadOnly = true;
        f36125y = c6135q;
    }

    private C6135q(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i2, int i3) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i2;
        this.length = i3;
        this.hashShift = Companion.m22449q(ld6());
    }

    private final void cdj(int i2) {
        if (this.length > size()) {
            toq();
        }
        int i3 = 0;
        if (i2 != ld6()) {
            this.hashArray = new int[i2];
            this.hashShift = Companion.m22449q(i2);
        } else {
            kja0.e5(this.hashArray, 0, 0, ld6());
        }
        while (i3 < this.length) {
            int i4 = i3 + 1;
            if (!m22443h(i3)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i3 = i4;
        }
    }

    private final void f7l8(int i2) {
        if (fn3e(i2)) {
            cdj(ld6());
        } else {
            m22442g(this.length + i2);
        }
    }

    private final boolean fn3e(int i2) {
        int capacity$kotlin_stdlib = getCapacity$kotlin_stdlib();
        int i3 = this.length;
        int i4 = capacity$kotlin_stdlib - i3;
        int size = i3 - size();
        return i4 < i2 && i4 + size >= i2 && size >= getCapacity$kotlin_stdlib() / 4;
    }

    /* JADX INFO: renamed from: g */
    private final void m22442g(int i2) {
        if (i2 < 0) {
            throw new OutOfMemoryError();
        }
        if (i2 > getCapacity$kotlin_stdlib()) {
            int capacity$kotlin_stdlib = (getCapacity$kotlin_stdlib() * 3) / 2;
            if (i2 <= capacity$kotlin_stdlib) {
                i2 = capacity$kotlin_stdlib;
            }
            this.keysArray = (K[]) kotlin.collections.builders.zy.m22463n(this.keysArray, i2);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) kotlin.collections.builders.zy.m22463n(vArr, i2) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.presenceArray, i2);
            d2ok.kja0(iArrCopyOf, "copyOf(this, newSize)");
            this.presenceArray = iArrCopyOf;
            int iZy = Companion.zy(i2);
            if (iZy > ld6()) {
                cdj(iZy);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    private final boolean m22443h(int i2) {
        int iX2 = x2(this.keysArray[i2]);
        int i3 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[iX2] == 0) {
                iArr[iX2] = i2 + 1;
                this.presenceArray[i2] = iX2;
                return true;
            }
            i3--;
            if (i3 < 0) {
                return false;
            }
            iX2 = iX2 == 0 ? ld6() - 1 : iX2 - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final void m22444i(int i2) {
        kotlin.collections.builders.zy.m22461g(this.keysArray, i2);
        t8r(this.presenceArray[i2]);
        this.presenceArray[i2] = -1;
        this.size = size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public final V[] m22445k() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) kotlin.collections.builders.zy.m22465q(getCapacity$kotlin_stdlib());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final boolean kja0(Map.Entry<? extends K, ? extends V> entry) {
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(entry.getKey());
        V[] vArrM22445k = m22445k();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrM22445k[iAddKey$kotlin_stdlib] = entry.getValue();
            return true;
        }
        int i2 = (-iAddKey$kotlin_stdlib) - 1;
        if (d2ok.f7l8(entry.getValue(), vArrM22445k[i2])) {
            return false;
        }
        vArrM22445k[i2] = entry.getValue();
        return true;
    }

    private final int ld6() {
        return this.hashArray.length;
    }

    private final boolean n7h(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z2 = false;
        if (collection.isEmpty()) {
            return false;
        }
        f7l8(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (kja0(it.next())) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: p */
    private final int m22446p(V v2) {
        int i2 = this.length;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.presenceArray[i2] >= 0) {
                V[] vArr = this.valuesArray;
                d2ok.qrj(vArr);
                if (d2ok.f7l8(vArr[i2], v2)) {
                    return i2;
                }
            }
        }
    }

    private final void t8r(int i2) {
        int iM23305t = fn3e.m23305t(this.maxProbeDistance * 2, ld6() / 2);
        int i3 = 0;
        int i4 = i2;
        do {
            i2 = i2 == 0 ? ld6() - 1 : i2 - 1;
            i3++;
            if (i3 > this.maxProbeDistance) {
                this.hashArray[i4] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i5 = iArr[i2];
            if (i5 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i4] = -1;
            } else {
                int i6 = i5 - 1;
                if (((x2(this.keysArray[i6]) - i2) & (ld6() - 1)) >= i3) {
                    this.hashArray[i4] = i5;
                    this.presenceArray[i6] = i4;
                }
                iM23305t--;
            }
            i4 = i2;
            i3 = 0;
            iM23305t--;
        } while (iM23305t >= 0);
        this.hashArray[i4] = -1;
    }

    private final void toq() {
        int i2;
        V[] vArr = this.valuesArray;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = this.length;
            if (i3 >= i2) {
                break;
            }
            if (this.presenceArray[i3] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i4] = kArr[i3];
                if (vArr != null) {
                    vArr[i4] = vArr[i3];
                }
                i4++;
            }
            i3++;
        }
        kotlin.collections.builders.zy.f7l8(this.keysArray, i4, i2);
        if (vArr != null) {
            kotlin.collections.builders.zy.f7l8(vArr, i4, this.length);
        }
        this.length = i4;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.isReadOnly) {
            return new C6136s(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int x2(K k2) {
        return ((k2 != null ? k2.hashCode() : 0) * f36122k) >>> this.hashShift;
    }

    /* JADX INFO: renamed from: y */
    private final int m22447y(K k2) {
        int iX2 = x2(k2);
        int i2 = this.maxProbeDistance;
        while (true) {
            int i3 = this.hashArray[iX2];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (d2ok.f7l8(this.keysArray[i4], k2)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            iX2 = iX2 == 0 ? ld6() - 1 : iX2 - 1;
        }
    }

    private final boolean zy(Map<?, ?> map) {
        return size() == map.size() && containsAllEntries$kotlin_stdlib(map.entrySet());
    }

    public final int addKey$kotlin_stdlib(K k2) {
        checkIsMutable$kotlin_stdlib();
        while (true) {
            int iX2 = x2(k2);
            int iM23305t = fn3e.m23305t(this.maxProbeDistance * 2, ld6() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.hashArray[iX2];
                if (i3 <= 0) {
                    if (this.length < getCapacity$kotlin_stdlib()) {
                        int i4 = this.length;
                        int i5 = i4 + 1;
                        this.length = i5;
                        this.keysArray[i4] = k2;
                        this.presenceArray[i4] = iX2;
                        this.hashArray[iX2] = i5;
                        this.size = size() + 1;
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    f7l8(1);
                } else {
                    if (d2ok.f7l8(this.keysArray[i3 - 1], k2)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > iM23305t) {
                        cdj(ld6() * 2);
                        break;
                    }
                    iX2 = iX2 == 0 ? ld6() - 1 : iX2 - 1;
                }
            }
        }
    }

    @InterfaceC7396q
    public final Map<K, V> build() {
        checkIsMutable$kotlin_stdlib();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        C6135q c6135q = f36125y;
        d2ok.n7h(c6135q, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c6135q;
    }

    public final void checkIsMutable$kotlin_stdlib() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        checkIsMutable$kotlin_stdlib();
        n5r1 it = new x2(0, this.length - 1).iterator();
        while (it.hasNext()) {
            int iNextInt = it.nextInt();
            int[] iArr = this.presenceArray;
            int i2 = iArr[iNextInt];
            if (i2 >= 0) {
                this.hashArray[i2] = 0;
                iArr[iNextInt] = -1;
            }
        }
        kotlin.collections.builders.zy.f7l8(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            kotlin.collections.builders.zy.f7l8(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public final boolean containsAllEntries$kotlin_stdlib(@InterfaceC7396q Collection<?> m2) {
        d2ok.m23075h(m2, "m");
        for (Object obj : m2) {
            if (obj != null) {
                try {
                    if (!containsEntry$kotlin_stdlib((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean containsEntry$kotlin_stdlib(@InterfaceC7396q Map.Entry<? extends K, ? extends V> entry) {
        d2ok.m23075h(entry, "entry");
        int iM22447y = m22447y(entry.getKey());
        if (iM22447y < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        d2ok.qrj(vArr);
        return d2ok.f7l8(vArr[iM22447y], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m22447y(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m22446p(obj) >= 0;
    }

    @InterfaceC7396q
    public final toq<K, V> entriesIterator$kotlin_stdlib() {
        return new toq<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC7395n Object obj) {
        return obj == this || ((obj instanceof Map) && zy((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @InterfaceC7395n
    public V get(Object obj) {
        int iM22447y = m22447y(obj);
        if (iM22447y < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        d2ok.qrj(vArr);
        return vArr[iM22447y];
    }

    public final int getCapacity$kotlin_stdlib() {
        return this.keysArray.length;
    }

    @InterfaceC7396q
    public Set<Map.Entry<K, V>> getEntries() {
        C6133n<K, V> c6133n = this.entriesView;
        if (c6133n != null) {
            return c6133n;
        }
        C6133n<K, V> c6133n2 = new C6133n<>(this);
        this.entriesView = c6133n2;
        return c6133n2;
    }

    @InterfaceC7396q
    public Set<K> getKeys() {
        C6131g<K> c6131g = this.keysView;
        if (c6131g != null) {
            return c6131g;
        }
        C6131g<K> c6131g2 = new C6131g<>(this);
        this.keysView = c6131g2;
        return c6131g2;
    }

    public int getSize() {
        return this.size;
    }

    @InterfaceC7396q
    public Collection<V> getValues() {
        f7l8<V> f7l8Var = this.valuesView;
        if (f7l8Var != null) {
            return f7l8Var;
        }
        f7l8<V> f7l8Var2 = new f7l8<>(this);
        this.valuesView = f7l8Var2;
        return f7l8Var2;
    }

    @Override // java.util.Map
    public int hashCode() {
        toq<K, V> toqVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int iLd6 = 0;
        while (toqVarEntriesIterator$kotlin_stdlib.hasNext()) {
            iLd6 += toqVarEntriesIterator$kotlin_stdlib.ld6();
        }
        return iLd6;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isReadOnly$kotlin_stdlib() {
        return this.isReadOnly;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @InterfaceC7396q
    public final n<K, V> keysIterator$kotlin_stdlib() {
        return new n<>(this);
    }

    @Override // java.util.Map
    @InterfaceC7395n
    public V put(K k2, V v2) {
        checkIsMutable$kotlin_stdlib();
        int iAddKey$kotlin_stdlib = addKey$kotlin_stdlib(k2);
        V[] vArrM22445k = m22445k();
        if (iAddKey$kotlin_stdlib >= 0) {
            vArrM22445k[iAddKey$kotlin_stdlib] = v2;
            return null;
        }
        int i2 = (-iAddKey$kotlin_stdlib) - 1;
        V v3 = vArrM22445k[i2];
        vArrM22445k[i2] = v2;
        return v3;
    }

    @Override // java.util.Map
    public void putAll(@InterfaceC7396q Map<? extends K, ? extends V> from) {
        d2ok.m23075h(from, "from");
        checkIsMutable$kotlin_stdlib();
        n7h(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @InterfaceC7395n
    public V remove(Object obj) {
        int iRemoveKey$kotlin_stdlib = removeKey$kotlin_stdlib(obj);
        if (iRemoveKey$kotlin_stdlib < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        d2ok.qrj(vArr);
        V v2 = vArr[iRemoveKey$kotlin_stdlib];
        kotlin.collections.builders.zy.m22461g(vArr, iRemoveKey$kotlin_stdlib);
        return v2;
    }

    public final boolean removeEntry$kotlin_stdlib(@InterfaceC7396q Map.Entry<? extends K, ? extends V> entry) {
        d2ok.m23075h(entry, "entry");
        checkIsMutable$kotlin_stdlib();
        int iM22447y = m22447y(entry.getKey());
        if (iM22447y < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        d2ok.qrj(vArr);
        if (!d2ok.f7l8(vArr[iM22447y], entry.getValue())) {
            return false;
        }
        m22444i(iM22447y);
        return true;
    }

    public final int removeKey$kotlin_stdlib(K k2) {
        checkIsMutable$kotlin_stdlib();
        int iM22447y = m22447y(k2);
        if (iM22447y < 0) {
            return -1;
        }
        m22444i(iM22447y);
        return iM22447y;
    }

    public final boolean removeValue$kotlin_stdlib(V v2) {
        checkIsMutable$kotlin_stdlib();
        int iM22446p = m22446p(v2);
        if (iM22446p < 0) {
            return false;
        }
        m22444i(iM22446p);
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @InterfaceC7396q
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        toq<K, V> toqVarEntriesIterator$kotlin_stdlib = entriesIterator$kotlin_stdlib();
        int i2 = 0;
        while (toqVarEntriesIterator$kotlin_stdlib.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            toqVarEntriesIterator$kotlin_stdlib.m22454p(sb);
            i2++;
        }
        sb.append("}");
        String string = sb.toString();
        d2ok.kja0(string, "sb.toString()");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }

    @InterfaceC7396q
    public final g<K, V> valuesIterator$kotlin_stdlib() {
        return new g<>(this);
    }

    public C6135q() {
        this(8);
    }

    public C6135q(int i2) {
        this(kotlin.collections.builders.zy.m22465q(i2), null, new int[i2], new int[Companion.zy(i2)], 2, 0);
    }
}
