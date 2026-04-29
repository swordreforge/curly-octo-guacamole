package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import zy.dd;

/* JADX INFO: compiled from: TrueHdSampleRechunker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class mcp {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f63796f7l8;

    /* JADX INFO: renamed from: g */
    private int f19868g;

    /* JADX INFO: renamed from: k */
    private final byte[] f19869k = new byte[10];

    /* JADX INFO: renamed from: n */
    private int f19870n;

    /* JADX INFO: renamed from: q */
    private long f19871q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f63797toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f63798zy;

    /* JADX INFO: renamed from: k */
    public void m11781k(InterfaceC3401t interfaceC3401t, @dd InterfaceC3401t.k kVar) {
        if (this.f63798zy > 0) {
            interfaceC3401t.mo11930n(this.f19871q, this.f19870n, this.f19868g, this.f63796f7l8, kVar);
            this.f63798zy = 0;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11782q(ld6 ld6Var) throws IOException {
        if (this.f63797toq) {
            return;
        }
        ld6Var.fn3e(this.f19869k, 0, 10);
        ld6Var.mo11730y();
        if (com.google.android.exoplayer2.audio.toq.m11525s(this.f19869k) == 0) {
            return;
        }
        this.f63797toq = true;
    }

    public void toq() {
        this.f63797toq = false;
        this.f63798zy = 0;
    }

    public void zy(InterfaceC3401t interfaceC3401t, long j2, int i2, int i3, int i4, @dd InterfaceC3401t.k kVar) {
        C3844k.m13631p(this.f63796f7l8 <= i3 + i4, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f63797toq) {
            int i5 = this.f63798zy;
            int i6 = i5 + 1;
            this.f63798zy = i6;
            if (i5 == 0) {
                this.f19871q = j2;
                this.f19870n = i2;
                this.f19868g = 0;
            }
            this.f19868g += i3;
            this.f63796f7l8 = i4;
            if (i6 >= 16) {
                m11781k(interfaceC3401t, kVar);
            }
        }
    }
}
