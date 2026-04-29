package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.core.widgets.C0339g;
import androidx.constraintlayout.core.widgets.C0340k;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import androidx.constraintlayout.core.widgets.C0343q;
import androidx.constraintlayout.core.widgets.C0345y;
import androidx.constraintlayout.core.widgets.InterfaceC0344s;
import androidx.constraintlayout.motion.utils.C0351n;
import androidx.constraintlayout.motion.widget.t8r;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.C0397q;
import androidx.constraintlayout.widget.C0399y;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.core.view.gvn7;
import androidx.exifinterface.media.C0846k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class MotionLayout extends ConstraintLayout implements gvn7 {
    public static final int a1 = 3;
    public static final int a62w = 2;
    private static final boolean ao6 = false;
    public static final int b9 = 6;
    public static final int br = 7;
    public static final int cr = 0;
    public static boolean faqz = false;
    public static final int ilvb = 0;
    public static final int kybi = 1;
    public static final int n1u4 = 4;
    public static final int nze = 2;
    static final int o9 = 50;
    public static final int o917 = 3;
    static final String ph90 = "MotionLayout";
    public static final int rt0p = 1;
    public static final int s3 = 5;
    public static final int svt = 0;
    private static final float vfa = 1.0E-5f;
    public static final int vh6m = 1;
    public static final int w0an = 2;
    float a7kc;
    private int ac;
    private int ad;
    boolean afw;
    private float aj;
    private boolean am;
    private long ar;
    Interpolator as;
    int ax;
    HashMap<View, kja0> ay;
    float az;
    private int ba;
    float bc;
    boolean bd;
    private long be;
    Interpolator bg;
    t8r bl;
    private int bq;
    float bs;
    int bsb;
    private boolean bu;
    private boolean cecm;
    int cw14;
    long d1cy;
    private Matrix deb;
    private boolean dy;
    int eht;
    private ArrayList<MotionHelper> ei;
    int fn2;
    private int[] gjxq;
    private Runnable h06;
    int hp;
    float k0;
    private C0360g k6e;
    private androidx.constraintlayout.core.motion.utils.f7l8 k84;
    private ld6 kdv1;
    private boolean l2jk;
    private int lr4;
    private int ls9;
    int lw58;
    int mjvl;
    int n5ij;
    float ndjo;
    int nq0z;
    protected boolean oyp;
    private int p2c;
    HashMap<View, C0351n> q09;
    float q7k9;
    private View qnoq;
    private float qns;
    int r7v2;
    boolean s8y;
    f7l8 sk1t;
    private RectF smyf;
    private float tgs;
    boolean th6;
    boolean tlhn;
    ArrayList<Integer> u6;
    private int ule;
    int us2t;
    private long ut;
    Rect v3;
    qrj v62;
    private androidx.constraintlayout.motion.utils.toq vb6;
    C0366y vl4;
    private boolean w7wd;
    private x2 w97r;
    private float wh6;
    private ArrayList<MotionHelper> wra;
    private CopyOnWriteArrayList<x2> xhv;
    private C0376q xk5;
    float xqx;
    int xy8;
    private boolean yf;
    private float yl25;
    private int zm;
    int zmmu;
    private boolean zr5t;
    private ArrayList<MotionHelper> zsl;

    private class f7l8 {

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private static final int f48016zurt = 16;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        int f48017cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        Paint f48018f7l8;

        /* JADX INFO: renamed from: g */
        Paint f2191g;

        /* JADX INFO: renamed from: h */
        DashPathEffect f2192h;

        /* JADX INFO: renamed from: i */
        int f2193i;

        /* JADX INFO: renamed from: k */
        float[] f2194k;

        /* JADX INFO: renamed from: n */
        Paint f2195n;

        /* JADX INFO: renamed from: p */
        private float[] f2196p;

        /* JADX INFO: renamed from: q */
        Path f2197q;

        /* JADX INFO: renamed from: s */
        Paint f2198s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int[] f48026toq;

        /* JADX INFO: renamed from: y */
        Paint f2199y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float[] f48028zy;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        final int f48022ld6 = -21965;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        final int f48027x2 = -2067046;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        final int f48024qrj = -13391360;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        final int f48023n7h = 1996488704;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        final int f48021kja0 = 10;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        Rect f48020ki = new Rect();

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        boolean f48025t8r = false;

        public f7l8() {
            this.f2193i = 1;
            Paint paint = new Paint();
            this.f2195n = paint;
            paint.setAntiAlias(true);
            this.f2195n.setColor(-21965);
            this.f2195n.setStrokeWidth(2.0f);
            this.f2195n.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f2191g = paint2;
            paint2.setAntiAlias(true);
            this.f2191g.setColor(-2067046);
            this.f2191g.setStrokeWidth(2.0f);
            this.f2191g.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f48018f7l8 = paint3;
            paint3.setAntiAlias(true);
            this.f48018f7l8.setColor(-13391360);
            this.f48018f7l8.setStrokeWidth(2.0f);
            this.f48018f7l8.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f2199y = paint4;
            paint4.setAntiAlias(true);
            this.f2199y.setColor(-13391360);
            this.f2199y.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f2196p = new float[8];
            Paint paint5 = new Paint();
            this.f2198s = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.f2192h = dashPathEffect;
            this.f48018f7l8.setPathEffect(dashPathEffect);
            this.f48028zy = new float[100];
            this.f48026toq = new int[50];
            if (this.f48025t8r) {
                this.f2195n.setStrokeWidth(8.0f);
                this.f2198s.setStrokeWidth(8.0f);
                this.f2191g.setStrokeWidth(8.0f);
                this.f2193i = 4;
            }
        }

        private void f7l8(Canvas canvas) {
            float[] fArr = this.f2194k;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f48018f7l8);
        }

        /* JADX INFO: renamed from: g */
        private void m1400g(Canvas canvas, float x3, float y3) {
            float[] fArr = this.f2194k;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            float fMin = Math.min(f2, f4);
            float fMax = Math.max(f3, f5);
            float fMin2 = x3 - Math.min(f2, f4);
            float fMax2 = Math.max(f3, f5) - y3;
            String str = "" + (((int) (((double) ((fMin2 * 100.0f) / Math.abs(f4 - f2))) + 0.5d)) / 100.0f);
            qrj(str, this.f2199y);
            canvas.drawText(str, ((fMin2 / 2.0f) - (this.f48020ki.width() / 2)) + fMin, y3 - 20.0f, this.f2199y);
            canvas.drawLine(x3, y3, Math.min(f2, f4), y3, this.f48018f7l8);
            String str2 = "" + (((int) (((double) ((fMax2 * 100.0f) / Math.abs(f5 - f3))) + 0.5d)) / 100.0f);
            qrj(str2, this.f2199y);
            canvas.drawText(str2, x3 + 5.0f, fMax - ((fMax2 / 2.0f) - (this.f48020ki.height() / 2)), this.f2199y);
            canvas.drawLine(x3, y3, x3, Math.max(f3, f5), this.f48018f7l8);
        }

        private void ld6(Canvas canvas, int mode, int keyFrames, kja0 motionController) {
            int width;
            int height;
            float f2;
            float f3;
            View view = motionController.f48161toq;
            if (view != null) {
                width = view.getWidth();
                height = motionController.f48161toq.getHeight();
            } else {
                width = 0;
                height = 0;
            }
            for (int i2 = 1; i2 < keyFrames - 1; i2++) {
                if (mode != 4 || this.f48026toq[i2 - 1] != 0) {
                    float[] fArr = this.f48028zy;
                    int i3 = i2 * 2;
                    float f4 = fArr[i3];
                    float f5 = fArr[i3 + 1];
                    this.f2197q.reset();
                    this.f2197q.moveTo(f4, f5 + 10.0f);
                    this.f2197q.lineTo(f4 + 10.0f, f5);
                    this.f2197q.lineTo(f4, f5 - 10.0f);
                    this.f2197q.lineTo(f4 - 10.0f, f5);
                    this.f2197q.close();
                    int i4 = i2 - 1;
                    motionController.ni7(i4);
                    if (mode == 4) {
                        int i5 = this.f48026toq[i4];
                        if (i5 == 1) {
                            m1405y(canvas, f4 - 0.0f, f5 - 0.0f);
                        } else if (i5 == 0) {
                            m1400g(canvas, f4 - 0.0f, f5 - 0.0f);
                        } else {
                            if (i5 == 2) {
                                f2 = f5;
                                f3 = f4;
                                m1404s(canvas, f4 - 0.0f, f5 - 0.0f, width, height);
                            }
                            canvas.drawPath(this.f2197q, this.f2198s);
                        }
                        f2 = f5;
                        f3 = f4;
                        canvas.drawPath(this.f2197q, this.f2198s);
                    } else {
                        f2 = f5;
                        f3 = f4;
                    }
                    if (mode == 2) {
                        m1405y(canvas, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (mode == 3) {
                        m1400g(canvas, f3 - 0.0f, f2 - 0.0f);
                    }
                    if (mode == 6) {
                        m1404s(canvas, f3 - 0.0f, f2 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.f2197q, this.f2198s);
                }
            }
            float[] fArr2 = this.f2194k;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f2191g);
                float[] fArr3 = this.f2194k;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f2191g);
            }
        }

        /* JADX INFO: renamed from: n */
        private void m1401n(Canvas canvas) {
            float[] fArr = this.f2194k;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f2, f4), Math.max(f3, f5), Math.max(f2, f4), Math.max(f3, f5), this.f48018f7l8);
            canvas.drawLine(Math.min(f2, f4), Math.min(f3, f5), Math.min(f2, f4), Math.max(f3, f5), this.f48018f7l8);
        }

        /* JADX INFO: renamed from: p */
        private void m1402p(Canvas canvas, kja0 motionController) {
            this.f2197q.reset();
            for (int i2 = 0; i2 <= 50; i2++) {
                motionController.f7l8(i2 / 50, this.f2196p, 0);
                Path path = this.f2197q;
                float[] fArr = this.f2196p;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f2197q;
                float[] fArr2 = this.f2196p;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f2197q;
                float[] fArr3 = this.f2196p;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f2197q;
                float[] fArr4 = this.f2196p;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f2197q.close();
            }
            this.f2195n.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.f2197q, this.f2195n);
            canvas.translate(-2.0f, -2.0f);
            this.f2195n.setColor(-65536);
            canvas.drawPath(this.f2197q, this.f2195n);
        }

        /* JADX INFO: renamed from: q */
        private void m1403q(Canvas canvas) {
            boolean z2 = false;
            boolean z3 = false;
            for (int i2 = 0; i2 < this.f48017cdj; i2++) {
                int i3 = this.f48026toq[i2];
                if (i3 == 1) {
                    z2 = true;
                }
                if (i3 == 0) {
                    z3 = true;
                }
            }
            if (z2) {
                f7l8(canvas);
            }
            if (z3) {
                m1401n(canvas);
            }
        }

        /* JADX INFO: renamed from: s */
        private void m1404s(Canvas canvas, float x3, float y3, int viewWidth, int viewHeight) {
            String str = "" + (((int) (((double) (((x3 - (viewWidth / 2)) * 100.0f) / (MotionLayout.this.getWidth() - viewWidth))) + 0.5d)) / 100.0f);
            qrj(str, this.f2199y);
            canvas.drawText(str, ((x3 / 2.0f) - (this.f48020ki.width() / 2)) + 0.0f, y3 - 20.0f, this.f2199y);
            canvas.drawLine(x3, y3, Math.min(0.0f, 1.0f), y3, this.f48018f7l8);
            String str2 = "" + (((int) (((double) (((y3 - (viewHeight / 2)) * 100.0f) / (MotionLayout.this.getHeight() - viewHeight))) + 0.5d)) / 100.0f);
            qrj(str2, this.f2199y);
            canvas.drawText(str2, x3 + 5.0f, 0.0f - ((y3 / 2.0f) - (this.f48020ki.height() / 2)), this.f2199y);
            canvas.drawLine(x3, y3, x3, Math.max(0.0f, 1.0f), this.f48018f7l8);
        }

        private void x2(Canvas canvas, float x1, float y1, float x22, float y22) {
            canvas.drawRect(x1, y1, x22, y22, this.f48018f7l8);
            canvas.drawLine(x1, y1, x22, y22, this.f48018f7l8);
        }

        /* JADX INFO: renamed from: y */
        private void m1405y(Canvas canvas, float x3, float y3) {
            float[] fArr = this.f2194k;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[fArr.length - 2];
            float f5 = fArr[fArr.length - 1];
            float fHypot = (float) Math.hypot(f2 - f4, f3 - f5);
            float f6 = f4 - f2;
            float f7 = f5 - f3;
            float f8 = (((x3 - f2) * f6) + ((y3 - f3) * f7)) / (fHypot * fHypot);
            float f9 = f2 + (f6 * f8);
            float f10 = f3 + (f8 * f7);
            Path path = new Path();
            path.moveTo(x3, y3);
            path.lineTo(f9, f10);
            float fHypot2 = (float) Math.hypot(f9 - x3, f10 - y3);
            String str = "" + (((int) ((fHypot2 * 100.0f) / fHypot)) / 100.0f);
            qrj(str, this.f2199y);
            canvas.drawTextOnPath(str, path, (fHypot2 / 2.0f) - (this.f48020ki.width() / 2), -20.0f, this.f2199y);
            canvas.drawLine(x3, y3, f9, f10, this.f48018f7l8);
        }

        private void zy(Canvas canvas) {
            canvas.drawLines(this.f2194k, this.f2195n);
        }

        /* JADX INFO: renamed from: k */
        public void m1406k(Canvas canvas, HashMap<View, kja0> frameArrayList, int duration, int debugPath) {
            if (frameArrayList == null || frameArrayList.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (debugPath & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.bq) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.f2199y);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.f2195n);
            }
            for (kja0 kja0Var : frameArrayList.values()) {
                int iCdj = kja0Var.cdj();
                if (debugPath > 0 && iCdj == 0) {
                    iCdj = 1;
                }
                if (iCdj != 0) {
                    this.f48017cdj = kja0Var.m1474n(this.f48028zy, this.f48026toq);
                    if (iCdj >= 1) {
                        int i2 = duration / 16;
                        float[] fArr = this.f2194k;
                        if (fArr == null || fArr.length != i2 * 2) {
                            this.f2194k = new float[i2 * 2];
                            this.f2197q = new Path();
                        }
                        int i3 = this.f2193i;
                        canvas.translate(i3, i3);
                        this.f2195n.setColor(1996488704);
                        this.f2198s.setColor(1996488704);
                        this.f2191g.setColor(1996488704);
                        this.f48018f7l8.setColor(1996488704);
                        kja0Var.m1469g(this.f2194k, i2);
                        toq(canvas, iCdj, this.f48017cdj, kja0Var);
                        this.f2195n.setColor(-21965);
                        this.f2191g.setColor(-2067046);
                        this.f2198s.setColor(-2067046);
                        this.f48018f7l8.setColor(-13391360);
                        int i4 = this.f2193i;
                        canvas.translate(-i4, -i4);
                        toq(canvas, iCdj, this.f48017cdj, kja0Var);
                        if (iCdj == 5) {
                            m1402p(canvas, kja0Var);
                        }
                    }
                }
            }
            canvas.restore();
        }

        void qrj(String text, Paint paint) {
            paint.getTextBounds(text, 0, text.length(), this.f48020ki);
        }

        public void toq(Canvas canvas, int mode, int keyFrames, kja0 motionController) {
            if (mode == 4) {
                m1403q(canvas);
            }
            if (mode == 2) {
                f7l8(canvas);
            }
            if (mode == 3) {
                m1401n(canvas);
            }
            zy(canvas);
            ld6(canvas, mode, keyFrames, motionController);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$g */
    class C0360g extends cdj {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f48030zy;

        /* JADX INFO: renamed from: k */
        float f2200k = 0.0f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f48029toq = 0.0f;

        C0360g() {
        }

        @Override // androidx.constraintlayout.motion.widget.cdj, android.animation.TimeInterpolator
        public float getInterpolation(float time) {
            float f2;
            float f3;
            float f4 = this.f2200k;
            if (f4 > 0.0f) {
                float f5 = this.f48030zy;
                if (f4 / f5 < time) {
                    time = f4 / f5;
                }
                MotionLayout.this.az = f4 - (f5 * time);
                f2 = (f4 * time) - (((f5 * time) * time) / 2.0f);
                f3 = this.f48029toq;
            } else {
                float f6 = this.f48030zy;
                if ((-f4) / f6 < time) {
                    time = (-f4) / f6;
                }
                MotionLayout.this.az = (f6 * time) + f4;
                f2 = (f4 * time) + (((f6 * time) * time) / 2.0f);
                f3 = this.f48029toq;
            }
            return f2 + f3;
        }

        @Override // androidx.constraintlayout.motion.widget.cdj
        /* JADX INFO: renamed from: k */
        public float mo1382k() {
            return MotionLayout.this.az;
        }

        public void toq(float velocity, float position, float maxAcceleration) {
            this.f2200k = velocity;
            this.f48029toq = position;
            this.f48030zy = maxAcceleration;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$k */
    class RunnableC0361k implements Runnable {
        RunnableC0361k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.kdv1.m1408k();
        }
    }

    class ld6 {

        /* JADX INFO: renamed from: k */
        float f2204k = Float.NaN;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f48032toq = Float.NaN;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f48033zy = -1;

        /* JADX INFO: renamed from: q */
        int f2206q = -1;

        /* JADX INFO: renamed from: n */
        final String f2205n = "motion.progress";

        /* JADX INFO: renamed from: g */
        final String f2203g = "motion.velocity";

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final String f48031f7l8 = "motion.StartState";

        /* JADX INFO: renamed from: y */
        final String f2208y = "motion.EndState";

        ld6() {
        }

        public void f7l8(Bundle bundle) {
            this.f2204k = bundle.getFloat("motion.progress");
            this.f48032toq = bundle.getFloat("motion.velocity");
            this.f48033zy = bundle.getInt("motion.StartState");
            this.f2206q = bundle.getInt("motion.EndState");
        }

        /* JADX INFO: renamed from: g */
        public void m1407g(int startState) {
            this.f48033zy = startState;
        }

        /* JADX INFO: renamed from: k */
        void m1408k() {
            int i2 = this.f48033zy;
            if (i2 != -1 || this.f2206q != -1) {
                if (i2 == -1) {
                    MotionLayout.this.ebn(this.f2206q);
                } else {
                    int i3 = this.f2206q;
                    if (i3 == -1) {
                        MotionLayout.this.setState(i2, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i2, i3);
                    }
                }
                MotionLayout.this.setState(qrj.SETUP);
            }
            if (Float.isNaN(this.f48032toq)) {
                if (Float.isNaN(this.f2204k)) {
                    return;
                }
                MotionLayout.this.setProgress(this.f2204k);
            } else {
                MotionLayout.this.setProgress(this.f2204k, this.f48032toq);
                this.f2204k = Float.NaN;
                this.f48032toq = Float.NaN;
                this.f48033zy = -1;
                this.f2206q = -1;
            }
        }

        /* JADX INFO: renamed from: n */
        public void m1409n(float progress) {
            this.f2204k = progress;
        }

        /* JADX INFO: renamed from: q */
        public void m1410q(int endState) {
            this.f2206q = endState;
        }

        public Bundle toq() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2204k);
            bundle.putFloat("motion.velocity", this.f48032toq);
            bundle.putInt("motion.StartState", this.f48033zy);
            bundle.putInt("motion.EndState", this.f2206q);
            return bundle;
        }

        /* JADX INFO: renamed from: y */
        public void m1411y(float mVelocity) {
            this.f48032toq = mVelocity;
        }

        public void zy() {
            this.f2206q = MotionLayout.this.bq;
            this.f48033zy = MotionLayout.this.ba;
            this.f48032toq = MotionLayout.this.getVelocity();
            this.f2204k = MotionLayout.this.getProgress();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$n */
    static /* synthetic */ class C0362n {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f2209k;

        static {
            int[] iArr = new int[qrj.values().length];
            f2209k = iArr;
            try {
                iArr[qrj.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2209k[qrj.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2209k[qrj.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2209k[qrj.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$p */
    private static class C0363p implements InterfaceC0365s {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static C0363p f48034toq = new C0363p();

        /* JADX INFO: renamed from: k */
        VelocityTracker f2210k;

        private C0363p() {
        }

        /* JADX INFO: renamed from: k */
        public static C0363p m1412k() {
            f48034toq.f2210k = VelocityTracker.obtain();
            return f48034toq;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        public void clear() {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        public void f7l8(int units, float maxVelocity) {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units, maxVelocity);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        /* JADX INFO: renamed from: g */
        public float mo1413g() {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        /* JADX INFO: renamed from: n */
        public float mo1414n() {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        /* JADX INFO: renamed from: q */
        public void mo1415q(MotionEvent event) {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        /* JADX INFO: renamed from: s */
        public void mo1416s(int units) {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(units);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        public void toq() {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2210k = null;
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        /* JADX INFO: renamed from: y */
        public float mo1417y(int id) {
            VelocityTracker velocityTracker = this.f2210k;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(id);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0365s
        public float zy(int id) {
            if (this.f2210k != null) {
                return zy(id);
            }
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$q */
    class RunnableC0364q implements Runnable {
        RunnableC0364q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.kdv1.m1408k();
        }
    }

    enum qrj {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$s */
    protected interface InterfaceC0365s {
        void clear();

        void f7l8(int units, float maxVelocity);

        /* JADX INFO: renamed from: g */
        float mo1413g();

        /* JADX INFO: renamed from: n */
        float mo1414n();

        /* JADX INFO: renamed from: q */
        void mo1415q(MotionEvent event);

        /* JADX INFO: renamed from: s */
        void mo1416s(int units);

        void toq();

        /* JADX INFO: renamed from: y */
        float mo1417y(int id);

        float zy(int id);
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MotionLayout.this.l2jk = false;
        }
    }

    public interface x2 {
        void f7l8(MotionLayout motionLayout, int startId, int endId);

        /* JADX INFO: renamed from: g */
        void mo1367g(MotionLayout motionLayout, int currentId);

        /* JADX INFO: renamed from: k */
        void mo1368k(MotionLayout motionLayout, int startId, int endId, float progress);

        /* JADX INFO: renamed from: y */
        void mo1389y(MotionLayout motionLayout, int triggerId, boolean positive, float progress);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.MotionLayout$y */
    class C0366y {

        /* JADX INFO: renamed from: g */
        int f2214g;

        /* JADX INFO: renamed from: n */
        int f2216n;

        /* JADX INFO: renamed from: k */
        C0339g f2215k = new C0339g();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        C0339g f48036toq = new C0339g();

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        C0397q f48037zy = null;

        /* JADX INFO: renamed from: q */
        C0397q f2217q = null;

        C0366y() {
        }

        @SuppressLint({"LogConditional"})
        /* JADX INFO: renamed from: g */
        private void m1418g(String str, C0341n child) {
            String string;
            String string2;
            String string3;
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String string4 = "__";
            if (child.f2051l.f2068g != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0846k.zaso);
                sb2.append(child.f2051l.f2068g.f2070n == C0343q.toq.TOP ? C0846k.zaso : "B");
                string = sb2.toString();
            } else {
                string = "__";
            }
            sb.append(string);
            String string5 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string5);
            if (child.f47887hyr.f2068g != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("B");
                sb4.append(child.f47887hyr.f2068g.f2070n == C0343q.toq.TOP ? C0846k.zaso : "B");
                string2 = sb4.toString();
            } else {
                string2 = "__";
            }
            sb3.append(string2);
            String string6 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string6);
            if (child.f47905ncyb.f2068g != null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("L");
                sb6.append(child.f47905ncyb.f2068g.f2070n == C0343q.toq.LEFT ? "L" : "R");
                string3 = sb6.toString();
            } else {
                string3 = "__";
            }
            sb5.append(string3);
            String string7 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string7);
            if (child.f47903n5r1.f2068g != null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("R");
                sb8.append(child.f47903n5r1.f2068g.f2070n == C0343q.toq.LEFT ? "L" : "R");
                string4 = sb8.toString();
            }
            sb7.append(string4);
            Log.v(MotionLayout.ph90, str + sb7.toString() + " ---  " + child);
        }

        @SuppressLint({"LogConditional"})
        /* JADX INFO: renamed from: n */
        private void m1419n(String str, ConstraintLayout.toq params) {
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(params.f2643i != -1 ? "SS" : "__");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(params.f48511t8r != -1 ? "|SE" : "|__");
            String string2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            sb3.append(params.f48485fn3e != -1 ? "|ES" : "|__");
            String string3 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(string3);
            sb4.append(params.f48522zurt != -1 ? "|EE" : "|__");
            String string4 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(string4);
            sb5.append(params.f2648n != -1 ? "|LL" : "|__");
            String string5 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(string5);
            sb6.append(params.f2641g != -1 ? "|LR" : "|__");
            String string6 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(string6);
            sb7.append(params.f48484f7l8 != -1 ? "|RL" : "|__");
            String string7 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(string7);
            sb8.append(params.f2657y != -1 ? "|RR" : "|__");
            String string8 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(string8);
            sb9.append(params.f2653s != -1 ? "|TT" : "|__");
            String string9 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(string9);
            sb10.append(params.f2650p != -1 ? "|TB" : "|__");
            String string10 = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(string10);
            sb11.append(params.f48496ld6 != -1 ? "|BT" : "|__");
            String string11 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(string11);
            sb12.append(params.f48516x2 != -1 ? "|BB" : "|__");
            Log.v(MotionLayout.ph90, str + sb12.toString());
        }

        @SuppressLint({"LogConditional"})
        /* JADX INFO: renamed from: q */
        private void m1420q(String title, C0339g c2) {
            String str = title + " " + androidx.constraintlayout.motion.widget.zy.ld6((View) c2.ni7());
            Log.v(MotionLayout.ph90, str + "  ========= " + c2);
            int size = c2.bih().size();
            for (int i2 = 0; i2 < size; i2++) {
                String str2 = str + "[" + i2 + "] ";
                C0341n c0341n = c2.bih().get(i2);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(c0341n.f2051l.f2068g != null ? C0846k.zaso : "_");
                String string = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(c0341n.f47887hyr.f2068g != null ? "B" : "_");
                String string2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(c0341n.f47905ncyb.f2068g != null ? "L" : "_");
                String string3 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(c0341n.f47903n5r1.f2068g != null ? "R" : "_");
                String string4 = sb4.toString();
                View view = (View) c0341n.ni7();
                String strLd6 = androidx.constraintlayout.motion.widget.zy.ld6(view);
                if (view instanceof TextView) {
                    strLd6 = strLd6 + "(" + ((Object) ((TextView) view).getText()) + ")";
                }
                Log.v(MotionLayout.ph90, str2 + "  " + strLd6 + " " + c0341n + " " + string4);
            }
            Log.v(MotionLayout.ph90, str + " done. ");
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void qrj(C0339g base, C0397q cSet) {
            SparseArray<C0341n> sparseArray = new SparseArray<>();
            Constraints.C0392k c0392k = new Constraints.C0392k(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, base);
            sparseArray.put(MotionLayout.this.getId(), base);
            if (cSet != null && cSet.f2947q != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.lrht(this.f48036toq, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            for (C0341n c0341n : base.bih()) {
                c0341n.zkd(true);
                sparseArray.put(((View) c0341n.ni7()).getId(), c0341n);
            }
            for (C0341n c0341n2 : base.bih()) {
                View view = (View) c0341n2.ni7();
                cSet.fn3e(view.getId(), c0392k);
                c0341n2.m2t(cSet.bo(view.getId()));
                c0341n2.pc(cSet.zp(view.getId()));
                if (view instanceof ConstraintHelper) {
                    cSet.t8r((ConstraintHelper) view, c0341n2, c0392k, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).d3();
                    }
                }
                c0392k.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.d3(false, view, c0341n2, c0392k, sparseArray);
                if (cSet.m1667u(view.getId()) == 1) {
                    c0341n2.m1330w(view.getVisibility());
                } else {
                    c0341n2.m1330w(cSet.t8iq(view.getId()));
                }
            }
            for (C0341n c0341n3 : base.bih()) {
                if (c0341n3 instanceof androidx.constraintlayout.core.widgets.n7h) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) c0341n3.ni7();
                    InterfaceC0344s interfaceC0344s = (InterfaceC0344s) c0341n3;
                    constraintHelper.jp0y(base, interfaceC0344s, sparseArray);
                    ((androidx.constraintlayout.core.widgets.n7h) interfaceC0344s).o5();
                }
            }
        }

        private void toq(int widthMeasureSpec, int heightMeasureSpec) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.ax == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                C0339g c0339g = this.f48036toq;
                C0397q c0397q = this.f2217q;
                motionLayout2.lrht(c0339g, optimizationLevel, (c0397q == null || c0397q.f2947q == 0) ? widthMeasureSpec : heightMeasureSpec, (c0397q == null || c0397q.f2947q == 0) ? heightMeasureSpec : widthMeasureSpec);
                C0397q c0397q2 = this.f48037zy;
                if (c0397q2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    C0339g c0339g2 = this.f2215k;
                    int i2 = c0397q2.f2947q;
                    int i3 = i2 == 0 ? widthMeasureSpec : heightMeasureSpec;
                    if (i2 == 0) {
                        widthMeasureSpec = heightMeasureSpec;
                    }
                    motionLayout3.lrht(c0339g2, optimizationLevel, i3, widthMeasureSpec);
                    return;
                }
                return;
            }
            C0397q c0397q3 = this.f48037zy;
            if (c0397q3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                C0339g c0339g3 = this.f2215k;
                int i4 = c0397q3.f2947q;
                motionLayout4.lrht(c0339g3, optimizationLevel, i4 == 0 ? widthMeasureSpec : heightMeasureSpec, i4 == 0 ? heightMeasureSpec : widthMeasureSpec);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            C0339g c0339g4 = this.f48036toq;
            C0397q c0397q4 = this.f2217q;
            int i5 = (c0397q4 == null || c0397q4.f2947q == 0) ? widthMeasureSpec : heightMeasureSpec;
            if (c0397q4 == null || c0397q4.f2947q == 0) {
                widthMeasureSpec = heightMeasureSpec;
            }
            motionLayout5.lrht(c0339g4, optimizationLevel, i5, widthMeasureSpec);
        }

        C0341n f7l8(C0339g container, View view) {
            if (container.ni7() == view) {
                return container;
            }
            ArrayList<C0341n> arrayListBih = container.bih();
            int size = arrayListBih.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0341n c0341n = arrayListBih.get(i2);
                if (c0341n.ni7() == view) {
                    return c0341n;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[SYNTHETIC] */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m1421k() {
            /*
                Method dump skipped, instruction units count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.C0366y.m1421k():void");
        }

        public void ld6() {
            m1422p(MotionLayout.this.ac, MotionLayout.this.ad);
            MotionLayout.this.jbh();
        }

        /* JADX INFO: renamed from: p */
        public void m1422p(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.us2t = mode;
            motionLayout.nq0z = mode2;
            motionLayout.getOptimizationLevel();
            toq(widthMeasureSpec, heightMeasureSpec);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                toq(widthMeasureSpec, heightMeasureSpec);
                MotionLayout.this.eht = this.f2215k.m1313a();
                MotionLayout.this.n5ij = this.f2215k.jk();
                MotionLayout.this.lw58 = this.f48036toq.m1313a();
                MotionLayout.this.fn2 = this.f48036toq.jk();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.oyp = (motionLayout2.eht == motionLayout2.lw58 && motionLayout2.n5ij == motionLayout2.fn2) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i2 = motionLayout3.eht;
            int i3 = motionLayout3.n5ij;
            int i4 = motionLayout3.us2t;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                i2 = (int) (i2 + (motionLayout3.a7kc * (motionLayout3.lw58 - i2)));
            }
            int i5 = i2;
            int i6 = motionLayout3.nq0z;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i3 = (int) (i3 + (motionLayout3.a7kc * (motionLayout3.fn2 - i3)));
            }
            MotionLayout.this.m1622c(widthMeasureSpec, heightMeasureSpec, i5, i3, this.f2215k.pnt2() || this.f48036toq.pnt2(), this.f2215k.hyow() || this.f48036toq.hyow());
        }

        /* JADX INFO: renamed from: s */
        public boolean m1423s(int startId, int endId) {
            return (startId == this.f2216n && endId == this.f2214g) ? false : true;
        }

        public void x2(int startId, int endId) {
            this.f2216n = startId;
            this.f2214g = endId;
        }

        /* JADX INFO: renamed from: y */
        void m1424y(C0339g baseLayout, C0397q start, C0397q end) {
            this.f48037zy = start;
            this.f2217q = end;
            this.f2215k = new C0339g();
            this.f48036toq = new C0339g();
            this.f2215k.z617(((ConstraintLayout) MotionLayout.this).f2621n.kq2f());
            this.f48036toq.z617(((ConstraintLayout) MotionLayout.this).f2621n.kq2f());
            this.f2215k.rp();
            this.f48036toq.rp();
            zy(((ConstraintLayout) MotionLayout.this).f2621n, this.f2215k);
            zy(((ConstraintLayout) MotionLayout.this).f2621n, this.f48036toq);
            if (MotionLayout.this.k0 > 0.5d) {
                if (start != null) {
                    qrj(this.f2215k, start);
                }
                qrj(this.f48036toq, end);
            } else {
                qrj(this.f48036toq, end);
                if (start != null) {
                    qrj(this.f2215k, start);
                }
            }
            this.f2215k.c25(MotionLayout.this.m1623l());
            this.f2215k.f3f();
            this.f48036toq.c25(MotionLayout.this.m1623l());
            this.f48036toq.f3f();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    C0339g c0339g = this.f2215k;
                    C0341n.toq toqVar = C0341n.toq.WRAP_CONTENT;
                    c0339g.pjz9(toqVar);
                    this.f48036toq.pjz9(toqVar);
                }
                if (layoutParams.height == -2) {
                    C0339g c0339g2 = this.f2215k;
                    C0341n.toq toqVar2 = C0341n.toq.WRAP_CONTENT;
                    c0339g2.ew(toqVar2);
                    this.f48036toq.ew(toqVar2);
                }
            }
        }

        void zy(C0339g src, C0339g dest) {
            ArrayList<C0341n> arrayListBih = src.bih();
            HashMap<C0341n, C0341n> map = new HashMap<>();
            map.put(src, dest);
            dest.bih().clear();
            dest.n7h(src, map);
            for (C0341n c0341n : arrayListBih) {
                C0341n c0340k = c0341n instanceof C0340k ? new C0340k() : c0341n instanceof C0345y ? new C0345y() : c0341n instanceof androidx.constraintlayout.core.widgets.f7l8 ? new androidx.constraintlayout.core.widgets.f7l8() : c0341n instanceof androidx.constraintlayout.core.widgets.x2 ? new androidx.constraintlayout.core.widgets.x2() : c0341n instanceof InterfaceC0344s ? new C0342p() : new C0341n();
                dest.m1307k(c0340k);
                map.put(c0341n, c0340k);
            }
            for (C0341n c0341n2 : arrayListBih) {
                map.get(c0341n2).n7h(c0341n2, map);
            }
        }
    }

    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f2218k;

        zy(final MotionLayout this$0, final View val$target) {
            this.f2218k = val$target;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2218k.setNestedScrollingEnabled(true);
        }
    }

    public MotionLayout(@lvui Context context) {
        super(context);
        this.bg = null;
        this.az = 0.0f;
        this.ba = -1;
        this.ax = -1;
        this.bq = -1;
        this.ac = 0;
        this.ad = 0;
        this.am = true;
        this.ay = new HashMap<>();
        this.be = 0L;
        this.aj = 1.0f;
        this.bs = 0.0f;
        this.k0 = 0.0f;
        this.bc = 0.0f;
        this.bd = false;
        this.tlhn = false;
        this.zmmu = 0;
        this.dy = false;
        this.vb6 = new androidx.constraintlayout.motion.utils.toq();
        this.k6e = new C0360g();
        this.s8y = true;
        this.th6 = false;
        this.zr5t = false;
        this.ei = null;
        this.wra = null;
        this.zsl = null;
        this.xhv = null;
        this.zm = 0;
        this.ut = -1L;
        this.wh6 = 0.0f;
        this.ls9 = 0;
        this.qns = 0.0f;
        this.afw = false;
        this.oyp = false;
        this.k84 = new androidx.constraintlayout.core.motion.utils.f7l8();
        this.cecm = false;
        this.h06 = null;
        this.gjxq = null;
        this.r7v2 = 0;
        this.l2jk = false;
        this.bsb = 0;
        this.q09 = new HashMap<>();
        this.v3 = new Rect();
        this.yf = false;
        this.v62 = qrj.UNDEFINED;
        this.vl4 = new C0366y();
        this.w7wd = false;
        this.smyf = new RectF();
        this.qnoq = null;
        this.deb = null;
        this.u6 = new ArrayList<>();
        kcsr(null);
    }

    private void b3e() {
        CopyOnWriteArrayList<x2> copyOnWriteArrayList;
        if (this.w97r == null && ((copyOnWriteArrayList = this.xhv) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.afw = false;
        for (Integer num : this.u6) {
            x2 x2Var = this.w97r;
            if (x2Var != null) {
                x2Var.mo1367g(this, num.intValue());
            }
            CopyOnWriteArrayList<x2> copyOnWriteArrayList2 = this.xhv;
            if (copyOnWriteArrayList2 != null) {
                Iterator<x2> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().mo1367g(this, num.intValue());
                }
            }
        }
        this.u6.clear();
    }

    /* JADX INFO: renamed from: d */
    private boolean m1392d(View view, MotionEvent event, float offsetX, float offsetY) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            event.offsetLocation(offsetX, offsetY);
            boolean zOnTouchEvent = view.onTouchEvent(event);
            event.offsetLocation(-offsetX, -offsetY);
            return zOnTouchEvent;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(event);
        motionEventObtain.offsetLocation(offsetX, offsetY);
        if (this.deb == null) {
            this.deb = new Matrix();
        }
        matrix.invert(this.deb);
        motionEventObtain.transform(this.deb);
        boolean zOnTouchEvent2 = view.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zOnTouchEvent2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jbh() {
        int childCount = getChildCount();
        this.vl4.m1421k();
        boolean z2 = true;
        this.bd = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            sparseArray.put(childAt.getId(), this.ay.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int iQrj = this.bl.qrj();
        if (iQrj != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                kja0 kja0Var = this.ay.get(getChildAt(i4));
                if (kja0Var != null) {
                    kja0Var.m1468f(iQrj);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.ay.size()];
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            kja0 kja0Var2 = this.ay.get(getChildAt(i6));
            if (kja0Var2.ld6() != -1) {
                sparseBooleanArray.put(kja0Var2.ld6(), true);
                iArr[i5] = kja0Var2.ld6();
                i5++;
            }
        }
        if (this.zsl != null) {
            for (int i7 = 0; i7 < i5; i7++) {
                kja0 kja0Var3 = this.ay.get(findViewById(iArr[i7]));
                if (kja0Var3 != null) {
                    this.bl.o1t(kja0Var3);
                }
            }
            Iterator<MotionHelper> it = this.zsl.iterator();
            while (it.hasNext()) {
                it.next().zy(this, this.ay);
            }
            for (int i8 = 0; i8 < i5; i8++) {
                kja0 kja0Var4 = this.ay.get(findViewById(iArr[i8]));
                if (kja0Var4 != null) {
                    kja0Var4.nn86(width, height, this.aj, getNanoTime());
                }
            }
        } else {
            for (int i9 = 0; i9 < i5; i9++) {
                kja0 kja0Var5 = this.ay.get(findViewById(iArr[i9]));
                if (kja0Var5 != null) {
                    this.bl.o1t(kja0Var5);
                    kja0Var5.nn86(width, height, this.aj, getNanoTime());
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            kja0 kja0Var6 = this.ay.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && kja0Var6 != null) {
                this.bl.o1t(kja0Var6);
                kja0Var6.nn86(width, height, this.aj, getNanoTime());
            }
        }
        float fLvui = this.bl.lvui();
        if (fLvui != 0.0f) {
            boolean z3 = ((double) fLvui) < 0.0d;
            float fAbs = Math.abs(fLvui);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            int i11 = 0;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            while (true) {
                if (i11 >= childCount) {
                    z2 = false;
                    break;
                }
                kja0 kja0Var7 = this.ay.get(getChildAt(i11));
                if (!Float.isNaN(kja0Var7.f48159qrj)) {
                    break;
                }
                float fM1471i = kja0Var7.m1471i();
                float fFn3e = kja0Var7.fn3e();
                float f2 = z3 ? fFn3e - fM1471i : fFn3e + fM1471i;
                fMin2 = Math.min(fMin2, f2);
                fMax2 = Math.max(fMax2, f2);
                i11++;
            }
            if (!z2) {
                while (i2 < childCount) {
                    kja0 kja0Var8 = this.ay.get(getChildAt(i2));
                    float fM1471i2 = kja0Var8.m1471i();
                    float fFn3e2 = kja0Var8.fn3e();
                    float f3 = z3 ? fFn3e2 - fM1471i2 : fFn3e2 + fM1471i2;
                    kja0Var8.f48151kja0 = 1.0f / (1.0f - fAbs);
                    kja0Var8.f48155n7h = fAbs - (((f3 - fMin2) * fAbs) / (fMax2 - fMin2));
                    i2++;
                }
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                kja0 kja0Var9 = this.ay.get(getChildAt(i12));
                if (!Float.isNaN(kja0Var9.f48159qrj)) {
                    fMin = Math.min(fMin, kja0Var9.f48159qrj);
                    fMax = Math.max(fMax, kja0Var9.f48159qrj);
                }
            }
            while (i2 < childCount) {
                kja0 kja0Var10 = this.ay.get(getChildAt(i2));
                if (!Float.isNaN(kja0Var10.f48159qrj)) {
                    kja0Var10.f48151kja0 = 1.0f / (1.0f - fAbs);
                    if (z3) {
                        kja0Var10.f48155n7h = fAbs - (((fMax - kja0Var10.f48159qrj) / (fMax - fMin)) * fAbs);
                    } else {
                        kja0Var10.f48155n7h = fAbs - (((kja0Var10.f48159qrj - fMin) * fAbs) / (fMax - fMin));
                    }
                }
                i2++;
            }
        }
    }

    private void kcsr(AttributeSet attrs) {
        t8r t8rVar;
        faqz = isInEditMode();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.wx3a);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            boolean z2 = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.ay) {
                    this.bl = new t8r(getContext(), this, typedArrayObtainStyledAttributes.getResourceId(index, -1));
                } else if (index == C0394g.qrj.ua) {
                    this.ax = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                } else if (index == C0394g.qrj.ob6y) {
                    this.bc = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                    this.bd = true;
                } else if (index == C0394g.qrj.v70n) {
                    z2 = typedArrayObtainStyledAttributes.getBoolean(index, z2);
                } else if (index == C0394g.qrj.zne) {
                    if (this.zmmu == 0) {
                        this.zmmu = typedArrayObtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == C0394g.qrj.t7) {
                    this.zmmu = typedArrayObtainStyledAttributes.getInt(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (this.bl == null) {
                Log.e(ph90, "WARNING NO app:layoutDescription tag");
            }
            if (!z2) {
                this.bl = null;
            }
        }
        if (this.zmmu != 0) {
            mu();
        }
        if (this.ax != -1 || (t8rVar = this.bl) == null) {
            return;
        }
        this.ax = t8rVar.m1533r();
        this.ba = this.bl.m1533r();
        this.bq = this.bl.fn3e();
    }

    private static boolean lh(float velocity, float position, float maxAcceleration) {
        if (velocity > 0.0f) {
            float f2 = velocity / maxAcceleration;
            return position + ((velocity * f2) - (((maxAcceleration * f2) * f2) / 2.0f)) > 1.0f;
        }
        float f3 = (-velocity) / maxAcceleration;
        return position + ((velocity * f3) + (((maxAcceleration * f3) * f3) / 2.0f)) < 0.0f;
    }

    private void ltg8(MotionLayout motionLayout, int mBeginState, int mEndState) {
        x2 x2Var = this.w97r;
        if (x2Var != null) {
            x2Var.f7l8(this, mBeginState, mEndState);
        }
        CopyOnWriteArrayList<x2> copyOnWriteArrayList = this.xhv;
        if (copyOnWriteArrayList != null) {
            Iterator<x2> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().f7l8(motionLayout, mBeginState, mEndState);
            }
        }
    }

    private void mu() {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            Log.e(ph90, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int iM1533r = t8rVar.m1533r();
        t8r t8rVar2 = this.bl;
        vq(iM1533r, t8rVar2.kja0(t8rVar2.m1533r()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (t8r.toq toqVar : this.bl.t8r()) {
            if (toqVar == this.bl.f48306zy) {
                Log.v(ph90, "CHECK: CURRENT");
            }
            qkj8(toqVar);
            int iD3 = toqVar.d3();
            int iM1554t = toqVar.m1554t();
            String strM1601s = androidx.constraintlayout.motion.widget.zy.m1601s(getContext(), iD3);
            String strM1601s2 = androidx.constraintlayout.motion.widget.zy.m1601s(getContext(), iM1554t);
            if (sparseIntArray.get(iD3) == iM1554t) {
                Log.e(ph90, "CHECK: two transitions with the same start and end " + strM1601s + "->" + strM1601s2);
            }
            if (sparseIntArray2.get(iM1554t) == iD3) {
                Log.e(ph90, "CHECK: you can't have reverse transitions" + strM1601s + "->" + strM1601s2);
            }
            sparseIntArray.put(iD3, iM1554t);
            sparseIntArray2.put(iM1554t, iD3);
            if (this.bl.kja0(iD3) == null) {
                Log.e(ph90, " no such constraintSetStart " + strM1601s);
            }
            if (this.bl.kja0(iM1554t) == null) {
                Log.e(ph90, " no such constraintSetEnd " + strM1601s);
            }
        }
    }

    private void py() {
        CopyOnWriteArrayList<x2> copyOnWriteArrayList;
        if ((this.w97r == null && ((copyOnWriteArrayList = this.xhv) == null || copyOnWriteArrayList.isEmpty())) || this.qns == this.bs) {
            return;
        }
        if (this.ls9 != -1) {
            x2 x2Var = this.w97r;
            if (x2Var != null) {
                x2Var.f7l8(this, this.ba, this.bq);
            }
            CopyOnWriteArrayList<x2> copyOnWriteArrayList2 = this.xhv;
            if (copyOnWriteArrayList2 != null) {
                Iterator<x2> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().f7l8(this, this.ba, this.bq);
                }
            }
            this.afw = true;
        }
        this.ls9 = -1;
        float f2 = this.bs;
        this.qns = f2;
        x2 x2Var2 = this.w97r;
        if (x2Var2 != null) {
            x2Var2.mo1368k(this, this.ba, this.bq, f2);
        }
        CopyOnWriteArrayList<x2> copyOnWriteArrayList3 = this.xhv;
        if (copyOnWriteArrayList3 != null) {
            Iterator<x2> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().mo1368k(this, this.ba, this.bq, this.bs);
            }
        }
        this.afw = true;
    }

    private void qkj8(t8r.toq transition) {
        if (transition.d3() == transition.m1554t()) {
            Log.e(ph90, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void qo() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            kja0 kja0Var = this.ay.get(childAt);
            if (kja0Var != null) {
                kja0Var.m1466c(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    private void tfm() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.v(ph90, " " + androidx.constraintlayout.motion.widget.zy.f7l8() + " " + androidx.constraintlayout.motion.widget.zy.ld6(this) + " " + androidx.constraintlayout.motion.widget.zy.m1601s(getContext(), this.ax) + " " + androidx.constraintlayout.motion.widget.zy.ld6(childAt) + childAt.getLeft() + " " + childAt.getTop());
        }
    }

    private void vq(int csetId, C0397q set) {
        String strM1601s = androidx.constraintlayout.motion.widget.zy.m1601s(getContext(), csetId);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            if (id == -1) {
                Log.w(ph90, "CHECK: " + strM1601s + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (set.i1(id) == null) {
                Log.w(ph90, "CHECK: " + strM1601s + " NO CONSTRAINTS for " + androidx.constraintlayout.motion.widget.zy.ld6(childAt));
            }
        }
        int[] iArrM1668x = set.m1668x();
        for (int i3 = 0; i3 < iArrM1668x.length; i3++) {
            int i4 = iArrM1668x[i3];
            String strM1601s2 = androidx.constraintlayout.motion.widget.zy.m1601s(getContext(), i4);
            if (findViewById(iArrM1668x[i3]) == null) {
                Log.w(ph90, "CHECK: " + strM1601s + " NO View matches id " + strM1601s2);
            }
            if (set.zp(i4) == -1) {
                Log.w(ph90, "CHECK: " + strM1601s + "(" + strM1601s2 + ") no LAYOUT_HEIGHT");
            }
            if (set.bo(i4) == -1) {
                Log.w(ph90, "CHECK: " + strM1601s + "(" + strM1601s2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect yl(C0341n cw) {
        this.v3.top = cw.ch();
        this.v3.left = cw.m1331x();
        Rect rect = this.v3;
        int iM1313a = cw.m1313a();
        Rect rect2 = this.v3;
        rect.right = iM1313a + rect2.left;
        int iJk = cw.jk();
        Rect rect3 = this.v3;
        rect2.bottom = iJk + rect3.top;
        return rect3;
    }

    private boolean yqrt(float x3, float y3, View view, MotionEvent event) {
        boolean z2;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (yqrt((r3.getLeft() + x3) - view.getScrollX(), (r3.getTop() + y3) - view.getScrollY(), viewGroup.getChildAt(childCount), event)) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        if (!z2) {
            this.smyf.set(x3, y3, (view.getRight() + x3) - view.getLeft(), (view.getBottom() + y3) - view.getTop());
            if ((event.getAction() != 0 || this.smyf.contains(event.getX(), event.getY())) && m1392d(view, event, -x3, -y3)) {
                return true;
            }
        }
        return z2;
    }

    private void zsr0() {
        boolean z2;
        float fSignum = Math.signum(this.bc - this.k0);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.as;
        float interpolation = this.k0 + (!(interpolator instanceof androidx.constraintlayout.motion.utils.toq) ? (((nanoTime - this.ar) * fSignum) * 1.0E-9f) / this.aj : 0.0f);
        if (this.bu) {
            interpolation = this.bc;
        }
        if ((fSignum <= 0.0f || interpolation < this.bc) && (fSignum > 0.0f || interpolation > this.bc)) {
            z2 = false;
        } else {
            interpolation = this.bc;
            z2 = true;
        }
        if (interpolator != null && !z2) {
            interpolation = this.dy ? interpolator.getInterpolation((nanoTime - this.be) * 1.0E-9f) : interpolator.getInterpolation(interpolation);
        }
        if ((fSignum > 0.0f && interpolation >= this.bc) || (fSignum <= 0.0f && interpolation <= this.bc)) {
            interpolation = this.bc;
        }
        this.a7kc = interpolation;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.bg;
        if (interpolator2 != null) {
            interpolation = interpolator2.getInterpolation(interpolation);
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            kja0 kja0Var = this.ay.get(childAt);
            if (kja0Var != null) {
                kja0Var.d2ok(childAt, interpolation, nanoTime2, this.k84);
            }
        }
        if (this.oyp) {
            requestLayout();
        }
    }

    @Deprecated
    public void bek6() {
        Log.e(ph90, "This method is deprecated. Please call rebuildScene() instead.");
        cv06();
    }

    public boolean bwp() {
        return this.yf;
    }

    public void bz2(int id) {
        if (!isAttachedToWindow()) {
            this.ax = id;
        }
        if (this.ba == id) {
            setProgress(0.0f);
        } else if (this.bq == id) {
            setProgress(1.0f);
        } else {
            setTransition(id, id);
        }
    }

    kja0 cfr(int mTouchAnchorId) {
        return this.ay.get(findViewById(mTouchAnchorId));
    }

    public void cv06() {
        this.vl4.ld6();
        invalidate();
    }

    public void d8wk(int transitionID, boolean enable) {
        t8r.toq toqVarW831 = w831(transitionID);
        if (enable) {
            toqVarW831.ncyb(true);
            return;
        }
        t8r t8rVar = this.bl;
        if (toqVarW831 == t8rVar.f48306zy) {
            Iterator<t8r.toq> it = t8rVar.ncyb(this.ax).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                t8r.toq next = it.next();
                if (next.eqxt()) {
                    this.bl.f48306zy = next;
                    break;
                }
            }
        }
        toqVarW831.ncyb(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        wvg wvgVar;
        ArrayList<MotionHelper> arrayList = this.zsl;
        if (arrayList != null) {
            Iterator<MotionHelper> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo1387q(canvas);
            }
        }
        gbni(false);
        t8r t8rVar = this.bl;
        if (t8rVar != null && (wvgVar = t8rVar.f48303t8r) != null) {
            wvgVar.m1563q();
        }
        super.dispatchDraw(canvas);
        if (this.bl == null) {
            return;
        }
        if ((this.zmmu & 1) == 1 && !isInEditMode()) {
            this.zm++;
            long nanoTime = getNanoTime();
            long j2 = this.ut;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.wh6 = ((int) ((this.zm / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.zm = 0;
                    this.ut = nanoTime;
                }
            } else {
                this.ut = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            String str = this.wh6 + " fps " + androidx.constraintlayout.motion.widget.zy.x2(this, this.ba) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(androidx.constraintlayout.motion.widget.zy.x2(this, this.bq));
            sb.append(" (progress: ");
            sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
            sb.append(" ) state=");
            int i2 = this.ax;
            sb.append(i2 == -1 ? "undefined" : androidx.constraintlayout.motion.widget.zy.x2(this, i2));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.zmmu > 1) {
            if (this.sk1t == null) {
                this.sk1t = new f7l8();
            }
            this.sk1t.m1406k(canvas, this.ay, this.bl.m1529i(), this.zmmu);
        }
        ArrayList<MotionHelper> arrayList2 = this.zsl;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().mo1385n(canvas);
            }
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28240do(Runnable onComplete) {
        m1399v(1.0f);
        this.h06 = onComplete;
    }

    public void ebn(int id) {
        if (isAttachedToWindow()) {
            ij(id, -1, -1);
            return;
        }
        if (this.kdv1 == null) {
            this.kdv1 = new ld6();
        }
        this.kdv1.m1410q(id);
    }

    String etdu(int id) {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return null;
        }
        return t8rVar.uv6(id);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    /* JADX INFO: renamed from: f */
    protected void mo1398f(int id) {
        this.f2627t = null;
    }

    public C0397q fnq8(int id) {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return null;
        }
        C0397q c0397qKja0 = t8rVar.kja0(id);
        C0397q c0397q = new C0397q();
        c0397q.d3(c0397qKja0);
        return c0397q;
    }

    @Override // androidx.core.view.jp0y
    public void fu4(@lvui View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
    }

    public void g1(int viewTransitionId, boolean enable) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            t8rVar.x2(viewTransitionId, enable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2 A[PHI: r3
      0x00e2: PHI (r3v50 float) = (r3v49 float), (r3v51 float), (r3v51 float) binds: [B:47:0x00ab, B:58:0x00d6, B:60:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void gbni(boolean r24) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.gbni(boolean):void");
    }

    public boolean gc3c() {
        return this.am;
    }

    public int[] getConstraintSetIds() {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return null;
        }
        return t8rVar.ki();
    }

    public int getCurrentState() {
        return this.ax;
    }

    public ArrayList<t8r.toq> getDefinedTransitions() {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return null;
        }
        return t8rVar.t8r();
    }

    public C0376q getDesignTool() {
        if (this.xk5 == null) {
            this.xk5 = new C0376q(this);
        }
        return this.xk5;
    }

    public int getEndState() {
        return this.bq;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.k0;
    }

    public t8r getScene() {
        return this.bl;
    }

    public int getStartState() {
        return this.ba;
    }

    public float getTargetPosition() {
        return this.bc;
    }

    public Bundle getTransitionState() {
        if (this.kdv1 == null) {
            this.kdv1 = new ld6();
        }
        this.kdv1.zy();
        return this.kdv1.toq();
    }

    public long getTransitionTimeMs() {
        if (this.bl != null) {
            this.aj = r0.m1529i() / 1000.0f;
        }
        return (long) (this.aj * 1000.0f);
    }

    public float getVelocity() {
        return this.az;
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(@lvui View target, int dx, int dy, @lvui int[] consumed, int type) {
        t8r.toq toqVar;
        zurt zurtVarOc;
        int iT8r;
        t8r t8rVar = this.bl;
        if (t8rVar == null || (toqVar = t8rVar.f48306zy) == null || !toqVar.eqxt()) {
            return;
        }
        int i2 = -1;
        if (!toqVar.eqxt() || (zurtVarOc = toqVar.oc()) == null || (iT8r = zurtVarOc.t8r()) == -1 || target.getId() == iT8r) {
            if (t8rVar.jk()) {
                zurt zurtVarOc2 = toqVar.oc();
                if (zurtVarOc2 != null && (zurtVarOc2.m1585g() & 4) != 0) {
                    i2 = dy;
                }
                float f2 = this.bs;
                if ((f2 == 1.0f || f2 == 0.0f) && target.canScrollVertically(i2)) {
                    return;
                }
            }
            if (toqVar.oc() != null && (toqVar.oc().m1585g() & 1) != 0) {
                float fFti = t8rVar.fti(dx, dy);
                float f3 = this.k0;
                if ((f3 <= 0.0f && fFti < 0.0f) || (f3 >= 1.0f && fFti > 0.0f)) {
                    target.setNestedScrollingEnabled(false);
                    target.post(new zy(this, target));
                    return;
                }
            }
            float f4 = this.bs;
            long nanoTime = getNanoTime();
            float f5 = dx;
            this.q7k9 = f5;
            float f6 = dy;
            this.ndjo = f6;
            this.xqx = (float) ((nanoTime - this.d1cy) * 1.0E-9d);
            this.d1cy = nanoTime;
            t8rVar.m1531o(f5, f6);
            if (f4 != this.bs) {
                consumed[0] = dx;
                consumed[1] = dy;
            }
            gbni(false);
            if (consumed[0] == 0 && consumed[1] == 0) {
                return;
            }
            this.th6 = true;
        }
    }

    public boolean h7am(x2 listener) {
        CopyOnWriteArrayList<x2> copyOnWriteArrayList = this.xhv;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(listener);
    }

    protected void i9jn() {
        int iIntValue;
        CopyOnWriteArrayList<x2> copyOnWriteArrayList;
        if ((this.w97r != null || ((copyOnWriteArrayList = this.xhv) != null && !copyOnWriteArrayList.isEmpty())) && this.ls9 == -1) {
            this.ls9 = this.ax;
            if (this.u6.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.u6;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i2 = this.ax;
            if (iIntValue != i2 && i2 != -1) {
                this.u6.add(Integer.valueOf(i2));
            }
        }
        b3e();
        Runnable runnable = this.h06;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.gjxq;
        if (iArr == null || this.r7v2 <= 0) {
            return;
        }
        ebn(iArr[0]);
        int[] iArr2 = this.gjxq;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.r7v2--;
    }

    public void ij(int id, int screenWidth, int screenHeight) {
        nsb(id, screenWidth, screenHeight, -1);
    }

    public boolean ikck(int viewTransitionId, kja0 motionController) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            return t8rVar.m1538y(viewTransitionId, motionController);
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void ixz() {
        m1399v(1.0f);
        this.h06 = null;
    }

    protected InterfaceC0365s jz5() {
        return C0363p.m1412k();
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@lvui View target, int type) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            float f2 = this.xqx;
            if (f2 == 0.0f) {
                return;
            }
            t8rVar.m1530m(this.q7k9 / f2, this.ndjo / f2);
        }
    }

    void ktq() {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return;
        }
        if (t8rVar.m1534s(this, this.ax)) {
            requestLayout();
            return;
        }
        int i2 = this.ax;
        if (i2 != -1) {
            this.bl.m1527g(this, i2);
        }
        if (this.bl.lv5()) {
            this.bl.ch();
        }
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@lvui View child, @lvui View target, int axes, int type) {
        this.d1cy = getNanoTime();
        this.xqx = 0.0f;
        this.q7k9 = 0.0f;
        this.ndjo = 0.0f;
    }

    void m4(int mTouchAnchorId, float pos, float locationX, float locationY, float[] mAnchorDpDt) {
        String resourceName;
        HashMap<View, kja0> map = this.ay;
        View viewDd = dd(mTouchAnchorId);
        kja0 kja0Var = map.get(viewDd);
        if (kja0Var != null) {
            kja0Var.m1470h(pos, locationX, locationY, mAnchorDpDt);
            float y3 = viewDd.getY();
            this.tgs = pos;
            this.yl25 = y3;
            return;
        }
        if (viewDd == null) {
            resourceName = "" + mTouchAnchorId;
        } else {
            resourceName = viewDd.getContext().getResources().getResourceName(mTouchAnchorId);
        }
        Log.w(ph90, "WARNING could not find view id " + resourceName);
    }

    public void mbx(int id) {
        if (getCurrentState() == -1) {
            ebn(id);
            return;
        }
        int[] iArr = this.gjxq;
        if (iArr == null) {
            this.gjxq = new int[4];
        } else if (iArr.length <= this.r7v2) {
            this.gjxq = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.gjxq;
        int i2 = this.r7v2;
        this.r7v2 = i2 + 1;
        iArr2[i2] = id;
    }

    public void n2t(int stateId, C0397q set) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            t8rVar.bf2(stateId, set);
        }
        zwy();
        if (this.ax == stateId) {
            set.ki(this);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void n5r1(int motionScene) {
        t8r.toq toqVar;
        if (motionScene == 0) {
            this.bl = null;
            return;
        }
        try {
            t8r t8rVar = new t8r(getContext(), this, motionScene);
            this.bl = t8rVar;
            if (this.ax == -1) {
                this.ax = t8rVar.m1533r();
                this.ba = this.bl.m1533r();
                this.bq = this.bl.fn3e();
            }
            if (!isAttachedToWindow()) {
                this.bl = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.ule = display == null ? 0 : display.getRotation();
                t8r t8rVar2 = this.bl;
                if (t8rVar2 != null) {
                    C0397q c0397qKja0 = t8rVar2.kja0(this.ax);
                    this.bl.y9n(this);
                    ArrayList<MotionHelper> arrayList = this.zsl;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().toq(this);
                        }
                    }
                    if (c0397qKja0 != null) {
                        c0397qKja0.ki(this);
                    }
                    this.ba = this.ax;
                }
                ktq();
                ld6 ld6Var = this.kdv1;
                if (ld6Var != null) {
                    if (this.yf) {
                        post(new RunnableC0361k());
                        return;
                    } else {
                        ld6Var.m1408k();
                        return;
                    }
                }
                t8r t8rVar3 = this.bl;
                if (t8rVar3 == null || (toqVar = t8rVar3.f48306zy) == null || toqVar.o1t() != 4) {
                    return;
                }
                ixz();
                setState(qrj.SETUP);
                setState(qrj.MOVING);
            } catch (Exception e2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e2);
            }
        } catch (Exception e3) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e3);
        }
    }

    public void ngy(int viewTransitionId, View... view) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            t8rVar.m1536u(viewTransitionId, view);
        } else {
            Log.e(ph90, " no motionScene");
        }
    }

    @Override // androidx.core.view.gvn7
    public void ni7(@lvui View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (this.th6 || dxConsumed != 0 || dyConsumed != 0) {
            consumed[0] = consumed[0] + dxUnconsumed;
            consumed[1] = consumed[1] + dyUnconsumed;
        }
        this.th6 = false;
    }

    public void nsb(int id, int screenWidth, int screenHeight, int duration) {
        C0399y c0399y;
        int iM1706k;
        t8r t8rVar = this.bl;
        if (t8rVar != null && (c0399y = t8rVar.f48304toq) != null && (iM1706k = c0399y.m1706k(this.ax, id, screenWidth, screenHeight)) != -1) {
            id = iM1706k;
        }
        int i2 = this.ax;
        if (i2 == id) {
            return;
        }
        if (this.ba == id) {
            m1399v(0.0f);
            if (duration > 0) {
                this.aj = duration / 1000.0f;
                return;
            }
            return;
        }
        if (this.bq == id) {
            m1399v(1.0f);
            if (duration > 0) {
                this.aj = duration / 1000.0f;
                return;
            }
            return;
        }
        this.bq = id;
        if (i2 != -1) {
            setTransition(i2, id);
            m1399v(1.0f);
            this.k0 = 0.0f;
            ixz();
            if (duration > 0) {
                this.aj = duration / 1000.0f;
                return;
            }
            return;
        }
        this.dy = false;
        this.bc = 1.0f;
        this.bs = 0.0f;
        this.k0 = 0.0f;
        this.ar = getNanoTime();
        this.be = getNanoTime();
        this.bu = false;
        this.as = null;
        if (duration == -1) {
            this.aj = this.bl.m1529i() / 1000.0f;
        }
        this.ba = -1;
        this.bl.zp(-1, this.bq);
        SparseArray sparseArray = new SparseArray();
        if (duration == 0) {
            this.aj = this.bl.m1529i() / 1000.0f;
        } else if (duration > 0) {
            this.aj = duration / 1000.0f;
        }
        int childCount = getChildCount();
        this.ay.clear();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            this.ay.put(childAt, new kja0(childAt));
            sparseArray.put(childAt.getId(), this.ay.get(childAt));
        }
        this.bd = true;
        this.vl4.m1424y(this.f2621n, null, this.bl.kja0(id));
        cv06();
        this.vl4.m1421k();
        qo();
        int width = getWidth();
        int height = getHeight();
        if (this.zsl != null) {
            for (int i4 = 0; i4 < childCount; i4++) {
                kja0 kja0Var = this.ay.get(getChildAt(i4));
                if (kja0Var != null) {
                    this.bl.o1t(kja0Var);
                }
            }
            Iterator<MotionHelper> it = this.zsl.iterator();
            while (it.hasNext()) {
                it.next().zy(this, this.ay);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                kja0 kja0Var2 = this.ay.get(getChildAt(i5));
                if (kja0Var2 != null) {
                    kja0Var2.nn86(width, height, this.aj, getNanoTime());
                }
            }
        } else {
            for (int i6 = 0; i6 < childCount; i6++) {
                kja0 kja0Var3 = this.ay.get(getChildAt(i6));
                if (kja0Var3 != null) {
                    this.bl.o1t(kja0Var3);
                    kja0Var3.nn86(width, height, this.aj, getNanoTime());
                }
            }
        }
        float fLvui = this.bl.lvui();
        if (fLvui != 0.0f) {
            float fMin = Float.MAX_VALUE;
            float fMax = -3.4028235E38f;
            for (int i7 = 0; i7 < childCount; i7++) {
                kja0 kja0Var4 = this.ay.get(getChildAt(i7));
                float fFn3e = kja0Var4.fn3e() + kja0Var4.m1471i();
                fMin = Math.min(fMin, fFn3e);
                fMax = Math.max(fMax, fFn3e);
            }
            for (int i8 = 0; i8 < childCount; i8++) {
                kja0 kja0Var5 = this.ay.get(getChildAt(i8));
                float fM1471i = kja0Var5.m1471i();
                float fFn3e2 = kja0Var5.fn3e();
                kja0Var5.f48151kja0 = 1.0f / (1.0f - fLvui);
                kja0Var5.f48155n7h = fLvui - ((((fM1471i + fFn3e2) - fMin) * fLvui) / (fMax - fMin));
            }
        }
        this.bs = 0.0f;
        this.k0 = 0.0f;
        this.bd = true;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        t8r.toq toqVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.ule = display.getRotation();
        }
        t8r t8rVar = this.bl;
        if (t8rVar != null && (i2 = this.ax) != -1) {
            C0397q c0397qKja0 = t8rVar.kja0(i2);
            this.bl.y9n(this);
            ArrayList<MotionHelper> arrayList = this.zsl;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().toq(this);
                }
            }
            if (c0397qKja0 != null) {
                c0397qKja0.ki(this);
            }
            this.ba = this.ax;
        }
        ktq();
        ld6 ld6Var = this.kdv1;
        if (ld6Var != null) {
            if (this.yf) {
                post(new RunnableC0364q());
                return;
            } else {
                ld6Var.m1408k();
                return;
            }
        }
        t8r t8rVar2 = this.bl;
        if (t8rVar2 == null || (toqVar = t8rVar2.f48306zy) == null || toqVar.o1t() != 4) {
            return;
        }
        ixz();
        setState(qrj.SETUP);
        setState(qrj.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        zurt zurtVarOc;
        int iT8r;
        RectF rectFKi;
        t8r t8rVar = this.bl;
        if (t8rVar != null && this.am) {
            wvg wvgVar = t8rVar.f48303t8r;
            if (wvgVar != null) {
                wvgVar.x2(event);
            }
            t8r.toq toqVar = this.bl.f48306zy;
            if (toqVar != null && toqVar.eqxt() && (zurtVarOc = toqVar.oc()) != null && ((event.getAction() != 0 || (rectFKi = zurtVarOc.ki(this, new RectF())) == null || rectFKi.contains(event.getX(), event.getY())) && (iT8r = zurtVarOc.t8r()) != -1)) {
                View view = this.qnoq;
                if (view == null || view.getId() != iT8r) {
                    this.qnoq = findViewById(iT8r);
                }
                if (this.qnoq != null) {
                    this.smyf.set(r0.getLeft(), this.qnoq.getTop(), this.qnoq.getRight(), this.qnoq.getBottom());
                    if (this.smyf.contains(event.getX(), event.getY()) && !yqrt(this.qnoq.getLeft(), this.qnoq.getTop(), this.qnoq, event)) {
                        return onTouchEvent(event);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        this.cecm = true;
        try {
            if (this.bl == null) {
                super.onLayout(changed, left, top, right, bottom);
                return;
            }
            int i2 = right - left;
            int i3 = bottom - top;
            if (this.cw14 != i2 || this.xy8 != i3) {
                cv06();
                gbni(true);
            }
            this.cw14 = i2;
            this.xy8 = i3;
            this.mjvl = i2;
            this.hp = i3;
        } finally {
            this.cecm = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.bl == null) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            return;
        }
        boolean z2 = false;
        boolean z3 = (this.ac == widthMeasureSpec && this.ad == heightMeasureSpec) ? false : true;
        if (this.w7wd) {
            this.w7wd = false;
            ktq();
            b3e();
            z3 = true;
        }
        if (this.f2615h) {
            z3 = true;
        }
        this.ac = widthMeasureSpec;
        this.ad = heightMeasureSpec;
        int iM1533r = this.bl.m1533r();
        int iFn3e = this.bl.fn3e();
        if ((z3 || this.vl4.m1423s(iM1533r, iFn3e)) && this.ba != -1) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            this.vl4.m1424y(this.f2621n, this.bl.kja0(iM1533r), this.bl.kja0(iFn3e));
            this.vl4.ld6();
            this.vl4.x2(iM1533r, iFn3e);
        } else {
            if (z3) {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
            z2 = true;
        }
        if (this.oyp || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int iM1313a = this.f2621n.m1313a() + getPaddingLeft() + getPaddingRight();
            int iJk = this.f2621n.jk() + paddingTop;
            int i2 = this.us2t;
            if (i2 == Integer.MIN_VALUE || i2 == 0) {
                iM1313a = (int) (this.eht + (this.a7kc * (this.lw58 - r8)));
                requestLayout();
            }
            int i3 = this.nq0z;
            if (i3 == Integer.MIN_VALUE || i3 == 0) {
                iJk = (int) (this.n5ij + (this.a7kc * (this.fn2 - r8)));
                requestLayout();
            }
            setMeasuredDimension(iM1313a, iJk);
        }
        zsr0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedFling(@lvui View target, float velocityX, float velocityY, boolean consumed) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(@lvui View target, float velocityX, float velocityY) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int layoutDirection) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            t8rVar.m1524a(m1623l());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        t8r t8rVar = this.bl;
        if (t8rVar == null || !this.am || !t8rVar.lv5()) {
            return super.onTouchEvent(event);
        }
        t8r.toq toqVar = this.bl.f48306zy;
        if (toqVar != null && !toqVar.eqxt()) {
            return super.onTouchEvent(event);
        }
        this.bl.ek5k(event, getCurrentState(), this);
        if (this.bl.f48306zy.d2ok(4)) {
            return this.bl.f48306zy.oc().m1587i();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.xhv == null) {
                this.xhv = new CopyOnWriteArrayList<>();
            }
            this.xhv.add(motionHelper);
            if (motionHelper.mo1388s()) {
                if (this.ei == null) {
                    this.ei = new ArrayList<>();
                }
                this.ei.add(motionHelper);
            }
            if (motionHelper.mo1386p()) {
                if (this.wra == null) {
                    this.wra = new ArrayList<>();
                }
                this.wra.add(motionHelper);
            }
            if (motionHelper.ld6()) {
                if (this.zsl == null) {
                    this.zsl = new ArrayList<>();
                }
                this.zsl.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.ei;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.wra;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void pc(int id, int duration) {
        if (isAttachedToWindow()) {
            nsb(id, -1, -1, duration);
            return;
        }
        if (this.kdv1 == null) {
            this.kdv1 = new ld6();
        }
        this.kdv1.m1410q(id);
    }

    public void pjz9(int stateId, C0397q set, int duration) {
        if (this.bl != null && this.ax == stateId) {
            int i2 = C0394g.f7l8.zxq;
            n2t(i2, v0af(stateId));
            setState(i2, -1, -1);
            n2t(stateId, set);
            t8r.toq toqVar = new t8r.toq(-1, this.bl, i2, stateId);
            toqVar.dd(duration);
            setTransition(toqVar);
            ixz();
        }
    }

    public void r8s8(int triggerId, boolean positive, float progress) {
        x2 x2Var = this.w97r;
        if (x2Var != null) {
            x2Var.mo1389y(this, triggerId, positive, progress);
        }
        CopyOnWriteArrayList<x2> copyOnWriteArrayList = this.xhv;
        if (copyOnWriteArrayList != null) {
            Iterator<x2> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().mo1389y(this, triggerId, positive, progress);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        t8r t8rVar;
        t8r.toq toqVar;
        if (!this.oyp && this.ax == -1 && (t8rVar = this.bl) != null && (toqVar = t8rVar.f48306zy) != null) {
            int iA9 = toqVar.a9();
            if (iA9 == 0) {
                return;
            }
            if (iA9 == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.ay.get(getChildAt(i2)).x9kr();
                }
                return;
            }
        }
        super.requestLayout();
    }

    public boolean se() {
        return this.l2jk;
    }

    public void setDebugMode(int debugMode) {
        this.zmmu = debugMode;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean delayedApply) {
        this.yf = delayedApply;
    }

    public void setInteractionEnabled(boolean enabled) {
        this.am = enabled;
    }

    public void setInterpolatedProgress(float pos) {
        if (this.bl != null) {
            setState(qrj.MOVING);
            Interpolator interpolatorFu4 = this.bl.fu4();
            if (interpolatorFu4 != null) {
                setProgress(interpolatorFu4.getInterpolation(pos));
                return;
            }
        }
        setProgress(pos);
    }

    public void setOnHide(float progress) {
        ArrayList<MotionHelper> arrayList = this.wra;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.wra.get(i2).setProgress(progress);
            }
        }
    }

    public void setOnShow(float progress) {
        ArrayList<MotionHelper> arrayList = this.ei;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.ei.get(i2).setProgress(progress);
            }
        }
    }

    public void setProgress(float pos, float velocity) {
        if (!isAttachedToWindow()) {
            if (this.kdv1 == null) {
                this.kdv1 = new ld6();
            }
            this.kdv1.m1409n(pos);
            this.kdv1.m1411y(velocity);
            return;
        }
        setProgress(pos);
        setState(qrj.MOVING);
        this.az = velocity;
        if (velocity != 0.0f) {
            m1399v(velocity > 0.0f ? 1.0f : 0.0f);
        } else {
            if (pos == 0.0f || pos == 1.0f) {
                return;
            }
            m1399v(pos > 0.5f ? 1.0f : 0.0f);
        }
    }

    public void setScene(t8r scene) {
        this.bl = scene;
        scene.m1524a(m1623l());
        cv06();
    }

    void setStartState(int beginId) {
        if (isAttachedToWindow()) {
            this.ax = beginId;
            return;
        }
        if (this.kdv1 == null) {
            this.kdv1 = new ld6();
        }
        this.kdv1.m1407g(beginId);
        this.kdv1.m1410q(beginId);
    }

    void setState(qrj newState) {
        qrj qrjVar = qrj.FINISHED;
        if (newState == qrjVar && this.ax == -1) {
            return;
        }
        qrj qrjVar2 = this.v62;
        this.v62 = newState;
        qrj qrjVar3 = qrj.MOVING;
        if (qrjVar2 == qrjVar3 && newState == qrjVar3) {
            py();
        }
        int i2 = C0362n.f2209k[qrjVar2.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 && newState == qrjVar) {
                i9jn();
                return;
            }
            return;
        }
        if (newState == qrjVar3) {
            py();
        }
        if (newState == qrjVar) {
            i9jn();
        }
    }

    public void setTransition(int beginId, int endId) {
        if (!isAttachedToWindow()) {
            if (this.kdv1 == null) {
                this.kdv1 = new ld6();
            }
            this.kdv1.m1407g(beginId);
            this.kdv1.m1410q(endId);
            return;
        }
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            this.ba = beginId;
            this.bq = endId;
            t8rVar.zp(beginId, endId);
            this.vl4.m1424y(this.f2621n, this.bl.kja0(beginId), this.bl.kja0(endId));
            cv06();
            this.k0 = 0.0f;
            ukdy();
        }
    }

    public void setTransitionDuration(int milliseconds) {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            Log.e(ph90, "MotionScene not defined");
        } else {
            t8rVar.i1(milliseconds);
        }
    }

    public void setTransitionListener(x2 listener) {
        this.w97r = listener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.kdv1 == null) {
            this.kdv1 = new ld6();
        }
        this.kdv1.f7l8(bundle);
        if (isAttachedToWindow()) {
            this.kdv1.m1408k();
        }
    }

    public void sok(boolean showPaths) {
        this.zmmu = showPaths ? 2 : 1;
        invalidate();
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.zy.m1601s(context, this.ba) + "->" + androidx.constraintlayout.motion.widget.zy.m1601s(context, this.bq) + " (pos:" + this.k0 + " Dpos/Dt:" + this.az;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uc(int r10, float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.uc(int, float, float):void");
    }

    int uj2j(String id) {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return 0;
        }
        return t8rVar.lrht(id);
    }

    public void ukdy() {
        m1399v(0.0f);
    }

    /* JADX INFO: renamed from: v */
    void m1399v(float position) {
        if (this.bl == null) {
            return;
        }
        float f2 = this.k0;
        float f3 = this.bs;
        if (f2 != f3 && this.bu) {
            this.k0 = f3;
        }
        float f4 = this.k0;
        if (f4 == position) {
            return;
        }
        this.dy = false;
        this.bc = position;
        this.aj = r0.m1529i() / 1000.0f;
        setProgress(this.bc);
        this.as = null;
        this.bg = this.bl.fu4();
        this.bu = false;
        this.be = getNanoTime();
        this.bd = true;
        this.bs = f4;
        this.k0 = f4;
        invalidate();
    }

    public C0397q v0af(int id) {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return null;
        }
        return t8rVar.kja0(id);
    }

    @hyr(api = 17)
    public void vep5(int id, int duration) {
        this.l2jk = true;
        this.p2c = getWidth();
        this.lr4 = getHeight();
        int rotation = getDisplay().getRotation();
        this.bsb = (rotation + 1) % 4 <= (this.ule + 1) % 4 ? 2 : 1;
        this.ule = rotation;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0351n c0351n = this.q09.get(childAt);
            if (c0351n == null) {
                c0351n = new C0351n();
                this.q09.put(childAt, c0351n);
            }
            c0351n.m1380k(childAt);
        }
        this.ba = -1;
        this.bq = id;
        this.bl.zp(-1, id);
        this.vl4.m1424y(this.f2621n, null, this.bl.kja0(this.bq));
        this.bs = 0.0f;
        this.k0 = 0.0f;
        invalidate();
        m28240do(new toq());
        if (duration > 0) {
            this.aj = duration / 1000.0f;
        }
    }

    public t8r.toq w831(int id) {
        return this.bl.dd(id);
    }

    void was(boolean start) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            kja0 kja0Var = this.ay.get(getChildAt(i2));
            if (kja0Var != null) {
                kja0Var.m1477s(start);
            }
        }
    }

    void wo(boolean disable) {
        t8r t8rVar = this.bl;
        if (t8rVar == null) {
            return;
        }
        t8rVar.ld6(disable);
    }

    public void wx16(float position, float currentVelocity) {
        if (this.bl == null || this.k0 == position) {
            return;
        }
        this.dy = true;
        this.be = getNanoTime();
        this.aj = this.bl.m1529i() / 1000.0f;
        this.bc = position;
        this.bd = true;
        this.vb6.m1381g(this.k0, position, currentVelocity, this.bl.oc(), this.bl.eqxt(), this.bl.d3(), this.bl.d2ok(), this.bl.gvn7());
        int i2 = this.ax;
        this.bc = position;
        this.ax = i2;
        this.as = this.vb6;
        this.bu = false;
        this.be = getNanoTime();
        invalidate();
    }

    public void xwq3(x2 listener) {
        if (this.xhv == null) {
            this.xhv = new CopyOnWriteArrayList<>();
        }
        this.xhv.add(listener);
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@lvui View child, @lvui View target, int axes, int type) {
        t8r.toq toqVar;
        t8r t8rVar = this.bl;
        return (t8rVar == null || (toqVar = t8rVar.f48306zy) == null || toqVar.oc() == null || (this.bl.f48306zy.oc().m1585g() & 2) != 0) ? false : true;
    }

    public void z4(View view, float posOnViewX, float posOnViewY, float[] returnVelocity, int type) {
        float f2;
        float fMo1382k = this.az;
        float f3 = this.k0;
        if (this.as != null) {
            float fSignum = Math.signum(this.bc - f3);
            float interpolation = this.as.getInterpolation(this.k0 + vfa);
            float interpolation2 = this.as.getInterpolation(this.k0);
            fMo1382k = (fSignum * ((interpolation - interpolation2) / vfa)) / this.aj;
            f2 = interpolation2;
        } else {
            f2 = f3;
        }
        Interpolator interpolator = this.as;
        if (interpolator instanceof cdj) {
            fMo1382k = ((cdj) interpolator).mo1382k();
        }
        kja0 kja0Var = this.ay.get(view);
        if ((type & 1) == 0) {
            kja0Var.mcp(f2, view.getWidth(), view.getHeight(), posOnViewX, posOnViewY, returnVelocity);
        } else {
            kja0Var.m1470h(f2, posOnViewX, posOnViewY, returnVelocity);
        }
        if (type < 2) {
            returnVelocity[0] = returnVelocity[0] * fMo1382k;
            returnVelocity[1] = returnVelocity[1] * fMo1382k;
        }
    }

    public boolean zkd(int viewTransitionId) {
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            return t8rVar.m1526f(viewTransitionId);
        }
        return false;
    }

    public void zwy() {
        this.vl4.m1424y(this.f2621n, this.bl.kja0(this.ba), this.bl.kja0(this.bq));
        cv06();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int id, int screenWidth, int screenHeight) {
        setState(qrj.SETUP);
        this.ax = id;
        this.ba = -1;
        this.bq = -1;
        androidx.constraintlayout.widget.toq toqVar = this.f2627t;
        if (toqVar != null) {
            toqVar.m1701n(id, screenWidth, screenHeight);
            return;
        }
        t8r t8rVar = this.bl;
        if (t8rVar != null) {
            t8rVar.kja0(id).ki(this);
        }
    }

    public void setProgress(float pos) {
        if (pos < 0.0f || pos > 1.0f) {
            Log.w(ph90, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.kdv1 == null) {
                this.kdv1 = new ld6();
            }
            this.kdv1.m1409n(pos);
            return;
        }
        if (pos <= 0.0f) {
            if (this.k0 == 1.0f && this.ax == this.bq) {
                setState(qrj.MOVING);
            }
            this.ax = this.ba;
            if (this.k0 == 0.0f) {
                setState(qrj.FINISHED);
            }
        } else if (pos >= 1.0f) {
            if (this.k0 == 0.0f && this.ax == this.ba) {
                setState(qrj.MOVING);
            }
            this.ax = this.bq;
            if (this.k0 == 1.0f) {
                setState(qrj.FINISHED);
            }
        } else {
            this.ax = -1;
            setState(qrj.MOVING);
        }
        if (this.bl == null) {
            return;
        }
        this.bu = true;
        this.bc = pos;
        this.bs = pos;
        this.ar = -1L;
        this.be = -1L;
        this.as = null;
        this.bd = true;
        invalidate();
    }

    public void setTransition(int transitionId) {
        if (this.bl != null) {
            t8r.toq toqVarW831 = w831(transitionId);
            this.ba = toqVarW831.d3();
            this.bq = toqVarW831.m1554t();
            if (!isAttachedToWindow()) {
                if (this.kdv1 == null) {
                    this.kdv1 = new ld6();
                }
                this.kdv1.m1407g(this.ba);
                this.kdv1.m1410q(this.bq);
                return;
            }
            float f2 = Float.NaN;
            int i2 = this.ax;
            if (i2 == this.ba) {
                f2 = 0.0f;
            } else if (i2 == this.bq) {
                f2 = 1.0f;
            }
            this.bl.m1537x(toqVarW831);
            this.vl4.m1424y(this.f2621n, this.bl.kja0(this.ba), this.bl.kja0(this.bq));
            cv06();
            if (this.k0 != f2) {
                if (f2 == 0.0f) {
                    was(true);
                    this.bl.kja0(this.ba).ki(this);
                } else if (f2 == 1.0f) {
                    was(false);
                    this.bl.kja0(this.bq).ki(this);
                }
            }
            this.k0 = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                Log.v(ph90, androidx.constraintlayout.motion.widget.zy.f7l8() + " transitionToStart ");
                ukdy();
                return;
            }
            setProgress(f2);
        }
    }

    protected void setTransition(t8r.toq transition) {
        this.bl.m1537x(transition);
        setState(qrj.SETUP);
        if (this.ax == this.bl.fn3e()) {
            this.k0 = 1.0f;
            this.bs = 1.0f;
            this.bc = 1.0f;
        } else {
            this.k0 = 0.0f;
            this.bs = 0.0f;
            this.bc = 0.0f;
        }
        this.ar = transition.d2ok(1) ? -1L : getNanoTime();
        int iM1533r = this.bl.m1533r();
        int iFn3e = this.bl.fn3e();
        if (iM1533r == this.ba && iFn3e == this.bq) {
            return;
        }
        this.ba = iM1533r;
        this.bq = iFn3e;
        this.bl.zp(iM1533r, iFn3e);
        this.vl4.m1424y(this.f2621n, this.bl.kja0(this.ba), this.bl.kja0(this.bq));
        this.vl4.x2(this.ba, this.bq);
        this.vl4.ld6();
        cv06();
    }

    public MotionLayout(@lvui Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        this.bg = null;
        this.az = 0.0f;
        this.ba = -1;
        this.ax = -1;
        this.bq = -1;
        this.ac = 0;
        this.ad = 0;
        this.am = true;
        this.ay = new HashMap<>();
        this.be = 0L;
        this.aj = 1.0f;
        this.bs = 0.0f;
        this.k0 = 0.0f;
        this.bc = 0.0f;
        this.bd = false;
        this.tlhn = false;
        this.zmmu = 0;
        this.dy = false;
        this.vb6 = new androidx.constraintlayout.motion.utils.toq();
        this.k6e = new C0360g();
        this.s8y = true;
        this.th6 = false;
        this.zr5t = false;
        this.ei = null;
        this.wra = null;
        this.zsl = null;
        this.xhv = null;
        this.zm = 0;
        this.ut = -1L;
        this.wh6 = 0.0f;
        this.ls9 = 0;
        this.qns = 0.0f;
        this.afw = false;
        this.oyp = false;
        this.k84 = new androidx.constraintlayout.core.motion.utils.f7l8();
        this.cecm = false;
        this.h06 = null;
        this.gjxq = null;
        this.r7v2 = 0;
        this.l2jk = false;
        this.bsb = 0;
        this.q09 = new HashMap<>();
        this.v3 = new Rect();
        this.yf = false;
        this.v62 = qrj.UNDEFINED;
        this.vl4 = new C0366y();
        this.w7wd = false;
        this.smyf = new RectF();
        this.qnoq = null;
        this.deb = null;
        this.u6 = new ArrayList<>();
        kcsr(attrs);
    }

    public MotionLayout(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.bg = null;
        this.az = 0.0f;
        this.ba = -1;
        this.ax = -1;
        this.bq = -1;
        this.ac = 0;
        this.ad = 0;
        this.am = true;
        this.ay = new HashMap<>();
        this.be = 0L;
        this.aj = 1.0f;
        this.bs = 0.0f;
        this.k0 = 0.0f;
        this.bc = 0.0f;
        this.bd = false;
        this.tlhn = false;
        this.zmmu = 0;
        this.dy = false;
        this.vb6 = new androidx.constraintlayout.motion.utils.toq();
        this.k6e = new C0360g();
        this.s8y = true;
        this.th6 = false;
        this.zr5t = false;
        this.ei = null;
        this.wra = null;
        this.zsl = null;
        this.xhv = null;
        this.zm = 0;
        this.ut = -1L;
        this.wh6 = 0.0f;
        this.ls9 = 0;
        this.qns = 0.0f;
        this.afw = false;
        this.oyp = false;
        this.k84 = new androidx.constraintlayout.core.motion.utils.f7l8();
        this.cecm = false;
        this.h06 = null;
        this.gjxq = null;
        this.r7v2 = 0;
        this.l2jk = false;
        this.bsb = 0;
        this.q09 = new HashMap<>();
        this.v3 = new Rect();
        this.yf = false;
        this.v62 = qrj.UNDEFINED;
        this.vl4 = new C0366y();
        this.w7wd = false;
        this.smyf = new RectF();
        this.qnoq = null;
        this.deb = null;
        this.u6 = new ArrayList<>();
        kcsr(attrs);
    }
}
