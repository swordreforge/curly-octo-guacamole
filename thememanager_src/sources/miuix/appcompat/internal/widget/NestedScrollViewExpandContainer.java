package miuix.appcompat.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollViewExpandContainer extends NestedScrollView {
    public NestedScrollViewExpandContainer(@lvui Context context) {
        super(context);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        ((NestedScrollViewExpander) view).setParentHeightMeasureSpec(i3);
        view.forceLayout();
        super.measureChild(view, i2, i3);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ((NestedScrollViewExpander) view).setParentHeightMeasureSpec(i4);
        view.forceLayout();
        super.measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public NestedScrollViewExpandContainer(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NestedScrollViewExpandContainer(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
