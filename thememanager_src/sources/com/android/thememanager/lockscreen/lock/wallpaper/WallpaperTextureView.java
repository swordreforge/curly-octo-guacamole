package com.android.thememanager.lockscreen.lock.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.WallpaperTypeInfo;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperTextureView extends GLTextureView implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC2129p {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f60377ab;
    private Bitmap bb;
    private com.miui.miwallpaper.opengl.n7h bp;

    /* JADX INFO: renamed from: w */
    private qrj f12484w;

    public WallpaperTextureView(Context context) {
        super(context);
        this.f12484w = null;
        this.f60377ab = true;
        this.bb = null;
        this.bp = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fti(Bitmap bitmap) {
        this.bp.m18029y(bitmap, new boolean[0]);
        jk();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, com.android.thememanager.lockscreen.lock.wallpaper.n7h
    /* JADX INFO: renamed from: g */
    public View mo8091g() {
        return this;
    }

    public com.miui.miwallpaper.opengl.n7h getGlassRender() {
        return this.bp;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @dd
    public Bitmap getOriginBitmap() {
        return this.bb;
    }

    public void jp0y(final Bitmap bitmap) {
        mcp(new Runnable() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.zurt
            @Override // java.lang.Runnable
            public final void run() {
                this.f12535k.fti(bitmap);
            }
        });
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, com.android.thememanager.lockscreen.lock.wallpaper.n7h
    /* JADX INFO: renamed from: k */
    public void mo8092k(@dd WallpaperTypeInfo wallpaperTypeInfo) {
        super.mo8092k(wallpaperTypeInfo);
        setImageAndPosition(wallpaperTypeInfo.getBitmap(), null);
        this.f60377ab = true;
        this.f12484w.lvui();
        this.bp.m18029y(wallpaperTypeInfo.getBitmap(), new boolean[0]);
        jk();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        qrj qrjVar = this.f12484w;
        if (qrjVar != null) {
            qrjVar.lvui();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        boolean z2 = this.f60377ab;
        if (!z2) {
            return false;
        }
        qrj qrjVar = this.f12484w;
        if (qrjVar == null) {
            return z2;
        }
        qrjVar.cdj().onTouchEvent(event);
        boolean zOnTouchEvent = this.f12484w.ld6().onTouchEvent(event);
        boolean z3 = event.getAction() == 1;
        if (!zOnTouchEvent && z3) {
            this.f12484w.m8152t();
        }
        return false;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void qrj(int magicType) {
        super.qrj(magicType);
        if (this.bp == null || this.f12484w.t8r() == null) {
            return;
        }
        this.bp.m18028s(magicType);
        mo8119y(this.f12484w.t8r(), Boolean.FALSE);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView, com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setImageAndPosition(@dd Bitmap bm, @dd WallpaperPositionInfo lastPositionInfo) {
        super.setImageAndPosition(bm, lastPositionInfo);
        if (bm == null || bm.isRecycled()) {
            return;
        }
        this.f12484w = new cdj(getContext(), this, this, new BitmapDrawable(getContext().getResources(), bm), lastPositionInfo);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.GLTextureView
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        super.setRenderer(renderer);
        if (renderer instanceof com.miui.miwallpaper.opengl.n7h) {
            this.bp = (com.miui.miwallpaper.opengl.n7h) renderer;
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2129p
    /* JADX INFO: renamed from: y */
    public void mo8119y(@lvui Matrix matrix, @dd Boolean isFirst) {
        if (this.bp != null) {
            if (isFirst == null || !isFirst.booleanValue()) {
                com.miui.miwallpaper.zy.m18082y(matrix, this, this.bp);
            } else {
                matrix.getValues(new float[9]);
                com.miui.miwallpaper.zy.m18078g(matrix, this.bp);
            }
            jk();
        }
    }

    public WallpaperTextureView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f12484w = null;
        this.f60377ab = true;
        this.bb = null;
        this.bp = null;
    }
}
