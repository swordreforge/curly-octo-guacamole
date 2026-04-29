package com.miui.maml.shader;

import android.graphics.RadialGradient;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class RadialGradientElement extends ShaderElement {
    public static final String TAG_NAME = "RadialGradient";
    private float mRx;
    private Expression mRxExp;
    private float mRy;
    private Expression mRyExp;

    public RadialGradientElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mRxExp = Expression.build(getVariables(), element.getAttribute("rX"));
        this.mRyExp = Expression.build(getVariables(), element.getAttribute("rY"));
        this.mGradientStops.update();
    }

    private final float getRx() {
        Expression expression = this.mRxExp;
        return (float) ((expression != null ? expression.evaluate() : 0.0d) * ((double) this.mRoot.getScale()));
    }

    private final float getRy() {
        Expression expression = this.mRyExp;
        return (float) ((expression != null ? expression.evaluate() : 0.0d) * ((double) this.mRoot.getScale()));
    }

    @Override // com.miui.maml.shader.ShaderElement
    public void onGradientStopsChanged() {
        this.mX = 0.0f;
        this.mY = 0.0f;
        this.mRx = 1.0f;
        this.mRy = 1.0f;
        this.mShader = new RadialGradient(0.0f, 0.0f, 1.0f, this.mGradientStops.getColors(), this.mGradientStops.getPositions(), this.mTileMode);
    }

    @Override // com.miui.maml.shader.ShaderElement
    public boolean updateShaderMatrix() {
        float x3 = getX();
        float y3 = getY();
        float rx = getRx();
        float ry = getRy();
        if (x3 == this.mX && y3 == this.mY && rx == this.mRx && ry == this.mRy) {
            return false;
        }
        this.mX = x3;
        this.mY = y3;
        this.mRx = rx;
        this.mRy = ry;
        this.mShaderMatrix.reset();
        this.mShaderMatrix.preTranslate(-x3, -y3);
        this.mShaderMatrix.setScale(rx, ry);
        this.mShaderMatrix.postTranslate(x3, y3);
        return true;
    }
}
