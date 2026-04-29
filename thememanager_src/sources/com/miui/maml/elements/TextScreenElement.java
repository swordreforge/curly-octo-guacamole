package com.miui.maml.elements;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.elements.ScreenElement;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.folme.AnimatedTarget;
import com.miui.maml.folme.PropertyWrapper;
import com.miui.maml.util.ColorParser;
import com.miui.maml.util.HideSdkDependencyUtils;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.ReflectionHelper;
import com.miui.maml.util.TextFormatter;
import com.miui.maml.util.Utils;
import java.io.File;
import org.w3c.dom.Element;
import zy.dd;

/* JADX INFO: loaded from: classes3.dex */
public class TextScreenElement extends AnimatedScreenElement {
    private static final String CRLF = "\n";
    private static final int DEFAULT_SIZE = 18;
    private static final String LOG_TAG = "TextScreenElement";
    private static final int MARQUEE_FRAMERATE = 45;
    private static final int PADDING = 50;
    private static final String PROPERTY_NAME_TEXT_COLOR = "textColor";
    private static final String PROPERTY_NAME_TEXT_SHADOW_COLOR = "textShadowColor";
    private static final String PROPERTY_NAME_TEXT_SIZE = "textSize";
    private static final String RAW_CRLF = "\\n";
    public static final String TAG_NAME = "Text";
    public static final AnimatedProperty.AnimatedColorProperty TEXT_COLOR;
    public static final String TEXT_HEIGHT = "text_height";
    public static final AnimatedProperty.AnimatedColorProperty TEXT_SHADOW_COLOR;
    public static final AnimatedProperty TEXT_SIZE;
    public static final String TEXT_WIDTH = "text_width";
    private static final Object mLock = new Object();
    private ColorParser mColorParser;
    private boolean mFontScaleEnabled;
    protected TextFormatter mFormatter;
    private float mLayoutWidth;
    private int mMarqueeGap;
    private float mMarqueePos;
    private int mMarqueeSpeed;
    private boolean mMultiLine;
    private final TextPaint mPaint;
    private long mPreviousTime;
    private String mSetText;
    private ColorParser mShadowColorParser;
    private float mShadowDx;
    private float mShadowDy;
    private float mShadowRadius;
    private boolean mShouldMarquee;
    private float mSpacingAdd;
    private Expression mSpacingAddExp;
    private float mSpacingMult;
    private Expression mSpacingMultExp;
    private String mText;
    private PropertyWrapper mTextColorProperty;

    @dd
    private String mTextFontName;

    @dd
    private IndexedVariable mTextFontVar;
    private float mTextHeight;
    private IndexedVariable mTextHeightVar;
    private StaticLayout mTextLayout;
    private PropertyWrapper mTextShadowColorProperty;
    private float mTextSize;
    private PropertyWrapper mTextSizeProperty;
    private float mTextWidth;
    private IndexedVariable mTextWidthVar;

    /* JADX INFO: renamed from: com.miui.maml.elements.TextScreenElement$4 */
    static /* synthetic */ class C52054 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$elements$ScreenElement$Align;

        static {
            int[] iArr = new int[ScreenElement.Align.values().length];
            $SwitchMap$com$miui$maml$elements$ScreenElement$Align = iArr;
            try {
                iArr[ScreenElement.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$elements$ScreenElement$Align[ScreenElement.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$elements$ScreenElement$Align[ScreenElement.Align.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        AnimatedProperty.AnimatedColorProperty animatedColorProperty = new AnimatedProperty.AnimatedColorProperty(PROPERTY_NAME_TEXT_COLOR) { // from class: com.miui.maml.elements.TextScreenElement.1
            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public int getIntValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    return (int) ((TextScreenElement) animatedScreenElement).mTextColorProperty.getValue();
                }
                return -16777216;
            }

            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public void setIntValue(AnimatedScreenElement animatedScreenElement, int i2) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    ((TextScreenElement) animatedScreenElement).mTextColorProperty.setValue(i2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    ((TextScreenElement) animatedScreenElement).mTextColorProperty.setVelocity(f2);
                }
            }
        };
        TEXT_COLOR = animatedColorProperty;
        AnimatedProperty animatedProperty = new AnimatedProperty(PROPERTY_NAME_TEXT_SIZE) { // from class: com.miui.maml.elements.TextScreenElement.2
            @Override // miuix.animation.property.FloatProperty
            public float getValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    return (float) ((TextScreenElement) animatedScreenElement).mTextSizeProperty.getValue();
                }
                return 18.0f;
            }

            @Override // miuix.animation.property.FloatProperty
            public void setValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    ((TextScreenElement) animatedScreenElement).mTextSizeProperty.setValue(f2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    ((TextScreenElement) animatedScreenElement).mTextSizeProperty.setVelocity(f2);
                }
            }
        };
        TEXT_SIZE = animatedProperty;
        AnimatedProperty.AnimatedColorProperty animatedColorProperty2 = new AnimatedProperty.AnimatedColorProperty(PROPERTY_NAME_TEXT_SHADOW_COLOR) { // from class: com.miui.maml.elements.TextScreenElement.3
            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public int getIntValue(AnimatedScreenElement animatedScreenElement) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    return (int) ((TextScreenElement) animatedScreenElement).mTextShadowColorProperty.getValue();
                }
                return -16777216;
            }

            @Override // miuix.animation.property.ColorProperty, miuix.animation.property.IIntValueProperty
            public void setIntValue(AnimatedScreenElement animatedScreenElement, int i2) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    ((TextScreenElement) animatedScreenElement).mTextShadowColorProperty.setValue(i2);
                }
            }

            @Override // com.miui.maml.folme.IAnimatedProperty
            public void setVelocityValue(AnimatedScreenElement animatedScreenElement, float f2) {
                if (animatedScreenElement instanceof TextScreenElement) {
                    ((TextScreenElement) animatedScreenElement).mTextShadowColorProperty.setVelocity(f2);
                }
            }
        };
        TEXT_SHADOW_COLOR = animatedColorProperty2;
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_TEXT_COLOR, animatedColorProperty);
        AnimatedTarget.sPropertyMap.put(1003, animatedColorProperty);
        AnimatedTarget.sPropertyTypeMap.put(animatedColorProperty, 1003);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_TEXT_SIZE, animatedProperty);
        AnimatedTarget.sPropertyMap.put(1002, animatedProperty);
        AnimatedTarget.sPropertyTypeMap.put(animatedProperty, 1002);
        AnimatedProperty.sPropertyNameMap.put(PROPERTY_NAME_TEXT_SHADOW_COLOR, animatedColorProperty2);
        AnimatedTarget.sPropertyMap.put(1013, animatedColorProperty2);
        AnimatedTarget.sPropertyTypeMap.put(animatedColorProperty2, 1013);
    }

    public TextScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mPaint = new TextPaint();
        this.mMarqueePos = Float.MAX_VALUE;
        this.mTextSize = scale(18.0d);
        this.mTextFontName = null;
        load(element);
    }

    private Layout.Alignment getAlignment() {
        Layout.Alignment alignment;
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
        int i2 = C52054.$SwitchMap$com$miui$maml$elements$ScreenElement$Align[this.mAlign.ordinal()];
        if (i2 == 1) {
            try {
                alignment = (Layout.Alignment) ReflectionHelper.getFieldValue(alignment2.getClass(), alignment2, "ALIGN_LEFT");
            } catch (Exception e2) {
                MamlLog.m17851e(LOG_TAG, "Invoke | getAlignment_ALIGN_LEFT occur EXCEPTION: " + e2.getMessage());
                return alignment2;
            }
        } else {
            if (i2 == 2) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (i2 != 3) {
                return alignment2;
            }
            try {
                alignment = (Layout.Alignment) ReflectionHelper.getFieldValue(alignment2.getClass(), alignment2, "ALIGN_RIGHT");
            } catch (Exception e3) {
                MamlLog.m17851e(LOG_TAG, "Invoke | getAlignment_ALIGN_RIGHT occur EXCEPTION: " + e3.getMessage());
                return alignment2;
            }
        }
        return alignment;
    }

    private float getSpacingAdd() {
        Expression expression = this.mSpacingAddExp;
        return expression != null ? (float) expression.evaluate() : this.mSpacingAdd;
    }

    private float getSpacingMult() {
        Expression expression = this.mSpacingMultExp;
        return expression != null ? (float) expression.evaluate() : this.mSpacingMult;
    }

    private void load(Element element) {
        if (element == null) {
            return;
        }
        Variables variables = getVariables();
        if (this.mHasName) {
            this.mTextWidthVar = new IndexedVariable(this.mName + "." + TEXT_WIDTH, variables, true);
            this.mTextHeightVar = new IndexedVariable(this.mName + "." + TEXT_HEIGHT, variables, true);
        }
        this.mFormatter = TextFormatter.fromElement(variables, element, this.mStyle);
        this.mColorParser = ColorParser.fromElement(variables, element, this.mStyle);
        this.mMarqueeSpeed = getAttrAsInt(element, "marqueeSpeed", 0);
        this.mSpacingMult = getAttrAsFloat(element, "spacingMult", 1.0f);
        this.mSpacingAdd = getAttrAsFloat(element, "spacingAdd", 0.0f);
        this.mSpacingMultExp = Expression.build(variables, getAttr(element, "spacingMultExp"));
        this.mSpacingAddExp = Expression.build(variables, getAttr(element, "spacingAddExp"));
        this.mMarqueeGap = getAttrAsInt(element, "marqueeGap", 2);
        this.mMultiLine = Boolean.parseBoolean(getAttr(element, "multiLine"));
        this.mFontScaleEnabled = Boolean.parseBoolean(getAttr(element, "enableFontScale"));
        Expression expressionBuild = Expression.build(variables, getAttr(element, "size"));
        String attr = getAttr(element, C3678q.f65813eqxt);
        String attr2 = getAttr(element, "fontPath");
        if (!TextUtils.isEmpty(attr)) {
            this.mPaint.setTypeface(Typeface.create(attr, parseFontStyle(getAttr(element, C3678q.f65809d3))));
        } else if (TextUtils.isEmpty(attr2)) {
            this.mPaint.setFakeBoldText(Boolean.parseBoolean(getAttr(element, C3678q.f65821i1)));
            this.mPaint.setTypeface(HideSdkDependencyUtils.TypefaceUtils_replaceTypeface(getContext().mContext, this.mPaint.getTypeface()));
        } else {
            Typeface typefaceCreateFromAsset = null;
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(getContext().mContext.getAssets(), attr2);
            } catch (Exception e2) {
                MamlLog.m17851e(LOG_TAG, "create typeface from asset fail :" + e2);
            }
            if (typefaceCreateFromAsset == null) {
                if (attr2.startsWith("@")) {
                    this.mTextFontVar = new IndexedVariable(attr2.substring(1), variables, false);
                } else {
                    updateTypeface(attr2);
                }
            }
            if (typefaceCreateFromAsset != null) {
                this.mPaint.setTypeface(typefaceCreateFromAsset);
            }
        }
        this.mPaint.setColor(getColor());
        this.mPaint.setTextSize(scale(18.0d));
        this.mPaint.setAntiAlias(true);
        this.mShadowRadius = getAttrAsFloat(element, "shadowRadius", 0.0f);
        this.mShadowDx = getAttrAsFloat(element, "shadowDx", 0.0f);
        this.mShadowDy = getAttrAsFloat(element, "shadowDy", 0.0f);
        this.mShadowColorParser = ColorParser.fromElement(variables, element, "shadowColor", this.mStyle);
        this.mPaint.setShadowLayer(this.mShadowRadius, this.mShadowDx, this.mShadowDy, getShadowColor());
        this.mTextSizeProperty = new PropertyWrapper(this.mName + ".textColor", getVariables(), expressionBuild, isInFolmeMode(), 18.0d);
        this.mTextColorProperty = new PropertyWrapper(this.mName + ".textSize", getVariables(), null, isInFolmeMode(), this.mColorParser.getColor());
        this.mTextShadowColorProperty = new PropertyWrapper(this.mName + ".textShadowColor", getVariables(), null, isInFolmeMode(), this.mShadowColorParser.getColor());
    }

    private static int parseFontStyle(String str) {
        if (!TextUtils.isEmpty(str) && !"normal".equals(str)) {
            if (C3678q.f65821i1.equals(str)) {
                return 1;
            }
            if (C3678q.f65803bf2.equals(str)) {
                return 2;
            }
            if ("bold_italic".equals(str)) {
                return 3;
            }
        }
        return 0;
    }

    private void updateTextFontIfNeed() {
        String string;
        IndexedVariable indexedVariable = this.mTextFontVar;
        if (indexedVariable == null || (string = indexedVariable.getString()) == null || string.length() <= 0 || string.equals(this.mTextFontName)) {
            return;
        }
        updateTypeface(string);
    }

    private void updateTextSize() {
        float fScale = scale(this.mTextSizeProperty.getValue());
        this.mTextSize = fScale;
        if (this.mFontScaleEnabled) {
            this.mTextSize = fScale * this.mRoot.getFontScale();
        }
        this.mPaint.setTextSize(this.mTextSize);
    }

    private void updateTextWidth() {
        this.mTextWidth = 0.0f;
        if (!TextUtils.isEmpty(this.mText)) {
            if (this.mMultiLine) {
                for (String str : this.mText.split(CRLF)) {
                    float fMeasureText = this.mPaint.measureText(str);
                    if (fMeasureText > this.mTextWidth) {
                        this.mTextWidth = fMeasureText;
                    }
                }
            } else {
                this.mTextWidth = this.mPaint.measureText(this.mText);
            }
        }
        if (this.mHasName) {
            this.mTextWidthVar.set(descale(this.mTextWidth));
        }
    }

    private void updateTypeface(String str) {
        this.mTextFontName = str;
        File extraFile = getContext().mResourceManager.getExtraFile(str);
        if (extraFile == null || !extraFile.exists()) {
            return;
        }
        try {
            this.mPaint.setTypeface(Typeface.createFromFile(extraFile));
        } catch (Exception e2) {
            MamlLog.m17851e(LOG_TAG, "int. create typeface from PATH failed. " + e2);
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        float fMin;
        float fMax;
        float fMin2;
        float fMax2;
        if (TextUtils.isEmpty(this.mText)) {
            return;
        }
        this.mPaint.setColor(getColor());
        TextPaint textPaint = this.mPaint;
        textPaint.setAlpha(Utils.mixAlpha(textPaint.getAlpha(), getAlpha()));
        this.mPaint.setShadowLayer(this.mShadowRadius, this.mShadowDx, this.mShadowDy, getShadowColor());
        float width = getWidth();
        boolean z2 = width >= 0.0f;
        if (width < 0.0f || width > this.mTextWidth) {
            width = this.mTextWidth;
        }
        float height = getHeight();
        float textSize = this.mPaint.getTextSize();
        if (height < 0.0f) {
            height = this.mTextHeight;
        }
        float left = getLeft(0.0f, width);
        float top = getTop(0.0f, height);
        canvas.save();
        float f2 = this.mShadowRadius;
        if (f2 != 0.0f) {
            fMin = Math.min(0.0f, this.mShadowDx - f2);
            fMax = Math.max(0.0f, this.mShadowDx + this.mShadowRadius);
            fMin2 = Math.min(0.0f, this.mShadowDy - this.mShadowRadius);
            fMax2 = Math.max(0.0f, this.mShadowDy + this.mShadowRadius);
        } else {
            fMin = 0.0f;
            fMax = 0.0f;
            fMin2 = 0.0f;
            fMax2 = 0.0f;
        }
        canvas.translate(left, top);
        if (z2) {
            fMin = 0.0f;
        }
        if (z2) {
            fMax = 0.0f;
        }
        canvas.clipRect(fMin, fMin2, fMax + width, height + fMax2);
        StaticLayout staticLayout = this.mTextLayout;
        if (staticLayout != null) {
            if (staticLayout.getLineCount() == 1 && this.mShouldMarquee) {
                int lineStart = this.mTextLayout.getLineStart(0);
                int lineEnd = this.mTextLayout.getLineEnd(0);
                int lineTop = this.mTextLayout.getLineTop(0);
                float lineLeft = this.mTextLayout.getLineLeft(0);
                float f3 = textSize + lineTop;
                canvas.drawText(this.mText, lineStart, lineEnd, lineLeft + this.mMarqueePos, f3, (Paint) this.mPaint);
                float f4 = this.mMarqueePos;
                if (f4 != 0.0f) {
                    float f5 = f4 + this.mTextWidth + (this.mTextSize * this.mMarqueeGap);
                    if (f5 < width) {
                        canvas.drawText(this.mText, lineLeft + f5, f3, this.mPaint);
                    }
                }
            } else {
                this.mTextLayout.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        synchronized (mLock) {
            super.doTick(j2);
            if (isVisible()) {
                boolean z2 = false;
                this.mShouldMarquee = false;
                String str = this.mText;
                String text = getText();
                this.mText = text;
                if (TextUtils.isEmpty(text)) {
                    this.mTextLayout = null;
                    updateTextWidth();
                    return;
                }
                float f2 = this.mTextSize;
                updateTextSize();
                updateTextFontIfNeed();
                boolean z3 = (TextUtils.equals(str, this.mText) && f2 == this.mTextSize) ? false : true;
                if (z3) {
                    updateTextWidth();
                }
                float width = getWidth();
                boolean z5 = this.mMultiLine;
                if (!z5 && this.mMarqueeSpeed > 0 && this.mTextWidth > width) {
                    z2 = true;
                }
                if (!z5 || width > this.mTextWidth) {
                    width = this.mTextWidth;
                }
                float spacingMult = getSpacingMult();
                float spacingAdd = getSpacingAdd();
                if (this.mTextLayout == null || z3 || this.mLayoutWidth != width || this.mSpacingMult != spacingMult || this.mSpacingAdd != spacingAdd) {
                    this.mLayoutWidth = width;
                    this.mSpacingMult = spacingMult;
                    this.mSpacingAdd = spacingAdd;
                    StaticLayout staticLayout = new StaticLayout(this.mText, this.mPaint, (int) Math.ceil(this.mLayoutWidth), getAlignment(), this.mSpacingMult, this.mSpacingAdd, false);
                    this.mTextLayout = staticLayout;
                    float lineTop = staticLayout.getLineTop(staticLayout.getLineCount());
                    this.mTextHeight = lineTop;
                    if (this.mHasName) {
                        this.mTextHeightVar.set(descale(lineTop));
                    }
                    this.mMarqueePos = Float.MAX_VALUE;
                }
                if (z2) {
                    float f3 = this.mMarqueePos;
                    if (f3 == Float.MAX_VALUE) {
                        this.mMarqueePos = 50.0f;
                    } else {
                        if (f3 < (-this.mLayoutWidth)) {
                            this.mMarqueePos = 50.0f;
                        }
                        float f4 = this.mMarqueePos - ((((long) this.mMarqueeSpeed) * (j2 - this.mPreviousTime)) / 1000.0f);
                        this.mMarqueePos = f4;
                        float f5 = this.mTextWidth;
                        if (f4 < (-f5)) {
                            this.mMarqueePos = f4 + f5 + (this.mTextSize * this.mMarqueeGap);
                        }
                    }
                    this.mPreviousTime = j2;
                    this.mShouldMarquee = true;
                }
                requestFramerate(this.mShouldMarquee ? 45.0f : 0.0f);
            }
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        this.mText = null;
        this.mSetText = null;
        this.mMarqueePos = Float.MAX_VALUE;
    }

    protected int getColor() {
        return isInFolmeMode() ? (int) this.mTextColorProperty.getValue() : this.mColorParser.getColor();
    }

    protected String getFormat() {
        return this.mFormatter.getFormat();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getHeight() {
        float height = super.getHeight();
        return height <= 0.0f ? this.mTextHeight : height;
    }

    protected int getShadowColor() {
        return isInFolmeMode() ? (int) this.mTextShadowColorProperty.getValue() : this.mShadowColorParser.getColor();
    }

    protected String getText() {
        String str = this.mSetText;
        if (str != null) {
            return str;
        }
        String text = this.mFormatter.getText();
        if (text == null) {
            return text;
        }
        String strReplace = text.replace(RAW_CRLF, CRLF);
        return !this.mMultiLine ? strReplace.replace(CRLF, " ") : strReplace;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getWidth() {
        float width = super.getWidth();
        return width <= 0.0f ? this.mTextWidth : width;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        updateTextFontIfNeed();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void initProperties() {
        super.initProperties();
        this.mTextSizeProperty.init();
        this.mTextColorProperty.init();
        this.mTextShadowColorProperty.init();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onVisibilityChange(boolean z2) {
        super.onVisibilityChange(z2);
        requestFramerate((this.mShouldMarquee && z2) ? 45.0f : 0.0f);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        TextPaint textPaint = this.mPaint;
        if (textPaint != null) {
            textPaint.setColorFilter(colorFilter);
        }
    }

    public void setParams(Object... objArr) {
        this.mFormatter.setParams(objArr);
    }

    public void setText(String str) {
        this.mSetText = str;
    }
}
