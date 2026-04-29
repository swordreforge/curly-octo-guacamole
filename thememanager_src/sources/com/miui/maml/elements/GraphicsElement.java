package com.miui.maml.elements;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Looper;
import android.text.TextUtils;
import com.miui.maml.ActionCommand;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* JADX INFO: loaded from: classes3.dex */
public class GraphicsElement extends AnimatedScreenElement {
    public static final int LINEAR_GRADIENT = 1;
    public static final String LOG_TAG = "MAML_Graphics";
    public static final int RADIAL_GRADIENT = 2;
    public static final String TAG_NAME = "Graphics";
    private boolean mAutoScale;
    private Callbacks mCallbacks;
    private Canvas mCanvas;
    private Rect mCanvasBounds;
    private float mCurrentX;
    private float mCurrentY;
    protected Paint mFillPaint;
    private float mInitRawHeight;
    private float mInitRawWidth;
    private int mLastAlpha;
    private PorterDuff.Mode mMode;
    private Path mPath;
    private FunctionElement mRenderListener;
    protected Paint mStrokePaint;
    private PorterDuffXfermode mXferMode;
    private Expression mXfermodeNumExp;

    private static class Callbacks {
        public static final String TAG_NAME = "OnDraw";
        private ArrayList<ActionCommand> mCommands = new ArrayList<>();

        public Callbacks(Element element, ScreenElement screenElement) {
            ActionCommand actionCommandCreate;
            NodeList childNodes = element.getChildNodes();
            for (int i2 = 0; i2 < childNodes.getLength(); i2++) {
                if (childNodes.item(i2).getNodeType() == 1 && (actionCommandCreate = ActionCommand.create((Element) childNodes.item(i2), screenElement)) != null) {
                    this.mCommands.add(actionCommandCreate);
                }
            }
        }

        public void finish() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().finish();
            }
        }

        public void init() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().init();
            }
        }

        public void pause() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().pause();
            }
        }

        public void perform() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().perform();
            }
        }

        public void resume() {
            Iterator<ActionCommand> it = this.mCommands.iterator();
            while (it.hasNext()) {
                it.next().resume();
            }
        }
    }

    private static class GraphicsMatrix extends Matrix {
        public boolean mChanged;
        public float[] mParm;

        private GraphicsMatrix() {
            this.mParm = new float[4];
        }
    }

    private static class GraphicsShader {
        public int[] mColors;
        private String mMatrixName;
        public Shader mShader;
        private int mShaderType;
        public float[] mStops;
        private Shader.TileMode mTileMode;

        private GraphicsShader() {
            this.mColors = new int[0];
            this.mStops = new float[0];
            this.mShaderType = -1;
        }
    }

    public GraphicsElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mMode = PorterDuff.Mode.SRC_OVER;
        this.mFillPaint = new Paint();
        this.mStrokePaint = new Paint();
        this.mCanvasBounds = new Rect();
        this.mPath = new Path();
        this.mAutoScale = true;
        Element child = Utils.getChild(element, Callbacks.TAG_NAME);
        if (child != null) {
            this.mCallbacks = new Callbacks(child, this);
        }
        this.mXfermodeNumExp = Expression.build(getVariables(), getAttr(element, "xfermodeNum"));
        String attr = getAttr(element, "xfermode");
        if (this.mXfermodeNumExp == null && !TextUtils.isEmpty(attr)) {
            this.mMode = Utils.getPorterDuffMode(attr);
            PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(this.mMode);
            this.mXferMode = porterDuffXfermode;
            this.mFillPaint.setXfermode(porterDuffXfermode);
            this.mStrokePaint.setXfermode(this.mXferMode);
        }
        String attr2 = getAttr(element, "autoScale");
        if (TextUtils.isEmpty(attr2)) {
            return;
        }
        this.mAutoScale = Boolean.parseBoolean(attr2);
    }

    private GraphicsShader getGraphicsShader(int i2, int[] iArr, float[] fArr, String str, String str2, int i3) {
        boolean zIsShaderParmsChanged;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        if (i3 >= 0 && i3 < Shader.TileMode.values().length) {
            tileMode = Shader.TileMode.values()[i3];
        }
        Object graphicsShader = getVariables().get(str2);
        if (graphicsShader == null) {
            graphicsShader = new GraphicsShader();
            zIsShaderParmsChanged = true;
            getVariables().put(str2, graphicsShader);
        } else {
            zIsShaderParmsChanged = false;
        }
        if (!(graphicsShader instanceof GraphicsShader)) {
            return null;
        }
        GraphicsShader graphicsShader2 = (GraphicsShader) graphicsShader;
        if (!zIsShaderParmsChanged) {
            zIsShaderParmsChanged = isShaderParmsChanged(graphicsShader2, i2, iArr, fArr, str, tileMode);
        }
        boolean z2 = zIsShaderParmsChanged;
        if (z2 && !resetShader(graphicsShader2, i2, iArr, fArr, str, tileMode)) {
            return null;
        }
        resetMatrixIfNecessary(z2, graphicsShader2, i2, str);
        return graphicsShader2;
    }

    private boolean isShaderParmsChanged(GraphicsShader graphicsShader, int i2, int[] iArr, float[] fArr, String str, Shader.TileMode tileMode) {
        if (graphicsShader.mShader == null || i2 != graphicsShader.mShaderType || iArr.length != graphicsShader.mColors.length || (((fArr == null || graphicsShader.mStops == null) && (fArr != null || graphicsShader.mStops != null)) || tileMode != graphicsShader.mTileMode || !str.equals(graphicsShader.mMatrixName))) {
            return true;
        }
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (graphicsShader.mColors[i3] != iArr[i3]) {
                return true;
            }
            if (fArr != null && graphicsShader.mStops[i3] != fArr[i3]) {
                return true;
            }
        }
        return false;
    }

    private boolean isValid() {
        if (Looper.getMainLooper() == Looper.myLooper() && this.mCanvas != null) {
            return true;
        }
        MamlLog.m17851e(LOG_TAG, "Call maml graphics api not in onDraw callback");
        return false;
    }

    private void resetMatrixIfNecessary(boolean z2, GraphicsShader graphicsShader, int i2, String str) {
        Object obj = getVariables().get(str);
        if (obj == null || !(obj instanceof GraphicsMatrix) || graphicsShader.mShader == null) {
            return;
        }
        GraphicsMatrix graphicsMatrix = (GraphicsMatrix) obj;
        if (z2 || graphicsMatrix.mChanged) {
            graphicsMatrix.reset();
            if (i2 == 1) {
                graphicsMatrix.setPolyToPoly(new float[]{0.0f, 0.0f, 1.0f, 1.0f}, 0, graphicsMatrix.mParm, 0, 2);
            } else if (i2 == 2) {
                float[] fArr = graphicsMatrix.mParm;
                graphicsMatrix.preTranslate(-fArr[0], -fArr[1]);
                float[] fArr2 = graphicsMatrix.mParm;
                graphicsMatrix.setScale(fArr2[2], -fArr2[3]);
                float[] fArr3 = graphicsMatrix.mParm;
                graphicsMatrix.postTranslate(fArr3[0], fArr3[1]);
            }
            graphicsMatrix.mChanged = false;
            graphicsShader.mShader.setLocalMatrix(graphicsMatrix);
        }
    }

    private boolean resetShader(GraphicsShader graphicsShader, int i2, int[] iArr, float[] fArr, String str, Shader.TileMode tileMode) {
        if (i2 == 1) {
            graphicsShader.mShader = new LinearGradient(0.0f, 0.0f, 1.0f, 1.0f, iArr, fArr, tileMode);
        } else {
            if (i2 != 2) {
                MamlLog.m17851e(LOG_TAG, "wrong shader type " + i2);
                return false;
            }
            graphicsShader.mShader = new RadialGradient(0.0f, 0.0f, 1.0f, iArr, fArr, tileMode);
        }
        graphicsShader.mColors = (int[]) iArr.clone();
        if (fArr != null) {
            graphicsShader.mStops = (float[]) fArr.clone();
        } else {
            graphicsShader.mStops = null;
        }
        graphicsShader.mMatrixName = str;
        graphicsShader.mShaderType = i2;
        graphicsShader.mTileMode = tileMode;
        return true;
    }

    private void setColorFilterInternal(ColorFilter colorFilter) {
        this.mFillPaint.setColorFilter(colorFilter);
        this.mStrokePaint.setColorFilter(colorFilter);
    }

    public void beginFill(int i2) {
        this.mFillPaint.setShader(null);
        this.mFillPaint.setColor(i2);
    }

    public void beginGradientFill(int i2, int[] iArr, float[] fArr, String str, String str2, int i3) {
        GraphicsShader graphicsShader;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (graphicsShader = getGraphicsShader(i2, iArr, fArr, str, str2, i3)) == null) {
            return;
        }
        this.mFillPaint.setShader(graphicsShader.mShader);
    }

    public void createOrUpdateGradientBox(float f2, float f3, float f4, float f5, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Object graphicsMatrix = getVariables().get(str);
        if (graphicsMatrix == null) {
            graphicsMatrix = new GraphicsMatrix();
            getVariables().put(str, graphicsMatrix);
        }
        if (graphicsMatrix instanceof GraphicsMatrix) {
            GraphicsMatrix graphicsMatrix2 = (GraphicsMatrix) graphicsMatrix;
            float[] fArr = graphicsMatrix2.mParm;
            if (fArr[0] == f2 && fArr[1] == f3 && fArr[2] == f4 && fArr[3] == f5) {
                return;
            }
            fArr[0] = f2;
            fArr[1] = f3;
            fArr[2] = f4;
            fArr[3] = f5;
            graphicsMatrix2.mChanged = true;
        }
    }

    public void cubicCurveTo(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (isValid()) {
            this.mPath.rewind();
            this.mPath.moveTo(this.mCurrentX, this.mCurrentY);
            this.mPath.cubicTo(f2, f3, f4, f5, f6, f7);
            this.mCanvas.drawPath(this.mPath, this.mStrokePaint);
            this.mCurrentX = f6;
            this.mCurrentY = f7;
        }
    }

    public void curveTo(float f2, float f3, float f4, float f5) {
        if (isValid()) {
            this.mPath.rewind();
            this.mPath.moveTo(this.mCurrentX, this.mCurrentY);
            this.mPath.quadTo(f2, f3, f4, f5);
            this.mCanvas.drawPath(this.mPath, this.mStrokePaint);
            this.mCurrentX = f4;
            this.mCurrentY = f5;
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    protected void doRender(Canvas canvas) {
        int width = (int) getWidth();
        int height = (int) getHeight();
        canvas.getClipBounds(this.mCanvasBounds);
        Rect rect = this.mCanvasBounds;
        int i2 = rect.right;
        int i3 = rect.left;
        int i4 = i2 - i3;
        int i5 = rect.bottom;
        int i6 = rect.top;
        int i7 = i5 - i6;
        if (i4 > 0 && i4 < width) {
            width = i4;
        }
        if (i7 > 0 && i7 < height) {
            height = i7;
        }
        canvas.clipRect(i3, i6, width, height);
        synchronized (getRoot().getRenderMutex()) {
            this.mCurrentX = 0.0f;
            this.mCurrentY = 0.0f;
            this.mCanvas = canvas;
            Callbacks callbacks = this.mCallbacks;
            if (callbacks != null) {
                callbacks.perform();
            }
            FunctionElement functionElement = this.mRenderListener;
            if (functionElement != null) {
                functionElement.perform();
            }
            this.mCanvas = null;
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void doTick(long j2) {
        PorterDuff.Mode porterDuffMode;
        super.doTick(j2);
        if (isVisible()) {
            Expression expression = this.mXfermodeNumExp;
            if (expression != null && (porterDuffMode = Utils.getPorterDuffMode((int) expression.evaluate())) != this.mMode) {
                this.mMode = porterDuffMode;
                PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(this.mMode);
                this.mXferMode = porterDuffXfermode;
                this.mFillPaint.setXfermode(porterDuffXfermode);
                this.mStrokePaint.setXfermode(this.mXferMode);
            }
            int i2 = this.mLastAlpha;
            int i3 = this.mAlpha;
            if (i2 != i3) {
                this.mFillPaint.setAlpha(i3);
                this.mStrokePaint.setAlpha(this.mAlpha);
                this.mLastAlpha = this.mAlpha;
            }
            if (this.mTintChanged) {
                setColorFilterInternal(this.mTintFilter);
            }
        }
    }

    public void drawCircle(float f2, float f3, float f4) {
        if (isValid()) {
            this.mCanvas.drawCircle(f2, f3, f4, this.mFillPaint);
            if (this.mStrokePaint.getStrokeWidth() > 0.0f) {
                this.mCanvas.drawCircle(f2, f3, f4 + (this.mStrokePaint.getStrokeWidth() / 2.0f), this.mStrokePaint);
            }
        }
    }

    public void drawEllipse(float f2, float f3, float f4, float f5) {
        if (!isValid() || f4 < 0.0f || f5 < 0.0f) {
            return;
        }
        float f6 = f5 / 2.0f;
        float f7 = f3 - f6;
        float f8 = f3 + f6;
        float f9 = f4 / 2.0f;
        float f10 = f2 - f9;
        float f11 = f2 + f9;
        this.mCanvas.drawOval(f10, f7, f11, f8, this.mFillPaint);
        float strokeWidth = this.mStrokePaint.getStrokeWidth();
        if (strokeWidth > 0.0f) {
            float f12 = strokeWidth / 2.0f;
            this.mCanvas.drawOval(f10 - f12, f7 - f12, f11 + f12, f8 + f12, this.mStrokePaint);
        }
    }

    public void drawRect(float f2, float f3, float f4, float f5) {
        drawRoundRect(f2, f3, f4, f5, 0.0f, 0.0f);
    }

    public void drawRoundRect(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (!isValid() || f4 < 0.0f || f5 < 0.0f) {
            return;
        }
        float f8 = f3 + f5;
        float f9 = f2 + f4;
        this.mCanvas.drawRoundRect(f2, f3, f9, f8, f6, f7, this.mFillPaint);
        float strokeWidth = this.mStrokePaint.getStrokeWidth();
        if (strokeWidth > 0.0f) {
            float f10 = strokeWidth / 2.0f;
            this.mCanvas.drawRoundRect(f2 - f10, f3 - f10, f9 + f10, f8 + f10, f6, f7, this.mStrokePaint);
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.finish();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getScaleX() {
        float widthRaw = getWidthRaw();
        if (this.mAutoScale) {
            float f2 = this.mInitRawWidth;
            if (f2 > 0.0f && widthRaw > 0.0f) {
                return (widthRaw / f2) * super.getScaleX();
            }
        }
        return super.getScaleX();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement
    public float getScaleY() {
        float heightRaw = getHeightRaw();
        if (this.mAutoScale) {
            float f2 = this.mInitRawHeight;
            if (f2 > 0.0f && heightRaw > 0.0f) {
                return (heightRaw / f2) * super.getScaleY();
            }
        }
        return super.getScaleY();
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        this.mInitRawWidth = getWidthRaw();
        this.mInitRawHeight = getHeightRaw();
        this.mFillPaint.setStyle(Paint.Style.FILL);
        this.mStrokePaint.setStyle(Paint.Style.STROKE);
        this.mFillPaint.setAntiAlias(true);
        this.mStrokePaint.setAntiAlias(true);
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.init();
        }
        this.mLastAlpha = evaluateAlpha();
    }

    public void lineGradientStyle(int i2, int[] iArr, float[] fArr, String str, String str2, int i3) {
        GraphicsShader graphicsShader;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (graphicsShader = getGraphicsShader(i2, iArr, fArr, str, str2, i3)) == null) {
            return;
        }
        this.mStrokePaint.setShader(graphicsShader.mShader);
    }

    public void lineStyle(float f2, int i2, int i3, int i4, float f3) {
        Paint.Cap cap = Paint.Cap.ROUND;
        if (i3 >= 0 && i3 < Paint.Cap.values().length) {
            cap = Paint.Cap.values()[i3];
        }
        Paint.Join join = Paint.Join.ROUND;
        if (i4 >= 0 && i4 < Paint.Join.values().length) {
            join = Paint.Join.values()[i3];
        }
        this.mStrokePaint.setShader(null);
        if (f2 >= 0.0f) {
            this.mStrokePaint.setStrokeWidth(f2);
        }
        this.mStrokePaint.setColor(i2);
        this.mStrokePaint.setStrokeCap(cap);
        this.mStrokePaint.setStrokeJoin(join);
        if (f3 > 0.0f) {
            this.mStrokePaint.setStrokeMiter(f3);
        }
    }

    public void lineTo(float f2, float f3) {
        if (isValid()) {
            this.mCanvas.drawLine(this.mCurrentX, this.mCurrentY, f2, f3, this.mStrokePaint);
            this.mCurrentX = f2;
            this.mCurrentY = f3;
        }
    }

    public void moveTo(float f2, float f3) {
        if (isValid()) {
            this.mCurrentX = f2;
            this.mCurrentY = f3;
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void pause() {
        super.pause();
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.pause();
        }
    }

    @Override // com.miui.maml.elements.ScreenElement
    public void resume() {
        super.resume();
        Callbacks callbacks = this.mCallbacks;
        if (callbacks != null) {
            callbacks.resume();
        }
    }

    @Override // com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        setColorFilterInternal(colorFilter);
    }

    public void setRenderListener(FunctionElement functionElement) {
        this.mRenderListener = functionElement;
    }
}
