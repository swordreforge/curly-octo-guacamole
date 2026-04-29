package com.miui.maml.elements;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.elements.GeometryScreenElement;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.folme.AnimatedTarget;
import com.miui.maml.folme.PropertyWrapper;
import com.miui.maml.util.MamlLog;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class RectangleScreenElement extends GeometryScreenElement {
    public static final AnimatedProperty CORNER_RADIUS_X;
    public static final AnimatedProperty CORNER_RADIUS_Y;
    private static final String LOG_TAG = "RectangleScreenElement";
    private static final String PROPERTY_NAME_CORNER_RADIUS_X = "cornerRadiusX";
    private static final String PROPERTY_NAME_CORNER_RADIUS_Y = "cornerRadiusY";
    public static final String TAG_NAME = "Rectangle";
    private float mCornerRadiusX;
    private float mCornerRadiusY;
    private PropertyWrapper mRXProperty;
    private PropertyWrapper mRYProperty;

    static {
        AnimatedProperty animatedProperty = new AnimatedProperty(PROPERTY_NAME_CORNER_RADIUS_X) { // from class: com.miui.maml.elements.RectangleScreenElement.1
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof RectangleScreenElement) {
                    return (float) ((RectangleScreenElement) animatedScreenElement).mRXProperty.getValue();
                }
                return 0.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof RectangleScreenElement) {
                    ((RectangleScreenElement) animatedScreenElement).mRXProperty.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof RectangleScreenElement) {
                    ((RectangleScreenElement) animatedScreenElement).mRXProperty.setVelocity(f2);
                }
            }
        };
        CORNER_RADIUS_X = animatedProperty;
        AnimatedProperty animatedProperty2 = new AnimatedProperty(PROPERTY_NAME_CORNER_RADIUS_Y) { // from class: com.miui.maml.elements.RectangleScreenElement.2
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof RectangleScreenElement) {
                    return (float) ((RectangleScreenElement) animatedScreenElement).mRYProperty.getValue();
                }
                return 0.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof RectangleScreenElement) {
                    ((RectangleScreenElement) animatedScreenElement).mRYProperty.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof RectangleScreenElement) {
                    ((RectangleScreenElement) animatedScreenElement).mRYProperty.setVelocity(f2);
                }
            }
        };
        CORNER_RADIUS_Y = animatedProperty2;
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_CORNER_RADIUS_X, animatedProperty);
        AnimatedTarget.sPropertyMap.put(1004, animatedProperty);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty, 1006);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_CORNER_RADIUS_Y, animatedProperty2);
        AnimatedTarget.sPropertyMap.put(1005, animatedProperty2);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty2, 1007);
    }

    public RectangleScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        resolveCornerRadius(element);
    }

    private void resolveCornerRadius(Element element) {
        Expression[] expressionArrBuildMultiple = Expression.buildMultiple(getVariables(), element.getAttribute("cornerRadiusExp"));
        if (expressionArrBuildMultiple == null) {
            String[] strArrSplit = getAttr(element, "cornerRadius").split(",");
            try {
                if (strArrSplit.length < 1) {
                    return;
                }
                if (strArrSplit.length == 1) {
                    float fScale = scale(Float.parseFloat(strArrSplit[0]));
                    this.mCornerRadiusY = fScale;
                    this.mCornerRadiusX = fScale;
                } else {
                    this.mCornerRadiusX = scale(Float.parseFloat(strArrSplit[0]));
                    this.mCornerRadiusY = scale(Float.parseFloat(strArrSplit[1]));
                }
            } catch (NumberFormatException unused) {
                MamlLog.m17854w(LOG_TAG, "illegal number format of cornerRadius.");
            }
        }
        Expression expression = (expressionArrBuildMultiple == null || expressionArrBuildMultiple.length <= 0) ? null : expressionArrBuildMultiple[0];
        Expression expression2 = (expressionArrBuildMultiple == null || expressionArrBuildMultiple.length <= 1) ? expression : expressionArrBuildMultiple[1];
        this.mRXProperty = new PropertyWrapper(this.mName + ".cornerRadiusX", getVariables(), expression, isInFolmeMode(), descale(this.mCornerRadiusX));
        this.mRYProperty = new PropertyWrapper(this.mName + ".cornerRadiusY", getVariables(), expression2, isInFolmeMode(), descale(this.mCornerRadiusY));
    }

    @Override // com.miui.maml.elements.GeometryScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        this.mCornerRadiusX = scale(this.mRXProperty.getValue());
        this.mCornerRadiusY = scale(this.mRYProperty.getValue());
    }

    @Override // com.miui.maml.elements.GeometryScreenElement, com.miui.maml.elements.AnimatedScreenElement
    protected void initProperties() {
        super.initProperties();
        this.mRXProperty.init();
        this.mRYProperty.init();
    }

    @Override // com.miui.maml.elements.GeometryScreenElement
    protected void onDraw(Canvas canvas, GeometryScreenElement.DrawMode drawMode) {
        float width = getWidth();
        float height = getHeight();
        float left = getLeft(0.0f, width);
        float top = getTop(0.0f, height);
        if (width <= 0.0f) {
            width = 0.0f;
        }
        float f2 = width + left;
        if (height <= 0.0f) {
            height = 0.0f;
        }
        float f3 = height + top;
        if (drawMode == GeometryScreenElement.DrawMode.STROKE_OUTER) {
            float f4 = this.mWeight;
            left -= f4 / 2.0f;
            top -= f4 / 2.0f;
            f2 += f4 / 2.0f;
            f3 += f4 / 2.0f;
        } else if (drawMode == GeometryScreenElement.DrawMode.STROKE_INNER) {
            float f5 = this.mWeight;
            left += f5 / 2.0f;
            top += f5 / 2.0f;
            f2 -= f5 / 2.0f;
            f3 -= f5 / 2.0f;
        }
        float f6 = f2;
        float f7 = f3;
        float f8 = left;
        float f9 = top;
        if (this.mCornerRadiusX <= 0.0f || this.mCornerRadiusY <= 0.0f) {
            canvas.drawRect(f8, f9, f6, f7, ((GeometryScreenElement) this).mPaint);
        } else {
            canvas.drawRoundRect(new RectF(f8, f9, f6, f7), this.mCornerRadiusX, this.mCornerRadiusY, ((GeometryScreenElement) this).mPaint);
        }
    }
}
