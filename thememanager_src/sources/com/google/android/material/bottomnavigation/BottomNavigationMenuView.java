package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.f7l8;
import androidx.core.view.C0683f;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import ij.C6095k;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class BottomNavigationMenuView extends NavigationBarMenuView {
    private final int as;
    private int[] az;
    private boolean bg;
    private final int bl;
    private final int id;
    private final int in;

    public BottomNavigationMenuView(@lvui Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.id = resources.getDimensionPixelSize(C6095k.g.f78990sok);
        this.in = resources.getDimensionPixelSize(C6095k.g.f78865cfr);
        this.bl = resources.getDimensionPixelSize(C6095k.g.f78913i9jn);
        this.as = resources.getDimensionPixelSize(C6095k.g.f78940ltg8);
        this.az = new int[5];
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @lvui
    protected NavigationBarItemView f7l8(@lvui Context context) {
        return new BottomNavigationItemView(context);
    }

    /* JADX INFO: renamed from: i */
    public boolean m14136i() {
        return this.bg;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int measuredWidth = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0683f.m3159e(this) == 1) {
                    int i9 = i6 - measuredWidth;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i7);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i7);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        f7l8 menu = getMenu();
        int size = View.MeasureSpec.getSize(i2);
        int size2 = menu.gvn7().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i3);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (x2(getLabelVisibilityMode(), size2) && m14136i()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.as;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.bl, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.in * i4), Math.min(iMax, this.bl));
            int i5 = size - iMin;
            int iMin2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.id);
            int i6 = i5 - (i4 * iMin2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    this.az[i7] = i7 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i6 > 0) {
                        int[] iArr = this.az;
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.az[i7] = 0;
                }
                i7++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.bl);
            int i8 = size - (size2 * iMin3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.az;
                    iArr2[i9] = iMin3;
                    if (i8 > 0) {
                        iArr2[i9] = iMin3 + 1;
                        i8--;
                    }
                } else {
                    this.az[i9] = 0;
                }
            }
        }
        int measuredWidth = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.az[i10], 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(measuredWidth, View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), 0), View.resolveSizeAndState(size3, i3, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z2) {
        this.bg = z2;
    }
}
