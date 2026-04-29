package com.google.android.exoplayer2.util;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.y */
/* JADX INFO: compiled from: ConditionVariable.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3862y {

    /* JADX INFO: renamed from: k */
    private final InterfaceC3850n f23338k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f67158toq;

    public C3862y() {
        this(InterfaceC3850n.f23248k);
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m13762g() {
        if (this.f67158toq) {
            return false;
        }
        this.f67158toq = true;
        notifyAll();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m13763k() throws InterruptedException {
        while (!this.f67158toq) {
            wait();
        }
    }

    /* JADX INFO: renamed from: n */
    public synchronized boolean m13764n() {
        return this.f67158toq;
    }

    /* JADX INFO: renamed from: q */
    public synchronized boolean m13765q() {
        boolean z2;
        z2 = this.f67158toq;
        this.f67158toq = false;
        return z2;
    }

    public synchronized boolean toq(long j2) throws InterruptedException {
        if (j2 <= 0) {
            return this.f67158toq;
        }
        long jMo13575q = this.f23338k.mo13575q();
        long j3 = j2 + jMo13575q;
        if (j3 < jMo13575q) {
            m13763k();
        } else {
            while (!this.f67158toq && jMo13575q < j3) {
                wait(j3 - jMo13575q);
                jMo13575q = this.f23338k.mo13575q();
            }
        }
        return this.f67158toq;
    }

    public synchronized void zy() {
        boolean z2 = false;
        while (!this.f67158toq) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z2 = true;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public C3862y(InterfaceC3850n interfaceC3850n) {
        this.f23338k = interfaceC3850n;
    }
}
