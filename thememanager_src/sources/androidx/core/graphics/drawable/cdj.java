package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: WrappedDrawableApi21.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class cdj extends C0520h {

    /* JADX INFO: renamed from: h */
    private static final String f3539h = "WrappedDrawableApi21";

    /* JADX INFO: renamed from: i */
    private static Method f3540i;

    cdj(Drawable drawable) {
        super(drawable);
        f7l8();
    }

    private void f7l8() {
        if (f3540i == null) {
            try {
                f3540i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w(f3539h, "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @lvui
    public Rect getDirtyBounds() {
        return this.f3546s.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@lvui Outline outline) {
        this.f3546s.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f3546s;
        if (drawable != null && (method = f3540i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w(f3539h, "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f2, float f3) {
        this.f3546s.setHotspot(f2, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f3546s.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.core.graphics.drawable.C0520h, android.graphics.drawable.Drawable
    public boolean setState(@lvui int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.C0520h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTint(int i2) {
        if (zy()) {
            super.setTint(i2);
        } else {
            this.f3546s.setTint(i2);
        }
    }

    @Override // androidx.core.graphics.drawable.C0520h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintList(ColorStateList colorStateList) {
        if (zy()) {
            super.setTintList(colorStateList);
        } else {
            this.f3546s.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.C0520h, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.n7h
    public void setTintMode(@lvui PorterDuff.Mode mode) {
        if (zy()) {
            super.setTintMode(mode);
        } else {
            this.f3546s.setTintMode(mode);
        }
    }

    @Override // androidx.core.graphics.drawable.C0520h
    protected boolean zy() {
        return false;
    }

    cdj(ki kiVar, Resources resources) {
        super(kiVar, resources);
        f7l8();
    }
}
