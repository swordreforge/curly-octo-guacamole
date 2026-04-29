package com.android.thememanager.basemodule.views;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.views.p */
/* JADX INFO: compiled from: RecyclerViewHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C1858p {
    /* JADX INFO: renamed from: k */
    public static void m7344k(Rect outRect, RecyclerView parent, int count, int columnNum, int horizontalSpacing, int verticalSpacing, int firstLineTopPadding, int lastLineBottomPadding, int position, int offset) {
        toq(outRect, parent, count, columnNum, horizontalSpacing, verticalSpacing, 0, firstLineTopPadding, lastLineBottomPadding, position, offset);
    }

    public static void toq(Rect outRect, RecyclerView parent, int count, int columnNum, int horizontalSpacing, int verticalSpacing, int leftAndRightPadding, int firstLineTopPadding, int lastLineBottomPadding, int position, int offset) {
        int i2;
        int measuredWidth = (parent.getMeasuredWidth() - parent.getPaddingStart()) - parent.getPaddingEnd();
        int i3 = measuredWidth - (leftAndRightPadding * 2);
        int i4 = i3 / columnNum;
        int i5 = columnNum - 1;
        int i6 = (i3 - (i5 * horizontalSpacing)) / columnNum;
        int i7 = position - offset;
        int i8 = i7 % columnNum;
        if (i8 < 0) {
            return;
        }
        if (i4 <= 0 || i6 <= 0) {
            leftAndRightPadding = (horizontalSpacing * i8) / columnNum;
            i2 = (horizontalSpacing * ((columnNum - i8) - 1)) / columnNum;
        } else if (i8 == 0) {
            i2 = i4 - i6;
        } else if (i8 == i5) {
            int i9 = i4 - i6;
            i2 = (measuredWidth - (i4 * columnNum)) + leftAndRightPadding;
            leftAndRightPadding = i9;
        } else {
            leftAndRightPadding = (horizontalSpacing * i8) / columnNum;
            i2 = (i4 - i6) - leftAndRightPadding;
        }
        int i10 = i7 / columnNum;
        int i11 = ((count + columnNum) - 1) / columnNum;
        if (i10 != 0) {
            firstLineTopPadding = 0;
        }
        if (i10 >= i11 - 1) {
            verticalSpacing = lastLineBottomPadding;
        }
        if (parent.getLayoutDirection() == 1) {
            outRect.set(i2, firstLineTopPadding, leftAndRightPadding, verticalSpacing);
        } else {
            outRect.set(leftAndRightPadding, firstLineTopPadding, i2, verticalSpacing);
        }
    }
}
