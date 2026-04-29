package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
/* JADX INFO: loaded from: classes.dex */
class toq extends Drawable {

    /* JADX INFO: renamed from: k */
    final ActionBarContainer f1194k;

    public toq(ActionBarContainer actionBarContainer) {
        this.f1194k = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1194k;
        if (actionBarContainer.f600h) {
            Drawable drawable = actionBarContainer.f604p;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f607y;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1194k;
        Drawable drawable3 = actionBarContainer2.f606s;
        if (drawable3 == null || !actionBarContainer2.f601i) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    @zy.hyr(21)
    public void getOutline(@zy.lvui Outline outline) {
        ActionBarContainer actionBarContainer = this.f1194k;
        if (actionBarContainer.f600h) {
            Drawable drawable = actionBarContainer.f604p;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f607y;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
