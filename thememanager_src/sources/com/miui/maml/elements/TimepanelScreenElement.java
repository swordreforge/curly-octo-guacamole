package com.miui.maml.elements;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.TimeZone;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class TimepanelScreenElement extends ImageScreenElement {
    private static final String LOG_TAG = "TimepanelScreenElement";
    private static final String M12 = "hh:mm";
    private static final String M24 = "kk:mm";
    public static final String TAG_NAME = "Time";
    private int mBmpHeight;
    private int mBmpWidth;
    protected Calendar mCalendar;
    private Configuration mConfiguration;
    private boolean mForceUpdate;
    private String mFormat;
    private Expression mFormatExp;
    private String mFormatRaw;
    private boolean mLoadResourceFailed;
    private char mLocalizedZero;
    private String mOldFormat;
    private String mOldSrc;
    private long mPreMinute;
    private CharSequence mPreTime;
    private int mSpace;
    private Expression mTimeZoneExp;
    private Runnable mUpdateTimeRunnable;

    public TimepanelScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mCalendar = Calendar.getInstance();
        this.mLocalizedZero = DecimalFormatSymbols.getInstance().getZeroDigit();
        this.mUpdateTimeRunnable = new Runnable() { // from class: com.miui.maml.elements.TimepanelScreenElement.1
            @Override // java.lang.Runnable
            public void run() {
                Bitmap bitmap;
                if (TimepanelScreenElement.this.mLoadResourceFailed || (bitmap = TimepanelScreenElement.this.mBitmap.getBitmap()) == null) {
                    return;
                }
                TimepanelScreenElement.this.mCalendar.setTimeInMillis(System.currentTimeMillis());
                if (TimepanelScreenElement.this.mTimeZoneExp != null) {
                    String strEvaluateStr = TimepanelScreenElement.this.mTimeZoneExp.evaluateStr();
                    if (!TextUtils.isEmpty(strEvaluateStr)) {
                        TimepanelScreenElement.this.mCalendar.setTimeZone(TimeZone.getTimeZone(strEvaluateStr));
                    }
                }
                CharSequence charSequence = DateFormat.format(TimepanelScreenElement.this.getFormat(), TimepanelScreenElement.this.mCalendar);
                if (TimepanelScreenElement.this.mForceUpdate || !charSequence.equals(TimepanelScreenElement.this.mPreTime)) {
                    TimepanelScreenElement.this.mPreTime = charSequence;
                    Canvas canvas = new Canvas(bitmap);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    int width = 0;
                    for (int i2 = 0; i2 < charSequence.length(); i2++) {
                        Bitmap digitBmp = TimepanelScreenElement.this.getDigitBmp(charSequence.charAt(i2));
                        if (digitBmp != null) {
                            canvas.drawBitmap(digitBmp, width, 0.0f, (Paint) null);
                            width = width + digitBmp.getWidth() + TimepanelScreenElement.this.mSpace;
                        }
                    }
                    TimepanelScreenElement.this.mBitmap.updateVersion();
                    TimepanelScreenElement timepanelScreenElement = TimepanelScreenElement.this;
                    timepanelScreenElement.mBmpWidth = width - timepanelScreenElement.mSpace;
                    TimepanelScreenElement timepanelScreenElement2 = TimepanelScreenElement.this;
                    timepanelScreenElement2.setActualWidth(timepanelScreenElement2.descale(timepanelScreenElement2.mBmpWidth));
                    TimepanelScreenElement.this.requestUpdate();
                }
            }
        };
        this.mFormatRaw = getAttr(element, "format");
        this.mFormatExp = Expression.build(getVariables(), getAttr(element, "formatExp"));
        this.mSpace = (int) scale(getAttrAsInt(element, "space", 0));
        this.mTimeZoneExp = Expression.build(getVariables(), getAttr(element, "timeZoneId"));
    }

    private void createBitmap() {
        int width = 0;
        int density = 0;
        for (int i2 = 0; i2 < 11; i2++) {
            Bitmap digitBmp = getDigitBmp("0123456789:".charAt(i2));
            if (digitBmp == null) {
                this.mLoadResourceFailed = true;
                MamlLog.m17851e(LOG_TAG, "Failed to load digit bitmap: " + "0123456789:".charAt(i2));
                return;
            }
            if (width < digitBmp.getWidth()) {
                width = digitBmp.getWidth();
            }
            if (this.mBmpHeight < digitBmp.getHeight()) {
                this.mBmpHeight = digitBmp.getHeight();
            }
            if (density == 0) {
                density = digitBmp.getDensity();
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((width * 5) + (this.mSpace * 4), this.mBmpHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setDensity(density);
        this.mBitmap.setBitmap(bitmapCreateBitmap);
        setActualHeight(descale(this.mBmpHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap getDigitBmp(char c2) {
        String strValueOf;
        String src = getSrc();
        if (TextUtils.isEmpty(src)) {
            src = "time.png";
        }
        if (c2 == ':') {
            strValueOf = "dot";
        } else {
            char c3 = this.mLocalizedZero;
            if (c2 >= c3 && c2 <= c3 + '\t') {
                c2 = (char) ((c2 - c3) + 48);
            }
            strValueOf = String.valueOf(c2);
        }
        return getContext().mResourceManager.getBitmap(Utils.addFileNameSuffix(src, strValueOf));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getFormat() {
        Expression expression = this.mFormatExp;
        return expression != null ? expression.evaluateStr() : this.mFormat;
    }

    private void setDateFormat() {
        if (TextUtils.isEmpty(this.mFormatRaw) && this.mFormatExp == null) {
            this.mFormat = DateFormat.is24HourFormat(getContext().mContext) ? M24 : M12;
        } else {
            this.mFormat = this.mFormatRaw;
        }
    }

    private void updateTime(boolean z2) {
        getContext().getHandler().removeCallbacks(this.mUpdateTimeRunnable);
        this.mForceUpdate = z2;
        postInMainThread(this.mUpdateTimeRunnable);
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        long jCurrentTimeMillis = System.currentTimeMillis() / 60000;
        String src = getSrc();
        String format = getFormat();
        if (jCurrentTimeMillis == this.mPreMinute && TextUtils.equals(src, this.mOldSrc) && TextUtils.equals(format, this.mOldFormat)) {
            return;
        }
        updateTime(true);
        this.mPreMinute = jCurrentTimeMillis;
        this.mOldSrc = src;
        this.mOldFormat = format;
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        this.mPreTime = null;
        this.mLoadResourceFailed = false;
        getContext().getHandler().removeCallbacks(this.mUpdateTimeRunnable);
        super.finish();
    }

    @Override // com.miui.maml.elements.ImageScreenElement
    protected int getBitmapWidth() {
        return this.mBmpWidth;
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        this.mConfiguration = new Configuration(this.mRoot.getContext().mContext.getResources().getConfiguration());
        setDateFormat();
        this.mPreTime = null;
        createBitmap();
        updateTime(true);
    }

    @Override // com.miui.maml.elements.ImageScreenElement
    protected boolean needResetFromConfigChanged() {
        return true;
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.ScreenElement
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Configuration configuration2 = this.mConfiguration;
        if (configuration2 == null) {
            return;
        }
        if (configuration2.screenWidthDp != configuration.screenWidthDp || configuration2.screenLayout != configuration.screenLayout || configuration2.smallestScreenWidthDp != configuration.smallestScreenWidthDp || configuration2.densityDpi != configuration.densityDpi) {
            createBitmap();
            updateTime(true);
        }
        this.mConfiguration.updateFrom(configuration);
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void pause() {
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.ScreenElement
    public void resume() {
        this.mCalendar = Calendar.getInstance();
        this.mLocalizedZero = DecimalFormatSymbols.getInstance().getZeroDigit();
        setDateFormat();
        updateTime(true);
    }
}
