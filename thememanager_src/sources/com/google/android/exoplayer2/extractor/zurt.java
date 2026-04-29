package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.toq;
import com.google.android.exoplayer2.util.gvn7;
import java.io.EOFException;
import java.io.IOException;
import zy.dd;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zurt {

    /* JADX INFO: renamed from: k */
    private final gvn7 f20459k = new gvn7(10);

    @dd
    /* JADX INFO: renamed from: k */
    public Metadata m12057k(ld6 ld6Var, @dd toq.InterfaceC3499k interfaceC3499k) throws IOException {
        Metadata metadataM12318n = null;
        int i2 = 0;
        while (true) {
            try {
                ld6Var.fn3e(this.f20459k.m13598q(), 0, 10);
                this.f20459k.n5r1(0);
                if (this.f20459k.oc() != 4801587) {
                    break;
                }
                this.f20459k.hyr(3);
                int iFti = this.f20459k.fti();
                int i3 = iFti + 10;
                if (metadataM12318n == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f20459k.m13598q(), 0, bArr, 0, 10);
                    ld6Var.fn3e(bArr, 10, iFti);
                    metadataM12318n = new com.google.android.exoplayer2.metadata.id3.toq(interfaceC3499k).m12318n(bArr, i3);
                } else {
                    ld6Var.qrj(iFti);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        ld6Var.mo11730y();
        ld6Var.qrj(i2);
        return metadataM12318n;
    }
}
