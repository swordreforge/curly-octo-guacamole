package com.miui.maml.elements;

import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.collection.zy;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.animation.AlphaAnimation;
import com.miui.maml.animation.BaseAnimation;
import com.miui.maml.animation.PositionAnimation;
import com.miui.maml.animation.RotationAnimation;
import com.miui.maml.animation.ScaleAnimation;
import com.miui.maml.animation.SizeAnimation;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.folme.AnimatedTarget;
import com.miui.maml.folme.MamlTransitionListener;
import com.miui.maml.folme.PropertyWrapper;
import com.miui.maml.folme.TransitionListenerWrapper;
import com.miui.maml.util.ColorParser;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.controller.AnimState;
import miuix.animation.property.FloatProperty;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AnimatedScreenElement extends ScreenElement {
    public static final String LOG_TAG = "AnimatedScreenElement";
    private static final int S_PAINT_COLOR = -4982518;
    private static final ThreadLocal<Camera> sLocalCamera = new ThreadLocal<>();
    private IndexedVariable mActualXVar;
    private IndexedVariable mActualYVar;
    protected int mAlpha;
    public PropertyWrapper mAlphaProperty;
    private AlphaAnimation mAlphas;
    private AnimatedTarget mAnimTarget;
    protected String mContentDescription;
    protected Expression mContentDescriptionExp;
    private boolean mFolmeMode;
    protected boolean mHasContentDescription;
    public PropertyWrapper mHeightProperty;
    protected boolean mInterceptTouch;
    private boolean mIsHaptic;
    private MamlTransitionListener mListener;
    private TransitionListenerWrapper mListenerWrapper;
    private float mMarginBottom;
    private float mMarginLeft;
    private float mMarginRight;
    private float mMarginTop;
    private Matrix mMatrix;
    private Paint mPaint;
    public PropertyWrapper mPivotXProperty;
    public PropertyWrapper mPivotYProperty;
    public PropertyWrapper mPivotZProperty;
    private PositionAnimation mPositions;
    protected boolean mPressed;
    public PropertyWrapper mRotationProperty;
    public PropertyWrapper mRotationXProperty;
    public PropertyWrapper mRotationYProperty;
    public PropertyWrapper mRotationZProperty;
    private RotationAnimation mRotations;
    private Expression mScaleExpression;
    public PropertyWrapper mScaleXProperty;
    public PropertyWrapper mScaleYProperty;
    private ScaleAnimation mScales;
    private SizeAnimation mSizes;
    protected FunctionElement mTickListener;
    protected boolean mTintChanged;
    protected int mTintColor;
    protected ColorParser mTintColorParser;
    public PropertyWrapper mTintColorProperty;
    protected PorterDuffColorFilter mTintFilter;
    protected PorterDuff.Mode mTintMode;
    protected Expression mTintModeExp;
    public CopyOnWriteArraySet<FloatProperty> mToProperties;
    protected boolean mTouchable;
    private int mVirtualViewId;
    public PropertyWrapper mWidthProperty;
    public PropertyWrapper mXProperty;
    public PropertyWrapper mYProperty;

    public AnimatedScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mToProperties = new CopyOnWriteArraySet<>();
        this.mTintMode = PorterDuff.Mode.SRC_IN;
        this.mTintChanged = true;
        this.mMatrix = new Matrix();
        this.mPaint = new Paint();
        this.mVirtualViewId = Integer.MIN_VALUE;
        this.mListener = new MamlTransitionListener(this);
        load(element);
        if (this.mHasContentDescription) {
            this.mRoot.addAccessibleElements(this);
        }
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(1.0f);
        this.mPaint.setColor(S_PAINT_COLOR);
        this.mListenerWrapper = new TransitionListenerWrapper(this.mListener);
    }

    private Expression createExp(Variables variables, Element element, String str, String str2) {
        Expression expressionBuild = Expression.build(variables, getAttr(element, str));
        return (expressionBuild != null || TextUtils.isEmpty(str2)) ? expressionBuild : Expression.build(variables, getAttr(element, str2));
    }

    private void folmeFromToImpl(final AnimState animState, final AnimState animState2, final AnimConfig animConfig) {
        getContext().getHandler().post(new Runnable() { // from class: com.miui.maml.elements.AnimatedScreenElement.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Folme.useAt(AnimatedScreenElement.this.getAnimTarget()).state().fromTo(animState, animState2, animConfig);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    private void folmeSetToImpl(final AnimState animState) {
        getContext().getHandler().post(new Runnable() { // from class: com.miui.maml.elements.AnimatedScreenElement.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Folme.useAt(AnimatedScreenElement.this.getAnimTarget()).state().setTo(animState);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    private void folmeToImpl(final AnimState animState, final AnimConfig animConfig) {
        getContext().getHandler().post(new Runnable() { // from class: com.miui.maml.elements.AnimatedScreenElement.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Folme.useAt(AnimatedScreenElement.this.getAnimTarget()).state().to(animState, animConfig);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    private void handleCancel() {
        if (this.mTouchable && this.mPressed) {
            this.mPressed = false;
            performAction("cancel");
            onActionCancel();
        }
    }

    private boolean isInMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    private void load(Element element) {
        Expression expression;
        Expression expression2;
        Expression expression3;
        Expression expression4;
        Expression expression5;
        Expression expressionCreateExp;
        Expression expressionCreateExp2;
        Expression expression6;
        Expression expression7;
        Expression expressionCreateExp3;
        Expression expression8;
        Expression expression9;
        Expression expression10;
        Expression expression11;
        Expression expression12;
        boolean z2;
        Variables variables = getVariables();
        if (element != null) {
            this.mScaleExpression = createExp(variables, element, "scale", null);
            Expression expressionCreateExp4 = createExp(variables, element, AnimatedProperty.PROPERTY_NAME_X, "left");
            Expression expressionCreateExp5 = createExp(variables, element, AnimatedProperty.PROPERTY_NAME_Y, "top");
            Expression expressionCreateExp6 = createExp(variables, element, AnimatedProperty.PROPERTY_NAME_W, "width");
            Expression expressionCreateExp7 = createExp(variables, element, AnimatedProperty.PROPERTY_NAME_H, InterfaceC1925p.byf);
            Expression expressionCreateExp8 = createExp(variables, element, "angle", "rotation");
            Expression expressionCreateExp9 = createExp(variables, element, "centerX", "pivotX");
            Expression expressionCreateExp10 = createExp(variables, element, "centerY", "pivotY");
            Expression expressionCreateExp11 = createExp(variables, element, "alpha", null);
            Expression expressionCreateExp12 = createExp(variables, element, "scaleX", null);
            Expression expressionCreateExp13 = createExp(variables, element, "scaleY", null);
            expressionCreateExp = createExp(variables, element, "angleX", "rotationX");
            expressionCreateExp2 = createExp(variables, element, "angleY", "rotationY");
            expression7 = expressionCreateExp13;
            expressionCreateExp3 = createExp(variables, element, "angleZ", "rotationZ");
            Expression expressionCreateExp14 = createExp(variables, element, "centerZ", AnimatedProperty.PROPERTY_NAME_PIVOT_Z);
            if (this.mHasName) {
                StringBuilder sb = new StringBuilder();
                expression12 = expressionCreateExp4;
                sb.append(this.mName);
                sb.append(".");
                expression11 = expressionCreateExp5;
                sb.append(ScreenElement.ACTUAL_X);
                this.mActualXVar = new IndexedVariable(sb.toString(), variables, true);
                z2 = true;
                this.mActualYVar = new IndexedVariable(this.mName + "." + ScreenElement.ACTUAL_Y, variables, true);
            } else {
                expression12 = expressionCreateExp4;
                expression11 = expressionCreateExp5;
                z2 = true;
            }
            this.mTouchable = Boolean.parseBoolean(getAttr(element, "touchable"));
            this.mInterceptTouch = Boolean.parseBoolean(getAttr(element, "interceptTouch"));
            this.mIsHaptic = Boolean.parseBoolean(getAttr(element, "haptic"));
            this.mContentDescription = getAttr(element, "contentDescription");
            this.mContentDescriptionExp = Expression.build(variables, getAttr(element, "contentDescriptionExp"));
            this.mHasContentDescription = (TextUtils.isEmpty(this.mContentDescription) && this.mContentDescriptionExp == null) ? false : z2;
            this.mMarginLeft = Utils.getAttrAsFloat(element, "marginLeft", 0.0f);
            this.mMarginRight = Utils.getAttrAsFloat(element, "marginRight", 0.0f);
            this.mMarginTop = Utils.getAttrAsFloat(element, "marginTop", 0.0f);
            this.mMarginBottom = Utils.getAttrAsFloat(element, "marginBottom", 0.0f);
            String attr = getAttr(element, "tint");
            if (!TextUtils.isEmpty(attr)) {
                this.mTintColorParser = new ColorParser(variables, attr);
            }
            this.mTintModeExp = Expression.build(variables, getAttr(element, "tintmode"));
            ColorParser colorParser = this.mTintColorParser;
            this.mTintColor = colorParser != null ? colorParser.getColor() : 0;
            this.mFolmeMode = Boolean.parseBoolean(getAttr(element, "folmeMode"));
            expression9 = expressionCreateExp10;
            expression6 = expressionCreateExp12;
            expression = expression12;
            expression3 = expressionCreateExp7;
            expression5 = expressionCreateExp11;
            expression10 = expressionCreateExp14;
            expression4 = expressionCreateExp8;
            expression8 = expressionCreateExp9;
            expression2 = expressionCreateExp6;
        } else {
            expression = null;
            expression2 = null;
            expression3 = null;
            expression4 = null;
            expression5 = null;
            expressionCreateExp = null;
            expressionCreateExp2 = null;
            expression6 = null;
            expression7 = null;
            expressionCreateExp3 = null;
            expression8 = null;
            expression9 = null;
            expression10 = null;
            expression11 = null;
        }
        this.mXProperty = new PropertyWrapper(this.mName + ".x", variables, expression, isInFolmeMode(), 0.0d);
        this.mYProperty = new PropertyWrapper(this.mName + ".y", variables, expression11, isInFolmeMode(), 0.0d);
        this.mWidthProperty = new PropertyWrapper(this.mName + ".w", variables, expression2, isInFolmeMode(), -1.0d);
        this.mHeightProperty = new PropertyWrapper(this.mName + ".h", variables, expression3, isInFolmeMode(), -1.0d);
        this.mRotationProperty = new PropertyWrapper(this.mName + ".rotation", variables, expression4, isInFolmeMode(), 0.0d);
        this.mAlphaProperty = new PropertyWrapper(this.mName + ".alpha", variables, expression5, isInFolmeMode(), 255.0d);
        this.mRotationXProperty = new PropertyWrapper(this.mName + ".rotationX", variables, expressionCreateExp, isInFolmeMode(), 0.0d);
        this.mRotationYProperty = new PropertyWrapper(this.mName + ".rotationY", variables, expressionCreateExp2, isInFolmeMode(), 0.0d);
        this.mRotationZProperty = new PropertyWrapper(this.mName + ".rotationZ", variables, expressionCreateExp3, isInFolmeMode(), 0.0d);
        this.mScaleXProperty = new PropertyWrapper(this.mName + ".scaleX", variables, expression6, isInFolmeMode(), 1.0d);
        this.mScaleYProperty = new PropertyWrapper(this.mName + ".scaleY", variables, expression7, isInFolmeMode(), 1.0d);
        this.mTintColorProperty = new PropertyWrapper(this.mName + ".tintColor", variables, null, isInFolmeMode(), this.mTintColor);
        this.mPivotXProperty = new PropertyWrapper(this.mName + ".pivotX", variables, expression8, isInFolmeMode(), 0.0d);
        this.mPivotYProperty = new PropertyWrapper(this.mName + ".pivotY", variables, expression9, isInFolmeMode(), 0.0d);
        this.mPivotZProperty = new PropertyWrapper(this.mName + ".pivotZ", variables, expression10, isInFolmeMode(), 0.0d);
    }

    private void setupToProperties(StateElement stateElement) {
        Iterator<String> it = stateElement.getProperties().iterator();
        while (it.hasNext()) {
            FloatProperty propertyByName = AnimatedProperty.getPropertyByName(it.next());
            if (propertyByName != null) {
                this.mToProperties.add(propertyByName);
            }
        }
    }

    protected void doRenderWithTranslation(Canvas canvas) {
        int iSave = canvas.save();
        this.mMatrix.reset();
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        float rotationZ = getRotationZ();
        if (rotationX != 0.0f || rotationY != 0.0f || rotationZ != 0.0f) {
            ThreadLocal<Camera> threadLocal = sLocalCamera;
            if (threadLocal.get() == null) {
                threadLocal.set(new Camera());
            }
            Camera camera = threadLocal.get();
            camera.save();
            camera.rotate(rotationX, rotationY, rotationZ);
            float pivotZ = getPivotZ();
            if (pivotZ != 0.0f) {
                camera.translate(0.0f, 0.0f, pivotZ);
            }
            camera.getMatrix(this.mMatrix);
            camera.restore();
        }
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.mMatrix.preRotate(rotation);
        }
        float scaleX = getScaleX();
        float scaleY = getScaleY();
        if (scaleX != 1.0f || scaleY != 1.0f) {
            this.mMatrix.preScale(scaleX, scaleY);
        }
        float x3 = getX();
        float y3 = getY();
        float pivotX = getPivotX() - (x3 - getLeft());
        float pivotY = getPivotY() - (y3 - getTop());
        this.mMatrix.preTranslate(-pivotX, -pivotY);
        this.mMatrix.postTranslate(pivotX + x3, pivotY + y3);
        canvas.concat(this.mMatrix);
        doRender(canvas);
        if (this.mRoot.mShowDebugLayout) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                float left = getLeft(0.0f, width);
                float top = getTop(0.0f, height);
                canvas.drawRect(left, top, left + width, top + height, this.mPaint);
            }
        }
        canvas.restoreToCount(iSave);
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        if (this.mHasName) {
            this.mActualXVar.set(descale(getX()));
            this.mActualYVar.set(descale(getY()));
        }
        int iEvaluateAlpha = evaluateAlpha();
        this.mAlpha = iEvaluateAlpha;
        if (iEvaluateAlpha < 0) {
            iEvaluateAlpha = 0;
        }
        this.mAlpha = iEvaluateAlpha;
        this.mTintChanged = false;
        int tintColor = getTintColor();
        if (tintColor != this.mTintColor) {
            this.mTintChanged = true;
            this.mTintColor = tintColor;
        }
        if (this.mTintColor != 0) {
            PorterDuff.Mode porterDuffMode = this.mTintMode;
            Expression expression = this.mTintModeExp;
            if (expression != null) {
                porterDuffMode = Utils.getPorterDuffMode((int) expression.evaluate(), this.mTintMode);
            }
            if (this.mTintMode != porterDuffMode) {
                this.mTintMode = porterDuffMode;
                this.mTintChanged = true;
            }
            if (this.mTintFilter == null) {
                this.mTintChanged = true;
            }
            if (this.mTintChanged) {
                this.mTintFilter = new PorterDuffColorFilter(this.mTintColor, porterDuffMode);
            }
        } else {
            this.mTintFilter = null;
        }
        FunctionElement functionElement = this.mTickListener;
        if (functionElement != null) {
            functionElement.perform();
        }
    }

    protected int evaluateAlpha() {
        int value = (int) this.mAlphaProperty.getValue();
        if (!isInFolmeMode()) {
            AlphaAnimation alphaAnimation = this.mAlphas;
            value = Utils.mixAlpha(value, alphaAnimation != null ? alphaAnimation.getAlpha() : 255);
        }
        ElementGroup elementGroup = this.mParent;
        return (elementGroup == null || (elementGroup instanceof LayerScreenElement)) ? value : ((elementGroup instanceof ElementGroup) && elementGroup.isLayered()) ? value : Utils.mixAlpha(value, this.mParent.getAlpha());
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        getContext().getHandler().removeCallbacksAndMessages(this);
        try {
            if (this.mAnimTarget == null || !getRoot().needFolmeClean()) {
                return;
            }
            Folme.clean(this);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void folmeCancel(Expression[] expressionArr) {
        try {
            if (expressionArr == null) {
                Folme.useAt(getAnimTarget()).state().cancel();
                this.mToProperties.clear();
                return;
            }
            zy zyVar = new zy();
            for (Expression expression : expressionArr) {
                FloatProperty propertyByName = AnimatedProperty.getPropertyByName(expression.evaluateStr());
                if (propertyByName != null) {
                    zyVar.add(propertyByName);
                    this.mToProperties.remove(propertyByName);
                }
            }
            Folme.useAt(getAnimTarget()).state().cancel((FloatProperty[]) zyVar.toArray(new FloatProperty[zyVar.size()]));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void folmeFromTo(String str, String str2, String str3) {
        ScreenElement screenElementFindElement = getRoot().findElement(str);
        ScreenElement screenElementFindElement2 = getRoot().findElement(str2);
        ScreenElement screenElementFindElement3 = getRoot().findElement(str3);
        if (!(screenElementFindElement instanceof StateElement) || !(screenElementFindElement2 instanceof StateElement)) {
            MamlLog.m17854w(LOG_TAG, "folmeFromTo: wrong state name " + str + " " + str2);
            return;
        }
        StateElement stateElement = (StateElement) screenElementFindElement;
        StateElement stateElement2 = (StateElement) screenElementFindElement2;
        ConfigElement configElement = screenElementFindElement3 instanceof ConfigElement ? (ConfigElement) screenElementFindElement3 : null;
        AnimConfig animConfig = configElement != null ? configElement.getAnimConfig(this.mListenerWrapper) : new AnimConfig();
        AnimState animState = stateElement.getAnimState("from");
        AnimState animState2 = stateElement2.getAnimState("to");
        setupToProperties(stateElement2);
        folmeFromToImpl(animState, animState2, animConfig);
    }

    public void folmeSetTo(String str) {
        ScreenElement screenElementFindElement = getRoot().findElement(str);
        if (screenElementFindElement instanceof StateElement) {
            folmeSetToImpl(((StateElement) screenElementFindElement).getAnimState(AnimatedTarget.STATE_TAG_SET_TO));
            return;
        }
        MamlLog.m17854w(LOG_TAG, "folmeSetTo: wrong state name " + str);
    }

    public void folmeTo(String str, String str2) {
        ScreenElement screenElementFindElement = getRoot().findElement(str);
        ScreenElement screenElementFindElement2 = getRoot().findElement(str2);
        if (!(screenElementFindElement instanceof StateElement)) {
            MamlLog.m17854w(LOG_TAG, "folmeTo: wrong state name " + str);
            return;
        }
        StateElement stateElement = (StateElement) screenElementFindElement;
        ConfigElement configElement = screenElementFindElement2 instanceof ConfigElement ? (ConfigElement) screenElementFindElement2 : null;
        AnimConfig animConfig = configElement != null ? configElement.getAnimConfig(this.mListenerWrapper) : new AnimConfig();
        AnimState animState = stateElement.getAnimState("to");
        setupToProperties(stateElement);
        folmeToImpl(animState, animConfig);
    }

    public float getAbsoluteLeft() {
        float left = getLeft();
        ElementGroup elementGroup = this.mParent;
        return left + (elementGroup == null ? 0.0f : elementGroup.getParentLeft());
    }

    public float getAbsoluteTop() {
        float top = getTop();
        ElementGroup elementGroup = this.mParent;
        return top + (elementGroup == null ? 0.0f : elementGroup.getParentTop());
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    protected AnimatedTarget getAnimTarget() {
        if (this.mAnimTarget == null) {
            this.mAnimTarget = (AnimatedTarget) Folme.getTarget(this, AnimatedTarget.sCreator);
        }
        return this.mAnimTarget;
    }

    public String getContentDescription() {
        Expression expression = this.mContentDescriptionExp;
        if (expression == null) {
            return this.mContentDescription;
        }
        String strEvaluateStr = expression.evaluateStr();
        if (strEvaluateStr != null) {
            return strEvaluateStr;
        }
        MamlLog.m17851e(LOG_TAG, "element.getContentDescription() == null " + this.mName);
        return "";
    }

    public float getHeight() {
        return scale(getHeightRaw());
    }

    public float getHeightRaw() {
        SizeAnimation sizeAnimation;
        float value = (float) this.mHeightProperty.getValue();
        return (isInFolmeMode() || (sizeAnimation = this.mSizes) == null) ? value : (float) sizeAnimation.getHeight();
    }

    protected float getLeft() {
        return getLeft(getX(), getWidth());
    }

    public final float getMarginBottom() {
        return scale(this.mMarginBottom);
    }

    public final float getMarginLeft() {
        return scale(this.mMarginLeft);
    }

    public final float getMarginRight() {
        return scale(this.mMarginRight);
    }

    public final float getMarginTop() {
        return scale(this.mMarginTop);
    }

    protected Matrix getMatrix() {
        return this.mMatrix;
    }

    protected float getPivotX() {
        return scale(this.mPivotXProperty.getValue());
    }

    protected float getPivotY() {
        return scale(this.mPivotYProperty.getValue());
    }

    protected float getPivotZ() {
        return scale(this.mPivotZProperty.getValue());
    }

    public float getRotation() {
        RotationAnimation rotationAnimation;
        float value = (float) this.mRotationProperty.getValue();
        return (isInFolmeMode() || (rotationAnimation = this.mRotations) == null) ? value : value + rotationAnimation.getAngle();
    }

    public float getRotationX() {
        return (float) this.mRotationXProperty.getValue();
    }

    public float getRotationY() {
        return (float) this.mRotationYProperty.getValue();
    }

    public float getRotationZ() {
        return (float) this.mRotationZProperty.getValue();
    }

    public float getScaleX() {
        float value = (float) this.mScaleXProperty.getValue();
        if (isInFolmeMode()) {
            return value;
        }
        Expression expression = this.mScaleExpression;
        if (expression != null) {
            value = (float) expression.evaluate();
        }
        ScaleAnimation scaleAnimation = this.mScales;
        return scaleAnimation != null ? (float) (((double) value) * scaleAnimation.getScaleX()) : value;
    }

    public float getScaleY() {
        float value = (float) this.mScaleYProperty.getValue();
        if (isInFolmeMode()) {
            return value;
        }
        Expression expression = this.mScaleExpression;
        if (expression != null) {
            value = (float) expression.evaluate();
        }
        ScaleAnimation scaleAnimation = this.mScales;
        return scaleAnimation != null ? (float) (((double) value) * scaleAnimation.getScaleY()) : value;
    }

    protected int getTintColor() {
        ColorParser colorParser;
        int value = (int) this.mTintColorProperty.getValue();
        return (isInFolmeMode() || (colorParser = this.mTintColorParser) == null) ? value : colorParser.getColor();
    }

    protected float getTop() {
        return getTop(getY(), getHeight());
    }

    public float getWidth() {
        return scale(getWidthRaw());
    }

    public float getWidthRaw() {
        SizeAnimation sizeAnimation;
        float value = (float) this.mWidthProperty.getValue();
        return (isInFolmeMode() || (sizeAnimation = this.mSizes) == null) ? value : (float) sizeAnimation.getWidth();
    }

    protected float getX() {
        PositionAnimation positionAnimation;
        float value = (float) this.mXProperty.getValue();
        if (!isInFolmeMode() && (positionAnimation = this.mPositions) != null) {
            value = (float) (((double) value) + positionAnimation.getX());
        }
        return scale(value);
    }

    protected float getY() {
        PositionAnimation positionAnimation;
        float value = (float) this.mYProperty.getValue();
        if (!isInFolmeMode() && (positionAnimation = this.mPositions) != null) {
            value = (float) (((double) value) + positionAnimation.getY());
        }
        return scale(value);
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        if (isInFolmeMode()) {
            initProperties();
        }
    }

    protected void initProperties() {
        this.mXProperty.init();
        this.mYProperty.init();
        this.mWidthProperty.init();
        this.mHeightProperty.init();
        this.mRotationProperty.init();
        this.mAlphaProperty.init();
        this.mRotationXProperty.init();
        this.mRotationYProperty.init();
        this.mRotationZProperty.init();
        this.mScaleXProperty.init();
        this.mScaleYProperty.init();
        this.mTintColorProperty.init();
        this.mPivotXProperty.init();
        this.mPivotYProperty.init();
        this.mPivotZProperty.init();
    }

    protected boolean isInFolmeMode() {
        return this.mFolmeMode && this.mHasName;
    }

    protected void onActionCancel() {
    }

    protected void onActionDown(float f2, float f3) {
        this.mRoot.onUIInteractive(this, "down");
    }

    protected void onActionMove(float f2, float f3) {
        this.mRoot.onUIInteractive(this, "move");
    }

    protected void onActionUp() {
        this.mRoot.onUIInteractive(this, "up");
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected BaseAnimation onCreateAnimation(String str, Element element) {
        if (AlphaAnimation.TAG_NAME.equals(str)) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(element, this);
            this.mAlphas = alphaAnimation;
            return alphaAnimation;
        }
        if (PositionAnimation.TAG_NAME.equals(str)) {
            PositionAnimation positionAnimation = new PositionAnimation(element, this);
            this.mPositions = positionAnimation;
            return positionAnimation;
        }
        if (RotationAnimation.TAG_NAME.equals(str)) {
            RotationAnimation rotationAnimation = new RotationAnimation(element, this);
            this.mRotations = rotationAnimation;
            return rotationAnimation;
        }
        if (SizeAnimation.TAG_NAME.equals(str)) {
            SizeAnimation sizeAnimation = new SizeAnimation(element, this);
            this.mSizes = sizeAnimation;
            return sizeAnimation;
        }
        if (!ScaleAnimation.TAG_NAME.equals(str)) {
            return super.onCreateAnimation(str, element);
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(element, this);
        this.mScales = scaleAnimation;
        return scaleAnimation;
    }

    @Override // com.miui.maml.elements.ScreenElement
    public boolean onHover(MotionEvent motionEvent) {
        if (!isVisible() || !this.mHasContentDescription) {
            return false;
        }
        String contentDescription = getContentDescription();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean zOnHover = super.onHover(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 9 && touched(x3, y3)) {
                this.mRoot.onHoverChange(this, contentDescription);
                zOnHover = true;
            }
        } else if (touched(x3, y3)) {
            if (this.mRoot.getHoverElement() != this) {
                this.mRoot.onHoverChange(this, contentDescription);
            }
            zOnHover = true;
        }
        if (zOnHover) {
            requestUpdate();
        }
        return zOnHover && this.mInterceptTouch;
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void onSetAnimBefore() {
        this.mAlphas = null;
        this.mPositions = null;
        this.mRotations = null;
        this.mSizes = null;
        this.mScales = null;
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void onSetAnimEnable(BaseAnimation baseAnimation) {
        if (baseAnimation instanceof AlphaAnimation) {
            this.mAlphas = (AlphaAnimation) baseAnimation;
            return;
        }
        if (baseAnimation instanceof PositionAnimation) {
            this.mPositions = (PositionAnimation) baseAnimation;
            return;
        }
        if (baseAnimation instanceof RotationAnimation) {
            this.mRotations = (RotationAnimation) baseAnimation;
        } else if (baseAnimation instanceof SizeAnimation) {
            this.mSizes = (SizeAnimation) baseAnimation;
        } else if (baseAnimation instanceof ScaleAnimation) {
            this.mScales = (ScaleAnimation) baseAnimation;
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public boolean onTouch(MotionEvent motionEvent) {
        if (!isVisible() || !this.mTouchable) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        boolean zOnTouch = super.onTouch(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        handleCancel();
                    }
                } else if (this.mPressed) {
                    zOnTouch = touched(x3, y3);
                    performAction("move");
                    onActionMove(x3, y3);
                }
            } else if (this.mPressed) {
                this.mPressed = false;
                if (touched(x3, y3)) {
                    if (this.mIsHaptic) {
                        this.mRoot.haptic(1);
                    }
                    performAction("up");
                    onActionUp();
                } else {
                    performAction("cancel");
                    onActionCancel();
                }
                zOnTouch = true;
            }
        } else if (touched(x3, y3)) {
            this.mPressed = true;
            if (this.mIsHaptic) {
                this.mRoot.haptic(1);
            }
            performAction("down");
            onActionDown(x3, y3);
            zOnTouch = true;
        }
        if (zOnTouch) {
            requestUpdate();
        }
        return zOnTouch && this.mInterceptTouch;
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void onVisibilityChange(boolean z2) {
        super.onVisibilityChange(z2);
        if (z2) {
            return;
        }
        handleCancel();
        if (this.mVirtualViewId == Integer.MIN_VALUE || getRoot().getMamlAccessHelper() == null || getRoot().getMamlAccessHelper().getFocusedVirtualView() != this.mVirtualViewId) {
            return;
        }
        getRoot().getMamlAccessHelper().performAccessibilityAction(this.mVirtualViewId, 128);
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void pause() {
        super.pause();
        handleCancel();
        try {
            if (this.mAnimTarget == null || this.mToProperties.size() <= 0) {
                return;
            }
            Folme.useAt(this.mAnimTarget).state().end(this.mToProperties.toArray());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void render(Canvas canvas) {
        updateVisibility();
        if (isVisible()) {
            doRenderWithTranslation(canvas);
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public void setHeight(double d2) {
        this.mHeightProperty.setValue(descale(d2));
    }

    public void setOnTickListener(FunctionElement functionElement) {
        this.mTickListener = functionElement;
    }

    public void setVirtualViewId(int i2) {
        this.mVirtualViewId = i2;
    }

    public void setWidth(double d2) {
        this.mWidthProperty.setValue(descale(d2));
    }

    public void setX(double d2) {
        this.mXProperty.setValue(descale(d2));
    }

    public void setY(double d2) {
        this.mYProperty.setValue(descale(d2));
    }

    public boolean touched(float f2, float f3) {
        return touched(f2, f3, true);
    }

    public void unsetOnTickListener() {
        this.mTickListener = null;
    }

    public boolean touched(float f2, float f3, boolean z2) {
        if (z2) {
            ElementGroup elementGroup = this.mParent;
            float parentLeft = elementGroup == null ? 0.0f : elementGroup.getParentLeft();
            ElementGroup elementGroup2 = this.mParent;
            f2 -= parentLeft;
            f3 -= elementGroup2 != null ? elementGroup2.getParentTop() : 0.0f;
        }
        float left = getLeft();
        float top = getTop();
        return f2 >= left && f2 <= left + getWidth() && f3 >= top && f3 <= top + getHeight();
    }
}
