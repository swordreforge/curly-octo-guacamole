package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0394g;

/* JADX INFO: loaded from: classes.dex */
public class MotionTelltales extends MockView {

    /* JADX INFO: renamed from: m */
    private static final String f2581m = "MotionTelltales";

    /* JADX INFO: renamed from: c */
    Matrix f2582c;

    /* JADX INFO: renamed from: e */
    int f2583e;

    /* JADX INFO: renamed from: f */
    float[] f2584f;

    /* JADX INFO: renamed from: j */
    int f2585j;

    /* JADX INFO: renamed from: l */
    MotionLayout f2586l;

    /* JADX INFO: renamed from: o */
    float f2587o;

    /* JADX INFO: renamed from: r */
    private Paint f2588r;

    public MotionTelltales(Context context) {
        super(context);
        this.f2588r = new Paint();
        this.f2584f = new float[2];
        this.f2582c = new Matrix();
        this.f2583e = 0;
        this.f2585j = -65281;
        this.f2587o = 0.25f;
        m1617k(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m1617k(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.ax0p);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.c8) {
                    this.f2585j = typedArrayObtainStyledAttributes.getColor(index, this.f2585j);
                } else if (index == C0394g.qrj.nvn) {
                    this.f2583e = typedArrayObtainStyledAttributes.getInt(index, this.f2583e);
                } else if (index == C0394g.qrj.lptj) {
                    this.f2587o = typedArrayObtainStyledAttributes.getFloat(index, this.f2587o);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f2588r.setColor(this.f2585j);
        this.f2588r.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f2582c);
        if (this.f2586l == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f2586l = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i2 = 0; i2 < 5; i2++) {
            float f2 = fArr[i2];
            for (int i3 = 0; i3 < 5; i3++) {
                float f3 = fArr[i3];
                this.f2586l.z4(this, f3, f2, this.f2584f, this.f2583e);
                this.f2582c.mapVectors(this.f2584f);
                float f4 = width * f3;
                float f5 = height * f2;
                float[] fArr2 = this.f2584f;
                float f6 = fArr2[0];
                float f7 = this.f2587o;
                float f8 = f5 - (fArr2[1] * f7);
                this.f2582c.mapVectors(fArr2);
                canvas.drawLine(f4, f5, f4 - (f6 * f7), f8, this.f2588r);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        postInvalidate();
    }

    public void setText(CharSequence text) {
        this.f2542s = text.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2588r = new Paint();
        this.f2584f = new float[2];
        this.f2582c = new Matrix();
        this.f2583e = 0;
        this.f2585j = -65281;
        this.f2587o = 0.25f;
        m1617k(context, attrs);
    }

    public MotionTelltales(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2588r = new Paint();
        this.f2584f = new float[2];
        this.f2582c = new Matrix();
        this.f2583e = 0;
        this.f2585j = -65281;
        this.f2587o = 0.25f;
        m1617k(context, attrs);
    }
}
