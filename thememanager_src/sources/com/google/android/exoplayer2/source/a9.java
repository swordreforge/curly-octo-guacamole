package com.google.android.exoplayer2.source;

/* JADX INFO: compiled from: MediaPeriodId.java */
/* JADX INFO: loaded from: classes2.dex */
public class a9 {

    /* JADX INFO: renamed from: k */
    public final Object f21225k;

    /* JADX INFO: renamed from: n */
    public final int f21226n;

    /* JADX INFO: renamed from: q */
    public final long f21227q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f65325toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f65326zy;

    public a9(Object obj) {
        this(obj, -1L);
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9)) {
            return false;
        }
        a9 a9Var = (a9) obj;
        return this.f21225k.equals(a9Var.f21225k) && this.f65325toq == a9Var.f65325toq && this.f65326zy == a9Var.f65326zy && this.f21227q == a9Var.f21227q && this.f21226n == a9Var.f21226n;
    }

    public int hashCode() {
        return ((((((((527 + this.f21225k.hashCode()) * 31) + this.f65325toq) * 31) + this.f65326zy) * 31) + ((int) this.f21227q)) * 31) + this.f21226n;
    }

    /* JADX INFO: renamed from: k */
    public a9 mo12557k(Object obj) {
        return this.f21225k.equals(obj) ? this : new a9(obj, this.f65325toq, this.f65326zy, this.f21227q, this.f21226n);
    }

    public a9 toq(long j2) {
        return this.f21227q == j2 ? this : new a9(this.f21225k, this.f65325toq, this.f65326zy, j2, this.f21226n);
    }

    public boolean zy() {
        return this.f65325toq != -1;
    }

    public a9(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public a9(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }

    public a9(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    protected a9(a9 a9Var) {
        this.f21225k = a9Var.f21225k;
        this.f65325toq = a9Var.f65325toq;
        this.f65326zy = a9Var.f65326zy;
        this.f21227q = a9Var.f21227q;
        this.f21226n = a9Var.f21226n;
    }

    private a9(Object obj, int i2, int i3, long j2, int i4) {
        this.f21225k = obj;
        this.f65325toq = i2;
        this.f65326zy = i3;
        this.f21227q = j2;
        this.f21226n = i4;
    }
}
