package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.C0284q;
import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.ni7;
import androidx.constraintlayout.core.motion.utils.qrj;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.q */
/* JADX INFO: compiled from: MotionConstrainedPoint.java */
/* JADX INFO: loaded from: classes.dex */
class C0274q implements Comparable<C0274q> {
    static final int an = 1;
    public static final String bp = "MotionPaths";
    public static final boolean bv = false;
    static final int id = 2;
    static String[] in = {"position", AnimatedProperty.PROPERTY_NAME_X, AnimatedProperty.PROPERTY_NAME_Y, "width", InterfaceC1925p.byf, "pathRotate"};

    /* JADX INFO: renamed from: a */
    private float f1531a;

    /* JADX INFO: renamed from: b */
    private float f1532b;

    /* JADX INFO: renamed from: e */
    private C0284q f1535e;

    /* JADX INFO: renamed from: m */
    private float f1543m;

    /* JADX INFO: renamed from: n */
    int f1544n;

    /* JADX INFO: renamed from: o */
    private float f1545o;

    /* JADX INFO: renamed from: x */
    private float f1554x;

    /* JADX INFO: renamed from: k */
    private float f1541k = 1.0f;

    /* JADX INFO: renamed from: q */
    int f1547q = 0;

    /* JADX INFO: renamed from: g */
    private boolean f1537g = false;

    /* JADX INFO: renamed from: y */
    private float f1555y = 0.0f;

    /* JADX INFO: renamed from: s */
    private float f1549s = 0.0f;

    /* JADX INFO: renamed from: p */
    private float f1546p = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f1538h = 0.0f;

    /* JADX INFO: renamed from: i */
    private float f1539i = 1.0f;

    /* JADX INFO: renamed from: z */
    private float f1556z = 1.0f;

    /* JADX INFO: renamed from: t */
    private float f1550t = Float.NaN;

    /* JADX INFO: renamed from: r */
    private float f1548r = Float.NaN;

    /* JADX INFO: renamed from: l */
    private float f1542l = 0.0f;

    /* JADX INFO: renamed from: f */
    private float f1536f = 0.0f;

    /* JADX INFO: renamed from: c */
    private float f1533c = 0.0f;

    /* JADX INFO: renamed from: j */
    private int f1540j = 0;

    /* JADX INFO: renamed from: u */
    private float f1551u = Float.NaN;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f47249bo = Float.NaN;

    /* JADX INFO: renamed from: v */
    private int f1552v = -1;

    /* JADX INFO: renamed from: d */
    LinkedHashMap<String, toq> f1534d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: w */
    int f1553w = 0;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    double[] f47248ab = new double[18];
    double[] bb = new double[18];

    /* JADX INFO: renamed from: n */
    private boolean m969n(float f2, float f3) {
        return (Float.isNaN(f2) || Float.isNaN(f3)) ? Float.isNaN(f2) != Float.isNaN(f3) : Math.abs(f2 - f3) > 1.0E-6f;
    }

    void f7l8(C0274q c0274q, HashSet<String> hashSet) {
        if (m969n(this.f1541k, c0274q.f1541k)) {
            hashSet.add("alpha");
        }
        if (m969n(this.f1555y, c0274q.f1555y)) {
            hashSet.add("translationZ");
        }
        int i2 = this.f1544n;
        int i3 = c0274q.f1544n;
        if (i2 != i3 && this.f1547q == 0 && (i2 == 4 || i3 == 4)) {
            hashSet.add("alpha");
        }
        if (m969n(this.f1549s, c0274q.f1549s)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.f1551u) || !Float.isNaN(c0274q.f1551u)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.f47249bo) || !Float.isNaN(c0274q.f47249bo)) {
            hashSet.add("progress");
        }
        if (m969n(this.f1546p, c0274q.f1546p)) {
            hashSet.add("rotationX");
        }
        if (m969n(this.f1538h, c0274q.f1538h)) {
            hashSet.add("rotationY");
        }
        if (m969n(this.f1550t, c0274q.f1550t)) {
            hashSet.add("pivotX");
        }
        if (m969n(this.f1548r, c0274q.f1548r)) {
            hashSet.add("pivotY");
        }
        if (m969n(this.f1539i, c0274q.f1539i)) {
            hashSet.add("scaleX");
        }
        if (m969n(this.f1556z, c0274q.f1556z)) {
            hashSet.add("scaleY");
        }
        if (m969n(this.f1542l, c0274q.f1542l)) {
            hashSet.add("translationX");
        }
        if (m969n(this.f1536f, c0274q.f1536f)) {
            hashSet.add("translationY");
        }
        if (m969n(this.f1533c, c0274q.f1533c)) {
            hashSet.add("translationZ");
        }
        if (m969n(this.f1555y, c0274q.f1555y)) {
            hashSet.add("elevation");
        }
    }

    /* JADX INFO: renamed from: h */
    public void m970h(qrj qrjVar, C0265g c0265g, int i2, float f2) {
        n7h(qrjVar.f47328toq, qrjVar.f1647q, qrjVar.toq(), qrjVar.m1052k());
        zy(c0265g);
        this.f1550t = Float.NaN;
        this.f1548r = Float.NaN;
        if (i2 == 1) {
            this.f1549s = f2 - 90.0f;
        } else {
            if (i2 != 2) {
                return;
            }
            this.f1549s = f2 + 90.0f;
        }
    }

    public void kja0(C0265g c0265g) {
        n7h(c0265g.a9(), c0265g.fti(), c0265g.jk(), c0265g.ld6());
        zy(c0265g);
    }

    int ld6(String str, double[] dArr, int i2) {
        toq toqVar = this.f1534d.get(str);
        if (toqVar.ki() == 1) {
            dArr[i2] = toqVar.n7h();
            return 1;
        }
        int iKi = toqVar.ki();
        toqVar.kja0(new float[iKi]);
        int i3 = 0;
        while (i3 < iKi) {
            dArr[i2] = r1[i3];
            i3++;
            i2++;
        }
        return iKi;
    }

    void n7h(float f2, float f3, float f4, float f5) {
        this.f1543m = f2;
        this.f1532b = f3;
        this.f1531a = f4;
        this.f1554x = f5;
    }

    /* JADX INFO: renamed from: p */
    void m971p(double[] dArr, int[] iArr) {
        float[] fArr = {this.f1545o, this.f1543m, this.f1532b, this.f1531a, this.f1554x, this.f1541k, this.f1555y, this.f1549s, this.f1546p, this.f1538h, this.f1539i, this.f1556z, this.f1550t, this.f1548r, this.f1542l, this.f1536f, this.f1533c, this.f1551u};
        int i2 = 0;
        for (int i3 : iArr) {
            if (i3 < 18) {
                dArr[i2] = fArr[r4];
                i2++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0274q c0274q) {
        return Float.compare(this.f1545o, c0274q.f1545o);
    }

    boolean qrj(String str) {
        return this.f1534d.containsKey(str);
    }

    /* JADX INFO: renamed from: s */
    void m973s(C0274q c0274q, boolean[] zArr, String[] strArr) {
        zArr[0] = zArr[0] | m969n(this.f1545o, c0274q.f1545o);
        zArr[1] = zArr[1] | m969n(this.f1543m, c0274q.f1543m);
        zArr[2] = zArr[2] | m969n(this.f1532b, c0274q.f1532b);
        zArr[3] = zArr[3] | m969n(this.f1531a, c0274q.f1531a);
        zArr[4] = m969n(this.f1554x, c0274q.f1554x) | zArr[4];
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void toq(HashMap<String, kja0> map, int i2) {
        for (String str : map.keySet()) {
            kja0 kja0Var = map.get(str);
            str.hashCode();
            byte b2 = -1;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        b2 = 0;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        b2 = 1;
                    }
                    break;
                case -1249320804:
                    if (str.equals("rotationZ")) {
                        b2 = 2;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        b2 = 3;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        b2 = 4;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        b2 = 5;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        b2 = 6;
                    }
                    break;
                case -987906986:
                    if (str.equals("pivotX")) {
                        b2 = 7;
                    }
                    break;
                case -987906985:
                    if (str.equals("pivotY")) {
                        b2 = 8;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        b2 = 9;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        b2 = 10;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        b2 = com.google.common.base.zy.f68132qrj;
                    }
                    break;
                case 803192288:
                    if (str.equals("pathRotate")) {
                        b2 = com.google.common.base.zy.f68128n7h;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1546p) ? 0.0f : this.f1546p);
                    break;
                case 1:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1538h) ? 0.0f : this.f1538h);
                    break;
                case 2:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1549s) ? 0.0f : this.f1549s);
                    break;
                case 3:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1542l) ? 0.0f : this.f1542l);
                    break;
                case 4:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1536f) ? 0.0f : this.f1536f);
                    break;
                case 5:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1533c) ? 0.0f : this.f1533c);
                    break;
                case 6:
                    kja0Var.f7l8(i2, Float.isNaN(this.f47249bo) ? 0.0f : this.f47249bo);
                    break;
                case 7:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1550t) ? 0.0f : this.f1550t);
                    break;
                case 8:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1548r) ? 0.0f : this.f1548r);
                    break;
                case 9:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1539i) ? 1.0f : this.f1539i);
                    break;
                case 10:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1556z) ? 1.0f : this.f1556z);
                    break;
                case 11:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1541k) ? 1.0f : this.f1541k);
                    break;
                case 12:
                    kja0Var.f7l8(i2, Float.isNaN(this.f1551u) ? 0.0f : this.f1551u);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.f1534d.containsKey(str2)) {
                            toq toqVar = this.f1534d.get(str2);
                            if (kja0Var instanceof kja0.zy) {
                                ((kja0.zy) kja0Var).ld6(i2, toqVar);
                            } else {
                                ni7.m1040g("MotionPaths", str + " ViewSpline not a CustomSet frame = " + i2 + ", value" + toqVar.n7h() + kja0Var);
                            }
                        }
                    } else {
                        ni7.m1040g("MotionPaths", "UNKNOWN spline " + str);
                    }
                    break;
            }
        }
    }

    int x2(String str) {
        return this.f1534d.get(str).ki();
    }

    public void zy(C0265g c0265g) {
        this.f1544n = c0265g.m940t();
        this.f1541k = c0265g.m940t() != 4 ? 0.0f : c0265g.f7l8();
        this.f1537g = false;
        this.f1549s = c0265g.m932i();
        this.f1546p = c0265g.ki();
        this.f1538h = c0265g.t8r();
        this.f1539i = c0265g.fn3e();
        this.f1556z = c0265g.zurt();
        this.f1550t = c0265g.kja0();
        this.f1548r = c0265g.m931h();
        this.f1542l = c0265g.fu4();
        this.f1536f = c0265g.m942z();
        this.f1533c = c0265g.o1t();
        for (String str : c0265g.m936p()) {
            toq toqVarM939s = c0265g.m939s(str);
            if (toqVarM939s != null && toqVarM939s.cdj()) {
                this.f1534d.put(str, toqVarM939s);
            }
        }
    }
}
