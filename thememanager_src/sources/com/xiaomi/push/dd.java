package com.xiaomi.push;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class dd {

    /* JADX INFO: renamed from: k */
    private LinkedList<C5859k> f32801k = new LinkedList<>();

    /* JADX INFO: renamed from: com.xiaomi.push.dd$k */
    public static class C5859k {

        /* JADX INFO: renamed from: q */
        private static final dd f32802q = new dd();

        /* JADX INFO: renamed from: k */
        public int f32803k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f73308toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public Object f73309zy;

        C5859k(int i2, Object obj) {
            this.f32803k = i2;
            this.f73309zy = obj;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m20722q() {
        if (this.f32801k.size() > 100) {
            this.f32801k.removeFirst();
        }
    }

    public static dd toq() {
        return C5859k.f32802q;
    }

    /* JADX INFO: renamed from: k */
    public synchronized int m20723k() {
        return this.f32801k.size();
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m20724n(Object obj) {
        this.f32801k.add(new C5859k(0, obj));
        m20722q();
    }

    public synchronized LinkedList<C5859k> zy() {
        LinkedList<C5859k> linkedList;
        linkedList = this.f32801k;
        this.f32801k = new LinkedList<>();
        return linkedList;
    }
}
