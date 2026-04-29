package com.google.common.collect;

import com.google.common.collect.el;
import com.google.common.collect.o05;
import com.google.common.math.C4723q;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: ConcurrentHashMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class lvui<E> extends AbstractC4519s<E> implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: n */
    private final transient ConcurrentMap<E, AtomicInteger> f26345n;

    /* JADX INFO: renamed from: com.google.common.collect.lvui$n */
    /* JADX INFO: compiled from: ConcurrentHashMultiset.java */
    private static class C4449n {

        /* JADX INFO: renamed from: k */
        static final el.toq<lvui> f26348k = el.m15645k(lvui.class, "countMap");

        private C4449n() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.lvui$q */
    /* JADX INFO: compiled from: ConcurrentHashMultiset.java */
    private class C4450q extends AbstractC4519s<E>.toq {
        private C4450q() {
            super();
        }

        private List<o05.InterfaceC4482k<E>> zy() {
            ArrayList arrayListZurt = wlev.zurt(size());
            zwy.m16125k(arrayListZurt, iterator());
            return arrayListZurt;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return zy().toArray();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4519s.toq, com.google.common.collect.m58i.AbstractC4457s
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public lvui<E> mo15679k() {
            return lvui.this;
        }

        /* synthetic */ C4450q(lvui lvuiVar, C4448k c4448k) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) zy().toArray(tArr);
        }
    }

    /* JADX INFO: compiled from: ConcurrentHashMultiset.java */
    class toq extends com.google.common.collect.zy<o05.InterfaceC4482k<E>> {

        /* JADX INFO: renamed from: n */
        private final Iterator<Map.Entry<E, AtomicInteger>> f26351n;

        toq() {
            this.f26351n = lvui.this.f26345n.entrySet().iterator();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public o05.InterfaceC4482k<E> mo15703k() {
            while (this.f26351n.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f26351n.next();
                int i2 = next.getValue().get();
                if (i2 != 0) {
                    return m58i.ld6(next.getKey(), i2);
                }
            }
            return toq();
        }
    }

    /* JADX INFO: compiled from: ConcurrentHashMultiset.java */
    class zy extends y2<o05.InterfaceC4482k<E>> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        private o05.InterfaceC4482k<E> f26352k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterator f26354q;

        zy(Iterator it) {
            this.f26354q = it;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.y2, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6 */
        public Iterator<o05.InterfaceC4482k<E>> delegate() {
            return this.f26354q;
        }

        @Override // com.google.common.collect.y2, java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26352k != null);
            lvui.this.setCount(this.f26352k.getElement(), 0);
            this.f26352k = null;
        }

        @Override // com.google.common.collect.y2, java.util.Iterator
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public o05.InterfaceC4482k<E> next() {
            o05.InterfaceC4482k<E> interfaceC4482k = (o05.InterfaceC4482k) super.next();
            this.f26352k = interfaceC4482k;
            return interfaceC4482k;
        }
    }

    @InterfaceC7732q
    lvui(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        com.google.common.base.jk.fn3e(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.f26345n = concurrentMap;
    }

    public static <E> lvui<E> create() {
        return new lvui<>(new ConcurrentHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    private List<E> m15814k() {
        ArrayList arrayListZurt = wlev.zurt(size());
        for (o05.InterfaceC4482k interfaceC4482k : entrySet()) {
            Object element = interfaceC4482k.getElement();
            for (int count = interfaceC4482k.getCount(); count > 0; count--) {
                arrayListZurt.add(element);
            }
        }
        return arrayListZurt;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        C4449n.f26348k.toq(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f26345n);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int add(E e2, int i2) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i3;
        AtomicInteger atomicInteger;
        com.google.common.base.jk.a9(e2);
        if (i2 == 0) {
            return count(e2);
        }
        C4524t.m15985q(i2, "occurences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) vy.ch(this.f26345n, e2);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.f26345n.putIfAbsent(e2, new AtomicInteger(i2))) == null) {
                return 0;
            }
            do {
                i3 = atomicIntegerPutIfAbsent.get();
                if (i3 == 0) {
                    atomicInteger = new AtomicInteger(i2);
                    if (this.f26345n.putIfAbsent(e2, atomicInteger) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException("Overflow adding " + i2 + " occurrences to a count of " + i3);
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i3, C4723q.zy(i3, i2)));
            return i3;
        } while (!this.f26345n.replace(e2, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f26345n.clear();
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.o05
    public int count(@NullableDecl Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) vy.ch(this.f26345n, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.AbstractC4519s
    Set<E> createElementSet() {
        return new C4448k(this.f26345n.keySet());
    }

    @Override // com.google.common.collect.AbstractC4519s
    @Deprecated
    public Set<o05.InterfaceC4482k<E>> createEntrySet() {
        return new C4450q(this, null);
    }

    @Override // com.google.common.collect.AbstractC4519s
    int distinctElements() {
        return this.f26345n.size();
    }

    @Override // com.google.common.collect.AbstractC4519s
    Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC4519s
    Iterator<o05.InterfaceC4482k<E>> entryIterator() {
        return new zy(new toq());
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f26345n.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public Iterator<E> iterator() {
        return m58i.n7h(this);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
        int i3;
        int iMax;
        if (i2 == 0) {
            return count(obj);
        }
        C4524t.m15985q(i2, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) vy.ch(this.f26345n, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i3 = atomicInteger.get();
            if (i3 == 0) {
                return 0;
            }
            iMax = Math.max(0, i3 - i2);
        } while (!atomicInteger.compareAndSet(i3, iMax));
        if (iMax == 0) {
            this.f26345n.remove(obj, atomicInteger);
        }
        return i3;
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(@NullableDecl Object obj, int i2) {
        int i3;
        int i4;
        if (i2 == 0) {
            return true;
        }
        C4524t.m15985q(i2, "occurences");
        AtomicInteger atomicInteger = (AtomicInteger) vy.ch(this.f26345n, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i3 = atomicInteger.get();
            if (i3 < i2) {
                return false;
            }
            i4 = i3 - i2;
        } while (!atomicInteger.compareAndSet(i3, i4));
        if (i4 == 0) {
            this.f26345n.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int setCount(E e2, int i2) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i3;
        AtomicInteger atomicInteger;
        com.google.common.base.jk.a9(e2);
        C4524t.toq(i2, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) vy.ch(this.f26345n, e2);
            if (atomicIntegerPutIfAbsent == null && (i2 == 0 || (atomicIntegerPutIfAbsent = this.f26345n.putIfAbsent(e2, new AtomicInteger(i2))) == null)) {
                return 0;
            }
            do {
                i3 = atomicIntegerPutIfAbsent.get();
                if (i3 == 0) {
                    if (i2 != 0) {
                        atomicInteger = new AtomicInteger(i2);
                        if (this.f26345n.putIfAbsent(e2, atomicInteger) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i3, i2));
            if (i2 == 0) {
                this.f26345n.remove(e2, atomicIntegerPutIfAbsent);
            }
            return i3;
        } while (!this.f26345n.replace(e2, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public int size() {
        Iterator<AtomicInteger> it = this.f26345n.values().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += (long) it.next().get();
        }
        return C4746s.fu4(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m15814k().toArray();
    }

    /* JADX INFO: renamed from: com.google.common.collect.lvui$k */
    /* JADX INFO: compiled from: ConcurrentHashMultiset.java */
    class C4448k extends qo<E> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Set f26346k;

        C4448k(Set set) {
            this.f26346k = set;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return obj != null && mcp.ld6(this.f26346k, obj);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean remove(Object obj) {
            return obj != null && mcp.x2(this.f26346k, obj);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<E> delegate() {
            return this.f26346k;
        }
    }

    public static <E> lvui<E> create(Iterable<? extends E> iterable) {
        lvui<E> lvuiVarCreate = create();
        nsb.m15905k(lvuiVarCreate, iterable);
        return lvuiVarCreate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) m15814k().toArray(tArr);
    }

    @InterfaceC7731k
    public static <E> lvui<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new lvui<>(concurrentMap);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public boolean setCount(E e2, int i2, int i3) {
        com.google.common.base.jk.a9(e2);
        C4524t.toq(i2, "oldCount");
        C4524t.toq(i3, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) vy.ch(this.f26345n, e2);
        if (atomicInteger == null) {
            if (i2 != 0) {
                return false;
            }
            return i3 == 0 || this.f26345n.putIfAbsent(e2, new AtomicInteger(i3)) == null;
        }
        int i4 = atomicInteger.get();
        if (i4 == i2) {
            if (i4 == 0) {
                if (i3 == 0) {
                    this.f26345n.remove(e2, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i3);
                return this.f26345n.putIfAbsent(e2, atomicInteger2) == null || this.f26345n.replace(e2, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i4, i3)) {
                if (i3 == 0) {
                    this.f26345n.remove(e2, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
