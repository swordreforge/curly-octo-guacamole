package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: androidx.constraintlayout.core.s */
/* JADX INFO: compiled from: SolverVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class C0307s implements Comparable<C0307s> {

    /* JADX INFO: renamed from: a */
    public static final int f1848a = 1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f47592ab = 8;
    private static int an = 1;

    /* JADX INFO: renamed from: b */
    public static final int f1849b = 0;
    private static int bb = 1;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    public static final int f47593bo = 4;
    private static int bp = 1;
    private static int bv = 1;

    /* JADX INFO: renamed from: d */
    public static final int f1850d = 6;
    private static int id = 1;
    static final int in = 9;

    /* JADX INFO: renamed from: m */
    private static final boolean f1851m = false;

    /* JADX INFO: renamed from: o */
    private static final boolean f1852o = false;

    /* JADX INFO: renamed from: u */
    public static final int f1853u = 3;

    /* JADX INFO: renamed from: v */
    public static final int f1854v = 5;

    /* JADX INFO: renamed from: w */
    public static final int f1855w = 7;

    /* JADX INFO: renamed from: x */
    public static final int f1856x = 2;

    /* JADX INFO: renamed from: c */
    int f1857c;

    /* JADX INFO: renamed from: e */
    float f1858e;

    /* JADX INFO: renamed from: f */
    boolean f1859f;

    /* JADX INFO: renamed from: g */
    int f1860g;

    /* JADX INFO: renamed from: h */
    float[] f1861h;

    /* JADX INFO: renamed from: i */
    float[] f1862i;

    /* JADX INFO: renamed from: j */
    HashSet<androidx.constraintlayout.core.toq> f1863j;

    /* JADX INFO: renamed from: k */
    public boolean f1864k;

    /* JADX INFO: renamed from: l */
    public int f1865l;

    /* JADX INFO: renamed from: n */
    public int f1866n;

    /* JADX INFO: renamed from: p */
    public boolean f1867p;

    /* JADX INFO: renamed from: q */
    private String f1868q;

    /* JADX INFO: renamed from: r */
    int f1869r;

    /* JADX INFO: renamed from: s */
    public float f1870s;

    /* JADX INFO: renamed from: t */
    androidx.constraintlayout.core.toq[] f1871t;

    /* JADX INFO: renamed from: y */
    public int f1872y;

    /* JADX INFO: renamed from: z */
    toq f1873z;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.s$k */
    /* JADX INFO: compiled from: SolverVariable.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1874k;

        static {
            int[] iArr = new int[toq.values().length];
            f1874k = iArr;
            try {
                iArr[toq.UNRESTRICTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1874k[toq.CONSTANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1874k[toq.SLACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1874k[toq.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1874k[toq.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.s$toq */
    /* JADX INFO: compiled from: SolverVariable.java */
    public enum toq {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0307s(String str, toq toqVar) {
        this.f1866n = -1;
        this.f1860g = -1;
        this.f1872y = 0;
        this.f1867p = false;
        this.f1861h = new float[9];
        this.f1862i = new float[9];
        this.f1871t = new androidx.constraintlayout.core.toq[16];
        this.f1869r = 0;
        this.f1865l = 0;
        this.f1859f = false;
        this.f1857c = -1;
        this.f1858e = 0.0f;
        this.f1863j = null;
        this.f1868q = str;
        this.f1873z = toqVar;
    }

    private static String f7l8(toq toqVar, String str) {
        if (str != null) {
            return str + bp;
        }
        int i2 = k.f1874k[toqVar.ordinal()];
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("U");
            int i3 = bv + 1;
            bv = i3;
            sb.append(i3);
            return sb.toString();
        }
        if (i2 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.market.sdk.reflect.toq.f28134q);
            int i4 = an + 1;
            an = i4;
            sb2.append(i4);
            return sb2.toString();
        }
        if (i2 == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("S");
            int i5 = bb + 1;
            bb = i5;
            sb3.append(i5);
            return sb3.toString();
        }
        if (i2 == 4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("e");
            int i6 = bp + 1;
            bp = i6;
            sb4.append(i6);
            return sb4.toString();
        }
        if (i2 != 5) {
            throw new AssertionError(toqVar.name());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("V");
        int i7 = id + 1;
        id = i7;
        sb5.append(i7);
        return sb5.toString();
    }

    /* JADX INFO: renamed from: s */
    static void m1150s() {
        bp++;
    }

    public final void cdj(C0296n c0296n, androidx.constraintlayout.core.toq toqVar) {
        int i2 = this.f1869r;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1871t[i3].zy(c0296n, toqVar, false);
        }
        this.f1869r = 0;
    }

    /* JADX INFO: renamed from: h */
    String m1151h() {
        String str = this + "[";
        boolean z2 = true;
        boolean z3 = false;
        for (int i2 = 0; i2 < this.f1861h.length; i2++) {
            String str2 = str + this.f1861h[i2];
            float[] fArr = this.f1861h;
            float f2 = fArr[i2];
            if (f2 > 0.0f) {
                z3 = false;
            } else if (f2 < 0.0f) {
                z3 = true;
            }
            if (f2 != 0.0f) {
                z2 = false;
            }
            str = i2 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z3) {
            str = str + " (-)";
        }
        if (!z2) {
            return str;
        }
        return str + " (*)";
    }

    public void kja0(toq toqVar, String str) {
        this.f1873z = toqVar;
    }

    public void ld6() {
        this.f1868q = null;
        this.f1873z = toq.UNKNOWN;
        this.f1872y = 0;
        this.f1866n = -1;
        this.f1860g = -1;
        this.f1870s = 0.0f;
        this.f1867p = false;
        this.f1859f = false;
        this.f1857c = -1;
        this.f1858e = 0.0f;
        int i2 = this.f1869r;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1871t[i3] = null;
        }
        this.f1869r = 0;
        this.f1865l = 0;
        this.f1864k = false;
        Arrays.fill(this.f1862i, 0.0f);
    }

    /* JADX INFO: renamed from: n */
    public String m1152n() {
        return this.f1868q;
    }

    public void n7h(C0296n c0296n, C0307s c0307s, float f2) {
        this.f1859f = true;
        this.f1857c = c0307s.f1866n;
        this.f1858e = f2;
        int i2 = this.f1869r;
        this.f1860g = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1871t[i3].jp0y(c0296n, this, false);
        }
        this.f1869r = 0;
        c0296n.o1t();
    }

    /* JADX INFO: renamed from: p */
    public final void m1153p(androidx.constraintlayout.core.toq toqVar) {
        int i2 = this.f1869r;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f1871t[i3] == toqVar) {
                while (i3 < i2 - 1) {
                    androidx.constraintlayout.core.toq[] toqVarArr = this.f1871t;
                    int i4 = i3 + 1;
                    toqVarArr[i3] = toqVarArr[i4];
                    i3 = i4;
                }
                this.f1869r--;
                return;
            }
            i3++;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0307s c0307s) {
        return this.f1866n - c0307s.f1866n;
    }

    public void qrj(String str) {
        this.f1868q = str;
    }

    public String toString() {
        if (this.f1868q != null) {
            return "" + this.f1868q;
        }
        return "" + this.f1866n;
    }

    public final void toq(androidx.constraintlayout.core.toq toqVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1869r;
            if (i2 >= i3) {
                androidx.constraintlayout.core.toq[] toqVarArr = this.f1871t;
                if (i3 >= toqVarArr.length) {
                    this.f1871t = (androidx.constraintlayout.core.toq[]) Arrays.copyOf(toqVarArr, toqVarArr.length * 2);
                }
                androidx.constraintlayout.core.toq[] toqVarArr2 = this.f1871t;
                int i4 = this.f1869r;
                toqVarArr2[i4] = toqVar;
                this.f1869r = i4 + 1;
                return;
            }
            if (this.f1871t[i2] == toqVar) {
                return;
            } else {
                i2++;
            }
        }
    }

    public void x2(C0296n c0296n, float f2) {
        this.f1870s = f2;
        this.f1867p = true;
        this.f1859f = false;
        this.f1857c = -1;
        this.f1858e = 0.0f;
        int i2 = this.f1869r;
        this.f1860g = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f1871t[i3].mo1127k(c0296n, this, false);
        }
        this.f1869r = 0;
    }

    void zy() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f1861h[i2] = 0.0f;
        }
    }

    public C0307s(toq toqVar, String str) {
        this.f1866n = -1;
        this.f1860g = -1;
        this.f1872y = 0;
        this.f1867p = false;
        this.f1861h = new float[9];
        this.f1862i = new float[9];
        this.f1871t = new androidx.constraintlayout.core.toq[16];
        this.f1869r = 0;
        this.f1865l = 0;
        this.f1859f = false;
        this.f1857c = -1;
        this.f1858e = 0.0f;
        this.f1863j = null;
        this.f1873z = toqVar;
    }
}
