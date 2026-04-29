package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.qrj;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import zy.dd;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.y */
/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes2.dex */
class C3012y<K extends qrj, V> {

    /* JADX INFO: renamed from: k */
    private final k<K, V> f18286k = new k<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<K, k<K, V>> f62724toq = new HashMap();

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.y$k */
    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    private static class k<K, V> {

        /* JADX INFO: renamed from: k */
        final K f18287k;

        /* JADX INFO: renamed from: q */
        k<K, V> f18288q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private List<V> f62725toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        k<K, V> f62726zy;

        k() {
            this(null);
        }

        /* JADX INFO: renamed from: k */
        public void m10706k(V v2) {
            if (this.f62725toq == null) {
                this.f62725toq = new ArrayList();
            }
            this.f62725toq.add(v2);
        }

        @dd
        public V toq() {
            int iZy = zy();
            if (iZy > 0) {
                return this.f62725toq.remove(iZy - 1);
            }
            return null;
        }

        public int zy() {
            List<V> list = this.f62725toq;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        k(K k2) {
            this.f18288q = this;
            this.f62726zy = this;
            this.f18287k = k2;
        }
    }

    C3012y() {
    }

    private static <K, V> void f7l8(k<K, V> kVar) {
        kVar.f62726zy.f18288q = kVar;
        kVar.f18288q.f62726zy = kVar;
    }

    /* JADX INFO: renamed from: n */
    private static <K, V> void m10702n(k<K, V> kVar) {
        k<K, V> kVar2 = kVar.f18288q;
        kVar2.f62726zy = kVar.f62726zy;
        kVar.f62726zy.f18288q = kVar2;
    }

    private void toq(k<K, V> kVar) {
        m10702n(kVar);
        k<K, V> kVar2 = this.f18286k;
        kVar.f18288q = kVar2;
        kVar.f62726zy = kVar2.f62726zy;
        f7l8(kVar);
    }

    private void zy(k<K, V> kVar) {
        m10702n(kVar);
        k<K, V> kVar2 = this.f18286k;
        kVar.f18288q = kVar2.f18288q;
        kVar.f62726zy = kVar2;
        f7l8(kVar);
    }

    @dd
    /* JADX INFO: renamed from: g */
    public V m10703g() {
        for (k kVar = this.f18286k.f18288q; !kVar.equals(this.f18286k); kVar = kVar.f18288q) {
            V v2 = (V) kVar.toq();
            if (v2 != null) {
                return v2;
            }
            m10702n(kVar);
            this.f62724toq.remove(kVar.f18287k);
            ((qrj) kVar.f18287k).mo10675k();
        }
        return null;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public V m10704k(K k2) {
        k<K, V> kVar = this.f62724toq.get(k2);
        if (kVar == null) {
            kVar = new k<>(k2);
            this.f62724toq.put(k2, kVar);
        } else {
            k2.mo10675k();
        }
        toq(kVar);
        return kVar.toq();
    }

    /* JADX INFO: renamed from: q */
    public void m10705q(K k2, V v2) {
        k<K, V> kVar = this.f62724toq.get(k2);
        if (kVar == null) {
            kVar = new k<>(k2);
            zy(kVar);
            this.f62724toq.put(k2, kVar);
        } else {
            k2.mo10675k();
        }
        kVar.m10706k(v2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z2 = false;
        for (k kVar = this.f18286k.f62726zy; !kVar.equals(this.f18286k); kVar = kVar.f62726zy) {
            z2 = true;
            sb.append('{');
            sb.append(kVar.f18287k);
            sb.append(':');
            sb.append(kVar.zy());
            sb.append("}, ");
        }
        if (z2) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
