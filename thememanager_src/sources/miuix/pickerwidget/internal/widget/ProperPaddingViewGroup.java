package miuix.pickerwidget.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import miuix.internal.util.n7h;
import wtop.toq;

/* JADX INFO: loaded from: classes3.dex */
public class ProperPaddingViewGroup extends ViewGroup {

    /* JADX INFO: renamed from: f */
    private static final int f40826f = 290;

    /* JADX INFO: renamed from: l */
    private static final int f40827l = 340;

    /* JADX INFO: renamed from: r */
    private static final int f40828r = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g */
    private final int f40829g;

    /* JADX INFO: renamed from: h */
    private int f40830h;

    /* JADX INFO: renamed from: i */
    private int f40831i;

    /* JADX INFO: renamed from: k */
    private final float f40832k;

    /* JADX INFO: renamed from: n */
    private final int f40833n;

    /* JADX INFO: renamed from: p */
    private int f40834p;

    /* JADX INFO: renamed from: q */
    private boolean f40835q;

    /* JADX INFO: renamed from: s */
    private final int f40836s;

    /* JADX INFO: renamed from: t */
    private View f40837t;

    /* JADX INFO: renamed from: y */
    private final int f40838y;

    /* JADX INFO: renamed from: z */
    private int f40839z;

    public ProperPaddingViewGroup(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) {
            throw new IllegalStateException("Only one child view can be added into the ProperPaddingViewGroup!");
        }
        this.f40837t = getChildAt(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = n7h.x2(this) ? this.f40839z : this.f40831i;
        this.f40837t.layout(i6, 0, this.f40837t.getMeasuredWidth() + i6, this.f40837t.getMeasuredHeight() + 0);
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        float f2 = size;
        float f3 = this.f40832k;
        float f4 = f2 / f3;
        if (this.f40835q) {
            this.f40831i = this.f40834p;
            this.f40839z = this.f40830h;
        } else if (f4 <= 340.0f) {
            int i4 = ((int) (f2 - (f3 * 290.0f))) / 2;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = i4 / 2;
            this.f40831i = this.f40838y + i5;
            this.f40839z = this.f40836s + i5;
        } else {
            this.f40831i = this.f40833n;
            this.f40839z = this.f40829g;
        }
        this.f40837t.measure(ViewGroup.getChildMeasureSpec(i2, this.f40831i + this.f40839z, this.f40837t.getLayoutParams().width), ViewGroup.getChildMeasureSpec(i3, 0, this.f40837t.getLayoutParams().height));
        setMeasuredDimension(size, this.f40837t.getMeasuredHeight());
    }

    public void setFixedContentHorizontalPadding(int i2, int i3) {
        this.f40835q = true;
        int i4 = this.f40834p;
        int i5 = this.f40830h;
        this.f40834p = i2;
        this.f40830h = i3;
        if (i3 == i5 ? i2 != i4 : true) {
            requestLayout();
        }
    }

    public ProperPaddingViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProperPaddingViewGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f40835q = false;
        this.f40834p = Integer.MIN_VALUE;
        this.f40830h = Integer.MIN_VALUE;
        TypedArray typedArrayObtainStyledAttributes = null;
        this.f40837t = null;
        this.f40832k = context.getResources().getDisplayMetrics().density;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.cdj.unv);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.da, 0);
            this.f40833n = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.qu9, dimensionPixelSize);
            this.f40829g = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.z0, dimensionPixelSize);
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.bru, 0);
            this.f40838y = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.iqz, dimensionPixelSize2);
            this.f40836s = typedArrayObtainStyledAttributes.getDimensionPixelSize(toq.cdj.h39, dimensionPixelSize2);
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }
}
