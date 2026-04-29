package com.miui.maml.elements;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.data.Variables;
import com.miui.maml.elements.GeometryScreenElement;
import com.miui.maml.elements.ScreenElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class ArcScreenElement extends GeometryScreenElement {
    public static final String TAG_NAME = "Arc";
    private float mAngle;
    private Expression mAngleExp;
    private Path mArcPath;
    private boolean mClose;
    RectF mOvalRect;
    private float mSweep;
    private Expression mSweepExp;

    public ArcScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mArcPath = new Path();
        this.mOvalRect = new RectF();
        Variables variables = screenElementRoot.getVariables();
        this.mAngleExp = Expression.build(variables, getAttr(element, "startAngle"));
        this.mSweepExp = Expression.build(variables, getAttr(element, "sweep"));
        this.mClose = Boolean.parseBoolean(getAttr(element, "close"));
        this.mAlign = ScreenElement.Align.CENTER;
        this.mAlignV = ScreenElement.AlignV.CENTER;
    }

    @Override // com.miui.maml.elements.GeometryScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        if (isVisible()) {
            this.mRoot.getVariables();
            this.mAngle = (float) this.mAngleExp.evaluate();
            this.mSweep = (float) this.mSweepExp.evaluate();
        }
    }

    @Override // com.miui.maml.elements.GeometryScreenElement
    protected void onDraw(Canvas canvas, GeometryScreenElement.DrawMode drawMode) {
        float width = getWidth();
        float height = getHeight();
        float f2 = 0.0f - (width / 2.0f);
        float f3 = 0.0f - (height / 2.0f);
        this.mArcPath.reset();
        RectF rectF = this.mOvalRect;
        rectF.left = f2;
        rectF.top = f3;
        rectF.right = f2 + width;
        rectF.bottom = f3 + height;
        if (Math.abs(this.mSweep) >= 360.0f) {
            canvas.drawOval(this.mOvalRect, ((GeometryScreenElement) this).mPaint);
            return;
        }
        if (this.mClose) {
            this.mArcPath.moveTo(this.mOvalRect.centerX(), this.mOvalRect.centerY());
        }
        this.mArcPath.arcTo(this.mOvalRect, this.mAngle, this.mSweep, !this.mClose);
        if (this.mClose) {
            this.mArcPath.close();
        }
        canvas.drawPath(this.mArcPath, ((GeometryScreenElement) this).mPaint);
    }
}
