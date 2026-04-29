package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.C0265g;
import androidx.constraintlayout.core.motion.utils.C0281n;
import androidx.constraintlayout.core.motion.utils.kja0;
import androidx.constraintlayout.core.motion.utils.zurt;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.key.n */
/* JADX INFO: compiled from: MotionKeyPosition.java */
/* JADX INFO: loaded from: classes.dex */
public class C0269n extends toq {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    static final String f47178d2ok = "KeyPosition";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f47179dd = 1;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    protected static final float f47180lvui = 20.0f;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    static final int f47181ncyb = 2;

    /* JADX INFO: renamed from: r */
    public static final int f1483r = 2;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final int f47182x9kr = 0;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public float f47183a9;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public int f47184d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private float f47185eqxt;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public float f47186fti;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public float f47187gvn7;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public float f47188jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public float f47189jp0y;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public float f47190mcp;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public String f47191o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private float f47192oc;

    /* JADX INFO: renamed from: t */
    public int f1484t;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public int f47193wvg;

    /* JADX INFO: renamed from: z */
    public int f1485z;

    public C0269n() {
        int i2 = toq.f47224qrj;
        this.f1485z = i2;
        this.f47191o1t = null;
        this.f47193wvg = i2;
        this.f1484t = 0;
        this.f47190mcp = Float.NaN;
        this.f47188jk = Float.NaN;
        this.f47183a9 = Float.NaN;
        this.f47186fti = Float.NaN;
        this.f47189jp0y = Float.NaN;
        this.f47187gvn7 = Float.NaN;
        this.f47184d3 = 0;
        this.f47192oc = Float.NaN;
        this.f47185eqxt = Float.NaN;
        this.f47227ld6 = 2;
    }

    private void ni7(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float f8 = this.f47183a9;
        float f9 = this.f47186fti;
        this.f47192oc = f2 + (f6 * f8) + ((-f7) * f9);
        this.f47185eqxt = f3 + (f7 * f8) + (f6 * f9);
    }

    /* JADX INFO: renamed from: z */
    private void m953z(int i2, int i3) {
        float f2 = this.f47183a9;
        float f3 = 0;
        this.f47192oc = ((i2 - 0) * f2) + f3;
        this.f47185eqxt = ((i3 - 0) * f2) + f3;
    }

    private void zurt(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        float f8 = Float.isNaN(this.f47183a9) ? 0.0f : this.f47183a9;
        float f9 = Float.isNaN(this.f47187gvn7) ? 0.0f : this.f47187gvn7;
        float f10 = Float.isNaN(this.f47186fti) ? 0.0f : this.f47186fti;
        this.f47192oc = (int) (f2 + (f8 * f6) + ((Float.isNaN(this.f47189jp0y) ? 0.0f : this.f47189jp0y) * f7));
        this.f47185eqxt = (int) (f3 + (f6 * f9) + (f7 * f10));
    }

    void a9(C0281n c0281n, C0281n c0281n2, float f2, float f3, String[] strArr, float[] fArr) {
        float fM1037k = c0281n.m1037k();
        float qVar = c0281n.toq();
        float fM1037k2 = c0281n2.m1037k() - fM1037k;
        float qVar2 = c0281n2.toq() - qVar;
        float fHypot = (float) Math.hypot(fM1037k2, qVar2);
        if (fHypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f4 = fM1037k2 / fHypot;
        float f5 = qVar2 / fHypot;
        float f6 = f3 - qVar;
        float f7 = f2 - fM1037k;
        float f8 = ((f4 * f6) - (f7 * f5)) / fHypot;
        float f9 = ((f4 * f7) + (f5 * f6)) / fHypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f9;
                fArr[1] = f8;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f9;
        fArr[1] = f8;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: f7l8 */
    public toq clone() {
        return new C0269n().mo952y(this);
    }

    void fti(C0265g c0265g, C0281n c0281n, C0281n c0281n2, float f2, float f3, String[] strArr, float[] fArr) {
        c0281n.m1037k();
        c0281n.toq();
        c0281n2.m1037k();
        c0281n2.toq();
        C0265g c0265gN7h = c0265g.n7h();
        int iJk = c0265gN7h.jk();
        int iLd6 = c0265gN7h.ld6();
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = f2 / iJk;
            strArr[1] = "percentY";
            fArr[1] = f3 / iLd6;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = f2 / iJk;
            fArr[1] = f3 / iLd6;
        } else {
            fArr[1] = f2 / iJk;
            fArr[0] = f3 / iLd6;
        }
    }

    void fu4(int i2, int i3, float f2, float f3, float f4, float f5) {
        int i4 = this.f47184d3;
        if (i4 == 1) {
            ni7(f2, f3, f4, f5);
        } else if (i4 != 2) {
            zurt(f2, f3, f4, f5);
        } else {
            m953z(i2, i3);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: g */
    public void mo950g(HashMap<String, kja0> map) {
    }

    void jk(C0281n c0281n, C0281n c0281n2, float f2, float f3, String[] strArr, float[] fArr) {
        float fM1037k = c0281n.m1037k();
        float qVar = c0281n.toq();
        float fM1037k2 = c0281n2.m1037k() - fM1037k;
        float qVar2 = c0281n2.toq() - qVar;
        String str = strArr[0];
        if (str == null) {
            strArr[0] = "percentX";
            fArr[0] = (f2 - fM1037k) / fM1037k2;
            strArr[1] = "percentY";
            fArr[1] = (f3 - qVar) / qVar2;
            return;
        }
        if ("percentX".equals(str)) {
            fArr[0] = (f2 - fM1037k) / fM1037k2;
            fArr[1] = (f3 - qVar) / qVar2;
        } else {
            fArr[1] = (f2 - fM1037k) / fM1037k2;
            fArr[0] = (f3 - qVar) / qVar2;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: k */
    public int mo933k(String str) {
        return zurt.f7l8.m1086k(str);
    }

    public void mcp(C0265g c0265g, C0281n c0281n, C0281n c0281n2, float f2, float f3, String[] strArr, float[] fArr) {
        int i2 = this.f47184d3;
        if (i2 == 1) {
            a9(c0281n, c0281n2, f2, f3, strArr, fArr);
        } else if (i2 != 2) {
            jk(c0281n, c0281n2, f2, f3, strArr, fArr);
        } else {
            fti(c0265g, c0281n, c0281n2, f2, f3, strArr, fArr);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    /* JADX INFO: renamed from: n */
    public boolean mo935n(int i2, String str) {
        if (i2 != 501) {
            return super.mo935n(i2, str);
        }
        this.f47191o1t = str.toString();
        return true;
    }

    float o1t() {
        return this.f47192oc;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: s */
    public void mo951s(HashSet<String> hashSet) {
    }

    /* JADX INFO: renamed from: t */
    public boolean m954t(int i2, int i3, C0281n c0281n, C0281n c0281n2, float f2, float f3) {
        fu4(i2, i3, c0281n.m1037k(), c0281n.toq(), c0281n2.m1037k(), c0281n2.toq());
        return Math.abs(f2 - this.f47192oc) < f47180lvui && Math.abs(f3 - this.f47185eqxt) < f47180lvui;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean toq(int i2, int i3) {
        if (i2 == 100) {
            this.f1500y = i3;
            return true;
        }
        if (i2 == 508) {
            this.f1485z = i3;
            return true;
        }
        if (i2 != 510) {
            return super.toq(i2, i3);
        }
        this.f47184d3 = i3;
        return true;
    }

    float wvg() {
        return this.f47185eqxt;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq
    /* JADX INFO: renamed from: y */
    public toq mo952y(toq toqVar) {
        super.mo952y(toqVar);
        C0269n c0269n = (C0269n) toqVar;
        this.f47191o1t = c0269n.f47191o1t;
        this.f47193wvg = c0269n.f47193wvg;
        this.f1484t = c0269n.f1484t;
        this.f47190mcp = c0269n.f47190mcp;
        this.f47188jk = Float.NaN;
        this.f47183a9 = c0269n.f47183a9;
        this.f47186fti = c0269n.f47186fti;
        this.f47189jp0y = c0269n.f47189jp0y;
        this.f47187gvn7 = c0269n.f47187gvn7;
        this.f47192oc = c0269n.f47192oc;
        this.f47185eqxt = c0269n.f47185eqxt;
        return this;
    }

    @Override // androidx.constraintlayout.core.motion.key.toq, androidx.constraintlayout.core.motion.utils.zurt
    public boolean zy(int i2, float f2) {
        switch (i2) {
            case 503:
                this.f47190mcp = f2;
                return true;
            case 504:
                this.f47188jk = f2;
                return true;
            case 505:
                this.f47190mcp = f2;
                this.f47188jk = f2;
                return true;
            case 506:
                this.f47183a9 = f2;
                return true;
            case 507:
                this.f47186fti = f2;
                return true;
            default:
                return super.zy(i2, f2);
        }
    }
}
