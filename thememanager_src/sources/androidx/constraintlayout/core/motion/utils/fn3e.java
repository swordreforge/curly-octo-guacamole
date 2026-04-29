package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: compiled from: TypedBundle.java */
/* JADX INFO: loaded from: classes.dex */
public class fn3e {

    /* JADX INFO: renamed from: h */
    private static final int f1563h = 5;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f47254kja0 = 10;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f47255n7h = 10;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f47256qrj = 4;

    /* JADX INFO: renamed from: k */
    int[] f1565k = new int[10];

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int[] f47259toq = new int[10];

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f47261zy = 0;

    /* JADX INFO: renamed from: q */
    int[] f1568q = new int[10];

    /* JADX INFO: renamed from: n */
    float[] f1566n = new float[10];

    /* JADX INFO: renamed from: g */
    int f1564g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    int[] f47257f7l8 = new int[5];

    /* JADX INFO: renamed from: y */
    String[] f1570y = new String[5];

    /* JADX INFO: renamed from: s */
    int f1569s = 0;

    /* JADX INFO: renamed from: p */
    int[] f1567p = new int[4];

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    boolean[] f47258ld6 = new boolean[4];

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f47260x2 = 0;

    public void f7l8(zurt zurtVar) {
        for (int i2 = 0; i2 < this.f47261zy; i2++) {
            zurtVar.toq(this.f1565k[i2], this.f47259toq[i2]);
        }
        for (int i3 = 0; i3 < this.f1564g; i3++) {
            zurtVar.zy(this.f1568q[i3], this.f1566n[i3]);
        }
        for (int i4 = 0; i4 < this.f1569s; i4++) {
            zurtVar.mo935n(this.f47257f7l8[i4], this.f1570y[i4]);
        }
        for (int i5 = 0; i5 < this.f47260x2; i5++) {
            zurtVar.mo937q(this.f1567p[i5], this.f47258ld6[i5]);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m988g(fn3e fn3eVar) {
        for (int i2 = 0; i2 < this.f47261zy; i2++) {
            fn3eVar.toq(this.f1565k[i2], this.f47259toq[i2]);
        }
        for (int i3 = 0; i3 < this.f1564g; i3++) {
            fn3eVar.m989k(this.f1568q[i3], this.f1566n[i3]);
        }
        for (int i4 = 0; i4 < this.f1569s; i4++) {
            fn3eVar.zy(this.f47257f7l8[i4], this.f1570y[i4]);
        }
        for (int i5 = 0; i5 < this.f47260x2; i5++) {
            fn3eVar.m991q(this.f1567p[i5], this.f47258ld6[i5]);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m989k(int i2, float f2) {
        int i3 = this.f1564g;
        int[] iArr = this.f1568q;
        if (i3 >= iArr.length) {
            this.f1568q = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f1566n;
            this.f1566n = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f1568q;
        int i4 = this.f1564g;
        iArr2[i4] = i2;
        float[] fArr2 = this.f1566n;
        this.f1564g = i4 + 1;
        fArr2[i4] = f2;
    }

    /* JADX INFO: renamed from: n */
    public void m990n(int i2, String str) {
        if (str != null) {
            zy(i2, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m991q(int i2, boolean z2) {
        int i3 = this.f47260x2;
        int[] iArr = this.f1567p;
        if (i3 >= iArr.length) {
            this.f1567p = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f47258ld6;
            this.f47258ld6 = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f1567p;
        int i4 = this.f47260x2;
        iArr2[i4] = i2;
        boolean[] zArr2 = this.f47258ld6;
        this.f47260x2 = i4 + 1;
        zArr2[i4] = z2;
    }

    /* JADX INFO: renamed from: s */
    public int m992s(int i2) {
        for (int i3 = 0; i3 < this.f47261zy; i3++) {
            if (this.f1565k[i3] == i2) {
                return this.f47259toq[i3];
            }
        }
        return -1;
    }

    public void toq(int i2, int i3) {
        int i4 = this.f47261zy;
        int[] iArr = this.f1565k;
        if (i4 >= iArr.length) {
            this.f1565k = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f47259toq;
            this.f47259toq = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f1565k;
        int i5 = this.f47261zy;
        iArr3[i5] = i2;
        int[] iArr4 = this.f47259toq;
        this.f47261zy = i5 + 1;
        iArr4[i5] = i3;
    }

    /* JADX INFO: renamed from: y */
    public void m993y() {
        this.f47260x2 = 0;
        this.f1569s = 0;
        this.f1564g = 0;
        this.f47261zy = 0;
    }

    public void zy(int i2, String str) {
        int i3 = this.f1569s;
        int[] iArr = this.f47257f7l8;
        if (i3 >= iArr.length) {
            this.f47257f7l8 = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f1570y;
            this.f1570y = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f47257f7l8;
        int i4 = this.f1569s;
        iArr2[i4] = i2;
        String[] strArr2 = this.f1570y;
        this.f1569s = i4 + 1;
        strArr2[i4] = str;
    }
}
