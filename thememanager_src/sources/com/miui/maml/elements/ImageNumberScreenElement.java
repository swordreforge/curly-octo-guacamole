package com.miui.maml.elements;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class ImageNumberScreenElement extends ImageScreenElement {
    public static final String TAG_NAME = "ImageNumber";
    public static final String TAG_NAME1 = "ImageChars";
    private String LOG_TAG;
    private boolean forceUpdate;
    private int mBmpHeight;
    private int mBmpWidth;
    private Bitmap mCachedBmp;
    private Canvas mCachedCanvas;
    private Configuration mConfiguration;
    private ArrayList<CharName> mNameMap;
    private Expression mNumExpression;
    private String mOldSrc;
    private double mPreNumber;
    private String mPreStr;
    private int mSpace;
    private Expression mSpaceExpression;
    private Expression mStrExpression;
    private String mStrValue;

    private class CharName {

        /* JADX INFO: renamed from: ch, reason: collision with root package name */
        public char f72133ch;
        public String name;

        public CharName(char c2, String str) {
            this.f72133ch = c2;
            this.name = str;
        }
    }

    public ImageNumberScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.LOG_TAG = "ImageNumberScreenElement";
        this.mPreNumber = Double.MIN_VALUE;
        this.mNumExpression = Expression.build(getVariables(), getAttr(element, "number"));
        this.mStrExpression = Expression.build(getVariables(), getAttr(element, "string"));
        this.mSpaceExpression = Expression.build(getVariables(), getAttr(element, "space"));
        String attr = getAttr(element, "charNameMap");
        if (TextUtils.isEmpty(attr)) {
            return;
        }
        this.mNameMap = new ArrayList<>();
        for (String str : attr.split(",")) {
            this.mNameMap.add(new CharName(str.charAt(0), str.substring(1)));
        }
    }

    private String charToStr(char c2) {
        ArrayList<CharName> arrayList = this.mNameMap;
        if (arrayList != null) {
            for (CharName charName : arrayList) {
                if (charName.f72133ch == c2) {
                    return charName.name;
                }
            }
        }
        return c2 == '.' ? "dot" : String.valueOf(c2);
    }

    private Bitmap getNumberBitmap(String str, String str2) {
        return getContext().mResourceManager.getBitmap(Utils.addFileNameSuffix(str, str2));
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        String strDoubleToString;
        super.doTick(j2);
        if (this.mNumExpression == null && this.mStrExpression == null && this.mStrValue == null) {
            if (this.mCachedBmp != null) {
                this.mCachedBmp = null;
                this.mPreStr = null;
                this.mCurrentBitmap.setBitmap(null);
                updateBitmapVars();
                return;
            }
            return;
        }
        String src = getSrc();
        boolean z2 = !TextUtils.equals(src, this.mOldSrc) || this.forceUpdate;
        this.forceUpdate = false;
        Expression expression = this.mNumExpression;
        if (expression != null) {
            double dEvaluate = evaluate(expression);
            if (dEvaluate == this.mPreNumber && !z2) {
                return;
            }
            this.mPreNumber = dEvaluate;
            strDoubleToString = Utils.doubleToString(dEvaluate);
        } else {
            Expression expression2 = this.mStrExpression;
            if (expression2 == null && this.mStrValue == null) {
                strDoubleToString = null;
            } else {
                String str = this.mStrValue;
                String strEvaluateStr = str != null ? str : evaluateStr(expression2);
                if (TextUtils.equals(strEvaluateStr, this.mPreStr) && !z2) {
                    return;
                }
                this.mPreStr = strEvaluateStr;
                strDoubleToString = strEvaluateStr;
            }
        }
        Bitmap bitmap = this.mCachedBmp;
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        this.mOldSrc = src;
        this.mBmpWidth = 0;
        int length = strDoubleToString != null ? strDoubleToString.length() : 0;
        for (int i2 = 0; i2 < length; i2++) {
            Bitmap numberBitmap = getNumberBitmap(src, charToStr(strDoubleToString.charAt(i2)));
            if (numberBitmap == null) {
                MamlLog.m17851e(this.LOG_TAG, "Fail to get bitmap for number " + String.valueOf(strDoubleToString.charAt(i2)));
                return;
            }
            int width = this.mBmpWidth + numberBitmap.getWidth();
            int height = numberBitmap.getHeight();
            Bitmap bitmap2 = this.mCachedBmp;
            int width2 = bitmap2 == null ? 0 : bitmap2.getWidth();
            Bitmap bitmap3 = this.mCachedBmp;
            int height2 = bitmap3 == null ? 0 : bitmap3.getHeight();
            if (width > width2 || height > height2) {
                Bitmap bitmap4 = this.mCachedBmp;
                if (width > width2) {
                    int i3 = length - i2;
                    width2 = this.mBmpWidth + (numberBitmap.getWidth() * i3) + (this.mSpace * (i3 - 1));
                }
                if (height <= height2) {
                    height = height2;
                }
                this.mBmpHeight = height;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width2, height, Bitmap.Config.ARGB_8888);
                this.mCachedBmp = bitmapCreateBitmap;
                bitmapCreateBitmap.setDensity(numberBitmap.getDensity());
                this.mCurrentBitmap.setBitmap(this.mCachedBmp);
                Canvas canvas = new Canvas(this.mCachedBmp);
                this.mCachedCanvas = canvas;
                if (bitmap4 != null) {
                    canvas.drawBitmap(bitmap4, 0.0f, 0.0f, (Paint) null);
                }
            }
            this.mCachedCanvas.drawBitmap(numberBitmap, this.mBmpWidth, 0.0f, (Paint) null);
            int width3 = this.mBmpWidth + numberBitmap.getWidth();
            this.mBmpWidth = width3;
            if (i2 < length - 1) {
                this.mBmpWidth = width3 + this.mSpace;
            }
        }
        this.mCurrentBitmap.updateVersion();
        updateBitmapVars();
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        this.mPreNumber = Double.MIN_VALUE;
        this.mPreStr = null;
    }

    @Override // com.miui.maml.elements.ImageScreenElement
    protected int getBitmapHeight() {
        return this.mBmpHeight;
    }

    @Override // com.miui.maml.elements.ImageScreenElement
    protected int getBitmapWidth() {
        return this.mBmpWidth;
    }

    @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        this.mConfiguration = new Configuration(this.mRoot.getContext().mContext.getResources().getConfiguration());
        Expression expression = this.mSpaceExpression;
        this.mSpace = expression == null ? 0 : (int) scale(expression.evaluate());
        this.mCurrentBitmap.setBitmap(this.mCachedBmp);
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
            this.forceUpdate = true;
            if (this.mCachedBmp != null) {
                this.mCachedBmp = null;
            }
        }
        configuration2.updateFrom(configuration);
    }

    public void setValue(double d2) {
        setValue(Utils.doubleToString(d2));
    }

    @Override // com.miui.maml.elements.ImageScreenElement
    protected void updateBitmapImpl(boolean z2) {
        this.mCurrentBitmap.setBitmap(this.mCachedBmp);
        updateBitmapVars();
    }

    public void setValue(String str) {
        this.mStrValue = str;
        requestUpdate();
    }
}
