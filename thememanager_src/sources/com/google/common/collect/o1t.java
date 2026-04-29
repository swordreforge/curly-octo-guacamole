package com.google.common.collect;

import com.google.common.collect.se;
import com.google.common.math.C4723q;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: CartesianList.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class o1t<E> extends AbstractList<List<E>> implements RandomAccess {

    /* JADX INFO: renamed from: k */
    private final transient se<List<E>> f26495k;

    /* JADX INFO: renamed from: q */
    private final transient int[] f26496q;

    /* JADX INFO: renamed from: com.google.common.collect.o1t$k */
    /* JADX INFO: compiled from: CartesianList.java */
    class C4483k extends se<E> {
        final /* synthetic */ int val$index;

        C4483k(int i2) {
            this.val$index = i2;
        }

        @Override // java.util.List
        public E get(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            return (E) ((List) o1t.this.f26495k.get(i2)).get(o1t.this.m15917g(this.val$index, i2));
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return o1t.this.f26495k.size();
        }
    }

    o1t(se<List<E>> seVar) {
        this.f26495k = seVar;
        int[] iArr = new int[seVar.size() + 1];
        iArr[seVar.size()] = 1;
        try {
            for (int size = seVar.size() - 1; size >= 0; size--) {
                iArr[size] = C4723q.m16547q(iArr[size + 1], seVar.get(size).size());
            }
            this.f26496q = iArr;
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Cartesian product too large; must have size at most Integer.MAX_VALUE");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public int m15917g(int i2, int i3) {
        return (i2 / this.f26496q[i3 + 1]) % this.f26495k.get(i3).size();
    }

    static <E> List<List<E>> zy(List<? extends List<? extends E>> list) {
        se.C4520k c4520k = new se.C4520k(list.size());
        Iterator<? extends List<? extends E>> it = list.iterator();
        while (it.hasNext()) {
            se seVarCopyOf = se.copyOf((Collection) it.next());
            if (seVarCopyOf.isEmpty()) {
                return se.of();
            }
            c4520k.mo15569k(seVarCopyOf);
        }
        return new o1t(c4520k.mo15570n());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof List)) {
            return -1;
        }
        List list = (List) obj;
        if (list.size() != this.f26495k.size()) {
            return -1;
        }
        ListIterator<E> listIterator = list.listIterator();
        int i2 = 0;
        while (listIterator.hasNext()) {
            int iNextIndex = listIterator.nextIndex();
            int iIndexOf = this.f26495k.get(iNextIndex).indexOf(listIterator.next());
            if (iIndexOf == -1) {
                return -1;
            }
            i2 += iIndexOf * this.f26496q[iNextIndex + 1];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public se<E> get(int i2) {
        com.google.common.base.jk.mcp(i2, size());
        return new C4483k(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26496q[0];
    }
}
