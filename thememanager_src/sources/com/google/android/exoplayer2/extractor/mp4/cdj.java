package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;
import zy.dd;

/* JADX INFO: compiled from: TrackFragment.java */
/* JADX INFO: loaded from: classes2.dex */
final class cdj {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public long f64068cdj;

    /* JADX INFO: renamed from: g */
    public int f19959g;

    /* JADX INFO: renamed from: h */
    public boolean f19960h;

    /* JADX INFO: renamed from: k */
    public zy f19961k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public boolean f64070ki;

    /* JADX INFO: renamed from: n */
    public int f19962n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    public C3372h f64073n7h;

    /* JADX INFO: renamed from: q */
    public long f19964q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public long f64075toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public boolean f64076x2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public long f64077zy;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public long[] f64069f7l8 = new long[0];

    /* JADX INFO: renamed from: y */
    public int[] f19966y = new int[0];

    /* JADX INFO: renamed from: s */
    public int[] f19965s = new int[0];

    /* JADX INFO: renamed from: p */
    public long[] f19963p = new long[0];

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public boolean[] f64072ld6 = new boolean[0];

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public boolean[] f64074qrj = new boolean[0];

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public final gvn7 f64071kja0 = new gvn7();

    public boolean f7l8(int i2) {
        return this.f64076x2 && this.f64074qrj[i2];
    }

    /* JADX INFO: renamed from: g */
    public void m11827g() {
        this.f19962n = 0;
        this.f64068cdj = 0L;
        this.f64070ki = false;
        this.f64076x2 = false;
        this.f19960h = false;
        this.f64073n7h = null;
    }

    /* JADX INFO: renamed from: k */
    public void m11828k(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        ld6Var.readFully(this.f64071kja0.m13598q(), 0, this.f64071kja0.m13591g());
        this.f64071kja0.n5r1(0);
        this.f19960h = false;
    }

    /* JADX INFO: renamed from: n */
    public void m11829n(int i2, int i3) {
        this.f19962n = i2;
        this.f19959g = i3;
        if (this.f19966y.length < i2) {
            this.f64069f7l8 = new long[i2];
            this.f19966y = new int[i2];
        }
        if (this.f19965s.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.f19965s = new int[i4];
            this.f19963p = new long[i4];
            this.f64072ld6 = new boolean[i4];
            this.f64074qrj = new boolean[i4];
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11830q(int i2) {
        this.f64071kja0.dd(i2);
        this.f64076x2 = true;
        this.f19960h = true;
    }

    public void toq(gvn7 gvn7Var) {
        gvn7Var.ld6(this.f64071kja0.m13598q(), 0, this.f64071kja0.m13591g());
        this.f64071kja0.n5r1(0);
        this.f19960h = false;
    }

    public long zy(int i2) {
        return this.f19963p[i2];
    }
}
