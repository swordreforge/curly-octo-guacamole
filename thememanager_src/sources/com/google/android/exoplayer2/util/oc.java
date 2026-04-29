package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PriorityTaskManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class oc {

    /* JADX INFO: renamed from: k */
    private final Object f23259k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final PriorityQueue<Integer> f67067toq = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67068zy = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.oc$k */
    /* JADX INFO: compiled from: PriorityTaskManager.java */
    public static class C3851k extends IOException {
        public C3851k(int i2, int i3) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Priority too low [priority=");
            sb.append(i2);
            sb.append(", highest=");
            sb.append(i3);
            sb.append("]");
            super(sb.toString());
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13712k(int i2) {
        synchronized (this.f23259k) {
            this.f67067toq.add(Integer.valueOf(i2));
            this.f67068zy = Math.max(this.f67068zy, i2);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m13713n(int i2) {
        synchronized (this.f23259k) {
            this.f67067toq.remove(Integer.valueOf(i2));
            this.f67068zy = this.f67067toq.isEmpty() ? Integer.MIN_VALUE : ((Integer) lrht.ld6(this.f67067toq.peek())).intValue();
            this.f23259k.notifyAll();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m13714q(int i2) throws C3851k {
        synchronized (this.f23259k) {
            if (this.f67068zy != i2) {
                throw new C3851k(i2, this.f67068zy);
            }
        }
    }

    public void toq(int i2) throws InterruptedException {
        synchronized (this.f23259k) {
            while (this.f67068zy != i2) {
                this.f23259k.wait();
            }
        }
    }

    public boolean zy(int i2) {
        boolean z2;
        synchronized (this.f23259k) {
            z2 = this.f67068zy == i2;
        }
        return z2;
    }
}
