package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PreFillQueue.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy {

    /* JADX INFO: renamed from: k */
    private final Map<C3041q, Integer> f18460k;

    /* JADX INFO: renamed from: q */
    private int f18461q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final List<C3041q> f62806toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f62807zy;

    public zy(Map<C3041q, Integer> map) {
        this.f18460k = map;
        this.f62806toq = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f62807zy += it.next().intValue();
        }
    }

    /* JADX INFO: renamed from: k */
    public int m10808k() {
        return this.f62807zy;
    }

    public boolean toq() {
        return this.f62807zy == 0;
    }

    public C3041q zy() {
        C3041q c3041q = this.f62806toq.get(this.f18461q);
        Integer num = this.f18460k.get(c3041q);
        if (num.intValue() == 1) {
            this.f18460k.remove(c3041q);
            this.f62806toq.remove(this.f18461q);
        } else {
            this.f18460k.put(c3041q, Integer.valueOf(num.intValue() - 1));
        }
        this.f62807zy--;
        this.f18461q = this.f62806toq.isEmpty() ? 0 : (this.f18461q + 1) % this.f62806toq.size();
        return c3041q;
    }
}
