package com.miui.maml.elements;

import android.content.Context;
import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.TextFormatter;
import java.util.TimeZone;
import miuix.pickerwidget.date.C7230k;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class DateTimeScreenElement extends TextScreenElement {
    public static final String TAG_NAME = "DateTime";
    private DateFormatter mDateFormatter;
    private DateFormatter mDescriptionDateFormatter;

    class DateFormatter {
        private C7230k mCalendar;
        private int mCurDay;
        private String mLunarDate;
        private String mOldFormat;
        private long mPreValue;
        private String mText;
        private TextFormatter mTextFormatter;
        private Expression mTimeZoneExp;
        private Expression mValueExp;

        public DateFormatter(DateTimeScreenElement dateTimeScreenElement, TextFormatter textFormatter, Expression expression) {
            this(textFormatter, expression, null);
        }

        public String getText() {
            String format;
            TextFormatter textFormatter = this.mTextFormatter;
            if (textFormatter == null || (format = textFormatter.getFormat()) == null) {
                return "";
            }
            Expression expression = this.mValueExp;
            long jEvaluate = expression != null ? (long) DateTimeScreenElement.this.evaluate(expression) : System.currentTimeMillis();
            if (TextUtils.equals(this.mOldFormat, format) && Math.abs(jEvaluate - this.mPreValue) < 200) {
                return this.mText;
            }
            this.mOldFormat = format;
            this.mCalendar.setTimeInMillis(jEvaluate);
            Expression expression2 = this.mTimeZoneExp;
            if (expression2 != null) {
                String strEvaluateStr = expression2.evaluateStr();
                if (!TextUtils.isEmpty(strEvaluateStr)) {
                    this.mCalendar.setTimeZone(TimeZone.getTimeZone(strEvaluateStr));
                }
            }
            Context context = DateTimeScreenElement.this.getContext().mContext;
            int iIndexOf = format.indexOf("NNNN");
            if (iIndexOf > -1) {
                if (this.mCalendar.get(9) != this.mCurDay) {
                    this.mLunarDate = this.mCalendar.format(context, "N月e");
                    String str = this.mCalendar.format(context, "t");
                    if (str != null) {
                        this.mLunarDate += " " + str;
                    }
                    this.mCurDay = this.mCalendar.get(9);
                    MamlLog.m17853i("DateTimeScreenElement", "get lunar date:" + this.mLunarDate);
                }
                this.mText = (iIndexOf > 0 ? this.mCalendar.format(context, format.substring(0, iIndexOf)) : "") + this.mLunarDate + (format.endsWith("NNNN") ? "" : this.mCalendar.format(context, format.substring(iIndexOf + 4)));
            } else {
                this.mText = this.mCalendar.format(context, format);
            }
            this.mPreValue = jEvaluate;
            return this.mText;
        }

        public void resetCalendar() {
            this.mCalendar = new C7230k();
        }

        public DateFormatter(TextFormatter textFormatter, Expression expression, Expression expression2) {
            this.mCalendar = new C7230k();
            this.mCurDay = -1;
            this.mTextFormatter = textFormatter;
            this.mValueExp = expression;
            this.mTimeZoneExp = expression2;
        }
    }

    public DateTimeScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        Expression expressionBuild = Expression.build(getVariables(), element.getAttribute("value"));
        Expression expressionBuild2 = Expression.build(getVariables(), element.getAttribute("timeZoneId"));
        this.mDateFormatter = new DateFormatter(this.mFormatter, expressionBuild, expressionBuild2);
        if (!TextUtils.isEmpty(element.getAttribute("contentDescriptionFormat"))) {
            this.mHasContentDescription = true;
            this.mDescriptionDateFormatter = new DateFormatter(TextFormatter.fromElement(getVariables(), element, null, "contentDescriptionFormat", null, null, null), expressionBuild, expressionBuild2);
        } else if (!TextUtils.isEmpty(element.getAttribute("contentDescriptionFormatExp"))) {
            this.mHasContentDescription = true;
            this.mDescriptionDateFormatter = new DateFormatter(TextFormatter.fromElement(getVariables(), element, null, null, null, null, "contentDescriptionFormatExp"), expressionBuild, expressionBuild2);
        }
        if (this.mHasContentDescription) {
            this.mRoot.addAccessibleElements(this);
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public String getContentDescription() {
        DateFormatter dateFormatter = this.mDescriptionDateFormatter;
        return dateFormatter != null ? dateFormatter.getText() : super.getContentDescription();
    }

    @Override // com.miui.maml.elements.TextScreenElement
    protected String getText() {
        return this.mDateFormatter.getText();
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void resume() {
        super.resume();
        this.mDateFormatter.resetCalendar();
        DateFormatter dateFormatter = this.mDescriptionDateFormatter;
        if (dateFormatter != null) {
            dateFormatter.resetCalendar();
        }
    }
}
