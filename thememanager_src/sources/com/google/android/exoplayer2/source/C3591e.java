package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.C3293n;
import com.google.android.exoplayer2.decoder.C3297s;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.source.hb;
import com.google.android.exoplayer2.upstream.C3803k;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.e */
/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes2.dex */
class C3591e {

    /* JADX INFO: renamed from: y */
    private static final int f21449y = 32;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f65363f7l8;

    /* JADX INFO: renamed from: g */
    private k f21450g;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.upstream.toq f21451k;

    /* JADX INFO: renamed from: n */
    private k f21452n;

    /* JADX INFO: renamed from: q */
    private k f21453q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f65364toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.gvn7 f65365zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.e$k */
    /* JADX INFO: compiled from: SampleDataQueue.java */
    private static final class k {

        /* JADX INFO: renamed from: k */
        public final long f21454k;

        /* JADX INFO: renamed from: n */
        @zy.dd
        public k f21455n;

        /* JADX INFO: renamed from: q */
        @zy.dd
        public C3803k f21456q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final long f65366toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public boolean f65367zy;

        public k(long j2, int i2) {
            this.f21454k = j2;
            this.f65366toq = j2 + ((long) i2);
        }

        /* JADX INFO: renamed from: k */
        public k m12690k() {
            this.f21456q = null;
            k kVar = this.f21455n;
            this.f21455n = null;
            return kVar;
        }

        public void toq(C3803k c3803k, k kVar) {
            this.f21456q = c3803k;
            this.f21455n = kVar;
            this.f65367zy = true;
        }

        public int zy(long j2) {
            return ((int) (j2 - this.f21454k)) + this.f21456q.f66865toq;
        }
    }

    public C3591e(com.google.android.exoplayer2.upstream.toq toqVar) {
        this.f21451k = toqVar;
        int iMo13471g = toqVar.mo13471g();
        this.f65364toq = iMo13471g;
        this.f65365zy = new com.google.android.exoplayer2.util.gvn7(32);
        k kVar = new k(0L, iMo13471g);
        this.f21453q = kVar;
        this.f21452n = kVar;
        this.f21450g = kVar;
    }

    private void f7l8(int i2) {
        long j2 = this.f65363f7l8 + ((long) i2);
        this.f65363f7l8 = j2;
        k kVar = this.f21450g;
        if (j2 == kVar.f65366toq) {
            this.f21450g = kVar.f21455n;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m12682k(k kVar) {
        if (kVar.f65367zy) {
            k kVar2 = this.f21450g;
            boolean z2 = kVar2.f65367zy;
            int i2 = (z2 ? 1 : 0) + (((int) (kVar2.f21454k - kVar.f21454k)) / this.f65364toq);
            C3803k[] c3803kArr = new C3803k[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                c3803kArr[i3] = kVar.f21456q;
                kVar = kVar.m12690k();
            }
            this.f21451k.zy(c3803kArr);
        }
    }

    private static k ld6(k kVar, C3297s c3297s, hb.toq toqVar, com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        long j2 = toqVar.f65410toq;
        int iLvui = 1;
        gvn7Var.dd(1);
        k kVarM12683p = m12683p(kVar, j2, gvn7Var.m13598q(), 1);
        long j3 = j2 + 1;
        byte b2 = gvn7Var.m13598q()[0];
        boolean z2 = (b2 & 128) != 0;
        int i2 = b2 & 127;
        C3293n c3293n = c3297s.f19615n;
        byte[] bArr = c3293n.f19590k;
        if (bArr == null) {
            c3293n.f19590k = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        k kVarM12683p2 = m12683p(kVarM12683p, j3, c3293n.f19590k, i2);
        long j4 = j3 + ((long) i2);
        if (z2) {
            gvn7Var.dd(2);
            kVarM12683p2 = m12683p(kVarM12683p2, j4, gvn7Var.m13598q(), 2);
            j4 += 2;
            iLvui = gvn7Var.lvui();
        }
        int i3 = iLvui;
        int[] iArr = c3293n.f19593q;
        if (iArr == null || iArr.length < i3) {
            iArr = new int[i3];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c3293n.f19591n;
        if (iArr3 == null || iArr3.length < i3) {
            iArr3 = new int[i3];
        }
        int[] iArr4 = iArr3;
        if (z2) {
            int i4 = i3 * 6;
            gvn7Var.dd(i4);
            kVarM12683p2 = m12683p(kVarM12683p2, j4, gvn7Var.m13598q(), i4);
            j4 += (long) i4;
            gvn7Var.n5r1(0);
            for (int i5 = 0; i5 < i3; i5++) {
                iArr2[i5] = gvn7Var.lvui();
                iArr4[i5] = gvn7Var.eqxt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = toqVar.f21549k - ((int) (j4 - toqVar.f65410toq));
        }
        InterfaceC3401t.k kVar2 = (InterfaceC3401t.k) com.google.android.exoplayer2.util.lrht.ld6(toqVar.f65411zy);
        c3293n.zy(i3, iArr2, iArr4, kVar2.f64392toq, c3293n.f19590k, kVar2.f20167k, kVar2.f64393zy, kVar2.f20168q);
        long j5 = toqVar.f65410toq;
        int i6 = (int) (j4 - j5);
        toqVar.f65410toq = j5 + ((long) i6);
        toqVar.f21549k -= i6;
        return kVarM12683p2;
    }

    /* JADX INFO: renamed from: p */
    private static k m12683p(k kVar, long j2, byte[] bArr, int i2) {
        k kVarM12684q = m12684q(kVar, j2);
        int i3 = i2;
        while (i3 > 0) {
            int iMin = Math.min(i3, (int) (kVarM12684q.f65366toq - j2));
            System.arraycopy(kVarM12684q.f21456q.f23031k, kVarM12684q.zy(j2), bArr, i2 - i3, iMin);
            i3 -= iMin;
            j2 += (long) iMin;
            if (j2 == kVarM12684q.f65366toq) {
                kVarM12684q = kVarM12684q.f21455n;
            }
        }
        return kVarM12684q;
    }

    /* JADX INFO: renamed from: q */
    private static k m12684q(k kVar, long j2) {
        while (j2 >= kVar.f65366toq) {
            kVar = kVar.f21455n;
        }
        return kVar;
    }

    /* JADX INFO: renamed from: s */
    private static k m12685s(k kVar, long j2, ByteBuffer byteBuffer, int i2) {
        k kVarM12684q = m12684q(kVar, j2);
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (kVarM12684q.f65366toq - j2));
            byteBuffer.put(kVarM12684q.f21456q.f23031k, kVarM12684q.zy(j2), iMin);
            i2 -= iMin;
            j2 += (long) iMin;
            if (j2 == kVarM12684q.f65366toq) {
                kVarM12684q = kVarM12684q.f21455n;
            }
        }
        return kVarM12684q;
    }

    private static k x2(k kVar, C3297s c3297s, hb.toq toqVar, com.google.android.exoplayer2.util.gvn7 gvn7Var) {
        if (c3297s.fn3e()) {
            kVar = ld6(kVar, c3297s, toqVar, gvn7Var);
        }
        if (!c3297s.x2()) {
            c3297s.ki(toqVar.f21549k);
            return m12685s(kVar, toqVar.f65410toq, c3297s.f19612g, toqVar.f21549k);
        }
        gvn7Var.dd(4);
        k kVarM12683p = m12683p(kVar, toqVar.f65410toq, gvn7Var.m13598q(), 4);
        int iEqxt = gvn7Var.eqxt();
        toqVar.f65410toq += 4;
        toqVar.f21549k -= 4;
        c3297s.ki(iEqxt);
        k kVarM12685s = m12685s(kVarM12683p, toqVar.f65410toq, c3297s.f19612g, iEqxt);
        toqVar.f65410toq += (long) iEqxt;
        int i2 = toqVar.f21549k - iEqxt;
        toqVar.f21549k = i2;
        c3297s.ni7(i2);
        return m12685s(kVarM12685s, toqVar.f65410toq, c3297s.f19616p, toqVar.f21549k);
    }

    /* JADX INFO: renamed from: y */
    private int m12686y(int i2) {
        k kVar = this.f21450g;
        if (!kVar.f65367zy) {
            kVar.toq(this.f21451k.mo13472k(), new k(this.f21450g.f65366toq, this.f65364toq));
        }
        return Math.min(i2, (int) (this.f21450g.f65366toq - this.f65363f7l8));
    }

    public void cdj(com.google.android.exoplayer2.util.gvn7 gvn7Var, int i2) {
        while (i2 > 0) {
            int iM12686y = m12686y(i2);
            k kVar = this.f21450g;
            gvn7Var.ld6(kVar.f21456q.f23031k, kVar.zy(this.f65363f7l8), iM12686y);
            i2 -= iM12686y;
            f7l8(iM12686y);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12687g(C3297s c3297s, hb.toq toqVar) {
        x2(this.f21452n, c3297s, toqVar, this.f65365zy);
    }

    /* JADX INFO: renamed from: h */
    public int m12688h(com.google.android.exoplayer2.upstream.x2 x2Var, int i2, boolean z2) throws IOException {
        int iM12686y = m12686y(i2);
        k kVar = this.f21450g;
        int i3 = x2Var.read(kVar.f21456q.f23031k, kVar.zy(this.f65363f7l8), iM12686y);
        if (i3 != -1) {
            f7l8(i3);
            return i3;
        }
        if (z2) {
            return -1;
        }
        throw new EOFException();
    }

    public void kja0() {
        this.f21452n = this.f21453q;
    }

    /* JADX INFO: renamed from: n */
    public long m12689n() {
        return this.f65363f7l8;
    }

    public void n7h() {
        m12682k(this.f21453q);
        k kVar = new k(0L, this.f65364toq);
        this.f21453q = kVar;
        this.f21452n = kVar;
        this.f21450g = kVar;
        this.f65363f7l8 = 0L;
        this.f21451k.mo13473n();
    }

    public void qrj(C3297s c3297s, hb.toq toqVar) {
        this.f21452n = x2(this.f21452n, c3297s, toqVar, this.f65365zy);
    }

    public void toq(long j2) {
        k kVar;
        if (j2 == -1) {
            return;
        }
        while (true) {
            kVar = this.f21453q;
            if (j2 < kVar.f65366toq) {
                break;
            }
            this.f21451k.mo13474q(kVar.f21456q);
            this.f21453q = this.f21453q.m12690k();
        }
        if (this.f21452n.f21454k < kVar.f21454k) {
            this.f21452n = kVar;
        }
    }

    public void zy(long j2) {
        this.f65363f7l8 = j2;
        if (j2 != 0) {
            k kVar = this.f21453q;
            if (j2 != kVar.f21454k) {
                while (this.f65363f7l8 > kVar.f65366toq) {
                    kVar = kVar.f21455n;
                }
                k kVar2 = kVar.f21455n;
                m12682k(kVar2);
                k kVar3 = new k(kVar.f65366toq, this.f65364toq);
                kVar.f21455n = kVar3;
                if (this.f65363f7l8 == kVar.f65366toq) {
                    kVar = kVar3;
                }
                this.f21450g = kVar;
                if (this.f21452n == kVar2) {
                    this.f21452n = kVar3;
                    return;
                }
                return;
            }
        }
        m12682k(this.f21453q);
        k kVar4 = new k(this.f65363f7l8, this.f65364toq);
        this.f21453q = kVar4;
        this.f21452n = kVar4;
        this.f21450g = kVar4;
    }
}
