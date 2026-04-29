package com.miui.maml.elements;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.animation.BaseAnimation;
import com.miui.maml.animation.SourcesAnimation;
import com.miui.maml.compat.AodCompat;
import com.miui.maml.data.Expression;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.elements.BitmapProvider;
import com.miui.maml.folme.AnimatedProperty;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.TextFormatter;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import miuix.graphics.C7111k;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class ImageScreenElement extends AnimatedScreenElement implements BitmapProvider.IBitmapHolder {
    private static final String LOG_TAG = "ImageScreenElement";
    public static final String MASK_TAG_NAME = "Mask";
    private static final double PI = 3.1415926535897d;
    public static final String TAG_NAME = "Image";
    private static final String VAR_BMP_HEIGHT = "bmp_height";
    private static final String VAR_BMP_WIDTH = "bmp_width";
    private static final String VAR_HAS_BITMAP = "has_bitmap";
    private boolean mAntiAlias;
    protected BitmapProvider.VersionedBitmap mBitmap;
    private BitmapProvider mBitmapProvider;
    private Bitmap mBlurBitmap;
    private int mBlurRadius;
    private IndexedVariable mBmpSizeHeightVar;
    private IndexedVariable mBmpSizeWidthVar;
    private Configuration mConfiguration;
    private float mCornerRadiusX;
    private Expression mCornerRadiusXExp;
    private float mCornerRadiusY;
    private Expression mCornerRadiusYExp;
    protected BitmapProvider.VersionedBitmap mCurrentBitmap;
    private Rect mDesRect;
    private Expression mExpH;
    private Expression mExpSrcH;
    private Expression mExpSrcW;
    private Expression mExpSrcX;
    private Expression mExpSrcY;
    private Expression mExpW;
    private int mH;
    private IndexedVariable mHasBitmapVar;
    private boolean mHasSrcRect;
    private boolean mHasWidthAndHeight;
    private boolean mIsLoadAsyncSet;
    private boolean mLoadAsync;
    private Paint mMaskPaint;
    private ArrayList<Mask> mMasks;
    private int mMeshHeight;
    private float[] mMeshVerts;
    private float[] mMeshVertsScale;
    private int mMeshWidth;
    protected Paint mPaint;
    private Path mPath;
    private boolean mPendingBlur;
    private int mRawBlurRadius;
    private boolean mRetainWhenInvisible;
    private pair<Double, Double> mRotateXYpair;
    private RectF mRoundCornerRect;
    private SourcesAnimation mSources;
    private String mSrc;
    private TextFormatter mSrcFormatter;
    private int mSrcH;
    private Expression mSrcIdExpression;
    private Rect mSrcRect;
    private int mSrcW;
    private int mSrcX;
    private int mSrcY;
    private int mW;
    private Expression mXfermodeNumExp;

    private class Mask extends ImageScreenElement {
        private boolean mAlignAbsolute;

        public Mask(Element element, ScreenElementRoot screenElementRoot) {
            super(element, screenElementRoot);
            if (getAttr(element, "align").equalsIgnoreCase("absolute")) {
                this.mAlignAbsolute = true;
            }
        }

        @Override // com.miui.maml.elements.ImageScreenElement, com.miui.maml.elements.ScreenElement
        protected void doRender(Canvas canvas) {
        }

        public final boolean isAlignAbsolute() {
            return this.mAlignAbsolute;
        }
    }

    private static class pair<T1, T2> {
        public T1 p1;
        public T2 p2;

        private pair() {
        }
    }

    public ImageScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mBitmap = new BitmapProvider.VersionedBitmap(null);
        this.mCurrentBitmap = new BitmapProvider.VersionedBitmap(null);
        this.mPaint = new Paint();
        this.mMaskPaint = new Paint();
        this.mDesRect = new Rect();
        this.mRoundCornerRect = new RectF();
        this.mW = -1;
        this.mH = -1;
        load(element);
    }

    private Path getRoundCornerPath(RectF rectF) {
        Path path = this.mPath;
        if (path == null) {
            this.mPath = new Path();
        } else {
            path.reset();
        }
        this.mPath.addRoundRect(rectF, this.mCornerRadiusX, this.mCornerRadiusY, Path.Direction.CW);
        return this.mPath;
    }

    private void load(Element element) {
        if (element == null) {
            return;
        }
        Variables variables = getVariables();
        this.mSrcFormatter = TextFormatter.fromElement(variables, element, "src", "srcFormat", "srcParas", "srcExp", "srcFormatExp");
        this.mSrcIdExpression = Expression.build(variables, getAttr(element, "srcid"));
        boolean z2 = !getAttr(element, "antiAlias").equals("false");
        this.mAntiAlias = z2;
        this.mPaint.setFilterBitmap(z2);
        this.mMaskPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.mMaskPaint.setFilterBitmap(this.mAntiAlias);
        this.mExpSrcX = Expression.build(variables, getAttr(element, "srcX"));
        this.mExpSrcY = Expression.build(variables, getAttr(element, "srcY"));
        this.mExpSrcW = Expression.build(variables, getAttr(element, "srcW"));
        this.mExpSrcH = Expression.build(variables, getAttr(element, "srcH"));
        this.mExpW = Expression.build(variables, getAttr(element, AnimatedProperty.PROPERTY_NAME_W));
        this.mExpH = Expression.build(variables, getAttr(element, AnimatedProperty.PROPERTY_NAME_H));
        if (this.mExpSrcW != null && this.mExpSrcH != null) {
            this.mHasSrcRect = true;
            this.mSrcRect = new Rect();
        }
        if (this.mExpH != null && this.mExpW != null) {
            this.mHasWidthAndHeight = true;
        }
        this.mRawBlurRadius = getAttrAsInt(element, "blur", 0);
        loadMesh(element);
        Expression expressionBuild = Expression.build(variables, getAttr(element, "xfermodeNum"));
        this.mXfermodeNumExp = expressionBuild;
        if (expressionBuild == null) {
            this.mPaint.setXfermode(new PorterDuffXfermode(Utils.getPorterDuffMode(getAttr(element, "xfermode"))));
        }
        resolveCornerRadius(element);
        boolean z3 = Boolean.parseBoolean(getAttr(element, "useVirtualScreen"));
        String attr = getAttr(element, "srcType");
        if (z3) {
            attr = "VirtualScreen";
        }
        setSrcType(attr);
        String attr2 = getAttr(element, "loadAsync");
        if (AodCompat.isAod(this.mRoot.getRootTag())) {
            this.mLoadAsync = false;
            this.mIsLoadAsyncSet = true;
        } else if (!TextUtils.isEmpty(attr2)) {
            this.mLoadAsync = Boolean.parseBoolean(attr2);
            this.mIsLoadAsyncSet = true;
        }
        this.mRetainWhenInvisible = Boolean.parseBoolean(getAttr(element, "retainWhenInvisible"));
        if (this.mHasName) {
            this.mBmpSizeWidthVar = new IndexedVariable(this.mName + "." + VAR_BMP_WIDTH, variables, true);
            this.mBmpSizeHeightVar = new IndexedVariable(this.mName + "." + VAR_BMP_HEIGHT, variables, true);
            this.mHasBitmapVar = new IndexedVariable(this.mName + "." + VAR_HAS_BITMAP, variables, true);
        }
        loadMask(element);
    }

    private void loadMask(Element element) {
        if (this.mMasks == null) {
            this.mMasks = new ArrayList<>();
        }
        this.mMasks.clear();
        NodeList elementsByTagName = element.getElementsByTagName(MASK_TAG_NAME);
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            this.mMasks.add(new Mask((Element) elementsByTagName.item(i2), this.mRoot));
        }
    }

    private void renderWithMask(Canvas canvas, Mask mask, int i2, int i3) {
        double dSin;
        double dCos;
        Bitmap bitmap = getContext().mResourceManager.getBitmap(mask.getSrc());
        if (bitmap == null) {
            return;
        }
        canvas.save();
        double x3 = mask.getX();
        double y3 = mask.getY();
        float rotation = mask.getRotation();
        if (mask.isAlignAbsolute()) {
            float rotation2 = getRotation();
            if (rotation2 == 0.0f) {
                dSin = x3 - ((double) i2);
                dCos = y3 - ((double) i3);
            } else {
                float f2 = rotation - rotation2;
                double d2 = (((double) rotation2) * PI) / 180.0d;
                float pivotX = getPivotX();
                float pivotY = getPivotY();
                if (this.mRotateXYpair == null) {
                    this.mRotateXYpair = new pair<>();
                }
                rotateXY(pivotX, pivotY, d2, this.mRotateXYpair);
                double dDoubleValue = ((double) i2) + this.mRotateXYpair.p1.doubleValue();
                double dDoubleValue2 = ((double) i3) + this.mRotateXYpair.p2.doubleValue();
                rotateXY(descale(mask.getPivotX()), descale(mask.getPivotY()), (((double) mask.getRotation()) * PI) / 180.0d, this.mRotateXYpair);
                double dScale = (x3 + ((double) scale(this.mRotateXYpair.p1.doubleValue()))) - dDoubleValue;
                double dScale2 = (y3 + ((double) scale(this.mRotateXYpair.p2.doubleValue()))) - dDoubleValue2;
                double dSqrt = Math.sqrt((dScale * dScale) + (dScale2 * dScale2));
                double dAsin = Math.asin(dScale / dSqrt);
                double d4 = dScale2 > 0.0d ? d2 + dAsin : (d2 + PI) - dAsin;
                dSin = dSqrt * Math.sin(d4);
                dCos = dSqrt * Math.cos(d4);
                rotation = f2;
            }
            x3 = dSin - ((double) getX());
            y3 = dCos - ((double) getY());
        }
        canvas.rotate(rotation, (float) (((double) mask.getPivotX()) + x3 + ((double) i2)), (float) (((double) mask.getPivotY()) + y3 + ((double) i3)));
        int i4 = (int) x3;
        int i5 = (int) y3;
        int iRound = Math.round(mask.getWidth());
        if (iRound < 0) {
            iRound = bitmap.getWidth();
        }
        int iRound2 = Math.round(mask.getHeight());
        if (iRound2 < 0) {
            iRound2 = bitmap.getHeight();
        }
        int i6 = i4 + i2;
        int i7 = i5 + i3;
        this.mDesRect.set(i6, i7, iRound + i6, iRound2 + i7);
        this.mMaskPaint.setAlpha(mask.getAlpha());
        canvas.drawBitmap(bitmap, (Rect) null, this.mDesRect, this.mMaskPaint);
        canvas.restore();
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
        this.mCornerRadiusXExp = expression;
        if (expressionArrBuildMultiple != null && expressionArrBuildMultiple.length > 1) {
            expression = expressionArrBuildMultiple[1];
        }
        this.mCornerRadiusYExp = expression;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T1, T2, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T1, java.lang.Double] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T2, java.lang.Double] */
    private void rotateXY(double d2, double d4, double d5, pair<Double, Double> pairVar) {
        double dSqrt = Math.sqrt((d2 * d2) + (d4 * d4));
        ?? ValueOf = Double.valueOf(0.0d);
        if (dSqrt <= 0.0d) {
            pairVar.p1 = ValueOf;
            pairVar.p2 = ValueOf;
        } else {
            double dAcos = (PI - Math.acos(d2 / dSqrt)) - d5;
            pairVar.p1 = Double.valueOf(d2 + (Math.cos(dAcos) * dSqrt));
            pairVar.p2 = Double.valueOf(d4 - (dSqrt * Math.sin(dAcos)));
        }
    }

    private void updateBitmap(boolean z2) {
        updateBitmapImpl(z2);
        if (this.mIsLoadAsyncSet || z2) {
            return;
        }
        this.mLoadAsync = true;
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        Bitmap bitmap = this.mCurrentBitmap.getBitmap();
        if (bitmap == null) {
            return;
        }
        if (this.mPendingBlur) {
            if (this.mBlurBitmap == null || bitmap.getWidth() != this.mBlurBitmap.getWidth() || bitmap.getHeight() != this.mBlurBitmap.getHeight()) {
                this.mBlurBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            }
            this.mPendingBlur = false;
            this.mBlurBitmap = C7111k.m25755z(this.mRoot.getContext().mContext, bitmap, this.mBlurBitmap, this.mBlurRadius);
        }
        Bitmap bitmap2 = this.mBlurBitmap;
        Bitmap bitmap3 = (bitmap2 == null || this.mBlurRadius <= 0) ? bitmap : bitmap2;
        this.mPaint.setAlpha(getAlpha());
        int density = canvas.getDensity();
        canvas.setDensity(0);
        float width = getWidth();
        float height = getHeight();
        float width2 = super.getWidth();
        float height2 = super.getHeight();
        if (width == 0.0f || height == 0.0f) {
            return;
        }
        int left = (int) getLeft(0.0f, width);
        int top = (int) getTop(0.0f, height);
        canvas.save();
        if (this.mCornerRadiusX > 0.0f && this.mCornerRadiusY > 0.0f) {
            this.mRoundCornerRect.set(left, top, ((int) width) + left, ((int) height) + top);
            canvas.clipPath(getRoundCornerPath(this.mRoundCornerRect));
        }
        if (this.mMasks.size() != 0) {
            float f2 = left;
            float f3 = top;
            canvas.saveLayer(f2, f3, ((int) Math.ceil(width)) + left, ((int) Math.ceil(height)) + top, this.mPaint, 31);
            if (width2 > 0.0f || height2 > 0.0f || this.mSrcRect != null) {
                i2 = left;
                i3 = top;
                this.mDesRect.set(i2, i3, i2 + ((int) width), i3 + ((int) height));
                Rect rect = this.mSrcRect;
                if (rect != null) {
                    int i5 = this.mSrcX;
                    int i6 = this.mSrcY;
                    rect.set(i5, i6, this.mSrcW + i5, this.mSrcH + i6);
                }
                canvas.drawBitmap(bitmap3, this.mSrcRect, this.mDesRect, this.mPaint);
            } else {
                canvas.drawBitmap(bitmap3, f2, f3, this.mPaint);
                i3 = top;
                i2 = left;
            }
            Iterator<Mask> it = this.mMasks.iterator();
            while (it.hasNext()) {
                renderWithMask(canvas, it.next(), i2, i3);
            }
            canvas.restore();
        } else if (bitmap3.getNinePatchChunk() != null) {
            NinePatch ninePatch = getContext().mResourceManager.getNinePatch(getSrc());
            if (ninePatch != null) {
                this.mDesRect.set(left, top, (int) (left + width), (int) (top + height));
                ninePatch.draw(canvas, this.mDesRect, this.mPaint);
            } else {
                MamlLog.m17851e(LOG_TAG, "the image contains ninepatch chunk but couldn't get NinePatch object: " + getSrc());
            }
        } else if (width2 > 0.0f || height2 > 0.0f || this.mSrcRect != null) {
            this.mDesRect.set(left, top, (int) (left + width), (int) (top + height));
            Rect rect2 = this.mSrcRect;
            if (rect2 != null) {
                int i7 = this.mSrcX;
                int i8 = this.mSrcY;
                rect2.set(i7, i8, this.mSrcW + i7, this.mSrcH + i8);
            }
            canvas.drawBitmap(bitmap3, this.mSrcRect, this.mDesRect, this.mPaint);
        } else {
            int i9 = this.mMeshWidth;
            if (i9 <= 0 || (i4 = this.mMeshHeight) <= 0) {
                canvas.drawBitmap(bitmap3, left, top, this.mPaint);
            } else {
                canvas.drawBitmapMesh(bitmap3, i9, i4, this.mMeshVertsScale, 0, null, 0, this.mPaint);
            }
        }
        canvas.restore();
        canvas.setDensity(density);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        super.doTick(j2);
        if (isVisible()) {
            TextFormatter textFormatter = this.mSrcFormatter;
            this.mSrc = textFormatter != null ? textFormatter.getText() : null;
            ArrayList<Mask> arrayList = this.mMasks;
            if (arrayList != null) {
                Iterator<Mask> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().doTick(j2);
                }
            }
            Expression expression = this.mXfermodeNumExp;
            if (expression != null) {
                this.mPaint.setXfermode(new PorterDuffXfermode(Utils.getPorterDuffMode((int) expression.evaluate())));
            }
            if (this.mCornerRadiusXExp != null) {
                this.mCornerRadiusX = (int) r4.evaluate();
            }
            if (this.mCornerRadiusYExp != null) {
                this.mCornerRadiusY = (int) r4.evaluate();
            }
            float[] fArr = this.mMeshVerts;
            if (fArr != null) {
                this.mMeshVertsScale = new float[fArr.length];
                int i2 = 0;
                while (true) {
                    if (i2 >= this.mMeshVerts.length) {
                        break;
                    }
                    this.mMeshVertsScale[i2] = scale(r5[i2]);
                    i2++;
                }
            }
            if (this.mHasSrcRect) {
                this.mSrcX = (int) scale(evaluate(this.mExpSrcX));
                this.mSrcY = (int) scale(evaluate(this.mExpSrcY));
                this.mSrcW = (int) scale(evaluate(this.mExpSrcW));
                this.mSrcH = (int) scale(evaluate(this.mExpSrcH));
            }
            if (this.mHasWidthAndHeight) {
                this.mW = (int) scale(evaluate(this.mExpW));
                this.mH = (int) scale(evaluate(this.mExpH));
            }
            if (this.mTintChanged) {
                this.mPaint.setColorFilter(this.mTintFilter);
            }
            updateBitmap(this.mLoadAsync);
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        BitmapProvider bitmapProvider = this.mBitmapProvider;
        if (bitmapProvider != null) {
            bitmapProvider.finish();
        }
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
        }
        this.mBitmap.reset();
        this.mCurrentBitmap.reset();
        this.mBlurBitmap = null;
    }

    @Override // com.miui.maml.elements.BitmapProvider.IBitmapHolder
    public BitmapProvider.VersionedBitmap getBitmap(String str) {
        return this.mCurrentBitmap;
    }

    protected int getBitmapHeight() {
        Bitmap bitmap = this.mCurrentBitmap.getBitmap();
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return 0;
    }

    protected int getBitmapWidth() {
        Bitmap bitmap = this.mCurrentBitmap.getBitmap();
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return 0;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getHeight() {
        float height = super.getHeight();
        if (height >= 0.0f) {
            return height;
        }
        return this.mHasSrcRect ? this.mSrcH : getBitmapHeight();
    }

    public final String getSrc() {
        Expression expression;
        SourcesAnimation sourcesAnimation = this.mSources;
        String src = sourcesAnimation != null ? sourcesAnimation.getSrc() : this.mSrc;
        return (src == null || (expression = this.mSrcIdExpression) == null) ? src : Utils.addFileNameSuffix(src, String.valueOf((long) expression.evaluate()));
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getWidth() {
        float width = super.getWidth();
        if (width >= 0.0f) {
            return width;
        }
        return this.mHasSrcRect ? this.mSrcW : getBitmapWidth();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getX() {
        float x3 = super.getX();
        SourcesAnimation sourcesAnimation = this.mSources;
        return sourcesAnimation != null ? x3 + scale(sourcesAnimation.getX()) : x3;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getY() {
        float y3 = super.getY();
        SourcesAnimation sourcesAnimation = this.mSources;
        return sourcesAnimation != null ? y3 + scale(sourcesAnimation.getY()) : y3;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        this.mConfiguration = new Configuration(this.mRoot.getContext().mContext.getResources().getConfiguration());
        TextFormatter textFormatter = this.mSrcFormatter;
        this.mSrc = textFormatter != null ? textFormatter.getText() : null;
        this.mBitmap.reset();
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().init();
            }
        }
        BitmapProvider bitmapProvider = this.mBitmapProvider;
        if (bitmapProvider != null) {
            bitmapProvider.init(getSrc());
        }
        if (isVisible()) {
            updateBitmap(this.mLoadAsync);
        }
        int iScale = (int) scale(this.mRawBlurRadius);
        this.mBlurRadius = iScale;
        if (iScale > 0) {
            this.mPendingBlur = true;
        }
    }

    protected void loadMesh(Element element) {
        String attr = getAttr(element, "mesh");
        int iIndexOf = attr.indexOf(",");
        if (iIndexOf != -1) {
            try {
                this.mMeshWidth = Integer.parseInt(attr.substring(0, iIndexOf));
                this.mMeshHeight = Integer.parseInt(attr.substring(iIndexOf + 1));
            } catch (NumberFormatException unused) {
                MamlLog.m17854w(LOG_TAG, "Invalid mesh format:" + attr);
            }
            if (this.mMeshWidth == 0 || this.mMeshHeight == 0) {
                return;
            }
            String attr2 = getAttr(element, "meshVertsArr");
            Object obj = getVariables().get(attr2);
            if (obj != null && (obj instanceof float[])) {
                this.mMeshVerts = (float[]) obj;
                return;
            }
            this.mMeshHeight = 0;
            this.mMeshWidth = 0;
            MamlLog.m17854w(LOG_TAG, "Invalid meshVertsArr:" + attr2 + "  undifined or not float[] type");
        }
    }

    protected boolean needResetFromConfigChanged() {
        return true;
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mConfiguration == null) {
            return;
        }
        if (needResetFromConfigChanged()) {
            Configuration configuration2 = this.mConfiguration;
            if (configuration2.screenWidthDp != configuration.screenWidthDp || configuration2.screenLayout != configuration.screenLayout || configuration2.smallestScreenWidthDp != configuration.smallestScreenWidthDp || configuration2.densityDpi != configuration.densityDpi) {
                BitmapProvider bitmapProvider = this.mBitmapProvider;
                if (bitmapProvider != null) {
                    bitmapProvider.finish();
                }
                ArrayList<Mask> arrayList = this.mMasks;
                if (arrayList != null) {
                    Iterator<Mask> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().finish();
                    }
                }
                this.mBitmap.reset();
                this.mCurrentBitmap.reset();
                this.mBlurBitmap = null;
                updateBitmap(false);
            }
        }
        this.mConfiguration.updateFrom(configuration);
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected BaseAnimation onCreateAnimation(String str, Element element) {
        if (!SourcesAnimation.TAG_NAME.equals(str)) {
            return super.onCreateAnimation(str, element);
        }
        SourcesAnimation sourcesAnimation = new SourcesAnimation(element, this);
        this.mSources = sourcesAnimation;
        return sourcesAnimation;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onSetAnimBefore() {
        super.onSetAnimBefore();
        this.mSources = null;
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onSetAnimEnable(BaseAnimation baseAnimation) {
        if (baseAnimation instanceof SourcesAnimation) {
            this.mSources = (SourcesAnimation) baseAnimation;
        } else {
            super.onSetAnimEnable(baseAnimation);
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onVisibilityChange(boolean z2) {
        super.onVisibilityChange(z2);
        if (z2) {
            updateBitmap(this.mLoadAsync);
        } else {
            if (this.mRetainWhenInvisible) {
                return;
            }
            BitmapProvider bitmapProvider = this.mBitmapProvider;
            if (bitmapProvider != null) {
                bitmapProvider.finish();
            }
            this.mCurrentBitmap.reset();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void pause() {
        super.pause();
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause();
            }
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void pauseAnim(long j2) {
        super.pauseAnim(j2);
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pauseAnim(j2);
            }
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void playAnim(long j2, long j3, long j4, boolean z2, boolean z3) {
        super.playAnim(j2, j3, j4, z2, z3);
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().playAnim(j2, j3, j4, z2, z3);
            }
        }
        BitmapProvider bitmapProvider = this.mBitmapProvider;
        if (bitmapProvider != null) {
            bitmapProvider.reset();
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void reset(long j2) {
        super.reset(j2);
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().reset(j2);
            }
        }
        BitmapProvider bitmapProvider = this.mBitmapProvider;
        if (bitmapProvider != null) {
            bitmapProvider.reset();
        }
        if (this.mBlurRadius > 0) {
            this.mPendingBlur = true;
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void resume() {
        super.resume();
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().resume();
            }
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void resumeAnim(long j2) {
        super.resumeAnim(j2);
        ArrayList<Mask> arrayList = this.mMasks;
        if (arrayList != null) {
            Iterator<Mask> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().resumeAnim(j2);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        if (bitmap != this.mBitmap.getBitmap()) {
            this.mBitmap.setBitmap(bitmap);
            updateBitmap(this.mLoadAsync);
            requestUpdate();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColorFilter(colorFilter);
        }
    }

    public void setSrc(String str) {
        TextFormatter textFormatter = this.mSrcFormatter;
        if (textFormatter != null) {
            textFormatter.setText(str);
        }
    }

    public void setSrcId(double d2) {
        Expression expression = this.mSrcIdExpression;
        if (expression == null || !(expression instanceof Expression.NumberExpression)) {
            this.mSrcIdExpression = new Expression.NumberExpression(String.valueOf(d2));
        } else {
            ((Expression.NumberExpression) expression).setValue(d2);
        }
    }

    public void setSrcType(String str) {
        this.mBitmapProvider = BitmapProvider.create(this.mRoot, str);
    }

    protected void updateBitmapImpl(boolean z2) {
        BitmapProvider.VersionedBitmap bitmap = getBitmap(z2);
        if (this.mBlurRadius > 0 && !BitmapProvider.VersionedBitmap.equals(bitmap, this.mCurrentBitmap)) {
            this.mPendingBlur = true;
        }
        this.mCurrentBitmap.set(bitmap);
        updateBitmapVars();
    }

    protected void updateBitmapVars() {
        if (this.mHasName) {
            this.mBmpSizeWidthVar.set(descale(getBitmapWidth()));
            this.mBmpSizeHeightVar.set(descale(getBitmapHeight()));
            this.mHasBitmapVar.set(this.mCurrentBitmap.getBitmap() != null ? 1.0d : 0.0d);
        }
    }

    protected BitmapProvider.VersionedBitmap getBitmap(boolean z2) {
        if (this.mBitmap.getBitmap() != null) {
            return this.mBitmap;
        }
        BitmapProvider bitmapProvider = this.mBitmapProvider;
        if (bitmapProvider != null) {
            return bitmapProvider.getBitmap(getSrc(), !z2, this.mW, this.mH);
        }
        return null;
    }
}
