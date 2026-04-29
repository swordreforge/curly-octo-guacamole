package androidx.core.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: RoundedBitmapDrawable21.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(21)
class ld6 extends x2 {
    protected ld6(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // androidx.core.graphics.drawable.x2
    /* JADX INFO: renamed from: g */
    void mo2423g(int i2, int i3, int i4, Rect rect, Rect rect2) {
        Gravity.apply(i2, i3, i4, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@lvui Outline outline) {
        m2436i();
        outline.setRoundRect(this.f3557y, zy());
    }

    @Override // androidx.core.graphics.drawable.x2
    public void kja0(boolean z2) {
        Bitmap bitmap = this.f3552k;
        if (bitmap != null) {
            bitmap.setHasMipMap(z2);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.x2
    /* JADX INFO: renamed from: y */
    public boolean mo2424y() {
        Bitmap bitmap = this.f3552k;
        return bitmap != null && bitmap.hasMipMap();
    }
}
