package kotlin.math;

import kotlin.i9jn;
import kotlin.internal.InterfaceC6234g;
import kotlin.ki;
import kotlin.yz;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: kotlin.math.q */
/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
public class C6321q extends zy {
    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: a */
    private static final double m23199a(double d2) {
        return Math.log10(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double a9(double d2) {
        return Math.exp(d2);
    }

    @yz(version = "1.2")
    public static final float a98o(float f2, float f3) {
        if (f3 <= 0.0f) {
            return Float.NaN;
        }
        if (f3 == 1.0f) {
            return Float.NaN;
        }
        return (float) (Math.log(f2) / Math.log(f3));
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: b */
    private static final double m23200b(double d2) {
        return Math.log1p(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float bf2(float f2) {
        return (float) Math.log1p(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double bo(double d2, double d4) {
        return Math.min(d2, d4);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double bwp(double d2, double d4) {
        return Math.copySign(d2, d4);
    }

    /* JADX INFO: renamed from: c */
    public static int m23201c(long j2) {
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final int c8jq(int i2, int i3) {
        return Math.min(i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double cdj(double d2) {
        return Math.atan(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float cfr(float f2) {
        return (float) Math.tan(f2);
    }

    @yz(version = "1.2")
    public static final float ch(float f2) {
        return (float) (Math.log(f2) / C6319k.f81855toq);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: d */
    private static final double m23202d(double d2) {
        return Math.nextUp(d2);
    }

    private static final float d2ok(float f2) {
        return Math.abs(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double d3(double d2) {
        return Math.floor(d2);
    }

    @yz(version = "1.2")
    public static int d8wk(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    public static /* synthetic */ void dd(double d2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double dr(double d2) {
        return Math.nextAfter(d2, Double.NEGATIVE_INFINITY);
    }

    @yz(version = "1.2")
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m23203e(long j2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float ek5k(float f2, float f3) {
        return (float) Math.hypot(f2, f3);
    }

    private static final double eqxt(double d2) {
        return Math.abs(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float etdu(float f2) {
        return (float) Math.sqrt(f2);
    }

    /* JADX INFO: renamed from: f */
    public static int m23204f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        return i2 > 0 ? 1 : 0;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final int f7l8(int i2) {
        return Math.abs(i2);
    }

    @yz(version = "1.2")
    public static final double fn3e(double d2) {
        if (Math.abs(d2) < C6319k.f36471n) {
            return Math.abs(d2) > C6319k.f36472q ? d2 + (((d2 * d2) * d2) / ((double) 3)) : d2;
        }
        double d4 = 1;
        return Math.log((d4 + d2) / (d4 - d2)) / ((double) 2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float fnq8(float f2, float f3) {
        return (float) Math.pow(f2, f3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float fti(float f2) {
        return (float) Math.exp(f2);
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.8")
    private static final float fu4(float f2) {
        return (float) Math.cbrt(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: g */
    private static final float m23205g(float f2) {
        return Math.abs(f2);
    }

    @yz(version = "1.2")
    public static int g1(float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f2);
    }

    @yz(version = "1.2")
    public static final long gbni(float f2) {
        return was(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float gc3c(float f2, float f3) {
        return Math.copySign(f2, f3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float gvn7(float f2) {
        return (float) Math.expm1(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final long gyi(long j2, long j3) {
        return Math.min(j2, j3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: h */
    private static final float m23206h(float f2) {
        return (float) kja0(f2);
    }

    private static final float hb(float f2) {
        return Math.ulp(f2);
    }

    private static final float hyr(float f2) {
        return Math.signum(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: i */
    private static final float m23207i(float f2, float f3) {
        return (float) Math.atan2(f2, f3);
    }

    @yz(version = "1.2")
    public static final double i1(double d2, double d4) {
        if (d4 <= 0.0d) {
            return Double.NaN;
        }
        if (d4 == 1.0d) {
            return Double.NaN;
        }
        return Math.log(d2) / Math.log(d4);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double i9jn(double d2) {
        return Math.sin(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float ikck(float f2, float f3) {
        return Math.nextAfter(f2, f3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m23208j(double d2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float jk(float f2) {
        return (float) Math.cosh(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double jp0y(double d2) {
        return Math.expm1(d2);
    }

    @yz(version = "1.2")
    public static final float kcsr(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2)) {
            return f2;
        }
        return (float) (f2 > 0.0f ? Math.floor(f2) : Math.ceil(f2));
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float ki(float f2) {
        return (float) Math.atan(f2);
    }

    @yz(version = "1.2")
    public static final double kja0(double d2) {
        double d4 = C6319k.f36471n;
        if (d2 < d4) {
            return d2 <= (-d4) ? -kja0(-d2) : Math.abs(d2) >= C6319k.f36472q ? d2 - (((d2 * d2) * d2) / ((double) 6)) : d2;
        }
        if (d2 <= C6319k.f81854f7l8) {
            return Math.log(d2 + Math.sqrt((d2 * d2) + ((double) 1)));
        }
        if (d2 > C6319k.f36469g) {
            return Math.log(d2) + C6319k.f81855toq;
        }
        double d5 = d2 * ((double) 2);
        return Math.log(d5 + (((double) 1) / d5));
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m23209l(long j2) {
    }

    @yz(version = "1.2")
    public static final double ld6(double d2) {
        if (d2 < 1.0d) {
            return Double.NaN;
        }
        if (d2 > C6319k.f36469g) {
            return Math.log(d2) + C6319k.f81855toq;
        }
        double d4 = 1;
        double d5 = d2 - d4;
        if (d5 >= C6319k.f36471n) {
            return Math.log(d2 + Math.sqrt((d2 * d2) - d4));
        }
        double dSqrt = Math.sqrt(d5);
        if (dSqrt >= C6319k.f36472q) {
            dSqrt -= ((dSqrt * dSqrt) * dSqrt) / ((double) 12);
        }
        return dSqrt * Math.sqrt(2.0d);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    public static /* synthetic */ void lrht(double d2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float ltg8(float f2) {
        return (float) Math.sin(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float lv5(float f2, float f3) {
        return Math.max(f2, f3);
    }

    private static final int lvui(int i2) {
        return Math.abs(i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: m */
    private static final double m23210m(double d2, double d4) {
        return Math.hypot(d2, d4);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float m4(float f2) {
        return (float) Math.sinh(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double mcp(double d2) {
        return Math.cosh(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float mu(float f2) {
        return Math.nextUp(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: n */
    private static final double m23211n(double d2) {
        return Math.abs(d2);
    }

    private static final double n5r1(double d2) {
        return Math.signum(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float n7h(float f2) {
        return (float) Math.asin(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    public static /* synthetic */ void ncyb(int i2) {
    }

    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.8")
    private static final double ni7(double d2) {
        return Math.cbrt(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double nmn5(double d2, double d4) {
        return Math.max(d2, d4);
    }

    private static final double nn86(double d2) {
        return Math.ulp(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m23212o(float f2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float o1t(float f2) {
        return (float) Math.ceil(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float oc(float f2) {
        return (float) Math.floor(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: p */
    private static final float m23213p(float f2) {
        return (float) Math.acos(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float py(float f2) {
        return Math.signum(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: q */
    private static final float m23214q(float f2, float f3) {
        return (float) Math.IEEEremainder(f2, f3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double qkj8(double d2, int i2) {
        return Math.pow(d2, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float qo(float f2, int i2) {
        return (float) Math.pow(f2, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double qrj(double d2) {
        return Math.asin(d2);
    }

    /* JADX INFO: renamed from: r */
    private static final long m23215r(long j2) {
        return Math.abs(j2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double r8s8(double d2) {
        return Math.sinh(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: s */
    private static final double m23216s(double d2) {
        return Math.acos(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double se(double d2, int i2) {
        return Math.copySign(d2, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double sok(double d2) {
        return Math.tan(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: t */
    private static final float m23217t(float f2) {
        return (float) Math.cos(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final int t8iq(int i2, int i3) {
        return Math.max(i2, i3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double t8r(double d2, double d4) {
        return Math.atan2(d2, d4);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double tfm(double d2) {
        return Math.rint(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: u */
    private static final long m23218u(long j2, long j3) {
        return Math.max(j2, j3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    public static /* synthetic */ void uv6(float f2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: v */
    private static final double m23219v(double d2, double d4) {
        return Math.nextAfter(d2, d4);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double v0af(double d2) {
        return Math.sqrt(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double vq(double d2, double d4) {
        return Math.pow(d2, d4);
    }

    @yz(version = "1.2")
    public static /* synthetic */ void vyq(int i2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double w831(double d2) {
        return Math.tanh(d2);
    }

    @yz(version = "1.2")
    public static long was(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float wo(float f2) {
        return (float) Math.rint(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double wvg(double d2) {
        return Math.cos(d2);
    }

    @yz(version = "1.2")
    /* JADX INFO: renamed from: x */
    public static final double m23220x(double d2) {
        return Math.log(d2) / C6319k.f81855toq;
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float x2(float f2) {
        return (float) ld6(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    public static /* synthetic */ void x9kr(float f2) {
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float xwq3(float f2) {
        return Math.nextAfter(f2, Double.NEGATIVE_INFINITY);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: y */
    private static final long m23221y(long j2) {
        return Math.abs(j2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float y2(float f2, float f3) {
        return Math.min(f2, f3);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float y9n(float f2) {
        return (float) Math.log(f2);
    }

    @yz(version = "1.2")
    public static final double yqrt(double d2) {
        return (Double.isNaN(d2) || Double.isInfinite(d2)) ? d2 : d2 > 0.0d ? Math.floor(d2) : Math.ceil(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double yz(double d2) {
        return Math.log(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    /* JADX INFO: renamed from: z */
    private static final double m23222z(double d2) {
        return Math.ceil(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float z4(float f2) {
        return (float) Math.tanh(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float zkd(float f2, int i2) {
        return Math.copySign(f2, i2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float zp(float f2) {
        return (float) Math.log10(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double zsr0(double d2) {
        return Math.signum(d2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final float zurt(float f2) {
        return (float) fn3e(f2);
    }

    @InterfaceC6234g
    @yz(version = "1.2")
    private static final double zy(double d2, double d4) {
        return Math.IEEEremainder(d2, d4);
    }
}
