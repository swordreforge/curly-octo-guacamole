package com.google.common.collect;

import com.google.common.collect.o05;
import com.google.common.primitives.C4746s;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RegularImmutableSortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class rp<E> extends uc<E> {

    @InterfaceC7732q
    final transient l05<E> elementSet;

    /* JADX INFO: renamed from: g */
    private final transient long[] f26580g;

    /* JADX INFO: renamed from: s */
    private final transient int f26581s;

    /* JADX INFO: renamed from: y */
    private final transient int f26582y;

    /* JADX INFO: renamed from: p */
    private static final long[] f26579p = {0};
    static final uc<Comparable> NATURAL_EMPTY_MULTISET = new rp(kx3.natural());

    rp(Comparator<? super E> comparator) {
        this.elementSet = ixz.emptySet(comparator);
        this.f26580g = f26579p;
        this.f26582y = 0;
        this.f26581s = 0;
    }

    /* JADX INFO: renamed from: n */
    private int m15979n(int i2) {
        long[] jArr = this.f26580g;
        int i3 = this.f26582y;
        return (int) (jArr[(i3 + i2) + 1] - jArr[i3 + i2]);
    }

    @Override // com.google.common.collect.o05
    public int count(@NullableDecl Object obj) {
        int iIndexOf = this.elementSet.indexOf(obj);
        if (iIndexOf >= 0) {
            return m15979n(iIndexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(0);
    }

    @Override // com.google.common.collect.b3e
    o05.InterfaceC4482k<E> getEntry(int i2) {
        return m58i.ld6(this.elementSet.asList().get(i2), m15979n(i2));
    }

    uc<E> getSubMultiset(int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i3, this.f26581s);
        return i2 == i3 ? uc.emptyMultiset(comparator()) : (i2 == 0 && i3 == this.f26581s) ? this : new rp(this.elementSet.getSubSet(i2, i3), this.f26580g, this.f26582y + i2, i3 - i2);
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return this.f26582y > 0 || this.f26581s < this.f26580g.length - 1;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return getEntry(this.f26581s - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public int size() {
        long[] jArr = this.f26580g;
        int i2 = this.f26582y;
        return C4746s.fu4(jArr[this.f26581s + i2] - jArr[i2]);
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.gb
    public uc<E> headMultiset(E e2, fu4 fu4Var) {
        return getSubMultiset(0, this.elementSet.headIndex(e2, com.google.common.base.jk.a9(fu4Var) == fu4.CLOSED));
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.gb
    public uc<E> tailMultiset(E e2, fu4 fu4Var) {
        return getSubMultiset(this.elementSet.tailIndex(e2, com.google.common.base.jk.a9(fu4Var) == fu4.CLOSED), this.f26581s);
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.b3e, com.google.common.collect.o05
    public ixz<E> elementSet() {
        return this.elementSet;
    }

    rp(l05<E> l05Var, long[] jArr, int i2, int i3) {
        this.elementSet = l05Var;
        this.f26580g = jArr;
        this.f26582y = i2;
        this.f26581s = i3;
    }
}
