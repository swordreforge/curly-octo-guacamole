package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.C0683f;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7828g;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<n7h> {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final int f67740ab = 0;
    public static final int bb = 1;
    public static final int bp = 2;
    public static final int bv = 3;

    /* JADX INFO: renamed from: d */
    public static final int f24788d = 0;

    /* JADX INFO: renamed from: v */
    public static final int f24789v = C6095k.n7h.g7;

    /* JADX INFO: renamed from: w */
    public static final int f24790w = 1;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.LinearProgressIndicator$k */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4078k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface toq {
    }

    public LinearProgressIndicator(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: i */
    private void m14688i() {
        setIndeterminateDrawable(C4083p.fu4(getContext(), (n7h) this.f24773k));
        setProgressDrawable(C4080g.wvg(getContext(), (n7h) this.f24773k));
    }

    public int getIndeterminateAnimationType() {
        return ((n7h) this.f24773k).f67744f7l8;
    }

    public int getIndicatorDirection() {
        return ((n7h) this.f24773k).f24823y;
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        S s2 = this.f24773k;
        n7h n7hVar = (n7h) s2;
        boolean z3 = true;
        if (((n7h) s2).f24823y != 1 && ((C0683f.m3159e(this) != 1 || ((n7h) this.f24773k).f24823y != 2) && (C0683f.m3159e(this) != 0 || ((n7h) this.f24773k).f24823y != 3))) {
            z3 = false;
        }
        n7hVar.f24822s = z3;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        int paddingLeft = i2 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i3 - (getPaddingTop() + getPaddingBottom());
        C4083p<n7h> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        C4080g<n7h> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public void setIndeterminateAnimationType(int i2) {
        if (((n7h) this.f24773k).f67744f7l8 == i2) {
            return;
        }
        if (ki() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s2 = this.f24773k;
        ((n7h) s2).f67744f7l8 = i2;
        ((n7h) s2).mo14707n();
        if (i2 == 0) {
            getIndeterminateDrawable().wvg(new x2((n7h) this.f24773k));
        } else {
            getIndeterminateDrawable().wvg(new qrj(getContext(), (n7h) this.f24773k));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@lvui int... iArr) {
        super.setIndicatorColor(iArr);
        ((n7h) this.f24773k).mo14707n();
    }

    public void setIndicatorDirection(int i2) {
        S s2 = this.f24773k;
        ((n7h) s2).f24823y = i2;
        n7h n7hVar = (n7h) s2;
        boolean z2 = true;
        if (i2 != 1 && ((C0683f.m3159e(this) != 1 || ((n7h) this.f24773k).f24823y != 2) && (C0683f.m3159e(this) != 0 || i2 != 3))) {
            z2 = false;
        }
        n7hVar.f24822s = z2;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i2, boolean z2) {
        S s2 = this.f24773k;
        if (s2 != 0 && ((n7h) s2).f67744f7l8 == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i2, z2);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i2) {
        super.setTrackCornerRadius(i2);
        ((n7h) this.f24773k).mo14707n();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
    public n7h mo14685s(@lvui Context context, @lvui AttributeSet attributeSet) {
        return new n7h(context, attributeSet);
    }

    public LinearProgressIndicator(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.mjed);
    }

    public LinearProgressIndicator(@lvui Context context, @dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        super(context, attributeSet, i2, f24789v);
        m14688i();
    }
}
