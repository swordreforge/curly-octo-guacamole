package miuix.stretchablewidget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class WidgetContainer extends LinearLayout {
    public WidgetContainer(Context context) {
        this(context, null);
    }

    public float getWidgetHeight() {
        return getHeight();
    }

    public void setWidgetHeight(float f2) {
        if (f2 < 0.0f) {
            return;
        }
        getLayoutParams().height = (int) f2;
        requestLayout();
    }

    public WidgetContainer(Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public WidgetContainer(Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
