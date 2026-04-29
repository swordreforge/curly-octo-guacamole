package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.widget.C0395k;
import androidx.constraintlayout.widget.C0397q;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Arrays;
import java.util.LinkedHashMap;
import zy.lvui;

/* JADX INFO: compiled from: MotionPaths.java */
/* JADX INFO: loaded from: classes.dex */
class ki implements Comparable<ki> {

    /* JADX INFO: renamed from: a */
    public static final boolean f2258a = false;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    static final int f48119ab = 5;
    static String[] an = {"position", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "width", InterfaceC1925p.byf, "pathRotate"};

    /* JADX INFO: renamed from: b */
    public static final String f2259b = "MotionPaths";
    static final int bb = 1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    static final int f48120bo = 1;
    static final int bp = 0;
    static final int bv = 2;

    /* JADX INFO: renamed from: d */
    static final int f2260d = 3;

    /* JADX INFO: renamed from: u */
    static final int f2261u = 0;

    /* JADX INFO: renamed from: v */
    static final int f2262v = 2;

    /* JADX INFO: renamed from: w */
    static final int f2263w = 4;

    /* JADX INFO: renamed from: x */
    public static final boolean f2264x = false;

    /* JADX INFO: renamed from: c */
    LinkedHashMap<String, C0395k> f2265c;

    /* JADX INFO: renamed from: e */
    int f2266e;

    /* JADX INFO: renamed from: f */
    kja0 f2267f;

    /* JADX INFO: renamed from: g */
    float f2268g;

    /* JADX INFO: renamed from: h */
    float f2269h;

    /* JADX INFO: renamed from: j */
    int f2271j;

    /* JADX INFO: renamed from: k */
    C0284q f2272k;

    /* JADX INFO: renamed from: l */
    float f2273l;

    /* JADX INFO: renamed from: m */
    double[] f2274m;

    /* JADX INFO: renamed from: n */
    float f2275n;

    /* JADX INFO: renamed from: o */
    double[] f2276o;

    /* JADX INFO: renamed from: p */
    float f2277p;

    /* JADX INFO: renamed from: r */
    int f2279r;

    /* JADX INFO: renamed from: s */
    float f2280s;

    /* JADX INFO: renamed from: t */
    int f2281t;

    /* JADX INFO: renamed from: y */
    float f2282y;

    /* JADX INFO: renamed from: q */
    int f2278q = 0;

    /* JADX INFO: renamed from: i */
    float f2270i = Float.NaN;

    /* JADX INFO: renamed from: z */
    float f2283z = Float.NaN;

    public ki() {
        int i2 = AbstractC0368g.f2232g;
        this.f2281t = i2;
        this.f2279r = i2;
        this.f2273l = Float.NaN;
        this.f2267f = null;
        this.f2265c = new LinkedHashMap<>();
        this.f2266e = 0;
        this.f2276o = new double[18];
        this.f2274m = new double[18];
    }

    /* JADX INFO: renamed from: n */
    private boolean m1457n(float a2, float b2) {
        return (Float.isNaN(a2) || Float.isNaN(b2)) ? Float.isNaN(a2) != Float.isNaN(b2) : Math.abs(a2 - b2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: t */
    private static final float m1458t(float sin, float cos, float cx, float cy, float x3, float y3) {
        return ((x3 - cx) * sin) + ((y3 - cy) * cos) + cy;
    }

    private static final float wvg(float sin, float cos, float cx, float cy, float x3, float y3) {
        return (((x3 - cx) * cos) - ((y3 - cy) * sin)) + cx;
    }

    boolean cdj(String name) {
        return this.f2265c.containsKey(name);
    }

    void f7l8(ki points, boolean[] mask, String[] custom, boolean arcMode) {
        boolean zM1457n = m1457n(this.f2282y, points.f2282y);
        boolean zM1457n2 = m1457n(this.f2280s, points.f2280s);
        mask[0] = mask[0] | m1457n(this.f2268g, points.f2268g);
        boolean z2 = zM1457n | zM1457n2 | arcMode;
        mask[1] = mask[1] | z2;
        mask[2] = z2 | mask[2];
        mask[3] = mask[3] | m1457n(this.f2277p, points.f2277p);
        mask[4] = m1457n(this.f2269h, points.f2269h) | mask[4];
    }

    void fn3e(int parentWidth, int parentHeight, C0375p c2, ki s2, ki e2) {
        float fMin;
        float f2;
        float f3 = c2.f2240k / 100.0f;
        this.f2275n = f3;
        this.f2278q = c2.f48223gvn7;
        this.f2266e = c2.f48220dd;
        float f4 = Float.isNaN(c2.f48219d3) ? f3 : c2.f48219d3;
        float f5 = Float.isNaN(c2.f48227oc) ? f3 : c2.f48227oc;
        float f6 = e2.f2277p;
        float f7 = s2.f2277p;
        float f8 = e2.f2269h;
        float f9 = s2.f2269h;
        this.f2268g = this.f2275n;
        this.f2277p = (int) (f7 + ((f6 - f7) * f4));
        this.f2269h = (int) (f9 + ((f8 - f9) * f5));
        int i2 = c2.f48220dd;
        if (i2 == 1) {
            float f10 = Float.isNaN(c2.f48221eqxt) ? f3 : c2.f48221eqxt;
            float f11 = e2.f2282y;
            float f12 = s2.f2282y;
            this.f2282y = (f10 * (f11 - f12)) + f12;
            if (!Float.isNaN(c2.f48218d2ok)) {
                f3 = c2.f48218d2ok;
            }
            float f13 = e2.f2280s;
            float f14 = s2.f2280s;
            this.f2280s = (f3 * (f13 - f14)) + f14;
        } else if (i2 != 2) {
            float f15 = Float.isNaN(c2.f48221eqxt) ? f3 : c2.f48221eqxt;
            float f16 = e2.f2282y;
            float f17 = s2.f2282y;
            this.f2282y = (f15 * (f16 - f17)) + f17;
            if (!Float.isNaN(c2.f48218d2ok)) {
                f3 = c2.f48218d2ok;
            }
            float f18 = e2.f2280s;
            float f19 = s2.f2280s;
            this.f2280s = (f3 * (f18 - f19)) + f19;
        } else {
            if (Float.isNaN(c2.f48221eqxt)) {
                float f20 = e2.f2282y;
                float f21 = s2.f2282y;
                fMin = ((f20 - f21) * f3) + f21;
            } else {
                fMin = Math.min(f5, f4) * c2.f48221eqxt;
            }
            this.f2282y = fMin;
            if (Float.isNaN(c2.f48218d2ok)) {
                float f22 = e2.f2280s;
                float f23 = s2.f2280s;
                f2 = (f3 * (f22 - f23)) + f23;
            } else {
                f2 = c2.f48218d2ok;
            }
            this.f2280s = f2;
        }
        this.f2279r = s2.f2279r;
        this.f2272k = C0284q.zy(c2.f48222fti);
        this.f2281t = c2.f48224jp0y;
    }

    void fu4(float locationX, float locationY, float[] mAnchorDpDt, int[] toUse, double[] deltaData, double[] data) {
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f6 = (float) deltaData[i2];
            double d2 = data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                f2 = f6;
            } else if (i3 == 2) {
                f4 = f6;
            } else if (i3 == 3) {
                f3 = f6;
            } else if (i3 == 4) {
                f5 = f6;
            }
        }
        float f7 = f2 - ((0.0f * f3) / 2.0f);
        float f8 = f4 - ((0.0f * f5) / 2.0f);
        mAnchorDpDt[0] = (f7 * (1.0f - locationX)) + (((f3 * 1.0f) + f7) * locationX) + 0.0f;
        mAnchorDpDt[1] = (f8 * (1.0f - locationY)) + (((f5 * 1.0f) + f8) * locationY) + 0.0f;
    }

    /* JADX INFO: renamed from: h */
    void m1459h(int[] toUse, double[] data, float[] path, int offset) {
        float f2 = this.f2282y;
        float fCos = this.f2280s;
        float f3 = this.f2277p;
        float f4 = this.f2269h;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f5 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                f2 = f5;
            } else if (i3 == 2) {
                fCos = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        kja0 kja0Var = this.f2267f;
        if (kja0Var != null) {
            float fN7h = kja0Var.n7h();
            float fKja0 = this.f2267f.kja0();
            double d2 = f2;
            double d4 = fCos;
            float fSin = (float) ((((double) fN7h) + (Math.sin(d4) * d2)) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) fKja0) - (d2 * Math.cos(d4))) - ((double) (f4 / 2.0f)));
            f2 = fSin;
        }
        float f6 = f3 + f2;
        float f7 = f4 + fCos;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = offset + 1;
        path[offset] = f2 + 0.0f;
        int i5 = i4 + 1;
        path[i4] = fCos + 0.0f;
        int i6 = i5 + 1;
        path[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        path[i6] = fCos + 0.0f;
        int i8 = i7 + 1;
        path[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        path[i8] = f7 + 0.0f;
        path[i9] = f2 + 0.0f;
        path[i9 + 1] = f7 + 0.0f;
    }

    /* JADX INFO: renamed from: i */
    void m1460i(C0375p c2, ki startTimePoint, ki endTimePoint) {
        float f2 = c2.f2240k / 100.0f;
        this.f2275n = f2;
        this.f2278q = c2.f48223gvn7;
        float f3 = Float.isNaN(c2.f48219d3) ? f2 : c2.f48219d3;
        float f4 = Float.isNaN(c2.f48227oc) ? f2 : c2.f48227oc;
        float f5 = endTimePoint.f2277p - startTimePoint.f2277p;
        float f6 = endTimePoint.f2269h - startTimePoint.f2269h;
        this.f2268g = this.f2275n;
        if (!Float.isNaN(c2.f48221eqxt)) {
            f2 = c2.f48221eqxt;
        }
        float f7 = startTimePoint.f2282y;
        float f8 = startTimePoint.f2277p;
        float f9 = startTimePoint.f2280s;
        float f10 = startTimePoint.f2269h;
        float f11 = (endTimePoint.f2282y + (endTimePoint.f2277p / 2.0f)) - ((f8 / 2.0f) + f7);
        float f12 = (endTimePoint.f2280s + (endTimePoint.f2269h / 2.0f)) - ((f10 / 2.0f) + f9);
        float f13 = f11 * f2;
        float f14 = (f5 * f3) / 2.0f;
        this.f2282y = (int) ((f7 + f13) - f14);
        float f15 = f2 * f12;
        float f16 = (f6 * f4) / 2.0f;
        this.f2280s = (int) ((f9 + f15) - f16);
        this.f2277p = (int) (f8 + r7);
        this.f2269h = (int) (f10 + r8);
        float f17 = Float.isNaN(c2.f48218d2ok) ? 0.0f : c2.f48218d2ok;
        this.f2266e = 1;
        float f18 = (int) ((startTimePoint.f2282y + f13) - f14);
        float f19 = (int) ((startTimePoint.f2280s + f15) - f16);
        this.f2282y = f18 + ((-f12) * f17);
        this.f2280s = f19 + (f11 * f17);
        this.f2279r = this.f2279r;
        this.f2272k = C0284q.zy(c2.f48222fti);
        this.f2281t = c2.f48224jp0y;
    }

    void ki(C0375p c2, ki startTimePoint, ki endTimePoint) {
        float f2 = c2.f2240k / 100.0f;
        this.f2275n = f2;
        this.f2278q = c2.f48223gvn7;
        float f3 = Float.isNaN(c2.f48219d3) ? f2 : c2.f48219d3;
        float f4 = Float.isNaN(c2.f48227oc) ? f2 : c2.f48227oc;
        float f5 = endTimePoint.f2277p;
        float f6 = startTimePoint.f2277p;
        float f7 = endTimePoint.f2269h;
        float f8 = startTimePoint.f2269h;
        this.f2268g = this.f2275n;
        float f9 = startTimePoint.f2282y;
        float f10 = startTimePoint.f2280s;
        float f11 = (endTimePoint.f2282y + (f5 / 2.0f)) - ((f6 / 2.0f) + f9);
        float f12 = (endTimePoint.f2280s + (f7 / 2.0f)) - (f10 + (f8 / 2.0f));
        float f13 = ((f5 - f6) * f3) / 2.0f;
        this.f2282y = (int) ((f9 + (f11 * f2)) - f13);
        float f14 = ((f7 - f8) * f4) / 2.0f;
        this.f2280s = (int) ((f10 + (f12 * f2)) - f14);
        this.f2277p = (int) (f6 + r9);
        this.f2269h = (int) (f8 + r12);
        float f15 = Float.isNaN(c2.f48221eqxt) ? f2 : c2.f48221eqxt;
        float f16 = Float.isNaN(c2.f2360r) ? 0.0f : c2.f2360r;
        if (!Float.isNaN(c2.f48218d2ok)) {
            f2 = c2.f48218d2ok;
        }
        float f17 = Float.isNaN(c2.f48225lvui) ? 0.0f : c2.f48225lvui;
        this.f2266e = 0;
        this.f2282y = (int) (((startTimePoint.f2282y + (f15 * f11)) + (f17 * f12)) - f13);
        this.f2280s = (int) (((startTimePoint.f2280s + (f11 * f16)) + (f12 * f2)) - f14);
        this.f2272k = C0284q.zy(c2.f48222fti);
        this.f2281t = c2.f48224jp0y;
    }

    int kja0(String name) {
        C0395k c0395k = this.f2265c.get(name);
        if (c0395k == null) {
            return 0;
        }
        return c0395k.m1637h();
    }

    void ld6(double p2, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f2282y;
        float fCos = this.f2280s;
        float f2 = this.f2277p;
        float f3 = this.f2269h;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                fSin = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        kja0 kja0Var = this.f2267f;
        if (kja0Var != null) {
            float[] fArr = new float[2];
            kja0Var.qrj(p2, fArr, new float[2]);
            float f5 = fArr[0];
            float f6 = fArr[1];
            double d2 = f5;
            double d4 = fSin;
            double d5 = fCos;
            fSin = (float) ((d2 + (Math.sin(d5) * d4)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d4 * Math.cos(d5))) - ((double) (f3 / 2.0f)));
        }
        point[offset] = fSin + (f2 / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    int n7h(String name, double[] value, int offset) {
        C0395k c0395k = this.f2265c.get(name);
        int i2 = 0;
        if (c0395k == null) {
            return 0;
        }
        if (c0395k.m1637h() == 1) {
            value[offset] = c0395k.ld6();
            return 1;
        }
        int iM1637h = c0395k.m1637h();
        c0395k.x2(new float[iM1637h]);
        while (i2 < iM1637h) {
            value[offset] = r2[i2];
            i2++;
            offset++;
        }
        return iM1637h;
    }

    void ni7(float x3, float y3, float w2, float h2) {
        this.f2282y = x3;
        this.f2280s = y3;
        this.f2277p = w2;
        this.f2269h = h2;
    }

    public void o1t(kja0 mc, ki relative) {
        double d2 = ((this.f2282y + (this.f2277p / 2.0f)) - relative.f2282y) - (relative.f2277p / 2.0f);
        double d4 = ((this.f2280s + (this.f2269h / 2.0f)) - relative.f2280s) - (relative.f2269h / 2.0f);
        this.f2267f = mc;
        this.f2282y = (float) Math.hypot(d4, d2);
        if (Float.isNaN(this.f2273l)) {
            this.f2280s = (float) (Math.atan2(d4, d2) + 1.5707963267948966d);
        } else {
            this.f2280s = (float) Math.toRadians(this.f2273l);
        }
    }

    /* JADX INFO: renamed from: p */
    void m1461p(int[] toUse, double[] data, float[] point, int offset) {
        float f2 = this.f2277p;
        float f3 = this.f2269h;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        point[offset] = f2;
        point[offset + 1] = f3;
    }

    /* JADX INFO: renamed from: q */
    public void m1462q(kja0 toOrbit) {
        toOrbit.wvg(this.f2283z);
    }

    void qrj(double p2, int[] toUse, double[] data, float[] point, int offset) {
        float fSin = this.f2282y;
        float fCos = this.f2280s;
        float f2 = this.f2277p;
        float f3 = this.f2269h;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f4 = (float) data[i2];
            int i3 = toUse[i2];
            if (i3 == 1) {
                fSin = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        kja0 kja0Var = this.f2267f;
        if (kja0Var != null) {
            float[] fArr = new float[2];
            kja0Var.qrj(p2, fArr, new float[2]);
            float f5 = fArr[0];
            float f6 = fArr[1];
            double d2 = f5;
            double d4 = fSin;
            double d5 = fCos;
            fSin = (float) ((d2 + (Math.sin(d5) * d4)) - ((double) (f2 / 2.0f)));
            fCos = (float) ((((double) f6) - (d4 * Math.cos(d5))) - ((double) (f3 / 2.0f)));
        }
        point[offset] = fSin + (f2 / 2.0f) + 0.0f;
        point[offset + 1] = fCos + (f3 / 2.0f) + 0.0f;
    }

    /* JADX INFO: renamed from: s */
    void m1463s(double[] data, int[] toUse) {
        float[] fArr = {this.f2268g, this.f2282y, this.f2280s, this.f2277p, this.f2269h, this.f2270i};
        int i2 = 0;
        for (int i3 : toUse) {
            if (i3 < 6) {
                data[i2] = fArr[r4];
                i2++;
            }
        }
    }

    public void toq(C0397q.k c2) {
        this.f2272k = C0284q.zy(c2.f2965q.f3021q);
        C0397q.zy zyVar = c2.f2965q;
        this.f2281t = zyVar.f3019n;
        this.f2279r = zyVar.f49990toq;
        this.f2270i = zyVar.f3022s;
        this.f2278q = zyVar.f3017g;
        this.f2271j = zyVar.f49992zy;
        this.f2283z = c2.f49834zy.f2986n;
        this.f2273l = c2.f2964n.f49947jk;
        for (String str : c2.f49832f7l8.keySet()) {
            C0395k c0395k = c2.f49832f7l8.get(str);
            if (c0395k != null && c0395k.n7h()) {
                this.f2265c.put(str, c0395k);
            }
        }
    }

    void x2(double p2, int[] toUse, double[] data, float[] point, double[] vdata, float[] velocity) {
        float f2;
        float f3 = this.f2282y;
        float f4 = this.f2280s;
        float f5 = this.f2277p;
        float f6 = this.f2269h;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            float f11 = (float) data[i2];
            float f12 = (float) vdata[i2];
            int i3 = toUse[i2];
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
        kja0 kja0Var = this.f2267f;
        if (kja0Var != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            kja0Var.qrj(p2, fArr, fArr2);
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr2[0];
            float f18 = fArr2[1];
            double d2 = f3;
            double d4 = f4;
            f2 = f5;
            float fSin = (float) ((((double) f15) + (Math.sin(d4) * d2)) - ((double) (f5 / 2.0f)));
            float fCos2 = (float) ((((double) f16) - (d2 * Math.cos(d4))) - ((double) (f6 / 2.0f)));
            double d5 = f7;
            double d6 = f9;
            float fSin2 = (float) (((double) f17) + (Math.sin(d4) * d5) + (Math.cos(d4) * d6));
            fCos = (float) ((((double) f18) - (d5 * Math.cos(d4))) + (Math.sin(d4) * d6));
            f14 = fSin2;
            f3 = fSin;
            f4 = fCos2;
            f13 = 2.0f;
        } else {
            f2 = f5;
        }
        point[0] = f3 + (f2 / f13) + 0.0f;
        point[1] = f4 + (f6 / f13) + 0.0f;
        velocity[0] = f14;
        velocity[1] = fCos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    void m1464z(float position, View view, int[] toUse, double[] data, double[] slope, double[] cycle, boolean mForceMeasure) {
        float f2;
        boolean z2;
        boolean z3;
        float f3;
        float f4 = this.f2282y;
        float f5 = this.f2280s;
        float f6 = this.f2277p;
        float f7 = this.f2269h;
        if (toUse.length != 0 && this.f2276o.length <= toUse[toUse.length - 1]) {
            int i2 = toUse[toUse.length - 1] + 1;
            this.f2276o = new double[i2];
            this.f2274m = new double[i2];
        }
        Arrays.fill(this.f2276o, Double.NaN);
        for (int i3 = 0; i3 < toUse.length; i3++) {
            double[] dArr = this.f2276o;
            int i4 = toUse[i3];
            dArr[i4] = data[i3];
            this.f2274m[i4] = slope[i3];
        }
        float f8 = Float.NaN;
        int i5 = 0;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (true) {
            double[] dArr2 = this.f2276o;
            if (i5 >= dArr2.length) {
                break;
            }
            if (Double.isNaN(dArr2[i5]) && (cycle == null || cycle[i5] == 0.0d)) {
                f3 = f8;
            } else {
                double d2 = cycle != null ? cycle[i5] : 0.0d;
                if (!Double.isNaN(this.f2276o[i5])) {
                    d2 = this.f2276o[i5] + d2;
                }
                f3 = f8;
                float f13 = (float) d2;
                float f14 = (float) this.f2274m[i5];
                if (i5 == 1) {
                    f8 = f3;
                    f9 = f14;
                    f4 = f13;
                } else if (i5 == 2) {
                    f8 = f3;
                    f10 = f14;
                    f5 = f13;
                } else if (i5 == 3) {
                    f8 = f3;
                    f11 = f14;
                    f6 = f13;
                } else if (i5 == 4) {
                    f8 = f3;
                    f12 = f14;
                    f7 = f13;
                } else if (i5 == 5) {
                    f8 = f13;
                }
                i5++;
            }
            f8 = f3;
            i5++;
        }
        float f15 = f8;
        kja0 kja0Var = this.f2267f;
        if (kja0Var != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            kja0Var.qrj(position, fArr, fArr2);
            float f16 = fArr[0];
            float f17 = fArr[1];
            float f18 = fArr2[0];
            float f19 = fArr2[1];
            double d4 = f4;
            double d5 = f5;
            float fSin = (float) ((((double) f16) + (Math.sin(d5) * d4)) - ((double) (f6 / 2.0f)));
            f2 = f7;
            float fCos = (float) ((((double) f17) - (Math.cos(d5) * d4)) - ((double) (f7 / 2.0f)));
            double d6 = f9;
            double d7 = f10;
            float fSin2 = (float) (((double) f18) + (Math.sin(d5) * d6) + (Math.cos(d5) * d4 * d7));
            float fCos2 = (float) ((((double) f19) - (d6 * Math.cos(d5))) + (d4 * Math.sin(d5) * d7));
            if (slope.length >= 2) {
                z2 = false;
                slope[0] = fSin2;
                z3 = true;
                slope[1] = fCos2;
            } else {
                z2 = false;
                z3 = true;
            }
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (((double) f15) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f4 = fSin;
            f5 = fCos;
        } else {
            f2 = f7;
            z2 = false;
            z3 = true;
            if (!Float.isNaN(f15)) {
                view.setRotation((float) (((double) 0.0f) + ((double) f15) + Math.toDegrees(Math.atan2(f10 + (f12 / 2.0f), f9 + (f11 / 2.0f)))));
            }
        }
        if (view instanceof InterfaceC0373n) {
            ((InterfaceC0373n) view).mo1482k(f4, f5, f6 + f4, f5 + f2);
            return;
        }
        float f20 = f4 + 0.5f;
        int i6 = (int) f20;
        float f21 = f5 + 0.5f;
        int i7 = (int) f21;
        int i8 = (int) (f20 + f6);
        int i9 = (int) (f21 + f2);
        int i10 = i8 - i6;
        int i11 = i9 - i7;
        if (i10 != view.getMeasuredWidth() || i11 != view.getMeasuredHeight()) {
            z2 = z3;
        }
        if (z2 || mForceMeasure) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        }
        view.layout(i6, i7, i8, i9);
    }

    void zurt(int parentWidth, int parentHeight, C0375p c2, ki startTimePoint, ki endTimePoint) {
        float f2 = c2.f2240k / 100.0f;
        this.f2275n = f2;
        this.f2278q = c2.f48223gvn7;
        float f3 = Float.isNaN(c2.f48219d3) ? f2 : c2.f48219d3;
        float f4 = Float.isNaN(c2.f48227oc) ? f2 : c2.f48227oc;
        float f5 = endTimePoint.f2277p;
        float f6 = startTimePoint.f2277p;
        float f7 = endTimePoint.f2269h;
        float f8 = startTimePoint.f2269h;
        this.f2268g = this.f2275n;
        float f9 = startTimePoint.f2282y;
        float f10 = startTimePoint.f2280s;
        float f11 = endTimePoint.f2282y + (f5 / 2.0f);
        float f12 = endTimePoint.f2280s + (f7 / 2.0f);
        float f13 = (f5 - f6) * f3;
        this.f2282y = (int) ((f9 + ((f11 - ((f6 / 2.0f) + f9)) * f2)) - (f13 / 2.0f));
        float f14 = (f7 - f8) * f4;
        this.f2280s = (int) ((f10 + ((f12 - (f10 + (f8 / 2.0f))) * f2)) - (f14 / 2.0f));
        this.f2277p = (int) (f6 + f13);
        this.f2269h = (int) (f8 + f14);
        this.f2266e = 2;
        if (!Float.isNaN(c2.f48221eqxt)) {
            this.f2282y = (int) (c2.f48221eqxt * ((int) (parentWidth - this.f2277p)));
        }
        if (!Float.isNaN(c2.f48218d2ok)) {
            this.f2280s = (int) (c2.f48218d2ok * ((int) (parentHeight - this.f2269h)));
        }
        this.f2279r = this.f2279r;
        this.f2272k = C0284q.zy(c2.f48222fti);
        this.f2281t = c2.f48224jp0y;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
    public int compareTo(@lvui ki o2) {
        return Float.compare(this.f2268g, o2.f2268g);
    }

    public ki(int parentWidth, int parentHeight, C0375p c2, ki startTimePoint, ki endTimePoint) {
        int i2 = AbstractC0368g.f2232g;
        this.f2281t = i2;
        this.f2279r = i2;
        this.f2273l = Float.NaN;
        this.f2267f = null;
        this.f2265c = new LinkedHashMap<>();
        this.f2266e = 0;
        this.f2276o = new double[18];
        this.f2274m = new double[18];
        if (startTimePoint.f2279r != AbstractC0368g.f2232g) {
            fn3e(parentWidth, parentHeight, c2, startTimePoint, endTimePoint);
            return;
        }
        int i3 = c2.f48220dd;
        if (i3 == 1) {
            m1460i(c2, startTimePoint, endTimePoint);
        } else if (i3 != 2) {
            ki(c2, startTimePoint, endTimePoint);
        } else {
            zurt(parentWidth, parentHeight, c2, startTimePoint, endTimePoint);
        }
    }
}
