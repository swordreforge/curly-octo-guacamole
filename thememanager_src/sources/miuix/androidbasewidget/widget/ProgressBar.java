package miuix.androidbasewidget.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import kbj.toq;

/* JADX INFO: loaded from: classes3.dex */
public class ProgressBar extends android.widget.ProgressBar {

    /* JADX INFO: renamed from: k */
    private Drawable f38662k;

    public ProgressBar(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    public void m24787k(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.n7h.d7y, i2, toq.qrj.km9o);
        Drawable drawable = this.f38662k;
        if (drawable != null && drawable.getClass().getName().equals("android.graphics.drawable.AnimatedRotateDrawable")) {
            int i3 = typedArrayObtainStyledAttributes.getInt(toq.n7h.ar4, 48);
            Class<?> cls = drawable.getClass();
            Class cls2 = Integer.TYPE;
            miuix.reflect.toq.ld6(drawable, miuix.reflect.toq.m26540s(cls, "setFramesCount", cls2), Integer.valueOf(i3));
            miuix.reflect.toq.ld6(drawable, miuix.reflect.toq.m26540s(cls, "setFramesDuration", cls2), Integer.valueOf(typedArrayObtainStyledAttributes.getInt(toq.n7h.qm8, 25)));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        super.setIndeterminateDrawable(drawable);
        if (this.f38662k != drawable) {
            this.f38662k = drawable;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, toq.zy.vg);
    }

    public ProgressBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        m24787k(context, attributeSet, i2);
    }
}
