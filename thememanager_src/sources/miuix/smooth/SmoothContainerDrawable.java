package miuix.smooth;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.android.thememanager.basemodule.network.theme.interceptors.C1774q;
import java.io.IOException;
import miuix.smooth.toq;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import uo.C7699k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class SmoothContainerDrawable extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: n */
    private static final PorterDuffXfermode f41641n = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);

    /* JADX INFO: renamed from: k */
    private ContainerState f41642k;

    /* JADX INFO: renamed from: q */
    private C7699k f41643q;

    static class ChildDrawable {
        Drawable mDrawable;

        ChildDrawable() {
        }

        ChildDrawable(@lvui ChildDrawable childDrawable, @lvui SmoothContainerDrawable smoothContainerDrawable, @dd Resources resources, @dd Resources.Theme theme) {
            Drawable drawableNewDrawable;
            Drawable drawable = childDrawable.mDrawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                drawableNewDrawable = constantState == null ? drawable : resources == null ? constantState.newDrawable() : theme == null ? constantState.newDrawable(resources) : constantState.newDrawable(resources, theme);
                drawableNewDrawable.setLayoutDirection(drawable.getLayoutDirection());
                drawableNewDrawable.setBounds(drawable.getBounds());
                drawableNewDrawable.setLevel(drawable.getLevel());
                drawableNewDrawable.setCallback(smoothContainerDrawable);
            } else {
                drawableNewDrawable = null;
            }
            this.mDrawable = drawableNewDrawable;
        }
    }

    static final class ContainerState extends Drawable.ConstantState {
        ChildDrawable mChildDrawable;
        int mLayerType;
        float[] mRadii;
        float mRadius;
        int mStrokeColor;
        int mStrokeWidth;

        public ContainerState() {
            this.mLayerType = 0;
            this.mChildDrawable = new ChildDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return true;
        }

        public int getAlpha() {
            return this.mChildDrawable.mDrawable.getAlpha();
        }

        public Rect getBounds() {
            return this.mChildDrawable.mDrawable.getBounds();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChildDrawable.mDrawable.getChangingConfigurations();
        }

        public Rect getDirtyBounds() {
            return this.mChildDrawable.mDrawable.getDirtyBounds();
        }

        public int getIntrinsicHeight() {
            return this.mChildDrawable.mDrawable.getIntrinsicHeight();
        }

        public int getIntrinsicWidth() {
            return this.mChildDrawable.mDrawable.getIntrinsicWidth();
        }

        public int getOpacity() {
            return this.mChildDrawable.mDrawable.getOpacity();
        }

        public boolean getPadding(Rect rect) {
            return this.mChildDrawable.mDrawable.getPadding(rect);
        }

        public final boolean isStateful() {
            return this.mChildDrawable.mDrawable.isStateful();
        }

        public void jumpToCurrentState() {
            this.mChildDrawable.mDrawable.jumpToCurrentState();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new SmoothContainerDrawable(null, 0 == true ? 1 : 0, this);
        }

        public void onBoundsChange(Rect rect) {
            this.mChildDrawable.mDrawable.setBounds(rect);
        }

        public boolean onStateChange(int[] iArr) {
            return isStateful() && this.mChildDrawable.mDrawable.setState(iArr);
        }

        public void setAlpha(int i2) {
            this.mChildDrawable.mDrawable.setAlpha(i2);
            this.mChildDrawable.mDrawable.invalidateSelf();
        }

        public void setBounds(Rect rect) {
            this.mChildDrawable.mDrawable.setBounds(rect);
        }

        public void setChangingConfigurations(int i2) {
            this.mChildDrawable.mDrawable.setChangingConfigurations(i2);
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mChildDrawable.mDrawable.setColorFilter(colorFilter);
        }

        public void setDither(boolean z2) {
            this.mChildDrawable.mDrawable.setDither(z2);
        }

        public void setFilterBitmap(boolean z2) {
            this.mChildDrawable.mDrawable.setFilterBitmap(z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(@dd Resources resources) {
            return new SmoothContainerDrawable(resources, null, this);
        }

        public void setBounds(int i2, int i3, int i4, int i5) {
            this.mChildDrawable.mDrawable.setBounds(i2, i3, i4, i5);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(@dd Resources resources, @dd Resources.Theme theme) {
            return new SmoothContainerDrawable(resources, theme, this);
        }

        public ContainerState(@lvui ContainerState containerState, @lvui SmoothContainerDrawable smoothContainerDrawable, @dd Resources resources, @dd Resources.Theme theme) {
            this.mLayerType = 0;
            this.mChildDrawable = new ChildDrawable(containerState.mChildDrawable, smoothContainerDrawable, resources, theme);
            this.mRadius = containerState.mRadius;
            this.mRadii = containerState.mRadii;
            this.mStrokeWidth = containerState.mStrokeWidth;
            this.mStrokeColor = containerState.mStrokeColor;
            this.mLayerType = containerState.mLayerType;
        }
    }

    @lvui
    /* JADX INFO: renamed from: s */
    private TypedArray m26578s(@lvui Resources resources, @dd Resources.Theme theme, @lvui AttributeSet attributeSet, @lvui int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: y */
    private void m26579y(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                ChildDrawable childDrawable = new ChildDrawable();
                Drawable drawableCreateFromXmlInner = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                childDrawable.mDrawable = drawableCreateFromXmlInner;
                drawableCreateFromXmlInner.setCallback(this);
                this.f41642k.mChildDrawable = childDrawable;
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(@lvui Resources.Theme theme) {
        super.applyTheme(theme);
        this.f41642k.mChildDrawable.mDrawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        ContainerState containerState = this.f41642k;
        return (containerState != null && containerState.canApplyTheme()) || super.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSaveLayer = m26582n() != 2 ? canvas.saveLayer(m26581k().left, m26581k().top, m26581k().right, m26581k().bottom, null, 31) : -1;
        this.f41642k.mChildDrawable.mDrawable.draw(canvas);
        this.f41643q.m28091k(canvas, f41641n);
        if (m26582n() != 2) {
            canvas.restoreToCount(iSaveLayer);
        }
        this.f41643q.toq(canvas);
    }

    public int f7l8() {
        return this.f41642k.mStrokeWidth;
    }

    /* JADX INFO: renamed from: g */
    public int m26580g() {
        return this.f41642k.mStrokeColor;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f41642k.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41642k;
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Rect getDirtyBounds() {
        return this.f41642k.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41642k.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41642k.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f41642k.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.f41643q.m28090g(m26581k()));
        } else {
            outline.setRoundRect(m26581k(), m26584q());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@lvui Rect rect) {
        return this.f41642k.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(@lvui Resources resources, @lvui XmlPullParser xmlPullParser, @lvui AttributeSet attributeSet, @dd Resources.Theme theme) throws XmlPullParserException, IOException {
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        TypedArray typedArrayM26578s = m26578s(resources, theme, attributeSet, toq.C7340p.f90273t8iq);
        x2(typedArrayM26578s.getDimensionPixelSize(toq.C7340p.f41756u, 0));
        int i2 = toq.C7340p.f90209bo;
        if (typedArrayM26578s.hasValue(i2) || typedArrayM26578s.hasValue(toq.C7340p.f90290y2) || typedArrayM26578s.hasValue(toq.C7340p.f90234gyi) || typedArrayM26578s.hasValue(toq.C7340p.f90212c8jq)) {
            float dimensionPixelSize = typedArrayM26578s.getDimensionPixelSize(i2, 0);
            float dimensionPixelSize2 = typedArrayM26578s.getDimensionPixelSize(toq.C7340p.f90290y2, 0);
            float dimensionPixelSize3 = typedArrayM26578s.getDimensionPixelSize(toq.C7340p.f90234gyi, 0);
            float dimensionPixelSize4 = typedArrayM26578s.getDimensionPixelSize(toq.C7340p.f90212c8jq, 0);
            ld6(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize4});
        }
        kja0(typedArrayM26578s.getDimensionPixelSize(toq.C7340p.f41757v, 0));
        n7h(typedArrayM26578s.getColor(toq.C7340p.f90289xwq3, 0));
        qrj(typedArrayM26578s.getInt(toq.C7340p.f90221dr, 0));
        typedArrayM26578s.recycle();
        m26579y(resources, xmlPullParser, attributeSet, theme);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@lvui Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f41642k.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f41642k.jumpToCurrentState();
    }

    /* JADX INFO: renamed from: k */
    public final Rect m26581k() {
        return this.f41642k.getBounds();
    }

    public void kja0(int i2) {
        ContainerState containerState = this.f41642k;
        if (containerState.mStrokeWidth != i2) {
            containerState.mStrokeWidth = i2;
            this.f41643q.kja0(i2);
            invalidateSelf();
        }
    }

    public void ld6(float[] fArr) {
        this.f41642k.mRadii = fArr;
        this.f41643q.x2(fArr);
        if (fArr == null) {
            this.f41642k.mRadius = 0.0f;
            this.f41643q.qrj(0.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: n */
    public int m26582n() {
        return this.f41642k.mLayerType;
    }

    public void n7h(int i2) {
        ContainerState containerState = this.f41642k;
        if (containerState.mStrokeColor != i2) {
            containerState.mStrokeColor = i2;
            this.f41643q.n7h(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f41642k.onBoundsChange(rect);
        this.f41643q.m28093p(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f41642k.onStateChange(iArr);
    }

    /* JADX INFO: renamed from: p */
    public void m26583p(Drawable drawable) {
        if (this.f41642k != null) {
            ChildDrawable childDrawable = new ChildDrawable();
            childDrawable.mDrawable = drawable;
            drawable.setCallback(this);
            this.f41642k.mChildDrawable = childDrawable;
        }
    }

    /* JADX INFO: renamed from: q */
    public float m26584q() {
        return this.f41642k.mRadius;
    }

    public void qrj(int i2) {
        if (i2 < 0 || i2 > 2) {
            throw new IllegalArgumentException("Layer type can only be one of: LAYER_TYPE_NONE, LAYER_TYPE_SOFTWARE or LAYER_TYPE_HARDWARE");
        }
        ContainerState containerState = this.f41642k;
        if (containerState.mLayerType != i2) {
            containerState.mLayerType = i2;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f41642k.setAlpha(i2);
        this.f41643q.ld6(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f41642k.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        this.f41642k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f41642k.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f41642k.setFilterBitmap(z2);
    }

    public Drawable toq() {
        ContainerState containerState = this.f41642k;
        if (containerState != null) {
            return containerState.mChildDrawable.mDrawable;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@lvui Drawable drawable, @lvui Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void x2(float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        ContainerState containerState = this.f41642k;
        containerState.mRadius = f2;
        containerState.mRadii = null;
        this.f41643q.qrj(f2);
        this.f41643q.x2(null);
        invalidateSelf();
    }

    public float[] zy() {
        float[] fArr = this.f41642k.mRadii;
        if (fArr == null) {
            return null;
        }
        return (float[]) fArr.clone();
    }

    public SmoothContainerDrawable() {
        this.f41643q = new C7699k();
        this.f41642k = new ContainerState();
    }

    private SmoothContainerDrawable(Resources resources, Resources.Theme theme, ContainerState containerState) {
        this.f41643q = new C7699k();
        this.f41642k = new ContainerState(containerState, this, resources, theme);
        this.f41643q.kja0(containerState.mStrokeWidth);
        this.f41643q.n7h(containerState.mStrokeColor);
        this.f41643q.x2(containerState.mRadii);
        this.f41643q.qrj(containerState.mRadius);
    }
}
