package miuix.internal.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import com.miui.maml.animation.AlphaAnimation;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import zy.hyr;

/* JADX INFO: renamed from: miuix.internal.view.q */
/* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 21)
public class C7176q {

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final float f87804o1t = 986.96f;

    /* JADX INFO: renamed from: z */
    private static final int f40419z = 255;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private SpringAnimation f87805cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private CheckBoxAnimatedStateListDrawable f87806f7l8;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private boolean f87808fu4;

    /* JADX INFO: renamed from: g */
    private miuix.internal.view.toq f40420g;

    /* JADX INFO: renamed from: h */
    private SpringAnimation f40421h;

    /* JADX INFO: renamed from: k */
    private int f40423k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private SpringAnimation f87810kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private SpringAnimation f87811ld6;

    /* JADX INFO: renamed from: n */
    private miuix.internal.view.toq f40424n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private SpringAnimation f87812n7h;

    /* JADX INFO: renamed from: p */
    private SpringAnimation f40425p;

    /* JADX INFO: renamed from: q */
    private miuix.internal.view.toq f40426q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private SpringAnimation f87814qrj;

    /* JADX INFO: renamed from: s */
    private SpringAnimation f40427s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f87816toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private SpringAnimation f87817x2;

    /* JADX INFO: renamed from: y */
    private SpringAnimation f40428y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private float f87819zy = 1.0f;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private DynamicAnimation.OnAnimationUpdateListener f87809ki = new DynamicAnimation.OnAnimationUpdateListener() { // from class: miuix.internal.view.zy
        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
            this.f40442k.m26009y(dynamicAnimation, f2, f3);
        }
    };

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private DynamicAnimation.OnAnimationUpdateListener f87815t8r = new k();

    /* JADX INFO: renamed from: i */
    private FloatProperty<CheckBoxAnimatedStateListDrawable> f40422i = new toq("Scale");

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private FloatProperty<CheckBoxAnimatedStateListDrawable> f87807fn3e = new zy("ContentAlpha");

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private FloatProperty<C7176q> f87818zurt = new q("Scale");

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private FloatProperty<miuix.internal.view.toq> f87813ni7 = new n(AlphaAnimation.INNER_TAG_NAME);

    /* JADX INFO: renamed from: miuix.internal.view.q$f7l8 */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class f7l8 implements Runnable {
        f7l8() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C7176q.this.f87810kja0.isRunning()) {
                C7176q.this.f87810kja0.start();
            }
            if (C7176q.this.f40421h.isRunning()) {
                return;
            }
            C7176q.this.f40421h.start();
        }
    }

    /* JADX INFO: renamed from: miuix.internal.view.q$g */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class g implements DynamicAnimation.OnAnimationUpdateListener {
        g() {
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
            C7176q.this.f87806f7l8.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: miuix.internal.view.q$k */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class k implements DynamicAnimation.OnAnimationUpdateListener {
        k() {
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
            C7176q.this.f87806f7l8.x2(C7176q.this.m26010g());
            C7176q.this.f87806f7l8.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: miuix.internal.view.q$n */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class n extends FloatProperty<miuix.internal.view.toq> {
        n(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(miuix.internal.view.toq toqVar) {
            return toqVar.getAlpha() / 255;
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(miuix.internal.view.toq toqVar, float f2) {
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            toqVar.setAlpha((int) (f2 * 255.0f));
        }
    }

    /* JADX INFO: renamed from: miuix.internal.view.q$q */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class q extends FloatProperty<C7176q> {
        q(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(C7176q c7176q) {
            return C7176q.this.m26010g();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(C7176q c7176q, float f2) {
            C7176q.this.ld6(f2);
        }
    }

    /* JADX INFO: renamed from: miuix.internal.view.q$toq */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class toq extends FloatProperty<CheckBoxAnimatedStateListDrawable> {
        toq(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable) {
            return C7176q.this.f87806f7l8.m26004q();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, float f2) {
            C7176q.this.f87806f7l8.x2(f2);
        }
    }

    /* JADX INFO: renamed from: miuix.internal.view.q$zy */
    /* JADX INFO: compiled from: CheckWidgetDrawableAnims.java */
    class zy extends FloatProperty<CheckBoxAnimatedStateListDrawable> {
        zy(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable) {
            return checkBoxAnimatedStateListDrawable.zy();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, float f2) {
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            checkBoxAnimatedStateListDrawable.ld6(f2);
        }
    }

    public C7176q(CheckBoxAnimatedStateListDrawable checkBoxAnimatedStateListDrawable, boolean z2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f40423k = i5;
        this.f87816toq = i6;
        this.f87808fu4 = z2;
        miuix.internal.view.toq toqVar = new miuix.internal.view.toq(i2, i5, i6, i7, i8, i9);
        this.f40426q = toqVar;
        toqVar.setAlpha(this.f40423k);
        miuix.internal.view.toq toqVar2 = new miuix.internal.view.toq(i3, i5, i6);
        this.f40424n = toqVar2;
        toqVar2.setAlpha(0);
        miuix.internal.view.toq toqVar3 = new miuix.internal.view.toq(i4, i5, i6);
        this.f40420g = toqVar3;
        toqVar3.setAlpha(255);
        this.f87806f7l8 = checkBoxAnimatedStateListDrawable;
        f7l8();
    }

    private void f7l8() {
        SpringAnimation springAnimation = new SpringAnimation(this, this.f87818zurt, 0.85f);
        this.f40428y = springAnimation;
        springAnimation.getSpring().setStiffness(f87804o1t);
        this.f40428y.getSpring().setDampingRatio(0.99f);
        this.f40428y.getSpring().setFinalPosition(0.85f);
        this.f40428y.setMinimumVisibleChange(0.002f);
        this.f40428y.addUpdateListener(this.f87815t8r);
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.f87818zurt, 1.0f);
        this.f87811ld6 = springAnimation2;
        springAnimation2.getSpring().setStiffness(f87804o1t);
        this.f87811ld6.getSpring().setDampingRatio(0.6f);
        this.f87811ld6.setMinimumVisibleChange(0.002f);
        this.f87811ld6.addUpdateListener(new g());
        SpringAnimation springAnimation3 = new SpringAnimation(this.f87806f7l8, this.f87807fn3e, 0.5f);
        this.f87812n7h = springAnimation3;
        springAnimation3.getSpring().setStiffness(f87804o1t);
        this.f87812n7h.getSpring().setDampingRatio(0.99f);
        this.f87812n7h.setMinimumVisibleChange(0.00390625f);
        this.f87812n7h.addUpdateListener(this.f87809ki);
        SpringAnimation springAnimation4 = new SpringAnimation(this.f40424n, this.f87813ni7, 0.1f);
        this.f40427s = springAnimation4;
        springAnimation4.getSpring().setStiffness(f87804o1t);
        this.f40427s.getSpring().setDampingRatio(0.99f);
        this.f40427s.setMinimumVisibleChange(0.00390625f);
        this.f40427s.addUpdateListener(this.f87809ki);
        SpringAnimation springAnimation5 = new SpringAnimation(this.f40424n, this.f87813ni7, 0.0f);
        this.f40425p = springAnimation5;
        springAnimation5.getSpring().setStiffness(f87804o1t);
        this.f40425p.getSpring().setDampingRatio(0.99f);
        this.f40425p.setMinimumVisibleChange(0.00390625f);
        this.f40425p.addUpdateListener(this.f87809ki);
        SpringAnimation springAnimation6 = new SpringAnimation(this.f40420g, this.f87813ni7, 1.0f);
        this.f87817x2 = springAnimation6;
        springAnimation6.getSpring().setStiffness(f87804o1t);
        this.f87817x2.getSpring().setDampingRatio(0.7f);
        this.f87817x2.setMinimumVisibleChange(0.00390625f);
        this.f87817x2.addUpdateListener(this.f87809ki);
        SpringAnimation springAnimation7 = new SpringAnimation(this.f87806f7l8, this.f87807fn3e, 1.0f);
        this.f87810kja0 = springAnimation7;
        springAnimation7.getSpring().setStiffness(438.64f);
        this.f87810kja0.getSpring().setDampingRatio(0.6f);
        this.f87810kja0.setMinimumVisibleChange(0.00390625f);
        this.f87810kja0.addUpdateListener(this.f87809ki);
        SpringAnimation springAnimation8 = new SpringAnimation(this.f40420g, this.f87813ni7, 0.0f);
        this.f87814qrj = springAnimation8;
        springAnimation8.getSpring().setStiffness(f87804o1t);
        this.f87814qrj.getSpring().setDampingRatio(0.99f);
        this.f87814qrj.setMinimumVisibleChange(0.00390625f);
        this.f87814qrj.addUpdateListener(this.f87809ki);
        SpringAnimation springAnimation9 = new SpringAnimation(this.f87806f7l8, this.f40422i, 1.0f);
        this.f40421h = springAnimation9;
        springAnimation9.getSpring().setStiffness(438.64f);
        this.f40421h.getSpring().setDampingRatio(0.6f);
        this.f40421h.setMinimumVisibleChange(0.002f);
        this.f40421h.addUpdateListener(this.f87809ki);
        if (this.f87808fu4) {
            this.f40421h.setStartVelocity(5.0f);
        } else {
            this.f40421h.setStartVelocity(10.0f);
        }
        SpringAnimation springAnimation10 = new SpringAnimation(this.f87806f7l8, this.f40422i, 0.3f);
        this.f87805cdj = springAnimation10;
        springAnimation10.getSpring().setStiffness(f87804o1t);
        this.f87805cdj.getSpring().setDampingRatio(0.99f);
        this.f87805cdj.setMinimumVisibleChange(0.002f);
        this.f87805cdj.addUpdateListener(this.f87815t8r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m26009y(DynamicAnimation dynamicAnimation, float f2, float f3) {
        this.f87806f7l8.invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public float m26010g() {
        return this.f87819zy;
    }

    public void ld6(float f2) {
        this.f40426q.toq(f2);
        this.f40424n.toq(f2);
        this.f40420g.toq(f2);
        this.f87819zy = f2;
    }

    /* JADX INFO: renamed from: n */
    public void m26011n(Canvas canvas) {
        this.f40426q.draw(canvas);
        this.f40424n.draw(canvas);
        this.f40420g.draw(canvas);
    }

    protected void n7h(boolean z2, boolean z3) {
        if (!z3) {
            this.f40420g.setAlpha(0);
            this.f40424n.setAlpha(0);
            this.f40426q.setAlpha(this.f87816toq);
        } else {
            if (z2) {
                this.f40420g.setAlpha(255);
                this.f40424n.setAlpha(25);
            } else {
                this.f40420g.setAlpha(0);
                this.f40424n.setAlpha(0);
            }
            this.f40426q.setAlpha(this.f40423k);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m26012p(Rect rect) {
        this.f40426q.setBounds(rect);
        this.f40424n.setBounds(rect);
        this.f40420g.setBounds(rect);
    }

    protected void qrj(boolean z2, boolean z3) {
        if (!z3 || Thread.currentThread() != Looper.getMainLooper().getThread()) {
            if (z2) {
                this.f40420g.setAlpha((int) (this.f87817x2.getSpring().getFinalPosition() * 255.0f));
                return;
            } else {
                this.f40420g.setAlpha((int) (this.f87814qrj.getSpring().getFinalPosition() * 255.0f));
                return;
            }
        }
        if (this.f40428y.isRunning()) {
            this.f40428y.cancel();
        }
        if (this.f87812n7h.isRunning()) {
            this.f87812n7h.cancel();
        }
        if (this.f40427s.isRunning()) {
            this.f40427s.cancel();
        }
        if (!this.f40425p.isRunning()) {
            this.f40425p.start();
        }
        if (z2) {
            if (this.f87814qrj.isRunning()) {
                this.f87814qrj.cancel();
            }
            if (!this.f87817x2.isRunning()) {
                this.f87817x2.start();
            }
            new Handler().postDelayed(new f7l8(), 50L);
            if (this.f87808fu4) {
                this.f87811ld6.setStartVelocity(10.0f);
            } else {
                this.f87811ld6.setStartVelocity(5.0f);
            }
        } else {
            if (this.f87817x2.isRunning()) {
                this.f87817x2.cancel();
            }
            if (!this.f87814qrj.isRunning()) {
                this.f87814qrj.start();
            }
            if (!this.f87805cdj.isRunning()) {
                this.f87805cdj.start();
            }
        }
        this.f87811ld6.start();
    }

    /* JADX INFO: renamed from: s */
    public void m26013s(int i2, int i3, int i4, int i5) {
        this.f40426q.setBounds(i2, i3, i4, i5);
        this.f40424n.setBounds(i2, i3, i4, i5);
        this.f40420g.setBounds(i2, i3, i4, i5);
    }

    protected void x2(boolean z2, boolean z3) {
        if (z3 && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            if (!this.f40428y.isRunning()) {
                this.f40428y.start();
            }
            if (!this.f87812n7h.isRunning()) {
                this.f87812n7h.start();
            }
            if (!z2 && !this.f40427s.isRunning()) {
                this.f40427s.start();
            }
            if (this.f40425p.isRunning()) {
                this.f40425p.cancel();
            }
            if (this.f87811ld6.isRunning()) {
                this.f87811ld6.cancel();
            }
            if (this.f87810kja0.isRunning()) {
                this.f87810kja0.cancel();
            }
            if (this.f40421h.isRunning()) {
                this.f40421h.cancel();
            }
            if (this.f87805cdj.isRunning()) {
                this.f87805cdj.cancel();
            }
            if (this.f87814qrj.isRunning()) {
                this.f87814qrj.cancel();
            }
            if (this.f87817x2.isRunning()) {
                this.f87817x2.cancel();
            }
        }
    }
}
