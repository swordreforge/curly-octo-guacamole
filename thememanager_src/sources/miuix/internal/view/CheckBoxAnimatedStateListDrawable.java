package miuix.internal.view;

import android.R;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import gb.toq;
import miuix.internal.view.C7175k;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
@hyr(api = 21)
public class CheckBoxAnimatedStateListDrawable extends C7175k {

    /* JADX INFO: renamed from: i */
    private static final String f40400i = "MiuixCheckbox";

    /* JADX INFO: renamed from: t */
    protected static final int f40401t = 76;

    /* JADX INFO: renamed from: z */
    protected static final int f40402z = 255;

    /* JADX INFO: renamed from: g */
    private float f40403g;

    /* JADX INFO: renamed from: h */
    private boolean f40404h;

    /* JADX INFO: renamed from: n */
    private C7176q f40405n;

    /* JADX INFO: renamed from: p */
    private boolean f40406p;

    /* JADX INFO: renamed from: s */
    private boolean f40407s;

    /* JADX INFO: renamed from: y */
    private float f40408y;

    /* JADX INFO: renamed from: miuix.internal.view.CheckBoxAnimatedStateListDrawable$k */
    protected static class C7173k extends C7175k.k {
        protected C7173k() {
        }

        @Override // miuix.internal.view.C7175k.k
        /* JADX INFO: renamed from: k */
        protected Drawable mo26006k(Resources resources, Resources.Theme theme, C7175k.k kVar) {
            return new CheckBoxAnimatedStateListDrawable(resources, theme, kVar);
        }
    }

    public CheckBoxAnimatedStateListDrawable() {
        this.f40403g = 1.0f;
        this.f40408y = 1.0f;
        this.f40407s = false;
        this.f40406p = false;
    }

    private int f7l8(TypedArray typedArray, int i2, int i3) {
        try {
            return typedArray.getColor(i2, i3);
        } catch (UnsupportedOperationException e2) {
            Log.w(f40400i, "try catch UnsupportedOperationException insafeGetColor", e2);
            return i3;
        }
    }

    /* JADX INFO: renamed from: g */
    private boolean m25999g(TypedArray typedArray, int i2, boolean z2) {
        try {
            return typedArray.getBoolean(i2, z2);
        } catch (Exception e2) {
            Log.w(f40400i, "try catch Exception insafeGetBoolean", e2);
            return z2;
        }
    }

    /* JADX INFO: renamed from: y */
    private int m26000y(TypedArray typedArray, int i2, int i3) {
        try {
            return typedArray.getInt(i2, i3);
        } catch (Exception e2) {
            Log.w(f40400i, "try catch Exception insafeGetInt", e2);
            return i3;
        }
    }

    @Override // android.graphics.drawable.AnimatedStateListDrawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(toq(), toq.ki.py7);
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(R.attr.isLightTheme, typedValue, true);
        boolean zEquals = "true".equals(TypedValue.coerceToString(typedValue.type, typedValue.data));
        int color = zEquals ? Color.parseColor("#000000") : Color.parseColor("#ffffff");
        this.f40411k.f87802toq = f7l8(typedArrayObtainStyledAttributes, toq.ki.a7zh, color);
        this.f40411k.f87803zy = f7l8(typedArrayObtainStyledAttributes, toq.ki.zxa9, color);
        this.f40411k.f40416q = f7l8(typedArrayObtainStyledAttributes, toq.ki.p6, Color.parseColor(zEquals ? "#3482FF" : "#277AF7"));
        this.f40411k.f40414n = f7l8(typedArrayObtainStyledAttributes, toq.ki.ma8k, Color.parseColor("#ffffff"));
        this.f40411k.f40412g = m26000y(typedArrayObtainStyledAttributes, toq.ki.je1q, zEquals ? 15 : 51);
        this.f40411k.f87801f7l8 = m26000y(typedArrayObtainStyledAttributes, toq.ki.drpy, zEquals ? 15 : 51);
        this.f40411k.f40418y = m26000y(typedArrayObtainStyledAttributes, toq.ki.wkrb, zEquals ? 255 : 0);
        this.f40411k.f40417s = m26000y(typedArrayObtainStyledAttributes, toq.ki.iw, zEquals ? 255 : 0);
        this.f40411k.f40415p = m25999g(typedArrayObtainStyledAttributes, toq.ki.cyg, false);
        typedArrayObtainStyledAttributes.recycle();
        boolean zMo26002n = mo26002n();
        C7175k.k kVar = this.f40411k;
        this.f40405n = new C7176q(this, zMo26002n, kVar.f87802toq, kVar.f87803zy, kVar.f40416q, kVar.f40412g, kVar.f87801f7l8, kVar.f40414n, kVar.f40418y, kVar.f40417s);
    }

    @Override // android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable current = getCurrent();
        if (current != null && (current instanceof BitmapDrawable)) {
            super.draw(canvas);
            return;
        }
        if (!this.f40411k.f40415p) {
            C7176q c7176q = this.f40405n;
            if (c7176q != null) {
                c7176q.m26011n(canvas);
            }
            super.draw(canvas);
            return;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 2));
        if (this.f40404h) {
            C7176q c7176q2 = this.f40405n;
            if (c7176q2 != null) {
                c7176q2.m26011n(canvas);
            }
            setAlpha((int) (this.f40408y * 255.0f));
        } else {
            setAlpha(76);
        }
        canvas.save();
        Rect bounds = getBounds();
        float f2 = this.f40403g;
        canvas.scale(f2, f2, (bounds.left + bounds.right) / 2, (bounds.top + bounds.bottom) / 2);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // miuix.internal.view.C7175k
    /* JADX INFO: renamed from: k */
    protected C7175k.k mo26001k() {
        return new C7173k();
    }

    protected void kja0(boolean z2, boolean z3) {
        C7176q c7176q = this.f40405n;
        if (c7176q != null) {
            c7176q.n7h(z2, z3);
            invalidateSelf();
        }
    }

    public void ld6(float f2) {
        this.f40408y = f2;
    }

    /* JADX INFO: renamed from: n */
    protected boolean mo26002n() {
        return false;
    }

    protected void n7h(boolean z2) {
        C7176q c7176q = this.f40405n;
        if (c7176q != null) {
            c7176q.qrj(z2, this.f40411k.f40415p);
        }
    }

    @Override // android.graphics.drawable.AnimatedStateListDrawable, android.graphics.drawable.StateListDrawable, android.graphics.drawable.DrawableContainer, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f40405n == null) {
            return zOnStateChange;
        }
        Drawable current = getCurrent();
        if (current != null && (current instanceof BitmapDrawable)) {
            return super.onStateChange(iArr);
        }
        this.f40404h = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842919) {
                z2 = true;
            } else if (i2 == 16842912) {
                z3 = true;
            } else if (i2 == 16842910) {
                this.f40404h = true;
            }
        }
        if (z2) {
            qrj(z3);
        }
        if (!this.f40407s && !z2) {
            kja0(z3, this.f40404h);
        }
        if (!z2 && (this.f40407s || z3 != this.f40406p)) {
            n7h(z3);
        }
        this.f40407s = z2;
        this.f40406p = z3;
        return zOnStateChange;
    }

    /* JADX INFO: renamed from: p */
    protected void mo26003p(Rect rect) {
        C7176q c7176q = this.f40405n;
        if (c7176q != null) {
            c7176q.m26012p(rect);
        }
    }

    /* JADX INFO: renamed from: q */
    public float m26004q() {
        return this.f40403g;
    }

    protected void qrj(boolean z2) {
        C7176q c7176q = this.f40405n;
        if (c7176q != null) {
            c7176q.x2(z2, this.f40411k.f40415p);
        }
    }

    /* JADX INFO: renamed from: s */
    protected void mo26005s(int i2, int i3, int i4, int i5) {
        C7176q c7176q = this.f40405n;
        if (c7176q != null) {
            c7176q.m26013s(i2, i3, i4, i5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        mo26005s(i2, i3, i4, i5);
    }

    protected int toq() {
        return toq.cdj.f75347xm;
    }

    public void x2(float f2) {
        this.f40403g = f2;
    }

    public float zy() {
        return this.f40408y;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        mo26003p(rect);
    }

    public CheckBoxAnimatedStateListDrawable(Resources resources, Resources.Theme theme, C7175k.k kVar) {
        super(resources, theme, kVar);
        this.f40403g = 1.0f;
        this.f40408y = 1.0f;
        this.f40407s = false;
        this.f40406p = false;
        this.f40405n = new C7176q(this, mo26002n(), kVar.f87802toq, kVar.f87803zy, kVar.f40416q, kVar.f40412g, kVar.f87801f7l8, kVar.f40414n, kVar.f40418y, kVar.f40417s);
    }
}
