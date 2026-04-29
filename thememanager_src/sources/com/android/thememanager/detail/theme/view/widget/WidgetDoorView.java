package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.android.thememanager.R;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetDoorView extends ConstraintLayout {
    private float as;
    private Paint az;
    private int bg;
    private float bl;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.WidgetDoorView$k */
    class C1995k extends ViewOutlineProvider {
        C1995k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), WidgetDoorView.this.bl);
        }
    }

    public WidgetDoorView(@lvui Context context) {
        this(context, null);
    }

    private void ek5k() {
        if (this.as <= 0.0f || this.bg == 0) {
            return;
        }
        Paint paint = new Paint();
        this.az = paint;
        paint.setAntiAlias(true);
        this.az.setDither(true);
        this.az.setStyle(Paint.Style.STROKE);
        this.az.setStrokeWidth(this.as);
        this.az.setColor(this.bg);
    }

    /* JADX INFO: renamed from: j */
    private void m7810j(Canvas canvas) {
        if (this.az == null) {
            return;
        }
        int width = canvas.getWidth();
        float height = canvas.getHeight();
        float f2 = this.bl;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f2, f2, this.az);
    }

    /* JADX INFO: renamed from: m */
    private void m7811m() {
        if (this.bl > 0.0f) {
            setOutlineProvider(new C1995k());
            setClipToOutline(true);
        }
    }

    /* JADX INFO: renamed from: o */
    private void m7812o(Context context) {
        this.bl = context.getResources().getDimension(R.dimen.de_widget_door_back_radius);
        this.as = context.getResources().getDimension(R.dimen.de_icon_count_compound_drawable_padding);
        this.bg = context.getResources().getColor(R.color.de_widget_stroke_color);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        m7810j(canvas);
    }

    public WidgetDoorView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public WidgetDoorView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        m7812o(context);
        m7811m();
        ek5k();
    }
}
