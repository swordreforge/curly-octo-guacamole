package com.android.thememanager.lockscreen.lock.wallpaper;

import android.content.Context;
import android.content.res.Resources;
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
import com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2129p;
import com.android.thememanager.lockscreen.lock.wallpaper.n7h;
import java.util.HashSet;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WallpaperSurfaceView.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nWallpaperSurfaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WallpaperSurfaceView.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/WallpaperSurfaceView\n+ 2 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n26#2:114\n1#3:115\n*S KotlinDebug\n*F\n+ 1 WallpaperSurfaceView.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/WallpaperSurfaceView\n*L\n90#1:114\n*E\n"})
public final class WallpaperSurfaceView extends GLSurfaceView implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC2129p, n7h {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private InterfaceC2132s f12479g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private qrj f12480k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private com.miui.miwallpaper.opengl.n7h f12481n;

    /* JADX INFO: renamed from: q */
    private boolean f12482q;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final HashSet<t8r> f12483y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public WallpaperSurfaceView(@InterfaceC7396q Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ WallpaperSurfaceView(Context context, AttributeSet attributeSet, int i2, ni7 ni7Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cdj(WallpaperSurfaceView this$0, int i2) {
        Matrix matrixT8r;
        d2ok.m23075h(this$0, "this$0");
        com.miui.miwallpaper.opengl.n7h n7hVar = this$0.f12481n;
        if (n7hVar != null) {
            n7hVar.m18028s(i2);
        }
        qrj qrjVar = this$0.f12480k;
        if (qrjVar == null || (matrixT8r = qrjVar.t8r()) == null) {
            return;
        }
        InterfaceC2129p.k.m8141k(this$0, matrixT8r, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final void m8120h(WallpaperSurfaceView this$0, WallpaperTypeInfo wallpaperTypeInfo) {
        d2ok.m23075h(this$0, "this$0");
        com.miui.miwallpaper.opengl.n7h n7hVar = this$0.f12481n;
        if (n7hVar != null) {
            n7hVar.m18029y(wallpaperTypeInfo != null ? wallpaperTypeInfo.getBitmap() : null, new boolean[0]);
        }
        this$0.requestRender();
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public View mo8091g() {
        return this;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public InterfaceC2132s getGestureEndCallback() {
        return this.f12479g;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public qrj getGestureManager() {
        return this.f12480k;
    }

    @InterfaceC7395n
    public final com.miui.miwallpaper.opengl.n7h getGlassRender() {
        return this.f12481n;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public Bitmap getOriginBitmap() {
        com.miui.miwallpaper.opengl.n7h n7hVar = this.f12481n;
        if (n7hVar != null) {
            return n7hVar.toq();
        }
        return null;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean getScaleable() {
        return this.f12482q;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7396q
    public HashSet<t8r> getWallpaperChangedListenerSet() {
        return this.f12483y;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public Matrix getWallpaperMatrix() {
        return n7h.toq.m8140q(this);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    /* JADX INFO: renamed from: k */
    public void mo8092k(@InterfaceC7395n final WallpaperTypeInfo wallpaperTypeInfo) {
        setImageAndPosition(wallpaperTypeInfo != null ? wallpaperTypeInfo.getBitmap() : null, null);
        setScaleable(true);
        qrj qrjVar = this.f12480k;
        if (qrjVar != null) {
            qrjVar.lvui();
        }
        queueEvent(new Runnable() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.fn3e
            @Override // java.lang.Runnable
            public final void run() {
                WallpaperSurfaceView.m8120h(this.f12489k, wallpaperTypeInfo);
            }
        });
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void kja0(@InterfaceC7395n t8r t8rVar) {
        n7h.toq.m8138k(this, t8rVar);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    @InterfaceC7395n
    public WallpaperPositionInfo n7h(@InterfaceC7395n Bitmap bitmap) {
        return n7h.toq.toq(this, bitmap);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        qrj qrjVar = this.f12480k;
        if (qrjVar != null) {
            qrjVar.lvui();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@InterfaceC7396q MotionEvent event) {
        d2ok.m23075h(event, "event");
        if (!getScaleable()) {
            return false;
        }
        qrj qrjVar = this.f12480k;
        if (qrjVar == null) {
            return getScaleable();
        }
        d2ok.qrj(qrjVar);
        boolean zOnTouchEvent = qrjVar.cdj().onTouchEvent(event);
        qrj qrjVar2 = this.f12480k;
        d2ok.qrj(qrjVar2);
        boolean zOnTouchEvent2 = qrjVar2.ld6().onTouchEvent(event);
        boolean z2 = event.getAction() == 1;
        if (!zOnTouchEvent2 && z2) {
            qrj qrjVar3 = this.f12480k;
            d2ok.qrj(qrjVar3);
            qrjVar3.m8152t();
        }
        return zOnTouchEvent || zOnTouchEvent2;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void qrj(final int i2) {
        n7h.toq.m8137g(this, i2);
        queueEvent(new Runnable() { // from class: com.android.thememanager.lockscreen.lock.wallpaper.i
            @Override // java.lang.Runnable
            public final void run() {
                WallpaperSurfaceView.cdj(this.f12497k, i2);
            }
        });
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setGestureEndCallback(@InterfaceC7395n InterfaceC2132s interfaceC2132s) {
        this.f12479g = interfaceC2132s;
    }

    public final void setGlassRender(@InterfaceC7395n com.miui.miwallpaper.opengl.n7h n7hVar) {
        this.f12481n = n7hVar;
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setImageAndPosition(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        if (bitmap != null) {
            Resources resources = getResources();
            d2ok.kja0(resources, "getResources(...)");
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmap);
            this.f12480k = null;
            Context context = getContext();
            d2ok.kja0(context, "getContext(...)");
            this.f12480k = new cdj(context, this, this, bitmapDrawable, wallpaperPositionInfo);
        }
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setOriginBitmap(@InterfaceC7395n Bitmap bitmap) {
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public void setScaleable(boolean z2) {
        this.f12482q = z2;
        qrj qrjVar = this.f12480k;
        if (qrjVar == null) {
            return;
        }
        qrjVar.d2ok(z2);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.n7h
    public boolean x2() {
        return n7h.toq.m8139n(this);
    }

    @Override // com.android.thememanager.lockscreen.lock.wallpaper.InterfaceC2129p
    /* JADX INFO: renamed from: y */
    public void mo8119y(@InterfaceC7396q Matrix matrix, @InterfaceC7395n Boolean bool) {
        d2ok.m23075h(matrix, "matrix");
        com.miui.miwallpaper.opengl.n7h n7hVar = this.f12481n;
        if (n7hVar != null) {
            if (d2ok.f7l8(bool, Boolean.TRUE)) {
                matrix.getValues(new float[9]);
                com.miui.miwallpaper.zy.m18078g(matrix, n7hVar);
            } else {
                com.miui.miwallpaper.zy.f7l8(matrix, this, n7hVar);
            }
            requestRender();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperSurfaceView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
        d2ok.m23075h(context, "context");
        this.f12482q = true;
        this.f12483y = new HashSet<>();
    }
}
