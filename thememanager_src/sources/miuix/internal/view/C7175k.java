package miuix.internal.view;

import android.content.res.Resources;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: miuix.internal.view.k */
/* JADX INFO: compiled from: CheckWidgetAnimatedStateListDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 21)
public class C7175k extends AnimatedStateListDrawable {

    /* JADX INFO: renamed from: q */
    private static final String f40410q = C7175k.class.getName();

    /* JADX INFO: renamed from: k */
    protected k f40411k;

    public C7175k() {
        this.f40411k = mo26001k();
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f40411k;
    }

    /* JADX INFO: renamed from: k */
    protected k mo26001k() {
        return new k();
    }

    @Override // android.graphics.drawable.AnimatedStateListDrawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer
    protected void setConstantState(@lvui DrawableContainer.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (this.f40411k == null) {
            this.f40411k = mo26001k();
        }
        this.f40411k.f40413k = drawableContainerState;
    }

    /* JADX INFO: renamed from: miuix.internal.view.k$k */
    /* JADX INFO: compiled from: CheckWidgetAnimatedStateListDrawable.java */
    public static class k extends Drawable.ConstantState {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f87801f7l8;

        /* JADX INFO: renamed from: g */
        int f40412g;

        /* JADX INFO: renamed from: k */
        Drawable.ConstantState f40413k;

        /* JADX INFO: renamed from: n */
        int f40414n;

        /* JADX INFO: renamed from: p */
        boolean f40415p;

        /* JADX INFO: renamed from: q */
        int f40416q;

        /* JADX INFO: renamed from: s */
        int f40417s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87802toq;

        /* JADX INFO: renamed from: y */
        int f40418y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f87803zy;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            Drawable.ConstantState constantState = this.f40413k;
            if (constantState == null) {
                return false;
            }
            return constantState.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.f40413k;
            if (constantState == null) {
                return -1;
            }
            return constantState.getChangingConfigurations();
        }

        /* JADX INFO: renamed from: k */
        protected Drawable mo26006k(Resources resources, Resources.Theme theme, k kVar) {
            return new C7175k(resources, theme, kVar);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            if (this.f40413k == null) {
                return null;
            }
            return mo26006k(null, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            if (this.f40413k == null) {
                return null;
            }
            return mo26006k(resources, null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            if (this.f40413k == null) {
                return null;
            }
            return mo26006k(resources, theme, this);
        }
    }

    protected C7175k(Resources resources, Resources.Theme theme, k kVar) {
        Drawable drawableNewDrawable;
        if (kVar != null) {
            if (resources == null) {
                drawableNewDrawable = kVar.f40413k.newDrawable();
            } else if (theme == null) {
                drawableNewDrawable = kVar.f40413k.newDrawable(resources);
            } else {
                drawableNewDrawable = kVar.f40413k.newDrawable(resources, theme);
            }
            if (drawableNewDrawable != null) {
                kVar.f40413k = drawableNewDrawable.getConstantState();
            }
            setConstantState((DrawableContainer.DrawableContainerState) kVar.f40413k);
            onStateChange(getState());
            jumpToCurrentState();
            k kVar2 = this.f40411k;
            kVar2.f87802toq = kVar.f87802toq;
            kVar2.f87803zy = kVar.f87803zy;
            kVar2.f40416q = kVar.f40416q;
            kVar2.f40415p = kVar.f40415p;
            return;
        }
        Log.e(f40410q, "checkWidgetConstantState is null ,but it can't be null", null);
    }
}
