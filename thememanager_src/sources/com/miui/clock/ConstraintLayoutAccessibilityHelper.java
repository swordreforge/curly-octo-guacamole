package com.miui.clock;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public class ConstraintLayoutAccessibilityHelper extends ConstraintHelper {
    public ConstraintLayoutAccessibilityHelper(Context context) {
        super(context);
        oc();
    }

    private void oc() {
        setImportantForAccessibility(1);
        if (Build.VERSION.SDK_INT >= 28) {
            setScreenReaderFocusable(true);
        } else {
            setFocusable(true);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void gvn7(ConstraintLayout constraintLayout) {
        super.gvn7(constraintLayout);
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2601k;
            if (i2 >= iArr.length) {
                return;
            }
            View viewDd = constraintLayout.dd(iArr[i2]);
            if (viewDd != null) {
                viewDd.setImportantForAccessibility(2);
            }
            i2++;
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        ViewParent parent = getParent();
        if (!(parent instanceof ConstraintLayout)) {
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) parent;
        accessibilityEvent.getText().clear();
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2601k;
            if (i2 >= iArr.length) {
                return;
            }
            View viewDd = constraintLayout.dd(iArr[i2]);
            if (viewDd != null && viewDd.getVisibility() == 0) {
                viewDd.onPopulateAccessibilityEvent(accessibilityEvent);
            }
            i2++;
        }
    }

    public ConstraintLayoutAccessibilityHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        oc();
    }

    public ConstraintLayoutAccessibilityHelper(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        oc();
    }
}
