package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;
import zy.dd;

/* JADX INFO: compiled from: PathParser.java */
/* JADX INFO: loaded from: classes.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    private static final String f3525k = "PathParser";

    /* JADX INFO: renamed from: androidx.core.graphics.cdj$k */
    /* JADX INFO: compiled from: PathParser.java */
    private static class C0515k {

        /* JADX INFO: renamed from: k */
        int f3526k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        boolean f50424toq;

        C0515k() {
        }
    }

    private cdj() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f7l8(java.lang.String r8, int r9, androidx.core.graphics.cdj.C0515k r10) {
        /*
            r0 = 0
            r10.f50424toq = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.f50424toq = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f50424toq = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f3526k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.cdj.f7l8(java.lang.String, int, androidx.core.graphics.cdj$k):void");
    }

    /* JADX INFO: renamed from: g */
    public static toq[] m2387g(toq[] toqVarArr) {
        if (toqVarArr == null) {
            return null;
        }
        toq[] toqVarArr2 = new toq[toqVarArr.length];
        for (int i2 = 0; i2 < toqVarArr.length; i2++) {
            toqVarArr2[i2] = new toq(toqVarArr[i2]);
        }
        return toqVarArr2;
    }

    /* JADX INFO: renamed from: k */
    private static void m2388k(ArrayList<toq> arrayList, char c2, float[] fArr) {
        arrayList.add(new toq(c2, fArr));
    }

    public static void ld6(toq[] toqVarArr, toq[] toqVarArr2) {
        for (int i2 = 0; i2 < toqVarArr2.length; i2++) {
            toqVarArr[i2].f3527k = toqVarArr2[i2].f3527k;
            int i3 = 0;
            while (true) {
                float[] fArr = toqVarArr2[i2].f50425toq;
                if (i3 < fArr.length) {
                    toqVarArr[i2].f50425toq[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static Path m2389n(String str) {
        Path path = new Path();
        toq[] toqVarArrM2391q = m2391q(str);
        if (toqVarArrM2391q == null) {
            return null;
        }
        try {
            toq.m2395n(toqVarArrM2391q, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing " + str, e2);
        }
    }

    /* JADX INFO: renamed from: p */
    private static int m2390p(String str, int i2) {
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return i2;
            }
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public static toq[] m2391q(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            int iM2390p = m2390p(str, i2);
            String strTrim = str.substring(i3, iM2390p).trim();
            if (strTrim.length() > 0) {
                m2388k(arrayList, strTrim.charAt(0), m2393y(strTrim));
            }
            i3 = iM2390p;
            i2 = iM2390p + 1;
        }
        if (i2 - i3 == 1 && i3 < str.length()) {
            m2388k(arrayList, str.charAt(i3), new float[0]);
        }
        return (toq[]) arrayList.toArray(new toq[arrayList.size()]);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2392s(toq[] toqVarArr, toq[] toqVarArr2, toq[] toqVarArr3, float f2) {
        if (toqVarArr == null || toqVarArr2 == null || toqVarArr3 == null) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
        }
        if (toqVarArr.length != toqVarArr2.length || toqVarArr2.length != toqVarArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!toq(toqVarArr2, toqVarArr3)) {
            return false;
        }
        for (int i2 = 0; i2 < toqVarArr.length; i2++) {
            toqVarArr[i2].m2396q(toqVarArr2[i2], toqVarArr3[i2], f2);
        }
        return true;
    }

    public static boolean toq(@dd toq[] toqVarArr, @dd toq[] toqVarArr2) {
        if (toqVarArr == null || toqVarArr2 == null || toqVarArr.length != toqVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < toqVarArr.length; i2++) {
            toq toqVar = toqVarArr[i2];
            char c2 = toqVar.f3527k;
            toq toqVar2 = toqVarArr2[i2];
            if (c2 != toqVar2.f3527k || toqVar.f50425toq.length != toqVar2.f50425toq.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    private static float[] m2393y(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0515k c0515k = new C0515k();
            int length = str.length();
            int i2 = 1;
            int i3 = 0;
            while (i2 < length) {
                f7l8(str, i2, c0515k);
                int i4 = c0515k.f3526k;
                if (i2 < i4) {
                    fArr[i3] = Float.parseFloat(str.substring(i2, i4));
                    i3++;
                }
                i2 = c0515k.f50424toq ? i4 : i4 + 1;
            }
            return zy(fArr, 0, i3);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e2);
        }
    }

    static float[] zy(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int iMin = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX INFO: compiled from: PathParser.java */
    public static class toq {

        /* JADX INFO: renamed from: k */
        public char f3527k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public float[] f50425toq;

        toq(char c2, float[] fArr) {
            this.f3527k = c2;
            this.f50425toq = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX INFO: renamed from: k */
        private static void m2394k(Path path, float[] fArr, char c2, char c3, float[] fArr2) {
            int i2;
            int i3;
            int i4;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            char c4 = c3;
            boolean z2 = false;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            float f13 = fArr[3];
            float f14 = fArr[4];
            float f15 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i2 = 7;
                    i3 = i2;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    i3 = i2;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i3 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i3 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i3 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i3 = 2;
                    break;
            }
            float f16 = f10;
            float f17 = f11;
            float f18 = f14;
            float f19 = f15;
            int i5 = 0;
            char c5 = c2;
            while (i5 < fArr2.length) {
                if (c4 != 'A') {
                    if (c4 == 'C') {
                        i4 = i5;
                        int i6 = i4 + 2;
                        int i7 = i4 + 3;
                        int i8 = i4 + 4;
                        int i9 = i4 + 5;
                        path.cubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                        f16 = fArr2[i8];
                        float f20 = fArr2[i9];
                        float f21 = fArr2[i6];
                        float f22 = fArr2[i7];
                        f17 = f20;
                        f13 = f22;
                        f12 = f21;
                    } else if (c4 == 'H') {
                        i4 = i5;
                        int i10 = i4 + 0;
                        path.lineTo(fArr2[i10], f17);
                        f16 = fArr2[i10];
                    } else if (c4 == 'Q') {
                        i4 = i5;
                        int i11 = i4 + 0;
                        int i12 = i4 + 1;
                        int i13 = i4 + 2;
                        int i14 = i4 + 3;
                        path.quadTo(fArr2[i11], fArr2[i12], fArr2[i13], fArr2[i14]);
                        float f23 = fArr2[i11];
                        float f24 = fArr2[i12];
                        f16 = fArr2[i13];
                        f17 = fArr2[i14];
                        f12 = f23;
                        f13 = f24;
                    } else if (c4 == 'V') {
                        i4 = i5;
                        int i15 = i4 + 0;
                        path.lineTo(f16, fArr2[i15]);
                        f17 = fArr2[i15];
                    } else if (c4 != 'a') {
                        if (c4 != 'c') {
                            if (c4 == 'h') {
                                int i16 = i5 + 0;
                                path.rLineTo(fArr2[i16], 0.0f);
                                f16 += fArr2[i16];
                            } else if (c4 != 'q') {
                                if (c4 == 'v') {
                                    int i17 = i5 + 0;
                                    path.rLineTo(0.0f, fArr2[i17]);
                                    f5 = fArr2[i17];
                                } else if (c4 == 'L') {
                                    int i18 = i5 + 0;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i18], fArr2[i19]);
                                    f16 = fArr2[i18];
                                    f17 = fArr2[i19];
                                } else if (c4 == 'M') {
                                    f16 = fArr2[i5 + 0];
                                    f17 = fArr2[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f16, f17);
                                    } else {
                                        path.moveTo(f16, f17);
                                        i4 = i5;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 'S') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    float f25 = f17;
                                    int i20 = i5 + 0;
                                    int i21 = i5 + 1;
                                    int i22 = i5 + 2;
                                    int i23 = i5 + 3;
                                    path.cubicTo(f16, f25, fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                                    f2 = fArr2[i20];
                                    f3 = fArr2[i21];
                                    f16 = fArr2[i22];
                                    f17 = fArr2[i23];
                                    f12 = f2;
                                    f13 = f3;
                                } else if (c4 == 'T') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f16 = (f16 * 2.0f) - f12;
                                        f17 = (f17 * 2.0f) - f13;
                                    }
                                    int i24 = i5 + 0;
                                    int i25 = i5 + 1;
                                    path.quadTo(f16, f17, fArr2[i24], fArr2[i25]);
                                    float f26 = fArr2[i24];
                                    float f27 = fArr2[i25];
                                    i4 = i5;
                                    f13 = f17;
                                    f12 = f16;
                                    f16 = f26;
                                    f17 = f27;
                                } else if (c4 == 'l') {
                                    int i26 = i5 + 0;
                                    int i27 = i5 + 1;
                                    path.rLineTo(fArr2[i26], fArr2[i27]);
                                    f16 += fArr2[i26];
                                    f5 = fArr2[i27];
                                } else if (c4 == 'm') {
                                    float f28 = fArr2[i5 + 0];
                                    f16 += f28;
                                    float f29 = fArr2[i5 + 1];
                                    f17 += f29;
                                    if (i5 > 0) {
                                        path.rLineTo(f28, f29);
                                    } else {
                                        path.rMoveTo(f28, f29);
                                        i4 = i5;
                                        f19 = f17;
                                        f18 = f16;
                                    }
                                } else if (c4 == 's') {
                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                        float f30 = f16 - f12;
                                        f6 = f17 - f13;
                                        f7 = f30;
                                    } else {
                                        f7 = 0.0f;
                                        f6 = 0.0f;
                                    }
                                    int i28 = i5 + 0;
                                    int i29 = i5 + 1;
                                    int i30 = i5 + 2;
                                    int i31 = i5 + 3;
                                    path.rCubicTo(f7, f6, fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                                    f2 = fArr2[i28] + f16;
                                    f3 = fArr2[i29] + f17;
                                    f16 += fArr2[i30];
                                    f4 = fArr2[i31];
                                } else if (c4 == 't') {
                                    if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                        f8 = f16 - f12;
                                        f9 = f17 - f13;
                                    } else {
                                        f9 = 0.0f;
                                        f8 = 0.0f;
                                    }
                                    int i32 = i5 + 0;
                                    int i33 = i5 + 1;
                                    path.rQuadTo(f8, f9, fArr2[i32], fArr2[i33]);
                                    float f31 = f8 + f16;
                                    float f32 = f9 + f17;
                                    f16 += fArr2[i32];
                                    f17 += fArr2[i33];
                                    f13 = f32;
                                    f12 = f31;
                                }
                                f17 += f5;
                            } else {
                                int i34 = i5 + 0;
                                int i35 = i5 + 1;
                                int i36 = i5 + 2;
                                int i37 = i5 + 3;
                                path.rQuadTo(fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                                f2 = fArr2[i34] + f16;
                                f3 = fArr2[i35] + f17;
                                f16 += fArr2[i36];
                                f4 = fArr2[i37];
                            }
                            i4 = i5;
                        } else {
                            int i38 = i5 + 2;
                            int i39 = i5 + 3;
                            int i40 = i5 + 4;
                            int i41 = i5 + 5;
                            path.rCubicTo(fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i38], fArr2[i39], fArr2[i40], fArr2[i41]);
                            f2 = fArr2[i38] + f16;
                            f3 = fArr2[i39] + f17;
                            f16 += fArr2[i40];
                            f4 = fArr2[i41];
                        }
                        f17 += f4;
                        f12 = f2;
                        f13 = f3;
                        i4 = i5;
                    } else {
                        int i42 = i5 + 5;
                        int i43 = i5 + 6;
                        i4 = i5;
                        zy(path, f16, f17, fArr2[i42] + f16, fArr2[i43] + f17, fArr2[i5 + 0], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f, fArr2[i5 + 4] != 0.0f);
                        f16 += fArr2[i42];
                        f17 += fArr2[i43];
                    }
                    i5 = i4 + i3;
                    c5 = c3;
                    c4 = c5;
                    z2 = false;
                } else {
                    i4 = i5;
                    int i44 = i4 + 5;
                    int i45 = i4 + 6;
                    zy(path, f16, f17, fArr2[i44], fArr2[i45], fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i4 + 2], fArr2[i4 + 3] != 0.0f, fArr2[i4 + 4] != 0.0f);
                    f16 = fArr2[i44];
                    f17 = fArr2[i45];
                }
                f13 = f17;
                f12 = f16;
                i5 = i4 + i3;
                c5 = c3;
                c4 = c5;
                z2 = false;
            }
            fArr[z2 ? 1 : 0] = f16;
            fArr[1] = f17;
            fArr[2] = f12;
            fArr[3] = f13;
            fArr[4] = f18;
            fArr[5] = f19;
        }

        /* JADX INFO: renamed from: n */
        public static void m2395n(toq[] toqVarArr, Path path) {
            float[] fArr = new float[6];
            char c2 = 'm';
            for (int i2 = 0; i2 < toqVarArr.length; i2++) {
                toq toqVar = toqVarArr[i2];
                m2394k(path, fArr, c2, toqVar.f3527k, toqVar.f50425toq);
                c2 = toqVarArr[i2].f3527k;
            }
        }

        private static void toq(Path path, double d2, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11) {
            double d12 = d5;
            int iCeil = (int) Math.ceil(Math.abs((d11 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d9);
            double dSin = Math.sin(d9);
            double dCos2 = Math.cos(d10);
            double dSin2 = Math.sin(d10);
            double d13 = -d12;
            double d14 = d13 * dCos;
            double d15 = d6 * dSin;
            double d16 = (d14 * dSin2) - (d15 * dCos2);
            double d17 = d13 * dSin;
            double d18 = d6 * dCos;
            double d19 = (dSin2 * d17) + (dCos2 * d18);
            double d20 = d11 / ((double) iCeil);
            double d21 = d19;
            double d22 = d16;
            int i2 = 0;
            double d23 = d7;
            double d24 = d8;
            double d25 = d10;
            while (i2 < iCeil) {
                double d26 = d25 + d20;
                double dSin3 = Math.sin(d26);
                double dCos3 = Math.cos(d26);
                double d27 = (d2 + ((d12 * dCos) * dCos3)) - (d15 * dSin3);
                double d28 = d4 + (d12 * dSin * dCos3) + (d18 * dSin3);
                double d29 = (d14 * dSin3) - (d15 * dCos3);
                double d30 = (dSin3 * d17) + (dCos3 * d18);
                double d31 = d26 - d25;
                double dTan = Math.tan(d31 / 2.0d);
                double dSin4 = (Math.sin(d31) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d32 = d23 + (d22 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d32, (float) (d24 + (d21 * dSin4)), (float) (d27 - (dSin4 * d29)), (float) (d28 - (dSin4 * d30)), (float) d27, (float) d28);
                i2++;
                d20 = d20;
                dSin = dSin;
                d23 = d27;
                d17 = d17;
                dCos = dCos;
                d25 = d26;
                d21 = d30;
                d22 = d29;
                iCeil = iCeil;
                d24 = d28;
                d12 = d5;
            }
        }

        private static void zy(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z2, boolean z3) {
            double d2;
            double d4;
            double radians = Math.toRadians(f8);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d5 = f2;
            double d6 = d5 * dCos;
            double d7 = f3;
            double d8 = f6;
            double d9 = (d6 + (d7 * dSin)) / d8;
            double d10 = (((double) (-f2)) * dSin) + (d7 * dCos);
            double d11 = f7;
            double d12 = d10 / d11;
            double d13 = f5;
            double d14 = ((((double) f4) * dCos) + (d13 * dSin)) / d8;
            double d15 = ((((double) (-f4)) * dSin) + (d13 * dCos)) / d11;
            double d16 = d9 - d14;
            double d17 = d12 - d15;
            double d18 = (d9 + d14) / 2.0d;
            double d19 = (d12 + d15) / 2.0d;
            double d20 = (d16 * d16) + (d17 * d17);
            if (d20 == 0.0d) {
                Log.w(cdj.f3525k, " Points are coincident");
                return;
            }
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                Log.w(cdj.f3525k, "Points are too far apart " + d20);
                float fSqrt = (float) (Math.sqrt(d20) / 1.99999d);
                zy(path, f2, f3, f4, f5, f6 * fSqrt, f7 * fSqrt, f8, z2, z3);
                return;
            }
            double dSqrt = Math.sqrt(d21);
            double d22 = d16 * dSqrt;
            double d23 = dSqrt * d17;
            if (z2 == z3) {
                d2 = d18 - d23;
                d4 = d19 + d22;
            } else {
                d2 = d18 + d23;
                d4 = d19 - d22;
            }
            double dAtan2 = Math.atan2(d12 - d4, d9 - d2);
            double dAtan22 = Math.atan2(d15 - d4, d14 - d2) - dAtan2;
            if (z3 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d24 = d2 * d8;
            double d25 = d4 * d11;
            toq(path, (d24 * dCos) - (d25 * dSin), (d24 * dSin) + (d25 * dCos), d8, d11, d5, d7, radians, dAtan2, dAtan22);
        }

        /* JADX INFO: renamed from: q */
        public void m2396q(toq toqVar, toq toqVar2, float f2) {
            this.f3527k = toqVar.f3527k;
            int i2 = 0;
            while (true) {
                float[] fArr = toqVar.f50425toq;
                if (i2 >= fArr.length) {
                    return;
                }
                this.f50425toq[i2] = (fArr[i2] * (1.0f - f2)) + (toqVar2.f50425toq[i2] * f2);
                i2++;
            }
        }

        toq(toq toqVar) {
            this.f3527k = toqVar.f3527k;
            float[] fArr = toqVar.f50425toq;
            this.f50425toq = cdj.zy(fArr, 0, fArr.length);
        }
    }
}
