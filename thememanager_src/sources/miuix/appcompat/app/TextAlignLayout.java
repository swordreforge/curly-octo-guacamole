package miuix.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public class TextAlignLayout extends LinearLayout {
    public TextAlignLayout(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        boolean z2 = true;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (z2 && (childAt instanceof TextView)) {
                TextView textView = (TextView) childAt;
                z2 = textView.getLineCount() <= 1;
                if (z2) {
                    textView.setGravity(1);
                }
            }
        }
    }

    public TextAlignLayout(Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextAlignLayout(Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public TextAlignLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }
}
