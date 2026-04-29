package miuix.slidingwidget.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.appcompat.widget.nmn5;
import i1an.toq;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import miuix.smooth.SmoothContainerDrawable2;
import miuix.view.C7385p;
import miuix.view.HapticCompat;

/* JADX INFO: compiled from: SlidingButtonHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    public static final int f90067lrht = 255;

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static final int[] f90068uv6 = {R.attr.state_checked};

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private SpringAnimation f90069a9;

    /* JADX INFO: renamed from: c */
    private int f41621c;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f90070cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f90075f7l8;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private SpringAnimation f90077fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private Drawable f90078fu4;

    /* JADX INFO: renamed from: g */
    private int f41623g;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private float f90079gvn7;

    /* JADX INFO: renamed from: h */
    private boolean f41624h;

    /* JADX INFO: renamed from: i */
    private StateListDrawable f41625i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private SpringAnimation f90081jk;

    /* JADX INFO: renamed from: k */
    private Drawable f41626k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f90083ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f90084kja0;

    /* JADX INFO: renamed from: l */
    private int f41627l;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f90085ld6;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private SpringAnimation f90087mcp;

    /* JADX INFO: renamed from: n */
    private int f41628n;

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    private int f90088n5r1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f90089n7h;

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    private int f90090ncyb;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private Drawable f90091ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private CompoundButton f90092o1t;

    /* JADX INFO: renamed from: p */
    private int f41629p;

    /* JADX INFO: renamed from: q */
    private int f41630q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f90094qrj;

    /* JADX INFO: renamed from: s */
    private int f41632s;

    /* JADX INFO: renamed from: t */
    private SpringAnimation f41633t;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f90096toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f90097wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f90098x2;

    /* JADX INFO: renamed from: y */
    private int f41634y;

    /* JADX INFO: renamed from: z */
    private Drawable f41635z;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Drawable f90101zy;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private Rect f90095t8r = new Rect();

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private boolean f90076fn3e = false;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private FloatProperty<CompoundButton> f90100zurt = new C7326k("SliderOffset");

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private float f90082jp0y = 1.0f;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private boolean f90072d3 = false;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private int f90093oc = -1;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private int f90074eqxt = -1;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private boolean f90071d2ok = false;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private float f90086lvui = -1.0f;

    /* JADX INFO: renamed from: r */
    private FloatProperty<CompoundButton> f41631r = new C8111toq("SliderScale");

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private DynamicAnimation.OnAnimationUpdateListener f90073dd = new DynamicAnimation.OnAnimationUpdateListener() { // from class: miuix.slidingwidget.widget.k
        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
            this.f41620k.o1t(dynamicAnimation, f2, f3);
        }
    };

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    private FloatProperty<CompoundButton> f90099x9kr = new zy("MaskCheckedSlideBarAlpha");

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    private float f90080hyr = 1.0f;

    /* JADX INFO: renamed from: f */
    private float[] f41622f = {0.0f, 0.0f};

    /* JADX INFO: renamed from: miuix.slidingwidget.widget.toq$k */
    /* JADX INFO: compiled from: SlidingButtonHelper.java */
    class C7326k extends FloatProperty<CompoundButton> {
        C7326k(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(CompoundButton compoundButton) {
            return toq.this.t8r();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(CompoundButton compoundButton, float f2) {
            toq.this.hyr((int) f2);
        }
    }

    /* JADX INFO: renamed from: miuix.slidingwidget.widget.toq$n */
    /* JADX INFO: compiled from: SlidingButtonHelper.java */
    class RunnableC7327n implements Runnable {
        RunnableC7327n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            toq toqVar = toq.this;
            toqVar.f90097wvg = toqVar.f90098x2 >= toq.this.f90085ld6;
        }
    }

    /* JADX INFO: renamed from: miuix.slidingwidget.widget.toq$q */
    /* JADX INFO: compiled from: SlidingButtonHelper.java */
    class C7328q implements DynamicAnimation.OnAnimationEndListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Runnable f41638k;

        C7328q(Runnable runnable) {
            this.f41638k = runnable;
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationEndListener
        public void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f2, float f3) {
            this.f41638k.run();
        }
    }

    /* JADX INFO: renamed from: miuix.slidingwidget.widget.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SlidingButtonHelper.java */
    class C8111toq extends FloatProperty<CompoundButton> {
        C8111toq(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(CompoundButton compoundButton) {
            return toq.this.f90082jp0y;
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(CompoundButton compoundButton, float f2) {
            toq.this.f90082jp0y = f2;
        }
    }

    /* JADX INFO: compiled from: SlidingButtonHelper.java */
    class zy extends FloatProperty<CompoundButton> {
        zy(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(CompoundButton compoundButton) {
            return toq.this.f90079gvn7;
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(CompoundButton compoundButton, float f2) {
            toq.this.f90079gvn7 = f2;
        }
    }

    public toq(CompoundButton compoundButton) {
        this.f90079gvn7 = 1.0f;
        this.f90092o1t = compoundButton;
        this.f90097wvg = compoundButton.isChecked();
        if (this.f90092o1t.isChecked()) {
            return;
        }
        this.f90079gvn7 = 0.0f;
    }

    /* JADX INFO: renamed from: c */
    private void m26560c(boolean z2) {
        SpringAnimation springAnimation = this.f90077fti;
        if (springAnimation == null || !springAnimation.isRunning()) {
            boolean z3 = this.f90097wvg;
            this.f90098x2 = z3 ? this.f90085ld6 : this.f41629p;
            this.f90096toq = z3 ? 255 : 0;
        }
        d3();
        dd(z2);
    }

    private void d2ok(Canvas canvas, int i2, int i3) {
        canvas.save();
        float f2 = this.f90082jp0y;
        canvas.scale(f2, f2, i2, i3);
    }

    private void d3() {
        if (this.f90072d3) {
            this.f90098x2 = this.f90093oc;
            this.f90096toq = this.f90074eqxt;
            this.f90079gvn7 = this.f90086lvui;
            this.f90097wvg = this.f90071d2ok;
            this.f90072d3 = false;
            this.f90093oc = -1;
            this.f90074eqxt = -1;
            this.f90086lvui = -1.0f;
        }
    }

    private void dd(boolean z2) {
        if (this.f90097wvg) {
            if (this.f90069a9.isRunning()) {
                this.f90069a9.cancel();
            }
            if (!this.f90081jk.isRunning() && !z2) {
                this.f90079gvn7 = 1.0f;
            }
        }
        if (this.f90097wvg) {
            return;
        }
        if (this.f90081jk.isRunning()) {
            this.f90081jk.cancel();
        }
        if (this.f90069a9.isRunning() || !z2) {
            return;
        }
        this.f90079gvn7 = 0.0f;
    }

    private void eqxt(Canvas canvas) {
        canvas.restore();
    }

    private void fti() {
        if (this.f90087mcp.isRunning()) {
            this.f90087mcp.cancel();
        }
        if (this.f41633t.isRunning()) {
            return;
        }
        this.f41633t.start();
    }

    private void gvn7() {
        if (this.f41633t.isRunning()) {
            this.f41633t.cancel();
        }
        if (this.f90087mcp.isRunning()) {
            return;
        }
        this.f90087mcp.start();
    }

    private void jk(Canvas canvas) {
        int i2 = (int) ((1.0f - this.f90079gvn7) * 255.0f);
        if (i2 > 0) {
            this.f90078fu4.setAlpha(i2);
            this.f90078fu4.draw(canvas);
        }
        int i3 = (int) (this.f90079gvn7 * 255.0f);
        if (i3 > 0) {
            this.f90091ni7.setAlpha(i3);
            this.f90091ni7.draw(canvas);
        }
    }

    private void ld6(boolean z2, int i2, Runnable runnable) {
        SpringAnimation springAnimation = this.f90077fti;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.f90077fti.cancel();
        }
        if (z2 != this.f90092o1t.isChecked()) {
            return;
        }
        SpringAnimation springAnimation2 = new SpringAnimation(this.f90092o1t, this.f90100zurt, i2);
        this.f90077fti = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f90077fti.getSpring().setDampingRatio(0.7f);
        this.f90077fti.addUpdateListener(this.f90073dd);
        this.f90077fti.addEndListener(new C7328q(runnable));
        this.f90077fti.start();
        if (z2) {
            if (!this.f90081jk.isRunning()) {
                this.f90081jk.start();
            }
            if (this.f90069a9.isRunning()) {
                this.f90069a9.cancel();
                return;
            }
            return;
        }
        if (!this.f90069a9.isRunning()) {
            this.f90069a9.start();
        }
        if (this.f90081jk.isRunning()) {
            this.f90081jk.cancel();
        }
    }

    private StateListDrawable n7h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setBounds(0, 0, this.f41628n, this.f41623g);
        stateListDrawable.setCallback(this.f90092o1t);
        return stateListDrawable;
    }

    private void ni7(Drawable drawable, Drawable drawable2, Drawable drawable3) {
        this.f90091ni7 = drawable;
        this.f90078fu4 = drawable2;
        this.f41635z = drawable3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1t(DynamicAnimation dynamicAnimation, float f2, float f3) {
        this.f90092o1t.invalidate();
    }

    private void oc() {
        this.f90093oc = this.f90098x2;
        this.f90074eqxt = this.f90096toq;
        this.f90086lvui = this.f90079gvn7;
        this.f90071d2ok = this.f90097wvg;
        this.f90072d3 = true;
    }

    /* JADX INFO: renamed from: p */
    private void m26564p(boolean z2) {
        if (z2 != this.f90092o1t.isChecked()) {
            this.f90092o1t.setChecked(z2);
            m26560c(z2);
            m26573t();
        }
        ld6(z2, z2 ? this.f90085ld6 : this.f41629p, new RunnableC7327n());
    }

    private Drawable qrj(Drawable drawable) {
        SmoothContainerDrawable2 smoothContainerDrawable2 = new SmoothContainerDrawable2();
        smoothContainerDrawable2.cdj(this.f90092o1t.getLayerType());
        smoothContainerDrawable2.m26587h(this.f90090ncyb);
        smoothContainerDrawable2.n7h(drawable);
        int i2 = this.f90088n5r1;
        int i3 = this.f41627l;
        smoothContainerDrawable2.setBounds(new Rect(i2, i3, this.f41628n - i2, this.f41623g - i3));
        return smoothContainerDrawable2;
    }

    /* JADX INFO: renamed from: s */
    private float[] m26566s(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        view.getLocationOnScreen(new int[2]);
        float width = r2[0] + (view.getWidth() * 0.5f);
        float height = r2[1] + (view.getHeight() * 0.5f);
        float width2 = view.getWidth() == 0 ? 0.0f : (rawX - width) / view.getWidth();
        float height2 = view.getHeight() != 0 ? (rawY - height) / view.getHeight() : 0.0f;
        float fMax = Math.max(-1.0f, Math.min(1.0f, width2));
        float fMax2 = Math.max(-1.0f, Math.min(1.0f, height2));
        int i2 = this.f41621c;
        return new float[]{fMax * i2, fMax2 * i2};
    }

    private void wvg(int i2) {
        if (nmn5.toq(this.f90092o1t)) {
            i2 = -i2;
        }
        int i3 = this.f90098x2 + i2;
        this.f90098x2 = i3;
        int i4 = this.f41629p;
        if (i3 < i4) {
            this.f90098x2 = i4;
        } else {
            int i5 = this.f90085ld6;
            if (i3 > i5) {
                this.f90098x2 = i5;
            }
        }
        int i6 = this.f90098x2;
        boolean z2 = i6 == i4 || i6 == this.f90085ld6;
        if (z2 && !this.f90076fn3e) {
            HapticCompat.m26766g(this.f90092o1t, C7385p.f92233d2ok, C7385p.f92245ld6);
        }
        this.f90076fn3e = z2;
        hyr(this.f90098x2);
    }

    private void x2() {
        m26564p(!this.f90092o1t.isChecked());
        HapticCompat.m26766g(this.f90092o1t, C7385p.f92233d2ok, C7385p.f92245ld6);
    }

    public void a9(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            this.f41622f = m26566s(this.f90092o1t, motionEvent);
            this.f90092o1t.invalidate();
            return;
        }
        if (actionMasked == 9) {
            if (this.f90087mcp.isRunning()) {
                this.f90087mcp.cancel();
            }
            this.f41633t.start();
        } else {
            if (actionMasked != 10) {
                return;
            }
            float[] fArr = this.f41622f;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            if (this.f41633t.isRunning()) {
                this.f41633t.cancel();
            }
            this.f90087mcp.start();
        }
    }

    public int cdj() {
        return this.f41628n;
    }

    /* JADX INFO: renamed from: f */
    public void m26568f(int i2) {
        this.f90096toq = i2;
        this.f90092o1t.invalidate();
    }

    public int fn3e() {
        return this.f90096toq;
    }

    public void fu4(Context context, TypedArray typedArray) {
        this.f90090ncyb = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77445m4);
        this.f41627l = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77481w831);
        this.f90088n5r1 = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77401cfr);
        this.f90092o1t.setDrawingCacheEnabled(false);
        this.f90070cdj = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        this.f41626k = typedArray.getDrawable(toq.n7h.ume);
        this.f90101zy = typedArray.getDrawable(toq.n7h.mzno);
        this.f90092o1t.setBackground(typedArray.getDrawable(toq.n7h.yn));
        Color.parseColor("#FF3482FF");
        this.f41630q = typedArray.getColor(toq.n7h.un3l, context.getColor(toq.C6081n.f77614ikck));
        int dimensionPixelSize = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77412etdu);
        int dimensionPixelSize2 = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77477v0af);
        int dimensionPixelSize3 = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77468sok);
        this.f41628n = (dimensionPixelSize2 * 2) + this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77467se);
        this.f41623g = (dimensionPixelSize * 2) + dimensionPixelSize3;
        int dimensionPixelSize4 = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77435kcsr);
        int dimensionPixelSize5 = this.f90092o1t.getResources().getDimensionPixelSize(toq.C6079g.f77494z4);
        this.f41632s = dimensionPixelSize5;
        this.f90075f7l8 = dimensionPixelSize4;
        this.f41634y = dimensionPixelSize4;
        this.f41629p = 0;
        this.f90085ld6 = (this.f41628n - dimensionPixelSize4) - (dimensionPixelSize5 * 2);
        this.f90098x2 = 0;
        TypedValue typedValue = new TypedValue();
        int i2 = toq.n7h.wd;
        typedArray.getValue(i2, typedValue);
        TypedValue typedValue2 = new TypedValue();
        int i3 = toq.n7h.jcwh;
        typedArray.getValue(i3, typedValue2);
        Drawable drawable = typedArray.getDrawable(i2);
        Drawable drawable2 = typedArray.getDrawable(i3);
        if (typedValue.type == typedValue2.type && typedValue.data == typedValue2.data && typedValue.resourceId == typedValue2.resourceId) {
            drawable2 = drawable;
        }
        if (drawable2 != null && drawable != null) {
            drawable2.setTint(this.f41630q);
            ni7(qrj(drawable2), qrj(drawable), qrj(drawable2));
            this.f41625i = n7h();
        }
        n5r1();
        if (this.f90092o1t.isChecked()) {
            hyr(this.f90085ld6);
        }
        this.f41621c = this.f90092o1t.getResources().getDimensionPixelOffset(toq.C6079g.f77492yqrt);
    }

    /* JADX INFO: renamed from: h */
    public int m26569h() {
        return this.f41623g;
    }

    public void hyr(int i2) {
        this.f90098x2 = i2;
        this.f90092o1t.invalidate();
    }

    /* JADX INFO: renamed from: i */
    public Drawable m26570i() {
        return this.f41626k;
    }

    public void jp0y(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        Rect rect = this.f90095t8r;
        boolean qVar = nmn5.toq(this.f90092o1t);
        rect.set(qVar ? (this.f41628n - this.f90098x2) - this.f90075f7l8 : this.f90098x2, 0, qVar ? this.f41628n - this.f90098x2 : this.f90098x2 + this.f90075f7l8, this.f41623g);
        if (action == 0) {
            if (rect.contains(x3, y3)) {
                this.f90084kja0 = true;
                this.f90092o1t.setPressed(true);
                fti();
                int i2 = this.f90098x2;
                if (i2 > this.f41629p && i2 < this.f90085ld6) {
                    z = false;
                }
                this.f90076fn3e = z;
            } else {
                this.f90084kja0 = false;
            }
            this.f90094qrj = x3;
            this.f90089n7h = x3;
            this.f41624h = false;
            return;
        }
        if (action == 1) {
            this.f90092o1t.playSoundEffect(0);
            gvn7();
            if (this.f90084kja0 && this.f41624h) {
                z = this.f90098x2 >= this.f90085ld6 / 2;
                this.f90097wvg = z;
                m26564p(z);
                if (rect.contains(x3, y3)) {
                    HapticCompat.m26766g(this.f90092o1t, C7385p.f92233d2ok, C7385p.f92245ld6);
                }
            } else {
                x2();
            }
            this.f90084kja0 = false;
            this.f41624h = false;
            this.f90092o1t.setPressed(false);
            return;
        }
        if (action == 2) {
            if (this.f90084kja0) {
                wvg(x3 - this.f90094qrj);
                this.f90094qrj = x3;
                if (Math.abs(x3 - this.f90089n7h) >= this.f90070cdj) {
                    this.f41624h = true;
                    this.f90092o1t.getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            return;
        }
        if (action != 3) {
            return;
        }
        gvn7();
        if (this.f90084kja0) {
            z = this.f90098x2 >= this.f90085ld6 / 2;
            this.f90097wvg = z;
            m26564p(z);
        }
        this.f90084kja0 = false;
        this.f41624h = false;
        this.f90092o1t.setPressed(false);
    }

    public StateListDrawable ki() {
        return this.f41625i;
    }

    public float kja0() {
        return this.f90080hyr;
    }

    /* JADX INFO: renamed from: l */
    public void m26571l() {
        ViewParent parent = this.f90092o1t.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(false);
        }
    }

    public boolean lrht(Drawable drawable) {
        return drawable == this.f41625i;
    }

    public void lvui(float f2) {
        this.f90080hyr = f2;
    }

    public void mcp(Canvas canvas) {
        n5r1();
        jk(canvas);
        boolean qVar = nmn5.toq(this.f90092o1t);
        int i2 = this.f41632s;
        if (qVar) {
            i2 = -i2;
        }
        int i3 = qVar ? (this.f41628n - this.f90098x2) - this.f90075f7l8 : this.f90098x2;
        float[] fArr = this.f41622f;
        float f2 = fArr[0];
        int i4 = i3 + i2 + ((int) f2);
        int i5 = (qVar ? this.f41628n - this.f90098x2 : this.f90075f7l8 + this.f90098x2) + i2 + ((int) f2);
        int i6 = this.f41623g;
        int i7 = this.f41634y;
        int i8 = ((i6 - i7) / 2) + ((int) fArr[1]);
        int i9 = i7 + i8;
        d2ok(canvas, (i5 + i4) / 2, (i9 + i8) / 2);
        if (this.f90097wvg) {
            this.f41626k.setBounds(i4, i8, i5, i9);
            this.f41626k.draw(canvas);
        } else {
            this.f90101zy.setBounds(i4, i8, i5, i9);
            this.f90101zy.draw(canvas);
        }
        eqxt(canvas);
    }

    public void n5r1() {
        if (m26570i() != null) {
            this.f41626k.setState(this.f90092o1t.getDrawableState());
            this.f90101zy.setState(this.f90092o1t.getDrawableState());
            this.f41625i.setState(this.f90092o1t.getDrawableState());
            this.f90091ni7.setState(this.f90092o1t.getDrawableState());
            this.f90078fu4.setState(this.f90092o1t.getDrawableState());
        }
    }

    public void ncyb(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f90083ki = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: r */
    public void m26572r(boolean z2) {
        oc();
        this.f90097wvg = z2;
        this.f90098x2 = z2 ? this.f90085ld6 : this.f41629p;
        this.f90096toq = z2 ? 255 : 0;
        this.f90079gvn7 = z2 ? 1.0f : 0.0f;
        SpringAnimation springAnimation = this.f90077fti;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.f90077fti.cancel();
        }
        if (this.f90069a9.isRunning()) {
            this.f90069a9.cancel();
        }
        if (this.f90081jk.isRunning()) {
            this.f90081jk.cancel();
        }
        this.f90092o1t.invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m26573t() {
        if (this.f90083ki != null) {
            this.f90083ki.onCheckedChanged(this.f90092o1t, this.f90092o1t.isChecked());
        }
    }

    public int t8r() {
        return this.f90098x2;
    }

    public void x9kr(int i2) {
        Drawable drawable = this.f90091ni7;
        if (drawable instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable).cdj(i2);
        }
        Drawable drawable2 = this.f90078fu4;
        if (drawable2 instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable2).cdj(i2);
        }
        Drawable drawable3 = this.f41635z;
        if (drawable3 instanceof SmoothContainerDrawable2) {
            ((SmoothContainerDrawable2) drawable3).cdj(i2);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m26574z() {
        StateListDrawable stateListDrawable = this.f41625i;
        if (stateListDrawable != null) {
            stateListDrawable.jumpToCurrentState();
        }
    }

    public void zurt() {
        SpringAnimation springAnimation = new SpringAnimation(this.f90092o1t, this.f41631r, 1.127f);
        this.f41633t = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.f41633t.getSpring().setDampingRatio(0.6f);
        this.f41633t.setMinimumVisibleChange(0.002f);
        this.f41633t.addUpdateListener(this.f90073dd);
        SpringAnimation springAnimation2 = new SpringAnimation(this.f90092o1t, this.f41631r, 1.0f);
        this.f90087mcp = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f90087mcp.getSpring().setDampingRatio(0.6f);
        this.f90087mcp.setMinimumVisibleChange(0.002f);
        this.f90087mcp.addUpdateListener(this.f90073dd);
        SpringAnimation springAnimation3 = new SpringAnimation(this.f90092o1t, this.f90099x9kr, 1.0f);
        this.f90081jk = springAnimation3;
        springAnimation3.getSpring().setStiffness(438.64f);
        this.f90081jk.getSpring().setDampingRatio(0.99f);
        this.f90081jk.setMinimumVisibleChange(0.00390625f);
        this.f90081jk.addUpdateListener(this.f90073dd);
        SpringAnimation springAnimation4 = new SpringAnimation(this.f90092o1t, this.f90099x9kr, 0.0f);
        this.f90069a9 = springAnimation4;
        springAnimation4.getSpring().setStiffness(986.96f);
        this.f90069a9.getSpring().setDampingRatio(0.99f);
        this.f90069a9.setMinimumVisibleChange(0.00390625f);
        this.f90069a9.addUpdateListener(this.f90073dd);
    }
}
