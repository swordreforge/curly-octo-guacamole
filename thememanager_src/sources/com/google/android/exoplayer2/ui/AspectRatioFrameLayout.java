package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.ui.C3748h;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static final int f22358h = 3;

    /* JADX INFO: renamed from: i */
    public static final int f22359i = 4;

    /* JADX INFO: renamed from: p */
    public static final int f22360p = 2;

    /* JADX INFO: renamed from: s */
    public static final int f22361s = 1;

    /* JADX INFO: renamed from: y */
    public static final int f22362y = 0;

    /* JADX INFO: renamed from: z */
    private static final float f22363z = 0.01f;

    /* JADX INFO: renamed from: g */
    private int f22364g;

    /* JADX INFO: renamed from: k */
    private final zy f22365k;

    /* JADX INFO: renamed from: n */
    private float f22366n;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private toq f22367q;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$q */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3720q {
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m13160k(float f2, float f3, boolean z2);
    }

    private final class zy implements Runnable {

        /* JADX INFO: renamed from: g */
        private boolean f22368g;

        /* JADX INFO: renamed from: k */
        private float f22369k;

        /* JADX INFO: renamed from: n */
        private boolean f22370n;

        /* JADX INFO: renamed from: q */
        private float f22371q;

        private zy() {
        }

        /* JADX INFO: renamed from: k */
        public void m13161k(float f2, float f3, boolean z2) {
            this.f22369k = f2;
            this.f22371q = f3;
            this.f22370n = z2;
            if (this.f22368g) {
                return;
            }
            this.f22368g = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f22368g = false;
            if (AspectRatioFrameLayout.this.f22367q == null) {
                return;
            }
            AspectRatioFrameLayout.this.f22367q.m13160k(this.f22369k, this.f22371q, this.f22370n);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f22364g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        float f2;
        float f3;
        super.onMeasure(i2, i3);
        if (this.f22366n <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = f4 / f5;
        float f7 = (this.f22366n / f6) - 1.0f;
        if (Math.abs(f7) <= f22363z) {
            this.f22365k.m13161k(this.f22366n, f6, false);
            return;
        }
        int i4 = this.f22364g;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    f2 = this.f22366n;
                } else if (i4 == 4) {
                    if (f7 > 0.0f) {
                        f2 = this.f22366n;
                    } else {
                        f3 = this.f22366n;
                    }
                }
                measuredWidth = (int) (f5 * f2);
            } else {
                f3 = this.f22366n;
            }
            measuredHeight = (int) (f4 / f3);
        } else if (f7 > 0.0f) {
            f3 = this.f22366n;
            measuredHeight = (int) (f4 / f3);
        } else {
            f2 = this.f22366n;
            measuredWidth = (int) (f5 * f2);
        }
        this.f22365k.m13161k(this.f22366n, f6, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f2) {
        if (this.f22366n != f2) {
            this.f22366n = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@zy.dd toq toqVar) {
        this.f22367q = toqVar;
    }

    public void setResizeMode(int i2) {
        if (this.f22364g != i2) {
            this.f22364g = i2;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22364g = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3748h.qrj.f22715k, 0, 0);
            try {
                this.f22364g = typedArrayObtainStyledAttributes.getInt(C3748h.qrj.f66506toq, 0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f22365k = new zy();
    }
}
