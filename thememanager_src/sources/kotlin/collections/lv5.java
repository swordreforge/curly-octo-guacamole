package kotlin.collections;

import kotlin.C6220d;
import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.dr;
import kotlin.qo;
import kotlin.tfm;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: UArraySorting.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class lv5 {
    @InterfaceC6232i
    private static final void f7l8(short[] sArr, int i2, int i3) {
        int iZy = zy(sArr, i2, i3);
        int i4 = iZy - 1;
        if (i2 < i4) {
            f7l8(sArr, i2, i4);
        }
        if (iZy < i3) {
            f7l8(sArr, iZy, i3);
        }
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: g */
    private static final void m22553g(byte[] bArr, int i2, int i3) {
        int qVar = toq(bArr, i2, i3);
        int i4 = qVar - 1;
        if (i2 < i4) {
            m22553g(bArr, i2, i4);
        }
        if (qVar < i3) {
            m22553g(bArr, qVar, i3);
        }
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: k */
    private static final int m22554k(long[] jArr, int i2, int i3) {
        long jX2 = C6220d.x2(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (Long.compareUnsigned(C6220d.x2(jArr, i2), jX2) < 0) {
                i2++;
            }
            while (Long.compareUnsigned(C6220d.x2(jArr, i3), jX2) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                long jX22 = C6220d.x2(jArr, i2);
                C6220d.m22781i(jArr, i2, C6220d.x2(jArr, i3));
                C6220d.m22781i(jArr, i3, jX22);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @InterfaceC6232i
    public static final void ld6(@InterfaceC7396q short[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        f7l8(array, i2, i3 - 1);
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: n */
    private static final void m22555n(long[] jArr, int i2, int i3) {
        int iM22554k = m22554k(jArr, i2, i3);
        int i4 = iM22554k - 1;
        if (i2 < i4) {
            m22555n(jArr, i2, i4);
        }
        if (iM22554k < i3) {
            m22555n(jArr, iM22554k, i3);
        }
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: p */
    public static final void m22556p(@InterfaceC7396q byte[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        m22553g(array, i2, i3 - 1);
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: q */
    private static final int m22557q(int[] iArr, int i2, int i3) {
        int iX2 = dr.x2(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (Integer.compareUnsigned(dr.x2(iArr, i2), iX2) < 0) {
                i2++;
            }
            while (Integer.compareUnsigned(dr.x2(iArr, i3), iX2) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                int iX22 = dr.x2(iArr, i2);
                dr.m22804i(iArr, i2, dr.x2(iArr, i3));
                dr.m22804i(iArr, i3, iX22);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: s */
    public static final void m22558s(@InterfaceC7396q long[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        m22555n(array, i2, i3 - 1);
    }

    @InterfaceC6232i
    private static final int toq(byte[] bArr, int i2, int i3) {
        int i4;
        byte bX2 = bo.x2(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                i4 = bX2 & 255;
                if (kotlin.jvm.internal.d2ok.m23076i(bo.x2(bArr, i2) & 255, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (kotlin.jvm.internal.d2ok.m23076i(bo.x2(bArr, i3) & 255, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                byte bX22 = bo.x2(bArr, i2);
                bo.m22414i(bArr, i2, bo.x2(bArr, i3));
                bo.m22414i(bArr, i3, bX22);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @InterfaceC6232i
    public static final void x2(@InterfaceC7396q int[] array, int i2, int i3) {
        kotlin.jvm.internal.d2ok.m23075h(array, "array");
        m22559y(array, i2, i3 - 1);
    }

    @InterfaceC6232i
    /* JADX INFO: renamed from: y */
    private static final void m22559y(int[] iArr, int i2, int i3) {
        int iM22557q = m22557q(iArr, i2, i3);
        int i4 = iM22557q - 1;
        if (i2 < i4) {
            m22559y(iArr, i2, i4);
        }
        if (iM22557q < i3) {
            m22559y(iArr, iM22557q, i3);
        }
    }

    @InterfaceC6232i
    private static final int zy(short[] sArr, int i2, int i3) {
        int i4;
        short sX2 = tfm.x2(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int iX2 = tfm.x2(sArr, i2) & qo.f36486g;
                i4 = sX2 & qo.f36486g;
                if (kotlin.jvm.internal.d2ok.m23076i(iX2, i4) >= 0) {
                    break;
                }
                i2++;
            }
            while (kotlin.jvm.internal.d2ok.m23076i(tfm.x2(sArr, i3) & qo.f36486g, i4) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                short sX22 = tfm.x2(sArr, i2);
                tfm.m23653i(sArr, i2, tfm.x2(sArr, i3));
                tfm.m23653i(sArr, i3, sX22);
                i2++;
                i3--;
            }
        }
        return i2;
    }
}
