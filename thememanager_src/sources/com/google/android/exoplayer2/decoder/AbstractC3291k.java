package com.google.android.exoplayer2.decoder;

/* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.k */
/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3291k {

    /* JADX INFO: renamed from: k */
    private int f19564k;

    public final void f7l8(int i2) {
        this.f19564k = i2 | this.f19564k;
    }

    /* JADX INFO: renamed from: h */
    public final void m11565h(int i2) {
        this.f19564k = i2;
    }

    public final boolean kja0() {
        return ld6(1);
    }

    protected final boolean ld6(int i2) {
        return (this.f19564k & i2) == i2;
    }

    public final boolean n7h() {
        return ld6(4);
    }

    /* JADX INFO: renamed from: p */
    public final void m11566p(int i2) {
        this.f19564k = (~i2) & this.f19564k;
    }

    public final boolean qrj() {
        return ld6(Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: s */
    public void mo11567s() {
        this.f19564k = 0;
    }

    public final boolean x2() {
        return ld6(268435456);
    }
}
