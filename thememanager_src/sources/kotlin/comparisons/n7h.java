package kotlin.comparisons;

import kotlin.C6220d;
import kotlin.InterfaceC6232i;
import kotlin.bo;
import kotlin.dr;
import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.qo;
import kotlin.tfm;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: classes3.dex */
public class n7h {
    @yz(version = "1.4")
    @InterfaceC6232i
    public static final long cdj(long j2, @InterfaceC7396q long... other) {
        d2ok.m23075h(other, "other");
        int iN7h = C6220d.n7h(other);
        for (int i2 = 0; i2 < iN7h; i2++) {
            j2 = zurt(j2, C6220d.x2(other, i2));
        }
        return j2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int f7l8(int i2, int i3, int i4) {
        return toq(i2, toq(i3, i4));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final byte fn3e(byte b2, byte b3, byte b4) {
        return kja0(b2, kja0(b3, b4));
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final short fu4(short s2, @InterfaceC7396q short... other) {
        d2ok.m23075h(other, "other");
        int iN7h = tfm.n7h(other);
        for (int i2 = 0; i2 < iN7h; i2++) {
            s2 = qrj(s2, tfm.x2(other, i2));
        }
        return s2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: g */
    private static final short m22697g(short s2, short s3, short s4) {
        return m22700k(s2, m22700k(s3, s4));
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    /* JADX INFO: renamed from: h */
    public static final int m22698h(int i2, @InterfaceC7396q int... other) {
        d2ok.m23075h(other, "other");
        int iN7h = dr.n7h(other);
        for (int i3 = 0; i3 < iN7h; i3++) {
            i2 = n7h(i2, dr.x2(other, i3));
        }
        return i2;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    /* JADX INFO: renamed from: i */
    public static final byte m22699i(byte b2, @InterfaceC7396q byte... other) {
        d2ok.m23075h(other, "other");
        int iN7h = bo.n7h(other);
        for (int i2 = 0; i2 < iN7h; i2++) {
            b2 = kja0(b2, bo.x2(other, i2));
        }
        return b2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: k */
    public static final short m22700k(short s2, short s3) {
        return d2ok.m23076i(s2 & qo.f36486g, 65535 & s3) >= 0 ? s2 : s3;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final short ki(short s2, short s3, short s4) {
        return qrj(s2, qrj(s3, s4));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final byte kja0(byte b2, byte b3) {
        return d2ok.m23076i(b2 & 255, b3 & 255) <= 0 ? b2 : b3;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long ld6(long j2, long j3, long j4) {
        return m22702p(j2, m22702p(j3, j4));
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    /* JADX INFO: renamed from: n */
    public static final long m22701n(long j2, @InterfaceC7396q long... other) {
        d2ok.m23075h(other, "other");
        int iN7h = C6220d.n7h(other);
        for (int i2 = 0; i2 < iN7h; i2++) {
            j2 = m22702p(j2, C6220d.x2(other, i2));
        }
        return j2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static int n7h(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) <= 0 ? i2 : i3;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final long ni7(long j2, long j3, long j4) {
        return zurt(j2, zurt(j3, j4));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    /* JADX INFO: renamed from: p */
    public static long m22702p(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) >= 0 ? j2 : j3;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    /* JADX INFO: renamed from: q */
    public static final int m22703q(int i2, @InterfaceC7396q int... other) {
        d2ok.m23075h(other, "other");
        int iN7h = dr.n7h(other);
        for (int i3 = 0; i3 < iN7h; i3++) {
            i2 = toq(i2, dr.x2(other, i3));
        }
        return i2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final short qrj(short s2, short s3) {
        return d2ok.m23076i(s2 & qo.f36486g, 65535 & s3) <= 0 ? s2 : s3;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: s */
    private static final byte m22704s(byte b2, byte b3, byte b4) {
        return zy(b2, zy(b3, b4));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    private static final int t8r(int i2, int i3, int i4) {
        return n7h(i2, n7h(i3, i4));
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static int toq(int i2, int i3) {
        return Integer.compareUnsigned(i2, i3) >= 0 ? i2 : i3;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    public static final short x2(short s2, @InterfaceC7396q short... other) {
        d2ok.m23075h(other, "other");
        int iN7h = tfm.n7h(other);
        for (int i2 = 0; i2 < iN7h; i2++) {
            s2 = m22700k(s2, tfm.x2(other, i2));
        }
        return s2;
    }

    @yz(version = "1.4")
    @InterfaceC6232i
    /* JADX INFO: renamed from: y */
    public static final byte m22705y(byte b2, @InterfaceC7396q byte... other) {
        d2ok.m23075h(other, "other");
        int iN7h = bo.n7h(other);
        for (int i2 = 0; i2 < iN7h; i2++) {
            b2 = zy(b2, bo.x2(other, i2));
        }
        return b2;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static long zurt(long j2, long j3) {
        return Long.compareUnsigned(j2, j3) <= 0 ? j2 : j3;
    }

    @i9jn(markerClass = {InterfaceC6232i.class})
    @yz(version = "1.5")
    public static final byte zy(byte b2, byte b3) {
        return d2ok.m23076i(b2 & 255, b3 & 255) >= 0 ? b2 : b3;
    }
}
