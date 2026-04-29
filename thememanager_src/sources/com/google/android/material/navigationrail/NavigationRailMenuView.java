package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import zy.InterfaceC7833l;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class NavigationRailMenuView extends NavigationBarMenuView {

    @InterfaceC7833l
    private int id;
    private final FrameLayout.LayoutParams in;

    public NavigationRailMenuView(@lvui Context context) {
        super(context);
        this.id = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.in = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    private int fn3e(int i2, int i3, int i4) {
        int iMax = i3 / Math.max(1, i4);
        int size = this.id;
        if (size == -1) {
            size = View.MeasureSpec.getSize(i2);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
    }

    private int fu4(int i2, int i3, int i4) {
        int iZurt;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            iZurt = zurt(childAt, i2, fn3e(i2, i3, i4));
            i3 -= iZurt;
            i4--;
        } else {
            iZurt = 0;
        }
        return iZurt + ni7(i2, i3, i4, childAt);
    }

    private int ni7(int i2, int i3, int i4, View view) {
        fn3e(i2, i3, i4);
        int iFn3e = view == null ? fn3e(i2, i3, i4) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int iZurt = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt != view) {
                iZurt += zurt(childAt, i2, iFn3e);
            }
        }
        return iZurt;
    }

    private int zurt(View view, int i2, int i3) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i2, i3);
        return view.getMeasuredHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    @lvui
    protected NavigationBarItemView f7l8(@lvui Context context) {
        return new C4072k(context);
    }

    @InterfaceC7833l
    public int getItemMinimumHeight() {
        return this.id;
    }

    int getMenuGravity() {
        return this.in.gravity;
    }

    /* JADX INFO: renamed from: i */
    boolean m14675i() {
        return (this.in.gravity & 112) == 48;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                childAt.layout(0, i7, i6, measuredHeight);
                i7 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = getMenu().gvn7().size();
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i2), i2, 0), View.resolveSizeAndState((size2 <= 1 || !x2(getLabelVisibilityMode(), size2)) ? ni7(i2, size, size2, null) : fu4(i2, size, size2), i3, 0));
    }

    public void setItemMinimumHeight(@InterfaceC7833l int i2) {
        if (this.id != i2) {
            this.id = i2;
            requestLayout();
        }
    }

    void setMenuGravity(int i2) {
        FrameLayout.LayoutParams layoutParams = this.in;
        if (layoutParams.gravity != i2) {
            layoutParams.gravity = i2;
            setLayoutParams(layoutParams);
        }
    }
}
