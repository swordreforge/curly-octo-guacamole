package com.google.common.hash;

import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: FarmHashFingerprint64.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6 extends AbstractC4667n {

    /* JADX INFO: renamed from: g */
    private static final long f27013g = -7286425919675154353L;

    /* JADX INFO: renamed from: k */
    static final kja0 f27014k = new ld6();

    /* JADX INFO: renamed from: n */
    private static final long f27015n = -5435081209227447693L;

    /* JADX INFO: renamed from: q */
    private static final long f27016q = -4348849565147123417L;

    ld6() {
    }

    private static long f7l8(long j2) {
        return j2 ^ (j2 >>> 47);
    }

    /* JADX INFO: renamed from: g */
    private static long m16349g(byte[] bArr, int i2, int i3) {
        long jF7l8 = f7l8(-7956866745689871395L) * f27013g;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long qVar = 95310865018149119L + fn3e.toq(bArr, i2);
        int i4 = i3 - 1;
        int i5 = i2 + ((i4 / 64) * 64);
        int i6 = i4 & 63;
        int i7 = (i5 + i6) - 63;
        long j2 = 2480279821605975764L;
        int i8 = i2;
        while (true) {
            long jRotateRight = Long.rotateRight(qVar + j2 + jArr[0] + fn3e.toq(bArr, i8 + 8), 37) * f27015n;
            long jRotateRight2 = Long.rotateRight(j2 + jArr[1] + fn3e.toq(bArr, i8 + 48), 42) * f27015n;
            long j3 = jRotateRight ^ jArr2[1];
            long qVar2 = jRotateRight2 + jArr[0] + fn3e.toq(bArr, i8 + 40);
            long jRotateRight3 = Long.rotateRight(jF7l8 + jArr2[0], 33) * f27015n;
            m16353y(bArr, i8, jArr[1] * f27015n, j3 + jArr2[0], jArr);
            m16353y(bArr, i8 + 32, jRotateRight3 + jArr2[1], qVar2 + fn3e.toq(bArr, i8 + 16), jArr2);
            i8 += 64;
            if (i8 == i5) {
                long j4 = ((j3 & 255) << 1) + f27015n;
                long j5 = jArr2[0] + ((long) i6);
                jArr2[0] = j5;
                long j6 = jArr[0] + j5;
                jArr[0] = j6;
                jArr2[0] = jArr2[0] + j6;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + qVar2 + jArr[0] + fn3e.toq(bArr, i7 + 8), 37) * j4;
                long jRotateRight5 = Long.rotateRight(qVar2 + jArr[1] + fn3e.toq(bArr, i7 + 48), 42) * j4;
                long j7 = jRotateRight4 ^ (jArr2[1] * 9);
                long qVar3 = jRotateRight5 + (jArr[0] * 9) + fn3e.toq(bArr, i7 + 40);
                long jRotateRight6 = Long.rotateRight(j3 + jArr2[0], 33) * j4;
                m16353y(bArr, i7, jArr[1] * j4, j7 + jArr2[0], jArr);
                m16353y(bArr, i7 + 32, jRotateRight6 + jArr2[1], fn3e.toq(bArr, i7 + 16) + qVar3, jArr2);
                return zy(zy(jArr[0], jArr2[0], j4) + (f7l8(qVar3) * f27016q) + j7, zy(jArr[1], jArr2[1], j4) + jRotateRight6, j4);
            }
            jF7l8 = j3;
            j2 = qVar2;
            qVar = jRotateRight3;
        }
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: k */
    static long m16350k(byte[] bArr, int i2, int i3) {
        return i3 <= 32 ? i3 <= 16 ? toq(bArr, i2, i3) : m16352q(bArr, i2, i3) : i3 <= 64 ? m16351n(bArr, i2, i3) : m16349g(bArr, i2, i3);
    }

    /* JADX INFO: renamed from: n */
    private static long m16351n(byte[] bArr, int i2, int i3) {
        long j2 = ((long) (i3 * 2)) + f27013g;
        long qVar = fn3e.toq(bArr, i2) * f27013g;
        long qVar2 = fn3e.toq(bArr, i2 + 8);
        int i4 = i2 + i3;
        long qVar3 = fn3e.toq(bArr, i4 - 8) * j2;
        long jRotateRight = Long.rotateRight(qVar + qVar2, 43) + Long.rotateRight(qVar3, 30) + (fn3e.toq(bArr, i4 - 16) * f27013g);
        long jZy = zy(jRotateRight, qVar3 + Long.rotateRight(qVar2 + f27013g, 18) + qVar, j2);
        long qVar4 = fn3e.toq(bArr, i2 + 16) * j2;
        long qVar5 = fn3e.toq(bArr, i2 + 24);
        long qVar6 = (jRotateRight + fn3e.toq(bArr, i4 - 32)) * j2;
        return zy(((jZy + fn3e.toq(bArr, i4 - 24)) * j2) + Long.rotateRight(qVar4 + qVar5, 43) + Long.rotateRight(qVar6, 30), qVar4 + Long.rotateRight(qVar5 + qVar, 18) + qVar6, j2);
    }

    /* JADX INFO: renamed from: q */
    private static long m16352q(byte[] bArr, int i2, int i3) {
        long j2 = ((long) (i3 * 2)) + f27013g;
        long qVar = fn3e.toq(bArr, i2) * f27015n;
        long qVar2 = fn3e.toq(bArr, i2 + 8);
        int i4 = i2 + i3;
        long qVar3 = fn3e.toq(bArr, i4 - 8) * j2;
        return zy((fn3e.toq(bArr, i4 - 16) * f27013g) + Long.rotateRight(qVar + qVar2, 43) + Long.rotateRight(qVar3, 30), qVar + Long.rotateRight(qVar2 + f27013g, 18) + qVar3, j2);
    }

    private static long toq(byte[] bArr, int i2, int i3) {
        if (i3 >= 8) {
            long j2 = ((long) (i3 * 2)) + f27013g;
            long qVar = fn3e.toq(bArr, i2) + f27013g;
            long qVar2 = fn3e.toq(bArr, (i2 + i3) - 8);
            return zy((Long.rotateRight(qVar2, 37) * j2) + qVar, (Long.rotateRight(qVar, 25) + qVar2) * j2, j2);
        }
        if (i3 >= 4) {
            return zy(((long) i3) + ((((long) fn3e.m16333k(bArr, i2)) & 4294967295L) << 3), ((long) fn3e.m16333k(bArr, (i2 + i3) - 4)) & 4294967295L, ((long) (i3 * 2)) + f27013g);
        }
        if (i3 <= 0) {
            return f27013g;
        }
        return f7l8((((long) ((bArr[i2] & 255) + ((bArr[(i3 >> 1) + i2] & 255) << 8))) * f27013g) ^ (((long) (i3 + ((bArr[i2 + (i3 - 1)] & 255) << 2))) * f27016q)) * f27013g;
    }

    /* JADX INFO: renamed from: y */
    private static void m16353y(byte[] bArr, int i2, long j2, long j3, long[] jArr) {
        long qVar = fn3e.toq(bArr, i2);
        long qVar2 = fn3e.toq(bArr, i2 + 8);
        long qVar3 = fn3e.toq(bArr, i2 + 16);
        long qVar4 = fn3e.toq(bArr, i2 + 24);
        long j4 = j2 + qVar;
        long j5 = qVar2 + j4 + qVar3;
        long jRotateRight = Long.rotateRight(j3 + j4 + qVar4, 21) + Long.rotateRight(j5, 44);
        jArr[0] = j5 + qVar4;
        jArr[1] = jRotateRight + j4;
    }

    private static long zy(long j2, long j3, long j4) {
        long j5 = (j2 ^ j3) * j4;
        long j6 = ((j5 ^ (j5 >>> 47)) ^ j3) * j4;
        return (j6 ^ (j6 >>> 47)) * j4;
    }

    @Override // com.google.common.hash.kja0
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractC4667n, com.google.common.hash.zy, com.google.common.hash.kja0
    public n7h hashBytes(byte[] bArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
        return n7h.fromLong(m16350k(bArr, i2, i3));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
