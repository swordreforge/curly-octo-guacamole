package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.C3844k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.n */
/* JADX INFO: compiled from: Projection.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3886n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f67215f7l8 = 2;

    /* JADX INFO: renamed from: g */
    public static final int f23517g = 1;

    /* JADX INFO: renamed from: n */
    public static final int f23518n = 0;

    /* JADX INFO: renamed from: s */
    public static final int f23519s = 3;

    /* JADX INFO: renamed from: y */
    public static final int f23520y = 2;

    /* JADX INFO: renamed from: k */
    public final toq f23521k;

    /* JADX INFO: renamed from: q */
    public final boolean f23522q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final toq f67216toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final int f67217zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.n$k */
    /* JADX INFO: compiled from: Projection.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.n$toq */
    /* JADX INFO: compiled from: Projection.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private final zy[] f23523k;

        public toq(zy... zyVarArr) {
            this.f23523k = zyVarArr;
        }

        /* JADX INFO: renamed from: k */
        public zy m13849k(int i2) {
            return this.f23523k[i2];
        }

        public int toq() {
            return this.f23523k.length;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.n$zy */
    /* JADX INFO: compiled from: Projection.java */
    public static final class zy {

        /* JADX INFO: renamed from: n */
        public static final int f23524n = 0;

        /* JADX INFO: renamed from: k */
        public final int f23525k;

        /* JADX INFO: renamed from: q */
        public final float[] f23526q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final int f67218toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final float[] f67219zy;

        public zy(int i2, float[] fArr, float[] fArr2, int i3) {
            this.f23525k = i2;
            C3844k.m13629k(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f67219zy = fArr;
            this.f23526q = fArr2;
            this.f67218toq = i3;
        }

        /* JADX INFO: renamed from: k */
        public int m13850k() {
            return this.f67219zy.length / 3;
        }
    }

    public C3886n(toq toqVar, int i2) {
        this(toqVar, toqVar, i2);
    }

    /* JADX INFO: renamed from: k */
    public static C3886n m13848k(float f2, int i2, int i3, float f3, float f4, int i4) {
        int i5;
        float f5;
        int i6;
        int i7;
        int i8;
        float[] fArr;
        int i9;
        int i10 = i2;
        int i11 = i3;
        C3844k.m13629k(f2 > 0.0f);
        C3844k.m13629k(i10 >= 1);
        C3844k.m13629k(i11 >= 1);
        C3844k.m13629k(f3 > 0.0f && f3 <= 180.0f);
        C3844k.m13629k(f4 > 0.0f && f4 <= 360.0f);
        float radians = (float) Math.toRadians(f3);
        float radians2 = (float) Math.toRadians(f4);
        float f6 = radians / i10;
        float f7 = radians2 / i11;
        int i12 = i11 + 1;
        int i13 = ((i12 * 2) + 2) * i10;
        float[] fArr2 = new float[i13 * 3];
        float[] fArr3 = new float[i13 * 2];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < i10) {
            float f8 = radians / 2.0f;
            float f9 = (i14 * f6) - f8;
            int i17 = i14 + 1;
            float f10 = (i17 * f6) - f8;
            int i18 = 0;
            while (i18 < i12) {
                float f11 = f9;
                int i19 = i17;
                int i20 = 0;
                int i21 = 2;
                while (i20 < i21) {
                    if (i20 == 0) {
                        f5 = f11;
                        i5 = i12;
                    } else {
                        i5 = i12;
                        f5 = f10;
                    }
                    float f12 = i18 * f7;
                    float f13 = f7;
                    int i22 = i15 + 1;
                    int i23 = i18;
                    double d2 = f2;
                    float f14 = f6;
                    double d4 = (f12 + 3.1415927f) - (radians2 / 2.0f);
                    int i24 = i20;
                    double d5 = f5;
                    float[] fArr4 = fArr3;
                    float f15 = f10;
                    fArr2[i15] = -((float) (Math.sin(d4) * d2 * Math.cos(d5)));
                    int i25 = i22 + 1;
                    int i26 = i14;
                    fArr2[i22] = (float) (d2 * Math.sin(d5));
                    int i27 = i25 + 1;
                    fArr2[i25] = (float) (d2 * Math.cos(d4) * Math.cos(d5));
                    int i28 = i16 + 1;
                    fArr4[i16] = f12 / radians2;
                    int i29 = i28 + 1;
                    fArr4[i28] = ((i26 + i24) * f14) / radians;
                    if (i23 == 0 && i24 == 0) {
                        i6 = i3;
                        i7 = i23;
                        i8 = i24;
                    } else {
                        i6 = i3;
                        i7 = i23;
                        i8 = i24;
                        if (i7 != i6 || i8 != 1) {
                            fArr = fArr4;
                            i9 = 2;
                        }
                        i16 = i29;
                        i15 = i27;
                        i20 = i8 + 1;
                        i11 = i6;
                        i18 = i7;
                        fArr3 = fArr;
                        i21 = i9;
                        i14 = i26;
                        i12 = i5;
                        f7 = f13;
                        f6 = f14;
                        f10 = f15;
                    }
                    System.arraycopy(fArr2, i27 - 3, fArr2, i27, 3);
                    i27 += 3;
                    fArr = fArr4;
                    i9 = 2;
                    System.arraycopy(fArr, i29 - 2, fArr, i29, 2);
                    i29 += 2;
                    i16 = i29;
                    i15 = i27;
                    i20 = i8 + 1;
                    i11 = i6;
                    i18 = i7;
                    fArr3 = fArr;
                    i21 = i9;
                    i14 = i26;
                    i12 = i5;
                    f7 = f13;
                    f6 = f14;
                    f10 = f15;
                }
                float f16 = f6;
                int i30 = i18;
                int i31 = i11;
                int i32 = i30 + 1;
                f9 = f11;
                i17 = i19;
                i12 = i12;
                f6 = f16;
                f10 = f10;
                i11 = i31;
                i18 = i32;
            }
            i10 = i2;
            i14 = i17;
        }
        return new C3886n(new toq(new zy(0, fArr2, fArr3, 1)), i4);
    }

    public static C3886n toq(int i2) {
        return m13848k(50.0f, 36, 72, 180.0f, 360.0f, i2);
    }

    public C3886n(toq toqVar, toq toqVar2, int i2) {
        this.f23521k = toqVar;
        this.f67216toq = toqVar2;
        this.f67217zy = i2;
        this.f23522q = toqVar == toqVar2;
    }
}
