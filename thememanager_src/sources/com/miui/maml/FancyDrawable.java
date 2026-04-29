package com.miui.maml;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.miui.maml.FancyDrawable;
import com.miui.maml.MamlDrawable;
import com.miui.maml.RendererController;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.RendererCoreCache;
import com.miui.maml.util.Utils;

/* JADX INFO: loaded from: classes3.dex */
public class FancyDrawable extends MamlDrawable implements RendererController.IRenderable {
    private static final String LOG_TAG = "FancyDrawable";
    private static final String QUIET_IMAGE_NAME = "quietImage.png";
    private static final int RENDER_TIMEOUT = 100;
    private static final String START_IMAGE_NAME = "startImage.png";
    private static final String USE_QUIET_IMAGE_TAG = "useQuietImage";
    private boolean mPaused;
    private Drawable mQuietDrawable;
    private RendererCore mRendererCore;
    private Drawable mStartDrawable;
    private boolean mTimeOut;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Object mPauseLock = new Object();
    private final Runnable mRenderTimeout = new Runnable() { // from class: com.miui.maml.FancyDrawable.1
        @Override // java.lang.Runnable
        public void run() {
            FancyDrawable.this.mTimeOut = true;
            FancyDrawable.this.doPause();
        }
    };

    static final class FancyDrawableState extends MamlDrawable.MamlDrawableState {
        private static final RendererCoreCache.OnCreateRootCallback mOnCreateRootCallback = new RendererCoreCache.OnCreateRootCallback() { // from class: com.miui.maml.toq
            @Override // com.miui.maml.util.RendererCoreCache.OnCreateRootCallback
            public final void onCreateRoot(ScreenElementRoot screenElementRoot) {
                FancyDrawable.FancyDrawableState.lambda$static$0(screenElementRoot);
            }
        };
        RendererCore mRendererCore;
        private RendererCoreCache mRendererCoreCache;

        public FancyDrawableState(RendererCore rendererCore) {
            this.mRendererCore = rendererCore;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$static$0(ScreenElementRoot screenElementRoot) {
            if (screenElementRoot != null) {
                screenElementRoot.setScaleByDensity(true);
            }
        }

        @Override // com.miui.maml.MamlDrawable.MamlDrawableState
        protected MamlDrawable createDrawable(int i2) {
            if (this.mRendererCoreCache == null) {
                this.mRendererCoreCache = new RendererCoreCache(new Handler(Looper.getMainLooper()));
            }
            RendererCoreCache.RendererCoreInfo rendererCoreInfo = this.mRendererCoreCache.get(((String) this.mRendererCore.getCacheKey()) + i2, this.mRendererCore.getRoot().getContext().mContext, this.mRendererCore.getCacheTime(), this.mRendererCore.getLoader(), mOnCreateRootCallback);
            return (rendererCoreInfo == null || rendererCoreInfo.f29482r == null) ? new FancyDrawable(this.mRendererCore) : new FancyDrawable(rendererCoreInfo.f29482r);
        }
    }

    public FancyDrawable(RendererCore rendererCore) {
        init(rendererCore);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doPause() {
        synchronized (this.mPauseLock) {
            if (this.mPaused) {
                return;
            }
            logd("doPause: ");
            this.mPaused = true;
            this.mRendererCore.pauseRenderable(this);
        }
    }

    private void doResume() {
        synchronized (this.mPauseLock) {
            if (this.mPaused) {
                logd("doResume: ");
                this.mPaused = false;
                this.mRendererCore.resumeRenderable(this);
            }
        }
    }

    private void init(RendererCore rendererCore) {
        rendererCore.getClass();
        this.mState = new FancyDrawableState(rendererCore);
        this.mRendererCore = rendererCore;
        rendererCore.addRenderable(this);
        setIntrinsicSize((int) this.mRendererCore.getRoot().getWidth(), (int) this.mRendererCore.getRoot().getHeight());
        ScreenContext context = this.mRendererCore.getRoot().getContext();
        Drawable drawable = context.mResourceManager.getDrawable(context.mContext.getResources(), QUIET_IMAGE_NAME);
        this.mQuietDrawable = drawable;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.mQuietDrawable = drawableMutate;
            drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), this.mQuietDrawable.getIntrinsicHeight());
        }
        Drawable drawable2 = context.mResourceManager.getDrawable(context.mContext.getResources(), START_IMAGE_NAME);
        this.mStartDrawable = drawable2;
        if (drawable2 != null) {
            Drawable drawableMutate2 = drawable2.mutate();
            this.mStartDrawable = drawableMutate2;
            drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), this.mStartDrawable.getIntrinsicHeight());
        }
    }

    private void logd(CharSequence charSequence) {
        MamlLog.m17850d(LOG_TAG, ((Object) charSequence) + "  [" + toString() + "]");
    }

    @Override // com.miui.maml.MamlDrawable
    public void cleanUp() {
        logd("cleanUp: ");
        this.mRendererCore.removeRenderable(this);
    }

    @Override // com.miui.maml.RendererController.IRenderable
    public void doRender() {
        this.mHandler.removeCallbacks(this.mRenderTimeout);
        this.mHandler.postDelayed(this.mRenderTimeout, 100L);
        this.mHandler.post(this.mInvalidateSelf);
    }

    @Override // com.miui.maml.MamlDrawable
    protected void drawIcon(Canvas canvas) {
        Drawable drawable;
        this.mHandler.removeCallbacks(this.mRenderTimeout);
        if (this.mTimeOut) {
            doResume();
            this.mTimeOut = false;
        }
        try {
            int iSave = canvas.save();
            canvas.translate(getBounds().left, getBounds().top);
            canvas.scale(this.mWidth / this.mIntrinsicWidth, this.mHeight / this.mIntrinsicHeight, 0.0f, 0.0f);
            if (Utils.getVariableNumber(USE_QUIET_IMAGE_TAG, this.mRendererCore.getRoot().getVariables()) <= 0.0d || (drawable = this.mQuietDrawable) == null) {
                this.mRendererCore.render(canvas);
            } else {
                drawable.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.miui.maml.MamlDrawable
    protected void finalize() throws Throwable {
        cleanUp();
        super.finalize();
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mIntrinsicHeight;
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mIntrinsicWidth;
    }

    public Drawable getQuietDrawable() {
        return this.mQuietDrawable;
    }

    public ScreenElementRoot getRoot() {
        return this.mRendererCore.getRoot();
    }

    public Drawable getStartDrawable() {
        return this.mStartDrawable;
    }

    public void onPause() {
        getRoot().onCommand("pause");
        doPause();
        this.mHandler.removeCallbacks(this.mRenderTimeout);
    }

    public void onResume() {
        getRoot().onCommand("resume");
        doResume();
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.mQuietDrawable;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
        Drawable drawable2 = this.mStartDrawable;
        if (drawable2 != null) {
            drawable2.setAlpha(i2);
        }
    }

    @Override // com.miui.maml.MamlDrawable
    public void setBadgeInfo(Drawable drawable, Rect rect) {
        if (rect == null || (rect.left >= 0 && rect.top >= 0 && rect.width() <= this.mIntrinsicWidth && rect.height() <= this.mIntrinsicHeight)) {
            this.mBadgeDrawable = drawable;
            this.mBadgeLocation = rect;
            MamlDrawable.MamlDrawableState mamlDrawableState = this.mState;
            mamlDrawableState.mStateBadgeDrawable = drawable;
            mamlDrawableState.mStateBadgeLocation = rect;
            return;
        }
        throw new IllegalArgumentException("Badge location " + rect + " not in badged drawable bounds " + new Rect(0, 0, this.mIntrinsicWidth, this.mIntrinsicHeight));
    }

    @Override // com.miui.maml.MamlDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        MamlLog.m17850d(LOG_TAG, "setColorFilter");
        Drawable drawable = this.mQuietDrawable;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.mStartDrawable;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
        Drawable drawable3 = this.mBadgeDrawable;
        if (drawable3 != null) {
            drawable3.setColorFilter(colorFilter);
        }
        RendererCore rendererCore = this.mRendererCore;
        if (rendererCore != null) {
            rendererCore.setColorFilter(colorFilter);
        }
    }
}
