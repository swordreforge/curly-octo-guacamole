package com.miui.maml.shader;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.data.Variables;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.util.ColorParser;
import com.miui.maml.util.MamlLog;
import java.util.ArrayList;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ShaderElement {
    private static final String LOG_TAG = "ShaderElement";
    protected ScreenElementRoot mRoot;
    protected Shader mShader;
    protected Shader.TileMode mTileMode;
    protected float mX;
    protected Expression mXExp;
    protected float mY;
    protected Expression mYExp;
    protected Matrix mShaderMatrix = new Matrix();
    protected GradientStops mGradientStops = new GradientStops();

    protected final class GradientStop {
        public static final String TAG_NAME = "GradientStop";
        private ColorParser mColorParser;
        private Expression mPositionExp;

        public GradientStop(Element element, ScreenElementRoot screenElementRoot) {
            this.mColorParser = ColorParser.fromElement(ShaderElement.this.mRoot.getVariables(), element);
            Expression expressionBuild = Expression.build(ShaderElement.this.mRoot.getVariables(), element.getAttribute("position"));
            this.mPositionExp = expressionBuild;
            if (expressionBuild == null) {
                MamlLog.m17851e(TAG_NAME, "lost position attribute.");
            }
        }

        public int getColor() {
            return this.mColorParser.getColor();
        }

        public float getPosition() {
            return (float) this.mPositionExp.evaluate();
        }
    }

    protected final class GradientStops {
        private int[] mColors;
        protected ArrayList<GradientStop> mGradientStopArr = new ArrayList<>();
        private float[] mPositions;

        protected GradientStops() {
        }

        public void add(GradientStop gradientStop) {
            this.mGradientStopArr.add(gradientStop);
        }

        public int[] getColors() {
            return this.mColors;
        }

        public float[] getPositions() {
            return this.mPositions;
        }

        public void init() {
            this.mColors = new int[size()];
            this.mPositions = new float[size()];
        }

        public int size() {
            return this.mGradientStopArr.size();
        }

        public void update() {
            boolean z2 = false;
            for (int i2 = 0; i2 < size(); i2++) {
                int color = this.mGradientStopArr.get(i2).getColor();
                int[] iArr = this.mColors;
                if (color != iArr[i2]) {
                    z2 = true;
                }
                iArr[i2] = color;
                float position = this.mGradientStopArr.get(i2).getPosition();
                float[] fArr = this.mPositions;
                if (position != fArr[i2]) {
                    z2 = true;
                }
                fArr[i2] = position;
            }
            if (z2) {
                ShaderElement.this.onGradientStopsChanged();
            }
        }
    }

    public ShaderElement(Element element, ScreenElementRoot screenElementRoot) {
        this.mRoot = screenElementRoot;
        Variables variables = getVariables();
        this.mXExp = Expression.build(variables, element.getAttribute(AnimatedProperty.PROPERTY_NAME_X));
        this.mYExp = Expression.build(variables, element.getAttribute(AnimatedProperty.PROPERTY_NAME_Y));
        this.mTileMode = getTileMode(element.getAttribute("tile"));
        if (element.getTagName().equalsIgnoreCase(BitmapShaderElement.TAG_NAME)) {
            return;
        }
        loadGradientStops(element, screenElementRoot);
    }

    public static Shader.TileMode getTileMode(String str) {
        return TextUtils.isEmpty(str) ? Shader.TileMode.CLAMP : str.equalsIgnoreCase("mirror") ? Shader.TileMode.MIRROR : str.equalsIgnoreCase("repeat") ? Shader.TileMode.REPEAT : Shader.TileMode.CLAMP;
    }

    private void loadGradientStops(Element element, ScreenElementRoot screenElementRoot) {
        NodeList elementsByTagName = element.getElementsByTagName(GradientStop.TAG_NAME);
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            this.mGradientStops.add(new GradientStop((Element) elementsByTagName.item(i2), screenElementRoot));
        }
        if (this.mGradientStops.size() <= 0) {
            MamlLog.m17851e(LOG_TAG, "lost gradient stop.");
        } else {
            this.mGradientStops.init();
        }
    }

    public Shader getShader() {
        return this.mShader;
    }

    protected Variables getVariables() {
        return this.mRoot.getVariables();
    }

    public float getX() {
        Expression expression = this.mXExp;
        return (float) ((expression != null ? expression.evaluate() : 0.0d) * ((double) this.mRoot.getScale()));
    }

    public float getY() {
        Expression expression = this.mYExp;
        return (float) ((expression != null ? expression.evaluate() : 0.0d) * ((double) this.mRoot.getScale()));
    }

    public abstract void onGradientStopsChanged();

    public void updateShader() {
        this.mGradientStops.update();
        if (updateShaderMatrix()) {
            this.mShader.setLocalMatrix(this.mShaderMatrix);
        }
    }

    public abstract boolean updateShaderMatrix();
}
