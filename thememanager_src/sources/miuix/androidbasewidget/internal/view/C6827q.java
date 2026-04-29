package miuix.androidbasewidget.internal.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import zy.hyr;

/* JADX INFO: renamed from: miuix.androidbasewidget.internal.view.q */
/* JADX INFO: compiled from: SeekBarGradientDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 24)
public class C6827q extends GradientDrawable {

    /* JADX INFO: renamed from: q */
    protected static final float f38604q = 986.96f;

    /* JADX INFO: renamed from: k */
    protected k f38605k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f86707toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f86708zy;

    public C6827q() {
        this.f86707toq = -1;
        this.f86708zy = -1;
        k kVarMo24761k = mo24761k();
        this.f38605k = kVarMo24761k;
        kVarMo24761k.toq(super.getConstantState());
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38605k;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f86708zy;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f86707toq;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    protected k mo24761k() {
        return new k();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842919) {
                z2 = true;
            }
        }
        if (z2) {
            toq();
        }
        if (!z2) {
            zy();
        }
        return zOnStateChange;
    }

    protected void toq() {
    }

    protected void zy() {
    }

    /* JADX INFO: renamed from: miuix.androidbasewidget.internal.view.q$k */
    /* JADX INFO: compiled from: SeekBarGradientDrawable.java */
    protected static class k extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        Drawable.ConstantState f38606k;

        protected k() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f38606k.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f38606k.getChangingConfigurations();
        }

        /* JADX INFO: renamed from: k */
        protected Drawable mo24764k(Resources resources, Resources.Theme theme, k kVar) {
            return new C6827q(resources, theme, kVar);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            if (this.f38606k == null) {
                return null;
            }
            return mo24764k(null, null, this);
        }

        public void toq(Drawable.ConstantState constantState) {
            this.f38606k = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            if (this.f38606k == null) {
                return null;
            }
            return mo24764k(resources, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            if (this.f38606k == null) {
                return null;
            }
            return mo24764k(resources, theme, this);
        }
    }

    public C6827q(Resources resources, Resources.Theme theme, k kVar) {
        Drawable drawableNewDrawable;
        this.f86707toq = -1;
        this.f86708zy = -1;
        if (resources == null) {
            drawableNewDrawable = kVar.f38606k.newDrawable();
        } else if (theme == null) {
            drawableNewDrawable = kVar.f38606k.newDrawable(resources);
        } else {
            drawableNewDrawable = kVar.f38606k.newDrawable(resources, theme);
        }
        kVar.f38606k = drawableNewDrawable.getConstantState();
        k kVarMo24761k = mo24761k();
        this.f38605k = kVarMo24761k;
        kVarMo24761k.toq(kVar.f38606k);
        this.f86707toq = drawableNewDrawable.getIntrinsicWidth();
        this.f86708zy = drawableNewDrawable.getIntrinsicHeight();
        if (drawableNewDrawable instanceof GradientDrawable) {
            GradientDrawable gradientDrawable = (GradientDrawable) drawableNewDrawable;
            setCornerRadius(gradientDrawable.getCornerRadius());
            setShape(gradientDrawable.getShape());
            setColor(gradientDrawable.getColor());
        }
    }
}
