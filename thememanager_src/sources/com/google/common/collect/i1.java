package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: FilteredMultimapValues.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class i1<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: k */
    @Weak
    private final bf2<K, V> f26218k;

    i1(bf2<K, V> bf2Var) {
        this.f26218k = (bf2) com.google.common.base.jk.a9(bf2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f26218k.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return this.f26218k.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return vy.zsr0(this.f26218k.entries().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@NullableDecl Object obj) {
        com.google.common.base.a9<? super Map.Entry<K, V>> a9VarMo15585p = this.f26218k.mo15585p();
        Iterator<Map.Entry<K, V>> it = this.f26218k.toq().entries().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (a9VarMo15585p.apply(next) && C4280z.m15455k(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return nsb.oc(this.f26218k.toq().entries(), com.google.common.base.fti.m15348q(this.f26218k.mo15585p(), vy.i9jn(com.google.common.base.fti.n7h(collection))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return nsb.oc(this.f26218k.toq().entries(), com.google.common.base.fti.m15348q(this.f26218k.mo15585p(), vy.i9jn(com.google.common.base.fti.cdj(com.google.common.base.fti.n7h(collection)))));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f26218k.size();
    }
}
