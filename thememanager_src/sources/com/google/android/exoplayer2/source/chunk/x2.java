package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.Arrays;
import zy.dd;

/* JADX INFO: compiled from: DataChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x2 extends AbstractC3581g {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f65358x2 = 16384;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private volatile boolean f65359ld6;

    /* JADX INFO: renamed from: p */
    private byte[] f21423p;

    public x2(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, int i2, xwq3 xwq3Var, int i3, @dd Object obj, @dd byte[] bArr) {
        x2 x2Var;
        byte[] bArr2;
        super(kja0Var, t8rVar, i2, xwq3Var, i3, obj, C3548p.f65257toq, C3548p.f65257toq);
        if (bArr == null) {
            bArr2 = lrht.f23228g;
            x2Var = this;
        } else {
            x2Var = this;
            bArr2 = bArr;
        }
        x2Var.f21423p = bArr2;
    }

    /* JADX INFO: renamed from: s */
    private void m12675s(int i2) {
        byte[] bArr = this.f21423p;
        if (bArr.length < i2 + 16384) {
            this.f21423p = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    protected abstract void f7l8(byte[] bArr, int i2) throws IOException;

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    /* JADX INFO: renamed from: k */
    public final void mo12654k() throws IOException {
        try {
            this.f21369s.mo7270k(this.f65338toq);
            int i2 = 0;
            int i3 = 0;
            while (i2 != -1 && !this.f65359ld6) {
                m12675s(i3);
                i2 = this.f21369s.read(this.f21423p, i3, 16384);
                if (i2 != -1) {
                    i3 += i2;
                }
            }
            if (!this.f65359ld6) {
                f7l8(this.f21423p, i3);
            }
        } finally {
            com.google.android.exoplayer2.upstream.ki.m13484k(this.f21369s);
        }
    }

    /* JADX INFO: renamed from: y */
    public byte[] m12676y() {
        return this.f21423p;
    }

    @Override // com.google.android.exoplayer2.upstream.oc.InterfaceC3814n
    public final void zy() {
        this.f65359ld6 = true;
    }
}
