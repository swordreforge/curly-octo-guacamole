package androidx.constraintlayout.core;

import androidx.constraintlayout.core.C0307s;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0343q;
import com.miui.maml.folme.AnimatedProperty;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: androidx.constraintlayout.core.n */
/* JADX INFO: compiled from: LinearSystem.java */
/* JADX INFO: loaded from: classes.dex */
public class C0296n {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static long f47562a9 = 0;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final boolean f47563fn3e = false;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static boolean f47564fu4 = true;

    /* JADX INFO: renamed from: i */
    public static final boolean f1804i = false;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static long f47565jk = 0;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final boolean f47566ki = false;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static C0263g f47567mcp = null;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static boolean f47568ni7 = true;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static boolean f47569o1t = true;

    /* JADX INFO: renamed from: t */
    private static int f1805t = 1000;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final boolean f47570t8r = false;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static boolean f47571wvg = false;

    /* JADX INFO: renamed from: z */
    public static boolean f1806z = true;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static boolean f47572zurt = false;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private k f47573cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    androidx.constraintlayout.core.toq[] f47574f7l8;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    final zy f47577n7h;

    /* JADX INFO: renamed from: q */
    private k f1812q;

    /* JADX INFO: renamed from: k */
    public boolean f1809k = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f47579toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private HashMap<String, C0307s> f47581zy = null;

    /* JADX INFO: renamed from: n */
    private int f1810n = 32;

    /* JADX INFO: renamed from: g */
    private int f1807g = 32;

    /* JADX INFO: renamed from: y */
    public boolean f1814y = false;

    /* JADX INFO: renamed from: s */
    public boolean f1813s = false;

    /* JADX INFO: renamed from: p */
    private boolean[] f1811p = new boolean[32];

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    int f47576ld6 = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f47580x2 = 0;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f47578qrj = 32;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private C0307s[] f47575kja0 = new C0307s[f1805t];

    /* JADX INFO: renamed from: h */
    private int f1808h = 0;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.n$k */
    /* JADX INFO: compiled from: LinearSystem.java */
    interface k {
        void clear();

        /* JADX INFO: renamed from: g */
        void mo1126g(C0307s c0307s);

        C0307s getKey();

        boolean isEmpty();

        /* JADX INFO: renamed from: k */
        void mo1127k(C0296n c0296n, C0307s c0307s, boolean z2);

        /* JADX INFO: renamed from: n */
        C0307s mo1128n(C0296n c0296n, boolean[] zArr);

        /* JADX INFO: renamed from: q */
        void mo1129q(k kVar);

        void toq(C0296n c0296n);

        void zy(C0296n c0296n, androidx.constraintlayout.core.toq toqVar, boolean z2);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.n$toq */
    /* JADX INFO: compiled from: LinearSystem.java */
    class toq extends androidx.constraintlayout.core.toq {
        public toq(zy zyVar) {
            this.f1958n = new C0297p(this, zyVar);
        }
    }

    public C0296n() {
        this.f47574f7l8 = null;
        this.f47574f7l8 = new androidx.constraintlayout.core.toq[32];
        lrht();
        zy zyVar = new zy();
        this.f47577n7h = zyVar;
        this.f1812q = new C0346y(zyVar);
        if (f47571wvg) {
            this.f47573cdj = new toq(zyVar);
        } else {
            this.f47573cdj = new androidx.constraintlayout.core.toq(zyVar);
        }
    }

    private int a9(k kVar) throws Exception {
        boolean z2;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f47580x2) {
                z2 = false;
                break;
            }
            androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i2];
            if (toqVar.f1957k.f1873z != C0307s.toq.UNRESTRICTED && toqVar.f47690toq < 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (!z2) {
            return 0;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            C0263g c0263g = f47567mcp;
            if (c0263g != null) {
                c0263g.f47066kja0++;
            }
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < this.f47580x2; i7++) {
                androidx.constraintlayout.core.toq toqVar2 = this.f47574f7l8[i7];
                if (toqVar2.f1957k.f1873z != C0307s.toq.UNRESTRICTED && !toqVar2.f1956g && toqVar2.f47690toq < 0.0f) {
                    int i8 = 9;
                    if (f47569o1t) {
                        int iMo924q = toqVar2.f1958n.mo924q();
                        int i9 = 0;
                        while (i9 < iMo924q) {
                            C0307s c0307sF7l8 = toqVar2.f1958n.f7l8(i9);
                            float fMo919h = toqVar2.f1958n.mo919h(c0307sF7l8);
                            if (fMo919h > 0.0f) {
                                int i10 = 0;
                                while (i10 < i8) {
                                    float f3 = c0307sF7l8.f1861h[i10] / fMo919h;
                                    if ((f3 < f2 && i10 == i6) || i10 > i6) {
                                        i5 = c0307sF7l8.f1866n;
                                        i6 = i10;
                                        i4 = i7;
                                        f2 = f3;
                                    }
                                    i10++;
                                    i8 = 9;
                                }
                            }
                            i9++;
                            i8 = 9;
                        }
                    } else {
                        for (int i11 = 1; i11 < this.f47576ld6; i11++) {
                            C0307s c0307s = this.f47577n7h.f2095q[i11];
                            float fMo919h2 = toqVar2.f1958n.mo919h(c0307s);
                            if (fMo919h2 > 0.0f) {
                                for (int i12 = 0; i12 < 9; i12++) {
                                    float f4 = c0307s.f1861h[i12] / fMo919h2;
                                    if ((f4 < f2 && i12 == i6) || i12 > i6) {
                                        i5 = i11;
                                        i6 = i12;
                                        i4 = i7;
                                        f2 = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                androidx.constraintlayout.core.toq toqVar3 = this.f47574f7l8[i4];
                toqVar3.f1957k.f1860g = -1;
                C0263g c0263g2 = f47567mcp;
                if (c0263g2 != null) {
                    c0263g2.f47070n7h++;
                }
                toqVar3.mcp(this.f47577n7h.f2095q[i5]);
                C0307s c0307s2 = toqVar3.f1957k;
                c0307s2.f1860g = i4;
                c0307s2.cdj(this, toqVar3);
            } else {
                z3 = true;
            }
            if (i3 > this.f47576ld6 / 2) {
                z3 = true;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: c */
    private final int m1111c(k kVar, boolean z2) {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f47079x2++;
        }
        for (int i2 = 0; i2 < this.f47576ld6; i2++) {
            this.f1811p[i2] = false;
        }
        boolean z3 = false;
        int i3 = 0;
        while (!z3) {
            C0263g c0263g2 = f47567mcp;
            if (c0263g2 != null) {
                c0263g2.f47075qrj++;
            }
            i3++;
            if (i3 >= this.f47576ld6 * 2) {
                return i3;
            }
            if (kVar.getKey() != null) {
                this.f1811p[kVar.getKey().f1866n] = true;
            }
            C0307s c0307sMo1128n = kVar.mo1128n(this, this.f1811p);
            if (c0307sMo1128n != null) {
                boolean[] zArr = this.f1811p;
                int i4 = c0307sMo1128n.f1866n;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (c0307sMo1128n != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f47580x2; i6++) {
                    androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i6];
                    if (toqVar.f1957k.f1873z != C0307s.toq.UNRESTRICTED && !toqVar.f1956g && toqVar.m1251z(c0307sMo1128n)) {
                        float fMo919h = toqVar.f1958n.mo919h(c0307sMo1128n);
                        if (fMo919h < 0.0f) {
                            float f3 = (-toqVar.f47690toq) / fMo919h;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    androidx.constraintlayout.core.toq toqVar2 = this.f47574f7l8[i5];
                    toqVar2.f1957k.f1860g = -1;
                    C0263g c0263g3 = f47567mcp;
                    if (c0263g3 != null) {
                        c0263g3.f47070n7h++;
                    }
                    toqVar2.mcp(c0307sMo1128n);
                    C0307s c0307s = toqVar2.f1957k;
                    c0307s.f1860g = i5;
                    c0307s.cdj(this, toqVar2);
                }
            } else {
                z3 = true;
            }
        }
        return i3;
    }

    public static C0263g d2ok() {
        return f47567mcp;
    }

    private String d3(int i2) {
        return i2 == 1 ? "LOW" : i2 == 2 ? "MEDIUM" : i2 == 3 ? "HIGH" : i2 == 4 ? "HIGHEST" : i2 == 5 ? "EQUALITY" : i2 == 8 ? "FIXED" : i2 == 6 ? "BARRIER" : "NONE";
    }

    private void f7l8(androidx.constraintlayout.core.toq toqVar) {
        toqVar.f7l8(this, 0);
    }

    private String gvn7(int i2) {
        int i3 = i2 * 4;
        int i4 = i3 / 1024;
        int i5 = i4 / 1024;
        if (i5 > 0) {
            return "" + i5 + " Mb";
        }
        if (i4 > 0) {
            return "" + i4 + " Kb";
        }
        return "" + i3 + " bytes";
    }

    /* JADX INFO: renamed from: k */
    private C0307s m1112k(C0307s.toq toqVar, String str) {
        C0307s c0307sMo915k = this.f47577n7h.f47995zy.mo915k();
        if (c0307sMo915k == null) {
            c0307sMo915k = new C0307s(toqVar, str);
            c0307sMo915k.kja0(toqVar, str);
        } else {
            c0307sMo915k.ld6();
            c0307sMo915k.kja0(toqVar, str);
        }
        int i2 = this.f1808h;
        int i3 = f1805t;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1805t = i4;
            this.f47575kja0 = (C0307s[]) Arrays.copyOf(this.f47575kja0, i4);
        }
        C0307s[] c0307sArr = this.f47575kja0;
        int i5 = this.f1808h;
        this.f1808h = i5 + 1;
        c0307sArr[i5] = c0307sMo915k;
        return c0307sMo915k;
    }

    private void ki() {
        for (int i2 = 0; i2 < this.f47580x2; i2++) {
            androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i2];
            toqVar.f1957k.f1870s = toqVar.f47690toq;
        }
    }

    private void lrht() {
        int i2 = 0;
        if (f47571wvg) {
            while (i2 < this.f47580x2) {
                androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i2];
                if (toqVar != null) {
                    this.f47577n7h.f2094k.toq(toqVar);
                }
                this.f47574f7l8[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.f47580x2) {
            androidx.constraintlayout.core.toq toqVar2 = this.f47574f7l8[i2];
            if (toqVar2 != null) {
                this.f47577n7h.f47994toq.toq(toqVar2);
            }
            this.f47574f7l8[i2] = null;
            i2++;
        }
    }

    private void n5r1() {
        int i2 = this.f1810n * 2;
        this.f1810n = i2;
        this.f47574f7l8 = (androidx.constraintlayout.core.toq[]) Arrays.copyOf(this.f47574f7l8, i2);
        zy zyVar = this.f47577n7h;
        zyVar.f2095q = (C0307s[]) Arrays.copyOf(zyVar.f2095q, this.f1810n);
        int i3 = this.f1810n;
        this.f1811p = new boolean[i3];
        this.f1807g = i3;
        this.f47578qrj = i3;
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f1425y++;
            c0263g.f1417i = Math.max(c0263g.f1417i, i3);
            C0263g c0263g2 = f47567mcp;
            c0263g2.f47074oc = c0263g2.f1417i;
        }
    }

    private void n7h(androidx.constraintlayout.core.toq toqVar, int i2) {
        kja0(toqVar, i2, 0);
    }

    public static androidx.constraintlayout.core.toq ni7(C0296n c0296n, C0307s c0307s, C0307s c0307s2, float f2) {
        return c0296n.zurt().qrj(c0307s, c0307s2, f2);
    }

    private final void qrj(androidx.constraintlayout.core.toq toqVar) {
        int i2;
        if (f47564fu4 && toqVar.f1956g) {
            toqVar.f1957k.x2(this, toqVar.f47690toq);
        } else {
            androidx.constraintlayout.core.toq[] toqVarArr = this.f47574f7l8;
            int i3 = this.f47580x2;
            toqVarArr[i3] = toqVar;
            C0307s c0307s = toqVar.f1957k;
            c0307s.f1860g = i3;
            this.f47580x2 = i3 + 1;
            c0307s.cdj(this, toqVar);
        }
        if (f47564fu4 && this.f1809k) {
            int i4 = 0;
            while (i4 < this.f47580x2) {
                if (this.f47574f7l8[i4] == null) {
                    System.out.println("WTF");
                }
                androidx.constraintlayout.core.toq toqVar2 = this.f47574f7l8[i4];
                if (toqVar2 != null && toqVar2.f1956g) {
                    toqVar2.f1957k.x2(this, toqVar2.f47690toq);
                    if (f47571wvg) {
                        this.f47577n7h.f2094k.toq(toqVar2);
                    } else {
                        this.f47577n7h.f47994toq.toq(toqVar2);
                    }
                    this.f47574f7l8[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f47580x2;
                        if (i5 >= i2) {
                            break;
                        }
                        androidx.constraintlayout.core.toq[] toqVarArr2 = this.f47574f7l8;
                        int i7 = i5 - 1;
                        androidx.constraintlayout.core.toq toqVar3 = toqVarArr2[i5];
                        toqVarArr2[i7] = toqVar3;
                        C0307s c0307s2 = toqVar3.f1957k;
                        if (c0307s2.f1860g == i5) {
                            c0307s2.f1860g = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f47574f7l8[i6] = null;
                    }
                    this.f47580x2 = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f1809k = false;
        }
    }

    /* JADX INFO: renamed from: t */
    private void m1113t() {
        System.out.println("Display Rows (" + this.f47580x2 + AnimatedProperty.PROPERTY_NAME_X + this.f47576ld6 + ")\n");
    }

    private void wvg() {
        m1113t();
        String str = "";
        for (int i2 = 0; i2 < this.f47580x2; i2++) {
            str = (str + this.f47574f7l8[i2]) + "\n";
        }
        System.out.println(str + this.f1812q + "\n");
    }

    /* JADX INFO: renamed from: z */
    private C0307s m1114z(String str, C0307s.toq toqVar) {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f1416h++;
        }
        if (this.f47576ld6 + 1 >= this.f1807g) {
            n5r1();
        }
        C0307s c0307sM1112k = m1112k(toqVar, null);
        c0307sM1112k.qrj(str);
        int i2 = this.f47579toq + 1;
        this.f47579toq = i2;
        this.f47576ld6++;
        c0307sM1112k.f1866n = i2;
        if (this.f47581zy == null) {
            this.f47581zy = new HashMap<>();
        }
        this.f47581zy.put(str, c0307sM1112k);
        this.f47577n7h.f2095q[this.f47579toq] = c0307sM1112k;
        return c0307sM1112k;
    }

    final void cdj() {
        int i2;
        int i3 = 0;
        while (i3 < this.f47580x2) {
            androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i3];
            if (toqVar.f1958n.mo924q() == 0) {
                toqVar.f1956g = true;
            }
            if (toqVar.f1956g) {
                C0307s c0307s = toqVar.f1957k;
                c0307s.f1870s = toqVar.f47690toq;
                c0307s.m1153p(toqVar);
                int i4 = i3;
                while (true) {
                    i2 = this.f47580x2;
                    if (i4 >= i2 - 1) {
                        break;
                    }
                    androidx.constraintlayout.core.toq[] toqVarArr = this.f47574f7l8;
                    int i5 = i4 + 1;
                    toqVarArr[i4] = toqVarArr[i5];
                    i4 = i5;
                }
                this.f47574f7l8[i2 - 1] = null;
                this.f47580x2 = i2 - 1;
                i3--;
                if (f47571wvg) {
                    this.f47577n7h.f2094k.toq(toqVar);
                } else {
                    this.f47577n7h.f47994toq.toq(toqVar);
                }
            }
            i3++;
        }
    }

    public int dd(Object obj) {
        C0307s c0307sM1339p = ((C0343q) obj).m1339p();
        if (c0307sM1339p != null) {
            return (int) (c0307sM1339p.f1870s + 0.5f);
        }
        return 0;
    }

    public int eqxt() {
        int iA9 = 0;
        for (int i2 = 0; i2 < this.f47580x2; i2++) {
            androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i2];
            if (toqVar != null) {
                iA9 += toqVar.a9();
            }
        }
        return iA9;
    }

    /* JADX INFO: renamed from: f */
    void m1115f(k kVar) throws Exception {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f47073o1t++;
            c0263g.f47078wvg = Math.max(c0263g.f47078wvg, this.f47576ld6);
            C0263g c0263g2 = f47567mcp;
            c0263g2.f1424t = Math.max(c0263g2.f1424t, this.f47580x2);
        }
        a9(kVar);
        m1111c(kVar, false);
        ki();
    }

    public C0307s fn3e(Object obj) {
        C0307s c0307sM1339p = null;
        if (obj == null) {
            return null;
        }
        if (this.f47576ld6 + 1 >= this.f1807g) {
            n5r1();
        }
        if (obj instanceof C0343q) {
            C0343q c0343q = (C0343q) obj;
            c0307sM1339p = c0343q.m1339p();
            if (c0307sM1339p == null) {
                c0343q.o1t(this.f47577n7h);
                c0307sM1339p = c0343q.m1339p();
            }
            int i2 = c0307sM1339p.f1866n;
            if (i2 == -1 || i2 > this.f47579toq || this.f47577n7h.f2095q[i2] == null) {
                if (i2 != -1) {
                    c0307sM1339p.ld6();
                }
                int i3 = this.f47579toq + 1;
                this.f47579toq = i3;
                this.f47576ld6++;
                c0307sM1339p.f1866n = i3;
                c0307sM1339p.f1873z = C0307s.toq.UNRESTRICTED;
                this.f47577n7h.f2095q[i3] = c0307sM1339p;
            }
        }
        return c0307sM1339p;
    }

    public void fti(C0263g c0263g) {
        f47567mcp = c0263g;
    }

    public C0307s fu4() {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f47065ki++;
        }
        if (this.f47576ld6 + 1 >= this.f1807g) {
            n5r1();
        }
        C0307s c0307sM1112k = m1112k(C0307s.toq.SLACK, null);
        int i2 = this.f47579toq + 1;
        this.f47579toq = i2;
        this.f47576ld6++;
        c0307sM1112k.f1866n = i2;
        this.f47577n7h.f2095q[i2] = c0307sM1112k;
        return c0307sM1112k;
    }

    /* JADX INFO: renamed from: g */
    public void m1116g(C0307s c0307s, int i2) {
        if (f47568ni7 && c0307s.f1860g == -1) {
            float f2 = i2;
            c0307s.x2(this, f2);
            for (int i3 = 0; i3 < this.f47579toq + 1; i3++) {
                C0307s c0307s2 = this.f47577n7h.f2095q[i3];
                if (c0307s2 != null && c0307s2.f1859f && c0307s2.f1857c == c0307s.f1866n) {
                    c0307s2.x2(this, c0307s2.f1858e + f2);
                }
            }
            return;
        }
        int i4 = c0307s.f1860g;
        if (i4 == -1) {
            androidx.constraintlayout.core.toq toqVarZurt = zurt();
            toqVarZurt.x2(c0307s, i2);
            m1122q(toqVarZurt);
            return;
        }
        androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i4];
        if (toqVar.f1956g) {
            toqVar.f47690toq = i2;
            return;
        }
        if (toqVar.f1958n.mo924q() == 0) {
            toqVar.f1956g = true;
            toqVar.f47690toq = i2;
        } else {
            androidx.constraintlayout.core.toq toqVarZurt2 = zurt();
            toqVarZurt2.cdj(c0307s, i2);
            m1122q(toqVarZurt2);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1117h(C0307s c0307s, C0307s c0307s2, int i2) {
        if (c0307s.f1860g != -1 || i2 != 0) {
            m1120n(c0307s, c0307s2, i2, 8);
            return;
        }
        if (c0307s2.f1859f) {
            c0307s2 = this.f47577n7h.f2095q[c0307s2.f1857c];
        }
        if (c0307s.f1859f) {
            C0307s c0307s3 = this.f47577n7h.f2095q[c0307s.f1857c];
        } else {
            c0307s.n7h(this, c0307s2, 0.0f);
        }
    }

    public void hyr() throws Exception {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f1423s++;
        }
        if (this.f1812q.isEmpty()) {
            ki();
            return;
        }
        if (!this.f1814y && !this.f1813s) {
            m1115f(this.f1812q);
            return;
        }
        C0263g c0263g2 = f47567mcp;
        if (c0263g2 != null) {
            c0263g2.f47081zurt++;
        }
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f47580x2) {
                z2 = true;
                break;
            } else if (!this.f47574f7l8[i2].f1956g) {
                break;
            } else {
                i2++;
            }
        }
        if (!z2) {
            m1115f(this.f1812q);
            return;
        }
        C0263g c0263g3 = f47567mcp;
        if (c0263g3 != null) {
            c0263g3.f47059fn3e++;
        }
        ki();
    }

    /* JADX INFO: renamed from: i */
    public C0307s m1118i() {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f47076t8r++;
        }
        if (this.f47576ld6 + 1 >= this.f1807g) {
            n5r1();
        }
        C0307s c0307sM1112k = m1112k(C0307s.toq.SLACK, null);
        int i2 = this.f47579toq + 1;
        this.f47579toq = i2;
        this.f47576ld6++;
        c0307sM1112k.f1866n = i2;
        this.f47577n7h.f2095q[i2] = c0307sM1112k;
        return c0307sM1112k;
    }

    public void jk() {
        m1113t();
        String str = "";
        for (int i2 = 0; i2 < this.f47580x2; i2++) {
            if (this.f47574f7l8[i2].f1957k.f1873z == C0307s.toq.UNRESTRICTED) {
                str = (str + this.f47574f7l8[i2].fti()) + "\n";
            }
        }
        System.out.println(str + this.f1812q + "\n");
    }

    public zy jp0y() {
        return this.f47577n7h;
    }

    void kja0(androidx.constraintlayout.core.toq toqVar, int i2, int i3) {
        toqVar.m1250y(t8r(i3, null), i2);
    }

    /* JADX INFO: renamed from: l */
    C0307s m1119l(String str, C0307s.toq toqVar) {
        if (this.f47581zy == null) {
            this.f47581zy = new HashMap<>();
        }
        C0307s c0307s = this.f47581zy.get(str);
        return c0307s == null ? m1114z(str, toqVar) : c0307s;
    }

    public void ld6(C0307s c0307s, C0307s c0307s2, int i2, int i3) {
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        C0307s c0307sFu4 = fu4();
        c0307sFu4.f1872y = 0;
        toqVarZurt.fn3e(c0307s, c0307s2, c0307sFu4, i2);
        if (i3 != 8) {
            kja0(toqVarZurt, (int) (toqVarZurt.f1958n.mo919h(c0307sFu4) * (-1.0f)), i3);
        }
        m1122q(toqVarZurt);
    }

    public int lvui() {
        return this.f47580x2;
    }

    void mcp() {
        int iA9 = 0;
        for (int i2 = 0; i2 < this.f1810n; i2++) {
            androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i2];
            if (toqVar != null) {
                iA9 += toqVar.a9();
            }
        }
        int iA92 = 0;
        for (int i3 = 0; i3 < this.f47580x2; i3++) {
            androidx.constraintlayout.core.toq toqVar2 = this.f47574f7l8[i3];
            if (toqVar2 != null) {
                iA92 += toqVar2.a9();
            }
        }
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.f1810n);
        sb.append(" (");
        int i4 = this.f1810n;
        sb.append(gvn7(i4 * i4));
        sb.append(") -- row sizes: ");
        sb.append(gvn7(iA9));
        sb.append(", actual size: ");
        sb.append(gvn7(iA92));
        sb.append(" rows: ");
        sb.append(this.f47580x2);
        sb.append("/");
        sb.append(this.f47578qrj);
        sb.append(" cols: ");
        sb.append(this.f47576ld6);
        sb.append("/");
        sb.append(this.f1807g);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(gvn7(0));
        printStream.println(sb.toString());
    }

    /* JADX INFO: renamed from: n */
    public androidx.constraintlayout.core.toq m1120n(C0307s c0307s, C0307s c0307s2, int i2, int i3) {
        if (f47568ni7 && i3 == 8 && c0307s2.f1867p && c0307s.f1860g == -1) {
            c0307s.x2(this, c0307s2.f1870s + i2);
            return null;
        }
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        toqVarZurt.ki(c0307s, c0307s2, i2);
        if (i3 != 8) {
            toqVarZurt.f7l8(this, i3);
        }
        m1122q(toqVarZurt);
        return toqVarZurt;
    }

    float ncyb(String str) {
        C0307s c0307sM1119l = m1119l(str, C0307s.toq.UNRESTRICTED);
        if (c0307sM1119l == null) {
            return 0.0f;
        }
        return c0307sM1119l.f1870s;
    }

    public void o1t() {
        m1113t();
        String str = " num vars " + this.f47579toq + "\n";
        for (int i2 = 0; i2 < this.f47579toq + 1; i2++) {
            C0307s c0307s = this.f47577n7h.f2095q[i2];
            if (c0307s != null && c0307s.f1867p) {
                str = str + " $[" + i2 + "] => " + c0307s + " = " + c0307s.f1870s + "\n";
            }
        }
        String str2 = str + "\n";
        for (int i3 = 0; i3 < this.f47579toq + 1; i3++) {
            C0307s[] c0307sArr = this.f47577n7h.f2095q;
            C0307s c0307s2 = c0307sArr[i3];
            if (c0307s2 != null && c0307s2.f1859f) {
                str2 = str2 + " ~[" + i3 + "] => " + c0307s2 + " = " + c0307sArr[c0307s2.f1857c] + " + " + c0307s2.f1858e + "\n";
            }
        }
        String str3 = str2 + "\n\n #  ";
        for (int i4 = 0; i4 < this.f47580x2; i4++) {
            str3 = (str3 + this.f47574f7l8[i4].fti()) + "\n #  ";
        }
        if (this.f1812q != null) {
            str3 = str3 + "Goal: " + this.f1812q + "\n";
        }
        System.out.println(str3);
    }

    k oc() {
        return this.f1812q;
    }

    /* JADX INFO: renamed from: p */
    public void m1121p(C0307s c0307s, C0307s c0307s2, int i2, boolean z2) {
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        C0307s c0307sFu4 = fu4();
        c0307sFu4.f1872y = 0;
        toqVarZurt.fn3e(c0307s, c0307s2, c0307sFu4, i2);
        m1122q(toqVarZurt);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1122q(androidx.constraintlayout.core.toq r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            androidx.constraintlayout.core.g r0 = androidx.constraintlayout.core.C0296n.f47567mcp
            r1 = 1
            if (r0 == 0) goto L17
            long r3 = r0.f1420p
            long r3 = r3 + r1
            r0.f1420p = r3
            boolean r3 = r8.f1956g
            if (r3 == 0) goto L17
            long r3 = r0.f47067ld6
            long r3 = r3 + r1
            r0.f47067ld6 = r3
        L17:
            int r0 = r7.f47580x2
            r3 = 1
            int r0 = r0 + r3
            int r4 = r7.f47578qrj
            if (r0 >= r4) goto L26
            int r0 = r7.f47576ld6
            int r0 = r0 + r3
            int r4 = r7.f1807g
            if (r0 < r4) goto L29
        L26:
            r7.n5r1()
        L29:
            r0 = 0
            boolean r4 = r8.f1956g
            if (r4 != 0) goto La1
            r8.toq(r7)
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L38
            return
        L38:
            r8.ni7()
            boolean r4 = r8.m1249s(r7)
            if (r4 == 0) goto L98
            androidx.constraintlayout.core.s r4 = r7.m1118i()
            r8.f1957k = r4
            int r5 = r7.f47580x2
            r7.qrj(r8)
            int r6 = r7.f47580x2
            int r5 = r5 + r3
            if (r6 != r5) goto L98
            androidx.constraintlayout.core.n$k r0 = r7.f47573cdj
            r0.mo1129q(r8)
            androidx.constraintlayout.core.n$k r0 = r7.f47573cdj
            r7.m1111c(r0, r3)
            int r0 = r4.f1860g
            r5 = -1
            if (r0 != r5) goto L99
            androidx.constraintlayout.core.s r0 = r8.f1957k
            if (r0 != r4) goto L76
            androidx.constraintlayout.core.s r0 = r8.wvg(r4)
            if (r0 == 0) goto L76
            androidx.constraintlayout.core.g r4 = androidx.constraintlayout.core.C0296n.f47567mcp
            if (r4 == 0) goto L73
            long r5 = r4.f47070n7h
            long r5 = r5 + r1
            r4.f47070n7h = r5
        L73:
            r8.mcp(r0)
        L76:
            boolean r0 = r8.f1956g
            if (r0 != 0) goto L7f
            androidx.constraintlayout.core.s r0 = r8.f1957k
            r0.cdj(r7, r8)
        L7f:
            boolean r0 = androidx.constraintlayout.core.C0296n.f47571wvg
            if (r0 == 0) goto L8b
            androidx.constraintlayout.core.zy r0 = r7.f47577n7h
            androidx.constraintlayout.core.f7l8$k<androidx.constraintlayout.core.toq> r0 = r0.f2094k
            r0.toq(r8)
            goto L92
        L8b:
            androidx.constraintlayout.core.zy r0 = r7.f47577n7h
            androidx.constraintlayout.core.f7l8$k<androidx.constraintlayout.core.toq> r0 = r0.f47994toq
            r0.toq(r8)
        L92:
            int r0 = r7.f47580x2
            int r0 = r0 - r3
            r7.f47580x2 = r0
            goto L99
        L98:
            r3 = r0
        L99:
            boolean r0 = r8.fu4()
            if (r0 != 0) goto La0
            return
        La0:
            r0 = r3
        La1:
            if (r0 != 0) goto La6
            r7.qrj(r8)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0296n.m1122q(androidx.constraintlayout.core.toq):void");
    }

    /* JADX INFO: renamed from: r */
    public int m1123r() {
        return this.f47579toq;
    }

    /* JADX INFO: renamed from: s */
    public void m1124s(C0307s c0307s, C0307s c0307s2, int i2, int i3) {
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        C0307s c0307sFu4 = fu4();
        c0307sFu4.f1872y = 0;
        toqVarZurt.m1247i(c0307s, c0307s2, c0307sFu4, i2);
        if (i3 != 8) {
            kja0(toqVarZurt, (int) (toqVarZurt.f1958n.mo919h(c0307sFu4) * (-1.0f)), i3);
        }
        m1122q(toqVarZurt);
    }

    public C0307s t8r(int i2, String str) {
        C0263g c0263g = f47567mcp;
        if (c0263g != null) {
            c0263g.f47053cdj++;
        }
        if (this.f47576ld6 + 1 >= this.f1807g) {
            n5r1();
        }
        C0307s c0307sM1112k = m1112k(C0307s.toq.ERROR, str);
        int i3 = this.f47579toq + 1;
        this.f47579toq = i3;
        this.f47576ld6++;
        c0307sM1112k.f1866n = i3;
        c0307sM1112k.f1872y = i2;
        this.f47577n7h.f2095q[i3] = c0307sM1112k;
        this.f1812q.mo1126g(c0307sM1112k);
        return c0307sM1112k;
    }

    public void toq(C0341n c0341n, C0341n c0341n2, float f2, int i2) {
        C0343q.toq toqVar = C0343q.toq.LEFT;
        C0307s c0307sFn3e = fn3e(c0341n.ki(toqVar));
        C0343q.toq toqVar2 = C0343q.toq.TOP;
        C0307s c0307sFn3e2 = fn3e(c0341n.ki(toqVar2));
        C0343q.toq toqVar3 = C0343q.toq.RIGHT;
        C0307s c0307sFn3e3 = fn3e(c0341n.ki(toqVar3));
        C0343q.toq toqVar4 = C0343q.toq.BOTTOM;
        C0307s c0307sFn3e4 = fn3e(c0341n.ki(toqVar4));
        C0307s c0307sFn3e5 = fn3e(c0341n2.ki(toqVar));
        C0307s c0307sFn3e6 = fn3e(c0341n2.ki(toqVar2));
        C0307s c0307sFn3e7 = fn3e(c0341n2.ki(toqVar3));
        C0307s c0307sFn3e8 = fn3e(c0341n2.ki(toqVar4));
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        double d2 = f2;
        double d4 = i2;
        toqVarZurt.zurt(c0307sFn3e2, c0307sFn3e4, c0307sFn3e6, c0307sFn3e8, (float) (Math.sin(d2) * d4));
        m1122q(toqVarZurt);
        androidx.constraintlayout.core.toq toqVarZurt2 = zurt();
        toqVarZurt2.zurt(c0307sFn3e, c0307sFn3e3, c0307sFn3e5, c0307sFn3e7, (float) (Math.cos(d2) * d4));
        m1122q(toqVarZurt2);
    }

    public void uv6(androidx.constraintlayout.core.toq toqVar) {
        C0307s c0307s;
        int i2;
        if (!toqVar.f1956g || (c0307s = toqVar.f1957k) == null) {
            return;
        }
        int i3 = c0307s.f1860g;
        if (i3 != -1) {
            while (true) {
                i2 = this.f47580x2;
                if (i3 >= i2 - 1) {
                    break;
                }
                androidx.constraintlayout.core.toq[] toqVarArr = this.f47574f7l8;
                int i4 = i3 + 1;
                androidx.constraintlayout.core.toq toqVar2 = toqVarArr[i4];
                C0307s c0307s2 = toqVar2.f1957k;
                if (c0307s2.f1860g == i4) {
                    c0307s2.f1860g = i3;
                }
                toqVarArr[i3] = toqVar2;
                i3 = i4;
            }
            this.f47580x2 = i2 - 1;
        }
        C0307s c0307s3 = toqVar.f1957k;
        if (!c0307s3.f1867p) {
            c0307s3.x2(this, toqVar.f47690toq);
        }
        if (f47571wvg) {
            this.f47577n7h.f2094k.toq(toqVar);
        } else {
            this.f47577n7h.f47994toq.toq(toqVar);
        }
    }

    public void vyq() {
        zy zyVar;
        int i2 = 0;
        while (true) {
            zyVar = this.f47577n7h;
            C0307s[] c0307sArr = zyVar.f2095q;
            if (i2 >= c0307sArr.length) {
                break;
            }
            C0307s c0307s = c0307sArr[i2];
            if (c0307s != null) {
                c0307s.ld6();
            }
            i2++;
        }
        zyVar.f47995zy.zy(this.f47575kja0, this.f1808h);
        this.f1808h = 0;
        Arrays.fill(this.f47577n7h.f2095q, (Object) null);
        HashMap<String, C0307s> map = this.f47581zy;
        if (map != null) {
            map.clear();
        }
        this.f47579toq = 0;
        this.f1812q.clear();
        this.f47576ld6 = 1;
        for (int i3 = 0; i3 < this.f47580x2; i3++) {
            androidx.constraintlayout.core.toq toqVar = this.f47574f7l8[i3];
            if (toqVar != null) {
                toqVar.f47691zy = false;
            }
        }
        lrht();
        this.f47580x2 = 0;
        if (f47571wvg) {
            this.f47573cdj = new toq(this.f47577n7h);
        } else {
            this.f47573cdj = new androidx.constraintlayout.core.toq(this.f47577n7h);
        }
    }

    public void x2(C0307s c0307s, C0307s c0307s2, C0307s c0307s3, C0307s c0307s4, float f2, int i2) {
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        toqVarZurt.n7h(c0307s, c0307s2, c0307s3, c0307s4, f2);
        if (i2 != 8) {
            toqVarZurt.f7l8(this, i2);
        }
        m1122q(toqVarZurt);
    }

    androidx.constraintlayout.core.toq x9kr(int i2) {
        return this.f47574f7l8[i2];
    }

    /* JADX INFO: renamed from: y */
    public void m1125y(C0307s c0307s, C0307s c0307s2, int i2, boolean z2) {
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        C0307s c0307sFu4 = fu4();
        c0307sFu4.f1872y = 0;
        toqVarZurt.m1247i(c0307s, c0307s2, c0307sFu4, i2);
        m1122q(toqVarZurt);
    }

    public androidx.constraintlayout.core.toq zurt() {
        androidx.constraintlayout.core.toq toqVarMo915k;
        if (f47571wvg) {
            toqVarMo915k = this.f47577n7h.f2094k.mo915k();
            if (toqVarMo915k == null) {
                toqVarMo915k = new toq(this.f47577n7h);
                f47562a9++;
            } else {
                toqVarMo915k.jk();
            }
        } else {
            toqVarMo915k = this.f47577n7h.f47994toq.mo915k();
            if (toqVarMo915k == null) {
                toqVarMo915k = new androidx.constraintlayout.core.toq(this.f47577n7h);
                f47565jk++;
            } else {
                toqVarMo915k.jk();
            }
        }
        C0307s.m1150s();
        return toqVarMo915k;
    }

    public void zy(C0307s c0307s, C0307s c0307s2, int i2, float f2, C0307s c0307s3, C0307s c0307s4, int i3, int i4) {
        androidx.constraintlayout.core.toq toqVarZurt = zurt();
        toqVarZurt.ld6(c0307s, c0307s2, i2, f2, c0307s3, c0307s4, i3);
        if (i4 != 8) {
            toqVarZurt.f7l8(this, i4);
        }
        m1122q(toqVarZurt);
    }
}
