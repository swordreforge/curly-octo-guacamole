package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.g0ad;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: LinkedHashMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public final class pjz9<K, V> extends ngy<K, V> {

    @InterfaceC7732q
    static final double VALUE_SET_LOAD_FACTOR = 1.0d;

    /* JADX INFO: renamed from: i */
    private static final int f26555i = 16;

    @wlev.zy
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: z */
    private static final int f26556z = 2;

    /* JADX INFO: renamed from: h */
    private transient toq<K, V> f26557h;

    @InterfaceC7732q
    transient int valueSetCapacity;

    /* JADX INFO: renamed from: com.google.common.collect.pjz9$k */
    /* JADX INFO: compiled from: LinkedHashMultimap.java */
    class C4511k implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        toq<K, V> f26558k;

        /* JADX INFO: renamed from: q */
        @NullableDecl
        toq<K, V> f26560q;

        C4511k() {
            this.f26558k = pjz9.this.f26557h.successorInMultimap;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26558k != pjz9.this.f26557h;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            toq<K, V> toqVar = this.f26558k;
            this.f26560q = toqVar;
            this.f26558k = toqVar.successorInMultimap;
            return toqVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26560q != null);
            pjz9.this.remove(this.f26560q.getKey(), this.f26560q.getValue());
            this.f26560q = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.pjz9$q */
    /* JADX INFO: compiled from: LinkedHashMultimap.java */
    private interface InterfaceC4512q<K, V> {
        InterfaceC4512q<K, V> getPredecessorInValueSet();

        InterfaceC4512q<K, V> getSuccessorInValueSet();

        void setPredecessorInValueSet(InterfaceC4512q<K, V> interfaceC4512q);

        void setSuccessorInValueSet(InterfaceC4512q<K, V> interfaceC4512q);
    }

    /* JADX INFO: compiled from: LinkedHashMultimap.java */
    @InterfaceC7732q
    static final class toq<K, V> extends yqrt<K, V> implements InterfaceC4512q<K, V> {

        @NullableDecl
        toq<K, V> nextInValueBucket;

        @NullableDecl
        toq<K, V> predecessorInMultimap;

        @NullableDecl
        InterfaceC4512q<K, V> predecessorInValueSet;
        final int smearedValueHash;

        @NullableDecl
        toq<K, V> successorInMultimap;

        @NullableDecl
        InterfaceC4512q<K, V> successorInValueSet;

        toq(@NullableDecl K k2, @NullableDecl V v2, int i2, @NullableDecl toq<K, V> toqVar) {
            super(k2, v2);
            this.smearedValueHash = i2;
            this.nextInValueBucket = toqVar;
        }

        public toq<K, V> getPredecessorInMultimap() {
            return this.predecessorInMultimap;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public InterfaceC4512q<K, V> getPredecessorInValueSet() {
            return this.predecessorInValueSet;
        }

        public toq<K, V> getSuccessorInMultimap() {
            return this.successorInMultimap;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public InterfaceC4512q<K, V> getSuccessorInValueSet() {
            return this.successorInValueSet;
        }

        boolean matchesValue(@NullableDecl Object obj, int i2) {
            return this.smearedValueHash == i2 && C4280z.m15455k(getValue(), obj);
        }

        public void setPredecessorInMultimap(toq<K, V> toqVar) {
            this.predecessorInMultimap = toqVar;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public void setPredecessorInValueSet(InterfaceC4512q<K, V> interfaceC4512q) {
            this.predecessorInValueSet = interfaceC4512q;
        }

        public void setSuccessorInMultimap(toq<K, V> toqVar) {
            this.successorInMultimap = toqVar;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public void setSuccessorInValueSet(InterfaceC4512q<K, V> interfaceC4512q) {
            this.successorInValueSet = interfaceC4512q;
        }
    }

    /* JADX INFO: compiled from: LinkedHashMultimap.java */
    @InterfaceC7732q
    final class zy extends g0ad.ld6<V> implements InterfaceC4512q<K, V> {

        /* JADX INFO: renamed from: k */
        private final K f26562k;

        /* JADX INFO: renamed from: q */
        @InterfaceC7732q
        toq<K, V>[] f26565q;

        /* JADX INFO: renamed from: n */
        private int f26563n = 0;

        /* JADX INFO: renamed from: g */
        private int f26561g = 0;

        /* JADX INFO: renamed from: y */
        private InterfaceC4512q<K, V> f26567y = this;

        /* JADX INFO: renamed from: s */
        private InterfaceC4512q<K, V> f26566s = this;

        /* JADX INFO: renamed from: com.google.common.collect.pjz9$zy$k */
        /* JADX INFO: compiled from: LinkedHashMultimap.java */
        class C4513k implements Iterator<V> {

            /* JADX INFO: renamed from: k */
            InterfaceC4512q<K, V> f26569k;

            /* JADX INFO: renamed from: n */
            int f26570n;

            /* JADX INFO: renamed from: q */
            @NullableDecl
            toq<K, V> f26571q;

            C4513k() {
                this.f26569k = zy.this.f26567y;
                this.f26570n = zy.this.f26561g;
            }

            /* JADX INFO: renamed from: k */
            private void m15968k() {
                if (zy.this.f26561g != this.f26570n) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m15968k();
                return this.f26569k != zy.this;
            }

            @Override // java.util.Iterator
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                toq<K, V> toqVar = (toq) this.f26569k;
                V value = toqVar.getValue();
                this.f26571q = toqVar;
                this.f26569k = toqVar.getSuccessorInValueSet();
                return value;
            }

            @Override // java.util.Iterator
            public void remove() {
                m15968k();
                C4524t.m15984n(this.f26571q != null);
                zy.this.remove(this.f26571q.getValue());
                this.f26570n = zy.this.f26561g;
                this.f26571q = null;
            }
        }

        zy(K k2, int i2) {
            this.f26562k = k2;
            this.f26565q = new toq[etdu.m15652k(i2, pjz9.VALUE_SET_LOAD_FACTOR)];
        }

        /* JADX INFO: renamed from: n */
        private void m15967n() {
            if (etdu.toq(this.f26563n, this.f26565q.length, pjz9.VALUE_SET_LOAD_FACTOR)) {
                int length = this.f26565q.length * 2;
                toq<K, V>[] toqVarArr = new toq[length];
                this.f26565q = toqVarArr;
                int i2 = length - 1;
                for (InterfaceC4512q<K, V> successorInValueSet = this.f26567y; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                    toq<K, V> toqVar = (toq) successorInValueSet;
                    int i3 = toqVar.smearedValueHash & i2;
                    toqVar.nextInValueBucket = toqVarArr[i3];
                    toqVarArr[i3] = toqVar;
                }
            }
        }

        private int zy() {
            return this.f26565q.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@NullableDecl V v2) {
            int iM15653q = etdu.m15653q(v2);
            int iZy = zy() & iM15653q;
            toq<K, V> toqVar = this.f26565q[iZy];
            for (toq<K, V> toqVar2 = toqVar; toqVar2 != null; toqVar2 = toqVar2.nextInValueBucket) {
                if (toqVar2.matchesValue(v2, iM15653q)) {
                    return false;
                }
            }
            toq<K, V> toqVar3 = new toq<>(this.f26562k, v2, iM15653q, toqVar);
            pjz9.m15964y(this.f26566s, toqVar3);
            pjz9.m15964y(toqVar3, this);
            pjz9.f7l8(pjz9.this.f26557h.getPredecessorInMultimap(), toqVar3);
            pjz9.f7l8(toqVar3, pjz9.this.f26557h);
            this.f26565q[iZy] = toqVar3;
            this.f26563n++;
            this.f26561g++;
            m15967n();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f26565q, (Object) null);
            this.f26563n = 0;
            for (InterfaceC4512q<K, V> successorInValueSet = this.f26567y; successorInValueSet != this; successorInValueSet = successorInValueSet.getSuccessorInValueSet()) {
                pjz9.m15963n((toq) successorInValueSet);
            }
            pjz9.m15964y(this, this);
            this.f26561g++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            int iM15653q = etdu.m15653q(obj);
            for (toq<K, V> toqVar = this.f26565q[zy() & iM15653q]; toqVar != null; toqVar = toqVar.nextInValueBucket) {
                if (toqVar.matchesValue(obj, iM15653q)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public InterfaceC4512q<K, V> getPredecessorInValueSet() {
            return this.f26566s;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public InterfaceC4512q<K, V> getSuccessorInValueSet() {
            return this.f26567y;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new C4513k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            int iM15653q = etdu.m15653q(obj);
            int iZy = zy() & iM15653q;
            toq<K, V> toqVar = null;
            for (toq<K, V> toqVar2 = this.f26565q[iZy]; toqVar2 != null; toqVar2 = toqVar2.nextInValueBucket) {
                if (toqVar2.matchesValue(obj, iM15653q)) {
                    if (toqVar == null) {
                        this.f26565q[iZy] = toqVar2.nextInValueBucket;
                    } else {
                        toqVar.nextInValueBucket = toqVar2.nextInValueBucket;
                    }
                    pjz9.m15962g(toqVar2);
                    pjz9.m15963n(toqVar2);
                    this.f26563n--;
                    this.f26561g++;
                    return true;
                }
                toqVar = toqVar2;
            }
            return false;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public void setPredecessorInValueSet(InterfaceC4512q<K, V> interfaceC4512q) {
            this.f26566s = interfaceC4512q;
        }

        @Override // com.google.common.collect.pjz9.InterfaceC4512q
        public void setSuccessorInValueSet(InterfaceC4512q<K, V> interfaceC4512q) {
            this.f26567y = interfaceC4512q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26563n;
        }
    }

    private pjz9(int i2, int i3) {
        super(m2t.m15828n(i2));
        this.valueSetCapacity = 2;
        C4524t.toq(i3, "expectedValuesPerKey");
        this.valueSetCapacity = i3;
        toq<K, V> toqVar = new toq<>(null, null, 0, null);
        this.f26557h = toqVar;
        f7l8(toqVar, toqVar);
    }

    public static <K, V> pjz9<K, V> create() {
        return new pjz9<>(16, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void f7l8(toq<K, V> toqVar, toq<K, V> toqVar2) {
        toqVar.setSuccessorInMultimap(toqVar2);
        toqVar2.setPredecessorInMultimap(toqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static <K, V> void m15962g(InterfaceC4512q<K, V> interfaceC4512q) {
        m15964y(interfaceC4512q.getPredecessorInValueSet(), interfaceC4512q.getSuccessorInValueSet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static <K, V> void m15963n(toq<K, V> toqVar) {
        f7l8(toqVar.getPredecessorInMultimap(), toqVar.getSuccessorInMultimap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        toq<K, V> toqVar = new toq<>(null, null, 0, null);
        this.f26557h = toqVar;
        f7l8(toqVar, toqVar);
        this.valueSetCapacity = 2;
        int i2 = objectInputStream.readInt();
        Map mapM15828n = m2t.m15828n(12);
        for (int i3 = 0; i3 < i2; i3++) {
            Object object = objectInputStream.readObject();
            mapM15828n.put(object, createCollection(object));
        }
        int i4 = objectInputStream.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            ((Collection) mapM15828n.get(objectInputStream.readObject())).add(objectInputStream.readObject());
        }
        setMap(mapM15828n);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(keySet().size());
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static <K, V> void m15964y(InterfaceC4512q<K, V> interfaceC4512q, InterfaceC4512q<K, V> interfaceC4512q2) {
        interfaceC4512q.setSuccessorInValueSet(interfaceC4512q2);
        interfaceC4512q2.setPredecessorInValueSet(interfaceC4512q);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public void clear() {
        super.clear();
        toq<K, V> toqVar = this.f26557h;
        f7l8(toqVar, toqVar);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsKey(@NullableDecl Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsValue(@NullableDecl Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
    Iterator<Map.Entry<K, V>> entryIterator() {
        return new C4511k();
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ Set get(@NullableDecl Object obj) {
        return super.get(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ o05 keys() {
        return super.keys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean put(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.put(obj, obj2);
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

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Set removeAll(@NullableDecl Object obj) {
        return super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractC4579y
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y
    Iterator<V> valueIterator() {
        return vy.zsr0(entryIterator());
    }

    @Override // com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Collection<V> values() {
        return super.values();
    }

    public static <K, V> pjz9<K, V> create(int i2, int i3) {
        return new pjz9<>(vy.kja0(i2), vy.kja0(i3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n
    public Set<V> createCollection() {
        return m2t.m15826g(this.valueSetCapacity);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean putAll(@NullableDecl Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    @Override // com.google.common.collect.qrj, com.google.common.collect.AbstractC4469n, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@NullableDecl K k2, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k2, (Iterable) iterable);
    }

    @Override // com.google.common.collect.AbstractC4469n
    Collection<V> createCollection(K k2) {
        return new zy(k2, this.valueSetCapacity);
    }

    public static <K, V> pjz9<K, V> create(lw<? extends K, ? extends V> lwVar) {
        pjz9<K, V> pjz9VarCreate = create(lwVar.keySet().size(), 2);
        pjz9VarCreate.putAll(lwVar);
        return pjz9VarCreate;
    }
}
