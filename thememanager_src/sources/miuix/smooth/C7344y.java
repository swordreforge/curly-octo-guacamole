package miuix.smooth;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: miuix.smooth.y */
/* JADX INFO: compiled from: SmoothPathProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7344y {

    /* JADX INFO: renamed from: n */
    private static final float f41784n = 0.46f;

    /* JADX INFO: renamed from: q */
    private static final float f41785q = 0.8f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private float f90323toq = f41785q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f90324zy = f41784n;

    /* JADX INFO: renamed from: k */
    private toq f41786k = null;

    /* JADX INFO: renamed from: miuix.smooth.y$k */
    /* JADX INFO: compiled from: SmoothPathProvider.java */
    public static class k {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f90325ld6 = 1;

        /* JADX INFO: renamed from: p */
        public static final int f41787p = 0;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        public static final int f90326qrj = 3;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public static final int f90327x2 = 2;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public float f90328f7l8;

        /* JADX INFO: renamed from: g */
        public double f41788g;

        /* JADX INFO: renamed from: k */
        public RectF f41789k;

        /* JADX INFO: renamed from: n */
        public double f41790n;

        /* JADX INFO: renamed from: q */
        public double f41791q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public float f90329toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public double f90330zy;

        /* JADX INFO: renamed from: y */
        public PointF[] f41793y = new PointF[4];

        /* JADX INFO: renamed from: s */
        public PointF[] f41792s = new PointF[4];

        /* JADX INFO: renamed from: k */
        public void m26640k(float f2, RectF rectF, float f3, float f4, double d2, float f5, int i2) {
            this.f90329toq = f2;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            float f6 = rectF.left;
            float f7 = rectF.top;
            float f8 = rectF.right;
            float f9 = rectF.bottom;
            this.f90330zy = C7344y.x9kr(fWidth, this.f90329toq, d2, f5);
            this.f41791q = C7344y.dd(fHeight, this.f90329toq, d2, f5);
            this.f41790n = C7344y.m26630l(this.f90330zy);
            double dNcyb = C7344y.ncyb(this.f41791q);
            this.f41788g = dNcyb;
            this.f90328f7l8 = (float) C7344y.d2ok((1.5707963267948966d - dNcyb) - this.f41790n);
            double d4 = f5;
            double dA9 = C7344y.a9(this.f90330zy * d4, this.f41790n);
            double dJp0y = C7344y.jp0y(this.f90329toq, this.f41790n);
            double dD3 = C7344y.d3(this.f90329toq, this.f41790n);
            double dEqxt = C7344y.eqxt(this.f90329toq, this.f41790n);
            double dHyr = C7344y.hyr(this.f90329toq, this.f41790n);
            double dM26625c = C7344y.m26625c(dA9, dHyr);
            double dJk = C7344y.jk(this.f41791q * d4, this.f41788g);
            double dFti = C7344y.fti(this.f90329toq, this.f41788g);
            double dGvn7 = C7344y.gvn7(this.f90329toq, this.f41788g);
            double dOc = C7344y.oc(this.f90329toq, this.f41788g);
            double dN5r1 = C7344y.n5r1(this.f90329toq, this.f41788g);
            double dM26626f = C7344y.m26626f(dJk, dN5r1);
            if (i2 == 0) {
                float f10 = f6 + f3;
                float f11 = f7 + f4;
                float f12 = this.f90329toq;
                this.f41789k = new RectF(f10, f11, (f12 * 2.0f) + f10, (f12 * 2.0f) + f11);
                double d5 = f10;
                double d6 = f11;
                this.f41793y[0] = new PointF((float) (dJp0y + d5), (float) (dD3 + d6));
                this.f41793y[1] = new PointF((float) (dEqxt + d5), f11);
                double d7 = dEqxt + dHyr;
                this.f41793y[2] = new PointF((float) (d7 + d5), f11);
                this.f41793y[3] = new PointF((float) (d7 + dM26625c + d5), f11);
                double d8 = dN5r1 + dOc;
                this.f41792s[0] = new PointF(f10, (float) (d8 + dM26626f + d6));
                this.f41792s[1] = new PointF(f10, (float) (d8 + d6));
                this.f41792s[2] = new PointF(f10, (float) (dOc + d6));
                this.f41792s[3] = new PointF((float) (dFti + d5), (float) (dGvn7 + d6));
                return;
            }
            if (i2 == 1) {
                float f13 = f7 + f4;
                float f14 = this.f90329toq;
                float f15 = f8 - f3;
                this.f41789k = new RectF((f8 - (f14 * 2.0f)) - f3, f13, f15, (f14 * 2.0f) + f13);
                double d9 = f8;
                double d10 = d9 - dEqxt;
                double d11 = d10 - dHyr;
                double d12 = f3;
                this.f41793y[0] = new PointF((float) ((d11 - dM26625c) - d12), f13);
                this.f41793y[1] = new PointF((float) (d11 - d12), f13);
                this.f41793y[2] = new PointF((float) (d10 - d12), f13);
                double d13 = f13;
                this.f41793y[3] = new PointF((float) ((d9 - dJp0y) - d12), (float) (dD3 + d13));
                this.f41792s[0] = new PointF((float) ((d9 - dFti) - d12), (float) (dGvn7 + d13));
                this.f41792s[1] = new PointF(f15, (float) (dOc + d13));
                double d14 = dOc + dN5r1;
                this.f41792s[2] = new PointF(f15, (float) (d14 + d13));
                this.f41792s[3] = new PointF(f15, (float) (d14 + dM26626f + d13));
                return;
            }
            if (i2 == 2) {
                float f16 = this.f90329toq;
                float f17 = f8 - f3;
                float f18 = f9 - f4;
                this.f41789k = new RectF((f8 - (f16 * 2.0f)) - f3, (f9 - (f16 * 2.0f)) - f4, f17, f18);
                double d15 = f8;
                double d16 = f3;
                double d17 = f9;
                double d18 = f4;
                this.f41793y[0] = new PointF((float) ((d15 - dJp0y) - d16), (float) ((d17 - dD3) - d18));
                double d19 = d15 - dEqxt;
                this.f41793y[1] = new PointF((float) (d19 - d16), f18);
                double d20 = d19 - dHyr;
                this.f41793y[2] = new PointF((float) (d20 - d16), f18);
                this.f41793y[3] = new PointF((float) ((d20 - dM26625c) - d16), f18);
                double d21 = d17 - dOc;
                double d22 = d21 - dN5r1;
                this.f41792s[0] = new PointF(f17, (float) ((d22 - dM26626f) - d18));
                this.f41792s[1] = new PointF(f17, (float) (d22 - d18));
                this.f41792s[2] = new PointF(f17, (float) (d21 - d18));
                this.f41792s[3] = new PointF((float) ((d15 - dFti) - d16), (float) ((d17 - dGvn7) - d18));
                return;
            }
            if (i2 == 3) {
                float f19 = f6 + f3;
                float f20 = this.f90329toq;
                float f21 = f9 - f4;
                this.f41789k = new RectF(f19, (f9 - (f20 * 2.0f)) - f4, (f20 * 2.0f) + f19, f21);
                double d23 = dEqxt + dHyr;
                double d24 = f19;
                this.f41793y[0] = new PointF((float) (d23 + dM26625c + d24), f21);
                this.f41793y[1] = new PointF((float) (d23 + d24), f21);
                this.f41793y[2] = new PointF((float) (dEqxt + d24), f21);
                float f22 = (float) (dJp0y + d24);
                double d25 = f9;
                double d26 = f4;
                this.f41793y[3] = new PointF(f22, (float) ((d25 - dD3) - d26));
                this.f41792s[0] = new PointF((float) (dFti + d24), (float) ((d25 - dGvn7) - d26));
                double d27 = d25 - dOc;
                this.f41792s[1] = new PointF(f19, (float) (d27 - d26));
                double d28 = d27 - dN5r1;
                this.f41792s[2] = new PointF(f19, (float) (d28 - d26));
                this.f41792s[3] = new PointF(f19, (float) ((d28 - dM26626f) - d26));
            }
        }
    }

    /* JADX INFO: renamed from: miuix.smooth.y$toq */
    /* JADX INFO: compiled from: SmoothPathProvider.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public float f41795k;

        /* JADX INFO: renamed from: q */
        public float f41797q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public float f90332toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public double f90333zy;

        /* JADX INFO: renamed from: n */
        public k f41796n = null;

        /* JADX INFO: renamed from: g */
        public k f41794g = null;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public k f90331f7l8 = null;

        /* JADX INFO: renamed from: y */
        public k f41798y = null;

        public toq(float f2, float f3, double d2, float f4) {
            this.f41795k = f2;
            this.f90332toq = f3;
            this.f90333zy = d2;
            this.f41797q = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double a9(double d2, double d4) {
        if (d4 == 0.0d) {
            return 0.0d;
        }
        double d5 = d4 / 2.0d;
        return (((((d2 * 0.46000000834465027d) + Math.tan(d5)) * 2.0d) * (Math.cos(d4) + 1.0d)) / (Math.tan(d5) * 3.0d)) - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static double m26625c(double d2, double d4) {
        return d2 * d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double d2ok(double d2) {
        return (d2 * 180.0d) / 3.141592653589793d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double d3(float f2, double d2) {
        return ((double) f2) * (1.0d - Math.cos(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double dd(float f2, float f3, double d2, float f4) {
        return m26635t(f2, f3, f3, d2, f4) ? Math.max(Math.min(((f2 / (f3 * 2.0f)) - 1.0f) / f4, 1.0f), 0.0f) : d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double eqxt(float f2, double d2) {
        return ((double) f2) * (1.0d - Math.tan(d2 / 2.0d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static double m26626f(double d2, double d4) {
        return d2 * d4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double fti(float f2, double d2) {
        return ((double) f2) * (1.0d - Math.cos(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double gvn7(float f2, double d2) {
        return ((double) f2) * (1.0d - Math.sin(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double hyr(float f2, double d2) {
        return ((((double) f2) * 1.5d) * Math.tan(d2 / 2.0d)) / (Math.cos(d2) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double jk(double d2, double d4) {
        if (d4 == 0.0d) {
            return 0.0d;
        }
        double d5 = d4 / 2.0d;
        return (((((d2 * 0.46000000834465027d) + Math.tan(d5)) * 2.0d) * (Math.cos(d4) + 1.0d)) / (Math.tan(d5) * 3.0d)) - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double jp0y(float f2, double d2) {
        return ((double) f2) * (1.0d - Math.sin(d2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static double m26630l(double d2) {
        return (d2 * 3.141592653589793d) / 4.0d;
    }

    private static boolean mcp(float f2, float f3, float f4, double d2, float f5) {
        return ((double) f2) <= ((double) (f3 + f4)) * ((d2 * ((double) f5)) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double n5r1(float f2, double d2) {
        return ((((double) f2) * 1.5d) * Math.tan(d2 / 2.0d)) / (Math.cos(d2) + 1.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double ncyb(double d2) {
        return (d2 * 3.141592653589793d) / 4.0d;
    }

    private void ni7() {
        toq toqVar = this.f41786k;
        if (toqVar.f41796n == null) {
            toqVar.f41796n = new k();
        }
        toq toqVar2 = this.f41786k;
        if (toqVar2.f41794g == null) {
            toqVar2.f41794g = new k();
        }
        toq toqVar3 = this.f41786k;
        if (toqVar3.f90331f7l8 == null) {
            toqVar3.f90331f7l8 = new k();
        }
        toq toqVar4 = this.f41786k;
        if (toqVar4.f41798y == null) {
            toqVar4.f41798y = new k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double oc(float f2, double d2) {
        return ((double) f2) * (1.0d - Math.tan(d2 / 2.0d));
    }

    /* JADX INFO: renamed from: t */
    private static boolean m26635t(float f2, float f3, float f4, double d2, float f5) {
        return ((double) f2) <= ((double) (f3 + f4)) * ((d2 * ((double) f5)) + 1.0d);
    }

    private boolean wvg() {
        toq toqVar = this.f41786k;
        return toqVar.f41796n == null || toqVar.f41794g == null || toqVar.f90331f7l8 == null || toqVar.f41798y == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double x9kr(float f2, float f3, double d2, float f4) {
        return mcp(f2, f3, f3, d2, f4) ? Math.max(Math.min(((f2 / (f3 * 2.0f)) - 1.0f) / f4, 1.0f), 0.0f) : d2;
    }

    public void fn3e(RectF rectF, float[] fArr, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float fFu4 = fu4();
        float fM26639z = m26639z();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        double d2 = fM26639z;
        this.f41786k = new toq(fWidth, fHeight, d2, fFu4);
        if (fArr == null) {
            return;
        }
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        for (int i2 = 0; i2 < Math.min(8, fArr.length); i2++) {
            if (!Float.isNaN(fArr[i2])) {
                fArr2[i2] = fArr[i2];
            }
        }
        float f8 = fArr2[0];
        float f9 = fArr2[1];
        float f10 = fArr2[2];
        float f11 = fArr2[3];
        float f12 = fArr2[4];
        float f13 = fArr2[5];
        float f14 = fArr2[6];
        float f15 = fArr2[7];
        if (f8 + f10 > fWidth) {
            float f16 = (fWidth * f8) / (f8 + f10);
            f10 = (fWidth * f10) / (f8 + f10);
            f8 = f16;
        }
        float f17 = f10;
        if (f11 + f13 > fHeight) {
            float f18 = (fHeight * f11) / (f11 + f13);
            f13 = (fHeight * f13) / (f11 + f13);
            f4 = f18;
        } else {
            f4 = f11;
        }
        if (f12 + f14 > fWidth) {
            float f19 = (fWidth * f12) / (f12 + f14);
            f5 = (fWidth * f14) / (f12 + f14);
            f6 = f19;
        } else {
            f5 = f14;
            f6 = f12;
        }
        if (f15 + f9 > fHeight) {
            float f20 = (fHeight * f15) / (f15 + f9);
            f9 = (fHeight * f9) / (f15 + f9);
            f7 = f20;
        } else {
            f7 = f15;
        }
        ni7();
        this.f41786k.f41796n.m26640k(Math.min(f8, f9), rectF, f2, f3, d2, fFu4, 0);
        this.f41786k.f41794g.m26640k(Math.min(f17, f4), rectF, f2, f3, d2, fFu4, 1);
        this.f41786k.f90331f7l8.m26640k(Math.min(f6, f13), rectF, f2, f3, d2, fFu4, 2);
        this.f41786k.f41798y.m26640k(Math.min(f5, f7), rectF, f2, f3, d2, fFu4, 3);
    }

    float fu4() {
        return this.f90324zy;
    }

    /* JADX INFO: renamed from: i */
    public void m26637i(RectF rectF, float[] fArr) {
        fn3e(rectF, fArr, 0.0f, 0.0f);
    }

    public void ki(RectF rectF, float f2) {
        t8r(rectF, f2, 0.0f, 0.0f);
    }

    void lvui(float f2) {
        this.f90324zy = f2;
    }

    public Path o1t(Path path) {
        Path path2 = path == null ? new Path() : path;
        path2.reset();
        if (wvg()) {
            toq toqVar = this.f41786k;
            path2.addRect(new RectF(0.0f, 0.0f, toqVar.f41795k, toqVar.f90332toq), Path.Direction.CCW);
            return path2;
        }
        k kVar = this.f41786k.f41796n;
        if (kVar.f90328f7l8 != 0.0f) {
            path2.arcTo(kVar.f41789k, (float) d2ok(kVar.f41788g + 3.141592653589793d), this.f41786k.f41796n.f90328f7l8);
        } else {
            PointF pointF = kVar.f41793y[0];
            path2.moveTo(pointF.x, pointF.y);
        }
        k kVar2 = this.f41786k.f41796n;
        if (kVar2.f90330zy != 0.0d) {
            PointF[] pointFArr = kVar2.f41793y;
            PointF pointF2 = pointFArr[1];
            float f2 = pointF2.x;
            float f3 = pointF2.y;
            PointF pointF3 = pointFArr[2];
            float f4 = pointF3.x;
            float f5 = pointF3.y;
            PointF pointF4 = pointFArr[3];
            path2.cubicTo(f2, f3, f4, f5, pointF4.x, pointF4.y);
        }
        toq toqVar2 = this.f41786k;
        if (!mcp(toqVar2.f41795k, toqVar2.f41796n.f90329toq, toqVar2.f41794g.f90329toq, toqVar2.f90333zy, toqVar2.f41797q)) {
            PointF pointF5 = this.f41786k.f41794g.f41793y[0];
            path2.lineTo(pointF5.x, pointF5.y);
        }
        k kVar3 = this.f41786k.f41794g;
        if (kVar3.f90330zy != 0.0d) {
            PointF[] pointFArr2 = kVar3.f41793y;
            PointF pointF6 = pointFArr2[1];
            float f6 = pointF6.x;
            float f7 = pointF6.y;
            PointF pointF7 = pointFArr2[2];
            float f8 = pointF7.x;
            float f9 = pointF7.y;
            PointF pointF8 = pointFArr2[3];
            path2.cubicTo(f6, f7, f8, f9, pointF8.x, pointF8.y);
        }
        k kVar4 = this.f41786k.f41794g;
        if (kVar4.f90328f7l8 != 0.0f) {
            path2.arcTo(kVar4.f41789k, (float) d2ok(kVar4.f41790n + 4.71238898038469d), this.f41786k.f41794g.f90328f7l8);
        }
        k kVar5 = this.f41786k.f41794g;
        if (kVar5.f41791q != 0.0d) {
            PointF[] pointFArr3 = kVar5.f41792s;
            PointF pointF9 = pointFArr3[1];
            float f10 = pointF9.x;
            float f11 = pointF9.y;
            PointF pointF10 = pointFArr3[2];
            float f12 = pointF10.x;
            float f13 = pointF10.y;
            PointF pointF11 = pointFArr3[3];
            path2.cubicTo(f10, f11, f12, f13, pointF11.x, pointF11.y);
        }
        toq toqVar3 = this.f41786k;
        if (!m26635t(toqVar3.f90332toq, toqVar3.f41794g.f90329toq, toqVar3.f90331f7l8.f90329toq, toqVar3.f90333zy, toqVar3.f41797q)) {
            PointF pointF12 = this.f41786k.f90331f7l8.f41792s[0];
            path2.lineTo(pointF12.x, pointF12.y);
        }
        k kVar6 = this.f41786k.f90331f7l8;
        if (kVar6.f41791q != 0.0d) {
            PointF[] pointFArr4 = kVar6.f41792s;
            PointF pointF13 = pointFArr4[1];
            float f14 = pointF13.x;
            float f15 = pointF13.y;
            PointF pointF14 = pointFArr4[2];
            float f16 = pointF14.x;
            float f17 = pointF14.y;
            PointF pointF15 = pointFArr4[3];
            path2.cubicTo(f14, f15, f16, f17, pointF15.x, pointF15.y);
        }
        k kVar7 = this.f41786k.f90331f7l8;
        if (kVar7.f90328f7l8 != 0.0f) {
            path2.arcTo(kVar7.f41789k, (float) d2ok(kVar7.f41788g), this.f41786k.f90331f7l8.f90328f7l8);
        }
        k kVar8 = this.f41786k.f90331f7l8;
        if (kVar8.f90330zy != 0.0d) {
            PointF[] pointFArr5 = kVar8.f41793y;
            PointF pointF16 = pointFArr5[1];
            float f18 = pointF16.x;
            float f19 = pointF16.y;
            PointF pointF17 = pointFArr5[2];
            float f20 = pointF17.x;
            float f21 = pointF17.y;
            PointF pointF18 = pointFArr5[3];
            path2.cubicTo(f18, f19, f20, f21, pointF18.x, pointF18.y);
        }
        toq toqVar4 = this.f41786k;
        if (!mcp(toqVar4.f41795k, toqVar4.f90331f7l8.f90329toq, toqVar4.f41798y.f90329toq, toqVar4.f90333zy, toqVar4.f41797q)) {
            PointF pointF19 = this.f41786k.f41798y.f41793y[0];
            path2.lineTo(pointF19.x, pointF19.y);
        }
        k kVar9 = this.f41786k.f41798y;
        if (kVar9.f90330zy != 0.0d) {
            PointF[] pointFArr6 = kVar9.f41793y;
            PointF pointF20 = pointFArr6[1];
            float f22 = pointF20.x;
            float f23 = pointF20.y;
            PointF pointF21 = pointFArr6[2];
            float f24 = pointF21.x;
            float f25 = pointF21.y;
            PointF pointF22 = pointFArr6[3];
            path2.cubicTo(f22, f23, f24, f25, pointF22.x, pointF22.y);
        }
        k kVar10 = this.f41786k.f41798y;
        if (kVar10.f90328f7l8 != 0.0f) {
            path2.arcTo(kVar10.f41789k, (float) d2ok(kVar10.f41790n + 1.5707963267948966d), this.f41786k.f41798y.f90328f7l8);
        }
        k kVar11 = this.f41786k.f41798y;
        if (kVar11.f41791q != 0.0d) {
            PointF[] pointFArr7 = kVar11.f41792s;
            PointF pointF23 = pointFArr7[1];
            float f26 = pointF23.x;
            float f27 = pointF23.y;
            PointF pointF24 = pointFArr7[2];
            float f28 = pointF24.x;
            float f29 = pointF24.y;
            PointF pointF25 = pointFArr7[3];
            path2.cubicTo(f26, f27, f28, f29, pointF25.x, pointF25.y);
        }
        toq toqVar5 = this.f41786k;
        if (!m26635t(toqVar5.f90332toq, toqVar5.f41798y.f90329toq, toqVar5.f41796n.f90329toq, toqVar5.f90333zy, toqVar5.f41797q)) {
            PointF pointF26 = this.f41786k.f41796n.f41792s[0];
            path2.lineTo(pointF26.x, pointF26.y);
        }
        k kVar12 = this.f41786k.f41796n;
        if (kVar12.f41791q != 0.0d) {
            PointF[] pointFArr8 = kVar12.f41792s;
            PointF pointF27 = pointFArr8[1];
            float f30 = pointF27.x;
            float f31 = pointF27.y;
            PointF pointF28 = pointFArr8[2];
            float f32 = pointF28.x;
            float f33 = pointF28.y;
            PointF pointF29 = pointFArr8[3];
            path2.cubicTo(f30, f31, f32, f33, pointF29.x, pointF29.y);
        }
        path2.close();
        return path2;
    }

    /* JADX INFO: renamed from: r */
    void m26638r(float f2) {
        this.f90323toq = f2;
    }

    public void t8r(RectF rectF, float f2, float f3, float f4) {
        fn3e(rectF, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, f3, f4);
    }

    /* JADX INFO: renamed from: z */
    float m26639z() {
        return this.f90323toq;
    }

    public void zurt(Canvas canvas, Paint paint, int i2, int i3, int i4) {
        if (wvg()) {
            paint.setColor(i2);
            toq toqVar = this.f41786k;
            canvas.drawRect(new RectF(0.0f, 0.0f, toqVar.f41795k, toqVar.f90332toq), paint);
            return;
        }
        PointF pointF = new PointF();
        paint.setColor(i3);
        k kVar = this.f41786k.f41796n;
        canvas.drawArc(kVar.f41789k, (float) d2ok(kVar.f41788g + 3.141592653589793d), this.f41786k.f41796n.f90328f7l8, false, paint);
        k kVar2 = this.f41786k.f41796n;
        PointF pointF2 = kVar2.f41793y[0];
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        if (kVar2.f90330zy != 0.0d) {
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr = this.f41786k.f41796n.f41793y;
            PointF pointF3 = pointFArr[1];
            float f2 = pointF3.x;
            float f3 = pointF3.y;
            PointF pointF4 = pointFArr[2];
            float f4 = pointF4.x;
            float f5 = pointF4.y;
            PointF pointF5 = pointFArr[3];
            path.cubicTo(f2, f3, f4, f5, pointF5.x, pointF5.y);
            paint.setColor(i4);
            canvas.drawPath(path, paint);
            PointF pointF6 = this.f41786k.f41796n.f41793y[3];
            pointF.x = pointF6.x;
            pointF.y = pointF6.y;
        }
        toq toqVar2 = this.f41786k;
        if (!mcp(toqVar2.f41795k, toqVar2.f41796n.f90329toq, toqVar2.f41794g.f90329toq, toqVar2.f90333zy, toqVar2.f41797q)) {
            paint.setColor(i2);
            float f6 = pointF.x;
            float f7 = pointF.y;
            PointF pointF7 = this.f41786k.f41794g.f41793y[0];
            canvas.drawLine(f6, f7, pointF7.x, pointF7.y, paint);
            PointF pointF8 = this.f41786k.f41794g.f41793y[0];
            pointF.x = pointF8.x;
            pointF.y = pointF8.y;
        }
        if (this.f41786k.f41794g.f90330zy != 0.0d) {
            Path path2 = new Path();
            path2.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr2 = this.f41786k.f41794g.f41793y;
            PointF pointF9 = pointFArr2[1];
            float f8 = pointF9.x;
            float f9 = pointF9.y;
            PointF pointF10 = pointFArr2[2];
            float f10 = pointF10.x;
            float f11 = pointF10.y;
            PointF pointF11 = pointFArr2[3];
            path2.cubicTo(f8, f9, f10, f11, pointF11.x, pointF11.y);
            paint.setColor(i4);
            canvas.drawPath(path2, paint);
            PointF pointF12 = this.f41786k.f41794g.f41793y[3];
            pointF.x = pointF12.x;
            pointF.y = pointF12.y;
        }
        paint.setColor(i3);
        k kVar3 = this.f41786k.f41794g;
        canvas.drawArc(kVar3.f41789k, (float) d2ok(kVar3.f41790n + 4.71238898038469d), this.f41786k.f41794g.f90328f7l8, false, paint);
        k kVar4 = this.f41786k.f41794g;
        PointF pointF13 = kVar4.f41792s[0];
        pointF.x = pointF13.x;
        pointF.y = pointF13.y;
        if (kVar4.f41791q != 0.0d) {
            Path path3 = new Path();
            path3.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr3 = this.f41786k.f41794g.f41792s;
            PointF pointF14 = pointFArr3[1];
            float f12 = pointF14.x;
            float f13 = pointF14.y;
            PointF pointF15 = pointFArr3[2];
            float f14 = pointF15.x;
            float f15 = pointF15.y;
            PointF pointF16 = pointFArr3[3];
            path3.cubicTo(f12, f13, f14, f15, pointF16.x, pointF16.y);
            paint.setColor(i4);
            canvas.drawPath(path3, paint);
            PointF pointF17 = this.f41786k.f41794g.f41792s[3];
            pointF.x = pointF17.x;
            pointF.y = pointF17.y;
        }
        toq toqVar3 = this.f41786k;
        if (!m26635t(toqVar3.f90332toq, toqVar3.f41794g.f90329toq, toqVar3.f90331f7l8.f90329toq, toqVar3.f90333zy, toqVar3.f41797q)) {
            paint.setColor(i2);
            float f16 = pointF.x;
            float f17 = pointF.y;
            PointF pointF18 = this.f41786k.f90331f7l8.f41792s[0];
            canvas.drawLine(f16, f17, pointF18.x, pointF18.y, paint);
            PointF pointF19 = this.f41786k.f90331f7l8.f41792s[0];
            pointF.x = pointF19.x;
            pointF.y = pointF19.y;
        }
        if (this.f41786k.f90331f7l8.f41791q != 0.0d) {
            Path path4 = new Path();
            path4.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr4 = this.f41786k.f90331f7l8.f41792s;
            PointF pointF20 = pointFArr4[1];
            float f18 = pointF20.x;
            float f19 = pointF20.y;
            PointF pointF21 = pointFArr4[2];
            float f20 = pointF21.x;
            float f21 = pointF21.y;
            PointF pointF22 = pointFArr4[3];
            path4.cubicTo(f18, f19, f20, f21, pointF22.x, pointF22.y);
            paint.setColor(i4);
            canvas.drawPath(path4, paint);
            PointF pointF23 = this.f41786k.f90331f7l8.f41792s[3];
            pointF.x = pointF23.x;
            pointF.y = pointF23.y;
        }
        paint.setColor(i3);
        k kVar5 = this.f41786k.f90331f7l8;
        canvas.drawArc(kVar5.f41789k, (float) d2ok(kVar5.f41788g), this.f41786k.f90331f7l8.f90328f7l8, false, paint);
        k kVar6 = this.f41786k.f90331f7l8;
        PointF pointF24 = kVar6.f41793y[0];
        pointF.x = pointF24.x;
        pointF.y = pointF24.y;
        if (kVar6.f90330zy != 0.0d) {
            Path path5 = new Path();
            path5.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr5 = this.f41786k.f90331f7l8.f41793y;
            PointF pointF25 = pointFArr5[1];
            float f22 = pointF25.x;
            float f23 = pointF25.y;
            PointF pointF26 = pointFArr5[2];
            float f24 = pointF26.x;
            float f25 = pointF26.y;
            PointF pointF27 = pointFArr5[3];
            path5.cubicTo(f22, f23, f24, f25, pointF27.x, pointF27.y);
            paint.setColor(i4);
            canvas.drawPath(path5, paint);
            PointF pointF28 = this.f41786k.f90331f7l8.f41793y[3];
            pointF.x = pointF28.x;
            pointF.y = pointF28.y;
        }
        toq toqVar4 = this.f41786k;
        if (!mcp(toqVar4.f41795k, toqVar4.f90331f7l8.f90329toq, toqVar4.f41798y.f90329toq, toqVar4.f90333zy, toqVar4.f41797q)) {
            paint.setColor(i2);
            float f26 = pointF.x;
            float f27 = pointF.y;
            PointF pointF29 = this.f41786k.f41798y.f41793y[0];
            canvas.drawLine(f26, f27, pointF29.x, pointF29.y, paint);
            PointF pointF30 = this.f41786k.f41798y.f41793y[0];
            pointF.x = pointF30.x;
            pointF.y = pointF30.y;
        }
        if (this.f41786k.f41798y.f90330zy != 0.0d) {
            Path path6 = new Path();
            path6.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr6 = this.f41786k.f41798y.f41793y;
            PointF pointF31 = pointFArr6[1];
            float f28 = pointF31.x;
            float f29 = pointF31.y;
            PointF pointF32 = pointFArr6[2];
            float f30 = pointF32.x;
            float f31 = pointF32.y;
            PointF pointF33 = pointFArr6[3];
            path6.cubicTo(f28, f29, f30, f31, pointF33.x, pointF33.y);
            paint.setColor(i4);
            canvas.drawPath(path6, paint);
            PointF pointF34 = this.f41786k.f41798y.f41793y[3];
            pointF.x = pointF34.x;
            pointF.y = pointF34.y;
        }
        paint.setColor(i3);
        k kVar7 = this.f41786k.f41798y;
        canvas.drawArc(kVar7.f41789k, (float) d2ok(kVar7.f41790n + 1.5707963267948966d), this.f41786k.f41798y.f90328f7l8, false, paint);
        k kVar8 = this.f41786k.f41798y;
        PointF pointF35 = kVar8.f41792s[0];
        pointF.x = pointF35.x;
        pointF.y = pointF35.y;
        if (kVar8.f41791q != 0.0d) {
            Path path7 = new Path();
            path7.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr7 = this.f41786k.f41798y.f41792s;
            PointF pointF36 = pointFArr7[1];
            float f32 = pointF36.x;
            float f33 = pointF36.y;
            PointF pointF37 = pointFArr7[2];
            float f34 = pointF37.x;
            float f35 = pointF37.y;
            PointF pointF38 = pointFArr7[3];
            path7.cubicTo(f32, f33, f34, f35, pointF38.x, pointF38.y);
            paint.setColor(i4);
            canvas.drawPath(path7, paint);
            PointF pointF39 = this.f41786k.f41798y.f41792s[3];
            pointF.x = pointF39.x;
            pointF.y = pointF39.y;
        }
        toq toqVar5 = this.f41786k;
        if (!m26635t(toqVar5.f90332toq, toqVar5.f41798y.f90329toq, toqVar5.f41796n.f90329toq, toqVar5.f90333zy, toqVar5.f41797q)) {
            paint.setColor(i2);
            float f36 = pointF.x;
            float f37 = pointF.y;
            PointF pointF40 = this.f41786k.f41796n.f41792s[0];
            canvas.drawLine(f36, f37, pointF40.x, pointF40.y, paint);
            PointF pointF41 = this.f41786k.f41796n.f41792s[0];
            pointF.x = pointF41.x;
            pointF.y = pointF41.y;
        }
        if (this.f41786k.f41796n.f41791q != 0.0d) {
            Path path8 = new Path();
            path8.moveTo(pointF.x, pointF.y);
            PointF[] pointFArr8 = this.f41786k.f41796n.f41792s;
            PointF pointF42 = pointFArr8[1];
            float f38 = pointF42.x;
            float f39 = pointF42.y;
            PointF pointF43 = pointFArr8[2];
            float f40 = pointF43.x;
            float f41 = pointF43.y;
            PointF pointF44 = pointFArr8[3];
            path8.cubicTo(f38, f39, f40, f41, pointF44.x, pointF44.y);
            paint.setColor(i4);
            canvas.drawPath(path8, paint);
            PointF pointF45 = this.f41786k.f41796n.f41792s[3];
            pointF.x = pointF45.x;
            pointF.y = pointF45.y;
        }
    }
}
