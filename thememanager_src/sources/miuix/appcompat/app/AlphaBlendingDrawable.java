package miuix.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
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
import gb.toq;
import java.io.IOException;
import miuix.animation.Folme;
import miuix.animation.IStateStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.utils.EaseManager;
import miuix.internal.util.C7172y;
import miuix.smooth.C7334n;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class AlphaBlendingDrawable extends Drawable {

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private static final AnimConfig f86806d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final AnimConfig f86807d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final AnimConfig f86808eqxt;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final boolean f86809fti;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f86810fu4 = "StateTransitionDrawable";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final AnimConfig f86811gvn7;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final AnimConfig f86813jp0y;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final AnimConfig f86816oc;

    /* JADX INFO: renamed from: z */
    private static final String f38763z = "alphaF";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private float f86818cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f86819f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private AnimState f86820fn3e;

    /* JADX INFO: renamed from: g */
    private int f38764g;

    /* JADX INFO: renamed from: h */
    private float f38765h;

    /* JADX INFO: renamed from: i */
    private AnimState f38766i;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private AnimState f86821ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private float f86822kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private boolean f86823ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f86824n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private IStateStyle f86825ni7;

    /* JADX INFO: renamed from: p */
    private boolean f38769p;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private float f86826qrj;

    /* JADX INFO: renamed from: s */
    private int f38771s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private AnimState f86827t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f86828toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f86829x2;

    /* JADX INFO: renamed from: y */
    private int f38772y;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private AnimState f86830zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f86831zy;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int[] f86815o1t = {R.attr.state_pressed};

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int[] f86817wvg = {R.attr.state_drag_hovered};

    /* JADX INFO: renamed from: t */
    private static final int[] f38762t = {R.attr.state_selected};

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int[] f86814mcp = {R.attr.state_hovered, R.attr.state_activated};

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int[] f86812jk = {R.attr.state_hovered};

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int[] f86805a9 = {R.attr.state_activated};

    /* JADX INFO: renamed from: q */
    private final RectF f38770q = new RectF();

    /* JADX INFO: renamed from: n */
    private final Paint f38768n = new Paint();

    /* JADX INFO: renamed from: k */
    private C6912k f38767k = new C6912k();

    /* JADX INFO: renamed from: miuix.appcompat.app.AlphaBlendingDrawable$k */
    static final class C6912k extends Drawable.ConstantState {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        float f86832f7l8;

        /* JADX INFO: renamed from: g */
        float f38773g;

        /* JADX INFO: renamed from: k */
        int f38774k;

        /* JADX INFO: renamed from: n */
        float f38775n;

        /* JADX INFO: renamed from: q */
        float f38776q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f86833toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float f86834zy;

        C6912k() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @zy.lvui
        public Drawable newDrawable() {
            return new AlphaBlendingDrawable(new C6912k(this), null);
        }

        C6912k(@zy.lvui C6912k c6912k) {
            this.f38774k = c6912k.f38774k;
            this.f86833toq = c6912k.f86833toq;
            this.f86834zy = c6912k.f86834zy;
            this.f38776q = c6912k.f38776q;
            this.f38775n = c6912k.f38775n;
            this.f38773g = c6912k.f38773g;
            this.f86832f7l8 = c6912k.f86832f7l8;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @zy.lvui
        public Drawable newDrawable(@zy.dd Resources resources) {
            return new AlphaBlendingDrawable(new C6912k(this), resources);
        }
    }

    static {
        boolean zM25998k = true ^ C7172y.m25998k();
        f86809fti = zM25998k;
        if (!zM25998k) {
            f86813jp0y = null;
            f86811gvn7 = null;
            f86807d3 = null;
            f86816oc = null;
            f86808eqxt = null;
            f86806d2ok = null;
            return;
        }
        f86813jp0y = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.6f));
        f86811gvn7 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.9f, 0.2f));
        AnimConfig ease = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.25f));
        f86807d3 = ease;
        AnimConfig ease2 = new AnimConfig().setEase(EaseManager.getStyle(-2, 0.99f, 0.35f));
        f86816oc = ease2;
        f86808eqxt = ease;
        f86806d2ok = ease2;
    }

    public AlphaBlendingDrawable() {
        m24855q(true);
    }

    private boolean f7l8() {
        if (this.f38769p) {
            this.f38769p = false;
            this.f86823ld6 = true;
            this.f86829x2 = false;
            if (f86809fti) {
                this.f86825ni7.to(this.f86827t8r, f86816oc);
            } else {
                setAlphaF(this.f86822kja0);
            }
            return true;
        }
        if (this.f86823ld6) {
            if (!this.f86829x2) {
                return false;
            }
            if (f86809fti) {
                this.f86825ni7.to(this.f86827t8r, f86811gvn7);
            } else {
                setAlphaF(this.f86822kja0);
            }
            return true;
        }
        this.f86823ld6 = true;
        this.f86829x2 = false;
        if (f86809fti) {
            this.f86825ni7.to(this.f86827t8r, f86813jp0y);
        } else {
            setAlphaF(this.f86822kja0);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    private boolean m24851g() {
        if (this.f38769p) {
            this.f38769p = false;
            this.f86823ld6 = true;
            this.f86829x2 = true;
            if (f86809fti) {
                this.f86825ni7.to(this.f86830zurt, f86816oc);
            } else {
                setAlphaF(this.f86818cdj);
            }
            return true;
        }
        boolean z2 = this.f86823ld6;
        if (z2 && this.f86829x2) {
            return false;
        }
        if (z2) {
            this.f86829x2 = true;
            if (f86809fti) {
                this.f86825ni7.to(this.f86830zurt, f86808eqxt);
            } else {
                setAlphaF(this.f86818cdj);
            }
            return true;
        }
        if (this.f86829x2) {
            this.f86823ld6 = true;
            if (f86809fti) {
                this.f86825ni7.to(this.f86830zurt, f86813jp0y);
            } else {
                setAlphaF(this.f86818cdj);
            }
            return true;
        }
        this.f86829x2 = true;
        this.f86823ld6 = true;
        if (f86809fti) {
            this.f86825ni7.to(this.f86830zurt, f86813jp0y);
        } else {
            setAlphaF(this.f86818cdj);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    private void m24852k() {
        this.f38768n.setColor(this.f86831zy);
        if (f86809fti) {
            this.f86821ki = new AnimState().add(f38763z, this.f86826qrj);
            this.f38766i = new AnimState().add(f38763z, this.f86824n7h);
            this.f86827t8r = new AnimState().add(f38763z, this.f86822kja0);
            this.f86820fn3e = new AnimState().add(f38763z, this.f38765h);
            this.f86830zurt = new AnimState().add(f38763z, this.f86818cdj);
            IStateStyle iStateStyleUseValue = Folme.useValue(this);
            this.f86825ni7 = iStateStyleUseValue;
            iStateStyleUseValue.setTo(this.f86821ki);
        } else {
            setAlphaF(this.f86826qrj);
        }
        m24855q(true);
    }

    /* JADX INFO: renamed from: n */
    private boolean m24853n() {
        if (this.f38769p) {
            this.f38769p = false;
            this.f86823ld6 = false;
            this.f86829x2 = true;
            if (f86809fti) {
                this.f86825ni7.to(this.f86820fn3e, f86816oc);
            } else {
                setAlphaF(this.f38765h);
            }
            return true;
        }
        if (this.f86823ld6) {
            this.f86823ld6 = false;
            this.f86829x2 = true;
            if (f86809fti) {
                this.f86825ni7.to(this.f86820fn3e, f86811gvn7);
            } else {
                setAlphaF(this.f38765h);
            }
            return true;
        }
        if (this.f86829x2) {
            return false;
        }
        this.f86829x2 = true;
        if (f86809fti) {
            this.f86825ni7.to(this.f86820fn3e, f86808eqxt);
        } else {
            setAlphaF(this.f38765h);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    private void m24854p() {
        C6912k c6912k = this.f38767k;
        c6912k.f38774k = this.f86831zy;
        c6912k.f86833toq = this.f86828toq;
        c6912k.f86834zy = this.f86826qrj;
        c6912k.f38776q = this.f86824n7h;
        c6912k.f38775n = this.f86822kja0;
        c6912k.f38773g = this.f38765h;
        c6912k.f86832f7l8 = this.f86818cdj;
    }

    @SuppressLint({"LongLogTag"})
    /* JADX INFO: renamed from: q */
    private void m24855q(boolean z2) {
        C7334n.zy(this, z2);
    }

    /* JADX INFO: renamed from: s */
    private boolean m24856s() {
        if (this.f38769p) {
            return false;
        }
        if (f86809fti) {
            this.f86825ni7.to(this.f38766i, f86807d3);
        } else {
            setAlphaF(this.f86824n7h);
        }
        this.f38769p = true;
        this.f86823ld6 = false;
        this.f86829x2 = false;
        return true;
    }

    /* JADX INFO: renamed from: y */
    private boolean m24857y() {
        if (this.f38769p) {
            this.f38769p = false;
            this.f86823ld6 = false;
            this.f86829x2 = false;
            if (f86809fti) {
                this.f86825ni7.to(this.f86821ki, f86816oc);
            } else {
                setAlphaF(this.f86826qrj);
            }
            return true;
        }
        if (this.f86823ld6) {
            this.f86823ld6 = false;
            this.f86829x2 = false;
            if (f86809fti) {
                this.f86825ni7.to(this.f86821ki, f86811gvn7);
            } else {
                setAlphaF(this.f86826qrj);
            }
            return true;
        }
        if (!this.f86829x2) {
            return false;
        }
        this.f86829x2 = false;
        if (f86809fti) {
            this.f86825ni7.to(this.f86821ki, f86806d2ok);
        } else {
            setAlphaF(this.f86826qrj);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@zy.lvui Canvas canvas) {
        if (isVisible()) {
            RectF rectF = this.f38770q;
            int i2 = this.f86828toq;
            canvas.drawRoundRect(rectF, i2, i2, this.f38768n);
        }
    }

    public float getAlphaF() {
        return this.f38768n.getAlpha() / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    @zy.dd
    public Drawable.ConstantState getConstantState() {
        return this.f38767k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayObtainStyledAttributes = theme != null ? theme.obtainStyledAttributes(attributeSet, toq.ki.il, 0, 0) : resources.obtainAttributes(attributeSet, toq.ki.il);
        this.f86831zy = typedArrayObtainStyledAttributes.getColor(toq.ki.lqk8, -16777216);
        this.f86828toq = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.ki.nnx, 0);
        this.f86826qrj = typedArrayObtainStyledAttributes.getFloat(toq.ki.fmq, 0.0f);
        this.f86824n7h = typedArrayObtainStyledAttributes.getFloat(toq.ki.ar, 0.0f);
        this.f86822kja0 = typedArrayObtainStyledAttributes.getFloat(toq.ki.uqa, 0.0f);
        this.f38765h = typedArrayObtainStyledAttributes.getFloat(toq.ki.dsx, 0.0f);
        this.f86818cdj = typedArrayObtainStyledAttributes.getFloat(toq.ki.lro, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        m24852k();
        m24854p();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        if (f86809fti) {
            IStateStyle iStateStyle = this.f86825ni7;
            iStateStyle.setTo(iStateStyle.getCurrentState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@zy.lvui Rect rect) {
        this.f38770q.set(rect);
        RectF rectF = this.f38770q;
        rectF.left += this.f38764g;
        rectF.top += this.f86819f7l8;
        rectF.right -= this.f38772y;
        rectF.bottom -= this.f38771s;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(@zy.lvui int[] iArr) {
        return (StateSet.stateSetMatches(f86815o1t, iArr) || StateSet.stateSetMatches(f86817wvg, iArr) || StateSet.stateSetMatches(f38762t, iArr)) ? m24856s() : StateSet.stateSetMatches(f86814mcp, iArr) ? m24851g() : StateSet.stateSetMatches(f86812jk, iArr) ? f7l8() : StateSet.stateSetMatches(f86805a9, iArr) ? m24853n() : m24857y();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    public void setAlphaF(float f2) {
        this.f38768n.setAlpha((int) (f2 * 255.0f));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@zy.dd ColorFilter colorFilter) {
    }

    public void toq(int i2, int i3, int i4, int i5) {
        this.f38764g = i2;
        this.f86819f7l8 = i3;
        this.f38772y = i4;
        this.f38771s = i5;
    }

    public void zy(int i2) {
        if (this.f86828toq == i2) {
            return;
        }
        this.f86828toq = i2;
        this.f38767k.f86833toq = i2;
        invalidateSelf();
    }

    AlphaBlendingDrawable(C6912k c6912k, Resources resources) {
        this.f86831zy = c6912k.f38774k;
        this.f86828toq = c6912k.f86833toq;
        this.f86826qrj = c6912k.f86834zy;
        this.f86824n7h = c6912k.f38776q;
        this.f86822kja0 = c6912k.f38775n;
        this.f38765h = c6912k.f38773g;
        this.f86818cdj = c6912k.f86832f7l8;
        m24854p();
        m24852k();
    }
}
