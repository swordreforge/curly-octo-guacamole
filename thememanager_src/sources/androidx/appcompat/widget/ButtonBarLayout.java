package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.C0683f;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: g */
    private static final int f791g = 16;

    /* JADX INFO: renamed from: k */
    private boolean f792k;

    /* JADX INFO: renamed from: n */
    private int f793n;

    /* JADX INFO: renamed from: q */
    private boolean f794q;

    public ButtonBarLayout(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f793n = -1;
        int[] iArr = C7397k.qrj.ap23;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C0683f.ij(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f792k = typedArrayObtainStyledAttributes.getBoolean(C7397k.qrj.ip, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f792k);
        }
    }

    /* JADX INFO: renamed from: k */
    private int m460k(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private void setStacked(boolean z2) {
        if (this.f794q != z2) {
            if (!z2 || this.f792k) {
                this.f794q = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? androidx.core.view.qrj.f50866zy : 80);
                View viewFindViewById = findViewById(C7397k.f7l8.f42319b);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    private boolean toq() {
        return this.f794q;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (this.f792k) {
            if (size > this.f793n && toq()) {
                setStacked(false);
            }
            this.f793n = size;
        }
        if (toq() || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f792k && !toq()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int iM460k = m460k(0);
        if (iM460k >= 0) {
            View childAt = getChildAt(iM460k);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (toq()) {
                int iM460k2 = m460k(iM460k + 1);
                if (iM460k2 >= 0) {
                    paddingTop += getChildAt(iM460k2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (C0683f.m3167m(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f792k != z2) {
            this.f792k = z2;
            if (!z2 && toq()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
