package com.google.android.exoplayer2.decoder;

/* JADX INFO: compiled from: DecoderCounters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public int f63552f7l8;

    /* JADX INFO: renamed from: g */
    public int f19557g;

    /* JADX INFO: renamed from: k */
    public int f19558k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public int f63553ld6;

    /* JADX INFO: renamed from: n */
    public int f19559n;

    /* JADX INFO: renamed from: p */
    public long f19560p;

    /* JADX INFO: renamed from: q */
    public int f19561q;

    /* JADX INFO: renamed from: s */
    public int f19562s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f63554toq;

    /* JADX INFO: renamed from: y */
    public int f19563y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public int f63555zy;

    private void toq(long j2, int i2) {
        this.f19560p += j2;
        this.f63553ld6 += i2;
    }

    /* JADX INFO: renamed from: k */
    public void m11562k(long j2) {
        toq(j2, 1);
    }

    /* JADX INFO: renamed from: q */
    public void m11563q(f7l8 f7l8Var) {
        this.f19558k += f7l8Var.f19558k;
        this.f63554toq += f7l8Var.f63554toq;
        this.f63555zy += f7l8Var.f63555zy;
        this.f19561q += f7l8Var.f19561q;
        this.f19559n += f7l8Var.f19559n;
        this.f19557g += f7l8Var.f19557g;
        this.f63552f7l8 += f7l8Var.f63552f7l8;
        this.f19563y = Math.max(this.f19563y, f7l8Var.f19563y);
        this.f19562s += f7l8Var.f19562s;
        toq(f7l8Var.f19560p, f7l8Var.f63553ld6);
    }

    public synchronized void zy() {
    }
}
