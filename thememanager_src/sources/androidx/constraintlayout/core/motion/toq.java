package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.zurt;

/* JADX INFO: compiled from: CustomVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f47250f7l8 = "TransitionLayout";

    /* JADX INFO: renamed from: g */
    boolean f1557g;

    /* JADX INFO: renamed from: k */
    String f1558k;

    /* JADX INFO: renamed from: n */
    private String f1559n;

    /* JADX INFO: renamed from: q */
    private float f1560q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f47251toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f47252zy;

    public toq(toq toqVar) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1559n = null;
        this.f1558k = toqVar.f1558k;
        this.f47251toq = toqVar.f47251toq;
        this.f47252zy = toqVar.f47252zy;
        this.f1560q = toqVar.f1560q;
        this.f1559n = toqVar.f1559n;
        this.f1557g = toqVar.f1557g;
    }

    /* JADX INFO: renamed from: h */
    public static int m974h(float f2, float f3, float f4) {
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

    public static int t8r(float f2, float f3, float f4, float f5) {
        int qVar = toq((int) (f2 * 255.0f));
        int qVar2 = toq((int) (f3 * 255.0f));
        return (qVar << 16) | (toq((int) (f5 * 255.0f)) << 24) | (qVar2 << 8) | toq((int) (f4 * 255.0f));
    }

    private static int toq(int i2) {
        int i3 = (i2 & (~(i2 >> 31))) - 255;
        return (i3 & (i3 >> 31)) + 255;
    }

    public static String zy(int i2) {
        return "#" + ("00000000" + Integer.toHexString(i2)).substring(r2.length() - 8);
    }

    public boolean cdj() {
        int i2 = this.f47251toq;
        return (i2 == 903 || i2 == 904 || i2 == 906) ? false : true;
    }

    public int f7l8() {
        return this.f47252zy;
    }

    public void fn3e(float f2) {
        this.f1560q = f2;
    }

    public void fu4(String str) {
        this.f1559n = str;
    }

    /* JADX INFO: renamed from: g */
    public boolean m975g() {
        return this.f1557g;
    }

    /* JADX INFO: renamed from: i */
    public void m976i(boolean z2) {
        this.f1557g = z2;
    }

    /* JADX INFO: renamed from: k */
    public void m977k(C0265g c0265g) {
        int i2 = this.f47251toq;
        switch (i2) {
            case zurt.toq.f1759p /* 900 */:
            case zurt.toq.f47470x2 /* 902 */:
            case zurt.toq.f1756h /* 906 */:
                c0265g.oc(this.f1558k, i2, this.f47252zy);
                break;
            case zurt.toq.f47466ld6 /* 901 */:
            case zurt.toq.f47465kja0 /* 905 */:
                c0265g.d3(this.f1558k, i2, this.f1560q);
                break;
            case zurt.toq.f47468qrj /* 903 */:
                c0265g.eqxt(this.f1558k, i2, this.f1559n);
                break;
            case zurt.toq.f47467n7h /* 904 */:
                c0265g.d2ok(this.f1558k, i2, this.f1557g);
                break;
        }
    }

    public int ki() {
        return this.f47251toq != 902 ? 1 : 4;
    }

    public void kja0(float[] fArr) {
        switch (this.f47251toq) {
            case zurt.toq.f1759p /* 900 */:
                fArr[0] = this.f47252zy;
                return;
            case zurt.toq.f47466ld6 /* 901 */:
                fArr[0] = this.f1560q;
                return;
            case zurt.toq.f47470x2 /* 902 */:
                int i2 = (this.f47252zy >> 24) & 255;
                float fPow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i2 / 255.0f;
                return;
            case zurt.toq.f47468qrj /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case zurt.toq.f47467n7h /* 904 */:
                fArr[0] = this.f1557g ? 1.0f : 0.0f;
                return;
            case zurt.toq.f47465kja0 /* 905 */:
                fArr[0] = this.f1560q;
                return;
            default:
                return;
        }
    }

    public String ld6() {
        return this.f1558k;
    }

    /* JADX INFO: renamed from: n */
    public boolean m978n(toq toqVar) {
        int i2;
        if (toqVar == null || (i2 = this.f47251toq) != toqVar.f47251toq) {
            return false;
        }
        switch (i2) {
            case zurt.toq.f1759p /* 900 */:
            case zurt.toq.f1756h /* 906 */:
                return this.f47252zy == toqVar.f47252zy;
            case zurt.toq.f47466ld6 /* 901 */:
                return this.f1560q == toqVar.f1560q;
            case zurt.toq.f47470x2 /* 902 */:
                return this.f47252zy == toqVar.f47252zy;
            case zurt.toq.f47468qrj /* 903 */:
                return this.f47252zy == toqVar.f47252zy;
            case zurt.toq.f47467n7h /* 904 */:
                return this.f1557g == toqVar.f1557g;
            case zurt.toq.f47465kja0 /* 905 */:
                return this.f1560q == toqVar.f1560q;
            default:
                return false;
        }
    }

    public float n7h() {
        switch (this.f47251toq) {
            case zurt.toq.f1759p /* 900 */:
                return this.f47252zy;
            case zurt.toq.f47466ld6 /* 901 */:
                return this.f1560q;
            case zurt.toq.f47470x2 /* 902 */:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case zurt.toq.f47468qrj /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case zurt.toq.f47467n7h /* 904 */:
                return this.f1557g ? 1.0f : 0.0f;
            case zurt.toq.f47465kja0 /* 905 */:
                return this.f1560q;
            default:
                return Float.NaN;
        }
    }

    public void ni7(C0265g c0265g, float[] fArr) {
        int i2 = this.f47251toq;
        switch (i2) {
            case zurt.toq.f1759p /* 900 */:
                c0265g.oc(this.f1558k, i2, (int) fArr[0]);
                return;
            case zurt.toq.f47466ld6 /* 901 */:
            case zurt.toq.f47465kja0 /* 905 */:
                c0265g.d3(this.f1558k, i2, fArr[0]);
                return;
            case zurt.toq.f47470x2 /* 902 */:
                c0265g.oc(this.f1558k, this.f47251toq, (toq((int) (fArr[3] * 255.0f)) << 24) | (toq((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (toq((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | toq((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case zurt.toq.f47468qrj /* 903 */:
            case zurt.toq.f1756h /* 906 */:
                throw new RuntimeException("unable to interpolate " + this.f1558k);
            case zurt.toq.f47467n7h /* 904 */:
                c0265g.d2ok(this.f1558k, i2, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void o1t(float[] fArr) {
        switch (this.f47251toq) {
            case zurt.toq.f1759p /* 900 */:
            case zurt.toq.f1756h /* 906 */:
                this.f47252zy = (int) fArr[0];
                return;
            case zurt.toq.f47466ld6 /* 901 */:
            case zurt.toq.f47465kja0 /* 905 */:
                this.f1560q = fArr[0];
                return;
            case zurt.toq.f47470x2 /* 902 */:
                this.f47252zy = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case zurt.toq.f47468qrj /* 903 */:
                throw new RuntimeException("Cannot interpolate String");
            case zurt.toq.f47467n7h /* 904 */:
                this.f1557g = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: p */
    public int m979p(float[] fArr) {
        return (toq((int) (fArr[3] * 255.0f)) << 24) | (toq((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (toq((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | toq((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    /* JADX INFO: renamed from: q */
    public toq m980q() {
        return new toq(this);
    }

    public int qrj() {
        return this.f47251toq;
    }

    /* JADX INFO: renamed from: s */
    public int m981s() {
        return this.f47252zy;
    }

    public String toString() {
        String str = this.f1558k + ':';
        switch (this.f47251toq) {
            case zurt.toq.f1759p /* 900 */:
                return str + this.f47252zy;
            case zurt.toq.f47466ld6 /* 901 */:
                return str + this.f1560q;
            case zurt.toq.f47470x2 /* 902 */:
                return str + zy(this.f47252zy);
            case zurt.toq.f47468qrj /* 903 */:
                return str + this.f1559n;
            case zurt.toq.f47467n7h /* 904 */:
                return str + Boolean.valueOf(this.f1557g);
            case zurt.toq.f47465kja0 /* 905 */:
                return str + this.f1560q;
            default:
                return str + "????";
        }
    }

    public String x2() {
        return this.f1559n;
    }

    /* JADX INFO: renamed from: y */
    public float m982y() {
        return this.f1560q;
    }

    /* JADX INFO: renamed from: z */
    public void m983z(Object obj) {
        switch (this.f47251toq) {
            case zurt.toq.f1759p /* 900 */:
            case zurt.toq.f1756h /* 906 */:
                this.f47252zy = ((Integer) obj).intValue();
                break;
            case zurt.toq.f47466ld6 /* 901 */:
                this.f1560q = ((Float) obj).floatValue();
                break;
            case zurt.toq.f47470x2 /* 902 */:
                this.f47252zy = ((Integer) obj).intValue();
                break;
            case zurt.toq.f47468qrj /* 903 */:
                this.f1559n = (String) obj;
                break;
            case zurt.toq.f47467n7h /* 904 */:
                this.f1557g = ((Boolean) obj).booleanValue();
                break;
            case zurt.toq.f47465kja0 /* 905 */:
                this.f1560q = ((Float) obj).floatValue();
                break;
        }
    }

    public void zurt(int i2) {
        this.f47252zy = i2;
    }

    public toq(String str, int i2, String str2) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1558k = str;
        this.f47251toq = i2;
        this.f1559n = str2;
    }

    public toq(String str, int i2, int i3) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1559n = null;
        this.f1558k = str;
        this.f47251toq = i2;
        if (i2 == 901) {
            this.f1560q = i3;
        } else {
            this.f47252zy = i3;
        }
    }

    public toq(String str, int i2, float f2) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1559n = null;
        this.f1558k = str;
        this.f47251toq = i2;
        this.f1560q = f2;
    }

    public toq(String str, int i2, boolean z2) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1559n = null;
        this.f1558k = str;
        this.f47251toq = i2;
        this.f1557g = z2;
    }

    public toq(String str, int i2) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1559n = null;
        this.f1558k = str;
        this.f47251toq = i2;
    }

    public toq(String str, int i2, Object obj) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1559n = null;
        this.f1558k = str;
        this.f47251toq = i2;
        m983z(obj);
    }

    public toq(toq toqVar, Object obj) {
        this.f47252zy = Integer.MIN_VALUE;
        this.f1560q = Float.NaN;
        this.f1559n = null;
        this.f1558k = toqVar.f1558k;
        this.f47251toq = toqVar.f47251toq;
        m983z(obj);
    }
}
