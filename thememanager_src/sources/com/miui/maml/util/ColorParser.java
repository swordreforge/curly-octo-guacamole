package com.miui.maml.util;

import android.graphics.Color;
import com.miui.maml.StylesManager;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class ColorParser {
    private static final int DEFAULT_COLOR = -16777216;
    private static final String LOG_TAG = "ColorParser";
    private int mColor;
    private String mColorExpression;
    private String mCurColorString;
    private IndexedVariable mIndexedColorVar;
    private Expression[] mRGBExpression;
    private ExpressionType mType;

    /* JADX INFO: renamed from: com.miui.maml.util.ColorParser$1 */
    static /* synthetic */ class C52541 {
        static final /* synthetic */ int[] $SwitchMap$com$miui$maml$util$ColorParser$ExpressionType;

        static {
            int[] iArr = new int[ExpressionType.values().length];
            $SwitchMap$com$miui$maml$util$ColorParser$ExpressionType = iArr;
            try {
                iArr[ExpressionType.CONST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$miui$maml$util$ColorParser$ExpressionType[ExpressionType.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$miui$maml$util$ColorParser$ExpressionType[ExpressionType.ARGB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum ExpressionType {
        CONST,
        VARIABLE,
        ARGB,
        INVALID
    }

    public ColorParser(Variables variables, String str) {
        this.mColor = -16777216;
        String strTrim = str.trim();
        this.mColorExpression = strTrim;
        if (strTrim.startsWith("#")) {
            this.mType = ExpressionType.CONST;
            try {
                this.mColor = Color.parseColor(this.mColorExpression);
                return;
            } catch (IllegalArgumentException unused) {
                this.mColor = -16777216;
                return;
            }
        }
        if (this.mColorExpression.startsWith("@")) {
            this.mType = ExpressionType.VARIABLE;
            this.mIndexedColorVar = new IndexedVariable(this.mColorExpression.substring(1), variables, false);
            return;
        }
        if (!this.mColorExpression.startsWith("argb(") || !this.mColorExpression.endsWith(")")) {
            this.mType = ExpressionType.INVALID;
            return;
        }
        this.mType = ExpressionType.ARGB;
        String str2 = this.mColorExpression;
        Expression[] expressionArrBuildMultiple = Expression.buildMultiple(variables, str2.substring(5, str2.length() - 1));
        this.mRGBExpression = expressionArrBuildMultiple;
        if (expressionArrBuildMultiple == null || expressionArrBuildMultiple.length == 4) {
            return;
        }
        MamlLog.m17851e(LOG_TAG, "bad expression format");
        throw new IllegalArgumentException("bad expression format.");
    }

    public static ColorParser fromElement(Variables variables, Element element) {
        return new ColorParser(variables, element.getAttribute("color"));
    }

    public int getColor() {
        int i2 = C52541.$SwitchMap$com$miui$maml$util$ColorParser$ExpressionType[this.mType.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                String string = this.mIndexedColorVar.getString();
                if (!Utils.equals(string, this.mCurColorString)) {
                    this.mColor = Utils.isEmpty(string) ? -16777216 : Color.parseColor(string);
                    this.mCurColorString = string;
                }
            } else if (i2 != 3) {
                this.mColor = -16777216;
            } else {
                this.mColor = Color.argb((int) this.mRGBExpression[0].evaluate(), (int) this.mRGBExpression[1].evaluate(), (int) this.mRGBExpression[2].evaluate(), (int) this.mRGBExpression[3].evaluate());
            }
        }
        return this.mColor;
    }

    public static ColorParser fromElement(Variables variables, Element element, StylesManager.Style style) {
        return new ColorParser(variables, StyleHelper.getAttr(element, "color", style));
    }

    public static ColorParser fromElement(Variables variables, Element element, String str, StylesManager.Style style) {
        return new ColorParser(variables, StyleHelper.getAttr(element, str, style));
    }
}
