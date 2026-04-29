package com.google.common.collect;

import com.google.common.collect.b3e;
import com.google.common.collect.o05;
import com.google.common.primitives.C4746s;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: RegularImmutableMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
class o5<E> extends b3e<E> {
    static final o5<Object> EMPTY = new o5<>(ew.zy());
    final transient ew<E> contents;

    /* JADX INFO: renamed from: g */
    private final transient int f26497g;

    /* JADX INFO: renamed from: y */
    @LazyInit
    private transient vep5<E> f26498y;

    /* JADX INFO: compiled from: RegularImmutableMultiset.java */
    private final class toq extends ebn<E> {
        private toq() {
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return o5.this.contains(obj);
        }

        @Override // com.google.common.collect.ebn
        E get(int i2) {
            return o5.this.contents.m15662p(i2);
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return o5.this.contents.jk();
        }
    }

    /* JADX INFO: compiled from: RegularImmutableMultiset.java */
    @wlev.zy
    private static class zy implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        zy(o05<?> o05Var) {
            int size = o05Var.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i2 = 0;
            for (o05.InterfaceC4482k<?> interfaceC4482k : o05Var.entrySet()) {
                this.elements[i2] = interfaceC4482k.getElement();
                this.counts[i2] = interfaceC4482k.getCount();
                i2++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            b3e.toq toqVar = new b3e.toq(this.elements.length);
            int i2 = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i2 >= objArr.length) {
                    return toqVar.mo15570n();
                }
                toqVar.ld6(objArr[i2], this.counts[i2]);
                i2++;
            }
        }
    }

    o5(ew<E> ewVar) {
        this.contents = ewVar;
        long jX2 = 0;
        for (int i2 = 0; i2 < ewVar.jk(); i2++) {
            jX2 += (long) ewVar.x2(i2);
        }
        this.f26497g = C4746s.fu4(jX2);
    }

    @Override // com.google.common.collect.o05
    public int count(@NullableDecl Object obj) {
        return this.contents.f7l8(obj);
    }

    @Override // com.google.common.collect.b3e
    o05.InterfaceC4482k<E> getEntry(int i2) {
        return this.contents.m15663y(i2);
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public int size() {
        return this.f26497g;
    }

    @Override // com.google.common.collect.b3e, com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new zy(this);
    }

    @Override // com.google.common.collect.b3e, com.google.common.collect.o05
    public vep5<E> elementSet() {
        vep5<E> vep5Var = this.f26498y;
        if (vep5Var != null) {
            return vep5Var;
        }
        toq toqVar = new toq();
        this.f26498y = toqVar;
        return toqVar;
    }
}
