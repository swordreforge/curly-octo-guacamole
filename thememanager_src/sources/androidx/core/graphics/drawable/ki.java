package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: WrappedDrawableState.java */
/* JADX INFO: loaded from: classes.dex */
final class ki extends Drawable.ConstantState {

    /* JADX INFO: renamed from: k */
    int f3548k;

    /* JADX INFO: renamed from: q */
    PorterDuff.Mode f3549q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    Drawable.ConstantState f50448toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    ColorStateList f50449zy;

    ki(@dd ki kiVar) {
        this.f50449zy = null;
        this.f3549q = C0520h.f3541p;
        if (kiVar != null) {
            this.f3548k = kiVar.f3548k;
            this.f50448toq = kiVar.f50448toq;
            this.f50449zy = kiVar.f50449zy;
            this.f3549q = kiVar.f3549q;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.f3548k;
        Drawable.ConstantState constantState = this.f50448toq;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX INFO: renamed from: k */
    boolean m2422k() {
        return this.f50448toq != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @lvui
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @lvui
    public Drawable newDrawable(@dd Resources resources) {
        return new cdj(this, resources);
    }
}
