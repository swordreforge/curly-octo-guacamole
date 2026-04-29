package com.google.common.graph;

import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MapRetrievalCache.java */
/* JADX INFO: loaded from: classes2.dex */
class jp0y<K, V> extends fti<K, V> {

    /* JADX INFO: renamed from: q */
    @NullableDecl
    private transient C4626k<K, V> f26885q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @NullableDecl
    private transient C4626k<K, V> f68268zy;

    /* JADX INFO: renamed from: com.google.common.graph.jp0y$k */
    /* JADX INFO: compiled from: MapRetrievalCache.java */
    private static final class C4626k<K, V> {

        /* JADX INFO: renamed from: k */
        final K f26886k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final V f68269toq;

        C4626k(K k2, V v2) {
            this.f26886k = k2;
            this.f68269toq = v2;
        }
    }

    jp0y(Map<K, V> map) {
        super(map);
    }

    private void qrj(K k2, V v2) {
        x2(new C4626k<>(k2, v2));
    }

    private void x2(C4626k<K, V> c4626k) {
        this.f26885q = this.f68268zy;
        this.f68268zy = c4626k;
    }

    @Override // com.google.common.graph.fti
    protected V f7l8(@NullableDecl Object obj) {
        V v2 = (V) super.f7l8(obj);
        if (v2 != null) {
            return v2;
        }
        C4626k<K, V> c4626k = this.f68268zy;
        if (c4626k != null && c4626k.f26886k == obj) {
            return c4626k.f68269toq;
        }
        C4626k<K, V> c4626k2 = this.f26885q;
        if (c4626k2 == null || c4626k2.f26886k != obj) {
            return null;
        }
        x2(c4626k2);
        return c4626k2.f68269toq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.fti
    /* JADX INFO: renamed from: g */
    public V mo16216g(@NullableDecl Object obj) {
        V vF7l8 = f7l8(obj);
        if (vF7l8 != null) {
            return vF7l8;
        }
        V vM16221y = m16221y(obj);
        if (vM16221y != null) {
            qrj(obj, vM16221y);
        }
        return vM16221y;
    }

    @Override // com.google.common.graph.fti
    /* JADX INFO: renamed from: q */
    protected void mo16219q() {
        super.mo16219q();
        this.f68268zy = null;
        this.f26885q = null;
    }
}
