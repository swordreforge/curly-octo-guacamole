package androidx.constraintlayout.core;

import androidx.constraintlayout.core.toq;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: androidx.constraintlayout.core.y */
/* JADX INFO: compiled from: PriorityGoalRow.java */
/* JADX INFO: loaded from: classes.dex */
public class C0346y extends androidx.constraintlayout.core.toq {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    static final int f47986cdj = -1;

    /* JADX INFO: renamed from: h */
    private static final boolean f2089h = false;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final float f47987kja0 = 1.0E-4f;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private C0307s[] f47988ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    zy f47989n7h;

    /* JADX INFO: renamed from: p */
    private C0307s[] f2090p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    toq f47990qrj;

    /* JADX INFO: renamed from: s */
    private int f2091s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f47991x2;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.y$k */
    /* JADX INFO: compiled from: PriorityGoalRow.java */
    class k implements Comparator<C0307s> {
        k() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(C0307s c0307s, C0307s c0307s2) {
            return c0307s.f1866n - c0307s2.f1866n;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.y$toq */
    /* JADX INFO: compiled from: PriorityGoalRow.java */
    class toq {

        /* JADX INFO: renamed from: k */
        C0307s f2093k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        C0346y f47992toq;

        public toq(C0346y c0346y) {
            this.f47992toq = c0346y;
        }

        public void f7l8() {
            Arrays.fill(this.f2093k.f1862i, 0.0f);
        }

        /* JADX INFO: renamed from: g */
        public final boolean m1358g(C0307s c0307s) {
            int i2 = 8;
            while (true) {
                if (i2 < 0) {
                    break;
                }
                float f2 = c0307s.f1862i[i2];
                float f3 = this.f2093k.f1862i[i2];
                if (f3 == f2) {
                    i2--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: k */
        public void m1359k(C0307s c0307s) {
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f2093k.f1862i;
                float f2 = fArr[i2] + c0307s.f1862i[i2];
                fArr[i2] = f2;
                if (Math.abs(f2) < 1.0E-4f) {
                    this.f2093k.f1862i[i2] = 0.0f;
                }
            }
        }

        /* JADX INFO: renamed from: n */
        public final boolean m1360n() {
            for (int i2 = 0; i2 < 9; i2++) {
                if (this.f2093k.f1862i[i2] != 0.0f) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: renamed from: q */
        public final boolean m1361q() {
            for (int i2 = 8; i2 >= 0; i2--) {
                float f2 = this.f2093k.f1862i[i2];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.f2093k != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    str = str + this.f2093k.f1862i[i2] + " ";
                }
            }
            return str + "] " + this.f2093k;
        }

        public boolean toq(C0307s c0307s, float f2) {
            boolean z2 = true;
            if (!this.f2093k.f1864k) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float f3 = c0307s.f1862i[i2];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f2093k.f1862i[i2] = f4;
                    } else {
                        this.f2093k.f1862i[i2] = 0.0f;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < 9; i3++) {
                float[] fArr = this.f2093k.f1862i;
                float f5 = fArr[i3] + (c0307s.f1862i[i3] * f2);
                fArr[i3] = f5;
                if (Math.abs(f5) < 1.0E-4f) {
                    this.f2093k.f1862i[i3] = 0.0f;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                C0346y.this.oc(this.f2093k);
            }
            return false;
        }

        public void zy(C0307s c0307s) {
            this.f2093k = c0307s;
        }
    }

    public C0346y(zy zyVar) {
        super(zyVar);
        this.f2091s = 128;
        this.f2090p = new C0307s[128];
        this.f47988ld6 = new C0307s[128];
        this.f47991x2 = 0;
        this.f47990qrj = new toq(this);
        this.f47989n7h = zyVar;
    }

    private final void d3(C0307s c0307s) {
        int i2;
        int i3 = this.f47991x2 + 1;
        C0307s[] c0307sArr = this.f2090p;
        if (i3 > c0307sArr.length) {
            C0307s[] c0307sArr2 = (C0307s[]) Arrays.copyOf(c0307sArr, c0307sArr.length * 2);
            this.f2090p = c0307sArr2;
            this.f47988ld6 = (C0307s[]) Arrays.copyOf(c0307sArr2, c0307sArr2.length * 2);
        }
        C0307s[] c0307sArr3 = this.f2090p;
        int i4 = this.f47991x2;
        c0307sArr3[i4] = c0307s;
        int i5 = i4 + 1;
        this.f47991x2 = i5;
        if (i5 > 1 && c0307sArr3[i5 - 1].f1866n > c0307s.f1866n) {
            int i6 = 0;
            while (true) {
                i2 = this.f47991x2;
                if (i6 >= i2) {
                    break;
                }
                this.f47988ld6[i6] = this.f2090p[i6];
                i6++;
            }
            Arrays.sort(this.f47988ld6, 0, i2, new k());
            for (int i7 = 0; i7 < this.f47991x2; i7++) {
                this.f2090p[i7] = this.f47988ld6[i7];
            }
        }
        c0307s.f1864k = true;
        c0307s.toq(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void oc(C0307s c0307s) {
        int i2 = 0;
        while (i2 < this.f47991x2) {
            if (this.f2090p[i2] == c0307s) {
                while (true) {
                    int i3 = this.f47991x2;
                    if (i2 >= i3 - 1) {
                        this.f47991x2 = i3 - 1;
                        c0307s.f1864k = false;
                        return;
                    } else {
                        C0307s[] c0307sArr = this.f2090p;
                        int i4 = i2 + 1;
                        c0307sArr[i2] = c0307sArr[i4];
                        i2 = i4;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.toq, androidx.constraintlayout.core.C0296n.k
    public void clear() {
        this.f47991x2 = 0;
        this.f47690toq = 0.0f;
    }

    @Override // androidx.constraintlayout.core.toq, androidx.constraintlayout.core.C0296n.k
    /* JADX INFO: renamed from: g */
    public void mo1126g(C0307s c0307s) {
        this.f47990qrj.zy(c0307s);
        this.f47990qrj.f7l8();
        c0307s.f1862i[c0307s.f1872y] = 1.0f;
        d3(c0307s);
    }

    @Override // androidx.constraintlayout.core.toq, androidx.constraintlayout.core.C0296n.k
    public boolean isEmpty() {
        return this.f47991x2 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // androidx.constraintlayout.core.toq, androidx.constraintlayout.core.C0296n.k
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.constraintlayout.core.C0307s mo1128n(androidx.constraintlayout.core.C0296n r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f47991x2
            if (r0 >= r2) goto L32
            androidx.constraintlayout.core.s[] r2 = r4.f2090p
            r2 = r2[r0]
            int r3 = r2.f1866n
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            androidx.constraintlayout.core.y$toq r3 = r4.f47990qrj
            r3.zy(r2)
            if (r1 != r5) goto L22
            androidx.constraintlayout.core.y$toq r2 = r4.f47990qrj
            boolean r2 = r2.m1361q()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            androidx.constraintlayout.core.y$toq r2 = r4.f47990qrj
            androidx.constraintlayout.core.s[] r3 = r4.f2090p
            r3 = r3[r1]
            boolean r2 = r2.m1358g(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            androidx.constraintlayout.core.s[] r5 = r4.f2090p
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.C0346y.mo1128n(androidx.constraintlayout.core.n, boolean[]):androidx.constraintlayout.core.s");
    }

    @Override // androidx.constraintlayout.core.toq
    public String toString() {
        String str = " goal -> (" + this.f47690toq + ") : ";
        for (int i2 = 0; i2 < this.f47991x2; i2++) {
            this.f47990qrj.zy(this.f2090p[i2]);
            str = str + this.f47990qrj + " ";
        }
        return str;
    }

    @Override // androidx.constraintlayout.core.toq, androidx.constraintlayout.core.C0296n.k
    public void zy(C0296n c0296n, androidx.constraintlayout.core.toq toqVar, boolean z2) {
        C0307s c0307s = toqVar.f1957k;
        if (c0307s == null) {
            return;
        }
        toq.InterfaceC0325k interfaceC0325k = toqVar.f1958n;
        int iMo924q = interfaceC0325k.mo924q();
        for (int i2 = 0; i2 < iMo924q; i2++) {
            C0307s c0307sF7l8 = interfaceC0325k.f7l8(i2);
            float fKja0 = interfaceC0325k.kja0(i2);
            this.f47990qrj.zy(c0307sF7l8);
            if (this.f47990qrj.toq(c0307s, fKja0)) {
                d3(c0307sF7l8);
            }
            this.f47690toq += toqVar.f47690toq * fKja0;
        }
        oc(c0307s);
    }
}
