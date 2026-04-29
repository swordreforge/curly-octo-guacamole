package androidx.constraintlayout.core;

import androidx.constraintlayout.core.toq;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.constraintlayout.core.k */
/* JADX INFO: compiled from: ArrayLinkedVariables.java */
/* JADX INFO: loaded from: classes.dex */
public class C0264k implements toq.InterfaceC0325k {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static float f47083kja0 = 0.001f;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final boolean f47084n7h = false;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f47085qrj = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final boolean f47086x2 = false;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final toq f47089toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    protected final zy f47090zy;

    /* JADX INFO: renamed from: k */
    int f1428k = 0;

    /* JADX INFO: renamed from: q */
    private int f1431q = 8;

    /* JADX INFO: renamed from: n */
    private C0307s f1429n = null;

    /* JADX INFO: renamed from: g */
    private int[] f1427g = new int[8];

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int[] f47087f7l8 = new int[8];

    /* JADX INFO: renamed from: y */
    private float[] f1433y = new float[8];

    /* JADX INFO: renamed from: s */
    private int f1432s = -1;

    /* JADX INFO: renamed from: p */
    private int f1430p = -1;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f47088ld6 = false;

    C0264k(toq toqVar, zy zyVar) {
        this.f47089toq = toqVar;
        this.f47090zy = zyVar;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public void cdj(float f2) {
        int i2 = this.f1432s;
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            float[] fArr = this.f1433y;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f47087f7l8[i2];
        }
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public final void clear() {
        int i2 = this.f1432s;
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            C0307s c0307s = this.f47090zy.f2095q[this.f1427g[i2]];
            if (c0307s != null) {
                c0307s.m1153p(this.f47089toq);
            }
            i2 = this.f47087f7l8[i2];
        }
        this.f1432s = -1;
        this.f1430p = -1;
        this.f47088ld6 = false;
        this.f1428k = 0;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public C0307s f7l8(int i2) {
        int i3 = this.f1432s;
        for (int i4 = 0; i3 != -1 && i4 < this.f1428k; i4++) {
            if (i4 == i2) {
                return this.f47090zy.f2095q[this.f1427g[i3]];
            }
            i3 = this.f47087f7l8[i3];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: g */
    public boolean mo918g(C0307s c0307s) {
        int i2 = this.f1432s;
        if (i2 == -1) {
            return false;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            if (this.f1427g[i2] == c0307s.f1866n) {
                return true;
            }
            i2 = this.f47087f7l8[i2];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: h */
    public final float mo919h(C0307s c0307s) {
        int i2 = this.f1432s;
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            if (this.f1427g[i2] == c0307s.f1866n) {
                return this.f1433y[i2];
            }
            i2 = this.f47087f7l8[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    boolean m920i() {
        int i2 = this.f1432s;
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            if (this.f1433y[i2] > 0.0f) {
                return true;
            }
            i2 = this.f47087f7l8[i2];
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public int m921k() {
        return this.f1432s;
    }

    C0307s ki() {
        C0307s c0307s = this.f1429n;
        if (c0307s != null) {
            return c0307s;
        }
        int i2 = this.f1432s;
        C0307s c0307s2 = null;
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            if (this.f1433y[i2] < 0.0f) {
                C0307s c0307s3 = this.f47090zy.f2095q[this.f1427g[i2]];
                if (c0307s2 == null || c0307s2.f1872y < c0307s3.f1872y) {
                    c0307s2 = c0307s3;
                }
            }
            i2 = this.f47087f7l8[i2];
        }
        return c0307s2;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public float kja0(int i2) {
        int i3 = this.f1432s;
        for (int i4 = 0; i3 != -1 && i4 < this.f1428k; i4++) {
            if (i4 == i2) {
                return this.f1433y[i3];
            }
            i3 = this.f47087f7l8[i3];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public int ld6() {
        return (this.f1427g.length * 4 * 3) + 0 + 36;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: n */
    public int mo922n(C0307s c0307s) {
        int i2 = this.f1432s;
        if (i2 == -1) {
            return -1;
        }
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            if (this.f1427g[i2] == c0307s.f1866n) {
                return i2;
            }
            i2 = this.f47087f7l8[i2];
        }
        return -1;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public final void n7h(C0307s c0307s, float f2) {
        if (f2 == 0.0f) {
            mo923p(c0307s, true);
            return;
        }
        int i2 = this.f1432s;
        if (i2 == -1) {
            this.f1432s = 0;
            this.f1433y[0] = f2;
            this.f1427g[0] = c0307s.f1866n;
            this.f47087f7l8[0] = -1;
            c0307s.f1865l++;
            c0307s.toq(this.f47089toq);
            this.f1428k++;
            if (this.f47088ld6) {
                return;
            }
            int i3 = this.f1430p + 1;
            this.f1430p = i3;
            int[] iArr = this.f1427g;
            if (i3 >= iArr.length) {
                this.f47088ld6 = true;
                this.f1430p = iArr.length - 1;
                return;
            }
            return;
        }
        int i4 = -1;
        for (int i5 = 0; i2 != -1 && i5 < this.f1428k; i5++) {
            int i6 = this.f1427g[i2];
            int i7 = c0307s.f1866n;
            if (i6 == i7) {
                this.f1433y[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i4 = i2;
            }
            i2 = this.f47087f7l8[i2];
        }
        int length = this.f1430p;
        int i8 = length + 1;
        if (this.f47088ld6) {
            int[] iArr2 = this.f1427g;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i8;
        }
        int[] iArr3 = this.f1427g;
        if (length >= iArr3.length && this.f1428k < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f1427g;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    length = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f1427g;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i10 = this.f1431q * 2;
            this.f1431q = i10;
            this.f47088ld6 = false;
            this.f1430p = length - 1;
            this.f1433y = Arrays.copyOf(this.f1433y, i10);
            this.f1427g = Arrays.copyOf(this.f1427g, this.f1431q);
            this.f47087f7l8 = Arrays.copyOf(this.f47087f7l8, this.f1431q);
        }
        this.f1427g[length] = c0307s.f1866n;
        this.f1433y[length] = f2;
        if (i4 != -1) {
            int[] iArr6 = this.f47087f7l8;
            iArr6[length] = iArr6[i4];
            iArr6[i4] = length;
        } else {
            this.f47087f7l8[length] = this.f1432s;
            this.f1432s = length;
        }
        c0307s.f1865l++;
        c0307s.toq(this.f47089toq);
        int i11 = this.f1428k + 1;
        this.f1428k = i11;
        if (!this.f47088ld6) {
            this.f1430p++;
        }
        int[] iArr7 = this.f1427g;
        if (i11 >= iArr7.length) {
            this.f47088ld6 = true;
        }
        if (this.f1430p >= iArr7.length) {
            this.f47088ld6 = true;
            this.f1430p = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: p */
    public final float mo923p(C0307s c0307s, boolean z2) {
        if (this.f1429n == c0307s) {
            this.f1429n = null;
        }
        int i2 = this.f1432s;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f1428k) {
            if (this.f1427g[i2] == c0307s.f1866n) {
                if (i2 == this.f1432s) {
                    this.f1432s = this.f47087f7l8[i2];
                } else {
                    int[] iArr = this.f47087f7l8;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    c0307s.m1153p(this.f47089toq);
                }
                c0307s.f1865l--;
                this.f1428k--;
                this.f1427g[i2] = -1;
                if (this.f47088ld6) {
                    this.f1430p = i2;
                }
                return this.f1433y[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f47087f7l8[i2];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: q */
    public int mo924q() {
        return this.f1428k;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public float qrj(toq toqVar, boolean z2) {
        float fMo919h = mo919h(toqVar.f1957k);
        mo923p(toqVar.f1957k, z2);
        toq.InterfaceC0325k interfaceC0325k = toqVar.f1958n;
        int iMo924q = interfaceC0325k.mo924q();
        for (int i2 = 0; i2 < iMo924q; i2++) {
            C0307s c0307sF7l8 = interfaceC0325k.f7l8(i2);
            mo926y(c0307sF7l8, interfaceC0325k.mo919h(c0307sF7l8) * fMo919h, z2);
        }
        return fMo919h;
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    /* JADX INFO: renamed from: s */
    public void mo925s() {
        int i2 = this.f1432s;
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            float[] fArr = this.f1433y;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f47087f7l8[i2];
        }
    }

    public final float t8r(int i2) {
        return this.f1433y[i2];
    }

    public String toString() {
        int i2 = this.f1432s;
        String str = "";
        for (int i3 = 0; i2 != -1 && i3 < this.f1428k; i3++) {
            str = ((str + " -> ") + this.f1433y[i2] + " : ") + this.f47090zy.f2095q[this.f1427g[i2]];
            i2 = this.f47087f7l8[i2];
        }
        return str;
    }

    public final int toq(int i2) {
        return this.f1427g[i2];
    }

    @Override // androidx.constraintlayout.core.toq.InterfaceC0325k
    public void x2() {
        int i2 = this.f1428k;
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
        float f3 = f47083kja0;
        if (f2 <= (-f3) || f2 >= f3) {
            int i2 = this.f1432s;
            if (i2 == -1) {
                this.f1432s = 0;
                this.f1433y[0] = f2;
                this.f1427g[0] = c0307s.f1866n;
                this.f47087f7l8[0] = -1;
                c0307s.f1865l++;
                c0307s.toq(this.f47089toq);
                this.f1428k++;
                if (this.f47088ld6) {
                    return;
                }
                int i3 = this.f1430p + 1;
                this.f1430p = i3;
                int[] iArr = this.f1427g;
                if (i3 >= iArr.length) {
                    this.f47088ld6 = true;
                    this.f1430p = iArr.length - 1;
                    return;
                }
                return;
            }
            int i4 = -1;
            for (int i5 = 0; i2 != -1 && i5 < this.f1428k; i5++) {
                int i6 = this.f1427g[i2];
                int i7 = c0307s.f1866n;
                if (i6 == i7) {
                    float[] fArr = this.f1433y;
                    float f4 = fArr[i2] + f2;
                    float f5 = f47083kja0;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i2] = f4;
                    if (f4 == 0.0f) {
                        if (i2 == this.f1432s) {
                            this.f1432s = this.f47087f7l8[i2];
                        } else {
                            int[] iArr2 = this.f47087f7l8;
                            iArr2[i4] = iArr2[i2];
                        }
                        if (z2) {
                            c0307s.m1153p(this.f47089toq);
                        }
                        if (this.f47088ld6) {
                            this.f1430p = i2;
                        }
                        c0307s.f1865l--;
                        this.f1428k--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i4 = i2;
                }
                i2 = this.f47087f7l8[i2];
            }
            int length = this.f1430p;
            int i8 = length + 1;
            if (this.f47088ld6) {
                int[] iArr3 = this.f1427g;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i8;
            }
            int[] iArr4 = this.f1427g;
            if (length >= iArr4.length && this.f1428k < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f1427g;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        length = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f1427g;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i10 = this.f1431q * 2;
                this.f1431q = i10;
                this.f47088ld6 = false;
                this.f1430p = length - 1;
                this.f1433y = Arrays.copyOf(this.f1433y, i10);
                this.f1427g = Arrays.copyOf(this.f1427g, this.f1431q);
                this.f47087f7l8 = Arrays.copyOf(this.f47087f7l8, this.f1431q);
            }
            this.f1427g[length] = c0307s.f1866n;
            this.f1433y[length] = f2;
            if (i4 != -1) {
                int[] iArr7 = this.f47087f7l8;
                iArr7[length] = iArr7[i4];
                iArr7[i4] = length;
            } else {
                this.f47087f7l8[length] = this.f1432s;
                this.f1432s = length;
            }
            c0307s.f1865l++;
            c0307s.toq(this.f47089toq);
            this.f1428k++;
            if (!this.f47088ld6) {
                this.f1430p++;
            }
            int i11 = this.f1430p;
            int[] iArr8 = this.f1427g;
            if (i11 >= iArr8.length) {
                this.f47088ld6 = true;
                this.f1430p = iArr8.length - 1;
            }
        }
    }

    public final int zy(int i2) {
        return this.f47087f7l8[i2];
    }
}
