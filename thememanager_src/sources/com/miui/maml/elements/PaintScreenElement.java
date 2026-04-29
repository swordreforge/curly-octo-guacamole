package com.miui.maml.elements;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.data.VariableNames;
import com.miui.maml.data.Variables;
import com.miui.maml.util.ColorParser;
import com.miui.maml.util.Utils;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class PaintScreenElement extends AnimatedScreenElement {
    private static float DEFAULT_WEIGHT = 1.0f;
    public static final String TAG_NAME = "Paint";
    private Bitmap mCachedBitmap;
    private Canvas mCachedCanvas;
    private Paint mCachedPaint;
    private int mColor;
    private ColorParser mColorParser;
    private Paint mPaint;
    private Path mPath;
    private boolean mPendingMouseUp;
    private float mWeight;
    private Expression mWeightExp;
    private Xfermode mXfermode;

    public PaintScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        load(element, screenElementRoot);
        this.mPath = new Path();
        float fScale = scale(DEFAULT_WEIGHT);
        DEFAULT_WEIGHT = fScale;
        this.mWeight = fScale;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setXfermode(this.mXfermode);
        this.mPaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.mCachedPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.mCachedPaint.setStrokeWidth(DEFAULT_WEIGHT);
        this.mCachedPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mCachedPaint.setStrokeJoin(Paint.Join.ROUND);
        this.mCachedPaint.setAntiAlias(true);
        this.mTouchable = true;
    }

    private void load(Element element, ScreenElementRoot screenElementRoot) {
        if (element == null) {
            return;
        }
        Variables variables = getVariables();
        this.mWeightExp = Expression.build(variables, element.getAttribute("weight"));
        this.mColorParser = ColorParser.fromElement(variables, element);
        this.mXfermode = new PorterDuffXfermode(Utils.getPorterDuffMode(element.getAttribute("xfermode")));
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        float left = getLeft(0.0f, width);
        float top = getTop(0.0f, height);
        float absoluteLeft = getAbsoluteLeft();
        float absoluteTop = getAbsoluteTop();
        if (this.mPendingMouseUp) {
            this.mCachedCanvas.save();
            this.mCachedCanvas.translate(-absoluteLeft, -absoluteTop);
            this.mCachedCanvas.drawPath(this.mPath, this.mCachedPaint);
            this.mCachedCanvas.restore();
            this.mPath.reset();
            this.mPendingMouseUp = false;
        }
        canvas.drawBitmap(this.mCachedBitmap, left, top, this.mPaint);
        if (this.mPressed) {
            float f2 = this.mWeight;
            if (f2 <= 0.0f || this.mAlpha <= 0) {
                return;
            }
            this.mCachedPaint.setStrokeWidth(f2);
            this.mCachedPaint.setColor(this.mColor);
            Paint paint = this.mCachedPaint;
            paint.setAlpha(Utils.mixAlpha(paint.getAlpha(), this.mAlpha));
            canvas.save();
            canvas.translate((-absoluteLeft) + left, (-absoluteTop) + top);
            Xfermode xfermode = this.mCachedPaint.getXfermode();
            this.mCachedPaint.setXfermode(this.mXfermode);
            canvas.drawPath(this.mPath, this.mCachedPaint);
            this.mCachedPaint.setXfermode(xfermode);
            canvas.restore();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        if (isVisible()) {
            Expression expression = this.mWeightExp;
            if (expression != null) {
                this.mWeight = scale(expression.evaluate());
            }
            this.mColor = this.mColorParser.getColor();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        this.mCachedBitmap.recycle();
        this.mCachedBitmap = null;
        this.mCachedCanvas = null;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        float width = getWidth();
        if (width < 0.0f) {
            width = scale(Utils.getVariableNumber(VariableNames.SCREEN_WIDTH, getVariables()));
        }
        float height = getHeight();
        if (height < 0.0f) {
            height = scale(Utils.getVariableNumber(VariableNames.SCREEN_HEIGHT, getVariables()));
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) Math.ceil(width), (int) Math.ceil(height), Bitmap.Config.ARGB_8888);
        this.mCachedBitmap = bitmapCreateBitmap;
        bitmapCreateBitmap.setDensity(this.mRoot.getTargetDensity());
        this.mCachedCanvas = new Canvas(this.mCachedBitmap);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void onActionCancel() {
        this.mPendingMouseUp = true;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void onActionDown(float f2, float f3) {
        super.onActionDown(f2, f3);
        this.mPath.reset();
        this.mPath.moveTo(f2, f3);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void onActionMove(float f2, float f3) {
        super.onActionMove(f2, f3);
        this.mPath.lineTo(f2, f3);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    protected void onActionUp() {
        super.onActionUp();
        this.mPendingMouseUp = true;
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void reset(long j2) {
        super.reset(j2);
        this.mCachedCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        this.mPressed = false;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }
}
