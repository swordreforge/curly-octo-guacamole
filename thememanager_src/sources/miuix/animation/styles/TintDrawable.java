package miuix.animation.styles;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import miuix.animation.C6839R;
import miuix.animation.Folme;
import miuix.animation.ITouchStyle;
import miuix.animation.property.ViewPropertyExt;
import miuix.animation.utils.CommonUtils;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class TintDrawable extends Drawable {
    private static final View.OnAttachStateChangeListener sListener = new View.OnAttachStateChangeListener() { // from class: miuix.animation.styles.TintDrawable.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            TintDrawable tintDrawable = TintDrawable.get(view);
            if (tintDrawable != null) {
                Drawable drawable = tintDrawable.mOriDrawable;
                if (drawable != null) {
                    view.setForeground(drawable);
                }
                tintDrawable.clear();
                view.removeOnAttachStateChangeListener(this);
            }
        }
    };
    private Bitmap mBitmap;
    private Drawable mOriDrawable;
    private View mView;
    private final int TINT_STYLE_VIEW_SHAPE = 1;
    private final int TINT_STYLE_RECT_ROUND = 2;
    private final int TINT_STYLE_HOVER = 4;
    private final float TOUCH_RADIUS_RECT_ROUND_DEFAULT = 26.0f;
    private Paint mPaint = new Paint();
    private RectF mBounds = new RectF();
    private Rect mSrcRect = new Rect();
    private RectF mCornerBounds = new RectF();
    private int mTintStyle = 1;
    private float mHoverRadius = 0.0f;
    private float[] mTouchRadius = {0.0f};
    private RectF mTouchRectRoundRect = null;
    private RectF mTouchRectRoundPadding = new RectF();
    private ITouchStyle.TouchRectGravity mTouchRectGravity = ITouchStyle.TouchRectGravity.CENTER_IN_PARENT;
    private int mTouchRectLocationMode = 1;

    /* JADX INFO: renamed from: miuix.animation.styles.TintDrawable$3 */
    static /* synthetic */ class C68893 {
        static final /* synthetic */ int[] $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity;

        static {
            int[] iArr = new int[ITouchStyle.TouchRectGravity.values().length];
            $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity = iArr;
            try {
                iArr[ITouchStyle.TouchRectGravity.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity[ITouchStyle.TouchRectGravity.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity[ITouchStyle.TouchRectGravity.CENTER_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity[ITouchStyle.TouchRectGravity.CENTER_IN_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clear() {
        recycleBitmap();
    }

    private void createBitmap(int i2, int i3) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null && bitmap.getWidth() == i2 && this.mBitmap.getHeight() == this.mView.getHeight()) {
            return;
        }
        recycleBitmap();
        this.mPaint.setAntiAlias(true);
        try {
            this.mBitmap = Bitmap.createBitmap(this.mView.getResources().getDisplayMetrics(), i2, i3, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            Log.w(CommonUtils.TAG, "TintDrawable.createBitmap failed, out of memory");
        }
    }

    private void drawBlackeningByExtractingBg(Canvas canvas, int i2) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            this.mView.setForeground(this.mOriDrawable);
        } else {
            this.mPaint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(this.mBitmap, this.mSrcRect, this.mBounds, this.mPaint);
        }
    }

    private void drawHoverTint(@lvui Canvas canvas, int i2) {
        this.mCornerBounds.set(this.mSrcRect);
        this.mPaint.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        RectF rectF = this.mCornerBounds;
        float f2 = this.mHoverRadius;
        canvas.drawRoundRect(rectF, f2, f2, this.mPaint);
    }

    private void drawRectRound(@lvui Canvas canvas, int i2) {
        this.mPaint.setAntiAlias(true);
        this.mPaint.setShader(null);
        this.mPaint.setColorFilter(null);
        this.mPaint.setColor(i2);
        int i3 = this.mTouchRectLocationMode;
        if (i3 == 1) {
            setBounds(this.mView.getWidth(), this.mView.getHeight());
            realPerFromDrawRoundRect(canvas, i2, this.mBounds);
            return;
        }
        if (i3 != 4) {
            if (i3 != 4104) {
                return;
            }
            perFromDrawRoundRectRelative(canvas, i2);
            return;
        }
        setBounds(this.mView.getWidth(), this.mView.getHeight());
        RectF rectF = this.mCornerBounds;
        float f2 = this.mSrcRect.left;
        RectF rectF2 = this.mTouchRectRoundPadding;
        rectF.left = f2 + rectF2.left;
        rectF.top = r1.top + rectF2.top;
        rectF.right = r1.right - rectF2.right;
        rectF.bottom = r1.bottom - rectF2.bottom;
        if (rectF.width() < 0.0f) {
            RectF rectF3 = this.mCornerBounds;
            rectF3.right = rectF3.left;
        }
        if (this.mCornerBounds.height() < 0.0f) {
            RectF rectF4 = this.mCornerBounds;
            rectF4.bottom = rectF4.top;
        }
        realPerFromDrawRoundRect(canvas, i2, this.mCornerBounds);
    }

    public static TintDrawable get(View view) {
        Drawable foreground = view.getForeground();
        if (foreground instanceof TintDrawable) {
            return (TintDrawable) foreground;
        }
        return null;
    }

    private void getRectRoundEnableFromView(int i2) {
        this.mTintStyle = i2 == 3 ? 2 : this.mTintStyle;
    }

    private void getRectRoundGravityFromView() {
        Object tag = this.mView.getTag(C6839R.id.miuix_animation_tag_view_touch_rect_gravity);
        if (tag instanceof ITouchStyle.TouchRectGravity) {
            this.mTouchRectGravity = (ITouchStyle.TouchRectGravity) tag;
        }
    }

    private void getRectRoundPaddingsFromView() {
        Object tag = this.mView.getTag(C6839R.id.miuix_animation_tag_view_touch_padding_rect);
        if (!(tag instanceof RectF)) {
            RectF rectF = this.mTouchRectRoundPadding;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = 0.0f;
            rectF.bottom = 0.0f;
            return;
        }
        RectF rectF2 = (RectF) tag;
        this.mTouchRectRoundPadding.left = Math.max(rectF2.left, 0.0f);
        this.mTouchRectRoundPadding.top = Math.max(rectF2.top, 0.0f);
        this.mTouchRectRoundPadding.right = Math.max(rectF2.right, 0.0f);
        this.mTouchRectRoundPadding.bottom = Math.max(rectF2.bottom, 0.0f);
    }

    private void getRectRoundRadiusFromView() {
        Object tag = this.mView.getTag(C6839R.id.miuix_animation_tag_view_touch_corners);
        if ((tag instanceof Float) || (tag instanceof Integer)) {
            this.mTouchRadius = new float[]{((Float) tag).floatValue()};
            return;
        }
        if (!(tag instanceof RectF)) {
            this.mTouchRadius = new float[]{26.0f};
            return;
        }
        float[] fArr = {26.0f, 26.0f, 26.0f, 26.0f, 26.0f, 26.0f, 26.0f, 26.0f};
        this.mTouchRadius = fArr;
        RectF rectF = (RectF) tag;
        fArr[0] = Math.max(rectF.left, 0.0f);
        this.mTouchRadius[1] = Math.max(rectF.left, 0.0f);
        this.mTouchRadius[2] = Math.max(rectF.top, 0.0f);
        this.mTouchRadius[3] = Math.max(rectF.top, 0.0f);
        this.mTouchRadius[4] = Math.max(rectF.right, 0.0f);
        this.mTouchRadius[5] = Math.max(rectF.right, 0.0f);
        this.mTouchRadius[6] = Math.max(rectF.bottom, 0.0f);
        this.mTouchRadius[7] = Math.max(rectF.bottom, 0.0f);
    }

    private void getTouchLocationModeFromView() {
        Object tag = this.mView.getTag(C6839R.id.miuix_animation_tag_view_touch_rect_location_mode);
        if (tag instanceof Integer) {
            this.mTouchRectLocationMode = ((Integer) tag).intValue();
        } else {
            this.mTouchRectLocationMode = 1;
        }
    }

    private void getTouchRectFromView() {
        Object tag = this.mView.getTag(C6839R.id.miuix_animation_tag_view_touch_rect);
        if (tag instanceof RectF) {
            this.mTouchRectRoundRect = new RectF((RectF) tag);
        } else {
            this.mTouchRectRoundRect = null;
        }
    }

    private void initBitmap(int i2) {
        Bitmap bitmap = this.mBitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            this.mView.setForeground(this.mOriDrawable);
            return;
        }
        try {
            this.mBitmap.eraseColor(0);
            Canvas canvas = new Canvas(this.mBitmap);
            canvas.translate(-this.mView.getScrollX(), -this.mView.getScrollY());
            this.mView.setForeground(this.mOriDrawable);
            this.mView.draw(canvas);
            this.mView.setForeground(this);
            if (i2 == 0) {
                try {
                    this.mPaint.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, Float.MAX_VALUE, 0.0f})));
                    canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
                } catch (Exception unused) {
                    Log.w(CommonUtils.TAG, "the Bitmap empty or Recycled");
                }
            }
        } catch (Exception e2) {
            Log.w(CommonUtils.TAG, "TintDrawable.initBitmap failed, " + e2);
        }
    }

    private void perFromDrawRoundRectRelative(Canvas canvas, int i2) {
        int i3 = C68893.$SwitchMap$miuix$animation$ITouchStyle$TouchRectGravity[this.mTouchRectGravity.ordinal()];
        if (i3 == 1) {
            setBounds(0.0f, 0.0f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        } else if (i3 == 2) {
            setBounds((this.mView.getWidth() - Math.max(0.0f, this.mTouchRectRoundRect.width())) * 0.5f, 0.0f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        } else if (i3 != 3) {
            setBounds((this.mView.getWidth() - Math.max(0.0f, this.mTouchRectRoundRect.width())) * 0.5f, (this.mView.getHeight() - Math.max(0.0f, this.mTouchRectRoundRect.height())) * 0.5f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        } else {
            setBounds(0.0f, (this.mView.getHeight() - Math.max(0.0f, this.mTouchRectRoundRect.height())) * 0.5f, Math.max(0.0f, this.mTouchRectRoundRect.width()), Math.max(0.0f, this.mTouchRectRoundRect.height()));
        }
        realPerFromDrawRoundRect(canvas, i2, this.mBounds);
    }

    private void processingOOMForDrawBitmap(RuntimeException runtimeException, Canvas canvas) {
        if (runtimeException.getMessage() == null || runtimeException.getMessage().length() <= 0 || !runtimeException.getMessage().contains("Canvas: trying to draw too large")) {
            throw runtimeException;
        }
        try {
            Bitmap bitmapCompressImage = CommonUtils.compressImage(this.mBitmap, 50, 2);
            this.mBitmap = bitmapCompressImage;
            canvas.drawBitmap(bitmapCompressImage, this.mSrcRect, this.mBounds, this.mPaint);
        } catch (Exception e2) {
            Log.w(CommonUtils.TAG, "TintDrawable.processingOOMForDrawBitmap failed, " + e2);
        }
    }

    private void realPerFromDrawRoundRect(@lvui Canvas canvas, int i2, RectF rectF) {
        float[] fArr = this.mTouchRadius;
        if (fArr.length == 1) {
            float f2 = fArr[0];
            canvas.drawRoundRect(rectF, f2, f2, this.mPaint);
        } else if (fArr.length == 8) {
            Path path = new Path();
            path.addRoundRect(rectF, this.mTouchRadius, Path.Direction.CCW);
            canvas.drawPath(path, this.mPaint);
        }
    }

    private void recycleBitmap() {
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
            this.mBitmap = null;
        }
    }

    static TintDrawable setAndGet(final View view) {
        TintDrawable tintDrawable = get(view);
        if (tintDrawable != null) {
            return tintDrawable;
        }
        final TintDrawable tintDrawable2 = new TintDrawable();
        tintDrawable2.mView = view;
        tintDrawable2.setOriDrawable(view.getForeground());
        view.addOnAttachStateChangeListener(sListener);
        Folme.post(view, new Runnable() { // from class: miuix.animation.styles.TintDrawable.2
            @Override // java.lang.Runnable
            public void run() {
                view.setForeground(tintDrawable2);
            }
        });
        return tintDrawable2;
    }

    private void setBounds(float f2, float f3) {
        float scrollX = this.mView.getScrollX();
        float scrollY = this.mView.getScrollY();
        this.mBounds.set(scrollX, scrollY, scrollX + f2, scrollY + f3);
        this.mSrcRect.set(0, 0, (int) f2, (int) f3);
    }

    private void setOriDrawable(Drawable drawable) {
        this.mOriDrawable = drawable;
    }

    private void tintStyleLoadData() {
        getTouchLocationModeFromView();
        int i2 = this.mTouchRectLocationMode;
        if (i2 == 1) {
            getRectRoundRadiusFromView();
            return;
        }
        if (i2 == 2) {
            getRectRoundRadiusFromView();
            getTouchRectFromView();
        } else if (i2 == 4) {
            getRectRoundRadiusFromView();
            getRectRoundPaddingsFromView();
        } else {
            if (i2 != 4104) {
                return;
            }
            getRectRoundRadiusFromView();
            getTouchRectFromView();
            getRectRoundGravityFromView();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        int scrollX = this.mView.getScrollX();
        int scrollY = this.mView.getScrollY();
        int width = this.mView.getWidth();
        int height = this.mView.getHeight();
        this.mBounds.set(scrollX, scrollY, scrollX + width, scrollY + height);
        this.mSrcRect.set(0, 0, width, height);
        canvas.save();
        int intValue = ViewPropertyExt.FOREGROUND.getIntValue(this.mView);
        try {
            try {
                canvas.clipRect(this.mBounds);
                canvas.drawColor(0);
                Drawable drawable = this.mOriDrawable;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                int i2 = this.mTintStyle;
                if (i2 == 2) {
                    drawRectRound(canvas, intValue);
                } else if (i2 != 4) {
                    drawBlackeningByExtractingBg(canvas, intValue);
                } else {
                    drawHoverTint(canvas, intValue);
                }
            } catch (RuntimeException e2) {
                processingOOMForDrawBitmap(e2, canvas);
            }
        } finally {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    void initTintBuffer(int i2) {
        if (this.mView == null) {
            return;
        }
        getRectRoundEnableFromView(i2);
        int i3 = this.mTintStyle;
        if (i3 == 2) {
            tintStyleLoadData();
            return;
        }
        if (i3 != 4) {
            int width = this.mView.getWidth();
            int height = this.mView.getHeight();
            if (width == 0 || height == 0) {
                recycleBitmap();
            } else {
                createBitmap(width, height);
                initBitmap(i2);
            }
        }
    }

    void restoreOriginalDrawable() {
        clear();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
    }

    void setHoverCorner(float f2) {
        this.mTintStyle = f2 != 0.0f ? 4 : this.mTintStyle;
        this.mHoverRadius = f2;
    }

    private void setBounds(float f2, float f3, float f4, float f5) {
        this.mBounds.set(f2, f3, f2 + f4, f3 + f5);
        this.mSrcRect.set(0, 0, (int) f4, (int) f5);
    }
}
