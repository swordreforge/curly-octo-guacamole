package com.google.android.material.transition;

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
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.view.C0683f;
import androidx.transition.C1225l;
import androidx.transition.o1t;
import androidx.transition.oc;
import com.google.android.material.animation.C3910k;
import com.google.android.material.internal.C4058z;
import com.google.android.material.shape.C4108p;
import com.google.android.material.transition.fn3e;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7843t;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MaterialContainerTransform.java */
/* JADX INFO: loaded from: classes2.dex */
public final class x2 extends oc {
    public static final int ei = 2;
    public static final int ls9 = 2;
    private static final C4228g lw58;
    private static final float nq0z = -1.0f;
    private static final C4228g us2t;
    public static final int ut = 0;
    public static final int wh6 = 1;
    public static final int wra = 0;
    public static final int xhv = 2;
    public static final int xqx = 0;
    public static final int zm = 3;
    public static final int zr5t = 1;
    public static final int zsl = 1;
    private boolean ar;
    private boolean bc;

    @InterfaceC7843t
    private int bd;
    private boolean bs;

    @InterfaceC7843t
    private int bu;

    @dd
    private C4230n cw14;
    private float d1cy;
    private int dy;

    @dd
    private C4230n hp;
    private boolean k0;

    @dd
    private View k6e;

    @dd
    private com.google.android.material.shape.kja0 mjvl;
    private float ndjo;
    private boolean q7k9;

    @dd
    private com.google.android.material.shape.kja0 s8y;
    private int sk1t;

    @zy.x2
    private int tgs;

    @dd
    private C4230n th6;

    @InterfaceC7843t
    private int tlhn;
    private int vb6;

    @zy.x2
    private int w97r;

    @dd
    private View xk5;

    @dd
    private C4230n xy8;

    @zy.x2
    private int yl25;

    @zy.x2
    private int zmmu;
    private static final String qns = x2.class.getSimpleName();
    private static final String afw = "materialContainerTransition:bounds";
    private static final String oyp = "materialContainerTransition:shapeAppearance";
    private static final String[] eht = {afw, oyp};
    private static final C4228g n5ij = new C4228g(new C4230n(0.0f, 0.25f), new C4230n(0.0f, 1.0f), new C4230n(0.0f, 1.0f), new C4230n(0.0f, 0.75f), null);
    private static final C4228g fn2 = new C4228g(new C4230n(0.1f, 0.4f), new C4230n(0.1f, 1.0f), new C4230n(0.1f, 1.0f), new C4230n(0.1f, 0.9f), null);

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface f7l8 {
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.x2$g */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    private static class C4228g {

        /* JADX INFO: renamed from: k */
        @lvui
        private final C4230n f25597k;

        /* JADX INFO: renamed from: q */
        @lvui
        private final C4230n f25598q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private final C4230n f68053toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @lvui
        private final C4230n f68054zy;

        /* synthetic */ C4228g(C4230n c4230n, C4230n c4230n2, C4230n c4230n3, C4230n c4230n4, C4229k c4229k) {
            this(c4230n, c4230n2, c4230n3, c4230n4);
        }

        private C4228g(@lvui C4230n c4230n, @lvui C4230n c4230n2, @lvui C4230n c4230n3, @lvui C4230n c4230n4) {
            this.f25597k = c4230n;
            this.f68053toq = c4230n2;
            this.f68054zy = c4230n3;
            this.f25598q = c4230n4;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.x2$k */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    class C4229k implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C4232y f25599k;

        C4229k(C4232y c4232y) {
            this.f25599k = c4232y;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25599k.kja0(valueAnimator.getAnimatedFraction());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.x2$n */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    public static class C4230n {

        /* JADX INFO: renamed from: k */
        @zy.zurt(from = 0.0d, to = 1.0d)
        private final float f25601k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.zurt(from = 0.0d, to = 1.0d)
        private final float f68055toq;

        public C4230n(@zy.zurt(from = 0.0d, to = 1.0d) float f2, @zy.zurt(from = 0.0d, to = 1.0d) float f3) {
            this.f25601k = f2;
            this.f68055toq = f3;
        }

        @zy.zurt(from = 0.0d, to = 1.0d)
        /* JADX INFO: renamed from: q */
        public float m15284q() {
            return this.f25601k;
        }

        @zy.zurt(from = 0.0d, to = 1.0d)
        public float zy() {
            return this.f68055toq;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.x2$q */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4231q {
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    class toq extends AbstractC4194i {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ View f25602g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25603k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f25604n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ C4232y f25605q;

        toq(View view, C4232y c4232y, View view2, View view3) {
            this.f25603k = view;
            this.f25605q = c4232y;
            this.f25604n = view2;
            this.f25602g = view3;
        }

        @Override // com.google.android.material.transition.AbstractC4194i, androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@lvui oc ocVar) {
            x2.this.mo5320x(this);
            if (x2.this.k0) {
                return;
            }
            this.f25604n.setAlpha(1.0f);
            this.f25602g.setAlpha(1.0f);
            C4058z.m14627s(this.f25603k).toq(this.f25605q);
        }

        @Override // com.google.android.material.transition.AbstractC4194i, androidx.transition.oc.InterfaceC1241y
        public void toq(@lvui oc ocVar) {
            C4058z.m14627s(this.f25603k).mo14541k(this.f25605q);
            this.f25604n.setAlpha(0.0f);
            this.f25602g.setAlpha(0.0f);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transition.x2$y */
    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    private static final class C4232y extends Drawable {

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private static final float f68056dd = 0.3f;

        /* JADX INFO: renamed from: lvui, reason: collision with root package name */
        private static final int f68057lvui = 754974720;

        /* JADX INFO: renamed from: r */
        private static final int f25607r = -7829368;

        /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
        private static final float f68058x9kr = 1.5f;

        /* JADX INFO: renamed from: a9, reason: collision with root package name */
        private final Paint f68059a9;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private final float[] f68060cdj;

        /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
        private float f68061d2ok;

        /* JADX INFO: renamed from: d3, reason: collision with root package name */
        private RectF f68062d3;

        /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
        private float f68063eqxt;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final com.google.android.material.shape.kja0 f68064f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        private final boolean f68065fn3e;

        /* JADX INFO: renamed from: fti, reason: collision with root package name */
        private final Path f68066fti;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private final RectF f68067fu4;

        /* JADX INFO: renamed from: g */
        private final RectF f25608g;

        /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
        private C4233y f68068gvn7;

        /* JADX INFO: renamed from: h */
        private final float f25609h;

        /* JADX INFO: renamed from: i */
        private final float f25610i;

        /* JADX INFO: renamed from: jk, reason: collision with root package name */
        private final boolean f68069jk;

        /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
        private com.google.android.material.transition.zy f68070jp0y;

        /* JADX INFO: renamed from: k */
        private final View f25611k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private final boolean f68071ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private final PathMeasure f68072kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private final Paint f68073ld6;

        /* JADX INFO: renamed from: mcp, reason: collision with root package name */
        private final InterfaceC4192g f68074mcp;

        /* JADX INFO: renamed from: n */
        private final View f25612n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private final C4198p f68075n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        private final RectF f68076ni7;

        /* JADX INFO: renamed from: o1t, reason: collision with root package name */
        private final RectF f68077o1t;

        /* JADX INFO: renamed from: oc, reason: collision with root package name */
        private float f68078oc;

        /* JADX INFO: renamed from: p */
        private final Paint f25613p;

        /* JADX INFO: renamed from: q */
        private final float f25614q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private final Paint f68079qrj;

        /* JADX INFO: renamed from: s */
        private final Paint f25615s;

        /* JADX INFO: renamed from: t */
        private final InterfaceC4195k f25616t;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private final float f68080t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final RectF f68081toq;

        /* JADX INFO: renamed from: wvg, reason: collision with root package name */
        private final C4228g f68082wvg;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private final Paint f68083x2;

        /* JADX INFO: renamed from: y */
        private final float f25617y;

        /* JADX INFO: renamed from: z */
        private final RectF f25618z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        private final C4108p f68084zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final com.google.android.material.shape.kja0 f68085zy;

        /* JADX INFO: renamed from: com.google.android.material.transition.x2$y$k */
        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        class k implements fn3e.zy {
            k() {
            }

            @Override // com.google.android.material.transition.fn3e.zy
            /* JADX INFO: renamed from: k */
            public void mo15173k(Canvas canvas) {
                C4232y.this.f25611k.draw(canvas);
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.transition.x2$y$toq */
        /* JADX INFO: compiled from: MaterialContainerTransform.java */
        class toq implements fn3e.zy {
            toq() {
            }

            @Override // com.google.android.material.transition.fn3e.zy
            /* JADX INFO: renamed from: k */
            public void mo15173k(Canvas canvas) {
                C4232y.this.f25612n.draw(canvas);
            }
        }

        /* synthetic */ C4232y(o1t o1tVar, View view, RectF rectF, com.google.android.material.shape.kja0 kja0Var, float f2, View view2, RectF rectF2, com.google.android.material.shape.kja0 kja0Var2, float f3, int i2, int i3, int i4, int i5, boolean z2, boolean z3, InterfaceC4195k interfaceC4195k, InterfaceC4192g interfaceC4192g, C4228g c4228g, boolean z5, C4229k c4229k) {
            this(o1tVar, view, rectF, kja0Var, f2, view2, rectF2, kja0Var2, f3, i2, i3, i4, i5, z2, z3, interfaceC4195k, interfaceC4192g, c4228g, z5);
        }

        private void f7l8(Canvas canvas, RectF rectF, @zy.x2 int i2) {
            this.f68059a9.setColor(i2);
            canvas.drawRect(rectF, this.f68059a9);
        }

        /* JADX INFO: renamed from: g */
        private void m15285g(Canvas canvas, RectF rectF, Path path, @zy.x2 int i2) {
            PointF pointFQrj = qrj(rectF);
            if (this.f68061d2ok == 0.0f) {
                path.reset();
                path.moveTo(pointFQrj.x, pointFQrj.y);
            } else {
                path.lineTo(pointFQrj.x, pointFQrj.y);
                this.f68059a9.setColor(i2);
                canvas.drawPath(path, this.f68059a9);
            }
        }

        /* JADX INFO: renamed from: h */
        private void m15286h(float f2) {
            float f3;
            float f4;
            this.f68061d2ok = f2;
            this.f68079qrj.setAlpha((int) (this.f68071ki ? fn3e.ld6(0.0f, 255.0f, f2) : fn3e.ld6(255.0f, 0.0f, f2)));
            this.f68072kja0.getPosTan(this.f25609h * f2, this.f68060cdj, null);
            float[] fArr = this.f68060cdj;
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
                this.f68072kja0.getPosTan(this.f25609h * f3, fArr, null);
                float[] fArr2 = this.f68060cdj;
                f5 += (f5 - fArr2[0]) * f4;
                f6 += (f6 - fArr2[1]) * f4;
            }
            float f7 = f5;
            float f8 = f6;
            C4233y c4233yMo15162k = this.f68074mcp.mo15162k(f2, ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68082wvg.f68053toq.f25601k))).floatValue(), ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68082wvg.f68053toq.f68055toq))).floatValue(), this.f68081toq.width(), this.f68081toq.height(), this.f25608g.width(), this.f25608g.height());
            this.f68068gvn7 = c4233yMo15162k;
            RectF rectF = this.f68076ni7;
            float f9 = c4233yMo15162k.f68087zy;
            rectF.set(f7 - (f9 / 2.0f), f8, (f9 / 2.0f) + f7, c4233yMo15162k.f25624q + f8);
            RectF rectF2 = this.f25618z;
            C4233y c4233y = this.f68068gvn7;
            float f10 = c4233y.f25623n;
            rectF2.set(f7 - (f10 / 2.0f), f8, f7 + (f10 / 2.0f), c4233y.f25621g + f8);
            this.f68067fu4.set(this.f68076ni7);
            this.f68077o1t.set(this.f25618z);
            float fFloatValue = ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68082wvg.f68054zy.f25601k))).floatValue();
            float fFloatValue2 = ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68082wvg.f68054zy.f68055toq))).floatValue();
            boolean qVar = this.f68074mcp.toq(this.f68068gvn7);
            RectF rectF3 = qVar ? this.f68067fu4 : this.f68077o1t;
            float fX2 = fn3e.x2(0.0f, 1.0f, fFloatValue, fFloatValue2, f2);
            if (!qVar) {
                fX2 = 1.0f - fX2;
            }
            this.f68074mcp.zy(rectF3, fX2, this.f68068gvn7);
            this.f68062d3 = new RectF(Math.min(this.f68067fu4.left, this.f68077o1t.left), Math.min(this.f68067fu4.top, this.f68077o1t.top), Math.max(this.f68067fu4.right, this.f68077o1t.right), Math.max(this.f68067fu4.bottom, this.f68077o1t.bottom));
            this.f68075n7h.toq(f2, this.f68085zy, this.f68064f7l8, this.f68076ni7, this.f68067fu4, this.f68077o1t, this.f68082wvg.f25598q);
            this.f68078oc = fn3e.ld6(this.f25614q, this.f25617y, f2);
            float fM15290q = m15290q(this.f68062d3, this.f68080t8r);
            float fM15288n = m15288n(this.f68062d3, this.f25610i);
            float f11 = this.f68078oc;
            float f12 = (int) (fM15288n * f11);
            this.f68063eqxt = f12;
            this.f68083x2.setShadowLayer(f11, (int) (fM15290q * f11), f12, f68057lvui);
            this.f68070jp0y = this.f25616t.mo15174k(f2, ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68082wvg.f25597k.f25601k))).floatValue(), ((Float) androidx.core.util.n7h.x2(Float.valueOf(this.f68082wvg.f25597k.f68055toq))).floatValue(), 0.35f);
            if (this.f25613p.getColor() != 0) {
                this.f25613p.setAlpha(this.f68070jp0y.f25625k);
            }
            if (this.f68073ld6.getColor() != 0) {
                this.f68073ld6.setAlpha(this.f68070jp0y.f68088toq);
            }
            invalidateSelf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void kja0(float f2) {
            if (this.f68061d2ok != f2) {
                m15286h(f2);
            }
        }

        private void ld6(Canvas canvas) {
            n7h(canvas, this.f68073ld6);
            Rect bounds = getBounds();
            RectF rectF = this.f25618z;
            fn3e.ni7(canvas, bounds, rectF.left, rectF.top, this.f68068gvn7.f68086toq, this.f68070jp0y.f68088toq, new toq());
        }

        /* JADX INFO: renamed from: n */
        private static float m15288n(RectF rectF, float f2) {
            return (rectF.centerY() / f2) * 1.5f;
        }

        private void n7h(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        /* JADX INFO: renamed from: p */
        private void m15289p(Canvas canvas) {
            com.google.android.material.shape.kja0 kja0VarZy = this.f68075n7h.zy();
            if (!kja0VarZy.fn3e(this.f68062d3)) {
                canvas.drawPath(this.f68075n7h.m15185q(), this.f68083x2);
            } else {
                float fMo14816k = kja0VarZy.ki().mo14816k(this.f68062d3);
                canvas.drawRoundRect(this.f68062d3, fMo14816k, fMo14816k, this.f68083x2);
            }
        }

        /* JADX INFO: renamed from: q */
        private static float m15290q(RectF rectF, float f2) {
            return ((rectF.centerX() / (f2 / 2.0f)) - 1.0f) * f68056dd;
        }

        private static PointF qrj(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        /* JADX INFO: renamed from: s */
        private void m15291s(Canvas canvas) {
            C4108p c4108p = this.f68084zurt;
            RectF rectF = this.f68062d3;
            c4108p.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f68084zurt.zp(this.f68078oc);
            this.f68084zurt.ikck((int) this.f68063eqxt);
            this.f68084zurt.setShapeAppearanceModel(this.f68075n7h.zy());
            this.f68084zurt.draw(canvas);
        }

        private void x2(Canvas canvas) {
            n7h(canvas, this.f25613p);
            Rect bounds = getBounds();
            RectF rectF = this.f68076ni7;
            fn3e.ni7(canvas, bounds, rectF.left, rectF.top, this.f68068gvn7.f25622k, this.f68070jp0y.f25625k, new k());
        }

        /* JADX INFO: renamed from: y */
        private void m15292y(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f68075n7h.m15185q(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                m15289p(canvas);
            } else {
                m15291s(canvas);
            }
            canvas.restore();
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@lvui Canvas canvas) {
            if (this.f68079qrj.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f68079qrj);
            }
            int iSave = this.f68069jk ? canvas.save() : -1;
            if (this.f68065fn3e && this.f68078oc > 0.0f) {
                m15292y(canvas);
            }
            this.f68075n7h.m15184k(canvas);
            n7h(canvas, this.f25615s);
            if (this.f68070jp0y.f68089zy) {
                x2(canvas);
                ld6(canvas);
            } else {
                ld6(canvas);
                x2(canvas);
            }
            if (this.f68069jk) {
                canvas.restoreToCount(iSave);
                m15285g(canvas, this.f68076ni7, this.f68066fti, -65281);
                f7l8(canvas, this.f68067fu4, androidx.core.view.n7h.f50847fn3e);
                f7l8(canvas, this.f68076ni7, -16711936);
                f7l8(canvas, this.f68077o1t, -16711681);
                f7l8(canvas, this.f25618z, -16776961);
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

        private C4232y(o1t o1tVar, View view, RectF rectF, com.google.android.material.shape.kja0 kja0Var, float f2, View view2, RectF rectF2, com.google.android.material.shape.kja0 kja0Var2, float f3, @zy.x2 int i2, @zy.x2 int i3, @zy.x2 int i4, int i5, boolean z2, boolean z3, InterfaceC4195k interfaceC4195k, InterfaceC4192g interfaceC4192g, C4228g c4228g, boolean z5) {
            Paint paint = new Paint();
            this.f25615s = paint;
            Paint paint2 = new Paint();
            this.f25613p = paint2;
            Paint paint3 = new Paint();
            this.f68073ld6 = paint3;
            this.f68083x2 = new Paint();
            Paint paint4 = new Paint();
            this.f68079qrj = paint4;
            this.f68075n7h = new C4198p();
            this.f68060cdj = new float[]{rectF.centerX(), rectF.top};
            C4108p c4108p = new C4108p();
            this.f68084zurt = c4108p;
            Paint paint5 = new Paint();
            this.f68059a9 = paint5;
            this.f68066fti = new Path();
            this.f25611k = view;
            this.f68081toq = rectF;
            this.f68085zy = kja0Var;
            this.f25614q = f2;
            this.f25612n = view2;
            this.f25608g = rectF2;
            this.f68064f7l8 = kja0Var2;
            this.f25617y = f3;
            this.f68071ki = z2;
            this.f68065fn3e = z3;
            this.f25616t = interfaceC4195k;
            this.f68074mcp = interfaceC4192g;
            this.f68082wvg = c4228g;
            this.f68069jk = z5;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f68080t8r = r12.widthPixels;
            this.f25610i = r12.heightPixels;
            paint.setColor(i2);
            paint2.setColor(i3);
            paint3.setColor(i4);
            c4108p.m14867x(ColorStateList.valueOf(0));
            c4108p.gyi(2);
            c4108p.bo(false);
            c4108p.y2(f25607r);
            RectF rectF3 = new RectF(rectF);
            this.f68076ni7 = rectF3;
            this.f68067fu4 = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f25618z = rectF4;
            this.f68077o1t = new RectF(rectF4);
            PointF pointFQrj = qrj(rectF);
            PointF pointFQrj2 = qrj(rectF2);
            PathMeasure pathMeasure = new PathMeasure(o1tVar.mo5403k(pointFQrj.x, pointFQrj.y, pointFQrj2.x, pointFQrj2.y), false);
            this.f68072kja0 = pathMeasure;
            this.f25609h = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(fn3e.zy(i5));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            m15286h(0.0f);
        }
    }

    /* JADX INFO: compiled from: MaterialContainerTransform.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface zy {
    }

    static {
        C4229k c4229k = null;
        lw58 = new C4228g(new C4230n(0.6f, 0.9f), new C4230n(0.0f, 1.0f), new C4230n(0.0f, 0.9f), new C4230n(0.3f, 0.9f), c4229k);
        us2t = new C4228g(new C4230n(0.6f, 0.9f), new C4230n(0.0f, 0.9f), new C4230n(0.0f, 0.9f), new C4230n(0.2f, 0.9f), c4229k);
    }

    public x2() {
        this.bs = false;
        this.k0 = false;
        this.ar = false;
        this.bc = false;
        this.bu = R.id.content;
        this.bd = -1;
        this.tlhn = -1;
        this.w97r = 0;
        this.tgs = 0;
        this.yl25 = 0;
        this.zmmu = 1375731712;
        this.sk1t = 0;
        this.dy = 0;
        this.vb6 = 0;
        this.q7k9 = Build.VERSION.SDK_INT >= 28;
        this.ndjo = -1.0f;
        this.d1cy = -1.0f;
    }

    private boolean bek6(@lvui RectF rectF, @lvui RectF rectF2) {
        int i2 = this.sk1t;
        if (i2 == 0) {
            return fn3e.m15166k(rectF2) > fn3e.m15166k(rectF);
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.sk1t);
    }

    private C4228g bz2(boolean z2, C4228g c4228g, C4228g c4228g2) {
        if (!z2) {
            c4228g = c4228g2;
        }
        return new C4228g((C4230n) fn3e.m15169q(this.hp, c4228g.f25597k), (C4230n) fn3e.m15169q(this.cw14, c4228g.f68053toq), (C4230n) fn3e.m15169q(this.xy8, c4228g.f68054zy), (C4230n) fn3e.m15169q(this.th6, c4228g.f25598q), null);
    }

    private static void d8wk(@lvui C1225l c1225l, @dd View view, @InterfaceC7843t int i2, @dd com.google.android.material.shape.kja0 kja0Var) {
        if (i2 != -1) {
            c1225l.f53502toq = fn3e.m15163g(c1225l.f53502toq, i2);
        } else if (view != null) {
            c1225l.f53502toq = view;
        } else {
            View view2 = c1225l.f53502toq;
            int i3 = C6095k.y.f80055oph;
            if (view2.getTag(i3) instanceof View) {
                View view3 = (View) c1225l.f53502toq.getTag(i3);
                c1225l.f53502toq.setTag(i3, null);
                c1225l.f53502toq = view3;
            }
        }
        View view4 = c1225l.f53502toq;
        if (!C0683f.v0af(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF rectFM15171y = view4.getParent() == null ? fn3e.m15171y(view4) : fn3e.f7l8(view4);
        c1225l.f6686k.put(afw, rectFM15171y);
        c1225l.f6686k.put(oyp, wo(view4, rectFM15171y, kja0Var));
    }

    private static float gbni(float f2, View view) {
        return f2 != -1.0f ? f2 : C0683f.m3166l(view);
    }

    private void h7am(Context context, boolean z2) {
        fn3e.ki(this, context, C6095k.zy.ia, C3910k.f67312toq);
        fn3e.cdj(this, context, z2 ? C6095k.zy.e10 : C6095k.zy.i8fu);
        if (this.ar) {
            return;
        }
        fn3e.t8r(this, context, C6095k.zy.dkhc);
    }

    @hb
    private static int jz5(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{C6095k.zy.dmt});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private C4228g qo(boolean z2) {
        o1t o1tVarN5r1 = n5r1();
        return ((o1tVarN5r1 instanceof androidx.transition.toq) || (o1tVarN5r1 instanceof ld6)) ? bz2(z2, fn2, us2t) : bz2(z2, n5ij, lw58);
    }

    private static RectF tfm(View view, @dd View view2, float f2, float f3) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF rectFF7l8 = fn3e.f7l8(view2);
        rectFF7l8.offset(f2, f3);
        return rectFF7l8;
    }

    private static com.google.android.material.shape.kja0 wo(@lvui View view, @lvui RectF rectF, @dd com.google.android.material.shape.kja0 kja0Var) {
        return fn3e.toq(z4(view, kja0Var), rectF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.google.android.material.shape.kja0 z4(@lvui View view, @dd com.google.android.material.shape.kja0 kja0Var) {
        if (kja0Var != null) {
            return kja0Var;
        }
        int i2 = C6095k.y.f80055oph;
        if (view.getTag(i2) instanceof com.google.android.material.shape.kja0) {
            return (com.google.android.material.shape.kja0) view.getTag(i2);
        }
        Context context = view.getContext();
        int iJz5 = jz5(context);
        return iJz5 != -1 ? com.google.android.material.shape.kja0.toq(context, iJz5, 0).qrj() : view instanceof com.google.android.material.shape.t8r ? ((com.google.android.material.shape.t8r) view).getShapeAppearanceModel() : com.google.android.material.shape.kja0.m14819k().qrj();
    }

    public boolean b3e() {
        return this.q7k9;
    }

    public void bap7(@zy.x2 int i2) {
        this.tgs = i2;
    }

    public float bwp() {
        return this.ndjo;
    }

    @Override // androidx.transition.oc
    public void cdj(@lvui C1225l c1225l) {
        d8wk(c1225l, this.xk5, this.tlhn, this.mjvl);
    }

    @dd
    public C4230n cfr() {
        return this.cw14;
    }

    public boolean cv06() {
        return this.k0;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28269do(@dd com.google.android.material.shape.kja0 kja0Var) {
        this.mjvl = kja0Var;
    }

    public void dxef(int i2) {
        this.sk1t = i2;
    }

    public void e5(@InterfaceC7843t int i2) {
        this.bd = i2;
    }

    public void ebn(@InterfaceC7843t int i2) {
        this.tlhn = i2;
    }

    public int etdu() {
        return this.vb6;
    }

    @Override // androidx.transition.oc
    @dd
    public Animator fu4(@lvui ViewGroup viewGroup, @dd C1225l c1225l, @dd C1225l c1225l2) {
        View viewM15167n;
        View view;
        if (c1225l != null && c1225l2 != null) {
            RectF rectF = (RectF) c1225l.f6686k.get(afw);
            com.google.android.material.shape.kja0 kja0Var = (com.google.android.material.shape.kja0) c1225l.f6686k.get(oyp);
            if (rectF != null && kja0Var != null) {
                RectF rectF2 = (RectF) c1225l2.f6686k.get(afw);
                com.google.android.material.shape.kja0 kja0Var2 = (com.google.android.material.shape.kja0) c1225l2.f6686k.get(oyp);
                if (rectF2 == null || kja0Var2 == null) {
                    Log.w(qns, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = c1225l.f53502toq;
                View view3 = c1225l2.f53502toq;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.bu == view4.getId()) {
                    viewM15167n = (View) view4.getParent();
                    view = view4;
                } else {
                    viewM15167n = fn3e.m15167n(view4, this.bu);
                    view = null;
                }
                RectF rectFF7l8 = fn3e.f7l8(viewM15167n);
                float f2 = -rectFF7l8.left;
                float f3 = -rectFF7l8.top;
                RectF rectFTfm = tfm(viewM15167n, view, f2, f3);
                rectF.offset(f2, f3);
                rectF2.offset(f2, f3);
                boolean zBek6 = bek6(rectF, rectF2);
                if (!this.bc) {
                    h7am(view4.getContext(), zBek6);
                }
                C4232y c4232y = new C4232y(n5r1(), view2, rectF, kja0Var, gbni(this.ndjo, view2), view3, rectF2, kja0Var2, gbni(this.d1cy, view3), this.w97r, this.tgs, this.yl25, this.zmmu, zBek6, this.q7k9, com.google.android.material.transition.toq.m15280k(this.dy, zBek6), com.google.android.material.transition.f7l8.m15161k(this.vb6, zBek6, rectF, rectF2), qo(zBek6), this.bs, null);
                c4232y.setBounds(Math.round(rectFTfm.left), Math.round(rectFTfm.top), Math.round(rectFTfm.right), Math.round(rectFTfm.bottom));
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new C4229k(c4232y));
                mo5316k(new toq(viewM15167n, c4232y, view2, view3));
                return valueAnimatorOfFloat;
            }
            Log.w(qns, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    @zy.x2
    public int g1() {
        return this.w97r;
    }

    public void ga(@dd View view) {
        this.k6e = view;
    }

    @dd
    public View gc3c() {
        return this.k6e;
    }

    public void h4b(float f2) {
        this.ndjo = f2;
    }

    @Override // androidx.transition.oc
    /* JADX INFO: renamed from: i */
    public void mo5315i(@lvui C1225l c1225l) {
        d8wk(c1225l, this.k6e, this.bd, this.s8y);
    }

    @dd
    public com.google.android.material.shape.kja0 i9jn() {
        return this.mjvl;
    }

    public void ij(@dd C4230n c4230n) {
        this.hp = c4230n;
    }

    @Override // androidx.transition.oc
    public void ikck(@dd o1t o1tVar) {
        super.ikck(o1tVar);
        this.ar = true;
    }

    public void ixz(float f2) {
        this.d1cy = f2;
    }

    public void jbh(boolean z2) {
        this.bs = z2;
    }

    @zy.x2
    public int kcsr() {
        return this.tgs;
    }

    public boolean ktq() {
        return this.bs;
    }

    public void lh(@dd C4230n c4230n) {
        this.th6 = c4230n;
    }

    @dd
    public View ltg8() {
        return this.xk5;
    }

    public int m4() {
        return this.dy;
    }

    public void mbx(@zy.x2 int i2) {
        this.w97r = i2;
    }

    public void n2t(@dd C4230n c4230n) {
        this.xy8 = c4230n;
    }

    public void ngy(@zy.x2 int i2) {
        this.zmmu = i2;
    }

    @Override // androidx.transition.oc
    @dd
    public String[] nn86() {
        return eht;
    }

    public void nsb(int i2) {
        this.vb6 = i2;
    }

    public void pc(int i2) {
        this.dy = i2;
    }

    public void pjz9(@dd C4230n c4230n) {
        this.cw14 = c4230n;
    }

    public float py() {
        return this.d1cy;
    }

    @InterfaceC7843t
    public int r8s8() {
        return this.tlhn;
    }

    @dd
    public com.google.android.material.shape.kja0 se() {
        return this.s8y;
    }

    @dd
    public C4230n sok() {
        return this.xy8;
    }

    public void uc(boolean z2) {
        this.q7k9 = z2;
    }

    public int uj2j() {
        return this.sk1t;
    }

    public void ukdy(@dd View view) {
        this.xk5 = view;
    }

    @dd
    public C4230n v0af() {
        return this.hp;
    }

    public void vep5(@zy.x2 int i2) {
        this.w97r = i2;
        this.tgs = i2;
        this.yl25 = i2;
    }

    @zy.x2
    public int w831() {
        return this.zmmu;
    }

    @InterfaceC7843t
    public int was() {
        return this.bu;
    }

    public void wlev(@dd com.google.android.material.shape.kja0 kja0Var) {
        this.s8y = kja0Var;
    }

    public void wx16(@zy.x2 int i2) {
        this.yl25 = i2;
    }

    public void yl(@InterfaceC7843t int i2) {
        this.bu = i2;
    }

    @dd
    public C4230n yqrt() {
        return this.th6;
    }

    @InterfaceC7843t
    public int zkd() {
        return this.bd;
    }

    @zy.x2
    public int zsr0() {
        return this.yl25;
    }

    public void zwy(boolean z2) {
        this.k0 = z2;
    }

    public x2(@lvui Context context, boolean z2) {
        this.bs = false;
        this.k0 = false;
        this.ar = false;
        this.bc = false;
        this.bu = R.id.content;
        this.bd = -1;
        this.tlhn = -1;
        this.w97r = 0;
        this.tgs = 0;
        this.yl25 = 0;
        this.zmmu = 1375731712;
        this.sk1t = 0;
        this.dy = 0;
        this.vb6 = 0;
        this.q7k9 = Build.VERSION.SDK_INT >= 28;
        this.ndjo = -1.0f;
        this.d1cy = -1.0f;
        h7am(context, z2);
        this.bc = true;
    }
}
