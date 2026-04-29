package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import miuix.androidbasewidget.internal.view.C6827q;
import miuix.animation.physics.DynamicAnimation;
import miuix.animation.physics.SpringAnimation;
import miuix.animation.property.FloatProperty;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 24)
public class SeekBarBackGroundShapeDrawable extends C6827q {

    /* JADX INFO: renamed from: p */
    private static final int f38596p = 255;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private GradientDrawable f86706f7l8;

    /* JADX INFO: renamed from: g */
    private SpringAnimation f38597g;

    /* JADX INFO: renamed from: n */
    private SpringAnimation f38598n;

    /* JADX INFO: renamed from: s */
    private FloatProperty<SeekBarBackGroundShapeDrawable> f38599s;

    /* JADX INFO: renamed from: y */
    private float f38600y;

    /* JADX INFO: renamed from: miuix.androidbasewidget.internal.view.SeekBarBackGroundShapeDrawable$k */
    class C6825k extends FloatProperty<SeekBarBackGroundShapeDrawable> {
        C6825k(String str) {
            super(str);
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public float getValue(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable) {
            return seekBarBackGroundShapeDrawable.m24760g();
        }

        @Override // miuix.animation.property.FloatProperty
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void setValue(SeekBarBackGroundShapeDrawable seekBarBackGroundShapeDrawable, float f2) {
            seekBarBackGroundShapeDrawable.m24762p(f2);
        }
    }

    class toq implements DynamicAnimation.OnAnimationUpdateListener {
        toq() {
        }

        @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
        public void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
            SeekBarBackGroundShapeDrawable.this.invalidateSelf();
        }
    }

    protected static class zy extends C6827q.k {
        protected zy() {
        }

        @Override // miuix.androidbasewidget.internal.view.C6827q.k
        /* JADX INFO: renamed from: k */
        protected Drawable mo24764k(Resources resources, Resources.Theme theme, C6827q.k kVar) {
            return new SeekBarBackGroundShapeDrawable(resources, theme, kVar);
        }
    }

    public SeekBarBackGroundShapeDrawable() {
        this.f38600y = 0.0f;
        this.f38599s = new C6825k("BlackAlpha");
        f7l8();
        m24759y();
    }

    private void f7l8() {
        SpringAnimation springAnimation = new SpringAnimation(this, this.f38599s, 0.05f);
        this.f38598n = springAnimation;
        springAnimation.getSpring().setStiffness(986.96f);
        this.f38598n.getSpring().setDampingRatio(0.99f);
        this.f38598n.setMinimumVisibleChange(0.00390625f);
        this.f38598n.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() { // from class: miuix.androidbasewidget.internal.view.zy
            @Override // miuix.animation.physics.DynamicAnimation.OnAnimationUpdateListener
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                this.f38615k.m24758s(dynamicAnimation, f2, f3);
            }
        });
        SpringAnimation springAnimation2 = new SpringAnimation(this, this.f38599s, 0.0f);
        this.f38597g = springAnimation2;
        springAnimation2.getSpring().setStiffness(986.96f);
        this.f38597g.getSpring().setDampingRatio(0.99f);
        this.f38597g.setMinimumVisibleChange(0.00390625f);
        this.f38597g.addUpdateListener(new toq());
    }

    /* JADX INFO: renamed from: n */
    private void m24756n(Canvas canvas) {
        this.f86706f7l8.setBounds(getBounds());
        this.f86706f7l8.setAlpha((int) (this.f38600y * 255.0f));
        this.f86706f7l8.setCornerRadius(getCornerRadius());
        this.f86706f7l8.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m24758s(DynamicAnimation dynamicAnimation, float f2, float f3) {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: y */
    private void m24759y() {
        GradientDrawable gradientDrawable = new GradientDrawable(getOrientation(), getColors());
        this.f86706f7l8 = gradientDrawable;
        gradientDrawable.setCornerRadius(getCornerRadius());
        this.f86706f7l8.setShape(getShape());
        this.f86706f7l8.setColor(-16777216);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m24756n(canvas);
    }

    /* JADX INFO: renamed from: g */
    public float m24760g() {
        return this.f38600y;
    }

    @Override // miuix.androidbasewidget.internal.view.C6827q
    /* JADX INFO: renamed from: k */
    protected C6827q.k mo24761k() {
        return new zy();
    }

    /* JADX INFO: renamed from: p */
    public void m24762p(float f2) {
        this.f38600y = f2;
    }

    @Override // miuix.androidbasewidget.internal.view.C6827q
    protected void toq() {
        this.f38597g.cancel();
        this.f38598n.start();
    }

    @Override // miuix.androidbasewidget.internal.view.C6827q
    protected void zy() {
        this.f38598n.cancel();
        this.f38597g.start();
    }

    public SeekBarBackGroundShapeDrawable(Resources resources, Resources.Theme theme, C6827q.k kVar) {
        super(resources, theme, kVar);
        this.f38600y = 0.0f;
        this.f38599s = new C6825k("BlackAlpha");
        f7l8();
        m24759y();
    }
}
