package miuix.smooth;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import miuix.smooth.toq;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import uo.C7699k;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.x2;

/* JADX INFO: compiled from: SmoothGradientDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class f7l8 extends GradientDrawable {

    /* JADX INFO: renamed from: g */
    private static final PorterDuffXfermode f41671g = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: k */
    protected toq f41672k;

    /* JADX INFO: renamed from: n */
    private Rect f41673n;

    /* JADX INFO: renamed from: q */
    private RectF f41674q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private GradientDrawable f90103toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C7699k f90104zy;

    @lvui
    /* JADX INFO: renamed from: q */
    private TypedArray m26598q(@lvui Resources resources, @dd Resources.Theme theme, @lvui AttributeSet attributeSet, @lvui int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void applyTheme(@lvui Resources.Theme theme) {
        super.applyTheme(theme);
        this.f41672k.m26602k(super.getConstantState());
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        toq toqVar = this.f41672k;
        return (toqVar != null && toqVar.canApplyTheme()) || super.canApplyTheme();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSaveLayer = m26600k() != 2 ? canvas.saveLayer(this.f41674q, null, 31) : -1;
        GradientDrawable gradientDrawable = this.f90103toq;
        if (gradientDrawable != null) {
            gradientDrawable.draw(canvas);
        } else {
            super.draw(canvas);
        }
        this.f90104zy.m28091k(canvas, f41671g);
        if (m26600k() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f90104zy.toq(canvas);
    }

    public void f7l8(int i2) {
        toq toqVar = this.f41672k;
        if (toqVar.f41678q != i2) {
            toqVar.f41678q = i2;
            this.f90104zy.kja0(i2);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m26599g(int i2) {
        toq toqVar = this.f41672k;
        if (toqVar.f41677n != i2) {
            toqVar.f41677n = i2;
            this.f90104zy.n7h(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public int getAlpha() {
        GradientDrawable gradientDrawable = this.f90103toq;
        return gradientDrawable != null ? gradientDrawable.getAlpha() : super.getAlpha();
    }

    @Override // android.graphics.drawable.GradientDrawable
    @dd
    public ColorStateList getColor() {
        GradientDrawable gradientDrawable = this.f90103toq;
        return gradientDrawable != null ? gradientDrawable.getColor() : super.getColor();
    }

    @Override // android.graphics.drawable.GradientDrawable
    @dd
    public int[] getColors() {
        GradientDrawable gradientDrawable = this.f90103toq;
        return gradientDrawable != null ? gradientDrawable.getColors() : super.getColors();
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41672k;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f90104zy.m28090g(this.f41673n));
        } else {
            outline.setRoundRect(this.f41673n, this.f90104zy.m28092n());
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void inflate(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayM26598q = m26598q(resources, theme, attributeSet, toq.C7340p.f90277uj2j);
        f7l8(typedArrayM26598q.getDimensionPixelSize(toq.C7340p.f90207bek6, 0));
        m26599g(typedArrayM26598q.getColor(toq.C7340p.f90206b3e, 0));
        m26601n(typedArrayM26598q.getInt(toq.C7340p.f90244jz5, 0));
        typedArrayM26598q.recycle();
        super.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: k */
    public int m26600k() {
        return this.f41672k.f41675g;
    }

    /* JADX INFO: renamed from: n */
    public void m26601n(int i2) {
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        toq toqVar = this.f41672k;
        if (toqVar.f41675g != i2) {
            toqVar.f41675g = i2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        GradientDrawable gradientDrawable = this.f90103toq;
        if (gradientDrawable != null) {
            gradientDrawable.setBounds(rect);
        }
        this.f90104zy.m28093p(rect);
        this.f41673n = rect;
        this.f41674q.set(0.0f, 0.0f, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        GradientDrawable gradientDrawable = this.f90103toq;
        if (gradientDrawable != null) {
            gradientDrawable.setAlpha(i2);
        } else {
            super.setAlpha(i2);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColor(int i2) {
        GradientDrawable gradientDrawable = this.f90103toq;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i2);
        } else {
            super.setColor(i2);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setColors(@dd int[] iArr, @dd float[] fArr) {
        GradientDrawable gradientDrawable = this.f90103toq;
        if (gradientDrawable == null || Build.VERSION.SDK_INT < 29) {
            super.setColors(iArr, fArr);
        } else {
            gradientDrawable.setColors(iArr, fArr);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setCornerRadii(@dd float[] fArr) {
        super.setCornerRadii(fArr);
        this.f41672k.f90106zy = fArr;
        this.f90104zy.x2(fArr);
        if (fArr == null) {
            this.f41672k.f90105toq = 0.0f;
            this.f90104zy.qrj(0.0f);
        }
    }

    @Override // android.graphics.drawable.GradientDrawable
    public void setCornerRadius(float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        super.setCornerRadius(f2);
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        toq toqVar = this.f41672k;
        toqVar.f90105toq = f2;
        toqVar.f90106zy = null;
        this.f90104zy.qrj(f2);
        this.f90104zy.x2(null);
    }

    public int toq() {
        return this.f41672k.f41677n;
    }

    public int zy() {
        return this.f41672k.f41678q;
    }

    /* JADX INFO: compiled from: SmoothGradientDrawable.java */
    protected static class toq extends Drawable.ConstantState {

        /* JADX INFO: renamed from: g */
        int f41675g;

        /* JADX INFO: renamed from: k */
        Drawable.ConstantState f41676k;

        /* JADX INFO: renamed from: n */
        int f41677n;

        /* JADX INFO: renamed from: q */
        int f41678q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f90105toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        float[] f90106zy;

        public toq() {
            this.f41678q = 0;
            this.f41677n = 0;
            this.f41675g = 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f41676k.getChangingConfigurations();
        }

        /* JADX INFO: renamed from: k */
        public void m26602k(Drawable.ConstantState constantState) {
            this.f41676k = constantState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            Resources resources = null;
            Object[] objArr = 0;
            if (this.f41676k == null) {
                return null;
            }
            return new f7l8(this, resources);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            if (this.f41676k == null) {
                return null;
            }
            return new f7l8(new toq(this), resources);
        }

        public toq(@lvui toq toqVar) {
            this.f41678q = 0;
            this.f41677n = 0;
            this.f41675g = 0;
            this.f90105toq = toqVar.f90105toq;
            this.f90106zy = toqVar.f90106zy;
            this.f41678q = toqVar.f41678q;
            this.f41677n = toqVar.f41677n;
            this.f41676k = toqVar.f41676k;
            this.f41675g = toqVar.f41675g;
        }
    }

    public f7l8() {
        this.f90104zy = new C7699k();
        this.f41674q = new RectF();
        this.f41673n = new Rect();
        toq toqVar = new toq();
        this.f41672k = toqVar;
        toqVar.m26602k(super.getConstantState());
    }

    @Override // android.graphics.drawable.GradientDrawable
    @hyr(api = 21)
    public void setColor(@dd ColorStateList colorStateList) {
        GradientDrawable gradientDrawable = this.f90103toq;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(colorStateList);
        } else {
            super.setColor(colorStateList);
        }
    }

    public f7l8(GradientDrawable.Orientation orientation, @x2 int[] iArr) {
        super(orientation, iArr);
        this.f90104zy = new C7699k();
        this.f41674q = new RectF();
        this.f41673n = new Rect();
        toq toqVar = new toq();
        this.f41672k = toqVar;
        toqVar.m26602k(super.getConstantState());
    }

    private f7l8(toq toqVar, Resources resources) {
        Drawable drawableNewDrawable;
        this.f90104zy = new C7699k();
        this.f41674q = new RectF();
        this.f41673n = new Rect();
        this.f41672k = toqVar;
        if (resources == null) {
            drawableNewDrawable = toqVar.f41676k.newDrawable();
        } else {
            drawableNewDrawable = toqVar.f41676k.newDrawable(resources);
        }
        this.f41672k.m26602k(drawableNewDrawable.getConstantState());
        this.f90103toq = (GradientDrawable) drawableNewDrawable;
        this.f90104zy.x2(toqVar.f90106zy);
        this.f90104zy.qrj(toqVar.f90105toq);
        this.f90104zy.kja0(toqVar.f41678q);
        this.f90104zy.n7h(toqVar.f41677n);
    }
}
