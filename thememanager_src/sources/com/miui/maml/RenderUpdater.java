package com.miui.maml;

import android.os.Handler;
import android.os.SystemClock;
import com.miui.maml.RendererController;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class RenderUpdater implements RendererController.ISelfUpdateRenderable {
    private boolean mAutoCleanup;
    private long mCreateTime;
    private long mDelay;
    private Handler mHandler;
    protected long mLastUpdateTime;
    protected long mNextUpdateInterval;
    private boolean mPaused;
    protected boolean mPendingRender;
    private ScreenElementRoot mRoot;
    private Runnable mRunUpdater;
    private boolean mSignaled;
    private boolean mStarted;
    private Runnable mUpdater;

    public RenderUpdater(ScreenElementRoot screenElementRoot, Handler handler) {
        this(screenElementRoot, handler, false);
    }

    private long checkDelay() {
        if (this.mDelay <= 0) {
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.mCreateTime;
        long j2 = this.mDelay;
        if (jElapsedRealtime < j2) {
            return j2 - jElapsedRealtime;
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doRunUpdater() {
        if (this.mSignaled) {
            return;
        }
        this.mSignaled = true;
        this.mHandler.removeCallbacks(this.mUpdater);
        this.mHandler.post(this.mUpdater);
    }

    public void cleanUp() {
        this.mHandler.removeCallbacks(this.mUpdater);
        this.mPaused = true;
        this.mRoot.selfFinish();
        this.mSignaled = false;
    }

    @Override // com.miui.maml.RendererController.IRenderable
    public final void doRender() {
        this.mPendingRender = true;
        doRenderImp();
    }

    protected abstract void doRenderImp();

    public void doneRender() {
        this.mPendingRender = false;
        if (this.mPaused || this.mSignaled) {
            return;
        }
        long j2 = this.mNextUpdateInterval;
        if (j2 < Long.MAX_VALUE) {
            this.mHandler.postDelayed(this.mUpdater, j2 - (SystemClock.elapsedRealtime() - this.mLastUpdateTime));
        }
    }

    protected void finalize() throws Throwable {
        if (this.mAutoCleanup) {
            cleanUp();
        }
        super.finalize();
    }

    @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
    public void forceUpdate() {
        runUpdater();
    }

    public void init() {
        this.mPaused = false;
        this.mRoot.setRenderControllerRenderable(this);
        this.mRoot.selfInit();
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onPause() {
        this.mRoot.selfPause();
        this.mSignaled = false;
        this.mPaused = true;
    }

    public void onResume() {
        this.mPaused = false;
        this.mRoot.selfResume();
        runUpdater();
    }

    public void runUpdater() {
        long jCheckDelay = this.mStarted ? 0L : checkDelay();
        if (jCheckDelay <= 0) {
            doRunUpdater();
            this.mStarted = true;
        } else {
            if (this.mHandler.hasCallbacks(this.mRunUpdater)) {
                return;
            }
            this.mHandler.postDelayed(this.mRunUpdater, jCheckDelay);
        }
    }

    public void setAutoCleanup(boolean z2) {
        this.mAutoCleanup = z2;
    }

    public void setStartDelay(long j2, long j3) {
        this.mCreateTime = j2;
        this.mDelay = j3;
        if (j3 <= 0) {
            this.mStarted = true;
        }
    }

    @Override // com.miui.maml.RendererController.ISelfUpdateRenderable
    public void triggerUpdate() {
        runUpdater();
    }

    public RenderUpdater(ScreenElementRoot screenElementRoot, Handler handler, boolean z2) {
        this.mUpdater = new Runnable() { // from class: com.miui.maml.RenderUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                RenderUpdater.this.mSignaled = false;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                RenderUpdater renderUpdater = RenderUpdater.this;
                renderUpdater.mNextUpdateInterval = renderUpdater.mRoot.updateIfNeeded(jElapsedRealtime);
                RenderUpdater renderUpdater2 = RenderUpdater.this;
                renderUpdater2.mLastUpdateTime = jElapsedRealtime;
                if (renderUpdater2.mPendingRender || renderUpdater2.mPaused || RenderUpdater.this.mSignaled) {
                    return;
                }
                RenderUpdater renderUpdater3 = RenderUpdater.this;
                if (renderUpdater3.mNextUpdateInterval < Long.MAX_VALUE) {
                    renderUpdater3.mHandler.postDelayed(RenderUpdater.this.mUpdater, RenderUpdater.this.mNextUpdateInterval);
                }
            }
        };
        this.mRunUpdater = new Runnable() { // from class: com.miui.maml.RenderUpdater.2
            @Override // java.lang.Runnable
            public void run() {
                RenderUpdater.this.doRunUpdater();
                RenderUpdater.this.mStarted = true;
            }
        };
        this.mRoot = screenElementRoot;
        this.mHandler = handler;
        this.mAutoCleanup = z2;
    }
}
