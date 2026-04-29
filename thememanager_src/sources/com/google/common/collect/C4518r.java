package com.google.common.collect;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Queue;

/* JADX INFO: renamed from: com.google.common.collect.r */
/* JADX INFO: compiled from: ConsumingQueueIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
class C4518r<T> extends zy<T> {

    /* JADX INFO: renamed from: n */
    private final Queue<T> f26577n;

    C4518r(T... tArr) {
        ArrayDeque arrayDeque = new ArrayDeque(tArr.length);
        this.f26577n = arrayDeque;
        Collections.addAll(arrayDeque, tArr);
    }

    @Override // com.google.common.collect.zy
    /* JADX INFO: renamed from: k */
    public T mo15703k() {
        return this.f26577n.isEmpty() ? toq() : this.f26577n.remove();
    }

    C4518r(Queue<T> queue) {
        this.f26577n = (Queue) com.google.common.base.jk.a9(queue);
    }
}
