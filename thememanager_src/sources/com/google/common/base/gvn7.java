package com.google.common.base;

import com.google.common.base.AbstractC4265n;
import java.util.BitSet;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: SmallCharMatcher.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class gvn7 extends AbstractC4265n.zurt {

    /* JADX INFO: renamed from: h */
    private static final int f25666h = 461845907;

    /* JADX INFO: renamed from: i */
    private static final double f25667i = 0.5d;

    /* JADX INFO: renamed from: p */
    private static final int f25668p = -862048943;

    /* JADX INFO: renamed from: s */
    static final int f25669s = 1023;

    /* JADX INFO: renamed from: g */
    private final boolean f25670g;

    /* JADX INFO: renamed from: n */
    private final char[] f25671n;

    /* JADX INFO: renamed from: y */
    private final long f25672y;

    private gvn7(char[] cArr, long j2, boolean z2, String str) {
        super(str);
        this.f25671n = cArr;
        this.f25672y = j2;
        this.f25670g = z2;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: e */
    static int m15361e(int i2) {
        if (i2 == 1) {
            return 2;
        }
        int iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        while (((double) iHighestOneBit) * f25667i < i2) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    static int hb(int i2) {
        return Integer.rotateLeft(i2 * f25668p, 15) * f25666h;
    }

    static AbstractC4265n nn86(BitSet bitSet, String str) {
        int i2;
        int iCardinality = bitSet.cardinality();
        boolean z2 = bitSet.get(0);
        int iM15361e = m15361e(iCardinality);
        char[] cArr = new char[iM15361e];
        int i3 = iM15361e - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j2 = 0;
        while (iNextSetBit != -1) {
            long j3 = (1 << iNextSetBit) | j2;
            int iHb = hb(iNextSetBit);
            while (true) {
                i2 = iHb & i3;
                if (cArr[i2] == 0) {
                    break;
                }
                iHb = i2 + 1;
            }
            cArr[i2] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
            j2 = j3;
        }
        return new gvn7(cArr, j2, z2, str);
    }

    private boolean vyq(int i2) {
        return 1 == ((this.f25672y >> i2) & 1);
    }

    @Override // com.google.common.base.AbstractC4265n
    void ncyb(BitSet bitSet) {
        if (this.f25670g) {
            bitSet.set(0);
        }
        for (char c2 : this.f25671n) {
            if (c2 != 0) {
                bitSet.set(c2);
            }
        }
    }

    @Override // com.google.common.base.AbstractC4265n
    /* JADX INFO: renamed from: t */
    public boolean mo15362t(char c2) {
        if (c2 == 0) {
            return this.f25670g;
        }
        if (!vyq(c2)) {
            return false;
        }
        int length = this.f25671n.length - 1;
        int iHb = hb(c2) & length;
        int i2 = iHb;
        do {
            char c3 = this.f25671n[i2];
            if (c3 == 0) {
                return false;
            }
            if (c3 == c2) {
                return true;
            }
            i2 = (i2 + 1) & length;
        } while (i2 != iHb);
        return false;
    }
}
