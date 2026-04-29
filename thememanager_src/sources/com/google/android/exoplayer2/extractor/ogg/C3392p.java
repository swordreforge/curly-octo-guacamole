package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.a9;
import com.google.android.exoplayer2.extractor.ogg.AbstractC3394s;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import zy.dd;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.p */
/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3392p extends AbstractC3394s {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @dd
    private a9.C3333q f64354fn3e;

    /* JADX INFO: renamed from: i */
    private boolean f20131i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    @dd
    private k f64355ki;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f64356t8r;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    @dd
    private a9.toq f64357zurt;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.ogg.p$k */
    /* JADX INFO: compiled from: VorbisReader.java */
    static final class k {

        /* JADX INFO: renamed from: k */
        public final a9.C3333q f20132k;

        /* JADX INFO: renamed from: n */
        public final int f20133n;

        /* JADX INFO: renamed from: q */
        public final a9.zy[] f20134q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final a9.toq f64358toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final byte[] f64359zy;

        public k(a9.C3333q c3333q, a9.toq toqVar, byte[] bArr, a9.zy[] zyVarArr, int i2) {
            this.f20132k = c3333q;
            this.f64358toq = toqVar;
            this.f64359zy = bArr;
            this.f20134q = zyVarArr;
            this.f20133n = i2;
        }
    }

    C3392p() {
    }

    @yz
    /* JADX INFO: renamed from: h */
    static int m11909h(byte b2, int i2, int i3) {
        return (b2 >> i3) & (255 >>> (8 - i2));
    }

    public static boolean ki(gvn7 gvn7Var) {
        try {
            return a9.x2(1, gvn7Var, true);
        } catch (sok unused) {
            return false;
        }
    }

    private static int kja0(byte b2, k kVar) {
        return !kVar.f20134q[m11909h(b2, kVar.f20133n, 1)].f19747k ? kVar.f20132k.f63667f7l8 : kVar.f20132k.f19745y;
    }

    @yz
    static void n7h(gvn7 gvn7Var, long j2) {
        if (gvn7Var.toq() < gvn7Var.m13591g() + 4) {
            gvn7Var.x9kr(Arrays.copyOf(gvn7Var.m13598q(), gvn7Var.m13591g() + 4));
        } else {
            gvn7Var.m13595l(gvn7Var.m13591g() + 4);
        }
        byte[] bArrM13598q = gvn7Var.m13598q();
        bArrM13598q[gvn7Var.m13591g() - 4] = (byte) (j2 & 255);
        bArrM13598q[gvn7Var.m13591g() - 3] = (byte) ((j2 >>> 8) & 255);
        bArrM13598q[gvn7Var.m13591g() - 2] = (byte) ((j2 >>> 16) & 255);
        bArrM13598q[gvn7Var.m13591g() - 1] = (byte) ((j2 >>> 24) & 255);
    }

    @dd
    @yz
    k cdj(gvn7 gvn7Var) throws IOException {
        a9.C3333q c3333q = this.f64354fn3e;
        if (c3333q == null) {
            this.f64354fn3e = a9.m11677p(gvn7Var);
            return null;
        }
        a9.toq toqVar = this.f64357zurt;
        if (toqVar == null) {
            this.f64357zurt = a9.m11680y(gvn7Var);
            return null;
        }
        byte[] bArr = new byte[gvn7Var.m13591g()];
        System.arraycopy(gvn7Var.m13598q(), 0, bArr, 0, gvn7Var.m13591g());
        return new k(c3333q, toqVar, bArr, a9.ld6(gvn7Var, c3333q.f63668toq), a9.m11675k(r4.length - 1));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    /* JADX INFO: renamed from: g */
    protected long mo11910g(gvn7 gvn7Var) {
        if ((gvn7Var.m13598q()[0] & 1) == 1) {
            return -1L;
        }
        int iKja0 = kja0(gvn7Var.m13598q()[0], (k) C3844k.ld6(this.f64355ki));
        long j2 = this.f20131i ? (this.f64356t8r + iKja0) / 4 : 0;
        n7h(gvn7Var, j2);
        this.f20131i = true;
        this.f64356t8r = iKja0;
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    /* JADX INFO: renamed from: n */
    protected void mo11911n(long j2) {
        super.mo11911n(j2);
        this.f20131i = j2 != 0;
        a9.C3333q c3333q = this.f64354fn3e;
        this.f64356t8r = c3333q != null ? c3333q.f63667f7l8 : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: s */
    protected boolean mo11912s(gvn7 gvn7Var, long j2, AbstractC3394s.toq toqVar) throws IOException {
        if (this.f64355ki != null) {
            C3844k.f7l8(toqVar.f20147k);
            return false;
        }
        k kVarCdj = cdj(gvn7Var);
        this.f64355ki = kVarCdj;
        if (kVarCdj == null) {
            return true;
        }
        a9.C3333q c3333q = kVarCdj.f20132k;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3333q.f19742p);
        arrayList.add(kVarCdj.f64359zy);
        toqVar.f20147k = new xwq3.toq().m13945m(wvg.f23300f).jp0y(c3333q.f19741n).m13941e(c3333q.f19743q).gvn7(c3333q.f63668toq).ek5k(c3333q.f63669zy).hyr(arrayList).a9();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.AbstractC3394s
    protected void x2(boolean z2) {
        super.x2(z2);
        if (z2) {
            this.f64355ki = null;
            this.f64354fn3e = null;
            this.f64357zurt = null;
        }
        this.f64356t8r = 0;
        this.f20131i = false;
    }
}
