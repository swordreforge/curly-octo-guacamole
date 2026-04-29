package com.google.common.collect;

import com.google.common.collect.g0ad;
import com.google.common.collect.oki;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: LinkedListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public class bap7<K, V> extends AbstractC4579y<K, V> implements h4b<K, V>, Serializable {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h */
    private transient Map<K, C4316g<K, V>> f25973h;

    /* JADX INFO: renamed from: i */
    private transient int f25974i;

    /* JADX INFO: renamed from: p */
    @NullableDecl
    private transient f7l8<K, V> f25975p;

    /* JADX INFO: renamed from: s */
    @NullableDecl
    private transient f7l8<K, V> f25976s;

    /* JADX INFO: renamed from: z */
    private transient int f25977z;

    /* JADX INFO: compiled from: LinkedListMultimap.java */
    private static final class f7l8<K, V> extends com.google.common.collect.f7l8<K, V> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        f7l8<K, V> f25978g;

        /* JADX INFO: renamed from: k */
        @NullableDecl
        final K f25979k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        f7l8<K, V> f25980n;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        V f25981q;

        /* JADX INFO: renamed from: s */
        @NullableDecl
        f7l8<K, V> f25982s;

        /* JADX INFO: renamed from: y */
        @NullableDecl
        f7l8<K, V> f25983y;

        f7l8(@NullableDecl K k2, @NullableDecl V v2) {
            this.f25979k = k2;
            this.f25981q = v2;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public K getKey() {
            return this.f25979k;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V getValue() {
            return this.f25981q;
        }

        @Override // com.google.common.collect.f7l8, java.util.Map.Entry
        public V setValue(@NullableDecl V v2) {
            V v3 = this.f25981q;
            this.f25981q = v2;
            return v3;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.bap7$g */
    /* JADX INFO: compiled from: LinkedListMultimap.java */
    private static class C4316g<K, V> {

        /* JADX INFO: renamed from: k */
        f7l8<K, V> f25984k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        f7l8<K, V> f68186toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f68187zy;

        C4316g(f7l8<K, V> f7l8Var) {
            this.f25984k = f7l8Var;
            this.f68186toq = f7l8Var;
            f7l8Var.f25982s = null;
            f7l8Var.f25983y = null;
            this.f68187zy = 1;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.bap7$k */
    /* JADX INFO: compiled from: LinkedListMultimap.java */
    class C4317k extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f25985k;

        C4317k(Object obj) {
            this.f25985k = obj;
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i2) {
            return new C4320s(this.f25985k, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            C4316g c4316g = (C4316g) bap7.this.f25973h.get(this.f25985k);
            if (c4316g == null) {
                return 0;
            }
            return c4316g.f68187zy;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.bap7$q */
    /* JADX INFO: compiled from: LinkedListMultimap.java */
    class C4319q extends AbstractSequentialList<V> {

        /* JADX INFO: renamed from: com.google.common.collect.bap7$q$k */
        /* JADX INFO: compiled from: LinkedListMultimap.java */
        class k extends xtb7<Map.Entry<K, V>, V> {

            /* JADX INFO: renamed from: q */
            final /* synthetic */ C4321y f25994q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(ListIterator listIterator, C4321y c4321y) {
                super(listIterator);
                this.f25994q = c4321y;
            }

            @Override // com.google.common.collect.xtb7, java.util.ListIterator
            public void set(V v2) {
                this.f25994q.m15581g(v2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.pnt2
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public V mo15580k(Map.Entry<K, V> entry) {
                return entry.getValue();
            }
        }

        C4319q() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<V> listIterator(int i2) {
            C4321y c4321y = new C4321y(i2);
            return new k(c4321y, c4321y);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return bap7.this.f25974i;
        }
    }

    /* JADX INFO: compiled from: LinkedListMultimap.java */
    class toq extends AbstractSequentialList<Map.Entry<K, V>> {
        toq() {
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<Map.Entry<K, V>> listIterator(int i2) {
            return new C4321y(i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return bap7.this.f25974i;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.bap7$y */
    /* JADX INFO: compiled from: LinkedListMultimap.java */
    private class C4321y implements ListIterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        f7l8<K, V> f26002g;

        /* JADX INFO: renamed from: k */
        int f26003k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        f7l8<K, V> f26004n;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        f7l8<K, V> f26005q;

        /* JADX INFO: renamed from: y */
        int f26007y;

        C4321y(int i2) {
            this.f26007y = bap7.this.f25977z;
            int size = bap7.this.size();
            com.google.common.base.jk.m15381o(i2, size);
            if (i2 < size / 2) {
                this.f26005q = bap7.this.f25976s;
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i3;
                }
            } else {
                this.f26002g = bap7.this.f25975p;
                this.f26003k = size;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 >= size) {
                        break;
                    }
                    previous();
                    i2 = i4;
                }
            }
            this.f26004n = null;
        }

        private void toq() {
            if (bap7.this.f25977z != this.f26007y) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: g */
        void m15581g(V v2) {
            com.google.common.base.jk.yz(this.f26004n != null);
            this.f26004n.f25981q = v2;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            toq();
            return this.f26005q != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            toq();
            return this.f26002g != null;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void set(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f26003k;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f26003k - 1;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public f7l8<K, V> previous() {
            toq();
            bap7.zy(this.f26002g);
            f7l8<K, V> f7l8Var = this.f26002g;
            this.f26004n = f7l8Var;
            this.f26005q = f7l8Var;
            this.f26002g = f7l8Var.f25978g;
            this.f26003k--;
            return f7l8Var;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            toq();
            C4524t.m15984n(this.f26004n != null);
            f7l8<K, V> f7l8Var = this.f26004n;
            if (f7l8Var != this.f26005q) {
                this.f26002g = f7l8Var.f25978g;
                this.f26003k--;
            } else {
                this.f26005q = f7l8Var.f25980n;
            }
            bap7.this.m15575g(f7l8Var);
            this.f26004n = null;
            this.f26007y = bap7.this.f25977z;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public f7l8<K, V> next() {
            toq();
            bap7.zy(this.f26005q);
            f7l8<K, V> f7l8Var = this.f26005q;
            this.f26004n = f7l8Var;
            this.f26002g = f7l8Var;
            this.f26005q = f7l8Var.f25980n;
            this.f26003k++;
            return f7l8Var;
        }
    }

    /* JADX INFO: compiled from: LinkedListMultimap.java */
    class zy extends g0ad.ld6<K> {
        zy() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return bap7.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new C4318n(bap7.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return !bap7.this.removeAll(obj).isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return bap7.this.f25973h.size();
        }
    }

    bap7() {
        this(12);
    }

    public static <K, V> bap7<K, V> create() {
        return new bap7<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m15575g(f7l8<K, V> f7l8Var) {
        f7l8<K, V> f7l8Var2 = f7l8Var.f25978g;
        if (f7l8Var2 != null) {
            f7l8Var2.f25980n = f7l8Var.f25980n;
        } else {
            this.f25976s = f7l8Var.f25980n;
        }
        f7l8<K, V> f7l8Var3 = f7l8Var.f25980n;
        if (f7l8Var3 != null) {
            f7l8Var3.f25978g = f7l8Var2;
        } else {
            this.f25975p = f7l8Var2;
        }
        if (f7l8Var.f25982s == null && f7l8Var.f25983y == null) {
            this.f25973h.remove(f7l8Var.f25979k).f68187zy = 0;
            this.f25977z++;
        } else {
            C4316g<K, V> c4316g = this.f25973h.get(f7l8Var.f25979k);
            c4316g.f68187zy--;
            f7l8<K, V> f7l8Var4 = f7l8Var.f25982s;
            if (f7l8Var4 == null) {
                c4316g.f25984k = f7l8Var.f25983y;
            } else {
                f7l8Var4.f25983y = f7l8Var.f25983y;
            }
            f7l8<K, V> f7l8Var5 = f7l8Var.f25983y;
            if (f7l8Var5 == null) {
                c4316g.f68186toq = f7l8Var4;
            } else {
                f7l8Var5.f25982s = f7l8Var4;
            }
        }
        this.f25974i--;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public f7l8<K, V> m15576k(@NullableDecl K k2, @NullableDecl V v2, @NullableDecl f7l8<K, V> f7l8Var) {
        f7l8<K, V> f7l8Var2 = new f7l8<>(k2, v2);
        if (this.f25976s == null) {
            this.f25975p = f7l8Var2;
            this.f25976s = f7l8Var2;
            this.f25973h.put(k2, new C4316g<>(f7l8Var2));
            this.f25977z++;
        } else if (f7l8Var == null) {
            f7l8<K, V> f7l8Var3 = this.f25975p;
            f7l8Var3.f25980n = f7l8Var2;
            f7l8Var2.f25978g = f7l8Var3;
            this.f25975p = f7l8Var2;
            C4316g<K, V> c4316g = this.f25973h.get(k2);
            if (c4316g == null) {
                this.f25973h.put(k2, new C4316g<>(f7l8Var2));
                this.f25977z++;
            } else {
                c4316g.f68187zy++;
                f7l8<K, V> f7l8Var4 = c4316g.f68186toq;
                f7l8Var4.f25983y = f7l8Var2;
                f7l8Var2.f25982s = f7l8Var4;
                c4316g.f68186toq = f7l8Var2;
            }
        } else {
            this.f25973h.get(k2).f68187zy++;
            f7l8Var2.f25978g = f7l8Var.f25978g;
            f7l8Var2.f25982s = f7l8Var.f25982s;
            f7l8Var2.f25980n = f7l8Var;
            f7l8Var2.f25983y = f7l8Var;
            f7l8<K, V> f7l8Var5 = f7l8Var.f25982s;
            if (f7l8Var5 == null) {
                this.f25973h.get(k2).f25984k = f7l8Var2;
            } else {
                f7l8Var5.f25983y = f7l8Var2;
            }
            f7l8<K, V> f7l8Var6 = f7l8Var.f25978g;
            if (f7l8Var6 == null) {
                this.f25976s = f7l8Var2;
            } else {
                f7l8Var6.f25980n = f7l8Var2;
            }
            f7l8Var.f25978g = f7l8Var2;
            f7l8Var.f25982s = f7l8Var2;
        }
        this.f25974i++;
        return f7l8Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public void m15577n(@NullableDecl Object obj) {
        zwy.m16135y(new C4320s(obj));
    }

    /* JADX INFO: renamed from: q */
    private List<V> m15578q(@NullableDecl Object obj) {
        return Collections.unmodifiableList(wlev.t8r(new C4320s(obj)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f25973h = fti.create();
        int i2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < i2; i3++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zy(@NullableDecl Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.lw
    public void clear() {
        this.f25976s = null;
        this.f25975p = null;
        this.f25973h.clear();
        this.f25974i = 0;
        this.f25977z++;
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.lw
    public boolean containsKey(@NullableDecl Object obj) {
        return this.f25973h.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Map<K, Collection<V>> createAsMap() {
        return new oki.C4493k(this);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Set<K> createKeySet() {
        return new zy();
    }

    @Override // com.google.common.collect.AbstractC4579y
    o05<K> createKeys() {
        return new oki.f7l8(this);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Iterator<Map.Entry<K, V>> entryIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public boolean isEmpty() {
        return this.f25976s == null;
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ o05 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v2) {
        m15576k(k2, v2, null);
        return true;
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(lw lwVar) {
        return super.putAll(lwVar);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.lw
    public int size() {
        return this.f25974i;
    }

    @Override // com.google.common.collect.AbstractC4579y
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private bap7(int i2) {
        this.f25973h = m2t.zy(i2);
    }

    public static <K, V> bap7<K, V> create(int i2) {
        return new bap7<>(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public List<Map.Entry<K, V>> createEntries() {
        return new toq();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public List<V> createValues() {
        return new C4319q();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public List<Map.Entry<K, V>> entries() {
        return (List) super.entries();
    }

    @Override // com.google.common.collect.lw
    public List<V> get(@NullableDecl K k2) {
        return new C4317k(k2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    public List<V> removeAll(@NullableDecl Object obj) {
        List<V> listM15578q = m15578q(obj);
        m15577n(obj);
        return listM15578q;
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public List<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        List<V> listM15578q = m15578q(k2);
        C4320s c4320s = new C4320s(k2);
        Iterator<? extends V> it = iterable.iterator();
        while (c4320s.hasNext() && it.hasNext()) {
            c4320s.next();
            c4320s.set(it.next());
        }
        while (c4320s.hasNext()) {
            c4320s.next();
            c4320s.remove();
        }
        while (it.hasNext()) {
            c4320s.add(it.next());
        }
        return listM15578q;
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public List<V> values() {
        return (List) super.values();
    }

    public static <K, V> bap7<K, V> create(lw<? extends K, ? extends V> lwVar) {
        return new bap7<>(lwVar);
    }

    /* JADX INFO: renamed from: com.google.common.collect.bap7$n */
    /* JADX INFO: compiled from: LinkedListMultimap.java */
    private class C4318n implements Iterator<K> {

        /* JADX INFO: renamed from: g */
        int f25987g;

        /* JADX INFO: renamed from: k */
        final Set<K> f25988k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        f7l8<K, V> f25989n;

        /* JADX INFO: renamed from: q */
        f7l8<K, V> f25990q;

        private C4318n() {
            this.f25988k = g0ad.m15700z(bap7.this.keySet().size());
            this.f25990q = bap7.this.f25976s;
            this.f25987g = bap7.this.f25977z;
        }

        /* JADX INFO: renamed from: k */
        private void m15579k() {
            if (bap7.this.f25977z != this.f25987g) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15579k();
            return this.f25990q != null;
        }

        @Override // java.util.Iterator
        public K next() {
            f7l8<K, V> f7l8Var;
            m15579k();
            bap7.zy(this.f25990q);
            f7l8<K, V> f7l8Var2 = this.f25990q;
            this.f25989n = f7l8Var2;
            this.f25988k.add(f7l8Var2.f25979k);
            do {
                f7l8Var = this.f25990q.f25980n;
                this.f25990q = f7l8Var;
                if (f7l8Var == null) {
                    break;
                }
            } while (!this.f25988k.add(f7l8Var.f25979k));
            return this.f25989n.f25979k;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15579k();
            C4524t.m15984n(this.f25989n != null);
            bap7.this.m15577n(this.f25989n.f25979k);
            this.f25989n = null;
            this.f25987g = bap7.this.f25977z;
        }

        /* synthetic */ C4318n(bap7 bap7Var, C4317k c4317k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.bap7$s */
    /* JADX INFO: compiled from: LinkedListMultimap.java */
    private class C4320s implements ListIterator<V> {

        /* JADX INFO: renamed from: g */
        @NullableDecl
        f7l8<K, V> f25995g;

        /* JADX INFO: renamed from: k */
        @NullableDecl
        final Object f25996k;

        /* JADX INFO: renamed from: n */
        @NullableDecl
        f7l8<K, V> f25997n;

        /* JADX INFO: renamed from: q */
        int f25998q;

        /* JADX INFO: renamed from: y */
        @NullableDecl
        f7l8<K, V> f26000y;

        C4320s(@NullableDecl Object obj) {
            this.f25996k = obj;
            C4316g c4316g = (C4316g) bap7.this.f25973h.get(obj);
            this.f25997n = c4316g == null ? null : c4316g.f25984k;
        }

        @Override // java.util.ListIterator
        public void add(V v2) {
            this.f26000y = bap7.this.m15576k(this.f25996k, v2, this.f25997n);
            this.f25998q++;
            this.f25995g = null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f25997n != null;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f26000y != null;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        @CanIgnoreReturnValue
        public V next() {
            bap7.zy(this.f25997n);
            f7l8<K, V> f7l8Var = this.f25997n;
            this.f25995g = f7l8Var;
            this.f26000y = f7l8Var;
            this.f25997n = f7l8Var.f25983y;
            this.f25998q++;
            return f7l8Var.f25981q;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f25998q;
        }

        @Override // java.util.ListIterator
        @CanIgnoreReturnValue
        public V previous() {
            bap7.zy(this.f26000y);
            f7l8<K, V> f7l8Var = this.f26000y;
            this.f25995g = f7l8Var;
            this.f25997n = f7l8Var;
            this.f26000y = f7l8Var.f25982s;
            this.f25998q--;
            return f7l8Var.f25981q;
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f25998q - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f25995g != null);
            f7l8<K, V> f7l8Var = this.f25995g;
            if (f7l8Var != this.f25997n) {
                this.f26000y = f7l8Var.f25982s;
                this.f25998q--;
            } else {
                this.f25997n = f7l8Var.f25983y;
            }
            bap7.this.m15575g(f7l8Var);
            this.f25995g = null;
        }

        @Override // java.util.ListIterator
        public void set(V v2) {
            com.google.common.base.jk.yz(this.f25995g != null);
            this.f25995g.f25981q = v2;
        }

        public C4320s(@NullableDecl Object obj, int i2) {
            C4316g c4316g = (C4316g) bap7.this.f25973h.get(obj);
            int i3 = c4316g == null ? 0 : c4316g.f68187zy;
            com.google.common.base.jk.m15381o(i2, i3);
            if (i2 >= i3 / 2) {
                this.f26000y = c4316g == null ? null : c4316g.f68186toq;
                this.f25998q = i3;
                while (true) {
                    int i4 = i2 + 1;
                    if (i2 >= i3) {
                        break;
                    }
                    previous();
                    i2 = i4;
                }
            } else {
                this.f25997n = c4316g == null ? null : c4316g.f25984k;
                while (true) {
                    int i5 = i2 - 1;
                    if (i2 <= 0) {
                        break;
                    }
                    next();
                    i2 = i5;
                }
            }
            this.f25996k = obj;
            this.f25995g = null;
        }
    }

    private bap7(lw<? extends K, ? extends V> lwVar) {
        this(lwVar.keySet().size());
        putAll(lwVar);
    }
}
