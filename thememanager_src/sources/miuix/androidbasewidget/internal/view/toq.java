package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kbj.toq;
import miuix.androidbasewidget.internal.view.C6827q;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;

/* JADX INFO: compiled from: SeekBaThumbShapeDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends C6827q {

    /* JADX INFO: renamed from: h */
    private static Drawable f38607h = null;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f86709kja0 = 255;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f86710n7h = "SeekBaThumbShape";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private SpringAnimation f86711f7l8;

    /* JADX INFO: renamed from: g */
    private SpringAnimation f38608g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private FloatProperty<toq> f86712ld6;

    /* JADX INFO: renamed from: n */
    private SpringAnimation f38609n;

    /* JADX INFO: renamed from: p */
    private float f38610p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private FloatProperty<toq> f86713qrj;

    /* JADX INFO: renamed from: s */
    private float f38611s;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private DynamicAnimation.OnAnimationUpdateListener f86714x2;

    /* JADX INFO: renamed from: y */
    private SpringAnimation f38612y;

    /* JADX INFO: renamed from: miuix.androidbasewidget.internal.view.toq$k */
    /* JADX INFO: compiled from: SeekBaThumbShapeDrawable.java */
    class C6828k extends FloatProperty<toq> {
        C6828k(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(toq toqVar) {
            return toqVar.f7l8();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(toq toqVar, float f2) {
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            toqVar.ld6(f2);
        }
    }

    /* JADX INFO: renamed from: miuix.androidbasewidget.internal.view.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SeekBaThumbShapeDrawable.java */
    class C8097toq extends FloatProperty<toq> {
        C8097toq(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(toq toqVar) {
            return toqVar.m24769g();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(toq toqVar, float f2) {
            toqVar.m24770p(f2);
        }
    }

    /* JADX INFO: compiled from: SeekBaThumbShapeDrawable.java */
    protected static class zy extends C6827q.k {
        protected zy() {
        }

        @Override // miuix.androidbasewidget.internal.view.C6827q.k
        /* JADX INFO: renamed from: k */
        protected Drawable mo24764k(Resources resources, Resources.Theme theme, C6827q.k kVar) {
            return new toq(resources, theme, kVar);
        }
    }

    public toq() {
        this.f38611s = 1.0f;
        this.f38610p = 0.0f;
        this.f86712ld6 = new C6828k("ShadowAlpha");
        this.f86714x2 = new DynamicAnimation.OnAnimationUpdateListener() { // from class: miuix.androidbasewidget.internal.view.k
            @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                this.f38603k.m24767s(dynamicAnimation, f2, f3);
            }
        };
        this.f86713qrj = new C8097toq("Scale");
        m24768y();
    }

    /* JADX INFO: renamed from: n */
    private void m24765n(Canvas canvas) {
        Rect bounds = getBounds();
        Drawable drawable = f38607h;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = f38607h.getIntrinsicHeight();
            int intrinsicWidth2 = intrinsicWidth - getIntrinsicWidth();
            int i2 = intrinsicWidth2 / 2;
            int intrinsicHeight2 = (intrinsicHeight - getIntrinsicHeight()) / 2;
            f38607h.setBounds(bounds.left - i2, bounds.top - intrinsicHeight2, bounds.right + i2, bounds.bottom + intrinsicHeight2);
            f38607h.setAlpha((int) (this.f38610p * 255.0f));
            f38607h.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m24767s(DynamicAnimation dynamicAnimation, float f2, float f3) {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: y */
    private void m24768y() {
        SpringAnimation springAnimation = new SpringAnimation(this, this.f86713qrj, 3.19f);
        this.f38609n = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.f38609n.getSpring().setDampingRatio(0.7f);
        this.f38609n.setMinimumVisibleChange(0.002f);
        this.f38609n.addUpdateListener(this.f86714x2);
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.f86713qrj, 1.0f);
        this.f38608g = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f38608g.getSpring().setDampingRatio(0.8f);
        this.f38608g.setMinimumVisibleChange(0.002f);
        this.f38608g.addUpdateListener(this.f86714x2);
        SpringAnimation springAnimation3 = new SpringAnimation(this, this.f86712ld6, 1.0f);
        this.f86711f7l8 = springAnimation3;
        springAnimation3.getSpring().setStiffness(986.96f);
        this.f86711f7l8.getSpring().setDampingRatio(0.99f);
        this.f86711f7l8.setMinimumVisibleChange(0.00390625f);
        this.f86711f7l8.addUpdateListener(this.f86714x2);
        SpringAnimation springAnimation4 = new SpringAnimation(this, this.f86712ld6, 0.0f);
        this.f38612y = springAnimation4;
        springAnimation4.getSpring().setStiffness(986.96f);
        this.f38612y.getSpring().setDampingRatio(0.99f);
        this.f38612y.setMinimumVisibleChange(0.00390625f);
        this.f38612y.addUpdateListener(this.f86714x2);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i2 = (bounds.right + bounds.left) / 2;
        int i3 = (bounds.top + bounds.bottom) / 2;
        m24765n(canvas);
        canvas.save();
        float f2 = this.f38611s;
        canvas.scale(f2, f2, i2, i3);
        super.draw(canvas);
        canvas.restore();
    }

    public float f7l8() {
        return this.f38610p;
    }

    /* JADX INFO: renamed from: g */
    public float m24769g() {
        return this.f38611s;
    }

    @Override // miuix.androidbasewidget.internal.view.C6827q
    /* JADX INFO: renamed from: k */
    protected C6827q.k mo24761k() {
        return new zy();
    }

    public void ld6(float f2) {
        this.f38610p = f2;
    }

    /* JADX INFO: renamed from: p */
    public void m24770p(float f2) {
        this.f38611s = f2;
    }

    @Override // miuix.androidbasewidget.internal.view.C6827q
    protected void toq() {
        if (this.f38608g.isRunning()) {
            this.f38608g.cancel();
        }
        if (!this.f38609n.isRunning()) {
            this.f38609n.start();
        }
        if (this.f38612y.isRunning()) {
            this.f38612y.cancel();
        }
        if (this.f86711f7l8.isRunning()) {
            return;
        }
        this.f86711f7l8.start();
    }

    @Override // miuix.androidbasewidget.internal.view.C6827q
    protected void zy() {
        if (this.f38609n.isRunning()) {
            this.f38609n.cancel();
        }
        if (!this.f38608g.isRunning()) {
            this.f38608g.start();
        }
        if (this.f86711f7l8.isRunning()) {
            this.f86711f7l8.cancel();
        }
        if (this.f38612y.isRunning()) {
            return;
        }
        this.f38612y.start();
    }

    public toq(Resources resources, Resources.Theme theme, C6827q.k kVar) {
        super(resources, theme, kVar);
        this.f38611s = 1.0f;
        this.f38610p = 0.0f;
        this.f86712ld6 = new C6828k("ShadowAlpha");
        this.f86714x2 = new DynamicAnimation.OnAnimationUpdateListener() { // from class: miuix.androidbasewidget.internal.view.k
            @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                this.f38603k.m24767s(dynamicAnimation, f2, f3);
            }
        };
        this.f86713qrj = new C8097toq("Scale");
        m24768y();
        if (resources == null || f38607h != null) {
            return;
        }
        f38607h = resources.getDrawable(toq.f7l8.f80442d1ts);
    }
}
