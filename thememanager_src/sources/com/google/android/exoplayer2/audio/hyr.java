package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.C3844k;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: Sonic.java */
/* JADX INFO: loaded from: classes2.dex */
final class hyr {

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f63434fu4 = 400;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f63435ni7 = 65;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f63436o1t = 2;

    /* JADX INFO: renamed from: z */
    private static final int f19385z = 4000;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f63437cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f63438f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f63439fn3e;

    /* JADX INFO: renamed from: g */
    private final int f19386g;

    /* JADX INFO: renamed from: h */
    private int f19387h;

    /* JADX INFO: renamed from: i */
    private int f19388i;

    /* JADX INFO: renamed from: k */
    private final int f19389k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f63440ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f63441kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f63442ld6;

    /* JADX INFO: renamed from: n */
    private final float f19390n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private short[] f63443n7h;

    /* JADX INFO: renamed from: p */
    private short[] f19391p;

    /* JADX INFO: renamed from: q */
    private final float f19392q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f63444qrj;

    /* JADX INFO: renamed from: s */
    private final short[] f19393s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f63445t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f63446toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private short[] f63447x2;

    /* JADX INFO: renamed from: y */
    private final int f19394y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private int f63448zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final float f63449zy;

    public hyr(int i2, int i3, float f2, float f3, int i4) {
        this.f19389k = i2;
        this.f63446toq = i3;
        this.f63449zy = f2;
        this.f19392q = f3;
        this.f19390n = i2 / i4;
        this.f19386g = i2 / 400;
        int i5 = i2 / 65;
        this.f63438f7l8 = i5;
        int i6 = i5 * 2;
        this.f19394y = i6;
        this.f19393s = new short[i6];
        this.f19391p = new short[i6 * i3];
        this.f63447x2 = new short[i6 * i3];
        this.f63443n7h = new short[i6 * i3];
    }

    private boolean cdj(int i2, int i3) {
        return i2 != 0 && this.f63445t8r != 0 && i3 <= i2 * 3 && i2 * 2 > this.f19388i * 3;
    }

    private int f7l8(short[] sArr, int i2) {
        int iM11481y;
        int i3 = this.f19389k;
        int i4 = i3 > 4000 ? i3 / 4000 : 1;
        if (this.f63446toq == 1 && i4 == 1) {
            iM11481y = m11481y(sArr, i2, this.f19386g, this.f63438f7l8);
        } else {
            m11479n(sArr, i2, i4);
            int iM11481y2 = m11481y(this.f19393s, 0, this.f19386g / i4, this.f63438f7l8 / i4);
            if (i4 != 1) {
                int i5 = iM11481y2 * i4;
                int i6 = i4 * 4;
                int i7 = i5 - i6;
                int i8 = i5 + i6;
                int i9 = this.f19386g;
                if (i7 < i9) {
                    i7 = i9;
                }
                int i10 = this.f63438f7l8;
                if (i8 > i10) {
                    i8 = i10;
                }
                if (this.f63446toq == 1) {
                    iM11481y = m11481y(sArr, i2, i7, i8);
                } else {
                    m11479n(sArr, i2, 1);
                    iM11481y = m11481y(this.f19393s, 0, i7, i8);
                }
            } else {
                iM11481y = iM11481y2;
            }
        }
        int i11 = cdj(this.f63439fn3e, this.f63448zurt) ? this.f63445t8r : iM11481y;
        this.f19388i = this.f63439fn3e;
        this.f63445t8r = iM11481y;
        return i11;
    }

    private void fn3e(int i2) {
        if (i2 == 0) {
            return;
        }
        short[] sArr = this.f63443n7h;
        int i3 = this.f63446toq;
        System.arraycopy(sArr, i2 * i3, sArr, 0, (this.f63441kja0 - i2) * i3);
        this.f63441kja0 -= i2;
    }

    /* JADX INFO: renamed from: g */
    private short[] m11476g(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.f63446toq;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    /* JADX INFO: renamed from: h */
    private static void m11477h(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    private void m11478k(float f2, int i2) {
        int i3;
        int i4;
        if (this.f63444qrj == i2) {
            return;
        }
        int i5 = this.f19389k;
        int i6 = (int) (i5 / f2);
        while (true) {
            if (i6 <= 16384 && i5 <= 16384) {
                break;
            }
            i6 /= 2;
            i5 /= 2;
        }
        kja0(i2);
        int i7 = 0;
        while (true) {
            int i8 = this.f63441kja0;
            if (i7 >= i8 - 1) {
                fn3e(i8 - 1);
                return;
            }
            while (true) {
                i3 = this.f19387h;
                int i9 = (i3 + 1) * i6;
                i4 = this.f63437cdj;
                if (i9 <= i4 * i5) {
                    break;
                }
                this.f63447x2 = m11476g(this.f63447x2, this.f63444qrj, 1);
                int i10 = 0;
                while (true) {
                    int i11 = this.f63446toq;
                    if (i10 < i11) {
                        this.f63447x2[(this.f63444qrj * i11) + i10] = n7h(this.f63443n7h, (i11 * i7) + i10, i5, i6);
                        i10++;
                    }
                }
                this.f63437cdj++;
                this.f63444qrj++;
            }
            int i12 = i3 + 1;
            this.f19387h = i12;
            if (i12 == i5) {
                this.f19387h = 0;
                C3844k.m13633s(i4 == i6);
                this.f63437cdj = 0;
            }
            i7++;
        }
    }

    private void ki() {
        int i2 = this.f63444qrj;
        float f2 = this.f63449zy;
        float f3 = this.f19392q;
        float f4 = f2 / f3;
        float f5 = this.f19390n * f3;
        double d2 = f4;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            toq(f4);
        } else {
            m11480q(this.f19391p, 0, this.f63442ld6);
            this.f63442ld6 = 0;
        }
        if (f5 != 1.0f) {
            m11478k(f5, i2);
        }
    }

    private void kja0(int i2) {
        int i3 = this.f63444qrj - i2;
        short[] sArrM11476g = m11476g(this.f63443n7h, this.f63441kja0, i3);
        this.f63443n7h = sArrM11476g;
        short[] sArr = this.f63447x2;
        int i4 = this.f63446toq;
        System.arraycopy(sArr, i2 * i4, sArrM11476g, this.f63441kja0 * i4, i4 * i3);
        this.f63444qrj = i2;
        this.f63441kja0 += i3;
    }

    /* JADX INFO: renamed from: n */
    private void m11479n(short[] sArr, int i2, int i3) {
        int i4 = this.f19394y / i3;
        int i5 = this.f63446toq;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f19393s[i8] = (short) (i9 / i6);
        }
    }

    private short n7h(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.f63446toq];
        int i5 = this.f63437cdj * i3;
        int i6 = this.f19387h;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) (((s2 * i9) + ((i10 - i9) * s3)) / i10);
    }

    private int ni7(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (i3 / (f2 - 1.0f));
        } else {
            this.f63440ki = (int) ((i3 * (2.0f - f2)) / (f2 - 1.0f));
            i4 = i3;
        }
        short[] sArrM11476g = m11476g(this.f63447x2, this.f63444qrj, i4);
        this.f63447x2 = sArrM11476g;
        m11477h(i4, this.f63446toq, sArrM11476g, this.f63444qrj, sArr, i2, sArr, i2 + i3);
        this.f63444qrj += i4;
        return i4;
    }

    /* JADX INFO: renamed from: q */
    private void m11480q(short[] sArr, int i2, int i3) {
        short[] sArrM11476g = m11476g(this.f63447x2, this.f63444qrj, i3);
        this.f63447x2 = sArrM11476g;
        int i4 = this.f63446toq;
        System.arraycopy(sArr, i2 * i4, sArrM11476g, this.f63444qrj * i4, i4 * i3);
        this.f63444qrj += i3;
    }

    private int qrj(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((i3 * f2) / (1.0f - f2));
        } else {
            this.f63440ki = (int) ((i3 * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        short[] sArrM11476g = m11476g(this.f63447x2, this.f63444qrj, i5);
        this.f63447x2 = sArrM11476g;
        int i6 = this.f63446toq;
        System.arraycopy(sArr, i2 * i6, sArrM11476g, this.f63444qrj * i6, i6 * i3);
        m11477h(i4, this.f63446toq, this.f63447x2, this.f63444qrj + i3, sArr, i2 + i3, sArr, i2);
        this.f63444qrj += i5;
        return i4;
    }

    private void toq(float f2) {
        int iNi7;
        int i2 = this.f63442ld6;
        if (i2 < this.f19394y) {
            return;
        }
        int i3 = 0;
        do {
            if (this.f63440ki > 0) {
                iNi7 = zy(i3);
            } else {
                int iF7l8 = f7l8(this.f19391p, i3);
                iNi7 = ((double) f2) > 1.0d ? iF7l8 + ni7(this.f19391p, i3, f2, iF7l8) : qrj(this.f19391p, i3, f2, iF7l8);
            }
            i3 += iNi7;
        } while (this.f19394y + i3 <= i2);
        zurt(i3);
    }

    /* JADX INFO: renamed from: y */
    private int m11481y(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f63446toq;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int iAbs = 0;
            for (int i10 = 0; i10 < i3; i10++) {
                iAbs += Math.abs(sArr[i5 + i10] - sArr[(i5 + i3) + i10]);
            }
            if (iAbs * i8 < i6 * i3) {
                i8 = i3;
                i6 = iAbs;
            }
            if (iAbs * i7 > i9 * i3) {
                i7 = i3;
                i9 = iAbs;
            }
            i3++;
        }
        this.f63439fn3e = i6 / i8;
        this.f63448zurt = i9 / i7;
        return i8;
    }

    private void zurt(int i2) {
        int i3 = this.f63442ld6 - i2;
        short[] sArr = this.f19391p;
        int i4 = this.f63446toq;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.f63442ld6 = i3;
    }

    private int zy(int i2) {
        int iMin = Math.min(this.f19394y, this.f63440ki);
        m11480q(this.f19391p, i2, iMin);
        this.f63440ki -= iMin;
        return iMin;
    }

    /* JADX INFO: renamed from: i */
    public void m11482i(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.f63446toq;
        int i3 = iRemaining / i2;
        short[] sArrM11476g = m11476g(this.f19391p, this.f63442ld6, i3);
        this.f19391p = sArrM11476g;
        shortBuffer.get(sArrM11476g, this.f63442ld6 * this.f63446toq, ((i2 * i3) * 2) / 2);
        this.f63442ld6 += i3;
        ki();
    }

    public int ld6() {
        return this.f63444qrj * this.f63446toq * 2;
    }

    /* JADX INFO: renamed from: p */
    public void m11483p(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f63446toq, this.f63444qrj);
        shortBuffer.put(this.f63447x2, 0, this.f63446toq * iMin);
        int i2 = this.f63444qrj - iMin;
        this.f63444qrj = i2;
        short[] sArr = this.f63447x2;
        int i3 = this.f63446toq;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    /* JADX INFO: renamed from: s */
    public void m11484s() {
        this.f63442ld6 = 0;
        this.f63444qrj = 0;
        this.f63441kja0 = 0;
        this.f19387h = 0;
        this.f63437cdj = 0;
        this.f63440ki = 0;
        this.f63445t8r = 0;
        this.f19388i = 0;
        this.f63439fn3e = 0;
        this.f63448zurt = 0;
    }

    public void t8r() {
        int i2;
        int i3 = this.f63442ld6;
        float f2 = this.f63449zy;
        float f3 = this.f19392q;
        int i4 = this.f63444qrj + ((int) ((((i3 / (f2 / f3)) + this.f63441kja0) / (this.f19390n * f3)) + 0.5f));
        this.f19391p = m11476g(this.f19391p, i3, (this.f19394y * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.f19394y;
            int i6 = this.f63446toq;
            if (i5 >= i2 * 2 * i6) {
                break;
            }
            this.f19391p[(i6 * i3) + i5] = 0;
            i5++;
        }
        this.f63442ld6 += i2 * 2;
        ki();
        if (this.f63444qrj > i4) {
            this.f63444qrj = i4;
        }
        this.f63442ld6 = 0;
        this.f63440ki = 0;
        this.f63441kja0 = 0;
    }

    public int x2() {
        return this.f63442ld6 * this.f63446toq * 2;
    }
}
