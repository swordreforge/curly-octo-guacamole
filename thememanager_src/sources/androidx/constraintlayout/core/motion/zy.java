package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.key.C0267g;
import androidx.constraintlayout.core.motion.key.C0269n;
import androidx.constraintlayout.core.motion.key.C0270q;
import androidx.constraintlayout.core.motion.key.f7l8;
import androidx.constraintlayout.core.motion.utils.AbstractC0277i;
import androidx.constraintlayout.core.motion.utils.AbstractC0287y;
import androidx.constraintlayout.core.motion.utils.C0281n;
import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.core.motion.utils.C0285s;
import androidx.constraintlayout.core.motion.utils.C0288z;
import androidx.constraintlayout.core.motion.utils.fu4;
import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.ni7;
import androidx.constraintlayout.core.motion.utils.qrj;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: Motion.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements zurt {

    /* JADX INFO: renamed from: a */
    static final int f1784a = 1;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    static final int f47515a98o = 0;

    /* JADX INFO: renamed from: b */
    private static final String f1785b = "MotionController";

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    private static final boolean f47516bf2 = false;

    /* JADX INFO: renamed from: c */
    public static final int f1786c = 2;

    /* JADX INFO: renamed from: ch, reason: collision with root package name */
    static final int f47517ch = 4;

    /* JADX INFO: renamed from: e */
    public static final int f1787e = 0;

    /* JADX INFO: renamed from: ek5k, reason: collision with root package name */
    public static final int f47518ek5k = 6;

    /* JADX INFO: renamed from: f */
    public static final int f1788f = 1;

    /* JADX INFO: renamed from: hb, reason: collision with root package name */
    public static final int f47519hb = 2;

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final int f47520hyr = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final boolean f47521i1 = false;

    /* JADX INFO: renamed from: j */
    public static final int f1789j = 3;

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final int f47522lrht = 3;

    /* JADX INFO: renamed from: lv5, reason: collision with root package name */
    private static final int f47523lv5 = -1;

    /* JADX INFO: renamed from: m */
    public static final int f1790m = 5;

    /* JADX INFO: renamed from: nmn5, reason: collision with root package name */
    static final int f47524nmn5 = 5;

    /* JADX INFO: renamed from: nn86, reason: collision with root package name */
    public static final int f47525nn86 = 1;

    /* JADX INFO: renamed from: o */
    public static final int f1791o = 4;

    /* JADX INFO: renamed from: t8iq, reason: collision with root package name */
    private static final int f47526t8iq = -2;

    /* JADX INFO: renamed from: u */
    private static final int f1792u = -3;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    public static final int f47527uv6 = 4;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    public static final int f47528vyq = 5;

    /* JADX INFO: renamed from: x */
    static final int f1793x = 3;

    /* JADX INFO: renamed from: y9n, reason: collision with root package name */
    public static final int f47529y9n = 2;

    /* JADX INFO: renamed from: yz, reason: collision with root package name */
    public static final int f47530yz = 1;

    /* JADX INFO: renamed from: zp, reason: collision with root package name */
    static final int f47531zp = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.toq[] f47533cdj;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private HashMap<String, kja0> f47535d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private f7l8[] f47537eqxt;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int[] f47540fu4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private HashMap<String, AbstractC0277i> f47541gvn7;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.toq f47544ki;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    String f47546ld6;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    String[] f47549n5r1;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    float f47552ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private double[] f47553o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private HashMap<String, AbstractC0287y> f47554oc;

    /* JADX INFO: renamed from: p */
    int f1797p;

    /* JADX INFO: renamed from: s */
    C0265g f1799s;

    /* JADX INFO: renamed from: t */
    private int[] f1800t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private String[] f47557wvg;

    /* JADX INFO: renamed from: z */
    private double[] f1802z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    float f47560zurt;

    /* JADX INFO: renamed from: y */
    qrj f1801y = new qrj();

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f47558x2 = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private C0271n f47555qrj = new C0271n();

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private C0271n f47550n7h = new C0271n();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private C0274q f47545kja0 = new C0274q();

    /* JADX INFO: renamed from: h */
    private C0274q f1794h = new C0274q();

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    float f47556t8r = Float.NaN;

    /* JADX INFO: renamed from: i */
    float f1795i = 0.0f;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    float f47538fn3e = 1.0f;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private int f47548mcp = 4;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private float[] f47542jk = new float[4];

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private ArrayList<C0271n> f47532a9 = new ArrayList<>();

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private float[] f47539fti = new float[1];

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.core.motion.key.toq> f47543jp0y = new ArrayList<>();

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private int f47534d2ok = -1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private int f47547lvui = -1;

    /* JADX INFO: renamed from: r */
    private C0265g f1798r = null;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f47536dd = -1;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private float f47559x9kr = Float.NaN;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private androidx.constraintlayout.core.motion.utils.zy f47551ncyb = null;

    /* JADX INFO: renamed from: l */
    private boolean f1796l = false;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.zy$k */
    /* JADX INFO: compiled from: Motion.java */
    static class C0295k implements androidx.constraintlayout.core.motion.utils.zy {

        /* JADX INFO: renamed from: k */
        float f1803k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C0284q f47561toq;

        C0295k(C0284q c0284q) {
            this.f47561toq = c0284q;
        }

        @Override // androidx.constraintlayout.core.motion.utils.zy
        public float getInterpolation(float f2) {
            this.f1803k = f2;
            return (float) this.f47561toq.mo986k(f2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.zy
        /* JADX INFO: renamed from: k */
        public float mo1094k() {
            return (float) this.f47561toq.toq(this.f1803k);
        }
    }

    public zy(C0265g c0265g) {
        m1101j(c0265g);
    }

    private float d3() {
        char c2;
        float fHypot;
        float[] fArr = new float[2];
        float f2 = 1.0f / 99;
        double d2 = 0.0d;
        double d4 = 0.0d;
        float f3 = 0.0f;
        int i2 = 0;
        while (i2 < 100) {
            float f4 = i2 * f2;
            double dMo986k = f4;
            C0284q c0284q = this.f47555qrj.f1519k;
            float f5 = Float.NaN;
            float f6 = 0.0f;
            for (C0271n c0271n : this.f47532a9) {
                C0284q c0284q2 = c0271n.f1519k;
                if (c0284q2 != null) {
                    float f7 = c0271n.f1522n;
                    if (f7 < f4) {
                        c0284q = c0284q2;
                        f6 = f7;
                    } else if (Float.isNaN(f5)) {
                        f5 = c0271n.f1522n;
                    }
                }
            }
            if (c0284q != null) {
                if (Float.isNaN(f5)) {
                    f5 = 1.0f;
                }
                dMo986k = (((float) c0284q.mo986k((f4 - f6) / r17)) * (f5 - f6)) + f6;
            }
            this.f47533cdj[0].mo1018q(dMo986k, this.f1802z);
            float f8 = f3;
            int i3 = i2;
            this.f47555qrj.ld6(dMo986k, this.f47540fu4, this.f1802z, fArr, 0);
            if (i3 > 0) {
                c2 = 0;
                fHypot = (float) (((double) f8) + Math.hypot(d4 - ((double) fArr[1]), d2 - ((double) fArr[0])));
            } else {
                c2 = 0;
                fHypot = f8;
            }
            d2 = fArr[c2];
            i2 = i3 + 1;
            f3 = fHypot;
            d4 = fArr[1];
        }
        return f3;
    }

    private void hyr(C0271n c0271n) {
        c0271n.ni7(this.f1799s.a9(), this.f1799s.fti(), this.f1799s.jk(), this.f1799s.ld6());
    }

    private float kja0(float f2, float[] fArr) {
        float f3 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.f47538fn3e;
            if (f4 != 1.0d) {
                float f5 = this.f1795i;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && f2 < 1.0d) {
                    f2 = Math.min((f2 - f5) * f4, 1.0f);
                }
            }
        }
        C0284q c0284q = this.f47555qrj.f1519k;
        float f6 = Float.NaN;
        for (C0271n c0271n : this.f47532a9) {
            C0284q c0284q2 = c0271n.f1519k;
            if (c0284q2 != null) {
                float f7 = c0271n.f1522n;
                if (f7 < f2) {
                    c0284q = c0284q2;
                    f3 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = c0271n.f1522n;
                }
            }
        }
        if (c0284q != null) {
            float f8 = (Float.isNaN(f6) ? 1.0f : f6) - f3;
            double d2 = (f2 - f3) / f8;
            f2 = (((float) c0284q.mo986k(d2)) * f8) + f3;
            if (fArr != null) {
                fArr[0] = (float) c0284q.toq(d2);
            }
        }
        return f2;
    }

    private static androidx.constraintlayout.core.motion.utils.zy wvg(int i2, String str, int i3) {
        if (i2 != -1) {
            return null;
        }
        return new C0295k(C0284q.zy(str));
    }

    private void x9kr(C0271n c0271n) {
        C0271n c0271n2 = null;
        for (C0271n c0271n3 : this.f47532a9) {
            if (c0271n.f1515g == c0271n3.f1515g) {
                c0271n2 = c0271n3;
            }
        }
        if (c0271n2 != null) {
            this.f47532a9.remove(c0271n2);
        }
        if (Collections.binarySearch(this.f47532a9, c0271n) == 0) {
            ni7.m1040g(f1785b, " KeyPath position \"" + c0271n.f1515g + "\" outside of range");
        }
        this.f47532a9.add((-r0) - 1, c0271n);
    }

    public int a9(int[] iArr, float[] fArr) {
        int i2 = 0;
        int i3 = 0;
        for (androidx.constraintlayout.core.motion.key.toq toqVar : this.f47543jp0y) {
            int i4 = toqVar.f1500y;
            iArr[i2] = (toqVar.f47227ld6 * 1000) + i4;
            double d2 = i4 / 100.0f;
            this.f47533cdj[0].mo1018q(d2, this.f1802z);
            this.f47555qrj.ld6(d2, this.f47540fu4, this.f1802z, fArr, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    void m1095c(C0265g c0265g) {
        C0271n c0271n = this.f47555qrj;
        c0271n.f1522n = 0.0f;
        c0271n.f1515g = 0.0f;
        this.f1796l = true;
        c0271n.ni7(c0265g.a9(), c0265g.fti(), c0265g.jk(), c0265g.ld6());
        this.f47550n7h.ni7(c0265g.a9(), c0265g.fti(), c0265g.jk(), c0265g.ld6());
        this.f47545kja0.kja0(c0265g);
        this.f1794h.kja0(c0265g);
    }

    int cdj(String str, float[] fArr, int i2) {
        kja0 kja0Var = this.f47535d3.get(str);
        if (kja0Var == null) {
            return -1;
        }
        for (int i3 = 0; i3 < fArr.length; i3++) {
            fArr[i3] = kja0Var.m1030k(i3 / (fArr.length - 1));
        }
        return fArr.length;
    }

    public float d2ok() {
        return this.f47555qrj.f1529y;
    }

    public C0265g dd() {
        return this.f1799s;
    }

    /* JADX INFO: renamed from: e */
    public void m1096e(C0265g c0265g) {
        C0271n c0271n = this.f47555qrj;
        c0271n.f1522n = 0.0f;
        c0271n.f1515g = 0.0f;
        c0271n.ni7(c0265g.a9(), c0265g.fti(), c0265g.jk(), c0265g.ld6());
        this.f47555qrj.toq(c0265g);
        this.f47545kja0.kja0(c0265g);
    }

    public float eqxt() {
        return this.f47555qrj.f1524p;
    }

    /* JADX INFO: renamed from: f */
    void m1097f(qrj qrjVar, qrj qrjVar2, int i2, int i3, int i4) {
        if (i2 == 1) {
            int i5 = qrjVar.f47328toq + qrjVar.f47329zy;
            qrjVar2.f47328toq = ((qrjVar.f1647q + qrjVar.f1646k) - qrjVar.toq()) / 2;
            qrjVar2.f1647q = i4 - ((i5 + qrjVar.m1052k()) / 2);
            qrjVar2.f47329zy = qrjVar2.f47328toq + qrjVar.toq();
            qrjVar2.f1646k = qrjVar2.f1647q + qrjVar.m1052k();
            return;
        }
        if (i2 == 2) {
            int i6 = qrjVar.f47328toq + qrjVar.f47329zy;
            qrjVar2.f47328toq = i3 - (((qrjVar.f1647q + qrjVar.f1646k) + qrjVar.toq()) / 2);
            qrjVar2.f1647q = (i6 - qrjVar.m1052k()) / 2;
            qrjVar2.f47329zy = qrjVar2.f47328toq + qrjVar.toq();
            qrjVar2.f1646k = qrjVar2.f1647q + qrjVar.m1052k();
            return;
        }
        if (i2 == 3) {
            int i7 = qrjVar.f47328toq + qrjVar.f47329zy;
            qrjVar2.f47328toq = ((qrjVar.m1052k() / 2) + qrjVar.f1647q) - (i7 / 2);
            qrjVar2.f1647q = i4 - ((i7 + qrjVar.m1052k()) / 2);
            qrjVar2.f47329zy = qrjVar2.f47328toq + qrjVar.toq();
            qrjVar2.f1646k = qrjVar2.f1647q + qrjVar.m1052k();
            return;
        }
        if (i2 != 4) {
            return;
        }
        int i8 = qrjVar.f47328toq + qrjVar.f47329zy;
        qrjVar2.f47328toq = i3 - (((qrjVar.f1646k + qrjVar.f1647q) + qrjVar.toq()) / 2);
        qrjVar2.f1647q = (i8 - qrjVar.m1052k()) / 2;
        qrjVar2.f47329zy = qrjVar2.f47328toq + qrjVar.toq();
        qrjVar2.f1646k = qrjVar2.f1647q + qrjVar.m1052k();
    }

    void f7l8(ArrayList<androidx.constraintlayout.core.motion.key.toq> arrayList) {
        this.f47543jp0y.addAll(arrayList);
    }

    void fn3e(float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        float fKja0 = kja0(f2, this.f47539fti);
        androidx.constraintlayout.core.motion.utils.toq[] toqVarArr = this.f47533cdj;
        int i2 = 0;
        if (toqVarArr == null) {
            C0271n c0271n = this.f47550n7h;
            float f5 = c0271n.f1529y;
            C0271n c0271n2 = this.f47555qrj;
            float f6 = f5 - c0271n2.f1529y;
            float f7 = c0271n.f1527s - c0271n2.f1527s;
            float f8 = (c0271n.f1524p - c0271n2.f1524p) + f6;
            float f9 = (c0271n.f1516h - c0271n2.f1516h) + f7;
            fArr[0] = (f6 * (1.0f - f3)) + (f8 * f3);
            fArr[1] = (f7 * (1.0f - f4)) + (f9 * f4);
            return;
        }
        double d2 = fKja0;
        toqVarArr[0].f7l8(d2, this.f47553o1t);
        this.f47533cdj[0].mo1018q(d2, this.f1802z);
        float f10 = this.f47539fti[0];
        while (true) {
            dArr = this.f47553o1t;
            if (i2 >= dArr.length) {
                break;
            }
            dArr[i2] = dArr[i2] * ((double) f10);
            i2++;
        }
        androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47544ki;
        if (toqVar == null) {
            this.f47555qrj.fu4(f3, f4, fArr, this.f47540fu4, dArr, this.f1802z);
            return;
        }
        double[] dArr2 = this.f1802z;
        if (dArr2.length > 0) {
            toqVar.mo1018q(d2, dArr2);
            this.f47544ki.f7l8(d2, this.f47553o1t);
            this.f47555qrj.fu4(f3, f4, fArr, this.f47540fu4, this.f47553o1t, this.f1802z);
        }
    }

    double[] fti(double d2) {
        this.f47533cdj[0].mo1018q(d2, this.f1802z);
        androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47544ki;
        if (toqVar != null) {
            double[] dArr = this.f1802z;
            if (dArr.length > 0) {
                toqVar.mo1018q(d2, dArr);
            }
        }
        return this.f1802z;
    }

    public float fu4() {
        return this.f47550n7h.f1524p;
    }

    /* JADX INFO: renamed from: g */
    public void m1098g(androidx.constraintlayout.core.motion.key.toq toqVar) {
        this.f47543jp0y.add(toqVar);
    }

    void gvn7(float f2, int i2, int i3, float f3, float f4, float[] fArr) {
        float fKja0 = kja0(f2, this.f47539fti);
        HashMap<String, kja0> map = this.f47535d3;
        kja0 kja0Var = map == null ? null : map.get("translationX");
        HashMap<String, kja0> map2 = this.f47535d3;
        kja0 kja0Var2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, kja0> map3 = this.f47535d3;
        kja0 kja0Var3 = map3 == null ? null : map3.get("rotationZ");
        HashMap<String, kja0> map4 = this.f47535d3;
        kja0 kja0Var4 = map4 == null ? null : map4.get("scaleX");
        HashMap<String, kja0> map5 = this.f47535d3;
        kja0 kja0Var5 = map5 == null ? null : map5.get("scaleY");
        HashMap<String, AbstractC0287y> map6 = this.f47554oc;
        AbstractC0287y abstractC0287y = map6 == null ? null : map6.get("translationX");
        HashMap<String, AbstractC0287y> map7 = this.f47554oc;
        AbstractC0287y abstractC0287y2 = map7 == null ? null : map7.get("translationY");
        HashMap<String, AbstractC0287y> map8 = this.f47554oc;
        AbstractC0287y abstractC0287y3 = map8 == null ? null : map8.get("rotationZ");
        HashMap<String, AbstractC0287y> map9 = this.f47554oc;
        AbstractC0287y abstractC0287y4 = map9 == null ? null : map9.get("scaleX");
        HashMap<String, AbstractC0287y> map10 = this.f47554oc;
        AbstractC0287y abstractC0287y5 = map10 != null ? map10.get("scaleY") : null;
        fu4 fu4Var = new fu4();
        fu4Var.toq();
        fu4Var.m997q(kja0Var3, fKja0);
        fu4Var.m998y(kja0Var, kja0Var2, fKja0);
        fu4Var.m994g(kja0Var4, kja0Var5, fKja0);
        fu4Var.zy(abstractC0287y3, fKja0);
        fu4Var.f7l8(abstractC0287y, abstractC0287y2, fKja0);
        fu4Var.m996n(abstractC0287y4, abstractC0287y5, fKja0);
        androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47544ki;
        if (toqVar != null) {
            double[] dArr = this.f1802z;
            if (dArr.length > 0) {
                double d2 = fKja0;
                toqVar.mo1018q(d2, dArr);
                this.f47544ki.f7l8(d2, this.f47553o1t);
                this.f47555qrj.fu4(f3, f4, fArr, this.f47540fu4, this.f47553o1t, this.f1802z);
            }
            fu4Var.m995k(f3, f4, i2, i3, fArr);
            return;
        }
        int i4 = 0;
        if (this.f47533cdj == null) {
            C0271n c0271n = this.f47550n7h;
            float f5 = c0271n.f1529y;
            C0271n c0271n2 = this.f47555qrj;
            float f6 = f5 - c0271n2.f1529y;
            AbstractC0287y abstractC0287y6 = abstractC0287y5;
            float f7 = c0271n.f1527s - c0271n2.f1527s;
            AbstractC0287y abstractC0287y7 = abstractC0287y4;
            float f8 = (c0271n.f1524p - c0271n2.f1524p) + f6;
            float f9 = (c0271n.f1516h - c0271n2.f1516h) + f7;
            fArr[0] = (f6 * (1.0f - f3)) + (f8 * f3);
            fArr[1] = (f7 * (1.0f - f4)) + (f9 * f4);
            fu4Var.toq();
            fu4Var.m997q(kja0Var3, fKja0);
            fu4Var.m998y(kja0Var, kja0Var2, fKja0);
            fu4Var.m994g(kja0Var4, kja0Var5, fKja0);
            fu4Var.zy(abstractC0287y3, fKja0);
            fu4Var.f7l8(abstractC0287y, abstractC0287y2, fKja0);
            fu4Var.m996n(abstractC0287y7, abstractC0287y6, fKja0);
            fu4Var.m995k(f3, f4, i2, i3, fArr);
            return;
        }
        double dKja0 = kja0(fKja0, this.f47539fti);
        this.f47533cdj[0].f7l8(dKja0, this.f47553o1t);
        this.f47533cdj[0].mo1018q(dKja0, this.f1802z);
        float f10 = this.f47539fti[0];
        while (true) {
            double[] dArr2 = this.f47553o1t;
            if (i4 >= dArr2.length) {
                this.f47555qrj.fu4(f3, f4, fArr, this.f47540fu4, dArr2, this.f1802z);
                fu4Var.m995k(f3, f4, i2, i3, fArr);
                return;
            } else {
                dArr2[i4] = dArr2[i4] * ((double) f10);
                i4++;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public int m1099h() {
        return this.f47555qrj.f1526r;
    }

    public void hb(int i2) {
        this.f47547lvui = i2;
        this.f1798r = null;
    }

    /* JADX INFO: renamed from: i */
    public float m1100i() {
        return this.f47552ni7;
    }

    /* JADX INFO: renamed from: j */
    public void m1101j(C0265g c0265g) {
        this.f1799s = c0265g;
    }

    float jk(int i2, float f2, float f3) {
        C0271n c0271n = this.f47550n7h;
        float f4 = c0271n.f1529y;
        C0271n c0271n2 = this.f47555qrj;
        float f5 = c0271n2.f1529y;
        float f6 = f4 - f5;
        float f7 = c0271n.f1527s;
        float f8 = c0271n2.f1527s;
        float f9 = f7 - f8;
        float f10 = f5 + (c0271n2.f1524p / 2.0f);
        float f11 = f8 + (c0271n2.f1516h / 2.0f);
        float fHypot = (float) Math.hypot(f6, f9);
        if (fHypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f12 = f2 - f10;
        float f13 = f3 - f11;
        if (((float) Math.hypot(f12, f13)) == 0.0f) {
            return 0.0f;
        }
        float f14 = (f12 * f6) + (f13 * f9);
        if (i2 == 0) {
            return f14 / fHypot;
        }
        if (i2 == 1) {
            return (float) Math.sqrt((fHypot * fHypot) - (f14 * f14));
        }
        if (i2 == 2) {
            return f12 / f6;
        }
        if (i2 == 3) {
            return f13 / f6;
        }
        if (i2 == 4) {
            return f12 / f9;
        }
        if (i2 != 5) {
            return 0.0f;
        }
        return f13 / f9;
    }

    C0269n jp0y(int i2, int i3, float f2, float f3) {
        C0281n c0281n = new C0281n();
        C0271n c0271n = this.f47555qrj;
        float f4 = c0271n.f1529y;
        c0281n.f47310toq = f4;
        float f5 = c0271n.f1527s;
        c0281n.f1629q = f5;
        c0281n.f47311zy = f4 + c0271n.f1524p;
        c0281n.f1628k = f5 + c0271n.f1516h;
        C0281n c0281n2 = new C0281n();
        C0271n c0271n2 = this.f47550n7h;
        float f6 = c0271n2.f1529y;
        c0281n2.f47310toq = f6;
        float f7 = c0271n2.f1527s;
        c0281n2.f1629q = f7;
        c0281n2.f47311zy = f6 + c0271n2.f1524p;
        c0281n2.f1628k = f7 + c0271n2.f1516h;
        for (androidx.constraintlayout.core.motion.key.toq toqVar : this.f47543jp0y) {
            if (toqVar instanceof C0269n) {
                C0269n c0269n = (C0269n) toqVar;
                if (c0269n.m954t(i2, i3, c0281n, c0281n2, f2, f3)) {
                    return c0269n;
                }
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        return 0;
    }

    public void ki(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f47533cdj[0].mo1018q(d2, dArr);
        this.f47533cdj[0].f7l8(d2, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f47555qrj.x2(d2, this.f47540fu4, dArr, fArr, dArr2, fArr2);
    }

    /* JADX INFO: renamed from: l */
    String m1102l() {
        return this.f1799s.qrj();
    }

    public void ld6(float[] fArr, int i2) {
        double dMo986k;
        float f2 = 1.0f;
        float f3 = 1.0f / (i2 - 1);
        HashMap<String, kja0> map = this.f47535d3;
        kja0 kja0Var = map == null ? null : map.get("translationX");
        HashMap<String, kja0> map2 = this.f47535d3;
        kja0 kja0Var2 = map2 == null ? null : map2.get("translationY");
        HashMap<String, AbstractC0287y> map3 = this.f47554oc;
        AbstractC0287y abstractC0287y = map3 == null ? null : map3.get("translationX");
        HashMap<String, AbstractC0287y> map4 = this.f47554oc;
        AbstractC0287y abstractC0287y2 = map4 != null ? map4.get("translationY") : null;
        int i3 = 0;
        while (i3 < i2) {
            float fMin = i3 * f3;
            float f4 = this.f47538fn3e;
            if (f4 != f2) {
                float f5 = this.f1795i;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f4, f2);
                }
            }
            float f6 = fMin;
            double d2 = f6;
            C0284q c0284q = this.f47555qrj.f1519k;
            float f7 = Float.NaN;
            float f8 = 0.0f;
            for (C0271n c0271n : this.f47532a9) {
                C0284q c0284q2 = c0271n.f1519k;
                double d4 = d2;
                if (c0284q2 != null) {
                    float f9 = c0271n.f1522n;
                    if (f9 < f6) {
                        f8 = f9;
                        c0284q = c0284q2;
                    } else if (Float.isNaN(f7)) {
                        f7 = c0271n.f1522n;
                    }
                }
                d2 = d4;
            }
            double d5 = d2;
            if (c0284q != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                dMo986k = (((float) c0284q.mo986k((f6 - f8) / r5)) * (f7 - f8)) + f8;
            } else {
                dMo986k = d5;
            }
            this.f47533cdj[0].mo1018q(dMo986k, this.f1802z);
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47544ki;
            if (toqVar != null) {
                double[] dArr = this.f1802z;
                if (dArr.length > 0) {
                    toqVar.mo1018q(dMo986k, dArr);
                }
            }
            int i4 = i3 * 2;
            int i5 = i3;
            this.f47555qrj.ld6(dMo986k, this.f47540fu4, this.f1802z, fArr, i4);
            if (abstractC0287y != null) {
                fArr[i4] = fArr[i4] + abstractC0287y.m1074k(f6);
            } else if (kja0Var != null) {
                fArr[i4] = fArr[i4] + kja0Var.m1030k(f6);
            }
            if (abstractC0287y2 != null) {
                int i6 = i4 + 1;
                fArr[i6] = fArr[i6] + abstractC0287y2.m1074k(f6);
            } else if (kja0Var2 != null) {
                int i7 = i4 + 1;
                fArr[i7] = fArr[i7] + kja0Var2.m1030k(f6);
            }
            i3 = i5 + 1;
            f2 = 1.0f;
        }
    }

    public void lrht(int i2) {
        this.f47555qrj.f1525q = i2;
    }

    public float lvui() {
        return this.f47555qrj.f1527s;
    }

    /* JADX INFO: renamed from: m */
    public void m1103m(zy zyVar) {
        this.f47555qrj.o1t(zyVar, zyVar.f47555qrj);
        this.f47550n7h.o1t(zyVar, zyVar.f47550n7h);
    }

    public int mcp(int i2, int[] iArr) {
        float[] fArr = new float[2];
        int i3 = 0;
        int i4 = 0;
        for (androidx.constraintlayout.core.motion.key.toq toqVar : this.f47543jp0y) {
            int i5 = toqVar.f47227ld6;
            if (i5 == i2 || i2 != -1) {
                iArr[i4] = 0;
                int i6 = i4 + 1;
                iArr[i6] = i5;
                int i7 = i6 + 1;
                int i8 = toqVar.f1500y;
                iArr[i7] = i8;
                double d2 = i8 / 100.0f;
                this.f47533cdj[0].mo1018q(d2, this.f1802z);
                this.f47555qrj.ld6(d2, this.f47540fu4, this.f1802z, fArr, 0);
                int i9 = i7 + 1;
                iArr[i9] = Float.floatToIntBits(fArr[0]);
                int i10 = i9 + 1;
                iArr[i10] = Float.floatToIntBits(fArr[1]);
                if (toqVar instanceof C0269n) {
                    C0269n c0269n = (C0269n) toqVar;
                    int i11 = i10 + 1;
                    iArr[i11] = c0269n.f47184d3;
                    int i12 = i11 + 1;
                    iArr[i12] = Float.floatToIntBits(c0269n.f47183a9);
                    i10 = i12 + 1;
                    iArr[i10] = Float.floatToIntBits(c0269n.f47186fti);
                }
                int i13 = i10 + 1;
                iArr[i4] = i13 - i4;
                i3++;
                i4 = i13;
            }
        }
        return i3;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (705 == i2) {
            System.out.println("TYPE_INTERPOLATOR  " + str);
            this.f47551ncyb = wvg(-1, str, 0);
        }
        return false;
    }

    void n5r1(C0265g c0265g, C0269n c0269n, float f2, float f3, String[] strArr, float[] fArr) {
        C0281n c0281n = new C0281n();
        C0271n c0271n = this.f47555qrj;
        float f4 = c0271n.f1529y;
        c0281n.f47310toq = f4;
        float f5 = c0271n.f1527s;
        c0281n.f1629q = f5;
        c0281n.f47311zy = f4 + c0271n.f1524p;
        c0281n.f1628k = f5 + c0271n.f1516h;
        C0281n c0281n2 = new C0281n();
        C0271n c0271n2 = this.f47550n7h;
        float f6 = c0271n2.f1529y;
        c0281n2.f47310toq = f6;
        float f7 = c0271n2.f1527s;
        c0281n2.f1629q = f7;
        c0281n2.f47311zy = f6 + c0271n2.f1524p;
        c0281n2.f1628k = f7 + c0271n2.f1516h;
        c0269n.mcp(c0265g, c0281n, c0281n2, f2, f3, strArr, fArr);
    }

    void n7h(boolean z2) {
    }

    public boolean ncyb(C0265g c0265g, float f2, long j2, androidx.constraintlayout.core.motion.utils.f7l8 f7l8Var) {
        double d2;
        float fKja0 = kja0(f2, null);
        int i2 = this.f47536dd;
        if (i2 != -1) {
            float f3 = 1.0f / i2;
            float fFloor = ((float) Math.floor(fKja0 / f3)) * f3;
            float f4 = (fKja0 % f3) / f3;
            if (!Float.isNaN(this.f47559x9kr)) {
                f4 = (f4 + this.f47559x9kr) % 1.0f;
            }
            androidx.constraintlayout.core.motion.utils.zy zyVar = this.f47551ncyb;
            fKja0 = ((zyVar != null ? zyVar.getInterpolation(f4) : ((double) f4) > 0.5d ? 1.0f : 0.0f) * f3) + fFloor;
        }
        float f5 = fKja0;
        HashMap<String, kja0> map = this.f47535d3;
        if (map != null) {
            Iterator<kja0> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().mo1033y(c0265g, f5);
            }
        }
        androidx.constraintlayout.core.motion.utils.toq[] toqVarArr = this.f47533cdj;
        if (toqVarArr != null) {
            double d4 = f5;
            toqVarArr[0].mo1018q(d4, this.f1802z);
            this.f47533cdj[0].f7l8(d4, this.f47553o1t);
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47544ki;
            if (toqVar != null) {
                double[] dArr = this.f1802z;
                if (dArr.length > 0) {
                    toqVar.mo1018q(d4, dArr);
                    this.f47544ki.f7l8(d4, this.f47553o1t);
                }
            }
            if (this.f1796l) {
                d2 = d4;
            } else {
                d2 = d4;
                this.f47555qrj.m966z(f5, c0265g, this.f47540fu4, this.f1802z, this.f47553o1t, null);
            }
            if (this.f47547lvui != -1) {
                if (this.f1798r == null) {
                    this.f1798r = c0265g.n7h().m930g(this.f47547lvui);
                }
                if (this.f1798r != null) {
                    float fNi7 = (r1.ni7() + this.f1798r.m941y()) / 2.0f;
                    float fX2 = (this.f1798r.x2() + this.f1798r.cdj()) / 2.0f;
                    if (c0265g.cdj() - c0265g.x2() > 0 && c0265g.m941y() - c0265g.ni7() > 0) {
                        c0265g.m938r(fX2 - c0265g.x2());
                        c0265g.dd(fNi7 - c0265g.ni7());
                    }
                }
            }
            int i3 = 1;
            while (true) {
                androidx.constraintlayout.core.motion.utils.toq[] toqVarArr2 = this.f47533cdj;
                if (i3 >= toqVarArr2.length) {
                    break;
                }
                toqVarArr2[i3].mo1017n(d2, this.f47542jk);
                this.f47555qrj.f1512c.get(this.f47557wvg[i3 - 1]).ni7(c0265g, this.f47542jk);
                i3++;
            }
            C0274q c0274q = this.f47545kja0;
            if (c0274q.f1547q == 0) {
                if (f5 <= 0.0f) {
                    c0265g.hb(c0274q.f1544n);
                } else if (f5 >= 1.0f) {
                    c0265g.hb(this.f1794h.f1544n);
                } else if (this.f1794h.f1544n != c0274q.f1544n) {
                    c0265g.hb(4);
                }
            }
            if (this.f47537eqxt != null) {
                int i4 = 0;
                while (true) {
                    f7l8[] f7l8VarArr = this.f47537eqxt;
                    if (i4 >= f7l8VarArr.length) {
                        break;
                    }
                    f7l8VarArr[i4].zurt(f5, c0265g);
                    i4++;
                }
            }
        } else {
            C0271n c0271n = this.f47555qrj;
            float f6 = c0271n.f1529y;
            C0271n c0271n2 = this.f47550n7h;
            float f7 = f6 + ((c0271n2.f1529y - f6) * f5);
            float f8 = c0271n.f1527s;
            float f9 = f8 + ((c0271n2.f1527s - f8) * f5);
            float f10 = c0271n.f1524p;
            float f11 = f10 + ((c0271n2.f1524p - f10) * f5);
            float f12 = c0271n.f1516h;
            float f13 = f7 + 0.5f;
            float f14 = f9 + 0.5f;
            c0265g.jp0y((int) f13, (int) f14, (int) (f13 + f11), (int) (f14 + f12 + ((c0271n2.f1516h - f12) * f5)));
        }
        HashMap<String, AbstractC0287y> map2 = this.f47554oc;
        if (map2 == null) {
            return false;
        }
        for (AbstractC0287y abstractC0287y : map2.values()) {
            if (abstractC0287y instanceof AbstractC0287y.g) {
                double[] dArr2 = this.f47553o1t;
                ((AbstractC0287y.g) abstractC0287y).x2(c0265g, f5, dArr2[0], dArr2[1]);
            } else {
                abstractC0287y.mo1078y(c0265g, f5);
            }
        }
        return false;
    }

    public float ni7() {
        return this.f47550n7h.f1516h;
    }

    public void nn86(C0288z c0288z, C0265g c0265g, int i2, int i3, int i4) {
        C0271n c0271n = this.f47555qrj;
        c0271n.f1522n = 0.0f;
        c0271n.f1515g = 0.0f;
        qrj qrjVar = new qrj();
        if (i2 == 1) {
            int i5 = c0288z.f47370toq + c0288z.f1696q;
            qrjVar.f47328toq = ((c0288z.f47371zy + c0288z.f1695n) - c0288z.zy()) / 2;
            qrjVar.f1647q = i3 - ((i5 + c0288z.toq()) / 2);
            qrjVar.f47329zy = qrjVar.f47328toq + c0288z.zy();
            qrjVar.f1646k = qrjVar.f1647q + c0288z.toq();
        } else if (i2 == 2) {
            int i6 = c0288z.f47370toq + c0288z.f1696q;
            qrjVar.f47328toq = i4 - (((c0288z.f47371zy + c0288z.f1695n) + c0288z.zy()) / 2);
            qrjVar.f1647q = (i6 - c0288z.toq()) / 2;
            qrjVar.f47329zy = qrjVar.f47328toq + c0288z.zy();
            qrjVar.f1646k = qrjVar.f1647q + c0288z.toq();
        }
        this.f47555qrj.ni7(qrjVar.f47328toq, qrjVar.f1647q, qrjVar.toq(), qrjVar.m1052k());
        this.f47545kja0.m970h(qrjVar, c0265g, i2, c0288z.f1694k);
    }

    /* JADX INFO: renamed from: o */
    public void m1104o(int i2, int i3, float f2, long j2) {
        ArrayList arrayList;
        String[] strArr;
        C0271n[] c0271nArr;
        int i4;
        toq toqVar;
        kja0 kja0VarM1027g;
        toq toqVar2;
        Integer num;
        kja0 kja0VarM1027g2;
        toq toqVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        int i5 = this.f47534d2ok;
        if (i5 != -1) {
            this.f47555qrj.f1528t = i5;
        }
        this.f47545kja0.f7l8(this.f1794h, hashSet2);
        ArrayList<androidx.constraintlayout.core.motion.key.toq> arrayList2 = this.f47543jp0y;
        if (arrayList2 != null) {
            arrayList = null;
            for (androidx.constraintlayout.core.motion.key.toq toqVar4 : arrayList2) {
                if (toqVar4 instanceof C0269n) {
                    C0269n c0269n = (C0269n) toqVar4;
                    x9kr(new C0271n(i2, i3, c0269n, this.f47555qrj, this.f47550n7h));
                    int i6 = c0269n.f1485z;
                    if (i6 != -1) {
                        this.f47558x2 = i6;
                    }
                } else if (toqVar4 instanceof C0270q) {
                    toqVar4.mo951s(hashSet3);
                } else if (toqVar4 instanceof C0267g) {
                    toqVar4.mo951s(hashSet);
                } else if (toqVar4 instanceof f7l8) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((f7l8) toqVar4);
                } else {
                    toqVar4.cdj(map);
                    toqVar4.mo951s(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f47537eqxt = (f7l8[]) arrayList.toArray(new f7l8[0]);
        }
        char c2 = 1;
        if (!hashSet2.isEmpty()) {
            this.f47535d3 = new HashMap<>();
            for (String str : hashSet2) {
                if (str.startsWith("CUSTOM,")) {
                    C0285s.toq toqVar5 = new C0285s.toq();
                    String str2 = str.split(",")[c2];
                    for (androidx.constraintlayout.core.motion.key.toq toqVar6 : this.f47543jp0y) {
                        HashMap<String, toq> map2 = toqVar6.f47228x2;
                        if (map2 != null && (toqVar3 = map2.get(str2)) != null) {
                            toqVar5.m1058k(toqVar6.f1500y, toqVar3);
                        }
                    }
                    kja0VarM1027g2 = kja0.m1028n(str, toqVar5);
                } else {
                    kja0VarM1027g2 = kja0.m1027g(str, j2);
                }
                if (kja0VarM1027g2 != null) {
                    kja0VarM1027g2.m1032s(str);
                    this.f47535d3.put(str, kja0VarM1027g2);
                }
                c2 = 1;
            }
            ArrayList<androidx.constraintlayout.core.motion.key.toq> arrayList3 = this.f47543jp0y;
            if (arrayList3 != null) {
                for (androidx.constraintlayout.core.motion.key.toq toqVar7 : arrayList3) {
                    if (toqVar7 instanceof androidx.constraintlayout.core.motion.key.zy) {
                        toqVar7.mo950g(this.f47535d3);
                    }
                }
            }
            this.f47545kja0.toq(this.f47535d3, 0);
            this.f1794h.toq(this.f47535d3, 100);
            for (String str3 : this.f47535d3.keySet()) {
                int iIntValue = (!map.containsKey(str3) || (num = map.get(str3)) == null) ? 0 : num.intValue();
                kja0 kja0Var = this.f47535d3.get(str3);
                if (kja0Var != null) {
                    kja0Var.mo1031p(iIntValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.f47541gvn7 == null) {
                this.f47541gvn7 = new HashMap<>();
            }
            for (String str4 : hashSet) {
                if (!this.f47541gvn7.containsKey(str4)) {
                    if (str4.startsWith("CUSTOM,")) {
                        C0285s.toq toqVar8 = new C0285s.toq();
                        String str5 = str4.split(",")[1];
                        for (androidx.constraintlayout.core.motion.key.toq toqVar9 : this.f47543jp0y) {
                            HashMap<String, toq> map3 = toqVar9.f47228x2;
                            if (map3 != null && (toqVar2 = map3.get(str5)) != null) {
                                toqVar8.m1058k(toqVar9.f1500y, toqVar2);
                            }
                        }
                        kja0VarM1027g = kja0.m1028n(str4, toqVar8);
                    } else {
                        kja0VarM1027g = kja0.m1027g(str4, j2);
                    }
                    if (kja0VarM1027g != null) {
                        kja0VarM1027g.m1032s(str4);
                    }
                }
            }
            ArrayList<androidx.constraintlayout.core.motion.key.toq> arrayList4 = this.f47543jp0y;
            if (arrayList4 != null) {
                for (androidx.constraintlayout.core.motion.key.toq toqVar10 : arrayList4) {
                    if (toqVar10 instanceof C0267g) {
                        ((C0267g) toqVar10).zurt(this.f47541gvn7);
                    }
                }
            }
            for (String str6 : this.f47541gvn7.keySet()) {
                this.f47541gvn7.get(str6).mo1009g(map.containsKey(str6) ? map.get(str6).intValue() : 0);
            }
        }
        int i7 = 2;
        int size = this.f47532a9.size() + 2;
        C0271n[] c0271nArr2 = new C0271n[size];
        c0271nArr2[0] = this.f47555qrj;
        c0271nArr2[size - 1] = this.f47550n7h;
        if (this.f47532a9.size() > 0 && this.f47558x2 == androidx.constraintlayout.core.motion.key.toq.f47224qrj) {
            this.f47558x2 = 0;
        }
        Iterator<C0271n> it = this.f47532a9.iterator();
        int i8 = 1;
        while (it.hasNext()) {
            c0271nArr2[i8] = it.next();
            i8++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str7 : this.f47550n7h.f1512c.keySet()) {
            if (this.f47555qrj.f1512c.containsKey(str7)) {
                if (!hashSet2.contains("CUSTOM," + str7)) {
                    hashSet4.add(str7);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.f47557wvg = strArr2;
        this.f1800t = new int[strArr2.length];
        int i9 = 0;
        while (true) {
            strArr = this.f47557wvg;
            if (i9 >= strArr.length) {
                break;
            }
            String str8 = strArr[i9];
            this.f1800t[i9] = 0;
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (c0271nArr2[i10].f1512c.containsKey(str8) && (toqVar = c0271nArr2[i10].f1512c.get(str8)) != null) {
                    int[] iArr = this.f1800t;
                    iArr[i9] = iArr[i9] + toqVar.ki();
                    break;
                }
                i10++;
            }
            i9++;
        }
        boolean z2 = c0271nArr2[0].f1528t != -1;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 1; i11 < size; i11++) {
            c0271nArr2[i11].f7l8(c0271nArr2[i11 - 1], zArr, this.f47557wvg, z2);
        }
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                i12++;
            }
        }
        this.f47540fu4 = new int[i12];
        int iMax = Math.max(2, i12);
        this.f1802z = new double[iMax];
        this.f47553o1t = new double[iMax];
        int i14 = 0;
        for (int i15 = 1; i15 < length; i15++) {
            if (zArr[i15]) {
                this.f47540fu4[i14] = i15;
                i14++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, this.f47540fu4.length);
        double[] dArr2 = new double[size];
        for (int i16 = 0; i16 < size; i16++) {
            c0271nArr2[i16].m965s(dArr[i16], this.f47540fu4);
            dArr2[i16] = c0271nArr2[i16].f1522n;
        }
        int i17 = 0;
        while (true) {
            int[] iArr2 = this.f47540fu4;
            if (i17 >= iArr2.length) {
                break;
            }
            if (iArr2[i17] < C0271n.an.length) {
                String str9 = C0271n.an[this.f47540fu4[i17]] + " [";
                for (int i18 = 0; i18 < size; i18++) {
                    str9 = str9 + dArr[i18][i17];
                }
            }
            i17++;
        }
        this.f47533cdj = new androidx.constraintlayout.core.motion.utils.toq[this.f47557wvg.length + 1];
        int i19 = 0;
        while (true) {
            String[] strArr3 = this.f47557wvg;
            if (i19 >= strArr3.length) {
                break;
            }
            String str10 = strArr3[i19];
            int i20 = 0;
            int i21 = 0;
            double[] dArr3 = null;
            double[][] dArr4 = null;
            while (i20 < size) {
                if (c0271nArr2[i20].cdj(str10)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i7];
                        iArr3[1] = c0271nArr2[i20].kja0(str10);
                        i4 = 0;
                        iArr3[0] = size;
                        dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr3);
                    } else {
                        i4 = 0;
                    }
                    C0271n c0271n = c0271nArr2[i20];
                    c0271nArr = c0271nArr2;
                    dArr3[i21] = c0271n.f1522n;
                    c0271n.n7h(str10, dArr4[i21], i4);
                    i21++;
                } else {
                    c0271nArr = c0271nArr2;
                }
                i20++;
                c0271nArr2 = c0271nArr;
                i7 = 2;
            }
            i19++;
            this.f47533cdj[i19] = androidx.constraintlayout.core.motion.utils.toq.m1067k(this.f47558x2, Arrays.copyOf(dArr3, i21), (double[][]) Arrays.copyOf(dArr4, i21));
            c0271nArr2 = c0271nArr2;
            i7 = 2;
        }
        C0271n[] c0271nArr3 = c0271nArr2;
        this.f47533cdj[0] = androidx.constraintlayout.core.motion.utils.toq.m1067k(this.f47558x2, dArr2, dArr);
        if (c0271nArr3[0].f1528t != -1) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
            for (int i22 = 0; i22 < size; i22++) {
                iArr4[i22] = c0271nArr3[i22].f1528t;
                dArr5[i22] = r6.f1522n;
                double[] dArr7 = dArr6[i22];
                dArr7[0] = r6.f1529y;
                dArr7[1] = r6.f1527s;
            }
            this.f47544ki = androidx.constraintlayout.core.motion.utils.toq.toq(iArr4, dArr5, dArr6);
        }
        float fD3 = Float.NaN;
        this.f47554oc = new HashMap<>();
        if (this.f47543jp0y != null) {
            for (String str11 : hashSet3) {
                AbstractC0287y abstractC0287yM1072q = AbstractC0287y.m1072q(str11);
                if (abstractC0287yM1072q != null) {
                    if (abstractC0287yM1072q.ld6() && Float.isNaN(fD3)) {
                        fD3 = d3();
                    }
                    abstractC0287yM1072q.m1077s(str11);
                    this.f47554oc.put(str11, abstractC0287yM1072q);
                }
            }
            for (androidx.constraintlayout.core.motion.key.toq toqVar11 : this.f47543jp0y) {
                if (toqVar11 instanceof C0270q) {
                    ((C0270q) toqVar11).zurt(this.f47554oc);
                }
            }
            Iterator<AbstractC0287y> it2 = this.f47554oc.values().iterator();
            while (it2.hasNext()) {
                it2.next().m1076p(fD3);
            }
        }
    }

    public float o1t() {
        return this.f47550n7h.f1527s;
    }

    public float oc() {
        return this.f47555qrj.f1516h;
    }

    /* JADX INFO: renamed from: p */
    public int m1105p(float[] fArr, int[] iArr, int[] iArr2) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo1019y = this.f47533cdj[0].mo1019y();
        if (iArr != null) {
            Iterator<C0271n> it = this.f47532a9.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().f1513e;
                i2++;
            }
        }
        if (iArr2 != null) {
            Iterator<C0271n> it2 = this.f47532a9.iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                iArr2[i3] = (int) (it2.next().f1515g * 100.0f);
                i3++;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < dArrMo1019y.length; i5++) {
            this.f47533cdj[0].mo1018q(dArrMo1019y[i5], this.f1802z);
            this.f47555qrj.ld6(dArrMo1019y[i5], this.f47540fu4, this.f1802z, fArr, i4);
            i4 += 2;
        }
        return i4 / 2;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: q */
    public boolean mo937q(int i2, boolean z2) {
        return false;
    }

    void qrj(float[] fArr, int i2) {
        float f2 = 1.0f / (i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f47533cdj[0].mo1018q(kja0(i3 * f2, null), this.f1802z);
            this.f47555qrj.m961h(this.f47540fu4, this.f1802z, fArr, i3 * 8);
        }
    }

    /* JADX INFO: renamed from: r */
    public int m1106r() {
        return this.f47547lvui;
    }

    /* JADX INFO: renamed from: s */
    int m1107s(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] dArrMo1019y = this.f47533cdj[0].mo1019y();
        if (iArr != null) {
            Iterator<C0271n> it = this.f47532a9.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                iArr[i2] = it.next().f1513e;
                i2++;
            }
        }
        int i3 = 0;
        for (double d2 : dArrMo1019y) {
            this.f47533cdj[0].mo1018q(d2, this.f1802z);
            this.f47555qrj.m963p(this.f47540fu4, this.f1802z, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* JADX INFO: renamed from: t */
    public C0271n m1108t(int i2) {
        return this.f47532a9.get(i2);
    }

    public float t8r() {
        return this.f47560zurt;
    }

    public String toString() {
        return " start: x: " + this.f47555qrj.f1529y + " y: " + this.f47555qrj.f1527s + " end: x: " + this.f47550n7h.f1529y + " y: " + this.f47550n7h.f1527s;
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    public boolean toq(int i2, int i3) {
        if (i2 != 509) {
            return i2 == 704;
        }
        vyq(i3);
        return true;
    }

    public void uv6(C0265g c0265g) {
        C0271n c0271n = this.f47550n7h;
        c0271n.f1522n = 1.0f;
        c0271n.f1515g = 1.0f;
        hyr(c0271n);
        this.f47550n7h.ni7(c0265g.x2(), c0265g.ni7(), c0265g.jk(), c0265g.ld6());
        this.f47550n7h.toq(c0265g);
        this.f1794h.kja0(c0265g);
    }

    public void vyq(int i2) {
        this.f47534d2ok = i2;
    }

    public void x2(float f2, float[] fArr, int i2) {
        this.f47533cdj[0].mo1018q(kja0(f2, null), this.f1802z);
        this.f47555qrj.m961h(this.f47540fu4, this.f1802z, fArr, i2);
    }

    /* JADX INFO: renamed from: y */
    void m1109y(float[] fArr, int i2) {
        float f2 = 1.0f / (i2 - 1);
        HashMap<String, kja0> map = this.f47535d3;
        if (map != null) {
            map.get("translationX");
        }
        HashMap<String, kja0> map2 = this.f47535d3;
        if (map2 != null) {
            map2.get("translationY");
        }
        HashMap<String, AbstractC0287y> map3 = this.f47554oc;
        if (map3 != null) {
            map3.get("translationX");
        }
        HashMap<String, AbstractC0287y> map4 = this.f47554oc;
        if (map4 != null) {
            map4.get("translationY");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            float fMin = i3 * f2;
            float f3 = this.f47538fn3e;
            float f4 = 0.0f;
            if (f3 != 1.0f) {
                float f5 = this.f1795i;
                if (fMin < f5) {
                    fMin = 0.0f;
                }
                if (fMin > f5 && fMin < 1.0d) {
                    fMin = Math.min((fMin - f5) * f3, 1.0f);
                }
            }
            double dMo986k = fMin;
            C0284q c0284q = this.f47555qrj.f1519k;
            float f6 = Float.NaN;
            for (C0271n c0271n : this.f47532a9) {
                C0284q c0284q2 = c0271n.f1519k;
                if (c0284q2 != null) {
                    float f7 = c0271n.f1522n;
                    if (f7 < fMin) {
                        c0284q = c0284q2;
                        f4 = f7;
                    } else if (Float.isNaN(f6)) {
                        f6 = c0271n.f1522n;
                    }
                }
            }
            if (c0284q != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                dMo986k = (((float) c0284q.mo986k((fMin - f4) / r11)) * (f6 - f4)) + f4;
            }
            this.f47533cdj[0].mo1018q(dMo986k, this.f1802z);
            androidx.constraintlayout.core.motion.utils.toq toqVar = this.f47544ki;
            if (toqVar != null) {
                double[] dArr = this.f1802z;
                if (dArr.length > 0) {
                    toqVar.mo1018q(dMo986k, dArr);
                }
            }
            this.f47555qrj.m963p(this.f47540fu4, this.f1802z, fArr, i3 * 2);
        }
    }

    /* JADX INFO: renamed from: z */
    public float m1110z() {
        return this.f47550n7h.f1529y;
    }

    public int zurt() {
        int iMax = this.f47555qrj.f1525q;
        Iterator<C0271n> it = this.f47532a9.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f1525q);
        }
        return Math.max(iMax, this.f47550n7h.f1525q);
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        return false;
    }
}
