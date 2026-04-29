package com.android.thememanager.lockscreen.lock.wallpaper;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.WallpaperPositionInfo;
import com.android.thememanager.lockscreen.lock.WallpaperTypeInfo;
import com.miui.miwallpaper.opengl.n7h;
import java.util.HashSet;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: IWallpaperLayer.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface n7h {

    @InterfaceC7396q
    public static final C2128k fs9 = C2128k.f12513k;

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.wallpaper.n7h$k */
    /* JADX INFO: compiled from: IWallpaperLayer.kt */
    @lv5({"SMAP\nIWallpaperLayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IWallpaperLayer.kt\ncom/android/thememanager/lockscreen/lock/wallpaper/IWallpaperLayer$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"})
    public static final class C2128k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ C2128k f12513k = new C2128k();

        private C2128k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: g */
        public final CombinedWallpaperView m8133g(@InterfaceC7396q Context context, @InterfaceC7396q TemplateConfig templateConfig, boolean z2) {
            d2ok.m23075h(context, "context");
            d2ok.m23075h(templateConfig, "templateConfig");
            CombinedWallpaperView combinedWallpaperView = new CombinedWallpaperView(context, null, 2, 0 == true ? 1 : 0);
            combinedWallpaperView.ki(templateConfig, z2);
            return combinedWallpaperView;
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final GLTextureView m8134k(@InterfaceC7396q Context context, @InterfaceC7396q TemplateConfig templateConfig, @InterfaceC7395n n7h.InterfaceC5295k interfaceC5295k) {
            d2ok.m23075h(context, "context");
            d2ok.m23075h(templateConfig, "templateConfig");
            f7l8 f7l8Var = new f7l8();
            C2123g c2123g = new C2123g(8, 8, 8, 8, 16, 0);
            GLTextureView gLTextureView = new GLTextureView(context);
            gLTextureView.setEGLContextFactory(f7l8Var);
            gLTextureView.setEGLConfigChooser(c2123g);
            Bitmap currentWallpaper = templateConfig.getCurrentWallpaper();
            WallpaperInfo wallpaperInfo = templateConfig.getWallpaperInfo();
            com.miui.miwallpaper.opengl.n7h n7hVar = new com.miui.miwallpaper.opengl.n7h(context, currentWallpaper, wallpaperInfo != null ? wallpaperInfo.getMagicType() : 0);
            if (interfaceC5295k != null) {
                n7hVar.m18023g(interfaceC5295k);
            }
            gLTextureView.f12430r = n7hVar;
            gLTextureView.setRenderer(n7hVar);
            WallpaperInfo wallpaperInfo2 = templateConfig.getWallpaperInfo();
            n7hVar.m18026p(wallpaperInfo2 != null ? wallpaperInfo2.getEnableBlur() : false);
            gLTextureView.setRenderMode(0);
            return gLTextureView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: n */
        public final WallpaperSurfaceView m8135n(@InterfaceC7396q Context context, @InterfaceC7395n Bitmap bitmap, int i2, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
            d2ok.m23075h(context, "context");
            com.miui.miwallpaper.opengl.n7h n7hVar = new com.miui.miwallpaper.opengl.n7h(context, bitmap, i2);
            WallpaperSurfaceView wallpaperSurfaceView = new WallpaperSurfaceView(context, null, 2, 0 == true ? 1 : 0);
            wallpaperSurfaceView.setGlassRender(n7hVar);
            wallpaperSurfaceView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            wallpaperSurfaceView.setImageAndPosition(bitmap, wallpaperPositionInfo);
            com.miui.miwallpaper.zy.toq(wallpaperSurfaceView, n7hVar);
            return wallpaperSurfaceView;
        }

        @InterfaceC7395n
        @l05.qrj
        /* JADX INFO: renamed from: q */
        public final View m8136q(@InterfaceC7396q Context context, @InterfaceC7396q TemplateConfig templateConfig, boolean z2, @InterfaceC7396q n7h.InterfaceC5295k listener) {
            WallpaperInfo wallpaperInfo;
            d2ok.m23075h(context, "context");
            d2ok.m23075h(templateConfig, "templateConfig");
            d2ok.m23075h(listener, "listener");
            WallpaperInfo wallpaperInfo2 = templateConfig.getWallpaperInfo();
            int magicType = wallpaperInfo2 != null ? wallpaperInfo2.getMagicType() : 0;
            WallpaperPositionInfo positionInfo = null;
            if (z2 && (wallpaperInfo = templateConfig.getWallpaperInfo()) != null) {
                positionInfo = wallpaperInfo.getPositionInfo();
            }
            Bitmap currentWallpaper = templateConfig.getCurrentWallpaper();
            WallpaperInfo wallpaperInfo3 = templateConfig.getWallpaperInfo();
            boolean enableBlur = wallpaperInfo3 != null ? wallpaperInfo3.getEnableBlur() : false;
            if (!z2 && kja0.f12503k.m8125g(magicType, enableBlur)) {
                Log.d(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "createMyLockShaderWallpaper");
                return m8134k(context, templateConfig, listener);
            }
            if (kja0.f12503k.m8127n(magicType)) {
                Log.d(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "createWallpaperSurfaceView");
                return m8135n(context, currentWallpaper, magicType, positionInfo);
            }
            Log.d(com.android.thememanager.lockscreen.lock.base.zy.f12351k, "createWallpaperImageView");
            Bitmap darkenBitmap = templateConfig.getDarkenBitmap();
            if (darkenBitmap != null) {
                currentWallpaper = darkenBitmap;
            }
            return zy(context, currentWallpaper, positionInfo);
        }

        @InterfaceC7396q
        @l05.qrj
        public final WallpaperTextureView toq(@InterfaceC7396q Context context, @InterfaceC7395n Bitmap bitmap, int i2, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo, boolean z2) {
            d2ok.m23075h(context, "context");
            f7l8 f7l8Var = new f7l8();
            C2123g c2123g = new C2123g(8, 8, 8, 8, 16, 0);
            WallpaperTextureView wallpaperTextureView = new WallpaperTextureView(context);
            wallpaperTextureView.setEGLContextFactory(f7l8Var);
            wallpaperTextureView.setEGLConfigChooser(c2123g);
            com.miui.miwallpaper.opengl.n7h n7hVar = new com.miui.miwallpaper.opengl.n7h(context, bitmap, i2);
            wallpaperTextureView.setRenderer(n7hVar);
            if (z2) {
                n7hVar.m18026p(true);
            }
            wallpaperTextureView.setRenderMode(0);
            wallpaperTextureView.setImageAndPosition(bitmap, wallpaperPositionInfo);
            return wallpaperTextureView;
        }

        @InterfaceC7396q
        @l05.qrj
        public final WallpaperImageView zy(@InterfaceC7396q Context context, @InterfaceC7395n Bitmap bitmap, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
            d2ok.m23075h(context, "context");
            WallpaperImageView wallpaperImageView = new WallpaperImageView(context, null, 0, 6, null);
            wallpaperImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            wallpaperImageView.setImageAndPosition(bitmap, wallpaperPositionInfo);
            return wallpaperImageView;
        }
    }

    /* JADX INFO: compiled from: IWallpaperLayer.kt */
    public static final class toq {
        /* JADX INFO: renamed from: g */
        public static void m8137g(@InterfaceC7396q n7h n7hVar, int i2) {
        }

        /* JADX INFO: renamed from: k */
        public static void m8138k(@InterfaceC7396q n7h n7hVar, @InterfaceC7395n t8r t8rVar) {
            if (t8rVar == null) {
                return;
            }
            n7hVar.getWallpaperChangedListenerSet().add(t8rVar);
        }

        /* JADX INFO: renamed from: n */
        public static boolean m8139n(@InterfaceC7396q n7h n7hVar) {
            qrj gestureManager = n7hVar.getGestureManager();
            if (gestureManager != null) {
                return gestureManager.wvg();
            }
            return false;
        }

        @InterfaceC7395n
        /* JADX INFO: renamed from: q */
        public static Matrix m8140q(@InterfaceC7396q n7h n7hVar) {
            qrj gestureManager = n7hVar.getGestureManager();
            if (gestureManager != null) {
                return gestureManager.t8r();
            }
            return null;
        }

        @InterfaceC7395n
        public static WallpaperPositionInfo toq(@InterfaceC7396q n7h n7hVar, @InterfaceC7395n Bitmap bitmap) {
            qrj gestureManager = n7hVar.getGestureManager();
            if (gestureManager != null) {
                return gestureManager.fn3e(bitmap);
            }
            return null;
        }

        public static /* synthetic */ WallpaperPositionInfo zy(n7h n7hVar, Bitmap bitmap, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPosition");
            }
            if ((i2 & 1) != 0) {
                bitmap = n7hVar.getOriginBitmap();
            }
            return n7hVar.n7h(bitmap);
        }
    }

    @InterfaceC7396q
    @l05.qrj
    static WallpaperTextureView f7l8(@InterfaceC7396q Context context, @InterfaceC7395n Bitmap bitmap, int i2, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo, boolean z2) {
        return fs9.toq(context, bitmap, i2, wallpaperPositionInfo, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    static GLTextureView ld6(@InterfaceC7396q Context context, @InterfaceC7396q TemplateConfig templateConfig, @InterfaceC7395n n7h.InterfaceC5295k interfaceC5295k) {
        return fs9.m8134k(context, templateConfig, interfaceC5295k);
    }

    @InterfaceC7395n
    @l05.qrj
    /* JADX INFO: renamed from: n */
    static View m8130n(@InterfaceC7396q Context context, @InterfaceC7396q TemplateConfig templateConfig, boolean z2, @InterfaceC7396q n7h.InterfaceC5295k interfaceC5295k) {
        return fs9.m8136q(context, templateConfig, z2, interfaceC5295k);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: p */
    static WallpaperImageView m8131p(@InterfaceC7396q Context context, @InterfaceC7395n Bitmap bitmap, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        return fs9.zy(context, bitmap, wallpaperPositionInfo);
    }

    @InterfaceC7396q
    @l05.qrj
    /* JADX INFO: renamed from: s */
    static CombinedWallpaperView m8132s(@InterfaceC7396q Context context, @InterfaceC7396q TemplateConfig templateConfig, boolean z2) {
        return fs9.m8133g(context, templateConfig, z2);
    }

    @InterfaceC7396q
    @l05.qrj
    static WallpaperSurfaceView toq(@InterfaceC7396q Context context, @InterfaceC7395n Bitmap bitmap, int i2, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo) {
        return fs9.m8135n(context, bitmap, i2, wallpaperPositionInfo);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    View mo8091g();

    @InterfaceC7395n
    InterfaceC2132s getGestureEndCallback();

    @InterfaceC7395n
    qrj getGestureManager();

    @InterfaceC7395n
    Bitmap getOriginBitmap();

    boolean getScaleable();

    @InterfaceC7396q
    HashSet<t8r> getWallpaperChangedListenerSet();

    @InterfaceC7395n
    Matrix getWallpaperMatrix();

    /* JADX INFO: renamed from: k */
    void mo8092k(@InterfaceC7395n WallpaperTypeInfo wallpaperTypeInfo);

    void kja0(@InterfaceC7395n t8r t8rVar);

    @InterfaceC7395n
    WallpaperPositionInfo n7h(@InterfaceC7395n Bitmap bitmap);

    void qrj(int i2);

    void setGestureEndCallback(@InterfaceC7395n InterfaceC2132s interfaceC2132s);

    void setImageAndPosition(@InterfaceC7395n Bitmap bitmap, @InterfaceC7395n WallpaperPositionInfo wallpaperPositionInfo);

    void setOriginBitmap(@InterfaceC7395n Bitmap bitmap);

    void setScaleable(boolean z2);

    boolean x2();
}
