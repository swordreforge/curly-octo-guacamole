package com.google.android.material.transition.platform;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.C0683f;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.C4058z;
import com.google.android.material.shape.C4108p;
import com.google.android.material.transition.platform.zurt;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7843t;
import zy.dd;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MaterialContainerTransform.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
public final class x2 extends Transition {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f68004ab = 2;
    private static final C4215g ad;
    private static final float am = -1.0f;
    public static final int an = 3;
    public static final int bb = 0;
    public static final int bl = 2;
    public static final int bp = 1;
    private static final C4215g bq;
    public static final int bv = 2;

    /* JADX INFO: renamed from: d */
    public static final int f25522d = 0;
    public static final int id = 0;
    public static final int in = 1;

    /* JADX INFO: renamed from: w */
    public static final int f25523w = 1;

    /* JADX INFO: renamed from: a */
    @dd
    private C4217n f25524a;

    /* JADX INFO: renamed from: b */
    @dd
    private C4217n f25525b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private float f68005bo;

    /* JADX INFO: renamed from: c */
    @dd
    private View f25526c;

    /* JADX INFO: renamed from: e */
    @dd
    private View f25527e;

    /* JADX INFO: renamed from: f */
    private int f25528f;

    /* JADX INFO: renamed from: g */
    private boolean f25529g;

    /* JADX INFO: renamed from: h */
    @zy.x2
    private int f25530h;

    /* JADX INFO: renamed from: i */
    @zy.x2
    private int f25531i;

    /* JADX INFO: renamed from: j */
    @dd
    private com.google.android.material.shape.kja0 f25532j;

    /* JADX INFO: renamed from: k */
    private boolean f25533k;

    /* JADX INFO: renamed from: l */
    private int f25534l;

    /* JADX INFO: renamed from: m */
    @dd
    private C4217n f25535m;

    /* JADX INFO: renamed from: n */
    private boolean f25536n;

    /* JADX INFO: renamed from: o */
    @dd
    private com.google.android.material.shape.kja0 f25537o;

    /* JADX INFO: renamed from: p */
    @InterfaceC7843t
    private int f25538p;

    /* JADX INFO: renamed from: q */
    private boolean f25539q;

    /* JADX INFO: renamed from: r */
    private int f25540r;

    /* JADX INFO: renamed from: s */
    @InterfaceC7843t
    private int f25541s;

    /* JADX INFO: renamed from: t */
    @zy.x2
    private int f25542t;

    /* JADX INFO: renamed from: u */
    private boolean f25543u;

    /* JADX INFO: renamed from: v */
    private float f25544v;

    /* JADX INFO: renamed from: x */
    @dd
    private C4217n f25545x;

    /* JADX INFO: renamed from: y */
    @InterfaceC7843t
    private int f25546y;

    /* JADX INFO: renamed from: z */
    @zy.x2
    private int f25547z;
    private static final String as = x2.class.getSimpleName();
    private static final String bg = "materialContainerTransition:bounds";
    private static final String az = "materialContainerTransition:shapeAppearance";
    private static final String[] ba = {bg, az};
    private static final C4215g ax = new C4215g(new C4217n(0.0f, 0.25f), new C4217n(0.0f, 1.0f), new C4217n(0.0f, 1.0f), new C4217n(0.0f, 0.75f), null);
    private static final C4215g ac = new C4215g(new C4217n(0.1f, 0.4f), new C4217n(0.1f, 1.0f), new C4217n(0.1f, 1.0f), new C4217n(0.1f, 0.9f), null);

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$g */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    private static class C4215g {

        /* JADX INFO: renamed from: k */
        @lvui
        private final C4217n f25548k;

        /* JADX INFO: renamed from: q */
        @lvui
        private final C4217n f25549q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private final C4217n f68006toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private final C4217n f68007zy;

        /* synthetic */ C4215g(C4217n c4217n, C4217n c4217n2, C4217n c4217n3, C4217n c4217n4, C4216k c4216k) {
            this(c4217n, c4217n2, c4217n3, c4217n4);
        }

        private C4215g(@lvui C4217n c4217n, @lvui C4217n c4217n2, @lvui C4217n c4217n3, @lvui C4217n c4217n4) {
            this.f25548k = c4217n;
            this.f68006toq = c4217n2;
            this.f68007zy = c4217n3;
            this.f25549q = c4217n4;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$k */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    class C4216k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C4219y f25550k;

        C4216k(C4219y c4219y) {
            this.f25550k = c4219y;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25550k.kja0(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$n */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public static class C4217n {

        /* JADX INFO: renamed from: k */
        @zy.zurt(from = 0.0d, to = 1.0d)
        private final float f25552k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.zurt(from = 0.0d, to = 1.0d)
        private final float f68008toq;

        public C4217n(@zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3) {
            this.f25552k = f2;
            this.f68008toq = f3;
        }

        @zy.zurt(from = 0.0d, to = 1.0d)
        /* JADX INFO: renamed from: q */
        public float m15251q() {
            return this.f25552k;
        }

        @zy.zurt(from = 0.0d, to = 1.0d)
        public float zy() {
            return this.f68008toq;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$q */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4218q {
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    class toq extends fn3e {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25553k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f25555q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ C4219y f68009toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ View f68010zy;

        toq(View view, C4219y c4219y, View view2, View view3) {
            this.f25553k = view;
            this.f68009toq = c4219y;
            this.f68010zy = view2;
            this.f25555q = view3;
        }

        @Override // com.google.android.material.transition.platform.fn3e, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@lvui Transition transition) {
            x2.this.removeListener(this);
            if (x2.this.f25539q) {
                return;
            }
            this.f68010zy.setAlpha(1.0f);
            this.f25555q.setAlpha(1.0f);
            C4058z.m14627s(this.f25553k).toq(this.f68009toq);
        }

        @Override // com.google.android.material.transition.platform.fn3e, android.transition.Transition.TransitionListener
        public void onTransitionStart(@lvui Transition transition) {
            C4058z.m14627s(this.f25553k).mo14541k(this.f68009toq);
            this.f68010zy.setAlpha(0.0f);
            this.f25555q.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$y */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    private static final class C4219y extends Drawable {

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private static final float f68011dd = 0.3f;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        private static final int f68012lvui = 754974720;

        /* JADX INFO: renamed from: r */
        private static final int f25556r = -7829368;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        private static final float f68013x9kr = 1.5f;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private final Paint f68014a9;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private final float[] f68015cdj;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        private float f68016d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private RectF f68017d3;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private float f68018eqxt;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final com.google.android.material.shape.kja0 f68019f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private final boolean f68020fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private final Path f68021fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private final RectF f68022fu4;

        /* JADX INFO: renamed from: g */
        private final RectF f25557g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private C4220y f68023gvn7;

        /* JADX INFO: renamed from: h */
        private final float f25558h;

        /* JADX INFO: renamed from: i */
        private final float f25559i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private final boolean f68024jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private com.google.android.material.transition.platform.zy f68025jp0y;

        /* JADX INFO: renamed from: k */
        private final View f25560k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private final boolean f68026ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private final PathMeasure f68027kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private final Paint f68028ld6;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private final InterfaceC4201g f68029mcp;

        /* JADX INFO: renamed from: n */
        private final View f25561n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private final C4206p f68030n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private final RectF f68031ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private final RectF f68032o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private float f68033oc;

        /* JADX INFO: renamed from: p */
        private final Paint f25562p;

        /* JADX INFO: renamed from: q */
        private final float f25563q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private final Paint f68034qrj;

        /* JADX INFO: renamed from: s */
        private final Paint f25564s;

        /* JADX INFO: renamed from: t */
        private final InterfaceC4204k f25565t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private final float f68035t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final RectF f68036toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private final C4215g f68037wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private final Paint f68038x2;

        /* JADX INFO: renamed from: y */
        private final float f25566y;

        /* JADX INFO: renamed from: z */
        private final RectF f25567z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private final C4108p f68039zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.android.material.shape.kja0 f68040zy;

        /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$y$k */
        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        class k implements zurt.zy {
            k() {
            }

            @Override // com.google.android.material.transition.platform.zurt.zy
            /* JADX INFO: renamed from: k */
            public void mo15260k(Canvas canvas) {
                C4219y.this.f25560k.draw(canvas);
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.transition.platform.x2$y$toq */
        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        class toq implements zurt.zy {
            toq() {
            }

            @Override // com.google.android.material.transition.platform.zurt.zy
            /* JADX INFO: renamed from: k */
            public void mo15260k(Canvas canvas) {
                C4219y.this.f25561n.draw(canvas);
            }
        }

        /* synthetic */ C4219y(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.kja0 kja0Var, float f2, View view2, RectF rectF2, com.google.android.material.shape.kja0 kja0Var2, float f3, int i2, int i3, int i4, int i5, boolean z2, boolean z3, InterfaceC4204k interfaceC4204k, InterfaceC4201g interfaceC4201g, C4215g c4215g, boolean z5, C4216k c4216k) {
            this(pathMotion, view, rectF, kja0Var, f2, view2, rectF2, kja0Var2, f3, i2, i3, i4, i5, z2, z3, interfaceC4204k, interfaceC4201g, c4215g, z5);
        }

        private void f7l8(Canvas canvas, RectF rectF, @zy.x2 int i2) {
            this.f68014a9.setColor(i2);
            canvas.drawRect(rectF, this.f68014a9);
        }

        /* JADX INFO: renamed from: g */
        private void m15252g(Canvas canvas, RectF rectF, Path path, @zy.x2 int i2) {
            PointF pointFQrj = qrj(rectF);
            if (this.f68016d2ok == 0.0f) {
                path.reset();
                path.moveTo(pointFQrj.x, pointFQrj.y);
            } else {
                path.lineTo(pointFQrj.x, pointFQrj.y);
                this.f68014a9.setColor(i2);
                canvas.drawPath(path, this.f68014a9);
            }
        }

        /* JADX INFO: renamed from: h */
        private void m15253h(float f2) {
            float f3;
            float f4;
            this.f68016d2ok = f2;
            this.f68034qrj.setAlpha((int) (this.f68026ki ? zurt.ld6(0.0f, 255.0f, f2) : zurt.ld6(255.0f, 0.0f, f2)));
            this.f68027kja0.getPosTan(this.f25558h * f2, this.f68015cdj, null);
            float[] fArr = this.f68015cdj;
            float f5 = fArr[0];
            float f6 = fArr[1];
            if (f2 > 1.0f || f2 < 0.0f) {
                if (f2 > 1.0f) {
                    f3 = 0.99f;
                    f4 = (f2 - 1.0f) / 0.00999999f;
                } else {
                    f3 = 0.01f;
                    f4 = (f2 / 0.01f) * (-1.0f);
                }
                this.f68027kja0.getPosTan(this.f25558h * f3, fArr, null);
                float[] fArr2 = this.f68015cdj;
                f5 += (f5 - fArr2[0]) * f4;
                f6 += (f6 - fArr2[1]) * f4;
            }
            float f7 = f5;
            float f8 = f6;
            C4220y c4220yMo15191k = this.f68029mcp.mo15191k(f2, ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68037wvg.f68006toq.f25552k))).floatValue(), ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68037wvg.f68006toq.f68008toq))).floatValue(), this.f68036toq.width(), this.f68036toq.height(), this.f25557g.width(), this.f25557g.height());
            this.f68023gvn7 = c4220yMo15191k;
            RectF rectF = this.f68031ni7;
            float f9 = c4220yMo15191k.f68042zy;
            rectF.set(f7 - (f9 / 2.0f), f8, (f9 / 2.0f) + f7, c4220yMo15191k.f25573q + f8);
            RectF rectF2 = this.f25567z;
            C4220y c4220y = this.f68023gvn7;
            float f10 = c4220y.f25572n;
            rectF2.set(f7 - (f10 / 2.0f), f8, f7 + (f10 / 2.0f), c4220y.f25570g + f8);
            this.f68022fu4.set(this.f68031ni7);
            this.f68032o1t.set(this.f25567z);
            float fFloatValue = ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68037wvg.f68007zy.f25552k))).floatValue();
            float fFloatValue2 = ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68037wvg.f68007zy.f68008toq))).floatValue();
            boolean qVar = this.f68029mcp.toq(this.f68023gvn7);
            RectF rectF3 = qVar ? this.f68022fu4 : this.f68032o1t;
            float fX2 = zurt.x2(0.0f, 1.0f, fFloatValue, fFloatValue2, f2);
            if (!qVar) {
                fX2 = 1.0f - fX2;
            }
            this.f68029mcp.zy(rectF3, fX2, this.f68023gvn7);
            this.f68017d3 = new RectF(Math.min(this.f68022fu4.left, this.f68032o1t.left), Math.min(this.f68022fu4.top, this.f68032o1t.top), Math.max(this.f68022fu4.right, this.f68032o1t.right), Math.max(this.f68022fu4.bottom, this.f68032o1t.bottom));
            this.f68030n7h.toq(f2, this.f68040zy, this.f68019f7l8, this.f68031ni7, this.f68022fu4, this.f68032o1t, this.f68037wvg.f25549q);
            this.f68033oc = zurt.ld6(this.f25563q, this.f25566y, f2);
            float fM15257q = m15257q(this.f68017d3, this.f68035t8r);
            float fM15255n = m15255n(this.f68017d3, this.f25559i);
            float f11 = this.f68033oc;
            float f12 = (int) (fM15255n * f11);
            this.f68018eqxt = f12;
            this.f68038x2.setShadowLayer(f11, (int) (fM15257q * f11), f12, f68012lvui);
            this.f68025jp0y = this.f25565t.mo15200k(f2, ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68037wvg.f25548k.f25552k))).floatValue(), ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68037wvg.f25548k.f68008toq))).floatValue(), 0.35f);
            if (this.f25562p.getColor() != 0) {
                this.f25562p.setAlpha(this.f68025jp0y.f25581k);
            }
            if (this.f68028ld6.getColor() != 0) {
                this.f68028ld6.setAlpha(this.f68025jp0y.f68047toq);
            }
            invalidateSelf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kja0(float f2) {
            if (this.f68016d2ok != f2) {
                m15253h(f2);
            }
        }

        private void ld6(Canvas canvas) {
            n7h(canvas, this.f68028ld6);
            Rect bounds = getBounds();
            RectF rectF = this.f25567z;
            zurt.ni7(canvas, bounds, rectF.left, rectF.top, this.f68023gvn7.f68041toq, this.f68025jp0y.f68047toq, new toq());
        }

        /* JADX INFO: renamed from: n */
        private static float m15255n(RectF rectF, float f2) {
            return (rectF.centerY() / f2) * 1.5f;
        }

        private void n7h(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: renamed from: p */
        private void m15256p(Canvas canvas) {
            com.google.android.material.shape.kja0 kja0VarZy = this.f68030n7h.zy();
            if (!kja0VarZy.fn3e(this.f68017d3)) {
                canvas.drawPath(this.f68030n7h.m15210q(), this.f68038x2);
            } else {
                float fMo14816k = kja0VarZy.ki().mo14816k(this.f68017d3);
                canvas.drawRoundRect(this.f68017d3, fMo14816k, fMo14816k, this.f68038x2);
            }
        }

        /* JADX INFO: renamed from: q */
        private static float m15257q(RectF rectF, float f2) {
            return ((rectF.centerX() / (f2 / 2.0f)) - 1.0f) * f68011dd;
        }

        private static PointF qrj(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* JADX INFO: renamed from: s */
        private void m15258s(Canvas canvas) {
            C4108p c4108p = this.f68039zurt;
            RectF rectF = this.f68017d3;
            c4108p.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f68039zurt.zp(this.f68033oc);
            this.f68039zurt.ikck((int) this.f68018eqxt);
            this.f68039zurt.setShapeAppearanceModel(this.f68030n7h.zy());
            this.f68039zurt.draw(canvas);
        }

        private void x2(Canvas canvas) {
            n7h(canvas, this.f25562p);
            Rect bounds = getBounds();
            RectF rectF = this.f68031ni7;
            zurt.ni7(canvas, bounds, rectF.left, rectF.top, this.f68023gvn7.f25571k, this.f68025jp0y.f25581k, new k());
        }

        /* JADX INFO: renamed from: y */
        private void m15259y(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f68030n7h.m15210q(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m15256p(canvas);
            } else {
                m15258s(canvas);
            }
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@lvui Canvas canvas) {
            if (this.f68034qrj.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f68034qrj);
            }
            int iSave = this.f68024jk ? canvas.save() : -1;
            if (this.f68020fn3e && this.f68033oc > 0.0f) {
                m15259y(canvas);
            }
            this.f68030n7h.m15209k(canvas);
            n7h(canvas, this.f25564s);
            if (this.f68025jp0y.f68048zy) {
                x2(canvas);
                ld6(canvas);
            } else {
                ld6(canvas);
                x2(canvas);
            }
            if (this.f68024jk) {
                canvas.restoreToCount(iSave);
                m15252g(canvas, this.f68031ni7, this.f68021fti, -65281);
                f7l8(canvas, this.f68022fu4, androidx.core.view.n7h.f50847fn3e);
                f7l8(canvas, this.f68031ni7, -16711936);
                f7l8(canvas, this.f68032o1t, -16711681);
                f7l8(canvas, this.f25567z, -16776961);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@dd ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        private C4219y(PathMotion pathMotion, View view, RectF rectF, com.google.android.material.shape.kja0 kja0Var, float f2, View view2, RectF rectF2, com.google.android.material.shape.kja0 kja0Var2, float f3, @zy.x2 int i2, @zy.x2 int i3, @zy.x2 int i4, int i5, boolean z2, boolean z3, InterfaceC4204k interfaceC4204k, InterfaceC4201g interfaceC4201g, C4215g c4215g, boolean z5) {
            Paint paint = new Paint();
            this.f25564s = paint;
            Paint paint2 = new Paint();
            this.f25562p = paint2;
            Paint paint3 = new Paint();
            this.f68028ld6 = paint3;
            this.f68038x2 = new Paint();
            Paint paint4 = new Paint();
            this.f68034qrj = paint4;
            this.f68030n7h = new C4206p();
            this.f68015cdj = new float[]{rectF.centerX(), rectF.top};
            C4108p c4108p = new C4108p();
            this.f68039zurt = c4108p;
            Paint paint5 = new Paint();
            this.f68014a9 = paint5;
            this.f68021fti = new Path();
            this.f25560k = view;
            this.f68036toq = rectF;
            this.f68040zy = kja0Var;
            this.f25563q = f2;
            this.f25561n = view2;
            this.f25557g = rectF2;
            this.f68019f7l8 = kja0Var2;
            this.f25566y = f3;
            this.f68026ki = z2;
            this.f68020fn3e = z3;
            this.f25565t = interfaceC4204k;
            this.f68029mcp = interfaceC4201g;
            this.f68037wvg = c4215g;
            this.f68024jk = z5;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f68035t8r = r12.widthPixels;
            this.f25559i = r12.heightPixels;
            paint.setColor(i2);
            paint2.setColor(i3);
            paint3.setColor(i4);
            c4108p.m14867x(ColorStateList.valueOf(0));
            c4108p.gyi(2);
            c4108p.bo(false);
            c4108p.y2(f25556r);
            RectF rectF3 = new RectF(rectF);
            this.f68031ni7 = rectF3;
            this.f68022fu4 = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f25567z = rectF4;
            this.f68032o1t = new RectF(rectF4);
            PointF pointFQrj = qrj(rectF);
            PointF pointFQrj2 = qrj(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointFQrj.x, pointFQrj.y, pointFQrj2.x, pointFQrj2.y), false);
            this.f68027kja0 = pathMeasure;
            this.f25558h = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(zurt.zy(i5));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m15253h(0.0f);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface zy {
    }

    static {
        C4216k c4216k = null;
        bq = new C4215g(new C4217n(0.6f, 0.9f), new C4217n(0.0f, 1.0f), new C4217n(0.0f, 0.9f), new C4217n(0.3f, 0.9f), c4216k);
        ad = new C4215g(new C4217n(0.6f, 0.9f), new C4217n(0.0f, 0.9f), new C4217n(0.0f, 0.9f), new C4217n(0.2f, 0.9f), c4216k);
    }

    public x2() {
        this.f25533k = false;
        this.f25539q = false;
        this.f25536n = false;
        this.f25529g = false;
        this.f25546y = R.id.content;
        this.f25541s = -1;
        this.f25538p = -1;
        this.f25530h = 0;
        this.f25531i = 0;
        this.f25547z = 0;
        this.f25542t = 1375731712;
        this.f25540r = 0;
        this.f25534l = 0;
        this.f25528f = 0;
        this.f25543u = Build.VERSION.SDK_INT >= 28;
        this.f68005bo = -1.0f;
        this.f25544v = -1.0f;
    }

    private void dd(Context context, boolean z2) {
        zurt.ki(this, context, C6095k.zy.ia, C3910k.f67312toq);
        zurt.cdj(this, context, z2 ? C6095k.zy.e10 : C6095k.zy.i8fu);
        if (this.f25536n) {
            return;
        }
        zurt.t8r(this, context, C6095k.zy.dkhc);
    }

    /* JADX INFO: renamed from: g */
    private static com.google.android.material.shape.kja0 m15229g(@lvui View view, @lvui RectF rectF, @dd com.google.android.material.shape.kja0 kja0Var) {
        return zurt.toq(wvg(view, kja0Var), rectF);
    }

    private C4215g gvn7(boolean z2, C4215g c4215g, C4215g c4215g2) {
        if (!z2) {
            c4215g = c4215g2;
        }
        return new C4215g((C4217n) zurt.m15267q(this.f25535m, c4215g.f25548k), (C4217n) zurt.m15267q(this.f25525b, c4215g.f68006toq), (C4217n) zurt.m15267q(this.f25524a, c4215g.f68007zy), (C4217n) zurt.m15267q(this.f25545x, c4215g.f25549q), null);
    }

    private boolean lvui(@lvui RectF rectF, @lvui RectF rectF2) {
        int i2 = this.f25540r;
        if (i2 == 0) {
            return zurt.m15264k(rectF2) > zurt.m15264k(rectF);
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f25540r);
    }

    /* JADX INFO: renamed from: n */
    private static RectF m15231n(View view, @dd View view2, float f2, float f3) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFF7l8 = zurt.f7l8(view2);
        rectFF7l8.offset(f2, f3);
        return rectFF7l8;
    }

    private static float n7h(float f2, View view) {
        return f2 != -1.0f ? f2 : C0683f.m3166l(view);
    }

    @hb
    private static int oc(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6095k.zy.dmt});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: q */
    private C4215g m15232q(boolean z2) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof ld6)) ? gvn7(z2, ac, ad) : gvn7(z2, ax, bq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.kja0 wvg(@lvui View view, @dd com.google.android.material.shape.kja0 kja0Var) {
        if (kja0Var != null) {
            return kja0Var;
        }
        int i2 = C6095k.y.f80055oph;
        if (view.getTag(i2) instanceof com.google.android.material.shape.kja0) {
            return (com.google.android.material.shape.kja0) view.getTag(i2);
        }
        Context context = view.getContext();
        int iOc = oc(context);
        return iOc != -1 ? com.google.android.material.shape.kja0.toq(context, iOc, 0).qrj() : view instanceof com.google.android.material.shape.t8r ? ((com.google.android.material.shape.t8r) view).getShapeAppearanceModel() : com.google.android.material.shape.kja0.m14819k().qrj();
    }

    /* JADX INFO: renamed from: y */
    private static void m15233y(@lvui TransitionValues transitionValues, @dd View view, @InterfaceC7843t int i2, @dd com.google.android.material.shape.kja0 kja0Var) {
        if (i2 != -1) {
            transitionValues.view = zurt.m15261g(transitionValues.view, i2);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i3 = C6095k.y.f80055oph;
            if (view2.getTag(i3) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i3);
                transitionValues.view.setTag(i3, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!C0683f.v0af(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF rectFM15269y = view4.getParent() == null ? zurt.m15269y(view4) : zurt.f7l8(view4);
        transitionValues.values.put(bg, rectFM15269y);
        transitionValues.values.put(az, m15229g(view4, rectFM15269y, kja0Var));
    }

    /* JADX INFO: renamed from: a */
    public void m15234a(int i2) {
        this.f25540r = i2;
    }

    @dd
    public com.google.android.material.shape.kja0 a9() {
        return this.f25532j;
    }

    public void a98o(@InterfaceC7843t int i2) {
        this.f25541s = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m15235b(float f2) {
        this.f68005bo = f2;
    }

    public void bf2(@dd com.google.android.material.shape.kja0 kja0Var) {
        this.f25532j = kja0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m15236c(float f2) {
        this.f25544v = f2;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@lvui TransitionValues transitionValues) {
        m15233y(transitionValues, this.f25527e, this.f25538p, this.f25537o);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@lvui TransitionValues transitionValues) {
        m15233y(transitionValues, this.f25526c, this.f25541s, this.f25532j);
    }

    public float cdj() {
        return this.f25544v;
    }

    @Override // android.transition.Transition
    @dd
    public Animator createAnimator(@lvui ViewGroup viewGroup, @dd TransitionValues transitionValues, @dd TransitionValues transitionValues2) {
        View viewM15265n;
        View view;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get(bg);
            com.google.android.material.shape.kja0 kja0Var = (com.google.android.material.shape.kja0) transitionValues.values.get(az);
            if (rectF != null && kja0Var != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get(bg);
                com.google.android.material.shape.kja0 kja0Var2 = (com.google.android.material.shape.kja0) transitionValues2.values.get(az);
                if (rectF2 == null || kja0Var2 == null) {
                    Log.w(as, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = transitionValues.view;
                View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f25546y == view4.getId()) {
                    viewM15265n = (View) view4.getParent();
                    view = view4;
                } else {
                    viewM15265n = zurt.m15265n(view4, this.f25546y);
                    view = null;
                }
                RectF rectFF7l8 = zurt.f7l8(viewM15265n);
                float f2 = -rectFF7l8.left;
                float f3 = -rectFF7l8.top;
                RectF rectFM15231n = m15231n(viewM15265n, view, f2, f3);
                rectF.offset(f2, f3);
                rectF2.offset(f2, f3);
                boolean zLvui = lvui(rectF, rectF2);
                if (!this.f25529g) {
                    dd(view4.getContext(), zLvui);
                }
                C4219y c4219y = new C4219y(getPathMotion(), view2, rectF, kja0Var, n7h(this.f68005bo, view2), view3, rectF2, kja0Var2, n7h(this.f25544v, view3), this.f25530h, this.f25531i, this.f25547z, this.f25542t, zLvui, this.f25543u, com.google.android.material.transition.platform.toq.m15228k(this.f25534l, zLvui), com.google.android.material.transition.platform.f7l8.m15190k(this.f25528f, zLvui, rectF, rectF2), m15232q(zLvui), this.f25533k, null);
                c4219y.setBounds(Math.round(rectFM15231n.left), Math.round(rectFM15231n.top), Math.round(rectFM15231n.right), Math.round(rectFM15231n.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new C4216k(c4219y));
                addListener(new toq(viewM15265n, c4219y, view2, view3));
                return valueAnimatorOfFloat;
            }
            Log.w(as, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public boolean d2ok() {
        return this.f25543u;
    }

    public int d3() {
        return this.f25540r;
    }

    /* JADX INFO: renamed from: e */
    public void m15237e(int i2) {
        this.f25534l = i2;
    }

    public void ek5k(@zy.x2 int i2) {
        this.f25542t = i2;
    }

    public boolean eqxt() {
        return this.f25533k;
    }

    /* JADX INFO: renamed from: f */
    public void m15238f(@zy.x2 int i2) {
        this.f25547z = i2;
    }

    public int fn3e() {
        return this.f25534l;
    }

    @dd
    public View fti() {
        return this.f25526c;
    }

    @dd
    public C4217n fu4() {
        return this.f25524a;
    }

    @Override // android.transition.Transition
    @dd
    public String[] getTransitionProperties() {
        return ba;
    }

    public void hb(int i2) {
        this.f25528f = i2;
    }

    public void hyr(boolean z2) {
        this.f25543u = z2;
    }

    @InterfaceC7843t
    /* JADX INFO: renamed from: i */
    public int m15239i() {
        return this.f25538p;
    }

    public void i1(@dd View view) {
        this.f25526c = view;
    }

    /* JADX INFO: renamed from: j */
    public void m15240j(boolean z2) {
        this.f25539q = z2;
    }

    public float jk() {
        return this.f68005bo;
    }

    @InterfaceC7843t
    public int jp0y() {
        return this.f25541s;
    }

    @dd
    public com.google.android.material.shape.kja0 ki() {
        return this.f25537o;
    }

    @zy.x2
    public int kja0() {
        return this.f25547z;
    }

    /* JADX INFO: renamed from: l */
    public void m15241l(boolean z2) {
        this.f25533k = z2;
    }

    public void lrht(@dd com.google.android.material.shape.kja0 kja0Var) {
        this.f25537o = kja0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m15242m(@dd C4217n c4217n) {
        this.f25525b = c4217n;
    }

    @zy.x2
    public int mcp() {
        return this.f25531i;
    }

    public void n5r1(@InterfaceC7843t int i2) {
        this.f25546y = i2;
    }

    public void ncyb(@zy.x2 int i2) {
        this.f25530h = i2;
    }

    public int ni7() {
        return this.f25528f;
    }

    public void nn86(@dd C4217n c4217n) {
        this.f25535m = c4217n;
    }

    /* JADX INFO: renamed from: o */
    public void m15243o(@dd C4217n c4217n) {
        this.f25524a = c4217n;
    }

    @zy.x2
    public int o1t() {
        return this.f25542t;
    }

    @InterfaceC7843t
    public int qrj() {
        return this.f25546y;
    }

    /* JADX INFO: renamed from: r */
    public boolean m15244r() {
        return this.f25539q;
    }

    @zy.x2
    /* JADX INFO: renamed from: s */
    public int m15245s() {
        return this.f25530h;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@dd PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f25536n = true;
    }

    @dd
    /* JADX INFO: renamed from: t */
    public C4217n m15246t() {
        return this.f25545x;
    }

    @dd
    public View t8r() {
        return this.f25527e;
    }

    public void uv6(@dd View view) {
        this.f25527e = view;
    }

    public void vyq(@InterfaceC7843t int i2) {
        this.f25538p = i2;
    }

    public void x9kr(@zy.x2 int i2) {
        this.f25530h = i2;
        this.f25531i = i2;
        this.f25547z = i2;
    }

    public void y9n(@zy.x2 int i2) {
        this.f25531i = i2;
    }

    public void yz(@dd C4217n c4217n) {
        this.f25545x = c4217n;
    }

    @dd
    /* JADX INFO: renamed from: z */
    public C4217n m15247z() {
        return this.f25525b;
    }

    @dd
    public C4217n zurt() {
        return this.f25535m;
    }

    public x2(@lvui Context context, boolean z2) {
        this.f25533k = false;
        this.f25539q = false;
        this.f25536n = false;
        this.f25529g = false;
        this.f25546y = R.id.content;
        this.f25541s = -1;
        this.f25538p = -1;
        this.f25530h = 0;
        this.f25531i = 0;
        this.f25547z = 0;
        this.f25542t = 1375731712;
        this.f25540r = 0;
        this.f25534l = 0;
        this.f25528f = 0;
        this.f25543u = Build.VERSION.SDK_INT >= 28;
        this.f68005bo = -1.0f;
        this.f25544v = -1.0f;
        dd(context, z2);
        this.f25529g = true;
    }
}
