package androidx.constraintlayout.core;

import androidx.constraintlayout.core.toq;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.constraintlayout.core.p */
/* JADX INFO: compiled from: SolverVariableValues.java */
/* JADX INFO: loaded from: classes.dex */
public class C0297p implements toq.InterfaceC0325k {

    /* JADX INFO: renamed from: h */
    private static float f1816h = 0.001f;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final boolean f47582kja0 = true;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final boolean f47583n7h = false;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    protected final zy f47586qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private final toq f47588x2;

    /* JADX INFO: renamed from: k */
    private final int f1818k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47587toq = 16;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f47589zy = 16;

    /* JADX INFO: renamed from: q */
    int[] f1821q = new int[16];

    /* JADX INFO: renamed from: n */
    int[] f1819n = new int[16];

    /* JADX INFO: renamed from: g */
    int[] f1817g = new int[16];

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    float[] f47584f7l8 = new float[16];

    /* JADX INFO: renamed from: y */
    int[] f1823y = new int[16];

    /* JADX INFO: renamed from: s */
    int[] f1822s = new int[16];

    /* JADX INFO: renamed from: p */
    int f1820p = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    int f47585ld6 = -1;

    C0297p(toq toqVar, zy zyVar) {
        this.f47588x2 = toqVar;
        this.f47586qrj = zyVar;
        clear();
    }

    private void fn3e(C0307s c0307s) {
        int[] iArr;
        int i2;
        int i3 = c0307s.f1866n;
        int i4 = i3 % this.f47589zy;
        int[] iArr2 = this.f1821q;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            return;
        }
        if (this.f1817g[i5] == i3) {
            int[] iArr3 = this.f1819n;
            iArr2[i4] = iArr3[i5];
            iArr3[i5] = -1;
            return;
        }
        while (true) {
            iArr = this.f1819n;
            i2 = iArr[i5];
            if (i2 == -1 || this.f1817g[i2] == i3) {
                break;
            } else {
                i5 = i2;
            }
        }
        if (i2 == -1 || this.f1817g[i2] != i3) {
            return;
        }
        iArr[i5] = iArr[i2];
        iArr[i2] = -1;
    }

    /* JADX INFO: renamed from: i */
    private void m1130i(int i2, C0307s c0307s, float f2) {
        int iKi = ki();
        toq(iKi, c0307s, f2);
        if (i2 != -1) {
            this.f1823y[iKi] = i2;
            int[] iArr = this.f1822s;
            iArr[iKi] = iArr[i2];
            iArr[i2] = iKi;
        } else {
            this.f1823y[iKi] = -1;
            if (this.f1820p > 0) {
                this.f1822s[iKi] = this.f47585ld6;
                this.f47585ld6 = iKi;
            } else {
                this.f1822s[iKi] = -1;
            }
        }
        int i3 = this.f1822s[iKi];
        if (i3 != -1) {
            this.f1823y[i3] = iKi;
        }
        m1131k(c0307s, iKi);
    }

    /* JADX INFO: renamed from: k */
    private void m1131k(C0307s c0307s, int i2) {
        int[] iArr;
        int i3 = c0307s.f1866n % this.f47589zy;
        int[] iArr2 = this.f1821q;
        int i4 = iArr2[i3];
        if (i4 == -1) {
            iArr2[i3] = i2;
        } else {
            while (true) {
                iArr = this.f1819n;
                int i5 = iArr[i4];
                if (i5 == -1) {
                    break;
                } else {
                    i4 = i5;
                }
            }
            iArr[i4] = i2;
        }
        this.f1819n[i2] = -1;
    }

    private int ki() {
        for (int i2 = 0; i2 < this.f47587toq; i2++) {
            if (this.f1817g[i2] == -1) {
                return i2;
            }
        }
        return -1;
    }

    private void t8r() {
        int i2 = this.f47587toq * 2;
        this.f1817g = Arrays.copyOf(this.f1817g, i2);
        this.f47584f7l8 = Arrays.copyOf(this.f47584f7l8, i2);
        this.f1823y = Arrays.copyOf(this.f1823y, i2);
        this.f1822s = Arrays.copyOf(this.f1822s, i2);
        this.f1819n = Arrays.copyOf(this.f1819n, i2);
        for (int i3 = this.f47587toq; i3 < i2; i3++) {
            this.f1817g[i3] = -1;
            this.f1819n[i3] = -1;
        }
        this.f47587toq = i2;
    }

    private void toq(int i2, C0307s c0307s, float f2) {
        this.f1817g[i2] = c0307s.f1866n;
        this.f47584f7l8[i2] = f2;
        this.f1823y[i2] = -1;
        this.f1822s[i2] = -1;
        c0307s.toq(this.f47588x2);
        c0307s.f1865l++;
        this.f1820p++;
    }

    private void zy() {
        for (int i2 = 0; i2 < this.f47589zy; i2++) {
            if (this.f1821q[i2] != -1) {
                String str = hashCode() + " hash [" + i2 + "] => ";
                int i3 = this.f1821q[i2];
                boolean z2 = false;
                while (!z2) {
                    str = str + " " + this.f1817g[i3];
                    int i4 = this.f1819n[i3];
                    if (i4 != -1) {
                        i3 = i4;
                    } else {
                        z2 = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public void cdj(float f2) {
        int i2 = this.f1820p;
        int i3 = this.f47585ld6;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f47584f7l8;
            fArr[i3] = fArr[i3] / f2;
            i3 = this.f1822s[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public void clear() {
        int i2 = this.f1820p;
        for (int i3 = 0; i3 < i2; i3++) {
            C0307s c0307sF7l8 = f7l8(i3);
            if (c0307sF7l8 != null) {
                c0307sF7l8.m1153p(this.f47588x2);
            }
        }
        for (int i4 = 0; i4 < this.f47587toq; i4++) {
            this.f1817g[i4] = -1;
            this.f1819n[i4] = -1;
        }
        for (int i5 = 0; i5 < this.f47589zy; i5++) {
            this.f1821q[i5] = -1;
        }
        this.f1820p = 0;
        this.f47585ld6 = -1;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public C0307s f7l8(int i2) {
        int i3 = this.f1820p;
        if (i3 == 0) {
            return null;
        }
        int i4 = this.f47585ld6;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2 && i4 != -1) {
                return this.f47586qrj.f2095q[this.f1817g[i4]];
            }
            i4 = this.f1822s[i4];
            if (i4 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: g */
    public boolean mo918g(C0307s c0307s) {
        return mo922n(c0307s) != -1;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: h */
    public float mo919h(C0307s c0307s) {
        int iMo922n = mo922n(c0307s);
        if (iMo922n != -1) {
            return this.f47584f7l8[iMo922n];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public float kja0(int i2) {
        int i3 = this.f1820p;
        int i4 = this.f47585ld6;
        for (int i5 = 0; i5 < i3; i5++) {
            if (i5 == i2) {
                return this.f47584f7l8[i4];
            }
            i4 = this.f1822s[i4];
            if (i4 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public int ld6() {
        return 0;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: n */
    public int mo922n(C0307s c0307s) {
        if (this.f1820p != 0 && c0307s != null) {
            int i2 = c0307s.f1866n;
            int i3 = this.f1821q[i2 % this.f47589zy];
            if (i3 == -1) {
                return -1;
            }
            if (this.f1817g[i3] == i2) {
                return i3;
            }
            do {
                i3 = this.f1819n[i3];
                if (i3 == -1) {
                    break;
                }
            } while (this.f1817g[i3] != i2);
            if (i3 != -1 && this.f1817g[i3] == i2) {
                return i3;
            }
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public void n7h(C0307s c0307s, float f2) {
        float f3 = f1816h;
        if (f2 > (-f3) && f2 < f3) {
            mo923p(c0307s, true);
            return;
        }
        if (this.f1820p == 0) {
            toq(0, c0307s, f2);
            m1131k(c0307s, 0);
            this.f47585ld6 = 0;
            return;
        }
        int iMo922n = mo922n(c0307s);
        if (iMo922n != -1) {
            this.f47584f7l8[iMo922n] = f2;
            return;
        }
        if (this.f1820p + 1 >= this.f47587toq) {
            t8r();
        }
        int i2 = this.f1820p;
        int i3 = this.f47585ld6;
        int i4 = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = this.f1817g[i3];
            int i7 = c0307s.f1866n;
            if (i6 == i7) {
                this.f47584f7l8[i3] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i3;
            }
            i3 = this.f1822s[i3];
            if (i3 == -1) {
                break;
            }
        }
        m1130i(i4, c0307s, f2);
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: p */
    public float mo923p(C0307s c0307s, boolean z2) {
        int iMo922n = mo922n(c0307s);
        if (iMo922n == -1) {
            return 0.0f;
        }
        fn3e(c0307s);
        float f2 = this.f47584f7l8[iMo922n];
        if (this.f47585ld6 == iMo922n) {
            this.f47585ld6 = this.f1822s[iMo922n];
        }
        this.f1817g[iMo922n] = -1;
        int[] iArr = this.f1823y;
        int i2 = iArr[iMo922n];
        if (i2 != -1) {
            int[] iArr2 = this.f1822s;
            iArr2[i2] = iArr2[iMo922n];
        }
        int i3 = this.f1822s[iMo922n];
        if (i3 != -1) {
            iArr[i3] = iArr[iMo922n];
        }
        this.f1820p--;
        c0307s.f1865l--;
        if (z2) {
            c0307s.m1153p(this.f47588x2);
        }
        return f2;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: q */
    public int mo924q() {
        return this.f1820p;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public float qrj(toq toqVar, boolean z2) {
        float fMo919h = mo919h(toqVar.f1957k);
        mo923p(toqVar.f1957k, z2);
        C0297p c0297p = (C0297p) toqVar.f1958n;
        int iMo924q = c0297p.mo924q();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iMo924q) {
            int i4 = c0297p.f1817g[i3];
            if (i4 != -1) {
                mo926y(this.f47586qrj.f2095q[i4], c0297p.f47584f7l8[i3] * fMo919h, z2);
                i2++;
            }
            i3++;
        }
        return fMo919h;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: s */
    public void mo925s() {
        int i2 = this.f1820p;
        int i3 = this.f47585ld6;
        for (int i4 = 0; i4 < i2; i4++) {
            float[] fArr = this.f47584f7l8;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f1822s[i3];
            if (i3 == -1) {
                return;
            }
        }
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i2 = this.f1820p;
        for (int i3 = 0; i3 < i2; i3++) {
            C0307s c0307sF7l8 = f7l8(i3);
            if (c0307sF7l8 != null) {
                String str2 = str + c0307sF7l8 + " = " + kja0(i3) + " ";
                int iMo922n = mo922n(c0307sF7l8);
                String str3 = str2 + "[p: ";
                String str4 = (this.f1823y[iMo922n] != -1 ? str3 + this.f47586qrj.f2095q[this.f1817g[this.f1823y[iMo922n]]] : str3 + "none") + ", n: ";
                str = (this.f1822s[iMo922n] != -1 ? str4 + this.f47586qrj.f2095q[this.f1817g[this.f1822s[iMo922n]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public void x2() {
        int i2 = this.f1820p;
        System.out.print("{ ");
        for (int i3 = 0; i3 < i2; i3++) {
            C0307s c0307sF7l8 = f7l8(i3);
            if (c0307sF7l8 != null) {
                System.out.print(c0307sF7l8 + " = " + kja0(i3) + " ");
            }
        }
        System.out.println(" }");
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: y */
    public void mo926y(C0307s c0307s, float f2, boolean z2) {
        float f3 = f1816h;
        if (f2 <= (-f3) || f2 >= f3) {
            int iMo922n = mo922n(c0307s);
            if (iMo922n == -1) {
                n7h(c0307s, f2);
                return;
            }
            float[] fArr = this.f47584f7l8;
            float f4 = fArr[iMo922n] + f2;
            fArr[iMo922n] = f4;
            float f5 = f1816h;
            if (f4 <= (-f5) || f4 >= f5) {
                return;
            }
            fArr[iMo922n] = 0.0f;
            mo923p(c0307s, z2);
        }
    }
}
