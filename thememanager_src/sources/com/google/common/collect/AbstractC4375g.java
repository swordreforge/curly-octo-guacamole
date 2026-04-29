package com.google.common.collect;

import com.google.common.collect.o05;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.g */
/* JADX INFO: compiled from: AbstractMapBasedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
abstract class AbstractC4375g<E> extends AbstractC4519s<E> implements Serializable {

    @wlev.zy
    private static final long serialVersionUID = 0;
    transient ew<E> backingMap;
    transient long size;

    /* JADX INFO: renamed from: com.google.common.collect.g$k */
    /* JADX INFO: compiled from: AbstractMapBasedMultiset.java */
    class k extends AbstractC4375g<E>.zy<E> {
        k() {
            super();
        }

        @Override // com.google.common.collect.AbstractC4375g.zy
        E toq(int i2) {
            return AbstractC4375g.this.backingMap.m15662p(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.g$toq */
    /* JADX INFO: compiled from: AbstractMapBasedMultiset.java */
    class toq extends AbstractC4375g<E>.zy<o05.InterfaceC4482k<E>> {
        toq() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC4375g.zy
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public o05.InterfaceC4482k<E> toq(int i2) {
            return AbstractC4375g.this.backingMap.m15663y(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.g$zy */
    /* JADX INFO: compiled from: AbstractMapBasedMultiset.java */
    abstract class zy<T> implements Iterator<T> {

        /* JADX INFO: renamed from: k */
        int f26142k;

        /* JADX INFO: renamed from: n */
        int f26143n;

        /* JADX INFO: renamed from: q */
        int f26144q = -1;

        zy() {
            this.f26142k = AbstractC4375g.this.backingMap.mo15657g();
            this.f26143n = AbstractC4375g.this.backingMap.f26100q;
        }

        /* JADX INFO: renamed from: k */
        private void m15688k() {
            if (AbstractC4375g.this.backingMap.f26100q != this.f26143n) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m15688k();
            return this.f26142k >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T qVar = toq(this.f26142k);
            int i2 = this.f26142k;
            this.f26144q = i2;
            this.f26142k = AbstractC4375g.this.backingMap.mo15659i(i2);
            return qVar;
        }

        @Override // java.util.Iterator
        public void remove() {
            m15688k();
            C4524t.m15984n(this.f26144q != -1);
            AbstractC4375g abstractC4375g = AbstractC4375g.this;
            abstractC4375g.size -= (long) abstractC4375g.backingMap.m15664z(this.f26144q);
            this.f26142k = AbstractC4375g.this.backingMap.fn3e(this.f26142k, this.f26144q);
            this.f26144q = -1;
            this.f26143n = AbstractC4375g.this.backingMap.f26100q;
        }

        abstract T toq(int i2);
    }

    AbstractC4375g(int i2) {
        init(i2);
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iM15650y = el.m15650y(objectInputStream);
        init(3);
        el.f7l8(this, objectInputStream, iM15650y);
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        el.ld6(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final int add(@NullableDecl E e2, int i2) {
        if (i2 == 0) {
            return count(e2);
        }
        com.google.common.base.jk.ld6(i2 > 0, "occurrences cannot be negative: %s", i2);
        int iN7h = this.backingMap.n7h(e2);
        if (iN7h == -1) {
            this.backingMap.zurt(e2, i2);
            this.size += (long) i2;
            return 0;
        }
        int iX2 = this.backingMap.x2(iN7h);
        long j2 = i2;
        long j3 = ((long) iX2) + j2;
        com.google.common.base.jk.m15374h(j3 <= 2147483647L, "too many occurrences: %s", j3);
        this.backingMap.mcp(iN7h, (int) j3);
        this.size += j2;
        return iX2;
    }

    void addTo(o05<? super E> o05Var) {
        com.google.common.base.jk.a9(o05Var);
        int iMo15657g = this.backingMap.mo15657g();
        while (iMo15657g >= 0) {
            o05Var.add(this.backingMap.m15662p(iMo15657g), this.backingMap.x2(iMo15657g));
            iMo15657g = this.backingMap.mo15659i(iMo15657g);
        }
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.backingMap.mo15660k();
        this.size = 0L;
    }

    @Override // com.google.common.collect.o05
    public final int count(@NullableDecl Object obj) {
        return this.backingMap.f7l8(obj);
    }

    @Override // com.google.common.collect.AbstractC4519s
    final int distinctElements() {
        return this.backingMap.jk();
    }

    @Override // com.google.common.collect.AbstractC4519s
    final Iterator<E> elementIterator() {
        return new k();
    }

    @Override // com.google.common.collect.AbstractC4519s
    final Iterator<o05.InterfaceC4482k<E>> entryIterator() {
        return new toq();
    }

    abstract void init(int i2);

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public final Iterator<E> iterator() {
        return m58i.n7h(this);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final int remove(@NullableDecl Object obj, int i2) {
        if (i2 == 0) {
            return count(obj);
        }
        com.google.common.base.jk.ld6(i2 > 0, "occurrences cannot be negative: %s", i2);
        int iN7h = this.backingMap.n7h(obj);
        if (iN7h == -1) {
            return 0;
        }
        int iX2 = this.backingMap.x2(iN7h);
        if (iX2 > i2) {
            this.backingMap.mcp(iN7h, iX2 - i2);
        } else {
            this.backingMap.m15664z(iN7h);
            i2 = iX2;
        }
        this.size -= (long) i2;
        return iX2;
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    @CanIgnoreReturnValue
    public final int setCount(@NullableDecl E e2, int i2) {
        C4524t.toq(i2, "count");
        ew<E> ewVar = this.backingMap;
        int iNi7 = i2 == 0 ? ewVar.ni7(e2) : ewVar.zurt(e2, i2);
        this.size += (long) (i2 - iNi7);
        return iNi7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public final int size() {
        return C4746s.fu4(this.size);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public final boolean setCount(@NullableDecl E e2, int i2, int i3) {
        C4524t.toq(i2, "oldCount");
        C4524t.toq(i3, "newCount");
        int iN7h = this.backingMap.n7h(e2);
        if (iN7h == -1) {
            if (i2 != 0) {
                return false;
            }
            if (i3 > 0) {
                this.backingMap.zurt(e2, i3);
                this.size += (long) i3;
            }
            return true;
        }
        if (this.backingMap.x2(iN7h) != i2) {
            return false;
        }
        if (i3 == 0) {
            this.backingMap.m15664z(iN7h);
            this.size -= (long) i2;
        } else {
            this.backingMap.mcp(iN7h, i3);
            this.size += (long) (i3 - i2);
        }
        return true;
    }
}
