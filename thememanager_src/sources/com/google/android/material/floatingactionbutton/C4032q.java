package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.util.n7h;
import androidx.core.view.C0683f;
import bap7.C1366k;
import com.google.android.material.animation.C3909g;
import com.google.android.material.animation.C3910k;
import com.google.android.material.animation.C3915y;
import com.google.android.material.ripple.C4094k;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import com.google.android.material.shape.t8r;
import ij.C6095k;
import java.util.ArrayList;
import java.util.Iterator;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q */
/* JADX INFO: compiled from: FloatingActionButtonImpl.java */
/* JADX INFO: loaded from: classes2.dex */
class C4032q {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    static final long f67591a9 = 100;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final float f67592d2ok = 0.4f;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    static final int f67593d3 = 2;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final float f67594dd = 1.0f;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final float f67595eqxt = 0.0f;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    static final long f67596fti = 100;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    static final int f67597gvn7 = 1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    static final int f67600jp0y = 0;

    /* JADX INFO: renamed from: l */
    private static final float f24448l = 0.0f;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private static final float f67602lvui = 0.4f;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private static final float f67604ncyb = 0.0f;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    static final float f67605oc = 1.5f;

    /* JADX INFO: renamed from: r */
    private static final float f24449r = 1.0f;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private static final float f67607x9kr = 1.0f;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private ArrayList<Animator.AnimatorListener> f67610fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    final com.google.android.material.shadow.zy f67611fu4;

    /* JADX INFO: renamed from: g */
    boolean f24450g;

    /* JADX INFO: renamed from: h */
    private float f24451h;

    /* JADX INFO: renamed from: i */
    private ArrayList<Animator.AnimatorListener> f24452i;

    /* JADX INFO: renamed from: k */
    @dd
    kja0 f24453k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f67612ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @dd
    private C3915y f67613kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    int f67614ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    @dd
    private ViewTreeObserver.OnPreDrawListener f67615mcp;

    /* JADX INFO: renamed from: n */
    @dd
    Drawable f24454n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @dd
    private C3915y f67616n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    final FloatingActionButton f67617ni7;

    /* JADX INFO: renamed from: p */
    float f24455p;

    /* JADX INFO: renamed from: q */
    @dd
    com.google.android.material.floatingactionbutton.zy f24456q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @dd
    private Animator f67619qrj;

    /* JADX INFO: renamed from: s */
    float f24457s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @dd
    C4108p f67621toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @lvui
    private final com.google.android.material.internal.x2 f67623x2;

    /* JADX INFO: renamed from: y */
    float f24459y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private ArrayList<p> f67624zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    Drawable f67625zy;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    static final TimeInterpolator f67599jk = C3910k.f67313zy;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    static final int[] f67603n5r1 = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    static final int[] f67598hyr = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: f */
    static final int[] f24447f = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: c */
    static final int[] f24446c = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    static final int[] f67601lrht = {R.attr.state_enabled};

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    static final int[] f67606uv6 = new int[0];

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    boolean f67609f7l8 = true;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private float f67608cdj = 1.0f;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f67620t8r = 0;

    /* JADX INFO: renamed from: z */
    private final Rect f24460z = new Rect();

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private final RectF f67618o1t = new RectF();

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private final RectF f67622wvg = new RectF();

    /* JADX INFO: renamed from: t */
    private final Matrix f24458t = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$f7l8 */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    private class f7l8 extends qrj {
        f7l8() {
            super(C4032q.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.qrj
        /* JADX INFO: renamed from: k */
        protected float mo14514k() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$g */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            C4032q.this.gvn7();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$k */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    class k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private boolean f24464k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ ld6 f24465n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ boolean f24466q;

        k(boolean z2, ld6 ld6Var) {
            this.f24466q = z2;
            this.f24465n = ld6Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24464k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4032q.this.f67620t8r = 0;
            C4032q.this.f67619qrj = null;
            if (this.f24464k) {
                return;
            }
            FloatingActionButton floatingActionButton = C4032q.this.f67617ni7;
            boolean z2 = this.f24466q;
            floatingActionButton.zy(z2 ? 8 : 4, z2);
            ld6 ld6Var = this.f24465n;
            if (ld6Var != null) {
                ld6Var.toq();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4032q.this.f67617ni7.zy(0, this.f24466q);
            C4032q.this.f67620t8r = 1;
            C4032q.this.f67619qrj = animator;
            this.f24464k = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$ld6 */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    interface ld6 {
        /* JADX INFO: renamed from: k */
        void mo14485k();

        void toq();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$n */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    class n implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: k */
        FloatEvaluator f24467k = new FloatEvaluator();

        n() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f2, Float f3, Float f4) {
            float fFloatValue = this.f24467k.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$p */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    interface p {
        /* JADX INFO: renamed from: k */
        void mo14486k();

        void toq();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$q */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    class q implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ float f24468g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Matrix f24469h;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float f24471k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ float f24472n;

        /* JADX INFO: renamed from: p */
        final /* synthetic */ float f24473p;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f24474q;

        /* JADX INFO: renamed from: s */
        final /* synthetic */ float f24475s;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ float f24476y;

        q(float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix) {
            this.f24471k = f2;
            this.f24474q = f3;
            this.f24472n = f4;
            this.f24468g = f5;
            this.f24476y = f6;
            this.f24475s = f7;
            this.f24473p = f8;
            this.f24469h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C4032q.this.f67617ni7.setAlpha(C3910k.toq(this.f24471k, this.f24474q, 0.0f, 0.2f, fFloatValue));
            C4032q.this.f67617ni7.setScaleX(C3910k.m13980k(this.f24472n, this.f24468g, fFloatValue));
            C4032q.this.f67617ni7.setScaleY(C3910k.m13980k(this.f24476y, this.f24468g, fFloatValue));
            C4032q.this.f67608cdj = C3910k.m13980k(this.f24475s, this.f24473p, fFloatValue);
            C4032q.this.m14501y(C3910k.m13980k(this.f24475s, this.f24473p, fFloatValue), this.f24469h);
            C4032q.this.f67617ni7.setImageMatrix(this.f24469h);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$qrj */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    private abstract class qrj extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        private boolean f24478k;

        /* JADX INFO: renamed from: n */
        private float f24479n;

        /* JADX INFO: renamed from: q */
        private float f24480q;

        private qrj() {
        }

        /* JADX INFO: renamed from: k */
        protected abstract float mo14514k();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4032q.this.bf2((int) this.f24479n);
            this.f24478k = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            if (!this.f24478k) {
                C4108p c4108p = C4032q.this.f67621toq;
                this.f24480q = c4108p == null ? 0.0f : c4108p.fu4();
                this.f24479n = mo14514k();
                this.f24478k = true;
            }
            C4032q c4032q = C4032q.this;
            float f2 = this.f24480q;
            c4032q.bf2((int) (f2 + ((this.f24479n - f2) * valueAnimator.getAnimatedFraction())));
        }

        /* synthetic */ qrj(C4032q c4032q, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$s */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    private class s extends qrj {
        s() {
            super(C4032q.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.qrj
        /* JADX INFO: renamed from: k */
        protected float mo14514k() {
            C4032q c4032q = C4032q.this;
            return c4032q.f24459y + c4032q.f24455p;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$toq */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f24482k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ld6 f24484q;

        toq(boolean z2, ld6 ld6Var) {
            this.f24482k = z2;
            this.f24484q = ld6Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C4032q.this.f67620t8r = 0;
            C4032q.this.f67619qrj = null;
            ld6 ld6Var = this.f24484q;
            if (ld6Var != null) {
                ld6Var.mo14485k();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C4032q.this.f67617ni7.zy(0, this.f24482k);
            C4032q.this.f67620t8r = 2;
            C4032q.this.f67619qrj = animator;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$x2 */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    private class x2 extends qrj {
        x2() {
            super(C4032q.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.qrj
        /* JADX INFO: renamed from: k */
        protected float mo14514k() {
            return C4032q.this.f24459y;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$y */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    private class y extends qrj {
        y() {
            super(C4032q.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.C4032q.qrj
        /* JADX INFO: renamed from: k */
        protected float mo14514k() {
            C4032q c4032q = C4032q.this;
            return c4032q.f24459y + c4032q.f24457s;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.q$zy */
    /* JADX INFO: compiled from: FloatingActionButtonImpl.java */
    class zy extends com.google.android.material.animation.f7l8 {
        zy() {
        }

        @Override // com.google.android.material.animation.f7l8, android.animation.TypeEvaluator
        /* JADX INFO: renamed from: k */
        public Matrix evaluate(float f2, @lvui Matrix matrix, @lvui Matrix matrix2) {
            C4032q.this.f67608cdj = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    C4032q(FloatingActionButton floatingActionButton, com.google.android.material.shadow.zy zyVar) {
        this.f67617ni7 = floatingActionButton;
        this.f67611fu4 = zyVar;
        com.google.android.material.internal.x2 x2Var = new com.google.android.material.internal.x2();
        this.f67623x2 = x2Var;
        x2Var.m14619k(f67603n5r1, ld6(new s()));
        x2Var.m14619k(f67598hyr, ld6(new y()));
        x2Var.m14619k(f24447f, ld6(new y()));
        x2Var.m14619k(f24446c, ld6(new y()));
        x2Var.m14619k(f67601lrht, ld6(new x2()));
        x2Var.m14619k(f67606uv6, ld6(new f7l8()));
        this.f24451h = floatingActionButton.getRotation();
    }

    private void i1(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new n());
    }

    @lvui
    private ViewTreeObserver.OnPreDrawListener ki() {
        if (this.f67615mcp == null) {
            this.f67615mcp = new g();
        }
        return this.f67615mcp;
    }

    @lvui
    private ValueAnimator ld6(@lvui qrj qrjVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f67599jk);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(qrjVar);
        valueAnimator.addUpdateListener(qrjVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: o */
    private boolean m14497o() {
        return C0683f.v0af(this.f67617ni7) && !this.f67617ni7.isInEditMode();
    }

    /* JADX INFO: renamed from: p */
    private AnimatorSet m14498p(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new q(this.f67617ni7.getAlpha(), f2, this.f67617ni7.getScaleX(), f3, this.f67617ni7.getScaleY(), this.f67608cdj, f4, new Matrix(this.f24458t)));
        arrayList.add(valueAnimatorOfFloat);
        com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
        animatorSet.setDuration(C1366k.m5800q(this.f67617ni7.getContext(), C6095k.zy.e10, this.f67617ni7.getContext().getResources().getInteger(C6095k.s.f79883fti)));
        animatorSet.setInterpolator(C1366k.m5799n(this.f67617ni7.getContext(), C6095k.zy.ia, C3910k.f67312toq));
        return animatorSet;
    }

    @lvui
    /* JADX INFO: renamed from: s */
    private AnimatorSet m14500s(@lvui C3915y c3915y, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f67617ni7, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        c3915y.m13996y("opacity").m13985k(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f67617ni7, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        c3915y.m13996y("scale").m13985k(objectAnimatorOfFloat2);
        i1(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f67617ni7, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        c3915y.m13996y("scale").m13985k(objectAnimatorOfFloat3);
        i1(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        m14501y(f4, this.f24458t);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f67617ni7, new C3909g(), new zy(), new Matrix(this.f24458t));
        c3915y.m13996y("iconScale").m13985k(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public void m14501y(float f2, @lvui Matrix matrix) {
        matrix.reset();
        if (this.f67617ni7.getDrawable() == null || this.f67612ki == 0) {
            return;
        }
        RectF rectF = this.f67618o1t;
        RectF rectF2 = this.f67622wvg;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i2 = this.f67612ki;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.f67612ki;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    void a9(int[] iArr) {
        this.f67623x2.m14620q(iArr);
    }

    /* JADX INFO: renamed from: b */
    final void m14502b() {
        Rect rect = this.f24460z;
        t8r(rect);
        jp0y(rect);
        this.f67611fu4.mo14487k(rect.left, rect.top, rect.right, rect.bottom);
    }

    void bf2(float f2) {
        C4108p c4108p = this.f67621toq;
        if (c4108p != null) {
            c4108p.zp(f2);
        }
    }

    /* JADX INFO: renamed from: c */
    final void m14503c(int i2) {
        if (this.f67612ki != i2) {
            this.f67612ki = i2;
            y9n();
        }
    }

    float cdj() {
        return this.f24457s;
    }

    void d2ok(@lvui Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f24452i;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    void d3() {
        ArrayList<p> arrayList = this.f67624zurt;
        if (arrayList != null) {
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().toq();
            }
        }
    }

    void dd(@dd ColorStateList colorStateList) {
        C4108p c4108p = this.f67621toq;
        if (c4108p != null) {
            c4108p.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.zy zyVar = this.f24456q;
        if (zyVar != null) {
            zyVar.m14520q(colorStateList);
        }
    }

    /* JADX INFO: renamed from: e */
    void m14504e(boolean z2) {
        this.f67609f7l8 = z2;
        m14502b();
    }

    void ek5k(@dd ld6 ld6Var, boolean z2) {
        if (o1t()) {
            return;
        }
        Animator animator = this.f67619qrj;
        if (animator != null) {
            animator.cancel();
        }
        boolean z3 = this.f67616n7h == null;
        if (!m14497o()) {
            this.f67617ni7.zy(0, z2);
            this.f67617ni7.setAlpha(1.0f);
            this.f67617ni7.setScaleY(1.0f);
            this.f67617ni7.setScaleX(1.0f);
            m14505f(1.0f);
            if (ld6Var != null) {
                ld6Var.mo14485k();
                return;
            }
            return;
        }
        if (this.f67617ni7.getVisibility() != 0) {
            this.f67617ni7.setAlpha(0.0f);
            this.f67617ni7.setScaleY(z3 ? 0.4f : 0.0f);
            this.f67617ni7.setScaleX(z3 ? 0.4f : 0.0f);
            m14505f(z3 ? 0.4f : 0.0f);
        }
        C3915y c3915y = this.f67616n7h;
        AnimatorSet animatorSetM14500s = c3915y != null ? m14500s(c3915y, 1.0f, 1.0f, 1.0f) : m14498p(1.0f, 1.0f, 1.0f);
        animatorSetM14500s.addListener(new toq(z2, ld6Var));
        ArrayList<Animator.AnimatorListener> arrayList = this.f24452i;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM14500s.addListener(it.next());
            }
        }
        animatorSetM14500s.start();
    }

    public void eqxt(@lvui Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f67610fn3e;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* JADX INFO: renamed from: f */
    final void m14505f(float f2) {
        this.f67608cdj = f2;
        Matrix matrix = this.f24458t;
        m14501y(f2, matrix);
        this.f67617ni7.setImageMatrix(matrix);
    }

    void f7l8(@lvui p pVar) {
        if (this.f67624zurt == null) {
            this.f67624zurt = new ArrayList<>();
        }
        this.f67624zurt.add(pVar);
    }

    @dd
    final kja0 fn3e() {
        return this.f24453k;
    }

    void fti(float f2, float f3, float f4) {
        m14502b();
        bf2(f2);
    }

    void fu4(ColorStateList colorStateList, @dd PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        C4108p c4108pX2 = x2();
        this.f67621toq = c4108pX2;
        c4108pX2.setTintList(colorStateList);
        if (mode != null) {
            this.f67621toq.setTintMode(mode);
        }
        this.f67621toq.y2(-12303292);
        this.f67621toq.m14856e(this.f67617ni7.getContext());
        C4094k c4094k = new C4094k(this.f67621toq.getShapeAppearanceModel());
        c4094k.setTintList(com.google.android.material.ripple.toq.m14763q(colorStateList2));
        this.f67625zy = c4094k;
        this.f24454n = new LayerDrawable(new Drawable[]{(Drawable) n7h.x2(this.f67621toq), c4094k});
    }

    /* JADX INFO: renamed from: g */
    void m14506g(@lvui Animator.AnimatorListener animatorListener) {
        if (this.f24452i == null) {
            this.f24452i = new ArrayList<>();
        }
        this.f24452i.add(animatorListener);
    }

    void gvn7() {
        float rotation = this.f67617ni7.getRotation();
        if (this.f24451h != rotation) {
            this.f24451h = rotation;
            yz();
        }
    }

    @dd
    /* JADX INFO: renamed from: h */
    final C3915y m14507h() {
        return this.f67613kja0;
    }

    final void hb(@dd C3915y c3915y) {
        this.f67616n7h = c3915y;
    }

    final void hyr(float f2) {
        if (this.f24457s != f2) {
            this.f24457s = f2;
            fti(this.f24459y, f2, this.f24455p);
        }
    }

    /* JADX INFO: renamed from: i */
    float m14508i() {
        return this.f24455p;
    }

    /* JADX INFO: renamed from: j */
    boolean mo14494j() {
        return true;
    }

    void jk() {
        ViewTreeObserver viewTreeObserver = this.f67617ni7.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f67615mcp;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f67615mcp = null;
        }
    }

    void jp0y(@lvui Rect rect) {
        n7h.qrj(this.f24454n, "Didn't initialize content background");
        if (!mo14494j()) {
            this.f67611fu4.setBackgroundDrawable(this.f24454n);
        } else {
            this.f67611fu4.setBackgroundDrawable(new InsetDrawable(this.f24454n, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    boolean kja0() {
        return this.f24450g;
    }

    /* JADX INFO: renamed from: l */
    void m14509l(boolean z2) {
        this.f24450g = z2;
    }

    void lrht(int i2) {
        this.f67614ld6 = i2;
    }

    void lvui(@lvui p pVar) {
        ArrayList<p> arrayList = this.f67624zurt;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(pVar);
    }

    /* JADX INFO: renamed from: m */
    final boolean m14510m() {
        return !this.f24450g || this.f67617ni7.getSizeDimension() >= this.f67614ld6;
    }

    void mcp() {
    }

    /* JADX INFO: renamed from: n */
    public void m14511n(@lvui Animator.AnimatorListener animatorListener) {
        if (this.f67610fn3e == null) {
            this.f67610fn3e = new ArrayList<>();
        }
        this.f67610fn3e.add(animatorListener);
    }

    final void n5r1(@dd C3915y c3915y) {
        this.f67613kja0 = c3915y;
    }

    float n7h() {
        return this.f24459y;
    }

    final void ncyb(float f2) {
        if (this.f24459y != f2) {
            this.f24459y = f2;
            fti(f2, this.f24457s, this.f24455p);
        }
    }

    void ni7(@dd ld6 ld6Var, boolean z2) {
        if (m14513z()) {
            return;
        }
        Animator animator = this.f67619qrj;
        if (animator != null) {
            animator.cancel();
        }
        if (!m14497o()) {
            this.f67617ni7.zy(z2 ? 8 : 4, z2);
            if (ld6Var != null) {
                ld6Var.toq();
                return;
            }
            return;
        }
        C3915y c3915y = this.f67613kja0;
        AnimatorSet animatorSetM14500s = c3915y != null ? m14500s(c3915y, 0.0f, 0.0f, 0.0f) : m14498p(0.0f, 0.4f, 0.4f);
        animatorSetM14500s.addListener(new k(z2, ld6Var));
        ArrayList<Animator.AnimatorListener> arrayList = this.f67610fn3e;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetM14500s.addListener(it.next());
            }
        }
        animatorSetM14500s.start();
    }

    final void nn86(@lvui kja0 kja0Var) {
        this.f24453k = kja0Var;
        C4108p c4108p = this.f67621toq;
        if (c4108p != null) {
            c4108p.setShapeAppearanceModel(kja0Var);
        }
        Object obj = this.f67625zy;
        if (obj instanceof t8r) {
            ((t8r) obj).setShapeAppearanceModel(kja0Var);
        }
        com.google.android.material.floatingactionbutton.zy zyVar = this.f24456q;
        if (zyVar != null) {
            zyVar.f7l8(kja0Var);
        }
    }

    boolean o1t() {
        return this.f67617ni7.getVisibility() != 0 ? this.f67620t8r == 2 : this.f67620t8r != 1;
    }

    void oc() {
        ArrayList<p> arrayList = this.f67624zurt;
        if (arrayList != null) {
            Iterator<p> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo14486k();
            }
        }
    }

    @dd
    final Drawable qrj() {
        return this.f24454n;
    }

    /* JADX INFO: renamed from: r */
    boolean mo14495r() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    void m14512t() {
        C4108p c4108p = this.f67621toq;
        if (c4108p != null) {
            com.google.android.material.shape.ld6.m14841g(this.f67617ni7, c4108p);
        }
        if (mo14495r()) {
            this.f67617ni7.getViewTreeObserver().addOnPreDrawListener(ki());
        }
    }

    void t8r(@lvui Rect rect) {
        int sizeDimension = this.f24450g ? (this.f67614ld6 - this.f67617ni7.getSizeDimension()) / 2 : 0;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(this.f67609f7l8 ? n7h() + this.f24455p : 0.0f));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(r1 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    final void uv6(float f2) {
        if (this.f24455p != f2) {
            this.f24455p = f2;
            fti(this.f24459y, this.f24457s, f2);
        }
    }

    void vyq(@dd ColorStateList colorStateList) {
        Drawable drawable = this.f67625zy;
        if (drawable != null) {
            androidx.core.graphics.drawable.zy.kja0(drawable, com.google.android.material.ripple.toq.m14763q(colorStateList));
        }
    }

    void wvg() {
        this.f67623x2.zy();
    }

    C4108p x2() {
        return new C4108p((kja0) n7h.x2(this.f24453k));
    }

    void x9kr(@dd PorterDuff.Mode mode) {
        C4108p c4108p = this.f67621toq;
        if (c4108p != null) {
            c4108p.setTintMode(mode);
        }
    }

    final void y9n() {
        m14505f(this.f67608cdj);
    }

    void yz() {
        C4108p c4108p = this.f67621toq;
        if (c4108p != null) {
            c4108p.c8jq((int) this.f24451h);
        }
    }

    /* JADX INFO: renamed from: z */
    boolean m14513z() {
        return this.f67617ni7.getVisibility() == 0 ? this.f67620t8r == 1 : this.f67620t8r != 2;
    }

    @dd
    final C3915y zurt() {
        return this.f67616n7h;
    }
}
