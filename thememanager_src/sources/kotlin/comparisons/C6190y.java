package kotlin.comparisons;

import kotlin.internal.InterfaceC6234g;
import kotlin.jvm.internal.d2ok;
import kotlin.yz;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.comparisons.y */
/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes3.dex */
class C6190y extends f7l8 {
    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: a */
    private static final int m22711a(int i2, int i3) {
        return Math.min(i2, i3);
    }

    @yz(version = "1.4")
    public static final float a98o(float f2, @InterfaceC7396q float... other) {
        d2ok.m23075h(other, "other");
        for (float f3 : other) {
            f2 = Math.min(f2, f3);
        }
        return f2;
    }

    @yz(version = "1.4")
    /* JADX INFO: renamed from: b */
    public static final double m22712b(double d2, @InterfaceC7396q double... other) {
        d2ok.m23075h(other, "other");
        for (double d4 : other) {
            d2 = Math.min(d2, d4);
        }
        return d2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final float bf2(float f2, float f3) {
        return Math.min(f2, f3);
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    public static final <T extends Comparable<? super T>> T bo(@InterfaceC7396q T a2, @InterfaceC7396q T... other) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(other, "other");
        for (T t2 : other) {
            a2 = (T) t8iq(a2, t2);
        }
        return a2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: c */
    private static final long m22713c(long j2, long j3, long j4) {
        return Math.max(j2, Math.max(j3, j4));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final short c8jq(short s2, short s3, short s4) {
        return (short) Math.min((int) s2, Math.min((int) s3, (int) s4));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final long ch(long j2, long j3) {
        return Math.min(j2, j3);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final double d2ok(double d2, double d4) {
        return Math.max(d2, d4);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final byte d3(byte b2, byte b3) {
        return (byte) Math.max((int) b2, (int) b3);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final float dd(float f2, float f3) {
        return Math.max(f2, f3);
    }

    @InterfaceC7396q
    @yz(version = "1.4")
    /* JADX INFO: renamed from: e */
    public static final <T extends Comparable<? super T>> T m22714e(@InterfaceC7396q T a2, @InterfaceC7396q T... other) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(other, "other");
        for (T t2 : other) {
            a2 = (T) uv6(a2, t2);
        }
        return a2;
    }

    @yz(version = "1.4")
    public static final byte ek5k(byte b2, @InterfaceC7396q byte... other) {
        d2ok.m23075h(other, "other");
        for (byte b3 : other) {
            b2 = (byte) Math.min((int) b2, (int) b3);
        }
        return b2;
    }

    @yz(version = "1.4")
    public static final byte eqxt(byte b2, @InterfaceC7396q byte... other) {
        d2ok.m23075h(other, "other");
        for (byte b3 : other) {
            b2 = (byte) Math.max((int) b2, (int) b3);
        }
        return b2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: f */
    private static final long m22715f(long j2, long j3) {
        return Math.max(j2, j3);
    }

    @yz(version = "1.4")
    public static final short gyi(short s2, @InterfaceC7396q short... other) {
        d2ok.m23075h(other, "other");
        for (short s3 : other) {
            s2 = (short) Math.min((int) s2, (int) s3);
        }
        return s2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final short hb(short s2, short s3, short s4) {
        return (short) Math.max((int) s2, Math.max((int) s3, (int) s4));
    }

    @yz(version = "1.4")
    public static final int hyr(int i2, @InterfaceC7396q int... other) {
        d2ok.m23075h(other, "other");
        for (int i3 : other) {
            i2 = Math.max(i2, i3);
        }
        return i2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final float i1(float f2, float f3, float f4) {
        return Math.min(f2, Math.min(f3, f4));
    }

    @yz(version = "1.4")
    /* JADX INFO: renamed from: j */
    public static final short m22716j(short s2, @InterfaceC7396q short... other) {
        d2ok.m23075h(other, "other");
        for (short s3 : other) {
            s2 = (short) Math.max((int) s2, (int) s3);
        }
        return s2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: l */
    private static final int m22717l(int i2, int i3) {
        return Math.max(i2, i3);
    }

    @yz(version = "1.4")
    public static final long lrht(long j2, @InterfaceC7396q long... other) {
        d2ok.m23075h(other, "other");
        for (long j3 : other) {
            j2 = Math.max(j2, j3);
        }
        return j2;
    }

    @yz(version = "1.4")
    public static final long lv5(long j2, @InterfaceC7396q long... other) {
        d2ok.m23075h(other, "other");
        for (long j3 : other) {
            j2 = Math.min(j2, j3);
        }
        return j2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final double lvui(double d2, double d4, double d5) {
        return Math.max(d2, Math.max(d4, d5));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: m */
    private static final byte m22718m(byte b2, byte b3, byte b4) {
        return (byte) Math.min((int) b2, Math.min((int) b3, (int) b4));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final int n5r1(int i2, int i3, int i4) {
        return Math.max(i2, Math.max(i3, i4));
    }

    @yz(version = "1.4")
    public static final float ncyb(float f2, @InterfaceC7396q float... other) {
        d2ok.m23075h(other, "other");
        for (float f3 : other) {
            f2 = Math.max(f2, f3);
        }
        return f2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final long nmn5(long j2, long j3, long j4) {
        return Math.min(j2, Math.min(j3, j4));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final short nn86(short s2, short s3) {
        return (short) Math.max((int) s2, (int) s3);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    /* JADX INFO: renamed from: o */
    private static final byte m22719o(byte b2, byte b3) {
        return (byte) Math.min((int) b2, (int) b3);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final byte oc(byte b2, byte b3, byte b4) {
        return (byte) Math.max((int) b2, Math.max((int) b3, (int) b4));
    }

    @yz(version = "1.4")
    /* JADX INFO: renamed from: r */
    public static final double m22720r(double d2, @InterfaceC7396q double... other) {
        d2ok.m23075h(other, "other");
        for (double d4 : other) {
            d2 = Math.max(d2, d4);
        }
        return d2;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static final <T extends Comparable<? super T>> T t8iq(@InterfaceC7396q T a2, @InterfaceC7396q T b2) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(b2, "b");
        return a2.compareTo(b2) <= 0 ? a2 : b2;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    /* JADX INFO: renamed from: u */
    public static final <T extends Comparable<? super T>> T m22721u(@InterfaceC7396q T a2, @InterfaceC7396q T b2, @InterfaceC7396q T c2) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(b2, "b");
        d2ok.m23075h(c2, "c");
        return (T) t8iq(a2, t8iq(b2, c2));
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static <T extends Comparable<? super T>> T uv6(@InterfaceC7396q T a2, @InterfaceC7396q T b2) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(b2, "b");
        return a2.compareTo(b2) >= 0 ? a2 : b2;
    }

    @InterfaceC7396q
    @yz(version = "1.1")
    public static final <T extends Comparable<? super T>> T vyq(@InterfaceC7396q T a2, @InterfaceC7396q T b2, @InterfaceC7396q T c2) {
        d2ok.m23075h(a2, "a");
        d2ok.m23075h(b2, "b");
        d2ok.m23075h(c2, "c");
        return (T) uv6(a2, uv6(b2, c2));
    }

    @yz(version = "1.4")
    /* JADX INFO: renamed from: x */
    public static final int m22722x(int i2, @InterfaceC7396q int... other) {
        d2ok.m23075h(other, "other");
        for (int i3 : other) {
            i2 = Math.min(i2, i3);
        }
        return i2;
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final float x9kr(float f2, float f3, float f4) {
        return Math.max(f2, Math.max(f3, f4));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final short y2(short s2, short s3) {
        return (short) Math.min((int) s2, (int) s3);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final double y9n(double d2, double d4, double d5) {
        return Math.min(d2, Math.min(d4, d5));
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final double yz(double d2, double d4) {
        return Math.min(d2, d4);
    }

    @InterfaceC6234g
    @yz(version = "1.1")
    private static final int zp(int i2, int i3, int i4) {
        return Math.min(i2, Math.min(i3, i4));
    }
}
