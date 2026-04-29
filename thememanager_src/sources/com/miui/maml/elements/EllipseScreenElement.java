package com.miui.maml.elements;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.elements.GeometryScreenElement;
import com.miui.maml.elements.ScreenElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class EllipseScreenElement extends GeometryScreenElement {
    public static final String TAG_NAME = "Ellipse";

    public EllipseScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mAlign = ScreenElement.Align.CENTER;
        this.mAlignV = ScreenElement.AlignV.CENTER;
    }

    @Override // com.miui.maml.elements.GeometryScreenElement
    protected void onDraw(Canvas canvas, GeometryScreenElement.DrawMode drawMode) {
        float width = getWidth();
        float height = getHeight();
        if (width < 0.0f || height < 0.0f) {
            return;
        }
        if (drawMode == GeometryScreenElement.DrawMode.STROKE_OUTER) {
            float f2 = this.mWeight;
            width += f2;
            height += f2;
        } else if (drawMode == GeometryScreenElement.DrawMode.STROKE_INNER) {
            float f3 = this.mWeight;
            width -= f3;
            height -= f3;
            if (width < 0.0f || height < 0.0f) {
                return;
            }
        }
        float f4 = 0.0f - (width / 2.0f);
        float f5 = 0.0f - (height / 2.0f);
        canvas.drawOval(new RectF(f4, f5, width + f4, height + f5), ((GeometryScreenElement) this).mPaint);
    }
}
