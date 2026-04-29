package com.google.common.graph;

import com.google.common.collect.ab;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MultiEdgesConnecting.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class gvn7<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: k */
    private final Map<E, ?> f26872k;

    /* JADX INFO: renamed from: q */
    private final Object f26873q;

    /* JADX INFO: renamed from: com.google.common.graph.gvn7$k */
    /* JADX INFO: compiled from: MultiEdgesConnecting.java */
    class C4622k extends com.google.common.collect.zy<E> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Iterator f26875n;

        C4622k(Iterator it) {
            this.f26875n = it;
        }

        @Override // com.google.common.collect.zy
        /* JADX INFO: renamed from: k */
        protected E mo15703k() {
            while (this.f26875n.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f26875n.next();
                if (gvn7.this.f26873q.equals(entry.getValue())) {
                    return (E) entry.getKey();
                }
            }
            return toq();
        }
    }

    gvn7(Map<E, ?> map, Object obj) {
        this.f26872k = (Map) com.google.common.base.jk.a9(map);
        this.f26873q = com.google.common.base.jk.a9(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return this.f26873q.equals(this.f26872k.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public ab<E> iterator() {
        return new C4622k(this.f26872k.entrySet().iterator());
    }
}
