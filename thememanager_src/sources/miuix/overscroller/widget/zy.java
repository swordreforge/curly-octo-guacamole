package miuix.overscroller.widget;

import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import miuix.animation.physics.SpringOperator;

/* JADX INFO: compiled from: OverScroller.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f87949f7l8 = 0;

    /* JADX INFO: renamed from: g */
    private static final int f40772g = 250;

    /* JADX INFO: renamed from: p */
    private static boolean f40773p = false;

    /* JADX INFO: renamed from: s */
    public static final int f40774s = 2;

    /* JADX INFO: renamed from: y */
    public static final int f40775y = 1;

    /* JADX INFO: renamed from: k */
    private int f40776k;

    /* JADX INFO: renamed from: n */
    private final boolean f40777n;

    /* JADX INFO: renamed from: q */
    private Interpolator f40778q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C7229k f87950toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C7229k f87951zy;

    /* JADX INFO: renamed from: miuix.overscroller.widget.zy$k */
    /* JADX INFO: compiled from: OverScroller.java */
    static class C7229k {

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private static final int f87952a9 = 0;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        static final int f87953d2ok = 2;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private static final float f87954d3 = 0.016f;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        static final int f87955eqxt = 1;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private static final float f87956fn3e = 2000.0f;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private static final int f87957fti = 1;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private static final float f87958fu4 = 0.5f;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private static final float f87959gvn7 = 1.0f;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private static final int f87961jp0y = 2;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private static final float f87963ni7 = 0.35f;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private static final float f87964o1t = 0.175f;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        static final int f87965oc = 0;

        /* JADX INFO: renamed from: t */
        private static final int f40779t = 100;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private static final float f87966wvg = 0.35000002f;

        /* JADX INFO: renamed from: z */
        private static final float f40780z = 1.0f;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private SpringOperator f87968cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private float f87969f7l8;

        /* JADX INFO: renamed from: g */
        private double f40781g;

        /* JADX INFO: renamed from: h */
        private float f40782h;

        /* JADX INFO: renamed from: i */
        private double[] f40783i;

        /* JADX INFO: renamed from: k */
        private Context f40784k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private boolean f87970ki;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f87972ld6;

        /* JADX INFO: renamed from: n */
        private double f40785n;

        /* JADX INFO: renamed from: p */
        private int f40786p;

        /* JADX INFO: renamed from: q */
        private double f40787q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f87974qrj;

        /* JADX INFO: renamed from: s */
        private int f40788s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private double f87975t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private double f87976toq;

        /* JADX INFO: renamed from: y */
        private long f40789y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private double f87978zy;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static float f87967zurt = (float) (Math.log(0.78d) / Math.log(0.9d));

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private static final float[] f87962mcp = new float[101];

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private static final float[] f87960jk = new float[101];

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private float f87973n7h = ViewConfiguration.getScrollFriction();

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private int f87971kja0 = 0;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private boolean f87977x2 = true;

        static {
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12 = 0.0f;
            float f13 = 0.0f;
            for (int i2 = 0; i2 < 100; i2++) {
                float f14 = i2 / 100.0f;
                float f15 = 1.0f;
                while (true) {
                    f2 = 2.0f;
                    f3 = ((f15 - f12) / 2.0f) + f12;
                    f4 = 3.0f;
                    f5 = 1.0f - f3;
                    f6 = f3 * 3.0f * f5;
                    f7 = f3 * f3 * f3;
                    float f16 = (((f5 * f87964o1t) + (f3 * f87966wvg)) * f6) + f7;
                    if (Math.abs(f16 - f14) < 1.0E-5d) {
                        break;
                    } else if (f16 > f14) {
                        f15 = f3;
                    } else {
                        f12 = f3;
                    }
                }
                f87962mcp[i2] = (f6 * ((f5 * 0.5f) + f3)) + f7;
                float f17 = 1.0f;
                while (true) {
                    f8 = ((f17 - f13) / f2) + f13;
                    f9 = 1.0f - f8;
                    f10 = f8 * f4 * f9;
                    f11 = f8 * f8 * f8;
                    float f18 = (((f9 * 0.5f) + f8) * f10) + f11;
                    if (Math.abs(f18 - f14) < 1.0E-5d) {
                        break;
                    }
                    if (f18 > f14) {
                        f17 = f8;
                    } else {
                        f13 = f8;
                    }
                    f2 = 2.0f;
                    f4 = 3.0f;
                }
                f87960jk[i2] = (f10 * ((f9 * f87964o1t) + (f8 * f87966wvg))) + f11;
            }
            float[] fArr = f87962mcp;
            f87960jk[100] = 1.0f;
            fArr[100] = 1.0f;
        }

        C7229k(Context context) {
            this.f40784k = context;
            this.f40782h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        }

        /* JADX INFO: renamed from: c */
        private void m26271c(int i2, int i3, int i4) {
            this.f87977x2 = false;
            this.f87971kja0 = 1;
            double d2 = i2;
            this.f87976toq = d2;
            this.f87978zy = d2;
            this.f40787q = i3;
            int i5 = i2 - i3;
            this.f87969f7l8 = m26274i(i5);
            this.f40785n = -i5;
            this.f87974qrj = Math.abs(i5);
            this.f40788s = (int) (Math.sqrt((((double) i5) * (-2.0d)) / ((double) this.f87969f7l8)) * 1000.0d);
        }

        private void fti() {
            double d2 = this.f40785n;
            float f2 = ((float) d2) * ((float) d2);
            float fAbs = f2 / (Math.abs(this.f87969f7l8) * 2.0f);
            float fSignum = Math.signum((float) this.f40785n);
            int i2 = this.f87974qrj;
            if (fAbs > i2) {
                this.f87969f7l8 = ((-fSignum) * f2) / (i2 * 2.0f);
                fAbs = i2;
            }
            this.f87974qrj = (int) fAbs;
            this.f87971kja0 = 2;
            double d4 = this.f87976toq;
            double d5 = this.f40785n;
            if (d5 <= 0.0d) {
                fAbs = -fAbs;
            }
            this.f40787q = d4 + ((double) ((int) fAbs));
            this.f40788s = -((int) ((d5 * 1000.0d) / ((double) this.f87969f7l8)));
        }

        private double fu4(int i2) {
            double dNi7 = ni7(i2);
            float f2 = f87967zurt;
            return ((double) (this.f87973n7h * this.f40782h)) * Math.exp((((double) f2) / (((double) f2) - 1.0d)) * dNi7);
        }

        /* JADX INFO: renamed from: h */
        private void m26273h(int i2, int i3, int i4) {
            float f2 = this.f87969f7l8;
            float f3 = (-i4) / f2;
            float f4 = i4;
            this.f40789y -= (long) ((int) ((((float) Math.sqrt((((double) ((((f4 * f4) / 2.0f) / Math.abs(f2)) + Math.abs(i3 - i2))) * 2.0d) / ((double) Math.abs(this.f87969f7l8)))) - f3) * 1000.0f));
            double d2 = i3;
            this.f87976toq = d2;
            this.f87978zy = d2;
            this.f40785n = (int) ((-this.f87969f7l8) * r6);
        }

        /* JADX INFO: renamed from: i */
        private static float m26274i(int i2) {
            if (i2 > 0) {
                return -2000.0f;
            }
            return f87956fn3e;
        }

        /* JADX INFO: renamed from: l */
        private void m26275l(int i2, int i3, int i4, int i5) {
            if (i2 > i3 && i2 < i4) {
                Log.e("OverScroller", "startAfterEdge called from a valid position");
                this.f87977x2 = true;
                return;
            }
            boolean z2 = i2 > i4;
            int i6 = z2 ? i4 : i3;
            if ((i2 - i6) * i5 >= 0) {
                n5r1(i2, i6, i5);
            } else if (fu4(i5) > Math.abs(r4)) {
                cdj(i2, i5, z2 ? i3 : i2, z2 ? i2 : i4, this.f87974qrj);
            } else {
                m26271c(i2, i6, i5);
            }
        }

        private void ld6(int i2, int i3, int i4) {
            float fAbs = Math.abs((i4 - i2) / (i3 - i2));
            int i5 = (int) (fAbs * 100.0f);
            if (i5 < 100) {
                float f2 = i5 / 100.0f;
                int i6 = i5 + 1;
                float[] fArr = f87960jk;
                float f3 = fArr[i5];
                this.f40788s = (int) (this.f40788s * (f3 + (((fAbs - f2) / ((i6 / 100.0f) - f2)) * (fArr[i6] - f3))));
            }
        }

        private void n5r1(int i2, int i3, int i4) {
            this.f87969f7l8 = m26274i(i4 == 0 ? i2 - i3 : i4);
            m26273h(i2, i3, i4);
            fti();
        }

        private double ni7(int i2) {
            return Math.log((Math.abs(i2) * f87963ni7) / (this.f87973n7h * this.f40782h));
        }

        /* JADX INFO: renamed from: z */
        private int m26281z(int i2) {
            return (int) (Math.exp(ni7(i2) / (((double) f87967zurt) - 1.0d)) * 1000.0d);
        }

        void a9(int i2, int i3, int i4) {
            if (this.f87971kja0 == 0) {
                this.f87974qrj = i4;
                this.f40789y = AnimationUtils.currentAnimationTimeMillis();
                m26275l(i2, i3, i3, (int) this.f40781g);
            }
        }

        void cdj(int i2, int i3, int i4, int i5, int i6) {
            this.f87974qrj = i6;
            this.f87977x2 = false;
            double d2 = i3;
            this.f40785n = d2;
            this.f40781g = d2;
            this.f40786p = 0;
            this.f40788s = 0;
            this.f40789y = AnimationUtils.currentAnimationTimeMillis();
            double d4 = i2;
            this.f87976toq = d4;
            this.f87978zy = d4;
            if (i2 > i5 || i2 < i4) {
                m26275l(i2, i4, i5, i3);
                return;
            }
            this.f87971kja0 = 0;
            double dFu4 = 0.0d;
            if (i3 != 0) {
                int iM26281z = m26281z(i3);
                this.f40786p = iM26281z;
                this.f40788s = iM26281z;
                dFu4 = fu4(i3);
            }
            int iSignum = (int) (dFu4 * ((double) Math.signum(i3)));
            this.f87972ld6 = iSignum;
            double d5 = i2 + iSignum;
            this.f40787q = d5;
            double d6 = i4;
            if (d5 < d6) {
                ld6((int) this.f87976toq, (int) d5, i4);
                this.f40787q = d6;
            }
            double d7 = this.f40787q;
            double d8 = i5;
            if (d7 > d8) {
                ld6((int) this.f87976toq, (int) d7, i5);
                this.f40787q = d8;
            }
        }

        final void d2ok(boolean z2) {
            this.f87977x2 = z2;
        }

        final void d3(int i2) {
            this.f40788s = i2;
        }

        final void dd(long j2) {
            this.f40789y = j2;
        }

        void eqxt(int i2) {
            this.f40787q = i2;
            this.f87977x2 = false;
        }

        /* JADX INFO: renamed from: f */
        void m26282f(float f2, int i2, int i3) {
            this.f87977x2 = false;
            this.f87970ki = false;
            x9kr(0);
            double d2 = f2;
            this.f87975t8r = d2;
            this.f87976toq = d2;
            this.f87978zy = d2;
            this.f40787q = f2 + i2;
            this.f40789y = AnimationUtils.currentAnimationTimeMillis();
            double d4 = i3;
            this.f40785n = d4;
            this.f40781g = d4;
            SpringOperator springOperator = new SpringOperator();
            this.f87968cdj = springOperator;
            double[] dArr = new double[2];
            this.f40783i = dArr;
            springOperator.getParameters(new float[]{0.99f, 0.4f}, dArr);
        }

        final int fn3e() {
            return this.f40788s;
        }

        final void gvn7(int i2) {
            this.f87978zy = i2;
        }

        void hyr(int i2, int i3, int i4) {
            this.f87977x2 = false;
            double d2 = i2;
            this.f87976toq = d2;
            this.f87978zy = d2;
            this.f40787q = i2 + i3;
            this.f40789y = AnimationUtils.currentAnimationTimeMillis();
            this.f40788s = i4;
            this.f87969f7l8 = 0.0f;
            this.f40785n = 0.0d;
        }

        final boolean jk() {
            return this.f87977x2;
        }

        final void jp0y(float f2) {
            this.f40781g = f2;
        }

        final float ki() {
            return (float) this.f40781g;
        }

        void kja0() {
            this.f87978zy = this.f40787q;
            this.f87977x2 = true;
        }

        boolean lrht() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f40789y;
            if (jCurrentAnimationTimeMillis == 0) {
                return this.f40788s > 0;
            }
            int i2 = this.f40788s;
            if (jCurrentAnimationTimeMillis > i2) {
                return false;
            }
            double d2 = 0.0d;
            int i3 = this.f87971kja0;
            if (i3 == 0) {
                float f2 = jCurrentAnimationTimeMillis / this.f40786p;
                int i4 = (int) (f2 * 100.0f);
                float f3 = 1.0f;
                float f4 = 0.0f;
                if (i4 < 100) {
                    float f5 = i4 / 100.0f;
                    int i5 = i4 + 1;
                    float[] fArr = f87962mcp;
                    float f6 = fArr[i4];
                    f4 = (fArr[i5] - f6) / ((i5 / 100.0f) - f5);
                    f3 = f6 + ((f2 - f5) * f4);
                }
                int i6 = this.f87972ld6;
                this.f40781g = ((f4 * i6) / r1) * 1000.0f;
                d2 = f3 * i6;
            } else if (i3 == 1) {
                float f7 = jCurrentAnimationTimeMillis / i2;
                float f8 = f7 * f7;
                float fSignum = Math.signum((float) this.f40785n);
                d2 = this.f87974qrj * fSignum * ((3.0f * f8) - ((2.0f * f7) * f8));
                this.f40781g = fSignum * r3 * 6.0f * ((-f7) + f8);
            } else if (i3 == 2) {
                float f9 = jCurrentAnimationTimeMillis / 1000.0f;
                double d4 = this.f40785n;
                float f10 = this.f87969f7l8;
                this.f40781g = ((double) (f10 * f9)) + d4;
                d2 = ((double) (((f10 * f9) * f9) / 2.0f)) + (d4 * ((double) f9));
            }
            this.f87978zy = this.f87976toq + ((double) ((int) Math.round(d2)));
            return true;
        }

        void lvui(float f2) {
            this.f87973n7h = f2;
        }

        boolean mcp(double d2, double d4) {
            return Math.abs(d2 - d4) < 1.0d;
        }

        void n7h(int i2) {
            this.f40788s = ((int) (AnimationUtils.currentAnimationTimeMillis() - this.f40789y)) + i2;
            this.f87977x2 = false;
        }

        boolean ncyb(int i2, int i3, int i4) {
            this.f87977x2 = true;
            double d2 = i2;
            this.f40787q = d2;
            this.f87976toq = d2;
            this.f87978zy = d2;
            this.f40785n = 0.0d;
            this.f40789y = AnimationUtils.currentAnimationTimeMillis();
            this.f40788s = 0;
            if (i2 < i3) {
                m26271c(i2, i3, 0);
            } else if (i2 > i4) {
                m26271c(i2, i4, 0);
            }
            return !this.f87977x2;
        }

        final int o1t() {
            return (int) this.f87976toq;
        }

        final void oc(int i2) {
            this.f40787q = i2;
        }

        boolean qrj() {
            int i2 = this.f87971kja0;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                if (i2 == 2) {
                    this.f40789y += (long) this.f40788s;
                    m26271c((int) this.f40787q, (int) this.f87976toq, 0);
                }
            } else {
                if (this.f40788s >= this.f40786p) {
                    return false;
                }
                double d2 = this.f40787q;
                this.f87976toq = d2;
                this.f87978zy = d2;
                double d4 = (int) this.f40781g;
                this.f40785n = d4;
                this.f87969f7l8 = m26274i((int) d4);
                this.f40789y += (long) this.f40788s;
                fti();
            }
            lrht();
            return true;
        }

        /* JADX INFO: renamed from: r */
        final void m26283r(int i2) {
            this.f87976toq = i2;
        }

        /* JADX INFO: renamed from: t */
        final int m26284t() {
            return this.f87971kja0;
        }

        final int t8r() {
            return (int) this.f87978zy;
        }

        void uv6(float f2) {
            this.f87978zy = this.f87976toq + Math.round(((double) f2) * (this.f40787q - r0));
        }

        final long wvg() {
            return this.f40789y;
        }

        boolean x2() {
            if (this.f87968cdj == null || this.f87977x2) {
                return false;
            }
            if (this.f87970ki) {
                this.f87977x2 = true;
                this.f87978zy = this.f40787q;
                return true;
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            double dMin = Math.min((jCurrentAnimationTimeMillis - this.f40789y) / 1000.0f, 0.01600000075995922d);
            double d2 = dMin != 0.0d ? dMin : 0.01600000075995922d;
            this.f40789y = jCurrentAnimationTimeMillis;
            SpringOperator springOperator = this.f87968cdj;
            double d4 = this.f40781g;
            double[] dArr = this.f40783i;
            double dUpdateVelocity = springOperator.updateVelocity(d4, dArr[0], dArr[1], d2, this.f40787q, this.f87976toq);
            double d5 = this.f87976toq + (d2 * dUpdateVelocity);
            this.f87978zy = d5;
            this.f40781g = dUpdateVelocity;
            if (mcp(d5, this.f40787q)) {
                this.f87970ki = true;
            } else {
                this.f87976toq = this.f87978zy;
            }
            return true;
        }

        final void x9kr(int i2) {
            this.f87971kja0 = i2;
        }

        final int zurt() {
            return (int) this.f40787q;
        }
    }

    /* JADX INFO: compiled from: OverScroller.java */
    static class toq implements Interpolator {

        /* JADX INFO: renamed from: k */
        private static final float f40790k = 8.0f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final float f87979toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final float f87980zy;

        static {
            float fM26285k = 1.0f / m26285k(1.0f);
            f87979toq = fM26285k;
            f87980zy = 1.0f - (fM26285k * m26285k(1.0f));
        }

        toq() {
        }

        /* JADX INFO: renamed from: k */
        private static float m26285k(float f2) {
            float f3 = f2 * 8.0f;
            return f3 < 1.0f ? f3 - (1.0f - ((float) Math.exp(-f3))) : ((1.0f - ((float) Math.exp(1.0f - f3))) * 0.63212055f) + 0.36787945f;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float fM26285k = f87979toq * m26285k(f2);
            return fM26285k > 0.0f ? fM26285k + f87980zy : fM26285k;
        }
    }

    public zy(Context context) {
        this(context, null);
    }

    private void fu4(C7229k c7229k) {
        c7229k.m26283r(0);
        c7229k.oc(0);
        c7229k.gvn7(0);
    }

    public void a9(int i2, int i3, int i4, int i5, int i6) {
        this.f40776k = 0;
        this.f87950toq.hyr(i2, i4, i6);
        this.f87951zy.hyr(i3, i5, i6);
    }

    public final int cdj() {
        return (int) this.f87951zy.f87976toq;
    }

    public float f7l8() {
        return (float) Math.hypot(this.f87950toq.f40781g, this.f87951zy.f40781g);
    }

    public void fn3e(int i2, int i3, int i4) {
        this.f87950toq.a9(i2, i3, i4);
    }

    public void fti(int i2, int i3, int i4, int i5) {
        jp0y(i2, i3, i4, i5, 0, 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m26260g(boolean z2) {
        this.f87950toq.f87977x2 = this.f87951zy.f87977x2 = z2;
    }

    public int gvn7() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - Math.min(this.f87950toq.f40789y, this.f87951zy.f40789y));
    }

    /* JADX INFO: renamed from: h */
    public final int m26261h() {
        return (int) this.f87950toq.f87976toq;
    }

    /* JADX INFO: renamed from: i */
    public boolean m26262i(float f2, float f3) {
        return !ki() && Math.signum(f2) == Math.signum((float) (((int) this.f87950toq.f40787q) - ((int) this.f87950toq.f87976toq))) && Math.signum(f3) == Math.signum((float) (((int) this.f87951zy.f40787q) - ((int) this.f87951zy.f87976toq)));
    }

    public void jk(int i2, int i3, int i4, int i5) {
        a9(i2, i3, i4, i5, 250);
    }

    public void jp0y(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f40776k = 2;
        this.f87950toq.m26282f(i2, i4, i6);
        this.f87951zy.m26282f(i3, i5, i7);
    }

    /* JADX INFO: renamed from: k */
    public void m26263k() {
        this.f87950toq.kja0();
        this.f87951zy.kja0();
    }

    public final boolean ki() {
        return this.f87950toq.f87977x2 && this.f87951zy.f87977x2;
    }

    public int kja0() {
        return this.f40776k;
    }

    public final int ld6() {
        return (int) this.f87951zy.f87978zy;
    }

    public boolean mcp(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f40776k = 1;
        return this.f87950toq.ncyb(i2, i4, i5) || this.f87951zy.ncyb(i3, i6, i7);
    }

    /* JADX INFO: renamed from: n */
    public void m26264n(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f40777n && !ki()) {
            float f2 = (float) this.f87950toq.f40781g;
            float f3 = (float) this.f87951zy.f40781g;
            i12 = i4;
            float f4 = i12;
            if (Math.signum(f4) == Math.signum(f2)) {
                i13 = i5;
                float f5 = i13;
                if (Math.signum(f5) == Math.signum(f3)) {
                    i14 = (int) (f5 + f3);
                    i15 = (int) (f4 + f2);
                }
                this.f40776k = 1;
                this.f87950toq.cdj(i2, i15, i6, i7, i10);
                this.f87951zy.cdj(i3, i14, i8, i9, i11);
            }
            i14 = i13;
            i15 = i12;
            this.f40776k = 1;
            this.f87950toq.cdj(i2, i15, i6, i7, i10);
            this.f87951zy.cdj(i3, i14, i8, i9, i11);
        }
        i12 = i4;
        i13 = i5;
        i14 = i13;
        i15 = i12;
        this.f40776k = 1;
        this.f87950toq.cdj(i2, i15, i6, i7, i10);
        this.f87951zy.cdj(i3, i14, i8, i9, i11);
    }

    public final int n7h() {
        return (int) this.f87951zy.f40787q;
    }

    public final void ni7() {
        fu4(this.f87950toq);
        fu4(this.f87951zy);
    }

    @Deprecated
    public void o1t(int i2) {
        this.f87951zy.eqxt(i2);
    }

    /* JADX INFO: renamed from: p */
    public final int m26265p() {
        return (int) this.f87950toq.f87978zy;
    }

    /* JADX INFO: renamed from: q */
    public void m26266q(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        m26264n(i2, i3, i4, i5, i6, i7, i8, i9, 0, 0);
    }

    public final int qrj() {
        return (int) this.f87950toq.f40787q;
    }

    /* JADX INFO: renamed from: s */
    public float m26267s() {
        return (float) this.f87951zy.f40781g;
    }

    /* JADX INFO: renamed from: t */
    void m26268t(Interpolator interpolator) {
        if (interpolator == null) {
            this.f40778q = new toq();
        } else {
            this.f40778q = interpolator;
        }
    }

    public boolean t8r() {
        return ((this.f87950toq.f87977x2 || this.f87950toq.f87971kja0 == 0) && (this.f87951zy.f87977x2 || this.f87951zy.f87971kja0 == 0)) ? false : true;
    }

    public boolean toq() {
        if (ki()) {
            return false;
        }
        int i2 = this.f40776k;
        if (i2 == 0) {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - this.f87950toq.f40789y;
            int i3 = this.f87950toq.f40788s;
            if (jCurrentAnimationTimeMillis < i3) {
                float interpolation = this.f40778q.getInterpolation(jCurrentAnimationTimeMillis / i3);
                this.f87950toq.uv6(interpolation);
                this.f87951zy.uv6(interpolation);
            } else {
                m26263k();
            }
        } else if (i2 == 1) {
            if (!this.f87950toq.f87977x2 && !this.f87950toq.lrht() && !this.f87950toq.qrj()) {
                this.f87950toq.kja0();
            }
            if (!this.f87951zy.f87977x2 && !this.f87951zy.lrht() && !this.f87951zy.qrj()) {
                this.f87951zy.kja0();
            }
        } else if (i2 == 2) {
            return this.f87951zy.x2() || this.f87950toq.x2();
        }
        return true;
    }

    public final void wvg(float f2) {
        this.f87950toq.lvui(f2);
        this.f87951zy.lvui(f2);
    }

    @Deprecated
    public final int x2() {
        return Math.max(this.f87950toq.f40788s, this.f87951zy.f40788s);
    }

    /* JADX INFO: renamed from: y */
    public float m26269y() {
        return (float) this.f87950toq.f40781g;
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public void m26270z(int i2) {
        this.f87950toq.eqxt(i2);
    }

    public void zurt(int i2, int i3, int i4) {
        this.f87951zy.a9(i2, i3, i4);
    }

    @Deprecated
    public void zy(int i2) {
        this.f87950toq.n7h(i2);
        this.f87951zy.n7h(i2);
    }

    public zy(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public zy(Context context, Interpolator interpolator, boolean z2) {
        if (interpolator == null) {
            this.f40778q = new toq();
        } else {
            this.f40778q = interpolator;
        }
        this.f40777n = z2;
        this.f87950toq = new C7228k(context);
        this.f87951zy = new C7228k(context);
    }

    @Deprecated
    public zy(Context context, Interpolator interpolator, float f2, float f3) {
        this(context, interpolator, true);
    }

    @Deprecated
    public zy(Context context, Interpolator interpolator, float f2, float f3, boolean z2) {
        this(context, interpolator, z2);
    }
}
