package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.gvn7;
import java.io.IOException;

/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes2.dex */
final class n7h {

    /* JADX INFO: renamed from: k */
    public static final int f20046k = 1903435808;

    /* JADX INFO: renamed from: q */
    private static final int[] f20047q = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, AbstractC3373k.f20016y, AbstractC3373k.f64169ld6, AbstractC3373k.f64212x2, AbstractC3373k.f64130cdj, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, f20046k, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f64268toq = 1751476579;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f64269zy = 4096;

    private n7h() {
    }

    /* JADX INFO: renamed from: k */
    private static boolean m11861k(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        for (int i3 : f20047q) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m11862n(com.google.android.exoplayer2.extractor.ld6 ld6Var, boolean z2) throws IOException {
        return zy(ld6Var, false, z2);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m11863q(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return zy(ld6Var, false, false);
    }

    public static boolean toq(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException {
        return zy(ld6Var, true, false);
    }

    private static boolean zy(com.google.android.exoplayer2.extractor.ld6 ld6Var, boolean z2, boolean z3) throws IOException {
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long length = ld6Var.getLength();
        long j2 = -1;
        long j3 = 4096;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i2 = (int) j3;
        gvn7 gvn7Var = new gvn7(64);
        boolean z10 = false;
        int i3 = 0;
        boolean z11 = false;
        while (i3 < i2) {
            gvn7Var.dd(8);
            if (!ld6Var.f7l8(gvn7Var.m13598q(), z10 ? 1 : 0, 8, true)) {
                break;
            }
            long jD3 = gvn7Var.d3();
            int iKja0 = gvn7Var.kja0();
            int i4 = 16;
            if (jD3 == 1) {
                ld6Var.fn3e(gvn7Var.m13598q(), 8, 8);
                gvn7Var.m13595l(16);
                jD3 = gvn7Var.o1t();
            } else {
                if (jD3 == 0) {
                    long length2 = ld6Var.getLength();
                    if (length2 != j2) {
                        jD3 = (length2 - ld6Var.x2()) + ((long) 8);
                    }
                }
                i4 = 8;
            }
            long j4 = i4;
            if (jD3 < j4) {
                return z10;
            }
            i3 += i4;
            if (iKja0 == 1836019574) {
                i2 += (int) jD3;
                if (length != -1 && i2 > length) {
                    i2 = (int) length;
                }
            } else {
                if (iKja0 == 1836019558 || iKja0 == 1836475768) {
                    z5 = z10 ? 1 : 0;
                    z6 = true;
                    z7 = true;
                    break;
                }
                long j5 = length;
                if ((((long) i3) + jD3) - j4 >= i2) {
                    z5 = false;
                    z6 = true;
                    break;
                }
                int i5 = (int) (jD3 - j4);
                i3 += i5;
                if (iKja0 != 1718909296) {
                    z8 = false;
                    z11 = z11;
                    if (i5 != 0) {
                        ld6Var.qrj(i5);
                        z11 = z11;
                    }
                } else {
                    if (i5 < 8) {
                        return false;
                    }
                    gvn7Var.dd(i5);
                    ld6Var.fn3e(gvn7Var.m13598q(), 0, i5);
                    int i6 = i5 / 4;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            z9 = z11;
                            break;
                        }
                        if (i7 == 1) {
                            gvn7Var.hyr(4);
                        } else if (m11861k(gvn7Var.kja0(), z3)) {
                            z9 = true;
                            break;
                        }
                        i7++;
                    }
                    if (!z9) {
                        return false;
                    }
                    z8 = false;
                    z11 = z9;
                }
                z10 = z8;
                length = j5;
            }
            j2 = -1;
            z11 = z11;
        }
        z5 = z10 ? 1 : 0;
        z6 = true;
        z7 = z5 ? 1 : 0;
        return (z11 && z2 == z7) ? z6 : z5;
    }
}
