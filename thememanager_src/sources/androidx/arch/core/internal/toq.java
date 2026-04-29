package androidx.arch.core.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: SafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class toq<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: k */
    zy<K, V> f1266k;

    /* JADX INFO: renamed from: q */
    private zy<K, V> f1268q;

    /* JADX INFO: renamed from: n */
    private WeakHashMap<InterfaceC0234g<K, V>, Boolean> f1267n = new WeakHashMap<>();

    /* JADX INFO: renamed from: g */
    private int f1265g = 0;

    /* JADX INFO: renamed from: androidx.arch.core.internal.toq$g */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    interface InterfaceC0234g<K, V> {
        /* JADX INFO: renamed from: k */
        void mo774k(@lvui zy<K, V> zyVar);
    }

    /* JADX INFO: renamed from: androidx.arch.core.internal.toq$k */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    static class C0235k<K, V> extends AbstractC0236n<K, V> {
        C0235k(zy<K, V> zyVar, zy<K, V> zyVar2) {
            super(zyVar, zyVar2);
        }

        @Override // androidx.arch.core.internal.toq.AbstractC0236n
        zy<K, V> toq(zy<K, V> zyVar) {
            return zyVar.f1274g;
        }

        @Override // androidx.arch.core.internal.toq.AbstractC0236n
        zy<K, V> zy(zy<K, V> zyVar) {
            return zyVar.f1276n;
        }
    }

    /* JADX INFO: renamed from: androidx.arch.core.internal.toq$n */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    private static abstract class AbstractC0236n<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC0234g<K, V> {

        /* JADX INFO: renamed from: k */
        zy<K, V> f1269k;

        /* JADX INFO: renamed from: q */
        zy<K, V> f1270q;

        AbstractC0236n(zy<K, V> zyVar, zy<K, V> zyVar2) {
            this.f1269k = zyVar2;
            this.f1270q = zyVar;
        }

        /* JADX INFO: renamed from: n */
        private zy<K, V> m775n() {
            zy<K, V> zyVar = this.f1270q;
            zy<K, V> zyVar2 = this.f1269k;
            if (zyVar == zyVar2 || zyVar2 == null) {
                return null;
            }
            return zy(zyVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1270q != null;
        }

        @Override // androidx.arch.core.internal.toq.InterfaceC0234g
        /* JADX INFO: renamed from: k */
        public void mo774k(@lvui zy<K, V> zyVar) {
            if (this.f1269k == zyVar && zyVar == this.f1270q) {
                this.f1270q = null;
                this.f1269k = null;
            }
            zy<K, V> zyVar2 = this.f1269k;
            if (zyVar2 == zyVar) {
                this.f1269k = toq(zyVar2);
            }
            if (this.f1270q == zyVar) {
                this.f1270q = m775n();
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            zy<K, V> zyVar = this.f1270q;
            this.f1270q = m775n();
            return zyVar;
        }

        abstract zy<K, V> toq(zy<K, V> zyVar);

        abstract zy<K, V> zy(zy<K, V> zyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.arch.core.internal.toq$q */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public class C0237q implements Iterator<Map.Entry<K, V>>, InterfaceC0234g<K, V> {

        /* JADX INFO: renamed from: k */
        private zy<K, V> f1271k;

        /* JADX INFO: renamed from: q */
        private boolean f1273q = true;

        C0237q() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1273q) {
                return toq.this.f1266k != null;
            }
            zy<K, V> zyVar = this.f1271k;
            return (zyVar == null || zyVar.f1276n == null) ? false : true;
        }

        @Override // androidx.arch.core.internal.toq.InterfaceC0234g
        /* JADX INFO: renamed from: k */
        public void mo774k(@lvui zy<K, V> zyVar) {
            zy<K, V> zyVar2 = this.f1271k;
            if (zyVar == zyVar2) {
                zy<K, V> zyVar3 = zyVar2.f1274g;
                this.f1271k = zyVar3;
                this.f1273q = zyVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f1273q) {
                this.f1273q = false;
                this.f1271k = toq.this.f1266k;
            } else {
                zy<K, V> zyVar = this.f1271k;
                this.f1271k = zyVar != null ? zyVar.f1276n : null;
            }
            return this.f1271k;
        }
    }

    /* JADX INFO: renamed from: androidx.arch.core.internal.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    private static class C7853toq<K, V> extends AbstractC0236n<K, V> {
        C7853toq(zy<K, V> zyVar, zy<K, V> zyVar2) {
            super(zyVar, zyVar2);
        }

        @Override // androidx.arch.core.internal.toq.AbstractC0236n
        zy<K, V> toq(zy<K, V> zyVar) {
            return zyVar.f1276n;
        }

        @Override // androidx.arch.core.internal.toq.AbstractC0236n
        zy<K, V> zy(zy<K, V> zyVar) {
            return zyVar.f1274g;
        }
    }

    /* JADX INFO: compiled from: SafeIterableMap.java */
    static class zy<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: g */
        zy<K, V> f1274g;

        /* JADX INFO: renamed from: k */
        @lvui
        final K f1275k;

        /* JADX INFO: renamed from: n */
        zy<K, V> f1276n;

        /* JADX INFO: renamed from: q */
        @lvui
        final V f1277q;

        zy(@lvui K k2, @lvui V v2) {
            this.f1275k = k2;
            this.f1277q = v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof zy)) {
                return false;
            }
            zy zyVar = (zy) obj;
            return this.f1275k.equals(zyVar.f1275k) && this.f1277q.equals(zyVar.f1277q);
        }

        @Override // java.util.Map.Entry
        @lvui
        public K getKey() {
            return this.f1275k;
        }

        @Override // java.util.Map.Entry
        @lvui
        public V getValue() {
            return this.f1277q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1275k.hashCode() ^ this.f1277q.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1275k + "=" + this.f1277q;
        }
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C7853toq c7853toq = new C7853toq(this.f1268q, this.f1266k);
        this.f1267n.put(c7853toq, Boolean.FALSE);
        return c7853toq;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof toq)) {
            return false;
        }
        toq toqVar = (toq) obj;
        if (size() != toqVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = toqVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public V f7l8(@lvui K k2, @lvui V v2) {
        zy<K, V> qVar = toq(k2);
        if (qVar != null) {
            return qVar.f1277q;
        }
        m771g(k2, v2);
        return null;
    }

    /* JADX INFO: renamed from: g */
    protected zy<K, V> m771g(@lvui K k2, @lvui V v2) {
        zy<K, V> zyVar = new zy<>(k2, v2);
        this.f1265g++;
        zy<K, V> zyVar2 = this.f1268q;
        if (zyVar2 == null) {
            this.f1266k = zyVar;
            this.f1268q = zyVar;
            return zyVar;
        }
        zyVar2.f1276n = zyVar;
        zyVar.f1274g = zyVar2;
        this.f1268q = zyVar;
        return zyVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    @lvui
    public Iterator<Map.Entry<K, V>> iterator() {
        C0235k c0235k = new C0235k(this.f1266k, this.f1268q);
        this.f1267n.put(c0235k, Boolean.FALSE);
        return c0235k;
    }

    /* JADX INFO: renamed from: k */
    public Map.Entry<K, V> m772k() {
        return this.f1266k;
    }

    /* JADX INFO: renamed from: n */
    public Map.Entry<K, V> m773n() {
        return this.f1268q;
    }

    public int size() {
        return this.f1265g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected zy<K, V> toq(K k2) {
        zy<K, V> zyVar = this.f1266k;
        while (zyVar != null && !zyVar.f1275k.equals(k2)) {
            zyVar = zyVar.f1276n;
        }
        return zyVar;
    }

    /* JADX INFO: renamed from: y */
    public V mo770y(@lvui K k2) {
        zy<K, V> qVar = toq(k2);
        if (qVar == null) {
            return null;
        }
        this.f1265g--;
        if (!this.f1267n.isEmpty()) {
            Iterator<InterfaceC0234g<K, V>> it = this.f1267n.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo774k(qVar);
            }
        }
        zy<K, V> zyVar = qVar.f1274g;
        if (zyVar != null) {
            zyVar.f1276n = qVar.f1276n;
        } else {
            this.f1266k = qVar.f1276n;
        }
        zy<K, V> zyVar2 = qVar.f1276n;
        if (zyVar2 != null) {
            zyVar2.f1274g = zyVar;
        } else {
            this.f1268q = zyVar;
        }
        qVar.f1276n = null;
        qVar.f1274g = null;
        return qVar.f1277q;
    }

    public toq<K, V>.C0237q zy() {
        toq<K, V>.C0237q c0237q = new C0237q();
        this.f1267n.put(c0237q, Boolean.FALSE);
        return c0237q;
    }
}
