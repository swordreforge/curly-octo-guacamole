package com.google.android.exoplayer2.util;

import com.android.thememanager.util.yz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.p */
/* JADX INFO: compiled from: CopyOnWriteMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3852p<E> implements Iterable<E> {

    /* JADX INFO: renamed from: k */
    private final Object f23261k = new Object();

    /* JADX INFO: renamed from: q */
    @zy.o1t(yz.xk5)
    private final Map<E, Integer> f23263q = new HashMap();

    /* JADX INFO: renamed from: n */
    @zy.o1t(yz.xk5)
    private Set<E> f23262n = Collections.emptySet();

    /* JADX INFO: renamed from: g */
    @zy.o1t(yz.xk5)
    private List<E> f23260g = Collections.emptyList();

    public int count(E e2) {
        int iIntValue;
        synchronized (this.f23261k) {
            iIntValue = this.f23263q.containsKey(e2) ? this.f23263q.get(e2).intValue() : 0;
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f23261k) {
            set = this.f23262n;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f23261k) {
            it = this.f23260g.iterator();
        }
        return it;
    }

    /* JADX INFO: renamed from: k */
    public void m13715k(E e2) {
        synchronized (this.f23261k) {
            ArrayList arrayList = new ArrayList(this.f23260g);
            arrayList.add(e2);
            this.f23260g = Collections.unmodifiableList(arrayList);
            Integer num = this.f23263q.get(e2);
            if (num == null) {
                HashSet hashSet = new HashSet(this.f23262n);
                hashSet.add(e2);
                this.f23262n = Collections.unmodifiableSet(hashSet);
            }
            this.f23263q.put(e2, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public void toq(E e2) {
        synchronized (this.f23261k) {
            Integer num = this.f23263q.get(e2);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f23260g);
            arrayList.remove(e2);
            this.f23260g = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.f23263q.remove(e2);
                HashSet hashSet = new HashSet(this.f23262n);
                hashSet.remove(e2);
                this.f23262n = Collections.unmodifiableSet(hashSet);
            } else {
                this.f23263q.put(e2, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
