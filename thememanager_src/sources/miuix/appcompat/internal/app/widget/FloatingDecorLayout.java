package miuix.appcompat.internal.app.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import gb.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingDecorLayout extends FrameLayout {
    public FloatingDecorLayout(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) findViewById(toq.C6054p.f34891e);
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.fitSystemWindows(rect);
        }
        rect.top = 0;
        rect.bottom = 0;
        return super.fitSystemWindows(rect);
    }

    public FloatingDecorLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingDecorLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
