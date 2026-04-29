package com.google.common.collect;

import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: EnumMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public final class hb<E extends Enum<E>> extends AbstractC4519s<E> implements Serializable {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g */
    private transient E[] f26198g;

    /* JADX INFO: renamed from: n */
    private transient Class<E> f26199n;

    /* JADX INFO: renamed from: p */
    private transient long f26200p;

    /* JADX INFO: renamed from: s */
    private transient int f26201s;

    /* JADX INFO: renamed from: y */
    private transient int[] f26202y;

    /* JADX INFO: renamed from: com.google.common.collect.hb$k */
    /* JADX INFO: compiled from: EnumMultiset.java */
    class C4406k extends hb<E>.zy<E> {
        C4406k() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.hb.zy
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public E mo15741k(int i2) {
            return (E) hb.this.f26198g[i2];
        }
    }

    /* JADX INFO: compiled from: EnumMultiset.java */
    class toq extends hb<E>.zy<o05.InterfaceC4482k<E>> {

        /* JADX INFO: renamed from: com.google.common.collect.hb$toq$k */
        /* JADX INFO: compiled from: EnumMultiset.java */
        class C4407k extends m58i.AbstractC4452g<E> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f26205k;

            C4407k(int i2) {
                this.f26205k = i2;
            }

            @Override // com.google.common.collect.o05.InterfaceC4482k
            public int getCount() {
                return hb.this.f26202y[this.f26205k];
            }

            @Override // com.google.common.collect.o05.InterfaceC4482k
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public E getElement() {
                return (E) hb.this.f26198g[this.f26205k];
            }
        }

        toq() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.hb.zy
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public o05.InterfaceC4482k<E> mo15741k(int i2) {
            return new C4407k(i2);
        }
    }

    /* JADX INFO: compiled from: EnumMultiset.java */
    abstract class zy<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        int f26207k = 0;

        /* JADX INFO: renamed from: q */
        int f26209q = -1;

        zy() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.f26207k < hb.this.f26198g.length) {
                int[] iArr = hb.this.f26202y;
                int i2 = this.f26207k;
                if (iArr[i2] > 0) {
                    return true;
                }
                this.f26207k = i2 + 1;
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        abstract T mo15741k(int i2);

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tMo15741k = mo15741k(this.f26207k);
            int i2 = this.f26207k;
            this.f26209q = i2;
            this.f26207k = i2 + 1;
            return tMo15741k;
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26209q >= 0);
            if (hb.this.f26202y[this.f26209q] > 0) {
                hb.access$210(hb.this);
                hb.this.f26200p -= (long) hb.this.f26202y[this.f26209q];
                hb.this.f26202y[this.f26209q] = 0;
            }
            this.f26209q = -1;
        }
    }

    private hb(Class<E> cls) {
        this.f26199n = cls;
        com.google.common.base.jk.m15383q(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.f26198g = enumConstants;
        this.f26202y = new int[enumConstants.length];
    }

    static /* synthetic */ int access$210(hb hbVar) {
        int i2 = hbVar.f26201s;
        hbVar.f26201s = i2 - 1;
        return i2;
    }

    public static <E extends Enum<E>> hb<E> create(Class<E> cls) {
        return new hb<>(cls);
    }

    /* JADX INFO: renamed from: k */
    private boolean m15740k(@NullableDecl Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.f26198g;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f26199n = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f26198g = enumConstants;
        this.f26202y = new int[enumConstants.length];
        el.m15644g(this, objectInputStream);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f26199n);
        el.ld6(this, objectOutputStream);
    }

    void checkIsE(@NullableDecl Object obj) {
        com.google.common.base.jk.a9(obj);
        if (m15740k(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.f26199n + " but got " + obj);
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.f26202y, 0);
        this.f26200p = 0L;
        this.f26201s = 0;
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.o05
    public int count(@NullableDecl Object obj) {
        if (obj == null || !m15740k(obj)) {
            return 0;
        }
        return this.f26202y[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractC4519s
    int distinctElements() {
        return this.f26201s;
    }

    @Override // com.google.common.collect.AbstractC4519s
    Iterator<E> elementIterator() {
        return new C4406k();
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC4519s
    Iterator<o05.InterfaceC4482k<E>> entryIterator() {
        return new toq();
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public Iterator<E> iterator() {
        return m58i.n7h(this);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int remove(@NullableDecl Object obj, int i2) {
        if (obj == null || !m15740k(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        C4524t.toq(i2, "occurrences");
        if (i2 == 0) {
            return count(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.f26202y;
        int i3 = iArr[iOrdinal];
        if (i3 == 0) {
            return 0;
        }
        if (i3 <= i2) {
            iArr[iOrdinal] = 0;
            this.f26201s--;
            this.f26200p -= (long) i3;
        } else {
            iArr[iOrdinal] = i3 - i2;
            this.f26200p -= (long) i2;
        }
        return i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public int size() {
        return C4746s.fu4(this.f26200p);
    }

    public static <E extends Enum<E>> hb<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        com.google.common.base.jk.m15380n(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        hb<E> hbVar = new hb<>(it.next().getDeclaringClass());
        nsb.m15905k(hbVar, iterable);
        return hbVar;
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int add(E e2, int i2) {
        checkIsE(e2);
        C4524t.toq(i2, "occurrences");
        if (i2 == 0) {
            return count(e2);
        }
        int iOrdinal = e2.ordinal();
        int i3 = this.f26202y[iOrdinal];
        long j2 = i2;
        long j3 = ((long) i3) + j2;
        com.google.common.base.jk.m15374h(j3 <= 2147483647L, "too many occurrences: %s", j3);
        this.f26202y[iOrdinal] = (int) j3;
        if (i3 == 0) {
            this.f26201s++;
        }
        this.f26200p += j2;
        return i3;
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public int setCount(E e2, int i2) {
        checkIsE(e2);
        C4524t.toq(i2, "count");
        int iOrdinal = e2.ordinal();
        int[] iArr = this.f26202y;
        int i3 = iArr[iOrdinal];
        iArr[iOrdinal] = i2;
        this.f26200p += (long) (i2 - i3);
        if (i3 == 0 && i2 > 0) {
            this.f26201s++;
        } else if (i3 > 0 && i2 == 0) {
            this.f26201s--;
        }
        return i3;
    }

    public static <E extends Enum<E>> hb<E> create(Iterable<E> iterable, Class<E> cls) {
        hb<E> hbVarCreate = create(cls);
        nsb.m15905k(hbVarCreate, iterable);
        return hbVarCreate;
    }
}
