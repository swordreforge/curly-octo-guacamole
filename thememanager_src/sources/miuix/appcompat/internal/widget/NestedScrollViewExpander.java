package miuix.appcompat.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollViewExpander extends ViewGroup {

    /* JADX INFO: renamed from: k */
    private View f39629k;

    /* JADX INFO: renamed from: q */
    private int f39630q;

    public NestedScrollViewExpander(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = (((((i4 - i2) - measuredWidth) / 2) + i2) + marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
            int i8 = marginLayoutParams.topMargin + i3;
            childAt.layout(i7, i8, measuredWidth + i7, i8 + measuredHeight);
            i3 = i3 + marginLayoutParams.topMargin + measuredHeight + marginLayoutParams.bottomMargin;
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(this.f39630q);
        if (mode == 0) {
            mode = Integer.MIN_VALUE;
        }
        int i4 = mode;
        int size = View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        int measuredHeight = 0;
        int measuredHeight2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && this.f39629k != childAt) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                measureChildWithMargins(childAt, i2, 0, i3, 0);
                measuredHeight2 += childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
        }
        int size2 = View.MeasureSpec.getSize(this.f39630q) - measuredHeight2;
        View view = this.f39629k;
        if (view != null && view.getVisibility() != 8) {
            if (size2 < this.f39629k.getMinimumHeight()) {
                size2 = this.f39629k.getMinimumHeight();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f39629k.getLayoutParams();
            measureChildWithMargins(this.f39629k, i2, 0, View.MeasureSpec.makeMeasureSpec(size2, i4), 0);
            measuredHeight = this.f39629k.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
        }
        setMeasuredDimension(size, measuredHeight + measuredHeight2);
    }

    public void setExpandView(View view) {
        this.f39629k = view;
    }

    void setParentHeightMeasureSpec(int i2) {
        this.f39630q = i2;
    }

    public NestedScrollViewExpander(Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedScrollViewExpander(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
