package androidx.constraintlayout.core.motion;

import androidx.core.view.C0683f;

/* JADX INFO: renamed from: androidx.constraintlayout.core.motion.k */
/* JADX INFO: compiled from: CustomAttribute.java */
/* JADX INFO: loaded from: classes.dex */
public class C0266k {

    /* JADX INFO: renamed from: s */
    private static final String f1451s = "TransitionLayout";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f47120f7l8;

    /* JADX INFO: renamed from: g */
    private String f1452g;

    /* JADX INFO: renamed from: k */
    private boolean f1453k;

    /* JADX INFO: renamed from: n */
    private float f1454n;

    /* JADX INFO: renamed from: q */
    private int f1455q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    String f47121toq;

    /* JADX INFO: renamed from: y */
    private int f1456y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private toq f47122zy;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.k$k */
    /* JADX INFO: compiled from: CustomAttribute.java */
    static /* synthetic */ class k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f1457k;

        static {
            int[] iArr = new int[toq.values().length];
            f1457k = iArr;
            try {
                iArr[toq.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1457k[toq.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1457k[toq.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1457k[toq.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1457k[toq.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1457k[toq.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1457k[toq.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1457k[toq.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.core.motion.k$toq */
    /* JADX INFO: compiled from: CustomAttribute.java */
    public enum toq {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public C0266k(String str, toq toqVar) {
        this.f1453k = false;
        this.f47121toq = str;
        this.f47122zy = toqVar;
    }

    /* JADX INFO: renamed from: g */
    public static int m943g(float f2, float f3, float f4) {
        float f5 = f2 * 6.0f;
        int i2 = (int) f5;
        float f6 = f5 - i2;
        float f7 = f4 * 255.0f;
        int i3 = (int) (((1.0f - f3) * f7) + 0.5f);
        int i4 = (int) (((1.0f - (f6 * f3)) * f7) + 0.5f);
        int i5 = (int) (((1.0f - ((1.0f - f6) * f3)) * f7) + 0.5f);
        int i6 = (int) (f7 + 0.5f);
        if (i2 == 0) {
            return ((i6 << 16) + (i5 << 8) + i3) | (-16777216);
        }
        if (i2 == 1) {
            return ((i4 << 16) + (i6 << 8) + i3) | (-16777216);
        }
        if (i2 == 2) {
            return ((i3 << 16) + (i6 << 8) + i5) | (-16777216);
        }
        if (i2 == 3) {
            return ((i3 << 16) + (i4 << 8) + i6) | (-16777216);
        }
        if (i2 == 4) {
            return ((i5 << 16) + (i3 << 8) + i6) | (-16777216);
        }
        if (i2 != 5) {
            return 0;
        }
        return ((i6 << 16) + (i3 << 8) + i4) | (-16777216);
    }

    /* JADX INFO: renamed from: k */
    private static int m944k(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public boolean f7l8() {
        int i2 = k.f1457k[this.f47122zy.ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public void ld6(int i2) {
        this.f1455q = i2;
    }

    /* JADX INFO: renamed from: n */
    public void m945n(float[] fArr) {
        switch (k.f1457k[this.f47122zy.ordinal()]) {
            case 2:
                fArr[0] = this.f47120f7l8 ? 1.0f : 0.0f;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int i2 = (this.f1456y >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case 6:
                fArr[0] = this.f1455q;
                return;
            case 7:
                fArr[0] = this.f1454n;
                return;
            case 8:
                fArr[0] = this.f1454n;
                return;
            default:
                return;
        }
    }

    public void n7h(float[] fArr) {
        switch (k.f1457k[this.f47122zy.ordinal()]) {
            case 1:
            case 6:
                this.f1455q = (int) fArr[0];
                return;
            case 2:
                this.f47120f7l8 = ((double) fArr[0]) > 0.5d;
                return;
            case 3:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 4:
            case 5:
                int iM943g = m943g(fArr[0], fArr[1], fArr[2]);
                this.f1456y = iM943g;
                this.f1456y = (m944k((int) (fArr[3] * 255.0f)) << 24) | (iM943g & C0683f.f50797t8r);
                return;
            case 7:
                this.f1454n = fArr[0];
                return;
            case 8:
                this.f1454n = fArr[0];
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m946p(float f2) {
        this.f1454n = f2;
    }

    /* JADX INFO: renamed from: q */
    public float m947q() {
        switch (k.f1457k[this.f47122zy.ordinal()]) {
            case 2:
                return this.f47120f7l8 ? 1.0f : 0.0f;
            case 3:
                throw new RuntimeException("Cannot interpolate String");
            case 4:
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                return this.f1455q;
            case 7:
                return this.f1454n;
            case 8:
                return this.f1454n;
            default:
                return Float.NaN;
        }
    }

    public void qrj(Object obj) {
        switch (k.f1457k[this.f47122zy.ordinal()]) {
            case 1:
            case 6:
                this.f1455q = ((Integer) obj).intValue();
                break;
            case 2:
                this.f47120f7l8 = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f1452g = (String) obj;
                break;
            case 4:
            case 5:
                this.f1456y = ((Integer) obj).intValue();
                break;
            case 7:
                this.f1454n = ((Float) obj).floatValue();
                break;
            case 8:
                this.f1454n = ((Float) obj).floatValue();
                break;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m948s(int i2) {
        this.f1456y = i2;
    }

    public boolean toq(C0266k c0266k) {
        toq toqVar;
        if (c0266k == null || (toqVar = this.f47122zy) != c0266k.f47122zy) {
            return false;
        }
        switch (k.f1457k[toqVar.ordinal()]) {
            case 1:
            case 6:
                return this.f1455q == c0266k.f1455q;
            case 2:
                return this.f47120f7l8 == c0266k.f47120f7l8;
            case 3:
                return this.f1455q == c0266k.f1455q;
            case 4:
            case 5:
                return this.f1456y == c0266k.f1456y;
            case 7:
                return this.f1454n == c0266k.f1454n;
            case 8:
                return this.f1454n == c0266k.f1454n;
            default:
                return false;
        }
    }

    public void x2(String str) {
        this.f1452g = str;
    }

    /* JADX INFO: renamed from: y */
    public int m949y() {
        int i2 = k.f1457k[this.f47122zy.ordinal()];
        return (i2 == 4 || i2 == 5) ? 4 : 1;
    }

    public toq zy() {
        return this.f47122zy;
    }

    public C0266k(String str, toq toqVar, Object obj, boolean z2) {
        this.f47121toq = str;
        this.f47122zy = toqVar;
        this.f1453k = z2;
        qrj(obj);
    }

    public C0266k(C0266k c0266k, Object obj) {
        this.f1453k = false;
        this.f47121toq = c0266k.f47121toq;
        this.f47122zy = c0266k.f47122zy;
        qrj(obj);
    }
}
