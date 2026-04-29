package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.sok;
import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.util.ArrayDeque;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.k */
/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3357k implements zy {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f63803kja0 = 8;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f63804ld6 = 4;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f63805n7h = 4;

    /* JADX INFO: renamed from: p */
    private static final int f19878p = 2;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f63806qrj = 8;

    /* JADX INFO: renamed from: s */
    private static final int f19879s = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f63807x2 = 8;

    /* JADX INFO: renamed from: y */
    private static final int f19880y = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f63808f7l8;

    /* JADX INFO: renamed from: g */
    private int f19881g;

    /* JADX INFO: renamed from: n */
    private int f19883n;

    /* JADX INFO: renamed from: q */
    private com.google.android.exoplayer2.extractor.mkv.toq f19884q;

    /* JADX INFO: renamed from: k */
    private final byte[] f19882k = new byte[8];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ArrayDeque<toq> f63809toq = new ArrayDeque<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final f7l8 f63810zy = new f7l8();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mkv.k$toq */
    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        private final int f19885k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f63811toq;

        private toq(int i2, long j2) {
            this.f19885k = i2;
            this.f63811toq = j2;
        }
    }

    /* JADX INFO: renamed from: g */
    private static String m11787g(ld6 ld6Var, int i2) throws IOException {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        ld6Var.readFully(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    /* JADX INFO: renamed from: n */
    private long m11788n(ld6 ld6Var, int i2) throws IOException {
        ld6Var.readFully(this.f19882k, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | ((long) (this.f19882k[i3] & 255));
        }
        return j2;
    }

    /* JADX INFO: renamed from: q */
    private double m11789q(ld6 ld6Var, int i2) throws IOException {
        return i2 == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(m11788n(ld6Var, i2));
    }

    @RequiresNonNull({"processor"})
    private long zy(ld6 ld6Var) throws IOException {
        ld6Var.mo11730y();
        while (true) {
            ld6Var.fn3e(this.f19882k, 0, 4);
            int iZy = f7l8.zy(this.f19882k[0]);
            if (iZy != -1 && iZy <= 4) {
                int iM11783k = (int) f7l8.m11783k(this.f19882k, iZy, false);
                if (this.f19884q.mo11810n(iM11783k)) {
                    ld6Var.cdj(iZy);
                    return iM11783k;
                }
            }
            ld6Var.cdj(1);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.zy
    /* JADX INFO: renamed from: k */
    public boolean mo11790k(ld6 ld6Var) throws IOException {
        C3844k.ld6(this.f19884q);
        while (true) {
            toq toqVarPeek = this.f63809toq.peek();
            if (toqVarPeek != null && ld6Var.getPosition() >= toqVarPeek.f63811toq) {
                this.f19884q.mo11809k(this.f63809toq.pop().f19885k);
                return true;
            }
            if (this.f19883n == 0) {
                long jM11785q = this.f63810zy.m11785q(ld6Var, true, false, 4);
                if (jM11785q == -2) {
                    jM11785q = zy(ld6Var);
                }
                if (jM11785q == -1) {
                    return false;
                }
                this.f19881g = (int) jM11785q;
                this.f19883n = 1;
            }
            if (this.f19883n == 1) {
                this.f63808f7l8 = this.f63810zy.m11785q(ld6Var, false, true, 8);
                this.f19883n = 2;
            }
            int iMo11811q = this.f19884q.mo11811q(this.f19881g);
            if (iMo11811q != 0) {
                if (iMo11811q == 1) {
                    long position = ld6Var.getPosition();
                    this.f63809toq.push(new toq(this.f19881g, this.f63808f7l8 + position));
                    this.f19884q.mo11812y(this.f19881g, position, this.f63808f7l8);
                    this.f19883n = 0;
                    return true;
                }
                if (iMo11811q == 2) {
                    long j2 = this.f63808f7l8;
                    if (j2 <= 8) {
                        this.f19884q.zy(this.f19881g, m11788n(ld6Var, (int) j2));
                        this.f19883n = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw sok.createForMalformedContainer(sb.toString(), null);
                }
                if (iMo11811q == 3) {
                    long j3 = this.f63808f7l8;
                    if (j3 <= 2147483647L) {
                        this.f19884q.f7l8(this.f19881g, m11787g(ld6Var, (int) j3));
                        this.f19883n = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder(41);
                    sb2.append("String element size: ");
                    sb2.append(j3);
                    throw sok.createForMalformedContainer(sb2.toString(), null);
                }
                if (iMo11811q == 4) {
                    this.f19884q.mo11808g(this.f19881g, (int) this.f63808f7l8, ld6Var);
                    this.f19883n = 0;
                    return true;
                }
                if (iMo11811q != 5) {
                    StringBuilder sb3 = new StringBuilder(32);
                    sb3.append("Invalid element type ");
                    sb3.append(iMo11811q);
                    throw sok.createForMalformedContainer(sb3.toString(), null);
                }
                long j4 = this.f63808f7l8;
                if (j4 == 4 || j4 == 8) {
                    this.f19884q.toq(this.f19881g, m11789q(ld6Var, (int) j4));
                    this.f19883n = 0;
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(40);
                sb4.append("Invalid float size: ");
                sb4.append(j4);
                throw sok.createForMalformedContainer(sb4.toString(), null);
            }
            ld6Var.cdj((int) this.f63808f7l8);
            this.f19883n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.zy
    public void reset() {
        this.f19883n = 0;
        this.f63809toq.clear();
        this.f63810zy.m11784n();
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.zy
    public void toq(com.google.android.exoplayer2.extractor.mkv.toq toqVar) {
        this.f19884q = toqVar;
    }
}
