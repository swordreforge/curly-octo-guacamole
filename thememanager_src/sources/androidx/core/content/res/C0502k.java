package androidx.core.content.res;

import androidx.core.graphics.C0541p;
import kotlin.jvm.internal.fu4;
import zy.dd;
import zy.lvui;
import zy.zurt;

/* JADX INFO: renamed from: androidx.core.content.res.k */
/* JADX INFO: compiled from: CamColor.java */
/* JADX INFO: loaded from: classes.dex */
class C0502k {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final float f50404ld6 = 1.0f;

    /* JADX INFO: renamed from: p */
    private static final float f3497p = 0.2f;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final float f50405qrj = 0.01f;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final float f50406x2 = 0.4f;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float f50407f7l8;

    /* JADX INFO: renamed from: g */
    private final float f3498g;

    /* JADX INFO: renamed from: k */
    private final float f3499k;

    /* JADX INFO: renamed from: n */
    private final float f3500n;

    /* JADX INFO: renamed from: q */
    private final float f3501q;

    /* JADX INFO: renamed from: s */
    private final float f3502s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f50408toq;

    /* JADX INFO: renamed from: y */
    private final float f3503y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f50409zy;

    C0502k(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f3499k = f2;
        this.f50408toq = f3;
        this.f50409zy = f4;
        this.f3501q = f5;
        this.f3500n = f6;
        this.f3498g = f7;
        this.f50407f7l8 = f8;
        this.f3503y = f9;
        this.f3502s = f10;
    }

    @zy.x2
    static int cdj(@zurt(from = 0.0d, to = 360.0d) float f2, @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false) float f3, @zurt(from = 0.0d, to = 100.0d) float f4, @lvui C0501h c0501h) {
        if (f3 < 1.0d || Math.round(f4) <= 0.0d || Math.round(f4) >= 100.0d) {
            return toq.m2347k(f4);
        }
        float fMin = f2 < 0.0f ? 0.0f : Math.min(360.0f, f2);
        C0502k c0502k = null;
        boolean z2 = true;
        float f5 = 0.0f;
        float f6 = f3;
        while (Math.abs(f5 - f3) >= f50406x2) {
            C0502k qVar = toq(fMin, f6, f4);
            if (z2) {
                if (qVar != null) {
                    return qVar.ki(c0501h);
                }
                z2 = false;
            } else if (qVar == null) {
                f3 = f6;
            } else {
                f5 = f6;
                c0502k = qVar;
            }
            f6 = ((f3 - f5) / 2.0f) + f5;
        }
        return c0502k == null ? toq.m2347k(f4) : c0502k.ki(c0501h);
    }

    @lvui
    /* JADX INFO: renamed from: g */
    private static C0502k m2292g(@zurt(from = 0.0d, to = 100.0d) float f2, @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false) float f3, @zurt(from = 0.0d, to = 360.0d) float f4, C0501h c0501h) {
        float qVar = (4.0f / c0501h.toq()) * ((float) Math.sqrt(((double) f2) / 100.0d)) * (c0501h.m2286k() + 4.0f) * c0501h.m2289q();
        float fM2289q = f3 * c0501h.m2289q();
        float fSqrt = ((float) Math.sqrt(((f3 / ((float) Math.sqrt(r4))) * c0501h.toq()) / (c0501h.m2286k() + 4.0f))) * 50.0f;
        float f5 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((((double) fM2289q) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new C0502k(f4, f3, f2, qVar, fM2289q, fSqrt, f5, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: h */
    static int m2293h(@zurt(from = 0.0d, to = 360.0d) float f2, @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false) float f3, @zurt(from = 0.0d, to = 100.0d) float f4) {
        return cdj(f2, f3, f4, C0501h.f50400ld6);
    }

    @lvui
    /* JADX INFO: renamed from: n */
    private static C0502k m2294n(@zurt(from = 0.0d, to = 100.0d) float f2, @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false) float f3, @zurt(from = 0.0d, to = 360.0d) float f4) {
        return m2292g(f2, f3, f4, C0501h.f50400ld6);
    }

    @lvui
    /* JADX INFO: renamed from: q */
    static C0502k m2295q(@zy.x2 int i2, @lvui C0501h c0501h) {
        float[] fArrM2346g = toq.m2346g(i2);
        float[][] fArr = toq.f3515k;
        float f2 = fArrM2346g[0];
        float[] fArr2 = fArr[0];
        float f3 = fArr2[0] * f2;
        float f4 = fArrM2346g[1];
        float f5 = f3 + (fArr2[1] * f4);
        float f6 = fArrM2346g[2];
        float f7 = f5 + (fArr2[2] * f6);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[0] * f2) + (fArr3[1] * f4) + (fArr3[2] * f6);
        float[] fArr4 = fArr[2];
        float f9 = (f2 * fArr4[0]) + (f4 * fArr4[1]) + (f6 * fArr4[2]);
        float f10 = c0501h.m2290s()[0] * f7;
        float f11 = c0501h.m2290s()[1] * f8;
        float f12 = c0501h.m2290s()[2] * f9;
        float fPow = (float) Math.pow(((double) (c0501h.zy() * Math.abs(f10))) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (c0501h.zy() * Math.abs(f11))) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (c0501h.zy() * Math.abs(f12))) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f13 = ((float) (((((double) fSignum) * 11.0d) + (((double) fSignum2) * (-12.0d))) + d2)) / 11.0f;
        float f14 = ((float) (((double) (fSignum + fSignum2)) - (d2 * 2.0d))) / 9.0f;
        float f15 = fSignum2 * 20.0f;
        float f16 = (((fSignum * 20.0f) + f15) + (21.0f * fSignum3)) / 20.0f;
        float f17 = (((fSignum * 40.0f) + f15) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f14, f13)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f18 = fAtan2;
        float f19 = (3.1415927f * f18) / 180.0f;
        float fPow4 = ((float) Math.pow((f17 * c0501h.m2285g()) / c0501h.m2286k(), c0501h.toq() * c0501h.m2288p())) * 100.0f;
        float fM2289q = c0501h.m2289q() * (4.0f / c0501h.toq()) * ((float) Math.sqrt(fPow4 / 100.0f)) * (c0501h.m2286k() + 4.0f);
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0501h.m2287n()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f18) < 20.14d ? 360.0f + f18 : f18)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0501h.f7l8()) * c0501h.m2291y()) * ((float) Math.sqrt((f13 * f13) + (f14 * f14)))) / (f16 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float fM2289q2 = fPow5 * c0501h.m2289q();
        float fSqrt = ((float) Math.sqrt((r2 * c0501h.toq()) / (c0501h.m2286k() + 4.0f))) * 50.0f;
        float f20 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((0.0228f * fM2289q2) + 1.0f)) * 43.85965f;
        double d4 = f19;
        return new C0502k(f18, fPow5, fPow4, fM2289q, fM2289q2, fSqrt, f20, fLog * ((float) Math.cos(d4)), fLog * ((float) Math.sin(d4)));
    }

    @dd
    private static C0502k toq(@zurt(from = 0.0d, to = 360.0d) float f2, @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false) float f3, @zurt(from = 0.0d, to = 100.0d) float f4) {
        float f5 = 1000.0f;
        float f6 = 0.0f;
        C0502k c0502k = null;
        float f7 = 100.0f;
        float f8 = 1000.0f;
        while (Math.abs(f6 - f7) > f50405qrj) {
            float f9 = ((f7 - f6) / 2.0f) + f6;
            int iT8r = m2294n(f9, f3, f2).t8r();
            float qVar = toq.toq(iT8r);
            float fAbs = Math.abs(f4 - qVar);
            if (fAbs < 0.2f) {
                C0502k c0502kZy = zy(iT8r);
                float fM2296k = c0502kZy.m2296k(m2294n(c0502kZy.ld6(), c0502kZy.m2298s(), f2));
                if (fM2296k <= 1.0f) {
                    c0502k = c0502kZy;
                    f5 = fAbs;
                    f8 = fM2296k;
                }
            }
            if (f5 == 0.0f && f8 == 0.0f) {
                break;
            }
            if (qVar < f4) {
                f6 = f9;
            } else {
                f7 = f9;
            }
        }
        return c0502k;
    }

    @lvui
    static C0502k zy(@zy.x2 int i2) {
        return m2295q(i2, C0501h.f50400ld6);
    }

    @zurt(from = fu4.f36406n, fromInclusive = false, to = fu4.f36407q, toInclusive = false)
    float f7l8() {
        return this.f3503y;
    }

    /* JADX INFO: renamed from: k */
    float m2296k(@lvui C0502k c0502k) {
        float fX2 = x2() - c0502k.x2();
        float fF7l8 = f7l8() - c0502k.f7l8();
        float fM2299y = m2299y() - c0502k.m2299y();
        return (float) (Math.pow(Math.sqrt((fX2 * fX2) + (fF7l8 * fF7l8) + (fM2299y * fM2299y)), 0.63d) * 1.41d);
    }

    @zy.x2
    int ki(@lvui C0501h c0501h) {
        float fPow = (float) Math.pow(((double) ((((double) m2298s()) == 0.0d || ((double) ld6()) == 0.0d) ? 0.0f : m2298s() / ((float) Math.sqrt(((double) ld6()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, c0501h.m2287n()), 0.73d), 1.1111111111111112d);
        double dM2297p = (m2297p() * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + dM2297p) + 3.8d)) * 0.25f;
        float fM2286k = c0501h.m2286k() * ((float) Math.pow(((double) ld6()) / 100.0d, (1.0d / ((double) c0501h.toq())) / ((double) c0501h.m2288p())));
        float fF7l8 = fCos * 3846.1538f * c0501h.f7l8() * c0501h.m2291y();
        float fM2285g = fM2286k / c0501h.m2285g();
        float fSin = (float) Math.sin(dM2297p);
        float fCos2 = (float) Math.cos(dM2297p);
        float f2 = (((0.305f + fM2285g) * 23.0f) * fPow) / (((fF7l8 * 23.0f) + ((11.0f * fPow) * fCos2)) + ((fPow * 108.0f) * fSin));
        float f3 = fCos2 * f2;
        float f4 = f2 * fSin;
        float f5 = fM2285g * 460.0f;
        float f6 = (((451.0f * f3) + f5) + (288.0f * f4)) / 1403.0f;
        float f7 = ((f5 - (891.0f * f3)) - (261.0f * f4)) / 1403.0f;
        float fSignum = Math.signum(f6) * (100.0f / c0501h.zy()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f6)) * 27.13d) / (400.0d - ((double) Math.abs(f6)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f7) * (100.0f / c0501h.zy()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f7)) * 27.13d) / (400.0d - ((double) Math.abs(f7)))), 2.380952380952381d));
        float fSignum3 = Math.signum(((f5 - (f3 * 220.0f)) - (f4 * 6300.0f)) / 1403.0f) * (100.0f / c0501h.zy()) * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(r6)) * 27.13d) / (400.0d - ((double) Math.abs(r6)))), 2.380952380952381d));
        float f8 = fSignum / c0501h.m2290s()[0];
        float f9 = fSignum2 / c0501h.m2290s()[1];
        float f10 = fSignum3 / c0501h.m2290s()[2];
        float[][] fArr = toq.f50419toq;
        float[] fArr2 = fArr[0];
        float f11 = (fArr2[0] * f8) + (fArr2[1] * f9) + (fArr2[2] * f10);
        float[] fArr3 = fArr[1];
        float f12 = (fArr3[0] * f8) + (fArr3[1] * f9) + (fArr3[2] * f10);
        float[] fArr4 = fArr[2];
        return C0541p.f7l8(f11, f12, (f8 * fArr4[0]) + (f9 * fArr4[1]) + (f10 * fArr4[2]));
    }

    @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false)
    float kja0() {
        return this.f3498g;
    }

    @zurt(from = 0.0d, to = 100.0d)
    float ld6() {
        return this.f50409zy;
    }

    @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false)
    float n7h() {
        return this.f3501q;
    }

    @zurt(from = 0.0d, to = 360.0d, toInclusive = false)
    /* JADX INFO: renamed from: p */
    float m2297p() {
        return this.f3499k;
    }

    @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false)
    float qrj() {
        return this.f3500n;
    }

    @zurt(from = 0.0d, to = fu4.f36407q, toInclusive = false)
    /* JADX INFO: renamed from: s */
    float m2298s() {
        return this.f50408toq;
    }

    @zy.x2
    int t8r() {
        return ki(C0501h.f50400ld6);
    }

    @zurt(from = 0.0d, to = 100.0d)
    float x2() {
        return this.f50407f7l8;
    }

    @zurt(from = fu4.f36406n, fromInclusive = false, to = fu4.f36407q, toInclusive = false)
    /* JADX INFO: renamed from: y */
    float m2299y() {
        return this.f3502s;
    }
}
