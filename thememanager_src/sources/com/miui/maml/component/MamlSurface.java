package com.miui.maml.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.os.Build;
import android.service.wallpaper.WallpaperService;
import android.view.MotionEvent;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import com.miui.maml.RendererController;
import com.miui.maml.ResourceLoader;
import com.miui.maml.ResourceManager;
import com.miui.maml.ScreenContext;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Variables;
import com.miui.maml.util.AssetsResourceLoader;
import com.miui.maml.util.FolderResourceLoader;
import com.miui.maml.util.HideSdkDependencyUtils;
import com.miui.maml.util.MamlLog;
import com.miui.maml.util.ZipResourceLoader;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class MamlSurface implements RendererController.IRenderable {
    public static final int MODE_ASSETS_FOLDER = 2;
    public static final int MODE_FOLDER = 3;
    public static final int MODE_ZIP = 1;
    private static final String TAG = "MamlSurface";
    private final ScreenElementRoot.OnExternCommandListener mCommandListener;
    private WallpaperService.Engine mEngine;
    private WeakReference<OnExternCommandListener> mExternCommandListener;
    private volatile boolean mFinished;
    private boolean mIsSuperWallpaper;
    private ScreenElementRoot mRoot;
    private SurfaceHolder mSurfaceHolder;

    public interface OnExternCommandListener {
        void onCommand(String str, Double d2, String str2);
    }

    public MamlSurface(Context context, String str, int i2, WallpaperService.Engine engine) {
        this(context, str, null, i2, engine, false);
    }

    private void finish() {
        if (this.mFinished) {
            return;
        }
        this.mFinished = true;
        this.mEngine = null;
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.selfFinish();
            this.mRoot.detachFromVsync();
            this.mRoot.getVariables().reset();
            ResourceManager resourceManager = this.mRoot.getContext().mResourceManager;
            ResourceManager.clear();
            this.mRoot = null;
        }
    }

    private ResourceLoader getResourceLoader(Context context, String str, String str2, int i2) {
        if (i2 == 1) {
            return new ZipResourceLoader(str, str2);
        }
        if (i2 == 2) {
            return new AssetsResourceLoader(context, str);
        }
        if (i2 != 3) {
            return null;
        }
        return new FolderResourceLoader(str);
    }

    private void load(Context context, ResourceLoader resourceLoader, WallpaperService.Engine engine, boolean z2) {
        SurfaceHolder surfaceHolder;
        this.mSurfaceHolder = engine.getSurfaceHolder();
        this.mEngine = engine;
        this.mIsSuperWallpaper = z2;
        if (resourceLoader != null) {
            ScreenElementRoot screenElementRoot = new ScreenElementRoot(new ScreenContext(context.getApplicationContext(), new ResourceManager(resourceLoader)));
            screenElementRoot.setMamlSurface(this);
            if (screenElementRoot.load()) {
                this.mRoot = screenElementRoot;
                screenElementRoot.setMamlSurfaceOnExternCommandListener(this.mCommandListener);
                this.mRoot.setRenderControllerRenderable(this);
                this.mRoot.attachToVsync();
                this.mRoot.selfInit();
                if (!this.mRoot.isTransparentSurface() || (surfaceHolder = this.mSurfaceHolder) == null) {
                    return;
                }
                surfaceHolder.setFormat(-2);
            }
        }
    }

    @Override // com.miui.maml.RendererController.IRenderable
    public void doRender() {
        Canvas canvasLockHardwareCanvas;
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot == null || this.mSurfaceHolder == null) {
            return;
        }
        try {
        } catch (Exception e2) {
            MamlLog.m17852e(TAG, "unlockCanvasAndPost exception.", e2);
        }
        try {
            try {
                canvasLockHardwareCanvas = screenElementRoot.isUseHardwareCanvas() ? this.mSurfaceHolder.lockHardwareCanvas() : this.mSurfaceHolder.lockCanvas();
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        this.mSurfaceHolder.unlockCanvasAndPost(null);
                    } catch (Exception e3) {
                        MamlLog.m17852e(TAG, "unlockCanvasAndPost exception.", e3);
                    }
                }
                throw th;
            }
        } catch (Exception e4) {
            MamlLog.m17852e(TAG, "render exception.", e4);
            if (0 != 0) {
                this.mSurfaceHolder.unlockCanvasAndPost(null);
            }
            this.mRoot.doneRender();
            return;
        } catch (OutOfMemoryError e6) {
            MamlLog.m17852e(TAG, "render oom error.", e6);
            if (0 != 0) {
                this.mSurfaceHolder.unlockCanvasAndPost(null);
            }
            this.mRoot.doneRender();
            return;
        }
        if (canvasLockHardwareCanvas != null) {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.mRoot.render(canvasLockHardwareCanvas);
            this.mSurfaceHolder.unlockCanvasAndPost(canvasLockHardwareCanvas);
            this.mRoot.doneRender();
            return;
        }
        MamlLog.m17850d(TAG, ":( fail to lock canvas.");
        if (canvasLockHardwareCanvas != null) {
            try {
                this.mSurfaceHolder.unlockCanvasAndPost(canvasLockHardwareCanvas);
            } catch (Exception e7) {
                MamlLog.m17852e(TAG, "unlockCanvasAndPost exception.", e7);
            }
        }
    }

    public void doneRender() {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.doneRender();
        }
    }

    protected void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    public SurfaceControl getParentSurfaceControl() {
        WallpaperService.Engine engine;
        if (Build.VERSION.SDK_INT != 29 || (engine = this.mEngine) == null) {
            return null;
        }
        return HideSdkDependencyUtils.SurfaceControl_getInstance_with_engine(engine);
    }

    public ScreenElementRoot getRoot() {
        return this.mRoot;
    }

    public SurfaceHolder getSurfaceHolder() {
        return this.mSurfaceHolder;
    }

    public Variables getVariables() {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            return screenElementRoot.getVariables();
        }
        return null;
    }

    public boolean isIsSuperWallpaper() {
        return this.mIsSuperWallpaper;
    }

    public boolean isLoaded() {
        return this.mRoot != null;
    }

    public void onDestroy() {
        MamlLog.m17850d(TAG, "onDestroy");
        finish();
    }

    public void onPause() {
        MamlLog.m17850d(TAG, "onPause");
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.selfPause();
        }
    }

    public void onResume() {
        MamlLog.m17850d(TAG, "onResume");
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.selfResume();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            return screenElementRoot.onTouch(motionEvent);
        }
        return false;
    }

    public void requestUpdate() {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.requestUpdate();
        }
    }

    public void sendCommand(String str) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.onCommand(str);
        }
    }

    public void setAutoDarkenWallpaper(boolean z2) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.setAutoDarkenWallpaper(true);
        }
    }

    public void setConfig(String str) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.setConfig(str);
        }
    }

    public void setOnExternCommandListener(OnExternCommandListener onExternCommandListener) {
        this.mExternCommandListener = onExternCommandListener == null ? null : new WeakReference<>(onExternCommandListener);
    }

    public void setSaveConfigOnlyInPause(boolean z2) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.setSaveConfigViaProvider(z2);
        }
    }

    public void setSaveConfigViaProvider(boolean z2) {
        ScreenElementRoot screenElementRoot = this.mRoot;
        if (screenElementRoot != null) {
            screenElementRoot.setSaveConfigViaProvider(z2);
        }
    }

    public MamlSurface(Context context, String str, int i2, WallpaperService.Engine engine, boolean z2) {
        this(context, str, null, i2, engine, z2);
    }

    public MamlSurface(Context context, String str, String str2, int i2, WallpaperService.Engine engine, boolean z2) {
        this.mCommandListener = new ScreenElementRoot.OnExternCommandListener() { // from class: com.miui.maml.component.MamlSurface.1
            @Override // com.miui.maml.ScreenElementRoot.OnExternCommandListener
            public void onCommand(String str3, Double d2, String str4) {
                OnExternCommandListener onExternCommandListener;
                if (MamlSurface.this.mExternCommandListener == null || (onExternCommandListener = (OnExternCommandListener) MamlSurface.this.mExternCommandListener.get()) == null) {
                    return;
                }
                onExternCommandListener.onCommand(str3, d2, str4);
            }
        };
        load(context, getResourceLoader(context, str, str2, i2), engine, z2);
    }

    public MamlSurface(Context context, ResourceLoader resourceLoader, WallpaperService.Engine engine) {
        this.mCommandListener = new ScreenElementRoot.OnExternCommandListener() { // from class: com.miui.maml.component.MamlSurface.1
            @Override // com.miui.maml.ScreenElementRoot.OnExternCommandListener
            public void onCommand(String str3, Double d2, String str4) {
                OnExternCommandListener onExternCommandListener;
                if (MamlSurface.this.mExternCommandListener == null || (onExternCommandListener = (OnExternCommandListener) MamlSurface.this.mExternCommandListener.get()) == null) {
                    return;
                }
                onExternCommandListener.onCommand(str3, d2, str4);
            }
        };
        load(context, resourceLoader, engine, false);
    }
}
