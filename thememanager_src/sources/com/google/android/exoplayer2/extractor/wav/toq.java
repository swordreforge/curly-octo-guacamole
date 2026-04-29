package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.android.thememanager.router.recommend.entity.UICard;
import com.google.android.exoplayer2.audio.uv6;
import com.google.android.exoplayer2.extractor.InterfaceC3397p;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.extractor.fu4;
import com.google.android.exoplayer2.extractor.kja0;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.extractor.x2;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.gvn7;
import com.google.android.exoplayer2.util.lrht;
import com.google.android.exoplayer2.util.ni7;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.xwq3;
import com.miui.clock.module.toq;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: WavExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq implements InterfaceC3397p {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f64697cdj = 3;

    /* JADX INFO: renamed from: h */
    private static final int f20435h = 2;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int f64698ki = 4;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f64699kja0 = 1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f64700ld6 = "WavExtractor";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f64701n7h = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final kja0 f64702qrj = new kja0() { // from class: com.google.android.exoplayer2.extractor.wav.k
        @Override // com.google.android.exoplayer2.extractor.kja0
        public final InterfaceC3397p[] zy() {
            return toq.f7l8();
        }
    };

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f64703x2 = 10;

    /* JADX INFO: renamed from: n */
    private InterfaceC3401t f20437n;

    /* JADX INFO: renamed from: q */
    private x2 f20439q;

    /* JADX INFO: renamed from: y */
    private InterfaceC7955toq f20441y;

    /* JADX INFO: renamed from: g */
    private int f20436g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f64704f7l8 = -1;

    /* JADX INFO: renamed from: s */
    private int f20440s = -1;

    /* JADX INFO: renamed from: p */
    private long f20438p = -1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.wav.toq$k */
    /* JADX INFO: compiled from: WavExtractor.java */
    private static final class C3428k implements InterfaceC7955toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final int f64707f7l8;

        /* JADX INFO: renamed from: g */
        private final gvn7 f20442g;

        /* JADX INFO: renamed from: k */
        private final x2 f20443k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f64708ld6;

        /* JADX INFO: renamed from: n */
        private final byte[] f20444n;

        /* JADX INFO: renamed from: p */
        private long f20445p;

        /* JADX INFO: renamed from: q */
        private final int f20446q;

        /* JADX INFO: renamed from: s */
        private int f20447s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC3401t f64709toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private long f64710x2;

        /* JADX INFO: renamed from: y */
        private final xwq3 f20448y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.wav.zy f64711zy;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int[] f64706qrj = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int[] f64705n7h = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, UICard.RECOMMEND_BOTTOM_LARGE_ICON_ITEM, 157, 173, 190, toq.zy.f29237p, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        public C3428k(x2 x2Var, InterfaceC3401t interfaceC3401t, com.google.android.exoplayer2.extractor.wav.zy zyVar) throws sok {
            this.f20443k = x2Var;
            this.f64709toq = interfaceC3401t;
            this.f64711zy = zyVar;
            int iMax = Math.max(1, zyVar.f64717zy / 10);
            this.f64707f7l8 = iMax;
            gvn7 gvn7Var = new gvn7(zyVar.f64715f7l8);
            gvn7Var.m13603z();
            int iM13603z = gvn7Var.m13603z();
            this.f20446q = iM13603z;
            int i2 = zyVar.f64716toq;
            int i3 = (((zyVar.f20456n - (i2 * 4)) * 8) / (zyVar.f20454g * i2)) + 1;
            if (iM13603z == i3) {
                int iQrj = lrht.qrj(iMax, iM13603z);
                this.f20444n = new byte[zyVar.f20456n * iQrj];
                this.f20442g = new gvn7(iQrj * m12055y(iM13603z, i2));
                int i4 = ((zyVar.f64717zy * zyVar.f20456n) * 8) / iM13603z;
                this.f20448y = new xwq3.toq().m13945m(wvg.f67095d3).jp0y(i4).m13941e(i4).lrht(m12055y(iMax, i2)).gvn7(zyVar.f64716toq).ek5k(zyVar.f64717zy).vyq(2).a9();
                return;
            }
            StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(i3);
            sb.append("; got: ");
            sb.append(iM13603z);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }

        private int f7l8(int i2) {
            return m12055y(i2, this.f64711zy.f64716toq);
        }

        /* JADX INFO: renamed from: g */
        private int m12051g(int i2) {
            return i2 / (this.f64711zy.f64716toq * 2);
        }

        /* JADX INFO: renamed from: n */
        private void m12052n(byte[] bArr, int i2, int i3, byte[] bArr2) {
            com.google.android.exoplayer2.extractor.wav.zy zyVar = this.f64711zy;
            int i4 = zyVar.f20456n;
            int i5 = zyVar.f64716toq;
            int i6 = (i2 * i4) + (i3 * 4);
            int i7 = (i5 * 4) + i6;
            int i8 = (i4 / i5) - 4;
            int iT8r = (short) (((bArr[i6 + 1] & 255) << 8) | (bArr[i6] & 255));
            int iMin = Math.min(bArr[i6 + 2] & 255, 88);
            int i9 = f64705n7h[iMin];
            int i10 = ((i2 * this.f20446q * i5) + i3) * 2;
            bArr2[i10] = (byte) (iT8r & 255);
            bArr2[i10 + 1] = (byte) (iT8r >> 8);
            for (int i11 = 0; i11 < i8 * 2; i11++) {
                int i12 = bArr[((i11 / 8) * i5 * 4) + i7 + ((i11 / 2) % 4)] & 255;
                int i13 = i11 % 2 == 0 ? i12 & 15 : i12 >> 4;
                int i14 = ((((i13 & 7) * 2) + 1) * i9) >> 3;
                if ((i13 & 8) != 0) {
                    i14 = -i14;
                }
                iT8r = lrht.t8r(iT8r + i14, -32768, 32767);
                i10 += i5 * 2;
                bArr2[i10] = (byte) (iT8r & 255);
                bArr2[i10 + 1] = (byte) (iT8r >> 8);
                int i15 = iMin + f64706qrj[i13];
                int[] iArr = f64705n7h;
                iMin = lrht.t8r(i15, 0, iArr.length - 1);
                i9 = iArr[iMin];
            }
        }

        /* JADX INFO: renamed from: q */
        private void m12053q(byte[] bArr, int i2, gvn7 gvn7Var) {
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < this.f64711zy.f64716toq; i4++) {
                    m12052n(bArr, i3, i4, gvn7Var.m13598q());
                }
            }
            int iF7l8 = f7l8(this.f20446q * i2);
            gvn7Var.n5r1(0);
            gvn7Var.m13595l(iF7l8);
        }

        /* JADX INFO: renamed from: s */
        private void m12054s(int i2) {
            long jKtq = this.f20445p + lrht.ktq(this.f64710x2, 1000000L, this.f64711zy.f64717zy);
            int iF7l8 = f7l8(i2);
            this.f64709toq.mo11930n(jKtq, 1, iF7l8, this.f64708ld6 - iF7l8, null);
            this.f64710x2 += (long) i2;
            this.f64708ld6 -= iF7l8;
        }

        /* JADX INFO: renamed from: y */
        private static int m12055y(int i2, int i3) {
            return i2 * 2 * i3;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.toq.InterfaceC7955toq
        /* JADX INFO: renamed from: k */
        public void mo12056k(int i2, long j2) {
            this.f20443k.cdj(new C3426n(this.f64711zy, this.f20446q, i2, j2));
            this.f64709toq.mo11931q(this.f20448y);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0035 -> B:4:0x001b). Please report as a decompilation issue!!! */
        @Override // com.google.android.exoplayer2.extractor.wav.toq.InterfaceC7955toq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean toq(com.google.android.exoplayer2.extractor.ld6 r7, long r8) throws java.io.IOException {
            /*
                r6 = this;
                int r0 = r6.f64707f7l8
                int r1 = r6.f64708ld6
                int r1 = r6.m12051g(r1)
                int r0 = r0 - r1
                int r1 = r6.f20446q
                int r0 = com.google.android.exoplayer2.util.lrht.qrj(r0, r1)
                com.google.android.exoplayer2.extractor.wav.zy r1 = r6.f64711zy
                int r1 = r1.f20456n
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f20447s
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f20444n
                int r5 = r6.f20447s
                int r3 = r7.read(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f20447s
                int r4 = r4 + r3
                r6.f20447s = r4
                goto L1e
            L3e:
                int r7 = r6.f20447s
                com.google.android.exoplayer2.extractor.wav.zy r8 = r6.f64711zy
                int r8 = r8.f20456n
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f20444n
                com.google.android.exoplayer2.util.gvn7 r9 = r6.f20442g
                r6.m12053q(r8, r7, r9)
                int r8 = r6.f20447s
                com.google.android.exoplayer2.extractor.wav.zy r9 = r6.f64711zy
                int r9 = r9.f20456n
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f20447s = r8
                com.google.android.exoplayer2.util.gvn7 r7 = r6.f20442g
                int r7 = r7.m13591g()
                com.google.android.exoplayer2.extractor.t r8 = r6.f64709toq
                com.google.android.exoplayer2.util.gvn7 r9 = r6.f20442g
                r8.zy(r9, r7)
                int r8 = r6.f64708ld6
                int r8 = r8 + r7
                r6.f64708ld6 = r8
                int r7 = r6.m12051g(r8)
                int r8 = r6.f64707f7l8
                if (r7 < r8) goto L75
                r6.m12054s(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f64708ld6
                int r7 = r6.m12051g(r7)
                if (r7 <= 0) goto L82
                r6.m12054s(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.wav.toq.C3428k.toq(com.google.android.exoplayer2.extractor.ld6, long):boolean");
        }

        @Override // com.google.android.exoplayer2.extractor.wav.toq.InterfaceC7955toq
        public void zy(long j2) {
            this.f20447s = 0;
            this.f20445p = j2;
            this.f64708ld6 = 0;
            this.f64710x2 = 0L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.wav.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WavExtractor.java */
    private interface InterfaceC7955toq {
        /* JADX INFO: renamed from: k */
        void mo12056k(int i2, long j2) throws sok;

        boolean toq(ld6 ld6Var, long j2) throws IOException;

        void zy(long j2);
    }

    /* JADX INFO: compiled from: WavExtractor.java */
    private static final class zy implements InterfaceC7955toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f64712f7l8;

        /* JADX INFO: renamed from: g */
        private long f20449g;

        /* JADX INFO: renamed from: k */
        private final x2 f20450k;

        /* JADX INFO: renamed from: n */
        private final int f20451n;

        /* JADX INFO: renamed from: q */
        private final xwq3 f20452q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC3401t f64713toq;

        /* JADX INFO: renamed from: y */
        private long f20453y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.android.exoplayer2.extractor.wav.zy f64714zy;

        public zy(x2 x2Var, InterfaceC3401t interfaceC3401t, com.google.android.exoplayer2.extractor.wav.zy zyVar, String str, int i2) throws sok {
            this.f20450k = x2Var;
            this.f64713toq = interfaceC3401t;
            this.f64714zy = zyVar;
            int i3 = (zyVar.f64716toq * zyVar.f20454g) / 8;
            int i4 = zyVar.f20456n;
            if (i4 == i3) {
                int i5 = zyVar.f64717zy;
                int i6 = i5 * i3 * 8;
                int iMax = Math.max(i3, (i5 * i3) / 10);
                this.f20451n = iMax;
                this.f20452q = new xwq3.toq().m13945m(str).jp0y(i6).m13941e(i6).lrht(iMax).gvn7(zyVar.f64716toq).ek5k(zyVar.f64717zy).vyq(i2).a9();
                return;
            }
            StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(i3);
            sb.append("; got: ");
            sb.append(i4);
            throw sok.createForMalformedContainer(sb.toString(), null);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.toq.InterfaceC7955toq
        /* JADX INFO: renamed from: k */
        public void mo12056k(int i2, long j2) {
            this.f20450k.cdj(new C3426n(this.f64714zy, 1, i2, j2));
            this.f64713toq.mo11931q(this.f20452q);
        }

        @Override // com.google.android.exoplayer2.extractor.wav.toq.InterfaceC7955toq
        public boolean toq(ld6 ld6Var, long j2) throws IOException {
            int i2;
            int i3;
            long j3 = j2;
            while (j3 > 0 && (i2 = this.f64712f7l8) < (i3 = this.f20451n)) {
                int qVar = this.f64713toq.toq(ld6Var, (int) Math.min(i3 - i2, j3), true);
                if (qVar == -1) {
                    j3 = 0;
                } else {
                    this.f64712f7l8 += qVar;
                    j3 -= (long) qVar;
                }
            }
            int i4 = this.f64714zy.f20456n;
            int i5 = this.f64712f7l8 / i4;
            if (i5 > 0) {
                long jKtq = this.f20449g + lrht.ktq(this.f20453y, 1000000L, r1.f64717zy);
                int i6 = i5 * i4;
                int i7 = this.f64712f7l8 - i6;
                this.f64713toq.mo11930n(jKtq, 1, i6, i7, null);
                this.f20453y += (long) i5;
                this.f64712f7l8 = i7;
            }
            return j3 <= 0;
        }

        @Override // com.google.android.exoplayer2.extractor.wav.toq.InterfaceC7955toq
        public void zy(long j2) {
            this.f20449g = j2;
            this.f64712f7l8 = 0;
            this.f20453y = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC3397p[] f7l8() {
        return new InterfaceC3397p[]{new toq()};
    }

    @EnsuresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: g */
    private void m12046g() {
        C3844k.ld6(this.f20437n);
        lrht.ld6(this.f20439q);
    }

    private int ld6(ld6 ld6Var) throws IOException {
        C3844k.m13633s(this.f20438p != -1);
        return ((InterfaceC7955toq) C3844k.f7l8(this.f20441y)).toq(ld6Var, this.f20438p - ld6Var.getPosition()) ? -1 : 0;
    }

    /* JADX INFO: renamed from: p */
    private void m12048p(ld6 ld6Var) throws IOException {
        this.f64704f7l8 = C3427q.zy(ld6Var);
        this.f20436g = 2;
    }

    @RequiresNonNull({"extractorOutput", "trackOutput"})
    /* JADX INFO: renamed from: s */
    private void m12049s(ld6 ld6Var) throws IOException {
        com.google.android.exoplayer2.extractor.wav.zy qVar = C3427q.toq(ld6Var);
        int i2 = qVar.f20455k;
        if (i2 == 17) {
            this.f20441y = new C3428k(this.f20439q, this.f20437n, qVar);
        } else if (i2 == 6) {
            this.f20441y = new zy(this.f20439q, this.f20437n, qVar, wvg.f67130oc, -1);
        } else if (i2 == 7) {
            this.f20441y = new zy(this.f20439q, this.f20437n, qVar, wvg.f67100eqxt, -1);
        } else {
            int iM11527k = uv6.m11527k(i2, qVar.f20454g);
            if (iM11527k == 0) {
                int i3 = qVar.f20455k;
                StringBuilder sb = new StringBuilder(40);
                sb.append("Unsupported WAV format type: ");
                sb.append(i3);
                throw sok.createForUnsupportedContainerFeature(sb.toString());
            }
            this.f20441y = new zy(this.f20439q, this.f20437n, qVar, wvg.f67095d3, iM11527k);
        }
        this.f20436g = 3;
    }

    private void x2(ld6 ld6Var) throws IOException {
        Pair<Long, Long> pairM12043n = C3427q.m12043n(ld6Var);
        this.f20440s = ((Long) pairM12043n.first).intValue();
        long jLongValue = ((Long) pairM12043n.second).longValue();
        long j2 = this.f64704f7l8;
        if (j2 != -1 && jLongValue == 4294967295L) {
            jLongValue = j2;
        }
        this.f20438p = ((long) this.f20440s) + jLongValue;
        long length = ld6Var.getLength();
        if (length != -1) {
            long j3 = this.f20438p;
            if (j3 > length) {
                StringBuilder sb = new StringBuilder(69);
                sb.append("Data exceeds input length: ");
                sb.append(j3);
                sb.append(", ");
                sb.append(length);
                ni7.qrj(f64700ld6, sb.toString());
                this.f20438p = length;
            }
        }
        ((InterfaceC7955toq) C3844k.f7l8(this.f20441y)).mo12056k(this.f20440s, this.f20438p);
        this.f20436g = 4;
    }

    /* JADX INFO: renamed from: y */
    private void m12050y(ld6 ld6Var) throws IOException {
        C3844k.m13633s(ld6Var.getPosition() == 0);
        int i2 = this.f20440s;
        if (i2 != -1) {
            ld6Var.cdj(i2);
            this.f20436g = 4;
        } else {
            if (!C3427q.m12042k(ld6Var)) {
                throw sok.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            ld6Var.cdj((int) (ld6Var.x2() - ld6Var.getPosition()));
            this.f20436g = 1;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: k */
    public void mo11688k(long j2, long j3) {
        this.f20436g = j2 == 0 ? 0 : 4;
        InterfaceC7955toq interfaceC7955toq = this.f20441y;
        if (interfaceC7955toq != null) {
            interfaceC7955toq.zy(j3);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    /* JADX INFO: renamed from: q */
    public void mo11689q(x2 x2Var) {
        this.f20439q = x2Var;
        this.f20437n = x2Var.toq(0, 1);
        x2Var.mo11753i();
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public void release() {
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public boolean toq(ld6 ld6Var) throws IOException {
        return C3427q.m12042k(ld6Var);
    }

    @Override // com.google.android.exoplayer2.extractor.InterfaceC3397p
    public int zy(ld6 ld6Var, fu4 fu4Var) throws IOException {
        m12046g();
        int i2 = this.f20436g;
        if (i2 == 0) {
            m12050y(ld6Var);
            return 0;
        }
        if (i2 == 1) {
            m12048p(ld6Var);
            return 0;
        }
        if (i2 == 2) {
            m12049s(ld6Var);
            return 0;
        }
        if (i2 == 3) {
            x2(ld6Var);
            return 0;
        }
        if (i2 == 4) {
            return ld6(ld6Var);
        }
        throw new IllegalStateException();
    }
}
