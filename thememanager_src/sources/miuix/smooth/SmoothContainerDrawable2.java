package miuix.smooth;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import java.io.IOException;
import miuix.smooth.toq;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothContainerDrawable2 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: t */
    private static final String f41644t = "SmoothContainerDrawable2";

    /* JADX INFO: renamed from: g */
    private float[] f41645g;

    /* JADX INFO: renamed from: h */
    private RectF f41646h;

    /* JADX INFO: renamed from: i */
    private Path f41647i;

    /* JADX INFO: renamed from: k */
    private ContainerState f41648k;

    /* JADX INFO: renamed from: n */
    private int f41649n;

    /* JADX INFO: renamed from: p */
    private Paint f41650p;

    /* JADX INFO: renamed from: q */
    private int f41651q;

    /* JADX INFO: renamed from: s */
    private float f41652s;

    /* JADX INFO: renamed from: y */
    private float[] f41653y;

    /* JADX INFO: renamed from: z */
    private boolean f41654z;

    static final class ContainerState extends Drawable.ConstantState {
        ChildDrawableWrapper mChildDrawableWrapper;
        int mLayerType;
        float[] mRadii;
        float mRadius;
        int mStrokeColor;
        int mStrokeWidth;
        boolean mUseSmooth;

        public ContainerState() {
            this.mLayerType = 0;
            this.mChildDrawableWrapper = new ChildDrawableWrapper();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        public int getAlpha() {
            return this.mChildDrawableWrapper.mDrawable.getAlpha();
        }

        public Rect getBounds() {
            return this.mChildDrawableWrapper.mDrawable.getBounds();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChildDrawableWrapper.mDrawable.getChangingConfigurations();
        }

        public Rect getDirtyBounds() {
            return this.mChildDrawableWrapper.mDrawable.getDirtyBounds();
        }

        public int getIntrinsicHeight() {
            return this.mChildDrawableWrapper.mDrawable.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mChildDrawableWrapper.mDrawable.getIntrinsicWidth();
        }

        public int getOpacity() {
            return this.mChildDrawableWrapper.mDrawable.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mChildDrawableWrapper.mDrawable.getPadding(rect);
        }

        public final boolean isStateful() {
            return this.mChildDrawableWrapper.mDrawable.isStateful();
        }

        public void jumpToCurrentState() {
            this.mChildDrawableWrapper.mDrawable.jumpToCurrentState();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new SmoothContainerDrawable2(null, 0 == true ? 1 : 0, this);
        }

        public void onBoundsChange(Rect rect) {
            this.mChildDrawableWrapper.mDrawable.setBounds(rect);
        }

        public boolean onStateChange(int[] iArr) {
            return isStateful() && this.mChildDrawableWrapper.mDrawable.setState(iArr);
        }

        public void setAlpha(int i2) {
            this.mChildDrawableWrapper.mDrawable.setAlpha(i2);
            this.mChildDrawableWrapper.mDrawable.invalidateSelf();
        }

        public void setBounds(Rect rect) {
            this.mChildDrawableWrapper.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i2) {
            this.mChildDrawableWrapper.mDrawable.setChangingConfigurations(i2);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mChildDrawableWrapper.mDrawable.setColorFilter(colorFilter);
        }

        public void setDither(boolean z2) {
            this.mChildDrawableWrapper.mDrawable.setDither(z2);
        }

        public void setFilterBitmap(boolean z2) {
            this.mChildDrawableWrapper.mDrawable.setFilterBitmap(z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(@dd Resources resources) {
            return new SmoothContainerDrawable2(resources, null, this);
        }

        public void setBounds(int i2, int i3, int i4, int i5) {
            this.mChildDrawableWrapper.mDrawable.setBounds(i2, i3, i4, i5);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(@dd Resources resources, @dd Resources.Theme theme) {
            return new SmoothContainerDrawable2(resources, theme, this);
        }

        public ContainerState(@lvui ContainerState containerState, @lvui SmoothContainerDrawable2 smoothContainerDrawable2, @dd Resources resources, @dd Resources.Theme theme) {
            this.mLayerType = 0;
            this.mChildDrawableWrapper = new ChildDrawableWrapper(containerState.mChildDrawableWrapper, smoothContainerDrawable2, resources, theme);
            this.mRadius = containerState.mRadius;
            this.mRadii = containerState.mRadii;
            this.mStrokeWidth = containerState.mStrokeWidth;
            this.mStrokeColor = containerState.mStrokeColor;
            this.mLayerType = containerState.mLayerType;
            this.mUseSmooth = containerState.mUseSmooth;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m26585k(Canvas canvas) {
        Rect bounds = getBounds();
        int iSave = canvas.save();
        this.f41647i.reset();
        RectF rectF = this.f41646h;
        rectF.left = bounds.left;
        rectF.top = bounds.top;
        rectF.right = bounds.right;
        rectF.bottom = bounds.bottom;
        float[] fArr = this.f41645g;
        if (fArr == null) {
            Path path = this.f41647i;
            float f2 = this.f41652s;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        } else {
            this.f41647i.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        canvas.clipPath(this.f41647i);
        int i2 = this.f41651q;
        float f3 = i2 * 0.5f;
        if (i2 != 0) {
            int iSave2 = canvas.save();
            this.f41646h.inset(f3, f3);
            this.f41647i.reset();
            float[] fArr2 = this.f41645g;
            if (fArr2 == null) {
                Path path2 = this.f41647i;
                RectF rectF2 = this.f41646h;
                float f4 = this.f41652s;
                path2.addRoundRect(rectF2, f4 + f3, f4 + f3, Path.Direction.CW);
            } else {
                float[] fArr3 = (float[]) fArr2.clone();
                this.f41653y = fArr3;
                float[] fArr4 = this.f41645g;
                fArr3[0] = fArr4[0] + f3;
                fArr3[1] = fArr4[1] + f3;
                fArr3[2] = fArr4[2] + f3;
                fArr3[3] = fArr4[3] + f3;
                this.f41647i.addRoundRect(this.f41646h, fArr3, Path.Direction.CCW);
            }
            canvas.clipPath(this.f41647i);
            this.f41648k.mChildDrawableWrapper.mDrawable.draw(canvas);
            canvas.restoreToCount(iSave2);
            canvas.drawPath(this.f41647i, this.f41650p);
        } else {
            this.f41648k.mChildDrawableWrapper.mDrawable.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    private void ki(boolean z2) {
        C7334n.zy(this, z2);
        this.f41648k.mUseSmooth = z2;
    }

    private void ld6(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals(C1774q.as)) {
                do {
                    next = xmlPullParser.next();
                } while (next == 4);
                if (next != 2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <child> tag requires a 'drawable' attribute or child tag defining a drawable");
                }
                ChildDrawableWrapper childDrawableWrapper = new ChildDrawableWrapper();
                Drawable drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                childDrawableWrapper.mDrawable = drawableCreateFromXmlInner;
                drawableCreateFromXmlInner.setCallback(this);
                this.f41648k.mChildDrawableWrapper = childDrawableWrapper;
                return;
            }
        }
    }

    @lvui
    protected static TypedArray qrj(@lvui Resources resources, @dd Resources.Theme theme, @lvui AttributeSet attributeSet, @lvui int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private void x2() {
        Paint paint = new Paint(1);
        this.f41650p = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f41650p.setColor(this.f41649n);
        this.f41650p.setStrokeWidth(this.f41651q);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(@lvui Resources.Theme theme) {
        super.applyTheme(theme);
        this.f41648k.mChildDrawableWrapper.mDrawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        ContainerState containerState = this.f41648k;
        return (containerState != null && containerState.canApplyTheme()) || super.canApplyTheme();
    }

    public void cdj(int i2) {
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        ContainerState containerState = this.f41648k;
        if (containerState.mLayerType != i2) {
            containerState.mLayerType = i2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        m26585k(canvas);
    }

    public int f7l8() {
        return this.f41648k.mStrokeColor;
    }

    public void fn3e(boolean z2) {
        this.f41654z = z2;
        ki(z2);
    }

    /* JADX INFO: renamed from: g */
    public int m26586g() {
        return this.f41648k.mLayerType;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f41648k.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41648k;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Rect getDirtyBounds() {
        return this.f41648k.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41648k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41648k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f41648k.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(toq(), m26589n());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        return this.f41648k.getPadding(rect);
    }

    /* JADX INFO: renamed from: h */
    public void m26587h(float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        ContainerState containerState = this.f41648k;
        containerState.mRadius = f2;
        containerState.mRadii = null;
        this.f41652s = f2;
        this.f41645g = null;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public void m26588i(int i2) {
        ContainerState containerState = this.f41648k;
        if (containerState.mStrokeWidth != i2) {
            containerState.mStrokeWidth = i2;
            this.f41651q = i2;
            this.f41650p.setStrokeWidth(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayQrj = qrj(resources, theme, attributeSet, toq.C7340p.f41739d);
        m26587h(typedArrayQrj.getDimensionPixelSize(toq.C7340p.f90257mu, 0));
        int i2 = toq.C7340p.f90281vq;
        if (typedArrayQrj.hasValue(i2) || typedArrayQrj.hasValue(toq.C7340p.f90267qkj8) || typedArrayQrj.hasValue(toq.C7340p.f90268qo) || typedArrayQrj.hasValue(toq.C7340p.f90227fnq8)) {
            float dimensionPixelSize = typedArrayQrj.getDimensionPixelSize(i2, 0);
            float dimensionPixelSize2 = typedArrayQrj.getDimensionPixelSize(toq.C7340p.f90267qkj8, 0);
            float dimensionPixelSize3 = typedArrayQrj.getDimensionPixelSize(toq.C7340p.f90268qo, 0);
            float dimensionPixelSize4 = typedArrayQrj.getDimensionPixelSize(toq.C7340p.f90227fnq8, 0);
            kja0(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        m26588i(typedArrayQrj.getDimensionPixelSize(toq.C7340p.f90230g1, 0));
        t8r(typedArrayQrj.getColor(toq.C7340p.f90219d8wk, 0));
        cdj(typedArrayQrj.getInt(toq.C7340p.f90275tfm, 0));
        this.f41654z = typedArrayQrj.getBoolean(toq.C7340p.f90284was, true);
        Boolean bool = C7334n.f41680k;
        if (bool != null) {
            this.f41654z = bool.booleanValue();
        }
        if (this.f41654z) {
            ki(true);
        }
        typedArrayQrj.recycle();
        ld6(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@lvui Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f41648k.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f41648k.jumpToCurrentState();
    }

    public void kja0(float[] fArr) {
        ContainerState containerState = this.f41648k;
        containerState.mRadii = fArr;
        this.f41645g = fArr;
        if (fArr == null) {
            containerState.mRadius = 0.0f;
            this.f41652s = 0.0f;
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    public float m26589n() {
        return this.f41648k.mRadius;
    }

    public void n7h(Drawable drawable) {
        if (this.f41648k != null) {
            ChildDrawableWrapper childDrawableWrapper = new ChildDrawableWrapper();
            childDrawableWrapper.mDrawable = drawable;
            drawable.setCallback(this);
            this.f41648k.mChildDrawableWrapper = childDrawableWrapper;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f41648k.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f41648k.onStateChange(iArr);
    }

    /* JADX INFO: renamed from: p */
    public float[] m26590p() {
        return this.f41645g;
    }

    /* JADX INFO: renamed from: q */
    public float[] m26591q() {
        float[] fArr = this.f41648k.mRadii;
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    /* JADX INFO: renamed from: s */
    public boolean m26592s() {
        return this.f41654z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f41648k.setAlpha(i2);
        this.f41650p.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f41648k.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        this.f41648k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f41648k.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f41648k.setFilterBitmap(z2);
    }

    public void t8r(int i2) {
        ContainerState containerState = this.f41648k;
        if (containerState.mStrokeColor != i2) {
            containerState.mStrokeColor = i2;
            this.f41649n = i2;
            this.f41650p.setColor(i2);
            invalidateSelf();
        }
    }

    public final Rect toq() {
        return this.f41648k.getBounds();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* JADX INFO: renamed from: y */
    public int m26593y() {
        return this.f41648k.mStrokeWidth;
    }

    public void zurt(float[] fArr) {
        this.f41645g = fArr;
    }

    public Drawable zy() {
        ContainerState containerState = this.f41648k;
        if (containerState != null) {
            return containerState.mChildDrawableWrapper.mDrawable;
        }
        return null;
    }

    static class ChildDrawableWrapper {
        Drawable mDrawable;

        ChildDrawableWrapper() {
            this.mDrawable = new GradientDrawable();
        }

        ChildDrawableWrapper(@lvui ChildDrawableWrapper childDrawableWrapper, @lvui SmoothContainerDrawable2 smoothContainerDrawable2, @dd Resources resources, @dd Resources.Theme theme) {
            Drawable drawableNewDrawable;
            Drawable drawable = childDrawableWrapper.mDrawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState == null) {
                    drawableNewDrawable = drawable;
                } else if (resources == null) {
                    drawableNewDrawable = constantState.newDrawable();
                } else if (theme == null) {
                    drawableNewDrawable = constantState.newDrawable(resources);
                } else {
                    drawableNewDrawable = constantState.newDrawable(resources, theme);
                }
                drawableNewDrawable.setLayoutDirection(drawable.getLayoutDirection());
                drawableNewDrawable.setBounds(drawable.getBounds());
                drawableNewDrawable.setLevel(drawable.getLevel());
                drawableNewDrawable.setCallback(smoothContainerDrawable2);
            } else {
                drawableNewDrawable = null;
            }
            this.mDrawable = drawableNewDrawable;
        }
    }

    public SmoothContainerDrawable2() {
        this.f41646h = new RectF();
        this.f41647i = new Path();
        this.f41648k = new ContainerState();
        x2();
    }

    private SmoothContainerDrawable2(Resources resources, Resources.Theme theme, ContainerState containerState) {
        this.f41646h = new RectF();
        this.f41647i = new Path();
        this.f41648k = new ContainerState(containerState, this, resources, theme);
        this.f41651q = containerState.mStrokeWidth;
        this.f41649n = containerState.mStrokeColor;
        this.f41645g = containerState.mRadii;
        this.f41652s = containerState.mRadius;
        boolean z2 = containerState.mUseSmooth;
        this.f41654z = z2;
        ki(z2);
        x2();
    }
}
