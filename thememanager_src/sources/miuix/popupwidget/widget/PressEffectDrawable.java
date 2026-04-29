package miuix.popupwidget.widget;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import c25.toq;
import java.io.IOException;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import miuix.device.C7106k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class PressEffectDrawable extends Drawable {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final boolean f88013a9;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final AnimConfig f88014d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final AnimConfig f88015eqxt;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final AnimConfig f88016fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f88017fu4 = "alphaF";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final AnimConfig f88018gvn7;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final AnimConfig f88020jp0y;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final String f88022ni7 = "StateTransitionDrawable";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final AnimConfig f88024oc;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private AnimState f88026cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f88027f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private AnimState f88028fn3e;

    /* JADX INFO: renamed from: g */
    private int f41051g;

    /* JADX INFO: renamed from: h */
    private float f41052h;

    /* JADX INFO: renamed from: i */
    private AnimState f41053i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private AnimState f88029ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private float f88030kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f88031ld6;

    /* JADX INFO: renamed from: n */
    private int f41055n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f88032n7h;

    /* JADX INFO: renamed from: p */
    private boolean f41056p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f88033qrj;

    /* JADX INFO: renamed from: s */
    private boolean f41058s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private AnimState f88034t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f88035toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private float f88036x2;

    /* JADX INFO: renamed from: y */
    private int f41059y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private IStateStyle f88037zurt;

    /* JADX INFO: renamed from: z */
    private static final int[] f41050z = {R.attr.state_pressed};

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int[] f88023o1t = {R.attr.state_drag_hovered};

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int[] f88025wvg = {R.attr.state_selected};

    /* JADX INFO: renamed from: t */
    private static final int[] f41049t = {R.attr.state_hovered, R.attr.state_activated};

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int[] f88021mcp = {R.attr.state_hovered};

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int[] f88019jk = {R.attr.state_activated};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final RectF f88038zy = new RectF();

    /* JADX INFO: renamed from: q */
    private final Paint f41057q = new Paint();

    /* JADX INFO: renamed from: k */
    private C7261k f41054k = new C7261k();

    /* JADX INFO: renamed from: miuix.popupwidget.widget.PressEffectDrawable$k */
    static final class C7261k extends Drawable.ConstantState {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        float f88039f7l8;

        /* JADX INFO: renamed from: g */
        float f41060g;

        /* JADX INFO: renamed from: k */
        int f41061k;

        /* JADX INFO: renamed from: n */
        float f41062n;

        /* JADX INFO: renamed from: q */
        float f41063q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f88040toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f88041zy;

        C7261k() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new PressEffectDrawable(new C7261k(this), null);
        }

        C7261k(@lvui C7261k c7261k) {
            this.f41061k = c7261k.f41061k;
            this.f88040toq = c7261k.f88040toq;
            this.f88041zy = c7261k.f88041zy;
            this.f41063q = c7261k.f41063q;
            this.f41062n = c7261k.f41062n;
            this.f41060g = c7261k.f41060g;
            this.f88039f7l8 = c7261k.f88039f7l8;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(@dd Resources resources) {
            return new PressEffectDrawable(new C7261k(this), resources);
        }
    }

    static {
        boolean z2 = (C7106k.d2ok() || C7106k.d3() || C7106k.lvui()) ? false : true;
        f88013a9 = z2;
        if (!z2) {
            f88016fti = null;
            f88020jp0y = null;
            f88018gvn7 = null;
            f88014d3 = null;
            f88024oc = null;
            f88015eqxt = null;
            return;
        }
        f88016fti = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
        f88020jp0y = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
        f88018gvn7 = ease;
        AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
        f88014d3 = ease2;
        f88024oc = ease;
        f88015eqxt = ease2;
    }

    public PressEffectDrawable() {
    }

    private boolean f7l8() {
        if (this.f41058s) {
            return false;
        }
        if (f88013a9) {
            this.f88037zurt.to(this.f88034t8r, f88018gvn7);
        } else {
            setAlphaF(this.f88033qrj);
        }
        this.f41058s = true;
        this.f41056p = false;
        this.f88031ld6 = false;
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m26407g() {
        if (this.f41058s) {
            this.f41058s = false;
            this.f41056p = false;
            this.f88031ld6 = false;
            if (f88013a9) {
                this.f88037zurt.to(this.f88026cdj, f88014d3);
            } else {
                setAlphaF(this.f88036x2);
            }
            return true;
        }
        if (this.f41056p) {
            this.f41056p = false;
            this.f88031ld6 = false;
            if (f88013a9) {
                this.f88037zurt.to(this.f88026cdj, f88020jp0y);
            } else {
                setAlphaF(this.f88036x2);
            }
            return true;
        }
        if (!this.f88031ld6) {
            return false;
        }
        this.f88031ld6 = false;
        if (f88013a9) {
            this.f88037zurt.to(this.f88026cdj, f88015eqxt);
        } else {
            setAlphaF(this.f88036x2);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    private void m26408k() {
        this.f41057q.setColor(this.f88035toq);
        if (!f88013a9) {
            setAlphaF(this.f88036x2);
            return;
        }
        this.f88026cdj = new AnimState().add(f88017fu4, this.f88036x2);
        this.f88034t8r = new AnimState().add(f88017fu4, this.f88033qrj);
        this.f88029ki = new AnimState().add(f88017fu4, this.f88032n7h);
        this.f41053i = new AnimState().add(f88017fu4, this.f88030kja0);
        this.f88028fn3e = new AnimState().add(f88017fu4, this.f41052h);
        IStateStyle iStateStyleUseValue = Folme.useValue(this);
        this.f88037zurt = iStateStyleUseValue;
        iStateStyleUseValue.setTo(this.f88026cdj);
    }

    /* JADX INFO: renamed from: n */
    private boolean m26409n() {
        if (this.f41058s) {
            this.f41058s = false;
            this.f41056p = true;
            this.f88031ld6 = false;
            if (f88013a9) {
                this.f88037zurt.to(this.f88029ki, f88014d3);
            } else {
                setAlphaF(this.f88032n7h);
            }
            return true;
        }
        if (this.f41056p) {
            if (!this.f88031ld6) {
                return false;
            }
            if (f88013a9) {
                this.f88037zurt.to(this.f88029ki, f88020jp0y);
            } else {
                setAlphaF(this.f88032n7h);
            }
            return true;
        }
        this.f41056p = true;
        this.f88031ld6 = false;
        if (f88013a9) {
            this.f88037zurt.to(this.f88029ki, f88016fti);
        } else {
            setAlphaF(this.f88032n7h);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    private boolean m26410q() {
        if (this.f41058s) {
            this.f41058s = false;
            this.f41056p = true;
            this.f88031ld6 = true;
            if (f88013a9) {
                this.f88037zurt.to(this.f88028fn3e, f88014d3);
            } else {
                setAlphaF(this.f41052h);
            }
            return true;
        }
        boolean z2 = this.f41056p;
        if (z2 && this.f88031ld6) {
            return false;
        }
        if (z2) {
            this.f88031ld6 = true;
            if (f88013a9) {
                this.f88037zurt.to(this.f88028fn3e, f88024oc);
            } else {
                setAlphaF(this.f41052h);
            }
            return true;
        }
        if (this.f88031ld6) {
            this.f41056p = true;
            if (f88013a9) {
                this.f88037zurt.to(this.f88028fn3e, f88016fti);
            } else {
                setAlphaF(this.f41052h);
            }
            return true;
        }
        this.f88031ld6 = true;
        this.f41056p = true;
        if (f88013a9) {
            this.f88037zurt.to(this.f88028fn3e, f88016fti);
        } else {
            setAlphaF(this.f41052h);
        }
        return true;
    }

    /* JADX INFO: renamed from: y */
    private void m26411y() {
        C7261k c7261k = this.f41054k;
        c7261k.f41061k = this.f88035toq;
        c7261k.f88041zy = this.f88036x2;
        c7261k.f41063q = this.f88033qrj;
        c7261k.f41062n = this.f88032n7h;
        c7261k.f41060g = this.f88030kja0;
        c7261k.f88039f7l8 = this.f41052h;
    }

    private boolean zy() {
        if (this.f41058s) {
            this.f41058s = false;
            this.f41056p = false;
            this.f88031ld6 = true;
            if (f88013a9) {
                this.f88037zurt.to(this.f41053i, f88014d3);
            } else {
                setAlphaF(this.f88030kja0);
            }
            return true;
        }
        if (this.f41056p) {
            this.f41056p = false;
            this.f88031ld6 = true;
            if (f88013a9) {
                this.f88037zurt.to(this.f41053i, f88020jp0y);
            } else {
                setAlphaF(this.f88030kja0);
            }
            return true;
        }
        if (this.f88031ld6) {
            return false;
        }
        this.f88031ld6 = true;
        if (f88013a9) {
            this.f88037zurt.to(this.f41053i, f88024oc);
        } else {
            setAlphaF(this.f88030kja0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        if (isVisible()) {
            canvas.drawRect(this.f88038zy, this.f41057q);
        }
    }

    public float getAlphaF() {
        return this.f41057q.getAlpha() / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    @dd
    public Drawable.ConstantState getConstantState() {
        return this.f41054k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, toq.kja0.xrg, 0, 0) : resources.obtainAttributes(attributeSet, toq.kja0.xrg);
        this.f88035toq = typedArrayObtainStyledAttributes.getColor(toq.kja0.m24, -16777216);
        this.f88036x2 = typedArrayObtainStyledAttributes.getFloat(toq.kja0.f4f, 0.0f);
        this.f88033qrj = typedArrayObtainStyledAttributes.getFloat(toq.kja0.a46k, 0.0f);
        this.f88032n7h = typedArrayObtainStyledAttributes.getFloat(toq.kja0.zlf, 0.0f);
        this.f88030kja0 = typedArrayObtainStyledAttributes.getFloat(toq.kja0.sa, 0.0f);
        this.f41052h = typedArrayObtainStyledAttributes.getFloat(toq.kja0.xzk6, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        m26408k();
        m26411y();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (f88013a9) {
            IStateStyle iStateStyle = this.f88037zurt;
            iStateStyle.setTo(iStateStyle.getCurrentState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@lvui Rect rect) {
        this.f88038zy.set(rect);
        RectF rectF = this.f88038zy;
        rectF.left += this.f41055n;
        rectF.top += this.f41051g;
        rectF.right -= this.f88027f7l8;
        rectF.bottom -= this.f41059y;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@lvui int[] iArr) {
        return (StateSet.stateSetMatches(f41050z, iArr) || StateSet.stateSetMatches(f88023o1t, iArr) || StateSet.stateSetMatches(f88025wvg, iArr)) ? f7l8() : StateSet.stateSetMatches(f41049t, iArr) ? m26410q() : StateSet.stateSetMatches(f88021mcp, iArr) ? m26409n() : StateSet.stateSetMatches(f88019jk, iArr) ? zy() : m26407g();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setAlphaF(float f2) {
        this.f41057q.setAlpha((int) (f2 * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
    }

    public void toq(int i2, int i3, int i4, int i5) {
        this.f41055n = i2;
        this.f41051g = i3;
        this.f88027f7l8 = i4;
        this.f41059y = i5;
    }

    PressEffectDrawable(C7261k c7261k, Resources resources) {
        this.f88035toq = c7261k.f41061k;
        this.f88036x2 = c7261k.f88041zy;
        this.f88033qrj = c7261k.f41063q;
        this.f88032n7h = c7261k.f41062n;
        this.f88030kja0 = c7261k.f41060g;
        this.f41052h = c7261k.f88039f7l8;
        m26411y();
        m26408k();
    }
}
