package com.miui.maml.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.audiofx.Visualizer;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.exoplayer2.util.wvg;
import com.miui.maml.C5134R;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.SystemProperties;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class SpectrumVisualizer extends ImageView {
    private static final int CONSIDER_SAMPLE_LENGTH = 160;
    private static final String TAG = "SpectrumVisualizer";
    private static final int VISUALIZATION_SAMPLE_LENGTH = 256;
    private float INDEX_SCALE_FACTOR;
    private final int MAX_VALID_SAMPLE;
    private float SAMPLE_SCALE_FACTOR;
    private float VISUALIZE_DESC_HEIGHT;
    int mAlphaWidthNum;
    private AudioManager mAudioManager;
    private Bitmap mCachedBitmap;
    private Canvas mCachedCanvas;
    int mCellSize;
    int mDotbarHeight;
    private DotBarDrawer mDrawer;
    private boolean mEnableDrawing;
    private boolean mIsEnableUpdate;
    private boolean mIsNeedCareStreamActive;
    private Visualizer.OnDataCaptureListener mOnDataCaptureListener;
    Paint mPaint;
    int[] mPixels;
    float[] mPointData;
    private short[] mSampleBuf;
    int mShadowDotbarHeight;
    int[] mShadowPixels;
    private boolean mSoftDrawEnabled;
    private int mVisualizationHeight;
    int mVisualizationHeightNum;
    private int mVisualizationWidth;
    int mVisualizationWidthNum;
    private Visualizer mVisualizer;
    public static boolean IS_LPA_DECODE = SystemProperties.getBoolean("persist.sys.lpa.decode", false);
    private static final int RES_DEFAULT_SLIDING_PANEL_ID = C5134R.drawable.sliding_panel_visualization_bg;
    private static final int RES_DEFAULT_SLIDING_DOT_BAR_ID = C5134R.drawable.sliding_panel_visualization_dot_bar;
    private static final int RES_DEFAULT_SLIDING_SHADOW_DOT_BAR_ID = C5134R.drawable.sliding_panel_visualization_shadow_dot_bar;

    class AsymmetryDotBar implements DotBarDrawer {
        AsymmetryDotBar() {
        }

        @Override // com.miui.maml.widget.SpectrumVisualizer.DotBarDrawer
        public void drawDotBar(Canvas canvas, int i2) {
            SpectrumVisualizer spectrumVisualizer = SpectrumVisualizer.this;
            int i3 = spectrumVisualizer.mDotbarHeight;
            float f2 = i3 * (1.0f - spectrumVisualizer.mPointData[i2]);
            int i4 = spectrumVisualizer.mCellSize;
            int i5 = ((int) (((double) (f2 / i4)) + 0.5d)) * i4;
            if (i5 < i3) {
                canvas.drawBitmap(spectrumVisualizer.mPixels, i4 * i5, i4, i4 * i2, i5, i4, i3 - i5, true, spectrumVisualizer.mPaint);
            }
        }
    }

    private interface DotBarDrawer {
        void drawDotBar(Canvas canvas, int i2);
    }

    class SymmetryDotBar implements DotBarDrawer {
        SymmetryDotBar() {
        }

        @Override // com.miui.maml.widget.SpectrumVisualizer.DotBarDrawer
        public void drawDotBar(Canvas canvas, int i2) {
            SpectrumVisualizer spectrumVisualizer = SpectrumVisualizer.this;
            int i3 = spectrumVisualizer.mDotbarHeight;
            float f2 = i3 * (1.0f - spectrumVisualizer.mPointData[i2]);
            int i4 = spectrumVisualizer.mCellSize;
            int i5 = ((int) (((double) (f2 / i4)) + 0.5d)) * i4;
            if (i5 < i3) {
                canvas.drawBitmap(spectrumVisualizer.mPixels, i4 * i5, i4, i4 * i2, i5, i4, i3 - i5, true, spectrumVisualizer.mPaint);
            }
            SpectrumVisualizer spectrumVisualizer2 = SpectrumVisualizer.this;
            int i6 = spectrumVisualizer2.mShadowDotbarHeight;
            float f3 = i6 * spectrumVisualizer2.mPointData[i2];
            int i7 = spectrumVisualizer2.mCellSize;
            int i8 = ((int) (((double) (f3 / i7)) + 0.5d)) * i7;
            int i9 = i8 > i6 ? i6 : i8;
            if (i9 > 0) {
                canvas.drawBitmap(spectrumVisualizer2.mShadowPixels, 0, i7, i7 * i2, spectrumVisualizer2.mDotbarHeight, i7, i9, true, spectrumVisualizer2.mPaint);
            }
        }
    }

    public SpectrumVisualizer(Context context) {
        this(context, null);
    }

    private void drawInternal(Canvas canvas) {
        this.mPaint.setAlpha(255);
        int i2 = this.mVisualizationWidthNum;
        int i3 = this.mAlphaWidthNum;
        int i4 = i2 - i3;
        while (i3 < i4) {
            this.mDrawer.drawDotBar(canvas, i3);
            i3++;
        }
        for (int i5 = this.mAlphaWidthNum; i5 > 0; i5--) {
            this.mPaint.setAlpha((i5 * 255) / this.mAlphaWidthNum);
            this.mDrawer.drawDotBar(canvas, i5 - 1);
            this.mDrawer.drawDotBar(canvas, this.mVisualizationWidthNum - i5);
        }
    }

    private Bitmap drawToBitmap() {
        Bitmap bitmapCreateBitmap = this.mCachedBitmap;
        Canvas canvas = this.mCachedCanvas;
        if (bitmapCreateBitmap != null && (bitmapCreateBitmap.getWidth() != getWidth() || bitmapCreateBitmap.getHeight() != getHeight())) {
            bitmapCreateBitmap.recycle();
            bitmapCreateBitmap = null;
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.mCachedBitmap = bitmapCreateBitmap;
            canvas = new Canvas(bitmapCreateBitmap);
            this.mCachedCanvas = canvas;
        }
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        drawInternal(canvas);
        return bitmapCreateBitmap;
    }

    private void init(Context context, AttributeSet attributeSet) {
    }

    public void enableDrawing(boolean z2) {
        this.mEnableDrawing = z2;
    }

    public void enableUpdate(boolean z2) {
        Visualizer visualizer;
        try {
            if (this.mIsEnableUpdate != z2) {
                if (z2 && this.mVisualizer == null) {
                    if (IS_LPA_DECODE) {
                        MamlLog.m17850d("SpectrumVisualizer", "lpa decode is on, can't enable");
                    } else {
                        Visualizer visualizer2 = new Visualizer(0);
                        this.mVisualizer = visualizer2;
                        if (!visualizer2.getEnabled()) {
                            this.mVisualizer.setCaptureSize(512);
                            this.mVisualizer.setDataCaptureListener(this.mOnDataCaptureListener, Visualizer.getMaxCaptureRate(), false, true);
                            this.mVisualizer.setEnabled(true);
                        }
                    }
                } else if (!z2 && (visualizer = this.mVisualizer) != null) {
                    visualizer.setEnabled(false);
                    this.mVisualizer.release();
                    this.mVisualizer = null;
                }
                this.mIsEnableUpdate = z2;
            }
        } catch (IllegalStateException | RuntimeException unused) {
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
    }

    public int getVisualHeight() {
        return this.mVisualizationHeight;
    }

    public int getVisualWidth() {
        return this.mVisualizationWidth;
    }

    public boolean isUpdateEnabled() {
        return this.mIsEnableUpdate;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mEnableDrawing) {
            if (this.mSoftDrawEnabled) {
                canvas.drawBitmap(drawToBitmap(), 0.0f, 0.0f, (Paint) null);
            } else {
                drawInternal(canvas);
            }
        }
    }

    public void setAlphaNum(int i2) {
        if (i2 <= 0) {
            this.mAlphaWidthNum = 0;
            return;
        }
        int i3 = this.mVisualizationWidthNum;
        if (i2 > i3 / 2) {
            i2 = i3 / 2;
        }
        this.mAlphaWidthNum = i2;
    }

    public void setBitmaps(Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        setImageBitmap(bitmap);
        setBitmaps(bitmap.getWidth(), bitmap.getHeight(), bitmap2, bitmap3);
    }

    public void setSoftDrawEnabled(boolean z2) {
        Bitmap bitmap;
        this.mSoftDrawEnabled = z2;
        if (z2 || (bitmap = this.mCachedBitmap) == null) {
            return;
        }
        bitmap.recycle();
        this.mCachedBitmap = null;
        this.mCachedCanvas = null;
    }

    void update(byte[] bArr) {
        float f2;
        if (this.mIsNeedCareStreamActive && !this.mAudioManager.isMusicActive()) {
            enableDrawing(false);
            return;
        }
        enableDrawing(true);
        if (bArr == null) {
            return;
        }
        short[] sArr = this.mSampleBuf;
        int length = sArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            byte b2 = bArr[i3];
            byte b3 = bArr[i3 + 1];
            int iSqrt = (int) Math.sqrt((b2 * b2) + (b3 * b3));
            if (iSqrt >= 32767) {
                iSqrt = 32767;
            }
            sArr[i2] = (short) iSqrt;
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.mVisualizationWidthNum; i6++) {
            int iMax = 0;
            while (i5 < length) {
                iMax = Math.max(iMax, (int) sArr[i4]);
                i4++;
                i5 += this.mVisualizationWidthNum;
            }
            i5 -= length;
            if (iMax > 1) {
                float fLog = (float) (Math.log(i6 + 2) / ((double) this.INDEX_SCALE_FACTOR));
                f2 = (iMax - 1) * fLog * fLog;
            } else {
                f2 = 0.0f;
            }
            float f3 = f2 > 20.0f ? this.mVisualizationHeightNum : f2 / this.SAMPLE_SCALE_FACTOR;
            float[] fArr = this.mPointData;
            fArr[i6] = Math.max(f3 / this.mVisualizationHeightNum, fArr[i6] - this.VISUALIZE_DESC_HEIGHT);
        }
        invalidate();
    }

    public SpectrumVisualizer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpectrumVisualizer(Context context, AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        super(context, attributeSet, i2);
        this.mPaint = new Paint();
        this.mSampleBuf = new short[160];
        this.mSoftDrawEnabled = true;
        this.mOnDataCaptureListener = new Visualizer.OnDataCaptureListener() { // from class: com.miui.maml.widget.SpectrumVisualizer.1
            @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
            public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i3) {
                SpectrumVisualizer.this.update(bArr);
            }

            @Override // android.media.audiofx.Visualizer.OnDataCaptureListener
            public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i3) {
            }
        };
        this.MAX_VALID_SAMPLE = 20;
        this.mEnableDrawing = true;
        this.mIsNeedCareStreamActive = true;
        boolean z2 = false;
        this.mAlphaWidthNum = 0;
        this.mAudioManager = (AudioManager) context.getSystemService(wvg.f67137toq);
        Bitmap bitmap = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5134R.styleable.SpectrumVisualizer);
            drawable = typedArrayObtainStyledAttributes.getDrawable(C5134R.styleable.SpectrumVisualizer_sliding_panel);
            drawable2 = typedArrayObtainStyledAttributes.getDrawable(C5134R.styleable.SpectrumVisualizer_sliding_dot_bar);
            drawable3 = typedArrayObtainStyledAttributes.getDrawable(C5134R.styleable.SpectrumVisualizer_sliding_shadow_dot_bar);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C5134R.styleable.SpectrumVisualizer_symmetry, false);
            this.mAlphaWidthNum = typedArrayObtainStyledAttributes.getInt(C5134R.styleable.SpectrumVisualizer_alpha_width, this.mAlphaWidthNum);
            this.mIsEnableUpdate = typedArrayObtainStyledAttributes.getBoolean(C5134R.styleable.SpectrumVisualizer_update_enable, false);
            this.mIsNeedCareStreamActive = typedArrayObtainStyledAttributes.getBoolean(C5134R.styleable.SpectrumVisualizer_care_streamactive, false);
            typedArrayObtainStyledAttributes.recycle();
            z2 = z3;
        } else {
            drawable = null;
            drawable2 = null;
            drawable3 = null;
        }
        Bitmap bitmap2 = ((BitmapDrawable) (drawable == null ? context.getResources().getDrawable(RES_DEFAULT_SLIDING_PANEL_ID) : drawable)).getBitmap();
        Bitmap bitmap3 = ((BitmapDrawable) (drawable2 == null ? context.getResources().getDrawable(RES_DEFAULT_SLIDING_DOT_BAR_ID) : drawable2)).getBitmap();
        if (z2) {
            bitmap = ((BitmapDrawable) (drawable3 == null ? context.getResources().getDrawable(RES_DEFAULT_SLIDING_SHADOW_DOT_BAR_ID) : drawable3)).getBitmap();
        }
        setBitmaps(bitmap2, bitmap3, bitmap);
    }

    public void setBitmaps(int i2, int i3, Bitmap bitmap, Bitmap bitmap2) {
        this.mVisualizationWidth = i2;
        this.mVisualizationHeight = i3;
        this.mCellSize = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.mDotbarHeight = height;
        int i4 = this.mVisualizationHeight;
        if (height > i4) {
            this.mDotbarHeight = i4;
        }
        int i5 = this.mCellSize;
        int i6 = this.mDotbarHeight;
        int[] iArr = new int[i5 * i6];
        this.mPixels = iArr;
        bitmap.getPixels(iArr, 0, i5, 0, 0, i5, i6);
        int i7 = this.mVisualizationWidth;
        int i8 = this.mCellSize;
        this.mVisualizationWidthNum = i7 / i8;
        int i9 = this.mDotbarHeight / i8;
        this.mVisualizationHeightNum = i9;
        this.SAMPLE_SCALE_FACTOR = 20.0f / i9;
        this.INDEX_SCALE_FACTOR = (float) Math.log(r9 / 3);
        this.VISUALIZE_DESC_HEIGHT = 1.0f / this.mVisualizationHeightNum;
        int i10 = this.mVisualizationWidthNum;
        this.mPointData = new float[i10];
        if (this.mAlphaWidthNum == 0) {
            this.mAlphaWidthNum = i10 / 2;
        }
        this.mShadowPixels = null;
        if (bitmap2 != null) {
            int height2 = bitmap2.getHeight();
            this.mShadowDotbarHeight = height2;
            int i11 = this.mDotbarHeight;
            int i12 = height2 + i11;
            int i13 = this.mVisualizationHeight;
            if (i12 > i13) {
                this.mShadowDotbarHeight = i13 - i11;
            }
            int i14 = this.mShadowDotbarHeight;
            int i15 = this.mCellSize;
            if (i14 < i15) {
                this.mDrawer = new AsymmetryDotBar();
                return;
            }
            int[] iArr2 = new int[i15 * i14];
            this.mShadowPixels = iArr2;
            bitmap2.getPixels(iArr2, 0, i15, 0, 0, i15, i14);
            this.mDrawer = new SymmetryDotBar();
            return;
        }
        this.mDrawer = new AsymmetryDotBar();
    }
}
