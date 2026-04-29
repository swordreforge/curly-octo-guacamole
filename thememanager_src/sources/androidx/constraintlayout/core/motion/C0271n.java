package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.key.C0269n;
import androidx.constraintlayout.core.motion.utils.C0284q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.n */
/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
public class C0271n implements Comparable<C0271n> {

    /* JADX INFO: renamed from: a */
    public static final boolean f1505a = false;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    static final int f47246ab = 5;
    static String[] an = {"position", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "width", InterfaceC1925p.byf, "pathRotate"};

    /* JADX INFO: renamed from: b */
    public static final String f1506b = "MotionPaths";
    public static final int bb = 1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    static final int f47247bo = 1;
    public static final int bp = 0;
    public static final int bv = 2;

    /* JADX INFO: renamed from: d */
    static final int f1507d = 3;

    /* JADX INFO: renamed from: u */
    static final int f1508u = 0;

    /* JADX INFO: renamed from: v */
    static final int f1509v = 2;

    /* JADX INFO: renamed from: w */
    static final int f1510w = 4;

    /* JADX INFO: renamed from: x */
    public static final boolean f1511x = false;

    /* JADX INFO: renamed from: c */
    HashMap<String, toq> f1512c;

    /* JADX INFO: renamed from: e */
    int f1513e;

    /* JADX INFO: renamed from: f */
    zy f1514f;

    /* JADX INFO: renamed from: g */
    float f1515g;

    /* JADX INFO: renamed from: h */
    float f1516h;

    /* JADX INFO: renamed from: i */
    float f1517i;

    /* JADX INFO: renamed from: j */
    int f1518j;

    /* JADX INFO: renamed from: k */
    C0284q f1519k;

    /* JADX INFO: renamed from: l */
    float f1520l;

    /* JADX INFO: renamed from: m */
    double[] f1521m;

    /* JADX INFO: renamed from: n */
    float f1522n;

    /* JADX INFO: renamed from: o */
    double[] f1523o;

    /* JADX INFO: renamed from: p */
    float f1524p;

    /* JADX INFO: renamed from: q */
    int f1525q;

    /* JADX INFO: renamed from: r */
    int f1526r;

    /* JADX INFO: renamed from: s */
    float f1527s;

    /* JADX INFO: renamed from: t */
    int f1528t;

    /* JADX INFO: renamed from: y */
    float f1529y;

    /* JADX INFO: renamed from: z */
    float f1530z;

    public C0271n() {
        this.f1525q = 0;
        this.f1517i = Float.NaN;
        this.f1530z = Float.NaN;
        this.f1528t = -1;
        this.f1526r = -1;
        this.f1520l = Float.NaN;
        this.f1514f = null;
        this.f1512c = new HashMap<>();
        this.f1513e = 0;
        this.f1523o = new double[18];
        this.f1521m = new double[18];
    }

    /* JADX INFO: renamed from: n */
    private boolean m959n(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) != Float.isNaN(f3) : Math.abs(f2 - f3) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: t */
    private static final float m960t(float f2, float f3, float f4, float f5, float f6, float f7) {
        return ((f6 - f4) * f2) + ((f7 - f5) * f3) + f5;
    }

    private static final float wvg(float f2, float f3, float f4, float f5, float f6, float f7) {
        return (((f6 - f4) * f3) - ((f7 - f5) * f2)) + f4;
    }

    boolean cdj(String str) {
        return this.f1512c.containsKey(str);
    }

    void f7l8(C0271n c0271n, boolean[] zArr, String[] strArr, boolean z2) {
        boolean zM959n = m959n(this.f1529y, c0271n.f1529y);
        boolean zM959n2 = m959n(this.f1527s, c0271n.f1527s);
        zArr[0] = zArr[0] | m959n(this.f1515g, c0271n.f1515g);
        boolean z3 = zM959n | zM959n2 | z2;
        zArr[1] = zArr[1] | z3;
        zArr[2] = z3 | zArr[2];
        zArr[3] = zArr[3] | m959n(this.f1524p, c0271n.f1524p);
        zArr[4] = m959n(this.f1516h, c0271n.f1516h) | zArr[4];
    }

    void fn3e(int i2, int i3, C0269n c0269n, C0271n c0271n, C0271n c0271n2) {
        float fMin;
        float f2;
        float f3 = c0269n.f1500y / 100.0f;
        this.f1522n = f3;
        this.f1525q = c0269n.f1484t;
        this.f1513e = c0269n.f47184d3;
        float f4 = Float.isNaN(c0269n.f47190mcp) ? f3 : c0269n.f47190mcp;
        float f5 = Float.isNaN(c0269n.f47188jk) ? f3 : c0269n.f47188jk;
        float f6 = c0271n2.f1524p;
        float f7 = c0271n.f1524p;
        float f8 = c0271n2.f1516h;
        float f9 = c0271n.f1516h;
        this.f1515g = this.f1522n;
        this.f1524p = (int) (f7 + ((f6 - f7) * f4));
        this.f1516h = (int) (f9 + ((f8 - f9) * f5));
        int i4 = c0269n.f47184d3;
        if (i4 == 1) {
            float f10 = Float.isNaN(c0269n.f47183a9) ? f3 : c0269n.f47183a9;
            float f11 = c0271n2.f1529y;
            float f12 = c0271n.f1529y;
            this.f1529y = (f10 * (f11 - f12)) + f12;
            if (!Float.isNaN(c0269n.f47186fti)) {
                f3 = c0269n.f47186fti;
            }
            float f13 = c0271n2.f1527s;
            float f14 = c0271n.f1527s;
            this.f1527s = (f3 * (f13 - f14)) + f14;
        } else if (i4 != 2) {
            float f15 = Float.isNaN(c0269n.f47183a9) ? f3 : c0269n.f47183a9;
            float f16 = c0271n2.f1529y;
            float f17 = c0271n.f1529y;
            this.f1529y = (f15 * (f16 - f17)) + f17;
            if (!Float.isNaN(c0269n.f47186fti)) {
                f3 = c0269n.f47186fti;
            }
            float f18 = c0271n2.f1527s;
            float f19 = c0271n.f1527s;
            this.f1527s = (f3 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(c0269n.f47183a9)) {
                float f20 = c0271n2.f1529y;
                float f21 = c0271n.f1529y;
                fMin = ((f20 - f21) * f3) + f21;
            } else {
                fMin = Math.min(f5, f4) * c0269n.f47183a9;
            }
            this.f1529y = fMin;
            if (Float.isNaN(c0269n.f47186fti)) {
                float f22 = c0271n2.f1527s;
                float f23 = c0271n.f1527s;
                f2 = (f3 * (f22 - f23)) + f23;
            } else {
                f2 = c0269n.f47186fti;
            }
            this.f1527s = f2;
        }
        this.f1526r = c0271n.f1526r;
        this.f1519k = C0284q.zy(c0269n.f47191o1t);
        this.f1528t = c0269n.f47193wvg;
    }

    void fu4(float f2, float f3, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f8 = (float) dArr[i2];
            double d2 = dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f4 = f8;
            } else if (i3 == 2) {
                f6 = f8;
            } else if (i3 == 3) {
                f5 = f8;
            } else if (i3 == 4) {
                f7 = f8;
            }
        }
        float f9 = f4 - ((0.0f * f5) / 2.0f);
        float f10 = f6 - ((0.0f * f7) / 2.0f);
        fArr[0] = (f9 * (1.0f - f2)) + (((f5 * 1.0f) + f9) * f2) + 0.0f;
        fArr[1] = (f10 * (1.0f - f3)) + (((f7 * 1.0f) + f10) * f3) + 0.0f;
    }

    /* JADX INFO: renamed from: h */
    void m961h(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f2 = this.f1529y;
        float fCos = this.f1527s;
        float f3 = this.f1524p;
        float f4 = this.f1516h;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f5 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                f2 = f5;
            } else if (i4 == 2) {
                fCos = f5;
            } else if (i4 == 3) {
                f3 = f5;
            } else if (i4 == 4) {
                f4 = f5;
            }
        }
        zy zyVar = this.f1514f;
        if (zyVar != null) {
            float fT8r = zyVar.t8r();
            float fM1100i = this.f1514f.m1100i();
            double d2 = f2;
            double d4 = fCos;
            float fSin = (float) ((((double) fT8r) + (Math.sin(d4) * d2)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) fM1100i) - (d2 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
            f2 = fSin;
        }
        float f6 = f3 + f2;
        float f7 = f4 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i5 = i2 + 1;
        fArr[i2] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = fCos + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f6 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = fCos + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f6 + 0.0f;
        int i10 = i9 + 1;
        fArr[i9] = f7 + 0.0f;
        fArr[i10] = f2 + 0.0f;
        fArr[i10 + 1] = f7 + 0.0f;
    }

    /* JADX INFO: renamed from: i */
    void m962i(C0269n c0269n, C0271n c0271n, C0271n c0271n2) {
        float f2 = c0269n.f1500y / 100.0f;
        this.f1522n = f2;
        this.f1525q = c0269n.f1484t;
        float f3 = Float.isNaN(c0269n.f47190mcp) ? f2 : c0269n.f47190mcp;
        float f4 = Float.isNaN(c0269n.f47188jk) ? f2 : c0269n.f47188jk;
        float f5 = c0271n2.f1524p - c0271n.f1524p;
        float f6 = c0271n2.f1516h - c0271n.f1516h;
        this.f1515g = this.f1522n;
        if (!Float.isNaN(c0269n.f47183a9)) {
            f2 = c0269n.f47183a9;
        }
        float f7 = c0271n.f1529y;
        float f8 = c0271n.f1524p;
        float f9 = c0271n.f1527s;
        float f10 = c0271n.f1516h;
        float f11 = (c0271n2.f1529y + (c0271n2.f1524p / 2.0f)) - ((f8 / 2.0f) + f7);
        float f12 = (c0271n2.f1527s + (c0271n2.f1516h / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = (f5 * f3) / 2.0f;
        this.f1529y = (int) ((f7 + f13) - f14);
        float f15 = f2 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.f1527s = (int) ((f9 + f15) - f16);
        this.f1524p = (int) (f8 + r7);
        this.f1516h = (int) (f10 + r8);
        float f17 = Float.isNaN(c0269n.f47186fti) ? 0.0f : c0269n.f47186fti;
        this.f1513e = 1;
        float f18 = (int) ((c0271n.f1529y + f13) - f14);
        float f19 = (int) ((c0271n.f1527s + f15) - f16);
        this.f1529y = f18 + ((-f12) * f17);
        this.f1527s = f19 + (f11 * f17);
        this.f1526r = this.f1526r;
        this.f1519k = C0284q.zy(c0269n.f47191o1t);
        this.f1528t = c0269n.f47193wvg;
    }

    void ki(C0269n c0269n, C0271n c0271n, C0271n c0271n2) {
        float f2 = c0269n.f1500y / 100.0f;
        this.f1522n = f2;
        this.f1525q = c0269n.f1484t;
        float f3 = Float.isNaN(c0269n.f47190mcp) ? f2 : c0269n.f47190mcp;
        float f4 = Float.isNaN(c0269n.f47188jk) ? f2 : c0269n.f47188jk;
        float f5 = c0271n2.f1524p;
        float f6 = c0271n.f1524p;
        float f7 = c0271n2.f1516h;
        float f8 = c0271n.f1516h;
        this.f1515g = this.f1522n;
        float f9 = c0271n.f1529y;
        float f10 = c0271n.f1527s;
        float f11 = (c0271n2.f1529y + (f5 / 2.0f)) - ((f6 / 2.0f) + f9);
        float f12 = (c0271n2.f1527s + (f7 / 2.0f)) - (f10 + (f8 / 2.0f));
        float f13 = ((f5 - f6) * f3) / 2.0f;
        this.f1529y = (int) ((f9 + (f11 * f2)) - f13);
        float f14 = ((f7 - f8) * f4) / 2.0f;
        this.f1527s = (int) ((f10 + (f12 * f2)) - f14);
        this.f1524p = (int) (f6 + r9);
        this.f1516h = (int) (f8 + r12);
        float f15 = Float.isNaN(c0269n.f47183a9) ? f2 : c0269n.f47183a9;
        float f16 = Float.isNaN(c0269n.f47187gvn7) ? 0.0f : c0269n.f47187gvn7;
        if (!Float.isNaN(c0269n.f47186fti)) {
            f2 = c0269n.f47186fti;
        }
        float f17 = Float.isNaN(c0269n.f47189jp0y) ? 0.0f : c0269n.f47189jp0y;
        this.f1513e = 0;
        this.f1529y = (int) (((c0271n.f1529y + (f15 * f11)) + (f17 * f12)) - f13);
        this.f1527s = (int) (((c0271n.f1527s + (f11 * f16)) + (f12 * f2)) - f14);
        this.f1519k = C0284q.zy(c0269n.f47191o1t);
        this.f1528t = c0269n.f47193wvg;
    }

    int kja0(String str) {
        toq toqVar = this.f1512c.get(str);
        if (toqVar == null) {
            return 0;
        }
        return toqVar.ki();
    }

    void ld6(double d2, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fSin = this.f1529y;
        float fCos = this.f1527s;
        float f2 = this.f1524p;
        float f3 = this.f1516h;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fSin = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        zy zyVar = this.f1514f;
        if (zyVar != null) {
            float[] fArr2 = new float[2];
            zyVar.ki(d2, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d4 = f5;
            double d5 = fSin;
            double d6 = fCos;
            fSin = (float) ((d4 + (Math.sin(d6) * d5)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d5 * Math.cos(d6))) - ((double) (f3 / 2.0f)));
        }
        fArr[i2] = fSin + (f2 / 2.0f) + 0.0f;
        fArr[i2 + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    int n7h(String str, double[] dArr, int i2) {
        toq toqVar = this.f1512c.get(str);
        int i3 = 0;
        if (toqVar == null) {
            return 0;
        }
        if (toqVar.ki() == 1) {
            dArr[i2] = toqVar.n7h();
            return 1;
        }
        int iKi = toqVar.ki();
        toqVar.kja0(new float[iKi]);
        while (i3 < iKi) {
            dArr[i2] = r2[i3];
            i3++;
            i2++;
        }
        return iKi;
    }

    void ni7(float f2, float f3, float f4, float f5) {
        this.f1529y = f2;
        this.f1527s = f3;
        this.f1524p = f4;
        this.f1516h = f5;
    }

    public void o1t(zy zyVar, C0271n c0271n) {
        double d2 = ((this.f1529y + (this.f1524p / 2.0f)) - c0271n.f1529y) - (c0271n.f1524p / 2.0f);
        double d4 = ((this.f1527s + (this.f1516h / 2.0f)) - c0271n.f1527s) - (c0271n.f1516h / 2.0f);
        this.f1514f = zyVar;
        this.f1529y = (float) Math.hypot(d4, d2);
        if (Float.isNaN(this.f1520l)) {
            this.f1527s = (float) (Math.atan2(d4, d2) + 1.5707963267948966d);
        } else {
            this.f1527s = (float) Math.toRadians(this.f1520l);
        }
    }

    /* JADX INFO: renamed from: p */
    void m963p(int[] iArr, double[] dArr, float[] fArr, int i2) {
        float f2 = this.f1524p;
        float f3 = this.f1516h;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        fArr[i2] = f2;
        fArr[i2 + 1] = f3;
    }

    /* JADX INFO: renamed from: q */
    public void m964q(zy zyVar) {
        zyVar.fti(this.f1530z);
    }

    void qrj(double d2, int[] iArr, double[] dArr, float[] fArr, int i2) {
        float fSin = this.f1529y;
        float fCos = this.f1527s;
        float f2 = this.f1524p;
        float f3 = this.f1516h;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            float f4 = (float) dArr[i3];
            int i4 = iArr[i3];
            if (i4 == 1) {
                fSin = f4;
            } else if (i4 == 2) {
                fCos = f4;
            } else if (i4 == 3) {
                f2 = f4;
            } else if (i4 == 4) {
                f3 = f4;
            }
        }
        zy zyVar = this.f1514f;
        if (zyVar != null) {
            float[] fArr2 = new float[2];
            zyVar.ki(d2, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d4 = f5;
            double d5 = fSin;
            double d6 = fCos;
            fSin = (float) ((d4 + (Math.sin(d6) * d5)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d5 * Math.cos(d6))) - ((double) (f3 / 2.0f)));
        }
        fArr[i2] = fSin + (f2 / 2.0f) + 0.0f;
        fArr[i2 + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: s */
    void m965s(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1515g, this.f1529y, this.f1527s, this.f1524p, this.f1516h, this.f1517i};
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < 6) {
                dArr[i2] = fArr[r4];
                i2++;
            }
        }
    }

    public void toq(C0265g c0265g) {
        this.f1519k = C0284q.zy(c0265g.f1439s.f47117zy);
        C0265g.k kVar = c0265g.f1439s;
        this.f1528t = kVar.f1446q;
        this.f1526r = kVar.f1443k;
        this.f1517i = kVar.f1448y;
        this.f1525q = kVar.f1444n;
        this.f1518j = kVar.f47115toq;
        this.f1530z = c0265g.f1438p.f1450q;
        this.f1520l = 0.0f;
        for (String str : c0265g.m936p()) {
            toq toqVarM939s = c0265g.m939s(str);
            if (toqVarM939s != null && toqVarM939s.cdj()) {
                this.f1512c.put(str, toqVarM939s);
            }
        }
    }

    void x2(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f2;
        float f3 = this.f1529y;
        float f4 = this.f1527s;
        float f5 = this.f1524p;
        float f6 = this.f1516h;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f11 = (float) dArr[i2];
            float f12 = (float) dArr2[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f3 = f11;
                f7 = f12;
            } else if (i3 == 2) {
                f4 = f11;
                f9 = f12;
            } else if (i3 == 3) {
                f5 = f11;
                f8 = f12;
            } else if (i3 == 4) {
                f6 = f11;
                f10 = f12;
            }
        }
        float f13 = 2.0f;
        float f14 = (f8 / 2.0f) + f7;
        float fCos = (f10 / 2.0f) + f9;
        zy zyVar = this.f1514f;
        if (zyVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            zyVar.ki(d2, fArr3, fArr4);
            float f15 = fArr3[0];
            float f16 = fArr3[1];
            float f17 = fArr4[0];
            float f18 = fArr4[1];
            double d4 = f3;
            double d5 = f4;
            f2 = f5;
            float fSin = (float) ((((double) f15) + (Math.sin(d5) * d4)) - ((double) (f5 / 2.0f)));
            float fCos2 = (float) ((((double) f16) - (d4 * Math.cos(d5))) - ((double) (f6 / 2.0f)));
            double d6 = f7;
            double d7 = f9;
            float fSin2 = (float) (((double) f17) + (Math.sin(d5) * d6) + (Math.cos(d5) * d7));
            fCos = (float) ((((double) f18) - (d6 * Math.cos(d5))) + (Math.sin(d5) * d7));
            f14 = fSin2;
            f3 = fSin;
            f4 = fCos2;
            f13 = 2.0f;
        } else {
            f2 = f5;
        }
        fArr[0] = f3 + (f2 / f13) + 0.0f;
        fArr[1] = f4 + (f6 / f13) + 0.0f;
        fArr2[0] = f14;
        fArr2[1] = fCos;
    }

    /* JADX INFO: renamed from: z */
    void m966z(float f2, C0265g c0265g, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f3;
        float f4;
        float f5 = this.f1529y;
        float f6 = this.f1527s;
        float f7 = this.f1524p;
        float f8 = this.f1516h;
        if (iArr.length != 0 && this.f1523o.length <= iArr[iArr.length - 1]) {
            int i2 = iArr[iArr.length - 1] + 1;
            this.f1523o = new double[i2];
            this.f1521m = new double[i2];
        }
        Arrays.fill(this.f1523o, Double.NaN);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            double[] dArr4 = this.f1523o;
            int i4 = iArr[i3];
            dArr4[i4] = dArr[i3];
            this.f1521m[i4] = dArr2[i3];
        }
        float f9 = Float.NaN;
        int i5 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            double[] dArr5 = this.f1523o;
            if (i5 >= dArr5.length) {
                break;
            }
            if (Double.isNaN(dArr5[i5]) && (dArr3 == null || dArr3[i5] == 0.0d)) {
                f4 = f9;
            } else {
                double d2 = dArr3 != null ? dArr3[i5] : 0.0d;
                if (!Double.isNaN(this.f1523o[i5])) {
                    d2 = this.f1523o[i5] + d2;
                }
                f4 = f9;
                float f14 = (float) d2;
                float f15 = (float) this.f1521m[i5];
                if (i5 == 1) {
                    f9 = f4;
                    f10 = f15;
                    f5 = f14;
                } else if (i5 == 2) {
                    f9 = f4;
                    f11 = f15;
                    f6 = f14;
                } else if (i5 == 3) {
                    f9 = f4;
                    f12 = f15;
                    f7 = f14;
                } else if (i5 == 4) {
                    f9 = f4;
                    f13 = f15;
                    f8 = f14;
                } else if (i5 == 5) {
                    f9 = f14;
                }
                i5++;
            }
            f9 = f4;
            i5++;
        }
        float f16 = f9;
        zy zyVar = this.f1514f;
        if (zyVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            zyVar.ki(f2, fArr, fArr2);
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr2[0];
            float f20 = fArr2[1];
            double d4 = f5;
            double d5 = f6;
            float fSin = (float) ((((double) f17) + (Math.sin(d5) * d4)) - ((double) (f7 / 2.0f)));
            f3 = f8;
            float fCos = (float) ((((double) f18) - (Math.cos(d5) * d4)) - ((double) (f8 / 2.0f)));
            double d6 = f10;
            double d7 = f11;
            float fSin2 = (float) (((double) f19) + (Math.sin(d5) * d6) + (Math.cos(d5) * d4 * d7));
            float fCos2 = (float) ((((double) f20) - (d6 * Math.cos(d5))) + (d4 * Math.sin(d5) * d7));
            if (dArr2.length >= 2) {
                dArr2[0] = fSin2;
                dArr2[1] = fCos2;
            }
            if (!Float.isNaN(f16)) {
                c0265g.m934l((float) (((double) f16) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f5 = fSin;
            f6 = fCos;
        } else {
            f3 = f8;
            if (!Float.isNaN(f16)) {
                c0265g.m934l((float) (((double) 0.0f) + ((double) f16) + Math.toDegrees(Math.atan2(f11 + (f13 / 2.0f), f10 + (f12 / 2.0f)))));
            }
        }
        float f21 = f5 + 0.5f;
        float f22 = f6 + 0.5f;
        c0265g.jp0y((int) f21, (int) f22, (int) (f21 + f7), (int) (f22 + f3));
    }

    void zurt(int i2, int i3, C0269n c0269n, C0271n c0271n, C0271n c0271n2) {
        float f2 = c0269n.f1500y / 100.0f;
        this.f1522n = f2;
        this.f1525q = c0269n.f1484t;
        float f3 = Float.isNaN(c0269n.f47190mcp) ? f2 : c0269n.f47190mcp;
        float f4 = Float.isNaN(c0269n.f47188jk) ? f2 : c0269n.f47188jk;
        float f5 = c0271n2.f1524p;
        float f6 = c0271n.f1524p;
        float f7 = c0271n2.f1516h;
        float f8 = c0271n.f1516h;
        this.f1515g = this.f1522n;
        float f9 = c0271n.f1529y;
        float f10 = c0271n.f1527s;
        float f11 = c0271n2.f1529y + (f5 / 2.0f);
        float f12 = c0271n2.f1527s + (f7 / 2.0f);
        float f13 = (f5 - f6) * f3;
        this.f1529y = (int) ((f9 + ((f11 - ((f6 / 2.0f) + f9)) * f2)) - (f13 / 2.0f));
        float f14 = (f7 - f8) * f4;
        this.f1527s = (int) ((f10 + ((f12 - (f10 + (f8 / 2.0f))) * f2)) - (f14 / 2.0f));
        this.f1524p = (int) (f6 + f13);
        this.f1516h = (int) (f8 + f14);
        this.f1513e = 2;
        if (!Float.isNaN(c0269n.f47183a9)) {
            this.f1529y = (int) (c0269n.f47183a9 * ((int) (i2 - this.f1524p)));
        }
        if (!Float.isNaN(c0269n.f47186fti)) {
            this.f1527s = (int) (c0269n.f47186fti * ((int) (i3 - this.f1516h)));
        }
        this.f1526r = this.f1526r;
        this.f1519k = C0284q.zy(c0269n.f47191o1t);
        this.f1528t = c0269n.f47193wvg;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0271n c0271n) {
        return Float.compare(this.f1515g, c0271n.f1515g);
    }

    public C0271n(int i2, int i3, C0269n c0269n, C0271n c0271n, C0271n c0271n2) {
        this.f1525q = 0;
        this.f1517i = Float.NaN;
        this.f1530z = Float.NaN;
        this.f1528t = -1;
        this.f1526r = -1;
        this.f1520l = Float.NaN;
        this.f1514f = null;
        this.f1512c = new HashMap<>();
        this.f1513e = 0;
        this.f1523o = new double[18];
        this.f1521m = new double[18];
        if (c0271n.f1526r != -1) {
            fn3e(i2, i3, c0269n, c0271n, c0271n2);
            return;
        }
        int i4 = c0269n.f47184d3;
        if (i4 == 1) {
            m962i(c0269n, c0271n, c0271n2);
        } else if (i4 != 2) {
            ki(c0269n, c0271n, c0271n2);
        } else {
            zurt(i2, i3, c0269n, c0271n, c0271n2);
        }
    }
}
